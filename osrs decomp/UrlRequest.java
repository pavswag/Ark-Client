import java.net.URL;

// 
// Decompiled by Procyon v0.5.36
// 

public class UrlRequest
{
    volatile int field1149;
    static int field1150;
    static int field1151;
    final URL field1152;
    volatile byte[] response0;
    public static int field1154;
    public static final int cu = 80;
    
    UrlRequest(final URL field1152) {
        this.field1149 = UrlRequest.field1151 * -856794795;
        this.field1152 = field1152;
    }
    
    static {
        UrlRequest.field1151 = -1187714911;
        UrlRequest.field1150 = 589984538;
    }
    
    public String at() {
        return this.field1152.toString();
    }
    
    static void method680(final int n) {
        try {
            class129.method763(24, (byte)127);
            class205.method1137(Strings.jf, Strings.jw, Strings.js, 899172963);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ez.as(" + ')');
        }
    }
    
    public String method679(final byte b) {
        try {
            return this.field1152.toString();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ez.aw(" + ')');
        }
    }
    
    public byte[] getResponse(final byte b) {
        try {
            return this.response0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ez.an(" + ')');
        }
    }
    
    public boolean Rasterizer3D_brighten() {
        return -349727197 * this.field1149 != 1340146847 * UrlRequest.field1151;
    }
    
    static int Rasterizer3D_brighten(final int n, final double b) {
        try {
            return (int)(256.0 * Math.pow((n & 0xFF) / 256.0, b)) + (((int)(Math.pow((n >> 8 & 0xFF) / 256.0, b) * 256.0) << 8) + ((int)(Math.pow((n >> 16) / 256.0, b) * 256.0) << 16));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ez.ac(" + ')');
        }
    }
    
    public String aa() {
        return this.field1152.toString();
    }
    
    public boolean isDone(final byte b) {
        try {
            boolean b2;
            if (-349727197 * this.field1149 != 1340146847 * UrlRequest.field1151) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ez.af(" + ')');
        }
    }
    
    public byte[] aq() {
        return this.response0;
    }
    
    public static void uo(final NPC npc, final int n) {
        if (npc == null) {
            npc.cv();
        }
        npc.field1045 = 1731572173 * n;
    }
}
