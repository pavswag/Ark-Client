// 
// Decompiled by Procyon v0.5.36
// 

public class class204
{
    public final int field1831;
    static final class204 field1832;
    static final class204 field1833;
    public static final class204 field1834;
    public static final class204 field1835;
    static final class204 field1836;
    public static final class204 field1837;
    public static final class204 field1838;
    public static final class204 field1839;
    public static final class204 field1840;
    static final class204 field1841;
    static final class204 field1842;
    public static final class204 field1843;
    static final class204 field1844;
    static final class204 field1845;
    static int field1846;
    public static final int cf = 84;
    public static final String ka = "";
    public static final String kj = "persists, please contact Jagex Support.";
    
    class204(final int n) {
        this(n, null);
    }
    
    class204(final int n, final class192 class192) {
        this.field1831 = -1022651463 * n;
    }
    
    static {
        field1832 = new class204(0);
        field1842 = new class204(1);
        field1833 = new class204(2);
        field1841 = new class204(3);
        field1835 = new class204(4, class192.field1613);
        field1836 = new class204(5);
        field1837 = new class204(6, class192.field1611);
        field1838 = new class204(7, class192.field1616);
        field1839 = new class204(8, class192.field1617);
        field1834 = new class204(9, class192.field1615);
        field1843 = new class204(10, class192.field1618);
        field1840 = new class204(11, class192.field1612);
        field1845 = new class204(12);
        field1844 = new class204(13);
    }
    
    public static void ch(final FloorUnderlayDefinition floorUnderlayDefinition) {
        floorUnderlayDefinition.setHsl(floorUnderlayDefinition.rgb * 86825461, -2063363905);
    }
    
    public static class425 lo(final class122 class122, final int n) {
        if (class122.field1186) {
            class122.field1196.method2252(class122.method732(n, 1029473925), 1864482861);
            class122.field1196.method2255(class122.bk(class122, (byte)2), 2030669590);
            class122.field1186 = false;
        }
        return class122.field1196;
    }
    
    static void method1136(final int n, final int n2, final int n3) {
        try {
            class138.method797(Language.tempMenuAction, n, n2, (byte)46);
            Language.tempMenuAction = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hp.mx(" + ')');
        }
    }
}
