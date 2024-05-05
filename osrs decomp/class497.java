// 
// Decompiled by Procyon v0.5.36
// 

public class class497
{
    public Object field4104;
    public final int field4105;
    
    public class497(final int n) {
        this.field4105 = -850259735 * n;
    }
    
    public class497(final int n, final Object field4104) {
        this.field4105 = -850259735 * n;
        this.field4104 = field4104;
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (!(o instanceof class497)) {
                return false;
            }
            final class497 class497 = (class497)o;
            return (null != class497.field4104 || null == this.field4104) && (this.field4104 != null || null == class497.field4104) && (class497.field4105 * -52705447 == this.field4105 * -52705447 && class497.field4104.equals(this.field4104));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "te.equals(" + ')');
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return super.hashCode();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "te.hashCode(" + ')');
        }
    }
    
    public static boolean cf(final class497 class497, final Object o) {
        if (class497 == null) {
            class497.aht();
        }
        if (!(o instanceof class497)) {
            return false;
        }
        final class497 class498 = (class497)o;
        return (null != class498.field4104 || null == class497.field4104) && (class497.field4104 != null || null == class498.field4104) && (class498.field4105 * -52705447 == class497.field4105 * -52705447 && class498.field4104.equals(class497.field4104));
    }
    
    public boolean gk(final Object o) {
        if (!(o instanceof class497)) {
            return false;
        }
        final class497 class497 = (class497)o;
        return (null != class497.field4104 || null == this.field4104) && (this.field4104 != null || null == class497.field4104) && (class497.field4105 * -52705447 == this.field4105 * -52705447 && class497.field4104.equals(this.field4104));
    }
    
    public static boolean bl(final class497 class497, final Object o) {
        if (class497 == null) {
            class497.ahv();
        }
        if (!(o instanceof class497)) {
            return false;
        }
        final class497 class498 = (class497)o;
        return (null != class498.field4104 || null == class497.field4104) && (class497.field4104 != null || null == class498.field4104) && class498.field4105 * -52705447 == class497.field4105 * -184898484 && class498.field4104.equals(class497.field4104);
    }
    
    public boolean gq(final Object o) {
        if (!(o instanceof class497)) {
            return false;
        }
        final class497 class497 = (class497)o;
        return (null != class497.field4104 || null == this.field4104) && (this.field4104 != null || null == class497.field4104) && (class497.field4105 * -52705447 == this.field4105 * -52705447 && class497.field4104.equals(this.field4104));
    }
    
    public int aht() {
        return super.hashCode();
    }
    
    public int ahv() {
        return super.hashCode();
    }
    
    public int ahh() {
        return super.hashCode();
    }
}
