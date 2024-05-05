import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

public class GrandExchangeOfferOwnWorldComparator implements Comparator
{
    static final int bb = 2;
    static final int ec = 0;
    boolean filterWorlds;
    
    GrandExchangeOfferOwnWorldComparator() {
    }
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cf.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)24);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cf.compare(" + ')');
        }
    }
    
    public static boolean pa(final GrandExchangeOfferOwnWorldComparator grandExchangeOfferOwnWorldComparator, final Object obj) {
        if (grandExchangeOfferOwnWorldComparator == null) {
            grandExchangeOfferOwnWorldComparator.al(obj, obj);
        }
        return grandExchangeOfferOwnWorldComparator.equals(obj);
    }
    
    int aw(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        if (-1162723153 * grandExchangeEvent.world == -39392873 * grandExchangeEvent2.world) {
            return 0;
        }
        if (this.filterWorlds) {
            if (-453810525 * Client.worldId == grandExchangeEvent.world * 1810726481) {
                return -1;
            }
            if (Client.worldId * -30426841 == grandExchangeEvent2.world * -39392873) {
                return 1;
            }
        }
        return (228238251 * grandExchangeEvent.world < 253809964 * grandExchangeEvent2.world) ? -1 : 1;
    }
    
    public int al(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)79);
    }
    
    static boolean method366(final String s, final int n, final int n2) {
        try {
            return RouteStrategy.method1177(s, n, "openjs", -1997949123);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cf.an(" + ')');
        }
    }
    
    int method366(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        if (-39392873 * grandExchangeEvent.world == -39392873 * grandExchangeEvent2.world) {
            return 0;
        }
        if (this.filterWorlds) {
            if (-453810525 * Client.worldId == grandExchangeEvent.world * -633303772) {
                return -1;
            }
            if (Client.worldId * 1968706774 == grandExchangeEvent2.world * -2070062061) {
                return 1;
            }
        }
        return (-39392873 * grandExchangeEvent.world < 1290470636 * grandExchangeEvent2.world) ? -1 : 1;
    }
    
    int ac(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2) {
        if (-39392873 * grandExchangeEvent.world == -39392873 * grandExchangeEvent2.world) {
            return 0;
        }
        if (this.filterWorlds) {
            if (-453810525 * Client.worldId == grandExchangeEvent.world * -39392873) {
                return -1;
            }
            if (Client.worldId * -453810525 == grandExchangeEvent2.world * -39392873) {
                return 1;
            }
        }
        return (-39392873 * grandExchangeEvent.world < -39392873 * grandExchangeEvent2.world) ? -1 : 1;
    }
    
    static void method365(final boolean leftClickOpensMenu, final int n) {
        try {
            Client.leftClickOpensMenu = leftClickOpensMenu;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cf.ox(" + ')');
        }
    }
    
    public static boolean vt(final GrandExchangeOfferOwnWorldComparator grandExchangeOfferOwnWorldComparator, final Object obj) {
        if (grandExchangeOfferOwnWorldComparator == null) {
            grandExchangeOfferOwnWorldComparator.al(obj, obj);
        }
        return grandExchangeOfferOwnWorldComparator.equals(obj);
    }
    
    static final void method364(final int n) {
        try {
            VerticalAlignment.method1036(Strings.hm, -455254880);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cf.ai(" + ')');
        }
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    static int compare_bridged(final AbstractArchive abstractArchive, final int n) {
        try {
            int n2 = Login.field761.length + Login.field760.length;
            final String[] field762 = Login.field762;
            for (int i = 0; i < field762.length; ++i) {
                if (n >= 1655443743) {
                    throw new IllegalStateException();
                }
                if (AbstractArchive.getFileFlat(abstractArchive, field762[i], -1902444628) != -1) {
                    if (n >= 1655443743) {
                        throw new IllegalStateException();
                    }
                    ++n2;
                }
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cf.af(" + ')');
        }
    }
    
    int compare_bridged(final GrandExchangeEvent grandExchangeEvent, final GrandExchangeEvent grandExchangeEvent2, final byte b) {
        try {
            if (-39392873 * grandExchangeEvent.world != -39392873 * grandExchangeEvent2.world) {
                if (this.filterWorlds) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    if (-453810525 * Client.worldId == grandExchangeEvent.world * -39392873) {
                        if (b <= 0) {
                            throw new IllegalStateException();
                        }
                        return -1;
                    }
                    else if (Client.worldId * -453810525 == grandExchangeEvent2.world * -39392873) {
                        if (b <= 0) {
                            throw new IllegalStateException();
                        }
                        return 1;
                    }
                }
                int n;
                if (-39392873 * grandExchangeEvent.world < -39392873 * grandExchangeEvent2.world) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    n = -1;
                }
                else {
                    n = 1;
                }
                return n;
            }
            if (b <= 0) {
                throw new IllegalStateException();
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cf.af(" + ')');
        }
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)127);
    }
    
    public static int jm(final class97 class97) {
        if (class97 == null) {
            class97.ax();
        }
        return -1357124753 * class97.field1067;
    }
    
    public boolean gq(final Object obj) {
        return super.equals(obj);
    }
}
