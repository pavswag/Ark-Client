package com.client.graphics.interfaces.impl.castle_wars;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;

public class LoadoutSelection extends RSInterface {

    private static final int BASE_X = 35;
    private static final int BASE_Y = 15;

    public static void loadoutSelection(TextDrawingArea[] tda) {
        RSInterface main = addInterface(27550);

        addSprite(27551, 1, "selectloadout/sprite");
        addText(27552, "Select Your Loadout", tda, 2, 0xff9933, true);


        hoverButton(27553, "selectloadout/sprite", "<icon=134> Select Melee <icon=134>", 4, 5);
        addHoverImage(27554, 2, 3, "selectloadout/sprite");
        addText(27555, "<icon=134> Melee <icon=134>\\n" +
                "Dragon Scim\\nDragon Dag++\\nRune Armour", tda, 2, 0xff9933, true);

        hoverButton(27556, "selectloadout/sprite", "<icon=137> Select Range <icon=137>", 6, 7);
        addHoverImage(27557, 2, 3, "selectloadout/sprite");
        addText(27558, "<icon=137> Range <icon=137>\\n" +
                "Rune C'bow\\nBlack D'hide\\nRunite Bolts", tda, 2, 0xff9933, true);

        hoverButton(27559, "selectloadout/sprite", "<icon=139> Select Mage <icon=139>", 8, 9);
        addHoverImage(27560, 2, 3, "selectloadout/sprite");
        addText(27561, "<icon=139> Magic <icon=139>\\n" +
                "Mystic Robes\\nAncients", tda, 2, 0xff9933, true);

        addText(27562, "Currently Selected: <icon=139> Magic <icon=139> ", tda, 2, 0xff9933, false);

        hoverButton(27563, "selectloadout/sprite", "Confirm", 5, 5);

        main.child(0, 27551, BASE_X, BASE_Y);
        main.child(1, 27552, BASE_X + 175, BASE_Y + 9);

        main.child(2, 27553, BASE_X + 38, BASE_Y + 45);
        main.child(3, 27554, BASE_X + 16, BASE_Y + 85);
        main.child(4, 27555, BASE_X + 65, BASE_Y + 95);

        main.child(5, 27556, BASE_X + 148, BASE_Y + 45);
        main.child(6, 27557, BASE_X + 126, BASE_Y + 85);
        main.child(7, 27558, BASE_X + 175, BASE_Y + 95);

        main.child(8, 27559, BASE_X + 255, BASE_Y + 45);
        main.child(9, 27560, BASE_X + 236, BASE_Y + 85);
        main.child(10, 27561, BASE_X + 285, BASE_Y + 95);

        main.child(11, 27562, BASE_X + 25, BASE_Y + 195);
        main.child(12, 27563, BASE_X + 275, BASE_Y + 190);
    }
}
