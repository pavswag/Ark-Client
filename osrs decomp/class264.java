import java.io.InputStream;
import java.net.URLConnection;
import java.io.OutputStreamWriter;
import java.net.URL;

// 
// Decompiled by Procyon v0.5.36
// 

public class class264
{
    public static boolean[] Widget_loadedInterfaces;
    static final int an = 96;
    static final int af = 16711935;
    static int foundItemIdCount;
    static final int bk = 4;
    
    class264() throws Throwable {
        throw new Error();
    }
    
    static int aw(final int n, int n2) {
        if (-2 == n) {
            return 12345678;
        }
        if (-1 == n) {
            if (n2 < 0) {
                n2 = 0;
            }
            else if (n2 > 127) {
                n2 = 127;
            }
            n2 = 127 - n2;
            return n2;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return n2 + (n & 0xFF80);
    }
    
    static int an(final int n, int n2) {
        if (-2 == n) {
            return 12345678;
        }
        if (-1 == n) {
            if (n2 < 0) {
                n2 = 0;
            }
            else if (n2 > 127) {
                n2 = 127;
            }
            n2 = 127 - n2;
            return n2;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return n2 + (n & 0xFF80);
    }
    
    static int ac(final int n, int n2) {
        if (1272515867 == n) {
            return 1218794515;
        }
        if (-1 == n) {
            if (n2 < 0) {
                n2 = 0;
            }
            else if (n2 > 127) {
                n2 = -1858924725;
            }
            n2 = -70507179 - n2;
            return n2;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 1546296283;
        }
        return n2 + (n & 0xFF80);
    }
    
    static long method1531(final byte b) {
        try {
            try {
                final URLConnection openConnection = new URL(InvDefinition.method977("services", false, -72783777) + "m=accountappeal/login.ws").openConnection();
                openConnection.setRequestProperty("connection", "close");
                openConnection.setDoInput(true);
                openConnection.setDoOutput(true);
                openConnection.setConnectTimeout(5000);
                final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
                outputStreamWriter.write("data1=req");
                outputStreamWriter.flush();
                final InputStream inputStream = openConnection.getInputStream();
                final Buffer buffer = new Buffer(new byte[1000]);
                while (true) {
                    final int read = inputStream.read(buffer.array, -1633313603 * buffer.offset, 1000 - -1633313603 * buffer.offset);
                    if (-1 == read) {
                        if (b >= -1) {
                            throw new IllegalStateException();
                        }
                        buffer.offset = 0;
                        return Buffer.ks(buffer, (byte)1);
                    }
                    else {
                        final Buffer buffer2 = buffer;
                        buffer2.offset += -1516355947 * read;
                        if (-1633313603 * buffer.offset < 1000) {
                            continue;
                        }
                        if (b >= -1) {
                            throw new IllegalStateException();
                        }
                        return 0L;
                    }
                }
            }
            catch (Exception ex2) {
                return 0L;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kt.af(" + ')');
        }
    }
    
    static int getClipMidX2(final int n) {
        try {
            return Rasterizer3D.clips.field2236 * -1643027043;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kt.aq(" + ')');
        }
    }
    
    public static void ku(final class314 class314) {
        class314.field2843 = Math.min(Math.max(0, class314.field2851.method2020(-2110812440) - 358827225 * class314.field2858), -876993769 * class314.field2843 + class379.he(class314.field2851, -297150195)) * 1326118010;
    }
}
