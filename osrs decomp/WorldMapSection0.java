// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapSection0 implements WorldMapSection
{
    int newY;
    int newZ;
    int oldX;
    int oldY;
    int newChunkXHigh;
    int newChunkYLow;
    int oldZ;
    int oldChunkYLow;
    int oldChunkXHigh;
    int oldChunkYHigh;
    int newChunkXLow;
    int newX;
    int oldChunkXLow;
    int newChunkYHigh;
    static final int cg = 40;
    static Task js5SocketTask;
    
    WorldMapSection0() {
    }
    
    @Override
    public boolean ad(final int n, final int n2, final int n3) {
        return n >= this.oldZ * -1490859351 && n < this.newZ * -1180089391 + -1490859351 * this.oldZ && n2 >= (1300722649 * this.oldX << 6) + (this.oldChunkXLow * 534868105 << 3) && n2 <= (1356533933 * this.oldChunkXHigh << 3) + (275577107 * this.oldX << 6) + 7 && n3 >= (1257977427 * this.oldChunkYLow << 3) + (-365078831 * this.oldY << 6) && n3 <= 7 + ((this.oldY * -365078831 << 6) + (849738307 * this.oldChunkYHigh << 3));
    }
    
    @Override
    public boolean ae(final int n, final int n2, final int n3) {
        return n >= this.oldZ * -1490859351 && n < this.newZ * -559980366 + -1490859351 * this.oldZ && n2 >= (275577107 * this.oldX << 6) + (this.oldChunkXLow * 534868105 << 3) && n2 <= (593688545 * this.oldChunkXHigh << 3) + (275577107 * this.oldX << 6) + 7 && n3 >= (-2091114020 * this.oldChunkYLow << 3) + (-365078831 * this.oldY << 6) && n3 <= 7 + ((this.oldY * -879088236 << 6) + (849738307 * this.oldChunkYHigh << 3));
    }
    
    @Override
    public int[] ao(final int n, final int n2, final int n3) {
        if (!this.containsCoord(n, n2, n3, (byte)9)) {
            return null;
        }
        return new int[] { this.newChunkXLow * 1733959768 - this.oldChunkXLow * -16022456 + (-760384192 * this.newX - this.oldX * 457065664 + n2), n3 + (this.newY * -795946304 - -1890208704 * this.oldY) + (-1419340680 * this.newChunkYLow - this.oldChunkYLow * 1473884824) };
    }
    
    @Override
    public void at(final WorldMapArea worldMapArea) {
        if (77939951 * worldMapArea.regionLowX > this.newX * -1555384875) {
            worldMapArea.regionLowX = this.newX * -1093871237;
        }
        if (1854846129 * worldMapArea.regionHighX < this.newX * -1555384875) {
            worldMapArea.regionHighX = -2069943195 * this.newX;
        }
        if (worldMapArea.regionLowY * 2059655157 > this.newY * -347980981) {
            worldMapArea.regionLowY = 297795135 * this.newY;
        }
        if (-1086956513 * worldMapArea.regionHighY < this.newY * -347980981) {
            worldMapArea.regionHighY = this.newY * -1984578731;
        }
    }
    
    void ak() {
    }
    
    @Override
    public Coord av(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -2132246929)) {
            return null;
        }
        return new Coord(182968927 * this.oldZ, n + (-1804644540 * this.oldX - -760384192 * this.newX) + (-16022456 * this.oldChunkXLow - 1733959768 * this.newChunkXLow), -583122439 * this.oldY - this.newY * -621876151 + n2 + (1306418391 * this.oldChunkYLow - this.newChunkYLow * 1430819487));
    }
    
    @Override
    public void as(final Buffer buffer) {
        this.oldZ = Buffer.ra(buffer, (byte)7) * -1371866727;
        this.newZ = Buffer.ra(buffer, (byte)7) * 1766061361;
        this.oldX = buffer.readUnsignedShort(-2127584431) * -1529759461;
        this.oldChunkXLow = Buffer.ra(buffer, (byte)7) * -1324677703;
        this.oldChunkXHigh = Buffer.ra(buffer, (byte)7) * 445615137;
        this.oldY = buffer.readUnsignedShort(-1168630828) * 1425588785;
        this.oldChunkYLow = Buffer.ra(buffer, (byte)7) * -1310294565;
        this.oldChunkYHigh = Buffer.ra(buffer, (byte)7) * 597074539;
        this.newX = buffer.readUnsignedShort(-244086563) * -1827087491;
        this.newChunkXLow = Buffer.ra(buffer, (byte)7) * -868079709;
        this.newChunkXHigh = Buffer.ra(buffer, (byte)7) * 1286224719;
        this.newY = buffer.readUnsignedShort(-1984851002) * 781973091;
        this.newChunkYLow = Buffer.ra(buffer, (byte)7) * -1779561361;
        this.newChunkYHigh = Buffer.ra(buffer, (byte)7) * 1519676935;
        this.postRead(-2131816252);
    }
    
    public static int mk(final NPCComposition npcComposition, final int n) {
        if (null != npcComposition.headIconArchiveIds && n < npcComposition.headIconArchiveIds.length) {
            return npcComposition.headIconArchiveIds[n];
        }
        return -1;
    }
    
    @Override
    public int[] ax(final int n, final int n2, final int n3) {
        if (!this.containsCoord(n, n2, n3, (byte)9)) {
            return null;
        }
        return new int[] { this.newChunkXLow * 1733959768 - this.oldChunkXLow * -16022456 + (-760384192 * this.newX - this.oldX * 457065664 + n2), n3 + (this.newY * -795946304 - -1890208704 * this.oldY) + (-1419340680 * this.newChunkYLow - this.oldChunkYLow * 1473884824) };
    }
    
    @Override
    public boolean ay(final int n, final int n2) {
        return n >= (this.newX * -2020277350 << 6) + (102058834 * this.newChunkXLow << 3) && n <= 7 + ((this.newX * 300272147 << 6) + (this.newChunkXHigh * -1911161937 << 3)) && n2 >= (1970066063 * this.newChunkYLow << 3) + (this.newY * -347980981 << 6) && n2 <= 7 + ((-347980981 * this.newY << 6) + (795239435 * this.newChunkYHigh << 3));
    }
    
    @Override
    public boolean containsPosition(final int n, final int n2, final int n3) {
        try {
            if (n >= (this.newX * -1555384875 << 6) + (-320125941 * this.newChunkXLow << 3) && n <= 7 + ((this.newX * -1555384875 << 6) + (this.newChunkXHigh * -1911161937 << 3))) {
                if (n3 >= -1516355947) {
                    throw new IllegalStateException();
                }
                if (n2 >= (1970066063 * this.newChunkYLow << 3) + (this.newY * -347980981 << 6)) {
                    if (n3 >= -1516355947) {
                        throw new IllegalStateException();
                    }
                    if (n2 <= 7 + ((-347980981 * this.newY << 6) + (-264659017 * this.newChunkYHigh << 3))) {
                        return true;
                    }
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ja.aw(" + ')');
        }
    }
    
    @Override
    public void am(final Buffer buffer) {
        this.oldZ = Buffer.ra(buffer, (byte)7) * 4288479;
        this.newZ = Buffer.ra(buffer, (byte)7) * 1334532703;
        this.oldX = buffer.readUnsignedShort(-1609179211) * 1036696445;
        this.oldChunkXLow = Buffer.ra(buffer, (byte)7) * -1324677703;
        this.oldChunkXHigh = Buffer.ra(buffer, (byte)7) * 1551561014;
        this.oldY = buffer.readUnsignedShort(-1210778775) * 1425588785;
        this.oldChunkYLow = Buffer.ra(buffer, (byte)7) * -1310294565;
        this.oldChunkYHigh = Buffer.ra(buffer, (byte)7) * 597074539;
        this.newX = buffer.readUnsignedShort(-777539420) * -1280143687;
        this.newChunkXLow = Buffer.ra(buffer, (byte)7) * 181041380;
        this.newChunkXHigh = Buffer.ra(buffer, (byte)7) * 1286224719;
        this.newY = buffer.readUnsignedShort(-136222874) * 1749797712;
        this.newChunkYLow = Buffer.ra(buffer, (byte)7) * -1779561361;
        this.newChunkYHigh = Buffer.ra(buffer, (byte)7) * 1519676935;
        this.postRead(-1075408323);
    }
    
    @Override
    public void al(final WorldMapArea worldMapArea) {
        if (77939951 * worldMapArea.regionLowX > this.newX * -1179910129) {
            worldMapArea.regionLowX = this.newX * -526945969;
        }
        if (1854846129 * worldMapArea.regionHighX < this.newX * -315432258) {
            worldMapArea.regionHighX = 504046313 * this.newX;
        }
        if (worldMapArea.regionLowY * -1585205486 > this.newY * -1722149978) {
            worldMapArea.regionLowY = 297795135 * this.newY;
        }
        if (-36430645 * worldMapArea.regionHighY < this.newY * -347980981) {
            worldMapArea.regionHighY = this.newY * -1984578731;
        }
    }
    
    @Override
    public boolean containsCoord(final int n, final int n2, final int n3, final byte b) {
        try {
            if (n >= this.oldZ * -1490859351) {
                if (b >= 10) {
                    throw new IllegalStateException();
                }
                if (n < this.newZ * -1180089391 + -1490859351 * this.oldZ) {
                    if (n2 >= (275577107 * this.oldX << 6) + (this.oldChunkXLow * 534868105 << 3)) {
                        if (b >= 10) {
                            throw new IllegalStateException();
                        }
                        if (n2 <= (593688545 * this.oldChunkXHigh << 3) + (275577107 * this.oldX << 6) + 7) {
                            if (b >= 10) {
                                throw new IllegalStateException();
                            }
                            if (n3 >= (1257977427 * this.oldChunkYLow << 3) + (-365078831 * this.oldY << 6)) {
                                if (b >= 10) {
                                    throw new IllegalStateException();
                                }
                                if (n3 <= 7 + ((this.oldY * -365078831 << 6) + (849738307 * this.oldChunkYHigh << 3))) {
                                    if (b >= 10) {
                                        throw new IllegalStateException();
                                    }
                                    return true;
                                }
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
            throw HealthBar.get(ex, "ja.an(" + ')');
        }
    }
    
    @Override
    public int[] getBorderTileLengths(final int n, final int n2, final int n3, final byte b) {
        try {
            if (this.containsCoord(n, n2, n3, (byte)(-115))) {
                return new int[] { this.newChunkXLow * 1733959768 - this.oldChunkXLow * -16022456 + (-760384192 * this.newX - this.oldX * 457065664 + n2), n3 + (this.newY * -795946304 - -1890208704 * this.oldY) + (-1419340680 * this.newChunkYLow - this.oldChunkYLow * 1473884824) };
            }
            if (b <= 0) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ja.ac(" + ')');
        }
    }
    
    @Override
    public Coord coord(final int n, final int n2, final byte b) {
        try {
            if (this.containsPosition(n, n2, -1897191604)) {
                return new Coord(-1490859351 * this.oldZ, n + (457065664 * this.oldX - -760384192 * this.newX) + (-16022456 * this.oldChunkXLow - 1733959768 * this.newChunkXLow), -1890208704 * this.oldY - this.newY * -795946304 + n2 + (1473884824 * this.oldChunkYLow - this.newChunkYLow * -1419340680));
            }
            if (b == 0) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ja.au(" + ')');
        }
    }
    
    @Override
    public void aa(final WorldMapArea worldMapArea) {
        if (77939951 * worldMapArea.regionLowX > this.newX * -1555384875) {
            worldMapArea.regionLowX = this.newX * -1093871237;
        }
        if (1854846129 * worldMapArea.regionHighX < this.newX * -1555384875) {
            worldMapArea.regionHighX = -2069943195 * this.newX;
        }
        if (worldMapArea.regionLowY * 2059655157 > this.newY * -347980981) {
            worldMapArea.regionLowY = 297795135 * this.newY;
        }
        if (-1086956513 * worldMapArea.regionHighY < this.newY * -347980981) {
            worldMapArea.regionHighY = this.newY * -1984578731;
        }
    }
    
    @Override
    public Coord ai(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1881615629)) {
            return null;
        }
        return new Coord(-1490859351 * this.oldZ, n + (-226020958 * this.oldX - -760384192 * this.newX) + (-16022456 * this.oldChunkXLow - 1733959768 * this.newChunkXLow), -1890208704 * this.oldY - this.newY * -795946304 + n2 + (1473884824 * this.oldChunkYLow - this.newChunkYLow * -1830972624));
    }
    
    @Override
    public void ar(final Buffer buffer) {
        this.oldZ = Buffer.ra(buffer, (byte)7) * -1371866727;
        this.newZ = Buffer.ra(buffer, (byte)7) * 1766061361;
        this.oldX = buffer.readUnsignedShort(-293462134) * -115865431;
        this.oldChunkXLow = Buffer.ra(buffer, (byte)7) * -456653161;
        this.oldChunkXHigh = Buffer.ra(buffer, (byte)7) * -1475281645;
        this.oldY = buffer.readUnsignedShort(-161779812) * 1425588785;
        this.oldChunkYLow = Buffer.ra(buffer, (byte)7) * -396836404;
        this.oldChunkYHigh = Buffer.ra(buffer, (byte)7) * 174253662;
        this.newX = buffer.readUnsignedShort(589144994) * -1827087491;
        this.newChunkXLow = Buffer.ra(buffer, (byte)7) * -868079709;
        this.newChunkXHigh = Buffer.ra(buffer, (byte)7) * -192826393;
        this.newY = buffer.readUnsignedShort(871561754) * -315988723;
        this.newChunkYLow = Buffer.ra(buffer, (byte)7) * -1779561361;
        this.newChunkYHigh = Buffer.ra(buffer, (byte)7) * 1519676935;
        this.postRead(-737225708);
    }
    
    @Override
    public boolean ap(final int n, final int n2, final int n3) {
        return n >= this.oldZ * -1490859351 && n < this.newZ * -1180089391 + -699382887 * this.oldZ && n2 >= (-138360826 * this.oldX << 6) + (this.oldChunkXLow * -1596325374 << 3) && n2 <= (919605371 * this.oldChunkXHigh << 3) + (-1484419998 * this.oldX << 6) + 7 && n3 >= (1257977427 * this.oldChunkYLow << 3) + (-365078831 * this.oldY << 6) && n3 <= 7 + ((this.oldY * -365078831 << 6) + (197772170 * this.oldChunkYHigh << 3));
    }
    
    @Override
    public void expandBounds(final WorldMapArea worldMapArea, final int n) {
        try {
            if (77939951 * worldMapArea.regionLowX > this.newX * -1555384875) {
                worldMapArea.regionLowX = this.newX * -1093871237;
            }
            if (1854846129 * worldMapArea.regionHighX < this.newX * -1555384875) {
                if (n <= 854271946) {
                    throw new IllegalStateException();
                }
                worldMapArea.regionHighX = -2069943195 * this.newX;
            }
            if (worldMapArea.regionLowY * 2059655157 > this.newY * -347980981) {
                worldMapArea.regionLowY = 297795135 * this.newY;
            }
            if (-1086956513 * worldMapArea.regionHighY < this.newY * -347980981) {
                if (n <= 854271946) {
                    throw new IllegalStateException();
                }
                worldMapArea.regionHighY = this.newY * -1984578731;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ja.af(" + ')');
        }
    }
    
    @Override
    public void read(final Buffer buffer, final byte b) {
        try {
            this.oldZ = Buffer.ra(buffer, (byte)7) * -1371866727;
            this.newZ = Buffer.ra(buffer, (byte)7) * 1766061361;
            this.oldX = buffer.readUnsignedShort(-76131683) * -1529759461;
            this.oldChunkXLow = Buffer.ra(buffer, (byte)7) * -1324677703;
            this.oldChunkXHigh = Buffer.ra(buffer, (byte)7) * 445615137;
            this.oldY = buffer.readUnsignedShort(-1084405282) * 1425588785;
            this.oldChunkYLow = Buffer.ra(buffer, (byte)7) * -1310294565;
            this.oldChunkYHigh = Buffer.ra(buffer, (byte)7) * 597074539;
            this.newX = buffer.readUnsignedShort(-589468517) * -1827087491;
            this.newChunkXLow = Buffer.ra(buffer, (byte)7) * -868079709;
            this.newChunkXHigh = Buffer.ra(buffer, (byte)7) * 1286224719;
            this.newY = buffer.readUnsignedShort(841525526) * 781973091;
            this.newChunkYLow = Buffer.ra(buffer, (byte)7) * -1779561361;
            this.newChunkYHigh = Buffer.ra(buffer, (byte)7) * 1519676935;
            this.postRead(-1817267737);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ja.ab(" + ')');
        }
    }
    
    void postRead(final int n) {
    }
    
    @Override
    public void aj(final Buffer buffer) {
        this.oldZ = Buffer.ra(buffer, (byte)7) * -1371866727;
        this.newZ = Buffer.ra(buffer, (byte)7) * 1766061361;
        this.oldX = buffer.readUnsignedShort(-2008146622) * -1529759461;
        this.oldChunkXLow = Buffer.ra(buffer, (byte)7) * -1324677703;
        this.oldChunkXHigh = Buffer.ra(buffer, (byte)7) * 445615137;
        this.oldY = buffer.readUnsignedShort(-971107448) * 1425588785;
        this.oldChunkYLow = Buffer.ra(buffer, (byte)7) * -1310294565;
        this.oldChunkYHigh = Buffer.ra(buffer, (byte)7) * 597074539;
        this.newX = buffer.readUnsignedShort(750221207) * -1827087491;
        this.newChunkXLow = Buffer.ra(buffer, (byte)7) * -868079709;
        this.newChunkXHigh = Buffer.ra(buffer, (byte)7) * 1286224719;
        this.newY = buffer.readUnsignedShort(292856585) * 781973091;
        this.newChunkYLow = Buffer.ra(buffer, (byte)7) * -1779561361;
        this.newChunkYHigh = Buffer.ra(buffer, (byte)7) * 1519676935;
        this.postRead(-1406344180);
    }
    
    @Override
    public Coord ag(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1857077738)) {
            return null;
        }
        return new Coord(-593720757 * this.oldZ, n + (457065664 * this.oldX - -760384192 * this.newX) + (-16022456 * this.oldChunkXLow - 1733959768 * this.newChunkXLow), 1237849034 * this.oldY - this.newY * -795946304 + n2 + (1473884824 * this.oldChunkYLow - this.newChunkYLow * 240995631));
    }
    
    @Override
    public Coord ah(final int n, final int n2) {
        if (!this.containsPosition(n, n2, -1826189817)) {
            return null;
        }
        return new Coord(-1490859351 * this.oldZ, n + (-1610537428 * this.oldX - -760384192 * this.newX) + (-16022456 * this.oldChunkXLow - -90664036 * this.newChunkXLow), -1890208704 * this.oldY - this.newY * -795946304 + n2 + (-90331912 * this.oldChunkYLow - this.newChunkYLow * -1419340680));
    }
}
