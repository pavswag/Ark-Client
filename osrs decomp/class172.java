// 
// Decompiled by Procyon v0.5.36
// 

public class class172
{
    static final int do = 1;
    public float[] field1444;
    final /* synthetic */ class166 this$0;
    public UrlRequest field1445;
    static final int ab = 6;
    static final int az = 23;
    static final int od = 2000;
    
    class172(final class166 this$0) {
        this.this$0 = this$0;
        this.field1444 = new float[4];
    }
    
    static long method954(final CharSequence charSequence, final int n) {
        try {
            long n2 = 0L;
            final int length = charSequence.length();
            int i = 0;
            while (i < length) {
                if (n >= -1290820166) {
                    throw new IllegalStateException();
                }
                n2 *= 37L;
                final char char1 = charSequence.charAt(i);
                if (char1 >= 'A' && char1 <= 'Z') {
                    if (n >= -1290820166) {
                        throw new IllegalStateException();
                    }
                    n2 += '\u0001' + char1 - 65;
                }
                else if (char1 >= 'a' && char1 <= 'z') {
                    if (n >= -1290820166) {
                        throw new IllegalStateException();
                    }
                    n2 += '\u0001' + char1 - 97;
                }
                else if (char1 >= '0') {
                    if (n >= -1290820166) {
                        throw new IllegalStateException();
                    }
                    if (char1 <= '9') {
                        n2 += char1 + '\u001b' - 48;
                    }
                }
                if (n2 >= 177917621779460413L) {
                    if (n >= -1290820166) {
                        throw new IllegalStateException();
                    }
                    break;
                }
                else {
                    ++i;
                }
            }
            while (0L == n2 % 37L) {
                if (n >= -1290820166) {
                    throw new IllegalStateException();
                }
                if (0L == n2) {
                    break;
                }
                if (n >= -1290820166) {
                    throw new IllegalStateException();
                }
                n2 /= 37L;
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gi.af(" + ')');
        }
    }
}
