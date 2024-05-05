// 
// Decompiled by Procyon v0.5.36
// 

public class class154 extends class139
{
    int field1385;
    String field1386;
    public static final int ew = 4;
    final /* synthetic */ class142 this$0;
    static final int ao = 6;
    long field1387;
    
    class154(final class142 this$0) {
        this.this$0 = this$0;
        this.field1387 = -5362405580622353499L;
        this.field1386 = null;
        this.field1385 = 0;
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        clanSettings.method849(this.field1387 * -6441306749678142509L, this.field1386, this.field1385 * 251537025, -706420067);
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.method849(this.field1387 * -6441306749678142509L, this.field1386, this.field1385 * 251537025, -706420067);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ft.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset += 1516355947;
            this.field1387 = Buffer.ks(buffer, (byte)1) * 5362405580622353499L;
        }
        this.field1386 = buffer.readStringCp1252NullTerminatedOrNull((byte)6);
        this.field1385 = buffer.readUnsignedShort(38741102) * 36444545;
    }
    
    @Override
    void au(final Buffer buffer) {
        if (Buffer.ra(buffer, (byte)7) != 255) {
            buffer.offset += 1516355947;
            this.field1387 = Buffer.ks(buffer, (byte)1) * 5362405580622353499L;
        }
        this.field1386 = buffer.readStringCp1252NullTerminatedOrNull((byte)(-36));
        this.field1385 = buffer.readUnsignedShort(-994016792) * 36444545;
    }
    
    public static void vmethod3254(final Huffman huffman, final int n) {
        try {
            class319.huffman = huffman;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ft.af(" + ')');
        }
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            if (Buffer.ra(buffer, (byte)7) != 255) {
                if (n == 1120136284) {
                    return;
                }
                buffer.offset += 1516355947;
                this.field1387 = Buffer.ks(buffer, (byte)1) * 5362405580622353499L;
            }
            this.field1386 = buffer.readStringCp1252NullTerminatedOrNull((byte)3);
            this.field1385 = buffer.readUnsignedShort(125987804) * 36444545;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ft.af(" + ')');
        }
    }
    
    public static void hg(final VorbisResidue vorbisResidue, final float[] array, final int n, final boolean b) {
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
}
