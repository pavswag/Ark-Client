package com.client.graphics.interfaces.impl;

import com.client.Client;
import com.client.TextDrawingArea;
import com.client.graphics.interfaces.RSInterface;

import java.util.Objects;

public class VoteManagementInterface extends RSInterface {
    public static void voteManagement(TextDrawingArea[] tda) {
        RSInterface widget = addInterface(23750);
        addSprite(23751, 1, "Interfaces/Shop/IMAGE");
        addText(23752, "Vote Management", tda, 2, 0xFFA500, false, true);
        /**
         * Top 5 Weekly Voters
         */
        addRectangle(23753, 215, 218, 0x221e1a, 0, true);
        addText(23754, "Top 5 Weekly Voters", tda, 1, 0xFFA500, true, true);
        addRectangle(23755, 215, 3, 0x252220, 0, true);

        RSInterface.addRectangle(23756, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23756)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23756)).atActionType = 1;
        Objects.requireNonNull(get(23756)).tooltip = "<col=ff9933>View Weekly Wins!";
        Objects.requireNonNull(get(23756)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };

        RSInterface.addRectangle(23757, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23757)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23757)).atActionType = 1;
        Objects.requireNonNull(get(23757)).tooltip = "<col=ff9933>View Weekly Wins!";
        Objects.requireNonNull(get(23757)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };

        RSInterface.addRectangle(23758, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23758)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23758)).atActionType = 1;
        Objects.requireNonNull(get(23758)).tooltip = "<col=ff9933>View Weekly Wins!";
        Objects.requireNonNull(get(23758)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };

        RSInterface.addRectangle(23759, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23759)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23759)).atActionType = 1;
        Objects.requireNonNull(get(23759)).tooltip = "<col=ff9933>View Weekly Wins!";
        Objects.requireNonNull(get(23759)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };

        RSInterface.addRectangle(23760, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23760)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23760)).atActionType = 1;
        Objects.requireNonNull(get(23760)).tooltip = "<col=ff9933>View Weekly Wins!";
        Objects.requireNonNull(get(23760)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };


        addText(23761, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);
        addText(23762, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);
        addText(23763, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);
        addText(23764, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);
        addText(23765, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);

        addItemContainer(23766, 6, 1, 4, 4, true,
                true);
        get(23766).forceInvStackSizes = true;
        addItemContainer(23767, 6, 1, 4, 4, true,
                true);
        get(23766).forceInvStackSizes = true;
        addItemContainer(23768, 6, 1, 4, 4, true,
                true);
        get(23766).forceInvStackSizes = true;
        addItemContainer(23769, 6, 1, 4, 4, true,
                true);
        get(23766).forceInvStackSizes = true;
        addItemContainer(23770, 6, 1, 4, 4, true,
                true);
        get(23766).forceInvStackSizes = true;

        /**
         * Top 5 Monthly Voters
         */
        addRectangle(23771, 215, 218, 0x221e1a, 0, true);
        addText(23772, "Top 5 Monthly Voters", tda, 1, 0xFFA500, true, true);
        addRectangle(23773, 215, 3, 0x252220, 0, true);

        RSInterface.addRectangle(23774, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23774)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23774)).atActionType = 1;
        Objects.requireNonNull(get(23774)).tooltip = "<col=ff9933>View Monthly Wins!";
        Objects.requireNonNull(get(23774)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };

        RSInterface.addRectangle(23775, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23775)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23775)).atActionType = 1;
        Objects.requireNonNull(get(23775)).tooltip = "<col=ff9933>View Monthly Wins!";
        Objects.requireNonNull(get(23775)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };

        RSInterface.addRectangle(23776, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23776)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23776)).atActionType = 1;
        Objects.requireNonNull(get(23776)).tooltip = "<col=ff9933>View Monthly Wins!";
        Objects.requireNonNull(get(23776)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };

        RSInterface.addRectangle(23777, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23777)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23777)).atActionType = 1;
        Objects.requireNonNull(get(23777)).tooltip = "<col=ff9933>View Monthly Wins!";
        Objects.requireNonNull(get(23777)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };

        RSInterface.addRectangle(23778, 215, 36, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23778)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23778)).atActionType = 1;
        Objects.requireNonNull(get(23778)).tooltip = "<col=ff9933>View Monthly Wins!";
        Objects.requireNonNull(get(23778)).buttonListener = (id) -> {
            Client.instance.pushMessage("Coming soon!");
        };


        addText(23779, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);
        addText(23780, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);
        addText(23781, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);
        addText(23782, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);
        addText(23783, "N/A - 0 Votes", tda, 0, 0xFFA500, true, true);

        addItemContainer(23784, 6, 1, 4, 4, true,
                true);
        addItemContainer(23785, 6, 1, 4, 4, true,
                true);
        addItemContainer(23786, 6, 1, 4, 4, true,
                true);
        addItemContainer(23787, 6, 1, 4, 4, true,
                true);
        addItemContainer(23788, 6, 1, 4, 4, true,
                true);

        RSInterface.addRectangle(23789, 105, 40, 0x3A332A, 0, true);
        Objects.requireNonNull(get(23789)).secondaryColor = 0x413A2F;
        Objects.requireNonNull(get(23789)).atActionType = 1;
        Objects.requireNonNull(get(23789)).tooltip = "<col=ff9933>Open Vote Shop!";
        addText(23790, "Vote Shop", tda, 2, 0xFFA500, true, true);

        widget.totalChildren(41);
        widget.child(0, 23751, 10, 10);
        widget.child(1, 23752, 210, 20);
        widget.child(2, 22753, 486, 19);


        widget.child(3, 23753, 19, 49);
        widget.child(4, 23754, 120, 56);
        widget.child(5, 23755, 19, 79);

        widget.child(6, 23756, 19, 82);
        widget.child(7, 23757, 19, 119);
        widget.child(8, 23758, 19, 156);
        widget.child(9, 23759, 19, 193);
        widget.child(10, 23760, 19, 230);

        widget.child(11, 23761, 126, 85);
        widget.child(12, 23762, 126, 122);
        widget.child(13, 23763, 126, 159);
        widget.child(14, 23764, 126, 196);
        widget.child(15, 23765, 126, 233);

        widget.child(16, 23766, 24, 99);
        widget.child(17, 23767, 24, 136);
        widget.child(18, 23768, 24, 173);
        widget.child(19, 23769, 24, 209);
        widget.child(20, 23770, 24, 247);


        widget.child(21, 23771, 19 + 268, 49);
        widget.child(22, 23772, 120 + 268, 56);
        widget.child(23, 23773, 19 + 268, 79);

        widget.child(24, 23774, 19 + 268, 82);
        widget.child(25, 23775, 19 + 268, 119);
        widget.child(26, 23776, 19 + 268, 156);
        widget.child(27, 23777, 19 + 268, 193);
        widget.child(28, 23778, 19 + 268, 230);

        widget.child(29, 23779, 126 + 268, 85);
        widget.child(30, 23780, 126 + 268, 122);
        widget.child(31, 23781, 126 + 268, 159);
        widget.child(32, 23782, 126 + 268, 196);
        widget.child(33, 23783, 126 + 268, 233);

        widget.child(34, 23784, 24 + 268, 99);
        widget.child(35, 23785, 24 + 268, 136);
        widget.child(36, 23786, 24 + 268, 173);
        widget.child(37, 23787, 24 + 268, 209);
        widget.child(38, 23788, 24 + 268, 247);


        widget.child(39, 23789, 210, 275);
        widget.child(40, 23790, 260, 288);


        /**
         * Vote Shop
         */
        RSInterface shop = addInterface(23800);
        addSprite(23801, 1, "Interfaces/Shop/IMAGE");
        addText(23802, "Vote Shop", tda, 2, 0xFFA500, false, true);


        RSInterface availableRewards = addInterface(23803);
        availableRewards.width = 470;
        availableRewards.height = 270;
        availableRewards.scrollMax = 67 * 30;
        availableRewards.totalChildren(30 * 4);

        shop.totalChildren(4);
        shop.child(0, 23801, 10, 10);
        shop.child(1, 23802, 210, 20);
        shop.child(2, 22753, 486, 19);
        shop.child(3, 23803, 19, 49);
        int childIdx = 0;
        int widgetId = 23804;
        int baseY = 5;
        for(int i = 0; i < 30; i++) {
            RSInterface.addRectangle(widgetId, 465, 65, 0x3A332A, 0, true);
            Objects.requireNonNull(get(widgetId)).secondaryColor = 0x413A2F;
            Objects.requireNonNull(get(widgetId)).atActionType = 1;
            Objects.requireNonNull(get(widgetId)).tooltip = "<col=ff9933>Buy Item!";
            availableRewards.child(childIdx++, widgetId++, 3, 1 + baseY);

            addText(widgetId, "An item for the books you know, you vote and you get rewarded", tda, 1, 0xFFA500, true, true);
            availableRewards.child(childIdx++, widgetId++, 230, 45 + baseY);

            addItemContainer(widgetId, 1, 1, 4, 4, true,
                    false);
            availableRewards.child(childIdx++, widgetId++, 218, 5 + baseY);

            addText(widgetId, "Costs 100 Vote Points", tda, 0, 0xFFA500, true, true);
            availableRewards.child(childIdx++, widgetId++, 390, 10 + baseY);

            baseY += 67;
        }
    }
}
