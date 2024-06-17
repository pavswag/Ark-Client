package com.client.graphics.interfaces.impl;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;

public class DonationCampaign extends RSInterface {

    public static void donationCampaignWidget(TextDrawingArea[] tda) {
        int interfaceId = 24230;
        RSInterface main = addInterface(interfaceId);
        String dir = "Interfaces/deals/SPRITE";

        int index = 1;
        int baseX = 45, baseY = 8;


        addSprite(interfaceId + index++, 34, dir);//background
        addText(interfaceId + index++, "Kyros Donation Campaign", 2, 0xFF981F, true, true); //title
        configHoverButton(interfaceId + index, "Close interface", dir, 21, 22, 21, 21, false, interfaceId + index++);//close button

        configHoverButton(interfaceId + index, "Deals", dir, 7, 8, 7, 7, false, interfaceId + index++);
        configHoverButton(interfaceId + index, "Store", dir, 5, 6, 5, 5, false, interfaceId + index++);

        hoverButton(interfaceId + index++, dir, "Campaign", 32, 33);


        addSprite(interfaceId + index++, 30, dir);//main background
        addSprite(interfaceId + index++, 30, dir);//main background
        addSprite(interfaceId + index++, 30, dir);//main background
        addSprite(interfaceId + index++, 30, dir);//main background

        addText(interfaceId + index++, "Prize #1", 2, 0xFF981F, true, true);
        addText(interfaceId + index++, "Prize #2", 2, 0xFF981F, true, true);
        addText(interfaceId + index++, "Prize #3", 2, 0xFF981F, true, true);
        addText(interfaceId + index++, "Prize #4", 2, 0xFF981F, true, true);


        addSprite(interfaceId + index++, 35, dir);//main background
        addSprite(interfaceId + index++, 35, dir);//main background
        addSprite(interfaceId + index++, 35, dir);//main background
        addSprite(interfaceId + index++, 35, dir);//main background

        addProgressBarReal(interfaceId + index++, 188, 24, 0x4dff00);
        addProgressBarReal(interfaceId + index++, 188, 24, 0x4dff00);
        addProgressBarReal(interfaceId + index++, 188, 24, 0x4dff00);
        addProgressBarReal(interfaceId + index++, 188, 24, 0x4dff00);

        itemGroup(interfaceId + index++, 5, 1, 6, 4, false, true, true);
        itemGroup(interfaceId + index++, 5, 1, 6, 4, false, true, true);
        itemGroup(interfaceId + index++, 5, 1, 6, 4, false, true, true);
        itemGroup(interfaceId + index++, 5, 1, 6, 4, false, true, true);


        addText(interfaceId + index++, "$450/$500", 2, 0xFF981F, true, true);
        addText(interfaceId + index++, "$450/$500", 2, 0xFF981F, true, true);
        addText(interfaceId + index++, "$450/$500", 2, 0xFF981F, true, true);
        addText(interfaceId + index++, "$450/$500", 2, 0xFF981F, true, true);


        index = 0;

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
