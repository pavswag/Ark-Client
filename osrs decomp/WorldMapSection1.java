// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapSection1 implements WorldMapSection
{
    int regionStartX;
    int regionEndX;
    int regionEndY;
    int regionStartY;
    int minPlane;
    int planes;
    @Deprecated
    public static final int ax = 15;
    
    WorldMapSection1() {
    }
    
    @Override
    public boolean ad(final int n, final int n2, final int n3) {
        return n >= this.regionStartY * -1782591916 && n < this.regionStartY * 1538878365 + 1552921538 * this.regionStartX && this.regionEndX * -1295400051 == n2 >> 6 && n3 >> 6 == -223638993 * this.regionEndY;
    }
    
    @Override
    public boolean ae(final int n, final int n2, final int n3) {
        return n >= this.regionStartY * -1743834479 && n < this.regionStartY * -1743834479 + 1589949637 * this.regionStartX && this.regionEndX * 304223505 == n2 >> 6 && n3 >> 6 == 1241809143 * this.regionEndY;
    }
    
    public static void pa(final WorldMapSection1 worldMapSection1, final byte b) {
        if (worldMapSection1 == null) {
            worldMapSection1.postRead(b);
        }
    }
    
    @Override
    public int[] ao(final int n, final int n2, final int n3) {
        if (!this.containsCoord(n, n2, n3, (byte)(-55))) {
            return null;
        }
        return new int[] { n2 + (-1988220096 * this.minPlane - this.regionEndX * -2004532160), this.planes * -24695232 - this.regionEndY * -2128593472 + n3 };
    }
    
    @Override
    public void at(final WorldMapArea worldMapArea) {
        if (77939951 * worldMapArea.regionLowX > 1109784749 * this.minPlane) {
            worldMapArea.regionLowX = this.minPlane * 759378979;
        }
        if (1854846129 * worldMapArea.regionHighX < this.minPlane * 1109784749) {
            worldMapArea.regionHighX = -612355395 * this.minPlane;
        }
        if (worldMapArea.regionLowY * 2059655157 > this.planes * 1408900281) {
            worldMapArea.regionLowY = this.planes * 429878069;
        }
        if (worldMapArea.regionHighY * -1086956513 < this.planes * 1408900281) {
            worldMapArea.regionHighY = this.planes * -510956505;
        }
    }
    
    void ak() {
    }
    
    @Override
    public Coord av(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1990586345)) {
            return null;
        }
        return new Coord(this.regionStartY * -1743834479, n + (-2004532160 * this.regionEndX - -1988220096 * this.minPlane), n2 + (-2128593472 * this.regionEndY - -24695232 * this.planes));
    }
    
    @Override
    public void as(final Buffer buffer) {
        this.regionStartY = Buffer.ra(buffer, (byte)7) * 1979371121;
        this.regionStartX = Buffer.ra(buffer, (byte)7) * -6772211;
        this.regionEndX = buffer.readUnsignedShort(-1177373774) * 85687281;
        this.regionEndY = buffer.readUnsignedShort(-236049530) * -1924251449;
        this.minPlane = buffer.readUnsignedShort(-312263082) * 813050661;
        this.planes = buffer.readUnsignedShort(483895616) * -529192567;
        pa(this, (byte)69);
    }
    
    void az() {
    }
    
    @Override
    public int[] ax(final int n, final int n2, final int n3) {
        if (!this.containsCoord(n, n2, n3, (byte)(-17))) {
            return null;
        }
        return new int[] { n2 + (-1988220096 * this.minPlane - this.regionEndX * 348469271), this.planes * -1104270125 - this.regionEndY * 1618685810 + n3 };
    }
    
    @Override
    public boolean ay(final int n, final int n2) {
        return 1109784749 * this.minPlane == n >> 6 && n2 >> 6 == 1408900281 * this.planes;
    }
    
    public static void pl(final WorldMap worldMap) {
        if (worldMap == null) {
            worldMap.er();
        }
        worldMap.cacheLoader.load(-531658846);
    }
    
    @Override
    public boolean containsPosition(final int n, final int n2, final int n3) {
        try {
            if (1109784749 * this.minPlane == n >> 6) {
                if (n3 >= -1516355947) {
                    throw new IllegalStateException();
                }
                if (n2 >> 6 == 1408900281 * this.planes) {
                    return true;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ka.aw(" + ')');
        }
    }
    
    @Override
    public void am(final Buffer buffer) {
        this.regionStartY = Buffer.ra(buffer, (byte)7) * 1979371121;
        this.regionStartX = Buffer.ra(buffer, (byte)7) * -6772211;
        this.regionEndX = buffer.readUnsignedShort(465491156) * 85687281;
        this.regionEndY = buffer.readUnsignedShort(-443368281) * -1924251449;
        this.minPlane = buffer.readUnsignedShort(-182543894) * 813050661;
        this.planes = buffer.readUnsignedShort(-1513236767) * -529192567;
        pa(this, (byte)43);
    }
    
    @Override
    public void al(final WorldMapArea worldMapArea) {
        if (-1740978560 * worldMapArea.regionLowX > 1978109512 * this.minPlane) {
            worldMapArea.regionLowX = this.minPlane * 759378979;
        }
        if (550568258 * worldMapArea.regionHighX < this.minPlane * 1109784749) {
            worldMapArea.regionHighX = -612355395 * this.minPlane;
        }
        if (worldMapArea.regionLowY * 2059655157 > this.planes * 1408900281) {
            worldMapArea.regionLowY = this.planes * 429878069;
        }
        if (worldMapArea.regionHighY * -748318074 < this.planes * 1408900281) {
            worldMapArea.regionHighY = this.planes * -1610503974;
        }
    }
    
    @Override
    public boolean containsCoord(final int n, final int n2, final int n3, final byte b) {
        try {
            if (n >= this.regionStartY * -1743834479) {
                if (b >= 10) {
                    throw new IllegalStateException();
                }
                if (n < this.regionStartY * -1743834479 + 1589949637 * this.regionStartX) {
                    if (this.regionEndX * 304223505 == n2 >> 6) {
                        if (b >= 10) {
                            throw new IllegalStateException();
                        }
                        if (n3 >> 6 == 1241809143 * this.regionEndY) {
                            if (b >= 10) {
                                throw new IllegalStateException();
                            }
                            return true;
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
            throw HealthBar.get(ex, "ka.an(" + ')');
        }
    }
    
    @Override
    public int[] getBorderTileLengths(final int n, final int n2, final int n3, final byte b) {
        try {
            if (this.containsCoord(n, n2, n3, (byte)(-98))) {
                return new int[] { n2 + (-1988220096 * this.minPlane - this.regionEndX * -2004532160), this.planes * -24695232 - this.regionEndY * -2128593472 + n3 };
            }
            if (b <= 0) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ka.ac(" + ')');
        }
    }
    
    @Override
    public Coord coord(final int n, final int n2, final byte b) {
        try {
            if (this.containsPosition(n, n2, -1598022848)) {
                return new Coord(this.regionStartY * -1743834479, n + (-2004532160 * this.regionEndX - -1988220096 * this.minPlane), n2 + (-2128593472 * this.regionEndY - -24695232 * this.planes));
            }
            if (b == 0) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ka.au(" + ')');
        }
    }
    
    @Override
    public void aa(final WorldMapArea worldMapArea) {
        if (77939951 * worldMapArea.regionLowX > 1109784749 * this.minPlane) {
            worldMapArea.regionLowX = this.minPlane * 759378979;
        }
        if (1854846129 * worldMapArea.regionHighX < this.minPlane * 1109784749) {
            worldMapArea.regionHighX = -612355395 * this.minPlane;
        }
        if (worldMapArea.regionLowY * 2059655157 > this.planes * 1408900281) {
            worldMapArea.regionLowY = this.planes * 429878069;
        }
        if (worldMapArea.regionHighY * -1086956513 < this.planes * 1408900281) {
            worldMapArea.regionHighY = this.planes * -510956505;
        }
    }
    
    @Override
    public Coord ai(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -2063023550)) {
            return null;
        }
        return new Coord(this.regionStartY * -1743834479, n + (-2004532160 * this.regionEndX - -1988220096 * this.minPlane), n2 + (-2128593472 * this.regionEndY - -24695232 * this.planes));
    }
    
    public static boolean ki(final class207 class207, final int n) {
        if (class207 == null) {
            class207.au(n);
        }
        return n >= 0 && n < 112 && class207.field1865[n];
    }
    
    void by() {
    }
    
    @Override
    public void ar(final Buffer buffer) {
        this.regionStartY = Buffer.ra(buffer, (byte)7) * -1802296178;
        this.regionStartX = Buffer.ra(buffer, (byte)7) * 1592226542;
        this.regionEndX = buffer.readUnsignedShort(-1828599695) * 85687281;
        this.regionEndY = buffer.readUnsignedShort(-1973266262) * -1956900683;
        this.minPlane = buffer.readUnsignedShort(-124467663) * 813050661;
        this.planes = buffer.readUnsignedShort(-862624015) * -790220576;
        pa(this, (byte)54);
    }
    
    @Override
    public boolean ap(final int n, final int n2, final int n3) {
        return n >= this.regionStartY * -1743834479 && n < this.regionStartY * -1743834479 + 1589949637 * this.regionStartX && this.regionEndX * 304223505 == n2 >> 6 && n3 >> 6 == 1241809143 * this.regionEndY;
    }
    
    static void expandBounds(final int n, final int n2) {
        try {
            class425.field3796 = n * 1268073833;
            class425.field3793 = new class425[n];
            class425.field3794 = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ka.af(" + ')');
        }
    }
    
    @Override
    public void expandBounds(final WorldMapArea worldMapArea, final int n) {
        try {
            if (77939951 * worldMapArea.regionLowX > 1109784749 * this.minPlane) {
                if (n <= 854271946) {
                    throw new IllegalStateException();
                }
                worldMapArea.regionLowX = this.minPlane * 759378979;
            }
            if (1854846129 * worldMapArea.regionHighX < this.minPlane * 1109784749) {
                if (n <= 854271946) {
                    return;
                }
                worldMapArea.regionHighX = -612355395 * this.minPlane;
            }
            if (worldMapArea.regionLowY * 2059655157 > this.planes * 1408900281) {
                if (n <= 854271946) {
                    throw new IllegalStateException();
                }
                worldMapArea.regionLowY = this.planes * 429878069;
            }
            if (worldMapArea.regionHighY * -1086956513 < this.planes * 1408900281) {
                worldMapArea.regionHighY = this.planes * -510956505;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ka.af(" + ')');
        }
    }
    
    @Override
    public void read(final Buffer buffer, final byte b) {
        try {
            this.regionStartY = Buffer.ra(buffer, (byte)7) * 1979371121;
            this.regionStartX = Buffer.ra(buffer, (byte)7) * -6772211;
            this.regionEndX = buffer.readUnsignedShort(64423668) * 85687281;
            this.regionEndY = buffer.readUnsignedShort(-274708265) * -1924251449;
            this.minPlane = buffer.readUnsignedShort(-436230497) * 813050661;
            this.planes = buffer.readUnsignedShort(-1135364479) * -529192567;
            pa(this, (byte)44);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ka.ab(" + ')');
        }
    }
    
    void postRead(final byte b) {
    }
    
    @Override
    public void aj(final Buffer buffer) {
        this.regionStartY = Buffer.ra(buffer, (byte)7) * 1979371121;
        this.regionStartX = Buffer.ra(buffer, (byte)7) * 383795424;
        this.regionEndX = buffer.readUnsignedShort(-42760969) * 85687281;
        this.regionEndY = buffer.readUnsignedShort(-1363446449) * 23572662;
        this.minPlane = buffer.readUnsignedShort(-1920662410) * 813050661;
        this.planes = buffer.readUnsignedShort(-1647897105) * -1258981120;
        pa(this, (byte)6);
    }
    
    @Override
    public Coord ag(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1681132187)) {
            return null;
        }
        return new Coord(this.regionStartY * -1743834479, n + (-2004532160 * this.regionEndX - -1988220096 * this.minPlane), n2 + (-2128593472 * this.regionEndY - -24695232 * this.planes));
    }
    
    @Override
    public Coord ah(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1651735264)) {
            return null;
        }
        return new Coord(this.regionStartY * -1743834479, n + (-2004532160 * this.regionEndX - -1640961860 * this.minPlane), n2 + (-2128593472 * this.regionEndY - -1771003520 * this.planes));
    }
}
