// 
// Decompiled by Procyon v0.5.36
// 

public class class282
{
    static final int af = 8388607;
    public static final int an = 8388607;
    public static final int dl = 112;
    static final int ap = 28;
    public static final int ab = 15;
    
    class282() throws Throwable {
        throw new Error();
    }
    
    public static void method1591(final Widget widget, final int n, final int n2) {
        try {
            final ItemComposition set = HealthBarUpdate.set(n, (byte)51);
            widget.field2894.field2841[-1935812527 * set.maleModel] = 512 + n;
            if (-1719338253 * set.maleModel1 != -1) {
                if (n2 >= -655350082) {
                    throw new IllegalStateException();
                }
                widget.field2894.field2841[set.maleModel1 * -1719338253] = 0;
            }
            if (set.maleModel2 * 723093341 != -1) {
                if (n2 >= -655350082) {
                    return;
                }
                widget.field2894.field2841[set.maleModel2 * 723093341] = 0;
            }
            widget.field2894.setHash(-469114674);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ks.ba(" + ')');
        }
    }
    
    static int method1589(final int n, final int n2, final int n3, final byte b) {
        try {
            return n << 28 | n2 << 14 | n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ks.an(" + ')');
        }
    }
    
    static int method1590(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (n == 6754) {
                if (n2 == -180772952) {
                    throw new IllegalStateException();
                }
                final NPCComposition npcDefinition = AbstractArchive.getNpcDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)1);
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = ((null != npcDefinition) ? npcDefinition.name : "");
                return 1;
            }
            else if (6764 == n) {
                if (n2 == -180772952) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                final NPCComposition npcDefinition2 = AbstractArchive.getNpcDefinition(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], (byte)(-21));
                final int n3 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = npcDefinition2.method1030(n3, (byte)123);
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = npcDefinition2.method1032(n3, 439788995);
                return 1;
            }
            else {
                if (n != 6765) {
                    return 2;
                }
                if (n2 == -180772952) {
                    throw new IllegalStateException();
                }
                final NPCComposition npcDefinition3 = AbstractArchive.getNpcDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)(-126));
                final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                final int n4 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                int n5;
                if (npcDefinition3 != null) {
                    if (n2 == -180772952) {
                        throw new IllegalStateException();
                    }
                    n5 = 2062903815 * npcDefinition3.combatLevel;
                }
                else {
                    n5 = 0;
                }
                interpreter_intStack[n4] = n5;
                return 1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ks.bq(" + ')');
        }
    }
    
    public static void method1592(final int n, final AbstractArchive abstractArchive, final String s, final String s2, final int n2, final boolean b, final int n3) {
        try {
            if (AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
                if (n3 == 741327699) {
                    throw new IllegalStateException();
                }
                final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, -1262984149);
                Actor.method538(n, abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), n2, b, -1238631827);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ks.ab(" + ')');
        }
    }
}
