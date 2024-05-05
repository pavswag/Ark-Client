// 
// Decompiled by Procyon v0.5.36
// 

public final class PendingSpawn extends Node
{
    static final int dl = 4;
    int type;
    int x;
    int y;
    int objectId;
    int field922;
    int objectType;
    int startCycle;
    int rotation;
    int id;
    int field927;
    int field928;
    int plane;
    int endCycle;
    static final int bz = 40;
    static final int bo = 19137016;
    public static final int bn = 49;
    int field931;
    
    PendingSpawn() {
        this.field928 = 2015793749;
        this.startCycle = 0;
        this.endCycle = -376812409;
    }
    
    public int td() {
        return this.x * 68300005;
    }
    
    public int ih() {
        return this.endCycle * 1457211081;
    }
    
    void aw(final int n) {
        this.field928 = -1874637045 * n;
    }
    
    boolean al(final int n) {
        return n < 0 || n > 4 || 0x0 != (-1693875037 * this.field928 & 1 << n);
    }
    
    boolean method525(final int n, final int n2) {
        try {
            if (n >= 0) {
                if (n2 != -633273091) {
                    throw new IllegalStateException();
                }
                if (n <= 4) {
                    if (n2 != -633273091) {
                        throw new IllegalStateException();
                    }
                    return 0x0 != (-1693875037 * this.field928 & 1 << n);
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dg.an(" + ')');
        }
    }
    
    void ac(final int n) {
        this.field928 = -1874637045 * n;
    }
    
    public int rr() {
        return this.y * 800888185;
    }
    
    void au(final int n) {
        this.field928 = 1844969273 * n;
    }
    
    public void ke(final int n) {
        this.startCycle = n * 237969965;
    }
    
    public void lw(final int n) {
        this.y = n * -1930509111;
    }
    
    public static Frames method524(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final int n, final boolean b, final int n2) {
        try {
            boolean b2 = true;
            final int[] yk = AbstractArchive.yk(abstractArchive, n, 1778835324);
            for (int i = 0; i < yk.length; ++i) {
                if (n2 == 1681093452) {
                    throw new IllegalStateException();
                }
                final byte[] file = abstractArchive.getFile(n, yk[i], -606351717);
                if (null == file) {
                    if (n2 == 1681093452) {
                        throw new IllegalStateException();
                    }
                    b2 = false;
                }
                else {
                    final int n3 = (file[0] & 0xFF) << 8 | (file[1] & 0xFF);
                    byte[] array;
                    if (b) {
                        array = abstractArchive2.getFile(0, n3, -606351717);
                    }
                    else {
                        array = abstractArchive2.getFile(n3, 0, -606351717);
                    }
                    if (null == array) {
                        if (n2 == 1681093452) {
                            throw new IllegalStateException();
                        }
                        b2 = false;
                    }
                }
            }
            if (!b2) {
                if (n2 == 1681093452) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                try {
                    return new Frames(abstractArchive, abstractArchive2, n, b);
                }
                catch (Exception ex2) {
                    return null;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dg.af(" + ')');
        }
    }
    
    void method524(final int n, final byte b) {
        try {
            this.field928 = -1874637045 * n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dg.af(" + ')');
        }
    }
    
    boolean ab(final int n) {
        return n < 0 || n > 4 || 0x0 != (-1693875037 * this.field928 & 1 << n);
    }
    
    boolean aq(final int n) {
        return n < 0 || n > 4 || 0x0 != (-1693875037 * this.field922 & 1 << n);
    }
    
    public void yv(final int n) {
        this.x = n * -1524387603;
    }
    
    public static boolean lg(final PendingSpawn pendingSpawn, final int n) {
        if (pendingSpawn == null) {
            return pendingSpawn.aq(n);
        }
        return n < 0 || n > 4 || 0x0 != (-1693875037 * pendingSpawn.field928 & 1 << n);
    }
}
