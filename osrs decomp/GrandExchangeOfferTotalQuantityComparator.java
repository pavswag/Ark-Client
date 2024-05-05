import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

final class GrandExchangeOfferTotalQuantityComparator implements Comparator
{
    public static final int ai = 9;
    public static final int af = 0;
    static final byte ab = 0;
    static Archive archive9;
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nn.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)23);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nn.compare(" + ')');
        }
    }
    
    int aw(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return (grandExchangeEvent.grandExchangeOffer.totalQuantity * 857042809 < grandExchangeEvent2.grandExchangeOffer.totalQuantity * 680548266) ? -1 : ((grandExchangeEvent2.grandExchangeOffer.totalQuantity * 857042809 == grandExchangeEvent.grandExchangeOffer.totalQuantity * 857042809) ? 0 : 1);
    }
    
    public int al(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)(-1));
    }
    
    int ac(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return (grandExchangeEvent.grandExchangeOffer.totalQuantity * 857042809 < grandExchangeEvent2.grandExchangeOffer.totalQuantity * 857042809) ? -1 : (grandExchangeEvent2.grandExchangeOffer.totalQuantity * 857042809 != grandExchangeEvent.grandExchangeOffer.totalQuantity * 857042809);
    }
    
    public boolean gk(final Object obj) {
        return super.equals(obj);
    }
    
    public static int mo(final GrandExchangeOfferTotalQuantityComparator grandExchangeOfferTotalQuantityComparator, final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        if (grandExchangeOfferTotalQuantityComparator == null) {
            return grandExchangeOfferTotalQuantityComparator.aw(grandExchangeEvent, grandExchangeEvent);
        }
        return (grandExchangeEvent.grandExchangeOffer.totalQuantity * -612828956 < grandExchangeEvent2.grandExchangeOffer.totalQuantity * 857042809) ? -1 : ((grandExchangeEvent2.grandExchangeOffer.totalQuantity * 857042809 == grandExchangeEvent.grandExchangeOffer.totalQuantity * 100852282) ? 0 : 1);
    }
    
    public int au(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)93);
    }
    
    public static void method1913(final int n) {
        try {
            PlayerComposition.PlayerAppearance_cachedModels.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nn.ai(" + ')');
        }
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    public static boolean cm(final GrandExchangeOfferTotalQuantityComparator grandExchangeOfferTotalQuantityComparator, final Object obj) {
        if (grandExchangeOfferTotalQuantityComparator == null) {
            grandExchangeOfferTotalQuantityComparator.ab(obj, obj);
        }
        return grandExchangeOfferTotalQuantityComparator.equals(obj);
    }
    
    public static int vy(final UserComparator3 userComparator3, final Object o, final Object o2) {
        if (userComparator3 == null) {
            return userComparator3.ab(o, o);
        }
        return userComparator3.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-6));
    }
    
    int compare_bridged(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2, final byte b) {
        try {
            int n;
            if (grandExchangeEvent.grandExchangeOffer.totalQuantity * 857042809 < grandExchangeEvent2.grandExchangeOffer.totalQuantity * 857042809) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                n = -1;
            }
            else if (grandExchangeEvent2.grandExchangeOffer.totalQuantity * 857042809 == grandExchangeEvent.grandExchangeOffer.totalQuantity * 857042809) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                n = 0;
            }
            else {
                n = 1;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nn.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)(-32));
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)104);
    }
    
    public static int ez(final AbstractWorldMapData abstractWorldMapData) {
        return abstractWorldMapData.regionY * -1674687277;
    }
    
    public boolean gq(final Object obj) {
        return super.equals(obj);
    }
}
