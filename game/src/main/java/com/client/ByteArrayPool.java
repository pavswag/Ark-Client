package com.client;

import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements("ByteArrayPool")
public class ByteArrayPool {
    @ObfuscatedName("ap")
    static final Object field4830;
    @ObfuscatedName("an")
    @ObfuscatedGetter(
            intValue = -1386334113
    )
    @Export("ByteArrayPool_smallCount")
    static int ByteArrayPool_smallCount;
    @ObfuscatedName("aj")
    @ObfuscatedGetter(
            intValue = -2045503449
    )
    @Export("ByteArrayPool_mediumCount")
    static int ByteArrayPool_mediumCount;
    @ObfuscatedName("av")
    @ObfuscatedGetter(
            intValue = 1337920469
    )
    @Export("ByteArrayPool_largeCount")
    static int ByteArrayPool_largeCount;
    @ObfuscatedName("ab")
    @ObfuscatedGetter(
            intValue = 1262218377
    )
    static int field4835;
    @ObfuscatedName("ai")
    @ObfuscatedGetter(
            intValue = -870884913
    )
    static int field4844;
    @ObfuscatedName("ae")
    @ObfuscatedGetter(
            intValue = -1356136809
    )
    static int field4837;
    @ObfuscatedName("au")
    @ObfuscatedGetter(
            intValue = 1538023343
    )
    static int field4828;
    @ObfuscatedName("ah")
    @ObfuscatedGetter(
            intValue = -1171539117
    )
    static int field4839;
    @ObfuscatedName("az")
    @Export("ByteArrayPool_small")
    static byte[][] ByteArrayPool_small;
    @ObfuscatedName("ax")
    @Export("ByteArrayPool_medium")
    static byte[][] ByteArrayPool_medium;
    @ObfuscatedName("ac")
    @Export("ByteArrayPool_large")
    static byte[][] ByteArrayPool_large;
    @ObfuscatedName("al")
    static byte[][] field4843;
    @ObfuscatedName("as")
    static ArrayList field4842;
    @ObfuscatedName("ic")
    @ObfuscatedSignature(
            descriptor = "Lea;"
    )
    @Export("urlRequester")
    static UrlRequester urlRequester;

    static {
        field4830 = new Object();
        ByteArrayPool_smallCount = 0;
        ByteArrayPool_mediumCount = 0;
        ByteArrayPool_largeCount = 0;
        field4835 = 0;
        field4844 = 1000;
        field4837 = 250;
        field4828 = 100;
        field4839 = 50;
        ByteArrayPool_small = new byte[1000][];
        ByteArrayPool_medium = new byte[250][];
        ByteArrayPool_large = new byte[100][];
        field4843 = new byte[50][];
        field4842 = new ArrayList();
        method6110();
        new HashMap();
    }
    static void method6110() {
        ByteArrayPool.field4842.clear();
        ByteArrayPool.field4842.add(100);
        ByteArrayPool.field4842.add(5000);
        ByteArrayPool.field4842.add(10000);
        ByteArrayPool.field4842.add(30000);
    }
    public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
        synchronized(ByteArrayPool.field4830) {
            byte[] var3;
            if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
                var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
                ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
                return var3;
            }

            if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
                var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
                ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
                return var3;
            }

            if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
                var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
                ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
                return var3;
            }

            if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4835 > 0) {
                var3 = ByteArrayPool.field4843[--ByteArrayPool.field4835];
                ByteArrayPool.field4843[ByteArrayPool.field4835] = null;
                return var3;
            }

            int var6;
            if (ByteArrayPool_arrays != null) {
                for (var6 = 0; var6 < ByteArrayPool_alternativeSizes.length; ++var6) {
                    if ((ByteArrayPool_alternativeSizes[var6] == var0 || var0 < ByteArrayPool_alternativeSizes[var6] && var1) && ByteArrayPool_altSizeArrayCounts[var6] > 0) {
                        byte[] var4 = ByteArrayPool_arrays[var6][--ByteArrayPool_altSizeArrayCounts[var6]];
                        ByteArrayPool_arrays[var6][ByteArrayPool_altSizeArrayCounts[var6]] = null;
                        return var4;
                    }
                }
            }

            if (var1 && ByteArrayPool_alternativeSizes != null) {
                for (var6 = 0; var6 < ByteArrayPool_alternativeSizes.length; ++var6) {
                    if (var0 <= ByteArrayPool_alternativeSizes[var6] && ByteArrayPool_altSizeArrayCounts[var6] < ByteArrayPool_arrays[var6].length) {
                        return new byte[ByteArrayPool_alternativeSizes[var6]];
                    }
                }
            }
        }

        return new byte[var0];
    }
    public static void ByteArrayPool_release(byte[] var0) {
        synchronized(ByteArrayPool.field4830) {
            if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4844) {
                ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
            } else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4837) {
                ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
            } else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4828) {
                ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
            } else if (var0.length == 30000 && ByteArrayPool.field4835 < ByteArrayPool.field4839) {
                ByteArrayPool.field4843[++ByteArrayPool.field4835 - 1] = var0;
            } else {
                if (ByteArrayPool_arrays != null) {
                    for (int var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) {
                        if (var0.length == ByteArrayPool_alternativeSizes[var2] && ByteArrayPool_altSizeArrayCounts[var2] < ByteArrayPool_arrays[var2].length) {
                            ByteArrayPool_arrays[var2][ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
                            return;
                        }
                    }
                }

            }
        }
    }
    static int[] ByteArrayPool_alternativeSizes;
    static int[] ByteArrayPool_altSizeArrayCounts;
    static byte[][][] ByteArrayPool_arrays;
}
