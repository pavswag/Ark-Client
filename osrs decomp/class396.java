import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.awt.Graphics;

// 
// Decompiled by Procyon v0.5.36
// 

public class class396
{
    static final class396 field3687;
    final int field3688;
    public static final class396 field3689;
    static IndexedSprite[] runesSprite;
    
    class396(final int n) {
        this.field3688 = -1839311497 * n;
    }
    
    static {
        field3689 = new class396(1);
        field3687 = new class396(0);
    }
    
    public static void ce(final RasterProvider rasterProvider, final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        if (rasterProvider == null) {
            rasterProvider.draw(n, n, n, n, n);
            return;
        }
        try {
            final Shape clip = graphics.getClip();
            graphics.clipRect(n, n2, n3, n4);
            graphics.drawImage(rasterProvider.image, 0, 0, rasterProvider.component);
            graphics.setClip(clip);
        }
        catch (Exception ex) {
            rasterProvider.component.repaint();
        }
    }
}
