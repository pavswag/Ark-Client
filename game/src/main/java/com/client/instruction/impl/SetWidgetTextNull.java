package com.client.instruction.impl;


import com.client.graphics.interfaces.RSInterface;
import com.client.instruction.InstructionArgs;
import com.client.instruction.ScriptRuntimeException;
import com.client.instruction.VoidInstruction;
import lombok.SneakyThrows;

import java.util.Objects;

public class SetWidgetTextNull implements VoidInstruction {

    @SneakyThrows
    @Override
    public Void invoke(InstructionArgs args) {
        int startInterfaceId = args.getNextInt();
        int lengthExclusive = args.getNextInt();

        for (int i = 0; i < lengthExclusive; i++) {
            if(RSInterface.get(startInterfaceId + i) != null) {
                try {
                    Objects.requireNonNull(RSInterface.get(startInterfaceId + i)).message = "";
                } catch (Exception e) {
                    throw new ScriptRuntimeException("Widget [" + (startInterfaceId + i) + "] is null");
                }
            }
        }
        return null;
    }
}