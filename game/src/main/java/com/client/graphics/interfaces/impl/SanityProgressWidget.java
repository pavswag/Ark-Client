package com.client.graphics.interfaces.impl;

import com.client.Client;
import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.RSInterfaceConstants;

public class SanityProgressWidget extends RSInterface {

    private static String dir = "sanity_progress/sprite";

    private static final int configId = 155;

    public static void sanityProgress(TextDrawingArea[] tda) {
        int baseX = 12;
        int baseY = 12;

        int interfaceId = getInterfaceId();

        int index = 1;

        RSInterface mainInterface = addInterface(interfaceId);

        addBox(interfaceId + index++, 0x322b19, 0x322b19, 255, 81, 25);
        addProgressBarReal(interfaceId + index++, 80, 24, 0x266a5a);
        get(interfaceId + index - 1).onRender = (child) -> {
            int percent = Client.instance.variousSettings[configId];
            child.width = (int) (percent / 100.0 * 80);
        };

        addSprite(interfaceId + index++, 0, dir);
        addSprite(interfaceId + index++, 1, dir);
        addSprite(interfaceId + index++, 2, dir);
        get(interfaceId + index - 1).drawsTransparent = true;
        get(interfaceId + index - 1).onRender = (child) -> {
            int percent = Client.instance.variousSettings[configId];
            child.transparency = (int) (percent / 100.0 * 255);
        };


        addText(interfaceId + index++, "Sanity: %1%", tda, 0, RSInterfaceConstants.WHITE, true);
        get(interfaceId + index - 1).scripts = new int[2][3];
        get(interfaceId + index - 1).scripts[0][0] = 5;
        get(interfaceId + index - 1).scripts[0][1] = configId;
        get(interfaceId + index - 1).scripts[0][2] = 0;


        index = 1;
        mainInterface.child(interfaceId + index++, baseX + 33, baseY + 6); //box
        mainInterface.child(interfaceId + index++, baseX + 34, baseY + 7); //progress bar
        mainInterface.child(interfaceId + index++, baseX, baseY); //main sprite
        mainInterface.child(interfaceId + index++, baseX + 4, baseY + 3); //brain background sprite
        mainInterface.child(interfaceId + index++, baseX + 4, baseY + 3); //opacity brain sprite
        mainInterface.child(interfaceId + index++, baseX + 34 + 40, baseY + 13); //text
    }

    private static int getInterfaceId() {
        return 110_000;
    }
}
