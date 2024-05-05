// 
// Decompiled by Procyon v0.5.36
// 

public class class310
{
    static final int aw = 2;
    public static final int bs = 50;
    
    class310() throws Throwable {
        throw new Error();
    }
    
    public static int aw(final int n, final int n2, int n3) {
        n3 &= 0x3;
        if (n3 == 0) {
            return n;
        }
        if (1 == n3) {
            return n2;
        }
        if (2 == n3) {
            return 7 - n;
        }
        return 7 - n2;
    }
    
    public static int an(final int n, final int n2, int n3) {
        n3 &= 0x3;
        if (n3 == 0) {
            return n;
        }
        if (1 == n3) {
            return n2;
        }
        if (2 == n3) {
            return 7 - n;
        }
        return 7 - n2;
    }
    
    static void method1689(final int n, final int n2) {
        try {
            class424.field3785 = n * -1605864417;
            class424.field3787 = new class424[n];
            class424.field3786 = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lw.af(" + ')');
        }
    }
}
