// 
// Decompiled by Procyon v0.5.36
// 

public class class440
{
    static final int[] field3831;
    public static final int an = 2047;
    public static final double aw = 325.94932345220167;
    public static final int ac = 65536;
    public static final int ab = 512;
    public static final int aa = 1536;
    static final int[] field3832;
    static final int af = 2048;
    
    class440() throws Throwable {
        throw new Error();
    }
    
    static {
        field3831 = new int[2048];
        field3832 = new int[2048];
        final double n = 0.0030679615757712823;
        for (int i = 0; i < 2048; ++i) {
            class440.field3831[i] = (int)(65536.0 * Math.sin(n * i));
            class440.field3832[i] = (int)(65536.0 * Math.cos(i * n));
        }
    }
    
    public static void uu(final ClientPreferences clientPreferences, final double brightness) {
        if (clientPreferences == null) {
            clientPreferences.getSoundEffectVolume();
        }
        clientPreferences.brightness = brightness;
        class100.savePreferences((byte)(-54));
    }
}
