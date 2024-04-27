package com.client.definitions;

import com.client.Buffer;
import com.client.EvictingDualNodeHashTable;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;

public class HealthBarDefinition extends DualNode {
    public static EvictingDualNodeHashTable cache = new EvictingDualNodeHashTable(64);
    public static EvictingDualNodeHashTable sprites = new EvictingDualNodeHashTable(64);

    public static HealthBarDefinition lookup(int id) {
        HealthBarDefinition healthBarDefinition = (HealthBarDefinition) cache.get(id);
        if(healthBarDefinition == null) {
            healthBarDefinition = new HealthBarDefinition();
            healthBarDefinition.id = id;
            healthBarDefinition.setDefaults();
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.HEALTHBAR, id);
            if(data != null) {
                healthBarDefinition.decode(new Buffer(data));
                cache.put(healthBarDefinition, id);
            }
        }
        return healthBarDefinition;
    }
    public void setDefaults() {
        int1 = 255;
        int2 = 255;
        int3 = -1;
        int4 = 70;
        frontspriteId = -1;
        backSpriteId = -1;
        width = 30;
        widthPadding = 0;
    }

    public void decode(Buffer buffer) {
        while (true) {
            int opcode = buffer.readUnsignedByte();
            if (opcode == 0)
                return;
            if(opcode == 1) {
                buffer.readUnsignedShort();
            }
            if(opcode == 2) {
                int1 = (short) buffer.readUnsignedByte();
            }
            if(opcode == 3) {
                int2 = (short) buffer.readUnsignedByte();
            }
            if(opcode == 4) {
                int3 = 0;
            }
            if(opcode == 5) {
                int4 = buffer.readUnsignedShort();
            }
            if(opcode == 6) {
                buffer.readUnsignedByte();
            }
            if(opcode == 7) {
                frontspriteId = buffer.readUnsignedShort();
            }
            if(opcode == 8) {
                backSpriteId = buffer.readUnsignedShort();
            }
            if(opcode == 11) {
                int3 = buffer.readUnsignedShort();
            }
            if(opcode == 14) {
                width = buffer.readUnsignedByte();
            }
            if(opcode == 15) {
                widthPadding = buffer.readUnsignedByte();
            }
        }
    }


    public int id;
    public short int1;
    public short int2;
    public int int3;
    public int int4;
    public int frontspriteId;
    public int backSpriteId;
    public int width;
    public int widthPadding;

    public int field2061;
}
