import netscape.javascript.JSObject;
import java.applet.Applet;

// 
// Decompiled by Procyon v0.5.36
// 

public class class26
{
    class26() throws Throwable {
        throw new Error();
    }
    
    public static Object ao(final Applet applet, final String s) throws Throwable {
        return JSObject.getWindow(applet).call(s, (Object[])null);
    }
    
    public static void at(final Applet applet, final String s) throws Throwable {
        JSObject.getWindow(applet).eval(s);
    }
    
    public static Object ax(final Applet applet, final String s, final Object[] array) throws Throwable {
        return JSObject.getWindow(applet).call(s, array);
    }
    
    public static Object ay(final Applet applet, final String s) throws Throwable {
        return JSObject.getWindow(applet).call(s, (Object[])null);
    }
    
    public static Object method113(final Applet applet, final String s, final Object[] array, final int n) throws Throwable {
        try {
            return JSObject.getWindow(applet).call(s, array);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "by.aw(" + ')');
        }
    }
    
    public static void al(final Applet applet, final String s) throws Throwable {
        JSObject.getWindow(applet).eval(s);
    }
    
    public static Object method112(final Applet applet, final String s, final byte b) throws Throwable {
        try {
            return JSObject.getWindow(applet).call(s, (Object[])null);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "by.an(" + ')');
        }
    }
    
    public static void ac(final Applet applet, final String s) throws Throwable {
        JSObject.getWindow(applet).eval(s);
    }
    
    public static void au(final Applet applet, final String s) throws Throwable {
        JSObject.getWindow(applet).eval(s);
    }
    
    public static Object aa(final Applet applet, final String s) throws Throwable {
        return JSObject.getWindow(applet).call(s, (Object[])null);
    }
    
    public static Object ai(final Applet applet, final String s, final Object[] array) throws Throwable {
        return JSObject.getWindow(applet).call(s, array);
    }
    
    public static void method111(final Applet applet, final String s, final byte b) throws Throwable {
        try {
            JSObject.getWindow(applet).eval(s);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "by.af(" + ')');
        }
    }
    
    public static void ab(final Applet applet, final String s) throws Throwable {
        JSObject.getWindow(applet).eval(s);
    }
    
    public static void aq(final Applet applet, final String s) throws Throwable {
        JSObject.getWindow(applet).eval(s);
    }
    
    public static Object ag(final Applet applet, final String s, final Object[] array) throws Throwable {
        return JSObject.getWindow(applet).call(s, array);
    }
    
    public static boolean bz(final SecureRandomFuture secureRandomFuture) {
        if (secureRandomFuture == null) {
            secureRandomFuture.al();
        }
        return secureRandomFuture.future.isDone();
    }
}
