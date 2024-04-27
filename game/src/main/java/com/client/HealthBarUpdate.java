package com.client;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public class HealthBarUpdate extends Node {
    public int cycle;
    public int health;
    public int cycleOffset;
    public int health2;

    HealthBarUpdate(int var1, int var2, int var3, int var4) {
        this.cycle = var1;
        this.health = var2;
        this.health2 = var3;
        this.cycleOffset = var4;
    }

    void set(int var1, int var2, int var3, int var4) {
        this.cycle = var1;
        this.health = var2;
        this.health2 = var3;
        this.cycleOffset = var4;
    }
}
