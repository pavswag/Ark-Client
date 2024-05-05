import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.DecorativeObjectDespawned;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.GroundObject;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.Perspective;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.api.DecorativeObject;
import net.runelite.api.events.DecorativeObjectSpawned;
import net.runelite.api.WallObject;
import net.runelite.api.events.WallObjectDespawned;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class Scene implements net.runelite.api.Scene
{
    static int Scene_selectedPlane;
    public static final int cn = 9;
    int xSize;
    int ySize;
    int[][][] tileHeights;
    Tile[][][] tiles;
    public static final /* synthetic */ boolean fd;
    public static int eb;
    public byte[][][] sh;
    int tempGameObjectsCount;
    public static boolean Scene_isLowDetail;
    GameObject[] tempGameObjects;
    int[][][] field2020;
    static final int ax = 25;
    static final int ao = 64;
    static final int[] field2021;
    public int iq;
    public int zc;
    public short[][][] cb;
    static Occluder[] Scene_currentOccluders;
    int minPlane;
    static int Scene_plane;
    static int Scene_drawnCount;
    static int Scene_cameraXTileMin;
    static int Scene_cameraXTileMax;
    static int Scene_cameraYTileMin;
    static int Scene_cameraYTileMax;
    static int Scene_cameraXTile;
    static int Scene_cameraYTile;
    static final int[] field2032;
    static final int[] field2033;
    static int Scene_cameraZ;
    static final int ay = 128;
    static int Scene_cameraY;
    static int Scene_cameraYawSine;
    static int Scene_cameraYawCosine;
    public Set sw;
    public byte[][][] wb;
    static GameObject[] gameObjects;
    public static final int cs = 383;
    int[][] tileShape2D;
    static int Scene_selectedScreenX;
    static int Scene_selectedScreenY;
    public static int Scene_selectedX;
    public static int Scene_selectedY;
    static boolean viewportWalking;
    static final int bn = 32;
    static final int[] field2045;
    static int Scene_planesCount;
    static int[] Scene_planeOccluderCounts;
    public short[][][] wf;
    public boolean kp;
    static Occluder[][] Scene_planeOccluders;
    static boolean checkClick;
    public static int og;
    static int Scene_cameraPitchCosine;
    static NodeDeque Scene_tilesDeque;
    static final int[] field2052;
    public int yw;
    static final int[] field2053;
    static int Scene_cameraPitchSine;
    public static int eu;
    static final int[] field2055;
    static final int bs = 128;
    static int Scene_cameraX;
    static int Scene_viewportXMax;
    public static final int ci = 128;
    static final int ai = 50;
    public int[][][] om;
    public static final int cc = 32;
    static int tileUpdateCount;
    static int Scene_currentOccludersCount;
    int[][] tileRotation2D;
    public int[][][] jr;
    public boolean sg;
    static boolean[][][][] visibilityMap;
    static boolean[][] visibleTiles;
    static int Scene_viewportXCenter;
    static int Scene_viewportYCenter;
    static int Scene_viewportXMin;
    static int Scene_viewportYMin;
    int planes;
    static int Scene_viewportYMax;
    
    public Scene(final int planes, final int xSize, final int ySize, final int[][][] tileHeights) {
        this.yw = 0;
        this.jr = new int[4][104][104];
        this.sw = new HashSet();
        this.minPlane = 0;
        this.tempGameObjectsCount = 0;
        this.tempGameObjects = new GameObject[5000];
        this.tileShape2D = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
        this.tileRotation2D = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
        this.planes = planes;
        this.xSize = xSize;
        this.ySize = ySize;
        this.tiles = new Tile[planes][xSize][ySize];
        this.field2020 = new int[planes][xSize + 1][ySize + 1];
        this.tileHeights = tileHeights;
        this.clear();
    }
    
    static {
        Scene.Scene_isLowDetail = true;
        Scene.tileUpdateCount = 0;
        Scene.Scene_plane = 0;
        Scene.gameObjects = new GameObject[100];
        Scene.checkClick = false;
        Scene.Scene_selectedPlane = 0;
        Scene.Scene_selectedScreenX = 0;
        Scene.Scene_selectedScreenY = 0;
        Scene.Scene_selectedX = -1;
        Scene.Scene_selectedY = -1;
        Scene.viewportWalking = false;
        Scene.Scene_planesCount = 4;
        Scene.Scene_planeOccluderCounts = new int[Scene.Scene_planesCount];
        Scene.Scene_planeOccluders = new Occluder[Scene.Scene_planesCount][500];
        Scene.Scene_currentOccludersCount = 0;
        Scene.Scene_currentOccluders = new Occluder[500];
        Scene.Scene_tilesDeque = new NodeDeque();
        field2052 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
        field2053 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
        field2045 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
        field2055 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
        field2032 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
        field2021 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
        field2033 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
        Scene.visibilityMap = new boolean[8][32][51][51];
        fd = !Scene.class.desiredAssertionStatus();
        Scene.eu = -1;
        Scene.og = -1;
    }
    
    public void fp() {
        Scene.viewportWalking = true;
    }
    
    public void cs() {
        for (int i = 0; i < this.planes; ++i) {
            for (int j = 0; j < this.xSize; ++j) {
                for (int k = 0; k < this.ySize; ++k) {
                    this.tiles[i][j][k] = null;
                }
            }
        }
        for (int l = 0; l < Scene.Scene_planesCount; ++l) {
            for (int n = 0; n < Scene.Scene_planeOccluderCounts[l]; ++n) {
                Scene.Scene_planeOccluders[l][n] = null;
            }
            Scene.Scene_planeOccluderCounts[l] = 0;
        }
        for (int n2 = 0; n2 < this.tempGameObjectsCount; ++n2) {
            this.tempGameObjects[n2] = null;
        }
        this.tempGameObjectsCount = 0;
        for (int n3 = 0; n3 < Scene.gameObjects.length; ++n3) {
            Scene.gameObjects[n3] = null;
        }
    }
    
    public static void cs(final Scene scene, final GameObject gameObject) {
        if (scene == null) {
            scene.setViewportWalking();
            return;
        }
        for (int i = gameObject.flags * 626811319; i <= gameObject.startY * 1113773819; ++i) {
            for (int j = gameObject.field2271 * 2004902003; j <= gameObject.orientation * -80616117; ++j) {
                final Tile tile = scene.tiles[gameObject.endX * -872547715][i][j];
                if (tile != null) {
                    for (int k = 0; k < tile.gameObjectsCount * -422028371; ++k) {
                        if (tile.gameObjects[k] == gameObject) {
                            final Tile tile2 = tile;
                            tile2.gameObjectsCount -= 1425915941;
                            for (int l = k; l < tile.gameObjectsCount * -422028371; ++l) {
                                tile.gameObjects[l] = tile.gameObjects[l + 1];
                                tile.gameObjectEdgeMasks[l] = tile.gameObjectEdgeMasks[l + 1];
                            }
                            tile.gameObjects[tile.gameObjectsCount * -422028371] = null;
                            break;
                        }
                    }
                    tile.gameObjectsEdgeMask = 0;
                    for (int n = 0; n < tile.gameObjectsCount * -422028371; ++n) {
                        final Tile tile3 = tile;
                        tile3.gameObjectsEdgeMask = (tile3.gameObjectsEdgeMask * -1639156513 | tile.gameObjectEdgeMasks[n]) * -213696756;
                    }
                }
            }
        }
    }
    
    public boolean isInstance() {
        return this.kp;
    }
    
    public void dp(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null) {
            final BoundaryObject ix = tile.ix();
            tile.sc(null);
            if (ix != null) {
                if (!Scene.fd && !this.kp) {
                    throw new AssertionError();
                }
                final WallObjectDespawned wallObjectDespawned = new WallObjectDespawned();
                wallObjectDespawned.setTile((net.runelite.api.Tile)tile);
                wallObjectDespawned.setWallObject((WallObject)ix);
                ScriptFrame.client.getCallbacks().post((Object)wallObjectDespawned);
            }
        }
    }
    
    public static boolean shouldSendWalk() {
        return Scene.viewportWalking && Scene.Scene_selectedX != -1;
    }
    
    public void ca(final int minPlane) {
        this.minPlane = minPlane;
        for (int i = 0; i < this.xSize; ++i) {
            for (int j = 0; j < this.ySize; ++j) {
                if (this.tiles[minPlane][i][j] == null) {
                    this.tiles[minPlane][i][j] = new Tile(minPlane, i, j);
                }
            }
        }
    }
    
    public WallDecoration method1253(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return null;
        }
        return tile.wallDecoration;
    }
    
    public boolean cd(final int n, final int n2, final int n3, final int n4, final int n5, final Renderable renderable, final int n6, final long n7, final boolean b) {
        if (renderable == null) {
            return true;
        }
        int n8 = n2 - n5;
        int n9 = n3 - n5;
        int n10 = n2 + n5;
        int n11 = n3 + n5;
        if (b) {
            if (n6 > -705313121 && n6 < -1789666215) {
                n11 += 128;
            }
            if (n6 > 1152 && n6 < 1920) {
                n10 += 128;
            }
            if (n6 > 1664 || n6 < 384) {
                n9 -= 128;
            }
            if (n6 > 128 && n6 < 896) {
                n8 -= 128;
            }
        }
        final int n12 = n8 / 128;
        final int n13 = n9 / 128;
        return iq(this, n, n12, n13, n10 / -300699903 - n12 + 1, n11 / -756331864 - n13 + 1, n2, n3, n4, renderable, n6, true, n7, 0);
    }
    
    static final int method1268(final int n, int n2) {
        n2 = n2 * (n & 0x7F) >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    public GameObject getGameObject(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return null;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n2 && gameObject.field2271 * 2004902003 == n3) {
                return gameObject;
            }
        }
        return null;
    }
    
    public void cr(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20) {
        if (n4 == 0) {
            final SceneTilePaint paint = new SceneTilePaint(n11, n12, n13, n14, -1, n19, false);
            for (int i = n; i >= 0; --i) {
                if (this.tiles[i][n2][n3] == null) {
                    this.tiles[i][n2][n3] = new Tile(i, n2, n3);
                }
            }
            this.tiles[n][n2][n3].paint = paint;
            return;
        }
        if (n4 == 1) {
            final SceneTilePaint paint2 = new SceneTilePaint(n15, n16, n17, n18, n6, n20, n7 == n8 && n7 == n9 && n7 == n10);
            for (int j = n; j >= 0; --j) {
                if (this.tiles[j][n2][n3] == null) {
                    this.tiles[j][n2][n3] = new Tile(j, n2, n3);
                }
            }
            this.tiles[n][n2][n3].paint = paint2;
            return;
        }
        final SceneTileModel model = new SceneTileModel(n4, n5, n6, n2, n3, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
        for (int k = n; k >= 0; --k) {
            if (this.tiles[k][n2][n3] == null) {
                this.tiles[k][n2][n3] = new Tile(k, n2, n3);
            }
        }
        this.tiles[n][n2][n3].model = model;
    }
    
    boolean method1273(final int n, final int n2, final int n3) {
        for (int i = 0; i < Scene.Scene_currentOccludersCount; ++i) {
            final Occluder occluder = Scene.Scene_currentOccluders[i];
            if (occluder.field2092 * -221071853 == 1) {
                final int n4 = occluder.minX * -1074260583 - n;
                if (n4 > 0) {
                    final int n5 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n4 >> 8);
                    final int n6 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n4 >> 8);
                    final int n7 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n4 >> 8);
                    final int n8 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n4 >> 8);
                    if (n3 >= n5 && n3 <= n6 && n2 >= n7 && n2 <= n8) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 2) {
                final int n9 = n - occluder.minX * -1074260583;
                if (n9 > 0) {
                    final int n10 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n9 >> 8);
                    final int n11 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n9 >> 8);
                    final int n12 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n9 >> 8);
                    final int n13 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n9 >> 8);
                    if (n3 >= n10 && n3 <= n11 && n2 >= n12 && n2 <= n13) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 3) {
                final int n14 = occluder.minZ * -1443747699 - n3;
                if (n14 > 0) {
                    final int n15 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n14 >> 8);
                    final int n16 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n14 >> 8);
                    final int n17 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n14 >> 8);
                    final int n18 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n14 >> 8);
                    if (n >= n15 && n <= n16 && n2 >= n17 && n2 <= n18) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 4) {
                final int n19 = n3 - occluder.minZ * -1443747699;
                if (n19 > 0) {
                    final int n20 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n19 >> 8);
                    final int n21 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n19 >> 8);
                    final int n22 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n19 >> 8);
                    final int n23 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n19 >> 8);
                    if (n >= n20 && n <= n21 && n2 >= n22 && n2 <= n23) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 5) {
                final int n24 = n2 - occluder.minY * 690846039;
                if (n24 > 0) {
                    final int n25 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n24 >> 8);
                    final int n26 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n24 >> 8);
                    final int n27 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n24 >> 8);
                    final int n28 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n24 >> 8);
                    if (n >= n25 && n <= n26 && n3 >= n27 && n3 <= n28) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public long getWallDecorationTag(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.wallDecoration != null) {
            return tile.wallDecoration.tag * -4691380879163567243L;
        }
        return 0L;
    }
    
    public void cb(final int n, final int n2, final int n3, final int n4, final Renderable first, final long n5, final Renderable second, final Renderable third) {
        final ItemLayer itemLayer = new ItemLayer();
        itemLayer.first = first;
        itemLayer.x = n2 * 1690125440 + 727966298;
        itemLayer.y = n3 * 1860701938 - 553669456;
        itemLayer.z = n4 * -1407136659;
        itemLayer.tag = n5 * 1651765281680972561L;
        itemLayer.second = second;
        itemLayer.third = third;
        int n6 = 0;
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null) {
            for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
                if ((tile.gameObjects[i].centerY * -72925475 & 0x100) == 0x3864BE8F && tile.gameObjects[i].renderable instanceof Model) {
                    final Model model = (Model)tile.gameObjects[i].renderable;
                    model.calculateBoundsCylinder();
                    if (model.et * -1655790643 > n6) {
                        n6 = model.et * -1703861186;
                    }
                }
            }
        }
        itemLayer.height = n6 * -1223694975;
        if (this.tiles[n][n2][n3] == null) {
            this.tiles[n][n2][n3] = new Tile(n, n2, n3);
        }
        this.tiles[n][n2][n3].itemLayer = itemLayer;
    }
    
    public GameObject da(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return null;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n2 && gameObject.field2271 * 2004902003 == n3) {
                return gameObject;
            }
        }
        return null;
    }
    
    public void pa(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5) {
        qb(this, array, n, n2, n3, n4, n5);
    }
    
    public long el(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.floorDecoration != null) {
            return tile.floorDecoration.tag * 3423223696102332293L;
        }
        return 0L;
    }
    
    public void cl(final int n, final int n2, final int n3, final int n4) {
        if (this.tiles[n][n2][n3] == null) {
            return;
        }
        this.tiles[n][n2][n3].minPlane = n4 * -242961580;
    }
    
    void ex(final ModelData modelData, final int n, final int n2, final int n3) {
        if (n2 < this.xSize) {
            final Tile tile = this.tiles[n][n2 + 1][n3];
            if (tile != null && tile.floorDecoration != null && tile.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile.floorDecoration.renderable, 128, 0, 0, true);
            }
        }
        if (n3 < this.xSize) {
            final Tile tile2 = this.tiles[n][n2][n3 + 1];
            if (tile2 != null && tile2.floorDecoration != null && tile2.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile2.floorDecoration.renderable, 0, 0, 128, true);
            }
        }
        if (n2 < this.xSize && n3 < this.ySize) {
            final Tile tile3 = this.tiles[n][n2 + 1][n3 + 1];
            if (tile3 != null && tile3.floorDecoration != null && tile3.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile3.floorDecoration.renderable, 128, 0, 128, true);
            }
        }
        if (n2 < this.xSize && n3 > 0) {
            final Tile tile4 = this.tiles[n][n2 + 1][n3 - 1];
            if (tile4 != null && tile4.floorDecoration != null && tile4.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile4.floorDecoration.renderable, 128, 0, -128, true);
            }
        }
    }
    
    public GameObject[] tb() {
        return this.tempGameObjects;
    }
    
    public static void tb(final Scene scene, final ModelData modelData, final int n, final int n2, final int n3) {
        if (scene == null) {
            scene.method1259(modelData, n, n, n);
        }
        if (n2 < scene.xSize) {
            final Tile tile = scene.tiles[n][n2 + 1][n3];
            if (tile != null && tile.floorDecoration != null && tile.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile.floorDecoration.renderable, 128, 0, 0, true);
            }
        }
        if (n3 < scene.xSize) {
            final Tile tile2 = scene.tiles[n][n2][n3 + 1];
            if (tile2 != null && tile2.floorDecoration != null && tile2.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile2.floorDecoration.renderable, 0, 0, 128, true);
            }
        }
        if (n2 < scene.xSize && n3 < scene.ySize) {
            final Tile tile3 = scene.tiles[n][n2 + 1][n3 + 1];
            if (tile3 != null && tile3.floorDecoration != null && tile3.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile3.floorDecoration.renderable, 128, 0, 128, true);
            }
        }
        if (n2 < scene.xSize && n3 > 0) {
            final Tile tile4 = scene.tiles[n][n2 + 1][n3 - 1];
            if (tile4 != null && tile4.floorDecoration != null && tile4.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile4.floorDecoration.renderable, 128, 0, -128, true);
            }
        }
    }
    
    boolean gc(final int n, final int n2, final int n3) {
        for (int i = 0; i < Scene.Scene_currentOccludersCount; ++i) {
            final Occluder occluder = Scene.Scene_currentOccluders[i];
            if (occluder.field2092 * -2039344564 == 1) {
                final int n4 = occluder.minX * -1074260583 - n;
                if (n4 > 0) {
                    final int n5 = occluder.minZ * 866996366 + (occluder.field2096 * 1730229589 * n4 >> 8);
                    final int n6 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1817468171 * n4 >> 8);
                    final int n7 = occluder.minY * -1235262168 + (occluder.field2083 * -847323611 * n4 >> 8);
                    final int n8 = occluder.maxY * 1879954201 + (occluder.field2098 * 942492695 * n4 >> 8);
                    if (n3 >= n5 && n3 <= n6 && n2 >= n7 && n2 <= n8) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 2) {
                final int n9 = n - occluder.minX * 914504115;
                if (n9 > 0) {
                    final int n10 = occluder.minZ * -1606046257 + (occluder.field2096 * -878325167 * n9 >> 8);
                    final int n11 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n9 >> 8);
                    final int n12 = occluder.minY * 2128672667 + (occluder.field2083 * -1265494299 * n9 >> 8);
                    final int n13 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n9 >> 8);
                    if (n3 >= n10 && n3 <= n11 && n2 >= n12 && n2 <= n13) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * 1539156813 == 3) {
                final int n14 = occluder.minZ * 1790203987 - n3;
                if (n14 > 0) {
                    final int n15 = occluder.minX * 659637312 + (occluder.field2093 * 1498322871 * n14 >> 8);
                    final int n16 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n14 >> 8);
                    final int n17 = occluder.minY * -2051131174 + (occluder.field2083 * -847323611 * n14 >> 8);
                    final int n18 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n14 >> 8);
                    if (n >= n15 && n <= n16 && n2 >= n17 && n2 <= n18) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -1151754725 == 4) {
                final int n19 = n3 - occluder.minZ * 685943707;
                if (n19 > 0) {
                    final int n20 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n19 >> 8);
                    final int n21 = occluder.maxX * -1376916846 + (occluder.field2094 * -1372354417 * n19 >> 8);
                    final int n22 = occluder.minY * -102299133 + (occluder.field2083 * -847323611 * n19 >> 8);
                    final int n23 = occluder.maxY * -622418525 + (occluder.field2098 * 1873380357 * n19 >> 8);
                    if (n >= n20 && n <= n21 && n2 >= n22 && n2 <= n23) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 5) {
                final int n24 = n2 - occluder.minY * 690846039;
                if (n24 > 0) {
                    final int n25 = occluder.minX * -403713189 + (occluder.field2093 * -332583373 * n24 >> 8);
                    final int n26 = occluder.maxX * 1083278282 + (occluder.field2094 * 542133003 * n24 >> 8);
                    final int n27 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n24 >> 8);
                    final int n28 = occluder.maxZ * 1809803121 + (occluder.field2086 * -227684920 * n24 >> 8);
                    if (n >= n25 && n <= n26 && n3 >= n27 && n3 <= n28) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean fd() {
        return Scene.viewportWalking && Scene.Scene_selectedX != -1;
    }
    
    public void db(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        tile.floorDecoration = null;
    }
    
    boolean dc(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Renderable renderable, final int n9, final boolean b, final long n10, final int n11) {
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n3; j < n3 + n5; ++j) {
                if (i < 0 || j < 0 || i >= this.xSize || j >= this.ySize) {
                    return false;
                }
                final Tile tile = this.tiles[n][i][j];
                if (tile != null && tile.gameObjectsCount * -422028371 >= 5) {
                    return false;
                }
            }
        }
        final GameObject gameObject = new GameObject();
        gameObject.tag = n10 * 8415652607842018777L;
        gameObject.centerY = n11 * -287536779;
        gameObject.endX = n * -1695101227;
        gameObject.endY = n6 * -299460585;
        gameObject.centerX = n7 * -521982365;
        gameObject.plane = n8 * 1244562195;
        gameObject.renderable = renderable;
        gameObject.lastDrawn = n9 * -1843325159;
        gameObject.flags = n2 * 843140103;
        gameObject.field2271 = n3 * -700889925;
        gameObject.startY = (n2 + n4 - 1) * 1300873191;
        gameObject.orientation = (n3 + n5 - 1) * -1083409309;
        for (int k = n2; k < n2 + n4; ++k) {
            for (int l = n3; l < n3 + n5; ++l) {
                int n12 = 0;
                if (k > n2) {
                    ++n12;
                }
                if (k < n2 + n4 - 1) {
                    n12 += 4;
                }
                if (l > n3) {
                    n12 += 8;
                }
                if (l < n3 + n5 - 1) {
                    n12 += 2;
                }
                for (int n13 = n; n13 >= 0; --n13) {
                    if (this.tiles[n13][k][l] == null) {
                        this.tiles[n13][k][l] = new Tile(n13, k, l);
                    }
                }
                final Tile tile2 = this.tiles[n][k][l];
                tile2.gameObjects[tile2.gameObjectsCount * -422028371] = gameObject;
                tile2.gameObjectEdgeMasks[tile2.gameObjectsCount * -422028371] = n12;
                final Tile tile3 = tile2;
                tile3.gameObjectsEdgeMask = (tile3.gameObjectsEdgeMask * -1639156513 | n12) * -1238612193;
                final Tile tile4 = tile2;
                tile4.gameObjectsCount += 1425915941;
            }
        }
        if (b) {
            this.tempGameObjects[this.tempGameObjectsCount++] = gameObject;
        }
        return true;
    }
    
    public void tg(final int n) {
        this.init(n);
    }
    
    boolean method1272(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n2 == n3 && n4 == n5) {
            if (!this.method1237(n, n2, n4)) {
                return false;
            }
            final int n7 = n2 << 7;
            final int n8 = n4 << 7;
            return this.method1273(n7 + 1, this.tileHeights[n][n2][n4] - n6, n8 + 1) && this.method1273(n7 + 128 - 1, this.tileHeights[n][n2 + 1][n4] - n6, n8 + 1) && this.method1273(n7 + 128 - 1, this.tileHeights[n][n2 + 1][n4 + 1] - n6, n8 + 128 - 1) && this.method1273(n7 + 1, this.tileHeights[n][n2][n4 + 1] - n6, n8 + 128 - 1);
        }
        else {
            for (int i = n2; i <= n3; ++i) {
                for (int j = n4; j <= n5; ++j) {
                    if (this.field2020[n][i][j] == -Scene.Scene_drawnCount) {
                        return false;
                    }
                }
            }
            final int n9 = (n2 << 7) + 1;
            final int n10 = (n4 << 7) + 2;
            final int n11 = this.tileHeights[n][n2][n4] - n6;
            if (!this.method1273(n9, n11, n10)) {
                return false;
            }
            final int n12 = (n3 << 7) - 1;
            if (!this.method1273(n12, n11, n10)) {
                return false;
            }
            final int n13 = (n5 << 7) - 1;
            return this.method1273(n9, n11, n13) && this.method1273(n12, n11, n13);
        }
    }
    
    public static void cf(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final Occluder occluder = new Occluder();
        occluder.minTileX = n3 / 128 * 2125806217;
        occluder.maxTileX = n4 / -780061399 * -2141622931;
        occluder.minTileY = n5 / 128 * -1507898379;
        occluder.maxTileY = n6 / 550319898 * -488871713;
        occluder.type = n2 * -1754960543;
        occluder.minX = n3 * 2126671529;
        occluder.maxX = n4 * 1275203202;
        occluder.minZ = n5 * 1701298053;
        occluder.maxZ = n6 * 495746131;
        occluder.minY = n7 * -1861867895;
        occluder.maxY = n8 * 1709878522;
        Scene.Scene_planeOccluders[n][Scene.Scene_planeOccluderCounts[n]++] = occluder;
    }
    
    public BoundaryObject dn(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return null;
        }
        return tile.boundaryObject;
    }
    
    public void cw(final int n, final int n2, final int n3, final int n4, final Renderable renderable, final Renderable renderable2, final int n5, final int n6, final int n7, final int n8, final long n9, final int n10) {
        if (renderable != null) {
            final WallDecoration si = ScriptFrame.client.si();
            si.ee(n9);
            si.rr(n10);
            si.tx(n2 * 128 + 64);
            si.bf(n3 * 128 + 64);
            si.ox(n4);
            si.ez(renderable);
            si.pb(renderable2);
            si.pq(n5);
            si.of(n6);
            si.wa(n7);
            si.fc(n8);
            for (int i = n; i >= 0; --i) {
                if (this.tiles[i][n2][n3] == null) {
                    this.tiles[i][n2][n3] = ScriptFrame.client.sj(i, n2, n3);
                }
            }
            final Tile tile = this.tiles[n][n2][n3];
            tile.eq(si);
            int renderLevel = tile.getRenderLevel();
            if ((this.wb[1][n2][n3] & 0x2) == 0x2) {
                --renderLevel;
            }
            si.mb(renderLevel);
            if (this.sg) {
                final DecorativeObjectSpawned decorativeObjectSpawned = new DecorativeObjectSpawned();
                decorativeObjectSpawned.setTile((net.runelite.api.Tile)tile);
                decorativeObjectSpawned.setDecorativeObject((DecorativeObject)si);
                ScriptFrame.client.getCallbacks().post((Object)decorativeObjectSpawned);
            }
        }
    }
    
    public boolean drawEntity(final int n, final int n2, final int n3, final int n4, final int n5, final Renderable renderable, final int n6, final long n7, final boolean b) {
        if (renderable == null) {
            return true;
        }
        int n8 = n2 - n5;
        int n9 = n3 - n5;
        int n10 = n2 + n5;
        int n11 = n3 + n5;
        if (b) {
            if (n6 > 640 && n6 < 1408) {
                n11 += 128;
            }
            if (n6 > 1152 && n6 < 1920) {
                n10 += 128;
            }
            if (n6 > 1664 || n6 < 384) {
                n9 -= 128;
            }
            if (n6 > 128 && n6 < 896) {
                n8 -= 128;
            }
        }
        final int n12 = n8 / 128;
        final int n13 = n9 / 128;
        return iq(this, n, n12, n13, n10 / 128 - n12 + 1, n11 / 128 - n13 + 1, n2, n3, n4, renderable, n6, true, n7, 0);
    }
    
    static final int ft(final int n, int n2) {
        n2 = n2 * (n & 0x7F) >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > -1820941636) {
            n2 = 126;
        }
        return (n & 0x9C3FC5A3) + n2;
    }
    
    public void newBoundaryObject(final int n, final int n2, final int n3, final int n4, final Renderable renderable, final Renderable renderable2, final int n5, final int n6, final long n7, final int n8) {
        if (renderable != null || renderable2 != null) {
            final BoundaryObject ay = ScriptFrame.client.ay();
            ay.mi(n7);
            ay.wo(n8);
            ay.xi(n2 * 128 + 64);
            ay.jx(n3 * 128 + 64);
            ay.xp(n4);
            ay.lj(renderable);
            ay.xk(renderable2);
            ay.ez(n5);
            ay.qm(n6);
            for (int i = n; i >= 0; --i) {
                if (this.tiles[i][n2][n3] == null) {
                    this.tiles[i][n2][n3] = ScriptFrame.client.sj(i, n2, n3);
                }
            }
            final Tile tile = this.tiles[n][n2][n3];
            tile.sc(ay);
            int renderLevel = tile.getRenderLevel();
            if ((this.wb[1][n2][n3] & 0x2) == 0x2) {
                --renderLevel;
            }
            ay.be(renderLevel);
            if (this.sg) {
                final WallObjectSpawned wallObjectSpawned = new WallObjectSpawned();
                wallObjectSpawned.setTile((net.runelite.api.Tile)tile);
                wallObjectSpawned.setWallObject((WallObject)ay);
                ScriptFrame.client.getCallbacks().post((Object)wallObjectSpawned);
            }
        }
    }
    
    public static long removeGroundItemPile(final Scene scene, final int n, final int n2, final int n3) {
        final Tile tile = scene.tiles[n][n2][n3];
        if (tile == null) {
            return 0L;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * -1399711478 == n2 && gameObject.field2271 * 2004902003 == n3) {
                return gameObject.tag * 5016412888503339625L;
            }
        }
        return 0L;
    }
    
    public void removeGroundItemPile(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n2 && gameObject.field2271 * 2004902003 == n3) {
                this.removeGameObject(gameObject);
                return;
            }
        }
    }
    
    public static void removeGroundItemPile(final Scene scene, final int minPlane) {
        if (scene == null) {
            scene.fr(minPlane, minPlane, minPlane, minPlane, minPlane, minPlane);
            return;
        }
        scene.minPlane = minPlane;
        for (int i = 0; i < scene.xSize; ++i) {
            for (int j = 0; j < scene.ySize; ++j) {
                if (scene.tiles[minPlane][i][j] == null) {
                    scene.tiles[minPlane][i][j] = new Tile(minPlane, i, j);
                }
            }
        }
    }
    
    public static void pt(final Scene scene, int scene_cameraX, final int scene_cameraY, int scene_cameraZ, int n, final int n2, final int scene_plane) {
        if (scene == null) {
            scene.gt(scene_cameraX, scene_cameraX, scene_cameraX, scene_cameraX);
        }
        if (scene_cameraX < 0) {
            scene_cameraX = 0;
        }
        else if (scene_cameraX >= scene.xSize * 128) {
            scene_cameraX = scene.xSize * 128 - 1;
        }
        if (scene_cameraZ < 0) {
            scene_cameraZ = 0;
        }
        else if (scene_cameraZ >= scene.ySize * 1728195431) {
            scene_cameraZ = scene.ySize * -722418191 - 1;
        }
        if (n < -1060318768) {
            n = 83384352;
        }
        else if (n > 383) {
            n = 1383907543;
        }
        ++Scene.Scene_drawnCount;
        Scene.Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[n];
        Scene.Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[n];
        Scene.Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[n2];
        Scene.Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[n2];
        Scene.visibleTiles = Scene.visibilityMap[(n - 128) / 32][n2 / 64];
        Scene.Scene_cameraX = scene_cameraX;
        Scene.Scene_cameraY = scene_cameraY;
        Scene.Scene_cameraZ = scene_cameraZ;
        Scene.Scene_cameraXTile = scene_cameraX / 1017186184;
        Scene.Scene_cameraYTile = scene_cameraZ / 128;
        Scene.Scene_plane = scene_plane;
        Scene.Scene_cameraXTileMin = Scene.Scene_cameraXTile - 25;
        if (Scene.Scene_cameraXTileMin < 0) {
            Scene.Scene_cameraXTileMin = 0;
        }
        Scene.Scene_cameraYTileMin = Scene.Scene_cameraYTile - 25;
        if (Scene.Scene_cameraYTileMin < 0) {
            Scene.Scene_cameraYTileMin = 0;
        }
        Scene.Scene_cameraXTileMax = Scene.Scene_cameraXTile + 25;
        if (Scene.Scene_cameraXTileMax > scene.xSize) {
            Scene.Scene_cameraXTileMax = scene.xSize;
        }
        Scene.Scene_cameraYTileMax = Scene.Scene_cameraYTile + 25;
        if (Scene.Scene_cameraYTileMax > scene.ySize) {
            Scene.Scene_cameraYTileMax = scene.ySize;
        }
        scene.occlude();
        Scene.tileUpdateCount = 0;
        for (int i = scene.minPlane; i < scene.planes; ++i) {
            final Tile[][] array = scene.tiles[i];
            for (int j = Scene.Scene_cameraXTileMin; j < Scene.Scene_cameraXTileMax; ++j) {
                for (int k = Scene.Scene_cameraYTileMin; k < Scene.Scene_cameraYTileMax; ++k) {
                    final Tile tile = array[j][k];
                    if (tile != null) {
                        if (tile.minPlane * -1108965994 <= scene_plane && (Scene.visibleTiles[j - Scene.Scene_cameraXTile + 25][k - Scene.Scene_cameraYTile + 25] || scene.tileHeights[i][j][k] - scene_cameraY >= 2028876067)) {
                            tile.drawPrimary = true;
                            tile.drawSecondary = true;
                            if (tile.gameObjectsCount * -422028371 > 0) {
                                tile.drawGameObjects = true;
                            }
                            else {
                                tile.drawGameObjects = false;
                            }
                            ++Scene.tileUpdateCount;
                        }
                        else {
                            tile.drawPrimary = false;
                            tile.drawSecondary = false;
                            tile.drawGameObjectEdges = 0;
                        }
                    }
                }
            }
        }
        for (int l = scene.minPlane; l < scene.planes; ++l) {
            final Tile[][] array2 = scene.tiles[l];
            for (int n3 = -25; n3 <= 0; ++n3) {
                final int n4 = Scene.Scene_cameraXTile + n3;
                final int n5 = Scene.Scene_cameraXTile - n3;
                if (n4 >= Scene.Scene_cameraXTileMin || n5 < Scene.Scene_cameraXTileMax) {
                    for (int n6 = -1274050100; n6 <= 0; ++n6) {
                        final int n7 = Scene.Scene_cameraYTile + n6;
                        final int n8 = Scene.Scene_cameraYTile - n6;
                        if (n4 >= Scene.Scene_cameraXTileMin) {
                            if (n7 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile2 = array2[n4][n7];
                                if (tile2 != null && tile2.drawPrimary) {
                                    scene.drawTile(tile2, true);
                                }
                            }
                            if (n8 < Scene.Scene_cameraYTileMax) {
                                final Tile tile3 = array2[n4][n8];
                                if (tile3 != null && tile3.drawPrimary) {
                                    scene.drawTile(tile3, true);
                                }
                            }
                        }
                        if (n5 < Scene.Scene_cameraXTileMax) {
                            if (n7 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile4 = array2[n5][n7];
                                if (tile4 != null && tile4.drawPrimary) {
                                    scene.drawTile(tile4, true);
                                }
                            }
                            if (n8 < Scene.Scene_cameraYTileMax) {
                                final Tile tile5 = array2[n5][n8];
                                if (tile5 != null && tile5.drawPrimary) {
                                    scene.drawTile(tile5, true);
                                }
                            }
                        }
                        if (Scene.tileUpdateCount == 0) {
                            Scene.checkClick = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int minPlane = scene.minPlane; minPlane < scene.planes; ++minPlane) {
            final Tile[][] array3 = scene.tiles[minPlane];
            for (int n9 = -25; n9 <= 0; ++n9) {
                final int n10 = Scene.Scene_cameraXTile + n9;
                final int n11 = Scene.Scene_cameraXTile - n9;
                if (n10 >= Scene.Scene_cameraXTileMin || n11 < Scene.Scene_cameraXTileMax) {
                    for (int n12 = 1388930124; n12 <= 0; ++n12) {
                        final int n13 = Scene.Scene_cameraYTile + n12;
                        final int n14 = Scene.Scene_cameraYTile - n12;
                        if (n10 >= Scene.Scene_cameraXTileMin) {
                            if (n13 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile6 = array3[n10][n13];
                                if (tile6 != null && tile6.drawPrimary) {
                                    scene.drawTile(tile6, false);
                                }
                            }
                            if (n14 < Scene.Scene_cameraYTileMax) {
                                final Tile tile7 = array3[n10][n14];
                                if (tile7 != null && tile7.drawPrimary) {
                                    scene.drawTile(tile7, false);
                                }
                            }
                        }
                        if (n11 < Scene.Scene_cameraXTileMax) {
                            if (n13 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile8 = array3[n11][n13];
                                if (tile8 != null && tile8.drawPrimary) {
                                    scene.drawTile(tile8, false);
                                }
                            }
                            if (n14 < Scene.Scene_cameraYTileMax) {
                                final Tile tile9 = array3[n11][n14];
                                if (tile9 != null && tile9.drawPrimary) {
                                    scene.drawTile(tile9, false);
                                }
                            }
                        }
                        if (Scene.tileUpdateCount == 0) {
                            Scene.checkClick = false;
                            return;
                        }
                    }
                }
            }
        }
        Scene.checkClick = false;
    }
    
    public void method1262(final int n, final int n2, final int n3, final int n4) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        final WallDecoration wallDecoration = tile.wallDecoration;
        if (wallDecoration == null) {
            return;
        }
        wallDecoration.xOffset = wallDecoration.xOffset * 1353438721 * n4 / 16 * -1372050943;
        wallDecoration.yOffset = wallDecoration.yOffset * 1573434537 * n4 / 16 * -965136487;
    }
    
    boolean dw(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Renderable renderable, final int n9, final boolean b, final long n10, final int n11) {
        if (!ScriptFrame.client.getCallbacks().draw((net.runelite.api.Renderable)renderable, false)) {
            ScriptFrame.client.wm()[n6 >> 7][n7 >> 7] = -1;
            return false;
        }
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n3; j < n3 + n5; ++j) {
                if (i < 0 || j < 0 || i >= this.planes || j >= this.minPlane) {
                    return false;
                }
                final Tile tile = this.tiles[n][i][j];
                if (tile != null && tile.getRenderLevel() >= 5) {
                    return false;
                }
            }
        }
        GameObject ry;
        if (b) {
            ry = this.tempGameObjects[this.minPlane];
            if (ry == null) {
                final GameObject[] tempGameObjects = this.tempGameObjects;
                final int ySize = this.ySize;
                final GameObject ry2 = ScriptFrame.client.ry();
                tempGameObjects[ySize] = ry2;
                ry = ry2;
            }
            ry.jl(0);
            ry.ns(0);
            this.tempGameObjectsCount = this.minPlane + 1;
        }
        else {
            ry = ScriptFrame.client.ry();
        }
        ry.qh(n10);
        ry.co(n11);
        ry.db(n);
        ry.ji(n6);
        ry.fa(n7);
        ry.ns(n8);
        ry.ka(renderable);
        ry.uv(n9);
        ry.qt(n2);
        ry.jl(n3);
        ry.id(n2 + n4 - 1);
        ry.yf(n3 + n5 - 1);
        for (int k = n2; k < n2 + n4; ++k) {
            for (int l = n3; l < n3 + n5; ++l) {
                int n12 = 0;
                if (k > n2) {
                    ++n12;
                }
                if (k < n2 + n4 - 1) {
                    n12 += 4;
                }
                if (l > n3) {
                    n12 += 8;
                }
                if (l < n3 + n5 - 1) {
                    n12 += 2;
                }
                for (int n13 = n; n13 >= 0; --n13) {
                    if (this.tiles[n13][k][l] == null) {
                        this.tiles[n13][k][l] = ScriptFrame.client.sj(n13, k, l);
                    }
                }
                final Tile tile2 = this.tiles[n][k][l];
                final int ei = tile2.ei();
                tile2.ys()[ei] = ry;
                tile2.ad()[ei] = n12;
                tile2.xn(tile2.getPlane() | n12);
                tile2.xn(ei + 1);
            }
        }
        final Tile tile3 = this.tiles[n][n2][n3];
        if (!Scene.fd && tile3 == null) {
            throw new AssertionError();
        }
        int rl = tile3.rl();
        if ((this.sh[1][n2][n3] & 0x2) == 0x2) {
            --rl;
        }
        ry.db(rl);
        if (!b && this.kp) {
            if (!Scene.fd && renderable instanceof Actor) {
                throw new AssertionError();
            }
            if (!Scene.fd && renderable instanceof Projectile) {
                throw new AssertionError();
            }
            if (!Scene.fd && renderable instanceof GraphicsObject) {
                throw new AssertionError();
            }
            Client.nw.trace("Game object spawn: {}", (Object)ry.qr());
            final GameObjectSpawned gameObjectSpawned = new GameObjectSpawned();
            gameObjectSpawned.setTile((net.runelite.api.Tile)this.tiles[n][n2][n3]);
            gameObjectSpawned.setGameObject((net.runelite.api.GameObject)ry);
            ScriptFrame.client.getCallbacks().post((Object)gameObjectSpawned);
        }
        return true;
    }
    
    public void cj(final int n, final int n2, final int n3, final int n4, final Renderable renderable1, final Renderable renderable2, final int n5, final int n6, final int n7, final int n8, final long n9, final int n10) {
        if (renderable1 == null) {
            return;
        }
        final WallDecoration wallDecoration = new WallDecoration();
        wallDecoration.tag = n9 * -5837374244328004387L;
        wallDecoration.flags = n10 * -950429517;
        wallDecoration.x = n2 * 1048590514 - 103901814;
        wallDecoration.y = n3 * -119805042 + 799628480;
        wallDecoration.z = n4 * -33433415;
        wallDecoration.renderable1 = renderable1;
        wallDecoration.renderable2 = renderable2;
        wallDecoration.orientation = n5 * -1230454197;
        wallDecoration.orientation2 = n6 * 1035196391;
        wallDecoration.xOffset = n7 * 573665649;
        wallDecoration.yOffset = n8 * 94816048;
        for (int i = n; i >= 0; --i) {
            if (this.tiles[i][n2][n3] == null) {
                this.tiles[i][n2][n3] = new Tile(i, n2, n3);
            }
        }
        this.tiles[n][n2][n3].wallDecoration = wallDecoration;
    }
    
    public long getFloorDecorationTag(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null || tile.floorDecoration == null) {
            return 0L;
        }
        return tile.floorDecoration.tag * 3423223696102332293L;
    }
    
    boolean gf(final int n, final int n2, final int n3) {
        for (int i = 0; i < Scene.Scene_currentOccludersCount; ++i) {
            final Occluder occluder = Scene.Scene_currentOccluders[i];
            if (occluder.field2092 * -221071853 == 1) {
                final int n4 = occluder.minX * -1074260583 - n;
                if (n4 > 0) {
                    final int n5 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n4 >> 8);
                    final int n6 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n4 >> 8);
                    final int n7 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n4 >> 8);
                    final int n8 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n4 >> 8);
                    if (n3 >= n5 && n3 <= n6 && n2 >= n7 && n2 <= n8) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 2) {
                final int n9 = n - occluder.minX * -1074260583;
                if (n9 > 0) {
                    final int n10 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n9 >> 8);
                    final int n11 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n9 >> 8);
                    final int n12 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n9 >> 8);
                    final int n13 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n9 >> 8);
                    if (n3 >= n10 && n3 <= n11 && n2 >= n12 && n2 <= n13) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 3) {
                final int n14 = occluder.minZ * -1443747699 - n3;
                if (n14 > 0) {
                    final int n15 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n14 >> 8);
                    final int n16 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n14 >> 8);
                    final int n17 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n14 >> 8);
                    final int n18 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n14 >> 8);
                    if (n >= n15 && n <= n16 && n2 >= n17 && n2 <= n18) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 4) {
                final int n19 = n3 - occluder.minZ * -1443747699;
                if (n19 > 0) {
                    final int n20 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n19 >> 8);
                    final int n21 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n19 >> 8);
                    final int n22 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n19 >> 8);
                    final int n23 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n19 >> 8);
                    if (n >= n20 && n <= n21 && n2 >= n22 && n2 <= n23) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 5) {
                final int n24 = n2 - occluder.minY * 690846039;
                if (n24 > 0) {
                    final int n25 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n24 >> 8);
                    final int n26 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n24 >> 8);
                    final int n27 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n24 >> 8);
                    final int n28 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n24 >> 8);
                    if (n >= n25 && n <= n26 && n3 >= n27 && n3 <= n28) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void removeGameObject(final int n, final int n2, final int n3) {
        this.de(n, n2, n3);
    }
    
    public static void ek(final int[] array, final int n, final int n2, final int scene_viewportXMax, final int scene_viewportYMax) {
        Scene.Scene_viewportXMin = 0;
        Scene.Scene_viewportYMin = 0;
        Scene.Scene_viewportXMax = scene_viewportXMax;
        Scene.Scene_viewportYMax = scene_viewportYMax;
        Scene.Scene_viewportXCenter = scene_viewportXMax / 2;
        Scene.Scene_viewportYCenter = scene_viewportYMax / 2;
        final boolean[][][][] array2 = new boolean[array.length][32][53][53];
        for (int i = 128; i <= 383; i += 32) {
            for (int j = 0; j < 2048; j += 64) {
                Scene.Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[i];
                Scene.Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[i];
                Scene.Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[j];
                Scene.Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[j];
                final int n3 = (i - 128) / 32;
                final int n4 = j / 64;
                for (int k = -26; k < 26; ++k) {
                    for (int l = -26; l < 26; ++l) {
                        final int n5 = k * 128;
                        final int n6 = l * 128;
                        boolean b = false;
                        for (int n7 = -n; n7 <= n2; n7 += 128) {
                            if (method1286(n5, array[n3] + n7, n6)) {
                                b = true;
                                break;
                            }
                        }
                        array2[n3][n4][k + 25 + 1][l + 25 + 1] = b;
                    }
                }
            }
        }
        for (int n8 = 0; n8 < 8; ++n8) {
            for (int n9 = 0; n9 < 32; ++n9) {
                for (int n10 = -25; n10 < 25; ++n10) {
                    for (int n11 = -25; n11 < 25; ++n11) {
                        boolean b2 = false;
                    Label_0192:
                        for (int n12 = -1; n12 <= 1; ++n12) {
                            for (int n13 = -1; n13 <= 1; ++n13) {
                                if (array2[n8][n9][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0192;
                                }
                                if (array2[n8][(n9 + 1) % 31][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0192;
                                }
                                if (array2[n8 + 1][n9][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0192;
                                }
                                if (array2[n8 + 1][(n9 + 1) % 31][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0192;
                                }
                            }
                        }
                        Scene.visibilityMap[n8][n9][n10 + 25][n11 + 25] = b2;
                    }
                }
            }
        }
    }
    
    public void eh(final int[] array, int n, final int n2, final int n3, final int n4, final int n5) {
        final Tile tile = this.tiles[n3][n4][n5];
        if (tile == null) {
            return;
        }
        final SceneTilePaint paint = tile.paint;
        if (paint != null) {
            final int n6 = paint.rgb * -2143818661;
            if (n6 == 0) {
                return;
            }
            for (int i = 0; i < 4; ++i) {
                array[n + 1] = (array[n] = n6);
                array[n + 3] = (array[n + 2] = n6);
                n += n2;
            }
        }
        else {
            final SceneTileModel model = tile.model;
            if (model == null) {
                return;
            }
            final int shape = model.shape;
            final int rotation = model.rotation;
            final int underlayRgb = model.underlayRgb;
            final int overlayRgb = model.overlayRgb;
            final int[] array2 = this.tileShape2D[shape];
            final int[] array3 = this.tileRotation2D[rotation];
            int n7 = 0;
            if (underlayRgb != 0) {
                for (int j = 0; j < 4; ++j) {
                    array[n] = ((array2[array3[n7++]] == 0) ? underlayRgb : overlayRgb);
                    array[n + 1] = ((array2[array3[n7++]] == 0) ? underlayRgb : overlayRgb);
                    array[n + 2] = ((array2[array3[n7++]] == 0) ? underlayRgb : overlayRgb);
                    array[n + 3] = ((array2[array3[n7++]] == 0) ? underlayRgb : overlayRgb);
                    n += n2;
                }
            }
            else {
                for (int k = 0; k < 4; ++k) {
                    if (array2[array3[n7++]] != 0) {
                        array[n] = overlayRgb;
                    }
                    if (array2[array3[n7++]] != 0) {
                        array[n + 1] = overlayRgb;
                    }
                    if (array2[array3[n7++]] != 0) {
                        array[n + 2] = overlayRgb;
                    }
                    if (array2[array3[n7++]] != 0) {
                        array[n + 3] = overlayRgb;
                    }
                    n += n2;
                }
            }
        }
    }
    
    static final int fk(final int n, int n2) {
        n2 = n2 * (n & 0x7F) >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    void fv(final Tile tile, boolean b) {
        Scene.Scene_tilesDeque.addFirst(tile);
        while (true) {
            final Tile tile2 = (Tile)Scene.Scene_tilesDeque.removeLast();
            if (tile2 == null) {
                break;
            }
            if (!tile2.drawSecondary) {
                continue;
            }
            final int n = tile2.x * -464760837;
            final int n2 = tile2.y * -1812849043;
            final int n3 = tile2.plane * 1527994869;
            final int n4 = tile2.originalPlane * 1520539719;
            final Tile[][] array = this.tiles[n3];
            if (tile2.drawPrimary) {
                if (b) {
                    if (n3 > 0) {
                        final Tile tile3 = this.tiles[n3 - 1][n][n2];
                        if (tile3 != null && tile3.drawSecondary) {
                            continue;
                        }
                    }
                    if (n <= Scene.Scene_cameraXTile && n > Scene.Scene_cameraXTileMin) {
                        final Tile tile4 = array[n - 1][n2];
                        if (tile4 != null && tile4.drawSecondary) {
                            if (tile4.drawPrimary) {
                                continue;
                            }
                            if ((tile2.gameObjectsEdgeMask * -1639156513 & 0x1) == 0x0) {
                                continue;
                            }
                        }
                    }
                    if (n >= Scene.Scene_cameraXTile && n < Scene.Scene_cameraXTileMax - 1) {
                        final Tile tile5 = array[n + 1][n2];
                        if (tile5 != null && tile5.drawSecondary) {
                            if (tile5.drawPrimary) {
                                continue;
                            }
                            if ((tile2.gameObjectsEdgeMask * -1639156513 & 0x4) == 0x0) {
                                continue;
                            }
                        }
                    }
                    if (n2 <= Scene.Scene_cameraYTile && n2 > Scene.Scene_cameraYTileMin) {
                        final Tile tile6 = array[n][n2 - 1];
                        if (tile6 != null && tile6.drawSecondary) {
                            if (tile6.drawPrimary) {
                                continue;
                            }
                            if ((tile2.gameObjectsEdgeMask * -1639156513 & 0x8) == 0x0) {
                                continue;
                            }
                        }
                    }
                    if (n2 >= Scene.Scene_cameraYTile && n2 < Scene.Scene_cameraYTileMax - 1) {
                        final Tile tile7 = array[n][n2 + 1];
                        if (tile7 != null && tile7.drawSecondary) {
                            if (tile7.drawPrimary) {
                                continue;
                            }
                            if ((tile2.gameObjectsEdgeMask * -1639156513 & 0x2) == 0x0) {
                                continue;
                            }
                        }
                    }
                }
                else {
                    b = true;
                }
                tile2.drawPrimary = false;
                if (tile2.linkedBelowTile != null) {
                    final Tile linkedBelowTile = tile2.linkedBelowTile;
                    if (linkedBelowTile.paint != null) {
                        if (!this.method1237(0, n, n2)) {
                            this.drawTileUnderlay(linkedBelowTile.paint, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n, n2);
                        }
                    }
                    else if (linkedBelowTile.model != null && !this.method1237(0, n, n2)) {
                        this.drawTileOverlay(linkedBelowTile.model, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n, n2);
                    }
                    final BoundaryObject boundaryObject = linkedBelowTile.boundaryObject;
                    if (boundaryObject != null) {
                        boundaryObject.renderable1.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject.x * -1998748175 - Scene.Scene_cameraX, boundaryObject.z * 1061912079 - Scene.Scene_cameraY, boundaryObject.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject.tag * -4009183385476919801L);
                    }
                    for (int i = 0; i < linkedBelowTile.gameObjectsCount * -422028371; ++i) {
                        final GameObject gameObject = linkedBelowTile.gameObjects[i];
                        if (gameObject != null) {
                            gameObject.renderable.draw(gameObject.lastDrawn * -1521986263, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, gameObject.endY * -1546117209 - Scene.Scene_cameraX, gameObject.plane * 1042267931 - Scene.Scene_cameraY, gameObject.centerX * 1463075659 - Scene.Scene_cameraZ, gameObject.tag * 5016412888503339625L);
                        }
                    }
                }
                boolean b2 = false;
                if (tile2.paint != null) {
                    if (!this.method1237(n4, n, n2)) {
                        b2 = true;
                        if (tile2.paint.neColor * -1667175185 != 12345678 || (Scene.checkClick && n3 <= Scene.Scene_selectedPlane)) {
                            this.drawTileUnderlay(tile2.paint, n4, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n, n2);
                        }
                    }
                }
                else if (tile2.model != null && !this.method1237(n4, n, n2)) {
                    b2 = true;
                    this.drawTileOverlay(tile2.model, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n, n2);
                }
                int n5 = 0;
                int n6 = 0;
                final BoundaryObject boundaryObject2 = tile2.boundaryObject;
                final WallDecoration wallDecoration = tile2.wallDecoration;
                if (boundaryObject2 != null || wallDecoration != null) {
                    if (Scene.Scene_cameraXTile == n) {
                        ++n5;
                    }
                    else if (Scene.Scene_cameraXTile < n) {
                        n5 += 2;
                    }
                    if (Scene.Scene_cameraYTile == n2) {
                        n5 += 3;
                    }
                    else if (Scene.Scene_cameraYTile > n2) {
                        n5 += 6;
                    }
                    n6 = Scene.field2052[n5];
                    tile2.field1989 = Scene.field2045[n5] * 1933576483;
                }
                if (boundaryObject2 != null) {
                    if ((boundaryObject2.orientationA * -137992079 & Scene.field2053[n5]) != 0x0) {
                        if (boundaryObject2.orientationA * -137992079 == 16) {
                            tile2.drawGameObjectEdges = -875132571;
                            tile2.field1987 = Scene.field2055[n5] * 1761397621;
                            tile2.field1969 = 520035649 - tile2.field1987 * 1049420895;
                        }
                        else if (boundaryObject2.orientationA * -137992079 == 32) {
                            tile2.drawGameObjectEdges = -1750265142;
                            tile2.field1987 = Scene.field2032[n5] * 1761397621;
                            tile2.field1969 = 1040071298 - tile2.field1987 * 1049420895;
                        }
                        else if (boundaryObject2.orientationA * -137992079 == 64) {
                            tile2.drawGameObjectEdges = 794437012;
                            tile2.field1987 = Scene.field2021[n5] * 1761397621;
                            tile2.field1969 = 2080142596 - tile2.field1987 * 1049420895;
                        }
                        else {
                            tile2.drawGameObjectEdges = 1669569583;
                            tile2.field1987 = Scene.field2033[n5] * 1761397621;
                            tile2.field1969 = 1560106947 - tile2.field1987 * 1049420895;
                        }
                    }
                    else {
                        tile2.drawGameObjectEdges = 0;
                    }
                    if ((boundaryObject2.orientationA * -137992079 & n6) != 0x0 && !this.ge(n4, n, n2, boundaryObject2.orientationA * -137992079)) {
                        boundaryObject2.renderable1.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject2.x * -1998748175 - Scene.Scene_cameraX, boundaryObject2.z * 1061912079 - Scene.Scene_cameraY, boundaryObject2.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject2.tag * -4009183385476919801L);
                    }
                    if ((boundaryObject2.orientationB * 379413203 & n6) != 0x0 && !this.ge(n4, n, n2, boundaryObject2.orientationB * 379413203)) {
                        boundaryObject2.renderable2.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject2.x * -1998748175 - Scene.Scene_cameraX, boundaryObject2.z * 1061912079 - Scene.Scene_cameraY, boundaryObject2.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject2.tag * -4009183385476919801L);
                    }
                }
                if (wallDecoration != null && !this.method1270(n4, n, n2, wallDecoration.renderable1.height * 1550732737)) {
                    if ((wallDecoration.orientation * -607881373 & n6) != 0x0) {
                        wallDecoration.renderable1.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, wallDecoration.x * 1346340783 - Scene.Scene_cameraX + wallDecoration.xOffset * 1353438721, wallDecoration.z * 452898185 - Scene.Scene_cameraY, wallDecoration.y * 1328351163 - Scene.Scene_cameraZ + wallDecoration.yOffset * 1573434537, wallDecoration.tag * -4691380879163567243L);
                    }
                    else if (wallDecoration.orientation * -607881373 == 256) {
                        final int n7 = wallDecoration.x * 1346340783 - Scene.Scene_cameraX;
                        final int n8 = wallDecoration.z * 452898185 - Scene.Scene_cameraY;
                        final int n9 = wallDecoration.y * 1328351163 - Scene.Scene_cameraZ;
                        final int n10 = wallDecoration.orientation2 * -1711060009;
                        int n11;
                        if (n10 == 1 || n10 == 2) {
                            n11 = -n7;
                        }
                        else {
                            n11 = n7;
                        }
                        int n12;
                        if (n10 == 2 || n10 == 3) {
                            n12 = -n9;
                        }
                        else {
                            n12 = n9;
                        }
                        if (n12 < n11) {
                            wallDecoration.renderable1.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n7 + wallDecoration.xOffset * 1353438721, n8, n9 + wallDecoration.yOffset * 1573434537, wallDecoration.tag * -4691380879163567243L);
                        }
                        else if (wallDecoration.renderable2 != null) {
                            wallDecoration.renderable2.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n7, n8, n9, wallDecoration.tag * -4691380879163567243L);
                        }
                    }
                }
                if (b2) {
                    final FloorDecoration floorDecoration = tile2.floorDecoration;
                    if (floorDecoration != null) {
                        floorDecoration.renderable.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, floorDecoration.x * 487195023 - Scene.Scene_cameraX, floorDecoration.z * 1777058639 - Scene.Scene_cameraY, floorDecoration.y * -1480835961 - Scene.Scene_cameraZ, floorDecoration.tag * 3423223696102332293L);
                    }
                    final ItemLayer itemLayer = tile2.itemLayer;
                    if (itemLayer != null && itemLayer.height * -1118938495 == 0) {
                        if (itemLayer.second != null) {
                            itemLayer.second.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer.x * -1473635399 - Scene.Scene_cameraX, itemLayer.z * 2064997173 - Scene.Scene_cameraY, itemLayer.y * -1839139071 - Scene.Scene_cameraZ, itemLayer.tag * -8562400470617197071L);
                        }
                        if (itemLayer.third != null) {
                            itemLayer.third.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer.x * -1473635399 - Scene.Scene_cameraX, itemLayer.z * 2064997173 - Scene.Scene_cameraY, itemLayer.y * -1839139071 - Scene.Scene_cameraZ, itemLayer.tag * -8562400470617197071L);
                        }
                        if (itemLayer.first != null) {
                            itemLayer.first.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer.x * -1473635399 - Scene.Scene_cameraX, itemLayer.z * 2064997173 - Scene.Scene_cameraY, itemLayer.y * -1839139071 - Scene.Scene_cameraZ, itemLayer.tag * -8562400470617197071L);
                        }
                    }
                }
                final int n13 = tile2.gameObjectsEdgeMask * -1639156513;
                if (n13 != 0) {
                    if (n < Scene.Scene_cameraXTile && (n13 & 0x4) != 0x0) {
                        final Tile tile8 = array[n + 1][n2];
                        if (tile8 != null && tile8.drawSecondary) {
                            Scene.Scene_tilesDeque.addFirst(tile8);
                        }
                    }
                    if (n2 < Scene.Scene_cameraYTile && (n13 & 0x2) != 0x0) {
                        final Tile tile9 = array[n][n2 + 1];
                        if (tile9 != null && tile9.drawSecondary) {
                            Scene.Scene_tilesDeque.addFirst(tile9);
                        }
                    }
                    if (n > Scene.Scene_cameraXTile && (n13 & 0x1) != 0x0) {
                        final Tile tile10 = array[n - 1][n2];
                        if (tile10 != null && tile10.drawSecondary) {
                            Scene.Scene_tilesDeque.addFirst(tile10);
                        }
                    }
                    if (n2 > Scene.Scene_cameraYTile && (n13 & 0x8) != 0x0) {
                        final Tile tile11 = array[n][n2 - 1];
                        if (tile11 != null && tile11.drawSecondary) {
                            Scene.Scene_tilesDeque.addFirst(tile11);
                        }
                    }
                }
            }
            if (tile2.drawGameObjectEdges * 1223983431 != 0) {
                boolean b3 = true;
                for (int j = 0; j < tile2.gameObjectsCount * -422028371; ++j) {
                    if (tile2.gameObjects[j].z * -1033646519 != Scene.Scene_drawnCount && (tile2.gameObjectEdgeMasks[j] & tile2.drawGameObjectEdges * 1223983431) == tile2.field1987 * -1655477027) {
                        b3 = false;
                        break;
                    }
                }
                if (b3) {
                    final BoundaryObject boundaryObject3 = tile2.boundaryObject;
                    if (!this.ge(n4, n, n2, boundaryObject3.orientationA * -137992079)) {
                        boundaryObject3.renderable1.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject3.x * -1998748175 - Scene.Scene_cameraX, boundaryObject3.z * 1061912079 - Scene.Scene_cameraY, boundaryObject3.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject3.tag * -4009183385476919801L);
                    }
                    tile2.drawGameObjectEdges = 0;
                }
            }
            if (tile2.drawGameObjects) {
                try {
                    final int n14 = tile2.gameObjectsCount * -422028371;
                    tile2.drawGameObjects = false;
                    int k = 0;
                Label_2868:
                    for (int l = 0; l < n14; ++l) {
                        final GameObject gameObject2 = tile2.gameObjects[l];
                        if (gameObject2.z * -1033646519 != Scene.Scene_drawnCount) {
                            for (int n15 = gameObject2.flags * 626811319; n15 <= gameObject2.startY * -1242897449; ++n15) {
                                for (int n16 = gameObject2.field2271 * 2004902003; n16 <= gameObject2.orientation * -80616117; ++n16) {
                                    final Tile tile12 = array[n15][n16];
                                    if (tile12.drawPrimary) {
                                        tile2.drawGameObjects = true;
                                        continue Label_2868;
                                    }
                                    if (tile12.drawGameObjectEdges * 1223983431 != 0) {
                                        int n17 = 0;
                                        if (n15 > gameObject2.flags * 626811319) {
                                            ++n17;
                                        }
                                        if (n15 < gameObject2.startY * -1242897449) {
                                            n17 += 4;
                                        }
                                        if (n16 > gameObject2.field2271 * 2004902003) {
                                            n17 += 8;
                                        }
                                        if (n16 < gameObject2.orientation * -80616117) {
                                            n17 += 2;
                                        }
                                        if ((n17 & tile12.drawGameObjectEdges * 1223983431) == tile2.field1969 * 485316675) {
                                            tile2.drawGameObjects = true;
                                            continue Label_2868;
                                        }
                                    }
                                }
                            }
                            Scene.gameObjects[k++] = gameObject2;
                            int n18 = Scene.Scene_cameraXTile - gameObject2.flags * 626811319;
                            final int n19 = gameObject2.startY * -1242897449 - Scene.Scene_cameraXTile;
                            if (n19 > n18) {
                                n18 = n19;
                            }
                            final int n20 = Scene.Scene_cameraYTile - gameObject2.field2271 * 2004902003;
                            final int n21 = gameObject2.orientation * -80616117 - Scene.Scene_cameraYTile;
                            if (n21 > n20) {
                                gameObject2.startX = (n18 + n21) * -1266251803;
                            }
                            else {
                                gameObject2.startX = (n18 + n20) * -1266251803;
                            }
                        }
                    }
                    while (k > 0) {
                        int n22 = -50;
                        int n23 = -1;
                        for (int n24 = 0; n24 < k; ++n24) {
                            final GameObject gameObject3 = Scene.gameObjects[n24];
                            if (gameObject3.z * -1033646519 != Scene.Scene_drawnCount) {
                                if (gameObject3.startX * 308174317 > n22) {
                                    n22 = gameObject3.startX * 308174317;
                                    n23 = n24;
                                }
                                else if (gameObject3.startX * 308174317 == n22) {
                                    final int n25 = gameObject3.endY * -1546117209 - Scene.Scene_cameraX;
                                    final int n26 = gameObject3.centerX * 1463075659 - Scene.Scene_cameraZ;
                                    final int n27 = Scene.gameObjects[n23].endY * -1546117209 - Scene.Scene_cameraX;
                                    final int n28 = Scene.gameObjects[n23].centerX * 1463075659 - Scene.Scene_cameraZ;
                                    if (n25 * n25 + n26 * n26 > n27 * n27 + n28 * n28) {
                                        n23 = n24;
                                    }
                                }
                            }
                        }
                        if (n23 == -1) {
                            break;
                        }
                        final GameObject gameObject4 = Scene.gameObjects[n23];
                        gameObject4.z = Scene.Scene_drawnCount * -76184583;
                        if (!this.method1272(n4, gameObject4.flags * 626811319, gameObject4.startY * -1242897449, gameObject4.field2271 * 2004902003, gameObject4.orientation * -80616117, gameObject4.renderable.height * 1550732737)) {
                            gameObject4.renderable.draw(gameObject4.lastDrawn * -1521986263, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, gameObject4.endY * -1546117209 - Scene.Scene_cameraX, gameObject4.plane * 1042267931 - Scene.Scene_cameraY, gameObject4.centerX * 1463075659 - Scene.Scene_cameraZ, gameObject4.tag * 5016412888503339625L);
                        }
                        for (int n29 = gameObject4.flags * 626811319; n29 <= gameObject4.startY * -1242897449; ++n29) {
                            for (int n30 = gameObject4.field2271 * 2004902003; n30 <= gameObject4.orientation * -80616117; ++n30) {
                                final Tile tile13 = array[n29][n30];
                                if (tile13.drawGameObjectEdges * 1223983431 != 0) {
                                    Scene.Scene_tilesDeque.addFirst(tile13);
                                }
                                else if ((n29 != n || n30 != n2) && tile13.drawSecondary) {
                                    Scene.Scene_tilesDeque.addFirst(tile13);
                                }
                            }
                        }
                    }
                    if (tile2.drawGameObjects) {
                        continue;
                    }
                }
                catch (Exception ex) {
                    tile2.drawGameObjects = false;
                }
            }
            if (!tile2.drawSecondary) {
                continue;
            }
            if (tile2.drawGameObjectEdges * 1223983431 != 0) {
                continue;
            }
            if (n <= Scene.Scene_cameraXTile && n > Scene.Scene_cameraXTileMin) {
                final Tile tile14 = array[n - 1][n2];
                if (tile14 != null && tile14.drawSecondary) {
                    continue;
                }
            }
            if (n >= Scene.Scene_cameraXTile && n < Scene.Scene_cameraXTileMax - 1) {
                final Tile tile15 = array[n + 1][n2];
                if (tile15 != null && tile15.drawSecondary) {
                    continue;
                }
            }
            if (n2 <= Scene.Scene_cameraYTile && n2 > Scene.Scene_cameraYTileMin) {
                final Tile tile16 = array[n][n2 - 1];
                if (tile16 != null && tile16.drawSecondary) {
                    continue;
                }
            }
            if (n2 >= Scene.Scene_cameraYTile && n2 < Scene.Scene_cameraYTileMax - 1) {
                final Tile tile17 = array[n][n2 + 1];
                if (tile17 != null && tile17.drawSecondary) {
                    continue;
                }
            }
            tile2.drawSecondary = false;
            --Scene.tileUpdateCount;
            final ItemLayer itemLayer2 = tile2.itemLayer;
            if (itemLayer2 != null && itemLayer2.height * -1118938495 != 0) {
                if (itemLayer2.second != null) {
                    itemLayer2.second.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer2.x * -1473635399 - Scene.Scene_cameraX, itemLayer2.z * 2064997173 - Scene.Scene_cameraY - itemLayer2.height * -1118938495, itemLayer2.y * -1839139071 - Scene.Scene_cameraZ, itemLayer2.tag * -8562400470617197071L);
                }
                if (itemLayer2.third != null) {
                    itemLayer2.third.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer2.x * -1473635399 - Scene.Scene_cameraX, itemLayer2.z * 2064997173 - Scene.Scene_cameraY - itemLayer2.height * -1118938495, itemLayer2.y * -1839139071 - Scene.Scene_cameraZ, itemLayer2.tag * -8562400470617197071L);
                }
                if (itemLayer2.first != null) {
                    itemLayer2.first.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer2.x * -1473635399 - Scene.Scene_cameraX, itemLayer2.z * 2064997173 - Scene.Scene_cameraY - itemLayer2.height * -1118938495, itemLayer2.y * -1839139071 - Scene.Scene_cameraZ, itemLayer2.tag * -8562400470617197071L);
                }
            }
            if (tile2.field1989 * -1504022901 != 0) {
                final WallDecoration wallDecoration2 = tile2.wallDecoration;
                if (wallDecoration2 != null && !this.method1270(n4, n, n2, wallDecoration2.renderable1.height * 1550732737)) {
                    if ((wallDecoration2.orientation * -607881373 & tile2.field1989 * -1504022901) != 0x0) {
                        wallDecoration2.renderable1.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, wallDecoration2.x * 1346340783 - Scene.Scene_cameraX + wallDecoration2.xOffset * 1353438721, wallDecoration2.z * 452898185 - Scene.Scene_cameraY, wallDecoration2.y * 1328351163 - Scene.Scene_cameraZ + wallDecoration2.yOffset * 1573434537, wallDecoration2.tag * -4691380879163567243L);
                    }
                    else if (wallDecoration2.orientation * -607881373 == 256) {
                        final int n31 = wallDecoration2.x * 1346340783 - Scene.Scene_cameraX;
                        final int n32 = wallDecoration2.z * 452898185 - Scene.Scene_cameraY;
                        final int n33 = wallDecoration2.y * 1328351163 - Scene.Scene_cameraZ;
                        final int n34 = wallDecoration2.orientation2 * -1711060009;
                        int n35;
                        if (n34 == 1 || n34 == 2) {
                            n35 = -n31;
                        }
                        else {
                            n35 = n31;
                        }
                        int n36;
                        if (n34 == 2 || n34 == 3) {
                            n36 = -n33;
                        }
                        else {
                            n36 = n33;
                        }
                        if (n36 >= n35) {
                            wallDecoration2.renderable1.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n31 + wallDecoration2.xOffset * 1353438721, n32, n33 + wallDecoration2.yOffset * 1573434537, wallDecoration2.tag * -4691380879163567243L);
                        }
                        else if (wallDecoration2.renderable2 != null) {
                            wallDecoration2.renderable2.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n31, n32, n33, wallDecoration2.tag * -4691380879163567243L);
                        }
                    }
                }
                final BoundaryObject boundaryObject4 = tile2.boundaryObject;
                if (boundaryObject4 != null) {
                    if ((boundaryObject4.orientationB * 379413203 & tile2.field1989 * -1504022901) != 0x0 && !this.ge(n4, n, n2, boundaryObject4.orientationB * 379413203)) {
                        boundaryObject4.renderable2.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject4.x * -1998748175 - Scene.Scene_cameraX, boundaryObject4.z * 1061912079 - Scene.Scene_cameraY, boundaryObject4.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject4.tag * -4009183385476919801L);
                    }
                    if ((boundaryObject4.orientationA * -137992079 & tile2.field1989 * -1504022901) != 0x0 && !this.ge(n4, n, n2, boundaryObject4.orientationA * -137992079)) {
                        boundaryObject4.renderable1.draw(0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject4.x * -1998748175 - Scene.Scene_cameraX, boundaryObject4.z * 1061912079 - Scene.Scene_cameraY, boundaryObject4.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject4.tag * -4009183385476919801L);
                    }
                }
            }
            if (n3 < this.planes - 1) {
                final Tile tile18 = this.tiles[n3 + 1][n][n2];
                if (tile18 != null && tile18.drawSecondary) {
                    Scene.Scene_tilesDeque.addFirst(tile18);
                }
            }
            if (n < Scene.Scene_cameraXTile) {
                final Tile tile19 = array[n + 1][n2];
                if (tile19 != null && tile19.drawSecondary) {
                    Scene.Scene_tilesDeque.addFirst(tile19);
                }
            }
            if (n2 < Scene.Scene_cameraYTile) {
                final Tile tile20 = array[n][n2 + 1];
                if (tile20 != null && tile20.drawSecondary) {
                    Scene.Scene_tilesDeque.addFirst(tile20);
                }
            }
            if (n > Scene.Scene_cameraXTile) {
                final Tile tile21 = array[n - 1][n2];
                if (tile21 != null && tile21.drawSecondary) {
                    Scene.Scene_tilesDeque.addFirst(tile21);
                }
            }
            if (n2 <= Scene.Scene_cameraYTile) {
                continue;
            }
            final Tile tile22 = array[n][n2 - 1];
            if (tile22 == null || !tile22.drawSecondary) {
                continue;
            }
            Scene.Scene_tilesDeque.addFirst(tile22);
        }
    }
    
    public void fh(final int scene_selectedPlane, final int scene_selectedScreenX, final int scene_selectedScreenY, final boolean viewportWalking) {
        if (shouldSendWalk() && !viewportWalking) {
            return;
        }
        Scene.checkClick = true;
        Scene.viewportWalking = viewportWalking;
        Scene.Scene_selectedPlane = scene_selectedPlane;
        Scene.Scene_selectedScreenX = scene_selectedScreenX;
        Scene.Scene_selectedScreenY = scene_selectedScreenY;
        Scene.Scene_selectedX = -1;
        Scene.Scene_selectedY = -1;
    }
    
    public void ev(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.planes; ++i) {
            for (int j = 0; j < this.xSize; ++j) {
                for (int k = 0; k < this.ySize; ++k) {
                    final Tile tile = this.tiles[i][j][k];
                    if (tile != null) {
                        final BoundaryObject boundaryObject = tile.boundaryObject;
                        if (boundaryObject != null && boundaryObject.renderable1 instanceof ModelData) {
                            final ModelData modelData = (ModelData)boundaryObject.renderable1;
                            this.method1260(modelData, i, j, k, 1, 1);
                            if (boundaryObject.renderable2 instanceof ModelData) {
                                final ModelData modelData2 = (ModelData)boundaryObject.renderable2;
                                this.method1260(modelData2, i, j, k, 1, 1);
                                ModelData.method1198(modelData, modelData2, 0, 0, 0, false);
                                boundaryObject.renderable2 = modelData2.dg(modelData2.ambient, modelData2.contrast, n, n2, n3);
                            }
                            boundaryObject.renderable1 = modelData.dg(modelData.ambient, modelData.contrast, n, n2, n3);
                        }
                        for (int l = 0; l < tile.gameObjectsCount * -422028371; ++l) {
                            final GameObject gameObject = tile.gameObjects[l];
                            if (gameObject != null && gameObject.renderable instanceof ModelData) {
                                final ModelData modelData3 = (ModelData)gameObject.renderable;
                                this.method1260(modelData3, i, j, k, gameObject.startY * -1242897449 - gameObject.flags * 626811319 + 1, gameObject.orientation * -80616117 - gameObject.field2271 * 2004902003 + 1);
                                gameObject.renderable = modelData3.dg(modelData3.ambient, modelData3.contrast, n, n2, n3);
                            }
                        }
                        final FloorDecoration floorDecoration = tile.floorDecoration;
                        if (floorDecoration != null && floorDecoration.renderable instanceof ModelData) {
                            final ModelData modelData4 = (ModelData)floorDecoration.renderable;
                            tb(this, modelData4, i, j, k);
                            floorDecoration.renderable = modelData4.dg(modelData4.ambient, modelData4.contrast, n, n2, n3);
                        }
                    }
                }
            }
        }
    }
    
    public FloorDecoration eq(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.floorDecoration != null) {
            return tile.floorDecoration;
        }
        return null;
    }
    
    static boolean ee(final int n, final int n2, final int n3) {
        final int n4 = n3 * Scene.Scene_cameraYawSine + n * Scene.Scene_cameraYawCosine >> 16;
        final int n5 = n3 * Scene.Scene_cameraYawCosine - n * Scene.Scene_cameraYawSine >> 16;
        final int n6 = n2 * Scene.Scene_cameraPitchSine + n5 * Scene.Scene_cameraPitchCosine >> 16;
        final int n7 = n2 * Scene.Scene_cameraPitchCosine - n5 * Scene.Scene_cameraPitchSine >> 16;
        if (n6 < 50 || n6 > 3500) {
            return false;
        }
        final int n8 = Scene.Scene_viewportXCenter + n4 * 128 / n6;
        final int n9 = Scene.Scene_viewportYCenter + n7 * 1498140643 / n6;
        return n8 >= Scene.Scene_viewportXMin && n8 <= Scene.Scene_viewportXMax && n9 >= Scene.Scene_viewportYMin && n9 <= Scene.Scene_viewportYMax;
    }
    
    public BoundaryObject method1252(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return null;
        }
        return tile.boundaryObject;
    }
    
    public boolean addNullableObject(final int n, final int n2, final int n3, final int n4, final int n5, final Renderable renderable, final int n6, final long n7, final int n8, final int n9, final int n10, final int n11) {
        return renderable == null || iq(this, n, n8, n9, n10 - n8 + 1, n11 - n9 + 1, n2, n3, n4, renderable, n6, true, n7, 0);
    }
    
    public boolean method1288(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Renderable renderable, final int n7, final long n8, final int n9) {
        return renderable == null || iq(this, n, n2, n3, n5, n6, n2 * 128 + 64 * n5, n3 * 128 + 64 * n6, n4, renderable, n7, false, n8, n9);
    }
    
    public long getGameObjectTag(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return 0L;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n2 && gameObject.field2271 * 2004902003 == n3) {
                return gameObject.tag * 5016412888503339625L;
            }
        }
        return 0L;
    }
    
    static boolean containsBounds(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (n2 < n3 && n2 < n4 && n2 < n5) {
            return false;
        }
        if (n2 > n3 && n2 > n4 && n2 > n5) {
            return false;
        }
        if (n < n6 && n < n7 && n < n8) {
            return false;
        }
        if (n > n6 && n > n7 && n > n8) {
            return false;
        }
        final int n9 = (n2 - n3) * (n7 - n6) - (n - n6) * (n4 - n3);
        final int n10 = (n2 - n4) * (n8 - n7) - (n - n7) * (n5 - n4);
        final int n11 = (n2 - n5) * (n6 - n8) - (n - n8) * (n3 - n5);
        if (n9 != 0) {
            return (n9 < 0) ? (n10 <= 0 && n11 <= 0) : (n10 >= 0 && n11 >= 0);
        }
        return n10 == 0 || ((n10 < 0) ? (n11 <= 0) : (n11 >= 0));
    }
    
    public static long containsBounds(final Scene scene, final int n, final int n2, final int n3) {
        final Tile tile = scene.tiles[n][n2][n3];
        if (tile == null || tile.floorDecoration == null) {
            return 0L;
        }
        return tile.floorDecoration.tag * 3423223696102332293L;
    }
    
    void fc(final SceneTilePaint sceneTilePaint, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n9;
        final int n8 = n9 = (n6 << 7) - Scene.Scene_cameraX;
        final int n11;
        final int n10 = n11 = (n7 << 7) - Scene.Scene_cameraZ;
        final int n13;
        final int n12 = n13 = n9 + 128;
        final int n15;
        final int n14 = n15 = n11 + 128;
        final int n16 = this.tileHeights[n][n6][n7] - Scene.Scene_cameraY;
        final int n17 = this.tileHeights[n][n6 + 1][n7] - Scene.Scene_cameraY;
        final int n18 = this.tileHeights[n][n6 + 1][n7 + 1] - Scene.Scene_cameraY;
        final int n19 = this.tileHeights[n][n6][n7 + 1] - Scene.Scene_cameraY;
        final int n20 = n11 * n4 + n9 * n5 >> 16;
        final int n21 = n11 * n5 - n9 * n4 >> 16;
        final int n22 = n20;
        final int n23 = n16 * n3 - n21 * n2 >> 16;
        final int n24 = n16 * n2 + n21 * n3 >> 16;
        final int n25 = n23;
        if (n24 < 50) {
            return;
        }
        final int n26 = n10 * n4 + n13 * n5 >> 16;
        final int n27 = n10 * n5 - n13 * n4 >> 16;
        final int n28 = n26;
        final int n29 = n17 * n3 - n27 * n2 >> 16;
        final int n30 = n17 * n2 + n27 * n3 >> 16;
        final int n31 = n29;
        if (n30 < 50) {
            return;
        }
        final int n32 = n15 * n4 + n12 * n5 >> 16;
        final int n33 = n15 * n5 - n12 * n4 >> 16;
        final int n34 = n32;
        final int n35 = n18 * n3 - n33 * n2 >> 16;
        final int n36 = n18 * n2 + n33 * n3 >> 16;
        final int n37 = n35;
        if (n36 < 50) {
            return;
        }
        final int n38 = n14 * n4 + n8 * n5 >> 16;
        final int n39 = n14 * n5 - n8 * n4 >> 16;
        final int n40 = n38;
        final int n41 = n19 * n3 - n39 * n2 >> 16;
        final int n42 = n19 * n2 + n39 * n3 >> 16;
        final int n43 = n41;
        if (n42 < 50) {
            return;
        }
        final int n44 = TaskHandler.getClipMidX(152327105) + n22 * UserComparator7.get3dZoom(1709959539) / n24;
        final int n45 = class12.getClipMidY(-1799784725) + n25 * UserComparator7.get3dZoom(-458868132) / n24;
        final int n46 = TaskHandler.getClipMidX(224215122) + n28 * UserComparator7.get3dZoom(-1551163317) / n30;
        final int n47 = class12.getClipMidY(-1677472546) + n31 * UserComparator7.get3dZoom(207399840) / n30;
        final int n48 = TaskHandler.getClipMidX(1031332055) + n34 * UserComparator7.get3dZoom(1747134710) / n36;
        final int n49 = class12.getClipMidY(-339580575) + n37 * UserComparator7.get3dZoom(1381353604) / n36;
        final int n50 = TaskHandler.getClipMidX(1071045917) + n40 * UserComparator7.get3dZoom(1669417007) / n42;
        final int n51 = class12.getClipMidY(-2035104323) + n43 * UserComparator7.get3dZoom(-667411762) / n42;
        final float method609 = NPC.method609(n24, -205271252);
        final float method610 = NPC.method609(n30, 206487084);
        final float method611 = NPC.method609(n36, 877264301);
        final float method612 = NPC.method609(n42, 1574369892);
        Rasterizer3D.clips.field2225 = 0;
        if ((n48 - n50) * (n47 - n51) - (n49 - n51) * (n46 - n50) > 0) {
            Rasterizer3D.clips.field2234 = false;
            final int method613 = class6.method20(1858940787);
            if (n48 < 0 || n50 < 0 || n46 < 0 || n48 > method613 || n50 > method613 || n46 > method613) {
                Rasterizer3D.clips.field2234 = true;
            }
            if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n49, n51, n47, n48, n50, n46)) {
                Scene.Scene_selectedX = n6;
                Scene.Scene_selectedY = n7;
            }
            if (sceneTilePaint.texture * 412494011 == -1) {
                if (sceneTilePaint.neColor * -1667175185 != 12345678) {
                    BoundaryObject.method1379(n49, n51, n47, n48, n50, n46, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, -428480375);
                }
            }
            else if (!Scene.Scene_isLowDetail) {
                if (sceneTilePaint.isFlat) {
                    FloorDecoration.method1210(n49, n51, n47, n48, n50, n46, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, n22, n28, n40, n25, n31, n43, n24, n30, n42, sceneTilePaint.texture * 412494011, (byte)12);
                }
                else {
                    FloorDecoration.method1210(n49, n51, n47, n48, n50, n46, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, n34, n40, n28, n37, n43, n31, n36, n42, n30, sceneTilePaint.texture * 412494011, (byte)12);
                }
            }
            else {
                final int averageTextureRGB = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture * 412494011, 511783233);
                BoundaryObject.method1379(n49, n51, n47, n48, n50, n46, method611, method612, method610, method1268(averageTextureRGB, sceneTilePaint.neColor * -1667175185), method1268(averageTextureRGB, sceneTilePaint.nwColor * 890568309), method1268(averageTextureRGB, sceneTilePaint.seColor * 40257399), -428480375);
            }
        }
        if ((n44 - n46) * (n51 - n47) - (n45 - n47) * (n50 - n46) > 0) {
            Rasterizer3D.clips.field2234 = false;
            final int method614 = class6.method20(-1179959407);
            if (n44 < 0 || n46 < 0 || (n50 < 0 || n44 > method614) || n46 > method614 || n50 > method614) {
                Rasterizer3D.clips.field2234 = true;
            }
            if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n45, n47, n51, n44, n46, n50)) {
                Scene.Scene_selectedX = n6;
                Scene.Scene_selectedY = n7;
            }
            if (sceneTilePaint.texture * 412494011 == -1) {
                if (sceneTilePaint.swColor * 1860851959 != 12345678) {
                    BoundaryObject.method1379(n45, n47, n51, n44, n46, n50, method609, method610, method612, sceneTilePaint.swColor * 1860851959, sceneTilePaint.seColor * 40257399, sceneTilePaint.nwColor * 890568309, -428480375);
                }
            }
            else if (!Scene.Scene_isLowDetail) {
                FloorDecoration.method1210(n45, n47, n51, n44, n46, n50, method609, method610, method612, sceneTilePaint.swColor * 1860851959, sceneTilePaint.seColor * 40257399, sceneTilePaint.nwColor * 890568309, n22, n28, n40, n25, n31, n43, n24, n30, n42, sceneTilePaint.texture * 412494011, (byte)12);
            }
            else {
                final int averageTextureRGB2 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture * 412494011, -1066026485);
                BoundaryObject.method1379(n45, n47, n51, n44, n46, n50, method609, method610, method612, method1268(averageTextureRGB2, sceneTilePaint.swColor * 1860851959), method1268(averageTextureRGB2, sceneTilePaint.seColor * 40257399), method1268(averageTextureRGB2, sceneTilePaint.nwColor * 890568309), -428480375);
            }
        }
    }
    
    public void dl() {
        for (int i = 0; i < this.tempGameObjectsCount; ++i) {
            this.removeGameObject(this.tempGameObjects[i]);
            this.tempGameObjects[i] = null;
        }
        this.tempGameObjectsCount = 0;
    }
    
    public void ck(final int n, final int n2) {
        final Tile linkedBelowTile = this.tiles[0][n][n2];
        for (int i = 0; i < 3; ++i) {
            final Tile[] array = this.tiles[i][n];
            final Tile tile = this.tiles[i + 1][n][n2];
            array[n2] = tile;
            final Tile tile2 = tile;
            if (tile2 != null) {
                final Tile tile3 = tile2;
                tile3.plane -= 322652401;
                for (int j = 0; j < tile2.gameObjectsCount * -422028371; ++j) {
                    final GameObject gameObject = tile2.gameObjects[j];
                    if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n && gameObject.field2271 * 1188311898 == n2) {
                        final GameObject gameObject2 = gameObject;
                        gameObject2.endX -= 1454447389;
                    }
                }
            }
        }
        if (this.tiles[0][n][n2] == null) {
            this.tiles[0][n][n2] = new Tile(0, n, n2);
        }
        this.tiles[0][n][n2].linkedBelowTile = linkedBelowTile;
        this.tiles[3][n][n2] = null;
    }
    
    void method1259(final ModelData modelData, final int n, final int n2, final int n3) {
        if (n2 < this.planes) {
            final Tile tile = this.tiles[n][n2 + 1][n3];
            if (tile != null && tile.floorDecoration != null && tile.floorDecoration.renderable instanceof ModelData) {
                ModelData.dt(modelData, (ModelData)tile.floorDecoration.renderable, 128, 0, 0, true);
            }
        }
        if (n3 < this.tempGameObjectsCount) {
            final Tile tile2 = this.tiles[n][n2][n3 + 1];
            if (tile2 != null && tile2.floorDecoration != null && tile2.floorDecoration.renderable instanceof ModelData) {
                ModelData.dt(modelData, (ModelData)tile2.floorDecoration.renderable, 0, 0, 128, true);
            }
        }
        if (n2 < this.ySize && n3 < this.ySize) {
            final Tile tile3 = this.tiles[n][n2 + 1][n3 + 1];
            if (tile3 != null && tile3.floorDecoration != null && tile3.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile3.floorDecoration.renderable, 128, 0, 128, true);
            }
        }
        if (n2 < this.tempGameObjectsCount && n3 > 0) {
            final Tile tile4 = this.tiles[n][n2 + 1][n3 - 1];
            if (tile4 != null && tile4.floorDecoration != null && tile4.floorDecoration.renderable instanceof ModelData) {
                ModelData.method1198(modelData, (ModelData)tile4.floorDecoration.renderable, 128, 0, -128, true);
            }
        }
    }
    
    public static boolean di(final Scene scene, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Renderable renderable, final int n7, final long n8, final int n9) {
        if (scene == null) {
            scene.removeGameObject(n, n, n);
        }
        return renderable == null || iq(scene, n, n2, n3, n5, n6, n2 * -1699591015 + 64 * n5, n3 * -1045979899 + 64 * n6, n4, renderable, n7, false, n8, n9);
    }
    
    boolean di(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Renderable renderable, final int n9, final boolean b, final long n10, final int n11) {
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n3; j < n3 + n5; ++j) {
                if (i < 0 || j < 0 || i >= this.xSize || j >= this.ySize) {
                    return false;
                }
                final Tile tile = this.tiles[n][i][j];
                if (tile != null && tile.gameObjectsCount * -422028371 >= 5) {
                    return false;
                }
            }
        }
        final GameObject gameObject = new GameObject();
        gameObject.tag = n10 * 8415652607842018777L;
        gameObject.centerY = n11 * -287536779;
        gameObject.endX = n * -1695101227;
        gameObject.endY = n6 * -299460585;
        gameObject.centerX = n7 * -521982365;
        gameObject.plane = n8 * 1244562195;
        gameObject.renderable = renderable;
        gameObject.lastDrawn = n9 * -1843325159;
        gameObject.flags = n2 * 843140103;
        gameObject.field2271 = n3 * -700889925;
        gameObject.startY = (n2 + n4 - 1) * 1300873191;
        gameObject.orientation = (n3 + n5 - 1) * -1083409309;
        for (int k = n2; k < n2 + n4; ++k) {
            for (int l = n3; l < n3 + n5; ++l) {
                int n12 = 0;
                if (k > n2) {
                    ++n12;
                }
                if (k < n2 + n4 - 1) {
                    n12 += 4;
                }
                if (l > n3) {
                    n12 += 8;
                }
                if (l < n3 + n5 - 1) {
                    n12 += 2;
                }
                for (int n13 = n; n13 >= 0; --n13) {
                    if (this.tiles[n13][k][l] == null) {
                        this.tiles[n13][k][l] = new Tile(n13, k, l);
                    }
                }
                final Tile tile2 = this.tiles[n][k][l];
                tile2.gameObjects[tile2.gameObjectsCount * -422028371] = gameObject;
                tile2.gameObjectEdgeMasks[tile2.gameObjectsCount * -422028371] = n12;
                final Tile tile3 = tile2;
                tile3.gameObjectsEdgeMask = (tile3.gameObjectsEdgeMask * -1639156513 | n12) * -1238612193;
                final Tile tile4 = tile2;
                tile4.gameObjectsCount += 1425915941;
            }
        }
        if (b) {
            this.tempGameObjects[this.tempGameObjectsCount++] = gameObject;
        }
        return true;
    }
    
    boolean method1237(final int n, final int n2, final int n3) {
        final int n4 = this.field2020[n][n2][n3];
        if (n4 == -Scene.Scene_drawnCount) {
            return false;
        }
        if (n4 == Scene.Scene_drawnCount) {
            return true;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        if (this.method1273(n5 + 1, this.tileHeights[n][n2][n3], n6 + 1) && this.method1273(n5 + 128 - 1, this.tileHeights[n][n2 + 1][n3], n6 + 1) && this.method1273(n5 + 128 - 1, this.tileHeights[n][n2 + 1][n3 + 1], n6 + 128 - 1) && this.method1273(n5 + 1, this.tileHeights[n][n2][n3 + 1], n6 + 128 - 1)) {
            this.field2020[n][n2][n3] = Scene.Scene_drawnCount;
            return true;
        }
        this.field2020[n][n2][n3] = -Scene.Scene_drawnCount;
        return false;
    }
    
    public boolean ct(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Renderable renderable, final int n7, final long n8, final int n9) {
        return renderable == null || iq(this, n, n2, n3, n5, n6, n2 * 128 + 64 * n5, n3 * 128 + 64 * n6, n4, renderable, n7, false, n8, n9);
    }
    
    public void cc(final int minPlane) {
        this.minPlane = minPlane;
        for (int i = 0; i < this.xSize; ++i) {
            for (int j = 0; j < this.ySize; ++j) {
                if (this.tiles[minPlane][i][j] == null) {
                    this.tiles[minPlane][i][j] = new Tile(minPlane, i, j);
                }
            }
        }
    }
    
    public void dv(final int n, final int n2, final int n3, final int n4) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        final WallDecoration wallDecoration = tile.wallDecoration;
        if (wallDecoration == null) {
            return;
        }
        wallDecoration.xOffset = wallDecoration.xOffset * 1353438721 * n4 / 16 * -1372050943;
        wallDecoration.yOffset = wallDecoration.yOffset * 1573434537 * n4 / 16 * -965136487;
    }
    
    public static void fn() {
        Scene.Scene_selectedX = -1;
        Scene.viewportWalking = false;
    }
    
    public void ha(final net.runelite.api.Tile tile, final boolean b) {
        this.drawTile((Tile)tile, b);
    }
    
    public static void ha(final Scene scene, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20) {
        if (scene == null) {
            scene.cy(n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n);
            return;
        }
        if (n4 == 0) {
            final SceneTilePaint paint = new SceneTilePaint(n11, n12, n13, n14, -1, n19, false);
            for (int i = n; i >= 0; --i) {
                if (scene.tiles[i][n2][n3] == null) {
                    scene.tiles[i][n2][n3] = new Tile(i, n2, n3);
                }
            }
            scene.tiles[n][n2][n3].paint = paint;
            return;
        }
        if (n4 == 1) {
            final SceneTilePaint paint2 = new SceneTilePaint(n15, n16, n17, n18, n6, n20, n7 == n8 && n7 == n9 && n7 == n10);
            for (int j = n; j >= 0; --j) {
                if (scene.tiles[j][n2][n3] == null) {
                    scene.tiles[j][n2][n3] = new Tile(j, n2, n3);
                }
            }
            scene.tiles[n][n2][n3].paint = paint2;
            return;
        }
        final SceneTileModel model = new SceneTileModel(n4, n5, n6, n2, n3, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
        for (int k = n; k >= 0; --k) {
            if (scene.tiles[k][n2][n3] == null) {
                scene.tiles[k][n2][n3] = new Tile(k, n2, n3);
            }
        }
        scene.tiles[n][n2][n3].model = model;
    }
    
    static boolean method1286(final int n, final int n2, final int n3) {
        final int n4 = n3 * Scene.Scene_cameraYawSine + n * Scene.Scene_cameraYawCosine >> 16;
        final int n5 = n3 * Scene.Scene_cameraYawCosine - n * Scene.Scene_cameraYawSine >> 16;
        final int n6 = n2 * Scene.Scene_cameraPitchSine + n5 * Scene.Scene_cameraPitchCosine >> 16;
        final int n7 = n2 * Scene.Scene_cameraPitchCosine - n5 * Scene.Scene_cameraPitchSine >> 16;
        if (n6 >= 50 && n6 <= 3500) {
            final int n8 = Scene.Scene_viewportXCenter + n4 * 128 / n6;
            final int n9 = Scene.Scene_viewportYCenter + n7 * 128 / n6;
            return n8 >= Scene.Scene_viewportXMin && n8 <= Scene.Scene_viewportXMax && n9 >= Scene.Scene_viewportYMin && n9 <= Scene.Scene_viewportYMax;
        }
        return false;
    }
    
    public void dh(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        tile.boundaryObject = null;
    }
    
    boolean method1270(final int n, final int n2, final int n3, final int n4) {
        if (!this.method1237(n, n2, n3)) {
            return false;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        return this.method1273(n5 + 1, this.tileHeights[n][n2][n3] - n4, n6 + 1) && this.method1273(n5 + 128 - 1, this.tileHeights[n][n2 + 1][n3] - n4, n6 + 1) && this.method1273(n5 + 128 - 1, this.tileHeights[n][n2 + 1][n3 + 1] - n4, n6 + 128 - 1) && this.method1273(n5 + 1, this.tileHeights[n][n2][n3 + 1] - n4, n6 + 128 - 1);
    }
    
    public int ia() {
        return this.xSize;
    }
    
    public static void method1264() {
        Scene.Scene_selectedX = -1;
        Scene.viewportWalking = false;
    }
    
    static boolean ei(final int n, final int n2, final int n3) {
        final int n4 = n3 * Scene.Scene_cameraYawSine + n * Scene.Scene_cameraYawCosine >> 16;
        final int n5 = n3 * Scene.Scene_cameraYawCosine - n * Scene.Scene_cameraYawSine >> 16;
        final int n6 = n2 * Scene.Scene_cameraPitchSine + n5 * Scene.Scene_cameraPitchCosine >> 16;
        final int n7 = n2 * Scene.Scene_cameraPitchCosine - n5 * Scene.Scene_cameraPitchSine >> 16;
        if (n6 < 50 || n6 > 3500) {
            return false;
        }
        final int n8 = Scene.Scene_viewportXCenter + n4 * 128 / n6;
        final int n9 = Scene.Scene_viewportYCenter + n7 * 128 / n6;
        return n8 >= Scene.Scene_viewportXMin && n8 <= Scene.Scene_viewportXMax && n9 >= Scene.Scene_viewportYMin && n9 <= Scene.Scene_viewportYMax;
    }
    
    public void ci() {
        for (int i = 0; i < this.planes; ++i) {
            for (int j = 0; j < this.xSize; ++j) {
                for (int k = 0; k < this.ySize; ++k) {
                    this.tiles[i][j][k] = null;
                }
            }
        }
        for (int l = 0; l < Scene.Scene_planesCount; ++l) {
            for (int n = 0; n < Scene.Scene_planeOccluderCounts[l]; ++n) {
                Scene.Scene_planeOccluders[l][n] = null;
            }
            Scene.Scene_planeOccluderCounts[l] = 0;
        }
        for (int n2 = 0; n2 < this.tempGameObjectsCount; ++n2) {
            this.tempGameObjects[n2] = null;
        }
        this.tempGameObjectsCount = 0;
        for (int n3 = 0; n3 < Scene.gameObjects.length; ++n3) {
            Scene.gameObjects[n3] = null;
        }
    }
    
    public void setLinkBelow(final int n, final int n2) {
        final Tile linkedBelowTile = this.tiles[0][n][n2];
        for (int i = 0; i < 3; ++i) {
            final Tile[] array = this.tiles[i][n];
            final Tile tile = this.tiles[i + 1][n][n2];
            array[n2] = tile;
            final Tile tile2 = tile;
            if (tile2 != null) {
                final Tile tile3 = tile2;
                tile3.plane += 1846949283;
                for (int j = 0; j < tile2.gameObjectsCount * -422028371; ++j) {
                    final GameObject gameObject = tile2.gameObjects[j];
                    if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n && gameObject.field2271 * 2004902003 == n2) {
                        final GameObject gameObject2 = gameObject;
                        gameObject2.endX += 1695101227;
                    }
                }
            }
        }
        if (this.tiles[0][n][n2] == null) {
            this.tiles[0][n][n2] = new Tile(0, n, n2);
        }
        this.tiles[0][n][n2].linkedBelowTile = linkedBelowTile;
        this.tiles[3][n][n2] = null;
    }
    
    public void removeWallDecoration(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        tile.itemLayer = null;
        tile.pt(-1);
    }
    
    public void em(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n2 && gameObject.field2271 * 2004902003 == n3) {
                this.removeGameObject(gameObject);
                return;
            }
        }
    }
    
    public void newGroundItemPile(final int n, final int n2, final int n3, final int n4, final Renderable first, final long n5, final Renderable second, final Renderable third) {
        final ItemLayer itemLayer = new ItemLayer();
        itemLayer.first = first;
        itemLayer.x = n2 * 1690125440 + 845062720;
        itemLayer.y = n3 * 2013560960 + 1006780480;
        itemLayer.z = n4 * -1773379811;
        itemLayer.tag = n5 * 1651765281680972561L;
        itemLayer.second = second;
        itemLayer.third = third;
        int n6 = 0;
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null) {
            for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
                if ((tile.gameObjects[i].centerY * -72925475 & 0x100) == 0x100 && tile.gameObjects[i].renderable instanceof Model) {
                    final Model model = (Model)tile.gameObjects[i].renderable;
                    model.calculateBoundsCylinder();
                    if (model.et * 1550732737 > n6) {
                        n6 = model.et * 1550732737;
                    }
                }
            }
        }
        itemLayer.height = n6 * -1223694975;
        if (this.tiles[n][n2][n3] == null) {
            this.tiles[n][n2][n3] = new Tile(n, n2, n3);
        }
        this.tiles[n][n2][n3].itemLayer = itemLayer;
        this.tiles[n][n2][n3].pt(-1);
        this.ol(n, n2, n3, n4, first, n5, second, third);
    }
    
    public void df(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n2 && gameObject.field2271 * 2004902003 == n3) {
                this.removeGameObject(gameObject);
                return;
            }
        }
    }
    
    public FloorDecoration et(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.floorDecoration != null) {
            return tile.floorDecoration;
        }
        return null;
    }
    
    public void cu(final int n, final int n2) {
        final Tile linkedBelowTile = this.tiles[0][n][n2];
        for (int i = 0; i < 3; ++i) {
            final Tile[] array = this.tiles[i][n];
            final Tile tile = this.tiles[i + 1][n][n2];
            array[n2] = tile;
            final Tile tile2 = tile;
            if (tile2 != null) {
                final Tile tile3 = tile2;
                tile3.plane += 1846949283;
                for (int j = 0; j < tile2.gameObjectsCount * -422028371; ++j) {
                    final GameObject gameObject = tile2.gameObjects[j];
                    if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n && gameObject.field2271 * 2004902003 == n2) {
                        final GameObject gameObject2 = gameObject;
                        gameObject2.endX += 1695101227;
                    }
                }
            }
        }
        if (this.tiles[0][n][n2] == null) {
            this.tiles[0][n][n2] = new Tile(0, n, n2);
        }
        this.tiles[0][n][n2].linkedBelowTile = linkedBelowTile;
        this.tiles[3][n][n2] = null;
    }
    
    public boolean dm(final int n, final int n2, final int n3, final int n4, final int n5, final Renderable renderable, final int n6, final long n7, final boolean b) {
        if (renderable == null) {
            return true;
        }
        int n8 = n2 - n5;
        int n9 = n3 - n5;
        int n10 = n2 + n5;
        int n11 = n3 + n5;
        if (b) {
            if (n6 > 1781443057 && n6 < 1408) {
                n11 += 128;
            }
            if (n6 > -141482042 && n6 < 1920) {
                n10 += 128;
            }
            if (n6 > -868518663 || n6 < -1500066718) {
                n9 -= 128;
            }
            if (n6 > -1023742295 && n6 < 896) {
                n8 -= 128;
            }
        }
        final int n12 = n8 / 1323679537;
        final int n13 = n9 / -1080535742;
        return iq(this, n, n12, n13, n10 / -1871476705 - n12 + 1, n11 / 128 - n13 + 1, n2, n3, n4, renderable, n6, true, n7, 0);
    }
    
    public void init(final int minPlane) {
        this.minPlane = minPlane;
        for (int i = 0; i < this.xSize; ++i) {
            for (int j = 0; j < this.ySize; ++j) {
                if (this.tiles[minPlane][i][j] == null) {
                    this.tiles[minPlane][i][j] = new Tile(minPlane, i, j);
                }
            }
        }
    }
    
    public static void Scene_addOccluder(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final Occluder occluder = new Occluder();
        occluder.minTileX = n3 / 128 * 2125806217;
        occluder.maxTileX = n4 / 128 * -2141622931;
        occluder.minTileY = n5 / 128 * -1507898379;
        occluder.maxTileY = n6 / 128 * 1022688161;
        occluder.type = n2 * -1065960575;
        occluder.minX = n3 * 2126671529;
        occluder.maxX = n4 * 385880973;
        occluder.minZ = n5 * 582998597;
        occluder.maxZ = n6 * 495746131;
        occluder.minY = n7 * 903512679;
        occluder.maxY = n8 * -1329473239;
        Scene.Scene_planeOccluders[n][Scene.Scene_planeOccluderCounts[n]++] = occluder;
    }
    
    public static void sq(final GrandExchangeOffer grandExchangeOffer, final int n) {
        if (grandExchangeOffer == null) {
            grandExchangeOffer.getItemId();
        }
        grandExchangeOffer.state &= (byte)1153317476;
        if (n == 1) {
            grandExchangeOffer.state |= 0x8;
        }
    }
    
    public Tile[][][] je() {
        return this.tiles;
    }
    
    public void cx(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20) {
        if (n4 == 0) {
            final SceneTilePaint paint = new SceneTilePaint(n11, n12, n13, n14, -1, n19, false);
            for (int i = n; i >= 0; --i) {
                if (this.tiles[i][n2][n3] == null) {
                    this.tiles[i][n2][n3] = new Tile(i, n2, n3);
                }
            }
            this.tiles[n][n2][n3].paint = paint;
            return;
        }
        if (n4 == 1) {
            final SceneTilePaint paint2 = new SceneTilePaint(n15, n16, n17, n18, n6, n20, n7 == n8 && n7 == n9 && n7 == n10);
            for (int j = n; j >= 0; --j) {
                if (this.tiles[j][n2][n3] == null) {
                    this.tiles[j][n2][n3] = new Tile(j, n2, n3);
                }
            }
            this.tiles[n][n2][n3].paint = paint2;
            return;
        }
        final SceneTileModel model = new SceneTileModel(n4, n5, n6, n2, n3, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
        for (int k = n; k >= 0; --k) {
            if (this.tiles[k][n2][n3] == null) {
                this.tiles[k][n2][n3] = new Tile(k, n2, n3);
            }
        }
        this.tiles[n][n2][n3].model = model;
    }
    
    static boolean ec(final int n, final int n2, final int n3) {
        final int n4 = n3 * Scene.Scene_cameraYawSine + n * Scene.Scene_cameraYawCosine >> 16;
        final int n5 = n3 * Scene.Scene_cameraYawCosine - n * Scene.Scene_cameraYawSine >> 16;
        final int n6 = n2 * Scene.Scene_cameraPitchSine + n5 * Scene.Scene_cameraPitchCosine >> 16;
        final int n7 = n2 * Scene.Scene_cameraPitchCosine - n5 * Scene.Scene_cameraPitchSine >> 16;
        if (n6 >= 50 && n6 <= 3500) {
            final int n8 = Scene.Scene_viewportXCenter + n4 * 128 / n6;
            final int n9 = Scene.Scene_viewportYCenter + n7 * 1922589476 / n6;
            return n8 >= Scene.Scene_viewportXMin && (n8 <= Scene.Scene_viewportXMax && n9 >= Scene.Scene_viewportYMin) && n9 <= Scene.Scene_viewportYMax;
        }
        return false;
    }
    
    public static void mq(final Scene scene, int n, final int n2, int n3, int n4, final int n5, final int n6) {
        if (scene == null) {
            scene.draw(n, n, n, n, n, n);
        }
        if (Client.rz != null) {
            Client.uh = 0;
            Client.rz.drawScene(n, n2, n3, n4, n5, n6);
        }
        final boolean gpu = ScriptFrame.client.isGpu();
        final boolean zz = ScriptFrame.client.zz();
        final boolean menuOpen = ScriptFrame.client.isMenuOpen();
        if (!menuOpen && !zz) {
            scene.fx(ScriptFrame.client.getPlane(), ScriptFrame.client.nt() - ScriptFrame.client.getViewportXOffset(), ScriptFrame.client.kf() - ScriptFrame.client.getViewportYOffset(), false);
        }
        if (!gpu && Client.ij != 0) {
            ScriptFrame.client.mu(ScriptFrame.client.getViewportXOffset(), ScriptFrame.client.getViewportYOffset(), ScriptFrame.client.getViewportWidth(), ScriptFrame.client.getViewportHeight(), Client.ij);
        }
        final int ia = scene.ia();
        final int jh = scene.jh();
        final int ri = scene.ri();
        final int minLevel = scene.getMinLevel();
        final Tile[][][] je = scene.je();
        final int n7 = gpu ? Scene.eb : 25;
        if (n < 0) {
            n = 0;
        }
        else if (n >= ia * 128) {
            n = ia * 128 - 1;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        else if (n3 >= ri * 128) {
            n3 = ri * 128 - 1;
        }
        int n8;
        if ((n8 = n4) < 128) {
            n4 = 128;
        }
        else if (n4 > 383) {
            n4 = 383;
        }
        if (!Client.zz) {
            n8 = n4;
        }
        ScriptFrame.client.kf(ScriptFrame.client.vt() + 1);
        ScriptFrame.client.ux(Perspective.SINE[n8]);
        ScriptFrame.client.kv(Perspective.COSINE[n8]);
        ScriptFrame.client.yf(Perspective.SINE[n5]);
        ScriptFrame.client.lk(Perspective.COSINE[n5]);
        final int[][][] tileHeights = ScriptFrame.client.getTileHeights();
        final boolean[][] renderArea = ScriptFrame.client.kj()[(n4 - 128) / 32][n5 / 64];
        ScriptFrame.client.setRenderArea(renderArea);
        ScriptFrame.client.eo(n);
        ScriptFrame.client.ak(n2);
        ScriptFrame.client.wd(n3);
        final int n9 = n / 128;
        final int n10 = n3 / 128;
        ScriptFrame.client.fe(n9);
        ScriptFrame.client.jx(n10);
        ScriptFrame.client.tb(n6);
        int n11 = n9 - n7;
        if (n11 < 0) {
            n11 = 0;
        }
        int n12 = n10 - n7;
        if (n12 < 0) {
            n12 = 0;
        }
        int n13 = n9 + n7;
        if (n13 > ia) {
            n13 = ia;
        }
        int n14 = n10 + n7;
        if (n14 > ri) {
            n14 = ri;
        }
        ScriptFrame.client.vr(n11);
        ScriptFrame.client.fq(n12);
        ScriptFrame.client.qn(n13);
        ScriptFrame.client.ct(n14);
        scene.jd();
        ScriptFrame.client.nb(0);
        if (scene.yw != 0) {
            scene.sw.clear();
            final Player fv = ScriptFrame.client.fv();
            if (fv != null && (scene.yw & 0x1) != 0x0) {
                final LocalPoint localLocation = fv.getLocalLocation();
                if (localLocation.isInScene()) {
                    scene.sw.add(scene.jr[ScriptFrame.client.getPlane()][localLocation.getSceneX()][localLocation.getSceneY()]);
                }
            }
            if (Scene.eu >= 0 && Scene.eu < 104 && Scene.og >= 0 && Scene.og < 104 && (scene.yw & 0x2) != 0x0) {
                scene.sw.add(scene.jr[ScriptFrame.client.getPlane()][Scene.eu][Scene.og]);
            }
            final LocalPoint localDestinationLocation = ScriptFrame.client.getLocalDestinationLocation();
            if (localDestinationLocation != null && localDestinationLocation.isInScene() && (scene.yw & 0x4) != 0x0) {
                scene.sw.add(scene.jr[ScriptFrame.client.getPlane()][localDestinationLocation.getSceneX()][localDestinationLocation.getSceneY()]);
            }
            if (ScriptFrame.client.getCameraPitch() < 310 && (scene.yw & 0x8) != 0x0 && fv != null) {
                final int x = fv.fu() >> 7;
                final int x2 = fv.gk() >> 7;
                int y = ScriptFrame.client.getCameraX() >> 7;
                int y2 = ScriptFrame.client.getCameraY() >> 7;
                if (x >= 0 && x2 >= 0 && y >= 0 && y2 >= 0 && x < 104 && x2 < 104 && y < 104 && y2 < 104) {
                    final int abs = Math.abs(x - y);
                    final int compare = Integer.compare(x, y);
                    final int n15 = -Math.abs(x2 - y2);
                    final int compare2 = Integer.compare(x2, y2);
                    int n16 = abs + n15;
                    while (y != x || y2 != x2) {
                        if (mw(ScriptFrame.client.getPlane(), y, y2)) {
                            scene.sw.add(scene.jr[ScriptFrame.client.getPlane()][y][y2]);
                        }
                        if (2 * n16 >= n15) {
                            n16 += n15;
                            y += compare;
                        }
                        else {
                            n16 += abs;
                            y2 += compare2;
                        }
                    }
                }
            }
        }
        if (!menuOpen) {
            Scene.eu = (Scene.og = -1);
        }
        for (int i = minLevel; i < jh; ++i) {
            final Tile[][] array = je[i];
            for (int j = n11; j < n13; ++j) {
                for (int k = n12; k < n14; ++k) {
                    final Tile tile = array[j][k];
                    if (tile != null) {
                        final int l = scene.jr[ScriptFrame.client.getPlane()][j][k];
                        if ((tile.rl() <= n6 || scene.yw != 0) && (gpu || renderArea[j - n9 + 25][k - n10 + 25] || tileHeights[i][j][k] - n2 >= 2000) && (scene.yw == 0 || ScriptFrame.client.getPlane() >= tile.rl() || l == 0 || !scene.sw.contains(l))) {
                            tile.yz(true);
                            tile.he(true);
                            tile.lc(true);
                            ScriptFrame.client.nb(ScriptFrame.client.vy() + 1);
                        }
                        else {
                            tile.yz(false);
                            tile.he(false);
                            tile.rt(0);
                        }
                    }
                }
            }
        }
        for (int n17 = minLevel; n17 < jh; ++n17) {
            final Tile[][] array2 = je[n17];
            for (int n18 = -n7; n18 <= 0; ++n18) {
                final int n19 = n18 + n9;
                final int n20 = n9 - n18;
                if (n19 >= n11 || n20 < n13) {
                    for (int n21 = -n7; n21 <= 0; ++n21) {
                        final int n22 = n21 + n10;
                        final int n23 = n10 - n21;
                        if (n19 >= n11) {
                            if (n22 >= n12) {
                                final Tile tile2 = array2[n19][n22];
                                if (tile2 != null && tile2.mn()) {
                                    scene.ha((net.runelite.api.Tile)tile2, true);
                                }
                            }
                            if (n23 < n14) {
                                final Tile tile3 = array2[n19][n23];
                                if (tile3 != null && tile3.mn()) {
                                    scene.ha((net.runelite.api.Tile)tile3, true);
                                }
                            }
                        }
                        if (n20 < n13) {
                            if (n22 >= n12) {
                                final Tile tile4 = array2[n20][n22];
                                if (tile4 != null && tile4.mn()) {
                                    scene.ha((net.runelite.api.Tile)tile4, true);
                                }
                            }
                            if (n23 < n14) {
                                final Tile tile5 = array2[n20][n23];
                                if (tile5 != null && tile5.mn()) {
                                    scene.ha((net.runelite.api.Tile)tile5, true);
                                }
                            }
                        }
                        if (ScriptFrame.client.vy() == 0) {
                            ScriptFrame.client.xw(false);
                            ScriptFrame.client.getCallbacks().drawScene();
                            final DrawCallbacks drawCallbacks = ScriptFrame.client.getDrawCallbacks();
                            if (drawCallbacks != null) {
                                drawCallbacks.postDrawScene();
                            }
                            return;
                        }
                    }
                }
            }
        }
    Label_1909:
        for (int n24 = minLevel; n24 < jh; ++n24) {
            final Tile[][] array3 = je[n24];
            for (int n25 = -n7; n25 <= 0; ++n25) {
                final int n26 = n25 + n9;
                final int n27 = n9 - n25;
                if (n26 >= n11 || n27 < n13) {
                    for (int n28 = -n7; n28 <= 0; ++n28) {
                        final int n29 = n28 + n10;
                        final int n30 = n10 - n28;
                        if (n26 >= n11) {
                            if (n29 >= n12) {
                                final Tile tile6 = array3[n26][n29];
                                if (tile6 != null && tile6.mn()) {
                                    scene.ha((net.runelite.api.Tile)tile6, false);
                                }
                            }
                            if (n30 < n14) {
                                final Tile tile7 = array3[n26][n30];
                                if (tile7 != null && tile7.mn()) {
                                    scene.ha((net.runelite.api.Tile)tile7, false);
                                }
                            }
                        }
                        if (n27 < n13) {
                            if (n29 >= n12) {
                                final Tile tile8 = array3[n27][n29];
                                if (tile8 != null && tile8.mn()) {
                                    scene.ha((net.runelite.api.Tile)tile8, false);
                                }
                            }
                            if (n30 < n14) {
                                final Tile tile9 = array3[n27][n30];
                                if (tile9 != null && tile9.mn()) {
                                    scene.ha((net.runelite.api.Tile)tile9, false);
                                }
                            }
                        }
                        if (ScriptFrame.client.vy() == 0) {
                            break Label_1909;
                        }
                    }
                }
            }
        }
        ScriptFrame.client.xw(false);
        ScriptFrame.client.getCallbacks().drawScene();
        final DrawCallbacks drawCallbacks2 = ScriptFrame.client.getDrawCallbacks();
        if (drawCallbacks2 != null) {
            drawCallbacks2.postDrawScene();
        }
    }
    
    void drawTileOverlay(final SceneTileModel sceneTileModel, final int n, final int n2, final int n3, final int n4, final int scene_selectedX, final int scene_selectedY) {
        final Tile tile = this.je()[ScriptFrame.client.getPlane()][scene_selectedX][scene_selectedY];
        final boolean zz = ScriptFrame.client.zz();
        Label_1130: {
            if (!ScriptFrame.client.isGpu()) {
                final int length = sceneTileModel.triangleColorB.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        final int n5 = sceneTileModel.triangleColorB[i] - Scene.Scene_cameraX;
                        final int n6 = sceneTileModel.faceZ[i] - Scene.Scene_cameraY;
                        final int n7 = sceneTileModel.triangleTextureId[i] - Scene.Scene_cameraZ;
                        final int n8 = n7 * n3 + n5 * n4 >> 16;
                        final int n9 = n7 * n4 - n5 * n3 >> 16;
                        final int n10 = n8;
                        final int n11 = n6 * n2 - n9 * n >> 16;
                        final int n12 = n6 * n + n9 * n2 >> 16;
                        final int n13 = n11;
                        if (n12 < 50) {
                            if (this.yw == 0 || !zz || tile == null || tile.bc() != sceneTileModel || tile.rl() != ScriptFrame.client.getPlane()) {
                                return;
                            }
                            break Label_1130;
                        }
                        else {
                            if (sceneTileModel.triangleColorC != null) {
                                SceneTileModel.field2124[i] = n10;
                                SceneTileModel.field2125[i] = n13;
                                SceneTileModel.field2108[i] = n12;
                            }
                            SceneTileModel.field2121[i] = TaskHandler.getClipMidX(-1281475703) + n10 * UserComparator7.get3dZoom(-262239897) / n12;
                            SceneTileModel.field2122[i] = class12.getClipMidY(1099303209) + n13 * UserComparator7.get3dZoom(467950564) / n12;
                            SceneTileModel.field2123[i] = NPC.method609(n12, 1377339840);
                            ++i;
                        }
                    }
                    Rasterizer3D.clips.field2225 = 0;
                    for (int length2 = sceneTileModel.vertexZ.length, j = 0; j < length2; ++j) {
                        final int n14 = sceneTileModel.vertexZ[j];
                        final int n15 = sceneTileModel.faceX[j];
                        final int n16 = sceneTileModel.faceY[j];
                        final int n17 = SceneTileModel.field2121[n14];
                        final int n18 = SceneTileModel.field2121[n15];
                        final int n19 = SceneTileModel.field2121[n16];
                        final int n20 = SceneTileModel.field2122[n14];
                        final int n21 = SceneTileModel.field2122[n15];
                        final int n22 = SceneTileModel.field2122[n16];
                        final float n23 = SceneTileModel.field2123[n14];
                        final float n24 = SceneTileModel.field2123[n15];
                        final float n25 = SceneTileModel.field2123[n16];
                        if ((n17 - n18) * (n22 - n21) - (n20 - n21) * (n19 - n18) > 0) {
                            Rasterizer3D.clips.field2234 = false;
                            final int method20 = class6.method20(1359824041);
                            if (n17 < 0 || n18 < 0 || (n19 < 0 || n17 > method20) || n18 > method20 || n19 > method20) {
                                Rasterizer3D.clips.field2234 = true;
                            }
                            if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n20, n21, n22, n17, n18, n19)) {
                                Scene.Scene_selectedX = scene_selectedX;
                                Scene.Scene_selectedY = scene_selectedY;
                            }
                            if (sceneTileModel.triangleColorC != null && sceneTileModel.triangleColorC[j] != -1) {
                                if (!Scene.Scene_isLowDetail) {
                                    if (sceneTileModel.field2114) {
                                        FloorDecoration.method1210(n20, n21, n22, n17, n18, n19, n23, n24, n25, sceneTileModel.vertexX[j], sceneTileModel.vertexY[j], sceneTileModel.triangleColorA[j], SceneTileModel.field2124[0], SceneTileModel.field2124[1], SceneTileModel.field2124[3], SceneTileModel.field2125[0], SceneTileModel.field2125[1], SceneTileModel.field2125[3], SceneTileModel.field2108[0], SceneTileModel.field2108[1], SceneTileModel.field2108[3], sceneTileModel.triangleColorC[j], (byte)12);
                                    }
                                    else {
                                        FloorDecoration.method1210(n20, n21, n22, n17, n18, n19, n23, n24, n25, sceneTileModel.vertexX[j], sceneTileModel.vertexY[j], sceneTileModel.triangleColorA[j], SceneTileModel.field2124[n14], SceneTileModel.field2124[n15], SceneTileModel.field2124[n16], SceneTileModel.field2125[n14], SceneTileModel.field2125[n15], SceneTileModel.field2125[n16], SceneTileModel.field2108[n14], SceneTileModel.field2108[n15], SceneTileModel.field2108[n16], sceneTileModel.triangleColorC[j], (byte)12);
                                    }
                                }
                                else {
                                    final int averageTextureRGB = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTileModel.triangleColorC[j], -53407378);
                                    BoundaryObject.method1379(n20, n21, n22, n17, n18, n19, n23, n24, n25, method1268(averageTextureRGB, sceneTileModel.vertexX[j]), method1268(averageTextureRGB, sceneTileModel.vertexY[j]), method1268(averageTextureRGB, sceneTileModel.triangleColorA[j]), -428480375);
                                }
                            }
                            else if (sceneTileModel.vertexX[j] != 12345678) {
                                BoundaryObject.method1379(n20, n21, n22, n17, n18, n19, n23, n24, n25, sceneTileModel.vertexX[j], sceneTileModel.vertexY[j], sceneTileModel.triangleColorA[j], -428480375);
                            }
                        }
                    }
                    continue;
                }
            }
            try {
                final int cameraX2 = ScriptFrame.client.getCameraX2();
                final int cameraY2 = ScriptFrame.client.getCameraY2();
                final int cameraZ2 = ScriptFrame.client.getCameraZ2();
                final int get3dZoom = ScriptFrame.client.get3dZoom();
                final int centerX = ScriptFrame.client.getCenterX();
                final int centerY = ScriptFrame.client.getCenterY();
                if (Client.rz != null) {
                    Client.rz.drawSceneModel(0, n, n2, n3, n4, -cameraX2, -cameraY2, -cameraZ2, (net.runelite.api.SceneTileModel)sceneTileModel, ScriptFrame.client.getPlane(), scene_selectedX, scene_selectedY, get3dZoom, centerX, centerY);
                }
                if (!zz) {
                    return;
                }
                final int[] faceX = sceneTileModel.getFaceX();
                final int[] faceY = sceneTileModel.getFaceY();
                final int[] faceZ = sceneTileModel.getFaceZ();
                final int[] vertexX = sceneTileModel.getVertexX();
                final int[] vertexY = sceneTileModel.getVertexY();
                final int[] vertexZ = sceneTileModel.getVertexZ();
                final int length3 = vertexX.length;
                final int length4 = faceX.length;
                final int qn = ScriptFrame.client.qn();
                final int nf = ScriptFrame.client.nf();
                for (int k = 0; k < length3; ++k) {
                    final int n26 = vertexX[k] - cameraX2;
                    final int n27 = vertexY[k] - cameraY2;
                    final int n28 = vertexZ[k] - cameraZ2;
                    final int n29 = n28 * n3 + n26 * n4 >> 16;
                    final int n30 = n28 * n4 - n26 * n3 >> 16;
                    final int n31 = n27 * n2 - n30 * n >> 16;
                    final int n32 = n27 * n + n30 * n2 >> 16;
                    if (n32 < 50) {
                        return;
                    }
                    final int n33 = n29 * get3dZoom / n32 + centerX;
                    final int n34 = n31 * get3dZoom / n32 + centerY;
                    SceneTileModel.field2121[k] = n33;
                    SceneTileModel.field2122[k] = n34;
                }
                int l = 0;
                while (l < length4) {
                    final int n35 = faceX[l];
                    final int n36 = faceY[l];
                    final int n37 = faceZ[l];
                    final int n38 = SceneTileModel.field2121[n35];
                    final int n39 = SceneTileModel.field2121[n36];
                    final int n40 = SceneTileModel.field2121[n37];
                    final int n41 = SceneTileModel.field2122[n35];
                    final int n42 = SceneTileModel.field2122[n36];
                    final int n43 = SceneTileModel.field2122[n37];
                    if ((n38 - n39) * (n43 - n42) - (n41 - n42) * (n40 - n39) > 0 && ScriptFrame.client.wb(qn, nf, n41, n42, n43, n38, n39, n40)) {
                        if (ScriptFrame.client.isGpu()) {
                            yj(scene_selectedX, scene_selectedY);
                        }
                        if (tile != null && sceneTileModel == tile.bc() && qn >= ScriptFrame.client.getViewportXOffset() && qn < ScriptFrame.client.getViewportXOffset() + ScriptFrame.client.getViewportWidth() && nf >= ScriptFrame.client.getViewportYOffset() && nf < ScriptFrame.client.getViewportYOffset() + ScriptFrame.client.getViewportHeight()) {
                            xf(scene_selectedX, scene_selectedY, tile.rl());
                            break;
                        }
                        break;
                    }
                    else {
                        ++l;
                    }
                }
            }
            catch (Exception ex) {
                Client.nw.warn("error during overlay rendering", (Throwable)ex);
            }
        }
    }
    
    void dk(final GameObject gameObject) {
        for (int i = gameObject.startX * 626811319; i <= gameObject.orientation * -1242897449; ++i) {
            for (int j = gameObject.startY * 2004902003; j <= gameObject.startY * -80616117; ++j) {
                final Tile tile = this.tiles[gameObject.field2271 * -872547715][i][j];
                if (tile != null) {
                    for (int k = 0; k < tile.minPlane * -422028371; ++k) {
                        if (tile.gameObjects[k] == gameObject) {
                            final Tile tile2 = tile;
                            tile2.plane = tile2.field1989 - 1425915941;
                            for (int l = k; l < tile.originalPlane * -422028371; ++l) {
                                tile.gameObjects[l] = tile.gameObjects[l + 1];
                                tile.gameObjectEdgeMasks[l] = tile.gameObjectEdgeMasks[l + 1];
                            }
                            tile.gameObjects[tile.plane * -422028371] = null;
                            break;
                        }
                    }
                    tile.gameObjectsCount = 0;
                    for (int n = 0; n < tile.x * -422028371; ++n) {
                        final Tile tile3 = tile;
                        tile3.field1987 = (tile3.minPlane * -1639156513 | tile.gameObjectEdgeMasks[n]) * -1238612193;
                    }
                }
            }
        }
    }
    
    public static void vb(final Scene scene, final int n, final int n2, final int n3, final int n4, final Renderable renderable1, final Renderable renderable2, final int n5, final int n6, final long n7, final int n8) {
        if (scene == null) {
            scene.co(n, n, n, n, renderable1, renderable1, n, n, n7, n);
            return;
        }
        if (renderable1 == null && renderable2 == null) {
            return;
        }
        final BoundaryObject boundaryObject = new BoundaryObject();
        boundaryObject.tag = n7 * -1417919518333993033L;
        boundaryObject.flags = n8 * -2009432563;
        boundaryObject.x = n2 * -1436186496 + 1429390400;
        boundaryObject.y = n3 * 430510720 + 215255360;
        boundaryObject.z = n4 * 1266004207;
        boundaryObject.renderable1 = renderable1;
        boundaryObject.renderable2 = renderable2;
        boundaryObject.orientationA = n5 * 1547196561;
        boundaryObject.orientationB = n6 * 185156955;
        for (int i = n; i >= 0; --i) {
            if (scene.tiles[i][n2][n3] == null) {
                scene.tiles[i][n2][n3] = new Tile(i, n2, n3);
            }
        }
        scene.tiles[n][n2][n3].boundaryObject = boundaryObject;
    }
    
    boolean do(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Renderable renderable, final int n9, final boolean b, final long n10, final int n11) {
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n3; j < n3 + n5; ++j) {
                if (i < 0 || j < 0 || i >= this.xSize || j >= this.ySize) {
                    return false;
                }
                final Tile tile = this.tiles[n][i][j];
                if (tile != null && tile.gameObjectsCount * -422028371 >= 5) {
                    return false;
                }
            }
        }
        final GameObject gameObject = new GameObject();
        gameObject.tag = n10 * 8415652607842018777L;
        gameObject.centerY = n11 * -287536779;
        gameObject.endX = n * 612685000;
        gameObject.endY = n6 * -299460585;
        gameObject.centerX = n7 * -521982365;
        gameObject.plane = n8 * 1244562195;
        gameObject.renderable = renderable;
        gameObject.lastDrawn = n9 * -1954495765;
        gameObject.flags = n2 * -88162564;
        gameObject.field2271 = n3 * 2046923899;
        gameObject.startY = (n2 + n4 - 1) * -252275479;
        gameObject.orientation = (n3 + n5 - 1) * -2096755578;
        for (int k = n2; k < n2 + n4; ++k) {
            for (int l = n3; l < n3 + n5; ++l) {
                int n12 = 0;
                if (k > n2) {
                    ++n12;
                }
                if (k < n2 + n4 - 1) {
                    n12 += 4;
                }
                if (l > n3) {
                    n12 += 8;
                }
                if (l < n3 + n5 - 1) {
                    n12 += 2;
                }
                for (int n13 = n; n13 >= 0; --n13) {
                    if (this.tiles[n13][k][l] == null) {
                        this.tiles[n13][k][l] = new Tile(n13, k, l);
                    }
                }
                final Tile tile2 = this.tiles[n][k][l];
                tile2.gameObjects[tile2.gameObjectsCount * -500956505] = gameObject;
                tile2.gameObjectEdgeMasks[tile2.gameObjectsCount * 2051205013] = n12;
                final Tile tile3 = tile2;
                tile3.gameObjectsEdgeMask = (tile3.gameObjectsEdgeMask * -1639156513 | n12) * -1103643925;
                final Tile tile4 = tile2;
                tile4.gameObjectsCount -= 1906808367;
            }
        }
        if (b) {
            this.tempGameObjects[this.tempGameObjectsCount++] = gameObject;
        }
        return true;
    }
    
    public void dz(final int n, final int n2, final int n3, final int n4) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        final WallDecoration wallDecoration = tile.wallDecoration;
        if (wallDecoration == null) {
            return;
        }
        wallDecoration.xOffset = wallDecoration.xOffset * 1353438721 * n4 / 16 * -1372050943;
        wallDecoration.yOffset = wallDecoration.yOffset * 1573434537 * n4 / 16 * -965136487;
    }
    
    public void fr(int scene_cameraX, final int scene_cameraY, int scene_cameraZ, int n, final int n2, final int scene_plane) {
        if (scene_cameraX < 0) {
            scene_cameraX = 0;
        }
        else if (scene_cameraX >= this.xSize * -1184109406) {
            scene_cameraX = this.xSize * 1560355980 - 1;
        }
        if (scene_cameraZ < 0) {
            scene_cameraZ = 0;
        }
        else if (scene_cameraZ >= this.ySize * 493047064) {
            scene_cameraZ = this.ySize * 128 - 1;
        }
        if (n < 128) {
            n = 128;
        }
        else if (n > -598994299) {
            n = 251067883;
        }
        ++Scene.Scene_drawnCount;
        Scene.Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[n];
        Scene.Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[n];
        Scene.Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[n2];
        Scene.Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[n2];
        Scene.visibleTiles = Scene.visibilityMap[(n - 577536083) / 32][n2 / 64];
        Scene.Scene_cameraX = scene_cameraX;
        Scene.Scene_cameraY = scene_cameraY;
        Scene.Scene_cameraZ = scene_cameraZ;
        Scene.Scene_cameraXTile = scene_cameraX / -2104084882;
        Scene.Scene_cameraYTile = scene_cameraZ / 361066193;
        Scene.Scene_plane = scene_plane;
        Scene.Scene_cameraXTileMin = Scene.Scene_cameraXTile - 25;
        if (Scene.Scene_cameraXTileMin < 0) {
            Scene.Scene_cameraXTileMin = 0;
        }
        Scene.Scene_cameraYTileMin = Scene.Scene_cameraYTile - 25;
        if (Scene.Scene_cameraYTileMin < 0) {
            Scene.Scene_cameraYTileMin = 0;
        }
        Scene.Scene_cameraXTileMax = Scene.Scene_cameraXTile + 25;
        if (Scene.Scene_cameraXTileMax > this.xSize) {
            Scene.Scene_cameraXTileMax = this.xSize;
        }
        Scene.Scene_cameraYTileMax = Scene.Scene_cameraYTile + 25;
        if (Scene.Scene_cameraYTileMax > this.ySize) {
            Scene.Scene_cameraYTileMax = this.ySize;
        }
        this.occlude();
        Scene.tileUpdateCount = 0;
        for (int i = this.minPlane; i < this.planes; ++i) {
            final Tile[][] array = this.tiles[i];
            for (int j = Scene.Scene_cameraXTileMin; j < Scene.Scene_cameraXTileMax; ++j) {
                for (int k = Scene.Scene_cameraYTileMin; k < Scene.Scene_cameraYTileMax; ++k) {
                    final Tile tile = array[j][k];
                    if (tile != null) {
                        if (tile.minPlane * 65855117 <= scene_plane && (Scene.visibleTiles[j - Scene.Scene_cameraXTile + 25][k - Scene.Scene_cameraYTile + 25] || this.tileHeights[i][j][k] - scene_cameraY >= -1013070404)) {
                            tile.drawPrimary = true;
                            tile.drawSecondary = true;
                            if (tile.gameObjectsCount * -422028371 > 0) {
                                tile.drawGameObjects = true;
                            }
                            else {
                                tile.drawGameObjects = false;
                            }
                            ++Scene.tileUpdateCount;
                        }
                        else {
                            tile.drawPrimary = false;
                            tile.drawSecondary = false;
                            tile.drawGameObjectEdges = 0;
                        }
                    }
                }
            }
        }
        for (int l = this.minPlane; l < this.planes; ++l) {
            final Tile[][] array2 = this.tiles[l];
            for (int n3 = -25; n3 <= 0; ++n3) {
                final int n4 = Scene.Scene_cameraXTile + n3;
                final int n5 = Scene.Scene_cameraXTile - n3;
                if (n4 >= Scene.Scene_cameraXTileMin || n5 < Scene.Scene_cameraXTileMax) {
                    for (int n6 = 1644181569; n6 <= 0; ++n6) {
                        final int n7 = Scene.Scene_cameraYTile + n6;
                        final int n8 = Scene.Scene_cameraYTile - n6;
                        if (n4 >= Scene.Scene_cameraXTileMin) {
                            if (n7 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile2 = array2[n4][n7];
                                if (tile2 != null && tile2.drawPrimary) {
                                    this.drawTile(tile2, true);
                                }
                            }
                            if (n8 < Scene.Scene_cameraYTileMax) {
                                final Tile tile3 = array2[n4][n8];
                                if (tile3 != null && tile3.drawPrimary) {
                                    this.drawTile(tile3, true);
                                }
                            }
                        }
                        if (n5 < Scene.Scene_cameraXTileMax) {
                            if (n7 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile4 = array2[n5][n7];
                                if (tile4 != null && tile4.drawPrimary) {
                                    this.drawTile(tile4, true);
                                }
                            }
                            if (n8 < Scene.Scene_cameraYTileMax) {
                                final Tile tile5 = array2[n5][n8];
                                if (tile5 != null && tile5.drawPrimary) {
                                    this.drawTile(tile5, true);
                                }
                            }
                        }
                        if (Scene.tileUpdateCount == 0) {
                            Scene.checkClick = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int minPlane = this.minPlane; minPlane < this.planes; ++minPlane) {
            final Tile[][] array3 = this.tiles[minPlane];
            for (int n9 = -25; n9 <= 0; ++n9) {
                final int n10 = Scene.Scene_cameraXTile + n9;
                final int n11 = Scene.Scene_cameraXTile - n9;
                if (n10 >= Scene.Scene_cameraXTileMin || n11 < Scene.Scene_cameraXTileMax) {
                    for (int n12 = -25; n12 <= 0; ++n12) {
                        final int n13 = Scene.Scene_cameraYTile + n12;
                        final int n14 = Scene.Scene_cameraYTile - n12;
                        if (n10 >= Scene.Scene_cameraXTileMin) {
                            if (n13 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile6 = array3[n10][n13];
                                if (tile6 != null && tile6.drawPrimary) {
                                    this.drawTile(tile6, false);
                                }
                            }
                            if (n14 < Scene.Scene_cameraYTileMax) {
                                final Tile tile7 = array3[n10][n14];
                                if (tile7 != null && tile7.drawPrimary) {
                                    this.drawTile(tile7, false);
                                }
                            }
                        }
                        if (n11 < Scene.Scene_cameraXTileMax) {
                            if (n13 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile8 = array3[n11][n13];
                                if (tile8 != null && tile8.drawPrimary) {
                                    this.drawTile(tile8, false);
                                }
                            }
                            if (n14 < Scene.Scene_cameraYTileMax) {
                                final Tile tile9 = array3[n11][n14];
                                if (tile9 != null && tile9.drawPrimary) {
                                    this.drawTile(tile9, false);
                                }
                            }
                        }
                        if (Scene.tileUpdateCount == 0) {
                            Scene.checkClick = false;
                            return;
                        }
                    }
                }
            }
        }
        Scene.checkClick = false;
    }
    
    public void de(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.planes; ++i) {
            for (int j = 0; j < this.xSize; ++j) {
                for (int k = 0; k < this.ySize; ++k) {
                    final Tile tile = this.tiles[i][j][k];
                    if (tile != null) {
                        final BoundaryObject boundaryObject = tile.boundaryObject;
                        if (boundaryObject != null && boundaryObject.renderable1 instanceof ModelData) {
                            final ModelData modelData = (ModelData)boundaryObject.renderable1;
                            this.method1260(modelData, i, j, k, 1, 1);
                            if (boundaryObject.renderable2 instanceof ModelData) {
                                final ModelData modelData2 = (ModelData)boundaryObject.renderable2;
                                this.method1260(modelData2, i, j, k, 1, 1);
                                ModelData.method1198(modelData, modelData2, 0, 0, 0, false);
                                boundaryObject.renderable2 = modelData2.dg(modelData2.ambient, modelData2.contrast, n, n2, n3);
                            }
                            boundaryObject.renderable1 = modelData.dg(modelData.ambient, modelData.contrast, n, n2, n3);
                        }
                        for (int l = 0; l < tile.gameObjectsCount * -422028371; ++l) {
                            final GameObject gameObject = tile.gameObjects[l];
                            if (gameObject != null && gameObject.renderable instanceof ModelData) {
                                final ModelData modelData3 = (ModelData)gameObject.renderable;
                                this.method1260(modelData3, i, j, k, gameObject.startY * -1242897449 - gameObject.flags * 626811319 + 1, gameObject.orientation * -80616117 - gameObject.field2271 * 2004902003 + 1);
                                gameObject.renderable = modelData3.dg(modelData3.ambient, modelData3.contrast, n, n2, n3);
                            }
                        }
                        final FloorDecoration floorDecoration = tile.floorDecoration;
                        if (floorDecoration != null && floorDecoration.renderable instanceof ModelData) {
                            final ModelData modelData4 = (ModelData)floorDecoration.renderable;
                            tb(this, modelData4, i, j, k);
                            floorDecoration.renderable = modelData4.dg(modelData4.ambient, modelData4.contrast, n, n2, n3);
                        }
                    }
                }
            }
        }
    }
    
    boolean ge(final int n, final int n2, final int n3, final int n4) {
        if (!this.method1237(n, n2, n3)) {
            return false;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        final int n7 = this.tileHeights[n][n2][n3] - 1;
        final int n8 = n7 - 120;
        final int n9 = n7 - 230;
        final int n10 = n7 - 238;
        if (n4 < 16) {
            if (n4 == 1) {
                if (n5 > Scene.Scene_cameraX) {
                    if (!this.method1273(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6) && this.method1273(n5, n9, n6 + 128);
            }
            if (n4 == 2) {
                if (n6 < Scene.Scene_cameraZ) {
                    if (!this.method1273(n5, n7, n6 + 128)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6 + 128)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6 + 128) && this.method1273(n5 + 128, n9, n6 + 128);
            }
            if (n4 == 4) {
                if (n5 < Scene.Scene_cameraX) {
                    if (!this.method1273(n5 + 128, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5 + 128, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5 + 128, n9, n6) && this.method1273(n5 + 128, n9, n6 + 128);
            }
            if (n4 == 8) {
                if (n6 > Scene.Scene_cameraZ) {
                    if (!this.method1273(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n7, n6)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n8, n6)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6) && this.method1273(n5 + 128, n9, n6);
            }
        }
        if (!this.method1273(n5 + 64, n10, n6 + 64)) {
            return false;
        }
        if (n4 == 16) {
            return this.method1273(n5, n9, n6 + 128);
        }
        if (n4 == 32) {
            return this.method1273(n5 + 128, n9, n6 + 128);
        }
        if (n4 == 64) {
            return this.method1273(n5 + 128, n9, n6);
        }
        return n4 != 128 || this.method1273(n5, n9, n6);
    }
    
    public void fl(final int scene_selectedPlane, final int scene_selectedScreenX, final int scene_selectedScreenY, final boolean viewportWalking) {
        if (shouldSendWalk() && !viewportWalking) {
            return;
        }
        Scene.checkClick = true;
        Scene.viewportWalking = viewportWalking;
        Scene.Scene_selectedPlane = scene_selectedPlane;
        Scene.Scene_selectedScreenX = scene_selectedScreenX;
        Scene.Scene_selectedScreenY = scene_selectedScreenY;
        Scene.Scene_selectedX = -1;
        Scene.Scene_selectedY = -1;
    }
    
    public static void nw(final Scene scene, final int n, final int n2, final int n3) {
        if (scene == null) {
            scene.dp(n, n, n);
        }
        final Tile tile = scene.tiles[n][n2][n3];
        if (tile != null) {
            final BoundaryObject ix = tile.ix();
            tile.sc(null);
            if (ix != null) {
                if (!Scene.fd && !scene.sg) {
                    throw new AssertionError();
                }
                final WallObjectDespawned wallObjectDespawned = new WallObjectDespawned();
                wallObjectDespawned.setTile((net.runelite.api.Tile)tile);
                wallObjectDespawned.setWallObject((WallObject)ix);
                ScriptFrame.client.getCallbacks().post((Object)wallObjectDespawned);
            }
        }
    }
    
    public static boolean um(final Scene scene, final int n, final int n2, final int n3) {
        final int n4 = scene.field2020[n][n2][n3];
        if (n4 == -Scene.Scene_drawnCount) {
            return false;
        }
        if (n4 == Scene.Scene_drawnCount) {
            return true;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        if (scene.method1273(n5 + 1, scene.tileHeights[n][n2][n3], n6 + 1) && scene.method1273(n5 + 128 - 1, scene.tileHeights[n][n2 + 1][n3], n6 + 1) && scene.method1273(n5 + 128 - 1, scene.tileHeights[n][n2 + 1][n3 + 1], n6 + 128 - 1) && scene.method1273(n5 + 1, scene.tileHeights[n][n2][n3 + 1], n6 + 128 - 1)) {
            scene.field2020[n][n2][n3] = Scene.Scene_drawnCount;
            return true;
        }
        scene.field2020[n][n2][n3] = -Scene.Scene_drawnCount;
        return false;
    }
    
    public static boolean fo() {
        return Scene.viewportWalking && Scene.Scene_selectedX != -1;
    }
    
    public int ri() {
        return this.ySize;
    }
    
    boolean gt(final int n, final int n2, final int n3, final int n4) {
        if (!this.method1237(n, n2, n3)) {
            return false;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        final int n7 = this.tileHeights[n][n2][n3] - 1;
        final int n8 = n7 - 120;
        final int n9 = n7 - 230;
        final int n10 = n7 - 1397480573;
        if (n4 < 16) {
            if (n4 == 1) {
                if (n5 > Scene.Scene_cameraX) {
                    if (!this.method1273(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5, n7, n6 + 706631676)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5, n8, n6 - 1696532463)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6) && this.method1273(n5, n9, n6 + 128);
            }
            if (n4 == 2) {
                if (n6 < Scene.Scene_cameraZ) {
                    if (!this.method1273(n5, n7, n6 + 270259255)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 1688768926, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6 + 128)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n8, n6 + 1273638667)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6 - 1006930214) && this.method1273(n5 - 1801772453, n9, n6 - 1255912869);
            }
            if (n4 == 4) {
                if (n5 < Scene.Scene_cameraX) {
                    if (!this.method1273(n5 - 574300799, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5 + 1691095029, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 - 9451116, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5 - 96624373, n9, n6) && this.method1273(n5 + 128, n9, n6 + 128);
            }
            if (n4 == 8) {
                if (n6 > Scene.Scene_cameraZ) {
                    if (!this.method1273(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n7, n6)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n8, n6)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6) && this.method1273(n5 - 417587536, n9, n6);
            }
        }
        if (!this.method1273(n5 + 64, n10, n6 + 1759646133)) {
            return false;
        }
        if (n4 == 16) {
            return this.method1273(n5, n9, n6 + 128);
        }
        if (n4 == 899516134) {
            return this.method1273(n5 + 128, n9, n6 - 671823735);
        }
        if (n4 == 64) {
            return this.method1273(n5 - 2119053393, n9, n6);
        }
        return n4 != 1498682979 || this.method1273(n5, n9, n6);
    }
    
    public static void fa() {
        Scene.Scene_selectedX = -1;
        Scene.viewportWalking = false;
    }
    
    public int ed(final int n, final int n2, final int n3, final long n4) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return -1;
        }
        if (tile.boundaryObject != null && tile.boundaryObject.tag * -4009183385476919801L == n4) {
            return tile.boundaryObject.flags * 347144389 & 0xFF;
        }
        if (tile.wallDecoration != null && tile.wallDecoration.tag * -4691380879163567243L == n4) {
            return tile.wallDecoration.flags * 35030579 & 0xFF;
        }
        if (tile.floorDecoration != null && tile.floorDecoration.tag * 3423223696102332293L == n4) {
            return tile.floorDecoration.flags * -1486089441 & 0xFF;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            if (tile.gameObjects[i].tag * 5016412888503339625L == n4) {
                return tile.gameObjects[i].centerY * -72925475 & 0xFF;
            }
        }
        return -1;
    }
    
    public long ea(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.wallDecoration != null) {
            return tile.wallDecoration.tag * -4691380879163567243L;
        }
        return 0L;
    }
    
    public void setTileMinPlane(final int n, final int n2, final int n3, final int n4) {
        if (this.tiles[n][n2][n3] == null) {
            return;
        }
        this.tiles[n][n2][n3].minPlane = n4 * -2078731195;
    }
    
    static final int fm(final int n, int n2) {
        n2 = n2 * (n & 0x7F) >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    static boolean fe(final int n, final int n2, final int n3) {
        final int n4 = n3 * Scene.Scene_cameraYawSine + n * Scene.Scene_cameraYawCosine >> 16;
        final int n5 = n3 * Scene.Scene_cameraYawCosine - n * Scene.Scene_cameraYawSine >> 16;
        final int n6 = n2 * Scene.Scene_cameraPitchSine + n5 * Scene.Scene_cameraPitchCosine >> 16;
        final int n7 = n2 * Scene.Scene_cameraPitchCosine - n5 * Scene.Scene_cameraPitchSine >> 16;
        if (n6 >= 1550502232 && n6 <= 3500) {
            final int n8 = Scene.Scene_viewportXCenter + n4 * -601560836 / n6;
            final int n9 = Scene.Scene_viewportYCenter + n7 * 568657738 / n6;
            return n8 >= Scene.Scene_viewportXMin && n8 <= Scene.Scene_viewportXMax && n9 >= Scene.Scene_viewportYMin && n9 <= Scene.Scene_viewportYMax;
        }
        return false;
    }
    
    public void newWallDecoration(final int n, final int n2, final int n3, final int n4, final Renderable renderable1, final Renderable renderable2, final int n5, final int n6, final int n7, final int n8, final long n9, final int n10) {
        if (renderable1 == null) {
            return;
        }
        final WallDecoration wallDecoration = new WallDecoration();
        wallDecoration.tag = n9 * -5837374244328004387L;
        wallDecoration.flags = n10 * -486021893;
        wallDecoration.x = n2 * 571975552 + 285987776;
        wallDecoration.y = n3 * 1599256960 + 799628480;
        wallDecoration.z = n4 * -33433415;
        wallDecoration.renderable1 = renderable1;
        wallDecoration.renderable2 = renderable2;
        wallDecoration.orientation = n5 * -1230454197;
        wallDecoration.orientation2 = n6 * 1035196391;
        wallDecoration.xOffset = n7 * -1372050943;
        wallDecoration.yOffset = n8 * -965136487;
        for (int i = n; i >= 0; --i) {
            if (this.tiles[i][n2][n3] == null) {
                this.tiles[i][n2][n3] = new Tile(i, n2, n3);
            }
        }
        this.tiles[n][n2][n3].wallDecoration = wallDecoration;
    }
    
    public static void gv(final Scene scene, final GameObject gameObject) {
        if (scene == null) {
            scene.dk(gameObject);
            return;
        }
        for (int i = gameObject.flags * 626811319; i <= gameObject.startY * -1242897449; ++i) {
            for (int j = gameObject.field2271 * 2004902003; j <= gameObject.orientation * -80616117; ++j) {
                final Tile tile = scene.tiles[gameObject.endX * -872547715][i][j];
                if (tile != null) {
                    for (int k = 0; k < tile.gameObjectsCount * -422028371; ++k) {
                        if (tile.gameObjects[k] == gameObject) {
                            final Tile tile2 = tile;
                            tile2.gameObjectsCount -= 1425915941;
                            for (int l = k; l < tile.gameObjectsCount * -422028371; ++l) {
                                tile.gameObjects[l] = tile.gameObjects[l + 1];
                                tile.gameObjectEdgeMasks[l] = tile.gameObjectEdgeMasks[l + 1];
                            }
                            tile.gameObjects[tile.gameObjectsCount * -422028371] = null;
                            break;
                        }
                    }
                    tile.gameObjectsEdgeMask = 0;
                    for (int n = 0; n < tile.gameObjectsCount * -422028371; ++n) {
                        final Tile tile3 = tile;
                        tile3.gameObjectsEdgeMask = (tile3.gameObjectsEdgeMask * -1639156513 | tile.gameObjectEdgeMasks[n]) * -1238612193;
                    }
                }
            }
        }
    }
    
    public static int ty(final class314 class314) {
        return class379.yh(class314.field2851, 785448473);
    }
    
    boolean newGameObject(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Renderable renderable, final int n9, final boolean b, final long n10, final int n11) {
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n3; j < n3 + n5; ++j) {
                if (i < 0 || j < 0 || i >= this.xSize || j >= this.ySize) {
                    return false;
                }
                final Tile tile = this.tiles[n][i][j];
                if (tile != null && tile.gameObjectsCount * -422028371 >= 5) {
                    return false;
                }
            }
        }
        final GameObject gameObject = new GameObject();
        gameObject.tag = n10 * 8415652607842018777L;
        gameObject.centerY = n11 * 1038925846;
        gameObject.endX = n * -1695101227;
        gameObject.endY = n6 * -299460585;
        gameObject.centerX = n7 * -521982365;
        gameObject.plane = n8 * 1244562195;
        gameObject.renderable = renderable;
        gameObject.lastDrawn = n9 * -1843325159;
        gameObject.flags = n2 * 843140103;
        gameObject.field2271 = n3 * -700889925;
        gameObject.startY = (n2 + n4 - 1) * 1300873191;
        gameObject.orientation = (n3 + n5 - 1) * 1392281520;
        for (int k = n2; k < n2 + n4; ++k) {
            for (int l = n3; l < n3 + n5; ++l) {
                int n12 = 0;
                if (k > n2) {
                    ++n12;
                }
                if (k < n2 + n4 - 1) {
                    n12 += 4;
                }
                if (l > n3) {
                    n12 += 8;
                }
                if (l < n3 + n5 - 1) {
                    n12 += 2;
                }
                for (int n13 = n; n13 >= 0; --n13) {
                    if (this.tiles[n13][k][l] == null) {
                        this.tiles[n13][k][l] = new Tile(n13, k, l);
                    }
                }
                final Tile tile2 = this.tiles[n][k][l];
                tile2.gameObjects[tile2.gameObjectsCount * 1046194590] = gameObject;
                tile2.gameObjectEdgeMasks[tile2.gameObjectsCount * -422028371] = n12;
                final Tile tile3 = tile2;
                tile3.gameObjectsEdgeMask = (tile3.gameObjectsEdgeMask * -1639156513 | n12) * 498115489;
                final Tile tile4 = tile2;
                tile4.gameObjectsCount += 1425915941;
            }
        }
        if (b) {
            this.tempGameObjects[this.tempGameObjectsCount++] = gameObject;
        }
        return true;
    }
    
    public void fi(final int scene_selectedPlane, final int scene_selectedScreenX, final int scene_selectedScreenY, final boolean viewportWalking) {
        if (shouldSendWalk() && !viewportWalking) {
            return;
        }
        Scene.checkClick = true;
        Scene.viewportWalking = viewportWalking;
        Scene.Scene_selectedPlane = scene_selectedPlane;
        Scene.Scene_selectedScreenX = scene_selectedScreenX;
        Scene.Scene_selectedScreenY = scene_selectedScreenY;
        Scene.Scene_selectedX = -1;
        Scene.Scene_selectedY = -1;
    }
    
    public WallDecoration dy(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return null;
        }
        return tile.wallDecoration;
    }
    
    public void lm(final int n, final int n2, final int n3, final int n4, final int n5, final Renderable renderable, final int n6, final long n7, final boolean b) {
        this.drawEntity(n, n2, n3, n4, n5, renderable, n6, n7, b);
    }
    
    public void fx(final int n, final int n2, final int n3, final boolean b) {
        this.menuOpen(n, n2, n3, b);
    }
    
    public static boolean fx() {
        return Scene.viewportWalking && Scene.Scene_selectedX != -1;
    }
    
    boolean method1271(final int n, final int n2, final int n3, final int n4) {
        if (!this.method1237(n, n2, n3)) {
            return false;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        final int n7 = this.tileHeights[n][n2][n3] - 1;
        final int n8 = n7 - 120;
        final int n9 = n7 - 230;
        final int n10 = n7 - 238;
        if (n4 < 16) {
            if (n4 == 1) {
                if (n5 > Scene.Scene_cameraX) {
                    if (!this.method1273(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6) && this.method1273(n5, n9, n6 + 128);
            }
            if (n4 == 2) {
                if (n6 < Scene.Scene_cameraZ) {
                    if (!this.method1273(n5, n7, n6 + 128)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6 + 128)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6 + 128) && this.method1273(n5 + 128, n9, n6 + 128);
            }
            if (n4 == 4) {
                if (n5 < Scene.Scene_cameraX) {
                    if (!this.method1273(n5 + 128, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5 + 128, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5 + 128, n9, n6) && this.method1273(n5 + 128, n9, n6 + 128);
            }
            if (n4 == 8) {
                if (n6 > Scene.Scene_cameraZ) {
                    if (!this.method1273(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n7, n6)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n8, n6)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6) && this.method1273(n5 + 128, n9, n6);
            }
        }
        if (!this.method1273(n5 + 64, n10, n6 + 64)) {
            return false;
        }
        if (n4 == 16) {
            return this.method1273(n5, n9, n6 + 128);
        }
        if (n4 == 32) {
            return this.method1273(n5 + 128, n9, n6 + 128);
        }
        if (n4 == 64) {
            return this.method1273(n5 + 128, n9, n6);
        }
        return n4 != 128 || this.method1273(n5, n9, n6);
    }
    
    public void py(final int n, final int n2) {
        this.setLinkBelow(n, n2);
    }
    
    public long getBoundaryObjectTag(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null || tile.boundaryObject == null) {
            return 0L;
        }
        return tile.boundaryObject.tag * -4009183385476919801L;
    }
    
    public void method1274(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        tile.itemLayer = null;
    }
    
    public void removeBoundaryObject(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n2 && gameObject.field2271 * 2004902003 == n3) {
                this.removeGameObject(gameObject);
                return;
            }
        }
    }
    
    public FloorDecoration getFloorDecoration(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.floorDecoration != null) {
            return tile.floorDecoration;
        }
        return null;
    }
    
    public static void Scene_buildVisiblityMap(final int[] array, final int n, final int n2, final int scene_viewportXMax, final int scene_viewportYMax) {
        Scene.Scene_viewportXMin = 0;
        Scene.Scene_viewportYMin = 0;
        Scene.Scene_viewportXMax = scene_viewportXMax;
        Scene.Scene_viewportYMax = scene_viewportYMax;
        Scene.Scene_viewportXCenter = scene_viewportXMax / 2;
        Scene.Scene_viewportYCenter = scene_viewportYMax / 2;
        final boolean[][][][] array2 = new boolean[array.length][32][53][53];
        for (int i = 128; i <= 383; i += 32) {
            for (int j = 0; j < 2048; j += 64) {
                Scene.Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[i];
                Scene.Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[i];
                Scene.Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[j];
                Scene.Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[j];
                final int n3 = (i - 128) / 32;
                final int n4 = j / 64;
                for (int k = -26; k < 26; ++k) {
                    for (int l = -26; l < 26; ++l) {
                        final int n5 = k * 128;
                        final int n6 = l * 128;
                        boolean b = false;
                        for (int n7 = -n; n7 <= n2; n7 += 128) {
                            if (method1286(n5, array[n3] + n7, n6)) {
                                b = true;
                                break;
                            }
                        }
                        array2[n3][n4][k + 25 + 1][l + 25 + 1] = b;
                    }
                }
            }
        }
        for (int n8 = 0; n8 < 8; ++n8) {
            for (int n9 = 0; n9 < 32; ++n9) {
                for (int n10 = -25; n10 < 25; ++n10) {
                    for (int n11 = -25; n11 < 25; ++n11) {
                        boolean b2 = false;
                    Label_0113:
                        for (int n12 = -1; n12 <= 1; ++n12) {
                            for (int n13 = -1; n13 <= 1; ++n13) {
                                if (array2[n8][n9][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0113;
                                }
                                if (array2[n8][(n9 + 1) % 31][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0113;
                                }
                                if (array2[n8 + 1][n9][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0113;
                                }
                                if (array2[n8 + 1][(n9 + 1) % 31][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0113;
                                }
                            }
                        }
                        Scene.visibilityMap[n8][n9][n10 + 25][n11 + 25] = b2;
                    }
                }
            }
        }
    }
    
    public static void cm(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final Occluder occluder = new Occluder();
        occluder.minTileX = n3 / 1524129845 * 2125806217;
        occluder.maxTileX = n4 / 128 * -2141622931;
        occluder.minTileY = n5 / 197075732 * 504400698;
        occluder.maxTileY = n6 / -717087822 * -181559381;
        occluder.type = n2 * -1065960575;
        occluder.minX = n3 * 2126671529;
        occluder.maxX = n4 * 502296058;
        occluder.minZ = n5 * 1924352080;
        occluder.maxZ = n6 * 495746131;
        occluder.minY = n7 * 484712818;
        occluder.maxY = n8 * -1329473239;
        Scene.Scene_planeOccluders[n][Scene.Scene_planeOccluderCounts[n]++] = occluder;
    }
    
    public void draw(int n, final int cameraYawTarget, int n2, int n3, final int n4, final int n5) {
        if (Client.rz != null) {
            Client.uw = 0;
            Client.rz.drawScene(n, cameraYawTarget, n2, n3, n4, n5);
        }
        final boolean inInstancedRegion = ScriptFrame.client.isInInstancedRegion();
        final boolean menuOpen = ScriptFrame.client.isMenuOpen();
        final boolean zz = ScriptFrame.client.zz();
        if (!zz && !menuOpen) {
            this.menuOpen(ScriptFrame.client.getScale(), ScriptFrame.client.wk() - ScriptFrame.client.getKeyboardIdleTicks(), ScriptFrame.client.nf() - ScriptFrame.client.nt(), false);
        }
        if (!inInstancedRegion && Client.bg != 0) {
            ScriptFrame.client.wi(ScriptFrame.client.rc(), ScriptFrame.client.getCenterX(), ScriptFrame.client.get3dZoom(), ScriptFrame.client.getCameraX2(), Client.wd);
        }
        final int minLevel = this.getMinLevel();
        final int minLevel2 = this.getMinLevel();
        final int minLevel3 = this.getMinLevel();
        final int baseY = this.getBaseY();
        final Tile[][][] je = this.je();
        final int n6 = inInstancedRegion ? Scene.eu : 25;
        if (n < 0) {
            n = 0;
        }
        else if (n >= minLevel * 128) {
            n = minLevel * 128 - 1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        else if (n2 >= minLevel3 * 128) {
            n2 = minLevel3 * 128 - 1;
        }
        int n7;
        if ((n7 = n3) < 128) {
            n3 = 128;
        }
        else if (n3 > 383) {
            n3 = 383;
        }
        if (!Client.eh) {
            n7 = n3;
        }
        ScriptFrame.client.is(ScriptFrame.client.by() + 1);
        ScriptFrame.client.vr(Perspective.SINE[n7]);
        ScriptFrame.client.lu(Perspective.COSINE[n7]);
        ScriptFrame.client.os(Perspective.SINE[n4]);
        ScriptFrame.client.mr(Perspective.COSINE[n4]);
        final int[][][] tileHeights = ScriptFrame.client.getTileHeights();
        final boolean[][] renderArea = ScriptFrame.client.kj()[(n3 - 128) / 32][n4 / 64];
        ScriptFrame.client.setRenderArea(renderArea);
        ScriptFrame.client.nb(n);
        ScriptFrame.client.setCameraYawTarget(cameraYawTarget);
        ScriptFrame.client.vu(n2);
        final int n8 = n / 128;
        final int n9 = n2 / 128;
        ScriptFrame.client.qx(n8);
        ScriptFrame.client.tb(n9);
        ScriptFrame.client.ui(n5);
        int n10 = n8 - n6;
        if (n10 < 0) {
            n10 = 0;
        }
        int n11 = n9 - n6;
        if (n11 < 0) {
            n11 = 0;
        }
        int skyboxColor = n8 + n6;
        if (skyboxColor > minLevel) {
            skyboxColor = minLevel;
        }
        int n12 = n9 + n6;
        if (n12 > minLevel3) {
            n12 = minLevel3;
        }
        ScriptFrame.client.iq(n10);
        ScriptFrame.client.we(n11);
        ScriptFrame.client.setSkyboxColor(skyboxColor);
        ScriptFrame.client.lu(n12);
        this.fp();
        ScriptFrame.client.jj(0);
        if (this.yw != 0) {
            this.sw.clear();
            final Player pt = ScriptFrame.client.pt();
            if (pt != null && (this.yw & 0x1) != 0x0) {
                final LocalPoint localLocation = pt.getLocalLocation();
                if (localLocation.isInScene()) {
                    this.sw.add(this.om[ScriptFrame.client.co()][localLocation.getSceneX()][localLocation.getSceneY()]);
                }
            }
            if (Scene.Scene_selectedX >= 0 && Scene.eb < 104 && Scene.Scene_selectedX >= 0 && Scene.eb < 104 && (this.iq & 0x2) != 0x0) {
                this.sw.add(this.jr[ScriptFrame.client.getCameraX()][Scene.eu][Scene.og]);
            }
            final LocalPoint localDestinationLocation = ScriptFrame.client.getLocalDestinationLocation();
            if (localDestinationLocation != null && localDestinationLocation.isInScene() && (this.zc & 0x4) != 0x0) {
                this.sw.add(this.jr[ScriptFrame.client.wn()][localDestinationLocation.getSceneX()][localDestinationLocation.getSceneY()]);
            }
            if (ScriptFrame.client.qe() < 310 && (this.yw & 0x8) != 0x0 && pt != null) {
                final int x = pt.getRunAnimation() >> 7;
                final int x2 = pt.fr() >> 7;
                int y = ScriptFrame.client.sn() >> 7;
                int y2 = ScriptFrame.client.gq() >> 7;
                if (x >= 0 && x2 >= 0 && y >= 0 && y2 >= 0 && x < 104 && x2 < 104 && y < 104 && y2 < 104) {
                    final int abs = Math.abs(x - y);
                    final int compare = Integer.compare(x, y);
                    final int n13 = -Math.abs(x2 - y2);
                    final int compare2 = Integer.compare(x2, y2);
                    int n14 = abs + n13;
                    while (y != x || y2 != x2) {
                        if (mw(ScriptFrame.client.getEnergy(), y, y2)) {
                            this.sw.add(this.jr[ScriptFrame.client.getOculusOrbFocalPointX()][y][y2]);
                        }
                        if (2 * n14 >= n13) {
                            n14 += n13;
                            y += compare;
                        }
                        else {
                            n14 += abs;
                            y2 += compare2;
                        }
                    }
                }
            }
        }
        if (!zz) {
            Scene.Scene_selectedY = (Scene.Scene_selectedY = -1);
        }
        for (int i = baseY; i < minLevel2; ++i) {
            final Tile[][] array = je[i];
            for (int j = n10; j < skyboxColor; ++j) {
                for (int k = n11; k < n12; ++k) {
                    final Tile tile = array[j][k];
                    if (tile != null) {
                        final int l = this.om[ScriptFrame.client.vv()][j][k];
                        if ((tile.getPlane() <= n5 || this.yw != 0) && (inInstancedRegion || renderArea[j - n8 + 25][k - n9 + 25] || tileHeights[i][j][k] - cameraYawTarget >= 2000) && (this.zc == 0 || ScriptFrame.client.co() >= tile.getPlane() || l == 0 || !this.sw.contains(l))) {
                            tile.yz(true);
                            tile.lc(true);
                            tile.he(true);
                            ScriptFrame.client.eo(ScriptFrame.client.kill0() + 1);
                        }
                        else {
                            tile.yz(false);
                            tile.he(false);
                            tile.ac(0);
                        }
                    }
                }
            }
        }
        for (int n15 = baseY; n15 < minLevel2; ++n15) {
            final Tile[][] array2 = je[n15];
            for (int n16 = -n6; n16 <= 0; ++n16) {
                final int n17 = n16 + n8;
                final int n18 = n8 - n16;
                if (n17 >= n10 || n18 < skyboxColor) {
                    for (int n19 = -n6; n19 <= 0; ++n19) {
                        final int n20 = n19 + n9;
                        final int n21 = n9 - n19;
                        if (n17 >= n10) {
                            if (n20 >= n11) {
                                final Tile tile2 = array2[n17][n20];
                                if (tile2 != null && tile2.cf()) {
                                    this.ha((net.runelite.api.Tile)tile2, true);
                                }
                            }
                            if (n21 < n12) {
                                final Tile tile3 = array2[n17][n21];
                                if (tile3 != null && tile3.cf()) {
                                    this.ha((net.runelite.api.Tile)tile3, true);
                                }
                            }
                        }
                        if (n18 < skyboxColor) {
                            if (n20 >= n11) {
                                final Tile tile4 = array2[n18][n20];
                                if (tile4 != null && tile4.cf()) {
                                    this.ha((net.runelite.api.Tile)tile4, true);
                                }
                            }
                            if (n21 < n12) {
                                final Tile tile5 = array2[n18][n21];
                                if (tile5 != null && tile5.mn()) {
                                    this.ha((net.runelite.api.Tile)tile5, true);
                                }
                            }
                        }
                        if (ScriptFrame.client.yg() == 0) {
                            ScriptFrame.client.setMinimapZoom(false);
                            ScriptFrame.client.getCallbacks().drawScene();
                            final DrawCallbacks drawCallbacks = ScriptFrame.client.getDrawCallbacks();
                            if (drawCallbacks != null) {
                                drawCallbacks.postDrawScene();
                            }
                            return;
                        }
                    }
                }
            }
        }
    Label_1895:
        for (int n22 = baseY; n22 < minLevel2; ++n22) {
            final Tile[][] array3 = je[n22];
            for (int n23 = -n6; n23 <= 0; ++n23) {
                final int n24 = n23 + n8;
                final int n25 = n8 - n23;
                if (n24 >= n10 || n25 < skyboxColor) {
                    for (int n26 = -n6; n26 <= 0; ++n26) {
                        final int n27 = n26 + n9;
                        final int n28 = n9 - n26;
                        if (n24 >= n10) {
                            if (n27 >= n11) {
                                final Tile tile6 = array3[n24][n27];
                                if (tile6 != null && tile6.cf()) {
                                    this.ha((net.runelite.api.Tile)tile6, false);
                                }
                            }
                            if (n28 < n12) {
                                final Tile tile7 = array3[n24][n28];
                                if (tile7 != null && tile7.cf()) {
                                    this.ha((net.runelite.api.Tile)tile7, false);
                                }
                            }
                        }
                        if (n25 < skyboxColor) {
                            if (n27 >= n11) {
                                final Tile tile8 = array3[n25][n27];
                                if (tile8 != null && tile8.cf()) {
                                    this.ha((net.runelite.api.Tile)tile8, false);
                                }
                            }
                            if (n28 < n12) {
                                final Tile tile9 = array3[n25][n28];
                                if (tile9 != null && tile9.cf()) {
                                    this.ha((net.runelite.api.Tile)tile9, false);
                                }
                            }
                        }
                        if (ScriptFrame.client.sl() == 0) {
                            break Label_1895;
                        }
                    }
                }
            }
        }
        ScriptFrame.client.setStretchedIntegerScaling(false);
        ScriptFrame.client.getCallbacks().drawScene();
        final DrawCallbacks drawCallbacks2 = ScriptFrame.client.getDrawCallbacks();
        if (drawCallbacks2 != null) {
            drawCallbacks2.postDrawScene();
        }
    }
    
    public void cg(final int n, final int n2, final int n3, final int n4) {
        if (this.tiles[n][n2][n3] == null) {
            return;
        }
        this.tiles[n][n2][n3].minPlane = n4 * -2078731195;
    }
    
    public void co(final int n, final int n2, final int n3, final int n4, final Renderable renderable1, final Renderable renderable2, final int n5, final int n6, final long n7, final int n8) {
        if (renderable1 == null && renderable2 == null) {
            return;
        }
        final BoundaryObject boundaryObject = new BoundaryObject();
        boundaryObject.tag = n7 * -1417919518333993033L;
        boundaryObject.orientationA = n8 * -2009432563;
        boundaryObject.flags = n2 * 636049255 + 1429390400;
        boundaryObject.flags = n3 * 937743245 + 215255360;
        boundaryObject.y = n4 * 1266004207;
        boundaryObject.renderable1 = renderable1;
        boundaryObject.renderable2 = renderable2;
        boundaryObject.orientationA = n5 * 1547196561;
        boundaryObject.y = n6 * -1139747265;
        for (int i = n; i >= 0; --i) {
            if (this.tiles[i][n2][n3] == null) {
                this.tiles[i][n2][n3] = new Tile(i, n2, n3);
            }
        }
        this.tiles[n][n2][n3].boundaryObject = boundaryObject;
    }
    
    void fg(final SceneTileModel sceneTileModel, final int n, final int n2, final int n3, final int n4, final int scene_selectedX, final int scene_selectedY) {
        for (int length = sceneTileModel.triangleColorB.length, i = 0; i < length; ++i) {
            final int n5 = sceneTileModel.triangleColorB[i] - Scene.Scene_cameraX;
            final int n6 = sceneTileModel.faceZ[i] - Scene.Scene_cameraY;
            final int n7 = sceneTileModel.triangleTextureId[i] - Scene.Scene_cameraZ;
            final int n8 = n7 * n3 + n5 * n4 >> 16;
            final int n9 = n7 * n4 - n5 * n3 >> 16;
            final int n10 = n8;
            final int n11 = n6 * n2 - n9 * n >> 16;
            final int n12 = n6 * n + n9 * n2 >> 16;
            final int n13 = n11;
            if (n12 < 50) {
                return;
            }
            if (sceneTileModel.triangleColorC != null) {
                SceneTileModel.field2124[i] = n10;
                SceneTileModel.field2125[i] = n13;
                SceneTileModel.field2108[i] = n12;
            }
            SceneTileModel.field2121[i] = TaskHandler.getClipMidX(-2030893510) + n10 * UserComparator7.get3dZoom(-1369842847) / n12;
            SceneTileModel.field2122[i] = class12.getClipMidY(-1727995587) + n13 * UserComparator7.get3dZoom(1294464123) / n12;
            SceneTileModel.field2123[i] = NPC.method609(n12, -89060155);
        }
        Rasterizer3D.clips.field2225 = 0;
        for (int length2 = sceneTileModel.vertexZ.length, j = 0; j < length2; ++j) {
            final int n14 = sceneTileModel.vertexZ[j];
            final int n15 = sceneTileModel.faceX[j];
            final int n16 = sceneTileModel.faceY[j];
            final int n17 = SceneTileModel.field2121[n14];
            final int n18 = SceneTileModel.field2121[n15];
            final int n19 = SceneTileModel.field2121[n16];
            final int n20 = SceneTileModel.field2122[n14];
            final int n21 = SceneTileModel.field2122[n15];
            final int n22 = SceneTileModel.field2122[n16];
            final float n23 = SceneTileModel.field2123[n14];
            final float n24 = SceneTileModel.field2123[n15];
            final float n25 = SceneTileModel.field2123[n16];
            if ((n17 - n18) * (n22 - n21) - (n20 - n21) * (n19 - n18) > 0) {
                Rasterizer3D.clips.field2234 = false;
                final int method20 = class6.method20(561148198);
                if (n17 < 0 || n18 < 0 || n19 < 0 || n17 > method20 || n18 > method20 || n19 > method20) {
                    Rasterizer3D.clips.field2234 = true;
                }
                if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n20, n21, n22, n17, n18, n19)) {
                    Scene.Scene_selectedX = scene_selectedX;
                    Scene.Scene_selectedY = scene_selectedY;
                }
                if (sceneTileModel.triangleColorC != null && sceneTileModel.triangleColorC[j] != -1) {
                    if (!Scene.Scene_isLowDetail) {
                        if (sceneTileModel.field2114) {
                            FloorDecoration.method1210(n20, n21, n22, n17, n18, n19, n23, n24, n25, sceneTileModel.vertexX[j], sceneTileModel.vertexY[j], sceneTileModel.triangleColorA[j], SceneTileModel.field2124[0], SceneTileModel.field2124[1], SceneTileModel.field2124[3], SceneTileModel.field2125[0], SceneTileModel.field2125[1], SceneTileModel.field2125[3], SceneTileModel.field2108[0], SceneTileModel.field2108[1], SceneTileModel.field2108[3], sceneTileModel.triangleColorC[j], (byte)12);
                        }
                        else {
                            FloorDecoration.method1210(n20, n21, n22, n17, n18, n19, n23, n24, n25, sceneTileModel.vertexX[j], sceneTileModel.vertexY[j], sceneTileModel.triangleColorA[j], SceneTileModel.field2124[n14], SceneTileModel.field2124[n15], SceneTileModel.field2124[n16], SceneTileModel.field2125[n14], SceneTileModel.field2125[n15], SceneTileModel.field2125[n16], SceneTileModel.field2108[n14], SceneTileModel.field2108[n15], SceneTileModel.field2108[n16], sceneTileModel.triangleColorC[j], (byte)12);
                        }
                    }
                    else {
                        final int averageTextureRGB = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTileModel.triangleColorC[j], -1767337945);
                        BoundaryObject.method1379(n20, n21, n22, n17, n18, n19, n23, n24, n25, method1268(averageTextureRGB, sceneTileModel.vertexX[j]), method1268(averageTextureRGB, sceneTileModel.vertexY[j]), method1268(averageTextureRGB, sceneTileModel.triangleColorA[j]), -428480375);
                    }
                }
                else if (sceneTileModel.vertexX[j] != 12345678) {
                    BoundaryObject.method1379(n20, n21, n22, n17, n18, n19, n23, n24, n25, sceneTileModel.vertexX[j], sceneTileModel.vertexY[j], sceneTileModel.triangleColorA[j], -428480375);
                }
            }
        }
    }
    
    public void cy(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20) {
        if (n4 == 0) {
            final SceneTilePaint paint = new SceneTilePaint(n11, n12, n13, n14, -1, n19, false);
            for (int i = n; i >= 0; --i) {
                if (this.tiles[i][n2][n3] == null) {
                    this.tiles[i][n2][n3] = new Tile(i, n2, n3);
                }
            }
            this.tiles[n][n2][n3].paint = paint;
            return;
        }
        if (n4 == 1) {
            final SceneTilePaint paint2 = new SceneTilePaint(n15, n16, n17, n18, n6, n20, n7 == n8 && n7 == n9 && n7 == n10);
            for (int j = n; j >= 0; --j) {
                if (this.tiles[j][n2][n3] == null) {
                    this.tiles[j][n2][n3] = new Tile(j, n2, n3);
                }
            }
            this.tiles[n][n2][n3].paint = paint2;
            return;
        }
        final SceneTileModel model = new SceneTileModel(n4, n5, n6, n2, n3, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
        for (int k = n; k >= 0; --k) {
            if (this.tiles[k][n2][n3] == null) {
                this.tiles[k][n2][n3] = new Tile(k, n2, n3);
            }
        }
        this.tiles[n][n2][n3].model = model;
    }
    
    public long er(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null || tile.floorDecoration == null) {
            return 0L;
        }
        return tile.floorDecoration.tag * 3423223696102332293L;
    }
    
    boolean gy(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n2 == n3 && n4 == n5) {
            if (!this.method1237(n, n2, n4)) {
                return false;
            }
            final int n7 = n2 << 7;
            final int n8 = n4 << 7;
            return this.method1273(n7 + 1, this.tileHeights[n][n2][n4] - n6, n8 + 1) && this.method1273(n7 + 128 - 1, this.tileHeights[n][n2 + 1][n4] - n6, n8 + 1) && this.method1273(n7 + 128 - 1, this.tileHeights[n][n2 + 1][n4 + 1] - n6, n8 + 128 - 1) && this.method1273(n7 + 1, this.tileHeights[n][n2][n4 + 1] - n6, n8 + 128 - 1);
        }
        else {
            for (int i = n2; i <= n3; ++i) {
                for (int j = n4; j <= n5; ++j) {
                    if (this.field2020[n][i][j] == -Scene.Scene_drawnCount) {
                        return false;
                    }
                }
            }
            final int n9 = (n2 << 7) + 1;
            final int n10 = (n4 << 7) + 2;
            final int n11 = this.tileHeights[n][n2][n4] - n6;
            if (!this.method1273(n9, n11, n10)) {
                return false;
            }
            final int n12 = (n3 << 7) - 1;
            if (!this.method1273(n12, n11, n10)) {
                return false;
            }
            final int n13 = (n5 << 7) - 1;
            return this.method1273(n9, n11, n13) && this.method1273(n12, n11, n13);
        }
    }
    
    boolean gw(final int n, final int n2, final int n3) {
        for (int i = 0; i < Scene.Scene_currentOccludersCount; ++i) {
            final Occluder occluder = Scene.Scene_currentOccluders[i];
            if (occluder.field2092 * -221071853 == 1) {
                final int n4 = occluder.minX * -1074260583 - n;
                if (n4 > 0) {
                    final int n5 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n4 >> 8);
                    final int n6 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n4 >> 8);
                    final int n7 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n4 >> 8);
                    final int n8 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n4 >> 8);
                    if (n3 >= n5 && n3 <= n6 && n2 >= n7 && n2 <= n8) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 2) {
                final int n9 = n - occluder.minX * -1074260583;
                if (n9 > 0) {
                    final int n10 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n9 >> 8);
                    final int n11 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n9 >> 8);
                    final int n12 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n9 >> 8);
                    final int n13 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n9 >> 8);
                    if (n3 >= n10 && n3 <= n11 && n2 >= n12 && n2 <= n13) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 3) {
                final int n14 = occluder.minZ * -1443747699 - n3;
                if (n14 > 0) {
                    final int n15 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n14 >> 8);
                    final int n16 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n14 >> 8);
                    final int n17 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n14 >> 8);
                    final int n18 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n14 >> 8);
                    if (n >= n15 && n <= n16 && n2 >= n17 && n2 <= n18) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 4) {
                final int n19 = n3 - occluder.minZ * -1443747699;
                if (n19 > 0) {
                    final int n20 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n19 >> 8);
                    final int n21 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n19 >> 8);
                    final int n22 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n19 >> 8);
                    final int n23 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n19 >> 8);
                    if (n >= n20 && n <= n21 && n2 >= n22 && n2 <= n23) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 5) {
                final int n24 = n2 - occluder.minY * 690846039;
                if (n24 > 0) {
                    final int n25 = occluder.minX * -1074260583 + (occluder.field2093 * 1498322871 * n24 >> 8);
                    final int n26 = occluder.maxX * -875468987 + (occluder.field2094 * 542133003 * n24 >> 8);
                    final int n27 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n24 >> 8);
                    final int n28 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1030915821 * n24 >> 8);
                    if (n >= n25 && n <= n26 && n3 >= n27 && n3 <= n28) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    boolean gh(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n2 == n3 && n4 == n5) {
            if (!this.method1237(n, n2, n4)) {
                return false;
            }
            final int n7 = n2 << 7;
            final int n8 = n4 << 7;
            return this.method1273(n7 + 1, this.tileHeights[n][n2][n4] - n6, n8 + 1) && this.method1273(n7 + 128 - 1, this.tileHeights[n][n2 + 1][n4] - n6, n8 + 1) && this.method1273(n7 + 128 - 1, this.tileHeights[n][n2 + 1][n4 + 1] - n6, n8 + 128 - 1) && this.method1273(n7 + 1, this.tileHeights[n][n2][n4 + 1] - n6, n8 + 128 - 1);
        }
        else {
            for (int i = n2; i <= n3; ++i) {
                for (int j = n4; j <= n5; ++j) {
                    if (this.field2020[n][i][j] == -Scene.Scene_drawnCount) {
                        return false;
                    }
                }
            }
            final int n9 = (n2 << 7) + 1;
            final int n10 = (n4 << 7) + 2;
            final int n11 = this.tileHeights[n][n2][n4] - n6;
            if (!this.method1273(n9, n11, n10)) {
                return false;
            }
            final int n12 = (n3 << 7) - 1;
            if (!this.method1273(n12, n11, n10)) {
                return false;
            }
            final int n13 = (n5 << 7) - 1;
            return this.method1273(n9, n11, n13) && this.method1273(n12, n11, n13);
        }
    }
    
    public static void jj(final Scene scene, final int n, final int n2, final int n3, final int n4, final Renderable renderable, final long n5, final int n6) {
        if (scene == null) {
            scene.method1237(n, n, n);
        }
        if (renderable == null) {
            return;
        }
        final FloorDecoration floorDecoration = new FloorDecoration();
        floorDecoration.renderable = renderable;
        floorDecoration.x = n2 * -1191266432 - 595633216;
        floorDecoration.y = n3 * -136012928 - 68006464;
        floorDecoration.z = n4 * -317230161;
        floorDecoration.tag = n5 * -4945803534983804595L;
        floorDecoration.flags = n6 * 1624352991;
        if (scene.tiles[n][n2][n3] == null) {
            scene.tiles[n][n2][n3] = new Tile(n, n2, n3);
        }
        scene.tiles[n][n2][n3].floorDecoration = floorDecoration;
    }
    
    public void clear() {
        for (int i = 0; i < this.planes; ++i) {
            for (int j = 0; j < this.xSize; ++j) {
                for (int k = 0; k < this.ySize; ++k) {
                    this.tiles[i][j][k] = null;
                }
            }
        }
        for (int l = 0; l < Scene.Scene_planesCount; ++l) {
            for (int n = 0; n < Scene.Scene_planeOccluderCounts[l]; ++n) {
                Scene.Scene_planeOccluders[l][n] = null;
            }
            Scene.Scene_planeOccluderCounts[l] = 0;
        }
        for (int n2 = 0; n2 < this.tempGameObjectsCount; ++n2) {
            this.tempGameObjects[n2] = null;
        }
        this.tempGameObjectsCount = 0;
        for (int n3 = 0; n3 < Scene.gameObjects.length; ++n3) {
            Scene.gameObjects[n3] = null;
        }
    }
    
    public void setViewportWalking() {
        Scene.viewportWalking = true;
    }
    
    boolean gu(final int n, final int n2, final int n3, final int n4) {
        if (!this.method1237(n, n2, n3)) {
            return false;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        final int n7 = this.tileHeights[n][n2][n3] - 1;
        final int n8 = n7 - 120;
        final int n9 = n7 - 1056205855;
        final int n10 = n7 - 324690435;
        if (n4 < 16) {
            if (n4 == 1) {
                if (n5 > Scene.Scene_cameraX) {
                    if (!this.method1273(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6) && this.method1273(n5, n9, n6 + 128);
            }
            if (n4 == 2) {
                if (n6 < Scene.Scene_cameraZ) {
                    if (!this.method1273(n5, n7, n6 + 128)) {
                        return false;
                    }
                    if (!this.method1273(n5 - 1112408759, n7, n6 + 516483492)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6 + 618782039)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 1592484216, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6 - 1652405829) && this.method1273(n5 + 991734873, n9, n6 + 1739329841);
            }
            if (n4 == 4) {
                if (n5 < Scene.Scene_cameraX) {
                    if (!this.method1273(n5 + 128, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 - 158851238, n7, n6 - 564739077)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5 + 128, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 1652318526, n8, n6 + 128)) {
                        return false;
                    }
                }
                return this.method1273(n5 + 128, n9, n6) && this.method1273(n5 + 2103691965, n9, n6 + 377597831);
            }
            if (n4 == 8) {
                if (n6 > Scene.Scene_cameraZ) {
                    if (!this.method1273(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n7, n6)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method1273(n5, n8, n6)) {
                        return false;
                    }
                    if (!this.method1273(n5 + 128, n8, n6)) {
                        return false;
                    }
                }
                return this.method1273(n5, n9, n6) && this.method1273(n5 + 2056431234, n9, n6);
            }
        }
        if (!this.method1273(n5 + 64, n10, n6 + 64)) {
            return false;
        }
        if (n4 == 16) {
            return this.method1273(n5, n9, n6 + 128);
        }
        if (n4 == 1969228210) {
            return this.method1273(n5 + 677473693, n9, n6 + 128);
        }
        if (n4 == 341951978) {
            return this.method1273(n5 + 701299207, n9, n6);
        }
        return n4 != 110807593 || this.method1273(n5, n9, n6);
    }
    
    public static void qu(final NodeDeque nodeDeque, final Tile[][][] array, final int n, final int n2, final int n3) {
        if (n2 >= 0 && n2 < 104 && n3 >= 0 && n3 < 104) {
            final Tile tile = array[n][n2][n3];
            if (tile != null) {
                nodeDeque.rd(tile);
            }
        }
    }
    
    public void cz(final int n, final int n2, final int n3, final int n4, final Renderable renderable1, final Renderable renderable2, final int n5, final int n6, final long n7, final int n8) {
        if (renderable1 == null && renderable2 == null) {
            return;
        }
        final BoundaryObject boundaryObject = new BoundaryObject();
        boundaryObject.tag = n7 * -1417919518333993033L;
        boundaryObject.flags = n8 * -2009432563;
        boundaryObject.x = n2 * 636049255 + 1429390400;
        boundaryObject.y = n3 * 937743245 + 215255360;
        boundaryObject.z = n4 * 1266004207;
        boundaryObject.renderable1 = renderable1;
        boundaryObject.renderable2 = renderable2;
        boundaryObject.orientationA = n5 * 1547196561;
        boundaryObject.orientationB = n6 * -1139747265;
        for (int i = n; i >= 0; --i) {
            if (this.tiles[i][n2][n3] == null) {
                this.tiles[i][n2][n3] = new Tile(i, n2, n3);
            }
        }
        this.tiles[n][n2][n3].boundaryObject = boundaryObject;
    }
    
    public void dr() {
        for (int i = 0; i < this.tempGameObjectsCount; ++i) {
            this.removeGameObject(this.tempGameObjects[i]);
            this.tempGameObjects[i] = null;
        }
        this.tempGameObjectsCount = 0;
    }
    
    boolean ga(final int n, final int n2, final int n3, final int n4) {
        if (!this.method1237(n, n2, n3)) {
            return false;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        return this.method1273(n5 + 1, this.tileHeights[n][n2][n3] - n4, n6 + 1) && this.method1273(n5 + 128 - 1, this.tileHeights[n][n2 + 1][n3] - n4, n6 + 1) && this.method1273(n5 + 128 - 1, this.tileHeights[n][n2 + 1][n3 + 1] - n4, n6 + 128 - 1) && this.method1273(n5 + 1, this.tileHeights[n][n2][n3 + 1] - n4, n6 + 128 - 1);
    }
    
    public void addTile(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20) {
        if (n4 == 0) {
            final SceneTilePaint paint = new SceneTilePaint(n11, n12, n13, n14, -1, n19, false);
            for (int i = n; i >= 0; --i) {
                if (this.tiles[i][n2][n3] == null) {
                    this.tiles[i][n2][n3] = new Tile(i, n2, n3);
                }
            }
            this.tiles[n][n2][n3].paint = paint;
            return;
        }
        if (n4 == 1) {
            final SceneTilePaint paint2 = new SceneTilePaint(n15, n16, n17, n18, n6, n20, n7 == n8 && n7 == n9 && n7 == n10);
            for (int j = n; j >= 0; --j) {
                if (this.tiles[j][n2][n3] == null) {
                    this.tiles[j][n2][n3] = new Tile(j, n2, n3);
                }
            }
            this.tiles[n][n2][n3].paint = paint2;
            return;
        }
        final SceneTileModel model = new SceneTileModel(n4, n5, n6, n2, n3, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
        for (int k = n; k >= 0; --k) {
            if (this.tiles[k][n2][n3] == null) {
                this.tiles[k][n2][n3] = new Tile(k, n2, n3);
            }
        }
        this.tiles[n][n2][n3].model = model;
    }
    
    public void newFloorDecoration(final int n, final int n2, final int n3, final int n4, final Renderable renderable, final long n5, final int n6) {
        if (renderable != null) {
            final FloorDecoration vmethod1485 = ScriptFrame.client.vmethod1485();
            vmethod1485.ti(renderable);
            vmethod1485.ac(n2 * 128 + 64);
            vmethod1485.jy(n3 * 128 + 64);
            vmethod1485.ag(n4);
            vmethod1485.hm(n5);
            vmethod1485.mo(n6);
            Tile tile = this.tiles[n][n2][n3];
            if (tile == null) {
                tile = (this.tiles[n][n2][n3] = ScriptFrame.client.sj(n, n2, n3));
            }
            tile.setGroundObject((GroundObject)vmethod1485);
            int renderLevel = tile.getRenderLevel();
            if ((this.wb[1][n2][n3] & 0x2) == 0x2) {
                --renderLevel;
            }
            vmethod1485.sn(renderLevel);
            if (this.sg) {
                final GroundObjectSpawned groundObjectSpawned = new GroundObjectSpawned();
                groundObjectSpawned.setTile((net.runelite.api.Tile)tile);
                groundObjectSpawned.setGroundObject((GroundObject)vmethod1485);
                ScriptFrame.client.getCallbacks().post((Object)groundObjectSpawned);
            }
        }
    }
    
    public void removeFloorDecoration(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        tile.wallDecoration = null;
    }
    
    public void removeFloorDecoration(final Tile tile, final int n) {
        final Tile[][][] je = this.je();
        final NodeDeque dy = ScriptFrame.client.dy();
        dy.rd(tile);
        Tile tile2;
        while ((tile2 = (Tile)dy.uk()) != null) {
            final int up = tile2.up();
            final int ei = tile2.ei();
            final int plane = tile2.getPlane();
            if (this.jr[plane][up][ei] != 0) {
                continue;
            }
            if (mw(plane, up, ei)) {
                qu(dy, je, plane, up - 1, ei);
                qu(dy, je, plane, up + 1, ei);
                qu(dy, je, plane, up, ei - 1);
                qu(dy, je, plane, up, ei + 1);
                qu(dy, je, plane, up - 1, ei - 1);
                qu(dy, je, plane, up + 1, ei - 1);
                qu(dy, je, plane, up - 1, ei + 1);
                qu(dy, je, plane, up + 1, ei + 1);
            }
            this.jr[plane][up][ei] = n;
        }
    }
    
    public static void clearTempGameObjects(final Scene scene, final int scene_selectedPlane, final int scene_selectedScreenX, final int scene_selectedScreenY, final boolean viewportWalking) {
        if (scene == null) {
            scene.getGameObject(scene_selectedPlane, scene_selectedPlane, scene_selectedPlane);
        }
        if (shouldSendWalk() && !viewportWalking) {
            return;
        }
        Scene.checkClick = true;
        Scene.viewportWalking = viewportWalking;
        Scene.Scene_selectedPlane = scene_selectedPlane;
        Scene.Scene_selectedScreenX = scene_selectedScreenX;
        Scene.Scene_selectedScreenY = scene_selectedScreenY;
        Scene.Scene_selectedX = -1;
        Scene.Scene_selectedY = -1;
    }
    
    public void clearTempGameObjects() {
        for (int i = 0; i < this.tempGameObjectsCount; ++i) {
            final GameObject gameObject = this.tempGameObjects[i];
            this.removeGameObject((net.runelite.api.GameObject)gameObject);
            gameObject.ka(null);
        }
        this.tempGameObjectsCount = 0;
    }
    
    void occlude() {
        final int n = Scene.Scene_planeOccluderCounts[Scene.Scene_plane];
        final Occluder[] array = Scene.Scene_planeOccluders[Scene.Scene_plane];
        Scene.Scene_currentOccludersCount = 0;
        for (final Occluder occluder : array) {
            Label_1225: {
                if (occluder.type * -33717119 == 1) {
                    final int n2 = occluder.minTileX * -219522119 - Scene.Scene_cameraXTile + 90;
                    if (n2 >= 0) {
                        if (n2 <= 50) {
                            int j = occluder.minTileY * 1910687837 - Scene.Scene_cameraYTile + 90;
                            if (j < 0) {
                                j = 0;
                            }
                            int n3 = occluder.maxTileY * 506177633 - Scene.Scene_cameraYTile + 90;
                            if (n3 > 50) {
                                n3 = 50;
                            }
                            boolean b = false;
                            while (j <= n3) {
                                if (Scene.visibleTiles[n2][j++]) {
                                    b = true;
                                    break;
                                }
                            }
                            if (b) {
                                int n4 = Scene.Scene_cameraX - occluder.minX * -1074260583;
                                if (n4 > 32) {
                                    occluder.field2092 = 455574555;
                                }
                                else {
                                    if (n4 >= -32) {
                                        break Label_1225;
                                    }
                                    occluder.field2092 = 911149110;
                                    n4 = -n4;
                                }
                                occluder.field2096 = (occluder.minZ * -1443747699 - Scene.Scene_cameraZ << 8) / n4 * -220034745;
                                occluder.field2086 = (occluder.maxZ * 1383802843 - Scene.Scene_cameraZ << 8) / n4 * -1665480987;
                                occluder.field2083 = (occluder.minY * 690846039 - Scene.Scene_cameraY << 8) / n4 * -1186198099;
                                occluder.field2098 = (occluder.maxY * 1879954201 - Scene.Scene_cameraY << 8) / n4 * 628709121;
                                Scene.Scene_currentOccluders[Scene.Scene_currentOccludersCount++] = occluder;
                            }
                        }
                    }
                }
                else if (occluder.type * -33717119 == 2) {
                    final int n5 = occluder.minTileY * 1910687837 - Scene.Scene_cameraYTile + 90;
                    if (n5 >= 0) {
                        if (n5 <= 50) {
                            int k = occluder.minTileX * -219522119 - Scene.Scene_cameraXTile + 90;
                            if (k < 0) {
                                k = 0;
                            }
                            int n6 = occluder.maxTileX * -1873370011 - Scene.Scene_cameraXTile + 90;
                            if (n6 > 50) {
                                n6 = 50;
                            }
                            boolean b2 = false;
                            while (k <= n6) {
                                if (Scene.visibleTiles[k++][n5]) {
                                    b2 = true;
                                    break;
                                }
                            }
                            if (b2) {
                                int n7 = Scene.Scene_cameraZ - occluder.minZ * -1443747699;
                                if (n7 > 32) {
                                    occluder.field2092 = 1366723665;
                                }
                                else {
                                    if (n7 >= -32) {
                                        break Label_1225;
                                    }
                                    occluder.field2092 = 1822298220;
                                    n7 = -n7;
                                }
                                occluder.field2093 = (occluder.minX * -1074260583 - Scene.Scene_cameraX << 8) / n7 * -1619986937;
                                occluder.field2094 = (occluder.maxX * -875468987 - Scene.Scene_cameraX << 8) / n7 * 528722083;
                                occluder.field2083 = (occluder.minY * 690846039 - Scene.Scene_cameraY << 8) / n7 * -1186198099;
                                occluder.field2098 = (occluder.maxY * 1879954201 - Scene.Scene_cameraY << 8) / n7 * 628709121;
                                Scene.Scene_currentOccluders[Scene.Scene_currentOccludersCount++] = occluder;
                            }
                        }
                    }
                }
                else if (occluder.type * -33717119 == 4) {
                    final int n8 = occluder.minY * 690846039 - Scene.Scene_cameraY;
                    if (n8 > 128) {
                        int n9 = occluder.minTileY * 1910687837 - Scene.Scene_cameraYTile + 90;
                        if (n9 < 0) {
                            n9 = 0;
                        }
                        int n10 = occluder.maxTileY * 506177633 - Scene.Scene_cameraYTile + 90;
                        if (n10 > 50) {
                            n10 = 50;
                        }
                        if (n9 <= n10) {
                            int n11 = occluder.minTileX * -219522119 - Scene.Scene_cameraXTile + 90;
                            if (n11 < 0) {
                                n11 = 0;
                            }
                            int n12 = occluder.maxTileX * -1873370011 - Scene.Scene_cameraXTile + 90;
                            if (n12 > 50) {
                                n12 = 50;
                            }
                            boolean b3 = false;
                        Label_1076:
                            for (int l = n11; l <= n12; ++l) {
                                for (int n13 = n9; n13 <= n10; ++n13) {
                                    if (Scene.visibleTiles[l][n13]) {
                                        b3 = true;
                                        break Label_1076;
                                    }
                                }
                            }
                            if (b3) {
                                occluder.field2092 = -2017094521;
                                occluder.field2093 = (occluder.minX * -1074260583 - Scene.Scene_cameraX << 8) / n8 * -1619986937;
                                occluder.field2094 = (occluder.maxX * -875468987 - Scene.Scene_cameraX << 8) / n8 * 528722083;
                                occluder.field2096 = (occluder.minZ * -1443747699 - Scene.Scene_cameraZ << 8) / n8 * -220034745;
                                occluder.field2086 = (occluder.maxZ * 1383802843 - Scene.Scene_cameraZ << 8) / n8 * -1665480987;
                                Scene.Scene_currentOccluders[Scene.Scene_currentOccludersCount++] = occluder;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public GameObject ep(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return null;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * -920887576 == n2 && gameObject.field2271 * 541799336 == n3) {
                return gameObject;
            }
        }
        return null;
    }
    
    public void dg(final int n, final int n2, final int n3, final int n4) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        final WallDecoration wallDecoration = tile.wallDecoration;
        if (wallDecoration == null) {
            return;
        }
        wallDecoration.xOffset = wallDecoration.xOffset * 1353438721 * n4 / 16 * -1372050943;
        wallDecoration.yOffset = wallDecoration.yOffset * 1573434537 * n4 / 16 * -965136487;
    }
    
    void method1260(final ModelData modelData, final int n, final int n2, final int n3, final int n4, final int n5) {
        boolean b = true;
        int n6 = n2;
        final int n7 = n2 + n4;
        final int n8 = n3 - 1;
        final int n9 = n3 + n5;
        for (int i = n; i <= n + 1; ++i) {
            if (i != this.planes) {
                for (int j = n6; j <= n7; ++j) {
                    if (j >= 0) {
                        if (j < this.xSize) {
                            for (int k = n8; k <= n9; ++k) {
                                if (k >= 0) {
                                    if (k < this.ySize) {
                                        if (b && j < n7 && k < n9) {
                                            if (k >= n3) {
                                                continue;
                                            }
                                            if (j == n2) {
                                                continue;
                                            }
                                        }
                                        final Tile tile = this.tiles[i][j][k];
                                        if (tile != null) {
                                            final int n10 = (this.tileHeights[i][j][k] + this.tileHeights[i][j + 1][k] + this.tileHeights[i][j][k + 1] + this.tileHeights[i][j + 1][k + 1]) / 4 - (this.tileHeights[n][n2][n3] + this.tileHeights[n][n2 + 1][n3] + this.tileHeights[n][n2][n3 + 1] + this.tileHeights[n][n2 + 1][n3 + 1]) / 4;
                                            final BoundaryObject boundaryObject = tile.boundaryObject;
                                            if (boundaryObject != null) {
                                                if (boundaryObject.renderable1 instanceof ModelData) {
                                                    ModelData.method1198(modelData, (ModelData)boundaryObject.renderable1, (j - n2) * 128 + (1 - n4) * 64, n10, (k - n3) * 128 + (1 - n5) * 64, b);
                                                }
                                                if (boundaryObject.renderable2 instanceof ModelData) {
                                                    ModelData.method1198(modelData, (ModelData)boundaryObject.renderable2, (j - n2) * 128 + (1 - n4) * 64, n10, (k - n3) * 128 + (1 - n5) * 64, b);
                                                }
                                            }
                                            for (int l = 0; l < tile.gameObjectsCount * -422028371; ++l) {
                                                final GameObject gameObject = tile.gameObjects[l];
                                                if (gameObject != null && gameObject.renderable instanceof ModelData) {
                                                    ModelData.method1198(modelData, (ModelData)gameObject.renderable, (gameObject.flags * 626811319 - n2) * 128 + (gameObject.startY * -1242897449 - gameObject.flags * 626811319 + 1 - n4) * 64, n10, (gameObject.field2271 * 2004902003 - n3) * 128 + (gameObject.orientation * -80616117 - gameObject.field2271 * 2004902003 + 1 - n5) * 64, b);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --n6;
                b = false;
            }
        }
    }
    
    public static void zv(final Scene scene, final int n, final int n2, final int n3) {
        if (scene == null) {
            scene.dj(n, n, n);
        }
        final Tile tile = scene.tiles[n][n2][n3];
        if (tile != null) {
            final FloorDecoration hp = tile.hp();
            tile.setGroundObject(null);
            if (hp != null) {
                if (!Scene.fd && !scene.sg) {
                    throw new AssertionError();
                }
                final GroundObjectDespawned groundObjectDespawned = new GroundObjectDespawned();
                groundObjectDespawned.setTile((net.runelite.api.Tile)tile);
                groundObjectDespawned.setGroundObject((GroundObject)hp);
                ScriptFrame.client.getCallbacks().post((Object)groundObjectDespawned);
            }
        }
    }
    
    static boolean fu(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (n2 < n3 && n2 < n4 && n2 < n5) {
            return false;
        }
        if (n2 > n3 && n2 > n4 && n2 > n5) {
            return false;
        }
        if (n < n6 && n < n7 && n < n8) {
            return false;
        }
        if (n > n6 && n > n7 && n > n8) {
            return false;
        }
        final int n9 = (n2 - n3) * (n7 - n6) - (n - n6) * (n4 - n3);
        final int n10 = (n2 - n4) * (n8 - n7) - (n - n7) * (n5 - n4);
        final int n11 = (n2 - n5) * (n6 - n8) - (n - n8) * (n3 - n5);
        if (n9 != 0) {
            return (n9 < 0) ? (n10 <= 0 && n11 <= 0) : (n10 >= 0 && n11 >= 0);
        }
        return n10 == 0 || ((n10 < 0) ? (n11 <= 0) : (n11 >= 0));
    }
    
    public void qp(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        tile.boundaryObject = null;
    }
    
    public void vh() {
        final Callbacks callbacks = ScriptFrame.client.getCallbacks();
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 104; ++j) {
                for (int k = 0; k < 104; ++k) {
                    final Tile tile = this.tiles[i][j][k];
                    if (tile != null) {
                        final BoundaryObject ix = tile.ix();
                        if (ix != null) {
                            final WallObjectSpawned wallObjectSpawned = new WallObjectSpawned();
                            wallObjectSpawned.setTile((net.runelite.api.Tile)tile);
                            wallObjectSpawned.setWallObject((WallObject)ix);
                            callbacks.post((Object)wallObjectSpawned);
                        }
                        final WallDecoration ro = tile.ro();
                        if (ro != null) {
                            final DecorativeObjectSpawned decorativeObjectSpawned = new DecorativeObjectSpawned();
                            decorativeObjectSpawned.setTile((net.runelite.api.Tile)tile);
                            decorativeObjectSpawned.setDecorativeObject((DecorativeObject)ro);
                            callbacks.post((Object)decorativeObjectSpawned);
                        }
                        final FloorDecoration hp = tile.hp();
                        if (hp != null) {
                            final GroundObjectSpawned groundObjectSpawned = new GroundObjectSpawned();
                            groundObjectSpawned.setTile((net.runelite.api.Tile)tile);
                            groundObjectSpawned.setGroundObject((GroundObject)hp);
                            callbacks.post((Object)groundObjectSpawned);
                        }
                        for (final GameObject gameObject : tile.ys()) {
                            if (gameObject != null) {
                                final int ja = gameObject.ja();
                                final int qr = gameObject.qr();
                                if (ja == j && qr == k) {
                                    final GameObjectSpawned gameObjectSpawned = new GameObjectSpawned();
                                    gameObjectSpawned.setTile((net.runelite.api.Tile)tile);
                                    gameObjectSpawned.setGameObject((net.runelite.api.GameObject)gameObject);
                                    ScriptFrame.client.getCallbacks().post((Object)gameObjectSpawned);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static boolean iq(final Scene scene, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Renderable renderable, final int n9, final boolean b, final long n10, final int n11) {
        if (scene == null) {
            return scene.dw(n, n, n, n, n, n, n, n, renderable, n, b, n10, n);
        }
        if (!ScriptFrame.client.getCallbacks().draw((net.runelite.api.Renderable)renderable, false)) {
            ScriptFrame.client.wm()[n6 >> 7][n7 >> 7] = -1;
            return false;
        }
        for (int i = n2; i < n2 + n4; ++i) {
            for (int j = n3; j < n3 + n5; ++j) {
                if (i < 0 || j < 0 || i >= scene.xSize || j >= scene.ySize) {
                    return false;
                }
                final Tile tile = scene.tiles[n][i][j];
                if (tile != null && tile.ij() >= 5) {
                    return false;
                }
            }
        }
        GameObject ry;
        if (b) {
            ry = scene.tempGameObjects[scene.tempGameObjectsCount];
            if (ry == null) {
                final GameObject[] tempGameObjects = scene.tempGameObjects;
                final int tempGameObjectsCount = scene.tempGameObjectsCount;
                final GameObject ry2 = ScriptFrame.client.ry();
                tempGameObjects[tempGameObjectsCount] = ry2;
                ry = ry2;
            }
            ry.db(0);
            ry.on(0);
            ++scene.tempGameObjectsCount;
        }
        else {
            ry = ScriptFrame.client.ry();
        }
        ry.qh(n10);
        ry.jl(n11);
        ry.dy(n);
        ry.kv(n6);
        ry.ns(n7);
        ry.fa(n8);
        ry.ka(renderable);
        ry.co(n9);
        ry.yf(n2);
        ry.id(n3);
        ry.qt(n2 + n4 - 1);
        ry.ji(n3 + n5 - 1);
        for (int k = n2; k < n2 + n4; ++k) {
            for (int l = n3; l < n3 + n5; ++l) {
                int n12 = 0;
                if (k > n2) {
                    ++n12;
                }
                if (k < n2 + n4 - 1) {
                    n12 += 4;
                }
                if (l > n3) {
                    n12 += 8;
                }
                if (l < n3 + n5 - 1) {
                    n12 += 2;
                }
                for (int n13 = n; n13 >= 0; --n13) {
                    if (scene.tiles[n13][k][l] == null) {
                        scene.tiles[n13][k][l] = ScriptFrame.client.sj(n13, k, l);
                    }
                }
                final Tile tile2 = scene.tiles[n][k][l];
                final int ij = tile2.ij();
                tile2.ys()[ij] = ry;
                tile2.ad()[ij] = n12;
                tile2.xn(tile2.js() | n12);
                tile2.ac(ij + 1);
            }
        }
        final Tile tile3 = scene.tiles[n][n2][n3];
        if (!Scene.fd && tile3 == null) {
            throw new AssertionError();
        }
        int renderLevel = tile3.getRenderLevel();
        if ((scene.wb[1][n2][n3] & 0x2) == 0x2) {
            --renderLevel;
        }
        ry.uv(renderLevel);
        if (!b && scene.sg) {
            if (!Scene.fd && renderable instanceof Actor) {
                throw new AssertionError();
            }
            if (!Scene.fd && renderable instanceof Projectile) {
                throw new AssertionError();
            }
            if (!Scene.fd && renderable instanceof GraphicsObject) {
                throw new AssertionError();
            }
            Client.nw.trace("Game object spawn: {}", (Object)ry.getId());
            final GameObjectSpawned gameObjectSpawned = new GameObjectSpawned();
            gameObjectSpawned.setTile((net.runelite.api.Tile)scene.tiles[n][n2][n3]);
            gameObjectSpawned.setGameObject((net.runelite.api.GameObject)ry);
            ScriptFrame.client.getCallbacks().post((Object)gameObjectSpawned);
        }
        return true;
    }
    
    public void ol(final int n, final int n2, final int n3, final int n4, final Renderable renderable, final long n5, final Renderable renderable2, final Renderable renderable3) {
        final Tile tile = this.je()[n][n2][n3];
        if (tile != null) {
            final ItemLayer zc = tile.zc();
            if (zc != null) {
                zc.pr(n);
            }
        }
    }
    
    public int eg(final int n, final int n2, final int n3, final long n4) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return -1;
        }
        if (tile.boundaryObject != null && tile.boundaryObject.tag * -4009183385476919801L == n4) {
            return tile.boundaryObject.flags * 347144389 & 0xFF;
        }
        if (tile.wallDecoration != null && tile.wallDecoration.tag * -4691380879163567243L == n4) {
            return tile.wallDecoration.flags * 35030579 & 0xFF;
        }
        if (tile.floorDecoration != null && tile.floorDecoration.tag * 3423223696102332293L == n4) {
            return tile.floorDecoration.flags * -1486089441 & 0xFF;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            if (tile.gameObjects[i].tag * 5016412888503339625L == n4) {
                return tile.gameObjects[i].centerY * -72925475 & 0xFF;
            }
        }
        return -1;
    }
    
    public long ej(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.boundaryObject != null) {
            return tile.boundaryObject.tag * -4009183385476919801L;
        }
        return 0L;
    }
    
    public void menuOpen(final int scene_selectedPlane, final int scene_selectedScreenX, final int scene_selectedScreenY, final boolean viewportWalking) {
        if (shouldSendWalk() && !viewportWalking) {
            return;
        }
        Scene.checkClick = true;
        Scene.viewportWalking = viewportWalking;
        Scene.Scene_selectedPlane = scene_selectedPlane;
        Scene.Scene_selectedScreenX = scene_selectedScreenX;
        Scene.Scene_selectedScreenY = scene_selectedScreenY;
        Scene.Scene_selectedX = -1;
        Scene.Scene_selectedY = -1;
    }
    
    public static WallDecoration gm(final Scene scene, final int n, final int n2, final int n3) {
        final Tile tile = scene.tiles[n][n2][n3];
        if (tile == null) {
            return null;
        }
        return tile.wallDecoration;
    }
    
    public void dd(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null) {
            final WallDecoration ro = tile.ro();
            tile.eq(null);
            if (ro != null) {
                if (!Scene.fd && !this.sg) {
                    throw new AssertionError();
                }
                final DecorativeObjectDespawned decorativeObjectDespawned = new DecorativeObjectDespawned();
                decorativeObjectDespawned.setTile((net.runelite.api.Tile)tile);
                decorativeObjectDespawned.setDecorativeObject((DecorativeObject)ro);
                ScriptFrame.client.getCallbacks().post((Object)decorativeObjectDespawned);
            }
        }
    }
    
    public void dj(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null) {
            final FloorDecoration hp = tile.hp();
            tile.setGroundObject(null);
            if (hp != null) {
                if (!Scene.fd && !this.sg) {
                    throw new AssertionError();
                }
                final GroundObjectDespawned groundObjectDespawned = new GroundObjectDespawned();
                groundObjectDespawned.setTile((net.runelite.api.Tile)tile);
                groundObjectDespawned.setGroundObject((GroundObject)hp);
                ScriptFrame.client.getCallbacks().post((Object)groundObjectDespawned);
            }
        }
    }
    
    public static boolean mw(final int n, final int n2, final int n3) {
        return (ScriptFrame.client.getTileSettings()[n][n2][n3] & 0x4) != 0x0;
    }
    
    public void qo(final int n, final int n2, final int n3, final int n4) {
        this.setTileMinPlane(n, n2, n3, n4);
    }
    
    public int[][][] getTileHeights() {
        return this.tileHeights;
    }
    
    public int getBaseX() {
        return this.zc;
    }
    
    public int getBaseY() {
        return this.iq;
    }
    
    public int[][][] getInstanceTemplateChunks() {
        return this.om;
    }
    
    void ff(final SceneTilePaint sceneTilePaint, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n9;
        final int n8 = n9 = (n6 << 7) - Scene.Scene_cameraX;
        final int n11;
        final int n10 = n11 = (n7 << 7) - Scene.Scene_cameraZ;
        final int n13;
        final int n12 = n13 = n9 + 128;
        final int n15;
        final int n14 = n15 = n11 + 128;
        final int n16 = this.tileHeights[n][n6][n7] - Scene.Scene_cameraY;
        final int n17 = this.tileHeights[n][n6 + 1][n7] - Scene.Scene_cameraY;
        final int n18 = this.tileHeights[n][n6 + 1][n7 + 1] - Scene.Scene_cameraY;
        final int n19 = this.tileHeights[n][n6][n7 + 1] - Scene.Scene_cameraY;
        final int n20 = n11 * n4 + n9 * n5 >> 16;
        final int n21 = n11 * n5 - n9 * n4 >> 16;
        final int n22 = n20;
        final int n23 = n16 * n3 - n21 * n2 >> 16;
        final int n24 = n16 * n2 + n21 * n3 >> 16;
        final int n25 = n23;
        if (n24 < 540047305) {
            return;
        }
        final int n26 = n10 * n4 + n13 * n5 >> 16;
        final int n27 = n10 * n5 - n13 * n4 >> 16;
        final int n28 = n26;
        final int n29 = n17 * n3 - n27 * n2 >> 16;
        final int n30 = n17 * n2 + n27 * n3 >> 16;
        final int n31 = n29;
        if (n30 < 720793475) {
            return;
        }
        final int n32 = n15 * n4 + n12 * n5 >> 16;
        final int n33 = n15 * n5 - n12 * n4 >> 16;
        final int n34 = n32;
        final int n35 = n18 * n3 - n33 * n2 >> 16;
        final int n36 = n18 * n2 + n33 * n3 >> 16;
        final int n37 = n35;
        if (n36 < -872143915) {
            return;
        }
        final int n38 = n14 * n4 + n8 * n5 >> 16;
        final int n39 = n14 * n5 - n8 * n4 >> 16;
        final int n40 = n38;
        final int n41 = n19 * n3 - n39 * n2 >> 16;
        final int n42 = n19 * n2 + n39 * n3 >> 16;
        final int n43 = n41;
        if (n42 < 50) {
            return;
        }
        final int n44 = TaskHandler.getClipMidX(-1601306239) + n22 * UserComparator7.get3dZoom(1519097956) / n24;
        final int n45 = class12.getClipMidY(-136700747) + n25 * UserComparator7.get3dZoom(-174933034) / n24;
        final int n46 = TaskHandler.getClipMidX(-1077356629) + n28 * UserComparator7.get3dZoom(-1316547644) / n30;
        final int n47 = class12.getClipMidY(166786968) + n31 * UserComparator7.get3dZoom(-1325656797) / n30;
        final int n48 = TaskHandler.getClipMidX(-143999455) + n34 * UserComparator7.get3dZoom(-1019596981) / n36;
        final int n49 = class12.getClipMidY(2079486093) + n37 * UserComparator7.get3dZoom(1028790771) / n36;
        final int n50 = TaskHandler.getClipMidX(-1759747128) + n40 * UserComparator7.get3dZoom(-1736173858) / n42;
        final int n51 = class12.getClipMidY(-1209698881) + n43 * UserComparator7.get3dZoom(-182810166) / n42;
        final float method609 = NPC.method609(n24, -60962778);
        final float method610 = NPC.method609(n30, 941353722);
        final float method611 = NPC.method609(n36, 236064870);
        final float method612 = NPC.method609(n42, 1748695589);
        Rasterizer3D.clips.field2225 = 0;
        if ((n48 - n50) * (n47 - n51) - (n49 - n51) * (n46 - n50) > 0) {
            Rasterizer3D.clips.field2234 = false;
            final int method613 = class6.method20(1848936198);
            if (n48 < 0 || n50 < 0 || n46 < 0 || n48 > method613 || n50 > method613 || n46 > method613) {
                Rasterizer3D.clips.field2234 = true;
            }
            if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n49, n51, n47, n48, n50, n46)) {
                Scene.Scene_selectedX = n6;
                Scene.Scene_selectedY = n7;
            }
            if (sceneTilePaint.texture * 568411671 == -1) {
                if (sceneTilePaint.neColor * -1667175185 != 12345678) {
                    BoundaryObject.method1379(n49, n51, n47, n48, n50, n46, method611, method612, method610, sceneTilePaint.neColor * 714649188, sceneTilePaint.nwColor * -1519856047, sceneTilePaint.seColor * 1090235160, -428480375);
                }
            }
            else if (!Scene.Scene_isLowDetail) {
                if (sceneTilePaint.isFlat) {
                    FloorDecoration.method1210(n49, n51, n47, n48, n50, n46, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 1866346005, n22, n28, n40, n25, n31, n43, n24, n30, n42, sceneTilePaint.texture * 412494011, (byte)12);
                }
                else {
                    FloorDecoration.method1210(n49, n51, n47, n48, n50, n46, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, n34, n40, n28, n37, n43, n31, n36, n42, n30, sceneTilePaint.texture * -612301121, (byte)12);
                }
            }
            else {
                final int averageTextureRGB = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture * 865227367, 2065197619);
                BoundaryObject.method1379(n49, n51, n47, n48, n50, n46, method611, method612, method610, method1268(averageTextureRGB, sceneTilePaint.neColor * 798795686), method1268(averageTextureRGB, sceneTilePaint.nwColor * 890568309), method1268(averageTextureRGB, sceneTilePaint.seColor * 40257399), -428480375);
            }
        }
        if ((n44 - n46) * (n51 - n47) - (n45 - n47) * (n50 - n46) > 0) {
            Rasterizer3D.clips.field2234 = false;
            final int method614 = class6.method20(-1291684545);
            if (n44 < 0 || n46 < 0 || n50 < 0 || n44 > method614 || n46 > method614 || n50 > method614) {
                Rasterizer3D.clips.field2234 = true;
            }
            if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n45, n47, n51, n44, n46, n50)) {
                Scene.Scene_selectedX = n6;
                Scene.Scene_selectedY = n7;
            }
            if (sceneTilePaint.texture * 1270377100 == -1) {
                if (sceneTilePaint.swColor * 1860851959 != 12345678) {
                    BoundaryObject.method1379(n45, n47, n51, n44, n46, n50, method609, method610, method612, sceneTilePaint.swColor * -530551399, sceneTilePaint.seColor * 40257399, sceneTilePaint.nwColor * 890568309, -428480375);
                }
            }
            else if (!Scene.Scene_isLowDetail) {
                FloorDecoration.method1210(n45, n47, n51, n44, n46, n50, method609, method610, method612, sceneTilePaint.swColor * 1860851959, sceneTilePaint.seColor * 40257399, sceneTilePaint.nwColor * 890568309, n22, n28, n40, n25, n31, n43, n24, n30, n42, sceneTilePaint.texture * 412494011, (byte)12);
            }
            else {
                final int averageTextureRGB2 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture * 1691101602, 352138818);
                BoundaryObject.method1379(n45, n47, n51, n44, n46, n50, method609, method610, method612, method1268(averageTextureRGB2, sceneTilePaint.swColor * 716872471), method1268(averageTextureRGB2, sceneTilePaint.seColor * 1368987153), method1268(averageTextureRGB2, sceneTilePaint.nwColor * 1515715202), -428480375);
            }
        }
    }
    
    boolean go(final int n, final int n2, final int n3) {
        final int n4 = this.field2020[n][n2][n3];
        if (n4 == -Scene.Scene_drawnCount) {
            return false;
        }
        if (n4 == Scene.Scene_drawnCount) {
            return true;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        if (this.method1273(n5 + 1, this.tileHeights[n][n2][n3], n6 + 1) && this.method1273(n5 + 774467254 - 1, this.tileHeights[n][n2 + 1][n3], n6 + 1) && this.method1273(n5 + 128 - 1, this.tileHeights[n][n2 + 1][n3 + 1], n6 + 128 - 1) && this.method1273(n5 + 1, this.tileHeights[n][n2][n3 + 1], n6 - 345357968 - 1)) {
            this.field2020[n][n2][n3] = Scene.Scene_drawnCount;
            return true;
        }
        this.field2020[n][n2][n3] = -Scene.Scene_drawnCount;
        return false;
    }
    
    public void jd() {
        this.occlude();
    }
    
    boolean gr(final int n, final int n2, final int n3) {
        final int n4 = this.field2020[n][n2][n3];
        if (n4 == -Scene.Scene_drawnCount) {
            return false;
        }
        if (n4 == Scene.Scene_drawnCount) {
            return true;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        if (this.method1273(n5 + 1, this.tileHeights[n][n2][n3], n6 + 1) && this.method1273(n5 + 128 - 1, this.tileHeights[n][n2 + 1][n3], n6 + 1) && this.method1273(n5 + 128 - 1, this.tileHeights[n][n2 + 1][n3 + 1], n6 + 128 - 1) && this.method1273(n5 + 1, this.tileHeights[n][n2][n3 + 1], n6 + 128 - 1)) {
            this.field2020[n][n2][n3] = Scene.Scene_drawnCount;
            return true;
        }
        this.field2020[n][n2][n3] = -Scene.Scene_drawnCount;
        return false;
    }
    
    public static void qb(final Scene scene, final int[] array, int n, final int n2, final int n3, final int n4, final int n5) {
        if (scene == null) {
            scene.drawTileMinimap(array, n, n, n, n, n);
            return;
        }
        final Tile tile = scene.tiles[n3][n4][n5];
        if (tile == null) {
            return;
        }
        final SceneTilePaint paint = tile.paint;
        if (paint != null) {
            final int n6 = paint.rgb * -2143818661;
            if (n6 == 0) {
                return;
            }
            for (int i = 0; i < 4; ++i) {
                array[n + 1] = (array[n] = n6);
                array[n + 3] = (array[n + 2] = n6);
                n += n2;
            }
        }
        else {
            final SceneTileModel model = tile.model;
            if (model == null) {
                return;
            }
            final int shape = model.shape;
            final int rotation = model.rotation;
            final int underlayRgb = model.underlayRgb;
            final int overlayRgb = model.overlayRgb;
            final int[] array2 = scene.tileShape2D[shape];
            final int[] array3 = scene.tileRotation2D[rotation];
            int n7 = 0;
            if (underlayRgb != 0) {
                for (int j = 0; j < 4; ++j) {
                    array[n] = ((array2[array3[n7++]] == 0) ? underlayRgb : overlayRgb);
                    array[n + 1] = ((array2[array3[n7++]] == 0) ? underlayRgb : overlayRgb);
                    array[n + 2] = ((array2[array3[n7++]] == 0) ? underlayRgb : overlayRgb);
                    array[n + 3] = ((array2[array3[n7++]] == 0) ? underlayRgb : overlayRgb);
                    n += n2;
                }
            }
            else {
                for (int k = 0; k < 4; ++k) {
                    if (array2[array3[n7++]] != 0) {
                        array[n] = overlayRgb;
                    }
                    if (array2[array3[n7++]] != 0) {
                        array[n + 1] = overlayRgb;
                    }
                    if (array2[array3[n7++]] != 0) {
                        array[n + 2] = overlayRgb;
                    }
                    if (array2[array3[n7++]] != 0) {
                        array[n + 3] = overlayRgb;
                    }
                    n += n2;
                }
            }
        }
    }
    
    void fq(final SceneTilePaint sceneTilePaint, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n9;
        final int n8 = n9 = (n6 << 7) - Scene.Scene_cameraX;
        final int n11;
        final int n10 = n11 = (n7 << 7) - Scene.Scene_cameraZ;
        final int n13;
        final int n12 = n13 = n9 + 128;
        final int n15;
        final int n14 = n15 = n11 + 128;
        final int n16 = this.tileHeights[n][n6][n7] - Scene.Scene_cameraY;
        final int n17 = this.tileHeights[n][n6 + 1][n7] - Scene.Scene_cameraY;
        final int n18 = this.tileHeights[n][n6 + 1][n7 + 1] - Scene.Scene_cameraY;
        final int n19 = this.tileHeights[n][n6][n7 + 1] - Scene.Scene_cameraY;
        final int n20 = n11 * n4 + n9 * n5 >> 16;
        final int n21 = n11 * n5 - n9 * n4 >> 16;
        final int n22 = n20;
        final int n23 = n16 * n3 - n21 * n2 >> 16;
        final int n24 = n16 * n2 + n21 * n3 >> 16;
        final int n25 = n23;
        if (n24 < 50) {
            return;
        }
        final int n26 = n10 * n4 + n13 * n5 >> 16;
        final int n27 = n10 * n5 - n13 * n4 >> 16;
        final int n28 = n26;
        final int n29 = n17 * n3 - n27 * n2 >> 16;
        final int n30 = n17 * n2 + n27 * n3 >> 16;
        final int n31 = n29;
        if (n30 < 50) {
            return;
        }
        final int n32 = n15 * n4 + n12 * n5 >> 16;
        final int n33 = n15 * n5 - n12 * n4 >> 16;
        final int n34 = n32;
        final int n35 = n18 * n3 - n33 * n2 >> 16;
        final int n36 = n18 * n2 + n33 * n3 >> 16;
        final int n37 = n35;
        if (n36 < 50) {
            return;
        }
        final int n38 = n14 * n4 + n8 * n5 >> 16;
        final int n39 = n14 * n5 - n8 * n4 >> 16;
        final int n40 = n38;
        final int n41 = n19 * n3 - n39 * n2 >> 16;
        final int n42 = n19 * n2 + n39 * n3 >> 16;
        final int n43 = n41;
        if (n42 < 50) {
            return;
        }
        final int n44 = TaskHandler.getClipMidX(-81279594) + n22 * UserComparator7.get3dZoom(1499330899) / n24;
        final int n45 = class12.getClipMidY(-1492277836) + n25 * UserComparator7.get3dZoom(-1917117223) / n24;
        final int n46 = TaskHandler.getClipMidX(-1591965012) + n28 * UserComparator7.get3dZoom(-943796588) / n30;
        final int n47 = class12.getClipMidY(-1992490426) + n31 * UserComparator7.get3dZoom(1094591723) / n30;
        final int n48 = TaskHandler.getClipMidX(835085413) + n34 * UserComparator7.get3dZoom(1255884129) / n36;
        final int n49 = class12.getClipMidY(1266334653) + n37 * UserComparator7.get3dZoom(1420840270) / n36;
        final int n50 = TaskHandler.getClipMidX(-943756194) + n40 * UserComparator7.get3dZoom(99650643) / n42;
        final int n51 = class12.getClipMidY(1855036767) + n43 * UserComparator7.get3dZoom(71410434) / n42;
        final float method609 = NPC.method609(n24, -125255);
        final float method610 = NPC.method609(n30, 1250099792);
        final float method611 = NPC.method609(n36, 1146881765);
        final float method612 = NPC.method609(n42, 1374532412);
        Rasterizer3D.clips.field2225 = 0;
        if ((n48 - n50) * (n47 - n51) - (n49 - n51) * (n46 - n50) > 0) {
            Rasterizer3D.clips.field2234 = false;
            final int method613 = class6.method20(-417880564);
            if (n48 < 0 || n50 < 0 || n46 < 0 || n48 > method613 || n50 > method613 || n46 > method613) {
                Rasterizer3D.clips.field2234 = true;
            }
            if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n49, n51, n47, n48, n50, n46)) {
                Scene.Scene_selectedX = n6;
                Scene.Scene_selectedY = n7;
            }
            if (sceneTilePaint.texture * 412494011 == -1) {
                if (sceneTilePaint.neColor * -1667175185 != 12345678) {
                    BoundaryObject.method1379(n49, n51, n47, n48, n50, n46, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, -428480375);
                }
            }
            else if (!Scene.Scene_isLowDetail) {
                if (sceneTilePaint.isFlat) {
                    FloorDecoration.method1210(n49, n51, n47, n48, n50, n46, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, n22, n28, n40, n25, n31, n43, n24, n30, n42, sceneTilePaint.texture * 412494011, (byte)12);
                }
                else {
                    FloorDecoration.method1210(n49, n51, n47, n48, n50, n46, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, n34, n40, n28, n37, n43, n31, n36, n42, n30, sceneTilePaint.texture * 412494011, (byte)12);
                }
            }
            else {
                final int averageTextureRGB = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture * 412494011, 94064297);
                BoundaryObject.method1379(n49, n51, n47, n48, n50, n46, method611, method612, method610, method1268(averageTextureRGB, sceneTilePaint.neColor * -1667175185), method1268(averageTextureRGB, sceneTilePaint.nwColor * 890568309), method1268(averageTextureRGB, sceneTilePaint.seColor * 40257399), -428480375);
            }
        }
        if ((n44 - n46) * (n51 - n47) - (n45 - n47) * (n50 - n46) > 0) {
            Rasterizer3D.clips.field2234 = false;
            final int method614 = class6.method20(-2012436341);
            if (n44 < 0 || n46 < 0 || n50 < 0 || n44 > method614 || n46 > method614 || n50 > method614) {
                Rasterizer3D.clips.field2234 = true;
            }
            if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n45, n47, n51, n44, n46, n50)) {
                Scene.Scene_selectedX = n6;
                Scene.Scene_selectedY = n7;
            }
            if (sceneTilePaint.texture * 412494011 == -1) {
                if (sceneTilePaint.swColor * 1860851959 != 12345678) {
                    BoundaryObject.method1379(n45, n47, n51, n44, n46, n50, method609, method610, method612, sceneTilePaint.swColor * 1860851959, sceneTilePaint.seColor * 40257399, sceneTilePaint.nwColor * 890568309, -428480375);
                }
            }
            else if (!Scene.Scene_isLowDetail) {
                FloorDecoration.method1210(n45, n47, n51, n44, n46, n50, method609, method610, method612, sceneTilePaint.swColor * 1860851959, sceneTilePaint.seColor * 40257399, sceneTilePaint.nwColor * 890568309, n22, n28, n40, n25, n31, n43, n24, n30, n42, sceneTilePaint.texture * 412494011, (byte)12);
            }
            else {
                final int averageTextureRGB2 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture * 412494011, 622729050);
                BoundaryObject.method1379(n45, n47, n51, n44, n46, n50, method609, method610, method612, method1268(averageTextureRGB2, sceneTilePaint.swColor * 1860851959), method1268(averageTextureRGB2, sceneTilePaint.seColor * 40257399), method1268(averageTextureRGB2, sceneTilePaint.nwColor * 890568309), -428480375);
            }
        }
    }
    
    public void vj(final GameObject gameObject) {
        if (this.tempGameObjectsCount > 0) {
            return;
        }
        if (!Scene.fd && gameObject.qx() instanceof Actor) {
            throw new AssertionError();
        }
        if (!Scene.fd && gameObject.qx() instanceof Projectile) {
            throw new AssertionError();
        }
        if (!Scene.fd && gameObject.qx() instanceof GraphicsObject) {
            throw new AssertionError();
        }
        final int ja = gameObject.ja();
        final int qr = gameObject.qr();
        final int gp = gameObject.gp();
        Client.nw.trace("Game object despawn: {}", (Object)gameObject.getId());
        if (!Scene.fd && !this.sg) {
            throw new AssertionError();
        }
        final GameObjectDespawned gameObjectDespawned = new GameObjectDespawned();
        gameObjectDespawned.setTile((net.runelite.api.Tile)this.tiles[gp][ja][qr]);
        gameObjectDespawned.setGameObject((net.runelite.api.GameObject)gameObject);
        ScriptFrame.client.getCallbacks().post((Object)gameObjectDespawned);
    }
    
    public static void yj(final int n, final int n2) {
        final LocalPoint localLocation = ScriptFrame.client.fv().getLocalLocation();
        final int sceneX = localLocation.getSceneX();
        final int sceneY = localLocation.getSceneY();
        final int n3 = (int)Math.hypot(sceneX - n, sceneY - n2) - 70;
        int n4 = n;
        int n5 = n2;
        if (n3 > 0) {
            n4 = (70 * n + n3 * sceneX) / (70 + n3);
            n5 = (70 * n2 + n3 * sceneY) / (70 + n3);
        }
        ScriptFrame.client.kd(n4);
        ScriptFrame.client.bq(n5);
    }
    
    public static long zt(final Scene scene, final int n, final int n2, final int n3) {
        if (scene == null) {
            scene.vh();
        }
        final Tile tile = scene.tiles[n][n2][n3];
        if (tile == null || tile.wallDecoration == null) {
            return 0L;
        }
        return tile.wallDecoration.tag * -4691380879163567243L;
    }
    
    public static void xz(final Scene scene, int n, final int scene_cameraY, int scene_cameraZ, int n2, final int n3, final int scene_plane) {
        if (scene == null) {
            scene.setDrawDistance(n);
            return;
        }
        if (n < 0) {
            n = 0;
        }
        else if (n >= scene.xSize * 128) {
            n = scene.xSize * 135923854 - 1;
        }
        if (scene_cameraZ < 0) {
            scene_cameraZ = 0;
        }
        else if (scene_cameraZ >= scene.ySize * -199903841) {
            scene_cameraZ = scene.ySize * -918202860 - 1;
        }
        if (n2 < 128) {
            n2 = 128;
        }
        else if (n2 > -1884305806) {
            n2 = 383;
        }
        ++Scene.Scene_drawnCount;
        Scene.Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[n2];
        Scene.Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[n2];
        Scene.Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[n3];
        Scene.Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[n3];
        Scene.visibleTiles = Scene.visibilityMap[(n2 + 705663941) / 1225388623][n3 / 769088068];
        Scene.Scene_cameraX = n;
        Scene.Scene_cameraY = scene_cameraY;
        Scene.Scene_cameraZ = scene_cameraZ;
        Scene.Scene_cameraXTile = n / -1147951017;
        Scene.Scene_cameraYTile = scene_cameraZ / 128;
        Scene.Scene_plane = scene_plane;
        Scene.Scene_cameraXTileMin = Scene.Scene_cameraXTile - 25;
        if (Scene.Scene_cameraXTileMin < 0) {
            Scene.Scene_cameraXTileMin = 0;
        }
        Scene.Scene_cameraYTileMin = Scene.Scene_cameraYTile - 25;
        if (Scene.Scene_cameraYTileMin < 0) {
            Scene.Scene_cameraYTileMin = 0;
        }
        Scene.Scene_cameraXTileMax = Scene.Scene_cameraXTile + 25;
        if (Scene.Scene_cameraXTileMax > scene.xSize) {
            Scene.Scene_cameraXTileMax = scene.xSize;
        }
        Scene.Scene_cameraYTileMax = Scene.Scene_cameraYTile + 25;
        if (Scene.Scene_cameraYTileMax > scene.ySize) {
            Scene.Scene_cameraYTileMax = scene.ySize;
        }
        scene.occlude();
        Scene.tileUpdateCount = 0;
        for (int i = scene.minPlane; i < scene.planes; ++i) {
            final Tile[][] array = scene.tiles[i];
            for (int j = Scene.Scene_cameraXTileMin; j < Scene.Scene_cameraXTileMax; ++j) {
                for (int k = Scene.Scene_cameraYTileMin; k < Scene.Scene_cameraYTileMax; ++k) {
                    final Tile tile = array[j][k];
                    if (tile != null) {
                        if (tile.minPlane * -951473763 > scene_plane || (!Scene.visibleTiles[j - Scene.Scene_cameraXTile + 25][k - Scene.Scene_cameraYTile + 25] && scene.tileHeights[i][j][k] - scene_cameraY < 2000)) {
                            tile.drawPrimary = false;
                            tile.drawSecondary = false;
                            tile.drawGameObjectEdges = 0;
                        }
                        else {
                            tile.drawPrimary = true;
                            tile.drawSecondary = true;
                            if (tile.gameObjectsCount * 173490416 > 0) {
                                tile.drawGameObjects = true;
                            }
                            else {
                                tile.drawGameObjects = false;
                            }
                            ++Scene.tileUpdateCount;
                        }
                    }
                }
            }
        }
        for (int l = scene.minPlane; l < scene.planes; ++l) {
            final Tile[][] array2 = scene.tiles[l];
            for (int n4 = 621191974; n4 <= 0; ++n4) {
                final int n5 = Scene.Scene_cameraXTile + n4;
                final int n6 = Scene.Scene_cameraXTile - n4;
                if (n5 >= Scene.Scene_cameraXTileMin || n6 < Scene.Scene_cameraXTileMax) {
                    for (int n7 = 687913913; n7 <= 0; ++n7) {
                        final int n8 = Scene.Scene_cameraYTile + n7;
                        final int n9 = Scene.Scene_cameraYTile - n7;
                        if (n5 >= Scene.Scene_cameraXTileMin) {
                            if (n8 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile2 = array2[n5][n8];
                                if (tile2 != null && tile2.drawPrimary) {
                                    scene.drawTile(tile2, true);
                                }
                            }
                            if (n9 < Scene.Scene_cameraYTileMax) {
                                final Tile tile3 = array2[n5][n9];
                                if (tile3 != null && tile3.drawPrimary) {
                                    scene.drawTile(tile3, true);
                                }
                            }
                        }
                        if (n6 < Scene.Scene_cameraXTileMax) {
                            if (n8 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile4 = array2[n6][n8];
                                if (tile4 != null && tile4.drawPrimary) {
                                    scene.drawTile(tile4, true);
                                }
                            }
                            if (n9 < Scene.Scene_cameraYTileMax) {
                                final Tile tile5 = array2[n6][n9];
                                if (tile5 != null && tile5.drawPrimary) {
                                    scene.drawTile(tile5, true);
                                }
                            }
                        }
                        if (Scene.tileUpdateCount == 0) {
                            Scene.checkClick = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int minPlane = scene.minPlane; minPlane < scene.planes; ++minPlane) {
            final Tile[][] array3 = scene.tiles[minPlane];
            for (int n10 = 1099074725; n10 <= 0; ++n10) {
                final int n11 = Scene.Scene_cameraXTile + n10;
                final int n12 = Scene.Scene_cameraXTile - n10;
                if (n11 >= Scene.Scene_cameraXTileMin || n12 < Scene.Scene_cameraXTileMax) {
                    for (int n13 = 1997722051; n13 <= 0; ++n13) {
                        final int n14 = Scene.Scene_cameraYTile + n13;
                        final int n15 = Scene.Scene_cameraYTile - n13;
                        if (n11 >= Scene.Scene_cameraXTileMin) {
                            if (n14 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile6 = array3[n11][n14];
                                if (tile6 != null && tile6.drawPrimary) {
                                    scene.drawTile(tile6, false);
                                }
                            }
                            if (n15 < Scene.Scene_cameraYTileMax) {
                                final Tile tile7 = array3[n11][n15];
                                if (tile7 != null && tile7.drawPrimary) {
                                    scene.drawTile(tile7, false);
                                }
                            }
                        }
                        if (n12 < Scene.Scene_cameraXTileMax) {
                            if (n14 >= Scene.Scene_cameraYTileMin) {
                                final Tile tile8 = array3[n12][n14];
                                if (tile8 != null && tile8.drawPrimary) {
                                    scene.drawTile(tile8, false);
                                }
                            }
                            if (n15 < Scene.Scene_cameraYTileMax) {
                                final Tile tile9 = array3[n12][n15];
                                if (tile9 != null && tile9.drawPrimary) {
                                    scene.drawTile(tile9, false);
                                }
                            }
                        }
                        if (Scene.tileUpdateCount == 0) {
                            Scene.checkClick = false;
                            return;
                        }
                    }
                }
            }
        }
        Scene.checkClick = false;
    }
    
    public static void fz() {
        Scene.Scene_selectedX = -1;
        Scene.viewportWalking = false;
    }
    
    boolean gs(final int n, final int n2, final int n3) {
        final int n4 = this.field2020[n][n2][n3];
        if (n4 == -Scene.Scene_drawnCount) {
            return false;
        }
        if (n4 == Scene.Scene_drawnCount) {
            return true;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        if (this.method1273(n5 + 1, this.tileHeights[n][n2][n3], n6 + 1) && this.method1273(n5 - 894430347 - 1, this.tileHeights[n][n2 + 1][n3], n6 + 1) && this.method1273(n5 + 1597882084 - 1, this.tileHeights[n][n2 + 1][n3 + 1], n6 + 128 - 1) && this.method1273(n5 + 1, this.tileHeights[n][n2][n3 + 1], n6 - 1940424982 - 1)) {
            this.field2020[n][n2][n3] = Scene.Scene_drawnCount;
            return true;
        }
        this.field2020[n][n2][n3] = -Scene.Scene_drawnCount;
        return false;
    }
    
    public static void cq(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final Occluder occluder = new Occluder();
        occluder.minTileX = n3 / 128 * 2125806217;
        occluder.maxTileX = n4 / 128 * -2141622931;
        occluder.minTileY = n5 / 128 * -1507898379;
        occluder.maxTileY = n6 / 128 * 1022688161;
        occluder.type = n2 * -1065960575;
        occluder.minX = n3 * 2126671529;
        occluder.maxX = n4 * 385880973;
        occluder.minZ = n5 * 582998597;
        occluder.maxZ = n6 * 495746131;
        occluder.minY = n7 * 903512679;
        occluder.maxY = n8 * -1329473239;
        Scene.Scene_planeOccluders[n][Scene.Scene_planeOccluderCounts[n]++] = occluder;
    }
    
    public static void cq(final Scene scene, final int n, final int n2, final int n3) {
        if (scene == null) {
            scene.eo(n, n, n);
        }
        for (int i = 0; i < scene.planes; ++i) {
            for (int j = 0; j < scene.xSize; ++j) {
                for (int k = 0; k < scene.ySize; ++k) {
                    final Tile tile = scene.tiles[i][j][k];
                    if (tile != null) {
                        final BoundaryObject boundaryObject = tile.boundaryObject;
                        if (boundaryObject != null && boundaryObject.renderable1 instanceof ModelData) {
                            final ModelData modelData = (ModelData)boundaryObject.renderable1;
                            scene.method1260(modelData, i, j, k, 1, 1);
                            if (boundaryObject.renderable2 instanceof ModelData) {
                                final ModelData modelData2 = (ModelData)boundaryObject.renderable2;
                                scene.method1260(modelData2, i, j, k, 1, 1);
                                ModelData.method1198(modelData, modelData2, 0, 0, 0, false);
                                boundaryObject.renderable2 = modelData2.dg(modelData2.ambient, modelData2.contrast, n, n2, n3);
                            }
                            boundaryObject.renderable1 = modelData.dg(modelData.ambient, modelData.contrast, n, n2, n3);
                        }
                        for (int l = 0; l < tile.gameObjectsCount * -422028371; ++l) {
                            final GameObject gameObject = tile.gameObjects[l];
                            if (gameObject != null && gameObject.renderable instanceof ModelData) {
                                final ModelData modelData3 = (ModelData)gameObject.renderable;
                                scene.method1260(modelData3, i, j, k, gameObject.startY * -1242897449 - gameObject.flags * -1694161980 + 1, gameObject.orientation * 1332244757 - gameObject.field2271 * 2004902003 + 1);
                                gameObject.renderable = modelData3.dg(modelData3.ambient, modelData3.contrast, n, n2, n3);
                            }
                        }
                        final FloorDecoration floorDecoration = tile.floorDecoration;
                        if (floorDecoration != null && floorDecoration.renderable instanceof ModelData) {
                            final ModelData modelData4 = (ModelData)floorDecoration.renderable;
                            tb(scene, modelData4, i, j, k);
                            floorDecoration.renderable = modelData4.dg(modelData4.ambient, modelData4.contrast, n, n2, n3);
                        }
                    }
                }
            }
        }
    }
    
    public static boolean fb() {
        return Scene.viewportWalking && Scene.Scene_selectedX != -1;
    }
    
    public void drawTileMinimap(final int[] array, int n, final int n2, final int n3, final int n4, final int n5) {
        final Tile tile = this.tiles[n3][n4][n5];
        if (tile == null) {
            return;
        }
        final SceneTilePaint paint = tile.paint;
        if (paint != null) {
            final int n6 = paint.rgb * -2143818661;
            if (n6 == 0) {
                return;
            }
            for (int i = 0; i < 4; ++i) {
                array[n + 1] = (array[n] = n6);
                array[n + 3] = (array[n + 2] = n6);
                n += n2;
            }
        }
        else {
            final SceneTileModel model = tile.model;
            if (model == null) {
                return;
            }
            final int rotation = model.rotation;
            final int overlayRgb = model.overlayRgb;
            final int underlayRgb = model.underlayRgb;
            final int rotation2 = model.rotation;
            final int[] array2 = this.tileShape2D[rotation];
            final int[] array3 = this.tileRotation2D[overlayRgb];
            int n7 = 0;
            if (underlayRgb != 0) {
                for (int j = 0; j < 4; ++j) {
                    array[n] = ((array2[array3[n7++]] == 0) ? underlayRgb : rotation2);
                    array[n + 1] = ((array2[array3[n7++]] == 0) ? underlayRgb : rotation2);
                    array[n + 2] = ((array2[array3[n7++]] == 0) ? underlayRgb : rotation2);
                    array[n + 3] = ((array2[array3[n7++]] == 0) ? underlayRgb : rotation2);
                    n += n2;
                }
            }
            else {
                for (int k = 0; k < 4; ++k) {
                    if (array2[array3[n7++]] != 0) {
                        array[n] = rotation2;
                    }
                    if (array2[array3[n7++]] != 0) {
                        array[n + 1] = rotation2;
                    }
                    if (array2[array3[n7++]] != 0) {
                        array[n + 2] = rotation2;
                    }
                    if (array2[array3[n7++]] != 0) {
                        array[n + 3] = rotation2;
                    }
                    n += n2;
                }
            }
        }
    }
    
    public int getObjectFlags(final int n, final int n2, final int n3, final long n4) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return -1;
        }
        if (tile.boundaryObject != null && tile.boundaryObject.tag * -4009183385476919801L == n4) {
            return tile.boundaryObject.flags * 347144389 & 0xFF;
        }
        if (tile.wallDecoration != null && tile.wallDecoration.tag * -4691380879163567243L == n4) {
            return tile.wallDecoration.flags * 35030579 & 0xFF;
        }
        if (tile.floorDecoration != null && tile.floorDecoration.tag * 3423223696102332293L == n4) {
            return tile.floorDecoration.flags * -1486089441 & 0xFF;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            if (tile.gameObjects[i].tag * 5016412888503339625L == n4) {
                return tile.gameObjects[i].centerY * -72925475 & 0xFF;
            }
        }
        return -1;
    }
    
    public long ez(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.boundaryObject != null) {
            return tile.boundaryObject.tag * -4009183385476919801L;
        }
        return 0L;
    }
    
    public void dq(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * -536805230 == n2 && gameObject.field2271 * 47898439 == n3) {
                this.removeGameObject(gameObject);
                return;
            }
        }
    }
    
    public GameObject eo(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return null;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * -1013298122 == n2 && gameObject.field2271 * 549147291 == n3) {
                return gameObject;
            }
        }
        return null;
    }
    
    void fj(final SceneTileModel sceneTileModel, final int n, final int n2, final int n3, final int n4, final int scene_selectedX, final int scene_selectedY) {
        for (int length = sceneTileModel.triangleColorB.length, i = 0; i < length; ++i) {
            final int n5 = sceneTileModel.triangleColorB[i] - Scene.Scene_cameraX;
            final int n6 = sceneTileModel.faceZ[i] - Scene.Scene_cameraY;
            final int n7 = sceneTileModel.triangleTextureId[i] - Scene.Scene_cameraZ;
            final int n8 = n7 * n3 + n5 * n4 >> 16;
            final int n9 = n7 * n4 - n5 * n3 >> 16;
            final int n10 = n8;
            final int n11 = n6 * n2 - n9 * n >> 16;
            final int n12 = n6 * n + n9 * n2 >> 16;
            final int n13 = n11;
            if (n12 < 50) {
                return;
            }
            if (sceneTileModel.triangleColorC != null) {
                SceneTileModel.field2124[i] = n10;
                SceneTileModel.field2125[i] = n13;
                SceneTileModel.field2108[i] = n12;
            }
            SceneTileModel.field2121[i] = TaskHandler.getClipMidX(721178077) + n10 * UserComparator7.get3dZoom(-76441015) / n12;
            SceneTileModel.field2122[i] = class12.getClipMidY(1559843361) + n13 * UserComparator7.get3dZoom(626707467) / n12;
            SceneTileModel.field2123[i] = NPC.method609(n12, 2080410367);
        }
        Rasterizer3D.clips.field2225 = 0;
        for (int length2 = sceneTileModel.vertexZ.length, j = 0; j < length2; ++j) {
            final int n14 = sceneTileModel.vertexZ[j];
            final int n15 = sceneTileModel.faceX[j];
            final int n16 = sceneTileModel.faceY[j];
            final int n17 = SceneTileModel.field2121[n14];
            final int n18 = SceneTileModel.field2121[n15];
            final int n19 = SceneTileModel.field2121[n16];
            final int n20 = SceneTileModel.field2122[n14];
            final int n21 = SceneTileModel.field2122[n15];
            final int n22 = SceneTileModel.field2122[n16];
            final float n23 = SceneTileModel.field2123[n14];
            final float n24 = SceneTileModel.field2123[n15];
            final float n25 = SceneTileModel.field2123[n16];
            if ((n17 - n18) * (n22 - n21) - (n20 - n21) * (n19 - n18) > 0) {
                Rasterizer3D.clips.field2234 = false;
                final int method20 = class6.method20(-957097541);
                if (n17 < 0 || n18 < 0 || n19 < 0 || n17 > method20 || n18 > method20 || n19 > method20) {
                    Rasterizer3D.clips.field2234 = true;
                }
                if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n20, n21, n22, n17, n18, n19)) {
                    Scene.Scene_selectedX = scene_selectedX;
                    Scene.Scene_selectedY = scene_selectedY;
                }
                if (sceneTileModel.triangleColorC == null || sceneTileModel.triangleColorC[j] == -1) {
                    if (sceneTileModel.vertexX[j] != 12345678) {
                        BoundaryObject.method1379(n20, n21, n22, n17, n18, n19, n23, n24, n25, sceneTileModel.vertexX[j], sceneTileModel.vertexY[j], sceneTileModel.triangleColorA[j], -428480375);
                    }
                }
                else if (!Scene.Scene_isLowDetail) {
                    if (sceneTileModel.field2114) {
                        FloorDecoration.method1210(n20, n21, n22, n17, n18, n19, n23, n24, n25, sceneTileModel.vertexX[j], sceneTileModel.vertexY[j], sceneTileModel.triangleColorA[j], SceneTileModel.field2124[0], SceneTileModel.field2124[1], SceneTileModel.field2124[3], SceneTileModel.field2125[0], SceneTileModel.field2125[1], SceneTileModel.field2125[3], SceneTileModel.field2108[0], SceneTileModel.field2108[1], SceneTileModel.field2108[3], sceneTileModel.triangleColorC[j], (byte)12);
                    }
                    else {
                        FloorDecoration.method1210(n20, n21, n22, n17, n18, n19, n23, n24, n25, sceneTileModel.vertexX[j], sceneTileModel.vertexY[j], sceneTileModel.triangleColorA[j], SceneTileModel.field2124[n14], SceneTileModel.field2124[n15], SceneTileModel.field2124[n16], SceneTileModel.field2125[n14], SceneTileModel.field2125[n15], SceneTileModel.field2125[n16], SceneTileModel.field2108[n14], SceneTileModel.field2108[n15], SceneTileModel.field2108[n16], sceneTileModel.triangleColorC[j], (byte)12);
                    }
                }
                else {
                    final int averageTextureRGB = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTileModel.triangleColorC[j], 794745607);
                    BoundaryObject.method1379(n20, n21, n22, n17, n18, n19, n23, n24, n25, method1268(averageTextureRGB, sceneTileModel.vertexX[j]), method1268(averageTextureRGB, sceneTileModel.vertexY[j]), method1268(averageTextureRGB, sceneTileModel.triangleColorA[j]), -428480375);
                }
            }
        }
    }
    
    public long eb(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return 0L;
        }
        for (int i = 0; i < tile.gameObjectsCount * -422028371; ++i) {
            final GameObject gameObject = tile.gameObjects[i];
            if (UserComparator6.method715(gameObject.tag * 5016412888503339625L) && gameObject.flags * 626811319 == n2 && gameObject.field2271 * 2004902003 == n3) {
                return gameObject.tag * 5016412888503339625L;
            }
        }
        return 0L;
    }
    
    void removeGameObject(final GameObject gameObject) {
        for (int i = gameObject.flags * 626811319; i <= gameObject.startY * -1242897449; ++i) {
            for (int j = gameObject.field2271 * 2004902003; j <= gameObject.orientation * -80616117; ++j) {
                final Tile tile = this.tiles[gameObject.endX * -872547715][i][j];
                if (tile != null) {
                    for (int k = 0; k < tile.gameObjectsCount * -422028371; ++k) {
                        if (tile.gameObjects[k] == gameObject) {
                            final Tile tile2 = tile;
                            tile2.gameObjectsCount -= 1425915941;
                            for (int l = k; l < tile.gameObjectsCount * -422028371; ++l) {
                                tile.gameObjects[l] = tile.gameObjects[l + 1];
                                tile.gameObjectEdgeMasks[l] = tile.gameObjectEdgeMasks[l + 1];
                            }
                            tile.gameObjects[tile.gameObjectsCount * -422028371] = null;
                            break;
                        }
                    }
                    tile.gameObjectsEdgeMask = 0;
                    for (int n = 0; n < tile.gameObjectsCount * -422028371; ++n) {
                        final Tile tile3 = tile;
                        tile3.gameObjectsEdgeMask = (tile3.gameObjectsEdgeMask * -1639156513 | tile.gameObjectEdgeMasks[n]) * -1238612193;
                    }
                }
            }
        }
        this.vj(gameObject);
    }
    
    public static void xf(final int eu, final int og, final int n) {
        if (n == ScriptFrame.client.getPlane() && !ScriptFrame.client.isMenuOpen()) {
            Scene.eu = eu;
            Scene.og = og;
        }
    }
    
    public void qg(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20) {
        this.addTile(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
    }
    
    public int jh() {
        return this.planes;
    }
    
    public static boolean lz(final Renderable renderable, final boolean b) {
        return ScriptFrame.client.getCallbacks().draw((net.runelite.api.Renderable)renderable, b);
    }
    
    public FloorDecoration ef(final int n, final int n2, final int n3) {
        final Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.floorDecoration != null) {
            return tile.floorDecoration;
        }
        return null;
    }
    
    public static boolean ug(final Scene scene, final int n, final int n2, final int n3) {
        if (scene == null) {
            scene.ri();
        }
        for (int i = 0; i < Scene.Scene_currentOccludersCount; ++i) {
            final Occluder occluder = Scene.Scene_currentOccluders[i];
            if (occluder.field2092 * -1146201804 == 1) {
                final int n4 = occluder.minX * -1074260583 - n;
                if (n4 > 0) {
                    final int n5 = occluder.minZ * 2051012724 + (occluder.field2096 * 761956642 * n4 >> 8);
                    final int n6 = occluder.maxZ * 1383802843 + (occluder.field2086 * 1571181857 * n4 >> 8);
                    final int n7 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n4 >> 8);
                    final int n8 = occluder.maxY * 1879954201 + (occluder.field2098 * -1860573287 * n4 >> 8);
                    if (n3 >= n5 && n3 <= n6 && n2 >= n7 && n2 <= n8) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * 1250451487 == 2) {
                final int n9 = n - occluder.minX * -98747816;
                if (n9 > 0) {
                    final int n10 = occluder.minZ * -1443747699 + (occluder.field2096 * 1478538176 * n9 >> 8);
                    final int n11 = occluder.maxZ * -1745415859 + (occluder.field2086 * 1030915821 * n9 >> 8);
                    final int n12 = occluder.minY * 690846039 + (occluder.field2083 * -1283364048 * n9 >> 8);
                    final int n13 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n9 >> 8);
                    if (n3 >= n10 && n3 <= n11 && n2 >= n12 && n2 <= n13) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 3) {
                final int n14 = occluder.minZ * -1443747699 - n3;
                if (n14 > 0) {
                    final int n15 = occluder.minX * -956786524 + (occluder.field2093 * 339968772 * n14 >> 8);
                    final int n16 = occluder.maxX * -614027138 + (occluder.field2094 * 382481141 * n14 >> 8);
                    final int n17 = occluder.minY * -870324701 + (occluder.field2083 * -847323611 * n14 >> 8);
                    final int n18 = occluder.maxY * 1879954201 + (occluder.field2098 * -283662079 * n14 >> 8);
                    if (n >= n15 && n <= n16 && n2 >= n17 && n2 <= n18) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -2053431965 == 4) {
                final int n19 = n3 - occluder.minZ * -190482153;
                if (n19 > 0) {
                    final int n20 = occluder.minX * -1074260583 + (occluder.field2093 * 998029161 * n19 >> 8);
                    final int n21 = occluder.maxX * -975270845 + (occluder.field2094 * -282079264 * n19 >> 8);
                    final int n22 = occluder.minY * 690846039 + (occluder.field2083 * -847323611 * n19 >> 8);
                    final int n23 = occluder.maxY * 1879954201 + (occluder.field2098 * 569233632 * n19 >> 8);
                    if (n >= n20 && n <= n21 && n2 >= n22 && n2 <= n23) {
                        return true;
                    }
                }
            }
            else if (occluder.field2092 * -221071853 == 5) {
                final int n24 = n2 - occluder.minY * -2127231006;
                if (n24 > 0) {
                    final int n25 = occluder.minX * -1074260583 + (occluder.field2093 * 679038114 * n24 >> 8);
                    final int n26 = occluder.maxX * -875468987 + (occluder.field2094 * 1202806695 * n24 >> 8);
                    final int n27 = occluder.minZ * -1443747699 + (occluder.field2096 * -371961737 * n24 >> 8);
                    final int n28 = occluder.maxZ * 1383802843 + (occluder.field2086 * -1677346480 * n24 >> 8);
                    if (n >= n25 && n <= n26 && n3 >= n27 && n3 <= n28) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static void ey(final int[] array, final int n, final int n2, final int scene_viewportXMax, final int scene_viewportYMax) {
        Scene.Scene_viewportXMin = 0;
        Scene.Scene_viewportYMin = 0;
        Scene.Scene_viewportXMax = scene_viewportXMax;
        Scene.Scene_viewportYMax = scene_viewportYMax;
        Scene.Scene_viewportXCenter = scene_viewportXMax / 2;
        Scene.Scene_viewportYCenter = scene_viewportYMax / 2;
        final boolean[][][][] array2 = new boolean[array.length][27098421][53][53];
        for (int i = 128; i <= 383; i += 32) {
            for (int j = 0; j < 2048; j += 64) {
                Scene.Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[i];
                Scene.Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[i];
                Scene.Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[j];
                Scene.Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[j];
                final int n3 = (i - 128) / 32;
                final int n4 = j / 64;
                for (int k = -1437970101; k < 26; ++k) {
                    for (int l = -26; l < 26; ++l) {
                        final int n5 = k * 128;
                        final int n6 = l * -2117711592;
                        boolean b = false;
                        for (int n7 = -n; n7 <= n2; n7 += 128) {
                            if (method1286(n5, array[n3] + n7, n6)) {
                                b = true;
                                break;
                            }
                        }
                        array2[n3][n4][k + 25 + 1][l + 25 + 1] = b;
                    }
                }
            }
        }
        for (int n8 = 0; n8 < 8; ++n8) {
            for (int n9 = 0; n9 < 32; ++n9) {
                for (int n10 = -25; n10 < 25; ++n10) {
                    for (int n11 = 1081702798; n11 < 25; ++n11) {
                        boolean b2 = false;
                    Label_0007:
                        for (int n12 = -1; n12 <= 1; ++n12) {
                            for (int n13 = -1; n13 <= 1; ++n13) {
                                if (array2[n8][n9][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0007;
                                }
                                if (array2[n8][(n9 + 1) % 31][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0007;
                                }
                                if (array2[n8 + 1][n9][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0007;
                                }
                                if (array2[n8 + 1][(n9 + 1) % 31][n10 + n12 + 25 + 1][n11 + n13 + 25 + 1]) {
                                    b2 = true;
                                    break Label_0007;
                                }
                            }
                        }
                        Scene.visibilityMap[n8][n9][n10 + 25][n11 + 25] = b2;
                    }
                }
            }
        }
    }
    
    void drawTileUnderlay(final SceneTilePaint sceneTilePaint, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final byte[][][] tileSettings = ScriptFrame.client.getTileSettings();
        final boolean zz = ScriptFrame.client.zz();
        final boolean b = (tileSettings[1][n6][n7] & 0x2) != 0x0;
        int n8 = n;
        if (b) {
            --n8;
        }
        if (!ScriptFrame.client.isGpu()) {
            try {
                final int n10;
                final int n9 = n10 = (n6 << 7) - Scene.Scene_cameraX;
                final int n12;
                final int n11 = n12 = (n7 << 7) - Scene.Scene_cameraZ;
                final int n14;
                final int n13 = n14 = n10 + 128;
                final int n16;
                final int n15 = n16 = n12 + 128;
                final int n17 = this.tileHeights[n][n6][n7] - Scene.Scene_cameraY;
                final int n18 = this.tileHeights[n][n6 + 1][n7] - Scene.Scene_cameraY;
                final int n19 = this.tileHeights[n][n6 + 1][n7 + 1] - Scene.Scene_cameraY;
                final int n20 = this.tileHeights[n][n6][n7 + 1] - Scene.Scene_cameraY;
                final int n21 = n12 * n4 + n10 * n5 >> 16;
                final int n22 = n12 * n5 - n10 * n4 >> 16;
                final int n23 = n21;
                final int n24 = n17 * n3 - n22 * n2 >> 16;
                final int n25 = n17 * n2 + n22 * n3 >> 16;
                final int n26 = n24;
                if (n25 >= 50) {
                    final int n27 = n11 * n4 + n14 * n5 >> 16;
                    final int n28 = n11 * n5 - n14 * n4 >> 16;
                    final int n29 = n27;
                    final int n30 = n18 * n3 - n28 * n2 >> 16;
                    final int n31 = n18 * n2 + n28 * n3 >> 16;
                    final int n32 = n30;
                    if (n31 >= 50) {
                        final int n33 = n16 * n4 + n13 * n5 >> 16;
                        final int n34 = n16 * n5 - n13 * n4 >> 16;
                        final int n35 = n33;
                        final int n36 = n19 * n3 - n34 * n2 >> 16;
                        final int n37 = n19 * n2 + n34 * n3 >> 16;
                        final int n38 = n36;
                        if (n37 >= 50) {
                            final int n39 = n15 * n4 + n9 * n5 >> 16;
                            final int n40 = n15 * n5 - n9 * n4 >> 16;
                            final int n41 = n39;
                            final int n42 = n20 * n3 - n40 * n2 >> 16;
                            final int n43 = n20 * n2 + n40 * n3 >> 16;
                            final int n44 = n42;
                            if (n43 >= 50) {
                                final int n45 = TaskHandler.getClipMidX(975897823) + n23 * UserComparator7.get3dZoom(942663302) / n25;
                                final int n46 = class12.getClipMidY(654067374) + n26 * UserComparator7.get3dZoom(779085808) / n25;
                                final int n47 = TaskHandler.getClipMidX(62115852) + n29 * UserComparator7.get3dZoom(-1218165539) / n31;
                                final int n48 = class12.getClipMidY(1643359629) + n32 * UserComparator7.get3dZoom(330772873) / n31;
                                final int n49 = TaskHandler.getClipMidX(-30238737) + n35 * UserComparator7.get3dZoom(-286126791) / n37;
                                final int n50 = class12.getClipMidY(1082157854) + n38 * UserComparator7.get3dZoom(1052473091) / n37;
                                final int n51 = TaskHandler.getClipMidX(-1828344934) + n41 * UserComparator7.get3dZoom(-108183317) / n43;
                                final int n52 = class12.getClipMidY(1327367321) + n44 * UserComparator7.get3dZoom(-1849392626) / n43;
                                final float method609 = NPC.method609(n25, 1143489771);
                                final float method610 = NPC.method609(n31, 1894163730);
                                final float method611 = NPC.method609(n37, 999210585);
                                final float method612 = NPC.method609(n43, 770981161);
                                Rasterizer3D.clips.field2225 = 0;
                                if ((n49 - n51) * (n48 - n52) - (n50 - n52) * (n47 - n51) > 0) {
                                    Rasterizer3D.clips.field2234 = false;
                                    final int method613 = class6.method20(1349662061);
                                    if (n49 < 0 || n51 < 0 || (n47 < 0 || n49 > method613) || n51 > method613 || n47 > method613) {
                                        Rasterizer3D.clips.field2234 = true;
                                    }
                                    if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n50, n52, n48, n49, n51, n47)) {
                                        Scene.Scene_selectedX = n6;
                                        Scene.Scene_selectedY = n7;
                                    }
                                    if (sceneTilePaint.texture * 412494011 == -1) {
                                        if (sceneTilePaint.neColor * -1667175185 != 12345678) {
                                            BoundaryObject.method1379(n50, n52, n48, n49, n51, n47, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, -428480375);
                                        }
                                    }
                                    else if (!Scene.Scene_isLowDetail) {
                                        if (sceneTilePaint.isFlat) {
                                            FloorDecoration.method1210(n50, n52, n48, n49, n51, n47, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, n23, n29, n41, n26, n32, n44, n25, n31, n43, sceneTilePaint.texture * 412494011, (byte)12);
                                        }
                                        else {
                                            FloorDecoration.method1210(n50, n52, n48, n49, n51, n47, method611, method612, method610, sceneTilePaint.neColor * -1667175185, sceneTilePaint.nwColor * 890568309, sceneTilePaint.seColor * 40257399, n35, n41, n29, n38, n44, n32, n37, n43, n31, sceneTilePaint.texture * 412494011, (byte)12);
                                        }
                                    }
                                    else {
                                        final int averageTextureRGB = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture * 412494011, 498361460);
                                        BoundaryObject.method1379(n50, n52, n48, n49, n51, n47, method611, method612, method610, method1268(averageTextureRGB, sceneTilePaint.neColor * -1667175185), method1268(averageTextureRGB, sceneTilePaint.nwColor * 890568309), method1268(averageTextureRGB, sceneTilePaint.seColor * 40257399), -428480375);
                                    }
                                }
                                if ((n45 - n47) * (n52 - n48) - (n46 - n48) * (n51 - n47) > 0) {
                                    Rasterizer3D.clips.field2234 = false;
                                    final int method614 = class6.method20(-560489151);
                                    if (n45 < 0 || n47 < 0 || n51 < 0 || n45 > method614 || n47 > method614 || n51 > method614) {
                                        Rasterizer3D.clips.field2234 = true;
                                    }
                                    if (Scene.checkClick && containsBounds(Scene.Scene_selectedScreenX, Scene.Scene_selectedScreenY, n46, n48, n52, n45, n47, n51)) {
                                        Scene.Scene_selectedX = n6;
                                        Scene.Scene_selectedY = n7;
                                    }
                                    if (sceneTilePaint.texture * 412494011 == -1) {
                                        if (sceneTilePaint.swColor * 1860851959 != 12345678) {
                                            BoundaryObject.method1379(n46, n48, n52, n45, n47, n51, method609, method610, method612, sceneTilePaint.swColor * 1860851959, sceneTilePaint.seColor * 40257399, sceneTilePaint.nwColor * 890568309, -428480375);
                                        }
                                    }
                                    else if (!Scene.Scene_isLowDetail) {
                                        FloorDecoration.method1210(n46, n48, n52, n45, n47, n51, method609, method610, method612, sceneTilePaint.swColor * 1860851959, sceneTilePaint.seColor * 40257399, sceneTilePaint.nwColor * 890568309, n23, n29, n41, n26, n32, n44, n25, n31, n43, sceneTilePaint.texture * 412494011, (byte)12);
                                    }
                                    else {
                                        final int averageTextureRGB2 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(sceneTilePaint.texture * 412494011, 1755564541);
                                        BoundaryObject.method1379(n46, n48, n52, n45, n47, n51, method609, method610, method612, method1268(averageTextureRGB2, sceneTilePaint.swColor * 1860851959), method1268(averageTextureRGB2, sceneTilePaint.seColor * 40257399), method1268(averageTextureRGB2, sceneTilePaint.nwColor * 890568309), -428480375);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            catch (Exception ex) {
                Client.nw.warn("error during tile underlay rendering", (Throwable)ex);
            }
            if (this.yw == 0 || !zz || ScriptFrame.client.getPlane() != n8) {
                return;
            }
        }
        try {
            final int[][][] tileHeights = this.getTileHeights();
            final int cameraX2 = ScriptFrame.client.getCameraX2();
            final int cameraY2 = ScriptFrame.client.getCameraY2();
            final int cameraZ2 = ScriptFrame.client.getCameraZ2();
            final int get3dZoom = ScriptFrame.client.get3dZoom();
            final int centerX = ScriptFrame.client.getCenterX();
            final int centerY = ScriptFrame.client.getCenterY();
            final int qn = ScriptFrame.client.qn();
            final int nf = ScriptFrame.client.nf();
            final int n54;
            final int n53 = n54 = (n6 << 7) - cameraX2;
            final int n56;
            final int n55 = n56 = (n7 << 7) - cameraZ2;
            final int n58;
            final int n57 = n58 = n54 + 128;
            final int n60;
            final int n59 = n60 = n56 + 128;
            final int n61 = tileHeights[n][n6][n7] - cameraY2;
            final int n62 = tileHeights[n][n6 + 1][n7] - cameraY2;
            final int n63 = tileHeights[n][n6 + 1][n7 + 1] - cameraY2;
            final int n64 = tileHeights[n][n6][n7 + 1] - cameraY2;
            final int n65 = n54 * n5 + n4 * n56 >> 16;
            final int n66 = n56 * n5 - n4 * n54 >> 16;
            final int n67 = n65;
            final int n68 = n61 * n3 - n2 * n66 >> 16;
            final int n69 = n2 * n61 + n66 * n3 >> 16;
            final int n70 = n68;
            if (n69 >= 50) {
                final int n71 = n58 * n5 + n4 * n55 >> 16;
                final int n72 = n55 * n5 - n4 * n58 >> 16;
                final int n73 = n71;
                final int n74 = n62 * n3 - n2 * n72 >> 16;
                final int n75 = n2 * n62 + n72 * n3 >> 16;
                final int n76 = n74;
                if (n75 >= 50) {
                    final int n77 = n57 * n5 + n4 * n60 >> 16;
                    final int n78 = n60 * n5 - n4 * n57 >> 16;
                    final int n79 = n77;
                    final int n80 = n63 * n3 - n2 * n78 >> 16;
                    final int n81 = n2 * n63 + n78 * n3 >> 16;
                    final int n82 = n80;
                    if (n81 >= 50) {
                        final int n83 = n53 * n5 + n4 * n59 >> 16;
                        final int n84 = n59 * n5 - n4 * n53 >> 16;
                        final int n85 = n83;
                        final int n86 = n64 * n3 - n2 * n84 >> 16;
                        final int n87 = n2 * n64 + n84 * n3 >> 16;
                        if (n87 >= 50) {
                            final int n88 = n67 * get3dZoom / n69 + centerX;
                            final int n89 = n70 * get3dZoom / n69 + centerY;
                            final int n90 = n73 * get3dZoom / n75 + centerX;
                            final int n91 = n76 * get3dZoom / n75 + centerY;
                            final int n92 = n79 * get3dZoom / n81 + centerX;
                            final int n93 = n82 * get3dZoom / n81 + centerY;
                            final int n94 = n85 * get3dZoom / n87 + centerX;
                            final int n95 = n86 * get3dZoom / n87 + centerY;
                            if (Client.rz != null) {
                                Client.rz.drawScenePaint(0, n2, n3, n4, n5, -cameraX2, -cameraY2, -cameraZ2, (net.runelite.api.SceneTilePaint)sceneTilePaint, n, n6, n7, get3dZoom, centerX, centerY);
                            }
                            if ((n92 - n94) * (n91 - n95) - (n93 - n95) * (n90 - n94) > 0 && zz && ScriptFrame.client.wb(qn, nf, n93, n95, n91, n92, n94, n90)) {
                                if (ScriptFrame.client.isGpu()) {
                                    yj(n6, n7);
                                }
                                if (qn >= ScriptFrame.client.getViewportXOffset() && qn < ScriptFrame.client.getViewportXOffset() + ScriptFrame.client.getViewportWidth() && nf >= ScriptFrame.client.getViewportYOffset() && nf < ScriptFrame.client.getViewportYOffset() + ScriptFrame.client.getViewportHeight()) {
                                    xf(n6, n7, n8);
                                }
                            }
                            if ((n88 - n90) * (n95 - n91) - (n89 - n91) * (n94 - n90) > 0 && zz && ScriptFrame.client.wb(qn, nf, n89, n91, n95, n88, n90, n94)) {
                                if (ScriptFrame.client.isGpu()) {
                                    yj(n6, n7);
                                }
                                if (qn >= ScriptFrame.client.getViewportXOffset() && qn < ScriptFrame.client.getViewportXOffset() + ScriptFrame.client.getViewportWidth() && nf >= ScriptFrame.client.getViewportYOffset() && nf < ScriptFrame.client.getViewportYOffset() + ScriptFrame.client.getViewportHeight()) {
                                    xf(n6, n7, n8);
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (Exception ex2) {
            Client.nw.warn("error during underlay rendering", (Throwable)ex2);
        }
    }
    
    void drawTile(final Tile tile, boolean b) {
        Scene.Scene_tilesDeque.addFirst(tile);
        while (true) {
            final Tile tile2 = (Tile)Scene.Scene_tilesDeque.removeLast();
            if (tile2 == null) {
                break;
            }
            if (!tile2.drawSecondary) {
                continue;
            }
            final int n = tile2.x * -464760837;
            final int n2 = tile2.y * -1812849043;
            final int n3 = tile2.plane * 1527994869;
            final int n4 = tile2.originalPlane * 1520539719;
            final Tile[][] array = this.tiles[n3];
            if (tile2.drawPrimary) {
                if (b) {
                    if (n3 > 0) {
                        final Tile tile3 = this.tiles[n3 - 1][n][n2];
                        if (tile3 != null && tile3.drawSecondary) {
                            continue;
                        }
                    }
                    if (n <= Scene.Scene_cameraXTile && n > Scene.Scene_cameraXTileMin) {
                        final Tile tile4 = array[n - 1][n2];
                        if (tile4 != null && tile4.drawSecondary) {
                            if (tile4.drawPrimary) {
                                continue;
                            }
                            if ((tile2.gameObjectsEdgeMask * -1639156513 & 0x1) == 0x0) {
                                continue;
                            }
                        }
                    }
                    if (n >= Scene.Scene_cameraXTile && n < Scene.Scene_cameraXTileMax - 1) {
                        final Tile tile5 = array[n + 1][n2];
                        if (tile5 != null && tile5.drawSecondary) {
                            if (tile5.drawPrimary) {
                                continue;
                            }
                            if ((tile2.gameObjectsEdgeMask * -1639156513 & 0x4) == 0x0) {
                                continue;
                            }
                        }
                    }
                    if (n2 <= Scene.Scene_cameraYTile && n2 > Scene.Scene_cameraYTileMin) {
                        final Tile tile6 = array[n][n2 - 1];
                        if (tile6 != null && tile6.drawSecondary) {
                            if (tile6.drawPrimary) {
                                continue;
                            }
                            if ((tile2.gameObjectsEdgeMask * -1639156513 & 0x8) == 0x0) {
                                continue;
                            }
                        }
                    }
                    if (n2 >= Scene.Scene_cameraYTile && n2 < Scene.Scene_cameraYTileMax - 1) {
                        final Tile tile7 = array[n][n2 + 1];
                        if (tile7 != null && tile7.drawSecondary) {
                            if (tile7.drawPrimary) {
                                continue;
                            }
                            if ((tile2.gameObjectsEdgeMask * -1639156513 & 0x2) == 0x0) {
                                continue;
                            }
                        }
                    }
                }
                else {
                    b = true;
                }
                tile2.drawPrimary = false;
                if (tile2.linkedBelowTile != null) {
                    final Tile linkedBelowTile = tile2.linkedBelowTile;
                    if (linkedBelowTile.paint != null) {
                        if (!this.method1237(0, n, n2)) {
                            this.drawTileUnderlay(linkedBelowTile.paint, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n, n2);
                        }
                    }
                    else if (linkedBelowTile.model != null && !this.method1237(0, n, n2)) {
                        this.drawTileOverlay(linkedBelowTile.model, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n, n2);
                    }
                    final BoundaryObject boundaryObject = linkedBelowTile.boundaryObject;
                    if (boundaryObject != null) {
                        Client.jy(boundaryObject.renderable1, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject.x * -1998748175 - Scene.Scene_cameraX, boundaryObject.z * 1061912079 - Scene.Scene_cameraY, boundaryObject.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject.tag * -4009183385476919801L);
                    }
                    for (int i = 0; i < linkedBelowTile.gameObjectsCount * -422028371; ++i) {
                        final GameObject gameObject = linkedBelowTile.gameObjects[i];
                        if (gameObject != null) {
                            Client.jy(gameObject.renderable, gameObject.lastDrawn * -1521986263, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, gameObject.endY * -1546117209 - Scene.Scene_cameraX, gameObject.plane * 1042267931 - Scene.Scene_cameraY, gameObject.centerX * 1463075659 - Scene.Scene_cameraZ, gameObject.tag * 5016412888503339625L);
                        }
                    }
                }
                boolean b2 = false;
                if (tile2.paint != null) {
                    if (!this.method1237(n4, n, n2)) {
                        b2 = true;
                        if (tile2.paint.neColor * -1667175185 != 12345678 || (Scene.checkClick && n3 <= Scene.Scene_selectedPlane)) {
                            this.drawTileUnderlay(tile2.paint, n4, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n, n2);
                        }
                    }
                }
                else if (tile2.model != null && !this.method1237(n4, n, n2)) {
                    b2 = true;
                    this.drawTileOverlay(tile2.model, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n, n2);
                }
                int n5 = 0;
                int n6 = 0;
                final BoundaryObject boundaryObject2 = tile2.boundaryObject;
                final WallDecoration wallDecoration = tile2.wallDecoration;
                if (boundaryObject2 != null || wallDecoration != null) {
                    if (Scene.Scene_cameraXTile == n) {
                        ++n5;
                    }
                    else if (Scene.Scene_cameraXTile < n) {
                        n5 += 2;
                    }
                    if (Scene.Scene_cameraYTile == n2) {
                        n5 += 3;
                    }
                    else if (Scene.Scene_cameraYTile > n2) {
                        n5 += 6;
                    }
                    n6 = Scene.field2052[n5];
                    tile2.field1989 = Scene.field2045[n5] * 1933576483;
                }
                if (boundaryObject2 != null) {
                    if ((boundaryObject2.orientationA * -137992079 & Scene.field2053[n5]) != 0x0) {
                        if (boundaryObject2.orientationA * -137992079 == 16) {
                            tile2.drawGameObjectEdges = -875132571;
                            tile2.field1987 = Scene.field2055[n5] * 1761397621;
                            tile2.field1969 = 520035649 - tile2.field1987 * 1049420895;
                        }
                        else if (boundaryObject2.orientationA * -137992079 == 32) {
                            tile2.drawGameObjectEdges = -1750265142;
                            tile2.field1987 = Scene.field2032[n5] * 1761397621;
                            tile2.field1969 = 1040071298 - tile2.field1987 * 1049420895;
                        }
                        else if (boundaryObject2.orientationA * -137992079 == 64) {
                            tile2.drawGameObjectEdges = 794437012;
                            tile2.field1987 = Scene.field2021[n5] * 1761397621;
                            tile2.field1969 = 2080142596 - tile2.field1987 * 1049420895;
                        }
                        else {
                            tile2.drawGameObjectEdges = 1669569583;
                            tile2.field1987 = Scene.field2033[n5] * 1761397621;
                            tile2.field1969 = 1560106947 - tile2.field1987 * 1049420895;
                        }
                    }
                    else {
                        tile2.drawGameObjectEdges = 0;
                    }
                    if ((boundaryObject2.orientationA * -137992079 & n6) != 0x0 && !this.ge(n4, n, n2, boundaryObject2.orientationA * -137992079)) {
                        Client.jy(boundaryObject2.renderable1, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject2.x * -1998748175 - Scene.Scene_cameraX, boundaryObject2.z * 1061912079 - Scene.Scene_cameraY, boundaryObject2.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject2.tag * -4009183385476919801L);
                    }
                    if ((boundaryObject2.orientationB * 379413203 & n6) != 0x0 && !this.ge(n4, n, n2, boundaryObject2.orientationB * 379413203)) {
                        Client.jy(boundaryObject2.renderable2, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject2.x * -1998748175 - Scene.Scene_cameraX, boundaryObject2.z * 1061912079 - Scene.Scene_cameraY, boundaryObject2.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject2.tag * -4009183385476919801L);
                    }
                }
                if (wallDecoration != null && !this.method1270(n4, n, n2, wallDecoration.renderable1.height * 1550732737)) {
                    if ((wallDecoration.orientation * -607881373 & n6) != 0x0) {
                        Client.jy(wallDecoration.renderable1, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, wallDecoration.x * 1346340783 - Scene.Scene_cameraX + wallDecoration.xOffset * 1353438721, wallDecoration.z * 452898185 - Scene.Scene_cameraY, wallDecoration.y * 1328351163 - Scene.Scene_cameraZ + wallDecoration.yOffset * 1573434537, wallDecoration.tag * -4691380879163567243L);
                    }
                    else if (wallDecoration.orientation * -607881373 == 256) {
                        final int n7 = wallDecoration.x * 1346340783 - Scene.Scene_cameraX;
                        final int n8 = wallDecoration.z * 452898185 - Scene.Scene_cameraY;
                        final int n9 = wallDecoration.y * 1328351163 - Scene.Scene_cameraZ;
                        final int n10 = wallDecoration.orientation2 * -1711060009;
                        int n11;
                        if (n10 == 1 || n10 == 2) {
                            n11 = -n7;
                        }
                        else {
                            n11 = n7;
                        }
                        int n12;
                        if (n10 == 2 || n10 == 3) {
                            n12 = -n9;
                        }
                        else {
                            n12 = n9;
                        }
                        if (n12 < n11) {
                            Client.jy(wallDecoration.renderable1, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n7 + wallDecoration.xOffset * 1353438721, n8, n9 + wallDecoration.yOffset * 1573434537, wallDecoration.tag * -4691380879163567243L);
                        }
                        else if (wallDecoration.renderable2 != null) {
                            Client.jy(wallDecoration.renderable2, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n7, n8, n9, wallDecoration.tag * -4691380879163567243L);
                        }
                    }
                }
                if (b2) {
                    final FloorDecoration floorDecoration = tile2.floorDecoration;
                    if (floorDecoration != null) {
                        Client.jy(floorDecoration.renderable, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, floorDecoration.x * 487195023 - Scene.Scene_cameraX, floorDecoration.z * 1777058639 - Scene.Scene_cameraY, floorDecoration.y * -1480835961 - Scene.Scene_cameraZ, floorDecoration.tag * 3423223696102332293L);
                    }
                    final ItemLayer itemLayer = tile2.itemLayer;
                    if (itemLayer != null && itemLayer.height * -1118938495 == 0) {
                        if (itemLayer.second != null) {
                            Client.jy(itemLayer.second, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer.x * -1473635399 - Scene.Scene_cameraX, itemLayer.z * 2064997173 - Scene.Scene_cameraY, itemLayer.y * -1839139071 - Scene.Scene_cameraZ, itemLayer.tag * -8562400470617197071L);
                        }
                        if (itemLayer.third != null) {
                            Client.jy(itemLayer.third, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer.x * -1473635399 - Scene.Scene_cameraX, itemLayer.z * 2064997173 - Scene.Scene_cameraY, itemLayer.y * -1839139071 - Scene.Scene_cameraZ, itemLayer.tag * -8562400470617197071L);
                        }
                        if (itemLayer.first != null) {
                            Client.jy(itemLayer.first, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer.x * -1473635399 - Scene.Scene_cameraX, itemLayer.z * 2064997173 - Scene.Scene_cameraY, itemLayer.y * -1839139071 - Scene.Scene_cameraZ, itemLayer.tag * -8562400470617197071L);
                        }
                    }
                }
                final int n13 = tile2.gameObjectsEdgeMask * -1639156513;
                if (n13 != 0) {
                    if (n < Scene.Scene_cameraXTile && (n13 & 0x4) != 0x0) {
                        final Tile tile8 = array[n + 1][n2];
                        if (tile8 != null && tile8.drawSecondary) {
                            Scene.Scene_tilesDeque.addFirst(tile8);
                        }
                    }
                    if (n2 < Scene.Scene_cameraYTile && (n13 & 0x2) != 0x0) {
                        final Tile tile9 = array[n][n2 + 1];
                        if (tile9 != null && tile9.drawSecondary) {
                            Scene.Scene_tilesDeque.addFirst(tile9);
                        }
                    }
                    if (n > Scene.Scene_cameraXTile && (n13 & 0x1) != 0x0) {
                        final Tile tile10 = array[n - 1][n2];
                        if (tile10 != null && tile10.drawSecondary) {
                            Scene.Scene_tilesDeque.addFirst(tile10);
                        }
                    }
                    if (n2 > Scene.Scene_cameraYTile && (n13 & 0x8) != 0x0) {
                        final Tile tile11 = array[n][n2 - 1];
                        if (tile11 != null && tile11.drawSecondary) {
                            Scene.Scene_tilesDeque.addFirst(tile11);
                        }
                    }
                }
            }
            if (tile2.drawGameObjectEdges * 1223983431 != 0) {
                boolean b3 = true;
                for (int j = 0; j < tile2.gameObjectsCount * -422028371; ++j) {
                    if (tile2.gameObjects[j].z * -1033646519 != Scene.Scene_drawnCount && (tile2.gameObjectEdgeMasks[j] & tile2.drawGameObjectEdges * 1223983431) == tile2.field1987 * -1655477027) {
                        b3 = false;
                        break;
                    }
                }
                if (b3) {
                    final BoundaryObject boundaryObject3 = tile2.boundaryObject;
                    if (!this.ge(n4, n, n2, boundaryObject3.orientationA * -137992079)) {
                        Client.jy(boundaryObject3.renderable1, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject3.x * -1998748175 - Scene.Scene_cameraX, boundaryObject3.z * 1061912079 - Scene.Scene_cameraY, boundaryObject3.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject3.tag * -4009183385476919801L);
                    }
                    tile2.drawGameObjectEdges = 0;
                }
            }
            if (tile2.drawGameObjects) {
                try {
                    final int n14 = tile2.gameObjectsCount * -422028371;
                    tile2.drawGameObjects = false;
                    int k = 0;
                Label_2868:
                    for (int l = 0; l < n14; ++l) {
                        final GameObject gameObject2 = tile2.gameObjects[l];
                        if (gameObject2.z * -1033646519 != Scene.Scene_drawnCount) {
                            for (int n15 = gameObject2.flags * 626811319; n15 <= gameObject2.startY * -1242897449; ++n15) {
                                for (int n16 = gameObject2.field2271 * 2004902003; n16 <= gameObject2.orientation * -80616117; ++n16) {
                                    final Tile tile12 = array[n15][n16];
                                    if (tile12.drawPrimary) {
                                        tile2.drawGameObjects = true;
                                        continue Label_2868;
                                    }
                                    if (tile12.drawGameObjectEdges * 1223983431 != 0) {
                                        int n17 = 0;
                                        if (n15 > gameObject2.flags * 626811319) {
                                            ++n17;
                                        }
                                        if (n15 < gameObject2.startY * -1242897449) {
                                            n17 += 4;
                                        }
                                        if (n16 > gameObject2.field2271 * 2004902003) {
                                            n17 += 8;
                                        }
                                        if (n16 < gameObject2.orientation * -80616117) {
                                            n17 += 2;
                                        }
                                        if ((n17 & tile12.drawGameObjectEdges * 1223983431) == tile2.field1969 * 485316675) {
                                            tile2.drawGameObjects = true;
                                            continue Label_2868;
                                        }
                                    }
                                }
                            }
                            Scene.gameObjects[k++] = gameObject2;
                            int n18 = Scene.Scene_cameraXTile - gameObject2.flags * 626811319;
                            final int n19 = gameObject2.startY * -1242897449 - Scene.Scene_cameraXTile;
                            if (n19 > n18) {
                                n18 = n19;
                            }
                            final int n20 = Scene.Scene_cameraYTile - gameObject2.field2271 * 2004902003;
                            final int n21 = gameObject2.orientation * -80616117 - Scene.Scene_cameraYTile;
                            if (n21 > n20) {
                                gameObject2.startX = (n18 + n21) * -1266251803;
                            }
                            else {
                                gameObject2.startX = (n18 + n20) * -1266251803;
                            }
                        }
                    }
                    while (k > 0) {
                        int n22 = -50;
                        int n23 = -1;
                        for (int n24 = 0; n24 < k; ++n24) {
                            final GameObject gameObject3 = Scene.gameObjects[n24];
                            if (gameObject3.z * -1033646519 != Scene.Scene_drawnCount) {
                                if (gameObject3.startX * 308174317 > n22) {
                                    n22 = gameObject3.startX * 308174317;
                                    n23 = n24;
                                }
                                else if (gameObject3.startX * 308174317 == n22) {
                                    final int n25 = gameObject3.endY * -1546117209 - Scene.Scene_cameraX;
                                    final int n26 = gameObject3.centerX * 1463075659 - Scene.Scene_cameraZ;
                                    final int n27 = Scene.gameObjects[n23].endY * -1546117209 - Scene.Scene_cameraX;
                                    final int n28 = Scene.gameObjects[n23].centerX * 1463075659 - Scene.Scene_cameraZ;
                                    if (n25 * n25 + n26 * n26 > n27 * n27 + n28 * n28) {
                                        n23 = n24;
                                    }
                                }
                            }
                        }
                        if (n23 == -1) {
                            break;
                        }
                        final GameObject gameObject4 = Scene.gameObjects[n23];
                        gameObject4.z = Scene.Scene_drawnCount * -76184583;
                        if (!this.method1272(n4, gameObject4.flags * 626811319, gameObject4.startY * -1242897449, gameObject4.field2271 * 2004902003, gameObject4.orientation * -80616117, gameObject4.renderable.height * 1550732737)) {
                            Client.jy(gameObject4.renderable, gameObject4.lastDrawn * -1521986263, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, gameObject4.endY * -1546117209 - Scene.Scene_cameraX, gameObject4.plane * 1042267931 - Scene.Scene_cameraY, gameObject4.centerX * 1463075659 - Scene.Scene_cameraZ, gameObject4.tag * 5016412888503339625L);
                        }
                        for (int n29 = gameObject4.flags * 626811319; n29 <= gameObject4.startY * -1242897449; ++n29) {
                            for (int n30 = gameObject4.field2271 * 2004902003; n30 <= gameObject4.orientation * -80616117; ++n30) {
                                final Tile tile13 = array[n29][n30];
                                if (tile13.drawGameObjectEdges * 1223983431 != 0) {
                                    Scene.Scene_tilesDeque.addFirst(tile13);
                                }
                                else if ((n29 != n || n30 != n2) && tile13.drawSecondary) {
                                    Scene.Scene_tilesDeque.addFirst(tile13);
                                }
                            }
                        }
                    }
                    if (tile2.drawGameObjects) {
                        continue;
                    }
                }
                catch (Exception ex) {
                    tile2.drawGameObjects = false;
                }
            }
            if (!tile2.drawSecondary) {
                continue;
            }
            if (tile2.drawGameObjectEdges * 1223983431 != 0) {
                continue;
            }
            if (n <= Scene.Scene_cameraXTile && n > Scene.Scene_cameraXTileMin) {
                final Tile tile14 = array[n - 1][n2];
                if (tile14 != null && tile14.drawSecondary) {
                    continue;
                }
            }
            if (n >= Scene.Scene_cameraXTile && n < Scene.Scene_cameraXTileMax - 1) {
                final Tile tile15 = array[n + 1][n2];
                if (tile15 != null && tile15.drawSecondary) {
                    continue;
                }
            }
            if (n2 <= Scene.Scene_cameraYTile && n2 > Scene.Scene_cameraYTileMin) {
                final Tile tile16 = array[n][n2 - 1];
                if (tile16 != null && tile16.drawSecondary) {
                    continue;
                }
            }
            if (n2 >= Scene.Scene_cameraYTile && n2 < Scene.Scene_cameraYTileMax - 1) {
                final Tile tile17 = array[n][n2 + 1];
                if (tile17 != null && tile17.drawSecondary) {
                    continue;
                }
            }
            tile2.drawSecondary = false;
            --Scene.tileUpdateCount;
            final ItemLayer itemLayer2 = tile2.itemLayer;
            if (itemLayer2 != null && itemLayer2.height * -1118938495 != 0) {
                if (itemLayer2.second != null) {
                    Client.jy(itemLayer2.second, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer2.x * -1473635399 - Scene.Scene_cameraX, itemLayer2.z * 2064997173 - Scene.Scene_cameraY - itemLayer2.height * -1118938495, itemLayer2.y * -1839139071 - Scene.Scene_cameraZ, itemLayer2.tag * -8562400470617197071L);
                }
                if (itemLayer2.third != null) {
                    Client.jy(itemLayer2.third, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer2.x * -1473635399 - Scene.Scene_cameraX, itemLayer2.z * 2064997173 - Scene.Scene_cameraY - itemLayer2.height * -1118938495, itemLayer2.y * -1839139071 - Scene.Scene_cameraZ, itemLayer2.tag * -8562400470617197071L);
                }
                if (itemLayer2.first != null) {
                    Client.jy(itemLayer2.first, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, itemLayer2.x * -1473635399 - Scene.Scene_cameraX, itemLayer2.z * 2064997173 - Scene.Scene_cameraY - itemLayer2.height * -1118938495, itemLayer2.y * -1839139071 - Scene.Scene_cameraZ, itemLayer2.tag * -8562400470617197071L);
                }
            }
            if (tile2.field1989 * -1504022901 != 0) {
                final WallDecoration wallDecoration2 = tile2.wallDecoration;
                if (wallDecoration2 != null && !this.method1270(n4, n, n2, wallDecoration2.renderable1.height * 1550732737)) {
                    if ((wallDecoration2.orientation * -607881373 & tile2.field1989 * -1504022901) != 0x0) {
                        Client.jy(wallDecoration2.renderable1, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, wallDecoration2.x * 1346340783 - Scene.Scene_cameraX + wallDecoration2.xOffset * 1353438721, wallDecoration2.z * 452898185 - Scene.Scene_cameraY, wallDecoration2.y * 1328351163 - Scene.Scene_cameraZ + wallDecoration2.yOffset * 1573434537, wallDecoration2.tag * -4691380879163567243L);
                    }
                    else if (wallDecoration2.orientation * -607881373 == 256) {
                        final int n31 = wallDecoration2.x * 1346340783 - Scene.Scene_cameraX;
                        final int n32 = wallDecoration2.z * 452898185 - Scene.Scene_cameraY;
                        final int n33 = wallDecoration2.y * 1328351163 - Scene.Scene_cameraZ;
                        final int n34 = wallDecoration2.orientation2 * -1711060009;
                        int n35;
                        if (n34 == 1 || n34 == 2) {
                            n35 = -n31;
                        }
                        else {
                            n35 = n31;
                        }
                        int n36;
                        if (n34 == 2 || n34 == 3) {
                            n36 = -n33;
                        }
                        else {
                            n36 = n33;
                        }
                        if (n36 >= n35) {
                            Client.jy(wallDecoration2.renderable1, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n31 + wallDecoration2.xOffset * 1353438721, n32, n33 + wallDecoration2.yOffset * 1573434537, wallDecoration2.tag * -4691380879163567243L);
                        }
                        else if (wallDecoration2.renderable2 != null) {
                            Client.jy(wallDecoration2.renderable2, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, n31, n32, n33, wallDecoration2.tag * -4691380879163567243L);
                        }
                    }
                }
                final BoundaryObject boundaryObject4 = tile2.boundaryObject;
                if (boundaryObject4 != null) {
                    if ((boundaryObject4.orientationB * 379413203 & tile2.field1989 * -1504022901) != 0x0 && !this.ge(n4, n, n2, boundaryObject4.orientationB * 379413203)) {
                        Client.jy(boundaryObject4.renderable2, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject4.x * -1998748175 - Scene.Scene_cameraX, boundaryObject4.z * 1061912079 - Scene.Scene_cameraY, boundaryObject4.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject4.tag * -4009183385476919801L);
                    }
                    if ((boundaryObject4.orientationA * -137992079 & tile2.field1989 * -1504022901) != 0x0 && !this.ge(n4, n, n2, boundaryObject4.orientationA * -137992079)) {
                        Client.jy(boundaryObject4.renderable1, 0, Scene.Scene_cameraPitchSine, Scene.Scene_cameraPitchCosine, Scene.Scene_cameraYawSine, Scene.Scene_cameraYawCosine, boundaryObject4.x * -1998748175 - Scene.Scene_cameraX, boundaryObject4.z * 1061912079 - Scene.Scene_cameraY, boundaryObject4.y * -1171883603 - Scene.Scene_cameraZ, boundaryObject4.tag * -4009183385476919801L);
                    }
                }
            }
            if (n3 < this.planes - 1) {
                final Tile tile18 = this.tiles[n3 + 1][n][n2];
                if (tile18 != null && tile18.drawSecondary) {
                    Scene.Scene_tilesDeque.addFirst(tile18);
                }
            }
            if (n < Scene.Scene_cameraXTile) {
                final Tile tile19 = array[n + 1][n2];
                if (tile19 != null && tile19.drawSecondary) {
                    Scene.Scene_tilesDeque.addFirst(tile19);
                }
            }
            if (n2 < Scene.Scene_cameraYTile) {
                final Tile tile20 = array[n][n2 + 1];
                if (tile20 != null && tile20.drawSecondary) {
                    Scene.Scene_tilesDeque.addFirst(tile20);
                }
            }
            if (n > Scene.Scene_cameraXTile) {
                final Tile tile21 = array[n - 1][n2];
                if (tile21 != null && tile21.drawSecondary) {
                    Scene.Scene_tilesDeque.addFirst(tile21);
                }
            }
            if (n2 <= Scene.Scene_cameraYTile) {
                continue;
            }
            final Tile tile22 = array[n][n2 - 1];
            if (tile22 == null || !tile22.drawSecondary) {
                continue;
            }
            Scene.Scene_tilesDeque.addFirst(tile22);
        }
    }
    
    public void du(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.planes; ++i) {
            for (int j = 0; j < this.xSize; ++j) {
                for (int k = 0; k < this.ySize; ++k) {
                    final Tile tile = this.tiles[i][j][k];
                    if (tile != null) {
                        final BoundaryObject boundaryObject = tile.boundaryObject;
                        if (boundaryObject != null && boundaryObject.renderable1 instanceof ModelData) {
                            final ModelData modelData = (ModelData)boundaryObject.renderable1;
                            this.method1260(modelData, i, j, k, 1, 1);
                            if (boundaryObject.renderable2 instanceof ModelData) {
                                final ModelData modelData2 = (ModelData)boundaryObject.renderable2;
                                this.method1260(modelData2, i, j, k, 1, 1);
                                ModelData.method1198(modelData, modelData2, 0, 0, 0, false);
                                boundaryObject.renderable2 = modelData2.dg(modelData2.ambient, modelData2.contrast, n, n2, n3);
                            }
                            boundaryObject.renderable1 = modelData.dg(modelData.ambient, modelData.contrast, n, n2, n3);
                        }
                        for (int l = 0; l < tile.gameObjectsCount * -422028371; ++l) {
                            final GameObject gameObject = tile.gameObjects[l];
                            if (gameObject != null && gameObject.renderable instanceof ModelData) {
                                final ModelData modelData3 = (ModelData)gameObject.renderable;
                                this.method1260(modelData3, i, j, k, gameObject.startY * -1242897449 - gameObject.flags * 626811319 + 1, gameObject.orientation * -80616117 - gameObject.field2271 * 2004902003 + 1);
                                gameObject.renderable = modelData3.dg(modelData3.ambient, modelData3.contrast, n, n2, n3);
                            }
                        }
                        final FloorDecoration floorDecoration = tile.floorDecoration;
                        if (floorDecoration != null && floorDecoration.renderable instanceof ModelData) {
                            final ModelData modelData4 = (ModelData)floorDecoration.renderable;
                            tb(this, modelData4, i, j, k);
                            floorDecoration.renderable = modelData4.dg(modelData4.ambient, modelData4.contrast, n, n2, n3);
                        }
                    }
                }
            }
        }
    }
    
    public short[][][] getUnderlayIds() {
        return this.wf;
    }
    
    public void generateHouses() {
        this.jr = new int[4][104][104];
        final Tile[][][] je = this.je();
        int n = 1;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 104; ++j) {
                for (int k = 0; k < 104; ++k) {
                    final Tile tile = je[i][k][j];
                    if (tile != null) {
                        if (this.jr[i][k][j] == 0 && mw(i, k, j)) {
                            this.removeFloorDecoration(tile, n);
                            ++n;
                        }
                    }
                }
            }
        }
    }
    
    public short[][][] getOverlayIds() {
        return this.cb;
    }
    
    public byte[][][] getTileShapes() {
        return this.sh;
    }
    
    public void setDrawDistance(final int eb) {
        Scene.eb = eb;
    }
    
    public void removeGameObject(final net.runelite.api.GameObject gameObject) {
        this.removeGameObject((GameObject)gameObject);
    }
    
    public int getMinLevel() {
        return this.minPlane;
    }
    
    public void setRoofRemovalMode(final int yw) {
        this.yw = yw;
    }
    
    public int getDrawDistance() {
        return Scene.eb;
    }
    
    public void setMinLevel(final int minPlane) {
        this.minPlane = minPlane;
    }
}
