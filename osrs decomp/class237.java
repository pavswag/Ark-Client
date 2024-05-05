// 
// Decompiled by Procyon v0.5.36
// 

public class class237 extends class220
{
    class237(final Clips clips) {
        super(clips);
    }
    
    final void cs(final int[] array, final float[] array2, final int n, final int n2, final int n3, final float n4) {
        if (method1368(array2[n], n4)) {
            final int n5 = array[n];
            array[n] = n2 + ((n5 & 0x207783F5) * n3 >> 8 & 0xFF00FF) + ((n5 & 0xFF00) * n3 >> 8 & 0xFF00);
        }
    }
    
    final void method1363(final int[] array, final float[] array2, final int n, final int n2, final int n3, final float n4) {
        if (method1368(array2[n], n4)) {
            final int n5 = array[n];
            array[n] = n2 + ((n5 & 0xFF00FF) * n3 >> 8 & 0xFF00FF) + ((n5 & 0xBDFA1270) * n3 >> 8 & 0xFF00);
        }
    }
    
    final void ca(final int[] array, final float[] array2, final int n, final int n2, final int n3, final int n4, final float n5) {
        if (method1368(array2[n], n5)) {
            final int n6 = this.aq[(n2 & (n2 >> 31 & 0x1) - 1) >> 8];
            final int n7 = ((n6 & 0x4EBF622) * n4 >> 8 & 0xFF00FF) + ((n6 & 0xFF00) * n4 >> 8 & 0xFF00);
            final int n8 = array[n];
            array[n] = n7 + ((n8 & 0xCF8CED3) * n3 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n3 >> 8 & 0xFF00);
        }
    }
    
    static final void method1370(final int[] array, final float[] array2, final int[] array3, final int n, final int n2, final int n3, final float n4) {
        final int n5 = array3[(n3 & 0xFC0) + (n3 >>> 26)];
        if (n5 == 0) {
            return;
        }
        if (method1368(array2[n], n4)) {
            array[n] = ((n5 & 0xFF00FF) * n2 & 0xFF00FF00) + ((n5 & 0xFF00) * n2 & 0xFF0000) >> 8;
            array2[n] = n4;
        }
    }
    
    static final boolean cr(final float n, final float n2) {
        return n2 > n;
    }
    
    final void ce(final int[] array, final float[] array2, final int n, final int n2, final float n3) {
        if (method1368(array2[n], n3)) {
            array[n] = this.aq[(n2 & (n2 >> 31 & 0x1) - 1) >> 8];
            array2[n] = n3;
        }
    }
    
    @Override
    void bb(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        final float n19 = n8 - n7;
        final float n20 = n9 - n7;
        int n21;
        if (n3 != n2) {
            n21 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n21 = 0;
        }
        int n22;
        if (n2 != n) {
            n22 = (n13 << 14) / n14;
        }
        else {
            n22 = 0;
        }
        int n23;
        if (n3 != n) {
            n23 = (n15 << 14) / n16;
        }
        else {
            n23 = 0;
        }
        final int n24 = n13 * n16 - n15 * n14;
        if (n24 == 0) {
            return;
        }
        final int n25 = (n17 * n16 - n18 * n14 << 8) / n24;
        final int n26 = (n18 * n13 - n17 * n15 << 8) / n24;
        final float n27 = (n19 * n16 - n20 * n14) / n24;
        final float n28 = (n20 * n13 - n19 * n15) / n24;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n29 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n29) {
                return;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            n10 = (n10 << 8) - n25 * n4 + n25;
            n7 = n7 - n27 * n4 + n27;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n21 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n23 >= n22) && (n != n2 || n23 <= n21)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n5 += n21;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n5 += n21;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n23 >= n22) && (n != n3 || n21 <= n22)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n25, n7, n27);
                        n5 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n21;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n5 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n6 += n21;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n29) {
                return;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            if (n > n29) {
                n = n29;
            }
            n11 = (n11 << 8) - n25 * n5 + n25;
            n8 = n8 - n27 * n5 + n27;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n23 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n22 >= n21) && (n2 != n3 || n22 <= n23)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n6 += n23;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n6 += n23;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n23 * n;
                    n = 0;
                }
                if (n22 < n21) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n6 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n4 += n23;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n25, n8, n27);
                    n6 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                    n4 += n23;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
        }
        else {
            if (n3 >= n29) {
                return;
            }
            if (n > n29) {
                n = n29;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            n12 = (n12 << 8) - n25 * n6 + n25;
            n9 = n9 - n27 * n6 + n27;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n22 * n;
                    n = 0;
                }
                if (n21 < n23) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n4 += n22;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n4 += n22;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n22 * n2;
                    n2 = 0;
                }
                if (n21 < n23) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n4 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n22;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n25, n9, n27);
                    n4 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n22;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
        }
    }
    
    static final void cb(final int[] array, final float[] array2, final int[] array3, final int n, final int n2, final int n3, final float n4) {
        final int n5 = array3[(n3 & 0x12B6A44D) + (n3 >>> 26)];
        if (n5 == 0) {
            return;
        }
        if (method1368(array2[n], n4)) {
            array[n] = ((n5 & 0xFF00FF) * n2 & 0xC16A9FF7) + ((n5 & 0x1F20903B) * n2 & 0x5C8E0169) >> 8;
            array2[n] = n4;
        }
    }
    
    final void ch(final int[] array, final int[] array2, int n, final int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9, int n10, int n11, int n12, final int n13, final int n14, final int n15) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        final int n16 = n5 - n4;
        if (this.an) {
            final int n17 = n4 - this.al.field2231 * 93675259;
            n10 += n13 * n17;
            n11 += n14 * n17;
            n12 += n15 * n17;
            final int n18 = n12 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n10 / n18;
                n20 = n11 / n18;
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n10 += n13 * n16;
            n11 += n14 * n16;
            n12 += n15 * n16;
            final int n21 = n12 >> 12;
            int n22;
            int n23;
            if (n21 != 0) {
                n22 = n10 / n21;
                n23 = n11 / n21;
            }
            else {
                n22 = 0;
                n23 = 0;
            }
            n = (n19 << 20) + n20;
            final int n24 = ((n22 - n19) / n16 << 20) + (n23 - n20) / n16;
            int n25 = n16 >> 3;
            n7 <<= 3;
            int n26 = n6 >> 8;
            if (this.af) {
                if (n25 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n27 = n5 - n4 & 0x7;
                if (n27 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n27 > 0);
                }
            }
            else {
                if (n25 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n28 = n5 - n4 & 0x7;
                if (n28 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n28 > 0);
                }
            }
        }
        else {
            final int n29 = n4 - this.al.field2231 * 93675259;
            n10 += n13 * n29;
            n11 += n14 * n29;
            n12 += n15 * n29;
            final int n30 = n12 >> 14;
            int n31;
            int n32;
            if (n30 != 0) {
                n31 = n10 / n30;
                n32 = n11 / n30;
            }
            else {
                n31 = 0;
                n32 = 0;
            }
            n10 += n13 * n16;
            n11 += n14 * n16;
            n12 += n15 * n16;
            final int n33 = n12 >> 14;
            int n34;
            int n35;
            if (n33 != 0) {
                n34 = n10 / n33;
                n35 = n11 / n33;
            }
            else {
                n34 = 0;
                n35 = 0;
            }
            n = (n31 << 18) + n32;
            final int n36 = ((n34 - n31) / n16 << 18) + (n35 - n32) / n16;
            int n37 = n16 >> 3;
            n7 <<= 3;
            int n38 = n6 >> 8;
            if (this.af) {
                if (n37 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        n6 += n7;
                        n38 = n6 >> 8;
                    } while (--n37 > 0);
                }
                int n39 = n5 - n4 & 0x7;
                if (n39 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                    } while (--n39 > 0);
                }
            }
            else {
                if (n37 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        n6 += n7;
                        n38 = n6 >> 8;
                    } while (--n37 > 0);
                }
                int n40 = n5 - n4 & 0x7;
                if (n40 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                    } while (--n40 > 0);
                }
            }
        }
    }
    
    final void cn(final int[] array, final float[] array2, final int n, final int n2, final int n3, final float n4) {
        if (method1368(array2[n], n4)) {
            final int n5 = array[n];
            array[n] = n2 + ((n5 & 0xFF00FF) * n3 >> 8 & 0xFF00FF) + ((n5 & 0xFF00) * n3 >> 8 & 0xFF00);
        }
    }
    
    final void bw(final int[] array, final float[] array2, final int n, final int n2, final float n3) {
        final int method1368 = method1368(array2[n], n3) ? 1 : 0;
        final int n4 = 1 - method1368;
        array[n] = method1368 * n2 + n4 * array[n];
        array2[n] = method1368 * n3 + n4 * array2[n];
    }
    
    final void cw(final int[] array, final int[] array2, int n, final int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9, int n10, int n11, int n12, final int n13, final int n14, final int n15) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        final int n16 = n5 - n4;
        if (this.an) {
            final int n17 = n4 - this.al.field2231 * 93675259;
            n10 += (n13 >> 3) * n17;
            n11 += (n14 >> 3) * n17;
            n12 += (n15 >> 3) * n17;
            final int n18 = n12 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n10 / n18;
                n20 = n11 / n18;
                if (n19 < 0) {
                    n19 = 0;
                }
                else if (n19 > 4032) {
                    n19 = 4032;
                }
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n10 += n13;
            n11 += n14;
            n12 += n15;
            final int n21 = n12 >> 12;
            int n22;
            int n23;
            if (n21 != 0) {
                n22 = n10 / n21;
                n23 = n11 / n21;
                if (n22 < 0) {
                    n22 = 0;
                }
                else if (n22 > 4032) {
                    n22 = 4032;
                }
            }
            else {
                n22 = 0;
                n23 = 0;
            }
            n = (n19 << 20) + n20;
            int n24 = (n22 - n19 >> 3 << 20) + (n23 - n20 >> 3);
            int n25 = n16 >> 3;
            n7 <<= 3;
            int n26 = n6 >> 8;
            if (this.af) {
                if (n25 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        final int n27 = n22;
                        final int n28 = n23;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n29 = n12 >> 12;
                        if (n29 != 0) {
                            n22 = n10 / n29;
                            n23 = n11 / n29;
                            if (n22 < 0) {
                                n22 = 0;
                            }
                            else if (n22 > 4032) {
                                n22 = 4032;
                            }
                        }
                        else {
                            n22 = 0;
                            n23 = 0;
                        }
                        n = (n27 << 20) + n28;
                        n24 = (n22 - n27 >> 3 << 20) + (n23 - n28 >> 3);
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n30 = n5 - n4 & 0x7;
                if (n30 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n30 > 0);
                }
            }
            else {
                if (n25 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        final int n31 = n22;
                        final int n32 = n23;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n33 = n12 >> 12;
                        if (n33 != 0) {
                            n22 = n10 / n33;
                            n23 = n11 / n33;
                            if (n22 < 0) {
                                n22 = 0;
                            }
                            else if (n22 > 4032) {
                                n22 = 4032;
                            }
                        }
                        else {
                            n22 = 0;
                            n23 = 0;
                        }
                        n = (n31 << 20) + n32;
                        n24 = (n22 - n31 >> 3 << 20) + (n23 - n32 >> 3);
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n34 = n5 - n4 & 0x7;
                if (n34 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n34 > 0);
                }
            }
        }
        else {
            final int n35 = n4 - this.al.field2231 * 93675259;
            n10 += (n13 >> 3) * n35;
            n11 += (n14 >> 3) * n35;
            n12 += (n15 >> 3) * n35;
            final int n36 = n12 >> 14;
            int n37;
            int n38;
            if (n36 != 0) {
                n37 = n10 / n36;
                n38 = n11 / n36;
                if (n37 < 0) {
                    n37 = 0;
                }
                else if (n37 > 16256) {
                    n37 = 16256;
                }
            }
            else {
                n37 = 0;
                n38 = 0;
            }
            n10 += n13;
            n11 += n14;
            n12 += n15;
            final int n39 = n12 >> 14;
            int n40;
            int n41;
            if (n39 != 0) {
                n40 = n10 / n39;
                n41 = n11 / n39;
                if (n40 < 0) {
                    n40 = 0;
                }
                else if (n40 > 16256) {
                    n40 = 16256;
                }
            }
            else {
                n40 = 0;
                n41 = 0;
            }
            n = (n37 << 18) + n38;
            int n42 = (n40 - n37 >> 3 << 18) + (n41 - n38 >> 3);
            int n43 = n16 >> 3;
            n7 <<= 3;
            int n44 = n6 >> 8;
            if (this.af) {
                if (n43 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        final int n45 = n40;
                        final int n46 = n41;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n47 = n12 >> 14;
                        if (n47 != 0) {
                            n40 = n10 / n47;
                            n41 = n11 / n47;
                            if (n40 < 0) {
                                n40 = 0;
                            }
                            else if (n40 > 16256) {
                                n40 = 16256;
                            }
                        }
                        else {
                            n40 = 0;
                            n41 = 0;
                        }
                        n = (n45 << 18) + n46;
                        n42 = (n40 - n45 >> 3 << 18) + (n41 - n46 >> 3);
                        n6 += n7;
                        n44 = n6 >> 8;
                    } while (--n43 > 0);
                }
                int n48 = n5 - n4 & 0x7;
                if (n48 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                    } while (--n48 > 0);
                }
            }
            else {
                if (n43 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        final int n49 = n40;
                        final int n50 = n41;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n51 = n12 >> 14;
                        if (n51 != 0) {
                            n40 = n10 / n51;
                            n41 = n11 / n51;
                            if (n40 < 0) {
                                n40 = 0;
                            }
                            else if (n40 > 16256) {
                                n40 = 16256;
                            }
                        }
                        else {
                            n40 = 0;
                            n41 = 0;
                        }
                        n = (n49 << 18) + n50;
                        n42 = (n40 - n49 >> 3 << 18) + (n41 - n50 >> 3);
                        n6 += n7;
                        n44 = n6 >> 8;
                    } while (--n43 > 0);
                }
                int n52 = n5 - n4 & 0x7;
                if (n52 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                    } while (--n52 > 0);
                }
            }
        }
    }
    
    public static void cw(final class237 class237, final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9) {
        if (class237.al.field2234) {
            if (n5 > class237.al.field2233 * 571147771) {
                n5 = class237.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        if (class237.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (class237.al.field2225 * 918495667 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = class237.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = class237.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        class237.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n10 = class237.al.field2225 * 918495667;
                final int n11 = 256 - class237.al.field2225 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = class237.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n11 >> 8 & 0xFF00);
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = class237.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n11 >> 8 & 0xFF00);
                    do {
                        class237.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (class237.al.field2225 * 918495667 == 0) {
            do {
                class237.method1375(array, class237.by, n, n6, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n12 = class237.al.field2225 * 918495667;
            final int n13 = 256 - class237.al.field2225 * 918495667;
            do {
                class237.method1364(array, class237.by, n, n2, n12, n13, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
    }
    
    static final void cv(final int[] array, final float[] array2, final int[] array3, final int n, final int n2, final int n3, final float n4) {
        final int n5 = array3[(n3 & 0xFC0) + (n3 >>> 26)];
        if (n5 == 0) {
            return;
        }
        if (method1368(array2[n], n4)) {
            array[n] = ((n5 & 0xFF00FF) * n2 & 0xFF00FF00) + ((n5 & 0xFF00) * n2 & 0xFF0000) >> 8;
            array2[n] = n4;
        }
    }
    
    @Override
    void vmethod1362(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, -1478659184);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, 1493057847);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-13));
        final int n23 = n5 - n4;
        final int n24 = n2 - n;
        final int n25 = n6 - n4;
        final int n26 = n3 - n;
        final int n27 = n11 - n10;
        final int n28 = n12 - n10;
        int n29 = 0;
        if (n2 != n) {
            n29 = (n5 - n4 << 14) / (n2 - n);
        }
        int n30 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n31 = 0;
        if (n3 != n) {
            n31 = (n4 - n6 << 14) / (n - n3);
        }
        final int n32 = n23 * n26 - n25 * n24;
        if (n32 == 0) {
            return;
        }
        final int n33 = (n27 * n26 - n28 * n24 << 9) / n32;
        final int n34 = (n28 * n23 - n27 * n25 << 9) / n32;
        final float n35 = n8 - n7;
        final float n36 = n9 - n7;
        final float n37 = (n35 * n26 - n36 * n24) / n32;
        final float n38 = (n36 * n23 - n35 * n25) / n32;
        final int n39 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n40 = n15 * n16 - n18 * n13 << 14;
        final int n41 = (int)(((long)(n18 * n19 - n21 * n16) << 14) / n39);
        final int n42 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n39);
        final int n43 = n14 * n16 - n17 * n13 << 14;
        final int n44 = (int)(((long)(n17 * n19 - n20 * n16) << 14) / n39);
        final int n45 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n39);
        final int n46 = n17 * n15 - n14 * n18 << 14;
        final int n47 = (int)(((long)(n20 * n18 - n17 * n21) << 14) / n39);
        final int n48 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n39);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n49 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n49) {
                return;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            n7 = n7 - n37 * n4 + n37;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n7 -= n38 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n40 + n42 * n50;
                int n52 = n43 + n45 * n50;
                int n53 = n46 + n48 * n50;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n7 -= n38 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n54 = n - this.al.field2229 * 1666539507;
                int n55 = n40 + n42 * n54;
                int n56 = n43 + n45 * n54;
                int n57 = n46 + n48 * n54;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n49) {
                return;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            if (n > n49) {
                n = n49;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            n8 = n8 - n37 * n5 + n37;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n8 -= n38 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n40 + n42 * n58;
                int n60 = n43 + n45 * n58;
                int n61 = n46 + n48 * n58;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n8 -= n38 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n62 = n2 - this.al.field2229 * 1666539507;
                int n63 = n40 + n42 * n62;
                int n64 = n43 + n45 * n62;
                int n65 = n46 + n48 * n62;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
            }
        }
        else {
            if (n3 >= n49) {
                return;
            }
            if (n > n49) {
                n = n49;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            n9 = n9 - n37 * n6 + n37;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n9 -= n38 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n40 + n42 * n66;
                int n68 = n43 + n45 * n66;
                int n69 = n46 + n48 * n66;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n9 -= n38 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n70 = n3 - this.al.field2229 * 1666539507;
                int n71 = n40 + n42 * n70;
                int n72 = n43 + n45 * n70;
                int n73 = n46 + n48 * n70;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
            }
        }
    }
    
    final void cj(final int[] array, final int[] array2, int n, final int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9, int n10, int n11, int n12, final int n13, final int n14, final int n15) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        final int n16 = n5 - n4;
        if (this.an) {
            final int n17 = n4 - this.al.field2231 * 1208839464;
            n10 += n13 * n17;
            n11 += n14 * n17;
            n12 += n15 * n17;
            final int n18 = n12 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n10 / n18;
                n20 = n11 / n18;
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n10 += n13 * n16;
            n11 += n14 * n16;
            n12 += n15 * n16;
            final int n21 = n12 >> 12;
            int n22;
            int n23;
            if (n21 != 0) {
                n22 = n10 / n21;
                n23 = n11 / n21;
            }
            else {
                n22 = 0;
                n23 = 0;
            }
            n = (n19 << 20) + n20;
            final int n24 = ((n22 - n19) / n16 << 20) + (n23 - n20) / n16;
            int n25 = n16 >> 3;
            n7 <<= 3;
            int n26 = n6 >> 8;
            if (this.af) {
                if (n25 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n27 = n5 - n4 & 0x7;
                if (n27 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n27 > 0);
                }
            }
            else {
                if (n25 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n28 = n5 - n4 & 0x7;
                if (n28 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n28 > 0);
                }
            }
        }
        else {
            final int n29 = n4 - this.al.field2231 * 93675259;
            n10 += n13 * n29;
            n11 += n14 * n29;
            n12 += n15 * n29;
            final int n30 = n12 >> 14;
            int n31;
            int n32;
            if (n30 != 0) {
                n31 = n10 / n30;
                n32 = n11 / n30;
            }
            else {
                n31 = 0;
                n32 = 0;
            }
            n10 += n13 * n16;
            n11 += n14 * n16;
            n12 += n15 * n16;
            final int n33 = n12 >> 14;
            int n34;
            int n35;
            if (n33 != 0) {
                n34 = n10 / n33;
                n35 = n11 / n33;
            }
            else {
                n34 = 0;
                n35 = 0;
            }
            n = (n31 << 18) + n32;
            final int n36 = ((n34 - n31) / n16 << 18) + (n35 - n32) / n16;
            int n37 = n16 >> 3;
            n7 <<= 3;
            int n38 = n6 >> 8;
            if (this.af) {
                if (n37 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        n6 += n7;
                        n38 = n6 >> 8;
                    } while (--n37 > 0);
                }
                int n39 = n5 - n4 & 0x7;
                if (n39 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                    } while (--n39 > 0);
                }
            }
            else {
                if (n37 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        n6 += n7;
                        n38 = n6 >> 8;
                    } while (--n37 > 0);
                }
                int n40 = n5 - n4 & 0x7;
                if (n40 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                    } while (--n40 > 0);
                }
            }
        }
    }
    
    @Override
    void be(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, final int n10) {
        final int n11 = n5 - n4;
        final int n12 = n2 - n;
        final int n13 = n6 - n4;
        final int n14 = n3 - n;
        final float n15 = n8 - n7;
        final float n16 = n9 - n7;
        int n17;
        if (n3 != n2) {
            n17 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n17 = 0;
        }
        int n18;
        if (n2 != n) {
            n18 = (n11 << 14) / n12;
        }
        else {
            n18 = 0;
        }
        int n19;
        if (n3 != n) {
            n19 = (n13 << 14) / n14;
        }
        else {
            n19 = 0;
        }
        final int n20 = n11 * n14 - n13 * n12;
        if (n20 == 0) {
            return;
        }
        final float n21 = (n15 * n14 - n16 * n12) / n20;
        final float n22 = (n16 * n11 - n15 * n13) / n20;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n23 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n23) {
                return;
            }
            if (n2 > n23) {
                n2 = n23;
            }
            if (n3 > n23) {
                n3 = n23;
            }
            n7 = n7 - n21 * n4 + n21;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n19 * n;
                    n4 -= n18 * n;
                    n7 -= n22 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n17 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n19 >= n18) && (n != n2 || n19 <= n17)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n4 >> 14, n6 >> 14, n7, n21);
                        n6 += n19;
                        n4 += n18;
                        n += class237.ae;
                        n7 += n22;
                    }
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n5 >> 14, n6 >> 14, n7, n21);
                        n6 += n19;
                        n5 += n17;
                        n += class237.ae;
                        n7 += n22;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n6 >> 14, n4 >> 14, n7, n21);
                    n6 += n19;
                    n4 += n18;
                    n += class237.ae;
                    n7 += n22;
                }
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n6 >> 14, n5 >> 14, n7, n21);
                    n6 += n19;
                    n5 += n17;
                    n += class237.ae;
                    n7 += n22;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n19 * n;
                    n4 -= n18 * n;
                    n7 -= n22 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n17 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n19 >= n18) && (n != n3 || n17 <= n18)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n4 >> 14, n5 >> 14, n7, n21);
                        n5 += n19;
                        n4 += n18;
                        n += class237.ae;
                        n7 += n22;
                    }
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n4 >> 14, n6 >> 14, n7, n21);
                        n6 += n17;
                        n4 += n18;
                        n += class237.ae;
                        n7 += n22;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n5 >> 14, n4 >> 14, n7, n21);
                    n5 += n19;
                    n4 += n18;
                    n += class237.ae;
                    n7 += n22;
                }
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n6 >> 14, n4 >> 14, n7, n21);
                    n6 += n17;
                    n4 += n18;
                    n += class237.ae;
                    n7 += n22;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n23) {
                return;
            }
            if (n3 > n23) {
                n3 = n23;
            }
            if (n > n23) {
                n = n23;
            }
            n8 = n8 - n21 * n5 + n21;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n18 * n2;
                    n5 -= n17 * n2;
                    n8 -= n22 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n19 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n18 >= n17) && (n2 != n3 || n18 <= n19)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n5 >> 14, n4 >> 14, n8, n21);
                        n4 += n18;
                        n5 += n17;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    while (--n >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n6 >> 14, n4 >> 14, n8, n21);
                        n4 += n18;
                        n6 += n19;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n4 >> 14, n5 >> 14, n8, n21);
                    n4 += n18;
                    n5 += n17;
                    n2 += class237.ae;
                    n8 += n22;
                }
                while (--n >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n4 >> 14, n6 >> 14, n8, n21);
                    n4 += n18;
                    n6 += n19;
                    n2 += class237.ae;
                    n8 += n22;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n18 * n2;
                    n5 -= n17 * n2;
                    n8 -= n22 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n19 * n;
                    n = 0;
                }
                if (n18 < n17) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n6 >> 14, n5 >> 14, n8, n21);
                        n6 += n18;
                        n5 += n17;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n4 >> 14, n5 >> 14, n8, n21);
                        n4 += n19;
                        n5 += n17;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n5 >> 14, n6 >> 14, n8, n21);
                    n6 += n18;
                    n5 += n17;
                    n2 += class237.ae;
                    n8 += n22;
                }
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n5 >> 14, n4 >> 14, n8, n21);
                    n4 += n19;
                    n5 += n17;
                    n2 += class237.ae;
                    n8 += n22;
                }
            }
        }
        else {
            if (n3 >= n23) {
                return;
            }
            if (n > n23) {
                n = n23;
            }
            if (n2 > n23) {
                n2 = n23;
            }
            n9 = n9 - n21 * n6 + n21;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n17 * n3;
                    n6 -= n19 * n3;
                    n9 -= n22 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n18 * n;
                    n = 0;
                }
                if (n17 < n19) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n5 >> 14, n6 >> 14, n9, n21);
                        n5 += n17;
                        n6 += n19;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n5 >> 14, n4 >> 14, n9, n21);
                        n5 += n17;
                        n4 += n18;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n6 >> 14, n5 >> 14, n9, n21);
                    n5 += n17;
                    n6 += n19;
                    n3 += class237.ae;
                    n9 += n22;
                }
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n4 >> 14, n5 >> 14, n9, n21);
                    n5 += n17;
                    n4 += n18;
                    n3 += class237.ae;
                    n9 += n22;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n17 * n3;
                    n6 -= n19 * n3;
                    n9 -= n22 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n18 * n2;
                    n2 = 0;
                }
                if (n17 < n19) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n4 >> 14, n6 >> 14, n9, n21);
                        n4 += n17;
                        n6 += n19;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    while (--n >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n5 >> 14, n6 >> 14, n9, n21);
                        n5 += n18;
                        n6 += n19;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n6 >> 14, n4 >> 14, n9, n21);
                    n4 += n17;
                    n6 += n19;
                    n3 += class237.ae;
                    n9 += n22;
                }
                while (--n >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n6 >> 14, n5 >> 14, n9, n21);
                    n5 += n18;
                    n6 += n19;
                    n3 += class237.ae;
                    n9 += n22;
                }
            }
        }
    }
    
    final void cp(final int[] array, final int[] array2, int n, final int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9, int n10, int n11, int n12, final int n13, final int n14, final int n15) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        final int n16 = n5 - n4;
        if (this.an) {
            final int n17 = n4 - this.al.field2231 * 93675259;
            n10 += (n13 >> 3) * n17;
            n11 += (n14 >> 3) * n17;
            n12 += (n15 >> 3) * n17;
            final int n18 = n12 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n10 / n18;
                n20 = n11 / n18;
                if (n19 < 0) {
                    n19 = 0;
                }
                else if (n19 > 4032) {
                    n19 = 4032;
                }
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n10 += n13;
            n11 += n14;
            n12 += n15;
            final int n21 = n12 >> 12;
            int n22;
            int n23;
            if (n21 != 0) {
                n22 = n10 / n21;
                n23 = n11 / n21;
                if (n22 < 0) {
                    n22 = 0;
                }
                else if (n22 > 4032) {
                    n22 = 4032;
                }
            }
            else {
                n22 = 0;
                n23 = 0;
            }
            n = (n19 << 20) + n20;
            int n24 = (n22 - n19 >> 3 << 20) + (n23 - n20 >> 3);
            int n25 = n16 >> 3;
            n7 <<= 3;
            int n26 = n6 >> 8;
            if (this.af) {
                if (n25 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        final int n27 = n22;
                        final int n28 = n23;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n29 = n12 >> 12;
                        if (n29 != 0) {
                            n22 = n10 / n29;
                            n23 = n11 / n29;
                            if (n22 < 0) {
                                n22 = 0;
                            }
                            else if (n22 > 4032) {
                                n22 = 4032;
                            }
                        }
                        else {
                            n22 = 0;
                            n23 = 0;
                        }
                        n = (n27 << 20) + n28;
                        n24 = (n22 - n27 >> 3 << 20) + (n23 - n28 >> 3);
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n30 = n5 - n4 & 0x7;
                if (n30 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n30 > 0);
                }
            }
            else {
                if (n25 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        final int n31 = n22;
                        final int n32 = n23;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n33 = n12 >> 12;
                        if (n33 != 0) {
                            n22 = n10 / n33;
                            n23 = n11 / n33;
                            if (n22 < 0) {
                                n22 = 0;
                            }
                            else if (n22 > -884908465) {
                                n22 = 4032;
                            }
                        }
                        else {
                            n22 = 0;
                            n23 = 0;
                        }
                        n = (n31 << 20) + n32;
                        n24 = (n22 - n31 >> 3 << 20) + (n23 - n32 >> 3);
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n34 = n5 - n4 & 0x7;
                if (n34 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n34 > 0);
                }
            }
        }
        else {
            final int n35 = n4 - this.al.field2231 * 1600087168;
            n10 += (n13 >> 3) * n35;
            n11 += (n14 >> 3) * n35;
            n12 += (n15 >> 3) * n35;
            final int n36 = n12 >> 14;
            int n37;
            int n38;
            if (n36 != 0) {
                n37 = n10 / n36;
                n38 = n11 / n36;
                if (n37 < 0) {
                    n37 = 0;
                }
                else if (n37 > 1293487209) {
                    n37 = 1969699038;
                }
            }
            else {
                n37 = 0;
                n38 = 0;
            }
            n10 += n13;
            n11 += n14;
            n12 += n15;
            final int n39 = n12 >> 14;
            int n40;
            int n41;
            if (n39 != 0) {
                n40 = n10 / n39;
                n41 = n11 / n39;
                if (n40 < 0) {
                    n40 = 0;
                }
                else if (n40 > 16256) {
                    n40 = 16256;
                }
            }
            else {
                n40 = 0;
                n41 = 0;
            }
            n = (n37 << 18) + n38;
            int n42 = (n40 - n37 >> 3 << 18) + (n41 - n38 >> 3);
            int n43 = n16 >> 3;
            n7 <<= 3;
            int n44 = n6 >> 8;
            if (this.af) {
                if (n43 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        final int n45 = n40;
                        final int n46 = n41;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n47 = n12 >> 14;
                        if (n47 != 0) {
                            n40 = n10 / n47;
                            n41 = n11 / n47;
                            if (n40 < 0) {
                                n40 = 0;
                            }
                            else if (n40 > 16256) {
                                n40 = -1119615222;
                            }
                        }
                        else {
                            n40 = 0;
                            n41 = 0;
                        }
                        n = (n45 << 18) + n46;
                        n42 = (n40 - n45 >> 3 << 18) + (n41 - n46 >> 3);
                        n6 += n7;
                        n44 = n6 >> 8;
                    } while (--n43 > 0);
                }
                int n48 = n5 - n4 & 0x7;
                if (n48 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                    } while (--n48 > 0);
                }
            }
            else {
                if (n43 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        final int n49 = n40;
                        final int n50 = n41;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n51 = n12 >> 14;
                        if (n51 != 0) {
                            n40 = n10 / n51;
                            n41 = n11 / n51;
                            if (n40 < 0) {
                                n40 = 0;
                            }
                            else if (n40 > 16256) {
                                n40 = -1199423479;
                            }
                        }
                        else {
                            n40 = 0;
                            n41 = 0;
                        }
                        n = (n49 << 18) + n50;
                        n42 = (n40 - n49 >> 3 << 18) + (n41 - n50 >> 3);
                        n6 += n7;
                        n44 = n6 >> 8;
                    } while (--n43 > 0);
                }
                int n52 = n5 - n4 & 0x7;
                if (n52 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                    } while (--n52 > 0);
                }
            }
        }
    }
    
    @Override
    void bi(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        final float n19 = n8 - n7;
        final float n20 = n9 - n7;
        int n21;
        if (n3 != n2) {
            n21 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n21 = 0;
        }
        int n22;
        if (n2 != n) {
            n22 = (n13 << 14) / n14;
        }
        else {
            n22 = 0;
        }
        int n23;
        if (n3 != n) {
            n23 = (n15 << 14) / n16;
        }
        else {
            n23 = 0;
        }
        final int n24 = n13 * n16 - n15 * n14;
        if (n24 == 0) {
            return;
        }
        final int n25 = (n17 * n16 - n18 * n14 << 8) / n24;
        final int n26 = (n18 * n13 - n17 * n15 << 8) / n24;
        final float n27 = (n19 * n16 - n20 * n14) / n24;
        final float n28 = (n20 * n13 - n19 * n15) / n24;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n29 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n29) {
                return;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            n10 = (n10 << 8) - n25 * n4 + n25;
            n7 = n7 - n27 * n4 + n27;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n21 * n2;
                    n2 = 0;
                }
                if ((n != n2 && n23 < n22) || (n == n2 && n23 > n21)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n5 += n21;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n5 += n21;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n23 >= n22) && (n != n3 || n21 <= n22)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n25, n7, n27);
                        n5 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n21;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n5 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n6 += n21;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n29) {
                return;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            if (n > n29) {
                n = n29;
            }
            n11 = (n11 << 8) - n25 * n5 + n25;
            n8 = n8 - n27 * n5 + n27;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n23 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n22 >= n21) && (n2 != n3 || n22 <= n23)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n6 += n23;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n6 += n23;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n23 * n;
                    n = 0;
                }
                if (n22 < n21) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n6 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n4 += n23;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n25, n8, n27);
                    n6 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                    n4 += n23;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
        }
        else {
            if (n3 >= n29) {
                return;
            }
            if (n > n29) {
                n = n29;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            n12 = (n12 << 8) - n25 * n6 + n25;
            n9 = n9 - n27 * n6 + n27;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n22 * n;
                    n = 0;
                }
                if (n21 < n23) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n4 += n22;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n4 += n22;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n22 * n2;
                    n2 = 0;
                }
                if (n21 < n23) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n4 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n22;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n25, n9, n27);
                    n4 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n22;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
        }
    }
    
    public static int bi(final Username username) {
        if (null == username.cleanName) {
            return 0;
        }
        return username.cleanName.hashCode();
    }
    
    static final void method1371(final int[] array, final float[] array2, final int[] array3, final int n, final int n2, final int n3, final float n4) {
        if (method1368(array2[n], n4)) {
            final int n5 = array3[(n3 & 0x3F80) + (n3 >>> 25)];
            array[n] = ((n5 & 0xFF00FF) * n2 & 0xFF00FF00) + ((n5 & 0xFF00) * n2 & 0xFF0000) >> 8;
            array2[n] = n4;
        }
    }
    
    @Override
    void bo(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, 1607776622);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, -1885643438);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-122));
        final int n23 = n5 - n4;
        final int n24 = n2 - n;
        final int n25 = n6 - n4;
        final int n26 = n3 - n;
        final int n27 = n11 - n10;
        final int n28 = n12 - n10;
        int n29 = 0;
        if (n2 != n) {
            n29 = (n5 - n4 << 14) / (n2 - n);
        }
        int n30 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n31 = 0;
        if (n3 != n) {
            n31 = (n4 - n6 << 14) / (n - n3);
        }
        final int n32 = n23 * n26 - n25 * n24;
        if (n32 == 0) {
            return;
        }
        final int n33 = (n27 * n26 - n28 * n24 << 9) / n32;
        final int n34 = (n28 * n23 - n27 * n25 << 9) / n32;
        final float n35 = n8 - n7;
        final float n36 = n9 - n7;
        final float n37 = (n35 * n26 - n36 * n24) / n32;
        final float n38 = (n36 * n23 - n35 * n25) / n32;
        final int n39 = this.al.field2227 * -959710957;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n40 = n15 * n16 - n18 * n13 << 14;
        final int n41 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n39);
        final int n42 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n39);
        final int n43 = n14 * n16 - n17 * n13 << 14;
        final int n44 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n39);
        final int n45 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n39);
        final int n46 = n17 * n15 - n14 * n18 << 14;
        final int n47 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n39);
        final int n48 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n39);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n49 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n49) {
                return;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            n7 = n7 - n37 * n4 + n37;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n50 = n - this.al.field2229 * 1629973730;
                int n51 = n40 + n42 * n50;
                int n52 = n43 + n45 * n50;
                int n53 = n46 + n48 * n50;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n54 = n - this.al.field2229 * 1666539507;
                int n55 = n40 + n42 * n54;
                int n56 = n43 + n45 * n54;
                int n57 = n46 + n48 * n54;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n49) {
                return;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            if (n > n49) {
                n = n49;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            n8 = n8 - n37 * n5 + n37;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n40 + n42 * n58;
                int n60 = n43 + n45 * n58;
                int n61 = n46 + n48 * n58;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n62 = n2 - this.al.field2229 * 1666539507;
                int n63 = n40 + n42 * n62;
                int n64 = n43 + n45 * n62;
                int n65 = n46 + n48 * n62;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
            }
        }
        else {
            if (n3 >= n49) {
                return;
            }
            if (n > n49) {
                n = n49;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            n9 = n9 - n37 * n6 + n37;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n40 + n42 * n66;
                int n68 = n43 + n45 * n66;
                int n69 = n46 + n48 * n66;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n70 = n3 - this.al.field2229 * -319545666;
                int n71 = n40 + n42 * n70;
                int n72 = n43 + n45 * n70;
                int n73 = n46 + n48 * n70;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
            }
        }
    }
    
    final void method1373(final int[] array, final int[] array2, int n, final int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9, int n10, int n11, int n12, final int n13, final int n14, final int n15) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        final int n16 = n5 - n4;
        if (this.an) {
            final int n17 = n4 - this.al.field2231 * 93675259;
            n10 += n13 * n17;
            n11 += n14 * n17;
            n12 += n15 * n17;
            final int n18 = n12 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n10 / n18;
                n20 = n11 / n18;
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n10 += n13 * n16;
            n11 += n14 * n16;
            n12 += n15 * n16;
            final int n21 = n12 >> 12;
            int n22;
            int n23;
            if (n21 != 0) {
                n22 = n10 / n21;
                n23 = n11 / n21;
            }
            else {
                n22 = 0;
                n23 = 0;
            }
            n = (n19 << 20) + n20;
            final int n24 = ((n22 - n19) / n16 << 20) + (n23 - n20) / n16;
            int n25 = n16 >> 3;
            n7 <<= 3;
            int n26 = n6 >> 8;
            if (this.af) {
                if (n25 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n27 = n5 - n4 & 0x7;
                if (n27 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n27 > 0);
                }
            }
            else {
                if (n25 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n28 = n5 - n4 & 0x7;
                if (n28 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n28 > 0);
                }
            }
        }
        else {
            final int n29 = n4 - this.al.field2231 * 93675259;
            n10 += n13 * n29;
            n11 += n14 * n29;
            n12 += n15 * n29;
            final int n30 = n12 >> 14;
            int n31;
            int n32;
            if (n30 != 0) {
                n31 = n10 / n30;
                n32 = n11 / n30;
            }
            else {
                n31 = 0;
                n32 = 0;
            }
            n10 += n13 * n16;
            n11 += n14 * n16;
            n12 += n15 * n16;
            final int n33 = n12 >> 14;
            int n34;
            int n35;
            if (n33 != 0) {
                n34 = n10 / n33;
                n35 = n11 / n33;
            }
            else {
                n34 = 0;
                n35 = 0;
            }
            n = (n31 << 18) + n32;
            final int n36 = ((n34 - n31) / n16 << 18) + (n35 - n32) / n16;
            int n37 = n16 >> 3;
            n7 <<= 3;
            int n38 = n6 >> 8;
            if (this.af) {
                if (n37 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        n6 += n7;
                        n38 = n6 >> 8;
                    } while (--n37 > 0);
                }
                int n39 = n5 - n4 & 0x7;
                if (n39 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                    } while (--n39 > 0);
                }
            }
            else {
                if (n37 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        n6 += n7;
                        n38 = n6 >> 8;
                    } while (--n37 > 0);
                }
                int n40 = n5 - n4 & 0x7;
                if (n40 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                    } while (--n40 > 0);
                }
            }
        }
    }
    
    final void ct(final int[] array, final int[] array2, int n, final int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9, int n10, int n11, int n12, final int n13, final int n14, final int n15) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * -12830157) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        final int n16 = n5 - n4;
        if (this.an) {
            final int n17 = n4 - this.al.field2231 * 162959421;
            n10 += n13 * n17;
            n11 += n14 * n17;
            n12 += n15 * n17;
            final int n18 = n12 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n10 / n18;
                n20 = n11 / n18;
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n10 += n13 * n16;
            n11 += n14 * n16;
            n12 += n15 * n16;
            final int n21 = n12 >> 12;
            int n22;
            int n23;
            if (n21 != 0) {
                n22 = n10 / n21;
                n23 = n11 / n21;
            }
            else {
                n22 = 0;
                n23 = 0;
            }
            n = (n19 << 20) + n20;
            final int n24 = ((n22 - n19) / n16 << 20) + (n23 - n20) / n16;
            int n25 = n16 >> 3;
            n7 <<= 3;
            int n26 = n6 >> 8;
            if (this.af) {
                if (n25 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n27 = n5 - n4 & 0x7;
                if (n27 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n27 > 0);
                }
            }
            else {
                if (n25 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n28 = n5 - n4 & 0x7;
                if (n28 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n28 > 0);
                }
            }
        }
        else {
            final int n29 = n4 - this.al.field2231 * -1873702156;
            n10 += n13 * n29;
            n11 += n14 * n29;
            n12 += n15 * n29;
            final int n30 = n12 >> 14;
            int n31;
            int n32;
            if (n30 != 0) {
                n31 = n10 / n30;
                n32 = n11 / n30;
            }
            else {
                n31 = 0;
                n32 = 0;
            }
            n10 += n13 * n16;
            n11 += n14 * n16;
            n12 += n15 * n16;
            final int n33 = n12 >> 14;
            int n34;
            int n35;
            if (n33 != 0) {
                n34 = n10 / n33;
                n35 = n11 / n33;
            }
            else {
                n34 = 0;
                n35 = 0;
            }
            n = (n31 << 18) + n32;
            final int n36 = ((n34 - n31) / n16 << 18) + (n35 - n32) / n16;
            int n37 = n16 >> 3;
            n7 <<= 3;
            int n38 = n6 >> 8;
            if (this.af) {
                if (n37 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        n6 += n7;
                        n38 = n6 >> 8;
                    } while (--n37 > 0);
                }
                int n39 = n5 - n4 & 0x7;
                if (n39 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                    } while (--n39 > 0);
                }
            }
            else {
                if (n37 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                        n6 += n7;
                        n38 = n6 >> 8;
                    } while (--n37 > 0);
                }
                int n40 = n5 - n4 & 0x7;
                if (n40 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n38, n, n8);
                        ++n3;
                        n += n36;
                        n8 += n9;
                    } while (--n40 > 0);
                }
            }
        }
    }
    
    final void cc(final int[] array, final float[] array2, final int n, final int n2, final int n3, final float n4) {
        if (method1368(array2[n], n4)) {
            final int n5 = array[n];
            array[n] = n2 + ((n5 & 0xFF00FF) * n3 >> 8 & 0xFF00FF) + ((n5 & 0xFF00) * n3 >> 8 & 0xFF00);
        }
    }
    
    @Override
    void bt(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, -1196698115);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, 606344544);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-92));
        final int n23 = n5 - n4;
        final int n24 = n2 - n;
        final int n25 = n6 - n4;
        final int n26 = n3 - n;
        final int n27 = n11 - n10;
        final int n28 = n12 - n10;
        int n29 = 0;
        if (n2 != n) {
            n29 = (n5 - n4 << 14) / (n2 - n);
        }
        int n30 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n31 = 0;
        if (n3 != n) {
            n31 = (n4 - n6 << 14) / (n - n3);
        }
        final int n32 = n23 * n26 - n25 * n24;
        if (n32 == 0) {
            return;
        }
        final int n33 = (n27 * n26 - n28 * n24 << 9) / n32;
        final int n34 = (n28 * n23 - n27 * n25 << 9) / n32;
        final float n35 = n8 - n7;
        final float n36 = n9 - n7;
        final float n37 = (n35 * n26 - n36 * n24) / n32;
        final float n38 = (n36 * n23 - n35 * n25) / n32;
        final int n39 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n40 = n15 * n16 - n18 * n13 << 14;
        final int n41 = (int)(((long)(n18 * n19 - n21 * n16) << 14) / n39);
        final int n42 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n39);
        final int n43 = n14 * n16 - n17 * n13 << 14;
        final int n44 = (int)(((long)(n17 * n19 - n20 * n16) << 14) / n39);
        final int n45 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n39);
        final int n46 = n17 * n15 - n14 * n18 << 14;
        final int n47 = (int)(((long)(n20 * n18 - n17 * n21) << 14) / n39);
        final int n48 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n39);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n49 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n49) {
                return;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            n7 = n7 - n37 * n4 + n37;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n7 -= n38 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n40 + n42 * n50;
                int n52 = n43 + n45 * n50;
                int n53 = n46 + n48 * n50;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n7 -= n38 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n54 = n - this.al.field2229 * 1666539507;
                int n55 = n40 + n42 * n54;
                int n56 = n43 + n45 * n54;
                int n57 = n46 + n48 * n54;
                if ((n != n3 && n31 < n29) || (n == n3 && n30 > n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n49) {
                return;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            if (n > n49) {
                n = n49;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            n8 = n8 - n37 * n5 + n37;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n8 -= n38 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n40 + n42 * n58;
                int n60 = n43 + n45 * n58;
                int n61 = n46 + n48 * n58;
                if ((n2 != n3 && n29 < n30) || (n2 == n3 && n29 > n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n8 -= n38 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n62 = n2 - this.al.field2229 * 1666539507;
                int n63 = n40 + n42 * n62;
                int n64 = n43 + n45 * n62;
                int n65 = n46 + n48 * n62;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
            }
        }
        else {
            if (n3 >= n49) {
                return;
            }
            if (n > n49) {
                n = n49;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            n9 = n9 - n37 * n6 + n37;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n9 -= n38 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n40 + n42 * n66;
                int n68 = n43 + n45 * n66;
                int n69 = n46 + n48 * n66;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n9 -= n38 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n70 = n3 - this.al.field2229 * 1666539507;
                int n71 = n40 + n42 * n70;
                int n72 = n43 + n45 * n70;
                int n73 = n46 + n48 * n70;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
            }
        }
    }
    
    final void method1376(final int[] array, final int[] array2, int n, final int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9, int n10, int n11, int n12, final int n13, final int n14, final int n15) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * -332731050;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        final int n16 = n5 - n4;
        if (this.an) {
            final int n17 = n4 - this.al.field2231 * 806456254;
            n10 += (n13 >> 3) * n17;
            n11 += (n14 >> 3) * n17;
            n12 += (n15 >> 3) * n17;
            final int n18 = n12 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n10 / n18;
                n20 = n11 / n18;
                if (n19 < 0) {
                    n19 = 0;
                }
                else if (n19 > 4032) {
                    n19 = 4032;
                }
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n10 += n13;
            n11 += n14;
            n12 += n15;
            final int n21 = n12 >> 12;
            int n22;
            int n23;
            if (n21 != 0) {
                n22 = n10 / n21;
                n23 = n11 / n21;
                if (n22 < 0) {
                    n22 = 0;
                }
                else if (n22 > -678370514) {
                    n22 = 1193132621;
                }
            }
            else {
                n22 = 0;
                n23 = 0;
            }
            n = (n19 << 20) + n20;
            int n24 = (n22 - n19 >> 3 << 20) + (n23 - n20 >> 3);
            int n25 = n16 >> 3;
            n7 <<= 3;
            int n26 = n6 >> 8;
            if (this.af) {
                if (n25 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        final int n27 = n22;
                        final int n28 = n23;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n29 = n12 >> 12;
                        if (n29 != 0) {
                            n22 = n10 / n29;
                            n23 = n11 / n29;
                            if (n22 < 0) {
                                n22 = 0;
                            }
                            else if (n22 > -1311742564) {
                                n22 = 4032;
                            }
                        }
                        else {
                            n22 = 0;
                            n23 = 0;
                        }
                        n = (n27 << 20) + n28;
                        n24 = (n22 - n27 >> 3 << 20) + (n23 - n28 >> 3);
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n30 = n5 - n4 & 0x7;
                if (n30 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n30 > 0);
                }
            }
            else {
                if (n25 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        final int n31 = n22;
                        final int n32 = n23;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n33 = n12 >> 12;
                        if (n33 != 0) {
                            n22 = n10 / n33;
                            n23 = n11 / n33;
                            if (n22 < 0) {
                                n22 = 0;
                            }
                            else if (n22 > 4032) {
                                n22 = 1124351793;
                            }
                        }
                        else {
                            n22 = 0;
                            n23 = 0;
                        }
                        n = (n31 << 20) + n32;
                        n24 = (n22 - n31 >> 3 << 20) + (n23 - n32 >> 3);
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n34 = n5 - n4 & 0x7;
                if (n34 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n34 > 0);
                }
            }
        }
        else {
            final int n35 = n4 - this.al.field2231 * 2045892554;
            n10 += (n13 >> 3) * n35;
            n11 += (n14 >> 3) * n35;
            n12 += (n15 >> 3) * n35;
            final int n36 = n12 >> 14;
            int n37;
            int n38;
            if (n36 != 0) {
                n37 = n10 / n36;
                n38 = n11 / n36;
                if (n37 < 0) {
                    n37 = 0;
                }
                else if (n37 > -1514825689) {
                    n37 = 16256;
                }
            }
            else {
                n37 = 0;
                n38 = 0;
            }
            n10 += n13;
            n11 += n14;
            n12 += n15;
            final int n39 = n12 >> 14;
            int n40;
            int n41;
            if (n39 != 0) {
                n40 = n10 / n39;
                n41 = n11 / n39;
                if (n40 < 0) {
                    n40 = 0;
                }
                else if (n40 > -1273000608) {
                    n40 = 16256;
                }
            }
            else {
                n40 = 0;
                n41 = 0;
            }
            n = (n37 << 18) + n38;
            int n42 = (n40 - n37 >> 3 << 18) + (n41 - n38 >> 3);
            int n43 = n16 >> 3;
            n7 <<= 3;
            int n44 = n6 >> 8;
            if (this.af) {
                if (n43 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        final int n45 = n40;
                        final int n46 = n41;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n47 = n12 >> 14;
                        if (n47 != 0) {
                            n40 = n10 / n47;
                            n41 = n11 / n47;
                            if (n40 < 0) {
                                n40 = 0;
                            }
                            else if (n40 > 16256) {
                                n40 = 16256;
                            }
                        }
                        else {
                            n40 = 0;
                            n41 = 0;
                        }
                        n = (n45 << 18) + n46;
                        n42 = (n40 - n45 >> 3 << 18) + (n41 - n46 >> 3);
                        n6 += n7;
                        n44 = n6 >> 8;
                    } while (--n43 > 0);
                }
                int n48 = n5 - n4 & 0x7;
                if (n48 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                    } while (--n48 > 0);
                }
            }
            else {
                if (n43 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        final int n49 = n40;
                        final int n50 = n41;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n51 = n12 >> 14;
                        if (n51 != 0) {
                            n40 = n10 / n51;
                            n41 = n11 / n51;
                            if (n40 < 0) {
                                n40 = 0;
                            }
                            else if (n40 > 233979430) {
                                n40 = 1510033329;
                            }
                        }
                        else {
                            n40 = 0;
                            n41 = 0;
                        }
                        n = (n49 << 18) + n50;
                        n42 = (n40 - n49 >> 3 << 18) + (n41 - n50 >> 3);
                        n6 += n7;
                        n44 = n6 >> 8;
                    } while (--n43 > 0);
                }
                int n52 = n5 - n4 & 0x7;
                if (n52 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                    } while (--n52 > 0);
                }
            }
        }
    }
    
    final void method1364(final int[] array, final float[] array2, final int n, final int n2, final int n3, final int n4, final float n5) {
        if (method1368(array2[n], n5)) {
            final int n6 = this.aq[(n2 & (n2 >> 31 & 0x1) - 1) >> 8];
            final int n7 = ((n6 & 0xFF00FF) * n4 >> 8 & 0xFF00FF) + ((n6 & 0xFF00) * n4 >> 8 & 0xFF00);
            final int n8 = array[n];
            array[n] = n7 + ((n8 & 0xFF00FF) * n3 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n3 >> 8 & 0xFF00);
        }
    }
    
    final void ci(final int[] array, final float[] array2, final int n, final int n2, final float n3) {
        if (method1368(array2[n], n3)) {
            array[n] = this.aq[(n2 & (n2 >> 31 & 0x1) - 1) >> 8];
            array2[n] = n3;
        }
    }
    
    @Override
    void vmethod1378(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, 294114897);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, 659034231);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-109));
        final int n23 = n5 - n4;
        final int n24 = n2 - n;
        final int n25 = n6 - n4;
        final int n26 = n3 - n;
        final int n27 = n11 - n10;
        final int n28 = n12 - n10;
        int n29 = 0;
        if (n2 != n) {
            n29 = (n5 - n4 << 14) / (n2 - n);
        }
        int n30 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n31 = 0;
        if (n3 != n) {
            n31 = (n4 - n6 << 14) / (n - n3);
        }
        final int n32 = n23 * n26 - n25 * n24;
        if (n32 == 0) {
            return;
        }
        final int n33 = (n27 * n26 - n28 * n24 << 9) / n32;
        final int n34 = (n28 * n23 - n27 * n25 << 9) / n32;
        final float n35 = n8 - n7;
        final float n36 = n9 - n7;
        final float n37 = (n35 * n26 - n36 * n24) / n32;
        final float n38 = (n36 * n23 - n35 * n25) / n32;
        final int n39 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n40 = n15 * n16 - n18 * n13 << 14;
        final int n41 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n39);
        final int n42 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n39);
        final int n43 = n14 * n16 - n17 * n13 << 14;
        final int n44 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n39);
        final int n45 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n39);
        final int n46 = n17 * n15 - n14 * n18 << 14;
        final int n47 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n39);
        final int n48 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n39);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n49 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n49) {
                return;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            n7 = n7 - n37 * n4 + n37;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n40 + n42 * n50;
                int n52 = n43 + n45 * n50;
                int n53 = n46 + n48 * n50;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n54 = n - this.al.field2229 * 1666539507;
                int n55 = n40 + n42 * n54;
                int n56 = n43 + n45 * n54;
                int n57 = n46 + n48 * n54;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n49) {
                return;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            if (n > n49) {
                n = n49;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            n8 = n8 - n37 * n5 + n37;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n40 + n42 * n58;
                int n60 = n43 + n45 * n58;
                int n61 = n46 + n48 * n58;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n62 = n2 - this.al.field2229 * 1666539507;
                int n63 = n40 + n42 * n62;
                int n64 = n43 + n45 * n62;
                int n65 = n46 + n48 * n62;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
            }
        }
        else {
            if (n3 >= n49) {
                return;
            }
            if (n > n49) {
                n = n49;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            n9 = n9 - n37 * n6 + n37;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n40 + n42 * n66;
                int n68 = n43 + n45 * n66;
                int n69 = n46 + n48 * n66;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n70 = n3 - this.al.field2229 * 1666539507;
                int n71 = n40 + n42 * n70;
                int n72 = n43 + n45 * n70;
                int n73 = n46 + n48 * n70;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
            }
        }
    }
    
    final void cu(final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        if (this.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (this.al.field2225 * 918495667 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n10 = this.al.field2225 * 918495667;
                final int n11 = 256 - this.al.field2225 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n11 >> 8 & 0xFF00);
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n11 >> 8 & 0xFF00);
                    do {
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (this.al.field2225 * 918495667 == 0) {
            do {
                this.method1375(array, class237.by, n, n6, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n12 = this.al.field2225 * 918495667;
            final int n13 = 256 - this.al.field2225 * 918495667;
            do {
                this.method1364(array, class237.by, n, n2, n12, n13, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
    }
    
    static final void cx(final int[] array, final float[] array2, final int[] array3, final int n, final int n2, final int n3, final float n4) {
        if (method1368(array2[n], n4)) {
            final int n5 = array3[(n3 & 0xFC0) + (n3 >>> 26)];
            array[n] = ((n5 & 0x1E8F387D) * n2 & 0x3F9A870D) + ((n5 & 0xFF00) * n2 & 0x832FF093) >> 8;
            array2[n] = n4;
        }
    }
    
    static final void method1369(final int[] array, final float[] array2, final int[] array3, final int n, final int n2, final int n3, final float n4) {
        if (method1368(array2[n], n4)) {
            final int n5 = array3[(n3 & 0xFC0) + (n3 >>> 26)];
            array[n] = ((n5 & 0xFF00FF) * n2 & 0xFF00FF00) + ((n5 & 0xFF00) * n2 & 0xFF0000) >> 8;
            array2[n] = n4;
        }
    }
    
    final void bh(final int[] array, final float[] array2, final int n, final int n2, final float n3) {
        final int method1368 = method1368(array2[n], n3) ? 1 : 0;
        final int n4 = 1 - method1368;
        array[n] = method1368 * n2 + n4 * array[n];
        array2[n] = method1368 * n3 + n4 * array2[n];
    }
    
    @Override
    void by(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        final float n19 = n8 - n7;
        final float n20 = n9 - n7;
        int n21;
        if (n3 != n2) {
            n21 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n21 = 0;
        }
        int n22;
        if (n2 != n) {
            n22 = (n13 << 14) / n14;
        }
        else {
            n22 = 0;
        }
        int n23;
        if (n3 != n) {
            n23 = (n15 << 14) / n16;
        }
        else {
            n23 = 0;
        }
        final int n24 = n13 * n16 - n15 * n14;
        if (n24 == 0) {
            return;
        }
        final int n25 = (n17 * n16 - n18 * n14 << 8) / n24;
        final int n26 = (n18 * n13 - n17 * n15 << 8) / n24;
        final float n27 = (n19 * n16 - n20 * n14) / n24;
        final float n28 = (n20 * n13 - n19 * n15) / n24;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n29 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n29) {
                return;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            n10 = (n10 << 8) - n25 * n4 + n25;
            n7 = n7 - n27 * n4 + n27;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n21 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n23 >= n22) && (n != n2 || n23 <= n21)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n5 += n21;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n5 += n21;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n != n3 && n23 < n22) || (n == n3 && n21 > n22)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n25, n7, n27);
                        n5 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                        n6 += n21;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n25, n7, n27);
                    n5 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                    n6 += n21;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n29) {
                return;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            if (n > n29) {
                n = n29;
            }
            n11 = (n11 << 8) - n25 * n5 + n25;
            n8 = n8 - n27 * n5 + n27;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n23 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n22 >= n21) && (n2 != n3 || n22 <= n23)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n6 += n23;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n6 += n23;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n23 * n;
                    n = 0;
                }
                if (n22 < n21) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n6 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n4 += n23;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n25, n8, n27);
                    n6 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                    n4 += n23;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
        }
        else {
            if (n3 >= n29) {
                return;
            }
            if (n > n29) {
                n = n29;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            n12 = (n12 << 8) - n25 * n6 + n25;
            n9 = n9 - n27 * n6 + n27;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n22 * n;
                    n = 0;
                }
                if (n21 < n23) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n4 += n22;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n4 += n22;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n22 * n2;
                    n2 = 0;
                }
                if (n21 < n23) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n4 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n22;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n25, n9, n27);
                    n4 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n22;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
        }
    }
    
    @Override
    void bx(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, 131080800);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, -1690351958);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-4));
        final int n23 = n5 - n4;
        final int n24 = n2 - n;
        final int n25 = n6 - n4;
        final int n26 = n3 - n;
        final int n27 = n11 - n10;
        final int n28 = n12 - n10;
        int n29 = 0;
        if (n2 != n) {
            n29 = (n5 - n4 << 14) / (n2 - n);
        }
        int n30 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n31 = 0;
        if (n3 != n) {
            n31 = (n4 - n6 << 14) / (n - n3);
        }
        final int n32 = n23 * n26 - n25 * n24;
        if (n32 == 0) {
            return;
        }
        final int n33 = (n27 * n26 - n28 * n24 << 9) / n32;
        final int n34 = (n28 * n23 - n27 * n25 << 9) / n32;
        final float n35 = n8 - n7;
        final float n36 = n9 - n7;
        final float n37 = (n35 * n26 - n36 * n24) / n32;
        final float n38 = (n36 * n23 - n35 * n25) / n32;
        final int n39 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n40 = n15 * n16 - n18 * n13 << 14;
        final int n41 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n39);
        final int n42 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n39);
        final int n43 = n14 * n16 - n17 * n13 << 14;
        final int n44 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n39);
        final int n45 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n39);
        final int n46 = n17 * n15 - n14 * n18 << 14;
        final int n47 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n39);
        final int n48 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n39);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n49 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n49) {
                return;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            n7 = n7 - n37 * n4 + n37;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n50 = n - this.al.field2229 * 988491426;
                int n51 = n40 + n42 * n50;
                int n52 = n43 + n45 * n50;
                int n53 = n46 + n48 * n50;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n54 = n - this.al.field2229 * 1666539507;
                int n55 = n40 + n42 * n54;
                int n56 = n43 + n45 * n54;
                int n57 = n46 + n48 * n54;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n49) {
                return;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            if (n > n49) {
                n = n49;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            n8 = n8 - n37 * n5 + n37;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n58 = n2 - this.al.field2229 * -1607799206;
                int n59 = n40 + n42 * n58;
                int n60 = n43 + n45 * n58;
                int n61 = n46 + n48 * n58;
                if ((n2 != n3 && n29 < n30) || (n2 == n3 && n29 > n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n62 = n2 - this.al.field2229 * 1666539507;
                int n63 = n40 + n42 * n62;
                int n64 = n43 + n45 * n62;
                int n65 = n46 + n48 * n62;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
            }
        }
        else {
            if (n3 >= n49) {
                return;
            }
            if (n > n49) {
                n = n49;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            n9 = n9 - n37 * n6 + n37;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n66 = n3 - this.al.field2229 * 838243771;
                int n67 = n40 + n42 * n66;
                int n68 = n43 + n45 * n66;
                int n69 = n46 + n48 * n66;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n70 = n3 - this.al.field2229 * 1666539507;
                int n71 = n40 + n42 * n70;
                int n72 = n43 + n45 * n70;
                int n73 = n46 + n48 * n70;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
            }
        }
    }
    
    @Override
    void ap(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        final float n19 = n8 - n7;
        final float n20 = n9 - n7;
        int n21;
        if (n3 != n2) {
            n21 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n21 = 0;
        }
        int n22;
        if (n2 != n) {
            n22 = (n13 << 14) / n14;
        }
        else {
            n22 = 0;
        }
        int n23;
        if (n3 != n) {
            n23 = (n15 << 14) / n16;
        }
        else {
            n23 = 0;
        }
        final int n24 = n13 * n16 - n15 * n14;
        if (n24 == 0) {
            return;
        }
        final int n25 = (n17 * n16 - n18 * n14 << 8) / n24;
        final int n26 = (n18 * n13 - n17 * n15 << 8) / n24;
        final float n27 = (n19 * n16 - n20 * n14) / n24;
        final float n28 = (n20 * n13 - n19 * n15) / n24;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n29 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n29) {
                return;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            n10 = (n10 << 8) - n25 * n4 + n25;
            n7 = n7 - n27 * n4 + n27;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n21 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n23 >= n22) && (n != n2 || n23 <= n21)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n5 += n21;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n5 += n21;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n != n3 && n23 < n22) || (n == n3 && n21 > n22)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n25, n7, n27);
                        n5 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                        n6 += n21;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n25, n7, n27);
                    n5 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                    n6 += n21;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n29) {
                return;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            if (n > n29) {
                n = n29;
            }
            n11 = (n11 << 8) - n25 * n5 + n25;
            n8 = n8 - n27 * n5 + n27;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n23 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n22 >= n21) && (n2 != n3 || n22 <= n23)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n6 += n23;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n6 += n23;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n23 * n;
                    n = 0;
                }
                if (n22 < n21) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n6 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n4 += n23;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n25, n8, n27);
                    n6 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                    n4 += n23;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
        }
        else {
            if (n3 >= n29) {
                return;
            }
            if (n > n29) {
                n = n29;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            n12 = (n12 << 8) - n25 * n6 + n25;
            n9 = n9 - n27 * n6 + n27;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n22 * n;
                    n = 0;
                }
                if (n21 < n23) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n4 += n22;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n4 += n22;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n22 * n2;
                    n2 = 0;
                }
                if (n21 < n23) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n4 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n22;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n25, n9, n27);
                    n4 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n22;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
        }
    }
    
    @Override
    void bd(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, 1209122035);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, -1716774939);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-111));
        final int n23 = n5 - n4;
        final int n24 = n2 - n;
        final int n25 = n6 - n4;
        final int n26 = n3 - n;
        final int n27 = n11 - n10;
        final int n28 = n12 - n10;
        int n29 = 0;
        if (n2 != n) {
            n29 = (n5 - n4 << 14) / (n2 - n);
        }
        int n30 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n31 = 0;
        if (n3 != n) {
            n31 = (n4 - n6 << 14) / (n - n3);
        }
        final int n32 = n23 * n26 - n25 * n24;
        if (n32 == 0) {
            return;
        }
        final int n33 = (n27 * n26 - n28 * n24 << 9) / n32;
        final int n34 = (n28 * n23 - n27 * n25 << 9) / n32;
        final float n35 = n8 - n7;
        final float n36 = n9 - n7;
        final float n37 = (n35 * n26 - n36 * n24) / n32;
        final float n38 = (n36 * n23 - n35 * n25) / n32;
        final int n39 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n40 = n15 * n16 - n18 * n13 << 14;
        final int n41 = (int)(((long)(n18 * n19 - n21 * n16) << 14) / n39);
        final int n42 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n39);
        final int n43 = n14 * n16 - n17 * n13 << 14;
        final int n44 = (int)(((long)(n17 * n19 - n20 * n16) << 14) / n39);
        final int n45 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n39);
        final int n46 = n17 * n15 - n14 * n18 << 14;
        final int n47 = (int)(((long)(n20 * n18 - n17 * n21) << 14) / n39);
        final int n48 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n39);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n49 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n49) {
                return;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            n7 = n7 - n37 * n4 + n37;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n7 -= n38 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n40 + n42 * n50;
                int n52 = n43 + n45 * n50;
                int n53 = n46 + n48 * n50;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n7 -= n38 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n54 = n - this.al.field2229 * 1666539507;
                int n55 = n40 + n42 * n54;
                int n56 = n43 + n45 * n54;
                int n57 = n46 + n48 * n54;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n49) {
                return;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            if (n > n49) {
                n = n49;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            n8 = n8 - n37 * n5 + n37;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n8 -= n38 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n40 + n42 * n58;
                int n60 = n43 + n45 * n58;
                int n61 = n46 + n48 * n58;
                if ((n2 != n3 && n29 < n30) || (n2 == n3 && n29 > n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n8 -= n38 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n62 = n2 - this.al.field2229 * 1666539507;
                int n63 = n40 + n42 * n62;
                int n64 = n43 + n45 * n62;
                int n65 = n46 + n48 * n62;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    while (--n3 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
                while (--n3 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
            }
        }
        else {
            if (n3 >= n49) {
                return;
            }
            if (n > n49) {
                n = n49;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            n9 = n9 - n37 * n6 + n37;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n9 -= n38 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n40 + n42 * n66;
                int n68 = n43 + n45 * n66;
                int n69 = n46 + n48 * n66;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n9 -= n38 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n70 = n3 - this.al.field2229 * 1666539507;
                int n71 = n40 + n42 * n70;
                int n72 = n43 + n45 * n70;
                int n73 = n46 + n48 * n70;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    while (--n >= 0) {
                        this.method1373(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
                while (--n >= 0) {
                    this.method1373(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
            }
        }
    }
    
    final void cm(final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        if (this.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (this.al.field2225 * 918495667 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n10 = this.al.field2225 * 918495667;
                final int n11 = 256 - this.al.field2225 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n11 >> 8 & 0xFF00);
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n11 >> 8 & 0xFF00);
                    do {
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (this.al.field2225 * 918495667 == 0) {
            do {
                this.method1375(array, class237.by, n, n6, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n12 = this.al.field2225 * 918495667;
            final int n13 = 256 - this.al.field2225 * 918495667;
            do {
                this.method1364(array, class237.by, n, n2, n12, n13, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
    }
    
    final void method1365(final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        if (this.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (this.al.field2225 * 918495667 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n10 = this.al.field2225 * 918495667;
                final int n11 = 256 - this.al.field2225 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n11 >> 8 & 0xFF00);
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n11 >> 8 & 0xFF00);
                    do {
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (this.al.field2225 * 918495667 == 0) {
            do {
                this.method1375(array, class237.by, n, n6, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n12 = this.al.field2225 * 918495667;
            final int n13 = 256 - this.al.field2225 * 918495667;
            do {
                this.method1364(array, class237.by, n, n2, n12, n13, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
    }
    
    final void cg(final int[] array, int n, int n2, int n3, int n4, int n5, float n6, final float n7) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n += n4;
        n3 = n5 - n4 >> 2;
        n6 += n7 * n4;
        if (this.al.field2225 * 918495667 == 0) {
            while (--n3 >= 0) {
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
            }
        }
        else if (this.al.field2225 * 918495667 == 254) {
            while (--n3 >= 0) {
                array[n++] = array[n];
                array[n++] = array[n];
                array[n++] = array[n];
                array[n++] = array[n];
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                array[n++] = array[n];
            }
        }
        else {
            final int n8 = this.al.field2225 * 918495667;
            final int n9 = 256 - this.al.field2225 * 918495667;
            n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
            while (--n3 >= 0) {
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
            }
        }
    }
    
    static final void co(final int[] array, final float[] array2, final int[] array3, final int n, final int n2, final int n3, final float n4) {
        final int n5 = array3[(n3 & 0x5F79E017) + (n3 >>> 26)];
        if (n5 == 0) {
            return;
        }
        if (method1368(array2[n], n4)) {
            array[n] = ((n5 & 0xFF00FF) * n2 & 0x412D8813) + ((n5 & 0xFE09DAEF) * n2 & 0x3DDAAEA9) >> 8;
            array2[n] = n4;
        }
    }
    
    static final void cy(final int[] array, final float[] array2, final int[] array3, final int n, final int n2, final int n3, final float n4) {
        if (method1368(array2[n], n4)) {
            final int n5 = array3[(n3 & 0xFC0) + (n3 >>> 26)];
            array[n] = ((n5 & 0xFF00FF) * n2 & 0xFF00FF00) + ((n5 & 0xFF00) * n2 & 0xFF0000) >> 8;
            array2[n] = n4;
        }
    }
    
    final void method1375(final int[] array, final float[] array2, final int n, final int n2, final float n3) {
        if (method1368(array2[n], n3)) {
            array[n] = this.aq[(n2 & (n2 >> 31 & 0x1) - 1) >> 8];
            array2[n] = n3;
        }
    }
    
    final void cz(final int[] array, final int[] array2, int n, final int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9, int n10, int n11, int n12, final int n13, final int n14, final int n15) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        final int n16 = n5 - n4;
        if (this.an) {
            final int n17 = n4 - this.al.field2231 * 93675259;
            n10 += (n13 >> 3) * n17;
            n11 += (n14 >> 3) * n17;
            n12 += (n15 >> 3) * n17;
            final int n18 = n12 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n10 / n18;
                n20 = n11 / n18;
                if (n19 < 0) {
                    n19 = 0;
                }
                else if (n19 > 4032) {
                    n19 = 4032;
                }
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n10 += n13;
            n11 += n14;
            n12 += n15;
            final int n21 = n12 >> 12;
            int n22;
            int n23;
            if (n21 != 0) {
                n22 = n10 / n21;
                n23 = n11 / n21;
                if (n22 < 0) {
                    n22 = 0;
                }
                else if (n22 > 4032) {
                    n22 = 4032;
                }
            }
            else {
                n22 = 0;
                n23 = 0;
            }
            n = (n19 << 20) + n20;
            int n24 = (n22 - n19 >> 3 << 20) + (n23 - n20 >> 3);
            int n25 = n16 >> 3;
            n7 <<= 3;
            int n26 = n6 >> 8;
            if (this.af) {
                if (n25 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        final int n27 = n22;
                        final int n28 = n23;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n29 = n12 >> 12;
                        if (n29 != 0) {
                            n22 = n10 / n29;
                            n23 = n11 / n29;
                            if (n22 < 0) {
                                n22 = 0;
                            }
                            else if (n22 > 4032) {
                                n22 = 4032;
                            }
                        }
                        else {
                            n22 = 0;
                            n23 = 0;
                        }
                        n = (n27 << 20) + n28;
                        n24 = (n22 - n27 >> 3 << 20) + (n23 - n28 >> 3);
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n30 = n5 - n4 & 0x7;
                if (n30 > 0) {
                    do {
                        method1369(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n30 > 0);
                }
            }
            else {
                if (n25 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                        final int n31 = n22;
                        final int n32 = n23;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n33 = n12 >> 12;
                        if (n33 != 0) {
                            n22 = n10 / n33;
                            n23 = n11 / n33;
                            if (n22 < 0) {
                                n22 = 0;
                            }
                            else if (n22 > 4032) {
                                n22 = 4032;
                            }
                        }
                        else {
                            n22 = 0;
                            n23 = 0;
                        }
                        n = (n31 << 20) + n32;
                        n24 = (n22 - n31 >> 3 << 20) + (n23 - n32 >> 3);
                        n6 += n7;
                        n26 = n6 >> 8;
                    } while (--n25 > 0);
                }
                int n34 = n5 - n4 & 0x7;
                if (n34 > 0) {
                    do {
                        method1370(array, class237.by, array2, n3, n26, n, n8);
                        ++n3;
                        n += n24;
                        n8 += n9;
                    } while (--n34 > 0);
                }
            }
        }
        else {
            final int n35 = n4 - this.al.field2231 * 93675259;
            n10 += (n13 >> 3) * n35;
            n11 += (n14 >> 3) * n35;
            n12 += (n15 >> 3) * n35;
            final int n36 = n12 >> 14;
            int n37;
            int n38;
            if (n36 != 0) {
                n37 = n10 / n36;
                n38 = n11 / n36;
                if (n37 < 0) {
                    n37 = 0;
                }
                else if (n37 > 16256) {
                    n37 = 16256;
                }
            }
            else {
                n37 = 0;
                n38 = 0;
            }
            n10 += n13;
            n11 += n14;
            n12 += n15;
            final int n39 = n12 >> 14;
            int n40;
            int n41;
            if (n39 != 0) {
                n40 = n10 / n39;
                n41 = n11 / n39;
                if (n40 < 0) {
                    n40 = 0;
                }
                else if (n40 > 16256) {
                    n40 = 16256;
                }
            }
            else {
                n40 = 0;
                n41 = 0;
            }
            n = (n37 << 18) + n38;
            int n42 = (n40 - n37 >> 3 << 18) + (n41 - n38 >> 3);
            int n43 = n16 >> 3;
            n7 <<= 3;
            int n44 = n6 >> 8;
            if (this.af) {
                if (n43 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        final int n45 = n40;
                        final int n46 = n41;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n47 = n12 >> 14;
                        if (n47 != 0) {
                            n40 = n10 / n47;
                            n41 = n11 / n47;
                            if (n40 < 0) {
                                n40 = 0;
                            }
                            else if (n40 > 16256) {
                                n40 = 16256;
                            }
                        }
                        else {
                            n40 = 0;
                            n41 = 0;
                        }
                        n = (n45 << 18) + n46;
                        n42 = (n40 - n45 >> 3 << 18) + (n41 - n46 >> 3);
                        n6 += n7;
                        n44 = n6 >> 8;
                    } while (--n43 > 0);
                }
                int n48 = n5 - n4 & 0x7;
                if (n48 > 0) {
                    do {
                        method1371(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                    } while (--n48 > 0);
                }
            }
            else {
                if (n43 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                        final int n49 = n40;
                        final int n50 = n41;
                        n10 += n13;
                        n11 += n14;
                        n12 += n15;
                        final int n51 = n12 >> 14;
                        if (n51 != 0) {
                            n40 = n10 / n51;
                            n41 = n11 / n51;
                            if (n40 < 0) {
                                n40 = 0;
                            }
                            else if (n40 > 16256) {
                                n40 = 16256;
                            }
                        }
                        else {
                            n40 = 0;
                            n41 = 0;
                        }
                        n = (n49 << 18) + n50;
                        n42 = (n40 - n49 >> 3 << 18) + (n41 - n50 >> 3);
                        n6 += n7;
                        n44 = n6 >> 8;
                    } while (--n43 > 0);
                }
                int n52 = n5 - n4 & 0x7;
                if (n52 > 0) {
                    do {
                        method1372(array, class237.by, array2, n3, n44, n, n8);
                        ++n3;
                        n += n42;
                        n8 += n9;
                    } while (--n52 > 0);
                }
            }
        }
    }
    
    @Override
    void vmethod1374(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        final float n19 = n8 - n7;
        final float n20 = n9 - n7;
        int n21;
        if (n3 != n2) {
            n21 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n21 = 0;
        }
        int n22;
        if (n2 != n) {
            n22 = (n13 << 14) / n14;
        }
        else {
            n22 = 0;
        }
        int n23;
        if (n3 != n) {
            n23 = (n15 << 14) / n16;
        }
        else {
            n23 = 0;
        }
        final int n24 = n13 * n16 - n15 * n14;
        if (n24 == 0) {
            return;
        }
        final int n25 = (n17 * n16 - n18 * n14 << 8) / n24;
        final int n26 = (n18 * n13 - n17 * n15 << 8) / n24;
        final float n27 = (n19 * n16 - n20 * n14) / n24;
        final float n28 = (n20 * n13 - n19 * n15) / n24;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n29 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n29) {
                return;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            n10 = (n10 << 8) - n25 * n4 + n25;
            n7 = n7 - n27 * n4 + n27;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n21 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n23 >= n22) && (n != n2 || n23 <= n21)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n23;
                        n5 += n21;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n25, n7, n27);
                    n6 += n23;
                    n5 += n21;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n23 * n;
                    n4 -= n22 * n;
                    n10 -= n26 * n;
                    n7 -= n28 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n23 >= n22) && (n != n3 || n21 <= n22)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n25, n7, n27);
                        n5 += n23;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n25, n7, n27);
                        n6 += n21;
                        n4 += n22;
                        n10 += n26;
                        n += class237.ae;
                        n7 += n28;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n5 += n23;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n25, n7, n27);
                    n6 += n21;
                    n4 += n22;
                    n10 += n26;
                    n += class237.ae;
                    n7 += n28;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n29) {
                return;
            }
            if (n3 > n29) {
                n3 = n29;
            }
            if (n > n29) {
                n = n29;
            }
            n11 = (n11 << 8) - n25 * n5 + n25;
            n8 = n8 - n27 * n5 + n27;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n23 * n3;
                    n3 = 0;
                }
                if ((n2 != n3 && n22 < n21) || (n2 == n3 && n22 > n23)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n25, n8, n27);
                        n4 += n22;
                        n6 += n23;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n25, n8, n27);
                    n4 += n22;
                    n6 += n23;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n22 * n2;
                    n5 -= n21 * n2;
                    n11 -= n26 * n2;
                    n8 -= n28 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n23 * n;
                    n = 0;
                }
                if (n22 < n21) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n6 += n22;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    while (--n3 >= 0) {
                        this.method1365(class237.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n25, n8, n27);
                        n4 += n23;
                        n5 += n21;
                        n11 += n26;
                        n2 += class237.ae;
                        n8 += n28;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n25, n8, n27);
                    n6 += n22;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
                while (--n3 >= 0) {
                    this.method1365(class237.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n25, n8, n27);
                    n4 += n23;
                    n5 += n21;
                    n11 += n26;
                    n2 += class237.ae;
                    n8 += n28;
                }
            }
        }
        else {
            if (n3 >= n29) {
                return;
            }
            if (n > n29) {
                n = n29;
            }
            if (n2 > n29) {
                n2 = n29;
            }
            n12 = (n12 << 8) - n25 * n6 + n25;
            n9 = n9 - n27 * n6 + n27;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n22 * n;
                    n = 0;
                }
                if (n21 < n23) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n25, n9, n27);
                        n5 += n21;
                        n4 += n22;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n21;
                    n4 += n22;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n21 * n3;
                    n6 -= n23 * n3;
                    n12 -= n26 * n3;
                    n9 -= n28 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n22 * n2;
                    n2 = 0;
                }
                if (n21 < n23) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n4 += n21;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    while (--n >= 0) {
                        this.method1365(class237.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n25, n9, n27);
                        n5 += n22;
                        n6 += n23;
                        n12 += n26;
                        n3 += class237.ae;
                        n9 += n28;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n25, n9, n27);
                    n4 += n21;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
                while (--n >= 0) {
                    this.method1365(class237.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n25, n9, n27);
                    n5 += n22;
                    n6 += n23;
                    n12 += n26;
                    n3 += class237.ae;
                    n9 += n28;
                }
            }
        }
    }
    
    @Override
    void vmethod1366(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, final int n10) {
        final int n11 = n5 - n4;
        final int n12 = n2 - n;
        final int n13 = n6 - n4;
        final int n14 = n3 - n;
        final float n15 = n8 - n7;
        final float n16 = n9 - n7;
        int n17;
        if (n3 != n2) {
            n17 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n17 = 0;
        }
        int n18;
        if (n2 != n) {
            n18 = (n11 << 14) / n12;
        }
        else {
            n18 = 0;
        }
        int n19;
        if (n3 != n) {
            n19 = (n13 << 14) / n14;
        }
        else {
            n19 = 0;
        }
        final int n20 = n11 * n14 - n13 * n12;
        if (n20 == 0) {
            return;
        }
        final float n21 = (n15 * n14 - n16 * n12) / n20;
        final float n22 = (n16 * n11 - n15 * n13) / n20;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n23 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n23) {
                return;
            }
            if (n2 > n23) {
                n2 = n23;
            }
            if (n3 > n23) {
                n3 = n23;
            }
            n7 = n7 - n21 * n4 + n21;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n19 * n;
                    n4 -= n18 * n;
                    n7 -= n22 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n17 * n2;
                    n2 = 0;
                }
                if ((n != n2 && n19 < n18) || (n == n2 && n19 > n17)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n6 >> 14, n4 >> 14, n7, n21);
                        n6 += n19;
                        n4 += n18;
                        n += class237.ae;
                        n7 += n22;
                    }
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n6 >> 14, n5 >> 14, n7, n21);
                        n6 += n19;
                        n5 += n17;
                        n += class237.ae;
                        n7 += n22;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n4 >> 14, n6 >> 14, n7, n21);
                    n6 += n19;
                    n4 += n18;
                    n += class237.ae;
                    n7 += n22;
                }
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n5 >> 14, n6 >> 14, n7, n21);
                    n6 += n19;
                    n5 += n17;
                    n += class237.ae;
                    n7 += n22;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n19 * n;
                    n4 -= n18 * n;
                    n7 -= n22 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n17 * n3;
                    n3 = 0;
                }
                if ((n != n3 && n19 < n18) || (n == n3 && n17 > n18)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n5 >> 14, n4 >> 14, n7, n21);
                        n5 += n19;
                        n4 += n18;
                        n += class237.ae;
                        n7 += n22;
                    }
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n6 >> 14, n4 >> 14, n7, n21);
                        n6 += n17;
                        n4 += n18;
                        n += class237.ae;
                        n7 += n22;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n4 >> 14, n5 >> 14, n7, n21);
                    n5 += n19;
                    n4 += n18;
                    n += class237.ae;
                    n7 += n22;
                }
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n4 >> 14, n6 >> 14, n7, n21);
                    n6 += n17;
                    n4 += n18;
                    n += class237.ae;
                    n7 += n22;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n23) {
                return;
            }
            if (n3 > n23) {
                n3 = n23;
            }
            if (n > n23) {
                n = n23;
            }
            n8 = n8 - n21 * n5 + n21;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n18 * n2;
                    n5 -= n17 * n2;
                    n8 -= n22 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n19 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n18 >= n17) && (n2 != n3 || n18 <= n19)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n5 >> 14, n4 >> 14, n8, n21);
                        n4 += n18;
                        n5 += n17;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    while (--n >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n6 >> 14, n4 >> 14, n8, n21);
                        n4 += n18;
                        n6 += n19;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n4 >> 14, n5 >> 14, n8, n21);
                    n4 += n18;
                    n5 += n17;
                    n2 += class237.ae;
                    n8 += n22;
                }
                while (--n >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n4 >> 14, n6 >> 14, n8, n21);
                    n4 += n18;
                    n6 += n19;
                    n2 += class237.ae;
                    n8 += n22;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n18 * n2;
                    n5 -= n17 * n2;
                    n8 -= n22 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n19 * n;
                    n = 0;
                }
                if (n18 < n17) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n6 >> 14, n5 >> 14, n8, n21);
                        n6 += n18;
                        n5 += n17;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n4 >> 14, n5 >> 14, n8, n21);
                        n4 += n19;
                        n5 += n17;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n5 >> 14, n6 >> 14, n8, n21);
                    n6 += n18;
                    n5 += n17;
                    n2 += class237.ae;
                    n8 += n22;
                }
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n5 >> 14, n4 >> 14, n8, n21);
                    n4 += n19;
                    n5 += n17;
                    n2 += class237.ae;
                    n8 += n22;
                }
            }
        }
        else {
            if (n3 >= n23) {
                return;
            }
            if (n > n23) {
                n = n23;
            }
            if (n2 > n23) {
                n2 = n23;
            }
            n9 = n9 - n21 * n6 + n21;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n17 * n3;
                    n6 -= n19 * n3;
                    n9 -= n22 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n18 * n;
                    n = 0;
                }
                if (n17 < n19) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n5 >> 14, n6 >> 14, n9, n21);
                        n5 += n17;
                        n6 += n19;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n5 >> 14, n4 >> 14, n9, n21);
                        n5 += n17;
                        n4 += n18;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n6 >> 14, n5 >> 14, n9, n21);
                    n5 += n17;
                    n6 += n19;
                    n3 += class237.ae;
                    n9 += n22;
                }
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n4 >> 14, n5 >> 14, n9, n21);
                    n5 += n17;
                    n4 += n18;
                    n3 += class237.ae;
                    n9 += n22;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n17 * n3;
                    n6 -= n19 * n3;
                    n9 -= n22 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n18 * n2;
                    n2 = 0;
                }
                if (n17 < n19) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n4 >> 14, n6 >> 14, n9, n21);
                        n4 += n17;
                        n6 += n19;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    while (--n >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n5 >> 14, n6 >> 14, n9, n21);
                        n5 += n18;
                        n6 += n19;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n6 >> 14, n4 >> 14, n9, n21);
                    n4 += n17;
                    n6 += n19;
                    n3 += class237.ae;
                    n9 += n22;
                }
                while (--n >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n6 >> 14, n5 >> 14, n9, n21);
                    n5 += n18;
                    n6 += n19;
                    n3 += class237.ae;
                    n9 += n22;
                }
            }
        }
    }
    
    static final void method1372(final int[] array, final float[] array2, final int[] array3, final int n, final int n2, final int n3, final float n4) {
        final int n5 = array3[(n3 & 0x3F80) + (n3 >>> 25)];
        if (n5 == 0) {
            return;
        }
        if (method1368(array2[n], n4)) {
            array[n] = ((n5 & 0xFF00FF) * n2 & 0xFF00FF00) + ((n5 & 0xFF00) * n2 & 0xFF0000) >> 8;
            array2[n] = n4;
        }
    }
    
    @Override
    void bz(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, -387854036);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, -1745594751);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-85));
        final int n23 = n5 - n4;
        final int n24 = n2 - n;
        final int n25 = n6 - n4;
        final int n26 = n3 - n;
        final int n27 = n11 - n10;
        final int n28 = n12 - n10;
        int n29 = 0;
        if (n2 != n) {
            n29 = (n5 - n4 << 14) / (n2 - n);
        }
        int n30 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n31 = 0;
        if (n3 != n) {
            n31 = (n4 - n6 << 14) / (n - n3);
        }
        final int n32 = n23 * n26 - n25 * n24;
        if (n32 == 0) {
            return;
        }
        final int n33 = (n27 * n26 - n28 * n24 << 9) / n32;
        final int n34 = (n28 * n23 - n27 * n25 << 9) / n32;
        final float n35 = n8 - n7;
        final float n36 = n9 - n7;
        final float n37 = (n35 * n26 - n36 * n24) / n32;
        final float n38 = (n36 * n23 - n35 * n25) / n32;
        final int n39 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n40 = n15 * n16 - n18 * n13 << 14;
        final int n41 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n39);
        final int n42 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n39);
        final int n43 = n14 * n16 - n17 * n13 << 14;
        final int n44 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n39);
        final int n45 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n39);
        final int n46 = n17 * n15 - n14 * n18 << 14;
        final int n47 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n39);
        final int n48 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n39);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n49 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n49) {
                return;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            n7 = n7 - n37 * n4 + n37;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n40 + n42 * n50;
                int n52 = n43 + n45 * n50;
                int n53 = n46 + n48 * n50;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n54 = n - this.al.field2229 * 1666539507;
                int n55 = n40 + n42 * n54;
                int n56 = n43 + n45 * n54;
                int n57 = n46 + n48 * n54;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n49) {
                return;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            if (n > n49) {
                n = n49;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            n8 = n8 - n37 * n5 + n37;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n40 + n42 * n58;
                int n60 = n43 + n45 * n58;
                int n61 = n46 + n48 * n58;
                if ((n2 != n3 && n29 < n30) || (n2 == n3 && n29 > n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n62 = n2 - this.al.field2229 * 1666539507;
                int n63 = n40 + n42 * n62;
                int n64 = n43 + n45 * n62;
                int n65 = n46 + n48 * n62;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
            }
        }
        else {
            if (n3 >= n49) {
                return;
            }
            if (n > n49) {
                n = n49;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            n9 = n9 - n37 * n6 + n37;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n40 + n42 * n66;
                int n68 = n43 + n45 * n66;
                int n69 = n46 + n48 * n66;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n70 = n3 - this.al.field2229 * 1666539507;
                int n71 = n40 + n42 * n70;
                int n72 = n43 + n45 * n70;
                int n73 = n46 + n48 * n70;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
            }
        }
    }
    
    final void method1377(final int[] array, final float[] array2, final int n, final int n2, final float n3) {
        final int method1368 = method1368(array2[n], n3) ? 1 : 0;
        final int n4 = 1 - method1368;
        array[n] = method1368 * n2 + n4 * array[n];
        array2[n] = method1368 * n3 + n4 * array2[n];
    }
    
    final void cq(final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7, float n8, final float n9) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * -1137221009) {
                n5 = this.al.field2233 * 196193303;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n += n4;
        n6 += n7 * n4;
        n8 += n9 * n4;
        if (this.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (this.al.field2225 * 1176260111 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> -693882335 & 0x1) - 1) >> 8];
                        n6 += n7;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        this.method1377(array, class237.by, n, n2, n8);
                        n8 += n9;
                        ++n;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n10 = this.al.field2225 * 1077282131;
                final int n11 = 1310186038 - this.al.field2225 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 2099208950 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0x97C52A01) * n11 >> 8 & 0x3B9E2767) + ((n2 & 0xF09A30C1) * n11 >> 8 & 0x86023D91);
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 612478302 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xD4AC1E85) * n11 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n11 >> 8 & 0x3E8EDBF1);
                    do {
                        this.cn(array, class237.by, n, n2, n10, n8);
                        ++n;
                        n8 += n9;
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (this.al.field2225 * -1861189396 == 0) {
            do {
                this.method1375(array, class237.by, n, n6, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n12 = this.al.field2225 * -414282541;
            final int n13 = 256 - this.al.field2225 * 918495667;
            do {
                this.method1364(array, class237.by, n, n2, n12, n13, n8);
                n8 += n9;
                ++n;
                n6 += n7;
            } while (--n3 > 0);
        }
    }
    
    @Override
    void bm(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, -389561066);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, 1423709318);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-110));
        final int n23 = n5 - n4;
        final int n24 = n2 - n;
        final int n25 = n6 - n4;
        final int n26 = n3 - n;
        final int n27 = n11 - n10;
        final int n28 = n12 - n10;
        int n29 = 0;
        if (n2 != n) {
            n29 = (n5 - n4 << 14) / (n2 - n);
        }
        int n30 = 0;
        if (n3 != n2) {
            n30 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n31 = 0;
        if (n3 != n) {
            n31 = (n4 - n6 << 14) / (n - n3);
        }
        final int n32 = n23 * n26 - n25 * n24;
        if (n32 == 0) {
            return;
        }
        final int n33 = (n27 * n26 - n28 * n24 << 9) / n32;
        final int n34 = (n28 * n23 - n27 * n25 << 9) / n32;
        final float n35 = n8 - n7;
        final float n36 = n9 - n7;
        final float n37 = (n35 * n26 - n36 * n24) / n32;
        final float n38 = (n36 * n23 - n35 * n25) / n32;
        final int n39 = this.al.field2227 * 2095243635;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n40 = n15 * n16 - n18 * n13 << 14;
        final int n41 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n39);
        final int n42 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n39);
        final int n43 = n14 * n16 - n17 * n13 << 14;
        final int n44 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n39);
        final int n45 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n39);
        final int n46 = n17 * n15 - n14 * n18 << 14;
        final int n47 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n39);
        final int n48 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n39);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n49 = this.al.field2232 * -1125439835;
        if (n <= n2 && n <= n3) {
            if (n >= n49) {
                return;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            n7 = n7 - n37 * n4 + n37;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n40 + n42 * n50;
                int n52 = n43 + n45 * n50;
                int n53 = n46 + n48 * n50;
                if ((n != n2 && n31 < n29) || (n == n2 && n31 > n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class237.ae;
                        n51 += n42;
                        n52 += n45;
                        n53 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n7, n37, n51, n52, n53, n41, n44, n47);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class237.ae;
                    n51 += n42;
                    n52 += n45;
                    n53 += n48;
                    n7 += n38;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n7 -= n38 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n54 = n - this.al.field2229 * -1201085637;
                int n55 = n40 + n42 * n54;
                int n56 = n43 + n45 * n54;
                int n57 = n46 + n48 * n54;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class237.ae;
                        n55 += n42;
                        n56 += n45;
                        n57 += n48;
                        n7 += n38;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n7, n37, n55, n56, n57, n41, n44, n47);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class237.ae;
                    n55 += n42;
                    n56 += n45;
                    n57 += n48;
                    n7 += n38;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n49) {
                return;
            }
            if (n3 > n49) {
                n3 = n49;
            }
            if (n > n49) {
                n = n49;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            n8 = n8 - n37 * n5 + n37;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n58 = n2 - this.al.field2229 * 60775828;
                int n59 = n40 + n42 * n58;
                int n60 = n43 + n45 * n58;
                int n61 = n46 + n48 * n58;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class237.ae;
                        n59 += n42;
                        n60 += n45;
                        n61 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n8, n37, n59, n60, n61, n41, n44, n47);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class237.ae;
                    n59 += n42;
                    n60 += n45;
                    n61 += n48;
                    n8 += n38;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n8 -= n38 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n62 = n2 - this.al.field2229 * 1666539507;
                int n63 = n40 + n42 * n62;
                int n64 = n43 + n45 * n62;
                int n65 = n46 + n48 * n62;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    while (--n3 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class237.ae;
                        n63 += n42;
                        n64 += n45;
                        n65 += n48;
                        n8 += n38;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
                while (--n3 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n8, n37, n63, n64, n65, n41, n44, n47);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class237.ae;
                    n63 += n42;
                    n64 += n45;
                    n65 += n48;
                    n8 += n38;
                }
            }
        }
        else {
            if (n3 >= n49) {
                return;
            }
            if (n > n49) {
                n = n49;
            }
            if (n2 > n49) {
                n2 = n49;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            n9 = n9 - n37 * n6 + n37;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n40 + n42 * n66;
                int n68 = n43 + n45 * n66;
                int n69 = n46 + n48 * n66;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class237.ae;
                        n67 += n42;
                        n68 += n45;
                        n69 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n9, n37, n67, n68, n69, n41, n44, n47);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class237.ae;
                    n67 += n42;
                    n68 += n45;
                    n69 += n48;
                    n9 += n38;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n9 -= n38 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n70 = n3 - this.al.field2229 * 1431916045;
                int n71 = n40 + n42 * n70;
                int n72 = n43 + n45 * n70;
                int n73 = n46 + n48 * n70;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    while (--n >= 0) {
                        this.cz(class237.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class237.ae;
                        n71 += n42;
                        n72 += n45;
                        n73 += n48;
                        n9 += n38;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
                while (--n >= 0) {
                    this.cz(class237.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n9, n37, n71, n72, n73, n41, n44, n47);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class237.ae;
                    n71 += n42;
                    n72 += n45;
                    n73 += n48;
                    n9 += n38;
                }
            }
        }
    }
    
    @Override
    void bk(int n, int n2, int n3, int n4, int n5, int n6, float n7, float n8, float n9, final int n10) {
        final int n11 = n5 - n4;
        final int n12 = n2 - n;
        final int n13 = n6 - n4;
        final int n14 = n3 - n;
        final float n15 = n8 - n7;
        final float n16 = n9 - n7;
        int n17;
        if (n3 != n2) {
            n17 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n17 = 0;
        }
        int n18;
        if (n2 != n) {
            n18 = (n11 << 14) / n12;
        }
        else {
            n18 = 0;
        }
        int n19;
        if (n3 != n) {
            n19 = (n13 << 14) / n14;
        }
        else {
            n19 = 0;
        }
        final int n20 = n11 * n14 - n13 * n12;
        if (n20 == 0) {
            return;
        }
        final float n21 = (n15 * n14 - n16 * n12) / n20;
        final float n22 = (n16 * n11 - n15 * n13) / n20;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n23 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n23) {
                return;
            }
            if (n2 > n23) {
                n2 = n23;
            }
            if (n3 > n23) {
                n3 = n23;
            }
            n7 = n7 - n21 * n4 + n21;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n19 * n;
                    n4 -= n18 * n;
                    n7 -= n22 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n17 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n19 >= n18) && (n != n2 || n19 <= n17)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n4 >> 14, n6 >> 14, n7, n21);
                        n6 += n19;
                        n4 += n18;
                        n += class237.ae;
                        n7 += n22;
                    }
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n5 >> 14, n6 >> 14, n7, n21);
                        n6 += n19;
                        n5 += n17;
                        n += class237.ae;
                        n7 += n22;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n6 >> 14, n4 >> 14, n7, n21);
                    n6 += n19;
                    n4 += n18;
                    n += class237.ae;
                    n7 += n22;
                }
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n6 >> 14, n5 >> 14, n7, n21);
                    n6 += n19;
                    n5 += n17;
                    n += class237.ae;
                    n7 += n22;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n19 * n;
                    n4 -= n18 * n;
                    n7 -= n22 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n17 * n3;
                    n3 = 0;
                }
                if ((n != n3 && n19 < n18) || (n == n3 && n17 > n18)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n5 >> 14, n4 >> 14, n7, n21);
                        n5 += n19;
                        n4 += n18;
                        n += class237.ae;
                        n7 += n22;
                    }
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n, n10, 0, n6 >> 14, n4 >> 14, n7, n21);
                        n6 += n17;
                        n4 += n18;
                        n += class237.ae;
                        n7 += n22;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n4 >> 14, n5 >> 14, n7, n21);
                    n5 += n19;
                    n4 += n18;
                    n += class237.ae;
                    n7 += n22;
                }
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n, n10, 0, n4 >> 14, n6 >> 14, n7, n21);
                    n6 += n17;
                    n4 += n18;
                    n += class237.ae;
                    n7 += n22;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n23) {
                return;
            }
            if (n3 > n23) {
                n3 = n23;
            }
            if (n > n23) {
                n = n23;
            }
            n8 = n8 - n21 * n5 + n21;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n18 * n2;
                    n5 -= n17 * n2;
                    n8 -= n22 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n19 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n18 >= n17) && (n2 != n3 || n18 <= n19)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n5 >> 14, n4 >> 14, n8, n21);
                        n4 += n18;
                        n5 += n17;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    while (--n >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n6 >> 14, n4 >> 14, n8, n21);
                        n4 += n18;
                        n6 += n19;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n4 >> 14, n5 >> 14, n8, n21);
                    n4 += n18;
                    n5 += n17;
                    n2 += class237.ae;
                    n8 += n22;
                }
                while (--n >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n4 >> 14, n6 >> 14, n8, n21);
                    n4 += n18;
                    n6 += n19;
                    n2 += class237.ae;
                    n8 += n22;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n18 * n2;
                    n5 -= n17 * n2;
                    n8 -= n22 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n19 * n;
                    n = 0;
                }
                if (n18 < n17) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n6 >> 14, n5 >> 14, n8, n21);
                        n6 += n18;
                        n5 += n17;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    while (--n3 >= 0) {
                        this.method1367(class237.ad, n2, n10, 0, n4 >> 14, n5 >> 14, n8, n21);
                        n4 += n19;
                        n5 += n17;
                        n2 += class237.ae;
                        n8 += n22;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n5 >> 14, n6 >> 14, n8, n21);
                    n6 += n18;
                    n5 += n17;
                    n2 += class237.ae;
                    n8 += n22;
                }
                while (--n3 >= 0) {
                    this.method1367(class237.ad, n2, n10, 0, n5 >> 14, n4 >> 14, n8, n21);
                    n4 += n19;
                    n5 += n17;
                    n2 += class237.ae;
                    n8 += n22;
                }
            }
        }
        else {
            if (n3 >= n23) {
                return;
            }
            if (n > n23) {
                n = n23;
            }
            if (n2 > n23) {
                n2 = n23;
            }
            n9 = n9 - n21 * n6 + n21;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n17 * n3;
                    n6 -= n19 * n3;
                    n9 -= n22 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n18 * n;
                    n = 0;
                }
                if (n17 < n19) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n5 >> 14, n6 >> 14, n9, n21);
                        n5 += n17;
                        n6 += n19;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n5 >> 14, n4 >> 14, n9, n21);
                        n5 += n17;
                        n4 += n18;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n6 >> 14, n5 >> 14, n9, n21);
                    n5 += n17;
                    n6 += n19;
                    n3 += class237.ae;
                    n9 += n22;
                }
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n4 >> 14, n5 >> 14, n9, n21);
                    n5 += n17;
                    n4 += n18;
                    n3 += class237.ae;
                    n9 += n22;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n17 * n3;
                    n6 -= n19 * n3;
                    n9 -= n22 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n18 * n2;
                    n2 = 0;
                }
                if (n17 < n19) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n4 >> 14, n6 >> 14, n9, n21);
                        n4 += n17;
                        n6 += n19;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    while (--n >= 0) {
                        this.method1367(class237.ad, n3, n10, 0, n5 >> 14, n6 >> 14, n9, n21);
                        n5 += n18;
                        n6 += n19;
                        n3 += class237.ae;
                        n9 += n22;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n6 >> 14, n4 >> 14, n9, n21);
                    n4 += n17;
                    n6 += n19;
                    n3 += class237.ae;
                    n9 += n22;
                }
                while (--n >= 0) {
                    this.method1367(class237.ad, n3, n10, 0, n6 >> 14, n5 >> 14, n9, n21);
                    n5 += n18;
                    n6 += n19;
                    n3 += class237.ae;
                    n9 += n22;
                }
            }
        }
    }
    
    public static void yu(final class237 class237, final int[] array, int n, int n2, int n3, int n4, int n5, float n6, final float n7) {
        if (class237 == null) {
            class237.ct(array, array, n, n, n, n, n, n, n, n6, n6, n, n, n, n, n, n);
            return;
        }
        if (class237.al.field2234) {
            if (n5 > class237.al.field2233 * 5413240) {
                n5 = class237.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n += n4;
        n3 = n5 - n4 >> 2;
        n6 += n7 * n4;
        if (class237.al.field2225 * 389732665 == 0) {
            while (--n3 >= 0) {
                class237.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
                class237.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
                class237.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
                class237.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                class237.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
            }
        }
        else if (class237.al.field2225 * -1402801648 == 254) {
            while (--n3 >= 0) {
                array[n++] = array[n];
                array[n++] = array[n];
                array[n++] = array[n];
                array[n++] = array[n];
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                array[n++] = array[n];
            }
        }
        else {
            final int n8 = class237.al.field2225 * 918495667;
            final int n9 = -1958823801 - class237.al.field2225 * 918495667;
            n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0x2CEF158A) + ((n2 & 0xFF00) * n9 >> 8 & 0x9558F560);
            while (--n3 >= 0) {
                class237.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
                class237.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
                class237.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
                class237.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                class237.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
            }
        }
    }
    
    static final boolean method1368(final float n, final float n2) {
        return n2 > n;
    }
    
    final void method1367(final int[] array, int n, int n2, int n3, int n4, int n5, float n6, final float n7) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n += n4;
        n3 = n5 - n4 >> 2;
        n6 += n7 * n4;
        if (this.al.field2225 * 918495667 == 0) {
            while (--n3 >= 0) {
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                this.method1377(array, class237.by, n, n2, n6);
                n6 += n7;
                ++n;
            }
        }
        else if (this.al.field2225 * 918495667 == 254) {
            while (--n3 >= 0) {
                array[n++] = array[n];
                array[n++] = array[n];
                array[n++] = array[n];
                array[n++] = array[n];
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                array[n++] = array[n];
            }
        }
        else {
            final int n8 = this.al.field2225 * 918495667;
            final int n9 = 256 - this.al.field2225 * 918495667;
            n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
            while (--n3 >= 0) {
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                this.cn(array, class237.by, n, n2, n8, n6);
                ++n;
                n6 += n7;
            }
        }
    }
}
