// 
// Decompiled by Procyon v0.5.36
// 

public class class454 extends class456
{
    int field3892;
    int field3893;
    
    public class454(final int n, final int n2, final int n3, final int n4) {
        super(n3, n4);
        this.field3892 = 0;
        this.field3893 = 0;
        this.field3892 = -1209774779 * n;
        this.field3893 = n2 * -471908127;
    }
    
    public int an() {
        return (int)Math.round(-17285747 * this.field3892 + (-1288305887 * this.field3893 - -17285747 * this.field3892) * this.ay(1089057010));
    }
    
    public int ac() {
        return (int)Math.round(-17285747 * this.field3892 + (1188047352 * this.field3893 - -435170628 * this.field3892) * this.ay(1089057010));
    }
    
    public static int py(final class454 class454) {
        if (class454 == null) {
            return class454.ac();
        }
        return (int)Math.round(-17285747 * class454.field3892 + (-1288305887 * class454.field3893 - -17285747 * class454.field3892) * class454.ay(1089057010));
    }
    
    public static void hy(final AbstractFont abstractFont, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (abstractFont == null) {
            abstractFont.dm(s, n, n, n, n, n);
        }
        if (s == null) {
            return;
        }
        AbstractFont.pr(abstractFont, n3, n4);
        final int[] array = new int[s.length()];
        final int[] array2 = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 5.0 + n5 / 5.0) * 5.0);
            array2[i] = (int)(Math.sin(i / 3.0 + n5 / 5.0) * 5.0);
        }
        AbstractFont.vd(abstractFont, s, n - abstractFont.bf(s) / 2, n2, array, array2);
    }
    
    public int method2318(final int n) {
        try {
            return (int)Math.round(-17285747 * this.field3892 + (-1288305887 * this.field3893 - -17285747 * this.field3892) * this.ay(1089057010));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rf.af(" + ')');
        }
    }
}
