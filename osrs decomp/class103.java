// 
// Decompiled by Procyon v0.5.36
// 

public class class103
{
    int field1099;
    static final class103 field1100;
    static final class103 field1101;
    static final class103 field1102;
    static final class103 field1103;
    static final class103 field1104;
    static final class103 field1105;
    static final class103 field1106;
    static final class103 field1107;
    static final class103 field1108;
    static final class103 field1109;
    static final class103 field1110;
    static final class103 field1111;
    static final class103 field1112;
    static final class103 field1113;
    static final class103 field1114;
    static final class103 field1115;
    static final int bx = 46;
    
    class103(final int n) {
        this.field1099 = n * 1355363989;
    }
    
    static {
        field1108 = new class103(0);
        field1100 = new class103(1);
        field1110 = new class103(2);
        field1102 = new class103(3);
        field1101 = new class103(4);
        field1104 = new class103(5);
        field1105 = new class103(6);
        field1103 = new class103(7);
        field1106 = new class103(8);
        field1115 = new class103(9);
        field1109 = new class103(10);
        field1107 = new class103(11);
        field1111 = new class103(12);
        field1112 = new class103(13);
        field1113 = new class103(14);
        field1114 = new class103(15);
    }
    
    static final int method636(final int n) {
        try {
            return 100 - Math.round(200.0f * ((float)class20.clientPreferences.getBrightness(2106375231) - 0.5f));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "da.mh(" + ')');
        }
    }
    
    static final void drawScrollBar(final int n, final int n2, final int n3, final int n4, final int n5, final byte b) {
        try {
            HealthBar.scrollBarSprites[0].ax(n, n2);
            HealthBar.scrollBarSprites[1].ax(n, n4 + n2 - 16);
            Rasterizer2D.Rasterizer2D_fillRectangle(n, n2 + 16, 16, n4 - 32, Client.field443 * 40021093);
            int n6 = (n4 - 32) * n4 / n5;
            if (n6 < 8) {
                if (b != 0) {
                    throw new IllegalStateException();
                }
                n6 = 8;
            }
            final int n7 = n3 * (n4 - 32 - n6) / (n5 - n4);
            Rasterizer2D.Rasterizer2D_fillRectangle(n, n2 + 16 + n7, 16, n6, 992783339 * Client.field451);
            Rasterizer2D.Rasterizer2D_drawVerticalLine(n, 16 + n2 + n7, n6, 1881503647 * Client.field436);
            Rasterizer2D.Rasterizer2D_drawVerticalLine(n + 1, n7 + (n2 + 16), n6, Client.field436 * 1881503647);
            Rasterizer2D.Rasterizer2D_drawHorizontalLine(n, n7 + (n2 + 16), 16, Client.field436 * 1881503647);
            Rasterizer2D.Rasterizer2D_drawHorizontalLine(n, 17 + n2 + n7, 16, 1881503647 * Client.field436);
            Rasterizer2D.Rasterizer2D_drawVerticalLine(n + 15, 16 + n2 + n7, n6, Client.field435 * 1155936455);
            Rasterizer2D.Rasterizer2D_drawVerticalLine(n + 14, 17 + n2 + n7, n6 - 1, 1155936455 * Client.field435);
            Rasterizer2D.Rasterizer2D_drawHorizontalLine(n, n6 + (15 + n2 + n7), 16, Client.field435 * 1155936455);
            Rasterizer2D.Rasterizer2D_drawHorizontalLine(1 + n, 14 + n2 + n7 + n6, 15, 1155936455 * Client.field435);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "da.le(" + ')');
        }
    }
    
    public static class478 method639(final int n, final int n2) {
        try {
            final int n3 = class476.field4023[n];
            if (n3 == 1) {
                if (n2 == 1343308113) {
                    throw new IllegalStateException();
                }
                return class478.field4028;
            }
            else if (2 == n3) {
                if (n2 == 1343308113) {
                    throw new IllegalStateException();
                }
                return class478.field4026;
            }
            else {
                if (3 != n3) {
                    return null;
                }
                if (n2 == 1343308113) {
                    throw new IllegalStateException();
                }
                return class478.field4027;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "da.an(" + ')');
        }
    }
    
    public static int method638(final float[] array, int n, final float a, final boolean b, final float a2, final boolean b2, final float[] array2, final byte b3) {
        try {
            float n2 = 0.0f;
            for (int i = 0; i < n + 1; ++i) {
                if (b3 >= 16) {
                    throw new IllegalStateException();
                }
                n2 += Math.abs(array[i]);
            }
            final float n3 = (Math.abs(a) + Math.abs(a2)) * (1 + n) * class121.field1180;
            if (n2 <= n3) {
                return -1;
            }
            final float[] array3 = new float[1 + n];
            for (int j = 0; j < n + 1; ++j) {
                if (b3 >= 16) {
                    throw new IllegalStateException();
                }
                array3[j] = 1.0f / n2 * array[j];
            }
            while (Math.abs(array3[n]) < n3) {
                if (b3 >= 16) {
                    throw new IllegalStateException();
                }
                --n;
            }
            int n4 = 0;
            if (0 == n) {
                if (b3 >= 16) {
                    throw new IllegalStateException();
                }
                return n4;
            }
            else {
                if (n == 1) {
                    array2[0] = -array3[0] / array3[1];
                    boolean b4;
                    if (b) {
                        if (b3 >= 16) {
                            throw new IllegalStateException();
                        }
                        if (a < n3 + array2[0]) {
                            if (b3 >= 16) {
                                throw new IllegalStateException();
                            }
                            b4 = true;
                        }
                        else {
                            b4 = false;
                        }
                    }
                    else if (a < array2[0] - n3) {
                        if (b3 >= 16) {
                            throw new IllegalStateException();
                        }
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    final boolean b5 = b4;
                    boolean b6;
                    if (b2) {
                        if (b3 >= 16) {
                            throw new IllegalStateException();
                        }
                        b6 = (a2 > array2[0] - n3);
                    }
                    else if (a2 > n3 + array2[0]) {
                        if (b3 >= 16) {
                            throw new IllegalStateException();
                        }
                        b6 = true;
                    }
                    else {
                        b6 = false;
                    }
                    final boolean b7 = b6;
                    int n5 = 0;
                    Label_0452: {
                        if (b5) {
                            if (b3 >= 16) {
                                throw new IllegalStateException();
                            }
                            if (b7) {
                                if (b3 >= 16) {
                                    throw new IllegalStateException();
                                }
                                n5 = 1;
                                break Label_0452;
                            }
                        }
                        n5 = 0;
                    }
                    final int n6 = n5;
                    if (n6 > 0) {
                        if (b3 >= 16) {
                            throw new IllegalStateException();
                        }
                        if (b && array2[0] < a) {
                            if (b3 >= 16) {
                                throw new IllegalStateException();
                            }
                            array2[0] = a;
                        }
                        else if (b2 && array2[0] > a2) {
                            if (b3 >= 16) {
                                throw new IllegalStateException();
                            }
                            array2[0] = a2;
                        }
                    }
                    return n6;
                }
                final class427 class427 = new class427(array3, n);
                final float[] array4 = new float[1 + n];
                for (int k = 1; k <= n; ++k) {
                    if (b3 >= 16) {
                        throw new IllegalStateException();
                    }
                    array4[k - 1] = k * array3[k];
                }
                final float[] array5 = new float[1 + n];
                final int method638 = method638(array4, n - 1, a, false, a2, false, array5, (byte)(-119));
                if (-1 != method638) {
                    int n7 = 0;
                    float method639 = 0.0f;
                    float n8 = 0.0f;
                Label_0621_Outer:
                    for (int l = 0; l <= method638; ++l) {
                        if (b3 >= 16) {
                            throw new IllegalStateException();
                        }
                        if (n4 > n) {
                            return n4;
                        }
                        float n9;
                        float method640;
                        if (l == 0) {
                            if (b3 >= 16) {
                                throw new IllegalStateException();
                            }
                            n9 = a;
                            method640 = class424.method2245(array3, n, n9, 186890791);
                            if (Math.abs(method640) <= n3) {
                                if (b3 >= 16) {
                                    throw new IllegalStateException();
                                }
                                if (b) {
                                    if (b3 >= 16) {
                                        throw new IllegalStateException();
                                    }
                                    array2[n4++] = a;
                                }
                            }
                        }
                        else {
                            n9 = n8;
                            method640 = method639;
                        }
                        if (l == method638) {
                            if (b3 >= 16) {
                                throw new IllegalStateException();
                            }
                            n8 = a2;
                            n7 = 0;
                        }
                        else {
                            n8 = array5[l];
                        }
                        method639 = class424.method2245(array3, n, n8, -487531861);
                        if (n7 != 0) {
                            if (b3 >= 16) {
                                throw new IllegalStateException();
                            }
                            n7 = 0;
                        }
                        else if (Math.abs(method639) < n3) {
                            if (b3 >= 16) {
                                throw new IllegalStateException();
                            }
                            if (l == method638) {
                                if (b3 >= 16) {
                                    throw new IllegalStateException();
                                }
                                if (!b2) {
                                    continue;
                                }
                                if (b3 >= 16) {
                                    throw new IllegalStateException();
                                }
                            }
                            array2[n4++] = n8;
                            n7 = 1;
                        }
                        else {
                            while (true) {
                                Label_1104: {
                                    if (method640 >= 0.0f) {
                                        break Label_1104;
                                    }
                                    if (method639 <= 0.0f) {
                                        if (b3 >= 16) {
                                            throw new IllegalStateException();
                                        }
                                        break Label_1104;
                                    }
                                    array2[n4++] = Frames.method1297(class427, n9, n8, 0.0f, 905872105);
                                    if (n4 <= 1 || array2[n4 - 2] < array2[n4 - 1] - n3) {
                                        continue Label_0621_Outer;
                                    }
                                    if (b3 >= 16) {
                                        throw new IllegalStateException();
                                    }
                                    array2[n4 - 2] = (array2[n4 - 1] + array2[n4 - 2]) * 0.5f;
                                    --n4;
                                    continue Label_0621_Outer;
                                }
                                if (method640 > 0.0f) {
                                    if (b3 >= 16) {
                                        throw new IllegalStateException();
                                    }
                                    if (method639 < 0.0f) {
                                        if (b3 >= 16) {
                                            throw new IllegalStateException();
                                        }
                                        continue;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    return n4;
                }
                if (b3 >= 16) {
                    throw new IllegalStateException();
                }
                return 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "da.af(" + ')');
        }
    }
    
    public static int kp(final WorldMapScaleHandler worldMapScaleHandler, final int n) {
        if (worldMapScaleHandler == null) {
            worldMapScaleHandler.ap();
        }
        if (9 == n || 10 == n) {
            return 1;
        }
        if (n == 11) {
            return 8;
        }
        return n;
    }
}
