package com.client;

public class HealthBarUpdate extends Node {
    public int cycle;
    public int healthBarEndCycle;
    public int barValue;
    public int healthBarCycleOffset;

    HealthBarUpdate(int cycle, int healthBarEndCycle, int var3, int var4) {
        this.cycle = cycle;
        this.healthBarEndCycle = healthBarEndCycle;
        this.healthBarCycleOffset = var3;
        this.barValue = var4;
    }

    void set(int cycle, int healthBarEndCycle, int healthBarCycleOffset, int barValue) {
        this.cycle = cycle;
        this.healthBarEndCycle = healthBarEndCycle;
        this.healthBarCycleOffset = healthBarCycleOffset;
        this.barValue = barValue;
    }
}
