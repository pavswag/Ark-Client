import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator1 implements Comparator
{
    final boolean reversed;
    static final int ab = 32;
    static final int ax = 1;
    public static final String ko = "Please ensure date follows the format";
    
    public UserComparator1(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tw.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return tb(this, (User)o, (User)o2, 412667408);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tw.compare(" + ')');
        }
    }
    
    public static int tb(final UserComparator1 userComparator1, final User user, final User user2, final int n) {
        if (userComparator1 == null) {
            return userComparator1.compare_bridged(user, user, n);
        }
        try {
            int n2;
            if (userComparator1.reversed) {
                if (n == -1623027882) {
                    throw new IllegalStateException();
                }
                n2 = user.compareTo_user(user2, 1925965260);
            }
            else {
                n2 = user2.compareTo_user(user, 1823223921);
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tw.af(" + ')');
        }
    }
    
    public static boolean ks(final UserComparator1 userComparator1, final Object obj) {
        if (userComparator1 == null) {
            userComparator1.gq(obj);
        }
        return userComparator1.equals(obj);
    }
    
    public static int tm(final UserComparator1 userComparator1, final User user, final User user2) {
        if (userComparator1 == null) {
            return userComparator1.an(user, user);
        }
        return userComparator1.reversed ? user.compareTo_user(user2, 1001280788) : user2.compareTo_user(user, 1558179708);
    }
    
    int aw(final User user, final User user2) {
        return this.reversed ? user.compareTo_user(user2, 1469576656) : user2.compareTo_user(user, 1277813108);
    }
    
    int an(final User user, final User user2) {
        return this.reversed ? user.compareTo_user(user2, 1001280788) : user2.compareTo_user(user, 1558179708);
    }
    
    public int au(final Object o, final Object o2) {
        return tb(this, (User)o, (User)o2, 2089319386);
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    public static int kt(final UserComparator1 userComparator1, final User user, final User user2) {
        return userComparator1.reversed ? user.compareTo_user(user2, 1858152342) : user2.compareTo_user(user, 1108761004);
    }
    
    int compare_bridged(final User user, final User user2, final int n) {
        try {
            int n2;
            if (this.reversed) {
                if (n == -1623027882) {
                    throw new IllegalStateException();
                }
                n2 = user.compareTo_user(user2, 1925965260);
            }
            else {
                n2 = user2.compareTo_user(user, 1823223921);
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tw.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return tb(this, (User)o, (User)o2, 1610761189);
    }
    
    public int aq(final Object o, final Object o2) {
        return tb(this, (User)o, (User)o2, -1210298482);
    }
    
    public boolean gm(final Object obj) {
        return super.equals(obj);
    }
    
    public boolean gq(final Object obj) {
        return super.equals(obj);
    }
}
