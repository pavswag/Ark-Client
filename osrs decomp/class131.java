// 
// Decompiled by Procyon v0.5.36
// 

public class class131
{
    static final int bm = 9;
    
    class131() throws Throwable {
        throw new Error();
    }
    
    public static class424 method767(final byte b) {
        try {
            synchronized (class424.field3787) {
                if (0 == -2133937525 * class424.field3786) {
                    return new class424();
                }
                class424.field3787[(class424.field3786 -= 1732158755) * -2133937525].method2244(479654573);
                return class424.field3787[-2133937525 * class424.field3786];
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fs.an(" + ')');
        }
    }
    
    public static short[] zc(final NPCComposition npcComposition) {
        return npcComposition.headIconSpriteIndexes;
    }
    
    static int method766(int n, final Script script, final boolean b, final int n2) {
        try {
            int n3 = -1;
            Widget vmethod3380;
            if (n >= 2000) {
                if (n2 != 1883190484) {
                    throw new IllegalStateException();
                }
                n -= 1000;
                n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                vmethod3380 = class165.vmethod3380(n3, (byte)5);
            }
            else {
                Widget widget;
                if (b) {
                    if (n2 != 1883190484) {
                        throw new IllegalStateException();
                    }
                    widget = SoundSystem.scriptDotWidget;
                }
                else {
                    widget = class1.scriptActiveWidget;
                }
                vmethod3380 = widget;
            }
            if (n == 1000) {
                if (n2 != 1883190484) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 1708543892;
                vmethod3380.rawX = 1806877347 * Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                vmethod3380.rawY = 1231090287 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                vmethod3380.xAlignment = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539] * 1656805111;
                vmethod3380.yAlignment = Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize] * -362988363;
                class144.invalidateWidget(vmethod3380, -672313735);
                ScriptFrame.client.alignWidget(vmethod3380, 195955152);
                if (n3 != -1) {
                    if (n2 != 1883190484) {
                        throw new IllegalStateException();
                    }
                    if (883712245 * vmethod3380.type == 0) {
                        if (n2 != 1883190484) {
                            throw new IllegalStateException();
                        }
                        WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n3 >> 16], vmethod3380, false, (byte)63);
                    }
                }
                return 1;
            }
            else if (1001 == n) {
                if (n2 != 1883190484) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 1708543892;
                vmethod3380.rawWidth = -1495372107 * Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                vmethod3380.rawHeight = 1193771871 * Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                vmethod3380.widthAlignment = 387308049 * Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                vmethod3380.heightAlignment = -480958745 * Interpreter.Interpreter_intStack[3 + -964267539 * Interpreter.Interpreter_intStackSize];
                class144.invalidateWidget(vmethod3380, -1210238136);
                ScriptFrame.client.alignWidget(vmethod3380, 30736470);
                if (-1 != n3) {
                    if (n2 != 1883190484) {
                        throw new IllegalStateException();
                    }
                    if (vmethod3380.type * 883712245 == 0) {
                        if (n2 != 1883190484) {
                            throw new IllegalStateException();
                        }
                        WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n3 >> 16], vmethod3380, false, (byte)121);
                    }
                }
                return 1;
            }
            else if (1003 == n) {
                if (n2 != 1883190484) {
                    throw new IllegalStateException();
                }
                final boolean spriteTiling = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1;
                if (spriteTiling != vmethod3380.spriteTiling) {
                    if (n2 != 1883190484) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.spriteTiling = spriteTiling;
                    class144.invalidateWidget(vmethod3380, -1743554950);
                }
                return 1;
            }
            else if (n == 1005) {
                if (n2 != 1883190484) {
                    throw new IllegalStateException();
                }
                final Widget widget2 = vmethod3380;
                boolean hasListener;
                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                    if (n2 != 1883190484) {
                        throw new IllegalStateException();
                    }
                    hasListener = true;
                }
                else {
                    hasListener = false;
                }
                widget2.hasListener = hasListener;
                return 1;
            }
            else {
                if (n != 1006) {
                    return 2;
                }
                if (n2 != 1883190484) {
                    throw new IllegalStateException();
                }
                final Widget widget3 = vmethod3380;
                boolean prioritizeMenuEntry;
                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                    if (n2 != 1883190484) {
                        throw new IllegalStateException();
                    }
                    prioritizeMenuEntry = true;
                }
                else {
                    prioritizeMenuEntry = false;
                }
                widget3.prioritizeMenuEntry = prioritizeMenuEntry;
                return 1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fs.au(" + ')');
        }
    }
}
