// 
// Decompiled by Procyon v0.5.36
// 

public class class452 extends class455
{
    double field3878;
    int field3879;
    static Archive archive8;
    double field3881;
    double field3882;
    double field3883;
    int field3884;
    double field3885;
    
    public class452(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        super(n9, n10);
        this.field3884 = 0;
        this.field3879 = 0;
        this.field3883 = 0.0;
        this.field3881 = 0.0;
        this.field3882 = 0.0;
        this.field3885 = 0.0;
        this.field3878 = 0.0;
        this.field3884 = n3 * -1598267005;
        this.field3879 = n6 * -1940001539;
        if ((n4 - n7) * (n8 - n2) == (n7 - n) * (n5 - n8)) {
            this.field3883 = n4;
            this.field3881 = n5;
            return;
        }
        final double n11 = (float)(n7 + n) / 2.0;
        final double n12 = (float)(n8 + n2) / 2.0;
        final double n13 = (float)(n4 + n7) / 2.0;
        final double n14 = (float)(n8 + n5) / 2.0;
        final double n15 = (n7 - n) * -1.0 / (n8 - n2);
        final double n16 = (n4 - n7) * -1.0 / (n5 - n8);
        this.field3883 = (n14 + (n15 * n11 - n16 * n13) - n12) / (n15 - n16);
        this.field3881 = n12 + n15 * (this.field3883 - n11);
        this.field3882 = Math.sqrt(Math.pow(this.field3883 - n, 2.0) + Math.pow(this.field3881 - n2, 2.0));
        this.field3885 = Math.atan2(n2 - this.field3881, n - this.field3883);
        final double atan2 = Math.atan2(n8 - this.field3881, n7 - this.field3883);
        this.field3878 = Math.atan2(n5 - this.field3881, n4 - this.field3883);
        if ((this.field3885 > atan2 || atan2 > this.field3878) && (this.field3878 > atan2 || atan2 > this.field3885)) {
            this.field3878 += ((this.field3885 - this.field3878 > 0.0) ? 2 : -2) * 3.141592653589793;
        }
    }
    
    @Override
    public int at() {
        return (int)Math.round((this.field3879 * -970289067 - this.field3884 * -925977301) * this.ay(1089057010) + this.field3884 * -925977301);
    }
    
    @Override
    public int vmethod2320(final byte b) {
        try {
            return (int)Math.round((this.field3879 * -970289067 - this.field3884 * -925977301) * this.ay(1089057010) + this.field3884 * -925977301);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rr.aw(" + ')');
        }
    }
    
    @Override
    public int al() {
        return (int)Math.round((this.field3879 * -970289067 - this.field3884 * -925977301) * this.ay(1089057010) + this.field3884 * -925977301);
    }
    
    @Override
    public int vmethod2319(final int n) {
        try {
            return (int)Math.round(this.field3881 + this.field3882 * Math.sin((this.field3878 - this.field3885) * this.ay(1089057010) + this.field3885));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rr.an(" + ')');
        }
    }
    
    @Override
    public int ac() {
        return (int)Math.round(this.field3883 + this.field3882 * Math.cos(this.field3885 + this.ay(1089057010) * (this.field3878 - this.field3885)));
    }
    
    static final boolean runCs1(final Widget widget, final int n) {
        try {
            if (null != widget.cs1Comparisons) {
                for (int i = 0; i < widget.cs1Comparisons.length; ++i) {
                    if (n == 1758054564) {
                        throw new IllegalStateException();
                    }
                    final int method478 = ArchiveLoader.method478(widget, i, 1696113134);
                    final int n2 = widget.cs1ComparisonValues[i];
                    if (widget.cs1Comparisons[i] == 2) {
                        if (n == 1758054564) {
                            throw new IllegalStateException();
                        }
                        if (method478 >= n2) {
                            return false;
                        }
                    }
                    else if (widget.cs1Comparisons[i] == 3) {
                        if (n == 1758054564) {
                            throw new IllegalStateException();
                        }
                        if (method478 <= n2) {
                            if (n == 1758054564) {
                                throw new IllegalStateException();
                            }
                            return false;
                        }
                    }
                    else if (4 == widget.cs1Comparisons[i]) {
                        if (n == 1758054564) {
                            throw new IllegalStateException();
                        }
                        if (method478 == n2) {
                            return false;
                        }
                    }
                    else if (n2 != method478) {
                        if (n == 1758054564) {
                            throw new IllegalStateException();
                        }
                        return false;
                    }
                }
                return true;
            }
            if (n == 1758054564) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rr.lb(" + ')');
        }
    }
    
    @Override
    public int au() {
        return (int)Math.round(this.field3881 + this.field3882 * Math.sin((this.field3878 - this.field3885) * this.ay(1089057010) + this.field3885));
    }
    
    @Override
    public int vmethod2321(final int n) {
        try {
            return (int)Math.round(this.field3883 + this.field3882 * Math.cos(this.field3885 + this.ay(1089057010) * (this.field3878 - this.field3885)));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rr.af(" + ')');
        }
    }
    
    @Override
    public int ab() {
        return (int)Math.round(this.field3881 + this.field3882 * Math.sin((this.field3878 - this.field3885) * this.ay(1089057010) + this.field3885));
    }
    
    public int method2313() {
        return (int)Math.round(this.field3881 + this.field3882 * Math.sin((this.field3878 - this.field3885) * this.ay(1089057010) + this.field3885));
    }
    
    public static IndexedSprite method2313(final AbstractArchive abstractArchive, final int n, final int n2) {
        try {
            final byte[] sh = AbstractArchive.sh(abstractArchive, n, (byte)31);
            int n3;
            if (sh == null) {
                if (n2 == 1511448314) {
                    throw new IllegalStateException();
                }
                n3 = 0;
            }
            else {
                class485.SpriteBuffer_decode(sh, 1145263442);
                n3 = 1;
            }
            if (n3 != 0) {
                return Strings.method1852((byte)1);
            }
            if (n2 == 1511448314) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rr.aq(" + ')');
        }
    }
}
