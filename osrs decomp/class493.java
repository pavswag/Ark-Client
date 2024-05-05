import java.util.ArrayList;

// 
// Decompiled by Procyon v0.5.36
// 

public class class493 implements class356
{
    public static final class493 field4094;
    static final class493 field4095;
    static final class493 field4096;
    static final class493 field4097;
    public static final class493 field4098;
    static final class493 field4099;
    final int field4100;
    final int field4101;
    
    class493(final int n, final int n2) {
        this.field4100 = n * -1186971013;
        this.field4101 = n2 * -1262949217;
    }
    
    static {
        field4098 = new class493(5, 0);
        field4094 = new class493(1, 2);
        field4096 = new class493(2, 5);
        field4095 = new class493(4, 6);
        field4097 = new class493(0, 7);
        field4099 = new class493(3, 8);
    }
    
    public static ArrayList sr(final class166 class166) {
        return class166.field1423;
    }
    
    @Override
    public int aw() {
        return 1588670303 * this.field4101;
    }
    
    @Override
    public int an() {
        return 1588670303 * this.field4101;
    }
    
    @Override
    public int ac() {
        return 1588670303 * this.field4101;
    }
    
    public boolean method2558(final int n) {
        try {
            boolean b;
            if (this == class493.field4094) {
                if (n <= -1284840936) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sr.au(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return 1588670303 * this.field4101;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sr.af(" + ')');
        }
    }
    
    public boolean ab() {
        return this == class493.field4094;
    }
}
