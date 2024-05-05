// 
// Decompiled by Procyon v0.5.36
// 

public class BuddyRankComparator extends AbstractUserComparator
{
    static final int tm = 50;
    static final int fs = 22;
    static final int aw = 320;
    public static final int am = 17;
    final boolean reversed;
    static final int bx = 5;
    
    public BuddyRankComparator(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-49));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "er.compare(" + ')');
        }
    }
    
    public static String method711(final String s, final byte b) {
        try {
            final int length = s.length();
            final char[] value = new char[length];
            int n = 2;
            for (int i = 0; i < length; ++i) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                char c = s.charAt(i);
                Label_0119: {
                    if (n == 0) {
                        if (b >= 1) {
                            throw new IllegalStateException();
                        }
                        c = Character.toLowerCase(c);
                    }
                    else {
                        if (n != 2) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            if (!Character.isUpperCase(c)) {
                                break Label_0119;
                            }
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                        }
                        c = WorldMapSectionType.method1507(c, -1200984421);
                    }
                }
                Label_0195: {
                    if (Character.isLetter(c)) {
                        if (b >= 1) {
                            throw new IllegalStateException();
                        }
                        n = 0;
                    }
                    else {
                        if (c != '.') {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            if ('?' != c) {
                                if (b >= 1) {
                                    throw new IllegalStateException();
                                }
                                if (c != '!') {
                                    if (!Character.isSpaceChar(c)) {
                                        n = 1;
                                        break Label_0195;
                                    }
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    if (n == 2) {
                                        break Label_0195;
                                    }
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    n = 1;
                                    break Label_0195;
                                }
                            }
                        }
                        n = 2;
                    }
                }
                value[i] = c;
            }
            return new String(value);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "er.ao(" + ')');
        }
    }
    
    public static IterableNodeHashTable tc(final Actor actor) {
        return actor.graphics;
    }
    
    public static int ha(final BuddyRankComparator buddyRankComparator, final Object o, final Object o2) {
        if (buddyRankComparator == null) {
            buddyRankComparator.aq(o, o);
        }
        return buddyRankComparator.compareBuddy((Buddy)o, (Buddy)o2, (byte)57);
    }
    
    int aw(final Buddy buddy, final Buddy buddy2) {
        if (buddy.rank * 1922414955 != 1922414955 * buddy2.rank) {
            return this.reversed ? (buddy.rank * 1922414955 - 1922414955 * buddy2.rank) : (buddy2.rank * 1922414955 - buddy.rank * 1922414955);
        }
        return this.method711((User)buddy, (User)buddy2, 641920470);
    }
    
    public static String pm(final ClientPreferences clientPreferences) {
        return clientPreferences.rememberedUsername;
    }
    
    public int al(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)17);
    }
    
    int an(final Buddy buddy, final Buddy buddy2) {
        if (buddy.rank * 1922414955 != 1922414955 * buddy2.rank) {
            return this.reversed ? (buddy.rank * 1922414955 - 1922414955 * buddy2.rank) : (buddy2.rank * 1922414955 - buddy.rank * 1922414955);
        }
        return this.method711((User)buddy, (User)buddy2, 641920470);
    }
    
    int ac(final Buddy buddy, final Buddy buddy2) {
        if (buddy.rank * 1922414955 != 1922414955 * buddy2.rank) {
            return this.reversed ? (buddy.rank * 1922414955 - 1922414955 * buddy2.rank) : (buddy2.rank * 1922414955 - buddy.rank * 1922414955);
        }
        return this.method711((User)buddy, (User)buddy2, 641920470);
    }
    
    static int method707(final int n, final int n2) {
        try {
            final Message message = (Message)Messages.Messages_hashTable.aa(n);
            if (message == null) {
                if (n2 == -783463561) {
                    throw new IllegalStateException();
                }
                return -1;
            }
            else {
                if (Messages.Messages_queue.sentinel != message.ez) {
                    return -1117255211 * ((Message)message.ez).type;
                }
                if (n2 == -783463561) {
                    throw new IllegalStateException();
                }
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "er.aa(" + ')');
        }
    }
    
    static long compareBuddy(final int n, final int n2, final int n3, final int n4) {
        try {
            return n3 << 16 | n << 8 | n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "er.af(" + ')');
        }
    }
    
    public static void compareBuddy(final AbstractArchive spotAnimationDefinition_archive, final AbstractArchive spotAnimationDefinition_modelArchive, final int n) {
        try {
            SpotAnimationDefinition.SpotAnimationDefinition_archive = spotAnimationDefinition_archive;
            SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = spotAnimationDefinition_modelArchive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "er.af(" + ')');
        }
    }
    
    int compareBuddy(final Buddy buddy, final Buddy buddy2, final byte b) {
        try {
            if (buddy.rank * 1922414955 == 1922414955 * buddy2.rank) {
                return this.method711((User)buddy, (User)buddy2, 641920470);
            }
            if (b == 0) {
                throw new IllegalStateException();
            }
            int n;
            if (this.reversed) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                n = buddy.rank * 1922414955 - 1922414955 * buddy2.rank;
            }
            else {
                n = buddy2.rank * 1922414955 - buddy.rank * 1922414955;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "er.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-53));
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, (byte)(-112));
    }
    
    public static int method712(final int n, final int n2) {
        try {
            if (n > 0) {
                if (n2 != -1723997839) {
                    throw new IllegalStateException();
                }
                return 1;
            }
            else {
                if (n < 0) {
                    return -1;
                }
                return 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "er.ah(" + ')');
        }
    }
}
