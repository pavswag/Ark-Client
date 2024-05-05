import net.runelite.api.dbtable.DBRowConfig;

// 
// Decompiled by Procyon v0.5.36
// 

public class DbRowType extends DualNode implements DBRowConfig
{
    static final int dp = 12;
    public static EvictingDualNodeHashTable DBRowType_cache;
    static AbstractArchive field4040;
    int[][] field4041;
    public int tableId;
    Object[][] columnTypes;
    
    DbRowType() {
        this.tableId = 1229882107;
    }
    
    static {
        DbRowType.DBRowType_cache = new EvictingDualNodeHashTable(64);
    }
    
    public Object[] ao(final int n) {
        if (this.columnTypes == null) {
            return null;
        }
        return this.columnTypes[n];
    }
    
    void at(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.method2452(buffer, ra, -813673215);
        }
    }
    
    void av() {
    }
    
    void ax(final Buffer buffer, final int n) {
        if (n == 3) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (this.columnTypes == null) {
                this.columnTypes = new Object[ra][];
                this.field4041 = new int[ra][];
            }
            for (int n2 = Buffer.ra(buffer, (byte)7); 255 != n2; n2 = Buffer.ra(buffer, (byte)7)) {
                final int ra2 = Buffer.ra(buffer, (byte)7);
                final int[] array = new int[ra2];
                for (int i = 0; i < ra2; ++i) {
                    array[i] = buffer.readUShortSmart(-483624489);
                }
                this.columnTypes[n2] = class377.method1998(buffer, array, (byte)(-51));
                this.field4041[n2] = array;
            }
        }
        else if (4 == n) {
            this.tableId = buffer.method2514((byte)(-19)) * -1229882107;
        }
    }
    
    void ay(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.method2452(buffer, ra, 177656175);
        }
    }
    
    public Object[] ha(final int n) {
        return this.getColumnType(n, (byte)(-88));
    }
    
    void method2449(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.method2452(buffer, ra, 789571995);
            }
            if (n >= 1223443105) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sz.aw(" + ')');
        }
    }
    
    void am() {
    }
    
    public static DbRowType al(final int n) {
        final DbRowType dbRowType = (DbRowType)DbRowType.DBRowType_cache.wr(n);
        if (dbRowType != null) {
            return dbRowType;
        }
        final byte[] takeFile = DbRowType.field4040.takeFile(-4520532, n, (byte)(-43));
        final DbRowType dbRowType2 = new DbRowType();
        if (null != takeFile) {
            uj(dbRowType2, new Buffer(takeFile), -382613586);
        }
        dbRowType2.method2450(-2014822682);
        DbRowType.DBRowType_cache.put(dbRowType2, n);
        return dbRowType2;
    }
    
    public Object[] getColumnType(final int n, final byte b) {
        try {
            if (this.columnTypes == null) {
                return null;
            }
            return this.columnTypes[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sz.ac(" + ')');
        }
    }
    
    void method2452(final Buffer buffer, final int n, final int n2) {
        try {
            if (n == 3) {
                if (n2 >= 1234871530) {
                    throw new IllegalStateException();
                }
                final int ra = Buffer.ra(buffer, (byte)7);
                if (this.columnTypes == null) {
                    this.columnTypes = new Object[ra][];
                    this.field4041 = new int[ra][];
                }
                for (int n3 = Buffer.ra(buffer, (byte)7); 255 != n3; n3 = Buffer.ra(buffer, (byte)7)) {
                    if (n2 >= 1234871530) {
                        return;
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    final int[] array = new int[ra2];
                    for (int i = 0; i < ra2; ++i) {
                        if (n2 >= 1234871530) {
                            throw new IllegalStateException();
                        }
                        array[i] = buffer.readUShortSmart(-1048904991);
                    }
                    this.columnTypes[n3] = class377.method1998(buffer, array, (byte)(-86));
                    this.field4041[n3] = array;
                }
            }
            else if (4 == n) {
                if (n2 >= 1234871530) {
                    throw new IllegalStateException();
                }
                this.tableId = buffer.method2514((byte)53) * -1229882107;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sz.au(" + ')');
        }
    }
    
    void aa(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.method2452(buffer, ra, -2028547548);
        }
    }
    
    void ai(final Buffer buffer, final int n) {
        if (n == 3) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (this.columnTypes == null) {
                this.columnTypes = new Object[ra][];
                this.field4041 = new int[ra][];
            }
            for (int n2 = Buffer.ra(buffer, (byte)7); 255 != n2; n2 = Buffer.ra(buffer, (byte)7)) {
                final int ra2 = Buffer.ra(buffer, (byte)7);
                final int[] array = new int[ra2];
                for (int i = 0; i < ra2; ++i) {
                    array[i] = buffer.readUShortSmart(-1938254284);
                }
                this.columnTypes[n2] = class377.method1998(buffer, array, (byte)(-20));
                this.field4041[n2] = array;
            }
        }
        else if (4 == n) {
            this.tableId = buffer.method2514((byte)(-108)) * -1229882107;
        }
    }
    
    void ar() {
    }
    
    void method2450(final int n) {
    }
    
    public static DbRowType aq(final int n) {
        final DbRowType dbRowType = (DbRowType)DbRowType.DBRowType_cache.wr(n);
        if (dbRowType != null) {
            return dbRowType;
        }
        final byte[] takeFile = DbRowType.field4040.takeFile(38, n, (byte)(-119));
        final DbRowType dbRowType2 = new DbRowType();
        if (null != takeFile) {
            uj(dbRowType2, new Buffer(takeFile), -374190124);
        }
        dbRowType2.method2450(-2127189419);
        DbRowType.DBRowType_cache.put(dbRowType2, n);
        return dbRowType2;
    }
    
    void ag(final Buffer buffer, final int n) {
        if (n == 3) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (this.columnTypes == null) {
                this.columnTypes = new Object[ra][];
                this.field4041 = new int[ra][];
            }
            for (int n2 = Buffer.ra(buffer, (byte)7); 255 != n2; n2 = Buffer.ra(buffer, (byte)7)) {
                final int ra2 = Buffer.ra(buffer, (byte)7);
                final int[] array = new int[ra2];
                for (int i = 0; i < ra2; ++i) {
                    array[i] = buffer.readUShortSmart(-1513558155);
                }
                this.columnTypes[n2] = class377.method1998(buffer, array, (byte)(-58));
                this.field4041[n2] = array;
            }
        }
        else if (4 == n) {
            this.tableId = buffer.method2514((byte)(-64)) * -1229882107;
        }
    }
    
    void ah() {
    }
    
    public static void uj(final DbRowType dbRowType, final Buffer buffer, final int n) {
        Label_0010: {
            if (dbRowType != null) {
                break Label_0010;
            }
            dbRowType.method2449(buffer, n);
            try {
                while (true) {
                    final int ra = Buffer.ra(buffer, (byte)7);
                    if (ra == 0) {
                        break;
                    }
                    dbRowType.method2452(buffer, ra, 789571995);
                }
                if (n >= 1223443105) {
                    return;
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "sz.aw(" + ')');
            }
        }
    }
    
    public int getTableID() {
        return this.tableId * 468764621;
    }
}
