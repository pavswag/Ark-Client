import java.awt.event.WindowEvent;

// 
// Decompiled by Procyon v0.5.36
// 

public class TriBool
{
    static int field3738;
    public static final TriBool TriBool_true;
    public static final TriBool TriBool_false;
    static final int bg = 52;
    public static final TriBool TriBool_unknown;
    static final int du = 13;
    
    TriBool() {
    }
    
    static {
        TriBool_unknown = new TriBool();
        TriBool_true = new TriBool();
        TriBool_false = new TriBool();
    }
    
    public static int mf(final ClientPreferences clientPreferences) {
        return clientPreferences.field1040 * -997285237;
    }
    
    public static int method2198(final int n, final byte b) {
        try {
            return class439.field3830[n & 0x3FFF];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "px.ac(" + ')');
        }
    }
    
    public static void xo(final GameEngine gameEngine, final WindowEvent windowEvent) {
        if (gameEngine == null) {
            gameEngine.dx();
        }
    }
}
