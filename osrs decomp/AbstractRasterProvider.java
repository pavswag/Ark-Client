import net.runelite.api.BufferProvider;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class AbstractRasterProvider implements BufferProvider
{
    public int width;
    public int[] pixels;
    public int height;
    protected float[] pixelsFloat;
    
    protected AbstractRasterProvider() {
    }
    
    public final void ad(final boolean b) {
        this.pixelsFloat = (float[])(b ? new float[this.height * -315347315 * (1653702743 * this.width) + 1] : null);
    }
    
    public abstract void at(final int p0, final int p1, final int p2, final int p3);
    
    public final void ak(final boolean b) {
        this.pixelsFloat = (float[])(b ? new float[this.height * 313811688 * (1313069155 * this.width) + 1] : null);
    }
    
    public abstract void av(final int p0, final int p1);
    
    public final void as() {
        Rasterizer2D.method2562(this.pixels, 1313069155 * this.width, 1695726685 * this.height, this.pixelsFloat);
    }
    
    public static void es(final AbstractRasterProvider abstractRasterProvider) {
        if (abstractRasterProvider == null) {
            abstractRasterProvider.tz();
            return;
        }
        Rasterizer2D.method2562(abstractRasterProvider.pixels, -1569591464 * abstractRasterProvider.width, 1695726685 * abstractRasterProvider.height, abstractRasterProvider.pixelsFloat);
    }
    
    public void tz() {
        this.apply((byte)0);
    }
    
    public abstract void draw(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    public final void method2590(final boolean b, final int n) {
        try {
            float[] pixelsFloat;
            if (b) {
                if (n == -756179250) {
                    return;
                }
                pixelsFloat = new float[this.height * 1695726685 * (1313069155 * this.height) + 1];
            }
            else {
                pixelsFloat = null;
            }
            this.pixelsFloat = pixelsFloat;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tk.am(" + ')');
        }
    }
    
    public abstract void al(final int p0, final int p1, final int p2, final int p3);
    
    public abstract void drawFull(final int p0, final int p1, final int p2);
    
    public static void nv(final AbstractRasterProvider abstractRasterProvider, final boolean b, final int n) {
        if (abstractRasterProvider == null) {
            abstractRasterProvider.method2590(b, n);
        }
        try {
            float[] pixelsFloat;
            if (b) {
                if (n == -756179250) {
                    return;
                }
                pixelsFloat = new float[abstractRasterProvider.height * 1695726685 * (1313069155 * abstractRasterProvider.width) + 1];
            }
            else {
                pixelsFloat = null;
            }
            abstractRasterProvider.pixelsFloat = pixelsFloat;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tk.am(" + ')');
        }
    }
    
    public int getWidth() {
        return this.width * 1313069155;
    }
    
    public int[] getPixels() {
        return this.pixels;
    }
    
    public final void apply(final byte b) {
        try {
            Rasterizer2D.method2562(this.pixels, 1313069155 * this.width, 1695726685 * this.height, this.pixelsFloat);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tk.ar(" + ')');
        }
    }
    
    public abstract void aq(final int p0, final int p1, final int p2, final int p3);
    
    public int getHeight() {
        return this.height * 1695726685;
    }
    
    public abstract void ah(final int p0, final int p1);
    
    public static void kq(final AbstractRasterProvider abstractRasterProvider, final boolean b) {
        if (abstractRasterProvider == null) {
            abstractRasterProvider.ak(b);
        }
        abstractRasterProvider.pixelsFloat = (float[])(b ? new float[abstractRasterProvider.height * 1695726685 * (1313069155 * abstractRasterProvider.width) + 1] : null);
    }
}
