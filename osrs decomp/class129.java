// 
// Decompiled by Procyon v0.5.36
// 

public class class129 implements class119
{
    static final int au = 4;
    
    static void method763(final int n, final byte b) {
        try {
            if (1145608355 * Login.loginIndex != n) {
                Login.loginIndex = 1331354379 * n;
                return;
            }
            if (b <= 1) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ee.ak(" + ')');
        }
    }
    
    static int method762(final int n) {
        try {
            return (Messages.Messages_count -= 284896739) * -1810202571 - 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ee.af(" + ')');
        }
    }
    
    public static String wm(final Username username) {
        return username.cleanName;
    }
}
