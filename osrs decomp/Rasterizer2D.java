// 
// Decompiled by Procyon v0.5.36
// 

public class Rasterizer2D extends DualNode
{
    public static int Rasterizer2D_height;
    public static int Rasterizer2D_width;
    static final float bb = 0.0f;
    public static float[] field4108;
    public static int Rasterizer2D_xClipStart;
    public static int Rasterizer2D_yClipStart;
    public static int Rasterizer2D_yClipEnd;
    public static int[] Rasterizer2D_pixels;
    public static int Rasterizer2D_xClipEnd;
    
    protected Rasterizer2D() {
    }
    
    static {
        Rasterizer2D.Rasterizer2D_yClipStart = 0;
        Rasterizer2D.Rasterizer2D_yClipEnd = 0;
        Rasterizer2D.Rasterizer2D_xClipStart = 0;
        Rasterizer2D.Rasterizer2D_xClipEnd = 0;
    }
    
    public static void Rasterizer2D_drawLine(int i, int j, int n, int n2, final int n3) {
        n -= i;
        n2 -= j;
        if (n2 == 0) {
            if (n >= 0) {
                Rasterizer2D_drawHorizontalLine(i, j, n + 1, n3);
            }
            else {
                Rasterizer2D_drawHorizontalLine(i + n, j, -n + 1, n3);
            }
            return;
        }
        if (n == 0) {
            if (n2 >= 0) {
                Rasterizer2D_drawVerticalLine(i, j, n2 + 1, n3);
            }
            else {
                Rasterizer2D_drawVerticalLine(i, j + n2, -n2 + 1, n3);
            }
            return;
        }
        if (n + n2 < 0) {
            i += n;
            n = -n;
            j += n2;
            n2 = -n2;
        }
        if (n > n2) {
            j <<= 16;
            j += 32768;
            n2 <<= 16;
            final int n4 = (int)Math.floor(n2 / (double)n + 0.5);
            n += i;
            if (i < Rasterizer2D.Rasterizer2D_xClipStart) {
                j += n4 * (Rasterizer2D.Rasterizer2D_xClipStart - i);
                i = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (n >= Rasterizer2D.Rasterizer2D_xClipEnd) {
                n = Rasterizer2D.Rasterizer2D_xClipEnd - 1;
            }
            while (i <= n) {
                final int n5 = j >> 16;
                if (n5 >= Rasterizer2D.Rasterizer2D_yClipStart && n5 < Rasterizer2D.Rasterizer2D_yClipEnd) {
                    Rasterizer2D.Rasterizer2D_pixels[i + n5 * Rasterizer2D.Rasterizer2D_width] = (n3 | 0xFF000000);
                }
                j += n4;
                ++i;
            }
        }
        else {
            i <<= 16;
            i += 32768;
            n <<= 16;
            final int n6 = (int)Math.floor(n / (double)n2 + 0.5);
            n2 += j;
            if (j < Rasterizer2D.Rasterizer2D_yClipStart) {
                i += n6 * (Rasterizer2D.Rasterizer2D_yClipStart - j);
                j = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (n2 >= Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - 1;
            }
            while (j <= n2) {
                final int n7 = i >> 16;
                if (n7 >= Rasterizer2D.Rasterizer2D_xClipStart && n7 < Rasterizer2D.Rasterizer2D_xClipEnd) {
                    Rasterizer2D.Rasterizer2D_pixels[n7 + j * Rasterizer2D.Rasterizer2D_width] = (n3 | 0xFF000000);
                }
                i += n6;
                ++j;
            }
        }
    }
    
    public static void Rasterizer2D_setClipArray(final int[] array) {
        Rasterizer2D.Rasterizer2D_xClipStart = array[0];
        Rasterizer2D.Rasterizer2D_yClipStart = array[1];
        Rasterizer2D.Rasterizer2D_xClipEnd = array[2];
        Rasterizer2D.Rasterizer2D_yClipEnd = array[3];
    }
    
    public static void Rasterizer2D_getClipArray(final int[] array) {
        array[0] = Rasterizer2D.Rasterizer2D_xClipStart;
        array[1] = Rasterizer2D.Rasterizer2D_yClipStart;
        array[2] = Rasterizer2D.Rasterizer2D_xClipEnd;
        array[3] = Rasterizer2D.Rasterizer2D_yClipEnd;
    }
    
    public static void Rasterizer2D_fillRectangleGradientAlpha(int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8) {
        final int in = ScriptFrame.client.in();
        final int sv = ScriptFrame.client.sv();
        final int dj = ScriptFrame.client.dj();
        final int iz = ScriptFrame.client.iz();
        final int kill0 = ScriptFrame.client.kill0();
        final int[] jb = ScriptFrame.client.jb();
        if (!ScriptFrame.client.isGpu()) {
            final int n9 = n;
            final int n10 = n2;
            final int n11 = n3;
            int n12 = n4;
            int n13 = n11;
            int rasterizer2D_yClipStart = n10;
            int rasterizer2D_xClipStart = n9;
            if (n13 > 0 && n12 > 0) {
                int n14 = 0;
                final int n15 = 65536 / n12;
                if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                    n13 -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                    rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
                }
                if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                    n14 += (Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart) * n15;
                    n12 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                    rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
                }
                if (rasterizer2D_xClipStart + n13 > Rasterizer2D.Rasterizer2D_xClipEnd) {
                    n13 = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
                }
                if (rasterizer2D_yClipStart + n12 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                    n12 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
                }
                final int n16 = Rasterizer2D.Rasterizer2D_width - n13;
                int n17 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
                for (int i = -n12; i < 0; ++i) {
                    final int n18 = 65536 - n14 >> 8;
                    final int n19 = n14 >> 8;
                    final int n20 = (n7 * n18 + n8 * n19 & 0xFF00) >>> 8;
                    if (n20 == 0) {
                        n17 += Rasterizer2D.Rasterizer2D_width;
                        n14 += n15;
                    }
                    else {
                        final int n21 = ((n5 & 0xFF00FF) * n18 + (n6 & 0xFF00FF) * n19 & 0xFF00FF00) + ((n5 & 0xFF00) * n18 + (n6 & 0xFF00) * n19 & 0xFF0000) >>> 8;
                        final int n22 = 255 - n20;
                        final int n23 = ((n21 & 0xFF00FF) * n20 >> 8 & 0xFF00FF) + ((n21 & 0xFF00) * n20 >> 8 & 0xFF00);
                        for (int j = -n13; j < 0; ++j) {
                            final int n24 = Rasterizer2D.Rasterizer2D_pixels[n17];
                            if (n24 == 0) {
                                Rasterizer2D.Rasterizer2D_pixels[n17++] = n23;
                            }
                            else {
                                Rasterizer2D.Rasterizer2D_pixels[n17++] = n23 + (((n24 & 0xFF00FF) * n22 >> 8 & 0xFF00FF) + ((n24 & 0xFF00) * n22 >> 8 & 0xFF00));
                            }
                        }
                        n17 += n16;
                        n14 += n15;
                    }
                }
            }
            return;
        }
        if (n3 > 0 && n4 > 0) {
            int n25 = 0;
            final int n26 = 65536 / n4;
            if (n < sv) {
                n3 -= sv - n;
                n = sv;
            }
            if (n2 < dj) {
                n25 += (dj - n2) * n26;
                n4 -= dj - n2;
                n2 = dj;
            }
            if (n + n3 > iz) {
                n3 = iz - n;
            }
            if (n4 + n2 > kill0) {
                n4 = kill0 - n2;
            }
            final int n27 = in - n3;
            int n28 = n + in * n2;
            for (int k = -n4; k < 0; ++k) {
                final int n29 = 65536 - n25 >> 8;
                final int n30 = n25 >> 8;
                final int n31 = (n29 * n7 + n30 * n8 & 0xFF00) >>> 8;
                if (n31 == 0) {
                    n28 += in;
                    n25 += n26;
                }
                else {
                    final int n32 = (n30 * (n6 & 0xFF00FF) + n29 * (n5 & 0xFF00FF) & 0xFF00FF00) + (n30 * (n6 & 0xFF00) + n29 * (n5 & 0xFF00) & 0xFF0000) >>> 8;
                    final int n33 = 255 - n31;
                    final int n34 = ((n32 & 0xFF00FF) * n31 >> 8 & 0xFF00FF) + (n31 * (n32 & 0xFF00) >> 8 & 0xFF00);
                    for (int l = -n3; l < 0; ++l) {
                        final int n35 = jb[n28];
                        Client.ri(jb, n28++, n34 + (((n35 & 0xFF00FF) * n33 >> 8 & 0xFF00FF) + (n33 * (n35 & 0xFF00) >> 8 & 0xFF00)), n31);
                    }
                    n28 += n27;
                    n25 += n26;
                }
            }
        }
    }
    
    public static void method2586() {
        if (Rasterizer2D.field4108 == null) {
            return;
        }
        if (Rasterizer2D.Rasterizer2D_xClipStart == 0 && Rasterizer2D.Rasterizer2D_xClipEnd == Rasterizer2D.Rasterizer2D_width && Rasterizer2D.Rasterizer2D_yClipStart == 0 && Rasterizer2D.Rasterizer2D_yClipEnd == Rasterizer2D.Rasterizer2D_height) {
            final int length = Rasterizer2D.field4108.length;
            int n;
            int i;
            for (n = length - (length & 0x7), i = 0; i < n; Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f) {}
            while (i < length) {
                Rasterizer2D.field4108[i++] = 0.0f;
            }
        }
        else {
            final int n2 = Rasterizer2D.Rasterizer2D_xClipEnd - Rasterizer2D.Rasterizer2D_xClipStart;
            final int n3 = Rasterizer2D.Rasterizer2D_yClipEnd - Rasterizer2D.Rasterizer2D_yClipStart;
            final int n4 = Rasterizer2D.Rasterizer2D_width - n2;
            final int n5 = Rasterizer2D.Rasterizer2D_xClipStart + Rasterizer2D.Rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            final int n6 = n2 >> 3;
            final int n7 = n2 & 0x7;
            int n8 = n5 - 1;
            for (int j = -n3; j < 0; ++j) {
                if (n6 > 0) {
                    int n9 = n6;
                    do {
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                    } while (--n9 > 0);
                }
                if (n7 > 0) {
                    int n10 = n7;
                    do {
                        Rasterizer2D.field4108[++n8] = 0.0f;
                    } while (--n10 > 0);
                }
                n8 += n4;
            }
        }
    }
    
    public static void fw(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int rasterizer2D_width, int rasterizer2D_height) {
        if (rasterizer2D_xClipStart < 0) {
            rasterizer2D_xClipStart = 0;
        }
        if (rasterizer2D_yClipStart < 0) {
            rasterizer2D_yClipStart = 0;
        }
        if (rasterizer2D_width > Rasterizer2D.Rasterizer2D_width) {
            rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
        }
        if (rasterizer2D_height > Rasterizer2D.Rasterizer2D_height) {
            rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
        }
        Rasterizer2D.Rasterizer2D_xClipStart = rasterizer2D_xClipStart;
        Rasterizer2D.Rasterizer2D_yClipStart = rasterizer2D_yClipStart;
        Rasterizer2D.Rasterizer2D_xClipEnd = rasterizer2D_width;
        Rasterizer2D.Rasterizer2D_yClipEnd = rasterizer2D_height;
    }
    
    public static void ft() {
        int i;
        int n;
        for (i = 0, n = Rasterizer2D.Rasterizer2D_width * Rasterizer2D.Rasterizer2D_height - 7; i < n; Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0) {}
        for (n += 7; i < n; Rasterizer2D.Rasterizer2D_pixels[i++] = 0) {}
        method2586();
    }
    
    static void hc(final int n, final int n2, final int n3) {
        if (n >= Rasterizer2D.Rasterizer2D_xClipStart && n2 >= Rasterizer2D.Rasterizer2D_yClipStart && n < Rasterizer2D.Rasterizer2D_xClipEnd && n2 < Rasterizer2D.Rasterizer2D_yClipEnd) {
            Rasterizer2D.Rasterizer2D_pixels[n + n2 * Rasterizer2D.Rasterizer2D_width] = n3;
        }
    }
    
    public static void Rasterizer2D_drawRectangle(final int n, final int n2, final int n3, final int n4, final int n5) {
        Rasterizer2D_drawHorizontalLine(n, n2, n3, n5);
        Rasterizer2D_drawHorizontalLine(n, n2 + n4 - 1, n3, n5);
        Rasterizer2D_drawVerticalLine(n, n2, n4, n5);
        Rasterizer2D_drawVerticalLine(n + n3 - 1, n2, n4, n5);
    }
    
    public static void Rasterizer2D_drawGradientPixels(final int n, final int n2, int n3, int n4, final int n5, final int n6, final byte[] array, final int n7, final boolean b) {
        final int in = ScriptFrame.client.in();
        final int jj = ScriptFrame.client.jj();
        final int[] jb = ScriptFrame.client.jb();
        if (!ScriptFrame.client.isGpu()) {
            final int n8 = n3;
            int n9 = n4;
            int n10 = n8;
            final boolean b2 = true;
            if (n + n10 >= 0 && n2 + n9 >= 0) {
                if (n < Rasterizer2D.Rasterizer2D_width && n2 < Rasterizer2D.Rasterizer2D_height) {
                    int n11 = 0;
                    int n12 = 0;
                    if (n < 0) {
                        n11 -= n;
                        n10 += n;
                    }
                    if (n2 < 0) {
                        n12 -= n2;
                        n9 += n2;
                    }
                    if (n + n10 > Rasterizer2D.Rasterizer2D_width) {
                        n10 = Rasterizer2D.Rasterizer2D_width - n;
                    }
                    if (n2 + n9 > Rasterizer2D.Rasterizer2D_height) {
                        n9 = Rasterizer2D.Rasterizer2D_height - n2;
                    }
                    final int n13 = array.length / n7;
                    final int n14 = Rasterizer2D.Rasterizer2D_width - n10;
                    final int n15 = n5 >>> 24;
                    final int n16 = n6 >>> 24;
                    if (b2 && (n15 != 255 || n16 != 255)) {
                        int n17 = (n2 + n12) * Rasterizer2D.Rasterizer2D_width + n + n11;
                        for (int i = n2 + n12; i < n2 + n12 + n9; ++i) {
                            for (int j = n + n11; j < n + n11 + n10; ++j) {
                                final int n18 = (i - n2) % n13;
                                final int n19 = (j - n) % n7;
                                int n20 = n5;
                                if (array[n18 * n7 + n19] != 0) {
                                    n20 = n6;
                                }
                                final int n21 = n20 >>> 24;
                                final int n22 = 255 - n21;
                                final int n23 = Rasterizer2D.Rasterizer2D_pixels[n17];
                                Rasterizer2D.Rasterizer2D_pixels[n17++] = ((n20 & 0xFF00FF) * n21 + (n23 & 0xFF00FF) * n22 & 0xFF00FF00) + ((n20 & 0xFF00) * n21 + (n23 & 0xFF00) * n22 & 0xFF0000) >> 8;
                            }
                            n17 += n14;
                        }
                    }
                    else {
                        int n24 = (n2 + n12) * Rasterizer2D.Rasterizer2D_width + n + n11;
                        for (int k = n2 + n12; k < n2 + n12 + n9; ++k) {
                            for (int l = n + n11; l < n + n11 + n10; ++l) {
                                if (array[(k - n2) % n13 * n7 + (l - n) % n7] != 0) {
                                    Rasterizer2D.Rasterizer2D_pixels[n24++] = n6;
                                }
                                else {
                                    Rasterizer2D.Rasterizer2D_pixels[n24++] = n5;
                                }
                            }
                            n24 += n14;
                        }
                    }
                }
            }
            return;
        }
        if (n + n3 >= 0 && n4 + n2 >= 0 && n < in && n2 < jj) {
            int n25 = 0;
            int n26 = 0;
            if (n < 0) {
                n25 -= n;
                n3 += n;
            }
            if (n2 < 0) {
                n26 -= n2;
                n4 += n2;
            }
            if (n + n3 > in) {
                n3 = in - n;
            }
            if (n4 + n2 > jj) {
                n4 = jj - n2;
            }
            final int n27 = array.length / n7;
            final int n28 = in - n3;
            final int n29 = n5 >>> 24;
            final int n30 = n6 >>> 24;
            if (n29 == 255 && n30 == 255) {
                int n31 = n + n25 + (n26 + n2) * in;
                for (int n32 = n26 + n2; n32 < n4 + n26 + n2; ++n32) {
                    for (int n33 = n + n25; n33 < n + n25 + n3; ++n33) {
                        if (array[(n33 - n) % n7 + (n32 - n2) % n27 * n7] != 0) {
                            jb[n31++] = n6;
                        }
                        else {
                            jb[n31++] = n5;
                        }
                    }
                    n31 += n28;
                }
            }
            else {
                int n34 = n + n25 + (n26 + n2) * in;
                for (int n35 = n26 + n2; n35 < n4 + n26 + n2; ++n35) {
                    for (int n36 = n + n25; n36 < n + n25 + n3; ++n36) {
                        final int n37 = (n35 - n2) % n27;
                        final int n38 = (n36 - n) % n7;
                        int n39 = n5;
                        if (array[n38 + n37 * n7] != 0) {
                            n39 = n6;
                        }
                        final int n40 = n39 >>> 24;
                        final int n41 = 255 - n40;
                        final int n42 = jb[n34];
                        Client.ri(jb, n34++, ((n39 & 0xFF00FF) * n40 + (n42 & 0xFF00FF) * n41 & 0xFF00FF00) + (n40 * (n39 & 0xFF00) + n41 * (n42 & 0xFF00) & 0xFF0000) >> 8, n40);
                    }
                    n34 += n28;
                }
            }
        }
    }
    
    public static void fk() {
        int i;
        int n;
        for (i = 0, n = Rasterizer2D.Rasterizer2D_width * Rasterizer2D.Rasterizer2D_height - 7; i < n; Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0) {}
        for (n += 7; i < n; Rasterizer2D.Rasterizer2D_pixels[i++] = 0) {}
        method2586();
    }
    
    public static void fv(final int rasterizer2D_xClipStart, final int rasterizer2D_yClipStart, final int rasterizer2D_xClipEnd, final int rasterizer2D_yClipEnd) {
        if (Rasterizer2D.Rasterizer2D_xClipStart < rasterizer2D_xClipStart) {
            Rasterizer2D.Rasterizer2D_xClipStart = rasterizer2D_xClipStart;
        }
        if (Rasterizer2D.Rasterizer2D_yClipStart < rasterizer2D_yClipStart) {
            Rasterizer2D.Rasterizer2D_yClipStart = rasterizer2D_yClipStart;
        }
        if (Rasterizer2D.Rasterizer2D_xClipEnd > rasterizer2D_xClipEnd) {
            Rasterizer2D.Rasterizer2D_xClipEnd = rasterizer2D_xClipEnd;
        }
        if (Rasterizer2D.Rasterizer2D_yClipEnd > rasterizer2D_yClipEnd) {
            Rasterizer2D.Rasterizer2D_yClipEnd = rasterizer2D_yClipEnd;
        }
    }
    
    public static void Rasterizer2D_fillRectangleAlpha(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, int n3, final int n4) {
        if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
            n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
            rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
        }
        n3 = ((n3 & 0xFF00FF) * n4 >> 8 & 0xFF00FF) + ((n3 & 0xFF00) * n4 >> 8 & 0xFF00);
        final int n5 = 256 - n4;
        final int n6 = Rasterizer2D.Rasterizer2D_width - n;
        int n7 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
        for (int i = 0; i < n2; ++i) {
            for (int j = -n; j < 0; ++j) {
                final int n8 = Rasterizer2D.Rasterizer2D_pixels[n7];
                Client.ri(Rasterizer2D.Rasterizer2D_pixels, n7++, n3 + (((n8 & 0xFF00FF) * n5 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n5 >> 8 & 0xFF00)), n4);
            }
            n7 += n6;
        }
    }
    
    public static void Rasterizer2D_setClip(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int rasterizer2D_width, int rasterizer2D_height) {
        if (rasterizer2D_xClipStart < 0) {
            rasterizer2D_xClipStart = 0;
        }
        if (rasterizer2D_yClipStart < 0) {
            rasterizer2D_yClipStart = 0;
        }
        if (rasterizer2D_width > Rasterizer2D.Rasterizer2D_width) {
            rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
        }
        if (rasterizer2D_height > Rasterizer2D.Rasterizer2D_height) {
            rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
        }
        Rasterizer2D.Rasterizer2D_xClipStart = rasterizer2D_xClipStart;
        Rasterizer2D.Rasterizer2D_yClipStart = rasterizer2D_yClipStart;
        Rasterizer2D.Rasterizer2D_xClipEnd = rasterizer2D_width;
        Rasterizer2D.Rasterizer2D_yClipEnd = rasterizer2D_height;
    }
    
    public static void hd(int rasterizer2D_xClipStart, final int n, int n2, final int n3) {
        if (n < Rasterizer2D.Rasterizer2D_yClipStart || n >= Rasterizer2D.Rasterizer2D_yClipEnd) {
            return;
        }
        if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
            n2 -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
            rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (rasterizer2D_xClipStart + n2 > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n2 = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
        }
        final int n4 = rasterizer2D_xClipStart + n * Rasterizer2D.Rasterizer2D_width;
        for (int i = 0; i < n2; ++i) {
            Rasterizer2D.Rasterizer2D_pixels[n4 + i] = n3;
        }
    }
    
    public static void hn(final int n, int rasterizer2D_yClipStart, int n2, final int n3) {
        if (n >= Rasterizer2D.Rasterizer2D_xClipStart && n < Rasterizer2D.Rasterizer2D_xClipEnd) {
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n4 = n + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = 0; i < n2; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n4 + i * Rasterizer2D.Rasterizer2D_width] = n3;
            }
        }
    }
    
    public static void hi(final int n, final int n2, final int n3, final int n4, final int n5) {
        Rasterizer2D_drawHorizontalLine(n, n2, n3, n5);
        Rasterizer2D_drawHorizontalLine(n, n2 + n4 - 1, n3, n5);
        Rasterizer2D_drawVerticalLine(n, n2, n4, n5);
        Rasterizer2D_drawVerticalLine(n + n3 - 1, n2, n4, n5);
    }
    
    public static void Rasterizer2D_drawVerticalLine(final int n, int rasterizer2D_yClipStart, int n2, final int n3) {
        if (n >= Rasterizer2D.Rasterizer2D_xClipStart && n < Rasterizer2D.Rasterizer2D_xClipEnd) {
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n4 = n + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = 0; i < n2; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n4 + i * Rasterizer2D.Rasterizer2D_width] = (n3 | 0xFF000000);
            }
        }
    }
    
    static void hs(int rasterizer2D_xClipStart, final int n, int n2, final int n3, final int n4) {
        if (n < Rasterizer2D.Rasterizer2D_yClipStart || n >= Rasterizer2D.Rasterizer2D_yClipEnd) {
            return;
        }
        if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
            n2 -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
            rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (rasterizer2D_xClipStart + n2 > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n2 = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
        }
        final int n5 = 256 - n4;
        final int n6 = (n3 >> 16 & 0xFF) * n4;
        final int n7 = (n3 >> 8 & 0xFF) * n4;
        final int n8 = (n3 & 0xFF) * n4;
        int n9 = rasterizer2D_xClipStart + n * Rasterizer2D.Rasterizer2D_width;
        for (int i = 0; i < n2; ++i) {
            Rasterizer2D.Rasterizer2D_pixels[n9++] = (n6 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 8 & 0xFF) * n5 >> 8 << 8) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n9] & 0xFF) * n5 >> 8);
        }
    }
    
    public static void ht() {
        if (Rasterizer2D.field4108 == null) {
            return;
        }
        if (Rasterizer2D.Rasterizer2D_xClipStart == 0 && Rasterizer2D.Rasterizer2D_xClipEnd == Rasterizer2D.Rasterizer2D_width && Rasterizer2D.Rasterizer2D_yClipStart == 0 && Rasterizer2D.Rasterizer2D_yClipEnd == Rasterizer2D.Rasterizer2D_height) {
            final int length = Rasterizer2D.field4108.length;
            int n;
            int i;
            for (n = length - (length & 0x7), i = 0; i < n; Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f) {}
            while (i < length) {
                Rasterizer2D.field4108[i++] = 0.0f;
            }
        }
        else {
            final int n2 = Rasterizer2D.Rasterizer2D_xClipEnd - Rasterizer2D.Rasterizer2D_xClipStart;
            final int n3 = Rasterizer2D.Rasterizer2D_yClipEnd - Rasterizer2D.Rasterizer2D_yClipStart;
            final int n4 = Rasterizer2D.Rasterizer2D_width - n2;
            final int n5 = Rasterizer2D.Rasterizer2D_xClipStart + Rasterizer2D.Rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            final int n6 = n2 >> 3;
            final int n7 = n2 & 0x7;
            int n8 = n5 - 1;
            for (int j = -n3; j < 0; ++j) {
                if (n6 > 0) {
                    int n9 = n6;
                    do {
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                    } while (--n9 > 0);
                }
                if (n7 > 0) {
                    int n10 = n7;
                    do {
                        Rasterizer2D.field4108[++n8] = 0.0f;
                    } while (--n10 > 0);
                }
                n8 += n4;
            }
        }
    }
    
    public static void fc(final int[] array) {
        array[0] = Rasterizer2D.Rasterizer2D_xClipStart;
        array[1] = Rasterizer2D.Rasterizer2D_yClipStart;
        array[2] = Rasterizer2D.Rasterizer2D_xClipEnd;
        array[3] = Rasterizer2D.Rasterizer2D_yClipEnd;
    }
    
    protected static void fn(final int[] rasterizer2D_pixels, final int rasterizer2D_width, final int rasterizer2D_height, final float[] field4108) {
        Rasterizer2D.Rasterizer2D_pixels = rasterizer2D_pixels;
        Rasterizer2D.Rasterizer2D_width = rasterizer2D_width;
        Rasterizer2D.Rasterizer2D_height = rasterizer2D_height;
        Rasterizer2D.field4108 = field4108;
        Rasterizer2D_setClip(0, 0, rasterizer2D_width, rasterizer2D_height);
    }
    
    static void Rasterizer2D_drawHorizontalLineAlpha(int rasterizer2D_xClipStart, final int n, int n2, final int n3, final int n4) {
        if (n >= Rasterizer2D.Rasterizer2D_yClipStart && n < Rasterizer2D.Rasterizer2D_yClipEnd) {
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                n2 -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (rasterizer2D_xClipStart + n2 > Rasterizer2D.Rasterizer2D_xClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
            }
            final int n5 = 256 - n4;
            final int n6 = (n3 >> 16 & 0xFF) * n4;
            final int n7 = (n3 >> 8 & 0xFF) * n4;
            final int n8 = (n3 & 0xFF) * n4;
            int n9 = rasterizer2D_xClipStart + n * Rasterizer2D.Rasterizer2D_width;
            for (int i = 0; i < n2; ++i) {
                Client.ri(Rasterizer2D.Rasterizer2D_pixels, n9++, (n6 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 8 & 0xFF) * n5 >> 8 << 8) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n9] & 0xFF) * n5 >> 8), n4);
            }
        }
    }
    
    static void hh(final int n, int rasterizer2D_yClipStart, int n2, final int n3, final int n4) {
        if (n >= Rasterizer2D.Rasterizer2D_xClipStart && n < Rasterizer2D.Rasterizer2D_xClipEnd) {
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n5 = 256 - n4;
            final int n6 = (n3 >> 16 & 0xFF) * n4;
            final int n7 = (n3 >> 8 & 0xFF) * n4;
            final int n8 = (n3 & 0xFF) * n4;
            int n9 = n + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = 0; i < n2; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n9] = (n6 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 8 & 0xFF) * n5 >> 8 << 8) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n9] & 0xFF) * n5 >> 8);
                n9 += Rasterizer2D.Rasterizer2D_width;
            }
        }
    }
    
    public static void Rasterizer2D_fillRectangle(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, final int n3) {
        if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
            n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
            rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
        }
        final int n4 = Rasterizer2D.Rasterizer2D_width - n;
        int n5 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
        for (int i = -n2; i < 0; ++i) {
            for (int j = -n; j < 0; ++j) {
                Rasterizer2D.Rasterizer2D_pixels[n5++] = (n3 | 0xFF000000);
            }
            n5 += n4;
        }
    }
    
    public static void hx(int rasterizer2D_xClipStart, final int n, int n2, final int n3) {
        if (n >= Rasterizer2D.Rasterizer2D_yClipStart && n < Rasterizer2D.Rasterizer2D_yClipEnd) {
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                n2 -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (rasterizer2D_xClipStart + n2 > Rasterizer2D.Rasterizer2D_xClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
            }
            final int n4 = rasterizer2D_xClipStart + n * Rasterizer2D.Rasterizer2D_width;
            for (int i = 0; i < n2; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n4 + i] = n3;
            }
        }
    }
    
    public static void hr(int i, int j, int n, int n2, final int n3) {
        n -= i;
        n2 -= j;
        if (n2 == 0) {
            if (n >= 0) {
                Rasterizer2D_drawHorizontalLine(i, j, n + 1, n3);
            }
            else {
                Rasterizer2D_drawHorizontalLine(i + n, j, -n + 1, n3);
            }
            return;
        }
        if (n == 0) {
            if (n2 >= 0) {
                Rasterizer2D_drawVerticalLine(i, j, n2 + 1, n3);
            }
            else {
                Rasterizer2D_drawVerticalLine(i, j + n2, -n2 + 1, n3);
            }
            return;
        }
        if (n + n2 < 0) {
            i += n;
            n = -n;
            j += n2;
            n2 = -n2;
        }
        if (n > n2) {
            j <<= 16;
            j += 32768;
            n2 <<= 16;
            final int n4 = (int)Math.floor(n2 / (double)n + 0.5);
            n += i;
            if (i < Rasterizer2D.Rasterizer2D_xClipStart) {
                j += n4 * (Rasterizer2D.Rasterizer2D_xClipStart - i);
                i = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (n >= Rasterizer2D.Rasterizer2D_xClipEnd) {
                n = Rasterizer2D.Rasterizer2D_xClipEnd - 1;
            }
            while (i <= n) {
                final int n5 = j >> 16;
                if (n5 >= Rasterizer2D.Rasterizer2D_yClipStart && n5 < Rasterizer2D.Rasterizer2D_yClipEnd) {
                    Rasterizer2D.Rasterizer2D_pixels[i + n5 * Rasterizer2D.Rasterizer2D_width] = n3;
                }
                j += n4;
                ++i;
            }
        }
        else {
            i <<= 16;
            i += 32768;
            n <<= 16;
            final int n6 = (int)Math.floor(n / (double)n2 + 0.5);
            n2 += j;
            if (j < Rasterizer2D.Rasterizer2D_yClipStart) {
                i += n6 * (Rasterizer2D.Rasterizer2D_yClipStart - j);
                j = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (n2 >= Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - 1;
            }
            while (j <= n2) {
                final int n7 = i >> 16;
                if (n7 >= Rasterizer2D.Rasterizer2D_xClipStart && n7 < Rasterizer2D.Rasterizer2D_xClipEnd) {
                    Rasterizer2D.Rasterizer2D_pixels[n7 + j * Rasterizer2D.Rasterizer2D_width] = n3;
                }
                i += n6;
                ++j;
            }
        }
    }
    
    public static void Rasterizer2D_drawHorizontalLine(int rasterizer2D_xClipStart, final int n, int n2, final int n3) {
        if (n >= Rasterizer2D.Rasterizer2D_yClipStart && n < Rasterizer2D.Rasterizer2D_yClipEnd) {
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                n2 -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (rasterizer2D_xClipStart + n2 > Rasterizer2D.Rasterizer2D_xClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
            }
            final int n4 = rasterizer2D_xClipStart + n * Rasterizer2D.Rasterizer2D_width;
            for (int i = 0; i < n2; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n4 + i] = (n3 | 0xFF000000);
            }
        }
    }
    
    public static void hm(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        Rasterizer2D_drawHorizontalLineAlpha(n, n2, n3, n5, n6);
        Rasterizer2D_drawHorizontalLineAlpha(n, n2 + n4 - 1, n3, n5, n6);
        if (n4 >= 3) {
            Rasterizer2D_drawVerticalLineAlpha(n, n2 + 1, n4 - 2, n5, n6);
            Rasterizer2D_drawVerticalLineAlpha(n + n3 - 1, n2 + 1, n4 - 2, n5, n6);
        }
    }
    
    public static void gp(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, final int n3, final int n4) {
        if (n > 0 && n2 > 0) {
            int n5 = 0;
            final int n6 = 65536 / n2;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n5 += (Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart) * n6;
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
                n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n7 = Rasterizer2D.Rasterizer2D_width - n;
            int n8 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = -n2; i < 0; ++i) {
                final int n9 = 65536 - n5 >> 8;
                final int n10 = n5 >> 8;
                final int n11 = ((n3 & 0xFF00FF) * n9 + (n4 & 0xFF00FF) * n10 & 0xFF00FF00) + ((n3 & 0xFF00) * n9 + (n4 & 0xFF00) * n10 & 0xFF0000) >>> 8;
                for (int j = -n; j < 0; ++j) {
                    Rasterizer2D.Rasterizer2D_pixels[n8++] = n11;
                }
                n8 += n7;
                n5 += n6;
            }
        }
    }
    
    public static void fr(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int rasterizer2D_width, int rasterizer2D_height) {
        if (rasterizer2D_xClipStart < 0) {
            rasterizer2D_xClipStart = 0;
        }
        if (rasterizer2D_yClipStart < 0) {
            rasterizer2D_yClipStart = 0;
        }
        if (rasterizer2D_width > Rasterizer2D.Rasterizer2D_width) {
            rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
        }
        if (rasterizer2D_height > Rasterizer2D.Rasterizer2D_height) {
            rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
        }
        Rasterizer2D.Rasterizer2D_xClipStart = rasterizer2D_xClipStart;
        Rasterizer2D.Rasterizer2D_yClipStart = rasterizer2D_yClipStart;
        Rasterizer2D.Rasterizer2D_xClipEnd = rasterizer2D_width;
        Rasterizer2D.Rasterizer2D_yClipEnd = rasterizer2D_height;
    }
    
    public static void ge(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, final int n3) {
        if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
            n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
            rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
        }
        final int n4 = Rasterizer2D.Rasterizer2D_width - n;
        int n5 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
        for (int i = -n2; i < 0; ++i) {
            for (int j = -n; j < 0; ++j) {
                Rasterizer2D.Rasterizer2D_pixels[n5++] = n3;
            }
            n5 += n4;
        }
    }
    
    static void Rasterizer2D_setPixel(final int n, final int n2, final int n3) {
        if (n < Rasterizer2D.Rasterizer2D_xClipStart || n2 < Rasterizer2D.Rasterizer2D_yClipStart || n >= Rasterizer2D.Rasterizer2D_xClipEnd || n2 >= Rasterizer2D.Rasterizer2D_yClipEnd) {
            return;
        }
        Rasterizer2D.Rasterizer2D_pixels[n + n2 * Rasterizer2D.Rasterizer2D_width] = (n3 | 0xFF000000);
    }
    
    public static void fa() {
        Rasterizer2D.Rasterizer2D_xClipStart = 0;
        Rasterizer2D.Rasterizer2D_yClipStart = 0;
        Rasterizer2D.Rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_width;
        Rasterizer2D.Rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_height;
    }
    
    public static void Rasterizer2D_drawCircleAlpha(final int n, int n2, int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return;
        }
        if (n5 == 256) {
            drawCircle(n, n2, n3, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        final int n6 = 256 - n5;
        final int n7 = (n4 >> 16 & 0xFF) * n5;
        final int n8 = (n4 >> 8 & 0xFF) * n5;
        final int n9 = (n4 & 0xFF) * n5;
        int rasterizer2D_yClipStart = n2 - n3;
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        int rasterizer2D_yClipEnd = n2 + n3 + 1;
        if (rasterizer2D_yClipEnd > Rasterizer2D.Rasterizer2D_yClipEnd) {
            rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        int i = rasterizer2D_yClipStart;
        final int n10 = n3 * n3;
        int n11 = 0;
        int n12 = n2 - i;
        int n13 = n12 * n12;
        int n14 = n13 - n12;
        if (n2 > rasterizer2D_yClipEnd) {
            n2 = rasterizer2D_yClipEnd;
        }
        while (i < n2) {
            while (n14 <= n10 || n13 <= n10) {
                n13 += n11 + n11;
                n14 += n11 + ++n11;
            }
            int rasterizer2D_xClipStart = n - n11 + 1;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int rasterizer2D_xClipEnd = n + n11;
            if (rasterizer2D_xClipEnd > Rasterizer2D.Rasterizer2D_xClipEnd) {
                rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_xClipEnd;
            }
            int n15 = rasterizer2D_xClipStart + i * Rasterizer2D.Rasterizer2D_width;
            for (int j = rasterizer2D_xClipStart; j < rasterizer2D_xClipEnd; ++j) {
                Client.ri(Rasterizer2D.Rasterizer2D_pixels, n15++, (n7 + (Rasterizer2D.Rasterizer2D_pixels[n15] >> 16 & 0xFF) * n6 >> 8 << 16) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n15] >> 8 & 0xFF) * n6 >> 8 << 8) + (n9 + (Rasterizer2D.Rasterizer2D_pixels[n15] & 0xFF) * n6 >> 8), n5);
            }
            ++i;
            n13 -= n12 + --n12;
            n14 -= n12 + n12;
        }
        int n16 = n3;
        int n17 = -n12;
        final int n18 = n17 * n17 + n10;
        for (int n19 = n18 - n16, n20 = n18 - n17; i < rasterizer2D_yClipEnd; ++i, n20 += n17 + n17, n19 += n17 + ++n17) {
            while (n20 > n10 && n19 > n10) {
                n20 -= n16 + --n16;
                n19 -= n16 + n16;
            }
            int rasterizer2D_xClipStart2 = n - n16;
            if (rasterizer2D_xClipStart2 < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart2 = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int n21 = n + n16;
            if (n21 > Rasterizer2D.Rasterizer2D_xClipEnd - 1) {
                n21 = Rasterizer2D.Rasterizer2D_xClipEnd - 1;
            }
            int n22 = rasterizer2D_xClipStart2 + i * Rasterizer2D.Rasterizer2D_width;
            for (int k = rasterizer2D_xClipStart2; k <= n21; ++k) {
                Client.ri(Rasterizer2D.Rasterizer2D_pixels, n22++, (n7 + (Rasterizer2D.Rasterizer2D_pixels[n22] >> 16 & 0xFF) * n6 >> 8 << 16) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n22] >> 8 & 0xFF) * n6 >> 8 << 8) + (n9 + (Rasterizer2D.Rasterizer2D_pixels[n22] & 0xFF) * n6 >> 8), n5);
            }
        }
    }
    
    protected static void method2562(final int[] rasterizer2D_pixels, final int rasterizer2D_width, final int rasterizer2D_height, final float[] field4108) {
        Rasterizer2D.Rasterizer2D_pixels = rasterizer2D_pixels;
        Rasterizer2D.Rasterizer2D_width = rasterizer2D_width;
        Rasterizer2D.Rasterizer2D_height = rasterizer2D_height;
        Rasterizer2D.field4108 = field4108;
        Rasterizer2D_setClip(0, 0, rasterizer2D_width, rasterizer2D_height);
    }
    
    public static void fm() {
        int i;
        int n;
        for (i = 0, n = Rasterizer2D.Rasterizer2D_width * Rasterizer2D.Rasterizer2D_height - 7; i < n; Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0) {}
        for (n += 7; i < n; Rasterizer2D.Rasterizer2D_pixels[i++] = 0) {}
        method2586();
    }
    
    static void Rasterizer2D_drawVerticalLineAlpha(final int n, int rasterizer2D_yClipStart, int n2, final int n3, final int n4) {
        if (n >= Rasterizer2D.Rasterizer2D_xClipStart && n < Rasterizer2D.Rasterizer2D_xClipEnd) {
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n5 = 256 - n4;
            final int n6 = (n3 >> 16 & 0xFF) * n4;
            final int n7 = (n3 >> 8 & 0xFF) * n4;
            final int n8 = (n3 & 0xFF) * n4;
            int n9 = n + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = 0; i < n2; ++i) {
                Client.ri(Rasterizer2D.Rasterizer2D_pixels, n9, (n6 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 8 & 0xFF) * n5 >> 8 << 8) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n9] & 0xFF) * n5 >> 8), n4);
                n9 += Rasterizer2D.Rasterizer2D_width;
            }
        }
    }
    
    public static void gl(final int n, final int n2, int n3, int n4, final int n5, final int n6, final byte[] array, final int n7, final boolean b) {
        if (n + n3 < 0 || n2 + n4 < 0) {
            return;
        }
        if (n < Rasterizer2D.Rasterizer2D_width && n2 < Rasterizer2D.Rasterizer2D_height) {
            int n8 = 0;
            int n9 = 0;
            if (n < 0) {
                n8 -= n;
                n3 += n;
            }
            if (n2 < 0) {
                n9 -= n2;
                n4 += n2;
            }
            if (n + n3 > Rasterizer2D.Rasterizer2D_width) {
                n3 = Rasterizer2D.Rasterizer2D_width - n;
            }
            if (n2 + n4 > Rasterizer2D.Rasterizer2D_height) {
                n4 = Rasterizer2D.Rasterizer2D_height - n2;
            }
            final int n10 = array.length / n7;
            final int n11 = Rasterizer2D.Rasterizer2D_width - n3;
            final int n12 = n5 >>> 24;
            final int n13 = n6 >>> 24;
            if (b && (n12 != 255 || n13 != 255)) {
                int n14 = (n2 + n9) * Rasterizer2D.Rasterizer2D_width + n + n8;
                for (int i = n2 + n9; i < n2 + n9 + n4; ++i) {
                    for (int j = n + n8; j < n + n8 + n3; ++j) {
                        final int n15 = (i - n2) % n10;
                        final int n16 = (j - n) % n7;
                        int n17 = n5;
                        if (array[n15 * n7 + n16] != 0) {
                            n17 = n6;
                        }
                        final int n18 = n17 >>> 24;
                        final int n19 = -83416513 - n18;
                        final int n20 = Rasterizer2D.Rasterizer2D_pixels[n14];
                        Rasterizer2D.Rasterizer2D_pixels[n14++] = ((n17 & 0xFF00FF) * n18 + (n20 & 0xC1403DE1) * n19 & 0xC29C390D) + ((n17 & 0xFF00) * n18 + (n20 & 0x175C7551) * n19 & 0xF9423FA8) >> 8;
                    }
                    n14 += n11;
                }
            }
            else {
                int n21 = (n2 + n9) * Rasterizer2D.Rasterizer2D_width + n + n8;
                for (int k = n2 + n9; k < n2 + n9 + n4; ++k) {
                    for (int l = n + n8; l < n + n8 + n3; ++l) {
                        if (array[(k - n2) % n10 * n7 + (l - n) % n7] != 0) {
                            Rasterizer2D.Rasterizer2D_pixels[n21++] = n6;
                        }
                        else {
                            Rasterizer2D.Rasterizer2D_pixels[n21++] = n5;
                        }
                    }
                    n21 += n11;
                }
            }
        }
    }
    
    public static void gv(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n > 0 && n2 > 0) {
            int n7 = 0;
            final int n8 = 65536 / n2;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n7 += (Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart) * n8;
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
                n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n9 = Rasterizer2D.Rasterizer2D_width - n;
            int n10 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = -n2; i < 0; ++i) {
                final int n11 = 65536 - n7 >> 8;
                final int n12 = n7 >> 8;
                final int n13 = (n5 * n11 + n6 * n12 & 0xFF00) >>> 8;
                if (n13 == 0) {
                    n10 += Rasterizer2D.Rasterizer2D_width;
                    n7 += n8;
                }
                else {
                    final int n14 = ((n3 & 0xFF00FF) * n11 + (n4 & 0xFF00FF) * n12 & 0xFF00FF00) + ((n3 & 0xFF00) * n11 + (n4 & 0xFF00) * n12 & 0xFF0000) >>> 8;
                    final int n15 = 255 - n13;
                    final int n16 = ((n14 & 0xFF00FF) * n13 >> 8 & 0xFF00FF) + ((n14 & 0xFF00) * n13 >> 8 & 0xFF00);
                    for (int j = -n; j < 0; ++j) {
                        final int n17 = Rasterizer2D.Rasterizer2D_pixels[n10];
                        if (n17 == 0) {
                            Rasterizer2D.Rasterizer2D_pixels[n10++] = n16;
                        }
                        else {
                            Rasterizer2D.Rasterizer2D_pixels[n10++] = n16 + (((n17 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + ((n17 & 0xFF00) * n15 >> 8 & 0xFF00));
                        }
                    }
                    n10 += n9;
                    n7 += n8;
                }
            }
        }
    }
    
    public static void gn(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n > 0 && n2 > 0) {
            int n7 = 0;
            final int n8 = 65536 / n2;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n7 += (Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart) * n8;
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
                n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n9 = Rasterizer2D.Rasterizer2D_width - n;
            int n10 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = -n2; i < 0; ++i) {
                final int n11 = 65536 - n7 >> 8;
                final int n12 = n7 >> 8;
                final int n13 = (n5 * n11 + n6 * n12 & 0xFF00) >>> 8;
                if (n13 == 0) {
                    n10 += Rasterizer2D.Rasterizer2D_width;
                    n7 += n8;
                }
                else {
                    final int n14 = ((n3 & 0xFF00FF) * n11 + (n4 & 0xFF00FF) * n12 & 0xFF00FF00) + ((n3 & 0xFF00) * n11 + (n4 & 0xFF00) * n12 & 0xFF0000) >>> 8;
                    final int n15 = 255 - n13;
                    final int n16 = ((n14 & 0xFF00FF) * n13 >> 8 & 0xFF00FF) + ((n14 & 0xFF00) * n13 >> 8 & 0xFF00);
                    for (int j = -n; j < 0; ++j) {
                        final int n17 = Rasterizer2D.Rasterizer2D_pixels[n10];
                        if (n17 == 0) {
                            Rasterizer2D.Rasterizer2D_pixels[n10++] = n16;
                        }
                        else {
                            Rasterizer2D.Rasterizer2D_pixels[n10++] = n16 + (((n17 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + ((n17 & 0xFF00) * n15 >> 8 & 0xFF00));
                        }
                    }
                    n10 += n9;
                    n7 += n8;
                }
            }
        }
    }
    
    public static void gg(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, int n3, final int n4) {
        if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
            n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
            rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
        }
        n3 = ((n3 & 0xFF00FF) * n4 >> 8 & 0xFF00FF) + ((n3 & 0xFF00) * n4 >> 8 & 0xFF00);
        final int n5 = 256 - n4;
        final int n6 = Rasterizer2D.Rasterizer2D_width - n;
        int n7 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
        for (int i = 0; i < n2; ++i) {
            for (int j = -n; j < 0; ++j) {
                final int n8 = Rasterizer2D.Rasterizer2D_pixels[n7];
                Rasterizer2D.Rasterizer2D_pixels[n7++] = n3 + (((n8 & 0xFF00FF) * n5 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n5 >> 8 & 0xFF00));
            }
            n7 += n6;
        }
    }
    
    public static void Rasterizer2D_fillMaskedRectangle(int i, int j, final int n, final int[] array, final int[] array2) {
        int n2 = i + j * Rasterizer2D.Rasterizer2D_width;
        int n3;
        for (j = 0; j < array.length; ++j) {
            n3 = n2 + array[j];
            for (i = -array2[j]; i < 0; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n3++] = (n | 0xFF000000);
            }
            n2 += Rasterizer2D.Rasterizer2D_width;
        }
    }
    
    public static void fy() {
        Rasterizer2D.Rasterizer2D_xClipStart = 0;
        Rasterizer2D.Rasterizer2D_yClipStart = 0;
        Rasterizer2D.Rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_width;
        Rasterizer2D.Rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_height;
    }
    
    static void hl(final int n, int rasterizer2D_yClipStart, int n2, final int n3, final int n4) {
        if (n >= Rasterizer2D.Rasterizer2D_xClipStart && n < Rasterizer2D.Rasterizer2D_xClipEnd) {
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n5 = 256 - n4;
            final int n6 = (n3 >> 16 & 0xFF) * n4;
            final int n7 = (n3 >> 8 & 0xFF) * n4;
            final int n8 = (n3 & 0xFF) * n4;
            int n9 = n + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = 0; i < n2; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n9] = (n6 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 8 & 0xFF) * n5 >> 8 << 8) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n9] & 0xFF) * n5 >> 8);
                n9 += Rasterizer2D.Rasterizer2D_width;
            }
        }
    }
    
    public static void gb(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, final int n3) {
        if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
            n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
            rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
        }
        final int n4 = Rasterizer2D.Rasterizer2D_width - n;
        int n5 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
        for (int i = -n2; i < 0; ++i) {
            for (int j = -n; j < 0; ++j) {
                Rasterizer2D.Rasterizer2D_pixels[n5++] = n3;
            }
            n5 += n4;
        }
    }
    
    public static void fg(final int[] array) {
        Rasterizer2D.Rasterizer2D_xClipStart = array[0];
        Rasterizer2D.Rasterizer2D_yClipStart = array[1];
        Rasterizer2D.Rasterizer2D_xClipEnd = array[2];
        Rasterizer2D.Rasterizer2D_yClipEnd = array[3];
    }
    
    public static void hw(final int n, final int n2, final int n3, final int n4, final int n5) {
        Rasterizer2D_drawHorizontalLine(n, n2, n3, n5);
        Rasterizer2D_drawHorizontalLine(n, n2 + n4 - 1, n3, n5);
        Rasterizer2D_drawVerticalLine(n, n2, n4, n5);
        Rasterizer2D_drawVerticalLine(n + n3 - 1, n2, n4, n5);
    }
    
    public static void Rasterizer2D_clear() {
        int i;
        int n;
        for (i = 0, n = Rasterizer2D.Rasterizer2D_width * Rasterizer2D.Rasterizer2D_height - 7; i < n; Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0, Rasterizer2D.Rasterizer2D_pixels[i++] = 0) {}
        for (n += 7; i < n; Rasterizer2D.Rasterizer2D_pixels[i++] = 0) {}
        method2586();
    }
    
    public static void gx(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n > 0 && n2 > 0) {
            int n7 = 0;
            final int n8 = 65536 / n2;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n7 += (Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart) * n8;
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
                n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n9 = Rasterizer2D.Rasterizer2D_width - n;
            int n10 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = -n2; i < 0; ++i) {
                final int n11 = 65536 - n7 >> 8;
                final int n12 = n7 >> 8;
                final int n13 = (n5 * n11 + n6 * n12 & 0xFF00) >>> 8;
                if (n13 == 0) {
                    n10 += Rasterizer2D.Rasterizer2D_width;
                    n7 += n8;
                }
                else {
                    final int n14 = ((n3 & 0xFF00FF) * n11 + (n4 & 0xFF00FF) * n12 & 0xFF00FF00) + ((n3 & 0xFF00) * n11 + (n4 & 0xFF00) * n12 & 0xFF0000) >>> 8;
                    final int n15 = 255 - n13;
                    final int n16 = ((n14 & 0xFF00FF) * n13 >> 8 & 0xFF00FF) + ((n14 & 0xFF00) * n13 >> 8 & 0xFF00);
                    for (int j = -n; j < 0; ++j) {
                        final int n17 = Rasterizer2D.Rasterizer2D_pixels[n10];
                        if (n17 == 0) {
                            Rasterizer2D.Rasterizer2D_pixels[n10++] = n16;
                        }
                        else {
                            Rasterizer2D.Rasterizer2D_pixels[n10++] = n16 + (((n17 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + ((n17 & 0xFF00) * n15 >> 8 & 0xFF00));
                        }
                    }
                    n10 += n9;
                    n7 += n8;
                }
            }
        }
    }
    
    public static void hu(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        Rasterizer2D_drawHorizontalLineAlpha(n, n2, n3, n5, n6);
        Rasterizer2D_drawHorizontalLineAlpha(n, n2 + n4 - 1, n3, n5, n6);
        if (n4 >= 3) {
            Rasterizer2D_drawVerticalLineAlpha(n, n2 + 1, n4 - 2, n5, n6);
            Rasterizer2D_drawVerticalLineAlpha(n + n3 - 1, n2 + 1, n4 - 2, n5, n6);
        }
    }
    
    public static void Rasterizer2D_resetClip() {
        Rasterizer2D.Rasterizer2D_xClipStart = 0;
        Rasterizer2D.Rasterizer2D_yClipStart = 0;
        Rasterizer2D.Rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_width;
        Rasterizer2D.Rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_height;
    }
    
    static void hv(int rasterizer2D_xClipStart, final int n, int n2, final int n3, final int n4) {
        if (n >= Rasterizer2D.Rasterizer2D_yClipStart && n < Rasterizer2D.Rasterizer2D_yClipEnd) {
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                n2 -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (rasterizer2D_xClipStart + n2 > Rasterizer2D.Rasterizer2D_xClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
            }
            final int n5 = 256 - n4;
            final int n6 = (n3 >> 16 & 0xD344D73A) * n4;
            final int n7 = (n3 >> 8 & 0xFF) * n4;
            final int n8 = (n3 & 0xFF) * n4;
            int n9 = rasterizer2D_xClipStart + n * Rasterizer2D.Rasterizer2D_width;
            for (int i = 0; i < n2; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n9++] = (n6 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 16 & 0xC5C2ECAA) * n5 >> 8 << 16) + (n7 + (Rasterizer2D.Rasterizer2D_pixels[n9] >> 8 & 0x43CD4A61) * n5 >> 8 << 8) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n9] & 0x5F795144) * n5 >> 8);
            }
        }
    }
    
    static void fu(final int n, int n2, int n3, final int n4) {
        if (n3 == 0) {
            Rasterizer2D_setPixel(n, n2, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        int rasterizer2D_yClipStart = n2 - n3;
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        int rasterizer2D_yClipEnd = n2 + n3 + 1;
        if (rasterizer2D_yClipEnd > Rasterizer2D.Rasterizer2D_yClipEnd) {
            rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        int i = rasterizer2D_yClipStart;
        final int n5 = n3 * n3;
        int n6 = 0;
        int n7 = n2 - i;
        int n8 = n7 * n7;
        int n9 = n8 - n7;
        if (n2 > rasterizer2D_yClipEnd) {
            n2 = rasterizer2D_yClipEnd;
        }
        while (i < n2) {
            while (n9 <= n5 || n8 <= n5) {
                n8 += n6 + n6;
                n9 += n6 + ++n6;
            }
            int rasterizer2D_xClipStart = n - n6 + 1;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int rasterizer2D_xClipEnd = n + n6;
            if (rasterizer2D_xClipEnd > Rasterizer2D.Rasterizer2D_xClipEnd) {
                rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_xClipEnd;
            }
            int n10 = rasterizer2D_xClipStart + i * Rasterizer2D.Rasterizer2D_width;
            for (int j = rasterizer2D_xClipStart; j < rasterizer2D_xClipEnd; ++j) {
                Rasterizer2D.Rasterizer2D_pixels[n10++] = n4;
            }
            ++i;
            n8 -= n7 + --n7;
            n9 -= n7 + n7;
        }
        int n11 = n3;
        int n12 = i - n2;
        final int n13 = n12 * n12 + n5;
        for (int n14 = n13 - n11, n15 = n13 - n12; i < rasterizer2D_yClipEnd; ++i, n15 += n12 + n12, n14 += n12 + ++n12) {
            while (n15 > n5 && n14 > n5) {
                n15 -= n11 + --n11;
                n14 -= n11 + n11;
            }
            int rasterizer2D_xClipStart2 = n - n11;
            if (rasterizer2D_xClipStart2 < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart2 = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int n16 = n + n11;
            if (n16 > Rasterizer2D.Rasterizer2D_xClipEnd - 1) {
                n16 = Rasterizer2D.Rasterizer2D_xClipEnd - 1;
            }
            int n17 = rasterizer2D_xClipStart2 + i * Rasterizer2D.Rasterizer2D_width;
            for (int k = rasterizer2D_xClipStart2; k <= n16; ++k) {
                Rasterizer2D.Rasterizer2D_pixels[n17++] = n4;
            }
        }
    }
    
    static void drawCircle(final int n, int n2, int n3, final int n4) {
        if (n3 == 0) {
            Rasterizer2D_setPixel(n, n2, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        int rasterizer2D_yClipStart = n2 - n3;
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        int rasterizer2D_yClipEnd = n2 + n3 + 1;
        if (rasterizer2D_yClipEnd > Rasterizer2D.Rasterizer2D_yClipEnd) {
            rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        int i = rasterizer2D_yClipStart;
        final int n5 = n3 * n3;
        int n6 = 0;
        int n7 = n2 - i;
        int n8 = n7 * n7;
        int n9 = n8 - n7;
        if (n2 > rasterizer2D_yClipEnd) {
            n2 = rasterizer2D_yClipEnd;
        }
        while (i < n2) {
            while (n9 <= n5 || n8 <= n5) {
                n8 += n6 + n6;
                n9 += n6 + ++n6;
            }
            int rasterizer2D_xClipStart = n - n6 + 1;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int rasterizer2D_xClipEnd = n + n6;
            if (rasterizer2D_xClipEnd > Rasterizer2D.Rasterizer2D_xClipEnd) {
                rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_xClipEnd;
            }
            int n10 = rasterizer2D_xClipStart + i * Rasterizer2D.Rasterizer2D_width;
            for (int j = rasterizer2D_xClipStart; j < rasterizer2D_xClipEnd; ++j) {
                Rasterizer2D.Rasterizer2D_pixels[n10++] = (n4 | 0xFF000000);
            }
            ++i;
            n8 -= n7 + --n7;
            n9 -= n7 + n7;
        }
        int n11 = n3;
        int n12 = i - n2;
        final int n13 = n12 * n12 + n5;
        for (int n14 = n13 - n11, n15 = n13 - n12; i < rasterizer2D_yClipEnd; ++i, n15 += n12 + n12, n14 += n12 + ++n12) {
            while (n15 > n5 && n14 > n5) {
                n15 -= n11 + --n11;
                n14 -= n11 + n11;
            }
            int rasterizer2D_xClipStart2 = n - n11;
            if (rasterizer2D_xClipStart2 < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart2 = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int n16 = n + n11;
            if (n16 > Rasterizer2D.Rasterizer2D_xClipEnd - 1) {
                n16 = Rasterizer2D.Rasterizer2D_xClipEnd - 1;
            }
            int n17 = rasterizer2D_xClipStart2 + i * Rasterizer2D.Rasterizer2D_width;
            for (int k = rasterizer2D_xClipStart2; k <= n16; ++k) {
                Rasterizer2D.Rasterizer2D_pixels[n17++] = (n4 | 0xFF000000);
            }
        }
    }
    
    public static void Rasterizer2D_fillRectangleGradient(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, final int n3, final int n4) {
        if (n > 0 && n2 > 0) {
            int n5 = 0;
            final int n6 = 65536 / n2;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
                n5 += (Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart) * n6;
                n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
                rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
            }
            if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
                n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
            }
            if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
                n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
            }
            final int n7 = Rasterizer2D.Rasterizer2D_width - n;
            int n8 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            for (int i = -n2; i < 0; ++i) {
                final int n9 = 65536 - n5 >> 8;
                final int n10 = n5 >> 8;
                final int n11 = ((n3 & 0xFF00FF) * n9 + (n4 & 0xFF00FF) * n10 & 0xFF00FF00) + ((n3 & 0xFF00) * n9 + (n4 & 0xFF00) * n10 & 0xFF0000) >>> 8;
                for (int j = -n; j < 0; ++j) {
                    Rasterizer2D.Rasterizer2D_pixels[n8++] = (n11 | 0xFF000000);
                }
                n8 += n7;
                n5 += n6;
            }
        }
    }
    
    public static void gz(final int n, final int n2, int n3, int n4, final int n5, final int n6, final byte[] array, final int n7, final boolean b) {
        if (n + n3 < 0 || n2 + n4 < 0) {
            return;
        }
        if (n >= Rasterizer2D.Rasterizer2D_width || n2 >= Rasterizer2D.Rasterizer2D_height) {
            return;
        }
        int n8 = 0;
        int n9 = 0;
        if (n < 0) {
            n8 -= n;
            n3 += n;
        }
        if (n2 < 0) {
            n9 -= n2;
            n4 += n2;
        }
        if (n + n3 > Rasterizer2D.Rasterizer2D_width) {
            n3 = Rasterizer2D.Rasterizer2D_width - n;
        }
        if (n2 + n4 > Rasterizer2D.Rasterizer2D_height) {
            n4 = Rasterizer2D.Rasterizer2D_height - n2;
        }
        final int n10 = array.length / n7;
        final int n11 = Rasterizer2D.Rasterizer2D_width - n3;
        final int n12 = n5 >>> 24;
        final int n13 = n6 >>> 24;
        if (!b || (n12 == 255 && n13 == 255)) {
            int n14 = (n2 + n9) * Rasterizer2D.Rasterizer2D_width + n + n8;
            for (int i = n2 + n9; i < n2 + n9 + n4; ++i) {
                for (int j = n + n8; j < n + n8 + n3; ++j) {
                    if (array[(i - n2) % n10 * n7 + (j - n) % n7] != 0) {
                        Rasterizer2D.Rasterizer2D_pixels[n14++] = n6;
                    }
                    else {
                        Rasterizer2D.Rasterizer2D_pixels[n14++] = n5;
                    }
                }
                n14 += n11;
            }
        }
        else {
            int n15 = (n2 + n9) * Rasterizer2D.Rasterizer2D_width + n + n8;
            for (int k = n2 + n9; k < n2 + n9 + n4; ++k) {
                for (int l = n + n8; l < n + n8 + n3; ++l) {
                    final int n16 = (k - n2) % n10;
                    final int n17 = (l - n) % n7;
                    int n18 = n5;
                    if (array[n16 * n7 + n17] != 0) {
                        n18 = n6;
                    }
                    final int n19 = n18 >>> 24;
                    final int n20 = 255 - n19;
                    final int n21 = Rasterizer2D.Rasterizer2D_pixels[n15];
                    Rasterizer2D.Rasterizer2D_pixels[n15++] = ((n18 & 0xB5F71DCE) * n19 + (n21 & 0xFF00FF) * n20 & 0xFF00FF00) + ((n18 & 0x609EF806) * n19 + (n21 & 0x1229844) * n20 & 0x68DEFCA) >> 8;
                }
                n15 += n11;
            }
        }
    }
    
    public static void ff(final int[] array) {
        array[0] = Rasterizer2D.Rasterizer2D_xClipStart;
        array[1] = Rasterizer2D.Rasterizer2D_yClipStart;
        array[2] = Rasterizer2D.Rasterizer2D_xClipEnd;
        array[3] = Rasterizer2D.Rasterizer2D_yClipEnd;
    }
    
    public static void go(final int n, int n2, int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return;
        }
        if (n5 == 256) {
            drawCircle(n, n2, n3, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        final int n6 = 256 - n5;
        final int n7 = (n4 >> 16 & 0xFF) * n5;
        final int n8 = (n4 >> 8 & 0xFF) * n5;
        final int n9 = (n4 & 0xFF) * n5;
        int rasterizer2D_yClipStart = n2 - n3;
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        int rasterizer2D_yClipEnd = n2 + n3 + 1;
        if (rasterizer2D_yClipEnd > Rasterizer2D.Rasterizer2D_yClipEnd) {
            rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        int i = rasterizer2D_yClipStart;
        final int n10 = n3 * n3;
        int n11 = 0;
        int n12 = n2 - i;
        int n13 = n12 * n12;
        int n14 = n13 - n12;
        if (n2 > rasterizer2D_yClipEnd) {
            n2 = rasterizer2D_yClipEnd;
        }
        while (i < n2) {
            while (n14 <= n10 || n13 <= n10) {
                n13 += n11 + n11;
                n14 += n11 + ++n11;
            }
            int rasterizer2D_xClipStart = n - n11 + 1;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int rasterizer2D_xClipEnd = n + n11;
            if (rasterizer2D_xClipEnd > Rasterizer2D.Rasterizer2D_xClipEnd) {
                rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_xClipEnd;
            }
            int n15 = rasterizer2D_xClipStart + i * Rasterizer2D.Rasterizer2D_width;
            for (int j = rasterizer2D_xClipStart; j < rasterizer2D_xClipEnd; ++j) {
                Rasterizer2D.Rasterizer2D_pixels[n15++] = (n7 + (Rasterizer2D.Rasterizer2D_pixels[n15] >> 16 & 0xFF) * n6 >> 8 << 16) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n15] >> 8 & 0xFF) * n6 >> 8 << 8) + (n9 + (Rasterizer2D.Rasterizer2D_pixels[n15] & 0xFF) * n6 >> 8);
            }
            ++i;
            n13 -= n12 + --n12;
            n14 -= n12 + n12;
        }
        int n16 = n3;
        int n17 = -n12;
        final int n18 = n17 * n17 + n10;
        for (int n19 = n18 - n16, n20 = n18 - n17; i < rasterizer2D_yClipEnd; ++i, n20 += n17 + n17, n19 += n17 + ++n17) {
            while (n20 > n10 && n19 > n10) {
                n20 -= n16 + --n16;
                n19 -= n16 + n16;
            }
            int rasterizer2D_xClipStart2 = n - n16;
            if (rasterizer2D_xClipStart2 < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart2 = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int n21 = n + n16;
            if (n21 > Rasterizer2D.Rasterizer2D_xClipEnd - 1) {
                n21 = Rasterizer2D.Rasterizer2D_xClipEnd - 1;
            }
            int n22 = rasterizer2D_xClipStart2 + i * Rasterizer2D.Rasterizer2D_width;
            for (int k = rasterizer2D_xClipStart2; k <= n21; ++k) {
                Rasterizer2D.Rasterizer2D_pixels[n22++] = (n7 + (Rasterizer2D.Rasterizer2D_pixels[n22] >> 16 & 0xFF) * n6 >> 8 << 16) + (n8 + (Rasterizer2D.Rasterizer2D_pixels[n22] >> 8 & 0xFF) * n6 >> 8 << 8) + (n9 + (Rasterizer2D.Rasterizer2D_pixels[n22] & 0xFF) * n6 >> 8);
            }
        }
    }
    
    static void gr(final int n, int n2, int n3, final int n4) {
        if (n3 == 0) {
            Rasterizer2D_setPixel(n, n2, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        int rasterizer2D_yClipStart = n2 - n3;
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        int rasterizer2D_yClipEnd = n2 + n3 + 1;
        if (rasterizer2D_yClipEnd > Rasterizer2D.Rasterizer2D_yClipEnd) {
            rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_yClipEnd;
        }
        int i = rasterizer2D_yClipStart;
        final int n5 = n3 * n3;
        int n6 = 0;
        int n7 = n2 - i;
        int n8 = n7 * n7;
        int n9 = n8 - n7;
        if (n2 > rasterizer2D_yClipEnd) {
            n2 = rasterizer2D_yClipEnd;
        }
        while (i < n2) {
            while (n9 <= n5 || n8 <= n5) {
                n8 += n6 + n6;
                n9 += n6 + ++n6;
            }
            int rasterizer2D_xClipStart = n - n6 + 1;
            if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int rasterizer2D_xClipEnd = n + n6;
            if (rasterizer2D_xClipEnd > Rasterizer2D.Rasterizer2D_xClipEnd) {
                rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_xClipEnd;
            }
            int n10 = rasterizer2D_xClipStart + i * Rasterizer2D.Rasterizer2D_width;
            for (int j = rasterizer2D_xClipStart; j < rasterizer2D_xClipEnd; ++j) {
                Rasterizer2D.Rasterizer2D_pixels[n10++] = n4;
            }
            ++i;
            n8 -= n7 + --n7;
            n9 -= n7 + n7;
        }
        int n11 = n3;
        int n12 = i - n2;
        final int n13 = n12 * n12 + n5;
        for (int n14 = n13 - n11, n15 = n13 - n12; i < rasterizer2D_yClipEnd; ++i, n15 += n12 + n12, n14 += n12 + ++n12) {
            while (n15 > n5 && n14 > n5) {
                n15 -= n11 + --n11;
                n14 -= n11 + n11;
            }
            int rasterizer2D_xClipStart2 = n - n11;
            if (rasterizer2D_xClipStart2 < Rasterizer2D.Rasterizer2D_xClipStart) {
                rasterizer2D_xClipStart2 = Rasterizer2D.Rasterizer2D_xClipStart;
            }
            int n16 = n + n11;
            if (n16 > Rasterizer2D.Rasterizer2D_xClipEnd - 1) {
                n16 = Rasterizer2D.Rasterizer2D_xClipEnd - 1;
            }
            int n17 = rasterizer2D_xClipStart2 + i * Rasterizer2D.Rasterizer2D_width;
            for (int k = rasterizer2D_xClipStart2; k <= n16; ++k) {
                Rasterizer2D.Rasterizer2D_pixels[n17++] = n4;
            }
        }
    }
    
    public static void fq(final int rasterizer2D_xClipStart, final int rasterizer2D_yClipStart, final int rasterizer2D_xClipEnd, final int rasterizer2D_yClipEnd) {
        if (Rasterizer2D.Rasterizer2D_xClipStart < rasterizer2D_xClipStart) {
            Rasterizer2D.Rasterizer2D_xClipStart = rasterizer2D_xClipStart;
        }
        if (Rasterizer2D.Rasterizer2D_yClipStart < rasterizer2D_yClipStart) {
            Rasterizer2D.Rasterizer2D_yClipStart = rasterizer2D_yClipStart;
        }
        if (Rasterizer2D.Rasterizer2D_xClipEnd > rasterizer2D_xClipEnd) {
            Rasterizer2D.Rasterizer2D_xClipEnd = rasterizer2D_xClipEnd;
        }
        if (Rasterizer2D.Rasterizer2D_yClipEnd > rasterizer2D_yClipEnd) {
            Rasterizer2D.Rasterizer2D_yClipEnd = rasterizer2D_yClipEnd;
        }
    }
    
    public static void fz() {
        Rasterizer2D.Rasterizer2D_xClipStart = 0;
        Rasterizer2D.Rasterizer2D_yClipStart = 0;
        Rasterizer2D.Rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_width;
        Rasterizer2D.Rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_height;
    }
    
    public static void gs(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, int n3, final int n4) {
        if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
            n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
            rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
        }
        n3 = ((n3 & 0xAAA5D6B0) * n4 >> 8 & 0x476CFE36) + ((n3 & 0x37A5FB58) * n4 >> 8 & 0xFF00);
        final int n5 = 256 - n4;
        final int n6 = Rasterizer2D.Rasterizer2D_width - n;
        int n7 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
        for (int i = 0; i < n2; ++i) {
            for (int j = -n; j < 0; ++j) {
                final int n8 = Rasterizer2D.Rasterizer2D_pixels[n7];
                Rasterizer2D.Rasterizer2D_pixels[n7++] = n3 + (((n8 & 0xB6C101DC) * n5 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n5 >> 8 & 0x31D04253));
            }
            n7 += n6;
        }
    }
    
    public static void method2578() {
        if (Rasterizer2D.field4108 == null) {
            return;
        }
        for (int length = Rasterizer2D.field4108.length, i = 0; i < length; ++i) {
            if (i % Rasterizer2D.Rasterizer2D_width < Rasterizer2D.Rasterizer2D_width / 2 && Rasterizer2D.field4108[i] > 0.0f) {
                final int n = (int)(255.0f * ((750000.0f / (10000.0f - 9925.0f * Rasterizer2D.field4108[i]) - 75.0f) / 9925.0f));
                Rasterizer2D.Rasterizer2D_pixels[i] = (n << 16 | n << 8 | n);
            }
        }
    }
    
    public static void fj(final int[] array) {
        Rasterizer2D.Rasterizer2D_xClipStart = array[0];
        Rasterizer2D.Rasterizer2D_yClipStart = array[1];
        Rasterizer2D.Rasterizer2D_xClipEnd = array[2];
        Rasterizer2D.Rasterizer2D_yClipEnd = array[3];
    }
    
    public static void Rasterizer2D_expandClip(final int rasterizer2D_xClipStart, final int rasterizer2D_yClipStart, final int rasterizer2D_xClipEnd, final int rasterizer2D_yClipEnd) {
        if (Rasterizer2D.Rasterizer2D_xClipStart < rasterizer2D_xClipStart) {
            Rasterizer2D.Rasterizer2D_xClipStart = rasterizer2D_xClipStart;
        }
        if (Rasterizer2D.Rasterizer2D_yClipStart < rasterizer2D_yClipStart) {
            Rasterizer2D.Rasterizer2D_yClipStart = rasterizer2D_yClipStart;
        }
        if (Rasterizer2D.Rasterizer2D_xClipEnd > rasterizer2D_xClipEnd) {
            Rasterizer2D.Rasterizer2D_xClipEnd = rasterizer2D_xClipEnd;
        }
        if (Rasterizer2D.Rasterizer2D_yClipEnd > rasterizer2D_yClipEnd) {
            Rasterizer2D.Rasterizer2D_yClipEnd = rasterizer2D_yClipEnd;
        }
    }
    
    public static void ho() {
        if (Rasterizer2D.field4108 == null) {
            return;
        }
        if (Rasterizer2D.Rasterizer2D_xClipStart == 0 && Rasterizer2D.Rasterizer2D_xClipEnd == Rasterizer2D.Rasterizer2D_width && Rasterizer2D.Rasterizer2D_yClipStart == 0 && Rasterizer2D.Rasterizer2D_yClipEnd == Rasterizer2D.Rasterizer2D_height) {
            final int length = Rasterizer2D.field4108.length;
            int n;
            int i;
            for (n = length - (length & 0x7), i = 0; i < n; Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f, Rasterizer2D.field4108[i++] = 0.0f) {}
            while (i < length) {
                Rasterizer2D.field4108[i++] = 0.0f;
            }
        }
        else {
            final int n2 = Rasterizer2D.Rasterizer2D_xClipEnd - Rasterizer2D.Rasterizer2D_xClipStart;
            final int n3 = Rasterizer2D.Rasterizer2D_yClipEnd - Rasterizer2D.Rasterizer2D_yClipStart;
            final int n4 = Rasterizer2D.Rasterizer2D_width - n2;
            final int n5 = Rasterizer2D.Rasterizer2D_xClipStart + Rasterizer2D.Rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
            final int n6 = n2 >> 3;
            final int n7 = n2 & 0x7;
            int n8 = n5 - 1;
            for (int j = -n3; j < 0; ++j) {
                if (n6 > 0) {
                    int n9 = n6;
                    do {
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                        Rasterizer2D.field4108[++n8] = 0.0f;
                    } while (--n9 > 0);
                }
                if (n7 > 0) {
                    int n10 = n7;
                    do {
                        Rasterizer2D.field4108[++n8] = 0.0f;
                    } while (--n10 > 0);
                }
                n8 += n4;
            }
        }
    }
    
    public static void hg(int i, int j, final int n, final int[] array, final int[] array2) {
        int n2 = i + j * Rasterizer2D.Rasterizer2D_width;
        int n3;
        for (j = 0; j < array.length; ++j) {
            n3 = n2 + array[j];
            for (i = -array2[j]; i < 0; ++i) {
                Rasterizer2D.Rasterizer2D_pixels[n3++] = n;
            }
            n2 += Rasterizer2D.Rasterizer2D_width;
        }
    }
    
    public static void gj(int rasterizer2D_xClipStart, int rasterizer2D_yClipStart, int n, int n2, int n3, final int n4) {
        if (rasterizer2D_xClipStart < Rasterizer2D.Rasterizer2D_xClipStart) {
            n -= Rasterizer2D.Rasterizer2D_xClipStart - rasterizer2D_xClipStart;
            rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart < Rasterizer2D.Rasterizer2D_yClipStart) {
            n2 -= Rasterizer2D.Rasterizer2D_yClipStart - rasterizer2D_yClipStart;
            rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (rasterizer2D_xClipStart + n > Rasterizer2D.Rasterizer2D_xClipEnd) {
            n = Rasterizer2D.Rasterizer2D_xClipEnd - rasterizer2D_xClipStart;
        }
        if (rasterizer2D_yClipStart + n2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
            n2 = Rasterizer2D.Rasterizer2D_yClipEnd - rasterizer2D_yClipStart;
        }
        n3 = ((n3 & 0xFF00FF) * n4 >> 8 & 0xFF00FF) + ((n3 & 0xFF00) * n4 >> 8 & 0xFF00);
        final int n5 = 256 - n4;
        final int n6 = Rasterizer2D.Rasterizer2D_width - n;
        int n7 = rasterizer2D_xClipStart + rasterizer2D_yClipStart * Rasterizer2D.Rasterizer2D_width;
        for (int i = 0; i < n2; ++i) {
            for (int j = -n; j < 0; ++j) {
                final int n8 = Rasterizer2D.Rasterizer2D_pixels[n7];
                Rasterizer2D.Rasterizer2D_pixels[n7++] = n3 + (((n8 & 0xFF00FF) * n5 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n5 >> 8 & 0xFF00));
            }
            n7 += n6;
        }
    }
    
    public static void hj(final int n, final int n2, final int n3, final int n4, final int n5) {
        Rasterizer2D_drawHorizontalLine(n, n2, n3, n5);
        Rasterizer2D_drawHorizontalLine(n, n2 + n4 - 1, n3, n5);
        Rasterizer2D_drawVerticalLine(n, n2, n4, n5);
        Rasterizer2D_drawVerticalLine(n + n3 - 1, n2, n4, n5);
    }
    
    public static void Rasterizer2D_drawRectangleAlpha(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        Rasterizer2D_drawHorizontalLineAlpha(n, n2, n3, n5, n6);
        Rasterizer2D_drawHorizontalLineAlpha(n, n2 + n4 - 1, n3, n5, n6);
        if (n4 >= 3) {
            Rasterizer2D_drawVerticalLineAlpha(n, n2 + 1, n4 - 2, n5, n6);
            Rasterizer2D_drawVerticalLineAlpha(n + n3 - 1, n2 + 1, n4 - 2, n5, n6);
        }
    }
}
