// 
// Decompiled by Procyon v0.5.36
// 

public class class235 extends class220
{
    class235(final Clips clips) {
        super(clips);
    }
    
    void method1351(final int[] array, final int[] array2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, final int n11, final int n12, final int n13) {
        if (this.al.field2234) {
            if (n5 > this.al.clipNegativeMidY * 571147771) {
                n5 = this.al.field2232 * 571147771;
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
        final int n14 = n5 - n4;
        if (super.field2006) {
            final int n15 = n4 - this.al.field2238 * 93675259;
            n8 += (n11 >> 3) * n15;
            n9 += (n12 >> 3) * n15;
            n10 += (n13 >> 3) * n15;
            final int n16 = n10 >> 12;
            int n17;
            int n18;
            if (n16 != 0) {
                n17 = n8 / n16;
                n18 = n9 / n16;
                if (n17 < 0) {
                    n17 = 0;
                }
                else if (n17 > 4032) {
                    n17 = 4032;
                }
            }
            else {
                n17 = 0;
                n18 = 0;
            }
            n8 += n11;
            n9 += n12;
            n10 += n13;
            final int n19 = n10 >> 12;
            int n20;
            int n21;
            if (n19 != 0) {
                n20 = n8 / n19;
                n21 = n9 / n19;
                if (n20 < 0) {
                    n20 = 0;
                }
                else if (n20 > 4032) {
                    n20 = 4032;
                }
            }
            else {
                n20 = 0;
                n21 = 0;
            }
            n = (n17 << 20) + n18;
            int n22 = (n20 - n17 >> 3 << 20) + (n21 - n18 >> 3);
            int n23 = n14 >> 3;
            n7 <<= 3;
            int n24 = n6 >> 8;
            if (super.field2003) {
                if (n23 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        final int n25 = n20;
                        final int n26 = n21;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n27 = n10 >> 12;
                        if (n27 != 0) {
                            n20 = n8 / n27;
                            n21 = n9 / n27;
                            if (n20 < 0) {
                                n20 = 0;
                            }
                            else if (n20 > 4032) {
                                n20 = 4032;
                            }
                        }
                        else {
                            n20 = 0;
                            n21 = 0;
                        }
                        n = (n25 << 20) + n26;
                        n22 = (n20 - n25 >> 3 << 20) + (n21 - n26 >> 3);
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n28 = n5 - n4 & 0x7;
                if (n28 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                    } while (--n28 > 0);
                }
            }
            else {
                if (n23 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        final int n29 = n20;
                        final int n30 = n21;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n31 = n10 >> 12;
                        if (n31 != 0) {
                            n20 = n8 / n31;
                            n21 = n9 / n31;
                            if (n20 < 0) {
                                n20 = 0;
                            }
                            else if (n20 > 4032) {
                                n20 = 4032;
                            }
                        }
                        else {
                            n20 = 0;
                            n21 = 0;
                        }
                        n = (n29 << 20) + n30;
                        n22 = (n20 - n29 >> 3 << 20) + (n21 - n30 >> 3);
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n32 = n5 - n4 & 0x7;
                if (n32 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                    } while (--n32 > 0);
                }
            }
        }
        else {
            final int n33 = n4 - this.al.clipNegativeMidY * 93675259;
            n8 += (n11 >> 3) * n33;
            n9 += (n12 >> 3) * n33;
            n10 += (n13 >> 3) * n33;
            final int n34 = n10 >> 14;
            int n35;
            int n36;
            if (n34 != 0) {
                n35 = n8 / n34;
                n36 = n9 / n34;
                if (n35 < 0) {
                    n35 = 0;
                }
                else if (n35 > 16256) {
                    n35 = 16256;
                }
            }
            else {
                n35 = 0;
                n36 = 0;
            }
            n8 += n11;
            n9 += n12;
            n10 += n13;
            final int n37 = n10 >> 14;
            int n38;
            int n39;
            if (n37 != 0) {
                n38 = n8 / n37;
                n39 = n9 / n37;
                if (n38 < 0) {
                    n38 = 0;
                }
                else if (n38 > 16256) {
                    n38 = 16256;
                }
            }
            else {
                n38 = 0;
                n39 = 0;
            }
            n = (n35 << 18) + n36;
            int n40 = (n38 - n35 >> 3 << 18) + (n39 - n36 >> 3);
            int n41 = n14 >> 3;
            n7 <<= 3;
            int n42 = n6 >> 8;
            if (this.af) {
                if (n41 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        final int n43 = n38;
                        final int n44 = n39;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n45 = n10 >> 14;
                        if (n45 != 0) {
                            n38 = n8 / n45;
                            n39 = n9 / n45;
                            if (n38 < 0) {
                                n38 = 0;
                            }
                            else if (n38 > 16256) {
                                n38 = 16256;
                            }
                        }
                        else {
                            n38 = 0;
                            n39 = 0;
                        }
                        n = (n43 << 18) + n44;
                        n40 = (n38 - n43 >> 3 << 18) + (n39 - n44 >> 3);
                        n6 += n7;
                        n42 = n6 >> 8;
                    } while (--n41 > 0);
                }
                int n46 = n5 - n4 & 0x7;
                if (n46 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                    } while (--n46 > 0);
                }
            }
            else {
                if (n41 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        final int n47 = n38;
                        final int n48 = n39;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n49 = n10 >> 14;
                        if (n49 != 0) {
                            n38 = n8 / n49;
                            n39 = n9 / n49;
                            if (n38 < 0) {
                                n38 = 0;
                            }
                            else if (n38 > 16256) {
                                n38 = 16256;
                            }
                        }
                        else {
                            n38 = 0;
                            n39 = 0;
                        }
                        n = (n47 << 18) + n48;
                        n40 = (n38 - n47 >> 3 << 18) + (n39 - n48 >> 3);
                        n6 += n7;
                        n42 = n6 >> 8;
                    } while (--n41 > 0);
                }
                int n50 = n5 - n4 & 0x7;
                if (n50 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                    } while (--n50 > 0);
                }
            }
        }
    }
    
    void ba(final int[] array, int n, int n2, int n3, int n4, int n5) {
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
        if (this.al.field2225 * 918495667 == 0) {
            while (--n3 >= 0) {
                array[n++] = n2;
                array[n++] = n2;
                array[n++] = n2;
                array[n++] = n2;
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                array[n++] = n2;
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
            final int n6 = this.al.field2225 * 918495667;
            final int n7 = 256 - this.al.field2225 * 918495667;
            n2 = ((n2 & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n7 >> 8 & 0xFF00);
            while (--n3 >= 0) {
                final int n8 = array[n];
                array[n++] = n2 + ((n8 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n6 >> 8 & 0xFF00);
                final int n9 = array[n];
                array[n++] = n2 + ((n9 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n9 & 0xFF00) * n6 >> 8 & 0xFF00);
                final int n10 = array[n];
                array[n++] = n2 + ((n10 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n6 >> 8 & 0xFF00);
                final int n11 = array[n];
                array[n++] = n2 + ((n11 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n11 & 0xFF00) * n6 >> 8 & 0xFF00);
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                final int n12 = array[n];
                array[n++] = n2 + ((n12 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n12 & 0xFF00) * n6 >> 8 & 0xFF00);
            }
        }
    }
    
    @Override
    void bb(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        int n19;
        if (n3 != n2) {
            n19 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n19 = 0;
        }
        int n20;
        if (n2 != n) {
            n20 = (n13 << 14) / n14;
        }
        else {
            n20 = 0;
        }
        int n21;
        if (n3 != n) {
            n21 = (n15 << 14) / n16;
        }
        else {
            n21 = 0;
        }
        final int n22 = n13 * n16 - n15 * n14;
        if (n22 == 0) {
            return;
        }
        final int n23 = (n17 * n16 - n18 * n14 << 8) / n22;
        final int n24 = (n18 * n13 - n17 * n15 << 8) / n22;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n25 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n25) {
                return;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            n10 = (n10 << 8) - n23 * n4 + n23;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n19 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n21 >= n20) && (n != n2 || n21 <= n19)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n5 += n19;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n23);
                    n6 += n21;
                    n5 += n19;
                    n10 += n24;
                    n += class235.ae;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n19 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n21 >= n20) && (n != n3 || n19 <= n20)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n23);
                        n5 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n19;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n23);
                    n5 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n19;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n25) {
                return;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            if (n > n25) {
                n = n25;
            }
            n11 = (n11 << 8) - n23 * n5 + n23;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n20 >= n19) && (n2 != n3 || n20 <= n21)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                        n4 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n23);
                        n4 += n20;
                        n6 += n21;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                    n4 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n23);
                    n4 += n20;
                    n6 += n21;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n21 * n;
                    n = 0;
                }
                if (n20 < n19) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n23);
                        n6 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                        n4 += n21;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n23);
                    n6 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                    n4 += n21;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
        }
        else {
            if (n3 >= n25) {
                return;
            }
            if (n > n25) {
                n = n25;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            n12 = (n12 << 8) - n23 * n6 + n23;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n20 * n;
                    n = 0;
                }
                if (n19 < n21) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n23);
                        n5 += n19;
                        n4 += n20;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n4 += n20;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n20 * n2;
                    n2 = 0;
                }
                if (n19 < n21) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n23);
                        n4 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n20;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n23);
                    n4 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n20;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
        }
    }
    
    @Override
    void vmethod1362(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, -1596513386);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, -1399904528);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-101));
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
        final int n35 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n36 = n15 * n16 - n18 * n13 << 14;
        final int n37 = (int)(((long)(n18 * n19 - n21 * n16) << 14) / n35);
        final int n38 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n35);
        final int n39 = n14 * n16 - n17 * n13 << 14;
        final int n40 = (int)(((long)(n17 * n19 - n20 * n16) << 14) / n35);
        final int n41 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n35);
        final int n42 = n17 * n15 - n14 * n18 << 14;
        final int n43 = (int)(((long)(n20 * n18 - n17 * n21) << 14) / n35);
        final int n44 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n35);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n45 = this.al.field2232 * -1347859351;
        final int n46 = this.al.field2229 * 1666539507;
        if (n <= n2 && n <= n3) {
            if (n >= n45) {
                return;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n47 = n - n46;
                int n48 = n36 + n38 * n47;
                int n49 = n39 + n41 * n47;
                int n50 = n42 + n44 * n47;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n48 += n38;
                        n49 += n41;
                        n50 += n44;
                    }
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class235.ae;
                        n48 += n38;
                        n49 += n41;
                        n50 += n44;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n48 += n38;
                    n49 += n41;
                    n50 += n44;
                }
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class235.ae;
                    n48 += n38;
                    n49 += n41;
                    n50 += n44;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n51 = n - n46;
                int n52 = n36 + n38 * n51;
                int n53 = n39 + n41 * n51;
                int n54 = n42 + n44 * n51;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n52 += n38;
                        n53 += n41;
                        n54 += n44;
                    }
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n52 += n38;
                        n53 += n41;
                        n54 += n44;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n52 += n38;
                    n53 += n41;
                    n54 += n44;
                }
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n52 += n38;
                    n53 += n41;
                    n54 += n44;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n45) {
                return;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            if (n > n45) {
                n = n45;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n55 = n2 - n46;
                int n56 = n36 + n38 * n55;
                int n57 = n39 + n41 * n55;
                int n58 = n42 + n44 * n55;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n56 += n38;
                        n57 += n41;
                        n58 += n44;
                    }
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class235.ae;
                        n56 += n38;
                        n57 += n41;
                        n58 += n44;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n56 += n38;
                    n57 += n41;
                    n58 += n44;
                }
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class235.ae;
                    n56 += n38;
                    n57 += n41;
                    n58 += n44;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n59 = n2 - n46;
                int n60 = n36 + n38 * n59;
                int n61 = n39 + n41 * n59;
                int n62 = n42 + n44 * n59;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n60 += n38;
                        n61 += n41;
                        n62 += n44;
                    }
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n60 += n38;
                        n61 += n41;
                        n62 += n44;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n60 += n38;
                    n61 += n41;
                    n62 += n44;
                }
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n60 += n38;
                    n61 += n41;
                    n62 += n44;
                }
            }
        }
        else {
            if (n3 >= n45) {
                return;
            }
            if (n > n45) {
                n = n45;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n63 = n3 - n46;
                int n64 = n36 + n38 * n63;
                int n65 = n39 + n41 * n63;
                int n66 = n42 + n44 * n63;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n64 += n38;
                        n65 += n41;
                        n66 += n44;
                    }
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class235.ae;
                        n64 += n38;
                        n65 += n41;
                        n66 += n44;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n64 += n38;
                    n65 += n41;
                    n66 += n44;
                }
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class235.ae;
                    n64 += n38;
                    n65 += n41;
                    n66 += n44;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n67 = n3 - n46;
                int n68 = n36 + n38 * n67;
                int n69 = n39 + n41 * n67;
                int n70 = n42 + n44 * n67;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n68 += n38;
                        n69 += n41;
                        n70 += n44;
                    }
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n68 += n38;
                        n69 += n41;
                        n70 += n44;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n68 += n38;
                    n69 += n41;
                    n70 += n44;
                }
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n68 += n38;
                    n69 += n41;
                    n70 += n44;
                }
            }
        }
    }
    
    @Override
    void be(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, final int n10) {
        int n11 = 0;
        if (n2 != n) {
            n11 = (n5 - n4 << 14) / (n2 - n);
        }
        int n12 = 0;
        if (n3 != n2) {
            n12 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n13 = 0;
        if (n3 != n) {
            n13 = (n4 - n6 << 14) / (n - n3);
        }
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n14 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n14) {
                return;
            }
            if (n2 > n14) {
                n2 = n14;
            }
            if (n3 > n14) {
                n3 = n14;
            }
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n13 * n;
                    n4 -= n11 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n12 * n2;
                    n2 = 0;
                }
                if ((n != n2 && n13 < n11) || (n == n2 && n13 > n12)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n6 >> 14, n4 >> 14);
                        n6 += n13;
                        n4 += n11;
                        n += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n6 >> 14, n5 >> 14);
                        n6 += n13;
                        n5 += n12;
                        n += class235.ae;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n4 >> 14, n6 >> 14);
                    n6 += n13;
                    n4 += n11;
                    n += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n5 >> 14, n6 >> 14);
                    n6 += n13;
                    n5 += n12;
                    n += class235.ae;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n13 * n;
                    n4 -= n11 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n12 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n13 >= n11) && (n != n3 || n12 <= n11)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n4 >> 14, n5 >> 14);
                        n5 += n13;
                        n4 += n11;
                        n += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n4 >> 14, n6 >> 14);
                        n6 += n12;
                        n4 += n11;
                        n += class235.ae;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n5 >> 14, n4 >> 14);
                    n5 += n13;
                    n4 += n11;
                    n += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n6 >> 14, n4 >> 14);
                    n6 += n12;
                    n4 += n11;
                    n += class235.ae;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n14) {
                return;
            }
            if (n3 > n14) {
                n3 = n14;
            }
            if (n > n14) {
                n = n14;
            }
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n11 * n2;
                    n5 -= n12 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n13 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n11 >= n12) && (n2 != n3 || n11 <= n13)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n5 >> 14, n4 >> 14);
                        n4 += n11;
                        n5 += n12;
                        n2 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n6 >> 14, n4 >> 14);
                        n4 += n11;
                        n6 += n13;
                        n2 += class235.ae;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n4 >> 14, n5 >> 14);
                    n4 += n11;
                    n5 += n12;
                    n2 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n4 >> 14, n6 >> 14);
                    n4 += n11;
                    n6 += n13;
                    n2 += class235.ae;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n11 * n2;
                    n5 -= n12 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n13 * n;
                    n = 0;
                }
                if (n11 < n12) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n6 >> 14, n5 >> 14);
                        n6 += n11;
                        n5 += n12;
                        n2 += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n4 >> 14, n5 >> 14);
                        n4 += n13;
                        n5 += n12;
                        n2 += class235.ae;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n5 >> 14, n6 >> 14);
                    n6 += n11;
                    n5 += n12;
                    n2 += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n5 >> 14, n4 >> 14);
                    n4 += n13;
                    n5 += n12;
                    n2 += class235.ae;
                }
            }
        }
        else {
            if (n3 >= n14) {
                return;
            }
            if (n > n14) {
                n = n14;
            }
            if (n2 > n14) {
                n2 = n14;
            }
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n12 * n3;
                    n6 -= n13 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n11 * n;
                    n = 0;
                }
                if (n12 < n13) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n5 >> 14, n6 >> 14);
                        n5 += n12;
                        n6 += n13;
                        n3 += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n5 >> 14, n4 >> 14);
                        n5 += n12;
                        n4 += n11;
                        n3 += class235.ae;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n6 >> 14, n5 >> 14);
                    n5 += n12;
                    n6 += n13;
                    n3 += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n4 >> 14, n5 >> 14);
                    n5 += n12;
                    n4 += n11;
                    n3 += class235.ae;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n12 * n3;
                    n6 -= n13 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n11 * n2;
                    n2 = 0;
                }
                if (n12 < n13) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n4 >> 14, n6 >> 14);
                        n4 += n12;
                        n6 += n13;
                        n3 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n5 >> 14, n6 >> 14);
                        n5 += n11;
                        n6 += n13;
                        n3 += class235.ae;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n6 >> 14, n4 >> 14);
                    n4 += n12;
                    n6 += n13;
                    n3 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n6 >> 14, n5 >> 14);
                    n5 += n11;
                    n6 += n13;
                    n3 += class235.ae;
                }
            }
        }
    }
    
    public static void ps(final class235 class235, final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (class235 == null) {
            class235.bu(array, n, n, n, n, n, n, n);
            return;
        }
        if (class235.al.field2234) {
            if (n5 > class235.al.field2233 * 1941613376) {
                n5 = class235.al.field2233 * -1693557958;
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
        if (class235.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (class235.al.field2225 * 161727876 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = class235.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = class235.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n8 = class235.al.field2225 * -1142269168;
                final int n9 = 2076993673 - class235.al.field2225 * -273754215;
                if (n3 > 0) {
                    do {
                        n2 = class235.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0x9EDF2C00) * n9 >> 8 & 0xAD0299AA) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                        final int n10 = array[n];
                        array[n++] = n2 + ((n10 & 0x2F600C74) * n8 >> 8 & 0xB3E94315) + ((n10 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n11 = array[n];
                        array[n++] = n2 + ((n11 & 0xFF00FF) * n8 >> 8 & 0x6D222497) + ((n11 & 0x9A34AF3B) * n8 >> 8 & 0xB40BDECF);
                        final int n12 = array[n];
                        array[n++] = n2 + ((n12 & 0xF7C22535) * n8 >> 8 & 0xFF00FF) + ((n12 & 0x2BD3F8C) * n8 >> 8 & 0xBB18E772);
                        final int n13 = array[n];
                        array[n++] = n2 + ((n13 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n13 & 0xD33E702A) * n8 >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = class235.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                    do {
                        final int n14 = array[n];
                        array[n++] = n2 + ((n14 & 0x5DC323F5) * n8 >> 8 & 0xEC60DB2) + ((n14 & 0x55F83FAD) * n8 >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (class235.al.field2225 * -350669271 == 0) {
            do {
                array[n++] = class235.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n15 = class235.al.field2225 * -1697966593;
            final int n16 = 256 - class235.al.field2225 * 918495667;
            do {
                n2 = class235.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
                n2 = ((n2 & 0xC1DED7C8) * n16 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n16 >> 8 & 0xFF00);
                final int n17 = array[n];
                array[n++] = n2 + ((n17 & 0xB8F87911) * n15 >> 8 & 0x991EF837) + ((n17 & 0x986DC424) * n15 >> 8 & 0x882C4844);
            } while (--n3 > 0);
        }
    }
    
    @Override
    void bi(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        int n19;
        if (n3 != n2) {
            n19 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n19 = 0;
        }
        int n20;
        if (n2 != n) {
            n20 = (n13 << 14) / n14;
        }
        else {
            n20 = 0;
        }
        int n21;
        if (n3 != n) {
            n21 = (n15 << 14) / n16;
        }
        else {
            n21 = 0;
        }
        final int n22 = n13 * n16 - n15 * n14;
        if (n22 == 0) {
            return;
        }
        final int n23 = (n17 * n16 - n18 * n14 << 8) / n22;
        final int n24 = (n18 * n13 - n17 * n15 << 8) / n22;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n25 = this.al.field2232 * -669972161;
        if (n <= n2 && n <= n3) {
            if (n >= n25) {
                return;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            n10 = (n10 << 8) - n23 * n4 + n23;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n19 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n21 >= n20) && (n != n2 || n21 <= n19)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n5 += n19;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n23);
                    n6 += n21;
                    n5 += n19;
                    n10 += n24;
                    n += class235.ae;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n19 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n21 >= n20) && (n != n3 || n19 <= n20)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n23);
                        n5 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n19;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n23);
                    n5 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n19;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n25) {
                return;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            if (n > n25) {
                n = n25;
            }
            n11 = (n11 << 8) - n23 * n5 + n23;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n20 >= n19) && (n2 != n3 || n20 <= n21)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                        n4 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n23);
                        n4 += n20;
                        n6 += n21;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                    n4 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n23);
                    n4 += n20;
                    n6 += n21;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n21 * n;
                    n = 0;
                }
                if (n20 < n19) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n23);
                        n6 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                        n4 += n21;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n23);
                    n6 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                    n4 += n21;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
        }
        else {
            if (n3 >= n25) {
                return;
            }
            if (n > n25) {
                n = n25;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            n12 = (n12 << 8) - n23 * n6 + n23;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n20 * n;
                    n = 0;
                }
                if (n19 < n21) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n23);
                        n5 += n19;
                        n4 += n20;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n4 += n20;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n20 * n2;
                    n2 = 0;
                }
                if (n19 < n21) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n23);
                        n4 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n20;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n23);
                    n4 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n20;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
        }
    }
    
    void bv(final int[] array, int n, int n2, int n3, int n4, int n5) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 571147771) {
                n5 = this.al.field2233 * -28488785;
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
        if (this.al.field2225 * 918495667 == 0) {
            while (--n3 >= 0) {
                array[n++] = n2;
                array[n++] = n2;
                array[n++] = n2;
                array[n++] = n2;
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                array[n++] = n2;
            }
        }
        else if (this.al.field2225 * -2146691711 == 254) {
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
            final int n6 = this.al.field2225 * 750310053;
            final int n7 = 256 - this.al.field2225 * -447916541;
            n2 = ((n2 & 0x7DD82748) * n7 >> 8 & 0x19A10728) + ((n2 & 0xFF00) * n7 >> 8 & 0xFF00);
            while (--n3 >= 0) {
                final int n8 = array[n];
                array[n++] = n2 + ((n8 & 0x5B7EB0BC) * n6 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n6 >> 8 & 0x6656CF30);
                final int n9 = array[n];
                array[n++] = n2 + ((n9 & 0xFF00FF) * n6 >> 8 & 0xC911FEAB) + ((n9 & 0xFF00) * n6 >> 8 & 0x76F07910);
                final int n10 = array[n];
                array[n++] = n2 + ((n10 & 0x55E063AC) * n6 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n6 >> 8 & 0xFF00);
                final int n11 = array[n];
                array[n++] = n2 + ((n11 & 0xFF00FF) * n6 >> 8 & 0x6A02D663) + ((n11 & 0xFF00) * n6 >> 8 & 0xCC3524CB);
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                final int n12 = array[n];
                array[n++] = n2 + ((n12 & 0x2DFC01CC) * n6 >> 8 & 0x7CBC4676) + ((n12 & 0xFB4D8D2F) * n6 >> 8 & 0xD09EB820);
            }
        }
    }
    
    @Override
    void bo(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, 956939118);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, 206894700);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-70));
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
        final int n35 = this.al.field2227 * -796146298;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n36 = n15 * n16 - n18 * n13 << 14;
        final int n37 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n35);
        final int n38 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n35);
        final int n39 = n14 * n16 - n17 * n13 << 14;
        final int n40 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n35);
        final int n41 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n35);
        final int n42 = n17 * n15 - n14 * n18 << 14;
        final int n43 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n35);
        final int n44 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n35);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n45 = this.al.field2232 * -150615273;
        if (n <= n2 && n <= n3) {
            if (n >= n45) {
                return;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n46 = n - this.al.field2229 * 355006748;
                int n47 = n36 + n38 * n46;
                int n48 = n39 + n41 * n46;
                int n49 = n42 + n44 * n46;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n36 + n38 * n50;
                int n52 = n39 + n41 * n50;
                int n53 = n42 + n44 * n50;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n45) {
                return;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            if (n > n45) {
                n = n45;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n54 = n2 - this.al.field2229 * 1235172375;
                int n55 = n36 + n38 * n54;
                int n56 = n39 + n41 * n54;
                int n57 = n42 + n44 * n54;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n36 + n38 * n58;
                int n60 = n39 + n41 * n58;
                int n61 = n42 + n44 * n58;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
            }
        }
        else {
            if (n3 >= n45) {
                return;
            }
            if (n > n45) {
                n = n45;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n62 = n3 - this.al.field2229 * 1666539507;
                int n63 = n36 + n38 * n62;
                int n64 = n39 + n41 * n62;
                int n65 = n42 + n44 * n62;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n36 + n38 * n66;
                int n68 = n39 + n41 * n66;
                int n69 = n42 + n44 * n66;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
            }
        }
    }
    
    void bp(final int[] array, final int[] array2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, final int n11, final int n12, final int n13) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * -610507072) {
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
        final int n14 = n5 - n4;
        if (this.an) {
            final int n15 = n4 - this.al.field2231 * 93675259;
            n8 += n11 * n15;
            n9 += n12 * n15;
            n10 += n13 * n15;
            final int n16 = n10 >> 12;
            int n17;
            int n18;
            if (n16 != 0) {
                n17 = n8 / n16;
                n18 = n9 / n16;
            }
            else {
                n17 = 0;
                n18 = 0;
            }
            n8 += n11 * n14;
            n9 += n12 * n14;
            n10 += n13 * n14;
            final int n19 = n10 >> 12;
            int n20;
            int n21;
            if (n19 != 0) {
                n20 = n8 / n19;
                n21 = n9 / n19;
            }
            else {
                n20 = 0;
                n21 = 0;
            }
            n = (n17 << 20) + n18;
            final int n22 = ((n20 - n17) / n14 << 20) + (n21 - n18) / n14;
            int n23 = n14 >> 3;
            n7 <<= 3;
            int n24 = n6 >> 8;
            if (this.af) {
                if (n23 > 0) {
                    do {
                        n2 = array2[(n & 0xAEB9D080) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xF555AE12) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0x9CCD0D20) + (n >>> 26)];
                        array[n3++] = ((n2 & 0x281AD5E5) * n24 & 0xFF00FF00) + ((n2 & 0xD66826CD) * n24 & 0x1D8B5D5A) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xD402EC37) + ((n2 & 0xFF00) * n24 & 0xC86C2B93) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0x8578EB9E) * n24 & 0x9A595274) + ((n2 & 0xBBFF88B0) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0x4856A163) + ((n2 & 0xAF6178B2) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0x74E539A2) * n24 & 0x94416C1E) + ((n2 & 0xFF00) * n24 & 0x55349D4D) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xF0DC6381) * n24 & 0x6B4F2C1D) + ((n2 & 0x77DC3E75) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0x371BA9D2) * n24 & 0xC33C1C99) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n25 = n5 - n4 & 0x7;
                if (n25 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0x4981AB0F) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                    } while (--n25 > 0);
                }
            }
            else {
                if (n23 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0x16FE5A0) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0x291A172F) * n24 & 0xB86D77C) + ((n2 & 0x3C10455A) * n24 & 0x9F14D0C4) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xE7681091) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xB10D371F) * n24 & 0xB63180CC) + ((n2 & 0x810C029) * n24 & 0x98F8FC31) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xDA21118B) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0x8AB0C83) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0x86A041AB) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xF6AFD114) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0x11FECEBE) * n24 & 0xC9FF0DDC) + ((n2 & 0xFF00) * n24 & 0x3C49DFB2) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xC93A8031) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xBB6C8705) >> 8;
                        }
                        ++n3;
                        n += n22;
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n26 = n5 - n4 & 0x7;
                if (n26 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xBCEB1D17) >> 8;
                        }
                        ++n3;
                        n += n22;
                    } while (--n26 > 0);
                }
            }
        }
        else {
            final int n27 = n4 - this.al.field2231 * 93675259;
            n8 += n11 * n27;
            n9 += n12 * n27;
            n10 += n13 * n27;
            final int n28 = n10 >> 14;
            int n29;
            int n30;
            if (n28 != 0) {
                n29 = n8 / n28;
                n30 = n9 / n28;
            }
            else {
                n29 = 0;
                n30 = 0;
            }
            n8 += n11 * n14;
            n9 += n12 * n14;
            n10 += n13 * n14;
            final int n31 = n10 >> 14;
            int n32;
            int n33;
            if (n31 != 0) {
                n32 = n8 / n31;
                n33 = n9 / n31;
            }
            else {
                n32 = 0;
                n33 = 0;
            }
            n = (n29 << 18) + n30;
            final int n34 = ((n32 - n29) / n14 << 18) + (n33 - n30) / n14;
            int n35 = n14 >> 3;
            n7 <<= 3;
            int n36 = n6 >> 8;
            if (this.af) {
                if (n35 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xEA6E660D) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0xB8C30092) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x3863DDE5) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0x279A7B25) + ((n2 & 0xFF00) * n36 & 0x3A9F71BE) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x90F6D214) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0xB4A5949A) + ((n2 & 0x19520EB) * n36 & 0x2F344A27) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xEA26B1EB) * n36 & 0xFF00FF00) + ((n2 & 0xBEBFE494) * n36 & 0xFF0000) >> 8;
                        n += n34;
                        n2 = array2[(n & 0xE47114AF) + (n >>> 25)];
                        array[n3++] = ((n2 & 0x82C76DB5) * n36 & 0xFF00FF00) + ((n2 & 0x8F8F85A0) * n36 & 0x689AD097) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x80A19E65) + (n >>> 25)];
                        array[n3++] = ((n2 & 0x9011DED) * n36 & 0xFF00FF00) + ((n2 & 0xDA71367F) * n36 & 0xFF0000) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0x4F29A404) >> 8;
                        n += n34;
                        n6 += n7;
                        n36 = n6 >> 8;
                    } while (--n35 > 0);
                }
                int n37 = n5 - n4 & 0x7;
                if (n37 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xC5EA34A8) * n36 & 0x9CE1D314) + ((n2 & 0xF87AD2F5) * n36 & 0x2AFA6F40) >> 8;
                        n += n34;
                    } while (--n37 > 0);
                }
            }
            else {
                if (n35 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xEA34E220) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n36 & 0x7522EFDF) + ((n2 & 0x8B2D87CC) * n36 & 0x9FC7892A) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xD20EBEF4) * n36 & 0xFF00FF00) + ((n2 & 0x30661B66) * n36 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xD68B81F4) * n36 & 0xFF00FF00) + ((n2 & 0x4952AC30) * n36 & 0x377684C6) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xE74D9EB8) * n36 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x8724DFE4) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xB4DD9A47) * n36 & 0xC14F4F60) + ((n2 & 0x400983C4) * n36 & 0xAF635F3C) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n36 & 0x87ED38E9) + ((n2 & 0x5153DAA8) * n36 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n36 & 0xC70EB4B1) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x659B1E0D) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0x6D124585) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n34;
                        n6 += n7;
                        n36 = n6 >> 8;
                    } while (--n35 > 0);
                }
                int n38 = n5 - n4 & 0x7;
                if (n38 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xD0172C08) * n36 & 0x68F3A59D) + ((n2 & 0xFF00) * n36 & 0x91A8B366) >> 8;
                        }
                        ++n3;
                        n += n34;
                    } while (--n38 > 0);
                }
            }
        }
    }
    
    @Override
    void bt(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, 965077563);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, -368749300);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-51));
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
        final int n35 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n36 = n15 * n16 - n18 * n13 << 14;
        final int n37 = (int)(((long)(n18 * n19 - n21 * n16) << 14) / n35);
        final int n38 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n35);
        final int n39 = n14 * n16 - n17 * n13 << 14;
        final int n40 = (int)(((long)(n17 * n19 - n20 * n16) << 14) / n35);
        final int n41 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n35);
        final int n42 = n17 * n15 - n14 * n18 << 14;
        final int n43 = (int)(((long)(n20 * n18 - n17 * n21) << 14) / n35);
        final int n44 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n35);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n45 = this.al.field2232 * -1347859351;
        final int n46 = this.al.field2229 * 1666539507;
        if (n <= n2 && n <= n3) {
            if (n >= n45) {
                return;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n47 = n - n46;
                int n48 = n36 + n38 * n47;
                int n49 = n39 + n41 * n47;
                int n50 = n42 + n44 * n47;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n48 += n38;
                        n49 += n41;
                        n50 += n44;
                    }
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class235.ae;
                        n48 += n38;
                        n49 += n41;
                        n50 += n44;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n48 += n38;
                    n49 += n41;
                    n50 += n44;
                }
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class235.ae;
                    n48 += n38;
                    n49 += n41;
                    n50 += n44;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n51 = n - n46;
                int n52 = n36 + n38 * n51;
                int n53 = n39 + n41 * n51;
                int n54 = n42 + n44 * n51;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n52 += n38;
                        n53 += n41;
                        n54 += n44;
                    }
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n52 += n38;
                        n53 += n41;
                        n54 += n44;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n52 += n38;
                    n53 += n41;
                    n54 += n44;
                }
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n52 += n38;
                    n53 += n41;
                    n54 += n44;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n45) {
                return;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            if (n > n45) {
                n = n45;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n55 = n2 - n46;
                int n56 = n36 + n38 * n55;
                int n57 = n39 + n41 * n55;
                int n58 = n42 + n44 * n55;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n56 += n38;
                        n57 += n41;
                        n58 += n44;
                    }
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class235.ae;
                        n56 += n38;
                        n57 += n41;
                        n58 += n44;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n56 += n38;
                    n57 += n41;
                    n58 += n44;
                }
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class235.ae;
                    n56 += n38;
                    n57 += n41;
                    n58 += n44;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n59 = n2 - n46;
                int n60 = n36 + n38 * n59;
                int n61 = n39 + n41 * n59;
                int n62 = n42 + n44 * n59;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n60 += n38;
                        n61 += n41;
                        n62 += n44;
                    }
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n60 += n38;
                        n61 += n41;
                        n62 += n44;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n60 += n38;
                    n61 += n41;
                    n62 += n44;
                }
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n60 += n38;
                    n61 += n41;
                    n62 += n44;
                }
            }
        }
        else {
            if (n3 >= n45) {
                return;
            }
            if (n > n45) {
                n = n45;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n63 = n3 - n46;
                int n64 = n36 + n38 * n63;
                int n65 = n39 + n41 * n63;
                int n66 = n42 + n44 * n63;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n64 += n38;
                        n65 += n41;
                        n66 += n44;
                    }
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class235.ae;
                        n64 += n38;
                        n65 += n41;
                        n66 += n44;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n64 += n38;
                    n65 += n41;
                    n66 += n44;
                }
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class235.ae;
                    n64 += n38;
                    n65 += n41;
                    n66 += n44;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n67 = n3 - n46;
                int n68 = n36 + n38 * n67;
                int n69 = n39 + n41 * n67;
                int n70 = n42 + n44 * n67;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n68 += n38;
                        n69 += n41;
                        n70 += n44;
                    }
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n68 += n38;
                        n69 += n41;
                        n70 += n44;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n68 += n38;
                    n69 += n41;
                    n70 += n44;
                }
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n68 += n38;
                    n69 += n41;
                    n70 += n44;
                }
            }
        }
    }
    
    void bc(final int[] array, final int[] array2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, final int n11, final int n12, final int n13) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 192653861) {
                n5 = this.al.field2233 * -1525644360;
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
        final int n14 = n5 - n4;
        if (this.an) {
            final int n15 = n4 - this.al.field2231 * 93675259;
            n8 += n11 * n15;
            n9 += n12 * n15;
            n10 += n13 * n15;
            final int n16 = n10 >> 12;
            int n17;
            int n18;
            if (n16 != 0) {
                n17 = n8 / n16;
                n18 = n9 / n16;
            }
            else {
                n17 = 0;
                n18 = 0;
            }
            n8 += n11 * n14;
            n9 += n12 * n14;
            n10 += n13 * n14;
            final int n19 = n10 >> 12;
            int n20;
            int n21;
            if (n19 != 0) {
                n20 = n8 / n19;
                n21 = n9 / n19;
            }
            else {
                n20 = 0;
                n21 = 0;
            }
            n = (n17 << 20) + n18;
            final int n22 = ((n20 - n17) / n14 << 20) + (n21 - n18) / n14;
            int n23 = n14 >> 3;
            n7 <<= 3;
            int n24 = n6 >> 8;
            if (this.af) {
                if (n23 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xAB1558D4) * n24 & 0xEF1ED0A9) + ((n2 & 0x7130D473) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0x8ED2234E) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xCBC09ED8) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0x3D7684B2) * n24 & 0xABD2131E) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xBB05118A) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xB13C46C9) + ((n2 & 0x4BEDA4CC) * n24 & 0xA812EBCC) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0x2E641058) + ((n2 & 0xB892CAC5) * n24 & 0x7AE2C732) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xCC16B03F) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xC8A33C02) + ((n2 & 0x29389ABB) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0x3EB371EC) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n25 = n5 - n4 & 0x7;
                if (n25 > 0) {
                    do {
                        n2 = array2[(n & 0x45C4408D) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0x39AF2F1E) + ((n2 & 0xB50C2E9B) * n24 & 0xFF0000) >> 8;
                        n += n22;
                    } while (--n25 > 0);
                }
            }
            else {
                if (n23 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x5D1A306C) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0x17F9AE5A) + ((n2 & 0xFF00) * n24 & 0xB8AA5BB) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0x4706ED7B) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xA0C0C330) * n24 & 0xFF00FF00) + ((n2 & 0x19DA2BCE) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFE4FB11E) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0x585CAA31) * n24 & 0xF6E1F1F7) + ((n2 & 0xA5F3094D) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0x1E17A8F) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0x958C4BE9) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xE753BB2E) + ((n2 & 0xC3989B41) * n24 & 0x435B7267) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0x837F930A) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFAD03076) * n24 & 0x14170EC9) + ((n2 & 0xBFD1A24) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0x46582999) + ((n2 & 0xAB61FE67) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0x939DCF0D) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0x23980151) * n24 & 0x6F37E3A2) + ((n2 & 0xB552A788) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n26 = n5 - n4 & 0x7;
                if (n26 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x28BA7510) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0x4443D9EA) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                    } while (--n26 > 0);
                }
            }
        }
        else {
            final int n27 = n4 - this.al.field2231 * 93675259;
            n8 += n11 * n27;
            n9 += n12 * n27;
            n10 += n13 * n27;
            final int n28 = n10 >> 14;
            int n29;
            int n30;
            if (n28 != 0) {
                n29 = n8 / n28;
                n30 = n9 / n28;
            }
            else {
                n29 = 0;
                n30 = 0;
            }
            n8 += n11 * n14;
            n9 += n12 * n14;
            n10 += n13 * n14;
            final int n31 = n10 >> 14;
            int n32;
            int n33;
            if (n31 != 0) {
                n32 = n8 / n31;
                n33 = n9 / n31;
            }
            else {
                n32 = 0;
                n33 = 0;
            }
            n = (n29 << 18) + n30;
            final int n34 = ((n32 - n29) / n14 << 18) + (n33 - n30) / n14;
            int n35 = n14 >> 3;
            n7 <<= 3;
            int n36 = n6 >> 8;
            if (this.af) {
                if (n35 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0x44107215) + ((n2 & 0x5A2C800C) * n36 & 0xFF0000) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x7704F308) + (n >>> 25)];
                        array[n3++] = ((n2 & 0x62B25664) * n36 & 0x6B7D25DF) + ((n2 & 0x5D3BB231) * n36 & 0xFF0000) >> 8;
                        n += n34;
                        n2 = array2[(n & 0xFD6DAE55) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0x81C16CF5) + ((n2 & 0x89FF9BA0) * n36 & 0x9C8244F) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x8CE8D48D) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xA7236218) * n36 & 0xE444E2FE) + ((n2 & 0xFF00) * n36 & 0xF45652BF) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0x96253661) + ((n2 & 0xFF00) * n36 & 0xFD2E2298) >> 8;
                        n += n34;
                        n2 = array2[(n & 0xAC0FD35B) + (n >>> 25)];
                        array[n3++] = ((n2 & 0x455634A7) * n36 & 0xBF26F8AA) + ((n2 & 0xEA472B62) * n36 & 0x6895B918) >> 8;
                        n += n34;
                        n2 = array2[(n & 0x8A1E47F5) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xF569D574) * n36 & 0x3DB75A02) + ((n2 & 0x63BF65C8) * n36 & 0xFF0000) >> 8;
                        n += n34;
                        n6 += n7;
                        n36 = n6 >> 8;
                    } while (--n35 > 0);
                }
                int n37 = n5 - n4 & 0x7;
                if (n37 > 0) {
                    do {
                        n2 = array2[(n & 0xD8027A9) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n36 & 0x525A8094) + ((n2 & 0xB501B5E) * n36 & 0x583FFA4F) >> 8;
                        n += n34;
                    } while (--n37 > 0);
                }
            }
            else {
                if (n35 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n36 & 0x5D246241) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0x135559C3) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0x4C24084D) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n36 & 0x96DA8D6) + ((n2 & 0xFF00) * n36 & 0x2B221AA9) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x6151603D) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xB2C87540) * n36 & 0xCC26D56F) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0x171B0C02) * n36 & 0xA977ED17) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xB4E1AE1D) * n36 & 0x693BE580) + ((n2 & 0xFF00) * n36 & 0x9FCC10FD) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0x5F1F4943) * n36 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0xF68169CE) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n36 & 0x55DF8F73) + ((n2 & 0xF3478F9F) * n36 & 0x5BB99A52) >> 8;
                        }
                        ++n3;
                        n += n34;
                        n6 += n7;
                        n36 = n6 >> 8;
                    } while (--n35 > 0);
                }
                int n38 = n5 - n4 & 0x7;
                if (n38 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xBD074210) * n36 & 0xFF00FF00) + ((n2 & 0x1B4313C5) * n36 & 0x6625352E) >> 8;
                        }
                        ++n3;
                        n += n34;
                    } while (--n38 > 0);
                }
            }
        }
    }
    
    void method1356(final int[] array, final int[] array2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, final int n11, final int n12, final int n13) {
        if (this.al.field2234) {
            if (n5 > this.al.clipNegativeMidY * 571147771) {
                n5 = this.al.field2232 * 571147771;
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
        final int n14 = n5 - n4;
        if (this.an) {
            final int n15 = n4 - this.al.field2236 * 93675259;
            n8 += n11 * n15;
            n9 += n12 * n15;
            n10 += n13 * n15;
            final int n16 = n10 >> 12;
            int n17;
            int n18;
            if (n16 != 0) {
                n17 = n8 / n16;
                n18 = n9 / n16;
            }
            else {
                n17 = 0;
                n18 = 0;
            }
            n8 += n11 * n14;
            n9 += n12 * n14;
            n10 += n13 * n14;
            final int n19 = n10 >> 12;
            int n20;
            int n21;
            if (n19 != 0) {
                n20 = n8 / n19;
                n21 = n9 / n19;
            }
            else {
                n20 = 0;
                n21 = 0;
            }
            n = (n17 << 20) + n18;
            final int n22 = ((n20 - n17) / n14 << 20) + (n21 - n18) / n14;
            int n23 = n14 >> 3;
            n7 <<= 3;
            int n24 = n6 >> 8;
            if (this.af) {
                if (n23 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n25 = n5 - n4 & 0x7;
                if (n25 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                    } while (--n25 > 0);
                }
            }
            else {
                if (n23 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n26 = n5 - n4 & 0x7;
                if (n26 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                    } while (--n26 > 0);
                }
            }
        }
        else {
            final int n27 = n4 - this.al.field2232 * 93675259;
            n8 += n11 * n27;
            n9 += n12 * n27;
            n10 += n13 * n27;
            final int n28 = n10 >> 14;
            int n29;
            int n30;
            if (n28 != 0) {
                n29 = n8 / n28;
                n30 = n9 / n28;
            }
            else {
                n29 = 0;
                n30 = 0;
            }
            n8 += n11 * n14;
            n9 += n12 * n14;
            n10 += n13 * n14;
            final int n31 = n10 >> 14;
            int n32;
            int n33;
            if (n31 != 0) {
                n32 = n8 / n31;
                n33 = n9 / n31;
            }
            else {
                n32 = 0;
                n33 = 0;
            }
            n = (n29 << 18) + n30;
            final int n34 = ((n32 - n29) / n14 << 18) + (n33 - n30) / n14;
            int n35 = n14 >> 3;
            n7 <<= 3;
            int n36 = n6 >> 8;
            if (this.af) {
                if (n35 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n6 += n7;
                        n36 = n6 >> 8;
                    } while (--n35 > 0);
                }
                int n37 = n5 - n4 & 0x7;
                if (n37 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                    } while (--n37 > 0);
                }
            }
            else {
                if (n35 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        n6 += n7;
                        n36 = n6 >> 8;
                    } while (--n35 > 0);
                }
                int n38 = n5 - n4 & 0x7;
                if (n38 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                    } while (--n38 > 0);
                }
            }
        }
    }
    
    @Override
    void vmethod1378(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, -1186733304);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, -585148039);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-49));
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
        final int n35 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n36 = n15 * n16 - n18 * n13 << 14;
        final int n37 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n35);
        final int n38 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n35);
        final int n39 = n14 * n16 - n17 * n13 << 14;
        final int n40 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n35);
        final int n41 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n35);
        final int n42 = n17 * n15 - n14 * n18 << 14;
        final int n43 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n35);
        final int n44 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n35);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n45 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n45) {
                return;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n46 = n - this.al.field2229 * 1666539507;
                int n47 = n36 + n38 * n46;
                int n48 = n39 + n41 * n46;
                int n49 = n42 + n44 * n46;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n36 + n38 * n50;
                int n52 = n39 + n41 * n50;
                int n53 = n42 + n44 * n50;
                if ((n != n3 && n31 < n29) || (n == n3 && n30 > n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n45) {
                return;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            if (n > n45) {
                n = n45;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n54 = n2 - this.al.field2229 * 1666539507;
                int n55 = n36 + n38 * n54;
                int n56 = n39 + n41 * n54;
                int n57 = n42 + n44 * n54;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n36 + n38 * n58;
                int n60 = n39 + n41 * n58;
                int n61 = n42 + n44 * n58;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
            }
        }
        else {
            if (n3 >= n45) {
                return;
            }
            if (n > n45) {
                n = n45;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n62 = n3 - this.al.field2229 * 1666539507;
                int n63 = n36 + n38 * n62;
                int n64 = n39 + n41 * n62;
                int n65 = n42 + n44 * n62;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n36 + n38 * n66;
                int n68 = n39 + n41 * n66;
                int n69 = n42 + n44 * n66;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
            }
        }
    }
    
    final void bq(final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
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
        if (this.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (this.al.field2225 * 918495667 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n8 = this.al.field2225 * 918495667;
                final int n9 = 256 - this.al.field2225 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                        final int n10 = array[n];
                        array[n++] = n2 + ((n10 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n11 = array[n];
                        array[n++] = n2 + ((n11 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n11 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n12 = array[n];
                        array[n++] = n2 + ((n12 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n12 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n13 = array[n];
                        array[n++] = n2 + ((n13 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n13 & 0xFF00) * n8 >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                    do {
                        final int n14 = array[n];
                        array[n++] = n2 + ((n14 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n14 & 0xFF00) * n8 >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (this.al.field2225 * 918495667 == 0) {
            do {
                array[n++] = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n15 = this.al.field2225 * 918495667;
            final int n16 = 256 - this.al.field2225 * 918495667;
            do {
                n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
                n2 = ((n2 & 0xFF00FF) * n16 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n16 >> 8 & 0xFF00);
                final int n17 = array[n];
                array[n++] = n2 + ((n17 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + ((n17 & 0xFF00) * n15 >> 8 & 0xFF00);
            } while (--n3 > 0);
        }
    }
    
    @Override
    void by(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        int n19;
        if (n3 != n2) {
            n19 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n19 = 0;
        }
        int n20;
        if (n2 != n) {
            n20 = (n13 << 14) / n14;
        }
        else {
            n20 = 0;
        }
        int n21;
        if (n3 != n) {
            n21 = (n15 << 14) / n16;
        }
        else {
            n21 = 0;
        }
        final int n22 = n13 * n16 - n15 * n14;
        if (n22 == 0) {
            return;
        }
        final int n23 = (n17 * n16 - n18 * n14 << 8) / n22;
        final int n24 = (n18 * n13 - n17 * n15 << 8) / n22;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n25 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n25) {
                return;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            n10 = (n10 << 8) - n23 * n4 + n23;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n19 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n21 >= n20) && (n != n2 || n21 <= n19)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n5 += n19;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n23);
                    n6 += n21;
                    n5 += n19;
                    n10 += n24;
                    n += class235.ae;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n19 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n21 >= n20) && (n != n3 || n19 <= n20)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n23);
                        n5 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n19;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n23);
                    n5 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n19;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n25) {
                return;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            if (n > n25) {
                n = n25;
            }
            n11 = (n11 << 8) - n23 * n5 + n23;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n2 != n3 && n20 < n19) || (n2 == n3 && n20 > n21)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                        n4 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n23);
                        n4 += n20;
                        n6 += n21;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                    n4 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n23);
                    n4 += n20;
                    n6 += n21;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n21 * n;
                    n = 0;
                }
                if (n20 < n19) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n23);
                        n6 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                        n4 += n21;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n23);
                    n6 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                    n4 += n21;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
        }
        else {
            if (n3 >= n25) {
                return;
            }
            if (n > n25) {
                n = n25;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            n12 = (n12 << 8) - n23 * n6 + n23;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n20 * n;
                    n = 0;
                }
                if (n19 < n21) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n23);
                        n5 += n19;
                        n4 += n20;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n4 += n20;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n20 * n2;
                    n2 = 0;
                }
                if (n19 < n21) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n23);
                        n4 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n20;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n23);
                    n4 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n20;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
        }
    }
    
    @Override
    void bx(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, 619046308);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, 1560094582);
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
        final int n35 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n36 = n15 * n16 - n18 * n13 << 14;
        final int n37 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n35);
        final int n38 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n35);
        final int n39 = n14 * n16 - n17 * n13 << 14;
        final int n40 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n35);
        final int n41 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n35);
        final int n42 = n17 * n15 - n14 * n18 << 14;
        final int n43 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n35);
        final int n44 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n35);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n45 = this.al.field2232 * -1364265139;
        if (n <= n2 && n <= n3) {
            if (n >= n45) {
                return;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n46 = n - this.al.field2229 * -61648321;
                int n47 = n36 + n38 * n46;
                int n48 = n39 + n41 * n46;
                int n49 = n42 + n44 * n46;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n36 + n38 * n50;
                int n52 = n39 + n41 * n50;
                int n53 = n42 + n44 * n50;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n45) {
                return;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            if (n > n45) {
                n = n45;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n54 = n2 - this.al.field2229 * 1666539507;
                int n55 = n36 + n38 * n54;
                int n56 = n39 + n41 * n54;
                int n57 = n42 + n44 * n54;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n36 + n38 * n58;
                int n60 = n39 + n41 * n58;
                int n61 = n42 + n44 * n58;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
            }
        }
        else {
            if (n3 >= n45) {
                return;
            }
            if (n > n45) {
                n = n45;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n62 = n3 - this.al.field2229 * 1666539507;
                int n63 = n36 + n38 * n62;
                int n64 = n39 + n41 * n62;
                int n65 = n42 + n44 * n62;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n66 = n3 - this.al.field2229 * 111358205;
                int n67 = n36 + n38 * n66;
                int n68 = n39 + n41 * n66;
                int n69 = n42 + n44 * n66;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
            }
        }
    }
    
    @Override
    void ap(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        int n19;
        if (n3 != n2) {
            n19 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n19 = 0;
        }
        int n20;
        if (n2 != n) {
            n20 = (n13 << 14) / n14;
        }
        else {
            n20 = 0;
        }
        int n21;
        if (n3 != n) {
            n21 = (n15 << 14) / n16;
        }
        else {
            n21 = 0;
        }
        final int n22 = n13 * n16 - n15 * n14;
        if (n22 == 0) {
            return;
        }
        final int n23 = (n17 * n16 - n18 * n14 << 8) / n22;
        final int n24 = (n18 * n13 - n17 * n15 << 8) / n22;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n25 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n25) {
                return;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            n10 = (n10 << 8) - n23 * n4 + n23;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n19 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n21 >= n20) && (n != n2 || n21 <= n19)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n5 += n19;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n23);
                    n6 += n21;
                    n5 += n19;
                    n10 += n24;
                    n += class235.ae;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n19 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n21 >= n20) && (n != n3 || n19 <= n20)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n23);
                        n5 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n19;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n23);
                    n5 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n19;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n25) {
                return;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            if (n > n25) {
                n = n25;
            }
            n11 = (n11 << 8) - n23 * n5 + n23;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n20 >= n19) && (n2 != n3 || n20 <= n21)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                        n4 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n23);
                        n4 += n20;
                        n6 += n21;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                    n4 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n23);
                    n4 += n20;
                    n6 += n21;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n21 * n;
                    n = 0;
                }
                if (n20 < n19) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n23);
                        n6 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                        n4 += n21;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n23);
                    n6 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                    n4 += n21;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
        }
        else {
            if (n3 >= n25) {
                return;
            }
            if (n > n25) {
                n = n25;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            n12 = (n12 << 8) - n23 * n6 + n23;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n20 * n;
                    n = 0;
                }
                if (n19 < n21) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n23);
                        n5 += n19;
                        n4 += n20;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n4 += n20;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n20 * n2;
                    n2 = 0;
                }
                if (n19 < n21) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n23);
                        n4 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n20;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n23);
                    n4 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n20;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
        }
    }
    
    @Override
    void bd(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, 1929109193);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, 759976976);
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
        final int n35 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n36 = n15 * n16 - n18 * n13 << 14;
        final int n37 = (int)(((long)(n18 * n19 - n21 * n16) << 14) / n35);
        final int n38 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n35);
        final int n39 = n14 * n16 - n17 * n13 << 14;
        final int n40 = (int)(((long)(n17 * n19 - n20 * n16) << 14) / n35);
        final int n41 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n35);
        final int n42 = n17 * n15 - n14 * n18 << 14;
        final int n43 = (int)(((long)(n20 * n18 - n17 * n21) << 14) / n35);
        final int n44 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n35);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n45 = this.al.field2232 * -1347859351;
        final int n46 = this.al.field2229 * 1666539507;
        if (n <= n2 && n <= n3) {
            if (n >= n45) {
                return;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n47 = n - n46;
                int n48 = n36 + n38 * n47;
                int n49 = n39 + n41 * n47;
                int n50 = n42 + n44 * n47;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n48 += n38;
                        n49 += n41;
                        n50 += n44;
                    }
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class235.ae;
                        n48 += n38;
                        n49 += n41;
                        n50 += n44;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n48 += n38;
                    n49 += n41;
                    n50 += n44;
                }
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n48, n49, n50, n37, n40, n43);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class235.ae;
                    n48 += n38;
                    n49 += n41;
                    n50 += n44;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n51 = n - n46;
                int n52 = n36 + n38 * n51;
                int n53 = n39 + n41 * n51;
                int n54 = n42 + n44 * n51;
                if ((n != n3 && n31 < n29) || (n == n3 && n30 > n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n52 += n38;
                        n53 += n41;
                        n54 += n44;
                    }
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n52 += n38;
                        n53 += n41;
                        n54 += n44;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n52 += n38;
                    n53 += n41;
                    n54 += n44;
                }
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n52, n53, n54, n37, n40, n43);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n52 += n38;
                    n53 += n41;
                    n54 += n44;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n45) {
                return;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            if (n > n45) {
                n = n45;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n55 = n2 - n46;
                int n56 = n36 + n38 * n55;
                int n57 = n39 + n41 * n55;
                int n58 = n42 + n44 * n55;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n56 += n38;
                        n57 += n41;
                        n58 += n44;
                    }
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class235.ae;
                        n56 += n38;
                        n57 += n41;
                        n58 += n44;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n56 += n38;
                    n57 += n41;
                    n58 += n44;
                }
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n56, n57, n58, n37, n40, n43);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class235.ae;
                    n56 += n38;
                    n57 += n41;
                    n58 += n44;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n59 = n2 - n46;
                int n60 = n36 + n38 * n59;
                int n61 = n39 + n41 * n59;
                int n62 = n42 + n44 * n59;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n60 += n38;
                        n61 += n41;
                        n62 += n44;
                    }
                    while (--n3 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n60 += n38;
                        n61 += n41;
                        n62 += n44;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n60 += n38;
                    n61 += n41;
                    n62 += n44;
                }
                while (--n3 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n60, n61, n62, n37, n40, n43);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n60 += n38;
                    n61 += n41;
                    n62 += n44;
                }
            }
        }
        else {
            if (n3 >= n45) {
                return;
            }
            if (n > n45) {
                n = n45;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n63 = n3 - n46;
                int n64 = n36 + n38 * n63;
                int n65 = n39 + n41 * n63;
                int n66 = n42 + n44 * n63;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n64 += n38;
                        n65 += n41;
                        n66 += n44;
                    }
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class235.ae;
                        n64 += n38;
                        n65 += n41;
                        n66 += n44;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n64 += n38;
                    n65 += n41;
                    n66 += n44;
                }
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n64, n65, n66, n37, n40, n43);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class235.ae;
                    n64 += n38;
                    n65 += n41;
                    n66 += n44;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n67 = n3 - n46;
                int n68 = n36 + n38 * n67;
                int n69 = n39 + n41 * n67;
                int n70 = n42 + n44 * n67;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n68 += n38;
                        n69 += n41;
                        n70 += n44;
                    }
                    while (--n >= 0) {
                        vy(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n68 += n38;
                        n69 += n41;
                        n70 += n44;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n68 += n38;
                    n69 += n41;
                    n70 += n44;
                }
                while (--n >= 0) {
                    vy(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n68, n69, n70, n37, n40, n43);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n68 += n38;
                    n69 += n41;
                    n70 += n44;
                }
            }
        }
    }
    
    final void bg(final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.al.field2234) {
            if (n5 > this.al.field2233 * 86205242) {
                n5 = this.al.field2233 * -688124233;
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
        if (this.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (this.al.field2225 * -1572850985 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> -342136592 & 0x1) - 1) >> 8];
                        n6 += n7;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> -2102478851 & 0x1) - 1) >> 8];
                    do {
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n8 = this.al.field2225 * 918495667;
                final int n9 = 256 - this.al.field2225 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0x26CDE28D) + ((n2 & 0x531A9414) * n9 >> 8 & 0xB0B4DFD6);
                        final int n10 = array[n];
                        array[n++] = n2 + ((n10 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n10 & 0x17E217AF) * n8 >> 8 & 0x83CD529A);
                        final int n11 = array[n];
                        array[n++] = n2 + ((n11 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n11 & 0x8728C4BB) * n8 >> 8 & 0xE0B839CC);
                        final int n12 = array[n];
                        array[n++] = n2 + ((n12 & 0xFF00FF) * n8 >> 8 & 0x91A9603E) + ((n12 & 0xFF00) * n8 >> 8 & 0xD1B9F9EF);
                        final int n13 = array[n];
                        array[n++] = n2 + ((n13 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n13 & 0xFF00) * n8 >> 8 & 0x84183F30);
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 540786338 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0x6B5D3ED9) + ((n2 & 0x658804DA) * n9 >> 8 & 0xFF00);
                    do {
                        final int n14 = array[n];
                        array[n++] = n2 + ((n14 & 0xFF00FF) * n8 >> 8 & 0x6D9B4B22) + ((n14 & 0x67FC619B) * n8 >> 8 & 0xD0529F00);
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (this.al.field2225 * 1185830490 == 0) {
            do {
                array[n++] = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n15 = this.al.field2225 * -39546851;
            final int n16 = 256 - this.al.field2225 * 918495667;
            do {
                n2 = this.aq[(n6 & (n6 >> -38613872 & 0x1) - 1) >> 8];
                n6 += n7;
                n2 = ((n2 & 0xFF00FF) * n16 >> 8 & 0xD4B2F414) + ((n2 & 0x2447DB2C) * n16 >> 8 & 0x5D31429A);
                final int n17 = array[n];
                array[n++] = n2 + ((n17 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + ((n17 & 0x6230C550) * n15 >> 8 & 0xFF00);
            } while (--n3 > 0);
        }
    }
    
    public static void vy(final class235 class235, final int[] array, final int[] array2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, final int n11, final int n12, final int n13) {
        if (class235 == null) {
            class235.method1356(array, array, n, n, n, n, n, n, n, n, n, n, n, n, n);
            return;
        }
        if (class235.al.field2234) {
            if (n5 > class235.al.field2233 * 571147771) {
                n5 = class235.al.field2233 * 571147771;
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
        final int n14 = n5 - n4;
        if (class235.an) {
            final int n15 = n4 - class235.al.field2231 * 93675259;
            n8 += n11 * n15;
            n9 += n12 * n15;
            n10 += n13 * n15;
            final int n16 = n10 >> 12;
            int n17;
            int n18;
            if (n16 != 0) {
                n17 = n8 / n16;
                n18 = n9 / n16;
            }
            else {
                n17 = 0;
                n18 = 0;
            }
            n8 += n11 * n14;
            n9 += n12 * n14;
            n10 += n13 * n14;
            final int n19 = n10 >> 12;
            int n20;
            int n21;
            if (n19 != 0) {
                n20 = n8 / n19;
                n21 = n9 / n19;
            }
            else {
                n20 = 0;
                n21 = 0;
            }
            n = (n17 << 20) + n18;
            final int n22 = ((n20 - n17) / n14 << 20) + (n21 - n18) / n14;
            int n23 = n14 >> 3;
            n7 <<= 3;
            int n24 = n6 >> 8;
            if (class235.af) {
                if (n23 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n25 = n5 - n4 & 0x7;
                if (n25 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                    } while (--n25 > 0);
                }
            }
            else {
                if (n23 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n26 = n5 - n4 & 0x7;
                if (n26 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                    } while (--n26 > 0);
                }
            }
        }
        else {
            final int n27 = n4 - class235.al.field2231 * 93675259;
            n8 += n11 * n27;
            n9 += n12 * n27;
            n10 += n13 * n27;
            final int n28 = n10 >> 14;
            int n29;
            int n30;
            if (n28 != 0) {
                n29 = n8 / n28;
                n30 = n9 / n28;
            }
            else {
                n29 = 0;
                n30 = 0;
            }
            n8 += n11 * n14;
            n9 += n12 * n14;
            n10 += n13 * n14;
            final int n31 = n10 >> 14;
            int n32;
            int n33;
            if (n31 != 0) {
                n32 = n8 / n31;
                n33 = n9 / n31;
            }
            else {
                n32 = 0;
                n33 = 0;
            }
            n = (n29 << 18) + n30;
            final int n34 = ((n32 - n29) / n14 << 18) + (n33 - n30) / n14;
            int n35 = n14 >> 3;
            n7 <<= 3;
            int n36 = n6 >> 8;
            if (class235.af) {
                if (n35 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                        n6 += n7;
                        n36 = n6 >> 8;
                    } while (--n35 > 0);
                }
                int n37 = n5 - n4 & 0x7;
                if (n37 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n34;
                    } while (--n37 > 0);
                }
            }
            else {
                if (n35 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                        n6 += n7;
                        n36 = n6 >> 8;
                    } while (--n35 > 0);
                }
                int n38 = n5 - n4 & 0x7;
                if (n38 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n36 & 0xFF00FF00) + ((n2 & 0xFF00) * n36 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n34;
                    } while (--n38 > 0);
                }
            }
        }
    }
    
    void method1353(final int[] array, int n, int n2, int n3, int n4, int n5) {
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
        if (this.al.field2225 * 918495667 == 0) {
            while (--n3 >= 0) {
                Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
                Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
                Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
                Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
            }
        }
        else if (this.al.field2225 * 918495667 == 254) {
            while (--n3 >= 0) {
                Client.ri(array, n++, array[n], 255 - super.field2005.field2225 * 918495667);
                Client.ri(array, n++, array[n], 255 - super.field2005.field2225 * 918495667);
                Client.ri(array, n++, array[n], 255 - super.field2005.field2225 * 918495667);
                Client.ri(array, n++, array[n], 255 - super.field2005.field2225 * 918495667);
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                Client.ri(array, n++, array[n], 255 - super.field2005.field2225 * 918495667);
            }
        }
        else {
            final int n6 = this.al.field2225 * 918495667;
            final int n7 = 256 - this.al.field2225 * 918495667;
            n2 = ((n2 & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n7 >> 8 & 0xFF00);
            while (--n3 >= 0) {
                final int n8 = array[n];
                Client.ri(array, n++, n2 + ((n8 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n6 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
                final int n9 = array[n];
                Client.ri(array, n++, n2 + ((n9 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n9 & 0xFF00) * n6 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
                final int n10 = array[n];
                Client.ri(array, n++, n2 + ((n10 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n6 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
                final int n11 = array[n];
                Client.ri(array, n++, n2 + ((n11 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n11 & 0xFF00) * n6 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
            }
            n3 = (n5 - n4 & 0x3);
            while (--n3 >= 0) {
                final int n12 = array[n];
                Client.ri(array, n++, n2 + ((n12 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n12 & 0xFF00) * n6 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
            }
        }
    }
    
    @Override
    void vmethod1374(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12) {
        final int n13 = n5 - n4;
        final int n14 = n2 - n;
        final int n15 = n6 - n4;
        final int n16 = n3 - n;
        final int n17 = n11 - n10;
        final int n18 = n12 - n10;
        int n19;
        if (n3 != n2) {
            n19 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n19 = 0;
        }
        int n20;
        if (n2 != n) {
            n20 = (n13 << 14) / n14;
        }
        else {
            n20 = 0;
        }
        int n21;
        if (n3 != n) {
            n21 = (n15 << 14) / n16;
        }
        else {
            n21 = 0;
        }
        final int n22 = n13 * n16 - n15 * n14;
        if (n22 == 0) {
            return;
        }
        final int n23 = (n17 * n16 - n18 * n14 << 8) / n22;
        final int n24 = (n18 * n13 - n17 * n15 << 8) / n22;
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n25 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n25) {
                return;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            n10 = (n10 << 8) - n23 * n4 + n23;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n19 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n21 >= n20) && (n != n2 || n21 <= n19)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n5 >> 14, n6 >> 14, n10, n23);
                        n6 += n21;
                        n5 += n19;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n5 >> 14, n10, n23);
                    n6 += n21;
                    n5 += n19;
                    n10 += n24;
                    n += class235.ae;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n21 * n;
                    n4 -= n20 * n;
                    n10 -= n24 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n19 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n21 >= n20) && (n != n3 || n19 <= n20)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n5 >> 14, n10, n23);
                        n5 += n21;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n, 0, 0, n4 >> 14, n6 >> 14, n10, n23);
                        n6 += n19;
                        n4 += n20;
                        n10 += n24;
                        n += class235.ae;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n5 >> 14, n4 >> 14, n10, n23);
                    n5 += n21;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n, 0, 0, n6 >> 14, n4 >> 14, n10, n23);
                    n6 += n19;
                    n4 += n20;
                    n10 += n24;
                    n += class235.ae;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n25) {
                return;
            }
            if (n3 > n25) {
                n3 = n25;
            }
            if (n > n25) {
                n = n25;
            }
            n11 = (n11 << 8) - n23 * n5 + n23;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n21 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n20 >= n19) && (n2 != n3 || n20 <= n21)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                        n4 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n4 >> 14, n11, n23);
                        n4 += n20;
                        n6 += n21;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                    n4 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n6 >> 14, n11, n23);
                    n4 += n20;
                    n6 += n21;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n20 * n2;
                    n5 -= n19 * n2;
                    n11 -= n24 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n21 * n;
                    n = 0;
                }
                if (n20 < n19) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n6 >> 14, n5 >> 14, n11, n23);
                        n6 += n20;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1355(class235.ad, n2, 0, 0, n4 >> 14, n5 >> 14, n11, n23);
                        n4 += n21;
                        n5 += n19;
                        n11 += n24;
                        n2 += class235.ae;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n6 >> 14, n11, n23);
                    n6 += n20;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1355(class235.ad, n2, 0, 0, n5 >> 14, n4 >> 14, n11, n23);
                    n4 += n21;
                    n5 += n19;
                    n11 += n24;
                    n2 += class235.ae;
                }
            }
        }
        else {
            if (n3 >= n25) {
                return;
            }
            if (n > n25) {
                n = n25;
            }
            if (n2 > n25) {
                n2 = n25;
            }
            n12 = (n12 << 8) - n23 * n6 + n23;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n20 * n;
                    n = 0;
                }
                if (n19 < n21) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n4 >> 14, n12, n23);
                        n5 += n19;
                        n4 += n20;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n5 >> 14, n12, n23);
                    n5 += n19;
                    n4 += n20;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n19 * n3;
                    n6 -= n21 * n3;
                    n12 -= n24 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n20 * n2;
                    n2 = 0;
                }
                if (n19 < n21) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n4 >> 14, n6 >> 14, n12, n23);
                        n4 += n19;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1355(class235.ad, n3, 0, 0, n5 >> 14, n6 >> 14, n12, n23);
                        n5 += n20;
                        n6 += n21;
                        n12 += n24;
                        n3 += class235.ae;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n4 >> 14, n12, n23);
                    n4 += n19;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1355(class235.ad, n3, 0, 0, n6 >> 14, n5 >> 14, n12, n23);
                    n5 += n20;
                    n6 += n21;
                    n12 += n24;
                    n3 += class235.ae;
                }
            }
        }
    }
    
    @Override
    void vmethod1366(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, final int n10) {
        int n11 = 0;
        if (n2 != n) {
            n11 = (n5 - n4 << 14) / (n2 - n);
        }
        int n12 = 0;
        if (n3 != n2) {
            n12 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n13 = 0;
        if (n3 != n) {
            n13 = (n4 - n6 << 14) / (n - n3);
        }
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n14 = this.al.field2232 * 1944150617;
        if (n <= n2 && n <= n3) {
            if (n >= n14) {
                return;
            }
            if (n2 > n14) {
                n2 = n14;
            }
            if (n3 > n14) {
                n3 = n14;
            }
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n13 * n;
                    n4 -= n11 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n12 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n13 >= n11) && (n != n2 || n13 <= n12)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n4 >> 14, n6 >> 14);
                        n6 += n13;
                        n4 += n11;
                        n += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n5 >> 14, n6 >> 14);
                        n6 += n13;
                        n5 += n12;
                        n += class235.ae;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n6 >> 14, n4 >> 14);
                    n6 += n13;
                    n4 += n11;
                    n += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n6 >> 14, n5 >> 14);
                    n6 += n13;
                    n5 += n12;
                    n += class235.ae;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n13 * n;
                    n4 -= n11 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n12 * n3;
                    n3 = 0;
                }
                if ((n != n3 && n13 < n11) || (n == n3 && n12 > n11)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n5 >> 14, n4 >> 14);
                        n5 += n13;
                        n4 += n11;
                        n += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n6 >> 14, n4 >> 14);
                        n6 += n12;
                        n4 += n11;
                        n += class235.ae;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n4 >> 14, n5 >> 14);
                    n5 += n13;
                    n4 += n11;
                    n += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n4 >> 14, n6 >> 14);
                    n6 += n12;
                    n4 += n11;
                    n += class235.ae;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n14) {
                return;
            }
            if (n3 > n14) {
                n3 = n14;
            }
            if (n > n14) {
                n = n14;
            }
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n11 * n2;
                    n5 -= n12 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n13 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n11 >= n12) && (n2 != n3 || n11 <= n13)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n5 >> 14, n4 >> 14);
                        n4 += n11;
                        n5 += n12;
                        n2 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n6 >> 14, n4 >> 14);
                        n4 += n11;
                        n6 += n13;
                        n2 += class235.ae;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n4 >> 14, n5 >> 14);
                    n4 += n11;
                    n5 += n12;
                    n2 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n4 >> 14, n6 >> 14);
                    n4 += n11;
                    n6 += n13;
                    n2 += class235.ae;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n11 * n2;
                    n5 -= n12 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n13 * n;
                    n = 0;
                }
                if (n11 < n12) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n6 >> 14, n5 >> 14);
                        n6 += n11;
                        n5 += n12;
                        n2 += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n4 >> 14, n5 >> 14);
                        n4 += n13;
                        n5 += n12;
                        n2 += class235.ae;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n5 >> 14, n6 >> 14);
                    n6 += n11;
                    n5 += n12;
                    n2 += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n5 >> 14, n4 >> 14);
                    n4 += n13;
                    n5 += n12;
                    n2 += class235.ae;
                }
            }
        }
        else {
            if (n3 >= n14) {
                return;
            }
            if (n > n14) {
                n = n14;
            }
            if (n2 > n14) {
                n2 = n14;
            }
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n12 * n3;
                    n6 -= n13 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n11 * n;
                    n = 0;
                }
                if (n12 < n13) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n5 >> 14, n6 >> 14);
                        n5 += n12;
                        n6 += n13;
                        n3 += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n5 >> 14, n4 >> 14);
                        n5 += n12;
                        n4 += n11;
                        n3 += class235.ae;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n6 >> 14, n5 >> 14);
                    n5 += n12;
                    n6 += n13;
                    n3 += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n4 >> 14, n5 >> 14);
                    n5 += n12;
                    n4 += n11;
                    n3 += class235.ae;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n12 * n3;
                    n6 -= n13 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n11 * n2;
                    n2 = 0;
                }
                if (n12 < n13) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n4 >> 14, n6 >> 14);
                        n4 += n12;
                        n6 += n13;
                        n3 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n5 >> 14, n6 >> 14);
                        n5 += n11;
                        n6 += n13;
                        n3 += class235.ae;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n6 >> 14, n4 >> 14);
                    n4 += n12;
                    n6 += n13;
                    n3 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n6 >> 14, n5 >> 14);
                    n5 += n11;
                    n6 += n13;
                    n3 += class235.ae;
                }
            }
        }
    }
    
    void bl(final int[] array, final int[] array2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, final int n11, final int n12, final int n13) {
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
        final int n14 = n5 - n4;
        if (this.an) {
            final int n15 = n4 - this.al.field2231 * 93675259;
            n8 += (n11 >> 3) * n15;
            n9 += (n12 >> 3) * n15;
            n10 += (n13 >> 3) * n15;
            final int n16 = n10 >> 12;
            int n17;
            int n18;
            if (n16 != 0) {
                n17 = n8 / n16;
                n18 = n9 / n16;
                if (n17 < 0) {
                    n17 = 0;
                }
                else if (n17 > 4032) {
                    n17 = 4032;
                }
            }
            else {
                n17 = 0;
                n18 = 0;
            }
            n8 += n11;
            n9 += n12;
            n10 += n13;
            final int n19 = n10 >> 12;
            int n20;
            int n21;
            if (n19 != 0) {
                n20 = n8 / n19;
                n21 = n9 / n19;
                if (n20 < 0) {
                    n20 = 0;
                }
                else if (n20 > 4032) {
                    n20 = 4032;
                }
            }
            else {
                n20 = 0;
                n21 = 0;
            }
            n = (n17 << 20) + n18;
            int n22 = (n20 - n17 >> 3 << 20) + (n21 - n18 >> 3);
            int n23 = n14 >> 3;
            n7 <<= 3;
            int n24 = n6 >> 8;
            if (this.af) {
                if (n23 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                        final int n25 = n20;
                        final int n26 = n21;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n27 = n10 >> 12;
                        if (n27 != 0) {
                            n20 = n8 / n27;
                            n21 = n9 / n27;
                            if (n20 < 0) {
                                n20 = 0;
                            }
                            else if (n20 > 4032) {
                                n20 = 4032;
                            }
                        }
                        else {
                            n20 = 0;
                            n21 = 0;
                        }
                        n = (n25 << 20) + n26;
                        n22 = (n20 - n25 >> 3 << 20) + (n21 - n26 >> 3);
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n28 = n5 - n4 & 0x7;
                if (n28 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        n += n22;
                    } while (--n28 > 0);
                }
            }
            else {
                if (n23 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                        final int n29 = n20;
                        final int n30 = n21;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n31 = n10 >> 12;
                        if (n31 != 0) {
                            n20 = n8 / n31;
                            n21 = n9 / n31;
                            if (n20 < 0) {
                                n20 = 0;
                            }
                            else if (n20 > 4032) {
                                n20 = 4032;
                            }
                        }
                        else {
                            n20 = 0;
                            n21 = 0;
                        }
                        n = (n29 << 20) + n30;
                        n22 = (n20 - n29 >> 3 << 20) + (n21 - n30 >> 3);
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n32 = n5 - n4 & 0x7;
                if (n32 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n22;
                    } while (--n32 > 0);
                }
            }
        }
        else {
            final int n33 = n4 - this.al.field2231 * 93675259;
            n8 += (n11 >> 3) * n33;
            n9 += (n12 >> 3) * n33;
            n10 += (n13 >> 3) * n33;
            final int n34 = n10 >> 14;
            int n35;
            int n36;
            if (n34 != 0) {
                n35 = n8 / n34;
                n36 = n9 / n34;
                if (n35 < 0) {
                    n35 = 0;
                }
                else if (n35 > 16256) {
                    n35 = 16256;
                }
            }
            else {
                n35 = 0;
                n36 = 0;
            }
            n8 += n11;
            n9 += n12;
            n10 += n13;
            final int n37 = n10 >> 14;
            int n38;
            int n39;
            if (n37 != 0) {
                n38 = n8 / n37;
                n39 = n9 / n37;
                if (n38 < 0) {
                    n38 = 0;
                }
                else if (n38 > 16256) {
                    n38 = 16256;
                }
            }
            else {
                n38 = 0;
                n39 = 0;
            }
            n = (n35 << 18) + n36;
            int n40 = (n38 - n35 >> 3 << 18) + (n39 - n36 >> 3);
            int n41 = n14 >> 3;
            n7 <<= 3;
            int n42 = n6 >> 8;
            if (this.af) {
                if (n41 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                        final int n43 = n38;
                        final int n44 = n39;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n45 = n10 >> 14;
                        if (n45 != 0) {
                            n38 = n8 / n45;
                            n39 = n9 / n45;
                            if (n38 < 0) {
                                n38 = 0;
                            }
                            else if (n38 > 16256) {
                                n38 = 16256;
                            }
                        }
                        else {
                            n38 = 0;
                            n39 = 0;
                        }
                        n = (n43 << 18) + n44;
                        n40 = (n38 - n43 >> 3 << 18) + (n39 - n44 >> 3);
                        n6 += n7;
                        n42 = n6 >> 8;
                    } while (--n41 > 0);
                }
                int n46 = n5 - n4 & 0x7;
                if (n46 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        n += n40;
                    } while (--n46 > 0);
                }
            }
            else {
                if (n41 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                        final int n47 = n38;
                        final int n48 = n39;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n49 = n10 >> 14;
                        if (n49 != 0) {
                            n38 = n8 / n49;
                            n39 = n9 / n49;
                            if (n38 < 0) {
                                n38 = 0;
                            }
                            else if (n38 > 16256) {
                                n38 = 16256;
                            }
                        }
                        else {
                            n38 = 0;
                            n39 = 0;
                        }
                        n = (n47 << 18) + n48;
                        n40 = (n38 - n47 >> 3 << 18) + (n39 - n48 >> 3);
                        n6 += n7;
                        n42 = n6 >> 8;
                    } while (--n41 > 0);
                }
                int n50 = n5 - n4 & 0x7;
                if (n50 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = ((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8;
                        }
                        ++n3;
                        n += n40;
                    } while (--n50 > 0);
                }
            }
        }
    }
    
    @Override
    void bz(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, -633915150);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, -1717731009);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-126));
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
        final int n35 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n36 = n15 * n16 - n18 * n13 << 14;
        final int n37 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n35);
        final int n38 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n35);
        final int n39 = n14 * n16 - n17 * n13 << 14;
        final int n40 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n35);
        final int n41 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n35);
        final int n42 = n17 * n15 - n14 * n18 << 14;
        final int n43 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n35);
        final int n44 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n35);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n45 = this.al.field2232 * -84838240;
        if (n <= n2 && n <= n3) {
            if (n >= n45) {
                return;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n46 = n - this.al.field2229 * 1666539507;
                int n47 = n36 + n38 * n46;
                int n48 = n39 + n41 * n46;
                int n49 = n42 + n44 * n46;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n50 = n - this.al.field2229 * 1666539507;
                int n51 = n36 + n38 * n50;
                int n52 = n39 + n41 * n50;
                int n53 = n42 + n44 * n50;
                if ((n == n3 || n31 >= n29) && (n != n3 || n30 <= n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n45) {
                return;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            if (n > n45) {
                n = n45;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n54 = n2 - this.al.field2229 * 817110518;
                int n55 = n36 + n38 * n54;
                int n56 = n39 + n41 * n54;
                int n57 = n42 + n44 * n54;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n58 = n2 - this.al.field2229 * 1666539507;
                int n59 = n36 + n38 * n58;
                int n60 = n39 + n41 * n58;
                int n61 = n42 + n44 * n58;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
            }
        }
        else {
            if (n3 >= n45) {
                return;
            }
            if (n > n45) {
                n = n45;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n62 = n3 - this.al.field2229 * 1666539507;
                int n63 = n36 + n38 * n62;
                int n64 = n39 + n41 * n62;
                int n65 = n42 + n44 * n62;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n66 = n3 - this.al.field2229 * 1666539507;
                int n67 = n36 + n38 * n66;
                int n68 = n39 + n41 * n66;
                int n69 = n42 + n44 * n66;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
            }
        }
    }
    
    final void method1355(final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
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
        if (this.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (this.al.field2225 * 918495667 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
                        Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
                        Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
                        Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        Client.ri(array, n++, n2, 255 - super.field2005.field2225 * 918495667);
                    } while (--n3 > 0);
                }
            }
            else {
                final int n8 = this.al.field2225 * 918495667;
                final int n9 = 256 - this.al.field2225 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                        final int n10 = array[n];
                        Client.ri(array, n++, n2 + ((n10 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n8 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
                        final int n11 = array[n];
                        Client.ri(array, n++, n2 + ((n11 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n11 & 0xFF00) * n8 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
                        final int n12 = array[n];
                        Client.ri(array, n++, n2 + ((n12 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n12 & 0xFF00) * n8 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
                        final int n13 = array[n];
                        Client.ri(array, n++, n2 + ((n13 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n13 & 0xFF00) * n8 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                    do {
                        final int n14 = array[n];
                        Client.ri(array, n++, n2 + ((n14 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n14 & 0xFF00) * n8 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (this.al.field2225 * 918495667 == 0) {
            do {
                Client.ri(array, n++, this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8], 255 - super.field2005.field2225 * 918495667);
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n15 = this.al.field2225 * 918495667;
            final int n16 = 256 - this.al.field2225 * 918495667;
            do {
                n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
                n2 = ((n2 & 0xFF00FF) * n16 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n16 >> 8 & 0xFF00);
                final int n17 = array[n];
                Client.ri(array, n++, n2 + ((n17 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + ((n17 & 0xFF00) * n15 >> 8 & 0xFF00), 255 - super.field2005.field2225 * 918495667);
            } while (--n3 > 0);
        }
    }
    
    @Override
    void bm(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19, int n20, int n21, final int n22) {
        final int[] texturePixels = this.al.Rasterizer3D_textureLoader.getTexturePixels(n22, -1408519430);
        if (texturePixels == null) {
            final int averageTextureRGB = this.al.Rasterizer3D_textureLoader.getAverageTextureRGB(n22, -534074802);
            this.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, FloorDecoration.method1209(averageTextureRGB, n10, 769773533), FloorDecoration.method1209(averageTextureRGB, n11, 769773533), FloorDecoration.method1209(averageTextureRGB, n12, 769773533));
            return;
        }
        this.an = this.al.Rasterizer3D_textureLoader.isLowDetail(n22, -407888071);
        this.af = this.al.Rasterizer3D_textureLoader.vmethod3989(n22, (byte)(-15));
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
        final int n35 = this.al.field2227 * -1734758735;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n20 = n19 - n20;
        n15 -= n13;
        n18 -= n16;
        n21 -= n19;
        final int n36 = n15 * n16 - n18 * n13 << 14;
        final int n37 = (int)(((long)(n18 * n19 - n21 * n16) << 3 << 14) / n35);
        final int n38 = (int)(((long)(n21 * n13 - n15 * n19) << 14) / n35);
        final int n39 = n14 * n16 - n17 * n13 << 14;
        final int n40 = (int)(((long)(n17 * n19 - n20 * n16) << 3 << 14) / n35);
        final int n41 = (int)(((long)(n20 * n13 - n14 * n19) << 14) / n35);
        final int n42 = n17 * n15 - n14 * n18 << 14;
        final int n43 = (int)(((long)(n20 * n18 - n17 * n21) << 3 << 14) / n35);
        final int n44 = (int)(((long)(n14 * n21 - n20 * n15) << 14) / n35);
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n45 = this.al.field2232 * -1463510850;
        if (n <= n2 && n <= n3) {
            if (n >= n45) {
                return;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            n10 = (n10 << 9) - n33 * n4 + n33;
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n30 * n2;
                    n2 = 0;
                }
                final int n46 = n - this.al.field2229 * -691637532;
                int n47 = n36 + n38 * n46;
                int n48 = n39 + n41 * n46;
                int n49 = n42 + n44 * n46;
                if ((n == n2 || n31 >= n29) && (n != n2 || n31 <= n30)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n6 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                        n6 += n31;
                        n5 += n30;
                        n10 += n34;
                        n += class235.ae;
                        n47 += n38;
                        n48 += n41;
                        n49 += n44;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n5 >> 14, n10, n33, n47, n48, n49, n37, n40, n43);
                    n6 += n31;
                    n5 += n30;
                    n10 += n34;
                    n += class235.ae;
                    n47 += n38;
                    n48 += n41;
                    n49 += n44;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n31 * n;
                    n4 -= n29 * n;
                    n10 -= n34 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n30 * n3;
                    n3 = 0;
                }
                final int n50 = n - this.al.field2229 * 309220092;
                int n51 = n36 + n38 * n50;
                int n52 = n39 + n41 * n50;
                int n53 = n42 + n44 * n50;
                if ((n != n3 && n31 < n29) || (n == n3 && n30 > n29)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n5 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n5 += n31;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n6 >> 14, n4 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                        n6 += n30;
                        n4 += n29;
                        n10 += n34;
                        n += class235.ae;
                        n51 += n38;
                        n52 += n41;
                        n53 += n44;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n5 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n5 += n31;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n, n4 >> 14, n6 >> 14, n10, n33, n51, n52, n53, n37, n40, n43);
                    n6 += n30;
                    n4 += n29;
                    n10 += n34;
                    n += class235.ae;
                    n51 += n38;
                    n52 += n41;
                    n53 += n44;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n45) {
                return;
            }
            if (n3 > n45) {
                n3 = n45;
            }
            if (n > n45) {
                n = n45;
            }
            n11 = (n11 << 9) - n33 * n5 + n33;
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n31 * n3;
                    n3 = 0;
                }
                final int n54 = n2 - this.al.field2229 * 1666539507;
                int n55 = n36 + n38 * n54;
                int n56 = n39 + n41 * n54;
                int n57 = n42 + n44 * n54;
                if ((n2 == n3 || n29 >= n30) && (n2 != n3 || n29 <= n31)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n4 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                        n4 += n29;
                        n6 += n31;
                        n11 += n34;
                        n2 += class235.ae;
                        n55 += n38;
                        n56 += n41;
                        n57 += n44;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n6 >> 14, n11, n33, n55, n56, n57, n37, n40, n43);
                    n4 += n29;
                    n6 += n31;
                    n11 += n34;
                    n2 += class235.ae;
                    n55 += n38;
                    n56 += n41;
                    n57 += n44;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n29 * n2;
                    n5 -= n30 * n2;
                    n11 -= n34 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n31 * n;
                    n = 0;
                }
                final int n58 = n2 - this.al.field2229 * 2010572938;
                int n59 = n36 + n38 * n58;
                int n60 = n39 + n41 * n58;
                int n61 = n42 + n44 * n58;
                if (n29 < n30) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n6 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n6 += n29;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    while (--n3 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n4 >> 14, n5 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                        n4 += n31;
                        n5 += n30;
                        n11 += n34;
                        n2 += class235.ae;
                        n59 += n38;
                        n60 += n41;
                        n61 += n44;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n6 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n6 += n29;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
                while (--n3 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n2, n5 >> 14, n4 >> 14, n11, n33, n59, n60, n61, n37, n40, n43);
                    n4 += n31;
                    n5 += n30;
                    n11 += n34;
                    n2 += class235.ae;
                    n59 += n38;
                    n60 += n41;
                    n61 += n44;
                }
            }
        }
        else {
            if (n3 >= n45) {
                return;
            }
            if (n > n45) {
                n = n45;
            }
            if (n2 > n45) {
                n2 = n45;
            }
            n12 = (n12 << 9) - n33 * n6 + n33;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n29 * n;
                    n = 0;
                }
                final int n62 = n3 - this.al.field2229 * -1785815594;
                int n63 = n36 + n38 * n62;
                int n64 = n39 + n41 * n62;
                int n65 = n42 + n44 * n62;
                if (n30 < n31) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n4 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                        n5 += n30;
                        n4 += n29;
                        n12 += n34;
                        n3 += class235.ae;
                        n63 += n38;
                        n64 += n41;
                        n65 += n44;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n5 >> 14, n12, n33, n63, n64, n65, n37, n40, n43);
                    n5 += n30;
                    n4 += n29;
                    n12 += n34;
                    n3 += class235.ae;
                    n63 += n38;
                    n64 += n41;
                    n65 += n44;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n30 * n3;
                    n6 -= n31 * n3;
                    n12 -= n34 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n29 * n2;
                    n2 = 0;
                }
                final int n66 = n3 - this.al.field2229 * 557014065;
                int n67 = n36 + n38 * n66;
                int n68 = n39 + n41 * n66;
                int n69 = n42 + n44 * n66;
                if (n30 < n31) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n4 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n4 += n30;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    while (--n >= 0) {
                        MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n5 >> 14, n6 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                        n5 += n29;
                        n6 += n31;
                        n12 += n34;
                        n3 += class235.ae;
                        n67 += n38;
                        n68 += n41;
                        n69 += n44;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n4 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n4 += n30;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
                while (--n >= 0) {
                    MidiPcmStream.xt(this, class235.ad, texturePixels, 0, 0, n3, n6 >> 14, n5 >> 14, n12, n33, n67, n68, n69, n37, n40, n43);
                    n5 += n29;
                    n6 += n31;
                    n12 += n34;
                    n3 += class235.ae;
                    n67 += n38;
                    n68 += n41;
                    n69 += n44;
                }
            }
        }
    }
    
    @Override
    void bk(int n, int n2, int n3, int n4, int n5, int n6, final float n7, final float n8, final float n9, final int n10) {
        int n11 = 0;
        if (n2 != n) {
            n11 = (n5 - n4 << 14) / (n2 - n);
        }
        int n12 = 0;
        if (n3 != n2) {
            n12 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n13 = 0;
        if (n3 != n) {
            n13 = (n4 - n6 << 14) / (n - n3);
        }
        final int[] rasterizer3D_rowOffsets = this.al.Rasterizer3D_rowOffsets;
        final int n14 = this.al.field2232 * -1347859351;
        if (n <= n2 && n <= n3) {
            if (n >= n14) {
                return;
            }
            if (n2 > n14) {
                n2 = n14;
            }
            if (n3 > n14) {
                n3 = n14;
            }
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n13 * n;
                    n4 -= n11 * n;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n12 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n13 >= n11) && (n != n2 || n13 <= n12)) {
                    n3 -= n2;
                    n2 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n4 >> 14, n6 >> 14);
                        n6 += n13;
                        n4 += n11;
                        n += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n5 >> 14, n6 >> 14);
                        n6 += n13;
                        n5 += n12;
                        n += class235.ae;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n6 >> 14, n4 >> 14);
                    n6 += n13;
                    n4 += n11;
                    n += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n6 >> 14, n5 >> 14);
                    n6 += n13;
                    n5 += n12;
                    n += class235.ae;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n13 * n;
                    n4 -= n11 * n;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n12 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n13 >= n11) && (n != n3 || n12 <= n11)) {
                    n2 -= n3;
                    n3 -= n;
                    n = rasterizer3D_rowOffsets[n];
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n4 >> 14, n5 >> 14);
                        n5 += n13;
                        n4 += n11;
                        n += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n, n10, 0, n4 >> 14, n6 >> 14);
                        n6 += n12;
                        n4 += n11;
                        n += class235.ae;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = rasterizer3D_rowOffsets[n];
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n5 >> 14, n4 >> 14);
                    n5 += n13;
                    n4 += n11;
                    n += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n, n10, 0, n6 >> 14, n4 >> 14);
                    n6 += n12;
                    n4 += n11;
                    n += class235.ae;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= n14) {
                return;
            }
            if (n3 > n14) {
                n3 = n14;
            }
            if (n > n14) {
                n = n14;
            }
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n11 * n2;
                    n5 -= n12 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n13 * n3;
                    n3 = 0;
                }
                if ((n2 == n3 || n11 >= n12) && (n2 != n3 || n11 <= n13)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n5 >> 14, n4 >> 14);
                        n4 += n11;
                        n5 += n12;
                        n2 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n6 >> 14, n4 >> 14);
                        n4 += n11;
                        n6 += n13;
                        n2 += class235.ae;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n4 >> 14, n5 >> 14);
                    n4 += n11;
                    n5 += n12;
                    n2 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n4 >> 14, n6 >> 14);
                    n4 += n11;
                    n6 += n13;
                    n2 += class235.ae;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n11 * n2;
                    n5 -= n12 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n13 * n;
                    n = 0;
                }
                if (n11 < n12) {
                    n3 -= n;
                    n -= n2;
                    n2 = rasterizer3D_rowOffsets[n2];
                    while (--n >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n6 >> 14, n5 >> 14);
                        n6 += n11;
                        n5 += n12;
                        n2 += class235.ae;
                    }
                    while (--n3 >= 0) {
                        this.method1353(class235.ad, n2, n10, 0, n4 >> 14, n5 >> 14);
                        n4 += n13;
                        n5 += n12;
                        n2 += class235.ae;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = rasterizer3D_rowOffsets[n2];
                while (--n >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n5 >> 14, n6 >> 14);
                    n6 += n11;
                    n5 += n12;
                    n2 += class235.ae;
                }
                while (--n3 >= 0) {
                    this.method1353(class235.ad, n2, n10, 0, n5 >> 14, n4 >> 14);
                    n4 += n13;
                    n5 += n12;
                    n2 += class235.ae;
                }
            }
        }
        else {
            if (n3 >= n14) {
                return;
            }
            if (n > n14) {
                n = n14;
            }
            if (n2 > n14) {
                n2 = n14;
            }
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n12 * n3;
                    n6 -= n13 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n11 * n;
                    n = 0;
                }
                if (n12 < n13) {
                    n2 -= n;
                    n -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n5 >> 14, n6 >> 14);
                        n5 += n12;
                        n6 += n13;
                        n3 += class235.ae;
                    }
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n5 >> 14, n4 >> 14);
                        n5 += n12;
                        n4 += n11;
                        n3 += class235.ae;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n6 >> 14, n5 >> 14);
                    n5 += n12;
                    n6 += n13;
                    n3 += class235.ae;
                }
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n4 >> 14, n5 >> 14);
                    n5 += n12;
                    n4 += n11;
                    n3 += class235.ae;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n12 * n3;
                    n6 -= n13 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n11 * n2;
                    n2 = 0;
                }
                if (n12 < n13) {
                    n -= n2;
                    n2 -= n3;
                    n3 = rasterizer3D_rowOffsets[n3];
                    while (--n2 >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n4 >> 14, n6 >> 14);
                        n4 += n12;
                        n6 += n13;
                        n3 += class235.ae;
                    }
                    while (--n >= 0) {
                        this.method1353(class235.ad, n3, n10, 0, n5 >> 14, n6 >> 14);
                        n5 += n11;
                        n6 += n13;
                        n3 += class235.ae;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = rasterizer3D_rowOffsets[n3];
                while (--n2 >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n6 >> 14, n4 >> 14);
                    n4 += n12;
                    n6 += n13;
                    n3 += class235.ae;
                }
                while (--n >= 0) {
                    this.method1353(class235.ad, n3, n10, 0, n6 >> 14, n5 >> 14);
                    n5 += n11;
                    n6 += n13;
                    n3 += class235.ae;
                }
            }
        }
    }
    
    final void bf(final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
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
        if (this.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (this.al.field2225 * 918495667 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n8 = this.al.field2225 * 918495667;
                final int n9 = 256 - this.al.field2225 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                        final int n10 = array[n];
                        array[n++] = n2 + ((n10 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n11 = array[n];
                        array[n++] = n2 + ((n11 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n11 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n12 = array[n];
                        array[n++] = n2 + ((n12 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n12 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n13 = array[n];
                        array[n++] = n2 + ((n13 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n13 & 0xFF00) * n8 >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                    do {
                        final int n14 = array[n];
                        array[n++] = n2 + ((n14 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n14 & 0xFF00) * n8 >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (this.al.field2225 * 918495667 == 0) {
            do {
                array[n++] = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n15 = this.al.field2225 * 918495667;
            final int n16 = 256 - this.al.field2225 * 918495667;
            do {
                n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
                n2 = ((n2 & 0xFF00FF) * n16 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n16 >> 8 & 0xFF00);
                final int n17 = array[n];
                array[n++] = n2 + ((n17 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + ((n17 & 0xFF00) * n15 >> 8 & 0xFF00);
            } while (--n3 > 0);
        }
    }
    
    final void bu(final int[] array, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.al.field2234) {
            if (n5 > this.al.field2236 * 571147771) {
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
        if (this.al.field2226) {
            n3 = n5 - n4 >> 2;
            n7 <<= 2;
            if (this.al.field2231 * 918495667 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    do {
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
            }
            else {
                final int n8 = this.al.field2238 * 918495667;
                final int n9 = 256 - this.al.field2236 * 918495667;
                if (n3 > 0) {
                    do {
                        n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                        n6 += n7;
                        n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                        final int n10 = array[n];
                        array[n++] = n2 + ((n10 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n10 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n11 = array[n];
                        array[n++] = n2 + ((n11 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n11 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n12 = array[n];
                        array[n++] = n2 + ((n12 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n12 & 0xFF00) * n8 >> 8 & 0xFF00);
                        final int n13 = array[n];
                        array[n++] = n2 + ((n13 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n13 & 0xFF00) * n8 >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
                n3 = (n5 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                    n2 = ((n2 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n9 >> 8 & 0xFF00);
                    do {
                        final int n14 = array[n];
                        array[n++] = n2 + ((n14 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n14 & 0xFF00) * n8 >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = n5 - n4;
        if (this.al.field2229 * 918495667 == 0) {
            do {
                array[n++] = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
            } while (--n3 > 0);
        }
        else {
            final int n15 = this.al.clipNegativeMidY * 918495667;
            final int n16 = 256 - this.al.field2231 * 918495667;
            do {
                n2 = this.aq[(n6 & (n6 >> 31 & 0x1) - 1) >> 8];
                n6 += n7;
                n2 = ((n2 & 0xFF00FF) * n16 >> 8 & 0xFF00FF) + ((n2 & 0xFF00) * n16 >> 8 & 0xFF00);
                final int n17 = array[n];
                array[n++] = n2 + ((n17 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + ((n17 & 0xFF00) * n15 >> 8 & 0xFF00);
            } while (--n3 > 0);
        }
    }
}
