// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapScaleHandler
{
    int pixelsPerTile;
    byte[][][] tileTemplates;
    static final int ac = 3;
    public static final int cl = 85;
    
    WorldMapScaleHandler(final int n) {
        this.pixelsPerTile = -1275529919 * n;
    }
    
    void bs() {
        final byte[] array = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
        final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = 0; i < this.pixelsPerTile * -28927295; ++i) {
            for (int j = 0; j < -28927295 * this.pixelsPerTile; ++j) {
                if (j <= -28927295 * this.pixelsPerTile / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[5][0] = array2;
        final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
        int n2 = 0;
        for (int k = 0; k < this.pixelsPerTile * -28927295; ++k) {
            for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                if (k <= this.pixelsPerTile * -28927295 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[5][1] = array3;
        final byte[] array4 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n3 = 0;
        for (int n4 = 0; n4 < -28927295 * this.pixelsPerTile; ++n4) {
            for (int n5 = 0; n5 < -28927295 * this.pixelsPerTile; ++n5) {
                if (n5 >= -28927295 * this.pixelsPerTile / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[5][2] = array4;
        final byte[] array5 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < -28927295 * this.pixelsPerTile; ++n7) {
            for (int n8 = 0; n8 < this.pixelsPerTile * -28927295; ++n8) {
                if (n7 >= -28927295 * this.pixelsPerTile / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[5][3] = array5;
    }
    
    void ad() {
        final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = 0; i < this.pixelsPerTile * -28927295; ++i) {
            for (int j = 0; j < this.pixelsPerTile * -28927295; ++j) {
                if (j <= i) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[0][0] = array;
        final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
        int n2 = 0;
        for (int k = this.pixelsPerTile * -28927295 - 1; k >= 0; --k) {
            for (int l = 0; l < -28927295 * this.pixelsPerTile; ++l) {
                if (l <= k) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[0][1] = array2;
        final byte[] array3 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
        int n3 = 0;
        for (int n4 = 0; n4 < -28927295 * this.pixelsPerTile; ++n4) {
            for (int n5 = 0; n5 < this.pixelsPerTile * -28927295; ++n5) {
                if (n5 >= n4) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[0][2] = array3;
        final byte[] array4 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
        int n6 = 0;
        for (int n7 = -28927295 * this.pixelsPerTile - 1; n7 >= 0; --n7) {
            for (int n8 = 0; n8 < this.pixelsPerTile * -28927295; ++n8) {
                if (n8 >= n7) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[0][3] = array4;
    }
    
    void ba() {
        final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -176889920)];
        final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
        int n = 0;
        for (int i = 0; i < -28927295 * this.pixelsPerTile; ++i) {
            for (int j = 0; j < -28927295 * this.pixelsPerTile; ++j) {
                if (j >= i - -28927295 * this.pixelsPerTile / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[7][0] = array2;
        final byte[] array3 = new byte[this.pixelsPerTile * 1604335866 * (-28927295 * this.pixelsPerTile)];
        int n2 = 0;
        for (int k = -28927295 * this.pixelsPerTile - 1; k >= 0; --k) {
            for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                if (l >= k - this.pixelsPerTile * -28927295 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[7][1] = array3;
        final byte[] array4 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * 1265602092)];
        int n3 = 0;
        for (int n4 = -28927295 * this.pixelsPerTile - 1; n4 >= 0; --n4) {
            for (int n5 = this.pixelsPerTile * 1360438725 - 1; n5 >= 0; --n5) {
                if (n5 >= n4 - -1815122887 * this.pixelsPerTile / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[7][2] = array4;
        final byte[] array5 = new byte[this.pixelsPerTile * 238871824 * (this.pixelsPerTile * 996459263)];
        int n6 = 0;
        for (int n7 = 0; n7 < 773880575 * this.pixelsPerTile; ++n7) {
            for (int n8 = -1844260503 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 - 24045013 * this.pixelsPerTile / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[7][3] = array5;
    }
    
    void bb() {
        final byte[] array = new byte[-249758771 * this.pixelsPerTile * (this.pixelsPerTile * 134854655)];
        int n = 0;
        for (int i = -28927295 * this.pixelsPerTile - 1; i >= 0; --i) {
            for (int j = this.pixelsPerTile * 557657253 - 1; j >= 0; --j) {
                if (j <= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[2][0] = array;
        final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
        int n2 = 0;
        for (int k = this.pixelsPerTile * -28927295 - 1; k >= 0; --k) {
            for (int l = 0; l < -28927295 * this.pixelsPerTile; ++l) {
                if (l >= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[2][1] = array2;
        final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
        int n3 = 0;
        for (int n4 = 0; n4 < this.pixelsPerTile * -28927295; ++n4) {
            for (int n5 = 0; n5 < this.pixelsPerTile * 2055496532; ++n5) {
                if (n5 <= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[2][2] = array3;
        final byte[] array4 = new byte[1319475149 * this.pixelsPerTile * (413362199 * this.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < -1428870799 * this.pixelsPerTile; ++n7) {
            for (int n8 = -28927295 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[2][3] = array4;
    }
    
    void init7(final int n) {
        try {
            final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
            int n2 = 0;
            for (int i = 0; i < -28927295 * this.pixelsPerTile; ++i) {
                if (n <= 1066963157) {
                    throw new IllegalStateException();
                }
                for (int j = 0; j < -28927295 * this.pixelsPerTile; ++j) {
                    if (j >= i - -28927295 * this.pixelsPerTile / 2) {
                        if (n <= 1066963157) {
                            return;
                        }
                        array2[n2] = -1;
                    }
                    ++n2;
                }
            }
            this.tileTemplates[7][0] = array2;
            final byte[] array3 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
            int n3 = 0;
            for (int k = -28927295 * this.pixelsPerTile - 1; k >= 0; --k) {
                if (n <= 1066963157) {
                    throw new IllegalStateException();
                }
                for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                    if (n <= 1066963157) {
                        throw new IllegalStateException();
                    }
                    if (l >= k - this.pixelsPerTile * -28927295 / 2) {
                        if (n <= 1066963157) {
                            throw new IllegalStateException();
                        }
                        array3[n3] = -1;
                    }
                    ++n3;
                }
            }
            this.tileTemplates[7][1] = array3;
            final byte[] array4 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
            int n4 = 0;
            for (int n5 = -28927295 * this.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n <= 1066963157) {
                    throw new IllegalStateException();
                }
                for (int n6 = this.pixelsPerTile * -28927295 - 1; n6 >= 0; --n6) {
                    if (n6 >= n5 - -28927295 * this.pixelsPerTile / 2) {
                        if (n <= 1066963157) {
                            throw new IllegalStateException();
                        }
                        array4[n4] = -1;
                    }
                    ++n4;
                }
            }
            this.tileTemplates[7][2] = array4;
            final byte[] array5 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
            int n7 = 0;
            for (int n8 = 0; n8 < -28927295 * this.pixelsPerTile; ++n8) {
                if (n <= 1066963157) {
                    return;
                }
                for (int n9 = -28927295 * this.pixelsPerTile - 1; n9 >= 0; --n9) {
                    if (n <= 1066963157) {
                        throw new IllegalStateException();
                    }
                    if (n9 >= n8 - -28927295 * this.pixelsPerTile / 2) {
                        if (n <= 1066963157) {
                            throw new IllegalStateException();
                        }
                        array5[n7] = -1;
                    }
                    ++n7;
                }
            }
            this.tileTemplates[7][3] = array5;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.ao(" + ')');
        }
    }
    
    void init4(final int n) {
        try {
            final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n2 = 0;
            for (int i = this.pixelsPerTile * -28927295 - 1; i >= 0; --i) {
                if (n <= 1886473019) {
                    throw new IllegalStateException();
                }
                for (int j = -28927295 * this.pixelsPerTile - 1; j >= 0; --j) {
                    if (n <= 1886473019) {
                        throw new IllegalStateException();
                    }
                    if (j >= i >> 1) {
                        if (n <= 1886473019) {
                            throw new IllegalStateException();
                        }
                        array[n2] = -1;
                    }
                    ++n2;
                }
            }
            this.tileTemplates[4][0] = array;
            final byte[] array2 = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
            int n3 = 0;
            for (int k = this.pixelsPerTile * -28927295 - 1; k >= 0; --k) {
                if (n <= 1886473019) {
                    throw new IllegalStateException();
                }
                for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                    if (n <= 1886473019) {
                        throw new IllegalStateException();
                    }
                    if (l <= k << 1) {
                        if (n <= 1886473019) {
                            return;
                        }
                        array2[n3] = -1;
                    }
                    ++n3;
                }
            }
            this.tileTemplates[4][1] = array2;
            final byte[] array3 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
            int n4 = 0;
            for (int n5 = 0; n5 < -28927295 * this.pixelsPerTile; ++n5) {
                if (n <= 1886473019) {
                    return;
                }
                for (int n6 = 0; n6 < -28927295 * this.pixelsPerTile; ++n6) {
                    if (n6 >= n5 >> 1) {
                        array3[n4] = -1;
                    }
                    ++n4;
                }
            }
            this.tileTemplates[4][2] = array3;
            final byte[] array4 = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
            int n7 = 0;
            for (int n8 = 0; n8 < this.pixelsPerTile * -28927295; ++n8) {
                if (n <= 1886473019) {
                    throw new IllegalStateException();
                }
                for (int n9 = this.pixelsPerTile * -28927295 - 1; n9 >= 0; --n9) {
                    if (n <= 1886473019) {
                        throw new IllegalStateException();
                    }
                    if (n9 <= n8 << 1) {
                        if (n <= 1886473019) {
                            return;
                        }
                        array4[n7] = -1;
                    }
                    ++n7;
                }
            }
            this.tileTemplates[4][3] = array4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.at(" + ')');
        }
    }
    
    int av(int n, final int n2) {
        if (9 == n2) {
            n = (1 + n & 0x3);
        }
        if (10 == n2) {
            n = (n + 3 & 0x3);
        }
        if (11 == n2) {
            n = (n + 3 & 0x3);
        }
        return n;
    }
    
    public static void rn(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        final byte[] array2 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = 0; i < worldMapScaleHandler.pixelsPerTile * -28927295; ++i) {
            for (int j = 0; j < -28927295 * worldMapScaleHandler.pixelsPerTile; ++j) {
                if (j <= -28927295 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[5][0] = array2;
        final byte[] array3 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n2 = 0;
        for (int k = 0; k < worldMapScaleHandler.pixelsPerTile * -28927295; ++k) {
            for (int l = 0; l < worldMapScaleHandler.pixelsPerTile * -28927295; ++l) {
                if (k <= worldMapScaleHandler.pixelsPerTile * -28927295 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[5][1] = array3;
        final byte[] array4 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n3 = 0;
        for (int n4 = 0; n4 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n4) {
            for (int n5 = 0; n5 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n5) {
                if (n5 >= -28927295 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[5][2] = array4;
        final byte[] array5 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n7) {
            for (int n8 = 0; n8 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n8) {
                if (n7 >= -28927295 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[5][3] = array5;
    }
    
    void as() {
        if (null != this.tileTemplates) {
            return;
        }
        this.tileTemplates = new byte[8][4][];
        this.init0(2077047150);
        this.init1(-1636061073);
        this.init2((byte)7);
        this.init3((byte)73);
        this.init4(2044669736);
        uh(this, -392774296);
        this.init6(525089655);
        this.init7(1187465302);
    }
    
    void ax(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int ar, int method1558) {
        if (ar != 0 && -28927295 * this.pixelsPerTile != 0 && null != this.tileTemplates) {
            method1558 = this.method1558(method1558, ar, -1761247305);
            ar = this.ar(ar, -549449992);
            Rasterizer2D.Rasterizer2D_drawGradientPixels(n, n2, n5, n6, n3, n4, this.tileTemplates[ar - 1][method1558], -28927295 * this.pixelsPerTile, true);
        }
    }
    
    void init6(final int n) {
        try {
            final byte[] array = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
            final byte[] array2 = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
            int n2 = 0;
            for (int i = 0; i < this.pixelsPerTile * -28927295; ++i) {
                if (n >= 1444254754) {
                    throw new IllegalStateException();
                }
                for (int j = 0; j < this.pixelsPerTile * -28927295; ++j) {
                    if (j <= i - -28927295 * this.pixelsPerTile / 2) {
                        if (n >= 1444254754) {
                            return;
                        }
                        array2[n2] = -1;
                    }
                    ++n2;
                }
            }
            this.tileTemplates[6][0] = array2;
            final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n3 = 0;
            for (int k = -28927295 * this.pixelsPerTile - 1; k >= 0; --k) {
                if (n >= 1444254754) {
                    throw new IllegalStateException();
                }
                for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                    if (l <= k - this.pixelsPerTile * -28927295 / 2) {
                        if (n >= 1444254754) {
                            throw new IllegalStateException();
                        }
                        array3[n3] = -1;
                    }
                    ++n3;
                }
            }
            this.tileTemplates[6][1] = array3;
            final byte[] array4 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
            int n4 = 0;
            for (int n5 = this.pixelsPerTile * -28927295 - 1; n5 >= 0; --n5) {
                for (int n6 = -28927295 * this.pixelsPerTile - 1; n6 >= 0; --n6) {
                    if (n >= 1444254754) {
                        throw new IllegalStateException();
                    }
                    if (n6 <= n5 - this.pixelsPerTile * -28927295 / 2) {
                        if (n >= 1444254754) {
                            return;
                        }
                        array4[n4] = -1;
                    }
                    ++n4;
                }
            }
            this.tileTemplates[6][2] = array4;
            final byte[] array5 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
            int n7 = 0;
            for (int n8 = 0; n8 < this.pixelsPerTile * -28927295; ++n8) {
                for (int n9 = this.pixelsPerTile * -28927295 - 1; n9 >= 0; --n9) {
                    if (n >= 1444254754) {
                        throw new IllegalStateException();
                    }
                    if (n9 <= n8 - -28927295 * this.pixelsPerTile / 2) {
                        if (n >= 1444254754) {
                            throw new IllegalStateException();
                        }
                        array5[n7] = -1;
                    }
                    ++n7;
                }
            }
            this.tileTemplates[6][3] = array5;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.ay(" + ')');
        }
    }
    
    public static void xp(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        final byte[] array2 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (worldMapScaleHandler.pixelsPerTile * 665987081)];
        int n = 0;
        for (int i = 0; i < worldMapScaleHandler.pixelsPerTile * -562957881; ++i) {
            for (int j = 0; j < -28927295 * worldMapScaleHandler.pixelsPerTile; ++j) {
                if (j <= 1410873137 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[5][0] = array2;
        final byte[] array3 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-1192194168 * worldMapScaleHandler.pixelsPerTile)];
        int n2 = 0;
        for (int k = 0; k < worldMapScaleHandler.pixelsPerTile * 481097627; ++k) {
            for (int l = 0; l < worldMapScaleHandler.pixelsPerTile * -28927295; ++l) {
                if (k <= worldMapScaleHandler.pixelsPerTile * -1490682082 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[5][1] = array3;
        final byte[] array4 = new byte[-1043597603 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * 1956931482)];
        int n3 = 0;
        for (int n4 = 0; n4 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n4) {
            for (int n5 = 0; n5 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n5) {
                if (n5 >= -1554175516 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[5][2] = array4;
        final byte[] array5 = new byte[worldMapScaleHandler.pixelsPerTile * -1569265212 * (-2115673290 * worldMapScaleHandler.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n7) {
            for (int n8 = 0; n8 < worldMapScaleHandler.pixelsPerTile * -730913978; ++n8) {
                if (n7 >= 637329799 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[5][3] = array5;
    }
    
    public static void tn(final WorldMapScaleHandler worldMapScaleHandler) {
        if (null != worldMapScaleHandler.tileTemplates) {
            return;
        }
        worldMapScaleHandler.tileTemplates = new byte[8][4][];
        worldMapScaleHandler.init0(2077047150);
        worldMapScaleHandler.init1(-1636061073);
        worldMapScaleHandler.init2((byte)7);
        worldMapScaleHandler.init3((byte)32);
        worldMapScaleHandler.init4(2072452748);
        uh(worldMapScaleHandler, -392774296);
        worldMapScaleHandler.init6(1440536209);
        worldMapScaleHandler.init7(2101074846);
    }
    
    void bo() {
        final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = this.pixelsPerTile * -28927295 - 1; i >= 0; --i) {
            for (int j = 0; j < -28927295 * this.pixelsPerTile; ++j) {
                if (j >= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[3][0] = array;
        final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
        int n2 = 0;
        for (int k = 0; k < -28927295 * this.pixelsPerTile; ++k) {
            for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                if (l <= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[3][1] = array2;
        final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n3 = 0;
        for (int n4 = 0; n4 < this.pixelsPerTile * -28927295; ++n4) {
            for (int n5 = -28927295 * this.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n5 >= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[3][2] = array3;
        final byte[] array4 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
        int n6 = 0;
        for (int n7 = -28927295 * this.pixelsPerTile - 1; n7 >= 0; --n7) {
            for (int n8 = -28927295 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 <= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[3][3] = array4;
    }
    
    public static void ru(final WorldMapScaleHandler worldMapScaleHandler, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int ar, int method1558, final int n7) {
        if (worldMapScaleHandler == null) {
            worldMapScaleHandler.method1557(n, n, n, n, n, n, n, n, n);
        }
        try {
            if (ar != 0 && -28927295 * worldMapScaleHandler.pixelsPerTile != 0) {
                if (n7 == 1520441774) {
                    throw new IllegalStateException();
                }
                if (null != worldMapScaleHandler.tileTemplates) {
                    method1558 = worldMapScaleHandler.method1558(method1558, ar, -1761247305);
                    ar = worldMapScaleHandler.ar(ar, -835650006);
                    Rasterizer2D.Rasterizer2D_drawGradientPixels(n, n2, n5, n6, n3, n4, worldMapScaleHandler.tileTemplates[ar - 1][method1558], -28927295 * worldMapScaleHandler.pixelsPerTile, true);
                    return;
                }
                if (n7 == 1520441774) {
                    return;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.af(" + ')');
        }
    }
    
    public static void xl(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[325234579 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -1596002889)];
        int n = 0;
        for (int i = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; i >= 0; --i) {
            for (int j = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; j >= 0; --j) {
                if (j <= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[2][0] = array;
        final byte[] array2 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (2011508177 * worldMapScaleHandler.pixelsPerTile)];
        int n2 = 0;
        for (int k = worldMapScaleHandler.pixelsPerTile * -1647303945 - 1; k >= 0; --k) {
            for (int l = 0; l < -28927295 * worldMapScaleHandler.pixelsPerTile; ++l) {
                if (l >= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[2][1] = array2;
        final byte[] array3 = new byte[403076092 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n3 = 0;
        for (int n4 = 0; n4 < worldMapScaleHandler.pixelsPerTile * 935826643; ++n4) {
            for (int n5 = 0; n5 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n5) {
                if (n5 <= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[2][2] = array3;
        final byte[] array4 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n7) {
            for (int n8 = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[2][3] = array4;
    }
    
    void br() {
        final byte[] array = new byte[this.pixelsPerTile * -28927295 * (994367649 * this.pixelsPerTile)];
        final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = 0; i < this.pixelsPerTile * -1595721285; ++i) {
            for (int j = 0; j < -1151394712 * this.pixelsPerTile; ++j) {
                if (j <= -28927295 * this.pixelsPerTile / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[5][0] = array2;
        final byte[] array3 = new byte[-1956358400 * this.pixelsPerTile * (-2118673578 * this.pixelsPerTile)];
        int n2 = 0;
        for (int k = 0; k < this.pixelsPerTile * 1699546683; ++k) {
            for (int l = 0; l < this.pixelsPerTile * -937976156; ++l) {
                if (k <= this.pixelsPerTile * 1195133786 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[5][1] = array3;
        final byte[] array4 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * 142126232)];
        int n3 = 0;
        for (int n4 = 0; n4 < -28927295 * this.pixelsPerTile; ++n4) {
            for (int n5 = 0; n5 < 861144062 * this.pixelsPerTile; ++n5) {
                if (n5 >= 1908412248 * this.pixelsPerTile / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[5][2] = array4;
        final byte[] array5 = new byte[this.pixelsPerTile * -1573013601 * (1276659761 * this.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < -860546073 * this.pixelsPerTile; ++n7) {
            for (int n8 = 0; n8 < this.pixelsPerTile * -28927295; ++n8) {
                if (n7 >= -28927295 * this.pixelsPerTile / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[5][3] = array5;
    }
    
    int method1559(int n, final int n2) {
        if (9 == n2) {
            n = (1 + n & 0x3);
        }
        if (10 == n2) {
            n = (n + 3 & 0x3);
        }
        if (11 == n2) {
            n = (n + 3 & 0x3);
        }
        return n;
    }
    
    void init3(final byte b) {
        try {
            final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n = 0;
            for (int i = this.pixelsPerTile * -28927295 - 1; i >= 0; --i) {
                if (b <= 0) {
                    return;
                }
                for (int j = 0; j < -28927295 * this.pixelsPerTile; ++j) {
                    if (j >= i >> 1) {
                        if (b <= 0) {
                            throw new IllegalStateException();
                        }
                        array[n] = -1;
                    }
                    ++n;
                }
            }
            this.tileTemplates[3][0] = array;
            final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
            int n2 = 0;
            for (int k = 0; k < -28927295 * this.pixelsPerTile; ++k) {
                for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    if (l <= k << 1) {
                        array2[n2] = -1;
                    }
                    ++n2;
                }
            }
            this.tileTemplates[3][1] = array2;
            final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n3 = 0;
            for (int n4 = 0; n4 < this.pixelsPerTile * -28927295; ++n4) {
                for (int n5 = -28927295 * this.pixelsPerTile - 1; n5 >= 0; --n5) {
                    if (b <= 0) {
                        return;
                    }
                    if (n5 >= n4 >> 1) {
                        if (b <= 0) {
                            throw new IllegalStateException();
                        }
                        array3[n3] = -1;
                    }
                    ++n3;
                }
            }
            this.tileTemplates[3][2] = array3;
            final byte[] array4 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
            int n6 = 0;
            for (int n7 = -28927295 * this.pixelsPerTile - 1; n7 >= 0; --n7) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                for (int n8 = -28927295 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    if (n8 <= n7 << 1) {
                        if (b <= 0) {
                            throw new IllegalStateException();
                        }
                        array4[n6] = -1;
                    }
                    ++n6;
                }
            }
            this.tileTemplates[3][3] = array4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.al(" + ')');
        }
    }
    
    int method1558(int n, final int n2, final int n3) {
        try {
            if (9 == n2) {
                if (n3 != -1761247305) {
                    throw new IllegalStateException();
                }
                n = (1 + n & 0x3);
            }
            if (10 == n2) {
                if (n3 != -1761247305) {
                    throw new IllegalStateException();
                }
                n = (n + 3 & 0x3);
            }
            if (11 == n2) {
                if (n3 != -1761247305) {
                    throw new IllegalStateException();
                }
                n = (n + 3 & 0x3);
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.an(" + ')');
        }
    }
    
    void init(final int n) {
        try {
            if (null != this.tileTemplates) {
                return;
            }
            this.tileTemplates = new byte[8][4][];
            this.init0(2077047150);
            this.init1(-1636061073);
            this.init2((byte)7);
            this.init3((byte)79);
            this.init4(2056454004);
            uh(this, -392774296);
            this.init6(710623043);
            this.init7(1893432725);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.ac(" + ')');
        }
    }
    
    public static void if(final WorldMapScaleHandler worldMapScaleHandler, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int ar, int method1558) {
        if (worldMapScaleHandler == null) {
            worldMapScaleHandler.aj();
        }
        if (ar != 0 && 699155094 * worldMapScaleHandler.pixelsPerTile != 0 && null != worldMapScaleHandler.tileTemplates) {
            method1558 = worldMapScaleHandler.method1558(method1558, ar, -1761247305);
            ar = worldMapScaleHandler.ar(ar, -896337895);
            Rasterizer2D.Rasterizer2D_drawGradientPixels(n, n2, n5, n6, n3, n4, worldMapScaleHandler.tileTemplates[ar - 1][method1558], -28927295 * worldMapScaleHandler.pixelsPerTile, true);
        }
    }
    
    void init0(final int n) {
        try {
            final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n2 = 0;
            for (int i = 0; i < this.pixelsPerTile * -28927295; ++i) {
                if (n != 2077047150) {
                    throw new IllegalStateException();
                }
                for (int j = 0; j < this.pixelsPerTile * -28927295; ++j) {
                    if (n != 2077047150) {
                        throw new IllegalStateException();
                    }
                    if (j <= i) {
                        array[n2] = -1;
                    }
                    ++n2;
                }
            }
            this.tileTemplates[0][0] = array;
            final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
            int n3 = 0;
            for (int k = this.pixelsPerTile * -28927295 - 1; k >= 0; --k) {
                if (n != 2077047150) {
                    throw new IllegalStateException();
                }
                for (int l = 0; l < -28927295 * this.pixelsPerTile; ++l) {
                    if (n != 2077047150) {
                        throw new IllegalStateException();
                    }
                    if (l <= k) {
                        if (n != 2077047150) {
                            throw new IllegalStateException();
                        }
                        array2[n3] = -1;
                    }
                    ++n3;
                }
            }
            this.tileTemplates[0][1] = array2;
            final byte[] array3 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
            int n4 = 0;
            for (int n5 = 0; n5 < -28927295 * this.pixelsPerTile; ++n5) {
                if (n != 2077047150) {
                    throw new IllegalStateException();
                }
                for (int n6 = 0; n6 < this.pixelsPerTile * -28927295; ++n6) {
                    if (n6 >= n5) {
                        array3[n4] = -1;
                    }
                    ++n4;
                }
            }
            this.tileTemplates[0][2] = array3;
            final byte[] array4 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
            int n7 = 0;
            for (int n8 = -28927295 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n != 2077047150) {
                    throw new IllegalStateException();
                }
                for (int n9 = 0; n9 < this.pixelsPerTile * -28927295; ++n9) {
                    if (n != 2077047150) {
                        throw new IllegalStateException();
                    }
                    if (n9 >= n8) {
                        if (n != 2077047150) {
                            throw new IllegalStateException();
                        }
                        array4[n7] = -1;
                    }
                    ++n7;
                }
            }
            this.tileTemplates[0][3] = array4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.au(" + ')');
        }
    }
    
    void init5(final int n) {
        try {
            if (null != this.tileTemplates) {
                return;
            }
            this.tileTemplates = new byte[8][4][];
            this.init6(2077047150);
            this.init1(-1636061073);
            this.init2((byte)7);
            this.init2((byte)79);
            this.init(2056454004);
            uh(this, -392774296);
            this.init6(710623043);
            this.init(1893432725);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.ac(" + ')');
        }
    }
    
    public static void ki(final ClientPreferences clientPreferences, final boolean b) {
        if (clientPreferences == null) {
            clientPreferences.bv();
        }
    }
    
    void by() {
        final byte[] array = new byte[-869970014 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = this.pixelsPerTile * 601561467 - 1; i >= 0; --i) {
            for (int j = 0; j < this.pixelsPerTile * -992044124; ++j) {
                if (j <= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[1][0] = array;
        final byte[] array2 = new byte[851534468 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n2 = 0;
        for (int k = 0; k < this.pixelsPerTile * -28927295; ++k) {
            for (int l = 0; l < this.pixelsPerTile * -2121711557; ++l) {
                if (n2 < 0 || n2 >= array2.length) {
                    ++n2;
                }
                else {
                    if (l >= k << 1) {
                        array2[n2] = -1;
                    }
                    ++n2;
                }
            }
        }
        this.tileTemplates[1][1] = array2;
        final byte[] array3 = new byte[-94384825 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n3 = 0;
        for (int n4 = 0; n4 < this.pixelsPerTile * -28927295; ++n4) {
            for (int n5 = -28927295 * this.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n5 <= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[1][2] = array3;
        final byte[] array4 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -1041192549)];
        int n6 = 0;
        for (int n7 = this.pixelsPerTile * -1576675862 - 1; n7 >= 0; --n7) {
            for (int n8 = 1535367910 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[1][3] = array4;
    }
    
    void bx() {
        final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = this.pixelsPerTile * -28927295 - 1; i >= 0; --i) {
            for (int j = 0; j < -28927295 * this.pixelsPerTile; ++j) {
                if (j >= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[3][0] = array;
        final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
        int n2 = 0;
        for (int k = 0; k < -28927295 * this.pixelsPerTile; ++k) {
            for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                if (l <= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[3][1] = array2;
        final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n3 = 0;
        for (int n4 = 0; n4 < this.pixelsPerTile * -28927295; ++n4) {
            for (int n5 = -28927295 * this.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n5 >= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[3][2] = array3;
        final byte[] array4 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
        int n6 = 0;
        for (int n7 = -28927295 * this.pixelsPerTile - 1; n7 >= 0; --n7) {
            for (int n8 = -28927295 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 <= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[3][3] = array4;
    }
    
    int ar(final int n, final int n2) {
        try {
            if (9 != n) {
                if (n2 >= 739977265) {
                    throw new IllegalStateException();
                }
                if (10 == n) {
                    if (n2 >= 739977265) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    if (n == 11) {
                        return 8;
                    }
                    return n;
                }
            }
            return 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.aw(" + ')');
        }
    }
    
    void ap() {
        final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = this.pixelsPerTile * 1989553220 - 1; i >= 0; --i) {
            for (int j = 0; j < this.pixelsPerTile * -28927295; ++j) {
                if (j <= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[1][0] = array;
        final byte[] array2 = new byte[879496571 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n2 = 0;
        for (int k = 0; k < this.pixelsPerTile * -28927295; ++k) {
            for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                if (n2 >= 0 && n2 < array2.length) {
                    if (l >= k << 1) {
                        array2[n2] = -1;
                    }
                    ++n2;
                }
                else {
                    ++n2;
                }
            }
        }
        this.tileTemplates[1][1] = array2;
        final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * 591864463)];
        int n3 = 0;
        for (int n4 = 0; n4 < this.pixelsPerTile * -761996719; ++n4) {
            for (int n5 = 1615727427 * this.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n5 <= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[1][2] = array3;
        final byte[] array4 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * 356882399)];
        int n6 = 0;
        for (int n7 = this.pixelsPerTile * -28927295 - 1; n7 >= 0; --n7) {
            for (int n8 = -28927295 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[1][3] = array4;
    }
    
    public static void vy(final WorldMapScaleHandler worldMapScaleHandler) {
        if (null != worldMapScaleHandler.tileTemplates) {
            return;
        }
        worldMapScaleHandler.tileTemplates = new byte[8][4][];
        worldMapScaleHandler.init0(2077047150);
        worldMapScaleHandler.init1(-1636061073);
        worldMapScaleHandler.init2((byte)7);
        worldMapScaleHandler.init3((byte)87);
        worldMapScaleHandler.init4(1928904446);
        uh(worldMapScaleHandler, -392774296);
        worldMapScaleHandler.init6(1381958193);
        worldMapScaleHandler.init7(1451981509);
    }
    
    public static void pg(final WorldMapScaleHandler worldMapScaleHandler, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int ar, int method1558) {
        if (worldMapScaleHandler == null) {
            worldMapScaleHandler.method1558(n, n, n);
        }
        if (ar == 0 || -28927295 * worldMapScaleHandler.pixelsPerTile == 0 || null == worldMapScaleHandler.tileTemplates) {
            return;
        }
        method1558 = worldMapScaleHandler.method1558(method1558, ar, -1761247305);
        ar = worldMapScaleHandler.ar(ar, 24131052);
        Rasterizer2D.Rasterizer2D_drawGradientPixels(n, n2, n5, n6, n3, n4, worldMapScaleHandler.tileTemplates[ar - 1][method1558], -28927295 * worldMapScaleHandler.pixelsPerTile, true);
    }
    
    public static boolean gy(final World world) {
        return (0x10000 & world.properties * 1215278544) != 0x0;
    }
    
    void method1557(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, int method1559, int method1560, final int n7) {
        try {
            if (method1559 != 0 && -28927295 * this.pixelsPerTile != 0) {
                if (n7 == 1520441774) {
                    throw new IllegalStateException();
                }
                if (null != this.tileTemplates) {
                    method1560 = this.method1558(method1560, method1559, -1761247305);
                    method1559 = this.method1559(method1559, -835650006);
                    Rasterizer2D.gz(n, n2, n5, n6, n3, n4, this.tileTemplates[method1559 - 1][method1560], -28927295 * this.pixelsPerTile, true);
                    return;
                }
                if (n7 == 1520441774) {
                    return;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.af(" + ')');
        }
    }
    
    public static void init1(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[2074296052 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        final byte[] array2 = new byte[1067709470 * worldMapScaleHandler.pixelsPerTile * (-450018265 * worldMapScaleHandler.pixelsPerTile)];
        int n = 0;
        for (int i = 0; i < worldMapScaleHandler.pixelsPerTile * -28927295; ++i) {
            for (int j = 0; j < worldMapScaleHandler.pixelsPerTile * -28927295; ++j) {
                if (j <= i - -28927295 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[6][0] = array2;
        final byte[] array3 = new byte[-744841326 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -372170917)];
        int n2 = 0;
        for (int k = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; k >= 0; --k) {
            for (int l = 0; l < worldMapScaleHandler.pixelsPerTile * 280767039; ++l) {
                if (l <= k - worldMapScaleHandler.pixelsPerTile * -2114200848 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[6][1] = array3;
        final byte[] array4 = new byte[worldMapScaleHandler.pixelsPerTile * -1623166238 * (worldMapScaleHandler.pixelsPerTile * 975043909)];
        int n3 = 0;
        for (int n4 = worldMapScaleHandler.pixelsPerTile * -867925377 - 1; n4 >= 0; --n4) {
            for (int n5 = 857151561 * worldMapScaleHandler.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n5 <= n4 - worldMapScaleHandler.pixelsPerTile * -28927295 / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[6][2] = array4;
        final byte[] array5 = new byte[worldMapScaleHandler.pixelsPerTile * 2078107990 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < worldMapScaleHandler.pixelsPerTile * -1736398624; ++n7) {
            for (int n8 = worldMapScaleHandler.pixelsPerTile * 1395545254 - 1; n8 >= 0; --n8) {
                if (n8 <= n7 - 1606208046 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[6][3] = array5;
    }
    
    void init1(final int n) {
        try {
            final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n2 = 0;
            for (int i = this.pixelsPerTile * -28927295 - 1; i >= 0; --i) {
                if (n != -1636061073) {
                    throw new IllegalStateException();
                }
                for (int j = 0; j < this.pixelsPerTile * -28927295; ++j) {
                    if (n != -1636061073) {
                        throw new IllegalStateException();
                    }
                    if (j <= i >> 1) {
                        if (n != -1636061073) {
                            return;
                        }
                        array[n2] = -1;
                    }
                    ++n2;
                }
            }
            this.tileTemplates[1][0] = array;
            final byte[] array2 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n3 = 0;
            for (int k = 0; k < this.pixelsPerTile * -28927295; ++k) {
                if (n != -1636061073) {
                    throw new IllegalStateException();
                }
                for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                    if (n != -1636061073) {
                        throw new IllegalStateException();
                    }
                    if (n3 >= 0) {
                        if (n3 < array2.length) {
                            if (l >= k << 1) {
                                if (n != -1636061073) {
                                    throw new IllegalStateException();
                                }
                                array2[n3] = -1;
                            }
                            ++n3;
                            continue;
                        }
                        if (n != -1636061073) {
                            return;
                        }
                    }
                    ++n3;
                }
            }
            this.tileTemplates[1][1] = array2;
            final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n4 = 0;
            for (int n5 = 0; n5 < this.pixelsPerTile * -28927295; ++n5) {
                if (n != -1636061073) {
                    return;
                }
                for (int n6 = -28927295 * this.pixelsPerTile - 1; n6 >= 0; --n6) {
                    if (n != -1636061073) {
                        return;
                    }
                    if (n6 <= n5 >> 1) {
                        if (n != -1636061073) {
                            throw new IllegalStateException();
                        }
                        array3[n4] = -1;
                    }
                    ++n4;
                }
            }
            this.tileTemplates[1][2] = array3;
            final byte[] array4 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n7 = 0;
            for (int n8 = this.pixelsPerTile * -28927295 - 1; n8 >= 0; --n8) {
                if (n != -1636061073) {
                    throw new IllegalStateException();
                }
                for (int n9 = -28927295 * this.pixelsPerTile - 1; n9 >= 0; --n9) {
                    if (n9 >= n8 << 1) {
                        if (n != -1636061073) {
                            throw new IllegalStateException();
                        }
                        array4[n7] = -1;
                    }
                    ++n7;
                }
            }
            this.tileTemplates[1][3] = array4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.ab(" + ')');
        }
    }
    
    public static void kp(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[1721906546 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -1040623164)];
        int n = 0;
        for (int i = worldMapScaleHandler.pixelsPerTile * -1840122785 - 1; i >= 0; --i) {
            for (int j = 0; j < worldMapScaleHandler.pixelsPerTile * 669006340; ++j) {
                if (j <= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[1][0] = array;
        final byte[] array2 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n2 = 0;
        for (int k = 0; k < worldMapScaleHandler.pixelsPerTile * -28927295; ++k) {
            for (int l = 0; l < worldMapScaleHandler.pixelsPerTile * -1566679737; ++l) {
                if (n2 >= 0 && n2 < array2.length) {
                    if (l >= k << 1) {
                        array2[n2] = -1;
                    }
                    ++n2;
                }
                else {
                    ++n2;
                }
            }
        }
        worldMapScaleHandler.tileTemplates[1][1] = array2;
        final byte[] array3 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * 1783515026)];
        int n3 = 0;
        for (int n4 = 0; n4 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n4) {
            for (int n5 = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n5 <= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[1][2] = array3;
        final byte[] array4 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -676838324)];
        int n6 = 0;
        for (int n7 = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; n7 >= 0; --n7) {
            for (int n8 = -1860269805 * worldMapScaleHandler.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[1][3] = array4;
    }
    
    void init2(final byte b) {
        try {
            final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
            int n = 0;
            for (int i = -28927295 * this.pixelsPerTile - 1; i >= 0; --i) {
                if (b != 7) {
                    throw new IllegalStateException();
                }
                for (int j = this.pixelsPerTile * -28927295 - 1; j >= 0; --j) {
                    if (j <= i >> 1) {
                        array[n] = -1;
                    }
                    ++n;
                }
            }
            this.tileTemplates[2][0] = array;
            final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
            int n2 = 0;
            for (int k = this.pixelsPerTile * -28927295 - 1; k >= 0; --k) {
                if (b != 7) {
                    throw new IllegalStateException();
                }
                for (int l = 0; l < -28927295 * this.pixelsPerTile; ++l) {
                    if (b != 7) {
                        throw new IllegalStateException();
                    }
                    if (l >= k << 1) {
                        if (b != 7) {
                            throw new IllegalStateException();
                        }
                        array2[n2] = -1;
                    }
                    ++n2;
                }
            }
            this.tileTemplates[2][1] = array2;
            final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
            int n3 = 0;
            for (int n4 = 0; n4 < this.pixelsPerTile * -28927295; ++n4) {
                if (b != 7) {
                    throw new IllegalStateException();
                }
                for (int n5 = 0; n5 < this.pixelsPerTile * -28927295; ++n5) {
                    if (b != 7) {
                        throw new IllegalStateException();
                    }
                    if (n5 <= n4 >> 1) {
                        if (b != 7) {
                            throw new IllegalStateException();
                        }
                        array3[n3] = -1;
                    }
                    ++n3;
                }
            }
            this.tileTemplates[2][2] = array3;
            final byte[] array4 = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
            int n6 = 0;
            for (int n7 = 0; n7 < -28927295 * this.pixelsPerTile; ++n7) {
                if (b != 7) {
                    throw new IllegalStateException();
                }
                for (int n8 = -28927295 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                    if (n8 >= n7 << 1) {
                        if (b != 7) {
                            throw new IllegalStateException();
                        }
                        array4[n6] = -1;
                    }
                    ++n6;
                }
            }
            this.tileTemplates[2][3] = array4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.aq(" + ')');
        }
    }
    
    void aj() {
        if (null != this.tileTemplates) {
            return;
        }
        this.tileTemplates = new byte[8][4][];
        this.init0(2077047150);
        this.init1(-1636061073);
        this.init2((byte)7);
        this.init3((byte)89);
        this.init4(1978650554);
        uh(this, -392774296);
        this.init6(1170196205);
        this.init7(1643444377);
    }
    
    void bz() {
        final byte[] array = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = this.pixelsPerTile * -28927295 - 1; i >= 0; --i) {
            for (int j = 0; j < 1029752496 * this.pixelsPerTile; ++j) {
                if (j >= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[3][0] = array;
        final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
        int n2 = 0;
        for (int k = 0; k < 1648470175 * this.pixelsPerTile; ++k) {
            for (int l = 0; l < this.pixelsPerTile * 1648619694; ++l) {
                if (l <= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[3][1] = array2;
        final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * 1194168814)];
        int n3 = 0;
        for (int n4 = 0; n4 < this.pixelsPerTile * -28927295; ++n4) {
            for (int n5 = -137086430 * this.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n5 >= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[3][2] = array3;
        final byte[] array4 = new byte[this.pixelsPerTile * -96597957 * (this.pixelsPerTile * -1665383157)];
        int n6 = 0;
        for (int n7 = -1688691737 * this.pixelsPerTile - 1; n7 >= 0; --n7) {
            for (int n8 = -28927295 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 <= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[3][3] = array4;
    }
    
    public static void jq(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[1063868810 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; i >= 0; --i) {
            for (int j = 0; j < -28927295 * worldMapScaleHandler.pixelsPerTile; ++j) {
                if (j >= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[3][0] = array;
        final byte[] array2 = new byte[worldMapScaleHandler.pixelsPerTile * -1704429025 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n2 = 0;
        for (int k = 0; k < -28927295 * worldMapScaleHandler.pixelsPerTile; ++k) {
            for (int l = 0; l < worldMapScaleHandler.pixelsPerTile * -28927295; ++l) {
                if (l <= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[3][1] = array2;
        final byte[] array3 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n3 = 0;
        for (int n4 = 0; n4 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n4) {
            for (int n5 = 162790037 * worldMapScaleHandler.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n5 >= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[3][2] = array3;
        final byte[] array4 = new byte[worldMapScaleHandler.pixelsPerTile * -244860198 * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n6 = 0;
        for (int n7 = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; n7 >= 0; --n7) {
            for (int n8 = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 <= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[3][3] = array4;
    }
    
    public static void go(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; i >= 0; --i) {
            for (int j = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; j >= 0; --j) {
                if (j <= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[2][0] = array;
        final byte[] array2 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n2 = 0;
        for (int k = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; k >= 0; --k) {
            for (int l = 0; l < -28927295 * worldMapScaleHandler.pixelsPerTile; ++l) {
                if (l >= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[2][1] = array2;
        final byte[] array3 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n3 = 0;
        for (int n4 = 0; n4 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n4) {
            for (int n5 = 0; n5 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n5) {
                if (n5 <= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[2][2] = array3;
        final byte[] array4 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n7) {
            for (int n8 = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[2][3] = array4;
    }
    
    public static void jn(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n = 0;
        for (int i = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; i >= 0; --i) {
            for (int j = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; j >= 0; --j) {
                if (j >= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[4][0] = array;
        final byte[] array2 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n2 = 0;
        for (int k = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; k >= 0; --k) {
            for (int l = 0; l < worldMapScaleHandler.pixelsPerTile * -28927295; ++l) {
                if (l <= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[4][1] = array2;
        final byte[] array3 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n3 = 0;
        for (int n4 = 0; n4 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n4) {
            for (int n5 = 0; n5 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n5) {
                if (n5 >= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[4][2] = array3;
        final byte[] array4 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n7) {
            for (int n8 = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; n8 >= 0; --n8) {
                if (n8 <= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[4][3] = array4;
    }
    
    public static void gs(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * 570556163)];
        final byte[] array2 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (574312221 * worldMapScaleHandler.pixelsPerTile)];
        int n = 0;
        for (int i = 0; i < 1805123309 * worldMapScaleHandler.pixelsPerTile; ++i) {
            for (int j = 0; j < -719236457 * worldMapScaleHandler.pixelsPerTile; ++j) {
                if (j >= i - -28927295 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[7][0] = array2;
        final byte[] array3 = new byte[worldMapScaleHandler.pixelsPerTile * 1398223042 * (1102581542 * worldMapScaleHandler.pixelsPerTile)];
        int n2 = 0;
        for (int k = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; k >= 0; --k) {
            for (int l = 0; l < worldMapScaleHandler.pixelsPerTile * -1628310883; ++l) {
                if (l >= k - worldMapScaleHandler.pixelsPerTile * -149747775 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[7][1] = array3;
        final byte[] array4 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (worldMapScaleHandler.pixelsPerTile * -28927295)];
        int n3 = 0;
        for (int n4 = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; n4 >= 0; --n4) {
            for (int n5 = worldMapScaleHandler.pixelsPerTile * 1711887928 - 1; n5 >= 0; --n5) {
                if (n5 >= n4 - -709521142 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[7][2] = array4;
        final byte[] array5 = new byte[worldMapScaleHandler.pixelsPerTile * -522795300 * (worldMapScaleHandler.pixelsPerTile * 2101885139)];
        int n6 = 0;
        for (int n7 = 0; n7 < -315685435 * worldMapScaleHandler.pixelsPerTile; ++n7) {
            for (int n8 = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 - -28927295 * worldMapScaleHandler.pixelsPerTile / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[7][3] = array5;
    }
    
    int ah(int n, final int n2) {
        if (9 == n2) {
            n = (1 + n & 0x3);
        }
        if (10 == n2) {
            n = (n + 3 & 0x3);
        }
        if (11 == n2) {
            n = (n + 3 & 0x3);
        }
        return n;
    }
    
    public static void qh(final WorldMapScaleHandler worldMapScaleHandler) {
        final byte[] array = new byte[2094099853 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * 1436432211)];
        int n = 0;
        for (int i = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; i >= 0; --i) {
            for (int j = -28927295 * worldMapScaleHandler.pixelsPerTile - 1; j >= 0; --j) {
                if (j >= i >> 1) {
                    array[n] = -1;
                }
                ++n;
            }
        }
        worldMapScaleHandler.tileTemplates[4][0] = array;
        final byte[] array2 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-41266108 * worldMapScaleHandler.pixelsPerTile)];
        int n2 = 0;
        for (int k = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; k >= 0; --k) {
            for (int l = 0; l < worldMapScaleHandler.pixelsPerTile * 920112833; ++l) {
                if (l <= k << 1) {
                    array2[n2] = -1;
                }
                ++n2;
            }
        }
        worldMapScaleHandler.tileTemplates[4][1] = array2;
        final byte[] array3 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
        int n3 = 0;
        for (int n4 = 0; n4 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n4) {
            for (int n5 = 0; n5 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n5) {
                if (n5 >= n4 >> 1) {
                    array3[n3] = -1;
                }
                ++n3;
            }
        }
        worldMapScaleHandler.tileTemplates[4][2] = array3;
        final byte[] array4 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (1388775201 * worldMapScaleHandler.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < worldMapScaleHandler.pixelsPerTile * -1040744321; ++n7) {
            for (int n8 = worldMapScaleHandler.pixelsPerTile * -28927295 - 1; n8 >= 0; --n8) {
                if (n8 <= n7 << 1) {
                    array4[n6] = -1;
                }
                ++n6;
            }
        }
        worldMapScaleHandler.tileTemplates[4][3] = array4;
    }
    
    public static void uh(final WorldMapScaleHandler worldMapScaleHandler, final int n) {
        if (worldMapScaleHandler == null) {
            worldMapScaleHandler.init5(n);
        }
        try {
            final byte[] array = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
            final byte[] array2 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (worldMapScaleHandler.pixelsPerTile * -28927295)];
            int n2 = 0;
            for (int i = 0; i < worldMapScaleHandler.pixelsPerTile * -28927295; ++i) {
                if (n != -392774296) {
                    return;
                }
                for (int j = 0; j < -28927295 * worldMapScaleHandler.pixelsPerTile; ++j) {
                    if (n != -392774296) {
                        return;
                    }
                    if (j <= -28927295 * worldMapScaleHandler.pixelsPerTile / 2) {
                        array2[n2] = -1;
                    }
                    ++n2;
                }
            }
            worldMapScaleHandler.tileTemplates[5][0] = array2;
            final byte[] array3 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
            int n3 = 0;
            for (int k = 0; k < worldMapScaleHandler.pixelsPerTile * -28927295; ++k) {
                if (n != -392774296) {
                    throw new IllegalStateException();
                }
                for (int l = 0; l < worldMapScaleHandler.pixelsPerTile * -28927295; ++l) {
                    if (n != -392774296) {
                        throw new IllegalStateException();
                    }
                    if (k <= worldMapScaleHandler.pixelsPerTile * -28927295 / 2) {
                        if (n != -392774296) {
                            throw new IllegalStateException();
                        }
                        array3[n3] = -1;
                    }
                    ++n3;
                }
            }
            worldMapScaleHandler.tileTemplates[5][1] = array3;
            final byte[] array4 = new byte[-28927295 * worldMapScaleHandler.pixelsPerTile * (worldMapScaleHandler.pixelsPerTile * -28927295)];
            int n4 = 0;
            for (int n5 = 0; n5 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n5) {
                for (int n6 = 0; n6 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n6) {
                    if (n != -392774296) {
                        throw new IllegalStateException();
                    }
                    if (n6 >= -28927295 * worldMapScaleHandler.pixelsPerTile / 2) {
                        if (n != -392774296) {
                            return;
                        }
                        array4[n4] = -1;
                    }
                    ++n4;
                }
            }
            worldMapScaleHandler.tileTemplates[5][2] = array4;
            final byte[] array5 = new byte[worldMapScaleHandler.pixelsPerTile * -28927295 * (-28927295 * worldMapScaleHandler.pixelsPerTile)];
            int n7 = 0;
            for (int n8 = 0; n8 < -28927295 * worldMapScaleHandler.pixelsPerTile; ++n8) {
                if (n != -392774296) {
                    throw new IllegalStateException();
                }
                for (int n9 = 0; n9 < worldMapScaleHandler.pixelsPerTile * -28927295; ++n9) {
                    if (n != -392774296) {
                        throw new IllegalStateException();
                    }
                    if (n8 >= -28927295 * worldMapScaleHandler.pixelsPerTile / 2) {
                        array5[n7] = -1;
                    }
                    ++n7;
                }
            }
            worldMapScaleHandler.tileTemplates[5][3] = array5;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.aa(" + ')');
        }
    }
    
    static final void method1567(final int n, final int n2, final byte b) {
        try {
            if (Client.currentClanChannels[n] != null) {
                if (n2 >= 0) {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    if (n2 >= Client.currentClanChannels[n].method898(-520460385)) {
                        if (b <= -1) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final ClanChannelMember clanChannelMember = Client.currentClanChannels[n].members.get(n2);
                        if (-1 == clanChannelMember.rank) {
                            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2514, Client.packetWriter.isaacCipher, (short)(-14741));
                            packetBufferNode.packetBuffer.bf(3 + DynamicObject.stringCp1252NullTerminatedByteSize(clanChannelMember.username.getName(-710264960), (byte)(-16)), (byte)86);
                            packetBufferNode.packetBuffer.bf(n, (byte)97);
                            packetBufferNode.packetBuffer.cq(n2, (byte)59);
                            packetBufferNode.packetBuffer.ce(clanChannelMember.username.getName(-710264960), -2135060945);
                            Client.packetWriter.addNode(packetBufferNode, 414135591);
                            return;
                        }
                        if (b <= -1) {
                            throw new IllegalStateException();
                        }
                    }
                }
                return;
            }
            if (b <= -1) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kj.na(" + ')');
        }
    }
    
    void bf() {
        final byte[] array = new byte[-1425440541 * this.pixelsPerTile * (this.pixelsPerTile * -880702887)];
        final byte[] array2 = new byte[this.pixelsPerTile * -28927295 * (675453299 * this.pixelsPerTile)];
        int n = 0;
        for (int i = 0; i < -28927295 * this.pixelsPerTile; ++i) {
            for (int j = 0; j < -2048452434 * this.pixelsPerTile; ++j) {
                if (j >= i - -28927295 * this.pixelsPerTile / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[7][0] = array2;
        final byte[] array3 = new byte[this.pixelsPerTile * -129265812 * (-1405212666 * this.pixelsPerTile)];
        int n2 = 0;
        for (int k = -28927295 * this.pixelsPerTile - 1; k >= 0; --k) {
            for (int l = 0; l < this.pixelsPerTile * 854835393; ++l) {
                if (l >= k - this.pixelsPerTile * 1108163417 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[7][1] = array3;
        final byte[] array4 = new byte[this.pixelsPerTile * -383771919 * (this.pixelsPerTile * -273675546)];
        int n3 = 0;
        for (int n4 = -28927295 * this.pixelsPerTile - 1; n4 >= 0; --n4) {
            for (int n5 = this.pixelsPerTile * 1246003820 - 1; n5 >= 0; --n5) {
                if (n5 >= n4 - -28927295 * this.pixelsPerTile / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[7][2] = array4;
        final byte[] array5 = new byte[this.pixelsPerTile * 740334359 * (this.pixelsPerTile * -1425645968)];
        int n6 = 0;
        for (int n7 = 0; n7 < 722086970 * this.pixelsPerTile; ++n7) {
            for (int n8 = -950006975 * this.pixelsPerTile - 1; n8 >= 0; --n8) {
                if (n8 >= n7 - 237556995 * this.pixelsPerTile / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[7][3] = array5;
    }
    
    void bu() {
        final byte[] array = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
        final byte[] array2 = new byte[-28927295 * this.pixelsPerTile * (-28927295 * this.pixelsPerTile)];
        int n = 0;
        for (int i = 0; i < this.pixelsPerTile * -28927295; ++i) {
            for (int j = 0; j < this.pixelsPerTile * -28927295; ++j) {
                if (j <= i - -28927295 * this.pixelsPerTile / 2) {
                    array2[n] = -1;
                }
                ++n;
            }
        }
        this.tileTemplates[6][0] = array2;
        final byte[] array3 = new byte[-28927295 * this.pixelsPerTile * (this.pixelsPerTile * -28927295)];
        int n2 = 0;
        for (int k = -28927295 * this.pixelsPerTile - 1; k >= 0; --k) {
            for (int l = 0; l < this.pixelsPerTile * -28927295; ++l) {
                if (l <= k - this.pixelsPerTile * -28927295 / 2) {
                    array3[n2] = -1;
                }
                ++n2;
            }
        }
        this.tileTemplates[6][1] = array3;
        final byte[] array4 = new byte[this.pixelsPerTile * -28927295 * (this.pixelsPerTile * -28927295)];
        int n3 = 0;
        for (int n4 = this.pixelsPerTile * -28927295 - 1; n4 >= 0; --n4) {
            for (int n5 = -28927295 * this.pixelsPerTile - 1; n5 >= 0; --n5) {
                if (n5 <= n4 - this.pixelsPerTile * -28927295 / 2) {
                    array4[n3] = -1;
                }
                ++n3;
            }
        }
        this.tileTemplates[6][2] = array4;
        final byte[] array5 = new byte[this.pixelsPerTile * -28927295 * (-28927295 * this.pixelsPerTile)];
        int n6 = 0;
        for (int n7 = 0; n7 < this.pixelsPerTile * -28927295; ++n7) {
            for (int n8 = this.pixelsPerTile * -28927295 - 1; n8 >= 0; --n8) {
                if (n8 <= n7 - -28927295 * this.pixelsPerTile / 2) {
                    array5[n6] = -1;
                }
                ++n6;
            }
        }
        this.tileTemplates[6][3] = array5;
    }
}
