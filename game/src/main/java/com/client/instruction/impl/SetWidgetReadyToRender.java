package com.client.instruction.impl;


import com.client.graphics.interfaces.RSInterface;
import com.client.instruction.InstructionArgs;
import com.client.instruction.VoidInstruction;

public class SetWidgetReadyToRender implements VoidInstruction {

    @Override
    public Void invoke(InstructionArgs args) {
        boolean ready = args.getNextBool();
        int widget = args.getNextInt();
        if(RSInterface.interfaceCache.containsKey(widget)) {
            RSInterface.interfaceCache.get(widget).readyToRender = ready;
        }
        return null;
    }
}
