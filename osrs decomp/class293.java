// 
// Decompiled by Procyon v0.5.36
// 

public final class class293
{
    static long field2711;
    static long field2712;
    
    class293() throws Throwable {
        throw new Error();
    }
    
    public static final synchronized long an() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < class293.field2711 * 1436109859624790083L) {
            class293.field2712 += 4531959532299302581L * (class293.field2711 * 1436109859624790083L - currentTimeMillis);
        }
        class293.field2711 = -820153132959898517L * currentTimeMillis;
        return currentTimeMillis + 5764352098133378973L * class293.field2712;
    }
    
    static final void forceDisconnect(final int n, final int n2) {
        try {
            class31.logOut(-919092771);
            switch (n) {
                case 1: {
                    class220.method1233((byte)92);
                    break;
                }
                case 2: {
                    UrlRequest.method680(-560341895);
                    break;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lk.hg(" + ')');
        }
    }
}
