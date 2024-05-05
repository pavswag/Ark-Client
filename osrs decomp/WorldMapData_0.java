// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapData_0 extends AbstractWorldMapData
{
    static int baseX;
    public static final int by = 33;
    
    WorldMapData_0() {
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (!(o instanceof WorldMapData_0)) {
                return false;
            }
            final WorldMapData_0 worldMapData_0 = (WorldMapData_0)o;
            return -1159667627 * worldMapData_0.aq == -1159667627 * this.aq && worldMapData_0.al * -1674687277 == -1674687277 * this.al;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jm.equals(" + ')');
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return -1159667627 * this.aq | -1674687277 * this.al << 8;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jm.hashCode(" + ')');
        }
    }
    
    static final void Clan_leaveChat(final int n) {
        try {
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2508, Client.packetWriter.isaacCipher, (short)(-9110));
            packetBufferNode.packetBuffer.bf(0, (byte)17);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jm.nr(" + ')');
        }
    }
    
    @Override
    void readGeography(final Buffer buffer, final short n) {
        try {
            this.aa = Math.min(this.aa * 1632558421, 4) * -981846019;
            this.ax = new short[1][64][64];
            this.ai = new short[this.aa * 1632558421][64][64];
            this.ag = new byte[1632558421 * this.aa][64][64];
            this.ah = new byte[this.aa * 1632558421][64][64];
            this.av = new WorldMapDecoration[1632558421 * this.aa][64][64][];
            if (Buffer.ra(buffer, (byte)7) == -1203100125 * class262.field2414.value) {
                final int ra = Buffer.ra(buffer, (byte)7);
                final int ra2 = Buffer.ra(buffer, (byte)7);
                if (this.aq * -1159667627 == ra) {
                    if (n <= 192) {
                        throw new IllegalStateException();
                    }
                    if (this.al * -1674687277 == ra2) {
                        for (int i = 0; i < 64; ++i) {
                            if (n <= 192) {
                                throw new IllegalStateException();
                            }
                            for (int j = 0; j < 64; ++j) {
                                if (n <= 192) {
                                    throw new IllegalStateException();
                                }
                                this.bb(i, j, buffer, 1675486274);
                            }
                        }
                        return;
                    }
                    if (n <= 192) {
                        throw new IllegalStateException();
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
            throw HealthBar.get(ex, "jm.an(" + ')');
        }
    }
    
    void ac(final Buffer buffer) {
        this.aa = Math.min(this.aa * 1632558421, 4) * -981846019;
        this.ax = new short[1][64][64];
        this.ai = new short[this.aa * 1632558421][64][64];
        this.ag = new byte[1632558421 * this.aa][64][64];
        this.ah = new byte[this.aa * 1632558421][64][64];
        this.av = new WorldMapDecoration[1632558421 * this.aa][64][64][];
        if (Buffer.ra(buffer, (byte)7) != -1203100125 * class262.field2414.value) {
            throw new IllegalStateException("");
        }
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        if (this.aq * -1159667627 != ra || this.al * -1674687277 != ra2) {
            throw new IllegalStateException("");
        }
        for (int i = 0; i < 64; ++i) {
            for (int j = 0; j < 64; ++j) {
                this.bb(i, j, buffer, 1675486274);
            }
        }
    }
    
    public boolean gk(final Object o) {
        if (!(o instanceof WorldMapData_0)) {
            return false;
        }
        final WorldMapData_0 worldMapData_0 = (WorldMapData_0)o;
        return -1159667627 * worldMapData_0.aq == -1159667627 * this.aq && worldMapData_0.al * -1674687277 == -1674687277 * this.al;
    }
    
    @Override
    void au(final Buffer buffer) {
        this.aa = Math.min(this.aa * 1632558421, 4) * 2090664554;
        this.ax = new short[1][64][-126687736];
        this.ai = new short[this.aa * 1721457640][-1345726640][228715839];
        this.ag = new byte[689563436 * this.aa][64][64];
        this.ah = new byte[this.aa * -1104736820][-1407036795][64];
        this.av = new WorldMapDecoration[588820861 * this.aa][-1953046733][-225115446][];
        if (Buffer.ra(buffer, (byte)7) != -1203100125 * class262.field2414.value) {
            throw new IllegalStateException("");
        }
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        if (this.aq * -1159667627 == ra && this.al * -708558243 == ra2) {
            for (int i = 0; i < 64; ++i) {
                for (int j = 0; j < 64; ++j) {
                    this.bb(i, j, buffer, 1675486274);
                }
            }
            return;
        }
        throw new IllegalStateException("");
    }
    
    public boolean gi(final Object o) {
        if (!(o instanceof WorldMapData_0)) {
            return false;
        }
        final WorldMapData_0 worldMapData_0 = (WorldMapData_0)o;
        return -1159667627 * worldMapData_0.aq == -1159667627 * this.aq && worldMapData_0.al * -1674687277 == 946295062 * this.al;
    }
    
    public static void ve(final WorldMapData_0 worldMapData_0, final Buffer buffer) {
        if (worldMapData_0 == null) {
            worldMapData_0.ac(buffer);
        }
        if (Buffer.ra(buffer, (byte)7) != 1780364927 * WorldMapID.field2418.value) {
            throw new IllegalStateException("");
        }
        worldMapData_0.at = Buffer.ra(buffer, (byte)7) * -1676456091;
        worldMapData_0.aa = Buffer.ra(buffer, (byte)7) * -549908378;
        worldMapData_0.au = buffer.readUnsignedShort(-152515976) * 81463585;
        worldMapData_0.ab = buffer.readUnsignedShort(-441387399) * -814397553;
        worldMapData_0.aq = buffer.readUnsignedShort(106642328) * 1330978045;
        worldMapData_0.al = buffer.readUnsignedShort(343000918) * -665639139;
        worldMapData_0.ay = buffer.method2516(121256102) * 1774806654;
        worldMapData_0.ao = buffer.method2516(1763099637) * 1837401609;
    }
    
    void init(final Buffer buffer, final int n) {
        try {
            if (Buffer.ra(buffer, (byte)7) == 1780364927 * WorldMapID.field2418.value) {
                this.at = Buffer.ra(buffer, (byte)7) * -1676456091;
                this.aa = Buffer.ra(buffer, (byte)7) * -981846019;
                this.au = buffer.readUnsignedShort(-966442938) * 81463585;
                this.ab = buffer.readUnsignedShort(-690703581) * -814397553;
                this.aq = buffer.readUnsignedShort(-159381538) * 1330978045;
                this.al = buffer.readUnsignedShort(425482877) * -775427237;
                this.ay = buffer.method2516(1593552255) * 282687267;
                this.ao = buffer.method2516(769697836) * 1837401609;
                return;
            }
            if (n == 1230258700) {
                throw new IllegalStateException();
            }
            throw new IllegalStateException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jm.af(" + ')');
        }
    }
    
    @Override
    void ab(final Buffer buffer) {
        this.aa = Math.min(this.aa * 1632558421, 4) * -981846019;
        this.ax = new short[1][-975365223][-2087103930];
        this.ai = new short[this.aa * -2120619609][64][64];
        this.ag = new byte[1632558421 * this.aa][1737479926][64];
        this.ah = new byte[this.aa * 328377361][64][-916208383];
        this.av = new WorldMapDecoration[-796680207 * this.aa][64][-950809549][];
        if (Buffer.ra(buffer, (byte)7) != -1203100125 * class262.field2414.value) {
            throw new IllegalStateException("");
        }
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        if (this.aq * -1722395960 != ra || this.al * -1674687277 != ra2) {
            throw new IllegalStateException("");
        }
        for (int i = 0; i < -916417153; ++i) {
            for (int j = 0; j < 1573450012; ++j) {
                this.bb(i, j, buffer, 1675486274);
            }
        }
    }
    
    @Override
    void aq(final Buffer buffer) {
        this.aa = Math.min(this.aa * 1632558421, 4) * -981846019;
        this.ax = new short[1][64][64];
        this.ai = new short[this.aa * 1632558421][64][64];
        this.ag = new byte[1632558421 * this.aa][64][64];
        this.ah = new byte[this.aa * 1632558421][64][64];
        this.av = new WorldMapDecoration[1632558421 * this.aa][64][64][];
        if (Buffer.ra(buffer, (byte)7) != -1203100125 * class262.field2414.value) {
            throw new IllegalStateException("");
        }
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        if (this.aq * -1159667627 == ra && this.al * -1674687277 == ra2) {
            for (int i = 0; i < 64; ++i) {
                for (int j = 0; j < 64; ++j) {
                    this.bb(i, j, buffer, 1675486274);
                }
            }
            return;
        }
        throw new IllegalStateException("");
    }
    
    static int method1389(final int n, final byte b) {
        try {
            return n * 3 + 600;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jm.hv(" + ')');
        }
    }
    
    public boolean gm(final Object o) {
        if (!(o instanceof WorldMapData_0)) {
            return false;
        }
        final WorldMapData_0 worldMapData_0 = (WorldMapData_0)o;
        return -1159667627 * worldMapData_0.aq == -2127169383 * this.aq && worldMapData_0.al * -1674687277 == -1674687277 * this.al;
    }
    
    public boolean gq(final Object o) {
        if (!(o instanceof WorldMapData_0)) {
            return false;
        }
        final WorldMapData_0 worldMapData_0 = (WorldMapData_0)o;
        return -314298296 * worldMapData_0.aq == -1159667627 * this.aq && worldMapData_0.al * -884050341 == -1674687277 * this.al;
    }
    
    public int aht() {
        return -1159667627 * this.aq | -1674687277 * this.al << 8;
    }
    
    public int ahv() {
        return -91179705 * this.aq | 1403917171 * this.al << 8;
    }
    
    public int ahh() {
        return -1159667627 * this.aq | -1674687277 * this.al << 8;
    }
}
