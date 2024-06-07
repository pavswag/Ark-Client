package com.client.graphics.interfaces.impl;

import com.client.Client;
import com.client.Sprite;
import com.client.TextDrawingArea;
import com.client.graphics.interfaces.Configs;
import com.client.graphics.interfaces.RSInterface;

public class RakebackBoxes extends RSInterface {

    private static String dir = "rake-box/sprite";

    public static void mainInterface(TextDrawingArea[] tda) {
        RSInterface main = addInterface(23723);
        addSprite(23724, 0, dir);
        addText(23725, "Mystery Box Name", tda, 2, 0xff9933, true);
        addText(23726, "Loot Available", tda, 2, 0xff9933, true);
        addText(23727, "Box Rakeback", tda, 2, 0xff9933, true);
        addText(23728, "Current progress 5/10", tda, 2, 0xff9933, false);
        hoverButton(23729, dir, "Claim", 1, 2);
        get(23729).buttonListener = (id) -> {
            if(id == 23729) {
                Client.instance.pushMessage("Clicked claim [23729]");
            }
        };
        addText(23730, "Claim", tda, 2, 0xff9933, false);

        addItemContainer(23732, 6, 9, 4, 4, true,
                false);

        hoverButton(23733, dir, "Open", 3, 4);
        hoverButton(23734, dir, "Open", 5, 6);
        hoverButton(23735, dir, "Open", 7, 8);
        hoverButton(23736, dir, "Open", 3, 4);
        hoverButton(23737, dir, "Open", 3, 4);
        hoverButton(23738, dir, "Open", 3, 4);

        hoverButton(23739, dir, "Open", 3, 4);
        hoverButton(23740, dir, "Open", 5, 6);
        hoverButton(23741, dir, "Open", 7, 8);
        hoverButton(23742, dir, "Open", 3, 4);
        hoverButton(23743, dir, "Open", 3, 4);
        hoverButton(23744, dir, "Open", 3, 4);


        hoverButton(23745, dir, "Spin", 9, 10);
        hoverButton(23746, dir, "Quickspin", 9, 10);

        addText(23747, "Spin", tda, 1, 0xff9933, false);
        addText(23748, "Quick Spin", tda, 1, 0xff9933, false);

        main.totalChildren(28);

        main.child(0, 23724, 10, 10);
        main.child(1, 23725, 260, 20);
        main.child(2, 22753, 487, 19); //close button from pet perk

        main.child(3, 23726, 140, 54);
        main.child(4, 23727, 380, 54);
        main.child(5, 23728, 269, 80);
        main.child(6, 23729, 425, 76);
        main.child(7, 23730, 442, 78);
        main.child(8, 23731, 27, 75);

        main.child(9, 23733, 279, 110);
        main.child(10, 23734, 314, 110);
        main.child(11, 23735, 349, 110);
        main.child(12, 23736, 384, 110);
        main.child(13, 23737, 419, 110);
        main.child(14, 23738, 454, 110);

        main.child(15, 23739, 279, 156);
        main.child(16, 23740, 314, 156);
        main.child(17, 23741, 349, 156);
        main.child(18, 23742, 384, 156);
        main.child(19, 23743, 419, 156);
        main.child(20, 23744, 454, 156);
        main.child(21, 47200, 17, 213);
        main.child(22, 47100, 24, 218);
        main.child(23, 47010, 260, 213);
        main.child(24, 23745, 175, 278);
        main.child(25, 23746, 300, 278);
        main.child(26, 23747, 218, 284);
        main.child(27, 23748, 317, 284);



        RSInterface availableRewards = addInterface(23731);
        availableRewards.width = 215;
        availableRewards.height = 121;
        availableRewards.scrollMax = 325;
        availableRewards.totalChildren(1);
        availableRewards.child(0, 23732, 0, 0);
    }
}
