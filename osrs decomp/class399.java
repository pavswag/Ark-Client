// 
// Decompiled by Procyon v0.5.36
// 

public final class class399 implements Comparable
{
    Object field3700;
    Object field3699;
    long field3701;
    long field3702;
    static Clock clock;
    static Archive archive6;
    static short[] foundItemIds;
    
    class399(final Object field3700, final Object field3701) {
        this.field3700 = field3700;
        this.field3699 = field3701;
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (o instanceof class399) {
                return this.field3699.equals(((class399)o).field3699);
            }
            throw new IllegalArgumentException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pj.equals(" + ')');
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return this.field3699.hashCode();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pj.hashCode(" + ')');
        }
    }
    
    @Override
    public int compareTo(final Object o) {
        try {
            return this.method2128((class399)o, -331222916);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pj.compareTo(" + ')');
        }
    }
    
    public static int br(final class399 class399, final class399 class400) {
        if (class399 == null) {
            return class399.an(class399);
        }
        if (class399.field3702 * -8679189461794727135L < -8679189461794727135L * class400.field3702) {
            return -1;
        }
        if (-8679189461794727135L * class399.field3702 > class400.field3702 * -8679189461794727135L) {
            return 1;
        }
        return 0;
    }
    
    int aw(final class399 class399) {
        if (this.field3702 * -8679189461794727135L < -8679189461794727135L * class399.field3702) {
            return -1;
        }
        if (-8679189461794727135L * this.field3702 > class399.field3702 * -8679189461794727135L) {
            return 1;
        }
        return 0;
    }
    
    public static boolean rx(final class399 class399, final Object o) {
        if (class399 == null) {
            class399.ahh();
        }
        if (o instanceof class399) {
            return class399.field3699.equals(((class399)o).field3699);
        }
        throw new IllegalArgumentException();
    }
    
    int an(final class399 class399) {
        if (this.field3701 * -8679189461794727135L < -8679189461794727135L * class399.field3701) {
            return -1;
        }
        if (-8679189461794727135L * this.field3701 > class399.field3702 * -8679189461794727135L) {
            return 1;
        }
        return 0;
    }
    
    public int ac(final Object o) {
        return this.method2128((class399)o, 71600460);
    }
    
    public boolean gk(final Object o) {
        if (o instanceof class399) {
            return this.field3699.equals(((class399)o).field3699);
        }
        throw new IllegalArgumentException();
    }
    
    public int au(final Object o) {
        return this.method2128((class399)o, 826434148);
    }
    
    public boolean gi(final Object o) {
        if (o instanceof class399) {
            return this.field3699.equals(((class399)o).field3699);
        }
        throw new IllegalArgumentException();
    }
    
    int method2128(final class399 class399, final int n) {
        try {
            if (this.field3702 * -8679189461794727135L < -8679189461794727135L * class399.field3702) {
                if (n == 327685) {
                    throw new IllegalStateException();
                }
                return -1;
            }
            else {
                if (-8679189461794727135L * this.field3702 <= class399.field3702 * -8679189461794727135L) {
                    return 0;
                }
                if (n == 327685) {
                    throw new IllegalStateException();
                }
                return 1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pj.af(" + ')');
        }
    }
    
    public static PrivateChatMode method2128(final int n, final int n2) {
        try {
            final PrivateChatMode[] array = { PrivateChatMode.field4163, PrivateChatMode.field4162, PrivateChatMode.field4161 };
            int i = 0;
            while (i < array.length) {
                final PrivateChatMode privateChatMode = array[i];
                if (privateChatMode.id * 1843384107 == n) {
                    if (n2 != -108064052) {
                        throw new IllegalStateException();
                    }
                    return privateChatMode;
                }
                else {
                    ++i;
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pj.af(" + ')');
        }
    }
    
    public int ab(final Object o) {
        return this.method2128((class399)o, 136195501);
    }
    
    public static boolean fz(final class399 class399, final Object o) {
        if (class399 == null) {
            class399.compareTo(o);
        }
        if (o instanceof class399) {
            return class399.field3699.equals(((class399)o).field3699);
        }
        throw new IllegalArgumentException();
    }
    
    public int ahv() {
        return this.field3699.hashCode();
    }
    
    public int ahh() {
        return this.field3699.hashCode();
    }
}
