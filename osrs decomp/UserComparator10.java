// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator10 extends AbstractUserComparator
{
    final boolean reversed;
    static PlatformInfo platformInfo;
    static final int tv = 2;
    static final int am = 19;
    public static final int aq = 32;
    
    public UserComparator10(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compareBuddy((Buddy)o, (Buddy)o2, -430449272);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "en.compare(" + ')');
        }
    }
    
    public static int ua(final UserComparator10 userComparator10, final Object o, final Object o2) {
        if (userComparator10 == null) {
            userComparator10.compare(o, o);
        }
        return userComparator10.compareBuddy((Buddy)o, (Buddy)o2, 1707876368);
    }
    
    int aw(final Buddy buddy, final Buddy buddy2) {
        if (1912150627 * buddy.world == 534351448 * Client.worldId && 177258591 * buddy2.world == Client.worldId * -1615585009) {
            return this.reversed ? (1907692493 * buddy.int2 - 1907692493 * buddy2.int2) : (-1152119350 * buddy2.int2 - buddy.int2 * 1907692493);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    int an(final Buddy buddy, final Buddy buddy2) {
        if (177258591 * buddy.world == -453810525 * Client.worldId && 177258591 * buddy2.world == Client.worldId * -453810525) {
            return this.reversed ? (1907692493 * buddy.int2 - 1907692493 * buddy2.int2) : (1907692493 * buddy2.int2 - buddy.int2 * 1907692493);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    int compareBuddy(final Buddy buddy, final Buddy buddy2, final int n) {
        try {
            if (177258591 * buddy.world == -453810525 * Client.worldId) {
                if (n == -549033243) {
                    throw new IllegalStateException();
                }
                if (177258591 * buddy2.world == Client.worldId * -453810525) {
                    if (n == -549033243) {
                        throw new IllegalStateException();
                    }
                    int n2;
                    if (this.reversed) {
                        if (n == -549033243) {
                            throw new IllegalStateException();
                        }
                        n2 = 1907692493 * buddy.int2 - 1907692493 * buddy2.int2;
                    }
                    else {
                        n2 = 1907692493 * buddy2.int2 - buddy.int2 * 1907692493;
                    }
                    return n2;
                }
            }
            return this.ao((User)buddy, (User)buddy2, 641920470);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "en.af(" + ')');
        }
    }
    
    public static int zz(final UserComparator10 userComparator10, final Object o, final Object o2) {
        if (userComparator10 == null) {
            return userComparator10.compare(o, o);
        }
        return userComparator10.compareBuddy((Buddy)o, (Buddy)o2, -1474905162);
    }
}
