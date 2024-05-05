import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class Rasterizer3D
{
    public static int[] Rasterizer3D_sine;
    static final class220 field1992;
    static int[] field1993;
    public static Clips clips;
    public static int[] Rasterizer3D_cosine;
    public static int[] Rasterizer3D_colorPalette;
    static int[] field1997;
    static final class220 field1998;
    static class220 field1999;
    static int field2000;
    public static final int av = 15;
    
    Rasterizer3D() throws Throwable {
        throw new Error();
    }
    
    static {
        Rasterizer3D.Rasterizer3D_colorPalette = new int[65536];
        Rasterizer3D.field1997 = new int[512];
        Rasterizer3D.field1993 = new int[2048];
        Rasterizer3D.Rasterizer3D_sine = new int[2048];
        Rasterizer3D.Rasterizer3D_cosine = new int[2048];
        for (int i = 1; i < 512; ++i) {
            Rasterizer3D.field1997[i] = 32768 / i;
        }
        for (int j = 1; j < 2048; ++j) {
            Rasterizer3D.field1993[j] = 65536 / j;
        }
        for (int k = 0; k < 2048; ++k) {
            Rasterizer3D.Rasterizer3D_sine[k] = (int)(65536.0 * Math.sin(0.0030679615 * k));
            Rasterizer3D.Rasterizer3D_cosine[k] = (int)(65536.0 * Math.cos(0.0030679615 * k));
        }
        Rasterizer3D.clips = new Clips();
        field1998 = new class235(Rasterizer3D.clips);
        field1992 = new class237(Rasterizer3D.clips);
        Rasterizer3D.field1999 = Rasterizer3D.field1998;
    }
    
    public static void cs(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10) {
        Rasterizer3D.field1999.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    static int bs() {
        return -988034230 * Rasterizer3D.clips.field2233;
    }
    
    static void ad(final double n, final int n2, final int n3) {
        int n4 = 128 * n2;
        for (int i = n2; i < n3; ++i) {
            final double n5 = (i >> 3) / 64.0 + 0.0078125;
            final double n6 = 0.0625 + (i & 0x7) / 8.0;
            for (int j = 0; j < 128; ++j) {
                double n10;
                double n9;
                double n8;
                final double n7 = n8 = (n9 = (n10 = j / 128.0));
                if (n6 != 0.0) {
                    double n11;
                    if (n7 < 0.5) {
                        n11 = n7 * (1.0 + n6);
                    }
                    else {
                        n11 = n6 + n7 - n6 * n7;
                    }
                    final double n12 = n7 * 2.0 - n11;
                    double n13 = n5 + 0.3333333333333333;
                    if (n13 > 1.0) {
                        --n13;
                    }
                    final double n14 = n5;
                    double n15 = n5 - 0.3333333333333333;
                    if (n15 < 0.0) {
                        ++n15;
                    }
                    if (n13 * 6.0 < 1.0) {
                        n10 = n13 * (6.0 * (n11 - n12)) + n12;
                    }
                    else if (2.0 * n13 < 1.0) {
                        n10 = n11;
                    }
                    else if (n13 * 3.0 < 2.0) {
                        n10 = n12 + 6.0 * ((0.6666666666666666 - n13) * (n11 - n12));
                    }
                    else {
                        n10 = n12;
                    }
                    if (n14 * 6.0 < 1.0) {
                        n9 = n12 + (n11 - n12) * 6.0 * n14;
                    }
                    else if (n14 * 2.0 < 1.0) {
                        n9 = n11;
                    }
                    else if (n14 * 3.0 < 2.0) {
                        n9 = n12 + (n11 - n12) * (0.6666666666666666 - n14) * 6.0;
                    }
                    else {
                        n9 = n12;
                    }
                    if (6.0 * n15 < 1.0) {
                        n8 = n15 * ((n11 - n12) * 6.0) + n12;
                    }
                    else if (n15 * 2.0 < 1.0) {
                        n8 = n11;
                    }
                    else if (3.0 * n15 < 2.0) {
                        n8 = 6.0 * ((n11 - n12) * (0.6666666666666666 - n15)) + n12;
                    }
                    else {
                        n8 = n12;
                    }
                }
                int rasterizer3D_brighten = UrlRequest.Rasterizer3D_brighten(((int)(256.0 * n10) << 16) + ((int)(256.0 * n9) << 8) + (int)(256.0 * n8), n);
                if (rasterizer3D_brighten == 0) {
                    rasterizer3D_brighten = (true ? 1 : 0);
                }
                Rasterizer3D.Rasterizer3D_colorPalette[n4++] = rasterizer3D_brighten;
            }
        }
    }
    
    public static void ba() {
        Rasterizer3D.clips.method1358((byte)9);
    }
    
    static void ae(final double n, final int n2, final int n3) {
        int n4 = 128 * n2;
        for (int i = n2; i < n3; ++i) {
            final double n5 = (i >> 3) / 64.0 + 0.0078125;
            final double n6 = 0.0625 + (i & 0x7) / 8.0;
            for (int j = 0; j < 128; ++j) {
                double n10;
                double n9;
                double n8;
                final double n7 = n8 = (n9 = (n10 = j / 128.0));
                if (n6 != 0.0) {
                    double n11;
                    if (n7 < 0.5) {
                        n11 = n7 * (1.0 + n6);
                    }
                    else {
                        n11 = n6 + n7 - n6 * n7;
                    }
                    final double n12 = n7 * 2.0 - n11;
                    double n13 = n5 + 0.3333333333333333;
                    if (n13 > 1.0) {
                        --n13;
                    }
                    final double n14 = n5;
                    double n15 = n5 - 0.3333333333333333;
                    if (n15 < 0.0) {
                        ++n15;
                    }
                    if (n13 * 6.0 < 1.0) {
                        n10 = n13 * (6.0 * (n11 - n12)) + n12;
                    }
                    else if (2.0 * n13 < 1.0) {
                        n10 = n11;
                    }
                    else if (n13 * 3.0 < 2.0) {
                        n10 = n12 + 6.0 * ((0.6666666666666666 - n13) * (n11 - n12));
                    }
                    else {
                        n10 = n12;
                    }
                    if (n14 * 6.0 < 1.0) {
                        n9 = n12 + (n11 - n12) * 6.0 * n14;
                    }
                    else if (n14 * 2.0 < 1.0) {
                        n9 = n11;
                    }
                    else if (n14 * 3.0 < 2.0) {
                        n9 = n12 + (n11 - n12) * (0.6666666666666666 - n14) * 6.0;
                    }
                    else {
                        n9 = n12;
                    }
                    if (6.0 * n15 < 1.0) {
                        n8 = n15 * ((n11 - n12) * 6.0) + n12;
                    }
                    else if (n15 * 2.0 < 1.0) {
                        n8 = n11;
                    }
                    else if (3.0 * n15 < 2.0) {
                        n8 = 6.0 * ((n11 - n12) * (0.6666666666666666 - n15)) + n12;
                    }
                    else {
                        n8 = n12;
                    }
                }
                int rasterizer3D_brighten = UrlRequest.Rasterizer3D_brighten(((int)(256.0 * n10) << 16) + ((int)(256.0 * n9) << 8) + (int)(256.0 * n8), n);
                if (rasterizer3D_brighten == 0) {
                    rasterizer3D_brighten = (true ? 1 : 0);
                }
                Rasterizer3D.Rasterizer3D_colorPalette[n4++] = rasterizer3D_brighten;
            }
        }
    }
    
    public static void ce(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10) {
        Rasterizer3D.field1999.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    static int bb(final int n, final double b) {
        return (int)(256.0 * Math.pow((n & 0xFF) / 256.0, b)) + (((int)(Math.pow((n >> 8 & 0xFF) / 256.0, b) * 256.0) << 8) + ((int)(Math.pow((n >> 16) / 256.0, b) * 256.0) << 16));
    }
    
    public static void bw(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10) {
        Rasterizer3D.field1999.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    public static void ak(final double n) {
        class7.method22(n, 0, 512, -2143756614);
    }
    
    static int be() {
        return 93675259 * Rasterizer3D.clips.field2231;
    }
    
    public static void as(final boolean b) {
        if (b && null != Rasterizer2D.field4108) {
            Rasterizer3D.field1999 = Rasterizer3D.field1992;
        }
        else {
            Rasterizer3D.field1999 = Rasterizer3D.field1998;
        }
    }
    
    public static void az(final double n) {
        class7.method22(n, 0, 512, -2043785855);
    }
    
    static int bi() {
        return 911941044 * Rasterizer3D.clips.field2231;
    }
    
    public static void bv() {
        Rasterizer3D.clips.method1358((byte)10);
    }
    
    static int bo() {
        return Rasterizer3D.clips.field2236 * 137577184;
    }
    
    public static void bp(final int n, final int n2, final int n3) {
        Rasterizer3D.clips.method1360(n, n2, n3, -612474676);
    }
    
    static void cc(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20, final int n21, final int n22) {
        Rasterizer3D.field1999.vmethod1362(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22);
    }
    
    public static int bt() {
        return Rasterizer3D.clips.field2227 * 1936152916;
    }
    
    public static boolean xl(final Client client) {
        return null != client.field399;
    }
    
    static void bc(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10, final int n11, final int n12) {
        Rasterizer3D.field1999.vmethod1374(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12);
    }
    
    public static void br(final int[] array, final int n, final int n2, final float[] array2) {
        if (null == array2 && Rasterizer3D.field1992 == Rasterizer3D.field1999) {
            Rasterizer3D.field1999 = Rasterizer3D.field1998;
        }
        class220.rj(Rasterizer3D.field1999, array, n, n2, array2, -874616581);
    }
    
    public static void ci(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10) {
        Rasterizer3D.field1999.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    public static AccessFile getPreferencesFile(final String s, final String str, final boolean b, final byte b2) {
        try {
            final File file = new File(class335.cacheDir, "preferences" + s + ".dat");
            if (file.exists()) {
                if (b2 >= 1) {
                    throw new IllegalStateException();
                }
                try {
                    return new AccessFile(file, "rw", 10000L);
                }
                catch (IOException ex2) {}
            }
            String str2 = "";
            if (33 == -1325133847 * JagexCache.cacheGamebuild) {
                if (b2 >= 1) {
                    throw new IllegalStateException();
                }
                str2 = "_rc";
            }
            else if (34 == -1325133847 * JagexCache.cacheGamebuild) {
                if (b2 >= 1) {
                    throw new IllegalStateException();
                }
                str2 = "_wip";
            }
            final File file2 = new File(HorizontalAlignment.userHomeDirectory, "jagex_" + str + "_preferences" + s + str2 + ".dat");
            if (!b) {
                if (b2 >= 1) {
                    throw new IllegalStateException();
                }
                if (file2.exists()) {
                    try {
                        return new AccessFile(file2, "rw", 10000L);
                    }
                    catch (IOException ex3) {}
                }
            }
            try {
                return new AccessFile(file, "rw", 10000L);
            }
            catch (IOException ex4) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "in.an(" + ')');
        }
    }
    
    public static void bq() {
        final int rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        final int rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        final int rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_xClipEnd;
        final int rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_yClipEnd;
        Rasterizer3D.clips.field2233 = (rasterizer2D_xClipEnd - rasterizer2D_xClipStart) * 1163083059;
        Rasterizer3D.clips.field2232 = -508492839 * (rasterizer2D_yClipEnd - rasterizer2D_yClipStart);
        Tiles.method474(1441948024);
        if (Rasterizer3D.clips.Rasterizer3D_rowOffsets.length < Rasterizer3D.clips.field2232 * -1347859351) {
            Rasterizer3D.clips.Rasterizer3D_rowOffsets = new int[class70.method442(Rasterizer3D.clips.field2232 * -1347859351, 553394611)];
        }
        int n = rasterizer2D_xClipStart + Rasterizer2D.Rasterizer2D_width * rasterizer2D_yClipStart;
        for (int i = 0; i < Rasterizer3D.clips.field2232 * -1347859351; ++i) {
            Rasterizer3D.clips.Rasterizer3D_rowOffsets[i] = n;
            n += Rasterizer2D.Rasterizer2D_width;
        }
    }
    
    public static void bh(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10) {
        Rasterizer3D.field1999.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    }
    
    static int by(final int n, final double b) {
        return (int)(256.0 * Math.pow((n & 0xFF) / 256.0, b)) + (((int)(Math.pow((n >> 8 & 0xE4C968B1) / 256.0, b) * 256.0) << 8) + ((int)(Math.pow((n >> 16) / 256.0, b) * 256.0) << 16));
    }
    
    static int bx() {
        return -1623049222 * Rasterizer3D.clips.field2229;
    }
    
    static int method1216(final int n, final Script script, final boolean b, final int n2) {
        try {
            Widget widget;
            if (b) {
                if (n2 <= -1807661547) {
                    throw new IllegalStateException();
                }
                widget = SoundSystem.scriptDotWidget;
            }
            else {
                widget = class1.scriptActiveWidget;
            }
            final Widget widget2 = widget;
            if (n == 1800) {
                if (n2 <= -1807661547) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class195.method1052(KeyHandler.getWidgetFlags(widget2, 597832321), 1600588840);
                return 1;
            }
            else if (n == 1801) {
                if (n2 <= -1807661547) {
                    throw new IllegalStateException();
                }
                int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                --n3;
                if (null != widget2.actions) {
                    if (n2 <= -1807661547) {
                        throw new IllegalStateException();
                    }
                    if (n3 < widget2.actions.length) {
                        if (n2 <= -1807661547) {
                            throw new IllegalStateException();
                        }
                        if (widget2.actions[n3] != null) {
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget2.actions[n3];
                            return 1;
                        }
                        if (n2 <= -1807661547) {
                            throw new IllegalStateException();
                        }
                    }
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                return 1;
            }
            else {
                if (1802 == n) {
                    if (null == widget2.field3004) {
                        if (n2 <= -1807661547) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    }
                    else {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = widget2.field3004;
                    }
                    return 1;
                }
                return 2;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "in.ar(" + ')');
        }
    }
    
    static int ap(final int n, final double b) {
        return (int)(256.0 * Math.pow((n & 0xFF) / 256.0, b)) + (((int)(Math.pow((n >> 8 & 0xFF) / 256.0, b) * 256.0) << 8) + ((int)(Math.pow((n >> 16) / 256.0, b) * 256.0) << 16));
    }
    
    public static int bd() {
        return Rasterizer3D.clips.field2227 * 17491276;
    }
    
    public static void bg(final int[] array, final int n, final int n2, final float[] array2) {
        if (null == array2 && Rasterizer3D.field1992 == Rasterizer3D.field1999) {
            Rasterizer3D.field1999 = Rasterizer3D.field1998;
        }
        class220.rj(Rasterizer3D.field1999, array, n, n2, array2, 378616780);
    }
    
    static int bn() {
        return 2073525409 * Rasterizer3D.clips.field2233;
    }
    
    public static void aj(final double n) {
        class7.method22(n, 0, 512, -2031414897);
    }
    
    public static void bl() {
        Rasterizer3D.clips.method1358((byte)68);
    }
    
    static int bz() {
        return 1145780727 * Rasterizer3D.clips.field2238;
    }
    
    public static int bj() {
        return Rasterizer3D.clips.field2227 * -1734758735;
    }
    
    static int bm() {
        return 1145780727 * Rasterizer3D.clips.field2238;
    }
    
    static int bk() {
        return 93675259 * Rasterizer3D.clips.field2231;
    }
    
    public static void bf() {
        final int rasterizer2D_xClipStart = Rasterizer2D.Rasterizer2D_xClipStart;
        final int rasterizer2D_yClipStart = Rasterizer2D.Rasterizer2D_yClipStart;
        final int rasterizer2D_xClipEnd = Rasterizer2D.Rasterizer2D_xClipEnd;
        final int rasterizer2D_yClipEnd = Rasterizer2D.Rasterizer2D_yClipEnd;
        Rasterizer3D.clips.field2233 = (rasterizer2D_xClipEnd - rasterizer2D_xClipStart) * -1224418538;
        Rasterizer3D.clips.field2232 = -508492839 * (rasterizer2D_yClipEnd - rasterizer2D_yClipStart);
        Tiles.method474(1441948024);
        if (Rasterizer3D.clips.Rasterizer3D_rowOffsets.length < Rasterizer3D.clips.field2232 * 601539701) {
            Rasterizer3D.clips.Rasterizer3D_rowOffsets = new int[class70.method442(Rasterizer3D.clips.field2232 * -427719351, 142206558)];
        }
        int n = rasterizer2D_xClipStart + Rasterizer2D.Rasterizer2D_width * rasterizer2D_yClipStart;
        for (int i = 0; i < Rasterizer3D.clips.field2232 * -1448710788; ++i) {
            Rasterizer3D.clips.Rasterizer3D_rowOffsets[i] = n;
            n += Rasterizer2D.Rasterizer2D_width;
        }
    }
    
    public static void bu(final int[] array, final int n, final int n2, final float[] array2) {
        if (null == array2 && Rasterizer3D.field1992 == Rasterizer3D.field1999) {
            Rasterizer3D.field1999 = Rasterizer3D.field1998;
        }
        class220.rj(Rasterizer3D.field1999, array, n, n2, array2, 313803650);
    }
}
