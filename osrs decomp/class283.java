// 
// Decompiled by Procyon v0.5.36
// 

public class class283
{
    static final int al = 10;
    public static final int af = 256;
    static int[] Tiles_lightness;
    static final int ar = 20;
    public static final int ag = 16384;
    public static final int ad = 22;
    
    class283() throws Throwable {
        throw new Error();
    }
    
    public static void method1593(final int n, int n2, final int n3) {
        try {
            final VarbitComposition vmethod3248 = class158.vmethod3248(n, -428444865);
            final int n4 = 470400793 * vmethod3248.baseVar;
            final int n5 = vmethod3248.startBit * 1050888611;
            final int n6 = Varps.Varps_masks[vmethod3248.endBit * 1130237503 - n5];
            while (true) {
                Label_0116: {
                    if (n2 < 0) {
                        break Label_0116;
                    }
                    if (n3 <= -91537313) {
                        throw new IllegalStateException();
                    }
                    if (n2 > n6) {
                        if (n3 <= -91537313) {
                            return;
                        }
                        break Label_0116;
                    }
                    final int n7 = n6 << n5;
                    Varps.Varps_main[n4] = ((Varps.Varps_main[n4] & ~n7) | (n2 << n5 & n7));
                    Client.ye(n4);
                    return;
                }
                n2 = 0;
                continue;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kn.an(" + ')');
        }
    }
    
    public static void ot(final class425 class425, final float n) {
        if (class425 == null) {
            class425.bn(n);
        }
        class425.method2260(n, n, n, -1044467047);
    }
    
    static final int method1594(final LoginType loginType, final int n) {
        try {
            if (null == loginType) {
                if (n >= -136432346) {
                    throw new IllegalStateException();
                }
                return 12;
            }
            else {
                switch (loginType.field3999 * -874502107) {
                    case 5: {
                        return 20;
                    }
                    default: {
                        return 12;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kn.af(" + ')');
        }
    }
    
    public static int cq(final class166 class166) {
        return 371416339 * class166.field1419;
    }
}
