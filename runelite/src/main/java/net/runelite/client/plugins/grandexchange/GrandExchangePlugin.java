/*
 * Copyright (c) 2019, Adam <Adam@sigterm.info>
 * Copyright (c) 2017, Robbie <https://github.com/rbbi>
 * Copyright (c) 2018, SomeoneWithAnInternetConnection
 * Copyright (c) 2020, Dennis <me@dennis.dev>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.runelite.client.plugins.grandexchange;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Shorts;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.inject.Provides;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.api.widgets.Widget;
import net.runelite.client.Notifier;
import net.runelite.client.account.AccountSession;
import net.runelite.client.account.SessionManager;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.SessionClose;
import net.runelite.client.events.SessionOpen;
import net.runelite.client.game.ItemManager;
import net.runelite.client.input.KeyManager;
import net.runelite.client.input.MouseManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.*;
import net.runelite.http.api.ge.GrandExchangeTrade;
import net.runelite.http.api.item.ItemStats;
import net.runelite.http.api.worlds.WorldType;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.text.similarity.FuzzyScore;

import javax.inject.Inject;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Type;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@PluginDescriptor(
	name = "Grand Exchange",
	description = "Provide additional and/or easier access to Grand Exchange information",
	tags = {"external", "integration", "notifications", "panel", "prices", "trade"}
)
@Slf4j
public class GrandExchangePlugin extends Plugin
{
	@VisibleForTesting
	static final int GE_SLOTS = 8;
	private static final int GE_LOGIN_BURST_WINDOW = 2; // ticks
	private static final int GE_MAX_EXAMINE_LEN = 100;

	private static final String BUY_LIMIT_GE_TEXT = "Buy limit: ";
	private static final String BUY_LIMIT_KEY = "buylimit";
	private static final Duration BUY_LIMIT_RESET = Duration.ofHours(4);

	static final String SEARCH_GRAND_EXCHANGE = "Search Grand Exchange";

	private static final int MAX_RESULT_COUNT = 250;

	private static final FuzzyScore FUZZY = new FuzzyScore(Locale.ENGLISH);
	private static final Color FUZZY_HIGHLIGHT_COLOR = new Color(0x800000);

	private static final int MAX_TRADE_HISTORY = 1024;
	private static final int MAX_TRADE_DAYS = 365;

	private NavigationButton button;

	@Setter(AccessLevel.PACKAGE)
	private GrandExchangePanel panel;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private boolean hotKeyPressed;

	@Inject
	private GrandExchangeInputListener inputListener;

	@Inject
	private ItemManager itemManager;

	@Inject
	private MouseManager mouseManager;

	@Inject
	private KeyManager keyManager;

	@Inject
	private Client client;

	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private GrandExchangeConfig config;

	@Inject
	private Notifier notifier;

	@Inject
	private SessionManager sessionManager;

	@Inject
	private ConfigManager configManager;

	@Inject
	private Gson gson;

	@Inject
	private RuneLiteConfig runeLiteConfig;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ScheduledExecutorService scheduledExecutorService;

	private int lastLoginTick;

	private boolean wasFuzzySearch;

	private String machineUuid;
	private long lastAccount;
	private int tradeSeq;

	/**
	 * Logic from {@link FuzzyScore}
	 */
	@VisibleForTesting
	static List<Integer> findFuzzyIndices(String term, String query)
	{
		List<Integer> indices = new ArrayList<>();

		// fuzzy logic is case insensitive. We normalize the Strings to lower
		// case right from the start. Turning characters to lower case
		// via Character.toLowerCase(char) is unfortunately insufficient
		// as it does not accept a locale.
		final String termLowerCase = term.toLowerCase();
		final String queryLowerCase = query.toLowerCase();

		// the position in the term which will be scanned next for potential
		// query character matches
		int termIndex = 0;

		for (int queryIndex = 0; queryIndex < queryLowerCase.length(); queryIndex++)
		{
			final char queryChar = queryLowerCase.charAt(queryIndex);

			boolean termCharacterMatchFound = false;
			for (; termIndex < termLowerCase.length()
					&& !termCharacterMatchFound; termIndex++)
			{
				final char termChar = termLowerCase.charAt(termIndex);

				if (queryChar == termChar)
				{
					indices.add(termIndex);

					// we can leave the nested loop. Every character in the
					// query can match at most one character in the term.
					termCharacterMatchFound = true;
				}
			}
		}

		return indices;
	}

	private SavedOffer getOffer(int slot)
	{
		String offer = configManager.getRSProfileConfiguration("geoffer", Integer.toString(slot));
		if (offer == null)
		{
			return null;
		}
		return gson.fromJson(offer, SavedOffer.class);
	}

	private void setOffer(int slot, SavedOffer offer)
	{
		configManager.setRSProfileConfiguration("geoffer", Integer.toString(slot), gson.toJson(offer));
	}

	private void deleteOffer(int slot)
	{
		configManager.unsetRSProfileConfiguration("geoffer", Integer.toString(slot));
	}

	private synchronized void saveTrade(Trade trade)
	{
		List<Trade> trades = new ArrayList<>();
		String history = configManager.getRSProfileConfiguration(GrandExchangeConfig.CONFIG_GROUP, "tradeHistory");
		//CHECKSTYLE:OFF
		final Type type = new TypeToken<List<Trade>>() {}.getType();
		//CHECKSTYLE:ON
		if (history != null)
		{
			try
			{
				List<Trade> t = gson.fromJson(history, type);
				if (t != null)
				{
					trades = t;
				}
			}
			catch (JsonSyntaxException ex)
			{
				log.warn("error updating saved trades", ex);
			}
		}

		Instant ago = Instant.now().minus(MAX_TRADE_DAYS, ChronoUnit.DAYS);
		while (!trades.isEmpty() && (trades.size() >= MAX_TRADE_HISTORY || trades.get(0).time.isBefore(ago)))
		{
			trades.remove(0);
		}

		trades.add(trade);
		configManager.setRSProfileConfiguration(GrandExchangeConfig.CONFIG_GROUP, "tradeHistory", gson.toJson(trades, type));
	}

	@Provides
	GrandExchangeConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GrandExchangeConfig.class);
	}

	@Override
	protected void startUp()
	{
		panel = injector.getInstance(GrandExchangePanel.class);

		final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "ge_icon.png");

		button = NavigationButton.builder()
			.tooltip("Grand Exchange")
			.icon(icon)
			.priority(3)
			.panel(panel)
			.build();

		clientToolbar.addNavigation(button);

		if (config.quickLookup())
		{
			mouseManager.registerMouseListener(inputListener);
			keyManager.registerKeyListener(inputListener);
		}

		lastLoginTick = -1;

		if (client.getGameState() == GameState.LOGGED_IN)
		{
			final GrandExchangeOffer[] offers = client.getGrandExchangeOffers();
			for (int i = 0; i < offers.length; i++)
			{
				final int slot = i;
				clientThread.invokeLater(() -> updatePanel(slot, offers[slot]));

				updateConfig(i, offers[i]);
			}
		}
	}

	@Override
	protected void shutDown()
	{
		clientToolbar.removeNavigation(button);
		mouseManager.unregisterMouseListener(inputListener);
		keyManager.unregisterKeyListener(inputListener);
		machineUuid = null;
		lastAccount = -1L;
		tradeSeq = 0;
	}

	void search(final String itemName)
	{
		SwingUtilities.invokeLater(() ->
		{
			panel.showSearch();
			clientToolbar.openPanel(button);
			panel.getSearchPanel().priceLookup(itemName);
		});
	}



	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals(GrandExchangeConfig.CONFIG_GROUP))
		{
			if (event.getKey().equals("quickLookup"))
			{
				if (config.quickLookup())
				{
					mouseManager.registerMouseListener(inputListener);
					keyManager.registerKeyListener(inputListener);
				}
				else
				{
					mouseManager.unregisterMouseListener(inputListener);
					keyManager.unregisterKeyListener(inputListener);
				}
			}
		}
	}

	@Subscribe
	public void onGrandExchangeOfferChanged(GrandExchangeOfferChanged offerEvent)
	{
		final int slot = offerEvent.getSlot();
		final GrandExchangeOffer offer = offerEvent.getOffer();

		if (offer.getState() == GrandExchangeOfferState.EMPTY && client.getGameState() != GameState.LOGGED_IN)
		{
			// Trades are cleared by the client during LOGIN_SCREEN/HOPPING/LOGGING_IN, ignore those so we don't
			// clear the offer config.
			return;
		}

		log.debug("GE offer updated: state: {}, slot: {}, item: {}, qty: {}, lastLoginTick: {}",
			offer.getState(), slot, offer.getItemId(), offer.getQuantitySold(), lastLoginTick);

		updatePanel(slot, offer);

		updateLimitTimer(offer);

		submitTrade(slot, offer);

		updateConfig(slot, offer);
	}

	@VisibleForTesting
	void submitTrade(int slot, GrandExchangeOffer offer)
	{
		GrandExchangeOfferState state = offer.getState();

		if (state != GrandExchangeOfferState.CANCELLED_BUY && state != GrandExchangeOfferState.CANCELLED_SELL && state != GrandExchangeOfferState.BUYING && state != GrandExchangeOfferState.SELLING)
		{
			return;
		}

		SavedOffer savedOffer = getOffer(slot);
		boolean login = client.getTickCount() <= lastLoginTick + GE_LOGIN_BURST_WINDOW;
		if (savedOffer == null && (state == GrandExchangeOfferState.BUYING || state == GrandExchangeOfferState.SELLING) && offer.getQuantitySold() == 0)
		{
			// new offer
			GrandExchangeTrade grandExchangeTrade = new GrandExchangeTrade();
			grandExchangeTrade.setBuy(state == GrandExchangeOfferState.BUYING);
			grandExchangeTrade.setItemId(offer.getItemId());
			grandExchangeTrade.setTotal(offer.getTotalQuantity());
			grandExchangeTrade.setOffer(offer.getPrice());
			grandExchangeTrade.setSlot(slot);
			grandExchangeTrade.setWorldType(getGeWorldType());
			grandExchangeTrade.setLogin(login);
			grandExchangeTrade.setSeq(tradeSeq++);
			grandExchangeTrade.setResetTime(getLimitResetTime(offer.getItemId()));

			log.debug("Submitting new trade: {}", grandExchangeTrade);
			return;
		}

		if (savedOffer == null || savedOffer.getItemId() != offer.getItemId() || savedOffer.getPrice() != offer.getPrice() || savedOffer.getTotalQuantity() != offer.getTotalQuantity())
		{
			// desync
			return;
		}

		if (savedOffer.getState() == offer.getState() && savedOffer.getQuantitySold() == offer.getQuantitySold())
		{
			// no change
			return;
		}

		if (state == GrandExchangeOfferState.CANCELLED_BUY || state == GrandExchangeOfferState.CANCELLED_SELL)
		{
			GrandExchangeTrade grandExchangeTrade = new GrandExchangeTrade();
			grandExchangeTrade.setBuy(state == GrandExchangeOfferState.CANCELLED_BUY);
			grandExchangeTrade.setCancel(true);
			grandExchangeTrade.setItemId(offer.getItemId());
			grandExchangeTrade.setQty(offer.getQuantitySold());
			grandExchangeTrade.setTotal(offer.getTotalQuantity());
			grandExchangeTrade.setOffer(offer.getPrice());
			grandExchangeTrade.setSlot(slot);
			grandExchangeTrade.setWorldType(getGeWorldType());
			grandExchangeTrade.setLogin(login);
			grandExchangeTrade.setSeq(tradeSeq++);
			grandExchangeTrade.setResetTime(getLimitResetTime(offer.getItemId()));

			log.debug("Submitting cancelled: {}", grandExchangeTrade);
			saveTrade(grandExchangeTrade);
			return;
		}

		final int qty = offer.getQuantitySold() - savedOffer.getQuantitySold();
		if (qty <= 0)
		{
			return;
		}

		GrandExchangeTrade grandExchangeTrade = new GrandExchangeTrade();
		grandExchangeTrade.setBuy(state == GrandExchangeOfferState.BUYING);
		grandExchangeTrade.setItemId(offer.getItemId());
		grandExchangeTrade.setQty(offer.getQuantitySold());
		grandExchangeTrade.setDqty(qty);
		grandExchangeTrade.setTotal(offer.getTotalQuantity());
		grandExchangeTrade.setOffer(offer.getPrice());
		grandExchangeTrade.setSlot(slot);
		grandExchangeTrade.setWorldType(getGeWorldType());
		grandExchangeTrade.setLogin(login);
		grandExchangeTrade.setSeq(tradeSeq++);
		grandExchangeTrade.setResetTime(getLimitResetTime(offer.getItemId()));
		saveTrade(grandExchangeTrade);
	}

	private void saveTrade(GrandExchangeTrade trade)
	{
		// Completed trades are either fully completed (qty == total) or partially complete
		// (qty > 0) and cancelled.
		if (trade.getQty() > 0 && (trade.isCancel() || trade.getQty() == trade.getTotal()))
		{
			Trade t = new Trade();
			t.setBuy(trade.isBuy());
			t.setItemId(trade.getItemId());
			t.setQuantity(trade.getQty());
			t.setPrice(trade.getSpent() / trade.getQty());
			t.setTime(Instant.now());

			log.debug("Saving trade: {}", t);
			scheduledExecutorService.execute(() -> saveTrade(t));
		}
	}

	private WorldType getGeWorldType()
	{
		EnumSet<net.runelite.api.WorldType> worldTypes = client.getWorldType();
		if (worldTypes.contains(net.runelite.api.WorldType.SEASONAL))
		{
			return WorldType.SEASONAL;
		}
		else if (worldTypes.contains(net.runelite.api.WorldType.TOURNAMENT_WORLD))
		{
			return WorldType.TOURNAMENT;
		}
		else if (worldTypes.contains(net.runelite.api.WorldType.DEADMAN))
		{
			return WorldType.DEADMAN;
		}
		else
		{
			return WorldType.MEMBERS;
		}
	}

	private void updatePanel(int slot, GrandExchangeOffer offer)
	{
		ItemComposition offerItem = itemManager.getItemComposition(offer.getItemId());
		boolean shouldStack = offerItem.isStackable() || offer.getTotalQuantity() > 1;
		BufferedImage itemImage = itemManager.getImage(offer.getItemId(), offer.getTotalQuantity(), shouldStack);
		SwingUtilities.invokeLater(() -> panel.getOffersPanel().updateOffer(offerItem, itemImage, offer, slot));
	}

	private void updateConfig(int slot, GrandExchangeOffer offer)
	{
		if (offer.getState() == GrandExchangeOfferState.EMPTY)
		{
			deleteOffer(slot);
		}
		else
		{
			SavedOffer savedOffer = new SavedOffer();
			savedOffer.setItemId(offer.getItemId());
			savedOffer.setQuantitySold(offer.getQuantitySold());
			savedOffer.setTotalQuantity(offer.getTotalQuantity());
			savedOffer.setPrice(offer.getPrice());
			savedOffer.setState(offer.getState());
			setOffer(slot, savedOffer);
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		if (event.getType() != ChatMessageType.GAMEMESSAGE)
		{
			return;
		}

		String message = Text.removeTags(event.getMessage());

		if (message.startsWith("Grand Exchange:") && config.enableNotifications())
		{
			notifier.notify(message);
		}
		else if (message.startsWith("Grand Exchange: Finished") && config.notifyOnOfferComplete())
		{
			notifier.notify(message);
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		switch (gameStateChanged.getGameState())
		{
			case LOGIN_SCREEN:
				panel.getOffersPanel().resetOffers();
				break;
			case LOGGING_IN:
			case HOPPING:
			case CONNECTION_LOST:
				lastLoginTick = client.getTickCount();
				break;
		}
	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		// At the moment, if the user disables quick lookup, the input listener gets disabled. Thus, isHotKeyPressed()
		// should always return false when quick lookup is disabled.
		// Replace the default option with "Search ..." when holding alt
		if (client.getGameState() != GameState.LOGGED_IN || !hotKeyPressed)
		{
			return;
		}

		final MenuEntry[] entries = client.getMenuEntries();
		final MenuEntry menuEntry = entries[entries.length - 1];
		final int widgetId = menuEntry.getParam1();
	}

	@Subscribe
	public void onFocusChanged(FocusChanged focusChanged)
	{
		if (!focusChanged.isFocused())
		{
			setHotKeyPressed(false);
		}
	}

	private void setGeTitle()
	{
		if (!config.showTotal())
		{
			return;
		}

		long total = 0;
		GrandExchangeOffer[] offers = client.getGrandExchangeOffers();
		for (GrandExchangeOffer offer : offers)
		{
			if (offer != null)
			{
				total += offer.getPrice() * offer.getTotalQuantity();
			}
		}

		if (total == 0L)
		{
			return;
		}

		StringBuilder titleBuilder = new StringBuilder(" (");

		if (config.showExact())
		{
			titleBuilder.append(QuantityFormatter.formatNumber(total));
		}
		else
		{
			titleBuilder.append(QuantityFormatter.quantityToStackSize(total));
		}

		titleBuilder.append(')');

		// Append to title
		String[] stringStack = client.getStringStack();
		int stringStackSize = client.getStringStackSize();

		stringStack[stringStackSize - 1] += titleBuilder.toString();
	}

	private void setLimitResetTime(int itemId)
	{
		Instant lastDateTime = configManager.getRSProfileConfiguration(GrandExchangeConfig.CONFIG_GROUP,
			BUY_LIMIT_KEY + "." + itemId, Instant.class);
		if (lastDateTime == null || lastDateTime.isBefore(Instant.now()))
		{
			configManager.setRSProfileConfiguration(GrandExchangeConfig.CONFIG_GROUP, BUY_LIMIT_KEY + "." + itemId,
				Instant.now().plus(BUY_LIMIT_RESET));
		}
	}

	private Instant getLimitResetTime(int itemId)
	{
		Instant lastDateTime = configManager.getRSProfileConfiguration(GrandExchangeConfig.CONFIG_GROUP,
			BUY_LIMIT_KEY + "." + itemId, Instant.class);
		if (lastDateTime == null)
		{
			return null;
		}

		if (lastDateTime.isBefore(Instant.now()))
		{
			configManager.unsetRSProfileConfiguration(GrandExchangeConfig.CONFIG_GROUP, BUY_LIMIT_KEY + "." + itemId);
			return null;
		}

		return lastDateTime;
	}

	private void updateLimitTimer(GrandExchangeOffer offer)
	{
		if (offer.getState() == GrandExchangeOfferState.BOUGHT ||
			(offer.getQuantitySold() > 0 &&
				offer.getState() == GrandExchangeOfferState.BUYING))
		{
			setLimitResetTime(offer.getItemId());
		}
	}

	private static String shortenExamine(String examine)
	{
		int from = 0;
		int idx;
		while (true)
		{
			idx = examine.indexOf(' ', from);
			if (idx == -1)
			{
				return examine;
			}
			if (idx > GE_MAX_EXAMINE_LEN && from > 0)
			{
				break; // use from
			}
			from = idx + 1;
		}

		return examine.substring(0, from - 1) + "...";
	}

	void openGeLink(String name, int itemId)
	{
		final String url = runeLiteConfig.useWikiItemPrices() ?
			"https://prices.runescape.wiki/osrs" + "/item/" + itemId :
			"https://services.runescape.com/m=itemdb_oldschool/"
				+ name.replaceAll(" ", "+")
				+ "/viewitem?obj="
				+ itemId;
		LinkBrowser.browse(url);
	}

	private String getMachineUuid()
	{
		long accountHash = client.getAccountHash();
		if (lastAccount == accountHash)
		{
			return machineUuid;
		}

		lastAccount = accountHash;

		try
		{
			Hasher hasher = Hashing.sha256().newHasher();
			Runtime runtime = Runtime.getRuntime();

			hasher.putByte((byte) OSType.getOSType().ordinal());
			hasher.putByte((byte) runtime.availableProcessors());
			hasher.putUnencodedChars(System.getProperty("os.arch", ""));
			hasher.putUnencodedChars(System.getProperty("os.version", ""));
			hasher.putUnencodedChars(System.getProperty("user.name", ""));

			Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
			while (networkInterfaces.hasMoreElements())
			{
				NetworkInterface networkInterface = networkInterfaces.nextElement();
				byte[] hardwareAddress = networkInterface.getHardwareAddress();
				if (hardwareAddress != null)
				{
					hasher.putBytes(hardwareAddress);
				}
			}
			hasher.putLong(accountHash);
			machineUuid = hasher.hash().toString();
			tradeSeq = 0;
			return machineUuid;
		}
		catch (SocketException ex)
		{
			log.debug("unable to generate machine id", ex);
			machineUuid = null;
			tradeSeq = 0;
			return null;
		}
	}
}
