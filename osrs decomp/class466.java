import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class class466 implements class465
{
    final class496 field3988;
    Map field3989;
    
    public class466(final class496 field3988) {
        this.field3988 = field3988;
    }
    
    @Override
    public Iterator iterator() {
        try {
            if (this.field3989 == null) {
                return Collections.emptyList().iterator();
            }
            return this.field3989.values().iterator();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ry.iterator(" + ')');
        }
    }
    
    @Override
    public void at(final int i, final Object field4104) {
        if (null == this.field3989) {
            (this.field3989 = new HashMap()).put(i, new class497(i, field4104));
        }
        else {
            final class497 class497 = this.field3989.get(i);
            if (null == class497) {
                this.field3989.put(i, new class497(i, field4104));
            }
            else {
                class497.field4104 = field4104;
            }
        }
    }
    
    public Iterator br() {
        if (this.field3989 == null) {
            return Collections.emptyList().iterator();
        }
        return this.field3989.values().iterator();
    }
    
    @Override
    public int aw(final int i) {
        if (this.field3989 != null) {
            final class497 class497 = this.field3989.get(i);
            if (class497 != null) {
                return (int)class497.field4104;
            }
        }
        return (int)this.field3988.vmethod8697(i, (short)(-24441));
    }
    
    @Override
    public void al(final int i, final Object field4104) {
        if (null == this.field3989) {
            (this.field3989 = new HashMap()).put(i, new class497(i, field4104));
        }
        else {
            final class497 class497 = this.field3989.get(i);
            if (null == class497) {
                this.field3989.put(i, new class497(i, field4104));
            }
            else {
                class497.field4104 = field4104;
            }
        }
    }
    
    @Override
    public void vmethod8143(final int i, final Object field4104, final int n) {
        try {
            if (null == this.field3989) {
                if (n == 654932558) {
                    throw new IllegalStateException();
                }
                (this.field3989 = new HashMap()).put(i, new class497(i, field4104));
            }
            else {
                final class497 class497 = this.field3989.get(i);
                if (null == class497) {
                    if (n == 654932558) {
                        throw new IllegalStateException();
                    }
                    this.field3989.put(i, new class497(i, field4104));
                }
                else {
                    class497.field4104 = field4104;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ry.an(" + ')');
        }
    }
    
    @Override
    public int ac(final int i) {
        if (this.field3989 != null) {
            final class497 class497 = this.field3989.get(i);
            if (class497 != null) {
                return (int)class497.field4104;
            }
        }
        return (int)this.field3988.vmethod8697(i, (short)(-11681));
    }
    
    @Override
    public int au(final int i) {
        if (this.field3989 != null) {
            final class497 class497 = this.field3989.get(i);
            if (class497 != null) {
                return (int)class497.field4104;
            }
        }
        return (int)this.field3988.vmethod8697(i, (short)(-9792));
    }
    
    public Iterator bg() {
        if (this.field3989 == null) {
            return Collections.emptyList().iterator();
        }
        return this.field3989.values().iterator();
    }
    
    @Override
    public int vmethod8144(final int i, final byte b) {
        try {
            if (this.field3989 != null) {
                final class497 class497 = this.field3989.get(i);
                if (class497 != null) {
                    return (int)class497.field4104;
                }
            }
            return (int)this.field3988.vmethod8697(i, (short)(-16285));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ry.af(" + ')');
        }
    }
    
    @Override
    public void ab(final int i, final Object field4104) {
        if (null == this.field3989) {
            (this.field3989 = new HashMap()).put(i, new class497(i, field4104));
        }
        else {
            final class497 class497 = this.field3989.get(i);
            if (null == class497) {
                this.field3989.put(i, new class497(i, field4104));
            }
            else {
                class497.field4104 = field4104;
            }
        }
    }
    
    @Override
    public void aq(final int i, final Object field4104) {
        if (null == this.field3989) {
            (this.field3989 = new HashMap()).put(i, new class497(i, field4104));
        }
        else {
            final class497 class497 = this.field3989.get(i);
            if (null == class497) {
                this.field3989.put(i, new class497(i, field4104));
            }
            else {
                class497.field4104 = field4104;
            }
        }
    }
    
    public Iterator bu() {
        if (this.field3989 == null) {
            return Collections.emptyList().iterator();
        }
        return this.field3989.values().iterator();
    }
}
