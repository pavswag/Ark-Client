import java.awt.Polygon;
import net.runelite.api.coords.LocalPoint;
import java.awt.Shape;
import net.runelite.api.Perspective;
import java.awt.Graphics2D;
import net.runelite.api.Point;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.TileObject;

// 
// Decompiled by Procyon v0.5.36
// 

public final class GameObject implements TileObject, net.runelite.api.GameObject
{
    int centerX;
    int plane;
    int endX;
    int endY;
    public Renderable renderable;
    int lastDrawn;
    int flags;
    static int baseY;
    int field2271;
    int orientation;
    int startX;
    int z;
    public long tag;
    int startY;
    static int[][] xteaKeys;
    public int ny;
    int centerY;
    
    GameObject() {
        this.tag = 0L;
        this.centerY = 0;
    }
    
    public void id(final int n) {
        this.field2271 = n * -700889925;
    }
    
    public void db(final int n) {
        this.z = n * -76184583;
    }
    
    public void on(final int n) {
        this.startX = n * -1266251803;
    }
    
    public int getId() {
        return (int)(this.getHash() >>> 17 & 0xFFFFFFFFL);
    }
    
    public int ak() {
        return this.startY * -1242897449;
    }
    
    public void ns(final int n) {
        this.centerX = n * -521982365;
    }
    
    public int ja() {
        return this.flags * 626811319;
    }
    
    public void qt(final int n) {
        this.startY = n * 1300873191;
    }
    
    public int gp() {
        return this.endX * -872547715;
    }
    
    public void ji(final int n) {
        this.orientation = n * -1083409309;
    }
    
    public void fa(final int n) {
        this.plane = n * 1244562195;
    }
    
    public static void fe(final PacketBuffer packetBuffer) {
        packetBuffer.bitIndex = packetBuffer.at * 818064504;
    }
    
    public void dy(final int n) {
        this.endX = n * -1695101227;
    }
    
    public int getConfig() {
        return this.centerY * -72925475;
    }
    
    public int yb() {
        return this.orientation * -80616117;
    }
    
    public int qr() {
        return this.field2271 * 2004902003;
    }
    
    public int getOrientation() {
        return (this.getConfig() >> 6 & 0x3) * 512 + this.getModelOrientation();
    }
    
    public void co(final int n) {
        this.lastDrawn = n * -1843325159;
    }
    
    public void ka(final Renderable renderable) {
        this.renderable = renderable;
    }
    
    public int getX() {
        return this.endY * -1546117209;
    }
    
    public int getY() {
        return this.centerX * 1463075659;
    }
    
    public Model yq() {
        final Renderable qx = this.qx();
        if (qx == null) {
            return null;
        }
        if (qx instanceof Model) {
            return (Model)qx;
        }
        return qx.tb();
    }
    
    public long getHash() {
        return this.tag * 5016412888503339625L;
    }
    
    public WorldPoint getWorldLocation() {
        if (this instanceof GameObject) {
            final GameObject gameObject = this;
            final int ja = gameObject.ja();
            final int qr = gameObject.qr();
            return WorldPoint.fromScene((Client)ScriptFrame.client, ja + (gameObject.ak() - ja) / 2, qr + (gameObject.yb() - qr) / 2, this.getPlane());
        }
        return WorldPoint.fromLocal((Client)ScriptFrame.client, this.getX(), this.getY(), this.getPlane());
    }
    
    public int getPlane() {
        return this.ny;
    }
    
    public Point getSceneMinLocation() {
        return new Point(this.ja(), this.qr());
    }
    
    public Point getSceneMaxLocation() {
        return new Point(this.ak(), this.yb());
    }
    
    public Point getCanvasTextLocation(final Graphics2D graphics2D, final String s, final int n) {
        return Perspective.getCanvasTextLocation((Client)ScriptFrame.client, graphics2D, this.getLocalLocation(), s, n);
    }
    
    public int getModelOrientation() {
        return this.lastDrawn * -1521986263;
    }
    
    public Shape getConvexHull() {
        final Model yq = this.yq();
        if (yq == null) {
            return null;
        }
        return yq.no(this.getX(), this.getY(), this.getModelOrientation(), this.getZ());
    }
    
    public LocalPoint getLocalLocation() {
        return new LocalPoint(this.getX(), this.getY());
    }
    
    public int sizeY() {
        return this.yb() - this.qr() + 1;
    }
    
    public Polygon getCanvasTilePoly() {
        int n = 1;
        int n2 = 1;
        if (this instanceof GameObject) {
            final GameObject gameObject = this;
            n = gameObject.ak() - gameObject.ja() + 1;
            n2 = gameObject.yb() - gameObject.qr() + 1;
        }
        return Perspective.getCanvasTileAreaPoly((Client)ScriptFrame.client, this.getLocalLocation(), n, n2, this.getPlane(), 0);
    }
    
    public Shape getClickbox() {
        return Perspective.getClickbox((Client)ScriptFrame.client, (net.runelite.api.Model)this.yq(), this.getModelOrientation(), this.getX(), this.getY(), this.getZ());
    }
    
    public Point getMinimapLocation() {
        return Perspective.localToMinimap((Client)ScriptFrame.client, this.getLocalLocation());
    }
    
    public int sizeX() {
        return this.ak() - this.ja() + 1;
    }
    
    public Point getCanvasLocation() {
        return this.getCanvasLocation(0);
    }
    
    public Point getCanvasLocation(final int n) {
        return Perspective.localToCanvas((Client)ScriptFrame.client, this.getLocalLocation(), this.getPlane(), n);
    }
    
    public int getZ() {
        return this.plane * 1042267931;
    }
    
    public void yf(final int n) {
        this.flags = n * 843140103;
    }
    
    public void jl(final int n) {
        this.centerY = n * -287536779;
    }
    
    public void qh(final long n) {
        this.tag = n * 8415652607842018777L;
    }
    
    public Renderable qx() {
        return this.renderable;
    }
    
    public void kv(final int n) {
        this.endY = n * -299460585;
    }
    
    public void uv(final int ny) {
        this.ny = ny;
    }
}
