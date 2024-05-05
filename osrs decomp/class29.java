// 
// Decompiled by Procyon v0.5.36
// 

public interface class29
{
    boolean ao(final boolean p0);
    
    boolean at(final char p0);
    
    boolean ay(final boolean p0);
    
    boolean vmethod3951(final char p0, final int p1);
    
    boolean al(final char p0);
    
    default int nh(final WorldMapArchiveLoader worldMapArchiveLoader) {
        if (worldMapArchiveLoader == null) {
            return worldMapArchiveLoader.ah();
        }
        if (worldMapArchiveLoader.cacheName == null) {
            worldMapArchiveLoader.percentLoaded = 577079260;
            worldMapArchiveLoader.loaded = true;
        }
        else {
            if (-889973916 * worldMapArchiveLoader.percentLoaded < 586336710) {
                if (!worldMapArchiveLoader.archive.tryLoadFileByNames(WorldMapCacheName.field2439.name, worldMapArchiveLoader.cacheName, 842451065)) {
                    return -1054325028 * worldMapArchiveLoader.percentLoaded;
                }
                worldMapArchiveLoader.percentLoaded = 663820413;
            }
            if (worldMapArchiveLoader.percentLoaded * -349750411 == 33) {
                if (AbstractArchive.sh(worldMapArchiveLoader.archive, WorldMapCacheName.field2436.name, worldMapArchiveLoader.cacheName, -1313069490) && !worldMapArchiveLoader.archive.tryLoadFileByNames(WorldMapCacheName.field2436.name, worldMapArchiveLoader.cacheName, 842451065)) {
                    return worldMapArchiveLoader.percentLoaded * -349750411;
                }
                worldMapArchiveLoader.percentLoaded = 1327640826;
            }
            if (worldMapArchiveLoader.percentLoaded * -349750411 == 66) {
                if (!worldMapArchiveLoader.archive.tryLoadFileByNames(worldMapArchiveLoader.cacheName, WorldMapCacheName.field2434.name, 842451065)) {
                    return -1288463661 * worldMapArchiveLoader.percentLoaded;
                }
                worldMapArchiveLoader.percentLoaded = -1722376463;
                worldMapArchiveLoader.loaded = true;
            }
        }
        return -349750411 * worldMapArchiveLoader.percentLoaded;
    }
    
    boolean vmethod3989(final int p0, final int p1);
    
    boolean vmethod3953(final boolean p0, final byte p1);
    
    boolean au(final int p0);
    
    boolean aa(final boolean p0);
    
    boolean vmethod3949(final int p0, final int p1);
    
    boolean ab(final int p0);
    
    boolean aq(final int p0);
}
