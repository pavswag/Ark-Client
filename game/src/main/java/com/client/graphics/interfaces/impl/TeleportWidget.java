package com.client.graphics.interfaces.impl;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;

public class TeleportWidget extends RSInterface {

    private static String dir = "teleport_widget/sprite";

    public static void teleportWidget(TextDrawingArea[] tda) {
        int baseX = 4;
        int baseY = 4;

        int interfaceId = getInterfaceId();

        int index = 1;

        RSInterface mainInterface = addInterface(interfaceId); //main interface display

        addSprite(interfaceId + index++, 0, dir);


        RSInterface teleportsScroll = addInterface(105_600);
        teleportsScroll.width = 183;
        teleportsScroll.height = 250;
        teleportsScroll.scrollMax = 1500;

        index = 1;
        mainInterface.child(interfaceId + index++, baseX, baseY);
        mainInterface.child(105_600, baseX + 13, baseY + 68);
    }

    private static int getInterfaceId() {
        return 105_500;
    }
}
