package com.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import static com.client.ByteArrayPool.ByteArrayPool_getArrayBool;
import static com.client.ByteArrayPool.ByteArrayPool_release;

@ObfuscatedName("ea")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
    @ObfuscatedName("aq")
    @Export("requestThread")
    final Thread requestThread;
    @ObfuscatedName("ad")
    @Export("isClosed")
    volatile boolean isClosed;
    @ObfuscatedName("ag")
    @Export("requests")
    Queue requests;
    @ObfuscatedName("ak")
    @ObfuscatedGetter(
            intValue = 1686353651
    )
    @Export("clientRevision")
    int clientRevision;

    UrlRequester(int var1) {
        this.requests = new LinkedList();
        this.requestThread = new Thread(this);
        this.requestThread.setPriority(1);
        this.requestThread.start();
        this.clientRevision = var1;
    }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(
            descriptor = "(Lez;I)V",
            garbageValue = "-1132577463"
    )
    @Export("openConnection")
    abstract void openConnection(UrlRequest var1) throws IOException;

    @ObfuscatedName("ad")
    @ObfuscatedSignature(
            descriptor = "(Ljava/net/URLConnection;B)I",
            garbageValue = "8"
    )
    int method2948(URLConnection var1) {
        int var2 = UrlRequest.field1485;
        if (var1 != null) {
            try {
                if (var1 instanceof HttpURLConnection) {
                    var2 = ((HttpURLConnection)var1).getResponseCode();
                }
            } catch (IOException var4) {
            }
        }

        return var2;
    }

    @ObfuscatedName("ag")
    @ObfuscatedSignature(
            descriptor = "(Ljava/net/URLConnection;B)V",
            garbageValue = "2"
    )
    @Export("setDefaultRequestProperties")
    void setDefaultRequestProperties(URLConnection var1) {
        var1.setConnectTimeout(5000);
        var1.setReadTimeout(5000);
        var1.setUseCaches(false);
        var1.setRequestProperty("Connection", "close");
        var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
    }

    @ObfuscatedName("ak")
    @ObfuscatedSignature(
            descriptor = "(Ljava/net/URLConnection;Lez;B)V",
            garbageValue = "-7"
    )
    void method2943(URLConnection var1, UrlRequest var2) {
        DataInputStream var3 = null;

        try {
            int var5 = var1.getContentLength();
            var3 = new DataInputStream(var1.getInputStream());
            byte[] var4;
            if (var5 >= 0) {
                var4 = new byte[var5];
                var3.readFully(var4);
            } else {
                var4 = new byte[0];
                byte[] var6 = ByteArrayPool_getArrayBool(5000, false);
                byte[] var7 = var6;

                for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
                    byte[] var9 = new byte[var4.length + var8];
                    System.arraycopy(var4, 0, var9, 0, var4.length);
                    System.arraycopy(var7, 0, var9, var4.length, var8);
                    var4 = var9;
                }

                ByteArrayPool_release(var7);
            }

            var2.response0 = var4;
        } catch (IOException var15) {
            var2.response0 = null;
        } finally {
            var2.field1482 = this.method2948(var1);
        }

        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var14) {
            }
        }

    }

    @ObfuscatedName("ap")
    @ObfuscatedSignature(
            descriptor = "(Ljava/net/URL;I)Lez;",
            garbageValue = "728263238"
    )
    @Export("request")
    public UrlRequest request(URL var1) {
        UrlRequest var2 = new UrlRequest(var1);
        synchronized(this) {
            this.requests.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("an")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-575124742"
    )
    @Export("close")
    public void close() {
        this.isClosed = true;

        try {
            synchronized(this) {
                this.notify();
            }

            this.requestThread.join();
        } catch (InterruptedException var4) {
        }

    }

    public void run() {
        while (!this.isClosed) {
            try {
                UrlRequest var1;
                synchronized(this) {
                    var1 = (UrlRequest)this.requests.poll();
                    if (var1 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var5) {
                        }
                        continue;
                    }
                }

                this.openConnection(var1);
            } catch (Exception var7) {
                var7.printStackTrace();
            }
        }

    }

}
