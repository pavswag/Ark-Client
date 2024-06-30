package com.client;

import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("UrlRequest")
public class UrlRequest {
    @ObfuscatedName("ad")
    @ObfuscatedGetter(
            intValue = -1191249779
    )
    static int field1479;
    @ObfuscatedName("ag")
    @ObfuscatedGetter(
            intValue = -2111422939
    )
    static int field1485;
    final URL field1483;
    volatile int field1482;
    volatile byte[] response0;
    static {
        field1479 = -1;
        field1485 = -2;
    }
    UrlRequest(URL var1) {
        this.field1482 = field1479;
        this.field1483 = var1;
    }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(
            descriptor = "(S)Z",
            garbageValue = "-15592"
    )
    @Export("isDone")
    public boolean isDone() {
        return this.field1482 != field1479;
    }

    @ObfuscatedName("ad")
    @ObfuscatedSignature(
            descriptor = "(I)[B",
            garbageValue = "-872165"
    )
    @Export("getResponse")
    public byte[] getResponse() {
        return this.response0;
    }

    @ObfuscatedName("ag")
    @ObfuscatedSignature(
            descriptor = "(I)Ljava/lang/String;",
            garbageValue = "1943999950"
    )
    public String method2978() {
        return this.field1483.toString();
    }

}
