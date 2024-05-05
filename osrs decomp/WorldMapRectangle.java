// 
// Decompiled by Procyon v0.5.36
// 

public final class WorldMapRectangle
{
    int width;
    int x;
    int height;
    int y;
    final /* synthetic */ WorldMapManager this$0;
    static final int av = 7;
    static int field2405;
    
    WorldMapRectangle(final WorldMapManager this$0) {
        this.this$0 = this$0;
    }
    
    static void method1522(final String s, final String s2, final String s3, final int n) {
        try {
            class129.method763(7, (byte)91);
            class205.method1137(s, s2, s3, -2114679058);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ju.at(" + ')');
        }
    }
    
    public static void qm(final ItemComposition itemComposition, final Buffer buffer) {
        if (itemComposition == null) {
            itemComposition.isTradeable();
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            ItemComposition.qh(itemComposition, buffer, ra, (byte)(-91));
        }
    }
}
