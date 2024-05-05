// 
// Decompiled by Procyon v0.5.36
// 

public class VarpDefinition extends DualNode
{
    public static int field1475;
    public static AbstractArchive VarpDefinition_archive;
    public static EvictingDualNodeHashTable VarpDefinition_cached;
    public int type;
    public static int musicTrackFileId;
    
    VarpDefinition() {
        this.type = 0;
    }
    
    static {
        VarpDefinition.VarpDefinition_cached = new EvictingDualNodeHashTable(64);
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2) {
        try {
            if (5 == n) {
                this.type = buffer.readSignedShortAddLE(-1409499570) * 1851631081;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gz.aw(" + ')');
        }
    }
    
    void decode(final Buffer buffer, final int n) {
        if (5 == n) {
            this.type = buffer.readUnsignedShort(-151041504) * -685874245;
        }
    }
    
    static SpritePixels decode(final int n, final int n2, final int n3, final int n4) {
        try {
            return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(BuddyRankComparator.compareBuddy(n, n2, n3, 916697182));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gz.an(" + ')');
        }
    }
    
    public static VarpDefinition ac(final int n) {
        final VarpDefinition varpDefinition = (VarpDefinition)VarpDefinition.VarpDefinition_cached.wr(n);
        if (null != varpDefinition) {
            return varpDefinition;
        }
        final byte[] takeFile = VarpDefinition.VarpDefinition_archive.takeFile(16, n, (byte)(-101));
        final VarpDefinition varpDefinition2 = new VarpDefinition();
        if (takeFile != null) {
            varpDefinition2.ab(new Buffer(takeFile), 2071709867);
        }
        VarpDefinition.VarpDefinition_cached.put(varpDefinition2, n);
        return varpDefinition2;
    }
    
    static class126[] method983(final int n) {
        try {
            return new class126[] { class126.field1243, class126.field1240, class126.field1241, class126.field1246, class126.field1247, class126.field1244 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gz.au(" + ')');
        }
    }
    
    public static VarpDefinition method983(final int n) {
        final VarpDefinition varpDefinition = (VarpDefinition)VarpDefinition.VarpDefinition_cached.wr(n);
        if (null != varpDefinition) {
            return varpDefinition;
        }
        final byte[] takeFile = VarpDefinition.VarpDefinition_archive.takeFile(16, n, (byte)(-21));
        final VarpDefinition varpDefinition2 = new VarpDefinition();
        if (takeFile != null) {
            varpDefinition2.ab(new Buffer(takeFile), 1864933656);
        }
        VarpDefinition.VarpDefinition_cached.put(varpDefinition2, n);
        return varpDefinition2;
    }
    
    void ab(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                bf(this, buffer, ra, 1359565158);
            }
            if (n <= 830013407) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gz.an(" + ')');
        }
    }
    
    void aq(final Buffer buffer, final int n) {
        if (5 == n) {
            this.type = buffer.readUnsignedShort(635876341) * 1851631081;
        }
    }
    
    public static void method981(final int n, final int n2, final int n3, final int n4) {
        try {
            Rasterizer3D.clips.method1360(n, n2, n3, 707163939);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gz.ag(" + ')');
        }
    }
    
    public static void bf(final VarpDefinition varpDefinition, final Buffer buffer, final int n, final int n2) {
        if (varpDefinition == null) {
            varpDefinition.decodeNext(buffer, n, n);
            return;
        }
        try {
            if (5 == n) {
                varpDefinition.type = buffer.readUnsignedShort(-1409499570) * 1851631081;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gz.aw(" + ')');
        }
    }
}
