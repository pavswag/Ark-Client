import java.awt.Font;

// 
// Decompiled by Procyon v0.5.36
// 

public class class244
{
    static final int ac = 4;
    static final int an = 1;
    static final int aw = 2;
    static final int af = 0;
    static final int au = 3;
    public static final int ar = 16;
    static Font fontHelvetica13;
    
    class244() throws Throwable {
        throw new Error();
    }
    
    static int method1391(final int n, final Script script, final boolean b, final int n2) {
        try {
            final Widget widget = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
            if (1500 == n) {
                if (n2 != 6390717) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.x * 262951665;
                return 1;
            }
            else if (1501 == n) {
                if (n2 != 6390717) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -747355095 * widget.y;
                return 1;
            }
            else if (n == 1502) {
                if (n2 != 6390717) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.width * -794961409;
                return 1;
            }
            else if (n == 1503) {
                if (n2 != 6390717) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget.height * 1473950221;
                return 1;
            }
            else if (n == 1504) {
                if (n2 != 6390717) {
                    throw new IllegalStateException();
                }
                final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                final int n3 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                boolean b2;
                if (widget.spriteTiling) {
                    if (n2 != 6390717) {
                        throw new IllegalStateException();
                    }
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                interpreter_intStack[n3] = (b2 ? 1 : 0);
                return 1;
            }
            else {
                if (1505 != n) {
                    return 2;
                }
                if (n2 != 6390717) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 913615679 * widget.parentId;
                return 1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jn.ax(" + ')');
        }
    }
    
    public static String method1393(long n) {
        try {
            if (n <= 0L || n >= 6582952005840035281L) {
                return null;
            }
            if (0L == n % 37L) {
                return null;
            }
            int capacity = 0;
            for (long n2 = n; n2 != 0L; n2 /= 37L) {
                ++capacity;
            }
            final StringBuilder sb = new StringBuilder(capacity);
            while (n != 0L) {
                final long n3 = n;
                n /= 37L;
                sb.append(class373.base37Table[(int)(n3 - 37L * n)]);
            }
            return sb.reverse().toString();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jn.an(" + ')');
        }
    }
    
    static void method1392(final int n, final int n2) {
        try {
            Client.oculusOrbState = -1041341417 * n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jn.nx(" + ')');
        }
    }
}
