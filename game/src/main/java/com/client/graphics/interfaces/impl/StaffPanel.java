package com.client.graphics.interfaces.impl;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.MenuItem;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.RSInterfaceConstants;
import com.client.graphics.interfaces.dropdown.PlayerAttackOptionMenu;

public class StaffPanel extends RSInterface {

    private static String dir = "staff_panel/sprite";

    public static void staffPanel(TextDrawingArea[] tda) {
        int baseX = 7;
        int baseY = 7;

        int interfaceId = getInterfaceId();

        int index = 1;

        RSInterface mainInterface = addInterface(interfaceId); //main interface display

        addSprite(interfaceId + index++, 0, dir);

        addText(interfaceId + index++, "Staff Panel", tda, 2, RSInterfaceConstants.ORANGE, true);

        addInputField(interfaceId + index++, 35, RSInterfaceConstants.ORANGE, "Enter Player Name", 169, 22, false, true, "[A-Za-z0-9 .,]");
        RSInterface playerScroll = addInterface(65105);
        playerScroll.totalChildren(1);
        playerScroll.width = 419;
        playerScroll.height = 284;
        playerScroll.scrollMax = 22_010; // 22 * 1000 for 1000 player support

        dropdownMenu(interfaceId + index++, 166, 0, new String[]{"A-Z", "Combat Level", "Total Level", "Rank"}, new MenuItem() {
            @Override
            public void select(int optionSelected, RSInterface rsInterface) {

            }
        }, tda, 1);
        addText(42555, "Player 'Attack' options:", tda, 1, 0xfe971e, false, true);


        hoverButton(interfaceId + index++, dir, "Vote Now", 3, 4);
        interfaceCache.get(interfaceId + index - 1).message = "Vote Now";
        interfaceCache.get(interfaceId + index - 1).textColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).secondaryColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).textDrawingAreas = tda[2];
        interfaceCache.get(interfaceId + index - 1).centerText = true;
        interfaceCache.get(interfaceId + index - 1).msgX =  interfaceCache.get(interfaceId + index - 1).width / 2;
        interfaceCache.get(interfaceId + index - 1).msgY = (interfaceCache.get(interfaceId + index - 1).height / 2) + 4;

        addSprite(interfaceId + index++, 1, dir);

        index = 0;

        mainInterface.child(index++, interfaceId + index, baseX, baseY); //whole background
        mainInterface.child(index++, interfaceId + index, (224 / 2) + baseX, 10 + baseY); //title
        mainInterface.child(index++, interfaceId + index, 13 + baseX, 42 + baseY); //player name input

        mainInterface.child(index++, 22753, baseX + 200, baseY + 9); //close
    }

    private static int getInterfaceId() {
        return 65_100;
    }

}
