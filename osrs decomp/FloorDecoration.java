import java.awt.Polygon;
import net.runelite.api.coords.LocalPoint;
import java.awt.Shape;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import java.awt.Graphics2D;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.Actor;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.GroundObject;
import net.runelite.api.TileObject;

// 
// Decompiled by Procyon v0.5.36
// 

public final class FloorDecoration implements TileObject, GroundObject
{
    int flags;
    public int dv;
    int x;
    int y;
    public Renderable renderable;
    public long tag;
    int z;
    
    FloorDecoration() {
    }
    
    public int getId() {
        return (int)(this.getHash() >>> 17 & 0xFFFFFFFFL);
    }
    
    public static void ts(final class425 class425, final float n) {
        if (class425 == null) {
            class425.bd(n);
            return;
        }
        class425.method2260(n, n, n, -929432583);
    }
    
    public void ti(final Renderable renderable) {
        this.renderable = renderable;
    }
    
    public void sn(final int dv) {
        this.dv = dv;
    }
    
    static final int method1209(final int n, int n2, final int n3) {
        try {
            n2 = (n & 0x7F) * n2 >> 7;
            if (n2 < 2) {
                if (n3 != 769773533) {
                    throw new IllegalStateException();
                }
                n2 = 2;
            }
            else if (n2 > 126) {
                n2 = 126;
            }
            return (n & 0xFF80) + n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ig.aw(" + ')');
        }
    }
    
    static void method1210(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20, final int n21, final int n22, final byte b) {
        try {
            Rasterizer3D.field1999.vmethod1362(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ig.am(" + ')');
        }
    }
    
    public Model km() {
        final Renderable ap = this.ap();
        if (ap == null) {
            return null;
        }
        if (ap instanceof Model) {
            return (Model)ap;
        }
        return ap.tb();
    }
    
    public void ac(final int n) {
        this.x = n * 1534197103;
    }
    
    public void hm(final long n) {
        this.tag = n * -4945803534983804595L;
    }
    
    public void mo(final int n) {
        this.flags = n * 1624352991;
    }
    
    public int getConfig() {
        return this.flags * -1486089441;
    }
    
    public Renderable ap() {
        return this.renderable;
    }
    
    public void ag(final int n) {
        this.z = n * -317230161;
    }
    
    public int getX() {
        return this.x * 487195023;
    }
    
    public int getY() {
        return this.y * -1480835961;
    }
    
    static void performPlayerAnimation(final Player actor, final int n, final int n2, final int n3) {
        try {
            if (-1372355773 * actor.cs == n && n != -1) {
                if (n3 >= 145957899) {
                    throw new IllegalStateException();
                }
                final int n4 = ItemContainer.SpotAnimationDefinition_get(n, (byte)124).replyMode * 789159225;
                if (n4 != 0) {
                    if (n3 >= 145957899) {
                        return;
                    }
                    actor.dw = 0;
                    actor.dn = 0;
                    actor.bd = n2 * -401806131;
                    actor.bo = 0;
                }
                if (2 == n4) {
                    if (n3 >= 145957899) {
                        throw new IllegalStateException();
                    }
                    actor.bo = 0;
                }
            }
            else {
                if (-1 != n) {
                    if (n3 >= 145957899) {
                        throw new IllegalStateException();
                    }
                    if (actor.cs * -1372355773 != -1) {
                        if (n3 >= 145957899) {
                            throw new IllegalStateException();
                        }
                        if (ItemContainer.SpotAnimationDefinition_get(n, (byte)20).forcedPriority * -1932560049 < ItemContainer.SpotAnimationDefinition_get(-1372355773 * actor.cs, (byte)54).forcedPriority * -1932560049) {
                            return;
                        }
                        if (n3 >= 145957899) {
                            return;
                        }
                    }
                }
                actor.cs = n * -1690721941;
                Label_0299: {
                    if (actor instanceof NPC) {
                        switch (((NPC)actor).getId()) {
                            case 8615:
                            case 8616:
                            case 8617:
                            case 8618:
                            case 8619:
                            case 8620:
                            case 8621:
                            case 8622: {
                                break Label_0299;
                            }
                        }
                    }
                    final AnimationChanged animationChanged = new AnimationChanged();
                    animationChanged.setActor((Actor)actor);
                    ScriptFrame.client.getCallbacks().post((Object)animationChanged);
                }
                actor.dw = 0;
                actor.dn = 0;
                actor.bd = n2 * -401806131;
                actor.bo = 0;
                actor.dk = actor.cb * -1718989897;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ig.iq(" + ')');
        }
    }
    
    public long getHash() {
        return this.tag * 3423223696102332293L;
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
        return this.dv;
    }
    
    public Point getCanvasTextLocation(final Graphics2D graphics2D, final String s, final int n) {
        return Perspective.getCanvasTextLocation((Client)ScriptFrame.client, graphics2D, this.getLocalLocation(), s, n);
    }
    
    public Shape getConvexHull() {
        final Model km = this.km();
        if (km == null) {
            return null;
        }
        return km.no(this.getX(), this.getY(), 0, this.getZ());
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
        return Perspective.getClickbox((Client)ScriptFrame.client, (net.runelite.api.Model)this.km(), 0, this.getX(), this.getY(), this.getZ());
    }
    
    public Point getMinimapLocation() {
        return Perspective.localToMinimap((Client)ScriptFrame.client, this.getLocalLocation());
    }
    
    public Point getCanvasLocation() {
        return this.getCanvasLocation(0);
    }
    
    public Point getCanvasLocation(final int n) {
        return Perspective.localToCanvas((Client)ScriptFrame.client, this.getLocalLocation(), this.getPlane(), n);
    }
    
    public int getZ() {
        return this.z * 1777058639;
    }
    
    public static int jl(final ClanChannel clanChannel) {
        return clanChannel.members.size();
    }
    
    public void jy(final int n) {
        this.y = n * 1341114679;
    }
}
