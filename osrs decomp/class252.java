// 
// Decompiled by Procyon v0.5.36
// 

public class class252 implements WorldMapSection
{
    int field2345;
    int field2346;
    static final int bg = 1003;
    int field2347;
    int field2348;
    int field2349;
    int field2350;
    int field2351;
    int field2352;
    int field2353;
    static final int ax = 1;
    int field2354;
    static final int bs = 24;
    
    class252() {
    }
    
    @Override
    public boolean ad(final int n, final int n2, final int n3) {
        return n >= 1455053008 * this.field2350 && n < this.field2353 * 983464293 + this.field2350 * -1060807941 && n2 >= (this.field2346 * 268581205 << 6) + (this.field2349 * 1154919610 << 3) && n2 <= 7 + ((this.field2349 * 605272271 << 3) + (this.field2346 * 1226403615 << 6)) && n3 >= (-1227767638 * this.field2347 << 6) + (-2012178411 * this.field2351 << 3) && n3 <= (this.field2351 * -1911026493 << 3) + (46819562 * this.field2347 << 6) + 7;
    }
    
    @Override
    public boolean ae(final int n, final int n2, final int n3) {
        return n >= 1639414297 * this.field2350 && n < this.field2353 * -1519014345 + this.field2350 * -1060807941 && n2 >= (this.field2346 * 268581205 << 6) + (this.field2349 * -646100311 << 3) && n2 <= 7 + ((this.field2349 * 211972934 << 3) + (this.field2346 * 268581205 << 6)) && n3 >= (1540923543 * this.field2347 << 6) + (648463073 * this.field2351 << 3) && n3 <= (this.field2351 * 285128667 << 3) + (362794351 * this.field2347 << 6) + 7;
    }
    
    void bb() {
    }
    
    @Override
    public int[] ao(final int n, final int n2, final int n3) {
        if (!this.containsCoord(n, n2, n3, (byte)(-58))) {
            return null;
        }
        return new int[] { this.field2345 * -1546860992 - 9327936 * this.field2346 + n2 + (this.field2352 * -201304696 - this.field2349 * 547210872), n3 + (this.field2354 * 1835797691 - 1063133807 * this.field2347) + (this.field2348 * 1359347976 - 1082441896 * this.field2351) };
    }
    
    @Override
    public void at(final WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX * 1945596353 > 1937970406 * this.field2345) {
            worldMapArea.regionLowX = -694790025 * this.field2345;
        }
        if (1854846129 * worldMapArea.regionHighX < 871659216 * this.field2345) {
            worldMapArea.regionHighX = this.field2345 * 92282601;
        }
        if (worldMapArea.regionLowY * 1607451251 > -2085428027 * this.field2354) {
            worldMapArea.regionLowY = this.field2354 * -1591406467;
        }
        if (worldMapArea.regionHighY * 1593457824 < 243837231 * this.field2354) {
            worldMapArea.regionHighY = this.field2354 * 1758667419;
        }
    }
    
    void ak() {
    }
    
    @Override
    public Coord av(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1743343165)) {
            return null;
        }
        return new Coord(-1060807941 * this.field2350, 547210872 * this.field2349 - -201304696 * this.field2352 + (9327936 * this.field2346 - -1546860992 * this.field2345 + n), 1082441896 * this.field2351 - this.field2348 * 248657896 + (n2 + (this.field2347 * 1744001984 - -323407552 * this.field2354)));
    }
    
    @Override
    public void as(final Buffer buffer) {
        this.field2350 = Buffer.ra(buffer, (byte)7) * -153706445;
        this.field2353 = Buffer.ra(buffer, (byte)7) * 74409863;
        this.field2346 = buffer.readUnsignedShort(-1064858139) * -1522795523;
        this.field2349 = Buffer.ra(buffer, (byte)7) * -1051832785;
        this.field2347 = buffer.readUnsignedShort(-256435622) * 3551631;
        this.field2351 = Buffer.ra(buffer, (byte)7) * -1804437699;
        this.field2345 = buffer.readUnsignedShort(603784709) * 1517975849;
        this.field2352 = Buffer.ra(buffer, (byte)7) * 1932656209;
        this.field2354 = buffer.readUnsignedShort(-55853301) * -426051059;
        this.field2348 = Buffer.ra(buffer, (byte)7) * 137791061;
        this.method1488(1193511091);
    }
    
    void az() {
    }
    
    @Override
    public int[] ax(final int n, final int n2, final int n3) {
        if (!this.containsCoord(n, n2, n3, (byte)1)) {
            return null;
        }
        return new int[] { this.field2345 * -1546860992 - 9327936 * this.field2346 + n2 + (this.field2352 * 1458540265 - this.field2349 * 547210872), n3 + (this.field2354 * -323407552 - 1744001984 * this.field2347) + (this.field2348 * -843587113 - -2052844905 * this.field2351) };
    }
    
    public boolean getItemSprite(final int n, final int n2) {
        return n >= (-562033999 * this.field2352 << 3) + (this.field2345 * -2086205450 << 6) && n <= 7 + ((this.field2345 * 1770324111 << 6) + (-562033999 * this.field2352 << 3)) && n2 >= (this.field2354 * -2085428027 << 6) + (this.field2348 * 1104824061 << 3) && n2 <= (1104824061 * this.field2348 << 3) + (this.field2354 * -2085428027 << 6) + 7;
    }
    
    public static final SpritePixels getItemSprite(final int n, final int n2, final int n3, final int n4, int n5, final boolean b, final int n6) {
        try {
            if (n2 == -1) {
                if (n6 <= -775071603) {
                    throw new IllegalStateException();
                }
                n5 = 0;
            }
            else if (2 == n5) {
                if (n6 <= -775071603) {
                    throw new IllegalStateException();
                }
                if (n2 != 1) {
                    n5 = 1;
                }
            }
            final long n7 = ((long)n3 << 38) + (n + ((long)n2 << 16)) + ((long)n5 << 40) + ((long)n4 << 42);
            if (!b) {
                if (n6 <= -775071603) {
                    throw new IllegalStateException();
                }
                final SpritePixels spritePixels = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.wr(n7);
                if (spritePixels != null) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    return spritePixels;
                }
            }
            ItemComposition itemComposition = HealthBarUpdate.set(n, (byte)86);
            if (n2 > 1 && null != itemComposition.countobj) {
                if (n6 <= -775071603) {
                    throw new IllegalStateException();
                }
                int n8 = -1;
                for (int i = 0; i < 10; ++i) {
                    if (n2 >= itemComposition.countco[i]) {
                        if (n6 <= -775071603) {
                            throw new IllegalStateException();
                        }
                        if (0 != itemComposition.countco[i]) {
                            if (n6 <= -775071603) {
                                throw new IllegalStateException();
                            }
                            n8 = itemComposition.countobj[i];
                        }
                    }
                }
                if (n8 != -1) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    itemComposition = HealthBarUpdate.set(n8, (byte)69);
                }
            }
            final Model model = itemComposition.getModel(1, -1609935694);
            if (model != null) {
                SpritePixels spritePixels2 = null;
                if (-1 != itemComposition.noteTemplate * -1375068187) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    spritePixels2 = getItemSprite(itemComposition.note * 1399852547, 10, 1, 0, 0, true, 1339353001);
                    if (null == spritePixels2) {
                        if (n6 <= -775071603) {
                            throw new IllegalStateException();
                        }
                        return null;
                    }
                }
                else if (-1276549997 * itemComposition.notedId != -1) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    spritePixels2 = getItemSprite(itemComposition.unnotedId * -1273418661, n2, n3, n4, 0, false, 1852795737);
                    if (null == spritePixels2) {
                        return null;
                    }
                }
                else if (itemComposition.placeholderTemplate * 119859889 != -1) {
                    spritePixels2 = getItemSprite(-172219939 * itemComposition.placeholder, n2, 0, 0, 0, false, -539868663);
                    if (null == spritePixels2) {
                        return null;
                    }
                }
                final int[] rasterizer2D_pixels = Rasterizer2D.Rasterizer2D_pixels;
                final int rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
                final int rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
                final float[] field4108 = Rasterizer2D.field4108;
                final int[] array = new int[4];
                Rasterizer2D.Rasterizer2D_getClipArray(array);
                final SpritePixels spritePixels3 = new SpritePixels(36, 32);
                class1.method2(spritePixels3.pixels, 36, 32, null, 580310026);
                Rasterizer2D.Rasterizer2D_clear();
                class18.method68(-1447075049);
                WorldMapArea.getRegionLowX(16, 16, (byte)32);
                Rasterizer3D.clips.field2226 = false;
                if (-1 != itemComposition.placeholderTemplate * 119859889) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    spritePixels2.drawAt(0, 0);
                }
                int n9 = itemComposition.zoom2d * 1014971553;
                if (b) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    n9 *= (int)1.5;
                }
                else if (2 == n3) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    n9 *= (int)1.04;
                }
                final int n10 = n9 * Rasterizer3D.Rasterizer3D_sine[415331477 * itemComposition.xan2d] >> 16;
                final int n11 = n9 * Rasterizer3D.Rasterizer3D_cosine[415331477 * itemComposition.xan2d] >> 16;
                model.calculateBoundsCylinder();
                model.method1343(0, -2044433177 * itemComposition.yan2d, itemComposition.zan2d * 450595207, itemComposition.xan2d * 415331477, itemComposition.offsetX2d * 151912273, 1550732737 * model.et / 2 + n10 + -271411709 * itemComposition.offsetY2d, n11 + itemComposition.offsetY2d * -271411709);
                if (-1276549997 * itemComposition.notedId != -1) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    spritePixels2.drawAt(0, 0);
                }
                if (n3 >= 1) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    spritePixels3.outline(1);
                }
                if (n3 >= 2) {
                    spritePixels3.outline(16777215);
                }
                if (0 != n4) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    spritePixels3.shadow(n4);
                }
                class1.method2(spritePixels3.pixels, 36, 32, null, 580310026);
                if (itemComposition.noteTemplate * -1375068187 != -1) {
                    if (n6 <= -775071603) {
                        throw new IllegalStateException();
                    }
                    spritePixels2.drawAt(0, 0);
                }
                Label_1119: {
                    if (n5 != 1) {
                        if (n6 <= -775071603) {
                            throw new IllegalStateException();
                        }
                        if (n5 != 2 || 1 != itemComposition.isStackable * 1552863327) {
                            break Label_1119;
                        }
                        if (n6 <= -775071603) {
                            throw new IllegalStateException();
                        }
                    }
                    class492.xb(class124.ItemDefinition_fontPlain11, class101.method633(n2, 262535457), 0, 9, 16776960, 1);
                }
                if (!b) {
                    ItemComposition.ItemDefinition_cachedSprites.put(spritePixels3, n7);
                }
                class1.method2(rasterizer2D_pixels, rasterizer2D_width, rasterizer2D_height, field4108, 580310026);
                Rasterizer2D.Rasterizer2D_setClipArray(array);
                class18.method68(-755644984);
                Rasterizer3D.clips.field2226 = true;
                return spritePixels3;
            }
            if (n6 <= -775071603) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jy.ay(" + ')');
        }
    }
    
    @Override
    public boolean containsPosition(final int n, final int n2, final int n3) {
        try {
            if (n < (-562033999 * this.field2352 << 3) + (this.field2345 * 646918937 << 6)) {
                return false;
            }
            if (n3 >= -1516355947) {
                throw new IllegalStateException();
            }
            if (n > 7 + ((this.field2345 * 646918937 << 6) + (-562033999 * this.field2352 << 3)) || n2 < (this.field2354 * -2085428027 << 6) + (this.field2348 * 1104824061 << 3) || n2 > (1104824061 * this.field2348 << 3) + (this.field2354 * -2085428027 << 6) + 7) {
                return false;
            }
            if (n3 >= -1516355947) {
                throw new IllegalStateException();
            }
            return true;
            b = false;
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jy.aw(" + ')');
        }
    }
    
    @Override
    public void am(final Buffer buffer) {
        this.field2350 = Buffer.ra(buffer, (byte)7) * -153706445;
        this.field2353 = Buffer.ra(buffer, (byte)7) * 74409863;
        this.field2346 = buffer.readUnsignedShort(-1737366852) * -1522795523;
        this.field2349 = Buffer.ra(buffer, (byte)7) * -1051832785;
        this.field2347 = buffer.readUnsignedShort(-1827569325) * 3551631;
        this.field2351 = Buffer.ra(buffer, (byte)7) * -1804437699;
        this.field2345 = buffer.readUnsignedShort(-1383004988) * 1517975849;
        this.field2352 = Buffer.ra(buffer, (byte)7) * 1932656209;
        this.field2354 = buffer.readUnsignedShort(606745035) * -426051059;
        this.field2348 = Buffer.ra(buffer, (byte)7) * 137791061;
        this.method1488(729368537);
    }
    
    @Override
    public void al(final WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX * 77939951 > 646918937 * this.field2345) {
            worldMapArea.regionLowX = -694790025 * this.field2345;
        }
        if (1854846129 * worldMapArea.regionHighX < 646918937 * this.field2345) {
            worldMapArea.regionHighX = this.field2345 * 92282601;
        }
        if (worldMapArea.regionLowY * 2059655157 > -2085428027 * this.field2354) {
            worldMapArea.regionLowY = this.field2354 * 1075472273;
        }
        if (worldMapArea.regionHighY * -1086956513 < -2085428027 * this.field2354) {
            worldMapArea.regionHighY = this.field2354 * 1758667419;
        }
    }
    
    @Override
    public boolean containsCoord(final int n, final int n2, final int n3, final byte b) {
        try {
            if (n >= -1060807941 * this.field2350) {
                if (b >= 10) {
                    throw new IllegalStateException();
                }
                if (n < this.field2353 * -1519014345 + this.field2350 * -1060807941) {
                    if (n2 >= (this.field2346 * 268581205 << 6) + (this.field2349 * 605272271 << 3)) {
                        if (b >= 10) {
                            throw new IllegalStateException();
                        }
                        if (n2 <= 7 + ((this.field2349 * 605272271 << 3) + (this.field2346 * 268581205 << 6))) {
                            if (b >= 10) {
                                throw new IllegalStateException();
                            }
                            if (n3 >= (362794351 * this.field2347 << 6) + (-2012178411 * this.field2351 << 3) && n3 <= (this.field2351 * -2012178411 << 3) + (362794351 * this.field2347 << 6) + 7) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (b >= 10) {
                    throw new IllegalStateException();
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jy.an(" + ')');
        }
    }
    
    @Override
    public int[] getBorderTileLengths(final int n, final int n2, final int n3, final byte b) {
        try {
            if (this.containsCoord(n, n2, n3, (byte)(-42))) {
                return new int[] { this.field2345 * -1546860992 - 9327936 * this.field2346 + n2 + (this.field2352 * -201304696 - this.field2349 * 547210872), n3 + (this.field2354 * -323407552 - 1744001984 * this.field2347) + (this.field2348 * 248657896 - 1082441896 * this.field2351) };
            }
            if (b <= 0) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jy.ac(" + ')');
        }
    }
    
    @Override
    public Coord coord(final int n, final int n2, final byte b) {
        try {
            if (!this.containsPosition(n, n2, -2054419050)) {
                return null;
            }
            return new Coord(-1060807941 * this.field2350, 547210872 * this.field2349 - -201304696 * this.field2352 + (9327936 * this.field2346 - -1546860992 * this.field2345 + n), 1082441896 * this.field2351 - this.field2348 * 248657896 + (n2 + (this.field2347 * 1744001984 - -323407552 * this.field2354)));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jy.au(" + ')');
        }
    }
    
    @Override
    public void aa(final WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX * 1747493579 > 200417309 * this.field2345) {
            worldMapArea.regionLowX = -694790025 * this.field2345;
        }
        if (1854846129 * worldMapArea.regionHighX < -1660420949 * this.field2345) {
            worldMapArea.regionHighX = this.field2345 * 92282601;
        }
        if (worldMapArea.regionLowY * -104888762 > -907957007 * this.field2354) {
            worldMapArea.regionLowY = this.field2354 * 1075472273;
        }
        if (worldMapArea.regionHighY * 92797411 < -2085428027 * this.field2354) {
            worldMapArea.regionHighY = this.field2354 * 1487382450;
        }
    }
    
    @Override
    public Coord ai(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1986448320)) {
            return null;
        }
        return new Coord(-1060807941 * this.field2350, 547210872 * this.field2349 - -201304696 * this.field2352 + (9327936 * this.field2346 - -1546860992 * this.field2345 + n), 1082441896 * this.field2351 - this.field2348 * 248657896 + (n2 + (this.field2347 * 1744001984 - -323407552 * this.field2354)));
    }
    
    void by() {
    }
    
    @Override
    public void ar(final Buffer buffer) {
        this.field2350 = Buffer.ra(buffer, (byte)7) * -153706445;
        this.field2353 = Buffer.ra(buffer, (byte)7) * 74409863;
        this.field2346 = buffer.readUnsignedShort(-311262912) * -1522795523;
        this.field2349 = Buffer.ra(buffer, (byte)7) * -1051832785;
        this.field2347 = buffer.readUnsignedShort(-1213820090) * 3551631;
        this.field2351 = Buffer.ra(buffer, (byte)7) * -1804437699;
        this.field2345 = buffer.readUnsignedShort(-994853023) * 1517975849;
        this.field2352 = Buffer.ra(buffer, (byte)7) * 1932656209;
        this.field2354 = buffer.readUnsignedShort(-537518872) * -426051059;
        this.field2348 = Buffer.ra(buffer, (byte)7) * 137791061;
        this.method1488(218847638);
    }
    
    @Override
    public boolean ap(final int n, final int n2, final int n3) {
        return n >= -1060807941 * this.field2350 && n < this.field2353 * -1041907261 + this.field2350 * -1060807941 && n2 >= (this.field2346 * 781218082 << 6) + (this.field2349 * 1714664462 << 3) && n2 <= 7 + ((this.field2349 * 2080085357 << 3) + (this.field2346 * 268581205 << 6)) && n3 >= (362794351 * this.field2347 << 6) + (1566834611 * this.field2351 << 3) && n3 <= (this.field2351 * 1321535704 << 3) + (362794351 * this.field2347 << 6) + 7;
    }
    
    public static int expandBounds(final int n, final int n2) {
        try {
            final VarbitComposition vmethod3248 = class158.vmethod3248(n, -1334878542);
            final int n3 = vmethod3248.baseVar * 470400793;
            final int n4 = 1050888611 * vmethod3248.startBit;
            return Varps.Varps_main[n3] >> n4 & Varps.Varps_masks[vmethod3248.endBit * 1130237503 - n4];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jy.af(" + ')');
        }
    }
    
    @Override
    public void expandBounds(final WorldMapArea worldMapArea, final int n) {
        try {
            if (worldMapArea.regionLowX * 77939951 > 646918937 * this.field2345) {
                if (n <= 854271946) {
                    throw new IllegalStateException();
                }
                worldMapArea.regionLowX = -694790025 * this.field2345;
            }
            if (1854846129 * worldMapArea.regionHighX < 646918937 * this.field2345) {
                worldMapArea.regionHighX = this.field2345 * 92282601;
            }
            if (worldMapArea.regionLowY * 2059655157 > -2085428027 * this.field2354) {
                if (n <= 854271946) {
                    throw new IllegalStateException();
                }
                worldMapArea.regionLowY = this.field2354 * 1075472273;
            }
            if (worldMapArea.regionHighY * -1086956513 < -2085428027 * this.field2354) {
                if (n <= 854271946) {
                    return;
                }
                worldMapArea.regionHighY = this.field2354 * 1758667419;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jy.af(" + ')');
        }
    }
    
    @Override
    public void read(final Buffer buffer, final byte b) {
        try {
            this.field2350 = Buffer.ra(buffer, (byte)7) * -153706445;
            this.field2353 = Buffer.ra(buffer, (byte)7) * 74409863;
            this.field2346 = buffer.readUnsignedShort(414597028) * -1522795523;
            this.field2349 = Buffer.ra(buffer, (byte)7) * -1051832785;
            this.field2347 = buffer.readUnsignedShort(448456406) * 3551631;
            this.field2351 = Buffer.ra(buffer, (byte)7) * -1804437699;
            this.field2345 = buffer.readUnsignedShort(188283728) * 1517975849;
            this.field2352 = Buffer.ra(buffer, (byte)7) * 1932656209;
            this.field2354 = buffer.readUnsignedShort(-2063502861) * -426051059;
            this.field2348 = Buffer.ra(buffer, (byte)7) * 137791061;
            this.method1488(-1809982320);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jy.ab(" + ')');
        }
    }
    
    void method1488(final int n) {
    }
    
    @Override
    public void aj(final Buffer buffer) {
        this.field2350 = Buffer.ra(buffer, (byte)7) * -153706445;
        this.field2353 = Buffer.ra(buffer, (byte)7) * 74409863;
        this.field2346 = buffer.readUnsignedShort(-1241397749) * -1522795523;
        this.field2349 = Buffer.ra(buffer, (byte)7) * -1051832785;
        this.field2347 = buffer.readUnsignedShort(376545408) * 3551631;
        this.field2351 = Buffer.ra(buffer, (byte)7) * -1804437699;
        this.field2345 = buffer.readUnsignedShort(-495754110) * 1517975849;
        this.field2352 = Buffer.ra(buffer, (byte)7) * 1932656209;
        this.field2354 = buffer.readUnsignedShort(-1766374274) * -426051059;
        this.field2348 = Buffer.ra(buffer, (byte)7) * 137791061;
        this.method1488(1336052723);
    }
    
    @Override
    public Coord ag(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1564596333)) {
            return null;
        }
        return new Coord(-1060807941 * this.field2350, 547210872 * this.field2349 - -201304696 * this.field2352 + (119258326 * this.field2346 - -1546860992 * this.field2345 + n), 1082441896 * this.field2351 - this.field2348 * 248657896 + (n2 + (this.field2347 * 1958774821 - -323407552 * this.field2354)));
    }
    
    @Override
    public Coord ah(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1560199223)) {
            return null;
        }
        return new Coord(-203537750 * this.field2350, 547210872 * this.field2349 - 1478881004 * this.field2352 + (-1553179120 * this.field2346 - -1546860992 * this.field2345 + n), -1981001301 * this.field2351 - this.field2348 * 248657896 + (n2 + (this.field2347 * 85241671 - -661190100 * this.field2354)));
    }
}
