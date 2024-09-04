package com.client.instruction.impl;


import com.client.instruction.InstructionArgs;
import com.client.instruction.VoidInstruction;

import java.util.Arrays;

import static com.client.graphics.interfaces.RSInterface.interfaceCache;

public class ResetAchievementData implements VoidInstruction {

    @Override
    public Void invoke(InstructionArgs args) {
        int name = 100_002;
        int progress = 100_003;
        int rewards = 100_004;
        for (int i = 0; i < 100; i++) {
            interfaceCache.get(name).message = "";
            interfaceCache.get(progress).message = "";
            Arrays.fill(interfaceCache.get(rewards).inventoryItemId, -1);
            Arrays.fill(interfaceCache.get(rewards).inventoryAmounts, -1);
            name+=6;
            progress+=6;
            rewards+=6;
        }
        return null;
    }
}
