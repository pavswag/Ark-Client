import java.util.LinkedList;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class AbstractWorldMapData
{
    public static final int bz = 262144;
    short[][][] floorOverlayIds;
    int regionX;
    int regionY;
    int minPlane;
    byte[][][] field2390;
    int groupId;
    int fileId;
    short[][][] floorUnderlayIds;
    int planes;
    int regionXLow;
    byte[][][] field2396;
    WorldMapDecoration[][][][] decorations;
    boolean field2398;
    boolean field2399;
    int regionYLow;
    
    AbstractWorldMapData() {
        this.groupId = -282687267;
        this.fileId = -1837401609;
        new LinkedList();
        this.field2398 = false;
        this.field2399 = false;
    }
    
    int cs() {
        return this.regionY * -81031194;
    }
    
    void ba(final int n, final int n2, final Buffer buffer, final int n3) {
        if (0x0 != (n3 & 0x2)) {
            this.floorOverlayIds[0][n][n2] = (short)buffer.readUnsignedShort(-1331801936);
        }
        this.floorUnderlayIds[0][n][n2] = (short)buffer.readUnsignedShort(-761162490);
    }
    
    boolean isFullyLoaded(final int n) {
        try {
            if (this.field2398) {
                if (n >= 482450430) {
                    throw new IllegalStateException();
                }
                if (this.field2399) {
                    if (n >= 482450430) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.ae(" + ')');
        }
    }
    
    int ce() {
        return this.regionY * -521041157;
    }
    
    void readTile(final int n, final int n2, final Buffer buffer, final int n3) {
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra != 0) {
                if (0x0 != (ra & 0x1)) {
                    if (n3 != 1675486274) {
                        return;
                    }
                    kn(this, n, n2, buffer, ra, (byte)(-28));
                }
                else {
                    pq(this, n, n2, buffer, ra, 675570307);
                }
                return;
            }
            if (n3 != 1675486274) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.bb(" + ')');
        }
    }
    
    int bw() {
        return this.regionX * -259536928;
    }
    
    void method1517(final int n, final int n2, final Buffer buffer, final int n3, final int n4) {
        try {
            final int n5 = 1 + ((n3 & 0x18) >> 3);
            boolean b;
            if (0x0 != (n3 & 0x2)) {
                if (n4 != 675570307) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            final boolean b2 = b;
            boolean b3;
            if (0x0 != (n3 & 0x4)) {
                if (n4 != 675570307) {
                    throw new IllegalStateException();
                }
                b3 = true;
            }
            else {
                b3 = false;
            }
            final boolean b4 = b3;
            this.floorUnderlayIds[0][n][n2] = (short)buffer._readUnsignedByteSub(-134555678);
            if (b2) {
                if (n4 != 675570307) {
                    throw new IllegalStateException();
                }
                for (int ra = Buffer.ra(buffer, (byte)7), i = 0; i < ra; ++i) {
                    if (n4 != 675570307) {
                        throw new IllegalStateException();
                    }
                    final int method2491 = buffer.method2491(-1237278688);
                    if (method2491 != 0) {
                        if (n4 != 675570307) {
                            throw new IllegalStateException();
                        }
                        this.floorUnderlayIds[i][n][n2] = (short)method2491;
                        final int ra2 = Buffer.ra(buffer, (byte)7);
                        this.field2390[i][n][n2] = (byte)(ra2 >> 2);
                        this.field2390[i][n][n2] = (byte)(ra2 & 0x3);
                    }
                }
            }
            if (b4) {
                if (n4 != 675570307) {
                    return;
                }
                for (int j = 0; j < n5; ++j) {
                    if (n4 != 675570307) {
                        throw new IllegalStateException();
                    }
                    final int ra3 = Buffer.ra(buffer, (byte)7);
                    if (ra3 == 0) {
                        if (n4 != 675570307) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final WorldMapDecoration[][] array = this.decorations[j][n];
                        final WorldMapDecoration[] array2 = new WorldMapDecoration[ra3];
                        array[n2] = array2;
                        final WorldMapDecoration[] array3 = array2;
                        for (int k = 0; k < ra3; ++k) {
                            final int method2492 = buffer.method2541(1277824677);
                            final int ra4 = Buffer.ra(buffer, (byte)7);
                            array3[k] = new WorldMapDecoration(method2492, ra4 >> 2, ra4 & 0x3);
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.be(" + ')');
        }
    }
    
    public static void ns(final MidiPcmStream midiPcmStream, final int n) {
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.last(); null != musicPatchNode; musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.previous()) {
            if ((n < 0 || n == musicPatchNode.field2801 * 1021419297) && musicPatchNode.field2798 * -602614853 < 0) {
                midiPcmStream.field2753[1021419297 * musicPatchNode.field2801][-630482265 * musicPatchNode.field2788] = null;
                musicPatchNode.field2798 = 0;
            }
        }
    }
    
    public static int tl(final AbstractWorldMapData abstractWorldMapData, final int n) {
        if (abstractWorldMapData == null) {
            return abstractWorldMapData.getRegionX(n);
        }
        try {
            return abstractWorldMapData.regionX * -1159667627;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.bk(" + ')');
        }
    }
    
    void method1516(final int n, final int n2, final Buffer buffer, final int n3, final byte b) {
        try {
            boolean b2;
            if (0x0 != (n3 & 0x2)) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b2) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.floorUnderlayIds[0][n][n2] = (short)buffer.method2491(-889978718);
            }
            this.floorUnderlayIds[0][n][n2] = (short)buffer.method2498(261185412);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.bi(" + ')');
        }
    }
    
    void bv(final int n, final int n2, final Buffer buffer, final int n3) {
        if (0x0 != (n3 & 0x2)) {
            this.floorOverlayIds[0][n][n2] = (short)buffer.readUnsignedShort(-1175006800);
        }
        this.floorUnderlayIds[0][n][n2] = (short)buffer.readUnsignedShort(879160531);
    }
    
    boolean bo() {
        return this.field2398 && this.field2399;
    }
    
    void bp(final int n, final int n2, final Buffer buffer, final int n3) {
        final int n4 = 1 + ((n3 & 0x18) >> 3);
        final boolean b = 0x0 != (n3 & 0x2);
        final boolean b2 = 0x0 != (n3 & 0x4);
        this.floorUnderlayIds[0][n][n2] = (short)buffer.readUnsignedShort(-2139747424);
        if (b) {
            for (int ra = Buffer.ra(buffer, (byte)7), i = 0; i < ra; ++i) {
                final int unsignedShort = buffer.readUnsignedShort(335455759);
                if (unsignedShort != 0) {
                    this.floorOverlayIds[i][n][n2] = (short)unsignedShort;
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    this.field2390[i][n][n2] = (byte)(ra2 >> 2);
                    this.field2396[i][n][n2] = (byte)(ra2 & 0x3);
                }
            }
        }
        if (b2) {
            for (int j = 0; j < n4; ++j) {
                final int ra3 = Buffer.ra(buffer, (byte)7);
                if (ra3 != 0) {
                    final WorldMapDecoration[][] array = this.decorations[j][n];
                    final WorldMapDecoration[] array2 = new WorldMapDecoration[ra3];
                    array[n2] = array2;
                    final WorldMapDecoration[] array3 = array2;
                    for (int k = 0; k < ra3; ++k) {
                        final int method2516 = buffer.method2516(2079851609);
                        final int ra4 = Buffer.ra(buffer, (byte)7);
                        array3[k] = new WorldMapDecoration(method2516, ra4 >> 2, ra4 & 0x3);
                    }
                }
            }
        }
    }
    
    void bt(final AbstractArchive abstractArchive) {
        if (this.isFullyLoaded(-401055779)) {
            return;
        }
        final byte[] takeFile = abstractArchive.takeFile(this.groupId * 1716482187, -715724743 * this.fileId, (byte)(-48));
        if (takeFile != null) {
            this.readGeography(new Buffer(takeFile), (short)17763);
            this.field2398 = true;
            this.field2399 = true;
        }
    }
    
    void br() {
        this.floorUnderlayIds = null;
        this.floorOverlayIds = null;
        this.field2390 = null;
        this.field2396 = null;
        this.decorations = null;
        this.field2398 = false;
        this.field2399 = false;
    }
    
    abstract void readGeography(final Buffer p0, final short p1);
    
    abstract void ByteArrayPool_getArray(final Buffer p0);
    
    public static synchronized byte[] ByteArrayPool_getArray(final int n, final int n2) {
        try {
            return ByteArrayPool.ByteArrayPool_getArrayBool(n, false, (byte)20);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.ac(" + ')');
        }
    }
    
    public static int ls(final AbstractWorldMapData abstractWorldMapData) {
        return abstractWorldMapData.regionX * -1159667627;
    }
    
    void bq(final int n, final int n2, final Buffer buffer, final int n3) {
        if (0x0 != (n3 & 0x2)) {
            this.floorOverlayIds[0][n][n2] = (short)buffer.readUnsignedShort(140276444);
        }
        this.floorUnderlayIds[0][n][n2] = (short)buffer.readUnsignedShort(-1273366134);
    }
    
    abstract void au(final Buffer p0);
    
    int bh() {
        return this.regionX * 1598650183;
    }
    
    void reset(final int n) {
        try {
            this.floorUnderlayIds = null;
            this.floorOverlayIds = null;
            this.field2390 = null;
            this.field2396 = null;
            this.decorations = null;
            this.field2398 = false;
            this.field2399 = false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.by(" + ')');
        }
    }
    
    int getRegionY(final int n) {
        try {
            return this.regionY * -1674687277;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.bx(" + ')');
        }
    }
    
    void loadGeography(final AbstractArchive abstractArchive, final byte b) {
        try {
            if (this.isFullyLoaded(-44397169)) {
                return;
            }
            final byte[] takeFile = abstractArchive.takeFile(this.groupId * 1716482187, -715724743 * this.fileId, (byte)(-17));
            if (takeFile != null) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                this.readGeography(new Buffer(takeFile), (short)2348);
                this.field2398 = true;
                this.field2399 = true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.ap(" + ')');
        }
    }
    
    public static void pq(final AbstractWorldMapData abstractWorldMapData, final int n, final int n2, final Buffer buffer, final int n3, final int n4) {
        if (abstractWorldMapData == null) {
            abstractWorldMapData.method1517(n, n, buffer, n, n);
            return;
        }
        try {
            final int n5 = 1 + ((n3 & 0x18) >> 3);
            boolean b;
            if (0x0 != (n3 & 0x2)) {
                if (n4 != 675570307) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            final boolean b2 = b;
            boolean b3;
            if (0x0 != (n3 & 0x4)) {
                if (n4 != 675570307) {
                    throw new IllegalStateException();
                }
                b3 = true;
            }
            else {
                b3 = false;
            }
            final boolean b4 = b3;
            abstractWorldMapData.floorUnderlayIds[0][n][n2] = (short)buffer.readUnsignedShort(-134555678);
            if (b2) {
                if (n4 != 675570307) {
                    throw new IllegalStateException();
                }
                for (int ra = Buffer.ra(buffer, (byte)7), i = 0; i < ra; ++i) {
                    if (n4 != 675570307) {
                        throw new IllegalStateException();
                    }
                    final int unsignedShort = buffer.readUnsignedShort(-1237278688);
                    if (unsignedShort != 0) {
                        if (n4 != 675570307) {
                            throw new IllegalStateException();
                        }
                        abstractWorldMapData.floorOverlayIds[i][n][n2] = (short)unsignedShort;
                        final int ra2 = Buffer.ra(buffer, (byte)7);
                        abstractWorldMapData.field2390[i][n][n2] = (byte)(ra2 >> 2);
                        abstractWorldMapData.field2396[i][n][n2] = (byte)(ra2 & 0x3);
                    }
                }
            }
            if (b4) {
                if (n4 != 675570307) {
                    return;
                }
                for (int j = 0; j < n5; ++j) {
                    if (n4 != 675570307) {
                        throw new IllegalStateException();
                    }
                    final int ra3 = Buffer.ra(buffer, (byte)7);
                    if (ra3 == 0) {
                        if (n4 != 675570307) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final WorldMapDecoration[][] array = abstractWorldMapData.decorations[j][n];
                        final WorldMapDecoration[] array2 = new WorldMapDecoration[ra3];
                        array[n2] = array2;
                        final WorldMapDecoration[] array3 = array2;
                        for (int k = 0; k < ra3; ++k) {
                            final int method2516 = buffer.method2516(1277824677);
                            final int ra4 = Buffer.ra(buffer, (byte)7);
                            array3[k] = new WorldMapDecoration(method2516, ra4 >> 2, ra4 & 0x3);
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.be(" + ')');
        }
    }
    
    void bg(final int n, final int n2, final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra == 0) {
            return;
        }
        if (0x0 != (ra & 0x1)) {
            kn(this, n, n2, buffer, ra, (byte)1);
        }
        else {
            pq(this, n, n2, buffer, ra, 675570307);
        }
    }
    
    public static void kn(final AbstractWorldMapData abstractWorldMapData, final int n, final int n2, final Buffer buffer, final int n3, final byte b) {
        if (abstractWorldMapData == null) {
            abstractWorldMapData.method1516(n, n, buffer, n, b);
            return;
        }
        try {
            boolean b2;
            if (0x0 != (n3 & 0x2)) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b2) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                abstractWorldMapData.floorOverlayIds[0][n][n2] = (short)buffer.readUnsignedShort(-889978718);
            }
            abstractWorldMapData.floorUnderlayIds[0][n][n2] = (short)buffer.readUnsignedShort(261185412);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.bi(" + ')');
        }
    }
    
    void bn(final AbstractArchive abstractArchive) {
        if (this.isFullyLoaded(-1735868411)) {
            return;
        }
        final byte[] takeFile = abstractArchive.takeFile(this.groupId * 1716482187, -715724743 * this.fileId, (byte)(-34));
        if (takeFile != null) {
            this.readGeography(new Buffer(takeFile), (short)24755);
            this.field2398 = true;
            this.field2399 = true;
        }
    }
    
    abstract void ab(final Buffer p0);
    
    abstract void aq(final Buffer p0);
    
    void bl(final int n, final int n2, final Buffer buffer, final int n3) {
        final int n4 = 1 + ((n3 & 0x18) >> 3);
        final boolean b = 0x0 != (n3 & 0x2);
        final boolean b2 = 0x0 != (n3 & 0x4);
        this.floorUnderlayIds[0][n][n2] = (short)buffer.readUnsignedShort(834981870);
        if (b) {
            for (int ra = Buffer.ra(buffer, (byte)7), i = 0; i < ra; ++i) {
                final int unsignedShort = buffer.readUnsignedShort(-2083476033);
                if (unsignedShort != 0) {
                    this.floorOverlayIds[i][n][n2] = (short)unsignedShort;
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    this.field2390[i][n][n2] = (byte)(ra2 >> 2);
                    this.field2396[i][n][n2] = (byte)(ra2 & 0x3);
                }
            }
        }
        if (b2) {
            for (int j = 0; j < n4; ++j) {
                final int ra3 = Buffer.ra(buffer, (byte)7);
                if (ra3 != 0) {
                    final WorldMapDecoration[][] array = this.decorations[j][n];
                    final WorldMapDecoration[] array2 = new WorldMapDecoration[ra3];
                    array[n2] = array2;
                    final WorldMapDecoration[] array3 = array2;
                    for (int k = 0; k < ra3; ++k) {
                        final int method2516 = buffer.method2516(1083993848);
                        final int ra4 = Buffer.ra(buffer, (byte)7);
                        array3[k] = new WorldMapDecoration(method2516, ra4 >> 2, ra4 & 0x3);
                    }
                }
            }
        }
    }
    
    boolean bz() {
        return this.field2398 && this.field2399;
    }
    
    public static void mj(final AbstractWorldMapData abstractWorldMapData) {
        if (abstractWorldMapData == null) {
            abstractWorldMapData.ce();
        }
        abstractWorldMapData.floorUnderlayIds = null;
        abstractWorldMapData.floorOverlayIds = null;
        abstractWorldMapData.field2390 = null;
        abstractWorldMapData.field2396 = null;
        abstractWorldMapData.decorations = null;
        abstractWorldMapData.field2398 = false;
        abstractWorldMapData.field2399 = false;
    }
    
    void bj(final AbstractArchive abstractArchive) {
        if (this.isFullyLoaded(-1000661783)) {
            return;
        }
        final byte[] takeFile = abstractArchive.takeFile(this.groupId * 1716482187, -715724743 * this.fileId, (byte)(-118));
        if (takeFile != null) {
            this.readGeography(new Buffer(takeFile), (short)19979);
            this.field2398 = true;
            this.field2399 = true;
        }
    }
    
    boolean bm() {
        return this.field2398 && this.field2399;
    }
    
    int getRegionX(final int n) {
        try {
            return this.fileId * -1674687277;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jz.bx(" + ')');
        }
    }
    
    public static void na(final AbstractWorldMapData abstractWorldMapData, final AbstractArchive abstractArchive) {
        if (abstractWorldMapData == null) {
            abstractWorldMapData.bw();
        }
        if (abstractWorldMapData.isFullyLoaded(290090802)) {
            return;
        }
        final byte[] takeFile = abstractArchive.takeFile(abstractWorldMapData.groupId * 1716482187, -1520659948 * abstractWorldMapData.fileId, (byte)(-65));
        if (takeFile != null) {
            abstractWorldMapData.readGeography(new Buffer(takeFile), (short)15439);
            abstractWorldMapData.field2398 = true;
            abstractWorldMapData.field2399 = true;
        }
    }
    
    void bf(final int n, final int n2, final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra == 0) {
            return;
        }
        if (0x0 != (ra & 0x1)) {
            kn(this, n, n2, buffer, ra, (byte)(-110));
        }
        else {
            pq(this, n, n2, buffer, ra, 675570307);
        }
    }
    
    void bu(final int n, final int n2, final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra == 0) {
            return;
        }
        if (0x0 != (ra & 0x1)) {
            kn(this, n, n2, buffer, ra, (byte)(-123));
        }
        else {
            pq(this, n, n2, buffer, ra, 675570307);
        }
    }
}
