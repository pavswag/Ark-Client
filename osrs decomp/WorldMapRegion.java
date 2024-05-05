import java.util.Collections;
import java.util.Collection;
import java.util.Map;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapRegion implements net.runelite.api.worldmap.WorldMapRegion
{
    int pixelsPerTile;
    static final int an = -3407872;
    static final int aw = 37748736;
    final HashMap fonts;
    public static DemotingHashTable WorldMapRegion_cachedSprites;
    int regionX;
    int regionY;
    WorldMapData_0 worldMapData_0;
    LinkedList worldMapData1List;
    int backgroundColor;
    static final int af = -3355444;
    static final int ac = 256;
    HashMap iconMap;
    List icon0List;
    
    WorldMapRegion(final int n, final int n2, final int n3, final HashMap fonts) {
        this.regionX = n * 970404445;
        this.regionY = n2 * 125165747;
        this.worldMapData1List = new LinkedList();
        this.icon0List = new LinkedList();
        this.iconMap = new HashMap();
        this.backgroundColor = (n3 | 0xFF000000) * 241012907;
        this.fonts = fonts;
    }
    
    static {
        WorldMapRegion.WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
    }
    
    void cs() {
        for (final AbstractWorldMapIcon abstractWorldMapIcon : this.iconMap.values()) {
            if (abstractWorldMapIcon instanceof WorldMapIcon_1) {
                WorldMapIcon_1.nx((WorldMapIcon_1)abstractWorldMapIcon, 1844375559);
            }
        }
    }
    
    void dp(final WorldMapElement worldMapElement, final int n, final int n2) {
        final SpritePixels spriteBool = worldMapElement.getSpriteBool(false, -16711936);
        if (spriteBool != null) {
            spriteBool.drawAt(wt(this, spriteBool, worldMapElement.horizontalAlignment, (byte)(-33)) + n, this.method1449(spriteBool, worldMapElement.verticalAlignment, -1742435239) + n2);
        }
    }
    
    static SpritePixels bs(final int n, final int n2, final int n3) {
        return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(BuddyRankComparator.compareBuddy(n, n2, n3, -699245380));
    }
    
    void ca() {
        if (this.worldMapData_0 != null) {
            this.worldMapData_0.by(-646969508);
        }
        else {
            final Iterator iterator = this.worldMapData1List.iterator();
            while (iterator.hasNext()) {
                iterator.next().by(-1110271063);
            }
        }
    }
    
    void drawNonLinkMapIcons(final int n, final int n2, final HashSet set, final int n3, final int n4) {
        try {
            final float n5 = n3 / 64.0f;
            final float n6 = n5 / 2.0f;
            final Iterator<Map.Entry<Coord, V>> iterator = this.iconMap.entrySet().iterator();
            while (iterator.hasNext()) {
                if (n4 != -1769642683) {
                    return;
                }
                final Map.Entry<Coord, V> entry = iterator.next();
                final Coord coord = entry.getKey();
                final int n7 = (int)(n + coord.x * -96298701 * n5 - n6);
                final int n8 = (int)(n2 + n3 - -2105445199 * coord.y * n5 - n6);
                final AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)entry.getValue();
                if (null == abstractWorldMapIcon || !abstractWorldMapIcon.hasValidElement(970262038)) {
                    continue;
                }
                if (n4 != -1769642683) {
                    throw new IllegalStateException();
                }
                abstractWorldMapIcon.screenX = -1370053935 * n7;
                abstractWorldMapIcon.screenY = 1379111171 * n8;
                if (set.contains(class354.method1935(abstractWorldMapIcon.getElement(-293939764), 2122412967).getObjectId(557788055))) {
                    continue;
                }
                to(this, abstractWorldMapIcon, n7, n8, n5, (byte)62);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ad(" + ')');
        }
    }
    
    void cd(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final IndexedSprite[] array) {
        for (int i = 0; i < 1884441404 * abstractWorldMapData.planes; ++i) {
            final WorldMapDecoration[] array2 = abstractWorldMapData.decorations[i][n][n2];
            if (null != array2) {
                if (array2.length != 0) {
                    final WorldMapDecoration[] array3 = array2;
                    for (int j = 0; j < array3.length; ++j) {
                        final WorldMapDecoration worldMapDecoration = array3[j];
                        if (ItemLayer.method1182(worldMapDecoration.decoration * 603915833, -2137147313) || 2021339175 * WorldMapDecorationType.field3066.id == worldMapDecoration.decoration * 1504481025) {
                            final ObjectComposition vmethod3248 = class144.vmethod3248(2080162465 * worldMapDecoration.objectDefinitionId, (short)5729);
                            if (-1 != 1602881847 * vmethod3248.mapSceneId) {
                                if (771086195 * vmethod3248.mapSceneId == 46 || vmethod3248.mapSceneId * 2073613165 == 1839062802) {
                                    array[vmethod3248.mapSceneId * 771086195].method2596(n * (-1897887643 * this.pixelsPerTile), -1897887643 * this.pixelsPerTile * (63 - n2), -965237675 * this.pixelsPerTile + 1, 678401920 * this.pixelsPerTile + 1);
                                }
                                else {
                                    array[771086195 * vmethod3248.mapSceneId].method2596(n * (-1897887643 * this.pixelsPerTile), this.pixelsPerTile * -1897887643 * (-550236294 - n2), -844069788 * this.pixelsPerTile, 499192010 * this.pixelsPerTile);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    void ba(final WorldMapData_0 worldMapData_0, final List list) {
        this.iconMap.clear();
        this.worldMapData_0 = worldMapData_0;
        method1434(this, list, (short)13903);
    }
    
    public static void method1434(final WorldMapRegion worldMapRegion, final List list, final short n) {
        if (worldMapRegion == null) {
            worldMapRegion.addAllToIconList(list, n);
            return;
        }
        try {
            final Iterator<WorldMapIcon_0> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (n <= 255) {
                    throw new IllegalStateException();
                }
                final WorldMapIcon_0 worldMapIcon_0 = iterator.next();
                if (!class354.method1935(1767565411 * worldMapIcon_0.subHeight, 1893418018).field1489) {
                    continue;
                }
                if (worldMapIcon_0.aq.x * -96298701 >> 6 != worldMapRegion.regionX * -2122501643) {
                    continue;
                }
                if (n <= 255) {
                    throw new IllegalStateException();
                }
                if (worldMapRegion.regionY * 1858063995 != -2105445199 * worldMapIcon_0.aq.y >> 6) {
                    continue;
                }
                if (n <= 255) {
                    return;
                }
                worldMapRegion.icon0List.add(new WorldMapIcon_0(worldMapIcon_0.aq, worldMapIcon_0.aq, worldMapIcon_0.subHeight * 1767565411, worldMapRegion.method1457(worldMapIcon_0.subHeight * 1767565411, -1151256626)));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.aa(" + ')');
        }
    }
    
    void method1434(final HashSet set, final int n, final int n2, final short n3) {
        try {
            final Iterator<AbstractWorldMapIcon> iterator = this.icon0List.iterator();
            while (iterator.hasNext()) {
                if (n3 <= 128) {
                    throw new IllegalStateException();
                }
                final AbstractWorldMapIcon abstractWorldMapIcon = iterator.next();
                if (!abstractWorldMapIcon.hasValidElement(684549380)) {
                    continue;
                }
                final WorldMapElement method1935 = class354.method1935(abstractWorldMapIcon.getElement(-402130740), 2080610855);
                if (method1935 == null) {
                    continue;
                }
                if (n3 <= 128) {
                    throw new IllegalStateException();
                }
                if (!set.contains(method1935.getObjectId(-1521601261))) {
                    continue;
                }
                if (n3 <= 128) {
                    throw new IllegalStateException();
                }
                this.drawBackgroundCircle(method1935, -216598991 * abstractWorldMapIcon.screenX, abstractWorldMapIcon.screenY * -1288412757, n, n2, -697064067);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ae(" + ')');
        }
    }
    
    void ce(final ObjectComposition objectComposition, final int n, final int n2, final int n3, final AbstractWorldMapData abstractWorldMapData) {
        final Coord coord = new Coord(n, this.regionX * 1598848320 + n2, -1342988608 * this.regionY + n3);
        Coord coord2;
        if (null != this.worldMapData_0) {
            coord2 = new Coord(this.worldMapData_0.at * 1615088237 + n, n2 + this.worldMapData_0.au * 518961216, 763222976 * this.worldMapData_0.ab + n3);
        }
        else {
            final WorldMapData_1 worldMapData_1 = (WorldMapData_1)abstractWorldMapData;
            coord2 = new Coord(n + worldMapData_1.at * 1615088237, n2 + 518961216 * worldMapData_1.au + WorldMapData_1.mv(worldMapData_1, -1181735717) * 8, worldMapData_1.ab * 763222976 + n3 + WorldMapData_1.ib(worldMapData_1, 1826768350) * 8);
        }
        AbstractWorldMapIcon value;
        if (objectComposition.soundEffectIds != null) {
            value = new WorldMapIcon_1(coord2, coord, -1529817365 * objectComposition.id, this);
        }
        else {
            final WorldMapElement method1935 = class354.method1935(1270945427 * objectComposition.mapIconId, 1944996464);
            value = new WorldMapIcon_0(coord2, coord, method1935.objectId * 219774827, this.createMapLabel(method1935, -916826041));
        }
        if (class354.method1935(value.getElement(-966641663), 2112927218).field1489) {
            this.iconMap.put(new Coord(0, n2, n3), value);
        }
    }
    
    void method1463(final WorldMapElement worldMapElement, final int n, final int n2, final byte b) {
        try {
            final SpritePixels spriteBool = worldMapElement.getSpriteBool(false, -16711936);
            if (spriteBool != null) {
                if (b != 0) {
                    return;
                }
                spriteBool.drawAt(wt(this, spriteBool, worldMapElement.horizontalAlignment, (byte)30) + n, this.method1449(spriteBool, worldMapElement.verticalAlignment, -1956047929) + n2);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bb(" + ')');
        }
    }
    
    void cb(final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final WorldMapSprite worldMapSprite) {
        for (final WorldMapData_1 worldMapData_1 : this.worldMapData1List) {
            for (int i = worldMapData_1.getChunkX((byte)57) * 8; i < worldMapData_1.getChunkX((byte)57) * 8 + 8; ++i) {
                for (int j = worldMapData_1.getChunkY((short)(-26328)) * 8; j < worldMapData_1.getChunkY((short)(-23579)) * 8 + 8; ++j) {
                    dn(this, i, j, worldMapData_1, worldMapScaleHandler, worldMapSprite, -2070388761);
                    this.method1467(i, j, worldMapData_1, worldMapScaleHandler, -1573199799);
                }
            }
        }
        for (final WorldMapData_1 worldMapData_2 : this.worldMapData1List) {
            for (int k = worldMapData_2.getChunkX((byte)57) * 8; k < worldMapData_2.getChunkX((byte)57) * 8 + 8; ++k) {
                for (int l = worldMapData_2.getChunkY((short)(-30321)) * 8; l < worldMapData_2.getChunkY((short)(-12712)) * 8 + 8; ++l) {
                    ud(this, k, l, worldMapData_2, worldMapScaleHandler, array, -562011417);
                }
            }
        }
    }
    
    List da(final int n, final int n2, final int n3, final int n4, final int n5) {
        final LinkedList<AbstractWorldMapIcon> list = new LinkedList<AbstractWorldMapIcon>();
        if (n4 < n || n5 < n2) {
            return list;
        }
        if (n4 >= n + n3 || n5 >= n3 + n2) {
            return list;
        }
        for (final AbstractWorldMapIcon e : this.iconMap.values()) {
            if (e.hasValidElement(-1059795441) && e.fitsScreen(n4, n5, (byte)(-22))) {
                list.add(e);
            }
        }
        for (final AbstractWorldMapIcon e2 : this.icon0List) {
            if (e2.hasValidElement(-1303626476) && e2.fitsScreen(n4, n5, (byte)(-44))) {
                list.add(e2);
            }
        }
        return list;
    }
    
    public static void to(final WorldMapRegion worldMapRegion, final AbstractWorldMapIcon abstractWorldMapIcon, final int n, final int n2, final float n3, final byte b) {
        if (worldMapRegion == null) {
            worldMapRegion.method1454(abstractWorldMapIcon, n, n, n3, b);
        }
        try {
            final WorldMapElement method1935 = class354.method1935(abstractWorldMapIcon.getElement(-1416808168), 1865972483);
            worldMapRegion.method1463(method1935, n, n2, (byte)0);
            worldMapRegion.method1456(abstractWorldMapIcon, method1935, n, n2, n3, (byte)8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.by(" + ')');
        }
    }
    
    void ch(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler) {
        for (int i = 1; i < abstractWorldMapData.planes * 1632558421; ++i) {
            final int n3 = abstractWorldMapData.floorOverlayIds[i][n][n2] - 1;
            if (n3 > -1) {
                final int n4 = 973203971 * this.backgroundColor;
                final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n3);
                FloorOverlayDefinition floorOverlayDefinition2;
                if (floorOverlayDefinition != null) {
                    floorOverlayDefinition2 = floorOverlayDefinition;
                }
                else {
                    final byte[] takeFile = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n3, (byte)(-8));
                    final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                    if (null != takeFile) {
                        floorOverlayDefinition3.decode(new Buffer(takeFile), n3, (short)128);
                    }
                    floorOverlayDefinition3.postDecode(1392882907);
                    FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n3);
                    floorOverlayDefinition2 = floorOverlayDefinition3;
                }
                final FloorOverlayDefinition floorOverlayDefinition4 = floorOverlayDefinition2;
                int n5;
                if (floorOverlayDefinition4 == null) {
                    n5 = n4;
                }
                else if (floorOverlayDefinition4.secondaryRgb * -2085280195 >= 0) {
                    final int n6 = floorOverlayDefinition4.secondaryHue * -187777599;
                    int n7 = floorOverlayDefinition4.secondarySaturation * -1984356417;
                    final int n8 = 278128979 * floorOverlayDefinition4.secondaryLightness;
                    if (n8 > 179) {
                        n7 /= 2;
                    }
                    if (n8 > -478327547) {
                        n7 /= 2;
                    }
                    if (n8 > -1582615227) {
                        n7 /= 2;
                    }
                    if (n8 > -1869358065) {
                        n7 /= 2;
                    }
                    n5 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(n8 / 2 + ((n6 / 4 << 10) + (n7 / 1175395816 << 7)), 96, 1762756863)] | 0x4EE8EA30);
                }
                else if (floorOverlayDefinition4.texture * -202963991 >= 0) {
                    n5 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(floorOverlayDefinition4.texture * -202963991, -1337450456), -562241238, 521796189)] | 0x283A08ED);
                }
                else if (1889574527 * floorOverlayDefinition4.primaryRgb == 16711935) {
                    n5 = n4;
                }
                else {
                    final int n9 = floorOverlayDefinition4.hue * -732416410;
                    int n10 = -364721316 * floorOverlayDefinition4.saturation;
                    final int n11 = floorOverlayDefinition4.lightness * -1584398624;
                    if (n11 > 179) {
                        n10 /= 2;
                    }
                    if (n11 > -1884799933) {
                        n10 /= 2;
                    }
                    if (n11 > -231233193) {
                        n10 /= 2;
                    }
                    if (n11 > 280816061) {
                        n10 /= 2;
                    }
                    n5 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(n11 / 2 + ((n9 / 4 << 10) + (n10 / 32 << 7)), 2051605212, 565047320)] | 0xB526745C);
                }
                final int n12 = n5;
                if (abstractWorldMapData.field2390[i][n][n2] == 0) {
                    Rasterizer2D.Rasterizer2D_fillRectangle(n * (-1897887643 * this.pixelsPerTile), (63 - n2) * (-1687800936 * this.pixelsPerTile), this.pixelsPerTile * -1768454103, 979098588 * this.pixelsPerTile, n12);
                }
                else {
                    WorldMapScaleHandler.ru(worldMapScaleHandler, n * (-1897887643 * this.pixelsPerTile), (63 - n2) * (this.pixelsPerTile * -1897887643), 0, n12, this.pixelsPerTile * -1897887643, this.pixelsPerTile * -1897887643, abstractWorldMapData.field2390[i][n][n2], abstractWorldMapData.field2396[i][n][n2], 1321618637);
                }
            }
        }
    }
    
    void cl(final HashSet set, final int n, final int n2) {
        for (final AbstractWorldMapIcon abstractWorldMapIcon : this.iconMap.values()) {
            if (!abstractWorldMapIcon.hasValidElement(1102865194)) {
                continue;
            }
            final int element = abstractWorldMapIcon.getElement(-1300654833);
            if (!set.contains(element)) {
                continue;
            }
            this.drawBackgroundCircle(class354.method1935(element, 2014329195), abstractWorldMapIcon.screenX * -216598991, abstractWorldMapIcon.screenY * 1850140489, n, n2, -784552649);
        }
        this.method1434(set, n, n2, (short)29091);
    }
    
    void cn(final List list) {
        for (final WorldMapIcon_0 worldMapIcon_0 : list) {
            if (!class354.method1935(994924002 * worldMapIcon_0.subHeight, 2101958222).field1489) {
                continue;
            }
            if (worldMapIcon_0.aq.x * -96298701 >> 6 != this.regionX * -1238818621 || this.regionY * 1346869867 != 678095160 * worldMapIcon_0.aq.y >> 6) {
                continue;
            }
            this.icon0List.add(new WorldMapIcon_0(worldMapIcon_0.aq, worldMapIcon_0.aq, worldMapIcon_0.subHeight * 1767565411, this.method1457(worldMapIcon_0.subHeight * 963207918, 1483333439)));
        }
    }
    
    void db(final WorldMapElement worldMapElement, final int n, final int n2) {
        final SpritePixels spriteBool = worldMapElement.getSpriteBool(false, -16711936);
        if (spriteBool != null) {
            spriteBool.drawAt(wt(this, spriteBool, worldMapElement.horizontalAlignment, (byte)83) + n, this.method1449(spriteBool, worldMapElement.verticalAlignment, -1821630962) + n2);
        }
    }
    
    void cf(final HashSet set, final int n, final int n2) {
        for (final AbstractWorldMapIcon abstractWorldMapIcon : this.iconMap.values()) {
            if (!abstractWorldMapIcon.hasValidElement(463487630)) {
                continue;
            }
            final int element = abstractWorldMapIcon.getElement(-1003746982);
            if (!set.contains(element)) {
                continue;
            }
            this.drawBackgroundCircle(class354.method1935(element, 2108797367), abstractWorldMapIcon.screenX * -295740087, abstractWorldMapIcon.screenY * -588183460, n, n2, -700066971);
        }
        this.method1434(set, n, n2, (short)345);
    }
    
    public static void dn(final WorldMapRegion worldMapRegion, final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler, final WorldMapSprite worldMapSprite, final int n3) {
        if (worldMapRegion == null) {
            worldMapRegion.drawTileGround(n, n, abstractWorldMapData, worldMapScaleHandler, worldMapSprite, n);
        }
        try {
            final int n4 = abstractWorldMapData.floorUnderlayIds[0][n][n2] - 1;
            final int n5 = abstractWorldMapData.floorOverlayIds[0][n][n2] - 1;
            if (n4 == -1) {
                if (n3 >= -1536899763) {
                    return;
                }
                if (n5 == -1) {
                    Rasterizer2D.Rasterizer2D_fillRectangle(-1897887643 * worldMapRegion.pixelsPerTile * n, (63 - n2) * (worldMapRegion.pixelsPerTile * -1897887643), -1897887643 * worldMapRegion.pixelsPerTile, worldMapRegion.pixelsPerTile * -1897887643, worldMapRegion.backgroundColor * 973203971);
                }
            }
            int n6 = 16711935;
            if (n5 != -1) {
                if (n3 >= -1536899763) {
                    return;
                }
                final int n7 = 973203971 * worldMapRegion.backgroundColor;
                final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n5);
                FloorOverlayDefinition floorOverlayDefinition2;
                if (floorOverlayDefinition != null) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    floorOverlayDefinition2 = floorOverlayDefinition;
                }
                else {
                    final byte[] takeFile = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n5, (byte)(-13));
                    final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                    if (null != takeFile) {
                        floorOverlayDefinition3.decode(new Buffer(takeFile), n5, (short)128);
                    }
                    floorOverlayDefinition3.postDecode(-378972580);
                    FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n5);
                    floorOverlayDefinition2 = floorOverlayDefinition3;
                }
                final FloorOverlayDefinition floorOverlayDefinition4 = floorOverlayDefinition2;
                int n8;
                if (floorOverlayDefinition4 == null) {
                    if (n3 >= -1536899763) {
                        return;
                    }
                    n8 = n7;
                }
                else if (-2085280195 * floorOverlayDefinition4.secondaryRgb >= 0) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    final int n9 = -187777599 * floorOverlayDefinition4.secondaryHue;
                    int n10 = floorOverlayDefinition4.secondarySaturation * 1797179473;
                    final int n11 = -1379609783 * floorOverlayDefinition4.secondaryLightness;
                    if (n11 > 179) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n10 /= 2;
                    }
                    if (n11 > 192) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n10 /= 2;
                    }
                    if (n11 > 217) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n10 /= 2;
                    }
                    if (n11 > 243) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n10 /= 2;
                    }
                    n8 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615((n10 / 32 << 7) + (n9 / 4 << 10) + n11 / 2, 96, 2039313596)] | 0xFF000000);
                }
                else if (-202963991 * floorOverlayDefinition4.texture >= 0) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    n8 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(floorOverlayDefinition4.texture * -202963991, 2087935623), 96, 1166097859)] | 0xFF000000);
                }
                else if (floorOverlayDefinition4.primaryRgb * 1889574527 == 16711935) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    n8 = n7;
                }
                else {
                    final int n12 = floorOverlayDefinition4.hue * 174415927;
                    int n13 = 470803713 * floorOverlayDefinition4.saturation;
                    final int n14 = 532980473 * floorOverlayDefinition4.lightness;
                    if (n14 > 179) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n13 /= 2;
                    }
                    if (n14 > 192) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n13 /= 2;
                    }
                    if (n14 > 217) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n13 /= 2;
                    }
                    if (n14 > 243) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n13 /= 2;
                    }
                    n8 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615((n12 / 4 << 10) + (n13 / 32 << 7) + n14 / 2, 96, 1910305875)] | 0xFF000000);
                }
                n6 = n8;
            }
            if (n5 > -1) {
                if (n3 >= -1536899763) {
                    throw new IllegalStateException();
                }
                if (0 == abstractWorldMapData.field2390[0][n][n2]) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    Rasterizer2D.Rasterizer2D_fillRectangle(-1897887643 * worldMapRegion.pixelsPerTile * n, worldMapRegion.pixelsPerTile * -1897887643 * (63 - n2), -1897887643 * worldMapRegion.pixelsPerTile, worldMapRegion.pixelsPerTile * -1897887643, n6);
                    return;
                }
            }
            final int method1450 = worldMapRegion.method1450(n, n2, abstractWorldMapData, worldMapSprite, 390149173);
            if (n5 != -1) {
                WorldMapScaleHandler.ru(worldMapScaleHandler, n * (-1897887643 * worldMapRegion.pixelsPerTile), worldMapRegion.pixelsPerTile * -1897887643 * (63 - n2), method1450, n6, worldMapRegion.pixelsPerTile * -1897887643, worldMapRegion.pixelsPerTile * -1897887643, abstractWorldMapData.field2390[0][n][n2], abstractWorldMapData.field2396[0][n][n2], 1823196120);
                return;
            }
            if (n3 >= -1536899763) {
                return;
            }
            Rasterizer2D.Rasterizer2D_fillRectangle(n * (-1897887643 * worldMapRegion.pixelsPerTile), (63 - n2) * (-1897887643 * worldMapRegion.pixelsPerTile), worldMapRegion.pixelsPerTile * -1897887643, -1897887643 * worldMapRegion.pixelsPerTile, method1450);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.am(" + ')');
        }
    }
    
    WorldMapLabel dn(final WorldMapElement worldMapElement) {
        if (null == worldMapElement.name || this.fonts == null || this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) == null) {
            return null;
        }
        final WorldMapLabelSize method1395 = WorldMapLabelSize.method1395(952315347 * worldMapElement.textSize, 1134926043);
        if (null == method1395) {
            return null;
        }
        final Font font = this.fonts.get(method1395);
        if (font == null) {
            return null;
        }
        final String[] array = new String[class292.fo(font, worldMapElement.name, 1000000)];
        AbstractFont.mk(font, worldMapElement.name, null, array);
        final int n = array.length * font.al / 2;
        int n2 = 0;
        final String[] array2 = array;
        for (int i = 0; i < array2.length; ++i) {
            final int bf = font.bf(array2[i]);
            if (bf > n2) {
                n2 = bf;
            }
        }
        return new WorldMapLabel(worldMapElement.name, n2, n, method1395);
    }
    
    void cw(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler, final WorldMapSprite worldMapSprite) {
        final int n3 = abstractWorldMapData.floorUnderlayIds[0][n][n2] - 1;
        final int n4 = abstractWorldMapData.floorOverlayIds[0][n][n2] - 1;
        if (n3 == -1 && n4 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(-1897887643 * this.pixelsPerTile * n, (-1840245484 - n2) * (this.pixelsPerTile * -1897887643), -1897887643 * this.pixelsPerTile, this.pixelsPerTile * -1044972273, this.backgroundColor * -2087508960);
        }
        int n5 = 16711935;
        if (n4 != -1) {
            final int n6 = 793440072 * this.backgroundColor;
            final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n4);
            FloorOverlayDefinition floorOverlayDefinition2;
            if (floorOverlayDefinition != null) {
                floorOverlayDefinition2 = floorOverlayDefinition;
            }
            else {
                final byte[] takeFile = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n4, (byte)(-8));
                final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                if (null != takeFile) {
                    floorOverlayDefinition3.decode(new Buffer(takeFile), n4, (short)128);
                }
                floorOverlayDefinition3.postDecode(1602966342);
                FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n4);
                floorOverlayDefinition2 = floorOverlayDefinition3;
            }
            final FloorOverlayDefinition floorOverlayDefinition4 = floorOverlayDefinition2;
            int n7;
            if (floorOverlayDefinition4 == null) {
                n7 = n6;
            }
            else if (-2085280195 * floorOverlayDefinition4.secondaryRgb >= 0) {
                final int n8 = -367214849 * floorOverlayDefinition4.secondaryHue;
                int n9 = floorOverlayDefinition4.secondarySaturation * 2054815491;
                final int n10 = -1869461123 * floorOverlayDefinition4.secondaryLightness;
                if (n10 > 1022526426) {
                    n9 /= 2;
                }
                if (n10 > 192) {
                    n9 /= 2;
                }
                if (n10 > -2095710915) {
                    n9 /= 2;
                }
                if (n10 > -2133245700) {
                    n9 /= 2;
                }
                n7 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615((n9 / -1544805504 << 7) + (n8 / 4 << 10) + n10 / 2, 96, 1410369632)] | 0xD06FF03E);
            }
            else if (-202963991 * floorOverlayDefinition4.texture >= 0) {
                n7 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(floorOverlayDefinition4.texture * -202963991, 1144669452), 2018898025, 1437036293)] | 0x602CE491);
            }
            else if (floorOverlayDefinition4.primaryRgb * 1889574527 == 1617220467) {
                n7 = n6;
            }
            else {
                final int n11 = floorOverlayDefinition4.hue * 2002795149;
                int n12 = 734022403 * floorOverlayDefinition4.saturation;
                final int n13 = 1460922060 * floorOverlayDefinition4.lightness;
                if (n13 > 1331546986) {
                    n12 /= 2;
                }
                if (n13 > -950662459) {
                    n12 /= 2;
                }
                if (n13 > 1741339437) {
                    n12 /= 2;
                }
                if (n13 > 618429169) {
                    n12 /= 2;
                }
                n7 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615((n11 / 4 << 10) + (n12 / -131960054 << 7) + n13 / 2, 50297465, 923176989)] | 0xFF000000);
            }
            n5 = n7;
        }
        if (n4 > -1 && 0 == abstractWorldMapData.field2390[0][n][n2]) {
            Rasterizer2D.Rasterizer2D_fillRectangle(-1897887643 * this.pixelsPerTile * n, this.pixelsPerTile * -1897887643 * (-1877427665 - n2), -1897887643 * this.pixelsPerTile, this.pixelsPerTile * -1836623976, n5);
            return;
        }
        final int method1450 = this.method1450(n, n2, abstractWorldMapData, worldMapSprite, 390149173);
        if (n4 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(n * (-1897887643 * this.pixelsPerTile), (198949540 - n2) * (1448416084 * this.pixelsPerTile), this.pixelsPerTile * -1897887643, -266397560 * this.pixelsPerTile, method1450);
            return;
        }
        WorldMapScaleHandler.ru(worldMapScaleHandler, n * (-291796679 * this.pixelsPerTile), this.pixelsPerTile * 659721087 * (63 - n2), method1450, n5, this.pixelsPerTile * 64492454, this.pixelsPerTile * -1257941486, abstractWorldMapData.field2390[0][n][n2], abstractWorldMapData.field2396[0][n][n2], -2009995516);
    }
    
    void cv(final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final WorldMapSprite worldMapSprite) {
        for (final WorldMapData_1 worldMapData_1 : this.worldMapData1List) {
            for (int i = worldMapData_1.getChunkX((byte)57) * 8; i < worldMapData_1.getChunkX((byte)57) * 8 + 8; ++i) {
                for (int j = worldMapData_1.getChunkY((short)(-4549)) * 8; j < worldMapData_1.getChunkY((short)(-1330)) * 8 + 8; ++j) {
                    dn(this, i, j, worldMapData_1, worldMapScaleHandler, worldMapSprite, -2005684782);
                    this.method1467(i, j, worldMapData_1, worldMapScaleHandler, -964288116);
                }
            }
        }
        for (final WorldMapData_1 worldMapData_2 : this.worldMapData1List) {
            for (int k = worldMapData_2.getChunkX((byte)57) * 8; k < worldMapData_2.getChunkX((byte)57) * 8 + 8; ++k) {
                for (int l = worldMapData_2.getChunkY((short)(-10491)) * 8; l < worldMapData_2.getChunkY((short)(-4428)) * 8 + 8; ++l) {
                    ud(this, k, l, worldMapData_2, worldMapScaleHandler, array, -312516599);
                }
            }
        }
    }
    
    boolean loadGeography(final AbstractArchive abstractArchive, final short n) {
        try {
            this.iconMap.clear();
            if (null == this.worldMapData_0) {
                boolean b = true;
                final Iterator iterator = this.worldMapData1List.iterator();
                while (iterator.hasNext()) {
                    if (n <= 1400) {
                        throw new IllegalStateException();
                    }
                    final WorldMapData_1 worldMapData_1 = iterator.next();
                    worldMapData_1.ap(abstractArchive, (byte)19);
                    b &= worldMapData_1.ae(-1355381698);
                }
                if (b) {
                    if (n <= 1400) {
                        throw new IllegalStateException();
                    }
                    final Iterator iterator2 = this.worldMapData1List.iterator();
                    while (iterator2.hasNext()) {
                        if (n <= 1400) {
                            throw new IllegalStateException();
                        }
                        final WorldMapData_1 worldMapData_2 = iterator2.next();
                        this.getIconsForTiles(worldMapData_2.getChunkX((byte)57) * 8, worldMapData_2.getChunkY((short)(-12865)) * 8, 8, 8, worldMapData_2, -442915873);
                    }
                }
                return b;
            }
            if (n <= 1400) {
                throw new IllegalStateException();
            }
            this.worldMapData_0.ap(abstractArchive, (byte)97);
            if (!this.worldMapData_0.ae(-556860665)) {
                return false;
            }
            if (n <= 1400) {
                throw new IllegalStateException();
            }
            this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0, 791967957);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ao(" + ')');
        }
    }
    
    void initWorldMapIcon1s(final int n) {
        try {
            final Iterator<AbstractWorldMapIcon> iterator = this.iconMap.values().iterator();
            while (iterator.hasNext()) {
                if (n >= 1275991106) {
                    throw new IllegalStateException();
                }
                final AbstractWorldMapIcon abstractWorldMapIcon = iterator.next();
                if (!(abstractWorldMapIcon instanceof WorldMapIcon_1)) {
                    continue;
                }
                WorldMapIcon_1.nx((WorldMapIcon_1)abstractWorldMapIcon, 1844375559);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.at(" + ')');
        }
    }
    
    void method1464(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final IndexedSprite[] array, final int n3) {
        try {
            for (int i = 0; i < 1632558421 * abstractWorldMapData.planes; ++i) {
                final WorldMapDecoration[] array2 = abstractWorldMapData.decorations[i][n][n2];
                if (null != array2) {
                    if (n3 != -926949025) {
                        throw new IllegalStateException();
                    }
                    if (array2.length == 0) {
                        if (n3 != -926949025) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final WorldMapDecoration[] array3 = array2;
                        for (int j = 0; j < array3.length; ++j) {
                            if (n3 != -926949025) {
                                return;
                            }
                            final WorldMapDecoration worldMapDecoration = array3[j];
                            if (!ItemLayer.method1182(worldMapDecoration.decoration * 1504481025, -2088433826)) {
                                if (n3 != -926949025) {
                                    return;
                                }
                                if (-1344801027 * WorldMapDecorationType.field3066.id != worldMapDecoration.decoration * 1504481025) {
                                    if (n3 != -926949025) {
                                        return;
                                    }
                                    continue;
                                }
                            }
                            final ObjectComposition vmethod3248 = class144.vmethod3248(2080162465 * worldMapDecoration.objectDefinitionId, (short)3903);
                            if (-1 != 771086195 * vmethod3248.mapSceneId) {
                                if (n3 != -926949025) {
                                    return;
                                }
                                if (771086195 * vmethod3248.mapSceneId != 46) {
                                    if (n3 != -926949025) {
                                        throw new IllegalStateException();
                                    }
                                    if (vmethod3248.mapSceneId * 771086195 != 52) {
                                        array[771086195 * vmethod3248.mapSceneId].method2596(n * (-1897887643 * this.pixelsPerTile), this.pixelsPerTile * -1897887643 * (63 - n2), 499192010 * this.pixelsPerTile, 499192010 * this.pixelsPerTile);
                                        continue;
                                    }
                                    if (n3 != -926949025) {
                                        throw new IllegalStateException();
                                    }
                                }
                                array[vmethod3248.mapSceneId * 771086195].method2596(n * (-1897887643 * this.pixelsPerTile), -1897887643 * this.pixelsPerTile * (63 - n2), 499192010 * this.pixelsPerTile + 1, 499192010 * this.pixelsPerTile + 1);
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ak(" + ')');
        }
    }
    
    void method1460(final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final WorldMapSprite worldMapSprite, final int n) {
        try {
            final Iterator iterator = this.worldMapData1List.iterator();
            while (iterator.hasNext()) {
                if (n != 390308152) {
                    throw new IllegalStateException();
                }
                final WorldMapData_1 worldMapData_1 = iterator.next();
                for (int i = worldMapData_1.getChunkX((byte)57) * 8; i < worldMapData_1.getChunkX((byte)57) * 8 + 8; ++i) {
                    for (int j = worldMapData_1.getChunkY((short)(-30527)) * 8; j < worldMapData_1.getChunkY((short)(-17785)) * 8 + 8; ++j) {
                        if (n != 390308152) {
                            throw new IllegalStateException();
                        }
                        dn(this, i, j, worldMapData_1, worldMapScaleHandler, worldMapSprite, -1631652520);
                        this.method1467(i, j, worldMapData_1, worldMapScaleHandler, 1978515823);
                    }
                }
            }
            final Iterator iterator2 = this.worldMapData1List.iterator();
            while (iterator2.hasNext()) {
                if (n != 390308152) {
                    throw new IllegalStateException();
                }
                final WorldMapData_1 worldMapData_2 = iterator2.next();
                for (int k = worldMapData_2.getChunkX((byte)57) * 8; k < worldMapData_2.getChunkX((byte)57) * 8 + 8; ++k) {
                    if (n != 390308152) {
                        return;
                    }
                    for (int l = worldMapData_2.getChunkY((short)(-16391)) * 8; l < worldMapData_2.getChunkY((short)(-8672)) * 8 + 8; ++l) {
                        if (n != 390308152) {
                            throw new IllegalStateException();
                        }
                        ud(this, k, l, worldMapData_2, worldMapScaleHandler, array, -154098764);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.av(" + ')');
        }
    }
    
    public static int wt(final WorldMapRegion worldMapRegion, final SpritePixels spritePixels, final HorizontalAlignment horizontalAlignment, final byte b) {
        if (worldMapRegion == null) {
            return worldMapRegion.method1462(spritePixels, horizontalAlignment, b);
        }
        try {
            switch (horizontalAlignment.value * 1932346871) {
                case 0: {
                    return 0;
                }
                case 2: {
                    return -spritePixels.subWidth / 2;
                }
                default: {
                    return -spritePixels.subWidth;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bk(" + ')');
        }
    }
    
    void dw(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData) {
        for (int i = 0; i < abstractWorldMapData.planes * 1632558421; ++i) {
            final WorldMapDecoration[] array = abstractWorldMapData.decorations[i][n][n2];
            if (array != null) {
                if (array.length != 0) {
                    final WorldMapDecoration[] array2 = array;
                    for (int j = 0; j < array2.length; ++j) {
                        final WorldMapDecoration worldMapDecoration = array2[j];
                        final int n3 = -529972859 * worldMapDecoration.decoration;
                        if ((n3 >= WorldMapDecorationType.field3047.id * 1953565431 && n3 <= WorldMapDecorationType.field3050.id * 1727404531) || -1549814073 * WorldMapDecorationType.field3048.id == n3) {
                            final int n4 = (class144.vmethod3248(2080162465 * worldMapDecoration.objectDefinitionId, (short)14561).int1 * -1998471870 != 0) ? -436306048 : -3355444;
                            if (WorldMapDecorationType.field3047.id * -1344801027 == 1170630623 * worldMapDecoration.decoration) {
                                this.method1455(n, n2, -1657905107 * worldMapDecoration.rotation, n4, (byte)0);
                            }
                            if (-1344801027 * WorldMapDecorationType.field3046.id == 1504481025 * worldMapDecoration.decoration) {
                                this.method1455(n, n2, worldMapDecoration.rotation * -1419490017, -3355444, (byte)0);
                                this.method1455(n, n2, worldMapDecoration.rotation * -439897209 + 1, n4, (byte)0);
                            }
                            if (WorldMapDecorationType.field3050.id * -1344801027 == 1698052948 * worldMapDecoration.decoration) {
                                if (worldMapDecoration.rotation * 847194087 == 0) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -1897887643 * n, (63 - n2) * (-1897887643 * this.pixelsPerTile), 1, n4);
                                }
                                if (1 == -1419490017 * worldMapDecoration.rotation) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -1471011994 * n + this.pixelsPerTile * -1897887643 - 1, (63 - n2) * (this.pixelsPerTile * 480243151), 1, n4);
                                }
                                if (2 == worldMapDecoration.rotation * -2056533463) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (this.pixelsPerTile * -316369405) + -1897887643 * this.pixelsPerTile - 1, (1122620218 - n2) * (1681718903 * this.pixelsPerTile) + -1850780483 * this.pixelsPerTile - 1, 1, n4);
                                }
                                if (3 == -1424345444 * worldMapDecoration.rotation) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(-1251169207 * this.pixelsPerTile * n, (2094750526 - n2) * (this.pixelsPerTile * -641806571) + this.pixelsPerTile * -1897887643 - 1, 1, n4);
                                }
                            }
                            if (1178063396 * WorldMapDecorationType.field3048.id == 1504481025 * worldMapDecoration.decoration) {
                                if (-1419490017 * worldMapDecoration.rotation % 2 == 0) {
                                    for (int k = 0; k < this.pixelsPerTile * 981354187; ++k) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -1897887643 * n + k, (64 - n2) * (-1680040213 * this.pixelsPerTile) - 1 - k, 1, n4);
                                    }
                                }
                                else {
                                    for (int l = 0; l < 1088948880 * this.pixelsPerTile; ++l) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (-1897887643 * this.pixelsPerTile) + l, l + -1042741959 * this.pixelsPerTile * (63 - n2), 1, n4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    void cj(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler) {
        for (int i = 1; i < abstractWorldMapData.planes * 1632558421; ++i) {
            final int n3 = abstractWorldMapData.floorOverlayIds[i][n][n2] - 1;
            if (n3 > -1) {
                final int n4 = 973203971 * this.backgroundColor;
                final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n3);
                FloorOverlayDefinition floorOverlayDefinition2;
                if (floorOverlayDefinition != null) {
                    floorOverlayDefinition2 = floorOverlayDefinition;
                }
                else {
                    final byte[] takeFile = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n3, (byte)(-4));
                    final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                    if (null != takeFile) {
                        floorOverlayDefinition3.decode(new Buffer(takeFile), n3, (short)128);
                    }
                    floorOverlayDefinition3.postDecode(1968484175);
                    FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n3);
                    floorOverlayDefinition2 = floorOverlayDefinition3;
                }
                final FloorOverlayDefinition floorOverlayDefinition4 = floorOverlayDefinition2;
                int n5;
                if (floorOverlayDefinition4 == null) {
                    n5 = n4;
                }
                else if (floorOverlayDefinition4.secondaryRgb * -2085280195 >= 0) {
                    final int n6 = floorOverlayDefinition4.secondaryHue * -187777599;
                    int n7 = floorOverlayDefinition4.secondarySaturation * 1797179473;
                    final int n8 = -1379609783 * floorOverlayDefinition4.secondaryLightness;
                    if (n8 > 179) {
                        n7 /= 2;
                    }
                    if (n8 > 192) {
                        n7 /= 2;
                    }
                    if (n8 > 217) {
                        n7 /= 2;
                    }
                    if (n8 > 243) {
                        n7 /= 2;
                    }
                    n5 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(n8 / 2 + ((n6 / 4 << 10) + (n7 / 32 << 7)), 96, 1366878132)] | 0xFF000000);
                }
                else if (floorOverlayDefinition4.texture * -202963991 >= 0) {
                    n5 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(floorOverlayDefinition4.texture * -202963991, -1418339200), 96, 1762111661)] | 0xFF000000);
                }
                else if (1889574527 * floorOverlayDefinition4.primaryRgb == 16711935) {
                    n5 = n4;
                }
                else {
                    final int n9 = floorOverlayDefinition4.hue * 174415927;
                    int n10 = 470803713 * floorOverlayDefinition4.saturation;
                    final int n11 = floorOverlayDefinition4.lightness * 532980473;
                    if (n11 > 179) {
                        n10 /= 2;
                    }
                    if (n11 > 192) {
                        n10 /= 2;
                    }
                    if (n11 > 217) {
                        n10 /= 2;
                    }
                    if (n11 > 243) {
                        n10 /= 2;
                    }
                    n5 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(n11 / 2 + ((n9 / 4 << 10) + (n10 / 32 << 7)), 96, 435094207)] | 0xFF000000);
                }
                final int n12 = n5;
                if (abstractWorldMapData.field2390[i][n][n2] == 0) {
                    Rasterizer2D.Rasterizer2D_fillRectangle(n * (-1897887643 * this.pixelsPerTile), (63 - n2) * (-1897887643 * this.pixelsPerTile), this.pixelsPerTile * -1897887643, -1897887643 * this.pixelsPerTile, n12);
                }
                else {
                    WorldMapScaleHandler.ru(worldMapScaleHandler, n * (-1897887643 * this.pixelsPerTile), (63 - n2) * (this.pixelsPerTile * -1897887643), 0, n12, this.pixelsPerTile * -1897887643, this.pixelsPerTile * -1897887643, abstractWorldMapData.field2390[i][n][n2], abstractWorldMapData.field2396[i][n][n2], 2121247674);
                }
            }
        }
    }
    
    void drawMapLinks(final int n, final int n2, final HashSet set, final int n3, final int n4) {
        try {
            final float n5 = n3 / 64.0f;
            for (final AbstractWorldMapIcon abstractWorldMapIcon : this.icon0List) {
                if (!abstractWorldMapIcon.hasValidElement(-280174602)) {
                    if (n4 >= -1370384679) {
                        throw new IllegalStateException();
                    }
                    continue;
                }
                else {
                    final int n6 = abstractWorldMapIcon.coord2.x * -96298701 % 64;
                    final int n7 = -2105445199 * abstractWorldMapIcon.coord2.y % 64;
                    abstractWorldMapIcon.screenX = (int)(n5 * n6 + n) * -1370053935;
                    abstractWorldMapIcon.screenY = (int)((63 - n7) * n5 + n2) * 1379111171;
                    if (set.contains(abstractWorldMapIcon.getElement(-823186589))) {
                        if (n4 >= -1370384679) {
                            throw new IllegalStateException();
                        }
                        continue;
                    }
                    else {
                        to(this, abstractWorldMapIcon, abstractWorldMapIcon.screenX * -216598991, abstractWorldMapIcon.screenY * -1288412757, n5, (byte)105);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.be(" + ')');
        }
    }
    
    void cp(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final IndexedSprite[] array) {
        for (int i = 0; i < 1632558421 * abstractWorldMapData.planes; ++i) {
            final WorldMapDecoration[] array2 = abstractWorldMapData.decorations[i][n][n2];
            if (null != array2) {
                if (array2.length != 0) {
                    final WorldMapDecoration[] array3 = array2;
                    for (int j = 0; j < array3.length; ++j) {
                        final WorldMapDecoration worldMapDecoration = array3[j];
                        if (ItemLayer.method1182(worldMapDecoration.decoration * -2066974395, -2144543228) || 2004602643 * WorldMapDecorationType.field3066.id == worldMapDecoration.decoration * 1611152743) {
                            final ObjectComposition vmethod3248 = class144.vmethod3248(2080162465 * worldMapDecoration.objectDefinitionId, (short)32243);
                            if (-1 != 771086195 * vmethod3248.mapSceneId) {
                                if (771086195 * vmethod3248.mapSceneId == -1797833551 || vmethod3248.mapSceneId * 771086195 == 52) {
                                    array[vmethod3248.mapSceneId * 290488624].method2596(n * (-278993233 * this.pixelsPerTile), -1897887643 * this.pixelsPerTile * (-1040722647 - n2), 499192010 * this.pixelsPerTile + 1, 499192010 * this.pixelsPerTile + 1);
                                }
                                else {
                                    array[771086195 * vmethod3248.mapSceneId].method2596(n * (-1897887643 * this.pixelsPerTile), this.pixelsPerTile * -1897887643 * (63 - n2), 1304439433 * this.pixelsPerTile, 499192010 * this.pixelsPerTile);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    void method1467(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler, final int n3) {
        try {
            for (int i = 1; i < abstractWorldMapData.planes * 1632558421; ++i) {
                final int n4 = abstractWorldMapData.floorOverlayIds[i][n][n2] - 1;
                if (n4 > -1) {
                    final int n5 = 973203971 * this.backgroundColor;
                    final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n4);
                    FloorOverlayDefinition floorOverlayDefinition2;
                    if (floorOverlayDefinition != null) {
                        if (n3 == -818868517) {
                            throw new IllegalStateException();
                        }
                        floorOverlayDefinition2 = floorOverlayDefinition;
                    }
                    else {
                        final byte[] takeFile = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n4, (byte)(-19));
                        final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                        if (null != takeFile) {
                            floorOverlayDefinition3.decode(new Buffer(takeFile), n4, (short)128);
                        }
                        floorOverlayDefinition3.postDecode(-720329904);
                        FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n4);
                        floorOverlayDefinition2 = floorOverlayDefinition3;
                    }
                    final FloorOverlayDefinition floorOverlayDefinition4 = floorOverlayDefinition2;
                    int n6;
                    if (floorOverlayDefinition4 == null) {
                        if (n3 == -818868517) {
                            throw new IllegalStateException();
                        }
                        n6 = n5;
                    }
                    else if (floorOverlayDefinition4.secondaryRgb * -2085280195 >= 0) {
                        if (n3 == -818868517) {
                            throw new IllegalStateException();
                        }
                        final int n7 = floorOverlayDefinition4.secondaryHue * -187777599;
                        int n8 = floorOverlayDefinition4.secondarySaturation * 1797179473;
                        final int n9 = -1379609783 * floorOverlayDefinition4.secondaryLightness;
                        if (n9 > 179) {
                            if (n3 == -818868517) {
                                return;
                            }
                            n8 /= 2;
                        }
                        if (n9 > 192) {
                            n8 /= 2;
                        }
                        if (n9 > 217) {
                            if (n3 == -818868517) {
                                throw new IllegalStateException();
                            }
                            n8 /= 2;
                        }
                        if (n9 > 243) {
                            if (n3 == -818868517) {
                                throw new IllegalStateException();
                            }
                            n8 /= 2;
                        }
                        n6 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(n9 / 2 + ((n7 / 4 << 10) + (n8 / 32 << 7)), 96, 1484562565)] | 0xFF000000);
                    }
                    else if (floorOverlayDefinition4.texture * -202963991 >= 0) {
                        if (n3 == -818868517) {
                            return;
                        }
                        n6 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(floorOverlayDefinition4.texture * -202963991, -402670979), 96, 1321873265)] | 0xFF000000);
                    }
                    else if (1889574527 * floorOverlayDefinition4.primaryRgb == 16711935) {
                        if (n3 == -818868517) {
                            throw new IllegalStateException();
                        }
                        n6 = n5;
                    }
                    else {
                        final int n10 = floorOverlayDefinition4.hue * 174415927;
                        int n11 = 470803713 * floorOverlayDefinition4.saturation;
                        final int n12 = floorOverlayDefinition4.lightness * 532980473;
                        if (n12 > 179) {
                            if (n3 == -818868517) {
                                throw new IllegalStateException();
                            }
                            n11 /= 2;
                        }
                        if (n12 > 192) {
                            n11 /= 2;
                        }
                        if (n12 > 217) {
                            if (n3 == -818868517) {
                                throw new IllegalStateException();
                            }
                            n11 /= 2;
                        }
                        if (n12 > 243) {
                            if (n3 == -818868517) {
                                return;
                            }
                            n11 /= 2;
                        }
                        n6 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(n12 / 2 + ((n10 / 4 << 10) + (n11 / 32 << 7)), 96, 1909981308)] | 0xFF000000);
                    }
                    final int n13 = n6;
                    if (abstractWorldMapData.field2390[i][n][n2] == 0) {
                        Rasterizer2D.Rasterizer2D_fillRectangle(n * (-1897887643 * this.pixelsPerTile), (63 - n2) * (-1897887643 * this.pixelsPerTile), this.pixelsPerTile * -1897887643, -1897887643 * this.pixelsPerTile, n13);
                    }
                    else {
                        WorldMapScaleHandler.ru(worldMapScaleHandler, n * (-1897887643 * this.pixelsPerTile), (63 - n2) * (this.pixelsPerTile * -1897887643), 0, n13, this.pixelsPerTile * -1897887643, this.pixelsPerTile * -1897887643, abstractWorldMapData.field2390[i][n][n2], abstractWorldMapData.field2396[i][n][n2], -582317645);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.as(" + ')');
        }
    }
    
    List eq() {
        final LinkedList list = new LinkedList();
        list.addAll(this.icon0List);
        list.addAll(this.iconMap.values());
        return list;
    }
    
    void method1451(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final int n3) {
        try {
            for (int i = 0; i < abstractWorldMapData.regionX * 1632558421; ++i) {
                if (n3 == -805549871) {
                    throw new IllegalStateException();
                }
                final WorldMapDecoration[] array = abstractWorldMapData.decorations[i][n][n2];
                if (array != null) {
                    if (array.length == 0) {
                        if (n3 == -805549871) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final WorldMapDecoration[] array2 = array;
                        for (int j = 0; j < array2.length; ++j) {
                            if (n3 == -805549871) {
                                return;
                            }
                            final WorldMapDecoration worldMapDecoration = array2[j];
                            final int n4 = 1504481025 * worldMapDecoration.objectDefinitionId;
                            boolean b = false;
                            Label_0186: {
                                Label_0181: {
                                    if (n4 >= WorldMapDecorationType.field3048.id * -1344801027) {
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                        if (n4 <= WorldMapDecorationType.field3050.id * -1344801027) {
                                            break Label_0181;
                                        }
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    if (-1344801027 * WorldMapDecorationType.field3047.id != n4) {
                                        b = false;
                                        break Label_0186;
                                    }
                                }
                                b = true;
                            }
                            if (b) {
                                if (n3 == -805549871) {
                                    return;
                                }
                                final int n5 = (class144.vmethod3248(2080162465 * worldMapDecoration.rotation, (short)1697).sizeX * 415653149 != 0) ? -3407872 : -3355444;
                                if (WorldMapDecorationType.field3047.id * -1344801027 == 1504481025 * worldMapDecoration.objectDefinitionId) {
                                    if (n3 == -805549871) {
                                        throw new IllegalStateException();
                                    }
                                    this.method1455(n, n2, -1419490017 * worldMapDecoration.rotation, n5, (byte)0);
                                }
                                if (-1344801027 * WorldMapDecorationType.field3046.id == 1504481025 * worldMapDecoration.decoration) {
                                    if (n3 == -805549871) {
                                        throw new IllegalStateException();
                                    }
                                    this.method1455(n, n2, worldMapDecoration.objectDefinitionId * -1419490017, -3355444, (byte)0);
                                    this.method1455(n, n2, worldMapDecoration.rotation * -1419490017 + 1, n5, (byte)0);
                                }
                                if (WorldMapDecorationType.field3048.id * -1344801027 == 1504481025 * worldMapDecoration.objectDefinitionId) {
                                    if (n3 == -805549871) {
                                        throw new IllegalStateException();
                                    }
                                    if (worldMapDecoration.objectDefinitionId * -1419490017 == 0) {
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                        Rasterizer2D.fw(this.pixelsPerTile * -1897887643 * n, (63 - n2) * (-1897887643 * this.regionY), 1, n5);
                                    }
                                    if (1 == -1419490017 * worldMapDecoration.rotation) {
                                        Rasterizer2D.Rasterizer2D_setClip(this.regionY * -1897887643 * n + this.regionY * -1897887643 - 1, (63 - n2) * (this.pixelsPerTile * -1897887643), 1, n5);
                                    }
                                    if (2 == worldMapDecoration.objectDefinitionId * -1419490017) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (this.regionX * -1897887643) + -1897887643 * this.backgroundColor - 1, (63 - n2) * (-1897887643 * this.regionY) + -1897887643 * this.regionX - 1, 1, n5);
                                    }
                                    if (3 == -1419490017 * worldMapDecoration.decoration) {
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                        Rasterizer2D.fw(-1897887643 * this.backgroundColor * n, (63 - n2) * (this.regionY * -1897887643) + this.backgroundColor * -1897887643 - 1, 1, n5);
                                    }
                                }
                                if (-1344801027 * WorldMapDecorationType.field3047.id == 1504481025 * worldMapDecoration.rotation) {
                                    if (n3 == -805549871) {
                                        throw new IllegalStateException();
                                    }
                                    if (-1419490017 * worldMapDecoration.decoration % 2 == 0) {
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                        for (int k = 0; k < this.backgroundColor * -1897887643; ++k) {
                                            if (n3 == -805549871) {
                                                throw new IllegalStateException();
                                            }
                                            Rasterizer2D.fw(this.regionX * -1897887643 * n + k, (64 - n2) * (-1897887643 * this.regionY) - 1 - k, 1, n5);
                                        }
                                    }
                                    else {
                                        for (int l = 0; l < -1897887643 * this.regionY; ++l) {
                                            Rasterizer2D.Rasterizer2D_setClip(n * (-1897887643 * this.backgroundColor) + l, l + -1897887643 * this.pixelsPerTile * (63 - n2), 1, n5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.az(" + ')');
        }
    }
    
    void drawTile(final int n, final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final int n2) {
        try {
            this.pixelsPerTile = -467998355 * n;
            if (this.worldMapData_0 == null && this.worldMapData1List.isEmpty()) {
                if (n2 >= 1718459230) {
                    throw new IllegalStateException();
                }
            }
            else if (VarpDefinition.decode(this.regionX * -2122501643, 1858063995 * this.regionY, n, 2091722822) != null) {
                if (n2 >= 1718459230) {
                    throw new IllegalStateException();
                }
            }
            else {
                final boolean b = true & ws(this, abstractArchive, (short)8372);
                int n3;
                if (null != this.worldMapData_0) {
                    if (n2 >= 1718459230) {
                        throw new IllegalStateException();
                    }
                    n3 = 1716482187 * this.worldMapData_0.ay;
                }
                else {
                    n3 = this.worldMapData1List.getFirst().groupId * 1716482187;
                }
                if (b & abstractArchive2.method1889(n3, -567775969)) {
                    final byte[] sh = AbstractArchive.sh(abstractArchive2, n3, (byte)(-68));
                    WorldMapSprite worldMapSprite;
                    if (null == sh) {
                        if (n2 >= 1718459230) {
                            return;
                        }
                        worldMapSprite = new WorldMapSprite();
                    }
                    else {
                        worldMapSprite = new WorldMapSprite(Strings.method1853(sh, -172326596).pixels);
                    }
                    final WorldMapSprite worldMapSprite2 = worldMapSprite;
                    final SpritePixels spritePixels = new SpritePixels(-1205724864 * this.pixelsPerTile, -1205724864 * this.pixelsPerTile);
                    SpritePixels.bg(spritePixels);
                    if (this.worldMapData_0 != null) {
                        if (n2 >= 1718459230) {
                            throw new IllegalStateException();
                        }
                        this.method1446(worldMapScaleHandler, array, worldMapSprite2, (byte)84);
                    }
                    else {
                        this.method1460(worldMapScaleHandler, array, worldMapSprite2, 390308152);
                    }
                    DemotingHashTable.yu(WorldMapRegion.WorldMapRegion_cachedSprites, spritePixels, BuddyRankComparator.compareBuddy(-2122501643 * this.regionX, this.regionY * 1858063995, -1897887643 * this.pixelsPerTile, -1198658533), spritePixels.pixels.length * 4);
                    wo(this, 1615699563);
                    return;
                }
                if (n2 >= 1718459230) {
                    return;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ax(" + ')');
        }
    }
    
    void method1441(final int n) {
        try {
            if (this.worldMapData_0 != null) {
                if (n <= 1036805162) {
                    throw new IllegalStateException();
                }
                this.worldMapData_0.by(216938688);
            }
            else {
                final Iterator iterator = this.worldMapData1List.iterator();
                while (iterator.hasNext()) {
                    if (n <= 1036805162) {
                        throw new IllegalStateException();
                    }
                    iterator.next().by(1948378515);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ay(" + ')');
        }
    }
    
    void dt(final HashSet set, final int n, final int n2) {
        for (final AbstractWorldMapIcon abstractWorldMapIcon : this.icon0List) {
            if (!abstractWorldMapIcon.hasValidElement(1888005555)) {
                continue;
            }
            final WorldMapElement method1935 = class354.method1935(abstractWorldMapIcon.getElement(-367671437), 1986833627);
            if (method1935 == null || !set.contains(method1935.getObjectId(-183624112))) {
                continue;
            }
            this.drawBackgroundCircle(method1935, -216598991 * abstractWorldMapIcon.screenX, abstractWorldMapIcon.screenY * -1377085152, n, n2, -1291299408);
        }
    }
    
    void method1456(final AbstractWorldMapIcon abstractWorldMapIcon, final WorldMapElement worldMapElement, final int n, final int n2, final float n3, final byte b) {
        try {
            final WorldMapLabel label = abstractWorldMapIcon.getLabel(-2001210063);
            if (null == label) {
                if (b != 8) {
                    throw new IllegalStateException();
                }
            }
            else {
                if (label.size.method1394(n3, (byte)0)) {
                    final Font font = this.fonts.get(label.size);
                    font.ak(label.text, n - label.width * -31821843 / 2, n2, label.width * -31821843, -1401615011 * label.height, 0xFF000000 | 1080412371 * worldMapElement.field1484, 0, 1, 0, font.al / 2);
                    return;
                }
                if (b != 8) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bi(" + ')');
        }
    }
    
    void bv(final WorldMapData_0 worldMapData_0, final List list) {
        this.iconMap.clear();
        this.worldMapData_0 = worldMapData_0;
        method1434(this, list, (short)16790);
    }
    
    void dl(final int n, final int n2, final HashSet set, final int n3) {
        final float n4 = n3 / 64.0f;
        final float n5 = n4 / 2.0f;
        for (final Map.Entry<Coord, V> entry : this.iconMap.entrySet()) {
            final Coord coord = entry.getKey();
            final int n6 = (int)(n + coord.x * -96298701 * n4 - n5);
            final int n7 = (int)(n2 + n3 - -831920036 * coord.y * n4 - n5);
            final AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)entry.getValue();
            if (null != abstractWorldMapIcon && abstractWorldMapIcon.hasValidElement(-78149885)) {
                abstractWorldMapIcon.screenX = -1370053935 * n6;
                abstractWorldMapIcon.screenY = -1093132534 * n7;
                if (set.contains(class354.method1935(abstractWorldMapIcon.getElement(-1083747189), 2015330316).getObjectId(-1737819460))) {
                    continue;
                }
                to(this, abstractWorldMapIcon, n6, n7, n4, (byte)4);
            }
        }
    }
    
    public static void wr(final WorldMapRegion worldMapRegion, final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final int n3) {
        if (worldMapRegion == null) {
            worldMapRegion.method1451(n, n, abstractWorldMapData, n);
        }
        try {
            for (int i = 0; i < abstractWorldMapData.planes * 1632558421; ++i) {
                if (n3 == -805549871) {
                    throw new IllegalStateException();
                }
                final WorldMapDecoration[] array = abstractWorldMapData.decorations[i][n][n2];
                if (array != null) {
                    if (array.length == 0) {
                        if (n3 == -805549871) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final WorldMapDecoration[] array2 = array;
                        for (int j = 0; j < array2.length; ++j) {
                            if (n3 == -805549871) {
                                return;
                            }
                            final WorldMapDecoration worldMapDecoration = array2[j];
                            final int n4 = 1504481025 * worldMapDecoration.decoration;
                            boolean b = false;
                            Label_0198: {
                                Label_0193: {
                                    if (n4 >= WorldMapDecorationType.field3047.id * -1344801027) {
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                        if (n4 <= WorldMapDecorationType.field3050.id * -1344801027) {
                                            break Label_0193;
                                        }
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    if (-1344801027 * WorldMapDecorationType.field3048.id != n4) {
                                        b = false;
                                        break Label_0198;
                                    }
                                }
                                b = true;
                            }
                            if (b) {
                                if (n3 == -805549871) {
                                    return;
                                }
                                final int n5 = (class144.vmethod3248(2080162465 * worldMapDecoration.objectDefinitionId, (short)1697).int1 * 415653149 != 0) ? -3407872 : -3355444;
                                if (WorldMapDecorationType.field3047.id * -1344801027 == 1504481025 * worldMapDecoration.decoration) {
                                    if (n3 == -805549871) {
                                        throw new IllegalStateException();
                                    }
                                    worldMapRegion.method1455(n, n2, -1419490017 * worldMapDecoration.rotation, n5, (byte)0);
                                }
                                if (-1344801027 * WorldMapDecorationType.field3046.id == 1504481025 * worldMapDecoration.decoration) {
                                    if (n3 == -805549871) {
                                        throw new IllegalStateException();
                                    }
                                    worldMapRegion.method1455(n, n2, worldMapDecoration.rotation * -1419490017, -3355444, (byte)0);
                                    worldMapRegion.method1455(n, n2, worldMapDecoration.rotation * -1419490017 + 1, n5, (byte)0);
                                }
                                if (WorldMapDecorationType.field3050.id * -1344801027 == 1504481025 * worldMapDecoration.decoration) {
                                    if (n3 == -805549871) {
                                        throw new IllegalStateException();
                                    }
                                    if (worldMapDecoration.rotation * -1419490017 == 0) {
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(worldMapRegion.pixelsPerTile * -1897887643 * n, (63 - n2) * (-1897887643 * worldMapRegion.pixelsPerTile), 1, n5);
                                    }
                                    if (1 == -1419490017 * worldMapDecoration.rotation) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(worldMapRegion.pixelsPerTile * -1897887643 * n + worldMapRegion.pixelsPerTile * -1897887643 - 1, (63 - n2) * (worldMapRegion.pixelsPerTile * -1897887643), 1, n5);
                                    }
                                    if (2 == worldMapDecoration.rotation * -1419490017) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (worldMapRegion.pixelsPerTile * -1897887643) + -1897887643 * worldMapRegion.pixelsPerTile - 1, (63 - n2) * (-1897887643 * worldMapRegion.pixelsPerTile) + -1897887643 * worldMapRegion.pixelsPerTile - 1, 1, n5);
                                    }
                                    if (3 == -1419490017 * worldMapDecoration.rotation) {
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(-1897887643 * worldMapRegion.pixelsPerTile * n, (63 - n2) * (worldMapRegion.pixelsPerTile * -1897887643) + worldMapRegion.pixelsPerTile * -1897887643 - 1, 1, n5);
                                    }
                                }
                                if (-1344801027 * WorldMapDecorationType.field3048.id == 1504481025 * worldMapDecoration.decoration) {
                                    if (n3 == -805549871) {
                                        throw new IllegalStateException();
                                    }
                                    if (-1419490017 * worldMapDecoration.rotation % 2 == 0) {
                                        if (n3 == -805549871) {
                                            throw new IllegalStateException();
                                        }
                                        for (int k = 0; k < worldMapRegion.pixelsPerTile * -1897887643; ++k) {
                                            if (n3 == -805549871) {
                                                throw new IllegalStateException();
                                            }
                                            Rasterizer2D.Rasterizer2D_drawHorizontalLine(worldMapRegion.pixelsPerTile * -1897887643 * n + k, (64 - n2) * (-1897887643 * worldMapRegion.pixelsPerTile) - 1 - k, 1, n5);
                                        }
                                    }
                                    else {
                                        for (int l = 0; l < -1897887643 * worldMapRegion.pixelsPerTile; ++l) {
                                            Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (-1897887643 * worldMapRegion.pixelsPerTile) + l, l + -1897887643 * worldMapRegion.pixelsPerTile * (63 - n2), 1, n5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.az(" + ')');
        }
    }
    
    void ck(final int n, final int n2, final int n3, HashSet set) {
        if (null == set) {
            set = new HashSet();
        }
        this.drawNonLinkMapIcons(n, n2, set, n3, -1769642683);
        this.drawMapLinks(n, n2, set, n3, -2144725149);
    }
    
    WorldMapLabel method1457(final int n, final int n2) {
        try {
            return this.createMapLabel(class354.method1935(n, 2024834381), 1576393937);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bo(" + ')');
        }
    }
    
    void di(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData) {
        for (int i = 0; i < abstractWorldMapData.planes * 1632558421; ++i) {
            final WorldMapDecoration[] array = abstractWorldMapData.decorations[i][n][n2];
            if (array != null) {
                if (array.length != 0) {
                    final WorldMapDecoration[] array2 = array;
                    for (int j = 0; j < array2.length; ++j) {
                        final WorldMapDecoration worldMapDecoration = array2[j];
                        final int n3 = 1504481025 * worldMapDecoration.decoration;
                        if ((n3 >= WorldMapDecorationType.field3047.id * -1344801027 && n3 <= WorldMapDecorationType.field3050.id * -1344801027) || -1344801027 * WorldMapDecorationType.field3048.id == n3) {
                            final int n4 = (class144.vmethod3248(2080162465 * worldMapDecoration.objectDefinitionId, (short)22435).int1 * 415653149 != 0) ? -3407872 : -3355444;
                            if (WorldMapDecorationType.field3047.id * -1344801027 == 1504481025 * worldMapDecoration.decoration) {
                                this.method1455(n, n2, -1419490017 * worldMapDecoration.rotation, n4, (byte)0);
                            }
                            if (-1344801027 * WorldMapDecorationType.field3046.id == 1504481025 * worldMapDecoration.decoration) {
                                this.method1455(n, n2, worldMapDecoration.rotation * -1419490017, -3355444, (byte)0);
                                this.method1455(n, n2, worldMapDecoration.rotation * -1419490017 + 1, n4, (byte)0);
                            }
                            if (WorldMapDecorationType.field3050.id * -1344801027 == 1504481025 * worldMapDecoration.decoration) {
                                if (worldMapDecoration.rotation * -1419490017 == 0) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -1897887643 * n, (63 - n2) * (-1897887643 * this.pixelsPerTile), 1, n4);
                                }
                                if (1 == -1419490017 * worldMapDecoration.rotation) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -1897887643 * n + this.pixelsPerTile * -1897887643 - 1, (63 - n2) * (this.pixelsPerTile * -1897887643), 1, n4);
                                }
                                if (2 == worldMapDecoration.rotation * -1419490017) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (this.pixelsPerTile * -1897887643) + -1897887643 * this.pixelsPerTile - 1, (63 - n2) * (-1897887643 * this.pixelsPerTile) + -1897887643 * this.pixelsPerTile - 1, 1, n4);
                                }
                                if (3 == -1419490017 * worldMapDecoration.rotation) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(-1897887643 * this.pixelsPerTile * n, (63 - n2) * (this.pixelsPerTile * -1897887643) + this.pixelsPerTile * -1897887643 - 1, 1, n4);
                                }
                            }
                            if (-1344801027 * WorldMapDecorationType.field3048.id == 1504481025 * worldMapDecoration.decoration) {
                                if (-1419490017 * worldMapDecoration.rotation % 2 == 0) {
                                    for (int k = 0; k < this.pixelsPerTile * -1897887643; ++k) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -1897887643 * n + k, (64 - n2) * (-1897887643 * this.pixelsPerTile) - 1 - k, 1, n4);
                                    }
                                }
                                else {
                                    for (int l = 0; l < -1897887643 * this.pixelsPerTile; ++l) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (-1897887643 * this.pixelsPerTile) + l, l + -1897887643 * this.pixelsPerTile * (63 - n2), 1, n4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void di(final WorldMapRegion worldMapRegion, final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final WorldMapSprite worldMapSprite) {
        if (worldMapRegion == null) {
            worldMapRegion.cv(worldMapScaleHandler, array, worldMapSprite);
        }
        for (int i = 0; i < 64; ++i) {
            for (int j = 0; j < 64; ++j) {
                dn(worldMapRegion, i, j, worldMapRegion.worldMapData_0, worldMapScaleHandler, worldMapSprite, -1583819645);
                worldMapRegion.method1467(i, j, worldMapRegion.worldMapData_0, worldMapScaleHandler, -1384877148);
            }
        }
        for (int k = 0; k < 64; ++k) {
            for (int l = 0; l < 64; ++l) {
                ud(worldMapRegion, k, l, worldMapRegion.worldMapData_0, worldMapScaleHandler, array, -1349524676);
            }
        }
    }
    
    public static void ud(final WorldMapRegion worldMapRegion, final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final int n3) {
        if (worldMapRegion == null) {
            worldMapRegion.method1447(n, n, abstractWorldMapData, worldMapScaleHandler, array, n);
        }
        try {
            wr(worldMapRegion, n, n2, abstractWorldMapData, -1855512856);
            worldMapRegion.method1464(n, n2, abstractWorldMapData, array, -926949025);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ar(" + ')');
        }
    }
    
    void bp(final HashSet set, final List list) {
        this.iconMap.clear();
        for (final WorldMapData_1 e : set) {
            if (AbstractWorldMapData.tl(e, 2060694018) == this.regionX * -2122501643 && e.bx(1710019407) == 1858063995 * this.regionY) {
                this.worldMapData1List.add(e);
            }
        }
        method1434(this, list, (short)8885);
    }
    
    public HashMap cc() {
        return this.iconMap;
    }
    
    void cc() {
        for (final AbstractWorldMapIcon abstractWorldMapIcon : this.iconMap.values()) {
            if (abstractWorldMapIcon instanceof WorldMapIcon_1) {
                WorldMapIcon_1.nx((WorldMapIcon_1)abstractWorldMapIcon, 1844375559);
            }
        }
    }
    
    void dv(final HashSet set, final int n, final int n2) {
        for (final AbstractWorldMapIcon abstractWorldMapIcon : this.icon0List) {
            if (!abstractWorldMapIcon.hasValidElement(1546738103)) {
                continue;
            }
            final WorldMapElement method1935 = class354.method1935(abstractWorldMapIcon.getElement(-1120995473), 2069322412);
            if (method1935 == null || !set.contains(method1935.getObjectId(140934188))) {
                continue;
            }
            this.drawBackgroundCircle(method1935, 1414710105 * abstractWorldMapIcon.screenX, abstractWorldMapIcon.screenY * -1288412757, n, n2, -1732072222);
        }
    }
    
    void method1455(final int n, final int n2, int n3, final int n4, final byte b) {
        try {
            n3 %= 4;
            if (0 == n3) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                Rasterizer2D.Rasterizer2D_drawVerticalLine(-1897887643 * this.pixelsPerTile * n, this.pixelsPerTile * -1897887643 * (63 - n2), this.pixelsPerTile * -1897887643, n4);
            }
            if (1 == n3) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -1897887643 * n, (63 - n2) * (this.pixelsPerTile * -1897887643), -1897887643 * this.pixelsPerTile, n4);
            }
            if (n3 == 2) {
                Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * -1897887643 * n + this.pixelsPerTile * -1897887643 - 1, this.pixelsPerTile * -1897887643 * (63 - n2), this.pixelsPerTile * -1897887643, n4);
            }
            if (n3 == 3) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (-1897887643 * this.pixelsPerTile), -1897887643 * this.pixelsPerTile + (63 - n2) * (this.pixelsPerTile * -1897887643) - 1, -1897887643 * this.pixelsPerTile, n4);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bt(" + ')');
        }
    }
    
    public static boolean ws(final WorldMapRegion worldMapRegion, final AbstractArchive abstractArchive, final short n) {
        if (worldMapRegion == null) {
            worldMapRegion.loadGeography(abstractArchive, n);
        }
        try {
            worldMapRegion.iconMap.clear();
            if (null == worldMapRegion.worldMapData_0) {
                boolean b = true;
                final Iterator iterator = worldMapRegion.worldMapData1List.iterator();
                while (iterator.hasNext()) {
                    if (n <= 1400) {
                        throw new IllegalStateException();
                    }
                    final WorldMapData_1 worldMapData_1 = iterator.next();
                    worldMapData_1.ap(abstractArchive, (byte)19);
                    b &= worldMapData_1.ae(-1355381698);
                }
                if (b) {
                    if (n <= 1400) {
                        throw new IllegalStateException();
                    }
                    final Iterator iterator2 = worldMapRegion.worldMapData1List.iterator();
                    while (iterator2.hasNext()) {
                        if (n <= 1400) {
                            throw new IllegalStateException();
                        }
                        final WorldMapData_1 worldMapData_2 = iterator2.next();
                        worldMapRegion.getIconsForTiles(worldMapData_2.getChunkX((byte)57) * 8, worldMapData_2.getChunkY((short)(-12865)) * 8, 8, 8, worldMapData_2, -442915873);
                    }
                }
                return b;
            }
            if (n <= 1400) {
                throw new IllegalStateException();
            }
            worldMapRegion.worldMapData_0.ap(abstractArchive, (byte)97);
            if (!worldMapRegion.worldMapData_0.ae(-556860665)) {
                return false;
            }
            if (n <= 1400) {
                throw new IllegalStateException();
            }
            worldMapRegion.getIconsForTiles(0, 0, 64, 64, worldMapRegion.worldMapData_0, 791967957);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ao(" + ')');
        }
    }
    
    List ds(final int n, final int n2, final int n3, final int n4, final int n5) {
        final LinkedList<AbstractWorldMapIcon> list = new LinkedList<AbstractWorldMapIcon>();
        if (n4 < n || n5 < n2) {
            return list;
        }
        if (n4 < n + n3 && n5 < n3 + n2) {
            for (final AbstractWorldMapIcon e : this.iconMap.values()) {
                if (e.hasValidElement(460803296) && e.fitsScreen(n4, n5, (byte)(-35))) {
                    list.add(e);
                }
            }
            for (final AbstractWorldMapIcon e2 : this.icon0List) {
                if (e2.hasValidElement(-28058570) && e2.fitsScreen(n4, n5, (byte)(-59))) {
                    list.add(e2);
                }
            }
            return list;
        }
        return list;
    }
    
    void bc(final HashSet set, final List list) {
        this.iconMap.clear();
        for (final WorldMapData_1 e : set) {
            if (AbstractWorldMapData.tl(e, 892082894) == this.regionX * -2122501643 && e.bx(1719943073) == 1858063995 * this.regionY) {
                this.worldMapData1List.add(e);
            }
        }
        method1434(this, list, (short)19829);
    }
    
    static SpritePixels br(final int n, final int n2, final int n3) {
        return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(BuddyRankComparator.compareBuddy(n, n2, n3, -2097495790));
    }
    
    void ci(final ObjectComposition objectComposition, final int n, final int n2, final int n3, final AbstractWorldMapData abstractWorldMapData) {
        final Coord coord = new Coord(n, this.regionX * -86171401 + n2, -1969300816 * this.regionY + n3);
        Coord coord2;
        if (null != this.worldMapData_0) {
            coord2 = new Coord(this.worldMapData_0.at * 1615088237 + n, n2 + this.worldMapData_0.au * 1652387696, 763222976 * this.worldMapData_0.ab + n3);
        }
        else {
            final WorldMapData_1 worldMapData_1 = (WorldMapData_1)abstractWorldMapData;
            coord2 = new Coord(n + worldMapData_1.at * 1615088237, n2 + 1684617255 * worldMapData_1.au + WorldMapData_1.mv(worldMapData_1, -1881173832) * 8, worldMapData_1.ab * 1921794220 + n3 + WorldMapData_1.ib(worldMapData_1, 1253252409) * 8);
        }
        AbstractWorldMapIcon value;
        if (objectComposition.soundEffectIds != null) {
            value = new WorldMapIcon_1(coord2, coord, -1529817365 * objectComposition.id, this);
        }
        else {
            final WorldMapElement method1935 = class354.method1935(1270945427 * objectComposition.mapIconId, 2029449514);
            value = new WorldMapIcon_0(coord2, coord, method1935.objectId * 219774827, this.createMapLabel(method1935, 202686549));
        }
        if (class354.method1935(value.getElement(-557324366), 2132649137).field1489) {
            this.iconMap.put(new Coord(0, n2, n3), value);
        }
    }
    
    void drawTileGround(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler, final WorldMapSprite worldMapSprite, final int n3) {
        try {
            final int n4 = abstractWorldMapData.floorOverlayIds[0][n][n2] - 1;
            final int n5 = abstractWorldMapData.floorUnderlayIds[0][n][n2] - 1;
            if (n4 == -1) {
                if (n3 >= -1536899763) {
                    return;
                }
                if (n5 == -1) {
                    Rasterizer2D.ge(-1897887643 * this.backgroundColor * n, (63 - n2) * (this.regionY * -1897887643), -1897887643 * this.regionX, this.regionY * -1897887643, this.regionY * 973203971);
                }
            }
            int n6 = 16711935;
            if (n5 != -1) {
                if (n3 >= -1536899763) {
                    return;
                }
                final int n7 = 973203971 * this.pixelsPerTile;
                final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n5);
                FloorOverlayDefinition floorOverlayDefinition2;
                if (floorOverlayDefinition != null) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    floorOverlayDefinition2 = floorOverlayDefinition;
                }
                else {
                    final byte[] takeFile = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n5, (byte)(-13));
                    final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                    if (null != takeFile) {
                        floorOverlayDefinition3.decode(new Buffer(takeFile), n5, (short)128);
                    }
                    floorOverlayDefinition3.postDecode(-378972580);
                    FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n5);
                    floorOverlayDefinition2 = floorOverlayDefinition3;
                }
                final FloorOverlayDefinition floorOverlayDefinition4 = floorOverlayDefinition2;
                int n8;
                if (floorOverlayDefinition4 == null) {
                    if (n3 >= -1536899763) {
                        return;
                    }
                    n8 = n7;
                }
                else if (-2085280195 * floorOverlayDefinition4.hue >= 0) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    final int n9 = -187777599 * floorOverlayDefinition4.saturation;
                    int n10 = floorOverlayDefinition4.lightness * 1797179473;
                    final int n11 = -1379609783 * floorOverlayDefinition4.lightness;
                    if (n11 > 179) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n10 /= 2;
                    }
                    if (n11 > 192) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n10 /= 2;
                    }
                    if (n11 > 217) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n10 /= 2;
                    }
                    if (n11 > 243) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n10 /= 2;
                    }
                    n8 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615((n10 / 32 << 7) + (n9 / 4 << 10) + n11 / 2, 96, 2039313596)] | 0xFF000000);
                }
                else if (-202963991 * floorOverlayDefinition4.secondarySaturation >= 0) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    n8 = (Rasterizer3D.Rasterizer3D_cosine[class97.method615(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(floorOverlayDefinition4.hue * -202963991, 2087935623), 96, 1166097859)] | 0xFF000000);
                }
                else if (floorOverlayDefinition4.lightness * 1889574527 == 16711935) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    n8 = n7;
                }
                else {
                    final int n12 = floorOverlayDefinition4.hue * 174415927;
                    int n13 = 470803713 * floorOverlayDefinition4.texture;
                    final int n14 = 532980473 * floorOverlayDefinition4.secondaryRgb;
                    if (n14 > 179) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n13 /= 2;
                    }
                    if (n14 > 192) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n13 /= 2;
                    }
                    if (n14 > 217) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n13 /= 2;
                    }
                    if (n14 > 243) {
                        if (n3 >= -1536899763) {
                            throw new IllegalStateException();
                        }
                        n13 /= 2;
                    }
                    n8 = (Rasterizer3D.Rasterizer3D_sine[class97.method615((n12 / 4 << 10) + (n13 / 32 << 7) + n14 / 2, 96, 1910305875)] | 0xFF000000);
                }
                n6 = n8;
            }
            if (n5 > -1) {
                if (n3 >= -1536899763) {
                    throw new IllegalStateException();
                }
                if (0 == abstractWorldMapData.field2396[0][n][n2]) {
                    if (n3 >= -1536899763) {
                        throw new IllegalStateException();
                    }
                    Rasterizer2D.hj(-1897887643 * this.pixelsPerTile * n, this.regionX * -1897887643 * (63 - n2), -1897887643 * this.regionY, this.backgroundColor * -1897887643, n6);
                    return;
                }
            }
            final int method1450 = this.method1450(n, n2, abstractWorldMapData, worldMapSprite, 390149173);
            if (n5 != -1) {
                WorldMapScaleHandler.ru(worldMapScaleHandler, n * (-1897887643 * this.regionX), this.regionY * -1897887643 * (63 - n2), method1450, n6, this.regionY * -1897887643, this.regionY * -1897887643, abstractWorldMapData.field2396[0][n][n2], abstractWorldMapData.field2390[0][n][n2], 1823196120);
                return;
            }
            if (n3 >= -1536899763) {
                return;
            }
            Rasterizer2D.hi(n * (-1897887643 * this.backgroundColor), (63 - n2) * (-1897887643 * this.regionX), this.pixelsPerTile * -1897887643, -1897887643 * this.backgroundColor, method1450);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.am(" + ')');
        }
    }
    
    void getIcon(final ObjectComposition objectComposition, final int n, final int n2, final int n3, final AbstractWorldMapData abstractWorldMapData, final int n4) {
        try {
            final Coord coord = new Coord(n, this.regionX * 1598848320 + n2, -1342988608 * this.regionY + n3);
            Coord coord2;
            if (null != this.worldMapData_0) {
                if (n4 == -1086551379) {
                    throw new IllegalStateException();
                }
                coord2 = new Coord(this.worldMapData_0.at * 1615088237 + n, n2 + this.worldMapData_0.au * 518961216, 763222976 * this.worldMapData_0.ab + n3);
            }
            else {
                final WorldMapData_1 worldMapData_1 = (WorldMapData_1)abstractWorldMapData;
                coord2 = new Coord(n + worldMapData_1.at * 1615088237, n2 + 518961216 * worldMapData_1.au + WorldMapData_1.mv(worldMapData_1, -907307158) * 8, worldMapData_1.ab * 763222976 + n3 + WorldMapData_1.ib(worldMapData_1, 652823069) * 8);
            }
            AbstractWorldMapIcon value;
            if (objectComposition.soundEffectIds != null) {
                if (n4 == -1086551379) {
                    throw new IllegalStateException();
                }
                value = new WorldMapIcon_1(coord2, coord, -1529817365 * objectComposition.id, this);
            }
            else {
                final WorldMapElement method1935 = class354.method1935(1270945427 * objectComposition.mapIconId, 2025341780);
                value = new WorldMapIcon_0(coord2, coord, method1935.objectId * 219774827, this.createMapLabel(method1935, -1925842659));
            }
            if (class354.method1935(value.getElement(-1645609936), 1835538080).field1489) {
                if (n4 == -1086551379) {
                    throw new IllegalStateException();
                }
                this.iconMap.put(new Coord(0, n2, n3), value);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.al(" + ')');
        }
    }
    
    List et() {
        final LinkedList list = new LinkedList();
        list.addAll(this.icon0List);
        list.addAll(this.iconMap.values());
        return list;
    }
    
    boolean cu(final AbstractArchive abstractArchive) {
        this.iconMap.clear();
        if (null == this.worldMapData_0) {
            boolean b = true;
            for (final WorldMapData_1 worldMapData_1 : this.worldMapData1List) {
                worldMapData_1.ap(abstractArchive, (byte)102);
                b &= worldMapData_1.ae(-1354088308);
            }
            if (b) {
                for (final WorldMapData_1 worldMapData_2 : this.worldMapData1List) {
                    this.getIconsForTiles(worldMapData_2.getChunkX((byte)57) * 8, worldMapData_2.getChunkY((short)400) * 8, 8, 8, worldMapData_2, 1177987412);
                }
            }
            return b;
        }
        this.worldMapData_0.ap(abstractArchive, (byte)103);
        if (this.worldMapData_0.ae(-1217912395)) {
            this.getIconsForTiles(0, 0, -1606645517, 64, this.worldMapData_0, -1939271280);
            return true;
        }
        return false;
    }
    
    void dm(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final IndexedSprite[] array) {
        for (int i = 0; i < 1632558421 * abstractWorldMapData.planes; ++i) {
            final WorldMapDecoration[] array2 = abstractWorldMapData.decorations[i][n][n2];
            if (null != array2) {
                if (array2.length != 0) {
                    final WorldMapDecoration[] array3 = array2;
                    for (int j = 0; j < array3.length; ++j) {
                        final WorldMapDecoration worldMapDecoration = array3[j];
                        if (ItemLayer.method1182(worldMapDecoration.decoration * 1504481025, -2123819909) || -1344801027 * WorldMapDecorationType.field3066.id == worldMapDecoration.decoration * 1504481025) {
                            final ObjectComposition vmethod3248 = class144.vmethod3248(2080162465 * worldMapDecoration.objectDefinitionId, (short)6667);
                            if (-1 != 771086195 * vmethod3248.mapSceneId) {
                                if (771086195 * vmethod3248.mapSceneId != 46 && vmethod3248.mapSceneId * 771086195 != 52) {
                                    array[771086195 * vmethod3248.mapSceneId].method2596(n * (-1897887643 * this.pixelsPerTile), this.pixelsPerTile * -1897887643 * (63 - n2), 499192010 * this.pixelsPerTile, 499192010 * this.pixelsPerTile);
                                }
                                else {
                                    array[vmethod3248.mapSceneId * 771086195].method2596(n * (-1897887643 * this.pixelsPerTile), -1897887643 * this.pixelsPerTile * (63 - n2), 499192010 * this.pixelsPerTile + 1, 499192010 * this.pixelsPerTile + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    void method1435(final int n, final int n2, final int n3, final byte b) {
        try {
            final SpritePixels decode = VarpDefinition.decode(-2122501643 * this.regionX, 1858063995 * this.regionY, this.pixelsPerTile * -1897887643, 1906592458);
            if (decode != null) {
                if (this.pixelsPerTile * -1205724864 == n3) {
                    if (b <= 3) {
                        throw new IllegalStateException();
                    }
                    decode.ca(n, n2);
                }
                else {
                    decode.drawScaledWorldmap(n, n2, n3, n3);
                }
                return;
            }
            if (b <= 3) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ac(" + ')');
        }
    }
    
    void bq(final int n, final int n2, final int n3) {
        final SpritePixels decode = VarpDefinition.decode(-2122501643 * this.regionX, 1858063995 * this.regionY, this.pixelsPerTile * -1897887643, 2047100321);
        if (decode == null) {
            return;
        }
        if (this.pixelsPerTile * -1205724864 == n3) {
            decode.ca(n, n2);
        }
        else {
            decode.drawScaledWorldmap(n, n2, n3, n3);
        }
    }
    
    void dk(final int n, final int n2, final HashSet set, final int n3) {
        final float n4 = n3 / 64.0f;
        final float n5 = n4 / 2.0f;
        for (final Map.Entry<Coord, V> entry : this.iconMap.entrySet()) {
            final Coord coord = entry.getKey();
            final int n6 = (int)(n + coord.x * -96298701 * n4 - n5);
            final int n7 = (int)(n2 + n3 - -2105445199 * coord.y * n4 - n5);
            final AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)entry.getValue();
            if (null != abstractWorldMapIcon && abstractWorldMapIcon.hasValidElement(1541533482)) {
                abstractWorldMapIcon.screenX = -1370053935 * n6;
                abstractWorldMapIcon.screenY = 1379111171 * n7;
                if (set.contains(class354.method1935(abstractWorldMapIcon.getElement(-1633090773), 1844223186).getObjectId(-1797658421))) {
                    continue;
                }
                to(this, abstractWorldMapIcon, n6, n7, n4, (byte)28);
            }
        }
    }
    
    void do(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData) {
        for (int i = 0; i < abstractWorldMapData.planes * 1632558421; ++i) {
            final WorldMapDecoration[] array = abstractWorldMapData.decorations[i][n][n2];
            if (array != null) {
                if (array.length != 0) {
                    final WorldMapDecoration[] array2 = array;
                    for (int j = 0; j < array2.length; ++j) {
                        final WorldMapDecoration worldMapDecoration = array2[j];
                        final int n3 = -457361361 * worldMapDecoration.decoration;
                        if ((n3 >= WorldMapDecorationType.field3047.id * 836438036 && n3 <= WorldMapDecorationType.field3050.id * 1507932452) || 1102011564 * WorldMapDecorationType.field3048.id == n3) {
                            final int n4 = (class144.vmethod3248(2090192207 * worldMapDecoration.objectDefinitionId, (short)26645).int1 * 415653149 != 0) ? -3407872 : -1738021609;
                            if (WorldMapDecorationType.field3047.id * 487262371 == 1128944903 * worldMapDecoration.decoration) {
                                this.method1455(n, n2, -1419490017 * worldMapDecoration.rotation, n4, (byte)0);
                            }
                            if (-1344801027 * WorldMapDecorationType.field3046.id == -1226350886 * worldMapDecoration.decoration) {
                                this.method1455(n, n2, worldMapDecoration.rotation * -1419490017, -3355444, (byte)0);
                                this.method1455(n, n2, worldMapDecoration.rotation * 133875660 + 1, n4, (byte)0);
                            }
                            if (WorldMapDecorationType.field3050.id * -1344801027 == 1504481025 * worldMapDecoration.decoration) {
                                if (worldMapDecoration.rotation * -1419490017 == 0) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -394945980 * n, (63 - n2) * (118410509 * this.pixelsPerTile), 1, n4);
                                }
                                if (1 == -783944815 * worldMapDecoration.rotation) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -1897887643 * n + this.pixelsPerTile * 660467138 - 1, (63 - n2) * (this.pixelsPerTile * -1758281416), 1, n4);
                                }
                                if (2 == worldMapDecoration.rotation * 2040258146) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (this.pixelsPerTile * -2143410227) + 1574920246 * this.pixelsPerTile - 1, (-1352302164 - n2) * (1750459345 * this.pixelsPerTile) + -1897887643 * this.pixelsPerTile - 1, 1, n4);
                                }
                                if (3 == -1419490017 * worldMapDecoration.rotation) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(-1897887643 * this.pixelsPerTile * n, (624982886 - n2) * (this.pixelsPerTile * -97760155) + this.pixelsPerTile * -1757484138 - 1, 1, n4);
                                }
                            }
                            if (-1344801027 * WorldMapDecorationType.field3048.id == 1504481025 * worldMapDecoration.decoration) {
                                if (-1419490017 * worldMapDecoration.rotation % 2 == 0) {
                                    for (int k = 0; k < this.pixelsPerTile * -1897887643; ++k) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * -1897887643 * n + k, (206141534 - n2) * (-1897887643 * this.pixelsPerTile) - 1 - k, 1, n4);
                                    }
                                }
                                else {
                                    for (int l = 0; l < -1897887643 * this.pixelsPerTile; ++l) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (-1897887643 * this.pixelsPerTile) + l, l + -1627119932 * this.pixelsPerTile * (-1807005285 - n2), 1, n4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    void dz(final WorldMapElement worldMapElement, final int n, final int n2, final int n3, final int n4) {
        final SpritePixels spriteBool = worldMapElement.getSpriteBool(false, -16711936);
        if (spriteBool == null) {
            return;
        }
        spriteBool.drawAt(n - spriteBool.subWidth / 2, n2 - spriteBool.subHeight / 2);
        if (n3 % n4 < n4 / 2) {
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(n, n2, 15, 16776960, -244846401);
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(n, n2, 7, 349242982, 256);
        }
    }
    
    void de(final AbstractWorldMapIcon abstractWorldMapIcon, final int n, final int n2, final float n3) {
        final WorldMapElement method1935 = class354.method1935(abstractWorldMapIcon.getElement(-1325143425), 1928816114);
        this.method1463(method1935, n, n2, (byte)0);
        this.method1456(abstractWorldMapIcon, method1935, n, n2, n3, (byte)8);
    }
    
    static void initWorldMapData0(final int n, final int n2) {
        try {
            final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
            if (itemContainer == null) {
                return;
            }
            for (int i = 0; i < itemContainer.quantities.length; ++i) {
                if (n2 != -28927295) {
                    throw new IllegalStateException();
                }
                itemContainer.quantities[i] = -1;
                itemContainer.ids[i] = 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.au(" + ')');
        }
    }
    
    void initWorldMapData0(final WorldMapData_0 worldMapData_0, final List list, final int n) {
        try {
            this.iconMap.clear();
            this.worldMapData_0 = worldMapData_0;
            method1434(this, list, (short)10781);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.au(" + ')');
        }
    }
    
    void addAllToIconList(final List list, final short n) {
        try {
            final Iterator<WorldMapIcon_0> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (n <= 255) {
                    throw new IllegalStateException();
                }
                final WorldMapIcon_0 worldMapIcon_0 = iterator.next();
                if (!class354.method1935(1767565411 * worldMapIcon_0.subHeight, 1893418018).field1491) {
                    continue;
                }
                if (worldMapIcon_0.aq.plane * -96298701 >> 6 != this.backgroundColor * -2122501643) {
                    continue;
                }
                if (n <= 255) {
                    throw new IllegalStateException();
                }
                if (this.pixelsPerTile * 1858063995 != -2105445199 * worldMapIcon_0.coord1.y >> 6) {
                    continue;
                }
                if (n <= 255) {
                    return;
                }
                this.icon0List.add(new WorldMapIcon_0(worldMapIcon_0.coord1, worldMapIcon_0.aq, worldMapIcon_0.subWidth * 1767565411, this.method1457(worldMapIcon_0.subHeight * 1767565411, -1151256626)));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.aa(" + ')');
        }
    }
    
    void method1444(final int n, final int n2, final int n3, HashSet set, final byte b) {
        try {
            if (null == set) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                set = new HashSet();
            }
            this.drawMapLinks(n, n2, set, n3, -1769642683);
            this.drawNonLinkMapIcons(n, n2, set, n3, -2097457957);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ai(" + ')');
        }
    }
    
    int dx(final SpritePixels spritePixels, final VerticalAlignment verticalAlignment) {
        switch (verticalAlignment.value * 578864459) {
            case 2: {
                return 0;
            }
            default: {
                return -spritePixels.subHeight;
            }
            case 1: {
                return -spritePixels.subHeight / 2;
            }
        }
    }
    
    void bh(final int n, final int n2, final int n3, final int n4, final AbstractWorldMapData abstractWorldMapData) {
        for (int i = n; i < n3 + n; ++i) {
        Label_0015:
            for (int j = n2; j < n4 + n2; ++j) {
                for (int k = 0; k < abstractWorldMapData.planes * 867393305; ++k) {
                    final WorldMapDecoration[] array = abstractWorldMapData.decorations[k][i][j];
                    if (null != array) {
                        if (0 != array.length) {
                            final WorldMapDecoration[] array2 = array;
                            for (int l = 0; l < array2.length; ++l) {
                                final ObjectComposition vmethod3248 = class144.vmethod3248(array2[l].objectDefinitionId * 2080162465, (short)32559);
                                int n6 = 0;
                                Label_0239: {
                                    if (null != vmethod3248.soundEffectIds) {
                                        final int[] soundEffectIds = vmethod3248.soundEffectIds;
                                        for (int n5 = 0; n5 < soundEffectIds.length; ++n5) {
                                            if (-147580716 * class144.vmethod3248(soundEffectIds[n5], (short)7351).mapIconId != -1) {
                                                n6 = 1;
                                                break Label_0239;
                                            }
                                        }
                                    }
                                    else if (-486863019 * vmethod3248.mapIconId != -1) {
                                        n6 = 1;
                                        break Label_0239;
                                    }
                                    n6 = 0;
                                }
                                if (n6 != 0) {
                                    this.getIcon(vmethod3248, k, i, j, abstractWorldMapData, 1208276385);
                                    continue Label_0015;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    void method1454(final AbstractWorldMapIcon abstractWorldMapIcon, final int n, final int n2, final float n3, final byte b) {
        try {
            final WorldMapElement method1935 = class354.method1935(abstractWorldMapIcon.getElement(-1416808168), 1865972483);
            this.method1463(method1935, n, n2, (byte)0);
            this.method1456(abstractWorldMapIcon, method1935, n, n2, n3, (byte)8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.by(" + ')');
        }
    }
    
    int method1449(final SpritePixels spritePixels, final VerticalAlignment verticalAlignment, final int n) {
        try {
            switch (verticalAlignment.value * 578864459) {
                case 1: {
                    return -spritePixels.subHeight / 2;
                }
                default: {
                    return -spritePixels.subHeight;
                }
                case 2: {
                    return 0;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bx(" + ')');
        }
    }
    
    void method1447(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final int n3) {
        try {
            wr(this, n, n2, abstractWorldMapData, -1855512856);
            this.method1464(n, n2, abstractWorldMapData, array, -926949025);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ar(" + ')');
        }
    }
    
    void drawBackgroundCircle(final WorldMapElement worldMapElement, final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            final SpritePixels spriteBool = worldMapElement.getSpriteBool(false, -16711936);
            if (spriteBool != null) {
                spriteBool.drawAt(n - spriteBool.subWidth / 2, n2 - spriteBool.subHeight / 2);
                if (n3 % n4 < n4 / 2) {
                    Rasterizer2D.Rasterizer2D_drawCircleAlpha(n, n2, 15, 16776960, 128);
                    Rasterizer2D.Rasterizer2D_drawCircleAlpha(n, n2, 7, 16777215, 256);
                }
                return;
            }
            if (n5 >= -401572388) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ap(" + ')');
        }
    }
    
    List icons(final byte b) {
        try {
            final LinkedList list = new LinkedList();
            list.addAll(this.icon0List);
            list.addAll(this.iconMap.values());
            return list;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bd(" + ')');
        }
    }
    
    static SpritePixels bg(final int n, final int n2, final int n3) {
        return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(BuddyRankComparator.compareBuddy(n, n2, n3, -1790263875));
    }
    
    public static void iy(final WorldMapRegion worldMapRegion, final HashSet set, final int n, final int n2, final int n3) {
        if (worldMapRegion == null) {
            worldMapRegion.flashElements(set, n, n, n);
            return;
        }
        try {
            final Iterator<AbstractWorldMapIcon> iterator = worldMapRegion.iconMap.values().iterator();
            while (iterator.hasNext()) {
                if (n3 >= -1386616521) {
                    throw new IllegalStateException();
                }
                final AbstractWorldMapIcon abstractWorldMapIcon = iterator.next();
                if (!abstractWorldMapIcon.hasValidElement(-462313720)) {
                    if (n3 >= -1386616521) {
                        throw new IllegalStateException();
                    }
                    continue;
                }
                else {
                    final int element = abstractWorldMapIcon.getElement(-582837628);
                    if (!set.contains(element)) {
                        continue;
                    }
                    worldMapRegion.drawBackgroundCircle(class354.method1935(element, 2097191218), abstractWorldMapIcon.screenX * -216598991, abstractWorldMapIcon.screenY * -1288412757, n, n2, -1649381751);
                }
            }
            worldMapRegion.method1434(set, n, n2, (short)20836);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ag(" + ')');
        }
    }
    
    void cg(final HashSet set, final int n, final int n2) {
        for (final AbstractWorldMapIcon abstractWorldMapIcon : this.iconMap.values()) {
            if (!abstractWorldMapIcon.hasValidElement(-1091464948)) {
                continue;
            }
            final int element = abstractWorldMapIcon.getElement(-1483890517);
            if (!set.contains(element)) {
                continue;
            }
            this.drawBackgroundCircle(class354.method1935(element, 1988039478), abstractWorldMapIcon.screenX * -216598991, abstractWorldMapIcon.screenY * -1288412757, n, n2, -1413544553);
        }
        this.method1434(set, n, n2, (short)30528);
    }
    
    void co(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array) {
        wr(this, n, n2, abstractWorldMapData, 620926451);
        this.method1464(n, n2, abstractWorldMapData, array, -926949025);
    }
    
    void cy(final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final WorldMapSprite worldMapSprite) {
        for (int i = 0; i < 64; ++i) {
            for (int j = 0; j < 64; ++j) {
                dn(this, i, j, this.worldMapData_0, worldMapScaleHandler, worldMapSprite, -1999084852);
                this.method1467(i, j, this.worldMapData_0, worldMapScaleHandler, 1808367775);
            }
        }
        for (int k = 0; k < 64; ++k) {
            for (int l = 0; l < 64; ++l) {
                ud(this, k, l, this.worldMapData_0, worldMapScaleHandler, array, -2146885907);
            }
        }
    }
    
    static long bn(final int n, final int n2, final int n3) {
        return n3 << 16 | n << 8 | n2;
    }
    
    void cz(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapScaleHandler worldMapScaleHandler, final WorldMapSprite worldMapSprite) {
        final int n3 = abstractWorldMapData.floorUnderlayIds[0][n][n2] - 1;
        final int n4 = abstractWorldMapData.floorOverlayIds[0][n][n2] - 1;
        if (n3 == -1 && n4 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(-1897887643 * this.pixelsPerTile * n, (63 - n2) * (this.pixelsPerTile * -1897887643), -1897887643 * this.pixelsPerTile, this.pixelsPerTile * -1897887643, this.backgroundColor * 973203971);
        }
        int n5 = 16711935;
        if (n4 != -1) {
            final int n6 = 973203971 * this.backgroundColor;
            final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n4);
            FloorOverlayDefinition floorOverlayDefinition2;
            if (floorOverlayDefinition != null) {
                floorOverlayDefinition2 = floorOverlayDefinition;
            }
            else {
                final byte[] takeFile = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n4, (byte)(-116));
                final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                if (null != takeFile) {
                    floorOverlayDefinition3.decode(new Buffer(takeFile), n4, (short)128);
                }
                floorOverlayDefinition3.postDecode(-765355122);
                FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n4);
                floorOverlayDefinition2 = floorOverlayDefinition3;
            }
            final FloorOverlayDefinition floorOverlayDefinition4 = floorOverlayDefinition2;
            int n7;
            if (floorOverlayDefinition4 == null) {
                n7 = n6;
            }
            else if (-2085280195 * floorOverlayDefinition4.secondaryRgb >= 0) {
                final int n8 = -187777599 * floorOverlayDefinition4.secondaryHue;
                int n9 = floorOverlayDefinition4.secondarySaturation * 1797179473;
                final int n10 = -1379609783 * floorOverlayDefinition4.secondaryLightness;
                if (n10 > 179) {
                    n9 /= 2;
                }
                if (n10 > 192) {
                    n9 /= 2;
                }
                if (n10 > 217) {
                    n9 /= 2;
                }
                if (n10 > 243) {
                    n9 /= 2;
                }
                n7 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615((n9 / 32 << 7) + (n8 / 4 << 10) + n10 / 2, 96, 1240026183)] | 0xFF000000);
            }
            else if (-202963991 * floorOverlayDefinition4.texture >= 0) {
                n7 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(floorOverlayDefinition4.texture * -202963991, 2052330882), 96, 1128320712)] | 0xFF000000);
            }
            else if (floorOverlayDefinition4.primaryRgb * 1889574527 == 16711935) {
                n7 = n6;
            }
            else {
                final int n11 = floorOverlayDefinition4.hue * 174415927;
                int n12 = 470803713 * floorOverlayDefinition4.saturation;
                final int n13 = 532980473 * floorOverlayDefinition4.lightness;
                if (n13 > 179) {
                    n12 /= 2;
                }
                if (n13 > 192) {
                    n12 /= 2;
                }
                if (n13 > 217) {
                    n12 /= 2;
                }
                if (n13 > 243) {
                    n12 /= 2;
                }
                n7 = (Rasterizer3D.Rasterizer3D_colorPalette[class97.method615((n11 / 4 << 10) + (n12 / 32 << 7) + n13 / 2, 96, 921079749)] | 0xFF000000);
            }
            n5 = n7;
        }
        if (n4 > -1 && 0 == abstractWorldMapData.field2390[0][n][n2]) {
            Rasterizer2D.Rasterizer2D_fillRectangle(-1897887643 * this.pixelsPerTile * n, this.pixelsPerTile * -1897887643 * (63 - n2), -1897887643 * this.pixelsPerTile, this.pixelsPerTile * -1897887643, n5);
            return;
        }
        final int method1450 = this.method1450(n, n2, abstractWorldMapData, worldMapSprite, 390149173);
        if (n4 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(n * (-1897887643 * this.pixelsPerTile), (63 - n2) * (-1897887643 * this.pixelsPerTile), this.pixelsPerTile * -1897887643, -1897887643 * this.pixelsPerTile, method1450);
            return;
        }
        WorldMapScaleHandler.ru(worldMapScaleHandler, n * (-1897887643 * this.pixelsPerTile), this.pixelsPerTile * -1897887643 * (63 - n2), method1450, n5, this.pixelsPerTile * -1897887643, this.pixelsPerTile * -1897887643, abstractWorldMapData.field2390[0][n][n2], abstractWorldMapData.field2396[0][n][n2], -914319260);
    }
    
    public static List wb(final WorldMapRegion worldMapRegion, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (worldMapRegion == null) {
            worldMapRegion.et();
        }
        final LinkedList<AbstractWorldMapIcon> list = new LinkedList<AbstractWorldMapIcon>();
        if (n4 < n || n5 < n2) {
            return list;
        }
        if (n4 < n + n3 && n5 < n3 + n2) {
            for (final AbstractWorldMapIcon e : worldMapRegion.iconMap.values()) {
                if (e.hasValidElement(421338917) && e.fitsScreen(n4, n5, (byte)(-76))) {
                    list.add(e);
                }
            }
            for (final AbstractWorldMapIcon e2 : worldMapRegion.icon0List) {
                if (e2.hasValidElement(1408338258) && e2.fitsScreen(n4, n5, (byte)(-96))) {
                    list.add(e2);
                }
            }
            return list;
        }
        return list;
    }
    
    void initWorldMapData1(final HashSet set, final List list, final int n) {
        try {
            this.iconMap.clear();
            final Iterator<WorldMapData_1> iterator = set.iterator();
            while (iterator.hasNext()) {
                if (n == 143437147) {
                    throw new IllegalStateException();
                }
                final WorldMapData_1 e = iterator.next();
                if (AbstractWorldMapData.tl(e, 790722291) != this.regionX * -2122501643) {
                    continue;
                }
                if (n == 143437147) {
                    return;
                }
                if (e.bx(2104723155) != 1858063995 * this.regionY) {
                    continue;
                }
                this.worldMapData1List.add(e);
            }
            method1434(this, list, (short)1710);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ab(" + ')');
        }
    }
    
    void getIconsForTiles(final int n, final int n2, final int n3, final int n4, final AbstractWorldMapData abstractWorldMapData, final int n5) {
        try {
            for (int i = n; i < n3 + n; ++i) {
                if (n5 >= 1283536030) {
                    return;
                }
            Label_0393:
                for (int j = n2; j < n4 + n2; ++j) {
                    if (n5 >= 1283536030) {
                        throw new IllegalStateException();
                    }
                    for (int k = 0; k < abstractWorldMapData.planes * 1632558421; ++k) {
                        if (n5 >= 1283536030) {
                            return;
                        }
                        final WorldMapDecoration[] array = abstractWorldMapData.decorations[k][i][j];
                        if (null != array) {
                            if (n5 >= 1283536030) {
                                throw new IllegalStateException();
                            }
                            if (0 == array.length) {
                                if (n5 >= 1283536030) {
                                    throw new IllegalStateException();
                                }
                            }
                            else {
                                final WorldMapDecoration[] array2 = array;
                                int l = 0;
                            Label_0340_Outer:
                                while (l < array2.length) {
                                    if (n5 >= 1283536030) {
                                        throw new IllegalStateException();
                                    }
                                    final ObjectComposition vmethod3248 = class144.vmethod3248(array2[l].objectDefinitionId * 2080162465, (short)13848);
                                Label_0340:
                                    while (true) {
                                        Label_0361: {
                                            if (null != vmethod3248.soundEffectIds) {
                                                final int[] soundEffectIds = vmethod3248.soundEffectIds;
                                                for (int n6 = 0; n6 < soundEffectIds.length; ++n6) {
                                                    if (n5 >= 1283536030) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (1270945427 * class144.vmethod3248(soundEffectIds[n6], (short)4463).mapIconId != -1) {
                                                        final int n7 = 1;
                                                        break Label_0340;
                                                    }
                                                }
                                                break Label_0361;
                                            }
                                            if (1270945427 * vmethod3248.mapIconId == -1) {
                                                break Label_0361;
                                            }
                                            if (n5 >= 1283536030) {
                                                throw new IllegalStateException();
                                            }
                                            final int n7 = 1;
                                            if (n7 != 0) {
                                                this.getIcon(vmethod3248, k, i, j, abstractWorldMapData, 881675685);
                                                continue Label_0393;
                                            }
                                            if (n5 >= 1283536030) {
                                                throw new IllegalStateException();
                                            }
                                            ++l;
                                            continue Label_0340_Outer;
                                        }
                                        final int n7 = 0;
                                        continue Label_0340;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.aq(" + ')');
        }
    }
    
    int method1450(final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapSprite worldMapSprite, final int n3) {
        try {
            if (0 == abstractWorldMapData.floorUnderlayIds[0][n][n2]) {
                return this.backgroundColor * 973203971;
            }
            return worldMapSprite.getTileColor(n, n2, 222072056);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.aj(" + ')');
        }
    }
    
    void flashElements(final HashSet set, final int n, final int n2, final int n3) {
        try {
            final Iterator<AbstractWorldMapIcon> iterator = this.iconMap.values().iterator();
            while (iterator.hasNext()) {
                if (n3 >= -1386616521) {
                    throw new IllegalStateException();
                }
                final AbstractWorldMapIcon abstractWorldMapIcon = iterator.next();
                if (!abstractWorldMapIcon.hasValidElement(-462313720)) {
                    if (n3 >= -1386616521) {
                        throw new IllegalStateException();
                    }
                    continue;
                }
                else {
                    final int element = abstractWorldMapIcon.getElement(-582837628);
                    if (!set.contains(element)) {
                        continue;
                    }
                    this.drawBackgroundCircle(class354.method1935(element, 2097191218), abstractWorldMapIcon.screenX * -216598991, abstractWorldMapIcon.screenY * -1288412757, n, n2, -1649381751);
                }
            }
            this.method1434(set, n, n2, (short)20836);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ag(" + ')');
        }
    }
    
    void bl(final WorldMapData_0 worldMapData_0, final List list) {
        this.iconMap.clear();
        this.worldMapData_0 = worldMapData_0;
        method1434(this, list, (short)31857);
    }
    
    public static void ep(final WorldMapRegion worldMapRegion, final int n, final int n2, final int n3, final int n4, final AbstractWorldMapData abstractWorldMapData) {
        if (worldMapRegion == null) {
            worldMapRegion.cc();
        }
        for (int i = n; i < n3 + n; ++i) {
        Label_0295:
            for (int j = n2; j < n4 + n2; ++j) {
                for (int k = 0; k < abstractWorldMapData.planes * 1632558421; ++k) {
                    final WorldMapDecoration[] array = abstractWorldMapData.decorations[k][i][j];
                    if (null != array) {
                        if (0 != array.length) {
                            final WorldMapDecoration[] array2 = array;
                            for (int l = 0; l < array2.length; ++l) {
                                final ObjectComposition vmethod3248 = class144.vmethod3248(array2[l].objectDefinitionId * 2080162465, (short)10320);
                                int n6 = 0;
                                Label_0167: {
                                    if (null != vmethod3248.soundEffectIds) {
                                        final int[] soundEffectIds = vmethod3248.soundEffectIds;
                                        for (int n5 = 0; n5 < soundEffectIds.length; ++n5) {
                                            if (1270945427 * class144.vmethod3248(soundEffectIds[n5], (short)27756).mapIconId != -1) {
                                                n6 = 1;
                                                break Label_0167;
                                            }
                                        }
                                    }
                                    else if (1270945427 * vmethod3248.mapIconId != -1) {
                                        n6 = 1;
                                        break Label_0167;
                                    }
                                    n6 = 0;
                                }
                                if (n6 != 0) {
                                    worldMapRegion.getIcon(vmethod3248, k, i, j, abstractWorldMapData, -1453945783);
                                    continue Label_0295;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    void dg(final AbstractWorldMapIcon abstractWorldMapIcon, final int n, final int n2, final float n3) {
        final WorldMapElement method1935 = class354.method1935(abstractWorldMapIcon.getElement(-1645764334), 2002825764);
        this.method1463(method1935, n, n2, (byte)0);
        this.method1456(abstractWorldMapIcon, method1935, n, n2, n3, (byte)8);
    }
    
    WorldMapLabel createMapLabel(final WorldMapElement worldMapElement, final int n) {
        try {
            if (null != worldMapElement.name && this.fonts != null) {
                if (n == -442346035) {
                    throw new IllegalStateException();
                }
                if (this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
                    final WorldMapLabelSize method1395 = WorldMapLabelSize.method1395(952315347 * worldMapElement.textSize, 1545697832);
                    if (null == method1395) {
                        if (n == -442346035) {
                            throw new IllegalStateException();
                        }
                        return null;
                    }
                    else {
                        final Font font = this.fonts.get(method1395);
                        if (font != null) {
                            final String[] array = new String[class292.fo(font, worldMapElement.name, 1000000)];
                            AbstractFont.mk(font, worldMapElement.name, null, array);
                            final int n2 = array.length * font.al / 2;
                            int n3 = 0;
                            final String[] array2 = array;
                            for (int i = 0; i < array2.length; ++i) {
                                if (n == -442346035) {
                                    throw new IllegalStateException();
                                }
                                final int bf = font.bf(array2[i]);
                                if (bf > n3) {
                                    if (n == -442346035) {
                                        throw new IllegalStateException();
                                    }
                                    n3 = bf;
                                }
                            }
                            return new WorldMapLabel(worldMapElement.name, n3, n2, method1395);
                        }
                        if (n == -442346035) {
                            throw new IllegalStateException();
                        }
                        return null;
                    }
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bz(" + ')');
        }
    }
    
    public static void hq(final WorldMapRegion worldMapRegion, final int n, final int n2, final HashSet set, final int n3) {
        if (worldMapRegion == null) {
            worldMapRegion.cg(set, n, n);
        }
        final float n4 = n3 / 64.0f;
        for (final AbstractWorldMapIcon abstractWorldMapIcon : worldMapRegion.icon0List) {
            if (!abstractWorldMapIcon.hasValidElement(1874207690)) {
                continue;
            }
            final int n5 = abstractWorldMapIcon.coord2.x * -96298701 % 64;
            final int n6 = -1381060527 * abstractWorldMapIcon.coord2.y % -377071861;
            abstractWorldMapIcon.screenX = (int)(n4 * n5 + n) * 1593967405;
            abstractWorldMapIcon.screenY = (int)((63 - n6) * n4 + n2) * -217894002;
            if (set.contains(abstractWorldMapIcon.getElement(-152691293))) {
                continue;
            }
            to(worldMapRegion, abstractWorldMapIcon, abstractWorldMapIcon.screenX * -216598991, abstractWorldMapIcon.screenY * 1355885104, n4, (byte)113);
        }
    }
    
    public static void ww(final WorldMapRegion worldMapRegion, final AbstractWorldMapIcon abstractWorldMapIcon, final int n, final int n2, final float n3) {
        if (worldMapRegion == null) {
            worldMapRegion.method1441(n);
            return;
        }
        final WorldMapElement method1935 = class354.method1935(abstractWorldMapIcon.getElement(-285147009), 2112182749);
        worldMapRegion.method1463(method1935, n, n2, (byte)0);
        worldMapRegion.method1456(abstractWorldMapIcon, method1935, n, n2, n3, (byte)8);
    }
    
    public static void mj(final WorldMapRegion worldMapRegion, final int n, final int n2, final int n3, HashSet set, final byte b) {
        if (worldMapRegion == null) {
            worldMapRegion.method1444(n, n, n, set, b);
        }
        try {
            if (null == set) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                set = new HashSet();
            }
            worldMapRegion.drawNonLinkMapIcons(n, n2, set, n3, -1769642683);
            worldMapRegion.drawMapLinks(n, n2, set, n3, -2097457957);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ai(" + ')');
        }
    }
    
    public static void od(final WorldMapRegion worldMapRegion, final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final WorldMapSprite worldMapSprite) {
        if (worldMapRegion == null) {
            worldMapRegion.getMapIcons();
        }
        for (int i = 0; i < 64; ++i) {
            for (int j = 0; j < 64; ++j) {
                dn(worldMapRegion, i, j, worldMapRegion.worldMapData_0, worldMapScaleHandler, worldMapSprite, -1923427221);
                worldMapRegion.method1467(i, j, worldMapRegion.worldMapData_0, worldMapScaleHandler, 2015347906);
            }
        }
        for (int k = 0; k < 64; ++k) {
            for (int l = 0; l < 64; ++l) {
                ud(worldMapRegion, k, l, worldMapRegion.worldMapData_0, worldMapScaleHandler, array, -886909910);
            }
        }
    }
    
    static long bj(final int n, final int n2, final int n3) {
        return n3 << 16 | n << 8 | n2;
    }
    
    public static void dd(final WorldMapRegion worldMapRegion, final int n, final int n2, final HashSet set, final int n3) {
        if (worldMapRegion == null) {
            worldMapRegion.eo(n, n, n, n, n);
        }
        final float n4 = n3 / 64.0f;
        final float n5 = n4 / 2.0f;
        for (final Map.Entry<Coord, V> entry : worldMapRegion.iconMap.entrySet()) {
            final Coord coord = entry.getKey();
            final int n6 = (int)(n + coord.x * -96298701 * n4 - n5);
            final int n7 = (int)(n2 + n3 - -2105445199 * coord.y * n4 - n5);
            final AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)entry.getValue();
            if (null != abstractWorldMapIcon && abstractWorldMapIcon.hasValidElement(-338204267)) {
                abstractWorldMapIcon.screenX = -1370053935 * n6;
                abstractWorldMapIcon.screenY = 1379111171 * n7;
                if (set.contains(class354.method1935(abstractWorldMapIcon.getElement(-1100019989), 2059416318).getObjectId(-621841052))) {
                    continue;
                }
                to(worldMapRegion, abstractWorldMapIcon, n6, n7, n4, (byte)14);
            }
        }
    }
    
    int dd(final SpritePixels spritePixels, final HorizontalAlignment horizontalAlignment) {
        switch (horizontalAlignment.value * 1932346871) {
            case 0: {
                return 0;
            }
            case 2: {
                return -spritePixels.subWidth / 2;
            }
            default: {
                return -spritePixels.subWidth;
            }
        }
    }
    
    public Collection getMapIcons() {
        return Collections.unmodifiableCollection(this.cc().values());
    }
    
    public static int wj(final WorldMapRegion worldMapRegion, final int n, final int n2, final AbstractWorldMapData abstractWorldMapData, final WorldMapSprite worldMapSprite) {
        if (worldMapRegion == null) {
            worldMapRegion.cc();
        }
        if (0 == abstractWorldMapData.floorUnderlayIds[0][n][n2]) {
            return worldMapRegion.backgroundColor * 973203971;
        }
        return worldMapSprite.getTileColor(n, n2, 866678865);
    }
    
    void cq(final int n, final int n2, final int n3, HashSet set) {
        if (null == set) {
            set = new HashSet();
        }
        this.drawNonLinkMapIcons(n, n2, set, n3, -1769642683);
        this.drawMapLinks(n, n2, set, n3, -1902222937);
    }
    
    List method1468(final int n, final int n2, final int n3, final int n4, final int n5, final byte b) {
        try {
            final LinkedList<AbstractWorldMapIcon> list = new LinkedList<AbstractWorldMapIcon>();
            if (n4 >= n && n5 >= n2) {
                if (n4 < n + n3) {
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                    if (n5 < n3 + n2) {
                        final Iterator<AbstractWorldMapIcon> iterator = this.iconMap.values().iterator();
                        while (iterator.hasNext()) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            final AbstractWorldMapIcon e = iterator.next();
                            if (!e.hasValidElement(1824088404)) {
                                continue;
                            }
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            if (!e.fitsScreen(n4, n5, (byte)(-65))) {
                                continue;
                            }
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            list.add(e);
                        }
                        final Iterator<AbstractWorldMapIcon> iterator2 = this.icon0List.iterator();
                        while (iterator2.hasNext()) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            final AbstractWorldMapIcon e2 = iterator2.next();
                            if (!e2.hasValidElement(1303030906)) {
                                continue;
                            }
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            if (!e2.fitsScreen(n4, n5, (byte)(-25))) {
                                continue;
                            }
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            list.add(e2);
                        }
                        return list;
                    }
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                }
                return list;
            }
            return list;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bm(" + ')');
        }
    }
    
    int method1462(final SpritePixels spritePixels, final HorizontalAlignment horizontalAlignment, final byte b) {
        try {
            switch (horizontalAlignment.value * 1932346871) {
                case 0: {
                    return 0;
                }
                case 2: {
                    return -spritePixels.width / 2;
                }
                default: {
                    return -spritePixels.subWidth;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.bk(" + ')');
        }
    }
    
    int dq(final SpritePixels spritePixels, final HorizontalAlignment horizontalAlignment) {
        switch (horizontalAlignment.value * 1932346871) {
            case 2: {
                return -spritePixels.subWidth / 2;
            }
            case 0: {
                return 0;
            }
            default: {
                return -spritePixels.subWidth;
            }
        }
    }
    
    List eo(final int n, final int n2, final int n3, final int n4, final int n5) {
        final LinkedList<AbstractWorldMapIcon> list = new LinkedList<AbstractWorldMapIcon>();
        if (n4 < n || n5 < n2) {
            return list;
        }
        if (n4 < n + n3 && n5 < n3 + n2) {
            for (final AbstractWorldMapIcon e : this.iconMap.values()) {
                if (e.hasValidElement(1819121033) && e.fitsScreen(n4, n5, (byte)(-109))) {
                    list.add(e);
                }
            }
            for (final AbstractWorldMapIcon e2 : this.icon0List) {
                if (e2.hasValidElement(-1200607436) && e2.fitsScreen(n4, n5, (byte)(-76))) {
                    list.add(e2);
                }
            }
            return list;
        }
        return list;
    }
    
    void method1446(final WorldMapScaleHandler worldMapScaleHandler, final IndexedSprite[] array, final WorldMapSprite worldMapSprite, final byte b) {
        try {
            for (int i = 0; i < 64; ++i) {
                if (b <= 9) {
                    throw new IllegalStateException();
                }
                for (int j = 0; j < 64; ++j) {
                    if (b <= 9) {
                        throw new IllegalStateException();
                    }
                    dn(this, i, j, this.worldMapData_0, worldMapScaleHandler, worldMapSprite, -2045075746);
                    this.method1467(i, j, this.worldMapData_0, worldMapScaleHandler, 1395300206);
                }
            }
            for (int k = 0; k < 64; ++k) {
                if (b <= 9) {
                    throw new IllegalStateException();
                }
                for (int l = 0; l < 64; ++l) {
                    ud(this, k, l, this.worldMapData_0, worldMapScaleHandler, array, -711908357);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ah(" + ')');
        }
    }
    
    public static WorldMapLabel wq(final WorldMapRegion worldMapRegion, final WorldMapElement worldMapElement) {
        if (worldMapRegion == null) {
            worldMapRegion.et();
        }
        if (null == worldMapElement.name || worldMapRegion.fonts == null || worldMapRegion.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) == null) {
            return null;
        }
        final WorldMapLabelSize method1395 = WorldMapLabelSize.method1395(1099622714 * worldMapElement.textSize, -458739222);
        if (null == method1395) {
            return null;
        }
        final Font font = worldMapRegion.fonts.get(method1395);
        if (font == null) {
            return null;
        }
        final String[] array = new String[class292.fo(font, worldMapElement.name, -1672918800)];
        AbstractFont.mk(font, worldMapElement.name, null, array);
        final int n = array.length * font.al / 2;
        int n2 = 0;
        final String[] array2 = array;
        for (int i = 0; i < array2.length; ++i) {
            final int bf = font.bf(array2[i]);
            if (bf > n2) {
                n2 = bf;
            }
        }
        return new WorldMapLabel(worldMapElement.name, n2, n, method1395);
    }
    
    public static void lz(final WorldMapRegion worldMapRegion, final HashSet set, final int n, final int n2) {
        if (worldMapRegion == null) {
            worldMapRegion.eo(n, n, n, n, n);
        }
        for (final AbstractWorldMapIcon abstractWorldMapIcon : worldMapRegion.iconMap.values()) {
            if (!abstractWorldMapIcon.hasValidElement(1390730354)) {
                continue;
            }
            final int element = abstractWorldMapIcon.getElement(-372459421);
            if (!set.contains(element)) {
                continue;
            }
            worldMapRegion.drawBackgroundCircle(class354.method1935(element, 2094339545), abstractWorldMapIcon.screenX * -216598991, abstractWorldMapIcon.screenY * -1288412757, n, n2, -1838015119);
        }
        worldMapRegion.method1434(set, n, n2, (short)5523);
    }
    
    public static void wo(final WorldMapRegion worldMapRegion, final int n) {
        if (worldMapRegion == null) {
            worldMapRegion.method1441(n);
            return;
        }
        try {
            if (worldMapRegion.worldMapData_0 != null) {
                if (n <= 1036805162) {
                    throw new IllegalStateException();
                }
                worldMapRegion.worldMapData_0.by(216938688);
            }
            else {
                final Iterator iterator = worldMapRegion.worldMapData1List.iterator();
                while (iterator.hasNext()) {
                    if (n <= 1036805162) {
                        throw new IllegalStateException();
                    }
                    iterator.next().by(1948378515);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jr.ay(" + ')');
        }
    }
    
    public static void uu(final WorldMapRegion worldMapRegion, final int n, final int n2, final AbstractWorldMapData abstractWorldMapData) {
        if (worldMapRegion == null) {
            worldMapRegion.bh(n, n, n, n, abstractWorldMapData);
            return;
        }
        for (int i = 0; i < abstractWorldMapData.planes * 1632558421; ++i) {
            final WorldMapDecoration[] array = abstractWorldMapData.decorations[i][n][n2];
            if (array != null) {
                if (array.length != 0) {
                    final WorldMapDecoration[] array2 = array;
                    for (int j = 0; j < array2.length; ++j) {
                        final WorldMapDecoration worldMapDecoration = array2[j];
                        final int n3 = 1504481025 * worldMapDecoration.decoration;
                        if ((n3 >= WorldMapDecorationType.field3047.id * -1344801027 && n3 <= WorldMapDecorationType.field3050.id * -1344801027) || -1344801027 * WorldMapDecorationType.field3048.id == n3) {
                            final int n4 = (class144.vmethod3248(2080162465 * worldMapDecoration.objectDefinitionId, (short)16877).int1 * 415653149 != 0) ? -3407872 : -3355444;
                            if (WorldMapDecorationType.field3047.id * -1344801027 == 1504481025 * worldMapDecoration.decoration) {
                                worldMapRegion.method1455(n, n2, -1419490017 * worldMapDecoration.rotation, n4, (byte)0);
                            }
                            if (-1344801027 * WorldMapDecorationType.field3046.id == 1504481025 * worldMapDecoration.decoration) {
                                worldMapRegion.method1455(n, n2, worldMapDecoration.rotation * -1419490017, -3355444, (byte)0);
                                worldMapRegion.method1455(n, n2, worldMapDecoration.rotation * -1419490017 + 1, n4, (byte)0);
                            }
                            if (WorldMapDecorationType.field3050.id * -1344801027 == 1504481025 * worldMapDecoration.decoration) {
                                if (worldMapDecoration.rotation * -1419490017 == 0) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(worldMapRegion.pixelsPerTile * -1897887643 * n, (63 - n2) * (-1897887643 * worldMapRegion.pixelsPerTile), 1, n4);
                                }
                                if (1 == -1419490017 * worldMapDecoration.rotation) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(worldMapRegion.pixelsPerTile * -1897887643 * n + worldMapRegion.pixelsPerTile * -1897887643 - 1, (63 - n2) * (worldMapRegion.pixelsPerTile * -1897887643), 1, n4);
                                }
                                if (2 == worldMapDecoration.rotation * -1419490017) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (worldMapRegion.pixelsPerTile * -1897887643) + -1897887643 * worldMapRegion.pixelsPerTile - 1, (63 - n2) * (-1897887643 * worldMapRegion.pixelsPerTile) + -1897887643 * worldMapRegion.pixelsPerTile - 1, 1, n4);
                                }
                                if (3 == -1419490017 * worldMapDecoration.rotation) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(-1897887643 * worldMapRegion.pixelsPerTile * n, (63 - n2) * (worldMapRegion.pixelsPerTile * -1897887643) + worldMapRegion.pixelsPerTile * -1897887643 - 1, 1, n4);
                                }
                            }
                            if (-1344801027 * WorldMapDecorationType.field3048.id == 1504481025 * worldMapDecoration.decoration) {
                                if (-1419490017 * worldMapDecoration.rotation % 2 == 0) {
                                    for (int k = 0; k < worldMapRegion.pixelsPerTile * -1897887643; ++k) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(worldMapRegion.pixelsPerTile * -1897887643 * n + k, (64 - n2) * (-1897887643 * worldMapRegion.pixelsPerTile) - 1 - k, 1, n4);
                                    }
                                }
                                else {
                                    for (int l = 0; l < -1897887643 * worldMapRegion.pixelsPerTile; ++l) {
                                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(n * (-1897887643 * worldMapRegion.pixelsPerTile) + l, l + -1897887643 * worldMapRegion.pixelsPerTile * (63 - n2), 1, n4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static int ey(final WorldMapRegion worldMapRegion, final SpritePixels spritePixels, final HorizontalAlignment horizontalAlignment) {
        if (worldMapRegion == null) {
            worldMapRegion.cs();
        }
        switch (horizontalAlignment.value * 501578733) {
            case 2: {
                return -spritePixels.subWidth / 2;
            }
            case 0: {
                return 0;
            }
            default: {
                return -spritePixels.subWidth;
            }
        }
    }
    
    public static void uj(final WorldMapRegion worldMapRegion, final WorldMapElement worldMapElement, final int n, final int n2) {
        if (worldMapRegion == null) {
            worldMapRegion.du(worldMapElement, n, n);
        }
        final SpritePixels spriteBool = worldMapElement.getSpriteBool(false, -16711936);
        if (spriteBool != null) {
            spriteBool.drawAt(wt(worldMapRegion, spriteBool, worldMapElement.horizontalAlignment, (byte)(-17)) + n, worldMapRegion.method1449(spriteBool, worldMapElement.verticalAlignment, -1871175081) + n2);
        }
    }
    
    static void bf() {
        WorldMapRegion.WorldMapRegion_cachedSprites.clear();
    }
    
    static void bu() {
        WorldMapRegion.WorldMapRegion_cachedSprites.clear();
    }
    
    void du(final WorldMapElement worldMapElement, final int n, final int n2) {
        final SpritePixels spriteBool = worldMapElement.getSpriteBool(false, -16711936);
        if (spriteBool != null) {
            spriteBool.cm(wt(this, spriteBool, worldMapElement.horizontalAlignment, (byte)83) + n, this.method1449(spriteBool, worldMapElement.verticalAlignment, -1821630962) + n2);
        }
    }
}
