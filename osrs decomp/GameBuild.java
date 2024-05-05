// 
// Decompiled by Procyon v0.5.36
// 

public class GameBuild
{
    final int buildId;
    static final GameBuild BUILDLIVE;
    static final GameBuild RC;
    public final String name;
    static Archive archive7;
    static final GameBuild WIP;
    static final GameBuild LIVE;
    
    GameBuild(final String name, final int n) {
        this.name = name;
        this.buildId = -1294558747 * n;
    }
    
    static {
        LIVE = new GameBuild("LIVE", 0);
        BUILDLIVE = new GameBuild("BUILDLIVE", 3);
        RC = new GameBuild("RC", 1);
        WIP = new GameBuild("WIP", 2);
    }
    
    static final int method1847(final int n, int n2, final int n3, final int n4) {
        try {
            if (n3 > 179) {
                if (n4 >= 1348853709) {
                    throw new IllegalStateException();
                }
                n2 /= 2;
            }
            if (n3 > 192) {
                if (n4 >= 1348853709) {
                    throw new IllegalStateException();
                }
                n2 /= 2;
            }
            if (n3 > 217) {
                if (n4 >= 1348853709) {
                    throw new IllegalStateException();
                }
                n2 /= 2;
            }
            if (n3 > 243) {
                if (n4 >= 1348853709) {
                    throw new IllegalStateException();
                }
                n2 /= 2;
            }
            return (n / 4 << 10) + (n2 / 32 << 7) + n3 / 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "md.as(" + ')');
        }
    }
    
    public static GameBuild aw(final int n) {
        final GameBuild[] array = { GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP };
        for (int i = 0; i < array.length; ++i) {
            final GameBuild gameBuild = array[i];
            if (n == gameBuild.buildId * -978256915) {
                return gameBuild;
            }
        }
        return null;
    }
    
    public static DbTableType getDbTableType(final int n, final byte b) {
        try {
            final DbTableType dbTableType = (DbTableType)DbTableType.DBTableType_cache.wr(n);
            if (null == dbTableType) {
                final byte[] takeFile = DbTableType.field4036.takeFile(39, n, (byte)0);
                final DbTableType dbTableType2 = new DbTableType();
                if (takeFile != null) {
                    dbTableType2.method2444(new Buffer(takeFile), (byte)1);
                }
                dbTableType2.method2446((short)(-25081));
                DbTableType.DBTableType_cache.put(dbTableType2, n);
                return dbTableType2;
            }
            if (b <= 1) {
                throw new IllegalStateException();
            }
            return dbTableType;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "md.an(" + ')');
        }
    }
    
    public static GameBuild getDbTableType(final int n) {
        final GameBuild[] array = { GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP };
        for (int i = 0; i < array.length; ++i) {
            final GameBuild gameBuild = array[i];
            if (n == gameBuild.buildId * 2122091691) {
                return gameBuild;
            }
        }
        return null;
    }
    
    public static GameBuild ac(final int n) {
        final GameBuild[] array = { GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP };
        for (int i = 0; i < array.length; ++i) {
            final GameBuild gameBuild = array[i];
            if (n == gameBuild.buildId * -978256915) {
                return gameBuild;
            }
        }
        return null;
    }
    
    public static GameBuild au(final int n) {
        final GameBuild[] array = { GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP };
        for (int i = 0; i < array.length; ++i) {
            final GameBuild gameBuild = array[i];
            if (n == gameBuild.buildId * -978256915) {
                return gameBuild;
            }
        }
        return null;
    }
}
