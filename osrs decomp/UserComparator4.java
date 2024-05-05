import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator4 implements Comparator
{
    public static final int ai = 16;
    final boolean reversed;
    public static final int br = 64;
    static final int wk = 5;
    static int[] Tiles_hueMultiplier;
    
    public UserComparator4(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ej.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compare_bridged((Buddy)o, (Buddy)o2, (byte)54);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ej.compare(" + ')');
        }
    }
    
    static int method683(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (5306 == n) {
                if (n2 >= -1468900217) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = GrandExchangeOfferNameComparator.getWindowedMode(631520575);
                return 1;
            }
            else if (5307 == n) {
                if (n2 >= -1468900217) {
                    throw new IllegalStateException();
                }
                final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                if (n3 != 1) {
                    if (n2 >= -1468900217) {
                        throw new IllegalStateException();
                    }
                    if (n3 != 2) {
                        return 1;
                    }
                    if (n2 >= -1468900217) {
                        throw new IllegalStateException();
                    }
                }
                Decimator.setWindowedMode(n3, (byte)(-80));
                return 1;
            }
            else if (5308 == n) {
                if (n2 >= -1468900217) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class20.clientPreferences.method577((byte)106);
                return 1;
            }
            else if (5309 == n) {
                if (n2 >= -1468900217) {
                    throw new IllegalStateException();
                }
                final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                if (n4 == 0) {
                    if (n2 >= -1468900217) {
                        throw new IllegalStateException();
                    }
                    if (n4 != 2) {
                        return 1;
                    }
                }
                ClientPreferences.uk(class20.clientPreferences, n4, 1521769017);
                return 1;
            }
            else {
                if (5310 == n) {
                    Interpreter.Interpreter_intStackSize -= 427135973;
                    return 1;
                }
                return 2;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ej.bt(" + ')');
        }
    }
    
    int aw(final Buddy buddy, final Buddy buddy2) {
        return this.reversed ? (1907692493 * buddy.int2 - 1907692493 * buddy2.int2) : (buddy2.int2 * 1907692493 - 1907692493 * buddy.int2);
    }
    
    int an(final Buddy buddy, final Buddy buddy2) {
        return this.reversed ? (1336987454 * buddy.int2 - 350638117 * buddy2.int2) : (buddy2.int2 * 1907692493 - 1907692493 * buddy.int2);
    }
    
    static void method681(final Buffer buffer, final int n, final byte b) {
        try {
            final byte[] array = buffer.array;
            if (null == Client.randomDatData) {
                Client.randomDatData = new byte[24];
            }
            class384.writeRandomDat(array, n, Client.randomDatData, 0, 24);
            ObjTypeCustomisation.method972(buffer, n, -1564700734);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ej.nc(" + ')');
        }
    }
    
    int ac(final Buddy buddy, final Buddy buddy2) {
        return this.reversed ? (1907692493 * buddy.int2 - 1907692493 * buddy2.int2) : (buddy2.int2 * 1907692493 - 1907692493 * buddy.int2);
    }
    
    public boolean gk(final Object obj) {
        return super.equals(obj);
    }
    
    public int method685(final Object o, final Object o2) {
        return this.compare_bridged((Buddy)o, (Buddy)o2, (byte)29);
    }
    
    static AttackOption[] method685(final byte b) {
        try {
            return new AttackOption[] { AttackOption.field1073, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1070, AttackOption.AttackOption_hidden };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ej.au(" + ')');
        }
    }
    
    public static int tx(final UserComparator4 userComparator4, final Buddy buddy, final Buddy buddy2) {
        if (userComparator4 == null) {
            return userComparator4.an(buddy, buddy);
        }
        return userComparator4.reversed ? (1907692493 * buddy.int2 - 1907692493 * buddy2.int2) : (buddy2.int2 * 1907692493 - 1907692493 * buddy.int2);
    }
    
    int aa(final Buddy buddy, final Buddy buddy2) {
        return this.reversed ? (1907692493 * buddy.int2 - 1907692493 * buddy2.int2) : (buddy2.int2 * 1907692493 - 1907692493 * buddy.int2);
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    public static int wp(final class97 class97) {
        return -15545254 * class97.field1065;
    }
    
    public static class3 compare_bridged(final class6 class6, final int n) {
        try {
            switch (class6.field10 * -1098467785) {
                case 0: {
                    return new class0();
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ej.af(" + ')');
        }
    }
    
    int compare_bridged(final Buddy buddy, final Buddy buddy2, final byte b) {
        try {
            int n;
            if (this.reversed) {
                if (b <= 14) {
                    throw new IllegalStateException();
                }
                n = 1907692493 * buddy.int2 - 1907692493 * buddy2.int2;
            }
            else {
                n = buddy2.int2 * 1907692493 - 1907692493 * buddy.int2;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ej.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return this.compare_bridged((Buddy)o, (Buddy)o2, (byte)79);
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compare_bridged((Buddy)o, (Buddy)o2, (byte)57);
    }
    
    public static int yy(final UserComparator4 userComparator4, final Object o, final Object o2) {
        if (userComparator4 == null) {
            return userComparator4.ab(o, o);
        }
        return userComparator4.compare_bridged((Buddy)o, (Buddy)o2, (byte)89);
    }
    
    public static Node wv(final NodeHashTable nodeHashTable, final long n) {
        if (nodeHashTable == null) {
            return nodeHashTable.next();
        }
        return nodeHashTable.at(n);
    }
    
    public boolean gq(final Object obj) {
        return super.equals(obj);
    }
    
    public static boolean wk(final UserComparator4 userComparator4, final Object obj) {
        if (userComparator4 == null) {
            userComparator4.gq(obj);
        }
        return userComparator4.equals(obj);
    }
}
