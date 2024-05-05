// 
// Decompiled by Procyon v0.5.36
// 

public class Username implements Comparable
{
    public static final int ab = 8;
    String cleanName;
    String name;
    static final int ac = 2;
    
    public Username(final String name, final LoginType loginType) {
        this.name = name;
        this.cleanName = class30.method132(name, loginType, (byte)(-85));
    }
    
    public Username(final String name) {
        this.name = name;
        this.cleanName = class30.method132(name, LoginType.oldscape, (byte)(-73));
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (!(o instanceof Username)) {
                return false;
            }
            final Username username = (Username)o;
            if (null == this.cleanName) {
                return null == username.cleanName;
            }
            return username.cleanName != null && this.hashCode() == username.hashCode() && this.cleanName.equals(username.cleanName);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tm.equals(" + ')');
        }
    }
    
    @Override
    public String toString() {
        try {
            return this.getName(-710264960);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tm.toString(" + ')');
        }
    }
    
    @Override
    public int hashCode() {
        try {
            if (null == this.cleanName) {
                return 0;
            }
            return this.cleanName.hashCode();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tm.hashCode(" + ')');
        }
    }
    
    @Override
    public int compareTo(final Object o) {
        try {
            return this.compareToTyped((Username)o, (byte)58);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tm.compareTo(" + ')');
        }
    }
    
    public static boolean gc(final Username username) {
        return username.cleanName != null;
    }
    
    public String at() {
        return this.name;
    }
    
    public String ay() {
        return this.cleanName;
    }
    
    public boolean hasCleanName(final int n) {
        try {
            boolean b;
            if (this.cleanName != null) {
                if (n == -956940951) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tm.aw(" + ')');
        }
    }
    
    public String al() {
        return this.name;
    }
    
    public String method2643(final int n) {
        try {
            return this.cleanName;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tm.an(" + ')');
        }
    }
    
    public int ac(final Object o) {
        return this.compareToTyped((Username)o, (byte)84);
    }
    
    public boolean gk(final Object o) {
        if (!(o instanceof Username)) {
            return false;
        }
        final Username username = (Username)o;
        if (null == this.cleanName) {
            return null == username.cleanName;
        }
        return username.cleanName != null && this.hashCode() == username.hashCode() && this.cleanName.equals(username.cleanName);
    }
    
    public String nv() {
        return this.cleanName;
    }
    
    public static boolean fa(final Username username, final Object o) {
        if (username == null) {
            return username.equals(o);
        }
        if (!(o instanceof Username)) {
            return false;
        }
        final Username username2 = (Username)o;
        if (null == username.cleanName) {
            return null == username2.cleanName;
        }
        return username2.cleanName != null && username.hashCode() == username2.hashCode() && username.cleanName.equals(username2.cleanName);
    }
    
    public boolean ai() {
        return this.cleanName != null;
    }
    
    public static int dx(final Username username, final Object o) {
        if (username == null) {
            username.al();
        }
        return username.compareToTyped((Username)o, (byte)57);
    }
    
    public boolean gi(final Object o) {
        if (!(o instanceof Username)) {
            return false;
        }
        final Username username = (Username)o;
        if (null == this.cleanName) {
            return null == username.cleanName;
        }
        return username.cleanName != null && this.hashCode() == username.hashCode() && this.cleanName.equals(username.cleanName);
    }
    
    public String getName(final int n) {
        try {
            return this.name;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tm.af(" + ')');
        }
    }
    
    public int ab(final Object o) {
        return this.compareToTyped((Username)o, (byte)44);
    }
    
    public int compareToTyped(final Username username, final byte b) {
        try {
            if (this.cleanName == null) {
                if (b <= 30) {
                    throw new IllegalStateException();
                }
                if (username.cleanName == null) {
                    return 0;
                }
                return 1;
            }
            else {
                if (null != username.cleanName) {
                    return this.cleanName.compareTo(username.cleanName);
                }
                if (b <= 30) {
                    throw new IllegalStateException();
                }
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tm.aq(" + ')');
        }
    }
    
    public boolean ag() {
        return this.cleanName != null;
    }
    
    public boolean gm(final Object o) {
        if (!(o instanceof Username)) {
            return false;
        }
        final Username username = (Username)o;
        if (null == this.cleanName) {
            return null == username.cleanName;
        }
        return username.cleanName != null && this.hashCode() == username.hashCode() && this.cleanName.equals(username.cleanName);
    }
    
    public int aht() {
        if (null == this.cleanName) {
            return 0;
        }
        return this.cleanName.hashCode();
    }
    
    public String wu() {
        return this.name;
    }
    
    public int ahh() {
        if (null == this.cleanName) {
            return 0;
        }
        return this.cleanName.hashCode();
    }
    
    public String ahj() {
        return this.getName(-710264960);
    }
    
    public String ahp() {
        return this.getName(-710264960);
    }
}
