import net.runelite.api.Model;
import java.awt.geom.Area;
import java.awt.Shape;
import java.awt.Polygon;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import java.awt.Graphics2D;
import net.runelite.api.coords.WorldPoint;
import java.util.ArrayList;
import net.runelite.api.TileObject;

// 
// Decompiled by Procyon v0.5.36
// 

public final class ItemLayer implements TileObject, net.runelite.api.ItemLayer
{
    int x;
    int z;
    public int ri;
    int y;
    Renderable first;
    Renderable second;
    Renderable third;
    long tag;
    int height;
    static final int rc = 1;
    
    ItemLayer() {
    }
    
    public Renderable fp() {
        return this.second;
    }
    
    public int getId() {
        return (int)(this.getHash() >>> 17 & 0xFFFFFFFFL);
    }
    
    public void pr(final int ri) {
        this.ri = ri;
    }
    
    public Renderable em() {
        return this.first;
    }
    
    public Renderable nn() {
        return this.third;
    }
    
    public static ArrayList gk(final class166 class166) {
        return class166.field1423;
    }
    
    public static boolean method1182(final int n, final int n2) {
        try {
            if (n < WorldMapDecorationType.field3064.id * -1344801027) {
                return false;
            }
            if (n2 >= -2084847753) {
                throw new IllegalStateException();
            }
            if (n > WorldMapDecorationType.field3065.id * -1344801027) {
                return false;
            }
            if (n2 >= -2084847753) {
                throw new IllegalStateException();
            }
            return true;
            b = false;
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "iy.au(" + ')');
        }
    }
    
    static final void method1181(final boolean b, final PacketBuffer packetBuffer, final int n) {
        try {
            while (true) {
                final int n2 = 16;
                final int n3 = 1 << n2;
                if (packetBuffer.readBits(889658999 * Client.packetWriter.serverPacketLength, 1751384746) < 12 + n2) {
                    if (n == 1308778639) {
                        throw new IllegalStateException();
                    }
                    break;
                }
                else {
                    final int bitsRemaining = packetBuffer.bitsRemaining(n2, -608529648);
                    if (n3 - 1 == bitsRemaining) {
                        break;
                    }
                    int n4 = 0;
                    if (null == Client.npcs[bitsRemaining]) {
                        if (n == 1308778639) {
                            throw new IllegalStateException();
                        }
                        Client.npcs[bitsRemaining] = new NPC();
                        Client.method369(bitsRemaining);
                        n4 = 1;
                    }
                    final NPC npc = Client.npcs[bitsRemaining];
                    Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = bitsRemaining;
                    npc.de = Client.cycle * -1014023335;
                    int n5;
                    if (b) {
                        if (n == 1308778639) {
                            throw new IllegalStateException();
                        }
                        n5 = packetBuffer.bitsRemaining(8, -2068665558);
                        if (n5 > 127) {
                            if (n == 1308778639) {
                                throw new IllegalStateException();
                            }
                            n5 -= 256;
                        }
                    }
                    else {
                        n5 = packetBuffer.bitsRemaining(5, -525988797);
                        if (n5 > 15) {
                            if (n == 1308778639) {
                                throw new IllegalStateException();
                            }
                            n5 -= 32;
                        }
                    }
                    if (packetBuffer.bitsRemaining(1, -1128801419) == 1) {
                        if (n == 1308778639) {
                            throw new IllegalStateException();
                        }
                        packetBuffer.bitsRemaining(32, -1208673230);
                    }
                    if (1 == packetBuffer.bitsRemaining(1, -234990129)) {
                        Client.field417[(Client.field416 += 1487412345) * 606834121 - 1] = bitsRemaining;
                    }
                    final int bitsRemaining2 = packetBuffer.bitsRemaining(1, -1288246620);
                    final NPC npc2 = npc;
                    final NPCComposition npcDefinition = AbstractArchive.getNpcDefinition(packetBuffer.bitsRemaining(14, -41054214), (byte)15);
                    npc.pv(npcDefinition);
                    npc2.definition = npcDefinition;
                    int n6;
                    if (b) {
                        if (n == 1308778639) {
                            return;
                        }
                        n6 = packetBuffer.bitsRemaining(8, -589613457);
                        if (n6 > 127) {
                            if (n == 1308778639) {
                                throw new IllegalStateException();
                            }
                            n6 -= 256;
                        }
                    }
                    else {
                        n6 = packetBuffer.bitsRemaining(5, -836060017);
                        if (n6 > 15) {
                            if (n == 1308778639) {
                                return;
                            }
                            n6 -= 32;
                        }
                    }
                    final int n7 = Client.field561[packetBuffer.bitsRemaining(3, -1154668937)];
                    if (n4 != 0) {
                        if (n == 1308778639) {
                            return;
                        }
                        final NPC npc3 = npc;
                        final NPC npc4 = npc;
                        final int dx = -1228309915 * n7;
                        npc4.dx = dx;
                        npc3.bj = dx * 720096107;
                    }
                    class142.method811(npc, (byte)77);
                    if (npc.cv * 351748387 == 0) {
                        if (n == 1308778639) {
                            throw new IllegalStateException();
                        }
                        npc.dx = 0;
                    }
                    final NPC npc5 = npc;
                    final int n8 = n6 + MusicPatchNode.localPlayer.cf[0];
                    final int n9 = n5 + MusicPatchNode.localPlayer.dy[0];
                    boolean b2;
                    if (bitsRemaining2 != 0) {
                        if (n == 1308778639) {
                            throw new IllegalStateException();
                        }
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    npc5.method594(n8, n9, b2, -208577848);
                }
            }
            packetBuffer.exportIndex((byte)(-17));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "iy.ka(" + ')');
        }
    }
    
    public int getX() {
        return this.x * -1473635399;
    }
    
    public int getY() {
        return this.y * -1839139071;
    }
    
    public int getHeight() {
        return this.height * -1118938495;
    }
    
    public long getHash() {
        return this.tag * -8562400470617197071L;
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
        return this.ri;
    }
    
    public Point getCanvasTextLocation(final Graphics2D graphics2D, final String s, final int n) {
        return Perspective.getCanvasTextLocation((net.runelite.api.Client)ScriptFrame.client, graphics2D, this.getLocalLocation(), s, n);
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
        final Area area = new Area();
        for (final Renderable renderable : new Renderable[] { this.nn(), this.fp(), this.em() }) {
            if (renderable != null) {
                final Model tb = renderable.tb();
                if (tb != null) {
                    final Shape clickbox = Perspective.getClickbox((net.runelite.api.Client)ScriptFrame.client, (Model)tb, 0, this.getX(), this.getY(), this.getZ() - this.getHeight());
                    if (clickbox != null) {
                        area.add(new Area(clickbox));
                    }
                }
            }
        }
        return area;
    }
    
    public Point getMinimapLocation() {
        return Perspective.localToMinimap((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation());
    }
    
    public Point getCanvasLocation(final int n) {
        return Perspective.localToCanvas((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation(), this.getPlane(), n);
    }
    
    public Point getCanvasLocation() {
        return this.getCanvasLocation(0);
    }
    
    public int getZ() {
        return this.z * 2064997173;
    }
}
