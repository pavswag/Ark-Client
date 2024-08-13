package com.client.graphics.interfaces.impl;

import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;

public class UpdateBooth extends RSInterface {

    private static final int BASE_X = 35;
    private static final int BASE_Y = 15;

    public static void mainInterface(TextDrawingArea[] tda) {
        RSInterface main = addInterface(25_500);
        addSprite(25_501, 1, "widget/background");
        addText(25_502, "Kyros Update Booth", tda, 2, 0xff9933, true);

        RSInterface scroll = addInterface(25_525);
        scroll.totalChildren(1);
        scroll.width = 419;
        scroll.height = 284;
        scroll.scrollMax = 2550;
        int widget_id = 25_526;
        int rectangleY = 5;
        int titleY = 25;
        int descriptionY = 49;
        int childId = 0;
        int buttonY = 210;
        for (int i = 0; i < 10; i++) {
            addRectangle(widget_id, 419, 245, 0x221e1a, 0, true);
            get(widget_id).secondaryColor = 0x252220;
            System.out.println("Rectangle - ID: " + widget_id + ", Index: " + i);
            scroll.child(childId++, widget_id++, 0, rectangleY);
            rectangleY += 250;

            addText(widget_id, "<currentY=0>A poll title", tda, 2, 0xff9933, true);
            System.out.println("Text (Title) - ID: " + widget_id + ", Index: " + i);
            scroll.child(childId++, widget_id++, 209, titleY);
            titleY += 250;

            addText(widget_id, "A test poll with a test description. This system will be used sometimes when we need reliable results from the active community. You can only vote once per poll and your vote cannot be changed.", tda, 1, 0xff9933, true);
            get(widget_id).wrapText = true;
            get(widget_id).width = 380;
            System.out.println("Text (Description) - ID: " + widget_id + ", Index: " + i);
            scroll.child(childId++, widget_id++, 25, descriptionY);
            descriptionY += 250;

            hoverButton(widget_id, "Select This Option", 26, 26, "Upvote", tda, 1, 0xff981f, 0xffffff, true);
            System.out.println("Button (Upvote) - ID: " + widget_id + ", Index: " + i);
            scroll.child(childId++, widget_id++, 25, buttonY);

            hoverButton(widget_id, "Select This Option", 26, 26, "Downvote", tda, 1, 0xff981f, 0xffffff, true);
            System.out.println("Button (Downvote) - ID: " + widget_id + ", Index: " + i);
            scroll.child(childId++, widget_id++, 255, buttonY);

            buttonY += 250;
        }

        main.child(0, 25_501, BASE_X, BASE_Y);
        main.child(1, 25_502, BASE_X + 225, BASE_Y + 7);
        main.child(2, 22753, BASE_X + 425, BASE_Y + 7);
        main.child(3, 25_525, BASE_X + 9, BASE_Y + 29);
    }
}
