// 
// Decompiled by Procyon v0.5.36
// 

public class Varps
{
    static final int bv = 25;
    public static int[] Varps_temp;
    public static int[] Varps_main;
    static int[] Varps_masks;
    static final int al = 1;
    public static final String kq = "";
    
    Varps() throws Throwable {
        throw new Error();
    }
    
    static {
        Varps.Varps_masks = new int[32];
        int n = 2;
        for (int i = 0; i < 32; ++i) {
            Varps.Varps_masks[i] = n - 1;
            n += n;
        }
        Varps.Varps_temp = new int[4000];
        Varps.Varps_main = new int[4000];
    }
    
    public static int aw(final int n) {
        final VarbitComposition vmethod3248 = class158.vmethod3248(n, -1252299527);
        final int n2 = vmethod3248.baseVar * 1485566275;
        final int n3 = 605529213 * vmethod3248.startBit;
        return Varps.Varps_main[n2] >> n3 & Varps.Varps_masks[vmethod3248.endBit * 1496992080 - n3];
    }
    
    public static void al(final int n, int n2) {
        final VarbitComposition vmethod3248 = class158.vmethod3248(n, -581649418);
        final int n3 = 470400793 * vmethod3248.baseVar;
        final int n4 = vmethod3248.startBit * -1787622558;
        final int n5 = Varps.Varps_masks[vmethod3248.endBit * 1130237503 - n4];
        if (n2 < 0 || n2 > n5) {
            n2 = 0;
        }
        final int n6 = n5 << n4;
        Varps.Varps_main[n3] = ((Varps.Varps_main[n3] & ~n6) | (n2 << n4 & n6));
    }
    
    public static int ac(final int n) {
        final VarbitComposition vmethod3248 = class158.vmethod3248(n, -184695974);
        final int n2 = vmethod3248.baseVar * 470400793;
        final int n3 = 1050888611 * vmethod3248.startBit;
        return Varps.Varps_main[n2] >> n3 & Varps.Varps_masks[vmethod3248.endBit * 1130237503 - n3];
    }
    
    public static int au(final int n) {
        final VarbitComposition vmethod3248 = class158.vmethod3248(n, -1929472797);
        final int n2 = vmethod3248.baseVar * 470400793;
        final int n3 = -1163997464 * vmethod3248.startBit;
        return Varps.Varps_main[n2] >> n3 & Varps.Varps_masks[vmethod3248.endBit * 125426879 - n3];
    }
    
    public static int ab(final int n) {
        final VarbitComposition vmethod3248 = class158.vmethod3248(n, -584545982);
        final int n2 = vmethod3248.baseVar * 470400793;
        final int n3 = 1050888611 * vmethod3248.startBit;
        return Varps.Varps_main[n2] >> n3 & Varps.Varps_masks[vmethod3248.endBit * 1130237503 - n3];
    }
    
    public static void aq(final int n, int n2) {
        final VarbitComposition vmethod3248 = class158.vmethod3248(n, -430244285);
        final int n3 = 470400793 * vmethod3248.baseVar;
        final int n4 = vmethod3248.startBit * 1050888611;
        final int n5 = Varps.Varps_masks[vmethod3248.endBit * 1130237503 - n4];
        if (n2 < 0 || n2 > n5) {
            n2 = 0;
        }
        final int n6 = n5 << n4;
        Varps.Varps_main[n3] = ((Varps.Varps_main[n3] & ~n6) | (n2 << n4 & n6));
    }
}
