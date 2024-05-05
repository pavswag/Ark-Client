import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

final class GrandExchangeOfferUnitPriceComparator implements Comparator
{
    static final float fe = 200.0f;
    static Archive archive18;
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nt.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return je(this, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -411750205);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nt.compare(" + ')');
        }
    }
    
    public static void br(final class314 class314) {
        if (class314 == null) {
            class314.fo();
        }
        class314.field2845 = false;
    }
    
    int aw(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return (grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707 < grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707) ? -1 : ((grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707 == grandExchangeEvent.grandExchangeOffer.unitPrice * -1874545678) ? 0 : 1);
    }
    
    public static int al(final GrandExchangeOfferUnitPriceComparator grandExchangeOfferUnitPriceComparator, final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        if (grandExchangeOfferUnitPriceComparator == null) {
            return grandExchangeOfferUnitPriceComparator.an(grandExchangeEvent, grandExchangeEvent);
        }
        return (grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707 < grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707) ? -1 : ((grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707 == grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707) ? 0 : 1);
    }
    
    public int al(final Object o, final Object o2) {
        return je(this, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -411750205);
    }
    
    int an(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return (grandExchangeEvent.grandExchangeOffer.unitPrice * 261540490 < grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707) ? -1 : ((grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707 == grandExchangeEvent.grandExchangeOffer.unitPrice * -894718739) ? 0 : 1);
    }
    
    public static boolean ac(final GrandExchangeOfferUnitPriceComparator grandExchangeOfferUnitPriceComparator, final Object obj) {
        if (grandExchangeOfferUnitPriceComparator == null) {
            grandExchangeOfferUnitPriceComparator.au(obj, obj);
        }
        return grandExchangeOfferUnitPriceComparator.equals(obj);
    }
    
    public static int je(final GrandExchangeOfferUnitPriceComparator grandExchangeOfferUnitPriceComparator, final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2, final int n) {
        if (grandExchangeOfferUnitPriceComparator == null) {
            return grandExchangeOfferUnitPriceComparator.compare_bridged(grandExchangeEvent, grandExchangeEvent, n);
        }
        try {
            int n2;
            if (grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707 < grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707) {
                n2 = -1;
            }
            else if (grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707 == grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707) {
                if (n != -411750205) {
                    throw new IllegalStateException();
                }
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nt.af(" + ')');
        }
    }
    
    public boolean gk(final Object obj) {
        return super.equals(obj);
    }
    
    public int au(final Object o, final Object o2) {
        return je(this, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -411750205);
    }
    
    int aa(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return (grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707 < grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707) ? -1 : ((grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707 == grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707) ? 0 : 1);
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    public static int oe(final GrandExchangeOfferUnitPriceComparator grandExchangeOfferUnitPriceComparator, final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        if (grandExchangeOfferUnitPriceComparator == null) {
            grandExchangeOfferUnitPriceComparator.aa(grandExchangeEvent, grandExchangeEvent);
        }
        return (grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707 < grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707) ? -1 : ((grandExchangeEvent2.grandExchangeOffer.unitPrice * -1994102707 == grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707) ? 0 : 1);
    }
    
    int compare_bridged(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2, final int n) {
        try {
            int n2;
            if (grandExchangeEvent.grandExchangeOffer.totalQuantity * -1994102707 < grandExchangeEvent2.grandExchangeOffer.totalQuantity * -1994102707) {
                n2 = -1;
            }
            else if (grandExchangeEvent2.grandExchangeOffer.id * -1994102707 == grandExchangeEvent.grandExchangeOffer.unitPrice * -1994102707) {
                if (n != -411750205) {
                    throw new IllegalStateException();
                }
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nt.af(" + ')');
        }
    }
    
    public static int compare_bridged(final int n, final int n2) {
        try {
            if (0 != n) {
                if (n2 == -2028669797) {
                    throw new IllegalStateException();
                }
                if (n != 1) {
                    return -1;
                }
                if (n2 == -2028669797) {
                    throw new IllegalStateException();
                }
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nt.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return je(this, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -411750205);
    }
    
    public int aq(final Object o, final Object o2) {
        return je(this, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -411750205);
    }
    
    public boolean gm(final Object obj) {
        return super.equals(obj);
    }
}
