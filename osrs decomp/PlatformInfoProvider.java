// 
// Decompiled by Procyon v0.5.36
// 

public interface PlatformInfoProvider
{
    PlatformInfo au();
    
    default void xc(final TileItem tileItem, final int n) {
        if (tileItem == null) {
            tileItem.al();
        }
        tileItem.field1078 = 1318728709 * n;
    }
    
    PlatformInfo get(final int p0);
    
    PlatformInfo ab();
}
