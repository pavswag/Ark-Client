// 
// Decompiled by Procyon v0.5.36
// 

public class VorbisCodebook
{
    int[] lengthMap;
    int entries;
    float[][] field262;
    int[] field263;
    int dimensions;
    int[] keys;
    
    VorbisCodebook() {
        VorbisSample.readBits(24);
        this.entries = VorbisSample.readBits(16);
        this.dimensions = VorbisSample.readBits(24);
        this.lengthMap = new int[this.dimensions];
        if (VorbisSample.readBit() != 0) {
            int i = 0;
            int n = VorbisSample.readBits(5) + 1;
            while (i < this.dimensions) {
                for (int bits = VorbisSample.readBits(LoginPacket.iLog(this.dimensions - i, -1603575130)), j = 0; j < bits; ++j) {
                    this.lengthMap[i++] = n;
                }
                ++n;
            }
        }
        else {
            final boolean b = VorbisSample.readBit() != 0;
            for (int k = 0; k < this.dimensions; ++k) {
                if (b && VorbisSample.readBit() == 0) {
                    this.lengthMap[k] = 0;
                }
                else {
                    this.lengthMap[k] = VorbisSample.readBits(5) + 1;
                }
            }
        }
        this.method310();
        final int bits2 = VorbisSample.readBits(4);
        if (bits2 > 0) {
            final float float32Unpack = VorbisSample.float32Unpack(VorbisSample.readBits(32));
            final float float32Unpack2 = VorbisSample.float32Unpack(VorbisSample.readBits(32));
            final int n2 = VorbisSample.readBits(4) + 1;
            final boolean b2 = VorbisSample.readBit() != 0;
            int mapType1QuantValues;
            if (bits2 == 1) {
                mapType1QuantValues = mapType1QuantValues(this.dimensions, this.entries);
            }
            else {
                mapType1QuantValues = this.dimensions * this.entries;
            }
            this.field263 = new int[mapType1QuantValues];
            for (int l = 0; l < mapType1QuantValues; ++l) {
                this.field263[l] = VorbisSample.readBits(n2);
            }
            this.field262 = new float[this.dimensions][this.entries];
            if (bits2 == 1) {
                for (int n3 = 0; n3 < this.dimensions; ++n3) {
                    float n4 = 0.0f;
                    int n5 = 1;
                    for (int n6 = 0; n6 < this.entries; ++n6) {
                        final float n7 = this.field263[n3 / n5 % mapType1QuantValues] * float32Unpack2 + float32Unpack + n4;
                        this.field262[n3][n6] = n7;
                        if (b2) {
                            n4 = n7;
                        }
                        n5 *= mapType1QuantValues;
                    }
                }
            }
            else {
                for (int n8 = 0; n8 < this.dimensions; ++n8) {
                    float n9 = 0.0f;
                    int n10 = n8 * this.entries;
                    for (int n11 = 0; n11 < this.entries; ++n11) {
                        final float n12 = this.field263[n10] * float32Unpack2 + float32Unpack + n9;
                        this.field262[n8][n11] = n12;
                        if (b2) {
                            n9 = n12;
                        }
                        ++n10;
                    }
                }
            }
        }
    }
    
    public static float[] pc(final VorbisCodebook vorbisCodebook) {
        if (vorbisCodebook == null) {
            return vorbisCodebook.method311();
        }
        return vorbisCodebook.field262[vorbisCodebook.method309()];
    }
    
    float[] ao() {
        return this.field262[this.method309()];
    }
    
    int at() {
        int n;
        for (n = 0; this.keys[n] >= 0; n = ((VorbisSample.readBit() != 0) ? this.keys[n] : (n + 1))) {}
        return ~this.keys[n];
    }
    
    float[] ay() {
        return this.field262[this.method309()];
    }
    
    int method309() {
        int n;
        for (n = 0; this.keys[n] >= 0; n = ((VorbisSample.readBit() != 0) ? this.keys[n] : (n + 1))) {}
        return ~this.keys[n];
    }
    
    int al() {
        int n;
        for (n = 0; this.keys[n] >= 0; n = ((VorbisSample.readBit() != 0) ? this.keys[n] : (n + 1))) {}
        return ~this.keys[n];
    }
    
    public static boolean no(final class379 class379, final int n, final int n2) {
        if (n != 252193353 * class379.field3615 || n2 != -1175779569 * class379.field3620) {
            class379.field3615 = 1135601657 * n;
            class379.field3620 = 1152816838 * n2;
            class379.method2025(-224307219);
        }
        return true;
    }
    
    void method310() {
        final int[] array = new int[this.dimensions];
        final int[] array2 = new int[33];
        for (int i = 0; i < this.dimensions; ++i) {
            final int n = this.lengthMap[i];
            if (n != 0) {
                final int n2 = 1 << 32 - n;
                final int n3 = array2[n];
                array[i] = n3;
                int n4;
                if ((n3 & n2) != 0x0) {
                    n4 = array2[n - 1];
                }
                else {
                    n4 = (n3 | n2);
                    for (int j = n - 1; j >= 1; --j) {
                        final int n5 = array2[j];
                        if (n5 != n3) {
                            break;
                        }
                        final int n6 = 1 << 32 - j;
                        if ((n5 & n6) != 0x0) {
                            array2[j] = array2[j - 1];
                            break;
                        }
                        array2[j] = (n5 | n6);
                    }
                }
                array2[n] = n4;
                for (int k = n + 1; k <= 32; ++k) {
                    if (array2[k] == n3) {
                        array2[k] = n4;
                    }
                }
            }
        }
        this.keys = new int[8];
        int n7 = 0;
        for (int l = 0; l < this.dimensions; ++l) {
            final int n8 = this.lengthMap[l];
            if (n8 != 0) {
                final int n9 = array[l];
                int n10 = 0;
                for (int n11 = 0; n11 < n8; ++n11) {
                    if ((n9 & Integer.MIN_VALUE >>> n11) != 0x0) {
                        if (this.keys[n10] == 0) {
                            this.keys[n10] = n7;
                        }
                        n10 = this.keys[n10];
                    }
                    else {
                        ++n10;
                    }
                    if (n10 >= this.keys.length) {
                        final int[] keys = new int[this.keys.length * 2];
                        for (int n12 = 0; n12 < this.keys.length; ++n12) {
                            keys[n12] = this.keys[n12];
                        }
                        this.keys = keys;
                    }
                }
                this.keys[n10] = ~l;
                if (n10 >= n7) {
                    n7 = n10 + 1;
                }
            }
        }
    }
    
    float[] method311() {
        return this.field262[this.al()];
    }
    
    static int au(final int n, final int n2) {
        int n3;
        for (n3 = (int)Math.pow(n, 1.0 / n2) + 1; Script.method460(n3, n2, -1816092383) > n; --n3) {}
        return n3;
    }
    
    float[] aa() {
        return this.field262[this.method309()];
    }
    
    static int mapType1QuantValues(final int n, final int n2) {
        int n3;
        for (n3 = (int)Math.pow(n, 1.0 / n2) + 1; Script.method460(n3, n2, -2065195027) > n; --n3) {}
        return n3;
    }
    
    void ab() {
        final int[] array = new int[this.dimensions];
        final int[] array2 = new int[33];
        for (int i = 0; i < this.dimensions; ++i) {
            final int n = this.lengthMap[i];
            if (n != 0) {
                final int n2 = 1 << 32 - n;
                final int n3 = array2[n];
                array[i] = n3;
                int n4;
                if ((n3 & n2) != 0x0) {
                    n4 = array2[n - 1];
                }
                else {
                    n4 = (n3 | n2);
                    for (int j = n - 1; j >= 1; --j) {
                        final int n5 = array2[j];
                        if (n5 != n3) {
                            break;
                        }
                        final int n6 = 1 << 32 - j;
                        if ((n5 & n6) != 0x0) {
                            array2[j] = array2[j - 1];
                            break;
                        }
                        array2[j] = (n5 | n6);
                    }
                }
                array2[n] = n4;
                for (int k = n + 1; k <= 32; ++k) {
                    if (array2[k] == n3) {
                        array2[k] = n4;
                    }
                }
            }
        }
        this.keys = new int[8];
        int n7 = 0;
        for (int l = 0; l < this.dimensions; ++l) {
            final int n8 = this.lengthMap[l];
            if (n8 != 0) {
                final int n9 = array[l];
                int n10 = 0;
                for (int n11 = 0; n11 < n8; ++n11) {
                    if ((n9 & Integer.MIN_VALUE >>> n11) != 0x0) {
                        if (this.keys[n10] == 0) {
                            this.keys[n10] = n7;
                        }
                        n10 = this.keys[n10];
                    }
                    else {
                        ++n10;
                    }
                    if (n10 >= this.keys.length) {
                        final int[] keys = new int[this.keys.length * 2];
                        for (int n12 = 0; n12 < this.keys.length; ++n12) {
                            keys[n12] = this.keys[n12];
                        }
                        this.keys = keys;
                    }
                }
                this.keys[n10] = ~l;
                if (n10 >= n7) {
                    n7 = n10 + 1;
                }
            }
        }
    }
    
    int aq() {
        int n;
        for (n = 0; this.keys[n] >= 0; n = ((VorbisSample.readBit() != 0) ? this.keys[n] : (n + 1))) {}
        return ~this.keys[n];
    }
}
