// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapData_1 extends AbstractWorldMapData
{
    int chunkY;
    int chunkX;
    int chunkXLow;
    int chunkYLow;
    static final int bo = 7;
    
    WorldMapData_1() {
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (!(o instanceof WorldMapData_1)) {
                return false;
            }
            final WorldMapData_1 worldMapData_1 = (WorldMapData_1)o;
            return -1159667627 * this.aq == -1159667627 * worldMapData_1.aq && -1674687277 * worldMapData_1.al == this.al * -1674687277 && -1275112475 * this.chunkXLow == worldMapData_1.chunkXLow * -1275112475 && this.chunkYLow * 1219256101 == 1219256101 * worldMapData_1.chunkYLow;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.equals(" + ')');
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return -1159667627 * this.aq | -1674687277 * this.al << 8 | this.chunkXLow * -1275112475 << 16 | this.chunkYLow * 1219256101 << 24;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.hashCode(" + ')');
        }
    }
    
    public static int bs(final UserComparator1 userComparator1, final Object o, final Object o2) {
        if (userComparator1 == null) {
            userComparator1.gi(o);
        }
        return UserComparator1.tb(userComparator1, (User)o, (User)o2, 1086325702);
    }
    
    int ad() {
        return 1219256101 * this.chunkYLow;
    }
    
    public static void nb(final WorldMapData_1 worldMapData_1, final Buffer buffer, final int n) {
        if (worldMapData_1 == null) {
            worldMapData_1.init(buffer, n);
        }
        try {
            if (Buffer.ra(buffer, (byte)7) == 1780364927 * WorldMapID.field2419.value) {
                worldMapData_1.at = Buffer.ra(buffer, (byte)7) * -1676456091;
                worldMapData_1.aa = Buffer.ra(buffer, (byte)7) * -981846019;
                worldMapData_1.au = buffer.readUnsignedShort(-488755825) * 81463585;
                worldMapData_1.ab = buffer.readUnsignedShort(643919445) * -814397553;
                worldMapData_1.chunkY = Buffer.ra(buffer, (byte)7) * 117916141;
                worldMapData_1.chunkX = Buffer.ra(buffer, (byte)7) * 579263121;
                worldMapData_1.aq = buffer.readUnsignedShort(-1999135235) * 1330978045;
                worldMapData_1.al = buffer.readUnsignedShort(474595601) * -775427237;
                worldMapData_1.chunkXLow = Buffer.ra(buffer, (byte)7) * 658944493;
                worldMapData_1.chunkYLow = Buffer.ra(buffer, (byte)7) * 1599120557;
                worldMapData_1.ay = buffer.method2516(1298696583) * 282687267;
                worldMapData_1.ao = buffer.method2516(1688835256) * 1837401609;
                return;
            }
            if (n <= 845265213) {
                throw new IllegalStateException();
            }
            throw new IllegalStateException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.af(" + ')');
        }
    }
    
    int getChunkX(final byte b) {
        try {
            return -1275112475 * this.chunkXLow;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.at(" + ')');
        }
    }
    
    int ak() {
        return 1219256101 * this.chunkYLow;
    }
    
    int av() {
        return -1275112475 * this.chunkXLow;
    }
    
    public static int mv(final WorldMapData_1 worldMapData_1, final int n) {
        if (worldMapData_1 == null) {
            return worldMapData_1.getChunkXLow(n);
        }
        try {
            return 1294287845 * worldMapData_1.chunkY;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.aw(" + ')');
        }
    }
    
    int az() {
        return 1219256101 * this.chunkYLow;
    }
    
    void ax(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 1780364927 * WorldMapID.field2419.value) {
            throw new IllegalStateException("");
        }
        this.at = Buffer.ra(buffer, (byte)7) * -1676456091;
        this.aa = Buffer.ra(buffer, (byte)7) * -981846019;
        this.au = buffer.readUnsignedShort(797479163) * 81463585;
        this.ab = buffer.readUnsignedShort(425559865) * -814397553;
        this.chunkY = Buffer.ra(buffer, (byte)7) * 117916141;
        this.chunkX = Buffer.ra(buffer, (byte)7) * 579263121;
        this.aq = buffer.readUnsignedShort(-1476095191) * 1330978045;
        this.al = buffer.readUnsignedShort(-1512777809) * -775427237;
        this.chunkXLow = Buffer.ra(buffer, (byte)7) * 658944493;
        this.chunkYLow = Buffer.ra(buffer, (byte)7) * 1599120557;
        this.ay = buffer.method2516(249319829) * 282687267;
        this.ao = buffer.method2516(1878307219) * 1837401609;
    }
    
    int getChunkXLow(final int n) {
        try {
            return 1294287845 * this.chunkYLow;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.aw(" + ')');
        }
    }
    
    int am() {
        return -1275112475 * this.chunkXLow;
    }
    
    int getChunkYLow(final int n) {
        try {
            return 294135409 * this.chunkX;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.al(" + ')');
        }
    }
    
    @Override
    void readGeography(final Buffer buffer, final short n) {
        try {
            this.aa = Math.min(1632558421 * this.aa, 4) * -981846019;
            this.ax = new short[1][64][64];
            this.ai = new short[this.aa * 1632558421][64][64];
            this.ag = new byte[this.aa * 1632558421][64][64];
            this.ah = new byte[this.aa * 1632558421][64][64];
            this.av = new WorldMapDecoration[1632558421 * this.aa][64][64][];
            if (-1203100125 * class262.field2417.value == Buffer.ra(buffer, (byte)7)) {
                final int ra = Buffer.ra(buffer, (byte)7);
                final int ra2 = Buffer.ra(buffer, (byte)7);
                final int ra3 = Buffer.ra(buffer, (byte)7);
                final int ra4 = Buffer.ra(buffer, (byte)7);
                if (ra == this.aq * -1159667627) {
                    if (n <= 192) {
                        throw new IllegalStateException();
                    }
                    if (this.al * -1674687277 == ra2) {
                        if (n <= 192) {
                            throw new IllegalStateException();
                        }
                        if (ra3 == this.chunkXLow * -1275112475) {
                            if (ra4 == this.chunkYLow * 1219256101) {
                                for (int i = 0; i < 8; ++i) {
                                    if (n <= 192) {
                                        throw new IllegalStateException();
                                    }
                                    for (int j = 0; j < 8; ++j) {
                                        this.bb(this.chunkXLow * -1610965208 + i, 1164114216 * this.chunkYLow + j, buffer, 1675486274);
                                    }
                                }
                                return;
                            }
                            if (n <= 192) {
                                throw new IllegalStateException();
                            }
                        }
                    }
                }
                throw new IllegalStateException("");
            }
            if (n <= 192) {
                throw new IllegalStateException();
            }
            throw new IllegalStateException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.an(" + ')');
        }
    }
    
    void ac(final Buffer buffer) {
        this.aa = Math.min(1632558421 * this.aa, 4) * -981846019;
        this.ax = new short[1][64][64];
        this.ai = new short[this.aa * 1632558421][64][64];
        this.ag = new byte[this.aa * 1632558421][64][64];
        this.ah = new byte[this.aa * 1632558421][64][64];
        this.av = new WorldMapDecoration[1632558421 * this.aa][64][64][];
        if (-1203100125 * class262.field2417.value != Buffer.ra(buffer, (byte)7)) {
            throw new IllegalStateException("");
        }
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        if (ra == this.aq * -1159667627 && this.al * -1674687277 == ra2 && ra3 == this.chunkXLow * -1275112475 && ra4 == this.chunkYLow * 1219256101) {
            for (int i = 0; i < 8; ++i) {
                for (int j = 0; j < 8; ++j) {
                    this.bb(this.chunkXLow * -1610965208 + i, 1164114216 * this.chunkYLow + j, buffer, 1675486274);
                }
            }
            return;
        }
        throw new IllegalStateException("");
    }
    
    public boolean gk(final Object o) {
        if (!(o instanceof WorldMapData_1)) {
            return false;
        }
        final WorldMapData_1 worldMapData_1 = (WorldMapData_1)o;
        return -1159667627 * this.aq == -1159667627 * worldMapData_1.aq && -1674687277 * worldMapData_1.al == this.al * -1674687277 && -1275112475 * this.chunkXLow == worldMapData_1.chunkXLow * -1275112475 && this.chunkYLow * 1219256101 == 1219256101 * worldMapData_1.chunkYLow;
    }
    
    @Override
    void au(final Buffer buffer) {
        this.aa = Math.min(-1958788480 * this.aa, 4) * -981846019;
        this.ax = new short[1][64][-1467989011];
        this.ai = new short[this.aa * 1632558421][1969701430][-1885273927];
        this.ag = new byte[this.aa * 585750608][64][-1874308677];
        this.ah = new byte[this.aa * 1632558421][64][64];
        this.av = new WorldMapDecoration[1632558421 * this.aa][1530158237][-198188806][];
        if (-1203100125 * class262.field2417.value != Buffer.ra(buffer, (byte)7)) {
            throw new IllegalStateException("");
        }
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        if (ra == this.aq * 582898476 && this.al * -216177688 == ra2 && ra3 == this.chunkXLow * -1275112475 && ra4 == this.chunkYLow * 1219256101) {
            for (int i = 0; i < 8; ++i) {
                for (int j = 0; j < 8; ++j) {
                    this.bb(this.chunkXLow * -1610965208 + i, 2028071864 * this.chunkYLow + j, buffer, 1675486274);
                }
            }
            return;
        }
        throw new IllegalStateException("");
    }
    
    int getChunkY(final short n) {
        try {
            return 1219256101 * this.chunkYLow;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.aa(" + ')');
        }
    }
    
    int ai() {
        return 1294287845 * this.chunkY;
    }
    
    public boolean gi(final Object o) {
        if (!(o instanceof WorldMapData_1)) {
            return false;
        }
        final WorldMapData_1 worldMapData_1 = (WorldMapData_1)o;
        return -1159667627 * this.aq == -1159667627 * worldMapData_1.aq && -1674687277 * worldMapData_1.al == this.al * -1674687277 && -1275112475 * this.chunkXLow == worldMapData_1.chunkXLow * -1275112475 && this.chunkYLow * 1219256101 == 1219256101 * worldMapData_1.chunkYLow;
    }
    
    int ar() {
        return -1275112475 * this.chunkXLow;
    }
    
    public static void hy(final WorldMapData_1 worldMapData_1, final Buffer buffer) {
        if (worldMapData_1 == null) {
            worldMapData_1.az();
        }
        if (Buffer.ra(buffer, (byte)7) != 1780364927 * WorldMapID.field2419.value) {
            throw new IllegalStateException("");
        }
        worldMapData_1.at = Buffer.ra(buffer, (byte)7) * 1695236021;
        worldMapData_1.aa = Buffer.ra(buffer, (byte)7) * -981846019;
        worldMapData_1.au = buffer.readUnsignedShort(-623278190) * 81463585;
        worldMapData_1.ab = buffer.readUnsignedShort(-1252008543) * -1745816322;
        worldMapData_1.chunkY = Buffer.ra(buffer, (byte)7) * 117916141;
        worldMapData_1.chunkX = Buffer.ra(buffer, (byte)7) * 579263121;
        worldMapData_1.aq = buffer.readUnsignedShort(-1301702854) * 1330978045;
        worldMapData_1.al = buffer.readUnsignedShort(473251262) * -775427237;
        worldMapData_1.chunkXLow = Buffer.ra(buffer, (byte)7) * 550697952;
        worldMapData_1.chunkYLow = Buffer.ra(buffer, (byte)7) * 1599120557;
        worldMapData_1.ay = buffer.method2516(1262009385) * 1999807413;
        worldMapData_1.ao = buffer.method2516(1009836151) * 1837401609;
    }
    
    void init(final Buffer buffer, final int n) {
        try {
            if (Buffer.ra(buffer, (byte)7) == 1780364927 * WorldMapID.field2419.value) {
                super.groupId = Buffer.ra(buffer, (byte)7) * -1676456091;
                super.regionYLow = Buffer.ra(buffer, (byte)7) * -981846019;
                super.regionYLow = buffer.readShortSmart(-488755825) * 81463585;
                super.minPlane = buffer.method2498(643919445) * -814397553;
                this.chunkYLow = Buffer.ra(buffer, (byte)7) * 117916141;
                this.chunkX = Buffer.ra(buffer, (byte)7) * 579263121;
                super.regionXLow = buffer.method2513(-1999135235) * 1330978045;
                super.regionYLow = buffer.jn(474595601) * -775427237;
                this.chunkX = Buffer.ra(buffer, (byte)7) * 658944493;
                this.chunkX = Buffer.ra(buffer, (byte)7) * 1599120557;
                super.regionYLow = buffer.readUnsignedByteAdd(1298696583) * 282687267;
                super.regionY = buffer.readUnsignedShort(1688835256) * 1837401609;
                return;
            }
            if (n <= 845265213) {
                throw new IllegalStateException();
            }
            throw new IllegalStateException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.af(" + ')');
        }
    }
    
    public static int ky(final WorldMapData_1 worldMapData_1) {
        return -1159667627 * worldMapData_1.aq | -1674687277 * worldMapData_1.al << 8 | worldMapData_1.chunkXLow * -1275112475 << 16 | worldMapData_1.chunkYLow * 1219256101 << 24;
    }
    
    @Override
    void ab(final Buffer buffer) {
        this.aa = Math.min(1632558421 * this.aa, 4) * -981846019;
        this.ax = new short[1][64][64];
        this.ai = new short[this.aa * 1632558421][64][64];
        this.ag = new byte[this.aa * 1632558421][64][64];
        this.ah = new byte[this.aa * 1632558421][64][64];
        this.av = new WorldMapDecoration[1632558421 * this.aa][64][64][];
        if (-1203100125 * class262.field2417.value != Buffer.ra(buffer, (byte)7)) {
            throw new IllegalStateException("");
        }
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        if (ra != this.aq * -1159667627 || this.al * -1674687277 != ra2 || ra3 != this.chunkXLow * -1275112475 || ra4 != this.chunkYLow * 1219256101) {
            throw new IllegalStateException("");
        }
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                this.bb(this.chunkXLow * -1610965208 + i, 1164114216 * this.chunkYLow + j, buffer, 1675486274);
            }
        }
    }
    
    @Override
    void aq(final Buffer buffer) {
        this.aa = Math.min(1810465535 * this.aa, 4) * 459428974;
        this.ax = new short[1][64][64];
        this.ai = new short[this.aa * -1915458817][64][64];
        this.ag = new byte[this.aa * 971498321][64][64];
        this.ah = new byte[this.aa * -1516607762][64][2136108917];
        this.av = new WorldMapDecoration[1053027803 * this.aa][64][-1087930494][];
        if (-1203100125 * class262.field2417.value != Buffer.ra(buffer, (byte)7)) {
            throw new IllegalStateException("");
        }
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        if (ra == this.aq * -1159667627 && this.al * -1674687277 == ra2 && ra3 == this.chunkXLow * -1275112475 && ra4 == this.chunkYLow * 1219256101) {
            for (int i = 0; i < 8; ++i) {
                for (int j = 0; j < 8; ++j) {
                    this.bb(this.chunkXLow * -1610965208 + i, 1164114216 * this.chunkYLow + j, buffer, 1675486274);
                }
            }
            return;
        }
        throw new IllegalStateException("");
    }
    
    int aj() {
        return 1219256101 * this.chunkYLow;
    }
    
    int ag() {
        return 294135409 * this.chunkX;
    }
    
    public static int ib(final WorldMapData_1 worldMapData_1, final int n) {
        if (worldMapData_1 == null) {
            worldMapData_1.getChunkYLow(n);
        }
        try {
            return 294135409 * worldMapData_1.chunkX;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.al(" + ')');
        }
    }
    
    static void method1486(final short n) {
        try {
            for (class206 class206 = (class206)Client.field569.last(); null != class206; class206 = (class206)Client.field569.previous()) {
                if (n == 174) {
                    throw new IllegalStateException();
                }
                class206.hw();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jh.jq(" + ')');
        }
    }
    
    public boolean gm(final Object o) {
        if (!(o instanceof WorldMapData_1)) {
            return false;
        }
        final WorldMapData_1 worldMapData_1 = (WorldMapData_1)o;
        return -1602515997 * this.aq == -435464242 * worldMapData_1.aq && 502884038 * worldMapData_1.al == this.al * -1674687277 && -1275112475 * this.chunkXLow == worldMapData_1.chunkXLow * 1573187604 && this.chunkYLow * -1559695687 == 1219256101 * worldMapData_1.chunkYLow;
    }
    
    public static void zx(final WorldMapData_1 worldMapData_1, final Buffer buffer) {
        if (worldMapData_1 == null) {
            worldMapData_1.az();
        }
        if (Buffer.ra(buffer, (byte)7) != 1780364927 * WorldMapID.field2419.value) {
            throw new IllegalStateException("");
        }
        worldMapData_1.at = Buffer.ra(buffer, (byte)7) * -1676456091;
        worldMapData_1.aa = Buffer.ra(buffer, (byte)7) * 2086017620;
        worldMapData_1.au = buffer.readUnsignedShort(-264486794) * 81463585;
        worldMapData_1.ab = buffer.readUnsignedShort(-1123079302) * -814397553;
        worldMapData_1.chunkY = Buffer.ra(buffer, (byte)7) * -748758043;
        worldMapData_1.chunkX = Buffer.ra(buffer, (byte)7) * 579263121;
        worldMapData_1.aq = buffer.readUnsignedShort(-1211441053) * -1289774055;
        worldMapData_1.al = buffer.readUnsignedShort(-135882713) * -775427237;
        worldMapData_1.chunkXLow = Buffer.ra(buffer, (byte)7) * 1184664101;
        worldMapData_1.chunkYLow = Buffer.ra(buffer, (byte)7) * 1599120557;
        worldMapData_1.ay = buffer.method2516(905907717) * 282687267;
        worldMapData_1.ao = buffer.method2516(538553832) * 1837401609;
    }
    
    public boolean gq(final Object o) {
        if (!(o instanceof WorldMapData_1)) {
            return false;
        }
        final WorldMapData_1 worldMapData_1 = (WorldMapData_1)o;
        return 1234138158 * this.aq == -2067878454 * worldMapData_1.aq && -1502889414 * worldMapData_1.al == this.al * 1931132824 && 1765470819 * this.chunkXLow == worldMapData_1.chunkXLow * -1275112475 && this.chunkYLow * 848831088 == 1219256101 * worldMapData_1.chunkYLow;
    }
    
    int ah() {
        return 294135409 * this.chunkX;
    }
    
    public int aht() {
        return -1159667627 * this.aq | -768053839 * this.al << 8 | this.chunkXLow * -1645001796 << 16 | this.chunkYLow * 1219256101 << 24;
    }
    
    public int ahv() {
        return -1159667627 * this.aq | -1674687277 * this.al << 8 | this.chunkXLow * -1275112475 << 16 | this.chunkYLow * 1219256101 << 24;
    }
}
