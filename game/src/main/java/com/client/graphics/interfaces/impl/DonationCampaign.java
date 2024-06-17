package com.client.graphics.interfaces.impl;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;

public class DonationCampaign extends RSInterface {

    public static void donationCampaignWidget(TextDrawingArea[] tda) {
        String dir = "Interfaces/deals/SPRITE";

        int interfaceId = 24230;
        RSInterface main = addInterface(interfaceId);
        int index = 1;

        addSprite(24231, 34, dir); //background
        addText(24232, "Kyros Donation Campaign", 2, 0xFF981F, true, true); //title
        configHoverButton(24233, "Close interface", dir, 21, 22, 21, 21, false, 24234); //close button

        configHoverButton(24235, "Deals", dir, 7, 8, 7, 7, false, 24236);
        configHoverButton(24237, "Store", dir, 5, 6, 5, 5, false, 24238);

        hoverButton(24239, dir, "Campaign", 32, 33);

        addSprite(24240, 30, dir); //main background
        addSprite(24241, 30, dir); //main background
        addSprite(24242, 30, dir); //main background
        addSprite(24243, 30, dir); //main background

        addText(24244, "Prize #1", 2, 0xFF981F, true, true);
        addText(24245, "Prize #2", 2, 0xFF981F, true, true);
        addText(24246, "Prize #3", 2, 0xFF981F, true, true);
        addText(24247, "Prize #4", 2, 0xFF981F, true, true);

        addSprite(24248, 35, dir); //progress background
        addSprite(24249, 35, dir); //progress background
        addSprite(24250, 35, dir); //progress background
        addSprite(24251, 35, dir); //progress background

        addProgressBarReal(24252, 188, 24, 0x4dff00);
        addProgressBarReal(24253, 188, 24, 0x4dff00);
        addProgressBarReal(24254, 188, 24, 0x4dff00);
        addProgressBarReal(24255, 188, 24, 0x4dff00);

        itemGroup(24256, 5, 1, 6, 4, false, true, true);
        itemGroup(24257, 5, 1, 6, 4, false, true, true);
        itemGroup(24258, 5, 1, 6, 4, false, true, true);
        itemGroup(24259, 5, 1, 6, 4, false, true, true);

        addText(24260, "$450/$500", 2, 0xFF981F, true, true);
        addText(24261, "$450/$500", 2, 0xFF981F, true, true);
        addText(24262, "$450/$500", 2, 0xFF981F, true, true);
        addText(24263, "$450/$500", 2, 0xFF981F, true, true);

        index = 0;

        int baseX = 45, baseY = 8;

        main.child(index++, interfaceId + index, baseX, baseY); //background
        main.child(index++, interfaceId + index, baseX + 220, baseY + 10); //title
        main.child(index++, interfaceId + index, 405 + baseX, 10 + baseY); //close button
        main.child(index++, interfaceId + index, 75 + baseX, 45 + baseY); //deals button
        main.child(index++, interfaceId + index, 75 + baseX + 98, 45 + baseY); //store button
        main.child(index++, interfaceId + index, 75 + baseX + 98 + 98, 45 + baseY); //campaign button
        main.child(index++, interfaceId + index, baseX + 17, 82 + baseY); //main background
        main.child(index++, interfaceId + index, baseX + 220, 82 + baseY); //main background
        main.child(index++, interfaceId + index, baseX + 17, 197 + baseY); //main background
        main.child(index++, interfaceId + index, baseX + 220, 197 + baseY); //main background
        main.child(index++, interfaceId + index, baseX + 17+ 99, 87 + baseY); //Prize #1
        main.child(index++, interfaceId + index, baseX + 220 + 99, 87 + baseY); //Prize #2
        main.child(index++, interfaceId + index, baseX + 17 + 99, 202 + baseY); //Prize #3
        main.child(index++, interfaceId + index, baseX + 220 + 99, 202 + baseY); //Prize #4
        main.child(index++, interfaceId + index, baseX + 23, 162 + baseY); //Progress bar bg #1
        main.child(index++, interfaceId + index, baseX + 226 , 162 + baseY); //Progress bar bg #2
        main.child(index++, interfaceId + index, baseX + 23, 277 + baseY); //Progress bar bg  #3
        main.child(index++, interfaceId + index, baseX + 226, 277 + baseY); //Progress bar bg #4
        main.child(index++, interfaceId + index, baseX + 23, 162 + baseY); //Progress bar #1
        main.child(index++, interfaceId + index, baseX + 226 , 162 + baseY); //Progress bar #2
        main.child(index++, interfaceId + index, baseX + 23, 277 + baseY); //Progress bar #3
        main.child(index++, interfaceId + index, baseX + 226, 277 + baseY); //Progress bar #4
        main.child(index++, interfaceId + index, baseX + 27, 162 - 49 + baseY); //item #1
        main.child(index++, interfaceId + index, baseX + 230, 162 - 49 + baseY); //item #2
        main.child(index++, interfaceId + index, baseX + 27, 277 - 49 + baseY); //item #3
        main.child(index++, interfaceId + index, baseX + 230, 277 - 49 + baseY); //item #4
        main.child(index++, interfaceId + index, baseX + 23 + 92, 162 + 6 + baseY); //progress text #1
        main.child(index++, interfaceId + index, baseX + 226 + 92, 162 + 6 + baseY); //progress text #2
        main.child(index++, interfaceId + index, baseX + 23 + 92, 277 + 6 + baseY); //progress text #3
        main.child(index++, interfaceId + index, baseX + 226 + 92, 277 + 6 + baseY); //progress text #4
    }
}
