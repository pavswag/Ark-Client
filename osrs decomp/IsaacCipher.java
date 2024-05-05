// 
// Decompiled by Procyon v0.5.36
// 

public final class IsaacCipher
{
    int[] mm;
    static final int af = 8;
    int valuesRemaining;
    int cc;
    int aa;
    int[] results;
    int bb;
    static final int aw = 1020;
    
    public IsaacCipher(final int[] array) {
        this.mm = new int[256];
        this.results = new int[256];
        for (int i = 0; i < array.length; ++i) {
            this.results[i] = array[i];
        }
        pd(this, 1991747511);
    }
    
    public static void pd(final IsaacCipher isaacCipher, final int n) {
        if (isaacCipher == null) {
            isaacCipher.method2635(n);
        }
        try {
            int n2 = -1640531527;
            int n3 = -1640531527;
            int n4 = -1640531527;
            int n5 = -1640531527;
            int n6 = -1640531527;
            int n7 = -1640531527;
            int n8 = -1640531527;
            int n9 = -1640531527;
            for (int i = 0; i < 4; ++i) {
                if (n == 1996530723) {
                    throw new IllegalStateException();
                }
                final int n10 = n9 ^ n8 << 11;
                final int n11 = n6 + n10;
                final int n12 = n8 + n7 ^ n7 >>> 2;
                final int n13 = n5 + n12;
                final int n14 = n7 + n11 ^ n11 << 8;
                final int n15 = n4 + n14;
                n6 = (n11 + n13 ^ n13 >>> 16);
                final int n16 = n3 + n6;
                n5 = (n13 + n15 ^ n15 << 10);
                final int n17 = n2 + n5;
                n4 = (n15 + n16 ^ n16 >>> 4);
                final int n18 = n10 + n4;
                n3 = (n16 + n17 ^ n17 << 8);
                n8 = n12 + n3;
                n2 = (n17 + n18 ^ n18 >>> 9);
                n7 = n14 + n2;
                n9 = n18 + n8;
            }
            for (int j = 0; j < 256; j += 8) {
                if (n == 1996530723) {
                    throw new IllegalStateException();
                }
                final int n19 = n9 + isaacCipher.results[j];
                final int n20 = n8 + isaacCipher.results[j + 1];
                final int n21 = n7 + isaacCipher.results[j + 2];
                final int n22 = n6 + isaacCipher.results[j + 3];
                final int n23 = n5 + isaacCipher.results[4 + j];
                final int n24 = n4 + isaacCipher.results[j + 5];
                final int n25 = n3 + isaacCipher.results[6 + j];
                final int n26 = n2 + isaacCipher.results[7 + j];
                final int n27 = n19 ^ n20 << 11;
                final int n28 = n22 + n27;
                final int n29 = n20 + n21 ^ n21 >>> 2;
                final int n30 = n23 + n29;
                final int n31 = n21 + n28 ^ n28 << 8;
                final int n32 = n24 + n31;
                n6 = (n28 + n30 ^ n30 >>> 16);
                final int n33 = n25 + n6;
                n5 = (n30 + n32 ^ n32 << 10);
                final int n34 = n26 + n5;
                n4 = (n32 + n33 ^ n33 >>> 4);
                final int n35 = n27 + n4;
                n3 = (n33 + n34 ^ n34 << 8);
                n8 = n29 + n3;
                n2 = (n34 + n35 ^ n35 >>> 9);
                n7 = n31 + n2;
                n9 = n35 + n8;
                isaacCipher.mm[j] = n9;
                isaacCipher.mm[1 + j] = n8;
                isaacCipher.mm[j + 2] = n7;
                isaacCipher.mm[j + 3] = n6;
                isaacCipher.mm[j + 4] = n5;
                isaacCipher.mm[j + 5] = n4;
                isaacCipher.mm[6 + j] = n3;
                isaacCipher.mm[j + 7] = n2;
            }
            for (int k = 0; k < 256; k += 8) {
                final int n36 = n9 + isaacCipher.mm[k];
                final int n37 = n8 + isaacCipher.mm[k + 1];
                final int n38 = n7 + isaacCipher.mm[k + 2];
                final int n39 = n6 + isaacCipher.mm[3 + k];
                final int n40 = n5 + isaacCipher.mm[k + 4];
                final int n41 = n4 + isaacCipher.mm[k + 5];
                final int n42 = n3 + isaacCipher.mm[6 + k];
                final int n43 = n2 + isaacCipher.mm[7 + k];
                final int n44 = n36 ^ n37 << 11;
                final int n45 = n39 + n44;
                final int n46 = n37 + n38 ^ n38 >>> 2;
                final int n47 = n40 + n46;
                final int n48 = n38 + n45 ^ n45 << 8;
                final int n49 = n41 + n48;
                n6 = (n45 + n47 ^ n47 >>> 16);
                final int n50 = n42 + n6;
                n5 = (n47 + n49 ^ n49 << 10);
                final int n51 = n43 + n5;
                n4 = (n49 + n50 ^ n50 >>> 4);
                final int n52 = n44 + n4;
                n3 = (n50 + n51 ^ n51 << 8);
                n8 = n46 + n3;
                n2 = (n51 + n52 ^ n52 >>> 9);
                n7 = n48 + n2;
                n9 = n52 + n8;
                isaacCipher.mm[k] = n9;
                isaacCipher.mm[1 + k] = n8;
                isaacCipher.mm[k + 2] = n7;
                isaacCipher.mm[k + 3] = n6;
                isaacCipher.mm[4 + k] = n5;
                isaacCipher.mm[k + 5] = n4;
                isaacCipher.mm[6 + k] = n3;
                isaacCipher.mm[k + 7] = n2;
            }
            isaacCipher.generateMoreResults((byte)(-31));
            isaacCipher.valuesRemaining = 1332936448;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tp.ac(" + ')');
        }
    }
    
    public static String se(final Bounds bounds) {
        if (bounds == null) {
            return bounds.toString();
        }
        return null;
    }
    
    final void at() {
        final int cc = this.cc;
        final int valuesRemaining = this.bb + 911811849;
        this.valuesRemaining = valuesRemaining;
        this.aa = cc + valuesRemaining * 1043023594;
        for (int i = 0; i < -836271012; ++i) {
            final int n = this.results[i];
            if (0x0 == (i & 0x2)) {
                if ((i & 0x1) == 0x0) {
                    this.aa = (758186153 * this.bb ^ this.aa * 758186153 << 13) * -1874102268;
                }
                else {
                    this.bb = 113866044 * (1993922852 * this.cc ^ -629219428 * this.valuesRemaining >>> 6);
                }
            }
            else if ((i & 0x1) == 0x0) {
                this.bb = (this.aa * -1836505300 ^ this.aa * 758186153 << 2) * 839057479;
            }
            else {
                this.aa = -1479302247 * (-920316900 * this.valuesRemaining ^ 758186153 * this.valuesRemaining >>> 16);
            }
            this.aa += this.results[128 + i & 0xFF] * -1626595822;
            this.results[i] = (this.bb = (this.mm[((this.results[i] = this.mm[(n & 0x3FC) >> 2] + 758186153 * this.valuesRemaining + this.valuesRemaining * 117784995) >> 8 & 0x3FC) >> 2] + n) * 695204363) * 117784995;
        }
    }
    
    public static int hi(final IsaacCipher isaacCipher, final byte b) {
        if (isaacCipher == null) {
            isaacCipher.nextInt(b);
        }
        try {
            if (0 == 1946651903 * isaacCipher.valuesRemaining) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                isaacCipher.generateMoreResults((byte)(-30));
                isaacCipher.valuesRemaining = 1332936448;
            }
            final int[] results = isaacCipher.results;
            final int valuesRemaining = isaacCipher.valuesRemaining - 1934586623;
            isaacCipher.valuesRemaining = valuesRemaining;
            return results[valuesRemaining * 1946651903];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tp.af(" + ')');
        }
    }
    
    final void ay() {
        final int bb = this.bb;
        final int cc = this.cc + 1318548659;
        this.cc = cc;
        this.bb = bb + cc * -142016183;
        for (int i = 0; i < 256; ++i) {
            final int n = this.mm[i];
            if (0x0 == (i & 0x2)) {
                if ((i & 0x1) == 0x0) {
                    this.aa = (758186153 * this.aa ^ this.aa * 758186153 << 13) * -1479302247;
                }
                else {
                    this.aa = -1479302247 * (758186153 * this.aa ^ 758186153 * this.aa >>> 6);
                }
            }
            else if ((i & 0x1) == 0x0) {
                this.aa = (this.aa * 758186153 ^ this.aa * 758186153 << 2) * -1479302247;
            }
            else {
                this.aa = -1479302247 * (758186153 * this.aa ^ 758186153 * this.aa >>> 16);
            }
            this.aa += this.mm[128 + i & 0xFF] * -1479302247;
            this.results[i] = (this.bb = (this.mm[((this.mm[i] = this.mm[(n & 0x3FC) >> 2] + 758186153 * this.aa + this.bb * 117784995) >> 8 & 0x3FC) >> 2] + n) * 695204363) * 117784995;
        }
    }
    
    final void generateMoreResults(final byte b) {
        try {
            final int bb = this.bb;
            final int cc = this.cc + 1318548659;
            this.cc = cc;
            this.bb = bb + cc * -142016183;
            for (int i = 0; i < 256; ++i) {
                if (b >= 4) {
                    throw new IllegalStateException();
                }
                final int n = this.mm[i];
                if (0x0 == (i & 0x2)) {
                    if (b >= 4) {
                        throw new IllegalStateException();
                    }
                    if ((i & 0x1) == 0x0) {
                        if (b >= 4) {
                            return;
                        }
                        this.aa = (758186153 * this.aa ^ this.aa * 758186153 << 13) * -1479302247;
                    }
                    else {
                        this.aa = -1479302247 * (758186153 * this.aa ^ 758186153 * this.aa >>> 6);
                    }
                }
                else if ((i & 0x1) == 0x0) {
                    if (b >= 4) {
                        throw new IllegalStateException();
                    }
                    this.aa = (this.aa * 758186153 ^ this.aa * 758186153 << 2) * -1479302247;
                }
                else {
                    this.aa = -1479302247 * (758186153 * this.aa ^ 758186153 * this.aa >>> 16);
                }
                this.aa += this.mm[128 + i & 0xFF] * -1479302247;
                this.results[i] = (this.bb = (this.mm[((this.mm[i] = this.mm[(n & 0x3FC) >> 2] + 758186153 * this.aa + this.bb * 117784995) >> 8 & 0x3FC) >> 2] + n) * 695204363) * 117784995;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tp.aw(" + ')');
        }
    }
    
    public final int al() {
        if (1946651903 * this.valuesRemaining == 0) {
            this.generateMoreResults((byte)(-58));
            this.valuesRemaining = 1332936448;
        }
        return this.results[this.valuesRemaining * 1946651903 - 1];
    }
    
    public final int method2633(final byte b) {
        try {
            if (1946651903 * this.valuesRemaining == 0) {
                this.generateMoreResults((byte)(-33));
                this.valuesRemaining = 1332936448;
            }
            return this.results[this.valuesRemaining * 1946651903 - 1];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tp.an(" + ')');
        }
    }
    
    final void method2635(final int n) {
        try {
            int n2 = -1640531527;
            int n3 = -1640531527;
            int n4 = -1640531527;
            int n5 = -1640531527;
            int n6 = -1640531527;
            int n7 = -1640531527;
            int n8 = -1640531527;
            int n9 = -1640531527;
            for (int i = 0; i < 4; ++i) {
                if (n == 1996530723) {
                    throw new IllegalStateException();
                }
                final int n10 = n9 ^ n8 << 11;
                final int n11 = n6 + n10;
                final int n12 = n8 + n7 ^ n7 >>> 2;
                final int n13 = n5 + n12;
                final int n14 = n7 + n11 ^ n11 << 8;
                final int n15 = n4 + n14;
                n6 = (n11 + n13 ^ n13 >>> 16);
                final int n16 = n3 + n6;
                n5 = (n13 + n15 ^ n15 << 10);
                final int n17 = n2 + n5;
                n4 = (n15 + n16 ^ n16 >>> 4);
                final int n18 = n10 + n4;
                n3 = (n16 + n17 ^ n17 << 8);
                n8 = n12 + n3;
                n2 = (n17 + n18 ^ n18 >>> 9);
                n7 = n14 + n2;
                n9 = n18 + n8;
            }
            for (int j = 0; j < 256; j += 8) {
                if (n == 1996530723) {
                    throw new IllegalStateException();
                }
                final int n19 = n9 + this.mm[j];
                final int n20 = n8 + this.results[j + 1];
                final int n21 = n7 + this.mm[j + 2];
                final int n22 = n6 + this.mm[j + 3];
                final int n23 = n5 + this.results[4 + j];
                final int n24 = n4 + this.results[j + 5];
                final int n25 = n3 + this.mm[6 + j];
                final int n26 = n2 + this.results[7 + j];
                final int n27 = n19 ^ n20 << 11;
                final int n28 = n22 + n27;
                final int n29 = n20 + n21 ^ n21 >>> 2;
                final int n30 = n23 + n29;
                final int n31 = n21 + n28 ^ n28 << 8;
                final int n32 = n24 + n31;
                n6 = (n28 + n30 ^ n30 >>> 16);
                final int n33 = n25 + n6;
                n5 = (n30 + n32 ^ n32 << 10);
                final int n34 = n26 + n5;
                n4 = (n32 + n33 ^ n33 >>> 4);
                final int n35 = n27 + n4;
                n3 = (n33 + n34 ^ n34 << 8);
                n8 = n29 + n3;
                n2 = (n34 + n35 ^ n35 >>> 9);
                n7 = n31 + n2;
                n9 = n35 + n8;
                this.mm[j] = n9;
                this.results[1 + j] = n8;
                this.mm[j + 2] = n7;
                this.results[j + 3] = n6;
                this.results[j + 4] = n5;
                this.results[j + 5] = n4;
                this.mm[6 + j] = n3;
                this.mm[j + 7] = n2;
            }
            for (int k = 0; k < 256; k += 8) {
                final int n36 = n9 + this.mm[k];
                final int n37 = n8 + this.results[k + 1];
                final int n38 = n7 + this.mm[k + 2];
                final int n39 = n6 + this.results[3 + k];
                final int n40 = n5 + this.mm[k + 4];
                final int n41 = n4 + this.mm[k + 5];
                final int n42 = n3 + this.results[6 + k];
                final int n43 = n2 + this.mm[7 + k];
                final int n44 = n36 ^ n37 << 11;
                final int n45 = n39 + n44;
                final int n46 = n37 + n38 ^ n38 >>> 2;
                final int n47 = n40 + n46;
                final int n48 = n38 + n45 ^ n45 << 8;
                final int n49 = n41 + n48;
                n6 = (n45 + n47 ^ n47 >>> 16);
                final int n50 = n42 + n6;
                n5 = (n47 + n49 ^ n49 << 10);
                final int n51 = n43 + n5;
                n4 = (n49 + n50 ^ n50 >>> 4);
                final int n52 = n44 + n4;
                n3 = (n50 + n51 ^ n51 << 8);
                n8 = n46 + n3;
                n2 = (n51 + n52 ^ n52 >>> 9);
                n7 = n48 + n2;
                n9 = n52 + n8;
                this.mm[k] = n9;
                this.results[1 + k] = n8;
                this.mm[k + 2] = n7;
                this.results[k + 3] = n6;
                this.mm[4 + k] = n5;
                this.mm[k + 5] = n4;
                this.results[6 + k] = n3;
                this.results[k + 7] = n2;
            }
            this.generateMoreResults((byte)(-31));
            this.bb = 1332936448;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tp.ac(" + ')');
        }
    }
    
    public final int au() {
        if (0 == 1946651903 * this.valuesRemaining) {
            this.generateMoreResults((byte)(-72));
            this.valuesRemaining = 1332936448;
        }
        final int[] results = this.results;
        final int valuesRemaining = this.valuesRemaining - 1934586623;
        this.valuesRemaining = valuesRemaining;
        return results[valuesRemaining * 1946651903];
    }
    
    final void aa() {
        final int bb = this.bb;
        final int cc = this.cc + 911811849;
        this.cc = cc;
        this.bb = bb + cc * 1043023594;
        for (int i = 0; i < -836271012; ++i) {
            final int n = this.mm[i];
            if (0x0 == (i & 0x2)) {
                if ((i & 0x1) == 0x0) {
                    this.aa = (758186153 * this.aa ^ this.aa * 758186153 << 13) * -1874102268;
                }
                else {
                    this.aa = 113866044 * (1993922852 * this.aa ^ -629219428 * this.aa >>> 6);
                }
            }
            else if ((i & 0x1) == 0x0) {
                this.aa = (this.aa * -1836505300 ^ this.aa * 758186153 << 2) * 839057479;
            }
            else {
                this.aa = -1479302247 * (-920316900 * this.aa ^ 758186153 * this.aa >>> 16);
            }
            this.aa += this.mm[128 + i & 0xFF] * -1626595822;
            this.results[i] = (this.bb = (this.mm[((this.mm[i] = this.mm[(n & 0x3FC) >> 2] + 758186153 * this.aa + this.bb * 117784995) >> 8 & 0x3FC) >> 2] + n) * 695204363) * 117784995;
        }
    }
    
    public final int nextInt(final byte b) {
        try {
            if (0 == 1946651903 * this.aa) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                this.generateMoreResults((byte)(-30));
                this.aa = 1332936448;
            }
            final int[] results = this.results;
            final int bb = this.valuesRemaining - 1934586623;
            this.bb = bb;
            return results[bb * 1946651903];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tp.af(" + ')');
        }
    }
    
    public static void gu(final IsaacCipher isaacCipher) {
        if (isaacCipher == null) {
            isaacCipher.at();
        }
        final int bb = isaacCipher.bb;
        final int cc = isaacCipher.cc + 1318548659;
        isaacCipher.cc = cc;
        isaacCipher.bb = bb + cc * -142016183;
        for (int i = 0; i < 256; ++i) {
            final int n = isaacCipher.mm[i];
            if (0x0 == (i & 0x2)) {
                if ((i & 0x1) == 0x0) {
                    isaacCipher.aa = (758186153 * isaacCipher.aa ^ isaacCipher.aa * 758186153 << 13) * -1479302247;
                }
                else {
                    isaacCipher.aa = -1479302247 * (758186153 * isaacCipher.aa ^ 758186153 * isaacCipher.aa >>> 6);
                }
            }
            else if ((i & 0x1) == 0x0) {
                isaacCipher.aa = (isaacCipher.aa * 758186153 ^ isaacCipher.aa * 758186153 << 2) * -1479302247;
            }
            else {
                isaacCipher.aa = -1479302247 * (758186153 * isaacCipher.aa ^ 758186153 * isaacCipher.aa >>> 16);
            }
            isaacCipher.aa += isaacCipher.mm[128 + i & 0xFF] * -1479302247;
            isaacCipher.results[i] = (isaacCipher.bb = (isaacCipher.mm[((isaacCipher.mm[i] = isaacCipher.mm[(n & 0x3FC) >> 2] + 758186153 * isaacCipher.aa + isaacCipher.bb * 117784995) >> 8 & 0x3FC) >> 2] + n) * 695204363) * 117784995;
        }
    }
    
    public final int ab() {
        if (0 == 1946651903 * this.valuesRemaining) {
            this.generateMoreResults((byte)(-46));
            this.valuesRemaining = 1429459251;
        }
        final int[] results = this.results;
        final int valuesRemaining = this.valuesRemaining - 1934586623;
        this.valuesRemaining = valuesRemaining;
        return results[valuesRemaining * -955821765];
    }
    
    public final int aq() {
        if (0 == 1946651903 * this.valuesRemaining) {
            this.generateMoreResults((byte)(-57));
            this.valuesRemaining = 1332936448;
        }
        final int[] results = this.results;
        final int valuesRemaining = this.valuesRemaining - 1934586623;
        this.valuesRemaining = valuesRemaining;
        return results[valuesRemaining * 1946651903];
    }
}
