// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapSection2 implements WorldMapSection
{
    static Widget[] field2292;
    int field2293;
    int minPlane;
    int regionStartX;
    int regionEndX;
    int regionEndY;
    int regionStartY;
    int field2299;
    int field2300;
    int planes;
    int field2302;
    
    WorldMapSection2() {
    }
    
    @Override
    public boolean ad(final int n, final int n2, final int n3) {
        return n >= 2017495751 * this.minPlane && n < this.minPlane * 2017495751 + 737827993 * this.planes && n2 >> 6 >= 2029294685 * this.regionStartX && n2 >> 6 <= this.regionEndX * 1316670953 && n3 >> 6 >= this.regionStartY * 1330856607 && n3 >> 6 <= 140125345 * this.regionEndY;
    }
    
    @Override
    public boolean ae(final int n, final int n2, final int n3) {
        return n >= 2017495751 * this.minPlane && n < this.minPlane * 2017495751 + 737827993 * this.planes && n2 >> 6 >= 2029294685 * this.regionStartX && n2 >> 6 <= this.regionEndX * 1316670953 && n3 >> 6 >= this.regionStartY * 1330856607 && n3 >> 6 <= 140125345 * this.regionEndY;
    }
    
    @Override
    public int[] ao(final int n, final int n2, final int n3) {
        if (!this.containsCoord(n, n2, n3, (byte)(-85))) {
            return null;
        }
        return new int[] { n2 + (this.field2293 * 1725242048 - 1025840960 * this.regionStartX), -1751446592 * this.field2299 - this.regionStartY * -724523072 + n3 };
    }
    
    @Override
    public void at(final WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX * 77939951 > 1210512068 * this.field2293) {
            worldMapArea.regionLowX = this.field2293 * 829177925;
        }
        if (worldMapArea.regionHighX * -1929477692 < 758652409 * this.field2300) {
            worldMapArea.regionHighX = this.field2300 * 652996553;
        }
        if (worldMapArea.regionLowY * 2059655157 > this.field2299 * 710831151) {
            worldMapArea.regionLowY = -46432480 * this.field2299;
        }
        if (worldMapArea.regionHighY * -1086956513 < -422674435 * this.field2302) {
            worldMapArea.regionHighY = this.field2302 * 1310400611;
        }
    }
    
    void ak() {
    }
    
    @Override
    public Coord av(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1652886866)) {
            return null;
        }
        return new Coord(2017495751 * this.minPlane, 1025840960 * this.regionStartX - 1725242048 * this.field2293 + n, n2 + (-724523072 * this.regionStartY - this.field2299 * -1751446592));
    }
    
    @Override
    public void as(final Buffer buffer) {
        this.minPlane = Buffer.ra(buffer, (byte)7) * 2079767220;
        this.planes = Buffer.ra(buffer, (byte)7) * 1486281987;
        this.regionStartX = buffer.readUnsignedShort(-103110496) * 328719439;
        this.regionStartY = buffer.readUnsignedShort(-1692911648) * 1906673788;
        this.regionEndX = buffer.readUnsignedShort(-1950929475) * 474849618;
        this.regionEndY = buffer.readUnsignedShort(-1880819192) * -1214689094;
        this.field2293 = buffer.readUnsignedShort(796173665) * -704333757;
        this.field2299 = buffer.readUnsignedShort(-1372287269) * 284846182;
        this.field2300 = buffer.readUnsignedShort(-1278871725) * 1179542563;
        this.field2302 = buffer.readUnsignedShort(-914464013) * 615243557;
        dh(this, 344912093);
    }
    
    void az() {
    }
    
    @Override
    public int[] ax(final int n, final int n2, final int n3) {
        if (!this.containsCoord(n, n2, n3, (byte)(-125))) {
            return null;
        }
        return new int[] { n2 + (this.field2293 * -672612057 - 1025840960 * this.regionStartX), 1104879798 * this.field2299 - this.regionStartY * 1823588154 + n3 };
    }
    
    @Override
    public boolean ay(final int n, final int n2) {
        return n >> 6 >= this.field2293 * 1704678507 && n >> 6 <= -1767286016 * this.field2300 && n2 >> 6 >= 710831151 * this.field2299 && n2 >> 6 <= -422674435 * this.field2302;
    }
    
    public static void dh(final WorldMapSection2 worldMapSection2, final int n) {
        if (worldMapSection2 == null) {
            worldMapSection2.postRead(n);
            return;
        }
    }
    
    @Override
    public boolean containsPosition(final int n, final int n2, final int n3) {
        try {
            if (n >> 6 < this.field2293 * 1704678507) {
                return false;
            }
            if (n3 >= -1516355947) {
                throw new IllegalStateException();
            }
            if (n >> 6 > 758652409 * this.field2300) {
                return false;
            }
            if (n3 >= -1516355947) {
                throw new IllegalStateException();
            }
            if (n2 >> 6 < 710831151 * this.field2299) {
                return false;
            }
            if (n3 >= -1516355947) {
                throw new IllegalStateException();
            }
            if (n2 >> 6 > -422674435 * this.field2302) {
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
            throw HealthBar.get(ex, "jw.aw(" + ')');
        }
    }
    
    @Override
    public void am(final Buffer buffer) {
        this.minPlane = Buffer.ra(buffer, (byte)7) * -1899292937;
        this.planes = Buffer.ra(buffer, (byte)7) * -856410199;
        this.regionStartX = buffer.readUnsignedShort(675887796) * -932847627;
        this.regionStartY = buffer.readUnsignedShort(136248921) * -308413167;
        this.regionEndX = buffer.readUnsignedShort(-678759215) * -940441052;
        this.regionEndY = buffer.readUnsignedShort(740688582) * -21466973;
        this.field2293 = buffer.readUnsignedShort(-613077146) * -704333757;
        this.field2299 = buffer.readUnsignedShort(-467641773) * -22713238;
        this.field2300 = buffer.readUnsignedShort(-1337000430) * 975640348;
        this.field2302 = buffer.readUnsignedShort(785903560) * 1771376671;
        dh(this, 344912093);
    }
    
    @Override
    public void al(final WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX * 77939951 > 1704678507 * this.field2293) {
            worldMapArea.regionLowX = this.field2293 * 829177925;
        }
        if (worldMapArea.regionHighX * 1854846129 < 758652409 * this.field2300) {
            worldMapArea.regionHighX = this.field2300 * 652996553;
        }
        if (worldMapArea.regionLowY * 2059655157 > this.field2299 * 710831151) {
            worldMapArea.regionLowY = 1834070291 * this.field2299;
        }
        if (worldMapArea.regionHighY * -1086956513 < -422674435 * this.field2302) {
            worldMapArea.regionHighY = this.field2302 * 1310400611;
        }
    }
    
    @Override
    public boolean containsCoord(final int n, final int n2, final int n3, final byte b) {
        try {
            if (n >= 2017495751 * this.minPlane) {
                if (b >= 10) {
                    throw new IllegalStateException();
                }
                if (n < this.minPlane * 2017495751 + 737827993 * this.planes) {
                    if (n2 >> 6 >= 2029294685 * this.regionStartX) {
                        if (b >= 10) {
                            throw new IllegalStateException();
                        }
                        if (n2 >> 6 <= this.regionEndX * 1316670953) {
                            if (b >= 10) {
                                throw new IllegalStateException();
                            }
                            if (n3 >> 6 >= this.regionStartY * 1330856607 && n3 >> 6 <= 140125345 * this.regionEndY) {
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
            throw HealthBar.get(ex, "jw.an(" + ')');
        }
    }
    
    @Override
    public int[] getBorderTileLengths(final int n, final int n2, final int n3, final byte b) {
        try {
            if (this.containsCoord(n, n2, n3, (byte)(-52))) {
                return new int[] { n2 + (this.field2293 * 1725242048 - 1025840960 * this.regionStartX), -1751446592 * this.field2299 - this.regionStartY * -724523072 + n3 };
            }
            if (b <= 0) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jw.ac(" + ')');
        }
    }
    
    @Override
    public Coord coord(final int n, final int n2, final byte b) {
        try {
            if (this.containsPosition(n, n2, -1784349865)) {
                return new Coord(2017495751 * this.minPlane, 1025840960 * this.regionStartX - 1725242048 * this.field2293 + n, n2 + (-724523072 * this.regionStartY - this.field2299 * -1751446592));
            }
            if (b == 0) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jw.au(" + ')');
        }
    }
    
    @Override
    public void aa(final WorldMapArea worldMapArea) {
        if (worldMapArea.regionLowX * 77939951 > 1704678507 * this.field2293) {
            worldMapArea.regionLowX = this.field2293 * 829177925;
        }
        if (worldMapArea.regionHighX * 1781289575 < 1346938244 * this.field2300) {
            worldMapArea.regionHighX = this.field2300 * -2050606310;
        }
        if (worldMapArea.regionLowY * -419265587 > this.field2299 * 710831151) {
            worldMapArea.regionLowY = 1834070291 * this.field2299;
        }
        if (worldMapArea.regionHighY * -1086956513 < 1636249090 * this.field2302) {
            worldMapArea.regionHighY = this.field2302 * 2046277510;
        }
    }
    
    @Override
    public Coord ai(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -2103759804)) {
            return null;
        }
        return new Coord(-772430433 * this.minPlane, 1220717737 * this.regionStartX - 1591158798 * this.field2293 + n, n2 + (1068337342 * this.regionStartY - this.field2299 * -894931480));
    }
    
    @Override
    public void ar(final Buffer buffer) {
        this.minPlane = Buffer.ra(buffer, (byte)7) * -1653194698;
        this.planes = Buffer.ra(buffer, (byte)7) * -856410199;
        this.regionStartX = buffer.readUnsignedShort(-967844449) * -932847627;
        this.regionStartY = buffer.readUnsignedShort(-1279246073) * 1701796191;
        this.regionEndX = buffer.readUnsignedShort(-414389472) * -58271143;
        this.regionEndY = buffer.readUnsignedShort(-1315294345) * -1126232063;
        this.field2293 = buffer.readUnsignedShort(-297291011) * -704333757;
        this.field2299 = buffer.readUnsignedShort(-867706415) * 1891785423;
        this.field2300 = buffer.readUnsignedShort(713808058) * -941091767;
        this.field2302 = buffer.readUnsignedShort(-1704209797) * -2070234314;
        dh(this, 344912093);
    }
    
    @Override
    public boolean ap(final int n, final int n2, final int n3) {
        return n >= 2017495751 * this.minPlane && n < this.minPlane * 2017495751 + 737827993 * this.planes && n2 >> 6 >= 2029294685 * this.regionStartX && n2 >> 6 <= this.regionEndX * 1316670953 && n3 >> 6 >= this.regionStartY * 1330856607 && n3 >> 6 <= 140125345 * this.regionEndY;
    }
    
    @Override
    public void expandBounds(final WorldMapArea worldMapArea, final int n) {
        try {
            if (worldMapArea.regionLowX * 77939951 > 1704678507 * this.field2293) {
                if (n <= 854271946) {
                    throw new IllegalStateException();
                }
                worldMapArea.regionLowX = this.field2293 * 829177925;
            }
            if (worldMapArea.regionHighX * 1854846129 < 758652409 * this.field2300) {
                worldMapArea.regionHighX = this.field2300 * 652996553;
            }
            if (worldMapArea.regionLowY * 2059655157 > this.field2299 * 710831151) {
                worldMapArea.regionLowY = 1834070291 * this.field2299;
            }
            if (worldMapArea.regionHighY * -1086956513 < -422674435 * this.field2302) {
                if (n <= 854271946) {
                    throw new IllegalStateException();
                }
                worldMapArea.regionHighY = this.field2302 * 1310400611;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jw.af(" + ')');
        }
    }
    
    @Override
    public void read(final Buffer buffer, final byte b) {
        try {
            this.minPlane = Buffer.ra(buffer, (byte)7) * -1899292937;
            this.planes = Buffer.ra(buffer, (byte)7) * -856410199;
            this.regionStartX = buffer.readUnsignedShort(384056814) * -932847627;
            this.regionStartY = buffer.readUnsignedShort(-391423841) * 1701796191;
            this.regionEndX = buffer.readUnsignedShort(-557089183) * -58271143;
            this.regionEndY = buffer.readUnsignedShort(-218111752) * -1039876255;
            this.field2293 = buffer.readUnsignedShort(58427976) * -704333757;
            this.field2299 = buffer.readUnsignedShort(519713274) * 1891785423;
            this.field2300 = buffer.readUnsignedShort(-2107975946) * -941091767;
            this.field2302 = buffer.readUnsignedShort(-1312429574) * 643487061;
            dh(this, 344912093);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jw.ab(" + ')');
        }
    }
    
    void postRead(final int n) {
    }
    
    @Override
    public void aj(final Buffer buffer) {
        this.minPlane = Buffer.ra(buffer, (byte)7) * 726282644;
        this.planes = Buffer.ra(buffer, (byte)7) * -856410199;
        this.regionStartX = buffer.readUnsignedShort(647481882) * -932847627;
        this.regionStartY = buffer.readUnsignedShort(-923421050) * 1332114333;
        this.regionEndX = buffer.readUnsignedShort(-2108927711) * -1672842594;
        this.regionEndY = buffer.readUnsignedShort(-1791988310) * 781656406;
        this.field2293 = buffer.readUnsignedShort(52832330) * 864905705;
        this.field2299 = buffer.readUnsignedShort(-2024978238) * 1907796729;
        this.field2300 = buffer.readUnsignedShort(837036376) * -941091767;
        this.field2302 = buffer.readUnsignedShort(-350773947) * 380922611;
        dh(this, 344912093);
    }
    
    @Override
    public Coord ag(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1713609814)) {
            return null;
        }
        return new Coord(2017495751 * this.minPlane, 1025840960 * this.regionStartX - 843708821 * this.field2293 + n, n2 + (-724523072 * this.regionStartY - this.field2299 * 426586987));
    }
    
    @Override
    public Coord ah(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -2063551580)) {
            return null;
        }
        return new Coord(2017495751 * this.minPlane, 1025840960 * this.regionStartX - 1725242048 * this.field2293 + n, n2 + (-724523072 * this.regionStartY - this.field2299 * -1751446592));
    }
}
