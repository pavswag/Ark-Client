import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.net.ssl.SSLSocketFactory;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

// 
// Decompiled by Procyon v0.5.36
// 

public class class10
{
    final class394 field32;
    int field33;
    boolean field34;
    final HttpsURLConnection field35;
    boolean field36;
    class436 field37;
    final class9 field38;
    static final int cz = 11;
    public static final int ai = 12;
    
    public class10(final URL url, final class9 field38, final class394 class394, final boolean b) throws IOException {
        this.field36 = false;
        this.field34 = false;
        this.field33 = -1718145824;
        if (!class9.hj(field38, (byte)74)) {
            throw new UnsupportedEncodingException("Unsupported request method used " + field38.method30((byte)(-21)));
        }
        this.field35 = (HttpsURLConnection)url.openConnection();
        if (!b) {
            final HttpsURLConnection field39 = this.field35;
            if (class15.field50 == null) {
                class15.field50 = new class15();
            }
            field39.setSSLSocketFactory(class15.field50);
        }
        this.field38 = field38;
        this.field32 = ((class394 != null) ? class394 : new class394());
    }
    
    public class10(final URL url, final class9 class9, final boolean b) throws IOException {
        this(url, class9, new class394(), b);
    }
    
    static final void method39(final Scene scene, final CollisionMap[] array, final int n) {
        try {
            for (int i = 0; i < 4; ++i) {
                if (n != 1670427112) {
                    return;
                }
                for (int j = 0; j < 104; ++j) {
                    if (n != 1670427112) {
                        throw new IllegalStateException();
                    }
                    for (int k = 0; k < 104; ++k) {
                        if (n != 1670427112) {
                            throw new IllegalStateException();
                        }
                        if ((Tiles.Tiles_renderFlags[i][j][k] & 0x1) == 0x1) {
                            if (n != 1670427112) {
                                throw new IllegalStateException();
                            }
                            int n2 = i;
                            if (0x2 == (Tiles.Tiles_renderFlags[1][j][k] & 0x2)) {
                                --n2;
                            }
                            if (n2 >= 0) {
                                if (n != 1670427112) {
                                    throw new IllegalStateException();
                                }
                                array[n2].setBlockedByFloor(j, k, (byte)90);
                            }
                        }
                    }
                }
            }
            Tiles.rndHue += ((int)(Math.random() * 5.0) - 2) * 1514061769;
            if (-372405639 * Tiles.rndHue < -8) {
                if (n != 1670427112) {
                    throw new IllegalStateException();
                }
                Tiles.rndHue = 772407736;
            }
            if (-372405639 * Tiles.rndHue > 8) {
                Tiles.rndHue = -772407736;
            }
            Tiles.rndLightness += ((int)(Math.random() * 5.0) - 2) * 1193325609;
            if (Tiles.rndLightness * -647485415 < -16) {
                if (n != 1670427112) {
                    return;
                }
                Tiles.rndLightness = -1913340560;
            }
            if (Tiles.rndLightness * -647485415 > 16) {
                Tiles.rndLightness = 1913340560;
            }
            for (int l = 0; l < 4; ++l) {
                if (n != 1670427112) {
                    return;
                }
                final byte[][] array2 = Tiles.field819[l];
                final int n3 = 768 * (int)Math.sqrt(5100.0) >> 8;
                for (int n4 = 1; n4 < 103; ++n4) {
                    if (n != 1670427112) {
                        return;
                    }
                    for (int n5 = 1; n5 < 103; ++n5) {
                        if (n != 1670427112) {
                            throw new IllegalStateException();
                        }
                        final int n6 = Tiles.Tiles_heights[l][1 + n5][n4] - Tiles.Tiles_heights[l][n5 - 1][n4];
                        final int n7 = Tiles.Tiles_heights[l][n5][n4 + 1] - Tiles.Tiles_heights[l][n5][n4 - 1];
                        final int n8 = (int)Math.sqrt(n7 * n7 + (65536 + n6 * n6));
                        Tiles.field821[n5][n4] = 96 + ((n7 << 8) / n8 * -50 + (-10 * (65536 / n8) + -50 * ((n6 << 8) / n8))) / n3 - ((array2[n5][1 + n4] >> 3) + ((array2[n5][n4 - 1] >> 2) + ((array2[1 + n5][n4] >> 3) + (array2[n5 - 1][n4] >> 2))) + (array2[n5][n4] >> 1));
                    }
                }
                for (int n9 = 0; n9 < 104; ++n9) {
                    if (n != 1670427112) {
                        throw new IllegalStateException();
                    }
                    FileSystem.Tiles_hue[n9] = 0;
                    Tiles.Tiles_saturation[n9] = 0;
                    class283.Tiles_lightness[n9] = 0;
                    UserComparator4.Tiles_hueMultiplier[n9] = 0;
                    class31.field92[n9] = 0;
                }
                for (int n10 = -5; n10 < 109; ++n10) {
                    if (n != 1670427112) {
                        throw new IllegalStateException();
                    }
                    for (int n11 = 0; n11 < 104; ++n11) {
                        if (n != 1670427112) {
                            return;
                        }
                        final int n12 = 5 + n10;
                        if (n12 >= 0) {
                            if (n != 1670427112) {
                                throw new IllegalStateException();
                            }
                            if (n12 < 104) {
                                if (n != 1670427112) {
                                    throw new IllegalStateException();
                                }
                                final int n13 = class186.Tiles_underlays[l][n12][n11] & (int)DynamicObject.method466(15, 1855948571);
                                if (n13 > 0) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    final int n14 = n13 - 1;
                                    final FloorUnderlayDefinition floorUnderlayDefinition = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n14);
                                    FloorUnderlayDefinition floorUnderlayDefinition2;
                                    if (null != floorUnderlayDefinition) {
                                        floorUnderlayDefinition2 = floorUnderlayDefinition;
                                    }
                                    else {
                                        final byte[] takeFile = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n14, (byte)(-111));
                                        final FloorUnderlayDefinition floorUnderlayDefinition3 = new FloorUnderlayDefinition();
                                        if (null != takeFile) {
                                            floorUnderlayDefinition3.decode(new Buffer(takeFile), n14, -2029421932);
                                        }
                                        floorUnderlayDefinition3.postDecode(875414437);
                                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition3, n14);
                                        floorUnderlayDefinition2 = floorUnderlayDefinition3;
                                    }
                                    final FloorUnderlayDefinition floorUnderlayDefinition4 = floorUnderlayDefinition2;
                                    final int[] tiles_hue = FileSystem.Tiles_hue;
                                    final int n15 = n11;
                                    tiles_hue[n15] += floorUnderlayDefinition4.hue * 372444635;
                                    final int[] tiles_saturation = Tiles.Tiles_saturation;
                                    final int n16 = n11;
                                    tiles_saturation[n16] += 1058265139 * floorUnderlayDefinition4.saturation;
                                    final int[] tiles_lightness = class283.Tiles_lightness;
                                    final int n17 = n11;
                                    tiles_lightness[n17] += -1527986335 * floorUnderlayDefinition4.lightness;
                                    final int[] tiles_hueMultiplier = UserComparator4.Tiles_hueMultiplier;
                                    final int n18 = n11;
                                    tiles_hueMultiplier[n18] += floorUnderlayDefinition4.hueMultiplier * -2012234183;
                                    final int[] field92 = class31.field92;
                                    final int n19 = n11;
                                    ++field92[n19];
                                }
                            }
                        }
                        final int n20 = n10 - 5;
                        if (n20 >= 0) {
                            if (n != 1670427112) {
                                return;
                            }
                            if (n20 < 104) {
                                final int n21 = class186.Tiles_underlays[l][n20][n11] & (int)DynamicObject.method466(15, 928667674);
                                if (n21 > 0) {
                                    final int n22 = n21 - 1;
                                    final FloorUnderlayDefinition floorUnderlayDefinition5 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.wr(n22);
                                    FloorUnderlayDefinition floorUnderlayDefinition6;
                                    if (floorUnderlayDefinition5 != null) {
                                        if (n != 1670427112) {
                                            return;
                                        }
                                        floorUnderlayDefinition6 = floorUnderlayDefinition5;
                                    }
                                    else {
                                        final byte[] takeFile2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, n22, (byte)(-27));
                                        final FloorUnderlayDefinition floorUnderlayDefinition7 = new FloorUnderlayDefinition();
                                        if (takeFile2 != null) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            floorUnderlayDefinition7.decode(new Buffer(takeFile2), n22, -1727054977);
                                        }
                                        floorUnderlayDefinition7.postDecode(875414437);
                                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(floorUnderlayDefinition7, n22);
                                        floorUnderlayDefinition6 = floorUnderlayDefinition7;
                                    }
                                    final FloorUnderlayDefinition floorUnderlayDefinition8 = floorUnderlayDefinition6;
                                    final int[] tiles_hue2 = FileSystem.Tiles_hue;
                                    final int n23 = n11;
                                    tiles_hue2[n23] -= 372444635 * floorUnderlayDefinition8.hue;
                                    final int[] tiles_saturation2 = Tiles.Tiles_saturation;
                                    final int n24 = n11;
                                    tiles_saturation2[n24] -= floorUnderlayDefinition8.saturation * 1058265139;
                                    final int[] tiles_lightness2 = class283.Tiles_lightness;
                                    final int n25 = n11;
                                    tiles_lightness2[n25] -= -1527986335 * floorUnderlayDefinition8.lightness;
                                    final int[] tiles_hueMultiplier2 = UserComparator4.Tiles_hueMultiplier;
                                    final int n26 = n11;
                                    tiles_hueMultiplier2[n26] -= -2012234183 * floorUnderlayDefinition8.hueMultiplier;
                                    final int[] field93 = class31.field92;
                                    final int n27 = n11;
                                    --field93[n27];
                                }
                            }
                        }
                    }
                    if (n10 >= 1) {
                        if (n != 1670427112) {
                            throw new IllegalStateException();
                        }
                        if (n10 < 103) {
                            if (n != 1670427112) {
                                throw new IllegalStateException();
                            }
                            int n28 = 0;
                            int n29 = 0;
                            int n30 = 0;
                            int n31 = 0;
                            int n32 = 0;
                            for (int n33 = -5; n33 < 109; ++n33) {
                                if (n != 1670427112) {
                                    throw new IllegalStateException();
                                }
                                final int n34 = n33 + 5;
                                if (n34 >= 0) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    if (n34 < 104) {
                                        if (n != 1670427112) {
                                            throw new IllegalStateException();
                                        }
                                        n28 += FileSystem.Tiles_hue[n34];
                                        n29 += Tiles.Tiles_saturation[n34];
                                        n30 += class283.Tiles_lightness[n34];
                                        n31 += UserComparator4.Tiles_hueMultiplier[n34];
                                        n32 += class31.field92[n34];
                                    }
                                }
                                final int n35 = n33 - 5;
                                if (n35 >= 0) {
                                    if (n != 1670427112) {
                                        return;
                                    }
                                    if (n35 < 104) {
                                        if (n != 1670427112) {
                                            throw new IllegalStateException();
                                        }
                                        n28 -= FileSystem.Tiles_hue[n35];
                                        n29 -= Tiles.Tiles_saturation[n35];
                                        n30 -= class283.Tiles_lightness[n35];
                                        n31 -= UserComparator4.Tiles_hueMultiplier[n35];
                                        n32 -= class31.field92[n35];
                                    }
                                }
                                if (n33 >= 1 && n33 < 103) {
                                    if (Client.isLowDetail) {
                                        if (n != 1670427112) {
                                            return;
                                        }
                                        if ((Tiles.Tiles_renderFlags[0][n10][n33] & 0x2) == 0x0) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            if (0x0 != (Tiles.Tiles_renderFlags[l][n10][n33] & 0x10)) {
                                                if (n != 1670427112) {
                                                    throw new IllegalStateException();
                                                }
                                                continue;
                                            }
                                        }
                                    }
                                    if (l < Tiles.Tiles_minPlane * 1401144457) {
                                        Tiles.Tiles_minPlane = l * -1087180359;
                                    }
                                    final int n36 = (int)DynamicObject.method466(15, 1408849564);
                                    final int n37 = class186.Tiles_underlays[l][n10][n33] & n36;
                                    final int n38 = Tiles.Tiles_overlays[l][n10][n33] & n36;
                                    if (n37 <= 0) {
                                        if (n != 1670427112) {
                                            throw new IllegalStateException();
                                        }
                                        if (n38 <= 0) {
                                            continue;
                                        }
                                    }
                                    final int n39 = Tiles.Tiles_heights[l][n10][n33];
                                    final int n40 = Tiles.Tiles_heights[l][n10 + 1][n33];
                                    final int n41 = Tiles.Tiles_heights[l][n10 + 1][1 + n33];
                                    final int n42 = Tiles.Tiles_heights[l][n10][n33 + 1];
                                    final int n43 = Tiles.field821[n10][n33];
                                    final int n44 = Tiles.field821[1 + n10][n33];
                                    final int n45 = Tiles.field821[n10 + 1][n33 + 1];
                                    final int n46 = Tiles.field821[n10][n33 + 1];
                                    int method1847 = -1;
                                    int method1848 = -1;
                                    if (n37 > 0) {
                                        final int n47 = n28 * 256 / n31;
                                        final int n48 = n29 / n32;
                                        final int n49 = n30 / n32;
                                        method1847 = GameBuild.method1847(n47, n48, n49, -347521940);
                                        final int n50 = n47 + Tiles.rndHue * -372405639 & 0xFF;
                                        int n51 = n49 + Tiles.rndLightness * -647485415;
                                        if (n51 < 0) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            n51 = 0;
                                        }
                                        else if (n51 > 255) {
                                            n51 = 255;
                                        }
                                        method1848 = GameBuild.method1847(n50, n48, n51, 441613106);
                                    }
                                    if (l > 0) {
                                        if (n != 1670427112) {
                                            return;
                                        }
                                        int n52 = 1;
                                        if (n37 == 0) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            if (0 != Tiles.Tiles_shapes[l][n10][n33]) {
                                                if (n != 1670427112) {
                                                    throw new IllegalStateException();
                                                }
                                                n52 = 0;
                                            }
                                        }
                                        if (n38 > 0) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            final int n53 = n38 - 1;
                                            final FloorOverlayDefinition floorOverlayDefinition = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n53);
                                            FloorOverlayDefinition floorOverlayDefinition2;
                                            if (floorOverlayDefinition != null) {
                                                if (n != 1670427112) {
                                                    return;
                                                }
                                                floorOverlayDefinition2 = floorOverlayDefinition;
                                            }
                                            else {
                                                final byte[] takeFile3 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n53, (byte)(-94));
                                                final FloorOverlayDefinition floorOverlayDefinition3 = new FloorOverlayDefinition();
                                                if (takeFile3 != null) {
                                                    if (n != 1670427112) {
                                                        throw new IllegalStateException();
                                                    }
                                                    floorOverlayDefinition3.decode(new Buffer(takeFile3), n53, (short)128);
                                                }
                                                floorOverlayDefinition3.postDecode(-1436922747);
                                                FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition3, n53);
                                                floorOverlayDefinition2 = floorOverlayDefinition3;
                                            }
                                            if (!floorOverlayDefinition2.hideUnderlay) {
                                                if (n != 1670427112) {
                                                    throw new IllegalStateException();
                                                }
                                                n52 = 0;
                                            }
                                        }
                                        if (n52 != 0) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            if (n39 == n40) {
                                                if (n != 1670427112) {
                                                    throw new IllegalStateException();
                                                }
                                                if (n39 == n41) {
                                                    if (n != 1670427112) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (n42 == n39) {
                                                        if (n != 1670427112) {
                                                            throw new IllegalStateException();
                                                        }
                                                        final int[] array3 = class161.field1407[l][n10];
                                                        final int n54 = n33;
                                                        array3[n54] |= 0x924;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    int n55 = 0;
                                    if (method1848 != -1) {
                                        if (n != 1670427112) {
                                            return;
                                        }
                                        n55 = Rasterizer3D.Rasterizer3D_colorPalette[method41(method1848, 96, -42895178)];
                                    }
                                    if (n38 == 0) {
                                        if (n != 1670427112) {
                                            return;
                                        }
                                        scene.addTile(l, n10, n33, 0, 0, -1, n39, n40, n41, n42, method41(method1847, n43, -2133305210), method41(method1847, n44, 1536691398), method41(method1847, n45, -968775430), method41(method1847, n46, -490721327), 0, 0, 0, 0, n55, 0);
                                    }
                                    else {
                                        final int n56 = Tiles.Tiles_shapes[l][n10][n33] + 1;
                                        final byte b = Tiles.field824[l][n10][n33];
                                        final int n57 = n38 - 1;
                                        final FloorOverlayDefinition floorOverlayDefinition4 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.wr(n57);
                                        FloorOverlayDefinition floorOverlayDefinition5;
                                        if (floorOverlayDefinition4 != null) {
                                            floorOverlayDefinition5 = floorOverlayDefinition4;
                                        }
                                        else {
                                            final byte[] takeFile4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, n57, (byte)(-118));
                                            final FloorOverlayDefinition floorOverlayDefinition6 = new FloorOverlayDefinition();
                                            if (takeFile4 != null) {
                                                if (n != 1670427112) {
                                                    throw new IllegalStateException();
                                                }
                                                floorOverlayDefinition6.decode(new Buffer(takeFile4), n57, (short)128);
                                            }
                                            floorOverlayDefinition6.postDecode(7091513);
                                            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(floorOverlayDefinition6, n57);
                                            floorOverlayDefinition5 = floorOverlayDefinition6;
                                        }
                                        final FloorOverlayDefinition floorOverlayDefinition7 = floorOverlayDefinition5;
                                        int n58 = floorOverlayDefinition7.texture * -202963991;
                                        int n59;
                                        int method1849;
                                        if (n58 >= 0) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            n59 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(n58, -570572153);
                                            method1849 = -1;
                                        }
                                        else if (16711935 == 1889574527 * floorOverlayDefinition7.primaryRgb) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            method1849 = -2;
                                            n58 = -1;
                                            n59 = -2;
                                        }
                                        else {
                                            method1849 = GameBuild.method1847(floorOverlayDefinition7.hue * 174415927, floorOverlayDefinition7.saturation * 470803713, floorOverlayDefinition7.lightness * 532980473, -1858517383);
                                            final int n60 = -372405639 * Tiles.rndHue + floorOverlayDefinition7.hue * 174415927 & 0xFF;
                                            int n61 = floorOverlayDefinition7.lightness * 532980473 + Tiles.rndLightness * -647485415;
                                            if (n61 < 0) {
                                                if (n != 1670427112) {
                                                    throw new IllegalStateException();
                                                }
                                                n61 = 0;
                                            }
                                            else if (n61 > 255) {
                                                n61 = 255;
                                            }
                                            n59 = GameBuild.method1847(n60, floorOverlayDefinition7.saturation * 470803713, n61, 38730890);
                                        }
                                        int n62 = 0;
                                        if (n59 != -2) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            n62 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(n59, 96, (byte)0)];
                                        }
                                        if (-1 != floorOverlayDefinition7.secondaryRgb * -2085280195) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            final int n63 = floorOverlayDefinition7.secondaryHue * -187777599 + -372405639 * Tiles.rndHue & 0xFF;
                                            int n64 = Tiles.rndLightness * -647485415 + floorOverlayDefinition7.secondaryLightness * -1379609783;
                                            if (n64 < 0) {
                                                if (n != 1670427112) {
                                                    throw new IllegalStateException();
                                                }
                                                n64 = 0;
                                            }
                                            else if (n64 > 255) {
                                                if (n != 1670427112) {
                                                    throw new IllegalStateException();
                                                }
                                                n64 = 255;
                                            }
                                            n62 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method2437(GameBuild.method1847(n63, floorOverlayDefinition7.secondarySaturation * 1797179473, n64, 675538998), 96, (byte)0)];
                                        }
                                        scene.addTile(l, n10, n33, n56, b, n58, n39, n40, n41, n42, method41(method1847, n43, -1641725112), method41(method1847, n44, 1192236720), method41(method1847, n45, -85022442), method41(method1847, n46, -1404869279), class478.method2437(method1849, n43, (byte)0), class478.method2437(method1849, n44, (byte)0), class478.method2437(method1849, n45, (byte)0), class478.method2437(method1849, n46, (byte)0), n55, n62);
                                    }
                                }
                            }
                        }
                    }
                }
                for (int n65 = 1; n65 < 103; ++n65) {
                    if (n != 1670427112) {
                        throw new IllegalStateException();
                    }
                    for (int n66 = 1; n66 < 103; ++n66) {
                        if (n != 1670427112) {
                            throw new IllegalStateException();
                        }
                        scene.setTileMinPlane(l, n66, n65, PcmPlayer.method240(l, n66, n65, 1817276364));
                    }
                }
                class186.Tiles_underlays[l] = null;
                Tiles.Tiles_overlays[l] = null;
                Tiles.Tiles_shapes[l] = null;
                Tiles.field824[l] = null;
                Tiles.field819[l] = null;
            }
            scene.de(-50, -10, -50);
            for (int n67 = 0; n67 < 104; ++n67) {
                if (n != 1670427112) {
                    throw new IllegalStateException();
                }
                for (int n68 = 0; n68 < 104; ++n68) {
                    if (n != 1670427112) {
                        throw new IllegalStateException();
                    }
                    if (0x2 == (Tiles.Tiles_renderFlags[1][n67][n68] & 0x2)) {
                        if (n != 1670427112) {
                            throw new IllegalStateException();
                        }
                        scene.setLinkBelow(n67, n68);
                    }
                }
            }
            int n69 = 1;
            int n70 = 2;
            int n71 = 4;
            for (int n72 = 0; n72 < 4; ++n72) {
                if (n72 > 0) {
                    if (n != 1670427112) {
                        throw new IllegalStateException();
                    }
                    n69 <<= 3;
                    n70 <<= 3;
                    n71 <<= 3;
                }
                for (int n73 = 0; n73 <= n72; ++n73) {
                    if (n != 1670427112) {
                        throw new IllegalStateException();
                    }
                    for (int n74 = 0; n74 <= 104; ++n74) {
                        if (n != 1670427112) {
                            return;
                        }
                        for (int n75 = 0; n75 <= 104; ++n75) {
                            if (n != 1670427112) {
                                return;
                            }
                            if (0x0 != (class161.field1407[n73][n75][n74] & n69)) {
                                if (n != 1670427112) {
                                    return;
                                }
                                int n76 = n74;
                                int n77 = n74;
                                int n78 = n73;
                                int n79 = n73;
                                while (n76 > 0) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    if ((class161.field1407[n73][n75][n76 - 1] & n69) == 0x0) {
                                        break;
                                    }
                                    --n76;
                                }
                                while (n77 < 104) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    if ((class161.field1407[n73][n75][1 + n77] & n69) == 0x0) {
                                        break;
                                    }
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    ++n77;
                                }
                            Label_0328:
                                while (n78 > 0) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    int n80 = n76;
                                    while (n80 <= n77) {
                                        if (n != 1670427112) {
                                            throw new IllegalStateException();
                                        }
                                        if (0x0 == (class161.field1407[n78 - 1][n75][n80] & n69)) {
                                            if (n != 1670427112) {
                                                return;
                                            }
                                            break Label_0328;
                                        }
                                        else {
                                            ++n80;
                                        }
                                    }
                                    --n78;
                                }
                            Label_4097:
                                while (n79 < n72) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    int n81 = n76;
                                    while (n81 <= n77) {
                                        if (n != 1670427112) {
                                            throw new IllegalStateException();
                                        }
                                        if (0x0 == (class161.field1407[n79 + 1][n75][n81] & n69)) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_4097;
                                        }
                                        else {
                                            ++n81;
                                        }
                                    }
                                    ++n79;
                                }
                                if ((1 + (n77 - n76)) * (n79 + 1 - n78) >= 8) {
                                    if (n != 1670427112) {
                                        return;
                                    }
                                    Scene.Scene_addOccluder(n72, 1, n75 * 128, 128 * n75, 128 * n76, n77 * 128 + 128, Tiles.Tiles_heights[n79][n75][n76] - 240, Tiles.Tiles_heights[n78][n75][n76]);
                                    for (int n82 = n78; n82 <= n79; ++n82) {
                                        if (n != 1670427112) {
                                            return;
                                        }
                                        for (int n83 = n76; n83 <= n77; ++n83) {
                                            if (n != 1670427112) {
                                                return;
                                            }
                                            final int[] array4 = class161.field1407[n82][n75];
                                            final int n84 = n83;
                                            array4[n84] &= ~n69;
                                        }
                                    }
                                }
                            }
                            if ((class161.field1407[n73][n75][n74] & n70) != 0x0) {
                                if (n != 1670427112) {
                                    throw new IllegalStateException();
                                }
                                int n85 = n75;
                                int n86 = n75;
                                int n87 = n73;
                                int n88 = n73;
                                while (n85 > 0 && (class161.field1407[n73][n85 - 1][n74] & n70) != 0x0) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    --n85;
                                }
                                while (n86 < 104) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    if (0x0 == (class161.field1407[n73][1 + n86][n74] & n70)) {
                                        break;
                                    }
                                    ++n86;
                                }
                            Label_3469:
                                while (n87 > 0) {
                                    int n89 = n85;
                                    while (n89 <= n86) {
                                        if (0x0 == (class161.field1407[n87 - 1][n89][n74] & n70)) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_3469;
                                        }
                                        else {
                                            ++n89;
                                        }
                                    }
                                    --n87;
                                }
                            Label_4645:
                                while (n88 < n72) {
                                    int n90 = n85;
                                    while (n90 <= n86) {
                                        if (n != 1670427112) {
                                            throw new IllegalStateException();
                                        }
                                        if (0x0 == (class161.field1407[n88 + 1][n90][n74] & n70)) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_4645;
                                        }
                                        else {
                                            ++n90;
                                        }
                                    }
                                    ++n88;
                                }
                                if ((1 + (n86 - n85)) * (n88 + 1 - n87) >= 8) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    Scene.Scene_addOccluder(n72, 2, n85 * 128, n86 * 128 + 128, 128 * n74, 128 * n74, Tiles.Tiles_heights[n88][n85][n74] - 240, Tiles.Tiles_heights[n87][n85][n74]);
                                    for (int n91 = n87; n91 <= n88; ++n91) {
                                        for (int n92 = n85; n92 <= n86; ++n92) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            final int[] array5 = class161.field1407[n91][n92];
                                            final int n93 = n74;
                                            array5[n93] &= ~n70;
                                        }
                                    }
                                }
                            }
                            if ((class161.field1407[n73][n75][n74] & n71) != 0x0) {
                                int n94 = n75;
                                int n95 = n75;
                                int n96 = n74;
                                int n97 = n74;
                                while (n96 > 0) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    if ((class161.field1407[n73][n75][n96 - 1] & n71) == 0x0) {
                                        break;
                                    }
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    --n96;
                                }
                                while (n97 < 104) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    if (0x0 == (class161.field1407[n73][n75][n97 + 1] & n71)) {
                                        break;
                                    }
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    ++n97;
                                }
                            Label_2853:
                                while (n94 > 0) {
                                    if (n != 1670427112) {
                                        throw new IllegalStateException();
                                    }
                                    int n98 = n96;
                                    while (n98 <= n97) {
                                        if (n != 1670427112) {
                                            throw new IllegalStateException();
                                        }
                                        if ((class161.field1407[n73][n94 - 1][n98] & n71) == 0x0) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_2853;
                                        }
                                        else {
                                            ++n98;
                                        }
                                    }
                                    --n94;
                                }
                            Label_5166:
                                while (n95 < 104) {
                                    int n99 = n96;
                                    while (n99 <= n97) {
                                        if (n != 1670427112) {
                                            return;
                                        }
                                        if ((class161.field1407[n73][1 + n95][n99] & n71) == 0x0) {
                                            if (n != 1670427112) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_5166;
                                        }
                                        else {
                                            ++n99;
                                        }
                                    }
                                    ++n95;
                                }
                                if ((n97 - n96 + 1) * (1 + (n95 - n94)) >= 4) {
                                    final int n100 = Tiles.Tiles_heights[n73][n94][n96];
                                    Scene.Scene_addOccluder(n72, 4, n94 * 128, 128 + n95 * 128, 128 * n96, 128 + n97 * 128, n100, n100);
                                    for (int n101 = n94; n101 <= n95; ++n101) {
                                        for (int n102 = n96; n102 <= n97; ++n102) {
                                            if (n != 1670427112) {
                                                return;
                                            }
                                            final int[] array6 = class161.field1407[n73][n101];
                                            final int n103 = n102;
                                            array6[n103] &= ~n71;
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
            throw HealthBar.get(ex, "ay.ao(" + ')');
        }
    }
    
    void method39() throws ProtocolException {
        if (this.field36) {
            return;
        }
        this.field35.setRequestMethod(this.field38.method30((byte)(-29)));
        class394.ur(this.field32, this.field35, 1696684066);
        if (this.field38.method31(-1978695127) && null != this.field37) {
            this.field35.setDoOutput(true);
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.field37.vmethod7797(888549065));
                byteArrayOutputStream.writeTo(this.field35.getOutputStream());
            }
            catch (IOException ex) {
                ex.printStackTrace();
                try {
                    byteArrayOutputStream.close();
                }
                catch (IOException ex2) {
                    ex2.printStackTrace();
                }
            }
            finally {
                try {
                    byteArrayOutputStream.close();
                }
                catch (IOException ex3) {
                    ex3.printStackTrace();
                }
            }
        }
        this.field35.setConnectTimeout(-283025399 * this.field33);
        this.field35.setInstanceFollowRedirects(this.field34);
        this.field36 = true;
    }
    
    public void at(final class436 field37) {
        if (this.field36) {
            return;
        }
        if (field37 == null) {
            class394.ne(this.field32, "Content-Type", (short)(-9095));
            this.field37 = null;
            return;
        }
        this.field37 = field37;
        if (this.field37.vmethod2213(-1705702615) != null) {
            class394.rk(this.field32, this.field37.vmethod2213(-950933299), 1037521942);
        }
        else {
            class394.kl(this.field32, 1445356467);
        }
    }
    
    public static int nm(final class379 class379, int fromIndex, int toIndex) {
        if (class379 == null) {
            class379.ew(fromIndex);
        }
        if (toIndex < fromIndex) {
            final int n = toIndex;
            toIndex = fromIndex;
            fromIndex = n;
        }
        class379.field3619.subList(fromIndex, toIndex).clear();
        int i = fromIndex;
        if (class379.method2005((byte)16) && 1 == -29893609 * class379.field3611) {
            while (i > 0) {
                --i;
                final char field3624 = class379.field3619.get(i).field3624;
                if (' ' == field3624) {
                    break;
                }
                if (field3624 == '\t') {
                    break;
                }
            }
        }
        class379.method2026(i, toIndex, -93545195);
        return fromIndex;
    }
    
    boolean ax() throws IOException {
        if (!this.field36) {
            ml(this, (byte)69);
        }
        this.field35.connect();
        return this.field35.getResponseCode() == -1;
    }
    
    void ay() throws ProtocolException {
        if (this.field36) {
            return;
        }
        this.field35.setRequestMethod(this.field38.method30((byte)(-41)));
        class394.ur(this.field32, this.field35, 2009863432);
        if (this.field38.method31(161880080) && null != this.field37) {
            this.field35.setDoOutput(true);
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.field37.vmethod7797(888549065));
                byteArrayOutputStream.writeTo(this.field35.getOutputStream());
            }
            catch (IOException ex) {
                ex.printStackTrace();
                try {
                    byteArrayOutputStream.close();
                }
                catch (IOException ex2) {
                    ex2.printStackTrace();
                }
            }
            finally {
                try {
                    byteArrayOutputStream.close();
                }
                catch (IOException ex3) {
                    ex3.printStackTrace();
                }
            }
        }
        this.field35.setConnectTimeout(-283025399 * this.field33);
        this.field35.setInstanceFollowRedirects(this.field34);
        this.field36 = true;
    }
    
    public static void ml(final class10 class10, final byte b) throws ProtocolException {
        if (class10 == null) {
            class10.method36(b);
        }
        try {
            if (!class10.field36) {
                class10.field35.setRequestMethod(class10.field38.method30((byte)(-57)));
                class394.ur(class10.field32, class10.field35, 1759614769);
                if (class10.field38.method31(142097256) && null != class10.field37) {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    class10.field35.setDoOutput(true);
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byteArrayOutputStream.write(class10.field37.vmethod7797(888549065));
                        byteArrayOutputStream.writeTo(class10.field35.getOutputStream());
                    }
                    catch (IOException ex) {
                        ex.printStackTrace();
                        try {
                            byteArrayOutputStream.close();
                        }
                        catch (IOException ex2) {
                            ex2.printStackTrace();
                        }
                    }
                    finally {
                        try {
                            byteArrayOutputStream.close();
                        }
                        catch (IOException ex3) {
                            ex3.printStackTrace();
                        }
                    }
                }
                class10.field35.setConnectTimeout(-283025399 * class10.field33);
                class10.field35.setInstanceFollowRedirects(class10.field34);
                class10.field36 = true;
                return;
            }
            if (b <= -1) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex4) {
            throw HealthBar.get(ex4, "ay.aw(" + ')');
        }
    }
    
    void method36(final byte b) {
        try {
            if (!this.field36) {
                this.field35.setRequestMethod(this.field38.method30((byte)(-57)));
                class394.ur(this.field32, this.field35, 1759614769);
                if (this.field38.method31(142097256) && null != this.field37) {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    this.field35.setDoOutput(true);
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byteArrayOutputStream.write(this.field37.vmethod7797(888549065));
                        byteArrayOutputStream.writeTo(this.field35.getOutputStream());
                    }
                    catch (IOException ex) {
                        ex.printStackTrace();
                        try {
                            byteArrayOutputStream.close();
                        }
                        catch (IOException ex2) {
                            ex2.printStackTrace();
                        }
                    }
                    finally {
                        try {
                            byteArrayOutputStream.close();
                        }
                        catch (IOException ex3) {
                            ex3.printStackTrace();
                        }
                    }
                }
                this.field35.setConnectTimeout(-283025399 * this.field33);
                this.field35.setInstanceFollowRedirects(this.field36);
                this.field34 = true;
                return;
            }
            if (b <= -1) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex4) {
            throw HealthBar.get(ex4, "ay.aw(" + ')');
        }
    }
    
    public void al(final class436 field37) {
        if (this.field36) {
            return;
        }
        if (field37 == null) {
            class394.ne(this.field32, "Content-Type", (short)(-30074));
            this.field37 = null;
            return;
        }
        this.field37 = field37;
        if (this.field37.vmethod2213(-1279812530) != null) {
            class394.rk(this.field32, this.field37.vmethod2213(-132900521), 1037521942);
        }
        else {
            class394.kl(this.field32, 1510877154);
        }
    }
    
    public static void km(final class10 class10, final class436 field37, final byte b) {
        if (class10 == null) {
            class10.method38(field37, b);
            return;
        }
        try {
            if (class10.field36) {
                return;
            }
            if (field37 != null) {
                class10.field37 = field37;
                if (class10.field37.vmethod2213(-1368831969) != null) {
                    class394.rk(class10.field32, class10.field37.vmethod2213(-1423914981), 1037521942);
                }
                else {
                    class394.kl(class10.field32, 1055361805);
                }
                return;
            }
            if (b != 1) {
                return;
            }
            class394.ne(class10.field32, "Content-Type", (short)(-14811));
            class10.field37 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ay.an(" + ')');
        }
    }
    
    public void method38(final class436 field37, final byte b) {
        try {
            if (this.field36) {
                return;
            }
            if (field37 != null) {
                this.field37 = field37;
                if (this.field37.vmethod2213(-1368831969) != null) {
                    class394.rk(this.field32, this.field37.vmethod2213(-1423914981), 1037521942);
                }
                else {
                    class394.kl(this.field32, 1055361805);
                }
                return;
            }
            if (b != 1) {
                return;
            }
            class394.ne(this.field32, "Content-Type", (short)(-14811));
            this.field37 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ay.an(" + ')');
        }
    }
    
    boolean method37(final byte b) throws IOException {
        try {
            if (!this.field36) {
                ml(this, (byte)4);
            }
            this.field35.connect();
            return this.field35.getResponseCode() == -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ay.ac(" + ')');
        }
    }
    
    public static boolean fl(final Widget widget) {
        if (widget == null) {
            widget.getSpriteTiling();
        }
        return 11 == 883712245 * widget.type || 12 == widget.type * 633007538;
    }
    
    public static class20 nw(final class10 class10) {
        try {
            if (!class10.field36 || class10.field35.getResponseCode() == -1) {
                return new class20("No REST response has been received yet.");
            }
        }
        catch (IOException ex) {
            class10.field35.disconnect();
            return new class20("Error decoding REST response code: " + ex.getMessage());
        }
        class20 class11;
        try {
            class11 = new class20(class10.field35);
        }
        catch (IOException ex2) {
            return new class20("Error decoding REST response: " + ex2.getMessage());
        }
        finally {
            class10.field35.disconnect();
        }
        return class11;
    }
    
    class20 method35(final byte b) {
        try {
            class20 class20 = null;
            Label_0095: {
                try {
                    if (this.field36) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        if (this.field35.getResponseCode() != -1) {
                            break Label_0095;
                        }
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                    }
                    return new class20("No REST response has been received yet.");
                }
                catch (IOException ex) {
                    this.field35.disconnect();
                    return new class20("Error decoding REST response code: " + ex.getMessage());
                }
                try {
                    class20 = new class20(this.field35);
                }
                catch (IOException ex2) {
                    return new class20("Error decoding REST response: " + ex2.getMessage());
                }
                finally {
                    this.field35.disconnect();
                }
            }
            return class20;
        }
        catch (RuntimeException ex3) {
            throw HealthBar.get(ex3, "ay.au(" + ')');
        }
    }
    
    public void aa(final class436 field37) {
        if (this.field36) {
            return;
        }
        if (field37 == null) {
            class394.ne(this.field32, "Content-Type", (short)(-29095));
            this.field37 = null;
            return;
        }
        this.field37 = field37;
        if (this.field37.vmethod2213(-1948643577) != null) {
            class394.rk(this.field32, this.field37.vmethod2213(-2136403957), 1037521942);
        }
        else {
            class394.kl(this.field32, 1686836713);
        }
    }
    
    boolean ai() throws IOException {
        if (!this.field36) {
            ml(this, (byte)106);
        }
        this.field35.connect();
        return this.field35.getResponseCode() == -1;
    }
    
    static final int method41(final int n, int n2, final int n3) {
        try {
            if (n == -1) {
                return 12345678;
            }
            n2 = (n & 0x7F) * n2 / 128;
            if (n2 < 2) {
                if (n3 >= 1540039981) {
                    throw new IllegalStateException();
                }
                n2 = 2;
            }
            else if (n2 > 126) {
                n2 = 126;
            }
            return (n & 0xFF80) + n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ay.ar(" + ')');
        }
    }
    
    public class394 method34(final int n) {
        try {
            return this.field32;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ay.af(" + ')');
        }
    }
    
    public class394 ab() {
        return this.field32;
    }
    
    public class394 aq() {
        return this.field32;
    }
    
    static class482 method40(final int n, final int n2) {
        try {
            class482 class482 = (class482)Client.Widget_cachedFonts.wr(n);
            if (null == class482) {
                if (n2 >= 1719617706) {
                    throw new IllegalStateException();
                }
                class482 = new class482(PcmPlayer.field211, n);
            }
            return class482;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ay.od(" + ')');
        }
    }
    
    class20 ah() {
        try {
            if (!this.field36 || this.field35.getResponseCode() == -1) {
                return new class20("No REST response has been received yet.");
            }
        }
        catch (IOException ex) {
            this.field35.disconnect();
            return new class20("Error decoding REST response code: " + ex.getMessage());
        }
        class20 class20;
        try {
            class20 = new class20(this.field35);
        }
        catch (IOException ex2) {
            return new class20("Error decoding REST response: " + ex2.getMessage());
        }
        finally {
            this.field35.disconnect();
        }
        return class20;
    }
}
