import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.5.36
// 

class class132 implements Callable
{
    static long field1276;
    final /* synthetic */ int val$version;
    final /* synthetic */ class133 this$0;
    static final int br = 1002;
    public static final int ay = 13;
    static final int ao = 2048;
    static final int ap = 19136824;
    final /* synthetic */ Buffer val$p;
    public static class354 field1277;
    static final int ca = 4;
    
    class132(final class133 this$0, final Buffer val$p, final int val$version) {
        this.this$0 = this$0;
        this.val$p = val$p;
        this.val$version = val$version;
    }
    
    @Override
    public Object call() {
        try {
            class133.bh(this.this$0, this.val$p, this.val$version, (byte)(-87));
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fi.call(" + ')');
        }
    }
    
    public Object aw() {
        class133.bh(this.this$0, this.val$p, this.val$version, (byte)(-60));
        return null;
    }
    
    public Object an() {
        class133.bh(this.this$0, this.val$p, this.val$version, (byte)(-43));
        return null;
    }
    
    public static void xs(final MidiPcmStream midiPcmStream, final int n, final int n2) {
        if (midiPcmStream == null) {
            midiPcmStream.bi();
        }
    }
    
    public Object af() {
        class133.bh(this.this$0, this.val$p, this.val$version, (byte)(-67));
        return null;
    }
}
