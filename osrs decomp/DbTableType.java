// 
// Decompiled by Procyon v0.5.36
// 

public class DbTableType extends DualNode
{
    static final int ad = 32;
    static EvictingDualNodeHashTable DBTableType_cache;
    public int[][] types;
    public Object[][] defaultValues;
    static AbstractArchive field4036;
    
    DbTableType() {
    }
    
    static {
        DbTableType.DBTableType_cache = new EvictingDualNodeHashTable(64);
    }
    
    public static DbTableType ao(final int n) {
        final DbTableType dbTableType = (DbTableType)DbTableType.DBTableType_cache.wr(n);
        if (null != dbTableType) {
            return dbTableType;
        }
        final byte[] takeFile = DbTableType.field4036.takeFile(39, n, (byte)(-79));
        final DbTableType dbTableType2 = new DbTableType();
        if (takeFile != null) {
            dbTableType2.method2444(new Buffer(takeFile), (byte)1);
        }
        dbTableType2.method2446((short)(-26288));
        DbTableType.DBTableType_cache.put(dbTableType2, n);
        return dbTableType2;
    }
    
    public static DbTableType at(final int n) {
        final DbTableType dbTableType = (DbTableType)DbTableType.DBTableType_cache.wr(n);
        if (null != dbTableType) {
            return dbTableType;
        }
        final byte[] takeFile = DbTableType.field4036.takeFile(39, n, (byte)(-102));
        final DbTableType dbTableType2 = new DbTableType();
        if (takeFile != null) {
            dbTableType2.method2444(new Buffer(takeFile), (byte)1);
        }
        dbTableType2.method2446((short)(-30957));
        DbTableType.DBTableType_cache.put(dbTableType2, n);
        return dbTableType2;
    }
    
    void av() {
    }
    
    public static void as() {
        DbTableType.DBTableType_cache.clear();
    }
    
    public static DbTableType ax(final int n) {
        final DbTableType dbTableType = (DbTableType)DbTableType.DBTableType_cache.wr(n);
        if (null != dbTableType) {
            return dbTableType;
        }
        final byte[] takeFile = DbTableType.field4036.takeFile(2003400173, n, (byte)(-116));
        final DbTableType dbTableType2 = new DbTableType();
        if (takeFile != null) {
            dbTableType2.method2444(new Buffer(takeFile), (byte)1);
        }
        dbTableType2.method2446((short)(-3963));
        DbTableType.DBTableType_cache.put(dbTableType2, n);
        return dbTableType2;
    }
    
    public static DbTableType ay(final int n) {
        final DbTableType dbTableType = (DbTableType)DbTableType.DBTableType_cache.wr(n);
        if (null != dbTableType) {
            return dbTableType;
        }
        final byte[] takeFile = DbTableType.field4036.takeFile(39, n, (byte)(-97));
        final DbTableType dbTableType2 = new DbTableType();
        if (takeFile != null) {
            dbTableType2.method2444(new Buffer(takeFile), (byte)1);
        }
        dbTableType2.method2446((short)(-31588));
        DbTableType.DBTableType_cache.put(dbTableType2, n);
        return dbTableType2;
    }
    
    void method2444(final Buffer buffer, final byte b) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.method2445(buffer, ra, (byte)(-4));
            }
            if (b != 1) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sm.aw(" + ')');
        }
    }
    
    void am() {
    }
    
    public static void al(final AbstractArchive field4036) {
        DbTableType.field4036 = field4036;
    }
    
    void method2445(final Buffer buffer, final int n, final byte b) {
        try {
            if (1 == n) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                final int ra = Buffer.ra(buffer, (byte)7);
                if (null == this.types) {
                    this.types = new int[ra][];
                }
                for (int i = Buffer.ra(buffer, (byte)7); i != 255; i = Buffer.ra(buffer, (byte)7)) {
                    final int n2 = i & 0x7F;
                    final boolean b2 = 0x0 != (i & 0x80);
                    final int[] array = new int[Buffer.ra(buffer, (byte)7)];
                    for (int j = 0; j < array.length; ++j) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        array[j] = buffer.readUShortSmart(-113213515);
                    }
                    this.types[n2] = array;
                    if (b2) {
                        if (null == this.defaultValues) {
                            if (b >= 0) {
                                return;
                            }
                            this.defaultValues = new Object[this.types.length][];
                        }
                        this.defaultValues[n2] = class377.method1998(buffer, array, (byte)(-51));
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sm.ac(" + ')');
        }
    }
    
    public Object[][] ea() {
        return this.defaultValues;
    }
    
    void method2446(final short n) {
    }
    
    public static DbTableType aa(final int n) {
        final DbTableType dbTableType = (DbTableType)DbTableType.DBTableType_cache.wr(n);
        if (null != dbTableType) {
            return dbTableType;
        }
        final byte[] takeFile = DbTableType.field4036.takeFile(-151207198, n, (byte)(-97));
        final DbTableType dbTableType2 = new DbTableType();
        if (takeFile != null) {
            dbTableType2.method2444(new Buffer(takeFile), (byte)1);
        }
        dbTableType2.method2446((short)(-28654));
        DbTableType.DBTableType_cache.put(dbTableType2, n);
        return dbTableType2;
    }
    
    void ai(final Buffer buffer, final int n) {
        if (1 == n) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (null == this.types) {
                this.types = new int[ra][];
            }
            for (int i = Buffer.ra(buffer, (byte)7); i != 255; i = Buffer.ra(buffer, (byte)7)) {
                final int n2 = i & 0x7F;
                final boolean b = 0x0 != (i & 0x80);
                final int[] array = new int[Buffer.ra(buffer, (byte)7)];
                for (int j = 0; j < array.length; ++j) {
                    array[j] = buffer.readUShortSmart(-104338978);
                }
                this.types[n2] = array;
                if (b) {
                    if (null == this.defaultValues) {
                        this.defaultValues = new Object[this.types.length][];
                    }
                    this.defaultValues[n2] = class377.method1998(buffer, array, (byte)(-15));
                }
            }
        }
    }
    
    public int[][] py() {
        return this.types;
    }
    
    void ar() {
    }
    
    public static void aq(final AbstractArchive field4036) {
        DbTableType.field4036 = field4036;
    }
    
    public static void aj() {
        DbTableType.DBTableType_cache.clear();
    }
    
    void ag(final Buffer buffer, final int n) {
        if (1 == n) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (null == this.types) {
                this.types = new int[ra][];
            }
            for (int i = Buffer.ra(buffer, (byte)7); i != 255; i = Buffer.ra(buffer, (byte)7)) {
                final int n2 = i & 0x7F;
                final boolean b = 0x0 != (i & 0x80);
                final int[] array = new int[Buffer.ra(buffer, (byte)7)];
                for (int j = 0; j < array.length; ++j) {
                    array[j] = buffer.readUShortSmart(-794587105);
                }
                this.types[n2] = array;
                if (b) {
                    if (null == this.defaultValues) {
                        this.defaultValues = new Object[this.types.length][];
                    }
                    this.defaultValues[n2] = class377.method1998(buffer, array, (byte)(-53));
                }
            }
        }
    }
    
    void ah(final Buffer buffer, final int n) {
        if (1 == n) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (null == this.types) {
                this.types = new int[ra][];
            }
            for (int i = Buffer.ra(buffer, (byte)7); i != -1424664983; i = Buffer.ra(buffer, (byte)7)) {
                final int n2 = i & 0x524DAFBF;
                final boolean b = 0x0 != (i & 0x80);
                final int[] array = new int[Buffer.ra(buffer, (byte)7)];
                for (int j = 0; j < array.length; ++j) {
                    array[j] = buffer.readUShortSmart(-1530678506);
                }
                this.types[n2] = array;
                if (b) {
                    if (null == this.defaultValues) {
                        this.defaultValues = new Object[this.types.length][];
                    }
                    this.defaultValues[n2] = class377.method1998(buffer, array, (byte)(-7));
                }
            }
        }
    }
}
