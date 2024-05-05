// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapSectionType implements class356
{
    static int cameraPitch;
    static final WorldMapSectionType WORLDMAPSECTIONTYPE1;
    static final WorldMapSectionType WORLDMAPSECTIONTYPE2;
    static final WorldMapSectionType WORLDMAPSECTIONTYPE3;
    final int type;
    static final WorldMapSectionType WORLDMAPSECTIONTYPE0;
    static Decimator decimator;
    public static String formattedOperatingSystemName;
    final byte id;
    static boolean field2384;
    static int field2385;
    
    WorldMapSectionType(final int n, final byte id) {
        this.type = n * 1161531339;
        this.id = id;
    }
    
    static {
        WORLDMAPSECTIONTYPE0 = new WorldMapSectionType(1, (byte)0);
        WORLDMAPSECTIONTYPE1 = new WorldMapSectionType(0, (byte)1);
        WORLDMAPSECTIONTYPE2 = new WorldMapSectionType(3, (byte)2);
        WORLDMAPSECTIONTYPE3 = new WorldMapSectionType(2, (byte)3);
    }
    
    static char method1507(final char ch, final int n) {
        try {
            if (ch != 'µ') {
                if (n == -113524299) {
                    throw new IllegalStateException();
                }
                if (ch != '\u0192') {
                    return Character.toTitleCase(ch);
                }
            }
            return ch;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jb.aw(" + ')');
        }
    }
    
    public int method1507() {
        return this.id;
    }
    
    public static boolean isNumber(final CharSequence charSequence, final int n) {
        try {
            return UrlRequester.method668(charSequence, 10, true, (byte)46);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jb.an(" + ')');
        }
    }
    
    public int isNumber() {
        return this.id;
    }
    
    @Override
    public int ac() {
        return this.id;
    }
    
    static WorldMapSectionType[] method1508(final int n) {
        try {
            return new WorldMapSectionType[] { WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jb.au(" + ')');
        }
    }
    
    public static String rsOrdinal(final byte[] array, final int n) {
        try {
            return class144.vmethod3248(array, 0, array.length, -253703196);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jb.af(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.id;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jb.af(" + ')');
        }
    }
    
    static WorldMapSectionType[] ab() {
        return new WorldMapSectionType[] { WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0 };
    }
    
    static WorldMapSectionType[] aq() {
        return new WorldMapSectionType[] { WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0 };
    }
}
