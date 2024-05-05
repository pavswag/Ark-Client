// 
// Decompiled by Procyon v0.5.36
// 

public class RawPcmStream extends PcmStream
{
    int field237;
    int field238;
    int field239;
    int field240;
    int field241;
    int field242;
    int field243;
    int field244;
    int field245;
    int end;
    boolean field247;
    int field248;
    int start;
    int numLoops;
    int field251;
    
    RawPcmStream(final RawSound ar, final int field238, final int field239) {
        this.ar = ar;
        this.start = ar.start;
        this.end = ar.end;
        this.field247 = ar.field176;
        this.field238 = field238;
        this.field245 = field239;
        this.field240 = 8192;
        this.field239 = 0;
        this.method258();
    }
    
    RawPcmStream(final RawSound ar, final int field238, final int field239, final int field240) {
        this.ar = ar;
        this.start = ar.start;
        this.end = ar.end;
        this.field247 = ar.field176;
        this.field238 = field238;
        this.field245 = field239;
        this.field240 = field240;
        this.field239 = 0;
        this.method258();
    }
    
    static int fp(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, int field241, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        rawPcmStream.field241 -= rawPcmStream.field244 * i;
        if (n8 == 0 || (n5 = i + (n7 - field239 + n8 - 981456011) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * field240 >> 6, field240 += n3, n11 = i++, array2[n11] += n * field241 >> 6, field241 += n4, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2];
            n = (n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[field239 >> 8];
            n = (n << 8) + (n2 - n) * (field239 & 0x6B00D240);
            final int n12 = i++;
            array2[n12] += n * field240 >> 6;
            field240 += n3;
            final int n13 = i++;
            array2[n13] += n * field241 >> 6;
            field241 += n4;
            field239 += n8;
        }
        i >>= 1;
        rawPcmStream.field241 += rawPcmStream.field244 * i;
        rawPcmStream.field242 = field240;
        rawPcmStream.field243 = field241;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    static int method284(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n - (n6 - 1)) > n5) {
            n4 = n5;
        }
        rawPcmStream.field242 += rawPcmStream.field237 * (n4 - i);
        rawPcmStream.field243 += rawPcmStream.field251 * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n--] * n2, n2 += n3, n8 = i++, array2[n8] += array[n--] * n2, n2 += n3, n9 = i++, array2[n9] += array[n--] * n2, n2 += n3, n10 = i++, array2[n10] += array[n--] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n--] * n2, n2 += n3) {}
        rawPcmStream.field241 = n2 >> 2;
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    void dp() {
        if (this.field248 != 0) {
            if (this.field245 == Integer.MIN_VALUE) {
                this.field245 = 0;
            }
            this.field248 = 0;
            this.method258();
        }
    }
    
    boolean method276() {
        int field245 = this.field245;
        int method255;
        int method256;
        if (field245 == Integer.MIN_VALUE) {
            method255 = 0;
            method256 = 0;
            field245 = 0;
        }
        else {
            method256 = method297(field245, this.field240);
            method255 = method255(field245, this.field240);
        }
        if (this.field241 != field245 || this.field242 != method256 || this.field243 != method255) {
            if (this.field241 < field245) {
                this.field244 = 1;
                this.field248 = field245 - this.field241;
            }
            else if (this.field241 > field245) {
                this.field244 = -1;
                this.field248 = this.field241 - field245;
            }
            else {
                this.field244 = 0;
            }
            if (this.field242 < method256) {
                this.field237 = 1;
                if (this.field248 == 0 || this.field248 > method256 - this.field242) {
                    this.field248 = method256 - this.field242;
                }
            }
            else if (this.field242 > method256) {
                this.field237 = -1;
                if (this.field248 == 0 || this.field248 > this.field242 - method256) {
                    this.field248 = this.field242 - method256;
                }
            }
            else {
                this.field237 = 0;
            }
            if (this.field243 < method255) {
                this.field251 = 1;
                if (this.field248 == 0 || this.field248 > method255 - this.field243) {
                    this.field248 = method255 - this.field243;
                }
            }
            else if (this.field243 > method255) {
                this.field251 = -1;
                if (this.field248 == 0 || this.field248 > this.field243 - method255) {
                    this.field248 = this.field243 - method255;
                }
            }
            else {
                this.field251 = 0;
            }
            return false;
        }
        if (this.field245 == Integer.MIN_VALUE) {
            this.field245 = 0;
            this.field243 = 0;
            this.field242 = 0;
            this.field241 = 0;
            this.hw();
            return true;
        }
        this.method258();
        return false;
    }
    
    static int en(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = i + n2 - (n7 - 1)) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2--], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2--], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2--], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2--];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2--];
        }
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    static int method300(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, int field241, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        rawPcmStream.field241 -= rawPcmStream.field244 * i;
        if (n8 == 0 || (n5 = i + (n7 - field239 + n8 - 257) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * field240 >> 6, field240 += n3, n11 = i++, array2[n11] += n * field241 >> 6, field241 += n4, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2];
            n = (n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[field239 >> 8];
            n = (n << 8) + (n2 - n) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * field240 >> 6;
            field240 += n3;
            final int n13 = i++;
            array2[n13] += n * field241 >> 6;
            field241 += n4;
            field239 += n8;
        }
        i >>= 1;
        rawPcmStream.field241 += rawPcmStream.field244 * i;
        rawPcmStream.field242 = field240;
        rawPcmStream.field243 = field241;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    public synchronized int method270() {
        return (this.field238 < 0) ? (-this.field238) : this.field238;
    }
    
    public synchronized void cd(final int numLoops) {
        this.numLoops = numLoops;
    }
    
    @Override
    int vmethod1019() {
        final int n = this.field241 * 3 >> 6;
        int n2 = (n ^ n >> 31) + (n >>> 31);
        if (this.numLoops == 0) {
            n2 -= n2 * this.field239 / (((RawSound)this.ar).samples.length << 8);
        }
        else if (this.numLoops >= 0) {
            n2 -= n2 * this.start / ((RawSound)this.ar).samples.length;
        }
        return (n2 > 255) ? 255 : n2;
    }
    
    public boolean method296() {
        return this.field248 != 0;
    }
    
    @Override
    int cr() {
        final int n = this.field241 * 3 >> 6;
        int n2 = (n ^ n >> 31) + (n >>> 31);
        if (this.numLoops == 0) {
            n2 -= n2 * this.field239 / (((RawSound)this.ar).samples.length << 8);
        }
        else if (this.numLoops >= 0) {
            n2 -= n2 * this.start / ((RawSound)this.ar).samples.length;
        }
        return (n2 > 255) ? -516096724 : n2;
    }
    
    static int method290(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n6 - n) > n5) {
            n4 = n5;
        }
        rawPcmStream.field242 += rawPcmStream.field237 * (n4 - i);
        rawPcmStream.field243 += rawPcmStream.field251 * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n++] * n2, n2 += n3, n8 = i++, array2[n8] += array[n++] * n2, n2 += n3, n9 = i++, array2[n9] += array[n++] * n2, n2 += n3, n10 = i++, array2[n10] += array[n++] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n++] * n2, n2 += n3) {}
        rawPcmStream.field241 = n2 >> 2;
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    @Override
    protected PcmStream bb() {
        return null;
    }
    
    public static RawPcmStream cb(final RawSound rawSound, final int n, final int n2) {
        if (rawSound.samples != null && rawSound.samples.length != 0) {
            return new RawPcmStream(rawSound, (int)(rawSound.sampleRate * 256L * n / (PcmPlayer.field201 * 1511829972)), n2 << 6);
        }
        return null;
    }
    
    public synchronized int da() {
        return (this.field238 < 0) ? (-this.field238) : this.field238;
    }
    
    static int el(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = i + n7 - n2) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2++], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2++], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2++], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2++];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2++];
        }
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    static int cl(final int n, final int n2) {
        return (n2 < 0) ? (-n) : ((int)(n * Math.sqrt(n2 * 1.220703125E-4) + 0.5));
    }
    
    static int method266(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        rawPcmStream.field242 -= rawPcmStream.field237 * i;
        rawPcmStream.field243 -= rawPcmStream.field251 * i;
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 257) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF)) * field240 >> 6;
            field240 += n3;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 1) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n2 = n8; i < n4; n10 = i++, array2[n10] += ((n << 8) + (n2 - n) * (field239 & 0xFF)) * field240 >> 6, field240 += n3, field239 += n7) {
            n = array[field239 >> 8];
        }
        rawPcmStream.field242 += rawPcmStream.field237 * i;
        rawPcmStream.field243 += rawPcmStream.field251 * i;
        rawPcmStream.field241 = field240;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    static int ex(int n, int n2, final byte[] array, final int[] array2, int field239, int i, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 - 1853811354 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            n = (n << 8) + (array[n2] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (array[field239 >> 8] - n2) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            field239 += n8;
        }
        rawPcmStream.field239 = field239;
        return i >> 1;
    }
    
    static int fd(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, int field241, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        rawPcmStream.field241 -= rawPcmStream.field244 * i;
        if (n8 == 0 || (n5 = i + (n7 + 256 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * field240 >> 6, field240 += n3, n11 = i++, array2[n11] += n * field241 >> 6, field241 += n4, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            n = (n << 8) + (array[n2] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (array[field239 >> 8] - n2) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * field240 >> 6;
            field240 += n3;
            final int n13 = i++;
            array2[n13] += n * field241 >> 6;
            field241 += n4;
            field239 += n8;
        }
        i >>= 1;
        rawPcmStream.field241 += rawPcmStream.field244 * i;
        rawPcmStream.field242 = field240;
        rawPcmStream.field243 = field241;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    public synchronized void db(final int n, final int n2) {
        this.method267(n, n2, this.method285());
    }
    
    synchronized void dc(final int field245, final int field246) {
        this.field245 = field245;
        this.field240 = field246;
        this.field248 = 0;
        this.method258();
    }
    
    static int method283(int n, int n2, final byte[] array, final int[] array2, int field239, int i, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 + 256 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            n = (n << 8) + (array[n2] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (array[field239 >> 8] - n2) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            field239 += n8;
        }
        rawPcmStream.field239 = field239;
        return i >> 1;
    }
    
    static int cf(final int n, final int n2) {
        return (n2 < 0) ? (-n) : ((int)(n * Math.sqrt(n2 * 1.220703125E-4) + 0.5));
    }
    
    public synchronized void dn(final int field238) {
        if (this.field238 < 0) {
            this.field238 = -field238;
        }
        else {
            this.field238 = field238;
        }
    }
    
    public static RawPcmStream cw(final RawSound rawSound, final int n, final int n2, final int n3) {
        if (rawSound.samples != null && rawSound.samples.length != 0) {
            return new RawPcmStream(rawSound, n, n2, n3);
        }
        return null;
    }
    
    public static RawPcmStream cv(final RawSound rawSound, final int n, final int n2) {
        if (rawSound.samples == null || rawSound.samples.length == 0) {
            return null;
        }
        return new RawPcmStream(rawSound, (int)(rawSound.sampleRate * 256L * n / (PcmPlayer.field201 * 1511829972)), n2 << 6);
    }
    
    public synchronized void method295(final int n) {
        this.dc(n << 6, this.method285());
    }
    
    public synchronized void fill(final int[] array, final int n, int n2) {
        if (this.field245 == 0 && this.field248 == 0) {
            this.skip(n2);
            return;
        }
        final RawSound rawSound = (RawSound)this.ar;
        final int n3 = this.start << 8;
        final int n4 = this.end << 8;
        final int field239 = rawSound.samples.length << 8;
        final int n5 = n4 - n3;
        if (n5 <= 0) {
            this.numLoops = 0;
        }
        int n6 = n;
        n2 += n;
        if (this.field239 < 0) {
            if (this.field238 <= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = 0;
        }
        if (this.field239 >= field239) {
            if (this.field238 >= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = field239 - 1;
        }
        if (this.numLoops >= 0) {
            Label_1078: {
                if (this.numLoops > 0) {
                    if (this.field247) {
                        if (this.field238 < 0) {
                            n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                            if (this.field239 >= n3) {
                                return;
                            }
                            this.field239 = n3 + n3 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_1078;
                            }
                        }
                        do {
                            n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                            if (this.field239 < n4) {
                                return;
                            }
                            this.field239 = n4 + n4 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break;
                            }
                            n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                            if (this.field239 >= n3) {
                                return;
                            }
                            this.field239 = n3 + n3 - 1 - this.field239;
                            this.field238 = -this.field238;
                        } while (--this.numLoops != 0);
                    }
                    else if (this.field238 < 0) {
                        while (true) {
                            n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                            if (this.field239 >= n3) {
                                return;
                            }
                            final int n7 = (n4 - 1 - this.field239) / n5;
                            if (n7 >= this.numLoops) {
                                this.field239 += n5 * this.numLoops;
                                this.numLoops = 0;
                                break;
                            }
                            this.field239 += n5 * n7;
                            this.numLoops -= n7;
                        }
                    }
                    else {
                        Label_0988: {
                            break Label_0988;
                            int i = 0;
                            do {
                                this.field239 -= n5 * i;
                                this.numLoops -= i;
                                n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
                                if (this.field239 < n4) {
                                    return;
                                }
                                i = (this.field239 - n3) / n5;
                            } while (i < this.numLoops);
                        }
                        this.field239 -= n5 * this.numLoops;
                        this.numLoops = 0;
                    }
                }
            }
            if (this.field238 < 0) {
                this.method275(array, n6, 0, n2, 0);
                if (this.field239 < 0) {
                    this.field239 = -1;
                    fs(this);
                    this.hw();
                }
            }
            else {
                this.method274(array, n6, field239, n2, 0);
                if (this.field239 >= field239) {
                    this.field239 = field239;
                    fs(this);
                    this.hw();
                }
            }
            return;
        }
        if (this.field247) {
            Label_0319: {
                if (this.field238 >= 0) {
                    break Label_0319;
                }
                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                if (this.field239 >= n3) {
                    return;
                }
                this.field239 = n3 + n3 - 1 - this.field239;
                this.field238 = -this.field238;
                break Label_0319;
                do {
                    this.field239 = n3 + n3 - 1 - this.field239;
                    this.field238 = -this.field238;
                    final int method274 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                    if (this.field239 < n4) {
                        return;
                    }
                    this.field239 = n4 + n4 - 1 - this.field239;
                    this.field238 = -this.field238;
                    n6 = this.method275(array, method274, n3, n2, rawSound.samples[this.start]);
                } while (this.field239 < n3);
            }
            return;
        }
        if (this.field238 < 0) {
            Label_0704: {
                break Label_0704;
                do {
                    this.field239 = n4 - 1 - (n4 - 1 - this.field239) % n5;
                    n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                } while (this.field239 < n3);
            }
            return;
        }
        while (true) {
            n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
            if (this.field239 < n4) {
                break;
            }
            this.field239 = n3 + (this.field239 - n3) % n5;
        }
    }
    
    public synchronized void method268(int field248) {
        if (field248 == 0) {
            this.method260(0);
            this.hw();
            return;
        }
        if (this.field242 == 0 && this.field243 == 0) {
            this.field248 = 0;
            this.field245 = 0;
            this.field241 = 0;
            this.hw();
            return;
        }
        int n = -this.field241;
        if (this.field241 > n) {
            n = this.field241;
        }
        if (-this.field242 > n) {
            n = -this.field242;
        }
        if (this.field242 > n) {
            n = this.field242;
        }
        if (-this.field243 > n) {
            n = -this.field243;
        }
        if (this.field243 > n) {
            n = this.field243;
        }
        if (field248 > n) {
            field248 = n;
        }
        this.field248 = field248;
        this.field245 = Integer.MIN_VALUE;
        this.field244 = -this.field241 / field248;
        this.field237 = -this.field242 / field248;
        this.field251 = -this.field243 / field248;
    }
    
    public synchronized void method263(int field239) {
        final int n = ((RawSound)this.ar).samples.length << 8;
        if (field239 < -1) {
            field239 = -1;
        }
        if (field239 > n) {
            field239 = n;
        }
        this.field239 = field239;
    }
    
    synchronized void dw(final int n) {
        this.dc(n, this.method285());
    }
    
    public static RawPcmStream cj(final RawSound rawSound, final int n, final int n2, final int n3) {
        if (rawSound.samples == null || rawSound.samples.length == 0) {
            return null;
        }
        return new RawPcmStream(rawSound, n, n2, n3);
    }
    
    @Override
    protected PcmStream be() {
        return null;
    }
    
    public synchronized void method298(final int n, final int n2) {
        this.method267(n, n2, this.method285());
    }
    
    static int ek(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n6 - n) > n5) {
            n4 = n5;
        }
        rawPcmStream.field242 += rawPcmStream.field237 * (n4 - i);
        rawPcmStream.field243 += rawPcmStream.field251 * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n++] * n2, n2 += n3, n8 = i++, array2[n8] += array[n++] * n2, n2 += n3, n9 = i++, array2[n9] += array[n++] * n2, n2 += n3, n10 = i++, array2[n10] += array[n++] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n++] * n2, n2 += n3) {}
        rawPcmStream.field241 = n2 >> 2;
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    static int eh(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n6 - n) > n5) {
            n4 = n5;
        }
        rawPcmStream.field242 += rawPcmStream.field237 * (n4 - i);
        rawPcmStream.field243 += rawPcmStream.field251 * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n++] * n2, n2 += n3, n8 = i++, array2[n8] += array[n++] * n2, n2 += n3, n9 = i++, array2[n9] += array[n++] * n2, n2 += n3, n10 = i++, array2[n10] += array[n++] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n++] * n2, n2 += n3) {}
        rawPcmStream.field241 = n2 >> 2;
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    static int fh(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        rawPcmStream.field242 -= rawPcmStream.field237 * i;
        rawPcmStream.field243 -= rawPcmStream.field251 * i;
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 257) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF)) * field240 >> 6;
            field240 += n3;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 1) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n2 = n8; i < n4; n10 = i++, array2[n10] += ((n << 8) + (n2 - n) * (field239 & 0xFF)) * field240 >> 6, field240 += n3, field239 += n7) {
            n = array[field239 >> 8];
        }
        rawPcmStream.field242 += rawPcmStream.field237 * i;
        rawPcmStream.field243 += rawPcmStream.field251 * i;
        rawPcmStream.field241 = field240;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    static int ev(int n, int n2, final byte[] array, final int[] array2, int field239, int i, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 - field239 + n8 - 257) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2];
            n = (n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[field239 >> 8];
            n = (n << 8) + (n2 - n) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            field239 += n8;
        }
        rawPcmStream.field239 = field239;
        return i >> 1;
    }
    
    static int es(final byte[] array, final int[] array2, int n, int i, int n2, int n3, final int n4, int n5, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n5 >>= 8;
        n2 <<= 2;
        if ((n3 = i + n5 - n) > n4) {
            n3 = n4;
        }
        int n6;
        int n7;
        int n8;
        int n9;
        for (n3 -= 3; i < n3; n6 = i++, array2[n6] += array[n++] * n2, n7 = i++, array2[n7] += array[n++] * n2, n8 = i++, array2[n8] += array[n++] * n2, n9 = i++, array2[n9] += array[n++] * n2) {}
        int n10;
        for (n3 += 3; i < n3; n10 = i++, array2[n10] += array[n++] * n2) {}
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    static int ee(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n - (n6 - 1)) > n5) {
            n4 = n5;
        }
        rawPcmStream.field242 += rawPcmStream.field237 * (n4 - i);
        rawPcmStream.field243 += rawPcmStream.field251 * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n--] * n2, n2 += n3, n8 = i++, array2[n8] += array[n--] * n2, n2 += n3, n9 = i++, array2[n9] += array[n--] * n2, n2 += n3, n10 = i++, array2[n10] += array[n--] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n--] * n2, n2 += n3) {}
        rawPcmStream.field241 = n2 >> 2;
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    public synchronized void method269(final int field238) {
        if (this.field238 < 0) {
            this.field238 = -field238;
        }
        else {
            this.field238 = field238;
        }
    }
    
    synchronized void method260(final int n) {
        this.dc(n, this.method285());
    }
    
    public synchronized void skip(int field248) {
        if (this.field248 > 0) {
            if (field248 >= this.field248) {
                if (this.field245 == Integer.MIN_VALUE) {
                    this.field245 = 0;
                    this.field243 = 0;
                    this.field242 = 0;
                    this.field241 = 0;
                    this.hw();
                    field248 = this.field248;
                }
                this.field248 = 0;
                this.method258();
            }
            else {
                this.field241 += this.field244 * field248;
                this.field242 += this.field237 * field248;
                this.field243 += this.field251 * field248;
                this.field248 -= field248;
            }
        }
        final RawSound rawSound = (RawSound)this.ar;
        final int n = this.start << 8;
        final int n2 = this.end << 8;
        final int field249 = rawSound.samples.length << 8;
        final int n3 = n2 - n;
        if (n3 <= 0) {
            this.numLoops = 0;
        }
        if (this.field239 < 0) {
            if (this.field238 <= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = 0;
        }
        if (this.field239 >= field249) {
            if (this.field238 >= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = field249 - 1;
        }
        this.field239 += this.field238 * field248;
        if (this.numLoops >= 0) {
            Label_0921: {
                if (this.numLoops > 0) {
                    if (this.field247) {
                        if (this.field238 < 0) {
                            if (this.field239 >= n) {
                                return;
                            }
                            this.field239 = n + n - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0921;
                            }
                        }
                        while (this.field239 >= n2) {
                            this.field239 = n2 + n2 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0921;
                            }
                            if (this.field239 >= n) {
                                return;
                            }
                            this.field239 = n + n - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0921;
                            }
                        }
                        return;
                    }
                    if (this.field238 < 0) {
                        if (this.field239 >= n) {
                            return;
                        }
                        final int n4 = (n2 - 1 - this.field239) / n3;
                        if (n4 >= this.numLoops) {
                            this.field239 += n3 * this.numLoops;
                            this.numLoops = 0;
                            break Label_0921;
                        }
                        this.field239 += n3 * n4;
                        this.numLoops -= n4;
                    }
                    else {
                        if (this.field239 < n2) {
                            return;
                        }
                        final int n5 = (this.field239 - n) / n3;
                        if (n5 >= this.numLoops) {
                            this.field239 -= n3 * this.numLoops;
                            this.numLoops = 0;
                            break Label_0921;
                        }
                        this.field239 -= n3 * n5;
                        this.numLoops -= n5;
                    }
                    return;
                }
            }
            if (this.field238 < 0) {
                if (this.field239 < 0) {
                    this.field239 = -1;
                    fs(this);
                    this.hw();
                }
            }
            else if (this.field239 >= field249) {
                this.field239 = field249;
                fs(this);
                this.hw();
            }
            return;
        }
        if (this.field247) {
            if (this.field238 < 0) {
                if (this.field239 >= n) {
                    return;
                }
                this.field239 = n + n - 1 - this.field239;
                this.field238 = -this.field238;
            }
            while (this.field239 >= n2) {
                this.field239 = n2 + n2 - 1 - this.field239;
                this.field238 = -this.field238;
                if (this.field239 >= n) {
                    return;
                }
                this.field239 = n + n - 1 - this.field239;
                this.field238 = -this.field238;
            }
            return;
        }
        if (this.field238 < 0) {
            if (this.field239 >= n) {
                return;
            }
            this.field239 = n2 - 1 - (n2 - 1 - this.field239) % n3;
        }
        else {
            if (this.field239 < n2) {
                return;
            }
            this.field239 = n + (this.field239 - n) % n3;
        }
    }
    
    public synchronized int dt() {
        return (this.field240 < 0) ? -1 : this.field240;
    }
    
    @Override
    protected PcmStream bi() {
        return null;
    }
    
    static int method279(final byte[] array, final int[] array2, int n, int i, int n2, int n3, final int n4, int n5, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n5 >>= 8;
        n2 <<= 2;
        if ((n3 = i + n - (n5 - 1)) > n4) {
            n3 = n4;
        }
        int n6;
        int n7;
        int n8;
        int n9;
        for (n3 -= 3; i < n3; n6 = i++, array2[n6] += array[n--] * n2, n7 = i++, array2[n7] += array[n--] * n2, n8 = i++, array2[n8] += array[n--] * n2, n9 = i++, array2[n9] += array[n--] * n2) {}
        int n10;
        for (n3 += 3; i < n3; n10 = i++, array2[n10] += array[n--] * n2) {}
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    public synchronized int dl() {
        return (this.field245 == Integer.MIN_VALUE) ? 0 : this.field245;
    }
    
    static int method288(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, int field241, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        rawPcmStream.field241 -= rawPcmStream.field244 * i;
        if (n8 == 0 || (n5 = i + (n7 + 256 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * field240 >> 6, field240 += n3, n11 = i++, array2[n11] += n * field241 >> 6, field241 += n4, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            n = (n << 8) + (array[n2] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (array[field239 >> 8] - n2) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * field240 >> 6;
            field240 += n3;
            final int n13 = i++;
            array2[n13] += n * field241 >> 6;
            field241 += n4;
            field239 += n8;
        }
        i >>= 1;
        rawPcmStream.field241 += rawPcmStream.field244 * i;
        rawPcmStream.field242 = field240;
        rawPcmStream.field243 = field241;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    @Override
    protected int bo() {
        if (this.field245 == 0 && this.field248 == 0) {
            return 0;
        }
        return 1;
    }
    
    synchronized void di(final int field245, final int field246) {
        this.field245 = field245;
        this.field240 = field246;
        this.field248 = 0;
        this.method258();
    }
    
    public static void fs(final RawPcmStream rawPcmStream) {
        if (rawPcmStream == null) {
            rawPcmStream.method265();
            return;
        }
        if (rawPcmStream.field248 != 0) {
            if (rawPcmStream.field245 == Integer.MIN_VALUE) {
                rawPcmStream.field245 = 0;
            }
            rawPcmStream.field248 = 0;
            rawPcmStream.method258();
        }
    }
    
    static int fs(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        rawPcmStream.field242 -= rawPcmStream.field237 * i;
        rawPcmStream.field243 -= rawPcmStream.field251 * i;
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 257) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF)) * field240 >> 6;
            field240 += n3;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 1) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n2 = n8; i < n4; n10 = i++, array2[n10] += ((n << 8) + (n2 - n) * (field239 & 0xFF)) * field240 >> 6, field240 += n3, field239 += n7) {
            n = array[field239 >> 8];
        }
        rawPcmStream.field242 += rawPcmStream.field237 * i;
        rawPcmStream.field243 += rawPcmStream.field251 * i;
        rawPcmStream.field241 = field240;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    public void np(final int numLoops) {
        this.setNumLoops(numLoops);
    }
    
    static int method280(int n, int n2, final byte[] array, final int[] array2, int field239, int i, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 257) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF)) * n3 >> 6;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 1) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n2 = n8; i < n4; n10 = i++, array2[n10] += ((n << 8) + (n2 - n) * (field239 & 0xFF)) * n3 >> 6, field239 += n7) {
            n = array[field239 >> 8];
        }
        rawPcmStream.field239 = field239;
        return i;
    }
    
    void ct() {
        this.field241 = this.field245;
        this.field242 = method297(this.field245, this.field240);
        this.field243 = method255(this.field245, this.field240);
    }
    
    static int method293(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, int n6, int n7, final int n8, int n9, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n9 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        if ((n7 = i + n2 - (n9 - 1)) > n8) {
            n7 = n8;
        }
        rawPcmStream.field241 += rawPcmStream.field244 * (n7 - i);
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        for (i <<= 1, n7 <<= 1, n7 -= 6; i < n7; n10 = i++, array2[n10] += n * n3, n3 += n5, n11 = i++, array2[n11] += n * n4, n4 += n6, n = array[n2--], n12 = i++, array2[n12] += n * n3, n3 += n5, n13 = i++, array2[n13] += n * n4, n4 += n6, n = array[n2--], n14 = i++, array2[n14] += n * n3, n3 += n5, n15 = i++, array2[n15] += n * n4, n4 += n6, n = array[n2--], n16 = i++, array2[n16] += n * n3, n3 += n5, n17 = i++, array2[n17] += n * n4, n4 += n6) {
            n = array[n2--];
        }
        int n18;
        int n19;
        for (n7 += 6; i < n7; n18 = i++, array2[n18] += n * n3, n3 += n5, n19 = i++, array2[n19] += n * n4, n4 += n6) {
            n = array[n2--];
        }
        rawPcmStream.field242 = n3 >> 2;
        rawPcmStream.field243 = n4 >> 2;
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    public synchronized int dv() {
        return (this.field240 < 0) ? -1 : this.field240;
    }
    
    static int fn(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, int field241, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        rawPcmStream.field241 -= rawPcmStream.field244 * i;
        if (n8 == 0 || (n5 = i + (n7 + 256 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * field240 >> 6, field240 += n3, n11 = i++, array2[n11] += n * field241 >> 6, field241 += n4, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            n = (n << 8) + (array[n2] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (array[field239 >> 8] - n2) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * field240 >> 6;
            field240 += n3;
            final int n13 = i++;
            array2[n13] += n * field241 >> 6;
            field241 += n4;
            field239 += n8;
        }
        i >>= 1;
        rawPcmStream.field241 += rawPcmStream.field244 * i;
        rawPcmStream.field242 = field240;
        rawPcmStream.field243 = field241;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    public synchronized void bt(final int[] array, final int n, int n2) {
        if (this.field245 == 0 && this.field248 == 0) {
            this.skip(n2);
            return;
        }
        final RawSound rawSound = (RawSound)this.ar;
        final int n3 = this.start << 8;
        final int n4 = this.end << 8;
        final int field239 = rawSound.samples.length << 8;
        final int n5 = n4 - n3;
        if (n5 <= 0) {
            this.numLoops = 0;
        }
        int n6 = n;
        n2 += n;
        if (this.field239 < 0) {
            if (this.field238 <= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = 0;
        }
        if (this.field239 >= field239) {
            if (this.field238 >= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = field239 - 1;
        }
        if (this.numLoops >= 0) {
            Label_1061: {
                if (this.numLoops > 0) {
                    if (this.field247) {
                        Label_0623: {
                            if (this.field238 >= 0) {
                                break Label_0623;
                            }
                            n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                            if (this.field239 >= n3) {
                                return;
                            }
                            this.field239 = n3 + n3 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_1061;
                            }
                            break Label_0623;
                            do {
                                this.field239 = n3 + n3 - 1 - this.field239;
                                this.field238 = -this.field238;
                                if (--this.numLoops == 0) {
                                    break Label_1061;
                                }
                                n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                                if (this.field239 < n4) {
                                    return;
                                }
                                this.field239 = n4 + n4 - 1 - this.field239;
                                this.field238 = -this.field238;
                                if (--this.numLoops == 0) {
                                    break Label_1061;
                                }
                                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                            } while (this.field239 < n3);
                        }
                        return;
                    }
                    if (this.field238 < 0) {
                        Label_0792: {
                            break Label_0792;
                            do {
                                final int n7 = (n4 - 1 - this.field239) / n5;
                                if (n7 >= this.numLoops) {
                                    this.field239 += n5 * this.numLoops;
                                    this.numLoops = 0;
                                    break Label_1061;
                                }
                                this.field239 += n5 * n7;
                                this.numLoops -= n7;
                                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                            } while (this.field239 < n3);
                        }
                        return;
                    }
                    while (true) {
                        n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
                        if (this.field239 < n4) {
                            return;
                        }
                        final int n8 = (this.field239 - n3) / n5;
                        if (n8 >= this.numLoops) {
                            this.field239 -= n5 * this.numLoops;
                            this.numLoops = 0;
                            break;
                        }
                        this.field239 -= n5 * n8;
                        this.numLoops -= n8;
                    }
                }
            }
            if (this.field238 < 0) {
                this.method275(array, n6, 0, n2, 0);
                if (this.field239 < 0) {
                    this.field239 = -1;
                    fs(this);
                    this.hw();
                }
            }
            else {
                this.method274(array, n6, field239, n2, 0);
                if (this.field239 >= field239) {
                    this.field239 = field239;
                    fs(this);
                    this.hw();
                }
            }
            return;
        }
        if (this.field247) {
            Label_0285: {
                if (this.field238 >= 0) {
                    break Label_0285;
                }
                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                if (this.field239 >= n3) {
                    return;
                }
                this.field239 = n3 + n3 - 1 - this.field239;
                this.field238 = -this.field238;
                break Label_0285;
                do {
                    this.field239 = n3 + n3 - 1 - this.field239;
                    this.field238 = -this.field238;
                    final int method274 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                    if (this.field239 < n4) {
                        return;
                    }
                    this.field239 = n4 + n4 - 1 - this.field239;
                    this.field238 = -this.field238;
                    n6 = this.method275(array, method274, n3, n2, rawSound.samples[this.start]);
                } while (this.field239 < n3);
            }
            return;
        }
        if (this.field238 < 0) {
            Label_0321: {
                break Label_0321;
                do {
                    this.field239 = n4 - 1 - (n4 - 1 - this.field239) % n5;
                    n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                } while (this.field239 < n3);
            }
            return;
        }
        while (true) {
            n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
            if (this.field239 < n4) {
                break;
            }
            this.field239 = n3 + (this.field239 - n3) % n5;
        }
    }
    
    public synchronized int ds() {
        return (this.field238 < 0) ? (-this.field238) : this.field238;
    }
    
    public static void ih(final RawPcmStream rawPcmStream) {
        rawPcmStream.field241 = rawPcmStream.field245;
        rawPcmStream.field242 = method297(rawPcmStream.field245, rawPcmStream.field240);
        rawPcmStream.field243 = method255(rawPcmStream.field245, rawPcmStream.field240);
    }
    
    public synchronized void dh(final boolean b) {
        this.field238 = (this.field238 ^ this.field238 >> 31) + (this.field238 >>> 31);
        if (b) {
            this.field238 = -this.field238;
        }
    }
    
    static int method281(int n, int n2, final byte[] array, final int[] array2, int field239, int i, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 - field239 + n8 - 257) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2];
            n = (n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[field239 >> 8];
            n = (n << 8) + (n2 - n) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            field239 += n8;
        }
        rawPcmStream.field239 = field239;
        return i >> 1;
    }
    
    static int method277(final byte[] array, final int[] array2, int n, int i, int n2, int n3, final int n4, int n5, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n5 >>= 8;
        n2 <<= 2;
        if ((n3 = i + n5 - n) > n4) {
            n3 = n4;
        }
        int n6;
        int n7;
        int n8;
        int n9;
        for (n3 -= 3; i < n3; n6 = i++, array2[n6] += array[n++] * n2, n7 = i++, array2[n7] += array[n++] * n2, n8 = i++, array2[n8] += array[n++] * n2, n9 = i++, array2[n9] += array[n++] * n2) {}
        int n10;
        for (n3 += 3; i < n3; n10 = i++, array2[n10] += array[n++] * n2) {}
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    static int ei(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n - (n6 - 1)) > n5) {
            n4 = n5;
        }
        rawPcmStream.field242 += rawPcmStream.field237 * (n4 - i);
        rawPcmStream.field243 += rawPcmStream.field251 * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n--] * n2, n2 += n3, n8 = i++, array2[n8] += array[n--] * n2, n2 += n3, n9 = i++, array2[n9] += array[n--] * n2, n2 += n3, n10 = i++, array2[n10] += array[n--] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n--] * n2, n2 += n3) {}
        rawPcmStream.field241 = n2 >> 2;
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    static int method292(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, int n6, int n7, final int n8, int n9, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n9 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        if ((n7 = i + n9 - n2) > n8) {
            n7 = n8;
        }
        rawPcmStream.field241 += rawPcmStream.field244 * (n7 - i);
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        for (i <<= 1, n7 <<= 1, n7 -= 6; i < n7; n10 = i++, array2[n10] += n * n3, n3 += n5, n11 = i++, array2[n11] += n * n4, n4 += n6, n = array[n2++], n12 = i++, array2[n12] += n * n3, n3 += n5, n13 = i++, array2[n13] += n * n4, n4 += n6, n = array[n2++], n14 = i++, array2[n14] += n * n3, n3 += n5, n15 = i++, array2[n15] += n * n4, n4 += n6, n = array[n2++], n16 = i++, array2[n16] += n * n3, n3 += n5, n17 = i++, array2[n17] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        int n18;
        int n19;
        for (n7 += 6; i < n7; n18 = i++, array2[n18] += n * n3, n3 += n5, n19 = i++, array2[n19] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        rawPcmStream.field242 = n3 >> 2;
        rawPcmStream.field243 = n4 >> 2;
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    public static RawPcmStream createRawPcmStream(final RawSound rawSound, final int n, final int n2) {
        if (rawSound.samples != null && rawSound.samples.length != 0) {
            return new RawPcmStream(rawSound, (int)(rawSound.sampleRate * 256L * n / (PcmPlayer.field201 * 1511829972)), n2 << 6);
        }
        return null;
    }
    
    void method265() {
        if (this.field241 != 0) {
            if (this.field238 == Integer.MIN_VALUE) {
                this.field248 = 0;
            }
            this.field242 = 0;
            this.du();
        }
    }
    
    static int em(int n, int n2, final byte[] array, final int[] array2, int field239, int i, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 - field239 + n8 + 941768931) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2];
            n = (n << 8) + (array[n2 + 1] - n) * (field239 & 0xE2F116E2);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[field239 >> 8];
            n = (n << 8) + (n2 - n) * (field239 & 0x7C3DBD43);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            field239 += n8;
        }
        rawPcmStream.field239 = field239;
        return i >> 1;
    }
    
    @Override
    protected int vmethod5648() {
        if (this.field245 == 0 && this.field248 == 0) {
            return 0;
        }
        return 1;
    }
    
    public synchronized void df(int field248, final int field249, final int field250) {
        if (field248 == 0) {
            this.dc(field249, field250);
            return;
        }
        final int method297 = method297(field249, field250);
        final int method298 = method255(field249, field250);
        if (this.field242 == method297 && this.field243 == method298) {
            this.field248 = 0;
            return;
        }
        int n = field249 - this.field241;
        if (this.field241 - field249 > n) {
            n = this.field241 - field249;
        }
        if (method297 - this.field242 > n) {
            n = method297 - this.field242;
        }
        if (this.field242 - method297 > n) {
            n = this.field242 - method297;
        }
        if (method298 - this.field243 > n) {
            n = method298 - this.field243;
        }
        if (this.field243 - method298 > n) {
            n = this.field243 - method298;
        }
        if (field248 > n) {
            field248 = n;
        }
        this.field248 = field248;
        this.field245 = field249;
        this.field240 = field250;
        this.field244 = (field249 - this.field241) / field248;
        this.field237 = (method297 - this.field242) / field248;
        this.field251 = (method298 - this.field243) / field248;
    }
    
    int et(final int[] array, int n, final int n2, final int n3, final int n4) {
        while (this.field248 > 0) {
            int n5 = n + this.field248;
            if (n5 > n3) {
                n5 = n3;
            }
            this.field248 += n;
            if (this.field238 == 256 && (this.field239 & 0xF075B047) == 0x0) {
                if (PcmPlayer.PcmPlayer_stereo) {
                    n = method292(0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, this.field237, this.field251, 0, n5, n2, this);
                }
                else {
                    n = method290(((RawSound)this.ar).samples, array, this.field239, n, this.field241, this.field244, 0, n5, n2, this);
                }
            }
            else if (PcmPlayer.PcmPlayer_stereo) {
                n = method300(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, this.field237, this.field251, 0, n5, n2, this, this.field238, n4);
            }
            else {
                n = method266(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field241, this.field244, 0, n5, n2, this, this.field238, n4);
            }
            this.field248 -= n;
            if (this.field248 != 0) {
                return n;
            }
            if (this.method276()) {
                return n3;
            }
        }
        if (this.field238 == 256 && (this.field239 & 0xFF) == 0x0) {
            if (PcmPlayer.PcmPlayer_stereo) {
                return method278(0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, 0, n3, n2, this);
            }
            return method277(((RawSound)this.ar).samples, array, this.field239, n, this.field241, 0, n3, n2, this);
        }
        else {
            if (PcmPlayer.PcmPlayer_stereo) {
                return method281(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, 0, n3, n2, this, this.field238, n4);
            }
            return method280(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field241, 0, n3, n2, this, this.field238, n4);
        }
    }
    
    static int method287(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        rawPcmStream.field242 -= rawPcmStream.field237 * i;
        rawPcmStream.field243 -= rawPcmStream.field251 * i;
        if (n7 == 0 || (n4 = i + (n6 + 256 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2] - n) * (field239 & 0xFF)) * field240 >> 6;
            field240 += n3;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n = n8, n2 = n7; i < n4; n10 = i++, array2[n10] += ((n << 8) + (array[field239 >> 8] - n) * (field239 & 0xFF)) * field240 >> 6, field240 += n3, field239 += n2) {}
        rawPcmStream.field242 += rawPcmStream.field237 * i;
        rawPcmStream.field243 += rawPcmStream.field251 * i;
        rawPcmStream.field241 = field240;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    synchronized void dm(final int n) {
        this.dc(n, this.method285());
    }
    
    static int method255(final int n, final int n2) {
        return (n2 < 0) ? (-n) : ((int)(n * Math.sqrt(n2 * 1.220703125E-4) + 0.5));
    }
    
    public static RawPcmStream method294(final RawSound rawSound, final int n, final int n2, final int n3) {
        if (rawSound.samples != null && rawSound.samples.length != 0) {
            return new RawPcmStream(rawSound, n, n2, n3);
        }
        return null;
    }
    
    public static RawPcmStream cx(final RawSound rawSound, final int n, final int n2) {
        if (rawSound.samples == null || rawSound.samples.length == 0) {
            return null;
        }
        return new RawPcmStream(rawSound, (int)(rawSound.sampleRate * 256L * n / (PcmPlayer.field201 * 1511829972)), n2 << 6);
    }
    
    static int ec(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, int n6, int n7, final int n8, int n9, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n9 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        if ((n7 = i + n9 - n2) > n8) {
            n7 = n8;
        }
        rawPcmStream.field241 += rawPcmStream.field244 * (n7 - i);
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        for (i <<= 1, n7 <<= 1, n7 -= 6; i < n7; n10 = i++, array2[n10] += n * n3, n3 += n5, n11 = i++, array2[n11] += n * n4, n4 += n6, n = array[n2++], n12 = i++, array2[n12] += n * n3, n3 += n5, n13 = i++, array2[n13] += n * n4, n4 += n6, n = array[n2++], n14 = i++, array2[n14] += n * n3, n3 += n5, n15 = i++, array2[n15] += n * n4, n4 += n6, n = array[n2++], n16 = i++, array2[n16] += n * n3, n3 += n5, n17 = i++, array2[n17] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        int n18;
        int n19;
        for (n7 += 6; i < n7; n18 = i++, array2[n18] += n * n3, n3 += n5, n19 = i++, array2[n19] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        rawPcmStream.field242 = n3 >> 2;
        rawPcmStream.field243 = n4 >> 2;
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    static int method278(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = i + n7 - n2) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2++], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2++], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2++], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2++];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2++];
        }
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    public synchronized int dk() {
        return (this.field245 == Integer.MIN_VALUE) ? 0 : this.field245;
    }
    
    synchronized void do(final int field245, final int field246) {
        this.field245 = field245;
        this.field240 = field246;
        this.field248 = 0;
        this.method258();
    }
    
    public synchronized void dz(int field239) {
        final int n = ((RawSound)this.ar).samples.length << 8;
        if (field239 < -1) {
            field239 = -1;
        }
        if (field239 > n) {
            field239 = n;
        }
        this.field239 = field239;
    }
    
    public synchronized void de(final boolean b) {
        this.field238 = (this.field238 ^ this.field238 >> 1601131267) + (this.field238 >>> -884329064);
        if (b) {
            this.field238 = -this.field238;
        }
    }
    
    static int fl(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, int field241, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        rawPcmStream.field241 -= rawPcmStream.field244 * i;
        if (n8 == 0 || (n5 = i + (n7 - field239 + n8 - 257) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * field240 >> 6, field240 += n3, n11 = i++, array2[n11] += n * field241 >> 6, field241 += n4, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2];
            n = (n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[field239 >> 8];
            n = (n << 8) + (n2 - n) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * field240 >> 6;
            field240 += n3;
            final int n13 = i++;
            array2[n13] += n * field241 >> 6;
            field241 += n4;
            field239 += n8;
        }
        i >>= 1;
        rawPcmStream.field241 += rawPcmStream.field244 * i;
        rawPcmStream.field242 = field240;
        rawPcmStream.field243 = field241;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    static int fo(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        rawPcmStream.field242 -= rawPcmStream.field237 * i;
        rawPcmStream.field243 -= rawPcmStream.field251 * i;
        if (n7 == 0 || (n4 = i + (n6 + 256 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2] - n) * (field239 & 0xFF)) * field240 >> 6;
            field240 += n3;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n = n8, n2 = n7; i < n4; n10 = i++, array2[n10] += ((n << 8) + (array[field239 >> 8] - n) * (field239 & 0xFF)) * field240 >> 6, field240 += n3, field239 += n2) {}
        rawPcmStream.field242 += rawPcmStream.field237 * i;
        rawPcmStream.field243 += rawPcmStream.field251 * i;
        rawPcmStream.field241 = field240;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    static int ed(int n, int n2, final byte[] array, final int[] array2, int field239, int i, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 - field239 + n8 + 206029878) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2];
            n = (n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[field239 >> 8];
            n = (n << 8) + (n2 - n) * (field239 & 0xFF);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            field239 += n8;
        }
        rawPcmStream.field239 = field239;
        return i >> 1;
    }
    
    boolean ea() {
        int field245 = this.field245;
        int method255;
        int method256;
        if (field245 == Integer.MIN_VALUE) {
            method255 = 0;
            method256 = 0;
            field245 = 0;
        }
        else {
            method256 = method297(field245, this.field240);
            method255 = method255(field245, this.field240);
        }
        if (this.field241 != field245 || this.field242 != method256 || this.field243 != method255) {
            if (this.field241 < field245) {
                this.field244 = 1;
                this.field248 = field245 - this.field241;
            }
            else if (this.field241 > field245) {
                this.field244 = -1;
                this.field248 = this.field241 - field245;
            }
            else {
                this.field244 = 0;
            }
            if (this.field242 < method256) {
                this.field237 = 1;
                if (this.field248 == 0 || this.field248 > method256 - this.field242) {
                    this.field248 = method256 - this.field242;
                }
            }
            else if (this.field242 > method256) {
                this.field237 = -1;
                if (this.field248 == 0 || this.field248 > this.field242 - method256) {
                    this.field248 = this.field242 - method256;
                }
            }
            else {
                this.field237 = 0;
            }
            if (this.field243 < method255) {
                this.field251 = 1;
                if (this.field248 == 0 || this.field248 > method255 - this.field243) {
                    this.field248 = method255 - this.field243;
                }
            }
            else if (this.field243 > method255) {
                this.field251 = -1;
                if (this.field248 == 0 || this.field248 > this.field243 - method255) {
                    this.field248 = this.field243 - method255;
                }
            }
            else {
                this.field251 = 0;
            }
            return false;
        }
        if (this.field245 == Integer.MIN_VALUE) {
            this.field245 = 0;
            this.field243 = 0;
            this.field242 = 0;
            this.field241 = 0;
            this.hw();
            return true;
        }
        this.method258();
        return false;
    }
    
    void method258() {
        this.field241 = this.field245;
        this.field242 = method297(this.field245, this.field240);
        this.field243 = method255(this.field245, this.field240);
    }
    
    static int fe(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, int n6, int n7, final int n8, int n9, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n9 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        if ((n7 = i + n2 - (n9 - 1)) > n8) {
            n7 = n8;
        }
        rawPcmStream.field241 += rawPcmStream.field244 * (n7 - i);
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        for (i <<= 1, n7 <<= 1, n7 -= 6; i < n7; n10 = i++, array2[n10] += n * n3, n3 += n5, n11 = i++, array2[n11] += n * n4, n4 += n6, n = array[n2--], n12 = i++, array2[n12] += n * n3, n3 += n5, n13 = i++, array2[n13] += n * n4, n4 += n6, n = array[n2--], n14 = i++, array2[n14] += n * n3, n3 += n5, n15 = i++, array2[n15] += n * n4, n4 += n6, n = array[n2--], n16 = i++, array2[n16] += n * n3, n3 += n5, n17 = i++, array2[n17] += n * n4, n4 += n6) {
            n = array[n2--];
        }
        int n18;
        int n19;
        for (n7 += 6; i < n7; n18 = i++, array2[n18] += n * n3, n3 += n5, n19 = i++, array2[n19] += n * n4, n4 += n6) {
            n = array[n2--];
        }
        rawPcmStream.field242 = n3 >> 2;
        rawPcmStream.field243 = n4 >> 2;
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    public synchronized void setNumLoops(final int numLoops) {
        this.numLoops = numLoops;
    }
    
    synchronized void method261(final int field245, final int field246) {
        this.field245 = field245;
        this.field240 = field246;
        this.field248 = 0;
        this.method258();
    }
    
    static int fi(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        rawPcmStream.field242 -= rawPcmStream.field237 * i;
        rawPcmStream.field243 -= rawPcmStream.field251 * i;
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 257) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2 + 1] - n) * (field239 & 0xFF)) * field240 >> 6;
            field240 += n3;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7 - 1) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n2 = n8; i < n4; n10 = i++, array2[n10] += ((n << 8) + (n2 - n) * (field239 & 0x5002B3B9)) * field240 >> 6, field240 += n3, field239 += n7) {
            n = array[field239 >> 8];
        }
        rawPcmStream.field242 += rawPcmStream.field237 * i;
        rawPcmStream.field243 += rawPcmStream.field251 * i;
        rawPcmStream.field241 = field240;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    public synchronized void dx(int field248) {
        if (field248 == 0) {
            this.method260(0);
            this.hw();
            return;
        }
        if (this.field242 == 0 && this.field243 == 0) {
            this.field248 = 0;
            this.field245 = 0;
            this.field241 = 0;
            this.hw();
            return;
        }
        int n = -this.field241;
        if (this.field241 > n) {
            n = this.field241;
        }
        if (-this.field242 > n) {
            n = -this.field242;
        }
        if (this.field242 > n) {
            n = this.field242;
        }
        if (-this.field243 > n) {
            n = -this.field243;
        }
        if (this.field243 > n) {
            n = this.field243;
        }
        if (field248 > n) {
            field248 = n;
        }
        this.field248 = field248;
        this.field245 = Integer.MIN_VALUE;
        this.field244 = -this.field241 / field248;
        this.field237 = -this.field242 / field248;
        this.field251 = -this.field243 / field248;
    }
    
    public synchronized void dy(final int field238) {
        if (this.field238 < 0) {
            this.field238 = -field238;
        }
        else {
            this.field238 = field238;
        }
    }
    
    static int fx(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        rawPcmStream.field242 -= rawPcmStream.field237 * i;
        rawPcmStream.field243 -= rawPcmStream.field251 * i;
        if (n7 == 0 || (n4 = i + (n6 - 1724659388 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2] - n) * (field239 & 0xF2993877)) * field240 >> 6;
            field240 += n3;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n = n8, n2 = n7; i < n4; n10 = i++, array2[n10] += ((n << 8) + (array[field239 >> 8] - n) * (field239 & 0xFF)) * field240 >> 6, field240 += n3, field239 += n2) {}
        rawPcmStream.field242 += rawPcmStream.field237 * i;
        rawPcmStream.field243 += rawPcmStream.field251 * i;
        rawPcmStream.field241 = field240;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    static int method282(int n, int n2, final byte[] array, final int[] array2, int field239, int i, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        if (n7 == 0 || (n4 = i + (n6 + 256 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2] - n) * (field239 & 0xFF)) * n3 >> 6;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n = n8, n2 = n7; i < n4; n10 = i++, array2[n10] += ((n << 8) + (array[field239 >> 8] - n) * (field239 & 0xFF)) * n3 >> 6, field239 += n2) {}
        rawPcmStream.field239 = field239;
        return i;
    }
    
    int method274(final int[] array, int n, final int n2, final int n3, final int n4) {
        while (this.field248 > 0) {
            int n5 = n + this.field248;
            if (n5 > n3) {
                n5 = n3;
            }
            this.field248 += n;
            if (this.field238 == 256 && (this.field239 & 0xFF) == 0x0) {
                if (PcmPlayer.PcmPlayer_stereo) {
                    n = method292(0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, this.field237, this.field251, 0, n5, n2, this);
                }
                else {
                    n = method290(((RawSound)this.ar).samples, array, this.field239, n, this.field241, this.field244, 0, n5, n2, this);
                }
            }
            else if (PcmPlayer.PcmPlayer_stereo) {
                n = method300(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, this.field237, this.field251, 0, n5, n2, this, this.field238, n4);
            }
            else {
                n = method266(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field241, this.field244, 0, n5, n2, this, this.field238, n4);
            }
            this.field248 -= n;
            if (this.field248 != 0) {
                return n;
            }
            if (this.method276()) {
                return n3;
            }
        }
        if (this.field238 == 256 && (this.field239 & 0xFF) == 0x0) {
            if (PcmPlayer.PcmPlayer_stereo) {
                return method278(0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, 0, n3, n2, this);
            }
            return method277(((RawSound)this.ar).samples, array, this.field239, n, this.field241, 0, n3, n2, this);
        }
        else {
            if (PcmPlayer.PcmPlayer_stereo) {
                return method281(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, 0, n3, n2, this, this.field238, n4);
            }
            return method280(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field241, 0, n3, n2, this, this.field238, n4);
        }
    }
    
    @Override
    protected PcmStream bx() {
        return null;
    }
    
    public synchronized void method264(final boolean b) {
        this.field238 = (this.field238 ^ this.field238 >> 31) + (this.field238 >>> 31);
        if (b) {
            this.field238 = -this.field238;
        }
    }
    
    public static boolean method264(final RawPcmStream rawPcmStream) {
        return rawPcmStream.field248 != 0;
    }
    
    public boolean method299() {
        return this.field239 < 0 || this.field239 >= ((RawSound)this.ar).samples.length << 8;
    }
    
    public synchronized void bd(final int[] array, final int n, int n2) {
        if (this.field245 == 0 && this.field248 == 0) {
            this.skip(n2);
            return;
        }
        final RawSound rawSound = (RawSound)this.ar;
        final int n3 = this.start << 8;
        final int n4 = this.end << 8;
        final int field239 = rawSound.samples.length << 8;
        final int n5 = n4 - n3;
        if (n5 <= 0) {
            this.numLoops = 0;
        }
        int n6 = n;
        n2 += n;
        if (this.field239 < 0) {
            if (this.field238 <= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = 0;
        }
        if (this.field239 >= field239) {
            if (this.field238 >= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = field239 - 1;
        }
        if (this.numLoops >= 0) {
            Label_0163: {
                if (this.numLoops > 0) {
                    if (this.field247) {
                        Label_0662: {
                            if (this.field238 >= 0) {
                                break Label_0662;
                            }
                            n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                            if (this.field239 >= n3) {
                                return;
                            }
                            this.field239 = n3 + n3 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0163;
                            }
                            break Label_0662;
                            do {
                                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                                if (this.field239 >= n3) {
                                    return;
                                }
                                this.field239 = n3 + n3 - 1 - this.field239;
                                this.field238 = -this.field238;
                                if (--this.numLoops == 0) {
                                    break;
                                }
                                n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                                if (this.field239 < n4) {
                                    return;
                                }
                                this.field239 = n4 + n4 - 1 - this.field239;
                                this.field238 = -this.field238;
                            } while (--this.numLoops != 0);
                        }
                    }
                    else {
                        if (this.field238 < 0) {
                            Label_1091: {
                                break Label_1091;
                                do {
                                    final int n7 = (n4 - 1 - this.field239) / n5;
                                    if (n7 >= this.numLoops) {
                                        this.field239 += n5 * this.numLoops;
                                        this.numLoops = 0;
                                        break Label_0163;
                                    }
                                    this.field239 += n5 * n7;
                                    this.numLoops -= n7;
                                    n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                                } while (this.field239 < n3);
                            }
                            return;
                        }
                        while (true) {
                            n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
                            if (this.field239 < n4) {
                                return;
                            }
                            final int n8 = (this.field239 - n3) / n5;
                            if (n8 >= this.numLoops) {
                                this.field239 -= n5 * this.numLoops;
                                this.numLoops = 0;
                                break;
                            }
                            this.field239 -= n5 * n8;
                            this.numLoops -= n8;
                        }
                    }
                }
            }
            if (this.field238 < 0) {
                this.method275(array, n6, 0, n2, 0);
                if (this.field239 < 0) {
                    this.field239 = -1;
                    fs(this);
                    this.hw();
                }
            }
            else {
                this.method274(array, n6, field239, n2, 0);
                if (this.field239 >= field239) {
                    this.field239 = field239;
                    fs(this);
                    this.hw();
                }
            }
            return;
        }
        if (this.field247) {
            Label_0337: {
                if (this.field238 >= 0) {
                    break Label_0337;
                }
                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                if (this.field239 >= n3) {
                    return;
                }
                this.field239 = n3 + n3 - 1 - this.field239;
                this.field238 = -this.field238;
                break Label_0337;
                do {
                    this.field239 = n4 + n4 - 1 - this.field239;
                    this.field238 = -this.field238;
                    final int method274;
                    n6 = this.method275(array, method274, n3, n2, rawSound.samples[this.start]);
                    if (this.field239 >= n3) {
                        return;
                    }
                    this.field239 = n3 + n3 - 1 - this.field239;
                    this.field238 = -this.field238;
                    method274 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                } while (this.field239 >= n4);
            }
            return;
        }
        if (this.field238 < 0) {
            while (true) {
                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                if (this.field239 >= n3) {
                    break;
                }
                this.field239 = n4 - 1 - (n4 - 1 - this.field239) % n5;
            }
            return;
        }
        Label_0515: {
            break Label_0515;
            do {
                this.field239 = n3 + (this.field239 - n3) % n5;
                n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
            } while (this.field239 >= n4);
        }
    }
    
    static int cm(final int n, final int n2) {
        return (n2 < 0) ? n : ((int)(n * Math.sqrt((16384 - n2) * 1.220703125E-4) + 0.5));
    }
    
    public synchronized void bg(int field248) {
        if (this.field248 > 0) {
            if (field248 >= this.field248) {
                if (this.field245 == Integer.MIN_VALUE) {
                    this.field245 = 0;
                    this.field243 = 0;
                    this.field242 = 0;
                    this.field241 = 0;
                    this.hw();
                    field248 = this.field248;
                }
                this.field248 = 0;
                this.method258();
            }
            else {
                this.field241 += this.field244 * field248;
                this.field242 += this.field237 * field248;
                this.field243 += this.field251 * field248;
                this.field248 -= field248;
            }
        }
        final RawSound rawSound = (RawSound)this.ar;
        final int n = this.start << 8;
        final int n2 = this.end << 8;
        final int field249 = rawSound.samples.length << 8;
        final int n3 = n2 - n;
        if (n3 <= 0) {
            this.numLoops = 0;
        }
        if (this.field239 < 0) {
            if (this.field238 <= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = 0;
        }
        if (this.field239 >= field249) {
            if (this.field238 >= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = field249 - 1;
        }
        this.field239 += this.field238 * field248;
        if (this.numLoops >= 0) {
            Label_0963: {
                if (this.numLoops > 0) {
                    if (this.field247) {
                        if (this.field238 < 0) {
                            if (this.field239 >= n) {
                                return;
                            }
                            this.field239 = n + n - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0963;
                            }
                        }
                        while (this.field239 >= n2) {
                            this.field239 = n2 + n2 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0963;
                            }
                            if (this.field239 >= n) {
                                return;
                            }
                            this.field239 = n + n - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0963;
                            }
                        }
                        return;
                    }
                    if (this.field238 < 0) {
                        if (this.field239 >= n) {
                            return;
                        }
                        final int n4 = (n2 - 1 - this.field239) / n3;
                        if (n4 >= this.numLoops) {
                            this.field239 += n3 * this.numLoops;
                            this.numLoops = 0;
                            break Label_0963;
                        }
                        this.field239 += n3 * n4;
                        this.numLoops -= n4;
                    }
                    else {
                        if (this.field239 < n2) {
                            return;
                        }
                        final int n5 = (this.field239 - n) / n3;
                        if (n5 >= this.numLoops) {
                            this.field239 -= n3 * this.numLoops;
                            this.numLoops = 0;
                            break Label_0963;
                        }
                        this.field239 -= n3 * n5;
                        this.numLoops -= n5;
                    }
                    return;
                }
            }
            if (this.field238 < 0) {
                if (this.field239 < 0) {
                    this.field239 = -1;
                    fs(this);
                    this.hw();
                }
            }
            else if (this.field239 >= field249) {
                this.field239 = field249;
                fs(this);
                this.hw();
            }
            return;
        }
        if (this.field247) {
            if (this.field238 < 0) {
                if (this.field239 >= n) {
                    return;
                }
                this.field239 = n + n - 1 - this.field239;
                this.field238 = -this.field238;
            }
            while (this.field239 >= n2) {
                this.field239 = n2 + n2 - 1 - this.field239;
                this.field238 = -this.field238;
                if (this.field239 >= n) {
                    return;
                }
                this.field239 = n + n - 1 - this.field239;
                this.field238 = -this.field238;
            }
            return;
        }
        if (this.field238 < 0) {
            if (this.field239 >= n) {
                return;
            }
            this.field239 = n2 - 1 - (n2 - 1 - this.field239) % n3;
        }
        else {
            if (this.field239 < n2) {
                return;
            }
            this.field239 = n + (this.field239 - n) % n3;
        }
    }
    
    @Override
    int cg() {
        final int n = this.field241 * 3 >> 6;
        int n2 = (n ^ n >> 31) + (n >>> 31);
        if (this.numLoops == 0) {
            n2 -= n2 * this.field239 / (((RawSound)this.ar).samples.length << 8);
        }
        else if (this.numLoops >= 0) {
            n2 -= n2 * this.start / ((RawSound)this.ar).samples.length;
        }
        return (n2 > 255) ? 255 : n2;
    }
    
    public static RawPcmStream co(final RawSound rawSound, final int n, final int n2) {
        if (rawSound.samples == null || rawSound.samples.length == 0) {
            return null;
        }
        return new RawPcmStream(rawSound, (int)(rawSound.sampleRate * 256L * n / (PcmPlayer.field201 * 1511829972)), n2 << 6);
    }
    
    @Override
    int cy() {
        final int n = this.field241 * 3 >> 6;
        int n2 = (n ^ n >> 31) + (n >>> 31);
        if (this.numLoops == 0) {
            n2 -= n2 * this.field239 / (((RawSound)this.ar).samples.length << 8);
        }
        else if (this.numLoops >= 0) {
            n2 -= n2 * this.start / ((RawSound)this.ar).samples.length;
        }
        return (n2 > 255) ? 255 : n2;
    }
    
    static int er(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = i + n2 - (n7 - 1)) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2--], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2--], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2--], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2--];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2--];
        }
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    public static class425 xe(final class122 class122, final int n) {
        return class122.field1189[n];
    }
    
    static int eu(final byte[] array, final int[] array2, int n, int i, int n2, int n3, final int n4, int n5, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n5 >>= 8;
        n2 <<= 2;
        if ((n3 = i + n5 - n) > n4) {
            n3 = n4;
        }
        int n6;
        int n7;
        int n8;
        int n9;
        for (n3 -= 3; i < n3; n6 = i++, array2[n6] += array[n++] * n2, n7 = i++, array2[n7] += array[n++] * n2, n8 = i++, array2[n8] += array[n++] * n2, n9 = i++, array2[n9] += array[n++] * n2) {}
        int n10;
        for (n3 += 3; i < n3; n10 = i++, array2[n10] += array[n++] * n2) {}
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    static int method297(final int n, final int n2) {
        return (n2 < 0) ? n : ((int)(n * Math.sqrt((16384 - n2) * 1.220703125E-4) + 0.5));
    }
    
    int method275(final int[] array, int n, final int n2, final int n3, final int n4) {
        while (this.field248 > 0) {
            int n5 = n + this.field248;
            if (n5 > n3) {
                n5 = n3;
            }
            this.field248 += n;
            if (this.field238 == -256 && (this.field239 & 0xFF) == 0x0) {
                if (PcmPlayer.PcmPlayer_stereo) {
                    n = method293(0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, this.field237, this.field251, 0, n5, n2, this);
                }
                else {
                    n = method284(((RawSound)this.ar).samples, array, this.field239, n, this.field241, this.field244, 0, n5, n2, this);
                }
            }
            else if (PcmPlayer.PcmPlayer_stereo) {
                n = method288(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, this.field237, this.field251, 0, n5, n2, this, this.field238, n4);
            }
            else {
                n = method287(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field241, this.field244, 0, n5, n2, this, this.field238, n4);
            }
            this.field248 -= n;
            if (this.field248 != 0) {
                return n;
            }
            if (this.method276()) {
                return n3;
            }
        }
        if (this.field238 == -256 && (this.field239 & 0xFF) == 0x0) {
            if (PcmPlayer.PcmPlayer_stereo) {
                return method289(0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, 0, n3, n2, this);
            }
            return method279(((RawSound)this.ar).samples, array, this.field239, n, this.field241, 0, n3, n2, this);
        }
        else {
            if (PcmPlayer.PcmPlayer_stereo) {
                return method283(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field242, this.field243, 0, n3, n2, this, this.field238, n4);
            }
            return method282(0, 0, ((RawSound)this.ar).samples, array, this.field239, n, this.field241, 0, n3, n2, this, this.field238, n4);
        }
    }
    
    public static RawPcmStream cz(final RawSound rawSound, final int n, final int n2, final int n3) {
        if (rawSound.samples == null || rawSound.samples.length == 0) {
            return null;
        }
        return new RawPcmStream(rawSound, n, n2, n3);
    }
    
    synchronized void dr(final int field245, final int field246) {
        this.field245 = field245;
        this.field240 = field246;
        this.field248 = 0;
        this.method258();
    }
    
    @Override
    protected PcmStream firstSubStream() {
        return null;
    }
    
    @Override
    protected PcmStream nextSubStream() {
        return null;
    }
    
    public synchronized void method267(int field248, final int field249, final int field250) {
        if (field248 == 0) {
            this.dc(field249, field250);
            return;
        }
        final int method297 = method297(field249, field250);
        final int method298 = method255(field249, field250);
        if (this.field242 == method297 && this.field243 == method298) {
            this.field248 = 0;
            return;
        }
        int n = field249 - this.field241;
        if (this.field241 - field249 > n) {
            n = this.field241 - field249;
        }
        if (method297 - this.field242 > n) {
            n = method297 - this.field242;
        }
        if (this.field242 - method297 > n) {
            n = this.field242 - method297;
        }
        if (method298 - this.field243 > n) {
            n = method298 - this.field243;
        }
        if (this.field243 - method298 > n) {
            n = this.field243 - method298;
        }
        if (field248 > n) {
            field248 = n;
        }
        this.field248 = field248;
        this.field245 = field249;
        this.field240 = field250;
        this.field244 = (field249 - this.field241) / field248;
        this.field237 = (method297 - this.field242) / field248;
        this.field251 = (method298 - this.field243) / field248;
    }
    
    public synchronized int method262() {
        return (this.field245 == Integer.MIN_VALUE) ? 0 : this.field245;
    }
    
    static int method289(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = i + n2 - (n7 - 1)) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2--], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2--], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2--], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2--];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2--];
        }
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    public boolean ep() {
        return this.field239 < 0 || this.field239 >= ((RawSound)this.ar).samples.length << 8;
    }
    
    public synchronized void dg(int field239) {
        final int n = ((RawSound)this.ar).samples.length << 8;
        if (field239 < -1) {
            field239 = -1;
        }
        if (field239 > n) {
            field239 = n;
        }
        this.field239 = field239;
    }
    
    @Override
    protected int bz() {
        if (this.field245 == 0 && this.field248 == 0) {
            return 0;
        }
        return 1;
    }
    
    static int eg(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = i + n2 - (n7 - 1)) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2--], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2--], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2--], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2--];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2--];
        }
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    static int ew(int n, int n2, final byte[] array, final int[] array2, int field239, int i, final int n3, int n4, final int n5, final int n6, final RawPcmStream rawPcmStream, final int n7, final int n8) {
        if (n7 == 0 || (n4 = i + (n6 + 256 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2] - n) * (field239 & 0xFF)) * n3 >> 6;
            field239 += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - field239 + n7) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n = n8, n2 = n7; i < n4; n10 = i++, array2[n10] += ((n << 8) + (array[field239 >> 8] - n) * (field239 & 0xFF)) * n3 >> 6, field239 += n2) {}
        rawPcmStream.field239 = field239;
        return i;
    }
    
    boolean ej() {
        int field245 = this.field245;
        int method255;
        int method256;
        if (field245 == 2134917990) {
            method255 = 0;
            method256 = 0;
            field245 = 0;
        }
        else {
            method256 = method297(field245, this.field240);
            method255 = method255(field245, this.field240);
        }
        if (this.field241 != field245 || this.field242 != method256 || this.field243 != method255) {
            if (this.field241 < field245) {
                this.field244 = 1;
                this.field248 = field245 - this.field241;
            }
            else if (this.field241 > field245) {
                this.field244 = -1;
                this.field248 = this.field241 - field245;
            }
            else {
                this.field244 = 0;
            }
            if (this.field242 < method256) {
                this.field237 = 1;
                if (this.field248 == 0 || this.field248 > method256 - this.field242) {
                    this.field248 = method256 - this.field242;
                }
            }
            else if (this.field242 > method256) {
                this.field237 = -1;
                if (this.field248 == 0 || this.field248 > this.field242 - method256) {
                    this.field248 = this.field242 - method256;
                }
            }
            else {
                this.field237 = 0;
            }
            if (this.field243 < method255) {
                this.field251 = 1;
                if (this.field248 == 0 || this.field248 > method255 - this.field243) {
                    this.field248 = method255 - this.field243;
                }
            }
            else if (this.field243 > method255) {
                this.field251 = -1;
                if (this.field248 == 0 || this.field248 > this.field243 - method255) {
                    this.field248 = this.field243 - method255;
                }
            }
            else {
                this.field251 = 0;
            }
            return false;
        }
        if (this.field245 == Integer.MIN_VALUE) {
            this.field245 = 0;
            this.field243 = 0;
            this.field242 = 0;
            this.field241 = 0;
            this.hw();
            return true;
        }
        this.method258();
        return false;
    }
    
    public synchronized void bj(final int[] array, final int n, int n2) {
        if (this.field245 == 0 && this.field248 == 0) {
            this.skip(n2);
            return;
        }
        final RawSound rawSound = (RawSound)this.ar;
        final int n3 = this.start << 8;
        final int n4 = this.end << 8;
        final int field239 = rawSound.samples.length << 8;
        final int n5 = n4 - n3;
        if (n5 <= 0) {
            this.numLoops = 0;
        }
        int n6 = n;
        n2 += n;
        if (this.field239 < 0) {
            if (this.field238 <= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = 0;
        }
        if (this.field239 >= field239) {
            if (this.field238 >= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = field239 - 1;
        }
        if (this.numLoops >= 0) {
            Label_1080: {
                if (this.numLoops > 0) {
                    if (this.field247) {
                        Label_0837: {
                            if (this.field238 >= 0) {
                                break Label_0837;
                            }
                            n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                            if (this.field239 >= n3) {
                                return;
                            }
                            this.field239 = n3 + n3 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_1080;
                            }
                            break Label_0837;
                            do {
                                this.field239 = n4 + n4 - 1 - this.field239;
                                this.field238 = -this.field238;
                                if (--this.numLoops == 0) {
                                    break Label_1080;
                                }
                                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                                if (this.field239 >= n3) {
                                    return;
                                }
                                this.field239 = n3 + n3 - 1 - this.field239;
                                this.field238 = -this.field238;
                                if (--this.numLoops == 0) {
                                    break Label_1080;
                                }
                                n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                            } while (this.field239 >= n4);
                        }
                        return;
                    }
                    if (this.field238 < 0) {
                        while (true) {
                            n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                            if (this.field239 >= n3) {
                                return;
                            }
                            final int n7 = (n4 - 1 - this.field239) / n5;
                            if (n7 >= this.numLoops) {
                                this.field239 += n5 * this.numLoops;
                                this.numLoops = 0;
                                break;
                            }
                            this.field239 += n5 * n7;
                            this.numLoops -= n7;
                        }
                    }
                    else {
                        while (true) {
                            n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
                            if (this.field239 < n4) {
                                return;
                            }
                            final int n8 = (this.field239 - n3) / n5;
                            if (n8 >= this.numLoops) {
                                this.field239 -= n5 * this.numLoops;
                                this.numLoops = 0;
                                break;
                            }
                            this.field239 -= n5 * n8;
                            this.numLoops -= n8;
                        }
                    }
                }
            }
            if (this.field238 < 0) {
                this.method275(array, n6, 0, n2, 0);
                if (this.field239 < 0) {
                    this.field239 = -1;
                    fs(this);
                    this.hw();
                }
            }
            else {
                this.method274(array, n6, field239, n2, 0);
                if (this.field239 >= field239) {
                    this.field239 = field239;
                    fs(this);
                    this.hw();
                }
            }
            return;
        }
        if (this.field247) {
            if (this.field238 < 0) {
                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                if (this.field239 >= n3) {
                    return;
                }
                this.field239 = n3 + n3 - 1 - this.field239;
                this.field238 = -this.field238;
            }
            while (true) {
                final int method274 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                if (this.field239 < n4) {
                    return;
                }
                this.field239 = n4 + n4 - 1 - this.field239;
                this.field238 = -this.field238;
                n6 = this.method275(array, method274, n3, n2, rawSound.samples[this.start]);
                if (this.field239 >= n3) {
                    return;
                }
                this.field239 = n3 + n3 - 1 - this.field239;
                this.field238 = -this.field238;
            }
        }
        else {
            if (this.field238 < 0) {
                Label_0650: {
                    break Label_0650;
                    do {
                        this.field239 = n4 - 1 - (n4 - 1 - this.field239) % n5;
                        n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                    } while (this.field239 < n3);
                }
                return;
            }
            Label_0523: {
                break Label_0523;
                do {
                    this.field239 = n3 + (this.field239 - n3) % n5;
                    n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
                } while (this.field239 >= n4);
            }
        }
    }
    
    public synchronized void dd(int field248) {
        if (field248 == 0) {
            this.method260(0);
            this.hw();
            return;
        }
        if (this.field242 == 0 && this.field243 == 0) {
            this.field248 = 0;
            this.field245 = 0;
            this.field241 = 0;
            this.hw();
            return;
        }
        int n = -this.field241;
        if (this.field241 > n) {
            n = this.field241;
        }
        if (-this.field242 > n) {
            n = -this.field242;
        }
        if (this.field242 > n) {
            n = this.field242;
        }
        if (-this.field243 > n) {
            n = -this.field243;
        }
        if (this.field243 > n) {
            n = this.field243;
        }
        if (field248 > n) {
            field248 = n;
        }
        this.field248 = field248;
        this.field245 = Integer.MIN_VALUE;
        this.field244 = -this.field241 / field248;
        this.field237 = -this.field242 / field248;
        this.field251 = -this.field243 / field248;
    }
    
    public synchronized void dj(int field248) {
        if (field248 == 0) {
            this.method260(0);
            this.hw();
            return;
        }
        if (this.field242 == 0 && this.field243 == 0) {
            this.field248 = 0;
            this.field245 = 0;
            this.field241 = 0;
            this.hw();
            return;
        }
        int n = -this.field241;
        if (this.field241 > n) {
            n = this.field241;
        }
        if (-this.field242 > n) {
            n = -this.field242;
        }
        if (this.field242 > n) {
            n = this.field242;
        }
        if (-this.field243 > n) {
            n = -this.field243;
        }
        if (this.field243 > n) {
            n = this.field243;
        }
        if (field248 > n) {
            field248 = n;
        }
        this.field248 = field248;
        this.field245 = Integer.MIN_VALUE;
        this.field244 = -this.field241 / field248;
        this.field237 = -this.field242 / field248;
        this.field251 = -this.field243 / field248;
    }
    
    static int cq(final int n, final int n2) {
        return (n2 < 0) ? n : ((int)(n * Math.sqrt((16384 - n2) * 1.220703125E-4) + 0.5));
    }
    
    static int fb(int n, int n2, final byte[] array, final int[] array2, int field239, int i, int field240, int field241, final int n3, final int n4, int n5, final int n6, final int n7, final RawPcmStream rawPcmStream, final int n8, final int n9) {
        rawPcmStream.field241 -= rawPcmStream.field244 * i;
        if (n8 == 0 || (n5 = i + (n7 + 267909205 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * field240 >> 6, field240 += n3, n11 = i++, array2[n11] += n * field241 >> 6, field241 += n4, field239 += n8) {
            n2 = field239 >> 8;
            n = array[n2 - 1];
            n = (n << 8) + (array[n2] - n) * (field239 & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - field239 + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (array[field239 >> 8] - n2) * (field239 & 0xB316DC9F);
            final int n12 = i++;
            array2[n12] += n * field240 >> 6;
            field240 += n3;
            final int n13 = i++;
            array2[n13] += n * field241 >> 6;
            field241 += n4;
            field239 += n8;
        }
        i >>= 1;
        rawPcmStream.field241 += rawPcmStream.field244 * i;
        rawPcmStream.field242 = field240;
        rawPcmStream.field243 = field241;
        rawPcmStream.field239 = field239;
        return i;
    }
    
    public synchronized void bm(final int[] array, final int n, int n2) {
        if (this.field245 == 0 && this.field248 == 0) {
            this.skip(n2);
            return;
        }
        final RawSound rawSound = (RawSound)this.ar;
        final int n3 = this.start << 8;
        final int n4 = this.end << 8;
        final int field239 = rawSound.samples.length << 8;
        final int n5 = n4 - n3;
        if (n5 <= 0) {
            this.numLoops = 0;
        }
        int n6 = n;
        n2 += n;
        if (this.field239 < 0) {
            if (this.field238 <= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = 0;
        }
        if (this.field239 >= field239) {
            if (this.field238 >= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = field239 - 1;
        }
        if (this.numLoops >= 0) {
            Label_1040: {
                if (this.numLoops > 0) {
                    if (this.field247) {
                        Label_0660: {
                            if (this.field238 >= 0) {
                                break Label_0660;
                            }
                            n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                            if (this.field239 >= n3) {
                                return;
                            }
                            this.field239 = n3 + n3 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_1040;
                            }
                            break Label_0660;
                            do {
                                this.field239 = n3 + n3 - 1 - this.field239;
                                this.field238 = -this.field238;
                                if (--this.numLoops == 0) {
                                    break Label_1040;
                                }
                                n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                                if (this.field239 < n4) {
                                    return;
                                }
                                this.field239 = n4 + n4 - 1 - this.field239;
                                this.field238 = -this.field238;
                                if (--this.numLoops == 0) {
                                    break Label_1040;
                                }
                                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                            } while (this.field239 < n3);
                        }
                        return;
                    }
                    if (this.field238 < 0) {
                        while (true) {
                            n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                            if (this.field239 >= n3) {
                                return;
                            }
                            final int n7 = (n4 - 1 - this.field239) / n5;
                            if (n7 >= this.numLoops) {
                                this.field239 += n5 * this.numLoops;
                                this.numLoops = 0;
                                break;
                            }
                            this.field239 += n5 * n7;
                            this.numLoops -= n7;
                        }
                    }
                    else {
                        while (true) {
                            n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
                            if (this.field239 < n4) {
                                return;
                            }
                            final int n8 = (this.field239 - n3) / n5;
                            if (n8 >= this.numLoops) {
                                this.field239 -= n5 * this.numLoops;
                                this.numLoops = 0;
                                break;
                            }
                            this.field239 -= n5 * n8;
                            this.numLoops -= n8;
                        }
                    }
                }
            }
            if (this.field238 < 0) {
                this.method275(array, n6, 0, n2, 0);
                if (this.field239 < 0) {
                    this.field239 = -1;
                    fs(this);
                    this.hw();
                }
            }
            else {
                this.method274(array, n6, field239, n2, 0);
                if (this.field239 >= field239) {
                    this.field239 = field239;
                    fs(this);
                    this.hw();
                }
            }
            return;
        }
        if (this.field247) {
            if (this.field238 < 0) {
                n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.start]);
                if (this.field239 >= n3) {
                    return;
                }
                this.field239 = n3 + n3 - 1 - this.field239;
                this.field238 = -this.field238;
            }
            while (true) {
                final int method274 = this.method274(array, n6, n4, n2, rawSound.samples[this.end - 1]);
                if (this.field239 < n4) {
                    return;
                }
                this.field239 = n4 + n4 - 1 - this.field239;
                this.field238 = -this.field238;
                n6 = this.method275(array, method274, n3, n2, rawSound.samples[this.start]);
                if (this.field239 >= n3) {
                    return;
                }
                this.field239 = n3 + n3 - 1 - this.field239;
                this.field238 = -this.field238;
            }
        }
        else {
            if (this.field238 < 0) {
                while (true) {
                    n6 = this.method275(array, n6, n3, n2, rawSound.samples[this.end - 1]);
                    if (this.field239 >= n3) {
                        break;
                    }
                    this.field239 = n4 - 1 - (n4 - 1 - this.field239) % n5;
                }
                return;
            }
            while (true) {
                n6 = this.method274(array, n6, n4, n2, rawSound.samples[this.start]);
                if (this.field239 < n4) {
                    break;
                }
                this.field239 = n3 + (this.field239 - n3) % n5;
            }
        }
    }
    
    @Override
    protected PcmStream bk() {
        return null;
    }
    
    boolean ez() {
        int field245 = this.field245;
        int method255;
        int method256;
        if (field245 == Integer.MIN_VALUE) {
            method255 = 0;
            method256 = 0;
            field245 = 0;
        }
        else {
            method256 = method297(field245, this.field240);
            method255 = method255(field245, this.field240);
        }
        if (this.field241 != field245 || this.field242 != method256 || this.field243 != method255) {
            if (this.field241 < field245) {
                this.field244 = 1;
                this.field248 = field245 - this.field241;
            }
            else if (this.field241 > field245) {
                this.field244 = -1;
                this.field248 = this.field241 - field245;
            }
            else {
                this.field244 = 0;
            }
            if (this.field242 < method256) {
                this.field237 = 1;
                if (this.field248 == 0 || this.field248 > method256 - this.field242) {
                    this.field248 = method256 - this.field242;
                }
            }
            else if (this.field242 > method256) {
                this.field237 = -1;
                if (this.field248 == 0 || this.field248 > this.field242 - method256) {
                    this.field248 = this.field242 - method256;
                }
            }
            else {
                this.field237 = 0;
            }
            if (this.field243 < method255) {
                this.field251 = 1;
                if (this.field248 == 0 || this.field248 > method255 - this.field243) {
                    this.field248 = method255 - this.field243;
                }
            }
            else if (this.field243 > method255) {
                this.field251 = -1;
                if (this.field248 == 0 || this.field248 > this.field243 - method255) {
                    this.field248 = this.field243 - method255;
                }
            }
            else {
                this.field251 = 0;
            }
            return false;
        }
        if (this.field245 == -1658163659) {
            this.field245 = 0;
            this.field243 = 0;
            this.field242 = 0;
            this.field241 = 0;
            this.hw();
            return true;
        }
        this.method258();
        return false;
    }
    
    public synchronized void dq(int field248, final int field249, final int field250) {
        if (field248 == 0) {
            this.dc(field249, field250);
            return;
        }
        final int method297 = method297(field249, field250);
        final int method298 = method255(field249, field250);
        if (this.field242 == method297 && this.field243 == method298) {
            this.field248 = 0;
            return;
        }
        int n = field249 - this.field241;
        if (this.field241 - field249 > n) {
            n = this.field241 - field249;
        }
        if (method297 - this.field242 > n) {
            n = method297 - this.field242;
        }
        if (this.field242 - method297 > n) {
            n = this.field242 - method297;
        }
        if (method298 - this.field243 > n) {
            n = method298 - this.field243;
        }
        if (this.field243 - method298 > n) {
            n = this.field243 - method298;
        }
        if (field248 > n) {
            field248 = n;
        }
        this.field248 = field248;
        this.field245 = field249;
        this.field240 = field250;
        this.field244 = (field249 - this.field241) / field248;
        this.field237 = (method297 - this.field242) / field248;
        this.field251 = (method298 - this.field243) / field248;
    }
    
    public boolean eo() {
        return this.field248 != 0;
    }
    
    static int eb(final byte[] array, final int[] array2, int n, int i, int n2, int n3, final int n4, int n5, final RawPcmStream rawPcmStream) {
        n >>= 8;
        n5 >>= 8;
        n2 <<= 2;
        if ((n3 = i + n5 - n) > n4) {
            n3 = n4;
        }
        int n6;
        int n7;
        int n8;
        int n9;
        for (n3 -= 3; i < n3; n6 = i++, array2[n6] += array[n++] * n2, n7 = i++, array2[n7] += array[n++] * n2, n8 = i++, array2[n8] += array[n++] * n2, n9 = i++, array2[n9] += array[n++] * n2) {}
        int n10;
        for (n3 += 3; i < n3; n10 = i++, array2[n10] += array[n++] * n2) {}
        rawPcmStream.field239 = n << 8;
        return i;
    }
    
    public synchronized int method285() {
        return (this.field240 < 0) ? -1 : this.field240;
    }
    
    public static int vo(final RawPcmStream rawPcmStream, final int[] array, int n, final int n2, final int n3, final int n4) {
        if (rawPcmStream == null) {
            rawPcmStream.dc(n, n);
        }
        while (rawPcmStream.field248 > 0) {
            int n5 = n + rawPcmStream.field248;
            if (n5 > n3) {
                n5 = n3;
            }
            rawPcmStream.field248 += n;
            if (rawPcmStream.field238 == -256 && (rawPcmStream.field239 & 0xFF) == 0x0) {
                if (PcmPlayer.PcmPlayer_stereo) {
                    n = method293(0, ((RawSound)rawPcmStream.ar).samples, array, rawPcmStream.field239, n, rawPcmStream.field242, rawPcmStream.field243, rawPcmStream.field237, rawPcmStream.field251, 0, n5, n2, rawPcmStream);
                }
                else {
                    n = method284(((RawSound)rawPcmStream.ar).samples, array, rawPcmStream.field239, n, rawPcmStream.field241, rawPcmStream.field244, 0, n5, n2, rawPcmStream);
                }
            }
            else if (PcmPlayer.PcmPlayer_stereo) {
                n = method288(0, 0, ((RawSound)rawPcmStream.ar).samples, array, rawPcmStream.field239, n, rawPcmStream.field242, rawPcmStream.field243, rawPcmStream.field237, rawPcmStream.field251, 0, n5, n2, rawPcmStream, rawPcmStream.field238, n4);
            }
            else {
                n = method287(0, 0, ((RawSound)rawPcmStream.ar).samples, array, rawPcmStream.field239, n, rawPcmStream.field241, rawPcmStream.field244, 0, n5, n2, rawPcmStream, rawPcmStream.field238, n4);
            }
            rawPcmStream.field248 -= n;
            if (rawPcmStream.field248 != 0) {
                return n;
            }
            if (rawPcmStream.method276()) {
                return n3;
            }
        }
        if (rawPcmStream.field238 == -256 && (rawPcmStream.field239 & 0xFF) == 0x0) {
            if (PcmPlayer.PcmPlayer_stereo) {
                return method289(0, ((RawSound)rawPcmStream.ar).samples, array, rawPcmStream.field239, n, rawPcmStream.field242, rawPcmStream.field243, 0, n3, n2, rawPcmStream);
            }
            return method279(((RawSound)rawPcmStream.ar).samples, array, rawPcmStream.field239, n, rawPcmStream.field241, 0, n3, n2, rawPcmStream);
        }
        else {
            if (PcmPlayer.PcmPlayer_stereo) {
                return method283(0, 0, ((RawSound)rawPcmStream.ar).samples, array, rawPcmStream.field239, n, rawPcmStream.field242, rawPcmStream.field243, 0, n3, n2, rawPcmStream, rawPcmStream.field238, n4);
            }
            return method282(0, 0, ((RawSound)rawPcmStream.ar).samples, array, rawPcmStream.field239, n, rawPcmStream.field241, 0, n3, n2, rawPcmStream, rawPcmStream.field238, n4);
        }
    }
    
    public static void yo(final RawPcmStream rawPcmStream) {
        rawPcmStream.field241 = rawPcmStream.field245;
        rawPcmStream.field242 = method297(rawPcmStream.field245, rawPcmStream.field240);
        rawPcmStream.field243 = method255(rawPcmStream.field245, rawPcmStream.field240);
    }
    
    static int ey(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, int n6, int n7, final int n8, int n9, final RawPcmStream rawPcmStream) {
        n2 >>= 8;
        n9 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        if ((n7 = i + n9 - n2) > n8) {
            n7 = n8;
        }
        rawPcmStream.field241 += rawPcmStream.field244 * (n7 - i);
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        for (i <<= 1, n7 <<= 1, n7 -= 6; i < n7; n10 = i++, array2[n10] += n * n3, n3 += n5, n11 = i++, array2[n11] += n * n4, n4 += n6, n = array[n2++], n12 = i++, array2[n12] += n * n3, n3 += n5, n13 = i++, array2[n13] += n * n4, n4 += n6, n = array[n2++], n14 = i++, array2[n14] += n * n3, n3 += n5, n15 = i++, array2[n15] += n * n4, n4 += n6, n = array[n2++], n16 = i++, array2[n16] += n * n3, n3 += n5, n17 = i++, array2[n17] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        int n18;
        int n19;
        for (n7 += 6; i < n7; n18 = i++, array2[n18] += n * n3, n3 += n5, n19 = i++, array2[n19] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        rawPcmStream.field242 = n3 >> 2;
        rawPcmStream.field243 = n4 >> 2;
        rawPcmStream.field239 = n2 << 8;
        return i >> 1;
    }
    
    public synchronized void bf(int field248) {
        if (this.field248 > 0) {
            if (field248 >= this.field248) {
                if (this.field245 == Integer.MIN_VALUE) {
                    this.field245 = 0;
                    this.field243 = 0;
                    this.field242 = 0;
                    this.field241 = 0;
                    this.hw();
                    field248 = this.field248;
                }
                this.field248 = 0;
                this.method258();
            }
            else {
                this.field241 += this.field244 * field248;
                this.field242 += this.field237 * field248;
                this.field243 += this.field251 * field248;
                this.field248 -= field248;
            }
        }
        final RawSound rawSound = (RawSound)this.ar;
        final int n = this.start << 8;
        final int n2 = this.end << 8;
        final int field249 = rawSound.samples.length << 8;
        final int n3 = n2 - n;
        if (n3 <= 0) {
            this.numLoops = 0;
        }
        if (this.field239 < 0) {
            if (this.field238 <= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = 0;
        }
        if (this.field239 >= field249) {
            if (this.field238 >= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = field249 - 1;
        }
        this.field239 += this.field238 * field248;
        if (this.numLoops >= 0) {
            Label_0905: {
                if (this.numLoops > 0) {
                    if (this.field247) {
                        if (this.field238 < 0) {
                            if (this.field239 >= n) {
                                return;
                            }
                            this.field239 = n + n - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0905;
                            }
                        }
                        while (this.field239 >= n2) {
                            this.field239 = n2 + n2 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0905;
                            }
                            if (this.field239 >= n) {
                                return;
                            }
                            this.field239 = n + n - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0905;
                            }
                        }
                        return;
                    }
                    if (this.field238 < 0) {
                        if (this.field239 >= n) {
                            return;
                        }
                        final int n4 = (n2 - 1 - this.field239) / n3;
                        if (n4 >= this.numLoops) {
                            this.field239 += n3 * this.numLoops;
                            this.numLoops = 0;
                            break Label_0905;
                        }
                        this.field239 += n3 * n4;
                        this.numLoops -= n4;
                    }
                    else {
                        if (this.field239 < n2) {
                            return;
                        }
                        final int n5 = (this.field239 - n) / n3;
                        if (n5 >= this.numLoops) {
                            this.field239 -= n3 * this.numLoops;
                            this.numLoops = 0;
                            break Label_0905;
                        }
                        this.field239 -= n3 * n5;
                        this.numLoops -= n5;
                    }
                    return;
                }
            }
            if (this.field238 < 0) {
                if (this.field239 < 0) {
                    this.field239 = -1;
                    fs(this);
                    this.hw();
                }
            }
            else if (this.field239 >= field249) {
                this.field239 = field249;
                fs(this);
                this.hw();
            }
            return;
        }
        if (this.field247) {
            if (this.field238 < 0) {
                if (this.field239 >= n) {
                    return;
                }
                this.field239 = n + n - 1 - this.field239;
                this.field238 = -this.field238;
            }
            while (this.field239 >= n2) {
                this.field239 = n2 + n2 - 1 - this.field239;
                this.field238 = -this.field238;
                if (this.field239 >= n) {
                    return;
                }
                this.field239 = n + n - 1 - this.field239;
                this.field238 = -this.field238;
            }
            return;
        }
        if (this.field238 < 0) {
            if (this.field239 >= n) {
                return;
            }
            this.field239 = n2 - 1 - (n2 - 1 - this.field239) % n3;
        }
        else {
            if (this.field239 < n2) {
                return;
            }
            this.field239 = n + (this.field239 - n) % n3;
        }
    }
    
    public synchronized void bu(int field248) {
        if (this.field248 > 0) {
            if (field248 >= this.field248) {
                if (this.field245 == Integer.MIN_VALUE) {
                    this.field245 = 0;
                    this.field243 = 0;
                    this.field242 = 0;
                    this.field241 = 0;
                    this.hw();
                    field248 = this.field248;
                }
                this.field248 = 0;
                this.method258();
            }
            else {
                this.field241 += this.field244 * field248;
                this.field242 += this.field237 * field248;
                this.field243 += this.field251 * field248;
                this.field248 -= field248;
            }
        }
        final RawSound rawSound = (RawSound)this.ar;
        final int n = this.start << 8;
        final int n2 = this.end << 8;
        final int field249 = rawSound.samples.length << 8;
        final int n3 = n2 - n;
        if (n3 <= 0) {
            this.numLoops = 0;
        }
        if (this.field239 < 0) {
            if (this.field238 <= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = 0;
        }
        if (this.field239 >= field249) {
            if (this.field238 >= 0) {
                fs(this);
                this.hw();
                return;
            }
            this.field239 = field249 - 1;
        }
        this.field239 += this.field238 * field248;
        if (this.numLoops >= 0) {
            Label_0913: {
                if (this.numLoops > 0) {
                    if (this.field247) {
                        if (this.field238 < 0) {
                            if (this.field239 >= n) {
                                return;
                            }
                            this.field239 = n + n - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0913;
                            }
                        }
                        while (this.field239 >= n2) {
                            this.field239 = n2 + n2 - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0913;
                            }
                            if (this.field239 >= n) {
                                return;
                            }
                            this.field239 = n + n - 1 - this.field239;
                            this.field238 = -this.field238;
                            if (--this.numLoops == 0) {
                                break Label_0913;
                            }
                        }
                        return;
                    }
                    if (this.field238 < 0) {
                        if (this.field239 >= n) {
                            return;
                        }
                        final int n4 = (n2 - 1 - this.field239) / n3;
                        if (n4 >= this.numLoops) {
                            this.field239 += n3 * this.numLoops;
                            this.numLoops = 0;
                            break Label_0913;
                        }
                        this.field239 += n3 * n4;
                        this.numLoops -= n4;
                    }
                    else {
                        if (this.field239 < n2) {
                            return;
                        }
                        final int n5 = (this.field239 - n) / n3;
                        if (n5 >= this.numLoops) {
                            this.field239 -= n3 * this.numLoops;
                            this.numLoops = 0;
                            break Label_0913;
                        }
                        this.field239 -= n3 * n5;
                        this.numLoops -= n5;
                    }
                    return;
                }
            }
            if (this.field238 < 0) {
                if (this.field239 < 0) {
                    this.field239 = -1;
                    fs(this);
                    this.hw();
                }
            }
            else if (this.field239 >= field249) {
                this.field239 = field249;
                fs(this);
                this.hw();
            }
            return;
        }
        if (this.field247) {
            if (this.field238 < 0) {
                if (this.field239 >= n) {
                    return;
                }
                this.field239 = n + n - 1 - this.field239;
                this.field238 = -this.field238;
            }
            while (this.field239 >= n2) {
                this.field239 = n2 + n2 - 1 - this.field239;
                this.field238 = -this.field238;
                if (this.field239 >= n) {
                    return;
                }
                this.field239 = n + n - 1 - this.field239;
                this.field238 = -this.field238;
            }
            return;
        }
        if (this.field238 < 0) {
            if (this.field239 >= n) {
                return;
            }
            this.field239 = n2 - 1 - (n2 - 1 - this.field239) % n3;
        }
        else {
            if (this.field239 < n2) {
                return;
            }
            this.field239 = n + (this.field239 - n) % n3;
        }
    }
    
    void du() {
        if (this.field248 != 0) {
            if (this.field245 == Integer.MIN_VALUE) {
                this.field245 = 0;
            }
            this.field248 = 0;
            this.method258();
        }
    }
}
