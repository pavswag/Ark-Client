package com.client.graphics.interfaces.impl.castle_wars;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.RSInterfaceConstants;

public class LoadoutSelection extends RSInterface {

    private static final int BASE_X = 35;
    private static final int BASE_Y = 15;

    public static void loadoutSelection(TextDrawingArea[] tda) {
        RSInterface main = addInterface(27550);

        addSprite(27551, 1, "widget/background");
        addText(27552, "Select Your Loadout", tda, 2, 0xff9933, true);

        RSInterface.addRectangle(27553, 100, 55, 0x221e1a, 0, true);
        get(27553).secondaryColor = 0x252220;
        get(27553).atActionType = 1;
        get(27553).tooltip = "<col=ff9933>Select Melee!";
        addText(27554, "<icon=134> Melee <icon=134>", tda, 2, 0xff9933, true);



        RSInterface.addRectangle(27555, 100, 55, 0x221e1a, 0, true);
        get(27555).secondaryColor = 0x252220;
        get(27555).atActionType = 1;
        get(27555).tooltip = "<col=ff9933>Select Range!";
        addText(27556, "<icon=137> Range <icon=137> ", tda, 2, 0xff9933, true);




        RSInterface.addRectangle(27557, 100, 55, 0x221e1a, 0, true);
        get(27557).secondaryColor = 0x252220;
        get(27557).atActionType = 1;
        get(27557).tooltip = "<col=ff9933>Select Magic!";
        addText(27558, "<icon=139> Magic <icon=139> ", tda, 2, 0xff9933, true);


        addText(27559, "Currently Selected: <icon=139> Magic <icon=139> ", tda, 2, 0xff9933, true);


        hoverButton(27560, "votereminder/sprite", "Confirm", 3, 4);
        interfaceCache.get(27560).message = "Confirm";
        interfaceCache.get(27560).textColor = RSInterfaceConstants.ORANGE;
        interfaceCache.get(27560).msgX =  interfaceCache.get(27560).width / 2;
        interfaceCache.get(27560).msgY = (interfaceCache.get(27560).height / 2) + 4;

        main.child(0, 27551, BASE_X, BASE_Y);
        main.child(1, 27552, BASE_X + 225, BASE_Y + 7);

        main.child(2, 27553, BASE_X + 25, BASE_Y + 135);
        main.child(3, 27554, BASE_X + 80, BASE_Y + 155);

        main.child(4, 27555, BASE_X + 170, BASE_Y + 135);
        main.child(5, 27556, BASE_X + 225, BASE_Y + 155);

        main.child(6, 27557, BASE_X + 315, BASE_Y + 135);
        main.child(7, 27558, BASE_X + 370, BASE_Y + 155);

        main.child(8, 27559, BASE_X + 225, BASE_Y + 75);
        main.child(9, 27560, BASE_X + 185, BASE_Y + 235);
    }
}
