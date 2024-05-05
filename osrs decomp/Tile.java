import net.runelite.api.CollisionData;
import net.runelite.api.coords.LocalPoint;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.GroundObject;
import net.runelite.api.Point;
import net.runelite.api.WallObject;
import net.runelite.api.DecorativeObject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import java.io.IOException;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.GameState;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Tile extends Node implements net.runelite.api.Tile
{
    public static NodeDeque[][][] ys;
    BoundaryObject boundaryObject;
    int field1969;
    int y;
    int originalPlane;
    boolean drawPrimary;
    SceneTileModel model;
    boolean drawGameObjects;
    WallDecoration wallDecoration;
    FloorDecoration floorDecoration;
    int plane;
    int gameObjectsCount;
    GameObject[] gameObjects;
    int[] gameObjectEdgeMasks;
    int gameObjectsEdgeMask;
    int minPlane;
    int drawGameObjectEdges;
    int x;
    boolean drawSecondary;
    SceneTilePaint paint;
    int field1987;
    ItemLayer itemLayer;
    int field1989;
    Tile linkedBelowTile;
    
    Tile(final int n, final int n2, final int n3) {
        this.gameObjects = new GameObject[5];
        this.gameObjectEdgeMasks = new int[5];
        this.gameObjectsEdgeMask = 0;
        final int plane = -1846949283 * n;
        this.plane = plane;
        this.originalPlane = plane * 1251513827;
        this.x = n2 * 960127795;
        this.y = n3 * 210148197;
    }
    
    static {
        Tile.ys = new NodeDeque[4][104][104];
    }
    
    public int[] ad() {
        return this.gameObjectEdgeMasks;
    }
    
    public boolean mn() {
        return this.drawPrimary;
    }
    
    public void sc(final BoundaryObject boundaryObject) {
        this.boundaryObject = boundaryObject;
    }
    
    public boolean cf() {
        return this.drawSecondary;
    }
    
    public void pt(final int n) {
        final int up = this.up();
        final int ei = this.ei();
        final int plane = ScriptFrame.client.getPlane();
        final NodeDeque[][][] gk = ScriptFrame.client.gk();
        final NodeDeque nodeDeque = Tile.ys[plane][up][ei];
        final NodeDeque nodeDeque2 = gk[plane][up][ei];
        if (ScriptFrame.client.getGameState() != GameState.LOGGED_IN) {
            Tile.ys[plane][up][ei] = nodeDeque2;
            ScriptFrame.client.zd(null);
            return;
        }
        if (nodeDeque != nodeDeque2) {
            if (nodeDeque != null) {
                for (Node jp = nodeDeque.jp(), node = jp.pt(); node != jp; node = node.pt()) {
                    ScriptFrame.client.getCallbacks().post((Object)new ItemDespawned((net.runelite.api.Tile)this, (net.runelite.api.TileItem)node));
                }
            }
            Tile.ys[plane][up][ei] = nodeDeque2;
        }
        final TileItem ka = ScriptFrame.client.ka();
        if (ka != null) {
            ScriptFrame.client.zd(null);
        }
        if (this.zc() == null) {
            if (ka != null) {
                ScriptFrame.client.getCallbacks().post((Object)new ItemDespawned((net.runelite.api.Tile)this, (net.runelite.api.TileItem)ka));
            }
            return;
        }
        final NodeDeque nodeDeque3 = nodeDeque2;
        if (nodeDeque3 == null) {
            if (ka != null) {
                ScriptFrame.client.getCallbacks().post((Object)new ItemDespawned((net.runelite.api.Tile)this, (net.runelite.api.TileItem)ka));
            }
            return;
        }
        final Node jp2 = nodeDeque3.jp();
        TileItem tileItem = null;
        final Node og = jp2.og();
        if (jp2 != og) {
            final TileItem tileItem2 = (TileItem)og;
            if (up != tileItem2.yx() || ei != tileItem2.dw()) {
                tileItem = tileItem2;
            }
        }
        final Node pt = jp2.pt();
        if (tileItem == null && jp2 != pt) {
            final TileItem tileItem3 = (TileItem)pt;
            if (up != tileItem3.yx() || ei != tileItem3.dw()) {
                tileItem = tileItem3;
            }
        }
        if (ka != null && ka != og && ka != pt) {
            ScriptFrame.client.getCallbacks().post((Object)new ItemDespawned((net.runelite.api.Tile)this, (net.runelite.api.TileItem)ka));
        }
        if (tileItem == null) {
            return;
        }
        final TileItem tileItem4 = tileItem;
        tileItem4.of(up);
        tileItem4.mi(ei);
        ScriptFrame.client.getCallbacks().post((Object)new ItemSpawned((net.runelite.api.Tile)this, (net.runelite.api.TileItem)tileItem4));
    }
    
    public void lc(final boolean drawGameObjects) {
        this.drawGameObjects = drawGameObjects;
    }
    
    public void eq(final WallDecoration wallDecoration) {
        this.wallDecoration = wallDecoration;
    }
    
    public SceneTilePaint li() {
        return this.paint;
    }
    
    public int rl() {
        return this.minPlane * 65855117;
    }
    
    public static boolean bo(final ParamComposition paramComposition) {
        return paramComposition.type == 's';
    }
    
    public BoundaryObject ix() {
        return this.boundaryObject;
    }
    
    public int up() {
        return this.x * -464760837;
    }
    
    public void rt(final int n) {
        this.drawGameObjectEdges = n * -291710857;
    }
    
    public void xn(final int n) {
        this.gameObjectsEdgeMask = n * -1238612193;
    }
    
    public SceneTileModel bc() {
        return this.model;
    }
    
    public int ei() {
        return this.y * -1812849043;
    }
    
    public void ac(final int n) {
        this.gameObjectsCount = n * 1425915941;
    }
    
    public ItemLayer zc() {
        return this.itemLayer;
    }
    
    public WallDecoration ro() {
        return this.wallDecoration;
    }
    
    public void he(final boolean drawSecondary) {
        this.drawSecondary = drawSecondary;
    }
    
    public Tile pi() {
        return this.linkedBelowTile;
    }
    
    public int js() {
        return this.gameObjectsEdgeMask * -1639156513;
    }
    
    public FloorDecoration hp() {
        return this.floorDecoration;
    }
    
    public GameObject[] ys() {
        return this.gameObjects;
    }
    
    public static boolean method1214(final byte b) {
        try {
            final long clockNow = class96.clockNow(153542825);
            int n = (int)(clockNow - -2114584129517998633L * NetCache.field3509);
            NetCache.field3509 = -6047020038529116697L * clockNow;
            if (n > 200) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                n = 200;
            }
            NetCache.NetCache_loadTime += n * -425972525;
            if (NetCache.NetCache_pendingResponsesCount * -1651605431 == 0 && 0 == NetCache.NetCache_pendingPriorityResponsesCount * -1952694793) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                if (0 == -32010957 * NetCache.NetCache_pendingWritesCount) {
                    if (b == 1) {
                        throw new IllegalStateException();
                    }
                    if (0 == NetCache.NetCache_pendingPriorityWritesCount * -1171541559) {
                        if (b == 1) {
                            throw new IllegalStateException();
                        }
                        return true;
                    }
                }
            }
            if (NetCache.NetCache_socket == null) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                try {
                    if (NetCache.NetCache_loadTime * -942339237 > 30000) {
                        throw new IOException();
                    }
                    while (-1952694793 * NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount * -1171541559 > 0) {
                        if (b == 1) {
                            throw new IllegalStateException();
                        }
                        final NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                        final Buffer buffer = new Buffer(4);
                        buffer.writeShort(1, (byte)86);
                        Buffer.gi(buffer, (int)netFileRequest.hr, 1913109811);
                        NetCache.NetCache_socket.write(buffer.array, 0, 4, -2115422184);
                        NetCache.NetCache_pendingPriorityResponses.put(netFileRequest, netFileRequest.hr);
                        NetCache.NetCache_pendingPriorityWritesCount += 1320339335;
                        NetCache.NetCache_pendingPriorityResponsesCount -= 1677618233;
                    }
                    while (NetCache.NetCache_pendingResponsesCount * -1651605431 < 200 && NetCache.NetCache_pendingWritesCount * -32010957 > 0) {
                        if (b == 1) {
                            throw new IllegalStateException();
                        }
                        final NetFileRequest netFileRequest2 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
                        final Buffer buffer2 = new Buffer(4);
                        buffer2.writeShort(0, (byte)127);
                        Buffer.gi(buffer2, (int)netFileRequest2.hr, 1135612474);
                        NetCache.NetCache_socket.write(buffer2.array, 0, 4, -2115422184);
                        GrandExchangeOfferWorldComparator.os(netFileRequest2);
                        NetCache.NetCache_pendingResponses.put(netFileRequest2, netFileRequest2.hr);
                        NetCache.NetCache_pendingWritesCount += 2069940741;
                        NetCache.NetCache_pendingResponsesCount -= 979537415;
                    }
                    for (int i = 0; i < 100; ++i) {
                        if (b == 1) {
                            throw new IllegalStateException();
                        }
                        final int available = NetCache.NetCache_socket.available(-669086178);
                        if (available < 0) {
                            throw new IOException();
                        }
                        if (available == 0) {
                            break;
                        }
                        NetCache.NetCache_loadTime = 0;
                        int n2 = 0;
                        if (Script.NetCache_currentResponse == null) {
                            if (b == 1) {
                                throw new IllegalStateException();
                            }
                            n2 = 8;
                        }
                        else if (0 == NetCache.field3504 * -1961769541) {
                            if (b == 1) {
                                throw new IllegalStateException();
                            }
                            n2 = 1;
                        }
                        if (n2 > 0) {
                            if (b == 1) {
                                throw new IllegalStateException();
                            }
                            int n3 = n2 - NetCache.NetCache_responseHeaderBuffer.offset * -1633313603;
                            if (n3 > available) {
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                n3 = available;
                            }
                            NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, -1633313603 * NetCache.NetCache_responseHeaderBuffer.offset, n3, -2106093590);
                            if (0 != NetCache.field3506) {
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                for (int j = 0; j < n3; ++j) {
                                    if (b == 1) {
                                        throw new IllegalStateException();
                                    }
                                    final byte[] array = NetCache.NetCache_responseHeaderBuffer.array;
                                    final int n4 = -1633313603 * NetCache.NetCache_responseHeaderBuffer.offset + j;
                                    array[n4] ^= NetCache.field3506;
                                }
                            }
                            final Buffer netCache_responseHeaderBuffer = NetCache.NetCache_responseHeaderBuffer;
                            netCache_responseHeaderBuffer.offset += n3 * -1516355947;
                            if (-1633313603 * NetCache.NetCache_responseHeaderBuffer.offset < n2) {
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                break;
                            }
                            else if (null == Script.NetCache_currentResponse) {
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                NetCache.NetCache_responseHeaderBuffer.offset = 0;
                                final int ra = Buffer.ra(NetCache.NetCache_responseHeaderBuffer, (byte)7);
                                final int unsignedShort = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(187645414);
                                final int ra2 = Buffer.ra(NetCache.NetCache_responseHeaderBuffer, (byte)7);
                                final int int1 = NetCache.NetCache_responseHeaderBuffer.readInt(-1966667077);
                                final long n5 = (ra << 16) + unsignedShort;
                                NetFileRequest netCache_currentResponse = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.at(n5);
                                NetCache.field3498 = true;
                                if (netCache_currentResponse == null) {
                                    netCache_currentResponse = (NetFileRequest)NetCache.NetCache_pendingResponses.at(n5);
                                    NetCache.field3498 = false;
                                }
                                if (null == netCache_currentResponse) {
                                    if (b == 1) {
                                        throw new IllegalStateException();
                                    }
                                    throw new IOException();
                                }
                                else {
                                    int n6;
                                    if (ra2 == 0) {
                                        if (b == 1) {
                                            throw new IllegalStateException();
                                        }
                                        n6 = 5;
                                    }
                                    else {
                                        n6 = 9;
                                    }
                                    final int n7 = n6;
                                    Script.NetCache_currentResponse = netCache_currentResponse;
                                    (NetCache.NetCache_responseArchiveBuffer = new Buffer(n7 + int1 + Script.NetCache_currentResponse.padding)).writeShort(ra2, (byte)58);
                                    NetCache.NetCache_responseArchiveBuffer.writeInt(int1, -2081835031);
                                    NetCache.field3504 = -598099048;
                                    NetCache.NetCache_responseHeaderBuffer.offset = 0;
                                }
                            }
                            else if (NetCache.field3504 * -1961769541 == 0) {
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                if (-1 == NetCache.NetCache_responseHeaderBuffer.array[0]) {
                                    NetCache.field3504 = -74762381;
                                    NetCache.NetCache_responseHeaderBuffer.offset = 0;
                                }
                                else {
                                    Script.NetCache_currentResponse = null;
                                }
                            }
                        }
                        else {
                            final int len = NetCache.NetCache_responseArchiveBuffer.array.length - Script.NetCache_currentResponse.padding;
                            int n8 = 512 - NetCache.field3504 * -1961769541;
                            if (n8 > len - NetCache.NetCache_responseArchiveBuffer.offset * -1633313603) {
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                n8 = len - NetCache.NetCache_responseArchiveBuffer.offset * -1633313603;
                            }
                            if (n8 > available) {
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                n8 = available;
                            }
                            NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset * -1633313603, n8, -2106093590);
                            if (0 != NetCache.field3506) {
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                for (int k = 0; k < n8; ++k) {
                                    if (b == 1) {
                                        throw new IllegalStateException();
                                    }
                                    final byte[] array2 = NetCache.NetCache_responseArchiveBuffer.array;
                                    final int n9 = k + -1633313603 * NetCache.NetCache_responseArchiveBuffer.offset;
                                    array2[n9] ^= NetCache.field3506;
                                }
                            }
                            final Buffer netCache_responseArchiveBuffer = NetCache.NetCache_responseArchiveBuffer;
                            netCache_responseArchiveBuffer.offset += n8 * -1516355947;
                            NetCache.field3504 += -74762381 * n8;
                            if (len == NetCache.NetCache_responseArchiveBuffer.offset * -1633313603) {
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                if (Script.NetCache_currentResponse.hr == 16711935L) {
                                    Login.field764 = NetCache.NetCache_responseArchiveBuffer;
                                    for (int l = 0; l < 256; ++l) {
                                        if (b == 1) {
                                            throw new IllegalStateException();
                                        }
                                        final Archive archive = NetCache.NetCache_archives[l];
                                        if (archive != null) {
                                            Login.field764.offset = l * 754054312 + 1008154857;
                                            if (-1633313603 * Login.field764.offset >= Login.field764.array.length) {
                                                if (b == 1) {
                                                    throw new IllegalStateException();
                                                }
                                                if (!archive.field3465) {
                                                    throw new RuntimeException("");
                                                }
                                                if (b == 1) {
                                                    throw new IllegalStateException();
                                                }
                                                archive.method1872((byte)(-59));
                                            }
                                            else {
                                                archive.loadIndex(Login.field764.readInt(-1554555000), Login.field764.readInt(-1392290912), -691028);
                                            }
                                        }
                                    }
                                }
                                else {
                                    NetCache.NetCache_crc.reset();
                                    NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, len);
                                    if ((int)NetCache.NetCache_crc.getValue() != Script.NetCache_currentResponse.crc * -75260527) {
                                        if (b == 1) {
                                            throw new IllegalStateException();
                                        }
                                        try {
                                            NetCache.NetCache_socket.close(-538193159);
                                        }
                                        catch (Exception ex2) {}
                                        NetCache.NetCache_crcMismatches += 372675253;
                                        NetCache.NetCache_socket = null;
                                        NetCache.field3506 = (byte)(Math.random() * 255.0 + 1.0);
                                        return false;
                                    }
                                    else {
                                        NetCache.NetCache_crcMismatches = 0;
                                        NetCache.NetCache_ioExceptions = 0;
                                        final Archive archive2 = Script.NetCache_currentResponse.archive;
                                        final int n10 = (int)(Script.NetCache_currentResponse.hr & 0xFFFFL);
                                        final byte[] array3 = NetCache.NetCache_responseArchiveBuffer.array;
                                        boolean b2;
                                        if (0xFF0000L == (Script.NetCache_currentResponse.hr & 0xFF0000L)) {
                                            if (b == 1) {
                                                throw new IllegalStateException();
                                            }
                                            b2 = true;
                                        }
                                        else {
                                            b2 = false;
                                        }
                                        Archive.wy(archive2, n10, array3, b2, NetCache.field3498, 681088359);
                                    }
                                }
                                Script.NetCache_currentResponse.hw();
                                if (NetCache.field3498) {
                                    if (b == 1) {
                                        throw new IllegalStateException();
                                    }
                                    NetCache.NetCache_pendingPriorityResponsesCount += 1677618233;
                                }
                                else {
                                    NetCache.NetCache_pendingResponsesCount += 979537415;
                                }
                                NetCache.field3504 = 0;
                                Script.NetCache_currentResponse = null;
                                NetCache.NetCache_responseArchiveBuffer = null;
                            }
                            else {
                                if (-1961769541 * NetCache.field3504 != 512) {
                                    break;
                                }
                                if (b == 1) {
                                    throw new IllegalStateException();
                                }
                                NetCache.field3504 = 0;
                            }
                        }
                    }
                    return true;
                }
                catch (IOException ex3) {
                    try {
                        NetCache.NetCache_socket.close(-923421367);
                    }
                    catch (Exception ex4) {}
                    NetCache.NetCache_ioExceptions -= 161323731;
                    NetCache.NetCache_socket = null;
                    return false;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "is.af(" + ')');
        }
    }
    
    public WorldPoint getWorldLocation() {
        return WorldPoint.fromScene((Client)ScriptFrame.client, this.up(), this.ei(), this.getPlane());
    }
    
    public int getPlane() {
        return this.plane * 1527994869;
    }
    
    public Point getSceneLocation() {
        return new Point(this.up(), this.ei());
    }
    
    public void setGroundObject(final GroundObject groundObject) {
        this.floorDecoration = (FloorDecoration)groundObject;
    }
    
    public List getGroundItems() {
        final ItemLayer zc = this.zc();
        if (zc == null) {
            return null;
        }
        final ArrayList<TileItem> list = new ArrayList<TileItem>();
        for (Object o = ((net.runelite.api.ItemLayer)zc).getBottom(); o instanceof TileItem; o = ((net.runelite.api.Node)o).getNext()) {
            list.add((TileItem)o);
        }
        return list;
    }
    
    public int getRenderLevel() {
        return this.originalPlane * 1520539719;
    }
    
    public boolean hasLineOfSightTo(final net.runelite.api.Tile tile) {
        if (this.getPlane() != tile.getPlane()) {
            return false;
        }
        final CollisionMap[] method394 = ScriptFrame.client.method394();
        if (method394 == null) {
            return false;
        }
        final int[][] flags = ((CollisionData)method394[this.getPlane()]).getFlags();
        final Point sceneLocation = this.getSceneLocation();
        final Point sceneLocation2 = tile.getSceneLocation();
        if (sceneLocation.getX() == sceneLocation2.getX() && sceneLocation.getY() == sceneLocation2.getY()) {
            return true;
        }
        final int a = sceneLocation2.getX() - sceneLocation.getX();
        final int a2 = sceneLocation2.getY() - sceneLocation.getY();
        final int abs = Math.abs(a);
        final int abs2 = Math.abs(a2);
        final int n = 131072;
        final int n2 = 131072;
        int n3;
        if (a < 0) {
            n3 = (n | 0x1000);
        }
        else {
            n3 = (n | 0x10000);
        }
        int n4;
        if (a2 < 0) {
            n4 = (n2 | 0x400);
        }
        else {
            n4 = (n2 | 0x4000);
        }
        if (abs > abs2) {
            int i = sceneLocation.getX();
            final int n5 = sceneLocation.getY() << 16;
            final int n6 = (a2 << 16) / abs;
            int n7 = n5 + 32768;
            if (a2 < 0) {
                --n7;
            }
            final int n8 = (a < 0) ? -1 : 1;
            while (i != sceneLocation2.getX()) {
                i += n8;
                final int n9 = n7 >>> 16;
                if ((flags[i][n9] & n3) != 0x0) {
                    return false;
                }
                n7 += n6;
                final int n10 = n7 >>> 16;
                if (n10 != n9 && (flags[i][n10] & n4) != 0x0) {
                    return false;
                }
            }
        }
        else {
            int j = sceneLocation.getY();
            final int n11 = sceneLocation.getX() << 16;
            final int n12 = (a << 16) / abs2;
            int n13 = n11 + 32768;
            if (a < 0) {
                --n13;
            }
            final int n14 = (a2 < 0) ? -1 : 1;
            while (j != sceneLocation2.getY()) {
                j += n14;
                final int n15 = n13 >>> 16;
                if ((flags[n15][j] & n4) != 0x0) {
                    return false;
                }
                n13 += n12;
                final int n16 = n13 >>> 16;
                if (n16 != n15 && (flags[n16][j] & n3) != 0x0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public LocalPoint getLocalLocation() {
        return LocalPoint.fromScene(this.up(), this.ei());
    }
    
    public int ij() {
        return this.gameObjectsCount * -422028371;
    }
    
    public void yz(final boolean drawPrimary) {
        this.drawPrimary = drawPrimary;
    }
}
