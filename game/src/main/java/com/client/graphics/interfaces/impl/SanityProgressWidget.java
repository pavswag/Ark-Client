package com.client.graphics.interfaces.impl;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;

public class SanityProgressWidget extends RSInterface {

    private static String dir = "sanity_progress/sprite";

    public static void sanityProgress(TextDrawingArea[] tda) {
        int baseX = 4;
        int baseY = 4;

        int interfaceId = getInterfaceId();

        int index = 1;

        RSInterface mainInterface = addInterface(interfaceId);

        addSprite(interfaceId + index++, 0, dir);

        index = 1;
        mainInterface.child(interfaceId + index++, baseX, baseY);
    }

    private static int getInterfaceId() {
        return 110_000;
    }
}
