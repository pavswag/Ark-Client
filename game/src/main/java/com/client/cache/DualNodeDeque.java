package com.client.cache;

import net.runelite.rs.api.RSDualNodeDeque;

public final class DualNodeDeque implements RSDualNodeDeque {

    DualNode sentinel = new DualNode();

    public DualNodeDeque() {
        this.sentinel.previousDual = this.sentinel;
        this.sentinel.nextDual = this.sentinel;
    }

    public void addFirst(DualNode var1) {
        if (var1.nextDual != null) {
            var1.removeDual();
        }

        var1.nextDual = this.sentinel.nextDual;
        var1.previousDual = this.sentinel;
        var1.nextDual.previousDual = var1;
        var1.previousDual.nextDual = var1;
    }

    public void addLast(DualNode var1) {
        if (var1.nextDual != null) {
            var1.removeDual();
        }

        var1.nextDual = this.sentinel;
        var1.previousDual = this.sentinel.previousDual;
        var1.nextDual.previousDual = var1;
        var1.previousDual.nextDual = var1;
    }

    public DualNode removeLast() {
        DualNode var1 = this.sentinel.previousDual;
        return var1 == this.sentinel ? null : var1;
    }
}

