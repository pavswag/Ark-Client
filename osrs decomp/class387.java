// 
// Decompiled by Procyon v0.5.36
// 

public class class387
{
    static final int bm = 41;
    public static final int af = 213;
    
    class387() throws Throwable {
        throw new Error();
    }
    
    static final int method2093(final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            return n * n3 - n2 * n4 >> 16;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ob.aw(" + ')');
        }
    }
    
    public static void RunException_sendStackTrace(final String s, final Throwable t, final byte b) {
        Throwable mf = t;
        if (t instanceof RunException) {
            mf = ((RunException)t).mf();
        }
        if (s == null) {
            Client.nw.error("Client error", mf);
        }
        else {
            Client.nw.error("Client error: {}", (Object)s, (Object)mf);
        }
        ScriptFrame.client.getCallbacks().error(s, mf);
    }
}
