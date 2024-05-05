import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class class337 implements class356
{
    static final class337 field3420;
    static final class337 field3421;
    static final class337 field3422;
    static final class337 field3423;
    final int field3424;
    
    class337(final int n) {
        this.field3424 = 521487647 * n;
    }
    
    static {
        field3421 = new class337(-1);
        field3423 = new class337(0);
        field3420 = new class337(1);
        field3422 = new class337(2);
    }
    
    public static void es(final WorldMapRegion worldMapRegion, final int n, final int n2, int n3, final int n4) {
        if (worldMapRegion == null) {
            worldMapRegion.method1457(n, n);
        }
        n3 %= 4;
        if (0 == n3) {
            Rasterizer2D.Rasterizer2D_drawVerticalLine(-1897887643 * worldMapRegion.pixelsPerTile * n, worldMapRegion.pixelsPerTile * -1897887643 * (63 - n2), worldMapRegion.pixelsPerTile * -1897887643, n4);
        }
        if (1 == n3) {
            Rasterizer2D.Rasterizer2D_drawHorizontalLine(worldMapRegion.pixelsPerTile * -1897887643 * n, (63 - n2) * (worldMapRegion.pixelsPerTile * -1897887643), -1897887643 * worldMapRegion.pixelsPerTile, n4);
        }
        if (n3 == 2) {
            Rasterizer2D.Rasterizer2D_drawVerticalLine(worldMapRegion.pixelsPerTile * -1897887643 * n + worldMapRegion.pixelsPerTile * -1897887643 - 1, worldMapRegion.pixelsPerTile * -1897887643 * (63 - n2), worldMapRegion.pixelsPerTile * -1897887643, n4);
        }
        if (n3 == 3) {
            Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (-1897887643 * worldMapRegion.pixelsPerTile), -1897887643 * worldMapRegion.pixelsPerTile + (63 - n2) * (worldMapRegion.pixelsPerTile * -1897887643) - 1, -1897887643 * worldMapRegion.pixelsPerTile, n4);
        }
    }
    
    @Override
    public int aw() {
        return this.field3424 * 349092197;
    }
    
    @Override
    public int an() {
        return this.field3424 * -1923877153;
    }
    
    @Override
    public int ac() {
        return this.field3424 * -1923877153;
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.field3424 * -1923877153;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mb.af(" + ')');
        }
    }
    
    public static class337[] ab() {
        return new class337[] { class337.field3421, class337.field3422, class337.field3423, class337.field3420 };
    }
    
    public static class337[] aq() {
        return new class337[] { class337.field3421, class337.field3422, class337.field3423, class337.field3420 };
    }
    
    public static void og(final PcmPlayer pcmPlayer) {
        if (pcmPlayer == null) {
            pcmPlayer.ah();
            return;
        }
        pcmPlayer.field207 = true;
    }
    
    public static Map zq(final class394 class394) {
        return class394.field3683;
    }
}
