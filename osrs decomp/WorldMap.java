import net.runelite.api.worldmap.WorldMapRenderer;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.Point;
import net.runelite.api.worldmap.WorldMapData;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import net.runelite.api.RenderOverview;

// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMap implements RenderOverview
{
    int field3902;
    int worldMapDisplayX;
    int flashCount;
    AbstractArchive WorldMap_archive;
    AbstractArchive WorldMap_geographyArchive;
    AbstractArchive WorldMap_groundArchive;
    boolean field3908;
    static final FontName fontNameVerdana13;
    int centerTileX;
    Font font;
    HashMap fonts;
    IndexedSprite[] mapSceneSprites;
    static final int af = -65536;
    int worldMapTargetY;
    WorldMapArea currentMapArea;
    static final int au = 3;
    HashSet enabledCategories;
    WorldMapArchiveLoader cacheLoader;
    WorldMapManager worldMapManager;
    int centerTileY;
    int worldMapTargetX;
    int flashCycle;
    float zoom;
    float zoomTarget;
    HashSet field3924;
    boolean perpetualFlash;
    static final FontName fontNameVerdana15;
    int worldMapDisplayY;
    int maxFlashCount;
    static final float ac = 30.0f;
    static final FontName fontNameVerdana11;
    HashSet flashingElements;
    WorldMapArea field3931;
    WorldMapArea mainMapArea;
    int field3933;
    int minCachedTileX;
    int worldMapDisplayHeight;
    int field3936;
    long field3937;
    int field3938;
    int field3939;
    int worldMapDisplayWidth;
    HashSet enabledElements;
    int field3942;
    HashSet enabledElementIds;
    HashSet field3944;
    boolean elementsDisabled;
    int field3946;
    int cyclesPerFlash;
    List field3948;
    Iterator iconIterator;
    HashMap details;
    Coord mouseCoord;
    public boolean showCoord;
    SpritePixels sprite;
    int cachedPixelsPerTile;
    final int[] menuOpcodes;
    int minCachedTileY;
    int field3957;
    
    public WorldMap() {
        this.worldMapTargetX = -2080912417;
        this.worldMapTargetY = -667691095;
        this.worldMapDisplayWidth = 410569687;
        this.worldMapDisplayHeight = -224660999;
        this.worldMapDisplayX = 468823633;
        this.worldMapDisplayY = 821936197;
        this.maxFlashCount = 1412277301;
        this.cyclesPerFlash = 726470486;
        this.perpetualFlash = false;
        this.flashingElements = null;
        this.flashCount = 297924373;
        this.flashCycle = -1698997397;
        this.field3933 = 1462155693;
        this.field3942 = -387305683;
        this.field3902 = -99962399;
        this.field3936 = -531836949;
        this.field3908 = true;
        this.enabledElements = new HashSet();
        this.enabledCategories = new HashSet();
        this.enabledElementIds = new HashSet();
        this.field3944 = new HashSet();
        this.elementsDisabled = false;
        this.field3946 = 0;
        this.menuOpcodes = new int[] { 1008, 1009, 1010, 1011, 1012 };
        this.field3924 = new HashSet();
        this.mouseCoord = null;
        this.showCoord = false;
        this.minCachedTileX = 1316647483;
        this.minCachedTileY = -1178523109;
        this.field3957 = -1812867423;
    }
    
    static {
        fontNameVerdana11 = FontName.FontName_verdana11;
        fontNameVerdana13 = FontName.FontName_verdana13;
        fontNameVerdana15 = FontName.FontName_verdana15;
    }
    
    public int fp() {
        if (null == this.currentMapArea) {
            return -1;
        }
        return -84102297 * this.centerTileX + this.currentMapArea.getRegionLowX(16748608) * 64;
    }
    
    public void addElementMenuOptions(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        try {
            if (!this.cacheLoader.isLoaded(-1414715817)) {
                if (n7 == 1197548346) {
                    throw new IllegalStateException();
                }
            }
            else {
                final int n8 = (int)Math.ceil(n3 / this.zoom);
                final int n9 = (int)Math.ceil(n4 / this.zoom);
                final List method1478 = this.worldMapManager.method1478(this.centerTileX * -84102297 - n8 / 2 - 1, -632186207 * this.centerTileY - n9 / 2 - 1, n8 / 2 + this.centerTileX * -84102297 + 1, 1 + (n9 / 2 + this.centerTileY * -632186207), n, n2, n3, n4, n5, n6, 135663336);
                if (!method1478.isEmpty()) {
                    final Iterator<AbstractWorldMapIcon> iterator = method1478.iterator();
                    while (iterator.hasNext()) {
                        if (n7 == 1197548346) {
                            throw new IllegalStateException();
                        }
                        final AbstractWorldMapIcon abstractWorldMapIcon = iterator.next();
                        final WorldMapElement method1479 = class354.method1935(abstractWorldMapIcon.getElement(-1586895081), 1958358177);
                        boolean b = false;
                        for (int i = this.menuOpcodes.length - 1; i >= 0; --i) {
                            if (n7 == 1197548346) {
                                throw new IllegalStateException();
                            }
                            if (null != method1479.menuActions[i]) {
                                if (n7 == 1197548346) {
                                    throw new IllegalStateException();
                                }
                                MenuAction.insertMenuItemNoShift(method1479.menuActions[i], method1479.menuTargetName, this.menuOpcodes[i], abstractWorldMapIcon.getElement(-777812869), abstractWorldMapIcon.coord1.packed(-964267539), abstractWorldMapIcon.coord2.packed(-964267539), (byte)124);
                                b = true;
                            }
                        }
                        if (b) {
                            return;
                        }
                    }
                    return;
                }
                if (n7 == 1197548346) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.cs(" + ')');
        }
    }
    
    public int dp() {
        if (this.currentMapArea == null) {
            return -1;
        }
        return WorldMapArea.wo(this.currentMapArea, -964267539);
    }
    
    public void setMaxFlashCount(final int n, final byte b) {
        try {
            if (n >= 1) {
                if (b == 22) {
                    throw new IllegalStateException();
                }
                this.cyclesPerFlash = 787623523 * n;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bg(" + ')');
        }
    }
    
    public void en() {
        this.cacheLoader.load(-1171421311);
    }
    
    public AbstractWorldMapIcon iconStart(final int n) {
        try {
            if (!this.cacheLoader.isLoaded(-1073850094)) {
                if (n >= 540714456) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                if (this.worldMapManager.isLoaded(-1519198855)) {
                    final HashMap buildIcons = this.worldMapManager.buildIcons((byte)47);
                    this.field3948 = new LinkedList();
                    final Iterator<List> iterator = buildIcons.values().iterator();
                    while (iterator.hasNext()) {
                        if (n >= 540714456) {
                            throw new IllegalStateException();
                        }
                        this.field3948.addAll(iterator.next());
                    }
                    this.iconIterator = this.field3948.iterator();
                    return this.iconNext((byte)(-8));
                }
                if (n >= 540714456) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ca(" + ')');
        }
    }
    
    public void setZoomPercentage(final int n, final int n2) {
        try {
            this.zoomTarget = this.getZoomFromPercentage(n, -1224711390);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ad(" + ')');
        }
    }
    
    void cd() {
        if (!this.hasTarget(-1587112547)) {
            return;
        }
        int a = this.worldMapTargetX * 506744801 - this.centerTileX * -84102297;
        int a2 = this.worldMapTargetY * 423154760 - this.centerTileY * -632186207;
        if (a != 0) {
            a /= Math.min(8, Math.abs(a));
        }
        if (a2 != 0) {
            a2 /= Math.min(8, Math.abs(a2));
        }
        this.setWorldMapPosition(-84102297 * this.centerTileX + a, a2 + this.centerTileY * -632186207, true, (short)254);
        if (this.worldMapTargetX * 506744801 == this.centerTileX * -84102297 && -1372000174 * this.worldMapTargetY == this.centerTileY * -806815404) {
            this.worldMapTargetX = -2080912417;
            this.worldMapTargetY = 1232644134;
        }
    }
    
    public void flashCategory(final int n, final int n2) {
        try {
            this.flashingElements = new HashSet();
            this.flashCount = 0;
            this.flashCycle = 0;
            for (int i = 0; i < -1703136055 * class328.WorldMapElement_count; ++i) {
                if (n2 <= 307569287) {
                    throw new IllegalStateException();
                }
                if (class354.method1935(i, 1859815020) == null) {
                    if (n2 <= 307569287) {
                        throw new IllegalStateException();
                    }
                }
                else if (class354.method1935(i, 2066685131).category * -461862935 == n) {
                    this.flashingElements.add(class354.method1935(i, 2028862231).objectId * 219774827);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ba(" + ')');
        }
    }
    
    public static void flashCategory(final WorldMap worldMap, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (worldMap == null) {
            worldMap.draw(n, n, n, n, n, n);
            return;
        }
        try {
            final int[] array = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(array);
            Rasterizer2D.Rasterizer2D_setClip(n, n2, n + n3, n2 + n4);
            Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, -16777216);
            final int ud = WorldMapArchiveLoader.ud(worldMap.cacheLoader, (byte)75);
            if (ud < 100) {
                lt(worldMap, n, n2, n3, n4, ud, -2130359390);
                return;
            }
            if (!worldMap.worldMapManager.isLoaded(-1294765646)) {
                if (n6 >= -2105409406) {
                    throw new IllegalStateException();
                }
                worldMap.worldMapManager.load(worldMap.WorldMap_archive, worldMap.currentMapArea.getInternalName(1804607176), Client.isMembersWorld, (short)(-17915));
                if (!worldMap.worldMapManager.isLoaded(-1758646748)) {
                    return;
                }
            }
            if (worldMap.flashingElements != null) {
                if (n6 >= -2105409406) {
                    throw new IllegalStateException();
                }
                worldMap.flashCycle += 1698997397;
                if (worldMap.flashCycle * 1104873149 % (worldMap.cyclesPerFlash * 1369293643) == 0) {
                    if (n6 >= -2105409406) {
                        throw new IllegalStateException();
                    }
                    worldMap.flashCycle = 0;
                    worldMap.flashCount -= 297924373;
                }
                if (worldMap.flashCount * 676356035 >= -1444238761 * worldMap.maxFlashCount) {
                    if (n6 >= -2105409406) {
                        return;
                    }
                    if (!worldMap.perpetualFlash) {
                        if (n6 >= -2105409406) {
                            return;
                        }
                        worldMap.flashingElements = null;
                    }
                }
            }
            final int n7 = (int)Math.ceil(n3 / worldMap.zoom);
            final int n8 = (int)Math.ceil(n4 / worldMap.zoom);
            worldMap.worldMapManager.drawTiles(-84102297 * worldMap.centerTileX - n7 / 2, -632186207 * worldMap.centerTileY - n8 / 2, worldMap.centerTileX * -84102297 + n7 / 2, n8 / 2 + worldMap.centerTileY * -632186207, n, n2, n + n3, n4 + n2, 1642688297);
            if (!worldMap.elementsDisabled) {
                boolean b = false;
                if (n5 - 460446351 * worldMap.field3946 > 100) {
                    if (n6 >= -2105409406) {
                        return;
                    }
                    worldMap.field3946 = n5 * -2042100625;
                    b = true;
                }
                worldMap.worldMapManager.drawElements(worldMap.centerTileX * -84102297 - n7 / 2, -632186207 * worldMap.centerTileY - n8 / 2, -84102297 * worldMap.centerTileX + n7 / 2, -632186207 * worldMap.centerTileY + n8 / 2, n, n2, n + n3, n2 + n4, worldMap.field3944, worldMap.flashingElements, worldMap.flashCycle * 1104873149, worldMap.cyclesPerFlash * 1369293643, b, -1771656263);
            }
            ko(worldMap, n, n2, n3, n4, n7, n8, 1052800047);
            if (324465533 * Client.staffModLevel >= 2) {
                if (n6 >= -2105409406) {
                    return;
                }
                if (worldMap.showCoord) {
                    if (n6 >= -2105409406) {
                        throw new IllegalStateException();
                    }
                    if (worldMap.mouseCoord != null) {
                        class492.xb(worldMap.font, "Coord: " + worldMap.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, 16776960, -1);
                    }
                }
            }
            worldMap.worldMapDisplayWidth = n7 * -410569687;
            worldMap.worldMapDisplayHeight = n8 * 224660999;
            worldMap.worldMapDisplayX = -468823633 * n;
            worldMap.worldMapDisplayY = n2 * -821936197;
            Rasterizer2D.Rasterizer2D_setClipArray(array);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.as(" + ')');
        }
    }
    
    void drawLoading(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (class132.field1277 != null) {
            final int n7 = -678181206 / (-1683757762 * this.worldMapManager.pixelsPerTile);
            final int n8 = 512 + n3;
            final int n9 = n4 + 512;
            final float n10 = 1.0f;
            final int n11 = (int)(n8 / n10);
            final int n12 = (int)(n9 / n10);
            final int n13 = this.getDisplayX(-1198510009) - n5 / 2 - n7;
            final int n14 = this.getDisplayY((byte)0) - n6 / 2 - n7;
            int n15 = n - this.worldMapManager.pixelsPerTile * -1013171018 * (n7 + n13 - this.minCachedTileX * -460898343);
            int n16 = n2 - (n7 - (n14 - this.minCachedTileY * 627335149)) * (-291103341 * this.worldMapManager.pixelsPerTile);
            if (this.method2366(n11, n12, n15, n16, n3, n4, 25950892)) {
                if (this.sprite != null && this.sprite.subWidth == n11 && n12 == this.sprite.subHeight) {
                    Arrays.fill(this.sprite.pixels, 0);
                }
                else {
                    this.sprite = new SpritePixels(n11, n12);
                }
                this.minCachedTileX = (this.getDisplayX(-1018350009) - n5 / 2 - n7) * -55075052;
                this.minCachedTileY = (this.getDisplayY((byte)0) - n6 / 2 - n7) * 1178523109;
                this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile * 219395697;
                class132.field1277.method1938(this.minCachedTileX * 334129421, 627335149 * this.minCachedTileY, this.sprite, 1540315502 * this.cachedPixelsPerTile / n10, 2709359);
                this.field3957 = Client.field648 * 1636039151;
                n15 = n - this.worldMapManager.pixelsPerTile * 631525003 * (n7 + n13 - this.minCachedTileX * -17556661);
                n16 = n2 - (n7 - (n14 - 627335149 * this.minCachedTileY)) * (this.worldMapManager.pixelsPerTile * -112773775);
            }
            Rasterizer2D.Rasterizer2D_fillRectangleAlpha(n, n2, n3, n4, 0, 847653599);
            if (1.0f == n10) {
                this.sprite.method2631(n15, n16, -890666271);
            }
            else {
                this.sprite.method2607(n15, n16, (int)(n11 * n10), (int)(n10 * n12), 564798997);
            }
        }
    }
    
    public void cr(final int n, final int n2, final boolean b, final int n3, final int n4, final int n5, final int n6) {
        if (!this.cacheLoader.isLoaded(1800406803)) {
            return;
        }
        this.smoothZoom(-232932068);
        this.scrollToTarget(-1717257914);
        if (!b) {
            return;
        }
        final int n7 = (int)Math.ceil(n5 / this.zoom);
        final int n8 = (int)Math.ceil(n6 / this.zoom);
        final List method1478 = this.worldMapManager.method1478(-84102297 * this.centerTileX - n7 / 2 - 1, this.centerTileY * -632186207 - n8 / 2 - 1, 1 + (this.centerTileX * -84102297 + n7 / 2), 1 + (n8 / 2 + this.centerTileY * -632186207), n3, n4, n5, n6, n, n2, 1549343178);
        final HashSet<AbstractWorldMapIcon> field3924 = new HashSet<AbstractWorldMapIcon>();
        for (final AbstractWorldMapIcon abstractWorldMapIcon : method1478) {
            field3924.add(abstractWorldMapIcon);
            final ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.setArgs(new Object[] { new WorldMapEvent(abstractWorldMapIcon.getElement(-1580649861), abstractWorldMapIcon.coord1, abstractWorldMapIcon.coord2), n, n2 }, 214587661);
            if (this.field3924.contains(abstractWorldMapIcon)) {
                scriptEvent.setType(17, 1732434875);
            }
            else {
                scriptEvent.setType(15, -1324562100);
            }
            HealthBarUpdate.set(scriptEvent, (byte)30);
        }
        for (final AbstractWorldMapIcon o : this.field3924) {
            if (!field3924.contains(o)) {
                final ScriptEvent scriptEvent2 = new ScriptEvent();
                scriptEvent2.setArgs(new Object[] { new WorldMapEvent(o.getElement(-582894896), o.coord1, o.coord2), n, n2 }, 1652971656);
                scriptEvent2.setType(16, -812174463);
                HealthBarUpdate.set(scriptEvent2, (byte)(-14));
            }
        }
        this.field3924 = field3924;
    }
    
    public boolean isCategoryDisabled(final int i, final byte b) {
        try {
            boolean b2;
            if (!this.enabledCategories.contains(i)) {
                if (b >= 3) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ce(" + ')');
        }
    }
    
    public void loadCache(final int i) {
        (this.flashingElements = new HashSet()).add(i);
        this.flashCount = 0;
        this.flashCycle = 0;
    }
    
    public void cb(final int n, final int n2, final boolean b, final boolean b2) {
        final long clockNow = class96.clockNow(393761683);
        this.method2332(n, n2, b2, clockNow);
        if (!this.hasTarget(-1689610790) && (b2 || b) && !InvDefinition.method978((byte)(-80))) {
            if (b2) {
                this.field3902 = -463876578 * n;
                this.field3936 = -932549095 * n2;
                this.field3933 = 855346862 * this.centerTileX;
                this.field3942 = -1697676280 * this.centerTileY;
            }
            if (-1 != 1942996257 * this.field3933) {
                this.setWorldMapPosition(this.field3933 * -1960645157 - (int)((n - this.field3902 * -642077217) / this.zoomTarget), -1246558373 * this.field3942 + (int)((n2 - 333407723 * this.field3936) / this.zoomTarget), false, (short)254);
            }
        }
        else {
            this.method2334(1912554152);
        }
        if (b2) {
            this.field3937 = 7451806700989670229L * clockNow;
            this.field3938 = n * -836123571;
            this.field3939 = n2 * -88109587;
        }
    }
    
    void da(final int n, final int n2, final int n3) {
        if (this.currentMapArea == null) {
            return;
        }
        int[] array = this.currentMapArea.position(n, n2, n3, (byte)6);
        if (array == null) {
            array = this.currentMapArea.position(this.currentMapArea.getOriginPlane(-2019541929), this.currentMapArea.getOriginX((byte)94), this.currentMapArea.getOriginY(-151833963), (byte)6);
        }
        this.setWorldMapPosition(array[0] - this.currentMapArea.getRegionLowX(16748608) * 280181450, array[1] - this.currentMapArea.getRegionLowY(1518597563) * -909976881, true, (short)254);
        this.worldMapTargetX = 987301763;
        this.worldMapTargetY = -2114789619;
        this.zoom = this.getZoomFromPercentage(WorldMapArea.uz(this.currentMapArea, 447952954), 407986779);
        this.zoomTarget = this.zoom;
        this.field3948 = null;
        this.iconIterator = null;
        this.worldMapManager.clearIcons(-1525624806);
    }
    
    public static Coord da(final WorldMap worldMap, final int n) {
        if (worldMap == null) {
            return worldMap.getDisplayCoord(n);
        }
        try {
            if (worldMap.currentMapArea != null) {
                return worldMap.currentMapArea.coord(worldMap.getDisplayX(-1369827628), worldMap.getDisplayY((byte)0), 1732463921);
            }
            if (n != 1721001715) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bt(" + ')');
        }
    }
    
    public static void nb(final WorldMap worldMap, final int n) {
        if (worldMap == null) {
            worldMap.gl(n);
        }
        final WorldMapArea mapArea = worldMap.getMapArea(n, -473896303);
        if (null != mapArea) {
            worldMap.setCurrentMapArea(mapArea, -1483320853);
        }
    }
    
    public static boolean sb(final WorldMap worldMap) {
        if (worldMap == null) {
            worldMap.gf();
        }
        return !worldMap.elementsDisabled;
    }
    
    void ch() {
        if (class132.field1277 != null) {
            this.zoom = this.zoomTarget;
            return;
        }
        if (this.zoom < this.zoomTarget) {
            this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0f + this.zoom);
        }
        if (this.zoom > this.zoomTarget) {
            this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0f);
        }
    }
    
    public int el() {
        if (1.0 == this.zoomTarget) {
            return 25;
        }
        if (1.5 == this.zoomTarget) {
            return 37;
        }
        if (2.0 == this.zoomTarget) {
            return 50;
        }
        if (this.zoomTarget == 3.0) {
            return 75;
        }
        if (this.zoomTarget == 4.0) {
            return 100;
        }
        return 200;
    }
    
    public WorldMapManager sm() {
        return this.worldMapManager;
    }
    
    public void cl() {
        WorldMapRegion.WorldMapRegion_cachedSprites.ae(5);
    }
    
    public void worldMapMenuAction(final int n, final int n2, final Coord coord, final Coord coord2, final int n3) {
        try {
            final ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.setArgs(new Object[] { new WorldMapEvent(n2, coord, coord2) }, -769905829);
            switch (n) {
                case 1008: {
                    scriptEvent.setType(10, 291235054);
                    break;
                }
                case 1010: {
                    scriptEvent.setType(12, -561608176);
                    break;
                }
                case 1011: {
                    scriptEvent.setType(13, -896488623);
                    break;
                }
                case 1012: {
                    scriptEvent.setType(14, 603586528);
                    break;
                }
                case 1009: {
                    scriptEvent.setType(11, 665630045);
                    break;
                }
            }
            HealthBarUpdate.set(scriptEvent, (byte)4);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.cn(" + ')');
        }
    }
    
    public void ex(final int n, final int n2) {
        if (null != this.currentMapArea && WorldMapArea.nb(this.currentMapArea, n, n2, 1578034803)) {
            this.worldMapTargetX = (n - this.currentMapArea.getRegionLowX(16748608) * 64) * 2080912417;
            this.worldMapTargetY = (n2 - this.currentMapArea.getRegionLowY(1184335355) * 64) * 667691095;
        }
    }
    
    public static void ld(final WorldMap worldMap, final int n, final boolean b, final int n2) {
        if (worldMap == null) {
            worldMap.setCategoryDisabled(n, b, n);
        }
        try {
            if (!b) {
                worldMap.enabledCategories.add(n);
            }
            else {
                worldMap.enabledCategories.remove(n);
            }
            for (int i = 0; i < class328.WorldMapElement_count * -1703136055; ++i) {
                if (n2 >= 1175110911) {
                    return;
                }
                if (class354.method1935(i, 1913218168) == null) {
                    if (n2 >= 1175110911) {
                        throw new IllegalStateException();
                    }
                }
                else if (class354.method1935(i, 2138770387).category * -461862935 == n) {
                    if (n2 >= 1175110911) {
                        return;
                    }
                    final int n3 = class354.method1935(i, 2024786461).objectId * 219774827;
                    if (!b) {
                        if (n2 >= 1175110911) {
                            return;
                        }
                        worldMap.enabledElementIds.add(n3);
                    }
                    else {
                        worldMap.enabledElementIds.remove(n3);
                    }
                }
            }
            worldMap.method2375((byte)(-69));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bc(" + ')');
        }
    }
    
    public static Coord tb(final WorldMap worldMap, final int i, final Coord coord, final int n) {
        if (worldMap == null) {
            return worldMap.method2386(i, coord, i);
        }
        try {
            if (!worldMap.cacheLoader.isLoaded(-1310143333)) {
                if (n == 898848000) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else if (!worldMap.worldMapManager.isLoaded(-1165757098)) {
                if (n == 898848000) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                if (WorldMapArea.nb(worldMap.currentMapArea, coord.x * -96298701, -2105445199 * coord.y, 1885384083)) {
                    final List<AbstractWorldMapIcon> list = worldMap.worldMapManager.buildIcons((byte)33).get(i);
                    if (list != null) {
                        if (n == 898848000) {
                            throw new IllegalStateException();
                        }
                        if (!list.isEmpty()) {
                            AbstractWorldMapIcon abstractWorldMapIcon = null;
                            int n2 = -1;
                            final Iterator<AbstractWorldMapIcon> iterator = list.iterator();
                            while (iterator.hasNext()) {
                                if (n == 898848000) {
                                    throw new IllegalStateException();
                                }
                                final AbstractWorldMapIcon abstractWorldMapIcon2 = iterator.next();
                                final int n3 = -96298701 * abstractWorldMapIcon2.coord2.x - -96298701 * coord.x;
                                final int n4 = -2105445199 * abstractWorldMapIcon2.coord2.y - -2105445199 * coord.y;
                                final int n5 = n3 * n3 + n4 * n4;
                                if (n5 == 0) {
                                    if (n == 898848000) {
                                        throw new IllegalStateException();
                                    }
                                    return abstractWorldMapIcon2.coord2;
                                }
                                else {
                                    if (n5 >= n2) {
                                        if (null != abstractWorldMapIcon) {
                                            continue;
                                        }
                                        if (n == 898848000) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    abstractWorldMapIcon = abstractWorldMapIcon2;
                                    n2 = n5;
                                }
                            }
                            return abstractWorldMapIcon.coord2;
                        }
                        if (n == 898848000) {
                            throw new IllegalStateException();
                        }
                    }
                    return null;
                }
                if (n == 898848000) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.cc(" + ')');
        }
    }
    
    public boolean gc() {
        return this.cacheLoader.isLoaded(-196690962);
    }
    
    public WorldMapArea db() {
        return this.currentMapArea;
    }
    
    final void dc(final int n, final int n2, final boolean b) {
        this.centerTileX = -599017385 * n;
        this.centerTileY = n2 * 19712353;
        class96.clockNow(1092016934);
        if (b) {
            this.method2334(843226105);
        }
    }
    
    public boolean isElementDisabled(final int i, final int n) {
        try {
            boolean b;
            if (!this.enabledElements.contains(i)) {
                if (n == 985369060) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bw(" + ')');
        }
    }
    
    public void cf() {
        WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
    }
    
    void cw() {
        if (class132.field1277 != null) {
            this.zoomTarget = this.zoom;
            return;
        }
        if (this.zoom < this.zoom) {
            this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0f + this.zoomTarget);
        }
        if (this.zoomTarget > this.zoom) {
            this.zoomTarget = Math.max(this.zoomTarget, this.zoom - this.zoomTarget / 30.0f);
        }
    }
    
    public void cv(final int n, final int n2, final boolean b, final boolean b2) {
        final long clockNow = class96.clockNow(1807187267);
        this.method2332(n, n2, b2, clockNow);
        if (!this.hasTarget(-1634890004) && ((b2 || b) && !InvDefinition.method978((byte)(-17)))) {
            if (b2) {
                this.field3902 = 99962399 * n;
                this.field3936 = 531836949 * n2;
                this.field3933 = 592139365 * this.centerTileX;
                this.field3942 = 1696219827 * this.centerTileY;
            }
            if (-1 != -1960645157 * this.field3933) {
                this.setWorldMapPosition(this.field3933 * -1960645157 - (int)((n - this.field3902 * -642077217) / this.zoomTarget), -1246558373 * this.field3942 + (int)((n2 - -2058412227 * this.field3936) / this.zoomTarget), false, (short)254);
            }
        }
        else {
            this.method2334(1783940377);
        }
        if (b2) {
            this.field3937 = 7451806700989670229L * clockNow;
            this.field3938 = n * -1462297475;
            this.field3939 = n2 * -88109587;
        }
    }
    
    public void method2381(final int n, final int n2, final int n3, final boolean b, final byte b2) {
        try {
            WorldMapArea field3931 = this.mapAreaAtCoord(n, n2, n3, (byte)2);
            if (field3931 == null) {
                if (b2 != 15) {
                    throw new IllegalStateException();
                }
                if (!b) {
                    return;
                }
                field3931 = this.mainMapArea;
            }
            boolean b3 = false;
            Label_0132: {
                if (this.field3931 == field3931) {
                    if (b2 != 15) {
                        throw new IllegalStateException();
                    }
                    if (!b) {
                        break Label_0132;
                    }
                    if (b2 != 15) {
                        throw new IllegalStateException();
                    }
                }
                this.setCurrentMapArea(this.field3931 = field3931, -1483320853);
                b3 = true;
            }
            if (!b3) {
                if (b2 != 15) {
                    throw new IllegalStateException();
                }
                if (!b) {
                    return;
                }
                if (b2 != 15) {
                    throw new IllegalStateException();
                }
            }
            this.jump(n, n2, n3, -1605938577);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ao(" + ')');
        }
    }
    
    public static void ma(final WorldMap worldMap) {
        if (worldMap == null) {
            worldMap.go();
            return;
        }
        if (class132.field1277 != null) {
            worldMap.zoom = worldMap.zoomTarget;
            return;
        }
        if (worldMap.zoom < worldMap.zoomTarget) {
            worldMap.zoom = Math.min(worldMap.zoomTarget, worldMap.zoom / 30.0f + worldMap.zoom);
        }
        if (worldMap.zoom > worldMap.zoomTarget) {
            worldMap.zoom = Math.max(worldMap.zoomTarget, worldMap.zoom - worldMap.zoom / 30.0f);
        }
    }
    
    public void ft(final int n) {
        try {
            WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.an(" + ')');
        }
    }
    
    final void method2334(final int n) {
        try {
            this.field3936 = -531836949;
            this.field3902 = -99962399;
            this.field3942 = -387305683;
            this.field3933 = 1462155693;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.at(" + ')');
        }
    }
    
    void method2339(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        try {
            if (class132.field1277 != null) {
                final int n8 = 512 / (983071510 * this.worldMapManager.pixelsPerTile);
                final int n9 = 512 + n3;
                final int n10 = n4 + 512;
                final float n11 = 1.0f;
                final int n12 = (int)(n9 / n11);
                final int n13 = (int)(n10 / n11);
                final int n14 = this.currentMapAreaId(-1167233766) - n5 / 2 - n8;
                final int n15 = this.getDisplayY((byte)0) - n6 / 2 - n8;
                int n16 = n - this.worldMapManager.pixelsPerTile * -1655947893 * (n8 + n14 - this.cyclesPerFlash * 334129421);
                int n17 = n2 - (n8 - (n15 - this.field3938 * 627335149)) * (-1655947893 * this.worldMapManager.pixelsPerTile);
                if (this.method2366(n12, n13, n16, n17, n3, n4, -879179620)) {
                    if (n7 != 1052800047) {
                        return;
                    }
                    Label_0316: {
                        if (this.sprite != null && this.sprite.xOffset == n12) {
                            if (n7 != 1052800047) {
                                throw new IllegalStateException();
                            }
                            if (n13 == this.sprite.subWidth) {
                                Arrays.fill(this.sprite.pixels, 0);
                                break Label_0316;
                            }
                            if (n7 != 1052800047) {
                                return;
                            }
                        }
                        this.sprite = new SpritePixels(n12, n13);
                    }
                    this.field3936 = (this.getDisplayHeight(-930495552) - n5 / 2 - n8) * -1316647483;
                    this.worldMapDisplayY = (this.getDisplayWith((byte)0) - n6 / 2 - n8) * 1178523109;
                    this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile * 219395697;
                    class132.field1277.method1938(this.cyclesPerFlash * 334129421, 627335149 * this.field3938, this.sprite, 1547438523 * this.field3938 / n11, 47289372);
                    this.flashCycle = Client.xi * 2048189963;
                    n16 = n - this.worldMapManager.pixelsPerTile * -1655947893 * (n8 + n14 - this.cyclesPerFlash * 334129421);
                    n17 = n2 - (n8 - (n15 - 627335149 * this.worldMapDisplayX)) * (this.worldMapManager.pixelsPerTile * -1655947893);
                }
                Rasterizer2D.Rasterizer2D_fillRectangleAlpha(n, n2, n3, n4, 0, 128);
                if (1.0f == n11) {
                    if (n7 != 1052800047) {
                        throw new IllegalStateException();
                    }
                    this.sprite.method2631(n16, n17, 192);
                }
                else {
                    this.sprite.drawTransScaledAt(n16, n17, (int)(n12 * n11), (int)(n11 * n13), 192);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ak(" + ')');
        }
    }
    
    void initializeWorldMapManager(final WorldMapArea currentMapArea, final int n) {
        try {
            this.currentMapArea = currentMapArea;
            this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
            this.cacheLoader.reset((null == this.currentMapArea) ? null : this.currentMapArea.getInternalName(-743182555), -527718287);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.av(" + ')');
        }
    }
    
    public static boolean wt(final WorldMap worldMap, final int n) {
        if (worldMap == null) {
            return worldMap.gz(n);
        }
        try {
            return worldMap.cacheLoader.isLoaded(1399465487);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bi(" + ')');
        }
    }
    
    public static void le(final WorldMap worldMap, final boolean b, final int n) {
        if (worldMap == null) {
            worldMap.setElementsDisabled(b, n);
        }
        try {
            boolean elementsDisabled;
            if (!b) {
                if (n <= 581262242) {
                    throw new IllegalStateException();
                }
                elementsDisabled = true;
            }
            else {
                elementsDisabled = false;
            }
            worldMap.elementsDisabled = elementsDisabled;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bl(" + ')');
        }
    }
    
    public WorldMapArea getMapArea(final int n, final int n2) {
        try {
            final Iterator<WorldMapArea> iterator = this.details.values().iterator();
            while (iterator.hasNext()) {
                if (n2 >= -269508165) {
                    throw new IllegalStateException();
                }
                final WorldMapArea worldMapArea = iterator.next();
                if (WorldMapArea.wo(worldMapArea, -964267539) != n) {
                    continue;
                }
                if (n2 >= -269508165) {
                    throw new IllegalStateException();
                }
                return worldMapArea;
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.be(" + ')');
        }
    }
    
    public boolean gf() {
        return !this.field3908;
    }
    
    void cp() {
        if (!this.hasTarget(-1843368762)) {
            return;
        }
        int a = this.worldMapTargetX * 506744801 - this.centerTileX * -84102297;
        int a2 = this.worldMapTargetY * 1744520039 - this.centerTileY * -632186207;
        if (a != 0) {
            a /= Math.min(8, Math.abs(a));
        }
        if (a2 != 0) {
            a2 /= Math.min(8, Math.abs(a2));
        }
        this.setWorldMapPosition(-84102297 * this.centerTileX + a, a2 + this.centerTileY * -632186207, true, (short)254);
        if (this.worldMapTargetX * 506744801 == this.centerTileX * -84102297 && 1744520039 * this.worldMapTargetY == this.centerTileY * -632186207) {
            this.worldMapTargetX = -2080912417;
            this.worldMapTargetY = -667691095;
        }
    }
    
    public void draw(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (class132.field1277 != null) {
            final int n7 = 512 / (1965172729 * this.worldMapManager.pixelsPerTile);
            final int n8 = 512 + n3;
            final int n9 = n4 - 1206669943;
            final float n10 = 1.0f;
            final int n11 = (int)(n8 / n10);
            final int n12 = (int)(n9 / n10);
            final int n13 = this.getDisplayHeight(-817587101) - n5 / 2 - n7;
            final int n14 = this.getZoomLevel((byte)0) - n6 / 2 - n7;
            int n15 = n - this.worldMapManager.pixelsPerTile * 1778852398 * (n7 + n13 - this.worldMapDisplayHeight * 864807469);
            int n16 = n2 - (n7 - (n14 - this.cyclesPerFlash * 627335149)) * (1669175771 * this.worldMapManager.pixelsPerTile);
            if (this.method2366(n11, n12, n15, n16, n3, n4, -2137082497)) {
                if (this.sprite != null && this.sprite.width == n11 && n12 == this.sprite.subWidth) {
                    Arrays.fill(this.sprite.pixels, 0);
                }
                else {
                    this.sprite = new SpritePixels(n11, n12);
                }
                this.maxFlashCount = (this.getDisplayHeight(-636371593) - n5 / 2 - n7) * -1316647483;
                this.field3939 = (this.getDisplayY((byte)0) - n6 / 2 - n7) * 1178523109;
                this.field3939 = this.worldMapManager.pixelsPerTile * -1454354698;
                class132.field1277.method1938(this.flashCount * -1497859011, -2022260021 * this.worldMapDisplayWidth, this.sprite, -966776445 * this.flashCount / n10, -1255534434);
                this.field3942 = Client.rz * 856129560;
                n15 = n - this.worldMapManager.pixelsPerTile * -1804639353 * (n7 + n13 - this.field3936 * -244681139);
                n16 = n2 - (n7 - (n14 - -684341452 * this.minCachedTileX)) * (this.worldMapManager.pixelsPerTile * -1655947893);
            }
            Rasterizer2D.hm(n, n2, n3, n4, 0, -193177846);
            if (1.0f == n10) {
                this.sprite.do(n15, n16, 192);
            }
            else {
                this.sprite.cd(n15, n16, (int)(n11 * n10), (int)(n10 * n12), 923447464);
            }
        }
    }
    
    public int draw() {
        return this.worldMapDisplayHeight * 1077411767;
    }
    
    public void ek(final int n, final int n2) {
        if (null != this.currentMapArea && WorldMapArea.nb(this.currentMapArea, n, n2, 1872286011)) {
            this.worldMapTargetX = (n - this.currentMapArea.getRegionLowX(16748608) * 64) * 2080912417;
            this.worldMapTargetY = (n2 - this.currentMapArea.getRegionLowY(-1123269894) * 64) * 667691095;
        }
    }
    
    public void eh(final int n, final int n2) {
        if (null != this.currentMapArea && WorldMapArea.nb(this.currentMapArea, n, n2, 1879142725)) {
            this.worldMapTargetX = (n - this.currentMapArea.getRegionLowX(16748608) * 64) * 2080912417;
            this.worldMapTargetY = (n2 - this.currentMapArea.getRegionLowY(-1935069417) * 64) * 667691095;
        }
    }
    
    public void fk(final int n) {
        if (n >= 1) {
            this.cyclesPerFlash = -1736140796 * n;
        }
    }
    
    public void fh(final int n, final int n2, final int n3) {
        if (null == this.currentMapArea) {
            return;
        }
        final int[] position = this.currentMapArea.position(n, n2, n3, (byte)6);
        if (position != null) {
            this.setWorldMapPositionTarget(position[0], position[1], (byte)(-6));
        }
    }
    
    public WorldMapArea ev(final int n) {
        for (final WorldMapArea worldMapArea : this.details.values()) {
            if (WorldMapArea.wo(worldMapArea, -964267539) == n) {
                return worldMapArea;
            }
        }
        return null;
    }
    
    public static AbstractWorldMapIcon qk(final WorldMap worldMap) {
        if (worldMap.iconIterator == null) {
            return null;
        }
        while (worldMap.iconIterator.hasNext()) {
            final AbstractWorldMapIcon abstractWorldMapIcon = worldMap.iconIterator.next();
            if (abstractWorldMapIcon.getElement(-197658795) != -1) {
                return abstractWorldMapIcon;
            }
        }
        return null;
    }
    
    public Coord hd(final int i, final Coord coord) {
        if (!this.cacheLoader.isLoaded(216319083)) {
            return null;
        }
        if (!this.worldMapManager.isLoaded(-887760637)) {
            return null;
        }
        if (!WorldMapArea.nb(this.currentMapArea, coord.x * -96298701, -2105445199 * coord.y, 1985331869)) {
            return null;
        }
        final List<AbstractWorldMapIcon> list = this.worldMapManager.buildIcons((byte)80).get(i);
        if (list != null && !list.isEmpty()) {
            AbstractWorldMapIcon abstractWorldMapIcon = null;
            int n = -1;
            for (final AbstractWorldMapIcon abstractWorldMapIcon2 : list) {
                final int n2 = -96298701 * abstractWorldMapIcon2.coord2.x - -96298701 * coord.x;
                final int n3 = -2105445199 * abstractWorldMapIcon2.coord2.y - -2105445199 * coord.y;
                final int n4 = n2 * n2 + n3 * n3;
                if (n4 == 0) {
                    return abstractWorldMapIcon2.coord2;
                }
                if (n4 >= n && null != abstractWorldMapIcon) {
                    continue;
                }
                abstractWorldMapIcon = abstractWorldMapIcon2;
                n = n4;
            }
            return abstractWorldMapIcon.coord2;
        }
        return null;
    }
    
    public void hn(final int n, final int n2, final Coord coord, final Coord coord2) {
        final ScriptEvent scriptEvent = new ScriptEvent();
        scriptEvent.setArgs(new Object[] { new WorldMapEvent(n2, coord, coord2) }, 1981849408);
        switch (n) {
            case 1011: {
                scriptEvent.setType(13, -106729926);
                break;
            }
            case 1009: {
                scriptEvent.setType(11, -228386502);
                break;
            }
            case 1008: {
                scriptEvent.setType(10, 775914151);
                break;
            }
            case 1010: {
                scriptEvent.setType(12, 1203032210);
                break;
            }
            case 1012: {
                scriptEvent.setType(14, 1409667328);
                break;
            }
        }
        HealthBarUpdate.set(scriptEvent, (byte)16);
    }
    
    public static void lo(final WorldMap worldMap, final int n, final int n2, final int n3, final int n4) {
        if (!worldMap.cacheLoader.isLoaded(-1088693950)) {
            return;
        }
        if (!worldMap.worldMapManager.isLoaded(-1141804607)) {
            worldMap.worldMapManager.load(worldMap.WorldMap_archive, worldMap.currentMapArea.getInternalName(1905339062), Client.isMembersWorld, (short)(-26488));
            if (!worldMap.worldMapManager.isLoaded(-1077022131)) {
                return;
            }
        }
        worldMap.worldMapManager.drawOverview(n, n2, n3, n4, worldMap.flashingElements, 1104873149 * worldMap.flashCycle, 1369293643 * worldMap.cyclesPerFlash, -1683559746);
    }
    
    boolean eq(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return null == this.sprite || this.sprite.subWidth != n || this.sprite.subHeight != n2 || -1655947893 * this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile * 1547438523 || this.field3957 * 2016965279 != -1680619819 * Client.field648 || n3 > 0 || n4 > 0 || n + n3 < n5 || n4 + n2 < n6;
    }
    
    public void ee(final int n, final int n2, final int n3) {
        if (this.currentMapArea == null) {
            return;
        }
        final int[] position = this.currentMapArea.position(n, n2, n3, (byte)6);
        if (position != null) {
            this.fs(position[0], position[1], -759678660);
        }
    }
    
    public void drawOverview(final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            if (this.cacheLoader.isLoaded(256893588)) {
                if (!this.worldMapManager.isLoaded(-1309897584)) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(58467529), Client.isMembersWorld, (short)(-7862));
                    if (!this.worldMapManager.isLoaded(-1299215513)) {
                        if (b == 0) {
                            return;
                        }
                        return;
                    }
                }
                this.worldMapManager.drawOverview(n, n2, n3, n4, this.flashingElements, 1104873149 * this.flashCycle, 1369293643 * this.cyclesPerFlash, -1814142483);
                return;
            }
            if (b == 0) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.az(" + ')');
        }
    }
    
    public static void lt(final WorldMap worldMap, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (worldMap == null) {
            worldMap.ef(n, n, n, n, n, n);
            return;
        }
        try {
            final int n7 = 20;
            final int n8 = n + n3 / 2;
            final int n9 = n2 + n4 / 2 - 18 - n7;
            Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, -16777216);
            Rasterizer2D.Rasterizer2D_drawRectangle(n8 - 152, n9, 304, 34, -65536);
            Rasterizer2D.Rasterizer2D_fillRectangle(n8 - 150, 2 + n9, n5 * 3, 30, -65536);
            worldMap.font.aj(Strings.mb, n8, n7 + n9, -1, -1);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ae(" + ')');
        }
    }
    
    public void setCurrentMapAreaId(final int n, final int n2) {
        try {
            final WorldMapArea mapArea = this.getMapArea(n, -797849478);
            if (null != mapArea) {
                if (n2 == -518589768) {
                    return;
                }
                this.setCurrentMapArea(mapArea, -1483320853);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ax(" + ')');
        }
    }
    
    public WorldMapArea mapAreaAtCoord(final int n, final int n2, final int n3, final byte b) {
        try {
            final Iterator<WorldMapArea> iterator = this.details.values().iterator();
            while (iterator.hasNext()) {
                if (b != 2) {
                    throw new IllegalStateException();
                }
                final WorldMapArea worldMapArea = iterator.next();
                if (!worldMapArea.containsCoord(n, n2, n3, -1323143702)) {
                    continue;
                }
                if (b != 2) {
                    throw new IllegalStateException();
                }
                return worldMapArea;
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ay(" + ')');
        }
    }
    
    public void dt(final int n, final int n2, final int n3, final boolean b) {
        WorldMapArea field3931 = this.mapAreaAtCoord(n, n2, n3, (byte)2);
        if (field3931 == null) {
            if (!b) {
                return;
            }
            field3931 = this.mainMapArea;
        }
        boolean b2 = false;
        if (this.field3931 != field3931 || b) {
            this.setCurrentMapArea(this.field3931 = field3931, -1483320853);
            b2 = true;
        }
        if (b2 || b) {
            this.jump(n, n2, n3, -1605938577);
        }
    }
    
    public static AbstractWorldMapIcon dt(final WorldMap worldMap) {
        if (worldMap.iconIterator == null) {
            return null;
        }
        while (worldMap.iconIterator.hasNext()) {
            final AbstractWorldMapIcon abstractWorldMapIcon = worldMap.iconIterator.next();
            if (abstractWorldMapIcon.getElement(-79076450) != -1) {
                return abstractWorldMapIcon;
            }
        }
        return null;
    }
    
    public static void rp(final WorldMap worldMap) {
        if (worldMap == null) {
            worldMap.dr();
        }
        if (!worldMap.hasTarget(-1698719749)) {
            return;
        }
        int a = worldMap.worldMapTargetX * 506744801 - worldMap.centerTileX * -84102297;
        int a2 = worldMap.worldMapTargetY * 1744520039 - worldMap.centerTileY * -632186207;
        if (a != 0) {
            a /= Math.min(8, Math.abs(a));
        }
        if (a2 != 0) {
            a2 /= Math.min(8, Math.abs(a2));
        }
        worldMap.setWorldMapPosition(-84102297 * worldMap.centerTileX + a, a2 + worldMap.centerTileY * -632186207, true, (short)254);
        if (worldMap.worldMapTargetX * 506744801 == worldMap.centerTileX * -84102297 && 1744520039 * worldMap.worldMapTargetY == worldMap.centerTileY * -632186207) {
            worldMap.worldMapTargetX = -2080912417;
            worldMap.worldMapTargetY = -667691095;
        }
    }
    
    public static void xp(final WorldMap worldMap, final WorldMapArea currentMapArea) {
        if (worldMap == null) {
            worldMap.ed();
        }
        worldMap.currentMapArea = currentMapArea;
        worldMap.worldMapManager = new WorldMapManager(worldMap.mapSceneSprites, worldMap.fonts, worldMap.WorldMap_geographyArchive, worldMap.WorldMap_groundArchive);
        worldMap.cacheLoader.reset((null == worldMap.currentMapArea) ? null : worldMap.currentMapArea.getInternalName(1910798663), -527718287);
    }
    
    public static void ob(final WorldMap worldMap) {
        if (worldMap == null) {
            worldMap.cw();
            return;
        }
        if (class132.field1277 != null) {
            worldMap.zoom = worldMap.zoomTarget;
            return;
        }
        if (worldMap.zoom < worldMap.zoomTarget) {
            worldMap.zoom = Math.min(worldMap.zoomTarget, worldMap.zoom / 30.0f + worldMap.zoom);
        }
        if (worldMap.zoom > worldMap.zoomTarget) {
            worldMap.zoom = Math.max(worldMap.zoomTarget, worldMap.zoom - worldMap.zoom / 30.0f);
        }
    }
    
    public void hs(final int n, final int n2, final Coord coord, final Coord coord2) {
        final ScriptEvent scriptEvent = new ScriptEvent();
        scriptEvent.setArgs(new Object[] { new WorldMapEvent(n2, coord, coord2) }, -712213217);
        switch (n) {
            case 1011: {
                scriptEvent.setType(13, 10707487);
                break;
            }
            case 1009: {
                scriptEvent.setType(11, -960189401);
                break;
            }
            case 1008: {
                scriptEvent.setType(10, -1481111380);
                break;
            }
            case 1012: {
                scriptEvent.setType(14, 1368217607);
                break;
            }
            case 1010: {
                scriptEvent.setType(12, 1777196281);
                break;
            }
        }
        HealthBarUpdate.set(scriptEvent, (byte)(-29));
    }
    
    public AbstractWorldMapIcon ht() {
        if (this.iconIterator == null) {
            return null;
        }
        while (this.iconIterator.hasNext()) {
            final AbstractWorldMapIcon abstractWorldMapIcon = this.iconIterator.next();
            if (abstractWorldMapIcon.getElement(-162582787) != -1) {
                return abstractWorldMapIcon;
            }
        }
        return null;
    }
    
    public boolean isCacheLoaded(final int i) {
        return !this.enabledElements.contains(i);
    }
    
    public void stopCurrentFlashes(final int n) {
        this.zoomTarget = this.getZoomFromPercentage(n, -2081373966);
    }
    
    public int wi() {
        return this.worldMapDisplayWidth * -1222006759;
    }
    
    public void fc() {
        this.maxFlashCount = 1412277301;
    }
    
    boolean dl() {
        return -1 != -601848329 * this.field3902 && this.field3946 * 1744520039 != -1;
    }
    
    public void ck(final AbstractArchive worldMap_archive, final AbstractArchive worldMap_geographyArchive, final AbstractArchive worldMap_groundArchive, final Font font, final HashMap hashMap, final IndexedSprite[] mapSceneSprites) {
        this.mapSceneSprites = mapSceneSprites;
        this.WorldMap_archive = worldMap_archive;
        this.WorldMap_geographyArchive = worldMap_geographyArchive;
        this.WorldMap_groundArchive = worldMap_groundArchive;
        this.font = font;
        (this.fonts = new HashMap()).put(WorldMapLabelSize.WorldMapLabelSize_small, hashMap.get(WorldMap.fontNameVerdana11));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, hashMap.get(WorldMap.fontNameVerdana13));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, hashMap.get(WorldMap.fontNameVerdana15));
        this.cacheLoader = new WorldMapArchiveLoader(worldMap_archive);
        final int fileFlat = AbstractArchive.getFileFlat(this.WorldMap_archive, WorldMapCacheName.field2435.name, 1993066743);
        final int[] yk = AbstractArchive.yk(this.WorldMap_archive, fileFlat, 194341237);
        final int initialCapacity = (yk == null) ? 0 : yk.length;
        this.details = new HashMap(initialCapacity);
        for (int i = 0; i < initialCapacity; ++i) {
            final Buffer buffer = new Buffer(this.WorldMap_archive.takeFile(fileFlat, yk[i], (byte)(-65)));
            final WorldMapArea worldMapArea = new WorldMapArea();
            worldMapArea.read(buffer, yk[i], (byte)(-63));
            this.details.put(worldMapArea.getInternalName(-651851856), worldMapArea);
            if (WorldMapArea.getId(worldMapArea, -926489840)) {
                this.mainMapArea = worldMapArea;
            }
        }
        this.setCurrentMapArea(this.mainMapArea, -1483320853);
        this.field3931 = null;
    }
    
    public void jumpToSourceCoord(final int n, final int n2, final int n3, final byte b) {
        try {
            if (null != this.currentMapArea) {
                final int[] position = this.mainMapArea.position(n, n2, n3, (byte)6);
                if (position != null) {
                    if (b <= 2) {
                        throw new IllegalStateException();
                    }
                    this.setWorldMapPositionTarget(position[0], position[1], (byte)(-59));
                }
                return;
            }
            if (b <= 2) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bo(" + ')');
        }
    }
    
    boolean di() {
        return -1 != 506744801 * this.worldMapTargetX && this.worldMapTargetY * 1744520039 != -1;
    }
    
    public void fs(final int n, final int n2, final int n3) {
        try {
            if (null != this.currentMapArea) {
                this.setWorldMapPosition(n - this.currentMapArea.getRegionLowX(16748608) * 64, n2 - this.currentMapArea.getRegionLowY(1759021250) * 64, true, (short)254);
                this.worldMapTargetX = -2080912417;
                this.worldMapTargetY = -667691095;
                return;
            }
            if (n3 == -1469152147) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bx(" + ')');
        }
    }
    
    public void disableElement(final int n, final boolean b, final int n2) {
        try {
            if (!b) {
                if (n2 <= -1324136589) {
                    return;
                }
                this.enabledElements.add(n);
            }
            else {
                this.enabledElements.remove(n);
            }
            this.method2375((byte)(-91));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bp(" + ')');
        }
    }
    
    void ct() {
        if (!this.hasTarget(-1935623539)) {
            return;
        }
        int a = this.worldMapTargetX * -1515957885 - this.centerTileX * -681483255;
        int a2 = this.worldMapTargetY * 1744520039 - this.centerTileY * -1387764648;
        if (a != 0) {
            a /= Math.min(8, Math.abs(a));
        }
        if (a2 != 0) {
            a2 /= Math.min(8, Math.abs(a2));
        }
        this.setWorldMapPosition(466722362 * this.centerTileX + a, a2 + this.centerTileY * 1004518695, true, (short)254);
        if (this.worldMapTargetX * 2131819592 == this.centerTileX * 1681875606 && 1744520039 * this.worldMapTargetY == this.centerTileY * -632186207) {
            this.worldMapTargetX = -2080912417;
            this.worldMapTargetY = -138818798;
        }
    }
    
    public Coord method2386(final int i, final Coord coord, final int n) {
        try {
            if (!this.cacheLoader.isLoaded(-1310143333)) {
                if (n == 898848000) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else if (!this.worldMapManager.isLoaded(-1165757098)) {
                if (n == 898848000) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                if (WorldMapArea.nb(this.currentMapArea, coord.y * -96298701, -2105445199 * coord.plane, 1885384083)) {
                    final List<AbstractWorldMapIcon> list = this.worldMapManager.buildIcons((byte)33).get(i);
                    if (list != null) {
                        if (n == 898848000) {
                            throw new IllegalStateException();
                        }
                        if (!list.isEmpty()) {
                            AbstractWorldMapIcon abstractWorldMapIcon = null;
                            int n2 = -1;
                            final Iterator<AbstractWorldMapIcon> iterator = list.iterator();
                            while (iterator.hasNext()) {
                                if (n == 898848000) {
                                    throw new IllegalStateException();
                                }
                                final AbstractWorldMapIcon abstractWorldMapIcon2 = iterator.next();
                                final int n3 = -96298701 * abstractWorldMapIcon2.coord1.plane - -96298701 * coord.x;
                                final int n4 = -2105445199 * abstractWorldMapIcon2.coord1.x - -2105445199 * coord.y;
                                final int n5 = n3 * n3 + n4 * n4;
                                if (n5 == 0) {
                                    if (n == 898848000) {
                                        throw new IllegalStateException();
                                    }
                                    return abstractWorldMapIcon2.coord2;
                                }
                                else {
                                    if (n5 >= n2) {
                                        if (null != abstractWorldMapIcon) {
                                            continue;
                                        }
                                        if (n == 898848000) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    abstractWorldMapIcon = abstractWorldMapIcon2;
                                    n2 = n5;
                                }
                            }
                            return abstractWorldMapIcon.coord1;
                        }
                        if (n == 898848000) {
                            throw new IllegalStateException();
                        }
                    }
                    return null;
                }
                if (n == 898848000) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.cc(" + ')');
        }
    }
    
    public static AbstractWorldMapIcon ml(final WorldMap worldMap) {
        if (!worldMap.cacheLoader.isLoaded(-675499550)) {
            return null;
        }
        if (!worldMap.worldMapManager.isLoaded(-1271376711)) {
            return null;
        }
        final HashMap buildIcons = worldMap.worldMapManager.buildIcons((byte)53);
        worldMap.field3948 = new LinkedList();
        final Iterator<List> iterator = buildIcons.values().iterator();
        while (iterator.hasNext()) {
            worldMap.field3948.addAll(iterator.next());
        }
        worldMap.iconIterator = worldMap.field3948.iterator();
        return worldMap.iconNext((byte)(-31));
    }
    
    public int fn() {
        return -1222006759 * this.worldMapDisplayWidth;
    }
    
    public Coord getDisplayCoord(final int n) {
        try {
            if (this.mainMapArea != null) {
                return this.field3931.coord(this.getDisplayX(-1369827628), this.getZoomLevel((byte)0), 1732463921);
            }
            if (n != 1721001715) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bt(" + ')');
        }
    }
    
    public static void ds(final WorldMap worldMap, final int n, final int n2, final boolean b, final int n3, final int n4, final int n5, final int n6) {
        if (!worldMap.cacheLoader.isLoaded(1160007712)) {
            return;
        }
        worldMap.smoothZoom(793323261);
        worldMap.scrollToTarget(-1832276817);
        if (!b) {
            return;
        }
        final int n7 = (int)Math.ceil(n5 / worldMap.zoom);
        final int n8 = (int)Math.ceil(n6 / worldMap.zoom);
        final List method1478 = worldMap.worldMapManager.method1478(-1493986062 * worldMap.centerTileX - n7 / 2 - 1, worldMap.centerTileY * -632186207 - n8 / 2 - 1, 1 + (worldMap.centerTileX * 1748399536 + n7 / 2), 1 + (n8 / 2 + worldMap.centerTileY * -632186207), n3, n4, n5, n6, n, n2, 1205225730);
        final HashSet<AbstractWorldMapIcon> field3924 = new HashSet<AbstractWorldMapIcon>();
        for (final AbstractWorldMapIcon abstractWorldMapIcon : method1478) {
            field3924.add(abstractWorldMapIcon);
            final ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.setArgs(new Object[] { new WorldMapEvent(abstractWorldMapIcon.getElement(-1358105714), abstractWorldMapIcon.coord1, abstractWorldMapIcon.coord2), n, n2 }, 1846405979);
            if (worldMap.field3924.contains(abstractWorldMapIcon)) {
                scriptEvent.setType(17, 733518569);
            }
            else {
                scriptEvent.setType(15, -257013143);
            }
            HealthBarUpdate.set(scriptEvent, (byte)(-39));
        }
        for (final AbstractWorldMapIcon o : worldMap.field3924) {
            if (!field3924.contains(o)) {
                final ScriptEvent scriptEvent2 = new ScriptEvent();
                scriptEvent2.setArgs(new Object[] { new WorldMapEvent(o.getElement(-1627131838), o.coord1, o.coord2), n, n2 }, 994037520);
                scriptEvent2.setType(16, 831676753);
                HealthBarUpdate.set(scriptEvent2, (byte)21);
            }
        }
        worldMap.field3924 = field3924;
    }
    
    public void ds(final WorldMapArea worldMapArea, final Coord coord, final Coord coord2, final boolean b) {
        if (null == worldMapArea) {
            return;
        }
        if (null == this.currentMapArea || this.currentMapArea != worldMapArea) {
            this.initializeWorldMapManager(worldMapArea, 855336447);
        }
        if (!b && this.currentMapArea.containsCoord(1406530404 * coord.plane, -96298701 * coord.x, coord.y * -1530313212, -1460841848)) {
            this.jump(106418210 * coord.plane, -386163306 * coord.x, coord.y * -2105445199, -1605938577);
        }
        else {
            this.jump(-2120003328 * coord2.plane, coord2.x * -96298701, coord2.y * 1354223151, -1605938577);
        }
    }
    
    public void setCategoryDisabled(final int n, final boolean b, final int n2) {
        try {
            if (!b) {
                this.flashingElements.add(n);
            }
            else {
                this.enabledCategories.remove(n);
            }
            for (int i = 0; i < class328.WorldMapElement_count * -1703136055; ++i) {
                if (n2 >= 1175110911) {
                    return;
                }
                if (class354.method1935(i, 1913218168) == null) {
                    if (n2 >= 1175110911) {
                        throw new IllegalStateException();
                    }
                }
                else if (class354.method1935(i, 2138770387).category * -461862935 == n) {
                    if (n2 >= 1175110911) {
                        return;
                    }
                    final int n3 = class354.method1935(i, 2024786461).objectId * 219774827;
                    if (!b) {
                        if (n2 >= 1175110911) {
                            return;
                        }
                        this.enabledCategories.add(n3);
                    }
                    else {
                        this.field3944.remove(n3);
                    }
                }
            }
            this.method2375((byte)(-69));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bc(" + ')');
        }
    }
    
    public void resetMaxFlashCount(final byte b) {
        try {
            this.maxFlashCount = 1412277301;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.br(" + ')');
        }
    }
    
    public void ei(final int n, final int n2) {
        if (null == this.currentMapArea) {
            return;
        }
        this.setWorldMapPosition(n - this.currentMapArea.getRegionLowX(16748608) * 64, n2 - this.currentMapArea.getRegionLowY(499159204) * 64, true, (short)254);
        this.worldMapTargetX = -2080912417;
        this.worldMapTargetY = -667691095;
    }
    
    void method2375(final byte b) {
        try {
            this.field3944.clear();
            this.field3944.addAll(this.enabledElements);
            this.field3944.addAll(this.enabledElementIds);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ci(" + ')');
        }
    }
    
    public void onCycle(final int n, final int n2, final boolean b, final int n3, final int n4, final int n5, final int n6, final int n7) {
        try {
            if (!this.cacheLoader.isLoaded(2028152441)) {
                if (n7 == -1900312441) {
                    throw new IllegalStateException();
                }
            }
            else {
                this.smoothZoom(796336724);
                this.scrollToTarget(-1737092003);
                if (b) {
                    final int n8 = (int)Math.ceil(n5 / this.zoom);
                    final int n9 = (int)Math.ceil(n6 / this.zoom);
                    final List method1478 = this.worldMapManager.method1478(-84102297 * this.centerTileX - n8 / 2 - 1, this.centerTileY * -632186207 - n9 / 2 - 1, 1 + (this.centerTileX * -84102297 + n8 / 2), 1 + (n9 / 2 + this.centerTileY * -632186207), n3, n4, n5, n6, n, n2, -554616528);
                    final HashSet<AbstractWorldMapIcon> field3924 = new HashSet<AbstractWorldMapIcon>();
                    final Iterator<AbstractWorldMapIcon> iterator = method1478.iterator();
                    while (iterator.hasNext()) {
                        if (n7 == -1900312441) {
                            throw new IllegalStateException();
                        }
                        final AbstractWorldMapIcon abstractWorldMapIcon = iterator.next();
                        field3924.add(abstractWorldMapIcon);
                        final ScriptEvent scriptEvent = new ScriptEvent();
                        scriptEvent.setArgs(new Object[] { new WorldMapEvent(abstractWorldMapIcon.getElement(-1645421540), abstractWorldMapIcon.coord1, abstractWorldMapIcon.coord2), n, n2 }, 1505295862);
                        if (this.field3924.contains(abstractWorldMapIcon)) {
                            if (n7 == -1900312441) {
                                throw new IllegalStateException();
                            }
                            scriptEvent.setType(17, -715457953);
                        }
                        else {
                            scriptEvent.setType(15, -648299238);
                        }
                        HealthBarUpdate.set(scriptEvent, (byte)(-24));
                    }
                    final Iterator<AbstractWorldMapIcon> iterator2 = this.field3924.iterator();
                    while (iterator2.hasNext()) {
                        if (n7 == -1900312441) {
                            throw new IllegalStateException();
                        }
                        final AbstractWorldMapIcon o = iterator2.next();
                        if (field3924.contains(o)) {
                            continue;
                        }
                        if (n7 == -1900312441) {
                            throw new IllegalStateException();
                        }
                        final ScriptEvent scriptEvent2 = new ScriptEvent();
                        scriptEvent2.setArgs(new Object[] { new WorldMapEvent(o.getElement(-140630002), o.coord1, o.coord2), n, n2 }, 644607568);
                        scriptEvent2.setType(16, 152580476);
                        HealthBarUpdate.set(scriptEvent2, (byte)73);
                    }
                    this.field3924 = field3924;
                    return;
                }
                if (n7 == -1900312441) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.aw(" + ')');
        }
    }
    
    void jump(final int n, final int n2, final int n3, final int n4) {
        try {
            if (this.currentMapArea != null) {
                int[] array = this.currentMapArea.position(n, n2, n3, (byte)6);
                if (array == null) {
                    if (n4 != -1605938577) {
                        return;
                    }
                    array = this.currentMapArea.position(this.currentMapArea.getOriginPlane(-2019541929), this.currentMapArea.getOriginX((byte)126), this.currentMapArea.getOriginY(-151833963), (byte)6);
                }
                this.setWorldMapPosition(array[0] - this.currentMapArea.getRegionLowX(16748608) * 64, array[1] - this.currentMapArea.getRegionLowY(-599342073) * 64, true, (short)254);
                this.worldMapTargetX = -2080912417;
                this.worldMapTargetY = -667691095;
                this.zoom = this.getZoomFromPercentage(WorldMapArea.uz(this.currentMapArea, 447952954), 271609225);
                this.zoomTarget = this.zoom;
                this.field3948 = null;
                this.iconIterator = null;
                this.worldMapManager.clearIcons(-1525624806);
                return;
            }
            if (n4 != -1605938577) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.am(" + ')');
        }
    }
    
    final void setWorldMapPosition(final int n, final int n2, final boolean b, final short n3) {
        try {
            this.centerTileX = -599017385 * n;
            this.centerTileY = n2 * 19712353;
            class96.clockNow(2107674499);
            if (b) {
                this.method2334(1954041280);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.al(" + ')');
        }
    }
    
    public WorldMapArea df() {
        return this.currentMapArea;
    }
    
    void et(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (class132.field1277 != null) {
            final int n7 = 512 / (1965172729 * this.worldMapManager.pixelsPerTile);
            final int n8 = 512 + n3;
            final int n9 = n4 - 1206669943;
            final float n10 = 1.0f;
            final int n11 = (int)(n8 / n10);
            final int n12 = (int)(n9 / n10);
            final int n13 = this.getDisplayX(-817587101) - n5 / 2 - n7;
            final int n14 = this.getDisplayY((byte)0) - n6 / 2 - n7;
            int n15 = n - this.worldMapManager.pixelsPerTile * 1778852398 * (n7 + n13 - this.minCachedTileX * 864807469);
            int n16 = n2 - (n7 - (n14 - this.minCachedTileY * 627335149)) * (1669175771 * this.worldMapManager.pixelsPerTile);
            if (this.method2366(n11, n12, n15, n16, n3, n4, -2137082497)) {
                if (this.sprite != null && this.sprite.subWidth == n11 && n12 == this.sprite.subHeight) {
                    Arrays.fill(this.sprite.pixels, 0);
                }
                else {
                    this.sprite = new SpritePixels(n11, n12);
                }
                this.minCachedTileX = (this.getDisplayX(-636371593) - n5 / 2 - n7) * -1316647483;
                this.minCachedTileY = (this.getDisplayY((byte)0) - n6 / 2 - n7) * 1178523109;
                this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile * -1454354698;
                class132.field1277.method1938(this.minCachedTileX * -1497859011, -2022260021 * this.minCachedTileY, this.sprite, -966776445 * this.cachedPixelsPerTile / n10, -1255534434);
                this.field3957 = Client.field648 * 856129560;
                n15 = n - this.worldMapManager.pixelsPerTile * -1804639353 * (n7 + n13 - this.minCachedTileX * -244681139);
                n16 = n2 - (n7 - (n14 - -684341452 * this.minCachedTileY)) * (this.worldMapManager.pixelsPerTile * -1655947893);
            }
            Rasterizer2D.Rasterizer2D_fillRectangleAlpha(n, n2, n3, n4, 0, -193177846);
            if (1.0f == n10) {
                this.sprite.method2631(n15, n16, 192);
            }
            else {
                this.sprite.method2607(n15, n16, (int)(n11 * n10), (int)(n10 * n12), 923447464);
            }
        }
    }
    
    public AbstractWorldMapIcon iconNext(final byte b) {
        try {
            if (this.iconIterator != null) {
                while (this.iconIterator.hasNext()) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    final AbstractWorldMapIcon abstractWorldMapIcon = this.iconIterator.next();
                    if (abstractWorldMapIcon.getElement(-1616063448) == -1) {
                        continue;
                    }
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    return abstractWorldMapIcon;
                }
                return null;
            }
            if (b >= 0) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.cu(" + ')');
        }
    }
    
    public static boolean iconNext(final WorldMap worldMap, final int i) {
        return !worldMap.enabledElements.contains(i);
    }
    
    public static float hx(final WorldMap worldMap, final int n) {
        if (worldMap == null) {
            worldMap.ec(n, n);
        }
        if (n == 25) {
            return 1.0f;
        }
        if (n == 1742266149) {
            return 1.5f;
        }
        if (n == -1540522212) {
            return 2.0f;
        }
        if (75 == n) {
            return 3.0f;
        }
        if (100 == n) {
            return 4.0f;
        }
        return 8.0f;
    }
    
    public AbstractWorldMapIcon hr() {
        if (!this.cacheLoader.isLoaded(-1414353828)) {
            return null;
        }
        if (!this.worldMapManager.isLoaded(-1035683175)) {
            return null;
        }
        final HashMap buildIcons = this.worldMapManager.buildIcons((byte)86);
        this.field3948 = new LinkedList();
        final Iterator<List> iterator = buildIcons.values().iterator();
        while (iterator.hasNext()) {
            this.field3948.addAll(iterator.next());
        }
        this.iconIterator = this.field3948.iterator();
        return this.iconNext((byte)(-67));
    }
    
    public void method2329(final int n) {
        try {
            this.flashingElements = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bv(" + ')');
        }
    }
    
    public void method2331(final int n, final int n2, final boolean b, final boolean b2, final int n3) {
        try {
            final long clockNow = class96.clockNow(829810502);
            this.method2332(n, n2, b2, clockNow);
            Label_0261: {
                Label_0254: {
                    if (!this.hasTarget(-1874644883)) {
                        if (n3 >= -525589881) {
                            throw new IllegalStateException();
                        }
                        if (!b2) {
                            if (n3 >= -525589881) {
                                throw new IllegalStateException();
                            }
                            if (!b) {
                                break Label_0254;
                            }
                            if (n3 >= -525589881) {
                                throw new IllegalStateException();
                            }
                        }
                        if (!InvDefinition.method978((byte)(-70))) {
                            if (n3 >= -525589881) {
                                return;
                            }
                            if (b2) {
                                if (n3 >= -525589881) {
                                    return;
                                }
                                this.field3902 = 99962399 * n;
                                this.field3936 = 531836949 * n2;
                                this.field3933 = 592139365 * this.centerTileX;
                                this.field3942 = 1696219827 * this.centerTileY;
                            }
                            if (-1 != -1960645157 * this.field3933) {
                                this.setWorldMapPosition(this.field3933 * -1960645157 - (int)((n - this.field3902 * -642077217) / this.zoomTarget), -1246558373 * this.field3942 + (int)((n2 - -2058412227 * this.field3936) / this.zoomTarget), false, (short)254);
                            }
                            break Label_0261;
                        }
                    }
                }
                this.method2334(-1514974800);
            }
            if (b2) {
                if (n3 >= -525589881) {
                    throw new IllegalStateException();
                }
                this.field3937 = 7451806700989670229L * clockNow;
                this.field3938 = n * -1462297475;
                this.field3939 = n2 * -88109587;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ac(" + ')');
        }
    }
    
    public int qc() {
        return this.worldMapDisplayY * -1710969485;
    }
    
    public static void ze(final WorldMap worldMap) {
        if (worldMap == null) {
            worldMap.ga();
        }
        if (!worldMap.hasTarget(-1946568952)) {
            return;
        }
        int a = worldMap.worldMapTargetX * 506744801 - worldMap.centerTileX * -84102297;
        int a2 = worldMap.worldMapTargetY * 1744520039 - worldMap.centerTileY * -632186207;
        if (a != 0) {
            a /= Math.min(8, Math.abs(a));
        }
        if (a2 != 0) {
            a2 /= Math.min(8, Math.abs(a2));
        }
        worldMap.setWorldMapPosition(-84102297 * worldMap.centerTileX + a, a2 + worldMap.centerTileY * -632186207, true, (short)254);
        if (worldMap.worldMapTargetX * 506744801 == worldMap.centerTileX * -84102297 && 1744520039 * worldMap.worldMapTargetY == worldMap.centerTileY * -632186207) {
            worldMap.worldMapTargetX = -2080912417;
            worldMap.worldMapTargetY = -667691095;
        }
    }
    
    public void ec(final int n, final int n2) {
        if (null == this.currentMapArea) {
            return;
        }
        this.setWorldMapPosition(n - this.currentMapArea.getRegionLowX(16748608) * 64, n2 - this.currentMapArea.getRegionLowY(-915074454) * 64, true, (short)254);
        this.worldMapTargetX = -2080912417;
        this.worldMapTargetY = -667691095;
    }
    
    public void flashElement(final int i, final int n) {
        try {
            (this.flashingElements = new HashSet()).add(i);
            this.flashCount = 0;
            this.flashCycle = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bq(" + ')');
        }
    }
    
    final void do() {
        this.field3936 = -531836949;
        this.field3902 = -99962399;
        this.field3942 = -387305683;
        this.field3933 = 1462155693;
    }
    
    public void gd(final int n, final boolean b) {
        if (!b) {
            this.enabledCategories.add(n);
        }
        else {
            this.enabledCategories.remove(n);
        }
        for (int i = 0; i < class328.WorldMapElement_count * 1110002224; ++i) {
            if (class354.method1935(i, 2074456215) != null) {
                if (class354.method1935(i, 2145045741).category * -461862935 == n) {
                    final int n2 = class354.method1935(i, 1874503511).objectId * 2072327221;
                    if (!b) {
                        this.enabledElementIds.add(n2);
                    }
                    else {
                        this.enabledElementIds.remove(n2);
                    }
                }
            }
        }
        this.method2375((byte)(-15));
    }
    
    public int fr() {
        return 1083037913 * this.worldMapDisplayHeight;
    }
    
    public void de(final int n) {
        try {
            this.cacheLoader.load(-503506459);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bb(" + ')');
        }
    }
    
    public static void ko(final WorldMap worldMap, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (worldMap == null) {
            worldMap.method2339(n, n, n, n, n, n, n);
            return;
        }
        try {
            if (class132.field1277 != null) {
                final int n8 = 512 / (983071510 * worldMap.worldMapManager.pixelsPerTile);
                final int n9 = 512 + n3;
                final int n10 = n4 + 512;
                final float n11 = 1.0f;
                final int n12 = (int)(n9 / n11);
                final int n13 = (int)(n10 / n11);
                final int n14 = worldMap.getDisplayX(-1167233766) - n5 / 2 - n8;
                final int n15 = worldMap.getDisplayY((byte)0) - n6 / 2 - n8;
                int n16 = n - worldMap.worldMapManager.pixelsPerTile * -1655947893 * (n8 + n14 - worldMap.minCachedTileX * 334129421);
                int n17 = n2 - (n8 - (n15 - worldMap.minCachedTileY * 627335149)) * (-1655947893 * worldMap.worldMapManager.pixelsPerTile);
                if (worldMap.method2366(n12, n13, n16, n17, n3, n4, -879179620)) {
                    if (n7 != 1052800047) {
                        return;
                    }
                    Label_0332: {
                        if (worldMap.sprite != null && worldMap.sprite.subWidth == n12) {
                            if (n7 != 1052800047) {
                                throw new IllegalStateException();
                            }
                            if (n13 == worldMap.sprite.subHeight) {
                                Arrays.fill(worldMap.sprite.pixels, 0);
                                break Label_0332;
                            }
                            if (n7 != 1052800047) {
                                return;
                            }
                        }
                        worldMap.sprite = new SpritePixels(n12, n13);
                    }
                    worldMap.minCachedTileX = (worldMap.getDisplayX(-930495552) - n5 / 2 - n8) * -1316647483;
                    worldMap.minCachedTileY = (worldMap.getDisplayY((byte)0) - n6 / 2 - n8) * 1178523109;
                    worldMap.cachedPixelsPerTile = worldMap.worldMapManager.pixelsPerTile * 219395697;
                    class132.field1277.method1938(worldMap.minCachedTileX * 334129421, 627335149 * worldMap.minCachedTileY, worldMap.sprite, 1547438523 * worldMap.cachedPixelsPerTile / n11, 47289372);
                    worldMap.field3957 = Client.field648 * 2048189963;
                    n16 = n - worldMap.worldMapManager.pixelsPerTile * -1655947893 * (n8 + n14 - worldMap.minCachedTileX * 334129421);
                    n17 = n2 - (n8 - (n15 - 627335149 * worldMap.minCachedTileY)) * (worldMap.worldMapManager.pixelsPerTile * -1655947893);
                }
                Rasterizer2D.Rasterizer2D_fillRectangleAlpha(n, n2, n3, n4, 0, 128);
                if (1.0f == n11) {
                    if (n7 != 1052800047) {
                        throw new IllegalStateException();
                    }
                    worldMap.sprite.method2631(n16, n17, 192);
                }
                else {
                    worldMap.sprite.method2607(n16, n17, (int)(n12 * n11), (int)(n11 * n13), 192);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ak(" + ')');
        }
    }
    
    public static void ko(final WorldMap worldMap, final int n, final int n2, final int n3, final boolean b) {
        if (worldMap == null) {
            worldMap.ex(n, n);
        }
        WorldMapArea field3931 = worldMap.mapAreaAtCoord(n, n2, n3, (byte)2);
        if (field3931 == null) {
            if (!b) {
                return;
            }
            field3931 = worldMap.mainMapArea;
        }
        boolean b2 = false;
        if (worldMap.field3931 != field3931 || b) {
            worldMap.setCurrentMapArea(worldMap.field3931 = field3931, -1483320853);
            b2 = true;
        }
        if (b2 || b) {
            worldMap.jump(n, n2, n3, -1605938577);
        }
    }
    
    public void ge(final int n) {
        try {
            this.cyclesPerFlash = 726470486;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bu(" + ')');
        }
    }
    
    public int fl() {
        if (null == this.currentMapArea) {
            return -1;
        }
        return -84102297 * this.centerTileX + this.currentMapArea.getRegionLowX(16748608) * 64;
    }
    
    public int fo() {
        if (this.currentMapArea == null) {
            return -1;
        }
        return -632186207 * this.centerTileY + this.currentMapArea.getRegionLowY(-275144775) * 64;
    }
    
    public static void ri(final WorldMap worldMap, final int n, final boolean b) {
        if (worldMap == null) {
            worldMap.ch();
            return;
        }
        if (!b) {
            worldMap.enabledCategories.add(n);
        }
        else {
            worldMap.enabledCategories.remove(n);
        }
        for (int i = 0; i < class328.WorldMapElement_count * 1597997186; ++i) {
            if (class354.method1935(i, 1985156763) != null) {
                if (class354.method1935(i, 2078803617).category * -461862935 == n) {
                    final int n2 = class354.method1935(i, 1912725351).objectId * 219774827;
                    if (!b) {
                        worldMap.enabledElementIds.add(n2);
                    }
                    else {
                        worldMap.enabledElementIds.remove(n2);
                    }
                }
            }
        }
        worldMap.method2375((byte)(-46));
    }
    
    public void gt() {
        this.flashingElements = null;
    }
    
    public int fa() {
        return -1222006759 * this.worldMapDisplayWidth;
    }
    
    public static void sv(final WorldMap worldMap, final int n, final int n2, final boolean b, final int n3, final int n4, final int n5, final int n6) {
        if (worldMap == null) {
            worldMap.hj(n, n);
            return;
        }
        if (!worldMap.cacheLoader.isLoaded(-1834292981)) {
            return;
        }
        worldMap.smoothZoom(590619642);
        worldMap.scrollToTarget(-1610316737);
        if (!b) {
            return;
        }
        final int n7 = (int)Math.ceil(n5 / worldMap.zoom);
        final int n8 = (int)Math.ceil(n6 / worldMap.zoom);
        final List method1478 = worldMap.worldMapManager.method1478(-84102297 * worldMap.centerTileX - n7 / 2 - 1, worldMap.centerTileY * -632186207 - n8 / 2 - 1, 1 + (worldMap.centerTileX * -84102297 + n7 / 2), 1 + (n8 / 2 + worldMap.centerTileY * -632186207), n3, n4, n5, n6, n, n2, 1269120835);
        final HashSet<AbstractWorldMapIcon> field3924 = new HashSet<AbstractWorldMapIcon>();
        for (final AbstractWorldMapIcon abstractWorldMapIcon : method1478) {
            field3924.add(abstractWorldMapIcon);
            final ScriptEvent scriptEvent = new ScriptEvent();
            scriptEvent.setArgs(new Object[] { new WorldMapEvent(abstractWorldMapIcon.getElement(-512573431), abstractWorldMapIcon.coord1, abstractWorldMapIcon.coord2), n, n2 }, -279711259);
            if (worldMap.field3924.contains(abstractWorldMapIcon)) {
                scriptEvent.setType(17, -1258302275);
            }
            else {
                scriptEvent.setType(15, 793415627);
            }
            HealthBarUpdate.set(scriptEvent, (byte)(-7));
        }
        for (final AbstractWorldMapIcon o : worldMap.field3924) {
            if (!field3924.contains(o)) {
                final ScriptEvent scriptEvent2 = new ScriptEvent();
                scriptEvent2.setArgs(new Object[] { new WorldMapEvent(o.getElement(-1042697453), o.coord1, o.coord2), n, n2 }, 1302200904);
                scriptEvent2.setType(16, -1444355686);
                HealthBarUpdate.set(scriptEvent2, (byte)(-43));
            }
        }
        worldMap.field3924 = field3924;
    }
    
    public boolean ed() {
        return !this.elementsDisabled;
    }
    
    void ea(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = 20;
        final int n7 = n + n3 / 2;
        final int n8 = n2 + n4 / 2 - 18 - n6;
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, -16777216);
        Rasterizer2D.Rasterizer2D_drawRectangle(n7 - 152, n8, 304, 34, -65536);
        Rasterizer2D.Rasterizer2D_fillRectangle(n7 - 150, 2 + n8, n5 * 3, 30, -65536);
        this.font.aj(Strings.mb, n7, n6 + n8, -1, -1);
    }
    
    void method2332(final int n, final int n2, final boolean b, final long n3) {
        try {
            if (this.currentMapArea != null) {
                this.mouseCoord = this.currentMapArea.coord((int)(-84102297 * this.centerTileX + (n - this.worldMapDisplayX * 817997135 - this.getDisplayWith((byte)103) * this.zoom / 2.0f) / this.zoom) + this.currentMapArea.getRegionLowX(16748608) * 64, (int)(this.centerTileY * -632186207 - (n2 - this.worldMapDisplayY * -1710969485 - this.getDisplayHeight(-947809621) * this.zoom / 2.0f) / this.zoom) + this.currentMapArea.getRegionLowY(-1322331114) * 64, 2133508945);
                if (null != this.mouseCoord && b) {
                    final class207 keyHandlerInstance = Client.keyHandlerInstance;
                    if (Client.staffModLevel * 324465533 >= 2 && keyHandlerInstance.getKeyPressed(82, -689223036) && keyHandlerInstance.getKeyPressed(81, -366068816)) {
                        final int n4 = this.mouseCoord.x * -96298701;
                        final int n5 = -2105445199 * this.mouseCoord.y;
                        final int n6 = this.mouseCoord.plane * -113644749;
                        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2545, Client.packetWriter.isaacCipher, (short)(-3299));
                        packetBufferNode.packetBuffer.dy(0, (byte)(-5));
                        packetBufferNode.packetBuffer.bu(n4, (byte)91);
                        packetBufferNode.packetBuffer.eb(n6, (byte)(-49));
                        packetBufferNode.packetBuffer.ds(n5, -1604623959);
                        Client.packetWriter.addNode(packetBufferNode, 414135591);
                    }
                    else {
                        boolean b2 = true;
                        if (this.field3908) {
                            final int n7 = n - this.field3938 * -1959248683;
                            final int n8 = n2 - -1379608603 * this.field3939;
                            if (n3 - 492133368256496125L * this.field3937 > 500L || n7 < -25 || n7 > 25 || n8 < -25 || n8 > 25) {
                                b2 = false;
                            }
                        }
                        if (b2) {
                            final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.field2510, Client.packetWriter.isaacCipher, (short)(-20822));
                            packetBufferNode2.packetBuffer.el(this.mouseCoord.packed(-964267539), -437883978);
                            Client.packetWriter.addNode(packetBufferNode2, 414135591);
                            this.field3937 = 0L;
                        }
                    }
                }
            }
            else {
                this.mouseCoord = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.au(" + ')');
        }
    }
    
    public void fm(final int n) {
        this.flashingElements = new HashSet();
        this.flashCount = 0;
        this.flashCycle = 0;
        for (int i = 0; i < 377946909 * class328.WorldMapElement_count; ++i) {
            if (class354.method1935(i, 2066060971) != null) {
                if (class354.method1935(i, 2143474681).category * -461862935 == n) {
                    this.flashingElements.add(class354.method1935(i, 1960881624).objectId * -1945242275);
                }
            }
        }
    }
    
    public void fe(final int n, final int n2, final int n3) {
        if (null == this.currentMapArea) {
            return;
        }
        final int[] position = this.currentMapArea.position(n, n2, n3, (byte)6);
        if (position != null) {
            this.setWorldMapPositionTarget(position[0], position[1], (byte)5);
        }
    }
    
    boolean hasTarget(final int n) {
        try {
            boolean b;
            if (-1 != 506744801 * this.worldMapTargetX && this.worldMapTargetY * 1744520039 != -1) {
                if (n >= -1542843452) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.aa(" + ')');
        }
    }
    
    public boolean gl(final int i) {
        return !this.enabledCategories.contains(i);
    }
    
    public int currentMapAreaId(final int n) {
        try {
            if (this.currentMapArea != null) {
                return WorldMapArea.wo(this.currentMapArea, -964267539);
            }
            if (n == 1666227226) {
                throw new IllegalStateException();
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ai(" + ')');
        }
    }
    
    public WorldMapArea ii() {
        return this.currentMapArea;
    }
    
    public void fi(final int n, final int n2, final int n3) {
        if (this.currentMapArea == null) {
            return;
        }
        final int[] position = this.currentMapArea.position(n, n2, n3, (byte)6);
        if (position != null) {
            this.fs(position[0], position[1], -2000294595);
        }
    }
    
    void dx(final WorldMapArea worldMapArea) {
        if (null != this.currentMapArea && this.currentMapArea == worldMapArea) {
            return;
        }
        this.initializeWorldMapManager(worldMapArea, 1639466020);
        this.jump(-1, -1, -1, -1605938577);
    }
    
    public void dy(final WorldMapArea worldMapArea, final Coord coord, final Coord coord2, final boolean b) {
        if (null == worldMapArea) {
            return;
        }
        if (null == this.currentMapArea || this.currentMapArea != worldMapArea) {
            this.initializeWorldMapManager(worldMapArea, 1393824566);
        }
        if (b || !this.currentMapArea.containsCoord(-113644749 * coord.plane, -96298701 * coord.x, coord.y * -2105445199, -586405943)) {
            this.jump(496726355 * coord2.plane, coord2.x * 1592574919, coord2.y * -786479425, -1605938577);
        }
        else {
            this.jump(-113644749 * coord.plane, 493250459 * coord.x, coord.y * -2054896381, -1605938577);
        }
    }
    
    public void gg(final int n) {
        if (n >= 1) {
            this.cyclesPerFlash = 787623523 * n;
        }
    }
    
    public int ki() {
        return this.worldMapDisplayX * 817997135;
    }
    
    public int kr() {
        return this.worldMapTargetY * 1744520039;
    }
    
    public int fx() {
        if (this.currentMapArea == null) {
            return -1;
        }
        return -632186207 * this.centerTileY + this.currentMapArea.getRegionLowY(1270755809) * 64;
    }
    
    public int fy() {
        return 1077411767 * this.worldMapDisplayHeight;
    }
    
    public boolean getElementsDisabled(final short n) {
        try {
            boolean b;
            if (!this.elementsDisabled) {
                if (n != 480) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bh(" + ')');
        }
    }
    
    public int getZoomLevel(final byte b) {
        try {
            if (1.0 == this.zoomTarget) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                return 25;
            }
            else if (1.5 == this.zoomTarget) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                return 37;
            }
            else if (2.0 == this.zoomTarget) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                return 50;
            }
            else if (this.zoomTarget == 3.0) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                return 75;
            }
            else {
                if (this.zoomTarget != 4.0) {
                    return 200;
                }
                if (b != 0) {
                    throw new IllegalStateException();
                }
                return 100;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.by(" + ')');
        }
    }
    
    public void setWorldMapPositionTargetInstant(final int n, final int n2, final int n3) {
        if (this.currentMapArea == null) {
            return;
        }
        final int[] position = this.currentMapArea.position(n, n2, n3, (byte)6);
        if (position != null) {
            this.fs(position[0], position[1], 1399258254);
        }
    }
    
    public void method2350(final WorldMapArea worldMapArea, final Coord coord, final Coord coord2, final boolean b, final int n) {
        try {
            if (null != worldMapArea) {
                Label_0188: {
                    if (null != this.currentMapArea) {
                        if (this.currentMapArea == worldMapArea) {
                            break Label_0188;
                        }
                        if (n <= -30340522) {
                            throw new IllegalStateException();
                        }
                    }
                    this.initializeWorldMapManager(worldMapArea, -168114287);
                }
                if (!b) {
                    if (n <= -30340522) {
                        throw new IllegalStateException();
                    }
                    if (this.currentMapArea.containsCoord(-113644749 * coord.plane, -96298701 * coord.x, coord.y * -2105445199, 129497682)) {
                        this.jump(-113644749 * coord.plane, -96298701 * coord.x, coord.y * -2105445199, -1605938577);
                        return;
                    }
                    if (n <= -30340522) {
                        throw new IllegalStateException();
                    }
                }
                this.jump(-113644749 * coord2.plane, coord2.x * -96298701, coord2.y * -2105445199, -1605938577);
                return;
            }
            if (n <= -30340522) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ar(" + ')');
        }
    }
    
    float getZoomFromPercentage(final int n, final int n2) {
        try {
            if (n == 25) {
                if (n2 == 506576733) {
                    throw new IllegalStateException();
                }
                return 1.0f;
            }
            else if (n == 37) {
                if (n2 == 506576733) {
                    throw new IllegalStateException();
                }
                return 1.5f;
            }
            else if (n == 50) {
                if (n2 == 506576733) {
                    throw new IllegalStateException();
                }
                return 2.0f;
            }
            else if (75 == n) {
                if (n2 == 506576733) {
                    throw new IllegalStateException();
                }
                return 3.0f;
            }
            else {
                if (100 == n) {
                    return 4.0f;
                }
                return 8.0f;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ap(" + ')');
        }
    }
    
    public int kd() {
        return this.centerTileY * -632186207;
    }
    
    public int getDisplayY(final byte b) {
        try {
            if (this.currentMapArea != null) {
                return -632186207 * this.centerTileY + this.currentMapArea.getRegionLowY(-1704163402) * 64;
            }
            if (b != 0) {
                throw new IllegalStateException();
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bd(" + ')');
        }
    }
    
    public void cm(final AbstractArchive worldMap_archive, final AbstractArchive worldMap_geographyArchive, final AbstractArchive worldMap_groundArchive, final Font font, final HashMap hashMap, final IndexedSprite[] mapSceneSprites) {
        this.mapSceneSprites = mapSceneSprites;
        this.WorldMap_archive = worldMap_archive;
        this.WorldMap_geographyArchive = worldMap_geographyArchive;
        this.WorldMap_groundArchive = worldMap_groundArchive;
        this.font = font;
        (this.fonts = new HashMap()).put(WorldMapLabelSize.WorldMapLabelSize_small, hashMap.get(WorldMap.fontNameVerdana11));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, hashMap.get(WorldMap.fontNameVerdana13));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, hashMap.get(WorldMap.fontNameVerdana15));
        this.cacheLoader = new WorldMapArchiveLoader(worldMap_archive);
        final int fileFlat = AbstractArchive.getFileFlat(this.WorldMap_archive, WorldMapCacheName.field2435.name, -289898489);
        final int[] yk = AbstractArchive.yk(this.WorldMap_archive, fileFlat, 623283668);
        final int initialCapacity = (yk == null) ? 0 : yk.length;
        this.details = new HashMap(initialCapacity);
        for (int i = 0; i < initialCapacity; ++i) {
            final Buffer buffer = new Buffer(this.WorldMap_archive.takeFile(fileFlat, yk[i], (byte)(-22)));
            final WorldMapArea worldMapArea = new WorldMapArea();
            worldMapArea.read(buffer, yk[i], (byte)5);
            this.details.put(worldMapArea.getInternalName(-724737258), worldMapArea);
            if (WorldMapArea.getId(worldMapArea, -926489840)) {
                this.mainMapArea = worldMapArea;
            }
        }
        this.setCurrentMapArea(this.mainMapArea, -1483320853);
        this.field3931 = null;
    }
    
    public void setCyclesPerFlash(final int n, final byte b) {
        try {
            if (n >= 1) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                this.maxFlashCount = -960896665 * n;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bs(" + ')');
        }
    }
    
    public AbstractWorldMapIcon hl() {
        if (!this.cacheLoader.isLoaded(712642788)) {
            return null;
        }
        if (!this.worldMapManager.isLoaded(-1914642273)) {
            return null;
        }
        final HashMap buildIcons = this.worldMapManager.buildIcons((byte)39);
        this.field3948 = new LinkedList();
        final Iterator<List> iterator = buildIcons.values().iterator();
        while (iterator.hasNext()) {
            this.field3948.addAll(iterator.next());
        }
        this.iconIterator = this.field3948.iterator();
        return this.iconNext((byte)(-38));
    }
    
    public boolean gb() {
        return !this.elementsDisabled;
    }
    
    void co(final int n, final int n2, final boolean b, final long n3) {
        if (this.currentMapArea != null) {
            this.mouseCoord = this.currentMapArea.coord((int)(-410746520 * this.centerTileX + (n - this.worldMapDisplayX * 817997135 - this.getDisplayWith((byte)86) * this.zoom / 2.0f) / this.zoom) + this.currentMapArea.getRegionLowX(16748608) * 1636881074, (int)(this.centerTileY * -1203973138 - (n2 - this.worldMapDisplayY * 1912558393 - this.getDisplayHeight(2097886997) * this.zoom / 2.0f) / this.zoom) + this.currentMapArea.getRegionLowY(402599440) * 1256085057, 1477274250);
            if (null != this.mouseCoord && b) {
                final class207 keyHandlerInstance = Client.keyHandlerInstance;
                if (Client.staffModLevel * -1073920603 >= 2 && keyHandlerInstance.getKeyPressed(82, -1334872437) && keyHandlerInstance.getKeyPressed(649214368, -1642009145)) {
                    final int n4 = this.mouseCoord.x * 393922651;
                    final int n5 = -396408734 * this.mouseCoord.y;
                    final int n6 = this.mouseCoord.plane * -113644749;
                    final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2545, Client.packetWriter.isaacCipher, (short)(-30222));
                    packetBufferNode.packetBuffer.dy(0, (byte)(-44));
                    packetBufferNode.packetBuffer.bu(n4, (byte)23);
                    packetBufferNode.packetBuffer.eb(n6, (byte)(-72));
                    packetBufferNode.packetBuffer.ds(n5, -1041569456);
                    Client.packetWriter.addNode(packetBufferNode, 414135591);
                }
                else {
                    boolean b2 = true;
                    if (this.field3908) {
                        final int n7 = n - this.field3938 * -1959248683;
                        final int n8 = n2 - -1048969760 * this.field3939;
                        if (n3 - 492133368256496125L * this.field3937 > 500L || n7 < -25 || n7 > 25 || n8 < -1091942327 || n8 > 25) {
                            b2 = false;
                        }
                    }
                    if (b2) {
                        final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.field2510, Client.packetWriter.isaacCipher, (short)(-24697));
                        packetBufferNode2.packetBuffer.el(this.mouseCoord.packed(-964267539), -437883978);
                        Client.packetWriter.addNode(packetBufferNode2, 414135591);
                        this.field3937 = 0L;
                    }
                }
            }
        }
        else {
            this.mouseCoord = null;
        }
    }
    
    public boolean hw(final int i) {
        return !this.enabledElements.contains(i);
    }
    
    public void er() {
        this.cacheLoader.load(-531658846);
    }
    
    public boolean gx(final int i) {
        return !this.enabledCategories.contains(i);
    }
    
    public void gy(final int n, final boolean b) {
        if (!b) {
            this.enabledCategories.add(n);
        }
        else {
            this.enabledCategories.remove(n);
        }
        for (int i = 0; i < class328.WorldMapElement_count * -1703136055; ++i) {
            if (class354.method1935(i, 2090821109) != null) {
                if (class354.method1935(i, 2069841739).category * -461862935 == n) {
                    final int n2 = class354.method1935(i, 1885379031).objectId * 219774827;
                    if (!b) {
                        this.enabledElementIds.add(n2);
                    }
                    else {
                        this.enabledElementIds.remove(n2);
                    }
                }
            }
        }
        this.method2375((byte)(-8));
    }
    
    public void gh(final boolean b) {
        this.elementsDisabled = !b;
    }
    
    void eu(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = 20;
        final int n7 = n + n3 / 2;
        final int n8 = n2 + n4 / 2 - 18 - n6;
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, -16777216);
        Rasterizer2D.Rasterizer2D_drawRectangle(n7 - 152, n8, 304, 34, -65536);
        Rasterizer2D.Rasterizer2D_fillRectangle(n7 - 150, 2 + n8, n5 * 3, 30, -65536);
        this.font.aj(Strings.mb, n7, n6 + n8, -1, -1);
    }
    
    public void init(final AbstractArchive worldMap_groundArchive, final AbstractArchive worldMap_archive, final AbstractArchive worldMap_archive2, final Font font, final HashMap hashMap, final IndexedSprite[] mapSceneSprites, final int n) {
        try {
            this.mapSceneSprites = mapSceneSprites;
            this.WorldMap_groundArchive = worldMap_groundArchive;
            this.WorldMap_archive = worldMap_archive;
            this.WorldMap_archive = worldMap_archive2;
            this.font = font;
            (this.details = new HashMap()).put(WorldMapLabelSize.WorldMapLabelSize_small, hashMap.get(WorldMap.fontNameVerdana13));
            this.details.put(WorldMapLabelSize.WorldMapLabelSize_large, hashMap.get(WorldMap.fontNameVerdana11));
            this.details.put(WorldMapLabelSize.WorldMapLabelSize_large, hashMap.get(WorldMap.fontNameVerdana11));
            this.cacheLoader = new WorldMapArchiveLoader(worldMap_groundArchive);
            final int fileFlat = AbstractArchive.getFileFlat(this.WorldMap_geographyArchive, WorldMapCacheName.field2439.name, -44197407);
            final int[] yk = AbstractArchive.yk(this.WorldMap_geographyArchive, fileFlat, 428898733);
            int length;
            if (yk == null) {
                if (n == -84102297) {
                    throw new IllegalStateException();
                }
                length = 0;
            }
            else {
                length = yk.length;
            }
            final int initialCapacity = length;
            this.fonts = new HashMap(initialCapacity);
            for (int i = 0; i < initialCapacity; ++i) {
                final Buffer buffer = new Buffer(this.WorldMap_groundArchive.takeFile(fileFlat, yk[i], (byte)(-120)));
                final WorldMapArea worldMapArea = new WorldMapArea();
                worldMapArea.read(buffer, yk[i], (byte)(-126));
                this.fonts.put(worldMapArea.getInternalName(1181486070), worldMapArea);
                if (WorldMapArea.getId(worldMapArea, -926489840)) {
                    if (n == -84102297) {
                        throw new IllegalStateException();
                    }
                    this.mainMapArea = worldMapArea;
                }
            }
            this.initializeWorldMapManager(this.field3931, -1483320853);
            this.field3931 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.af(" + ')');
        }
    }
    
    public int getDisplayHeight(final int n) {
        try {
            return 1077411767 * this.worldMapDisplayHeight;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bn(" + ')');
        }
    }
    
    void cz(final int n, final int n2, final boolean b, final long n3) {
        if (this.currentMapArea != null) {
            this.mouseCoord = this.currentMapArea.coord((int)(-84102297 * this.centerTileX + (n - this.worldMapDisplayX * 817997135 - this.getDisplayWith((byte)33) * this.zoom / 2.0f) / this.zoom) + this.currentMapArea.getRegionLowX(16748608) * 64, (int)(this.centerTileY * -632186207 - (n2 - this.worldMapDisplayY * -1710969485 - this.getDisplayHeight(1162890872) * this.zoom / 2.0f) / this.zoom) + this.currentMapArea.getRegionLowY(-365940176) * 64, 1450739219);
            if (null != this.mouseCoord && b) {
                final class207 keyHandlerInstance = Client.keyHandlerInstance;
                if (Client.staffModLevel * 324465533 >= 2 && keyHandlerInstance.getKeyPressed(82, -833825672) && keyHandlerInstance.getKeyPressed(81, -200780249)) {
                    final int n4 = this.mouseCoord.x * -96298701;
                    final int n5 = -2105445199 * this.mouseCoord.y;
                    final int n6 = this.mouseCoord.plane * -113644749;
                    final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2545, Client.packetWriter.isaacCipher, (short)(-17742));
                    packetBufferNode.packetBuffer.dy(0, (byte)(-38));
                    packetBufferNode.packetBuffer.bu(n4, (byte)43);
                    packetBufferNode.packetBuffer.eb(n6, (byte)(-31));
                    packetBufferNode.packetBuffer.ds(n5, -1289180696);
                    Client.packetWriter.addNode(packetBufferNode, 414135591);
                }
                else {
                    int n7 = 1;
                    if (this.field3908) {
                        final int n8 = n - this.field3938 * -1959248683;
                        final int n9 = n2 - -1379608603 * this.field3939;
                        if (n3 - 492133368256496125L * this.field3937 > 500L || n8 < -25 || n8 > 25 || n9 < -25 || n9 > 25) {
                            n7 = 0;
                        }
                    }
                    if (n7 != 0) {
                        final PacketBufferNode packetBufferNode2 = class330.getPacketBufferNode(ClientPacket.field2510, Client.packetWriter.isaacCipher, (short)(-1706));
                        packetBufferNode2.packetBuffer.el(this.mouseCoord.packed(-964267539), -437883978);
                        Client.packetWriter.addNode(packetBufferNode2, 414135591);
                        this.field3937 = 0L;
                    }
                }
            }
        }
        else {
            this.mouseCoord = null;
        }
    }
    
    boolean dr() {
        return -1 != -1244024819 * this.worldMapTargetX && this.worldMapTargetY * 1744520039 != -1;
    }
    
    public void ga() {
        this.flashingElements = null;
    }
    
    void smoothZoom(final int n) {
        try {
            if (class132.field1277 == null) {
                if (this.zoom < this.zoomTarget) {
                    if (n <= -1372356650) {
                        throw new IllegalStateException();
                    }
                    this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0f + this.zoom);
                }
                if (this.zoom > this.zoomTarget) {
                    if (n <= -1372356650) {
                        throw new IllegalStateException();
                    }
                    this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0f);
                }
                return;
            }
            if (n <= -1372356650) {
                return;
            }
            this.zoom = this.zoomTarget;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ab(" + ')');
        }
    }
    
    void scrollToTarget(final int n) {
        try {
            if (this.hasTarget(-2020338429)) {
                int a = this.worldMapTargetX * 506744801 - this.centerTileX * -84102297;
                int a2 = this.worldMapTargetY * 1744520039 - this.centerTileY * -632186207;
                if (a != 0) {
                    if (n >= -1419490017) {
                        return;
                    }
                    a /= Math.min(8, Math.abs(a));
                }
                if (a2 != 0) {
                    a2 /= Math.min(8, Math.abs(a2));
                }
                this.setWorldMapPosition(-84102297 * this.centerTileX + a, a2 + this.centerTileY * -632186207, true, (short)254);
                if (this.worldMapTargetX * 506744801 == this.centerTileX * -84102297) {
                    if (n >= -1419490017) {
                        throw new IllegalStateException();
                    }
                    if (1744520039 * this.worldMapTargetY == this.centerTileY * -632186207) {
                        if (n >= -1419490017) {
                            throw new IllegalStateException();
                        }
                        this.worldMapTargetX = -2080912417;
                        this.worldMapTargetY = -667691095;
                    }
                }
                return;
            }
            if (n >= -1419490017) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.aq(" + ')');
        }
    }
    
    boolean method2366(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        try {
            if (null != this.sprite) {
                if (this.sprite.subWidth == n) {
                    if (n7 >= 1064772455) {
                        throw new IllegalStateException();
                    }
                    if (this.sprite.subHeight != n2) {
                        if (n7 >= 1064772455) {
                            throw new IllegalStateException();
                        }
                    }
                    else if (-1655947893 * this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile * 1547438523) {
                        if (n7 >= 1064772455) {
                            throw new IllegalStateException();
                        }
                        return true;
                    }
                    else {
                        if (this.field3957 * 2016965279 == -1680619819 * Client.field648) {
                            if (n3 <= 0) {
                                if (n7 >= 1064772455) {
                                    throw new IllegalStateException();
                                }
                                if (n4 <= 0) {
                                    if (n + n3 >= n5) {
                                        if (n7 >= 1064772455) {
                                            throw new IllegalStateException();
                                        }
                                        if (n4 + n2 >= n6) {
                                            return false;
                                        }
                                        if (n7 >= 1064772455) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    return true;
                                }
                            }
                            return true;
                        }
                        if (n7 >= 1064772455) {
                            throw new IllegalStateException();
                        }
                        return true;
                    }
                }
                return true;
            }
            if (n7 >= 1064772455) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.aj(" + ')');
        }
    }
    
    public WorldMapArea getCurrentMapArea(final byte b) {
        try {
            return this.currentMapArea;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ag(" + ')');
        }
    }
    
    public void setElementsDisabled(final boolean perpetualFlash, final int n) {
        try {
            this.perpetualFlash = perpetualFlash;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bf(" + ')');
        }
    }
    
    public void dg(final int n) {
        final WorldMapArea mapArea = this.getMapArea(n, -290510451);
        if (null != mapArea) {
            this.setCurrentMapArea(mapArea, -1483320853);
        }
    }
    
    public void jumpToSourceCoordInstant(final int n, final int n2, final int n3, final int n4) {
        try {
            if (this.currentMapArea == null) {
                return;
            }
            final int[] position = this.currentMapArea.position(n, n2, n3, (byte)6);
            if (position != null) {
                if (n4 >= 1119756096) {
                    return;
                }
                this.fs(position[0], position[1], -728678184);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bz(" + ')');
        }
    }
    
    public int zv() {
        return this.centerTileX * -84102297;
    }
    
    public void hv(final int n, final int n2, final Coord coord, final Coord coord2) {
        final ScriptEvent scriptEvent = new ScriptEvent();
        scriptEvent.setArgs(new Object[] { new WorldMapEvent(n2, coord, coord2) }, 472323075);
        switch (n) {
            case 1008: {
                scriptEvent.setType(10, 877177744);
                break;
            }
            case 1012: {
                scriptEvent.setType(14, 366578524);
                break;
            }
            case 1009: {
                scriptEvent.setType(11, 1792342728);
                break;
            }
            case 1011: {
                scriptEvent.setType(13, -1168135465);
                break;
            }
            case 1010: {
                scriptEvent.setType(12, 873828754);
                break;
            }
        }
        HealthBarUpdate.set(scriptEvent, (byte)94);
    }
    
    public void fu() {
        this.cyclesPerFlash = 726470486;
    }
    
    public float getWorldMapZoom() {
        return this.zoom;
    }
    
    public void initializeWorldMap(final WorldMapData worldMapData) {
        this.initializeWorldMapManager((WorldMapArea)worldMapData, 1081617147);
    }
    
    public WorldMapArea ew(final int n) {
        for (final WorldMapArea worldMapArea : this.details.values()) {
            if (WorldMapArea.wo(worldMapArea, -964267539) == n) {
                return worldMapArea;
            }
        }
        return null;
    }
    
    public void ej(final int n) {
        if (n >= 1) {
            this.maxFlashCount = -960896665 * n;
        }
    }
    
    public static void od(final WorldMap worldMap, final int n) {
        if (worldMap == null) {
            worldMap.ft(n);
            return;
        }
        if (n >= 1) {
            worldMap.maxFlashCount = -960896665 * n;
        }
    }
    
    public static Coord getDisplayWith(final WorldMap worldMap, final int i, final Coord coord) {
        if (!worldMap.cacheLoader.isLoaded(804079388)) {
            return null;
        }
        if (!worldMap.worldMapManager.isLoaded(-1415624151)) {
            return null;
        }
        if (!WorldMapArea.nb(worldMap.currentMapArea, coord.x * -96298701, -2105445199 * coord.y, 1845292277)) {
            return null;
        }
        final List<AbstractWorldMapIcon> list = worldMap.worldMapManager.buildIcons((byte)64).get(i);
        if (list == null || list.isEmpty()) {
            return null;
        }
        AbstractWorldMapIcon abstractWorldMapIcon = null;
        int n = -1;
        for (final AbstractWorldMapIcon abstractWorldMapIcon2 : list) {
            final int n2 = -96298701 * abstractWorldMapIcon2.coord2.x - -96298701 * coord.x;
            final int n3 = -2105445199 * abstractWorldMapIcon2.coord2.y - -2105445199 * coord.y;
            final int n4 = n2 * n2 + n3 * n3;
            if (n4 == 0) {
                return abstractWorldMapIcon2.coord2;
            }
            if (n4 >= n && null != abstractWorldMapIcon) {
                continue;
            }
            abstractWorldMapIcon = abstractWorldMapIcon2;
            n = n4;
        }
        return abstractWorldMapIcon.coord2;
    }
    
    public int getDisplayWith(final byte b) {
        try {
            return -1222006759 * this.worldMapDisplayWidth;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bj(" + ')');
        }
    }
    
    void dd(final WorldMapArea worldMapArea) {
        if (null != this.currentMapArea && this.currentMapArea == worldMapArea) {
            return;
        }
        this.initializeWorldMapManager(worldMapArea, 1346326363);
        this.jump(-1, -1, -1, -1605938577);
    }
    
    void dj(final WorldMapArea worldMapArea) {
        if (null != this.currentMapArea && this.currentMapArea == worldMapArea) {
            return;
        }
        this.initializeWorldMapManager(worldMapArea, 1910957520);
        this.jump(-1, -1, -1, -1605938577);
    }
    
    public boolean gz(final int n) {
        try {
            return this.cacheLoader.isLoaded(1399465487);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bi(" + ')');
        }
    }
    
    public Point getWorldMapPosition() {
        final WorldMapManager sm = this.sm();
        return new Point(this.zv() + sm.bj(), this.kd() + sm.tf());
    }
    
    public void setWorldMapPositionTarget(final WorldPoint worldPoint) {
        this.hj(worldPoint.getX(), worldPoint.getY());
    }
    
    public void ff() {
        this.maxFlashCount = 1187290418;
    }
    
    public void go() {
        this.cyclesPerFlash = 1643352688;
    }
    
    public void gr() {
        this.cyclesPerFlash = 726470486;
    }
    
    public static boolean qb(final WorldMap worldMap) {
        return !worldMap.elementsDisabled;
    }
    
    public void fq(final int n) {
        final WorldMapArea mapArea = this.getMapArea(n, -1398575365);
        if (null != mapArea) {
            this.setCurrentMapArea(mapArea, -1483320853);
        }
    }
    
    public static void vp(final WorldMap worldMap, final int n, final int n2, final int n3, final byte b) {
        if (worldMap == null) {
            worldMap.jumpToSourceCoord(n, n, n, b);
            return;
        }
        try {
            if (null != worldMap.currentMapArea) {
                final int[] position = worldMap.currentMapArea.position(n, n2, n3, (byte)6);
                if (position != null) {
                    if (b <= 2) {
                        throw new IllegalStateException();
                    }
                    worldMap.setWorldMapPositionTarget(position[0], position[1], (byte)(-59));
                }
                return;
            }
            if (b <= 2) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bo(" + ')');
        }
    }
    
    public static void zj(final WorldMap worldMap, final int n, final int n2) {
        if (worldMap == null) {
            worldMap.setCurrentMapAreaId(n, n);
        }
        try {
            final WorldMapArea mapArea = worldMap.getMapArea(n, -797849478);
            if (null != mapArea) {
                if (n2 == -518589768) {
                    return;
                }
                worldMap.setCurrentMapArea(mapArea, -1483320853);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ax(" + ')');
        }
    }
    
    public int fz() {
        return 1029371743 * this.worldMapDisplayWidth;
    }
    
    public void gs(final boolean perpetualFlash) {
        this.perpetualFlash = perpetualFlash;
    }
    
    public void cq(final AbstractArchive worldMap_archive, final AbstractArchive worldMap_geographyArchive, final AbstractArchive worldMap_groundArchive, final Font font, final HashMap hashMap, final IndexedSprite[] mapSceneSprites) {
        this.mapSceneSprites = mapSceneSprites;
        this.WorldMap_archive = worldMap_archive;
        this.WorldMap_geographyArchive = worldMap_geographyArchive;
        this.WorldMap_groundArchive = worldMap_groundArchive;
        this.font = font;
        (this.fonts = new HashMap()).put(WorldMapLabelSize.WorldMapLabelSize_small, hashMap.get(WorldMap.fontNameVerdana11));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, hashMap.get(WorldMap.fontNameVerdana13));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, hashMap.get(WorldMap.fontNameVerdana15));
        this.cacheLoader = new WorldMapArchiveLoader(worldMap_archive);
        final int fileFlat = AbstractArchive.getFileFlat(this.WorldMap_archive, WorldMapCacheName.field2435.name, -2014555221);
        final int[] yk = AbstractArchive.yk(this.WorldMap_archive, fileFlat, 1547279193);
        final int initialCapacity = (yk == null) ? 0 : yk.length;
        this.details = new HashMap(initialCapacity);
        for (int i = 0; i < initialCapacity; ++i) {
            final Buffer buffer = new Buffer(this.WorldMap_archive.takeFile(fileFlat, yk[i], (byte)(-78)));
            final WorldMapArea worldMapArea = new WorldMapArea();
            worldMapArea.read(buffer, yk[i], (byte)(-104));
            this.details.put(worldMapArea.getInternalName(-1599876261), worldMapArea);
            if (WorldMapArea.getId(worldMapArea, -926489840)) {
                this.mainMapArea = worldMapArea;
            }
        }
        this.setCurrentMapArea(this.mainMapArea, -1483320853);
        this.field3931 = null;
    }
    
    public Coord fb() {
        if (this.currentMapArea == null) {
            return null;
        }
        return this.currentMapArea.coord(this.getDisplayX(-1607729252), this.getDisplayY((byte)0), 1520880723);
    }
    
    public int getDisplayX(final int n) {
        try {
            if (null != this.currentMapArea) {
                return -84102297 * this.centerTileX + this.currentMapArea.getRegionLowX(16748608) * 64;
            }
            if (n >= -576886093) {
                throw new IllegalStateException();
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bm(" + ')');
        }
    }
    
    public void setWorldMapPositionTarget(final int n, final int n2, final byte b) {
        try {
            if (null != this.currentMapArea) {
                if (b >= 8) {
                    throw new IllegalStateException();
                }
                if (WorldMapArea.nb(this.currentMapArea, n, n2, 1764440845)) {
                    this.worldMapTargetX = (n - this.currentMapArea.getRegionLowX(16748608) * 64) * 2080912417;
                    this.worldMapTargetY = (n2 - this.currentMapArea.getRegionLowY(787514421) * 64) * 667691095;
                    return;
                }
                if (b >= 8) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bk(" + ')');
        }
    }
    
    public WorldMapArea dq() {
        return this.currentMapArea;
    }
    
    public void eo(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int[] array = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(array);
        Rasterizer2D.Rasterizer2D_setClip(n, n2, n + n3, n2 + n4);
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, -16777216);
        final int ud = WorldMapArchiveLoader.ud(this.cacheLoader, (byte)75);
        if (ud < 100) {
            lt(this, n, n2, n3, n4, ud, 1026615695);
            return;
        }
        if (!this.worldMapManager.isLoaded(-2025207717)) {
            this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(1096556161), Client.isMembersWorld, (short)(-14273));
            if (!this.worldMapManager.isLoaded(-1406850364)) {
                return;
            }
        }
        if (this.flashingElements != null) {
            this.flashCycle += 1698997397;
            if (this.flashCycle * 1104873149 % (this.cyclesPerFlash * 1369293643) == 0) {
                this.flashCycle = 0;
                this.flashCount -= 297924373;
            }
            if (this.flashCount * 676356035 >= -1444238761 * this.maxFlashCount && !this.perpetualFlash) {
                this.flashingElements = null;
            }
        }
        final int n6 = (int)Math.ceil(n3 / this.zoom);
        final int n7 = (int)Math.ceil(n4 / this.zoom);
        this.worldMapManager.drawTiles(-84102297 * this.centerTileX - n6 / 2, -632186207 * this.centerTileY - n7 / 2, this.centerTileX * -84102297 + n6 / 2, n7 / 2 + this.centerTileY * -632186207, n, n2, n + n3, n4 + n2, -1179572642);
        if (!this.elementsDisabled) {
            boolean b = false;
            if (n5 - 460446351 * this.field3946 > 100) {
                this.field3946 = n5 * -2042100625;
                b = true;
            }
            this.worldMapManager.drawElements(this.centerTileX * -84102297 - n6 / 2, -632186207 * this.centerTileY - n7 / 2, -84102297 * this.centerTileX + n6 / 2, -632186207 * this.centerTileY + n7 / 2, n, n2, n + n3, n2 + n4, this.field3944, this.flashingElements, this.flashCycle * 1104873149, this.cyclesPerFlash * 1369293643, b, -1456202113);
        }
        ko(this, n, n2, n3, n4, n6, n7, 1052800047);
        if (324465533 * Client.staffModLevel >= 2 && this.showCoord && this.mouseCoord != null) {
            class492.xb(this.font, "Coord: " + this.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, 16776960, -1);
        }
        this.worldMapDisplayWidth = n6 * -410569687;
        this.worldMapDisplayHeight = n7 * 224660999;
        this.worldMapDisplayX = -468823633 * n;
        this.worldMapDisplayY = n2 * -821936197;
        Rasterizer2D.Rasterizer2D_setClipArray(array);
    }
    
    public void fj() {
        this.maxFlashCount = 1412277301;
    }
    
    public int eb() {
        if (1.0 == this.zoomTarget) {
            return 25;
        }
        if (1.5 == this.zoomTarget) {
            return 37;
        }
        if (2.0 == this.zoomTarget) {
            return 50;
        }
        if (this.zoomTarget == 3.0) {
            return 75;
        }
        if (this.zoomTarget == 4.0) {
            return 100;
        }
        return 200;
    }
    
    public AbstractWorldMapIcon ho() {
        if (this.iconIterator == null) {
            return null;
        }
        while (this.iconIterator.hasNext()) {
            final AbstractWorldMapIcon abstractWorldMapIcon = this.iconIterator.next();
            if (abstractWorldMapIcon.getElement(-1655908686) != -1) {
                return abstractWorldMapIcon;
            }
        }
        return null;
    }
    
    public int jy() {
        return this.worldMapTargetX * 506744801;
    }
    
    void setCurrentMapArea(final WorldMapArea worldMapArea, final int n) {
        try {
            if (null != this.currentMapArea) {
                if (n != -1483320853) {
                    throw new IllegalStateException();
                }
                if (this.currentMapArea == worldMapArea) {
                    if (n != -1483320853) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            this.initializeWorldMapManager(worldMapArea, 1081617147);
            this.jump(-1, -1, -1, -1605938577);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.ah(" + ')');
        }
    }
    
    public static Coord zm(final WorldMap worldMap, final int i, final Coord coord) {
        if (!worldMap.cacheLoader.isLoaded(-1702789221)) {
            return null;
        }
        if (!worldMap.worldMapManager.isLoaded(-961870225)) {
            return null;
        }
        if (!WorldMapArea.nb(worldMap.currentMapArea, coord.x * -489974380, -2105445199 * coord.y, 1743082541)) {
            return null;
        }
        final List<AbstractWorldMapIcon> list = worldMap.worldMapManager.buildIcons((byte)48).get(i);
        if (list != null && !list.isEmpty()) {
            AbstractWorldMapIcon abstractWorldMapIcon = null;
            int n = -1;
            for (final AbstractWorldMapIcon abstractWorldMapIcon2 : list) {
                final int n2 = 1246852923 * abstractWorldMapIcon2.coord2.x - -96298701 * coord.x;
                final int n3 = -2105445199 * abstractWorldMapIcon2.coord2.y - 1839674485 * coord.y;
                final int n4 = n2 * n2 + n3 * n3;
                if (n4 == 0) {
                    return abstractWorldMapIcon2.coord2;
                }
                if (n4 >= n && null != abstractWorldMapIcon) {
                    continue;
                }
                abstractWorldMapIcon = abstractWorldMapIcon2;
                n = n4;
            }
            return abstractWorldMapIcon.coord2;
        }
        return null;
    }
    
    void ef(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (class132.field1277 != null) {
            final int n7 = -678181206 / (-1683757762 * this.worldMapManager.pixelsPerTile);
            final int n8 = 512 + n3;
            final int n9 = n4 + 512;
            final float n10 = 1.0f;
            final int n11 = (int)(n8 / n10);
            final int n12 = (int)(n9 / n10);
            final int n13 = this.getDisplayX(-1198510009) - n5 / 2 - n7;
            final int n14 = this.getDisplayY((byte)0) - n6 / 2 - n7;
            int n15 = n - this.worldMapManager.pixelsPerTile * -1013171018 * (n7 + n13 - this.field3939 * -460898343);
            int n16 = n2 - (n7 - (n14 - this.centerTileX * 627335149)) * (-291103341 * this.worldMapManager.pixelsPerTile);
            if (this.method2366(n11, n12, n15, n16, n3, n4, 25950892)) {
                if (this.sprite != null && this.sprite.width == n11 && n12 == this.sprite.height) {
                    Arrays.fill(this.sprite.pixels, 0);
                }
                else {
                    this.sprite = new SpritePixels(n11, n12);
                }
                this.centerTileX = (this.getDisplayHeight(-1018350009) - n5 / 2 - n7) * -55075052;
                this.worldMapTargetX = (this.getDisplayWith((byte)0) - n6 / 2 - n7) * 1178523109;
                this.minCachedTileY = this.worldMapManager.pixelsPerTile * 219395697;
                class132.field1277.method1938(this.centerTileX * 334129421, 627335149 * this.minCachedTileY, this.sprite, 1540315502 * this.field3933 / n10, 2709359);
                this.worldMapTargetX = Client.ic * 1636039151;
                n15 = n - this.worldMapManager.pixelsPerTile * 631525003 * (n7 + n13 - this.field3939 * -17556661);
                n16 = n2 - (n7 - (n14 - 627335149 * this.centerTileX)) * (this.worldMapManager.pixelsPerTile * -112773775);
            }
            Rasterizer2D.gg(n, n2, n3, n4, 0, 847653599);
            if (1.0f == n10) {
                this.sprite.method2631(n15, n16, -890666271);
            }
            else {
                this.sprite.drawTransScaledAt(n15, n16, (int)(n11 * n10), (int)(n10 * n12), 564798997);
            }
        }
    }
    
    public void ef(final int n, final int n2, final boolean b) {
        this.setWorldMapPosition(n, n2, b, (short)254);
    }
    
    public void gj(final boolean perpetualFlash) {
        this.perpetualFlash = perpetualFlash;
    }
    
    public static boolean jr(final WorldMap worldMap) {
        if (worldMap == null) {
            return worldMap.dl();
        }
        return -1 != -601848329 * worldMap.worldMapTargetX && worldMap.worldMapTargetY * 1744520039 != -1;
    }
    
    public static WorldMapArea yu(final WorldMap worldMap, final int n, final int n2, final int n3) {
        for (final WorldMapArea worldMapArea : worldMap.details.values()) {
            if (worldMapArea.containsCoord(n, n2, n3, -394156959)) {
                return worldMapArea;
            }
        }
        return null;
    }
    
    public static Coord tu(final WorldMap worldMap, final int i, final Coord coord) {
        if (!worldMap.cacheLoader.isLoaded(1514629882)) {
            return null;
        }
        if (!worldMap.worldMapManager.isLoaded(-1768695183)) {
            return null;
        }
        if (!WorldMapArea.nb(worldMap.currentMapArea, coord.x * -96298701, -2105445199 * coord.y, 1549353516)) {
            return null;
        }
        final List<AbstractWorldMapIcon> list = worldMap.worldMapManager.buildIcons((byte)17).get(i);
        if (list == null || list.isEmpty()) {
            return null;
        }
        AbstractWorldMapIcon abstractWorldMapIcon = null;
        int n = -1;
        for (final AbstractWorldMapIcon abstractWorldMapIcon2 : list) {
            final int n2 = -96298701 * abstractWorldMapIcon2.coord2.x - -96298701 * coord.x;
            final int n3 = -2105445199 * abstractWorldMapIcon2.coord2.y - -2105445199 * coord.y;
            final int n4 = n2 * n2 + n3 * n3;
            if (n4 == 0) {
                return abstractWorldMapIcon2.coord2;
            }
            if (n4 >= n && null != abstractWorldMapIcon) {
                continue;
            }
            abstractWorldMapIcon = abstractWorldMapIcon2;
            n = n4;
        }
        return abstractWorldMapIcon.coord2;
    }
    
    public static void uy(final WorldMap worldMap, final int n, final int n2, final int n3, final boolean b) {
        if (worldMap == null) {
            worldMap.fk(n);
        }
        WorldMapArea field3931 = worldMap.mapAreaAtCoord(n, n2, n3, (byte)2);
        if (field3931 == null) {
            if (!b) {
                return;
            }
            field3931 = worldMap.mainMapArea;
        }
        boolean b2 = false;
        if (worldMap.field3931 != field3931 || b) {
            worldMap.setCurrentMapArea(worldMap.field3931 = field3931, -1483320853);
            b2 = true;
        }
        if (b2 || b) {
            worldMap.jump(n, n2, n3, -1605938577);
        }
    }
    
    public static void uh(final WorldMap worldMap, final AbstractArchive worldMap_archive, final AbstractArchive worldMap_geographyArchive, final AbstractArchive worldMap_groundArchive, final Font font, final HashMap hashMap, final IndexedSprite[] mapSceneSprites, final int n) {
        if (worldMap == null) {
            worldMap.init(worldMap_archive, worldMap_archive, worldMap_archive, font, hashMap, mapSceneSprites, n);
            return;
        }
        try {
            worldMap.mapSceneSprites = mapSceneSprites;
            worldMap.WorldMap_archive = worldMap_archive;
            worldMap.WorldMap_geographyArchive = worldMap_geographyArchive;
            worldMap.WorldMap_groundArchive = worldMap_groundArchive;
            worldMap.font = font;
            (worldMap.fonts = new HashMap()).put(WorldMapLabelSize.WorldMapLabelSize_small, hashMap.get(WorldMap.fontNameVerdana11));
            worldMap.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, hashMap.get(WorldMap.fontNameVerdana13));
            worldMap.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, hashMap.get(WorldMap.fontNameVerdana15));
            worldMap.cacheLoader = new WorldMapArchiveLoader(worldMap_archive);
            final int fileFlat = AbstractArchive.getFileFlat(worldMap.WorldMap_archive, WorldMapCacheName.field2435.name, -44197407);
            final int[] yk = AbstractArchive.yk(worldMap.WorldMap_archive, fileFlat, 428898733);
            int length;
            if (yk == null) {
                if (n == -84102297) {
                    throw new IllegalStateException();
                }
                length = 0;
            }
            else {
                length = yk.length;
            }
            final int initialCapacity = length;
            worldMap.details = new HashMap(initialCapacity);
            for (int i = 0; i < initialCapacity; ++i) {
                final Buffer buffer = new Buffer(worldMap.WorldMap_archive.takeFile(fileFlat, yk[i], (byte)(-120)));
                final WorldMapArea worldMapArea = new WorldMapArea();
                worldMapArea.read(buffer, yk[i], (byte)(-126));
                worldMap.details.put(worldMapArea.getInternalName(1181486070), worldMapArea);
                if (WorldMapArea.getId(worldMapArea, -926489840)) {
                    if (n == -84102297) {
                        throw new IllegalStateException();
                    }
                    worldMap.mainMapArea = worldMapArea;
                }
            }
            worldMap.setCurrentMapArea(worldMap.mainMapArea, -1483320853);
            worldMap.field3931 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.af(" + ')');
        }
    }
    
    public static WorldMapArea ux(final WorldMap worldMap, final int n) {
        if (worldMap == null) {
            worldMap.setWorldMapPositionTargetInstant(n, n, n);
        }
        for (final WorldMapArea worldMapArea : worldMap.details.values()) {
            if (WorldMapArea.wo(worldMapArea, -964267539) == n) {
                return worldMapArea;
            }
        }
        return null;
    }
    
    public void hj(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (!this.cacheLoader.isLoaded(-861487943)) {
            return;
        }
        final int n7 = (int)Math.ceil(n3 / this.zoom);
        final int n8 = (int)Math.ceil(n4 / this.zoom);
        final List method1478 = this.worldMapManager.method1478(this.centerTileX * -1441658470 - n7 / 2 - 1, -632186207 * this.centerTileY - n8 / 2 - 1, n7 / 2 + this.centerTileX * 549119423 + 1, 1 + (n8 / 2 + this.centerTileY * -632186207), n, n2, n3, n4, n5, n6, -1292145755);
        if (method1478.isEmpty()) {
            return;
        }
        for (final AbstractWorldMapIcon abstractWorldMapIcon : method1478) {
            final WorldMapElement method1479 = class354.method1935(abstractWorldMapIcon.getElement(-1871345500), 1900716447);
            boolean b = false;
            for (int i = this.menuOpcodes.length - 1; i >= 0; --i) {
                if (null != method1479.menuActions[i]) {
                    MenuAction.insertMenuItemNoShift(method1479.menuActions[i], method1479.menuTargetName, this.menuOpcodes[i], abstractWorldMapIcon.getElement(-1599503796), abstractWorldMapIcon.coord1.packed(-964267539), abstractWorldMapIcon.coord2.packed(-964267539), (byte)90);
                    b = true;
                }
            }
            if (b) {
                return;
            }
        }
    }
    
    public void hj(final int n, final int n2) {
        this.setWorldMapPositionTarget(n, n2, (byte)(-80));
    }
    
    public void ey(final int n, final int n2) {
        if (null == this.currentMapArea) {
            return;
        }
        this.setWorldMapPosition(n - this.currentMapArea.getRegionLowX(16748608) * 64, n2 - this.currentMapArea.getRegionLowY(-1080333750) * 1217281780, true, (short)254);
        this.worldMapTargetX = -372983540;
        this.worldMapTargetY = 1032529055;
    }
    
    public static void na(final WorldMap worldMap, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (worldMap == null) {
            worldMap.fo();
        }
        final int[] array = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(array);
        Rasterizer2D.Rasterizer2D_setClip(n, n2, n + n3, n2 + n4);
        Rasterizer2D.Rasterizer2D_fillRectangle(n, n2, n3, n4, -16777216);
        final int ud = WorldMapArchiveLoader.ud(worldMap.cacheLoader, (byte)75);
        if (ud < 100) {
            lt(worldMap, n, n2, n3, n4, ud, 1728998768);
            return;
        }
        if (!worldMap.worldMapManager.isLoaded(-882999870)) {
            worldMap.worldMapManager.load(worldMap.WorldMap_archive, worldMap.currentMapArea.getInternalName(622430192), Client.isMembersWorld, (short)(-7944));
            if (!worldMap.worldMapManager.isLoaded(-1022159283)) {
                return;
            }
        }
        if (worldMap.flashingElements != null) {
            worldMap.flashCycle += 1698997397;
            if (worldMap.flashCycle * 1104873149 % (worldMap.cyclesPerFlash * 1369293643) == 0) {
                worldMap.flashCycle = 0;
                worldMap.flashCount -= 297924373;
            }
            if (worldMap.flashCount * 676356035 >= -1444238761 * worldMap.maxFlashCount && !worldMap.perpetualFlash) {
                worldMap.flashingElements = null;
            }
        }
        final int n6 = (int)Math.ceil(n3 / worldMap.zoom);
        final int n7 = (int)Math.ceil(n4 / worldMap.zoom);
        worldMap.worldMapManager.drawTiles(-84102297 * worldMap.centerTileX - n6 / 2, -632186207 * worldMap.centerTileY - n7 / 2, worldMap.centerTileX * -84102297 + n6 / 2, n7 / 2 + worldMap.centerTileY * -632186207, n, n2, n + n3, n4 + n2, 447313355);
        if (!worldMap.elementsDisabled) {
            boolean b = false;
            if (n5 - 460446351 * worldMap.field3946 > 100) {
                worldMap.field3946 = n5 * -2042100625;
                b = true;
            }
            worldMap.worldMapManager.drawElements(worldMap.centerTileX * -84102297 - n6 / 2, -632186207 * worldMap.centerTileY - n7 / 2, -84102297 * worldMap.centerTileX + n6 / 2, -632186207 * worldMap.centerTileY + n7 / 2, n, n2, n + n3, n2 + n4, worldMap.field3944, worldMap.flashingElements, worldMap.flashCycle * 1104873149, worldMap.cyclesPerFlash * 1369293643, b, 1337992230);
        }
        ko(worldMap, n, n2, n3, n4, n6, n7, 1052800047);
        if (324465533 * Client.staffModLevel >= 2 && worldMap.showCoord && worldMap.mouseCoord != null) {
            class492.xb(worldMap.font, "Coord: " + worldMap.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, 16776960, -1);
        }
        worldMap.worldMapDisplayWidth = n6 * -410569687;
        worldMap.worldMapDisplayHeight = n7 * 224660999;
        worldMap.worldMapDisplayX = -468823633 * n;
        worldMap.worldMapDisplayY = n2 * -821936197;
        Rasterizer2D.Rasterizer2D_setClipArray(array);
    }
    
    public void setPerpetualFlash(final boolean perpetualFlash, final int n) {
        try {
            this.perpetualFlash = perpetualFlash;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rb.bf(" + ')');
        }
    }
    
    public void resetCyclesPerFlash(final int n) {
        if (n >= 1) {
            this.cyclesPerFlash = 787623523 * n;
        }
    }
    
    public WorldMapArea du() {
        return this.currentMapArea;
    }
}
