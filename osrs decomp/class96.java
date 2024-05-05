// 
// Decompiled by Procyon v0.5.36
// 

public class class96
{
    static String ab;
    static String af;
    static String aw;
    static String ac;
    static String au;
    static int widgetDragDuration;
    static String aq;
    static String al;
    public static String[] cacheSubPaths;
    static final int by = 28;
    static final int be = 44;
    static String an;
    static Bounds field1063;
    static int field1064;
    static final int ci = 100;
    
    class96() throws Throwable {
        throw new Error();
    }
    
    static {
        class96.af = "true";
        class96.an = ",";
        class96.aw = "|";
        class96.ac = " (";
        class96.au = ")";
        class96.ab = "->";
        class96.aq = "<br>";
        class96.al = "</col>";
    }
    
    static String aw(final int i) {
        return "<img=" + i + ">";
    }
    
    static String ac(final int i) {
        return "<img=" + i + ">";
    }
    
    static String au(final int i) {
        return "<img=" + i + ">";
    }
    
    public static final synchronized long clockNow(final int n) {
        try {
            final long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < class293.field2711 * 1436109859624790083L) {
                if (n <= -498726675) {
                    throw new IllegalStateException();
                }
                class293.field2712 += 4531959532299302581L * (class293.field2711 * 1436109859624790083L - currentTimeMillis);
            }
            class293.field2711 = -820153132959898517L * currentTimeMillis;
            return currentTimeMillis + 5764352098133378973L * class293.field2712;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dq.af(" + ')');
        }
    }
    
    static String ab(final int i) {
        return "<col=" + Integer.toHexString(i) + ">";
    }
    
    static String aq(final int i) {
        return "<col=" + Integer.toHexString(i) + ">";
    }
}
