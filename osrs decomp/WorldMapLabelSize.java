// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapLabelSize
{
    final int field2279;
    public static final WorldMapLabelSize WorldMapLabelSize_small;
    public static final WorldMapLabelSize WorldMapLabelSize_large;
    final int field2282;
    static final int dg = 9;
    final int field2283;
    public static final WorldMapLabelSize WorldMapLabelSize_medium;
    static final int bu = 1004;
    public static final int cg = 86;
    public static final int at = 11;
    static Archive field2285;
    
    WorldMapLabelSize(final int n, final int n2, final int n3) {
        this.field2282 = n * -1440612219;
        this.field2279 = -841767259 * n2;
        this.field2283 = -1162134759 * n3;
    }
    
    static {
        WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
        WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
        WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
    }
    
    public static void fw(final AbstractArchive abstractArchive, final int n) {
        if (abstractArchive == null) {
            abstractArchive.getFile(n, n, n);
        }
        for (int i = 0; i < abstractArchive.files[n].length; ++i) {
            abstractArchive.files[n][i] = null;
        }
    }
    
    static Archive newArchive(final int n, final boolean b, final boolean b2, final boolean b3, final boolean b4, final int n2) {
        try {
            ArchiveDisk archiveDisk = null;
            if (null != JagexCache.JagexCache_dat2File) {
                if (n2 <= 2022123154) {
                    throw new IllegalStateException();
                }
                archiveDisk = new ArchiveDisk(n, JagexCache.JagexCache_dat2File, class370.JagexCache_idxFiles[n], 1000000);
            }
            return new Archive(archiveDisk, WorldMapID.masterDisk, n, b, b2, b3, b4);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jd.hn(" + ')');
        }
    }
    
    static WorldMapLabelSize aw(final int n) {
        final WorldMapLabelSize[] array = { WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large };
        for (int i = 0; i < array.length; ++i) {
            final WorldMapLabelSize worldMapLabelSize = array[i];
            if (-1090963937 * worldMapLabelSize.field2279 == n) {
                return worldMapLabelSize;
            }
        }
        return null;
    }
    
    static WorldMapLabelSize method1395(final int n, final int n2) {
        try {
            final WorldMapLabelSize[] array = { WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large };
            int i = 0;
            while (i < array.length) {
                final WorldMapLabelSize worldMapLabelSize = array[i];
                if (513003821 * worldMapLabelSize.field2279 == n) {
                    if (n2 >= 1659861187) {
                        throw new IllegalStateException();
                    }
                    return worldMapLabelSize;
                }
                else {
                    ++i;
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jd.an(" + ')');
        }
    }
    
    static WorldMapLabelSize ac(final int n) {
        final WorldMapLabelSize[] array = { WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large };
        for (int i = 0; i < array.length; ++i) {
            final WorldMapLabelSize worldMapLabelSize = array[i];
            if (513003821 * worldMapLabelSize.field2279 == n) {
                return worldMapLabelSize;
            }
        }
        return null;
    }
    
    static WorldMapLabelSize au(final int n) {
        final WorldMapLabelSize[] array = { WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large };
        for (int i = 0; i < array.length; ++i) {
            final WorldMapLabelSize worldMapLabelSize = array[i];
            if (513003821 * worldMapLabelSize.field2279 == n) {
                return worldMapLabelSize;
            }
        }
        return null;
    }
    
    boolean method1394(final float n, final byte b) {
        try {
            return n >= 2106192169 * this.field2283;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jd.af(" + ')');
        }
    }
    
    static final void method1397(final PacketBuffer packetBuffer, final byte b) {
        try {
            for (int i = 0; i < Players.Players_pendingUpdateCount * 1474255643; ++i) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                final int n = Players.Players_pendingUpdateIndices[i];
                final Player player = Client.players[n];
                int ra = Buffer.ra(packetBuffer, (byte)7);
                if (0x0 != (ra & 0x8)) {
                    ra += Buffer.ra(packetBuffer, (byte)7) << 8;
                }
                if (0x0 != (ra & 0x4000)) {
                    if (b == 1) {
                        throw new IllegalStateException();
                    }
                    ra += Buffer.ra(packetBuffer, (byte)7) << 16;
                }
                ClientPreferences.setIsUsernameHidden(packetBuffer, n, player, ra, (byte)(-111));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jd.ab(" + ')');
        }
    }
    
    static WorldMapLabelSize method1397(final int n) {
        final WorldMapLabelSize[] array = { WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large };
        for (int i = 0; i < array.length; ++i) {
            final WorldMapLabelSize worldMapLabelSize = array[i];
            if (513003821 * worldMapLabelSize.field2279 == n) {
                return worldMapLabelSize;
            }
        }
        return null;
    }
}
