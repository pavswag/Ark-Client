import net.runelite.api.Rasterizer;

// 
// Decompiled by Procyon v0.5.36
// 

class rl8 implements Rasterizer
{
    public rl8() {
    }
    
    public int getWidth() {
        return Rasterizer2D.Rasterizer2D_width;
    }
    
    public int[] getPixels() {
        return Rasterizer2D.Rasterizer2D_pixels;
    }
    
    public void fillRectangle(final int n, final int n2, final int n3, final int n4, final int n5) {
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, n5);
    }
    
    public void setRasterGouraudLowRes(final boolean b) {
        Rasterizer3D.clips.tj(b);
    }
    
    public int getHeight() {
        return Rasterizer2D.Rasterizer2D_height;
    }
    
    public static Object wj(final class377 class377) {
        if (class377 == null) {
            return class377.ay();
        }
        if (class377.field3610 * -1960181101 == 0) {
            return null;
        }
        return class377.field3608[0].field3600;
    }
    
    public void rasterGouraud(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        class220.ic(n, n2, n3, n4, n5, n6, 0.0f, 0.0f, 0.0f, n7, n8, n9);
    }
    
    public void rasterFlat(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        class220.ve(n, n2, n3, n4, n5, n6, 0.0f, 0.0f, 0.0f, n7);
    }
}
