import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

final class class101 implements class308
{
    static final int bi = 19136896;
    static final int as = 7;
    public static final int bo = 131072;
    static final int tx = 1024;
    static int field1082;
    final /* synthetic */ Widget val$cc;
    
    class101(final Widget val$cc) {
        this.val$cc = val$cc;
    }
    
    static final String method633(final int i, final int n) {
        try {
            if (i < 100000) {
                if (n <= 247431094) {
                    throw new IllegalStateException();
                }
                return "<col=ffff00>" + i + "</col>";
            }
            else {
                if (i >= 10000000) {
                    return "<col=00ff80>" + i / 1000000 + Strings.gp + "</col>";
                }
                if (n <= 247431094) {
                    throw new IllegalStateException();
                }
                return "<col=ffffff>" + i / 1000 + Strings.gv + "</col>";
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dy.ao(" + ')');
        }
    }
    
    public static int sh(final class125 class125) {
        return -751175407 * class125.field1234;
    }
    
    @Override
    public void aw() {
        if (this.val$cc != null && this.val$cc.method1818(-686746886).field2824 != null) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, this.val$cc, (byte)(-26));
            scriptEvent.setArgs(this.val$cc.method1818(566372406).field2824, 256382678);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)85).addFirst(scriptEvent);
        }
    }
    
    @Override
    public void an() {
        if (this.val$cc != null && this.val$cc.method1818(-2115444779).field2824 != null) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, this.val$cc, (byte)(-86));
            scriptEvent.setArgs(this.val$cc.method1818(90337492).field2824, -396144798);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)119).addFirst(scriptEvent);
        }
    }
    
    @Override
    public void ac() {
        if (this.val$cc != null && this.val$cc.method1818(-569931730).field2824 != null) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, this.val$cc, (byte)(-74));
            scriptEvent.setArgs(this.val$cc.method1818(476476081).field2824, 1995573311);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)11).addFirst(scriptEvent);
        }
    }
    
    @Override
    public void au() {
        if (this.val$cc != null && this.val$cc.method1818(-1141661558).field2824 != null) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, this.val$cc, (byte)(-81));
            scriptEvent.setArgs(this.val$cc.method1818(-1005785523).field2824, -691983005);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)126).addFirst(scriptEvent);
        }
    }
    
    static final int method634(final int n, final int n2, final int n3, final byte b) {
        try {
            final int n4 = n / n3;
            final int n5 = n & n3 - 1;
            final int n6 = n2 / n3;
            return JagexCache.method952(JagexCache.method952(class383.method2085(n4, n6, (byte)119), class383.method2085(1 + n4, n6, (byte)52), n5, n3, (byte)(-40)), JagexCache.method952(class383.method2085(n4, n6 + 1, (byte)117), class383.method2085(n4 + 1, n6 + 1, (byte)72), n5, n3, (byte)(-21)), n2 & n3 - 1, n3, (byte)(-74));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dy.ai(" + ')');
        }
    }
    
    @Override
    public void vmethod5708(final int n) {
        try {
            if (this.val$cc != null) {
                if (n != 427135973) {
                    throw new IllegalStateException();
                }
                if (this.val$cc.method1818(-1420038959).field2824 != null) {
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    ScriptEvent.sd(scriptEvent, this.val$cc, (byte)34);
                    scriptEvent.setArgs(this.val$cc.method1818(-110395550).field2824, 1887161968);
                    GrandExchangeOfferAgeComparator.getScriptEvents((byte)99).addFirst(scriptEvent);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dy.af(" + ')');
        }
    }
    
    public static int te(final AccessFile accessFile, final byte[] b, final int off, final int len) throws IOException {
        final int read = accessFile.file.read(b, off, len);
        if (read > 0) {
            accessFile.offset += 1783873278372083011L * read;
        }
        return read;
    }
}
