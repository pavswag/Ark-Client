import java.io.InputStream;
import java.net.URLConnection;
import java.awt.datatransfer.Transferable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.Random;
import java.io.IOException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.datatransfer.DataFlavor;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.text.DecimalFormat;

// 
// Decompiled by Procyon v0.5.36
// 

public class Login
{
    static String Login_response3;
    static boolean field730;
    static String dc;
    static IndexedSprite options_buttons_0Sprite;
    static IndexedSprite field733;
    static long field734;
    static int loginBoxX;
    static int Login_loadingPercent;
    static int loginIndex;
    static int field738;
    static final int bx = 6;
    public static final int aa = 30;
    static String Login_loadingText;
    static boolean field740;
    static String Login_response0;
    static String Login_response1;
    static String Login_response2;
    static int xPadding;
    static IndexedSprite field745;
    static String Login_password;
    static int field747;
    static String[] field748;
    static String field749;
    static final int bk = 5;
    static IndexedSprite titleboxSprite;
    static boolean field751;
    static final int af = 22;
    static int field752;
    static String dw;
    static boolean worldSelectOpen;
    static int hoveredWorldIndex;
    static int worldSelectPage;
    static int worldSelectPagesCount;
    static int currentLoginField;
    static long field759;
    static String[] field760;
    static String[] field761;
    static String[] field762;
    static int field763;
    static Buffer field764;
    static String Login_username;
    
    Login() throws Throwable {
        throw new Error();
    }
    
    static {
        Login.xPadding = 0;
        Login.loginBoxX = 2036160930 + 794898887 * Login.xPadding;
        Login.Login_loadingPercent = -2126902070;
        Login.Login_loadingText = "";
        Login.field738 = 1919975363;
        Login.field752 = -1552230487;
        Login.loginIndex = 0;
        Login.Login_response0 = "";
        Login.Login_response1 = "";
        Login.Login_response2 = "";
        Login.Login_response3 = "";
        Login.Login_username = "";
        Login.Login_password = "";
        Login.field747 = 0;
        Login.field748 = new String[8];
        Login.field749 = "";
        Login.field730 = false;
        Login.field740 = false;
        Login.field751 = true;
        Login.currentLoginField = 0;
        Login.dw = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00ef¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        Login.dc = "1234567890";
        Login.worldSelectOpen = false;
        Login.hoveredWorldIndex = 848889613;
        Login.worldSelectPage = 0;
        Login.worldSelectPagesCount = 0;
        new DecimalFormat("##0.00");
        new class129();
        Login.field734 = 8298737133189264243L;
        Login.field759 = 1178331881283680817L;
        Login.field760 = new String[] { "title.jpg" };
        Login.field761 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        Login.field762 = new String[] { "logo_speedrunning" };
    }
    
    static void cs(final Font font, final Font font2, final Font font3) {
        Login.xPadding = (-1687260435 * GameEngine.canvasWidth - 765) / 2 * 983792155;
        Login.loginBoxX = 794898887 * Login.xPadding + 2036160930;
        class143.loginBoxCenter = -1036961612 + Login.loginBoxX * -949768875;
        if (Login.worldSelectOpen) {
            Decimator.method328(font, font2, (byte)(-100));
            return;
        }
        class123.leftTitleSprite.ca(Login.xPadding * 578342931, 0);
        ParamComposition.rightTitleSprite.ca(Login.xPadding * 578342931 + 382, 0);
        Canvas.logoSprite.ax(Login.xPadding * 578342931 + 382 - Canvas.logoSprite.yOffset / 2, 18);
        if (Client.gameState * -1275976559 == 0 || Client.gameState * -1275976559 == 5) {
            final int n = 20;
            font.aj(Strings.iv, 180 + 678588245 * Login.loginBoxX, 245 - n, 16777215, -1);
            final int n2 = 253 - n;
            Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX * 678588245 + 180 - 152, n2, 304, 34, 9179409);
            Rasterizer2D.Rasterizer2D_drawRectangle(678588245 * Login.loginBoxX + 180 - 151, n2 + 1, 302, 32, 0);
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX * 678588245 + 180 - 150, 2 + n2, -819692701 * Login.Login_loadingPercent, 30, 9179409);
            Rasterizer2D.Rasterizer2D_fillRectangle(180 + 678588245 * Login.loginBoxX - 150 + -819692701 * Login.Login_loadingPercent, 2 + n2, 300 - Login.Login_loadingPercent * -819692701, 30, 0);
            font.aj(Login.Login_loadingText, 180 + Login.loginBoxX * 678588245, 276 - n, 16777215, -1);
        }
        if (Client.gameState * -1275976559 == 20) {
            Login.titleboxSprite.ax(Login.loginBoxX * 678588245 + 180 - Login.titleboxSprite.yOffset / 2, 271 - Login.titleboxSprite.subWidth / 2);
            int n3 = 201;
            font.aj(Login.Login_response1, 180 + 678588245 * Login.loginBoxX, n3, 16776960, 0);
            n3 += 15;
            font.aj(Login.Login_response2, Login.loginBoxX * 678588245 + 180, n3, 16776960, 0);
            n3 += 15;
            font.aj(Login.Login_response3, Login.loginBoxX * 678588245 + 180, n3, 16776960, 0);
            n3 += 15;
            n3 += 7;
            if (4 != Login.loginIndex * 1145608355 && 10 != 1145608355 * Login.loginIndex) {
                class492.xb(font, Strings.jy, Login.loginBoxX * 678588245 + 180 - 110, n3, 16777215, 0);
                int n4;
                String s;
                for (n4 = 200, s = class18.method63(1211481571); font.bf(s) > n4; s = s.substring(0, s.length() - 1)) {}
                class492.xb(font, AbstractFont.escapeBrackets(s), 180 + Login.loginBoxX * 678588245 - 70, n3, 16777215, 0);
                n3 += 15;
                String str;
                for (str = WorldMapDecorationType.method1841(Login.Login_password, (byte)1); font.bf(str) > n4; str = str.substring(1)) {}
                class492.xb(font, Strings.jp + str, 180 + Login.loginBoxX * 678588245 - 108, n3, 16777215, 0);
                n3 += 15;
            }
        }
        if (10 == Client.gameState * -1275976559 || Client.gameState * -1275976559 == 11 || Client.gameState * -1275976559 == 50) {
            Login.titleboxSprite.ax(Login.loginBoxX * 678588245, 171);
            if (0 == Login.loginIndex * 1145608355) {
                int n5 = 251;
                font.aj(Strings.ja, 678588245 * Login.loginBoxX + 180, n5, 16776960, 0);
                n5 += 30;
                final int n6 = 180 + 678588245 * Login.loginBoxX - 80;
                final int n7 = 291;
                class292.titlebuttonSprite.ax(n6 - 73, n7 - 20);
                font.ak(Strings.jb, n6 - 73, n7 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                final int n8 = 180 + 678588245 * Login.loginBoxX + 80;
                class292.titlebuttonSprite.ax(n8 - 73, n7 - 20);
                font.ak(Strings.jz, n8 - 73, n7 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            }
            else if (1 == 1145608355 * Login.loginIndex) {
                font.aj(Login.Login_response0, 678588245 * Login.loginBoxX + 180, 201, 16776960, 0);
                int n9 = 236;
                font.aj(Login.Login_response1, 678588245 * Login.loginBoxX + 180, n9, 16777215, 0);
                n9 += 15;
                font.aj(Login.Login_response2, Login.loginBoxX * 678588245 + 180, n9, 16777215, 0);
                n9 += 15;
                font.aj(Login.Login_response3, Login.loginBoxX * 678588245 + 180, n9, 16777215, 0);
                n9 += 15;
                final int n10 = 678588245 * Login.loginBoxX + 180 - 80;
                final int n11 = 321;
                class292.titlebuttonSprite.ax(n10 - 73, n11 - 20);
                font.aj(Strings.aq, n10, n11 + 5, 16777215, 0);
                final int n12 = Login.loginBoxX * 678588245 + 180 + 80;
                class292.titlebuttonSprite.ax(n12 - 73, n11 - 20);
                font.aj(Strings.jl, n12, 5 + n11, 16777215, 0);
            }
            else if (1145608355 * Login.loginIndex == 2) {
                int n13 = 201;
                font.aj(Login.Login_response1, class143.loginBoxCenter * 950254081, n13, 16776960, 0);
                n13 += 15;
                font.aj(Login.Login_response2, 950254081 * class143.loginBoxCenter, n13, 16776960, 0);
                n13 += 15;
                font.aj(Login.Login_response3, class143.loginBoxCenter * 950254081, n13, 16776960, 0);
                n13 += 15;
                n13 += 7;
                class492.xb(font, Strings.jy, 950254081 * class143.loginBoxCenter - 110, n13, 16777215, 0);
                int n14;
                String s2;
                for (n14 = 200, s2 = class18.method63(830529141); font.bf(s2) > n14; s2 = s2.substring(1)) {}
                class492.xb(font, AbstractFont.escapeBrackets(s2) + ((0 == Login.currentLoginField * -1232221421 & Client.cycle * -1886224337 % 40 < 20) ? (class383.method2081(16776960, 835389347) + class96.aw) : ""), 950254081 * class143.loginBoxCenter - 70, n13, 16777215, 0);
                n13 += 15;
                String str2;
                for (str2 = WorldMapDecorationType.method1841(Login.Login_password, (byte)1); font.bf(str2) > n14; str2 = str2.substring(1)) {}
                class492.xb(font, Strings.jp + str2 + ((-1232221421 * Login.currentLoginField == 1 & Client.cycle * -1886224337 % 40 < 20) ? (class383.method2081(16776960, 935111588) + class96.aw) : ""), 950254081 * class143.loginBoxCenter - 108, n13, 16777215, 0);
                n13 += 15;
                int n15 = 277;
                final int n16 = -117 + 950254081 * class143.loginBoxCenter;
                final boolean login_isUsernameRemembered = Client.Login_isUsernameRemembered;
                final boolean field730 = Login.field730;
                final IndexedSprite indexedSprite = login_isUsernameRemembered ? (field730 ? Login.field745 : class158.options_buttons_2Sprite) : (field730 ? Login.field733 : Login.options_buttons_0Sprite);
                indexedSprite.ax(n16, n15);
                class492.xb(font2, Strings.kc, n16 + (5 + indexedSprite.yOffset), 13 + n15, 16776960, 0);
                final int n17 = 950254081 * class143.loginBoxCenter + 24;
                final boolean ty = ClientPreferences.ty(class20.clientPreferences, -2073499476);
                final boolean field731 = Login.field740;
                final IndexedSprite indexedSprite2 = ty ? (field731 ? Login.field745 : class158.options_buttons_2Sprite) : (field731 ? Login.field733 : Login.options_buttons_0Sprite);
                indexedSprite2.ax(n17, n15);
                class492.xb(font2, Strings.ku, n17 + (5 + indexedSprite2.yOffset), n15 + 13, 16776960, 0);
                n15 += 15;
                final int n18 = class143.loginBoxCenter * 950254081 - 80;
                final int n19 = 321;
                class292.titlebuttonSprite.ax(n18 - 73, n19 - 20);
                font.aj(Strings.ju, n18, n19 + 5, 16777215, 0);
                final int n20 = 80 + class143.loginBoxCenter * 950254081;
                class292.titlebuttonSprite.ax(n20 - 73, n19 - 20);
                font.aj(Strings.jl, n20, 5 + n19, 16777215, 0);
                final int n21 = 357;
                switch (Login.field752 * -1733444455) {
                    case 2: {
                        class18.field58 = Strings.lg;
                        break;
                    }
                    default: {
                        class18.field58 = Strings.lv;
                        break;
                    }
                }
                class96.field1063 = new Bounds(class143.loginBoxCenter * 950254081, n21, font2.bf(class18.field58), 11);
                class19.field60 = new Bounds(950254081 * class143.loginBoxCenter, n21, font2.bf(Strings.lm), 11);
                font2.aj(class18.field58, 950254081 * class143.loginBoxCenter, n21, 16777215, 0);
            }
            else if (3 == Login.loginIndex * 1145608355) {
                int n22 = 201;
                font.aj(Strings.ke, 678588245 * Login.loginBoxX + 180, n22, 16776960, 0);
                n22 += 20;
                font2.aj(Strings.ky, Login.loginBoxX * 678588245 + 180, n22, 16776960, 0);
                n22 += 20;
                font2.aj(Strings.kh, 678588245 * Login.loginBoxX + 180, n22, 16776960, 0);
                n22 += 15;
                final int n23 = 678588245 * Login.loginBoxX + 180;
                final int n24 = 276;
                class292.titlebuttonSprite.ax(n23 - 73, n24 - 20);
                font3.aj(Strings.kp, n23, n24 + 5, 16777215, 0);
                final int n25 = 180 + Login.loginBoxX * 678588245;
                final int n26 = 326;
                class292.titlebuttonSprite.ax(n25 - 73, n26 - 20);
                font3.aj(Strings.kf, n25, 5 + n26, 16777215, 0);
            }
            else if (Login.loginIndex * 1145608355 == 4) {
                font.aj(Strings.je, 180 + 678588245 * Login.loginBoxX, 201, 16776960, 0);
                int n27 = 236;
                font.aj(Login.Login_response1, 678588245 * Login.loginBoxX + 180, n27, 16777215, 0);
                n27 += 15;
                font.aj(Login.Login_response2, 180 + Login.loginBoxX * 678588245, n27, 16777215, 0);
                n27 += 15;
                font.aj(Login.Login_response3, 678588245 * Login.loginBoxX + 180, n27, 16777215, 0);
                n27 += 15;
                class492.xb(font, Strings.jt + WorldMapDecorationType.method1841(Messages.otp, (byte)1) + ((-1886224337 * Client.cycle % 40 < 20) ? (class383.method2081(16776960, 178038969) + class96.aw) : ""), Login.loginBoxX * 678588245 + 180 - 108, n27, 16777215, 0);
                n27 -= 8;
                class492.xb(font, Strings.aa, 678588245 * Login.loginBoxX + 180 - 9, n27, 16776960, 0);
                n27 += 15;
                class492.xb(font, Strings.ay, 180 + Login.loginBoxX * 678588245 - 9, n27, 16776960, 0);
                final int n28 = Login.loginBoxX * 678588245 + 180 - 9 + font.bf(Strings.ay) + 15;
                final int n29 = n27 - font.al;
                IndexedSprite indexedSprite3;
                if (Login.field751) {
                    indexedSprite3 = class158.options_buttons_2Sprite;
                }
                else {
                    indexedSprite3 = Login.options_buttons_0Sprite;
                }
                indexedSprite3.ax(n28, n29);
                n27 += 15;
                final int n30 = 180 + 678588245 * Login.loginBoxX - 80;
                final int n31 = 321;
                class292.titlebuttonSprite.ax(n30 - 73, n31 - 20);
                font.aj(Strings.aq, n30, n31 + 5, 16777215, 0);
                final int n32 = 80 + (Login.loginBoxX * 678588245 + 180);
                class292.titlebuttonSprite.ax(n32 - 73, n31 - 20);
                font.aj(Strings.jl, n32, 5 + n31, 16777215, 0);
                font2.aj(Strings.jj, 180 + Login.loginBoxX * 678588245, n31 + 36, 255, 0);
            }
            else if (Login.loginIndex * 1145608355 == 5) {
                font.aj(Strings.ks, Login.loginBoxX * 678588245 + 180, 201, 16776960, 0);
                int n33 = 221;
                font3.aj(Login.Login_response1, 678588245 * Login.loginBoxX + 180, n33, 16776960, 0);
                n33 += 15;
                font3.aj(Login.Login_response2, 180 + 678588245 * Login.loginBoxX, n33, 16776960, 0);
                n33 += 15;
                font3.aj(Login.Login_response3, 180 + 678588245 * Login.loginBoxX, n33, 16776960, 0);
                n33 += 15;
                n33 += 14;
                class492.xb(font, Strings.kn, 180 + 678588245 * Login.loginBoxX - 145, n33, 16777215, 0);
                int n34;
                String s3;
                for (n34 = 174, s3 = class18.method63(669527653); font.bf(s3) > n34; s3 = s3.substring(1)) {}
                class492.xb(font, AbstractFont.escapeBrackets(s3) + ((-1886224337 * Client.cycle % 40 < 20) ? (class383.method2081(16776960, 1694019488) + class96.aw) : ""), Login.loginBoxX * 678588245 + 180 - 34, n33, 16777215, 0);
                n33 += 15;
                final int n35 = 180 + 678588245 * Login.loginBoxX - 80;
                final int n36 = 321;
                class292.titlebuttonSprite.ax(n35 - 73, n36 - 20);
                font.aj(Strings.kz, n35, n36 + 5, 16777215, 0);
                final int n37 = 80 + (180 + Login.loginBoxX * 678588245);
                class292.titlebuttonSprite.ax(n37 - 73, n36 - 20);
                font.aj(Strings.km, n37, n36 + 5, 16777215, 0);
                font2.aj(Strings.lm, class143.loginBoxCenter * 950254081, 356, 268435455, 0);
            }
            else if (6 == Login.loginIndex * 1145608355) {
                int n38 = 201;
                font.aj(Login.Login_response1, 180 + Login.loginBoxX * 678588245, n38, 16776960, 0);
                n38 += 15;
                font.aj(Login.Login_response2, 180 + Login.loginBoxX * 678588245, n38, 16776960, 0);
                n38 += 15;
                font.aj(Login.Login_response3, 678588245 * Login.loginBoxX + 180, n38, 16776960, 0);
                n38 += 15;
                final int n39 = 180 + 678588245 * Login.loginBoxX;
                final int n40 = 321;
                class292.titlebuttonSprite.ax(n39 - 73, n40 - 20);
                font.aj(Strings.km, n39, n40 + 5, 16777215, 0);
            }
            else if (1145608355 * Login.loginIndex == 7) {
                if (WorldMapSectionType.field2384 && !Client.onMobile) {
                    int n41 = 201;
                    font.aj(Login.Login_response1, 950254081 * class143.loginBoxCenter, n41, 16776960, 0);
                    n41 += 15;
                    font.aj(Login.Login_response2, 950254081 * class143.loginBoxCenter, n41, 16776960, 0);
                    n41 += 15;
                    font.aj(Login.Login_response3, 950254081 * class143.loginBoxCenter, n41, 16776960, 0);
                    int n42 = class143.loginBoxCenter * 950254081 - 150;
                    n41 += 10;
                    for (int i = 0; i < 8; ++i) {
                        class292.titlebuttonSprite.method2596(n42, n41, 30, 40);
                        class492.xb(font, ((Login.field748[i] == null) ? "" : Login.field748[i]) + ((Login.field747 * -1262226977 == i & -1886224337 * Client.cycle % 40 < 20) ? (class383.method2081(16776960, -260017787) + class96.aw) : ""), n42 + 10, 27 + n41, 16777215, 0);
                        if (i || 3 == i) {
                            n42 += 50;
                            class492.xb(font, AbstractFont.escapeBrackets("/"), n42 - 13, 27 + n41, 16777215, 0);
                        }
                        else {
                            n42 += 35;
                        }
                    }
                    final int n43 = class143.loginBoxCenter * 950254081 - 80;
                    final int n44 = 321;
                    class292.titlebuttonSprite.ax(n43 - 73, n44 - 20);
                    font.aj("Submit", n43, n44 + 5, 16777215, 0);
                    final int n45 = 80 + 950254081 * class143.loginBoxCenter;
                    class292.titlebuttonSprite.ax(n45 - 73, n44 - 20);
                    font.aj(Strings.jl, n45, n44 + 5, 16777215, 0);
                }
                else {
                    int n46 = 216;
                    font.aj(Strings.mw, Login.loginBoxX * 678588245 + 180, n46, 16776960, 0);
                    n46 += 15;
                    font3.aj(Strings.mz, 180 + Login.loginBoxX * 678588245, n46, 16776960, 0);
                    n46 += 15;
                    font3.aj(Strings.mu, 180 + 678588245 * Login.loginBoxX, n46, 16776960, 0);
                    n46 += 15;
                    final int n47 = Login.loginBoxX * 678588245 + 180 - 80;
                    final int n48 = 321;
                    class292.titlebuttonSprite.ax(n47 - 73, n48 - 20);
                    font.aj(Strings.mq, n47, 5 + n48, 16777215, 0);
                    final int n49 = 180 + Login.loginBoxX * 678588245 + 80;
                    class292.titlebuttonSprite.ax(n49 - 73, n48 - 20);
                    font.aj(Strings.km, n49, n48 + 5, 16777215, 0);
                }
            }
            else if (8 == 1145608355 * Login.loginIndex) {
                int n50 = 216;
                font.aj(Strings.fb, Login.loginBoxX * 678588245 + 180, n50, 16776960, 0);
                n50 += 15;
                font3.aj(Strings.fn, 180 + 678588245 * Login.loginBoxX, n50, 16776960, 0);
                n50 += 15;
                font3.aj(Strings.fz, 678588245 * Login.loginBoxX + 180, n50, 16776960, 0);
                n50 += 15;
                final int n51 = 678588245 * Login.loginBoxX + 180 - 80;
                final int n52 = 321;
                class292.titlebuttonSprite.ax(n51 - 73, n52 - 20);
                font.aj(Strings.fa, n51, 5 + n52, 16777215, 0);
                final int n53 = 80 + (Login.loginBoxX * 678588245 + 180);
                class292.titlebuttonSprite.ax(n53 - 73, n52 - 20);
                font.aj(Strings.km, n53, n52 + 5, 16777215, 0);
            }
            else if (9 == Login.loginIndex * 1145608355) {
                int n54 = 221;
                font.aj(Login.Login_response1, 180 + 678588245 * Login.loginBoxX, n54, 16776960, 0);
                n54 += 25;
                font.aj(Login.Login_response2, 678588245 * Login.loginBoxX + 180, n54, 16776960, 0);
                n54 += 25;
                font.aj(Login.Login_response3, 180 + Login.loginBoxX * 678588245, n54, 16776960, 0);
                final int n55 = 180 + Login.loginBoxX * 678588245;
                final int n56 = 311;
                class292.titlebuttonSprite.ax(n55 - 73, n56 - 20);
                font.aj(Strings.kp, n55, n56 + 5, 16777215, 0);
            }
            else if (10 == 1145608355 * Login.loginIndex) {
                final int n57 = 678588245 * Login.loginBoxX + 180;
                int n58 = 209;
                font.aj(Strings.ja, 180 + 678588245 * Login.loginBoxX, n58, 16776960, 0);
                n58 += 20;
                class439.field3828.ax(n57 - 109, n58);
                if (Login.field749.isEmpty()) {
                    class376.field3605.ax(n57 - 48, 18 + n58);
                }
                else {
                    class376.field3605.ax(n57 - 48, 5 + n58);
                    font.aj(Login.field749, n57, 68 + n58 - 15, 16776960, 0);
                }
            }
            else if (12 == 1145608355 * Login.loginIndex) {
                final int n59 = class143.loginBoxCenter * 950254081;
                int n60 = 216;
                font3.aj(Strings.mx, n59, n60, 16777215, 0);
                n60 += 17;
                font3.aj(Strings.ma, n59, n60, 16777215, 0);
                n60 += 17;
                font3.aj(Strings.mp, n59, n60, 16777215, 0);
                n60 += 17;
                font3.aj(Strings.mj, n59, n60, 16777215, 0);
                final int n61 = 950254081 * class143.loginBoxCenter - 80;
                final int n62 = 311;
                class292.titlebuttonSprite.ax(n61 - 73, n62 - 20);
                font.aj(Strings.mh, n61, n62 + 5, 16777215, 0);
                final int n63 = 80 + class143.loginBoxCenter * 950254081;
                class292.titlebuttonSprite.ax(n63 - 73, n62 - 20);
                font.aj(Strings.mg, n63, n62 + 5, 16777215, 0);
            }
            else if (13 == Login.loginIndex * 1145608355) {
                int n64 = 231;
                font3.aj(Strings.ms, 678588245 * Login.loginBoxX + 180, n64, 16777215, 0);
                n64 += 20;
                font3.aj(Strings.mc, 678588245 * Login.loginBoxX + 180, n64, 16777215, 0);
                final int n65 = 678588245 * Login.loginBoxX + 180;
                final int n66 = 311;
                class292.titlebuttonSprite.ax(n65 - 73, n66 - 20);
                font.aj(Strings.km, n65, n66 + 5, 16777215, 0);
            }
            else if (1145608355 * Login.loginIndex == 14) {
                int n67 = 201;
                String s4 = "";
                String s5 = "";
                String s6 = "";
                switch (Login.field738 * -1478945003) {
                    case 0: {
                        s4 = Strings.cc;
                        s5 = Strings.cn;
                        s6 = Strings.ca;
                        break;
                    }
                    case 2: {
                        s4 = Strings.fe;
                        s5 = Strings.fs;
                        s6 = Strings.field3226;
                        break;
                    }
                    default: {
                        class6.method20(false, 1620071571);
                        break;
                    }
                    case 1: {
                        s4 = Strings.db;
                        s5 = Strings.df;
                        s6 = Strings.dq;
                        break;
                    }
                }
                font.aj(s4, Login.loginBoxX * 678588245 + 180, n67, 16776960, 0);
                n67 += 20;
                font.aj(s5, 180 + 678588245 * Login.loginBoxX, n67, 16776960, 0);
                n67 += 20;
                font.aj(s6, 678588245 * Login.loginBoxX + 180, n67, 16776960, 0);
                final int n68 = 678588245 * Login.loginBoxX + 180;
                final int n69 = 276;
                class292.titlebuttonSprite.ax(n68 - 73, n69 - 20);
                if (1 == Login.field738 * -1478945003) {
                    font.aj(Strings.bs, n68, 5 + n69, 16777215, 0);
                }
                else {
                    font.aj(Strings.bn, n68, n69 + 5, 16777215, 0);
                }
                final int n70 = 180 + 678588245 * Login.loginBoxX;
                final int n71 = 326;
                class292.titlebuttonSprite.ax(n70 - 73, n71 - 20);
                font.aj(Strings.km, n70, n71 + 5, 16777215, 0);
            }
            else if (24 == Login.loginIndex * 1145608355) {
                int n72 = 221;
                font.aj(Login.Login_response1, 678588245 * Login.loginBoxX + 180, n72, 16777215, 0);
                n72 += 15;
                font.aj(Login.Login_response2, 678588245 * Login.loginBoxX + 180, n72, 16777215, 0);
                n72 += 15;
                font.aj(Login.Login_response3, 678588245 * Login.loginBoxX + 180, n72, 16777215, 0);
                n72 += 15;
                final int n73 = Login.loginBoxX * 678588245 + 180;
                final int n74 = 301;
                class292.titlebuttonSprite.ax(n73 - 73, n74 - 20);
                font.aj(Strings.au, n73, n74 + 5, 16777215, 0);
            }
            else if (32 == Login.loginIndex * 1145608355) {
                int n75 = 216;
                font.aj(Strings.mw, Login.loginBoxX * 678588245 + 180, n75, 16776960, 0);
                n75 += 15;
                font3.aj(Strings.mz, Login.loginBoxX * 678588245 + 180, n75, 16776960, 0);
                n75 += 15;
                font3.aj(Strings.mu, 678588245 * Login.loginBoxX + 180, n75, 16776960, 0);
                n75 += 15;
                final int n76 = 180 + Login.loginBoxX * 678588245 - 80;
                final int n77 = 321;
                class292.titlebuttonSprite.ax(n76 - 73, n77 - 20);
                font.aj(Strings.mq, n76, n77 + 5, 16777215, 0);
                final int n78 = 180 + Login.loginBoxX * 678588245 + 80;
                class292.titlebuttonSprite.ax(n78 - 73, n77 - 20);
                font.aj(Strings.km, n78, n77 + 5, 16777215, 0);
            }
            else if (33 == Login.loginIndex * 1145608355) {
                int n79 = 201;
                font.aj(Login.Login_response1, 180 + Login.loginBoxX * 678588245, n79, 16776960, 0);
                n79 += 20;
                font2.aj(Login.Login_response2, 180 + Login.loginBoxX * 678588245, n79, 16776960, 0);
                n79 += 20;
                font2.aj(Login.Login_response3, 180 + Login.loginBoxX * 678588245, n79, 16776960, 0);
                n79 += 15;
                final int n80 = 180 + 678588245 * Login.loginBoxX;
                final int n81 = 276;
                class292.titlebuttonSprite.ax(n80 - 73, n81 - 20);
                font3.aj(Strings.nw, n80, n81 + 5, 16777215, 0);
                final int n82 = Login.loginBoxX * 678588245 + 180;
                final int n83 = 326;
                class292.titlebuttonSprite.ax(n82 - 73, n83 - 20);
                font3.aj(Strings.km, n82, 5 + n83, 16777215, 0);
            }
        }
        if (Client.gameState * -1275976559 >= 10) {
            final int[] array = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(array);
            Rasterizer2D.Rasterizer2D_setClip(Login.xPadding * 578342931, 0, 765 + 578342931 * Login.xPadding, 1658005443 * class262.canvasHeight);
            class121.field1184.draw(578342931 * Login.xPadding - 22, -1886224337 * Client.cycle, 940858424);
            class121.field1184.draw(578342931 * Login.xPadding + 765 + 22 - 128, -1886224337 * Client.cycle, -1657963903);
            Rasterizer2D.Rasterizer2D_setClipArray(array);
        }
        class148.title_muteSprite[ClientPreferences.ss(class20.clientPreferences, -1197954221)].ax(765 + Login.xPadding * 578342931 - 40, 463);
        if (-1275976559 * Client.gameState > 5 && Language.Language_EN == ClanSettings.clientLanguage) {
            if (class319.field3030 != null) {
                final int n84 = Login.xPadding * 578342931 + 5;
                final int n85 = 463;
                final int n86 = 100;
                final int n87 = 35;
                class319.field3030.ax(n84, n85);
                font.aj(Strings.gx + " " + Client.worldId * -453810525, n86 / 2 + n84, n85 + n87 / 2 - 2, 16777215, 0);
                if (class11.World_request != null) {
                    font2.aj(Strings.mb, n86 / 2 + n84, 12 + (n87 / 2 + n85), 16777215, 0);
                }
                else {
                    font2.aj(Strings.nz, n84 + n86 / 2, n87 / 2 + n85 + 12, 16777215, 0);
                }
            }
            else {
                class319.field3030 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "sl_button", "", 786509360);
            }
        }
    }
    
    static Date bs() {
        final Calendar instance = Calendar.getInstance();
        instance.set(2, 0);
        instance.set(5, 1);
        instance.set(1, 1900);
        return instance.getTime();
    }
    
    static void ca(final String login_response1, final String login_response2, final String login_response3) {
        Login.Login_response1 = login_response1;
        Login.Login_response2 = login_response2;
        Login.Login_response3 = login_response3;
    }
    
    static int ad(final AbstractArchive abstractArchive) {
        int n = Login.field761.length + Login.field760.length;
        final String[] field762 = Login.field762;
        for (int i = 0; i < field762.length; ++i) {
            if (AbstractArchive.getFileFlat(abstractArchive, field762[i], -939509624) != -1) {
                ++n;
            }
        }
        return n;
    }
    
    static void ba(final String s, final String s2, final String s3) {
        class129.method763(7, (byte)95);
        class205.method1137(s, s2, s3, 67027467);
    }
    
    static int ae(final AbstractArchive abstractArchive) {
        int n = Login.field761.length + Login.field760.length;
        final String[] field762 = Login.field762;
        for (int i = 0; i < field762.length; ++i) {
            if (AbstractArchive.getFileFlat(abstractArchive, field762[i], 2114930446) != -1) {
                ++n;
            }
        }
        return n;
    }
    
    static void cr(final World world) {
        if (world.isMembersOnly(1029039210) != Client.isMembersWorld) {
            Client.isMembersWorld = world.isMembersOnly(1029039210);
            final boolean membersOnly = world.isMembersOnly(1029039210);
            if (FileSystem.ItemDefinition_inMembersWorld != membersOnly) {
                class379.method2015((byte)(-46));
                FileSystem.ItemDefinition_inMembersWorld = membersOnly;
            }
        }
        if (-205173751 * Client.worldProperties != 1810954985 * world.properties) {
            final Archive archive8 = class452.archive8;
            final int n = 1810954985 * world.properties;
            if ((n & 0x20000000) != 0x0) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_deadman_mode", "", 222525314);
            }
            else if (0x0 != (n & 0x40000000)) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_seasonal_mode", "", 1271995175);
            }
            else if ((n & 0x100) != 0x0) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_speedrunning", "", -1784470319);
            }
            else {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo", "", 1809682383);
            }
        }
        UserComparator8.worldHost = world.host;
        Client.worldId = -2094155673 * world.id;
        Client.worldProperties = world.properties * 702001121;
        FriendsChat.worldPort = ((0 == -1274626977 * Client.gameBuild) ? 43594 : (-2091224171 * world.id + 40000)) * -1326916691;
        class127.js5Port = ((0 == Client.gameBuild * -1274626977) ? 443 : (50000 + world.id * -2091224171)) * -1927102761;
        ItemContainer.currentPort = FriendsChat.worldPort * 518729065;
    }
    
    static void ce(final boolean b) {
        int n = 0;
        if (!class134.method779((byte)74)) {
            n = 12;
        }
        else if (Client.ay(ScriptFrame.client, -1815016487) || ScriptFrame.client.method370((byte)(-82)) || ScriptFrame.client.method369((byte)101)) {
            n = 10;
        }
        class129.method763(n, (byte)75);
        if (b) {
            Login.Login_username = "";
            Login.Login_password = "";
            class204.field1846 = 0;
            Messages.otp = "";
        }
        WallDecoration.method1385(285951283);
        if (Client.Login_isUsernameRemembered && null != Login.Login_username && Login.Login_username.length() > 0) {
            Login.currentLoginField = 1153152795;
        }
        else {
            Login.currentLoginField = 0;
        }
    }
    
    static void bb(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final boolean b, final int n) {
        if (class12.clearLoginScreen) {
            if (n == 4) {
                class129.method763(4, (byte)117);
            }
            return;
        }
        if (0 == n) {
            method444(b, -724474872);
        }
        else {
            class129.method763(n, (byte)38);
        }
        Rasterizer2D.Rasterizer2D_clear();
        class123.leftTitleSprite = Strings.method1853(AbstractArchive.ui(abstractArchive, "title.jpg", "", 1648560407), -1448279669);
        ParamComposition.rightTitleSprite = class123.leftTitleSprite.mirrorHorizontally();
        final int n2 = Client.worldProperties * -205173751;
        if ((n2 & 0x7AD123B5) != 0x0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_deadman_mode", "", -1524845359);
        }
        else if (0x0 != (n2 & 0x1BE9C82)) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_seasonal_mode", "", 1385424753);
        }
        else if ((n2 & 0x91F9FB8E) != 0x0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_speedrunning", "", 1219508780);
        }
        else {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo", "", -427742568);
        }
        Login.titleboxSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebox", "", -1929066490);
        class292.titlebuttonSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton", "", -1685438328);
        class439.field3828 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_large", "", 1108343198);
        class376.field3605 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "play_now_text", "", -1732094170);
        MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_wide42,1", "", -2110741465);
        class396.runesSprite = class314.method1708(abstractArchive2, "runes", "", 444390493);
        class148.title_muteSprite = class314.method1708(abstractArchive2, "title_mute", "", -1731449036);
        Login.options_buttons_0Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,0", "", -720844238);
        Login.field733 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,4", "", 1638851795);
        class158.options_buttons_2Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,2", "", -1726249003);
        Login.field745 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,6", "", -164298780);
        ChatChannel.field817 = 253396286 * Login.options_buttons_0Sprite.yOffset;
        FloorUnderlayDefinition.field1642 = Login.options_buttons_0Sprite.subWidth * 905476585;
        class121.field1184 = new LoginScreenAnimation(class396.runesSprite);
        if (b) {
            Login.Login_username = "";
            Login.Login_password = "";
            Login.field748 = new String[8];
            Login.field747 = 0;
        }
        class204.field1846 = 0;
        Messages.otp = "";
        Login.field751 = true;
        Login.worldSelectOpen = false;
        if (!ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
            class282.method1592(2, class399.archive6, "scape main", "", 255, false, 801953209);
        }
        else {
            class297.musicPlayerStatus = 1421763971;
            class297.musicTrackArchive = null;
            class379.musicTrackGroupId = 1643562499;
            VarpDefinition.musicTrackFileId = -10349328;
            class100.musicTrackVolume = 0;
            class120.musicTrackBoolean = false;
            class162.pcmSampleLength = 440964570;
        }
        class177.vmethod3380(false, 1514496356);
        class12.clearLoginScreen = true;
        Login.xPadding = 851044613 * ((GameEngine.canvasWidth * -1687260435 + 1101078484) / 2);
        Login.loginBoxX = 794898887 * Login.xPadding + 2036160930;
        class143.loginBoxCenter = -1036961612 + Login.loginBoxX * -949768875;
        class123.leftTitleSprite.ca(-1457820036 * Login.xPadding, 0);
        ParamComposition.rightTitleSprite.ca(-449444379 + Login.xPadding * 578342931, 0);
        Canvas.logoSprite.ax(382 + Login.xPadding * -299039362 - Canvas.logoSprite.yOffset / 2, 18);
    }
    
    static void cb() {
        Login.worldSelectOpen = false;
        class123.leftTitleSprite.ca(Login.xPadding * 578342931, 0);
        ParamComposition.rightTitleSprite.ca(578342931 * Login.xPadding + 382, 0);
        Canvas.logoSprite.ax(Login.xPadding * 578342931 + 382 - Canvas.logoSprite.yOffset / 2, 18);
    }
    
    static int ch() {
        return Login.loginIndex * 1145608355;
    }
    
    static void cl(final World world) {
        if (world.isMembersOnly(1029039210) != Client.isMembersWorld) {
            Client.isMembersWorld = world.isMembersOnly(1029039210);
            final boolean membersOnly = world.isMembersOnly(1029039210);
            if (FileSystem.ItemDefinition_inMembersWorld != membersOnly) {
                class379.method2015((byte)59);
                FileSystem.ItemDefinition_inMembersWorld = membersOnly;
            }
        }
        if (-1986253386 * Client.worldProperties != 1810954985 * world.properties) {
            final Archive archive8 = class452.archive8;
            final int n = 1810954985 * world.properties;
            if ((n & 0x20000000) != 0x0) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_deadman_mode", "", 1968078891);
            }
            else if (0x0 != (n & 0x40000000)) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_seasonal_mode", "", -1765739526);
            }
            else if ((n & 0x100) != 0x0) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_speedrunning", "", 582103768);
            }
            else {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo", "", -617890736);
            }
        }
        UserComparator8.worldHost = world.host;
        Client.worldId = -2094155673 * world.id;
        Client.worldProperties = world.properties * 702001121;
        FriendsChat.worldPort = ((0 == -1274626977 * Client.gameBuild) ? 43594 : (-26354392 * world.id + 40000)) * -1634175833;
        class127.js5Port = ((0 == Client.gameBuild * -1274626977) ? -1841763118 : (50000 + world.id * -2091224171)) * -1927102761;
        ItemContainer.currentPort = FriendsChat.worldPort * 704540842;
    }
    
    static void cn(final String login_response1, final String login_response2, final String login_response3) {
        Login.Login_response1 = login_response1;
        Login.Login_response2 = login_response2;
        Login.Login_response3 = login_response3;
    }
    
    static void bw(final boolean b) {
        int n = 0;
        if (!class134.method779((byte)120)) {
            n = 12;
        }
        else if (Client.ay(ScriptFrame.client, 1884562794) || ScriptFrame.client.method370((byte)(-79)) || ScriptFrame.client.method369((byte)29)) {
            n = 10;
        }
        class129.method763(n, (byte)49);
        if (b) {
            Login.Login_username = "";
            Login.Login_password = "";
            class204.field1846 = 0;
            Messages.otp = "";
        }
        WallDecoration.method1385(285951283);
        if (Client.Login_isUsernameRemembered && null != Login.Login_username && Login.Login_username.length() > 0) {
            Login.currentLoginField = 1153152795;
        }
        else {
            Login.currentLoginField = 0;
        }
    }
    
    static void cf(final GameEngine gameEngine) {
        final class207 keyHandlerInstance = Client.keyHandlerInstance;
        while (class207.mt(keyHandlerInstance, 645304414)) {
            if (-1814173011 * keyHandlerInstance.field1867 == 13) {
                class138.method800((byte)63);
                return;
            }
            if (keyHandlerInstance.field1867 * -518250217 == 166737808) {
                if (1246310743 * Login.worldSelectPage <= 0 || null == PlayerType.worldSelectLeftSprite) {
                    continue;
                }
                Login.worldSelectPage += 1379513753;
            }
            else {
                if (-1347277129 != -1196552362 * keyHandlerInstance.field1867 || Login.worldSelectPage * -1893311214 >= -1021988035 * Login.worldSelectPagesCount || null == class13.worldSelectRightSprite) {
                    continue;
                }
                Login.worldSelectPage += 1697396231;
            }
        }
        if (1 == -1222491879 * MouseHandler.MouseHandler_lastButton || (!class473.mouseCam && -503459742 * MouseHandler.MouseHandler_lastButton == 4)) {
            final int n = Login.xPadding * 578342931 + 280;
            if (MouseHandler.MouseHandler_lastPressedX * -1964498557 >= n && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n + 14 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY * 2143851659 <= 18) {
                FillMode.changeWorldSelectSorting(0, 0, -1244347045);
                return;
            }
            if (623915770 * MouseHandler.MouseHandler_lastPressedX >= 15 + n && MouseHandler.MouseHandler_lastPressedX * 1233803282 <= n + 1432154085 && 1496997786 * MouseHandler.MouseHandler_lastPressedY >= 4 && 1163896205 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                FillMode.changeWorldSelectSorting(0, 1, -1245284952);
                return;
            }
            final int n2 = 2006563395 + 578342931 * Login.xPadding;
            if (MouseHandler.MouseHandler_lastPressedX * 2020601481 >= n2 && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n2 + 14 && -1904901889 * MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                FillMode.changeWorldSelectSorting(1, 0, -1983561012);
                return;
            }
            if (MouseHandler.MouseHandler_lastPressedX * 1139603669 >= n2 + 15 && 784208778 * MouseHandler.MouseHandler_lastPressedX <= n2 + 676070687 && MouseHandler.MouseHandler_lastPressedY * -1861098731 >= 4 && 1163896205 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                FillMode.changeWorldSelectSorting(1, 1, -337996094);
                return;
            }
            final int n3 = 500 + Login.xPadding * 578342931;
            if (MouseHandler.MouseHandler_lastPressedX * 1416131299 >= n3 && 326738374 * MouseHandler.MouseHandler_lastPressedX <= n3 + 14 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4 && 1163896205 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                FillMode.changeWorldSelectSorting(2, 0, -557268305);
                return;
            }
            if (536478344 * MouseHandler.MouseHandler_lastPressedX >= n3 + 15 && MouseHandler.MouseHandler_lastPressedX * 1795700701 <= 18459833 + n3 && MouseHandler.MouseHandler_lastPressedY * -142611885 >= 4 && MouseHandler.MouseHandler_lastPressedY * -1254107616 <= 18) {
                FillMode.changeWorldSelectSorting(2, 1, -7807825);
                return;
            }
            final int n4 = Login.xPadding * -108064052 + 610;
            if (MouseHandler.MouseHandler_lastPressedX * -785546073 >= n4 && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n4 + 14 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY * 308957438 <= 18) {
                FillMode.changeWorldSelectSorting(3, 0, -1984371464);
                return;
            }
            if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= 15 + n4 && MouseHandler.MouseHandler_lastPressedX * -1051841486 <= 1234372781 + n4 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4 && MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                FillMode.changeWorldSelectSorting(3, 1, -1834312056);
                return;
            }
            if (1235571871 * MouseHandler.MouseHandler_lastPressedX >= -496837846 + Login.xPadding * 578342931 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4 && -1095332052 * MouseHandler.MouseHandler_lastPressedX <= 708 + Login.xPadding * 1683290128 + 50 && 2094282003 * MouseHandler.MouseHandler_lastPressedY <= 20) {
                class138.method800((byte)77);
                return;
            }
            if (Login.hoveredWorldIndex * 1328122280 != -1) {
                FloorOverlayDefinition.changeWorld(class31.World_worlds[1356120227 * Login.hoveredWorldIndex], 903746422);
                class138.method800((byte)20);
                return;
            }
            if (Login.worldSelectPage * -2032212957 > 0 && null != PlayerType.worldSelectLeftSprite && -1284165148 * MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= PlayerType.worldSelectLeftSprite.yOffset && -1676503789 * MouseHandler.MouseHandler_lastPressedY >= -1182439308 * class262.canvasHeight / 2 - 50 && 253561152 * MouseHandler.MouseHandler_lastPressedY <= -963083632 * class262.canvasHeight / 2 + 2059031353) {
                Login.worldSelectPage += 463550019;
            }
            if (1246310743 * Login.worldSelectPage < Login.worldSelectPagesCount * 1959698517 && null != class13.worldSelectRightSprite && MouseHandler.MouseHandler_lastPressedX * 2020601481 >= GameEngine.canvasWidth * 54122148 - class13.worldSelectRightSprite.yOffset - 5 && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= GameEngine.canvasWidth * 1870573441 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= class262.canvasHeight * 1658005443 / 2 - 50 && MouseHandler.MouseHandler_lastPressedY * 1163896205 <= class262.canvasHeight * 1658005443 / 2 + 449191052) {
                Login.worldSelectPage -= 348473314;
            }
        }
    }
    
    static void cw() {
        class129.method763(24, (byte)27);
        class205.method1137(Strings.jr, Strings.jv, Strings.jh, -647523607);
    }
    
    static void cv() {
        if (Players.loadWorlds(-1765402628)) {
            Login.worldSelectOpen = true;
            Login.worldSelectPage = 0;
            Login.worldSelectPagesCount = 0;
        }
    }
    
    static void cj(final int n) {
        if (1145608355 * Login.loginIndex == n) {
            return;
        }
        Login.loginIndex = 1331354379 * n;
    }
    
    static String be() {
        return ClientPreferences.ty(class20.clientPreferences, -2114501008) ? WorldMapDecorationType.method1841(Login.Login_username, (byte)1) : Login.Login_username;
    }
    
    static int cp() {
        return Login.loginIndex * -1261399083;
    }
    
    static void method444(final boolean b, final int n) {
        try {
            int n2 = 0;
            Label_0093: {
                if (!class134.method779((byte)122)) {
                    if (n >= -584325050) {
                        throw new IllegalStateException();
                    }
                    n2 = 12;
                }
                else {
                    if (!Client.ay(ScriptFrame.client, -493068239)) {
                        if (n >= -584325050) {
                            throw new IllegalStateException();
                        }
                        if (!ScriptFrame.client.method370((byte)(-47))) {
                            if (n >= -584325050) {
                                throw new IllegalStateException();
                            }
                            if (!ScriptFrame.client.method369((byte)77)) {
                                break Label_0093;
                            }
                        }
                    }
                    n2 = 10;
                }
            }
            class129.method763(n2, (byte)115);
            if (b) {
                if (n >= -584325050) {
                    throw new IllegalStateException();
                }
                Login.Login_username = "";
                Client.it(-1);
                Login.Login_password = "";
                class204.field1846 = 0;
                Messages.otp = "";
            }
            WallDecoration.method1385(285951283);
            Label_0102: {
                if (!Client.Login_isUsernameRemembered) {
                    break Label_0102;
                }
                if (n >= -584325050) {
                    throw new IllegalStateException();
                }
                if (null == Login.Login_username) {
                    break Label_0102;
                }
                if (n >= -584325050) {
                    throw new IllegalStateException();
                }
                if (Login.Login_username.length() <= 0) {
                    break Label_0102;
                }
                Login.currentLoginField = 1153152795;
                return;
            }
            Login.currentLoginField = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cz.ay(" + ')');
        }
    }
    
    static String bi() {
        return ClientPreferences.ty(class20.clientPreferences, -2101430591) ? WorldMapDecorationType.method1841(Login.Login_username, (byte)1) : Login.Login_username;
    }
    
    static void bv(final String s, final String s2, final String s3) {
        class129.method763(7, (byte)120);
        class205.method1137(s, s2, s3, 520243513);
    }
    
    static void ck(final Font font, final Font font2) {
        if (null == class476.worldSelectBackSprites) {
            final Archive archive8 = class452.archive8;
            SpritePixels[] method699;
            if (!AbstractArchive.sh(archive8, "sl_back", "", -1313069490)) {
                method699 = null;
            }
            else {
                final int fileFlat = AbstractArchive.getFileFlat(archive8, "sl_back", -523133489);
                method699 = UserComparator3.method699(archive8, fileFlat, archive8.getFileId(fileFlat, "", (short)8192), 1271520368);
            }
            class476.worldSelectBackSprites = method699;
        }
        if (null == class16.worldSelectFlagSprites) {
            class16.worldSelectFlagSprites = class314.method1708(class452.archive8, "sl_flags", "", 1739024553);
        }
        if (DevicePcmPlayerProvider.worldSelectArrows == null) {
            DevicePcmPlayerProvider.worldSelectArrows = class314.method1708(class452.archive8, "sl_arrows", "", -1349727078);
        }
        if (World.worldSelectStars == null) {
            World.worldSelectStars = class314.method1708(class452.archive8, "sl_stars", "", 736342731);
        }
        if (PlayerType.worldSelectLeftSprite == null) {
            PlayerType.worldSelectLeftSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "leftarrow", "", 1965099766);
        }
        if (class13.worldSelectRightSprite == null) {
            class13.worldSelectRightSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "rightarrow", "", 601578963);
        }
        Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 578342931, 23, 765, 480, 0);
        Rasterizer2D.Rasterizer2D_fillRectangleGradient(578342931 * Login.xPadding, 0, 125, 23, 12425273, 9135624);
        Rasterizer2D.Rasterizer2D_fillRectangleGradient(125 + Login.xPadding * 578342931, 0, 640, 23, 5197647, 2697513);
        font.aj(Strings.mo, Login.xPadding * 578342931 + 62, 15, 0, -1);
        if (null != World.worldSelectStars) {
            World.worldSelectStars[1].ax(Login.xPadding * 578342931 + 140, 1);
            class492.xb(font2, Strings.mn, 578342931 * Login.xPadding + 152, 10, 16777215, -1);
            World.worldSelectStars[0].ax(Login.xPadding * 578342931 + 140, 12);
            class492.xb(font2, Strings.mi, 152 + Login.xPadding * 578342931, 21, 16777215, -1);
        }
        if (DevicePcmPlayerProvider.worldSelectArrows != null) {
            final int n = 578342931 * Login.xPadding + 280;
            if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n, 4);
            }
            if (World.World_sortOption1[0] == 0 && 1 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n + 15, 4);
            }
            class492.xb(font, Strings.md, 32 + n, 17, 16777215, -1);
            final int n2 = Login.xPadding * 578342931 + 390;
            if (1 == World.World_sortOption1[0] && 0 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n2, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n2, 4);
            }
            if (World.World_sortOption1[0] == 1 && 1 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n2, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n2 + 15, 4);
            }
            class492.xb(font, Strings.mr, 32 + n2, 17, 16777215, -1);
            final int n3 = Login.xPadding * 578342931 + 500;
            if (2 == World.World_sortOption1[0] && 0 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n3, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n3, 4);
            }
            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(n3 + 15, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(15 + n3, 4);
            }
            class492.xb(font, Strings.ml, 32 + n3, 17, 16777215, -1);
            final int n4 = Login.xPadding * 578342931 + 610;
            if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n4, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n4, 4);
            }
            if (3 == World.World_sortOption1[0] && 1 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n4, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n4 + 15, 4);
            }
            class492.xb(font, Strings.mf, n4 + 32, 17, 16777215, -1);
        }
        Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 578342931 + 708, 4, 50, 16, 0);
        font2.aj(Strings.jl, 25 + (708 + Login.xPadding * 578342931), 16, 16777215, -1);
        Login.hoveredWorldIndex = 848889613;
        if (class476.worldSelectBackSprites != null) {
            final int n5 = 88;
            final int n6 = 19;
            int n7 = 765 / (n5 + 1) - 1;
            int n8 = 480 / (1 + n6);
            int n9;
            int n10;
            do {
                n9 = n8;
                n10 = n7;
                if (n8 * (n7 - 1) >= -734287707 * World.World_count) {
                    --n7;
                }
                if (n7 * (n8 - 1) >= -734287707 * World.World_count) {
                    --n8;
                }
                if ((n8 - 1) * n7 >= World.World_count * -734287707) {
                    --n8;
                }
            } while (n8 != n9 || n10 != n7);
            int n11 = (765 - n5 * n7) / (n7 + 1);
            if (n11 > 5) {
                n11 = 5;
            }
            int n12 = (480 - n8 * n6) / (n8 + 1);
            if (n12 > 5) {
                n12 = 5;
            }
            final int n13 = (765 - n5 * n7 - n11 * (n7 - 1)) / 2;
            final int n14 = (480 - n6 * n8 - n12 * (n8 - 1)) / 2;
            Login.worldSelectPagesCount = ((-734287707 * World.World_count + n8 - 1) / n8 - n7) * 1853447421;
            if (PlayerType.worldSelectLeftSprite != null && Login.worldSelectPage * 1246310743 > 0) {
                PlayerType.worldSelectLeftSprite.ax(8, class262.canvasHeight * 1658005443 / 2 - PlayerType.worldSelectLeftSprite.subWidth / 2);
            }
            if (class13.worldSelectRightSprite != null && 1246310743 * Login.worldSelectPage < Login.worldSelectPagesCount * 1959698517) {
                class13.worldSelectRightSprite.ax(GameEngine.canvasWidth * -1687260435 - class13.worldSelectRightSprite.yOffset - 8, 1658005443 * class262.canvasHeight / 2 - class13.worldSelectRightSprite.subWidth / 2);
            }
            int n15 = n14 + 23;
            int n16 = Login.xPadding * 578342931 + n13;
            int n17 = 0;
            boolean b = false;
            for (int n18 = 1246310743 * Login.worldSelectPage, n19 = n8 * n18; n19 < World.World_count * -734287707 && n18 - 1246310743 * Login.worldSelectPage < n7; ++n19) {
                final World world = class31.World_worlds[n19];
                boolean b2 = true;
                String s = Integer.toString(-1396846889 * world.population);
                if (-1 == -1396846889 * world.population) {
                    s = Strings.my;
                    b2 = false;
                }
                else if (world.population * -1396846889 > 1980) {
                    s = Strings.mk;
                    b2 = false;
                }
                class103 class103 = null;
                int n20 = 0;
                if (World.hu(world, 377560046)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1103 : class103.field1105);
                }
                else if (world.isDeadman(-1714005267)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1114 : class103.field1113);
                }
                else if (World.yk(world, (byte)65)) {
                    n20 = 16711680;
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1104 : class103.field1101);
                }
                else if (world.method404((byte)92)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1115 : class103.field1106);
                }
                else if (world.isPvp(985008834)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1102 : class103.field1110);
                }
                else if (world.method405(-459773999)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1107 : class103.field1109);
                }
                else if (world.method406((byte)40)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1112 : class103.field1111);
                }
                if (null == class103 || class103.field1099 * 1140778173 >= class476.worldSelectBackSprites.length) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1100 : class103.field1108);
                }
                if (MouseHandler.MouseHandler_x * -2063363905 >= n16 && MouseHandler.MouseHandler_y * -1224153235 >= n15 && -2063363905 * MouseHandler.MouseHandler_x < n16 + n5 && MouseHandler.MouseHandler_y * -1224153235 < n6 + n15 && b2) {
                    Login.hoveredWorldIndex = n19 * -848889613;
                    MusicTrack.mg(class476.worldSelectBackSprites[1140778173 * class103.field1099], n16, n15, 128, 16777215);
                    b = true;
                }
                else {
                    class476.worldSelectBackSprites[1140778173 * class103.field1099].ca(n16, n15);
                }
                if (null != class16.worldSelectFlagSprites) {
                    class16.worldSelectFlagSprites[(world.isMembersOnly(1029039210) ? 8 : 0) + world.location * -665846519].ax(n16 + 29, n15);
                }
                font.aj(Integer.toString(-2091224171 * world.id), 15 + n16, 5 + (n6 / 2 + n15), n20, -1);
                font2.aj(s, n16 + 60, 5 + (n6 / 2 + n15), 268435455, -1);
                n15 += n12 + n6;
                if (++n17 >= n8) {
                    n15 = 23 + n14;
                    n16 += n5 + n11;
                    n17 = 0;
                    ++n18;
                }
            }
            if (b) {
                final int n21 = font2.bf(class31.World_worlds[Login.hoveredWorldIndex * 248569915].activity) + 6;
                final int n22 = 8 + font2.al;
                int n23 = MouseHandler.MouseHandler_y * -1224153235 + 25;
                if (n22 + n23 > 480) {
                    n23 = -1224153235 * MouseHandler.MouseHandler_y - 25 - n22;
                }
                Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x * -2063363905 - n21 / 2, n23, n21, n22, 16777120);
                Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x * -2063363905 - n21 / 2, n23, n21, n22, 0);
                font2.aj(class31.World_worlds[Login.hoveredWorldIndex * 248569915].activity, -2063363905 * MouseHandler.MouseHandler_x, 4 + (font2.al + n23), 0, -1);
            }
        }
        RouteStrategy.rasterProvider.drawFull(0, 0, -414827702);
    }
    
    static void bo() {
        if (!class12.clearLoginScreen) {
            return;
        }
        Login.titleboxSprite = null;
        class292.titlebuttonSprite = null;
        class396.runesSprite = null;
        class123.leftTitleSprite = null;
        ParamComposition.rightTitleSprite = null;
        Canvas.logoSprite = null;
        class148.title_muteSprite = null;
        Login.options_buttons_0Sprite = null;
        class158.options_buttons_2Sprite = null;
        class476.worldSelectBackSprites = null;
        class16.worldSelectFlagSprites = null;
        DevicePcmPlayerProvider.worldSelectArrows = null;
        World.worldSelectStars = null;
        class319.field3030 = null;
        class121.field1184.method555(178269737);
        class297.musicPlayerStatus = -626822165;
        class297.musicTrackArchive = null;
        class379.musicTrackGroupId = 1643562499;
        VarpDefinition.musicTrackFileId = -1823837761;
        class100.musicTrackVolume = 0;
        class120.musicTrackBoolean = false;
        class162.pcmSampleLength = 440964570;
        class177.vmethod3380(true, 1900808216);
        class12.clearLoginScreen = false;
    }
    
    static void bp(final boolean b) {
        if (Client.ay(ScriptFrame.client, -2085004138) || ScriptFrame.client.method370((byte)63) || ScriptFrame.client.method369((byte)118)) {
            class129.method763(10, (byte)65);
            return;
        }
        Login.Login_response1 = Strings.ir;
        Login.Login_response2 = Strings.io;
        Login.Login_response3 = Strings.ip;
        class129.method763(2, (byte)111);
        if (b) {
            Login.Login_password = "";
        }
        WallDecoration.method1385(285951283);
        if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
            Login.currentLoginField = 942767128;
        }
        else {
            Login.currentLoginField = 0;
        }
    }
    
    static int ct() {
        return Login.loginIndex * 1145608355;
    }
    
    static void cc(final String login_response1, final String login_response2, final String login_response3) {
        Login.Login_response1 = login_response1;
        Login.Login_response2 = login_response2;
        Login.Login_response3 = login_response3;
    }
    
    static void bt(final GameEngine gameEngine, final Font font, final Font font2) {
        if (Login.worldSelectOpen) {
            class33.method151(gameEngine, 626811319);
            return;
        }
        if ((1 == -1222491879 * MouseHandler.MouseHandler_lastButton || (!class473.mouseCam && 4 == MouseHandler.MouseHandler_lastButton * -1222491879)) && 2020601481 * MouseHandler.MouseHandler_lastPressedX >= 765 + Login.xPadding * 578342931 - 50 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 453) {
            class20.clientPreferences.getTitleMusicDisabled(!ClientPreferences.ss(class20.clientPreferences, -1197954221), -527699713);
            if (!ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
                class478.method2438(class399.archive6, "scape main", "", 255, false, -1367518776);
            }
            else {
                FloorUnderlayDefinition.setHsl(-852125385);
            }
        }
        if (5 == -1275976559 * Client.gameState) {
            return;
        }
        if (-1L == Login.field734 * -7899453336143161787L) {
            Login.field734 = (class96.clockNow(1382877280) + 1000L) * -8298737133189264243L;
        }
        final long clockNow = class96.clockNow(1030185277);
        boolean b = false;
        Label_0289: {
            if (null == Client.archiveLoaders || Client.archiveLoadersDone * -397497277 >= Client.archiveLoaders.size()) {
                b = true;
            }
            else {
                while (-397497277 * Client.archiveLoadersDone < Client.archiveLoaders.size()) {
                    if (!Client.archiveLoaders.get(-397497277 * Client.archiveLoadersDone).isLoaded((byte)22)) {
                        b = false;
                        break Label_0289;
                    }
                    Client.archiveLoadersDone -= 1719009173;
                }
                b = true;
            }
        }
        if (b && -1L == Login.field759 * 6949275123175874863L) {
            Login.field759 = clockNow * -1178331881283680817L;
            if (Login.field759 * 6949275123175874863L > -7899453336143161787L * Login.field734) {
                Login.field734 = -606941742840038685L * Login.field759;
            }
        }
        if (10 != Client.gameState * -1275976559 && -1275976559 * Client.gameState != 11) {
            return;
        }
        if (ClanSettings.clientLanguage == Language.Language_EN) {
            if (-1222491879 * MouseHandler.MouseHandler_lastButton == 1 || (!class473.mouseCam && 4 == MouseHandler.MouseHandler_lastButton * -1222491879)) {
                final int n = 5 + 578342931 * Login.xPadding;
                final int n2 = 463;
                final int n3 = 100;
                final int n4 = 35;
                if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= n && 2020601481 * MouseHandler.MouseHandler_lastPressedX <= n + n3 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= n2 && MouseHandler.MouseHandler_lastPressedY * 1163896205 <= n2 + n4) {
                    method446(1638224605);
                    return;
                }
            }
            if (class11.World_request != null) {
                method446(1921396043);
            }
        }
        int n5 = -1222491879 * MouseHandler.MouseHandler_lastButton;
        int n6 = 2020601481 * MouseHandler.MouseHandler_lastPressedX;
        int n7 = MouseHandler.MouseHandler_lastPressedY * 1163896205;
        if (n5 == 0) {
            n6 = -2063363905 * MouseHandler.MouseHandler_x;
            n7 = MouseHandler.MouseHandler_y * -1224153235;
        }
        if (!class473.mouseCam && n5 == 4) {
            n5 = 1;
        }
        final class207 keyHandlerInstance = Client.keyHandlerInstance;
        if (0 == Login.loginIndex * 1145608355) {
            boolean b2 = false;
            while (class207.mt(keyHandlerInstance, 2048602787)) {
                if (84 == keyHandlerInstance.field1867 * 546317845) {
                    b2 = true;
                }
            }
            final int n8 = class143.loginBoxCenter * 950254081 - 80;
            final int n9 = 291;
            if (n5 && n6 >= n8 - 75 && n6 <= 75 + n8 && n7 >= n9 - 20 && n7 <= 20 + n9) {
                Ignored.compareTo_ignored(InvDefinition.method977("secure", true, 121384764) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte)(-14));
            }
            final int n10 = class143.loginBoxCenter * 950254081 + 80;
            if ((n5 && n6 >= n10 - 75 && n6 <= 75 + n10 && n7 >= n9 - 20 && n7 <= 20 + n9) || b2) {
                if ((-205173751 * Client.worldProperties & 0x2000000) != 0x0) {
                    Login.Login_response0 = "";
                    Login.Login_response1 = Strings.jo;
                    Login.Login_response2 = Strings.jk;
                    Login.Login_response3 = Strings.jq;
                    class129.method763(1, (byte)22);
                    if (Client.Login_isUsernameRemembered && null != Login.Login_username && Login.Login_username.length() > 0) {
                        Login.currentLoginField = 1153152795;
                    }
                    else {
                        Login.currentLoginField = 0;
                    }
                }
                else if ((-205173751 * Client.worldProperties & 0x4) != 0x0) {
                    if ((-205173751 * Client.worldProperties & 0x400) != 0x0) {
                        Login.Login_response1 = Strings.ji;
                        Login.Login_response2 = Strings.jg;
                        Login.Login_response3 = Strings.jx;
                    }
                    else {
                        Login.Login_response1 = Strings.ij;
                        Login.Login_response2 = Strings.id;
                        Login.Login_response3 = Strings.it;
                    }
                    Login.Login_response0 = Strings.im;
                    class129.method763(1, (byte)13);
                    if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                        Login.currentLoginField = 1153152795;
                    }
                    else {
                        Login.currentLoginField = 0;
                    }
                }
                else if ((Client.worldProperties * -205173751 & 0x400) != 0x0) {
                    Login.Login_response1 = Strings.ix;
                    Login.Login_response2 = Strings.ib;
                    Login.Login_response3 = Strings.jc;
                    Login.Login_response0 = Strings.im;
                    class129.method763(1, (byte)124);
                    if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                        Login.currentLoginField = 1153152795;
                    }
                    else {
                        Login.currentLoginField = 0;
                    }
                }
                else {
                    class6.method20(false, 1620071571);
                }
            }
        }
        else if (Login.loginIndex * 1145608355 == 1) {
            while (class207.mt(keyHandlerInstance, 564502633)) {
                if (546317845 * keyHandlerInstance.field1867 == 84) {
                    class6.method20(false, 1620071571);
                }
                else {
                    if (13 != 546317845 * keyHandlerInstance.field1867) {
                        continue;
                    }
                    class129.method763(0, (byte)72);
                }
            }
            final int n11 = class143.loginBoxCenter * 950254081 - 80;
            final int n12 = 321;
            if (n5 && n6 >= n11 - 75 && n6 <= 75 + n11 && n7 >= n12 - 20 && n7 <= n12 + 20) {
                class6.method20(false, 1620071571);
            }
            final int n13 = 950254081 * class143.loginBoxCenter + 80;
            if (n5 && n6 >= n13 - 75 && n6 <= 75 + n13 && n7 >= n12 - 20 && n7 <= 20 + n12) {
                class129.method763(0, (byte)76);
            }
        }
        else if (2 == 1145608355 * Login.loginIndex) {
            int n14 = 201;
            n14 += 52;
            if (n5 && n7 >= n14 - 12 && n7 < 2 + n14) {
                Login.currentLoginField = 0;
            }
            n14 += 15;
            if (n5 && n7 >= n14 - 12 && n7 < n14 + 2) {
                Login.currentLoginField = 1153152795;
            }
            n14 += 15;
            final int n15 = 361;
            if (null != class96.field1063) {
                final int n16 = class96.field1063.highX * 944313703 / 2;
                if (n5 && n6 >= class96.field1063.lowX * -844906645 - n16 && n6 <= -844906645 * class96.field1063.lowX + n16 && n7 >= n15 - 15 && n7 < n15) {
                    switch (-1733444455 * Login.field752) {
                        case 2: {
                            Ignored.compareTo_ignored("https://support.runescape.com/hc/en-gb", true, false, (byte)(-4));
                            break;
                        }
                        case 1: {
                            class205.method1137(Strings.lu, Strings.lk, Strings.lh, 1096620106);
                            class129.method763(5, (byte)12);
                            return;
                        }
                    }
                }
            }
            final int n17 = class143.loginBoxCenter * 950254081 - 80;
            final int n18 = 321;
            if (n5 && n6 >= n17 - 75 && n6 <= 75 + n17 && n7 >= n18 - 20 && n7 <= n18 + 20) {
                Login.Login_username = Login.Login_username.trim();
                if (Login.Login_username.length() == 0) {
                    class205.method1137(Strings.em, Strings.ew, Strings.ex, 1793607006);
                    return;
                }
                if (Login.Login_password.length() == 0) {
                    class205.method1137(Strings.eh, Strings.ek, Strings.ey, -921972791);
                    return;
                }
                class205.method1137(Strings.jm, Strings.jn, Strings.jd, 2094500781);
                class14.method53(false, -1402119231);
                class138.updateGameState(20, 1593466623);
            }
            else {
                final int n19 = 80 + (Login.loginBoxX * 678588245 + 180);
                if (n5 && n6 >= n19 - 75 && n6 <= n19 + 75 && n7 >= n18 - 20 && n7 <= 20 + n18) {
                    class129.method763(0, (byte)89);
                    Login.Login_username = "";
                    Login.Login_password = "";
                    class204.field1846 = 0;
                    Messages.otp = "";
                    Login.field751 = true;
                }
                final int n20 = -117 + 950254081 * class143.loginBoxCenter;
                final int n21 = 277;
                Login.field730 = (n6 >= n20 && n6 < n20 + ChatChannel.field817 * 1381277089 && n7 >= n21 && n7 < FloorUnderlayDefinition.field1642 * -1649414567 + n21);
                if (n5 == 1 && Login.field730) {
                    Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                    if (!Client.Login_isUsernameRemembered && class20.clientPreferences.getUsernameToRemember(-106358494) != null) {
                        class20.clientPreferences.setUsernameToRemember((String)null, -472730554);
                    }
                }
                final int n22 = 950254081 * class143.loginBoxCenter + 24;
                final int n23 = 277;
                Login.field740 = (n6 >= n22 && n6 < ChatChannel.field817 * 1381277089 + n22 && n7 >= n23 && n7 < n23 + FloorUnderlayDefinition.field1642 * -1649414567);
                if (n5 && Login.field740) {
                    class20.clientPreferences.setIsUsernameHidden(!ClientPreferences.ty(class20.clientPreferences, -2109246489), -1477676660);
                    if (!ClientPreferences.ty(class20.clientPreferences, -2071921565)) {
                        Login.Login_username = "";
                        class20.clientPreferences.setUsernameToRemember((String)null, -472730554);
                        if (Client.Login_isUsernameRemembered && null != Login.Login_username && Login.Login_username.length() > 0) {
                            Login.currentLoginField = 1153152795;
                        }
                        else {
                            Login.currentLoginField = 0;
                        }
                    }
                }
                while (class207.mt(keyHandlerInstance, 1201042051)) {
                    if (546317845 * keyHandlerInstance.field1867 == 13) {
                        class129.method763(0, (byte)84);
                        Login.Login_username = "";
                        Login.Login_password = "";
                        class204.field1846 = 0;
                        Messages.otp = "";
                        Login.field751 = true;
                    }
                    else if (-1232221421 * Login.currentLoginField == 0) {
                        final char field1866 = keyHandlerInstance.field1866;
                        for (int index = 0; index < Login.dw.length() && field1866 != Login.dw.charAt(index); ++index) {}
                        if (85 == 546317845 * keyHandlerInstance.field1867 && Login.Login_username.length() > 0) {
                            Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                        }
                        if (84 == 546317845 * keyHandlerInstance.field1867 || 546317845 * keyHandlerInstance.field1867 == 80) {
                            Login.currentLoginField = 1153152795;
                        }
                        if (Login.dw.indexOf(keyHandlerInstance.field1866) == -1 || Login.Login_username.length() >= 320) {
                            continue;
                        }
                        Login.Login_username += keyHandlerInstance.field1866;
                    }
                    else {
                        if (Login.currentLoginField * -1232221421 != 1) {
                            continue;
                        }
                        if (keyHandlerInstance.field1867 * 546317845 == 85 && Login.Login_password.length() > 0) {
                            Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                        }
                        else if (84 == 546317845 * keyHandlerInstance.field1867 || 80 == keyHandlerInstance.field1867 * 546317845) {
                            Login.currentLoginField = 0;
                            if (546317845 * keyHandlerInstance.field1867 == 84) {
                                Login.Login_username = Login.Login_username.trim();
                                if (Login.Login_username.length() == 0) {
                                    class205.method1137(Strings.em, Strings.ew, Strings.ex, 781417688);
                                    return;
                                }
                                if (Login.Login_password.length() == 0) {
                                    class205.method1137(Strings.eh, Strings.ek, Strings.ey, -96597523);
                                    return;
                                }
                                class205.method1137(Strings.jm, Strings.jn, Strings.jd, 889086809);
                                class14.method53(false, -1153125802);
                                class138.updateGameState(20, 1529673899);
                                return;
                            }
                        }
                        if ((keyHandlerInstance.getKeyPressed(82, 757413109) || keyHandlerInstance.getKeyPressed(87, -670460330)) && 67 == keyHandlerInstance.field1867 * 546317845) {
                            final Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(ScriptFrame.client);
                            final int a = 20 - Login.Login_password.length();
                            if (a <= 0) {
                                continue;
                            }
                            try {
                                final String s = (String)contents.getTransferData(DataFlavor.stringFlavor);
                                final int min = Math.min(a, s.length());
                                for (int i = 0; i < min; ++i) {
                                    if (!MouseHandler.method195(s.charAt(i), -24914154) || Login.dw.indexOf(s.charAt(i)) == -1) {
                                        class129.method763(3, (byte)27);
                                        return;
                                    }
                                }
                                Login.Login_password += s.substring(0, min);
                            }
                            catch (UnsupportedFlavorException ex) {}
                            catch (IOException ex2) {}
                        }
                        else {
                            if (!MouseHandler.method195(keyHandlerInstance.field1866, -1457621194)) {
                                continue;
                            }
                            if (Login.dw.indexOf(keyHandlerInstance.field1866) == -1 || Login.Login_password.length() >= 20) {
                                continue;
                            }
                            Login.Login_password += keyHandlerInstance.field1866;
                        }
                    }
                }
            }
        }
        else if (1145608355 * Login.loginIndex == 3) {
            final Bounds av = font.av(25, Strings.kh.length() - 34, Strings.kh, 180 + Login.loginBoxX * 678588245, 241);
            if (n5 && av.method2232(n6, n7, 917820097)) {
                Ignored.compareTo_ignored(Strings.ns, true, false, (byte)76);
            }
            final int n24 = 180 + Login.loginBoxX * 678588245;
            final int n25 = 276;
            if (n5 && n6 >= n24 - 75 && n6 <= n24 + 75 && n7 >= n25 - 20 && n7 <= 20 + n25) {
                method444(false, -725569743);
            }
            final int n26 = 180 + Login.loginBoxX * 678588245;
            final int n27 = 326;
            if (n5 && n6 >= n26 - 75 && n6 <= 75 + n26 && n7 >= n27 - 20 && n7 <= 20 + n27) {
                class205.method1137(Strings.lu, Strings.lk, Strings.lh, 944141381);
                class129.method763(5, (byte)73);
            }
        }
        else if (4 == 1145608355 * Login.loginIndex) {
            final int n28 = 180 + 678588245 * Login.loginBoxX - 80;
            final int n29 = 321;
            if (n5 && n6 >= n28 - 75 && n6 <= n28 + 75 && n7 >= n29 - 20 && n7 <= 20 + n29) {
                Messages.otp.trim();
                if (Messages.otp.length() != 6) {
                    class205.method1137(Strings.br, Strings.bg, Strings.bu, -1462243186);
                    return;
                }
                class204.field1846 = Integer.parseInt(Messages.otp) * -209153533;
                Messages.otp = "";
                class14.method53(true, -923618752);
                class205.method1137(Strings.jm, Strings.jn, Strings.jd, 1687361538);
                class138.updateGameState(20, 1014013577);
            }
            else {
                if (n5 && n6 >= 678588245 * Login.loginBoxX + 180 - 9 && n6 <= Login.loginBoxX * 678588245 + 180 + 130 && n7 >= 263 && n7 <= 296) {
                    Login.field751 = !Login.field751;
                }
                if (n5 && n6 >= Login.loginBoxX * 678588245 + 180 - 34 && n6 <= 180 + Login.loginBoxX * 678588245 + 34 && n7 >= 351 && n7 <= 363) {
                    Ignored.compareTo_ignored(InvDefinition.method977("secure", true, 1133567868) + "m=totp-authenticator/disableTOTPRequest", true, false, (byte)(-83));
                }
                final int n30 = 80 + (180 + Login.loginBoxX * 678588245);
                if (n5 && n6 >= n30 - 75 && n6 <= 75 + n30 && n7 >= n29 - 20 && n7 <= n29 + 20) {
                    class129.method763(0, (byte)35);
                    Login.Login_username = "";
                    Login.Login_password = "";
                    class204.field1846 = 0;
                    Messages.otp = "";
                }
                while (class207.mt(keyHandlerInstance, 533160035)) {
                    boolean b3 = false;
                    for (int j = 0; j < Login.dc.length(); ++j) {
                        if (keyHandlerInstance.field1866 == Login.dc.charAt(j)) {
                            b3 = true;
                            break;
                        }
                    }
                    if (keyHandlerInstance.field1867 * 546317845 == 13) {
                        class129.method763(0, (byte)110);
                        Login.Login_username = "";
                        Login.Login_password = "";
                        class204.field1846 = 0;
                        Messages.otp = "";
                    }
                    else {
                        if (85 == keyHandlerInstance.field1867 * 546317845 && Messages.otp.length() > 0) {
                            Messages.otp = Messages.otp.substring(0, Messages.otp.length() - 1);
                        }
                        if (keyHandlerInstance.field1867 * 546317845 == 84) {
                            Messages.otp.trim();
                            if (Messages.otp.length() != 6) {
                                class205.method1137(Strings.br, Strings.bg, Strings.bu, 1033163746);
                                return;
                            }
                            class204.field1846 = Integer.parseInt(Messages.otp) * -209153533;
                            Messages.otp = "";
                            class14.method53(true, -154936065);
                            class205.method1137(Strings.jm, Strings.jn, Strings.jd, -202888988);
                            class138.updateGameState(20, 439784642);
                        }
                        else {
                            if (!b3 || Messages.otp.length() >= 6) {
                                continue;
                            }
                            Messages.otp += keyHandlerInstance.field1866;
                        }
                    }
                }
            }
        }
        else if (5 == Login.loginIndex * 1145608355) {
            final int n31 = 180 + Login.loginBoxX * 678588245 - 80;
            final int n32 = 321;
            if (n5 && n6 >= n31 - 75 && n6 <= 75 + n31 && n7 >= n32 - 20 && n7 <= n32 + 20) {
                Login.Login_username = Login.Login_username.trim();
                if (Login.Login_username.length() == 0) {
                    class205.method1137(Strings.lu, Strings.lk, Strings.lh, -697183041);
                }
                else {
                    final long method1531 = class264.method1531((byte)(-85));
                    int n33;
                    if (method1531 == 0L) {
                        n33 = 5;
                    }
                    else {
                        final String login_username = Login.Login_username;
                        final Random random = new Random();
                        final Buffer buffer = new Buffer(128);
                        final Buffer buffer2 = new Buffer(128);
                        final int[] array = { random.nextInt(), random.nextInt(), (int)(method1531 >> 32), (int)method1531 };
                        buffer.writeShort(10, (byte)85);
                        for (int k = 0; k < 4; ++k) {
                            buffer.writeInt(random.nextInt(), -2081835031);
                        }
                        buffer.writeInt(array[0], -2081835031);
                        buffer.writeInt(array[1], -2081835031);
                        buffer.writeLong(method1531);
                        buffer.writeLong(0L);
                        for (int l = 0; l < 4; ++l) {
                            buffer.writeInt(random.nextInt(), -2081835031);
                        }
                        buffer.encryptRsa(class68.field717, class68.field716, -868711728);
                        buffer2.writeShort(10, (byte)63);
                        for (int n34 = 0; n34 < 3; ++n34) {
                            buffer2.writeInt(random.nextInt(), -2081835031);
                        }
                        buffer2.writeLong(random.nextLong());
                        Buffer.gj(buffer2, random.nextLong());
                        class383.method2086(buffer2, (byte)62);
                        buffer2.writeLong(random.nextLong());
                        buffer2.encryptRsa(class68.field717, class68.field716, 1022626266);
                        int stringCp1252NullTerminatedByteSize = DynamicObject.stringCp1252NullTerminatedByteSize(login_username, (byte)(-67));
                        if (stringCp1252NullTerminatedByteSize % 8 != 0) {
                            stringCp1252NullTerminatedByteSize += 8 - stringCp1252NullTerminatedByteSize % 8;
                        }
                        final Buffer buffer3 = new Buffer(stringCp1252NullTerminatedByteSize);
                        buffer3.writeStringCp1252NullCircumfixed(login_username, -1543090123);
                        buffer3.offset = stringCp1252NullTerminatedByteSize * -1516355947;
                        buffer3.xteaEncryptAll(array, -794961409);
                        final Buffer buffer4 = new Buffer(buffer3.offset * -1633313603 + (-1633313603 * buffer2.offset + (buffer.offset * -1633313603 + 5)));
                        buffer4.writeShort(2, (byte)55);
                        buffer4.writeShort(buffer.offset * -1633313603, (byte)16);
                        buffer4.writeBytes(buffer.array, 0, -1633313603 * buffer.offset, (byte)47);
                        buffer4.writeShort(-1633313603 * buffer2.offset, (byte)113);
                        buffer4.writeBytes(buffer2.array, 0, buffer2.offset * -1633313603, (byte)10);
                        buffer4.writeVarInt(-1633313603 * buffer3.offset, (byte)68);
                        buffer4.writeBytes(buffer3.array, 0, -1633313603 * buffer3.offset, (byte)14);
                        final String rsOrdinal = WorldMapSectionType.rsOrdinal(buffer4.array, 614137220);
                        int n35;
                        try {
                            final URLConnection openConnection = new URL(InvDefinition.method977("services", false, -422863982) + "m=accountappeal/login.ws").openConnection();
                            openConnection.setDoInput(true);
                            openConnection.setDoOutput(true);
                            openConnection.setConnectTimeout(5000);
                            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
                            outputStreamWriter.write("data2=" + class397.method2119(rsOrdinal, 1633633818) + "&dest=" + class397.method2119("passwordchoice.ws", 1843965463));
                            outputStreamWriter.flush();
                            final InputStream inputStream = openConnection.getInputStream();
                            final Buffer buffer5 = new Buffer(new byte[1000]);
                            while (true) {
                                final int read = inputStream.read(buffer5.array, -1633313603 * buffer5.offset, 1000 - buffer5.offset * -1633313603);
                                if (read == -1) {
                                    outputStreamWriter.close();
                                    inputStream.close();
                                    final String s2 = new String(buffer5.array);
                                    if (s2.startsWith("OFFLINE")) {
                                        n35 = 4;
                                        break;
                                    }
                                    if (s2.startsWith("WRONG")) {
                                        n35 = 7;
                                        break;
                                    }
                                    if (s2.startsWith("RELOAD")) {
                                        n35 = 3;
                                        break;
                                    }
                                    if (s2.startsWith("Not permitted for social network accounts.")) {
                                        n35 = 6;
                                        break;
                                    }
                                    Buffer.vn(buffer5, array, 2144718978);
                                    while (-1633313603 * buffer5.offset > 0 && buffer5.array[buffer5.offset * -1633313603 - 1] == 0) {
                                        final Buffer buffer6 = buffer5;
                                        buffer6.offset += 1516355947;
                                    }
                                    final String s3 = new String(buffer5.array, 0, buffer5.offset * -1633313603);
                                    if (AttackOption.method619(s3, (byte)(-44))) {
                                        Ignored.compareTo_ignored(s3, true, false, (byte)(-4));
                                        n35 = 2;
                                    }
                                    else {
                                        n35 = 5;
                                    }
                                    break;
                                }
                                else {
                                    final Buffer buffer7 = buffer5;
                                    buffer7.offset += -1516355947 * read;
                                    if (buffer5.offset * -1633313603 >= 1000) {
                                        n35 = 5;
                                        break;
                                    }
                                    continue;
                                }
                            }
                        }
                        catch (Throwable t) {
                            t.printStackTrace();
                            n35 = 5;
                        }
                        n33 = n35;
                    }
                    switch (n33) {
                        case 7: {
                            class205.method1137(Strings.lw, Strings.lr, Strings.mt, -1477733518);
                            break;
                        }
                        case 5: {
                            class205.method1137(Strings.lj, Strings.ll, Strings.le, 2119710044);
                            break;
                        }
                        case 3: {
                            class205.method1137(Strings.ln, Strings.lt, Strings.lz, 1974314056);
                            break;
                        }
                        case 2: {
                            class205.method1137(Strings.field3267, Strings.field3291, Strings.field3376, 1249079948);
                            class129.method763(6, (byte)42);
                            break;
                        }
                        case 6: {
                            class205.method1137(Strings.lb, Strings.lx, Strings.lo, 2089997413);
                            break;
                        }
                        case 4: {
                            class205.method1137(Strings.lc, Strings.ld, Strings.lq, -1609486189);
                            break;
                        }
                    }
                }
                return;
            }
            final int n36 = Login.loginBoxX * 678588245 + 180 + 80;
            if (n5 && n6 >= n36 - 75 && n6 <= 75 + n36 && n7 >= n32 - 20 && n7 <= 20 + n32) {
                class6.method20(true, 1620071571);
            }
            final int n37 = 361;
            if (class19.field60 != null) {
                final int n38 = 944313703 * class19.field60.highX / 2;
                if (n5 && n6 >= class19.field60.lowX * -844906645 - n38 && n6 <= n38 + -844906645 * class19.field60.lowX && n7 >= n37 - 15 && n7 < n37) {
                    Ignored.compareTo_ignored(InvDefinition.method977("secure", true, -995271799) + "m=weblogin/g=oldscape/cant_log_in", true, false, (byte)(-74));
                }
            }
            while (class207.mt(keyHandlerInstance, 519399291)) {
                boolean b4 = false;
                for (int index2 = 0; index2 < Login.dw.length(); ++index2) {
                    if (keyHandlerInstance.field1866 == Login.dw.charAt(index2)) {
                        b4 = true;
                        break;
                    }
                }
                if (546317845 * keyHandlerInstance.field1867 == 13) {
                    class6.method20(true, 1620071571);
                }
                else {
                    if (85 == 546317845 * keyHandlerInstance.field1867 && Login.Login_username.length() > 0) {
                        Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                    }
                    if (546317845 * keyHandlerInstance.field1867 == 84) {
                        Login.Login_username = Login.Login_username.trim();
                        if (Login.Login_username.length() == 0) {
                            class205.method1137(Strings.lu, Strings.lk, Strings.lh, 2087455358);
                        }
                        else {
                            final long method1532 = class264.method1531((byte)(-42));
                            int n39;
                            if (method1532 == 0L) {
                                n39 = 5;
                            }
                            else {
                                final String login_username2 = Login.Login_username;
                                final Random random2 = new Random();
                                final Buffer buffer8 = new Buffer(128);
                                final Buffer buffer9 = new Buffer(128);
                                final int[] array2 = { random2.nextInt(), random2.nextInt(), (int)(method1532 >> 32), (int)method1532 };
                                buffer8.writeShort(10, (byte)36);
                                for (int n40 = 0; n40 < 4; ++n40) {
                                    buffer8.writeInt(random2.nextInt(), -2081835031);
                                }
                                buffer8.writeInt(array2[0], -2081835031);
                                buffer8.writeInt(array2[1], -2081835031);
                                buffer8.writeLong(method1532);
                                buffer8.writeLong(0L);
                                for (int n41 = 0; n41 < 4; ++n41) {
                                    buffer8.writeInt(random2.nextInt(), -2081835031);
                                }
                                buffer8.encryptRsa(class68.field717, class68.field716, 2132196350);
                                buffer9.writeShort(10, (byte)107);
                                for (int n42 = 0; n42 < 3; ++n42) {
                                    buffer9.writeInt(random2.nextInt(), -2081835031);
                                }
                                buffer9.writeLong(random2.nextLong());
                                Buffer.gj(buffer9, random2.nextLong());
                                class383.method2086(buffer9, (byte)33);
                                buffer9.writeLong(random2.nextLong());
                                buffer9.encryptRsa(class68.field717, class68.field716, 653993895);
                                int stringCp1252NullTerminatedByteSize2 = DynamicObject.stringCp1252NullTerminatedByteSize(login_username2, (byte)108);
                                if (0 != stringCp1252NullTerminatedByteSize2 % 8) {
                                    stringCp1252NullTerminatedByteSize2 += 8 - stringCp1252NullTerminatedByteSize2 % 8;
                                }
                                final Buffer buffer10 = new Buffer(stringCp1252NullTerminatedByteSize2);
                                buffer10.writeStringCp1252NullCircumfixed(login_username2, -1701455335);
                                buffer10.offset = stringCp1252NullTerminatedByteSize2 * -1516355947;
                                buffer10.xteaEncryptAll(array2, -794961409);
                                final Buffer buffer11 = new Buffer(5 + buffer8.offset * -1633313603 + -1633313603 * buffer9.offset + -1633313603 * buffer10.offset);
                                buffer11.writeShort(2, (byte)60);
                                buffer11.writeShort(-1633313603 * buffer8.offset, (byte)78);
                                buffer11.writeBytes(buffer8.array, 0, buffer8.offset * -1633313603, (byte)91);
                                buffer11.writeShort(buffer9.offset * -1633313603, (byte)27);
                                buffer11.writeBytes(buffer9.array, 0, buffer9.offset * -1633313603, (byte)52);
                                buffer11.writeVarInt(buffer10.offset * -1633313603, (byte)88);
                                buffer11.writeBytes(buffer10.array, 0, buffer10.offset * -1633313603, (byte)121);
                                final String rsOrdinal2 = WorldMapSectionType.rsOrdinal(buffer11.array, -2033214614);
                                int n43;
                                try {
                                    final URLConnection openConnection2 = new URL(InvDefinition.method977("services", false, 837287715) + "m=accountappeal/login.ws").openConnection();
                                    openConnection2.setDoInput(true);
                                    openConnection2.setDoOutput(true);
                                    openConnection2.setConnectTimeout(5000);
                                    final OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(openConnection2.getOutputStream());
                                    outputStreamWriter2.write("data2=" + class397.method2119(rsOrdinal2, 1818779547) + "&dest=" + class397.method2119("passwordchoice.ws", 1793806890));
                                    outputStreamWriter2.flush();
                                    final InputStream inputStream2 = openConnection2.getInputStream();
                                    final Buffer buffer12 = new Buffer(new byte[1000]);
                                    while (true) {
                                        final int read2 = inputStream2.read(buffer12.array, buffer12.offset * -1633313603, 1000 - buffer12.offset * -1633313603);
                                        if (read2 == -1) {
                                            outputStreamWriter2.close();
                                            inputStream2.close();
                                            final String s4 = new String(buffer12.array);
                                            if (s4.startsWith("OFFLINE")) {
                                                n43 = 4;
                                                break;
                                            }
                                            if (s4.startsWith("WRONG")) {
                                                n43 = 7;
                                                break;
                                            }
                                            if (s4.startsWith("RELOAD")) {
                                                n43 = 3;
                                                break;
                                            }
                                            if (s4.startsWith("Not permitted for social network accounts.")) {
                                                n43 = 6;
                                                break;
                                            }
                                            Buffer.vn(buffer12, array2, 2012514407);
                                            while (buffer12.offset * -1633313603 > 0 && 0 == buffer12.array[buffer12.offset * -1633313603 - 1]) {
                                                final Buffer buffer13 = buffer12;
                                                buffer13.offset += 1516355947;
                                            }
                                            final String s5 = new String(buffer12.array, 0, buffer12.offset * -1633313603);
                                            if (AttackOption.method619(s5, (byte)(-15))) {
                                                Ignored.compareTo_ignored(s5, true, false, (byte)(-78));
                                                n43 = 2;
                                            }
                                            else {
                                                n43 = 5;
                                            }
                                            break;
                                        }
                                        else {
                                            final Buffer buffer14 = buffer12;
                                            buffer14.offset += -1516355947 * read2;
                                            if (buffer12.offset * -1633313603 >= 1000) {
                                                n43 = 5;
                                                break;
                                            }
                                            continue;
                                        }
                                    }
                                }
                                catch (Throwable t2) {
                                    t2.printStackTrace();
                                    n43 = 5;
                                }
                                n39 = n43;
                            }
                            switch (n39) {
                                case 6: {
                                    class205.method1137(Strings.lb, Strings.lx, Strings.lo, 1428235498);
                                    break;
                                }
                                case 3: {
                                    class205.method1137(Strings.ln, Strings.lt, Strings.lz, 386900304);
                                    break;
                                }
                                case 4: {
                                    class205.method1137(Strings.lc, Strings.ld, Strings.lq, 808963360);
                                    break;
                                }
                                case 2: {
                                    class205.method1137(Strings.field3267, Strings.field3291, Strings.field3376, 983204585);
                                    class129.method763(6, (byte)34);
                                    break;
                                }
                                case 5: {
                                    class205.method1137(Strings.lj, Strings.ll, Strings.le, -2041331046);
                                    break;
                                }
                                case 7: {
                                    class205.method1137(Strings.lw, Strings.lr, Strings.mt, 983935228);
                                    break;
                                }
                            }
                        }
                        return;
                    }
                    if (!b4 || Login.Login_username.length() >= 320) {
                        continue;
                    }
                    Login.Login_username += keyHandlerInstance.field1866;
                }
            }
        }
        else if (1145608355 * Login.loginIndex == 6) {
            while (class207.mt(keyHandlerInstance, 606392331)) {
                if (84 == 546317845 * keyHandlerInstance.field1867 || 546317845 * keyHandlerInstance.field1867 == 13) {
                    class6.method20(true, 1620071571);
                }
            }
            final int n44 = 321;
            if (n5 && n7 >= n44 - 20 && n7 <= 20 + n44) {
                class6.method20(true, 1620071571);
            }
        }
        else if (Login.loginIndex * 1145608355 == 7) {
            if (WorldMapSectionType.field2384 && !Client.onMobile) {
                final int n45 = class143.loginBoxCenter * 950254081 - 150;
                final int n46 = 40 + (n45 + 240 + 25);
                final int n47 = 231;
                final int n48 = 40 + n47;
                Label_6867: {
                    if (n5 && n6 >= n45 && n6 <= n46 && n7 >= n47 && n7 <= n48) {
                        int n49 = n45;
                        while (true) {
                            for (int n50 = 0; n50 < 8; ++n50) {
                                if (n6 <= n49 + 30) {
                                    final int n51 = n50;
                                    Login.field747 = n51 * 1670187551;
                                    break Label_6867;
                                }
                                n49 += 30;
                                n49 += ((n50 == 1 || 3 == n50) ? 20 : 5);
                            }
                            final int n51 = 0;
                            continue;
                        }
                    }
                }
                final int n52 = 678588245 * Login.loginBoxX + 180 - 80;
                final int n53 = 321;
                if (n5 && n6 >= n52 - 75 && n6 <= 75 + n52 && n7 >= n53 - 20 && n7 <= 20 + n53) {
                    boolean b5 = false;
                    Label_7183: {
                        Date date = null;
                        Label_7077: {
                            try {
                                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                simpleDateFormat.setLenient(false);
                                final StringBuilder sb = new StringBuilder();
                                final String[] field1867 = Login.field748;
                                while (true) {
                                    for (int n54 = 0; n54 < field1867.length; ++n54) {
                                        final String str = field1867[n54];
                                        if (str == null) {
                                            WorldMapRectangle.method1522("Date not valid.", "Please ensure all characters are populated.", "", -1063106865);
                                            final Date parse = null;
                                            date = parse;
                                            break Label_7077;
                                        }
                                        sb.append(str);
                                    }
                                    sb.append("12");
                                    final Date parse = simpleDateFormat.parse(sb.toString());
                                    continue;
                                }
                            }
                            catch (ParseException ex3) {
                                WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 487305841);
                                b5 = false;
                                break Label_7183;
                            }
                        }
                        if (date == null) {
                            b5 = false;
                        }
                        else {
                            final boolean method1533 = class81.method483(date, 1695409986);
                            if (!date.after(Varcs.clearTransient(2052817619))) {
                                WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1450190387);
                                b5 = false;
                            }
                            else {
                                if (!method1533) {
                                    ByteArrayPool.field3668 = 1974420353;
                                }
                                else {
                                    ByteArrayPool.field3668 = (int)(date.getTime() / 86400000L - 11745L) * -909067137;
                                }
                                b5 = true;
                            }
                        }
                    }
                    if (b5) {
                        class138.updateGameState(50, 1062685180);
                        return;
                    }
                }
                final int n55 = 80 + (Login.loginBoxX * 678588245 + 180);
                if (n5 && n6 >= n55 - 75 && n6 <= n55 + 75 && n7 >= n53 - 20 && n7 <= n53 + 20) {
                    Login.field748 = new String[8];
                    class6.method20(true, 1620071571);
                }
                while (class207.mt(keyHandlerInstance, 1783082111)) {
                    if (101 == 546317845 * keyHandlerInstance.field1867) {
                        Login.field748[Login.field747 * -1262226977] = null;
                    }
                    if (546317845 * keyHandlerInstance.field1867 == 85) {
                        if (null == Login.field748[-1262226977 * Login.field747] && -1262226977 * Login.field747 > 0) {
                            Login.field747 -= 1670187551;
                        }
                        Login.field748[Login.field747 * -1262226977] = null;
                    }
                    if (keyHandlerInstance.field1866 >= '0' && keyHandlerInstance.field1866 <= '9') {
                        Login.field748[-1262226977 * Login.field747] = "" + keyHandlerInstance.field1866;
                        if (-1262226977 * Login.field747 < 7) {
                            Login.field747 += 1670187551;
                        }
                    }
                    if (546317845 * keyHandlerInstance.field1867 == 84) {
                        boolean b6 = false;
                        Label_7715: {
                            Date date2 = null;
                            Label_7609: {
                                try {
                                    final SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                    simpleDateFormat2.setLenient(false);
                                    final StringBuilder sb2 = new StringBuilder();
                                    final String[] field1868 = Login.field748;
                                    while (true) {
                                        for (int n56 = 0; n56 < field1868.length; ++n56) {
                                            final String str2 = field1868[n56];
                                            if (str2 == null) {
                                                WorldMapRectangle.method1522("Date not valid.", "Please ensure all characters are populated.", "", -1176898571);
                                                final Date parse2 = null;
                                                date2 = parse2;
                                                break Label_7609;
                                            }
                                            sb2.append(str2);
                                        }
                                        sb2.append("12");
                                        final Date parse2 = simpleDateFormat2.parse(sb2.toString());
                                        continue;
                                    }
                                }
                                catch (ParseException ex4) {
                                    WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 93290825);
                                    b6 = false;
                                    break Label_7715;
                                }
                            }
                            if (date2 == null) {
                                b6 = false;
                            }
                            else {
                                final boolean method1534 = class81.method483(date2, 1981767525);
                                if (!date2.after(Varcs.clearTransient(2052817619))) {
                                    WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -34991922);
                                    b6 = false;
                                }
                                else {
                                    if (!method1534) {
                                        ByteArrayPool.field3668 = 1974420353;
                                    }
                                    else {
                                        ByteArrayPool.field3668 = (int)(date2.getTime() / 86400000L - 11745L) * -909067137;
                                    }
                                    b6 = true;
                                }
                            }
                        }
                        if (b6) {
                            class138.updateGameState(50, 1694607782);
                        }
                    }
                }
            }
            else {
                final int n57 = 678588245 * Login.loginBoxX + 180 - 80;
                final int n58 = 321;
                if (n5 && n6 >= n57 - 75 && n6 <= n57 + 75 && n7 >= n58 - 20 && n7 <= 20 + n58) {
                    Ignored.compareTo_ignored(InvDefinition.method977("secure", true, -1279630501) + "m=dob/set_dob.ws", true, false, (byte)(-20));
                    class205.method1137(Strings.ls, Strings.lf, Strings.li, 114457455);
                    class129.method763(6, (byte)97);
                    return;
                }
                final int n59 = 80 + (Login.loginBoxX * 678588245 + 180);
                if (n5 && n6 >= n59 - 75 && n6 <= n59 + 75 && n7 >= n58 - 20 && n7 <= n58 + 20) {
                    class6.method20(true, 1620071571);
                }
            }
        }
        else if (8 == 1145608355 * Login.loginIndex) {
            final int n60 = Login.loginBoxX * 678588245 + 180 - 80;
            final int n61 = 321;
            if (n5 && n6 >= n60 - 75 && n6 <= n60 + 75 && n7 >= n61 - 20 && n7 <= n61 + 20) {
                Ignored.compareTo_ignored("https://www.jagex.com/terms/privacy", true, false, (byte)20);
                class205.method1137(Strings.ls, Strings.lf, Strings.li, -1791929805);
                class129.method763(6, (byte)17);
                return;
            }
            final int n62 = 80 + (Login.loginBoxX * 678588245 + 180);
            if (n5 && n6 >= n62 - 75 && n6 <= n62 + 75 && n7 >= n61 - 20 && n7 <= n61 + 20) {
                class6.method20(true, 1620071571);
            }
        }
        else if (9 == 1145608355 * Login.loginIndex) {
            final int n63 = 180 + 678588245 * Login.loginBoxX;
            final int n64 = 311;
            if (84 == keyHandlerInstance.field1867 * 546317845 || keyHandlerInstance.field1867 * 546317845 == 13 || (n5 && n6 >= n63 - 75 && n6 <= 75 + n63 && n7 >= n64 - 20 && n7 <= n64 + 20)) {
                method444(false, -2032394184);
            }
        }
        else if (10 == Login.loginIndex * 1145608355) {
            final int n65 = Login.loginBoxX * 678588245 + 180;
            final int n66 = 209;
            if (546317845 * keyHandlerInstance.field1867 == 84 || (n5 && n6 >= n65 - 109 && n6 <= 109 + n65 && n7 >= n66 && n7 <= n66 + 68)) {
                class205.method1137(Strings.jm, Strings.jn, Strings.jd, -302102481);
                Client.field395 = class493.field4094;
                class14.method53(false, -1295416157);
                class138.updateGameState(20, 1134554066);
            }
        }
        else if (1145608355 * Login.loginIndex == 12) {
            final int n67 = class143.loginBoxCenter * 950254081;
            int n68 = 233;
            final Bounds av2 = font2.av(0, 30, Strings.ma, n67, n68);
            final Bounds av3 = font2.av(32, 32, Strings.ma, n67, n68);
            final Bounds av4 = font2.av(70, 34, Strings.ma, n67, n68);
            n68 += 17;
            final Bounds av5 = font2.av(0, 34, Strings.mp, n67, n68);
            if (n5 != 0) {
                if (av2.method2232(n6, n7, 917820097)) {
                    Ignored.compareTo_ignored("https://www.jagex.com/terms", true, false, (byte)(-33));
                }
                else if (av3.method2232(n6, n7, 917820097)) {
                    Ignored.compareTo_ignored("https://www.jagex.com/terms/privacy", true, false, (byte)(-98));
                }
                else if (av4.method2232(n6, n7, 917820097) || av5.method2232(n6, n7, 917820097)) {
                    Ignored.compareTo_ignored("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, (byte)37);
                }
            }
            final int n69 = class143.loginBoxCenter * 950254081 - 80;
            final int n70 = 311;
            if (n5 && n6 >= n69 - 75 && n6 <= n69 + 75 && n7 >= n70 - 20 && n7 <= n70 + 20) {
                ClientPreferences.kw(class20.clientPreferences, Client.param21 * 976454555, -1272005659);
                method444(true, -704095939);
            }
            final int n71 = class143.loginBoxCenter * 950254081 + 80;
            if (n5 && n6 >= n71 - 75 && n6 <= 75 + n71 && n7 >= n70 - 20 && n7 <= n70 + 20) {
                Login.loginIndex = 127737743;
            }
        }
        else if (1145608355 * Login.loginIndex == 13) {
            final int n72 = class143.loginBoxCenter * 950254081;
            final int n73 = 321;
            if (n5 && n6 >= n72 - 75 && n6 <= 75 + n72 && n7 >= n73 - 20 && n7 <= n73 + 20) {
                method444(true, -1397639920);
            }
        }
        else if (1145608355 * Login.loginIndex == 14) {
            String s6 = "";
            switch (-1478945003 * Login.field738) {
                case 1: {
                    s6 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                }
                case 2: {
                    s6 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                }
                default: {
                    class6.method20(false, 1620071571);
                    break;
                }
                case 0: {
                    s6 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                }
            }
            final int n74 = 678588245 * Login.loginBoxX + 180;
            final int n75 = 276;
            if (n5 && n6 >= n74 - 75 && n6 <= 75 + n74 && n7 >= n75 - 20 && n7 <= n75 + 20) {
                Ignored.compareTo_ignored(s6, true, false, (byte)(-2));
                class205.method1137(Strings.ls, Strings.lf, Strings.li, -1463010180);
                class129.method763(6, (byte)60);
                return;
            }
            final int n76 = Login.loginBoxX * 678588245 + 180;
            final int n77 = 326;
            if (n5 && n6 >= n76 - 75 && n6 <= n76 + 75 && n7 >= n77 - 20 && n7 <= n77 + 20) {
                class6.method20(false, 1620071571);
            }
        }
        else if (24 == Login.loginIndex * 1145608355) {
            final int n78 = Login.loginBoxX * 678588245 + 180;
            final int n79 = 301;
            if (n5 && n6 >= n78 - 75 && n6 <= n78 + 75 && n7 >= n79 - 20 && n7 <= n79 + 20) {
                method444(false, -599553055);
            }
        }
        else if (32 == Login.loginIndex * 1145608355) {
            final int n80 = 180 + 678588245 * Login.loginBoxX - 80;
            final int n81 = 321;
            if (n5 && n6 >= n80 - 75 && n6 <= n80 + 75 && n7 >= n81 - 20 && n7 <= n81 + 20) {
                Ignored.compareTo_ignored(InvDefinition.method977("secure", true, 1410499303) + "m=dob/set_dob.ws", true, false, (byte)(-6));
                class205.method1137(Strings.ls, Strings.lf, Strings.li, 1634492090);
                class129.method763(6, (byte)6);
                return;
            }
            final int n82 = 80 + (180 + Login.loginBoxX * 678588245);
            if (n5 && n6 >= n82 - 75 && n6 <= 75 + n82 && n7 >= n81 - 20 && n7 <= n81 + 20) {
                class6.method20(true, 1620071571);
            }
        }
        else if (1145608355 * Login.loginIndex == 33) {
            final int n83 = 180 + Login.loginBoxX * 678588245;
            final int n84 = 276;
            if (n5 && n6 >= n83 - 75 && n6 <= 75 + n83 && n7 >= n84 - 20 && n7 <= 20 + n84) {
                Ignored.compareTo_ignored(Strings.ns, true, false, (byte)55);
            }
            final int n85 = 180 + 678588245 * Login.loginBoxX;
            final int n86 = 326;
            if (n5 && n6 >= n85 - 75 && n6 <= 75 + n85 && n7 >= n86 - 20 && n7 <= n86 + 20) {
                class6.method20(true, 1620071571);
            }
        }
    }
    
    static void bc(final boolean b) {
        if (!Client.ay(ScriptFrame.client, 608114636) && !ScriptFrame.client.method370((byte)56) && !ScriptFrame.client.method369((byte)63)) {
            Login.Login_response1 = Strings.ir;
            Login.Login_response2 = Strings.io;
            Login.Login_response3 = Strings.ip;
            class129.method763(2, (byte)22);
            if (b) {
                Login.Login_password = "";
            }
            WallDecoration.method1385(285951283);
            if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                Login.currentLoginField = 303058634;
            }
            else {
                Login.currentLoginField = 0;
            }
            return;
        }
        class129.method763(10, (byte)37);
    }
    
    static boolean br(final Date date) {
        final Calendar instance = Calendar.getInstance();
        instance.set(1, instance.get(1) - 13);
        instance.set(5, instance.get(5) + 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return date.before(instance.getTime());
    }
    
    static void ci(final boolean b) {
        int n = 0;
        if (!class134.method779((byte)124)) {
            n = 12;
        }
        else if (Client.ay(ScriptFrame.client, -507835983) || ScriptFrame.client.method370((byte)(-54)) || ScriptFrame.client.method369((byte)36)) {
            n = 10;
        }
        class129.method763(n, (byte)69);
        if (b) {
            Login.Login_username = "";
            Login.Login_password = "";
            class204.field1846 = 0;
            Messages.otp = "";
        }
        WallDecoration.method1385(285951283);
        if (Client.Login_isUsernameRemembered && null != Login.Login_username && Login.Login_username.length() > 0) {
            Login.currentLoginField = 1153152795;
        }
        else {
            Login.currentLoginField = 0;
        }
    }
    
    static void cu(final Font font, final Font font2) {
        if (null == class476.worldSelectBackSprites) {
            final Archive archive8 = class452.archive8;
            SpritePixels[] method699;
            if (!AbstractArchive.sh(archive8, "sl_back", "", -1313069490)) {
                method699 = null;
            }
            else {
                final int fileFlat = AbstractArchive.getFileFlat(archive8, "sl_back", 1202575537);
                method699 = UserComparator3.method699(archive8, fileFlat, archive8.getFileId(fileFlat, "", (short)8192), 1271520368);
            }
            class476.worldSelectBackSprites = method699;
        }
        if (null == class16.worldSelectFlagSprites) {
            class16.worldSelectFlagSprites = class314.method1708(class452.archive8, "sl_flags", "", -279417741);
        }
        if (DevicePcmPlayerProvider.worldSelectArrows == null) {
            DevicePcmPlayerProvider.worldSelectArrows = class314.method1708(class452.archive8, "sl_arrows", "", 1035149542);
        }
        if (World.worldSelectStars == null) {
            World.worldSelectStars = class314.method1708(class452.archive8, "sl_stars", "", 426093958);
        }
        if (PlayerType.worldSelectLeftSprite == null) {
            PlayerType.worldSelectLeftSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "leftarrow", "", 2002591934);
        }
        if (class13.worldSelectRightSprite == null) {
            class13.worldSelectRightSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "rightarrow", "", 185430511);
        }
        Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 578342931, 23, 765, 480, 0);
        Rasterizer2D.Rasterizer2D_fillRectangleGradient(578342931 * Login.xPadding, 0, 125, 23, 12425273, 286493056);
        Rasterizer2D.Rasterizer2D_fillRectangleGradient(125 + Login.xPadding * 578342931, 0, 640, 23, -1922468603, -1216518257);
        font.aj(Strings.mo, Login.xPadding * 578342931 - 337337044, 15, 0, -1);
        if (null != World.worldSelectStars) {
            World.worldSelectStars[1].ax(Login.xPadding * 578342931 - 716994558, 1);
            class492.xb(font2, Strings.mn, 578342931 * Login.xPadding - 360662410, 10, 16777215, -1);
            World.worldSelectStars[0].ax(Login.xPadding * -2081835031 + 1017700558, 12);
            class492.xb(font2, Strings.mi, 152 + Login.xPadding * 1052931522, 21, 1140967937, -1);
        }
        if (DevicePcmPlayerProvider.worldSelectArrows != null) {
            final int n = 1907234547 * Login.xPadding + 2060641697;
            if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n, 4);
            }
            if (World.World_sortOption1[0] == 0 && 1 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n + 15, 4);
            }
            class492.xb(font, Strings.md, 32 + n, 17, 952454998, -1);
            final int n2 = Login.xPadding * 2007751715 - 2012548180;
            if (1 == World.World_sortOption1[0] && 0 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n2, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n2, 4);
            }
            if (World.World_sortOption1[0] == 1 && 1 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n2, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n2 + 15, 4);
            }
            class492.xb(font, Strings.mr, 32 + n2, 17, 1923434275, -1);
            final int n3 = Login.xPadding * 578342931 + 1653622916;
            if (2 == World.World_sortOption1[0] && 0 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n3, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n3, 4);
            }
            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(n3 + 15, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(15 + n3, 4);
            }
            class492.xb(font, Strings.ml, 32 + n3, 17, 16777215, -1);
            final int n4 = Login.xPadding * 361600787 + 610;
            if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n4, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n4, 4);
            }
            if (3 == World.World_sortOption1[0] && 1 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n4, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n4 + 15, 4);
            }
            class492.xb(font, Strings.mf, n4 - 748955668, 17, 16777215, -1);
        }
        Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 578342931 + 708, 4, 50, 16, 0);
        font2.aj(Strings.jl, 25 + (1100787508 + Login.xPadding * -537281047), 16, 587066490, -1);
        Login.hoveredWorldIndex = 848889613;
        if (class476.worldSelectBackSprites != null) {
            final int n5 = 1900799205;
            final int n6 = 19;
            int n7 = 765 / (n5 + 1) - 1;
            int n8 = 480 / (1 + n6);
            int n9;
            int n10;
            do {
                n9 = n8;
                n10 = n7;
                if (n8 * (n7 - 1) >= -734287707 * World.World_count) {
                    --n7;
                }
                if (n7 * (n8 - 1) >= -1155873404 * World.World_count) {
                    --n8;
                }
                if ((n8 - 1) * n7 >= World.World_count * 1231131343) {
                    --n8;
                }
            } while (n8 != n9 || n10 != n7);
            int n11 = (-105740967 - n5 * n7) / (n7 + 1);
            if (n11 > 5) {
                n11 = 5;
            }
            int n12 = (480 - n8 * n6) / (n8 + 1);
            if (n12 > 5) {
                n12 = 5;
            }
            final int n13 = (765 - n5 * n7 - n11 * (n7 - 1)) / 2;
            final int n14 = (708512367 - n6 * n8 - n12 * (n8 - 1)) / 2;
            Login.worldSelectPagesCount = ((-734287707 * World.World_count + n8 - 1) / n8 - n7) * -343958170;
            if (PlayerType.worldSelectLeftSprite != null && Login.worldSelectPage * 1246310743 > 0) {
                PlayerType.worldSelectLeftSprite.ax(8, class262.canvasHeight * 909390997 / 2 - PlayerType.worldSelectLeftSprite.subWidth / 2);
            }
            if (class13.worldSelectRightSprite != null && 1246310743 * Login.worldSelectPage < Login.worldSelectPagesCount * 1959698517) {
                class13.worldSelectRightSprite.ax(GameEngine.canvasWidth * -1687260435 - class13.worldSelectRightSprite.yOffset - 8, 1073839265 * class262.canvasHeight / 2 - class13.worldSelectRightSprite.subWidth / 2);
            }
            int n15 = n14 + 23;
            int n16 = Login.xPadding * -619021846 + n13;
            int n17 = 0;
            boolean b = false;
            for (int n18 = 2018650959 * Login.worldSelectPage, n19 = n8 * n18; n19 < World.World_count * 380405036 && n18 - 547865210 * Login.worldSelectPage < n7; ++n19) {
                final World world = class31.World_worlds[n19];
                boolean b2 = true;
                String s = Integer.toString(-1395987784 * world.population);
                if (-1 == -491318259 * world.population) {
                    s = Strings.my;
                    b2 = false;
                }
                else if (world.population * -1396846889 > 1116634887) {
                    s = Strings.mk;
                    b2 = false;
                }
                class103 class103 = null;
                int n20 = 0;
                if (World.hu(world, -1791532619)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1103 : class103.field1105);
                }
                else if (world.isDeadman(1752228050)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1114 : class103.field1113);
                }
                else if (World.yk(world, (byte)37)) {
                    n20 = 220778745;
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1104 : class103.field1101);
                }
                else if (world.method404((byte)123)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1115 : class103.field1106);
                }
                else if (world.isPvp(-34995575)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1102 : class103.field1110);
                }
                else if (world.method405(-459773999)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1107 : class103.field1109);
                }
                else if (world.method406((byte)89)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1112 : class103.field1111);
                }
                if (null == class103 || class103.field1099 * 1140778173 >= class476.worldSelectBackSprites.length) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1100 : class103.field1108);
                }
                if (MouseHandler.MouseHandler_x * -2063363905 >= n16 && MouseHandler.MouseHandler_y * -251044507 >= n15 && 1154823788 * MouseHandler.MouseHandler_x < n16 + n5 && MouseHandler.MouseHandler_y * -65975793 < n6 + n15 && b2) {
                    Login.hoveredWorldIndex = n19 * 1676085461;
                    MusicTrack.mg(class476.worldSelectBackSprites[-804515689 * class103.field1099], n16, n15, 128, 723968824);
                    b = true;
                }
                else {
                    class476.worldSelectBackSprites[-2144390373 * class103.field1099].ca(n16, n15);
                }
                if (null != class16.worldSelectFlagSprites) {
                    class16.worldSelectFlagSprites[(world.isMembersOnly(1029039210) ? 8 : 0) + world.location * -665846519].ax(n16 + 29, n15);
                }
                font.aj(Integer.toString(-2091224171 * world.id), 15 + n16, 5 + (n6 / 2 + n15), n20, -1);
                font2.aj(s, n16 - 1326120003, 5 + (n6 / 2 + n15), -784729667, -1);
                n15 += n12 + n6;
                if (++n17 >= n8) {
                    n15 = 23 + n14;
                    n16 += n5 + n11;
                    n17 = 0;
                    ++n18;
                }
            }
            if (b) {
                final int n21 = font2.bf(class31.World_worlds[Login.hoveredWorldIndex * 4549911].activity) + 6;
                final int n22 = 8 + font2.al;
                int n23 = MouseHandler.MouseHandler_y * -1224153235 + 25;
                if (n22 + n23 > 1938591762) {
                    n23 = 764151040 * MouseHandler.MouseHandler_y - 25 - n22;
                }
                Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x * -1644950451 - n21 / 2, n23, n21, n22, 16777120);
                Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x * -1339725976 - n21 / 2, n23, n21, n22, 0);
                font2.aj(class31.World_worlds[Login.hoveredWorldIndex * 248569915].activity, -336121356 * MouseHandler.MouseHandler_x, 4 + (font2.al + n23), 0, -1);
            }
        }
        RouteStrategy.rasterProvider.drawFull(0, 0, -722103803);
    }
    
    static void cx() {
        if (Players.loadWorlds(-2107181415)) {
            Login.worldSelectOpen = true;
            Login.worldSelectPage = 0;
            Login.worldSelectPagesCount = 0;
        }
    }
    
    static void bq(final String s, final String s2, final String s3) {
        class129.method763(7, (byte)11);
        class205.method1137(s, s2, s3, -1852689316);
    }
    
    static final void FriendSystem_invalidateIgnoreds(final int n) {
        try {
            class124.method742((byte)49);
            if (null != UserComparator5.friendsChat) {
                if (n != -681433942) {
                    throw new IllegalStateException();
                }
                UserComparator5.friendsChat.invalidateIgnoreds((byte)21);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cz.nd(" + ')');
        }
    }
    
    static void bh(final boolean b) {
        int n = 0;
        if (!class134.method779((byte)70)) {
            n = 12;
        }
        else if (Client.ay(ScriptFrame.client, -181480941) || ScriptFrame.client.method370((byte)36) || ScriptFrame.client.method369((byte)17)) {
            n = 10;
        }
        class129.method763(n, (byte)17);
        if (b) {
            Login.Login_username = "";
            Login.Login_password = "";
            class204.field1846 = 0;
            Messages.otp = "";
        }
        WallDecoration.method1385(285951283);
        if (Client.Login_isUsernameRemembered && null != Login.Login_username && Login.Login_username.length() > 0) {
            Login.currentLoginField = 1153152795;
        }
        else {
            Login.currentLoginField = 0;
        }
    }
    
    static void by(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final boolean b, final int n) {
        if (class12.clearLoginScreen) {
            if (n == 4) {
                class129.method763(4, (byte)94);
            }
            return;
        }
        if (0 == n) {
            method444(b, -893575888);
        }
        else {
            class129.method763(n, (byte)49);
        }
        Rasterizer2D.Rasterizer2D_clear();
        class123.leftTitleSprite = Strings.method1853(AbstractArchive.ui(abstractArchive, "title.jpg", "", 1648560407), -1086782008);
        ParamComposition.rightTitleSprite = class123.leftTitleSprite.mirrorHorizontally();
        final int n2 = Client.worldProperties * 1305057418;
        if ((n2 & 0x20000000) != 0x0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_deadman_mode", "", -1475826763);
        }
        else if (0x0 != (n2 & 0x1FB0208A)) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_seasonal_mode", "", 1148103672);
        }
        else if ((n2 & 0x100) != 0x0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_speedrunning", "", -1154513528);
        }
        else {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo", "", 2100501954);
        }
        Login.titleboxSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebox", "", 1334433618);
        class292.titlebuttonSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton", "", -782581809);
        class439.field3828 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_large", "", -783550007);
        class376.field3605 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "play_now_text", "", 65741066);
        MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_wide42,1", "", -1604800626);
        class396.runesSprite = class314.method1708(abstractArchive2, "runes", "", 255591156);
        class148.title_muteSprite = class314.method1708(abstractArchive2, "title_mute", "", -69155453);
        Login.options_buttons_0Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,0", "", 636902126);
        Login.field733 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,4", "", -2021573956);
        class158.options_buttons_2Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,2", "", 1455131031);
        Login.field745 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,6", "", 344406899);
        ChatChannel.field817 = 283565164 * Login.options_buttons_0Sprite.yOffset;
        FloorUnderlayDefinition.field1642 = Login.options_buttons_0Sprite.subWidth * -198312517;
        class121.field1184 = new LoginScreenAnimation(class396.runesSprite);
        if (b) {
            Login.Login_username = "";
            Login.Login_password = "";
            Login.field748 = new String[8];
            Login.field747 = 0;
        }
        class204.field1846 = 0;
        Messages.otp = "";
        Login.field751 = true;
        Login.worldSelectOpen = false;
        if (!ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
            class282.method1592(2, class399.archive6, "scape main", "", -898469572, false, -900816422);
        }
        else {
            class297.musicPlayerStatus = 753439329;
            class297.musicTrackArchive = null;
            class379.musicTrackGroupId = 1765650665;
            VarpDefinition.musicTrackFileId = -1416086058;
            class100.musicTrackVolume = 0;
            class120.musicTrackBoolean = false;
            class162.pcmSampleLength = -75077999;
        }
        class177.vmethod3380(false, 2108475801);
        class12.clearLoginScreen = true;
        Login.xPadding = 983792155 * ((GameEngine.canvasWidth * -1567095619 - 765) / 2);
        Login.loginBoxX = 1529095227 * Login.xPadding - 152538118;
        class143.loginBoxCenter = -1036961612 + Login.loginBoxX * -949768875;
        class123.leftTitleSprite.ca(578342931 * Login.xPadding, 0);
        ParamComposition.rightTitleSprite.ca(382 + Login.xPadding * 578342931, 0);
        Canvas.logoSprite.ax(-1508518127 + Login.xPadding * 578342931 - Canvas.logoSprite.yOffset / 2, 18);
    }
    
    static void bx() {
        if (null != Login.Login_username && Login.Login_username.length() > 0) {
            return;
        }
        if (class20.clientPreferences.getUsernameToRemember(-1677347874) != null) {
            Login.Login_username = class20.clientPreferences.getUsernameToRemember(-1422673528);
            Client.Login_isUsernameRemembered = true;
        }
        else {
            Client.Login_isUsernameRemembered = false;
        }
    }
    
    static void method446(final int n) {
        try {
            if (Players.loadWorlds(-1943998514)) {
                if (n <= 1308045518) {
                    throw new IllegalStateException();
                }
                Login.worldSelectOpen = true;
                Client.tn(-1);
                Login.worldSelectPage = 0;
                Login.worldSelectPagesCount = 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cz.ar(" + ')');
        }
    }
    
    static void ap(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final boolean b, final int n) {
        if (class12.clearLoginScreen) {
            if (n == 4) {
                class129.method763(4, (byte)112);
            }
            return;
        }
        if (0 == n) {
            method444(b, -900013585);
        }
        else {
            class129.method763(n, (byte)26);
        }
        Rasterizer2D.Rasterizer2D_clear();
        class123.leftTitleSprite = Strings.method1853(AbstractArchive.ui(abstractArchive, "title.jpg", "", 1648560407), -1619842141);
        ParamComposition.rightTitleSprite = class123.leftTitleSprite.mirrorHorizontally();
        final int n2 = Client.worldProperties * -205173751;
        if ((n2 & 0x20000000) != 0x0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_deadman_mode", "", 1407355937);
        }
        else if (0x0 != (n2 & 0x40000000)) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_seasonal_mode", "", -2124798795);
        }
        else if ((n2 & 0x100) != 0x0) {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_speedrunning", "", 142419255);
        }
        else {
            Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo", "", 2053041083);
        }
        Login.titleboxSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebox", "", -70411579);
        class292.titlebuttonSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton", "", 1438924039);
        class439.field3828 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_large", "", -2096046208);
        class376.field3605 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "play_now_text", "", 1433051818);
        MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_wide42,1", "", -2003155908);
        class396.runesSprite = class314.method1708(abstractArchive2, "runes", "", -1666873525);
        class148.title_muteSprite = class314.method1708(abstractArchive2, "title_mute", "", 610613807);
        Login.options_buttons_0Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,0", "", 1097632830);
        Login.field733 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,4", "", -1361864452);
        class158.options_buttons_2Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,2", "", 1786150521);
        Login.field745 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,6", "", -834384119);
        ChatChannel.field817 = 1622050401 * Login.options_buttons_0Sprite.yOffset;
        FloorUnderlayDefinition.field1642 = Login.options_buttons_0Sprite.subWidth * 905476585;
        class121.field1184 = new LoginScreenAnimation(class396.runesSprite);
        if (b) {
            Login.Login_username = "";
            Login.Login_password = "";
            Login.field748 = new String[8];
            Login.field747 = 0;
        }
        class204.field1846 = 0;
        Messages.otp = "";
        Login.field751 = true;
        Login.worldSelectOpen = false;
        if (!ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
            class282.method1592(2, class399.archive6, "scape main", "", 255, false, 1631405801);
        }
        else {
            class297.musicPlayerStatus = -626822165;
            class297.musicTrackArchive = null;
            class379.musicTrackGroupId = 1643562499;
            VarpDefinition.musicTrackFileId = -1823837761;
            class100.musicTrackVolume = 0;
            class120.musicTrackBoolean = false;
            class162.pcmSampleLength = 440964570;
        }
        class177.vmethod3380(false, 1515392571);
        class12.clearLoginScreen = true;
        Login.xPadding = 983792155 * ((GameEngine.canvasWidth * -1687260435 - 765) / 2);
        Login.loginBoxX = 794898887 * Login.xPadding + 2036160930;
        class143.loginBoxCenter = -1036961612 + Login.loginBoxX * -949768875;
        class123.leftTitleSprite.ca(578342931 * Login.xPadding, 0);
        ParamComposition.rightTitleSprite.ca(382 + Login.xPadding * 578342931, 0);
        Canvas.logoSprite.ax(382 + Login.xPadding * 578342931 - Canvas.logoSprite.yOffset / 2, 18);
    }
    
    static void bd(final GameEngine gameEngine, final Font font, final Font font2) {
        if (Login.worldSelectOpen) {
            class33.method151(gameEngine, 626811319);
            return;
        }
        if ((1 == -658155700 * MouseHandler.MouseHandler_lastButton || (!class473.mouseCam && 4 == MouseHandler.MouseHandler_lastButton * -1222491879)) && 753612543 * MouseHandler.MouseHandler_lastPressedX >= 765 + Login.xPadding * 578342931 - 1426081774 && -1258301149 * MouseHandler.MouseHandler_lastPressedY >= 453) {
            class20.clientPreferences.getTitleMusicDisabled(!ClientPreferences.ss(class20.clientPreferences, -1197954221), -527699713);
            if (!ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
                class478.method2438(class399.archive6, "scape main", "", -1794782687, false, -402388608);
            }
            else {
                FloorUnderlayDefinition.setHsl(-852125385);
            }
        }
        if (5 == -1275976559 * Client.gameState) {
            return;
        }
        if (-1L == Login.field734 * -7899453336143161787L) {
            Login.field734 = (class96.clockNow(-120223662) + 1000L) * -8298737133189264243L;
        }
        final long clockNow = class96.clockNow(1996806841);
        boolean b = false;
        Label_0290: {
            if (null == Client.archiveLoaders || Client.archiveLoadersDone * -397497277 >= Client.archiveLoaders.size()) {
                b = true;
            }
            else {
                while (-397497277 * Client.archiveLoadersDone < Client.archiveLoaders.size()) {
                    if (!Client.archiveLoaders.get(2003666560 * Client.archiveLoadersDone).isLoaded((byte)66)) {
                        b = false;
                        break Label_0290;
                    }
                    Client.archiveLoadersDone -= 1719009173;
                }
                b = true;
            }
        }
        if (b && -1L == Login.field759 * 6949275123175874863L) {
            Login.field759 = clockNow * -1178331881283680817L;
            if (Login.field759 * 6949275123175874863L > -7899453336143161787L * Login.field734) {
                Login.field734 = -606941742840038685L * Login.field759;
            }
        }
        if (10 != Client.gameState * 398429991 && -207655811 * Client.gameState != 11) {
            return;
        }
        if (ClanSettings.clientLanguage == Language.Language_EN) {
            if (-144495156 * MouseHandler.MouseHandler_lastButton == 1 || (!class473.mouseCam && 4 == MouseHandler.MouseHandler_lastButton * 96239360)) {
                final int n = 5 + -589688436 * Login.xPadding;
                final int n2 = -85753344;
                final int n3 = -629678956;
                final int n4 = 35;
                if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= n && 389922923 * MouseHandler.MouseHandler_lastPressedX <= n + n3 && MouseHandler.MouseHandler_lastPressedY * -1078736439 >= n2 && MouseHandler.MouseHandler_lastPressedY * 902625893 <= n2 + n4) {
                    method446(2070831525);
                    return;
                }
            }
            if (class11.World_request != null) {
                method446(2143752998);
            }
        }
        int n5 = -1222491879 * MouseHandler.MouseHandler_lastButton;
        int n6 = 2020601481 * MouseHandler.MouseHandler_lastPressedX;
        int n7 = MouseHandler.MouseHandler_lastPressedY * 1163896205;
        if (n5 == 0) {
            n6 = -121995219 * MouseHandler.MouseHandler_x;
            n7 = MouseHandler.MouseHandler_y * -1224153235;
        }
        if (!class473.mouseCam && n5 == 4) {
            n5 = 1;
        }
        final class207 keyHandlerInstance = Client.keyHandlerInstance;
        if (0 == Login.loginIndex * 1145608355) {
            boolean b2 = false;
            while (class207.mt(keyHandlerInstance, 1784233697)) {
                if (-2070224972 == keyHandlerInstance.field1867 * 546317845) {
                    b2 = true;
                }
            }
            final int n8 = class143.loginBoxCenter * 1599014170 - 80;
            final int n9 = 840120342;
            if (n5 && n6 >= n8 - 75 && n6 <= 75 + n8 && n7 >= n9 - 20 && n7 <= 20 + n9) {
                Ignored.compareTo_ignored(InvDefinition.method977("secure", true, -1196428460) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte)(-3));
            }
            final int n10 = class143.loginBoxCenter * 950254081 + 80;
            if ((n5 && n6 >= n10 - 1676482004 && n6 <= 245682051 + n10 && n7 >= n9 - 20 && n7 <= 20 + n9) || b2) {
                if ((1408009359 * Client.worldProperties & 0x2000000) != 0x0) {
                    Login.Login_response0 = "";
                    Login.Login_response1 = Strings.jo;
                    Login.Login_response2 = Strings.jk;
                    Login.Login_response3 = Strings.jq;
                    class129.method763(1, (byte)124);
                    if (Client.Login_isUsernameRemembered && null != Login.Login_username && Login.Login_username.length() > 0) {
                        Login.currentLoginField = 1153152795;
                    }
                    else {
                        Login.currentLoginField = 0;
                    }
                }
                else if ((-205173751 * Client.worldProperties & 0x4) != 0x0) {
                    if ((-205173751 * Client.worldProperties & 0xFEA9134D) != 0x0) {
                        Login.Login_response1 = Strings.ji;
                        Login.Login_response2 = Strings.jg;
                        Login.Login_response3 = Strings.jx;
                    }
                    else {
                        Login.Login_response1 = Strings.ij;
                        Login.Login_response2 = Strings.id;
                        Login.Login_response3 = Strings.it;
                    }
                    Login.Login_response0 = Strings.im;
                    class129.method763(1, (byte)38);
                    if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                        Login.currentLoginField = -508647778;
                    }
                    else {
                        Login.currentLoginField = 0;
                    }
                }
                else if ((Client.worldProperties * -205173751 & 0x400) != 0x0) {
                    Login.Login_response1 = Strings.ix;
                    Login.Login_response2 = Strings.ib;
                    Login.Login_response3 = Strings.jc;
                    Login.Login_response0 = Strings.im;
                    class129.method763(1, (byte)20);
                    if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
                        Login.currentLoginField = 1153152795;
                    }
                    else {
                        Login.currentLoginField = 0;
                    }
                }
                else {
                    class6.method20(false, 1620071571);
                }
            }
        }
        else if (Login.loginIndex * -1353521022 == 1) {
            while (class207.mt(keyHandlerInstance, 1564243876)) {
                if (546317845 * keyHandlerInstance.field1867 == 84) {
                    class6.method20(false, 1620071571);
                }
                else {
                    if (13 != 846814383 * keyHandlerInstance.field1867) {
                        continue;
                    }
                    class129.method763(0, (byte)52);
                }
            }
            final int n11 = class143.loginBoxCenter * 1712896264 - 80;
            final int n12 = -878007619;
            if (n5 && n6 >= n11 - 75 && n6 <= 75 + n11 && n7 >= n12 - 20 && n7 <= n12 + 20) {
                class6.method20(false, 1620071571);
            }
            final int n13 = 161066735 * class143.loginBoxCenter + 80;
            if (n5 && n6 >= n13 - 75 && n6 <= 1387177091 + n13 && n7 >= n12 - 20 && n7 <= 20 + n12) {
                class129.method763(0, (byte)100);
            }
        }
        else if (2 == -144919200 * Login.loginIndex) {
            int n14 = 201;
            n14 += 52;
            if (n5 && n7 >= n14 - 12 && n7 < 2 + n14) {
                Login.currentLoginField = 0;
            }
            n14 += 15;
            if (n5 && n7 >= n14 - 12 && n7 < n14 + 2) {
                Login.currentLoginField = 1153152795;
            }
            n14 += 15;
            final int n15 = -751858532;
            if (null != class96.field1063) {
                final int n16 = class96.field1063.highX * 944313703 / 2;
                if (n5 && n6 >= class96.field1063.lowX * 731383614 - n16 && n6 <= 506274566 * class96.field1063.lowX + n16 && n7 >= n15 - 15 && n7 < n15) {
                    switch (11146618 * Login.field752) {
                        case 2: {
                            Ignored.compareTo_ignored("https://support.runescape.com/hc/en-gb", true, false, (byte)(-19));
                            break;
                        }
                        case 1: {
                            class205.method1137(Strings.lu, Strings.lk, Strings.lh, 1844881975);
                            class129.method763(5, (byte)37);
                            return;
                        }
                    }
                }
            }
            final int n17 = class143.loginBoxCenter * 950254081 - 80;
            final int n18 = 1104688022;
            if (n5 && n6 >= n17 + 469016564 && n6 <= 75 + n17 && n7 >= n18 - 20 && n7 <= n18 + 20) {
                Login.Login_username = Login.Login_username.trim();
                if (Login.Login_username.length() == 0) {
                    class205.method1137(Strings.em, Strings.ew, Strings.ex, -959001404);
                    return;
                }
                if (Login.Login_password.length() == 0) {
                    class205.method1137(Strings.eh, Strings.ek, Strings.ey, 1911766957);
                    return;
                }
                class205.method1137(Strings.jm, Strings.jn, Strings.jd, -2130874787);
                class14.method53(false, -1067619935);
                class138.updateGameState(20, 1688268590);
            }
            else {
                final int n19 = 80 + (Login.loginBoxX * -439587516 + 1532167999);
                if (n5 && n6 >= n19 - 75 && n6 <= n19 + 75 && n7 >= n18 - 20 && n7 <= 20 + n18) {
                    class129.method763(0, (byte)108);
                    Login.Login_username = "";
                    Login.Login_password = "";
                    class204.field1846 = 0;
                    Messages.otp = "";
                    Login.field751 = true;
                }
                final int n20 = -1746775677 + 1861633807 * class143.loginBoxCenter;
                final int n21 = -331145143;
                Login.field730 = (n6 >= n20 && n6 < n20 + ChatChannel.field817 * -126253004 && n7 >= n21 && n7 < FloorUnderlayDefinition.field1642 * -1649414567 + n21);
                if (n5 == 1 && Login.field730) {
                    Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                    if (!Client.Login_isUsernameRemembered && class20.clientPreferences.getUsernameToRemember(-1876285288) != null) {
                        class20.clientPreferences.setUsernameToRemember((String)null, -472730554);
                    }
                }
                final int n22 = 610753373 * class143.loginBoxCenter + 24;
                final int n23 = -754705704;
                Login.field740 = (n6 >= n22 && n6 < ChatChannel.field817 * -665737183 + n22 && n7 >= n23 && n7 < n23 + FloorUnderlayDefinition.field1642 * -1649414567);
                if (n5 && Login.field740) {
                    class20.clientPreferences.setIsUsernameHidden(!ClientPreferences.ty(class20.clientPreferences, -2094215190), 304836679);
                    if (!ClientPreferences.ty(class20.clientPreferences, -2118531838)) {
                        Login.Login_username = "";
                        class20.clientPreferences.setUsernameToRemember((String)null, -472730554);
                        if (Client.Login_isUsernameRemembered && null != Login.Login_username && Login.Login_username.length() > 0) {
                            Login.currentLoginField = 1153152795;
                        }
                        else {
                            Login.currentLoginField = 0;
                        }
                    }
                }
                while (class207.mt(keyHandlerInstance, 1860372837)) {
                    if (1106750432 * keyHandlerInstance.field1867 == 13) {
                        class129.method763(0, (byte)88);
                        Login.Login_username = "";
                        Login.Login_password = "";
                        class204.field1846 = 0;
                        Messages.otp = "";
                        Login.field751 = true;
                    }
                    else if (-1232221421 * Login.currentLoginField == 0) {
                        final char field1866 = keyHandlerInstance.field1866;
                        for (int index = 0; index < Login.dw.length() && field1866 != Login.dw.charAt(index); ++index) {}
                        if (85 == 2024364446 * keyHandlerInstance.field1867 && Login.Login_username.length() > 0) {
                            Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                        }
                        if (84 == 546317845 * keyHandlerInstance.field1867 || 147634841 * keyHandlerInstance.field1867 == -1666491120) {
                            Login.currentLoginField = 507529372;
                        }
                        if (Login.dw.indexOf(keyHandlerInstance.field1866) == -1 || Login.Login_username.length() >= 320) {
                            continue;
                        }
                        Login.Login_username += keyHandlerInstance.field1866;
                    }
                    else {
                        if (Login.currentLoginField * -2000697709 != 1) {
                            continue;
                        }
                        if (keyHandlerInstance.field1867 * 546317845 == -1763047985 && Login.Login_password.length() > 0) {
                            Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                        }
                        else if (-1695908830 == 409435850 * keyHandlerInstance.field1867 || 80 == keyHandlerInstance.field1867 * 505829525) {
                            Login.currentLoginField = 0;
                            if (546317845 * keyHandlerInstance.field1867 == 782745725) {
                                Login.Login_username = Login.Login_username.trim();
                                if (Login.Login_username.length() == 0) {
                                    class205.method1137(Strings.em, Strings.ew, Strings.ex, 1568369478);
                                    return;
                                }
                                if (Login.Login_password.length() == 0) {
                                    class205.method1137(Strings.eh, Strings.ek, Strings.ey, -1154487725);
                                    return;
                                }
                                class205.method1137(Strings.jm, Strings.jn, Strings.jd, -1145523878);
                                class14.method53(false, -413156232);
                                class138.updateGameState(20, 1258413475);
                                return;
                            }
                        }
                        if ((keyHandlerInstance.getKeyPressed(82, 647224367) || keyHandlerInstance.getKeyPressed(-2002183482, -1051624610)) && 67 == keyHandlerInstance.field1867 * -477623702) {
                            final Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(ScriptFrame.client);
                            final int a = 20 - Login.Login_password.length();
                            if (a <= 0) {
                                continue;
                            }
                            try {
                                final String s = (String)contents.getTransferData(DataFlavor.stringFlavor);
                                final int min = Math.min(a, s.length());
                                for (int i = 0; i < min; ++i) {
                                    if (!MouseHandler.method195(s.charAt(i), -589299057) || Login.dw.indexOf(s.charAt(i)) == -1) {
                                        class129.method763(3, (byte)51);
                                        return;
                                    }
                                }
                                Login.Login_password += s.substring(0, min);
                            }
                            catch (UnsupportedFlavorException ex) {}
                            catch (IOException ex2) {}
                        }
                        else {
                            if (!MouseHandler.method195(keyHandlerInstance.field1866, 1914135886)) {
                                continue;
                            }
                            if (Login.dw.indexOf(keyHandlerInstance.field1866) == -1 || Login.Login_password.length() >= 20) {
                                continue;
                            }
                            Login.Login_password += keyHandlerInstance.field1866;
                        }
                    }
                }
            }
        }
        else if (1145608355 * Login.loginIndex == 3) {
            final Bounds av = font.av(25, Strings.kh.length() + 189968792, Strings.kh, 1634988912 + Login.loginBoxX * 678588245, 1458900981);
            if (n5 && av.method2232(n6, n7, 917820097)) {
                Ignored.compareTo_ignored(Strings.ns, true, false, (byte)81);
            }
            final int n24 = 180 + Login.loginBoxX * 678588245;
            final int n25 = 276;
            if (n5 && n6 >= n24 - 75 && n6 <= n24 + 75 && n7 >= n25 - 20 && n7 <= 20 + n25) {
                method444(false, -954825157);
            }
            final int n26 = 459954066 + Login.loginBoxX * 678588245;
            final int n27 = 326;
            if (n5 && n6 >= n26 - 75 && n6 <= 75 + n26 && n7 >= n27 - 20 && n7 <= 20 + n27) {
                class205.method1137(Strings.lu, Strings.lk, Strings.lh, 765391256);
                class129.method763(5, (byte)38);
            }
        }
        else if (4 == 1145608355 * Login.loginIndex) {
            final int n28 = 180 + 908494244 * Login.loginBoxX - 80;
            final int n29 = 321;
            if (n5 && n6 >= n28 - 75 && n6 <= n28 + 731639370 && n7 >= n29 - 20 && n7 <= 20 + n29) {
                Messages.otp.trim();
                if (Messages.otp.length() != 6) {
                    class205.method1137(Strings.br, Strings.bg, Strings.bu, -138739098);
                    return;
                }
                class204.field1846 = Integer.parseInt(Messages.otp) * 455271533;
                Messages.otp = "";
                class14.method53(true, -1934110270);
                class205.method1137(Strings.jm, Strings.jn, Strings.jd, -132709818);
                class138.updateGameState(20, 1266699941);
            }
            else {
                if (n5 && n6 >= 678588245 * Login.loginBoxX + 180 - 9 && n6 <= Login.loginBoxX * 678588245 + 180 + 1144102500 && n7 >= 263 && n7 <= 1883113135) {
                    Login.field751 = !Login.field751;
                }
                if (n5 && n6 >= Login.loginBoxX * 678588245 + 180 - 34 && n6 <= -831568477 + Login.loginBoxX * 678588245 + 34 && n7 >= 1438353676 && n7 <= 363) {
                    Ignored.compareTo_ignored(InvDefinition.method977("secure", true, 921250568) + "m=totp-authenticator/disableTOTPRequest", true, false, (byte)10);
                }
                final int n30 = -1860881388 + (1753687519 + Login.loginBoxX * 190394181);
                if (n5 && n6 >= n30 - 75 && n6 <= 75 + n30 && n7 >= n29 - 20 && n7 <= n29 + 20) {
                    class129.method763(0, (byte)60);
                    Login.Login_username = "";
                    Login.Login_password = "";
                    class204.field1846 = 0;
                    Messages.otp = "";
                }
                while (class207.mt(keyHandlerInstance, 914523099)) {
                    boolean b3 = false;
                    for (int j = 0; j < Login.dc.length(); ++j) {
                        if (keyHandlerInstance.field1866 == Login.dc.charAt(j)) {
                            b3 = true;
                            break;
                        }
                    }
                    if (keyHandlerInstance.field1867 * 2056491280 == 13) {
                        class129.method763(0, (byte)34);
                        Login.Login_username = "";
                        Login.Login_password = "";
                        class204.field1846 = 0;
                        Messages.otp = "";
                    }
                    else {
                        if (85 == keyHandlerInstance.field1867 * -1914901705 && Messages.otp.length() > 0) {
                            Messages.otp = Messages.otp.substring(0, Messages.otp.length() - 1);
                        }
                        if (keyHandlerInstance.field1867 * -529046618 == 84) {
                            Messages.otp.trim();
                            if (Messages.otp.length() != 6) {
                                class205.method1137(Strings.br, Strings.bg, Strings.bu, -1503840166);
                                return;
                            }
                            class204.field1846 = Integer.parseInt(Messages.otp) * -209153533;
                            Messages.otp = "";
                            class14.method53(true, -1729952657);
                            class205.method1137(Strings.jm, Strings.jn, Strings.jd, 463269240);
                            class138.updateGameState(20, 851845961);
                        }
                        else {
                            if (!b3 || Messages.otp.length() >= 6) {
                                continue;
                            }
                            Messages.otp += keyHandlerInstance.field1866;
                        }
                    }
                }
            }
        }
        else if (5 == Login.loginIndex * -1909184642) {
            final int n31 = 180 + Login.loginBoxX * 678588245 - 80;
            final int n32 = 321;
            if (n5 && n6 >= n31 - 237727418 && n6 <= 75 + n31 && n7 >= n32 - 20 && n7 <= n32 + 20) {
                Login.Login_username = Login.Login_username.trim();
                if (Login.Login_username.length() == 0) {
                    class205.method1137(Strings.lu, Strings.lk, Strings.lh, -223209235);
                }
                else {
                    final long method1531 = class264.method1531((byte)(-97));
                    int n33;
                    if (method1531 == 0L) {
                        n33 = 5;
                    }
                    else {
                        final String login_username = Login.Login_username;
                        final Random random = new Random();
                        final Buffer buffer = new Buffer(128);
                        final Buffer buffer2 = new Buffer(758907482);
                        final int[] array = { random.nextInt(), random.nextInt(), (int)(method1531 >> 32), (int)method1531 };
                        buffer.writeShort(10, (byte)59);
                        for (int k = 0; k < 4; ++k) {
                            buffer.writeInt(random.nextInt(), -2081835031);
                        }
                        buffer.writeInt(array[0], -2081835031);
                        buffer.writeInt(array[1], -2081835031);
                        buffer.writeLong(method1531);
                        buffer.writeLong(0L);
                        for (int l = 0; l < 4; ++l) {
                            buffer.writeInt(random.nextInt(), -2081835031);
                        }
                        buffer.encryptRsa(class68.field717, class68.field716, -86179707);
                        buffer2.writeShort(10, (byte)78);
                        for (int n34 = 0; n34 < 3; ++n34) {
                            buffer2.writeInt(random.nextInt(), -2081835031);
                        }
                        buffer2.writeLong(random.nextLong());
                        Buffer.gj(buffer2, random.nextLong());
                        class383.method2086(buffer2, (byte)(-58));
                        buffer2.writeLong(random.nextLong());
                        buffer2.encryptRsa(class68.field717, class68.field716, 24274794);
                        int stringCp1252NullTerminatedByteSize = DynamicObject.stringCp1252NullTerminatedByteSize(login_username, (byte)59);
                        if (stringCp1252NullTerminatedByteSize % 8 != 0) {
                            stringCp1252NullTerminatedByteSize += 8 - stringCp1252NullTerminatedByteSize % 8;
                        }
                        final Buffer buffer3 = new Buffer(stringCp1252NullTerminatedByteSize);
                        buffer3.writeStringCp1252NullCircumfixed(login_username, -1480278244);
                        buffer3.offset = stringCp1252NullTerminatedByteSize * -1516355947;
                        buffer3.xteaEncryptAll(array, -794961409);
                        final Buffer buffer4 = new Buffer(buffer3.offset * -1974045394 + (441663257 * buffer2.offset + (buffer.offset * 1569653893 + 5)));
                        buffer4.writeShort(2, (byte)106);
                        buffer4.writeShort(buffer.offset * -1315371458, (byte)41);
                        buffer4.writeBytes(buffer.array, 0, -1272303021 * buffer.offset, (byte)21);
                        buffer4.writeShort(-1633313603 * buffer2.offset, (byte)60);
                        buffer4.writeBytes(buffer2.array, 0, buffer2.offset * 365091608, (byte)43);
                        buffer4.writeVarInt(1723668308 * buffer3.offset, (byte)37);
                        buffer4.writeBytes(buffer3.array, 0, -1633313603 * buffer3.offset, (byte)15);
                        final String rsOrdinal = WorldMapSectionType.rsOrdinal(buffer4.array, 1466679085);
                        int n35;
                        try {
                            final URLConnection openConnection = new URL(InvDefinition.method977("services", false, -638229282) + "m=accountappeal/login.ws").openConnection();
                            openConnection.setDoInput(true);
                            openConnection.setDoOutput(true);
                            openConnection.setConnectTimeout(-743917294);
                            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
                            outputStreamWriter.write("data2=" + class397.method2119(rsOrdinal, 2000888071) + "&dest=" + class397.method2119("passwordchoice.ws", 1652684425));
                            outputStreamWriter.flush();
                            final InputStream inputStream = openConnection.getInputStream();
                            final Buffer buffer5 = new Buffer(new byte[-1387587255]);
                            while (true) {
                                final int read = inputStream.read(buffer5.array, -1633313603 * buffer5.offset, 1238154590 - buffer5.offset * 247366790);
                                if (read == -1) {
                                    outputStreamWriter.close();
                                    inputStream.close();
                                    final String s2 = new String(buffer5.array);
                                    if (s2.startsWith("OFFLINE")) {
                                        n35 = 4;
                                        break;
                                    }
                                    if (s2.startsWith("WRONG")) {
                                        n35 = 7;
                                        break;
                                    }
                                    if (s2.startsWith("RELOAD")) {
                                        n35 = 3;
                                        break;
                                    }
                                    if (s2.startsWith("Not permitted for social network accounts.")) {
                                        n35 = 6;
                                        break;
                                    }
                                    Buffer.vn(buffer5, array, 1855544283);
                                    while (-954710907 * buffer5.offset > 0 && buffer5.array[buffer5.offset * -1633313603 - 1] == 0) {
                                        final Buffer buffer6 = buffer5;
                                        buffer6.offset += 1516355947;
                                    }
                                    final String s3 = new String(buffer5.array, 0, buffer5.offset * -1413599479);
                                    if (AttackOption.method619(s3, (byte)(-18))) {
                                        Ignored.compareTo_ignored(s3, true, false, (byte)94);
                                        n35 = 2;
                                    }
                                    else {
                                        n35 = 5;
                                    }
                                    break;
                                }
                                else {
                                    final Buffer buffer7 = buffer5;
                                    buffer7.offset += -80225231 * read;
                                    if (buffer5.offset * -1633313603 >= 1000) {
                                        n35 = 5;
                                        break;
                                    }
                                    continue;
                                }
                            }
                        }
                        catch (Throwable t) {
                            t.printStackTrace();
                            n35 = 5;
                        }
                        n33 = n35;
                    }
                    switch (n33) {
                        case 7: {
                            class205.method1137(Strings.lw, Strings.lr, Strings.mt, 1396369943);
                            break;
                        }
                        case 5: {
                            class205.method1137(Strings.lj, Strings.ll, Strings.le, -623039252);
                            break;
                        }
                        case 3: {
                            class205.method1137(Strings.ln, Strings.lt, Strings.lz, 2136605859);
                            break;
                        }
                        case 2: {
                            class205.method1137(Strings.field3267, Strings.field3291, Strings.field3376, -467682172);
                            class129.method763(6, (byte)56);
                            break;
                        }
                        case 6: {
                            class205.method1137(Strings.lb, Strings.lx, Strings.lo, -554648561);
                            break;
                        }
                        case 4: {
                            class205.method1137(Strings.lc, Strings.ld, Strings.lq, 1863794844);
                            break;
                        }
                    }
                }
                return;
            }
            final int n36 = Login.loginBoxX * 678588245 + 138320351 + 80;
            if (n5 && n6 >= n36 - 845037002 && n6 <= 75 + n36 && n7 >= n32 - 20 && n7 <= 20 + n32) {
                class6.method20(true, 1620071571);
            }
            final int n37 = 361;
            if (class19.field60 != null) {
                final int n38 = 528256229 * class19.field60.highX / 2;
                if (n5 && n6 >= class19.field60.lowX * -844906645 - n38 && n6 <= n38 + 617259656 * class19.field60.lowX && n7 >= n37 - 15 && n7 < n37) {
                    Ignored.compareTo_ignored(InvDefinition.method977("secure", true, -1292983102) + "m=weblogin/g=oldscape/cant_log_in", true, false, (byte)60);
                }
            }
            while (class207.mt(keyHandlerInstance, 1903849495)) {
                boolean b4 = false;
                for (int index2 = 0; index2 < Login.dw.length(); ++index2) {
                    if (keyHandlerInstance.field1866 == Login.dw.charAt(index2)) {
                        b4 = true;
                        break;
                    }
                }
                if (704919775 * keyHandlerInstance.field1867 == 13) {
                    class6.method20(true, 1620071571);
                }
                else {
                    if (85 == 546317845 * keyHandlerInstance.field1867 && Login.Login_username.length() > 0) {
                        Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                    }
                    if (559167477 * keyHandlerInstance.field1867 == 1066083671) {
                        Login.Login_username = Login.Login_username.trim();
                        if (Login.Login_username.length() == 0) {
                            class205.method1137(Strings.lu, Strings.lk, Strings.lh, -879977591);
                        }
                        else {
                            final long method1532 = class264.method1531((byte)(-50));
                            int n39;
                            if (method1532 == 0L) {
                                n39 = 5;
                            }
                            else {
                                final String login_username2 = Login.Login_username;
                                final Random random2 = new Random();
                                final Buffer buffer8 = new Buffer(128);
                                final Buffer buffer9 = new Buffer(296798708);
                                final int[] array2 = { random2.nextInt(), random2.nextInt(), (int)(method1532 >> -153460793), (int)method1532 };
                                buffer8.writeShort(10, (byte)56);
                                for (int n40 = 0; n40 < 4; ++n40) {
                                    buffer8.writeInt(random2.nextInt(), -2081835031);
                                }
                                buffer8.writeInt(array2[0], -2081835031);
                                buffer8.writeInt(array2[1], -2081835031);
                                buffer8.writeLong(method1532);
                                buffer8.writeLong(0L);
                                for (int n41 = 0; n41 < 4; ++n41) {
                                    buffer8.writeInt(random2.nextInt(), -2081835031);
                                }
                                buffer8.encryptRsa(class68.field717, class68.field716, 1744040466);
                                buffer9.writeShort(10, (byte)41);
                                for (int n42 = 0; n42 < 3; ++n42) {
                                    buffer9.writeInt(random2.nextInt(), -2081835031);
                                }
                                buffer9.writeLong(random2.nextLong());
                                Buffer.gj(buffer9, random2.nextLong());
                                class383.method2086(buffer9, (byte)6);
                                buffer9.writeLong(random2.nextLong());
                                buffer9.encryptRsa(class68.field717, class68.field716, 127570645);
                                int stringCp1252NullTerminatedByteSize2 = DynamicObject.stringCp1252NullTerminatedByteSize(login_username2, (byte)3);
                                if (0 != stringCp1252NullTerminatedByteSize2 % 8) {
                                    stringCp1252NullTerminatedByteSize2 += 8 - stringCp1252NullTerminatedByteSize2 % 8;
                                }
                                final Buffer buffer10 = new Buffer(stringCp1252NullTerminatedByteSize2);
                                buffer10.writeStringCp1252NullCircumfixed(login_username2, -1728707563);
                                buffer10.offset = stringCp1252NullTerminatedByteSize2 * 1468017743;
                                buffer10.xteaEncryptAll(array2, -794961409);
                                final Buffer buffer11 = new Buffer(5 + buffer8.offset * -1633313603 + 45604288 * buffer9.offset + 1713556350 * buffer10.offset);
                                buffer11.writeShort(2, (byte)80);
                                buffer11.writeShort(-1633313603 * buffer8.offset, (byte)23);
                                buffer11.writeBytes(buffer8.array, 0, buffer8.offset * -1830466108, (byte)102);
                                buffer11.writeShort(buffer9.offset * -1633313603, (byte)120);
                                buffer11.writeBytes(buffer9.array, 0, buffer9.offset * -1633313603, (byte)120);
                                buffer11.writeVarInt(buffer10.offset * -453761289, (byte)(-74));
                                buffer11.writeBytes(buffer10.array, 0, buffer10.offset * -1633313603, (byte)111);
                                final String rsOrdinal2 = WorldMapSectionType.rsOrdinal(buffer11.array, -989426318);
                                int n43;
                                try {
                                    final URLConnection openConnection2 = new URL(InvDefinition.method977("services", false, 1371213179) + "m=accountappeal/login.ws").openConnection();
                                    openConnection2.setDoInput(true);
                                    openConnection2.setDoOutput(true);
                                    openConnection2.setConnectTimeout(1397597320);
                                    final OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(openConnection2.getOutputStream());
                                    outputStreamWriter2.write("data2=" + class397.method2119(rsOrdinal2, 1592597769) + "&dest=" + class397.method2119("passwordchoice.ws", 2016563462));
                                    outputStreamWriter2.flush();
                                    final InputStream inputStream2 = openConnection2.getInputStream();
                                    final Buffer buffer12 = new Buffer(new byte[-1639512277]);
                                    while (true) {
                                        final int read2 = inputStream2.read(buffer12.array, buffer12.offset * -1633313603, 1000 - buffer12.offset * -1633313603);
                                        if (read2 == -1) {
                                            outputStreamWriter2.close();
                                            inputStream2.close();
                                            final String s4 = new String(buffer12.array);
                                            if (s4.startsWith("OFFLINE")) {
                                                n43 = 4;
                                                break;
                                            }
                                            if (s4.startsWith("WRONG")) {
                                                n43 = 7;
                                                break;
                                            }
                                            if (s4.startsWith("RELOAD")) {
                                                n43 = 3;
                                                break;
                                            }
                                            if (s4.startsWith("Not permitted for social network accounts.")) {
                                                n43 = 6;
                                                break;
                                            }
                                            Buffer.vn(buffer12, array2, 1960882401);
                                            while (buffer12.offset * -1633313603 > 0 && 0 == buffer12.array[buffer12.offset * 1655078543 - 1]) {
                                                final Buffer buffer13 = buffer12;
                                                buffer13.offset += 1315239292;
                                            }
                                            final String s5 = new String(buffer12.array, 0, buffer12.offset * 499336654);
                                            if (AttackOption.method619(s5, (byte)18)) {
                                                Ignored.compareTo_ignored(s5, true, false, (byte)26);
                                                n43 = 2;
                                            }
                                            else {
                                                n43 = 5;
                                            }
                                            break;
                                        }
                                        else {
                                            final Buffer buffer14 = buffer12;
                                            buffer14.offset += -1516355947 * read2;
                                            if (buffer12.offset * 251975045 >= 1000) {
                                                n43 = 5;
                                                break;
                                            }
                                            continue;
                                        }
                                    }
                                }
                                catch (Throwable t2) {
                                    t2.printStackTrace();
                                    n43 = 5;
                                }
                                n39 = n43;
                            }
                            switch (n39) {
                                case 6: {
                                    class205.method1137(Strings.lb, Strings.lx, Strings.lo, 632264990);
                                    break;
                                }
                                case 3: {
                                    class205.method1137(Strings.ln, Strings.lt, Strings.lz, -439770805);
                                    break;
                                }
                                case 4: {
                                    class205.method1137(Strings.lc, Strings.ld, Strings.lq, -1340057525);
                                    break;
                                }
                                case 2: {
                                    class205.method1137(Strings.field3267, Strings.field3291, Strings.field3376, -1272495507);
                                    class129.method763(6, (byte)40);
                                    break;
                                }
                                case 5: {
                                    class205.method1137(Strings.lj, Strings.ll, Strings.le, -630099195);
                                    break;
                                }
                                case 7: {
                                    class205.method1137(Strings.lw, Strings.lr, Strings.mt, -1822958668);
                                    break;
                                }
                            }
                        }
                        return;
                    }
                    if (!b4 || Login.Login_username.length() >= 320) {
                        continue;
                    }
                    Login.Login_username += keyHandlerInstance.field1866;
                }
            }
        }
        else if (1145608355 * Login.loginIndex == 6) {
            while (class207.mt(keyHandlerInstance, 1297694396)) {
                if (-338591064 == 546317845 * keyHandlerInstance.field1867 || -168106127 * keyHandlerInstance.field1867 == 13) {
                    class6.method20(true, 1620071571);
                }
            }
            final int n44 = 321;
            if (n5 && n7 >= n44 - 20 && n7 <= 20 + n44) {
                class6.method20(true, 1620071571);
            }
        }
        else if (Login.loginIndex * 1145608355 == 7) {
            if (WorldMapSectionType.field2384 && !Client.onMobile) {
                final int n45 = class143.loginBoxCenter * -772961425 - 150;
                final int n46 = 40 + (n45 + 240 + 25);
                final int n47 = 231;
                final int n48 = 40 + n47;
                Label_6888: {
                    if (n5 && n6 >= n45 && n6 <= n46 && n7 >= n47 && n7 <= n48) {
                        int n49 = n45;
                        while (true) {
                            for (int n50 = 0; n50 < 8; ++n50) {
                                if (n6 <= n49 + 30) {
                                    final int n51 = n50;
                                    Login.field747 = n51 * 2014701898;
                                    break Label_6888;
                                }
                                n49 += 30;
                                n49 += ((n50 == 1 || 3 == n50) ? 20 : 5);
                            }
                            final int n51 = 0;
                            continue;
                        }
                    }
                }
                final int n52 = -543578506 * Login.loginBoxX + 1489929083 - 1665945633;
                final int n53 = 321;
                if (n5 && n6 >= n52 + 106955972 && n6 <= 442700753 + n52 && n7 >= n53 - 20 && n7 <= 20 + n53) {
                    boolean b5 = false;
                    Label_7207: {
                        Date date = null;
                        Label_7101: {
                            try {
                                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                simpleDateFormat.setLenient(false);
                                final StringBuilder sb = new StringBuilder();
                                final String[] field1867 = Login.field748;
                                while (true) {
                                    for (int n54 = 0; n54 < field1867.length; ++n54) {
                                        final String str = field1867[n54];
                                        if (str == null) {
                                            WorldMapRectangle.method1522("Date not valid.", "Please ensure all characters are populated.", "", -1440441392);
                                            final Date parse = null;
                                            date = parse;
                                            break Label_7101;
                                        }
                                        sb.append(str);
                                    }
                                    sb.append("12");
                                    final Date parse = simpleDateFormat.parse(sb.toString());
                                    continue;
                                }
                            }
                            catch (ParseException ex3) {
                                WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1188918760);
                                b5 = false;
                                break Label_7207;
                            }
                        }
                        if (date == null) {
                            b5 = false;
                        }
                        else {
                            final boolean method1533 = class81.method483(date, 1599796205);
                            if (!date.after(Varcs.clearTransient(2052817619))) {
                                WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 853198213);
                                b5 = false;
                            }
                            else {
                                if (!method1533) {
                                    ByteArrayPool.field3668 = -1538915424;
                                }
                                else {
                                    ByteArrayPool.field3668 = (int)(date.getTime() / 86400000L - 11745L) * -21780332;
                                }
                                b5 = true;
                            }
                        }
                    }
                    if (b5) {
                        class138.updateGameState(1156318365, 1232630603);
                        return;
                    }
                }
                final int n55 = -612530798 + (Login.loginBoxX * 1036549800 + 1651682879);
                if (n5 && n6 >= n55 - 412624075 && n6 <= n55 + 1797085318 && n7 >= n53 - 20 && n7 <= n53 + 20) {
                    Login.field748 = new String[8];
                    class6.method20(true, 1620071571);
                }
                while (class207.mt(keyHandlerInstance, 1968437595)) {
                    if (-1751253147 == -377461599 * keyHandlerInstance.field1867) {
                        Login.field748[Login.field747 * -2077021590] = null;
                    }
                    if (1011070930 * keyHandlerInstance.field1867 == 85) {
                        if (null == Login.field748[58082365 * Login.field747] && -1262226977 * Login.field747 > 0) {
                            Login.field747 -= 1670187551;
                        }
                        Login.field748[Login.field747 * -1262226977] = null;
                    }
                    if (keyHandlerInstance.field1866 >= '0' && keyHandlerInstance.field1866 <= '9') {
                        Login.field748[-1388225256 * Login.field747] = "" + keyHandlerInstance.field1866;
                        if (-2118155747 * Login.field747 < 7) {
                            Login.field747 += 1670187551;
                        }
                    }
                    if (1248538147 * keyHandlerInstance.field1867 == 84) {
                        boolean b6 = false;
                        Label_7744: {
                            Date date2 = null;
                            Label_7638: {
                                try {
                                    final SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                    simpleDateFormat2.setLenient(false);
                                    final StringBuilder sb2 = new StringBuilder();
                                    final String[] field1868 = Login.field748;
                                    while (true) {
                                        for (int n56 = 0; n56 < field1868.length; ++n56) {
                                            final String str2 = field1868[n56];
                                            if (str2 == null) {
                                                WorldMapRectangle.method1522("Date not valid.", "Please ensure all characters are populated.", "", -622696301);
                                                final Date parse2 = null;
                                                date2 = parse2;
                                                break Label_7638;
                                            }
                                            sb2.append(str2);
                                        }
                                        sb2.append("12");
                                        final Date parse2 = simpleDateFormat2.parse(sb2.toString());
                                        continue;
                                    }
                                }
                                catch (ParseException ex4) {
                                    WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -50880900);
                                    b6 = false;
                                    break Label_7744;
                                }
                            }
                            if (date2 == null) {
                                b6 = false;
                            }
                            else {
                                final boolean method1534 = class81.method483(date2, 1422186876);
                                if (!date2.after(Varcs.clearTransient(2052817619))) {
                                    WorldMapRectangle.method1522("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1071458521);
                                    b6 = false;
                                }
                                else {
                                    if (!method1534) {
                                        ByteArrayPool.field3668 = 1307553270;
                                    }
                                    else {
                                        ByteArrayPool.field3668 = (int)(date2.getTime() / 86400000L - 11745L) * -909067137;
                                    }
                                    b6 = true;
                                }
                            }
                        }
                        if (b6) {
                            class138.updateGameState(50, 574998737);
                        }
                    }
                }
            }
            else {
                final int n57 = 678588245 * Login.loginBoxX + 180 - 80;
                final int n58 = -1975770036;
                if (n5 && n6 >= n57 - 75 && n6 <= n57 - 1206974589 && n7 >= n58 - 20 && n7 <= 20 + n58) {
                    Ignored.compareTo_ignored(InvDefinition.method977("secure", true, -813161201) + "m=dob/set_dob.ws", true, false, (byte)(-94));
                    class205.method1137(Strings.ls, Strings.lf, Strings.li, -847731162);
                    class129.method763(6, (byte)111);
                    return;
                }
                final int n59 = 1384150033 + (Login.loginBoxX * 678588245 + 180);
                if (n5 && n6 >= n59 + 301265543 && n6 <= n59 + 75 && n7 >= n58 - 20 && n7 <= n58 + 20) {
                    class6.method20(true, 1620071571);
                }
            }
        }
        else if (8 == 1145608355 * Login.loginIndex) {
            final int n60 = Login.loginBoxX * 678588245 - 641105780 + 819962139;
            final int n61 = 321;
            if (n5 && n6 >= n60 + 1351575718 && n6 <= n60 + 75 && n7 >= n61 - 20 && n7 <= n61 + 20) {
                Ignored.compareTo_ignored("https://www.jagex.com/terms/privacy", true, false, (byte)(-11));
                class205.method1137(Strings.ls, Strings.lf, Strings.li, 975462242);
                class129.method763(6, (byte)45);
                return;
            }
            final int n62 = 80 + (Login.loginBoxX * 678588245 + 180);
            if (n5 && n6 >= n62 + 1097887359 && n6 <= n62 + 1914962714 && n7 >= n61 - 20 && n7 <= n61 + 20) {
                class6.method20(true, 1620071571);
            }
        }
        else if (9 == 1145608355 * Login.loginIndex) {
            final int n63 = -1981998678 + -293164735 * Login.loginBoxX;
            final int n64 = 311;
            if (-604626458 == keyHandlerInstance.field1867 * 546317845 || keyHandlerInstance.field1867 * -503035693 == 13 || (n5 && n6 >= n63 + 1673460572 && n6 <= 75 + n63 && n7 >= n64 - 20 && n7 <= n64 + 20)) {
                method444(false, -1477471584);
            }
        }
        else if (10 == Login.loginIndex * -908627791) {
            final int n65 = Login.loginBoxX * 905793096 - 1022422695;
            final int n66 = 209;
            if (-450726661 * keyHandlerInstance.field1867 == 84 || (n5 && n6 >= n65 - 109 && n6 <= 494278587 + n65 && n7 >= n66 && n7 <= n66 + 68)) {
                class205.method1137(Strings.jm, Strings.jn, Strings.jd, 2047205581);
                Client.field395 = class493.field4094;
                class14.method53(false, -1216687119);
                class138.updateGameState(20, 523982135);
            }
        }
        else if (1145608355 * Login.loginIndex == 12) {
            final int n67 = class143.loginBoxCenter * 1430865810;
            int n68 = 233;
            final Bounds av2 = font2.av(0, 30, Strings.ma, n67, n68);
            final Bounds av3 = font2.av(-1828010628, 32, Strings.ma, n67, n68);
            final Bounds av4 = font2.av(645141362, -543417251, Strings.ma, n67, n68);
            n68 += 17;
            final Bounds av5 = font2.av(0, 34, Strings.mp, n67, n68);
            if (n5 != 0) {
                if (av2.method2232(n6, n7, 917820097)) {
                    Ignored.compareTo_ignored("https://www.jagex.com/terms", true, false, (byte)81);
                }
                else if (av3.method2232(n6, n7, 917820097)) {
                    Ignored.compareTo_ignored("https://www.jagex.com/terms/privacy", true, false, (byte)(-58));
                }
                else if (av4.method2232(n6, n7, 917820097) || av5.method2232(n6, n7, 917820097)) {
                    Ignored.compareTo_ignored("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false, (byte)96);
                }
            }
            final int n69 = class143.loginBoxCenter * 950254081 - 80;
            final int n70 = -1447658727;
            if (n5 && n6 >= n69 - 75 && n6 <= n69 - 1010854301 && n7 >= n70 - 20 && n7 <= n70 + 20) {
                ClientPreferences.kw(class20.clientPreferences, Client.param21 * 1354262312, -435147120);
                method444(true, -1650325581);
            }
            final int n71 = class143.loginBoxCenter * 950254081 + 83280123;
            if (n5 && n6 >= n71 - 75 && n6 <= 75 + n71 && n7 >= n70 - 20 && n7 <= n70 + 20) {
                Login.loginIndex = 127737743;
            }
        }
        else if (1145608355 * Login.loginIndex == 13) {
            final int n72 = class143.loginBoxCenter * 950254081;
            final int n73 = 502125214;
            if (n5 && n6 >= n72 - 75 && n6 <= 2065257099 + n72 && n7 >= n73 - 20 && n7 <= n73 + 20) {
                method444(true, -1700013433);
            }
        }
        else if (1145608355 * Login.loginIndex == 14) {
            String s6 = "";
            switch (1760018338 * Login.field738) {
                case 1: {
                    s6 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                }
                case 2: {
                    s6 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                }
                default: {
                    class6.method20(false, 1620071571);
                    break;
                }
                case 0: {
                    s6 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                }
            }
            final int n74 = -518157955 * Login.loginBoxX + 180;
            final int n75 = 276;
            if (n5 && n6 >= n74 - 75 && n6 <= 75 + n74 && n7 >= n75 - 20 && n7 <= n75 + 20) {
                Ignored.compareTo_ignored(s6, true, false, (byte)32);
                class205.method1137(Strings.ls, Strings.lf, Strings.li, -1999958010);
                class129.method763(6, (byte)59);
                return;
            }
            final int n76 = Login.loginBoxX * 678588245 + 180;
            final int n77 = 326;
            if (n5 && n6 >= n76 - 75 && n6 <= n76 - 1583968355 && n7 >= n77 - 20 && n7 <= n77 + 20) {
                class6.method20(false, 1620071571);
            }
        }
        else if (24 == Login.loginIndex * 1145608355) {
            final int n78 = Login.loginBoxX * 678588245 - 148921311;
            final int n79 = 301;
            if (n5 && n6 >= n78 - 75 && n6 <= n78 + 75 && n7 >= n79 - 20 && n7 <= n79 + 20) {
                method444(false, -1281465405);
            }
        }
        else if (32 == Login.loginIndex * 1145608355) {
            final int n80 = -1024012587 + 678588245 * Login.loginBoxX - 80;
            final int n81 = 321;
            if (n5 && n6 >= n80 + 132705726 && n6 <= n80 + 75 && n7 >= n81 - 20 && n7 <= n81 + 20) {
                Ignored.compareTo_ignored(InvDefinition.method977("secure", true, 1598276065) + "m=dob/set_dob.ws", true, false, (byte)30);
                class205.method1137(Strings.ls, Strings.lf, Strings.li, -1475738707);
                class129.method763(6, (byte)32);
                return;
            }
            final int n82 = 80 + (-1596677471 + Login.loginBoxX * 326487307);
            if (n5 && n6 >= n82 - 1646918568 && n6 <= 75 + n82 && n7 >= n81 - 20 && n7 <= n81 + 20) {
                class6.method20(true, 1620071571);
            }
        }
        else if (1145608355 * Login.loginIndex == 33) {
            final int n83 = 180 + Login.loginBoxX * 678588245;
            final int n84 = 276;
            if (n5 && n6 >= n83 + 951141632 && n6 <= 1306009355 + n83 && n7 >= n84 - 20 && n7 <= 20 + n84) {
                Ignored.compareTo_ignored(Strings.ns, true, false, (byte)(-64));
            }
            final int n85 = 180 + 1387081944 * Login.loginBoxX;
            final int n86 = 326;
            if (n5 && n6 >= n85 + 1898963931 && n6 <= 813985240 + n85 && n7 >= n86 - 20 && n7 <= n86 + 20) {
                class6.method20(true, 1620071571);
            }
        }
    }
    
    static void cm(final GameEngine gameEngine) {
        final class207 keyHandlerInstance = Client.keyHandlerInstance;
        while (class207.mt(keyHandlerInstance, 1168846238)) {
            if (-442647424 * keyHandlerInstance.field1867 == 13) {
                class138.method800((byte)96);
                return;
            }
            if (keyHandlerInstance.field1867 * 546317845 == 96) {
                if (1246310743 * Login.worldSelectPage <= 0 || null == PlayerType.worldSelectLeftSprite) {
                    continue;
                }
                Login.worldSelectPage -= 1193353829;
            }
            else {
                if (1641329628 != 1933253148 * keyHandlerInstance.field1867 || Login.worldSelectPage * -795684946 >= 1162773918 * Login.worldSelectPagesCount || null == class13.worldSelectRightSprite) {
                    continue;
                }
                Login.worldSelectPage -= 1379513753;
            }
        }
        if (1 == -743589135 * MouseHandler.MouseHandler_lastButton || (!class473.mouseCam && -1222491879 * MouseHandler.MouseHandler_lastButton == 4)) {
            final int n = Login.xPadding * -2060214165 + 280;
            if (MouseHandler.MouseHandler_lastPressedX * 203193485 >= n && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n + 14 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                FillMode.changeWorldSelectSorting(0, 0, -1275110685);
                return;
            }
            if (524189790 * MouseHandler.MouseHandler_lastPressedX >= 15 + n && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n + 80 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4 && -1290427744 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                FillMode.changeWorldSelectSorting(0, 1, 155574920);
                return;
            }
            final int n2 = -562240958 + -1370441765 * Login.xPadding;
            if (MouseHandler.MouseHandler_lastPressedX * -722671202 >= n2 && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= n2 + 14 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY * 878101364 <= 18) {
                FillMode.changeWorldSelectSorting(1, 0, -744348897);
                return;
            }
            if (MouseHandler.MouseHandler_lastPressedX * 2020601481 >= n2 + 15 && -585074576 * MouseHandler.MouseHandler_lastPressedX <= n2 + 80 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4 && -34861750 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                FillMode.changeWorldSelectSorting(1, 1, 147812036);
                return;
            }
            final int n3 = 500 + Login.xPadding * -1203504053;
            if (MouseHandler.MouseHandler_lastPressedX * -874248223 >= n3 && 2020601481 * MouseHandler.MouseHandler_lastPressedX <= n3 + 14 && -1199014696 * MouseHandler.MouseHandler_lastPressedY >= 4 && 1163896205 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                FillMode.changeWorldSelectSorting(2, 0, -1639634909);
                return;
            }
            if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= n3 + 15 && MouseHandler.MouseHandler_lastPressedX * 2140306704 <= -1763805753 + n3 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4 && MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                FillMode.changeWorldSelectSorting(2, 1, -1311522040);
                return;
            }
            final int n4 = Login.xPadding * 1289868183 + 1561671996;
            if (MouseHandler.MouseHandler_lastPressedX * 1735021663 >= n4 && MouseHandler.MouseHandler_lastPressedX * -660212597 <= n4 + 14 && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY * 1163896205 <= 18) {
                FillMode.changeWorldSelectSorting(3, 0, -804738765);
                return;
            }
            if (-373065896 * MouseHandler.MouseHandler_lastPressedX >= 15 + n4 && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= 80 + n4 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4 && MouseHandler.MouseHandler_lastPressedY * -965089380 <= 18) {
                FillMode.changeWorldSelectSorting(3, 1, -1458363958);
                return;
            }
            if (2020601481 * MouseHandler.MouseHandler_lastPressedX >= -342535771 + Login.xPadding * 624122521 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= 4 && 2020601481 * MouseHandler.MouseHandler_lastPressedX <= 185496581 + Login.xPadding * 578342931 + 50 && -177002209 * MouseHandler.MouseHandler_lastPressedY <= 20) {
                class138.method800((byte)23);
                return;
            }
            if (Login.hoveredWorldIndex * -1933150873 != -1) {
                FloorOverlayDefinition.changeWorld(class31.World_worlds[408880862 * Login.hoveredWorldIndex], 814313015);
                class138.method800((byte)27);
                return;
            }
            if (Login.worldSelectPage * 87410566 > 0 && null != PlayerType.worldSelectLeftSprite && 924441836 * MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX * 2020601481 <= PlayerType.worldSelectLeftSprite.yOffset && 1163896205 * MouseHandler.MouseHandler_lastPressedY >= 1658005443 * class262.canvasHeight / 2 - 1955682285 && 1163896205 * MouseHandler.MouseHandler_lastPressedY <= 1344625365 * class262.canvasHeight / 2 + 33227894) {
                Login.worldSelectPage -= 1401064082;
            }
            if (1246310743 * Login.worldSelectPage < Login.worldSelectPagesCount * 1959698517 && null != class13.worldSelectRightSprite && MouseHandler.MouseHandler_lastPressedX * 2020601481 >= GameEngine.canvasWidth * 1816245050 - class13.worldSelectRightSprite.yOffset - 5 && MouseHandler.MouseHandler_lastPressedX * -1411698012 <= GameEngine.canvasWidth * 1686868983 && MouseHandler.MouseHandler_lastPressedY * 1163896205 >= class262.canvasHeight * -148494306 / 2 - 50 && MouseHandler.MouseHandler_lastPressedY * 1163896205 <= class262.canvasHeight * -208003200 / 2 - 816722981) {
                Login.worldSelectPage -= 1379513753;
            }
        }
    }
    
    static boolean bg(final Date date) {
        final Calendar instance = Calendar.getInstance();
        instance.set(1, instance.get(1) - 13);
        instance.set(5, instance.get(5) + 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return date.before(instance.getTime());
    }
    
    static void cg(final World world) {
        if (world.isMembersOnly(1029039210) != Client.isMembersWorld) {
            Client.isMembersWorld = world.isMembersOnly(1029039210);
            final boolean membersOnly = world.isMembersOnly(1029039210);
            if (FileSystem.ItemDefinition_inMembersWorld != membersOnly) {
                class379.method2015((byte)(-5));
                FileSystem.ItemDefinition_inMembersWorld = membersOnly;
            }
        }
        if (-205173751 * Client.worldProperties != 1810954985 * world.properties) {
            final Archive archive8 = class452.archive8;
            final int n = 1810954985 * world.properties;
            if ((n & 0x20000000) != 0x0) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_deadman_mode", "", -161351840);
            }
            else if (0x0 != (n & 0xBBEC6F94)) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_seasonal_mode", "", -860694763);
            }
            else if ((n & 0x100) != 0x0) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo_speedrunning", "", -1292550848);
            }
            else {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(archive8, "logo", "", -959200774);
            }
        }
        UserComparator8.worldHost = world.host;
        Client.worldId = -2094155673 * world.id;
        Client.worldProperties = world.properties * 702001121;
        FriendsChat.worldPort = ((0 == -1274626977 * Client.gameBuild) ? -1138993319 : (-1231808536 * world.id + 40000)) * -1326916691;
        class127.js5Port = ((0 == Client.gameBuild * -1274626977) ? 443 : (50000 + world.id * -211938359)) * -1927102761;
        ItemContainer.currentPort = FriendsChat.worldPort * -482218348;
    }
    
    static void co() {
        class129.method763(24, (byte)5);
        class205.method1137(Strings.jf, Strings.jw, Strings.js, -765331790);
    }
    
    static void cy(final int n) {
        class129.method763(14, (byte)124);
        Login.field738 = n * 2122741797;
    }
    
    static Date bn() {
        final Calendar instance = Calendar.getInstance();
        instance.set(2, 0);
        instance.set(5, 1);
        instance.set(1, 1900);
        return instance.getTime();
    }
    
    static void cz() {
        class129.method763(24, (byte)11);
        class205.method1137(Strings.jf, Strings.jw, Strings.js, 492992096);
    }
    
    static void bl(final String s, final String s2, final String s3) {
        class129.method763(7, (byte)125);
        class205.method1137(s, s2, s3, 113956618);
    }
    
    static void bz() {
        if (!class12.clearLoginScreen) {
            return;
        }
        Login.titleboxSprite = null;
        class292.titlebuttonSprite = null;
        class396.runesSprite = null;
        class123.leftTitleSprite = null;
        ParamComposition.rightTitleSprite = null;
        Canvas.logoSprite = null;
        class148.title_muteSprite = null;
        Login.options_buttons_0Sprite = null;
        class158.options_buttons_2Sprite = null;
        class476.worldSelectBackSprites = null;
        class16.worldSelectFlagSprites = null;
        DevicePcmPlayerProvider.worldSelectArrows = null;
        World.worldSelectStars = null;
        class319.field3030 = null;
        class121.field1184.method555(-775592816);
        class297.musicPlayerStatus = -1332506500;
        class297.musicTrackArchive = null;
        class379.musicTrackGroupId = 1643562499;
        VarpDefinition.musicTrackFileId = -714035666;
        class100.musicTrackVolume = 0;
        class120.musicTrackBoolean = false;
        class162.pcmSampleLength = 1104839005;
        class177.vmethod3380(true, 1088892549);
        class12.clearLoginScreen = false;
    }
    
    static Date bj() {
        final Calendar instance = Calendar.getInstance();
        instance.set(2, 0);
        instance.set(5, 1);
        instance.set(1, -144020587);
        return instance.getTime();
    }
    
    public static void zt(final NPCComposition npcComposition, final Buffer buffer) {
        if (npcComposition == null) {
            npcComposition.getId();
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            npcComposition.decodeNext(buffer, ra, 1239995114);
        }
    }
    
    static void cq(final Font font, final Font font2) {
        if (null == class476.worldSelectBackSprites) {
            final Archive archive8 = class452.archive8;
            SpritePixels[] method699;
            if (!AbstractArchive.sh(archive8, "sl_back", "", -1313069490)) {
                method699 = null;
            }
            else {
                final int fileFlat = AbstractArchive.getFileFlat(archive8, "sl_back", 1063220071);
                method699 = UserComparator3.method699(archive8, fileFlat, archive8.getFileId(fileFlat, "", (short)8192), 1271520368);
            }
            class476.worldSelectBackSprites = method699;
        }
        if (null == class16.worldSelectFlagSprites) {
            class16.worldSelectFlagSprites = class314.method1708(class452.archive8, "sl_flags", "", 84377531);
        }
        if (DevicePcmPlayerProvider.worldSelectArrows == null) {
            DevicePcmPlayerProvider.worldSelectArrows = class314.method1708(class452.archive8, "sl_arrows", "", 1917718697);
        }
        if (World.worldSelectStars == null) {
            World.worldSelectStars = class314.method1708(class452.archive8, "sl_stars", "", -1876004537);
        }
        if (PlayerType.worldSelectLeftSprite == null) {
            PlayerType.worldSelectLeftSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "leftarrow", "", -960902045);
        }
        if (class13.worldSelectRightSprite == null) {
            class13.worldSelectRightSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "rightarrow", "", -1379796150);
        }
        Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 578342931, 23, -1207356766, 480, 0);
        Rasterizer2D.Rasterizer2D_fillRectangleGradient(-1559960360 * Login.xPadding, 0, 1664946852, 23, 12425273, -1392470982);
        Rasterizer2D.Rasterizer2D_fillRectangleGradient(125 + Login.xPadding * 578342931, 0, -284512653, 23, 5197647, 2697513);
        font.aj(Strings.mo, Login.xPadding * 578342931 - 598027128, 15, 0, -1);
        if (null != World.worldSelectStars) {
            World.worldSelectStars[1].ax(Login.xPadding * 578342931 + 140, 1);
            class492.xb(font2, Strings.mn, -1009905892 * Login.xPadding + 1333253987, 10, -16103843, -1);
            World.worldSelectStars[0].ax(Login.xPadding * -1362379238 + 1786547806, 12);
            class492.xb(font2, Strings.mi, 152 + Login.xPadding * 578342931, 21, -303907007, -1);
        }
        if (DevicePcmPlayerProvider.worldSelectArrows != null) {
            final int n = 578342931 * Login.xPadding + 280;
            if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n, 4);
            }
            if (World.World_sortOption1[0] == 0 && 1 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n + 15, 4);
            }
            class492.xb(font, Strings.md, 32 + n, 17, 2118551745, -1);
            final int n2 = Login.xPadding * 1418391226 + 2082255508;
            if (1 == World.World_sortOption1[0] && 0 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n2, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n2, 4);
            }
            if (World.World_sortOption1[0] == 1 && 1 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n2, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n2 + 15, 4);
            }
            class492.xb(font, Strings.mr, 111369431 + n2, 17, 16777215, -1);
            final int n3 = Login.xPadding * 188251256 + 500;
            if (2 == World.World_sortOption1[0] && 0 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n3, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n3, 4);
            }
            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(n3 + 15, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(15 + n3, 4);
            }
            class492.xb(font, Strings.ml, 32 + n3, 17, -1575388166, -1);
            final int n4 = Login.xPadding * 578342931 + 610;
            if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n4, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n4, 4);
            }
            if (3 == World.World_sortOption1[0] && 1 == World.World_sortOption2[0]) {
                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n4, 4);
            }
            else {
                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n4 + 15, 4);
            }
            class492.xb(font, Strings.mf, n4 + 32, 17, -1950582200, -1);
        }
        Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 1588351192 - 548688420, 4, 154902788, 16, 0);
        font2.aj(Strings.jl, 25 + (1206204727 + Login.xPadding * 578342931), 16, 16777215, -1);
        Login.hoveredWorldIndex = 848889613;
        if (class476.worldSelectBackSprites != null) {
            final int n5 = 88;
            final int n6 = 19;
            int n7 = 765 / (n5 + 1) - 1;
            int n8 = 873080893 / (1 + n6);
            int n9;
            int n10;
            do {
                n9 = n8;
                n10 = n7;
                if (n8 * (n7 - 1) >= -734287707 * World.World_count) {
                    --n7;
                }
                if (n7 * (n8 - 1) >= -725457929 * World.World_count) {
                    --n8;
                }
                if ((n8 - 1) * n7 >= World.World_count * 1435526464) {
                    --n8;
                }
            } while (n8 != n9 || n10 != n7);
            int n11 = (-801085537 - n5 * n7) / (n7 + 1);
            if (n11 > 5) {
                n11 = 5;
            }
            int n12 = (480 - n8 * n6) / (n8 + 1);
            if (n12 > 5) {
                n12 = 5;
            }
            final int n13 = (-1159024798 - n5 * n7 - n11 * (n7 - 1)) / 2;
            final int n14 = (480 - n6 * n8 - n12 * (n8 - 1)) / 2;
            Login.worldSelectPagesCount = ((-734287707 * World.World_count + n8 - 1) / n8 - n7) * 1853447421;
            if (PlayerType.worldSelectLeftSprite != null && Login.worldSelectPage * -1343273292 > 0) {
                PlayerType.worldSelectLeftSprite.ax(8, class262.canvasHeight * 1658005443 / 2 - PlayerType.worldSelectLeftSprite.subWidth / 2);
            }
            if (class13.worldSelectRightSprite != null && 1246310743 * Login.worldSelectPage < Login.worldSelectPagesCount * 1453670715) {
                class13.worldSelectRightSprite.ax(GameEngine.canvasWidth * -1687260435 - class13.worldSelectRightSprite.yOffset - 8, 1658005443 * class262.canvasHeight / 2 - class13.worldSelectRightSprite.subWidth / 2);
            }
            int n15 = n14 + 23;
            int n16 = Login.xPadding * 578342931 + n13;
            int n17 = 0;
            boolean b = false;
            for (int n18 = 1246310743 * Login.worldSelectPage, n19 = n8 * n18; n19 < World.World_count * -734287707 && n18 - 1246310743 * Login.worldSelectPage < n7; ++n19) {
                final World world = class31.World_worlds[n19];
                boolean b2 = true;
                String s = Integer.toString(-1396846889 * world.population);
                if (-1 == -1396846889 * world.population) {
                    s = Strings.my;
                    b2 = false;
                }
                else if (world.population * -1396846889 > 1980) {
                    s = Strings.mk;
                    b2 = false;
                }
                class103 class103 = null;
                int n20 = 0;
                if (World.hu(world, -646743722)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1103 : class103.field1105);
                }
                else if (world.isDeadman(-923441016)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1114 : class103.field1113);
                }
                else if (World.yk(world, (byte)85)) {
                    n20 = 16711680;
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1104 : class103.field1101);
                }
                else if (world.method404((byte)114)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1115 : class103.field1106);
                }
                else if (world.isPvp(1421375149)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1102 : class103.field1110);
                }
                else if (world.method405(-459773999)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1107 : class103.field1109);
                }
                else if (world.method406((byte)41)) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1112 : class103.field1111);
                }
                if (null == class103 || class103.field1099 * 1140778173 >= class476.worldSelectBackSprites.length) {
                    class103 = (world.isMembersOnly(1029039210) ? class103.field1100 : class103.field1108);
                }
                if (MouseHandler.MouseHandler_x * -2063363905 >= n16 && MouseHandler.MouseHandler_y * -1224153235 >= n15 && -2063363905 * MouseHandler.MouseHandler_x < n16 + n5 && MouseHandler.MouseHandler_y * -1860493526 < n6 + n15 && b2) {
                    Login.hoveredWorldIndex = n19 * -848889613;
                    MusicTrack.mg(class476.worldSelectBackSprites[1140778173 * class103.field1099], n16, n15, 128, 16777215);
                    b = true;
                }
                else {
                    class476.worldSelectBackSprites[-814830032 * class103.field1099].ca(n16, n15);
                }
                if (null != class16.worldSelectFlagSprites) {
                    class16.worldSelectFlagSprites[(world.isMembersOnly(1029039210) ? 8 : 0) + world.location * -665846519].ax(n16 + 29, n15);
                }
                font.aj(Integer.toString(-2091224171 * world.id), 15 + n16, 5 + (n6 / 2 + n15), n20, -1);
                font2.aj(s, n16 + 60, 5 + (n6 / 2 + n15), 268435455, -1);
                n15 += n12 + n6;
                if (++n17 >= n8) {
                    n15 = 23 + n14;
                    n16 += n5 + n11;
                    n17 = 0;
                    ++n18;
                }
            }
            if (b) {
                final int n21 = font2.bf(class31.World_worlds[Login.hoveredWorldIndex * 248569915].activity) + 6;
                final int n22 = 8 + font2.al;
                int n23 = MouseHandler.MouseHandler_y * -1224153235 + 25;
                if (n22 + n23 > 480) {
                    n23 = -808900698 * MouseHandler.MouseHandler_y - 25 - n22;
                }
                Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x * -2063363905 - n21 / 2, n23, n21, n22, -820126481);
                Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x * -1640658800 - n21 / 2, n23, n21, n22, 0);
                font2.aj(class31.World_worlds[Login.hoveredWorldIndex * -921881579].activity, -2063363905 * MouseHandler.MouseHandler_x, 4 + (font2.al + n23), 0, -1);
            }
        }
        RouteStrategy.rasterProvider.drawFull(0, 0, 1751231865);
    }
    
    static void bm() {
        if (!class12.clearLoginScreen) {
            return;
        }
        Login.titleboxSprite = null;
        class292.titlebuttonSprite = null;
        class396.runesSprite = null;
        class123.leftTitleSprite = null;
        ParamComposition.rightTitleSprite = null;
        Canvas.logoSprite = null;
        class148.title_muteSprite = null;
        Login.options_buttons_0Sprite = null;
        class158.options_buttons_2Sprite = null;
        class476.worldSelectBackSprites = null;
        class16.worldSelectFlagSprites = null;
        DevicePcmPlayerProvider.worldSelectArrows = null;
        World.worldSelectStars = null;
        class319.field3030 = null;
        class121.field1184.method555(-1003728308);
        class297.musicPlayerStatus = -626822165;
        class297.musicTrackArchive = null;
        class379.musicTrackGroupId = 1643562499;
        VarpDefinition.musicTrackFileId = -51363568;
        class100.musicTrackVolume = 0;
        class120.musicTrackBoolean = false;
        class162.pcmSampleLength = 440964570;
        class177.vmethod3380(true, 920792383);
        class12.clearLoginScreen = false;
    }
    
    static void bk() {
        if (null != Login.Login_username && Login.Login_username.length() > 0) {
            return;
        }
        if (class20.clientPreferences.getUsernameToRemember(-1841568301) != null) {
            Login.Login_username = class20.clientPreferences.getUsernameToRemember(-941738765);
            Client.Login_isUsernameRemembered = true;
        }
        else {
            Client.Login_isUsernameRemembered = false;
        }
    }
    
    static boolean bf(final Date date) {
        final Calendar instance = Calendar.getInstance();
        instance.set(1, instance.get(1) - 13);
        instance.set(5, instance.get(5) + 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return date.before(instance.getTime());
    }
    
    static boolean bu(final Date date) {
        final Calendar instance = Calendar.getInstance();
        instance.set(1, instance.get(1) - 13);
        instance.set(5, instance.get(5) + 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return date.before(instance.getTime());
    }
}
