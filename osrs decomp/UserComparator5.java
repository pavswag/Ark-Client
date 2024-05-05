// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator5 extends AbstractUserComparator
{
    static FriendsChat friendsChat;
    final boolean reversed;
    
    public UserComparator5(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compareBuddy((Buddy)o, (Buddy)o2, 318450924);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "es.compare(" + ')');
        }
    }
    
    public static int pv(final UserComparator5 userComparator5, final Object o, final Object o2) {
        if (userComparator5 == null) {
            userComparator5.ab(o, o);
        }
        return userComparator5.compareBuddy((Buddy)o, (Buddy)o2, 318450924);
    }
    
    public static int rt(final UserComparator5 userComparator5, final Buddy buddy, final Buddy buddy2) {
        if (userComparator5 == null) {
            return userComparator5.aw(buddy, buddy);
        }
        if (0 != 177258591 * buddy.world) {
            if (buddy2.world * 177258591 == 0) {
                return userComparator5.reversed ? -1 : 1;
            }
        }
        else if (177258591 * buddy2.world != 0) {
            return userComparator5.reversed ? 1 : -1;
        }
        return userComparator5.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    int aw(final Buddy buddy, final Buddy buddy2) {
        if (0 != 177258591 * buddy.world) {
            if (buddy2.world * 177258591 == 0) {
                return this.reversed ? -1 : 1;
            }
        }
        else if (177258591 * buddy2.world != 0) {
            return this.reversed ? 1 : -1;
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    static void method696(final Archive archive, final String s, final int n) {
        try {
            final ArchiveLoader e = new ArchiveLoader(archive, s);
            Client.archiveLoaders.add(e);
            Client.field397 += 1472564749 * e.groupCount;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "es.hx(" + ')');
        }
    }
    
    static void addGameMessage(final int n, final String s, final String s2, final int n2) {
        try {
            class136.addChatMessage(n, s, s2, null, (short)(-677));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "es.an(" + ')');
        }
    }
    
    int ac(final Buddy buddy, final Buddy buddy2) {
        if (0 != 1506008730 * buddy.world) {
            if (buddy2.world * 177258591 == 0) {
                return this.reversed ? -1 : 1;
            }
        }
        else if (-773060063 * buddy2.world != 0) {
            return this.reversed ? 1 : -1;
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    int compareBuddy(final Buddy buddy, final Buddy buddy2, final int n) {
        try {
            if (0 != 177258591 * buddy.world) {
                if (n != 318450924) {
                    throw new IllegalStateException();
                }
                if (buddy2.world * 177258591 == 0) {
                    if (n != 318450924) {
                        throw new IllegalStateException();
                    }
                    int n2;
                    if (this.reversed) {
                        if (n != 318450924) {
                            throw new IllegalStateException();
                        }
                        n2 = -1;
                    }
                    else {
                        n2 = 1;
                    }
                    return n2;
                }
            }
            else if (177258591 * buddy2.world != 0) {
                if (n != 318450924) {
                    throw new IllegalStateException();
                }
                int n3;
                if (this.reversed) {
                    if (n != 318450924) {
                        throw new IllegalStateException();
                    }
                    n3 = 1;
                }
                else {
                    n3 = -1;
                }
                return n3;
            }
            return this.ao((User)buddy, (User)buddy2, 641920470);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "es.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, 318450924);
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, 318450924);
    }
    
    public static int nq(final UserComparator5 userComparator5, final Object o, final Object o2) {
        if (userComparator5 == null) {
            return userComparator5.compare(o, o);
        }
        return userComparator5.compareBuddy((Buddy)o, (Buddy)o2, 318450924);
    }
}
