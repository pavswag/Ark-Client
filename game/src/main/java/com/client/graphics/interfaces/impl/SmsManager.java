package com.client.graphics.interfaces.impl;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.RSInterfaceConstants;

public class SmsManager extends RSInterface {

    private static final String dir = "Interfaces/sms/SPRITE";

    public static void smsManager(TextDrawingArea[] tda) {
        int baseX = 125;
        int baseY = 45;

        int interfaceId = getInterfaceId();

        int index = 1;

        RSInterface mainInterface = addInterface(interfaceId);

        addSprite(interfaceId + index++, 5, dir);

        addText(interfaceId + index++, "SMS Manager", tda, 2, RSInterfaceConstants.ORANGE, true);

        hoverButton(interfaceId + index++, dir, "Enter Number", 7, 8);
        interfaceCache.get(interfaceId + index - 1).disableButtonActions = true;

        addInputField(interfaceId+index++, 200, 0xff981f, "+44123456789", 115, 36, false, false, "");
        interfaceCache.get(interfaceId + index - 1).disableFieldBackground = true;

        addSprite(interfaceId + index++, 6, dir);
        interfaceCache.get(interfaceId + index - 1).sprite1.advancedSprite = true;
        interfaceCache.get(interfaceId + index - 1).sprite2.advancedSprite = true;


        addText(interfaceId + index++, "Earn FREE Weekly Codes\\nBy Signing Up For SMS!", tda, 2, RSInterfaceConstants.ORANGE, true);

        index = 0;

        mainInterface.child(index++, interfaceId + index, baseX, baseY); //whole background
        mainInterface.child(index++, interfaceId + index, (224 / 2) + baseX, 10 + baseY); //title
        mainInterface.child(index++, interfaceId + index, 96 + baseX, 58 + baseY); //buton
        mainInterface.child(index++, interfaceId + index, 96 + baseX, 58 + baseY); //input field
        mainInterface.child(index++, interfaceId + index, 18 + baseX, 40 + baseY); //phone sprite
        mainInterface.child(index++, interfaceId + index, 115 + baseX, 125 + baseY); //text

        mainInterface.child(index++, 22753, baseX + 200, baseY + 9); //close
    }

    private static int getInterfaceId() {
        return 24960;
    }

}
