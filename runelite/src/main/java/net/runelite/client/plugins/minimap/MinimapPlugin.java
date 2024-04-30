/*
 * Copyright (c) 2018, Dreyri <https://github.com/Dreyri>
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
package net.runelite.client.plugins.minimap;

import com.google.inject.Provides;
import java.awt.Color;
import java.awt.event.MouseWheelEvent;
import java.util.Arrays;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.ScriptID;
import net.runelite.api.SpritePixels;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ScriptPostFired;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.input.MouseManager;
import net.runelite.client.input.MouseWheelListener;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(
	name = "Minimap",
	description = "Customize the color of minimap dots, hide the minimap, and zoom",
	tags = {"items", "npcs", "players", "zoom"}
)
public class MinimapPlugin extends Plugin implements MouseWheelListener
{
	private static final int DOT_ITEM = 0;
	private static final int DOT_NPC = 1;
	private static final int DOT_PLAYER = 2;
	private static final int DOT_FRIEND = 3;
	private static final int DOT_TEAM = 4;
	private static final int DOT_FRIENDSCHAT = 5;
	private static final int DOT_CLAN = 5;//should be 6

	@Inject
	private Client client;

	@Inject
	private MouseManager mouseManager;

	@Inject
	private MinimapConfig config;

	private SpritePixels[] originalDotSprites;

	@Provides
	private MinimapConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(MinimapConfig.class);
	}

	@Override
	protected void startUp()
	{
		mouseManager.registerMouseWheelListener(this);
		storeOriginalDots();
		replaceMapDots();
		client.setMinimapZoom(config.zoom());

		if (config.hdMinimap()) {
			client.setHdMinimapEnabled(true);
			if(client.getGameState() == GameState.LOGGED_IN)
				client.setGameState(GameState.LOADING);
		}

	}

	@Override
	protected void shutDown()
	{
		restoreOriginalDots();
		client.setMinimapZoom(false);
		client.setHdMinimapEnabled(false);
		client.setGameState(GameState.LOADING);
		mouseManager.unregisterMouseWheelListener(this);
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (event.getGameState() == GameState.LOGIN_SCREEN && originalDotSprites == null)
		{
			storeOriginalDots();
			replaceMapDots();
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals(MinimapConfig.GROUP))
		{
			return;
		}

		else if (event.getKey().equals("zoom"))
		{
			client.setMinimapZoom(config.zoom());
			return;
		}
		else if (event.getKey().equals("hdminimap"))
		{
			client.setHdMinimapEnabled(config.hdMinimap());
			client.setGameState(GameState.LOADING);
			return;
		}
		replaceMapDots();
	}

	private void replaceMapDots()
	{
		SpritePixels[] mapDots = client.getMapDots();

		if (mapDots == null)
		{
			return;
		}

		applyDot(mapDots, DOT_ITEM, config.itemColor());
		applyDot(mapDots, DOT_NPC, config.npcColor());
		applyDot(mapDots, DOT_PLAYER, config.playerColor());
		applyDot(mapDots, DOT_FRIEND, config.friendColor());
		applyDot(mapDots, DOT_TEAM, config.teamColor());
		applyDot(mapDots, DOT_CLAN, config.clanChatColor());
	}

	private void applyDot(SpritePixels[] mapDots, int id, Color color)
	{
		if (id < mapDots.length && color != null)
		{
			mapDots[id] = MinimapDot.create(client, color);
		}
	}

	private void storeOriginalDots()
	{
		SpritePixels[] originalDots = client.getMapDots();

		if (originalDots == null)
		{
			return;
		}

		originalDotSprites = Arrays.copyOf(originalDots, originalDots.length);
	}

	private void restoreOriginalDots()
	{
		SpritePixels[] mapDots = client.getMapDots();

		if (originalDotSprites == null || mapDots == null)
		{
			return;
		}

		System.arraycopy(originalDotSprites, 0, mapDots, 0, mapDots.length);
	}

	@Override
	public MouseWheelEvent mouseWheelMoved(MouseWheelEvent event) {
		if (client.getGameState() == GameState.LOGGED_IN) {

			int mouseX = client.getMouseCanvasPosition().getX();
			int mouseY = client.getMouseCanvasPosition().getY();

			if (inMap(mouseX, mouseY ,client.isResized(), (int) client.getCanvasWidth()) && client.isMinimapZoom()) {
				int zoom = (int) client.getMinimapZoom();
				zoom += event.getWheelRotation() * 35;
				client.setMinimapZoom(zoom);

				if(zoom > 210) {
					client.setMinimapZoom(210);
				}
				if(zoom < -70) {
					client.setMinimapZoom(-70);
				}
			}

		}
		return event;
	}

	public Boolean inMap(int mouseX, int mouseY, boolean resized, int width)  {
		int i = mouseX - 25 - 547;
		int j = mouseY - 5 - 3;
		if (resized) {
			i = mouseX - (width - 182 + 24);
			j = mouseY - 8;
		}


		return inCircle(0, 0, i, j, 76);
	}

	public boolean inCircle(int circleX, int circleY, int clickX, int clickY, int radius) {
		return Math.pow((circleX + radius - clickX), 2)
				+ Math.pow((circleY + radius - clickY), 2) < Math
				.pow(radius, 2);
	}


}