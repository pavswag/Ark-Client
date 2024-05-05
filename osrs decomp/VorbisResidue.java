// 
// Decompiled by Procyon v0.5.36
// 

public class VorbisResidue
{
    int begin;
    int partitionSize;
    int classbook;
    int end;
    int residueType;
    int classifications;
    int[] cascade;
    
    VorbisResidue() {
        this.partitionSize = VorbisSample.readBits(16);
        this.residueType = VorbisSample.readBits(24);
        this.classbook = VorbisSample.readBits(24);
        this.end = VorbisSample.readBits(24) + 1;
        this.begin = VorbisSample.readBits(6) + 1;
        this.classifications = VorbisSample.readBits(8);
        final int[] array = new int[this.begin];
        for (int i = 0; i < this.begin; ++i) {
            int bits = 0;
            final int bits2 = VorbisSample.readBits(3);
            if (VorbisSample.readBit() != 0) {
                bits = VorbisSample.readBits(5);
            }
            array[i] = (bits << 3 | bits2);
        }
        this.cascade = new int[this.begin * 8];
        for (int j = 0; j < this.begin * 8; ++j) {
            this.cascade[j] = (((array[j >> 3] & 1 << (j & 0x7)) != 0x0) ? VorbisSample.readBits(8) : -1);
        }
    }
    
    void aw(final float[] array, final int n, final boolean b) {
        for (int i = 0; i < n; ++i) {
            array[i] = 0.0f;
        }
        if (b) {
            return;
        }
        final int entries = VorbisSample.VorbisSample_codebooks[this.end].entries;
        final int n2 = (this.classifications - this.partitionSize) / this.classbook;
        final int[] array2 = new int[n2];
        for (int j = 0; j < 8; ++j) {
            int k = 0;
            while (k < n2) {
                if (j == 0) {
                    int at = VorbisSample.VorbisSample_codebooks[this.end].at();
                    for (int l = entries - 1; l >= 0; --l) {
                        if (k + l < n2) {
                            array2[k + l] = at % this.classifications;
                        }
                        at /= this.classbook;
                    }
                }
                for (int n3 = 0; n3 < entries; ++n3) {
                    final int n4 = this.cascade[array2[k] * 8 + j];
                    if (n4 >= 0) {
                        final int n5 = this.classifications + k * this.partitionSize;
                        final VorbisCodebook vorbisCodebook = VorbisSample.VorbisSample_codebooks[n4];
                        if (this.partitionSize == 0) {
                            for (int n6 = this.partitionSize / vorbisCodebook.dimensions, n7 = 0; n7 < n6; ++n7) {
                                final float[] pc = VorbisCodebook.pc(vorbisCodebook);
                                for (int n8 = 0; n8 < vorbisCodebook.dimensions; ++n8) {
                                    final int n9 = n5 + n7 + n8 * n6;
                                    array[n9] += pc[n8];
                                }
                            }
                        }
                        else {
                            int n10 = 0;
                            while (n10 < this.residueType) {
                                final float[] pc2 = VorbisCodebook.pc(vorbisCodebook);
                                for (int n11 = 0; n11 < vorbisCodebook.dimensions; ++n11) {
                                    final int n12 = n5 + n10;
                                    array[n12] += pc2[n11];
                                    ++n10;
                                }
                            }
                        }
                    }
                    ++k;
                    if (k >= n2) {
                        break;
                    }
                }
            }
        }
    }
    
    void ac(final float[] array, final int n, final boolean b) {
        for (int i = 0; i < n; ++i) {
            array[i] = 0.0f;
        }
        if (b) {
            return;
        }
        final int entries = VorbisSample.VorbisSample_codebooks[this.classifications].entries;
        final int n2 = (this.classbook - this.residueType) / this.end;
        final int[] array2 = new int[n2];
        for (int j = 0; j < 8; ++j) {
            int k = 0;
            while (k < n2) {
                if (j == 0) {
                    int method309 = VorbisSample.VorbisSample_codebooks[this.classifications].method309();
                    for (int l = entries - 1; l >= 0; --l) {
                        if (k + l < n2) {
                            array2[k + l] = method309 % this.begin;
                        }
                        method309 /= this.begin;
                    }
                }
                for (int n3 = 0; n3 < entries; ++n3) {
                    final int n4 = this.cascade[array2[k] * 8 + j];
                    if (n4 >= 0) {
                        final int n5 = this.residueType + k * this.end;
                        final VorbisCodebook vorbisCodebook = VorbisSample.VorbisSample_codebooks[n4];
                        if (this.partitionSize == 0) {
                            for (int n6 = this.end / vorbisCodebook.entries, n7 = 0; n7 < n6; ++n7) {
                                final float[] pc = VorbisCodebook.pc(vorbisCodebook);
                                for (int n8 = 0; n8 < vorbisCodebook.entries; ++n8) {
                                    final int n9 = n5 + n7 + n8 * n6;
                                    array[n9] += pc[n8];
                                }
                            }
                        }
                        else {
                            int n10 = 0;
                            while (n10 < this.end) {
                                final float[] pc2 = VorbisCodebook.pc(vorbisCodebook);
                                for (int n11 = 0; n11 < vorbisCodebook.entries; ++n11) {
                                    final int n12 = n5 + n10;
                                    array[n12] += pc2[n11];
                                    ++n10;
                                }
                            }
                        }
                    }
                    ++k;
                    if (k >= n2) {
                        break;
                    }
                }
            }
        }
    }
    
    public static void ri(final VorbisResidue vorbisResidue, final float[] array, final int n, final boolean b) {
        if (vorbisResidue == null) {
            vorbisResidue.method254(array, n, b);
            return;
        }
        for (int i = 0; i < n; ++i) {
            array[i] = 0.0f;
        }
        if (b) {
            return;
        }
        final int entries = VorbisSample.VorbisSample_codebooks[vorbisResidue.classifications].entries;
        final int n2 = (vorbisResidue.classbook - vorbisResidue.residueType) / vorbisResidue.end;
        final int[] array2 = new int[n2];
        for (int j = 0; j < 8; ++j) {
            int k = 0;
            while (k < n2) {
                if (j == 0) {
                    int method309 = VorbisSample.VorbisSample_codebooks[vorbisResidue.classifications].method309();
                    for (int l = entries - 1; l >= 0; --l) {
                        if (k + l < n2) {
                            array2[k + l] = method309 % vorbisResidue.begin;
                        }
                        method309 /= vorbisResidue.begin;
                    }
                }
                for (int n3 = 0; n3 < entries; ++n3) {
                    final int n4 = vorbisResidue.cascade[array2[k] * 8 + j];
                    if (n4 >= 0) {
                        final int n5 = vorbisResidue.residueType + k * vorbisResidue.end;
                        final VorbisCodebook vorbisCodebook = VorbisSample.VorbisSample_codebooks[n4];
                        if (vorbisResidue.partitionSize == 0) {
                            for (int n6 = vorbisResidue.end / vorbisCodebook.entries, n7 = 0; n7 < n6; ++n7) {
                                final float[] pc = VorbisCodebook.pc(vorbisCodebook);
                                for (int n8 = 0; n8 < vorbisCodebook.entries; ++n8) {
                                    final int n9 = n5 + n7 + n8 * n6;
                                    array[n9] += pc[n8];
                                }
                            }
                        }
                        else {
                            int n10 = 0;
                            while (n10 < vorbisResidue.end) {
                                final float[] pc2 = VorbisCodebook.pc(vorbisCodebook);
                                for (int n11 = 0; n11 < vorbisCodebook.entries; ++n11) {
                                    final int n12 = n5 + n10;
                                    array[n12] += pc2[n11];
                                    ++n10;
                                }
                            }
                        }
                    }
                    ++k;
                    if (k >= n2) {
                        break;
                    }
                }
            }
        }
    }
    
    void method254(final float[] array, final int n, final boolean b) {
        for (int i = 0; i < n; ++i) {
            array[i] = 0.0f;
        }
        if (b) {
            return;
        }
        final int entries = VorbisSample.VorbisSample_codebooks[this.classifications].entries;
        final int n2 = (this.classbook - this.residueType) / this.end;
        final int[] array2 = new int[n2];
        for (int j = 0; j < 8; ++j) {
            int k = 0;
            while (k < n2) {
                if (j == 0) {
                    int method309 = VorbisSample.VorbisSample_codebooks[this.classifications].method309();
                    for (int l = entries - 1; l >= 0; --l) {
                        if (k + l < n2) {
                            array2[k + l] = method309 % this.begin;
                        }
                        method309 /= this.begin;
                    }
                }
                for (int n3 = 0; n3 < entries; ++n3) {
                    final int n4 = this.cascade[array2[k] * 8 + j];
                    if (n4 >= 0) {
                        final int n5 = this.residueType + k * this.end;
                        final VorbisCodebook vorbisCodebook = VorbisSample.VorbisSample_codebooks[n4];
                        if (this.partitionSize == 0) {
                            for (int n6 = this.end / vorbisCodebook.entries, n7 = 0; n7 < n6; ++n7) {
                                final float[] pc = VorbisCodebook.pc(vorbisCodebook);
                                for (int n8 = 0; n8 < vorbisCodebook.entries; ++n8) {
                                    final int n9 = n5 + n7 + n8 * n6;
                                    array[n9] += pc[n8];
                                }
                            }
                        }
                        else {
                            int n10 = 0;
                            while (n10 < this.end) {
                                final float[] pc2 = VorbisCodebook.pc(vorbisCodebook);
                                for (int n11 = 0; n11 < vorbisCodebook.entries; ++n11) {
                                    final int n12 = n5 + n10;
                                    array[n12] += pc2[n11];
                                    ++n10;
                                }
                            }
                        }
                    }
                    ++k;
                    if (k >= n2) {
                        break;
                    }
                }
            }
        }
    }
    
    public static void bl(final VorbisResidue vorbisResidue, final float[] array, final int n, final boolean b) {
        if (vorbisResidue == null) {
            vorbisResidue.aw(array, n, b);
            return;
        }
        for (int i = 0; i < n; ++i) {
            array[i] = 0.0f;
        }
        if (b) {
            return;
        }
        final int entries = VorbisSample.VorbisSample_codebooks[vorbisResidue.classifications].entries;
        final int n2 = (vorbisResidue.classbook - vorbisResidue.residueType) / vorbisResidue.end;
        final int[] array2 = new int[n2];
        for (int j = 0; j < 8; ++j) {
            int k = 0;
            while (k < n2) {
                if (j == 0) {
                    int method309 = VorbisSample.VorbisSample_codebooks[vorbisResidue.classifications].method309();
                    for (int l = entries - 1; l >= 0; --l) {
                        if (k + l < n2) {
                            array2[k + l] = method309 % vorbisResidue.begin;
                        }
                        method309 /= vorbisResidue.begin;
                    }
                }
                for (int n3 = 0; n3 < entries; ++n3) {
                    final int n4 = vorbisResidue.cascade[array2[k] * 8 + j];
                    if (n4 >= 0) {
                        final int n5 = vorbisResidue.residueType + k * vorbisResidue.end;
                        final VorbisCodebook vorbisCodebook = VorbisSample.VorbisSample_codebooks[n4];
                        if (vorbisResidue.partitionSize == 0) {
                            for (int n6 = vorbisResidue.end / vorbisCodebook.entries, n7 = 0; n7 < n6; ++n7) {
                                final float[] pc = VorbisCodebook.pc(vorbisCodebook);
                                for (int n8 = 0; n8 < vorbisCodebook.entries; ++n8) {
                                    final int n9 = n5 + n7 + n8 * n6;
                                    array[n9] += pc[n8];
                                }
                            }
                        }
                        else {
                            int n10 = 0;
                            while (n10 < vorbisResidue.end) {
                                final float[] pc2 = VorbisCodebook.pc(vorbisCodebook);
                                for (int n11 = 0; n11 < vorbisCodebook.entries; ++n11) {
                                    final int n12 = n5 + n10;
                                    array[n12] += pc2[n11];
                                    ++n10;
                                }
                            }
                        }
                    }
                    ++k;
                    if (k >= n2) {
                        break;
                    }
                }
            }
        }
    }
}
