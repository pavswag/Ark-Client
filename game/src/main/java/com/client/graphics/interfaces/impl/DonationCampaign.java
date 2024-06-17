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

        main.child(0, 24231, baseX, baseY); //background
        main.child(1, 24232, baseX + 220, baseY + 10); //title
        main.child(2, 24233, 405 + baseX, 10 + baseY); //close button
        main.child(3, 24235, 75 + baseX, 45 + baseY); //deals button
        main.child(4, 24237, 75 + baseX + 98, 45 + baseY); //store button
        main.child(5, 24239, 75 + baseX + 98 + 98, 45 + baseY); //campaign button
        main.child(6, 24240, baseX + 17, 82 + baseY); //main background
        main.child(7, 24241, baseX + 220, 82 + baseY); //main background
        main.child(8, 24242, baseX + 17, 197 + baseY); //main background
        main.child(9, 24243, baseX + 220, 197 + baseY); //main background
        main.child(10, 24244, baseX + 17 + 99, 87 + baseY); //Prize #1
        main.child(11, 24245, baseX + 220 + 99, 87 + baseY); //Prize #2
        main.child(12, 24246, baseX + 17 + 99, 202 + baseY); //Prize #3
        main.child(13, 24247, baseX + 220 + 99, 202 + baseY); //Prize #4
        main.child(14, 24248, baseX + 23, 162 + baseY); //Progress bar bg #1
        main.child(15, 24249, baseX + 226, 162 + baseY); //Progress bar bg #2
        main.child(16, 24250, baseX + 23, 277 + baseY); //Progress bar bg #3
        main.child(17, 24251, baseX + 226, 277 + baseY); //Progress bar bg #4
        main.child(18, 24252, baseX + 23, 162 + baseY); //Progress bar #1
        main.child(19, 24253, baseX + 226, 162 + baseY); //Progress bar #2
        main.child(20, 24254, baseX + 23, 277 + baseY); //Progress bar #3
        main.child(21, 24255, baseX + 226, 277 + baseY); //Progress bar #4
        main.child(22, 24256, baseX + 27, 162 - 49 + baseY); //item #1
        main.child(23, 24257, baseX + 230, 162 - 49 + baseY); //item #2
        main.child(24, 24258, baseX + 27, 277 - 49 + baseY); //item #3
        main.child(25, 24259, baseX + 230, 277 - 49 + baseY); //item #4
        main.child(26, 24260, baseX + 23 + 92, 162 + 6 + baseY); //progress text #1
        main.child(27, 24261, baseX + 226 + 92, 162 + 6 + baseY); //progress text #2
        main.child(28, 24262, baseX + 23 + 92, 277 + 6 + baseY); //progress text #3
        main.child(29, 24263, baseX + 226 + 92, 277 + 6 + baseY); //progress text #4

    }
}
