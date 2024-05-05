import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

final class GrandExchangeOfferAgeComparator implements Comparator
{
    static final int ac = 16384;
    static final int wl = -2;
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "np.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)76);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "np.compare(" + ')');
        }
    }
    
    public static boolean sl(final GrandExchangeOfferAgeComparator grandExchangeOfferAgeComparator, final Object obj) {
        if (grandExchangeOfferAgeComparator == null) {
            grandExchangeOfferAgeComparator.compare(obj, obj);
        }
        return grandExchangeOfferAgeComparator.equals(obj);
    }
    
    int aw(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return (grandExchangeEvent.age * -2107275097961185091L < -2107275097961185091L * grandExchangeEvent2.age) ? -1 : (-2107275097961185091L * grandExchangeEvent.age != -2107275097961185091L * grandExchangeEvent2.age);
    }
    
    public int al(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)50);
    }
    
    public static boolean et(final GrandExchangeOfferAgeComparator grandExchangeOfferAgeComparator, final Object obj) {
        if (grandExchangeOfferAgeComparator == null) {
            return grandExchangeOfferAgeComparator.equals(obj);
        }
        return grandExchangeOfferAgeComparator.equals(obj);
    }
    
    int an(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return (grandExchangeEvent.age * -2107275097961185091L < -2107275097961185091L * grandExchangeEvent2.age) ? -1 : ((-2107275097961185091L * grandExchangeEvent.age == -2107275097961185091L * grandExchangeEvent2.age) ? 0 : 1);
    }
    
    int ac(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return (grandExchangeEvent.age * -2107275097961185091L < -2107275097961185091L * grandExchangeEvent2.age) ? -1 : (-2107275097961185091L * grandExchangeEvent.age != -2107275097961185091L * grandExchangeEvent2.age);
    }
    
    public int au(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)50);
    }
    
    int compare_bridged(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2, final byte b) {
        try {
            int n;
            if (grandExchangeEvent.age * -2107275097961185091L < -2107275097961185091L * grandExchangeEvent2.age) {
                if (b <= 4) {
                    throw new IllegalStateException();
                }
                n = -1;
            }
            else {
                n = ((-2107275097961185091L * grandExchangeEvent.age != -2107275097961185091L * grandExchangeEvent2.age) ? 1 : 0);
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "np.af(" + ')');
        }
    }
    
    public boolean gm(final Object obj) {
        return super.equals(obj);
    }
    
    public boolean gq(final Object obj) {
        return super.equals(obj);
    }
    
    public static NodeDeque getScriptEvents(final byte b) {
        try {
            return Client.scriptEvents;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "np.jk(" + ')');
        }
    }
    
    public static int ug(final GrandExchangeOfferNameComparator grandExchangeOfferNameComparator, final Object o, final Object o2) {
        if (grandExchangeOfferNameComparator == null) {
            grandExchangeOfferNameComparator.equals(o);
        }
        return GrandExchangeOfferNameComparator.ct(grandExchangeOfferNameComparator, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -632246044);
    }
}
