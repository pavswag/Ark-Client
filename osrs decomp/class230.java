// 
// Decompiled by Procyon v0.5.36
// 

public class class230
{
    public static final String af = "version.dat";
    static final int be = 4;
    static Archive archive14;
    static int field2130;
    
    class230() throws Throwable {
        throw new Error();
    }
    
    static final float ao(final int n) {
        final float n2 = 10075.0f - n;
        return (n2 * 1.0075567f - 75.56675f) / n2;
    }
    
    static final int at(final int n, final int n2, final int n3, final int n4) {
        return n4 * n + n3 * n2 >> 16;
    }
    
    public static int be(final UserComparator10 userComparator10, final Object o, final Object o2) {
        if (userComparator10 == null) {
            userComparator10.compare(o, o);
        }
        return userComparator10.compareBuddy((Buddy)o, (Buddy)o2, 2061002589);
    }
    
    static final float ax(final int n) {
        final float n2 = 10075.0f - n;
        return (n2 * 1.0075567f - 75.56675f) / n2;
    }
    
    static final float ay(final int n) {
        final float n2 = 10075.0f - n;
        return (n2 * 1.0075567f - 75.56675f) / n2;
    }
    
    static final int al(final int n, final int n2, final int n3, final int n4) {
        return n * n3 - n2 * n4 >> 16;
    }
    
    static final int aa(final int n, final int n2, final int n3, final int n4) {
        return n4 * n + n3 * n2 >> 16;
    }
    
    static final float ai(final int n) {
        final float n2 = 10075.0f - n;
        return (n2 * 1.0075567f - 75.56675f) / n2;
    }
    
    public static void la(final DemotingHashTable demotingHashTable, final Object o, final long n) {
        if (demotingHashTable == null) {
            demotingHashTable.ax(n);
            return;
        }
        DemotingHashTable.yu(demotingHashTable, o, n, 1);
    }
    
    static final int ab(final int n, final int n2, final int n3, final int n4) {
        return n2 * n4 + n * n3 >> 16;
    }
    
    static final int aq(final int n, final int n2, final int n3, final int n4) {
        return n2 * n4 + n * n3 >> 16;
    }
}
