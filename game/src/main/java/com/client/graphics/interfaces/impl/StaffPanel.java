package com.client.graphics.interfaces.impl;

import com.client.Skill;
import com.client.Sprite;
import com.client.TextDrawingArea;
import com.client.graphics.interfaces.MenuItem;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.RSInterfaceConstants;
import com.client.graphics.interfaces.dropdown.PlayerAttackOptionMenu;

public class StaffPanel extends RSInterface {

    private static String dir = "staff_panel/sprite";

    public static void staffPanel(TextDrawingArea[] tda) {
        int baseX = 4;
        int baseY = 4;

        int interfaceId = getInterfaceId();

        int index = 1;

        RSInterface mainInterface = addInterface(interfaceId); //main interface display

        addSprite(interfaceId + index++, 0, dir);
        interfaceCache.get(interfaceId + index - 1).sprite1.advancedSprite = true;

        addText(interfaceId + index++, "Staff Panel", tda, 2, RSInterfaceConstants.ORANGE, true);

        addInputField(interfaceId + index++, 35, RSInterfaceConstants.ORANGE, "Enter Player Name", 169, 22, false, true, "[A-Za-z0-9 .,]");

        dropdownMenu(interfaceId + index++, 83, 0, new String[]{"A-Z", "Combat Level", "Total Level", "Rank"}, new MenuItem() {
            @Override
            public void select(int optionSelected, RSInterface rsInterface) {

            }
        }, tda, 1);
        dropdownMenu(interfaceId + index++, 83, 0, new String[]{"Online", "Offline", "Both"}, new MenuItem() {
            @Override
            public void select(int optionSelected, RSInterface rsInterface) {

            }
        }, tda, 1);

        RSInterface playerScroll = addInterface(65150);
        playerScroll.totalChildren(1);
        playerScroll.width = 155;
        playerScroll.height = 225;
        playerScroll.scrollMax = 22_000;
        int playerScrollChildIdx = 0;
        for(int i = 65156; i <= 66156; i++) {
            int childIdx = i - 65156;

            hoverButton(i, dir, "The Guru", childIdx % 2 == 0 ? 1 : 2, childIdx % 2 == 0 ? 2 : 1);
            interfaceCache.get(i).message = childIdx % 2 == 0 ? "The Guru" : "Luke";
            interfaceCache.get(i).textColor = RSInterfaceConstants.ORANGE;
            interfaceCache.get(i).secondaryColor = RSInterfaceConstants.ORANGE;
            interfaceCache.get(i).textDrawingAreas = tda[2];
            interfaceCache.get(i).centerText = true;
            interfaceCache.get(i).msgX = (interfaceCache.get(i).width / 2) - 25;
            interfaceCache.get(i).msgY = (interfaceCache.get(i).height / 2) + 4;
            playerScroll.child(playerScrollChildIdx++, i, 1, childIdx * 22);
        }
        for(int i = 66156; i <= 67156; i++) {
            int childIdx = (i - 66156);
            addSprite(i, childIdx % 2 == 0 ? 3 : 4, dir);
            interfaceCache.get(i).sprite1.advancedSprite = true;
            playerScroll.child(playerScrollChildIdx++, i, 140, 8 + (childIdx * 22));
        }


        hoverButton(interfaceId + index++, dir, "Overview", 8, 8);
        interfaceCache.get(interfaceId + index - 1).message = "Overview";
        interfaceCache.get(interfaceId + index - 1).textColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).secondaryColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).textDrawingAreas = tda[0];
        interfaceCache.get(interfaceId + index - 1).centerText = true;
        interfaceCache.get(interfaceId + index - 1).msgX = (interfaceCache.get(interfaceId + index - 1).width / 2);
        interfaceCache.get(interfaceId + index - 1).msgY = (interfaceCache.get(interfaceId + index - 1).height / 2) + 4;
        interfaceCache.get(interfaceId + index - 1).sprite1.advancedSprite = true;
        interfaceCache.get(interfaceId + index - 1).buttonListener = (button) -> {
            Sprite active = new Sprite(dir + " 8");
            active.advancedSprite = true;
            Sprite inactive = new Sprite(dir + " 7");
            inactive.advancedSprite = true;
            interfaceCache.get(button).sprite1 = active;
            interfaceCache.get(button + 1).sprite1 = inactive;
            interfaceCache.get(button + 2).sprite1 = inactive;
            interfaceCache.get(button).sprite2 = active;
            interfaceCache.get(button + 1).sprite2 = inactive;
            interfaceCache.get(button + 2).sprite2 = inactive;
            interfaceCache.get(getInterfaceId()).children[9] = 67173;
        };

        hoverButton(interfaceId + index++, dir, "History", 7, 7);
        interfaceCache.get(interfaceId + index - 1).message = "History";
        interfaceCache.get(interfaceId + index - 1).textColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).secondaryColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).textDrawingAreas = tda[0];
        interfaceCache.get(interfaceId + index - 1).centerText = true;
        interfaceCache.get(interfaceId + index - 1).msgX = (interfaceCache.get(interfaceId + index - 1).width / 2);
        interfaceCache.get(interfaceId + index - 1).msgY = (interfaceCache.get(interfaceId + index - 1).height / 2) + 4;
        interfaceCache.get(interfaceId + index - 1).sprite1.advancedSprite = true;
        interfaceCache.get(interfaceId + index - 1).buttonListener = (button) -> {
            Sprite active = new Sprite(dir + " 8");
            active.advancedSprite = true;
            Sprite inactive = new Sprite(dir + " 7");
            inactive.advancedSprite = true;
            interfaceCache.get(button).sprite1 = active;
            interfaceCache.get(button - 1).sprite1 = inactive;
            interfaceCache.get(button + 1).sprite1 = inactive;
            interfaceCache.get(button).sprite2 = active;
            interfaceCache.get(button - 1).sprite2 = inactive;
            interfaceCache.get(button + 1).sprite2 = inactive;
            interfaceCache.get(getInterfaceId()).children[9] = 68000;
        };

        hoverButton(interfaceId + index++, dir, "Misc.", 7, 7);
        interfaceCache.get(interfaceId + index - 1).message = "Misc.";
        interfaceCache.get(interfaceId + index - 1).textColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).secondaryColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).textDrawingAreas = tda[0];
        interfaceCache.get(interfaceId + index - 1).centerText = true;
        interfaceCache.get(interfaceId + index - 1).msgX = (interfaceCache.get(interfaceId + index - 1).width / 2);
        interfaceCache.get(interfaceId + index - 1).msgY = (interfaceCache.get(interfaceId + index - 1).height / 2) + 4;
        interfaceCache.get(interfaceId + index - 1).sprite1.advancedSprite = true;
        interfaceCache.get(interfaceId + index - 1).buttonListener = (button) -> {
            Sprite active = new Sprite(dir + " 8");
            active.advancedSprite = true;
            Sprite inactive = new Sprite(dir + " 7");
            inactive.advancedSprite = true;
            interfaceCache.get(button).sprite1 = active;
            interfaceCache.get(button - 1).sprite1 = inactive;
            interfaceCache.get(button - 2).sprite1 = inactive;
            interfaceCache.get(button).sprite2 = active;
            interfaceCache.get(button - 1).sprite2 = inactive;
            interfaceCache.get(button - 2).sprite2 = inactive;
        };


        RSInterface playerOverviewScroll = addInterface(67173);
        playerOverviewScroll.totalChildren(1);
        playerOverviewScroll.width = 287;
        playerOverviewScroll.height = 138;
        playerOverviewScroll.scrollMax = 850; // 22 * 1000 for 1000 player support
        int playerOverviewChildIdx = 0;

        addText(67174, "Stats", tda, 3, RSInterfaceConstants.ORANGE, false);
        playerOverviewScroll.child(playerOverviewChildIdx++, 67174, 10, 6);
        int skillId = 68010;
        int skillTextId = 68035;
        for(int x = 1; x <= 4; x++) {
            for(int y = 1; y <= 6; y++) {
                Skill skill = Skill.values()[skillId - 68010];
                addRectangle(skillId, 54, 25, 0x221e1a, 0, true);
                get(skillId).secondaryColor = 0x252220;
                get(skillId).atActionType = 1;
                get(skillId).tooltip = "<col=ff9933>Change Skill Level";
                addText(skillTextId, "<icon=" + Skill.getIconId(skill) + "><col=ff9933>99/99", tda, 0, 0xff9933, true);
                int xPos = 10;
                switch (x) {
                    case 2:
                        xPos = 80;
                        break;
                    case 3:
                        xPos = 150;
                        break;
                    case 4:
                        xPos = 220;
                        break;
                }
                playerOverviewScroll.child(skillId, xPos, y * 32);
                playerOverviewScroll.child(skillTextId, xPos + 25, 6 + (y * 32));
                skillId++;
                skillTextId++;
            }
        }
        System.out.println("finished skills @ " + skillTextId);

        addText(68100, "General Information", tda, 3, RSInterfaceConstants.ORANGE, false);
        playerOverviewScroll.child(68100, 10, 230);

        addText(68101, "Total Playtime: 2 days, 58 hours", tda, 1, RSInterfaceConstants.ORANGE, true);
        playerOverviewScroll.child(68101, 143, 255);

        addText(68102, "Game Mode: Normal", tda, 1, RSInterfaceConstants.ORANGE, true);
        playerOverviewScroll.child(68102, 143, 280);

        addText(68103, "XP Rate: x1", tda, 1, RSInterfaceConstants.ORANGE, true);
        playerOverviewScroll.child(68103, 143, 305);

        addText(68104, "Achievements: 3/202", tda, 1, RSInterfaceConstants.ORANGE, true);
        playerOverviewScroll.child(68104, 143, 330);


        //addInputField(68101, 35, RSInterfaceConstants.ORANGE, "Enter Player Name", 169, 22, false, true, "[A-Za-z0-9 .,]");

        RSInterface playerHistoryScroll = addInterface(68000);
        playerHistoryScroll.totalChildren(1);
        playerHistoryScroll.width = 287;
        playerHistoryScroll.height = 138;
        playerHistoryScroll.scrollMax = 850;
        int playerHistoryChildIdx = 0;

        addText(68001, "History", tda, 3, RSInterfaceConstants.ORANGE, false);
        playerHistoryScroll.child(playerHistoryChildIdx++, 68001, 10, 6);

        addText(68002, "The Guru was muted by Luke at 01/09/2024 20:00 for 7 days for being a great coder.<br><br>The Guru was unmuted by The Guru at 01/09/2024 19:50.", tda, 1, RSInterfaceConstants.ORANGE, false);
        interfaceCache.get(68002).wrapText = true;
        interfaceCache.get(68002).width = 280;
        playerHistoryScroll.child(playerHistoryChildIdx++, 68002, 3, 15);

        index = 1;
        int childIdx = 0;

        mainInterface.child(childIdx++, interfaceId + index++, baseX, baseY); //whole background
        mainInterface.child(childIdx++, interfaceId + index++, 255 + baseX, 10 + baseY); //title
        mainInterface.child(childIdx++, interfaceId + index++, 14 + baseX, 41 + baseY); //player name input
        mainInterface.child(childIdx++, 65150, 12 + baseX, 94 + baseY); //scroll bar
        mainInterface.child(childIdx++, interfaceId + index++, 12 + baseX, 67 + baseY); //a-z dropdown
        mainInterface.child(childIdx++, interfaceId + index++, 100 + baseX, 67 + baseY); //online/offline dropdown


        mainInterface.child(childIdx++, interfaceId + index++, 223 + baseX, 40 + baseY); //overview button
        mainInterface.child(childIdx++, interfaceId + index++, 304 + baseX, 40 + baseY); //history button
        mainInterface.child(childIdx++, interfaceId + index++, 384 + baseX, 40 + baseY); //misc button

        System.out.println("Placing player overview scroll at child index [" + childIdx + "]");
        mainInterface.child(childIdx++, 67173, 194 + baseX, 58 + baseY); //player overview scroll


        mainInterface.child(childIdx++, 22753, baseX + 485, baseY + 9); //close
    }

    private static int getInterfaceId() {
        return 65_100;
    }

}
