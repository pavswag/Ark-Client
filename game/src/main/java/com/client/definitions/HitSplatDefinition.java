package com.client.definitions;

import com.client.Buffer;
import com.client.Client;
import com.client.EvictingDualNodeHashTable;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

public class HitSplatDefinition extends DualNode {
    public static EvictingDualNodeHashTable cache = new EvictingDualNodeHashTable(64);
    public static EvictingDualNodeHashTable sprites = new EvictingDualNodeHashTable(64);
    public static EvictingDualNodeHashTable fonts = new EvictingDualNodeHashTable(20);

    public static HitSplatDefinition getHitSplatDefinition(int id) {
        HitSplatDefinition healthBarDefinition = (HitSplatDefinition) cache.get(id);
        if(healthBarDefinition == null) {
            healthBarDefinition = new HitSplatDefinition();
            healthBarDefinition.id = id;
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.HITSPLAT, id);
            if(data != null) {
                healthBarDefinition.decode(new Buffer(data));
                cache.put(healthBarDefinition, id);
            }
        }
        return healthBarDefinition;
    }
    public HitSplatDefinition() {
        this.fontId = -1;
        this.textColor = 16777215;
        this.field2227 = 70;
        this.field2228 = -1;
        this.field2239 = -1;
        this.field2236 = -1;
        this.field2231 = -1;
        this.field2232 = 0;
        this.field2233 = 0;
        this.field2234 = -1;
        this.field2230 = "";
        this.field2229 = -1;
        this.field2237 = 0;
        this.transformVarbit = -1;
        this.transformVarp = -1;
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
            this.fontId = var1.readNullableLargeSmart();
        } else if (var2 == 2) {
            this.textColor = var1.readMedium();
        } else if (var2 == 3) {
            this.field2228 = var1.readNullableLargeSmart();
        } else if (var2 == 4) {
            this.field2236 = var1.readNullableLargeSmart();
        } else if (var2 == 5) {
            this.field2239 = var1.readNullableLargeSmart();
        } else if (var2 == 6) {
            this.field2231 = var1.readNullableLargeSmart();
        } else if (var2 == 7) {
            this.field2232 = var1.readShort();
        } else if (var2 == 8) {
            this.field2230 = var1.readStringCp1252NullTerminated();
        } else if (var2 == 9) {
            this.field2227 = var1.readUnsignedShort();
        } else if (var2 == 10) {
            this.field2233 = var1.readShort();
        } else if (var2 == 11) {
            this.field2234 = 0;
        } else if (var2 == 12) {
            this.field2229 = var1.readUnsignedByte();
        } else if (var2 == 13) {
            this.field2237 = var1.readShort();
        } else if (var2 == 14) {
            this.field2234 = var1.readUnsignedShort();
        } else if (var2 == 17 || var2 == 18) {
            this.transformVarbit = var1.readUnsignedShort();
            if (this.transformVarbit == 65535) {
                this.transformVarbit = -1;
            }

            this.transformVarp = var1.readUnsignedShort();
            if (this.transformVarp == 65535) {
                this.transformVarp = -1;
            }

            int var3 = -1;
            if (var2 == 18) {
                var3 = var1.readUnsignedShort();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }

            int var4 = var1.readUnsignedByte();
            this.transforms = new int[var4 + 2];

            for (int var5 = 0; var5 <= var4; ++var5) {
                this.transforms[var5] = var1.readUnsignedShort();
                if (this.transforms[var5] == 65535) {
                    this.transforms[var5] = -1;
                }
            }

            this.transforms[var4 + 1] = var3;
        }

    }

    public final HitSplatDefinition transform() {
        int j = -1;
        if (transformVarbit != -1) {
            VariableBits varBit = VariableBits.lookup(transformVarbit);
            int k = varBit.baseVar;
            int l = varBit.startBit;
            int i1 = varBit.endBit;
            int j1 = Client.anIntArray1232[i1 - l];
            j = Client.instance.variousSettings[k] >> l & j1;
        } else if (transformVarp != -1)
            j = Client.instance.variousSettings[transformVarp];
        int var3;
        if (j >= 0 && j < transforms.length)
            var3 = transforms[j];
        else
            var3 = transforms[transforms.length - 1];
        return var3 == -1 ? null : getHitSplatDefinition(var3);
    }


    public int id;
    public int fontId;
    public int textColor;
    public int field2227;
    public int field2228;
    public int field2239;
    public int field2236;
    public int field2231;
    public int field2232;

    public int field2233;

    public int field2234;
    @ObfuscatedName("aq")
    String field2230;
    @ObfuscatedName("am")
    @ObfuscatedGetter(
            intValue = -671612445
    )
    public int field2229;
    @ObfuscatedName("ac")
    @ObfuscatedGetter(
            intValue = 59333765
    )
    public int field2237;
    @ObfuscatedName("ae")
    @Export("transforms")
    public int[] transforms;
    @ObfuscatedName("ak")
    @ObfuscatedGetter(
            intValue = -1191707337
    )
    @Export("transformVarbit")
    int transformVarbit;
    @ObfuscatedName("bp")
    @ObfuscatedGetter(
            intValue = 1670704337
    )
    @Export("transformVarp")
    int transformVarp;
}
