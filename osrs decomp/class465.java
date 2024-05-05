// 
// Decompiled by Procyon v0.5.36
// 

public interface class465 extends Iterable
{
    void at(final int p0, final Object p1);
    
    int aw(final int p0);
    
    void al(final int p0, final Object p1);
    
    void vmethod8143(final int p0, final Object p1, final int p2);
    
    int ac(final int p0);
    
    int au(final int p0);
    
    default boolean py(final class377 class377, final Object o) {
        return class377.field3606.containsKey(o);
    }
    
    int vmethod8144(final int p0, final byte p1);
    
    void ab(final int p0, final Object p1);
    
    void aq(final int p0, final Object p1);
    
    default int gr(final WorldMapArea worldMapArea) {
        return -1499270812 * worldMapArea.origin.y;
    }
}
