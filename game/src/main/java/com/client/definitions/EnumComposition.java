package com.client.definitions;

import com.client.Buffer;
import com.client.EvictingDualNodeHashTable;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;

public class EnumComposition extends DualNode implements net.runelite.api.EnumComposition {
    static EvictingDualNodeHashTable EnumDefinition_cached;
    public char inputType;
    public char outputType;
    public String defaultStr;
    public int defaultInt;
    public int outputCount;
    public int[] keys;
    public int[] intVals;
    public String[] strVals;

    public static EnumComposition getEnum(int var0) {
        EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = Js5List.configs.takeFile(Js5ConfigType.ENUM, var0);
            var1 = new EnumComposition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }

            EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
            return var1;
        }
    }

    static {
        EnumDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    EnumComposition() {
        this.defaultStr = "null";
        this.outputCount = 0;
    }

    void decode(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.decodeNext(var1, var2);
        }
    }

    void decodeNext(Buffer var1, int var2) {
        if (var2 == 1) {
            this.inputType = (char)var1.readUnsignedByte();
        } else if (var2 == 2) {
            this.outputType = (char)var1.readUnsignedByte();
        } else if (var2 == 3) {
            this.defaultStr = var1.readStringCp1252NullTerminated();
        } else if (var2 == 4) {
            this.defaultInt = var1.readInt();
        } else {
            int var3;
            if (var2 == 5) {
                this.outputCount = var1.readUnsignedShort();
                this.keys = new int[this.outputCount];
                this.strVals = new String[this.outputCount];

                for (var3 = 0; var3 < this.outputCount; ++var3) {
                    this.keys[var3] = var1.readInt();
                    this.strVals[var3] = var1.readStringCp1252NullTerminated();
                }
            } else if (var2 == 6) {
                this.outputCount = var1.readUnsignedShort();
                this.keys = new int[this.outputCount];
                this.intVals = new int[this.outputCount];

                for (var3 = 0; var3 < this.outputCount; ++var3) {
                    this.keys[var3] = var1.readInt();
                    this.intVals[var3] = var1.readInt();
                }
            }
        }
    }

    public int size() {
        return this.outputCount;
    }

    @Override
    public int[] getKeys() {
        return this.keys;
    }

    @Override
    public int[] getIntVals() {
        return intVals;
    }

    @Override
    public String[] getStringVals() {
        return strVals;
    }

    @Override
    public int getIntValue(int key) {
        return intVals[key];
    }

    @Override
    public String getStringValue(int key) {
        return strVals[key];
    }
}