package com.client.instruction.impl;


import com.client.Client;
import com.client.graphics.interfaces.RSInterface;
import com.client.instruction.InstructionArgs;
import com.client.instruction.VoidInstruction;

public class SetPetManagementNpc implements VoidInstruction {

    @Override
    public Void invoke(InstructionArgs args) {
        int id = args.getNextInt();
        RSInterface.get(22748).widgetPet = id;
        RSInterface.get(22748).animationFrame = 0;
        RSInterface.get(22748).animationCycle = 0;
        return null;
    }
}
