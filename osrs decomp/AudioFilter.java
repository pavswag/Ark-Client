// 
// Decompiled by Procyon v0.5.36
// 

public class AudioFilter
{
    int[][][] field304;
    static final int an = 4;
    static float[][] field305;
    int[][][] field306;
    int[] field307;
    static final float ao = 32.703197f;
    int[] pairs;
    static float field309;
    static int forwardMultiplier;
    static final float aa = 100.0f;
    static final float ay = 8.0f;
    static int[][] coefficients;
    
    AudioFilter() {
        this.pairs = new int[2];
        this.field304 = new int[2][2][4];
        this.field306 = new int[2][2][4];
        this.field307 = new int[2];
    }
    
    static {
        AudioFilter.field305 = new float[2][8];
        AudioFilter.coefficients = new int[2][8];
    }
    
    float ao(final int n, final int n2, final float n3) {
        return normalize((this.field304[n][0][n2] + n3 * (this.field304[n][1][n2] - this.field304[n][0][n2])) * 1.2207031E-4f);
    }
    
    float at(final int n, final int n2, final float n3) {
        return 1.0f - (float)Math.pow(10.0, -((this.field306[n][0][n2] + n3 * (this.field306[n][1][n2] - this.field306[n][0][n2])) * 0.0015258789f) / 20.0f);
    }
    
    int av(final int n, final float n2) {
        if (n == 0) {
            AudioFilter.field309 = (float)Math.pow(0.1, (this.field307[0] + (this.field307[1] - this.field307[0]) * n2) * 0.0030517578f / 20.0f);
            AudioFilter.forwardMultiplier = (int)(AudioFilter.field309 * 65536.0f);
        }
        if (this.pairs[n] == 0) {
            return 0;
        }
        final float method334 = this.method334(n, 0, n2);
        AudioFilter.field305[n][0] = -2.0f * method334 * (float)Math.cos(this.method336(n, 0, n2));
        AudioFilter.field305[n][1] = method334 * method334;
        for (int i = 1; i < this.pairs[n]; ++i) {
            final float method335 = this.method334(n, i, n2);
            final float n3 = -2.0f * method335 * (float)Math.cos(this.method336(n, i, n2));
            final float n4 = method335 * method335;
            AudioFilter.field305[n][i * 2 + 1] = AudioFilter.field305[n][i * 2 - 1] * n4;
            AudioFilter.field305[n][i * 2] = AudioFilter.field305[n][i * 2 - 1] * n3 + AudioFilter.field305[n][i * 2 - 2] * n4;
            for (int j = i * 2 - 1; j >= 2; --j) {
                final float[] array = AudioFilter.field305[n];
                final int n5 = j;
                array[n5] += AudioFilter.field305[n][j - 1] * n3 + AudioFilter.field305[n][j - 2] * n4;
            }
            final float[] array2 = AudioFilter.field305[n];
            final int n6 = 1;
            array2[n6] += AudioFilter.field305[n][0] * n3 + n4;
            final float[] array3 = AudioFilter.field305[n];
            final int n7 = 0;
            array3[n7] += n3;
        }
        if (n == 0) {
            for (int k = 0; k < this.pairs[0] * 2; ++k) {
                final float[] array4 = AudioFilter.field305[0];
                final int n8 = k;
                array4[n8] *= AudioFilter.field309;
            }
        }
        for (int l = 0; l < this.pairs[n] * 2; ++l) {
            AudioFilter.coefficients[n][l] = (int)(AudioFilter.field305[n][l] * 65536.0f);
        }
        return this.pairs[n] * 2;
    }
    
    float ax(final int n, final int n2, final float n3) {
        return normalize((this.field304[n][0][n2] + n3 * (this.field304[n][1][n2] - this.field304[n][0][n2])) * 1.2207031E-4f);
    }
    
    static float ay(final float n) {
        return 32.703197f * (float)Math.pow(2.0, n) * 3.1415927f / 11025.0f;
    }
    
    float method336(final int n, final int n2, final float n3) {
        return normalize((this.field304[n][0][n2] + n3 * (this.field304[n][1][n2] - this.field304[n][0][n2])) * 1.2207031E-4f);
    }
    
    float al(final int n, final int n2, final float n3) {
        return 1.0f - (float)Math.pow(10.0, -((this.field306[n][0][n2] + n3 * (this.field306[n][1][n2] - this.field306[n][0][n2])) * 0.0015258789f) / 20.0f);
    }
    
    static float normalize(final float n) {
        return 32.703197f * (float)Math.pow(2.0, n) * 3.1415927f / 11025.0f;
    }
    
    int compute(final int n, final float n2) {
        if (n == 0) {
            AudioFilter.field309 = (float)Math.pow(0.1, (this.field307[0] + (this.field307[1] - this.field307[0]) * n2) * 0.0030517578f / 20.0f);
            AudioFilter.forwardMultiplier = (int)(AudioFilter.field309 * 65536.0f);
        }
        if (this.pairs[n] == 0) {
            return 0;
        }
        final float method334 = this.method334(n, 0, n2);
        AudioFilter.field305[n][0] = -2.0f * method334 * (float)Math.cos(this.method336(n, 0, n2));
        AudioFilter.field305[n][1] = method334 * method334;
        for (int i = 1; i < this.pairs[n]; ++i) {
            final float method335 = this.method334(n, i, n2);
            final float n3 = -2.0f * method335 * (float)Math.cos(this.method336(n, i, n2));
            final float n4 = method335 * method335;
            AudioFilter.field305[n][i * 2 + 1] = AudioFilter.field305[n][i * 2 - 1] * n4;
            AudioFilter.field305[n][i * 2] = AudioFilter.field305[n][i * 2 - 1] * n3 + AudioFilter.field305[n][i * 2 - 2] * n4;
            for (int j = i * 2 - 1; j >= 2; --j) {
                final float[] array = AudioFilter.field305[n];
                final int n5 = j;
                array[n5] += AudioFilter.field305[n][j - 1] * n3 + AudioFilter.field305[n][j - 2] * n4;
            }
            final float[] array2 = AudioFilter.field305[n];
            final int n6 = 1;
            array2[n6] += AudioFilter.field305[n][0] * n3 + n4;
            final float[] array3 = AudioFilter.field305[n];
            final int n7 = 0;
            array3[n7] += n3;
        }
        if (n == 0) {
            for (int k = 0; k < this.pairs[0] * 2; ++k) {
                final float[] array4 = AudioFilter.field305[0];
                final int n8 = k;
                array4[n8] *= AudioFilter.field309;
            }
        }
        for (int l = 0; l < this.pairs[n] * 2; ++l) {
            AudioFilter.coefficients[n][l] = (int)(AudioFilter.field305[n][l] * 65536.0f);
        }
        return this.pairs[n] * 2;
    }
    
    final void method333(final Buffer buffer, final SoundEnvelope soundEnvelope) {
        final int ra = Buffer.ra(buffer, (byte)7);
        this.pairs[0] = ra >> 4;
        this.pairs[1] = (ra & 0xF);
        if (ra != 0) {
            this.field307[0] = buffer.readUnsignedShort(-69349981);
            this.field307[1] = buffer.readUnsignedShort(797812762);
            final int ra2 = Buffer.ra(buffer, (byte)7);
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < this.pairs[i]; ++j) {
                    this.field304[i][0][j] = buffer.readUnsignedShort(-158863507);
                    this.field306[i][0][j] = buffer.readUnsignedShort(701991103);
                }
            }
            for (int k = 0; k < 2; ++k) {
                for (int l = 0; l < this.pairs[k]; ++l) {
                    if ((ra2 & 1 << k * 4 << l) != 0x0) {
                        this.field304[k][1][l] = buffer.readUnsignedShort(167827019);
                        this.field306[k][1][l] = buffer.readUnsignedShort(-1618854197);
                    }
                    else {
                        this.field304[k][1][l] = this.field304[k][0][l];
                        this.field306[k][1][l] = this.field306[k][0][l];
                    }
                }
            }
            if (ra2 != 0 || this.field307[1] != this.field307[0]) {
                SoundEnvelope.dk(soundEnvelope, buffer);
            }
        }
        else {
            this.field307[this.field307[1] = 0] = 0;
        }
    }
    
    static float aa(final float n) {
        return 32.703197f * (float)Math.pow(2.0, n) * 3.1415927f / 11025.0f;
    }
    
    float ai(final int n, final int n2, final float n3) {
        return normalize((this.field304[n][0][n2] + n3 * (this.field304[n][1][n2] - this.field304[n][0][n2])) * 1.2207031E-4f);
    }
    
    final void ar(final Buffer buffer, final SoundEnvelope soundEnvelope) {
        final int ra = Buffer.ra(buffer, (byte)7);
        this.pairs[0] = ra >> 4;
        this.pairs[1] = (ra & 0xF);
        if (ra != 0) {
            this.field307[0] = buffer.readUnsignedShort(162386428);
            this.field307[1] = buffer.readUnsignedShort(-1797054800);
            final int ra2 = Buffer.ra(buffer, (byte)7);
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < this.pairs[i]; ++j) {
                    this.field304[i][0][j] = buffer.readUnsignedShort(196506299);
                    this.field306[i][0][j] = buffer.readUnsignedShort(226731756);
                }
            }
            for (int k = 0; k < 2; ++k) {
                for (int l = 0; l < this.pairs[k]; ++l) {
                    if ((ra2 & 1 << k * 4 << l) != 0x0) {
                        this.field304[k][1][l] = buffer.readUnsignedShort(-2081876528);
                        this.field306[k][1][l] = buffer.readUnsignedShort(-1859123041);
                    }
                    else {
                        this.field304[k][1][l] = this.field304[k][0][l];
                        this.field306[k][1][l] = this.field306[k][0][l];
                    }
                }
            }
            if (ra2 != 0 || this.field307[1] != this.field307[0]) {
                SoundEnvelope.dk(soundEnvelope, buffer);
            }
        }
        else {
            this.field307[this.field307[1] = 0] = 0;
        }
    }
    
    float method334(final int n, final int n2, final float n3) {
        return 1.0f - (float)Math.pow(10.0, -((this.field306[n][0][n2] + n3 * (this.field306[n][1][n2] - this.field306[n][0][n2])) * 0.0015258789f) / 20.0f);
    }
    
    float ab(final int n, final int n2, final float n3) {
        return 1.0f - (float)Math.pow(10.0, -((this.field306[n][0][n2] + n3 * (this.field306[n][1][n2] - this.field306[n][0][n2])) * 0.0015258789f) / 20.0f);
    }
    
    float aq(final int n, final int n2, final float n3) {
        return 1.0f - (float)Math.pow(10.0, -((this.field306[n][0][n2] + n3 * (this.field306[n][1][n2] - this.field306[n][0][n2])) * 0.0015258789f) / 20.0f);
    }
    
    float ag(final int n, final int n2, final float n3) {
        return normalize((this.field304[n][0][n2] + n3 * (this.field304[n][1][n2] - this.field304[n][0][n2])) * 1.2207031E-4f);
    }
    
    int ah(final int n, final float n2) {
        if (n == 0) {
            AudioFilter.field309 = (float)Math.pow(0.1, (this.field307[0] + (this.field307[1] - this.field307[0]) * n2) * 0.0030517578f / 20.0f);
            AudioFilter.forwardMultiplier = (int)(AudioFilter.field309 * 65536.0f);
        }
        if (this.pairs[n] == 0) {
            return 0;
        }
        final float method334 = this.method334(n, 0, n2);
        AudioFilter.field305[n][0] = -2.0f * method334 * (float)Math.cos(this.method336(n, 0, n2));
        AudioFilter.field305[n][1] = method334 * method334;
        for (int i = 1; i < this.pairs[n]; ++i) {
            final float method335 = this.method334(n, i, n2);
            final float n3 = -2.0f * method335 * (float)Math.cos(this.method336(n, i, n2));
            final float n4 = method335 * method335;
            AudioFilter.field305[n][i * 2 + 1] = AudioFilter.field305[n][i * 2 - 1] * n4;
            AudioFilter.field305[n][i * 2] = AudioFilter.field305[n][i * 2 - 1] * n3 + AudioFilter.field305[n][i * 2 - 2] * n4;
            for (int j = i * 2 - 1; j >= 2; --j) {
                final float[] array = AudioFilter.field305[n];
                final int n5 = j;
                array[n5] += AudioFilter.field305[n][j - 1] * n3 + AudioFilter.field305[n][j - 2] * n4;
            }
            final float[] array2 = AudioFilter.field305[n];
            final int n6 = 1;
            array2[n6] += AudioFilter.field305[n][0] * n3 + n4;
            final float[] array3 = AudioFilter.field305[n];
            final int n7 = 0;
            array3[n7] += n3;
        }
        if (n == 0) {
            for (int k = 0; k < this.pairs[0] * 2; ++k) {
                final float[] array4 = AudioFilter.field305[0];
                final int n8 = k;
                array4[n8] *= AudioFilter.field309;
            }
        }
        for (int l = 0; l < this.pairs[n] * 2; ++l) {
            AudioFilter.coefficients[n][l] = (int)(AudioFilter.field305[n][l] * 65536.0f);
        }
        return this.pairs[n] * 2;
    }
    
    public static void qa(final LoginScreenAnimation loginScreenAnimation, final int n, final int n2) {
        if (loginScreenAnimation.field1022 == null) {
            loginScreenAnimation.initColors(1903069541);
        }
        if (0 == 72639573 * loginScreenAnimation.field1021) {
            loginScreenAnimation.field1021 = 206403837 * n2;
        }
        int n3 = n2 - 72639573 * loginScreenAnimation.field1021;
        if (n3 >= 256) {
            n3 = 0;
        }
        loginScreenAnimation.field1021 = n2 * 206403837;
        if (n3 > 0) {
            LoginScreenAnimation.fn(loginScreenAnimation, n3, 1093216116);
        }
        LoginScreenAnimation.ke(loginScreenAnimation, n, (byte)(-3));
    }
}
