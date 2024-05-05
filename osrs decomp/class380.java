// 
// Decompiled by Procyon v0.5.36
// 

public class class380
{
    static final int al = 7;
    int field3622;
    static final int ao = 12;
    public static final int aw = -3;
    
    class380(final int n, final boolean b) {
        this.field3622 = -349301751 * n;
    }
    
    public static int bt(final class380 class380, final int n) {
        if (class380 == null) {
            return class380.method2044(n);
        }
        try {
            return 410499641 * class380.field3622;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ow.af(" + ')');
        }
    }
    
    public int an() {
        return 410499641 * this.field3622;
    }
    
    static int method2045(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (3400 == n) {
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n3 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n4 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                EnumComposition vmethod3248 = class148.vmethod3248(n3, (byte)15);
                if (vmethod3248.outputType != 's' && n2 == -1894908731) {
                    throw new IllegalStateException();
                }
                int i = 0;
                while (i < -1067065 * vmethod3248.defaultInt) {
                    if (n2 == -1894908731) {
                        throw new IllegalStateException();
                    }
                    if (n4 == vmethod3248.keys[i]) {
                        if (n2 == -1894908731) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3248.strVals[i];
                        vmethod3248 = null;
                        break;
                    }
                    else {
                        ++i;
                    }
                }
                if (vmethod3248 != null) {
                    if (n2 == -1894908731) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3248.defaultStr;
                }
                return 1;
            }
            else if (3408 == n) {
                if (n2 == -1894908731) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 1708543892;
                final int n5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n6 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                final int n7 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
                final int n8 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 3];
                EnumComposition vmethod3249 = class148.vmethod3248(n7, (byte)15);
                if (n5 == vmethod3249.inputType) {
                    if (n2 == -1894908731) {
                        throw new IllegalStateException();
                    }
                    if (n6 == vmethod3249.outputType) {
                        int j = 0;
                        while (j < -1067065 * vmethod3249.defaultInt) {
                            if (n8 == vmethod3249.keys[j]) {
                                if (n2 == -1894908731) {
                                    throw new IllegalStateException();
                                }
                                if (n6 == 's') {
                                    if (n2 == -1894908731) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3249.strVals[j];
                                }
                                else {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3249.intVals[j];
                                }
                                vmethod3249 = null;
                                break;
                            }
                            else {
                                ++j;
                            }
                        }
                        if (null != vmethod3249) {
                            if (n2 == -1894908731) {
                                throw new IllegalStateException();
                            }
                            if (n6 == 's') {
                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3249.defaultStr;
                            }
                            else {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -635236715 * vmethod3249.outputCount;
                            }
                        }
                        return 1;
                    }
                    if (n2 == -1894908731) {
                        throw new IllegalStateException();
                    }
                }
                if ('s' == n6) {
                    if (n2 == -1894908731) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Strings.at;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                }
                return 1;
            }
            else {
                if (n != 3411) {
                    return 2;
                }
                if (n2 == -1894908731) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class148.vmethod3248(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)15).size(-1771733315);
                return 1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ow.by(" + ')');
        }
    }
    
    public int method2044(final int n) {
        try {
            return 410499641 * this.field3622;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ow.af(" + ')');
        }
    }
}
