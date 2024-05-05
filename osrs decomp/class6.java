// 
// Decompiled by Procyon v0.5.36
// 

public class class6 implements class356
{
    final int field8;
    public static final class6 field9;
    final int field10;
    static final int ac = 4;
    static final int aq = 2;
    public static final int ao = 2048;
    static final long ax = -3932672073523589310L;
    
    class6(final int n, final int n2) {
        this.field10 = -1515921529 * n;
        this.field8 = n2 * 648396637;
    }
    
    static {
        field9 = new class6(0, 0);
    }
    
    static void drawTitle(final Font font, final Font font2, final Font font3, final int n) {
        Client.uh(font, font2, font3);
        try {
            Login.xPadding = (-1687260435 * GameEngine.canvasWidth - 765) / 2 * 983792155;
            Login.loginBoxX = 794898887 * Login.xPadding + 2036160930;
            class143.loginBoxCenter = -1036961612 + Login.loginBoxX * -949768875;
            if (!Login.worldSelectOpen) {
                class123.leftTitleSprite.ca(Login.xPadding * 578342931, 0);
                ParamComposition.rightTitleSprite.ca(Login.xPadding * 578342931 + 382, 0);
                Canvas.logoSprite.ax(Login.xPadding * 578342931 + 382 - Canvas.logoSprite.yOffset / 2, 18);
                Label_3970: {
                    if (Client.gameState * -1275976559 != 0) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        if (Client.gameState * -1275976559 != 5) {
                            break Label_3970;
                        }
                    }
                    final int n2 = 20;
                    font.aj(Strings.iv, 180 + 678588245 * Login.loginBoxX, 245 - n2, 16777215, -1);
                    final int n3 = 253 - n2;
                    Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX * 678588245 + 180 - 152, n3, 304, 34, 9179409);
                    Rasterizer2D.Rasterizer2D_drawRectangle(678588245 * Login.loginBoxX + 180 - 151, n3 + 1, 302, 32, 0);
                    Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX * 678588245 + 180 - 150, 2 + n3, -819692701 * Login.Login_loadingPercent, 30, 9179409);
                    Rasterizer2D.Rasterizer2D_fillRectangle(180 + 678588245 * Login.loginBoxX - 150 + -819692701 * Login.Login_loadingPercent, 2 + n3, 300 - Login.Login_loadingPercent * -819692701, 30, 0);
                    font.aj(Login.Login_loadingText, 180 + Login.loginBoxX * 678588245, 276 - n2, 16777215, -1);
                }
                if (Client.gameState * -1275976559 == 20) {
                    if (n == 1794239569) {
                        throw new IllegalStateException();
                    }
                    Login.titleboxSprite.ax(Login.loginBoxX * 678588245 + 180 - Login.titleboxSprite.yOffset / 2, 271 - Login.titleboxSprite.subWidth / 2);
                    int n4 = 201;
                    font.aj(Login.Login_response1, 180 + 678588245 * Login.loginBoxX, n4, 16776960, 0);
                    n4 += 15;
                    font.aj(Login.Login_response2, Login.loginBoxX * 678588245 + 180, n4, 16776960, 0);
                    n4 += 15;
                    font.aj(Login.Login_response3, Login.loginBoxX * 678588245 + 180, n4, 16776960, 0);
                    n4 += 15;
                    n4 += 7;
                    if (4 != Login.loginIndex * 1145608355 && 10 != 1145608355 * Login.loginIndex) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        class492.xb(font, Strings.jy, Login.loginBoxX * 678588245 + 180 - 110, n4, 16777215, 0);
                        int n5;
                        String s;
                        for (n5 = 200, s = class18.method63(777395555); font.bf(s) > n5; s = s.substring(0, s.length() - 1)) {
                            if (n == 1794239569) {
                                return;
                            }
                        }
                        class492.xb(font, AbstractFont.escapeBrackets(s), 180 + Login.loginBoxX * 678588245 - 70, n4, 16777215, 0);
                        n4 += 15;
                        String str;
                        for (str = WorldMapDecorationType.method1841(Login.Login_password, (byte)1); font.bf(str) > n5; str = str.substring(1)) {
                            if (n == 1794239569) {
                                return;
                            }
                        }
                        class492.xb(font, Strings.jp + str, 180 + Login.loginBoxX * 678588245 - 108, n4, 16777215, 0);
                        n4 += 15;
                    }
                }
                Label_6569: {
                    if (10 != Client.gameState * -1275976559 && Client.gameState * -1275976559 != 11) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        if (Client.gameState * -1275976559 != 50) {
                            break Label_6569;
                        }
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                    }
                    Login.titleboxSprite.ax(Login.loginBoxX * 678588245, 171);
                    if (0 == Login.loginIndex * 1145608355) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        int n6 = 251;
                        font.aj(Strings.ja, 678588245 * Login.loginBoxX + 180, n6, 16776960, 0);
                        n6 += 30;
                        final int n7 = 180 + 678588245 * Login.loginBoxX - 80;
                        final int n8 = 291;
                        class292.titlebuttonSprite.ax(n7 - 73, n8 - 20);
                        font.ak(Strings.jb, n7 - 73, n8 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                        final int n9 = 180 + 678588245 * Login.loginBoxX + 80;
                        class292.titlebuttonSprite.ax(n9 - 73, n8 - 20);
                        font.ak(Strings.jz, n9 - 73, n8 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    }
                    else if (1 == 1145608355 * Login.loginIndex) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        font.aj(Login.Login_response0, 678588245 * Login.loginBoxX + 180, 201, 16776960, 0);
                        int n10 = 236;
                        font.aj(Login.Login_response1, 678588245 * Login.loginBoxX + 180, n10, 16777215, 0);
                        n10 += 15;
                        font.aj(Login.Login_response2, Login.loginBoxX * 678588245 + 180, n10, 16777215, 0);
                        n10 += 15;
                        font.aj(Login.Login_response3, Login.loginBoxX * 678588245 + 180, n10, 16777215, 0);
                        n10 += 15;
                        final int n11 = 678588245 * Login.loginBoxX + 180 - 80;
                        final int n12 = 321;
                        class292.titlebuttonSprite.ax(n11 - 73, n12 - 20);
                        font.aj(Strings.aq, n11, n12 + 5, 16777215, 0);
                        final int n13 = Login.loginBoxX * 678588245 + 180 + 80;
                        class292.titlebuttonSprite.ax(n13 - 73, n12 - 20);
                        font.aj(Strings.jl, n13, 5 + n12, 16777215, 0);
                    }
                    else if (1145608355 * Login.loginIndex == 2) {
                        int n14 = 201;
                        font.aj(Login.Login_response1, class143.loginBoxCenter * 950254081, n14, 16776960, 0);
                        n14 += 15;
                        font.aj(Login.Login_response2, 950254081 * class143.loginBoxCenter, n14, 16776960, 0);
                        n14 += 15;
                        font.aj(Login.Login_response3, class143.loginBoxCenter * 950254081, n14, 16776960, 0);
                        n14 += 15;
                        n14 += 7;
                        class492.xb(font, Strings.jy, 950254081 * class143.loginBoxCenter - 110, n14, 16777215, 0);
                        int n15;
                        String s2;
                        for (n15 = 200, s2 = class18.method63(1543875374); font.bf(s2) > n15; s2 = s2.substring(1)) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                        }
                        final StringBuilder append = new StringBuilder().append(AbstractFont.escapeBrackets(s2));
                        boolean b;
                        if (0 == Login.currentLoginField * -1232221421) {
                            if (n == 1794239569) {
                                return;
                            }
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        boolean b2;
                        if (Client.cycle * -1886224337 % 40 < 20) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        String string;
                        if (b & b2) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            string = class383.method2081(16776960, -1607388222) + class96.aw;
                        }
                        else {
                            string = "";
                        }
                        class492.xb(font, append.append(string).toString(), 950254081 * class143.loginBoxCenter - 70, n14, 16777215, 0);
                        n14 += 15;
                        String str2;
                        for (str2 = WorldMapDecorationType.method1841(Login.Login_password, (byte)1); font.bf(str2) > n15; str2 = str2.substring(1)) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                        }
                        final StringBuilder append2 = new StringBuilder().append(Strings.jp).append(str2);
                        boolean b3;
                        if (-1232221421 * Login.currentLoginField == 1) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        String string2;
                        if (b3 & Client.cycle * -1886224337 % 40 < 20) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            string2 = class383.method2081(16776960, 1744567879) + class96.aw;
                        }
                        else {
                            string2 = "";
                        }
                        class492.xb(font, append2.append(string2).toString(), 950254081 * class143.loginBoxCenter - 108, n14, 16777215, 0);
                        n14 += 15;
                        int n16 = 277;
                        final int n17 = -117 + 950254081 * class143.loginBoxCenter;
                        final boolean login_isUsernameRemembered = Client.Login_isUsernameRemembered;
                        final boolean field730 = Login.field730;
                        IndexedSprite indexedSprite;
                        if (login_isUsernameRemembered) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            indexedSprite = (field730 ? Login.field745 : class158.options_buttons_2Sprite);
                        }
                        else if (field730) {
                            if (n == 1794239569) {
                                return;
                            }
                            indexedSprite = Login.field733;
                        }
                        else {
                            indexedSprite = Login.options_buttons_0Sprite;
                        }
                        final IndexedSprite indexedSprite2 = indexedSprite;
                        indexedSprite2.ax(n17, n16);
                        class492.xb(font2, Strings.kc, n17 + (5 + indexedSprite2.yOffset), 13 + n16, 16776960, 0);
                        final int n18 = 950254081 * class143.loginBoxCenter + 24;
                        final boolean ty = ClientPreferences.ty(class20.clientPreferences, -2131253763);
                        final boolean field731 = Login.field740;
                        IndexedSprite indexedSprite3;
                        if (ty) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            if (field731) {
                                if (n == 1794239569) {
                                    return;
                                }
                                indexedSprite3 = Login.field745;
                            }
                            else {
                                indexedSprite3 = class158.options_buttons_2Sprite;
                            }
                        }
                        else if (field731) {
                            if (n == 1794239569) {
                                return;
                            }
                            indexedSprite3 = Login.field733;
                        }
                        else {
                            indexedSprite3 = Login.options_buttons_0Sprite;
                        }
                        final IndexedSprite indexedSprite4 = indexedSprite3;
                        indexedSprite4.ax(n18, n16);
                        class492.xb(font2, Strings.ku, n18 + (5 + indexedSprite4.yOffset), n16 + 13, 16776960, 0);
                        n16 += 15;
                        final int n19 = class143.loginBoxCenter * 950254081 - 80;
                        final int n20 = 321;
                        class292.titlebuttonSprite.ax(n19 - 73, n20 - 20);
                        font.aj(Strings.ju, n19, n20 + 5, 16777215, 0);
                        final int n21 = 80 + class143.loginBoxCenter * 950254081;
                        class292.titlebuttonSprite.ax(n21 - 73, n20 - 20);
                        font.aj(Strings.jl, n21, 5 + n20, 16777215, 0);
                        final int n22 = 357;
                        switch (Login.field752 * -1733444455) {
                            default: {
                                class18.field58 = Strings.lv;
                                break;
                            }
                            case 2: {
                                class18.field58 = Strings.lg;
                                break;
                            }
                        }
                        class96.field1063 = new Bounds(class143.loginBoxCenter * 950254081, n22, font2.bf(class18.field58), 11);
                        class19.field60 = new Bounds(950254081 * class143.loginBoxCenter, n22, font2.bf(Strings.lm), 11);
                        font2.aj(class18.field58, 950254081 * class143.loginBoxCenter, n22, 16777215, 0);
                    }
                    else if (3 == Login.loginIndex * 1145608355) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        int n23 = 201;
                        font.aj(Strings.ke, 678588245 * Login.loginBoxX + 180, n23, 16776960, 0);
                        n23 += 20;
                        font2.aj(Strings.ky, Login.loginBoxX * 678588245 + 180, n23, 16776960, 0);
                        n23 += 20;
                        font2.aj(Strings.kh, 678588245 * Login.loginBoxX + 180, n23, 16776960, 0);
                        n23 += 15;
                        final int n24 = 678588245 * Login.loginBoxX + 180;
                        final int n25 = 276;
                        class292.titlebuttonSprite.ax(n24 - 73, n25 - 20);
                        font3.aj(Strings.kp, n24, n25 + 5, 16777215, 0);
                        final int n26 = 180 + Login.loginBoxX * 678588245;
                        final int n27 = 326;
                        class292.titlebuttonSprite.ax(n26 - 73, n27 - 20);
                        font3.aj(Strings.kf, n26, 5 + n27, 16777215, 0);
                    }
                    else if (Login.loginIndex * 1145608355 == 4) {
                        if (n == 1794239569) {
                            return;
                        }
                        font.aj(Strings.je, 180 + 678588245 * Login.loginBoxX, 201, 16776960, 0);
                        int n28 = 236;
                        font.aj(Login.Login_response1, 678588245 * Login.loginBoxX + 180, n28, 16777215, 0);
                        n28 += 15;
                        font.aj(Login.Login_response2, 180 + Login.loginBoxX * 678588245, n28, 16777215, 0);
                        n28 += 15;
                        font.aj(Login.Login_response3, 678588245 * Login.loginBoxX + 180, n28, 16777215, 0);
                        n28 += 15;
                        final StringBuilder append3 = new StringBuilder().append(Strings.jt).append(WorldMapDecorationType.method1841(Messages.otp, (byte)1));
                        String string3;
                        if (-1886224337 * Client.cycle % 40 < 20) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            string3 = class383.method2081(16776960, 352033157) + class96.aw;
                        }
                        else {
                            string3 = "";
                        }
                        class492.xb(font, append3.append(string3).toString(), Login.loginBoxX * 678588245 + 180 - 108, n28, 16777215, 0);
                        n28 -= 8;
                        class492.xb(font, Strings.aa, 678588245 * Login.loginBoxX + 180 - 9, n28, 16776960, 0);
                        n28 += 15;
                        class492.xb(font, Strings.ay, 180 + Login.loginBoxX * 678588245 - 9, n28, 16776960, 0);
                        final int n29 = Login.loginBoxX * 678588245 + 180 - 9 + font.bf(Strings.ay) + 15;
                        final int n30 = n28 - font.al;
                        IndexedSprite indexedSprite5;
                        if (Login.field751) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            indexedSprite5 = class158.options_buttons_2Sprite;
                        }
                        else {
                            indexedSprite5 = Login.options_buttons_0Sprite;
                        }
                        indexedSprite5.ax(n29, n30);
                        n28 += 15;
                        final int n31 = 180 + 678588245 * Login.loginBoxX - 80;
                        final int n32 = 321;
                        class292.titlebuttonSprite.ax(n31 - 73, n32 - 20);
                        font.aj(Strings.aq, n31, n32 + 5, 16777215, 0);
                        final int n33 = 80 + (Login.loginBoxX * 678588245 + 180);
                        class292.titlebuttonSprite.ax(n33 - 73, n32 - 20);
                        font.aj(Strings.jl, n33, 5 + n32, 16777215, 0);
                        font2.aj(Strings.jj, 180 + Login.loginBoxX * 678588245, n32 + 36, 255, 0);
                    }
                    else if (Login.loginIndex * 1145608355 == 5) {
                        if (n == 1794239569) {
                            return;
                        }
                        font.aj(Strings.ks, Login.loginBoxX * 678588245 + 180, 201, 16776960, 0);
                        int n34 = 221;
                        font3.aj(Login.Login_response1, 678588245 * Login.loginBoxX + 180, n34, 16776960, 0);
                        n34 += 15;
                        font3.aj(Login.Login_response2, 180 + 678588245 * Login.loginBoxX, n34, 16776960, 0);
                        n34 += 15;
                        font3.aj(Login.Login_response3, 180 + 678588245 * Login.loginBoxX, n34, 16776960, 0);
                        n34 += 15;
                        n34 += 14;
                        class492.xb(font, Strings.kn, 180 + 678588245 * Login.loginBoxX - 145, n34, 16777215, 0);
                        int n35;
                        String s3;
                        for (n35 = 174, s3 = class18.method63(1932039953); font.bf(s3) > n35; s3 = s3.substring(1)) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                        }
                        final StringBuilder append4 = new StringBuilder().append(AbstractFont.escapeBrackets(s3));
                        String string4;
                        if (-1886224337 * Client.cycle % 40 < 20) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            string4 = class383.method2081(16776960, 556206762) + class96.aw;
                        }
                        else {
                            string4 = "";
                        }
                        class492.xb(font, append4.append(string4).toString(), Login.loginBoxX * 678588245 + 180 - 34, n34, 16777215, 0);
                        n34 += 15;
                        final int n36 = 180 + 678588245 * Login.loginBoxX - 80;
                        final int n37 = 321;
                        class292.titlebuttonSprite.ax(n36 - 73, n37 - 20);
                        font.aj(Strings.kz, n36, n37 + 5, 16777215, 0);
                        final int n38 = 80 + (180 + Login.loginBoxX * 678588245);
                        class292.titlebuttonSprite.ax(n38 - 73, n37 - 20);
                        font.aj(Strings.km, n38, n37 + 5, 16777215, 0);
                        font2.aj(Strings.lm, class143.loginBoxCenter * 950254081, 356, 268435455, 0);
                    }
                    else if (6 == Login.loginIndex * 1145608355) {
                        int n39 = 201;
                        font.aj(Login.Login_response1, 180 + Login.loginBoxX * 678588245, n39, 16776960, 0);
                        n39 += 15;
                        font.aj(Login.Login_response2, 180 + Login.loginBoxX * 678588245, n39, 16776960, 0);
                        n39 += 15;
                        font.aj(Login.Login_response3, 678588245 * Login.loginBoxX + 180, n39, 16776960, 0);
                        n39 += 15;
                        final int n40 = 180 + 678588245 * Login.loginBoxX;
                        final int n41 = 321;
                        class292.titlebuttonSprite.ax(n40 - 73, n41 - 20);
                        font.aj(Strings.km, n40, n41 + 5, 16777215, 0);
                    }
                    else if (1145608355 * Login.loginIndex == 7) {
                        if (n == 1794239569) {
                            return;
                        }
                        if (WorldMapSectionType.field2384) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            if (!Client.onMobile) {
                                if (n == 1794239569) {
                                    throw new IllegalStateException();
                                }
                                int n42 = 201;
                                font.aj(Login.Login_response1, 950254081 * class143.loginBoxCenter, n42, 16776960, 0);
                                n42 += 15;
                                font.aj(Login.Login_response2, 950254081 * class143.loginBoxCenter, n42, 16776960, 0);
                                n42 += 15;
                                font.aj(Login.Login_response3, 950254081 * class143.loginBoxCenter, n42, 16776960, 0);
                                int n43 = class143.loginBoxCenter * 950254081 - 150;
                                n42 += 10;
                                for (int i = 0; i < 8; ++i) {
                                    if (n == 1794239569) {
                                        throw new IllegalStateException();
                                    }
                                    class292.titlebuttonSprite.method2596(n43, n42, 30, 40);
                                    final boolean b4 = Login.field747 * -1262226977 == i;
                                    boolean b5;
                                    if (-1886224337 * Client.cycle % 40 < 20) {
                                        if (n == 1794239569) {
                                            throw new IllegalStateException();
                                        }
                                        b5 = true;
                                    }
                                    else {
                                        b5 = false;
                                    }
                                    final boolean b6 = b4 & b5;
                                    final StringBuilder sb = new StringBuilder();
                                    String str3;
                                    if (Login.field748[i] == null) {
                                        if (n == 1794239569) {
                                            throw new IllegalStateException();
                                        }
                                        str3 = "";
                                    }
                                    else {
                                        str3 = Login.field748[i];
                                    }
                                    final StringBuilder append5 = sb.append(str3);
                                    String string5;
                                    if (b6) {
                                        if (n == 1794239569) {
                                            throw new IllegalStateException();
                                        }
                                        string5 = class383.method2081(16776960, -878186664) + class96.aw;
                                    }
                                    else {
                                        string5 = "";
                                    }
                                    class492.xb(font, append5.append(string5).toString(), n43 + 10, 27 + n42, 16777215, 0);
                                    if (i == 0) {
                                        if (n == 1794239569) {
                                            throw new IllegalStateException();
                                        }
                                        if (3 != i) {
                                            n43 += 35;
                                            continue;
                                        }
                                        if (n == 1794239569) {
                                            return;
                                        }
                                    }
                                    n43 += 50;
                                    class492.xb(font, AbstractFont.escapeBrackets("/"), n43 - 13, 27 + n42, 16777215, 0);
                                }
                                final int n44 = class143.loginBoxCenter * 950254081 - 80;
                                final int n45 = 321;
                                class292.titlebuttonSprite.ax(n44 - 73, n45 - 20);
                                font.aj("Submit", n44, n45 + 5, 16777215, 0);
                                final int n46 = 80 + 950254081 * class143.loginBoxCenter;
                                class292.titlebuttonSprite.ax(n46 - 73, n45 - 20);
                                font.aj(Strings.jl, n46, n45 + 5, 16777215, 0);
                                break Label_6569;
                            }
                        }
                        int n47 = 216;
                        font.aj(Strings.mw, Login.loginBoxX * 678588245 + 180, n47, 16776960, 0);
                        n47 += 15;
                        font3.aj(Strings.mz, 180 + Login.loginBoxX * 678588245, n47, 16776960, 0);
                        n47 += 15;
                        font3.aj(Strings.mu, 180 + 678588245 * Login.loginBoxX, n47, 16776960, 0);
                        n47 += 15;
                        final int n48 = Login.loginBoxX * 678588245 + 180 - 80;
                        final int n49 = 321;
                        class292.titlebuttonSprite.ax(n48 - 73, n49 - 20);
                        font.aj(Strings.mq, n48, 5 + n49, 16777215, 0);
                        final int n50 = 180 + Login.loginBoxX * 678588245 + 80;
                        class292.titlebuttonSprite.ax(n50 - 73, n49 - 20);
                        font.aj(Strings.km, n50, n49 + 5, 16777215, 0);
                    }
                    else if (8 == 1145608355 * Login.loginIndex) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        int n51 = 216;
                        font.aj(Strings.fb, Login.loginBoxX * 678588245 + 180, n51, 16776960, 0);
                        n51 += 15;
                        font3.aj(Strings.fn, 180 + 678588245 * Login.loginBoxX, n51, 16776960, 0);
                        n51 += 15;
                        font3.aj(Strings.fz, 678588245 * Login.loginBoxX + 180, n51, 16776960, 0);
                        n51 += 15;
                        final int n52 = 678588245 * Login.loginBoxX + 180 - 80;
                        final int n53 = 321;
                        class292.titlebuttonSprite.ax(n52 - 73, n53 - 20);
                        font.aj(Strings.fa, n52, 5 + n53, 16777215, 0);
                        final int n54 = 80 + (Login.loginBoxX * 678588245 + 180);
                        class292.titlebuttonSprite.ax(n54 - 73, n53 - 20);
                        font.aj(Strings.km, n54, n53 + 5, 16777215, 0);
                    }
                    else if (9 == Login.loginIndex * 1145608355) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        int n55 = 221;
                        font.aj(Login.Login_response1, 180 + 678588245 * Login.loginBoxX, n55, 16776960, 0);
                        n55 += 25;
                        font.aj(Login.Login_response2, 678588245 * Login.loginBoxX + 180, n55, 16776960, 0);
                        n55 += 25;
                        font.aj(Login.Login_response3, 180 + Login.loginBoxX * 678588245, n55, 16776960, 0);
                        final int n56 = 180 + Login.loginBoxX * 678588245;
                        final int n57 = 311;
                        class292.titlebuttonSprite.ax(n56 - 73, n57 - 20);
                        font.aj(Strings.kp, n56, n57 + 5, 16777215, 0);
                    }
                    else if (10 == 1145608355 * Login.loginIndex) {
                        final int n58 = 678588245 * Login.loginBoxX + 180;
                        int n59 = 209;
                        font.aj(Strings.ja, 180 + 678588245 * Login.loginBoxX, n59, 16776960, 0);
                        n59 += 20;
                        class439.field3828.ax(n58 - 109, n59);
                        if (Login.field749.isEmpty()) {
                            class376.field3605.ax(n58 - 48, 18 + n59);
                        }
                        else {
                            class376.field3605.ax(n58 - 48, 5 + n59);
                            font.aj(Login.field749, n58, 68 + n59 - 15, 16776960, 0);
                        }
                    }
                    else if (12 == 1145608355 * Login.loginIndex) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        final int n60 = class143.loginBoxCenter * 950254081;
                        int n61 = 216;
                        font3.aj(Strings.mx, n60, n61, 16777215, 0);
                        n61 += 17;
                        font3.aj(Strings.ma, n60, n61, 16777215, 0);
                        n61 += 17;
                        font3.aj(Strings.mp, n60, n61, 16777215, 0);
                        n61 += 17;
                        font3.aj(Strings.mj, n60, n61, 16777215, 0);
                        final int n62 = 950254081 * class143.loginBoxCenter - 80;
                        final int n63 = 311;
                        class292.titlebuttonSprite.ax(n62 - 73, n63 - 20);
                        font.aj(Strings.mh, n62, n63 + 5, 16777215, 0);
                        final int n64 = 80 + class143.loginBoxCenter * 950254081;
                        class292.titlebuttonSprite.ax(n64 - 73, n63 - 20);
                        font.aj(Strings.mg, n64, n63 + 5, 16777215, 0);
                    }
                    else if (13 == Login.loginIndex * 1145608355) {
                        int n65 = 231;
                        font3.aj(Strings.ms, 678588245 * Login.loginBoxX + 180, n65, 16777215, 0);
                        n65 += 20;
                        font3.aj(Strings.mc, 678588245 * Login.loginBoxX + 180, n65, 16777215, 0);
                        final int n66 = 678588245 * Login.loginBoxX + 180;
                        final int n67 = 311;
                        class292.titlebuttonSprite.ax(n66 - 73, n67 - 20);
                        font.aj(Strings.km, n66, n67 + 5, 16777215, 0);
                    }
                    else if (1145608355 * Login.loginIndex == 14) {
                        if (n == 1794239569) {
                            return;
                        }
                        int n68 = 201;
                        String s4 = "";
                        String s5 = "";
                        String s6 = "";
                        switch (Login.field738 * -1478945003) {
                            default: {
                                method20(false, 1620071571);
                                break;
                            }
                            case 2: {
                                s4 = Strings.fe;
                                s5 = Strings.fs;
                                s6 = Strings.field3226;
                                break;
                            }
                            case 1: {
                                s4 = Strings.db;
                                s5 = Strings.df;
                                s6 = Strings.dq;
                                break;
                            }
                            case 0: {
                                s4 = Strings.cc;
                                s5 = Strings.cn;
                                s6 = Strings.ca;
                                break;
                            }
                        }
                        font.aj(s4, Login.loginBoxX * 678588245 + 180, n68, 16776960, 0);
                        n68 += 20;
                        font.aj(s5, 180 + 678588245 * Login.loginBoxX, n68, 16776960, 0);
                        n68 += 20;
                        font.aj(s6, 678588245 * Login.loginBoxX + 180, n68, 16776960, 0);
                        final int n69 = 678588245 * Login.loginBoxX + 180;
                        final int n70 = 276;
                        class292.titlebuttonSprite.ax(n69 - 73, n70 - 20);
                        if (1 == Login.field738 * -1478945003) {
                            font.aj(Strings.bs, n69, 5 + n70, 16777215, 0);
                        }
                        else {
                            font.aj(Strings.bn, n69, n70 + 5, 16777215, 0);
                        }
                        final int n71 = 180 + 678588245 * Login.loginBoxX;
                        final int n72 = 326;
                        class292.titlebuttonSprite.ax(n71 - 73, n72 - 20);
                        font.aj(Strings.km, n71, n72 + 5, 16777215, 0);
                    }
                    else if (24 == Login.loginIndex * 1145608355) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        int n73 = 221;
                        font.aj(Login.Login_response1, 678588245 * Login.loginBoxX + 180, n73, 16777215, 0);
                        n73 += 15;
                        font.aj(Login.Login_response2, 678588245 * Login.loginBoxX + 180, n73, 16777215, 0);
                        n73 += 15;
                        font.aj(Login.Login_response3, 678588245 * Login.loginBoxX + 180, n73, 16777215, 0);
                        n73 += 15;
                        final int n74 = Login.loginBoxX * 678588245 + 180;
                        final int n75 = 301;
                        class292.titlebuttonSprite.ax(n74 - 73, n75 - 20);
                        font.aj(Strings.au, n74, n75 + 5, 16777215, 0);
                    }
                    else if (32 == Login.loginIndex * 1145608355) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        int n76 = 216;
                        font.aj(Strings.mw, Login.loginBoxX * 678588245 + 180, n76, 16776960, 0);
                        n76 += 15;
                        font3.aj(Strings.mz, Login.loginBoxX * 678588245 + 180, n76, 16776960, 0);
                        n76 += 15;
                        font3.aj(Strings.mu, 678588245 * Login.loginBoxX + 180, n76, 16776960, 0);
                        n76 += 15;
                        final int n77 = 180 + Login.loginBoxX * 678588245 - 80;
                        final int n78 = 321;
                        class292.titlebuttonSprite.ax(n77 - 73, n78 - 20);
                        font.aj(Strings.mq, n77, n78 + 5, 16777215, 0);
                        final int n79 = 180 + Login.loginBoxX * 678588245 + 80;
                        class292.titlebuttonSprite.ax(n79 - 73, n78 - 20);
                        font.aj(Strings.km, n79, n78 + 5, 16777215, 0);
                    }
                    else if (33 == Login.loginIndex * 1145608355) {
                        if (n == 1794239569) {
                            return;
                        }
                        int n80 = 201;
                        font.aj(Login.Login_response1, 180 + Login.loginBoxX * 678588245, n80, 16776960, 0);
                        n80 += 20;
                        font2.aj(Login.Login_response2, 180 + Login.loginBoxX * 678588245, n80, 16776960, 0);
                        n80 += 20;
                        font2.aj(Login.Login_response3, 180 + Login.loginBoxX * 678588245, n80, 16776960, 0);
                        n80 += 15;
                        final int n81 = 180 + 678588245 * Login.loginBoxX;
                        final int n82 = 276;
                        class292.titlebuttonSprite.ax(n81 - 73, n82 - 20);
                        font3.aj(Strings.nw, n81, n82 + 5, 16777215, 0);
                        final int n83 = Login.loginBoxX * 678588245 + 180;
                        final int n84 = 326;
                        class292.titlebuttonSprite.ax(n83 - 73, n84 - 20);
                        font3.aj(Strings.km, n83, 5 + n84, 16777215, 0);
                    }
                }
                if (Client.gameState * -1275976559 >= 10) {
                    if (n == 1794239569) {
                        throw new IllegalStateException();
                    }
                    final int[] array = new int[4];
                    Rasterizer2D.Rasterizer2D_getClipArray(array);
                    Rasterizer2D.Rasterizer2D_setClip(Login.xPadding * 578342931, 0, 765 + 578342931 * Login.xPadding, 1658005443 * class262.canvasHeight);
                    class121.field1184.draw(578342931 * Login.xPadding - 22, -1886224337 * Client.cycle, 2057585866);
                    class121.field1184.draw(578342931 * Login.xPadding + 765 + 22 - 128, -1886224337 * Client.cycle, -2093228525);
                    Rasterizer2D.Rasterizer2D_setClipArray(array);
                }
                final IndexedSprite[] title_muteSprite = class148.title_muteSprite;
                int n85;
                if (ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
                    if (n == 1794239569) {
                        return;
                    }
                    n85 = 1;
                }
                else {
                    n85 = 0;
                }
                title_muteSprite[n85].ax(765 + Login.xPadding * 578342931 - 40, 463);
                if (-1275976559 * Client.gameState > 5) {
                    if (n == 1794239569) {
                        return;
                    }
                    if (Language.Language_EN == ClanSettings.clientLanguage) {
                        if (n == 1794239569) {
                            throw new IllegalStateException();
                        }
                        if (class319.field3030 != null) {
                            if (n == 1794239569) {
                                throw new IllegalStateException();
                            }
                            final int n86 = Login.xPadding * 578342931 + 5;
                            final int n87 = 463;
                            final int n88 = 100;
                            final int n89 = 35;
                            class319.field3030.ax(n86, n87);
                            font.aj(Strings.gx + " " + Client.worldId * -453810525, n88 / 2 + n86, n87 + n89 / 2 - 2, 16777215, 0);
                            if (class11.World_request != null) {
                                if (n == 1794239569) {
                                    throw new IllegalStateException();
                                }
                                font2.aj(Strings.mb, n88 / 2 + n86, 12 + (n89 / 2 + n87), 16777215, 0);
                            }
                            else {
                                font2.aj(Strings.nz, n86 + n88 / 2, n89 / 2 + n87 + 12, 16777215, 0);
                            }
                        }
                        else {
                            class319.field3030 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "sl_button", "", 1319736369);
                        }
                    }
                }
                return;
            }
            if (n == 1794239569) {
                throw new IllegalStateException();
            }
            Decimator.method328(font, font2, (byte)(-96));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aq.ao(" + ')');
        }
    }
    
    @Override
    public int aw() {
        return this.field8 * 2118320622;
    }
    
    @Override
    public int an() {
        return this.field8 * -754086667;
    }
    
    @Override
    public int ac() {
        return this.field8 * -1471921706;
    }
    
    static void method20(final boolean b, final int n) {
        try {
            if (!Client.ay(ScriptFrame.client, 1752781118)) {
                if (n != 1620071571) {
                    throw new IllegalStateException();
                }
                if (!ScriptFrame.client.method370((byte)(-2))) {
                    if (n != 1620071571) {
                        return;
                    }
                    if (!ScriptFrame.client.method369((byte)7)) {
                        Login.Login_response1 = Strings.ir;
                        Login.Login_response2 = Strings.io;
                        Login.Login_response3 = Strings.ip;
                        class129.method763(2, (byte)41);
                        if (b) {
                            if (n != 1620071571) {
                                throw new IllegalStateException();
                            }
                            Login.Login_password = "";
                        }
                        WallDecoration.method1385(285951283);
                        Label_0187: {
                            if (!Client.Login_isUsernameRemembered) {
                                break Label_0187;
                            }
                            if (n != 1620071571) {
                                throw new IllegalStateException();
                            }
                            if (Login.Login_username == null) {
                                break Label_0187;
                            }
                            if (n != 1620071571) {
                                return;
                            }
                            if (Login.Login_username.length() <= 0) {
                                break Label_0187;
                            }
                            if (n != 1620071571) {
                                throw new IllegalStateException();
                            }
                            Login.currentLoginField = 1153152795;
                            return;
                        }
                        Login.currentLoginField = 0;
                        return;
                    }
                    if (n != 1620071571) {
                        throw new IllegalStateException();
                    }
                }
            }
            class129.method763(10, (byte)18);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aq.aa(" + ')');
        }
    }
    
    static int method20(final int n) {
        try {
            return 571147771 * Rasterizer3D.clips.field2233;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aq.aa(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.field8 * -754086667;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "aq.af(" + ')');
        }
    }
}
