// 
// Decompiled by Procyon v0.5.36
// 

public final class se
{
    static final int af = 2;
    public static final int ac = 8;
    
    se() throws Throwable {
        throw new Error();
    }
    
    public static int aw(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 <= '\u007f') {
                ++n;
            }
            else if (char1 <= -1643749318) {
                n += 2;
            }
            else {
                n += 3;
            }
        }
        return n;
    }
    
    public static int al(final byte[] array, final int n, final CharSequence charSequence) {
        final int length = charSequence.length();
        int n2 = n;
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 <= '\u007f') {
                array[n2++] = (byte)char1;
            }
            else if (char1 <= '\u07ff') {
                array[n2++] = (byte)(0xC0 | char1 >> 6);
                array[n2++] = (byte)(0x80 | (char1 & '?'));
            }
            else {
                array[n2++] = (byte)(0xE0 | char1 >> 12);
                array[n2++] = (byte)(0x80 | (char1 >> 6 & 0x3F));
                array[n2++] = (byte)(0x80 | (char1 & '?'));
            }
        }
        return n2 - n;
    }
    
    public static int ac(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 <= '\u007f') {
                ++n;
            }
            else if (char1 <= '\u07ff') {
                n += 2;
            }
            else {
                n += 3;
            }
        }
        return n;
    }
    
    public static int au(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 <= -752021782) {
                ++n;
            }
            else if (char1 <= -1659087116) {
                n += 2;
            }
            else {
                n += 3;
            }
        }
        return n;
    }
    
    public static int ab(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 <= '\u007f') {
                ++n;
            }
            else if (char1 <= 2013134567) {
                n += 2;
            }
            else {
                n += 3;
            }
        }
        return n;
    }
    
    public static int aq(final byte[] array, final int n, final CharSequence charSequence) {
        final int length = charSequence.length();
        int n2 = n;
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 <= '\u007f') {
                array[n2++] = (byte)char1;
            }
            else if (char1 <= '\u07ff') {
                array[n2++] = (byte)(0xC0 | char1 >> 6);
                array[n2++] = (byte)(0x80 | (char1 & '?'));
            }
            else {
                array[n2++] = (byte)(0xE0 | char1 >> 12);
                array[n2++] = (byte)(0x80 | (char1 >> 6 & 0x3F));
                array[n2++] = (byte)(0x80 | (char1 & '?'));
            }
        }
        return n2 - n;
    }
}
