// 
// Decompiled by Procyon v0.5.36
// 

public class MusicPatch extends Node
{
    RawSound[] rawSounds;
    short[] field2771;
    int field2772;
    byte[] field2773;
    byte[] field2774;
    MusicPatchNode2[] field2775;
    byte[] field2776;
    int[] field2777;
    
    MusicPatch(final byte[] array) {
        this.rawSounds = new RawSound[128];
        this.field2771 = new short[128];
        this.field2773 = new byte[128];
        this.field2774 = new byte[128];
        this.field2775 = new MusicPatchNode2[128];
        this.field2776 = new byte[128];
        this.field2777 = new int[128];
        Buffer buffer;
        int n;
        for (buffer = new Buffer(array), n = 0; 0 != buffer.array[n + buffer.offset * -1633313603]; ++n) {}
        final byte[] array2 = new byte[n];
        for (int i = 0; i < n; ++i) {
            array2[i] = Buffer.wu(buffer, 435772489);
        }
        final Buffer buffer2 = buffer;
        buffer2.offset -= 1516355947;
        ++n;
        int n2 = buffer.offset * -1633313603;
        final Buffer buffer3 = buffer;
        buffer3.offset += n * -1516355947;
        int n3;
        for (n3 = 0; buffer.array[-1633313603 * buffer.offset + n3] != 0; ++n3) {}
        final byte[] array3 = new byte[n3];
        for (int j = 0; j < n3; ++j) {
            array3[j] = Buffer.wu(buffer, 435772489);
        }
        final Buffer buffer4 = buffer;
        buffer4.offset -= 1516355947;
        ++n3;
        int n4 = buffer.offset * -1633313603;
        final Buffer buffer5 = buffer;
        buffer5.offset += -1516355947 * n3;
        int n5;
        for (n5 = 0; buffer.array[-1633313603 * buffer.offset + n5] != 0; ++n5) {}
        final byte[] array4 = new byte[n5];
        for (int k = 0; k < n5; ++k) {
            array4[k] = Buffer.wu(buffer, 435772489);
        }
        final Buffer buffer6 = buffer;
        buffer6.offset -= 1516355947;
        ++n5;
        final byte[] array5 = new byte[n5];
        int n7;
        if (n5 > 1) {
            array5[1] = 1;
            int n6 = 1;
            n7 = 2;
            for (int l = 2; l < n5; ++l) {
                int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    n6 = n7++;
                }
                else {
                    if (ra <= n6) {
                        --ra;
                    }
                    n6 = ra;
                }
                array5[l] = (byte)n6;
            }
        }
        else {
            n7 = n5;
        }
        final MusicPatchNode2[] array6 = new MusicPatchNode2[n7];
        for (int n8 = 0; n8 < array6.length; ++n8) {
            final MusicPatchNode2[] array7 = array6;
            final int n9 = n8;
            final MusicPatchNode2 musicPatchNode2 = new MusicPatchNode2();
            array7[n9] = musicPatchNode2;
            final MusicPatchNode2 musicPatchNode3 = musicPatchNode2;
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 > 0) {
                musicPatchNode3.field2718 = new byte[ra2 * 2];
            }
            final int ra3 = Buffer.ra(buffer, (byte)7);
            if (ra3 > 0) {
                (musicPatchNode3.field2717 = new byte[2 + ra3 * 2])[1] = 64;
            }
        }
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final byte[] array8 = (byte[])((ra4 > 0) ? new byte[ra4 * 2] : null);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final byte[] array9 = (byte[])((ra5 > 0) ? new byte[ra5 * 2] : null);
        int n10;
        for (n10 = 0; buffer.array[n10 + -1633313603 * buffer.offset] != 0; ++n10) {}
        final byte[] array10 = new byte[n10];
        for (int n11 = 0; n11 < n10; ++n11) {
            array10[n11] = Buffer.wu(buffer, 435772489);
        }
        final Buffer buffer7 = buffer;
        buffer7.offset -= 1516355947;
        ++n10;
        int n12 = 0;
        for (int n13 = 0; n13 < 128; ++n13) {
            n12 += Buffer.ra(buffer, (byte)7);
            this.field2771[n13] = (short)n12;
        }
        int n14 = 0;
        for (int n15 = 0; n15 < 128; ++n15) {
            n14 += Buffer.ra(buffer, (byte)7);
            final short[] field2771 = this.field2771;
            final int n16 = n15;
            field2771[n16] += (short)(n14 << 8);
        }
        int n17 = 0;
        int n18 = 0;
        int varInt = 0;
        for (int n19 = 0; n19 < 128; ++n19) {
            if (n17 == 0) {
                if (n18 < array10.length) {
                    n17 = array10[n18++];
                }
                else {
                    n17 = -1;
                }
                varInt = buffer.readVarInt(-1171795391);
            }
            final short[] field2772 = this.field2771;
            final int n20 = n19;
            field2772[n20] += (short)((varInt - 1 & 0x2) << 14);
            this.field2777[n19] = varInt;
            --n17;
        }
        int n21 = 0;
        int n22 = 0;
        int n23 = 0;
        for (int n24 = 0; n24 < 128; ++n24) {
            if (0 != this.field2777[n24]) {
                if (n21 == 0) {
                    if (n22 < array2.length) {
                        n21 = array2[n22++];
                    }
                    else {
                        n21 = -1;
                    }
                    n23 = buffer.array[n2++] - 1;
                }
                this.field2776[n24] = (byte)n23;
                --n21;
            }
        }
        int n25 = 0;
        int n26 = 0;
        int n27 = 0;
        for (int n28 = 0; n28 < 128; ++n28) {
            if (0 != this.field2777[n28]) {
                if (n25 == 0) {
                    if (n26 < array3.length) {
                        n25 = array3[n26++];
                    }
                    else {
                        n25 = -1;
                    }
                    n27 = buffer.array[n4++] + 16 << 2;
                }
                this.field2774[n28] = (byte)n27;
                --n25;
            }
        }
        int n29 = 0;
        int n30 = 0;
        MusicPatchNode2 musicPatchNode4 = null;
        for (int n31 = 0; n31 < 128; ++n31) {
            if (this.field2777[n31] != 0) {
                if (n29 == 0) {
                    musicPatchNode4 = array6[array5[n30]];
                    if (n30 < array4.length) {
                        n29 = array4[n30++];
                    }
                    else {
                        n29 = -1;
                    }
                }
                this.field2775[n31] = musicPatchNode4;
                --n29;
            }
        }
        int n32 = 0;
        int n33 = 0;
        int n34 = 0;
        for (int n35 = 0; n35 < 128; ++n35) {
            if (n32 == 0) {
                if (n33 < array10.length) {
                    n32 = array10[n33++];
                }
                else {
                    n32 = -1;
                }
                if (this.field2777[n35] > 0) {
                    n34 = Buffer.ra(buffer, (byte)7) + 1;
                }
            }
            this.field2773[n35] = (byte)n34;
            --n32;
        }
        this.field2772 = (Buffer.ra(buffer, (byte)7) + 1) * -1524501647;
        for (final MusicPatchNode2 musicPatchNode5 : array6) {
            if (musicPatchNode5.field2718 != null) {
                for (int n37 = 1; n37 < musicPatchNode5.field2718.length; n37 += 2) {
                    musicPatchNode5.field2718[n37] = Buffer.wu(buffer, 435772489);
                }
            }
            if (null != musicPatchNode5.field2717) {
                for (int n38 = 3; n38 < musicPatchNode5.field2717.length - 2; n38 += 2) {
                    musicPatchNode5.field2717[n38] = Buffer.wu(buffer, 435772489);
                }
            }
        }
        if (array8 != null) {
            for (int n39 = 1; n39 < array8.length; n39 += 2) {
                array8[n39] = Buffer.wu(buffer, 435772489);
            }
        }
        if (null != array9) {
            for (int n40 = 1; n40 < array9.length; n40 += 2) {
                array9[n40] = Buffer.wu(buffer, 435772489);
            }
        }
        for (final MusicPatchNode2 musicPatchNode6 : array6) {
            if (null != musicPatchNode6.field2717) {
                int n42 = 0;
                for (int n43 = 2; n43 < musicPatchNode6.field2717.length; n43 += 2) {
                    n42 = n42 + 1 + Buffer.ra(buffer, (byte)7);
                    musicPatchNode6.field2717[n43] = (byte)n42;
                }
            }
        }
        for (final MusicPatchNode2 musicPatchNode7 : array6) {
            if (musicPatchNode7.field2718 != null) {
                int n45 = 0;
                for (int n46 = 2; n46 < musicPatchNode7.field2718.length; n46 += 2) {
                    n45 = 1 + n45 + Buffer.ra(buffer, (byte)7);
                    musicPatchNode7.field2718[n46] = (byte)n45;
                }
            }
        }
        if (null != array8) {
            int ra6 = Buffer.ra(buffer, (byte)7);
            array8[0] = (byte)ra6;
            for (int n47 = 2; n47 < array8.length; n47 += 2) {
                ra6 = 1 + ra6 + Buffer.ra(buffer, (byte)7);
                array8[n47] = (byte)ra6;
            }
            byte b = array8[0];
            byte b2 = array8[1];
            for (byte b3 = 0; b3 < b; ++b3) {
                this.field2773[b3] = (byte)(this.field2773[b3] * b2 + 32 >> 6);
            }
            for (int n48 = 2; n48 < array8.length; n48 += 2) {
                final byte b4 = array8[n48];
                final byte b5 = array8[1 + n48];
                int n49 = (b4 - b) * b2 + (b4 - b) / 2;
                for (byte b6 = b; b6 < b4; ++b6) {
                    final int n50 = b4 - b;
                    final int n51 = n49 >>> 31;
                    this.field2773[b6] = (byte)(32 + ((n49 + n51) / n50 - n51) * this.field2773[b6] >> 6);
                    n49 += b5 - b2;
                }
                b = b4;
                b2 = b5;
            }
            for (int n52 = b; n52 < 128; ++n52) {
                this.field2773[n52] = (byte)(32 + this.field2773[n52] * b2 >> 6);
            }
        }
        if (null != array9) {
            int ra7 = Buffer.ra(buffer, (byte)7);
            array9[0] = (byte)ra7;
            for (int n53 = 2; n53 < array9.length; n53 += 2) {
                ra7 = 1 + ra7 + Buffer.ra(buffer, (byte)7);
                array9[n53] = (byte)ra7;
            }
            byte b7 = array9[0];
            int n54 = array9[1] << 1;
            for (byte b8 = 0; b8 < b7; ++b8) {
                int n55 = n54 + (this.field2774[b8] & 0xFF);
                if (n55 < 0) {
                    n55 = 0;
                }
                if (n55 > 128) {
                    n55 = 128;
                }
                this.field2774[b8] = (byte)n55;
            }
            for (int n56 = 2; n56 < array9.length; n56 += 2) {
                final byte b9 = array9[n56];
                final int n57 = array9[1 + n56] << 1;
                int n58 = n54 * (b9 - b7) + (b9 - b7) / 2;
                for (byte b10 = b7; b10 < b9; ++b10) {
                    final int n59 = b9 - b7;
                    final int n60 = n58 >>> 31;
                    int n61 = (this.field2774[b10] & 0xFF) + ((n58 + n60) / n59 - n60);
                    if (n61 < 0) {
                        n61 = 0;
                    }
                    if (n61 > 128) {
                        n61 = 128;
                    }
                    this.field2774[b10] = (byte)n61;
                    n58 += n57 - n54;
                }
                b7 = b9;
                n54 = n57;
            }
            for (int n62 = b7; n62 < 128; ++n62) {
                int n63 = n54 + (this.field2774[n62] & 0xFF);
                if (n63 < 0) {
                    n63 = 0;
                }
                if (n63 > 128) {
                    n63 = 128;
                }
                this.field2774[n62] = (byte)n63;
            }
        }
        for (int n64 = 0; n64 < n7; ++n64) {
            array6[n64].field2719 = Buffer.ra(buffer, (byte)7) * -53055399;
        }
        for (final MusicPatchNode2 musicPatchNode8 : array6) {
            if (null != musicPatchNode8.field2718) {
                musicPatchNode8.field2720 = Buffer.ra(buffer, (byte)7) * -639447423;
            }
            if (null != musicPatchNode8.field2717) {
                musicPatchNode8.field2725 = Buffer.ra(buffer, (byte)7) * 2109724277;
            }
            if (354539497 * musicPatchNode8.field2719 > 0) {
                musicPatchNode8.field2722 = Buffer.ra(buffer, (byte)7) * 1474615501;
            }
        }
        for (int n66 = 0; n66 < n7; ++n66) {
            array6[n66].field2724 = Buffer.ra(buffer, (byte)7) * 984489657;
        }
        for (final MusicPatchNode2 musicPatchNode9 : array6) {
            if (-1668380791 * musicPatchNode9.field2724 > 0) {
                musicPatchNode9.field2723 = Buffer.ra(buffer, (byte)7) * 1399234771;
            }
        }
        for (final MusicPatchNode2 musicPatchNode10 : array6) {
            if (-1552238757 * musicPatchNode10.field2723 > 0) {
                musicPatchNode10.field2721 = Buffer.ra(buffer, (byte)7) * 824541071;
            }
        }
    }
    
    public static void fp(final MusicPatch musicPatch, final byte b) {
        if (musicPatch == null) {
            musicPatch.clear(b);
        }
        try {
            musicPatch.field2777 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lz.an(" + ')');
        }
    }
    
    boolean aw(final SoundCache soundCache, final byte[] array, final int[] array2) {
        boolean b = true;
        int n = 0;
        RawSound rawSound = null;
        for (int i = 0; i < 128; ++i) {
            if (array == null || array[i] != 0) {
                int n2 = this.field2777[i];
                if (n2 != 0) {
                    if (n2 != n) {
                        n = n2;
                        --n2;
                        if (0x0 == (n2 & 0x1)) {
                            rawSound = soundCache.getSoundEffect(n2 >> 2, array2, 246420807);
                        }
                        else {
                            rawSound = soundCache.getMusicSample(n2 >> 2, array2, 1426075407);
                        }
                        if (null == rawSound) {
                            b = false;
                        }
                    }
                    if (null != rawSound) {
                        this.rawSounds[i] = rawSound;
                        this.field2777[i] = 0;
                    }
                }
            }
        }
        return b;
    }
    
    public static boolean ut(final MusicPatch musicPatch, final SoundCache soundCache, final byte[] array, final int[] array2) {
        if (musicPatch == null) {
            musicPatch.ab();
        }
        boolean b = true;
        int n = 0;
        RawSound rawSound = null;
        for (int i = 0; i < 128; ++i) {
            if (array == null || array[i] != 0) {
                int n2 = musicPatch.field2777[i];
                if (n2 != 0) {
                    if (n2 != n) {
                        n = n2;
                        --n2;
                        if (0x0 == (n2 & 0x1)) {
                            rawSound = soundCache.getSoundEffect(n2 >> 2, array2, 1557757325);
                        }
                        else {
                            rawSound = soundCache.getMusicSample(n2 >> 2, array2, 1048692094);
                        }
                        if (null == rawSound) {
                            b = false;
                        }
                    }
                    if (null != rawSound) {
                        musicPatch.rawSounds[i] = rawSound;
                        musicPatch.field2777[i] = 0;
                    }
                }
            }
        }
        return b;
    }
    
    void al() {
        this.field2777 = null;
    }
    
    void clear(final byte b) {
        try {
            this.field2777 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lz.an(" + ')');
        }
    }
    
    void au() {
        this.field2777 = null;
    }
    
    boolean method1663(final SoundCache soundCache, final byte[] array, final int[] array2, final int n) {
        try {
            boolean b = true;
            int n2 = 0;
            RawSound rawSound = null;
            for (int i = 0; i < 128; ++i) {
                if (n <= -1919111848) {
                    throw new IllegalStateException();
                }
                if (array != null) {
                    if (n <= -1919111848) {
                        throw new IllegalStateException();
                    }
                    if (array[i] == 0) {
                        continue;
                    }
                }
                int n3 = this.field2777[i];
                if (n3 == 0) {
                    if (n <= -1919111848) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    if (n3 != n2) {
                        if (n <= -1919111848) {
                            throw new IllegalStateException();
                        }
                        n2 = n3;
                        --n3;
                        if (0x0 == (n3 & 0x1)) {
                            if (n <= -1919111848) {
                                throw new IllegalStateException();
                            }
                            rawSound = soundCache.getSoundEffect(n3 >> 2, array2, -103180467);
                        }
                        else {
                            rawSound = soundCache.getMusicSample(n3 >> 2, array2, -1251509285);
                        }
                        if (null == rawSound) {
                            if (n <= -1919111848) {
                                throw new IllegalStateException();
                            }
                            b = false;
                        }
                    }
                    if (null != rawSound) {
                        if (n <= -1919111848) {
                            throw new IllegalStateException();
                        }
                        this.rawSounds[i] = rawSound;
                        this.field2777[i] = 0;
                    }
                }
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lz.af(" + ')');
        }
    }
    
    void ab() {
        this.field2777 = null;
    }
}
