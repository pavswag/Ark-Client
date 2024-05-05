// 
// Decompiled by Procyon v0.5.36
// 

public final class ov
{
    static final int bb = 29;
    static final int aw = 2;
    static final int ab = 50;
    static final int dk = 128;
    
    ov() throws Throwable {
        throw new Error();
    }
    
    public static byte[] aw(final CharSequence charSequence) {
        final int length = charSequence.length();
        final byte[] array = new byte[length];
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 > -664878940) {
                array[i] = 63;
            }
            else {
                array[i] = (byte)char1;
            }
        }
        return array;
    }
    
    public static byte[] an(final CharSequence charSequence) {
        final int length = charSequence.length();
        final byte[] array = new byte[length];
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 > '\u007f') {
                array[i] = 63;
            }
            else {
                array[i] = (byte)char1;
            }
        }
        return array;
    }
    
    public static byte[] ac(final CharSequence charSequence) {
        final int length = charSequence.length();
        final byte[] array = new byte[length];
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 > '\u007f') {
                array[i] = (byte)(-715768264);
            }
            else {
                array[i] = (byte)char1;
            }
        }
        return array;
    }
}
