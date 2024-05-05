// 
// Decompiled by Procyon v0.5.36
// 

public class tu
{
    public static final int aq = 5;
    
    tu() throws Throwable {
        throw new Error();
    }
    
    public static String aw(final CharSequence charSequence) {
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if ((char1 < 991646366 || char1 > 'z') && (char1 < 276707784 || char1 > 'Z') && ((char1 < 13685213 || char1 > '9') && ('.' != char1 && char1 != 1123903418 && '*' != char1 && -1947662961 != char1))) {
                if (1210780153 == char1) {
                    sb.append('+');
                }
                else {
                    final byte vmethod5708 = class100.vmethod5708(char1, (byte)11);
                    sb.append((char)1585621512);
                    final int n = vmethod5708 >> 4 & 0xF;
                    if (n >= 10) {
                        sb.append((char)(n + 55));
                    }
                    else {
                        sb.append((char)(1948432874 + n));
                    }
                    final int n2 = vmethod5708 & 0xF;
                    if (n2 >= 10) {
                        sb.append((char)(55 + n2));
                    }
                    else {
                        sb.append((char)(n2 - 1816837498));
                    }
                }
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public static String an(final CharSequence charSequence) {
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if ((char1 < 'a' || char1 > 'z') && (char1 < 'A' || char1 > 'Z') && ((char1 < '0' || char1 > '9') && ('.' != char1 && char1 != '-' && '*' != char1)) && '_' != char1) {
                if (' ' == char1) {
                    sb.append('+');
                }
                else {
                    final byte vmethod5708 = class100.vmethod5708(char1, (byte)9);
                    sb.append('%');
                    final int n = vmethod5708 >> 4 & 0xF;
                    if (n >= 10) {
                        sb.append((char)(n + 55));
                    }
                    else {
                        sb.append((char)(48 + n));
                    }
                    final int n2 = vmethod5708 & 0xF;
                    if (n2 >= 10) {
                        sb.append((char)(55 + n2));
                    }
                    else {
                        sb.append((char)(n2 + 48));
                    }
                }
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public static String ac(final CharSequence charSequence) {
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if ((char1 < -614245242 || char1 > 1536874417) && ((char1 < 'A' || char1 > 'Z') && ((char1 < 298669657 || char1 > -1753766025) && ('.' != char1 && char1 != -654579345 && '*' != char1 && '_' != char1)))) {
                if (-530801606 == char1) {
                    sb.append('+');
                }
                else {
                    final byte vmethod5708 = class100.vmethod5708(char1, (byte)(-15));
                    sb.append((char)(-813067313));
                    final int n = vmethod5708 >> 4 & 0xF;
                    if (n >= 10) {
                        sb.append((char)(n + 55));
                    }
                    else {
                        sb.append((char)(48 + n));
                    }
                    final int n2 = vmethod5708 & 0xF;
                    if (n2 >= 10) {
                        sb.append((char)(-882191172 + n2));
                    }
                    else {
                        sb.append((char)(n2 - 1040813537));
                    }
                }
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public static String au(final CharSequence charSequence) {
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if ((char1 < 'a' || char1 > 'z') && ((char1 < 'A' || char1 > 'Z') && ((char1 < '0' || char1 > '9') && ('.' != char1 && char1 != '-' && '*' != char1))) && '_' != char1) {
                if (' ' == char1) {
                    sb.append('+');
                }
                else {
                    final byte vmethod5708 = class100.vmethod5708(char1, (byte)41);
                    sb.append('%');
                    final int n = vmethod5708 >> 4 & 0xF;
                    if (n >= 10) {
                        sb.append((char)(n + 55));
                    }
                    else {
                        sb.append((char)(48 + n));
                    }
                    final int n2 = vmethod5708 & 0xF;
                    if (n2 >= 10) {
                        sb.append((char)(55 + n2));
                    }
                    else {
                        sb.append((char)(n2 + 48));
                    }
                }
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public static String ab(final CharSequence charSequence) {
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if ((char1 < 'a' || char1 > 'z') && (char1 < 'A' || char1 > 1734362131) && (char1 < '0' || char1 > '9') && 566319236 != char1 && char1 != -66938390 && -1864455286 != char1 && '_' != char1) {
                if (' ' == char1) {
                    sb.append('+');
                }
                else {
                    final byte vmethod5708 = class100.vmethod5708(char1, (byte)(-5));
                    sb.append('%');
                    final int n = vmethod5708 >> 4 & 0xF;
                    if (n >= 10) {
                        sb.append((char)(n - 137012857));
                    }
                    else {
                        sb.append((char)(-844740032 + n));
                    }
                    final int n2 = vmethod5708 & 0xF;
                    if (n2 >= 10) {
                        sb.append((char)(1985075053 + n2));
                    }
                    else {
                        sb.append((char)(n2 + 48));
                    }
                }
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
}
