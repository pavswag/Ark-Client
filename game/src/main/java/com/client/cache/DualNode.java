package com.client.cache;

import com.client.Node;
import net.runelite.rs.api.RSDualNode;

public class DualNode extends Node implements RSDualNode {

    public transient long keyDual;

    public transient DualNode previousDual;

    public transient DualNode nextDual;

    public void removeDual() {
        if (this.nextDual != null) {
            this.nextDual.previousDual = this.previousDual;
            this.previousDual.nextDual = this.nextDual;
            this.previousDual = null;
            this.nextDual = null;
        }
    }

    @Override
    public RSDualNode previousDual() {
        return previousDual;
    }

    @Override
    public void unlinkDual() {
        removeDual();
    }
}

