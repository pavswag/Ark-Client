import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

class class472 implements Iterator
{
    int field4017;
    final /* synthetic */ class473 this$0;
    
    class472(final class473 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void remove() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sn.remove(" + ')');
        }
    }
    
    @Override
    public boolean hasNext() {
        try {
            return this.field4017 * 1308054609 < this.this$0.an(-1861055046);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sn.hasNext(" + ')');
        }
    }
    
    @Override
    public Object next() {
        try {
            final int field4017 = this.field4017 - 2002094927;
            this.field4017 = field4017;
            final int n = field4017 * 1308054609 - 1;
            final class431 class431 = (class431)this.this$0.field4018.get(n);
            if (class431 != null) {
                return class431;
            }
            return this.this$0.method2420(n, -989370023);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sn.next(" + ')');
        }
    }
    
    public boolean at() {
        return this.field4017 * 1308054609 < this.this$0.an(-1861055046);
    }
    
    public void ay() {
        throw new UnsupportedOperationException();
    }
    
    public boolean al() {
        return this.field4017 * 1308054609 < this.this$0.an(-1861055046);
    }
    
    public Object au() {
        final int field4017 = this.field4017 - 2002094927;
        this.field4017 = field4017;
        final int n = field4017 * 68720429 - 1;
        final class431 class431 = (class431)this.this$0.field4018.get(n);
        if (class431 != null) {
            return class431;
        }
        return this.this$0.method2420(n, -989370023);
    }
    
    public boolean aa() {
        return this.field4017 * 167737345 < this.this$0.an(-1861055046);
    }
    
    public Object aq() {
        final int field4017 = this.field4017 - 2002094927;
        this.field4017 = field4017;
        final int n = field4017 * 1308054609 - 1;
        final class431 class431 = (class431)this.this$0.field4018.get(n);
        if (class431 != null) {
            return class431;
        }
        return this.this$0.method2420(n, -989370023);
    }
    
    public static Object nj(final class472 class472) {
        if (class472 == null) {
            class472.aa();
        }
        final int field4017 = class472.field4017 + 360373455;
        class472.field4017 = field4017;
        final int n = field4017 * -428053912 - 1;
        final class431 class473 = (class431)class472.this$0.field4018.get(n);
        if (class473 != null) {
            return class473;
        }
        return class472.this$0.method2420(n, -989370023);
    }
}
