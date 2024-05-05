import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class class9 implements class356
{
    int field20;
    static List field21;
    static final class9 field22;
    static final class9 field23;
    static final int bo = 39;
    public static final class9 field24;
    String field25;
    boolean field26;
    boolean field27;
    static int field28;
    static int field29;
    public static final class9 field30;
    static final class9 field31;
    
    class9(final int n, final String field25, final boolean field26, final boolean field27) {
        this.field20 = 30970631 * n;
        this.field25 = field25;
        this.field26 = field26;
        this.field27 = field27;
    }
    
    static {
        field30 = new class9(0, "POST", true, true);
        field24 = new class9(1, "GET", true, false);
        field22 = new class9(2, "PUT", false, true);
        field23 = new class9(3, "PATCH", false, true);
        field31 = new class9(4, "DELETE", false, true);
    }
    
    boolean ao() {
        return this.field27;
    }
    
    public String at() {
        return this.field25;
    }
    
    @Override
    public int aw() {
        return this.field20 * 985819831;
    }
    
    @Override
    public int an() {
        return this.field20 * 985819831;
    }
    
    @Override
    public int ac() {
        return this.field20 * 985819831;
    }
    
    boolean method33(final byte b) {
        try {
            return this.field26;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aa.au(" + ')');
        }
    }
    
    public String aa() {
        return this.field25;
    }
    
    public static SpritePixels fy(final class354 class354, final int n) {
        if (class354 == null) {
            class354.ao(n);
        }
        if (!class354.spriteMap.containsKey(n)) {
            class354.method1934(n, (byte)(-1));
        }
        return class354.spriteMap.get(n);
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.field20 * 985819831;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aa.af(" + ')');
        }
    }
    
    public String method30(final byte b) {
        try {
            return this.field25;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aa.ab(" + ')');
        }
    }
    
    boolean method31(final int n) {
        try {
            return this.field27;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aa.aq(" + ')');
        }
    }
    
    public static boolean hj(final class9 class9, final byte b) {
        if (class9 == null) {
            return class9.method33(b);
        }
        try {
            return class9.field26;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aa.au(" + ')');
        }
    }
}
