// 
// Decompiled by Procyon v0.5.36
// 

public final class oz
{
    public static final int ar = 32;
    static final int cx = -117;
    
    oz() throws Throwable {
        throw new Error();
    }
    
    public static String cs(final CharSequence charSequence) {
        return class14.method57('*', charSequence.length(), (byte)0);
    }
    
    public static boolean bs(final char c) {
        return c >= -1689025518 && c <= 1983436614;
    }
    
    public static boolean ca(final char c) {
        return (c >= -1261981793 && c <= -1963208788) || (c >= 695237545 && c <= '\u00ff') || -1160321801 == c || c == -1899034157 || c == -61291813 || c == '\u0153' || '\u0178' == c;
    }
    
    public static int ad(final CharSequence charSequence) {
        return SecureRandomFuture.method456(charSequence, 10, true, (byte)(-50));
    }
    
    public static boolean ba(final char c) {
        return (c >= -781907723 && c <= 14957607) || (c >= -1216371571 && c <= 'Z') || (c >= -180772952 && c <= 1006565826);
    }
    
    public static int ae(final CharSequence charSequence) {
        return SecureRandomFuture.method456(charSequence, 10, true, (byte)(-110));
    }
    
    static String ce(final char c, final int n) {
        final char[] value = new char[n];
        for (int i = 0; i < n; ++i) {
            value[i] = c;
        }
        return new String(value);
    }
    
    public static int bb(final CharSequence charSequence, final int i, final boolean b) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("" + i);
        }
        boolean b2 = false;
        boolean b3 = false;
        int n = 0;
        final int length = charSequence.length();
        int j = 0;
    Label_0008_Outer:
        while (j < length) {
            int char1 = charSequence.charAt(j);
            while (true) {
                Label_0138: {
                    if (j != 0) {
                        break Label_0138;
                    }
                    if (45 == char1) {
                        b2 = true;
                    }
                    else if (43 != char1 || !b) {
                        break Label_0138;
                    }
                    ++j;
                    continue Label_0008_Outer;
                }
                if (char1 >= 48 && char1 <= 57) {
                    char1 -= 48;
                }
                else if (char1 >= 65 && char1 <= 90) {
                    char1 -= 55;
                }
                else {
                    if (char1 < 97 || char1 > 122) {
                        throw new NumberFormatException();
                    }
                    char1 -= 87;
                }
                if (char1 >= i) {
                    throw new NumberFormatException();
                }
                if (b2) {
                    char1 = -char1;
                }
                final int n2 = char1 + n * i;
                if (n != n2 / i) {
                    throw new NumberFormatException();
                }
                n = n2;
                b3 = true;
                continue;
            }
        }
        if (!b3) {
            throw new NumberFormatException();
        }
        return n;
    }
    
    public static boolean cn(final char c) {
        return (c >= ' ' && c <= '~') || (c >= ' ' && c <= '\u00ff') || ('\u20ac' == c || c == '\u0152' || (c == '\u2014' || c == '\u0153') || '\u0178' == c);
    }
    
    static String bw(final char c, final int n) {
        final char[] value = new char[n];
        for (int i = 0; i < n; ++i) {
            value[i] = c;
        }
        return new String(value);
    }
    
    static boolean ak(final CharSequence charSequence, final int i, final boolean b) {
        if (i >= 2 && i <= 36) {
            boolean b2 = false;
            boolean b3 = false;
            int n = 0;
            final int length = charSequence.length();
            int j = 0;
        Label_0060_Outer:
            while (j < length) {
                int char1 = charSequence.charAt(j);
                while (true) {
                    Label_0140: {
                        if (j != 0) {
                            break Label_0140;
                        }
                        if (45 == char1) {
                            b2 = true;
                        }
                        else if (char1 != 43 || !b) {
                            break Label_0140;
                        }
                        ++j;
                        continue Label_0060_Outer;
                    }
                    if (char1 >= 48 && char1 <= 57) {
                        char1 -= 48;
                    }
                    else if (char1 >= 65 && char1 <= 90) {
                        char1 -= 55;
                    }
                    else {
                        if (char1 < 97 || char1 > 122) {
                            return false;
                        }
                        char1 -= 87;
                    }
                    if (char1 >= i) {
                        return false;
                    }
                    if (b2) {
                        char1 = -char1;
                    }
                    final int n2 = i * n + char1;
                    if (n2 / i != n) {
                        return false;
                    }
                    n = n2;
                    b3 = true;
                    continue;
                }
            }
            return b3;
        }
        throw new IllegalArgumentException("" + i);
    }
    
    public static String av(final CharSequence[] array, final int n, final int n2) {
        if (0 == n2) {
            return "";
        }
        if (1 != n2) {
            final int n3 = n + n2;
            int capacity = 0;
            for (int i = n; i < n3; ++i) {
                final CharSequence charSequence = array[i];
                if (null == charSequence) {
                    capacity += 4;
                }
                else {
                    capacity += charSequence.length();
                }
            }
            final StringBuilder sb = new StringBuilder(capacity);
            for (int j = n; j < n3; ++j) {
                final CharSequence s = array[j];
                if (null == s) {
                    sb.append("null");
                }
                else {
                    sb.append(s);
                }
            }
            return sb.toString();
        }
        final CharSequence charSequence2 = array[n];
        if (null == charSequence2) {
            return "null";
        }
        return charSequence2.toString();
    }
    
    public static int be(final CharSequence charSequence, final int i, final boolean b) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("" + i);
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (int length = charSequence.length(), j = 0; j < length; ++j) {
            int char1 = charSequence.charAt(j);
            if (j == 0) {
                if (45 == char1) {
                    n = 1;
                    continue;
                }
                if (43 == char1 && b) {
                    continue;
                }
            }
            if (char1 >= 48 && char1 <= 57) {
                char1 -= 48;
            }
            else if (char1 >= 65 && char1 <= 90) {
                char1 -= 55;
            }
            else {
                if (char1 < 97 || char1 > 122) {
                    throw new NumberFormatException();
                }
                char1 -= 87;
            }
            if (char1 >= i) {
                throw new NumberFormatException();
            }
            if (n != 0) {
                char1 = -char1;
            }
            final int n4 = char1 + n3 * i;
            if (n3 != n4 / i) {
                throw new NumberFormatException();
            }
            n3 = n4;
            n2 = 1;
        }
        if (n2 == 0) {
            throw new NumberFormatException();
        }
        return n3;
    }
    
    public static String gf(final class20 class20) {
        if (class20 == null) {
            return class20.al();
        }
        return class20.field62;
    }
    
    static boolean as(final CharSequence charSequence, final int i, final boolean b) {
        if (i >= 2 && i <= 36) {
            boolean b2 = false;
            boolean b3 = false;
            int n = 0;
            final int length = charSequence.length();
            int j = 0;
        Label_0127_Outer:
            while (j < length) {
                int char1 = charSequence.charAt(j);
                while (true) {
                    Label_0147: {
                        if (j != 0) {
                            break Label_0147;
                        }
                        if (45 == char1) {
                            b2 = true;
                        }
                        else if (char1 != 43 || !b) {
                            break Label_0147;
                        }
                        ++j;
                        continue Label_0127_Outer;
                    }
                    if (char1 >= 760044662 && char1 <= 57) {
                        char1 -= 48;
                    }
                    else if (char1 >= 1285017536 && char1 <= 107723207) {
                        char1 -= 55;
                    }
                    else {
                        if (char1 < 1435325329 || char1 > -602169695) {
                            return false;
                        }
                        char1 -= 87;
                    }
                    if (char1 >= i) {
                        return false;
                    }
                    if (b2) {
                        char1 = -char1;
                    }
                    final int n2 = i * n + char1;
                    if (n2 / i != n) {
                        return false;
                    }
                    n = n2;
                    b3 = true;
                    continue;
                }
            }
            return b3;
        }
        throw new IllegalArgumentException("" + i);
    }
    
    public static int az(final CharSequence charSequence) {
        return SecureRandomFuture.method456(charSequence, 10, true, (byte)(-35));
    }
    
    public static int bi(final CharSequence charSequence, final int i, final boolean b) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("" + i);
        }
        boolean b2 = false;
        boolean b3 = false;
        int n = 0;
        for (int length = charSequence.length(), j = 0; j < length; ++j) {
            int char1 = charSequence.charAt(j);
            if (j == 0) {
                if (45 == char1) {
                    b2 = true;
                    continue;
                }
                if (43 == char1 && b) {
                    continue;
                }
            }
            if (char1 >= 48 && char1 <= 57) {
                char1 -= 48;
            }
            else if (char1 >= 65 && char1 <= 90) {
                char1 -= 55;
            }
            else {
                if (char1 < 97 || char1 > 122) {
                    throw new NumberFormatException();
                }
                char1 -= 87;
            }
            if (char1 >= i) {
                throw new NumberFormatException();
            }
            if (b2) {
                char1 = -char1;
            }
            final int n2 = char1 + n * i;
            if (n != n2 / i) {
                throw new NumberFormatException();
            }
            n = n2;
            b3 = true;
        }
        if (!b3) {
            throw new NumberFormatException();
        }
        return n;
    }
    
    public static String bv(final String s) {
        final int length = s.length();
        final char[] value = new char[length];
        int n = 2;
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            if (n == 0) {
                c = Character.toLowerCase(c);
            }
            else if (n == 2 || Character.isUpperCase(c)) {
                c = WorldMapSectionType.method1507(c, -1404038213);
            }
            if (Character.isLetter(c)) {
                n = 0;
            }
            else if (c != '.' && '?' != c && c != '!') {
                if (Character.isSpaceChar(c)) {
                    if (n != 2) {
                        n = 1;
                    }
                }
                else {
                    n = 1;
                }
            }
            else {
                n = 2;
            }
            value[i] = c;
        }
        return new String(value);
    }
    
    public static int ck(final int n) {
        if (n > 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        return 0;
    }
    
    public static String bo(final int i, final boolean b) {
        if (b && i >= 0) {
            int j = i;
            String string;
            if (b && j >= 0) {
                int n = 2;
                for (int k = j / 10; k != 0; k /= 10, ++n) {}
                final char[] value = new char[n];
                value[0] = '+';
                for (int l = n - 1; l > 0; --l) {
                    final int n2 = j;
                    j /= 10;
                    final int n3 = n2 - j * 10;
                    if (n3 >= 10) {
                        value[l] = (char)(n3 + 1721561052);
                    }
                    else {
                        value[l] = (char)(48 + n3);
                    }
                }
                string = new String(value);
            }
            else {
                string = Integer.toString(j, 10);
            }
            return string;
        }
        return Integer.toString(i);
    }
    
    public static String bp(final String s) {
        final int length = s.length();
        final char[] value = new char[length];
        int n = 2;
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            if (n == 0) {
                c = Character.toLowerCase(c);
            }
            else if (n == 2 || Character.isUpperCase(c)) {
                c = WorldMapSectionType.method1507(c, 493712177);
            }
            if (Character.isLetter(c)) {
                n = 0;
            }
            else if (c == '.' || '?' == c || c == '!') {
                n = 2;
            }
            else if (Character.isSpaceChar(c)) {
                if (n != 2) {
                    n = 1;
                }
            }
            else {
                n = 1;
            }
            value[i] = c;
        }
        return new String(value);
    }
    
    public static boolean cc(final char c) {
        return (c >= ' ' && c <= '~') || (c >= ' ' && c <= '\u00ff') || '\u20ac' == c || c == '\u0152' || c == '\u2014' || c == '\u0153' || '\u0178' == c;
    }
    
    public static int bt(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            n = (n << 5) - n + charSequence.charAt(i);
        }
        return n;
    }
    
    public static String bc(final String s) {
        final int length = s.length();
        final char[] value = new char[length];
        int n = 2;
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            if (n == 0) {
                c = Character.toLowerCase(c);
            }
            else if (n == 2 || Character.isUpperCase(c)) {
                c = WorldMapSectionType.method1507(c, -1563900840);
            }
            if (Character.isLetter(c)) {
                n = 0;
            }
            else if (c == '.' || -254729464 == c || c == '!') {
                n = 2;
            }
            else if (Character.isSpaceChar(c)) {
                if (n != 2) {
                    n = 1;
                }
            }
            else {
                n = 1;
            }
            value[i] = c;
        }
        return new String(value);
    }
    
    public static boolean br(final char c) {
        return c >= -178427903 && c <= -845411063;
    }
    
    public static String ci(final CharSequence charSequence) {
        return class14.method57('*', charSequence.length(), (byte)0);
    }
    
    public static boolean am(final CharSequence charSequence) {
        return UrlRequester.method668(charSequence, 10, true, (byte)33);
    }
    
    public static int cu(final int n) {
        if (n > 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        return 0;
    }
    
    public static boolean bq(final char c) {
        return (c >= '0' && c <= '9') || ((c >= 'A' && c <= 865021080) || (c >= -221738940 && c <= 663845168));
    }
    
    static String bh(final char c, final int n) {
        final char[] value = new char[n];
        for (int i = 0; i < n; ++i) {
            value[i] = c;
        }
        return new String(value);
    }
    
    public static int by(final CharSequence charSequence, final int i, final boolean b) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("" + i);
        }
        boolean b2 = false;
        boolean b3 = false;
        int n = 0;
        for (int length = charSequence.length(), j = 0; j < length; ++j) {
            int char1 = charSequence.charAt(j);
            if (j == 0) {
                if (45 == char1) {
                    b2 = true;
                    continue;
                }
                if (43 == char1 && b) {
                    continue;
                }
            }
            if (char1 >= 48 && char1 <= 57) {
                char1 -= 48;
            }
            else if (char1 >= 65 && char1 <= 90) {
                char1 -= 55;
            }
            else {
                if (char1 < 97 || char1 > 122) {
                    throw new NumberFormatException();
                }
                char1 -= 87;
            }
            if (char1 >= i) {
                throw new NumberFormatException();
            }
            if (b2) {
                char1 = -char1;
            }
            final int n2 = char1 + n * i;
            if (n != n2 / i) {
                throw new NumberFormatException();
            }
            n = n2;
            b3 = true;
        }
        if (!b3) {
            throw new NumberFormatException();
        }
        return n;
    }
    
    public static int bx(final CharSequence charSequence, final int i, final boolean b) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("" + i);
        }
        boolean b2 = false;
        boolean b3 = false;
        int n = 0;
        final int length = charSequence.length();
        int j = 0;
    Label_0135_Outer:
        while (j < length) {
            int char1 = charSequence.charAt(j);
            while (true) {
                Label_0144: {
                    if (j != 0) {
                        break Label_0144;
                    }
                    if (1619563670 == char1) {
                        b2 = true;
                    }
                    else if (43 != char1 || !b) {
                        break Label_0144;
                    }
                    ++j;
                    continue Label_0135_Outer;
                }
                if (char1 >= -860936335 && char1 <= 57) {
                    char1 -= 48;
                }
                else if (char1 >= 65 && char1 <= 1326413036) {
                    char1 -= 55;
                }
                else {
                    if (char1 < -2108673673 || char1 > 122) {
                        throw new NumberFormatException();
                    }
                    char1 -= 87;
                }
                if (char1 >= i) {
                    throw new NumberFormatException();
                }
                if (b2) {
                    char1 = -char1;
                }
                final int n2 = char1 + n * i;
                if (n != n2 / i) {
                    throw new NumberFormatException();
                }
                n = n2;
                b3 = true;
                continue;
            }
        }
        if (!b3) {
            throw new NumberFormatException();
        }
        return n;
    }
    
    public static boolean ar(final CharSequence charSequence) {
        return UrlRequester.method668(charSequence, 10, true, (byte)9);
    }
    
    public static int ap(final CharSequence charSequence) {
        return SecureRandomFuture.method456(charSequence, 10, true, (byte)(-62));
    }
    
    public static int bd(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            n = (n << 5) - n + class100.vmethod5708(charSequence.charAt(i), (byte)(-21));
        }
        return n;
    }
    
    public static boolean bg(final char c) {
        return c >= '0' && c <= '9';
    }
    
    public static boolean bn(final char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
    
    static boolean aj(final CharSequence charSequence, final int i, final boolean b) {
        if (i >= 2 && i <= 36) {
            int n = 0;
            boolean b2 = false;
            int n2 = 0;
            final int length = charSequence.length();
            int j = 0;
        Label_0058_Outer:
            while (j < length) {
                int char1 = charSequence.charAt(j);
                while (true) {
                    Label_0078: {
                        if (j != 0) {
                            break Label_0078;
                        }
                        if (45 == char1) {
                            n = 1;
                        }
                        else if (char1 != 43 || !b) {
                            break Label_0078;
                        }
                        ++j;
                        continue Label_0058_Outer;
                    }
                    if (char1 >= 48 && char1 <= 57) {
                        char1 -= 48;
                    }
                    else if (char1 >= 65 && char1 <= 90) {
                        char1 -= 55;
                    }
                    else {
                        if (char1 < 97 || char1 > 122) {
                            return false;
                        }
                        char1 -= 87;
                    }
                    if (char1 >= i) {
                        return false;
                    }
                    if (n != 0) {
                        char1 = -char1;
                    }
                    final int n3 = i * n2 + char1;
                    if (n3 / i != n2) {
                        return false;
                    }
                    n2 = n3;
                    b2 = true;
                    continue;
                }
            }
            return b2;
        }
        throw new IllegalArgumentException("" + i);
    }
    
    public static String bl(final String s) {
        final int length = s.length();
        final char[] value = new char[length];
        int n = 2;
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            if (n == 0) {
                c = Character.toLowerCase(c);
            }
            else if (n == 2 || Character.isUpperCase(c)) {
                c = WorldMapSectionType.method1507(c, -947716084);
            }
            if (Character.isLetter(c)) {
                n = 0;
            }
            else if (c == '.' || '?' == c || c == -659641502) {
                n = 2;
            }
            else if (Character.isSpaceChar(c)) {
                if (n != 2) {
                    n = 1;
                }
            }
            else {
                n = 1;
            }
            value[i] = c;
        }
        return new String(value);
    }
    
    public static String bz(final int i, final boolean b) {
        if (b && i >= 0) {
            int j = i;
            String string;
            if (b && j >= 0) {
                int n = 2;
                for (int k = j / 10; k != 0; k /= 10, ++n) {}
                final char[] value = new char[n];
                value[0] = '+';
                for (int l = n - 1; l > 0; --l) {
                    final int n2 = j;
                    j /= 10;
                    final int n3 = n2 - j * 10;
                    if (n3 >= 10) {
                        value[l] = (char)(n3 + 87);
                    }
                    else {
                        value[l] = (char)(48 + n3);
                    }
                }
                string = new String(value);
            }
            else {
                string = Integer.toString(j, 10);
            }
            return string;
        }
        return Integer.toString(i);
    }
    
    public static boolean bj(final char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
    
    public static int cq(final int n) {
        if (n > 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        return 0;
    }
    
    public static int bm(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            n = (n << 5) - n + class100.vmethod5708(charSequence.charAt(i), (byte)50);
        }
        return n;
    }
    
    public static int bk(final CharSequence charSequence, final int i, final boolean b) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("" + i);
        }
        boolean b2 = false;
        boolean b3 = false;
        int n = 0;
        for (int length = charSequence.length(), j = 0; j < length; ++j) {
            int char1 = charSequence.charAt(j);
            if (j == 0) {
                if (45 == char1) {
                    b2 = true;
                    continue;
                }
                if (43 == char1 && b) {
                    continue;
                }
            }
            if (char1 >= 48 && char1 <= 57) {
                char1 -= 48;
            }
            else if (char1 >= 65 && char1 <= 90) {
                char1 -= 55;
            }
            else {
                if (char1 < 97 || char1 > 122) {
                    throw new NumberFormatException();
                }
                char1 -= 87;
            }
            if (char1 >= i) {
                throw new NumberFormatException();
            }
            if (b2) {
                char1 = -char1;
            }
            final int n2 = char1 + n * i;
            if (n != n2 / i) {
                throw new NumberFormatException();
            }
            n = n2;
            b3 = true;
        }
        if (!b3) {
            throw new NumberFormatException();
        }
        return n;
    }
    
    public static boolean bf(final char c) {
        return (c >= 297342095 && c <= '9') || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 1583872949));
    }
    
    public static boolean bu(final char c) {
        return (c >= 1593104572 && c <= 813823336) || (c >= -1869433327 && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
