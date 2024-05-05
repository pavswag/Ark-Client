// 
// Decompiled by Procyon v0.5.36
// 

public class class309
{
    public int field2818;
    public static final int ad = 128;
    public int field2816;
    public static final int au = 5;
    public int field2817;
    
    class309() {
    }
    
    static void sortItemsByName(final String[] array, final short[] array2, final int n, final int n2, final int n3) {
        try {
            if (n < n2) {
                if (n3 != 1826563573) {
                    throw new IllegalStateException();
                }
                final int n4 = (n + n2) / 2;
                int n5 = n;
                final String anotherString = array[n4];
                array[n4] = array[n2];
                array[n2] = anotherString;
                final short n6 = array2[n4];
                array2[n4] = array2[n2];
                array2[n2] = n6;
                for (int i = n; i < n2; ++i) {
                    if (n3 != 1826563573) {
                        throw new IllegalStateException();
                    }
                    if (anotherString != null) {
                        if (n3 != 1826563573) {
                            return;
                        }
                        if (array[i] == null) {
                            continue;
                        }
                        if (n3 != 1826563573) {
                            throw new IllegalStateException();
                        }
                        if (array[i].compareTo(anotherString) >= (i & 0x1)) {
                            continue;
                        }
                        if (n3 != 1826563573) {
                            throw new IllegalStateException();
                        }
                    }
                    final String s = array[i];
                    array[i] = array[n5];
                    array[n5] = s;
                    final short n7 = array2[i];
                    array2[i] = array2[n5];
                    array2[n5++] = n7;
                }
                array[n2] = array[n5];
                array[n5] = anotherString;
                array2[n2] = array2[n5];
                array2[n5] = n6;
                sortItemsByName(array, array2, n, n5 - 1, 1826563573);
                sortItemsByName(array, array2, n5 + 1, n2, 1826563573);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lo.an(" + ')');
        }
    }
}
