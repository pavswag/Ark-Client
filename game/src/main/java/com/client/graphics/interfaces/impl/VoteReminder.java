package com.client.graphics.interfaces.impl;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.RSInterfaceConstants;

public class VoteReminder extends RSInterface {

    private static String dir = "votereminder/sprite";

    public static void voteReminderWidget(TextDrawingArea[] tda) {
        int baseX = 125;
        int baseY = 45;

        int interfaceId = getInterfaceId();

        int index = 1;

        RSInterface mainInterface = addInterface(interfaceId); //main interface display

        addSprite(interfaceId + index++, 0, dir);

        addText(interfaceId + index++, "Vote Reminder", tda, 2, RSInterfaceConstants.ORANGE, true);

        hoverButton(interfaceId + index++, dir, "Vote Now", 3, 4);
        interfaceCache.get(interfaceId + index - 1).message = "Vote Now";
        interfaceCache.get(interfaceId + index - 1).textColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).secondaryColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(interfaceId + index - 1).textDrawingAreas = tda[2];
        interfaceCache.get(interfaceId + index - 1).centerText = true;
        interfaceCache.get(interfaceId + index - 1).msgX =  interfaceCache.get(interfaceId + index - 1).width / 2;
        interfaceCache.get(interfaceId + index - 1).msgY = (interfaceCache.get(interfaceId + index - 1).height / 2) + 4;

        addSprite(interfaceId + index++, 1, dir);
        addSprite(interfaceId + index++, 2, dir);

        addText(interfaceId + index++, "Remember to vote every 12\\nhours for the latest store\\nboxes!", tda, 2, RSInterfaceConstants.ORANGE, true);

        index = 0;

        mainInterface.child(index++, interfaceId + index, baseX, baseY); //whole background
        mainInterface.child(index++, interfaceId + index, (224 / 2) + baseX, 10 + baseY); //title
        mainInterface.child(index++, interfaceId + index, 65 + baseX, 115 + baseY); //buton
        mainInterface.child(index++, interfaceId + index, 15 + baseX, 107 + baseY); //box sprite
        mainInterface.child(index++, interfaceId + index, 175 + baseX, 107 + baseY); //box sprite
        mainInterface.child(index++, interfaceId + index, (224 / 2) + baseX, 45 + baseY); //text

        mainInterface.child(index++, 22753, baseX + 200, baseY + 9); //close
    }

    private static int getInterfaceId() {
        return 580;
    }

}
