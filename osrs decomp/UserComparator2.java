import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator2 implements Comparator
{
    final boolean reversed;
    
    public UserComparator2(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ty.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compare_bridged((User)o, (User)o2, 2140059241);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ty.compare(" + ')');
        }
    }
    
    int aw(final User user, final User user2) {
        return this.reversed ? user.getUsername(473993579).compareToTyped(user2.getUsername(473993579), (byte)45) : user2.getUsername(473993579).compareToTyped(user.getUsername(473993579), (byte)63);
    }
    
    public int al(final Object o, final Object o2) {
        return this.compare_bridged((User)o, (User)o2, 741901522);
    }
    
    int an(final User user, final User user2) {
        return this.reversed ? user.getUsername(473993579).compareToTyped(user2.getUsername(473993579), (byte)86) : user2.getUsername(473993579).compareToTyped(user.getUsername(473993579), (byte)75);
    }
    
    public boolean gk(final Object obj) {
        return super.equals(obj);
    }
    
    public int au(final Object o, final Object o2) {
        return this.compare_bridged((User)o, (User)o2, 2002160278);
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    int compare_bridged(final User user, final User user2, final int n) {
        try {
            int n2;
            if (this.reversed) {
                if (n == 680027429) {
                    throw new IllegalStateException();
                }
                n2 = user.getUsername(473993579).compareToTyped(user2.getUsername(473993579), (byte)60);
            }
            else {
                n2 = user2.getUsername(473993579).compareToTyped(user.getUsername(473993579), (byte)83);
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ty.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return this.compare_bridged((User)o, (User)o2, 1221010173);
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compare_bridged((User)o, (User)o2, 1678018675);
    }
    
    public static boolean ij(final UserComparator2 userComparator2, final Object obj) {
        if (userComparator2 == null) {
            userComparator2.aq(obj, obj);
        }
        return userComparator2.equals(obj);
    }
    
    public boolean gq(final Object obj) {
        return super.equals(obj);
    }
}
