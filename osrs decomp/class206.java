import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.36
// 

public class class206 extends Node
{
    static final int ia = 14;
    static int[] BZip2Decompressor_block;
    public static final int af = 0;
    public int field1852;
    public int field1853;
    public Widget field1854;
    public static final int an = 1;
    static final int bt = 12;
    public int field1855;
    
    public class206(final int n, final int n2, final int n3, final Widget field1854) {
        this.field1853 = n * 104718613;
        this.field1855 = n2 * -1689391215;
        this.field1852 = -1488158589 * n3;
        this.field1854 = field1854;
    }
    
    static class482 method1147(final int n, final int n2) {
        try {
            class482 class482 = (class482)Client.Widget_cachedModels.wr(n);
            if (class482 == null) {
                if (n2 != 1127097285) {
                    throw new IllegalStateException();
                }
                class482 = new class482(PcmPlayer.field211, class373.method1992(n, (byte)93), BufferedSink.write(n, (byte)48));
                Client.Widget_cachedModels.put(class482, n);
            }
            return class482;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hf.ov(" + ')');
        }
    }
    
    public static void dc(final Buffer buffer, final int n) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * 1990024753 - 1] = (byte)(0 - n);
    }
    
    public static HashMap wk(final WorldMapManager worldMapManager) {
        if (worldMapManager == null) {
            worldMapManager.isLoaded();
        }
        worldMapManager.buildIcons0((byte)(-29));
        return worldMapManager.icons;
    }
}
