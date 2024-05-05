// 
// Decompiled by Procyon v0.5.36
// 

public class class393
{
    static final class393 field3680;
    static final class393 field3681;
    final String field3682;
    
    class393(final String field3682) {
        this.field3682 = field3682;
    }
    
    static {
        field3681 = new class393("Basic");
        field3680 = new class393("Bearer");
    }
    
    String an() {
        return this.field3682;
    }
    
    public static void bx(final ItemComposition itemComposition, final ItemComposition itemComposition2, final ItemComposition itemComposition3) {
        if (itemComposition == null) {
            itemComposition.bz(itemComposition, itemComposition);
            return;
        }
        itemComposition.model = itemComposition2.model * 1;
        itemComposition.zoom2d = 1 * itemComposition2.zoom2d;
        itemComposition.xan2d = itemComposition2.xan2d * 1;
        itemComposition.yan2d = itemComposition2.yan2d * 1;
        itemComposition.zan2d = itemComposition2.zan2d * 1;
        itemComposition.offsetX2d = itemComposition2.offsetX2d * 1;
        itemComposition.offsetY2d = itemComposition2.offsetY2d * 1;
        itemComposition.recolorFrom = itemComposition2.recolorFrom;
        itemComposition.recolorTo = itemComposition2.recolorTo;
        itemComposition.retextureFrom = itemComposition2.retextureFrom;
        itemComposition.retextureTo = itemComposition2.retextureTo;
        itemComposition.isStackable = itemComposition2.isStackable * 1;
        itemComposition.name = itemComposition3.name;
        itemComposition.price = 0;
        itemComposition.isMembersOnly = false;
        itemComposition.isTradable = false;
    }
    
    static boolean isComponentHidden(final Widget widget, final byte b) {
        try {
            return widget.spriteTiling;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pm.ny(" + ')');
        }
    }
    
    String method2102(final byte b) {
        try {
            return this.field3682;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pm.af(" + ')');
        }
    }
    
    public static void bf(final Varcs varcs, final int i, final String s) {
        varcs.map.put(i, s);
    }
}
