package com.client.cache;

import com.client.Node;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

public class ObjectNode extends Node {
    public final Object obj;

    public ObjectNode(Object var1) {
        this.obj = var1;
    }
}
