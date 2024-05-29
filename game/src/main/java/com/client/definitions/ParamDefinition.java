package com.client.definitions;

import com.client.Buffer;
import com.client.EvictingDualNodeHashTable;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;
import lombok.ToString;

@ToString
public class ParamDefinition extends DualNode {
    static EvictingDualNodeHashTable ParamDefinition_cached;
    static {
        ParamDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    public static ParamDefinition getParamDefinition(int var0) {
        ParamDefinition var1 = (ParamDefinition)ParamDefinition.ParamDefinition_cached.get((long)var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = Js5List.configs.takeFile(Js5ConfigType.PARAMS, var0);
            var1 = new ParamDefinition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }

            var1.postDecode();
            ParamDefinition.ParamDefinition_cached.put(var1, (long)var0);
            return var1;
        }
    }
    public static char method3301(byte var0) {
        int var1 = var0 & 255;
        if (var1 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var1, 16));
        } else {
            if (var1 >= 128 && var1 < 160) {
                char var2 = Buffer.cp1252AsciiExtension[var1 - 128];
                if (var2 == 0) {
                    var2 = '?';
                }

                var1 = var2;
            }

            return (char)var1;
        }
    }
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 1) {
            this.type = method3301(var1.readByte());
        } else if (var2 == 2) {
            this.defaultInt = var1.readInt();
        } else if (var2 == 4) {
            this.autoDisable = false;
        } else if (var2 == 5) {
            this.defaultStr = var1.readStringCp1252NullTerminated();
        }

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
    void postDecode() {
    }


    char type;
    public int defaultInt;
    public String defaultStr;
    boolean autoDisable;
}
