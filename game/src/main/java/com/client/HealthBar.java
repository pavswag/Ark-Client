package com.client;

import com.client.definitions.HealthBarDefinition;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public class HealthBar extends Node {
    public HealthBarDefinition definition;
    public IterableNodeDeque updates;

    HealthBar(HealthBarDefinition var1) {
        this.updates = new IterableNodeDeque();
        this.definition = var1;
    }

    @ObfuscatedName("az")
    @ObfuscatedSignature(
            descriptor = "(IIIII)V",
            garbageValue = "686447738"
    )
    @Export("put")
    void put(int cycle, int healthBarEndCycle, int healthBarCycleOffset, int barValue) {
        HealthBarUpdate var5 = null;
        int var6 = 0;

        for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
            ++var6;
            if (var7.cycle == cycle) {
                var7.set(cycle, healthBarEndCycle, healthBarCycleOffset, barValue);
                return;
            }

            if (var7.cycle <= cycle) {
                var5 = var7;
            }
        }

        if (var5 == null) {
            if (var6 < 4) {
                this.updates.addLast(new HealthBarUpdate(cycle, healthBarEndCycle, healthBarCycleOffset, barValue));
            }

        } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(cycle, healthBarEndCycle, healthBarCycleOffset, barValue), var5);
            if (var6 >= 4) {
                this.updates.last().remove();
            }

        }
    }

    @ObfuscatedName("ah")
    @ObfuscatedSignature(
            descriptor = "(II)Ldz;",
            garbageValue = "-2125078330"
    )
    @Export("get")
    HealthBarUpdate get(int var1) {
        HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
        if (var2 != null && var2.cycle <= var1) {
            for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
                var2.remove();
                var2 = var3;
            }

            if (this.definition.int4 + var2.cycle + var2.barValue > var1) {
                return var2;
            } else {
                var2.remove();
                return null;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "987709331"
    )
    @Export("isEmpty")
    boolean isEmpty() {
        return this.updates.method7356();
    }
}
