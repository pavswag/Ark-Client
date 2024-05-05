import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

final class GrandExchangeOfferWorldComparator implements Comparator
{
    static final int bt = 4;
    public static final int ax = 8;
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ny.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, -1139417462);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ny.compare(" + ')');
        }
    }
    
    public static void os(final DualNode dualNode) {
        if (dualNode == null) {
            dualNode.fh();
        }
        if (dualNode.previousDual == null) {
            return;
        }
        dualNode.previousDual.nextDual = dualNode.nextDual;
        dualNode.nextDual.previousDual = dualNode.previousDual;
        dualNode.nextDual = null;
        dualNode.previousDual = null;
    }
    
    public int al(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, -471985110);
    }
    
    int an(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return (grandExchangeEvent.world * -39392873 < grandExchangeEvent2.world * -1928230122) ? -1 : ((grandExchangeEvent2.world * -814054554 == -1303186490 * grandExchangeEvent.world) ? 0 : 1);
    }
    
    public boolean gk(final Object obj) {
        return super.equals(obj);
    }
    
    public static boolean nx(final GrandExchangeOfferWorldComparator grandExchangeOfferWorldComparator, final Object obj) {
        if (grandExchangeOfferWorldComparator == null) {
            grandExchangeOfferWorldComparator.au(obj, obj);
        }
        return grandExchangeOfferWorldComparator.equals(obj);
    }
    
    public int au(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, 415922831);
    }
    
    public static boolean hy(final GrandExchangeOfferWorldComparator grandExchangeOfferWorldComparator, final Object obj) {
        if (grandExchangeOfferWorldComparator == null) {
            grandExchangeOfferWorldComparator.aq(obj, obj);
        }
        return grandExchangeOfferWorldComparator.equals(obj);
    }
    
    int compare_bridged(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2, final int n) {
        try {
            int n2;
            if (grandExchangeEvent.world * -39392873 < grandExchangeEvent2.world * -39392873) {
                if (n >= 1170972792) {
                    throw new IllegalStateException();
                }
                n2 = -1;
            }
            else if (grandExchangeEvent2.world * -39392873 == -39392873 * grandExchangeEvent.world) {
                if (n >= 1170972792) {
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
            throw HealthBar.get(ex, "ny.af(" + ')');
        }
    }
    
    public static int ab(final GrandExchangeOfferWorldComparator grandExchangeOfferWorldComparator, final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        if (grandExchangeOfferWorldComparator == null) {
            grandExchangeOfferWorldComparator.an(grandExchangeEvent, grandExchangeEvent);
        }
        return (grandExchangeEvent.world * -39392873 < grandExchangeEvent2.world * -1928230122) ? -1 : ((grandExchangeEvent2.world * -814054554 == -1303186490 * grandExchangeEvent.world) ? 0 : 1);
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, -404491769);
    }
    
    public boolean gm(final Object obj) {
        return super.equals(obj);
    }
}
