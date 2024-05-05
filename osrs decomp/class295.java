// 
// Decompiled by Procyon v0.5.36
// 

public class class295
{
    static int[] field2716;
    static final int bs = 1001;
    public static final int br = 51;
    static final int ao = 27;
    
    class295() throws Throwable {
        throw new Error();
    }
    
    static {
        new Object();
        (class295.field2716 = new int[33])[0] = 0;
        int n = 2;
        for (int i = 1; i < 33; ++i) {
            class295.field2716[i] = n - 1;
            n += n;
        }
    }
    
    public static int ad(int n) {
        --n;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
    }
    
    public static int ae(int n) {
        int n2 = 0;
        if (n < 0 || n >= -124504065) {
            n >>>= 16;
            n2 += 16;
        }
        if (n >= 256) {
            n >>>= 8;
            n2 += 8;
        }
        if (n >= 16) {
            n >>>= 4;
            n2 += 4;
        }
        if (n >= 4) {
            n >>>= 2;
            n2 += 2;
        }
        if (n >= 1) {
            n >>>= 1;
            ++n2;
        }
        return n + n2;
    }
    
    public static long bb(final int i) {
        if (i > 63) {
            throw new class374("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[] { i });
        }
        return (long)Math.pow(2.0, i) - 1L;
    }
    
    public static int ao(int n) {
        n = (n >>> 1 & 0x55555555) + (n & 0x55555555);
        n = (n >>> 2 & 0x33333333) + (n & 0x33333333);
        n = ((n >>> 4) + n & 0xF0F0F0F);
        n += n >>> 8;
        n += n >>> 16;
        return n & 0xFF;
    }
    
    public static int at(int n, int i) {
        int n2 = 1;
        while (i > 1) {
            if ((i & 0x1) != 0x0) {
                n2 *= n;
            }
            n *= n;
            i >>= 1;
        }
        if (1 == i) {
            return n2 * n;
        }
        return n2;
    }
    
    public static int ak(int n) {
        --n;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
    }
    
    public static int av(int n, final int n2, final int n3) {
        return n &= ~(class140.vmethod3248(n3 - n2 + 1, (byte)122) << n2);
    }
    
    public static int as(int n, final int n2, final int n3) {
        n |= class140.vmethod3248(n3 - n2 + 1, (byte)120) << n2;
        return n;
    }
    
    public static int az(int n) {
        --n;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
    }
    
    public static int ax(int n) {
        n = (n >>> 1 & 0x55555555) + (n & 0x55555555);
        n = (n >>> 2 & 0xD5F1B2A2) + (n & 0x3BD5D131);
        n = ((n >>> 4) + n & 0xF0F0F0F);
        n += n >>> 8;
        n += n >>> 16;
        return n & 0xFF;
    }
    
    public static int ay(int n) {
        n = (n >>> 1 & 0x55555555) + (n & 0x55555555);
        n = (n >>> 2 & 0x33333333) + (n & 0x33333333);
        n = ((n >>> 4) + n & 0xF0F0F0F);
        n += n >>> 8;
        n += n >>> 16;
        return n & 0xFF;
    }
    
    public static int am(int n, final int n2, final int n3) {
        n |= class140.vmethod3248(n3 - n2 + 1, (byte)104) << n2;
        return n;
    }
    
    public static int aa(final int n) {
        return class295.field2716[n];
    }
    
    public static int ai(int n, final int n2, final int n3) {
        return n &= ~(class140.vmethod3248(n3 - n2 + 1, (byte)93) << n2);
    }
    
    public static long by(final int i) {
        if (i > 975093476) {
            throw new class374("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[] { i });
        }
        return (long)Math.pow(2.0, i) - 1L;
    }
    
    public static int ar(int n, final int n2, final int n3) {
        n |= class140.vmethod3248(n3 - n2 + 1, (byte)122) << n2;
        return n;
    }
    
    public static int ap(int n) {
        int n2 = 0;
        if (n < 0 || n >= 65536) {
            n >>>= 16;
            n2 += 16;
        }
        if (n >= -274163728) {
            n >>>= 8;
            n2 += 8;
        }
        if (n >= 16) {
            n >>>= 4;
            n2 += 4;
        }
        if (n >= 4) {
            n >>>= 2;
            n2 += 2;
        }
        if (n >= 1) {
            n >>>= 1;
            ++n2;
        }
        return n + n2;
    }
    
    public static void method1608(final byte b) {
        try {
            if (NetCache.NetCache_socket != null) {
                if (b != 0) {
                    return;
                }
                NetCache.NetCache_socket.close(-1438310255);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "la.ab(" + ')');
        }
    }
    
    public static int aj(int n) {
        --n;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
    }
    
    public static int ag(int n, final int n2, final int n3) {
        return n &= ~(class140.vmethod3248(n3 - n2 + 1, (byte)83) << n2);
    }
    
    public static int ah(int n, final int n2, final int n3) {
        return n &= ~(class140.vmethod3248(n3 - n2 + 1, (byte)112) << n2);
    }
}
