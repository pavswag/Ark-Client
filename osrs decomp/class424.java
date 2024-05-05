// 
// Decompiled by Procyon v0.5.36
// 

public final class class424
{
    static int field3785;
    static int field3786;
    static class424[] field3787;
    float field3788;
    float field3789;
    float field3790;
    float field3791;
    
    class424() {
        this.method2244(147041014);
    }
    
    static {
        class424.field3787 = new class424[0];
        class310.method1689(100, 233637321);
        new class424();
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (o instanceof class424) {
                final class424 class424 = (class424)o;
                return this.field3788 == class424.field3788 && this.field3789 == class424.field3789 && this.field3790 == class424.field3790 && class424.field3791 == this.field3791;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qx.equals(" + ')');
        }
    }
    
    @Override
    public String toString() {
        try {
            return this.field3788 + "," + this.field3789 + "," + this.field3790 + "," + this.field3791;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qx.toString(" + ')');
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return (int)(this.field3791 + 31.0f * (31.0f * (31.0f * (31.0f * 1.0f + this.field3788) + this.field3789) + this.field3790));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qx.hashCode(" + ')');
        }
    }
    
    public final void ae(final class424 class424) {
        this.method2240(class424.field3789 * this.field3790 + (class424.field3788 * this.field3791 + class424.field3791 * this.field3788) - this.field3789 * class424.field3790, class424.field3789 * this.field3791 + (this.field3789 * class424.field3791 - this.field3790 * class424.field3788) + this.field3788 * class424.field3790, this.field3790 * class424.field3791 + class424.field3788 * this.field3789 - class424.field3789 * this.field3788 + class424.field3790 * this.field3791, this.field3791 * class424.field3791 - class424.field3788 * this.field3788 - this.field3789 * class424.field3789 - this.field3790 * class424.field3790, (byte)(-2));
    }
    
    public static boolean ch(final class424 class424, final Object o) {
        if (class424 == null) {
            class424.equals(o);
        }
        if (o instanceof class424) {
            final class424 class425 = (class424)o;
            return class424.field3788 == class425.field3788 && class424.field3789 == class425.field3789 && class424.field3790 == class425.field3790 && class425.field3791 == class424.field3791;
        }
        return false;
    }
    
    public static class424 ao() {
        synchronized (class424.field3787) {
            if (0 == -2133937525 * class424.field3786) {
                return new class424();
            }
            class424.field3787[(class424.field3786 -= 1732158755) * -1829924912].method2244(1792716261);
            return class424.field3787[-2099436983 * class424.field3786];
        }
    }
    
    public static void mt(final class424 class424, final float n, final float n2, final float n3, final float n4) {
        if (class424 == null) {
            class424.hashCode();
        }
        final float n5 = (float)Math.sin(0.5f * n4);
        final float field3791 = (float)Math.cos(0.5f * n4);
        class424.field3788 = n5 * n;
        class424.field3789 = n5 * n2;
        class424.field3790 = n3 * n5;
        class424.field3791 = field3791;
    }
    
    static void at(final int n) {
        class424.field3785 = n * -1605864417;
        class424.field3787 = new class424[n];
        class424.field3786 = 0;
    }
    
    final void ak() {
        this.field3790 = 0.0f;
        this.field3789 = 0.0f;
        this.field3788 = 0.0f;
        this.field3791 = 1.0f;
    }
    
    void av(final float field3788, final float field3789, final float field3790, final float field3791) {
        this.field3788 = field3788;
        this.field3789 = field3789;
        this.field3790 = field3790;
        this.field3791 = field3791;
    }
    
    public static void ns(final class424 class424, final class424 class425) {
        class424.method2240(class425.field3789 * class424.field3790 + (class425.field3788 * class424.field3791 + class425.field3791 * class424.field3788) - class424.field3789 * class425.field3790, class425.field3789 * class424.field3791 + (class424.field3789 * class425.field3791 - class424.field3790 * class425.field3788) + class424.field3788 * class425.field3790, class424.field3790 * class425.field3791 + class425.field3788 * class424.field3789 - class425.field3789 * class424.field3788 + class425.field3790 * class424.field3791, class424.field3791 * class425.field3791 - class425.field3788 * class424.field3788 - class424.field3789 * class425.field3789 - class424.field3790 * class425.field3790, (byte)95);
    }
    
    final void az() {
        this.field3790 = 0.0f;
        this.field3789 = 0.0f;
        this.field3788 = 0.0f;
        this.field3791 = 1.0f;
    }
    
    public static class424 ax() {
        synchronized (class424.field3787) {
            if (0 == -2133937525 * class424.field3786) {
                return new class424();
            }
            class424.field3787[(class424.field3786 -= 1732158755) * -2133937525].method2244(336090811);
            return class424.field3787[-2133937525 * class424.field3786];
        }
    }
    
    static void ay(final int n) {
        class424.field3785 = n * 1702894705;
        class424.field3787 = new class424[n];
        class424.field3786 = 0;
    }
    
    public void td(final float n, final float n2, final float n3, final float n4) {
        this.method2241(n, n2, n3, n4, 749287521);
    }
    
    public void method2243(final byte b) {
        try {
            synchronized (class424.field3787) {
                if (-2133937525 * class424.field3786 < -1819670561 * class424.field3785 - 1) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    class424.field3787[(class424.field3786 += 1732158755) * -2133937525 - 1] = this;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qx.aw(" + ')');
        }
    }
    
    static void al(final int n) {
        class424.field3785 = n * -1605864417;
        class424.field3787 = new class424[n];
        class424.field3786 = 0;
    }
    
    static float method2245(final float[] array, final int n, final float n2, final int n3) {
        try {
            float n4 = array[n];
            for (int i = n - 1; i >= 0; --i) {
                if (n3 <= -932882365) {
                    throw new IllegalStateException();
                }
                n4 = array[i] + n4 * n2;
            }
            return n4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qx.an(" + ')');
        }
    }
    
    void method2240(final float field3788, final float field3789, final float field3790, final float field3791, final byte b) {
        try {
            this.field3788 = field3788;
            this.field3789 = field3789;
            this.field3790 = field3790;
            this.field3791 = field3791;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qx.ac(" + ')');
        }
    }
    
    public static String hm(final class424 class424) {
        if (class424 == null) {
            return class424.ahp();
        }
        return class424.field3788 + "," + class424.field3789 + "," + class424.field3790 + "," + class424.field3791;
    }
    
    public void method2241(final float n, final float n2, final float n3, final float n4, final int n5) {
        try {
            final float n6 = (float)Math.sin(0.5f * n4);
            final float field3791 = (float)Math.cos(0.5f * n4);
            this.field3788 = n6 * n;
            this.field3789 = n6 * n2;
            this.field3790 = n3 * n6;
            this.field3791 = field3791;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qx.au(" + ')');
        }
    }
    
    static void aa(final int n) {
        class424.field3785 = n * -1605864417;
        class424.field3787 = new class424[n];
        class424.field3786 = 0;
    }
    
    public static class424 ai() {
        synchronized (class424.field3787) {
            if (0 == 179389177 * class424.field3786) {
                return new class424();
            }
            class424.field3787[(class424.field3786 -= 1732158755) * 1638084916].method2244(2003896821);
            return class424.field3787[-2133937525 * class424.field3786];
        }
    }
    
    public boolean gi(final Object o) {
        if (o instanceof class424) {
            final class424 class424 = (class424)o;
            return this.field3788 == class424.field3788 && this.field3789 == class424.field3789 && this.field3790 == class424.field3790 && class424.field3791 == this.field3791;
        }
        return false;
    }
    
    void ar(final float field3788, final float field3789, final float field3790, final float field3791) {
        this.field3788 = field3788;
        this.field3789 = field3789;
        this.field3790 = field3790;
        this.field3791 = field3791;
    }
    
    public final void ap(final class424 class424) {
        this.method2240(class424.field3789 * this.field3790 + (class424.field3788 * this.field3791 + class424.field3791 * this.field3788) - this.field3789 * class424.field3790, class424.field3789 * this.field3791 + (this.field3789 * class424.field3791 - this.field3790 * class424.field3788) + this.field3788 * class424.field3790, this.field3790 * class424.field3791 + class424.field3788 * this.field3789 - class424.field3789 * this.field3788 + class424.field3790 * this.field3791, this.field3791 * class424.field3791 - class424.field3788 * this.field3788 - this.field3789 * class424.field3789 - this.field3790 * class424.field3790, (byte)(-80));
    }
    
    final void method2244(final int n) {
        try {
            this.field3790 = 0.0f;
            this.field3789 = 0.0f;
            this.field3788 = 0.0f;
            this.field3791 = 1.0f;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qx.ab(" + ')');
        }
    }
    
    public final void method2242(final class424 class424, final byte b) {
        try {
            this.method2240(class424.field3789 * this.field3790 + (class424.field3788 * this.field3791 + class424.field3791 * this.field3788) - this.field3789 * class424.field3790, class424.field3789 * this.field3791 + (this.field3789 * class424.field3791 - this.field3790 * class424.field3788) + this.field3788 * class424.field3790, this.field3790 * class424.field3791 + class424.field3788 * this.field3789 - class424.field3789 * this.field3788 + class424.field3790 * this.field3791, this.field3791 * class424.field3791 - class424.field3788 * this.field3788 - this.field3789 * class424.field3789 - this.field3790 * class424.field3790, (byte)(-47));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qx.aq(" + ')');
        }
    }
    
    public static int yg(final SequenceDefinition sequenceDefinition) {
        return sequenceDefinition.animMayaEnd * 1833069719 - -968724615 * sequenceDefinition.animMayaStart;
    }
    
    public static class424 ew() {
        return new class424();
    }
    
    public boolean gm(final Object o) {
        if (o instanceof class424) {
            final class424 class424 = (class424)o;
            return this.field3788 == class424.field3788 && this.field3789 == class424.field3789 && this.field3790 == class424.field3790 && class424.field3791 == this.field3791;
        }
        return false;
    }
    
    public static void yz(final WorldMapSection0 worldMapSection0) {
        if (worldMapSection0 == null) {
            worldMapSection0.ak();
        }
    }
    
    public static boolean bm(final class424 class424, final Object o) {
        if (class424 == null) {
            class424.ahv();
        }
        if (o instanceof class424) {
            final class424 class425 = (class424)o;
            return class424.field3788 == class425.field3788 && class424.field3789 == class425.field3789 && class424.field3790 == class425.field3790 && class425.field3791 == class424.field3791;
        }
        return false;
    }
    
    public void ah() {
        synchronized (class424.field3787) {
            if (-2133937525 * class424.field3786 < -1819670561 * class424.field3785 - 1) {
                class424.field3787[(class424.field3786 += 12111740) * 1414600250 - 1] = this;
            }
        }
    }
    
    public int aht() {
        return (int)(this.field3791 + 31.0f * (31.0f * (31.0f * (31.0f * 1.0f + this.field3788) + this.field3789) + this.field3790));
    }
    
    public static void oz(final class424 class424) {
        if (class424 == null) {
            class424.hashCode();
        }
        class424.field3790 = 0.0f;
        class424.field3789 = 0.0f;
        class424.field3788 = 0.0f;
        class424.field3791 = 1.0f;
    }
    
    public void jb(final class424 class424) {
        this.method2242(class424, (byte)31);
    }
    
    public int ahv() {
        return (int)(this.field3791 + 31.0f * (31.0f * (31.0f * (31.0f * 1.0f + this.field3788) + this.field3789) + this.field3790));
    }
    
    public String ahj() {
        return this.field3788 + "," + this.field3789 + "," + this.field3790 + "," + this.field3791;
    }
    
    public String ahm() {
        return this.field3788 + "," + this.field3789 + "," + this.field3790 + "," + this.field3791;
    }
    
    public String ahp() {
        return this.field3791 + "," + this.field3791 + "," + this.field3790 + "," + this.field3788;
    }
}
