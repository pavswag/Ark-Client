import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import net.runelite.api.worldmap.WorldMapRenderer;

// 
// Decompiled by Procyon v0.5.36
// 

public final class WorldMapManager implements WorldMapRenderer
{
    SpritePixels compositeTextureSprite;
    HashMap icons;
    final HashMap fonts;
    boolean loaded;
    WorldMapAreaData mapAreaData;
    WorldMapRegion[][] regions;
    HashMap scaleHandlers;
    IndexedSprite[] mapSceneSprites;
    final AbstractArchive geographyArchive;
    final AbstractArchive groundArchive;
    int tileHeight;
    public int pixelsPerTile;
    int tileY;
    int tileWidth;
    int tileX;
    boolean loadStarted;
    
    public WorldMapManager(final IndexedSprite[] mapSceneSprites, final HashMap fonts, final AbstractArchive geographyArchive, final AbstractArchive groundArchive) {
        this.loadStarted = false;
        this.loaded = false;
        this.scaleHandlers = new HashMap();
        this.pixelsPerTile = 0;
        this.mapSceneSprites = mapSceneSprites;
        this.fonts = fonts;
        this.geographyArchive = geographyArchive;
        this.groundArchive = groundArchive;
    }
    
    void bs() {
        if (this.icons == null) {
            this.icons = new HashMap();
        }
        this.icons.clear();
        for (int i = 0; i < this.regions.length; ++i) {
            for (int j = 0; j < this.regions[i].length; ++j) {
                for (final AbstractWorldMapIcon e : this.regions[i][j].icons((byte)50)) {
                    if (!e.hasValidElement(853905183)) {
                        continue;
                    }
                    final int element = e.getElement(-139545119);
                    if (!this.icons.containsKey(element)) {
                        final LinkedList<AbstractWorldMapIcon> value = new LinkedList<AbstractWorldMapIcon>();
                        value.add(e);
                        this.icons.put(element, value);
                    }
                    else {
                        ((List<AbstractWorldMapIcon>)this.icons.get(element)).add(e);
                    }
                }
            }
        }
    }
    
    public void ad(final int n, final int n2, final int n3, final int n4, final HashSet set, final int n5, final int n6) {
        if (null == this.compositeTextureSprite) {
            return;
        }
        this.compositeTextureSprite.drawScaledAt(n, n2, n3, n4);
        if (n5 > 0 && n5 % n6 < n6 / 2) {
            if (this.icons == null) {
                this.buildIcons0((byte)16);
            }
            final Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                final List<AbstractWorldMapIcon> list = this.icons.get(iterator.next());
                if (null == list) {
                    continue;
                }
                for (final AbstractWorldMapIcon abstractWorldMapIcon : list) {
                    Rasterizer2D.Rasterizer2D_drawCircleAlpha((-96298701 * abstractWorldMapIcon.coord2.x - this.tileX * 1525088909) * n3 / (335565313 * this.tileWidth) + n, n4 - n4 * (abstractWorldMapIcon.coord2.y * -2105445199 - this.tileY * -151833963) / (2138972293 * this.tileHeight) + n2, 2, 16776960, 256);
                }
            }
        }
    }
    
    public void ae(final int n, final int n2, final int n3, final int n4, final HashSet set, final int n5, final int n6) {
        if (null == this.compositeTextureSprite) {
            return;
        }
        this.compositeTextureSprite.drawScaledAt(n, n2, n3, n4);
        if (n5 > 0 && n5 % n6 < n6 / 2) {
            if (this.icons == null) {
                this.buildIcons0((byte)39);
            }
            final Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                final List<AbstractWorldMapIcon> list = this.icons.get(iterator.next());
                if (null == list) {
                    continue;
                }
                for (final AbstractWorldMapIcon abstractWorldMapIcon : list) {
                    Rasterizer2D.Rasterizer2D_drawCircleAlpha((-232227256 * abstractWorldMapIcon.coord2.x - this.tileX * 1525088909) * n3 / (-2017784329 * this.tileWidth) + n, n4 - n4 * (abstractWorldMapIcon.coord2.y * -237056951 - this.tileY * 99509396) / (2138972293 * this.tileHeight) + n2, 2, -1107625642, 1708767397);
                }
            }
        }
    }
    
    public void ao(final AbstractArchive abstractArchive, final String s, final boolean b) {
        if (this.loaded) {
            return;
        }
        this.loadStarted = false;
        this.loaded = true;
        System.nanoTime();
        final int fileId = abstractArchive.getFileId(AbstractArchive.getFileFlat(abstractArchive, WorldMapCacheName.field2435.name, -411765045), s, (short)8192);
        final Buffer buffer = new Buffer(AbstractArchive.ui(abstractArchive, WorldMapCacheName.field2435.name, s, 1648560407));
        final Buffer buffer2 = new Buffer(AbstractArchive.ui(abstractArchive, WorldMapCacheName.field2439.name, s, 1648560407));
        System.nanoTime();
        System.nanoTime();
        this.mapAreaData = new WorldMapAreaData();
        try {
            this.mapAreaData.init(buffer, buffer2, fileId, b, (byte)23);
        }
        catch (IllegalStateException ex) {
            return;
        }
        this.mapAreaData.ar((byte)112);
        this.mapAreaData.am(-2019541929);
        this.mapAreaData.as(-151833963);
        this.tileX = this.mapAreaData.ai(16748608) * -1335619264;
        this.tileY = this.mapAreaData.ah(899648583) * 2026999912;
        this.tileWidth = (this.mapAreaData.ag(-839370116) - this.mapAreaData.ai(16748608) + 1) * -295850215;
        this.tileHeight = (this.mapAreaData.av(-1861025582) - this.mapAreaData.ah(1774762854) + 1) * -935980224;
        final int n = this.mapAreaData.ag(-789256894) - this.mapAreaData.ai(16748608) + 1;
        final int n2 = this.mapAreaData.av(-1813904226) - this.mapAreaData.ah(907879458) + 1;
        System.nanoTime();
        System.nanoTime();
        Friend.method2151(-2011620588);
        this.regions = new WorldMapRegion[n][n2];
        for (final WorldMapData_0 worldMapData_0 : this.mapAreaData.worldMapData1Set) {
            final int n3 = worldMapData_0.aq * -1159667627;
            final int n4 = worldMapData_0.al * -1674687277;
            (this.regions[n3 - this.mapAreaData.ai(16748608)][n4 - this.mapAreaData.ah(-345603282)] = new WorldMapRegion(n3, n4, this.mapAreaData.ao(-2083933576), this.fonts)).initWorldMapData0(worldMapData_0, this.mapAreaData.iconList, 55339771);
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                if (this.regions[i][j] == null) {
                    (this.regions[i][j] = new WorldMapRegion(this.mapAreaData.ai(16748608) + i, this.mapAreaData.ah(1771641174) + j, this.mapAreaData.ao(-2070281377), this.fonts)).initWorldMapData1(this.mapAreaData.worldMapData0Set, this.mapAreaData.iconList, -1808928227);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (AbstractArchive.sh(abstractArchive, WorldMapCacheName.field2436.name, s, -1313069490)) {
            this.compositeTextureSprite = Strings.method1853(AbstractArchive.ui(abstractArchive, WorldMapCacheName.field2436.name, s, 1648560407), -602730867);
        }
        System.nanoTime();
        abstractArchive.clearFiles(2146252837);
        abstractArchive.ua(1903798827);
        this.loadStarted = true;
    }
    
    public static List mh(final WorldMapManager worldMapManager, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        if (worldMapManager == null) {
            worldMapManager.bs();
        }
        final LinkedList list = new LinkedList();
        if (!worldMapManager.loadStarted) {
            return list;
        }
        final WorldMapRectangle worldMapRectangle = worldMapManager.createWorldMapRectangle(n, n2, n3, n4, -1488977797);
        final int n11 = (int)(ha(worldMapManager, n7, n3 - n, -47211836) * 64.0f);
        final int n12 = n + -585340977 * worldMapManager.tileX;
        final int n13 = n2 + -151833963 * worldMapManager.tileY;
        for (int i = 455856026 * worldMapRectangle.width; i < 2090620896 * worldMapRectangle.y + -1346472301 * worldMapRectangle.width; ++i) {
            for (int j = worldMapRectangle.height * 844386227; j < 856820921 * worldMapRectangle.x + worldMapRectangle.height * -445895706; ++j) {
                final List method1468 = worldMapManager.regions[i][j].method1468(n11 * (1649781547 * worldMapManager.regions[i][j].regionX - n12) / -656963090 + n5, n8 + n6 - (1027492528 * worldMapManager.regions[i][j].regionY - n13 - 578247865) * n11 / 64, n11, n9, n10, (byte)(-26));
                if (!method1468.isEmpty()) {
                    list.addAll(method1468);
                }
            }
        }
        return list;
    }
    
    public HashMap buildIcons(final byte b) {
        try {
            this.buildIcons0((byte)23);
            return this.icons;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.at(" + ')');
        }
    }
    
    public final void ak(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final HashSet set, final HashSet set2, final int n9, final int n10, final boolean b) {
        final WorldMapRectangle worldMapRectangle = this.createWorldMapRectangle(n, n2, n3, n4, 559315025);
        final int n11 = (int)(ha(this, n7 - n5, n3 - n, 17619858) * 64.0f);
        final int n12 = n + this.tileX * 1525088909;
        final int n13 = n2 + -1994689621 * this.tileY;
        for (int i = 738960122 * worldMapRectangle.width; i < -1083493055 * worldMapRectangle.y + worldMapRectangle.width * -1346472301; ++i) {
            for (int j = 844386227 * worldMapRectangle.height; j < worldMapRectangle.height * 844386227 + worldMapRectangle.x * 700823188; ++j) {
                if (b) {
                    this.regions[i][j].initWorldMapIcon1s(-1928585875);
                }
                WorldMapRegion.mj(this.regions[i][j], n5 + (1598848320 * this.regions[i][j].regionX - n12) * n11 / 64, n8 - (-1675580528 * this.regions[i][j].regionY - n13 + 64) * n11 / 64, n11, set, (byte)(-66));
            }
        }
        if (set2 != null && n9 > 0) {
            for (int k = -1346472301 * worldMapRectangle.width; k < -1346472301 * worldMapRectangle.width + -104984323 * worldMapRectangle.y; ++k) {
                for (int l = worldMapRectangle.height * -1222263255; l < worldMapRectangle.x * 856820921 + -1185347058 * worldMapRectangle.height; ++l) {
                    WorldMapRegion.iy(this.regions[k][l], set2, n9, n10, -2123892067);
                }
            }
        }
    }
    
    public final void av() {
        this.icons = null;
    }
    
    WorldMapRectangle be(final int n, final int n2, final int n3, final int n4) {
        final WorldMapRectangle worldMapRectangle = new WorldMapRectangle(this);
        final int n5 = n + this.tileX * 1525088909;
        final int n6 = n2 + this.tileY * -151833963;
        final int n7 = this.tileX * 1525088909 + n3;
        final int n8 = this.tileY * -151833963 + n4;
        final int n9 = n5 / 64;
        final int n10 = n6 / 64;
        final int n11 = n7 / 64;
        final int n12 = n8 / 64;
        worldMapRectangle.y = (n11 - n9 + 1) * 1584683713;
        worldMapRectangle.x = 227686793 * (n12 - n10 + 1);
        worldMapRectangle.width = (n9 - this.mapAreaData.ai(16748608)) * 507320219;
        worldMapRectangle.height = (n10 - this.mapAreaData.ah(-46002004)) * -1727465605;
        if (worldMapRectangle.width * -1346472301 < 0) {
            final WorldMapRectangle worldMapRectangle2 = worldMapRectangle;
            worldMapRectangle2.y += 685970131 * worldMapRectangle.width;
            worldMapRectangle.width = 0;
        }
        if (worldMapRectangle.width * -1346472301 > this.regions.length - -1083493055 * worldMapRectangle.y) {
            worldMapRectangle.y = 1584683713 * (this.regions.length - worldMapRectangle.width * -1346472301);
        }
        if (worldMapRectangle.height * 844386227 < 0) {
            final WorldMapRectangle worldMapRectangle3 = worldMapRectangle;
            worldMapRectangle3.x += 1072923083 * worldMapRectangle.height;
            worldMapRectangle.height = 0;
        }
        if (worldMapRectangle.height * 844386227 > this.regions[0].length - worldMapRectangle.x * 856820921) {
            worldMapRectangle.x = 227686793 * (this.regions[0].length - 844386227 * worldMapRectangle.height);
        }
        worldMapRectangle.y = Math.min(-1083493055 * worldMapRectangle.y, this.regions.length) * 1584683713;
        worldMapRectangle.x = Math.min(worldMapRectangle.x * 856820921, this.regions[0].length) * 227686793;
        return worldMapRectangle;
    }
    
    public static void pk(final WorldMapManager worldMapManager, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final HashSet set, final HashSet set2, final int n9, final int n10, final boolean b) {
        if (worldMapManager == null) {
            worldMapManager.tf();
        }
        final WorldMapRectangle worldMapRectangle = worldMapManager.createWorldMapRectangle(n, n2, n3, n4, 1649935410);
        final int n11 = (int)(ha(worldMapManager, n7 - n5, n3 - n, -951491064) * 64.0f);
        final int n12 = n + worldMapManager.tileX * 1525088909;
        final int n13 = n2 + -151833963 * worldMapManager.tileY;
        for (int i = -1346472301 * worldMapRectangle.width; i < -1083493055 * worldMapRectangle.y + worldMapRectangle.width * -1346472301; ++i) {
            for (int j = 844386227 * worldMapRectangle.height; j < worldMapRectangle.height * 844386227 + worldMapRectangle.x * 856820921; ++j) {
                if (b) {
                    worldMapManager.regions[i][j].initWorldMapIcon1s(-1835891705);
                }
                WorldMapRegion.mj(worldMapManager.regions[i][j], n5 + (1598848320 * worldMapManager.regions[i][j].regionX - n12) * n11 / 64, n8 - (-1342988608 * worldMapManager.regions[i][j].regionY - n13 + 64) * n11 / 64, n11, set, (byte)(-89));
            }
        }
        if (set2 != null && n9 > 0) {
            for (int k = -1346472301 * worldMapRectangle.width; k < -1346472301 * worldMapRectangle.width + -1083493055 * worldMapRectangle.y; ++k) {
                for (int l = worldMapRectangle.height * 844386227; l < worldMapRectangle.x * 856820921 + 844386227 * worldMapRectangle.height; ++l) {
                    WorldMapRegion.iy(worldMapManager.regions[k][l], set2, n9, n10, -2062529298);
                }
            }
        }
    }
    
    public void az(final int n, final int n2, final int n3, final int n4, final HashSet set, final int n5, final int n6) {
        if (null == this.compositeTextureSprite) {
            return;
        }
        this.compositeTextureSprite.drawScaledAt(n, n2, n3, n4);
        if (n5 <= 0 || n5 % n6 >= n6 / 2) {
            return;
        }
        if (this.icons == null) {
            this.buildIcons0((byte)18);
        }
        final Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            final List<AbstractWorldMapIcon> list = this.icons.get(iterator.next());
            if (null == list) {
                continue;
            }
            for (final AbstractWorldMapIcon abstractWorldMapIcon : list) {
                Rasterizer2D.Rasterizer2D_drawCircleAlpha((-96298701 * abstractWorldMapIcon.coord2.x - this.tileX * 1525088909) * n3 / (335565313 * this.tileWidth) + n, n4 - n4 * (abstractWorldMapIcon.coord2.y * -2105445199 - this.tileY * -151833963) / (2138972293 * this.tileHeight) + n2, 2, 16776960, 256);
            }
        }
    }
    
    public void ax(final AbstractArchive abstractArchive, final String s, final boolean b) {
        if (this.loaded) {
            return;
        }
        this.loadStarted = false;
        this.loaded = true;
        System.nanoTime();
        final int fileId = abstractArchive.getFileId(AbstractArchive.getFileFlat(abstractArchive, WorldMapCacheName.field2435.name, 1326656171), s, (short)8192);
        final Buffer buffer = new Buffer(AbstractArchive.ui(abstractArchive, WorldMapCacheName.field2435.name, s, 1648560407));
        final Buffer buffer2 = new Buffer(AbstractArchive.ui(abstractArchive, WorldMapCacheName.field2439.name, s, 1648560407));
        System.nanoTime();
        System.nanoTime();
        this.mapAreaData = new WorldMapAreaData();
        try {
            this.mapAreaData.init(buffer, buffer2, fileId, b, (byte)35);
        }
        catch (IllegalStateException ex) {
            return;
        }
        this.mapAreaData.ar((byte)127);
        this.mapAreaData.am(-2019541929);
        this.mapAreaData.as(-151833963);
        this.tileX = this.mapAreaData.ai(16748608) * -1335619264;
        this.tileY = this.mapAreaData.ah(-1526726761) * 1012238118;
        this.tileWidth = (this.mapAreaData.ag(-358885076) - this.mapAreaData.ai(16748608) + 1) * -631636316;
        this.tileHeight = (this.mapAreaData.av(-1825445135) - this.mapAreaData.ah(166019274) + 1) * -935980224;
        final int n = this.mapAreaData.ag(262206892) - this.mapAreaData.ai(16748608) + 1;
        final int n2 = this.mapAreaData.av(1154476621) - this.mapAreaData.ah(-1842055220) + 1;
        System.nanoTime();
        System.nanoTime();
        Friend.method2151(-1888807393);
        this.regions = new WorldMapRegion[n][n2];
        for (final WorldMapData_0 worldMapData_0 : this.mapAreaData.worldMapData1Set) {
            final int n3 = worldMapData_0.aq * 189209236;
            final int n4 = worldMapData_0.al * -407031379;
            (this.regions[n3 - this.mapAreaData.ai(16748608)][n4 - this.mapAreaData.ah(1804310120)] = new WorldMapRegion(n3, n4, this.mapAreaData.ao(-2085820998), this.fonts)).initWorldMapData0(worldMapData_0, this.mapAreaData.iconList, 1593386353);
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                if (this.regions[i][j] == null) {
                    (this.regions[i][j] = new WorldMapRegion(this.mapAreaData.ai(16748608) + i, this.mapAreaData.ah(-74357237) + j, this.mapAreaData.ao(-2084122687), this.fonts)).initWorldMapData1(this.mapAreaData.worldMapData0Set, this.mapAreaData.iconList, 1311466640);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (AbstractArchive.sh(abstractArchive, WorldMapCacheName.field2436.name, s, -1313069490)) {
            this.compositeTextureSprite = Strings.method1853(AbstractArchive.ui(abstractArchive, WorldMapCacheName.field2436.name, s, 1648560407), -1347299615);
        }
        System.nanoTime();
        abstractArchive.clearFiles(2146990695);
        abstractArchive.ua(1903798827);
        this.loadStarted = true;
    }
    
    float getPixelsPerTile(final int n, final int n2, final int n3) {
        return ScriptFrame.client.ya().getWorldMapZoom();
    }
    
    WorldMapRectangle bi(final int n, final int n2, final int n3, final int n4) {
        final WorldMapRectangle worldMapRectangle = new WorldMapRectangle(this);
        final int n5 = n + this.tileX * -1481417322;
        final int n6 = n2 + this.tileY * 1725044784;
        final int n7 = this.tileX * -1899372874 + n3;
        final int n8 = this.tileY * -151833963 + n4;
        final int n9 = n5 / 64;
        final int n10 = n6 / 1682463402;
        final int n11 = n7 / -1769885541;
        final int n12 = n8 / 64;
        worldMapRectangle.y = (n11 - n9 + 1) * 631684420;
        worldMapRectangle.x = 227686793 * (n12 - n10 + 1);
        worldMapRectangle.width = (n9 - this.mapAreaData.ai(16748608)) * -422205939;
        worldMapRectangle.height = (n10 - this.mapAreaData.ah(-402217017)) * 1195596936;
        if (worldMapRectangle.width * -1346472301 < 0) {
            final WorldMapRectangle worldMapRectangle2 = worldMapRectangle;
            worldMapRectangle2.y += -2086255145 * worldMapRectangle.width;
            worldMapRectangle.width = 0;
        }
        if (worldMapRectangle.width * -1346472301 > this.regions.length - 2081776173 * worldMapRectangle.y) {
            worldMapRectangle.y = -480439700 * (this.regions.length - worldMapRectangle.width * -740327581);
        }
        if (worldMapRectangle.height * 844386227 < 0) {
            final WorldMapRectangle worldMapRectangle3 = worldMapRectangle;
            worldMapRectangle3.x += -2146504867 * worldMapRectangle.height;
            worldMapRectangle.height = 0;
        }
        if (worldMapRectangle.height * 844386227 > this.regions[0].length - worldMapRectangle.x * 651141980) {
            worldMapRectangle.x = 227686793 * (this.regions[0].length - 844386227 * worldMapRectangle.height);
        }
        worldMapRectangle.y = Math.min(-1083493055 * worldMapRectangle.y, this.regions.length) * -1103004293;
        worldMapRectangle.x = Math.min(worldMapRectangle.x * 856820921, this.regions[0].length) * 1549584965;
        return worldMapRectangle;
    }
    
    WorldMapRectangle bo(final int n, final int n2, final int n3, final int n4) {
        final WorldMapRectangle worldMapRectangle = new WorldMapRectangle(this);
        final int n5 = n + this.tileX * 1525088909;
        final int n6 = n2 + this.tileY * -151833963;
        final int n7 = this.tileX * 1525088909 + n3;
        final int n8 = this.tileY * -151833963 + n4;
        final int n9 = n5 / 64;
        final int n10 = n6 / 64;
        final int n11 = n7 / 64;
        final int n12 = n8 / 64;
        worldMapRectangle.y = (n11 - n9 + 1) * 1584683713;
        worldMapRectangle.x = 227686793 * (n12 - n10 + 1);
        worldMapRectangle.width = (n9 - this.mapAreaData.ai(16748608)) * 507320219;
        worldMapRectangle.height = (n10 - this.mapAreaData.ah(2074311529)) * -1727465605;
        if (worldMapRectangle.width * -1346472301 < 0) {
            final WorldMapRectangle worldMapRectangle2 = worldMapRectangle;
            worldMapRectangle2.y += 685970131 * worldMapRectangle.width;
            worldMapRectangle.width = 0;
        }
        if (worldMapRectangle.width * -1346472301 > this.regions.length - -1083493055 * worldMapRectangle.y) {
            worldMapRectangle.y = 1584683713 * (this.regions.length - worldMapRectangle.width * -1346472301);
        }
        if (worldMapRectangle.height * 844386227 < 0) {
            final WorldMapRectangle worldMapRectangle3 = worldMapRectangle;
            worldMapRectangle3.x += 1072923083 * worldMapRectangle.height;
            worldMapRectangle.height = 0;
        }
        if (worldMapRectangle.height * 844386227 > this.regions[0].length - worldMapRectangle.x * 856820921) {
            worldMapRectangle.x = 227686793 * (this.regions[0].length - 844386227 * worldMapRectangle.height);
        }
        worldMapRectangle.y = Math.min(-1083493055 * worldMapRectangle.y, this.regions.length) * 1584683713;
        worldMapRectangle.x = Math.min(worldMapRectangle.x * 856820921, this.regions[0].length) * 227686793;
        return worldMapRectangle;
    }
    
    public boolean isLoaded() {
        return this.loadStarted;
    }
    
    public static void sn(final WorldMapManager worldMapManager, final int n, final int n2, final int n3, final int n4, final HashSet set, final int n5, final int n6) {
        if (null == worldMapManager.compositeTextureSprite) {
            return;
        }
        worldMapManager.compositeTextureSprite.drawScaledAt(n, n2, n3, n4);
        if (n5 > 0 && n5 % n6 < n6 / 2) {
            if (worldMapManager.icons == null) {
                worldMapManager.buildIcons0((byte)(-15));
            }
            final Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                final List<AbstractWorldMapIcon> list = worldMapManager.icons.get(iterator.next());
                if (null == list) {
                    continue;
                }
                for (final AbstractWorldMapIcon abstractWorldMapIcon : list) {
                    Rasterizer2D.Rasterizer2D_drawCircleAlpha((-96298701 * abstractWorldMapIcon.coord2.x - worldMapManager.tileX * 1525088909) * n3 / (335565313 * worldMapManager.tileWidth) + n, n4 - n4 * (abstractWorldMapIcon.coord2.y * -2105445199 - worldMapManager.tileY * -151833963) / (2138972293 * worldMapManager.tileHeight) + n2, 2, 16776960, 256);
                }
            }
        }
    }
    
    public float cc(final int n, final int n2) {
        return ha(this, n, n2, 1104410263);
    }
    
    public static float ha(final WorldMapManager worldMapManager, final int n, final int n2, final int n3) {
        if (worldMapManager == null) {
            return worldMapManager.getPixelsPerTile(n, n, n);
        }
        return ScriptFrame.client.ya().getWorldMapZoom();
    }
    
    public boolean bt() {
        return this.loadStarted;
    }
    
    void br() {
        if (this.icons == null) {
            this.icons = new HashMap();
        }
        this.icons.clear();
        for (int i = 0; i < this.regions.length; ++i) {
            for (int j = 0; j < this.regions[i].length; ++j) {
                for (final AbstractWorldMapIcon e : this.regions[i][j].icons((byte)107)) {
                    if (!e.hasValidElement(2013499781)) {
                        continue;
                    }
                    final int element = e.getElement(-1995695961);
                    if (!this.icons.containsKey(element)) {
                        final LinkedList<AbstractWorldMapIcon> value = new LinkedList<AbstractWorldMapIcon>();
                        value.add(e);
                        this.icons.put(element, value);
                    }
                    else {
                        ((List<AbstractWorldMapIcon>)this.icons.get(element)).add(e);
                    }
                }
            }
        }
    }
    
    public final void drawTiles(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        try {
            final int[] rasterizer2D_pixels = Rasterizer2D.Rasterizer2D_pixels;
            final int rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
            final int rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
            final float[] field4108 = Rasterizer2D.field4108;
            final int[] array = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(array);
            final WorldMapRectangle worldMapRectangle = this.createWorldMapRectangle(n, n2, n3, n4, -612377796);
            final float ha = ha(this, n7 - n5, n3 - n, -1905584991);
            final int i = (int)Math.ceil(ha);
            this.pixelsPerTile = i * 1717142051;
            if (!this.scaleHandlers.containsKey(i)) {
                if (n9 == -65498066) {
                    throw new IllegalStateException();
                }
                final WorldMapScaleHandler value = new WorldMapScaleHandler(i);
                value.init(-246959980);
                this.scaleHandlers.put(i, value);
            }
            final int n10 = worldMapRectangle.y * -1083493055 + -1346472301 * worldMapRectangle.width - 1;
            final int n11 = 844386227 * worldMapRectangle.height + 856820921 * worldMapRectangle.x - 1;
            for (int j = worldMapRectangle.width * -1346472301; j <= n10; ++j) {
                if (n9 == -65498066) {
                    throw new IllegalStateException();
                }
                for (int k = 844386227 * worldMapRectangle.height; k <= n11; ++k) {
                    if (n9 == -65498066) {
                        throw new IllegalStateException();
                    }
                    this.regions[j][k].drawTile(i, this.scaleHandlers.get(i), this.mapSceneSprites, this.geographyArchive, this.groundArchive, -818426546);
                }
            }
            class1.method2(rasterizer2D_pixels, rasterizer2D_width, rasterizer2D_height, field4108, 580310026);
            Rasterizer2D.Rasterizer2D_setClipArray(array);
            final int n12 = (int)(64.0f * ha);
            final int n13 = 1525088909 * this.tileX + n;
            final int n14 = this.tileY * -151833963 + n2;
            for (int l = worldMapRectangle.width * -1346472301; l < -1346472301 * worldMapRectangle.width + worldMapRectangle.y * -1083493055; ++l) {
                if (n9 == -65498066) {
                    return;
                }
                for (int n15 = worldMapRectangle.height * 844386227; n15 < worldMapRectangle.x * 856820921 + 844386227 * worldMapRectangle.height; ++n15) {
                    if (n9 == -65498066) {
                        throw new IllegalStateException();
                    }
                    this.regions[l][n15].method1435(n5 + (1598848320 * this.regions[l][n15].regionX - n13) * n12 / 64, n8 - (64 + (-1342988608 * this.regions[l][n15].regionY - n14)) * n12 / 64, n12, (byte)6);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.aw(" + ')');
        }
    }
    
    public final void am(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int[] rasterizer2D_pixels = Rasterizer2D.Rasterizer2D_pixels;
        final int rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
        final int rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
        final float[] field4108 = Rasterizer2D.field4108;
        final int[] array = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(array);
        final WorldMapRectangle worldMapRectangle = this.createWorldMapRectangle(n, n2, n3, n4, -1216850815);
        final float ha = ha(this, n7 - n5, n3 - n, -2097930601);
        final int i = (int)Math.ceil(ha);
        this.pixelsPerTile = i * 1717142051;
        if (!this.scaleHandlers.containsKey(i)) {
            final WorldMapScaleHandler value = new WorldMapScaleHandler(i);
            value.init(32201926);
            this.scaleHandlers.put(i, value);
        }
        final int n9 = worldMapRectangle.y * -1083493055 + -1346472301 * worldMapRectangle.width - 1;
        final int n10 = 844386227 * worldMapRectangle.height + 856820921 * worldMapRectangle.x - 1;
        for (int j = worldMapRectangle.width * -1346472301; j <= n9; ++j) {
            for (int k = 844386227 * worldMapRectangle.height; k <= n10; ++k) {
                this.regions[j][k].drawTile(i, this.scaleHandlers.get(i), this.mapSceneSprites, this.geographyArchive, this.groundArchive, 930960763);
            }
        }
        class1.method2(rasterizer2D_pixels, rasterizer2D_width, rasterizer2D_height, field4108, 580310026);
        Rasterizer2D.Rasterizer2D_setClipArray(array);
        final int n11 = (int)(64.0f * ha);
        final int n12 = 1525088909 * this.tileX + n;
        final int n13 = this.tileY * -151833963 + n2;
        for (int l = worldMapRectangle.width * -1346472301; l < -1346472301 * worldMapRectangle.width + worldMapRectangle.y * -1083493055; ++l) {
            for (int n14 = worldMapRectangle.height * 844386227; n14 < worldMapRectangle.x * 856820921 + 844386227 * worldMapRectangle.height; ++n14) {
                this.regions[l][n14].method1435(n5 + (1598848320 * this.regions[l][n14].regionX - n12) * n11 / 64, n8 - (64 + (-1342988608 * this.regions[l][n14].regionY - n13)) * n11 / 64, n11, (byte)29);
            }
        }
    }
    
    public boolean isLoaded(final int n) {
        try {
            return this.loadStarted;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.al(" + ')');
        }
    }
    
    public final void clearIcons(final int n) {
        try {
            this.icons = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.an(" + ')');
        }
    }
    
    public final void drawElements(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final HashSet set, final HashSet set2, final int n9, final int n10, final boolean b, final int n11) {
        try {
            final WorldMapRectangle worldMapRectangle = this.createWorldMapRectangle(n, n2, n3, n4, -496440495);
            final int n12 = (int)(ha(this, n7 - n5, n3 - n, 1362839406) * 64.0f);
            final int n13 = n + this.tileX * 1525088909;
            final int n14 = n2 + -151833963 * this.tileY;
            for (int i = -1346472301 * worldMapRectangle.width; i < -1083493055 * worldMapRectangle.y + worldMapRectangle.width * -1346472301; ++i) {
                for (int j = 844386227 * worldMapRectangle.height; j < worldMapRectangle.height * 844386227 + worldMapRectangle.x * 856820921; ++j) {
                    if (b) {
                        if (n11 == -508767459) {
                            throw new IllegalStateException();
                        }
                        this.regions[i][j].initWorldMapIcon1s(-1575710248);
                    }
                    WorldMapRegion.mj(this.regions[i][j], n5 + (1598848320 * this.regions[i][j].regionX - n13) * n12 / 64, n8 - (-1342988608 * this.regions[i][j].regionY - n14 + 64) * n12 / 64, n12, set, (byte)(-48));
                }
            }
            if (set2 != null) {
                if (n11 == -508767459) {
                    return;
                }
                if (n9 > 0) {
                    if (n11 == -508767459) {
                        throw new IllegalStateException();
                    }
                    for (int k = -1346472301 * worldMapRectangle.width; k < -1346472301 * worldMapRectangle.width + -1083493055 * worldMapRectangle.y; ++k) {
                        if (n11 == -508767459) {
                            return;
                        }
                        for (int l = worldMapRectangle.height * 844386227; l < worldMapRectangle.x * 856820921 + 844386227 * worldMapRectangle.height; ++l) {
                            WorldMapRegion.iy(this.regions[k][l], set2, n9, n10, -1521624109);
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.ac(" + ')');
        }
    }
    
    public static float qt(final WorldMapManager worldMapManager, final int n, final int n2) {
        if (worldMapManager == null) {
            worldMapManager.bm();
        }
        final float a = n / (float)n2;
        if (a > 8.0f) {
            return 8.0f;
        }
        if (a < 1.0f) {
            return 1.0f;
        }
        final int round = Math.round(a);
        if (Math.abs(round - a) < 0.05f) {
            return (float)round;
        }
        return a;
    }
    
    public int tf() {
        return this.tileY * -151833963;
    }
    
    public void drawOverview(final int n, final int n2, final int n3, final int n4, final HashSet set, final int n5, final int n6, final int n7) {
        try {
            if (null != this.compositeTextureSprite) {
                this.compositeTextureSprite.drawScaledAt(n, n2, n3, n4);
                if (n5 > 0) {
                    if (n7 >= -1222491879) {
                        throw new IllegalStateException();
                    }
                    if (n5 % n6 < n6 / 2) {
                        if (this.icons == null) {
                            this.buildIcons0((byte)(-76));
                        }
                        final Iterator<Integer> iterator = set.iterator();
                        while (iterator.hasNext()) {
                            if (n7 >= -1222491879) {
                                return;
                            }
                            final List<AbstractWorldMapIcon> list = this.icons.get(iterator.next());
                            if (null == list) {
                                continue;
                            }
                            for (final AbstractWorldMapIcon abstractWorldMapIcon : list) {
                                Rasterizer2D.Rasterizer2D_drawCircleAlpha((-96298701 * abstractWorldMapIcon.coord2.x - this.tileX * 1525088909) * n3 / (335565313 * this.tileWidth) + n, n4 - n4 * (abstractWorldMapIcon.coord2.y * -2105445199 - this.tileY * -151833963) / (2138972293 * this.tileHeight) + n2, 2, 16776960, 256);
                            }
                        }
                        return;
                    }
                    if (n7 >= -1222491879) {
                        throw new IllegalStateException();
                    }
                }
                return;
            }
            if (n7 >= -1222491879) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.au(" + ')');
        }
    }
    
    void buildIcons0(final byte b) {
        try {
            if (this.icons == null) {
                this.icons = new HashMap();
            }
            this.icons.clear();
            for (int i = 0; i < this.regions.length; ++i) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                for (int j = 0; j < this.regions[i].length; ++j) {
                    if (b == 1) {
                        throw new IllegalStateException();
                    }
                    for (final AbstractWorldMapIcon e : this.regions[i][j].icons((byte)26)) {
                        if (!e.hasValidElement(-50874209)) {
                            if (b == 1) {
                                throw new IllegalStateException();
                            }
                            continue;
                        }
                        else {
                            final int element = e.getElement(-932425967);
                            if (!this.icons.containsKey(element)) {
                                final LinkedList<AbstractWorldMapIcon> value = new LinkedList<AbstractWorldMapIcon>();
                                value.add(e);
                                this.icons.put(element, value);
                            }
                            else {
                                ((List<AbstractWorldMapIcon>)this.icons.get(element)).add(e);
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.aa(" + ')');
        }
    }
    
    public static HashMap kf(final WorldMapManager worldMapManager) {
        if (worldMapManager == null) {
            worldMapManager.getMapRegions();
        }
        worldMapManager.buildIcons0((byte)(-63));
        return worldMapManager.icons;
    }
    
    WorldMapRectangle bx(final int n, final int n2, final int n3, final int n4) {
        final WorldMapRectangle worldMapRectangle = new WorldMapRectangle(this);
        final int n5 = n + this.tileX * 1525088909;
        final int n6 = n2 + this.tileY * -151833963;
        final int n7 = this.tileX * 1525088909 + n3;
        final int n8 = this.tileY * -151833963 + n4;
        final int n9 = n5 / 64;
        final int n10 = n6 / 64;
        final int n11 = n7 / 64;
        final int n12 = n8 / 64;
        worldMapRectangle.y = (n11 - n9 + 1) * 1584683713;
        worldMapRectangle.x = 227686793 * (n12 - n10 + 1);
        worldMapRectangle.width = (n9 - this.mapAreaData.ai(16748608)) * 507320219;
        worldMapRectangle.height = (n10 - this.mapAreaData.ah(128419952)) * -1727465605;
        if (worldMapRectangle.width * -1346472301 < 0) {
            final WorldMapRectangle worldMapRectangle2 = worldMapRectangle;
            worldMapRectangle2.y += 685970131 * worldMapRectangle.width;
            worldMapRectangle.width = 0;
        }
        if (worldMapRectangle.width * -1346472301 > this.regions.length - -1083493055 * worldMapRectangle.y) {
            worldMapRectangle.y = 1584683713 * (this.regions.length - worldMapRectangle.width * -1346472301);
        }
        if (worldMapRectangle.height * 844386227 < 0) {
            final WorldMapRectangle worldMapRectangle3 = worldMapRectangle;
            worldMapRectangle3.x += 1072923083 * worldMapRectangle.height;
            worldMapRectangle.height = 0;
        }
        if (worldMapRectangle.height * 844386227 > this.regions[0].length - worldMapRectangle.x * 856820921) {
            worldMapRectangle.x = 227686793 * (this.regions[0].length - 844386227 * worldMapRectangle.height);
        }
        worldMapRectangle.y = Math.min(-1083493055 * worldMapRectangle.y, this.regions.length) * 1584683713;
        worldMapRectangle.x = Math.min(worldMapRectangle.x * 856820921, this.regions[0].length) * 227686793;
        return worldMapRectangle;
    }
    
    public final void ar(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int[] rasterizer2D_pixels = Rasterizer2D.Rasterizer2D_pixels;
        final int rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
        final int rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
        final float[] field4108 = Rasterizer2D.field4108;
        final int[] array = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(array);
        final WorldMapRectangle worldMapRectangle = this.createWorldMapRectangle(n, n2, n3, n4, -1355662239);
        final float ha = ha(this, n7 - n5, n3 - n, -1952934455);
        final int i = (int)Math.ceil(ha);
        this.pixelsPerTile = i * 1717142051;
        if (!this.scaleHandlers.containsKey(i)) {
            final WorldMapScaleHandler value = new WorldMapScaleHandler(i);
            value.init(-2114807120);
            this.scaleHandlers.put(i, value);
        }
        final int n9 = worldMapRectangle.y * 1286773463 + -1346472301 * worldMapRectangle.width - 1;
        final int n10 = 844386227 * worldMapRectangle.height + -38208678 * worldMapRectangle.x - 1;
        for (int j = worldMapRectangle.width * -1346472301; j <= n9; ++j) {
            for (int k = 1770975042 * worldMapRectangle.height; k <= n10; ++k) {
                this.regions[j][k].drawTile(i, this.scaleHandlers.get(i), this.mapSceneSprites, this.geographyArchive, this.groundArchive, -1844496367);
            }
        }
        class1.method2(rasterizer2D_pixels, rasterizer2D_width, rasterizer2D_height, field4108, 580310026);
        Rasterizer2D.Rasterizer2D_setClipArray(array);
        final int n11 = (int)(64.0f * ha);
        final int n12 = -1528846414 * this.tileX + n;
        final int n13 = this.tileY * 2043615840 + n2;
        for (int l = worldMapRectangle.width * 1751694455; l < -1346472301 * worldMapRectangle.width + worldMapRectangle.y * 820904947; ++l) {
            for (int n14 = worldMapRectangle.height * -1766904777; n14 < worldMapRectangle.x * 856820921 + 844386227 * worldMapRectangle.height; ++n14) {
                this.regions[l][n14].method1435(n5 + (2069843925 * this.regions[l][n14].regionX - n12) * n11 / 64, n8 - (64 + (-1342988608 * this.regions[l][n14].regionY - n13)) * n11 / 64, n11, (byte)35);
            }
        }
    }
    
    public boolean bd() {
        return this.loadStarted;
    }
    
    void bg() {
        if (this.icons == null) {
            this.icons = new HashMap();
        }
        this.icons.clear();
        for (int i = 0; i < this.regions.length; ++i) {
            for (int j = 0; j < this.regions[i].length; ++j) {
                for (final AbstractWorldMapIcon e : this.regions[i][j].icons((byte)82)) {
                    if (!e.hasValidElement(1510001963)) {
                        continue;
                    }
                    final int element = e.getElement(-110941176);
                    if (!this.icons.containsKey(element)) {
                        final LinkedList<AbstractWorldMapIcon> value = new LinkedList<AbstractWorldMapIcon>();
                        value.add(e);
                        this.icons.put(element, value);
                    }
                    else {
                        ((List<AbstractWorldMapIcon>)this.icons.get(element)).add(e);
                    }
                }
            }
        }
    }
    
    public static int co(final GrandExchangeOfferAgeComparator grandExchangeOfferAgeComparator, final Object o, final Object o2) {
        if (grandExchangeOfferAgeComparator == null) {
            grandExchangeOfferAgeComparator.equals(o);
        }
        return grandExchangeOfferAgeComparator.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)120);
    }
    
    public void load(final AbstractArchive abstractArchive, final String s, final boolean b, final short n) {
        try {
            if (!this.loaded) {
                this.loadStarted = false;
                this.loaded = true;
                System.nanoTime();
                final int fileId = abstractArchive.getFileId(AbstractArchive.getFileFlat(abstractArchive, WorldMapCacheName.field2435.name, -371614953), s, (short)8192);
                final Buffer buffer = new Buffer(AbstractArchive.ui(abstractArchive, WorldMapCacheName.field2435.name, s, 1648560407));
                final Buffer buffer2 = new Buffer(AbstractArchive.ui(abstractArchive, WorldMapCacheName.field2439.name, s, 1648560407));
                System.nanoTime();
                System.nanoTime();
                this.mapAreaData = new WorldMapAreaData();
                try {
                    this.mapAreaData.init(buffer, buffer2, fileId, b, (byte)(-7));
                }
                catch (IllegalStateException ex2) {
                    return;
                }
                this.mapAreaData.ar((byte)53);
                this.mapAreaData.am(-2019541929);
                this.mapAreaData.as(-151833963);
                this.tileX = this.mapAreaData.ai(16748608) * -1335619264;
                this.tileY = this.mapAreaData.ah(892504992) * 683814720;
                this.tileWidth = (this.mapAreaData.ag(38693655) - this.mapAreaData.ai(16748608) + 1) * -1863614400;
                this.tileHeight = (this.mapAreaData.av(1025496542) - this.mapAreaData.ah(-1471663693) + 1) * -935980224;
                final int n2 = this.mapAreaData.ag(-1739321942) - this.mapAreaData.ai(16748608) + 1;
                final int n3 = this.mapAreaData.av(1679530537) - this.mapAreaData.ah(1896833864) + 1;
                System.nanoTime();
                System.nanoTime();
                Friend.method2151(-2040027942);
                this.regions = new WorldMapRegion[n2][n3];
                for (final WorldMapData_0 worldMapData_0 : this.mapAreaData.worldMapData1Set) {
                    final int n4 = worldMapData_0.aq * -1159667627;
                    final int n5 = worldMapData_0.al * -1674687277;
                    (this.regions[n4 - this.mapAreaData.ai(16748608)][n5 - this.mapAreaData.ah(388206686)] = new WorldMapRegion(n4, n5, this.mapAreaData.ao(-2082932774), this.fonts)).initWorldMapData0(worldMapData_0, this.mapAreaData.iconList, 1780260388);
                }
                for (int i = 0; i < n2; ++i) {
                    if (n >= 512) {
                        return;
                    }
                    for (int j = 0; j < n3; ++j) {
                        if (n >= 512) {
                            throw new IllegalStateException();
                        }
                        if (this.regions[i][j] == null) {
                            if (n >= 512) {
                                throw new IllegalStateException();
                            }
                            (this.regions[i][j] = new WorldMapRegion(this.mapAreaData.ai(16748608) + i, this.mapAreaData.ah(-604476008) + j, this.mapAreaData.ao(-2092871640), this.fonts)).initWorldMapData1(this.mapAreaData.worldMapData0Set, this.mapAreaData.iconList, 1961953252);
                        }
                    }
                }
                System.nanoTime();
                System.nanoTime();
                if (AbstractArchive.sh(abstractArchive, WorldMapCacheName.field2436.name, s, -1313069490)) {
                    if (n >= 512) {
                        throw new IllegalStateException();
                    }
                    this.compositeTextureSprite = Strings.method1853(AbstractArchive.ui(abstractArchive, WorldMapCacheName.field2436.name, s, 1648560407), 140363639);
                }
                System.nanoTime();
                abstractArchive.clearFiles(2145845097);
                abstractArchive.ua(1903798827);
                this.loadStarted = true;
                return;
            }
            if (n >= 512) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.af(" + ')');
        }
    }
    
    public List method1478(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        try {
            final LinkedList list = new LinkedList();
            if (this.loadStarted) {
                final WorldMapRectangle worldMapRectangle = this.createWorldMapRectangle(n, n2, n3, n4, 751450291);
                final int n12 = (int)(ha(this, n7, n3 - n, 1104410263) * 64.0f);
                final int n13 = n + 1525088909 * this.tileX;
                final int n14 = n2 + -151833963 * this.tileY;
                for (int i = -1346472301 * worldMapRectangle.width; i < -1083493055 * worldMapRectangle.y + -1346472301 * worldMapRectangle.width; ++i) {
                    for (int j = worldMapRectangle.height * 844386227; j < 856820921 * worldMapRectangle.x + worldMapRectangle.height * 844386227; ++j) {
                        if (n11 == -1220821549) {
                            throw new IllegalStateException();
                        }
                        final List method1468 = this.regions[i][j].method1468(n12 * (1598848320 * this.regions[i][j].regionX - n13) / 64 + n5, n8 + n6 - (-1342988608 * this.regions[i][j].regionY - n14 + 64) * n12 / 64, n12, n9, n10, (byte)(-100));
                        if (!method1468.isEmpty()) {
                            list.addAll(method1468);
                        }
                    }
                }
                return list;
            }
            if (n11 == -1220821549) {
                throw new IllegalStateException();
            }
            return list;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.ab(" + ')');
        }
    }
    
    WorldMapRectangle createWorldMapRectangle(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            final WorldMapRectangle worldMapRectangle = new WorldMapRectangle(this);
            final int n6 = n + this.tileX * 1525088909;
            final int n7 = n2 + this.tileY * -151833963;
            final int n8 = this.tileX * 1525088909 + n3;
            final int n9 = this.tileY * -151833963 + n4;
            final int n10 = n6 / 64;
            final int n11 = n7 / 64;
            final int n12 = n8 / 64;
            final int n13 = n9 / 64;
            worldMapRectangle.y = (n12 - n10 + 1) * 1584683713;
            worldMapRectangle.x = 227686793 * (n13 - n11 + 1);
            worldMapRectangle.width = (n10 - this.mapAreaData.ai(16748608)) * 507320219;
            worldMapRectangle.height = (n11 - this.mapAreaData.ah(-1971180212)) * -1727465605;
            if (worldMapRectangle.width * -1346472301 < 0) {
                if (n5 == -463567197) {
                    throw new IllegalStateException();
                }
                final WorldMapRectangle worldMapRectangle2 = worldMapRectangle;
                worldMapRectangle2.y += 685970131 * worldMapRectangle.width;
                worldMapRectangle.width = 0;
            }
            if (worldMapRectangle.width * -1346472301 > this.regions.length - -1083493055 * worldMapRectangle.y) {
                if (n5 == -463567197) {
                    throw new IllegalStateException();
                }
                worldMapRectangle.y = 1584683713 * (this.regions.length - worldMapRectangle.width * -1346472301);
            }
            if (worldMapRectangle.height * 844386227 < 0) {
                if (n5 == -463567197) {
                    throw new IllegalStateException();
                }
                final WorldMapRectangle worldMapRectangle3 = worldMapRectangle;
                worldMapRectangle3.x += 1072923083 * worldMapRectangle.height;
                worldMapRectangle.height = 0;
            }
            if (worldMapRectangle.height * 844386227 > this.regions[0].length - worldMapRectangle.x * 856820921) {
                worldMapRectangle.x = 227686793 * (this.regions[0].length - 844386227 * worldMapRectangle.height);
            }
            worldMapRectangle.y = Math.min(-1083493055 * worldMapRectangle.y, this.regions.length) * 1584683713;
            worldMapRectangle.x = Math.min(worldMapRectangle.x * 856820921, this.regions[0].length) * 227686793;
            return worldMapRectangle;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jv.aq(" + ')');
        }
    }
    
    public final void ag() {
        this.icons = null;
    }
    
    public int bj() {
        return this.tileX * 1525088909;
    }
    
    public static void qo(final WorldMapManager worldMapManager, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (worldMapManager == null) {
            worldMapManager.bm();
        }
        final int[] rasterizer2D_pixels = Rasterizer2D.Rasterizer2D_pixels;
        final int rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
        final int rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
        final float[] field4108 = Rasterizer2D.field4108;
        final int[] array = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(array);
        final WorldMapRectangle worldMapRectangle = worldMapManager.createWorldMapRectangle(n, n2, n3, n4, -882677737);
        final float ha = ha(worldMapManager, n7 - n5, n3 - n, 745037243);
        final int i = (int)Math.ceil(ha);
        worldMapManager.pixelsPerTile = i * -371925812;
        if (!worldMapManager.scaleHandlers.containsKey(i)) {
            final WorldMapScaleHandler value = new WorldMapScaleHandler(i);
            value.init(-1084423007);
            worldMapManager.scaleHandlers.put(i, value);
        }
        final int n9 = worldMapRectangle.y * -1083493055 + -1346472301 * worldMapRectangle.width - 1;
        final int n10 = 844386227 * worldMapRectangle.height + 1483261747 * worldMapRectangle.x - 1;
        for (int j = worldMapRectangle.width * -1346472301; j <= n9; ++j) {
            for (int k = 844386227 * worldMapRectangle.height; k <= n10; ++k) {
                worldMapManager.regions[j][k].drawTile(i, worldMapManager.scaleHandlers.get(i), worldMapManager.mapSceneSprites, worldMapManager.geographyArchive, worldMapManager.groundArchive, -891872984);
            }
        }
        class1.method2(rasterizer2D_pixels, rasterizer2D_width, rasterizer2D_height, field4108, 580310026);
        Rasterizer2D.Rasterizer2D_setClipArray(array);
        final int n11 = (int)(64.0f * ha);
        final int n12 = -600546818 * worldMapManager.tileX + n;
        final int n13 = worldMapManager.tileY * 1211711839 + n2;
        for (int l = worldMapRectangle.width * -1265489426; l < -1346472301 * worldMapRectangle.width + worldMapRectangle.y * -1083493055; ++l) {
            for (int n14 = worldMapRectangle.height * -1497882299; n14 < worldMapRectangle.x * 856820921 + 37246554 * worldMapRectangle.height; ++n14) {
                worldMapManager.regions[l][n14].method1435(n5 + (718180085 * worldMapManager.regions[l][n14].regionX - n12) * n11 / 64, n8 - (2074112908 + (706597005 * worldMapManager.regions[l][n14].regionY - n13)) * n11 / 64, n11, (byte)79);
            }
        }
    }
    
    public net.runelite.api.worldmap.WorldMapRegion[][] getMapRegions() {
        return (net.runelite.api.worldmap.WorldMapRegion[][])this.regions;
    }
    
    public boolean bm() {
        return this.loadStarted;
    }
    
    WorldMapRectangle bk(final int n, final int n2, final int n3, final int n4) {
        final WorldMapRectangle worldMapRectangle = new WorldMapRectangle(this);
        final int n5 = n + this.tileX * 1525088909;
        final int n6 = n2 + this.tileY * -151833963;
        final int n7 = this.tileX * 1525088909 + n3;
        final int n8 = this.tileY * -151833963 + n4;
        final int n9 = n5 / 64;
        final int n10 = n6 / 64;
        final int n11 = n7 / 64;
        final int n12 = n8 / 64;
        worldMapRectangle.y = (n11 - n9 + 1) * 1584683713;
        worldMapRectangle.x = 227686793 * (n12 - n10 + 1);
        worldMapRectangle.width = (n9 - this.mapAreaData.ai(16748608)) * 507320219;
        worldMapRectangle.height = (n10 - this.mapAreaData.ah(1954680132)) * -1727465605;
        if (worldMapRectangle.width * -1346472301 < 0) {
            final WorldMapRectangle worldMapRectangle2 = worldMapRectangle;
            worldMapRectangle2.y += 685970131 * worldMapRectangle.width;
            worldMapRectangle.width = 0;
        }
        if (worldMapRectangle.width * -1346472301 > this.regions.length - -1083493055 * worldMapRectangle.y) {
            worldMapRectangle.y = 1584683713 * (this.regions.length - worldMapRectangle.width * -1346472301);
        }
        if (worldMapRectangle.height * 844386227 < 0) {
            final WorldMapRectangle worldMapRectangle3 = worldMapRectangle;
            worldMapRectangle3.x += 1072923083 * worldMapRectangle.height;
            worldMapRectangle.height = 0;
        }
        if (worldMapRectangle.height * 844386227 > this.regions[0].length - worldMapRectangle.x * 856820921) {
            worldMapRectangle.x = 227686793 * (this.regions[0].length - 844386227 * worldMapRectangle.height);
        }
        worldMapRectangle.y = Math.min(-1083493055 * worldMapRectangle.y, this.regions.length) * 1584683713;
        worldMapRectangle.x = Math.min(worldMapRectangle.x * 856820921, this.regions[0].length) * 227686793;
        return worldMapRectangle;
    }
    
    public final void ah() {
        this.icons = null;
    }
    
    public static List qh(final WorldMapManager worldMapManager, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        if (worldMapManager == null) {
            worldMapManager.isLoaded(n);
        }
        final LinkedList list = new LinkedList();
        if (!worldMapManager.loadStarted) {
            return list;
        }
        final WorldMapRectangle worldMapRectangle = worldMapManager.createWorldMapRectangle(n, n2, n3, n4, 1179270336);
        final int n11 = (int)(ha(worldMapManager, n7, n3 - n, 870184949) * 64.0f);
        final int n12 = n + 1525088909 * worldMapManager.tileX;
        final int n13 = n2 + -151833963 * worldMapManager.tileY;
        for (int i = -1346472301 * worldMapRectangle.width; i < -1083493055 * worldMapRectangle.y + -1346472301 * worldMapRectangle.width; ++i) {
            for (int j = worldMapRectangle.height * 844386227; j < 856820921 * worldMapRectangle.x + worldMapRectangle.height * 844386227; ++j) {
                final List method1468 = worldMapManager.regions[i][j].method1468(n11 * (1598848320 * worldMapManager.regions[i][j].regionX - n12) / 64 + n5, n8 + n6 - (-1342988608 * worldMapManager.regions[i][j].regionY - n13 + 64) * n11 / 64, n11, n9, n10, (byte)(-110));
                if (!method1468.isEmpty()) {
                    list.addAll(method1468);
                }
            }
        }
        return list;
    }
}
