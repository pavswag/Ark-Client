import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

final class GrandExchangeOfferNameComparator implements Comparator
{
    static Thread ArchiveDiskActionHandler_thread;
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "na.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return ct(this, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -1449096527);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "na.compare(" + ')');
        }
    }
    
    public static int ct(final GrandExchangeOfferNameComparator grandExchangeOfferNameComparator, final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2, final int n) {
        if (grandExchangeOfferNameComparator == null) {
            grandExchangeOfferNameComparator.compare_bridged(grandExchangeEvent, grandExchangeEvent, n);
        }
        try {
            return GrandExchangeEvent.yc(grandExchangeEvent, 513475535).compareTo(GrandExchangeEvent.yc(grandExchangeEvent2, 126031040));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "na.af(" + ')');
        }
    }
    
    public static Task cc(final TaskHandler taskHandler, final String s, final int n) {
        if (taskHandler == null) {
            taskHandler.ay(s, n);
        }
        return taskHandler.newTask(1, n, 0, s, -267329209);
    }
    
    int aw(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return GrandExchangeEvent.yc(grandExchangeEvent, -1849329042).compareTo(GrandExchangeEvent.yc(grandExchangeEvent2, 950351438));
    }
    
    int an(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return GrandExchangeEvent.yc(grandExchangeEvent, -1600787160).compareTo(GrandExchangeEvent.yc(grandExchangeEvent2, -1801739120));
    }
    
    int ac(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        return GrandExchangeEvent.yc(grandExchangeEvent, -589694734).compareTo(GrandExchangeEvent.yc(grandExchangeEvent2, -2128866690));
    }
    
    public boolean gk(final Object obj) {
        return super.equals(obj);
    }
    
    public int au(final Object o, final Object o2) {
        return ct(this, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -1131379950);
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    static int getWindowedMode(final int n) {
        try {
            int n2;
            if (Client.isResizable) {
                if (n <= 219462031) {
                    throw new IllegalStateException();
                }
                n2 = 2;
            }
            else {
                n2 = 1;
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "na.iv(" + ')');
        }
    }
    
    int compare_bridged(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2, final int n) {
        try {
            return GrandExchangeEvent.yc(grandExchangeEvent, 513475535).compareTo(GrandExchangeEvent.yc(grandExchangeEvent2, 126031040));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "na.af(" + ')');
        }
    }
    
    public int aq(final Object o, final Object o2) {
        return ct(this, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -1145787495);
    }
    
    public boolean gm(final Object obj) {
        return super.equals(obj);
    }
    
    public static int wq(final GrandExchangeOfferNameComparator grandExchangeOfferNameComparator, final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        if (grandExchangeOfferNameComparator == null) {
            return grandExchangeOfferNameComparator.aw(grandExchangeEvent, grandExchangeEvent);
        }
        return GrandExchangeEvent.yc(grandExchangeEvent, 209914494).compareTo(GrandExchangeEvent.yc(grandExchangeEvent2, -623755775));
    }
    
    public static boolean vz(final GrandExchangeOfferNameComparator grandExchangeOfferNameComparator, final Object obj) {
        if (grandExchangeOfferNameComparator == null) {
            return grandExchangeOfferNameComparator.gk(obj);
        }
        return grandExchangeOfferNameComparator.equals(obj);
    }
}
