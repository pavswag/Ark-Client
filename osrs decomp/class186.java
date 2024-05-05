import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;

// 
// Decompiled by Procyon v0.5.36
// 

public class class186
{
    static final int at = 9;
    static short[][][] Tiles_underlays;
    public static final int bb = 512;
    static final int an = 256;
    
    class186() throws Throwable {
        throw new Error();
    }
    
    static final IterableNodeHashTable aw(final Buffer buffer, IterableNodeHashTable iterableNodeHashTable) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (null == iterableNodeHashTable) {
            iterableNodeHashTable = new IterableNodeHashTable(class70.method442(ra, 150018764));
        }
        for (int i = 0; i < ra; ++i) {
            final boolean b = Buffer.ra(buffer, (byte)7) == 1;
            final int medium = buffer.readMedium(3617640);
            Node node;
            if (b) {
                node = new ObjectNode(buffer.readStringCp1252NullTerminated((byte)0));
            }
            else {
                node = new IntegerNode(buffer.readInt(-1988802768));
            }
            iterableNodeHashTable.put(node, medium);
        }
        return iterableNodeHashTable;
    }
    
    static final IterableNodeHashTable ac(final Buffer buffer, IterableNodeHashTable iterableNodeHashTable) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (null == iterableNodeHashTable) {
            iterableNodeHashTable = new IterableNodeHashTable(class70.method442(ra, 627126698));
        }
        for (int i = 0; i < ra; ++i) {
            final boolean b = Buffer.ra(buffer, (byte)7) == 1;
            final int medium = buffer.readMedium(-675188196);
            Node node;
            if (b) {
                node = new ObjectNode(buffer.readStringCp1252NullTerminated((byte)0));
            }
            else {
                node = new IntegerNode(buffer.readInt(-1351942262));
            }
            iterableNodeHashTable.put(node, medium);
        }
        return iterableNodeHashTable;
    }
    
    static String au(final IterableNodeHashTable iterableNodeHashTable, final int n, final String s) {
        if (null == iterableNodeHashTable) {
            return s;
        }
        final ObjectNode objectNode = (ObjectNode)iterableNodeHashTable.aa(n);
        if (objectNode == null) {
            return s;
        }
        return (String)objectNode.obj;
    }
    
    public static AbstractSocket method1008(final Socket socket, final int n, final int n2, final int n3) throws IOException {
        try {
            return new BufferedNetSocket(socket, n, n2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hu.af(" + ')');
        }
    }
    
    static String ab(final IterableNodeHashTable iterableNodeHashTable, final int n, final String s) {
        if (null == iterableNodeHashTable) {
            return s;
        }
        final ObjectNode objectNode = (ObjectNode)iterableNodeHashTable.aa(n);
        if (objectNode == null) {
            return s;
        }
        return (String)objectNode.obj;
    }
    
    static String aq(final IterableNodeHashTable iterableNodeHashTable, final int n, final String s) {
        if (null == iterableNodeHashTable) {
            return s;
        }
        final ObjectNode objectNode = (ObjectNode)iterableNodeHashTable.aa(n);
        if (objectNode == null) {
            return s;
        }
        return (String)objectNode.obj;
    }
    
    public static void yd(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; i >= 0; --i) {
            for (int j = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; j >= 0; --j) {
                if (j <= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[2][0] = array;
        final byte[] array2 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n2 = 0;
        for (int k = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; k >= 0; --k) {
            for (int l = 0; l < -28927295 * worldMapScaleHandler.pixelsPerTile; ++l) {
                if (l >= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[2][1] = array2;
        final byte[] array3 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n3 = 0;
        for (int n4 = 0; n4 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n4) {
            for (int n5 = 0; n5 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n5) {
                if (n5 <= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[2][2] = array3;
        final byte[] array4 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n7) {
            for (int n8 = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[2][3] = array4;
    }
    
    static final boolean method1009(final int n, final int n2, final int n3, final int n4, final int n5, final byte b) {
        try {
            PendingSpawn pendingSpawn = null;
            for (PendingSpawn pendingSpawn2 = (PendingSpawn)Client.pendingSpawns.last(); pendingSpawn2 != null; pendingSpawn2 = (PendingSpawn)Client.pendingSpawns.previous()) {
                if (b <= 3) {
                    throw new IllegalStateException();
                }
                if (n == 593068225 * pendingSpawn2.plane) {
                    if (b <= 3) {
                        throw new IllegalStateException();
                    }
                    if (n2 == 68300005 * pendingSpawn2.x) {
                        if (b <= 3) {
                            throw new IllegalStateException();
                        }
                        if (n3 == 800888185 * pendingSpawn2.y) {
                            if (b <= 3) {
                                throw new IllegalStateException();
                            }
                            if (pendingSpawn2.type * -1586499579 == n4) {
                                if (b <= 3) {
                                    throw new IllegalStateException();
                                }
                                pendingSpawn = pendingSpawn2;
                                break;
                            }
                        }
                    }
                }
            }
            if (pendingSpawn != null) {
                pendingSpawn.field931 = n5 * -620279391;
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hu.ju(" + ')');
        }
    }
    
    public static void uw(final Canvas canvas, final Graphics g) {
        canvas.component.paint(g);
    }
}
