package com.client.instruction.impl;


import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.impl.notification.Notification;
import com.client.graphics.interfaces.impl.notification.NotificationInterface;
import com.client.instruction.InstructionArgs;
import com.client.instruction.VoidInstruction;

public class SetWidgetWidth implements VoidInstruction {

    @Override
    public Void invoke(InstructionArgs args) {
        int width = args.getNextInt();
        int widget = args.getNextInt();
        if(RSInterface.interfaceCache.containsKey(widget)) {
            RSInterface.interfaceCache.get(widget).width = width;
            System.out.println("Got width for [" + widget + "] = " + RSInterface.interfaceCache.get(widget).width);
        }
        return null;
    }
}
