package com.client.graphics.interfaces.impl;

import com.client.Client;
import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

public class PetPerk extends RSInterface {

    private static String dir = "pet_perk/sprite";

    public static final int widgetId = 22731;


    public static void mainInterface(TextDrawingArea[] tda) {
        RSInterface main = addInterface(22731);
        addSprite(22732, 0, dir);
        get(22732).sprite1.advancedSprite = true;
        addText(22733, "Pet Perks", tda, 2, 0xff9933, true);

        RSInterface.addRectangle(22734, 144, 93, 0x221e1a, 0, true);
        get(22734).secondaryColor = 0x252220;
        get(22734).atActionType = 1;
        get(22734).tooltip = "<col=ff9933>Find out about perks!";
        get(22734).buttonListener = (id) -> {
            if(id == 22734) {
                get(widgetId).actionsDisabled = true;
                get(39350).interfaceHidden = false;
            }
        };



        addText(22735, "Click Here for \\nperk descriptions", tda, 2, 0xff9933, true);

        hoverButton(22736, dir, "Upgrade Perk", 1, 2);
        hoverButton(22737, dir, "Upgrade Perk", 1, 2);
        hoverButton(22738, dir, "Upgrade Perk", 1, 2);
        hoverButton(22739, dir, "Upgrade Perk", 1, 2);
        hoverButton(22740, dir, "Upgrade Perk", 1, 2);


        hoverButton(22761, dir, "Re-roll Perk", 27, 28);
        hoverButton(22762, dir, "Re-roll Perk", 27, 28);
        hoverButton(22763, dir, "Re-roll Perk", 27, 28);
        hoverButton(22764, dir, "Re-roll Perk", 27, 28);
        hoverButton(22765, dir, "Re-roll Perk", 27, 28);


        addSprite(22741, 3, dir);
        get(22741).sprite1.advancedSprite = true;

        addText(22742, "<col=ff9933>Perk name</col>\\n<col=ffffff>Level: 1</col>", tda, 1, 0, false);
        addText(22743, "", tda, 1, 0, false);
        addText(22744, "", tda, 1, 0, false);
        addText(22745, "", tda, 1, 0, false);
        addText(22746, "", tda, 1, 0, false);

        addText(22747, "<col=ff9933>Vote Pet", tda, 2, 0, true);
        addPet(22748, 327);
        get(22748).widgetPet = 327;

        addRectangle(22749, 144, 68, 0x221e1a, 0, true);
        get(22749).secondaryColor = 0x252220;
        get(22749).atActionType = 1;
        get(22749).tooltip = "<col=ff9933>Find out about your pet!";
        get(22749).buttonListener = (id) -> {
            if(id == 22749) {
                get(widgetId).actionsDisabled = true;
                get(48848).interfaceHidden = false;
            }
        };
        addText(22750, "Found out more\\nabout your pet here!", tda, 2, 0xff9933, true);
        addText(22751, "Cosmetic Overrides", tda, 2, 0xff9933, true);
        addText(22752, "Pet Information", tda, 2, 0xff9933, true);
        hoverButton(22753, dir, "Dismiss", 4, 5);
        get(22753).buttonListener = (id) -> {
            if(id == 22753) {
                Client.closeInterface();
            }
        };
        addText(22754, "Level", tda, 2, 0xff9933, true);
        addText(22755, "Current XP", tda, 2, 0xff9933, true);
        addText(22756, "XP Until Level", tda, 2, 0xff9933, true);

        RSInterface.addRectangle(22757, 177, 265, 0x221e1a, 1, true);
        get(22757).atActionType = 1;
        get(22757).tooltip = "<col=ff9933>Hide your pet";


        main.totalChildren(34);

        main.child(0, 22732, 5, 5);
        main.child(1, 22733, 256, 14);
        main.child(2, 22734, 351, 217);
        main.child(3, 22735, 423, 244);
        main.child(4, 22736, 465, 47);
        main.child(5, 22737, 465, 47 + (34 * 1));
        main.child(6, 22738, 465, 47 + (34 * 2));
        main.child(7, 22739, 465, 47 + (34 * 3));
        main.child(8, 22740, 465, 47 + (34 * 4));
        main.child(9, 22761, 438, 47);
        main.child(10, 22762, 438, 47 + (34 * 1));
        main.child(11, 22763, 438, 47 + (34 * 2));
        main.child(12, 22764, 438, 47 + (34 * 3));
        main.child(13, 22765, 438, 47 + (34 * 4));
        main.child(14, 22741, 353, 219);

        main.child(15, 22742, 352, 47 + (34 * 0));
        main.child(16, 22743, 352, 47 + (34 * 1));
        main.child(17, 22744, 352, 47 + (34 * 2));
        main.child(18, 22745, 352, 47 + (34 * 3));
        main.child(19, 22746, 352, 47 + (34 * 4));

        main.child(20, 22747, 255, 47 + (34 * 0));
        main.child(21, 22757, 166, 43);
        main.child(22, 22748, 190, 105);
        main.child(23, 22749, 17, 117);
        main.child(24, 22750, 88, 135);
        main.child(25, 22751, 88, 191);
        main.child(26, 22752, 88, 47);
        main.child(27, 22753, 480, 15);
        main.child(28, 22754, 45, 73);
        main.child(29, 22755, 118, 73);
        main.child(30, 22756, 86, 98);
        main.child(31, 24974, 17, 211);
        main.child(32, 48848, 0, 0);
        main.child(33, 39350, 0, 0);


        RSInterface petDescription = addInterface(48848);
        get(48848).interfaceHidden = true;

        addBox(48849, 514, 337, 1, 0, 0, 210);
        get(48849).coverWholeScreen = true;
        addBox(48850, 370, 285, 1, 0, 0x221e1a, 255);

        hoverButton(48851, dir, "Return", 25, 26);
        get(48851).buttonListener = (id) -> {
            if(id == 48851) {
                get(widgetId).actionsDisabled = false;
                get(48848).interfaceHidden = true;
            }
        };
        addBox(48850, 370, 285, 1, 0, 0x221e1a, 255);


        addBox(48852, 355, 105, 1, 0, 0x252220, 255);
        RSInterface petDescriptionText = addInterface(48853);
        petDescriptionText.width = 336;
        petDescriptionText.height = 105;
        petDescriptionText.scrollMax = 350;
        petDescriptionText.totalChildren(1);
        petDescriptionText.child(0, 48854, 5, 5);
        addText(48854, "The Vote Genie Pet is a beloved pet on Kyros, obtaining with a rare chance upon claiming a vote or purchased from the vote store.", tda, 2, 0xff9933, true);
        get(48854).wrapText = true;
        get(48854).width = 315;

        petDescription.totalChildren(7);

        petDescription.child(0, 48849, 0, 0);
        petDescription.child(1, 48850, 90, 20);
        petDescription.child(2, 22747, 264, 27);
        petDescription.child(3, 22748, 190, 85);
        petDescription.child(4, 48851, 440, 25);
        petDescription.child(5, 48852, 100, 195);
        petDescription.child(6, 48853, 105, 195);

        RSInterface cosmeticOverrides = addInterface(24974);
        cosmeticOverrides.width = 128;
        cosmeticOverrides.height = 97;
        cosmeticOverrides.scrollMax = 810;
        cosmeticOverrides.totalChildren(62);
        int child = 0;
        for(int i = 24975; i <= 25020; i++) {
            int yPosition = (18 * (i - 24975));
            addRectangle(i, 98, 18, 0x221e1a, 0, true);
            get(i).secondaryColor = 0x252220;
            get(i).atActionType = 1;
            get(i).tooltip = "<col=ff9933>Summon Pet!";
            cosmeticOverrides.child(child++, i, 0, yPosition);
        }
        for(int i = 25006; i <= 25051; i++) {
            addText(i, "", tda, 0, 0xff9933, false);
            int yPosition = 3 + (18 * (i - 25006));
            cosmeticOverrides.child(child++, i, 2, yPosition);
        }



        petDescription = addInterface(39350);
        get(39350).interfaceHidden = true;
        addBox(39351, 370, 285, 1, 0, 0x221e1a, 255);

        hoverButton(39352, dir, "Return", 25, 26);
        get(39352).buttonListener = (id) -> {
            if(id == 39352) {
                get(widgetId).actionsDisabled = false;
                get(39350).interfaceHidden = true;
            }
        };


        addBox(39353, 370, 35, 1, 0, 0x252220, 255);
        addBox(39354, 226, 20, 1, 0, 0x252220, 255);
        addText(39355, "Perk Name - Level 1", tda, 2, 0xff9933, true);
        addText(39356, "Perk Description", tda, 0, 0xff9933, true);

        addBox(39357, 370, 35, 1, 0, 0x252220, 255);
        addBox(39358, 226, 20, 1, 0, 0x252220, 255);
        addText(39359, "Perk Name - Level 1", tda, 2, 0xff9933, true);
        addText(39360, "Perk Description", tda, 0, 0xff9933, true);

        addBox(39361, 370, 35, 1, 0, 0x252220, 255);
        addBox(39362, 226, 20, 1, 0, 0x252220, 255);
        addText(39363, "Perk Name - Level 1", tda, 2, 0xff9933, true);
        addText(39364, "Perk Description", tda, 0, 0xff9933, true);

        addBox(39365, 370, 35, 1, 0, 0x252220, 255);
        addBox(39366, 226, 20, 1, 0, 0x252220, 255);
        addText(39367, "Perk Name - Level 1", tda, 2, 0xff9933, true);
        addText(39368, "Perk Description", tda, 0, 0xff9933, true);

        addBox(39369, 370, 35, 1, 0, 0x252220, 255);
        addBox(39370, 226, 20, 1, 0, 0x252220, 255);
        addText(39371, "Perk Name - Level 1", tda, 2, 0xff9933, true);
        addText(39372, "Perk Description", tda, 0, 0xff9933, true);

        petDescription.totalChildren(23);

        petDescription.child(0, 48849, 0, 0);
        petDescription.child(1, 39351, 90, 20);
        petDescription.child(2, 39352, 440, 23);

        petDescription.child(3, 39353, 90, 40);
        petDescription.child(4, 39354, 175, 28);
        petDescription.child(5, 39355, 280, 30);
        petDescription.child(6, 39356, 280, 56);

        petDescription.child(7, 39357, 90, 40 + (54 * 1));
        petDescription.child(8, 39358, 175, 28 + (54 * 1));
        petDescription.child(9, 39359, 280, 30 + (54 * 1));
        petDescription.child(10, 39360, 280, 56 + (54 * 1));

        petDescription.child(11, 39361, 90, 40 + (54 * 2));
        petDescription.child(12, 39362, 175, 28 + (54 * 2));
        petDescription.child(13, 39363, 280, 30 + (54 * 2));
        petDescription.child(14, 39364, 280, 56 + (54 * 2));

        petDescription.child(15, 39365, 90, 40 + (54 * 3));
        petDescription.child(16, 39366, 175, 28 + (54 * 3));
        petDescription.child(17, 39367, 280, 30 + (54 * 3));
        petDescription.child(18, 39368, 280, 56 + (54 * 3));

        petDescription.child(19, 39369, 90, 40 + (54 * 4));
        petDescription.child(20, 39370, 175, 28 + (54 * 4));
        petDescription.child(21, 39371, 280, 30 + (54 * 4));
        petDescription.child(22, 39372, 280, 56 + (54 * 4));
    }

}
