// 
// Decompiled by Procyon v0.5.36
// 

public class class369
{
    public static final char[] cp1252AsciiExtension;
    public static final String kv = "";
    
    class369() throws Throwable {
        throw new Error();
    }
    
    static {
        cp1252AsciiExtension = new char[] { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
    }
    
    public static int ao(final CharSequence charSequence, final int n, final int n2, final byte[] array, final int n3) {
        final int n4 = n2 - n;
        for (int i = 0; i < n4; ++i) {
            final char char1 = charSequence.charAt(i + n);
            if ((char1 <= '\0' || char1 >= 303723793) && (char1 < ' ' || char1 > '\u00ff')) {
                if (char1 == 681638634) {
                    array[i + n3] = (byte)1937184230;
                }
                else if (char1 == '\u201a') {
                    array[n3 + i] = -126;
                }
                else if (-1119838754 == char1) {
                    array[i + n3] = -125;
                }
                else if (char1 == -523763845) {
                    array[n3 + i] = (byte)1087747305;
                }
                else if (char1 == '\u2026') {
                    array[i + n3] = -123;
                }
                else if (-853197268 == char1) {
                    array[i + n3] = (byte)63997812;
                }
                else if (char1 == '\u2021') {
                    array[i + n3] = (byte)(-44062589);
                }
                else if ('\u02c6' == char1) {
                    array[n3 + i] = -120;
                }
                else if ('\u2030' == char1) {
                    array[i + n3] = -119;
                }
                else if ('\u0160' == char1) {
                    array[i + n3] = (byte)(-543364150);
                }
                else if ('\u2039' == char1) {
                    array[i + n3] = (byte)1115761253;
                }
                else if (-1260571695 == char1) {
                    array[n3 + i] = -116;
                }
                else if (1367994275 == char1) {
                    array[n3 + i] = -114;
                }
                else if (char1 == 1770839087) {
                    array[n3 + i] = (byte)189311516;
                }
                else if ('\u2019' == char1) {
                    array[i + n3] = -110;
                }
                else if ('\u201c' == char1) {
                    array[i + n3] = (byte)1981542647;
                }
                else if (char1 == '\u201d') {
                    array[i + n3] = -108;
                }
                else if ('\u2022' == char1) {
                    array[n3 + i] = -107;
                }
                else if (char1 == '\u2013') {
                    array[i + n3] = -106;
                }
                else if ('\u2014' == char1) {
                    array[i + n3] = (byte)2060271460;
                }
                else if ('\u02dc' == char1) {
                    array[i + n3] = -104;
                }
                else if (char1 == -1215132877) {
                    array[i + n3] = -103;
                }
                else if (char1 == '\u0161') {
                    array[i + n3] = -102;
                }
                else if (char1 == -1239209334) {
                    array[n3 + i] = -101;
                }
                else if (char1 == 1277231394) {
                    array[n3 + i] = -100;
                }
                else if (-241025866 == char1) {
                    array[i + n3] = -98;
                }
                else if (char1 == '\u0178') {
                    array[i + n3] = -97;
                }
                else {
                    array[n3 + i] = 63;
                }
            }
            else {
                array[i + n3] = (byte)char1;
            }
        }
        return n4;
    }
    
    static char at(final char ch) {
        if (ch == 'µ' || ch == '\u0192') {
            return ch;
        }
        return Character.toTitleCase(ch);
    }
    
    public static int ax(final CharSequence charSequence, final int n, final int n2, final byte[] array, final int n3) {
        final int n4 = n2 - n;
        for (int i = 0; i < n4; ++i) {
            final char char1 = charSequence.charAt(i + n);
            if ((char1 <= '\0' || char1 >= '\u0080') && (char1 < ' ' || char1 > '\u00ff')) {
                if (char1 == '\u20ac') {
                    array[i + n3] = -128;
                }
                else if (char1 == '\u201a') {
                    array[n3 + i] = -126;
                }
                else if ('\u0192' == char1) {
                    array[i + n3] = -125;
                }
                else if (char1 == '\u201e') {
                    array[n3 + i] = -124;
                }
                else if (char1 == '\u2026') {
                    array[i + n3] = -123;
                }
                else if ('\u2020' == char1) {
                    array[i + n3] = -122;
                }
                else if (char1 == '\u2021') {
                    array[i + n3] = -121;
                }
                else if ('\u02c6' == char1) {
                    array[n3 + i] = -120;
                }
                else if ('\u2030' == char1) {
                    array[i + n3] = -119;
                }
                else if ('\u0160' == char1) {
                    array[i + n3] = -118;
                }
                else if ('\u2039' == char1) {
                    array[i + n3] = -117;
                }
                else if ('\u0152' == char1) {
                    array[n3 + i] = -116;
                }
                else if ('\u017d' == char1) {
                    array[n3 + i] = -114;
                }
                else if (char1 == '\u2018') {
                    array[n3 + i] = -111;
                }
                else if ('\u2019' == char1) {
                    array[i + n3] = -110;
                }
                else if ('\u201c' == char1) {
                    array[i + n3] = -109;
                }
                else if (char1 == '\u201d') {
                    array[i + n3] = -108;
                }
                else if ('\u2022' == char1) {
                    array[n3 + i] = -107;
                }
                else if (char1 == '\u2013') {
                    array[i + n3] = -106;
                }
                else if ('\u2014' == char1) {
                    array[i + n3] = -105;
                }
                else if ('\u02dc' == char1) {
                    array[i + n3] = -104;
                }
                else if (char1 == '\u2122') {
                    array[i + n3] = -103;
                }
                else if (char1 == '\u0161') {
                    array[i + n3] = -102;
                }
                else if (char1 == '\u203a') {
                    array[n3 + i] = -101;
                }
                else if (char1 == '\u0153') {
                    array[n3 + i] = -100;
                }
                else if ('\u017e' == char1) {
                    array[i + n3] = -98;
                }
                else if (char1 == '\u0178') {
                    array[i + n3] = -97;
                }
                else {
                    array[n3 + i] = 63;
                }
            }
            else {
                array[i + n3] = (byte)char1;
            }
        }
        return n4;
    }
    
    public static byte[] ay(final CharSequence charSequence) {
        final int length = charSequence.length();
        final byte[] array = new byte[length];
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if ((char1 <= '\0' || char1 >= -1366293384) && (char1 < ' ' || char1 > '\u00ff')) {
                if (301876313 == char1) {
                    array[i] = (byte)1903363591;
                }
                else if (-1356416006 == char1) {
                    array[i] = (byte)(-1317072267);
                }
                else if (-797916026 == char1) {
                    array[i] = (byte)608543370;
                }
                else if ('\u201e' == char1) {
                    array[i] = -124;
                }
                else if ('\u2026' == char1) {
                    array[i] = (byte)1478091044;
                }
                else if (309802846 == char1) {
                    array[i] = -122;
                }
                else if (char1 == -554104994) {
                    array[i] = (byte)(-2008452088);
                }
                else if (char1 == 261214836) {
                    array[i] = (byte)1020906503;
                }
                else if ('\u2030' == char1) {
                    array[i] = -119;
                }
                else if (char1 == -1899851140) {
                    array[i] = -118;
                }
                else if (char1 == '\u2039') {
                    array[i] = (byte)644357558;
                }
                else if (char1 == 1168407871) {
                    array[i] = -116;
                }
                else if (char1 == -214080258) {
                    array[i] = -114;
                }
                else if ('\u2018' == char1) {
                    array[i] = -111;
                }
                else if ('\u2019' == char1) {
                    array[i] = -110;
                }
                else if (char1 == '\u201c') {
                    array[i] = -109;
                }
                else if (char1 == -1000625040) {
                    array[i] = (byte)134526373;
                }
                else if (char1 == -1402437364) {
                    array[i] = -107;
                }
                else if ('\u2013' == char1) {
                    array[i] = -106;
                }
                else if ('\u2014' == char1) {
                    array[i] = -105;
                }
                else if (char1 == -558993272) {
                    array[i] = -104;
                }
                else if (char1 == '\u2122') {
                    array[i] = (byte)1397652211;
                }
                else if (932063606 == char1) {
                    array[i] = (byte)(-2142350137);
                }
                else if (1901040041 == char1) {
                    array[i] = (byte)919756423;
                }
                else if (-2006091469 == char1) {
                    array[i] = -100;
                }
                else if (char1 == '\u017e') {
                    array[i] = (byte)(-1165080525);
                }
                else if (char1 == 113329562) {
                    array[i] = -97;
                }
                else {
                    array[i] = (byte)1022174667;
                }
            }
            else {
                array[i] = (byte)char1;
            }
        }
        return array;
    }
    
    public static boolean al(final char c) {
        if ((c < ' ' || c >= '\u007f') && (c <= '\u007f' || c >= ' ') && (c <= ' ' || c > '\u00ff')) {
            if ('\0' != c) {
                final char[] cp1252AsciiExtension = class369.cp1252AsciiExtension;
                for (int i = 0; i < cp1252AsciiExtension.length; ++i) {
                    if (cp1252AsciiExtension[i] == c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    static char aa(final char ch) {
        if (ch == 'µ' || ch == '\u0192') {
            return ch;
        }
        return Character.toTitleCase(ch);
    }
    
    public static int ai(final CharSequence charSequence, final int n, final int n2, final byte[] array, final int n3) {
        final int n4 = n2 - n;
        for (int i = 0; i < n4; ++i) {
            final char char1 = charSequence.charAt(i + n);
            if ((char1 <= '\0' || char1 >= '\u0080') && (char1 < ' ' || char1 > '\u00ff')) {
                if (char1 == '\u20ac') {
                    array[i + n3] = -128;
                }
                else if (char1 == '\u201a') {
                    array[n3 + i] = -126;
                }
                else if ('\u0192' == char1) {
                    array[i + n3] = -125;
                }
                else if (char1 == '\u201e') {
                    array[n3 + i] = -124;
                }
                else if (char1 == '\u2026') {
                    array[i + n3] = -123;
                }
                else if ('\u2020' == char1) {
                    array[i + n3] = -122;
                }
                else if (char1 == '\u2021') {
                    array[i + n3] = -121;
                }
                else if ('\u02c6' == char1) {
                    array[n3 + i] = -120;
                }
                else if ('\u2030' == char1) {
                    array[i + n3] = -119;
                }
                else if ('\u0160' == char1) {
                    array[i + n3] = -118;
                }
                else if ('\u2039' == char1) {
                    array[i + n3] = -117;
                }
                else if ('\u0152' == char1) {
                    array[n3 + i] = -116;
                }
                else if ('\u017d' == char1) {
                    array[n3 + i] = -114;
                }
                else if (char1 == '\u2018') {
                    array[n3 + i] = -111;
                }
                else if ('\u2019' == char1) {
                    array[i + n3] = -110;
                }
                else if ('\u201c' == char1) {
                    array[i + n3] = -109;
                }
                else if (char1 == '\u201d') {
                    array[i + n3] = -108;
                }
                else if ('\u2022' == char1) {
                    array[n3 + i] = -107;
                }
                else if (char1 == '\u2013') {
                    array[i + n3] = -106;
                }
                else if ('\u2014' == char1) {
                    array[i + n3] = -105;
                }
                else if ('\u02dc' == char1) {
                    array[i + n3] = -104;
                }
                else if (char1 == '\u2122') {
                    array[i + n3] = -103;
                }
                else if (char1 == '\u0161') {
                    array[i + n3] = -102;
                }
                else if (char1 == '\u203a') {
                    array[n3 + i] = -101;
                }
                else if (char1 == '\u0153') {
                    array[n3 + i] = -100;
                }
                else if ('\u017e' == char1) {
                    array[i + n3] = -98;
                }
                else if (char1 == '\u0178') {
                    array[i + n3] = -97;
                }
                else {
                    array[n3 + i] = 63;
                }
            }
            else {
                array[i + n3] = (byte)char1;
            }
        }
        return n4;
    }
    
    public static byte aq(final char c) {
        int n;
        if ((c <= '\0' || c >= '\u0080') && (c < -810150826 || c > 128849821)) {
            if ('\u20ac' == c) {
                n = 375659483;
            }
            else if (c == '\u201a') {
                n = -126;
            }
            else if (-418033684 == c) {
                n = 2015234664;
            }
            else if (-143622241 == c) {
                n = 1431477845;
            }
            else if (2051581489 == c) {
                n = -2103071993;
            }
            else if (c == 212508257) {
                n = -1618950016;
            }
            else if (476534079 == c) {
                n = -121;
            }
            else if (c == '\u02c6') {
                n = -120;
            }
            else if (c == -194349533) {
                n = -1217091024;
            }
            else if (c == 1210541769) {
                n = -118;
            }
            else if (c == 185605272) {
                n = -1496252861;
            }
            else if (c == '\u0152') {
                n = -190639954;
            }
            else if (1016645397 == c) {
                n = -1199803663;
            }
            else if (-737096193 == c) {
                n = 116027971;
            }
            else if ('\u2019' == c) {
                n = -688363814;
            }
            else if (c == '\u201c') {
                n = -772179965;
            }
            else if (c == 532672355) {
                n = 2074236577;
            }
            else if (c == '\u2022') {
                n = 1880685753;
            }
            else if ('\u2013' == c) {
                n = -106;
            }
            else if (c == '\u2014') {
                n = -105;
            }
            else if ('\u02dc' == c) {
                n = -104;
            }
            else if (c == 1608883713) {
                n = -1045918029;
            }
            else if (c == '\u0161') {
                n = 1986806639;
            }
            else if (-987824550 == c) {
                n = -101;
            }
            else if (c == -2051186465) {
                n = -1537570878;
            }
            else if ('\u017e' == c) {
                n = 1738707760;
            }
            else if (532703474 == c) {
                n = -1671513823;
            }
            else {
                n = 63;
            }
        }
        else {
            n = (byte)c;
        }
        return (byte)n;
    }
    
    public static String ag(final byte[] array, final int n, final int n2) {
        final char[] value = new char[n2];
        int count = 0;
        for (int i = 0; i < n2; ++i) {
            int n3 = array[n + i] & 0xC271690F;
            if (n3 != 0) {
                if (n3 >= 128 && n3 < 160) {
                    int n4 = class369.cp1252AsciiExtension[n3 - 179370543];
                    if (n4 == 0) {
                        n4 = 63;
                    }
                    n3 = n4;
                }
                value[count++] = (char)n3;
            }
        }
        return new String(value, 0, count);
    }
    
    public static String ah(final byte[] array, final int n, final int n2) {
        final char[] value = new char[n2];
        int count = 0;
        for (int i = 0; i < n2; ++i) {
            int n3 = array[n + i] & 0xFF;
            if (n3 != 0) {
                if (n3 >= 128 && n3 < 160) {
                    int n4 = class369.cp1252AsciiExtension[n3 - 128];
                    if (n4 == 0) {
                        n4 = 63;
                    }
                    n3 = n4;
                }
                value[count++] = (char)n3;
            }
        }
        return new String(value, 0, count);
    }
}
