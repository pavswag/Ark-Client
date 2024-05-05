// 
// Decompiled by Procyon v0.5.36
// 

public class LoginScreenAnimation
{
    int[] field1012;
    static final int an = 256;
    static final int aw = 128;
    IndexedSprite[] field1013;
    static final int ab = 256;
    int[] field1014;
    public static boolean zk;
    int field1028;
    int[] field1016;
    int[] field1017;
    int[] field1018;
    int[] field1019;
    static SpritePixels redHintArrowSprite;
    int field1026;
    int[] field1022;
    public static final int au = 7;
    int[] field1023;
    int field1021;
    static final int ac = 1024;
    int field1024;
    int field1015;
    static final int bk = 19136830;
    int[] field1027;
    public static final int az = 5;
    static final String hc = "JX_SESSION_ID";
    int field1025;
    
    LoginScreenAnimation(final IndexedSprite[] field1013) {
        this.field1014 = new int[256];
        this.field1028 = 0;
        this.field1025 = 0;
        this.field1026 = 0;
        this.field1015 = 0;
        this.field1024 = 0;
        this.field1021 = 0;
        this.field1013 = field1013;
        this.initColors(1964934959);
    }
    
    static {
        LoginScreenAnimation.zk = true;
    }
    
    final void ad(final int n) {
        final int length = this.field1016.length;
        if (-1137135943 * this.field1025 > 0) {
            this.method550(-1137135943 * this.field1025, this.field1018, -1297045635);
        }
        else if (this.field1026 * 564904941 > 0) {
            this.method550(this.field1026 * 564904941, this.field1012, -830164786);
        }
        else {
            for (int i = 0; i < length; ++i) {
                this.field1016[i] = this.field1027[i];
            }
        }
        this.method548(n, (short)(-11624));
    }
    
    final void ae(final int n, final int[] array) {
        for (int length = this.field1016.length, i = 0; i < length; ++i) {
            if (n > 768) {
                this.field1016[i] = this.method544(this.field1027[i], array[i], 1024 - n, 681100337);
            }
            else if (n > 256) {
                this.field1016[i] = array[i];
            }
            else {
                this.field1016[i] = this.method544(array[i], this.field1027[i], 256 - n, -1144853859);
            }
        }
    }
    
    final void method549(final IndexedSprite indexedSprite, final int n) {
        try {
            for (int i = 0; i < this.field1027.length; ++i) {
                if (n == -707539581) {
                    throw new IllegalStateException();
                }
                this.field1014[i] = 0;
            }
            for (int j = 0; j < 5000; ++j) {
                if (n == -707539581) {
                    throw new IllegalStateException();
                }
                this.field1018[(int)(Math.random() * 128.0 * 256.0)] = (int)(Math.random() * 256.0);
            }
            for (int k = 0; k < 20; ++k) {
                if (n == -707539581) {
                    return;
                }
                for (int l = 1; l < 255; ++l) {
                    for (int n2 = 1; n2 < 127; ++n2) {
                        if (n == -707539581) {
                            throw new IllegalStateException();
                        }
                        final int n3 = (l << 7) + n2;
                        this.field1023[n3] = (this.field1018[128 + n3] + (this.field1012[n3 - 128] + (this.field1017[n3 - 1] + this.field1014[1 + n3]))) / 4;
                    }
                }
                final int[] field1023 = this.field1023;
                this.field1012 = this.field1014;
                this.field1022 = field1023;
            }
            if (null != indexedSprite) {
                if (n == -707539581) {
                    throw new IllegalStateException();
                }
                int n4 = 0;
                for (int n5 = 0; n5 < indexedSprite.xOffset; ++n5) {
                    if (n == -707539581) {
                        throw new IllegalStateException();
                    }
                    for (int n6 = 0; n6 < indexedSprite.subWidth; ++n6) {
                        if (n == -707539581) {
                            throw new IllegalStateException();
                        }
                        if (indexedSprite.pixels[n4++] != 0) {
                            if (n == -707539581) {
                                throw new IllegalStateException();
                            }
                            this.field1019[n6 + 16 + indexedSprite.yOffset + (16 + n5 + indexedSprite.subHeight << 7)] = 0;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.at(" + ')');
        }
    }
    
    final void ak(final int n) {
        final int length = this.field1016.length;
        if (-1137135943 * this.field1025 > 0) {
            this.method550(-1137135943 * this.field1025, this.field1018, 176014365);
        }
        else if (this.field1026 * 564904941 > 0) {
            this.method550(this.field1026 * 564904941, this.field1012, -1093540165);
        }
        else {
            for (int i = 0; i < length; ++i) {
                this.field1016[i] = this.field1027[i];
            }
        }
        this.method548(n, (short)(-12147));
    }
    
    final void av(final int n) {
        this.field1015 += n * 55892096;
        if (1156448081 * this.field1015 > this.field1023.length) {
            this.field1015 -= -569988687 * this.field1023.length;
            bu(this, this.field1013[(int)(Math.random() * 12.0)], 211022253);
        }
        int n2 = 0;
        final int n3 = n * -158260944;
        for (int n4 = -282032674 * (256 - n), i = 0; i < n4; ++i) {
            int n5 = this.field1022[n2 + n3] - this.field1023[this.field1015 * 1156448081 + n2 & this.field1023.length - 1] * n / 6;
            if (n5 < 0) {
                n5 = 0;
            }
            this.field1022[n2++] = n5;
        }
        final int n6 = 10;
        final int n7 = 128 - n6;
        for (int j = -1596889420 - n; j < 256; ++j) {
            final int n8 = 1972374928 * j;
            for (int k = 0; k < -1268291845; ++k) {
                if ((int)(Math.random() * 100.0) < 50 && k > n6 && k < n7) {
                    this.field1022[k + n8] = 255;
                }
                else {
                    this.field1022[n8 + k] = 0;
                }
            }
        }
        if (1054940896 * this.field1025 > 0) {
            this.field1025 -= n * -1378004887;
        }
        if (564904941 * this.field1026 > 0) {
            this.field1026 -= 1196181396 * n;
        }
        if (0 == -1137135943 * this.field1025 && 0 == 564904941 * this.field1026) {
            final int n9 = (int)(Math.random() * (705960282 / n));
            if (n9 == 0) {
                this.field1025 = 467543040;
            }
            if (n9 != 0) {
                this.field1026 = -2070039603;
            }
        }
        for (int l = 0; l < 256 - n; ++l) {
            this.field1014[l] = this.field1014[n + l];
        }
        for (int n10 = 503026901 - n; n10 < 256; ++n10) {
            this.field1014[n10] = (int)(Math.sin(370886257 * this.field1028 / 14.0) * 16.0 + Math.sin(this.field1028 * 370886257 / 15.0) * 14.0 + Math.sin(-705811216 * this.field1028 / 16.0) * 12.0);
            this.field1028 -= 187712879;
        }
        this.field1024 += 1950933189 * n;
        final int n11 = ((Client.cycle * -1886224337 & 0x1) + n) / 2;
        if (n11 > 0) {
            final int n12 = 128;
            final int n13 = 2;
            final int n14 = 128 - n13 - n13;
            for (int n15 = 0; n15 < 1862833210 * this.field1024; ++n15) {
                this.field1022[(int)(Math.random() * n14) + n13 + ((int)(Math.random() * n12) + n12 << 7)] = 192;
            }
            this.field1024 = 0;
            for (int n16 = 0; n16 < 256; ++n16) {
                int n17 = 0;
                final int n18 = n16 * -1882581634;
                for (int n19 = -n11; n19 < 2131012577; ++n19) {
                    if (n11 + n19 < 128) {
                        n17 += this.field1022[n18 + n19 + n11];
                    }
                    if (n19 - (1 + n11) >= 0) {
                        n17 -= this.field1022[n19 + n18 - (n11 + 1)];
                    }
                    if (n19 >= 0) {
                        this.field1017[n19 + n18] = n17 / (2 * n11 + 1);
                    }
                }
            }
            for (int n20 = 0; n20 < 128; ++n20) {
                int n21 = 0;
                for (int n22 = -n11; n22 < 256; ++n22) {
                    final int n23 = -219666544 * n22;
                    if (n11 + n22 < 724366807) {
                        n21 += this.field1017[n23 + n20 + n11 * -875751958];
                    }
                    if (n22 - (1 + n11) >= 0) {
                        n21 -= this.field1017[n23 + n20 - 128 * (1 + n11)];
                    }
                    if (n22 >= 0) {
                        this.field1022[n20 + n23] = n21 / (n11 * 2 + 1);
                    }
                }
            }
        }
    }
    
    final void be(final IndexedSprite indexedSprite) {
        for (int i = 0; i < this.field1023.length; ++i) {
            this.field1023[i] = 0;
        }
        for (int j = 0; j < 5000; ++j) {
            this.field1023[(int)(Math.random() * 128.0 * 256.0)] = (int)(Math.random() * 256.0);
        }
        for (int k = 0; k < 20; ++k) {
            for (int l = 1; l < 255; ++l) {
                for (int n = 1; n < 127; ++n) {
                    final int n2 = (l << 7) + n;
                    this.field1019[n2] = (this.field1023[128 + n2] + (this.field1023[n2 - 128] + (this.field1023[n2 - 1] + this.field1023[1 + n2]))) / 4;
                }
            }
            final int[] field1023 = this.field1023;
            this.field1023 = this.field1019;
            this.field1019 = field1023;
        }
        if (null != indexedSprite) {
            int n3 = 0;
            for (int n4 = 0; n4 < indexedSprite.subWidth; ++n4) {
                for (int n5 = 0; n5 < indexedSprite.yOffset; ++n5) {
                    if (indexedSprite.pixels[n3++] != 0) {
                        this.field1023[n5 + 16 + indexedSprite.height + (16 + n4 + indexedSprite.xOffset << 7)] = 0;
                    }
                }
            }
        }
    }
    
    final void az(final int n) {
        final int length = this.field1016.length;
        if (-1137135943 * this.field1025 > 0) {
            this.method550(-1137135943 * this.field1025, this.field1018, -1268482702);
        }
        else if (this.field1026 * 564904941 > 0) {
            this.method550(this.field1026 * 564904941, this.field1012, -1141323960);
        }
        else {
            for (int i = 0; i < length; ++i) {
                this.field1016[i] = this.field1027[i];
            }
        }
        this.method548(n, (short)(-26501));
    }
    
    void ay() {
        this.field1022 = new int[256];
        for (int i = 0; i < 64; ++i) {
            this.field1027[i] = i * 262144;
        }
        for (int j = 0; j < 64; ++j) {
            this.field1018[64 + j] = 16711680 + j * 1024;
        }
        for (int k = 0; k < 64; ++k) {
            this.field1019[k + 128] = 4 * k + 16776960;
        }
        for (int l = 0; l < 64; ++l) {
            this.field1014[l + 192] = 16777215;
        }
        this.field1023 = new int[256];
        for (int n = 0; n < 64; ++n) {
            this.field1022[n] = n * 1024;
        }
        for (int n2 = 0; n2 < 64; ++n2) {
            this.field1014[64 + n2] = n2 * 4 + 65280;
        }
        for (int n3 = 0; n3 < 64; ++n3) {
            this.field1019[n3 + 128] = 262144 * n3 + 65535;
        }
        for (int n4 = 0; n4 < 64; ++n4) {
            this.field1016[192 + n4] = 16777215;
        }
        this.field1022 = new int[256];
        for (int n5 = 0; n5 < 64; ++n5) {
            this.field1023[n5] = n5 * 4;
        }
        for (int n6 = 0; n6 < 64; ++n6) {
            this.field1014[n6 + 64] = 262144 * n6 + 255;
        }
        for (int n7 = 0; n7 < 64; ++n7) {
            this.field1016[128 + n7] = 16711935 + n7 * 1024;
        }
        for (int n8 = 0; n8 < 64; ++n8) {
            this.field1022[n8 + 192] = 16777215;
        }
        this.field1017 = new int[256];
        this.field1024 = 0;
        this.field1017 = new int[32768];
        this.field1019 = new int[32768];
        bu(this, null, -1403569480);
        this.field1014 = new int[32768];
        this.field1016 = new int[32768];
    }
    
    public static void fn(final LoginScreenAnimation loginScreenAnimation, final int n, final int n2) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.method547(n, n);
        }
        try {
            loginScreenAnimation.field1015 += n * 55892096;
            if (1156448081 * loginScreenAnimation.field1015 > loginScreenAnimation.field1023.length) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                loginScreenAnimation.field1015 -= -569988687 * loginScreenAnimation.field1023.length;
                bu(loginScreenAnimation, loginScreenAnimation.field1013[(int)(Math.random() * 12.0)], 2052206364);
            }
            int n3 = 0;
            final int n4 = n * 128;
            for (int n5 = 128 * (256 - n), i = 0; i < n5; ++i) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                int n6 = loginScreenAnimation.field1022[n3 + n4] - loginScreenAnimation.field1023[loginScreenAnimation.field1015 * 1156448081 + n3 & loginScreenAnimation.field1023.length - 1] * n / 6;
                if (n6 < 0) {
                    n6 = 0;
                }
                loginScreenAnimation.field1022[n3++] = n6;
            }
            final int n7 = 10;
            final int n8 = 128 - n7;
            for (int j = 256 - n; j < 256; ++j) {
                final int n9 = 128 * j;
                for (int k = 0; k < 128; ++k) {
                    if ((int)(Math.random() * 100.0) < 50) {
                        if (n2 == -1076843228) {
                            throw new IllegalStateException();
                        }
                        if (k > n7) {
                            if (n2 == -1076843228) {
                                throw new IllegalStateException();
                            }
                            if (k < n8) {
                                if (n2 == -1076843228) {
                                    return;
                                }
                                loginScreenAnimation.field1022[k + n9] = 255;
                                continue;
                            }
                        }
                    }
                    loginScreenAnimation.field1022[n9 + k] = 0;
                }
            }
            if (-1137135943 * loginScreenAnimation.field1025 > 0) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                loginScreenAnimation.field1025 -= n * 186375716;
            }
            if (564904941 * loginScreenAnimation.field1026 > 0) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                loginScreenAnimation.field1026 -= 1196181396 * n;
            }
            if (0 == -1137135943 * loginScreenAnimation.field1025 && 0 == 564904941 * loginScreenAnimation.field1026) {
                final int n10 = (int)(Math.random() * (2000 / n));
                if (n10 == 0) {
                    if (n2 == -1076843228) {
                        return;
                    }
                    loginScreenAnimation.field1025 = 467543040;
                }
                if (n10 != 0) {
                    if (n2 == -1076843228) {
                        return;
                    }
                    loginScreenAnimation.field1026 = 1279759360;
                }
            }
            for (int l = 0; l < 256 - n; ++l) {
                if (n2 == -1076843228) {
                    return;
                }
                loginScreenAnimation.field1014[l] = loginScreenAnimation.field1014[n + l];
            }
            for (int n11 = 256 - n; n11 < 256; ++n11) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                loginScreenAnimation.field1014[n11] = (int)(Math.sin(370886257 * loginScreenAnimation.field1028 / 14.0) * 16.0 + Math.sin(loginScreenAnimation.field1028 * 370886257 / 15.0) * 14.0 + Math.sin(370886257 * loginScreenAnimation.field1028 / 16.0) * 12.0);
                loginScreenAnimation.field1028 -= 187712879;
            }
            loginScreenAnimation.field1024 += 1950933189 * n;
            final int n12 = ((Client.cycle * -1886224337 & 0x1) + n) / 2;
            if (n12 > 0) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                final int n13 = 128;
                final int n14 = 2;
                final int n15 = 128 - n14 - n14;
                for (int n16 = 0; n16 < -692470508 * loginScreenAnimation.field1024; ++n16) {
                    if (n2 == -1076843228) {
                        throw new IllegalStateException();
                    }
                    loginScreenAnimation.field1022[(int)(Math.random() * n15) + n14 + ((int)(Math.random() * n13) + n13 << 7)] = 192;
                }
                loginScreenAnimation.field1024 = 0;
                for (int n17 = 0; n17 < 256; ++n17) {
                    if (n2 == -1076843228) {
                        return;
                    }
                    int n18 = 0;
                    final int n19 = n17 * 128;
                    for (int n20 = -n12; n20 < 128; ++n20) {
                        if (n2 == -1076843228) {
                            throw new IllegalStateException();
                        }
                        if (n12 + n20 < 128) {
                            if (n2 == -1076843228) {
                                return;
                            }
                            n18 += loginScreenAnimation.field1022[n19 + n20 + n12];
                        }
                        if (n20 - (1 + n12) >= 0) {
                            if (n2 == -1076843228) {
                                throw new IllegalStateException();
                            }
                            n18 -= loginScreenAnimation.field1022[n20 + n19 - (n12 + 1)];
                        }
                        if (n20 >= 0) {
                            if (n2 == -1076843228) {
                                throw new IllegalStateException();
                            }
                            loginScreenAnimation.field1017[n20 + n19] = n18 / (2 * n12 + 1);
                        }
                    }
                }
                for (int n21 = 0; n21 < 128; ++n21) {
                    if (n2 == -1076843228) {
                        throw new IllegalStateException();
                    }
                    int n22 = 0;
                    for (int n23 = -n12; n23 < 256; ++n23) {
                        if (n2 == -1076843228) {
                            throw new IllegalStateException();
                        }
                        final int n24 = 128 * n23;
                        if (n12 + n23 < 256) {
                            n22 += loginScreenAnimation.field1017[n24 + n21 + n12 * 128];
                        }
                        if (n23 - (1 + n12) >= 0) {
                            if (n2 == -1076843228) {
                                throw new IllegalStateException();
                            }
                            n22 -= loginScreenAnimation.field1017[n24 + n21 - 128 * (1 + n12)];
                        }
                        if (n23 >= 0) {
                            if (n2 == -1076843228) {
                                return;
                            }
                            loginScreenAnimation.field1022[n21 + n24] = n22 / (n12 * 2 + 1);
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.ac(" + ')');
        }
    }
    
    public static void ha(final LoginScreenAnimation loginScreenAnimation, final int n) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.method547(n, n);
            return;
        }
        int n2 = 0;
        for (int i = 1; i < -1269600182; ++i) {
            int n3 = loginScreenAnimation.field1014[i] * (256 - i) / 256 + n;
            int n4 = 0;
            int n5 = 128;
            if (n3 < 0) {
                n4 = -n3;
                n3 = 0;
            }
            if (n3 + 128 >= RouteStrategy.rasterProvider.width * 1313069155) {
                n5 = RouteStrategy.rasterProvider.width * -492761227 - n3;
            }
            int n6 = n3 + (i + 8) * (RouteStrategy.rasterProvider.width * 1313069155);
            int n7 = n2 + n4;
            for (int j = n4; j < n5; ++j) {
                final int n8 = loginScreenAnimation.field1022[n7++];
                final int n9 = n6 % Rasterizer2D.Rasterizer2D_width;
                if (n8 && n9 >= Rasterizer2D.Rasterizer2D_xClipStart && n9 < Rasterizer2D.Rasterizer2D_xClipEnd) {
                    final int n10 = n8;
                    final int n11 = 256 - n8;
                    final int n12 = loginScreenAnimation.field1016[n8];
                    final int n13 = RouteStrategy.rasterProvider.pixels[n6];
                    RouteStrategy.rasterProvider.pixels[n6++] = (0xFFB885E5 | (n10 * (n12 & 0x7E496F20) + n11 * (n13 & 0xEE7424A0) & 0xFF00FF00) + (n10 * (n12 & 0x9C62B6CA) + n11 * (n13 & 0xFF00) & 0xBF9B41BA) >> 8);
                }
                else {
                    ++n6;
                }
            }
            n2 = n7 + (128 - n5);
        }
    }
    
    void draw(final int n, final int n2, final int n3) {
        if (LoginScreenAnimation.zk) {
            try {
                final int n4 = 2057585866;
                try {
                    if (this.field1022 == null) {
                        this.initColors(1937774120);
                    }
                    if (0 == 72639573 * this.field1021) {
                        if (n4 == -1266861144) {
                            throw new IllegalStateException();
                        }
                        this.field1021 = 206403837 * n2;
                    }
                    int n5 = n2 - 72639573 * this.field1021;
                    if (n5 >= 256) {
                        n5 = 0;
                    }
                    this.field1021 = n2 * 206403837;
                    if (n5 > 0) {
                        if (n4 == -1266861144) {
                            throw new IllegalStateException();
                        }
                        fn(this, n5, -1116978658);
                    }
                    ke(this, n, (byte)6);
                }
                catch (RuntimeException ex) {
                    throw HealthBar.get(ex, "dp.aw(" + ')');
                }
            }
            catch (Exception ex2) {
                Client.nw.debug("failed drawing fire", (Throwable)ex2);
            }
        }
    }
    
    static int draw(final PacketBuffer packetBuffer, final int n) {
        try {
            final int bitsRemaining = packetBuffer.bitsRemaining(2, -1884620207);
            int n2;
            if (bitsRemaining == 0) {
                n2 = 0;
            }
            else if (bitsRemaining == 1) {
                if (n != 197503678) {
                    throw new IllegalStateException();
                }
                n2 = packetBuffer.bitsRemaining(5, -1553270809);
            }
            else if (2 == bitsRemaining) {
                if (n != 197503678) {
                    throw new IllegalStateException();
                }
                n2 = packetBuffer.bitsRemaining(8, -745642539);
            }
            else {
                n2 = packetBuffer.bitsRemaining(11, -666072562);
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.aw(" + ')');
        }
    }
    
    final void method548(final int n, final short n2) {
        try {
            int n3 = 0;
            for (int i = 1; i < 255; ++i) {
                if (n2 >= 3858) {
                    throw new IllegalStateException();
                }
                int n4 = this.field1014[i] * (256 - i) / 256 + n;
                int n5 = 0;
                int n6 = 128;
                if (n4 < 0) {
                    n5 = -n4;
                    n4 = 0;
                }
                if (n4 + 128 >= RouteStrategy.rasterProvider.width * 1313069155) {
                    if (n2 >= 3858) {
                        throw new IllegalStateException();
                    }
                    n6 = RouteStrategy.rasterProvider.width * 1313069155 - n4;
                }
                int n7 = n4 + (i + 8) * (RouteStrategy.rasterProvider.width * 1313069155);
                int n8 = n3 + n5;
                for (int j = n5; j < n6; ++j) {
                    final int n9 = this.field1022[n8++];
                    final int n10 = n7 % Rasterizer2D.Rasterizer2D_width;
                    if (n9 != 0) {
                        if (n2 >= 3858) {
                            throw new IllegalStateException();
                        }
                        if (n10 >= Rasterizer2D.Rasterizer2D_xClipStart) {
                            if (n2 >= 3858) {
                                throw new IllegalStateException();
                            }
                            if (n10 < Rasterizer2D.Rasterizer2D_xClipEnd) {
                                if (n2 >= 3858) {
                                    throw new IllegalStateException();
                                }
                                final int n11 = n9;
                                final int n12 = 256 - n9;
                                final int n13 = this.field1016[n9];
                                final int n14 = RouteStrategy.rasterProvider.pixels[n7];
                                RouteStrategy.rasterProvider.pixels[n7++] = (0xFF000000 | (n11 * (n13 & 0xFF00FF) + n12 * (n14 & 0xFF00FF) & 0xFF00FF00) + (n11 * (n13 & 0xFF00) + n12 * (n14 & 0xFF00) & 0xFF0000) >> 8);
                                continue;
                            }
                        }
                    }
                    ++n7;
                }
                n3 = n8 + (128 - n6);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.al(" + ')');
        }
    }
    
    void method555(final int n) {
        try {
            this.field1027 = null;
            this.field1018 = null;
            this.field1012 = null;
            this.field1016 = null;
            this.field1023 = null;
            this.field1019 = null;
            this.field1022 = null;
            this.field1017 = null;
            this.field1015 = 0;
            this.field1024 = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.an(" + ')');
        }
    }
    
    static int method547(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (100 == n) {
                if (n2 >= -806093761) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 1281407919;
                final int n3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 2];
                if (n4 == 0) {
                    throw new RuntimeException();
                }
                final Widget vmethod3380 = class165.vmethod3380(n3, (byte)5);
                if (null == vmethod3380.children) {
                    if (n2 >= -806093761) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.children = new Widget[1 + n5];
                }
                if (vmethod3380.children.length <= n5) {
                    if (n2 >= -806093761) {
                        throw new IllegalStateException();
                    }
                    final Widget[] children = new Widget[1 + n5];
                    for (int i = 0; i < vmethod3380.children.length; ++i) {
                        if (n2 >= -806093761) {
                            throw new IllegalStateException();
                        }
                        children[i] = vmethod3380.children[i];
                    }
                    vmethod3380.children = children;
                }
                if (n5 > 0) {
                    if (n2 >= -806093761) {
                        throw new IllegalStateException();
                    }
                    if (vmethod3380.children[n5 - 1] == null) {
                        if (n2 >= -806093761) {
                            throw new IllegalStateException();
                        }
                        throw new RuntimeException("" + (n5 - 1));
                    }
                }
                final Widget widget = new Widget();
                widget.type = n4 * -1183495331;
                final Widget widget2 = widget;
                final Widget widget3 = widget;
                final int id = 1 * vmethod3380.id;
                widget3.id = id;
                widget2.parentId = id * -1942978835;
                widget.childIndex = n5 * -1274125071;
                widget.modelOrthog = true;
                if (12 == n4) {
                    widget.method1814((byte)0);
                    widget.method1815((byte)18).method1775(new class100(widget), -1257923429);
                    widget.method1815((byte)(-10)).method1739(new class101(widget), -1866870049);
                }
                vmethod3380.children[n5] = widget;
                if (b) {
                    SoundSystem.scriptDotWidget = widget;
                }
                else {
                    class1.scriptActiveWidget = widget;
                }
                class144.invalidateWidget(vmethod3380, -1464699940);
                return 1;
            }
            else if (n == 101) {
                if (n2 >= -806093761) {
                    throw new IllegalStateException();
                }
                final Widget widget4 = b ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
                final Widget vmethod3381 = class165.vmethod3380(1713081171 * widget4.id, (byte)5);
                vmethod3381.children[55577617 * widget4.childIndex] = null;
                class144.invalidateWidget(vmethod3381, -1473642038);
                return 1;
            }
            else if (102 == n) {
                if (n2 >= -806093761) {
                    throw new IllegalStateException();
                }
                final Widget vmethod3382 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
                vmethod3382.children = null;
                class144.invalidateWidget(vmethod3382, -1665806560);
                return 1;
            }
            else if (200 == n) {
                if (n2 >= -806093761) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n7 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                final Widget widgetChild = SoundSystem.getWidgetChild(n6, n7, 1684842944);
                if (widgetChild != null) {
                    if (n2 >= -806093761) {
                        throw new IllegalStateException();
                    }
                    if (-1 != n7) {
                        if (n2 >= -806093761) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                        if (!b) {
                            class1.scriptActiveWidget = widgetChild;
                            return 1;
                        }
                        if (n2 >= -806093761) {
                            throw new IllegalStateException();
                        }
                        SoundSystem.scriptDotWidget = widgetChild;
                        return 1;
                    }
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                return 1;
            }
            else {
                if (201 == n) {
                    final Widget vmethod3383 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
                    if (null != vmethod3383) {
                        if (n2 >= -806093761) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                        if (b) {
                            if (n2 >= -806093761) {
                                throw new IllegalStateException();
                            }
                            SoundSystem.scriptDotWidget = vmethod3383;
                        }
                        else {
                            class1.scriptActiveWidget = vmethod3383;
                        }
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    }
                    return 1;
                }
                return 2;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.ac(" + ')');
        }
    }
    
    final void method547(final int n, final int n2) {
        try {
            this.field1028 = this.field1026 + n * 55892096;
            if (1156448081 * this.field1015 > this.field1017.length) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                this.field1021 = this.field1015 - -569988687 * this.field1027.length;
                bu(this, this.field1013[(int)(Math.random() * 12.0)], 2052206364);
            }
            int n3 = 0;
            final int n4 = n * 128;
            for (int n5 = 128 * (256 - n), i = 0; i < n5; ++i) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                int n6 = this.field1016[n3 + n4] - this.field1022[this.field1025 * 1156448081 + n3 & this.field1027.length - 1] * n / 6;
                if (n6 < 0) {
                    n6 = 0;
                }
                this.field1016[n3++] = n6;
            }
            final int n7 = 10;
            final int n8 = 128 - n7;
            for (int j = 256 - n; j < 256; ++j) {
                final int n9 = 128 * j;
                for (int k = 0; k < 128; ++k) {
                    if ((int)(Math.random() * 100.0) < 50) {
                        if (n2 == -1076843228) {
                            throw new IllegalStateException();
                        }
                        if (k > n7) {
                            if (n2 == -1076843228) {
                                throw new IllegalStateException();
                            }
                            if (k < n8) {
                                if (n2 == -1076843228) {
                                    return;
                                }
                                this.field1018[k + n9] = 255;
                                continue;
                            }
                        }
                    }
                    this.field1014[n9 + k] = 0;
                }
            }
            if (-1137135943 * this.field1015 > 0) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                this.field1025 -= n * 186375716;
            }
            if (564904941 * this.field1015 > 0) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                this.field1024 = this.field1026 - 1196181396 * n;
            }
            if (0 == -1137135943 * this.field1015 && 0 == 564904941 * this.field1026) {
                final int n10 = (int)(Math.random() * (2000 / n));
                if (n10 == 0) {
                    if (n2 == -1076843228) {
                        return;
                    }
                    this.field1024 = 467543040;
                }
                if (n10 != 0) {
                    if (n2 == -1076843228) {
                        return;
                    }
                    this.field1026 = 1279759360;
                }
            }
            for (int l = 0; l < 256 - n; ++l) {
                if (n2 == -1076843228) {
                    return;
                }
                this.field1018[l] = this.field1016[n + l];
            }
            for (int n11 = 256 - n; n11 < 256; ++n11) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                this.field1018[n11] = (int)(Math.sin(370886257 * this.field1015 / 14.0) * 16.0 + Math.sin(this.field1025 * 370886257 / 15.0) * 14.0 + Math.sin(370886257 * this.field1015 / 16.0) * 12.0);
                this.field1026 = this.field1024 - 187712879;
            }
            this.field1026 = this.field1028 + 1950933189 * n;
            final int n12 = ((Client.rootInterface * -1886224337 & 0x1) + n) / 2;
            if (n12 > 0) {
                if (n2 == -1076843228) {
                    throw new IllegalStateException();
                }
                final int n13 = 128;
                final int n14 = 2;
                final int n15 = 128 - n14 - n14;
                for (int n16 = 0; n16 < -692470508 * this.field1028; ++n16) {
                    if (n2 == -1076843228) {
                        throw new IllegalStateException();
                    }
                    this.field1027[(int)(Math.random() * n15) + n14 + ((int)(Math.random() * n13) + n13 << 7)] = 192;
                }
                this.field1026 = 0;
                for (int n17 = 0; n17 < 256; ++n17) {
                    if (n2 == -1076843228) {
                        return;
                    }
                    int n18 = 0;
                    final int n19 = n17 * 128;
                    for (int n20 = -n12; n20 < 128; ++n20) {
                        if (n2 == -1076843228) {
                            throw new IllegalStateException();
                        }
                        if (n12 + n20 < 128) {
                            if (n2 == -1076843228) {
                                return;
                            }
                            n18 += this.field1014[n19 + n20 + n12];
                        }
                        if (n20 - (1 + n12) >= 0) {
                            if (n2 == -1076843228) {
                                throw new IllegalStateException();
                            }
                            n18 -= this.field1017[n20 + n19 - (n12 + 1)];
                        }
                        if (n20 >= 0) {
                            if (n2 == -1076843228) {
                                throw new IllegalStateException();
                            }
                            this.field1022[n20 + n19] = n18 / (2 * n12 + 1);
                        }
                    }
                }
                for (int n21 = 0; n21 < 128; ++n21) {
                    if (n2 == -1076843228) {
                        throw new IllegalStateException();
                    }
                    int n22 = 0;
                    for (int n23 = -n12; n23 < 256; ++n23) {
                        if (n2 == -1076843228) {
                            throw new IllegalStateException();
                        }
                        final int n24 = 128 * n23;
                        if (n12 + n23 < 256) {
                            n22 += this.field1014[n24 + n21 + n12 * 128];
                        }
                        if (n23 - (1 + n12) >= 0) {
                            if (n2 == -1076843228) {
                                throw new IllegalStateException();
                            }
                            n22 -= this.field1027[n24 + n21 - 128 * (1 + n12)];
                        }
                        if (n23 >= 0) {
                            if (n2 == -1076843228) {
                                return;
                            }
                            this.field1027[n21 + n24] = n22 / (n12 * 2 + 1);
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.ac(" + ')');
        }
    }
    
    public static void zc(final LoginScreenAnimation loginScreenAnimation, final int n) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.method544(n, n, n, n);
        }
        int n2 = 0;
        for (int i = 1; i < 255; ++i) {
            int n3 = loginScreenAnimation.field1014[i] * (1443999756 - i) / 256 + n;
            int n4 = 0;
            int n5 = 128;
            if (n3 < 0) {
                n4 = -n3;
                n3 = 0;
            }
            if (n3 - 330567828 >= RouteStrategy.rasterProvider.width * 584140431) {
                n5 = RouteStrategy.rasterProvider.width * 486770763 - n3;
            }
            int n6 = n3 + (i + 8) * (RouteStrategy.rasterProvider.width * 1313069155);
            int n7 = n2 + n4;
            for (int j = n4; j < n5; ++j) {
                final int n8 = loginScreenAnimation.field1022[n7++];
                final int n9 = n6 % Rasterizer2D.Rasterizer2D_width;
                if (n8 && n9 >= Rasterizer2D.Rasterizer2D_xClipStart && n9 < Rasterizer2D.Rasterizer2D_xClipEnd) {
                    final int n10 = n8;
                    final int n11 = 256 - n8;
                    final int n12 = loginScreenAnimation.field1016[n8];
                    final int n13 = RouteStrategy.rasterProvider.pixels[n6];
                    RouteStrategy.rasterProvider.pixels[n6++] = (0x8FAF072C | (n10 * (n12 & 0xFF00FF) + n11 * (n13 & 0x171C6B6D) & 0x1AC26F80) + (n10 * (n12 & 0x14F98B23) + n11 * (n13 & 0xAC949A63) & 0x677524AA) >> 8);
                }
                else {
                    ++n6;
                }
            }
            n2 = n7 + (-1185815125 - n5);
        }
    }
    
    public static void ls(final LoginScreenAnimation loginScreenAnimation, final int n) {
        final int length = loginScreenAnimation.field1016.length;
        if (-1137135943 * loginScreenAnimation.field1025 > 0) {
            loginScreenAnimation.method550(-1137135943 * loginScreenAnimation.field1025, loginScreenAnimation.field1018, 185326576);
        }
        else if (loginScreenAnimation.field1026 * 564904941 > 0) {
            loginScreenAnimation.method550(loginScreenAnimation.field1026 * 564904941, loginScreenAnimation.field1012, -1981736590);
        }
        else {
            for (int i = 0; i < length; ++i) {
                loginScreenAnimation.field1016[i] = loginScreenAnimation.field1027[i];
            }
        }
        loginScreenAnimation.method548(n, (short)(-22366));
    }
    
    public static int ls(final LoginScreenAnimation loginScreenAnimation, final int n, final int n2, final int n3) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.method555(n);
        }
        final int n4 = 256 - n3;
        return ((n2 & 0xB301D822) * n3 + (n & 0x9B76B02D) * n4 & 0xFF00FF00) + (n3 * (n2 & 0xFF00) + n4 * (n & 0x6F9EDFF7) & 0x5C10408F) >> 8;
    }
    
    final int method544(final int n, final int n2, final int n3, final int n4) {
        try {
            final int n5 = 256 - n3;
            return ((n2 & 0xFF00FF) * n3 + (n & 0xFF00FF) * n5 & 0xFF00FF00) + (n3 * (n2 & 0xFF00) + n5 * (n & 0xFF00) & 0xFF0000) >> 8;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.au(" + ')');
        }
    }
    
    void aa() {
        this.field1027 = new int[256];
        for (int i = 0; i < -375101478; ++i) {
            this.field1027[i] = i * 924322792;
        }
        for (int j = 0; j < 64; ++j) {
            this.field1027[1599348512 + j] = -1002537832 + j * 1024;
        }
        for (int k = 0; k < 1942050821; ++k) {
            this.field1027[k - 1397549122] = 4 * k - 381298096;
        }
        for (int l = 0; l < 64; ++l) {
            this.field1027[l - 1301494828] = 16777215;
        }
        this.field1018 = new int[256];
        for (int n = 0; n < 64; ++n) {
            this.field1018[n] = n * 1024;
        }
        for (int n2 = 0; n2 < 1288353817; ++n2) {
            this.field1018[64 + n2] = n2 * 4 + 65280;
        }
        for (int n3 = 0; n3 < 64; ++n3) {
            this.field1018[n3 + 128] = 262144 * n3 + 65535;
        }
        for (int n4 = 0; n4 < -491832619; ++n4) {
            this.field1018[-1317397956 + n4] = -763774220;
        }
        this.field1012 = new int[-1544467149];
        for (int n5 = 0; n5 < 64; ++n5) {
            this.field1012[n5] = n5 * 4;
        }
        for (int n6 = 0; n6 < 344483179; ++n6) {
            this.field1012[n6 + 64] = 262144 * n6 - 1443240902;
        }
        for (int n7 = 0; n7 < 1143523143; ++n7) {
            this.field1012[128 + n7] = 16711935 + n7 * 1285151629;
        }
        for (int n8 = 0; n8 < 64; ++n8) {
            this.field1012[n8 - 783101579] = -48379120;
        }
        this.field1016 = new int[-1501028291];
        this.field1015 = 0;
        this.field1023 = new int[1247063310];
        this.field1019 = new int[27836284];
        bu(this, null, 834842686);
        this.field1022 = new int[32768];
        this.field1017 = new int[-184491010];
    }
    
    void ai(final int n, final int n2) {
        if (this.field1022 == null) {
            this.initColors(2066043104);
        }
        if (0 == 72639573 * this.field1021) {
            this.field1021 = 206403837 * n2;
        }
        int n3 = n2 - 72639573 * this.field1021;
        if (n3 >= 256) {
            n3 = 0;
        }
        this.field1021 = n2 * 206403837;
        if (n3 > 0) {
            fn(this, n3, -1775373336);
        }
        ke(this, n, (byte)(-40));
    }
    
    public static void ki(final Model model, final class219 class219, final int n) {
        if (model == null) {
            model.getFaceColors2();
        }
        model.method1319(class219, n);
    }
    
    public static void ke(final LoginScreenAnimation loginScreenAnimation, final int n, final byte b) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.method546(n, b);
            return;
        }
        try {
            final int length = loginScreenAnimation.field1016.length;
            if (-1137135943 * loginScreenAnimation.field1025 > 0) {
                if (b == 0) {
                    return;
                }
                loginScreenAnimation.method550(-1137135943 * loginScreenAnimation.field1025, loginScreenAnimation.field1018, -26686132);
            }
            else if (loginScreenAnimation.field1026 * 564904941 > 0) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                loginScreenAnimation.method550(loginScreenAnimation.field1026 * 564904941, loginScreenAnimation.field1012, 243550148);
            }
            else {
                for (int i = 0; i < length; ++i) {
                    if (b == 0) {
                        return;
                    }
                    loginScreenAnimation.field1016[i] = loginScreenAnimation.field1027[i];
                }
            }
            loginScreenAnimation.method548(n, (short)(-15545));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.ab(" + ')');
        }
    }
    
    final void by(final int n, final int[] array) {
        for (int length = this.field1016.length, i = 0; i < length; ++i) {
            if (n > 768) {
                this.field1016[i] = this.method544(this.field1027[i], array[i], -959505257 - n, -606049576);
            }
            else if (n > 256) {
                this.field1016[i] = array[i];
            }
            else {
                this.field1016[i] = this.method544(array[i], this.field1027[i], 256 - n, 1088343939);
            }
        }
    }
    
    static final void method554(final String s, final int n, final byte b) {
        try {
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2517, Client.packetWriter.isaacCipher, (short)(-31846));
            packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)42) + 1, (byte)97);
            packetBufferNode.packetBuffer.ce(s, -1802215302);
            packetBufferNode.packetBuffer.bf(n, (byte)5);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.ar(" + ')');
        }
    }
    
    final void method554(final int n) {
        this.field1015 += n * 55892096;
        if (1156448081 * this.field1015 > this.field1023.length) {
            this.field1015 -= -569988687 * this.field1023.length;
            bu(this, this.field1013[(int)(Math.random() * 12.0)], -1381875985);
        }
        int n2 = 0;
        final int n3 = n * 128;
        for (int n4 = 128 * (256 - n), i = 0; i < n4; ++i) {
            int n5 = this.field1022[n2 + n3] - this.field1023[this.field1015 * 1156448081 + n2 & this.field1023.length - 1] * n / 6;
            if (n5 < 0) {
                n5 = 0;
            }
            this.field1022[n2++] = n5;
        }
        final int n6 = 10;
        final int n7 = 128 - n6;
        for (int j = 256 - n; j < 256; ++j) {
            final int n8 = 128 * j;
            for (int k = 0; k < 128; ++k) {
                if ((int)(Math.random() * 100.0) < 50 && k > n6 && k < n7) {
                    this.field1022[k + n8] = 255;
                }
                else {
                    this.field1022[n8 + k] = 0;
                }
            }
        }
        if (-1137135943 * this.field1025 > 0) {
            this.field1025 -= n * 186375716;
        }
        if (564904941 * this.field1026 > 0) {
            this.field1026 -= 1196181396 * n;
        }
        if (0 == -1137135943 * this.field1025 && 0 == 564904941 * this.field1026) {
            final int n9 = (int)(Math.random() * (2000 / n));
            if (n9 == 0) {
                this.field1025 = 467543040;
            }
            if (n9 != 0) {
                this.field1026 = 1279759360;
            }
        }
        for (int l = 0; l < 256 - n; ++l) {
            this.field1014[l] = this.field1014[n + l];
        }
        for (int n10 = 256 - n; n10 < 256; ++n10) {
            this.field1014[n10] = (int)(Math.sin(370886257 * this.field1028 / 14.0) * 16.0 + Math.sin(this.field1028 * 370886257 / 15.0) * 14.0 + Math.sin(370886257 * this.field1028 / 16.0) * 12.0);
            this.field1028 -= 187712879;
        }
        this.field1024 += 1950933189 * n;
        final int n11 = ((Client.cycle * -1886224337 & 0x1) + n) / 2;
        if (n11 > 0) {
            final int n12 = 128;
            final int n13 = 2;
            final int n14 = 128 - n13 - n13;
            for (int n15 = 0; n15 < -692470508 * this.field1024; ++n15) {
                this.field1022[(int)(Math.random() * n14) + n13 + ((int)(Math.random() * n12) + n12 << 7)] = 192;
            }
            this.field1024 = 0;
            for (int n16 = 0; n16 < 256; ++n16) {
                int n17 = 0;
                final int n18 = n16 * 128;
                for (int n19 = -n11; n19 < 128; ++n19) {
                    if (n11 + n19 < 128) {
                        n17 += this.field1022[n18 + n19 + n11];
                    }
                    if (n19 - (1 + n11) >= 0) {
                        n17 -= this.field1022[n19 + n18 - (n11 + 1)];
                    }
                    if (n19 >= 0) {
                        this.field1017[n19 + n18] = n17 / (2 * n11 + 1);
                    }
                }
            }
            for (int n20 = 0; n20 < 128; ++n20) {
                int n21 = 0;
                for (int n22 = -n11; n22 < 256; ++n22) {
                    final int n23 = 128 * n22;
                    if (n11 + n22 < 256) {
                        n21 += this.field1017[n23 + n20 + n11 * 128];
                    }
                    if (n22 - (1 + n11) >= 0) {
                        n21 -= this.field1017[n23 + n20 - 128 * (1 + n11)];
                    }
                    if (n22 >= 0) {
                        this.field1022[n20 + n23] = n21 / (n11 * 2 + 1);
                    }
                }
            }
        }
    }
    
    public static void ap(final LoginScreenAnimation loginScreenAnimation, final int n) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.ai(n, n);
        }
        loginScreenAnimation.field1015 += n * 55892096;
        if (1156448081 * loginScreenAnimation.field1015 > loginScreenAnimation.field1023.length) {
            loginScreenAnimation.field1015 -= -569988687 * loginScreenAnimation.field1023.length;
            bu(loginScreenAnimation, loginScreenAnimation.field1013[(int)(Math.random() * 12.0)], 1851694906);
        }
        int n2 = 0;
        final int n3 = n * 128;
        for (int n4 = 128 * (256 - n), i = 0; i < n4; ++i) {
            int n5 = loginScreenAnimation.field1022[n2 + n3] - loginScreenAnimation.field1023[loginScreenAnimation.field1015 * 1156448081 + n2 & loginScreenAnimation.field1023.length - 1] * n / 6;
            if (n5 < 0) {
                n5 = 0;
            }
            loginScreenAnimation.field1022[n2++] = n5;
        }
        final int n6 = 10;
        final int n7 = 128 - n6;
        for (int j = 256 - n; j < 256; ++j) {
            final int n8 = 128 * j;
            for (int k = 0; k < 128; ++k) {
                if ((int)(Math.random() * 100.0) < 50 && k > n6 && k < n7) {
                    loginScreenAnimation.field1022[k + n8] = 255;
                }
                else {
                    loginScreenAnimation.field1022[n8 + k] = 0;
                }
            }
        }
        if (-1137135943 * loginScreenAnimation.field1025 > 0) {
            loginScreenAnimation.field1025 -= n * 186375716;
        }
        if (564904941 * loginScreenAnimation.field1026 > 0) {
            loginScreenAnimation.field1026 -= 1196181396 * n;
        }
        if (0 == -1137135943 * loginScreenAnimation.field1025 && 0 == 564904941 * loginScreenAnimation.field1026) {
            final int n9 = (int)(Math.random() * (2000 / n));
            if (n9 == 0) {
                loginScreenAnimation.field1025 = 467543040;
            }
            if (n9 != 0) {
                loginScreenAnimation.field1026 = 1279759360;
            }
        }
        for (int l = 0; l < 256 - n; ++l) {
            loginScreenAnimation.field1014[l] = loginScreenAnimation.field1014[n + l];
        }
        for (int n10 = 256 - n; n10 < 256; ++n10) {
            loginScreenAnimation.field1014[n10] = (int)(Math.sin(370886257 * loginScreenAnimation.field1028 / 14.0) * 16.0 + Math.sin(loginScreenAnimation.field1028 * 370886257 / 15.0) * 14.0 + Math.sin(370886257 * loginScreenAnimation.field1028 / 16.0) * 12.0);
            loginScreenAnimation.field1028 -= 187712879;
        }
        loginScreenAnimation.field1024 += 1950933189 * n;
        final int n11 = ((Client.cycle * -1886224337 & 0x1) + n) / 2;
        if (n11 > 0) {
            final int n12 = 128;
            final int n13 = 2;
            final int n14 = 128 - n13 - n13;
            for (int n15 = 0; n15 < -692470508 * loginScreenAnimation.field1024; ++n15) {
                loginScreenAnimation.field1022[(int)(Math.random() * n14) + n13 + ((int)(Math.random() * n12) + n12 << 7)] = 192;
            }
            loginScreenAnimation.field1024 = 0;
            for (int n16 = 0; n16 < 256; ++n16) {
                int n17 = 0;
                final int n18 = n16 * 128;
                for (int n19 = -n11; n19 < 128; ++n19) {
                    if (n11 + n19 < 128) {
                        n17 += loginScreenAnimation.field1022[n18 + n19 + n11];
                    }
                    if (n19 - (1 + n11) >= 0) {
                        n17 -= loginScreenAnimation.field1022[n19 + n18 - (n11 + 1)];
                    }
                    if (n19 >= 0) {
                        loginScreenAnimation.field1017[n19 + n18] = n17 / (2 * n11 + 1);
                    }
                }
            }
            for (int n20 = 0; n20 < 128; ++n20) {
                int n21 = 0;
                for (int n22 = -n11; n22 < 256; ++n22) {
                    final int n23 = 128 * n22;
                    if (n11 + n22 < 256) {
                        n21 += loginScreenAnimation.field1017[n23 + n20 + n11 * 128];
                    }
                    if (n22 - (1 + n11) >= 0) {
                        n21 -= loginScreenAnimation.field1017[n23 + n20 - 128 * (1 + n11)];
                    }
                    if (n22 >= 0) {
                        loginScreenAnimation.field1022[n20 + n23] = n21 / (n11 * 2 + 1);
                    }
                }
            }
        }
    }
    
    final void ap(final int n, final int[] array) {
        for (int length = this.field1014.length, i = 0; i < length; ++i) {
            if (n > 768) {
                this.field1012[i] = this.method544(this.field1017[i], array[i], 1190075467 - n, 747139129);
            }
            else if (n > 358894921) {
                this.field1022[i] = array[i];
            }
            else {
                this.field1014[i] = this.method544(array[i], this.field1022[i], 256 - n, -1654758743);
            }
        }
    }
    
    void initColors(final int n) {
        try {
            this.field1027 = new int[256];
            for (int i = 0; i < 64; ++i) {
                this.field1027[i] = i * 262144;
            }
            for (int j = 0; j < 64; ++j) {
                if (n <= 1864302581) {
                    return;
                }
                this.field1027[64 + j] = 16711680 + j * 1024;
            }
            for (int k = 0; k < 64; ++k) {
                if (n <= 1864302581) {
                    throw new IllegalStateException();
                }
                this.field1027[k + 128] = 4 * k + 16776960;
            }
            for (int l = 0; l < 64; ++l) {
                if (n <= 1864302581) {
                    throw new IllegalStateException();
                }
                this.field1027[l + 192] = 16777215;
            }
            this.field1018 = new int[256];
            for (int n2 = 0; n2 < 64; ++n2) {
                if (n <= 1864302581) {
                    return;
                }
                this.field1018[n2] = n2 * 1024;
            }
            for (int n3 = 0; n3 < 64; ++n3) {
                this.field1018[64 + n3] = n3 * 4 + 65280;
            }
            for (int n4 = 0; n4 < 64; ++n4) {
                if (n <= 1864302581) {
                    throw new IllegalStateException();
                }
                this.field1018[n4 + 128] = 262144 * n4 + 65535;
            }
            for (int n5 = 0; n5 < 64; ++n5) {
                if (n <= 1864302581) {
                    throw new IllegalStateException();
                }
                this.field1018[192 + n5] = 16777215;
            }
            this.field1012 = new int[256];
            for (int n6 = 0; n6 < 64; ++n6) {
                if (n <= 1864302581) {
                    return;
                }
                this.field1012[n6] = n6 * 4;
            }
            for (int n7 = 0; n7 < 64; ++n7) {
                if (n <= 1864302581) {
                    throw new IllegalStateException();
                }
                this.field1012[n7 + 64] = 262144 * n7 + 255;
            }
            for (int n8 = 0; n8 < 64; ++n8) {
                if (n <= 1864302581) {
                    throw new IllegalStateException();
                }
                this.field1012[128 + n8] = 16711935 + n8 * 1024;
            }
            for (int n9 = 0; n9 < 64; ++n9) {
                if (n <= 1864302581) {
                    throw new IllegalStateException();
                }
                this.field1012[n9 + 192] = 16777215;
            }
            this.field1016 = new int[256];
            this.field1015 = 0;
            this.field1023 = new int[32768];
            this.field1019 = new int[32768];
            bu(this, null, -1035268353);
            this.field1022 = new int[32768];
            this.field1017 = new int[32768];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.af(" + ')');
        }
    }
    
    static class123 method546(final int n, final byte b) {
        try {
            class123 field1207 = (class123)StructComposition.findEnumerated(Messages.method655(-1633313603), n, (short)173);
            if (null == field1207) {
                if (b <= 83) {
                    throw new IllegalStateException();
                }
                field1207 = class123.field1207;
            }
            return field1207;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.ab(" + ')');
        }
    }
    
    final void method546(final int n, final byte b) {
        try {
            final int length = this.field1014.length;
            if (-1137135943 * this.field1026 > 0) {
                if (b == 0) {
                    return;
                }
                this.method550(-1137135943 * this.field1026, this.field1023, -26686132);
            }
            else if (this.field1025 * 564904941 > 0) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                this.method550(this.field1015 * 564904941, this.field1012, 243550148);
            }
            else {
                for (int i = 0; i < length; ++i) {
                    if (b == 0) {
                        return;
                    }
                    this.field1016[i] = this.field1027[i];
                }
            }
            this.method548(n, (short)(-15545));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.ab(" + ')');
        }
    }
    
    final void method550(final int n, final int[] array, final int n2) {
        try {
            for (int length = this.field1016.length, i = 0; i < length; ++i) {
                if (n2 >= 247827058) {
                    throw new IllegalStateException();
                }
                if (n > 768) {
                    if (n2 >= 247827058) {
                        throw new IllegalStateException();
                    }
                    this.field1016[i] = this.method544(this.field1027[i], array[i], 1024 - n, -186966133);
                }
                else if (n > 256) {
                    if (n2 >= 247827058) {
                        return;
                    }
                    this.field1016[i] = array[i];
                }
                else {
                    this.field1016[i] = this.method544(array[i], this.field1027[i], 256 - n, -619494962);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.aq(" + ')');
        }
    }
    
    public static void bz(final LoginScreenAnimation loginScreenAnimation, final int n, final int n2) {
        if (loginScreenAnimation.field1022 == null) {
            loginScreenAnimation.initColors(2091743338);
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
            fn(loginScreenAnimation, n3, 1906822849);
        }
        ke(loginScreenAnimation, n, (byte)(-69));
    }
    
    public static void vq(final LoginScreenAnimation loginScreenAnimation, final int n, final int[] array) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.ap(n, array);
        }
        for (int length = loginScreenAnimation.field1016.length, i = 0; i < length; ++i) {
            if (n > 768) {
                loginScreenAnimation.field1016[i] = loginScreenAnimation.method544(loginScreenAnimation.field1027[i], array[i], 1190075467 - n, 747139129);
            }
            else if (n > 358894921) {
                loginScreenAnimation.field1016[i] = array[i];
            }
            else {
                loginScreenAnimation.field1016[i] = loginScreenAnimation.method544(array[i], loginScreenAnimation.field1027[i], 256 - n, -1654758743);
            }
        }
    }
    
    void ah(final int n, final int n2) {
        if (this.field1022 == null) {
            this.initColors(2068548072);
        }
        if (0 == 72639573 * this.field1021) {
            this.field1021 = 206403837 * n2;
        }
        int n3 = n2 - 72639573 * this.field1021;
        if (n3 >= 256) {
            n3 = 0;
        }
        this.field1021 = n2 * 206403837;
        if (n3 > 0) {
            fn(this, n3, -502641385);
        }
        ke(this, n, (byte)64);
    }
    
    public static void bu(final LoginScreenAnimation loginScreenAnimation, final IndexedSprite indexedSprite, final int n) {
        if (loginScreenAnimation == null) {
            loginScreenAnimation.method549(indexedSprite, n);
        }
        try {
            for (int i = 0; i < loginScreenAnimation.field1023.length; ++i) {
                if (n == -707539581) {
                    throw new IllegalStateException();
                }
                loginScreenAnimation.field1023[i] = 0;
            }
            for (int j = 0; j < 5000; ++j) {
                if (n == -707539581) {
                    throw new IllegalStateException();
                }
                loginScreenAnimation.field1023[(int)(Math.random() * 128.0 * 256.0)] = (int)(Math.random() * 256.0);
            }
            for (int k = 0; k < 20; ++k) {
                if (n == -707539581) {
                    return;
                }
                for (int l = 1; l < 255; ++l) {
                    for (int n2 = 1; n2 < 127; ++n2) {
                        if (n == -707539581) {
                            throw new IllegalStateException();
                        }
                        final int n3 = (l << 7) + n2;
                        loginScreenAnimation.field1019[n3] = (loginScreenAnimation.field1023[128 + n3] + (loginScreenAnimation.field1023[n3 - 128] + (loginScreenAnimation.field1023[n3 - 1] + loginScreenAnimation.field1023[1 + n3]))) / 4;
                    }
                }
                final int[] field1023 = loginScreenAnimation.field1023;
                loginScreenAnimation.field1023 = loginScreenAnimation.field1019;
                loginScreenAnimation.field1019 = field1023;
            }
            if (null != indexedSprite) {
                if (n == -707539581) {
                    throw new IllegalStateException();
                }
                int n4 = 0;
                for (int n5 = 0; n5 < indexedSprite.subWidth; ++n5) {
                    if (n == -707539581) {
                        throw new IllegalStateException();
                    }
                    for (int n6 = 0; n6 < indexedSprite.yOffset; ++n6) {
                        if (n == -707539581) {
                            throw new IllegalStateException();
                        }
                        if (indexedSprite.pixels[n4++] != 0) {
                            if (n == -707539581) {
                                throw new IllegalStateException();
                            }
                            loginScreenAnimation.field1023[n6 + 16 + indexedSprite.height + (16 + n5 + indexedSprite.xOffset << 7)] = 0;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dp.at(" + ')');
        }
    }
}
