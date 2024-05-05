// 
// Decompiled by Procyon v0.5.36
// 

public class VarcInt extends DualNode
{
    public static EvictingDualNodeHashTable VarcInt_cached;
    public boolean persist;
    static final int af = 0;
    
    public VarcInt() {
        this.persist = false;
    }
    
    static {
        VarcInt.VarcInt_cached = new EvictingDualNodeHashTable(64);
    }
    
    public void aw(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            wj(this, buffer, ra, 186513622);
        }
    }
    
    void method992(final Buffer buffer, final int n, final int n2) {
        try {
            if (2 == n) {
                if (n2 == 294985633) {
                    throw new IllegalStateException();
                }
                this.persist = true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hi.an(" + ')');
        }
    }
    
    public void ac(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            wj(this, buffer, ra, 887119169);
        }
    }
    
    void au(final Buffer buffer, final int n) {
        if (2 == n) {
            this.persist = true;
        }
    }
    
    public void method991(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                wj(this, buffer, ra, -194909553);
            }
            if (n == 65536) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hi.af(" + ')');
        }
    }
    
    public static boolean isCharPrintable(final char c, final byte b) {
        try {
            if (c >= ' ') {
                if (b <= -1) {
                    throw new IllegalStateException();
                }
                if (c <= '~') {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
            if (c >= ' ') {
                if (b <= -1) {
                    throw new IllegalStateException();
                }
                if (c <= '\u00ff') {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
            if ('\u20ac' != c) {
                if (b <= -1) {
                    throw new IllegalStateException();
                }
                if (c != '\u0152') {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    if (c != '\u2014') {
                        if (b <= -1) {
                            throw new IllegalStateException();
                        }
                        if (c != '\u0153') {
                            if ('\u0178' != c) {
                                return false;
                            }
                            if (b <= -1) {
                                throw new IllegalStateException();
                            }
                        }
                    }
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hi.ag(" + ')');
        }
    }
    
    public static void wj(final VarcInt varcInt, final Buffer buffer, final int n, final int n2) {
        if (varcInt == null) {
            varcInt.method992(buffer, n, n);
        }
        try {
            if (2 == n) {
                if (n2 == 294985633) {
                    throw new IllegalStateException();
                }
                varcInt.persist = true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hi.an(" + ')');
        }
    }
}
