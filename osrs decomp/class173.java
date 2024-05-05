// 
// Decompiled by Procyon v0.5.36
// 

public class class173
{
    public int field1446;
    static final int an = 1;
    public String field1447;
    public float[] field1448;
    final /* synthetic */ class166 this$0;
    static final int by = 1;
    public int field1449;
    public int field1450;
    static SpritePixels[] crossSprites;
    static final int az = 1;
    public static final int ar = 34;
    static final int af = 0;
    
    class173(final class166 this$0) {
        this.this$0 = this$0;
        this.field1448 = new float[4];
        this.field1449 = -663309687;
        this.field1450 = 1437150123;
        this.field1446 = 0;
    }
    
    public static void method958(final byte b) {
        try {
            NPCComposition.NpcDefinition_cached.clear();
            NPCComposition.NpcDefinition_cachedModels.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gq.ax(" + ')');
        }
    }
    
    public static boolean method957(final long n) {
        try {
            boolean b = 0L != n;
            if (b) {
                b = (1 != (int)(n >>> 16 & 0x1L));
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gq.aw(" + ')');
        }
    }
    
    static void method955(final byte b) {
        try {
            if (986256295 * Client.oculusOrbState == 1) {
                Client.oculusOrbOnLocalPlayer = true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gq.nk(" + ')');
        }
    }
    
    public static int method956(final CharSequence charSequence, final int n) {
        try {
            final int length = charSequence.length();
            int n2 = 0;
            for (int i = 0; i < length; ++i) {
                if (n == -254804647) {
                    throw new IllegalStateException();
                }
                final char char1 = charSequence.charAt(i);
                if (char1 <= '\u007f') {
                    if (n == -254804647) {
                        throw new IllegalStateException();
                    }
                    ++n2;
                }
                else if (char1 <= '\u07ff') {
                    n2 += 2;
                }
                else {
                    n2 += 3;
                }
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gq.af(" + ')');
        }
    }
}
