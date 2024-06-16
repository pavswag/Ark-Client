package com.client.graphics.interfaces.impl;

import com.client.Client;
import com.client.Sprite;
import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.RSInterfaceConstants;

public class GoodieBag extends RSInterface {

    private static String dir = "goodiebag/sprite";

    public static void goodiebagWidget(TextDrawingArea[] tda) {
        int baseX = 7;
        int baseY = 7;

        int interfaceId = getInterfaceId();

        int index = 1;

        RSInterface mainInterface = RSInterface.addInterface(interfaceId); //main interface display

        addSprite(interfaceId + index++, 0, dir);

        RSInterface.addText(interfaceId + index++, "Owner's goodiebag", tda, 2, RSInterfaceConstants.ORANGE, true);

        int buttonIndex = 1;

        for(int yOffset = 0; yOffset < 4; yOffset++) {
            for (int xOffset = 0; xOffset < 5; xOffset++) {
                hoverButton(interfaceId + index, dir, "Select " + buttonIndex, 1, 2);
                interfaceCache.get(interfaceId + index).message = String.valueOf(buttonIndex);
                interfaceCache.get(interfaceId + index).textColor = RSInterfaceConstants.WHITE_TEXT;
                interfaceCache.get(interfaceId + index).secondaryColor = RSInterfaceConstants.WHITE_TEXT;
                interfaceCache.get(interfaceId + index).selectedSprite = imageLoader(3, dir);
                interfaceCache.get(interfaceId + index).textDrawingAreas = tda[2];
                interfaceCache.get(interfaceId + index).centerText = true;
                interfaceCache.get(interfaceId + index).msgX =  interfaceCache.get(interfaceId + index).width / 2;
                interfaceCache.get(interfaceId + index).msgY = (interfaceCache.get(interfaceId + index).height / 2) + 4;
                index++;
                buttonIndex++;
            }
        }

        hoverButton(interfaceId + index, dir, "Confirm", 4, 5);
        interfaceCache.get(interfaceId + index).message = "Confirm";
        interfaceCache.get(interfaceId + index).textColor = RSInterfaceConstants.PALE_ORANGE;
        interfaceCache.get(interfaceId + index).secondaryColor = RSInterfaceConstants.PALE_ORANGE;
        interfaceCache.get(interfaceId + index).textDrawingAreas = tda[1];
        interfaceCache.get(interfaceId + index).centerText = true;
        interfaceCache.get(interfaceId + index).msgX =  interfaceCache.get(interfaceId + index).width / 2;
        interfaceCache.get(interfaceId + index).msgY = (interfaceCache.get(interfaceId + index).height / 2) + 4;
        index++;

        RSInterface.itemGroup(interfaceId + index++, 5, 4, 16, 16, false, true);


        mainInterface.totalChildren(index);

        index = 0;

        mainInterface.child(index++, interfaceId + index, baseX + (488 / 2) - 150, baseY + 10); //whole background
        mainInterface.child(index++, interfaceId + index, (488 / 2) + baseX, 20 + baseY); //title

        for(int yOffset = 0; yOffset < 4; yOffset++) {
            for (int xOffset = 0; xOffset < 5; xOffset++) {
                mainInterface.child(index++, interfaceId + index, 123 + baseX + (xOffset * 48), 60 + baseY + (yOffset * 48)); //number
            }
        }

        mainInterface.child(index++, interfaceId + index, baseX + (488 / 2) - (130 / 2), 260 + baseY); //confirm button

        mainInterface.child(index++, interfaceId + index, 127 + baseX, 65 + baseY); //number

        mainInterface.child(index++, 22753, baseX + 359, baseY + 19); //close
    }

    private static int getInterfaceId() {
        return interfaceId;
    }

    private static int interfaceId = 24203;
}
