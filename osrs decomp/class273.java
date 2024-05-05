// 
// Decompiled by Procyon v0.5.36
// 

public abstract class class273 implements class275
{
    protected int field2449;
    
    protected class273(final StudioGame studioGame, final Language language, final int n) {
        this.field2449 = -2121295607 * n;
    }
    
    static void method1570(final int n) {
        try {
            ByteArrayPool.field3662.clear();
            ByteArrayPool.field3662.add(100);
            ByteArrayPool.field3662.add(5000);
            ByteArrayPool.field3662.add(10000);
            ByteArrayPool.field3662.add(30000);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kr.an(" + ')');
        }
    }
    
    public static int lv(final Coord coord) {
        if (coord == null) {
            return coord.mz();
        }
        return coord.packed(-964267539);
    }
}
