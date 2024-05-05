import java.util.ArrayList;

// 
// Decompiled by Procyon v0.5.36
// 

public class Decimator
{
    static final int cc = 71;
    static final int af = 14;
    static final int an = 7;
    int inputRate;
    static final int aw = 6;
    int outputRate;
    static final int bq = 1007;
    static final int bn = 58;
    public static final int bm = 55;
    int[][] table;
    
    public Decimator(int n, int n2) {
        if (n == n2) {
            return;
        }
        int n3 = n;
        int i = n2;
        if (i > n3) {
            final int n4 = n3;
            n3 = i;
            i = n4;
        }
        while (i != 0) {
            final int n5 = n3 % i;
            n3 = i;
            i = n5;
        }
        final int n6 = n3;
        n /= n6;
        n2 /= n6;
        this.outputRate = -1129997997 * n;
        this.inputRate = 1881760051 * n2;
        this.table = new int[n][14];
        for (int j = 0; j < n; ++j) {
            final int[] array = this.table[j];
            final double n7 = j / (double)n + 6.0;
            int k = (int)Math.floor(n7 - 7.0 + 1.0);
            if (k < 0) {
                k = 0;
            }
            int n8 = (int)Math.ceil(7.0 + n7);
            if (n8 > 14) {
                n8 = 14;
            }
            final double n9 = n2 / (double)n;
            while (k < n8) {
                final double a = (k - n7) * 3.141592653589793;
                double n10 = n9;
                if (a < -1.0E-4 || a > 1.0E-4) {
                    n10 *= Math.sin(a) / a;
                }
                array[k] = (int)Math.floor(0.5 + n10 * (0.54 + 0.46 * Math.cos(0.2243994752564138 * (k - n7))) * 65536.0);
                ++k;
            }
        }
    }
    
    public static int ui(final Decimator decimator, int n) {
        if (decimator.table != null) {
            n = (int)(decimator.inputRate * 729566568 * (long)n / (decimator.outputRate * 2021266139)) + 6;
        }
        return n;
    }
    
    int scalePosition(int n, final int n2) {
        try {
            if (this.table != null) {
                n = (int)(this.inputRate * -2101247493 * (long)n / (this.outputRate * 2021266139)) + 6;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cc.aw(" + ')');
        }
    }
    
    int scaleRate(int n, final byte b) {
        try {
            if (this.table != null) {
                if (b == 16) {
                    throw new IllegalStateException();
                }
                n = (int)(n * (long)(this.inputRate * -2101247493) / (this.outputRate * 2021266139));
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cc.an(" + ')');
        }
    }
    
    public static int scaleRate(final int n, final int n2) {
        try {
            return 255 - (n & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cc.an(" + ')');
        }
    }
    
    byte[] ac(byte[] array) {
        if (this.table != null) {
            final int n = (int)(this.inputRate * -1272652256 * (long)array.length / (-620693984 * this.outputRate)) + 14;
            final int[] array2 = new int[n];
            int n2 = 0;
            int n3 = 0;
            for (int i = 0; i < array.length; ++i) {
                final byte b = array[i];
                final int[] array3 = this.table[n3];
                for (int j = 0; j < 14; ++j) {
                    final int[] array4 = array2;
                    final int n4 = n2 + j;
                    array4[n4] += array3[j] * b;
                }
                final int n5 = n3 + 1030836014 * this.inputRate;
                final int n6 = n5 / (2021266139 * this.outputRate);
                n2 += n6;
                n3 = n5 - n6 * (-2066945982 * this.outputRate);
            }
            array = new byte[n];
            for (int k = 0; k < n; ++k) {
                final int n7 = 32768 + array2[k] >> 16;
                if (n7 < -1368561390) {
                    array[k] = -128;
                }
                else if (n7 > 1345854960) {
                    array[k] = (byte)212663558;
                }
                else {
                    array[k] = (byte)n7;
                }
            }
        }
        return array;
    }
    
    public static void um(final class394 class394) {
        class394.field3683.remove("Accept");
        if (!class394.field3685.isEmpty()) {
            class394.field3683.put("Accept", class394.ri(class394, -563044923));
        }
    }
    
    int au(int n) {
        if (this.table != null) {
            n = (int)(n * (long)(this.inputRate * -2101247493) / (this.outputRate * 2021266139));
        }
        return n;
    }
    
    static void method328(final Font font, final Font font2, final byte b) {
        try {
            if (null == class476.worldSelectBackSprites) {
                final Archive archive8 = class452.archive8;
                SpritePixels[] method699;
                if (!AbstractArchive.sh(archive8, "sl_back", "", -1313069490)) {
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                    method699 = null;
                }
                else {
                    final int fileFlat = AbstractArchive.getFileFlat(archive8, "sl_back", 2029828949);
                    method699 = UserComparator3.method699(archive8, fileFlat, archive8.getFileId(fileFlat, "", (short)8192), 1271520368);
                }
                class476.worldSelectBackSprites = method699;
            }
            if (null == class16.worldSelectFlagSprites) {
                class16.worldSelectFlagSprites = class314.method1708(class452.archive8, "sl_flags", "", 1567788624);
            }
            if (DevicePcmPlayerProvider.worldSelectArrows == null) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                DevicePcmPlayerProvider.worldSelectArrows = class314.method1708(class452.archive8, "sl_arrows", "", 2088277389);
            }
            if (World.worldSelectStars == null) {
                if (b >= 1) {
                    return;
                }
                World.worldSelectStars = class314.method1708(class452.archive8, "sl_stars", "", -1730262222);
            }
            if (PlayerType.worldSelectLeftSprite == null) {
                PlayerType.worldSelectLeftSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "leftarrow", "", -1123804584);
            }
            if (class13.worldSelectRightSprite == null) {
                if (b >= 1) {
                    return;
                }
                class13.worldSelectRightSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(class452.archive8, "rightarrow", "", -143232821);
            }
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 578342931, 23, 765, 480, 0);
            Rasterizer2D.Rasterizer2D_fillRectangleGradient(578342931 * Login.xPadding, 0, 125, 23, 12425273, 9135624);
            Rasterizer2D.Rasterizer2D_fillRectangleGradient(125 + Login.xPadding * 578342931, 0, 640, 23, 5197647, 2697513);
            font.aj(Strings.mo, Login.xPadding * 578342931 + 62, 15, 0, -1);
            if (null != World.worldSelectStars) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                World.worldSelectStars[1].ax(Login.xPadding * 578342931 + 140, 1);
                class492.xb(font2, Strings.mn, 578342931 * Login.xPadding + 152, 10, 16777215, -1);
                World.worldSelectStars[0].ax(Login.xPadding * 578342931 + 140, 12);
                class492.xb(font2, Strings.mi, 152 + Login.xPadding * 578342931, 21, 16777215, -1);
            }
            Label_1078: {
                if (DevicePcmPlayerProvider.worldSelectArrows != null) {
                    final int n = 578342931 * Login.xPadding + 280;
                    Label_0507: {
                        if (World.World_sortOption1[0] == 0) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            if (World.World_sortOption2[0] == 0) {
                                if (b >= 1) {
                                    return;
                                }
                                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n, 4);
                                break Label_0507;
                            }
                        }
                        DevicePcmPlayerProvider.worldSelectArrows[0].ax(n, 4);
                    }
                    Label_0583: {
                        if (World.World_sortOption1[0] == 0) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            if (1 == World.World_sortOption2[0]) {
                                if (b >= 1) {
                                    throw new IllegalStateException();
                                }
                                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n, 4);
                                break Label_0583;
                            }
                        }
                        DevicePcmPlayerProvider.worldSelectArrows[1].ax(n + 15, 4);
                    }
                    class492.xb(font, Strings.md, 32 + n, 17, 16777215, -1);
                    final int n2 = Login.xPadding * 578342931 + 390;
                    Label_0675: {
                        if (1 == World.World_sortOption1[0]) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            if (0 == World.World_sortOption2[0]) {
                                if (b >= 1) {
                                    throw new IllegalStateException();
                                }
                                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n2, 4);
                                break Label_0675;
                            }
                        }
                        DevicePcmPlayerProvider.worldSelectArrows[0].ax(n2, 4);
                    }
                    if (World.World_sortOption1[0] == 1 && 1 == World.World_sortOption2[0]) {
                        if (b >= 1) {
                            throw new IllegalStateException();
                        }
                        DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n2, 4);
                    }
                    else {
                        DevicePcmPlayerProvider.worldSelectArrows[1].ax(n2 + 15, 4);
                    }
                    class492.xb(font, Strings.mr, 32 + n2, 17, 16777215, -1);
                    final int n3 = Login.xPadding * 578342931 + 500;
                    Label_0850: {
                        if (2 == World.World_sortOption1[0]) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            if (0 == World.World_sortOption2[0]) {
                                if (b >= 1) {
                                    throw new IllegalStateException();
                                }
                                DevicePcmPlayerProvider.worldSelectArrows[2].ax(n3, 4);
                                break Label_0850;
                            }
                        }
                        DevicePcmPlayerProvider.worldSelectArrows[0].ax(n3, 4);
                    }
                    while (true) {
                        Label_2366: {
                            if (World.World_sortOption1[0] != 2) {
                                break Label_2366;
                            }
                            if (b >= 1) {
                                return;
                            }
                            if (World.World_sortOption2[0] != 1) {
                                break Label_2366;
                            }
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            DevicePcmPlayerProvider.worldSelectArrows[3].ax(n3 + 15, 4);
                            class492.xb(font, Strings.ml, 32 + n3, 17, 16777215, -1);
                            final int n4 = Login.xPadding * 578342931 + 610;
                            Label_0990: {
                                if (World.World_sortOption1[0] == 3) {
                                    if (b >= 1) {
                                        return;
                                    }
                                    if (World.World_sortOption2[0] == 0) {
                                        if (b >= 1) {
                                            throw new IllegalStateException();
                                        }
                                        DevicePcmPlayerProvider.worldSelectArrows[2].ax(n4, 4);
                                        break Label_0990;
                                    }
                                }
                                DevicePcmPlayerProvider.worldSelectArrows[0].ax(n4, 4);
                            }
                            if (3 == World.World_sortOption1[0] && 1 == World.World_sortOption2[0]) {
                                if (b >= 1) {
                                    throw new IllegalStateException();
                                }
                                DevicePcmPlayerProvider.worldSelectArrows[3].ax(15 + n4, 4);
                            }
                            else {
                                DevicePcmPlayerProvider.worldSelectArrows[1].ax(n4 + 15, 4);
                            }
                            class492.xb(font, Strings.mf, n4 + 32, 17, 16777215, -1);
                            break Label_1078;
                        }
                        DevicePcmPlayerProvider.worldSelectArrows[1].ax(15 + n3, 4);
                        continue;
                    }
                }
            }
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding * 578342931 + 708, 4, 50, 16, 0);
            font2.aj(Strings.jl, 25 + (708 + Login.xPadding * 578342931), 16, 16777215, -1);
            Login.hoveredWorldIndex = 848889613;
            Label_2936: {
                if (class476.worldSelectBackSprites != null) {
                    final int n5 = 88;
                    final int n6 = 19;
                    int n7 = 765 / (n5 + 1) - 1;
                    int n8 = 480 / (1 + n6);
                Label_1373:
                    while (true) {
                        break Label_1373;
                        do {
                            int n9 = 0;
                            if (n9 == n7) {
                                if (b >= 1) {
                                    return;
                                }
                                int n10 = (765 - n5 * n7) / (n7 + 1);
                                if (n10 > 5) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    n10 = 5;
                                }
                                int n11 = (480 - n8 * n6) / (n8 + 1);
                                if (n11 > 5) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    n11 = 5;
                                }
                                final int n12 = (765 - n5 * n7 - n10 * (n7 - 1)) / 2;
                                final int n13 = (480 - n6 * n8 - n11 * (n8 - 1)) / 2;
                                Login.worldSelectPagesCount = ((-734287707 * World.World_count + n8 - 1) / n8 - n7) * 1853447421;
                                if (PlayerType.worldSelectLeftSprite != null) {
                                    if (b >= 1) {
                                        return;
                                    }
                                    if (Login.worldSelectPage * 1246310743 > 0) {
                                        if (b >= 1) {
                                            throw new IllegalStateException();
                                        }
                                        PlayerType.worldSelectLeftSprite.ax(8, class262.canvasHeight * 1658005443 / 2 - PlayerType.worldSelectLeftSprite.subWidth / 2);
                                    }
                                }
                                if (class13.worldSelectRightSprite != null) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    if (1246310743 * Login.worldSelectPage < Login.worldSelectPagesCount * 1959698517) {
                                        class13.worldSelectRightSprite.ax(GameEngine.canvasWidth * -1687260435 - class13.worldSelectRightSprite.yOffset - 8, 1658005443 * class262.canvasHeight / 2 - class13.worldSelectRightSprite.subWidth / 2);
                                    }
                                }
                                int n14 = n13 + 23;
                                int n15 = Login.xPadding * 578342931 + n12;
                                int n16 = 0;
                                boolean b2 = false;
                                int n17 = 1246310743 * Login.worldSelectPage;
                                int i = n8 * n17;
                                while (i < World.World_count * -734287707) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    if (n17 - 1246310743 * Login.worldSelectPage >= n7) {
                                        if (b >= 1) {
                                            throw new IllegalStateException();
                                        }
                                        break;
                                    }
                                    else {
                                        final World world = class31.World_worlds[i];
                                        boolean b3 = true;
                                        String s = Integer.toString(-1396846889 * world.population);
                                        if (-1 == -1396846889 * world.population) {
                                            s = Strings.my;
                                            b3 = false;
                                        }
                                        else if (world.population * -1396846889 > 1980) {
                                            if (b >= 1) {
                                                throw new IllegalStateException();
                                            }
                                            s = Strings.mk;
                                            b3 = false;
                                        }
                                        class103 class103 = null;
                                        int n18 = 0;
                                        if (World.hu(world, 578362576)) {
                                            if (b >= 1) {
                                                return;
                                            }
                                            class103 class104;
                                            if (world.isMembersOnly(1029039210)) {
                                                if (b >= 1) {
                                                    throw new IllegalStateException();
                                                }
                                                class104 = class103.field1103;
                                            }
                                            else {
                                                class104 = class103.field1105;
                                            }
                                            class103 = class104;
                                        }
                                        else if (world.isDeadman(-1583670467)) {
                                            class103 class105;
                                            if (world.isMembersOnly(1029039210)) {
                                                if (b >= 1) {
                                                    throw new IllegalStateException();
                                                }
                                                class105 = class103.field1114;
                                            }
                                            else {
                                                class105 = class103.field1113;
                                            }
                                            class103 = class105;
                                        }
                                        else if (World.yk(world, (byte)62)) {
                                            if (b >= 1) {
                                                throw new IllegalStateException();
                                            }
                                            n18 = 16711680;
                                            class103 class106;
                                            if (world.isMembersOnly(1029039210)) {
                                                if (b >= 1) {
                                                    throw new IllegalStateException();
                                                }
                                                class106 = class103.field1104;
                                            }
                                            else {
                                                class106 = class103.field1101;
                                            }
                                            class103 = class106;
                                        }
                                        else if (world.method404((byte)99)) {
                                            if (b >= 1) {
                                                throw new IllegalStateException();
                                            }
                                            class103 = (world.isMembersOnly(1029039210) ? class103.field1115 : class103.field1106);
                                        }
                                        else if (world.isPvp(1502648578)) {
                                            if (b >= 1) {
                                                throw new IllegalStateException();
                                            }
                                            class103 class107;
                                            if (world.isMembersOnly(1029039210)) {
                                                if (b >= 1) {
                                                    throw new IllegalStateException();
                                                }
                                                class107 = class103.field1102;
                                            }
                                            else {
                                                class107 = class103.field1110;
                                            }
                                            class103 = class107;
                                        }
                                        else if (world.method405(-459773999)) {
                                            if (b >= 1) {
                                                throw new IllegalStateException();
                                            }
                                            class103 class108;
                                            if (world.isMembersOnly(1029039210)) {
                                                if (b >= 1) {
                                                    throw new IllegalStateException();
                                                }
                                                class108 = class103.field1107;
                                            }
                                            else {
                                                class108 = class103.field1109;
                                            }
                                            class103 = class108;
                                        }
                                        else if (world.method406((byte)116)) {
                                            class103 class109;
                                            if (world.isMembersOnly(1029039210)) {
                                                if (b >= 1) {
                                                    return;
                                                }
                                                class109 = class103.field1112;
                                            }
                                            else {
                                                class109 = class103.field1111;
                                            }
                                            class103 = class109;
                                        }
                                        Label_2458: {
                                            if (null != class103) {
                                                if (b >= 1) {
                                                    throw new IllegalStateException();
                                                }
                                                if (class103.field1099 * 1140778173 < class476.worldSelectBackSprites.length) {
                                                    break Label_2458;
                                                }
                                                if (b >= 1) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                            class103 class110;
                                            if (world.isMembersOnly(1029039210)) {
                                                if (b >= 1) {
                                                    throw new IllegalStateException();
                                                }
                                                class110 = class103.field1100;
                                            }
                                            else {
                                                class110 = class103.field1108;
                                            }
                                            class103 = class110;
                                        }
                                        Label_0871: {
                                            if (MouseHandler.MouseHandler_x * -2063363905 >= n15) {
                                                if (b >= 1) {
                                                    return;
                                                }
                                                if (MouseHandler.MouseHandler_y * -1224153235 >= n14 && -2063363905 * MouseHandler.MouseHandler_x < n15 + n5) {
                                                    if (b >= 1) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (MouseHandler.MouseHandler_y * -1224153235 < n6 + n14) {
                                                        if (b >= 1) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (b3) {
                                                            if (b >= 1) {
                                                                throw new IllegalStateException();
                                                            }
                                                            Login.hoveredWorldIndex = i * -848889613;
                                                            MusicTrack.mg(class476.worldSelectBackSprites[1140778173 * class103.field1099], n15, n14, 128, 16777215);
                                                            b2 = true;
                                                            break Label_0871;
                                                        }
                                                    }
                                                }
                                            }
                                            class476.worldSelectBackSprites[1140778173 * class103.field1099].ca(n15, n14);
                                        }
                                        if (null != class16.worldSelectFlagSprites) {
                                            if (b >= 1) {
                                                throw new IllegalStateException();
                                            }
                                            final IndexedSprite[] worldSelectFlagSprites = class16.worldSelectFlagSprites;
                                            int n19;
                                            if (world.isMembersOnly(1029039210)) {
                                                if (b >= 1) {
                                                    throw new IllegalStateException();
                                                }
                                                n19 = 8;
                                            }
                                            else {
                                                n19 = 0;
                                            }
                                            worldSelectFlagSprites[n19 + world.location * -665846519].ax(n15 + 29, n14);
                                        }
                                        font.aj(Integer.toString(-2091224171 * world.id), 15 + n15, 5 + (n6 / 2 + n14), n18, -1);
                                        font2.aj(s, n15 + 60, 5 + (n6 / 2 + n14), 268435455, -1);
                                        n14 += n11 + n6;
                                        if (++n16 >= n8) {
                                            if (b >= 1) {
                                                throw new IllegalStateException();
                                            }
                                            n14 = 23 + n13;
                                            n15 += n5 + n10;
                                            n16 = 0;
                                            ++n17;
                                        }
                                        ++i;
                                    }
                                }
                                if (!b2) {
                                    break Label_2936;
                                }
                                if (b >= 1) {
                                    return;
                                }
                                final int n20 = font2.bf(class31.World_worlds[Login.hoveredWorldIndex * 248569915].activity) + 6;
                                final int n21 = 8 + font2.al;
                                int n22 = MouseHandler.MouseHandler_y * -1224153235 + 25;
                                if (n21 + n22 > 480) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    n22 = -1224153235 * MouseHandler.MouseHandler_y - 25 - n21;
                                }
                                Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x * -2063363905 - n20 / 2, n22, n20, n21, 16777120);
                                Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x * -2063363905 - n20 / 2, n22, n20, n21, 0);
                                font2.aj(class31.World_worlds[Login.hoveredWorldIndex * 248569915].activity, -2063363905 * MouseHandler.MouseHandler_x, 4 + (font2.al + n22), 0, -1);
                                break Label_2936;
                            }
                            else {
                                final int n23 = n8;
                                n9 = n7;
                                if (n8 * (n7 - 1) >= -734287707 * World.World_count) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    --n7;
                                }
                                if (n7 * (n8 - 1) >= -734287707 * World.World_count) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    --n8;
                                }
                                if ((n8 - 1) * n7 >= World.World_count * -734287707) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    --n8;
                                }
                                if (n8 == n23) {
                                    continue;
                                }
                                continue Label_1373;
                            }
                        } while (b < 1);
                        break;
                    }
                    throw new IllegalStateException();
                }
            }
            RouteStrategy.rasterProvider.drawFull(0, 0, 156832049);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cc.ai(" + ')');
        }
    }
    
    static void setWindowedMode(final int n, final byte b) {
        try {
            Client.field581 = 0L;
            if (n >= 2) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                Client.isResizable = true;
                Client.fa(-1);
            }
            else {
                Client.isResizable = false;
                Client.fa(-1);
            }
            if (GrandExchangeOfferNameComparator.getWindowedMode(1926093694) == 1) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                ScriptFrame.client.al(765, 503, (byte)2);
            }
            else {
                ScriptFrame.client.al(7680, 2160, (byte)2);
            }
            if (-1275976559 * Client.gameState >= 25) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                class1.method4(339651855);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cc.ir(" + ')');
        }
    }
    
    byte[] resample(byte[] array, final int n) {
        try {
            if (this.table != null) {
                if (n != 33076536) {
                    throw new IllegalStateException();
                }
                final int n2 = (int)(this.inputRate * -2101247493 * (long)array.length / (2021266139 * this.outputRate)) + 14;
                final int[] array2 = new int[n2];
                int n3 = 0;
                int n4 = 0;
                for (int i = 0; i < array.length; ++i) {
                    if (n != 33076536) {
                        throw new IllegalStateException();
                    }
                    final byte b = array[i];
                    final int[] array3 = this.table[n4];
                    for (int j = 0; j < 14; ++j) {
                        if (n != 33076536) {
                            throw new IllegalStateException();
                        }
                        final int[] array4 = array2;
                        final int n5 = n3 + j;
                        array4[n5] += array3[j] * b;
                    }
                    final int n6 = n4 + -2101247493 * this.inputRate;
                    final int n7 = n6 / (2021266139 * this.outputRate);
                    n3 += n7;
                    n4 = n6 - n7 * (2021266139 * this.outputRate);
                }
                array = new byte[n2];
                for (int k = 0; k < n2; ++k) {
                    if (n != 33076536) {
                        throw new IllegalStateException();
                    }
                    final int n8 = 32768 + array2[k] >> 16;
                    if (n8 < -128) {
                        if (n != 33076536) {
                            throw new IllegalStateException();
                        }
                        array[k] = -128;
                    }
                    else if (n8 > 127) {
                        if (n != 33076536) {
                            throw new IllegalStateException();
                        }
                        array[k] = 127;
                    }
                    else {
                        array[k] = (byte)n8;
                    }
                }
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cc.af(" + ')');
        }
    }
    
    int ab(int n) {
        if (this.table != null) {
            n = (int)(n * (long)(this.inputRate * -260152527) / (this.outputRate * 2021266139));
        }
        return n;
    }
    
    int aq(int n) {
        if (this.table != null) {
            n = (int)(this.inputRate * -2101247493 * (long)n / (this.outputRate * 2021266139)) + 6;
        }
        return n;
    }
    
    public static ArrayList ef(final class166 class166) {
        return class166.field1424;
    }
    
    static final void method325(final Player player, final int n, final int n2, final MoveSpeed moveSpeed, final int n3) {
        try {
            final int n4 = player.cf[0];
            final int n5 = player.dy[0];
            final int transformedSize = player.transformedSize((byte)(-116));
            if (n4 >= transformedSize) {
                if (n3 != -1796483670) {
                    throw new IllegalStateException();
                }
                if (n4 < 104 - transformedSize) {
                    if (n3 != -1796483670) {
                        throw new IllegalStateException();
                    }
                    if (n5 >= transformedSize) {
                        if (n3 != -1796483670) {
                            throw new IllegalStateException();
                        }
                        if (n5 < 104 - transformedSize) {
                            if (n >= transformedSize) {
                                if (n3 != -1796483670) {
                                    return;
                                }
                                if (n < 104 - transformedSize) {
                                    if (n3 != -1796483670) {
                                        throw new IllegalStateException();
                                    }
                                    if (n2 >= transformedSize) {
                                        if (n3 != -1796483670) {
                                            throw new IllegalStateException();
                                        }
                                        if (n2 >= 104 - transformedSize) {
                                            if (n3 != -1796483670) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        else {
                                            final int n6 = n4;
                                            final int n7 = n5;
                                            final int transformedSize2 = player.transformedSize((byte)(-96));
                                            Client.field653.af = -1369677151 * n;
                                            Client.field653.an = -2066887785 * n2;
                                            Client.field653.aw = -2134236799;
                                            Client.field653.ac = -1188140267;
                                            final int vmethod3254 = class144.vmethod3254(n6, n7, transformedSize2, Client.field653, Client.collisionMaps[-1900490645 * player.plane], true, Client.field654, Client.field655, 1716451155);
                                            if (vmethod3254 >= 1) {
                                                for (int i = 0; i < vmethod3254 - 1; ++i) {
                                                    if (n3 != -1796483670) {
                                                        throw new IllegalStateException();
                                                    }
                                                    player.method513(Client.field654[i], Client.field655[i], moveSpeed, 475560620);
                                                }
                                                return;
                                            }
                                            if (n3 != -1796483670) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cc.kq(" + ')');
        }
    }
    
    static final void method331(final int n, final int n2, final boolean b, final byte b2) {
        if (!b || n != class28.timeOfPreviousKeyPress * 1717695041 || n2 != class425.field3798 * 583188571) {
            assert Client.gk == null;
            assert Client.uo == null;
            if (Client.uo != null) {
                Client.nw.error("Loading map {},{},{} while another map load is in progress!", new Object[] { n, n2, b });
                try {
                    Client.uo.join();
                }
                catch (InterruptedException ex) {
                    Client.nw.error("map load interrupted", (Throwable)ex);
                }
                Client.cp("concurrent map load", null);
            }
            final rl2 rl2 = new rl2();
            rl2.bq = Client.isInInstance;
            rl2.ee = Client.instanceChunkTemplates;
            rl2.se = GameObject.xteaKeys;
            rl2.bm = WorldMapAreaData.regions;
            rl2.xk = FontName.regionMapArchiveIds;
            rl2.ti = Archive.regionLandArchiveIds;
            rl2.en = class4.regionLandArchives;
            rl2.jb = ObjectSound.regionMapArchives;
            rl2.jk = (n - 6) * 8;
            rl2.uk = (n2 - 6) * 8;
            rl2.js = n;
            rl2.py = n2;
            assert !Client.tt;
            if (Client.gameState * -1275976559 != 30) {
                Client.oh(rl2);
                assert ScriptFrame.client.kh() == 25;
                Client.yn = null;
            }
            else {
                Client.isInInstance = Client.uf;
                Client.instanceChunkTemplates = Client.gd;
                GameObject.xteaKeys = Client.uo;
                WorldMapAreaData.regions = Client.ux;
                FontName.regionMapArchiveIds = Client.zk;
                Archive.regionLandArchiveIds = Client.vz;
                class4.regionLandArchives = Client.zs;
                ObjectSound.regionMapArchives = Client.yu;
                Client.tt = true;
                assert Client.yn == null;
            }
            Client.gk = rl2;
            (Client.uo = new Thread(rl2, "Map loader")).setDaemon(true);
            Client.uo.start();
        }
    }
    
    public static int yr(final Decimator decimator, int n, final byte b) {
        if (decimator == null) {
            decimator.scaleRate(n, b);
        }
        try {
            if (decimator.table != null) {
                if (b == 16) {
                    throw new IllegalStateException();
                }
                n = (int)(n * (long)(decimator.inputRate * -2101247493) / (decimator.outputRate * 2021266139));
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cc.an(" + ')');
        }
    }
}
