// 
// Decompiled by Procyon v0.5.36
// 

public class VorbisSample extends Node
{
    static boolean[] VorbisSample_blockFlags;
    int sampleRate;
    static boolean field268;
    static int VorbisSample_blockSize0;
    int end;
    boolean field275;
    static int[] VorbisSample_mapping;
    static int VorbisSample_byteOffset;
    static int VorbisSample_bitOffset;
    boolean field271;
    static int VorbisSample_blockSize1;
    static VorbisCodebook[] VorbisSample_codebooks;
    int field278;
    static VorbisResidue[] VorbisSample_residues;
    static VorbisMapping[] VorbisSample_mappings;
    static float[] field281;
    int field282;
    static VorbisFloor[] VorbisSample_floors;
    float[] field284;
    int field285;
    int field286;
    byte[][] field287;
    static float[] field288;
    int start;
    static float[] field290;
    static float[] field291;
    int sampleCount;
    static float[] field293;
    static float[] field294;
    static int[] field295;
    static int[] field296;
    byte[] samples;
    static byte[] VorbisSample_bytes;
    static float[] field299;
    
    VorbisSample(final byte[] array) {
        this.read(array);
    }
    
    static {
        VorbisSample.field268 = false;
    }
    
    float[] ae(final int n) {
        VorbisSample_setData(this.field287[n], 0);
        readBit();
        final int bits = readBits(LoginPacket.iLog(VorbisSample.VorbisSample_mapping.length - 1, -1586075420));
        final boolean b = VorbisSample.VorbisSample_blockFlags[bits];
        final int field285 = b ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
        int n2 = 0;
        int n3 = 0;
        if (b) {
            n2 = ((readBit() != 0) ? 1 : 0);
            n3 = ((readBit() != 0) ? 1 : 0);
        }
        final int n4 = field285 >> 1;
        int n5;
        int n6;
        int n7;
        if (b && n2 == 0) {
            n5 = (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n6 = (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n7 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n5 = 0;
            n6 = n4;
            n7 = field285 >> 1;
        }
        int n8;
        int n9;
        int n10;
        if (b && n3 == 0) {
            n8 = field285 - (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n9 = field285 - (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n10 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n8 = n4;
            n9 = field285;
            n10 = field285 >> 1;
        }
        final VorbisMapping vorbisMapping = VorbisSample.VorbisSample_mappings[VorbisSample.VorbisSample_mapping[bits]];
        final boolean b2;
        final boolean field286 = b2 = !VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].readSubmapFloor();
        for (int i = 0; i < vorbisMapping.submaps; ++i) {
            VorbisSample.VorbisSample_residues[vorbisMapping.submapFloor[i]].method254(VorbisSample.field288, field285 >> 1, b2);
        }
        if (!field286) {
            VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].method225(VorbisSample.field288, field285 >> 1);
        }
        if (field286) {
            for (int j = field285 >> 1; j < field285; ++j) {
                VorbisSample.field288[j] = 0.0f;
            }
        }
        else {
            final int n11 = field285 >> 1;
            final int n12 = field285 >> 2;
            final int n13 = field285 >> 3;
            final float[] field287 = VorbisSample.field288;
            for (int k = 0; k < n11; ++k) {
                final float[] array = field287;
                final int n14 = k;
                array[n14] *= 0.5f;
            }
            for (int l = n11; l < field285; ++l) {
                field287[l] = -field287[field285 - l - 1];
            }
            final float[] array2 = b ? VorbisSample.field281 : VorbisSample.field299;
            final float[] array3 = b ? VorbisSample.field293 : VorbisSample.field290;
            final float[] array4 = b ? VorbisSample.field294 : VorbisSample.field291;
            final int[] array5 = b ? VorbisSample.field296 : VorbisSample.field295;
            for (int n15 = 0; n15 < n12; ++n15) {
                final float n16 = field287[4 * n15] - field287[field285 - 4 * n15 - 1];
                final float n17 = field287[4 * n15 + 2] - field287[field285 - 4 * n15 - 3];
                final float n18 = array2[2 * n15];
                final float n19 = array2[2 * n15 + 1];
                field287[field285 - 4 * n15 - 1] = n16 * n18 - n17 * n19;
                field287[field285 - 4 * n15 - 3] = n16 * n19 + n17 * n18;
            }
            for (int n20 = 0; n20 < n13; ++n20) {
                final float n21 = field287[n11 + 3 + 4 * n20];
                final float n22 = field287[n11 + 1 + 4 * n20];
                final float n23 = field287[4 * n20 + 3];
                final float n24 = field287[4 * n20 + 1];
                field287[n11 + 3 + 4 * n20] = n21 + n23;
                field287[n11 + 1 + 4 * n20] = n22 + n24;
                final float n25 = array2[n11 - 4 - 4 * n20];
                final float n26 = array2[n11 - 3 - 4 * n20];
                field287[4 * n20 + 3] = (n21 - n23) * n25 - (n22 - n24) * n26;
                field287[4 * n20 + 1] = (n22 - n24) * n25 + (n21 - n23) * n26;
            }
            for (int iLog = LoginPacket.iLog(field285 - 1, -580843418), n27 = 0; n27 < iLog - 3; ++n27) {
                final int n28 = field285 >> n27 + 2;
                final int n29 = 8 << n27;
                for (int n30 = 0; n30 < 2 << n27; ++n30) {
                    final int n31 = field285 - n28 * 2 * n30;
                    final int n32 = field285 - n28 * (2 * n30 + 1);
                    for (int n33 = 0; n33 < field285 >> n27 + 4; ++n33) {
                        final int n34 = 4 * n33;
                        final float n35 = field287[n31 - 1 - n34];
                        final float n36 = field287[n31 - 3 - n34];
                        final float n37 = field287[n32 - 1 - n34];
                        final float n38 = field287[n32 - 3 - n34];
                        field287[n31 - 1 - n34] = n35 + n37;
                        field287[n31 - 3 - n34] = n36 + n38;
                        final float n39 = array2[n33 * n29];
                        final float n40 = array2[n33 * n29 + 1];
                        field287[n32 - 1 - n34] = (n35 - n37) * n39 - (n36 - n38) * n40;
                        field287[n32 - 3 - n34] = (n36 - n38) * n39 + (n35 - n37) * n40;
                    }
                }
            }
            for (int n41 = 1; n41 < n13 - 1; ++n41) {
                final int n42 = array5[n41];
                if (n41 < n42) {
                    final int n43 = 8 * n41;
                    final int n44 = 8 * n42;
                    final float n45 = field287[n43 + 1];
                    field287[n43 + 1] = field287[n44 + 1];
                    field287[n44 + 1] = n45;
                    final float n46 = field287[n43 + 3];
                    field287[n43 + 3] = field287[n44 + 3];
                    field287[n44 + 3] = n46;
                    final float n47 = field287[n43 + 5];
                    field287[n43 + 5] = field287[n44 + 5];
                    field287[n44 + 5] = n47;
                    final float n48 = field287[n43 + 7];
                    field287[n43 + 7] = field287[n44 + 7];
                    field287[n44 + 7] = n48;
                }
            }
            for (int n49 = 0; n49 < n11; ++n49) {
                field287[n49] = field287[2 * n49 + 1];
            }
            for (int n50 = 0; n50 < n13; ++n50) {
                field287[field285 - 1 - 2 * n50] = field287[4 * n50];
                field287[field285 - 2 - 2 * n50] = field287[4 * n50 + 1];
                field287[field285 - n12 - 1 - 2 * n50] = field287[4 * n50 + 2];
                field287[field285 - n12 - 2 - 2 * n50] = field287[4 * n50 + 3];
            }
            for (int n51 = 0; n51 < n13; ++n51) {
                final float n52 = array4[2 * n51];
                final float n53 = array4[2 * n51 + 1];
                final float n54 = field287[n11 + 2 * n51];
                final float n55 = field287[n11 + 2 * n51 + 1];
                final float n56 = field287[field285 - 2 - 2 * n51];
                final float n57 = field287[field285 - 1 - 2 * n51];
                final float n58 = n53 * (n54 - n56) + n52 * (n55 + n57);
                field287[n11 + 2 * n51] = (n54 + n56 + n58) * 0.5f;
                field287[field285 - 2 - 2 * n51] = (n54 + n56 - n58) * 0.5f;
                final float n59 = n53 * (n55 + n57) - n52 * (n54 - n56);
                field287[n11 + 2 * n51 + 1] = (n55 - n57 + n59) * 0.5f;
                field287[field285 - 1 - 2 * n51] = (-n55 + n57 + n59) * 0.5f;
            }
            for (int n60 = 0; n60 < n12; ++n60) {
                field287[n60] = field287[2 * n60 + n11] * array3[2 * n60] + field287[2 * n60 + 1 + n11] * array3[2 * n60 + 1];
                field287[n11 - 1 - n60] = field287[2 * n60 + n11] * array3[2 * n60 + 1] - field287[2 * n60 + 1 + n11] * array3[2 * n60];
            }
            for (int n61 = 0; n61 < n12; ++n61) {
                field287[field285 - n12 + n61] = -field287[n61];
            }
            for (int n62 = 0; n62 < n12; ++n62) {
                field287[n62] = field287[n12 + n62];
            }
            for (int n63 = 0; n63 < n12; ++n63) {
                field287[n12 + n63] = -field287[n12 - n63 - 1];
            }
            for (int n64 = 0; n64 < n12; ++n64) {
                field287[n11 + n64] = field287[field285 - n64 - 1];
            }
            for (int n65 = n5; n65 < n6; ++n65) {
                final float n66 = (float)Math.sin((n65 - n5 + 0.5) / n7 * 0.5 * 3.141592653589793);
                final float[] field288 = VorbisSample.field288;
                final int n67 = n65;
                field288[n67] *= (float)Math.sin(1.5707963267948966 * n66 * n66);
            }
            for (int n68 = n8; n68 < n9; ++n68) {
                final float n69 = (float)Math.sin((n68 - n8 + 0.5) / n10 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                final float[] field289 = VorbisSample.field288;
                final int n70 = n68;
                field289[n70] *= (float)Math.sin(1.5707963267948966 * n69 * n69);
            }
        }
        float[] array6 = null;
        if (this.field285 > 0) {
            array6 = new float[this.field285 + field285 >> 2];
            if (!this.field271) {
                for (int n71 = 0; n71 < this.field286; ++n71) {
                    final int n72 = (this.field285 >> 1) + n71;
                    final float[] array7 = array6;
                    final int n73 = n71;
                    array7[n73] += this.field284[n72];
                }
            }
            if (!field286) {
                for (int n74 = n5; n74 < field285 >> 1; ++n74) {
                    final int n75 = array6.length - (field285 >> 1) + n74;
                    final float[] array8 = array6;
                    final int n76 = n75;
                    array8[n76] += VorbisSample.field288[n74];
                }
            }
        }
        final float[] field290 = this.field284;
        this.field284 = VorbisSample.field288;
        VorbisSample.field288 = field290;
        this.field285 = field285;
        this.field286 = n9 - (field285 >> 1);
        this.field271 = field286;
        return array6;
    }
    
    public static RawSound sm(final VorbisSample vorbisSample, final int[] array) {
        if (vorbisSample == null) {
            vorbisSample.toRawSound(array);
        }
        if (array != null && array[0] <= 0) {
            return null;
        }
        if (vorbisSample.samples == null) {
            vorbisSample.field285 = 0;
            vorbisSample.field284 = new float[VorbisSample.VorbisSample_blockSize1];
            vorbisSample.samples = new byte[vorbisSample.sampleCount];
            vorbisSample.field282 = 0;
            vorbisSample.field278 = 0;
        }
        while (vorbisSample.field278 < vorbisSample.field287.length) {
            if (array != null && array[0] <= 0) {
                return null;
            }
            final float[] method318 = vorbisSample.method318(vorbisSample.field278);
            if (method318 != null) {
                int field282 = vorbisSample.field282;
                int length = method318.length;
                if (length > vorbisSample.sampleCount - field282) {
                    length = vorbisSample.sampleCount - field282;
                }
                for (int i = 0; i < length; ++i) {
                    int n = (int)(128.0f + method318[i] * 128.0f);
                    if ((n & 0xFFFFFF00) != 0x0) {
                        n = ~n >> 31;
                    }
                    vorbisSample.samples[field282++] = (byte)(n - 1116598112);
                }
                if (array != null) {
                    final int n2 = 0;
                    array[n2] -= field282 - vorbisSample.field282;
                }
                vorbisSample.field282 = field282;
            }
            ++vorbisSample.field278;
        }
        vorbisSample.field284 = null;
        final byte[] samples = vorbisSample.samples;
        vorbisSample.samples = null;
        return new RawSound(vorbisSample.sampleRate, samples, vorbisSample.start, vorbisSample.end, vorbisSample.field275);
    }
    
    static float ao(final int n) {
        int n2 = n & 0x1FFFFF;
        final int n3 = n & Integer.MIN_VALUE;
        final int n4 = (n & 0x7FE00000) >> 21;
        if (n3 != 0) {
            n2 = -n2;
        }
        return (float)(n2 * Math.pow(2.0, n4 - 788));
    }
    
    static VorbisSample readMusicSample(final AbstractArchive abstractArchive, final int n, final int n2) {
        if (!method314(abstractArchive)) {
            abstractArchive.tryLoadFile(n, n2, (byte)46);
            return null;
        }
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-126));
        if (takeFile == null) {
            return null;
        }
        return new VorbisSample(takeFile);
    }
    
    static void ak(final byte[] array) {
        VorbisSample_setData(array, 0);
        VorbisSample.VorbisSample_blockSize0 = 1 << readBits(4);
        VorbisSample.VorbisSample_blockSize1 = 1 << readBits(4);
        VorbisSample.field288 = new float[VorbisSample.VorbisSample_blockSize1];
        for (int i = 0; i < 2; ++i) {
            final int n = (i != 0) ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
            final int n2 = n >> 1;
            final int n3 = n >> 2;
            final int n4 = n >> 3;
            final float[] array2 = new float[n2];
            for (int j = 0; j < n3; ++j) {
                array2[2 * j] = (float)Math.cos(4 * j * 3.141592653589793 / n);
                array2[2 * j + 1] = -(float)Math.sin(4 * j * 3.141592653589793 / n);
            }
            final float[] array3 = new float[n2];
            for (int k = 0; k < n3; ++k) {
                array3[2 * k] = (float)Math.cos((2 * k + 1) * 3.141592653589793 / (2 * n));
                array3[2 * k + 1] = (float)Math.sin((2 * k + 1) * 3.141592653589793 / (2 * n));
            }
            final float[] array4 = new float[n3];
            for (int l = 0; l < n4; ++l) {
                array4[2 * l] = (float)Math.cos((4 * l + 2) * 3.141592653589793 / n);
                array4[2 * l + 1] = -(float)Math.sin((4 * l + 2) * 3.141592653589793 / n);
            }
            final int[] array5 = new int[n4];
            final int iLog = LoginPacket.iLog(n4 - 1, -1772960055);
            for (int n5 = 0; n5 < n4; ++n5) {
                final int[] array6 = array5;
                final int n6 = n5;
                int n7 = n5;
                int n8 = iLog;
                int n9 = 0;
                while (n8 > 0) {
                    n9 = (n9 << 1 | (n7 & 0x1));
                    n7 >>>= 1;
                    --n8;
                }
                array6[n6] = n9;
            }
            if (i != 0) {
                VorbisSample.field281 = array2;
                VorbisSample.field293 = array3;
                VorbisSample.field294 = array4;
                VorbisSample.field296 = array5;
            }
            else {
                VorbisSample.field299 = array2;
                VorbisSample.field290 = array3;
                VorbisSample.field291 = array4;
                VorbisSample.field295 = array5;
            }
        }
        final int n10 = readBits(8) + 1;
        VorbisSample.VorbisSample_codebooks = new VorbisCodebook[n10];
        for (int n11 = 0; n11 < n10; ++n11) {
            VorbisSample.VorbisSample_codebooks[n11] = new VorbisCodebook();
        }
        for (int n12 = readBits(6) + 1, n13 = 0; n13 < n12; ++n13) {
            readBits(16);
        }
        final int n14 = readBits(6) + 1;
        VorbisSample.VorbisSample_floors = new VorbisFloor[n14];
        for (int n15 = 0; n15 < n14; ++n15) {
            VorbisSample.VorbisSample_floors[n15] = new VorbisFloor();
        }
        final int n16 = readBits(6) + 1;
        VorbisSample.VorbisSample_residues = new VorbisResidue[n16];
        for (int n17 = 0; n17 < n16; ++n17) {
            VorbisSample.VorbisSample_residues[n17] = new VorbisResidue();
        }
        final int n18 = readBits(6) + 1;
        VorbisSample.VorbisSample_mappings = new VorbisMapping[n18];
        for (int n19 = 0; n19 < n18; ++n19) {
            VorbisSample.VorbisSample_mappings[n19] = new VorbisMapping();
        }
        final int n20 = readBits(6) + 1;
        VorbisSample.VorbisSample_blockFlags = new boolean[n20];
        VorbisSample.VorbisSample_mapping = new int[n20];
        for (int n21 = 0; n21 < n20; ++n21) {
            VorbisSample.VorbisSample_blockFlags[n21] = (readBit() != 0);
            readBits(16);
            readBits(16);
            VorbisSample.VorbisSample_mapping[n21] = readBits(8);
        }
    }
    
    void av(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        this.sampleRate = buffer.readInt(-1021632006);
        this.sampleCount = buffer.readInt(-1199208279);
        this.start = buffer.readInt(-1880682183);
        this.end = buffer.readInt(-1821880870);
        if (this.end < 0) {
            this.end ^= -1;
            this.field275 = true;
        }
        final int int1 = buffer.readInt(-1203089563);
        this.field287 = new byte[int1][];
        for (int i = 0; i < int1; ++i) {
            int n = 0;
            int j;
            do {
                j = Buffer.ra(buffer, (byte)7);
                n += j;
            } while (j >= -377387858);
            final byte[] array2 = new byte[n];
            Buffer.io(buffer, array2, 0, n, -1570744551);
            this.field287[i] = array2;
        }
    }
    
    static VorbisSample be(final AbstractArchive abstractArchive, final int n, final int n2) {
        if (!method314(abstractArchive)) {
            abstractArchive.tryLoadFile(n, n2, (byte)101);
            return null;
        }
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-120));
        if (takeFile == null) {
            return null;
        }
        return new VorbisSample(takeFile);
    }
    
    static void as(final byte[] array) {
        VorbisSample_setData(array, 0);
        VorbisSample.VorbisSample_blockSize0 = 1 << readBits(4);
        VorbisSample.VorbisSample_blockSize1 = 1 << readBits(4);
        VorbisSample.field288 = new float[VorbisSample.VorbisSample_blockSize1];
        for (int i = 0; i < 2; ++i) {
            final int n = (i != 0) ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
            final int n2 = n >> 1;
            final int n3 = n >> 2;
            final int n4 = n >> 3;
            final float[] array2 = new float[n2];
            for (int j = 0; j < n3; ++j) {
                array2[2 * j] = (float)Math.cos(4 * j * 3.141592653589793 / n);
                array2[2 * j + 1] = -(float)Math.sin(4 * j * 3.141592653589793 / n);
            }
            final float[] array3 = new float[n2];
            for (int k = 0; k < n3; ++k) {
                array3[2 * k] = (float)Math.cos((2 * k + 1) * 3.141592653589793 / (2 * n));
                array3[2 * k + 1] = (float)Math.sin((2 * k + 1) * 3.141592653589793 / (2 * n));
            }
            final float[] array4 = new float[n3];
            for (int l = 0; l < n4; ++l) {
                array4[2 * l] = (float)Math.cos((4 * l + 2) * 3.141592653589793 / n);
                array4[2 * l + 1] = -(float)Math.sin((4 * l + 2) * 3.141592653589793 / n);
            }
            final int[] array5 = new int[n4];
            final int iLog = LoginPacket.iLog(n4 - 1, -1726684339);
            for (int n5 = 0; n5 < n4; ++n5) {
                final int[] array6 = array5;
                final int n6 = n5;
                int n7 = n5;
                int n8 = iLog;
                int n9 = 0;
                while (n8 > 0) {
                    n9 = (n9 << 1 | (n7 & 0x1));
                    n7 >>>= 1;
                    --n8;
                }
                array6[n6] = n9;
            }
            if (i != 0) {
                VorbisSample.field281 = array2;
                VorbisSample.field293 = array3;
                VorbisSample.field294 = array4;
                VorbisSample.field296 = array5;
            }
            else {
                VorbisSample.field299 = array2;
                VorbisSample.field290 = array3;
                VorbisSample.field291 = array4;
                VorbisSample.field295 = array5;
            }
        }
        final int n10 = readBits(8) + 1;
        VorbisSample.VorbisSample_codebooks = new VorbisCodebook[n10];
        for (int n11 = 0; n11 < n10; ++n11) {
            VorbisSample.VorbisSample_codebooks[n11] = new VorbisCodebook();
        }
        for (int n12 = readBits(6) + 1, n13 = 0; n13 < n12; ++n13) {
            readBits(16);
        }
        final int n14 = readBits(6) + 1;
        VorbisSample.VorbisSample_floors = new VorbisFloor[n14];
        for (int n15 = 0; n15 < n14; ++n15) {
            VorbisSample.VorbisSample_floors[n15] = new VorbisFloor();
        }
        final int n16 = readBits(6) + 1;
        VorbisSample.VorbisSample_residues = new VorbisResidue[n16];
        for (int n17 = 0; n17 < n16; ++n17) {
            VorbisSample.VorbisSample_residues[n17] = new VorbisResidue();
        }
        final int n18 = readBits(6) + 1;
        VorbisSample.VorbisSample_mappings = new VorbisMapping[n18];
        for (int n19 = 0; n19 < n18; ++n19) {
            VorbisSample.VorbisSample_mappings[n19] = new VorbisMapping();
        }
        final int n20 = readBits(6) + 1;
        VorbisSample.VorbisSample_blockFlags = new boolean[n20];
        VorbisSample.VorbisSample_mapping = new int[n20];
        for (int n21 = 0; n21 < n20; ++n21) {
            VorbisSample.VorbisSample_blockFlags[n21] = (readBit() != 0);
            readBits(16);
            readBits(16);
            VorbisSample.VorbisSample_mapping[n21] = readBits(8);
        }
    }
    
    static void az(final byte[] array) {
        VorbisSample_setData(array, 0);
        VorbisSample.VorbisSample_blockSize0 = 1 << readBits(4);
        VorbisSample.VorbisSample_blockSize1 = 1 << readBits(4);
        VorbisSample.field288 = new float[VorbisSample.VorbisSample_blockSize1];
        for (int i = 0; i < 2; ++i) {
            final int n = (i != 0) ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
            final int n2 = n >> 1;
            final int n3 = n >> 2;
            final int n4 = n >> 3;
            final float[] array2 = new float[n2];
            for (int j = 0; j < n3; ++j) {
                array2[2 * j] = (float)Math.cos(4 * j * 3.141592653589793 / n);
                array2[2 * j + 1] = -(float)Math.sin(4 * j * 3.141592653589793 / n);
            }
            final float[] array3 = new float[n2];
            for (int k = 0; k < n3; ++k) {
                array3[2 * k] = (float)Math.cos((2 * k + 1) * 3.141592653589793 / (2 * n));
                array3[2 * k + 1] = (float)Math.sin((2 * k + 1) * 3.141592653589793 / (2 * n));
            }
            final float[] array4 = new float[n3];
            for (int l = 0; l < n4; ++l) {
                array4[2 * l] = (float)Math.cos((4 * l + 2) * 3.141592653589793 / n);
                array4[2 * l + 1] = -(float)Math.sin((4 * l + 2) * 3.141592653589793 / n);
            }
            final int[] array5 = new int[n4];
            final int iLog = LoginPacket.iLog(n4 - 1, -626853021);
            for (int n5 = 0; n5 < n4; ++n5) {
                final int[] array6 = array5;
                final int n6 = n5;
                int n7 = n5;
                int n8 = iLog;
                int n9 = 0;
                while (n8 > 0) {
                    n9 = (n9 << 1 | (n7 & 0x1));
                    n7 >>>= 1;
                    --n8;
                }
                array6[n6] = n9;
            }
            if (i != 0) {
                VorbisSample.field281 = array2;
                VorbisSample.field293 = array3;
                VorbisSample.field294 = array4;
                VorbisSample.field296 = array5;
            }
            else {
                VorbisSample.field299 = array2;
                VorbisSample.field290 = array3;
                VorbisSample.field291 = array4;
                VorbisSample.field295 = array5;
            }
        }
        final int n10 = readBits(8) + 1;
        VorbisSample.VorbisSample_codebooks = new VorbisCodebook[n10];
        for (int n11 = 0; n11 < n10; ++n11) {
            VorbisSample.VorbisSample_codebooks[n11] = new VorbisCodebook();
        }
        for (int n12 = readBits(6) + 1, n13 = 0; n13 < n12; ++n13) {
            readBits(16);
        }
        final int n14 = readBits(6) + 1;
        VorbisSample.VorbisSample_floors = new VorbisFloor[n14];
        for (int n15 = 0; n15 < n14; ++n15) {
            VorbisSample.VorbisSample_floors[n15] = new VorbisFloor();
        }
        final int n16 = readBits(6) + 1;
        VorbisSample.VorbisSample_residues = new VorbisResidue[n16];
        for (int n17 = 0; n17 < n16; ++n17) {
            VorbisSample.VorbisSample_residues[n17] = new VorbisResidue();
        }
        final int n18 = readBits(6) + 1;
        VorbisSample.VorbisSample_mappings = new VorbisMapping[n18];
        for (int n19 = 0; n19 < n18; ++n19) {
            VorbisSample.VorbisSample_mappings[n19] = new VorbisMapping();
        }
        final int n20 = readBits(6) + 1;
        VorbisSample.VorbisSample_blockFlags = new boolean[n20];
        VorbisSample.VorbisSample_mapping = new int[n20];
        for (int n21 = 0; n21 < n20; ++n21) {
            VorbisSample.VorbisSample_blockFlags[n21] = (readBit() != 0);
            readBits(16);
            readBits(16);
            VorbisSample.VorbisSample_mapping[n21] = readBits(8);
        }
    }
    
    static float ax(final int n) {
        int n2 = n & 0x1FFFFF;
        final int n3 = n & Integer.MIN_VALUE;
        final int n4 = (n & 0x7FE00000) >> 21;
        if (n3 != 0) {
            n2 = -n2;
        }
        return (float)(n2 * Math.pow(2.0, n4 - 788));
    }
    
    static float ay(final int n) {
        int n2 = n & 0x1FFFFF;
        final int n3 = n & Integer.MIN_VALUE;
        final int n4 = (n & 0x5D1E0310) >> 21;
        if (n3 != 0) {
            n2 = -n2;
        }
        return (float)(n2 * Math.pow(2.0, n4 + 504469198));
    }
    
    static boolean bi(final AbstractArchive abstractArchive) {
        if (!VorbisSample.field268) {
            final byte[] takeFile = abstractArchive.takeFile(0, 0, (byte)(-81));
            if (takeFile == null) {
                return false;
            }
            method317(takeFile);
            VorbisSample.field268 = true;
        }
        return true;
    }
    
    RawSound bo(final int[] array) {
        if (array != null && array[0] <= 0) {
            return null;
        }
        if (this.samples == null) {
            this.field285 = 0;
            this.field284 = new float[VorbisSample.VorbisSample_blockSize1];
            this.samples = new byte[this.sampleCount];
            this.field282 = 0;
            this.field278 = 0;
        }
        while (this.field278 < this.field287.length) {
            if (array != null && array[0] <= 0) {
                return null;
            }
            final float[] method318 = this.method318(this.field278);
            if (method318 != null) {
                int field282 = this.field282;
                int length = method318.length;
                if (length > this.sampleCount - field282) {
                    length = this.sampleCount - field282;
                }
                for (int i = 0; i < length; ++i) {
                    int n = (int)(128.0f + method318[i] * 128.0f);
                    if ((n & 0xE8B5F552) != 0x0) {
                        n = ~n >> 1195186964;
                    }
                    this.samples[field282++] = (byte)(n - 776108907);
                }
                if (array != null) {
                    final int n2 = 0;
                    array[n2] -= field282 - this.field282;
                }
                this.field282 = field282;
            }
            ++this.field278;
        }
        this.field284 = null;
        final byte[] samples = this.samples;
        this.samples = null;
        return new RawSound(this.sampleRate, samples, this.start, this.end, this.field275);
    }
    
    public static float[] td(final VorbisSample vorbisSample, final int n) {
        VorbisSample_setData(vorbisSample.field287[n], 0);
        readBit();
        final int bits = readBits(LoginPacket.iLog(VorbisSample.VorbisSample_mapping.length - 1, -1009621460));
        final boolean b = VorbisSample.VorbisSample_blockFlags[bits];
        final int field285 = b ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
        int n2 = 0;
        int n3 = 0;
        if (b) {
            n2 = ((readBit() != 0) ? 1 : 0);
            n3 = ((readBit() != 0) ? 1 : 0);
        }
        final int n4 = field285 >> 1;
        int n5;
        int n6;
        int n7;
        if (b && n2 == 0) {
            n5 = (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n6 = (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n7 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n5 = 0;
            n6 = n4;
            n7 = field285 >> 1;
        }
        int n8;
        int n9;
        int n10;
        if (b && n3 == 0) {
            n8 = field285 - (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n9 = field285 - (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n10 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n8 = n4;
            n9 = field285;
            n10 = field285 >> 1;
        }
        final VorbisMapping vorbisMapping = VorbisSample.VorbisSample_mappings[VorbisSample.VorbisSample_mapping[bits]];
        final boolean b2;
        final boolean field286 = b2 = !VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].readSubmapFloor();
        for (int i = 0; i < vorbisMapping.submaps; ++i) {
            VorbisSample.VorbisSample_residues[vorbisMapping.submapFloor[i]].method254(VorbisSample.field288, field285 >> 1, b2);
        }
        if (!field286) {
            VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].method225(VorbisSample.field288, field285 >> 1);
        }
        if (field286) {
            for (int j = field285 >> 1; j < field285; ++j) {
                VorbisSample.field288[j] = 0.0f;
            }
        }
        else {
            final int n11 = field285 >> 1;
            final int n12 = field285 >> 2;
            final int n13 = field285 >> 3;
            final float[] field287 = VorbisSample.field288;
            for (int k = 0; k < n11; ++k) {
                final float[] array = field287;
                final int n14 = k;
                array[n14] *= 0.5f;
            }
            for (int l = n11; l < field285; ++l) {
                field287[l] = -field287[field285 - l - 1];
            }
            final float[] array2 = b ? VorbisSample.field281 : VorbisSample.field299;
            final float[] array3 = b ? VorbisSample.field293 : VorbisSample.field290;
            final float[] array4 = b ? VorbisSample.field294 : VorbisSample.field291;
            final int[] array5 = b ? VorbisSample.field296 : VorbisSample.field295;
            for (int n15 = 0; n15 < n12; ++n15) {
                final float n16 = field287[4 * n15] - field287[field285 - 4 * n15 - 1];
                final float n17 = field287[4 * n15 + 2] - field287[field285 - 4 * n15 - 3];
                final float n18 = array2[2 * n15];
                final float n19 = array2[2 * n15 + 1];
                field287[field285 - 4 * n15 - 1] = n16 * n18 - n17 * n19;
                field287[field285 - 4 * n15 - 3] = n16 * n19 + n17 * n18;
            }
            for (int n20 = 0; n20 < n13; ++n20) {
                final float n21 = field287[n11 + 3 + 4 * n20];
                final float n22 = field287[n11 + 1 + 4 * n20];
                final float n23 = field287[4 * n20 + 3];
                final float n24 = field287[4 * n20 + 1];
                field287[n11 + 3 + 4 * n20] = n21 + n23;
                field287[n11 + 1 + 4 * n20] = n22 + n24;
                final float n25 = array2[n11 - 4 - 4 * n20];
                final float n26 = array2[n11 - 3 - 4 * n20];
                field287[4 * n20 + 3] = (n21 - n23) * n25 - (n22 - n24) * n26;
                field287[4 * n20 + 1] = (n22 - n24) * n25 + (n21 - n23) * n26;
            }
            for (int iLog = LoginPacket.iLog(field285 - 1, -1366133364), n27 = 0; n27 < iLog - 3; ++n27) {
                final int n28 = field285 >> n27 + 2;
                final int n29 = 8 << n27;
                for (int n30 = 0; n30 < 2 << n27; ++n30) {
                    final int n31 = field285 - n28 * 2 * n30;
                    final int n32 = field285 - n28 * (2 * n30 + 1);
                    for (int n33 = 0; n33 < field285 >> n27 + 4; ++n33) {
                        final int n34 = 4 * n33;
                        final float n35 = field287[n31 - 1 - n34];
                        final float n36 = field287[n31 - 3 - n34];
                        final float n37 = field287[n32 - 1 - n34];
                        final float n38 = field287[n32 - 3 - n34];
                        field287[n31 - 1 - n34] = n35 + n37;
                        field287[n31 - 3 - n34] = n36 + n38;
                        final float n39 = array2[n33 * n29];
                        final float n40 = array2[n33 * n29 + 1];
                        field287[n32 - 1 - n34] = (n35 - n37) * n39 - (n36 - n38) * n40;
                        field287[n32 - 3 - n34] = (n36 - n38) * n39 + (n35 - n37) * n40;
                    }
                }
            }
            for (int n41 = 1; n41 < n13 - 1; ++n41) {
                final int n42 = array5[n41];
                if (n41 < n42) {
                    final int n43 = 8 * n41;
                    final int n44 = 8 * n42;
                    final float n45 = field287[n43 + 1];
                    field287[n43 + 1] = field287[n44 + 1];
                    field287[n44 + 1] = n45;
                    final float n46 = field287[n43 + 3];
                    field287[n43 + 3] = field287[n44 + 3];
                    field287[n44 + 3] = n46;
                    final float n47 = field287[n43 + 5];
                    field287[n43 + 5] = field287[n44 + 5];
                    field287[n44 + 5] = n47;
                    final float n48 = field287[n43 + 7];
                    field287[n43 + 7] = field287[n44 + 7];
                    field287[n44 + 7] = n48;
                }
            }
            for (int n49 = 0; n49 < n11; ++n49) {
                field287[n49] = field287[2 * n49 + 1];
            }
            for (int n50 = 0; n50 < n13; ++n50) {
                field287[field285 - 1 - 2 * n50] = field287[4 * n50];
                field287[field285 - 2 - 2 * n50] = field287[4 * n50 + 1];
                field287[field285 - n12 - 1 - 2 * n50] = field287[4 * n50 + 2];
                field287[field285 - n12 - 2 - 2 * n50] = field287[4 * n50 + 3];
            }
            for (int n51 = 0; n51 < n13; ++n51) {
                final float n52 = array4[2 * n51];
                final float n53 = array4[2 * n51 + 1];
                final float n54 = field287[n11 + 2 * n51];
                final float n55 = field287[n11 + 2 * n51 + 1];
                final float n56 = field287[field285 - 2 - 2 * n51];
                final float n57 = field287[field285 - 1 - 2 * n51];
                final float n58 = n53 * (n54 - n56) + n52 * (n55 + n57);
                field287[n11 + 2 * n51] = (n54 + n56 + n58) * 0.5f;
                field287[field285 - 2 - 2 * n51] = (n54 + n56 - n58) * 0.5f;
                final float n59 = n53 * (n55 + n57) - n52 * (n54 - n56);
                field287[n11 + 2 * n51 + 1] = (n55 - n57 + n59) * 0.5f;
                field287[field285 - 1 - 2 * n51] = (-n55 + n57 + n59) * 0.5f;
            }
            for (int n60 = 0; n60 < n12; ++n60) {
                field287[n60] = field287[2 * n60 + n11] * array3[2 * n60] + field287[2 * n60 + 1 + n11] * array3[2 * n60 + 1];
                field287[n11 - 1 - n60] = field287[2 * n60 + n11] * array3[2 * n60 + 1] - field287[2 * n60 + 1 + n11] * array3[2 * n60];
            }
            for (int n61 = 0; n61 < n12; ++n61) {
                field287[field285 - n12 + n61] = -field287[n61];
            }
            for (int n62 = 0; n62 < n12; ++n62) {
                field287[n62] = field287[n12 + n62];
            }
            for (int n63 = 0; n63 < n12; ++n63) {
                field287[n12 + n63] = -field287[n12 - n63 - 1];
            }
            for (int n64 = 0; n64 < n12; ++n64) {
                field287[n11 + n64] = field287[field285 - n64 - 1];
            }
            for (int n65 = n5; n65 < n6; ++n65) {
                final float n66 = (float)Math.sin((n65 - n5 + 0.5) / n7 * 0.5 * 3.141592653589793);
                final float[] field288 = VorbisSample.field288;
                final int n67 = n65;
                field288[n67] *= (float)Math.sin(1.5707963267948966 * n66 * n66);
            }
            for (int n68 = n8; n68 < n9; ++n68) {
                final float n69 = (float)Math.sin((n68 - n8 + 0.5) / n10 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                final float[] field289 = VorbisSample.field288;
                final int n70 = n68;
                field289[n70] *= (float)Math.sin(1.5707963267948966 * n69 * n69);
            }
        }
        float[] array6 = null;
        if (vorbisSample.field285 > 0) {
            array6 = new float[vorbisSample.field285 + field285 >> 2];
            if (!vorbisSample.field271) {
                for (int n71 = 0; n71 < vorbisSample.field286; ++n71) {
                    final int n72 = (vorbisSample.field285 >> 1) + n71;
                    final float[] array7 = array6;
                    final int n73 = n71;
                    array7[n73] += vorbisSample.field284[n72];
                }
            }
            if (!field286) {
                for (int n74 = n5; n74 < field285 >> 1; ++n74) {
                    final int n75 = array6.length - (field285 >> 1) + n74;
                    final float[] array8 = array6;
                    final int n76 = n75;
                    array8[n76] += VorbisSample.field288[n74];
                }
            }
        }
        final float[] field290 = vorbisSample.field284;
        vorbisSample.field284 = VorbisSample.field288;
        VorbisSample.field288 = field290;
        vorbisSample.field285 = field285;
        vorbisSample.field286 = n9 - (field285 >> 1);
        vorbisSample.field271 = field286;
        return array6;
    }
    
    public static float[] ia(final VorbisSample vorbisSample, final int n) {
        VorbisSample_setData(vorbisSample.field287[n], 0);
        readBit();
        final int bits = readBits(LoginPacket.iLog(VorbisSample.VorbisSample_mapping.length - 1, -1337992960));
        final boolean b = VorbisSample.VorbisSample_blockFlags[bits];
        final int field285 = b ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
        int n2 = 0;
        int n3 = 0;
        if (b) {
            n2 = ((readBit() != 0) ? 1 : 0);
            n3 = ((readBit() != 0) ? 1 : 0);
        }
        final int n4 = field285 >> 1;
        int n5;
        int n6;
        int n7;
        if (b && n2 == 0) {
            n5 = (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n6 = (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n7 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n5 = 0;
            n6 = n4;
            n7 = field285 >> 1;
        }
        int n8;
        int n9;
        int n10;
        if (b && n3 == 0) {
            n8 = field285 - (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n9 = field285 - (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n10 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n8 = n4;
            n9 = field285;
            n10 = field285 >> 1;
        }
        final VorbisMapping vorbisMapping = VorbisSample.VorbisSample_mappings[VorbisSample.VorbisSample_mapping[bits]];
        final boolean b2;
        final boolean field286 = b2 = !VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].readSubmapFloor();
        for (int i = 0; i < vorbisMapping.submaps; ++i) {
            VorbisSample.VorbisSample_residues[vorbisMapping.submapFloor[i]].method254(VorbisSample.field288, field285 >> 1, b2);
        }
        if (!field286) {
            VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].method225(VorbisSample.field288, field285 >> 1);
        }
        if (field286) {
            for (int j = field285 >> 1; j < field285; ++j) {
                VorbisSample.field288[j] = 0.0f;
            }
        }
        else {
            final int n11 = field285 >> 1;
            final int n12 = field285 >> 2;
            final int n13 = field285 >> 3;
            final float[] field287 = VorbisSample.field288;
            for (int k = 0; k < n11; ++k) {
                final float[] array = field287;
                final int n14 = k;
                array[n14] *= 0.5f;
            }
            for (int l = n11; l < field285; ++l) {
                field287[l] = -field287[field285 - l - 1];
            }
            final float[] array2 = b ? VorbisSample.field281 : VorbisSample.field299;
            final float[] array3 = b ? VorbisSample.field293 : VorbisSample.field290;
            final float[] array4 = b ? VorbisSample.field294 : VorbisSample.field291;
            final int[] array5 = b ? VorbisSample.field296 : VorbisSample.field295;
            for (int n15 = 0; n15 < n12; ++n15) {
                final float n16 = field287[4 * n15] - field287[field285 - 4 * n15 - 1];
                final float n17 = field287[4 * n15 + 2] - field287[field285 - 4 * n15 - 3];
                final float n18 = array2[2 * n15];
                final float n19 = array2[2 * n15 + 1];
                field287[field285 - 4 * n15 - 1] = n16 * n18 - n17 * n19;
                field287[field285 - 4 * n15 - 3] = n16 * n19 + n17 * n18;
            }
            for (int n20 = 0; n20 < n13; ++n20) {
                final float n21 = field287[n11 + 3 + 4 * n20];
                final float n22 = field287[n11 + 1 + 4 * n20];
                final float n23 = field287[4 * n20 + 3];
                final float n24 = field287[4 * n20 + 1];
                field287[n11 + 3 + 4 * n20] = n21 + n23;
                field287[n11 + 1 + 4 * n20] = n22 + n24;
                final float n25 = array2[n11 - 4 - 4 * n20];
                final float n26 = array2[n11 - 3 - 4 * n20];
                field287[4 * n20 + 3] = (n21 - n23) * n25 - (n22 - n24) * n26;
                field287[4 * n20 + 1] = (n22 - n24) * n25 + (n21 - n23) * n26;
            }
            for (int iLog = LoginPacket.iLog(field285 - 1, -959765675), n27 = 0; n27 < iLog - 3; ++n27) {
                final int n28 = field285 >> n27 + 2;
                final int n29 = 8 << n27;
                for (int n30 = 0; n30 < 2 << n27; ++n30) {
                    final int n31 = field285 - n28 * 2 * n30;
                    final int n32 = field285 - n28 * (2 * n30 + 1);
                    for (int n33 = 0; n33 < field285 >> n27 + 4; ++n33) {
                        final int n34 = 4 * n33;
                        final float n35 = field287[n31 - 1 - n34];
                        final float n36 = field287[n31 - 3 - n34];
                        final float n37 = field287[n32 - 1 - n34];
                        final float n38 = field287[n32 - 3 - n34];
                        field287[n31 - 1 - n34] = n35 + n37;
                        field287[n31 - 3 - n34] = n36 + n38;
                        final float n39 = array2[n33 * n29];
                        final float n40 = array2[n33 * n29 + 1];
                        field287[n32 - 1 - n34] = (n35 - n37) * n39 - (n36 - n38) * n40;
                        field287[n32 - 3 - n34] = (n36 - n38) * n39 + (n35 - n37) * n40;
                    }
                }
            }
            for (int n41 = 1; n41 < n13 - 1; ++n41) {
                final int n42 = array5[n41];
                if (n41 < n42) {
                    final int n43 = 8 * n41;
                    final int n44 = 8 * n42;
                    final float n45 = field287[n43 + 1];
                    field287[n43 + 1] = field287[n44 + 1];
                    field287[n44 + 1] = n45;
                    final float n46 = field287[n43 + 3];
                    field287[n43 + 3] = field287[n44 + 3];
                    field287[n44 + 3] = n46;
                    final float n47 = field287[n43 + 5];
                    field287[n43 + 5] = field287[n44 + 5];
                    field287[n44 + 5] = n47;
                    final float n48 = field287[n43 + 7];
                    field287[n43 + 7] = field287[n44 + 7];
                    field287[n44 + 7] = n48;
                }
            }
            for (int n49 = 0; n49 < n11; ++n49) {
                field287[n49] = field287[2 * n49 + 1];
            }
            for (int n50 = 0; n50 < n13; ++n50) {
                field287[field285 - 1 - 2 * n50] = field287[4 * n50];
                field287[field285 - 2 - 2 * n50] = field287[4 * n50 + 1];
                field287[field285 - n12 - 1 - 2 * n50] = field287[4 * n50 + 2];
                field287[field285 - n12 - 2 - 2 * n50] = field287[4 * n50 + 3];
            }
            for (int n51 = 0; n51 < n13; ++n51) {
                final float n52 = array4[2 * n51];
                final float n53 = array4[2 * n51 + 1];
                final float n54 = field287[n11 + 2 * n51];
                final float n55 = field287[n11 + 2 * n51 + 1];
                final float n56 = field287[field285 - 2 - 2 * n51];
                final float n57 = field287[field285 - 1 - 2 * n51];
                final float n58 = n53 * (n54 - n56) + n52 * (n55 + n57);
                field287[n11 + 2 * n51] = (n54 + n56 + n58) * 0.5f;
                field287[field285 - 2 - 2 * n51] = (n54 + n56 - n58) * 0.5f;
                final float n59 = n53 * (n55 + n57) - n52 * (n54 - n56);
                field287[n11 + 2 * n51 + 1] = (n55 - n57 + n59) * 0.5f;
                field287[field285 - 1 - 2 * n51] = (-n55 + n57 + n59) * 0.5f;
            }
            for (int n60 = 0; n60 < n12; ++n60) {
                field287[n60] = field287[2 * n60 + n11] * array3[2 * n60] + field287[2 * n60 + 1 + n11] * array3[2 * n60 + 1];
                field287[n11 - 1 - n60] = field287[2 * n60 + n11] * array3[2 * n60 + 1] - field287[2 * n60 + 1 + n11] * array3[2 * n60];
            }
            for (int n61 = 0; n61 < n12; ++n61) {
                field287[field285 - n12 + n61] = -field287[n61];
            }
            for (int n62 = 0; n62 < n12; ++n62) {
                field287[n62] = field287[n12 + n62];
            }
            for (int n63 = 0; n63 < n12; ++n63) {
                field287[n12 + n63] = -field287[n12 - n63 - 1];
            }
            for (int n64 = 0; n64 < n12; ++n64) {
                field287[n11 + n64] = field287[field285 - n64 - 1];
            }
            for (int n65 = n5; n65 < n6; ++n65) {
                final float n66 = (float)Math.sin((n65 - n5 + 0.5) / n7 * 0.5 * 3.141592653589793);
                final float[] field288 = VorbisSample.field288;
                final int n67 = n65;
                field288[n67] *= (float)Math.sin(1.5707963267948966 * n66 * n66);
            }
            for (int n68 = n8; n68 < n9; ++n68) {
                final float n69 = (float)Math.sin((n68 - n8 + 0.5) / n10 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                final float[] field289 = VorbisSample.field288;
                final int n70 = n68;
                field289[n70] *= (float)Math.sin(1.5707963267948966 * n69 * n69);
            }
        }
        float[] array6 = null;
        if (vorbisSample.field285 > 0) {
            array6 = new float[vorbisSample.field285 + field285 >> 2];
            if (!vorbisSample.field271) {
                for (int n71 = 0; n71 < vorbisSample.field286; ++n71) {
                    final int n72 = (vorbisSample.field285 >> 1) + n71;
                    final float[] array7 = array6;
                    final int n73 = n71;
                    array7[n73] += vorbisSample.field284[n72];
                }
            }
            if (!field286) {
                for (int n74 = n5; n74 < field285 >> 1; ++n74) {
                    final int n75 = array6.length - (field285 >> 1) + n74;
                    final float[] array8 = array6;
                    final int n76 = n75;
                    array8[n76] += VorbisSample.field288[n74];
                }
            }
        }
        final float[] field290 = vorbisSample.field284;
        vorbisSample.field284 = VorbisSample.field288;
        VorbisSample.field288 = field290;
        vorbisSample.field285 = field285;
        vorbisSample.field286 = n9 - (field285 >> 1);
        vorbisSample.field271 = field286;
        return array6;
    }
    
    static int readBit() {
        final int n = VorbisSample.VorbisSample_bytes[VorbisSample.VorbisSample_byteOffset] >> VorbisSample.VorbisSample_bitOffset & 0x1;
        ++VorbisSample.VorbisSample_bitOffset;
        VorbisSample.VorbisSample_byteOffset += VorbisSample.VorbisSample_bitOffset >> 3;
        VorbisSample.VorbisSample_bitOffset &= 0x7;
        return n;
    }
    
    void am(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        this.sampleRate = buffer.readInt(-1706341163);
        this.sampleCount = buffer.readInt(-1622875684);
        this.start = buffer.readInt(-1761162550);
        this.end = buffer.readInt(-1914572377);
        if (this.end < 0) {
            this.end ^= -1;
            this.field275 = true;
        }
        final int int1 = buffer.readInt(-1145348177);
        this.field287 = new byte[int1][];
        for (int i = 0; i < int1; ++i) {
            int n = 0;
            int ra;
            do {
                ra = Buffer.ra(buffer, (byte)7);
                n += ra;
            } while (ra >= 255);
            final byte[] array2 = new byte[n];
            Buffer.io(buffer, array2, 0, n, -1570744551);
            this.field287[i] = array2;
        }
    }
    
    static boolean method314(final AbstractArchive abstractArchive) {
        if (!VorbisSample.field268) {
            final byte[] takeFile = abstractArchive.takeFile(0, 0, (byte)(-9));
            if (takeFile == null) {
                return false;
            }
            method317(takeFile);
            VorbisSample.field268 = true;
        }
        return true;
    }
    
    static void VorbisSample_setData(final byte[] vorbisSample_bytes, final int vorbisSample_byteOffset) {
        VorbisSample.VorbisSample_bytes = vorbisSample_bytes;
        VorbisSample.VorbisSample_byteOffset = vorbisSample_byteOffset;
        VorbisSample.VorbisSample_bitOffset = 0;
    }
    
    static int readBits(int i) {
        int n = 0;
        int n2 = 0;
        while (i >= 8 - VorbisSample.VorbisSample_bitOffset) {
            final int n3 = 8 - VorbisSample.VorbisSample_bitOffset;
            n += (VorbisSample.VorbisSample_bytes[VorbisSample.VorbisSample_byteOffset] >> VorbisSample.VorbisSample_bitOffset & (1 << n3) - 1) << n2;
            VorbisSample.VorbisSample_bitOffset = 0;
            ++VorbisSample.VorbisSample_byteOffset;
            n2 += n3;
            i -= n3;
        }
        if (i > 0) {
            n += (VorbisSample.VorbisSample_bytes[VorbisSample.VorbisSample_byteOffset] >> VorbisSample.VorbisSample_bitOffset & (1 << i) - 1) << n2;
            VorbisSample.VorbisSample_bitOffset += i;
        }
        return n;
    }
    
    void read(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        this.sampleRate = buffer.readInt(-1941590229);
        this.sampleCount = buffer.readInt(-1254711391);
        this.start = buffer.readInt(-952362987);
        this.end = buffer.readInt(-1384430098);
        if (this.end < 0) {
            this.end ^= -1;
            this.field275 = true;
        }
        final int int1 = buffer.readInt(-1788044424);
        this.field287 = new byte[int1][];
        for (int i = 0; i < int1; ++i) {
            int n = 0;
            int j;
            do {
                j = Buffer.ra(buffer, (byte)7);
                n += j;
            } while (j >= 255);
            final byte[] array2 = new byte[n];
            Buffer.io(buffer, array2, 0, n, -1570744551);
            this.field287[i] = array2;
        }
    }
    
    RawSound toRawSound(final int[] array) {
        if (array != null && array[0] <= 0) {
            return null;
        }
        if (this.samples == null) {
            this.field285 = 0;
            this.field284 = new float[VorbisSample.VorbisSample_blockSize1];
            this.samples = new byte[this.sampleCount];
            this.field282 = 0;
            this.field278 = 0;
        }
        while (this.field278 < this.field287.length) {
            if (array != null && array[0] <= 0) {
                return null;
            }
            final float[] method318 = this.method318(this.field278);
            if (method318 != null) {
                int field282 = this.field282;
                int length = method318.length;
                if (length > this.sampleCount - field282) {
                    length = this.sampleCount - field282;
                }
                for (int i = 0; i < length; ++i) {
                    int n = (int)(128.0f + method318[i] * 128.0f);
                    if ((n & 0xFFFFFF00) != 0x0) {
                        n = ~n >> 31;
                    }
                    this.samples[field282++] = (byte)(n - 128);
                }
                if (array != null) {
                    final int n2 = 0;
                    array[n2] -= field282 - this.field282;
                }
                this.field282 = field282;
            }
            ++this.field278;
        }
        this.field284 = null;
        final byte[] samples = this.samples;
        this.samples = null;
        return new RawSound(this.sampleRate, samples, this.start, this.end, this.field275);
    }
    
    static void ai(final byte[] vorbisSample_bytes, final int vorbisSample_byteOffset) {
        VorbisSample.VorbisSample_bytes = vorbisSample_bytes;
        VorbisSample.VorbisSample_byteOffset = vorbisSample_byteOffset;
        VorbisSample.VorbisSample_bitOffset = 0;
    }
    
    float[] by(final int n) {
        VorbisSample_setData(this.field287[n], 0);
        readBit();
        final int bits = readBits(LoginPacket.iLog(VorbisSample.VorbisSample_mapping.length - 1, -1085239022));
        final boolean b = VorbisSample.VorbisSample_blockFlags[bits];
        final int field285 = b ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
        int n2 = 0;
        int n3 = 0;
        if (b) {
            n2 = ((readBit() != 0) ? 1 : 0);
            n3 = ((readBit() != 0) ? 1 : 0);
        }
        final int n4 = field285 >> 1;
        int n5;
        int n6;
        int n7;
        if (b && n2 == 0) {
            n5 = (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n6 = (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n7 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n5 = 0;
            n6 = n4;
            n7 = field285 >> 1;
        }
        int n8;
        int n9;
        int n10;
        if (b && n3 == 0) {
            n8 = field285 - (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n9 = field285 - (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n10 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n8 = n4;
            n9 = field285;
            n10 = field285 >> 1;
        }
        final VorbisMapping vorbisMapping = VorbisSample.VorbisSample_mappings[VorbisSample.VorbisSample_mapping[bits]];
        final boolean b2;
        final boolean field286 = b2 = !VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].readSubmapFloor();
        for (int i = 0; i < vorbisMapping.submaps; ++i) {
            VorbisSample.VorbisSample_residues[vorbisMapping.submapFloor[i]].method254(VorbisSample.field288, field285 >> 1, b2);
        }
        if (!field286) {
            VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].method225(VorbisSample.field288, field285 >> 1);
        }
        if (field286) {
            for (int j = field285 >> 1; j < field285; ++j) {
                VorbisSample.field288[j] = 0.0f;
            }
        }
        else {
            final int n11 = field285 >> 1;
            final int n12 = field285 >> 2;
            final int n13 = field285 >> 3;
            final float[] field287 = VorbisSample.field288;
            for (int k = 0; k < n11; ++k) {
                final float[] array = field287;
                final int n14 = k;
                array[n14] *= 0.5f;
            }
            for (int l = n11; l < field285; ++l) {
                field287[l] = -field287[field285 - l - 1];
            }
            final float[] array2 = b ? VorbisSample.field281 : VorbisSample.field299;
            final float[] array3 = b ? VorbisSample.field293 : VorbisSample.field290;
            final float[] array4 = b ? VorbisSample.field294 : VorbisSample.field291;
            final int[] array5 = b ? VorbisSample.field296 : VorbisSample.field295;
            for (int n15 = 0; n15 < n12; ++n15) {
                final float n16 = field287[4 * n15] - field287[field285 - 4 * n15 - 1];
                final float n17 = field287[4 * n15 + 2] - field287[field285 - 4 * n15 - 3];
                final float n18 = array2[2 * n15];
                final float n19 = array2[2 * n15 + 1];
                field287[field285 - 4 * n15 - 1] = n16 * n18 - n17 * n19;
                field287[field285 - 4 * n15 - 3] = n16 * n19 + n17 * n18;
            }
            for (int n20 = 0; n20 < n13; ++n20) {
                final float n21 = field287[n11 + 3 + 4 * n20];
                final float n22 = field287[n11 + 1 + 4 * n20];
                final float n23 = field287[4 * n20 + 3];
                final float n24 = field287[4 * n20 + 1];
                field287[n11 + 3 + 4 * n20] = n21 + n23;
                field287[n11 + 1 + 4 * n20] = n22 + n24;
                final float n25 = array2[n11 - 4 - 4 * n20];
                final float n26 = array2[n11 - 3 - 4 * n20];
                field287[4 * n20 + 3] = (n21 - n23) * n25 - (n22 - n24) * n26;
                field287[4 * n20 + 1] = (n22 - n24) * n25 + (n21 - n23) * n26;
            }
            for (int iLog = LoginPacket.iLog(field285 - 1, -539574317), n27 = 0; n27 < iLog - 3; ++n27) {
                final int n28 = field285 >> n27 + 2;
                final int n29 = 8 << n27;
                for (int n30 = 0; n30 < 2 << n27; ++n30) {
                    final int n31 = field285 - n28 * 2 * n30;
                    final int n32 = field285 - n28 * (2 * n30 + 1);
                    for (int n33 = 0; n33 < field285 >> n27 + 4; ++n33) {
                        final int n34 = 4 * n33;
                        final float n35 = field287[n31 - 1 - n34];
                        final float n36 = field287[n31 - 3 - n34];
                        final float n37 = field287[n32 - 1 - n34];
                        final float n38 = field287[n32 - 3 - n34];
                        field287[n31 - 1 - n34] = n35 + n37;
                        field287[n31 - 3 - n34] = n36 + n38;
                        final float n39 = array2[n33 * n29];
                        final float n40 = array2[n33 * n29 + 1];
                        field287[n32 - 1 - n34] = (n35 - n37) * n39 - (n36 - n38) * n40;
                        field287[n32 - 3 - n34] = (n36 - n38) * n39 + (n35 - n37) * n40;
                    }
                }
            }
            for (int n41 = 1; n41 < n13 - 1; ++n41) {
                final int n42 = array5[n41];
                if (n41 < n42) {
                    final int n43 = 8 * n41;
                    final int n44 = 8 * n42;
                    final float n45 = field287[n43 + 1];
                    field287[n43 + 1] = field287[n44 + 1];
                    field287[n44 + 1] = n45;
                    final float n46 = field287[n43 + 3];
                    field287[n43 + 3] = field287[n44 + 3];
                    field287[n44 + 3] = n46;
                    final float n47 = field287[n43 + 5];
                    field287[n43 + 5] = field287[n44 + 5];
                    field287[n44 + 5] = n47;
                    final float n48 = field287[n43 + 7];
                    field287[n43 + 7] = field287[n44 + 7];
                    field287[n44 + 7] = n48;
                }
            }
            for (int n49 = 0; n49 < n11; ++n49) {
                field287[n49] = field287[2 * n49 + 1];
            }
            for (int n50 = 0; n50 < n13; ++n50) {
                field287[field285 - 1 - 2 * n50] = field287[4 * n50];
                field287[field285 - 2 - 2 * n50] = field287[4 * n50 + 1];
                field287[field285 - n12 - 1 - 2 * n50] = field287[4 * n50 + 2];
                field287[field285 - n12 - 2 - 2 * n50] = field287[4 * n50 + 3];
            }
            for (int n51 = 0; n51 < n13; ++n51) {
                final float n52 = array4[2 * n51];
                final float n53 = array4[2 * n51 + 1];
                final float n54 = field287[n11 + 2 * n51];
                final float n55 = field287[n11 + 2 * n51 + 1];
                final float n56 = field287[field285 - 2 - 2 * n51];
                final float n57 = field287[field285 - 1 - 2 * n51];
                final float n58 = n53 * (n54 - n56) + n52 * (n55 + n57);
                field287[n11 + 2 * n51] = (n54 + n56 + n58) * 0.5f;
                field287[field285 - 2 - 2 * n51] = (n54 + n56 - n58) * 0.5f;
                final float n59 = n53 * (n55 + n57) - n52 * (n54 - n56);
                field287[n11 + 2 * n51 + 1] = (n55 - n57 + n59) * 0.5f;
                field287[field285 - 1 - 2 * n51] = (-n55 + n57 + n59) * 0.5f;
            }
            for (int n60 = 0; n60 < n12; ++n60) {
                field287[n60] = field287[2 * n60 + n11] * array3[2 * n60] + field287[2 * n60 + 1 + n11] * array3[2 * n60 + 1];
                field287[n11 - 1 - n60] = field287[2 * n60 + n11] * array3[2 * n60 + 1] - field287[2 * n60 + 1 + n11] * array3[2 * n60];
            }
            for (int n61 = 0; n61 < n12; ++n61) {
                field287[field285 - n12 + n61] = -field287[n61];
            }
            for (int n62 = 0; n62 < n12; ++n62) {
                field287[n62] = field287[n12 + n62];
            }
            for (int n63 = 0; n63 < n12; ++n63) {
                field287[n12 + n63] = -field287[n12 - n63 - 1];
            }
            for (int n64 = 0; n64 < n12; ++n64) {
                field287[n11 + n64] = field287[field285 - n64 - 1];
            }
            for (int n65 = n5; n65 < n6; ++n65) {
                final float n66 = (float)Math.sin((n65 - n5 + 0.5) / n7 * 0.5 * 3.141592653589793);
                final float[] field288 = VorbisSample.field288;
                final int n67 = n65;
                field288[n67] *= (float)Math.sin(1.5707963267948966 * n66 * n66);
            }
            for (int n68 = n8; n68 < n9; ++n68) {
                final float n69 = (float)Math.sin((n68 - n8 + 0.5) / n10 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                final float[] field289 = VorbisSample.field288;
                final int n70 = n68;
                field289[n70] *= (float)Math.sin(1.5707963267948966 * n69 * n69);
            }
        }
        float[] array6 = null;
        if (this.field285 > 0) {
            array6 = new float[this.field285 + field285 >> 2];
            if (!this.field271) {
                for (int n71 = 0; n71 < this.field286; ++n71) {
                    final int n72 = (this.field285 >> 1) + n71;
                    final float[] array7 = array6;
                    final int n73 = n71;
                    array7[n73] += this.field284[n72];
                }
            }
            if (!field286) {
                for (int n74 = n5; n74 < field285 >> 1; ++n74) {
                    final int n75 = array6.length - (field285 >> 1) + n74;
                    final float[] array8 = array6;
                    final int n76 = n75;
                    array8[n76] += VorbisSample.field288[n74];
                }
            }
        }
        final float[] field290 = this.field284;
        this.field284 = VorbisSample.field288;
        VorbisSample.field288 = field290;
        this.field285 = field285;
        this.field286 = n9 - (field285 >> 1);
        this.field271 = field286;
        return array6;
    }
    
    RawSound bx(final int[] array) {
        if (array != null && array[0] <= 0) {
            return null;
        }
        if (this.samples == null) {
            this.field285 = 0;
            this.field284 = new float[VorbisSample.VorbisSample_blockSize1];
            this.samples = new byte[this.sampleCount];
            this.field282 = 0;
            this.field278 = 0;
        }
        while (this.field278 < this.field287.length) {
            if (array != null && array[0] <= 0) {
                return null;
            }
            final float[] method318 = this.method318(this.field278);
            if (method318 != null) {
                int field282 = this.field282;
                int length = method318.length;
                if (length > this.sampleCount - field282) {
                    length = this.sampleCount - field282;
                }
                for (int i = 0; i < length; ++i) {
                    int n = (int)(128.0f + method318[i] * 128.0f);
                    if ((n & 0xFFFFFF00) != 0x0) {
                        n = ~n >> 31;
                    }
                    this.samples[field282++] = (byte)(n - 128);
                }
                if (array != null) {
                    final int n2 = 0;
                    array[n2] -= field282 - this.field282;
                }
                this.field282 = field282;
            }
            ++this.field278;
        }
        this.field284 = null;
        final byte[] samples = this.samples;
        this.samples = null;
        return new RawSound(this.sampleRate, samples, this.start, this.end, this.field275);
    }
    
    void ar(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        this.sampleRate = buffer.readInt(-987528001);
        this.sampleCount = buffer.readInt(-1004824106);
        this.start = buffer.readInt(-2117245897);
        this.end = buffer.readInt(-972075505);
        if (this.end < 0) {
            this.end ^= -1;
            this.field275 = true;
        }
        final int int1 = buffer.readInt(-1762020410);
        this.field287 = new byte[int1][];
        for (int i = 0; i < int1; ++i) {
            int n = 0;
            int ra;
            do {
                ra = Buffer.ra(buffer, (byte)7);
                n += ra;
            } while (ra >= 255);
            final byte[] array2 = new byte[n];
            Buffer.io(buffer, array2, 0, n, -1570744551);
            this.field287[i] = array2;
        }
    }
    
    float[] ap(final int n) {
        VorbisSample_setData(this.field287[n], 0);
        readBit();
        final int bits = readBits(LoginPacket.iLog(VorbisSample.VorbisSample_mapping.length - 1, -786114239));
        final boolean b = VorbisSample.VorbisSample_blockFlags[bits];
        final int field285 = b ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
        int n2 = 0;
        int n3 = 0;
        if (b) {
            n2 = ((readBit() != 0) ? 1 : 0);
            n3 = ((readBit() != 0) ? 1 : 0);
        }
        final int n4 = field285 >> 1;
        int n5;
        int n6;
        int n7;
        if (b && n2 == 0) {
            n5 = (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n6 = (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n7 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n5 = 0;
            n6 = n4;
            n7 = field285 >> 1;
        }
        int n8;
        int n9;
        int n10;
        if (b && n3 == 0) {
            n8 = field285 - (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n9 = field285 - (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n10 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n8 = n4;
            n9 = field285;
            n10 = field285 >> 1;
        }
        final VorbisMapping vorbisMapping = VorbisSample.VorbisSample_mappings[VorbisSample.VorbisSample_mapping[bits]];
        final boolean b2;
        final boolean field286 = b2 = !VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].readSubmapFloor();
        for (int i = 0; i < vorbisMapping.submaps; ++i) {
            VorbisSample.VorbisSample_residues[vorbisMapping.submapFloor[i]].method254(VorbisSample.field288, field285 >> 1, b2);
        }
        if (!field286) {
            VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].method225(VorbisSample.field288, field285 >> 1);
        }
        if (field286) {
            for (int j = field285 >> 1; j < field285; ++j) {
                VorbisSample.field288[j] = 0.0f;
            }
        }
        else {
            final int n11 = field285 >> 1;
            final int n12 = field285 >> 2;
            final int n13 = field285 >> 3;
            final float[] field287 = VorbisSample.field288;
            for (int k = 0; k < n11; ++k) {
                final float[] array = field287;
                final int n14 = k;
                array[n14] *= 0.5f;
            }
            for (int l = n11; l < field285; ++l) {
                field287[l] = -field287[field285 - l - 1];
            }
            final float[] array2 = b ? VorbisSample.field281 : VorbisSample.field299;
            final float[] array3 = b ? VorbisSample.field293 : VorbisSample.field290;
            final float[] array4 = b ? VorbisSample.field294 : VorbisSample.field291;
            final int[] array5 = b ? VorbisSample.field296 : VorbisSample.field295;
            for (int n15 = 0; n15 < n12; ++n15) {
                final float n16 = field287[4 * n15] - field287[field285 - 4 * n15 - 1];
                final float n17 = field287[4 * n15 + 2] - field287[field285 - 4 * n15 - 3];
                final float n18 = array2[2 * n15];
                final float n19 = array2[2 * n15 + 1];
                field287[field285 - 4 * n15 - 1] = n16 * n18 - n17 * n19;
                field287[field285 - 4 * n15 - 3] = n16 * n19 + n17 * n18;
            }
            for (int n20 = 0; n20 < n13; ++n20) {
                final float n21 = field287[n11 + 3 + 4 * n20];
                final float n22 = field287[n11 + 1 + 4 * n20];
                final float n23 = field287[4 * n20 + 3];
                final float n24 = field287[4 * n20 + 1];
                field287[n11 + 3 + 4 * n20] = n21 + n23;
                field287[n11 + 1 + 4 * n20] = n22 + n24;
                final float n25 = array2[n11 - 4 - 4 * n20];
                final float n26 = array2[n11 - 3 - 4 * n20];
                field287[4 * n20 + 3] = (n21 - n23) * n25 - (n22 - n24) * n26;
                field287[4 * n20 + 1] = (n22 - n24) * n25 + (n21 - n23) * n26;
            }
            for (int iLog = LoginPacket.iLog(field285 - 1, -290143060), n27 = 0; n27 < iLog - 3; ++n27) {
                final int n28 = field285 >> n27 + 2;
                final int n29 = 8 << n27;
                for (int n30 = 0; n30 < 2 << n27; ++n30) {
                    final int n31 = field285 - n28 * 2 * n30;
                    final int n32 = field285 - n28 * (2 * n30 + 1);
                    for (int n33 = 0; n33 < field285 >> n27 + 4; ++n33) {
                        final int n34 = 4 * n33;
                        final float n35 = field287[n31 - 1 - n34];
                        final float n36 = field287[n31 - 3 - n34];
                        final float n37 = field287[n32 - 1 - n34];
                        final float n38 = field287[n32 - 3 - n34];
                        field287[n31 - 1 - n34] = n35 + n37;
                        field287[n31 - 3 - n34] = n36 + n38;
                        final float n39 = array2[n33 * n29];
                        final float n40 = array2[n33 * n29 + 1];
                        field287[n32 - 1 - n34] = (n35 - n37) * n39 - (n36 - n38) * n40;
                        field287[n32 - 3 - n34] = (n36 - n38) * n39 + (n35 - n37) * n40;
                    }
                }
            }
            for (int n41 = 1; n41 < n13 - 1; ++n41) {
                final int n42 = array5[n41];
                if (n41 < n42) {
                    final int n43 = 8 * n41;
                    final int n44 = 8 * n42;
                    final float n45 = field287[n43 + 1];
                    field287[n43 + 1] = field287[n44 + 1];
                    field287[n44 + 1] = n45;
                    final float n46 = field287[n43 + 3];
                    field287[n43 + 3] = field287[n44 + 3];
                    field287[n44 + 3] = n46;
                    final float n47 = field287[n43 + 5];
                    field287[n43 + 5] = field287[n44 + 5];
                    field287[n44 + 5] = n47;
                    final float n48 = field287[n43 + 7];
                    field287[n43 + 7] = field287[n44 + 7];
                    field287[n44 + 7] = n48;
                }
            }
            for (int n49 = 0; n49 < n11; ++n49) {
                field287[n49] = field287[2 * n49 + 1];
            }
            for (int n50 = 0; n50 < n13; ++n50) {
                field287[field285 - 1 - 2 * n50] = field287[4 * n50];
                field287[field285 - 2 - 2 * n50] = field287[4 * n50 + 1];
                field287[field285 - n12 - 1 - 2 * n50] = field287[4 * n50 + 2];
                field287[field285 - n12 - 2 - 2 * n50] = field287[4 * n50 + 3];
            }
            for (int n51 = 0; n51 < n13; ++n51) {
                final float n52 = array4[2 * n51];
                final float n53 = array4[2 * n51 + 1];
                final float n54 = field287[n11 + 2 * n51];
                final float n55 = field287[n11 + 2 * n51 + 1];
                final float n56 = field287[field285 - 2 - 2 * n51];
                final float n57 = field287[field285 - 1 - 2 * n51];
                final float n58 = n53 * (n54 - n56) + n52 * (n55 + n57);
                field287[n11 + 2 * n51] = (n54 + n56 + n58) * 0.5f;
                field287[field285 - 2 - 2 * n51] = (n54 + n56 - n58) * 0.5f;
                final float n59 = n53 * (n55 + n57) - n52 * (n54 - n56);
                field287[n11 + 2 * n51 + 1] = (n55 - n57 + n59) * 0.5f;
                field287[field285 - 1 - 2 * n51] = (-n55 + n57 + n59) * 0.5f;
            }
            for (int n60 = 0; n60 < n12; ++n60) {
                field287[n60] = field287[2 * n60 + n11] * array3[2 * n60] + field287[2 * n60 + 1 + n11] * array3[2 * n60 + 1];
                field287[n11 - 1 - n60] = field287[2 * n60 + n11] * array3[2 * n60 + 1] - field287[2 * n60 + 1 + n11] * array3[2 * n60];
            }
            for (int n61 = 0; n61 < n12; ++n61) {
                field287[field285 - n12 + n61] = -field287[n61];
            }
            for (int n62 = 0; n62 < n12; ++n62) {
                field287[n62] = field287[n12 + n62];
            }
            for (int n63 = 0; n63 < n12; ++n63) {
                field287[n12 + n63] = -field287[n12 - n63 - 1];
            }
            for (int n64 = 0; n64 < n12; ++n64) {
                field287[n11 + n64] = field287[field285 - n64 - 1];
            }
            for (int n65 = n5; n65 < n6; ++n65) {
                final float n66 = (float)Math.sin((n65 - n5 + 0.5) / n7 * 0.5 * 3.141592653589793);
                final float[] field288 = VorbisSample.field288;
                final int n67 = n65;
                field288[n67] *= (float)Math.sin(1.5707963267948966 * n66 * n66);
            }
            for (int n68 = n8; n68 < n9; ++n68) {
                final float n69 = (float)Math.sin((n68 - n8 + 0.5) / n10 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                final float[] field289 = VorbisSample.field288;
                final int n70 = n68;
                field289[n70] *= (float)Math.sin(1.5707963267948966 * n69 * n69);
            }
        }
        float[] array6 = null;
        if (this.field285 > 0) {
            array6 = new float[this.field285 + field285 >> 2];
            if (!this.field271) {
                for (int n71 = 0; n71 < this.field286; ++n71) {
                    final int n72 = (this.field285 >> 1) + n71;
                    final float[] array7 = array6;
                    final int n73 = n71;
                    array7[n73] += this.field284[n72];
                }
            }
            if (!field286) {
                for (int n74 = n5; n74 < field285 >> 1; ++n74) {
                    final int n75 = array6.length - (field285 >> 1) + n74;
                    final float[] array8 = array6;
                    final int n76 = n75;
                    array8[n76] += VorbisSample.field288[n74];
                }
            }
        }
        final float[] field290 = this.field284;
        this.field284 = VorbisSample.field288;
        VorbisSample.field288 = field290;
        this.field285 = field285;
        this.field286 = n9 - (field285 >> 1);
        this.field271 = field286;
        return array6;
    }
    
    public static int ap(final MidiFileReader midiFileReader, final int n) {
        if (midiFileReader == null) {
            midiFileReader.bk(n);
        }
        return midiFileReader.readMessage0(n);
    }
    
    static float float32Unpack(final int n) {
        int n2 = n & 0x1FFFFF;
        final int n3 = n & Integer.MIN_VALUE;
        final int n4 = (n & 0x7FE00000) >> 21;
        if (n3 != 0) {
            n2 = -n2;
        }
        return (float)(n2 * Math.pow(2.0, n4 - 788));
    }
    
    static void method317(final byte[] array) {
        VorbisSample_setData(array, 0);
        VorbisSample.VorbisSample_blockSize0 = 1 << readBits(4);
        VorbisSample.VorbisSample_blockSize1 = 1 << readBits(4);
        VorbisSample.field288 = new float[VorbisSample.VorbisSample_blockSize1];
        for (int i = 0; i < 2; ++i) {
            final int n = (i != 0) ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
            final int n2 = n >> 1;
            final int n3 = n >> 2;
            final int n4 = n >> 3;
            final float[] array2 = new float[n2];
            for (int j = 0; j < n3; ++j) {
                array2[2 * j] = (float)Math.cos(4 * j * 3.141592653589793 / n);
                array2[2 * j + 1] = -(float)Math.sin(4 * j * 3.141592653589793 / n);
            }
            final float[] array3 = new float[n2];
            for (int k = 0; k < n3; ++k) {
                array3[2 * k] = (float)Math.cos((2 * k + 1) * 3.141592653589793 / (2 * n));
                array3[2 * k + 1] = (float)Math.sin((2 * k + 1) * 3.141592653589793 / (2 * n));
            }
            final float[] array4 = new float[n3];
            for (int l = 0; l < n4; ++l) {
                array4[2 * l] = (float)Math.cos((4 * l + 2) * 3.141592653589793 / n);
                array4[2 * l + 1] = -(float)Math.sin((4 * l + 2) * 3.141592653589793 / n);
            }
            final int[] array5 = new int[n4];
            final int iLog = LoginPacket.iLog(n4 - 1, -1372244813);
            for (int n5 = 0; n5 < n4; ++n5) {
                final int[] array6 = array5;
                final int n6 = n5;
                int n7 = n5;
                int n8 = iLog;
                int n9 = 0;
                while (n8 > 0) {
                    n9 = (n9 << 1 | (n7 & 0x1));
                    n7 >>>= 1;
                    --n8;
                }
                array6[n6] = n9;
            }
            if (i != 0) {
                VorbisSample.field281 = array2;
                VorbisSample.field293 = array3;
                VorbisSample.field294 = array4;
                VorbisSample.field296 = array5;
            }
            else {
                VorbisSample.field299 = array2;
                VorbisSample.field290 = array3;
                VorbisSample.field291 = array4;
                VorbisSample.field295 = array5;
            }
        }
        final int n10 = readBits(8) + 1;
        VorbisSample.VorbisSample_codebooks = new VorbisCodebook[n10];
        for (int n11 = 0; n11 < n10; ++n11) {
            VorbisSample.VorbisSample_codebooks[n11] = new VorbisCodebook();
        }
        for (int n12 = readBits(6) + 1, n13 = 0; n13 < n12; ++n13) {
            readBits(16);
        }
        final int n14 = readBits(6) + 1;
        VorbisSample.VorbisSample_floors = new VorbisFloor[n14];
        for (int n15 = 0; n15 < n14; ++n15) {
            VorbisSample.VorbisSample_floors[n15] = new VorbisFloor();
        }
        final int n16 = readBits(6) + 1;
        VorbisSample.VorbisSample_residues = new VorbisResidue[n16];
        for (int n17 = 0; n17 < n16; ++n17) {
            VorbisSample.VorbisSample_residues[n17] = new VorbisResidue();
        }
        final int n18 = readBits(6) + 1;
        VorbisSample.VorbisSample_mappings = new VorbisMapping[n18];
        for (int n19 = 0; n19 < n18; ++n19) {
            VorbisSample.VorbisSample_mappings[n19] = new VorbisMapping();
        }
        final int n20 = readBits(6) + 1;
        VorbisSample.VorbisSample_blockFlags = new boolean[n20];
        VorbisSample.VorbisSample_mapping = new int[n20];
        for (int n21 = 0; n21 < n20; ++n21) {
            VorbisSample.VorbisSample_blockFlags[n21] = (readBit() != 0);
            readBits(16);
            readBits(16);
            VorbisSample.VorbisSample_mapping[n21] = readBits(8);
        }
    }
    
    float[] method318(final int n) {
        VorbisSample_setData(this.field287[n], 0);
        readBit();
        final int bits = readBits(LoginPacket.iLog(VorbisSample.VorbisSample_mapping.length - 1, -496978963));
        final boolean b = VorbisSample.VorbisSample_blockFlags[bits];
        final int field285 = b ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
        int n2 = 0;
        int n3 = 0;
        if (b) {
            n2 = ((readBit() != 0) ? 1 : 0);
            n3 = ((readBit() != 0) ? 1 : 0);
        }
        final int n4 = field285 >> 1;
        int n5;
        int n6;
        int n7;
        if (b && n2 == 0) {
            n5 = (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n6 = (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n7 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n5 = 0;
            n6 = n4;
            n7 = field285 >> 1;
        }
        int n8;
        int n9;
        int n10;
        if (b && n3 == 0) {
            n8 = field285 - (field285 >> 2) - (VorbisSample.VorbisSample_blockSize0 >> 2);
            n9 = field285 - (field285 >> 2) + (VorbisSample.VorbisSample_blockSize0 >> 2);
            n10 = VorbisSample.VorbisSample_blockSize0 >> 1;
        }
        else {
            n8 = n4;
            n9 = field285;
            n10 = field285 >> 1;
        }
        final VorbisMapping vorbisMapping = VorbisSample.VorbisSample_mappings[VorbisSample.VorbisSample_mapping[bits]];
        final boolean b2;
        final boolean field286 = b2 = !VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].readSubmapFloor();
        for (int i = 0; i < vorbisMapping.submaps; ++i) {
            VorbisSample.VorbisSample_residues[vorbisMapping.submapFloor[i]].method254(VorbisSample.field288, field285 >> 1, b2);
        }
        if (!field286) {
            VorbisSample.VorbisSample_floors[vorbisMapping.submapResidue[vorbisMapping.mappingMux]].method225(VorbisSample.field288, field285 >> 1);
        }
        if (field286) {
            for (int j = field285 >> 1; j < field285; ++j) {
                VorbisSample.field288[j] = 0.0f;
            }
        }
        else {
            final int n11 = field285 >> 1;
            final int n12 = field285 >> 2;
            final int n13 = field285 >> 3;
            final float[] field287 = VorbisSample.field288;
            for (int k = 0; k < n11; ++k) {
                final float[] array = field287;
                final int n14 = k;
                array[n14] *= 0.5f;
            }
            for (int l = n11; l < field285; ++l) {
                field287[l] = -field287[field285 - l - 1];
            }
            final float[] array2 = b ? VorbisSample.field281 : VorbisSample.field299;
            final float[] array3 = b ? VorbisSample.field293 : VorbisSample.field290;
            final float[] array4 = b ? VorbisSample.field294 : VorbisSample.field291;
            final int[] array5 = b ? VorbisSample.field296 : VorbisSample.field295;
            for (int n15 = 0; n15 < n12; ++n15) {
                final float n16 = field287[4 * n15] - field287[field285 - 4 * n15 - 1];
                final float n17 = field287[4 * n15 + 2] - field287[field285 - 4 * n15 - 3];
                final float n18 = array2[2 * n15];
                final float n19 = array2[2 * n15 + 1];
                field287[field285 - 4 * n15 - 1] = n16 * n18 - n17 * n19;
                field287[field285 - 4 * n15 - 3] = n16 * n19 + n17 * n18;
            }
            for (int n20 = 0; n20 < n13; ++n20) {
                final float n21 = field287[n11 + 3 + 4 * n20];
                final float n22 = field287[n11 + 1 + 4 * n20];
                final float n23 = field287[4 * n20 + 3];
                final float n24 = field287[4 * n20 + 1];
                field287[n11 + 3 + 4 * n20] = n21 + n23;
                field287[n11 + 1 + 4 * n20] = n22 + n24;
                final float n25 = array2[n11 - 4 - 4 * n20];
                final float n26 = array2[n11 - 3 - 4 * n20];
                field287[4 * n20 + 3] = (n21 - n23) * n25 - (n22 - n24) * n26;
                field287[4 * n20 + 1] = (n22 - n24) * n25 + (n21 - n23) * n26;
            }
            for (int iLog = LoginPacket.iLog(field285 - 1, -862076639), n27 = 0; n27 < iLog - 3; ++n27) {
                final int n28 = field285 >> n27 + 2;
                final int n29 = 8 << n27;
                for (int n30 = 0; n30 < 2 << n27; ++n30) {
                    final int n31 = field285 - n28 * 2 * n30;
                    final int n32 = field285 - n28 * (2 * n30 + 1);
                    for (int n33 = 0; n33 < field285 >> n27 + 4; ++n33) {
                        final int n34 = 4 * n33;
                        final float n35 = field287[n31 - 1 - n34];
                        final float n36 = field287[n31 - 3 - n34];
                        final float n37 = field287[n32 - 1 - n34];
                        final float n38 = field287[n32 - 3 - n34];
                        field287[n31 - 1 - n34] = n35 + n37;
                        field287[n31 - 3 - n34] = n36 + n38;
                        final float n39 = array2[n33 * n29];
                        final float n40 = array2[n33 * n29 + 1];
                        field287[n32 - 1 - n34] = (n35 - n37) * n39 - (n36 - n38) * n40;
                        field287[n32 - 3 - n34] = (n36 - n38) * n39 + (n35 - n37) * n40;
                    }
                }
            }
            for (int n41 = 1; n41 < n13 - 1; ++n41) {
                final int n42 = array5[n41];
                if (n41 < n42) {
                    final int n43 = 8 * n41;
                    final int n44 = 8 * n42;
                    final float n45 = field287[n43 + 1];
                    field287[n43 + 1] = field287[n44 + 1];
                    field287[n44 + 1] = n45;
                    final float n46 = field287[n43 + 3];
                    field287[n43 + 3] = field287[n44 + 3];
                    field287[n44 + 3] = n46;
                    final float n47 = field287[n43 + 5];
                    field287[n43 + 5] = field287[n44 + 5];
                    field287[n44 + 5] = n47;
                    final float n48 = field287[n43 + 7];
                    field287[n43 + 7] = field287[n44 + 7];
                    field287[n44 + 7] = n48;
                }
            }
            for (int n49 = 0; n49 < n11; ++n49) {
                field287[n49] = field287[2 * n49 + 1];
            }
            for (int n50 = 0; n50 < n13; ++n50) {
                field287[field285 - 1 - 2 * n50] = field287[4 * n50];
                field287[field285 - 2 - 2 * n50] = field287[4 * n50 + 1];
                field287[field285 - n12 - 1 - 2 * n50] = field287[4 * n50 + 2];
                field287[field285 - n12 - 2 - 2 * n50] = field287[4 * n50 + 3];
            }
            for (int n51 = 0; n51 < n13; ++n51) {
                final float n52 = array4[2 * n51];
                final float n53 = array4[2 * n51 + 1];
                final float n54 = field287[n11 + 2 * n51];
                final float n55 = field287[n11 + 2 * n51 + 1];
                final float n56 = field287[field285 - 2 - 2 * n51];
                final float n57 = field287[field285 - 1 - 2 * n51];
                final float n58 = n53 * (n54 - n56) + n52 * (n55 + n57);
                field287[n11 + 2 * n51] = (n54 + n56 + n58) * 0.5f;
                field287[field285 - 2 - 2 * n51] = (n54 + n56 - n58) * 0.5f;
                final float n59 = n53 * (n55 + n57) - n52 * (n54 - n56);
                field287[n11 + 2 * n51 + 1] = (n55 - n57 + n59) * 0.5f;
                field287[field285 - 1 - 2 * n51] = (-n55 + n57 + n59) * 0.5f;
            }
            for (int n60 = 0; n60 < n12; ++n60) {
                field287[n60] = field287[2 * n60 + n11] * array3[2 * n60] + field287[2 * n60 + 1 + n11] * array3[2 * n60 + 1];
                field287[n11 - 1 - n60] = field287[2 * n60 + n11] * array3[2 * n60 + 1] - field287[2 * n60 + 1 + n11] * array3[2 * n60];
            }
            for (int n61 = 0; n61 < n12; ++n61) {
                field287[field285 - n12 + n61] = -field287[n61];
            }
            for (int n62 = 0; n62 < n12; ++n62) {
                field287[n62] = field287[n12 + n62];
            }
            for (int n63 = 0; n63 < n12; ++n63) {
                field287[n12 + n63] = -field287[n12 - n63 - 1];
            }
            for (int n64 = 0; n64 < n12; ++n64) {
                field287[n11 + n64] = field287[field285 - n64 - 1];
            }
            for (int n65 = n5; n65 < n6; ++n65) {
                final float n66 = (float)Math.sin((n65 - n5 + 0.5) / n7 * 0.5 * 3.141592653589793);
                final float[] field288 = VorbisSample.field288;
                final int n67 = n65;
                field288[n67] *= (float)Math.sin(1.5707963267948966 * n66 * n66);
            }
            for (int n68 = n8; n68 < n9; ++n68) {
                final float n69 = (float)Math.sin((n68 - n8 + 0.5) / n10 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                final float[] field289 = VorbisSample.field288;
                final int n70 = n68;
                field289[n70] *= (float)Math.sin(1.5707963267948966 * n69 * n69);
            }
        }
        float[] array6 = null;
        if (this.field285 > 0) {
            array6 = new float[this.field285 + field285 >> 2];
            if (!this.field271) {
                for (int n71 = 0; n71 < this.field286; ++n71) {
                    final int n72 = (this.field285 >> 1) + n71;
                    final float[] array7 = array6;
                    final int n73 = n71;
                    array7[n73] += this.field284[n72];
                }
            }
            if (!field286) {
                for (int n74 = n5; n74 < field285 >> 1; ++n74) {
                    final int n75 = array6.length - (field285 >> 1) + n74;
                    final float[] array8 = array6;
                    final int n76 = n75;
                    array8[n76] += VorbisSample.field288[n74];
                }
            }
        }
        final float[] field290 = this.field284;
        this.field284 = VorbisSample.field288;
        VorbisSample.field288 = field290;
        this.field285 = field285;
        this.field286 = n9 - (field285 >> 1);
        this.field271 = field286;
        return array6;
    }
    
    static void aj(final byte[] array) {
        VorbisSample_setData(array, 0);
        VorbisSample.VorbisSample_blockSize0 = 1 << readBits(4);
        VorbisSample.VorbisSample_blockSize1 = 1 << readBits(4);
        VorbisSample.field288 = new float[VorbisSample.VorbisSample_blockSize1];
        for (int i = 0; i < 2; ++i) {
            final int n = (i != 0) ? VorbisSample.VorbisSample_blockSize1 : VorbisSample.VorbisSample_blockSize0;
            final int n2 = n >> 1;
            final int n3 = n >> 2;
            final int n4 = n >> 3;
            final float[] array2 = new float[n2];
            for (int j = 0; j < n3; ++j) {
                array2[2 * j] = (float)Math.cos(4 * j * 3.141592653589793 / n);
                array2[2 * j + 1] = -(float)Math.sin(4 * j * 3.141592653589793 / n);
            }
            final float[] array3 = new float[n2];
            for (int k = 0; k < n3; ++k) {
                array3[2 * k] = (float)Math.cos((2 * k + 1) * 3.141592653589793 / (2 * n));
                array3[2 * k + 1] = (float)Math.sin((2 * k + 1) * 3.141592653589793 / (2 * n));
            }
            final float[] array4 = new float[n3];
            for (int l = 0; l < n4; ++l) {
                array4[2 * l] = (float)Math.cos((4 * l + 2) * 3.141592653589793 / n);
                array4[2 * l + 1] = -(float)Math.sin((4 * l + 2) * 3.141592653589793 / n);
            }
            final int[] array5 = new int[n4];
            final int iLog = LoginPacket.iLog(n4 - 1, -842535342);
            for (int n5 = 0; n5 < n4; ++n5) {
                final int[] array6 = array5;
                final int n6 = n5;
                int n7 = n5;
                int n8 = iLog;
                int n9 = 0;
                while (n8 > 0) {
                    n9 = (n9 << 1 | (n7 & 0x1));
                    n7 >>>= 1;
                    --n8;
                }
                array6[n6] = n9;
            }
            if (i != 0) {
                VorbisSample.field281 = array2;
                VorbisSample.field293 = array3;
                VorbisSample.field294 = array4;
                VorbisSample.field296 = array5;
            }
            else {
                VorbisSample.field299 = array2;
                VorbisSample.field290 = array3;
                VorbisSample.field291 = array4;
                VorbisSample.field295 = array5;
            }
        }
        final int n10 = readBits(8) + 1;
        VorbisSample.VorbisSample_codebooks = new VorbisCodebook[n10];
        for (int n11 = 0; n11 < n10; ++n11) {
            VorbisSample.VorbisSample_codebooks[n11] = new VorbisCodebook();
        }
        for (int n12 = readBits(6) + 1, n13 = 0; n13 < n12; ++n13) {
            readBits(16);
        }
        final int n14 = readBits(6) + 1;
        VorbisSample.VorbisSample_floors = new VorbisFloor[n14];
        for (int n15 = 0; n15 < n14; ++n15) {
            VorbisSample.VorbisSample_floors[n15] = new VorbisFloor();
        }
        final int n16 = readBits(6) + 1;
        VorbisSample.VorbisSample_residues = new VorbisResidue[n16];
        for (int n17 = 0; n17 < n16; ++n17) {
            VorbisSample.VorbisSample_residues[n17] = new VorbisResidue();
        }
        final int n18 = readBits(6) + 1;
        VorbisSample.VorbisSample_mappings = new VorbisMapping[n18];
        for (int n19 = 0; n19 < n18; ++n19) {
            VorbisSample.VorbisSample_mappings[n19] = new VorbisMapping();
        }
        final int n20 = readBits(6) + 1;
        VorbisSample.VorbisSample_blockFlags = new boolean[n20];
        VorbisSample.VorbisSample_mapping = new int[n20];
        for (int n21 = 0; n21 < n20; ++n21) {
            VorbisSample.VorbisSample_blockFlags[n21] = (readBit() != 0);
            readBits(16);
            readBits(16);
            VorbisSample.VorbisSample_mapping[n21] = readBits(8);
        }
    }
    
    static int ag() {
        final int n = VorbisSample.VorbisSample_bytes[VorbisSample.VorbisSample_byteOffset] >> VorbisSample.VorbisSample_bitOffset & 0x1;
        ++VorbisSample.VorbisSample_bitOffset;
        VorbisSample.VorbisSample_byteOffset += VorbisSample.VorbisSample_bitOffset >> 3;
        VorbisSample.VorbisSample_bitOffset &= 0x7;
        return n;
    }
    
    RawSound bz(final int[] array) {
        if (array != null && array[0] <= 0) {
            return null;
        }
        if (this.samples == null) {
            this.field285 = 0;
            this.field284 = new float[VorbisSample.VorbisSample_blockSize1];
            this.samples = new byte[this.sampleCount];
            this.field282 = 0;
            this.field278 = 0;
        }
        while (this.field278 < this.field287.length) {
            if (array != null && array[0] <= 0) {
                return null;
            }
            final float[] method318 = this.method318(this.field278);
            if (method318 != null) {
                int field282 = this.field282;
                int length = method318.length;
                if (length > this.sampleCount - field282) {
                    length = this.sampleCount - field282;
                }
                for (int i = 0; i < length; ++i) {
                    int n = (int)(128.0f + method318[i] * 128.0f);
                    if ((n & 0xFFFFFF00) != 0x0) {
                        n = ~n >> -2034922719;
                    }
                    this.samples[field282++] = (byte)(n + 336525191);
                }
                if (array != null) {
                    final int n2 = 0;
                    array[n2] -= field282 - this.field282;
                }
                this.field282 = field282;
            }
            ++this.field278;
        }
        this.field284 = null;
        final byte[] samples = this.samples;
        this.samples = null;
        return new RawSound(this.sampleRate, samples, this.start, this.end, this.field275);
    }
    
    static VorbisSample bk(final AbstractArchive abstractArchive, final int n, final int n2) {
        if (!method314(abstractArchive)) {
            abstractArchive.tryLoadFile(n, n2, (byte)(-54));
            return null;
        }
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-66));
        if (takeFile == null) {
            return null;
        }
        return new VorbisSample(takeFile);
    }
    
    static int ah() {
        final int n = VorbisSample.VorbisSample_bytes[VorbisSample.VorbisSample_byteOffset] >> VorbisSample.VorbisSample_bitOffset & 0x1;
        ++VorbisSample.VorbisSample_bitOffset;
        VorbisSample.VorbisSample_byteOffset += VorbisSample.VorbisSample_bitOffset >> 3;
        VorbisSample.VorbisSample_bitOffset &= 0x7;
        return n;
    }
}
