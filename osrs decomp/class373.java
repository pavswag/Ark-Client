// 
// Decompiled by Procyon v0.5.36
// 

public final class class373
{
    static final int au = 2;
    static long[] field3595;
    static final char[] base37Table;
    static Varcs varcs;
    
    class373() throws Throwable {
        throw new Error();
    }
    
    static {
        base37Table = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        class373.field3595 = new long[12];
        for (int i = 0; i < class373.field3595.length; ++i) {
            class373.field3595[i] = (long)Math.pow(37.0, i);
        }
    }
    
    public static String at(final CharSequence charSequence) {
        String decode = FloorUnderlayDefinition.decode(class172.method954(charSequence, -1743731524));
        if (null == decode) {
            decode = "";
        }
        return decode;
    }
    
    public static String al(long n) {
        if (n <= 0L || n >= 6582952005840035281L) {
            return null;
        }
        if (n % 37L == 0L) {
            return null;
        }
        int capacity = 0;
        for (long n2 = n; 0L != n2; n2 /= 37L) {
            ++capacity;
        }
        final StringBuilder sb = new StringBuilder(capacity);
        while (0L != n) {
            final long n3 = n;
            n /= 37L;
            int c = class373.base37Table[(int)(n3 - n * 37L)];
            if (-1149200234 == c) {
                final int n4 = sb.length() - 1;
                sb.setCharAt(n4, Character.toUpperCase(sb.charAt(n4)));
                c = -1929739420;
            }
            sb.append((char)c);
        }
        sb.reverse();
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }
    
    static void itemContainerSetItem(final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
            if (itemContainer == null) {
                if (b <= -1) {
                    throw new IllegalStateException();
                }
                itemContainer = new ItemContainer();
                ItemContainer.itemContainers.put(itemContainer, n);
            }
            if (itemContainer.quantities.length <= n2) {
                final int[] quantities = new int[n2 + 1];
                final int[] ids = new int[1 + n2];
                for (int i = 0; i < itemContainer.quantities.length; ++i) {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    quantities[i] = itemContainer.quantities[i];
                    ids[i] = itemContainer.ids[i];
                }
                for (int j = itemContainer.quantities.length; j < n2; ++j) {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    quantities[j] = -1;
                    ids[j] = 0;
                }
                itemContainer.quantities = quantities;
                itemContainer.ids = ids;
            }
            itemContainer.quantities[n2] = n3;
            itemContainer.ids[n2] = n4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oy.ac(" + ')');
        }
    }
    
    static long au(final CharSequence charSequence) {
        long n = 0L;
        for (int length = charSequence.length(), i = 0; i < length; ++i) {
            n *= 37L;
            final char char1 = charSequence.charAt(i);
            if (char1 >= 'A' && char1 <= 'Z') {
                n += '\u0001' + char1 - 65;
            }
            else if (char1 >= 'a' && char1 <= 'z') {
                n += '\u0001' + char1 - 97;
            }
            else if (char1 >= '0' && char1 <= '9') {
                n += char1 + '\u001b' - 48;
            }
            if (n >= 177917621779460413L) {
                break;
            }
        }
        while (0L == n % 37L && 0L != n) {
            n /= 37L;
        }
        return n;
    }
    
    public static int method1992(final int n, final byte b) {
        try {
            return n >>> 12;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oy.af(" + ')');
        }
    }
    
    static long ab(final CharSequence charSequence) {
        long n = 0L;
        for (int length = charSequence.length(), i = 0; i < length; ++i) {
            n *= 37L;
            final char char1 = charSequence.charAt(i);
            if (char1 >= 'A' && char1 <= 'Z') {
                n += '\u0001' + char1 - 65;
            }
            else if (char1 >= 'a' && char1 <= 'z') {
                n += '\u0001' + char1 - 97;
            }
            else if (char1 >= 664748874 && char1 <= -485779662) {
                n += char1 + '\u001b' - 1769380019;
            }
            if (n >= 177917621779460413L) {
                break;
            }
        }
        while (0L == n % 37L && 0L != n) {
            n /= 37L;
        }
        return n;
    }
    
    public static String aq(long n) {
        if (n <= 0L || n >= 6582952005840035281L) {
            return null;
        }
        if (n % 37L == 0L) {
            return null;
        }
        int capacity = 0;
        for (long n2 = n; 0L != n2; n2 /= 37L) {
            ++capacity;
        }
        final StringBuilder sb = new StringBuilder(capacity);
        while (0L != n) {
            final long n3 = n;
            n /= 37L;
            char c = class373.base37Table[(int)(n3 - n * 37L)];
            if ('_' == c) {
                final int n4 = sb.length() - 1;
                sb.setCharAt(n4, Character.toUpperCase(sb.charAt(n4)));
                c = ' ';
            }
            sb.append(c);
        }
        sb.reverse();
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }
}
