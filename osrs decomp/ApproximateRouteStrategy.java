import java.util.Date;

// 
// Decompiled by Procyon v0.5.36
// 

public class ApproximateRouteStrategy extends RouteStrategy
{
    static final int ab = 3;
    static final int ar = 18;
    static final int bv = 1;
    
    ApproximateRouteStrategy() {
    }
    
    static final void method359(int max, final int n) {
        try {
            max = Math.max(Math.min(max, 100), 0);
            max = 100 - max;
            ScriptFrame.method341(0.5f + max / 200.0f);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cm.mc(" + ')');
        }
    }
    
    protected boolean aw(final int n, final int n2, final int n3, final CollisionMap collisionMap) {
        return n2 == this.af * 1970709942 && 727911086 * this.an == n3;
    }
    
    protected boolean getInvDefinition(final int n, final int n2, final int n3, final CollisionMap collisionMap) {
        return n2 == this.af * -1297786825 && -407280601 * this.an == n3;
    }
    
    public static InvDefinition getInvDefinition(final int n, final int n2) {
        try {
            final InvDefinition invDefinition = (InvDefinition)InvDefinition.InvDefinition_cached.wr(n);
            if (null == invDefinition) {
                final byte[] takeFile = InvDefinition.InvDefinition_archive.takeFile(5, n, (byte)(-7));
                final InvDefinition invDefinition2 = new InvDefinition();
                if (takeFile != null) {
                    invDefinition2.decode(new Buffer(takeFile), (byte)1);
                }
                InvDefinition.InvDefinition_cached.put(invDefinition2, n);
                return invDefinition2;
            }
            if (n2 != -1717461998) {
                throw new IllegalStateException();
            }
            return invDefinition;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cm.an(" + ')');
        }
    }
    
    protected boolean ac(final int n, final int n2, final int n3, final CollisionMap collisionMap) {
        return n2 == this.af * 465318274 && 1191111835 * this.an == n3;
    }
    
    @Override
    protected boolean au(final int n, final int n2, final int n3, final CollisionMap collisionMap) {
        return n2 == this.af * -1418619457 && 911526458 * this.an == n3;
    }
    
    @Override
    protected boolean hasArrived(final int n, final int n2, final int n3, final CollisionMap collisionMap, final int n4) {
        try {
            if (n2 == this.af * 689701217) {
                if (n4 == -83590544) {
                    throw new IllegalStateException();
                }
                if (-407280601 * this.an == n3) {
                    if (n4 == -83590544) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cm.af(" + ')');
        }
    }
    
    @Override
    protected boolean ab(final int n, final int n2, final int n3, final CollisionMap collisionMap) {
        return n2 == this.af * 1539024089 && -407280601 * this.an == n3;
    }
    
    static int method361(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (4100 == n) {
                if (n2 != 16776960) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987] + Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                return 1;
            }
            else {
                if (4101 == n) {
                    SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987] + Interpreter.Interpreter_stringStack[1 + -2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
                    return 1;
                }
                if (n == 4102) {
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987] + KitDefinition.getModelData(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], true, (byte)16);
                    return 1;
                }
                if (n == 4103) {
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toLowerCase();
                    return 1;
                }
                if (4104 == n) {
                    if (n2 != 16776960) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_calendar.setTime(new Date((Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] + 11745L) * 86400000L));
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_calendar.get(5) + "-" + Interpreter.Interpreter_MONTHS[Interpreter.Interpreter_calendar.get(2)] + "-" + Interpreter.Interpreter_calendar.get(1);
                    return 1;
                }
                else if (4105 == n) {
                    if (n2 != 16776960) {
                        throw new IllegalStateException();
                    }
                    SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                    final String s = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize];
                    final String s2 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                    if (null != MusicPatchNode.localPlayer.appearance) {
                        if (n2 != 16776960) {
                            throw new IllegalStateException();
                        }
                        if (0 != 1693987821 * MusicPatchNode.localPlayer.appearance.npcTransformId) {
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s2;
                            return 1;
                        }
                        if (n2 != 16776960) {
                            throw new IllegalStateException();
                        }
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s;
                    return 1;
                }
                else if (4106 == n) {
                    if (n2 != 16776960) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Integer.toString(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                    return 1;
                }
                else {
                    if (n == 4107) {
                        SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BuddyRankComparator.method712(class16.compareStrings(Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1], ClanSettings.clientLanguage, 1629498841), -1723997839);
                        return 1;
                    }
                    if (n == 4108) {
                        if (n2 != 16776960) {
                            throw new IllegalStateException();
                        }
                        final String s3 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class292.fo(new Font(class128.archive13.bh(Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 0, (byte)(-23))), s3, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539]);
                        return 1;
                    }
                    else if (n == 4109) {
                        if (n2 != 16776960) {
                            throw new IllegalStateException();
                        }
                        final String s4 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = AbstractFont.fa(new Font(class128.archive13.bh(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], 0, (byte)(-43))), s4, Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize]);
                        return 1;
                    }
                    else if (n == 4110) {
                        if (n2 != 16776960) {
                            throw new IllegalStateException();
                        }
                        SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                        final String s5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                        final String s6 = Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s5;
                        }
                        else {
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s6;
                        }
                        return 1;
                    }
                    else if (4111 == n) {
                        if (n2 != 16776960) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = AbstractFont.escapeBrackets(Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987]);
                        return 1;
                    }
                    else if (4112 == n) {
                        if (n2 != 16776960) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987] + (char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        return 1;
                    }
                    else {
                        if (n == 4113) {
                            final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                            final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                            final int n4 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            boolean b2;
                            if (VarcInt.isCharPrintable((char)n3, (byte)4)) {
                                if (n2 != 16776960) {
                                    throw new IllegalStateException();
                                }
                                b2 = true;
                            }
                            else {
                                b2 = false;
                            }
                            interpreter_intStack[n4] = (b2 ? 1 : 0);
                            return 1;
                        }
                        if (n == 4114) {
                            if (n2 != 16776960) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (MenuAction.isAlphaNumeric((char)Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -591876497) ? 1 : 0);
                            return 1;
                        }
                        else {
                            if (4115 == n) {
                                final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                                final int n6 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                boolean b3;
                                if (class134.isCharAlphabetic((char)n5, (byte)3)) {
                                    if (n2 != 16776960) {
                                        throw new IllegalStateException();
                                    }
                                    b3 = true;
                                }
                                else {
                                    b3 = false;
                                }
                                interpreter_intStack2[n6] = (b3 ? 1 : 0);
                                return 1;
                            }
                            if (n == 4116) {
                                if (n2 != 16776960) {
                                    throw new IllegalStateException();
                                }
                                final int n7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                final int[] interpreter_intStack3 = Interpreter.Interpreter_intStack;
                                final int n8 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                boolean b4;
                                if (class149.isDigit((char)n7, 1560581975)) {
                                    if (n2 != 16776960) {
                                        throw new IllegalStateException();
                                    }
                                    b4 = true;
                                }
                                else {
                                    b4 = false;
                                }
                                interpreter_intStack3[n8] = (b4 ? 1 : 0);
                                return 1;
                            }
                            else {
                                if (n == 4117) {
                                    final String s7 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                                    if (null != s7) {
                                        if (n2 != 16776960) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = s7.length();
                                    }
                                    else {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                    }
                                    return 1;
                                }
                                if (4118 == n) {
                                    final String s8 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                                    Interpreter.Interpreter_intStackSize -= 854271946;
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s8.substring(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
                                    return 1;
                                }
                                if (4119 == n) {
                                    if (n2 != 16776960) {
                                        throw new IllegalStateException();
                                    }
                                    final String s9 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                                    final StringBuilder sb = new StringBuilder(s9.length());
                                    boolean b5 = false;
                                    for (int i = 0; i < s9.length(); ++i) {
                                        if (n2 != 16776960) {
                                            throw new IllegalStateException();
                                        }
                                        final char char1 = s9.charAt(i);
                                        if ('<' == char1) {
                                            if (n2 != 16776960) {
                                                throw new IllegalStateException();
                                            }
                                            b5 = true;
                                        }
                                        else if (char1 == '>') {
                                            b5 = false;
                                        }
                                        else if (!b5) {
                                            if (n2 != 16776960) {
                                                throw new IllegalStateException();
                                            }
                                            sb.append(char1);
                                        }
                                    }
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = sb.toString();
                                    return 1;
                                }
                                else if (4120 == n) {
                                    if (n2 != 16776960) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].indexOf(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                                    return 1;
                                }
                                else if (4121 == n) {
                                    if (n2 != 16776960) {
                                        throw new IllegalStateException();
                                    }
                                    SecureRandomCallable.Interpreter_stringStackSize -= 2121864538;
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_stringStack[-2017760987 * SecureRandomCallable.Interpreter_stringStackSize].indexOf(Interpreter.Interpreter_stringStack[1 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                                    return 1;
                                }
                                else if (4122 == n) {
                                    if (n2 != 16776960) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987].toUpperCase();
                                    return 1;
                                }
                                else {
                                    if (n != 4123) {
                                        return 2;
                                    }
                                    if (n2 != 16776960) {
                                        throw new IllegalStateException();
                                    }
                                    SecureRandomCallable.Interpreter_stringStackSize -= 1035313159;
                                    final String s10 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                                    final String s11 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize * -2017760987 + 1];
                                    final String s12 = Interpreter.Interpreter_stringStack[2 + SecureRandomCallable.Interpreter_stringStackSize * -2017760987];
                                    if (null != MusicPatchNode.localPlayer.appearance) {
                                        switch (-1004049459 * MusicPatchNode.localPlayer.appearance.field2840) {
                                            case 0: {
                                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s10;
                                                break;
                                            }
                                            case 1: {
                                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s11;
                                                break;
                                            }
                                            default: {
                                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s12;
                                                break;
                                            }
                                        }
                                        return 1;
                                    }
                                    if (n2 != 16776960) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = s12;
                                    return 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cm.bz(" + ')');
        }
    }
    
    public static int iz(final class379 class379, final class381 class380, final boolean b) {
        if (class379 == null) {
            class379.en();
        }
        if (class380.field3624 == '\n') {
            return 0;
        }
        if (!b && 0 != class379.field3621 * 756045878) {
            return class379.field3612.advances[42];
        }
        final int n = class379.field3612.advances[class380.field3624];
        if (n != 0) {
            return n;
        }
        if ('\t' == class380.field3624) {
            return class379.field3612.advances[-586294513] * 3;
        }
        return class379.field3612.advances[-2014201034];
    }
}
