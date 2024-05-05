// 
// Decompiled by Procyon v0.5.36
// 

public class class427
{
    int field3812;
    float[] field3813;
    public static final int al = 17;
    
    class427(final float[] field3813, final int n) {
        this.field3813 = field3813;
        this.field3812 = n * 1021233971;
    }
    
    static float at(final float[] array, final int n, final float n2) {
        float n3 = array[n];
        for (int i = n - 1; i >= 0; --i) {
            n3 = array[i] + n3 * n2;
        }
        return n3;
    }
    
    static float ay(final class427 class427, float n, float a, final float n2) {
        float method2245 = class424.method2245(class427.field3813, class427.field3812 * 754853883, n, -797969939);
        if (Math.abs(method2245) < class121.field1180) {
            return n;
        }
        float a2 = class424.method2245(class427.field3813, 754853883 * class427.field3812, a, 1119174826);
        if (Math.abs(a2) < class121.field1180) {
            return a;
        }
        float n3 = 0.0f;
        float a3 = 0.0f;
        float a4 = 0.0f;
        float n4 = 0.0f;
        int n5 = 1;
        boolean b;
        do {
            b = false;
            if (n5 != 0) {
                n3 = n;
                n4 = method2245;
                a3 = (a4 = a - n);
                n5 = 0;
            }
            if (Math.abs(n4) < Math.abs(a2)) {
                n = a;
                a = n3;
                n3 = n;
                method2245 = a2;
                a2 = n4;
                n4 = method2245;
            }
            final float n6 = class121.field1181 * Math.abs(a) + 0.5f * n2;
            final float a5 = 0.5f * (n3 - a);
            if (Math.abs(a5) > n6 && a2 != 0.0f) {
                if (Math.abs(a4) >= n6 && Math.abs(method2245) > Math.abs(a2)) {
                    final float n7 = a2 / method2245;
                    float n8;
                    float n9;
                    if (n3 == n) {
                        n8 = n7 * (2.0f * a5);
                        n9 = 1.0f - n7;
                    }
                    else {
                        final float n10 = method2245 / n4;
                        final float n11 = a2 / n4;
                        n8 = ((n10 - n11) * (2.0f * a5 * n10) - (a - n) * (n11 - 1.0f)) * n7;
                        n9 = (n10 - 1.0f) * (n11 - 1.0f) * (n7 - 1.0f);
                    }
                    if (n8 > 0.0) {
                        n9 = -n9;
                    }
                    else {
                        n8 = -n8;
                    }
                    final float n12 = a4;
                    a4 = a3;
                    if (n8 * 2.0f < a5 * 3.0f * n9 - Math.abs(n6 * n9) && n8 < Math.abs(n12 * 0.5f * n9)) {
                        a3 = n8 / n9;
                    }
                    else {
                        a3 = (a4 = a5);
                    }
                }
                else {
                    a3 = (a4 = a5);
                }
                n = a;
                method2245 = a2;
                if (Math.abs(a3) > n6) {
                    a += a3;
                }
                else if (a5 > 0.0) {
                    a += n6;
                }
                else {
                    a -= n6;
                }
                a2 = class424.method2245(class427.field3813, 754853883 * class427.field3812, a, 711061171);
                if (a2 * (n4 / Math.abs(n4)) > 0.0) {
                    n5 = 1;
                    b = true;
                }
                else {
                    b = true;
                }
            }
        } while (b);
        return a;
    }
    
    static float al(final float[] array, final int n, final float n2) {
        float n3 = array[n];
        for (int i = n - 1; i >= 0; --i) {
            n3 = array[i] + n3 * n2;
        }
        return n3;
    }
    
    public static int ac(final float[] array, int n, final float a, final boolean b, final float a2, final boolean b2, final float[] array2) {
        float n2 = 0.0f;
        for (int i = 0; i < n + 1; ++i) {
            n2 += Math.abs(array[i]);
        }
        final float n3 = (Math.abs(a) + Math.abs(a2)) * (1 + n) * class121.field1180;
        if (n2 <= n3) {
            return -1;
        }
        final float[] array3 = new float[1 + n];
        for (int j = 0; j < n + 1; ++j) {
            array3[j] = 1.0f / n2 * array[j];
        }
        while (Math.abs(array3[n]) < n3) {
            --n;
        }
        int n4 = 0;
        if (0 == n) {
            return n4;
        }
        if (n == 1) {
            array2[0] = -array3[0] / array3[1];
            final boolean b3 = b ? (a < n3 + array2[0]) : (a < array2[0] - n3);
            final boolean b4 = b2 ? (a2 > array2[0] - n3) : (a2 > n3 + array2[0]);
            final int n5 = (b3 && b4) ? 1 : 0;
            if (n5 > 0) {
                if (b && array2[0] < a) {
                    array2[0] = a;
                }
                else if (b2 && array2[0] > a2) {
                    array2[0] = a2;
                }
            }
            return n5;
        }
        final class427 class427 = new class427(array3, n);
        final float[] array4 = new float[1 + n];
        for (int k = 1; k <= n; ++k) {
            array4[k - 1] = k * array3[k];
        }
        final float[] array5 = new float[1 + n];
        final int method638 = class103.method638(array4, n - 1, a, false, a2, false, array5, (byte)(-37));
        if (-1 == method638) {
            return 0;
        }
        int n6 = 0;
        float method639 = 0.0f;
        float n7 = 0.0f;
        for (int l = 0; l <= method638; ++l) {
            if (n4 > n) {
                return n4;
            }
            float n8;
            float method640;
            if (l == 0) {
                n8 = a;
                method640 = class424.method2245(array3, n, n8, 71137999);
                if (Math.abs(method640) <= n3 && b) {
                    array2[n4++] = a;
                }
            }
            else {
                n8 = n7;
                method640 = method639;
            }
            if (l == method638) {
                n7 = a2;
                n6 = 0;
            }
            else {
                n7 = array5[l];
            }
            method639 = class424.method2245(array3, n, n7, 180182622);
            if (n6 != 0) {
                n6 = 0;
            }
            else if (Math.abs(method639) < n3) {
                if (l != method638 || b2) {
                    array2[n4++] = n7;
                    n6 = 1;
                }
            }
            else if ((method640 < 0.0f && method639 > 0.0f) || (method640 > 0.0f && method639 < 0.0f)) {
                array2[n4++] = Frames.method1297(class427, n8, n7, 0.0f, 556599317);
                if (n4 > 1 && array2[n4 - 2] >= array2[n4 - 1] - n3) {
                    array2[n4 - 2] = (array2[n4 - 1] + array2[n4 - 2]) * 0.5f;
                    --n4;
                }
            }
        }
        return n4;
    }
    
    public static int au(final float[] array, int n, final float a, final boolean b, final float a2, final boolean b2, final float[] array2) {
        float n2 = 0.0f;
        for (int i = 0; i < n + 1; ++i) {
            n2 += Math.abs(array[i]);
        }
        final float n3 = (Math.abs(a) + Math.abs(a2)) * (1 + n) * class121.field1180;
        if (n2 <= n3) {
            return -1;
        }
        final float[] array3 = new float[1 + n];
        for (int j = 0; j < n + 1; ++j) {
            array3[j] = 1.0f / n2 * array[j];
        }
        while (Math.abs(array3[n]) < n3) {
            --n;
        }
        int n4 = 0;
        if (0 == n) {
            return n4;
        }
        if (n == 1) {
            array2[0] = -array3[0] / array3[1];
            final boolean b3 = b ? (a < n3 + array2[0]) : (a < array2[0] - n3);
            final boolean b4 = b2 ? (a2 > array2[0] - n3) : (a2 > n3 + array2[0]);
            final int n5 = (b3 && b4) ? 1 : 0;
            if (n5 > 0) {
                if (b && array2[0] < a) {
                    array2[0] = a;
                }
                else if (b2 && array2[0] > a2) {
                    array2[0] = a2;
                }
            }
            return n5;
        }
        final class427 class427 = new class427(array3, n);
        final float[] array4 = new float[1 + n];
        for (int k = 1; k <= n; ++k) {
            array4[k - 1] = k * array3[k];
        }
        final float[] array5 = new float[1 + n];
        final int method638 = class103.method638(array4, n - 1, a, false, a2, false, array5, (byte)(-120));
        if (-1 == method638) {
            return 0;
        }
        int n6 = 0;
        float method639 = 0.0f;
        float n7 = 0.0f;
        for (int l = 0; l <= method638; ++l) {
            if (n4 > n) {
                return n4;
            }
            float n8;
            float method640;
            if (l == 0) {
                n8 = a;
                method640 = class424.method2245(array3, n, n8, 1210257683);
                if (Math.abs(method640) <= n3 && b) {
                    array2[n4++] = a;
                }
            }
            else {
                n8 = n7;
                method640 = method639;
            }
            if (l == method638) {
                n7 = a2;
                n6 = 0;
            }
            else {
                n7 = array5[l];
            }
            method639 = class424.method2245(array3, n, n7, -627943205);
            if (n6 != 0) {
                n6 = 0;
            }
            else if (Math.abs(method639) < n3) {
                if (l != method638 || b2) {
                    array2[n4++] = n7;
                    n6 = 1;
                }
            }
            else if ((method640 < 0.0f && method639 > 0.0f) || (method640 > 0.0f && method639 < 0.0f)) {
                array2[n4++] = Frames.method1297(class427, n8, n7, 0.0f, 98641121);
                if (n4 > 1 && array2[n4 - 2] >= array2[n4 - 1] - n3) {
                    array2[n4 - 2] = (array2[n4 - 1] + array2[n4 - 2]) * 0.5f;
                    --n4;
                }
            }
        }
        return n4;
    }
    
    static float aa(final class427 class427, float n, float a, final float n2) {
        float method2245 = class424.method2245(class427.field3813, class427.field3812 * -1447439319, n, -77202778);
        if (Math.abs(method2245) < class121.field1180) {
            return n;
        }
        float a2 = class424.method2245(class427.field3813, 439737475 * class427.field3812, a, 250695684);
        if (Math.abs(a2) < class121.field1180) {
            return a;
        }
        float n3 = 0.0f;
        float a3 = 0.0f;
        float a4 = 0.0f;
        float n4 = 0.0f;
        int n5 = 1;
        int n6;
        do {
            n6 = 0;
            if (n5 != 0) {
                n3 = n;
                n4 = method2245;
                a3 = (a4 = a - n);
                n5 = 0;
            }
            if (Math.abs(n4) < Math.abs(a2)) {
                n = a;
                a = n3;
                n3 = n;
                method2245 = a2;
                a2 = n4;
                n4 = method2245;
            }
            final float n7 = class121.field1181 * Math.abs(a) + 0.5f * n2;
            final float a5 = 0.5f * (n3 - a);
            if (Math.abs(a5) > n7 && a2 != 0.0f) {
                if (Math.abs(a4) >= n7 && Math.abs(method2245) > Math.abs(a2)) {
                    final float n8 = a2 / method2245;
                    float n9;
                    float n10;
                    if (n3 == n) {
                        n9 = n8 * (2.0f * a5);
                        n10 = 1.0f - n8;
                    }
                    else {
                        final float n11 = method2245 / n4;
                        final float n12 = a2 / n4;
                        n9 = ((n11 - n12) * (2.0f * a5 * n11) - (a - n) * (n12 - 1.0f)) * n8;
                        n10 = (n11 - 1.0f) * (n12 - 1.0f) * (n8 - 1.0f);
                    }
                    if (n9 > 0.0) {
                        n10 = -n10;
                    }
                    else {
                        n9 = -n9;
                    }
                    final float n13 = a4;
                    a4 = a3;
                    if (n9 * 2.0f < a5 * 3.0f * n10 - Math.abs(n7 * n10) && n9 < Math.abs(n13 * 0.5f * n10)) {
                        a3 = n9 / n10;
                    }
                    else {
                        a3 = (a4 = a5);
                    }
                }
                else {
                    a3 = (a4 = a5);
                }
                n = a;
                method2245 = a2;
                if (Math.abs(a3) > n7) {
                    a += a3;
                }
                else if (a5 > 0.0) {
                    a += n7;
                }
                else {
                    a -= n7;
                }
                a2 = class424.method2245(class427.field3813, 754853883 * class427.field3812, a, 1056968805);
                if (a2 * (n4 / Math.abs(n4)) > 0.0) {
                    n5 = 1;
                    n6 = 1;
                }
                else {
                    n6 = 1;
                }
            }
        } while (n6 != 0);
        return a;
    }
    
    static float ab(final float[] array, final int n, final float n2) {
        float n3 = array[n];
        for (int i = n - 1; i >= 0; --i) {
            n3 = array[i] + n3 * n2;
        }
        return n3;
    }
    
    static float aq(final float[] array, final int n, final float n2) {
        float n3 = array[n];
        for (int i = n - 1; i >= 0; --i) {
            n3 = array[i] + n3 * n2;
        }
        return n3;
    }
}
