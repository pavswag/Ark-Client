import java.security.SecureRandom;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.5.36
// 

public class SecureRandomFuture
{
    Future future;
    static int selectedSpellFlags;
    static final int bi = 3;
    static final int bu = 0;
    ExecutorService executor;
    
    SecureRandomFuture() {
        this.executor = Executors.newSingleThreadExecutor();
        this.future = this.executor.submit((Callable<Object>)new SecureRandomCallable());
    }
    
    public static int get(final int n) {
        try {
            final int n2 = MouseHandler.MouseHandler_idleCycles -= 500489753;
            Client.ww(-1);
            return n2 * -119381545 - 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cj.aw(" + ')');
        }
    }
    
    SecureRandom get(final byte b) {
        try {
            try {
                return this.future.get();
            }
            catch (Exception ex2) {
                final SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextInt();
                return secureRandom;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cj.aw(" + ')');
        }
    }
    
    SecureRandom al() {
        try {
            return this.future.get();
        }
        catch (Exception ex) {
            final SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextInt();
            return secureRandom;
        }
    }
    
    boolean isDone(final byte b) {
        try {
            return this.future.isDone();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cj.an(" + ')');
        }
    }
    
    void method458() {
        this.executor.shutdown();
        this.executor = null;
    }
    
    public static String method458(final CharSequence charSequence, final int n) {
        try {
            String decode = FloorUnderlayDefinition.decode(class172.method954(charSequence, -1475560106));
            if (null == decode) {
                if (n == 1874342629) {
                    throw new IllegalStateException();
                }
                decode = "";
            }
            return decode;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cj.ac(" + ')');
        }
    }
    
    public static int method456(final CharSequence charSequence, final int i, final boolean b, final byte b2) {
        try {
            if (i >= 2) {
                if (b2 >= 0) {
                    throw new IllegalStateException();
                }
                if (i > 36) {
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    boolean b3 = false;
                    boolean b4 = false;
                    int n = 0;
                    for (int length = charSequence.length(), j = 0; j < length; ++j) {
                        int char1 = charSequence.charAt(j);
                        if (j == 0) {
                            if (b2 >= 0) {
                                throw new IllegalStateException();
                            }
                            if (45 == char1) {
                                b3 = true;
                                continue;
                            }
                            if (43 == char1) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                if (b) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    continue;
                                }
                            }
                        }
                        Label_0309: {
                            if (char1 >= 48) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                if (char1 <= 57) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    char1 -= 48;
                                    break Label_0309;
                                }
                            }
                            if (char1 < 65 || char1 > 90) {
                                if (char1 >= 97) {
                                    if (b2 >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    if (char1 <= 122) {
                                        if (b2 >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        char1 -= 87;
                                        break Label_0309;
                                    }
                                }
                                throw new NumberFormatException();
                            }
                            if (b2 >= 0) {
                                throw new IllegalStateException();
                            }
                            char1 -= 55;
                        }
                        if (char1 >= i) {
                            if (b2 >= 0) {
                                throw new IllegalStateException();
                            }
                            throw new NumberFormatException();
                        }
                        else {
                            if (b3) {
                                if (b2 >= 0) {
                                    throw new IllegalStateException();
                                }
                                char1 = -char1;
                            }
                            final int n2 = char1 + n * i;
                            if (n != n2 / i) {
                                throw new NumberFormatException();
                            }
                            n = n2;
                            b4 = true;
                        }
                    }
                    if (b4) {
                        return n;
                    }
                    if (b2 >= 0) {
                        throw new IllegalStateException();
                    }
                    throw new NumberFormatException();
                }
            }
            throw new IllegalArgumentException("" + i);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cj.au(" + ')');
        }
    }
    
    boolean method456() {
        return this.future.isDone();
    }
    
    SecureRandom aa() {
        try {
            return this.future.get();
        }
        catch (Exception ex) {
            final SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextInt();
            return secureRandom;
        }
    }
    
    void shutdown(final int n) {
        try {
            this.executor.shutdown();
            this.executor = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cj.af(" + ')');
        }
    }
    
    boolean aq() {
        return this.future.isDone();
    }
    
    public static SecureRandom jg(final SecureRandomFuture secureRandomFuture) {
        try {
            return secureRandomFuture.future.get();
        }
        catch (Exception ex) {
            final SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextInt();
            return secureRandom;
        }
    }
}
