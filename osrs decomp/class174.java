import java.security.SecureRandom;

// 
// Decompiled by Procyon v0.5.36
// 

public class class174 extends class177
{
    int field1452;
    final /* synthetic */ class166 this$0;
    protected static final int ay = 256;
    static int cameraY;
    public static final int aj = 3;
    public static final int am = 2;
    static SecureRandom secureRandom;
    static final int ag = 15;
    
    class174(final class166 this$0, final String s, final int n) {
        this.this$0 = this$0;
        super(this$0, s);
        this.field1452 = 1613357613 * n;
    }
    
    @Override
    public int at() {
        return this.field1452 * -1898005083;
    }
    
    @Override
    public int ay() {
        return this.field1452 * -1898005083;
    }
    
    @Override
    public int aw() {
        return 0;
    }
    
    @Override
    public int vmethod3378(final int n) {
        try {
            return this.field1452 * -1898005083;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gk.al(" + ')');
        }
    }
    
    @Override
    public int ac() {
        return 0;
    }
    
    @Override
    public int au() {
        return 0;
    }
    
    @Override
    public int aa() {
        return this.field1452 * -1898005083;
    }
    
    @Override
    public int vmethod3379(final byte b) {
        try {
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gk.af(" + ')');
        }
    }
}
