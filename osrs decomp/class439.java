// 
// Decompiled by Procyon v0.5.36
// 

public class class439
{
    static final double aw = 2607.5945876176133;
    static final int an = 16383;
    static IndexedSprite field3828;
    static final int[] field3829;
    static final int[] field3830;
    static final int af = 16384;
    
    class439() throws Throwable {
        throw new Error();
    }
    
    static {
        field3829 = new int[16384];
        field3830 = new int[16384];
        final double n = 3.834951969714103E-4;
        for (int i = 0; i < 16384; ++i) {
            class439.field3829[i] = (int)(16384.0 * Math.sin(n * i));
            class439.field3830[i] = (int)(16384.0 * Math.cos(n * i));
        }
    }
    
    public static int ao(final int n) {
        return class439.field3829[n & 0x3FFF];
    }
    
    public static int at(final int n, final int n2) {
        return (int)Math.round(Math.atan2(n, n2) * 2607.5945876176133) & 0x3FFF;
    }
    
    public static int ax(final int n) {
        return class439.field3829[n & 0x3FFF];
    }
    
    public static int ay(final int n, final int n2) {
        return (int)Math.round(Math.atan2(n, n2) * 2607.5945876176133) & 0x3FFF;
    }
    
    public static float al(int n) {
        n &= 0x5C381891;
        return (float)(n / 16384.0f * 6.283185307179586);
    }
    
    public static float au(int n) {
        n &= 0xF39BEFA;
        return (float)(n / 16384.0f * 6.283185307179586);
    }
    
    public static int aa(final int n, final int n2) {
        return (int)Math.round(Math.atan2(n, n2) * 2607.5945876176133) & 0x3FFF;
    }
    
    public static float ab(int n) {
        n &= 0x3FFF;
        return (float)(n / 16384.0f * 6.283185307179586);
    }
    
    public static float aq(int n) {
        n &= 0x3FFF;
        return (float)(n / 16384.0f * 6.283185307179586);
    }
}
