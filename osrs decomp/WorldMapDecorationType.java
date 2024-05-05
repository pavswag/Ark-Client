// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapDecorationType implements class356
{
    static final WorldMapDecorationType field3044;
    static final WorldMapDecorationType field3045;
    public static final WorldMapDecorationType field3046;
    public static final WorldMapDecorationType field3047;
    public static final WorldMapDecorationType field3048;
    static final WorldMapDecorationType field3049;
    public static final WorldMapDecorationType field3050;
    static final WorldMapDecorationType field3051;
    static final WorldMapDecorationType field3052;
    static final WorldMapDecorationType field3053;
    static final WorldMapDecorationType field3054;
    static final WorldMapDecorationType field3055;
    static final WorldMapDecorationType field3056;
    static final WorldMapDecorationType field3057;
    static final WorldMapDecorationType field3058;
    static final WorldMapDecorationType field3059;
    static final WorldMapDecorationType field3060;
    static final WorldMapDecorationType field3061;
    static final WorldMapDecorationType field3062;
    static final WorldMapDecorationType field3063;
    static final WorldMapDecorationType field3064;
    static final WorldMapDecorationType field3065;
    public static final WorldMapDecorationType field3066;
    public final int id;
    
    WorldMapDecorationType(final int n, final int n2) {
        this.id = n * -147171755;
    }
    
    static {
        field3047 = new WorldMapDecorationType(0, 0);
        field3045 = new WorldMapDecorationType(1, 0);
        field3046 = new WorldMapDecorationType(2, 0);
        field3050 = new WorldMapDecorationType(3, 0);
        field3048 = new WorldMapDecorationType(9, 2);
        field3044 = new WorldMapDecorationType(4, 1);
        field3061 = new WorldMapDecorationType(5, 1);
        field3051 = new WorldMapDecorationType(6, 1);
        field3052 = new WorldMapDecorationType(7, 1);
        field3053 = new WorldMapDecorationType(8, 1);
        field3054 = new WorldMapDecorationType(12, 2);
        field3055 = new WorldMapDecorationType(13, 2);
        field3049 = new WorldMapDecorationType(14, 2);
        field3057 = new WorldMapDecorationType(15, 2);
        field3058 = new WorldMapDecorationType(16, 2);
        field3063 = new WorldMapDecorationType(17, 2);
        field3060 = new WorldMapDecorationType(18, 2);
        field3062 = new WorldMapDecorationType(19, 2);
        field3056 = new WorldMapDecorationType(20, 2);
        field3059 = new WorldMapDecorationType(21, 2);
        field3064 = new WorldMapDecorationType(10, 2);
        field3065 = new WorldMapDecorationType(11, 2);
        field3066 = new WorldMapDecorationType(22, 3);
    }
    
    @Override
    public int aw() {
        return -1638981703 * this.id;
    }
    
    @Override
    public int an() {
        return -1344801027 * this.id;
    }
    
    @Override
    public int ac() {
        return -826575858 * this.id;
    }
    
    public static String method1841(final CharSequence charSequence, final byte b) {
        try {
            return class14.method57('*', charSequence.length(), (byte)0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mc.ai(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return -1344801027 * this.id;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mc.af(" + ')');
        }
    }
    
    public static boolean ab(final int n) {
        return n >= WorldMapDecorationType.field3064.id * -1344801027 && n <= WorldMapDecorationType.field3065.id * -1344801027;
    }
    
    public static boolean aq(final int n) {
        return n >= WorldMapDecorationType.field3064.id * -1344801027 && n <= WorldMapDecorationType.field3065.id * -1344801027;
    }
}
