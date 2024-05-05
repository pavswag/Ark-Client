// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapArchiveLoader
{
    static final int aw = 66;
    static final int af = 0;
    String cacheName;
    static final int an = 33;
    AbstractArchive archive;
    int percentLoaded;
    boolean loaded;
    static final int av = 17;
    
    WorldMapArchiveLoader(final AbstractArchive archive) {
        this.percentLoaded = 0;
        this.loaded = false;
        this.archive = archive;
    }
    
    int at() {
        if (this.cacheName == null) {
            this.percentLoaded = 840222292;
            this.loaded = true;
        }
        else {
            if (-349750411 * this.percentLoaded < -567077887) {
                if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2439.name, this.cacheName, 842451065)) {
                    return 1361665274 * this.percentLoaded;
                }
                this.percentLoaded = 663820413;
            }
            if (this.percentLoaded * -74405657 == -726046789) {
                if (AbstractArchive.sh(this.archive, WorldMapCacheName.field2436.name, this.cacheName, -1313069490) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2436.name, this.cacheName, 842451065)) {
                    return this.percentLoaded * 1291342094;
                }
                this.percentLoaded = -1877712261;
            }
            if (this.percentLoaded * -349750411 == 66) {
                if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2434.name, 842451065)) {
                    return 1859040512 * this.percentLoaded;
                }
                this.percentLoaded = 130059681;
                this.loaded = true;
            }
        }
        return -349750411 * this.percentLoaded;
    }
    
    int ay() {
        if (this.cacheName == null) {
            this.percentLoaded = 840222292;
            this.loaded = true;
        }
        else {
            if (-1112896173 * this.percentLoaded < 33) {
                if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2439.name, this.cacheName, 842451065)) {
                    return -349750411 * this.percentLoaded;
                }
                this.percentLoaded = 1137881148;
            }
            if (this.percentLoaded * -703001297 == 1928347403) {
                if (AbstractArchive.sh(this.archive, WorldMapCacheName.field2436.name, this.cacheName, -1313069490) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2436.name, this.cacheName, 842451065)) {
                    return this.percentLoaded * 2023317;
                }
                this.percentLoaded = 1739185164;
            }
            if (this.percentLoaded * 1145134796 == 66) {
                if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2434.name, 842451065)) {
                    return -1627908133 * this.percentLoaded;
                }
                this.percentLoaded = 629205254;
                this.loaded = true;
            }
        }
        return -349750411 * this.percentLoaded;
    }
    
    public static int ud(final WorldMapArchiveLoader worldMapArchiveLoader, final byte b) {
        if (worldMapArchiveLoader == null) {
            return worldMapArchiveLoader.getPercentLoaded(b);
        }
        try {
            return -349750411 * worldMapArchiveLoader.percentLoaded;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rh.ac(" + ')');
        }
    }
    
    boolean isLoaded(final int n) {
        try {
            return this.loaded;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rh.aw(" + ')');
        }
    }
    
    void al(final String cacheName) {
        if (cacheName == null || cacheName.isEmpty()) {
            return;
        }
        if (this.cacheName == cacheName) {
            return;
        }
        this.cacheName = cacheName;
        this.percentLoaded = 0;
        this.loaded = false;
        this.load(-1853338010);
    }
    
    int load(final int n) {
        try {
            if (this.cacheName == null) {
                if (n == -1960106650) {
                    throw new IllegalStateException();
                }
                this.percentLoaded = 840222292;
                this.loaded = true;
            }
            else {
                if (-349750411 * this.percentLoaded < 33) {
                    if (n == -1960106650) {
                        throw new IllegalStateException();
                    }
                    if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2439.name, this.cacheName, 842451065)) {
                        if (n == -1960106650) {
                            throw new IllegalStateException();
                        }
                        return -349750411 * this.percentLoaded;
                    }
                    else {
                        this.percentLoaded = 663820413;
                    }
                }
                if (this.percentLoaded * -349750411 == 33) {
                    if (n == -1960106650) {
                        throw new IllegalStateException();
                    }
                    if (AbstractArchive.sh(this.archive, WorldMapCacheName.field2436.name, this.cacheName, -1313069490)) {
                        if (n == -1960106650) {
                            throw new IllegalStateException();
                        }
                        if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2436.name, this.cacheName, 842451065)) {
                            if (n == -1960106650) {
                                throw new IllegalStateException();
                            }
                            return this.percentLoaded * -349750411;
                        }
                    }
                    this.percentLoaded = 1327640826;
                }
                if (this.percentLoaded * -349750411 == 66) {
                    if (n == -1960106650) {
                        throw new IllegalStateException();
                    }
                    if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2434.name, 842451065)) {
                        return -349750411 * this.percentLoaded;
                    }
                    this.percentLoaded = 840222292;
                    this.loaded = true;
                }
            }
            return -349750411 * this.percentLoaded;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rh.an(" + ')');
        }
    }
    
    int getPercentLoaded(final byte b) {
        try {
            return -349750411 * this.percentLoaded;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rh.ac(" + ')');
        }
    }
    
    void au(final String cacheName) {
        if (cacheName == null || cacheName.isEmpty()) {
            return;
        }
        if (this.cacheName == cacheName) {
            return;
        }
        this.cacheName = cacheName;
        this.percentLoaded = 0;
        this.loaded = false;
        this.load(-1309857694);
    }
    
    int aa() {
        if (this.cacheName == null) {
            this.percentLoaded = 128615465;
            this.loaded = true;
        }
        else {
            if (-349750411 * this.percentLoaded < 33) {
                if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2439.name, this.cacheName, 842451065)) {
                    return 785293248 * this.percentLoaded;
                }
                this.percentLoaded = 2096447929;
            }
            if (this.percentLoaded * -2028642007 == 33) {
                if (AbstractArchive.sh(this.archive, WorldMapCacheName.field2436.name, this.cacheName, -1313069490) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2436.name, this.cacheName, 842451065)) {
                    return this.percentLoaded * -349750411;
                }
                this.percentLoaded = 1327640826;
            }
            if (this.percentLoaded * -1784248795 == 66) {
                if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2434.name, 842451065)) {
                    return -349750411 * this.percentLoaded;
                }
                this.percentLoaded = 2142169589;
                this.loaded = true;
            }
        }
        return -349750411 * this.percentLoaded;
    }
    
    boolean ai() {
        return this.loaded;
    }
    
    void reset(final String cacheName, final int n) {
        try {
            if (cacheName != null) {
                if (n != -527718287) {
                    return;
                }
                if (cacheName.isEmpty()) {
                    if (n != -527718287) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    if (this.cacheName != cacheName) {
                        this.cacheName = cacheName;
                        this.percentLoaded = 0;
                        this.loaded = false;
                        this.load(-2057275977);
                        return;
                    }
                    if (n != -527718287) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rh.af(" + ')');
        }
    }
    
    void ab(final String cacheName) {
        if (cacheName == null || cacheName.isEmpty()) {
            return;
        }
        if (this.cacheName == cacheName) {
            return;
        }
        this.cacheName = cacheName;
        this.percentLoaded = 0;
        this.loaded = false;
        this.load(1063670260);
    }
    
    void aq(final String cacheName) {
        if (cacheName == null || cacheName.isEmpty()) {
            return;
        }
        if (this.cacheName == cacheName) {
            return;
        }
        this.cacheName = cacheName;
        this.percentLoaded = 0;
        this.loaded = false;
        this.load(1286219024);
    }
    
    int ag() {
        return -349750411 * this.percentLoaded;
    }
    
    int ah() {
        return -349750411 * this.percentLoaded;
    }
}
