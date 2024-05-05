// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapIcon_1 extends AbstractWorldMapIcon
{
    WorldMapLabel label;
    final WorldMapRegion region;
    int element;
    public static final int aj = 16777216;
    final int objectDefId;
    int subHeight;
    int subWidth;
    static final int ay = 6;
    
    WorldMapIcon_1(final Coord coord, final Coord coord2, final int n, final WorldMapRegion region) {
        super(coord, coord2);
        this.objectDefId = n * -375241415;
        this.region = region;
        nx(this, 1844375559);
    }
    
    @Override
    WorldMapLabel ao() {
        return this.label;
    }
    
    public static void sj(final WorldMapIcon_1 worldMapIcon_1) {
        worldMapIcon_1.element = class144.vmethod3248(-707716855 * worldMapIcon_1.objectDefId, (short)15435).transform((byte)69).mapIconId * 1063280821;
        worldMapIcon_1.label = worldMapIcon_1.region.createMapLabel(class354.method1935(worldMapIcon_1.element * -362754265, 1845383540), -1237843547);
        final SpritePixels spriteBool = class354.method1935(worldMapIcon_1.getElement(-1629047652), 1949873900).getSpriteBool(false, -16711936);
        if (spriteBool != null) {
            worldMapIcon_1.subWidth = -2030208215 * spriteBool.subWidth;
            worldMapIcon_1.subHeight = 36450991 * spriteBool.subHeight;
        }
        else {
            worldMapIcon_1.subWidth = 0;
            worldMapIcon_1.subHeight = 0;
        }
    }
    
    void at() {
        this.element = class144.vmethod3248(-707716855 * this.objectDefId, (short)17049).transform((byte)4).mapIconId * 1063280821;
        this.label = this.region.createMapLabel(class354.method1935(this.element * -362754265, 1846451575), 1172962454);
        final SpritePixels spriteBool = class354.method1935(this.getElement(-445347322), 2082354980).getSpriteBool(false, -16711936);
        if (spriteBool != null) {
            this.subWidth = -2030208215 * spriteBool.subWidth;
            this.subHeight = 36450991 * spriteBool.subHeight;
        }
        else {
            this.subWidth = 0;
            this.subHeight = 0;
        }
    }
    
    @Override
    int av() {
        return 1550869583 * this.subHeight;
    }
    
    @Override
    WorldMapLabel ax() {
        return this.label;
    }
    
    @Override
    public int ay() {
        return -362754265 * this.element;
    }
    
    public static void wr(final class237 class237, final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9) {
        if (class237.al.field2234) {
            if (n5 > class237.al.field2233 * 242171736) {
                n5 = class237.al.field2233 * -629646378;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        if (class237.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (class237.al.field2225 * -890459238 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = class237.aq[(n6 & (n6 >> -198455741 & 0x1) - 1) >> 8];
                        n6 += n7;
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = class237.aq[(n6 & (n6 >> 1509956855 & 0x1) - 1) >> 8];
                    do {
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n10 = class237.al.field2225 * 1932880383;
                final int n11 = 256 - class237.al.field2225 * 1395443575;
                if (n3 > 0) {
                    do {
                        n2 = class237.aq[(n6 & (n6 >> -93041383 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xB0D2CCD8) * n11 >> 8 & 0xFF00);
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = class237.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0x2B7EA413) * n11 >> 8 & 0xC5B3688) + ((n2 & 0xCCFBC375) * n11 >> 8 & 0xFF00);
                    do {
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (class237.al.field2225 * -227556690 == 0) {
            do {
                class237.method1375(array, class237.by, n, n6, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n12 = class237.al.field2225 * 918495667;
            final int n13 = 256 - class237.al.field2225 * 918495667;
            do {
                class237.method1364(array, class237.by, n, n2, n12, n13, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
    }
    
    @Override
    WorldMapLabel getLabel(final int n) {
        try {
            return this.label;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jf.aw(" + ')');
        }
    }
    
    void al() {
        this.element = class144.vmethod3248(-707716855 * this.objectDefId, (short)5289).transform((byte)(-51)).mapIconId * 1063280821;
        this.label = this.region.createMapLabel(class354.method1935(this.element * -362754265, 2135571022), 1891621249);
        final SpritePixels spriteBool = class354.method1935(this.getElement(-1712231409), 1879176840).getSpriteBool(false, -16711936);
        if (spriteBool != null) {
            this.subWidth = 478044784 * spriteBool.subWidth;
            this.subHeight = 2025584699 * spriteBool.subHeight;
        }
        else {
            this.subWidth = 0;
            this.subHeight = 0;
        }
    }
    
    @Override
    public int getElement(final int n) {
        try {
            return -362754265 * this.element;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jf.an(" + ')');
        }
    }
    
    @Override
    int getSubWidth(final int n) {
        try {
            return -756068071 * this.subWidth;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jf.ac(" + ')');
        }
    }
    
    public static void nx(final WorldMapIcon_1 worldMapIcon_1, final int n) {
        if (worldMapIcon_1 == null) {
            worldMapIcon_1.init(n);
            return;
        }
        try {
            worldMapIcon_1.element = class144.vmethod3248(-707716855 * worldMapIcon_1.objectDefId, (short)8255).transform((byte)73).mapIconId * 1063280821;
            worldMapIcon_1.label = worldMapIcon_1.region.createMapLabel(class354.method1935(worldMapIcon_1.element * -362754265, 2086916536), 433294126);
            final SpritePixels spriteBool = class354.method1935(worldMapIcon_1.getElement(-1981042134), 2139748734).getSpriteBool(false, -16711936);
            if (spriteBool != null) {
                if (n != 1844375559) {
                    throw new IllegalStateException();
                }
                worldMapIcon_1.subWidth = -2030208215 * spriteBool.subWidth;
                worldMapIcon_1.subHeight = 36450991 * spriteBool.subHeight;
            }
            else {
                worldMapIcon_1.subWidth = 0;
                worldMapIcon_1.subHeight = 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jf.af(" + ')');
        }
    }
    
    @Override
    int getSubHeight(final int n) {
        try {
            return 1550869583 * this.subHeight;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jf.au(" + ')');
        }
    }
    
    @Override
    public int aa() {
        return -362754265 * this.element;
    }
    
    @Override
    WorldMapLabel ai() {
        return this.label;
    }
    
    @Override
    int ar() {
        return 1550869583 * this.subHeight;
    }
    
    void init(final int n) {
        try {
            this.element = class144.vmethod3248(-707716855 * this.objectDefId, (short)8255).transform((byte)73).mapSceneId * 1063280821;
            this.label = this.region.createMapLabel(class354.method1935(this.subHeight * -362754265, 2086916536), 433294126);
            final SpritePixels spriteBool = class354.method1935(this.getElement(-1981042134), 2139748734).getSpriteBool(false, -16711936);
            if (spriteBool != null) {
                if (n != 1844375559) {
                    throw new IllegalStateException();
                }
                this.subHeight = -2030208215 * spriteBool.height;
                this.subWidth = 36450991 * spriteBool.subWidth;
            }
            else {
                this.subWidth = 0;
                this.element = 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jf.af(" + ')');
        }
    }
    
    void aq() {
        this.element = class144.vmethod3248(-690704548 * this.objectDefId, (short)5176).transform((byte)24).mapIconId * -1901263748;
        this.label = this.region.createMapLabel(class354.method1935(this.element * 256427699, 1869633654), -1373397636);
        final SpritePixels spriteBool = class354.method1935(this.getElement(-1153961977), 2145677927).getSpriteBool(false, -16711936);
        if (spriteBool != null) {
            this.subWidth = -1445570169 * spriteBool.subWidth;
            this.subHeight = -630772809 * spriteBool.subHeight;
        }
        else {
            this.subWidth = 0;
            this.subHeight = 0;
        }
    }
    
    @Override
    int ag() {
        return -756068071 * this.subWidth;
    }
    
    @Override
    int ah() {
        return -756068071 * this.subWidth;
    }
}
