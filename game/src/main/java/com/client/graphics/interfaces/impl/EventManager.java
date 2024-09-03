package com.client.graphics.interfaces.impl;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.MenuItem;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.RSInterfaceConstants;

public class EventManager extends RSInterface {


    private static String dir = "event_manager/sprite";

    public static void eventManager(TextDrawingArea[] tda) {
        int baseX = 7;
        int baseY = 7;

        int interfaceId = getInterfaceId();
        int categoryListId = interfaceId + 75;

        int index = 1;

        RSInterface mainInterface = RSInterface.addInterface(interfaceId); //main interface display

        addSprite(interfaceId + index++, 0, dir);
        RSInterface.addText(interfaceId + index++, "Event Manager", tda, 2, RSInterfaceConstants.YELLOW, true);

        hoverButton(interfaceId + index++, dir, "Close", 1, 2);
        interfaceCache.get(interfaceId + index - 1).sprite1.advancedSprite = true;

        RSInterface.addText(interfaceId + index++, "Dig Event", tda, 3, RSInterfaceConstants.WHITE_TEXT, true);

        hoverButton(interfaceId + index++, dir, "Start Event", 3, 4);
        interfaceCache.get(interfaceId + index - 1).message = "Start Event";
        interfaceCache.get(interfaceId + index - 1).textColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).secondaryColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).textDrawingAreas = tda[0];
        interfaceCache.get(interfaceId + index - 1).centerText = true;
        interfaceCache.get(interfaceId + index - 1).msgX = (interfaceCache.get(interfaceId + index - 1).width / 2);
        interfaceCache.get(interfaceId + index - 1).msgY = (interfaceCache.get(interfaceId + index - 1).height / 2) + 4;
        interfaceCache.get(interfaceId + index - 1).sprite1.advancedSprite = true;

        hoverButton(interfaceId + index++, dir, "End Event", 3, 4);
        interfaceCache.get(interfaceId + index - 1).message = "End Event";
        interfaceCache.get(interfaceId + index - 1).textColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).secondaryColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).textDrawingAreas = tda[0];
        interfaceCache.get(interfaceId + index - 1).centerText = true;
        interfaceCache.get(interfaceId + index - 1).msgX = (interfaceCache.get(interfaceId + index - 1).width / 2);
        interfaceCache.get(interfaceId + index - 1).msgY = (interfaceCache.get(interfaceId + index - 1).height / 2) + 4;
        interfaceCache.get(interfaceId + index - 1).sprite1.advancedSprite = true;

        RSInterface.addText(interfaceId + index++, "Dig Probability: 100", tda, 1, RSInterfaceConstants.PALE_ORANGE, false);
        RSInterface.addText(interfaceId + index++, "Dig Radius: 10", tda, 1, RSInterfaceConstants.PALE_ORANGE, false);
        RSInterface.addText(interfaceId + index++, "Setting 3", tda, 1, RSInterfaceConstants.PALE_ORANGE, false);
        RSInterface.addText(interfaceId + index++, "Setting 4", tda, 1, RSInterfaceConstants.PALE_ORANGE, false);

        for(int i = 0; i < 4; i++) {
            hoverButton(interfaceId + index++, dir, "Edit", 5, 6);
            interfaceCache.get(interfaceId + index - 1).message = "Edit";
            interfaceCache.get(interfaceId + index - 1).textColor = RSInterfaceConstants.ORANGE;
            interfaceCache.get(interfaceId + index - 1).secondaryColor = RSInterfaceConstants.ORANGE;
            interfaceCache.get(interfaceId + index - 1).textDrawingAreas = tda[0];
            interfaceCache.get(interfaceId + index - 1).centerText = true;
            interfaceCache.get(interfaceId + index - 1).msgX = (interfaceCache.get(interfaceId + index - 1).width / 2);
            interfaceCache.get(interfaceId + index - 1).msgY = (interfaceCache.get(interfaceId + index - 1).height / 2) + 4;
            interfaceCache.get(interfaceId + index - 1).sprite1.advancedSprite = true;
        }

        dropdownMenu(interfaceId + index++, 135, 0, new String[]{"Dig Event", "Drop Party"}, new MenuItem() {
            @Override
            public void select(int optionSelected, RSInterface rsInterface) {

            }
        }, tda, 1);

        RSInterface categoryList = RSInterface.addInterface(categoryListId);index++; //category list scroll

        mainInterface.totalChildren(index - 1);

        index = 0;

        mainInterface.child(index++, interfaceId + index, baseX, baseY); //background
        mainInterface.child(index++, interfaceId + index, baseX + (461 / 2), baseY + 10); //title
        mainInterface.child(index++, interfaceId + index, baseX + 470, baseY + 9); //close button

        mainInterface.child(index++, interfaceId + index, baseX + 160, baseY + 43); //event title

        mainInterface.child(index++, interfaceId + index, baseX + (496 / 2) - 151 - 6, baseY + 275); //start button
        mainInterface.child(index++, interfaceId + index, baseX + (496 / 2) + 6, baseY + 275); //end button

        mainInterface.child(index++, interfaceId + index, baseX + 22, baseY + 80); //dig probability
        mainInterface.child(index++, interfaceId + index, baseX + 22, baseY + 110); //dig radius
        mainInterface.child(index++, interfaceId + index, baseX + 22, baseY + 140); //dig radius
        mainInterface.child(index++, interfaceId + index, baseX + 22, baseY + 170); //dig radius

        mainInterface.child(index++, interfaceId + index, baseX + 250, baseY + 80); //edit probability
        mainInterface.child(index++, interfaceId + index, baseX + 250, baseY + 110); //edit radius
        mainInterface.child(index++, interfaceId + index, baseX + 250, baseY + 140); //edit radius
        mainInterface.child(index++, interfaceId + index, baseX + 250, baseY + 170); //edit radius

        mainInterface.child(index++, interfaceId + index, baseX + 12, baseY + 9); //event

        mainInterface.child(index++, categoryListId, baseX + 290, baseY + 37); //category list

        /*
         * Category list
         */
        int totalCategories = 15;
        categoryList.width = 180;
        categoryList.height = 233;
        categoryList.scrollMax = (totalCategories * 60) + 20;

        categoryList.totalChildren(1); //how many elements

        int increaseY = 30;
        int i = 0;

        categoryListId++;

        RSInterface.itemGroup(categoryListId, 4, 20, 4, 4, false, false, false);
        RSInterface rewardContainer = get(categoryListId);
        String[] actions = new String[] {"Remove"};

        RSInterface itemInterface = RSInterface.interfaceCache.get(categoryListId);

        itemInterface.actions = new String[13 * 35];

        for (int i2 = 0; i2 < itemInterface.actions.length; i2++) {
            if (i2 < actions.length) {
                if (actions[i2] != null) {
                    itemInterface.actions[i2] = actions[i2];
                }
            }
        }
        categoryList.child(rewardContainer.id, 24, 3);




        RSInterface invContainer = addInterface(77_998);
        invContainer.child(77_999, 16, 8);

        RSInterface.itemGroup(77_999, 4, 7, 10, 4, false, false, false);


        itemInterface = RSInterface.interfaceCache.get(77_999);

        itemInterface.actions = new String[] {"Add 1", "Add 5", "Add 10", "Add X", "Add All"};
    }


    private static int getInterfaceId() {
        return 75_000;
    }

}
