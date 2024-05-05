import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class class327
{
    public static final int bg = 65;
    public static final int al = 6;
    public static final int ac = 2;
    public static final int af = -1;
    public static final int ao = 10;
    public static final int at = 7;
    public static final int ab = 4;
    public static final int an = -2;
    public static final int ah = 14;
    public static final int bu = 67;
    static final int cw = 90;
    
    class327() throws Throwable {
        throw new Error();
    }
    
    public static List pf(final class482 class482, final Object o, int n) {
        if (n < 0) {
            n = 0;
        }
        return class482.field4037.get(n).get(o);
    }
    
    static int method1843(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (6200 == n) {
                if (b2 == 14) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                Client.field625 = (short)VertexNormal.method1346(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], -2041739406);
                if (Client.field625 <= 0) {
                    Client.field625 = 256;
                }
                Client.field626 = (short)VertexNormal.method1346(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], -1156963923);
                if (Client.field626 <= 0) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    Client.field626 = 256;
                }
                return 1;
            }
            else if (n == 6201) {
                if (b2 == 14) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                Client.zoomHeight = (short)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                if (Client.zoomHeight <= 0) {
                    Client.zoomHeight = 256;
                }
                Client.zoomWidth = (short)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                if (Client.zoomWidth <= 0) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    Client.zoomWidth = 320;
                }
                return 1;
            }
            else if (6202 == n) {
                if (b2 == 14) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 1708543892;
                Client.field440 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                if (Client.field440 <= 0) {
                    Client.field440 = 1;
                }
                Client.field630 = (short)Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                if (Client.field630 <= 0) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    Client.field630 = 32767;
                }
                else if (Client.field630 < Client.field440) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    Client.field630 = Client.field440;
                }
                Client.field488 = (short)Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                if (Client.field488 <= 0) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    Client.field488 = 1;
                }
                Client.field562 = (short)Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize];
                if (Client.field562 <= 0) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    Client.field562 = 32767;
                }
                else if (Client.field562 < Client.field488) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    Client.field562 = Client.field488;
                }
                return 1;
            }
            else if (6203 == n) {
                if (b2 == 14) {
                    throw new IllegalStateException();
                }
                if (Client.viewportWidget != null) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    class36.setViewportShape(0, 0, -794961409 * Client.viewportWidget.width, 1473950221 * Client.viewportWidget.height, false, 566359130);
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 433849721 * Client.viewportWidth;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.viewportHeight * 2042096749;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                }
                return 1;
            }
            else if (n == 6204) {
                if (b2 == 14) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.zoomHeight;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.zoomWidth;
                return 1;
            }
            else if (n == 6205) {
                if (b2 == 14) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = SoundSystem.method246(Client.field625, -1195339231);
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = SoundSystem.method246(Client.field626, -1932123695);
                return 1;
            }
            else {
                if (6220 == n) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    return 1;
                }
                if (6221 == n) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    return 1;
                }
                else if (n == 6222) {
                    if (b2 == 14) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = GameEngine.canvasWidth * -1687260435;
                    return 1;
                }
                else {
                    if (6223 == n) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1658005443 * class262.canvasHeight;
                        return 1;
                    }
                    return 2;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mg.bg(" + ')');
        }
    }
    
    public static void method1842(final AbstractArchive field4040, final byte b) {
        try {
            DbRowType.field4040 = field4040;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mg.af(" + ')');
        }
    }
}
