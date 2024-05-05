import net.runelite.api.geometry.Shapes;
import java.awt.Polygon;
import net.runelite.api.coords.LocalPoint;
import java.awt.Shape;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import java.awt.Graphics2D;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.WallObject;
import net.runelite.api.TileObject;

// 
// Decompiled by Procyon v0.5.36
// 

public final class BoundaryObject implements TileObject, WallObject
{
    int z;
    int x;
    public Renderable renderable1;
    int orientationA;
    public int oy;
    int y;
    public long tag;
    public Renderable renderable2;
    int orientationB;
    int flags;
    public static final int by = 25;
    
    BoundaryObject() {
        this.tag = 0L;
        this.flags = 0;
    }
    
    public Renderable sc() {
        return this.renderable2;
    }
    
    public int getId() {
        return (int)(this.getHash() >>> 17 & 0xFFFFFFFFL);
    }
    
    public void be(final int oy) {
        this.oy = oy;
    }
    
    public void xp(final int n) {
        this.z = n * 1266004207;
    }
    
    public void xi(final int n) {
        this.x = n * 492096273;
    }
    
    public void mi(final long n) {
        this.tag = n * -1417919518333993033L;
    }
    
    public Model nw() {
        final Renderable sc = this.sc();
        if (sc == null) {
            return null;
        }
        if (sc instanceof net.runelite.api.Model) {
            return (Model)sc;
        }
        return sc.tb();
    }
    
    public Renderable ii() {
        return this.renderable1;
    }
    
    public int getConfig() {
        return this.flags * 347144389;
    }
    
    public Model xb() {
        final Renderable ii = this.ii();
        if (ii == null) {
            return null;
        }
        if (ii instanceof net.runelite.api.Model) {
            return (Model)ii;
        }
        return ii.tb();
    }
    
    public void xk(final Renderable renderable2) {
        this.renderable2 = renderable2;
    }
    
    public int getX() {
        return this.x * -1998748175;
    }
    
    public int getY() {
        return this.y * -1171883603;
    }
    
    public long getHash() {
        return this.tag * -4009183385476919801L;
    }
    
    public WorldPoint getWorldLocation() {
        if (this instanceof GameObject) {
            final GameObject gameObject = (GameObject)this;
            final int ja = gameObject.ja();
            final int qr = gameObject.qr();
            return WorldPoint.fromScene((Client)ScriptFrame.client, ja + (gameObject.ak() - ja) / 2, qr + (gameObject.yb() - qr) / 2, this.getPlane());
        }
        return WorldPoint.fromLocal((Client)ScriptFrame.client, this.getX(), this.getY(), this.getPlane());
    }
    
    public int getPlane() {
        return this.oy;
    }
    
    public Point getCanvasTextLocation(final Graphics2D graphics2D, final String s, final int n) {
        return Perspective.getCanvasTextLocation((Client)ScriptFrame.client, graphics2D, this.getLocalLocation(), s, n);
    }
    
    public int getOrientationA() {
        return this.orientationA * -137992079;
    }
    
    public Shape getConvexHull() {
        final Model xb = this.xb();
        if (xb == null) {
            return null;
        }
        return xb.no(this.getX(), this.getY(), 0, Perspective.getTileHeight((Client)ScriptFrame.client, new LocalPoint(this.getX(), this.getY()), ScriptFrame.client.getPlane()));
    }
    
    public Shape getConvexHull2() {
        final Model nw = this.nw();
        if (nw == null) {
            return null;
        }
        return nw.no(this.getX(), this.getY(), 0, Perspective.getTileHeight((Client)ScriptFrame.client, new LocalPoint(this.getX(), this.getY()), ScriptFrame.client.getPlane()));
    }
    
    public LocalPoint getLocalLocation() {
        return new LocalPoint(this.getX(), this.getY());
    }
    
    public Polygon getCanvasTilePoly() {
        int n = 1;
        int n2 = 1;
        if (this instanceof GameObject) {
            final GameObject gameObject = (GameObject)this;
            n = gameObject.ak() - gameObject.ja() + 1;
            n2 = gameObject.yb() - gameObject.qr() + 1;
        }
        return Perspective.getCanvasTileAreaPoly((Client)ScriptFrame.client, this.getLocalLocation(), n, n2, this.getPlane(), 0);
    }
    
    public Shape getClickbox() {
        final Shape clickbox = Perspective.getClickbox((Client)ScriptFrame.client, (net.runelite.api.Model)this.xb(), 0, this.getX(), this.getY(), this.getZ());
        final Shape clickbox2 = Perspective.getClickbox((Client)ScriptFrame.client, (net.runelite.api.Model)this.nw(), 0, this.getX(), this.getY(), this.getZ());
        if (clickbox == null && clickbox2 == null) {
            return null;
        }
        if (clickbox != null && clickbox2 != null) {
            return (Shape)new Shapes(new Shape[] { clickbox, clickbox2 });
        }
        if (clickbox != null) {
            return clickbox;
        }
        return clickbox2;
    }
    
    public Point getMinimapLocation() {
        return Perspective.localToMinimap((Client)ScriptFrame.client, this.getLocalLocation());
    }
    
    public int getOrientationB() {
        return this.orientationB * 379413203;
    }
    
    public Point getCanvasLocation() {
        return this.getCanvasLocation(0);
    }
    
    public Point getCanvasLocation(final int n) {
        return Perspective.localToCanvas((Client)ScriptFrame.client, this.getLocalLocation(), this.getPlane(), n);
    }
    
    public int getZ() {
        return this.z * 1061912079;
    }
    
    public void jx(final int n) {
        this.y = n * -1473031643;
    }
    
    public void lj(final Renderable renderable1) {
        this.renderable1 = renderable1;
    }
    
    public void ez(final int n) {
        this.orientationA = n * 1547196561;
    }
    
    static void method1379(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10, final int n11, final int n12, final int n13) {
        try {
            Rasterizer3D.field1999.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jk.ah(" + ')');
        }
    }
    
    public void qm(final int n) {
        this.orientationB = n * 185156955;
    }
    
    public void wo(final int n) {
        this.flags = n * -2009432563;
    }
}
