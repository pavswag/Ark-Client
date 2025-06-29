package com.client.graphics.interfaces.impl;

import com.client.Client;
import com.client.RSFont;
import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static com.client.graphics.interfaces.impl.Interfaces.addPrayerHover;

public class RuinousPowers extends RSInterface {

    private static String dir = "ruinous_powers/sprite";

    public static void ruinousPowers(TextDrawingArea[] tda) {
        int baseX = 5;
        int baseY = 8;
        int INTERFACE_ID = getInterfaceId();
        RSInterface mainInterface = addTabInterface(INTERFACE_ID);
        int index = 1;
        addText(INTERFACE_ID + index++, "%1/%2", 0xFF981F, false, false, -1, tda, 1);
        get(INTERFACE_ID + index - 1).scripts = new int[2][3];
        get(INTERFACE_ID + index - 1).scripts[0][0] = 1;
        get(INTERFACE_ID + index - 1).scripts[0][1] = 5;
        get(INTERFACE_ID + index - 1).scripts[0][2] = 0;
        get(INTERFACE_ID + index - 1).scripts[1][0] = 2;
        get(INTERFACE_ID + index - 1).scripts[1][1] = 5;
        get(INTERFACE_ID + index - 1).scripts[1][2] = 0;

        addSprite(INTERFACE_ID + index++, 2, "interfaces/curses/DATA");

        for(int i = 0; i < 25; i++) {
            com.client.RuinousPowers ruinousPowers = com.client.RuinousPowers.values()[i];
            addRuinousPrayer(INTERFACE_ID + index, 0, 1610 + i, 60 + i, i, ruinousPowers.getDisplayName());
            if(ruinousPowers == com.client.RuinousPowers.CCENTUIN_VOW) {
                get(INTERFACE_ID + index).onRender = (child) -> {
                    child.interfaceHidden = Client.localPlayer.centurion >= 255;
                };
            }
            if(ruinousPowers == com.client.RuinousPowers.CCENTUIN_VOW) {
                get(INTERFACE_ID + index + 1).onRender = (child) -> {
                    child.interfaceHidden = Client.localPlayer.centurion >= 255;
                };
            }
            index += 2;
            String[] effect = Client.instance.newRegularFont.wrap(ruinousPowers.getEffect(), Client.instance.newRegularFont.getTextWidth("place of run energy whilst running"));
            addPrayerHover(tda, 1, INTERFACE_ID + index++, "Level " + (50 + i) + "\\n" + StringUtils.join(effect, "\\n"), -135, -60);
            if(ruinousPowers == com.client.RuinousPowers.CCENTUIN_VOW) {
                get(INTERFACE_ID + index - 1).onRender = (child) -> {
                    child.interfaceHidden = Client.localPlayer.centurion >= 255;
                };
            }
        }

        index = 1;
        mainInterface.child(INTERFACE_ID + index++, 85, 241);
        mainInterface.child(INTERFACE_ID + index++, 65, 241);
        int[] hoverChilds = new int[25];
        for (int i = 0; i < 25; i++) {
            int row = i / 5;
            int column = i % 5;
            int currentX = baseX + (column * 35);
            int currentY = baseY + (row * 40);

            mainInterface.child(INTERFACE_ID + index, currentX, currentY);
            mainInterface.child(INTERFACE_ID + index + 1, currentX, currentY);
            index += 2;
            hoverChilds[i] = INTERFACE_ID + index++;
        }
        for (int i = 0; i < 25; i++) {
            int row = i / 5;
            int column = i % 5;
            int currentX = baseX + (column * 35);
            int currentY = baseY + (row * 40);

            mainInterface.child(hoverChilds[i], currentX, currentY);
        }

    }

    public static void addRuinousPrayer(int i, int configId, int configFrame, int requiredValues, int spriteID,
                                 String prayerName) {
        RSInterface tab = addTabInterface(i);
        tab.id = i;
        tab.parentID = getInterfaceId();
        tab.type = 5;
        tab.atActionType = 4;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.mOverInterToTrigger = -1;
        tab.sprite1 = imageLoader(5, "PRAYERGLOW");
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
        tab2.parentID = getInterfaceId();
        tab2.type = 5;
        tab2.atActionType = 0;
        tab2.contentType = 0;
        tab2.opacity = 0;
        tab2.mOverInterToTrigger = -1;
        tab2.sprite1 = imageLoader(spriteID, "ruinous_prayer/PRAYON");
        tab2.sprite1.advancedSprite = true;
        tab2.sprite1.xOffset = 2;
        tab2.sprite1.yOffset = 2;
        tab2.sprite2 = imageLoader(spriteID, "ruinous_prayer/PRAYOFF");
        tab2.sprite2.advancedSprite = true;
        tab2.sprite2.xOffset = 2;
        tab2.sprite2.yOffset = 2;
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

    private static int getInterfaceId() {
        return 105_000;
    }
}
