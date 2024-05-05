// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator9 extends AbstractUserComparator
{
    static final int aq = 1;
    final boolean reversed;
    
    public UserComparator9(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return ms(this, (Buddy)o, (Buddy)o2, 150312401);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "el.compare(" + ')');
        }
    }
    
    public static void it(final class314 class314, final boolean b) {
        if (class314 == null) {
            class314.ix();
        }
        if (class314.iq(class314, -478915985) && !b) {
            class314.method1762(Math.min(542296527 * class314.field2853, 1350344153 * class314.field2852), b, (byte)86);
        }
        else if (class314.field2852 * 1350344153 > 0) {
            class314.method1762(class314.field2852 * 1350344153 - 1, b, (byte)109);
        }
    }
    
    public static int ms(final UserComparator9 userComparator9, final Buddy buddy, final Buddy buddy2, final int n) {
        if (userComparator9 == null) {
            userComparator9.compareBuddy(buddy, buddy, n);
        }
        try {
            if (Client.worldId * -453810525 == buddy.world * 177258591) {
                if (n != 150312401) {
                    throw new IllegalStateException();
                }
                if (buddy2.world * 177258591 == Client.worldId * -453810525) {
                    if (n != 150312401) {
                        throw new IllegalStateException();
                    }
                    int n2;
                    if (userComparator9.reversed) {
                        if (n != 150312401) {
                            throw new IllegalStateException();
                        }
                        n2 = buddy.be(473993579).compareToTyped(buddy2.be(473993579), (byte)104);
                    }
                    else {
                        n2 = buddy2.be(473993579).compareToTyped(buddy.be(473993579), (byte)119);
                    }
                    return n2;
                }
            }
            return userComparator9.ao((User)buddy, (User)buddy2, 641920470);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "el.af(" + ')');
        }
    }
    
    int aw(final Buddy buddy, final Buddy buddy2) {
        if (Client.worldId * -453810525 == buddy.world * -2125712629 && buddy2.world * 972738267 == Client.worldId * -2130900176) {
            return this.reversed ? buddy.be(473993579).compareToTyped(buddy2.be(473993579), (byte)69) : buddy2.be(473993579).compareToTyped(buddy.be(473993579), (byte)75);
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    public int al(final Object o, final Object o2) {
        return ms(this, (Buddy)o, (Buddy)o2, 150312401);
    }
    
    public int au(final Object o, final Object o2) {
        return ms(this, (Buddy)o, (Buddy)o2, 150312401);
    }
    
    int compareBuddy(final Buddy buddy, final Buddy buddy2, final int n) {
        try {
            if (Client.wd * -453810525 == buddy.rank * 177258591) {
                if (n != 150312401) {
                    throw new IllegalStateException();
                }
                if (buddy2.int2 * 177258591 == Client.bg * -453810525) {
                    if (n != 150312401) {
                        throw new IllegalStateException();
                    }
                    int n2;
                    if (this.reversed) {
                        if (n != 150312401) {
                            throw new IllegalStateException();
                        }
                        n2 = buddy.be(473993579).compareToTyped(buddy2.be(473993579), (byte)104);
                    }
                    else {
                        n2 = buddy2.be(473993579).compareToTyped(buddy.be(473993579), (byte)119);
                    }
                    return n2;
                }
            }
            return this.ao((User)buddy, (User)buddy2, 641920470);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "el.af(" + ')');
        }
    }
    
    static void compareBuddy(final int n) {
        try {
            if (class441.field3833 == null) {
                class441.field3833 = new int[65536];
                final double b = 0.949999988079071;
                for (int i = 0; i < 65536; ++i) {
                    if (n >= 1658005443) {
                        throw new IllegalStateException();
                    }
                    final double n2 = 0.0078125 + (i >> 10 & 0x3F) / 64.0;
                    final double n3 = (i >> 7 & 0x7) / 8.0 + 0.0625;
                    double a3;
                    double a2;
                    double a;
                    final double n4 = a = (a2 = (a3 = (i & 0x7F) / 128.0));
                    if (n3 != 0.0) {
                        if (n >= 1658005443) {
                            throw new IllegalStateException();
                        }
                        double n5;
                        if (n4 < 0.5) {
                            if (n >= 1658005443) {
                                throw new IllegalStateException();
                            }
                            n5 = n4 * (1.0 + n3);
                        }
                        else {
                            n5 = n3 + n4 - n3 * n4;
                        }
                        final double n6 = n4 * 2.0 - n5;
                        double n7 = 0.3333333333333333 + n2;
                        if (n7 > 1.0) {
                            if (n >= 1658005443) {
                                throw new IllegalStateException();
                            }
                            --n7;
                        }
                        final double n8 = n2;
                        double n9 = n2 - 0.3333333333333333;
                        if (n9 < 0.0) {
                            if (n >= 1658005443) {
                                throw new IllegalStateException();
                            }
                            ++n9;
                        }
                        if (6.0 * n7 < 1.0) {
                            a3 = n6 + n7 * (6.0 * (n5 - n6));
                        }
                        else if (n7 * 2.0 < 1.0) {
                            if (n >= 1658005443) {
                                throw new IllegalStateException();
                            }
                            a3 = n5;
                        }
                        else if (3.0 * n7 < 2.0) {
                            if (n >= 1658005443) {
                                throw new IllegalStateException();
                            }
                            a3 = n6 + 6.0 * ((n5 - n6) * (0.6666666666666666 - n7));
                        }
                        else {
                            a3 = n6;
                        }
                        if (6.0 * n8 < 1.0) {
                            a2 = 6.0 * (n5 - n6) * n8 + n6;
                        }
                        else if (2.0 * n8 < 1.0) {
                            if (n >= 1658005443) {
                                throw new IllegalStateException();
                            }
                            a2 = n5;
                        }
                        else if (3.0 * n8 < 2.0) {
                            if (n >= 1658005443) {
                                throw new IllegalStateException();
                            }
                            a2 = (n5 - n6) * (0.6666666666666666 - n8) * 6.0 + n6;
                        }
                        else {
                            a2 = n6;
                        }
                        if (n9 * 6.0 < 1.0) {
                            if (n >= 1658005443) {
                                return;
                            }
                            a = n9 * (6.0 * (n5 - n6)) + n6;
                        }
                        else if (n9 * 2.0 < 1.0) {
                            a = n5;
                        }
                        else if (3.0 * n9 < 2.0) {
                            if (n >= 1658005443) {
                                throw new IllegalStateException();
                            }
                            a = 6.0 * ((0.6666666666666666 - n9) * (n5 - n6)) + n6;
                        }
                        else {
                            a = n6;
                        }
                    }
                    class441.field3833[i] = (((int)(256.0 * Math.pow(a3, b)) << 16) + ((int)(Math.pow(a2, b) * 256.0) << 8) + (int)(Math.pow(a, b) * 256.0) & 0xFFFFFF);
                }
                return;
            }
            if (n >= 1658005443) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "el.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return ms(this, (Buddy)o, (Buddy)o2, 150312401);
    }
    
    static class127 method705(final int n, final int n2) {
        try {
            class127 field1252 = (class127)StructComposition.findEnumerated(class121.method721((byte)127), n, (short)173);
            if (null == field1252) {
                if (n2 >= 158134841) {
                    throw new IllegalStateException();
                }
                field1252 = class127.field1252;
            }
            return field1252;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "el.aq(" + ')');
        }
    }
    
    public int method705(final Object o, final Object o2) {
        return ms(this, (Buddy)o, (Buddy)o2, 150312401);
    }
    
    public static int yf(final UserComparator9 userComparator9, final Buddy buddy, final Buddy buddy2) {
        if (userComparator9 == null) {
            return userComparator9.aw(buddy, buddy);
        }
        if (Client.worldId * -453810525 == buddy.world * 177258591 && buddy2.world * 177258591 == Client.worldId * -453810525) {
            return userComparator9.reversed ? buddy.be(473993579).compareToTyped(buddy2.be(473993579), (byte)45) : buddy2.be(473993579).compareToTyped(buddy.be(473993579), (byte)48);
        }
        return userComparator9.ao((User)buddy, (User)buddy2, 641920470);
    }
}
