import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class AbstractUserComparator implements Comparator
{
    public static final int au = 256;
    Comparator nextComparator;
    public static final int bc = 1012;
    static final int aj = 23;
    public static final int be = 0;
    static final int cb = 87;
    
    protected AbstractUserComparator() {
    }
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pz.equals(" + ')');
        }
    }
    
    protected final int compareUser(final User user, final User user2, final int n) {
        try {
            if (null != this.nextComparator) {
                return this.nextComparator.compare(user, user2);
            }
            if (n != 641920470) {
                throw new IllegalStateException();
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pz.ao(" + ')');
        }
    }
    
    protected final int av(final User user, final User user2) {
        if (null == this.nextComparator) {
            return 0;
        }
        return this.nextComparator.compare(user, user2);
    }
    
    final void ax(final Comparator nextComparator) {
        if (null == this.nextComparator) {
            this.nextComparator = nextComparator;
        }
        else if (this.nextComparator instanceof AbstractUserComparator) {
            ((AbstractUserComparator)this.nextComparator).addComparator(nextComparator, 2113600720);
        }
    }
    
    final void addComparator(final Comparator nextComparator, final int n) {
        try {
            if (null == this.nextComparator) {
                if (n <= 1241519468) {
                    throw new IllegalStateException();
                }
                this.nextComparator = nextComparator;
            }
            else if (this.nextComparator instanceof AbstractUserComparator) {
                if (n <= 1241519468) {
                    throw new IllegalStateException();
                }
                ((AbstractUserComparator)this.nextComparator).addComparator(nextComparator, 1512558066);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pz.ay(" + ')');
        }
    }
    
    public static boolean pb(final AbstractUserComparator abstractUserComparator, final Object obj) {
        if (abstractUserComparator == null) {
            abstractUserComparator.equals(obj);
        }
        return abstractUserComparator.equals(obj);
    }
    
    final void method2166(final Comparator nextComparator) {
        if (null == this.nextComparator) {
            this.nextComparator = nextComparator;
        }
        else if (this.nextComparator instanceof AbstractUserComparator) {
            ((AbstractUserComparator)this.nextComparator).addComparator(nextComparator, 2096041013);
        }
    }
    
    static int method2166(final int n, final Script script, final boolean b, final int n2) {
        try {
            Widget widget;
            if (b) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                widget = SoundSystem.scriptDotWidget;
            }
            else {
                widget = class1.scriptActiveWidget;
            }
            final Widget widget2 = widget;
            if (1600 == n) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1469632775 * widget2.scrollX;
                return 1;
            }
            else if (1601 == n) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1223232735 * widget2.scrollY;
                return 1;
            }
            else if (1602 == n) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                if (12 == widget2.type * 883712245) {
                    if (n2 <= -1447859756) {
                        throw new IllegalStateException();
                    }
                    final class314 method1815 = widget2.method1815((byte)47);
                    if (null != method1815) {
                        if (n2 <= -1447859756) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class379.mk(method1815.method1740(-2107075707), -1389348498);
                        return 1;
                    }
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget2.field2916;
                return 1;
            }
            else if (n == 1603) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget2.scrollWidth * -773060713;
                return 1;
            }
            else if (1604 == n) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1273374131 * widget2.scrollHeight;
                return 1;
            }
            else if (1605 == n) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 942674363 * widget2.modelZoom;
                return 1;
            }
            else if (n == 1606) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget2.modelAngleX * 797932055;
                return 1;
            }
            else if (1607 == n) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget2.modelAngleZ * -1023931993;
                return 1;
            }
            else if (1608 == n) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -480949115 * widget2.modelAngleY;
                return 1;
            }
            else if (1609 == n) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget2.transparencyTop * 1634279623;
                return 1;
            }
            else if (1610 == n) {
                if (n2 <= -1447859756) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget2.transparencyBot * 122284991;
                return 1;
            }
            else {
                if (n == 1611) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1409091639 * widget2.color;
                    return 1;
                }
                if (1612 == n) {
                    if (n2 <= -1447859756) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget2.color2 * 1449039161;
                    return 1;
                }
                else if (1613 == n) {
                    if (n2 <= -1447859756) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = widget2.fillMode.rsOrdinal(1216553831);
                    return 1;
                }
                else {
                    if (n == 1614) {
                        final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                        final int n3 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        boolean b2;
                        if (widget2.spriteFlipV) {
                            if (n2 <= -1447859756) {
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
                    if (1617 == n) {
                        if (n2 <= -1447859756) {
                            throw new IllegalStateException();
                        }
                        final class309 method1816 = widget2.method1817(-1740765458);
                        final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                        final int n4 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        int n5;
                        if (null != method1816) {
                            if (n2 <= -1447859756) {
                                throw new IllegalStateException();
                            }
                            n5 = -90398499 * method1816.field2817;
                        }
                        else {
                            n5 = 0;
                        }
                        interpreter_intStack2[n4] = n5;
                    }
                    if (n == 1618) {
                        if (n2 <= -1447859756) {
                            throw new IllegalStateException();
                        }
                        final class309 method1817 = widget2.method1817(-1740765458);
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1817) ? (216034339 * method1817.field2818) : 0);
                        return 1;
                    }
                    else if (n == 1619) {
                        if (n2 <= -1447859756) {
                            throw new IllegalStateException();
                        }
                        final class314 method1818 = widget2.method1815((byte)(-58));
                        final String[] interpreter_stringStack = Interpreter.Interpreter_stringStack;
                        final int n6 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                        String mk;
                        if (method1818 != null) {
                            if (n2 <= -1447859756) {
                                throw new IllegalStateException();
                            }
                            mk = class379.mk(method1818.method1741((byte)82), -1389348498);
                        }
                        else {
                            mk = "";
                        }
                        interpreter_stringStack[n6] = mk;
                        return 1;
                    }
                    else if (n == 1620) {
                        if (n2 <= -1447859756) {
                            throw new IllegalStateException();
                        }
                        final class309 method1819 = widget2.method1817(-1740765458);
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1819 != null) ? (1912484269 * method1819.field2816) : 0);
                        return 1;
                    }
                    else {
                        if (n == 1621) {
                            final class314 method1820 = widget2.method1815((byte)(-42));
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1820 != null) ? method1820.method1716(-1594572507) : 0);
                            return 1;
                        }
                        if (1622 == n) {
                            if (n2 <= -1447859756) {
                                throw new IllegalStateException();
                            }
                            final class314 method1821 = widget2.method1815((byte)(-13));
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1821) ? method1821.method1751(-2023379849) : 0);
                            return 1;
                        }
                        else if (1623 == n) {
                            if (n2 <= -1447859756) {
                                throw new IllegalStateException();
                            }
                            final class314 method1822 = widget2.method1815((byte)71);
                            final int[] interpreter_intStack3 = Interpreter.Interpreter_intStack;
                            final int n7 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            int method1823;
                            if (method1822 != null) {
                                if (n2 <= -1447859756) {
                                    throw new IllegalStateException();
                                }
                                method1823 = method1822.method1746(1424429838);
                            }
                            else {
                                method1823 = 0;
                            }
                            interpreter_intStack3[n7] = method1823;
                            return 1;
                        }
                        else if (n == 1624) {
                            if (n2 <= -1447859756) {
                                throw new IllegalStateException();
                            }
                            final class314 method1824 = widget2.method1815((byte)28);
                            final int[] interpreter_intStack4 = Interpreter.Interpreter_intStack;
                            final int n8 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            boolean b3 = false;
                            Label_1527: {
                                if (null != method1824) {
                                    if (n2 <= -1447859756) {
                                        throw new IllegalStateException();
                                    }
                                    if (class314.method1728(method1824, 2041324765)) {
                                        if (n2 <= -1447859756) {
                                            throw new IllegalStateException();
                                        }
                                        b3 = true;
                                        break Label_1527;
                                    }
                                }
                                b3 = false;
                            }
                            interpreter_intStack4[n8] = (b3 ? 1 : 0);
                            return 1;
                        }
                        else {
                            if (1625 == n) {
                                final class314 method1825 = widget2.method1815((byte)(-13));
                                final int[] interpreter_intStack5 = Interpreter.Interpreter_intStack;
                                final int n9 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                boolean b4 = false;
                                Label_1744: {
                                    if (method1825 != null) {
                                        if (n2 <= -1447859756) {
                                            throw new IllegalStateException();
                                        }
                                        if (method1825.ed(1994580892)) {
                                            if (n2 <= -1447859756) {
                                                throw new IllegalStateException();
                                            }
                                            b4 = true;
                                            break Label_1744;
                                        }
                                    }
                                    b4 = false;
                                }
                                interpreter_intStack5[n9] = (b4 ? 1 : 0);
                                return 1;
                            }
                            if (1626 == n) {
                                final class314 method1826 = widget2.method1815((byte)18);
                                final String[] interpreter_stringStack2 = Interpreter.Interpreter_stringStack;
                                final int n10 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                                String method1827;
                                if (method1826 != null) {
                                    if (n2 <= -1447859756) {
                                        throw new IllegalStateException();
                                    }
                                    method1827 = class314.method1751(method1826, 2061234095).method2083(-48485402);
                                }
                                else {
                                    method1827 = "";
                                }
                                interpreter_stringStack2[n10] = method1827;
                                return 1;
                            }
                            if (n == 1627) {
                                final class314 method1828 = widget2.method1815((byte)(-22));
                                int method1829;
                                if (method1828 != null) {
                                    if (n2 <= -1447859756) {
                                        throw new IllegalStateException();
                                    }
                                    method1829 = method1828.method1753(185275246);
                                }
                                else {
                                    method1829 = 0;
                                }
                                final int n11 = method1829;
                                int method1830;
                                if (method1828 != null) {
                                    if (n2 <= -1447859756) {
                                        throw new IllegalStateException();
                                    }
                                    method1830 = method1828.method1769(-1954829467);
                                }
                                else {
                                    method1830 = 0;
                                }
                                final int n12 = method1830;
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.min(n11, n12);
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.max(n11, n12);
                                return 1;
                            }
                            if (1628 == n) {
                                if (n2 <= -1447859756) {
                                    throw new IllegalStateException();
                                }
                                final class314 method1831 = widget2.method1815((byte)106);
                                final int[] interpreter_intStack6 = Interpreter.Interpreter_intStack;
                                final int n13 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                int method1832;
                                if (method1831 != null) {
                                    if (n2 <= -1447859756) {
                                        throw new IllegalStateException();
                                    }
                                    method1832 = method1831.method1769(-607168069);
                                }
                                else {
                                    method1832 = 0;
                                }
                                interpreter_intStack6[n13] = method1832;
                                return 1;
                            }
                            else if (1629 == n) {
                                if (n2 <= -1447859756) {
                                    throw new IllegalStateException();
                                }
                                final class314 method1833 = widget2.method1815((byte)91);
                                final int[] interpreter_intStack7 = Interpreter.Interpreter_intStack;
                                final int n14 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                int method1834;
                                if (null != method1833) {
                                    if (n2 <= -1447859756) {
                                        throw new IllegalStateException();
                                    }
                                    method1834 = method1833.method1781(-1783004580);
                                }
                                else {
                                    method1834 = 0;
                                }
                                interpreter_intStack7[n14] = method1834;
                                return 1;
                            }
                            else if (n == 1630) {
                                if (n2 <= -1447859756) {
                                    throw new IllegalStateException();
                                }
                                final class314 method1835 = widget2.method1815((byte)(-92));
                                final int[] interpreter_intStack8 = Interpreter.Interpreter_intStack;
                                final int n15 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                int method1836;
                                if (method1835 != null) {
                                    if (n2 <= -1447859756) {
                                        throw new IllegalStateException();
                                    }
                                    method1836 = method1835.method1752((byte)(-8));
                                }
                                else {
                                    method1836 = 0;
                                }
                                interpreter_intStack8[n15] = method1836;
                                return 1;
                            }
                            else {
                                if (1631 == n) {
                                    final class314 method1837 = widget2.method1815((byte)(-12));
                                    final int[] interpreter_intStack9 = Interpreter.Interpreter_intStack;
                                    final int n16 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                    int ww;
                                    if (null != method1837) {
                                        if (n2 <= -1447859756) {
                                            throw new IllegalStateException();
                                        }
                                        ww = class314.ww(method1837, 2117890366);
                                    }
                                    else {
                                        ww = 0;
                                    }
                                    interpreter_intStack9[n16] = ww;
                                    return 1;
                                }
                                if (1632 == n) {
                                    if (n2 <= -1447859756) {
                                        throw new IllegalStateException();
                                    }
                                    final class314 method1838 = widget2.method1815((byte)(-1));
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1838) ? class314.ve(method1838, (byte)(-72)) : 0);
                                    return 1;
                                }
                                else {
                                    if (n == 1633) {
                                        final class27 method1839 = widget2.method1795(2023248091);
                                        final int[] interpreter_intStack10 = Interpreter.Interpreter_intStack;
                                        final int n17 = -964267539 * Interpreter.Interpreter_intStackSize - 1;
                                        int be;
                                        if (null != method1839) {
                                            if (n2 <= -1447859756) {
                                                throw new IllegalStateException();
                                            }
                                            be = class27.be(method1839, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1], -428082252);
                                        }
                                        else {
                                            be = 0;
                                        }
                                        interpreter_intStack10[n17] = be;
                                        return 1;
                                    }
                                    if (1634 != n) {
                                        return 2;
                                    }
                                    if (n2 <= -1447859756) {
                                        throw new IllegalStateException();
                                    }
                                    final class27 method1840 = widget2.method1795(1982086369);
                                    final int[] interpreter_intStack11 = Interpreter.Interpreter_intStack;
                                    final int n18 = -964267539 * Interpreter.Interpreter_intStackSize - 1;
                                    int bh;
                                    if (method1840 != null) {
                                        if (n2 <= -1447859756) {
                                            throw new IllegalStateException();
                                        }
                                        bh = class27.bh(method1840, (char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1], (byte)32);
                                    }
                                    else {
                                        bh = 0;
                                    }
                                    interpreter_intStack11[n18] = bh;
                                    return 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pz.ai(" + ')');
        }
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    final void ag(final Comparator nextComparator) {
        if (null == this.nextComparator) {
            this.nextComparator = nextComparator;
        }
        else if (this.nextComparator instanceof AbstractUserComparator) {
            ((AbstractUserComparator)this.nextComparator).addComparator(nextComparator, 1622868696);
        }
    }
    
    public boolean gm(final Object obj) {
        return super.equals(obj);
    }
    
    public boolean gq(final Object obj) {
        return super.equals(obj);
    }
    
    final void ah(final Comparator nextComparator) {
        if (null == this.nextComparator) {
            this.nextComparator = nextComparator;
        }
        else if (this.nextComparator instanceof AbstractUserComparator) {
            ((AbstractUserComparator)this.nextComparator).addComparator(nextComparator, 1778817465);
        }
    }
}
