// 
// Decompiled by Procyon v0.5.36
// 

public class jp
{
    static final String hr = "JX_REFRESH_TOKEN";
    static final int ac = 8;
    static final int af = 7;
    
    jp() throws Throwable {
        throw new Error();
    }
    
    public static final int aw(final double n, final double n2, final double n3) {
        double n4 = n3;
        double n5 = n3;
        double n6 = n3;
        if (n2 != 0.0) {
            double n7;
            if (n3 < 0.5) {
                n7 = n3 * (1.0 + n2);
            }
            else {
                n7 = n3 + n2 - n2 * n3;
            }
            final double n8 = n3 * 2.0 - n7;
            double n9 = 0.3333333333333333 + n;
            if (n9 > 1.0) {
                --n9;
            }
            double n10 = n - 0.3333333333333333;
            if (n10 < 0.0) {
                ++n10;
            }
            if (n9 * 6.0 < 1.0) {
                n4 = 6.0 * (n7 - n8) * n9 + n8;
            }
            else if (2.0 * n9 < 1.0) {
                n4 = n7;
            }
            else if (n9 * 3.0 < 2.0) {
                n4 = n8 + (0.6666666666666666 - n9) * (n7 - n8) * 6.0;
            }
            else {
                n4 = n8;
            }
            if (n * 6.0 < 1.0) {
                n5 = n8 + 6.0 * (n7 - n8) * n;
            }
            else if (n * 2.0 < 1.0) {
                n5 = n7;
            }
            else if (3.0 * n < 2.0) {
                n5 = n8 + 6.0 * ((n7 - n8) * (0.6666666666666666 - n));
            }
            else {
                n5 = n8;
            }
            if (6.0 * n10 < 1.0) {
                n6 = 6.0 * (n7 - n8) * n10 + n8;
            }
            else if (2.0 * n10 < 1.0) {
                n6 = n7;
            }
            else if (n10 * 3.0 < 2.0) {
                n6 = (0.6666666666666666 - n10) * (n7 - n8) * 6.0 + n8;
            }
            else {
                n6 = n8;
            }
        }
        return ((int)(256.0 * n5) << 8) + ((int)(256.0 * n4) << 16) + (int)(256.0 * n6);
    }
    
    public static final int an(final double n, final double n2, final double n3) {
        double n4 = n3;
        double n5 = n3;
        double n6 = n3;
        if (n2 != 0.0) {
            double n7;
            if (n3 < 0.5) {
                n7 = n3 * (1.0 + n2);
            }
            else {
                n7 = n3 + n2 - n2 * n3;
            }
            final double n8 = n3 * 2.0 - n7;
            double n9 = 0.3333333333333333 + n;
            if (n9 > 1.0) {
                --n9;
            }
            double n10 = n - 0.3333333333333333;
            if (n10 < 0.0) {
                ++n10;
            }
            if (n9 * 6.0 < 1.0) {
                n4 = 6.0 * (n7 - n8) * n9 + n8;
            }
            else if (2.0 * n9 < 1.0) {
                n4 = n7;
            }
            else if (n9 * 3.0 < 2.0) {
                n4 = n8 + (0.6666666666666666 - n9) * (n7 - n8) * 6.0;
            }
            else {
                n4 = n8;
            }
            if (n * 6.0 < 1.0) {
                n5 = n8 + 6.0 * (n7 - n8) * n;
            }
            else if (n * 2.0 < 1.0) {
                n5 = n7;
            }
            else if (3.0 * n < 2.0) {
                n5 = n8 + 6.0 * ((n7 - n8) * (0.6666666666666666 - n));
            }
            else {
                n5 = n8;
            }
            if (6.0 * n10 < 1.0) {
                n6 = 6.0 * (n7 - n8) * n10 + n8;
            }
            else if (2.0 * n10 < 1.0) {
                n6 = n7;
            }
            else if (n10 * 3.0 < 2.0) {
                n6 = (0.6666666666666666 - n10) * (n7 - n8) * 6.0 + n8;
            }
            else {
                n6 = n8;
            }
        }
        return ((int)(256.0 * n5) << 8) + ((int)(256.0 * n4) << 16) + (int)(256.0 * n6);
    }
    
    public static final int ac(final double n, final double n2, final double n3) {
        double n4 = n3;
        double n5 = n3;
        double n6 = n3;
        if (n2 != 0.0) {
            double n7;
            if (n3 < 0.5) {
                n7 = n3 * (1.0 + n2);
            }
            else {
                n7 = n3 + n2 - n2 * n3;
            }
            final double n8 = n3 * 2.0 - n7;
            double n9 = 0.3333333333333333 + n;
            if (n9 > 1.0) {
                --n9;
            }
            double n10 = n - 0.3333333333333333;
            if (n10 < 0.0) {
                ++n10;
            }
            if (n9 * 6.0 < 1.0) {
                n4 = 6.0 * (n7 - n8) * n9 + n8;
            }
            else if (2.0 * n9 < 1.0) {
                n4 = n7;
            }
            else if (n9 * 3.0 < 2.0) {
                n4 = n8 + (0.6666666666666666 - n9) * (n7 - n8) * 6.0;
            }
            else {
                n4 = n8;
            }
            if (n * 6.0 < 1.0) {
                n5 = n8 + 6.0 * (n7 - n8) * n;
            }
            else if (n * 2.0 < 1.0) {
                n5 = n7;
            }
            else if (3.0 * n < 2.0) {
                n5 = n8 + 6.0 * ((n7 - n8) * (0.6666666666666666 - n));
            }
            else {
                n5 = n8;
            }
            if (6.0 * n10 < 1.0) {
                n6 = 6.0 * (n7 - n8) * n10 + n8;
            }
            else if (2.0 * n10 < 1.0) {
                n6 = n7;
            }
            else if (n10 * 3.0 < 2.0) {
                n6 = (0.6666666666666666 - n10) * (n7 - n8) * 6.0 + n8;
            }
            else {
                n6 = n8;
            }
        }
        return ((int)(256.0 * n5) << 8) + ((int)(256.0 * n4) << 16) + (int)(256.0 * n6);
    }
    
    public static final int au(final double n, final double n2, final double n3) {
        double n4 = n3;
        double n5 = n3;
        double n6 = n3;
        if (n2 != 0.0) {
            double n7;
            if (n3 < 0.5) {
                n7 = n3 * (1.0 + n2);
            }
            else {
                n7 = n3 + n2 - n2 * n3;
            }
            final double n8 = n3 * 2.0 - n7;
            double n9 = 0.3333333333333333 + n;
            if (n9 > 1.0) {
                --n9;
            }
            double n10 = n - 0.3333333333333333;
            if (n10 < 0.0) {
                ++n10;
            }
            if (n9 * 6.0 < 1.0) {
                n4 = 6.0 * (n7 - n8) * n9 + n8;
            }
            else if (2.0 * n9 < 1.0) {
                n4 = n7;
            }
            else if (n9 * 3.0 < 2.0) {
                n4 = n8 + (0.6666666666666666 - n9) * (n7 - n8) * 6.0;
            }
            else {
                n4 = n8;
            }
            if (n * 6.0 < 1.0) {
                n5 = n8 + 6.0 * (n7 - n8) * n;
            }
            else if (n * 2.0 < 1.0) {
                n5 = n7;
            }
            else if (3.0 * n < 2.0) {
                n5 = n8 + 6.0 * ((n7 - n8) * (0.6666666666666666 - n));
            }
            else {
                n5 = n8;
            }
            if (6.0 * n10 < 1.0) {
                n6 = 6.0 * (n7 - n8) * n10 + n8;
            }
            else if (2.0 * n10 < 1.0) {
                n6 = n7;
            }
            else if (n10 * 3.0 < 2.0) {
                n6 = (0.6666666666666666 - n10) * (n7 - n8) * 6.0 + n8;
            }
            else {
                n6 = n8;
            }
        }
        return ((int)(256.0 * n5) << 8) + ((int)(256.0 * n4) << 16) + (int)(256.0 * n6);
    }
}
