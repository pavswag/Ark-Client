// 
// Decompiled by Procyon v0.5.36
// 

public class class461
{
    public final Object field3972;
    public final Object field3973;
    static final int au = 2;
    public static final int aq = 65536;
    
    public class461(final Object field3972, final Object field3973) {
        this.field3972 = field3972;
        this.field3973 = field3973;
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (o != null && o instanceof class461) {
                final class461 class461 = (class461)o;
                if (this.field3972 == null) {
                    if (class461.field3972 != null) {
                        return false;
                    }
                }
                else if (!this.field3972.equals(class461.field3972)) {
                    return false;
                }
                if (null == this.field3973) {
                    if (class461.field3973 != null) {
                        return false;
                    }
                }
                else if (!this.field3973.equals(class461.field3973)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rg.equals(" + ')');
        }
    }
    
    @Override
    public String toString() {
        try {
            return this.field3972 + ", " + this.field3973;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rg.toString(" + ')');
        }
    }
    
    @Override
    public int hashCode() {
        try {
            int n = 0;
            if (null != this.field3972) {
                n += this.field3972.hashCode();
            }
            if (this.field3973 != null) {
                n += 31 * this.field3973.hashCode();
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rg.hashCode(" + ')');
        }
    }
    
    public static String ua(final class461 class461) {
        if (class461 == null) {
            return class461.toString();
        }
        return class461.field3972 + ", " + class461.field3973;
    }
    
    public boolean gk(final Object o) {
        if (o == null || !(o instanceof class461)) {
            return false;
        }
        final class461 class461 = (class461)o;
        if (this.field3972 == null) {
            if (class461.field3972 != null) {
                return false;
            }
        }
        else if (!this.field3972.equals(class461.field3972)) {
            return false;
        }
        if (null == this.field3973) {
            if (class461.field3973 != null) {
                return false;
            }
        }
        else if (!this.field3973.equals(class461.field3973)) {
            return false;
        }
        return true;
    }
    
    public boolean gi(final Object o) {
        if (o != null && o instanceof class461) {
            final class461 class461 = (class461)o;
            if (this.field3972 == null) {
                if (class461.field3972 != null) {
                    return false;
                }
            }
            else if (!this.field3972.equals(class461.field3972)) {
                return false;
            }
            if (null == this.field3973) {
                if (class461.field3973 != null) {
                    return false;
                }
            }
            else if (!this.field3973.equals(class461.field3973)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public static int hz(final class461 class461) {
        if (class461 == null) {
            class461.ahp();
        }
        int n = 0;
        if (null != class461.field3972) {
            n += class461.field3972.hashCode();
        }
        if (class461.field3973 != null) {
            n += 31 * class461.field3973.hashCode();
        }
        return n;
    }
    
    public boolean gm(final Object o) {
        if (o != null && o instanceof class461) {
            final class461 class461 = (class461)o;
            if (this.field3972 == null) {
                if (class461.field3972 != null) {
                    return false;
                }
            }
            else if (!this.field3972.equals(class461.field3972)) {
                return false;
            }
            if (null == this.field3973) {
                if (class461.field3973 != null) {
                    return false;
                }
            }
            else if (!this.field3973.equals(class461.field3973)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public boolean gq(final Object o) {
        if (o != null && o instanceof class461) {
            final class461 class461 = (class461)o;
            if (this.field3973 == null) {
                if (class461.field3973 != null) {
                    return false;
                }
            }
            else if (!this.field3973.equals(class461.field3972)) {
                return false;
            }
            if (null == this.field3973) {
                if (class461.field3973 != null) {
                    return false;
                }
            }
            else if (!this.field3973.equals(class461.field3973)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public int aht() {
        int n = 0;
        if (null != this.field3972) {
            n += this.field3972.hashCode();
        }
        if (this.field3973 != null) {
            n += 272763895 * this.field3973.hashCode();
        }
        return n;
    }
    
    public int ahv() {
        int n = 0;
        if (null != this.field3972) {
            n += this.field3972.hashCode();
        }
        if (this.field3973 != null) {
            n += 31 * this.field3973.hashCode();
        }
        return n;
    }
    
    public String ahm() {
        return this.field3972 + ", " + this.field3973;
    }
    
    public String ahp() {
        return this.field3972 + ", " + this.field3973;
    }
}
