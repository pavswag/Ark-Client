import net.runelite.api.geometry.Shapes;
import java.awt.Polygon;
import net.runelite.api.coords.LocalPoint;
import java.awt.Shape;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import java.awt.Graphics2D;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.DecorativeObject;
import net.runelite.api.TileObject;

// 
// Decompiled by Procyon v0.5.36
// 

public final class WallDecoration implements TileObject, DecorativeObject
{
    int xOffset;
    public long tag;
    int y;
    int x;
    int orientation2;
    public Renderable renderable2;
    int yOffset;
    public Renderable renderable1;
    int orientation;
    int z;
    int flags;
    public int tr;
    static Font fontPlain12;
    public static final int bx = 256;
    
    WallDecoration() {
        this.tag = 0L;
        this.flags = 0;
    }
    
    public void of(final int n) {
        this.orientation2 = n * 1035196391;
    }
    
    public int getId() {
        return (int)(this.getHash() >>> 17 & 0xFFFFFFFFL);
    }
    
    public static void jv(final Scene scene, final int n, final int n2, final int n3) {
        final Tile tile = scene.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        tile.itemLayer = null;
    }
    
    public void ee(final long n) {
        this.tag = n * -5837374244328004387L;
    }
    
    public void fc(final int n) {
        this.yOffset = n * -965136487;
    }
    
    public void pb(final Renderable renderable2) {
        this.renderable2 = renderable2;
    }
    
    public Renderable ja() {
        return this.renderable1;
    }
    
    static final void method1385(final byte[] array, final int n, final int n2, final int n3, final int n4, final CollisionMap[] array2, final int n5) {
        try {
            for (int i = 0; i < 4; ++i) {
                if (n5 != 960745047) {
                    throw new IllegalStateException();
                }
                for (int j = 0; j < 64; ++j) {
                    if (n5 != 960745047) {
                        throw new IllegalStateException();
                    }
                    for (int k = 0; k < 64; ++k) {
                        if (n5 != 960745047) {
                            return;
                        }
                        if (n + j > 0) {
                            if (n5 != 960745047) {
                                throw new IllegalStateException();
                            }
                            if (n + j < 103) {
                                if (n5 != 960745047) {
                                    throw new IllegalStateException();
                                }
                                if (k + n2 > 0) {
                                    if (n5 != 960745047) {
                                        return;
                                    }
                                    if (k + n2 < 103) {
                                        final int[] array3 = array2[i].flags[n + j];
                                        final int n6 = n2 + k;
                                        array3[n6] &= 0xFEFFFFFF;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final Buffer buffer = new Buffer(array);
            for (int l = 0; l < 4; ++l) {
                if (n5 != 960745047) {
                    return;
                }
                for (int n7 = 0; n7 < 64; ++n7) {
                    for (int n8 = 0; n8 < 64; ++n8) {
                        if (n5 != 960745047) {
                            throw new IllegalStateException();
                        }
                        final int n9 = n + n7;
                        final int n10 = n2 + n8;
                        class372.loadTerrain(buffer, l, n9, n10, n3 + n9, n4 + n10, 0, (byte)(-110));
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "je.ac(" + ')');
        }
    }
    
    static void method1385(final int n) {
        try {
            if (null != Login.Login_username) {
                if (n != 285951283) {
                    throw new IllegalStateException();
                }
                if (Login.Login_username.length() > 0) {
                    if (n != 285951283) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            if (class20.clientPreferences.getUsernameToRemember(-103132583) != null) {
                if (n != 285951283) {
                    throw new IllegalStateException();
                }
                Login.Login_username = class20.clientPreferences.getUsernameToRemember(-68966768);
                Client.it(-1);
                Client.Login_isUsernameRemembered = true;
            }
            else {
                Client.Login_isUsernameRemembered = false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "je.ac(" + ')');
        }
    }
    
    public void ox(final int n) {
        this.z = n * -33433415;
    }
    
    public void rr(final int n) {
        this.flags = n * -486021893;
    }
    
    public int gk() {
        return this.orientation2 * -1711060009;
    }
    
    public void tx(final int n) {
        this.x = n * -129749169;
    }
    
    public int getConfig() {
        return this.flags * 35030579;
    }
    
    public void pq(final int n) {
        this.orientation = n * -1230454197;
    }
    
    public void mb(final int tr) {
        this.tr = tr;
    }
    
    public Model cg() {
        final Renderable ja = this.ja();
        if (ja == null) {
            return null;
        }
        Model tb;
        if (ja instanceof Model) {
            tb = (Model)ja;
        }
        else {
            tb = ja.tb();
        }
        return tb;
    }
    
    public Renderable re() {
        return this.renderable2;
    }
    
    public void wa(final int n) {
        this.xOffset = n * -1372050943;
    }
    
    public int getX() {
        return this.x * 1346340783;
    }
    
    public int getY() {
        return this.y * 1328351163;
    }
    
    public long getHash() {
        return this.tag * -4691380879163567243L;
    }
    
    public WorldPoint getWorldLocation() {
        if (this instanceof GameObject) {
            final GameObject gameObject = (GameObject)this;
            final int ja = gameObject.ja();
            final int qr = gameObject.qr();
            return WorldPoint.fromScene((net.runelite.api.Client)ScriptFrame.client, ja + (gameObject.ak() - ja) / 2, qr + (gameObject.yb() - qr) / 2, this.getPlane());
        }
        return WorldPoint.fromLocal((net.runelite.api.Client)ScriptFrame.client, this.getX(), this.getY(), this.getPlane());
    }
    
    public int getPlane() {
        return this.tr;
    }
    
    public Point getCanvasTextLocation(final Graphics2D graphics2D, final String s, final int n) {
        return Perspective.getCanvasTextLocation((net.runelite.api.Client)ScriptFrame.client, graphics2D, this.getLocalLocation(), s, n);
    }
    
    public Shape getConvexHull() {
        final Model cg = this.cg();
        if (cg == null) {
            return null;
        }
        return cg.no(this.getX() + this.getXOffset(), this.getY() + this.getYOffset(), 0, this.getZ());
    }
    
    public Shape getConvexHull2() {
        final Model xq = this.xq();
        if (xq == null) {
            return null;
        }
        return xq.no(this.getX(), this.getY(), 0, this.getZ());
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
        return Perspective.getCanvasTileAreaPoly((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation(), n, n2, this.getPlane(), 0);
    }
    
    public Shape getClickbox() {
        final Shape clickbox = Perspective.getClickbox((net.runelite.api.Client)ScriptFrame.client, (net.runelite.api.Model)this.cg(), 0, this.getX() + this.getXOffset(), this.getY() + this.getYOffset(), this.getZ());
        final Shape clickbox2 = Perspective.getClickbox((net.runelite.api.Client)ScriptFrame.client, (net.runelite.api.Model)this.xq(), 0, this.getX(), this.getY(), this.getZ());
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
        return Perspective.localToMinimap((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation());
    }
    
    public int getXOffset() {
        return this.xOffset * 1353438721;
    }
    
    public int getYOffset() {
        return this.yOffset * 1573434537;
    }
    
    public Point getCanvasLocation(final int n) {
        return Perspective.localToCanvas((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation(), this.getPlane(), n);
    }
    
    public Point getCanvasLocation() {
        return this.getCanvasLocation(0);
    }
    
    public int getZ() {
        return this.z * 452898185;
    }
    
    public Model xq() {
        final Renderable re = this.re();
        if (re == null) {
            return null;
        }
        Model tb;
        if (re instanceof Model) {
            tb = (Model)re;
        }
        else {
            tb = re.tb();
        }
        return tb;
    }
    
    public void ez(final Renderable renderable1) {
        this.renderable1 = renderable1;
    }
    
    static void revalidateWidgetScroll(final Widget[] array, final Widget widget, final boolean b, final byte b2) {
        try {
            int n;
            if (widget.scrollWidth * -773060713 != 0) {
                if (b2 <= 1) {
                    throw new IllegalStateException();
                }
                n = widget.scrollWidth * -773060713;
            }
            else {
                n = -794961409 * widget.width;
            }
            final int n2 = n;
            int n3;
            if (0 != widget.scrollHeight * -1273374131) {
                if (b2 <= 1) {
                    return;
                }
                n3 = -1273374131 * widget.scrollHeight;
            }
            else {
                n3 = widget.height * 1473950221;
            }
            final int n4 = n3;
            class135.resizeInterface(array, 1713081171 * widget.id, n2, n4, b, 1809081725);
            if (widget.children != null) {
                if (b2 <= 1) {
                    throw new IllegalStateException();
                }
                class135.resizeInterface(widget.children, 1713081171 * widget.id, n2, n4, b, 1809081725);
            }
            final InterfaceParent interfaceParent = (InterfaceParent)Client.interfaceParents.at(widget.id * 1713081171);
            if (null != interfaceParent) {
                SequenceDefinition.method1129(interfaceParent.group * 944864121, n2, n4, b, -726165376);
            }
            if (1337 == widget.contentType * 1021339961 && b2 <= 1) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "je.lz(" + ')');
        }
    }
    
    public void bf(final int n) {
        this.y = n * 1153344883;
    }
}
