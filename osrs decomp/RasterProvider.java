import java.awt.color.ColorSpace;
import java.awt.Canvas;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.awt.image.ColorModel;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import java.awt.Point;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.DirectColorModel;
import java.awt.image.DataBufferInt;
import java.awt.Image;
import java.awt.Component;
import java.awt.Graphics;
import net.runelite.api.MainBufferProvider;

// 
// Decompiled by Procyon v0.5.36
// 

public final class RasterProvider extends AbstractRasterProvider implements MainBufferProvider
{
    public Graphics ey;
    Component component;
    Image image;
    
    RasterProvider(final int n, final int n2, final Component component, final boolean b) {
        this.ac = n * 1020619083;
        this.au = 1097136117 * n2;
        this.aw = new int[1 + n * n2];
        if (b) {
            this.ab = new float[n2 * n + 1];
        }
        final DataBufferInt db = new DataBufferInt(this.aw, this.aw.length);
        final DirectColorModel cm = new DirectColorModel(32, 16711680, 65280, 255);
        this.image = new BufferedImage(cm, Raster.createWritableRaster(cm.createCompatibleSampleModel(1313069155 * this.ac, this.au * 1695726685), db, null), false, new Hashtable<Object, Object>());
        this.setComponent(component, (byte)83);
        this.ar((byte)0);
        this.kz(n, n2, component);
    }
    
    final void ao(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        try {
            final Shape clip = graphics.getClip();
            graphics.clipRect(n, n2, n3, n4);
            graphics.drawImage(this.image, 0, 0, this.component);
            graphics.setClip(clip);
        }
        catch (Exception ex) {
            this.component.repaint();
        }
    }
    
    @Override
    public final void at(final int n, final int n2, final int n3, final int n4) {
        this.draw0(this.component.getGraphics(), n, n2, n3, n4, 975611099);
    }
    
    @Override
    public final void av(final int n, final int n2) {
        this.drawFull0(this.component.getGraphics(), n, n2, 1767790220);
    }
    
    public Component jv() {
        return this.component;
    }
    
    final void ay(final Graphics graphics, final int n, final int n2) {
        try {
            graphics.drawImage(this.image, n, n2, this.component);
        }
        catch (Exception ex) {
            this.component.repaint();
        }
    }
    
    public void nu(final Image image) {
        this.image = image;
    }
    
    @Override
    public final void draw(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            this.draw0(this.component.getGraphics(), n, n2, n3, n4, -1060106622);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bo.aw(" + ')');
        }
    }
    
    @Override
    public final void al(final int n, final int n2, final int n3, final int n4) {
        this.draw0(this.component.getGraphics(), n, n2, n3, n4, -1597375263);
    }
    
    @Override
    public final void drawFull(final int n, final int n2, final int n3) {
        if (this.ey == null) {
            this.ey = ((Canvas)this.jv()).getGraphics();
        }
        ScriptFrame.client.getCallbacks().draw((MainBufferProvider)this, this.ey, n, n2);
    }
    
    final void drawFull0(final Graphics graphics, final int n, final int n2, final int n3) {
        try {
            try {
                graphics.drawImage(this.image, n, n2, this.component);
            }
            catch (Exception ex2) {
                this.component.repaint();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bo.ac(" + ')');
        }
    }
    
    final void draw0(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            try {
                final Shape clip = graphics.getClip();
                graphics.clipRect(n, n2, n3, n4);
                graphics.drawImage(this.image, 0, 0, this.component);
                graphics.setClip(clip);
            }
            catch (Exception ex2) {
                this.component.repaint();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bo.au(" + ')');
        }
    }
    
    final void ai(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        try {
            final Shape clip = graphics.getClip();
            graphics.clipRect(n, n2, n3, n4);
            graphics.drawImage(this.image, 0, 0, this.component);
            graphics.setClip(clip);
        }
        catch (Exception ex) {
            this.component.repaint();
        }
    }
    
    public Image getImage() {
        return this.image;
    }
    
    public static void vx(final RasterProvider rasterProvider, final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        if (rasterProvider == null) {
            rasterProvider.av(n, n);
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
    
    final void setComponent(final Component component, final byte b) {
        try {
            this.component = component;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bo.af(" + ')');
        }
    }
    
    final void ab(final Component component) {
        this.component = component;
    }
    
    @Override
    public final void aq(final int n, final int n2, final int n3, final int n4) {
        this.draw0(this.component.getGraphics(), n, n2, n3, n4, -703152610);
    }
    
    public void kz(final int w, final int h, final Component component) {
        if (!ScriptFrame.client.isGpu()) {
            return;
        }
        final int[] pixels = this.getPixels();
        final DataBufferInt db = new DataBufferInt(pixels, pixels.length);
        final DirectColorModel cm = new DirectColorModel(ColorSpace.getInstance(1000), 32, 16711680, 65280, 255, -16777216, true, 3);
        this.nu(new BufferedImage(cm, Raster.createWritableRaster(cm.createCompatibleSampleModel(w, h), db, null), true, new Hashtable<Object, Object>()));
    }
    
    @Override
    public final void ah(final int n, final int n2) {
        this.drawFull0(this.component.getGraphics(), n, n2, 1818067960);
    }
}
