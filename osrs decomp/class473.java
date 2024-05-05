import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class class473 extends class430 implements class275
{
    final DemotingHashTable field4018;
    final AbstractArchive field4019;
    final int field4020;
    public static final String kd = "";
    static boolean mouseCam;
    
    public class473(final StudioGame studioGame, final int n, final Language language, final AbstractArchive field4019) {
        super(studioGame, language, (null != field4019) ? field4019.getGroupFileCount(n, (byte)60) : 0);
        this.field4018 = new DemotingHashTable(64);
        this.field4019 = field4019;
        this.field4020 = n * 1768319205;
    }
    
    @Override
    public Iterator iterator() {
        try {
            return new class472(this);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "su.iterator(" + ')');
        }
    }
    
    @Override
    protected class432 ao(final int n) {
        class431 method2420;
        synchronized (this.field4018) {
            method2420 = (class431)this.field4018.get(n);
            if (null == method2420) {
                method2420 = this.method2420(n, -989370023);
                this.field4018.method1577(method2420, n);
            }
        }
        return method2420;
    }
    
    public void ak() {
        synchronized (this.field4018) {
            this.field4018.clear();
        }
    }
    
    @Override
    protected class432 av(final int n) {
        class431 method2420;
        synchronized (this.field4018) {
            method2420 = (class431)this.field4018.get(n);
            if (null == method2420) {
                method2420 = this.method2420(n, -989370023);
                this.field4018.method1577(method2420, n);
            }
        }
        return method2420;
    }
    
    class431 as(final int n) {
        final byte[] takeFile = this.field4019.takeFile(this.field4020 * -1931772261, n, (byte)(-48));
        final class431 class431 = new class431(n);
        if (takeFile != null) {
            class431.aw(new Buffer(takeFile), -894783888);
        }
        return class431;
    }
    
    public void az() {
        synchronized (this.field4018) {
            this.field4018.clear();
        }
    }
    
    @Override
    protected class432 ax(final int n) {
        class431 method2420;
        synchronized (this.field4018) {
            method2420 = (class431)this.field4018.get(n);
            if (null == method2420) {
                method2420 = this.method2420(n, -989370023);
                this.field4018.method1577(method2420, n);
            }
        }
        return method2420;
    }
    
    public Iterator br() {
        return new class472(this);
    }
    
    public void method2418(final byte b) {
        try {
            synchronized (this.field4018) {
                this.field4018.clear();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "su.am(" + ')');
        }
    }
    
    public static Iterator fa(final class473 class473) {
        if (class473 == null) {
            class473.iterator();
        }
        return new class472(class473);
    }
    
    static HorizontalAlignment[] method2421(final byte b) {
        try {
            return new HorizontalAlignment[] { HorizontalAlignment.field1547, HorizontalAlignment.field1549, HorizontalAlignment.HorizontalAlignment_centered };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "su.au(" + ')');
        }
    }
    
    @Override
    protected class432 ai(final int n) {
        class431 method2420;
        synchronized (this.field4018) {
            method2420 = (class431)this.field4018.get(n);
            if (null == method2420) {
                method2420 = this.method2420(n, -989370023);
                this.field4018.method1577(method2420, n);
            }
        }
        return method2420;
    }
    
    class431 method2420(final int n, final int n2) {
        try {
            final byte[] takeFile = this.field4019.takeFile(this.field4020 * -418179859, n, (byte)(-48));
            final class431 class431 = new class431(n);
            if (takeFile != null) {
                class431.aw(new Buffer(takeFile), -1189317349);
            }
            return class431;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "su.ar(" + ')');
        }
    }
    
    @Override
    protected class432 vmethod8207(final int n, final byte b) {
        try {
            class431 method2420;
            synchronized (this.field4018) {
                method2420 = (class431)this.field4018.get(n);
                if (null == method2420) {
                    if (b != 0) {
                        throw new IllegalStateException();
                    }
                    method2420 = this.method2420(n, -989370023);
                    this.field4018.method1577(method2420, n);
                }
            }
            return method2420;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "su.af(" + ')');
        }
    }
    
    @Override
    protected class432 ag(final int n) {
        class431 method2420;
        synchronized (this.field4018) {
            method2420 = (class431)this.field4018.get(n);
            if (null == method2420) {
                method2420 = this.method2420(n, -989370023);
                this.field4018.method1577(method2420, n);
            }
        }
        return method2420;
    }
    
    public static class431 vp(final class473 class473, final int n) {
        final byte[] takeFile = class473.field4019.takeFile(class473.field4020 * -418179859, n, (byte)(-106));
        final class431 class474 = new class431(n);
        if (takeFile != null) {
            class474.aw(new Buffer(takeFile), 1469995379);
        }
        return class474;
    }
    
    @Override
    protected class432 ah(final int n) {
        class431 method2420;
        synchronized (this.field4018) {
            method2420 = (class431)this.field4018.get(n);
            if (null == method2420) {
                method2420 = this.method2420(n, -989370023);
                this.field4018.method1577(method2420, n);
            }
        }
        return method2420;
    }
    
    public Iterator bu() {
        return new class472(this);
    }
}
