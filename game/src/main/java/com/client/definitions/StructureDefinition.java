package com.client.definitions;

import com.client.Buffer;
import com.client.EvictingDualNodeHashTable;
import com.client.cache.DualNode;
import com.client.cache.IntegerNode;
import com.client.cache.IterableNodeHashTable;
import com.client.cache.ObjectNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;
import net.runelite.api.IterableHashTable;
import net.runelite.api.Node;
import net.runelite.api.StructComposition;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import static com.client.util.BufferExt.readStringIntParameters;

public class StructureDefinition extends DualNode implements StructComposition {
    int id;
    public static EvictingDualNodeHashTable StructDefinition_cached;
    IterableNodeHashTable params;

    static {
        StructDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    public static StructureDefinition StructDefinition_getStructDefinition(int var0) {
        StructureDefinition var1 = (StructureDefinition) StructureDefinition.StructDefinition_cached.get((long)var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = Js5List.configs.takeFile(Js5ConfigType.STRUCT, var0);
            var1 = new StructureDefinition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }

            var1.postDecode();
            var1.id = var0;
            StructureDefinition.StructDefinition_cached.put(var1, (long)var0);
            return var1;
        }
    }

    StructureDefinition() {
    }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-737025648"
    )
    @Export("postDecode")
    void postDecode() {
    }

    @ObfuscatedName("an")
    @ObfuscatedSignature(
            descriptor = "(Lvg;I)V",
            garbageValue = "1637115752"
    )
    @Export("decode")
    void decode(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.decodeNext(var1, var2);
        }
    }

    @ObfuscatedName("au")
    @ObfuscatedSignature(
            descriptor = "(Lvg;IB)V",
            garbageValue = "2"
    )
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 249) {
            this.params = readStringIntParameters(var1, this.params);
        }

    }

    @ObfuscatedName("ax")
    @ObfuscatedSignature(
            descriptor = "(III)I",
            garbageValue = "-120973890"
    )
    @Export("getIntParam")
    public int getIntParam(int var1, int var2) {
        IterableNodeHashTable var4 = this.params;
        int var3;
        if (var4 == null) {
            var3 = var2;
        } else {
            IntegerNode var5 = (IntegerNode)var4.get((long)var1);
            if (var5 == null) {
                var3 = var2;
            } else {
                var3 = var5.integer;
            }
        }

        return var3;
    }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(
            descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
            garbageValue = "-315763708"
    )
    @Export("getStringParam")
    public String getStringParam(int var1, String var2) {
        return method7241(this.params, var1, var2);
    }

    static String method7241(IterableNodeHashTable var0, int var1, String var2) {
        if (var0 == null) {
            return var2;
        } else {
            ObjectNode var3 = (ObjectNode)var0.get((long)var1);
            return var3 == null ? var2 : (String)var3.obj;
        }
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public IterableHashTable<Node> getParams() {
        return params;
    }

    @Override
    public void setParams(IterableHashTable<Node> params) {
        
    }

    @Override
    public int getIntValue(int paramID) {
        return 0;
    }

    @Override
    public void setValue(int paramID, int value) {

    }

    @Override
    public String getStringValue(int paramID) {
        return "";
    }

    @Override
    public void setValue(int paramID, String value) {

    }
}
