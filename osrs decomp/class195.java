import net.runelite.api.events.PostStructComposition;

// 
// Decompiled by Procyon v0.5.36
// 

public class class195 extends DualNode
{
    static final int aa = 32;
    static Archive field1645;
    
    class195() throws Throwable {
        throw new Error();
    }
    
    static {
        new EvictingDualNodeHashTable(64);
    }
    
    public static StructComposition StructDefinition_getStructDefinition(final int mg, final int n) {
        final int n2 = -680528429;
        StructComposition structComposition2;
        try {
            final StructComposition structComposition = (StructComposition)StructComposition.StructDefinition_cached.wr(mg);
            if (null != structComposition) {
                if (n2 >= -132716496) {
                    throw new IllegalStateException();
                }
                structComposition2 = structComposition;
            }
            else {
                final byte[] takeFile = StructComposition.StructDefinition_archive.takeFile(34, mg, (byte)(-76));
                final StructComposition structComposition3 = new StructComposition();
                if (null != takeFile) {
                    if (n2 >= -132716496) {
                        throw new IllegalStateException();
                    }
                    StructComposition.gi(structComposition3, new Buffer(takeFile), -1875219485);
                }
                StructComposition.iw(structComposition3, -1436129588);
                StructComposition.StructDefinition_cached.put(structComposition3, mg);
                structComposition2 = structComposition3;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hc.an(" + ')');
        }
        final net.runelite.api.StructComposition structComposition4 = (net.runelite.api.StructComposition)structComposition2;
        if (((StructComposition)structComposition4).getId() == -1) {
            ((StructComposition)structComposition4).mg = mg;
            final PostStructComposition postStructComposition = new PostStructComposition();
            postStructComposition.setStructComposition(structComposition4);
            ScriptFrame.client.getCallbacks().post((Object)postStructComposition);
        }
        return (StructComposition)structComposition4;
    }
    
    public static int method1052(final int n, final int n2) {
        try {
            return n >> 11 & 0x3F;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hc.af(" + ')');
        }
    }
    
    public static void method1052(final AbstractArchive paramDefinition_archive, final int n) {
        try {
            ParamComposition.ParamDefinition_archive = paramDefinition_archive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hc.af(" + ')');
        }
    }
    
    static final boolean method1053(final int n, int n2, final int n3) {
        try {
            final ObjectComposition vmethod3248 = class144.vmethod3248(n, (short)27574);
            if (11 == n2) {
                if (n3 <= 669295600) {
                    throw new IllegalStateException();
                }
                n2 = 10;
            }
            if (n2 >= 5) {
                if (n3 <= 669295600) {
                    throw new IllegalStateException();
                }
                if (n2 <= 8) {
                    if (n3 <= 669295600) {
                        throw new IllegalStateException();
                    }
                    n2 = 4;
                }
            }
            return ObjectComposition.uh(vmethod3248, n2, -1491101758);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hc.aj(" + ')');
        }
    }
}
