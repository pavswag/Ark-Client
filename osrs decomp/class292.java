import java.util.TimeZone;
import java.util.Calendar;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.36
// 

public final class class292
{
    static final int aq = 4;
    static final int ah = 13;
    static final HashMap field2709;
    public static final int af = 11745;
    public static final long an = 86400000L;
    static IndexedSprite titlebuttonSprite;
    
    class292() throws Throwable {
        throw new Error();
    }
    
    static {
        field2709 = new HashMap();
        Calendar.getInstance(method1604("Europe/London", -1017888567));
    }
    
    static TimeZone aw(final String key) {
        synchronized (class292.field2709) {
            TimeZone timeZone = class292.field2709.get(key);
            if (null == timeZone) {
                timeZone = TimeZone.getTimeZone(key);
                class292.field2709.put(key, timeZone);
            }
            return timeZone;
        }
    }
    
    static TimeZone an(final String key) {
        synchronized (class292.field2709) {
            TimeZone timeZone = class292.field2709.get(key);
            if (null == timeZone) {
                timeZone = TimeZone.getTimeZone(key);
                class292.field2709.put(key, timeZone);
            }
            return timeZone;
        }
    }
    
    public static int fo(final AbstractFont abstractFont, final String s, final int n) {
        if (abstractFont == null) {
            abstractFont.lineCount(s, n);
        }
        return AbstractFont.mk(abstractFont, s, new int[] { n }, AbstractFont.AbstractFont_lines);
    }
    
    static TimeZone method1604(final String key, final int n) {
        try {
            synchronized (class292.field2709) {
                TimeZone timeZone = class292.field2709.get(key);
                if (null == timeZone) {
                    if (n == -1848743379) {
                        throw new IllegalStateException();
                    }
                    timeZone = TimeZone.getTimeZone(key);
                    class292.field2709.put(key, timeZone);
                }
                return timeZone;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lu.af(" + ')');
        }
    }
    
    public static boolean method1604(final int n, final int n2) {
        try {
            if (10 != n) {
                if (n2 != -964267539) {
                    throw new IllegalStateException();
                }
                if (n != 11) {
                    if (n2 != -964267539) {
                        throw new IllegalStateException();
                    }
                    if (n != 12) {
                        if (n2 != -964267539) {
                            throw new IllegalStateException();
                        }
                        if (13 != n) {
                            if (n2 != -964267539) {
                                throw new IllegalStateException();
                            }
                            if (n != 14) {
                                if (n2 != -964267539) {
                                    throw new IllegalStateException();
                                }
                                if (15 != n) {
                                    if (n2 != -964267539) {
                                        throw new IllegalStateException();
                                    }
                                    if (16 != n) {
                                        if (17 != n) {
                                            return false;
                                        }
                                        if (n2 != -964267539) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lu.af(" + ')');
        }
    }
}
