import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Tiles
{
    static byte[][][] field819;
    static final int[] field820;
    static int[][] field821;
    static short[][][] Tiles_overlays;
    static int Tiles_minPlane;
    static byte[][][] field824;
    static final int av = 1170;
    static int[][][] Tiles_heights;
    static int[] Tiles_saturation;
    static final int[] field827;
    static final int ar = 2340;
    static byte[][][] Tiles_renderFlags;
    static final int[] field829;
    static final int[] field830;
    static byte[][][] Tiles_shapes;
    static final int[] field832;
    static final int[] field833;
    static int rndHue;
    static int rndLightness;
    public static final String kl = "Date not valid.";
    
    Tiles() throws Throwable {
        throw new Error();
    }
    
    static {
        Tiles.Tiles_heights = new int[4][105][105];
        Tiles.Tiles_renderFlags = new byte[4][104][104];
        Tiles.Tiles_minPlane = -256673141;
        field820 = new int[] { 1, 2, 4, 8 };
        field829 = new int[] { 16, 32, 64, 128 };
        field830 = new int[] { 1, 0, -1, 0 };
        field827 = new int[] { 0, -1, 0, 1 };
        field832 = new int[] { 1, -1, -1, 1 };
        field833 = new int[] { -1, -1, 1, 1 };
        Tiles.rndHue = ((int)(Math.random() * 17.0) - 8) * 1514061769;
        Tiles.rndLightness = ((int)(Math.random() * 33.0) - 16) * 1193325609;
    }
    
    static final int cs(final int n, final int n2, final int n3) {
        final int n4 = n / n3;
        final int n5 = n & n3 - 1;
        final int n6 = n2 / n3;
        return JagexCache.method952(JagexCache.method952(class383.method2085(n4, n6, (byte)108), class383.method2085(1 + n4, n6, (byte)54), n5, n3, (byte)(-126)), JagexCache.method952(class383.method2085(n4, n6 + 1, (byte)54), class383.method2085(n4 + 1, n6 + 1, (byte)112), n5, n3, (byte)(-69)), n2 & n3 - 1, n3, (byte)(-91));
    }
    
    static final boolean bs(final byte[] array, final int n, final int n2) {
        boolean b = true;
        final Buffer buffer = new Buffer(array);
        int n3 = -1;
        while (true) {
            final int method2518 = Buffer.method2518(buffer, (byte)(-11));
            if (method2518 == 0) {
                break;
            }
            n3 += method2518;
            int n4 = 0;
            int n5 = 0;
            while (true) {
                if (n5 != 0) {
                    if (0 == buffer.readUShortSmart(-936152514)) {
                        break;
                    }
                    Buffer.ra(buffer, (byte)7);
                }
                else {
                    final int uShortSmart = buffer.readUShortSmart(-1068101804);
                    if (uShortSmart == 0) {
                        break;
                    }
                    n4 += uShortSmart - 1;
                    final int n6 = n4 & 0xD6D799D8;
                    final int n7 = n4 >> 6 & 0x3F;
                    final int n8 = Buffer.ra(buffer, (byte)7) >> 2;
                    final int n9 = n7 + n;
                    final int n10 = n2 + n6;
                    if (n9 <= 0 || n10 <= 0 || n9 >= -1738618958 || n10 >= -757813750) {
                        continue;
                    }
                    final ObjectComposition vmethod3248 = class144.vmethod3248(n3, (short)9922);
                    if (n8 == 22 && Client.isLowDetail && 0 == vmethod3248.int1 * 415653149 && -973955889 * vmethod3248.interactType != 1 && !vmethod3248.boolean2) {
                        continue;
                    }
                    if (!ObjectComposition.bp(vmethod3248, -1344435480)) {
                        Client.field425 -= 1606078750;
                        b = false;
                    }
                    n5 = 1;
                }
            }
        }
        return b;
    }
    
    static final int ca(final int n, final int n2) {
        final int n3 = 57 * n2 + n;
        final int n4 = n3 << 13 ^ n3;
        return (-1013292448 + (-109021845 * (n4 * n4) - 1245323502) * n4 & Integer.MAX_VALUE) >> 19 & 0xFF;
    }
    
    static void ad() {
        Tiles.Tiles_minPlane = -1459603960;
        class186.Tiles_underlays = new short[4][104][104];
        Tiles.Tiles_overlays = new short[4][104][104];
        Tiles.Tiles_shapes = new byte[4][104][104];
        Tiles.field824 = new byte[4][104][104];
        class161.field1407 = new int[4][1477052489][-1218296663];
        Tiles.field819 = new byte[4][-1447253213][-983285050];
        Tiles.field821 = new int[1314710314][105];
        FileSystem.Tiles_hue = new int[-1421174820];
        Tiles.Tiles_saturation = new int[104];
        class283.Tiles_lightness = new int[104];
        UserComparator4.Tiles_hueMultiplier = new int[104];
        class31.field92 = new int[1764016631];
    }
    
    static final void ba(final Scene scene, final CollisionMap[] array) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 104; ++j) {
                for (int k = 0; k < 104; ++k) {
                    if ((Tiles.Tiles_renderFlags[i][j][k] & 0x1) == 0x1) {
                        int n = i;
                        if (0x2 == (Tiles.Tiles_renderFlags[1][j][k] & 0x2)) {
                            --n;
                        }
                        if (n >= 0) {
                            array[n].setBlockedByFloor(j, k, (byte)20);
                        }
                    }
                }
            }
        }
        Tiles.rndHue += ((int)(Math.random() * 5.0) - 2) * 1514061769;
        if (-372405639 * Tiles.rndHue < -8) {
            Tiles.rndHue = 772407736;
        }
        if (-372405639 * Tiles.rndHue > 8) {
            Tiles.rndHue = -772407736;
        }
        Tiles.rndLightness += ((int)(Math.random() * 5.0) - 2) * 1193325609;
        if (Tiles.rndLightness * -647485415 < -16) {
            Tiles.rndLightness = -1913340560;
        }
        if (Tiles.rndLightness * -647485415 > 16) {
            Tiles.rndLightness = 1913340560;
        }
        for (int l = 0; l < 4; ++l) {
            final byte[][] array2 = Tiles.field819[l];
            final int n2 = 768 * (int)Math.sqrt(5100.0) >> 8;
            for (int n3 = 1; n3 < 103; ++n3) {
                for (int n4 = 1; n4 < 103; ++n4) {
                    final int n5 = Tiles.Tiles_heights[l][1 + n4][n3] - Tiles.Tiles_heights[l][n4 - 1][n3];
                    final int n6 = Tiles.Tiles_heights[l][n4][n3 + 1] - Tiles.Tiles_heights[l][n4][n3 - 1];
                    final int n7 = (int)Math.sqrt(n6 * n6 + (65536 + n5 * n5));
                    Tiles.field821[n4][n3] = 96 + ((n6 << 8) / n7 * -50 + (-10 * (65536 / n7) + -50 * ((n5 << 8) / n7))) / n2 - ((array2[n4][1 + n3] >> 3) + ((array2[n4][n3 - 1] >> 2) + ((array2[1 + n4][n3] >> 3) + (array2[n4 - 1][n3] >> 2))) + (array2[n4][n3] >> 1));
                }
            }
            for (int n8 = 0; n8 < 104; ++n8) {
                FileSystem.Tiles_hue[n8] = 0;
                Tiles.Tiles_saturation[n8] = 0;
                class283.Tiles_lightness[n8] = 0;
                UserComparator4.Tiles_hueMultiplier[n8] = 0;
                class31.field92[n8] = 0;
            }
            for (int n9 = -5; n9 < 109; ++n9) {
                for (int n10 = 0; n10 < 104; ++n10) {
                    final int n11 = 5 + n9;
                    if (n11 >= 0 && n11 < 104) {
                        final int n12 = class186.Tiles_underlays[l][n11][n10] & (int)DynamicObject.method466(15, -1014239742);
                        if (n12 > 0) {
                            final int n13 = n12 - 1;
                            final FloorUnderlayDefinition floorUnderlayDefinition = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n13);
                            FloorUnderlayDefinition floorUnderlayDefinition2;
                            if (null != floorUnderlayDefinition) {
                                floorUnderlayDefinition2 = floorUnderlayDefinition;
                            }
                            else {
                                final byte[] takeFile = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n13, (byte)(-99));
                                final FloorUnderlayDefinition floorUnderlayDefinition3 = new FloorUnderlayDefinition();
                                if (null != takeFile) {
                                    floorUnderlayDefinition3.decode(new Buffer(takeFile), n13, -1983441437);
                                }
                                floorUnderlayDefinition3.postDecode(875414437);
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition3, n13);
                                floorUnderlayDefinition2 = floorUnderlayDefinition3;
                            }
                            final FloorUnderlayDefinition floorUnderlayDefinition4 = floorUnderlayDefinition2;
                            final int[] tiles_hue = FileSystem.Tiles_hue;
                            final int n14 = n10;
                            tiles_hue[n14] += floorUnderlayDefinition4.hue * 372444635;
                            final int[] tiles_saturation = Tiles.Tiles_saturation;
                            final int n15 = n10;
                            tiles_saturation[n15] += 1058265139 * floorUnderlayDefinition4.saturation;
                            final int[] tiles_lightness = class283.Tiles_lightness;
                            final int n16 = n10;
                            tiles_lightness[n16] += -1527986335 * floorUnderlayDefinition4.lightness;
                            final int[] tiles_hueMultiplier = UserComparator4.Tiles_hueMultiplier;
                            final int n17 = n10;
                            tiles_hueMultiplier[n17] += floorUnderlayDefinition4.hueMultiplier * -2012234183;
                            final int[] field92 = class31.field92;
                            final int n18 = n10;
                            ++field92[n18];
                        }
                    }
                    final int n19 = n9 - 5;
                    if (n19 >= 0 && n19 < 104) {
                        final int n20 = class186.Tiles_underlays[l][n19][n10] & (int)DynamicObject.method466(15, 1194972189);
                        if (n20 > 0) {
                            final int n21 = n20 - 1;
                            final FloorUnderlayDefinition floorUnderlayDefinition5 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n21);
                            FloorUnderlayDefinition floorUnderlayDefinition6;
                            if (floorUnderlayDefinition5 != null) {
                                floorUnderlayDefinition6 = floorUnderlayDefinition5;
                            }
                            else {
                                final byte[] takeFile2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n21, (byte)(-112));
                                final FloorUnderlayDefinition floorUnderlayDefinition7 = new FloorUnderlayDefinition();
                                if (takeFile2 != null) {
                                    floorUnderlayDefinition7.decode(new Buffer(takeFile2), n21, -1859324686);
                                }
                                floorUnderlayDefinition7.postDecode(875414437);
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition7, n21);
                                floorUnderlayDefinition6 = floorUnderlayDefinition7;
                            }
                            final FloorUnderlayDefinition floorUnderlayDefinition8 = floorUnderlayDefinition6;
                            final int[] tiles_hue2 = FileSystem.Tiles_hue;
                            final int n22 = n10;
                            tiles_hue2[n22] -= 372444635 * floorUnderlayDefinition8.hue;
                            final int[] tiles_saturation2 = Tiles.Tiles_saturation;
                            final int n23 = n10;
                            tiles_saturation2[n23] -= floorUnderlayDefinition8.saturation * 1058265139;
                            final int[] tiles_lightness2 = class283.Tiles_lightness;
                            final int n24 = n10;
                            tiles_lightness2[n24] -= -1527986335 * floorUnderlayDefinition8.lightness;
                            final int[] tiles_hueMultiplier2 = UserComparator4.Tiles_hueMultiplier;
                            final int n25 = n10;
                            tiles_hueMultiplier2[n25] -= -2012234183 * floorUnderlayDefinition8.hueMultiplier;
                            final int[] field93 = class31.field92;
                            final int n26 = n10;
                            --field93[n26];
                        }
                    }
                }
                if (n9 >= 1 && n9 < 103) {
                    int n27 = 0;
                    int n28 = 0;
                    int n29 = 0;
                    int n30 = 0;
                    int n31 = 0;
                    for (int n32 = -5; n32 < 109; ++n32) {
                        final int n33 = n32 + 5;
                        if (n33 >= 0 && n33 < 104) {
                            n27 += FileSystem.Tiles_hue[n33];
                            n28 += Tiles.Tiles_saturation[n33];
                            n29 += class283.Tiles_lightness[n33];
                            n30 += UserComparator4.Tiles_hueMultiplier[n33];
                            n31 += class31.field92[n33];
                        }
                        final int n34 = n32 - 5;
                        if (n34 >= 0 && n34 < 104) {
                            n27 -= FileSystem.Tiles_hue[n34];
                            n28 -= Tiles.Tiles_saturation[n34];
                            n29 -= class283.Tiles_lightness[n34];
                            n30 -= UserComparator4.Tiles_hueMultiplier[n34];
                            n31 -= class31.field92[n34];
                        }
                        if (n32 >= 1 && n32 < 103) {
                            if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][n9][n32] & 0x2) != 0x0 || 0x0 == (Tiles.Tiles_renderFlags[l][n9][n32] & 0x10)) {
                                if (l < Tiles.Tiles_minPlane * 1401144457) {
                                    Tiles.Tiles_minPlane = l * -1087180359;
                                }
                                final int n35 = (int)DynamicObject.method466(15, 1721780061);
                                final int n36 = class186.Tiles_underlays[l][n9][n32] & n35;
                                final int n37 = Tiles.Tiles_overlays[l][n9][n32] & n35;
                                if (n36 > 0 || n37 > 0) {
                                    final int n38 = Tiles.Tiles_heights[l][n9][n32];
                                    final int n39 = Tiles.Tiles_heights[l][n9 + 1][n32];
                                    final int n40 = Tiles.Tiles_heights[l][n9 + 1][1 + n32];
                                    final int n41 = Tiles.Tiles_heights[l][n9][n32 + 1];
                                    final int n42 = Tiles.field821[n9][n32];
                                    final int n43 = Tiles.field821[1 + n9][n32];
                                    final int n44 = Tiles.field821[n9 + 1][n32 + 1];
                                    final int n45 = Tiles.field821[n9][n32 + 1];
                                    int method1847 = -1;
                                    int method1848 = -1;
                                    if (n36 > 0) {
                                        final int n46 = n27 * 256 / n30;
                                        final int n47 = n28 / n31;
                                        final int n48 = n29 / n31;
                                        method1847 = GameBuild.method1847(n46, n47, n48, -1537224744);
                                        final int n49 = n46 + Tiles.rndHue * -372405639 & 0xFF;
                                        int n50 = n48 + Tiles.rndLightness * -647485415;
                                        if (n50 < 0) {
                                            n50 = 0;
                                        }
                                        else if (n50 > 255) {
                                            n50 = 255;
                                        }
                                        method1848 = GameBuild.method1847(n49, n47, n50, 62103772);
                                    }
                                    if (l > 0) {
                                        boolean b = true;
                                        if (n36 == 0 && 0 != Tiles.Tiles_shapes[l][n9][n32]) {
                                            b = false;
                                        }
                                        if (n37 > 0) {
                                            final int n51 = n37 - 1;
                                            final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n51);
                                            FloorOverlayDefinition floorOverlayDefinition2;
                                            if (floorOverlayDefinition != null) {
                                                floorOverlayDefinition2 = floorOverlayDefinition;
                                            }
                                            else {
                                                final byte[] takeFile3 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n51, (byte)(-128));
                                                final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                                                if (takeFile3 != null) {
                                                    floorOverlayDefinition3.decode(new Buffer(takeFile3), n51, (short)128);
                                                }
                                                floorOverlayDefinition3.postDecode(1148599876);
                                                FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n51);
                                                floorOverlayDefinition2 = floorOverlayDefinition3;
                                            }
                                            if (!floorOverlayDefinition2.hideUnderlay) {
                                                b = false;
                                            }
                                        }
                                        if (b && n38 == n39 && n38 == n40 && n41 == n38) {
                                            final int[] array3 = class161.field1407[l][n9];
                                            final int n52 = n32;
                                            array3[n52] |= 0x924;
                                        }
                                    }
                                    int n53 = 0;
                                    if (method1848 != -1) {
                                        n53 = Rasterizer3D.Rasterizer3D_colorPalette[class10.method41(method1848, 96, -85948080)];
                                    }
                                    if (n37 == 0) {
                                        scene.addTile(l, n9, n32, 0, 0, -1, n38, n39, n40, n41, class10.method41(method1847, n42, -1456019369), class10.method41(method1847, n43, -1273689681), class10.method41(method1847, n44, 1220459531), class10.method41(method1847, n45, -1726793968), 0, 0, 0, 0, n53, 0);
                                    }
                                    else {
                                        final int n54 = Tiles.Tiles_shapes[l][n9][n32] + 1;
                                        final byte b2 = Tiles.field824[l][n9][n32];
                                        final int n55 = n37 - 1;
                                        final FloorOverlayDefinition floorOverlayDefinition4 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n55);
                                        FloorOverlayDefinition floorOverlayDefinition5;
                                        if (floorOverlayDefinition4 != null) {
                                            floorOverlayDefinition5 = floorOverlayDefinition4;
                                        }
                                        else {
                                            final byte[] takeFile4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n55, (byte)(-20));
                                            final FloorOverlayDefinition floorOverlayDefinition6 = new FloorOverlayDefinition();
                                            if (takeFile4 != null) {
                                                floorOverlayDefinition6.decode(new Buffer(takeFile4), n55, (short)128);
                                            }
                                            floorOverlayDefinition6.postDecode(-1145827992);
                                            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition6, n55);
                                            floorOverlayDefinition5 = floorOverlayDefinition6;
                                        }
                                        final FloorOverlayDefinition floorOverlayDefinition7 = floorOverlayDefinition5;
                                        int n56 = floorOverlayDefinition7.texture * -202963991;
                                        int n57;
                                        int method1849;
                                        if (n56 >= 0) {
                                            n57 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(n56, -1505957445);
                                            method1849 = -1;
                                        }
                                        else if (16711935 == 1889574527 * floorOverlayDefinition7.primaryRgb) {
                                            method1849 = -2;
                                            n56 = -1;
                                            n57 = -2;
                                        }
                                        else {
                                            method1849 = GameBuild.method1847(floorOverlayDefinition7.hue * 174415927, floorOverlayDefinition7.saturation * 470803713, floorOverlayDefinition7.lightness * 532980473, -460036492);
                                            final int n58 = -372405639 * Tiles.rndHue + floorOverlayDefinition7.hue * 174415927 & 0xFF;
                                            int n59 = floorOverlayDefinition7.lightness * 532980473 + Tiles.rndLightness * -647485415;
                                            if (n59 < 0) {
                                                n59 = 0;
                                            }
                                            else if (n59 > 255) {
                                                n59 = 255;
                                            }
                                            n57 = GameBuild.method1847(n58, floorOverlayDefinition7.saturation * 470803713, n59, -592785709);
                                        }
                                        int n60 = 0;
                                        if (n57 != -2) {
                                            n60 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(n57, 96, (byte)0)];
                                        }
                                        if (-1 != floorOverlayDefinition7.secondaryRgb * -2085280195) {
                                            final int n61 = floorOverlayDefinition7.secondaryHue * -187777599 + -372405639 * Tiles.rndHue & 0xFF;
                                            int n62 = Tiles.rndLightness * -647485415 + floorOverlayDefinition7.secondaryLightness * -1379609783;
                                            if (n62 < 0) {
                                                n62 = 0;
                                            }
                                            else if (n62 > 255) {
                                                n62 = 255;
                                            }
                                            n60 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(GameBuild.method1847(n61, floorOverlayDefinition7.secondarySaturation * 1797179473, n62, -450912179), 96, (byte)0)];
                                        }
                                        scene.addTile(l, n9, n32, n54, b2, n56, n38, n39, n40, n41, class10.method41(method1847, n42, 789256558), class10.method41(method1847, n43, 408792077), class10.method41(method1847, n44, 705306519), class10.method41(method1847, n45, -685087200), class478.method2437(method1849, n42, (byte)0), class478.method2437(method1849, n43, (byte)0), class478.method2437(method1849, n44, (byte)0), class478.method2437(method1849, n45, (byte)0), n53, n60);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int n63 = 1; n63 < 103; ++n63) {
                for (int n64 = 1; n64 < 103; ++n64) {
                    scene.setTileMinPlane(l, n64, n63, PcmPlayer.method240(l, n64, n63, 1863663350));
                }
            }
            class186.Tiles_underlays[l] = null;
            Tiles.Tiles_overlays[l] = null;
            Tiles.Tiles_shapes[l] = null;
            Tiles.field824[l] = null;
            Tiles.field819[l] = null;
        }
        scene.de(-50, -10, -50);
        for (int n65 = 0; n65 < 104; ++n65) {
            for (int n66 = 0; n66 < 104; ++n66) {
                if (0x2 == (Tiles.Tiles_renderFlags[1][n65][n66] & 0x2)) {
                    scene.setLinkBelow(n65, n66);
                }
            }
        }
        int n67 = 1;
        int n68 = 2;
        int n69 = 4;
        for (int n70 = 0; n70 < 4; ++n70) {
            if (n70 > 0) {
                n67 <<= 3;
                n68 <<= 3;
                n69 <<= 3;
            }
            for (int n71 = 0; n71 <= n70; ++n71) {
                for (int n72 = 0; n72 <= 104; ++n72) {
                    for (int n73 = 0; n73 <= 104; ++n73) {
                        if (0x0 != (class161.field1407[n71][n73][n72] & n67)) {
                            int n74 = n72;
                            int n75 = n72;
                            int n76 = n71;
                            int n77 = n71;
                            while (n74 > 0 && (class161.field1407[n71][n73][n74 - 1] & n67) != 0x0) {
                                --n74;
                            }
                            while (n75 < 104 && (class161.field1407[n71][n73][1 + n75] & n67) != 0x0) {
                                ++n75;
                            }
                        Label_3335:
                            while (n76 > 0) {
                                for (int n78 = n74; n78 <= n75; ++n78) {
                                    if (0x0 == (class161.field1407[n76 - 1][n73][n78] & n67)) {
                                        break Label_3335;
                                    }
                                }
                                --n76;
                            }
                        Label_3430:
                            while (n77 < n70) {
                                for (int n79 = n74; n79 <= n75; ++n79) {
                                    if (0x0 == (class161.field1407[n77 + 1][n73][n79] & n67)) {
                                        break Label_3430;
                                    }
                                }
                                ++n77;
                            }
                            if ((1 + (n75 - n74)) * (n77 + 1 - n76) >= 8) {
                                Scene.Scene_addOccluder(n70, 1, n73 * 128, 128 * n73, 128 * n74, n75 * 128 + 128, Tiles.Tiles_heights[n77][n73][n74] - 240, Tiles.Tiles_heights[n76][n73][n74]);
                                for (int n80 = n76; n80 <= n77; ++n80) {
                                    for (int n81 = n74; n81 <= n75; ++n81) {
                                        final int[] array4 = class161.field1407[n80][n73];
                                        final int n82 = n81;
                                        array4[n82] &= ~n67;
                                    }
                                }
                            }
                        }
                        if ((class161.field1407[n71][n73][n72] & n68) != 0x0) {
                            int n83 = n73;
                            int n84 = n73;
                            int n85 = n71;
                            int n86 = n71;
                            while (n83 > 0 && (class161.field1407[n71][n83 - 1][n72] & n68) != 0x0) {
                                --n83;
                            }
                            while (n84 < 104 && 0x0 != (class161.field1407[n71][1 + n84][n72] & n68)) {
                                ++n84;
                            }
                        Label_3789:
                            while (n85 > 0) {
                                for (int n87 = n83; n87 <= n84; ++n87) {
                                    if (0x0 == (class161.field1407[n85 - 1][n87][n72] & n68)) {
                                        break Label_3789;
                                    }
                                }
                                --n85;
                            }
                        Label_3833:
                            while (n86 < n70) {
                                for (int n88 = n83; n88 <= n84; ++n88) {
                                    if (0x0 == (class161.field1407[n86 + 1][n88][n72] & n68)) {
                                        break Label_3833;
                                    }
                                }
                                ++n86;
                            }
                            if ((1 + (n84 - n83)) * (n86 + 1 - n85) >= 8) {
                                Scene.Scene_addOccluder(n70, 2, n83 * 128, n84 * 128 + 128, 128 * n72, 128 * n72, Tiles.Tiles_heights[n86][n83][n72] - 240, Tiles.Tiles_heights[n85][n83][n72]);
                                for (int n89 = n85; n89 <= n86; ++n89) {
                                    for (int n90 = n83; n90 <= n84; ++n90) {
                                        final int[] array5 = class161.field1407[n89][n90];
                                        final int n91 = n72;
                                        array5[n91] &= ~n68;
                                    }
                                }
                            }
                        }
                        if ((class161.field1407[n71][n73][n72] & n69) != 0x0) {
                            int n92 = n73;
                            int n93 = n73;
                            int n94 = n72;
                            int n95 = n72;
                            while (n94 > 0 && (class161.field1407[n71][n73][n94 - 1] & n69) != 0x0) {
                                --n94;
                            }
                            while (n95 < 104 && 0x0 != (class161.field1407[n71][n73][n95 + 1] & n69)) {
                                ++n95;
                            }
                        Label_2615:
                            while (n92 > 0) {
                                for (int n96 = n94; n96 <= n95; ++n96) {
                                    if ((class161.field1407[n71][n92 - 1][n96] & n69) == 0x0) {
                                        break Label_2615;
                                    }
                                }
                                --n92;
                            }
                        Label_4199:
                            while (n93 < 104) {
                                for (int n97 = n94; n97 <= n95; ++n97) {
                                    if ((class161.field1407[n71][1 + n93][n97] & n69) == 0x0) {
                                        break Label_4199;
                                    }
                                }
                                ++n93;
                            }
                            if ((n95 - n94 + 1) * (1 + (n93 - n92)) >= 4) {
                                final int n98 = Tiles.Tiles_heights[n71][n92][n94];
                                Scene.Scene_addOccluder(n70, 4, n92 * 128, 128 + n93 * 128, 128 * n94, 128 + n95 * 128, n98, n98);
                                for (int n99 = n92; n99 <= n93; ++n99) {
                                    for (int n100 = n94; n100 <= n95; ++n100) {
                                        final int[] array6 = class161.field1407[n71][n99];
                                        final int n101 = n100;
                                        array6[n101] &= ~n69;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    static void ae() {
        class186.Tiles_underlays = null;
        Tiles.Tiles_overlays = null;
        Tiles.Tiles_shapes = null;
        Tiles.field824 = null;
        class161.field1407 = null;
        Tiles.field819 = null;
        Tiles.field821 = null;
        FileSystem.Tiles_hue = null;
        Tiles.Tiles_saturation = null;
        class283.Tiles_lightness = null;
        UserComparator4.Tiles_hueMultiplier = null;
        class31.field92 = null;
    }
    
    static final int cr(final int n, int n2) {
        if (-1718418238 == n) {
            return 272961619;
        }
        if (-1 == n) {
            if (n2 < 2) {
                n2 = 2;
            }
            else if (n2 > 126) {
                n2 = 126;
            }
            return n2;
        }
        n2 = (n & 0x7F) * n2 / -690264647;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 1504712982) {
            n2 = 126;
        }
        return (n & 0xCED9C28) + n2;
    }
    
    static final int ce(final int n, final int n2, final int n3) {
        final int n4 = n / n3;
        final int n5 = n & n3 - 1;
        final int n6 = n2 / n3;
        return JagexCache.method952(JagexCache.method952(class383.method2085(n4, n6, (byte)90), class383.method2085(1 + n4, n6, (byte)72), n5, n3, (byte)(-9)), JagexCache.method952(class383.method2085(n4, n6 + 1, (byte)61), class383.method2085(n4 + 1, n6 + 1, (byte)69), n5, n3, (byte)(-41)), n2 & n3 - 1, n3, (byte)(-28));
    }
    
    static final void bb(final byte[] array, final int n, final int n2, final int n3, final int n4, final CollisionMap[] array2) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 64; ++j) {
                for (int k = 0; k < -1639355144; ++k) {
                    if (n + j > 0 && n + j < 103 && k + n2 > 0 && k + n2 < 103) {
                        final int[] array3 = array2[i].flags[n + j];
                        final int n5 = n2 + k;
                        array3[n5] &= 0x46511FC5;
                    }
                }
            }
        }
        final Buffer buffer = new Buffer(array);
        for (int l = 0; l < 4; ++l) {
            for (int n6 = 0; n6 < 2089286541; ++n6) {
                for (int n7 = 0; n7 < -556902433; ++n7) {
                    final int n8 = n + n6;
                    final int n9 = n2 + n7;
                    class372.loadTerrain(buffer, l, n8, n9, n3 + n8, n4 + n9, 0, (byte)(-18));
                }
            }
        }
    }
    
    static final int cb(final int n, int n2, final int n3) {
        if (n3 > -924439363) {
            n2 /= 2;
        }
        if (n3 > -1588216414) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        return (n / 4 << 10) + (n2 / 1282236802 << 7) + n3 / 2;
    }
    
    static final void ch(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Scene scene, final CollisionMap collisionMap) {
        final ObjectComposition vmethod3248 = class144.vmethod3248(n5, (short)18030);
        final int n9 = (n8 >= 0) ? n8 : (1292954189 * vmethod3248.animationId);
        int n10;
        int n11;
        if (n6 != 1 && n6 != 3) {
            n10 = vmethod3248.sizeX * -1339930361;
            n11 = vmethod3248.sizeY * -1659393955;
        }
        else {
            n10 = vmethod3248.sizeY * -1659393955;
            n11 = vmethod3248.sizeX * -1339930361;
        }
        int n12;
        int n13;
        if (n3 + n10 <= 104) {
            n12 = (n10 >> 1) + n3;
            n13 = (1 + n10 >> 1) + n3;
        }
        else {
            n12 = n3;
            n13 = n3 + 1;
        }
        int n14;
        int n15;
        if (n4 + n11 <= 104) {
            n14 = (n11 >> 1) + n4;
            n15 = n4 + (n11 + 1 >> 1);
        }
        else {
            n14 = n4;
            n15 = 1 + n4;
        }
        final int[][] array = Tiles.Tiles_heights[n2];
        final int n16 = array[n12][n14] + array[n13][n14] + array[n12][n15] + array[n13][n15] >> 2;
        final int n17 = (n3 << 7) + (n10 << 6);
        final int n18 = (n11 << 6) + (n4 << 7);
        final long calculateTag = FaceNormal.calculateTag(n3, n4, 2, 0 == 415653149 * vmethod3248.int1, n5, 599038984);
        int n19 = (n6 << 6) + n7;
        if (1 == -1850643527 * vmethod3248.int3) {
            n19 += 256;
        }
        if (n7 == 22) {
            Renderable model;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model = vmethod3248.getModel(22, n6, array, n17, n16, n18, (byte)(-95));
            }
            else {
                model = new DynamicObject(n5, 22, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newFloorDecoration(n, n3, n4, n16, model, calculateTag, n19);
            if (vmethod3248.interactType * -973955889 == 1) {
                collisionMap.method1169(n3, n4, -1253422987);
            }
            return;
        }
        if (n7 == 10 || n7 == 11) {
            Renderable model2;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model2 = vmethod3248.getModel(10, n6, array, n17, n16, n18, (byte)(-59));
            }
            else {
                model2 = new DynamicObject(n5, 10, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            if (null != model2) {
                scene.method1288(n, n3, n4, n16, n10, n11, model2, (11 == n7) ? 256 : 0, calculateTag, n19);
            }
            if (0 != vmethod3248.interactType * -973955889) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-22));
            }
            return;
        }
        if (n7 >= 12) {
            Renderable model3;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model3 = vmethod3248.getModel(n7, n6, array, n17, n16, n18, (byte)27);
            }
            else {
                model3 = new DynamicObject(n5, n7, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.method1288(n, n3, n4, n16, 1, 1, model3, 0, calculateTag, n19);
            if (vmethod3248.interactType * -973955889 != 0) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-72));
            }
            return;
        }
        if (n7 == 0) {
            Renderable model4;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model4 = vmethod3248.getModel(0, n6, array, n17, n16, n18, (byte)21);
            }
            else {
                model4 = new DynamicObject(n5, 0, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model4, null, Tiles.field820[n6], 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (1 == n7) {
            Renderable model5;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model5 = vmethod3248.getModel(1, n6, array, n17, n16, n18, (byte)85);
            }
            else {
                model5 = new DynamicObject(n5, 1, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model5, null, Tiles.field829[n6], 0, calculateTag, n19);
            if (0 != -973955889 * vmethod3248.interactType) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (2 == n7) {
            final int n20 = 1 + n6 & 0x3;
            Renderable model6;
            Renderable model7;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model6 = vmethod3248.getModel(2, 4 + n6, array, n17, n16, n18, (byte)(-7));
                model7 = vmethod3248.getModel(2, n20, array, n17, n16, n18, (byte)24);
            }
            else {
                model6 = new DynamicObject(n5, 2, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
                model7 = new DynamicObject(n5, 2, n20, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model6, model7, Tiles.field820[n6], Tiles.field820[n20], calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (n7 == 3) {
            Renderable model8;
            if (n9 == -1 && null == vmethod3248.soundEffectIds) {
                model8 = vmethod3248.getModel(3, n6, array, n17, n16, n18, (byte)(-109));
            }
            else {
                model8 = new DynamicObject(n5, 3, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model8, null, Tiles.field829[n6], 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (n7 == 9) {
            Renderable model9;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model9 = vmethod3248.getModel(n7, n6, array, n17, n16, n18, (byte)(-26));
            }
            else {
                model9 = new DynamicObject(n5, n7, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.method1288(n, n3, n4, n16, 1, 1, model9, 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-40));
            }
            return;
        }
        if (4 == n7) {
            Renderable model10;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model10 = vmethod3248.getModel(4, n6, array, n17, n16, n18, (byte)2);
            }
            else {
                model10 = new DynamicObject(n5, 4, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model10, null, Tiles.field820[n6], 0, 0, 0, calculateTag, n19);
            return;
        }
        if (5 == n7) {
            int n21 = 16;
            final long boundaryObjectTag = scene.getBoundaryObjectTag(n, n3, n4);
            if (boundaryObjectTag != 0L) {
                n21 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag), (short)14668).int2 * -89408815;
            }
            Renderable model11;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model11 = vmethod3248.getModel(4, n6, array, n17, n16, n18, (byte)49);
            }
            else {
                model11 = new DynamicObject(n5, 4, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model11, null, Tiles.field820[n6], 0, Tiles.field830[n6] * n21, Tiles.field827[n6] * n21, calculateTag, n19);
            return;
        }
        if (n7 == 6) {
            int n22 = 8;
            final long boundaryObjectTag2 = scene.getBoundaryObjectTag(n, n3, n4);
            if (0L != boundaryObjectTag2) {
                n22 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag2), (short)26880).int2 * -89408815 / 2;
            }
            Renderable model12;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model12 = vmethod3248.getModel(4, 4 + n6, array, n17, n16, n18, (byte)16);
            }
            else {
                model12 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model12, null, 256, n6, Tiles.field832[n6] * n22, n22 * Tiles.field833[n6], calculateTag, n19);
            return;
        }
        if (n7 == 7) {
            final int n23 = n6 + 2 & 0x3;
            Renderable model13;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model13 = vmethod3248.getModel(4, 4 + n23, array, n17, n16, n18, (byte)(-18));
            }
            else {
                model13 = new DynamicObject(n5, 4, 4 + n23, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model13, null, 256, n23, 0, 0, calculateTag, n19);
            return;
        }
        if (8 == n7) {
            int n24 = 8;
            final long boundaryObjectTag3 = scene.getBoundaryObjectTag(n, n3, n4);
            if (0L != boundaryObjectTag3) {
                n24 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag3), (short)6893).int2 * -89408815 / 2;
            }
            final int n25 = n6 + 2 & 0x3;
            Renderable model14;
            Renderable model15;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model14 = vmethod3248.getModel(4, 4 + n6, array, n17, n16, n18, (byte)86);
                model15 = vmethod3248.getModel(4, 4 + n25, array, n17, n16, n18, (byte)0);
            }
            else {
                model14 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
                model15 = new DynamicObject(n5, 4, 4 + n25, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model14, model15, 256, n6, n24 * Tiles.field832[n6], n24 * Tiles.field833[n6], calculateTag, n19);
        }
    }
    
    static final int cl(final int n, int n2) {
        if (n == -1) {
            return 1084751990;
        }
        n2 = (n & 0xD400E77B) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    static final int cn(final int n, final int n2, final int n3, final int n4) {
        final int n5 = 65536 - Rasterizer3D.Rasterizer3D_cosine[n3 * 1024 / n4] >> 1;
        return (n * (65536 - n5) >> 16) + (n2 * n5 >> 16);
    }
    
    static int bw(final int n, final int n2, final int n3) {
        if ((Tiles.Tiles_renderFlags[n][n2][n3] & 0x8) != 0x0) {
            return 0;
        }
        if (n > 0 && 0x0 != (Tiles.Tiles_renderFlags[1][n2][n3] & 0x2)) {
            return n - 1;
        }
        return n;
    }
    
    static final int cf(final int n, int n2) {
        if (n == -1) {
            return -1414664171;
        }
        n2 = (n & 0xC1C7101F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 1957799399) {
            n2 = 126;
        }
        return (n & 0x6829285C) + n2;
    }
    
    static final boolean cw(final int n, int n2) {
        final ObjectComposition vmethod3248 = class144.vmethod3248(n, (short)17249);
        if (11 == n2) {
            n2 = 10;
        }
        if (n2 >= 5 && n2 <= 8) {
            n2 = 4;
        }
        return ObjectComposition.uh(vmethod3248, n2, -1775888671);
    }
    
    static final int cv(final int n, int n2) {
        if (-2 == n) {
            return 652810788;
        }
        if (-1 == n) {
            if (n2 < 2) {
                n2 = 2;
            }
            else if (n2 > 126) {
                n2 = -1116297176;
            }
            return n2;
        }
        n2 = (n & 0xF2FCE244) * n2 / -1662752973;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 750966379) {
            n2 = -2121263006;
        }
        return (n & 0xFF80) + n2;
    }
    
    static final void cj(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Scene scene, final CollisionMap collisionMap) {
        final ObjectComposition vmethod3248 = class144.vmethod3248(n5, (short)14468);
        final int n9 = (n8 >= 0) ? n8 : (1292954189 * vmethod3248.animationId);
        int n10;
        int n11;
        if (n6 != 1 && n6 != 3) {
            n10 = vmethod3248.sizeX * -1339930361;
            n11 = vmethod3248.sizeY * -1659393955;
        }
        else {
            n10 = vmethod3248.sizeY * -1659393955;
            n11 = vmethod3248.sizeX * -1339930361;
        }
        int n12;
        int n13;
        if (n3 + n10 <= 104) {
            n12 = (n10 >> 1) + n3;
            n13 = (1 + n10 >> 1) + n3;
        }
        else {
            n12 = n3;
            n13 = n3 + 1;
        }
        int n14;
        int n15;
        if (n4 + n11 <= 104) {
            n14 = (n11 >> 1) + n4;
            n15 = n4 + (n11 + 1 >> 1);
        }
        else {
            n14 = n4;
            n15 = 1 + n4;
        }
        final int[][] array = Tiles.Tiles_heights[n2];
        final int n16 = array[n12][n14] + array[n13][n14] + array[n12][n15] + array[n13][n15] >> 2;
        final int n17 = (n3 << 7) + (n10 << 6);
        final int n18 = (n11 << 6) + (n4 << 7);
        final long calculateTag = FaceNormal.calculateTag(n3, n4, 2, 0 == 415653149 * vmethod3248.int1, n5, -1058748252);
        int n19 = (n6 << 6) + n7;
        if (1 == -1850643527 * vmethod3248.int3) {
            n19 += 256;
        }
        if (n7 == 22) {
            Renderable model;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model = vmethod3248.getModel(22, n6, array, n17, n16, n18, (byte)(-62));
            }
            else {
                model = new DynamicObject(n5, 22, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newFloorDecoration(n, n3, n4, n16, model, calculateTag, n19);
            if (vmethod3248.interactType * -973955889 == 1) {
                collisionMap.method1169(n3, n4, -443087581);
            }
            return;
        }
        if (n7 == 10 || n7 == 11) {
            Renderable model2;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model2 = vmethod3248.getModel(10, n6, array, n17, n16, n18, (byte)26);
            }
            else {
                model2 = new DynamicObject(n5, 10, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            if (null != model2) {
                scene.method1288(n, n3, n4, n16, n10, n11, model2, (11 == n7) ? 256 : 0, calculateTag, n19);
            }
            if (0 != vmethod3248.interactType * -973955889) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-69));
            }
            return;
        }
        if (n7 >= 12) {
            Renderable model3;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model3 = vmethod3248.getModel(n7, n6, array, n17, n16, n18, (byte)(-3));
            }
            else {
                model3 = new DynamicObject(n5, n7, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.method1288(n, n3, n4, n16, 1, 1, model3, 0, calculateTag, n19);
            if (vmethod3248.interactType * -973955889 != 0) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-127));
            }
            return;
        }
        if (n7 == 0) {
            Renderable model4;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model4 = vmethod3248.getModel(0, n6, array, n17, n16, n18, (byte)25);
            }
            else {
                model4 = new DynamicObject(n5, 0, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model4, null, Tiles.field820[n6], 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (1 == n7) {
            Renderable model5;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model5 = vmethod3248.getModel(1, n6, array, n17, n16, n18, (byte)30);
            }
            else {
                model5 = new DynamicObject(n5, 1, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model5, null, Tiles.field829[n6], 0, calculateTag, n19);
            if (0 != -973955889 * vmethod3248.interactType) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (2 == n7) {
            final int n20 = 1 + n6 & 0x3;
            Renderable model6;
            Renderable model7;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model6 = vmethod3248.getModel(2, 4 + n6, array, n17, n16, n18, (byte)94);
                model7 = vmethod3248.getModel(2, n20, array, n17, n16, n18, (byte)(-74));
            }
            else {
                model6 = new DynamicObject(n5, 2, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
                model7 = new DynamicObject(n5, 2, n20, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model6, model7, Tiles.field820[n6], Tiles.field820[n20], calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (n7 == 3) {
            Renderable model8;
            if (n9 == -1 && null == vmethod3248.soundEffectIds) {
                model8 = vmethod3248.getModel(3, n6, array, n17, n16, n18, (byte)16);
            }
            else {
                model8 = new DynamicObject(n5, 3, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model8, null, Tiles.field829[n6], 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (n7 == 9) {
            Renderable model9;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model9 = vmethod3248.getModel(n7, n6, array, n17, n16, n18, (byte)(-101));
            }
            else {
                model9 = new DynamicObject(n5, n7, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.method1288(n, n3, n4, n16, 1, 1, model9, 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-111));
            }
            return;
        }
        if (4 == n7) {
            Renderable model10;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model10 = vmethod3248.getModel(4, n6, array, n17, n16, n18, (byte)(-51));
            }
            else {
                model10 = new DynamicObject(n5, 4, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model10, null, Tiles.field820[n6], 0, 0, 0, calculateTag, n19);
            return;
        }
        if (5 == n7) {
            int n21 = 16;
            final long boundaryObjectTag = scene.getBoundaryObjectTag(n, n3, n4);
            if (boundaryObjectTag != 0L) {
                n21 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag), (short)31200).int2 * -89408815;
            }
            Renderable model11;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model11 = vmethod3248.getModel(4, n6, array, n17, n16, n18, (byte)91);
            }
            else {
                model11 = new DynamicObject(n5, 4, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model11, null, Tiles.field820[n6], 0, Tiles.field830[n6] * n21, Tiles.field827[n6] * n21, calculateTag, n19);
            return;
        }
        if (n7 == 6) {
            int n22 = 8;
            final long boundaryObjectTag2 = scene.getBoundaryObjectTag(n, n3, n4);
            if (0L != boundaryObjectTag2) {
                n22 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag2), (short)9101).int2 * -89408815 / 2;
            }
            Renderable model12;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model12 = vmethod3248.getModel(4, 4 + n6, array, n17, n16, n18, (byte)(-56));
            }
            else {
                model12 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model12, null, 256, n6, Tiles.field832[n6] * n22, n22 * Tiles.field833[n6], calculateTag, n19);
            return;
        }
        if (n7 == 7) {
            final int n23 = n6 + 2 & 0x3;
            Renderable model13;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model13 = vmethod3248.getModel(4, 4 + n23, array, n17, n16, n18, (byte)61);
            }
            else {
                model13 = new DynamicObject(n5, 4, 4 + n23, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model13, null, 256, n23, 0, 0, calculateTag, n19);
            return;
        }
        if (8 == n7) {
            int n24 = 8;
            final long boundaryObjectTag3 = scene.getBoundaryObjectTag(n, n3, n4);
            if (0L != boundaryObjectTag3) {
                n24 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag3), (short)7780).int2 * -89408815 / 2;
            }
            final int n25 = n6 + 2 & 0x3;
            Renderable model14;
            Renderable model15;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model14 = vmethod3248.getModel(4, 4 + n6, array, n17, n16, n18, (byte)(-33));
                model15 = vmethod3248.getModel(4, 4 + n25, array, n17, n16, n18, (byte)109);
            }
            else {
                model14 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
                model15 = new DynamicObject(n5, 4, 4 + n25, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model14, model15, 256, n6, n24 * Tiles.field832[n6], n24 * Tiles.field833[n6], calculateTag, n19);
        }
    }
    
    static final void be(final byte[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final CollisionMap[] array2) {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (n2 + i > 0 && i + n2 < 103 && n3 + j > 0 && n3 + j < 103) {
                    final int[] array3 = array2[n].flags[i + n2];
                    final int n10 = j + n3;
                    array3[n10] &= 0xFEFFFFFF;
                }
            }
        }
        final Buffer buffer = new Buffer(array);
        for (int k = 0; k < 4; ++k) {
            for (int l = 0; l < 64; ++l) {
                for (int n11 = 0; n11 < 64; ++n11) {
                    if (n4 == k && l >= n5 && l < 8 + n5 && n11 >= n6 && n11 < n6 + 8) {
                        final int n12 = n2 + SpriteMask.contains(l & 0x7, n11 & 0x7, n7, 575322475);
                        final int n13 = l & 0x7;
                        final int n14 = n11 & 0x7;
                        final int n15 = n7 & 0x3;
                        int n16;
                        if (n15 == 0) {
                            n16 = n14;
                        }
                        else if (n15 == 1) {
                            n16 = 7 - n13;
                        }
                        else if (2 == n15) {
                            n16 = 7 - n14;
                        }
                        else {
                            n16 = n13;
                        }
                        class372.loadTerrain(buffer, n, n12, n3 + n16, (l & 0x7) + (n8 + n2), (n11 & 0x7) + (n9 + n3), n7, (byte)(-64));
                    }
                    else {
                        class372.loadTerrain(buffer, 0, -1, -1, 0, 0, 0, (byte)(-24));
                    }
                }
            }
        }
    }
    
    static final void cp(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Scene scene, final CollisionMap collisionMap) {
        final ObjectComposition vmethod3248 = class144.vmethod3248(n5, (short)31131);
        final int n9 = (n8 >= 0) ? n8 : (1292954189 * vmethod3248.animationId);
        int n10;
        int n11;
        if (n6 != 1 && n6 != 3) {
            n10 = vmethod3248.sizeX * -1339930361;
            n11 = vmethod3248.sizeY * -1659393955;
        }
        else {
            n10 = vmethod3248.sizeY * -1659393955;
            n11 = vmethod3248.sizeX * -1339930361;
        }
        int n12;
        int n13;
        if (n3 + n10 <= 104) {
            n12 = (n10 >> 1) + n3;
            n13 = (1 + n10 >> 1) + n3;
        }
        else {
            n12 = n3;
            n13 = n3 + 1;
        }
        int n14;
        int n15;
        if (n4 + n11 <= 104) {
            n14 = (n11 >> 1) + n4;
            n15 = n4 + (n11 + 1 >> 1);
        }
        else {
            n14 = n4;
            n15 = 1 + n4;
        }
        final int[][] array = Tiles.Tiles_heights[n2];
        final int n16 = array[n12][n14] + array[n13][n14] + array[n12][n15] + array[n13][n15] >> 2;
        final int n17 = (n3 << 7) + (n10 << 6);
        final int n18 = (n11 << 6) + (n4 << 7);
        final long calculateTag = FaceNormal.calculateTag(n3, n4, 2, 0 == 415653149 * vmethod3248.int1, n5, 1625770187);
        int n19 = (n6 << 6) + n7;
        if (1 == -1850643527 * vmethod3248.int3) {
            n19 += 256;
        }
        if (n7 == 22) {
            Renderable model;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model = vmethod3248.getModel(22, n6, array, n17, n16, n18, (byte)(-31));
            }
            else {
                model = new DynamicObject(n5, 22, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newFloorDecoration(n, n3, n4, n16, model, calculateTag, n19);
            if (vmethod3248.interactType * -973955889 == 1) {
                collisionMap.method1169(n3, n4, 704347194);
            }
            return;
        }
        if (n7 == 10 || n7 == 11) {
            Renderable model2;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model2 = vmethod3248.getModel(10, n6, array, n17, n16, n18, (byte)(-58));
            }
            else {
                model2 = new DynamicObject(n5, 10, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            if (null != model2) {
                scene.method1288(n, n3, n4, n16, n10, n11, model2, (11 == n7) ? 256 : 0, calculateTag, n19);
            }
            if (0 != vmethod3248.interactType * -973955889) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-110));
            }
            return;
        }
        if (n7 >= 12) {
            Renderable model3;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model3 = vmethod3248.getModel(n7, n6, array, n17, n16, n18, (byte)14);
            }
            else {
                model3 = new DynamicObject(n5, n7, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.method1288(n, n3, n4, n16, 1, 1, model3, 0, calculateTag, n19);
            if (vmethod3248.interactType * -973955889 != 0) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-8));
            }
            return;
        }
        if (n7 == 0) {
            Renderable model4;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model4 = vmethod3248.getModel(0, n6, array, n17, n16, n18, (byte)124);
            }
            else {
                model4 = new DynamicObject(n5, 0, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model4, null, Tiles.field820[n6], 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (1 == n7) {
            Renderable model5;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model5 = vmethod3248.getModel(1, n6, array, n17, n16, n18, (byte)1);
            }
            else {
                model5 = new DynamicObject(n5, 1, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model5, null, Tiles.field829[n6], 0, calculateTag, n19);
            if (0 != -973955889 * vmethod3248.interactType) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (2 == n7) {
            final int n20 = 1 + n6 & 0x3;
            Renderable model6;
            Renderable model7;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model6 = vmethod3248.getModel(2, 4 + n6, array, n17, n16, n18, (byte)43);
                model7 = vmethod3248.getModel(2, n20, array, n17, n16, n18, (byte)(-8));
            }
            else {
                model6 = new DynamicObject(n5, 2, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
                model7 = new DynamicObject(n5, 2, n20, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model6, model7, Tiles.field820[n6], Tiles.field820[n20], calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (n7 == 3) {
            Renderable model8;
            if (n9 == -1 && null == vmethod3248.soundEffectIds) {
                model8 = vmethod3248.getModel(3, n6, array, n17, n16, n18, (byte)(-43));
            }
            else {
                model8 = new DynamicObject(n5, 3, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model8, null, Tiles.field829[n6], 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (n7 == 9) {
            Renderable model9;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model9 = vmethod3248.getModel(n7, n6, array, n17, n16, n18, (byte)18);
            }
            else {
                model9 = new DynamicObject(n5, n7, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.method1288(n, n3, n4, n16, 1, 1, model9, 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-96));
            }
            return;
        }
        if (4 == n7) {
            Renderable model10;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model10 = vmethod3248.getModel(4, n6, array, n17, n16, n18, (byte)(-44));
            }
            else {
                model10 = new DynamicObject(n5, 4, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model10, null, Tiles.field820[n6], 0, 0, 0, calculateTag, n19);
            return;
        }
        if (5 == n7) {
            int n21 = 16;
            final long boundaryObjectTag = scene.getBoundaryObjectTag(n, n3, n4);
            if (boundaryObjectTag != 0L) {
                n21 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag), (short)15543).int2 * -89408815;
            }
            Renderable model11;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model11 = vmethod3248.getModel(4, n6, array, n17, n16, n18, (byte)(-62));
            }
            else {
                model11 = new DynamicObject(n5, 4, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model11, null, Tiles.field820[n6], 0, Tiles.field830[n6] * n21, Tiles.field827[n6] * n21, calculateTag, n19);
            return;
        }
        if (n7 == 6) {
            int n22 = 8;
            final long boundaryObjectTag2 = scene.getBoundaryObjectTag(n, n3, n4);
            if (0L != boundaryObjectTag2) {
                n22 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag2), (short)16992).int2 * -89408815 / 2;
            }
            Renderable model12;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model12 = vmethod3248.getModel(4, 4 + n6, array, n17, n16, n18, (byte)(-40));
            }
            else {
                model12 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model12, null, 256, n6, Tiles.field832[n6] * n22, n22 * Tiles.field833[n6], calculateTag, n19);
            return;
        }
        if (n7 == 7) {
            final int n23 = n6 + 2 & 0x3;
            Renderable model13;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model13 = vmethod3248.getModel(4, 4 + n23, array, n17, n16, n18, (byte)(-40));
            }
            else {
                model13 = new DynamicObject(n5, 4, 4 + n23, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model13, null, 256, n23, 0, 0, calculateTag, n19);
            return;
        }
        if (8 == n7) {
            int n24 = 8;
            final long boundaryObjectTag3 = scene.getBoundaryObjectTag(n, n3, n4);
            if (0L != boundaryObjectTag3) {
                n24 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag3), (short)14522).int2 * -89408815 / 2;
            }
            final int n25 = n6 + 2 & 0x3;
            Renderable model14;
            Renderable model15;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model14 = vmethod3248.getModel(4, 4 + n6, array, n17, n16, n18, (byte)(-52));
                model15 = vmethod3248.getModel(4, 4 + n25, array, n17, n16, n18, (byte)87);
            }
            else {
                model14 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
                model15 = new DynamicObject(n5, 4, 4 + n25, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model14, model15, 256, n6, n24 * Tiles.field832[n6], n24 * Tiles.field833[n6], calculateTag, n19);
        }
    }
    
    public static void sh(final Model model, final int n, final int n2, final int n3) {
        if (model == null) {
            model.getTextureFaces();
        }
        for (int i = 0; i < model.verticesCount; ++i) {
            model.verticesX[i] = model.verticesX[i] * n / 128;
            model.verticesY[i] = model.verticesY[i] * n2 / -2130871502;
            model.verticesZ[i] = model.verticesZ[i] * n3 / 128;
        }
        Model.dv(model);
    }
    
    static void az() {
        Tiles.Tiles_minPlane = -256673141;
        class186.Tiles_underlays = new short[4][104][104];
        Tiles.Tiles_overlays = new short[4][104][104];
        Tiles.Tiles_shapes = new byte[4][104][104];
        Tiles.field824 = new byte[4][104][104];
        class161.field1407 = new int[4][105][105];
        Tiles.field819 = new byte[4][105][105];
        Tiles.field821 = new int[105][105];
        FileSystem.Tiles_hue = new int[104];
        Tiles.Tiles_saturation = new int[104];
        class283.Tiles_lightness = new int[104];
        UserComparator4.Tiles_hueMultiplier = new int[104];
        class31.field92 = new int[104];
    }
    
    public static void method474(final int n) {
        try {
            Rasterizer3D.clips.method1358((byte)(-36));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cd.ax(" + ')');
        }
    }
    
    static final void bi(final byte[] array, final int n, final int n2, final int n3, final int n4, final CollisionMap[] array2) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < -794122473; ++j) {
                for (int k = 0; k < 64; ++k) {
                    if (n + j > 0 && n + j < 103 && k + n2 > 0 && k + n2 < 103) {
                        final int[] array3 = array2[i].flags[n + j];
                        final int n5 = n2 + k;
                        array3[n5] &= 0x8DBC3A2D;
                    }
                }
            }
        }
        final Buffer buffer = new Buffer(array);
        for (int l = 0; l < 4; ++l) {
            for (int n6 = 0; n6 < 1465252457; ++n6) {
                for (int n7 = 0; n7 < 1066537347; ++n7) {
                    final int n8 = n + n6;
                    final int n9 = n2 + n7;
                    class372.loadTerrain(buffer, l, n8, n9, n3 + n8, n4 + n9, 0, (byte)11);
                }
            }
        }
    }
    
    static final void bv(final Scene scene, final CollisionMap[] array) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 576261194; ++j) {
                for (int k = 0; k < 1138265716; ++k) {
                    if ((Tiles.Tiles_renderFlags[i][j][k] & 0x1) == 0x1) {
                        int n = i;
                        if (0x2 == (Tiles.Tiles_renderFlags[1][j][k] & 0x2)) {
                            --n;
                        }
                        if (n >= 0) {
                            array[n].setBlockedByFloor(j, k, (byte)96);
                        }
                    }
                }
            }
        }
        Tiles.rndHue += ((int)(Math.random() * 5.0) - 2) * -1036147267;
        if (-372405639 * Tiles.rndHue < -114526734) {
            Tiles.rndHue = -811774667;
        }
        if (1771821395 * Tiles.rndHue > 8) {
            Tiles.rndHue = 1805695203;
        }
        Tiles.rndLightness += ((int)(Math.random() * 5.0) - 2) * -375328316;
        if (Tiles.rndLightness * -1764119151 < 859313749) {
            Tiles.rndLightness = 1685738291;
        }
        if (Tiles.rndLightness * 1971041291 > 16) {
            Tiles.rndLightness = 1913340560;
        }
        for (int l = 0; l < 4; ++l) {
            final byte[][] array2 = Tiles.field819[l];
            final int n2 = 768 * (int)Math.sqrt(5100.0) >> 8;
            for (int n3 = 1; n3 < 1544810087; ++n3) {
                for (int n4 = 1; n4 < 103; ++n4) {
                    final int n5 = Tiles.Tiles_heights[l][1 + n4][n3] - Tiles.Tiles_heights[l][n4 - 1][n3];
                    final int n6 = Tiles.Tiles_heights[l][n4][n3 + 1] - Tiles.Tiles_heights[l][n4][n3 - 1];
                    final int n7 = (int)Math.sqrt(n6 * n6 + (-1448117095 + n5 * n5));
                    Tiles.field821[n4][n3] = 96 + ((n6 << 8) / n7 * -50 + (-529057211 * (65536 / n7) + 1968275116 * ((n5 << 8) / n7))) / n2 - ((array2[n4][1 + n3] >> 3) + ((array2[n4][n3 - 1] >> 2) + ((array2[1 + n4][n3] >> 3) + (array2[n4 - 1][n3] >> 2))) + (array2[n4][n3] >> 1));
                }
            }
            for (int n8 = 0; n8 < -971243744; ++n8) {
                FileSystem.Tiles_hue[n8] = 0;
                Tiles.Tiles_saturation[n8] = 0;
                class283.Tiles_lightness[n8] = 0;
                UserComparator4.Tiles_hueMultiplier[n8] = 0;
                class31.field92[n8] = 0;
            }
            for (int n9 = -5; n9 < -1390276151; ++n9) {
                for (int n10 = 0; n10 < 637172649; ++n10) {
                    final int n11 = 5 + n9;
                    if (n11 >= 0 && n11 < -1931928412) {
                        final int n12 = class186.Tiles_underlays[l][n11][n10] & (int)DynamicObject.method466(15, 687899287);
                        if (n12 > 0) {
                            final int n13 = n12 - 1;
                            final FloorUnderlayDefinition floorUnderlayDefinition = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n13);
                            FloorUnderlayDefinition floorUnderlayDefinition2;
                            if (null != floorUnderlayDefinition) {
                                floorUnderlayDefinition2 = floorUnderlayDefinition;
                            }
                            else {
                                final byte[] takeFile = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n13, (byte)(-14));
                                final FloorUnderlayDefinition floorUnderlayDefinition3 = new FloorUnderlayDefinition();
                                if (null != takeFile) {
                                    floorUnderlayDefinition3.decode(new Buffer(takeFile), n13, -1964164556);
                                }
                                floorUnderlayDefinition3.postDecode(875414437);
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition3, n13);
                                floorUnderlayDefinition2 = floorUnderlayDefinition3;
                            }
                            final FloorUnderlayDefinition floorUnderlayDefinition4 = floorUnderlayDefinition2;
                            final int[] tiles_hue = FileSystem.Tiles_hue;
                            final int n14 = n10;
                            tiles_hue[n14] += floorUnderlayDefinition4.hue * 372444635;
                            final int[] tiles_saturation = Tiles.Tiles_saturation;
                            final int n15 = n10;
                            tiles_saturation[n15] += 1058265139 * floorUnderlayDefinition4.saturation;
                            final int[] tiles_lightness = class283.Tiles_lightness;
                            final int n16 = n10;
                            tiles_lightness[n16] += -1527986335 * floorUnderlayDefinition4.lightness;
                            final int[] tiles_hueMultiplier = UserComparator4.Tiles_hueMultiplier;
                            final int n17 = n10;
                            tiles_hueMultiplier[n17] += floorUnderlayDefinition4.hueMultiplier * -2012234183;
                            final int[] field92 = class31.field92;
                            final int n18 = n10;
                            ++field92[n18];
                        }
                    }
                    final int n19 = n9 - 5;
                    if (n19 >= 0 && n19 < 104) {
                        final int n20 = class186.Tiles_underlays[l][n19][n10] & (int)DynamicObject.method466(15, -1149975669);
                        if (n20 > 0) {
                            final int n21 = n20 - 1;
                            final FloorUnderlayDefinition floorUnderlayDefinition5 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n21);
                            FloorUnderlayDefinition floorUnderlayDefinition6;
                            if (floorUnderlayDefinition5 != null) {
                                floorUnderlayDefinition6 = floorUnderlayDefinition5;
                            }
                            else {
                                final byte[] takeFile2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n21, (byte)(-98));
                                final FloorUnderlayDefinition floorUnderlayDefinition7 = new FloorUnderlayDefinition();
                                if (takeFile2 != null) {
                                    floorUnderlayDefinition7.decode(new Buffer(takeFile2), n21, -2104674459);
                                }
                                floorUnderlayDefinition7.postDecode(875414437);
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition7, n21);
                                floorUnderlayDefinition6 = floorUnderlayDefinition7;
                            }
                            final FloorUnderlayDefinition floorUnderlayDefinition8 = floorUnderlayDefinition6;
                            final int[] tiles_hue2 = FileSystem.Tiles_hue;
                            final int n22 = n10;
                            tiles_hue2[n22] -= 372444635 * floorUnderlayDefinition8.hue;
                            final int[] tiles_saturation2 = Tiles.Tiles_saturation;
                            final int n23 = n10;
                            tiles_saturation2[n23] -= floorUnderlayDefinition8.saturation * 1058265139;
                            final int[] tiles_lightness2 = class283.Tiles_lightness;
                            final int n24 = n10;
                            tiles_lightness2[n24] -= 1954132927 * floorUnderlayDefinition8.lightness;
                            final int[] tiles_hueMultiplier2 = UserComparator4.Tiles_hueMultiplier;
                            final int n25 = n10;
                            tiles_hueMultiplier2[n25] -= -2012234183 * floorUnderlayDefinition8.hueMultiplier;
                            final int[] field93 = class31.field92;
                            final int n26 = n10;
                            --field93[n26];
                        }
                    }
                }
                if (n9 >= 1 && n9 < 103) {
                    int n27 = 0;
                    int n28 = 0;
                    int n29 = 0;
                    int n30 = 0;
                    int n31 = 0;
                    for (int n32 = -5; n32 < 109; ++n32) {
                        final int n33 = n32 + 5;
                        if (n33 >= 0 && n33 < -2108858100) {
                            n27 += FileSystem.Tiles_hue[n33];
                            n28 += Tiles.Tiles_saturation[n33];
                            n29 += class283.Tiles_lightness[n33];
                            n30 += UserComparator4.Tiles_hueMultiplier[n33];
                            n31 += class31.field92[n33];
                        }
                        final int n34 = n32 - 5;
                        if (n34 >= 0 && n34 < 79170807) {
                            n27 -= FileSystem.Tiles_hue[n34];
                            n28 -= Tiles.Tiles_saturation[n34];
                            n29 -= class283.Tiles_lightness[n34];
                            n30 -= UserComparator4.Tiles_hueMultiplier[n34];
                            n31 -= class31.field92[n34];
                        }
                        if (n32 >= 1 && n32 < -1593268973) {
                            if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][n9][n32] & 0x2) != 0x0 || 0x0 == (Tiles.Tiles_renderFlags[l][n9][n32] & 0x10)) {
                                if (l < Tiles.Tiles_minPlane * 1401144457) {
                                    Tiles.Tiles_minPlane = l * -1482614257;
                                }
                                final int n35 = (int)DynamicObject.method466(15, 868979489);
                                final int n36 = class186.Tiles_underlays[l][n9][n32] & n35;
                                final int n37 = Tiles.Tiles_overlays[l][n9][n32] & n35;
                                if (n36 > 0 || n37 > 0) {
                                    final int n38 = Tiles.Tiles_heights[l][n9][n32];
                                    final int n39 = Tiles.Tiles_heights[l][n9 + 1][n32];
                                    final int n40 = Tiles.Tiles_heights[l][n9 + 1][1 + n32];
                                    final int n41 = Tiles.Tiles_heights[l][n9][n32 + 1];
                                    final int n42 = Tiles.field821[n9][n32];
                                    final int n43 = Tiles.field821[1 + n9][n32];
                                    final int n44 = Tiles.field821[n9 + 1][n32 + 1];
                                    final int n45 = Tiles.field821[n9][n32 + 1];
                                    int method1847 = -1;
                                    int method1848 = -1;
                                    if (n36 > 0) {
                                        final int n46 = n27 * 256 / n30;
                                        final int n47 = n28 / n31;
                                        final int n48 = n29 / n31;
                                        method1847 = GameBuild.method1847(n46, n47, n48, 285151866);
                                        final int n49 = n46 + Tiles.rndHue * 2045932026 & 0xFF;
                                        int n50 = n48 + Tiles.rndLightness * -647485415;
                                        if (n50 < 0) {
                                            n50 = 0;
                                        }
                                        else if (n50 > 255) {
                                            n50 = 1102169990;
                                        }
                                        method1848 = GameBuild.method1847(n49, n47, n50, 329787465);
                                    }
                                    if (l > 0) {
                                        boolean b = true;
                                        if (n36 == 0 && 0 != Tiles.Tiles_shapes[l][n9][n32]) {
                                            b = false;
                                        }
                                        if (n37 > 0) {
                                            final int n51 = n37 - 1;
                                            final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n51);
                                            FloorOverlayDefinition floorOverlayDefinition2;
                                            if (floorOverlayDefinition != null) {
                                                floorOverlayDefinition2 = floorOverlayDefinition;
                                            }
                                            else {
                                                final byte[] takeFile3 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n51, (byte)(-7));
                                                final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                                                if (takeFile3 != null) {
                                                    floorOverlayDefinition3.decode(new Buffer(takeFile3), n51, (short)128);
                                                }
                                                floorOverlayDefinition3.postDecode(1560510691);
                                                FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n51);
                                                floorOverlayDefinition2 = floorOverlayDefinition3;
                                            }
                                            if (!floorOverlayDefinition2.hideUnderlay) {
                                                b = false;
                                            }
                                        }
                                        if (b && n38 == n39 && n38 == n40 && n41 == n38) {
                                            final int[] array3 = class161.field1407[l][n9];
                                            final int n52 = n32;
                                            array3[n52] |= 0x54C5AF20;
                                        }
                                    }
                                    int n53 = 0;
                                    if (method1848 != -1) {
                                        n53 = Rasterizer3D.Rasterizer3D_colorPalette[class10.method41(method1848, 96, -423675519)];
                                    }
                                    if (n37 == 0) {
                                        scene.addTile(l, n9, n32, 0, 0, -1, n38, n39, n40, n41, class10.method41(method1847, n42, -80628613), class10.method41(method1847, n43, -1968060001), class10.method41(method1847, n44, -670994390), class10.method41(method1847, n45, 1261115226), 0, 0, 0, 0, n53, 0);
                                    }
                                    else {
                                        final int n54 = Tiles.Tiles_shapes[l][n9][n32] + 1;
                                        final byte b2 = Tiles.field824[l][n9][n32];
                                        final int n55 = n37 - 1;
                                        final FloorOverlayDefinition floorOverlayDefinition4 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n55);
                                        FloorOverlayDefinition floorOverlayDefinition5;
                                        if (floorOverlayDefinition4 != null) {
                                            floorOverlayDefinition5 = floorOverlayDefinition4;
                                        }
                                        else {
                                            final byte[] takeFile4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n55, (byte)(-76));
                                            final FloorOverlayDefinition floorOverlayDefinition6 = new FloorOverlayDefinition();
                                            if (takeFile4 != null) {
                                                floorOverlayDefinition6.decode(new Buffer(takeFile4), n55, (short)128);
                                            }
                                            floorOverlayDefinition6.postDecode(1187436156);
                                            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition6, n55);
                                            floorOverlayDefinition5 = floorOverlayDefinition6;
                                        }
                                        final FloorOverlayDefinition floorOverlayDefinition7 = floorOverlayDefinition5;
                                        int n56 = floorOverlayDefinition7.texture * -19982924;
                                        int n57;
                                        int method1849;
                                        if (n56 >= 0) {
                                            n57 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(n56, 471749604);
                                            method1849 = -1;
                                        }
                                        else if (1660976427 == 1889574527 * floorOverlayDefinition7.primaryRgb) {
                                            method1849 = 688066503;
                                            n56 = -1;
                                            n57 = 1709126634;
                                        }
                                        else {
                                            method1849 = GameBuild.method1847(floorOverlayDefinition7.hue * -1985813335, floorOverlayDefinition7.saturation * 470803713, floorOverlayDefinition7.lightness * 1432586753, -1484651962);
                                            final int n58 = -372405639 * Tiles.rndHue + floorOverlayDefinition7.hue * -1577183561 & 0xFF;
                                            int n59 = floorOverlayDefinition7.lightness * 532980473 + Tiles.rndLightness * -956940951;
                                            if (n59 < 0) {
                                                n59 = 0;
                                            }
                                            else if (n59 > 255) {
                                                n59 = 255;
                                            }
                                            n57 = GameBuild.method1847(n58, floorOverlayDefinition7.saturation * 152879971, n59, -1635420221);
                                        }
                                        int n60 = 0;
                                        if (n57 != -1849273778) {
                                            n60 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(n57, -443800391, (byte)0)];
                                        }
                                        if (-1 != floorOverlayDefinition7.secondaryRgb * -531057821) {
                                            final int n61 = floorOverlayDefinition7.secondaryHue * 1632506385 + 150085871 * Tiles.rndHue & 0xFF;
                                            int n62 = Tiles.rndLightness * -1534389339 + floorOverlayDefinition7.secondaryLightness * -1379609783;
                                            if (n62 < 0) {
                                                n62 = 0;
                                            }
                                            else if (n62 > -732058388) {
                                                n62 = 1201065537;
                                            }
                                            n60 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(GameBuild.method1847(n61, floorOverlayDefinition7.secondarySaturation * 472339099, n62, 644562964), 96, (byte)0)];
                                        }
                                        scene.addTile(l, n9, n32, n54, b2, n56, n38, n39, n40, n41, class10.method41(method1847, n42, -739550467), class10.method41(method1847, n43, -683343743), class10.method41(method1847, n44, -1493601530), class10.method41(method1847, n45, -1941219340), class478.method2437(method1849, n42, (byte)0), class478.method2437(method1849, n43, (byte)0), class478.method2437(method1849, n44, (byte)0), class478.method2437(method1849, n45, (byte)0), n53, n60);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int n63 = 1; n63 < 103; ++n63) {
                for (int n64 = 1; n64 < -1464337251; ++n64) {
                    scene.setTileMinPlane(l, n64, n63, PcmPlayer.method240(l, n64, n63, 1499780181));
                }
            }
            class186.Tiles_underlays[l] = null;
            Tiles.Tiles_overlays[l] = null;
            Tiles.Tiles_shapes[l] = null;
            Tiles.field824[l] = null;
            Tiles.field819[l] = null;
        }
        scene.de(-50, 1181898800, -1798047937);
        for (int n65 = 0; n65 < -1037563018; ++n65) {
            for (int n66 = 0; n66 < -322877780; ++n66) {
                if (0x2 == (Tiles.Tiles_renderFlags[1][n65][n66] & 0x2)) {
                    scene.setLinkBelow(n65, n66);
                }
            }
        }
        int n67 = 1;
        int n68 = 2;
        int n69 = 4;
        for (int n70 = 0; n70 < 4; ++n70) {
            if (n70 > 0) {
                n67 <<= 3;
                n68 <<= 3;
                n69 <<= 3;
            }
            for (int n71 = 0; n71 <= n70; ++n71) {
                for (int n72 = 0; n72 <= -584231671; ++n72) {
                    for (int n73 = 0; n73 <= -2025219665; ++n73) {
                        if (0x0 != (class161.field1407[n71][n73][n72] & n67)) {
                            int n74 = n72;
                            int n75 = n72;
                            int n76 = n71;
                            int n77 = n71;
                            while (n74 > 0 && (class161.field1407[n71][n73][n74 - 1] & n67) != 0x0) {
                                --n74;
                            }
                            while (n75 < 1493491642 && (class161.field1407[n71][n73][1 + n75] & n67) != 0x0) {
                                ++n75;
                            }
                        Label_3366:
                            while (n76 > 0) {
                                for (int n78 = n74; n78 <= n75; ++n78) {
                                    if (0x0 == (class161.field1407[n76 - 1][n73][n78] & n67)) {
                                        break Label_3366;
                                    }
                                }
                                --n76;
                            }
                        Label_3436:
                            while (n77 < n70) {
                                for (int n79 = n74; n79 <= n75; ++n79) {
                                    if (0x0 == (class161.field1407[n77 + 1][n73][n79] & n67)) {
                                        break Label_3436;
                                    }
                                }
                                ++n77;
                            }
                            if ((1 + (n75 - n74)) * (n77 + 1 - n76) >= 8) {
                                Scene.Scene_addOccluder(n70, 1, n73 * 128, 1055980558 * n73, 128 * n74, n75 * 1418604630 + 533847944, Tiles.Tiles_heights[n77][n73][n74] - 574218284, Tiles.Tiles_heights[n76][n73][n74]);
                                for (int n80 = n76; n80 <= n77; ++n80) {
                                    for (int n81 = n74; n81 <= n75; ++n81) {
                                        final int[] array4 = class161.field1407[n80][n73];
                                        final int n82 = n81;
                                        array4[n82] &= ~n67;
                                    }
                                }
                            }
                        }
                        if ((class161.field1407[n71][n73][n72] & n68) != 0x0) {
                            int n83 = n73;
                            int n84 = n73;
                            int n85 = n71;
                            int n86 = n71;
                            while (n83 > 0 && (class161.field1407[n71][n83 - 1][n72] & n68) != 0x0) {
                                --n83;
                            }
                            while (n84 < 1989888045 && 0x0 != (class161.field1407[n71][1 + n84][n72] & n68)) {
                                ++n84;
                            }
                        Label_0972:
                            while (n85 > 0) {
                                for (int n87 = n83; n87 <= n84; ++n87) {
                                    if (0x0 == (class161.field1407[n85 - 1][n87][n72] & n68)) {
                                        break Label_0972;
                                    }
                                }
                                --n85;
                            }
                        Label_3819:
                            while (n86 < n70) {
                                for (int n88 = n83; n88 <= n84; ++n88) {
                                    if (0x0 == (class161.field1407[n86 + 1][n88][n72] & n68)) {
                                        break Label_3819;
                                    }
                                }
                                ++n86;
                            }
                            if ((1 + (n84 - n83)) * (n86 + 1 - n85) >= 8) {
                                Scene.Scene_addOccluder(n70, 2, n83 * 366827975, n84 * -1542266059 + 128, 128 * n72, 128 * n72, Tiles.Tiles_heights[n86][n83][n72] - 240, Tiles.Tiles_heights[n85][n83][n72]);
                                for (int n89 = n85; n89 <= n86; ++n89) {
                                    for (int n90 = n83; n90 <= n84; ++n90) {
                                        final int[] array5 = class161.field1407[n89][n90];
                                        final int n91 = n72;
                                        array5[n91] &= ~n68;
                                    }
                                }
                            }
                        }
                        if ((class161.field1407[n71][n73][n72] & n69) != 0x0) {
                            int n92 = n73;
                            int n93 = n73;
                            int n94 = n72;
                            int n95 = n72;
                            while (n94 > 0 && (class161.field1407[n71][n73][n94 - 1] & n69) != 0x0) {
                                --n94;
                            }
                            while (n95 < 104 && 0x0 != (class161.field1407[n71][n73][n95 + 1] & n69)) {
                                ++n95;
                            }
                        Label_4166:
                            while (n92 > 0) {
                                for (int n96 = n94; n96 <= n95; ++n96) {
                                    if ((class161.field1407[n71][n92 - 1][n96] & n69) == 0x0) {
                                        break Label_4166;
                                    }
                                }
                                --n92;
                            }
                        Label_4217:
                            while (n93 < -549520648) {
                                for (int n97 = n94; n97 <= n95; ++n97) {
                                    if ((class161.field1407[n71][1 + n93][n97] & n69) == 0x0) {
                                        break Label_4217;
                                    }
                                }
                                ++n93;
                            }
                            if ((n95 - n94 + 1) * (1 + (n93 - n92)) >= 4) {
                                final int n98 = Tiles.Tiles_heights[n71][n92][n94];
                                Scene.Scene_addOccluder(n70, 4, n92 * 128, 128 + n93 * 128, 128 * n94, -1230888839 + n95 * 392385824, n98, n98);
                                for (int n99 = n92; n99 <= n93; ++n99) {
                                    for (int n100 = n94; n100 <= n95; ++n100) {
                                        final int[] array6 = class161.field1407[n71][n99];
                                        final int n101 = n100;
                                        array6[n101] &= ~n69;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    static final int ck(final int n, final int n2) {
        final int n3 = -789639740 * n2 + n;
        final int n4 = n3 << 13 ^ n3;
        return (1376312589 + (-591508914 * (n4 * n4) - 65443622) * n4 & Integer.MAX_VALUE) >> 19 & 0xFF;
    }
    
    static final void bo(final int n, final int n2, final int n3) {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                Tiles.Tiles_heights[n][n2 + i][n3 + j] = 0;
            }
        }
        if (n2 > 0) {
            for (int k = 1; k < 8; ++k) {
                Tiles.Tiles_heights[n][n2][n3 + k] = Tiles.Tiles_heights[n][n2 - 1][n3 + k];
            }
        }
        if (n3 > 0) {
            for (int l = 1; l < 8; ++l) {
                Tiles.Tiles_heights[n][n2 + l][n3] = Tiles.Tiles_heights[n][n2 + l][n3 - 1];
            }
        }
        if (n2 > 0 && Tiles.Tiles_heights[n][n2 - 1][n3] != 0) {
            Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2 - 1][n3];
        }
        else if (n3 > 0 && Tiles.Tiles_heights[n][n2][n3 - 1] != 0) {
            Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2][n3 - 1];
        }
        else if (n2 > 0 && n3 > 0 && Tiles.Tiles_heights[n][n2 - 1][n3 - 1] != 0) {
            Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2 - 1][n3 - 1];
        }
    }
    
    static int bp(final int n, final int n2, final int n3) {
        if ((Tiles.Tiles_renderFlags[n][n2][n3] & 0x8) != 0x0) {
            return 0;
        }
        if (n > 0 && 0x0 != (Tiles.Tiles_renderFlags[1][n2][n3] & 0x2)) {
            return n - 1;
        }
        return n;
    }
    
    static final void ct(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Scene scene, final CollisionMap collisionMap) {
        final ObjectComposition vmethod3248 = class144.vmethod3248(n5, (short)7473);
        final int n9 = (n8 >= 0) ? n8 : (1292954189 * vmethod3248.animationId);
        int n10;
        int n11;
        if (n6 != 1 && n6 != 3) {
            n10 = vmethod3248.sizeX * -1339930361;
            n11 = vmethod3248.sizeY * -1659393955;
        }
        else {
            n10 = vmethod3248.sizeY * -1659393955;
            n11 = vmethod3248.sizeX * -1339930361;
        }
        int n12;
        int n13;
        if (n3 + n10 <= 104) {
            n12 = (n10 >> 1) + n3;
            n13 = (1 + n10 >> 1) + n3;
        }
        else {
            n12 = n3;
            n13 = n3 + 1;
        }
        int n14;
        int n15;
        if (n4 + n11 <= 104) {
            n14 = (n11 >> 1) + n4;
            n15 = n4 + (n11 + 1 >> 1);
        }
        else {
            n14 = n4;
            n15 = 1 + n4;
        }
        final int[][] array = Tiles.Tiles_heights[n2];
        final int n16 = array[n12][n14] + array[n13][n14] + array[n12][n15] + array[n13][n15] >> 2;
        final int n17 = (n3 << 7) + (n10 << 6);
        final int n18 = (n11 << 6) + (n4 << 7);
        final long calculateTag = FaceNormal.calculateTag(n3, n4, 2, 0 == 415653149 * vmethod3248.int1, n5, -466301288);
        int n19 = (n6 << 6) + n7;
        if (1 == -1850643527 * vmethod3248.int3) {
            n19 += 256;
        }
        if (n7 == 22) {
            Renderable model;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model = vmethod3248.getModel(22, n6, array, n17, n16, n18, (byte)25);
            }
            else {
                model = new DynamicObject(n5, 22, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newFloorDecoration(n, n3, n4, n16, model, calculateTag, n19);
            if (vmethod3248.interactType * -973955889 == 1) {
                collisionMap.method1169(n3, n4, -214488184);
            }
            return;
        }
        if (n7 == 10 || n7 == 11) {
            Renderable model2;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model2 = vmethod3248.getModel(10, n6, array, n17, n16, n18, (byte)(-64));
            }
            else {
                model2 = new DynamicObject(n5, 10, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            if (null != model2) {
                scene.method1288(n, n3, n4, n16, n10, n11, model2, (11 == n7) ? 256 : 0, calculateTag, n19);
            }
            if (0 != vmethod3248.interactType * -973955889) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-56));
            }
            return;
        }
        if (n7 >= 12) {
            Renderable model3;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model3 = vmethod3248.getModel(n7, n6, array, n17, n16, n18, (byte)49);
            }
            else {
                model3 = new DynamicObject(n5, n7, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.method1288(n, n3, n4, n16, 1, 1, model3, 0, calculateTag, n19);
            if (vmethod3248.interactType * -973955889 != 0) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-112));
            }
            return;
        }
        if (n7 == 0) {
            Renderable model4;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model4 = vmethod3248.getModel(0, n6, array, n17, n16, n18, (byte)(-59));
            }
            else {
                model4 = new DynamicObject(n5, 0, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model4, null, Tiles.field820[n6], 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (1 == n7) {
            Renderable model5;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model5 = vmethod3248.getModel(1, n6, array, n17, n16, n18, (byte)31);
            }
            else {
                model5 = new DynamicObject(n5, 1, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model5, null, Tiles.field829[n6], 0, calculateTag, n19);
            if (0 != -973955889 * vmethod3248.interactType) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (2 == n7) {
            final int n20 = 1 + n6 & 0x3;
            Renderable model6;
            Renderable model7;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model6 = vmethod3248.getModel(2, 4 + n6, array, n17, n16, n18, (byte)0);
                model7 = vmethod3248.getModel(2, n20, array, n17, n16, n18, (byte)(-44));
            }
            else {
                model6 = new DynamicObject(n5, 2, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
                model7 = new DynamicObject(n5, 2, n20, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model6, model7, Tiles.field820[n6], Tiles.field820[n20], calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (n7 == 3) {
            Renderable model8;
            if (n9 == -1 && null == vmethod3248.soundEffectIds) {
                model8 = vmethod3248.getModel(3, n6, array, n17, n16, n18, (byte)0);
            }
            else {
                model8 = new DynamicObject(n5, 3, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.newBoundaryObject(n, n3, n4, n16, model8, null, Tiles.field829[n6], 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                collisionMap.method1163(n3, n4, n7, n6, vmethod3248.boolean1, -2067452311);
            }
            return;
        }
        if (n7 == 9) {
            Renderable model9;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model9 = vmethod3248.getModel(n7, n6, array, n17, n16, n18, (byte)(-45));
            }
            else {
                model9 = new DynamicObject(n5, n7, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.method1288(n, n3, n4, n16, 1, 1, model9, 0, calculateTag, n19);
            if (-973955889 * vmethod3248.interactType != 0) {
                CollisionMap.wa(collisionMap, n3, n4, n10, n11, vmethod3248.boolean1, (byte)(-72));
            }
            return;
        }
        if (4 == n7) {
            Renderable model10;
            if (-1 == n9 && null == vmethod3248.soundEffectIds) {
                model10 = vmethod3248.getModel(4, n6, array, n17, n16, n18, (byte)(-52));
            }
            else {
                model10 = new DynamicObject(n5, 4, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model10, null, Tiles.field820[n6], 0, 0, 0, calculateTag, n19);
            return;
        }
        if (5 == n7) {
            int n21 = 16;
            final long boundaryObjectTag = scene.getBoundaryObjectTag(n, n3, n4);
            if (boundaryObjectTag != 0L) {
                n21 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag), (short)14184).int2 * -89408815;
            }
            Renderable model11;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model11 = vmethod3248.getModel(4, n6, array, n17, n16, n18, (byte)51);
            }
            else {
                model11 = new DynamicObject(n5, 4, n6, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model11, null, Tiles.field820[n6], 0, Tiles.field830[n6] * n21, Tiles.field827[n6] * n21, calculateTag, n19);
            return;
        }
        if (n7 == 6) {
            int n22 = 8;
            final long boundaryObjectTag2 = scene.getBoundaryObjectTag(n, n3, n4);
            if (0L != boundaryObjectTag2) {
                n22 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag2), (short)16619).int2 * -89408815 / 2;
            }
            Renderable model12;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model12 = vmethod3248.getModel(4, 4 + n6, array, n17, n16, n18, (byte)59);
            }
            else {
                model12 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model12, null, 256, n6, Tiles.field832[n6] * n22, n22 * Tiles.field833[n6], calculateTag, n19);
            return;
        }
        if (n7 == 7) {
            final int n23 = n6 + 2 & 0x3;
            Renderable model13;
            if (n9 == -1 && vmethod3248.soundEffectIds == null) {
                model13 = vmethod3248.getModel(4, 4 + n23, array, n17, n16, n18, (byte)56);
            }
            else {
                model13 = new DynamicObject(n5, 4, 4 + n23, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model13, null, 256, n23, 0, 0, calculateTag, n19);
            return;
        }
        if (8 == n7) {
            int n24 = 8;
            final long boundaryObjectTag3 = scene.getBoundaryObjectTag(n, n3, n4);
            if (0L != boundaryObjectTag3) {
                n24 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag3), (short)29114).int2 * -89408815 / 2;
            }
            final int n25 = n6 + 2 & 0x3;
            Renderable model14;
            Renderable model15;
            if (-1 == n9 && vmethod3248.soundEffectIds == null) {
                model14 = vmethod3248.getModel(4, 4 + n6, array, n17, n16, n18, (byte)16);
                model15 = vmethod3248.getModel(4, 4 + n25, array, n17, n16, n18, (byte)0);
            }
            else {
                model14 = new DynamicObject(n5, 4, n6 + 4, n2, n3, n4, n9, vmethod3248.boolean3, null);
                model15 = new DynamicObject(n5, 4, 4 + n25, n2, n3, n4, n9, vmethod3248.boolean3, null);
            }
            scene.cw(n, n3, n4, n16, model14, model15, 256, n6, n24 * Tiles.field832[n6], n24 * Tiles.field833[n6], calculateTag, n19);
        }
    }
    
    static final int cc(final int n, final int n2, final int n3, final int n4) {
        final int n5 = 65536 - Rasterizer3D.Rasterizer3D_cosine[n3 * 1024 / n4] >> 1;
        return (n * (65536 - n5) >> 16) + (n2 * n5 >> 16);
    }
    
    static final boolean bt(final byte[] array, final int n, final int n2) {
        boolean b = true;
        final Buffer buffer = new Buffer(array);
        int n3 = -1;
        while (true) {
            final int method2518 = Buffer.method2518(buffer, (byte)(-100));
            if (method2518 == 0) {
                break;
            }
            n3 += method2518;
            int n4 = 0;
            int n5 = 0;
            while (true) {
                if (n5 != 0) {
                    if (0 == buffer.readUShortSmart(-1613556255)) {
                        break;
                    }
                    Buffer.ra(buffer, (byte)7);
                }
                else {
                    final int uShortSmart = buffer.readUShortSmart(-1279621729);
                    if (uShortSmart == 0) {
                        break;
                    }
                    n4 += uShortSmart - 1;
                    final int n6 = n4 & 0x3F;
                    final int n7 = n4 >> 6 & 0x3F;
                    final int n8 = Buffer.ra(buffer, (byte)7) >> 2;
                    final int n9 = n7 + n;
                    final int n10 = n2 + n6;
                    if (n9 <= 0 || n10 <= 0 || n9 >= 103 || n10 >= 103) {
                        continue;
                    }
                    final ObjectComposition vmethod3248 = class144.vmethod3248(n3, (short)2593);
                    if (n8 == 22 && Client.isLowDetail && 0 == vmethod3248.int1 * 415653149 && -973955889 * vmethod3248.interactType != 1 && !vmethod3248.boolean2) {
                        continue;
                    }
                    if (!ObjectComposition.bp(vmethod3248, -2124979644)) {
                        Client.field425 += 1441978033;
                        b = false;
                    }
                    n5 = 1;
                }
            }
        }
        return b;
    }
    
    static int bc(final int n, final int n2, final int n3) {
        if ((Tiles.Tiles_renderFlags[n][n2][n3] & 0x8) != 0x0) {
            return 0;
        }
        if (n > 0 && 0x0 != (Tiles.Tiles_renderFlags[1][n2][n3] & 0x2)) {
            return n - 1;
        }
        return n;
    }
    
    static final void br(final byte[] array, final int n, final int n2, final Scene scene, final CollisionMap[] array2) {
        final Buffer buffer = new Buffer(array);
        int n3 = -1;
        while (true) {
            final int method2518 = Buffer.method2518(buffer, (byte)(-56));
            if (method2518 == 0) {
                break;
            }
            n3 += method2518;
            int n4 = 0;
            while (true) {
                final int uShortSmart = buffer.readUShortSmart(-1915365703);
                if (uShortSmart == 0) {
                    break;
                }
                n4 += uShortSmart - 1;
                final int n5 = n4 & 0x3F;
                final int n6 = n4 >> 6 & 0x3F;
                final int n7 = n4 >> 12;
                final int ra = Buffer.ra(buffer, (byte)7);
                final int n8 = ra >> 2;
                final int n9 = ra & 0x3;
                final int n10 = n6 + n;
                final int n11 = n5 + n2;
                if (n10 <= 0 || n11 <= 0 || n10 >= 103 || n11 >= 103) {
                    continue;
                }
                int n12 = n7;
                if (0x2 == (Tiles.Tiles_renderFlags[1][n10][n11] & 0x2)) {
                    --n12;
                }
                CollisionMap collisionMap = null;
                if (n12 >= 0) {
                    collisionMap = array2[n12];
                }
                class207.addObjects(n7, n10, n11, n3, n9, n8, scene, collisionMap, -1023592493);
            }
        }
    }
    
    static final int ci(final int n, final int n2, final int n3) {
        final int n4 = n / n3;
        final int n5 = n & n3 - 1;
        final int n6 = n2 / n3;
        return JagexCache.method952(JagexCache.method952(class383.method2085(n4, n6, (byte)61), class383.method2085(1 + n4, n6, (byte)82), n5, n3, (byte)(-10)), JagexCache.method952(class383.method2085(n4, n6 + 1, (byte)122), class383.method2085(n4 + 1, n6 + 1, (byte)71), n5, n3, (byte)(-34)), n2 & n3 - 1, n3, (byte)(-59));
    }
    
    public static void method475(final byte b) {
        try {
            try {
                final File file = new File(HorizontalAlignment.userHomeDirectory, "random.dat");
                Label_0214: {
                    if (file.exists()) {
                        if (b != 1) {
                            throw new IllegalStateException();
                        }
                        JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
                    }
                    else {
                        for (int i = 0; i < class96.cacheSubPaths.length; ++i) {
                            if (b != 1) {
                                return;
                            }
                            int j = 0;
                            while (j < class130.cacheParentPaths.length) {
                                if (b != 1) {
                                    throw new IllegalStateException();
                                }
                                final File file2 = new File(class130.cacheParentPaths[j] + class96.cacheSubPaths[i] + File.separatorChar + "random.dat");
                                if (file2.exists()) {
                                    if (b != 1) {
                                        throw new IllegalStateException();
                                    }
                                    JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file2, "rw", 25L), 24, 0);
                                    break Label_0214;
                                }
                                else {
                                    ++j;
                                }
                            }
                        }
                    }
                }
                if (JagexCache.JagexCache_randomDat == null) {
                    if (b != 1) {
                        return;
                    }
                    final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    final int read = randomAccessFile.read();
                    randomAccessFile.seek(0L);
                    randomAccessFile.write(read);
                    randomAccessFile.seek(0L);
                    randomAccessFile.close();
                    JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
                }
            }
            catch (IOException ex2) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cd.aw(" + ')');
        }
    }
    
    static final int cu(final int n, final int n2) {
        final int n3 = 57 * n2 + n;
        final int n4 = n3 << 13 ^ n3;
        return (1376312589 + (15731 * (n4 * n4) + 789221) * n4 & Integer.MAX_VALUE) >> 19 & 0xFF;
    }
    
    static final int cx(final int n, int n2) {
        if (-2 == n) {
            return 12345678;
        }
        if (-1 == n) {
            if (n2 < 2) {
                n2 = 2;
            }
            else if (n2 > 126) {
                n2 = 126;
            }
            return n2;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    static final void bq(final Scene scene, final CollisionMap[] array) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 2146325917; ++j) {
                for (int k = 0; k < 104; ++k) {
                    if ((Tiles.Tiles_renderFlags[i][j][k] & 0x1) == 0x1) {
                        int n = i;
                        if (0x2 == (Tiles.Tiles_renderFlags[1][j][k] & 0x2)) {
                            --n;
                        }
                        if (n >= 0) {
                            array[n].setBlockedByFloor(j, k, (byte)12);
                        }
                    }
                }
            }
        }
        Tiles.rndHue += ((int)(Math.random() * 5.0) - 2) * 1514061769;
        if (-446517899 * Tiles.rndHue < -8) {
            Tiles.rndHue = 1900652189;
        }
        if (2057094931 * Tiles.rndHue > 8) {
            Tiles.rndHue = -772407736;
        }
        Tiles.rndLightness += ((int)(Math.random() * 5.0) - 2) * 256964731;
        if (Tiles.rndLightness * -647485415 < -16) {
            Tiles.rndLightness = -1913340560;
        }
        if (Tiles.rndLightness * 345273263 > 16) {
            Tiles.rndLightness = 1913340560;
        }
        for (int l = 0; l < 4; ++l) {
            final byte[][] array2 = Tiles.field819[l];
            final int n2 = -2118289177 * (int)Math.sqrt(5100.0) >> 8;
            for (int n3 = 1; n3 < 103; ++n3) {
                for (int n4 = 1; n4 < 103; ++n4) {
                    final int n5 = Tiles.Tiles_heights[l][1 + n4][n3] - Tiles.Tiles_heights[l][n4 - 1][n3];
                    final int n6 = Tiles.Tiles_heights[l][n4][n3 + 1] - Tiles.Tiles_heights[l][n4][n3 - 1];
                    final int n7 = (int)Math.sqrt(n6 * n6 + (-812372824 + n5 * n5));
                    Tiles.field821[n4][n3] = 96 + ((n6 << 8) / n7 * -50 + (-1667293377 * (-442523750 / n7) + -50 * ((n5 << 8) / n7))) / n2 - ((array2[n4][1 + n3] >> 3) + ((array2[n4][n3 - 1] >> 2) + ((array2[1 + n4][n3] >> 3) + (array2[n4 - 1][n3] >> 2))) + (array2[n4][n3] >> 1));
                }
            }
            for (int n8 = 0; n8 < -913932370; ++n8) {
                FileSystem.Tiles_hue[n8] = 0;
                Tiles.Tiles_saturation[n8] = 0;
                class283.Tiles_lightness[n8] = 0;
                UserComparator4.Tiles_hueMultiplier[n8] = 0;
                class31.field92[n8] = 0;
            }
            for (int n9 = -233969500; n9 < 109; ++n9) {
                for (int n10 = 0; n10 < 104; ++n10) {
                    final int n11 = 5 + n9;
                    if (n11 >= 0 && n11 < 1823538894) {
                        final int n12 = class186.Tiles_underlays[l][n11][n10] & (int)DynamicObject.method466(15, 1563032869);
                        if (n12 > 0) {
                            final int n13 = n12 - 1;
                            final FloorUnderlayDefinition floorUnderlayDefinition = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n13);
                            FloorUnderlayDefinition floorUnderlayDefinition2;
                            if (null != floorUnderlayDefinition) {
                                floorUnderlayDefinition2 = floorUnderlayDefinition;
                            }
                            else {
                                final byte[] takeFile = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n13, (byte)(-46));
                                final FloorUnderlayDefinition floorUnderlayDefinition3 = new FloorUnderlayDefinition();
                                if (null != takeFile) {
                                    floorUnderlayDefinition3.decode(new Buffer(takeFile), n13, -2044213231);
                                }
                                floorUnderlayDefinition3.postDecode(875414437);
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition3, n13);
                                floorUnderlayDefinition2 = floorUnderlayDefinition3;
                            }
                            final FloorUnderlayDefinition floorUnderlayDefinition4 = floorUnderlayDefinition2;
                            final int[] tiles_hue = FileSystem.Tiles_hue;
                            final int n14 = n10;
                            tiles_hue[n14] += floorUnderlayDefinition4.hue * 372444635;
                            final int[] tiles_saturation = Tiles.Tiles_saturation;
                            final int n15 = n10;
                            tiles_saturation[n15] += 416705208 * floorUnderlayDefinition4.saturation;
                            final int[] tiles_lightness = class283.Tiles_lightness;
                            final int n16 = n10;
                            tiles_lightness[n16] += -1527986335 * floorUnderlayDefinition4.lightness;
                            final int[] tiles_hueMultiplier = UserComparator4.Tiles_hueMultiplier;
                            final int n17 = n10;
                            tiles_hueMultiplier[n17] += floorUnderlayDefinition4.hueMultiplier * -13353404;
                            final int[] field92 = class31.field92;
                            final int n18 = n10;
                            ++field92[n18];
                        }
                    }
                    final int n19 = n9 - 5;
                    if (n19 >= 0 && n19 < 104) {
                        final int n20 = class186.Tiles_underlays[l][n19][n10] & (int)DynamicObject.method466(15, 1428774614);
                        if (n20 > 0) {
                            final int n21 = n20 - 1;
                            final FloorUnderlayDefinition floorUnderlayDefinition5 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n21);
                            FloorUnderlayDefinition floorUnderlayDefinition6;
                            if (floorUnderlayDefinition5 != null) {
                                floorUnderlayDefinition6 = floorUnderlayDefinition5;
                            }
                            else {
                                final byte[] takeFile2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n21, (byte)(-125));
                                final FloorUnderlayDefinition floorUnderlayDefinition7 = new FloorUnderlayDefinition();
                                if (takeFile2 != null) {
                                    floorUnderlayDefinition7.decode(new Buffer(takeFile2), n21, -1715835485);
                                }
                                floorUnderlayDefinition7.postDecode(875414437);
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition7, n21);
                                floorUnderlayDefinition6 = floorUnderlayDefinition7;
                            }
                            final FloorUnderlayDefinition floorUnderlayDefinition8 = floorUnderlayDefinition6;
                            final int[] tiles_hue2 = FileSystem.Tiles_hue;
                            final int n22 = n10;
                            tiles_hue2[n22] -= 372444635 * floorUnderlayDefinition8.hue;
                            final int[] tiles_saturation2 = Tiles.Tiles_saturation;
                            final int n23 = n10;
                            tiles_saturation2[n23] -= floorUnderlayDefinition8.saturation * -7622763;
                            final int[] tiles_lightness2 = class283.Tiles_lightness;
                            final int n24 = n10;
                            tiles_lightness2[n24] -= -1527986335 * floorUnderlayDefinition8.lightness;
                            final int[] tiles_hueMultiplier2 = UserComparator4.Tiles_hueMultiplier;
                            final int n25 = n10;
                            tiles_hueMultiplier2[n25] -= -2012234183 * floorUnderlayDefinition8.hueMultiplier;
                            final int[] field93 = class31.field92;
                            final int n26 = n10;
                            --field93[n26];
                        }
                    }
                }
                if (n9 >= 1 && n9 < 103) {
                    int n27 = 0;
                    int n28 = 0;
                    int n29 = 0;
                    int n30 = 0;
                    int n31 = 0;
                    for (int n32 = -1819145125; n32 < -1058750943; ++n32) {
                        final int n33 = n32 + 5;
                        if (n33 >= 0 && n33 < 104) {
                            n27 += FileSystem.Tiles_hue[n33];
                            n28 += Tiles.Tiles_saturation[n33];
                            n29 += class283.Tiles_lightness[n33];
                            n30 += UserComparator4.Tiles_hueMultiplier[n33];
                            n31 += class31.field92[n33];
                        }
                        final int n34 = n32 - 5;
                        if (n34 >= 0 && n34 < 398908363) {
                            n27 -= FileSystem.Tiles_hue[n34];
                            n28 -= Tiles.Tiles_saturation[n34];
                            n29 -= class283.Tiles_lightness[n34];
                            n30 -= UserComparator4.Tiles_hueMultiplier[n34];
                            n31 -= class31.field92[n34];
                        }
                        if (n32 >= 1 && n32 < -1774983860) {
                            if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][n9][n32] & 0x2) != 0x0 || 0x0 == (Tiles.Tiles_renderFlags[l][n9][n32] & 0x10)) {
                                if (l < Tiles.Tiles_minPlane * 1401144457) {
                                    Tiles.Tiles_minPlane = l * -1633398619;
                                }
                                final int n35 = (int)DynamicObject.method466(15, 1445515834);
                                final int n36 = class186.Tiles_underlays[l][n9][n32] & n35;
                                final int n37 = Tiles.Tiles_overlays[l][n9][n32] & n35;
                                if (n36 > 0 || n37 > 0) {
                                    final int n38 = Tiles.Tiles_heights[l][n9][n32];
                                    final int n39 = Tiles.Tiles_heights[l][n9 + 1][n32];
                                    final int n40 = Tiles.Tiles_heights[l][n9 + 1][1 + n32];
                                    final int n41 = Tiles.Tiles_heights[l][n9][n32 + 1];
                                    final int n42 = Tiles.field821[n9][n32];
                                    final int n43 = Tiles.field821[1 + n9][n32];
                                    final int n44 = Tiles.field821[n9 + 1][n32 + 1];
                                    final int n45 = Tiles.field821[n9][n32 + 1];
                                    int method1847 = -1;
                                    int method1848 = -1;
                                    if (n36 > 0) {
                                        final int n46 = n27 * 953112149 / n30;
                                        final int n47 = n28 / n31;
                                        final int n48 = n29 / n31;
                                        method1847 = GameBuild.method1847(n46, n47, n48, -464260160);
                                        final int n49 = n46 + Tiles.rndHue * -776779098 & 0x7BC7AC65;
                                        int n50 = n48 + Tiles.rndLightness * -647485415;
                                        if (n50 < 0) {
                                            n50 = 0;
                                        }
                                        else if (n50 > 255) {
                                            n50 = 255;
                                        }
                                        method1848 = GameBuild.method1847(n49, n47, n50, -752719915);
                                    }
                                    if (l > 0) {
                                        boolean b = true;
                                        if (n36 == 0 && 0 != Tiles.Tiles_shapes[l][n9][n32]) {
                                            b = false;
                                        }
                                        if (n37 > 0) {
                                            final int n51 = n37 - 1;
                                            final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n51);
                                            FloorOverlayDefinition floorOverlayDefinition2;
                                            if (floorOverlayDefinition != null) {
                                                floorOverlayDefinition2 = floorOverlayDefinition;
                                            }
                                            else {
                                                final byte[] takeFile3 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n51, (byte)(-43));
                                                final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                                                if (takeFile3 != null) {
                                                    floorOverlayDefinition3.decode(new Buffer(takeFile3), n51, (short)128);
                                                }
                                                floorOverlayDefinition3.postDecode(899862879);
                                                FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n51);
                                                floorOverlayDefinition2 = floorOverlayDefinition3;
                                            }
                                            if (!floorOverlayDefinition2.hideUnderlay) {
                                                b = false;
                                            }
                                        }
                                        if (b && n38 == n39 && n38 == n40 && n41 == n38) {
                                            final int[] array3 = class161.field1407[l][n9];
                                            final int n52 = n32;
                                            array3[n52] |= 0x6F77EF1A;
                                        }
                                    }
                                    int n53 = 0;
                                    if (method1848 != -1) {
                                        n53 = Rasterizer3D.Rasterizer3D_colorPalette[class10.method41(method1848, 328876376, -1637367673)];
                                    }
                                    if (n37 == 0) {
                                        scene.addTile(l, n9, n32, 0, 0, -1, n38, n39, n40, n41, class10.method41(method1847, n42, -1006963197), class10.method41(method1847, n43, 1110483654), class10.method41(method1847, n44, -636534639), class10.method41(method1847, n45, 841268821), 0, 0, 0, 0, n53, 0);
                                    }
                                    else {
                                        final int n54 = Tiles.Tiles_shapes[l][n9][n32] + 1;
                                        final byte b2 = Tiles.field824[l][n9][n32];
                                        final int n55 = n37 - 1;
                                        final FloorOverlayDefinition floorOverlayDefinition4 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n55);
                                        FloorOverlayDefinition floorOverlayDefinition5;
                                        if (floorOverlayDefinition4 != null) {
                                            floorOverlayDefinition5 = floorOverlayDefinition4;
                                        }
                                        else {
                                            final byte[] takeFile4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n55, (byte)(-44));
                                            final FloorOverlayDefinition floorOverlayDefinition6 = new FloorOverlayDefinition();
                                            if (takeFile4 != null) {
                                                floorOverlayDefinition6.decode(new Buffer(takeFile4), n55, (short)128);
                                            }
                                            floorOverlayDefinition6.postDecode(950705253);
                                            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition6, n55);
                                            floorOverlayDefinition5 = floorOverlayDefinition6;
                                        }
                                        final FloorOverlayDefinition floorOverlayDefinition7 = floorOverlayDefinition5;
                                        int n56 = floorOverlayDefinition7.texture * 428647481;
                                        int n57;
                                        int method1849;
                                        if (n56 >= 0) {
                                            n57 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(n56, -952633643);
                                            method1849 = -1;
                                        }
                                        else if (16711935 == 1889574527 * floorOverlayDefinition7.primaryRgb) {
                                            method1849 = -2;
                                            n56 = -1;
                                            n57 = -1106605510;
                                        }
                                        else {
                                            method1849 = GameBuild.method1847(floorOverlayDefinition7.hue * -945013658, floorOverlayDefinition7.saturation * -529072050, floorOverlayDefinition7.lightness * 564290437, -1452188814);
                                            final int n58 = -372405639 * Tiles.rndHue + floorOverlayDefinition7.hue * 2039476711 & 0xCC883FDF;
                                            int n59 = floorOverlayDefinition7.lightness * -1800739261 + Tiles.rndLightness * -647485415;
                                            if (n59 < 0) {
                                                n59 = 0;
                                            }
                                            else if (n59 > 255) {
                                                n59 = 255;
                                            }
                                            n57 = GameBuild.method1847(n58, floorOverlayDefinition7.saturation * 58101290, n59, 1319766511);
                                        }
                                        int n60 = 0;
                                        if (n57 != 1116093446) {
                                            n60 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(n57, -15113937, (byte)0)];
                                        }
                                        if (-1 != floorOverlayDefinition7.secondaryRgb * 527897174) {
                                            final int n61 = floorOverlayDefinition7.secondaryHue * -187777599 + 1356180549 * Tiles.rndHue & 0xF9BE3D1D;
                                            int n62 = Tiles.rndLightness * -647485415 + floorOverlayDefinition7.secondaryLightness * -1379609783;
                                            if (n62 < 0) {
                                                n62 = 0;
                                            }
                                            else if (n62 > 1364288530) {
                                                n62 = 255;
                                            }
                                            n60 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(GameBuild.method1847(n61, floorOverlayDefinition7.secondarySaturation * 1797179473, n62, -934836294), -2137563141, (byte)0)];
                                        }
                                        scene.addTile(l, n9, n32, n54, b2, n56, n38, n39, n40, n41, class10.method41(method1847, n42, 608262128), class10.method41(method1847, n43, 68545631), class10.method41(method1847, n44, -1411200076), class10.method41(method1847, n45, 721689584), class478.method2437(method1849, n42, (byte)0), class478.method2437(method1849, n43, (byte)0), class478.method2437(method1849, n44, (byte)0), class478.method2437(method1849, n45, (byte)0), n53, n60);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int n63 = 1; n63 < 103; ++n63) {
                for (int n64 = 1; n64 < 1742360680; ++n64) {
                    scene.setTileMinPlane(l, n64, n63, PcmPlayer.method240(l, n64, n63, 1682562376));
                }
            }
            class186.Tiles_underlays[l] = null;
            Tiles.Tiles_overlays[l] = null;
            Tiles.Tiles_shapes[l] = null;
            Tiles.field824[l] = null;
            Tiles.field819[l] = null;
        }
        scene.de(-50, -10, -50);
        for (int n65 = 0; n65 < -65012453; ++n65) {
            for (int n66 = 0; n66 < 1501998518; ++n66) {
                if (0x2 == (Tiles.Tiles_renderFlags[1][n65][n66] & 0x2)) {
                    scene.setLinkBelow(n65, n66);
                }
            }
        }
        int n67 = 1;
        int n68 = 2;
        int n69 = 4;
        for (int n70 = 0; n70 < 4; ++n70) {
            if (n70 > 0) {
                n67 <<= 3;
                n68 <<= 3;
                n69 <<= 3;
            }
            for (int n71 = 0; n71 <= n70; ++n71) {
                for (int n72 = 0; n72 <= 922218578; ++n72) {
                    for (int n73 = 0; n73 <= 104; ++n73) {
                        if (0x0 != (class161.field1407[n71][n73][n72] & n67)) {
                            int n74 = n72;
                            int n75 = n72;
                            int n76 = n71;
                            int n77 = n71;
                            while (n74 > 0 && (class161.field1407[n71][n73][n74 - 1] & n67) != 0x0) {
                                --n74;
                            }
                            while (n75 < -350543791 && (class161.field1407[n71][n73][1 + n75] & n67) != 0x0) {
                                ++n75;
                            }
                        Label_3463:
                            while (n76 > 0) {
                                for (int n78 = n74; n78 <= n75; ++n78) {
                                    if (0x0 == (class161.field1407[n76 - 1][n73][n78] & n67)) {
                                        break Label_3463;
                                    }
                                }
                                --n76;
                            }
                        Label_2035:
                            while (n77 < n70) {
                                for (int n79 = n74; n79 <= n75; ++n79) {
                                    if (0x0 == (class161.field1407[n77 + 1][n73][n79] & n67)) {
                                        break Label_2035;
                                    }
                                }
                                ++n77;
                            }
                            if ((1 + (n75 - n74)) * (n77 + 1 - n76) >= 8) {
                                Scene.Scene_addOccluder(n70, 1, n73 * -1726469618, 128 * n73, -1575334867 * n74, n75 * 128 + 128, Tiles.Tiles_heights[n77][n73][n74] - 343244827, Tiles.Tiles_heights[n76][n73][n74]);
                                for (int n80 = n76; n80 <= n77; ++n80) {
                                    for (int n81 = n74; n81 <= n75; ++n81) {
                                        final int[] array4 = class161.field1407[n80][n73];
                                        final int n82 = n81;
                                        array4[n82] &= ~n67;
                                    }
                                }
                            }
                        }
                        if ((class161.field1407[n71][n73][n72] & n68) != 0x0) {
                            int n83 = n73;
                            int n84 = n73;
                            int n85 = n71;
                            int n86 = n71;
                            while (n83 > 0 && (class161.field1407[n71][n83 - 1][n72] & n68) != 0x0) {
                                --n83;
                            }
                            while (n84 < 104 && 0x0 != (class161.field1407[n71][1 + n84][n72] & n68)) {
                                ++n84;
                            }
                        Label_4239:
                            while (n85 > 0) {
                                for (int n87 = n83; n87 <= n84; ++n87) {
                                    if (0x0 == (class161.field1407[n85 - 1][n87][n72] & n68)) {
                                        break Label_4239;
                                    }
                                }
                                --n85;
                            }
                        Label_0366:
                            while (n86 < n70) {
                                for (int n88 = n83; n88 <= n84; ++n88) {
                                    if (0x0 == (class161.field1407[n86 + 1][n88][n72] & n68)) {
                                        break Label_0366;
                                    }
                                }
                                ++n86;
                            }
                            if ((1 + (n84 - n83)) * (n86 + 1 - n85) >= 8) {
                                Scene.Scene_addOccluder(n70, 2, n83 * 808160326, n84 * -655679983 + 128, 128 * n72, 128 * n72, Tiles.Tiles_heights[n86][n83][n72] + 1569540545, Tiles.Tiles_heights[n85][n83][n72]);
                                for (int n89 = n85; n89 <= n86; ++n89) {
                                    for (int n90 = n83; n90 <= n84; ++n90) {
                                        final int[] array5 = class161.field1407[n89][n90];
                                        final int n91 = n72;
                                        array5[n91] &= ~n68;
                                    }
                                }
                            }
                        }
                        if ((class161.field1407[n71][n73][n72] & n69) != 0x0) {
                            int n92 = n73;
                            int n93 = n73;
                            int n94 = n72;
                            int n95 = n72;
                            while (n94 > 0 && (class161.field1407[n71][n73][n94 - 1] & n69) != 0x0) {
                                --n94;
                            }
                            while (n95 < 1184472534 && 0x0 != (class161.field1407[n71][n73][n95 + 1] & n69)) {
                                ++n95;
                            }
                        Label_4185:
                            while (n92 > 0) {
                                for (int n96 = n94; n96 <= n95; ++n96) {
                                    if ((class161.field1407[n71][n92 - 1][n96] & n69) == 0x0) {
                                        break Label_4185;
                                    }
                                }
                                --n92;
                            }
                        Label_4255:
                            while (n93 < 104) {
                                for (int n97 = n94; n97 <= n95; ++n97) {
                                    if ((class161.field1407[n71][1 + n93][n97] & n69) == 0x0) {
                                        break Label_4255;
                                    }
                                }
                                ++n93;
                            }
                            if ((n95 - n94 + 1) * (1 + (n93 - n92)) >= 4) {
                                final int n98 = Tiles.Tiles_heights[n71][n92][n94];
                                Scene.Scene_addOccluder(n70, 4, n92 * 128, 128 + n93 * 1682256822, 128 * n94, -563989658 + n95 * 128, n98, n98);
                                for (int n99 = n92; n99 <= n93; ++n99) {
                                    for (int n100 = n94; n100 <= n95; ++n100) {
                                        final int[] array6 = class161.field1407[n71][n99];
                                        final int n101 = n100;
                                        array6[n101] &= ~n69;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    static final void method473(final byte[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final Scene scene, final CollisionMap[] array2) {
        final Buffer buffer = new Buffer(array);
        int n8 = -1;
        while (true) {
            final int method2518 = Buffer.method2518(buffer, (byte)(-110));
            if (method2518 == 0) {
                break;
            }
            n8 += method2518;
            int n9 = 0;
            while (true) {
                final int uShortSmart = buffer.readUShortSmart(-880220130);
                if (uShortSmart == 0) {
                    break;
                }
                n9 += uShortSmart - 1;
                final int n10 = n9 & 0x3F;
                final int n11 = n9 >> 6 & 0x3F;
                final int n12 = n9 >> 12;
                final int ra = Buffer.ra(buffer, (byte)7);
                final int n13 = ra >> 2;
                final int n14 = ra & 0x3;
                if (n12 != n4 || n11 < n5 || n11 >= n5 + 8 || n10 < n6 || n10 >= n6 + 8) {
                    continue;
                }
                final ObjectComposition vmethod3248 = class144.vmethod3248(n8, (short)28406);
                final int n15 = n11 & 0x7;
                final int n16 = n10 & 0x7;
                int n17 = -1339930361 * vmethod3248.sizeX;
                int n18 = -1659393955 * vmethod3248.sizeY;
                if (0x1 == (n14 & 0x1)) {
                    final int n19 = n17;
                    n17 = n18;
                    n18 = n19;
                }
                final int n20 = n7 & 0x3;
                int n21;
                if (n20 == 0) {
                    n21 = n15;
                }
                else if (n20 == 1) {
                    n21 = n16;
                }
                else if (2 == n20) {
                    n21 = 7 - n15 - (n17 - 1);
                }
                else {
                    n21 = 7 - n16 - (n18 - 1);
                }
                final int n22 = n2 + n21;
                final int n23 = n11 & 0x7;
                final int n24 = n10 & 0x7;
                int n25 = -1339930361 * vmethod3248.sizeX;
                int n26 = -1659393955 * vmethod3248.sizeY;
                if (0x1 == (n14 & 0x1)) {
                    final int n27 = n25;
                    n25 = n26;
                    n26 = n27;
                }
                final int n28 = n7 & 0x3;
                int n29;
                if (n28 == 0) {
                    n29 = n24;
                }
                else if (n28 == 1) {
                    n29 = 7 - n23 - (n25 - 1);
                }
                else if (2 == n28) {
                    n29 = 7 - n24 - (n26 - 1);
                }
                else {
                    n29 = n23;
                }
                final int n30 = n3 + n29;
                if (n22 <= 0 || n30 <= 0 || n22 >= 103 || n30 >= 103) {
                    continue;
                }
                int n31 = n;
                if (0x2 == (Client.gk.oo[1][n22][n30] & 0x2)) {
                    --n31;
                }
                CollisionMap collisionMap = null;
                if (n31 >= 0) {
                    collisionMap = array2[n31];
                }
                class207.addObjects(n, n22, n30, n8, n14 + n7 & 0x3, n13, scene, collisionMap, -574590608);
            }
        }
    }
    
    static int bh(final int n, final int n2, final int n3) {
        if ((Tiles.Tiles_renderFlags[n][n2][n3] & 0x8) != 0x0) {
            return 0;
        }
        if (n > 0 && 0x0 != (Tiles.Tiles_renderFlags[1][n2][n3] & 0x2)) {
            return n - 1;
        }
        return n;
    }
    
    static final void by(final int n, final int n2, final int n3, final int n4) {
        for (int i = n2; i <= n2 + n4; ++i) {
            for (int j = n; j <= n3 + n; ++j) {
                if (j >= 0 && j < 104 && i >= 0 && i < 104) {
                    Tiles.field819[0][j][i] = 127;
                    if (j == n && j > 0) {
                        Tiles.Tiles_heights[0][j][i] = Tiles.Tiles_heights[0][j - 1][i];
                    }
                    if (n + n3 == j && j < 103) {
                        Tiles.Tiles_heights[0][j][i] = Tiles.Tiles_heights[0][j + 1][i];
                    }
                    if (i == n2 && i > 0) {
                        Tiles.Tiles_heights[0][j][i] = Tiles.Tiles_heights[0][j][i - 1];
                    }
                    if (i == n2 + n4 && i < 103) {
                        Tiles.Tiles_heights[0][j][i] = Tiles.Tiles_heights[0][j][1 + i];
                    }
                }
            }
        }
    }
    
    static final void bx(final byte[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final CollisionMap[] array2) {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (n2 + i > 0 && i + n2 < 103 && n3 + j > 0 && n3 + j < 103) {
                    final int[] array3 = array2[n].flags[i + n2];
                    final int n10 = j + n3;
                    array3[n10] &= 0x1AFC0787;
                }
            }
        }
        final Buffer buffer = new Buffer(array);
        for (int k = 0; k < 4; ++k) {
            for (int l = 0; l < 64; ++l) {
                for (int n11 = 0; n11 < 64; ++n11) {
                    if (n4 == k && l >= n5 && l < 8 + n5 && n11 >= n6 && n11 < n6 + 8) {
                        final int n12 = n2 + SpriteMask.contains(l & 0x7, n11 & 0x7, n7, 575322475);
                        final int n13 = l & 0x7;
                        final int n14 = n11 & 0x7;
                        final int n15 = n7 & 0x3;
                        int n16;
                        if (n15 == 0) {
                            n16 = n14;
                        }
                        else if (n15 == 1) {
                            n16 = 7 - n13;
                        }
                        else if (2 == n15) {
                            n16 = 7 - n14;
                        }
                        else {
                            n16 = n13;
                        }
                        class372.loadTerrain(buffer, n, n12, n3 + n16, (l & 0x7) + (n8 + n2), (n11 & 0x7) + (n9 + n3), n7, (byte)(-46));
                    }
                    else {
                        class372.loadTerrain(buffer, 0, -1, -1, 0, 0, 0, (byte)23);
                    }
                }
            }
        }
    }
    
    static final void ap(final int n, final int n2, final int n3, final int n4) {
        for (int i = n2; i <= n2 + n4; ++i) {
            for (int j = n; j <= n3 + n; ++j) {
                if (j >= 0 && j < 104 && i >= 0 && i < 104) {
                    Tiles.field819[0][j][i] = 127;
                    if (j == n && j > 0) {
                        Tiles.Tiles_heights[0][j][i] = Tiles.Tiles_heights[0][j - 1][i];
                    }
                    if (n + n3 == j && j < 103) {
                        Tiles.Tiles_heights[0][j][i] = Tiles.Tiles_heights[0][j + 1][i];
                    }
                    if (i == n2 && i > 0) {
                        Tiles.Tiles_heights[0][j][i] = Tiles.Tiles_heights[0][j][i - 1];
                    }
                    if (i == n2 + n4 && i < 103) {
                        Tiles.Tiles_heights[0][j][i] = Tiles.Tiles_heights[0][j][1 + i];
                    }
                }
            }
        }
    }
    
    static final void bd(final Buffer buffer, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n >= 0 && n < 4 && n2 >= 0 && n2 < 104 && n3 >= 0 && n3 < 104) {
            Tiles.Tiles_renderFlags[n][n2][n3] = 0;
            while (true) {
                final int unsignedShort = buffer.readUnsignedShort(-875132070);
                if (unsignedShort == 0) {
                    if (0 == n) {
                        final int[] array = Tiles.Tiles_heights[0][n2];
                        final int n7 = n4 + 932731;
                        final int n8 = n5 + 556238;
                        int n9 = 35 + (int)((class101.method634(45365 + n7, 91923 + n8, 4, (byte)(-13)) - 128 + (class101.method634(10294 + n7, 37821 + n8, 2, (byte)(-44)) - 128 >> 1) + (class101.method634(n7, n8, 1, (byte)(-1)) - 128 >> 2)) * 0.3);
                        if (n9 < 10) {
                            n9 = 10;
                        }
                        else if (n9 > 60) {
                            n9 = 60;
                        }
                        array[n3] = 8 * -n9;
                        break;
                    }
                    Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n - 1][n2][n3] - 240;
                    break;
                }
                else if (unsignedShort != 0) {
                    int ra = Buffer.ra(buffer, (byte)7);
                    if (ra == 1) {
                        ra = 0;
                    }
                    if (0 == n) {
                        Tiles.Tiles_heights[0][n2][n3] = 8 * -ra;
                        break;
                    }
                    Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n - 1][n2][n3] - 8 * ra;
                    break;
                }
                else if (unsignedShort <= 49) {
                    Tiles.Tiles_overlays[n][n2][n3] = (short)buffer.readUnsignedByte((byte)(-127));
                    Tiles.Tiles_shapes[n][n2][n3] = (byte)((unsignedShort - 2) / 4);
                    Tiles.field824[n][n2][n3] = (byte)(n6 + (unsignedShort - 2) & 0x3);
                }
                else if (unsignedShort <= 81) {
                    Tiles.Tiles_renderFlags[n][n2][n3] = (byte)(unsignedShort - 49);
                }
                else {
                    class186.Tiles_underlays[n][n2][n3] = (short)(unsignedShort - 81);
                }
            }
        }
        else {
            while (true) {
                final int unsignedShort2 = buffer.readUnsignedShort(-2056455188);
                if (unsignedShort2 == 0) {
                    break;
                }
                if (unsignedShort2 != 0) {
                    Buffer.ra(buffer, (byte)7);
                    break;
                }
                if (unsignedShort2 > 49) {
                    continue;
                }
                buffer.readUnsignedByte((byte)(-10));
            }
        }
    }
    
    static final int cm(final int n, int n2) {
        if (n == -1) {
            return 12345678;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    static final void bg(final byte[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final Scene scene, final CollisionMap[] array2) {
        final Buffer buffer = new Buffer(array);
        int n8 = -1;
        while (true) {
            final int method2518 = Buffer.method2518(buffer, (byte)(-27));
            if (method2518 == 0) {
                break;
            }
            n8 += method2518;
            int n9 = 0;
            while (true) {
                final int uShortSmart = buffer.readUShortSmart(-161113248);
                if (uShortSmart == 0) {
                    break;
                }
                n9 += uShortSmart - 1;
                final int n10 = n9 & 0x7DEA3DE3;
                final int n11 = n9 >> 6 & 0x3F;
                final int n12 = n9 >> 12;
                final int ra = Buffer.ra(buffer, (byte)7);
                final int n13 = ra >> 2;
                final int n14 = ra & 0x3;
                if (n12 != n4 || n11 < n5 || n11 >= n5 + 8 || n10 < n6 || n10 >= n6 + 8) {
                    continue;
                }
                final ObjectComposition vmethod3248 = class144.vmethod3248(n8, (short)16722);
                final int n15 = n11 & 0x7;
                final int n16 = n10 & 0x7;
                int n17 = -1339930361 * vmethod3248.sizeX;
                int n18 = -760263104 * vmethod3248.sizeY;
                if (0x1 == (n14 & 0x1)) {
                    final int n19 = n17;
                    n17 = n18;
                    n18 = n19;
                }
                final int n20 = n7 & 0x3;
                int n21;
                if (n20 == 0) {
                    n21 = n15;
                }
                else if (n20 == 1) {
                    n21 = n16;
                }
                else if (2 == n20) {
                    n21 = 7 - n15 - (n17 - 1);
                }
                else {
                    n21 = 7 - n16 - (n18 - 1);
                }
                final int n22 = n2 + n21;
                final int n23 = n11 & 0x7;
                final int n24 = n10 & 0x7;
                int n25 = 93117876 * vmethod3248.sizeX;
                int n26 = -128416955 * vmethod3248.sizeY;
                if (0x1 == (n14 & 0x1)) {
                    final int n27 = n25;
                    n25 = n26;
                    n26 = n27;
                }
                final int n28 = n7 & 0x3;
                int n29;
                if (n28 == 0) {
                    n29 = n24;
                }
                else if (n28 == 1) {
                    n29 = 7 - n23 - (n25 - 1);
                }
                else if (2 == n28) {
                    n29 = 7 - n24 - (n26 - 1);
                }
                else {
                    n29 = n23;
                }
                final int n30 = n3 + n29;
                if (n22 <= 0 || n30 <= 0 || n22 >= 752472330 || n30 >= -2146952292) {
                    continue;
                }
                int n31 = n;
                if (0x2 == (Tiles.Tiles_renderFlags[1][n22][n30] & 0x2)) {
                    --n31;
                }
                CollisionMap collisionMap = null;
                if (n31 >= 0) {
                    collisionMap = array2[n31];
                }
                class207.addObjects(n, n22, n30, n8, n14 + n7 & 0x3, n13, scene, collisionMap, -1552595307);
            }
        }
    }
    
    static final int cg(final int n, int n2) {
        if (-2 == n) {
            return 12345678;
        }
        if (-1 == n) {
            if (n2 < 2) {
                n2 = 2;
            }
            else if (n2 > 126) {
                n2 = 126;
            }
            return n2;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    static final int co(final int n, int n2, final int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        return (n / 4 << 10) + (n2 / 32 << 7) + n3 / 2;
    }
    
    static final int cy(final int n, int n2) {
        if (-212386821 == n) {
            return 627458336;
        }
        if (-1 == n) {
            if (n2 < 2) {
                n2 = 2;
            }
            else if (n2 > -814764422) {
                n2 = -1109069028;
            }
            return n2;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = -1844335637;
        }
        return (n & 0xA9947C75) + n2;
    }
    
    static final boolean bn(final byte[] array, final int n, final int n2) {
        boolean b = true;
        final Buffer buffer = new Buffer(array);
        int n3 = -1;
        while (true) {
            final int method2518 = Buffer.method2518(buffer, (byte)(-40));
            if (method2518 == 0) {
                break;
            }
            n3 += method2518;
            int n4 = 0;
            int n5 = 0;
            while (true) {
                if (n5 != 0) {
                    if (0 == buffer.readUShortSmart(-2123840856)) {
                        break;
                    }
                    Buffer.ra(buffer, (byte)7);
                }
                else {
                    final int uShortSmart = buffer.readUShortSmart(-990221354);
                    if (uShortSmart == 0) {
                        break;
                    }
                    n4 += uShortSmart - 1;
                    final int n6 = n4 & 0x3F;
                    final int n7 = n4 >> 6 & 0x3F;
                    final int n8 = Buffer.ra(buffer, (byte)7) >> 2;
                    final int n9 = n7 + n;
                    final int n10 = n2 + n6;
                    if (n9 <= 0 || n10 <= 0 || n9 >= 103 || n10 >= 103) {
                        continue;
                    }
                    final ObjectComposition vmethod3248 = class144.vmethod3248(n3, (short)23434);
                    if (n8 == 22 && Client.isLowDetail && 0 == vmethod3248.int1 * 415653149 && -973955889 * vmethod3248.interactType != 1 && !vmethod3248.boolean2) {
                        continue;
                    }
                    if (!ObjectComposition.bp(vmethod3248, -1541274389)) {
                        Client.field425 += 1441978033;
                        b = false;
                    }
                    n5 = 1;
                }
            }
        }
        return b;
    }
    
    static final int cz(final int n, int n2, final int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 1926459178) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        return (n / 4 << 10) + (n2 / 1154677488 << 7) + n3 / 2;
    }
    
    static final void bl(final Scene scene, final CollisionMap[] array) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 104; ++j) {
                for (int k = 0; k < 104; ++k) {
                    if ((Tiles.Tiles_renderFlags[i][j][k] & 0x1) == 0x1) {
                        int n = i;
                        if (0x2 == (Tiles.Tiles_renderFlags[1][j][k] & 0x2)) {
                            --n;
                        }
                        if (n >= 0) {
                            array[n].setBlockedByFloor(j, k, (byte)56);
                        }
                    }
                }
            }
        }
        Tiles.rndHue += ((int)(Math.random() * 5.0) - 2) * 1514061769;
        if (-372405639 * Tiles.rndHue < -8) {
            Tiles.rndHue = 772407736;
        }
        if (-372405639 * Tiles.rndHue > 8) {
            Tiles.rndHue = -772407736;
        }
        Tiles.rndLightness += ((int)(Math.random() * 5.0) - 2) * 1193325609;
        if (Tiles.rndLightness * -647485415 < -16) {
            Tiles.rndLightness = -1913340560;
        }
        if (Tiles.rndLightness * -647485415 > 16) {
            Tiles.rndLightness = 1913340560;
        }
        for (int l = 0; l < 4; ++l) {
            final byte[][] array2 = Tiles.field819[l];
            final int n2 = 768 * (int)Math.sqrt(5100.0) >> 8;
            for (int n3 = 1; n3 < 103; ++n3) {
                for (int n4 = 1; n4 < 103; ++n4) {
                    final int n5 = Tiles.Tiles_heights[l][1 + n4][n3] - Tiles.Tiles_heights[l][n4 - 1][n3];
                    final int n6 = Tiles.Tiles_heights[l][n4][n3 + 1] - Tiles.Tiles_heights[l][n4][n3 - 1];
                    final int n7 = (int)Math.sqrt(n6 * n6 + (65536 + n5 * n5));
                    Tiles.field821[n4][n3] = 96 + ((n6 << 8) / n7 * -50 + (-10 * (65536 / n7) + -50 * ((n5 << 8) / n7))) / n2 - ((array2[n4][1 + n3] >> 3) + ((array2[n4][n3 - 1] >> 2) + ((array2[1 + n4][n3] >> 3) + (array2[n4 - 1][n3] >> 2))) + (array2[n4][n3] >> 1));
                }
            }
            for (int n8 = 0; n8 < 104; ++n8) {
                FileSystem.Tiles_hue[n8] = 0;
                Tiles.Tiles_saturation[n8] = 0;
                class283.Tiles_lightness[n8] = 0;
                UserComparator4.Tiles_hueMultiplier[n8] = 0;
                class31.field92[n8] = 0;
            }
            for (int n9 = -5; n9 < 109; ++n9) {
                for (int n10 = 0; n10 < 104; ++n10) {
                    final int n11 = 5 + n9;
                    if (n11 >= 0 && n11 < 104) {
                        final int n12 = class186.Tiles_underlays[l][n11][n10] & (int)DynamicObject.method466(15, -1568746950);
                        if (n12 > 0) {
                            final int n13 = n12 - 1;
                            final FloorUnderlayDefinition floorUnderlayDefinition = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n13);
                            FloorUnderlayDefinition floorUnderlayDefinition2;
                            if (null != floorUnderlayDefinition) {
                                floorUnderlayDefinition2 = floorUnderlayDefinition;
                            }
                            else {
                                final byte[] takeFile = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n13, (byte)(-125));
                                final FloorUnderlayDefinition floorUnderlayDefinition3 = new FloorUnderlayDefinition();
                                if (null != takeFile) {
                                    floorUnderlayDefinition3.decode(new Buffer(takeFile), n13, -1928355821);
                                }
                                floorUnderlayDefinition3.postDecode(875414437);
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition3, n13);
                                floorUnderlayDefinition2 = floorUnderlayDefinition3;
                            }
                            final FloorUnderlayDefinition floorUnderlayDefinition4 = floorUnderlayDefinition2;
                            final int[] tiles_hue = FileSystem.Tiles_hue;
                            final int n14 = n10;
                            tiles_hue[n14] += floorUnderlayDefinition4.hue * 372444635;
                            final int[] tiles_saturation = Tiles.Tiles_saturation;
                            final int n15 = n10;
                            tiles_saturation[n15] += 1058265139 * floorUnderlayDefinition4.saturation;
                            final int[] tiles_lightness = class283.Tiles_lightness;
                            final int n16 = n10;
                            tiles_lightness[n16] += -1527986335 * floorUnderlayDefinition4.lightness;
                            final int[] tiles_hueMultiplier = UserComparator4.Tiles_hueMultiplier;
                            final int n17 = n10;
                            tiles_hueMultiplier[n17] += floorUnderlayDefinition4.hueMultiplier * -2012234183;
                            final int[] field92 = class31.field92;
                            final int n18 = n10;
                            ++field92[n18];
                        }
                    }
                    final int n19 = n9 - 5;
                    if (n19 >= 0 && n19 < 104) {
                        final int n20 = class186.Tiles_underlays[l][n19][n10] & (int)DynamicObject.method466(15, 2062227285);
                        if (n20 > 0) {
                            final int n21 = n20 - 1;
                            final FloorUnderlayDefinition floorUnderlayDefinition5 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n21);
                            FloorUnderlayDefinition floorUnderlayDefinition6;
                            if (floorUnderlayDefinition5 != null) {
                                floorUnderlayDefinition6 = floorUnderlayDefinition5;
                            }
                            else {
                                final byte[] takeFile2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n21, (byte)(-90));
                                final FloorUnderlayDefinition floorUnderlayDefinition7 = new FloorUnderlayDefinition();
                                if (takeFile2 != null) {
                                    floorUnderlayDefinition7.decode(new Buffer(takeFile2), n21, -1941979925);
                                }
                                floorUnderlayDefinition7.postDecode(875414437);
                                FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition7, n21);
                                floorUnderlayDefinition6 = floorUnderlayDefinition7;
                            }
                            final FloorUnderlayDefinition floorUnderlayDefinition8 = floorUnderlayDefinition6;
                            final int[] tiles_hue2 = FileSystem.Tiles_hue;
                            final int n22 = n10;
                            tiles_hue2[n22] -= 372444635 * floorUnderlayDefinition8.hue;
                            final int[] tiles_saturation2 = Tiles.Tiles_saturation;
                            final int n23 = n10;
                            tiles_saturation2[n23] -= floorUnderlayDefinition8.saturation * 1058265139;
                            final int[] tiles_lightness2 = class283.Tiles_lightness;
                            final int n24 = n10;
                            tiles_lightness2[n24] -= -1527986335 * floorUnderlayDefinition8.lightness;
                            final int[] tiles_hueMultiplier2 = UserComparator4.Tiles_hueMultiplier;
                            final int n25 = n10;
                            tiles_hueMultiplier2[n25] -= -2012234183 * floorUnderlayDefinition8.hueMultiplier;
                            final int[] field93 = class31.field92;
                            final int n26 = n10;
                            --field93[n26];
                        }
                    }
                }
                if (n9 >= 1 && n9 < 103) {
                    int n27 = 0;
                    int n28 = 0;
                    int n29 = 0;
                    int n30 = 0;
                    int n31 = 0;
                    for (int n32 = -5; n32 < 109; ++n32) {
                        final int n33 = n32 + 5;
                        if (n33 >= 0 && n33 < 104) {
                            n27 += FileSystem.Tiles_hue[n33];
                            n28 += Tiles.Tiles_saturation[n33];
                            n29 += class283.Tiles_lightness[n33];
                            n30 += UserComparator4.Tiles_hueMultiplier[n33];
                            n31 += class31.field92[n33];
                        }
                        final int n34 = n32 - 5;
                        if (n34 >= 0 && n34 < 104) {
                            n27 -= FileSystem.Tiles_hue[n34];
                            n28 -= Tiles.Tiles_saturation[n34];
                            n29 -= class283.Tiles_lightness[n34];
                            n30 -= UserComparator4.Tiles_hueMultiplier[n34];
                            n31 -= class31.field92[n34];
                        }
                        if (n32 >= 1 && n32 < 103) {
                            if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][n9][n32] & 0x2) != 0x0 || 0x0 == (Tiles.Tiles_renderFlags[l][n9][n32] & 0x10)) {
                                if (l < Tiles.Tiles_minPlane * 1401144457) {
                                    Tiles.Tiles_minPlane = l * -1087180359;
                                }
                                final int n35 = (int)DynamicObject.method466(15, -1308058071);
                                final int n36 = class186.Tiles_underlays[l][n9][n32] & n35;
                                final int n37 = Tiles.Tiles_overlays[l][n9][n32] & n35;
                                if (n36 > 0 || n37 > 0) {
                                    final int n38 = Tiles.Tiles_heights[l][n9][n32];
                                    final int n39 = Tiles.Tiles_heights[l][n9 + 1][n32];
                                    final int n40 = Tiles.Tiles_heights[l][n9 + 1][1 + n32];
                                    final int n41 = Tiles.Tiles_heights[l][n9][n32 + 1];
                                    final int n42 = Tiles.field821[n9][n32];
                                    final int n43 = Tiles.field821[1 + n9][n32];
                                    final int n44 = Tiles.field821[n9 + 1][n32 + 1];
                                    final int n45 = Tiles.field821[n9][n32 + 1];
                                    int method1847 = -1;
                                    int method1848 = -1;
                                    if (n36 > 0) {
                                        final int n46 = n27 * 256 / n30;
                                        final int n47 = n28 / n31;
                                        final int n48 = n29 / n31;
                                        method1847 = GameBuild.method1847(n46, n47, n48, -827475434);
                                        final int n49 = n46 + Tiles.rndHue * -372405639 & 0xFF;
                                        int n50 = n48 + Tiles.rndLightness * -647485415;
                                        if (n50 < 0) {
                                            n50 = 0;
                                        }
                                        else if (n50 > 255) {
                                            n50 = 255;
                                        }
                                        method1848 = GameBuild.method1847(n49, n47, n50, 1303124269);
                                    }
                                    if (l > 0) {
                                        boolean b = true;
                                        if (n36 == 0 && 0 != Tiles.Tiles_shapes[l][n9][n32]) {
                                            b = false;
                                        }
                                        if (n37 > 0) {
                                            final int n51 = n37 - 1;
                                            final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n51);
                                            FloorOverlayDefinition floorOverlayDefinition2;
                                            if (floorOverlayDefinition != null) {
                                                floorOverlayDefinition2 = floorOverlayDefinition;
                                            }
                                            else {
                                                final byte[] takeFile3 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n51, (byte)(-77));
                                                final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                                                if (takeFile3 != null) {
                                                    floorOverlayDefinition3.decode(new Buffer(takeFile3), n51, (short)128);
                                                }
                                                floorOverlayDefinition3.postDecode(26011974);
                                                FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n51);
                                                floorOverlayDefinition2 = floorOverlayDefinition3;
                                            }
                                            if (!floorOverlayDefinition2.hideUnderlay) {
                                                b = false;
                                            }
                                        }
                                        if (b && n38 == n39 && n38 == n40 && n41 == n38) {
                                            final int[] array3 = class161.field1407[l][n9];
                                            final int n52 = n32;
                                            array3[n52] |= 0x924;
                                        }
                                    }
                                    int n53 = 0;
                                    if (method1848 != -1) {
                                        n53 = Rasterizer3D.Rasterizer3D_colorPalette[class10.method41(method1848, 96, 820912814)];
                                    }
                                    if (n37 == 0) {
                                        scene.addTile(l, n9, n32, 0, 0, -1, n38, n39, n40, n41, class10.method41(method1847, n42, -901648933), class10.method41(method1847, n43, 1262784142), class10.method41(method1847, n44, 776649507), class10.method41(method1847, n45, -804404870), 0, 0, 0, 0, n53, 0);
                                    }
                                    else {
                                        final int n54 = Tiles.Tiles_shapes[l][n9][n32] + 1;
                                        final byte b2 = Tiles.field824[l][n9][n32];
                                        final int n55 = n37 - 1;
                                        final FloorOverlayDefinition floorOverlayDefinition4 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n55);
                                        FloorOverlayDefinition floorOverlayDefinition5;
                                        if (floorOverlayDefinition4 != null) {
                                            floorOverlayDefinition5 = floorOverlayDefinition4;
                                        }
                                        else {
                                            final byte[] takeFile4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n55, (byte)(-38));
                                            final FloorOverlayDefinition floorOverlayDefinition6 = new FloorOverlayDefinition();
                                            if (takeFile4 != null) {
                                                floorOverlayDefinition6.decode(new Buffer(takeFile4), n55, (short)128);
                                            }
                                            floorOverlayDefinition6.postDecode(843847259);
                                            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition6, n55);
                                            floorOverlayDefinition5 = floorOverlayDefinition6;
                                        }
                                        final FloorOverlayDefinition floorOverlayDefinition7 = floorOverlayDefinition5;
                                        int n56 = floorOverlayDefinition7.texture * -202963991;
                                        int n57;
                                        int method1849;
                                        if (n56 >= 0) {
                                            n57 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(n56, -775587978);
                                            method1849 = -1;
                                        }
                                        else if (16711935 == 1889574527 * floorOverlayDefinition7.primaryRgb) {
                                            method1849 = -2;
                                            n56 = -1;
                                            n57 = -2;
                                        }
                                        else {
                                            method1849 = GameBuild.method1847(floorOverlayDefinition7.hue * 174415927, floorOverlayDefinition7.saturation * 470803713, floorOverlayDefinition7.lightness * 532980473, 870618712);
                                            final int n58 = -372405639 * Tiles.rndHue + floorOverlayDefinition7.hue * 174415927 & 0xFF;
                                            int n59 = floorOverlayDefinition7.lightness * 532980473 + Tiles.rndLightness * -647485415;
                                            if (n59 < 0) {
                                                n59 = 0;
                                            }
                                            else if (n59 > 255) {
                                                n59 = 255;
                                            }
                                            n57 = GameBuild.method1847(n58, floorOverlayDefinition7.saturation * 470803713, n59, -790679106);
                                        }
                                        int n60 = 0;
                                        if (n57 != -2) {
                                            n60 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(n57, 96, (byte)0)];
                                        }
                                        if (-1 != floorOverlayDefinition7.secondaryRgb * -2085280195) {
                                            final int n61 = floorOverlayDefinition7.secondaryHue * -187777599 + -372405639 * Tiles.rndHue & 0xFF;
                                            int n62 = Tiles.rndLightness * -647485415 + floorOverlayDefinition7.secondaryLightness * -1379609783;
                                            if (n62 < 0) {
                                                n62 = 0;
                                            }
                                            else if (n62 > 255) {
                                                n62 = 255;
                                            }
                                            n60 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(GameBuild.method1847(n61, floorOverlayDefinition7.secondarySaturation * 1797179473, n62, 832358066), 96, (byte)0)];
                                        }
                                        scene.addTile(l, n9, n32, n54, b2, n56, n38, n39, n40, n41, class10.method41(method1847, n42, -1946455660), class10.method41(method1847, n43, -1410191887), class10.method41(method1847, n44, -1736591451), class10.method41(method1847, n45, -129789731), class478.method2437(method1849, n42, (byte)0), class478.method2437(method1849, n43, (byte)0), class478.method2437(method1849, n44, (byte)0), class478.method2437(method1849, n45, (byte)0), n53, n60);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int n63 = 1; n63 < 103; ++n63) {
                for (int n64 = 1; n64 < 103; ++n64) {
                    scene.setTileMinPlane(l, n64, n63, PcmPlayer.method240(l, n64, n63, 2099810803));
                }
            }
            class186.Tiles_underlays[l] = null;
            Tiles.Tiles_overlays[l] = null;
            Tiles.Tiles_shapes[l] = null;
            Tiles.field824[l] = null;
            Tiles.field819[l] = null;
        }
        scene.de(-50, -10, -50);
        for (int n65 = 0; n65 < 104; ++n65) {
            for (int n66 = 0; n66 < 104; ++n66) {
                if (0x2 == (Tiles.Tiles_renderFlags[1][n65][n66] & 0x2)) {
                    scene.setLinkBelow(n65, n66);
                }
            }
        }
        int n67 = 1;
        int n68 = 2;
        int n69 = 4;
        for (int n70 = 0; n70 < 4; ++n70) {
            if (n70 > 0) {
                n67 <<= 3;
                n68 <<= 3;
                n69 <<= 3;
            }
            for (int n71 = 0; n71 <= n70; ++n71) {
                for (int n72 = 0; n72 <= 104; ++n72) {
                    for (int n73 = 0; n73 <= 104; ++n73) {
                        if (0x0 != (class161.field1407[n71][n73][n72] & n67)) {
                            int n74 = n72;
                            int n75 = n72;
                            int n76 = n71;
                            int n77 = n71;
                            while (n74 > 0 && (class161.field1407[n71][n73][n74 - 1] & n67) != 0x0) {
                                --n74;
                            }
                            while (n75 < 104 && (class161.field1407[n71][n73][1 + n75] & n67) != 0x0) {
                                ++n75;
                            }
                        Label_3278:
                            while (n76 > 0) {
                                for (int n78 = n74; n78 <= n75; ++n78) {
                                    if (0x0 == (class161.field1407[n76 - 1][n73][n78] & n67)) {
                                        break Label_3278;
                                    }
                                }
                                --n76;
                            }
                        Label_3350:
                            while (n77 < n70) {
                                for (int n79 = n74; n79 <= n75; ++n79) {
                                    if (0x0 == (class161.field1407[n77 + 1][n73][n79] & n67)) {
                                        break Label_3350;
                                    }
                                }
                                ++n77;
                            }
                            if ((1 + (n75 - n74)) * (n77 + 1 - n76) >= 8) {
                                Scene.Scene_addOccluder(n70, 1, n73 * 128, 128 * n73, 128 * n74, n75 * 128 + 128, Tiles.Tiles_heights[n77][n73][n74] - 240, Tiles.Tiles_heights[n76][n73][n74]);
                                for (int n80 = n76; n80 <= n77; ++n80) {
                                    for (int n81 = n74; n81 <= n75; ++n81) {
                                        final int[] array4 = class161.field1407[n80][n73];
                                        final int n82 = n81;
                                        array4[n82] &= ~n67;
                                    }
                                }
                            }
                        }
                        if ((class161.field1407[n71][n73][n72] & n68) != 0x0) {
                            int n83 = n73;
                            int n84 = n73;
                            int n85 = n71;
                            int n86 = n71;
                            while (n83 > 0 && (class161.field1407[n71][n83 - 1][n72] & n68) != 0x0) {
                                --n83;
                            }
                            while (n84 < 104 && 0x0 != (class161.field1407[n71][1 + n84][n72] & n68)) {
                                ++n84;
                            }
                        Label_3663:
                            while (n85 > 0) {
                                for (int n87 = n83; n87 <= n84; ++n87) {
                                    if (0x0 == (class161.field1407[n85 - 1][n87][n72] & n68)) {
                                        break Label_3663;
                                    }
                                }
                                --n85;
                            }
                        Label_3728:
                            while (n86 < n70) {
                                for (int n88 = n83; n88 <= n84; ++n88) {
                                    if (0x0 == (class161.field1407[n86 + 1][n88][n72] & n68)) {
                                        break Label_3728;
                                    }
                                }
                                ++n86;
                            }
                            if ((1 + (n84 - n83)) * (n86 + 1 - n85) >= 8) {
                                Scene.Scene_addOccluder(n70, 2, n83 * 128, n84 * 128 + 128, 128 * n72, 128 * n72, Tiles.Tiles_heights[n86][n83][n72] - 240, Tiles.Tiles_heights[n85][n83][n72]);
                                for (int n89 = n85; n89 <= n86; ++n89) {
                                    for (int n90 = n83; n90 <= n84; ++n90) {
                                        final int[] array5 = class161.field1407[n89][n90];
                                        final int n91 = n72;
                                        array5[n91] &= ~n68;
                                    }
                                }
                            }
                        }
                        if ((class161.field1407[n71][n73][n72] & n69) != 0x0) {
                            int n92 = n73;
                            int n93 = n73;
                            int n94 = n72;
                            int n95 = n72;
                            while (n94 > 0 && (class161.field1407[n71][n73][n94 - 1] & n69) != 0x0) {
                                --n94;
                            }
                            while (n95 < 104 && 0x0 != (class161.field1407[n71][n73][n95 + 1] & n69)) {
                                ++n95;
                            }
                        Label_2193:
                            while (n92 > 0) {
                                for (int n96 = n94; n96 <= n95; ++n96) {
                                    if ((class161.field1407[n71][n92 - 1][n96] & n69) == 0x0) {
                                        break Label_2193;
                                    }
                                }
                                --n92;
                            }
                        Label_0634:
                            while (n93 < 104) {
                                for (int n97 = n94; n97 <= n95; ++n97) {
                                    if ((class161.field1407[n71][1 + n93][n97] & n69) == 0x0) {
                                        break Label_0634;
                                    }
                                }
                                ++n93;
                            }
                            if ((n95 - n94 + 1) * (1 + (n93 - n92)) >= 4) {
                                final int n98 = Tiles.Tiles_heights[n71][n92][n94];
                                Scene.Scene_addOccluder(n70, 4, n92 * 128, 128 + n93 * 128, 128 * n94, 128 + n95 * 128, n98, n98);
                                for (int n99 = n92; n99 <= n93; ++n99) {
                                    for (int n100 = n94; n100 <= n95; ++n100) {
                                        final int[] array6 = class161.field1407[n71][n99];
                                        final int n101 = n100;
                                        array6[n101] &= ~n69;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    static final void bz(final int n, final int n2, final int n3) {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                Tiles.Tiles_heights[n][n2 + i][n3 + j] = 0;
            }
        }
        if (n2 > 0) {
            for (int k = 1; k < 8; ++k) {
                Tiles.Tiles_heights[n][n2][n3 + k] = Tiles.Tiles_heights[n][n2 - 1][n3 + k];
            }
        }
        if (n3 > 0) {
            for (int l = 1; l < 8; ++l) {
                Tiles.Tiles_heights[n][n2 + l][n3] = Tiles.Tiles_heights[n][n2 + l][n3 - 1];
            }
        }
        if (n2 > 0 && Tiles.Tiles_heights[n][n2 - 1][n3] != 0) {
            Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2 - 1][n3];
        }
        else if (n3 > 0 && Tiles.Tiles_heights[n][n2][n3 - 1] != 0) {
            Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2][n3 - 1];
        }
        else if (n2 > 0 && n3 > 0 && Tiles.Tiles_heights[n][n2 - 1][n3 - 1] != 0) {
            Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2 - 1][n3 - 1];
        }
    }
    
    static final boolean bj(final byte[] array, final int n, final int n2) {
        boolean b = true;
        final Buffer buffer = new Buffer(array);
        int n3 = -1;
        while (true) {
            final int method2518 = Buffer.method2518(buffer, (byte)(-20));
            if (method2518 == 0) {
                break;
            }
            n3 += method2518;
            int n4 = 0;
            int n5 = 0;
            while (true) {
                if (n5 != 0) {
                    if (0 == buffer.readUShortSmart(-472863275)) {
                        break;
                    }
                    Buffer.ra(buffer, (byte)7);
                }
                else {
                    final int uShortSmart = buffer.readUShortSmart(-1916955617);
                    if (uShortSmart == 0) {
                        break;
                    }
                    n4 += uShortSmart - 1;
                    final int n6 = n4 & 0x3F;
                    final int n7 = n4 >> 6 & 0x3F;
                    final int n8 = Buffer.ra(buffer, (byte)7) >> 2;
                    final int n9 = n7 + n;
                    final int n10 = n2 + n6;
                    if (n9 <= 0 || n10 <= 0 || n9 >= 103 || n10 >= 103) {
                        continue;
                    }
                    final ObjectComposition vmethod3248 = class144.vmethod3248(n3, (short)19667);
                    if (n8 == 22 && Client.isLowDetail && 0 == vmethod3248.int1 * 415653149 && -973955889 * vmethod3248.interactType != 1 && !vmethod3248.boolean2) {
                        continue;
                    }
                    if (!ObjectComposition.bp(vmethod3248, -1630694163)) {
                        Client.field425 += 1441978033;
                        b = false;
                    }
                    n5 = 1;
                }
            }
        }
        return b;
    }
    
    static final int cq(final int n, int n2) {
        if (n == -1) {
            return 12345678;
        }
        n2 = (n & 0x1DB67370) * n2 / 1178761447;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > -1853581257) {
            n2 = -1752363561;
        }
        return (n & 0xFF80) + n2;
    }
    
    static final void bm(final int n, final int n2, final int n3) {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                Tiles.Tiles_heights[n][n2 + i][n3 + j] = 0;
            }
        }
        if (n2 > 0) {
            for (int k = 1; k < 8; ++k) {
                Tiles.Tiles_heights[n][n2][n3 + k] = Tiles.Tiles_heights[n][n2 - 1][n3 + k];
            }
        }
        if (n3 > 0) {
            for (int l = 1; l < 8; ++l) {
                Tiles.Tiles_heights[n][n2 + l][n3] = Tiles.Tiles_heights[n][n2 + l][n3 - 1];
            }
        }
        if (n2 > 0 && Tiles.Tiles_heights[n][n2 - 1][n3] != 0) {
            Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2 - 1][n3];
        }
        else if (n3 > 0 && Tiles.Tiles_heights[n][n2][n3 - 1] != 0) {
            Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2][n3 - 1];
        }
        else if (n2 > 0 && n3 > 0 && Tiles.Tiles_heights[n][n2 - 1][n3 - 1] != 0) {
            Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2 - 1][n3 - 1];
        }
    }
    
    static final void bk(final byte[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final CollisionMap[] array2) {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (n2 + i > 0 && i + n2 < 103 && n3 + j > 0 && n3 + j < 103) {
                    final int[] array3 = array2[n].flags[i + n2];
                    final int n10 = j + n3;
                    array3[n10] &= 0xFEFFFFFF;
                }
            }
        }
        final Buffer buffer = new Buffer(array);
        for (int k = 0; k < 4; ++k) {
            for (int l = 0; l < 64; ++l) {
                for (int n11 = 0; n11 < 64; ++n11) {
                    if (n4 == k && l >= n5 && l < 8 + n5 && n11 >= n6 && n11 < n6 + 8) {
                        final int n12 = n2 + SpriteMask.contains(l & 0x7, n11 & 0x7, n7, 575322475);
                        final int n13 = l & 0x7;
                        final int n14 = n11 & 0x7;
                        final int n15 = n7 & 0x3;
                        int n16;
                        if (n15 == 0) {
                            n16 = n14;
                        }
                        else if (n15 == 1) {
                            n16 = 7 - n13;
                        }
                        else if (2 == n15) {
                            n16 = 7 - n14;
                        }
                        else {
                            n16 = n13;
                        }
                        class372.loadTerrain(buffer, n, n12, n3 + n16, (l & 0x7) + (n8 + n2), (n11 & 0x7) + (n9 + n3), n7, (byte)(-77));
                    }
                    else {
                        class372.loadTerrain(buffer, 0, -1, -1, 0, 0, 0, (byte)25);
                    }
                }
            }
        }
    }
    
    static final void bf(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Scene scene, final CollisionMap collisionMap) {
        if (Client.isLowDetail && 0x0 == (Tiles.Tiles_renderFlags[0][n2][n3] & 0x2) && (Tiles.Tiles_renderFlags[n][n2][n3] & 0x10) != 0x0) {
            return;
        }
        if (n < 2104768684 * Tiles.Tiles_minPlane) {
            Tiles.Tiles_minPlane = 854382009 * n;
        }
        final ObjectComposition vmethod3248 = class144.vmethod3248(n4, (short)27181);
        int n7;
        int n8;
        if (n5 == 1 || n5 == 3) {
            n7 = -1659393955 * vmethod3248.sizeY;
            n8 = 809378136 * vmethod3248.sizeX;
        }
        else {
            n7 = vmethod3248.sizeX * -1339930361;
            n8 = -1639228941 * vmethod3248.sizeY;
        }
        int n9;
        int n10;
        if (n2 + n7 <= 104) {
            n9 = n2 + (n7 >> 1);
            n10 = (1 + n7 >> 1) + n2;
        }
        else {
            n9 = n2;
            n10 = 1 + n2;
        }
        int n11;
        int n12;
        if (n8 + n3 <= 104) {
            n11 = n3 + (n8 >> 1);
            n12 = (1 + n8 >> 1) + n3;
        }
        else {
            n11 = n3;
            n12 = 1 + n3;
        }
        final int[][] array = Tiles.Tiles_heights[n];
        final int n13 = array[n10][n12] + (array[n9][n12] + (array[n9][n11] + array[n10][n11])) >> 2;
        final int n14 = (n7 << 6) + (n2 << 7);
        final int n15 = (n3 << 7) + (n8 << 6);
        final long calculateTag = FaceNormal.calculateTag(n2, n3, 2, 0 == 415653149 * vmethod3248.int1, n4, 2075878737);
        int n16 = n6 + (n5 << 6);
        if (-1850643527 * vmethod3248.int3 == 1) {
            n16 += 256;
        }
        if (vmethod3248.hasSound(-2073089873)) {
            GameEngine.method189(n, n2, n3, vmethod3248, n5, (byte)(-20));
        }
        if (22 == n6) {
            if (Client.isLowDetail && 0 == vmethod3248.int1 * 277678013 && 1 != vmethod3248.interactType * -1152914041 && !vmethod3248.boolean2) {
                return;
            }
            Renderable entity;
            if (-1 == 1292954189 * vmethod3248.animationId && null == vmethod3248.soundEffectIds) {
                entity = vmethod3248.getEntity(22, n5, array, n14, n13, n15, (byte)(-30));
            }
            else {
                entity = new DynamicObject(n4, 22, n5, n, n2, n3, 1540371032 * vmethod3248.animationId, vmethod3248.boolean3, null);
            }
            scene.newFloorDecoration(n, n2, n3, n13, entity, calculateTag, n16);
            if (vmethod3248.interactType * -317757209 == 1 && collisionMap != null) {
                collisionMap.method1169(n2, n3, 999977668);
            }
        }
        else {
            if (10 == n6 || n6 == 11) {
                Renderable entity2;
                if (-1 == vmethod3248.animationId * -1782449508 && vmethod3248.soundEffectIds == null) {
                    entity2 = vmethod3248.getEntity(10, n5, array, n14, n13, n15, (byte)(-46));
                }
                else {
                    entity2 = new DynamicObject(n4, 10, n5, n, n2, n3, vmethod3248.animationId * -317771199, vmethod3248.boolean3, null);
                }
                if (null != entity2 && scene.method1288(n, n2, n3, n13, n7, n8, entity2, (11 == n6) ? 256 : 0, calculateTag, n16) && vmethod3248.clipped) {
                    int n17 = 15;
                    if (entity2 instanceof Model) {
                        n17 = ((Model)entity2).method1318() / 4;
                        if (n17 > 30) {
                            n17 = 30;
                        }
                    }
                    for (int i = 0; i <= n7; ++i) {
                        for (int j = 0; j <= n8; ++j) {
                            if (n17 > Tiles.field819[n][n2 + i][n3 + j]) {
                                Tiles.field819[n][n2 + i][j + n3] = (byte)n17;
                            }
                        }
                    }
                }
                if (0 != vmethod3248.interactType * 1940388086 && collisionMap != null) {
                    CollisionMap.wa(collisionMap, n2, n3, n7, n8, vmethod3248.boolean1, (byte)(-116));
                }
                return;
            }
            if (n6 >= 12) {
                Renderable entity3;
                if (vmethod3248.animationId * 552542427 == -1 && null == vmethod3248.soundEffectIds) {
                    entity3 = vmethod3248.getEntity(n6, n5, array, n14, n13, n15, (byte)(-49));
                }
                else {
                    entity3 = new DynamicObject(n4, n6, n5, n, n2, n3, vmethod3248.animationId * 1918456419, vmethod3248.boolean3, null);
                }
                scene.method1288(n, n2, n3, n13, 1, 1, entity3, 0, calculateTag, n16);
                if (n6 >= 12 && n6 <= 17 && n6 != 13 && n > 0) {
                    final int[] array2 = class161.field1407[n][n2];
                    array2[n3] |= 0x924;
                }
                if (0 != vmethod3248.interactType * 394652651 && null != collisionMap) {
                    CollisionMap.wa(collisionMap, n2, n3, n7, n8, vmethod3248.boolean1, (byte)(-48));
                }
                return;
            }
            if (n6 == 0) {
                Renderable entity4;
                if (-1 == vmethod3248.animationId * 1292954189 && vmethod3248.soundEffectIds == null) {
                    entity4 = vmethod3248.getEntity(0, n5, array, n14, n13, n15, (byte)(-62));
                }
                else {
                    entity4 = new DynamicObject(n4, 0, n5, n, n2, n3, -1981840067 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.newBoundaryObject(n, n2, n3, n13, entity4, null, Tiles.field820[n5], 0, calculateTag, n16);
                if (0 == n5) {
                    if (vmethod3248.clipped) {
                        Tiles.field819[n][n2][n3] = (byte)(-830013542);
                        Tiles.field819[n][n2][n3 + 1] = 50;
                    }
                    if (vmethod3248.modelClipped) {
                        final int[] array3 = class161.field1407[n][n2];
                        array3[n3] |= 0x249;
                    }
                }
                else if (1 == n5) {
                    if (vmethod3248.clipped) {
                        Tiles.field819[n][n2][1 + n3] = (byte)1899856993;
                        Tiles.field819[n][n2 + 1][1 + n3] = 50;
                    }
                    if (vmethod3248.modelClipped) {
                        final int[] array4 = class161.field1407[n][n2];
                        final int n18 = 1 + n3;
                        array4[n18] |= 0x492;
                    }
                }
                else if (2 == n5) {
                    if (vmethod3248.clipped) {
                        Tiles.field819[n][1 + n2][n3] = 50;
                        Tiles.field819[n][1 + n2][1 + n3] = (byte)2011051429;
                    }
                    if (vmethod3248.modelClipped) {
                        final int[] array5 = class161.field1407[n][1 + n2];
                        array5[n3] |= 0x249;
                    }
                }
                else if (3 == n5) {
                    if (vmethod3248.clipped) {
                        Tiles.field819[n][n2][n3] = (byte)1000280080;
                        Tiles.field819[n][n2 + 1][n3] = (byte)(-327359985);
                    }
                    if (vmethod3248.modelClipped) {
                        final int[] array6 = class161.field1407[n][n2];
                        array6[n3] |= 0x968CAD8A;
                    }
                }
                if (vmethod3248.interactType * -973955889 != 0 && null != collisionMap) {
                    collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                }
                if (16 != 1742273350 * vmethod3248.int2) {
                    scene.method1262(n, n2, n3, -1441535375 * vmethod3248.int2);
                }
                return;
            }
            if (n6 == 1) {
                Renderable entity5;
                if (1708886194 * vmethod3248.animationId == -1 && vmethod3248.soundEffectIds == null) {
                    entity5 = vmethod3248.getEntity(1, n5, array, n14, n13, n15, (byte)(-34));
                }
                else {
                    entity5 = new DynamicObject(n4, 1, n5, n, n2, n3, -1200790467 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.newBoundaryObject(n, n2, n3, n13, entity5, null, Tiles.field829[n5], 0, calculateTag, n16);
                if (vmethod3248.clipped) {
                    if (n5 == 0) {
                        Tiles.field819[n][n2][n3 + 1] = (byte)(-307604637);
                    }
                    else if (1 == n5) {
                        Tiles.field819[n][n2 + 1][1 + n3] = (byte)278910615;
                    }
                    else if (2 == n5) {
                        Tiles.field819[n][n2 + 1][n3] = (byte)206962302;
                    }
                    else if (n5 == 3) {
                        Tiles.field819[n][n2][n3] = (byte)(-2021930622);
                    }
                }
                if (-973955889 * vmethod3248.interactType != 0 && collisionMap != null) {
                    collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                }
                return;
            }
            if (n6 == 2) {
                final int n19 = 1 + n5 & 0x3;
                Renderable entity6;
                Renderable entity7;
                if (39936867 * vmethod3248.animationId == -1 && null == vmethod3248.soundEffectIds) {
                    entity6 = vmethod3248.getEntity(2, n5 + 4, array, n14, n13, n15, (byte)(-11));
                    entity7 = vmethod3248.getEntity(2, n19, array, n14, n13, n15, (byte)(-97));
                }
                else {
                    entity6 = new DynamicObject(n4, 2, 4 + n5, n, n2, n3, vmethod3248.animationId * -1357866691, vmethod3248.boolean3, null);
                    entity7 = new DynamicObject(n4, 2, n19, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.newBoundaryObject(n, n2, n3, n13, entity6, entity7, Tiles.field820[n5], Tiles.field820[n19], calculateTag, n16);
                if (vmethod3248.modelClipped) {
                    if (n5 == 0) {
                        final int[] array7 = class161.field1407[n][n2];
                        array7[n3] |= 0x9E329C25;
                        final int[] array8 = class161.field1407[n][n2];
                        final int n20 = n3 + 1;
                        array8[n20] |= 0x492;
                    }
                    else if (1 == n5) {
                        final int[] array9 = class161.field1407[n][n2];
                        final int n21 = 1 + n3;
                        array9[n21] |= 0x717034B;
                        final int[] array10 = class161.field1407[n][1 + n2];
                        array10[n3] |= 0x9BD22183;
                    }
                    else if (n5 == 2) {
                        final int[] array11 = class161.field1407[n][n2 + 1];
                        array11[n3] |= 0xA342FE93;
                        final int[] array12 = class161.field1407[n][n2];
                        array12[n3] |= 0x492;
                    }
                    else if (n5 == 3) {
                        final int[] array13 = class161.field1407[n][n2];
                        array13[n3] |= 0xD57DFF09;
                        final int[] array14 = class161.field1407[n][n2];
                        array14[n3] |= 0xD296978C;
                    }
                }
                if (vmethod3248.interactType * -973955889 != 0 && null != collisionMap) {
                    collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                }
                if (16 != vmethod3248.int2 * -424533475) {
                    scene.method1262(n, n2, n3, vmethod3248.int2 * -1391820663);
                }
                return;
            }
            if (n6 == 3) {
                Renderable entity8;
                if (-1 == 1292954189 * vmethod3248.animationId && vmethod3248.soundEffectIds == null) {
                    entity8 = vmethod3248.getEntity(3, n5, array, n14, n13, n15, (byte)(-9));
                }
                else {
                    entity8 = new DynamicObject(n4, 3, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                scene.newBoundaryObject(n, n2, n3, n13, entity8, null, Tiles.field829[n5], 0, calculateTag, n16);
                if (vmethod3248.clipped) {
                    if (0 == n5) {
                        Tiles.field819[n][n2][1 + n3] = (byte)(-1031423082);
                    }
                    else if (1 == n5) {
                        Tiles.field819[n][n2 + 1][n3 + 1] = 50;
                    }
                    else if (2 == n5) {
                        Tiles.field819[n][n2 + 1][n3] = 50;
                    }
                    else if (n5 == 3) {
                        Tiles.field819[n][n2][n3] = 50;
                    }
                }
                if (0 != vmethod3248.interactType * -973955889 && null != collisionMap) {
                    collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                }
                return;
            }
            if (9 == n6) {
                Renderable entity9;
                if (-1 == vmethod3248.animationId * 1292954189 && vmethod3248.soundEffectIds == null) {
                    entity9 = vmethod3248.getEntity(n6, n5, array, n14, n13, n15, (byte)(-33));
                }
                else {
                    entity9 = new DynamicObject(n4, n6, n5, n, n2, n3, -1405022061 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.method1288(n, n2, n3, n13, 1, 1, entity9, 0, calculateTag, n16);
                if (vmethod3248.interactType * -973955889 != 0 && collisionMap != null) {
                    CollisionMap.wa(collisionMap, n2, n3, n7, n8, vmethod3248.boolean1, (byte)(-35));
                }
                if (-89408815 * vmethod3248.int2 != 16) {
                    scene.method1262(n, n2, n3, -89408815 * vmethod3248.int2);
                }
                return;
            }
            if (n6 == 4) {
                Renderable entity10;
                if (996846468 * vmethod3248.animationId == -1 && null == vmethod3248.soundEffectIds) {
                    entity10 = vmethod3248.getEntity(4, n5, array, n14, n13, n15, (byte)(-33));
                }
                else {
                    entity10 = new DynamicObject(n4, 4, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity10, null, Tiles.field820[n5], 0, 0, 0, calculateTag, n16);
                return;
            }
            if (5 == n6) {
                int n22 = 16;
                final long boundaryObjectTag = scene.getBoundaryObjectTag(n, n2, n3);
                if (0L != boundaryObjectTag) {
                    n22 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag), (short)11096).int2 * -89408815;
                }
                Renderable entity11;
                if (vmethod3248.animationId * 1292954189 == -1 && null == vmethod3248.soundEffectIds) {
                    entity11 = vmethod3248.getEntity(4, n5, array, n14, n13, n15, (byte)(-35));
                }
                else {
                    entity11 = new DynamicObject(n4, 4, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity11, null, Tiles.field820[n5], 0, Tiles.field830[n5] * n22, n22 * Tiles.field827[n5], calculateTag, n16);
                return;
            }
            if (n6 == 6) {
                int n23 = 8;
                final long boundaryObjectTag2 = scene.getBoundaryObjectTag(n, n2, n3);
                if (0L != boundaryObjectTag2) {
                    n23 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag2), (short)18838).int2 * 1299694526 / 2;
                }
                Renderable entity12;
                if (-1 == 1292954189 * vmethod3248.animationId && null == vmethod3248.soundEffectIds) {
                    entity12 = vmethod3248.getEntity(4, 4 + n5, array, n14, n13, n15, (byte)(-35));
                }
                else {
                    entity12 = new DynamicObject(n4, 4, 4 + n5, n, n2, n3, vmethod3248.animationId * -1159964170, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity12, null, 493229457, n5, Tiles.field832[n5] * n23, n23 * Tiles.field833[n5], calculateTag, n16);
                return;
            }
            if (n6 == 7) {
                final int n24 = 2 + n5 & 0x3;
                Renderable entity13;
                if (vmethod3248.animationId * 1292954189 == -1 && vmethod3248.soundEffectIds == null) {
                    entity13 = vmethod3248.getEntity(4, 4 + n24, array, n14, n13, n15, (byte)(-107));
                }
                else {
                    entity13 = new DynamicObject(n4, 4, n24 + 4, n, n2, n3, -294844493 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity13, null, 256, n24, 0, 0, calculateTag, n16);
                return;
            }
            if (8 == n6) {
                int n25 = 8;
                final long boundaryObjectTag3 = scene.getBoundaryObjectTag(n, n2, n3);
                if (0L != boundaryObjectTag3) {
                    n25 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag3), (short)23868).int2 * -89408815 / 2;
                }
                final int n26 = 2 + n5 & 0x3;
                Renderable entity14;
                Renderable entity15;
                if (vmethod3248.animationId * 1292954189 == -1 && null == vmethod3248.soundEffectIds) {
                    entity14 = vmethod3248.getEntity(4, n5 + 4, array, n14, n13, n15, (byte)(-53));
                    entity15 = vmethod3248.getEntity(4, 4 + n26, array, n14, n13, n15, (byte)(-42));
                }
                else {
                    entity14 = new DynamicObject(n4, 4, n5 + 4, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                    entity15 = new DynamicObject(n4, 4, n26 + 4, n, n2, n3, vmethod3248.animationId * -1032710980, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity14, entity15, 256, n5, Tiles.field832[n5] * n25, n25 * Tiles.field833[n5], calculateTag, n16);
            }
        }
    }
    
    static final void bu(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Scene scene, final CollisionMap collisionMap) {
        if (Client.isLowDetail && 0x0 == (Tiles.Tiles_renderFlags[0][n2][n3] & 0x2) && (Tiles.Tiles_renderFlags[n][n2][n3] & 0x10) != 0x0) {
            return;
        }
        if (n < 1401144457 * Tiles.Tiles_minPlane) {
            Tiles.Tiles_minPlane = -1087180359 * n;
        }
        final ObjectComposition vmethod3248 = class144.vmethod3248(n4, (short)19820);
        int n7;
        int n8;
        if (n5 != 1 && n5 != 3) {
            n7 = vmethod3248.sizeX * -1339930361;
            n8 = -1659393955 * vmethod3248.sizeY;
        }
        else {
            n7 = -1659393955 * vmethod3248.sizeY;
            n8 = -1339930361 * vmethod3248.sizeX;
        }
        int n9;
        int n10;
        if (n2 + n7 <= 104) {
            n9 = n2 + (n7 >> 1);
            n10 = (1 + n7 >> 1) + n2;
        }
        else {
            n9 = n2;
            n10 = 1 + n2;
        }
        int n11;
        int n12;
        if (n8 + n3 <= 104) {
            n11 = n3 + (n8 >> 1);
            n12 = (1 + n8 >> 1) + n3;
        }
        else {
            n11 = n3;
            n12 = 1 + n3;
        }
        final int[][] array = Tiles.Tiles_heights[n];
        final int n13 = array[n10][n12] + (array[n9][n12] + (array[n9][n11] + array[n10][n11])) >> 2;
        final int n14 = (n7 << 6) + (n2 << 7);
        final int n15 = (n3 << 7) + (n8 << 6);
        final long calculateTag = FaceNormal.calculateTag(n2, n3, 2, 0 == 415653149 * vmethod3248.int1, n4, 1278598650);
        int n16 = n6 + (n5 << 6);
        if (-1850643527 * vmethod3248.int3 == 1) {
            n16 += 256;
        }
        if (vmethod3248.hasSound(-1944955521)) {
            GameEngine.method189(n, n2, n3, vmethod3248, n5, (byte)(-119));
        }
        if (22 == n6) {
            if (Client.isLowDetail && 0 == vmethod3248.int1 * 415653149 && 1 != vmethod3248.interactType * -973955889 && !vmethod3248.boolean2) {
                return;
            }
            Renderable entity;
            if (-1 == 1292954189 * vmethod3248.animationId && null == vmethod3248.soundEffectIds) {
                entity = vmethod3248.getEntity(22, n5, array, n14, n13, n15, (byte)(-102));
            }
            else {
                entity = new DynamicObject(n4, 22, n5, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
            }
            scene.newFloorDecoration(n, n2, n3, n13, entity, calculateTag, n16);
            if (vmethod3248.interactType * -973955889 == 1 && collisionMap != null) {
                collisionMap.method1169(n2, n3, 993069783);
            }
        }
        else {
            if (10 == n6 || n6 == 11) {
                Renderable entity2;
                if (-1 == vmethod3248.animationId * 1292954189 && vmethod3248.soundEffectIds == null) {
                    entity2 = vmethod3248.getEntity(10, n5, array, n14, n13, n15, (byte)(-39));
                }
                else {
                    entity2 = new DynamicObject(n4, 10, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                if (null != entity2 && scene.method1288(n, n2, n3, n13, n7, n8, entity2, (11 == n6) ? 256 : 0, calculateTag, n16) && vmethod3248.clipped) {
                    int n17 = 15;
                    if (entity2 instanceof Model) {
                        n17 = ((Model)entity2).method1318() / 4;
                        if (n17 > 30) {
                            n17 = 30;
                        }
                    }
                    for (int i = 0; i <= n7; ++i) {
                        for (int j = 0; j <= n8; ++j) {
                            if (n17 > Tiles.field819[n][n2 + i][n3 + j]) {
                                Tiles.field819[n][n2 + i][j + n3] = (byte)n17;
                            }
                        }
                    }
                }
                if (0 != vmethod3248.interactType * -973955889 && collisionMap != null) {
                    CollisionMap.wa(collisionMap, n2, n3, n7, n8, vmethod3248.boolean1, (byte)(-105));
                }
                return;
            }
            if (n6 >= 12) {
                Renderable entity3;
                if (vmethod3248.animationId * 1292954189 == -1 && null == vmethod3248.soundEffectIds) {
                    entity3 = vmethod3248.getEntity(n6, n5, array, n14, n13, n15, (byte)(-92));
                }
                else {
                    entity3 = new DynamicObject(n4, n6, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                scene.method1288(n, n2, n3, n13, 1, 1, entity3, 0, calculateTag, n16);
                if (n6 >= 12 && n6 <= 17 && n6 != 13 && n > 0) {
                    final int[] array2 = class161.field1407[n][n2];
                    array2[n3] |= 0x924;
                }
                if (0 != vmethod3248.interactType * -973955889 && null != collisionMap) {
                    CollisionMap.wa(collisionMap, n2, n3, n7, n8, vmethod3248.boolean1, (byte)(-46));
                }
                return;
            }
            if (n6 == 0) {
                Renderable entity4;
                if (-1 == vmethod3248.animationId * 1292954189 && vmethod3248.soundEffectIds == null) {
                    entity4 = vmethod3248.getEntity(0, n5, array, n14, n13, n15, (byte)(-108));
                }
                else {
                    entity4 = new DynamicObject(n4, 0, n5, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.newBoundaryObject(n, n2, n3, n13, entity4, null, Tiles.field820[n5], 0, calculateTag, n16);
                if (0 == n5) {
                    if (vmethod3248.clipped) {
                        Tiles.field819[n][n2][n3] = 50;
                        Tiles.field819[n][n2][n3 + 1] = 50;
                    }
                    if (vmethod3248.modelClipped) {
                        final int[] array3 = class161.field1407[n][n2];
                        array3[n3] |= 0x249;
                    }
                }
                else if (1 == n5) {
                    if (vmethod3248.clipped) {
                        Tiles.field819[n][n2][1 + n3] = 50;
                        Tiles.field819[n][n2 + 1][1 + n3] = 50;
                    }
                    if (vmethod3248.modelClipped) {
                        final int[] array4 = class161.field1407[n][n2];
                        final int n18 = 1 + n3;
                        array4[n18] |= 0x492;
                    }
                }
                else if (2 == n5) {
                    if (vmethod3248.clipped) {
                        Tiles.field819[n][1 + n2][n3] = 50;
                        Tiles.field819[n][1 + n2][1 + n3] = 50;
                    }
                    if (vmethod3248.modelClipped) {
                        final int[] array5 = class161.field1407[n][1 + n2];
                        array5[n3] |= 0x249;
                    }
                }
                else if (3 == n5) {
                    if (vmethod3248.clipped) {
                        Tiles.field819[n][n2][n3] = 50;
                        Tiles.field819[n][n2 + 1][n3] = 50;
                    }
                    if (vmethod3248.modelClipped) {
                        final int[] array6 = class161.field1407[n][n2];
                        array6[n3] |= 0x492;
                    }
                }
                if (vmethod3248.interactType * -973955889 != 0 && null != collisionMap) {
                    collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                }
                if (16 != -89408815 * vmethod3248.int2) {
                    scene.method1262(n, n2, n3, -89408815 * vmethod3248.int2);
                }
                return;
            }
            if (n6 == 1) {
                Renderable entity5;
                if (1292954189 * vmethod3248.animationId == -1 && vmethod3248.soundEffectIds == null) {
                    entity5 = vmethod3248.getEntity(1, n5, array, n14, n13, n15, (byte)(-106));
                }
                else {
                    entity5 = new DynamicObject(n4, 1, n5, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.newBoundaryObject(n, n2, n3, n13, entity5, null, Tiles.field829[n5], 0, calculateTag, n16);
                if (vmethod3248.clipped) {
                    if (n5 == 0) {
                        Tiles.field819[n][n2][n3 + 1] = 50;
                    }
                    else if (1 == n5) {
                        Tiles.field819[n][n2 + 1][1 + n3] = 50;
                    }
                    else if (2 == n5) {
                        Tiles.field819[n][n2 + 1][n3] = 50;
                    }
                    else if (n5 == 3) {
                        Tiles.field819[n][n2][n3] = 50;
                    }
                }
                if (-973955889 * vmethod3248.interactType != 0 && collisionMap != null) {
                    collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                }
                return;
            }
            if (n6 == 2) {
                final int n19 = 1 + n5 & 0x3;
                Renderable entity6;
                Renderable entity7;
                if (1292954189 * vmethod3248.animationId == -1 && null == vmethod3248.soundEffectIds) {
                    entity6 = vmethod3248.getEntity(2, n5 + 4, array, n14, n13, n15, (byte)(-78));
                    entity7 = vmethod3248.getEntity(2, n19, array, n14, n13, n15, (byte)(-52));
                }
                else {
                    entity6 = new DynamicObject(n4, 2, 4 + n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                    entity7 = new DynamicObject(n4, 2, n19, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.newBoundaryObject(n, n2, n3, n13, entity6, entity7, Tiles.field820[n5], Tiles.field820[n19], calculateTag, n16);
                if (vmethod3248.modelClipped) {
                    if (n5 == 0) {
                        final int[] array7 = class161.field1407[n][n2];
                        array7[n3] |= 0x249;
                        final int[] array8 = class161.field1407[n][n2];
                        final int n20 = n3 + 1;
                        array8[n20] |= 0x492;
                    }
                    else if (1 == n5) {
                        final int[] array9 = class161.field1407[n][n2];
                        final int n21 = 1 + n3;
                        array9[n21] |= 0x492;
                        final int[] array10 = class161.field1407[n][1 + n2];
                        array10[n3] |= 0x249;
                    }
                    else if (n5 == 2) {
                        final int[] array11 = class161.field1407[n][n2 + 1];
                        array11[n3] |= 0x249;
                        final int[] array12 = class161.field1407[n][n2];
                        array12[n3] |= 0x492;
                    }
                    else if (n5 == 3) {
                        final int[] array13 = class161.field1407[n][n2];
                        array13[n3] |= 0x492;
                        final int[] array14 = class161.field1407[n][n2];
                        array14[n3] |= 0x249;
                    }
                }
                if (vmethod3248.interactType * -973955889 != 0 && null != collisionMap) {
                    collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                }
                if (16 != vmethod3248.int2 * -89408815) {
                    scene.method1262(n, n2, n3, vmethod3248.int2 * -89408815);
                }
                return;
            }
            if (n6 == 3) {
                Renderable entity8;
                if (-1 == 1292954189 * vmethod3248.animationId && vmethod3248.soundEffectIds == null) {
                    entity8 = vmethod3248.getEntity(3, n5, array, n14, n13, n15, (byte)(-100));
                }
                else {
                    entity8 = new DynamicObject(n4, 3, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                scene.newBoundaryObject(n, n2, n3, n13, entity8, null, Tiles.field829[n5], 0, calculateTag, n16);
                if (vmethod3248.clipped) {
                    if (0 == n5) {
                        Tiles.field819[n][n2][1 + n3] = 50;
                    }
                    else if (1 == n5) {
                        Tiles.field819[n][n2 + 1][n3 + 1] = 50;
                    }
                    else if (2 == n5) {
                        Tiles.field819[n][n2 + 1][n3] = 50;
                    }
                    else if (n5 == 3) {
                        Tiles.field819[n][n2][n3] = 50;
                    }
                }
                if (0 != vmethod3248.interactType * -973955889 && null != collisionMap) {
                    collisionMap.method1163(n2, n3, n6, n5, vmethod3248.boolean1, -2067452311);
                }
                return;
            }
            if (9 == n6) {
                Renderable entity9;
                if (-1 == vmethod3248.animationId * 1292954189 && vmethod3248.soundEffectIds == null) {
                    entity9 = vmethod3248.getEntity(n6, n5, array, n14, n13, n15, (byte)(-19));
                }
                else {
                    entity9 = new DynamicObject(n4, n6, n5, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.method1288(n, n2, n3, n13, 1, 1, entity9, 0, calculateTag, n16);
                if (vmethod3248.interactType * -973955889 != 0 && collisionMap != null) {
                    CollisionMap.wa(collisionMap, n2, n3, n7, n8, vmethod3248.boolean1, (byte)(-79));
                }
                if (-89408815 * vmethod3248.int2 != 16) {
                    scene.method1262(n, n2, n3, -89408815 * vmethod3248.int2);
                }
                return;
            }
            if (n6 == 4) {
                Renderable entity10;
                if (1292954189 * vmethod3248.animationId == -1 && null == vmethod3248.soundEffectIds) {
                    entity10 = vmethod3248.getEntity(4, n5, array, n14, n13, n15, (byte)(-101));
                }
                else {
                    entity10 = new DynamicObject(n4, 4, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity10, null, Tiles.field820[n5], 0, 0, 0, calculateTag, n16);
                return;
            }
            if (5 == n6) {
                int n22 = 16;
                final long boundaryObjectTag = scene.getBoundaryObjectTag(n, n2, n3);
                if (0L != boundaryObjectTag) {
                    n22 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag), (short)25535).int2 * -89408815;
                }
                Renderable entity11;
                if (vmethod3248.animationId * 1292954189 == -1 && null == vmethod3248.soundEffectIds) {
                    entity11 = vmethod3248.getEntity(4, n5, array, n14, n13, n15, (byte)(-47));
                }
                else {
                    entity11 = new DynamicObject(n4, 4, n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity11, null, Tiles.field820[n5], 0, Tiles.field830[n5] * n22, n22 * Tiles.field827[n5], calculateTag, n16);
                return;
            }
            if (n6 == 6) {
                int n23 = 8;
                final long boundaryObjectTag2 = scene.getBoundaryObjectTag(n, n2, n3);
                if (0L != boundaryObjectTag2) {
                    n23 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag2), (short)577).int2 * -89408815 / 2;
                }
                Renderable entity12;
                if (-1 == 1292954189 * vmethod3248.animationId && null == vmethod3248.soundEffectIds) {
                    entity12 = vmethod3248.getEntity(4, 4 + n5, array, n14, n13, n15, (byte)(-4));
                }
                else {
                    entity12 = new DynamicObject(n4, 4, 4 + n5, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity12, null, 256, n5, Tiles.field832[n5] * n23, n23 * Tiles.field833[n5], calculateTag, n16);
                return;
            }
            if (n6 == 7) {
                final int n24 = 2 + n5 & 0x3;
                Renderable entity13;
                if (vmethod3248.animationId * 1292954189 == -1 && vmethod3248.soundEffectIds == null) {
                    entity13 = vmethod3248.getEntity(4, 4 + n24, array, n14, n13, n15, (byte)(-112));
                }
                else {
                    entity13 = new DynamicObject(n4, 4, n24 + 4, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity13, null, 256, n24, 0, 0, calculateTag, n16);
                return;
            }
            if (8 == n6) {
                int n25 = 8;
                final long boundaryObjectTag3 = scene.getBoundaryObjectTag(n, n2, n3);
                if (0L != boundaryObjectTag3) {
                    n25 = class144.vmethod3248(InterfaceParent.Entity_unpackID(boundaryObjectTag3), (short)22870).int2 * -89408815 / 2;
                }
                final int n26 = 2 + n5 & 0x3;
                Renderable entity14;
                Renderable entity15;
                if (vmethod3248.animationId * 1292954189 == -1 && null == vmethod3248.soundEffectIds) {
                    entity14 = vmethod3248.getEntity(4, n5 + 4, array, n14, n13, n15, (byte)(-83));
                    entity15 = vmethod3248.getEntity(4, 4 + n26, array, n14, n13, n15, (byte)(-15));
                }
                else {
                    entity14 = new DynamicObject(n4, 4, n5 + 4, n, n2, n3, 1292954189 * vmethod3248.animationId, vmethod3248.boolean3, null);
                    entity15 = new DynamicObject(n4, 4, n26 + 4, n, n2, n3, vmethod3248.animationId * 1292954189, vmethod3248.boolean3, null);
                }
                scene.cw(n, n2, n3, n13, entity14, entity15, 256, n5, Tiles.field832[n5] * n25, n25 * Tiles.field833[n5], calculateTag, n16);
            }
        }
    }
}
