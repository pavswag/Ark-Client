// 
// Decompiled by Procyon v0.5.36
// 

public class class506
{
    int field4148;
    int field4149;
    int field4150;
    int field4151;
    int field4152;
    int field4153;
    int field4154;
    static final float af = 0.9f;
    int field4155;
    int field4156;
    int field4157;
    boolean field4158;
    int field4159;
    int field4160;
    
    public class506() {
        this.field4156 = 0;
        this.field4155 = 0;
    }
    
    public void at(final class379 class379, final Font font) {
        if (null == font) {
            return;
        }
        final int al = font.al;
        final int min = Math.min(this.field4152 * -942838135, (int)(al * 0.9f));
        final int op = class379.op(class379, 2079060143 * this.field4151, (byte)89);
        final int dg = class379.dg(this.field4152 * 1046576271, 646237062);
        final int n = 1878010847 * this.field4149 - -330574306 * this.field4153 + op;
        final int n2 = dg + (this.field4150 * 1392698185 - this.field4154 * -417354641) + al;
        Rasterizer2D.Rasterizer2D_setClip(this.field4149 * 1938868562, this.field4150 * 1392698185, this.field4151 * 2079060143 + this.field4149 * -2074411675, -137686749 * this.field4152 + -854746116 * this.field4150);
        int n3 = -335536107 * this.field4155;
        int n4 = this.field4156 * -729151693;
        if (n3 > n4) {
            final int n5 = n3;
            n3 = n4;
            n4 = n5;
        }
        final class383 method2035 = class379.method2035(0, n3, (byte)107);
        final class383 method2036 = class379.method2035(n3, n4, (byte)35);
        final class383 method2037 = class379.method2035(n4, class379.method2006(1884344843), (byte)63);
        final class383 method2038 = class379.method2035(0, 364214458 * this.field4156, (byte)35);
        if (!method2036.method2078(1113751785)) {
            final int n6 = font.at + font.aa;
            for (int i = 0; i < class383.ud(method2036, (byte)121); ++i) {
                final class381 method2039 = method2036.method2080(i, -1037292745);
                Rasterizer2D.Rasterizer2D_fillRectangle(method2039.field3625 * 1705766883 + n, -727185157 * method2039.field3623 + n2 - al, font.ay(method2039.field3624), n6, -2007773992 * this.field4160);
            }
        }
        if (!method2035.method2078(1906121067)) {
            font.ad(method2035, n, n2, 1499601627 * this.field4157, this.field4148 * 812242279, -1);
        }
        if (!method2036.method2078(69131885)) {
            font.ad(method2036, n, n2, this.field4159 * 933331403, this.field4148 * 812242279, -1);
        }
        if (!method2037.method2078(-1122097982)) {
            font.ad(method2037, n, n2, this.field4157 * 1499601627, this.field4148 * 812242279, -1);
        }
        if (this.field4158) {
            final class461 cy = class383.cy(method2038, (byte)98);
            final int n7 = n + (int)cy.field3972;
            final int n8 = n2 + (int)cy.field3973;
            final int n9 = n8 - min;
            Rasterizer2D.Rasterizer2D_drawLine(n7, n8, n7, n9, this.field4157 * 305864360);
            if (-1 != -1528183858 * this.field4148) {
                Rasterizer2D.Rasterizer2D_drawLine(n7 + 1, 1 + n8, 1 + n7, n9 + 1, this.field4148 * 812242279);
            }
        }
    }
    
    public void ay(final class379 class379, final Font font) {
        if (null == font) {
            return;
        }
        final int al = font.al;
        final int min = Math.min(this.field4152 * 451027092, (int)(al * 0.9f));
        final int op = class379.op(class379, -974551955 * this.field4151, (byte)35);
        final int dg = class379.dg(this.field4152 * -354456029, -1244067880);
        final int n = -2074411675 * this.field4149 - -1144547987 * this.field4153 + op;
        final int n2 = dg + (this.field4150 * 1392698185 - this.field4154 * -417354641) + al;
        Rasterizer2D.Rasterizer2D_setClip(this.field4149 * 582246886, this.field4150 * 1540188615, this.field4151 * 2079060143 + this.field4149 * -2074411675, -250526185 * this.field4152 + 1392698185 * this.field4150);
        int n3 = 492014242 * this.field4155;
        int n4 = this.field4156 * -729151693;
        if (n3 > n4) {
            final int n5 = n3;
            n3 = n4;
            n4 = n5;
        }
        final class383 method2035 = class379.method2035(0, n3, (byte)47);
        final class383 method2036 = class379.method2035(n3, n4, (byte)44);
        final class383 method2037 = class379.method2035(n4, class379.method2006(1847464024), (byte)69);
        final class383 method2038 = class379.method2035(0, -729151693 * this.field4156, (byte)62);
        if (!method2036.method2078(838168750)) {
            final int n6 = font.at + font.aa;
            for (int i = 0; i < class383.ud(method2036, (byte)108); ++i) {
                final class381 method2039 = method2036.method2080(i, -1037292745);
                Rasterizer2D.Rasterizer2D_fillRectangle(method2039.field3625 * 490026401 + n, -727185157 * method2039.field3623 + n2 - al, font.ay(method2039.field3624), n6, -1287309 * this.field4160);
            }
        }
        if (!method2035.method2078(457409935)) {
            font.ad(method2035, n, n2, 1897971765 * this.field4157, this.field4148 * 1870542113, -1);
        }
        if (!method2036.method2078(-1747798292)) {
            font.ad(method2036, n, n2, this.field4159 * 933331403, this.field4148 * 445108466, -1);
        }
        if (!method2037.method2078(1313391986)) {
            font.ad(method2037, n, n2, this.field4157 * 1499601627, this.field4148 * 812242279, -1);
        }
        if (this.field4158) {
            final class461 cy = class383.cy(method2038, (byte)113);
            final int n7 = n + (int)cy.field3972;
            final int n8 = n2 + (int)cy.field3973;
            final int n9 = n8 - min;
            Rasterizer2D.Rasterizer2D_drawLine(n7, n8, n7, n9, this.field4157 * 581580288);
            if (-1 != 474174953 * this.field4148) {
                Rasterizer2D.Rasterizer2D_drawLine(n7 + 1, 1 + n8, 1 + n7, n9 + 1, this.field4148 * 812242279);
            }
        }
    }
    
    public void method2638(final class379 class379, final Font font, final byte b) {
        try {
            if (null != font) {
                final int al = font.al;
                final int min = Math.min(this.field4152 * -942838135, (int)(al * 0.9f));
                final int op = class379.op(class379, 2079060143 * this.field4151, (byte)101);
                final int dg = class379.dg(this.field4152 * -942838135, 44970407);
                final int n = -2074411675 * this.field4149 - 795400289 * this.field4153 + op;
                final int n2 = dg + (this.field4150 * 1392698185 - this.field4154 * -417354641) + al;
                Rasterizer2D.Rasterizer2D_setClip(this.field4149 * -2074411675, this.field4150 * 1392698185, this.field4151 * 2079060143 + this.field4149 * -2074411675, -942838135 * this.field4152 + 1392698185 * this.field4150);
                int n3 = -335536107 * this.field4155;
                int n4 = this.field4156 * -729151693;
                if (n3 > n4) {
                    if (b == 9) {
                        throw new IllegalStateException();
                    }
                    final int n5 = n3;
                    n3 = n4;
                    n4 = n5;
                }
                final class383 method2035 = class379.method2035(0, n3, (byte)17);
                final class383 method2036 = class379.method2035(n3, n4, (byte)80);
                final class383 method2037 = class379.method2035(n4, class379.method2006(1152700563), (byte)2);
                final class383 method2038 = class379.method2035(0, -729151693 * this.field4156, (byte)40);
                if (!method2036.method2078(791000990)) {
                    final int n6 = font.at + font.aa;
                    for (int i = 0; i < class383.ud(method2036, (byte)87); ++i) {
                        if (b == 9) {
                            throw new IllegalStateException();
                        }
                        final class381 method2039 = method2036.method2080(i, -1037292745);
                        Rasterizer2D.Rasterizer2D_fillRectangle(method2039.field3625 * 1620071571 + n, -727185157 * method2039.field3623 + n2 - al, font.ay(method2039.field3624), n6, -1287309 * this.field4160);
                    }
                }
                if (!method2035.method2078(1476508915)) {
                    font.ad(method2035, n, n2, 1499601627 * this.field4157, this.field4148 * 812242279, -1);
                }
                if (!method2036.method2078(541684564)) {
                    if (b == 9) {
                        throw new IllegalStateException();
                    }
                    font.ad(method2036, n, n2, this.field4159 * 933331403, this.field4148 * 812242279, -1);
                }
                if (!method2037.method2078(151231018)) {
                    if (b == 9) {
                        throw new IllegalStateException();
                    }
                    font.ad(method2037, n, n2, this.field4157 * 1499601627, this.field4148 * 812242279, -1);
                }
                if (this.field4158) {
                    if (b == 9) {
                        throw new IllegalStateException();
                    }
                    final class461 cy = class383.cy(method2038, (byte)5);
                    final int n7 = n + (int)cy.field3972;
                    final int n8 = n2 + (int)cy.field3973;
                    final int n9 = n8 - min;
                    Rasterizer2D.Rasterizer2D_drawLine(n7, n8, n7, n9, this.field4157 * 1499601627);
                    if (-1 != 812242279 * this.field4148) {
                        if (b == 9) {
                            throw new IllegalStateException();
                        }
                        Rasterizer2D.Rasterizer2D_drawLine(n7 + 1, 1 + n8, 1 + n7, n9 + 1, this.field4148 * 812242279);
                    }
                }
                return;
            }
            if (b == 9) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tz.aw(" + ')');
        }
    }
    
    public void al(final int n, final int n2, final int n3, final int n4) {
        this.field4157 = n * -415014513;
        this.field4148 = 1033343409 * n2;
        this.field4159 = n3 * 270310371;
        this.field4160 = 866327704 * n4;
    }
    
    public void method2639(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            this.field4157 = n * -1716104877;
            this.field4148 = 1360885335 * n2;
            this.field4159 = n3 * 270310371;
            this.field4160 = -2112142917 * n4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tz.an(" + ')');
        }
    }
    
    public void ac(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final boolean field4158) {
        this.field4152 = 452324461 * n;
        this.field4159 = n2 * 1354465017;
        this.field4148 = 958752335 * n3;
        this.field4157 = 1476552633 * n4;
        this.field4148 = n5 * -1050948703;
        this.field4159 = -420531569 * n6;
        this.field4159 = -1791669253 * n7;
        this.field4148 = 1315090237 * n8;
        this.field4158 = field4158;
    }
    
    public void au(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final boolean field4158) {
        this.field4149 = 452324461 * n;
        this.field4150 = n2 * 1354465017;
        this.field4151 = 958752335 * n3;
        this.field4152 = 1476552633 * n4;
        this.field4153 = n5 * -1050948703;
        this.field4154 = -420531569 * n6;
        this.field4156 = -1791669253 * n7;
        this.field4155 = 1315090237 * n8;
        this.field4158 = field4158;
    }
    
    public static void vk(final class506 class506, final class379 class507, final Font font) {
        if (class506 == null) {
            class506.at(class507, font);
        }
        if (null == font) {
            return;
        }
        final int al = font.al;
        final int min = Math.min(class506.field4152 * -942838135, (int)(al * 0.9f));
        final int op = class379.op(class507, 2079060143 * class506.field4151, (byte)76);
        final int dg = class507.dg(class506.field4152 * -942838135, 609735664);
        final int n = -2074411675 * class506.field4149 - 795400289 * class506.field4153 + op;
        final int n2 = dg + (class506.field4150 * 1392698185 - class506.field4154 * -417354641) + al;
        Rasterizer2D.Rasterizer2D_setClip(class506.field4149 * -2074411675, class506.field4150 * 1392698185, class506.field4151 * 2079060143 + class506.field4149 * -2074411675, -942838135 * class506.field4152 + 1392698185 * class506.field4150);
        int n3 = -335536107 * class506.field4155;
        int n4 = class506.field4156 * -729151693;
        if (n3 > n4) {
            final int n5 = n3;
            n3 = n4;
            n4 = n5;
        }
        final class383 method2035 = class507.method2035(0, n3, (byte)44);
        final class383 method2036 = class507.method2035(n3, n4, (byte)98);
        final class383 method2037 = class507.method2035(n4, class507.method2006(1441716397), (byte)19);
        final class383 method2038 = class507.method2035(0, -729151693 * class506.field4156, (byte)3);
        if (!method2036.method2078(283107076)) {
            final int n6 = font.at + font.aa;
            for (int i = 0; i < class383.ud(method2036, (byte)85); ++i) {
                final class381 method2039 = method2036.method2080(i, -1037292745);
                Rasterizer2D.Rasterizer2D_fillRectangle(method2039.field3625 * 1620071571 + n, -727185157 * method2039.field3623 + n2 - al, font.ay(method2039.field3624), n6, -1287309 * class506.field4160);
            }
        }
        if (!method2035.method2078(-669567953)) {
            font.ad(method2035, n, n2, 1499601627 * class506.field4157, class506.field4148 * 812242279, -1);
        }
        if (!method2036.method2078(778881779)) {
            font.ad(method2036, n, n2, class506.field4159 * 933331403, class506.field4148 * 812242279, -1);
        }
        if (!method2037.method2078(-1629645763)) {
            font.ad(method2037, n, n2, class506.field4157 * 1499601627, class506.field4148 * 812242279, -1);
        }
        if (class506.field4158) {
            final class461 cy = class383.cy(method2038, (byte)12);
            final int n7 = n + (int)cy.field3972;
            final int n8 = n2 + (int)cy.field3973;
            final int n9 = n8 - min;
            Rasterizer2D.Rasterizer2D_drawLine(n7, n8, n7, n9, class506.field4157 * 1499601627);
            if (-1 != 812242279 * class506.field4148) {
                Rasterizer2D.Rasterizer2D_drawLine(n7 + 1, 1 + n8, 1 + n7, n9 + 1, class506.field4148 * 812242279);
            }
        }
    }
    
    public void method2637(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final boolean field4158, final int n9) {
        try {
            this.field4149 = 452324461 * n;
            this.field4150 = n2 * 1354465017;
            this.field4151 = 958752335 * n3;
            this.field4152 = 1476552633 * n4;
            this.field4153 = n5 * -1050948703;
            this.field4154 = -420531569 * n6;
            this.field4156 = -1791669253 * n7;
            this.field4155 = 1315090237 * n8;
            this.field4158 = field4158;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "tz.af(" + ')');
        }
    }
    
    public void ab(final int n, final int n2, final int n3, final int n4) {
        this.field4157 = n * -1716104877;
        this.field4148 = 1360885335 * n2;
        this.field4159 = n3 * 270310371;
        this.field4160 = -2112142917 * n4;
    }
    
    public void aq(final int n, final int n2, final int n3, final int n4) {
        this.field4157 = n * -1313107574;
        this.field4148 = 1360885335 * n2;
        this.field4159 = n3 * -492427739;
        this.field4160 = -2112142917 * n4;
    }
    
    public static void nj(final class506 class506, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final boolean field4158) {
        if (class506 == null) {
            class506.ac(n, n, n, n, n, n, n, n, field4158);
            return;
        }
        class506.field4149 = 452324461 * n;
        class506.field4150 = n2 * 1354465017;
        class506.field4151 = 958752335 * n3;
        class506.field4152 = 1476552633 * n4;
        class506.field4153 = n5 * -1050948703;
        class506.field4154 = -420531569 * n6;
        class506.field4156 = -1791669253 * n7;
        class506.field4155 = 1315090237 * n8;
        class506.field4158 = field4158;
    }
}
