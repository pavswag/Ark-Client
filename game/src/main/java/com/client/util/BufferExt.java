package com.client.util;

import com.client.Buffer;
import com.client.Buffer1;
import com.client.Node;
import com.client.cache.IntegerNode;
import com.client.cache.IterableNodeHashTable;
import com.client.cache.ObjectNode;

import java.util.HashMap;

public class BufferExt {

    public static HashMap<Integer, Object> readStringIntParameters(Buffer buffer) {
        int length = buffer.readUnsignedByte();

        HashMap<Integer, Object> params = new HashMap<>(length);

        for (int i = 0; i < length; i++) {
            boolean isString = buffer.readUnsignedByte() == 1;
            int key = buffer.read24Int();
            Object value;
            if (isString) {
                value = buffer.readNullTerminatedString();
            } else {
                value = buffer.readInt();
            }

            params.put(key, value);
        }
        return params;
    }
    public static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
        int var2 = var0.readUnsignedByte();
        int var3;
        if (var1 == null) {
            var3 = method6096(var2);
            var1 = new IterableNodeHashTable(var3);
        }

        for (var3 = 0; var3 < var2; ++var3) {
            boolean var4 = var0.readUnsignedByte() == 1;
            int var5 = var0.readMedium();
            Object var6;
            if (var4) {
                var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
            } else {
                var6 = new IntegerNode(var0.readInt());
            }

            var1.put((Node)var6, (long)var5);
        }

        return var1;
    }

    public static int method6096(int var0) {
        --var0;
        var0 |= var0 >>> 1;
        var0 |= var0 >>> 2;
        var0 |= var0 >>> 4;
        var0 |= var0 >>> 8;
        var0 |= var0 >>> 16;
        return var0 + 1;
    }
}