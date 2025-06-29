package com.client.graphics.interfaces;

import com.client.*;
import com.client.definitions.ItemDefinition;
import com.client.definitions.NpcDefinition;
import com.client.definitions.SeqFrame;
import com.client.definitions.SpriteCache;
import com.client.graphics.interfaces.impl.*;
import com.client.graphics.interfaces.impl.health_hud.HealthHud;
import com.client.graphics.interfaces.impl.notification.NotificationInterface;
import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.runelite.api.FontTypeFace;
import net.runelite.api.SpritePixels;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.rs.api.RSFillMode;
import net.runelite.rs.api.RSSpritePixels;
import net.runelite.rs.api.RSWidget;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static com.client.Client.cacheSprite2;
import static com.client.Client.cacheSprite3;
import static com.client.Configuration.CLIENT_TITLE;
import static com.client.Configuration.developerMode;
import static com.client.PetSystem.petSelected;
import static java.lang.Integer.parseInt;
import static net.runelite.api.SpriteID.*;

public class RSInterface implements RSWidget {

	public static final int DEFAULT_TEXT_COLOR = 0xff9933;
	public static final int GREEN_COLOR = 0x37B514;
	public static final int YELLOW_COLOR = 0xFFFF00;
	public static final int WHITE_COLOR = 0xFFFFFF;
	public static final int RED_COLOR = 0xE11010;
	private static final int ITEM_SLOT_SIZE = 32;

	public String gifLocation;
	public WheelOfFortune wheel;
	public static int emptyInterface = 24_470;
	public static boolean showIds = false;
	public static RSFont[] newFonts;
	public BiConsumer<RSInterface, String> textChangeListener;
	public AlignPolicy alignmentPolicy;
	public int modelOffsetX;
	public int textXAlignment;
	public int textYAlignment;
	public int textLineHeight;

	public boolean disableButtonActions = false;

	public int getChildIndex() {
		if(id != parentID) {
			RSInterface parent = interfaceCache.get(parentID);
			if (parent == null || parent.children == null)
				return -1;
			for (int i = 0; i < parent.children.length; i++) {
				if (parent.children[i] == id)
					return i;
			}
		}
		return -1;
	}

	public static void changeInterfaceImage(int interfaceId, int imageId) {
		RSInterface originalInterface = interfaceCache.get(interfaceId);
		if (originalInterface instanceof InterfaceImage) {
			InterfaceImage interfaceImage = (InterfaceImage) originalInterface;
			interfaceImage.currentSpriteId = imageId;
			return;
		}
		if (originalInterface != null)
			if (imageId == 0) {
				originalInterface.sprite1 = originalInterface.originalInterfaceSprites[0];
				originalInterface.sprite2 = originalInterface.originalInterfaceSprites[1];
			} else {
				originalInterface.sprite1 = originalInterface.extraInterfaceSprites[imageId];
				originalInterface.sprite2 = originalInterface.extraInterfaceSprites[imageId];
			}
	}

	public void method6666(int i, int i1) {
	}

	public void method6659(String s, int i) {
	}

	public enum AlignPolicy {
		CENTER, LEFT, RIGHT;
	}
	public static void printEmptyInterfaceSections() {
		int highestKey = Integer.MIN_VALUE; // Initialize to the smallest possible integer value
		for (int key : interfaceCache.keySet()) {
			if (key > highestKey) {
				highestKey = key;
			}
		}
		int count = 0;
		int start = 0;
		for (int index = 0; index < highestKey; index++) {
			if (interfaceCache.get(index) == null) {
				if (start == 0) {
					start = index;
				}
				count++;
			} else {
				if (count >= 50) {
					/**
					 * To disable toggle {@link Configuration#PRINT_EMPTY_INTERFACE_SECTIONS}
					 */
					System.out.println(String.format("Found empty interface range starting at [%d] length [%d]", start, count));
				}
				start = 0;
				count = 0;
			}
		}
		System.out.println("Last interface ID = " + highestKey);
	}
	public static void addTransparentLayer(int id, int layerColor, int layerTransparency) {
		RSInterface transparentLayer = addInterface(id);
		transparentLayer.layerColor = layerColor;
		transparentLayer.layerTransparency = layerTransparency;
		transparentLayer.type = 130;
		transparentLayer.interfaceHidden = true;
	}

	public int layerColor = -1;
	public int layerTransparency = -1;

	public int widgetPet = -1;
	public static void addPet(int ID, int petid) {
		interfaceCache.put(ID, new RSInterface());
		RSInterface petCanvas = interfaceCache.get(ID);
		petCanvas.id = ID;
		petCanvas.parentID = ID;
		petCanvas.type = 6;
		petCanvas.atActionType = 0;
		petCanvas.contentType = 32921;
		petCanvas.width = 136;
		petCanvas.height = 168;
		petCanvas.opacity = 0;
		petCanvas.hoverType = 0;
		petCanvas.modelZoom = (petid == 1013 ? 500 : 800);
		petCanvas.modelRotation1 = 150;
		petCanvas.modelRotation2 = 0;
		petSelected = petid;
		/*petCanvas.disabledAnimationId = -1;
		petCanvas.enabledAnimationId = -1;*/
	}

	public static void addModel(int interfaceId, int width, int height, int itemId, int zoom, int contentType) {
		RSInterface rsi = addInterface(interfaceId);
		rsi.type = 6;
		rsi.atActionType = 4;
		ItemDefinition def = ItemDefinition.lookup(itemId);
		rsi.mediaID = itemId;
		rsi.modelZoom = zoom;
		rsi.modelRotation1 = def.yan2d;
		rsi.modelRotation2 = def.xan2d;
		rsi.width = width;
		rsi.height = height;
		rsi.contentType = contentType;
	}

	public static void unpack(FileArchive streamLoader, TextDrawingArea textDrawingAreas[],
							  FileArchive streamLoader_1, RSFont[] newFontSystem) {
		aMRUNodes_238 = new EvictingDualNodeHashTable(750);
		Buffer stream = new Buffer(streamLoader.readFile("data"));
		newFonts = newFontSystem;
		int i = -1;
		int j = stream.readUShort();
		while (stream.pos < stream.payload.length) {
			int k = stream.readUShort();
			if (k == 65535) {
				i = stream.readUShort();
				k = stream.readUShort();
			}
			interfaceCache.put(k, new RSInterface());
			RSInterface rsInterface = interfaceCache.get(k);
			rsInterface.id = k;
			rsInterface.parentID = i;
			rsInterface.type = stream.readUnsignedByte();
			rsInterface.atActionType = stream.readUnsignedByte();
			rsInterface.contentType = stream.readUShort();
			rsInterface.width = stream.readUShort();
			rsInterface.height = stream.readUShort();
			rsInterface.opacity = (byte) stream.readUnsignedByte();
			rsInterface.mOverInterToTrigger = stream.readUnsignedByte();
			if (rsInterface.mOverInterToTrigger != 0)
				rsInterface.mOverInterToTrigger = (rsInterface.mOverInterToTrigger - 1 << 8)
						+ stream.readUnsignedByte();
			else
				rsInterface.mOverInterToTrigger = -1;
			int i1 = stream.readUnsignedByte();
			if (i1 > 0) {
				rsInterface.anIntArray245 = new int[i1];
				rsInterface.anIntArray212 = new int[i1];
				for (int j1 = 0; j1 < i1; j1++) {
					rsInterface.anIntArray245[j1] = stream.readUnsignedByte();
					rsInterface.anIntArray212[j1] = stream.readUShort();
				}

			}
			int k1 = stream.readUnsignedByte();
			if (k1 > 0) {
				rsInterface.scripts = new int[k1][];
				for (int l1 = 0; l1 < k1; l1++) {
					int i3 = stream.readUShort();
					rsInterface.scripts[l1] = new int[i3];
					for (int l4 = 0; l4 < i3; l4++)
						rsInterface.scripts[l1][l4] = stream.readUShort();

				}

			}
			if (rsInterface.type == 0) {
				rsInterface.drawsTransparent = false;
				rsInterface.scrollMax = stream.readUShort();
				rsInterface.isMouseoverTriggered = stream.readUnsignedByte() == 1;
				int i2 = stream.readUShort();
				rsInterface.children = new int[i2];
				rsInterface.childX = new int[i2];
				rsInterface.childY = new int[i2];
				for (int j3 = 0; j3 < i2; j3++) {
					rsInterface.children[j3] = stream.readUShort();
					rsInterface.childX[j3] = stream.readSignedWord();
					rsInterface.childY[j3] = stream.readSignedWord();
					childEvents.add(new WidgetChildEvent(j3, rsInterface.childX[j3], rsInterface.childY[j3]));
				}
			}
			if (rsInterface.type == 1) {
				stream.readUShort();
				stream.readUnsignedByte();
			}
			if (rsInterface.type == 2) {
				rsInterface.inventoryItemId = new int[rsInterface.width * rsInterface.height];
				rsInterface.inventoryAmounts = new int[rsInterface.width * rsInterface.height];
				rsInterface.aBoolean259 = stream.readUnsignedByte() == 1;
				rsInterface.isInventoryInterface = stream.readUnsignedByte() == 1;
				rsInterface.usableItemInterface = stream.readUnsignedByte() == 1;
				rsInterface.aBoolean235 = stream.readUnsignedByte() == 1;
				rsInterface.invSpritePadX = stream.readUnsignedByte();
				rsInterface.invSpritePadY = stream.readUnsignedByte();
				rsInterface.spritesX = new int[20];
				rsInterface.spritesY = new int[20];
				rsInterface.sprites = new Sprite[20];
				for (int j2 = 0; j2 < 20; j2++) {
					int k3 = stream.readUnsignedByte();
					if (k3 == 1) {
						rsInterface.spritesX[j2] = stream.readSignedWord();
						rsInterface.spritesY[j2] = stream.readSignedWord();
						String s1 = stream.readString();
						if (streamLoader_1 != null && s1.length() > 0) {
							int i5 = s1.lastIndexOf(",");
							rsInterface.sprites[j2] = method207(parseInt(s1.substring(i5 + 1)), streamLoader_1,
									s1.substring(0, i5));
						}
					}
				}
				rsInterface.actions = new String[6];
				for (int l3 = 0; l3 < 5; l3++) {
					rsInterface.actions[l3] = stream.readString();
					if (rsInterface.actions[l3].length() == 0)
						rsInterface.actions[l3] = null;
					if (rsInterface.parentID == 3822)
						rsInterface.actions[4] = "Sell X";
					if (rsInterface.parentID == 3822)
						rsInterface.actions[4] = "Sell All";
					if (rsInterface.parentID == 3824)
						rsInterface.actions[4] = "Buy X";
					if (rsInterface.parentID == 1644)
						rsInterface.actions[2] = "Operate";
				}
			}
			if (rsInterface.type == 3)
				rsInterface.filled = stream.readUnsignedByte() == 1;
			if (rsInterface.type == 4 || rsInterface.type == 1) {
				rsInterface.centerText = stream.readUnsignedByte() == 1;
				int k2 = stream.readUnsignedByte();
				if (textDrawingAreas != null)
					rsInterface.textDrawingAreas = textDrawingAreas[k2];
				rsInterface.textShadow = stream.readUnsignedByte() == 1;
			}
			if (rsInterface.type == 4) {
				rsInterface.message = stream.readString().replaceAll("RuneScape", CLIENT_TITLE);

				if (showIds) {
					rsInterface.message = Integer.toString(rsInterface.id);
				}
				rsInterface.aString228 = stream.readString();
			}
			if (rsInterface.type == 1 || rsInterface.type == 3 || rsInterface.type == 4)
				rsInterface.textColor = stream.readDWord();
			if (rsInterface.type == 3 || rsInterface.type == 4) {
				rsInterface.secondaryColor = stream.readDWord();
				rsInterface.anInt216 = stream.readDWord();
				rsInterface.anInt239 = stream.readDWord();
			}
			if (rsInterface.type == 5) {
				rsInterface.drawsTransparent = false;
				String s = stream.readString();
				if (streamLoader_1 != null && s.length() > 0) {
					int i4 = s.lastIndexOf(",");
					rsInterface.sprite1 = method207(parseInt(s.substring(i4 + 1)), streamLoader_1,
							s.substring(0, i4));
//					System.out.println("Sprite1[" + rsInterface.id + "/" + rsInterface.type + "] - " + Integer.parseInt(s.substring(i4 + 1)) + " - " + s.substring(0, i4));
				}
				s = stream.readString();
				if (streamLoader_1 != null && !s.isEmpty()) {
					int j4 = s.lastIndexOf(",");
					rsInterface.sprite2 = method207(parseInt(s.substring(j4 + 1)), streamLoader_1,
							s.substring(0, j4));
//					System.out.println("Sprite2[" + rsInterface.id + "/" + rsInterface.type + "] - " + Integer.parseInt(s.substring(j4 + 1)) + " - " + s.substring(0, j4));
				}
			}
			if (rsInterface.type == 6) {
				int l = stream.readUnsignedByte();
				if (l != 0) {
					rsInterface.anInt233 = 1;
					rsInterface.mediaID = (l - 1 << 8) + stream.readUnsignedByte();
				}
				l = stream.readUnsignedByte();
				if (l != 0) {
					rsInterface.anInt255 = 1;
					rsInterface.anInt256 = (l - 1 << 8) + stream.readUnsignedByte();
				}
				l = stream.readUnsignedByte();
				if (l != 0)
					rsInterface.disabledAnimationId = (l - 1 << 8) + stream.readUnsignedByte();
				else
					rsInterface.disabledAnimationId = -1;
				l = stream.readUnsignedByte();
				if (l != 0)
					rsInterface.enabledAnimationId = (l - 1 << 8) + stream.readUnsignedByte();
				else
					rsInterface.enabledAnimationId = -1;
				rsInterface.modelZoom = stream.readUShort();
				rsInterface.modelRotation1 = stream.readUShort();
				rsInterface.modelRotation2 = stream.readUShort();
			}
			if (rsInterface.type == 7) {
				rsInterface.inventoryItemId = new int[rsInterface.width * rsInterface.height];
				rsInterface.inventoryAmounts = new int[rsInterface.width * rsInterface.height];
				rsInterface.centerText = stream.readUnsignedByte() == 1;
				int l2 = stream.readUnsignedByte();
				if (textDrawingAreas != null)
					rsInterface.textDrawingAreas = textDrawingAreas[l2];
				rsInterface.textShadow = stream.readUnsignedByte() == 1;
				rsInterface.textColor = stream.readDWord();
				rsInterface.invSpritePadX = stream.readSignedWord();
				rsInterface.invSpritePadY = stream.readSignedWord();
				rsInterface.isInventoryInterface = stream.readUnsignedByte() == 1;
				rsInterface.actions = new String[6];
				for (int k4 = 0; k4 < 5; k4++) {
					rsInterface.actions[k4] = stream.readString();
					if (rsInterface.actions[k4].length() == 0)
						rsInterface.actions[k4] = null;
				}

			}
			if (rsInterface.atActionType == 2 || rsInterface.type == 2) {
				rsInterface.selectedActionName = stream.readString();
				rsInterface.spellName = stream.readString();
				rsInterface.spellUsableOn = stream.readUShort();
			}

			if (rsInterface.type == 8)
				rsInterface.message = stream.readString();

			if (rsInterface.atActionType == 1 || rsInterface.atActionType == 4 || rsInterface.atActionType == 5
					|| rsInterface.atActionType == 6) {
				rsInterface.tooltip = stream.readString();
				if(rsInterface.tooltip.toLowerCase().contains("special attack")) {
					System.out.println("Found special attack [" + rsInterface.id + "]");
				}
				if (rsInterface.tooltip.length() == 0) {
					if (rsInterface.atActionType == 1)
						rsInterface.tooltip = "Ok";
					if (rsInterface.atActionType == 4)
						rsInterface.tooltip = "Select";
					if (rsInterface.atActionType == 5)
						rsInterface.tooltip = "Select";
					if (rsInterface.atActionType == 6)
						rsInterface.tooltip = "Continue";
				}
			}
			if (rsInterface.id == 8278) {
				rsInterface.message = "Players will be required to just use an Abyssal whip and Dragon dagger during combat.";
			}
			if (rsInterface.parentID == 6412) {
				if (rsInterface.scrollMax > 0) {
					rsInterface.scrollMax = 300;
				}
			}
		}
		aClass44 = streamLoader;
		defaultTextDrawingAreas = textDrawingAreas;

		new HealthHud().build();
		NotificationInterface.notification(textDrawingAreas);
		Interfaces.loadInterfaces();
		addInterface(emptyInterface);
		processChildEvents();
	}
	
	public static void addHoverButtonLatest(String spriteName,int buttonId1, int buttonId2, int buttonId3, int spriteId1, int spriteId2,
			int buttonWidth, int buttonHeight, String buttonHoverText) {
		addHoverButton(buttonId1, spriteName,spriteId1, buttonWidth, buttonHeight, buttonHoverText, -1, buttonId2, 1);
		addHoveredButton(buttonId2, spriteName,spriteId2, buttonWidth, buttonHeight, buttonId3);
	}
	public static final int OPTION_CLOSE = 3;

	public Consumer<String> inputFieldListener;
	public Consumer<Integer> buttonListener;
	public DropdownMenu dropdown;
	public int[] dropdownColours;
	public boolean hovered = false;
	public RSInterface dropdownOpen;
	public int dropdownHover = -1;
	public boolean inverted;
	public Slider slider;
	public boolean drawingDisabled;

	public int msgX, msgY;

	public boolean toggled = false;
	
	public static void hoverButton(int id, String tooltip) {
		hoverButton(id, tooltip, 255);
	}

	public static void hoverButton(int id, String tooltip, int sprite2, int sprite1) {
		hoverButton(id, tooltip, sprite2, sprite1, 255);
	}

	public static void configButton(int id, String tooltip, int enabledSprite, int disabledSprite) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = OPTION_OK;
		tab.type = TYPE_CONFIG;
		tab.sprite2 = Client.cacheSprite3[enabledSprite];
		tab.sprite1 = Client.cacheSprite3[disabledSprite];
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.active = false;
	}

	public static void adjustableConfig(int id, String tooltip, int sprite, int opacity, int enabledSpriteBehind,
			int disabledSpriteBehind) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = OPTION_OK;
		tab.type = TYPE_ADJUSTABLE_CONFIG;
		tab.sprite2 = Client.cacheSprite3[sprite];
		tab.enabledAltSprite = Client.cacheSprite3[enabledSpriteBehind];
		tab.disabledAltSprite = Client.cacheSprite3[disabledSpriteBehind];
		tab.width = tab.enabledAltSprite.subWidth;
		tab.height = tab.disabledAltSprite.subHeight;
		tab.spriteOpacity = opacity;
	}

	public static void hoverButton(int id, String dir, String tooltip, int offSprite, int hoverSprite) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = 1;
		tab.type = TYPE_HOVER;
		tab.sprite2 = imageLoader(offSprite, dir);
		tab.sprite1 = imageLoader(hoverSprite, dir);
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.active = false;
		tab.toggled = false;
		tab.spriteOpacity = 255;
	}

	public static void hoverButton(int id, String tooltip, int opacity) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = 1;
		tab.type = TYPE_HOVER;
		tab.sprite2 = Client.cacheSprite3[0];
		tab.sprite1 = Client.cacheSprite3[0];
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.active = false;
		tab.toggled = false;
	}
	
	public static void hoverButton(int id, String tooltip, int sprite2, int sprite1, int opacity) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = 1;
		tab.type = TYPE_HOVER;
		tab.sprite2 = Client.cacheSprite3[sprite2];
		tab.sprite1 = Client.cacheSprite3[sprite1];
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.active = false;
		tab.toggled = false;
		tab.spriteOpacity = opacity;
	}

	public static void hoverButton(int id, String tooltip, int enabledSprite, int disabledSprite, String buttonText,
								   TextDrawingArea tda[], int idx, int colour, int hoveredColour, boolean centerText) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = 1;
		tab.type = TYPE_HOVER;
		tab.sprite2 = Client.cacheSprite3[enabledSprite];
		tab.sprite1 = Client.cacheSprite3[disabledSprite];
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.msgX = tab.width / 2;
		tab.msgY = (tab.height / 2) + 4;
		tab.message = buttonText;
		tab.active = false;
		tab.toggled = false;
		tab.textDrawingAreas = tda[idx];
		tab.textColor = colour;
		tab.anInt216 = hoveredColour;
		tab.centerText = centerText;
		tab.spriteOpacity = 255;
	}

	public static void hoverButton(int id, String tooltip, int enabledSprite, int disabledSprite, String buttonText,
								   TextDrawingArea tda[], int idx, int colour, int hoveredColour, boolean centerText, String dir) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = 1;
		tab.type = TYPE_HOVER;
		tab.sprite2 = imageLoader(enabledSprite, dir);
		tab.sprite1 = imageLoader(disabledSprite, dir);
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.msgX = tab.width / 2;
		tab.msgY = (tab.height / 2) + 4;
		tab.message = buttonText;
		tab.active = false;
		tab.toggled = false;
		tab.textDrawingAreas = tda[idx];
		tab.textColor = colour;
		tab.anInt216 = hoveredColour;
		tab.centerText = centerText;
		tab.spriteOpacity = 255;
	}

	public static void hoverButton(int id, String tooltip, int enabledSprite, int disabledSprite, String buttonText,
			RSFont tda, int colour, int hoveredColour, boolean centerText) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = 1;
		tab.type = TYPE_HOVER;
		tab.sprite2 = Client.cacheSprite3[enabledSprite];
		tab.sprite1 = Client.cacheSprite3[disabledSprite];
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.msgX = (tab.width / 2);
		tab.msgY = (tab.height / 2) + 4;
		tab.message = buttonText;
		tab.active = false;
		tab.toggled = false;
		tab.rsFont = tda;
		tab.textColor = colour;
		tab.anInt216 = hoveredColour;
		tab.centerText = centerText;
		tab.spriteOpacity = 255;
	}

	public long getInventoryContainerFreeSlots() {
		return Arrays.stream(inventoryItemId).filter(inv -> inv == 0).count();
	}

	public static void addAllItems(RSInterface from, RSInterface to) {
		main: for (int fromIndex = 0; fromIndex < from.inventoryItemId.length; fromIndex++) {
			if (from.inventoryItemId[fromIndex] > 0) {
				for (int toIndex = 0; toIndex < to.inventoryItemId.length; toIndex++) {
					if (to.inventoryItemId[toIndex] == 0) {
						to.inventoryItemId[toIndex] = from.inventoryItemId[fromIndex];
						to.inventoryAmounts[toIndex] = from.inventoryAmounts[fromIndex];
						from.inventoryItemId[fromIndex] = 0;
						from.inventoryAmounts[fromIndex] = 0;
						continue main;
					}
				}

				return; // No space available in to container
			}
		}
	}

	public void shiftItems() {
		int[] oldItems = inventoryItemId.clone();
		int[] oldAmounts = inventoryAmounts.clone();
		inventoryItemId = new int[inventoryItemId.length];
		inventoryAmounts = new int[inventoryItemId.length];
		int currentIndex = 0;
		for (int index = 0; index < oldItems.length; index++) {
			if (oldItems[index] > 0) {
				inventoryItemId[currentIndex] = oldItems[index];
				inventoryAmounts[currentIndex] = oldAmounts[index];
				currentIndex++;
			}
		}
	}

	public void resetItems() {
		inventoryItemId = new int[inventoryItemId.length];
		inventoryAmounts = new int[inventoryItemId.length];
	}

	public void addItem(int id, int amount) {
		for (int index = 0; index < inventoryItemId.length; index++) {
			if (inventoryItemId[index] == 0) {
				inventoryItemId[index] = id;
				inventoryAmounts[index] = amount;
				break;
			}
		}
	}

	public boolean hasItem(int itemId) {
		if (inventoryItemId == null)
			return false;
		return Arrays.stream(inventoryItemId).anyMatch(it -> it - 1 == itemId);
	}

	public void removeItem(int slot) {
		// Delete from container
		inventoryItemId[slot] = 0;
		inventoryAmounts[slot] = 0;
		for (int index = slot + 1; index < inventoryItemId.length; index++) {
			inventoryItemId[index - 1] = inventoryItemId[index];
			inventoryAmounts[index - 1] = inventoryAmounts[index];
		}
	}

	public static void insertInventoryItem(RSInterface fromContainer, int fromSlot, RSInterface toContainer) {
		insertInventoryItem(fromContainer, fromSlot, toContainer, toContainer.inventoryItemId.length - (int) toContainer.getInventoryContainerFreeSlots());
	}

	public static void insertInventoryItem(RSInterface fromContainer, int fromSlot, RSInterface toContainer, int toSlot) {
		int itemId = fromContainer.inventoryItemId[fromSlot];
		int itemAmount = fromContainer.inventoryAmounts[fromSlot];
		fromContainer.removeItem(fromSlot);

		// Insert in container
		for (int index = toContainer.inventoryItemId.length - 1; index > toSlot; index--) {
			toContainer.inventoryItemId[index] = toContainer.inventoryItemId[index - 1];
			toContainer.inventoryAmounts[index] = toContainer.inventoryAmounts[index - 1];
		}
		toContainer.inventoryItemId[toSlot] = itemId;
		toContainer.inventoryAmounts[toSlot] = itemAmount;
	}

	public static void swapInventoryItems(RSInterface fromContainer, int fromSlot, RSInterface toContainer, int toSlot) {
		int itemId1 = fromContainer.inventoryItemId[fromSlot];
		int itemAmount1 = fromContainer.inventoryAmounts[fromSlot];
		int itemId2 = toContainer.inventoryItemId[toSlot];
		int itemAmount2 = toContainer.inventoryAmounts[toSlot];
		fromContainer.inventoryItemId[fromSlot] = itemId2;
		fromContainer.inventoryAmounts[fromSlot] = itemAmount2;
		toContainer.inventoryItemId[toSlot] = itemId1;
		toContainer.inventoryAmounts[toSlot] = itemAmount1;
	}

	public void swapInventoryItems(int i, int j) {
		int k = inventoryItemId[i];
		inventoryItemId[i] = inventoryItemId[j];
		inventoryItemId[j] = k;
		k = inventoryAmounts[i];
		inventoryAmounts[i] = inventoryAmounts[j];
		inventoryAmounts[j] = k;
	}

	public static Slider slider(int id, double min, double max, int icon, int background, int contentType) {
		RSInterface widget = addInterface(id);
		widget.slider = new Slider(Client.cacheSprite3[icon], Client.cacheSprite3[background], min, max);
		widget.type = TYPE_SLIDER;
		widget.contentType = contentType;
		return widget.slider;
	}

	public static void dropdownMenu(int id, int width, int defaultOption, String[] options, MenuItem menuItem,
			TextDrawingArea tda[], int idx) {
		dropdownMenu(id, width, defaultOption, options, menuItem,
				new int[] { 0x0d0d0b, 0x464644, 0x473d32, 0x51483c, 0x787169 }, false, tda, idx);
	}

	public static void dropdownMenu(int id, int width, int defaultOption, String[] options, MenuItem menuItem,
			int[] dropdownColours, boolean centerText, TextDrawingArea tda[], int idx) {
		RSInterface menu = addInterface(id);
		menu.type = TYPE_DROPDOWN;
		menu.textDrawingAreas = tda[idx];
		menu.dropdown = new DropdownMenu(width, false, defaultOption, options, menuItem);
		menu.atActionType = AT_ACTION_TYPE_OPTION_DROPDOWN;
		menu.dropdownColours = dropdownColours;
		menu.centerText = centerText;
	}

	public static void handleConfigHover(RSInterface widget) {
		if (widget.active) {
			return;
		}
		widget.active = true;
		configHoverButtonSwitch(widget);
		disableOtherButtons(widget);
	}

	public static void configHoverButtonSwitch(RSInterface widget) {
		Sprite[] backup = new Sprite[] { widget.sprite2, widget.sprite1 };

		widget.sprite2 = widget.enabledAltSprite;
		widget.sprite1 = widget.disabledAltSprite;

		widget.enabledAltSprite = backup[0];
		widget.disabledAltSprite = backup[1];
	}

	public static void disableOtherButtons(RSInterface widget) {
		if (widget.buttonsToDisable == null) {
			return;
		}
		for (int btn : widget.buttonsToDisable) {
			RSInterface btnWidget = interfaceCache.get(btn);

			if (btnWidget != null && btnWidget.active) {
				btnWidget.active = false;
				configHoverButtonSwitch(btnWidget);
			}
		}
	}

	public static RSFont rsFont;
	
	public static void dropTable(TextDrawingArea[] tda) {
		RSInterface tab = addInterface(59800);
		String dir = "Interfaces/DropViewer/SPRITE";
		addSprite(59801, 16, dir);
		addHoverButton(59802, dir, 17, 17, anInt208, "Close", 250, 59803, 3);
		addHoveredButton(59803, dir, 17, 17, 59804, anInt208);
		addText(59805, "Monster Drop Guide", 0xff9933, true, true, -1, tda, 2);	
		addText(59806, "Name:", 0xff9933, true, false, -1, tda, 0);
		addText(59807, "Level:", 0xff9933, true, false, -1, tda, 0);
		addText(59818, "", 0xff9933, true, false, -1, tda, 0);	
		String[] table = { "Always", "Common", "Uncommon", "Rare", "Very Rare" };	
		for (int i = 0; i < table.length; i++) {
			addText(59808 + i, table[i], 0x000000, true, false, -1, tda, 0);			
		}	
		itemContainer(59813, 30, 8, 5, 50, false, "Details");
		addInputField(59800, 59814, 15, "NPC/Item Name..", 136, 25, false);

		tab.totalChildren(16);
		tab.child(0, 59801, 15, 2);
		tab.child(1, 59802, 475, 8);
		tab.child(2, 59803, 475, 8);
		tab.child(3, 59805, 265, 9);
		tab.child(4, 59806, 334, 43);
		tab.child(5, 59807, 334, 60);
		tab.child(6, 59808, 204, 91);
		tab.child(7, 59809, 262, 91);
		tab.child(8, 59810, 324, 91);
		tab.child(9, 59811, 385, 91);
		tab.child(10, 59812, 446, 91);
		tab.child(11, 59814, 24, 37);
		tab.child(12, 59817, 171, 119);
		tab.child(13, 59900, -230, 97);
		tab.child(14, 59818, 334, 63);
		tab.child(15, 59815, 24, 65);
		
		RSInterface scrollInterface = addTabInterface(59817);
		scrollInterface.width = 305;
		scrollInterface.height = 208;
		scrollInterface.scrollMax = 41 * 50;
		setChildren(2, scrollInterface);
		addSprite(59819, 458, dir);
		setBounds(59819, 0, 0, 0, scrollInterface);
		setBounds(59813, 13, 4, 1, scrollInterface);
		
		scrollInterface = addTabInterface(59900);
		scrollInterface.width = 377;
		scrollInterface.height = 231;
		scrollInterface.scrollMax = 1000;
		setChildren(50, scrollInterface);
		int y = 0;
		for (int i = 0; i < 50; i++) {
			addHoverText(59901 + i, "" , "", tda, 0, 0xCF4F0A, false, true, 300);
			setBounds(59901 + i, 260, y + 4, i, scrollInterface);
			y += 20;
		}
	}

	private static void itemContainer(int i, int j, int k, int l, int m, boolean b, String string) {
		// TODO Auto-generated method stub

	}


	public static void itemGroup(int id, int w, int h, int x, int y, boolean drag, boolean examine) {
		itemGroup(id, w, h, x, y, drag ,examine, false);
	}
	public static void itemGroup(int id, int w, int h, int x, int y, boolean drag, boolean examine, boolean addPlaceHolders) {
		RSInterface rsi = addInterface(id);
		rsi.width = w;
		rsi.height = h;
		rsi.inventoryItemId = new int[w * h];
		rsi.inventoryAmounts = new int[w * h];
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.invSpritePadX = x;
		rsi.invSpritePadY = y;
		rsi.spritesX = new int[20];
		rsi.spritesY = new int[20];
		rsi.sprites = new Sprite[20];
		rsi.type = 2;
		if(addPlaceHolders) {
			for (int index = 0; index < rsi.inventoryItemId.length; index++) {
				rsi.inventoryItemId[index] = 4152 + (index * 2);
				rsi.inventoryAmounts[index] = index + 1;
			}
		}
	}

	public static TextDrawingArea[] defaultTextDrawingAreas;

	private static void addTransparentSprite2(int id, int spriteId, int transparency) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.transparency = transparency;
		tab.hoverType = 52;
		tab.sprite2 = cacheSprite2[spriteId];
		tab.sprite1 = cacheSprite2[spriteId];
		tab.width = 512;
		tab.height = 334;
		tab.drawsTransparent = true;
	}

	public static RSInterface addConfigButton(int ID, Sprite sprite1, Sprite sprite2, String tT, int configValueToActivate, int configId, int atActionType) {
		RSInterface Tab = addTabInterface(ID);
		Tab.id = ID;
		Tab.type = 5;
		Tab.atActionType = atActionType;
		Tab.contentType = 0;
		Tab.width = sprite1.subWidth;
		Tab.height = sprite1.subHeight;
		Tab.opacity = 0;
		Tab.mOverInterToTrigger = -1;
		Tab.anIntArray245 = new int[1];
		Tab.anIntArray212 = new int[1];
		Tab.anIntArray245[0] = 1;
		Tab.anIntArray212[0] = configValueToActivate;
		Tab.scripts = new int[1][3];
		Tab.scripts[0][0] = 5;
		Tab.scripts[0][1] = configId;
		Tab.scripts[0][2] = 0;
		Tab.sprite1 = sprite1;
		Tab.sprite2 = sprite2;
		Tab.tooltip = tT;
		return Tab;
	}

	public static void addConfigButton(int ID, int pID, int bID, int bID2, int width, int height, String tT,
			int configID, int aT, int configFrame) {
		RSInterface Tab = addTabInterface(ID);
		Tab.parentID = pID;
		Tab.id = ID;
		Tab.type = 5;
		Tab.atActionType = aT;
		Tab.contentType = 0;
		Tab.width = width;
		Tab.height = height;
		Tab.opacity = 0;
		Tab.hoverType = -1;
		Tab.valueCompareType = new int[1];
		Tab.requiredValues = new int[1];
		Tab.valueCompareType[0] = 1;
		Tab.requiredValues[0] = configID;
		Tab.scripts = new int[1][3];
		Tab.scripts[0][0] = 5;
		Tab.scripts[0][1] = configFrame;
		Tab.scripts[0][2] = 0;
		Tab.sprite1 = Client.cacheSprite1[bID];// imageLoader(bID, bName);
		Tab.sprite2 = Client.cacheSprite1[bID2];
		Tab.tooltip = tT;
	}

	public static void addConfigButton(int ID, int pID, int bID, int bID2, int width, int height, int configID, int aT,
			int configFrame) {
		RSInterface Tab = addTabInterface(ID);
		Tab.parentID = pID;
		Tab.id = ID;
		Tab.type = 5;
		Tab.atActionType = aT;
		Tab.contentType = 0;
		Tab.width = width;
		Tab.height = height;
		Tab.opacity = 0;
		Tab.hoverType = -1;
		Tab.valueCompareType = new int[1];
		Tab.requiredValues = new int[1];
		Tab.valueCompareType[0] = 1;
		Tab.requiredValues[0] = configID;
		Tab.scripts = new int[1][3];
		Tab.scripts[0][0] = 5;
		Tab.scripts[0][1] = configFrame;
		Tab.scripts[0][2] = 0;
		Tab.sprite2 = Client.cacheSprite1[bID];// imageLoader(bID, bName);
		Tab.sprite1 = Client.cacheSprite1[bID2];
		Tab.tooltip = "xd";
	}

	public static void addHoverButton_sprite_loader2(int i, int spriteId, int width, int height, String text,
			int contentType, int hoverOver, int aT) {// hoverable
		// button
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = i;
		tab.type = 5;
		tab.atActionType = aT;
		tab.contentType = contentType;
		tab.opacity = 0;
		tab.hoverType = hoverOver;
		tab.sprite2 = Client.cacheSprite2[spriteId];
		tab.sprite1 = Client.cacheSprite2[spriteId];
		tab.width = width;
		tab.height = height;
		tab.tooltip = text;
	}

	public static void addHoveredButton_sprite_loader2(int i, int spriteId, int w, int h, int IMAGEID) {// hoverable
		// button
		RSInterface tab = addTabInterface(i);
		tab.parentID = i;
		tab.id = i;
		tab.type = 0;
		tab.atActionType = 0;
		tab.width = w;
		tab.height = h;
		tab.isMouseoverTriggered = true;
		tab.opacity = 0;
		tab.hoverType = -1;
		tab.scrollMax = 0;
		addHoverImage_sprite_loader2(IMAGEID, spriteId);
		tab.totalChildren(1);
		tab.child(0, IMAGEID, 0, 0);
	}

	public static void addHoverImage_sprite_loader2(int i, int spriteId) {
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = i;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.width = 512;
		tab.height = 334;
		tab.opacity = 0;
		tab.hoverType = 52;
		tab.sprite2 = Client.cacheSprite2[spriteId];
		tab.sprite1 = Client.cacheSprite2[spriteId];
	}

	public static void quickPrayers(TextDrawingArea[] TDA) {
		int frame = 0;
		RSInterface tab = addTabInterface(17200);
		addTransparentSprite2(17235, 12, 330);
		int child = 17202;
		int config = 620;
		for (int i = 0; i < 29; i++) {
			addConfigButton2(child++, 904, 133, 134, 14, 14, "Select", 0, 0, config++);
		}
		addHoverButton_sprite_loader2(17232, 25, 83, 20, "Done", -1, 17233, 1);
		addHoveredButton_sprite_loader2(17233, 26, 83, 20, 17234);
		int removeOffset = 16;
		setChildren(33, tab);//
		setBounds(17235, 0, 25 - removeOffset, frame++, tab);// Faded backing
		setBounds(15608, 0, 16 - removeOffset, frame++, tab);// Faded backing
		setBounds(17202, 5 - 3, 8 + 17 - removeOffset, frame++, tab);
		setBounds(17203, 44 - 3, 8 + 17 - removeOffset, frame++, tab);
		setBounds(17204, 79 - 3, 8 + 17 - removeOffset, frame++, tab);
		setBounds(17205, 116 - 3, 8 + 17 - removeOffset, frame++, tab);
		setBounds(17206, 153 - 3, 8 + 17 - removeOffset, frame++, tab);
		setBounds(17207, 5 - 3, 48 + 17 - removeOffset, frame++, tab);
		setBounds(17208, 44 - 3, 48 + 17 - removeOffset, frame++, tab);
		setBounds(17209, 79 - 3, 48 + 17 - removeOffset, frame++, tab);
		setBounds(17210, 116 - 3, 48 + 17 - removeOffset, frame++, tab);
		setBounds(17211, 153 - 3, 48 + 17 - removeOffset, frame++, tab);
		setBounds(17212, 5 - 3, 85 + 17 - removeOffset, frame++, tab);
		setBounds(17213, 44 - 3, 85 + 17 - removeOffset, frame++, tab);
		setBounds(17214, 79 - 3, 85 + 17 - removeOffset, frame++, tab);
		setBounds(17215, 116 - 3, 85 + 17 - removeOffset, frame++, tab);
		setBounds(17216, 153 - 3, 85 + 17 - removeOffset, frame++, tab);
		setBounds(17217, 5 - 3, 124 + 17 - removeOffset, frame++, tab);
		setBounds(17218, 44 - 3, 124 + 17 - removeOffset, frame++, tab);
		setBounds(17219, 79 - 3, 124 + 17 - removeOffset, frame++, tab);
		setBounds(17220, 116 - 3, 124 + 17 - removeOffset, frame++, tab);
		setBounds(17221, 153 - 3, 124 + 17 - removeOffset, frame++, tab);
		setBounds(17222, 5 - 3, 160 + 17 - removeOffset, frame++, tab);
		setBounds(17223, 44 - 3, 160 + 17 - removeOffset, frame++, tab);
		setBounds(17224, 79 - 3, 160 + 17 - removeOffset, frame++, tab);
		setBounds(17225, 116 - 3, 160 + 17 - removeOffset, frame++, tab);
		setBounds(17226, 153 - 3, 160 + 17 - removeOffset, frame++, tab);
		setBounds(17227, 1, 207 + 4 - removeOffset, frame++, tab); // Chivalry toggle button
		setBounds(17228, 41, 207 + 4 - removeOffset, frame++, tab); // Piety toggle button
		setBounds(17229, 77, 207 + 4 - removeOffset, frame++, tab); // Rigour toggle button
		setBounds(17230, 116, 207 + 4 - removeOffset, frame++, tab); // Augury toggle button
		setBounds(17232, 52, 251 - removeOffset, frame++, tab);// confirm
		setBounds(17233, 52, 251 - removeOffset, frame++, tab);// Confirm hover
	}

	public static void addPrayer(final int i, final int configId, final int configFrame, final int requiredValues,
			final int prayerSpriteID, final String PrayerName, final int Hover, final String loca) {
		RSInterface Interface = addTabInterface(i);
		Interface.id = i;
		Interface.parentID = 22500;
		Interface.type = 5;
		Interface.atActionType = 4;
		Interface.contentType = 0;
		Interface.opacity = 0;
		Interface.hoverType = Hover;
		Interface.sprite1 = imageLoader(prayerSpriteID, "QuickPrayer/" + loca + "");
		Interface.sprite2 = imageLoader(prayerSpriteID, "QuickPrayer/" + loca + "");
		Interface.width = 34;
		Interface.height = 34;
		Interface.anIntArray212 = new int[1];
		Interface.anIntArray245 = new int[1];
		Interface.anIntArray212[0] = 1;
		Interface.anIntArray245[0] = configId;
		Interface.scripts = new int[1][3];
		Interface.scripts[0][0] = 5;
		Interface.scripts[0][1] = configFrame;
		Interface.scripts[0][2] = 0;
		if (Client.tabInterfaceIDs[Client.tabID] != 17200) {
			Interface.tooltip = "Activate@or1@ " + PrayerName;
		}
		Interface = addTabInterface(i + 1);
		Interface.id = i + 1;
		Interface.parentID = 22500;
		Interface.type = 5;
		Interface.atActionType = 0;
		Interface.contentType = 0;
		Interface.opacity = 0;
		Interface.sprite1 = imageLoader(prayerSpriteID, "QuickPrayer/" + loca + "");
		Interface.sprite2 = imageLoader(prayerSpriteID, "QuickPrayer/" + loca + "");
		Interface.width = 34;
		Interface.height = 34;
		Interface.anIntArray212 = new int[1];
		Interface.anIntArray245 = new int[1];
		Interface.anIntArray212[0] = 2;
		Interface.anIntArray245[0] = requiredValues + 1;
		Interface.scripts = new int[1][3];
		Interface.scripts[0][0] = 2;
		Interface.scripts[0][1] = 5;
		Interface.scripts[0][2] = 0;
	}

	/**
	 * Rune pouch
	 * 
	 * @author Sky
	 */
	// public static RSInterface runePouch;
	public static void runePouch(TextDrawingArea[] tda) {
		final int START_ID = 29875;
		int id = START_ID;
		int child = 0;

		final int WINDOW_X = 80;
		final int WINDOW_Y = 25;

		RSInterface rsi = addTabInterface(id++);
		rsi.totalChildren(34);

		addSprite(id, 0, "/Interfaces/runepouch/SPRITE");
		rsi.child(child++, id++, WINDOW_X, WINDOW_Y);// BACKGROUND

		addHoverButton(id, "/Interfaces/runepouch/CLOSE", 0, 21, 21, "Close", 0, id + 1, 1);
		addHoveredButton(id + 1, "/Interfaces/runepouch/CLOSE", 1, 21, 21, id + 2);
		rsi.child(child++, id, WINDOW_X + 324, WINDOW_Y + 7); // CLOSE BUTTON
		rsi.child(child++, id + 1, WINDOW_X + 324, WINDOW_Y + 7); // CLOSE
																	// BUTTON
																	// HOVER
		id += 3;

		/**
		 * Inventory items
		 */
		final int START_X = WINDOW_X + 20;
		final int START_Y = WINDOW_Y + 135;
		int x = START_X;
		int y = START_Y;
		final int X_DIFF = 47;
		final int Y_DIFF = 32;
		// id = 27342;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				// System.out.println("Rune pouch inventory item interface: " + id);
				addItem(id, new String[] { null, null, null, null, "Add X" });
				rsi.child(child++, id++, x, y);
				x += X_DIFF;
			}

			x = START_X;
			y += Y_DIFF;

		}

		/**
		 * Pouch items
		 */
		final int START_POUCH_X = WINDOW_X + 104;
		final int START_POUCH_Y = WINDOW_Y + 64;
		final int X_POUCH_DIFF = 56;
		x = START_POUCH_X;
		y = START_POUCH_Y;
		for (int i = 0; i < 3; i++) {
			addItem(id, new String[] { null, null, null, null, "Remove X" }, 1336);
			rsi.child(child++, id++, x, y);
			x += X_POUCH_DIFF;
		}
	}

	public static void addAntibotWidget(TextDrawingArea[] tda) {
		RSInterface widget = addInterface(33300);
		addSprite(33301, 0, "Interfaces/AntiBot/IMAGE");
		addText(33302, "Click the 'Abyssal Whip'", tda, 2, 0xFF981F, true, true);
		addText(33303, "1:00", tda, 0, 0xFF981F, true, true);
		addText(33304,
				"If you click the wrong item or the time depletes to 0,\\nYou will be teleported to a new location.",
				tda, 0, 0xFF981F, true, true);
		setChildren(7, widget);
		setBounds(33301, 115, 96, 0, widget);
		setBounds(33302, 253, 105, 1, widget);
		setBounds(33303, 375, 105, 2, widget);
		setBounds(33304, 255, 190, 3, widget);
		setBounds(33310, 180, 140, 4, widget);
		setBounds(33313, 240, 140, 5, widget);
		setBounds(33316, 300, 140, 6, widget);

		for (int i = 0; i < 9; i += 3) {
			RSInterface option = addInterface(33310 + i);
			addToItemGroup(33311 + i, 1, 1, 0, 0, false, "", "", "");
			interfaceCache.get(33311 + i).inventoryItemId = new int[]{4152};
			interfaceCache.get(33311 + i).inventoryAmounts = new int[]{1};
			addButton(33312 + i, 1, "Interfaces/AntiBot/IMAGE", "Select");
			setChildren(2, option);
			setBounds(33311 + i, 0, 0, 0, option);
			setBounds(33312 + i, 0, 0, 1, option);
		}
	}

	public static void addPestControlRewardWidget(TextDrawingArea[] tda) {
		RSInterface main = addInterface(37000);
		addSprite(37001, 0, "Interfaces/Pest Control/Reward/IMAGE");
		addButton(37002, 1, "Interfaces/Pest Control/Reward/IMAGE", "Confirm");
		addText(37003, "10 points", tda, 1, 0xFF981F, true, true);
		addHoverButton(37004, "Interfaces/Pest Control/Reward/IMAGE", 3, 21,
				21, "Close", -1, 37005, 3);
		addHoveredButton(37005, "Interfaces/Pest Control/Reward/IMAGE", 4, 21,
				21, 37006);
		addText(37007, "1,000 pts", tda, 2, 0xFF981F, false, true);
		setChildren(7, main);
		setBounds(37001, 0, 0, 0, main);
		setBounds(37002, 181, 273, 1, main);
		setBounds(37003, 253, 300, 2, main);
		setBounds(37004, 463, 14, 3, main);
		setBounds(37005, 463, 14, 4, main);
		setBounds(37007, 35, 19, 5, main);
		setBounds(37010, 27, 43, 6, main);

		RSInterface scroll = addInterface(37010);
		scroll.width = 442;
		scroll.height = 221;
		scroll.scrollMax = 520;
		setChildren(77, scroll);
		int x = 5;
		int y = 5;
		int imageId = 5;
		String[] names = { "Attack - 10,000 xp",
				"Defence - 10,000 xp", "Magic - 10,000 xp",
				"Prayer - 1,000 xp", "Strength - 10,000 xp",
				"Range - 10,000 xp", "Hitpoints - 3,300 xp" };
		for (int index = 0; index < 35; index += 5) {
			addSprite(37012 + index, imageId,
					"Interfaces/Pest Control/Reward/IMAGE");
			addText(37013 + index, names[index / 5], tda, 1, 0x339900, false,
					true);
			addClickableText(37014 + index, "(1 Pt)", "(1 Pt)", tda, 0,
					0xFF981F, false, true, 40);
			addClickableText(37015 + index, "(10 Pts)", "(10 Pts)", tda, 0,
					0xFF981F, false, true, 40);
			addClickableText(37016 + index, "(100 Pts)", "(100 Pts)", tda, 0,
					0xFF981F, false, true, 40);
			setBounds(37012 + index, x, y, index, scroll);
			setBounds(37013 + index, x + 32, y, index + 1, scroll);
			setBounds(37014 + index, x + 32, y + 16, index + 2, scroll);
			setBounds(37015 + index, x + 70, y + 16, index + 3, scroll);
			setBounds(37016 + index, x + 120, y + 16, index + 4, scroll);
			y += 40;
			if (imageId == 8) {
				x += 210;
				y = 5;
			}
			imageId++;
		}
		addSprite(37050, 2, "Interfaces/Pest Control/Reward/IMAGE");
		setBounds(37050, 53, 165, 35, scroll);
		addSprite(37051, 2, "Interfaces/Pest Control/Reward/IMAGE");
		setBounds(37051, 53, 265, 36, scroll);
		x = 5;
		y = 180;
		names = new String[] { "Herb Pack", "Seed Pack", "Mineral Pack",
				"Void Knight Mace", "Void Knight Robe", "Void Mage Helm",
				"Void Melee Helm", "Void Knight Top", "Void Knight Gloves",
				"Void Range Helm"};
		int[] items = { 257, 5295, 449, 8841, 8840, 11663, 11665,
				8839, 8842, 11664};
		String[] costs = { "(30 Pts)", "(15 Pts)", "(15 Pts)",
				"(160 Pts)", "(175 Pts)", "(150 Pts)", "(150 Pts)",
				"(175 Pts)", "(110 Pts)", "(150 Pts)"};
		for (int index = 0; index < names.length * 3; index += 3) {
			addText(37052 + index, names[index / 3], tda, 1, 0x339900, false,
					true);
			addClickableText(37053 + index, costs[index / 3], costs[index / 3],
					tda, 0, 0xFF981F, false, true, 40);
			addToItemGroup(37054 + index, 1, 1, 0, 0, false, "", "", "");
			interfaceCache.get(37054 + index).inventoryItemId = new int[]{items[index / 3] + 1};
			interfaceCache.get(37054 + index).inventoryAmounts = new int[]{1};
			setBounds(37052 + index, x + 32, y, 37 + index, scroll);
			setBounds(37053 + index, x + 32, y + 16, 37 + index + 1, scroll);
			setBounds(37054 + index, x, y, 37 + index + 2, scroll);
			y += 40;
			if (y == 220 && x == 215) {
				x = 5;
				y = 280;
			}
			if (x == 5 && y == 440) {
				x += 210;
				y = 280;
			}
			if (y == 260) {
				x += 210;
				y = 180;
			}
			if (x == 215 && y == 440) {
				x -= 210;
			}
			if (x == 5 && y == 480) {
				x = 215;
				y = 440;
			}
		}
		darken(37100, 200, 40, 0x000000, (byte) 100);
		setBounds(37100, 0, 0, 76, scroll);
	}

	public static void lootingBagAdd(TextDrawingArea[] tda) {
		RSInterface rsi = addTabInterface(39443);
		addSprite(39444, 0, "/Interfaces/Lootingbag/SPRITE");
		addText(39445, "Deposit Items", tda, 2, 16750623, true, true);

		addHoverButton(39446, "/Interfaces/Lootingbag/CLOSE", 0, 128, 35, "Close", 0, 36484, 1);
		addHoveredButton(39447, "/Interfaces/Lootingbag/CLOSE", 1, 128, 35, 36485);

		addItemContainer(39448, 4, 7, 8, 0, true,
				"Deposit 1", "Deposit 5", "Deposit 10", "Deposit All", "Deposit X");

		rsi.totalChildren(5);
		int child = 0;

		rsi.child(child++, 39444, 7, 24);// bg
		rsi.child(child++, 39445, 90, 4);// title
		rsi.child(child++, 39446, 167, 4); // close button
		rsi.child(child++, 39447, 167, 4); // close hover
		rsi.child(child++, 39448, 16, 27); // item container
	}

	public static void lootingBag(TextDrawingArea[] tda) {
		RSInterface rsi = addTabInterface(39342);
		addSprite(39343, 0, "/Interfaces/Lootingbag/SPRITE");
		addText(39344, "Looting Bag", tda, 2, 16750623, true, true);

		addHoverButton(39345, "/Interfaces/Lootingbag/CLOSE", 0, 128, 35, "Close", 0, 36484, 1);
		addHoveredButton(39346, "/Interfaces/Lootingbag/CLOSE", 1, 128, 35, 36485);
		addHoverText(39347, "Bank All", "Bank all items", tda, 0, 0xff9040, false, true, 40);
		addText(39348, "Value: 0 coins", tda, 0, 0xFF9900, true, true);

		addItemContainer(39349, 4, 7, 8, 0, true,
				"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X");

		rsi.totalChildren(7);
		int child = 0;

		rsi.child(child++, 39343, 7, 18);// bg
		rsi.child(child++, 39344, 90, 0);// title
		rsi.child(child++, 39345, 167, 0); // close button
		rsi.child(child++, 39346, 167, 0); // close hover
		rsi.child(child++, 39347, 20, 250); // Bank All
		rsi.child(child++, 39348, 124, 250); // Total Value
		rsi.child(child++, 39349, 16, 24); // item container

	}

	public static RSInterface addInterfaceContainer(int interfaceId, int width, int height, int scrollMax) {
		RSInterface container = addInterface(interfaceId);
		container.width = width;
		container.height = height;
		container.scrollMax = scrollMax;
		return container;
	}

	public static void addItemContainerAutoScrollable(int childId, int width, int height, int invSpritePadX, int invSpritePadY, boolean addPlaceholderItems, int invAutoScrollInterfaceId, String...options) {
		RSInterface inter = addItemContainer(childId, width, height, invSpritePadX, invSpritePadY, addPlaceholderItems, false, options);
		inter.invAutoScrollHeight = true;
		inter.invAutoScrollInterfaceId = invAutoScrollInterfaceId;
	}

	public static RSInterface addInventoryContainer(int childId, int width, int height, int invSpritePadX, int invSpritePadY, boolean addPlaceholderItems, String...options) {
		RSInterface inter = addItemContainer(childId, width, height, invSpritePadX, invSpritePadY, addPlaceholderItems, false, options);
		inter.aBoolean259 = true;
		return inter;
	}

	public static RSInterface addInventoryContainer(int childId, int width, int height, int invSpritePadX, int invSpritePadY, boolean addPlaceholderItems, boolean smallInvSprites, String...options) {
		RSInterface inter = addItemContainer(childId, width, height, invSpritePadX, invSpritePadY, addPlaceholderItems, smallInvSprites, options);
		inter.aBoolean259 = true;
		return inter;
	}

	public static RSInterface addItemContainer(int childId, int width, int height, int invSpritePadX,
											   int invSpritePadY, boolean addPlaceholderItems, String...options) {
		RSInterface inter = addItemContainer(childId, width, height, invSpritePadX, invSpritePadY, addPlaceholderItems, false, options);
		return inter;
	}

	public static RSInterface addItemContainer(int childId, int width, int height, int invSpritePadX,
                                            int invSpritePadY, boolean addPlaceholderItems, boolean smallInvSprites, String...options) {
		RSInterface rsi = addInterface(childId);
		rsi.smallInvSprites = smallInvSprites;
		rsi.hideInvStackSizes = false;
		rsi.actions = new String[10];
		rsi.spritesX = new int[width * height];
		rsi.inventoryItemId = new int[width * height];
		rsi.inventoryAmounts = new int[width * height];
		rsi.spritesY = new int[width * height];
		rsi.height = height;
		rsi.width = width;
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.type = 2;
		rsi.id = childId;
		rsi.invSpritePadX = invSpritePadX;
		rsi.invSpritePadY = invSpritePadY;


		for (int index = 0; index < options.length; index++) {
			rsi.actions[index] = options[index];
		}

		if (addPlaceholderItems) {
			for (int index = 0; index < rsi.inventoryItemId.length; index++) {
				rsi.inventoryItemId[index] = 4152 + (index * 2);
				rsi.inventoryAmounts[index] = index + 1;
			}
		}
		return rsi;
	}

	public static void addItemView(int childId, int itemId, boolean smallInvSprites, boolean hideInvStackSizes) {
		RSInterface rsi = addInterface(childId);
		rsi.smallInvSprites = smallInvSprites;
		rsi.hideInvStackSizes = hideInvStackSizes;
		rsi.actions = new String[10];
		rsi.spritesX = new int[1];
		rsi.inventoryItemId = new int[1];
		rsi.inventoryAmounts = new int[1];
		rsi.spritesY = new int[1];
		rsi.height = 1;
		rsi.width = 1;
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.inventoryItemId[0] = itemId;
		rsi.inventoryAmounts[0] = 1;
		rsi.type = 2;
		rsi.id = childId;
	}

	public static void addItem(int childId, String[] options) {
		int interfaceId = 39342;

		interfaceCache.put(childId, new RSInterface());
		RSInterface rsi = interfaceCache.get(childId);
		rsi.actions = new String[10];
		rsi.spritesX = new int[20];
		rsi.inventoryItemId = new int[30];
		rsi.inventoryAmounts = new int[30];
		rsi.spritesY = new int[20];
		rsi.children = new int[0];
		rsi.childX = new int[0];
		rsi.childY = new int[0];

		for (int i = 0; i < options.length; i++) {
			if (options[i] == null) {
				continue;
			}
			rsi.actions[i] = options[i];
		}

		rsi.centerText = true;
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.invSpritePadX = 8;
		rsi.invSpritePadY = 1;
		rsi.height = 7;
		rsi.width = 4;
		rsi.parentID = interfaceId;
		rsi.id = childId;
		rsi.type = 2;
	}

	public static void addItem(int childId, String[] options, int interfaceId) {
		// int interfaceId = 37342;

		interfaceCache.put(childId, new RSInterface());
		RSInterface rsi = interfaceCache.get(childId);
		rsi.actions = new String[10];
		rsi.spritesX = new int[20];
		rsi.inventoryItemId = new int[30];
		rsi.inventoryAmounts = new int[25];
		rsi.spritesY = new int[20];
		rsi.children = new int[0];
		rsi.childX = new int[0];
		rsi.childY = new int[0];

		for (int i = 0; i < options.length; i++) {
			if (options[i] == null) {
				continue;
			}
			rsi.actions[i] = options[i];
		}

		rsi.centerText = true;
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.invSpritePadX = 23;
		rsi.invSpritePadY = 22;
		rsi.height = 5;
		rsi.width = 6;
		rsi.parentID = interfaceId;
		rsi.id = childId;
		rsi.type = 2;
	}

	public static void addInputField(int identity, int characterLimit, int color, String text, int width, int height,
									 boolean asterisks, boolean updatesEveryInput, String regex, Consumer<String> inputFieldListener, boolean sendPacket) {
		addInputField(identity, characterLimit, color, text, width, height, asterisks, updatesEveryInput, regex);
		RSInterface rsInterface = get(identity);
		rsInterface.inputFieldListener = inputFieldListener;
		rsInterface.inputFieldSendPacket = sendPacket;
	}

	public static void addInputField(int identity, int characterLimit, int color, String text, int width, int height,
			boolean asterisks, boolean updatesEveryInput, String regex) {
		RSInterface field = addFullScreenInterface(identity);
		field.id = identity;
		field.type = 16;
		field.atActionType = 8;
		field.message = text;
		field.width = width;
		field.height = height;
		field.characterLimit = characterLimit;
		field.textColor = color;
		field.displayAsterisks = asterisks;
		field.tooltips = new String[] { "Clear", "Edit" };
		field.defaultInputFieldText = text;
		field.updatesEveryInput = updatesEveryInput;
		field.inputRegex = regex;
		field.disableFieldBackground = false;
	}
	public boolean disableFieldBackground = false;

	public static void addInputField(int identity, int characterLimit, int color, String text, int width, int height,
			boolean asterisks, boolean updatesEveryInput) {
		RSInterface field = addFullScreenInterface(identity);
		field.id = identity;
		field.type = 16;
		field.atActionType = 8;
		field.message = text;
		field.width = width;
		field.height = height;
		field.characterLimit = characterLimit;
		field.textColor = color;
		field.displayAsterisks = asterisks;
		field.defaultInputFieldText = text;
		field.tooltips = new String[] { "Clear", "Edit" };
		field.updatesEveryInput = updatesEveryInput;
	}

	public static void addInputField(int identity, int characterLimit, int color, String text, int width, int height,
			boolean asterisks) {
		RSInterface field = addFullScreenInterface(identity);
		field.id = identity;
		field.type = 16;
		field.atActionType = 8;
		field.message = text;
		field.width = width;
		field.height = height;
		field.characterLimit = characterLimit;
		field.textColor = color;
		field.displayAsterisks = asterisks;
		field.defaultInputFieldText = text;
		field.tooltips = new String[] { "Clear", "Edit" };
	}

	public static RSInterface addFullScreenInterface(int id) {
		interfaceCache.put(id, new RSInterface());
		RSInterface rsi = interfaceCache.get(id);
		rsi.id = id;
		rsi.parentID = id;
		rsi.width = 765;
		rsi.height = 503;
		return rsi;
	}

	public boolean updatesEveryInput;
	public boolean inputFieldSendPacket = true;
	public String defaultInputFieldText = "";
	int[] inputFieldTriggers;
	public boolean displayAsterisks;
	public int characterLimit;
	public static int currentInputFieldId;
	public String inputRegex = "";
	public boolean isInFocus;

	public String[] tooltips;

	public static void addBankHover(int interfaceID, int actionType, int hoverid, int spriteId, int spriteId2,
			String NAME, int Width, int Height, int configFrame, int configId, String Tooltip, int hoverId2,
			int hoverSpriteId, int hoverSpriteId2, String hoverSpriteName, int hoverId3, String hoverDisabledText,
			String hoverEnabledText, int X, int Y) {
		RSInterface hover = addTabInterface(interfaceID);
		hover.id = interfaceID;
		hover.parentID = interfaceID;
		hover.type = 5;
		hover.atActionType = actionType;
		hover.contentType = 0;
		hover.opacity = 0;
		hover.hoverType = hoverid;
		hover.sprite1 = imageLoader(spriteId, NAME);
		hover.sprite2 = imageLoader(spriteId2, NAME);
		hover.width = Width;
		hover.tooltip = Tooltip;
		hover.height = Height;
		hover.anIntArray245 = new int[1];
		hover.anIntArray212 = new int[1];
		hover.anIntArray245[0] = 1;
		hover.anIntArray212[0] = configId;
		hover.scripts = new int[1][3];
		hover.scripts[0][0] = 5;
		hover.scripts[0][1] = configFrame;
		hover.scripts[0][2] = 0;
		hover = addTabInterface(hoverid);
		hover.parentID = hoverid;
		hover.id = hoverid;
		hover.type = 0;
		hover.atActionType = 0;
		hover.width = 550;
		hover.height = 334;
		hover.isMouseoverTriggered = true;
		hover.hoverType = -1;
		addSprites(hoverId2, hoverSpriteId, hoverSpriteId2, hoverSpriteName, configId, configFrame);
		addHoverBox(hoverId3, interfaceID, hoverDisabledText, hoverEnabledText, configId, configFrame);
		setChildren(2, hover);
		setBounds(hoverId2, 15, 60, 0, hover);
		setBounds(hoverId3, X, Y, 1, hover);
	}

	public static RSInterface addToItemGroup(int id, int w, int h, int spritePadX, int spritePadY, boolean actions, String...actionStrings) {
		RSInterface rsi = addInterface(id);
		rsi.width = w;
		rsi.height = h;
		rsi.inventoryItemId = new int[w * h];
		rsi.inventoryAmounts = new int[w * h];
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.isMouseoverTriggered = false;
		rsi.invSpritePadX = spritePadX;
		rsi.invSpritePadY = spritePadY;
		rsi.spritesX = new int[20];
		rsi.spritesY = new int[20];
		rsi.sprites = new Sprite[20];
		rsi.actions = new String[6];
		if (actions) {
			for (int index = 0; index < actionStrings.length; index++) {
				rsi.actions[index] = actionStrings[index];
			}
		}
		rsi.type = 2;
		return rsi;
	}

	public static void addToItemGroup(int id, int w, int h, int x, int y, boolean actions, String action1,
			String action2, String action3, String action4, String action5, String action6) {
		RSInterface rsi = addInterface(id);
		rsi.width = w;
		rsi.height = h;
		rsi.inventoryItemId = new int[w * h];
		rsi.inventoryAmounts = new int[w * h];
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.isMouseoverTriggered = false;
		rsi.invSpritePadX = x;
		rsi.invSpritePadY = y;
		rsi.spritesX = new int[20];
		rsi.spritesY = new int[20];
		rsi.sprites = new Sprite[20];
		rsi.actions = new String[6];
		if (actions) {
			rsi.actions[0] = action1;
			rsi.actions[1] = action2;
			rsi.actions[2] = action3;
			rsi.actions[3] = action4;
			rsi.actions[4] = action5;
			rsi.actions[5] = action6;
		}
		rsi.type = 2;
	}

	public static void addToItemGroup(int id, int w, int h, int x, int y, boolean actions, String action1,
			String action2, String action3) {
		RSInterface rsi = addInterface(id);
		rsi.width = w;
		rsi.height = h;
		rsi.inventoryItemId = new int[w * h];
		rsi.inventoryAmounts = new int[w * h];
		rsi.usableItemInterface = false;
		rsi.isInventoryInterface = false;
		rsi.isMouseoverTriggered = false;
		rsi.invSpritePadX = x;
		rsi.invSpritePadY = y;
		rsi.spritesX = new int[20];
		rsi.spritesY = new int[20];
		rsi.sprites = new Sprite[20];
		rsi.actions = new String[5];
		if (actions) {
			rsi.actions[0] = action1;
			rsi.actions[1] = action2;
			rsi.actions[2] = action3;
		}
		rsi.type = 2;
	}

	public static void addSprites(int ID, int i, int i2, String name, int configId, int configFrame) {
		RSInterface Tab = addTabInterface(ID);
		Tab.id = ID;
		Tab.parentID = ID;
		Tab.type = 5;
		Tab.atActionType = 0;
		Tab.contentType = 0;
		Tab.width = 512;
		Tab.height = 334;
		Tab.opacity = (byte) 0;
		Tab.hoverType = -1;
		Tab.anIntArray245 = new int[1];
		Tab.anIntArray212 = new int[1];
		Tab.anIntArray245[0] = 1;
		Tab.anIntArray212[0] = configId;
		Tab.scripts = new int[1][3];
		Tab.scripts[0][0] = 5;
		Tab.scripts[0][1] = configFrame;
		Tab.scripts[0][2] = 0;
		Tab.sprite1 = imageLoader(i, name);
		Tab.sprite2 = imageLoader(i2, name);
	}

	public static void addConfigButton(int ID, int pID, int bID, int bID2, String bName, int width, int height,
			String[] tooltips, int configID, int configFrame) {
		RSInterface Tab = addTabInterface(ID);
		Tab.parentID = pID;
		Tab.id = ID;
		Tab.type = 5;
		Tab.atActionType = 8;
		Tab.contentType = 0;
		Tab.width = width;
		Tab.height = height;
		Tab.opacity = 0;
		Tab.hoverType = -1;
		Tab.anIntArray245 = new int[1];
		Tab.anIntArray212 = new int[1];
		Tab.anIntArray245[0] = 1;
		Tab.anIntArray212[0] = configID;
		Tab.scripts = new int[1][3];
		Tab.scripts = new int[1][3];
		Tab.scripts[0][0] = 5;
		Tab.scripts[0][1] = configFrame;
		Tab.scripts[0][2] = 0;
		Tab.sprite1 = imageLoader(bID, bName);
		Tab.sprite2 = imageLoader(bID2, bName);
		Tab.tooltips = tooltips;
	}

	public static void drawTooltip(int id, String text) {
		RSInterface rsinterface = addTabInterface(id);
		rsinterface.parentID = id;
		rsinterface.type = 0;
		rsinterface.isMouseoverTriggered = true;
		rsinterface.mOverInterToTrigger = -1;
		addTooltipBox(id + 1, text);
		rsinterface.totalChildren(1);
		rsinterface.child(0, id + 1, 0, 0);
	}

	public static void addButton(int interfaceId, Sprite sprite, String tooltip, int atActionType, Consumer<Integer> buttonListener) {
		addButton(interfaceId, sprite, tooltip, atActionType);
		RSInterface rsInterface = get(interfaceId);
		rsInterface.buttonListener = buttonListener;
	}

	public static RSInterface addButton(int interfaceId, Sprite sprite, String tooltip, int atActionType) {
		RSInterface RSInterface = addInterface(interfaceId);
		RSInterface.id = interfaceId;
		RSInterface.parentID = interfaceId;
		RSInterface.type = 5;
		RSInterface.atActionType = atActionType;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.hoverType = 52;
		RSInterface.sprite1 = sprite;
		RSInterface.sprite2 = sprite;
		RSInterface.width = sprite.subWidth;
		RSInterface.height = sprite.subHeight;
		RSInterface.tooltip = tooltip;
		return RSInterface;
	}

	public static void addNonSpriteButton(int interfaceId, int width, int height, String tooltip, String...actions) {
		RSInterface RSInterface = addInterface(interfaceId);
		RSInterface.id = interfaceId;
		RSInterface.parentID = interfaceId;
		RSInterface.type = 5;
		RSInterface.atActionType = 4;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.hoverType = 52;
		RSInterface.width = width;
		RSInterface.height = height;
		RSInterface.tooltip = tooltip;
		RSInterface.actions = actions;
	}

	public static void addNonSpriteButton(int interfaceId, int width, int height, int atActionType, String tooltip, String...actions) {
		RSInterface RSInterface = addInterface(interfaceId);
		RSInterface.id = interfaceId;
		RSInterface.parentID = interfaceId;
		RSInterface.type = 5;
		RSInterface.atActionType = atActionType;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.hoverType = 52;
		RSInterface.width = width;
		RSInterface.height = height;
		RSInterface.tooltip = tooltip;
		RSInterface.actions = actions;
	}

	public static void addButton(int i, int j, String name, int W, int H, String S, int AT) {
		RSInterface RSInterface = addInterface(i);
		RSInterface.id = i;
		RSInterface.parentID = i;
		RSInterface.type = 5;
		RSInterface.atActionType = AT;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.hoverType = 52;
		RSInterface.sprite1 = imageLoader(j, name);
		RSInterface.sprite2 = imageLoader(j, name);
		RSInterface.width = W;
		RSInterface.height = H;
		RSInterface.tooltip = S;
	}

	public static void addButton(int interfaceId, int spriteId, String spriteLocation, int width, int height,
			String[] tooltips) {
		RSInterface RSInterface = addInterface(interfaceId);
		RSInterface.id = interfaceId;
		RSInterface.parentID = interfaceId;
		RSInterface.type = 5;
		RSInterface.atActionType = 8;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.hoverType = 52;
		RSInterface.sprite1 = imageLoader(spriteId, spriteLocation);
		RSInterface.sprite2 = imageLoader(spriteId, spriteLocation);
		RSInterface.width = width;
		RSInterface.height = height;
		RSInterface.tooltips = tooltips;
	}

	public boolean newScroller;

	public static void addBankHover1(int interfaceID, int actionType, int hoverid, int spriteId, String NAME, int Width,
			int Height, String Tooltip, int hoverId2, int hoverSpriteId, String hoverSpriteName, int hoverId3,
			String hoverDisabledText, int X, int Y) {
		RSInterface hover = addTabInterface(interfaceID);
		hover.id = interfaceID;
		hover.parentID = interfaceID;
		hover.type = 5;
		hover.atActionType = actionType;
		hover.contentType = 0;
		hover.opacity = 0;
		hover.sprite1 = imageLoader(spriteId, NAME);
		hover.width = Width;
		hover.tooltip = Tooltip;
		hover.height = Height;
		hover = addTabInterface(hoverid);
		hover.parentID = hoverid;
		hover.id = hoverid;
		hover.type = 0;
		hover.atActionType = 0;
		hover.width = 550;
		hover.height = 334;
		hover.isMouseoverTriggered = true;
		addSprite(hoverId2, hoverSpriteId, hoverSpriteId, hoverSpriteName, 0, 0);
		addHoverBox(hoverId3, interfaceID, hoverDisabledText, hoverDisabledText, 0, 0);
		setChildren(2, hover);
		setBounds(hoverId2, 15, 60, 0, hover);
		setBounds(hoverId3, X, Y, 1, hover);
	}

	public static void addTextButton(int i, String s, String tooltip, int k, boolean l, boolean m,
			TextDrawingArea[] TDA, int j, int w) {
		RSInterface rsinterface = addInterface(i);
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 4;
		rsinterface.atActionType = 1;
		rsinterface.width = w;
		rsinterface.height = 16;
		rsinterface.contentType = 0;
		rsinterface.opacity = (byte) 0xFF981F;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.centerText = l;
		rsinterface.textShadow = m;
		rsinterface.textDrawingAreas = TDA[j];
		rsinterface.message = s;
		rsinterface.aString228 = "";
		rsinterface.secondaryColor = 0xFF981F;
		rsinterface.textColor = 0xFF981F;
		rsinterface.tooltip = tooltip;
	}
	public static void addTextButton(int i, String s, String tooltip, int color, int hoverColor, boolean l, boolean m, TextDrawingArea[] TDA, int j, int width, int height, int xAdjust, int yAdjust) {
		RSInterface rsinterface = addInterface(i);
		rsinterface.parentID = i;
		rsinterface.id = i;
		rsinterface.type = 4;
		rsinterface.atActionType = 1;
		rsinterface.width = width;
		rsinterface.height = height;
		rsinterface.contentType = 0;
		rsinterface.opacity = (byte)hoverColor;
		rsinterface.mOverInterToTrigger = i;
		rsinterface.centerText = l;
		rsinterface.textShadow = m;
		rsinterface.textDrawingAreas = TDA[j];
		rsinterface.message = s;
		rsinterface.aString228 = s;
		rsinterface.anInt216 = hoverColor;
		rsinterface.textColor = color;
		rsinterface.tooltip = tooltip;
		rsinterface.xAdjust = xAdjust;
		rsinterface.yAdjust = yAdjust;
	}

	public int xAdjust;

	public int yAdjust;

	public boolean horizontalScroll;
	public static void homeTeleport() {
		RSInterface RSInterface = addInterface(30000);
		RSInterface.tooltip = "Cast @gre@Lunar Home Teleport";
		RSInterface.id = 30000;
		RSInterface.parentID = 30000;
		RSInterface.type = 5;
		RSInterface.atActionType = 5;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.mOverInterToTrigger = 30001;
		RSInterface.sprite1 = imageLoader(1, "Lunar/SPRITE");
		RSInterface.width = 20;
		RSInterface.height = 20;
		RSInterface Int = addInterface(30001);
		Int.isMouseoverTriggered = true;
		Int.mOverInterToTrigger = -1;
		setChildren(1, Int);
		addLunarSprite(30002, 0, "SPRITE");
		setBounds(30002, 0, 0, 0, Int);
	}

	public static void addLunarSprite(int i, int j, String name) {
		RSInterface RSInterface = addInterface(i);
		RSInterface.id = i;
		RSInterface.parentID = i;
		RSInterface.type = 5;
		RSInterface.atActionType = 5;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.mOverInterToTrigger = 52;
		RSInterface.sprite1 = LoadLunarSprite(j, name);
		RSInterface.width = 500;
		RSInterface.height = 500;
		RSInterface.tooltip = "";
	}

	public static void drawRune(int i, int id, String runeName) {
		RSInterface RSInterface = addInterface(i);
		RSInterface.type = 5;
		RSInterface.atActionType = 0;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.mOverInterToTrigger = 52;
		RSInterface.sprite1 = LoadLunarSprite(id, "RUNE");
		RSInterface.width = 500;
		RSInterface.height = 500;
	}

	public int hoverXOffset = 0;
	public int hoverYOffset = 0;
	public boolean regularHoverBox;

	public boolean invisible = false;

	public static void addRuneText(int ID, int runeAmount, int RuneID, TextDrawingArea[] font) {
		RSInterface rsInterface = addTabInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 4;
		rsInterface.atActionType = 0;
		rsInterface.contentType = 0;
		rsInterface.width = 0;
		rsInterface.height = 14;
		rsInterface.opacity = 0;
		rsInterface.mOverInterToTrigger = -1;
		rsInterface.anIntArray245 = new int[1];
		rsInterface.anIntArray212 = new int[1];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = runeAmount;
		rsInterface.scripts = new int[1][4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = RuneID;
		rsInterface.scripts[0][3] = 0;
		rsInterface.centerText = true;
		rsInterface.textDrawingAreas = font[0];
		rsInterface.textShadow = true;
		rsInterface.message = "%1/" + runeAmount + "";
		rsInterface.aString228 = "";
		rsInterface.textColor = 12582912;
		rsInterface.secondaryColor = 49152;
	}

	public static void addLunar3RunesSmallBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 6;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite2 = Client.cacheSprite1[LUNAR_ON_SPRITES_START + sid];
		rsInterface.sprite1 = Client.cacheSprite1[LUNAR_OFF_SPRITES_START + sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 0, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 19, 2, INT);
		setBounds(30016, 14, 35, 3, INT);
		setBounds(rune1, 74, 35, 4, INT);
		setBounds(rune2, 130, 35, 5, INT);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 66, 6, INT);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 66, 7, INT);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 66, 8, INT);
	}

	public static void addSpellSmall2(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int rune3, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 6;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite1 = new Sprite("magic/spell " + sid);
		rsInterface.sprite2 = new Sprite("magic/spell " + (sid + 1));
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 0, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 19, 2, INT);
		setBounds(rune1, 14, 35, 3, INT);
		setBounds(rune2, 74, 35, 4, INT);
		setBounds(rune3, 130, 35, 5, INT);
		addRuneText(ID + 5, ra1, r1, TDA);
		setBounds(ID + 5, 26, 66, 6, INT);
		addRuneText(ID + 6, ra2, r2, TDA);
		setBounds(ID + 6, 87, 66, 7, INT);
		addRuneText(ID + 7, ra3, r3, TDA);
		setBounds(ID + 7, 142, 66, 8, INT);
	}
	
	public static void addSpellSmall(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int rune3, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 6;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite1 = new Sprite("magic/spell " + sid); //Client.cacheSprite2[sid];
		rsInterface.sprite2 = new Sprite("magic/spell " + (sid + 1)); //Client.cacheSprite2[sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 0, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 19, 2, INT);
		setBounds(rune1, 14, 35, 3, INT);
		setBounds(rune2, 74, 35, 4, INT);
		setBounds(rune3, 130, 35, 5, INT);
		addRuneText(ID + 5, ra1, r1, TDA);
		setBounds(ID + 5, 26, 66, 6, INT);
		addRuneText(ID + 6, ra2, r2, TDA);
		setBounds(ID + 6, 87, 66, 7, INT);
		addRuneText(ID + 7, ra3, r3, TDA);
		setBounds(ID + 7, 145, 66, 8, INT);
	}
	
	public static void addSpellSmaller(int ID, int r1, int r2, int ra1, int ra2, int rune1,
			int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[3];
		rsInterface.anIntArray212 = new int[3];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = lvl;
		rsInterface.scripts = new int[3][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[3];
		rsInterface.scripts[2][0] = 1;
		rsInterface.scripts[2][1] = 6;
		rsInterface.scripts[2][2] = 0;
		rsInterface.sprite1 = new Sprite("magic/spell " + sid); //Client.cacheSprite2[sid];
		rsInterface.sprite2 = new Sprite("magic/spell " + (sid + 1)); //Client.cacheSprite2[sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(7, INT);
		addLunarSprite(ID + 2, 0, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 19, 2, INT);
		setBounds(rune1, 40, 35, 3, INT);
		setBounds(rune2, 110, 35, 4, INT);
		addRuneText(ID + 5, ra1, r1, TDA);
		setBounds(ID + 5, 53, 66, 5, INT);
		addRuneText(ID + 6, ra2, r2, TDA);
		setBounds(ID + 6, 124, 66, 6, INT);
	}
	
	public static void addLunar2RunesSmallBox(int ID, int r1, int r2, int ra1, int ra2, int rune1, int lvl, String name,
			String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast On";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[3];
		rsInterface.anIntArray212 = new int[3];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = lvl;
		rsInterface.scripts = new int[3][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[3];
		rsInterface.scripts[2][0] = 1;
		rsInterface.scripts[2][1] = 6;
		rsInterface.scripts[2][2] = 0;
		rsInterface.sprite2 = Client.cacheSprite1[LUNAR_ON_SPRITES_START + sid];
		rsInterface.sprite1 = Client.cacheSprite1[LUNAR_OFF_SPRITES_START + sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(7, INT);
		addLunarSprite(ID + 2, 0, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 19, 2, INT);
		setBounds(30016, 37, 35, 3, INT);// Rune
		setBounds(rune1, 112, 35, 4, INT);// Rune
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 50, 66, 5, INT);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 123, 66, 6, INT);

	}

	public static void addLunar3RunesBigBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 6;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite2 = Client.cacheSprite1[LUNAR_ON_SPRITES_START + sid];
		rsInterface.sprite1 = Client.cacheSprite1[LUNAR_OFF_SPRITES_START + sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 1, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 21, 2, INT);
		setBounds(30016, 14, 48, 3, INT);
		setBounds(rune1, 74, 48, 4, INT);
		setBounds(rune2, 130, 48, 5, INT);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 79, 6, INT);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 79, 7, INT);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 79, 8, INT);
	}

	public static void addSpellBig2(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int rune3, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 6;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite1 = Client.cacheSprite2[sid];
		rsInterface.sprite2 = Client.cacheSprite2[sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 1, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 21, 2, INT);
		setBounds(rune1, 14, 48, 3, INT);
		setBounds(rune2, 74, 48, 4, INT);
		setBounds(rune3, 130, 48, 5, INT);
		addRuneText(ID + 5, ra1, r1, TDA);
		setBounds(ID + 5, 26, 79, 6, INT);
		addRuneText(ID + 6, ra2, r2, TDA);
		setBounds(ID + 6, 87, 79, 7, INT);
		addRuneText(ID + 7, ra3, r3, TDA);
		setBounds(ID + 7, 142, 79, 8, INT);
	}

	public static void addLunar3RunesBigBox3(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 6;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite1 = Client.cacheSprite2[sid];
		rsInterface.sprite2 = Client.cacheSprite2[sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 1, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 21, 2, INT);
		setBounds(30016, 14, 48, 3, INT);
		setBounds(rune1, 74, 48, 4, INT);
		setBounds(rune2, 130, 48, 5, INT);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 79, 6, INT);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 79, 7, INT);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 79, 8, INT);
	}

	public Sprite enabledAltSprite;
	public Sprite disabledAltSprite;
	public int[] buttonsToDisable;

	public static void addSettingsSprite(int childId, int spriteId) {
		interfaceCache.put(childId, new RSInterface());
		RSInterface rsi = interfaceCache.get(childId);
		rsi.id = childId;
		rsi.parentID = childId;
		rsi.type = 5;
		rsi.atActionType = 0;
		rsi.contentType = 0;
		rsi.sprite1 = cacheSprite3[spriteId];
		rsi.sprite2 = cacheSprite3[spriteId];
		rsi.width = rsi.sprite1.subWidth;
		rsi.height = rsi.sprite2.subHeight - 2;
	}

	public int spriteOpacity;

	public static void configHoverButton(int id, String tooltip, int sprite2, int sprite1, int enabledAltSprite,
			int disabledAltSprite, boolean active, int... buttonsToDisable) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = OPTION_OK;
		tab.type = TYPE_CONFIG_HOVER;
		tab.sprite2 = Client.cacheSprite3[sprite2];
		tab.sprite1 = Client.cacheSprite3[sprite1];
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.enabledAltSprite = Client.cacheSprite3[enabledAltSprite];
		tab.disabledAltSprite = Client.cacheSprite3[disabledAltSprite];
		tab.buttonsToDisable = buttonsToDisable;
		tab.active = active;
		tab.toggled = active;
		tab.spriteOpacity = 255;
	}
	public static void configHoverButton(int id, String tooltip, String spriteName, int sprite2, int sprite1, int enabledAltSprite, int disabledAltSprite, boolean active, int... buttonsToDisable) {
		RSInterface tab = addInterface(id);
		tab.tooltip = tooltip;
		tab.atActionType = 1;
		tab.type = 11;
		tab.sprite2 = imageLoader(sprite2, spriteName);
		tab.sprite1 = imageLoader(sprite1, spriteName);
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.enabledAltSprite = imageLoader(enabledAltSprite, spriteName);
		tab.disabledAltSprite = imageLoader(disabledAltSprite, spriteName);
		tab.buttonsToDisable = buttonsToDisable;
		tab.active = active;
		tab.toggled = active;
		tab.spriteOpacity = 255;
	}

	public static final int OPTION_OK = 1;
	public boolean active;
	public boolean interfaceHidden;

	private static final int LUNAR_OFF_SPRITES_START = 246;
	private static final int LUNAR_ON_SPRITES_START = 285;
	public static void addLunar3RunesLargeBox0(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 6;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite2 = Client.cacheSprite1[LUNAR_ON_SPRITES_START + sid];
		rsInterface.sprite1 = Client.cacheSprite1[LUNAR_OFF_SPRITES_START + sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 2, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 34, 2, INT);
		setBounds(30016, 14, 61, 3, INT);
		setBounds(rune1, 74, 61, 4, INT);
		setBounds(rune2, 130, 61, 5, INT);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 92, 6, INT);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 92, 7, INT);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 92, 8, INT);
	}

	public static void addLunar3RunesLargeBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 6;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite2 = Client.cacheSprite1[LUNAR_ON_SPRITES_START + sid];
		rsInterface.sprite1 = Client.cacheSprite1[LUNAR_OFF_SPRITES_START + sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 2, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 34, 2, INT);
		setBounds(30016, 14, 61, 3, INT);
		setBounds(rune1, 74, 61, 4, INT);
		setBounds(rune2, 130, 61, 5, INT);
		addRuneText(ID + 5, ra1, r1, TDA);
		setBounds(ID + 5, 26, 92, 6, INT);
		addRuneText(ID + 6, ra2, r2, TDA);
		setBounds(ID + 6, 87, 92, 7, INT);
		addRuneText(ID + 7, ra3, r3, TDA);
		setBounds(ID + 7, 142, 92, 8, INT);
	}
	
	public static void addSpellSmall2_3(int ID, int r1, int r2, int r3, int r4, int ra1, int ra2, int ra3, int ra4, int rune1,
			int rune2, int rune3, int rune4, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[5];
		rsInterface.anIntArray212 = new int[5];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = ra4;
		rsInterface.anIntArray245[4] = 3;
		rsInterface.anIntArray212[4] = lvl;
		rsInterface.scripts = new int[5][];
		rsInterface.scripts[0] = new int[5];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[4];
		rsInterface.scripts[3][0] = 4;
		rsInterface.scripts[3][1] = 3214;
		rsInterface.scripts[3][2] = r4;
		rsInterface.scripts[3][3] = 0;
		rsInterface.scripts[4] = new int[4];
		rsInterface.scripts[4][0] = 1;
		rsInterface.scripts[4][1] = 0;
		rsInterface.scripts[4][2] = 0;
		rsInterface.scripts[4][3] = 0;
		rsInterface.sprite1 = new Sprite("magic/spell " + sid);
		rsInterface.sprite2 = new Sprite("magic/spell " + (sid + 1));
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(11, INT);
		addLunarSprite(ID + 2, 0, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 19, 2, INT);
		setBounds(rune1, 15, 35, 3, INT);
		setBounds(rune2, 55, 35, 4, INT);
		setBounds(rune3, 95, 35, 5, INT);
		setBounds(rune4, 135, 35, 6, INT);
		addRuneText(ID + 5, ra1, r1, TDA);
		setBounds(ID + 5, 29, 66, 7, INT);
		addRuneText(ID + 6, ra2, r2, TDA);
		setBounds(ID + 6, 69, 66, 8, INT);
		addRuneText(ID + 7, ra3, r3, TDA);
		setBounds(ID + 7, 109, 66, 9, INT);
		addRuneText(ID + 8, ra4, r4, TDA);
		setBounds(ID + 8, 149, 66, 10, INT);
	}
	
	public static void addSpellLarge2(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int rune3, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int spellUsableOn, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = spellUsableOn;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = name.contains("Bounty") ? "Cast @gre@Teleport to Bounty Target" : "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 0;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite1 = new Sprite("magic/spell " + sid);
		rsInterface.sprite2 = new Sprite("magic/spell " + (sid + 1));
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 2, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 34, 2, INT);
		setBounds(rune1, 14, 61, 3, INT);
		setBounds(rune2, 74, 61, 4, INT);
		setBounds(rune3, 130, 61, 5, INT);
		addRuneText(ID + 5, ra1, r1, TDA);
		setBounds(ID + 5, 26, 92, 6, INT);
		addRuneText(ID + 6, ra2, r2, TDA);
		setBounds(ID + 6, 87, 92, 7, INT);
		addRuneText(ID + 7, ra3, r3, TDA);
		setBounds(ID + 7, 142, 92, 8, INT);
	}

	public static void addLunar3RunesLargeBox2(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1,
			int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type) {
		RSInterface rsInterface = addInterface(ID);
		rsInterface.id = ID;
		rsInterface.parentID = 1151;
		rsInterface.type = 5;
		rsInterface.atActionType = type;
		rsInterface.contentType = 0;
		rsInterface.mOverInterToTrigger = ID + 1;
		rsInterface.spellUsableOn = suo;
		rsInterface.selectedActionName = "Cast on";
		rsInterface.width = 20;
		rsInterface.height = 20;
		rsInterface.tooltip = "Cast @gre@" + name;
		rsInterface.spellName = name;
		rsInterface.anIntArray245 = new int[4];
		rsInterface.anIntArray212 = new int[4];
		rsInterface.anIntArray245[0] = 3;
		rsInterface.anIntArray212[0] = ra1;
		rsInterface.anIntArray245[1] = 3;
		rsInterface.anIntArray212[1] = ra2;
		rsInterface.anIntArray245[2] = 3;
		rsInterface.anIntArray212[2] = ra3;
		rsInterface.anIntArray245[3] = 3;
		rsInterface.anIntArray212[3] = lvl;
		rsInterface.scripts = new int[4][];
		rsInterface.scripts[0] = new int[4];
		rsInterface.scripts[0][0] = 4;
		rsInterface.scripts[0][1] = 3214;
		rsInterface.scripts[0][2] = r1;
		rsInterface.scripts[0][3] = 0;
		rsInterface.scripts[1] = new int[4];
		rsInterface.scripts[1][0] = 4;
		rsInterface.scripts[1][1] = 3214;
		rsInterface.scripts[1][2] = r2;
		rsInterface.scripts[1][3] = 0;
		rsInterface.scripts[2] = new int[4];
		rsInterface.scripts[2][0] = 4;
		rsInterface.scripts[2][1] = 3214;
		rsInterface.scripts[2][2] = r3;
		rsInterface.scripts[2][3] = 0;
		rsInterface.scripts[3] = new int[3];
		rsInterface.scripts[3][0] = 1;
		rsInterface.scripts[3][1] = 6;
		rsInterface.scripts[3][2] = 0;
		rsInterface.sprite1 = Client.cacheSprite2[sid];
		rsInterface.sprite2 = Client.cacheSprite2[sid];
		RSInterface INT = addInterface(ID + 1);
		INT.isMouseoverTriggered = true;
		INT.mOverInterToTrigger = -1;
		setChildren(9, INT);
		addLunarSprite(ID + 2, 2, "BOX");
		setBounds(ID + 2, 0, 0, 0, INT);
		addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
		setBounds(ID + 3, 90, 4, 1, INT);
		addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
		setBounds(ID + 4, 90, 34, 2, INT);
		setBounds(30016, 14, 61, 3, INT);
		setBounds(rune1, 74, 61, 4, INT);
		setBounds(rune2, 130, 61, 5, INT);
		addRuneText(ID + 5, ra1 + 1, r1, TDA);
		setBounds(ID + 5, 26, 92, 6, INT);
		addRuneText(ID + 6, ra2 + 1, r2, TDA);
		setBounds(ID + 6, 87, 92, 7, INT);
		addRuneText(ID + 7, ra3 + 1, r3, TDA);
		setBounds(ID + 7, 142, 92, 8, INT);
	}

	private static Sprite LoadLunarSprite(int i, String s) {
		Sprite sprite = imageLoader(i, "/Lunar/" + s);
		return sprite;
	}

	public static void addActionButton(int id, int sprite, int sprite2, int width, int height, String s) {
		interfaceCache.put(id, new RSInterface());
		RSInterface rsi = interfaceCache.get(id);
		rsi.sprite1 = CustomSpriteLoader(sprite, "");
		if (sprite2 == sprite)
			rsi.sprite2 = CustomSpriteLoader(sprite, "a");
		else
			rsi.sprite2 = CustomSpriteLoader(sprite2, "");
		rsi.tooltip = s;
		rsi.contentType = 0;
		rsi.atActionType = 1;
		rsi.width = width;
		rsi.mOverInterToTrigger = 52;
		rsi.parentID = id;
		rsi.id = id;
		rsi.type = 5;
		rsi.height = height;
	}

	public static void addButton(int id, int sid, String spriteName, String tooltip, int mOver, int atAction, int width,
			int height) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = atAction;
		tab.contentType = 0;
		tab.opacity = 0;
		tab.mOverInterToTrigger = mOver;
		tab.sprite1 = imageLoader(sid, spriteName);
		tab.sprite2 = imageLoader(sid, spriteName);
		// tab.width = width;
		tab.height = tab.sprite1.subHeight;
		tab.width = tab.sprite1.subWidth;
		tab.tooltip = tooltip;
		tab.inventoryhover = true;
	}

	/**
	 * Draws text from the left instead of the right
	 */
	public static RSInterface addLeftText(int id, int fontIdx, int color, String text) {
		return addText(id, TYPE_TEXT_DRAW_FROM_LEFT, text, defaultTextDrawingAreas, fontIdx, color);
	}

	public static RSInterface addText(int id, int fontIdx, int color, boolean centered, String text) {
		return addText(id, text, defaultTextDrawingAreas, fontIdx, color, centered);
	}

	public static RSInterface addText(int id, int fontIdx, int color, boolean centered, String text, boolean shadow) {
		RSInterface rsInterface = addText(id, text, defaultTextDrawingAreas, fontIdx, color, centered);
		rsInterface.textShadow = shadow;
		return rsInterface;
	}

	public static void addText(int id, String text, TextDrawingArea wid[], int idx, int color) {
		addText(id, TYPE_TEXT, text, wid, idx, color);
	}

	public static RSInterface addText(int id, int type, String text, TextDrawingArea wid[], int idx, int color) {
		RSInterface rsinterface = addTab(id);
		rsinterface.id = id;
		rsinterface.parentID = id;
		rsinterface.type = type;
		rsinterface.atActionType = 0;
		rsinterface.width = 174;
		rsinterface.height = 11;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.centerText = false;
		rsinterface.textShadow = true;
		rsinterface.textDrawingAreas = wid[idx];
		rsinterface.message = text;
		rsinterface.aString228 = "";
		rsinterface.textColor = color;
		rsinterface.secondaryColor = 0;
		rsinterface.anInt216 = 0;
		rsinterface.anInt239 = 0;
		return rsinterface;
	}

	public static void sprite1(int id, int sprite) {
		RSInterface class9 = interfaceCache.get(id);
		class9.sprite1 = CustomSpriteLoader(sprite, "");
	}
	public boolean actionsDisabled = false;
	public static RSInterface addInterface(int id) {
		if (interfaceCache.containsKey(id) && developerMode) {
			//System.err.println("Overwriting interface id: " + id);
		}
		interfaceCache.put(id, new RSInterface());
		RSInterface rsi = interfaceCache.get(id);
		rsi.id = id;
		rsi.parentID = id;
		rsi.width = 512;
		rsi.height = 334;
		return rsi;
	}
	public static RSInterface addFullScreen(int id) {
		if (interfaceCache.containsKey(id) && developerMode) {
			//System.err.println("Overwriting interface id: " + id);
		}
		interfaceCache.put(id, new RSInterface());
		RSInterface rsi = interfaceCache.get(id);
		rsi.id = id;
		rsi.parentID = id;
		rsi.width = 2500;
		rsi.height = 2500;
		return rsi;
	}
	public Consumer<RSInterface> onRender;
	public List<Integer> childrenToMove = new ArrayList<>();
	public boolean expanded = false;
	public static RSInterface addExpandableWidget(int id, int spriteId, int hoverId, String spriteName, String text) {
		interfaceCache.put(id, new RSInterface());
		RSInterface rsi = interfaceCache.get(id);
		rsi.id = id;
		rsi.parentID = id;
		rsi.type = 70;
		rsi.expanded = false;

		rsi.sprite1 = imageLoader(spriteId, spriteName);
		rsi.sprite2 = imageLoader(hoverId, spriteName);
		rsi.width = rsi.sprite1.subWidth;
		rsi.height = rsi.sprite1.subHeight;

		rsi.msgX = (rsi.width / 2) - 25;
		rsi.msgY = (rsi.height / 2) + 4;
		rsi.message = text + " (+)";
		rsi.onRender = (rsinterface) -> {
			if(rsinterface.expanded) {
				rsinterface.message = text + " (-)";
			} else {
				rsinterface.message = text + " (+)";
			}
		};
		rsi.atActionType = 1;
		return rsi;
	}

	public void offsetChildrenPositions(int x, int y) {
		for (int i = 0; i < children.length; i++) {
			childX[i] += x;
			childY[i] += y;
		}
	}

	public static void addHoverText(int id, String text, String tooltip, TextDrawingArea tda[], int idx, int color,
									boolean center, boolean textShadowed, int width, int height) {
		RSInterface rsinterface = addInterface(id);
		rsinterface.id = id;
		rsinterface.parentID = id;
		rsinterface.type = 4;
		rsinterface.atActionType = 1;
		rsinterface.width = width;
		rsinterface.height = height;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.centerText = center;
		rsinterface.textShadow = textShadowed;
		rsinterface.textDrawingAreas = tda[idx];
		rsinterface.message = text;
		rsinterface.aString228 = "";
		rsinterface.textColor = color;
		rsinterface.secondaryColor = 0;
		rsinterface.anInt216 = 0xffffff;
		rsinterface.anInt239 = 0;
		rsinterface.tooltip = tooltip;
	}

	public static void addHoverText(int id, String text, String tooltip, TextDrawingArea tda[], int idx, int color,
			boolean center, boolean textShadowed, int width) {
		RSInterface rsinterface = addInterface(id);
		rsinterface.id = id;
		rsinterface.parentID = id;
		rsinterface.type = 4;
		rsinterface.atActionType = 1;
		rsinterface.width = width;
		rsinterface.height = 11;
		rsinterface.contentType = 0;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = -1;
		rsinterface.centerText = center;
		rsinterface.textShadow = textShadowed;
		rsinterface.textDrawingAreas = tda[idx];
		rsinterface.message = text;
		rsinterface.aString228 = "";
		rsinterface.textColor = color;
		rsinterface.secondaryColor = 0;
		rsinterface.anInt216 = 0xffffff;
		rsinterface.anInt239 = 0;
		rsinterface.tooltip = tooltip;
	}

	public static RSInterface addTab(int i) {
		interfaceCache.put(i, new RSInterface());
		RSInterface rsinterface = interfaceCache.get(i);
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 0;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = 512;
		rsinterface.height = 334;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 0;
		return rsinterface;
	}

	public static void addConfigButton2(int ID, int pID, int bID, int bID2, int width, int height, String tT,
			int configID, int aT, int configFrame) {
		RSInterface Tab = addTabInterface(ID);
		Tab.parentID = pID;
		Tab.id = ID;
		Tab.type = 5;
		Tab.atActionType = aT;
		Tab.contentType = 0;
		Tab.width = width;
		Tab.height = height;
		Tab.opacity = 0;
		Tab.mOverInterToTrigger = -1;
		Tab.anIntArray245 = new int[1];
		Tab.anIntArray212 = new int[1];
		Tab.anIntArray245[0] = 1;
		Tab.anIntArray212[0] = configID;
		Tab.scripts = new int[1][3];
		Tab.scripts[0][0] = 5;
		Tab.scripts[0][1] = configFrame;
		Tab.scripts[0][2] = 0;
		Tab.sprite1 = Client.cacheSprite1[bID];
		Tab.sprite2 = Client.cacheSprite1[bID2];
		Tab.tooltip = tT;
	}

	public static void addConfigButton(int ID, int pID, int bID, int bID2, String bName, int width, int height,
			String tT, int configValueToActivate, int aT, int configId) {
		RSInterface Tab = addTabInterface(ID);
		Tab.parentID = pID;
		Tab.id = ID;
		Tab.type = 5;
		Tab.atActionType = aT;
		Tab.contentType = 0;
		Tab.width = width;
		Tab.height = height;
		Tab.opacity = 0;
		Tab.mOverInterToTrigger = -1;
		Tab.anIntArray245 = new int[1];
		Tab.anIntArray212 = new int[1];
		Tab.anIntArray245[0] = 1;
		Tab.anIntArray212[0] = configValueToActivate;
		Tab.scripts = new int[1][3];
		Tab.scripts[0][0] = 5;
		Tab.scripts[0][1] = configId;
		Tab.scripts[0][2] = 0;
		Tab.sprite1 = imageLoader(bID, bName);
		Tab.sprite2 = imageLoader(bID2, bName);
		Tab.tooltip = tT;
	}

	public static void drawBlackBox(int xPos, int yPos) {
		// /Light Coloured Borders\\\
		Rasterizer2D.drawPixels(71, yPos - 1, xPos - 2, 0x726451, 1); // Left
																		// line
		Rasterizer2D.drawPixels(69, yPos, xPos + 174, 0x726451, 1); // Right line
		Rasterizer2D.drawPixels(1, yPos - 2, xPos - 2, 0x726451, 178); // Top
																		// Line
		Rasterizer2D.drawPixels(1, yPos + 68, xPos, 0x726451, 174); // Bottom
																	// Line

		// /Dark Coloured Borders\\\
		Rasterizer2D.drawPixels(71, yPos - 1, xPos - 1, 0x2E2B23, 1); // Left
																		// line
		Rasterizer2D.drawPixels(71, yPos - 1, xPos + 175, 0x2E2B23, 1); // Right
																		// line
		Rasterizer2D.drawPixels(1, yPos - 1, xPos, 0x2E2B23, 175); // Top line
		Rasterizer2D.drawPixels(1, yPos + 69, xPos, 0x2E2B23, 175); // Top line

		// /Black Box\\\
		Rasterizer2D.method335(0x000000, yPos, 174, 68, 220, xPos); // Yes
																	// method335
																	// is
																	// galkons
																	// opacity
																	// method
	}

	public Sprite disabledHover;

	public static void addPrayer(int i, int configId, int configFrame, int requiredValues, int spriteID,
			String prayerName) {
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = 5608;
		tab.type = 5;
		tab.atActionType = 4;
		tab.contentType = 0;
		tab.opacity = 0;
		tab.mOverInterToTrigger = -1;
		tab.sprite1 = imageLoader(0, "PRAYERGLOW");
		tab.sprite2 = imageLoader(1, "PRAYERGLOW");
		tab.width = 34;
		tab.height = 34;
		tab.anIntArray245 = new int[1];
		tab.anIntArray212 = new int[1];
		tab.anIntArray245[0] = 1;
		tab.anIntArray212[0] = configId;
		tab.scripts = new int[1][3];
		tab.scripts[0][0] = 5;
		tab.scripts[0][1] = configFrame;
		tab.scripts[0][2] = 0;
		if (Client.tabInterfaceIDs[Client.tabID] != 17200) {
			tab.tooltip = "Activate@or1@ " + prayerName;
		}
		RSInterface tab2 = addTabInterface(i + 1);
		tab2.id = i + 1;
		tab2.parentID = 5608;
		tab2.type = 5;
		tab2.atActionType = 0;
		tab2.contentType = 0;
		tab2.opacity = 0;
		tab2.mOverInterToTrigger = -1;
		tab2.sprite1 = imageLoader(spriteID, "Prayer/PRAYON");
		tab2.sprite2 = imageLoader(spriteID, "Prayer/PRAYOFF");
		tab2.width = 34;
		tab2.height = 34;
		tab2.anIntArray245 = new int[1];
		tab2.anIntArray212 = new int[1];
		tab2.anIntArray245[0] = 2;
		tab2.anIntArray212[0] = requiredValues;
		tab2.scripts = new int[1][3];
		tab2.scripts[0][0] = 2;
		tab2.scripts[0][1] = 5;
		tab2.scripts[0][2] = 0;
	}

	public static void removeSomething(int id) {
		interfaceCache.put(id, new RSInterface());
	}

	public static void setBounds(int ID, int X, int Y, int frame, RSInterface RSinterface) {
		RSinterface.children[frame] = ID;
		RSinterface.childX[frame] = X;
		RSinterface.childY[frame] = Y;

		childEvents.add(new WidgetChildEvent(ID, X, Y));
	}

	public static void textSize(int id, TextDrawingArea tda[], int idx) {
		RSInterface rsi = interfaceCache.get(id);
		rsi.textDrawingAreas = tda[idx];
	}

	public static void addChar(int ID) {
		interfaceCache.put(ID, new RSInterface());
		RSInterface t = interfaceCache.get(ID);
		t.id = ID;
		t.parentID = ID;
		t.type = 6;
		t.atActionType = 0;
		t.contentType = 328;
		t.width = 136;
		t.height = 168;
		t.opacity = 0;
		t.modelZoom = 580;
		t.modelRotation1 = 150;
		t.modelRotation2 = 0;
		t.disabledAnimationId = -1;
		t.enabledAnimationId = -1;
	}

	public static void addChar(int ID, int zoom) {
		interfaceCache.put(ID, new RSInterface());
		RSInterface t = interfaceCache.get(ID);
		t.id = ID;
		t.parentID = ID;
		t.type = 6;
		t.atActionType = 0;
		t.contentType = 328;
		t.width = 136;
		t.height = 168;
		t.opacity = 0;
		t.modelZoom = zoom;
		t.modelRotation1 = 150;
		t.modelRotation2 = 0;
		t.disabledAnimationId = -1;
		t.enabledAnimationId = -1;
	}

	public static void addTransparentSprite3(int id, int spriteId, String spriteName, int opacity) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.transparency = opacity;
		tab.hoverType = 52;
		tab.sprite1 = imageLoader(spriteId, spriteName);
		tab.sprite2 = imageLoader(spriteId, spriteName);
		tab.width = 512;
		tab.height = 334;
		tab.drawsTransparent = true;
	}
	public static RSInterface addBox(int id, int width, int height, int border, int borderColor, int color, int transparency) {
		RSInterface tab = RSInterface.addTabInterface(id);
		tab.parentID = id;
		tab.id = id;
		tab.type = 24;
		tab.width = width;
		tab.height = height;
		tab.borderWidth = border;
		tab.borderColor = borderColor;
		tab.secondaryColor = color;
		tab.fillColor = color;
		tab.transparency = transparency;
		return tab;
	}
	public static void addBox(int id, int byte1, boolean filled, int color, String text) {
		RSInterface Interface = addInterface(id);
		Interface.id = id;
		Interface.parentID = id;
		Interface.type = 9;
		Interface.opacity = (byte) byte1;
		Interface.filled = filled;
		Interface.mOverInterToTrigger = -1;
		Interface.atActionType = 0;
		Interface.contentType = 0;
		Interface.textColor = color;
		Interface.message = text;
	}

	public static void setChildren(int total, RSInterface i) {
		i.children = new int[total];
		i.childX = new int[total];
		i.childY = new int[total];
	}

	public static boolean deleteChild(int childInterfaceId, RSInterface i) {
		for (int index = 0; index < i.children.length; index++) {
			if (i.children[index] == childInterfaceId) {
				int[] newChildren = new int[i.children.length - 1];
				int[] newChildX = new int[i.children.length - 1];
				int[] newChildY = new int[i.children.length - 1];
				int newChildrenIndex = 0;
				for (int copyIndex = 0; copyIndex < i.children.length; copyIndex++) {
					if (copyIndex != index) {
						newChildren[newChildrenIndex] = i.children[copyIndex];
						newChildX[newChildrenIndex] = i.childX[copyIndex];
						newChildY[newChildrenIndex] = i.childY[copyIndex];
					}
				}

				i.children = newChildren;
				i.childX = newChildX;
				i.childY = newChildY;
				return true;
			}
		}

		return false;
	}

	public static int expandChildren(int amount, RSInterface i) {
		int writeIndex = i.children == null ? 0 : i.children.length;
		int[] newChildren = new int[writeIndex + amount];
		int[] newChildX = new int[writeIndex + amount];
		int[] newChildY = new int[writeIndex + amount];
		if (i.children != null) {
			System.arraycopy(i.children, 0, newChildren, 0, i.children.length);
			System.arraycopy(i.childX, 0, newChildX, 0, i.childX.length);
			System.arraycopy(i.childY, 0, newChildY, 0, i.childY.length);
		}
		i.children = newChildren;
		i.childX = newChildX;
		i.childY = newChildY;
		return writeIndex;
	}

	public void reverseChildren() {
		int[] newChildren = new int[children.length];
		int[] newChildX = new int[children.length];
		int[] newChildY = new int[children.length];
		int index = 0;
		for (int i = children.length - 1; i >= 0; i--) {
			newChildren[i] = children[index];
			newChildX[i] = childX[index];
			newChildY[i] = childY[index];
			index++;
		}
		children = newChildren;
		childX = newChildX;
		childY = newChildY;
	}

	public static int getIndexOfChild(RSInterface i, int childInterfaceId) {
		for (int index = 0; index < i.children.length; index++) {
			if (i.children[index] == childInterfaceId) {
				return index;
			}
		}
		throw new IllegalArgumentException("No child " + childInterfaceId + " in " + i.id);
	}

	protected static Sprite CustomSpriteLoader(int id, String s) {
		long l = (StringUtils.method585(s) << 8) + id;
		Sprite sprite = (Sprite) aMRUNodes_238.get(l);
		if (sprite != null) {
			return sprite;
		}
		try {
			sprite = new Sprite("Attack/" + id + s);
			aMRUNodes_238.put(sprite, l);
		} catch (Exception exception) {
			return null;
		}
		return sprite;
	}


	public static void addTooltipBox(int id, String text) {
		RSInterface rsi = addInterface(id);
		rsi.id = id;
		rsi.parentID = id;
		rsi.type = 9;
		rsi.message = text;
	}

	public static void addTooltip(int id, String text) {
		RSInterface rsi = addInterface(id);
		rsi.id = id;
		rsi.type = 0;
		rsi.isMouseoverTriggered = true;
		rsi.mOverInterToTrigger = -1;
		addTooltipBox(id + 1, text);
		rsi.totalChildren(1);
		rsi.child(0, id + 1, 0, 0);
	}
	public int widgetChildIndex = -1;
	public static void addText(int i, String s, int k, boolean l, boolean m, int a, TextDrawingArea[] TDA, int j) {
		RSInterface RSInterface = addInterface(i);
		RSInterface.parentID = i;
		RSInterface.id = i;
		RSInterface.type = 4;
		RSInterface.atActionType = 0;
		RSInterface.width = 0;
		RSInterface.height = 0;
		RSInterface.contentType = 0;
		RSInterface.opacity = 0;
		RSInterface.mOverInterToTrigger = a;
		RSInterface.centerText = l;
		RSInterface.textShadow = m;
		RSInterface.textDrawingAreas = TDA[j];
		RSInterface.message = s;
		RSInterface.aString228 = "";
		RSInterface.textColor = k;
	}

	public static void addSpriteTransparent(int i, Sprite sprite, int trans) {
		interfaceCache.put(i, new RSInterface());
		RSInterface rsinterface = interfaceCache.get(i);
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = sprite.subWidth;
		rsinterface.height = sprite.subHeight;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.sprite1 = sprite;
		rsinterface.sprite2 = sprite;
		rsinterface.drawsTransparent = true;
		rsinterface.transparency = trans;
	}

	public static RSInterface addSprite(int i, Sprite sprite) {
		interfaceCache.put(i, new RSInterface());
		RSInterface rsinterface = interfaceCache.get(i);
		rsinterface.id = i;
		rsinterface.parentID = i;
		rsinterface.type = 5;
		rsinterface.atActionType = 0;
		rsinterface.contentType = 0;
		rsinterface.width = sprite.subWidth;
		rsinterface.height = sprite.subHeight;
		rsinterface.opacity = 0;
		rsinterface.mOverInterToTrigger = 52;
		rsinterface.sprite1 = sprite;
		rsinterface.sprite2 = sprite;
		return rsinterface;
	}

	public void drawAdvancedSprite() {
		drawsTransparent = true;
		transparency = 100;
	}

	public static void addHover(int i, int aT, int cT, int hoverid, int sId, String NAME, int W, int H, String tip) {
		RSInterface rsinterfaceHover = addInterface(i);
		rsinterfaceHover.id = i;
		rsinterfaceHover.parentID = i;
		rsinterfaceHover.type = 5;
		rsinterfaceHover.atActionType = aT;
		rsinterfaceHover.contentType = cT;
		rsinterfaceHover.mOverInterToTrigger = hoverid;
		rsinterfaceHover.sprite1 = imageLoader(sId, NAME);
		rsinterfaceHover.sprite2 = imageLoader(sId, NAME);
		rsinterfaceHover.width = W;
		rsinterfaceHover.height = H;
		rsinterfaceHover.tooltip = tip;
	}

	public static void addHovered(int i, int j, String imageName, int w, int h, int IMAGEID) {
		RSInterface rsinterfaceHover = addInterface(i);
		rsinterfaceHover.parentID = i;
		rsinterfaceHover.id = i;
		rsinterfaceHover.type = 0;
		rsinterfaceHover.atActionType = 0;
		rsinterfaceHover.width = w;
		rsinterfaceHover.height = h;
		rsinterfaceHover.isMouseoverTriggered = true;
		rsinterfaceHover.mOverInterToTrigger = -1;
		addSprite(IMAGEID, j, imageName);
		setChildren(1, rsinterfaceHover);
		setBounds(IMAGEID, 0, 0, 0, rsinterfaceHover);
	}

	public static void addNewLeftText(int id, String text, int fontIndex, int color, boolean center, boolean shadow) {
		addNewText(id, TYPE_TEXT_DRAW_FROM_LEFT, text, fontIndex, color, center, shadow);
	}

	public static void addNewText(int id, String text, int fontIndex, int color, boolean center, boolean shadow) {
		addNewText(id, 4, text, fontIndex, color, center, shadow);
	}

	public static void addNewText(int id, int type, String text, int fontIndex, int color, boolean center, boolean shadow) {
		RSInterface tab = addTabInterface(id);
		tab.parentID = id;
		tab.id = id;
		tab.type = type;
		tab.atActionType = 0;
		tab.width = 0;
		tab.height = 11;
		tab.contentType = 0;
		tab.opacity = 0;
		tab.mOverInterToTrigger = -1;
		tab.centerText = center;
		tab.textShadow = shadow;
		tab.textDrawingAreas = defaultTextDrawingAreas[fontIndex];
		tab.message = text;
		tab.aString228 = "";
		tab.textColor = color;
		tab.secondaryColor = 0;
		tab.anInt216 = 0;
		tab.anInt239 = 0;
	}
	public boolean wrapText = false;
	public static RSInterface addText(int id, String text, TextDrawingArea tda[], int idx, int color, boolean centered) {
		interfaceCache.put(id, new RSInterface());
		RSInterface rsi = interfaceCache.get(id);
		if (centered)
			rsi.centerText = true;
		rsi.textShadow = true;
		rsi.textDrawingAreas = tda[idx];
		rsi.message = text;
		rsi.textColor = color;
		rsi.id = id;
		rsi.type = 4;
		return rsi;
	}

	public static void addText(int id, String text, int idx, int color, boolean center, boolean shadow) {
		RSInterface tab = addTabInterface(id);
		tab.parentID = id;
		tab.id = id;
		tab.type = 4;
		tab.atActionType = 0;
		tab.width = 0;
		tab.height = 11;
		tab.contentType = 0;
		tab.opacity = 0;
		tab.mOverInterToTrigger = -1;
		tab.centerText = center;
		tab.textShadow = shadow;
		tab.textDrawingAreas = defaultTextDrawingAreas[idx];
		tab.message = text;
		tab.aString228 = "";
		tab.textColor = color;
		tab.secondaryColor = 0;
		tab.anInt216 = 0;
		tab.anInt239 = 0;
	}

	public static void addText(int id, String text, TextDrawingArea tda[], int idx, int color, boolean center,
			boolean shadow) {
		RSInterface tab = addTabInterface(id);
		tab.parentID = id;
		tab.id = id;
		tab.type = 4;
		tab.atActionType = 0;
		tab.width = 0;
		tab.height = 11;
		tab.contentType = 0;
		tab.opacity = 0;
		tab.mOverInterToTrigger = -1;
		tab.centerText = center;
		tab.textShadow = shadow;
		tab.textDrawingAreas = tda[idx];
		tab.message = text;
		tab.aString228 = "";
		tab.textColor = color;
		tab.secondaryColor = 0;
		tab.anInt216 = 0;
		tab.anInt239 = 0;
	}
	public static void addRectangle(int id, int width, int height, int colour, int alpha, boolean filled) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.textColor = colour;
		tab.secondaryColor = colour;
		tab.filled = filled;
		tab.id = id;
		tab.parentID = id;
		tab.type = 3;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) alpha;
		tab.width = width;
		tab.height = height;
	}

	public int scrollableContainerInterfaceId;
	public RSFont font;
	public List<String> stringContainer;
	public int stringContainerContainerExtraScroll = 0;

	public static RSInterface addStringContainer(int interfaceId, int scrollableContainerInterfaceId, RSFont font,
												 boolean centerText, int textColor, boolean textShadow, int stringPadY, String defaultMessage) {
		RSInterface tab = addTabInterface(interfaceId);
		tab.type = TYPE_STRING_CONTAINER;
		tab.parentID = interfaceId;
		tab.id = interfaceId;
		tab.scrollableContainerInterfaceId = scrollableContainerInterfaceId;
		tab.font = font;
		tab.centerText = centerText;
		tab.invSpritePadY = stringPadY;
		tab.anInt216 = 0;
		tab.anInt239 = 0;
		tab.mOverInterToTrigger = -1;
		tab.aString228 = "";
		tab.textColor = textColor;
		tab.textShadow = textShadow;
		tab.stringContainer = new ArrayList<>();
		if (defaultMessage != null && defaultMessage.length() > 0) {
			for (int index = 0; index < 100; index++) {
				tab.stringContainer.add(defaultMessage + " " + index);
			}
		}
		return tab;
	}

	public static RSInterface addHorizontalStringContainer(int interfaceId, int width, int invSpritePadX, int invSpritePadY,
														   RSFont font, boolean centerText, boolean shadow, int textColor, String defaultMessage) {
		RSInterface tab = addTabInterface(interfaceId);
		tab.textShadow = shadow;
		tab.width = width;
		tab.invSpritePadX = invSpritePadX;
		tab.invSpritePadY = invSpritePadY;
		tab.type = TYPE_HORIZONTAL_STRING_CONTAINER;
		tab.parentID = interfaceId;
		tab.id = interfaceId;
		tab.font = font;
		tab.centerText = centerText;
		tab.anInt216 = 0;
		tab.anInt239 = 0;
		tab.mOverInterToTrigger = -1;
		tab.aString228 = "";
		tab.textColor = textColor;
		tab.stringContainer = new ArrayList<>();
		if (defaultMessage != null) {
			for (int index = 0; index < 100; index++) {
				tab.stringContainer.add(defaultMessage + " " + index);
			}
		}
		return tab;
	}

	public String hoverText;
	public int opacity;
	public int hoverType;
	public static void addHoverBox(int id, String text) {
		RSInterface rsi = interfaceCache.get(id);
		rsi.id = id;
		rsi.parentID = id;
		rsi.isMouseoverTriggered = true;
		rsi.type = 8;
		rsi.hoverText = text;
	}

	public static void configHoverButton1(int id, String tooltip, String spriteName, int sprite2, int sprite1, int enabledAltSprite,
										  int disabledAltSprite, boolean active, int... buttonsToDisable) {

		RSInterface tab = addInterface(id);

		tab.tooltip = tooltip;
		tab.atActionType = OPTION_OK;
		tab.type = TYPE_CONFIG_HOVER;
		tab.sprite2 = imageLoader(sprite2, spriteName);
		tab.sprite1 = imageLoader(sprite1, spriteName);
		tab.width = tab.sprite2.subWidth;
		tab.height = tab.sprite1.subHeight;
		tab.enabledAltSprite = imageLoader(enabledAltSprite, spriteName);
		tab.disabledAltSprite = imageLoader(disabledAltSprite, spriteName);
		tab.buttonsToDisable = buttonsToDisable;
		tab.active = active;
		tab.toggled = active;
		tab.spriteOpacity = 255;
	}
	public static void addButton(int id, int sid, String spriteName, String tooltip) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 1;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = 52;
		tab.sprite1 = imageLoader(sid, spriteName);
		tab.sprite2 = imageLoader(sid, spriteName);
		tab.width = tab.sprite1.subWidth;
		tab.height = tab.sprite2.subHeight;
		tab.tooltip = tooltip;
	}

	public static void addButton(int id, int spriteId, String spriteName, String tooltip, int actionType,
			int mouseOverTrigger) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = actionType;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = mouseOverTrigger;
		tab.sprite1 = imageLoader(spriteId, spriteName);
		tab.sprite2 = imageLoader(spriteId, spriteName);
		tab.width = tab.sprite1.subWidth;
		tab.height = tab.sprite2.subHeight;
		tab.tooltip = tooltip;
	}

	public static void addHoverBox(int id, int ParentID, String text, String text2, int configId, int configFrame) {
		RSInterface rsi = addTabInterface(id);
		rsi.id = id;
		rsi.parentID = ParentID;
		rsi.type = 8;
		rsi.aString228 = text;
		rsi.message = text2;
		rsi.anIntArray245 = new int[1];
		rsi.anIntArray212 = new int[1];
		rsi.anIntArray245[0] = 1;
		rsi.anIntArray212[0] = configId;
		rsi.scripts = new int[1][3];
		rsi.scripts[0][0] = 5;
		rsi.scripts[0][1] = configFrame;
		rsi.scripts[0][2] = 0;
	}

	public static void addSprite(int ID, int i, int i2, String name, int configId, int configFrame) {
		RSInterface Tab = addTabInterface(ID);
		Tab.id = ID;
		Tab.parentID = ID;
		Tab.type = 5;
		Tab.atActionType = 0;
		Tab.contentType = 0;
		Tab.width = 512;
		Tab.height = 334;
		Tab.opacity = (byte) 0;
		Tab.anIntArray245 = new int[1];
		Tab.anIntArray212 = new int[1];
		Tab.anIntArray245[0] = 1;
		Tab.anIntArray212[0] = configId;
		Tab.scripts = new int[1][3];
		Tab.scripts[0][0] = 5;
		Tab.scripts[0][1] = configFrame;
		Tab.scripts[0][2] = 0;
		Tab.sprite1 = imageLoader(i, name);
		Tab.sprite2 = imageLoader(i2, name);
	}

	public static void addConfigSprite(int id, Sprite sprite1, Sprite sprite2, int configFrame, int configId) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.sprite1 = sprite1;
		tab.sprite2 = sprite2;
		tab.width = 512;
		tab.height = 334;
		tab.anIntArray245 = new int[1];
		tab.anIntArray212 = new int[1];
		tab.anIntArray245[0] = 1;
		tab.anIntArray212[0] = configFrame;
		tab.scripts = new int[1][3];
		tab.scripts[0][0] = 5;
		tab.scripts[0][1] = configId;
		tab.scripts[0][2] = 0;
	}

	public static void addConfigSprite(int id, int spriteId, String spriteName, int spriteId2, String spriteName2, int configFrame, int configId) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.sprite1 = imageLoader(spriteId, spriteName);
		tab.sprite2 = imageLoader(spriteId2, spriteName2);
		tab.width = 512;
		tab.height = 334;
		tab.anIntArray245 = new int[1];
		tab.anIntArray212 = new int[1];
		tab.anIntArray245[0] = 1;
		tab.anIntArray212[0] = configFrame;
		tab.scripts = new int[1][3];
		tab.scripts[0][0] = 5;
		tab.scripts[0][1] = configId;
		tab.scripts[0][2] = 0;
	}
	public Sprite[] extraInterfaceSprites;
	public Sprite[] originalInterfaceSprites;
	public static void setExtraImageForInterface(int interfaceId, int imageId, String imageLocation) {
		RSInterface originalInterface = interfaceCache.get(interfaceId);
		if (originalInterface != null && originalInterface.originalInterfaceSprites == null) {
			originalInterface.originalInterfaceSprites = new Sprite[50];
			originalInterface.extraInterfaceSprites = new Sprite[50];
		}
		if (originalInterface != null &&
				originalInterface.originalInterfaceSprites[0] == null) {
			originalInterface.originalInterfaceSprites[0] = originalInterface.sprite1;
			originalInterface.originalInterfaceSprites[1] = originalInterface.sprite2;
		}
		assert originalInterface != null;
		originalInterface.extraInterfaceSprites[imageId] = imageLoader(imageId, imageLocation);
	}
	public static void addSprite(int id, int spriteId, String spriteName) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;
		tab.parentID = id;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = -1;
		tab.sprite1 = imageLoader(spriteId, spriteName);
		tab.sprite2 = imageLoader(spriteId, spriteName);
		tab.width = 512;
		tab.height = 334;
	}

	public static void addAnimatedSprite(int childId, String spriteLocation) {
		interfaceCache.put(childId, new RSInterface());
		RSInterface tab = interfaceCache.get(childId);
		tab.id = childId;
		tab.parentID = childId;
		tab.type = 91;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.gifLocation = spriteLocation;
	}
	public static void addHoverButton(int i, String imageName, int j, int width, int height, String text,
			int contentType, int hoverOver, int aT) {// hoverable button
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = i;
		tab.type = 5;
		tab.atActionType = aT;
		tab.contentType = contentType;
		tab.opacity = 0;
		tab.mOverInterToTrigger = hoverOver;
		tab.sprite1 = imageLoader(j, imageName);
		tab.sprite2 = imageLoader(j, imageName);
		tab.width = width;
		tab.height = height;
		tab.tooltip = text;
	}

	public static void addHoveredButton2(int i, String imageName, int j, int w, int h, int IMAGEID) {
		RSInterface tab = addTabInterface(i);
		tab.parentID = i;
		tab.id = i;
		tab.type = 0;
		tab.atActionType = 0;
		tab.width = w;
		tab.height = h;
		tab.isMouseoverTriggered = true;
		tab.hoverType = -1;
		tab.scrollMax = 0;
		addHoverImage(IMAGEID, j, j, imageName);
		tab.totalChildren(1);
		tab.child(0, IMAGEID, 0, 0);
	}

	public static void addHoveredButton(int i, String imageName, int j, int w, int h, int IMAGEID) {// hoverable button
		RSInterface tab = addTabInterface(i);
		tab.parentID = i;
		tab.id = i;
		tab.type = 0;
		tab.atActionType = 0;
		tab.width = w;
		tab.height = h;
		tab.isMouseoverTriggered = true;
		tab.opacity = 0;
		tab.mOverInterToTrigger = -1;
		tab.scrollMax = 0;
		addHoverImage(IMAGEID, j, j, imageName);
		tab.totalChildren(1);
		tab.child(0, IMAGEID, 0, 0);
	}

	public static void addHoverImage(int i, int j, int k, String name) {
		RSInterface tab = addTabInterface(i);
		tab.id = i;
		tab.parentID = i;
		tab.type = 5;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.width = 512;
		tab.height = 334;
		tab.opacity = 0;
		tab.mOverInterToTrigger = 52;
		tab.sprite1 = imageLoader(j, name);
		tab.sprite2 = imageLoader(k, name);
	}

	public static RSInterface addTabInterface(int id) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;// 250
		tab.parentID = id;// 236
		tab.type = 0;// 262
		tab.atActionType = 0;// 217
		tab.contentType = 0;
		tab.width = 512;// 220
		tab.height = 700;// 267
		tab.opacity = (byte) 0;
		tab.mOverInterToTrigger = -1;// Int 230
		return tab;
	}

	public void setSprite(String URL, int width, int height) {
		java.net.URL url = null;
		try {
			url = new URL(URL);

			Sprite sprite = new Sprite(url);

			if(width > 0 && height > 0) {
				sprite = sprite.resizeSprite(width, height);
			}
			sprite1 = sprite;
			sprite2 = sprite;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static Sprite imageLoader(int i, String s) {
		long l = (StringUtils.method585(s) << 8) + i;
		Sprite sprite = (Sprite) aMRUNodes_238.get(l);
		if (sprite != null)
			return sprite;
		try {
			if(s.startsWith("/"))
				s = s.substring(1);
			sprite = new Sprite(s + " " + i);
			while(sprite.pixels == null && SpriteCache.widgetSpriteExists(s + " " + i)) {
				System.out.println("Sprite ["+  s + " " + i + "] loading");
				sprite = new Sprite(s + " " + i);
			}
			sprite.spriteName = i + "-" + s;
			aMRUNodes_238.put(sprite, l);
		} catch (Exception exception) {
			return null;
		}
		return sprite;
	}

	public void child2(int id, int interID, int x, int y) {
		children[id] = interID;
		childX[id] = x + 4;
		childY[id] = y + 2;
		try {
			if (childEvents == null) {
				childEvents = new LinkedList<>();
				childEvents.add(new WidgetChildEvent(interID, x, y));
				processChildEvents();
				childEvents = null;
			}
			childEvents.add(new WidgetChildEvent(interID, x, y));
		} catch (Exception e) {

		}
	}
	public void child(int interID, int x, int y) {
		if (children == null || childX == null || childY == null) {
			children = new int[1];
			childX = new int[1];
			childY = new int[1];
		}
		int id = children.length;
		resizeArrays(id + 1);
		children[id] = interID;
		childX[id] = x;
		childY[id] = y;
		try {
			if (childEvents == null) {
				childEvents = new LinkedList<>();
				childEvents.add(new WidgetChildEvent(interID, x, y));
				processChildEvents();
				childEvents = null;
			}
			childEvents.add(new WidgetChildEvent(interID, x, y));
		} catch (Exception e) {

		}
	}

	public void petDuelChild(int interID, int x, int y) {
		if (children == null || childX == null || childY == null) {
			children = new int[1];
			childX = new int[1];
			childY = new int[1];
		}
		int id = children.length;
		resizeArrays(id + 1);
		children[id] = interID;
		childX[id] = x;
		childY[id] = y;
		get(interID).widgetChildIndex = id;
		get(interID).setOriginalX(x);
		get(interID).setOriginalY(y);
	}

	protected void resizeArrays(int newSize) {
		int[] newChildren = new int[newSize];
		int[] newChildX = new int[newSize];
		int[] newChildY = new int[newSize];

		System.arraycopy(children, 0, newChildren, 0, children.length);
		System.arraycopy(childX, 0, newChildX, 0, childX.length);
		System.arraycopy(childY, 0, newChildY, 0, childY.length);

		children = newChildren;
		childX = newChildX;
		childY = newChildY;
	}

	public void child(int id, int interID, int x, int y) {
		if (children == null || childX == null || childY == null) {
			children = new int[1];
			childX = new int[1];
			childY = new int[1];
		}
		if (id >= children.length) {
			resizeArrays(id + 1);
		}
		children[id] = interID;
		childX[id] = x;
		childY[id] = y;
		try {
			if (childEvents == null) {
				childEvents = new LinkedList<>();
				childEvents.add(new WidgetChildEvent(interID, x, y));
				processChildEvents();
				childEvents = null;
			}
			childEvents.add(new WidgetChildEvent(interID, x, y));
		} catch (Exception e) {

		}
	}



	public void totalChildren(int t) {
		children = new int[t];
		childX = new int[t];
		childY = new int[t];
	}

	private Model method206(int i, int j) {
		Model model = (Model) aMRUNodes_264.get((i << 16) + j);
		if (model != null)
			return model;
		if (i == 1)
			model = Model.getModel(j);
		if (i == 2)
			model = NpcDefinition.lookup(j).method160();
		if (i == 3)
			model = Client.localPlayer.method453();
		if (i == 4)
			model = ItemDefinition.lookup(j).getUnshadedModel(50);
		if (i == 5)
			model = null;
		if (model != null)
			aMRUNodes_264.put(model, (i << 16) + j);
		return model;
	}

	private static Sprite method207(int i, FileArchive streamLoader, String s) {
		long l = (StringUtils.method585(s) << 8) + (long) i;
		Sprite sprite = (Sprite) aMRUNodes_238.get(l);
		if (sprite != null) {
			sprite.spriteName = i + "-" + s;
			return sprite;
		}
		try {
			sprite = new Sprite(streamLoader, s, i);
			aMRUNodes_238.put(sprite, l);
		} catch (Exception _ex) {
			return null;
		}
		return sprite;
	}


	public static void method208(boolean flag, Model model) {
		int i = 0;// was parameter
		int j = 5;// was parameter
		if (flag)
			return;
		aMRUNodes_264.clear();
		if (model != null && j != 4)
			aMRUNodes_264.put(model, (j << 16) + i);
	}

	public Model method209(int j, int k, boolean flag) {
		Model model;
		if (flag)
			model = method206(anInt255, anInt256);
		else
			model = method206(anInt233, mediaID);
		if (model == null)
			return null;
		if (k == -1 && j == -1 && model.colors == null)
			return model;
		Model model_1 = new Model(true, SeqFrame.noAnimationInProgress(k) & SeqFrame.noAnimationInProgress(j), false, model);
		if (k != -1 || j != -1)
			model_1.prepareSkeleton();
		if (k != -1)
			model_1.interpolate(k);
		if (j != -1)
			model_1.interpolate(j);
		model_1.light(64, 768, -50, -10, -50, true);
		return model_1;
	}

	public RSInterface() {
	}

	public void setNewButtonClicking() {
		if (children != null) {
			for (int child : children) {
				RSInterface childInterface = interfaceCache.get(child);
				if (childInterface != null) {
					childInterface.newButtonClicking = true;
					childInterface.setNewButtonClicking();
				}
			}
		}
	}

	public static RSInterface get(int interfaceId) {
		if(interfaceCache == null || interfaceId < 0 && interfaceId >= interfaceCache.size() || !interfaceCache.containsKey(interfaceId))
			return null;
		return interfaceCache.get(interfaceId);
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setRenderParentId(int parentId) {

	}

	@Override
	public void setRenderX(int x) {

	}

	@Override
	public void setRenderY(int y) {

	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public void setType(int type) {
		this.type = type;
	}

	@Override
	public int getContentType() {
		return atActionType;
	}

	@Override
	public void setContentType(int contentType) {
		this.atActionType = contentType;
	}

	@Override
	public int getClickMask() {
		return 0;
	}

	@Override
	public void setClickMask(int mask) {

	}

	@Override
	public Widget getParent() {
		return interfaceCache.get(parentID);
	}

	@Override
	public int getParentId() {
		return parentID;
	}

	public RSInterface getChild(int childId) {
		if(children == null)
			return null;
		if(childId >= children.length)
			return null;
		return get(children[childId]);
	}

	@Nullable
	@Override
	public Widget[] getChildren() {
		if(children == null) {
			children = new int[0];
			childX = new int[0];
			childY = new int[0];
		}
		return null;
	}

	@Override
	public void setChildren(Widget[] children) {
		this.children = new int[children.length];
		this.childX = new int[children.length];
		this.childY = new int[children.length];
		for(int i = 0; i < children.length; i++) {
			this.children[i] = children[i].getId();
			this.childX[i] = children[i].getOriginalX();
			this.childY[i] = children[i].getOriginalY();
		}
	}

	@Override
	public Widget[] getDynamicChildren() {
		return new Widget[0];
	}

	@Override
	public Widget[] getStaticChildren() {
		return new Widget[0];
	}

	@Override
	public Widget[] getNestedChildren() {
		return new Widget[0];
	}

	@Override
	public int getRelativeX() {
		return relativeX;
	}
	public int relativeX = 0, relativeY = 0;
	@Override
	public void setRelativeX(int x) {
		relativeX = x;
	}

	@Override
	public int getRelativeY() {
		return relativeY;
	}

	@Override
	public void setRelativeY(int y) {
		relativeY= y;
	}

	@Override
	public String getText() {
		return message;
	}

	@Override
	public void setText(String text) {
		this.message = text;
	}

	@Override
	public int getTextColor() {
		return textColor;
	}

	@Override
	public void setTextColor(int textColor) {
		this.textColor = textColor;
	}

	@Override
	public int getOpacity() {
		return 0;
	}

	@Override
	public void setOpacity(int transparency) {

	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setName(String name) {

	}

	@Override
	public int getModelId() {
		return 0;
	}

	@Override
	public void setModelId(int id) {

	}

	@Override
	public int getModelType() {
		return 0;
	}

	@Override
	public void setModelType(int type) {

	}

	@Override
	public int getAnimationId() {
		return 0;
	}

	@Override
	public void setAnimationId(int animationId) {

	}

	@Override
	public int getRotationX() {
		return 0;
	}

	@Override
	public void setRotationX(int modelX) {

	}

	@Override
	public int getRotationY() {
		return 0;
	}

	@Override
	public void setRotationY(int modelY) {

	}

	@Override
	public int getRotationZ() {
		return 0;
	}

	@Override
	public void setRotationZ(int modelZ) {

	}

	@Override
	public int getModelZoom() {
		return 0;
	}

	@Override
	public void setModelZoom(int modelZoom) {

	}

	@Override
	public int getSpriteId() {
		return 0;
	}

	@Override
	public boolean getSpriteTiling() {
		return false;
	}

	@Override
	public void setSpriteTiling(boolean tiling) {

	}

	@Override
	public void setSpriteId(int spriteId) {

	}

	@Override
	public boolean isHidden() {
		return interfaceHidden;
	}

	@Override
	public boolean isSelfHidden() {
		return false;
	}

	@Override
	public void setHidden(boolean hidden) {
		this.interfaceHidden = hidden;
	}

	@Override
	public int getIndex() {
		return 0;
	}

	public int x, y;
	@Override
	public net.runelite.api.Point getCanvasLocation() {
		int x = this.x;
		int y = this.y;
		if(getId() == 3213 || getId() == 3214) {
			x += Client.instance.isResized() ? Client.instance.getCanvasWidth() - 197 - (Client.instance.stackTabs() ? 16 : 8) : 31 + 516;
			y += Client.instance.isResized() ? Client.canvasHeight - 275 - (Client.instance.stackTabs() ? 42 : 77) : 37 + 168;
		}
		if(getId() == 3214) {
			int childIndex = -1;
			RSInterface parent = interfaceCache.get(parentID);
			for (int i = 0; i < parent.children.length; i++) {
				if (parent.children[i] == getId()) {
					childIndex = i;
				}
			}
			if (childIndex != -1) {
				x += parent.childX[childIndex];
				y += parent.childY[childIndex];
			}
		}
		return new net.runelite.api.Point(x, y);
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public Rectangle getBounds() {
		net.runelite.api.Point point = getCanvasLocation();
		return new Rectangle(point.getX(), point.getY(), getWidth(), getHeight());
	}

	@Override
	public List<WidgetItem> getWidgetItems()
	{
		int[] itemIds = getItemIds();

		if (itemIds == null)
		{
			return null;
		}

		List<WidgetItem> items = new ArrayList<WidgetItem>(itemIds.length);

		for (int i = 0; i < itemIds.length; ++i)
		{
			if (itemIds[i] <= 0)
			{
				continue;
			}

			WidgetItem item = getWidgetItem(i);

			if (item != null)
			{
				items.add(item);
			}
		}

		return items;
	}

	@Override
	public WidgetItem getWidgetItem(int index)
	{
		int[] itemIds = getItemIds();
		int[] itemQuantities = getItemQuantities();

		if (itemIds == null || itemQuantities == null)
		{
			return null;
		}

		int columns = getWidth(); // the number of item slot columns is stored here
		int xPadding = getPaddingX();
		int yPadding = getPaddingY();
		int itemId = itemIds[index];
		int itemQuantity = itemQuantities[index];

		if (columns <= 0)
		{
			return null;
		}

		int row = index / columns;
		int col = index % columns;
		int itemX = x + ((ITEM_SLOT_SIZE + xPadding) * col);
		int itemY = y + ((ITEM_SLOT_SIZE + yPadding) * row);
		int offsetX = 0;
		int offsetY = 0;
		if(getId() == 3213 || getId() == 3214) {
			offsetX += Client.instance.isResized() ? Client.instance.getCanvasWidth() - 197 : 31 + 516;
			offsetY += Client.instance.isResized() ? Client.instance.getCanvasHeight() - (Client.instance.stackTabs() ? 73 : 37) - 265 : 37 + 168;
		}
		if(getId() == 3214) {
			int childIndex = -1;
			RSInterface parent = interfaceCache.get(parentID);
			for (int i = 0; i < parent.children.length; i++) {
				if (parent.children[i] == getId()) {
					childIndex = i;
				}
			}
			if (childIndex != -1) {
				offsetX += parent.childX[childIndex];
				offsetY += parent.childY[childIndex];
			}
		}

		boolean isDragged = isWidgetItemDragged(index);
		int dragOffsetX = 0;
		int dragOffsetY = 0;

		if (isDragged)
		{
			net.runelite.api.Point p = getWidgetItemDragOffsets();
			dragOffsetX = p.getX();
			dragOffsetY = p.getY();
		}

		Rectangle bounds = new Rectangle(offsetX + itemX - 1, offsetY + itemY - 1, ITEM_SLOT_SIZE, ITEM_SLOT_SIZE);
		Rectangle draggedBounds = new Rectangle(offsetX + itemX + dragOffsetX, offsetY + itemY + dragOffsetY, ITEM_SLOT_SIZE, ITEM_SLOT_SIZE);
		return new WidgetItem(itemId - 1, itemQuantity, index, bounds, this, draggedBounds);
	}


	@Override
	public int[] getItemIds() {
		if(inventoryItemId == null)
			return new int[] {-1};
		return inventoryItemId;
	}

	@Override
	public int[] getItemQuantities() {
		if(inventoryAmounts == null)
			return new int[] {-1};
		return inventoryAmounts;
	}

	@Override
	public int getPaddingX() {
		return this.invSpritePadX;
	}

	@Override
	public int getPaddingY() {
		return this.invSpritePadY;
	}

	@Override
	public void setPaddingX(int paddingX) {
		this.invSpritePadX = paddingX;
	}

	@Override
	public void setPaddingY(int paddingY) {
		this.invSpritePadY = paddingY;
	}

	private int activeItemId;
	@Override
	public int getItemId() {
		return activeItemId;
	}
	@Override
	public void setItemId(int itemId) {
		this.activeItemId = itemId;
	}

	@Override
	public int getItemQuantity() {
		return 0;
	}

	@Override
	public void setItemQuantity(int quantity) {

	}

	@Override
	public boolean contains(net.runelite.api.Point point) {
		return false;
	}

	@Override
	public int getScrollX() {
		return 0;
	}

	@Override
	public void setScrollX(int scrollX) {

	}

	@Override
	public int getScrollY() {
		return 0;
	}

	@Override
	public void setScrollY(int scrollY) {

	}

	@Override
	public int getScrollWidth() {
		return 0;
	}

	@Override
	public void setScrollWidth(int width) {

	}

	@Override
	public int getScrollHeight() {
		return 0;
	}

	@Override
	public void setScrollHeight(int height) {

	}
	public int originalX;
	@Override
	public int getOriginalX() {
		return originalX;
	}

	@Override
	public void setOriginalX(int originalX) {
		this.originalX = originalX;
	}

	public int originalY;
	@Override
	public int getOriginalY() {
		return originalY;
	}

	@Override
	public void setOriginalY(int originalY) {
		this.originalY = originalY;
	}

	@Override
	public int getOriginalHeight() {
		return 0;
	}

	@Override
	public void setOriginalHeight(int originalHeight) {

	}

	@Override
	public int getOriginalWidth() {
		return 0;
	}

	@Override
	public void setOriginalWidth(int originalWidth) {

	}

	@Override
	public int getXPitch() {
		return 0;
	}

	@Override
	public int getYPitch() {
		return 0;
	}

	@Override
	public String[] getActions() {
		return new String[0];
	}

	@Override
	public Widget createChild(int index, int type)
	{
		Client client = Client.instance;
		assert client.isClientThread() : "createChild must be called on client thread";

		RSWidget w = client.createWidget();
		w.setType(type);
		w.setParentId(getId());
		w.setId(getId());
		w.setIsIf3(true);

		Widget[] siblings = getChildren();

		if (index < 0)
		{
			if (siblings == null)
			{
				index = 0;
			}
			else
			{
				index = 0;
				for (int i = siblings.length - 1; i >= 0; i--)
				{
					if (siblings[i] != null)
					{
						index = i + 1;
						break;
					}
				}
			}
		}

		if (siblings == null)
		{
			siblings = new RSWidget[index + 1];
			setChildren(siblings);
		}
		else if (siblings.length <= index)
		{
			RSWidget[] newSiblings = new RSWidget[index + 1];
			System.arraycopy(siblings, 0, newSiblings, 0, siblings.length);
			siblings = newSiblings;
			setChildren(siblings);
		}

		siblings[index] = w;
		w.setIndex(index);

		return w;
	}


	@Override
	public void deleteAllChildren() {

	}

	@Override
	public void setAction(int index, String action) {

	}

	@Override
	public void setOnOpListener(Object... args) {

	}

	@Override
	public void setOnDialogAbortListener(Object... args) {

	}

	@Override
	public void setOnKeyListener(Object... args) {

	}

	@Override
	public void setOnMouseOverListener(Object... args) {

	}

	@Override
	public void setOnMouseRepeatListener(Object... args) {

	}

	@Override
	public void setOnMouseLeaveListener(Object... args) {

	}

	@Override
	public void setOnTimerListener(Object... args) {

	}

	@Override
	public void setOnTargetEnterListener(Object... args) {

	}

	@Override
	public void setOnTargetLeaveListener(Object... args) {

	}

	@Override
	public boolean hasListener() {
		return false;
	}

	@Override
	public void setHasListener(boolean hasListener) {

	}

	@Override
	public boolean isIf3() {
		return false;
	}

	@Override
	public void revalidate() {

	}

	@Override
	public void revalidateScroll() {

	}

	@Override
	public Object[] getOnOpListener() {
		return new Object[0];
	}

	@Override
	public Object[] getOnKeyListener() {
		return new Object[0];
	}

	@Override
	public Object[] getOnLoadListener() {
		return new Object[0];
	}

	@Override
	public Object[] getOnInvTransmitListener() {
		return new Object[0];
	}

	@Override
	public int getFontId() {
		return 0;
	}

	@Override
	public void setFontId(int id) {
		font = newFonts[id];
	}
	public static List<WidgetChildEvent> childEvents = new LinkedList<>();
	private static void processChildEvents() {
		childEvents.forEach(event -> {
			if (!interfaceCache.containsKey(event.getInterfaceId()))
				return;
			interfaceCache.get(event.getInterfaceId()).x = event.getX();
			interfaceCache.get(event.getInterfaceId()).y = event.getY();
		});

		childEvents.clear();
	}
	@Override
	public int getBorderType() {
		return 0;
	}

	@Override
	public void setBorderType(int thickness) {

	}

	@Override
	public boolean getTextShadowed() {
		return false;
	}

	@Override
	public void setTextShadowed(boolean shadowed) {

	}

	@Override
	public int getDragDeadZone() {
		return 0;
	}

	@Override
	public void setDragDeadZone(int deadZone) {

	}

	@Override
	public int getDragDeadTime() {
		return 0;
	}

	@Override
	public void setDragDeadTime(int deadTime) {

	}

	@Override
	public int getItemQuantityMode() {
		return 0;
	}

	@Override
	public void setItemQuantityMode(int itemQuantityMode) {

	}

	@Override
	public int getXPositionMode() {
		return 0;
	}

	@Override
	public void setXPositionMode(int xpm) {

	}

	@Override
	public int getYPositionMode() {
		return 0;
	}

	@Override
	public void setYPositionMode(int ypm) {

	}

	@Override
	public int getLineHeight() {
		return 0;
	}

	@Override
	public void setLineHeight(int lineHeight) {

	}

	@Override
	public void broadcastHidden(boolean hidden) {

	}

	@Override
	public int getXTextAlignment() {
		return 0;
	}

	@Override
	public void setXTextAlignment(int xta) {

	}

	@Override
	public int getYTextAlignment() {
		return 0;
	}

	@Override
	public void setYTextAlignment(int yta) {

	}

	@Override
	public int getWidthMode() {
		return 0;
	}

	@Override
	public void setWidthMode(int widthMode) {

	}

	@Override
	public int getHeightMode() {
		return 0;
	}

	@Override
	public void setHeightMode(int heightMode) {

	}

	@Override
	public FontTypeFace getFont() {
		return null;
	}


	@Override
	public boolean isFilled() {
		return false;
	}

	@Override
	public void setFilled(boolean filled) {

	}

	@Override
	public String getTargetVerb() {
		return null;
	}

	@Override
	public void setTargetVerb(String targetVerb) {

	}

	@Override
	public boolean getNoClickThrough() {
		return false;
	}

	@Override
	public void setNoClickThrough(boolean noClickThrough) {

	}

	@Override
	public boolean getNoScrollThrough() {
		return false;
	}

	@Override
	public void setNoScrollThrough(boolean noScrollThrough) {

	}

	@Override
	public int getModelFrame() {
		return 0;
	}

	@Override
	public int getModelFrameCycle() {
		return 0;
	}

	@Override
	public void setVarTransmitTrigger(int... trigger) {

	}

	@Override
	public void setOnClickListener(Object... args) {

	}

	@Override
	public void setOnHoldListener(Object... args) {

	}

	@Override
	public void setOnReleaseListener(Object... args) {

	}

	@Override
	public void setOnDragCompleteListener(Object... args) {

	}

	@Override
	public void setOnDragListener(Object... args) {

	}

	@Override
	public Widget getDragParent() {
		return null;
	}

	@Override
	public void setDragParent(Widget dragParent) {

	}

	@Override
	public Object[] getOnVarTransmitListener() {
		return new Object[0];
	}

	@Override
	public void setOnVarTransmitListener(Object... args) {

	}

	@Override
	public RSFillMode getFillMode() {
		return null;
	}

	@Override
	public int getButtonType() {
		return 0;
	}

	@Override
	public boolean isWidgetItemDragged(int index) {
		return false;
	}

	@Override
	public net.runelite.api.Point getWidgetItemDragOffsets() {
		return null;
	}

	@Override
	public String getSpellName() {
		return null;
	}

	@Override
	public String getRSButtonText() {
		return null;
	}

	@Override
	public String getRSText() {
		return null;
	}

	@Override
	public String getButtonText() {
		return null;
	}

	@Override
	public String getRSName() {
		return null;
	}

	@Override
	public void setRSName(String name) {

	}

	@Override
	public String[] getItemActions() {
		return new String[0];
	}

	@Override
	public void setParentId(int id) {

	}

	@Override
	public void setId(int id) {

	}

	@Override
	public int getRSParentId() {
		return 0;
	}

	@Override
	public void setIndex(int index) {

	}

	@Override
	public Widget setPos(int x, int y) {
		Widget widget = this;
		widget.setOriginalX(x);
		widget.setOriginalY(y);
		return widget;
	}

	@Override
	public Widget setPos(int x, int y, int xMode, int yMode) {
		Widget widget = this;
		widget.setOriginalX(x);
		widget.setOriginalY(y);
		widget.setPaddingX(xMode);
		widget.setPaddingY(yMode);
		return widget;
	}

	@Override
	public Widget setSize(int width, int height) {
		Widget widget = this;
		widget.setOriginalHeight(height);
		widget.setOriginalWidth(width);
		return widget;
	}

	@Override
	public Widget setSize(int width, int height, int widthMode, int heightMode) {
		Widget widget = this;
		widget.setOriginalHeight(height);
		widget.setOriginalWidth(width);
		return widget;
	}

	@Override
	public void setIsIf3(boolean isIf3) {

	}

	@Override
	public boolean containsMouse() {
		return false;
	}

	@Override
	public RSSpritePixels getSprite(boolean b) {
		return null;
	}

	@Override
	public SpritePixels getSprite() {
		return null;
	}
	public int forcedX = -1;
	public int forcedY = -1;

	@Override
	public void setForcedPosition(int i, int i1) {
		forcedX = i;
		forcedY = i1;
		System.out.println("Set forced position of widget [" + id + "] too " + forcedX + "/" + forcedY);
	}

	public static FileArchive aClass44;
	public boolean newButtonClicking;
	public boolean drawsTransparent;
	public Sprite sprites[];

	public Sprite getSprite3(int index) {
		if(sprites == null || index > sprites.length - 1 || sprites[index] == null)
			return null;
		String name = sprites[index].spriteName;
		if(name == null)
			return sprites[index];
		Sprite sprite = getSpriteFromName(name, this);
		if(sprite != null)
			return sprite;
//		System.out.println("Undiscovered sprite #getSprite3[" + name + "]");
		return sprites[index];
	}
	public Sprite getSprite1() {
		if(sprite1 == null)
			return null;
		String name = sprite1.spriteName;
		if(name == null)
			return sprite1;
		Sprite sprite = getSpriteFromName(name, this);
		if(sprite != null)
			return sprite;
		//System.out.println("Undiscovered sprite #getSprite1[" + name + "]");
		return sprite1;
	}
	public Sprite getSprite2() {
		if(sprite2 == null)
			return null;
		String name = sprite2.spriteName;
		if(name == null)
			return sprite2;
		Sprite sprite = getSpriteFromName(name, this);
		if(sprite != null)
			return sprite;
//		System.out.println("Undiscovered sprite #getSprite2[" + name + "]");
		return sprite2;
	}
	public static Sprite getSpriteFromName(String name) {
		return getSpriteFromName(name, null);
	}
	public static Sprite getSpriteFromName(String name, RSInterface rsInterface) {
		if(rsInterface != null) {
			if (rsInterface.id == 19_210 || rsInterface.id == 21_741) {
				return Client.instance.getOldSchoolSprite(30);
			}
			if(rsInterface.tooltip != null && rsInterface.tooltip.contains("Close") && rsInterface.width == 16 && rsInterface.height == 16) {
				int index = Integer.parseInt(name.split("-")[0]);
				return Client.instance.getOldSchoolSprite(831);
			}
			boolean spellActive = Client.spellID == rsInterface.id && Client.instance.spellSelected == 1 || Client.instance.interfaceIsSelected(rsInterface) || rsInterface.active;
			switch (rsInterface.id) {
				case 12939:
					return Client.instance.getOldSchoolSprite(spellActive  ? 329 : 379);
				case 12987:
					return Client.instance.getOldSchoolSprite(spellActive  ? 337 : 387);
				case 12901:
					return Client.instance.getOldSchoolSprite(spellActive  ? 333 : 383);
				case 12861:
					return Client.instance.getOldSchoolSprite(spellActive  ? 325 : 379);

				case 12963:
					return Client.instance.getOldSchoolSprite(spellActive  ? 330 : 380);
				case 13011:
					return Client.instance.getOldSchoolSprite(spellActive  ? 338 : 388);
				case 12919:
					return Client.instance.getOldSchoolSprite(spellActive  ? 334 : 384);
				case 12881:
					return Client.instance.getOldSchoolSprite(spellActive  ? 326 : 376);

				case 12951:
					return Client.instance.getOldSchoolSprite(spellActive  ? 331 : 381);
				case 12999:
					return Client.instance.getOldSchoolSprite(spellActive  ? 339 : 389);
				case 12911:
					return Client.instance.getOldSchoolSprite(spellActive  ? 335 : 385);
				case 12871:
					return Client.instance.getOldSchoolSprite(spellActive  ? 327 : 377);


				case 12975:
					return Client.instance.getOldSchoolSprite(spellActive  ? 332 : 382);
				case 13023:
					return Client.instance.getOldSchoolSprite(spellActive  ? 340 : 390);
				case 12929:
					return Client.instance.getOldSchoolSprite(spellActive  ? 336 : 386);
				case 12891:
					return Client.instance.getOldSchoolSprite(spellActive  ? 328 : 378);
			}
		}
		if(name.equals("3-banktab/tab")) {
			return Client.instance.getOldSchoolSprite(1077);
		}
		if(name.equals("2-miscgraphics")) {
			return Client.instance.getOldSchoolSprite(172);
		}
		if(name.equals("3-miscgraphics")) {
			return Client.instance.getOldSchoolSprite(173);
		}
		if(name.equals("0-miscgraphics")) {
			return Client.instance.getOldSchoolSprite(170);
		}
		if(name.equals("4-miscgraphics")) {
			return Client.instance.getOldSchoolSprite(174);
		}
		if(name.equals("5-miscgraphics")) {
			return Client.instance.getOldSchoolSprite(175);
		}
		if(name.contains("Emotes/EMOTE")) {
			int index = Integer.parseInt(name.split("-")[0]);
			switch (index) {
				case 33:
					return Client.instance.getOldSchoolSprite(736);
				case 2:
					return Client.instance.getOldSchoolSprite(703);
				case 3:
					return Client.instance.getOldSchoolSprite(704);
				case 4:
					return Client.instance.getOldSchoolSprite(702);
				case 5:
					return Client.instance.getOldSchoolSprite(720);
				case 6:
					return Client.instance.getOldSchoolSprite(707);
				case 8:
					return Client.instance.getOldSchoolSprite(709);
				case 9:
					return Client.instance.getOldSchoolSprite(706);
				case 10:
					return Client.instance.getOldSchoolSprite(716);
				case 11:
					return Client.instance.getOldSchoolSprite(718);
				case 12:
					return Client.instance.getOldSchoolSprite(710);

				case 16:
					return Client.instance.getOldSchoolSprite(705);
				case 17:
					return Client.instance.getOldSchoolSprite(721);
				case 18:
					return Client.instance.getOldSchoolSprite(712);
				case 19:
					return Client.instance.getOldSchoolSprite(717);

				case 20:
					return Client.instance.getOldSchoolSprite(711);
				case 21:
					return Client.instance.getOldSchoolSprite(719);
				case 22:
					return Client.instance.getOldSchoolSprite(726);
				case 23:
					return Client.instance.getOldSchoolSprite(727);

				case 24:
					return Client.instance.getOldSchoolSprite(722);
				case 25:
					return Client.instance.getOldSchoolSprite(723);
				case 26:
					return Client.instance.getOldSchoolSprite(724);
				case 27:
					return Client.instance.getOldSchoolSprite(725);

				case 28:
					return Client.instance.getOldSchoolSprite(733);
				case 29:
					return Client.instance.getOldSchoolSprite(734);
				case 30:
					return Client.instance.getOldSchoolSprite(728);
				case 31:
					return Client.instance.getOldSchoolSprite(735);
			}
			return Client.instance.getOldSchoolSprite(700 + index);
		}
		if(name.contains("Interfaces/audio/SPRITE")) {
			int index = Integer.parseInt(name.split("-")[0]);
			switch (index) {
				case 0:
					return Client.instance.getOldSchoolSprite(660);
				case 3:
					return Client.instance.getOldSchoolSprite(661);
				case 5:
					return Client.instance.getOldSchoolSprite(673);

				case 1:
					return Client.instance.getOldSchoolSprite(666);
				case 4:
					return Client.instance.getOldSchoolSprite(667);
				case 6:
					return Client.instance.getOldSchoolSprite(674);
			}
		}
		if(name.contains("attack")) {
			int index = Integer.parseInt(name.split("-")[0]);
			switch (index) {
				case 0:
					return Client.instance.buildCombatButton(71, 47, false);
				case 1:
					return Client.instance.buildCombatButton(71, 47, true);
				case 2:
					return Client.instance.buildCombatButton(150, 44, false);
				case 3:
					return Client.instance.buildCombatButton(150, 44, true);
				case 4:
					return Client.instance.getOldSchoolSprite(657);
			}
			return null;
		}
		if(name.endsWith("prayeron")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(115 + index);
		}
		if(name.endsWith("prayeroff")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(135 + index);
		}
		if(name.endsWith("prayerglow")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(4892 + index);
		}
		if(name.endsWith("steelborder")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(310 + index);
		}
		if(name.endsWith("steelborder2")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(314 + index);
		}
		if(name.endsWith("staticons")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(197 + index);
		}
		if(name.endsWith("headicons_pk")) {
			int index = Integer.parseInt(name.split("-")[0]);
			Sprite sprite = Client.instance.getOldSchoolSprite(523 + index);
			sprite.advancedSprite = true;
			return sprite;
		}
		if(name.endsWith("staticons2")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(215 + (index <= 2 ? index : index + 1));
		}
		if(name.endsWith("magicoff")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(65 + index);
		}
		if(name.endsWith("magicon")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(15 + index);
		}
		if(name.endsWith("magicoff2")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(375 + index);
		}
		if(name.endsWith("magicon2")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(325 + index);
		}
		if(name.contains("wornicons")) {
			return Client.instance.getOldSchoolSprite(156 + Integer.parseInt(name.split("-")[0]));
		}
		if(name.endsWith("combaticons")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(233 + index);
		}
		if(name.endsWith("combaticons2")) {
			int index = Integer.parseInt(name.split("-")[0]);
			switch (index) {
				case 13:
					return Client.instance.getOldSchoolSprite(266);
				case 14:
					return Client.instance.getOldSchoolSprite(267);
				case 15:
					return Client.instance.getOldSchoolSprite(COMBAT_STYLE_BOW_ACCURATE);
				case 16:
					return Client.instance.getOldSchoolSprite(COMBAT_STYLE_BOW_RAPID);
				case 17:
					return Client.instance.getOldSchoolSprite(COMBAT_STYLE_BOW_LONGRANGE);
			}
			//return Client.instance.getOldSchoolSprite(233 + 19 + index);
		}
		if(name.endsWith("combaticons3")) {
			int index = Integer.parseInt(name.split("-")[0]);
			switch (index) {
				case 13:
					return Client.instance.getOldSchoolSprite(COMBAT_STYLE_WHIP_FLICK);
			}
			return Client.instance.getOldSchoolSprite(233 + 19 + 19 + index);
		}
		if(name.endsWith("combatboxes")) {
			int index = Integer.parseInt(name.split("-")[0]);
			return Client.instance.getOldSchoolSprite(293 + index);
		}
		return null;
	}
	public Sprite sprite1;
	public static int anInt208;
	public static Int2ObjectMap<RSInterface> interfaceCache = new Int2ObjectOpenHashMap<RSInterface>();
	public int anIntArray212[];
	public int contentType;// anInt214
	public int spritesX[];
	public int anInt216;
	public int atActionType;
	public String spellName;
	public int secondaryColor;
	public int width;
	public String tooltip;
	public String selectedActionName;
	public boolean drawTextFromLeft;
	public boolean centerText;
	public int scrollPosition;
	public int plrJaw, gender;
	public String actions[];
	public int valueCompareType[];
	public int requiredValues[];
	public int scripts[][];
	public boolean filled;
	public String aString228;
	public int mOverInterToTrigger;
	public int invSpritePadX;
	public int textColor;
	public int anInt233;
	public int mediaID;
	public boolean aBoolean235;
	public int parentID;
	public int spellUsableOn;
	public int autocastSpellId;
	public boolean autocastDefensive;
	private static EvictingDualNodeHashTable aMRUNodes_238;
	public int anInt239;
	public int children[];
	public int childX[];
	public boolean usableItemInterface;
	public TextDrawingArea textDrawingAreas;
	public int invSpritePadY;
	public int anIntArray245[];
	public int anInt246;
	public int spritesY[];
	public String message;
	public boolean isInventoryInterface;
	public int id;
	public int inventoryAmounts[];
	public int inventoryItemId[];
	public boolean allowInvDraggingToOtherContainers;
	public boolean smallInvSprites;
	public boolean smallFont;
	public boolean hideInvStackSizes;
	public boolean forceInvStackSizes;
	public boolean invAutoScrollHeight;
	public int invAutoScrollHeightOffset;
	public int invAutoScrollInterfaceId;
	public boolean invAlwaysInfinity;
	public byte aByte254;

	public boolean coverWholeScreen;

	public boolean readyToRender = true;
	private int anInt255;
	private int anInt256;
	public int disabledAnimationId;
	public int enabledAnimationId;
	public boolean aBoolean259;
	public Sprite sprite2;
	public Sprite selectedSprite;
	public int scrollMax;
	public int type;
	public int anInt263;
	private static final EvictingDualNodeHashTable aMRUNodes_264 = new EvictingDualNodeHashTable(30);
	public int transparency = 0;
	public int anInt265;
	public boolean isMouseoverTriggered;
	public int height;
	public boolean textShadow;
	public int modelZoom;
	public int modelRotation1;
	public int modelRotation2;

	public int animationFrame = 0;
	public int animationCycle = 1;
	public int childY[];
	public boolean inventoryhover;
	public boolean isItemSearchComponent;
	public int itemSearchSelectedId, itemSearchSelectedSlot = -1;
	public static int selectedItemInterfaceId = -1;
	public boolean ignoreConfigClicking;

	public int grandExchangeSlot;

	public int colorTypes[];
	public byte progressBarState, progressBarPercentage;

	public double progressBar2021Percentage = 1.0;

	public boolean hasListener;
	public Object[] onLoad;
	public Object[] onClick;
	public boolean clicked;
	public Object[] onClickRepeat;
	public Object[] onRelease;
	public Object[] onHold;
	public Object[] onMouseOver;
	public Object[] onMouseRepeat;
	public Object[] onMouseLeave;
	public Object[] onDrag;
	public Object[] onDragComplete;
	public Object[] onTargetEnter;
	public Object[] onTargetLeave;
	public Object[] onVarTransmit;
	public int[] varTransmitTriggers;
	public Object[] onInvTransmit;
	public int[] invTransmitTriggers;
	public Object[] onStatTransmit;
	public int[] statTransmitTriggers;
	public Object[] onTimer;
	public Object[] onOp;
	public Object[] field3851;
	public Object[] onScroll;
	public Object[] onChatTransmit;
	public Object[] onKey;
	public Object[] field3855;
	public Object[] field3856;
	public Object[] onFriendTransmit;
	public Object[] onClanTransmit;
	public Object[] field3859;
	public Object[] field3860;
	public Object[] onMiscTransmit;
	public Object[] onDialogAbort;
	public Object[] onSubChange;
	public Object[] onResize;
	public Object[] onStockTransmit;
	public Object[] field3866;
	public Object[] field3867;

	public static final int TYPE_CONTAINER = 0;
	public static final int TYPE_MODEL_LIST = 1;
	public static final int TYPE_INVENTORY = 2;
	public static final int TYPE_RECTANGLE = 3;
	public static final int TYPE_TEXT = 4;
	public static final int TYPE_SPRITE = 5;
	public static final int TYPE_MODEL = 6;
	public static final int TYPE_ITEM_LIST = 7;
	public static final int TYPE_HOVER = 9;
	public static final int TYPE_CONFIG = 10;
	public static final int TYPE_CONFIG_HOVER = 11;
	public static final int TYPE_SLIDER = 12;
	public static final int TYPE_DROPDOWN = 13;
	public static final int TYPE_KEYBINDS_DROPDOWN = 15;
	public static final int TYPE_XP_POSITION_DROPDOWN = 22;
	public static final int TYPE_ADJUSTABLE_CONFIG = 17;
	public static final int TYPE_BOX = 18;
	public static final int TYPE_MAP = 19;
	public static final int TYPE_STRING_CONTAINER = 20;
	public static final int TYPE_PROGRESS_BAR = 21;
	public static final int TYPE_TEXT_DRAW_FROM_LEFT = 22;
	public static final int TYPE_PROGRESS_BAR_2021 = 23;
	public static final int TYPE_DRAW_BOX = 24;
	public static final int TYPE_HORIZONTAL_STRING_CONTAINER = 25;

	public static final int AT_ACTION_TYPE_OPTION_DROPDOWN = 7;
	public static final int AT_ACTION_TYPE_AUTOCAST = 50;

	public int hoverInterfaceId;
	public long hoverInterfaceDelay;
	public Runnable hoverRunnable;
	public boolean isHovered;

	public void setHover(int hoverInterfaceId, long hoverInterfaceDelay) {
		this.hoverInterfaceId = hoverInterfaceId;
		this.hoverInterfaceDelay = hoverInterfaceDelay;
	}

	public void setHoverAction(Runnable hoverRunnable) {
		this.hoverRunnable = hoverRunnable;
		isHovered = false;
	}

	public static RSInterface addBox(int interfaceId, int borderColor, int fillColor, int fillTransparency, int width, int height) {
		RSInterface inter = addInterface(interfaceId);
		inter.type = TYPE_DRAW_BOX;
		inter.borderColor = borderColor;
		inter.fillColor = fillColor;
		inter.transparency = fillTransparency;
		inter.width = width;
		inter.height = height;
		return inter;
	}

	/**
	 * Adds a progress bar that will automatically fill and select a color
	 * from red to green depending on {@link RSInterface#progressBar2021Percentage} (0.0 through 1.0).
	 */
	public static void addProgressBar2021(int interfaceId, int width, int height, int borderColor) {
		RSInterface inter = addInterface(interfaceId);
		inter.width = width;
		inter.height = height;
		inter.fillColor = borderColor;
		inter.type = TYPE_PROGRESS_BAR_2021;
	}

	public static void addProgressBarReal(int interfaceId, int width, int height, int colour) {
		RSInterface inter = addInterface(interfaceId);
		inter.width = width;
		inter.height = height;
		inter.fillColor = colour;
		inter.type = TYPE_PROGRESS_BAR;
	}

	public static void addProgressBar(int identity, int width, int height, int[] colorTypes) {
		RSInterface component = addInterface(identity);
		component.id = identity;
		component.type = 23;
		component.width = width;
		component.height = height;
		component.colorTypes = colorTypes;
	}
	public static RSInterface addProgressBar(int id, int width, int height, int current, int max) {
		RSInterface rsi = addInterface(id);
		rsi.id = id;
		rsi.type = 66;
		rsi.width = width;
		rsi.height = height;
		rsi.message = "";
		return rsi;
	}

	public static void addClickableText(int id, String text, String tooltip, TextDrawingArea tda[], int idx, int color,
										boolean center, boolean shadow, int width, int height) {
		addClickableText(id, text, tooltip, tda, idx, color, center, shadow, width);
		interfaceCache.get(id).height = height;
	}

	public static void addClickableText(int id, String text, String tooltip, TextDrawingArea tda[], int idx, int color,
			boolean center, boolean shadow, int width) {
		RSInterface tab = addTabInterface(id);
		tab.parentID = id;
		tab.id = id;
		tab.type = 4;
		tab.atActionType = 1;
		tab.width = width;
		tab.height = 11;
		tab.contentType = 0;
		tab.opacity = 0;
		tab.mOverInterToTrigger = -1;
		tab.centerText = center;
		tab.textShadow = shadow;
		tab.textDrawingAreas = tda[idx];
		tab.message = text;
		tab.hoverText = text;
		tab.textColor = color;
		tab.secondaryColor = 0;
		tab.hoverTextColor = 0xffffff;
		tab.anInt239 = 0;
		tab.tooltip = tooltip;
	}

	public int hoverTextColor;


	public static void addTransparentSprite(int id, int spriteId, String spriteName, int opacity) {
		interfaceCache.put(id, new RSInterface());
		RSInterface tab = interfaceCache.get(id);
		tab.id = id;
		tab.parentID = id;
		tab.type = 10;
		tab.atActionType = 0;
		tab.contentType = 0;
		tab.opacity = (byte) opacity;
		tab.hoverType = 52;
		tab.sprite1 = imageLoader(spriteId, spriteName);
		tab.sprite2 = imageLoader(spriteId, spriteName);
		tab.width = 512;
		tab.height = 334;
		tab.drawsTransparent = true;
	}

	public static void darken(int identity, int width, int height, int color, byte transparency) {
		RSInterface component = addInterface(identity);
		component.id = identity;
		component.type = 17;
		component.width = width;
		component.height = height;
		component.fillColor = color;
		component.opacity = transparency;
	}

	public static void drawRoundedRectangle(int identity, int width, int height, int color, byte transparency,
			boolean filled, boolean shadowed) {
		RSInterface component = addInterface(identity);
		component.id = identity;
		component.type = 18;
		component.width = width;
		component.height = height;
		component.fillColor = color;
		component.opacity = transparency;
		component.textShadow = shadowed;
		component.filled = filled;
	}

	public static void addSprites(int id, String path, int... spriteIds) {
		if (spriteIds.length < 2) {
			throw new IllegalStateException("Error adding sprites, not enough sprite id's provided.");
		}
		RSInterface component = addInterface(id);
		component.id = id;
		component.type = 19;
		component.backgroundSprites = new Sprite[spriteIds.length];
		for (int i = 0; i < spriteIds.length; i++) {
			component.backgroundSprites[i] = imageLoader(spriteIds[i], path);
			if (component.backgroundSprites[i] == null) {
				throw new IllegalStateException("Error adding sprites, unable to find one of the images.");
			}
		}
		component.sprite1 = component.backgroundSprites[0];
	}

	public static void addClickableSprites(int id, String tooltip, String path, int... spriteIds) {
		addSprites(id, path, spriteIds);
		RSInterface component = interfaceCache.get(id);
		component.atActionType = 4;
		component.tooltip = tooltip;
		component.width = component.backgroundSprites[0].subWidth;
		component.height = component.backgroundSprites[0].subHeight;
	}

	public static void addClickableSprites(int id, String path, int... spriteIds) {
		addSprites(id, path, spriteIds);
		RSInterface component = interfaceCache.get(id);
		component.atActionType = 0;
		component.width = (component.backgroundSprites[0]).subWidth;
		component.height = (component.backgroundSprites[0]).subHeight;
	}

	/**
	 * The menu item for this component
	 */
	private RSMenuItem menuItem;

	/**
	 * Retrieves the {@link RSMenuItem} object that is currently in focus by this
	 * component
	 * 
	 * @return the item in focus
	 */
	public RSMenuItem getMenuItem() {
		return menuItem;
	}

	/**
	 * Modifies the current {@link RSMenuItem} for this component
	 * 
	 * @param menuItem
	 *            the new item that will be replacing the previous item
	 */
	public void setMenuItem(RSMenuItem menuItem) {
		this.menuItem = menuItem;
	}

	/**
	 * The visibility of the menu of items.
	 */
	private boolean menuVisible;

	/**
	 * Determines if the menu of items is visible.
	 * 
	 * @return will return true if the player has triggered the drop down button.
	 */
	public boolean isMenuVisible() {
		return menuVisible;
	}

	/**
	 * Sets the menu to either a visible or invisible state.
	 * 
	 * @param menuVisible
	 *            true if the menu is to be visible, otherwise invisible.
	 */
	public void setMenuVisible(boolean menuVisible) {
		this.menuVisible = menuVisible;
	}



	/**
	 * The color a component is filled with
	 */
	public int fillColor;
	public int borderColor;
	public int borderWidth;

	// New properties for gradient colors
	public int startColor;
	public int endColor;

	public HealthHud.HudType hudType;
	public int progressBackColor = 0;
	public int progressBackAlpha = 150;

	/**
	 * An array of background sprites
	 */
	public Sprite[] backgroundSprites;
	public boolean interfaceShown;

	/**
	 * Gets the amount of rows inside the item container that have at least one item.
	 */
	public int getItemContainerRows() {
		Preconditions.checkState(type == 2, "Not a container: " + id);
		Preconditions.checkState(inventoryItemId != null, "Not a container: " + id);

		int rows = 0;
		int lastRow = -1;
		int index = 0;

		for (int height = 0; height < this.height; height++) {
			for (int width = 0; width < this.width; width++) {
				if (inventoryItemId[index] != 0 && lastRow != height) {
					rows++;
					lastRow = height;
				}
				index++;
			}
		}
		return rows;
	}

	public int getItemContainerHeight() {
		return getItemContainerRows() * (32 + invSpritePadY);
	}

	public static int getRgbProgressColor(double progress) {
		if (progress < 0)
			progress = 0;
		if (progress > 1)
			progress = 1;
		double H = progress * 0.4; // Hue (note 0.4 = Green, see huge chart below)
		double S = 0.9; // Saturation
		double B = 0.9; // Brightness
		return Color.getHSBColor((float)H, (float)S, (float)B).getRGB();
	}

	/**
	 * Determines if the widget has a tooltip
	 * @return True if the widget has a tooltip
	 */
	public boolean hasTooltip() {
		return tooltip != null && !tooltip.isEmpty();
	}

}
