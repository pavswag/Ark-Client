package com.client.instruction.impl;


import com.client.Client;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.impl.health_hud.HealthHud;
import com.client.instruction.InstructionArgs;
import com.client.instruction.VoidInstruction;

import static com.client.Client.instance;
import static com.client.graphics.interfaces.impl.health_hud.HealthHud.*;
import static com.client.graphics.interfaces.impl.health_hud.HealthHud.HudType.values;

public class SetHealthHud implements VoidInstruction {

    @Override
    public Void invoke(InstructionArgs args) {
        int type = args.getNextInt();
        int currentHealth = args.getNextInt();
        int maxHealth = args.getNextInt();
        if (type >= 0 || type < values().length)
            setHudType(values()[type]);
        RSInterface header = interfaceCache.get(HEADER_ID);
        header.message = args.getNextString();
        if (maxHealth == 0) {
            interfaceCache.get(PROGRESS_WIDGET_ID).message = "";
        } else {
            interfaceCache.get(PROGRESS_WIDGET_ID).message = currentHealth + "/" + maxHealth;
        }
        healthHudTimeoutTick = instance.getGameCycle() + (50 * 5);
        return null;
    }
}