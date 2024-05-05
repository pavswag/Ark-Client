// 
// Decompiled by Procyon v0.5.36
// 

public class class429 implements class434
{
    public final class465 field3820;
    
    public class429(final class430 class430) {
        this(new class466(class430));
    }
    
    class429(final class466 field3820) {
        this.field3820 = field3820;
    }
    
    public int an(final int n) {
        return this.field3820.vmethod8144(n, (byte)75);
    }
    
    public int method2273(final int n, final short n2) {
        try {
            return this.field3820.vmethod8144(n, (byte)91);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qt.af(" + ')');
        }
    }
    
    public static void dj(final IterableNodeDeque iterableNodeDeque) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.iterator();
        }
        iterableNodeDeque.rsClear();
    }
}
