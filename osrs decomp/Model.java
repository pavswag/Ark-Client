import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.model.Jarvis;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import java.awt.Shape;
import java.util.Arrays;
import net.runelite.api.Mesh;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.36
// 

public class Model extends Renderable implements net.runelite.api.Model
{
    static final int cz = 3500;
    static byte[] Model_sharedSequenceModelFaceAlphas;
    static int[] field2132;
    static byte[] Model_sharedSpotAnimationModelFaceAlphas;
    static class425 field2134;
    static class425 field2135;
    static class425 field2136;
    public int verticesCount;
    int[] verticesX;
    int[] verticesY;
    static int[] field2140;
    public int indicesCount;
    int[] indices1;
    int[] indices2;
    int[] indices3;
    static int[][] field2145;
    int[] faceColors2;
    int[] faceColors3;
    byte[] faceAlphas;
    byte[] field2154;
    static float[] field2150;
    public static final /* synthetic */ boolean ua;
    short[] faceTextures;
    public byte field2152;
    public int[] ez;
    public int field2153;
    byte[] faceRenderPriorities;
    int[] field2155;
    int[][] field2156;
    int[][] vertexLabels;
    public boolean isSingleTile;
    public byte overrideSaturation;
    int[][] field2160;
    static int[] field2161;
    public int th;
    int boundsType;
    int bottomY;
    public int pa;
    int xzRadius;
    int[] faceColors1;
    static final int co = 50;
    HashMap aabb;
    static Model Model_sharedSequenceModel;
    static boolean[] field2168;
    static boolean[] field2169;
    static Model Model_sharedSpotAnimationModel;
    static int[] modelViewportYs;
    static float[] field2172;
    static int[] field2173;
    int diameter;
    static int[] field2175;
    static int[] field2176;
    static final int bp = 6000;
    static int Model_transformTempY;
    public int ln;
    static char[][] field2178;
    static int[] field2179;
    static boolean field2180;
    static int[] field2181;
    static int[] field2182;
    static int[] field2183;
    static int[] field2184;
    static int[] field2185;
    static int[] field2186;
    public int[] oy;
    int[] field2187;
    static int Model_transformTempX;
    static int[] modelViewportXs;
    static int Model_transformTempZ;
    int radius;
    static int[] field2192;
    int[][] faceLabelsAlpha;
    static final int cg = 5;
    public int[] en;
    static final int cr = 20;
    public byte overrideLuminance;
    static char[] field2195;
    public short field2196;
    public byte overrideHue;
    static final float field2198;
    static final int bn = 6500;
    int[] field2199;
    static int[] field2200;
    public byte overrideAmount;
    int[] verticesZ;
    
    Model() {
        this.verticesCount = 0;
        this.indicesCount = 0;
        this.field2152 = 0;
        this.field2153 = 0;
        this.isSingleTile = false;
        this.aabb = new HashMap();
    }
    
    public Model(final Model[] array, final int n) {
        this.verticesCount = 0;
        this.indicesCount = 0;
        this.field2152 = 0;
        this.field2153 = 0;
        this.isSingleTile = false;
        this.aabb = new HashMap();
        this.verticesCount = 0;
        this.indicesCount = 0;
        this.field2153 = 0;
        this.field2152 = -1;
        for (final Model model : array) {
            if (model != null) {
                this.verticesCount += model.verticesCount;
                this.indicesCount += model.indicesCount;
                this.field2153 += model.field2153;
                if (this.field2152 == -1) {
                    this.field2152 = model.field2152;
                }
            }
        }
        this.method1339(this.verticesCount, this.indicesCount, this.field2153);
        this.verticesCount = 0;
        this.indicesCount = 0;
        this.field2153 = 0;
        for (int j = 0; j < n; ++j) {
            this.method1342(array[j]);
        }
        this.dn(array, n);
    }
    
    public Model(final int n, final int n2, final int n3, final byte field2152) {
        this.verticesCount = 0;
        this.indicesCount = 0;
        this.field2152 = 0;
        this.field2153 = 0;
        this.isSingleTile = false;
        this.aabb = new HashMap();
        this.method1339(n, n2, n3);
        this.field2152 = field2152;
        this.verticesCount = 0;
        this.indicesCount = 0;
        this.field2153 = 0;
    }
    
    static {
        Model.Model_sharedSequenceModel = new Model();
        Model.Model_sharedSequenceModelFaceAlphas = new byte[1];
        Model.Model_sharedSpotAnimationModel = new Model();
        Model.Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
        Model.field2134 = new class425();
        Model.field2135 = new class425();
        Model.field2136 = new class425();
        Model.field2168 = new boolean[6500];
        Model.field2169 = new boolean[6500];
        Model.modelViewportXs = new int[6500];
        Model.modelViewportYs = new int[6500];
        Model.field2172 = new float[6500];
        Model.field2173 = new int[6500];
        Model.field2161 = new int[6500];
        Model.field2175 = new int[6500];
        Model.field2200 = new int[6500];
        Model.field2195 = new char[6000];
        Model.field2178 = new char[6000][512];
        Model.field2179 = new int[12];
        Model.field2145 = new int[12][2000];
        Model.field2181 = new int[2000];
        Model.field2182 = new int[2000];
        Model.field2183 = new int[12];
        Model.field2184 = new int[10];
        Model.field2185 = new int[10];
        Model.field2186 = new int[10];
        Model.field2150 = new float[10];
        Model.field2180 = true;
        Model.field2192 = Rasterizer3D.Rasterizer3D_sine;
        Model.field2132 = Rasterizer3D.Rasterizer3D_cosine;
        Model.field2140 = Rasterizer3D.Rasterizer3D_colorPalette;
        Model.field2176 = Rasterizer3D.field1993;
        field2198 = NPC.method609(50, 1228620083);
        ua = !Model.class.desiredAssertionStatus();
    }
    
    Model cs(final boolean b, final Model model, final byte[] field2154) {
        model.verticesCount = this.verticesCount;
        model.indicesCount = this.indicesCount;
        model.field2153 = this.field2153;
        if (model.verticesX == null || model.verticesX.length < this.verticesCount) {
            model.verticesX = new int[this.verticesCount + 969664020];
            model.verticesY = new int[this.verticesCount + 100];
            model.verticesZ = new int[this.verticesCount - 500839];
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            model.verticesX[i] = this.verticesX[i];
            model.verticesY[i] = this.verticesY[i];
            model.verticesZ[i] = this.verticesZ[i];
        }
        if (b) {
            model.field2154 = this.field2154;
        }
        else {
            model.field2154 = field2154;
            if (this.field2154 == null) {
                for (int j = 0; j < this.indicesCount; ++j) {
                    model.field2154[j] = 0;
                }
            }
            else {
                for (int k = 0; k < this.indicesCount; ++k) {
                    model.field2154[k] = this.field2154[k];
                }
            }
        }
        model.indices1 = this.indices1;
        model.indices2 = this.indices2;
        model.indices3 = this.indices3;
        model.faceColors1 = this.faceColors1;
        model.faceColors2 = this.faceColors2;
        model.faceColors3 = this.faceColors3;
        model.faceAlphas = this.faceAlphas;
        model.faceRenderPriorities = this.faceRenderPriorities;
        model.faceTextures = this.faceTextures;
        model.field2152 = this.field2152;
        model.field2199 = this.field2199;
        model.field2155 = this.field2155;
        model.field2187 = this.field2187;
        model.vertexLabels = this.vertexLabels;
        model.faceLabelsAlpha = this.faceLabelsAlpha;
        model.field2156 = this.field2156;
        model.field2160 = this.field2160;
        model.isSingleTile = this.isSingleTile;
        dv(model);
        model.overrideAmount = 0;
        return model;
    }
    
    public void dp() {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            this.verticesX[i] = this.verticesZ[i];
            this.verticesZ[i] = -n;
        }
        dv(this);
    }
    
    void method1333(final class219 class219, final int n) {
        this.method1319(class219, n);
    }
    
    final void en(final boolean b, boolean b2, final boolean b3, final long n) {
        if (this.diameter >= 6000) {
            return;
        }
        for (int i = 0; i < this.diameter; ++i) {
            Model.field2195[i] = '\0';
        }
        final int n2 = b3 ? 20 : 5;
        for (int j = '\0'; j < this.indicesCount; j = (char)(j + '\u0001')) {
            if (this.faceColors3[j] != -2) {
                final int n3 = this.indices1[j];
                final int n4 = this.indices2[j];
                final int n5 = this.indices3[j];
                final int n6 = Model.modelViewportXs[n3];
                final int n7 = Model.modelViewportXs[n4];
                final int n8 = Model.modelViewportXs[n5];
                if (b && (n6 == -5000 || n7 == -5000 || n8 == -5000)) {
                    final int n9 = Model.field2161[n3];
                    final int n10 = Model.field2161[n4];
                    final int n11 = Model.field2161[n5];
                    final int n12 = Model.field2175[n3];
                    final int n13 = Model.field2175[n4];
                    final int n14 = Model.field2175[n5];
                    final int n15 = Model.field2200[n3];
                    final int n16 = Model.field2200[n4];
                    final int n17 = Model.field2200[n5];
                    final int n18 = n9 - n10;
                    final int n19 = n11 - n10;
                    final int n20 = n12 - n13;
                    final int n21 = n14 - n13;
                    final int n22 = n15 - n16;
                    final int n23 = n17 - n16;
                    if (n10 * (n20 * n23 - n22 * n21) + n13 * (n22 * n19 - n18 * n23) + n16 * (n18 * n21 - n20 * n19) > 0) {
                        Model.field2169[j] = true;
                        final int n24 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + this.radius;
                        final char[] array = Model.field2178[n24];
                        final char[] field2195 = Model.field2195;
                        final int n25 = n24;
                        final char c = field2195[n25];
                        field2195[n25] = (char)(c + '\u0001');
                        array[c] = (char)j;
                    }
                }
                else {
                    if (b2) {
                        final int n26 = Model.modelViewportYs[n3];
                        final int n27 = Model.modelViewportYs[n4];
                        final int n28 = Model.modelViewportYs[n5];
                        final int n29 = 148198745 * ViewportMouse.ViewportMouse_y + n2;
                        int n30;
                        if (n29 < n26 && n29 < n27 && n29 < n28) {
                            n30 = 0;
                        }
                        else {
                            final int n31 = ViewportMouse.ViewportMouse_y * 148198745 - n2;
                            if (n31 > n26 && n31 > n27 && n31 > n28) {
                                n30 = 0;
                            }
                            else {
                                final int n32 = n2 + ViewportMouse.ViewportMouse_x * 2139535413;
                                if (n32 < n6 && n32 < n7 && n32 < n8) {
                                    n30 = 0;
                                }
                                else {
                                    final int n33 = ViewportMouse.ViewportMouse_x * 2139535413 - n2;
                                    if (n33 > n6 && n33 > n7 && n33 > n8) {
                                        n30 = 0;
                                    }
                                    else {
                                        n30 = 1;
                                    }
                                }
                            }
                        }
                        if (n30 != 0) {
                            GraphicsObject.method429(n);
                            b2 = false;
                        }
                    }
                    if ((n6 - n7) * (Model.modelViewportYs[n5] - Model.modelViewportYs[n4]) - (Model.modelViewportYs[n3] - Model.modelViewportYs[n4]) * (n8 - n7) > 0) {
                        Model.field2169[j] = false;
                        final int method20 = class6.method20(-2024317984);
                        if (n6 >= 0 && n7 >= 0 && n8 >= 0 && n6 <= method20 && n7 <= method20 && n8 <= method20) {
                            Model.field2168[j] = false;
                        }
                        else {
                            Model.field2168[j] = true;
                        }
                        final int n34 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + this.radius;
                        final char[] array2 = Model.field2178[n34];
                        final char[] field2196 = Model.field2195;
                        final int n35 = n34;
                        final char c2 = field2196[n35];
                        field2196[n35] = (char)(c2 + '\u0001');
                        array2[c2] = (char)j;
                    }
                }
            }
        }
        if (this.faceAlphas == null) {
            for (int k = this.diameter - 1; k >= 0; --k) {
                final char c3 = Model.field2195[k];
                if (c3 > '\0') {
                    final char[] array3 = Model.field2178[k];
                    for (char c4 = '\0'; c4 < c3; ++c4) {
                        this.drawFace(array3[c4]);
                    }
                }
            }
            return;
        }
        for (int l = 0; l < 12; ++l) {
            Model.field2179[l] = 0;
            Model.field2183[l] = 0;
        }
        for (int n36 = this.diameter - 1; n36 >= 0; --n36) {
            final char c5 = Model.field2195[n36];
            if (c5 > '\0') {
                final char[] array4 = Model.field2178[n36];
                for (char c6 = '\0'; c6 < c5; ++c6) {
                    final char c7 = array4[c6];
                    final byte b4 = this.faceAlphas[c7];
                    final int n37 = Model.field2179[b4]++;
                    Model.field2145[b4][n37] = c7;
                    if (b4 < 10) {
                        final int[] field2197 = Model.field2183;
                        final byte b5 = b4;
                        field2197[b5] += n36;
                    }
                    else if (b4 == 10) {
                        Model.field2181[n37] = n36;
                    }
                    else {
                        Model.field2182[n37] = n36;
                    }
                }
            }
        }
        int n38 = 0;
        if (Model.field2179[1] > 0 || Model.field2179[2] > 0) {
            n38 = (Model.field2183[1] + Model.field2183[2]) / (Model.field2179[1] + Model.field2179[2]);
        }
        int n39 = 0;
        if (Model.field2179[3] > 0 || Model.field2179[4] > 0) {
            n39 = (Model.field2183[3] + Model.field2183[4]) / (Model.field2179[3] + Model.field2179[4]);
        }
        int n40 = 0;
        if (Model.field2179[6] > 0 || Model.field2179[8] > 0) {
            n40 = (Model.field2183[6] + Model.field2183[8]) / (Model.field2179[6] + Model.field2179[8]);
        }
        int n41 = 0;
        int n42 = Model.field2179[10];
        int[] array5 = Model.field2145[10];
        int[] array6 = Model.field2181;
        if (n41 == n42) {
            n41 = 0;
            n42 = Model.field2179[11];
            array5 = Model.field2145[11];
            array6 = Model.field2182;
        }
        int n43;
        if (n41 < n42) {
            n43 = array6[n41];
        }
        else {
            n43 = -1000;
        }
        for (int n44 = 0; n44 < 10; ++n44) {
            while (n44 == 0 && n43 > n38) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            while (n44 == 3 && n43 > n39) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            while (n44 == 5 && n43 > n40) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            final int n45 = Model.field2179[n44];
            final int[] array7 = Model.field2145[n44];
            for (int n46 = 0; n46 < n45; ++n46) {
                this.drawFace(array7[n46]);
            }
        }
        while (n43 != -1000) {
            this.drawFace(array5[n41++]);
            if (n41 == n42 && array5 != Model.field2145[11]) {
                n41 = 0;
                array5 = Model.field2145[11];
                n42 = Model.field2179[11];
                array6 = Model.field2182;
            }
            if (n41 < n42) {
                n43 = array6[n41];
            }
            else {
                n43 = -1000;
            }
        }
    }
    
    public void ca() {
        if (this.boundsType == 1) {
            return;
        }
        this.boundsType = 1;
        this.et = 0;
        this.bottomY = 0;
        this.xzRadius = 0;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            final int bottomY = this.verticesY[i];
            final int n2 = this.verticesZ[i];
            if (-bottomY > this.et * 1550732737) {
                this.et = -bottomY * -644693439;
            }
            if (bottomY > this.bottomY) {
                this.bottomY = bottomY;
            }
            final int xzRadius = n * n + n2 * n2;
            if (xzRadius > this.xzRadius) {
                this.xzRadius = xzRadius;
            }
        }
        this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
        this.radius = (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.et * 1550732737 * (this.et * 1550732737)) + 0.99);
        this.diameter = this.radius + (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY) + 0.99);
    }
    
    public void method1322(final Frames frames, final int n, final int[] array, final boolean b) {
        if (array == null) {
            ug(this, frames, n);
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        int n2 = 0;
        int n3 = array[n2++];
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            int j;
            for (j = animation.transformSkeletonLabels[i]; j > n3; n3 = array[n2++]) {}
            if (b) {
                if (j == n3 || skeleton.transformTypes[j] == 0) {
                    this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
                }
            }
            else if (j != n3 || skeleton.transformTypes[j] == 0) {
                this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
            }
        }
    }
    
    void cd(final class219 class219, final int n) {
        this.method1319(class219, n);
    }
    
    public void ba(final Model model) {
        if (model == null) {
            return;
        }
        vw(this, model);
        for (int i = 0; i < model.indicesCount; ++i) {
            this.indices1[this.indicesCount] = model.indices1[i] + this.verticesCount;
            this.indices2[this.indicesCount] = model.indices2[i] + this.verticesCount;
            this.indices3[this.indicesCount] = model.indices3[i] + this.verticesCount;
            this.faceColors1[this.indicesCount] = model.faceColors1[i];
            this.faceColors2[this.indicesCount] = model.faceColors2[i];
            this.faceColors3[this.indicesCount] = model.faceColors3[i];
            if (this.faceAlphas != null) {
                this.faceAlphas[this.indicesCount] = ((model.faceAlphas != null) ? model.faceAlphas[i] : model.field2152);
            }
            if (this.field2154 != null && model.field2154 != null) {
                this.field2154[this.indicesCount] = model.field2154[i];
            }
            if (this.faceTextures != null) {
                this.faceTextures[this.indicesCount] = (short)((model.faceTextures != null) ? model.faceTextures[i] : -1);
            }
            if (this.faceRenderPriorities != null) {
                if (model.faceRenderPriorities != null && model.faceRenderPriorities[i] != -1) {
                    this.faceRenderPriorities[this.indicesCount] = (byte)(model.faceRenderPriorities[i] + this.field2153);
                }
                else {
                    this.faceRenderPriorities[this.indicesCount] = -1;
                }
            }
            ++this.indicesCount;
        }
        for (int j = 0; j < model.field2153; ++j) {
            this.field2199[this.field2153] = model.field2199[j] + this.verticesCount;
            this.field2155[this.field2153] = model.field2155[j] + this.verticesCount;
            this.field2187[this.field2153] = model.field2187[j] + this.verticesCount;
            ++this.field2153;
        }
        for (int k = 0; k < model.verticesCount; ++k) {
            this.verticesX[this.verticesCount] = model.verticesX[k];
            this.verticesY[this.verticesCount] = model.verticesY[k];
            this.verticesZ[this.verticesCount] = model.verticesZ[k];
            ++this.verticesCount;
        }
    }
    
    void transform(final int n, final int[] array, final int model_transformTempX, final int model_transformTempY, final int model_transformTempZ) {
        final int length = array.length;
        if (n == 0) {
            int n2 = 0;
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            for (final int n3 : array) {
                if (n3 < this.vertexLabels.length) {
                    final int[] array2 = this.vertexLabels[n3];
                    for (int j = 0; j < array2.length; ++j) {
                        final int n4 = array2[j];
                        Model.Model_transformTempX += this.verticesX[n4];
                        Model.Model_transformTempY += this.verticesY[n4];
                        Model.Model_transformTempZ += this.verticesZ[n4];
                        ++n2;
                    }
                }
            }
            if (n2 > 0) {
                Model.Model_transformTempX = Model.Model_transformTempX / n2 + model_transformTempX;
                Model.Model_transformTempY = Model.Model_transformTempY / n2 + model_transformTempY;
                Model.Model_transformTempZ = Model.Model_transformTempZ / n2 + model_transformTempZ;
            }
            else {
                Model.Model_transformTempX = model_transformTempX;
                Model.Model_transformTempY = model_transformTempY;
                Model.Model_transformTempZ = model_transformTempZ;
            }
            return;
        }
        if (n == 1) {
            for (final int n5 : array) {
                if (n5 < this.vertexLabels.length) {
                    final int[] array3 = this.vertexLabels[n5];
                    for (int l = 0; l < array3.length; ++l) {
                        final int n6 = array3[l];
                        final int[] verticesX = this.verticesX;
                        final int n7 = n6;
                        verticesX[n7] += model_transformTempX;
                        final int[] verticesY = this.verticesY;
                        final int n8 = n6;
                        verticesY[n8] += model_transformTempY;
                        final int[] verticesZ = this.verticesZ;
                        final int n9 = n6;
                        verticesZ[n9] += model_transformTempZ;
                    }
                }
            }
            return;
        }
        if (n == 2) {
            for (final int n11 : array) {
                if (n11 < this.vertexLabels.length) {
                    final int[] array4 = this.vertexLabels[n11];
                    for (int n12 = 0; n12 < array4.length; ++n12) {
                        final int n13 = array4[n12];
                        final int[] verticesX2 = this.verticesX;
                        final int n14 = n13;
                        verticesX2[n14] -= Model.Model_transformTempX;
                        final int[] verticesY2 = this.verticesY;
                        final int n15 = n13;
                        verticesY2[n15] -= Model.Model_transformTempY;
                        final int[] verticesZ2 = this.verticesZ;
                        final int n16 = n13;
                        verticesZ2[n16] -= Model.Model_transformTempZ;
                        final int n17 = (model_transformTempX & 0xFF) * 8;
                        final int n18 = (model_transformTempY & 0xFF) * 8;
                        final int n19 = (model_transformTempZ & 0xFF) * 8;
                        if (n19 != 0) {
                            final int n20 = Model.field2192[n19];
                            final int n21 = Model.field2132[n19];
                            final int n22 = this.verticesY[n13] * n20 + this.verticesX[n13] * n21 >> 16;
                            this.verticesY[n13] = this.verticesY[n13] * n21 - this.verticesX[n13] * n20 >> 16;
                            this.verticesX[n13] = n22;
                        }
                        if (n17 != 0) {
                            final int n23 = Model.field2192[n17];
                            final int n24 = Model.field2132[n17];
                            final int n25 = this.verticesY[n13] * n24 - this.verticesZ[n13] * n23 >> 16;
                            this.verticesZ[n13] = this.verticesY[n13] * n23 + this.verticesZ[n13] * n24 >> 16;
                            this.verticesY[n13] = n25;
                        }
                        if (n18 != 0) {
                            final int n26 = Model.field2192[n18];
                            final int n27 = Model.field2132[n18];
                            final int n28 = this.verticesZ[n13] * n26 + this.verticesX[n13] * n27 >> 16;
                            this.verticesZ[n13] = this.verticesZ[n13] * n27 - this.verticesX[n13] * n26 >> 16;
                            this.verticesX[n13] = n28;
                        }
                        final int[] verticesX3 = this.verticesX;
                        final int n29 = n13;
                        verticesX3[n29] += Model.Model_transformTempX;
                        final int[] verticesY3 = this.verticesY;
                        final int n30 = n13;
                        verticesY3[n30] += Model.Model_transformTempY;
                        final int[] verticesZ3 = this.verticesZ;
                        final int n31 = n13;
                        verticesZ3[n31] += Model.Model_transformTempZ;
                    }
                }
            }
            return;
        }
        if (n == 3) {
            for (final int n33 : array) {
                if (n33 < this.vertexLabels.length) {
                    final int[] array5 = this.vertexLabels[n33];
                    for (int n34 = 0; n34 < array5.length; ++n34) {
                        final int n35 = array5[n34];
                        final int[] verticesX4 = this.verticesX;
                        final int n36 = n35;
                        verticesX4[n36] -= Model.Model_transformTempX;
                        final int[] verticesY4 = this.verticesY;
                        final int n37 = n35;
                        verticesY4[n37] -= Model.Model_transformTempY;
                        final int[] verticesZ4 = this.verticesZ;
                        final int n38 = n35;
                        verticesZ4[n38] -= Model.Model_transformTempZ;
                        this.verticesX[n35] = this.verticesX[n35] * model_transformTempX / 128;
                        this.verticesY[n35] = this.verticesY[n35] * model_transformTempY / 128;
                        this.verticesZ[n35] = this.verticesZ[n35] * model_transformTempZ / 128;
                        final int[] verticesX5 = this.verticesX;
                        final int n39 = n35;
                        verticesX5[n39] += Model.Model_transformTempX;
                        final int[] verticesY5 = this.verticesY;
                        final int n40 = n35;
                        verticesY5[n40] += Model.Model_transformTempY;
                        final int[] verticesZ5 = this.verticesZ;
                        final int n41 = n35;
                        verticesZ5[n41] += Model.Model_transformTempZ;
                    }
                }
            }
            return;
        }
        if (n == 5) {
            if (this.faceLabelsAlpha != null && this.field2154 != null) {
                for (final int n43 : array) {
                    if (n43 < this.faceLabelsAlpha.length) {
                        final int[] array6 = this.faceLabelsAlpha[n43];
                        for (int n44 = 0; n44 < array6.length; ++n44) {
                            final int n45 = array6[n44];
                            int n46 = (this.field2154[n45] & 0xFF) + model_transformTempX * 8;
                            if (n46 < 0) {
                                n46 = 0;
                            }
                            else if (n46 > 255) {
                                n46 = 255;
                            }
                            this.field2154[n45] = (byte)n46;
                        }
                    }
                }
            }
        }
    }
    
    public int cr() {
        this.calculateBoundsCylinder();
        return this.xzRadius;
    }
    
    public Model ce(final boolean b) {
        if (!b && Model.Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
            Model.Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(b, Model.Model_sharedSpotAnimationModel, Model.Model_sharedSpotAnimationModelFaceAlphas);
    }
    
    public void rotateY270Ccw() {
        for (int i = 0; i < this.ln; ++i) {
            final int n = this.faceColors2[i];
            this.verticesX[i] = this.verticesY[i];
            this.verticesY[i] = -n;
        }
        dv(this);
    }
    
    public void rotateY270Ccw(final boolean b, final Model model, final byte[] array) {
        model.oy = this.oy;
        model.ez = this.ez;
        model.en = this.en;
    }
    
    public void cb() {
        this.boundsType = 0;
        this.aabb.clear();
    }
    
    public void da(final int n) {
        final int n2 = Model.field2192[n];
        final int n3 = Model.field2132[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n4 = this.verticesY[i] * n3 - this.verticesZ[i] * n2 >> 16;
            this.verticesZ[i] = this.verticesY[i] * n2 + this.verticesZ[i] * n3 >> 16;
            this.verticesY[i] = n4;
        }
        dv(this);
    }
    
    public void to() {
        dv(this);
    }
    
    public Model ta(final int n, final int n2, final int n3) {
        this.scale(n, n2, n3);
        return this;
    }
    
    public void ch(final class133 class133, final int n) {
        final Skeleton field1280 = class133.field1280;
        if (Skeleton.kz(field1280, -660221315) != null) {
            Skeleton.kz(field1280, 857270537).method1221(class133, n, 113796429);
            this.ee(Skeleton.kz(field1280, 923000785), class133.method773(-2122387614));
        }
        if (class133.method770(1713081171)) {
            this.method1325(class133, n);
        }
        dv(this);
    }
    
    public final void el(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (this.boundsType != 2 && this.boundsType != 1) {
            this.method1341();
        }
        final int clipMidX = TaskHandler.getClipMidX(679539611);
        final int clipMidY = class12.getClipMidY(141339267);
        final int n9 = Model.field2192[n];
        final int n10 = Model.field2132[n];
        final int n11 = Model.field2192[n2];
        final int n12 = Model.field2132[n2];
        final int n13 = Model.field2192[n3];
        final int n14 = Model.field2132[n3];
        final int n15 = Model.field2192[n4];
        final int n16 = Model.field2132[n4];
        final int n17 = n6 * n15 + n7 * n16 >> 16;
        for (int i = 0; i < this.verticesCount; ++i) {
            int n18 = this.verticesX[i];
            int n19 = this.verticesY[i];
            int n20 = this.verticesZ[i];
            if (n3 != 0) {
                final int n21 = n19 * n13 + n18 * n14 >> 16;
                n19 = n19 * n14 - n18 * n13 >> 16;
                n18 = n21;
            }
            if (n != 0) {
                final int n22 = n19 * n10 - n20 * n9 >> 16;
                n20 = n19 * n9 + n20 * n10 >> 16;
                n19 = n22;
            }
            if (n2 != 0) {
                final int n23 = n20 * n11 + n18 * n12 >> 16;
                n20 = n20 * n12 - n18 * n11 >> 16;
                n18 = n23;
            }
            final int n24 = n18 + n5;
            final int n25 = n19 + n6;
            final int n26 = n20 + n7;
            final int n27 = n25 * n16 - n26 * n15 >> 16;
            final int n28 = n25 * n15 + n26 * n16 >> 16;
            final int n29 = n27;
            Model.field2173[i] = n28 - n17;
            Model.modelViewportXs[i] = clipMidX + n24 * UserComparator7.get3dZoom(-1989528605) / n8;
            Model.modelViewportYs[i] = clipMidY + n29 * UserComparator7.get3dZoom(-1563824813) / n8;
            Model.field2172[i] = NPC.method609(n8, 251841264);
            if (this.field2153 > 0) {
                Model.field2161[i] = n24;
                Model.field2175[i] = n29;
                Model.field2200[i] = n28;
            }
        }
        try {
            this.draw0(false, false, false, 0L);
        }
        catch (Exception ex) {}
    }
    
    void cl() {
        if (this.boundsType == 2) {
            return;
        }
        this.boundsType = 2;
        this.xzRadius = 0;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            final int n2 = this.verticesY[i];
            final int n3 = this.verticesZ[i];
            final int xzRadius = n * n + n3 * n3 + n2 * n2;
            if (xzRadius > this.xzRadius) {
                this.xzRadius = xzRadius;
            }
        }
        this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
        this.radius = this.xzRadius;
        this.diameter = this.xzRadius + this.xzRadius;
    }
    
    void cn(final int n) {
        if (this.aabb.containsKey(n)) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        final int n8 = Model.field2132[n];
        final int n9 = Model.field2192[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            final int vmethod3254 = class143.vmethod3254(this.verticesX[i], this.verticesZ[i], n8, n9, (byte)(-31));
            final int n10 = this.verticesY[i];
            final int addMember = ClanChannel.addMember(this.verticesX[i], this.verticesZ[i], n8, n9, (byte)43);
            if (vmethod3254 < n2) {
                n2 = vmethod3254;
            }
            if (vmethod3254 > n5) {
                n5 = vmethod3254;
            }
            if (n10 < n3) {
                n3 = n10;
            }
            if (n10 > n6) {
                n6 = n10;
            }
            if (addMember < n4) {
                n4 = addMember;
            }
            if (addMember > n7) {
                n7 = addMember;
            }
        }
        final AABB value = new AABB((n5 + n2) / 2, (n6 + n3) / 2, (n7 + n4) / 2, (n5 - n2 + 1) / 2, (n6 - n3 + 1) / 2, (n7 - n4 + 1) / 2);
        if (value.xMid * -1923653815 < -107742183) {
            value.xMid = -889692384;
        }
        if (value.yMidOffset * -452185969 < -963310703) {
            value.yMidOffset = -1624052030;
        }
        if (this.isSingleTile) {
            final AABB aabb = value;
            aabb.xMid -= 1749513468;
            final AABB aabb2 = value;
            aabb2.yMidOffset += 175600504;
        }
        this.aabb.put(n, value);
    }
    
    public static void pn(final Model model, final Frames frames, final int n) {
        if (model.vertexLabels == null) {
            return;
        }
        if (n == -1) {
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            final int n2 = animation.transformSkeletonLabels[i];
            model.transform(skeleton.transformTypes[n2], skeleton.labels[n2], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
        }
        dv(model);
    }
    
    public static void ld(final Model model, final int n, final int[] array, final int model_transformTempX, final int model_transformTempY, final int model_transformTempZ) {
        if (model == null) {
            model.el(n, n, n, n, n, n, n, n);
        }
        final int length = array.length;
        if (n == 0) {
            int n2 = 0;
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            for (final int n3 : array) {
                if (n3 < model.vertexLabels.length) {
                    final int[] array2 = model.vertexLabels[n3];
                    for (int j = 0; j < array2.length; ++j) {
                        final int n4 = array2[j];
                        Model.Model_transformTempX += model.verticesX[n4];
                        Model.Model_transformTempY += model.verticesY[n4];
                        Model.Model_transformTempZ += model.verticesZ[n4];
                        ++n2;
                    }
                }
            }
            if (n2 > 0) {
                Model.Model_transformTempX = Model.Model_transformTempX / n2 + model_transformTempX;
                Model.Model_transformTempY = Model.Model_transformTempY / n2 + model_transformTempY;
                Model.Model_transformTempZ = Model.Model_transformTempZ / n2 + model_transformTempZ;
            }
            else {
                Model.Model_transformTempX = model_transformTempX;
                Model.Model_transformTempY = model_transformTempY;
                Model.Model_transformTempZ = model_transformTempZ;
            }
            return;
        }
        if (n == 1) {
            for (final int n5 : array) {
                if (n5 < model.vertexLabels.length) {
                    final int[] array3 = model.vertexLabels[n5];
                    for (int l = 0; l < array3.length; ++l) {
                        final int n6 = array3[l];
                        final int[] verticesX = model.verticesX;
                        final int n7 = n6;
                        verticesX[n7] += model_transformTempX;
                        final int[] verticesY = model.verticesY;
                        final int n8 = n6;
                        verticesY[n8] += model_transformTempY;
                        final int[] verticesZ = model.verticesZ;
                        final int n9 = n6;
                        verticesZ[n9] += model_transformTempZ;
                    }
                }
            }
            return;
        }
        if (n == 2) {
            for (final int n11 : array) {
                if (n11 < model.vertexLabels.length) {
                    final int[] array4 = model.vertexLabels[n11];
                    for (int n12 = 0; n12 < array4.length; ++n12) {
                        final int n13 = array4[n12];
                        final int[] verticesX2 = model.verticesX;
                        final int n14 = n13;
                        verticesX2[n14] -= Model.Model_transformTempX;
                        final int[] verticesY2 = model.verticesY;
                        final int n15 = n13;
                        verticesY2[n15] -= Model.Model_transformTempY;
                        final int[] verticesZ2 = model.verticesZ;
                        final int n16 = n13;
                        verticesZ2[n16] -= Model.Model_transformTempZ;
                        final int n17 = (model_transformTempX & 0xFF) * 8;
                        final int n18 = (model_transformTempY & 0xFF) * 8;
                        final int n19 = (model_transformTempZ & 0xFF) * 8;
                        if (n19 != 0) {
                            final int n20 = Model.field2192[n19];
                            final int n21 = Model.field2132[n19];
                            final int n22 = model.verticesY[n13] * n20 + model.verticesX[n13] * n21 >> 16;
                            model.verticesY[n13] = model.verticesY[n13] * n21 - model.verticesX[n13] * n20 >> 16;
                            model.verticesX[n13] = n22;
                        }
                        if (n17 != 0) {
                            final int n23 = Model.field2192[n17];
                            final int n24 = Model.field2132[n17];
                            final int n25 = model.verticesY[n13] * n24 - model.verticesZ[n13] * n23 >> 16;
                            model.verticesZ[n13] = model.verticesY[n13] * n23 + model.verticesZ[n13] * n24 >> 16;
                            model.verticesY[n13] = n25;
                        }
                        if (n18 != 0) {
                            final int n26 = Model.field2192[n18];
                            final int n27 = Model.field2132[n18];
                            final int n28 = model.verticesZ[n13] * n26 + model.verticesX[n13] * n27 >> 16;
                            model.verticesZ[n13] = model.verticesZ[n13] * n27 - model.verticesX[n13] * n26 >> 16;
                            model.verticesX[n13] = n28;
                        }
                        final int[] verticesX3 = model.verticesX;
                        final int n29 = n13;
                        verticesX3[n29] += Model.Model_transformTempX;
                        final int[] verticesY3 = model.verticesY;
                        final int n30 = n13;
                        verticesY3[n30] += Model.Model_transformTempY;
                        final int[] verticesZ3 = model.verticesZ;
                        final int n31 = n13;
                        verticesZ3[n31] += Model.Model_transformTempZ;
                    }
                }
            }
            return;
        }
        if (n == 3) {
            for (final int n33 : array) {
                if (n33 < model.vertexLabels.length) {
                    final int[] array5 = model.vertexLabels[n33];
                    for (int n34 = 0; n34 < array5.length; ++n34) {
                        final int n35 = array5[n34];
                        final int[] verticesX4 = model.verticesX;
                        final int n36 = n35;
                        verticesX4[n36] -= Model.Model_transformTempX;
                        final int[] verticesY4 = model.verticesY;
                        final int n37 = n35;
                        verticesY4[n37] -= Model.Model_transformTempY;
                        final int[] verticesZ4 = model.verticesZ;
                        final int n38 = n35;
                        verticesZ4[n38] -= Model.Model_transformTempZ;
                        model.verticesX[n35] = model.verticesX[n35] * model_transformTempX / 128;
                        model.verticesY[n35] = model.verticesY[n35] * model_transformTempY / 128;
                        model.verticesZ[n35] = model.verticesZ[n35] * model_transformTempZ / 128;
                        final int[] verticesX5 = model.verticesX;
                        final int n39 = n35;
                        verticesX5[n39] += Model.Model_transformTempX;
                        final int[] verticesY5 = model.verticesY;
                        final int n40 = n35;
                        verticesY5[n40] += Model.Model_transformTempY;
                        final int[] verticesZ5 = model.verticesZ;
                        final int n41 = n35;
                        verticesZ5[n41] += Model.Model_transformTempZ;
                    }
                }
            }
            return;
        }
        if (n == 5) {
            if (model.faceLabelsAlpha != null && model.field2154 != null) {
                for (final int n43 : array) {
                    if (n43 < model.faceLabelsAlpha.length) {
                        final int[] array6 = model.faceLabelsAlpha[n43];
                        for (int n44 = 0; n44 < array6.length; ++n44) {
                            final int n45 = array6[n44];
                            int n46 = (model.field2154[n45] & 0xFF) + model_transformTempX * 8;
                            if (n46 < 0) {
                                n46 = 0;
                            }
                            else if (n46 > 255) {
                                n46 = 255;
                            }
                            model.field2154[n45] = (byte)n46;
                        }
                    }
                }
            }
        }
    }
    
    public void db() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.verticesX[i] = -this.verticesX[i];
            this.verticesZ[i] = -this.verticesZ[i];
        }
        dv(this);
    }
    
    public Model bw(final boolean b) {
        if (!b && Model.Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
            Model.Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(b, Model.Model_sharedSpotAnimationModel, Model.Model_sharedSpotAnimationModelFaceAlphas);
    }
    
    void cf() {
        if (this.boundsType == 2) {
            return;
        }
        this.boundsType = 2;
        this.xzRadius = 0;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            final int n2 = this.verticesY[i];
            final int n3 = this.verticesZ[i];
            final int xzRadius = n * n + n3 * n3 + n2 * n2;
            if (xzRadius > this.xzRadius) {
                this.xzRadius = xzRadius;
            }
        }
        this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
        this.radius = this.xzRadius;
        this.diameter = this.xzRadius + this.xzRadius;
    }
    
    public void dn(final Model[] array, final int n) {
        this.un();
    }
    
    public void dn() {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesZ[i];
            this.verticesZ[i] = this.verticesX[i];
            this.verticesX[i] = -n;
        }
        dv(this);
    }
    
    public int cv() {
        this.calculateBoundsCylinder();
        return this.xzRadius;
    }
    
    Model buildSharedModel(final boolean b, final Model model, final byte[] field2154) {
        this.rotateY270Ccw(b, model, field2154);
        model.verticesCount = this.verticesCount;
        model.indicesCount = this.indicesCount;
        model.field2153 = this.field2153;
        if (model.verticesX == null || model.verticesX.length < this.verticesCount) {
            model.verticesX = new int[this.verticesCount + 100];
            model.verticesY = new int[this.verticesCount + 100];
            model.verticesZ = new int[this.verticesCount + 100];
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            model.verticesX[i] = this.verticesX[i];
            model.verticesY[i] = this.verticesY[i];
            model.verticesZ[i] = this.verticesZ[i];
        }
        if (b) {
            model.field2154 = this.field2154;
        }
        else {
            model.field2154 = field2154;
            if (this.field2154 == null) {
                for (int j = 0; j < this.indicesCount; ++j) {
                    model.field2154[j] = 0;
                }
            }
            else {
                for (int k = 0; k < this.indicesCount; ++k) {
                    model.field2154[k] = this.field2154[k];
                }
            }
        }
        model.indices1 = this.indices1;
        model.indices2 = this.indices2;
        model.indices3 = this.indices3;
        model.faceColors1 = this.faceColors1;
        model.faceColors2 = this.faceColors2;
        model.faceColors3 = this.faceColors3;
        model.faceAlphas = this.faceAlphas;
        model.faceRenderPriorities = this.faceRenderPriorities;
        model.faceTextures = this.faceTextures;
        model.field2152 = this.field2152;
        model.field2199 = this.field2199;
        model.field2155 = this.field2155;
        model.field2187 = this.field2187;
        model.vertexLabels = this.vertexLabels;
        model.faceLabelsAlpha = this.faceLabelsAlpha;
        model.field2156 = this.field2156;
        model.field2160 = this.field2160;
        model.isSingleTile = this.isSingleTile;
        dv(model);
        model.overrideAmount = 0;
        return model;
    }
    
    public static void ft(final Model model, final Skeleton skeleton, final class133 class133, final int n, final boolean[] array, final boolean b, final boolean b2) {
        if (model == null) {
            model.method1341();
            return;
        }
        final class219 kz = Skeleton.kz(skeleton, 761976567);
        if (kz != null) {
            kz.method1222(class133, n, array, b, -2123682677);
            if (b2) {
                model.ee(kz, class133.method773(-1850731737));
            }
        }
        if (!b && class133.method770(1713081171)) {
            model.method1325(class133, n);
        }
    }
    
    public Model contourGround(final int[][] array, final int n, final int n2, final int n3, final boolean b, final int n4) {
        this.calculateBoundsCylinder();
        final int n5 = n - this.xzRadius;
        final int n6 = n + this.xzRadius;
        final int n7 = n3 - this.xzRadius;
        final int n8 = n3 + this.xzRadius;
        if (n5 < 0 || n6 + 128 >> 7 >= array.length || n7 < 0 || n8 + 128 >> 7 >= array[0].length) {
            return this;
        }
        final int n9 = n5 >> 7;
        final int n10 = n6 + 127 >> 7;
        final int n11 = n7 >> 7;
        final int n12 = n8 + 127 >> 7;
        if (array[n9][n11] == n2 && array[n10][n11] == n2 && array[n9][n12] == n2 && array[n10][n12] == n2) {
            return this;
        }
        Model model;
        if (b) {
            model = new Model();
            model.verticesCount = this.verticesCount;
            model.indicesCount = this.indicesCount;
            model.field2153 = this.field2153;
            model.verticesX = this.verticesX;
            model.verticesZ = this.verticesZ;
            model.indices1 = this.indices1;
            model.indices2 = this.indices2;
            model.indices3 = this.indices3;
            model.faceColors1 = this.faceColors1;
            model.faceColors2 = this.faceColors2;
            model.faceColors3 = this.faceColors3;
            model.faceAlphas = this.faceAlphas;
            model.field2154 = this.field2154;
            model.faceRenderPriorities = this.faceRenderPriorities;
            model.faceTextures = this.faceTextures;
            model.field2152 = this.field2152;
            model.field2199 = this.field2199;
            model.field2155 = this.field2155;
            model.field2187 = this.field2187;
            model.vertexLabels = this.vertexLabels;
            model.faceLabelsAlpha = this.faceLabelsAlpha;
            model.isSingleTile = this.isSingleTile;
            model.verticesY = new int[model.verticesCount];
        }
        else {
            model = this;
        }
        if (n4 == 0) {
            for (int i = 0; i < model.verticesCount; ++i) {
                final int n13 = this.verticesX[i] + n;
                final int n14 = this.verticesZ[i] + n3;
                final int n15 = n13 & 0x7F;
                final int n16 = n14 & 0x7F;
                final int n17 = n13 >> 7;
                final int n18 = n14 >> 7;
                model.verticesY[i] = this.verticesY[i] + ((array[n17][n18] * (128 - n15) + array[n17 + 1][n18] * n15 >> 7) * (128 - n16) + (array[n17][n18 + 1] * (128 - n15) + array[n17 + 1][n18 + 1] * n15 >> 7) * n16 >> 7) - n2;
            }
        }
        else {
            for (int j = 0; j < model.verticesCount; ++j) {
                final int n19 = (-this.verticesY[j] << 16) / (this.et * 1550732737);
                if (n19 < n4) {
                    final int n20 = this.verticesX[j] + n;
                    final int n21 = this.verticesZ[j] + n3;
                    final int n22 = n20 & 0x7F;
                    final int n23 = n21 & 0x7F;
                    final int n24 = n20 >> 7;
                    final int n25 = n21 >> 7;
                    model.verticesY[j] = this.verticesY[j] + (((array[n24][n25] * (128 - n22) + array[n24 + 1][n25] * n22 >> 7) * (128 - n23) + (array[n24][n25 + 1] * (128 - n22) + array[n24 + 1][n25 + 1] * n22 >> 7) * n23 >> 7) - n2) * (n4 - n19) / n4;
                }
            }
        }
        dv(model);
        return model;
    }
    
    public void animate2(final Frames frames, final int n, final Frames frames2, final int n2, final int[] array) {
        if (n == -1) {
            return;
        }
        if (array != null && n2 != -1) {
            final Animation animation = frames.frames[n];
            final Animation animation2 = frames2.frames[n2];
            final Skeleton skeleton = animation.skeleton;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            Model.Model_transformTempZ = 0;
            int n3 = 0;
            int n4 = array[n3++];
            for (int i = 0; i < animation.transformCount; ++i) {
                int j;
                for (j = animation.transformYs[i]; j > n4; n4 = array[n3++]) {}
                if (j != n4 || skeleton.transformTypes[j] == 0) {
                    this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformYs[i]);
                }
            }
            Model.Model_transformTempX = 0;
            Model.Model_transformTempZ = 0;
            Model.Model_transformTempX = 0;
            int n5 = 0;
            int n6 = array[n5++];
            for (int k = 0; k < animation2.transformCount; ++k) {
                int l;
                for (l = animation2.transformXs[k]; l > n6; n6 = array[n5++]) {}
                if (l == n6 || skeleton.transformTypes[l] == 0) {
                    this.transform(skeleton.transformTypes[l], skeleton.labels[l], animation2.transformZs[k], animation2.transformYs[k], animation2.transformSkeletonLabels[k]);
                }
            }
            dv(this);
            return;
        }
        ug(this, frames, n);
    }
    
    public void resetBounds() {
        this.bottomY = 0;
        this.aabb.clear();
    }
    
    public Model tc(final int n, final int n2, final int n3) {
        this.offsetBy(n, n2, n3);
        return this;
    }
    
    void dw(final class219 class219, final int n) {
        if (this.field2156 == null) {
            return;
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            final int[] array = this.field2156[i];
            if (array != null) {
                if (array.length != 0) {
                    final int[] array2 = this.field2160[i];
                    Model.field2134.method2251(1409705591);
                    for (int j = 0; j < array.length; ++j) {
                        final class122 yb = class219.yb(class219, array[j], (byte)(-51));
                        if (yb != null) {
                            Model.field2135.method2253(array2[j] / 255.0f, 268353901);
                            Model.field2136.method2252(yb.method728(n, -1051625794), 1907037909);
                            Model.field2136.method2255(Model.field2135, 1549525824);
                            class425.am(Model.field2134, Model.field2136, -2045482558);
                        }
                    }
                    this.method1326(i, Model.field2134);
                }
            }
        }
    }
    
    public void cj(final Frames frames, final int n) {
        if (this.vertexLabels == null) {
            return;
        }
        if (n == -1) {
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            final int n2 = animation.transformSkeletonLabels[i];
            this.transform(skeleton.transformTypes[n2], skeleton.labels[n2], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
        }
        dv(this);
    }
    
    public void offsetBy(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int[] verticesX = this.verticesX;
            final int n4 = i;
            verticesX[n4] += n;
            final int[] verticesY = this.verticesY;
            final int n5 = i;
            verticesY[n5] += n2;
            final int[] verticesZ = this.verticesZ;
            final int n6 = i;
            verticesZ[n6] += n3;
        }
        dv(this);
    }
    
    void cp(final class133 class133, final int n) {
        final Skeleton field1280 = class133.field1280;
        for (int i = 0; i < field1280.count * 859454199; ++i) {
            if (field1280.transformTypes[i] == 5 && class133.field1282 != null && class133.field1282[i] != null && class133.field1282[i][0] != null && this.faceLabelsAlpha != null && this.field2154 != null) {
                final class125 class134 = class133.field1282[i][0];
                for (final int n2 : field1280.labels[i]) {
                    if (n2 < this.faceLabelsAlpha.length) {
                        final int[] array2 = this.faceLabelsAlpha[n2];
                        for (int k = 0; k < array2.length; ++k) {
                            final int n3 = array2[k];
                            int n4 = (int)((this.field2154[n3] & 0x8C9769F0) + class134.method744(n, -1678561692) * 255.0f);
                            if (n4 < 0) {
                                n4 = 0;
                            }
                            else if (n4 > -1263029120) {
                                n4 = 255;
                            }
                            this.field2154[n3] = (byte)n4;
                        }
                    }
                }
            }
        }
    }
    
    void method1325(final class133 class133, final int n) {
        final Skeleton field1280 = class133.field1280;
        final byte[] faceTransparencies = this.getFaceTransparencies();
        for (int i = 0; i < field1280.pb(); ++i) {
            if (field1280.xp()[i] == 5 && class133.va != null && class133.va[i * 1 + 0] != 0 && this.faceLabelsAlpha != null && faceTransparencies != null) {
                final int n2 = class133.va[i * 1 + 0];
                for (final int n3 : field1280.xp()[i]) {
                    if (n3 < this.faceLabelsAlpha.length) {
                        final int[] array2 = this.faceLabelsAlpha[n3];
                        for (int k = 0; k < array2.length; ++k) {
                            final int n4 = array2[k];
                            int n5 = (int)((faceTransparencies[n4] & 0xFF) + class133.kn(n2, n) * 255.0f);
                            if (n5 < 0) {
                                n5 = 0;
                            }
                            else if (n5 > 255) {
                                n5 = 255;
                            }
                            faceTransparencies[n4] = (byte)n5;
                        }
                    }
                }
            }
        }
    }
    
    final void eh(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final float n8, final float n9, final float n10, final int n11, final int n12, final int n13) {
        if (this.faceTextures != null && this.faceTextures[n] != -1) {
            int n15;
            int n16;
            int n17;
            if (this.faceRenderPriorities != null && this.faceRenderPriorities[n] != -1) {
                final int n14 = this.faceRenderPriorities[n] & 0xFD6979A5;
                n15 = this.field2199[n14];
                n16 = this.field2155[n14];
                n17 = this.field2187[n14];
            }
            else {
                n15 = this.indices1[n];
                n16 = this.indices2[n];
                n17 = this.indices3[n];
            }
            if (this.faceColors3[n] == -1) {
                DevicePcmPlayerProvider.method89(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n11, n11, Model.field2161[n15], Model.field2161[n16], Model.field2161[n17], Model.field2175[n15], Model.field2175[n16], Model.field2175[n17], Model.field2200[n15], Model.field2200[n16], Model.field2200[n17], this.faceTextures[n], (short)6670);
            }
            else {
                DevicePcmPlayerProvider.method89(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, Model.field2161[n15], Model.field2161[n16], Model.field2161[n17], Model.field2175[n15], Model.field2175[n16], Model.field2175[n17], Model.field2200[n15], Model.field2200[n16], Model.field2200[n17], this.faceTextures[n], (short)(-332));
            }
        }
        else {
            final boolean method1331 = this.method1331(n);
            if (this.faceColors3[n] == -1 && method1331) {
                class220.cy(Rasterizer3D.field1999, n2, n3, n4, n5, n6, n7, n8, n9, n10, Model.field2140[this.faceColors1[n]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount, -1620123395);
            }
            else if (this.faceColors3[n] == -1) {
                class144.method825(n2, n3, n4, n5, n6, n7, n8, n9, n10, Model.field2140[this.faceColors1[n]], -1477338792);
            }
            else if (method1331) {
                Rasterizer3D.field1999.method1224(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount, (byte)(-110));
            }
            else {
                BoundaryObject.method1379(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, -428480375);
            }
        }
    }
    
    public static void eh(final Model model, final int sceneId, final int n, final int n2) {
        if (model == null) {
            model.setSceneId(sceneId);
            return;
        }
        for (int i = 0; i < model.verticesCount; ++i) {
            final int[] verticesX = model.verticesX;
            final int n3 = i;
            verticesX[n3] += sceneId;
            final int[] verticesY = model.verticesY;
            final int n4 = i;
            verticesY[n4] += n;
            final int[] verticesZ = model.verticesZ;
            final int n5 = i;
            verticesZ[n5] += n2;
        }
        dv(model);
    }
    
    final void ev(final int n) {
        if (Model.field2169[n]) {
            this.method1334(n);
            return;
        }
        final int n2 = this.indices1[n];
        final int n3 = this.indices2[n];
        final int n4 = this.indices3[n];
        Rasterizer3D.clips.field2234 = Model.field2168[n];
        if (this.field2154 == null) {
            Rasterizer3D.clips.field2225 = 0;
        }
        else {
            Rasterizer3D.clips.field2225 = (this.field2154[n] & 0xFF) * -1087605381;
        }
        this.method1332(n, Model.modelViewportYs[n2], Model.modelViewportYs[n3], Model.modelViewportYs[n4], Model.modelViewportXs[n2], Model.modelViewportXs[n3], Model.modelViewportXs[n4], Model.field2172[n2], Model.field2172[n3], Model.field2172[n4], this.faceColors1[n], this.faceColors2[n], this.faceColors3[n]);
    }
    
    public final void es(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (this.boundsType != 2 && this.boundsType != 1) {
            this.method1341();
        }
        final int clipMidX = TaskHandler.getClipMidX(841462324);
        final int clipMidY = class12.getClipMidY(956991344);
        final int n9 = Model.field2192[n];
        final int n10 = Model.field2132[n];
        final int n11 = Model.field2192[n2];
        final int n12 = Model.field2132[n2];
        final int n13 = Model.field2192[n3];
        final int n14 = Model.field2132[n3];
        final int n15 = Model.field2192[n4];
        final int n16 = Model.field2132[n4];
        final int n17 = n6 * n15 + n7 * n16 >> 16;
        for (int i = 0; i < this.verticesCount; ++i) {
            int n18 = this.verticesX[i];
            int n19 = this.verticesY[i];
            int n20 = this.verticesZ[i];
            if (n3 != 0) {
                final int n21 = n19 * n13 + n18 * n14 >> 16;
                n19 = n19 * n14 - n18 * n13 >> 16;
                n18 = n21;
            }
            if (n != 0) {
                final int n22 = n19 * n10 - n20 * n9 >> 16;
                n20 = n19 * n9 + n20 * n10 >> 16;
                n19 = n22;
            }
            if (n2 != 0) {
                final int n23 = n20 * n11 + n18 * n12 >> 16;
                n20 = n20 * n12 - n18 * n11 >> 16;
                n18 = n23;
            }
            final int n24 = n18 + n5;
            final int n25 = n19 + n6;
            final int n26 = n20 + n7;
            final int n27 = n25 * n16 - n26 * n15 >> 16;
            final int n28 = n25 * n15 + n26 * n16 >> 16;
            final int n29 = n27;
            Model.field2173[i] = n28 - n17;
            Model.modelViewportXs[i] = clipMidX + n24 * UserComparator7.get3dZoom(1211975950) / n8;
            Model.modelViewportYs[i] = clipMidY + n29 * UserComparator7.get3dZoom(-1755079044) / n8;
            Model.field2172[i] = NPC.method609(n8, 1273986691);
            if (this.field2153 > 0) {
                Model.field2161[i] = n24;
                Model.field2175[i] = n29;
                Model.field2200[i] = n28;
            }
        }
        try {
            this.draw0(false, false, false, 0L);
        }
        catch (Exception ex) {}
    }
    
    public Model qk() {
        zm(this);
        return this;
    }
    
    void ee(final class219 class219, final int n) {
        this.method1319(class219, n);
    }
    
    public static void ee(final Model model, final Skeleton skeleton, final class133 class133, final int n, final boolean[] array, final boolean b, final boolean b2) {
        if (model == null) {
            model.method1336(skeleton, class133, n, array, b, b);
        }
        final class219 kz = Skeleton.kz(skeleton, -870517645);
        if (kz != null) {
            kz.method1222(class133, n, array, b, -944205793);
            if (b2) {
                model.ee(kz, class133.method773(-2096519042));
            }
        }
        if (!b && class133.method770(1713081171)) {
            model.method1325(class133, n);
        }
    }
    
    public void method1336(final Skeleton skeleton, final class133 class133, final int n, final boolean[] array, final boolean b, final boolean b2) {
        final class219 kz = Skeleton.kz(skeleton, -870517645);
        if (kz != null) {
            kz.method1222(class133, n, array, b, -944205793);
            if (b2) {
                this.dm(kz, class133.method773(-2096519042));
            }
        }
        if (!b && class133.method770(1713081171)) {
            this.method1325(class133, n);
        }
    }
    
    void calculateBoundingBox(final int n) {
        if (this.aabb.containsKey(n)) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        final int n8 = Model.field2181[n];
        final int n9 = Model.field2182[n];
        for (int i = 0; i < this.ln; ++i) {
            final int vmethod3254 = class143.vmethod3254(this.verticesZ[i], this.verticesY[i], n8, n9, (byte)6);
            final int n10 = this.faceColors3[i];
            final int addMember = ClanChannel.addMember(this.faceColors1[i], this.field2187[i], n8, n9, (byte)91);
            if (vmethod3254 < n2) {
                n2 = vmethod3254;
            }
            if (vmethod3254 > n5) {
                n5 = vmethod3254;
            }
            if (n10 < n3) {
                n3 = n10;
            }
            if (n10 > n6) {
                n6 = n10;
            }
            if (addMember < n4) {
                n4 = addMember;
            }
            if (addMember > n7) {
                n7 = addMember;
            }
        }
        final AABB value = new AABB((n5 + n2) / 2, (n6 + n3) / 2, (n7 + n4) / 2, (n5 - n2 + 1) / 2, (n6 - n3 + 1) / 2, (n7 - n4 + 1) / 2);
        if (value.zMidOffset * -1923653815 < 32) {
            value.zMidOffset = -889692384;
        }
        if (value.zMid * -452185969 < 32) {
            value.zMid = 702402016;
        }
        if (this.isSingleTile) {
            final AABB aabb = value;
            aabb.yMid = aabb.zMid - 222423096;
            final AABB aabb2 = value;
            aabb2.zMid = aabb2.xMid + 175600504;
        }
        this.aabb.put(n, value);
    }
    
    public Model method1312(final boolean b) {
        if (!b && Model.Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
            Model.Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(b, Model.Model_sharedSpotAnimationModel, Model.Model_sharedSpotAnimationModelFaceAlphas);
    }
    
    public void rotateZ(final int n) {
        final int n2 = Model.field2192[n];
        final int n3 = Model.field2132[n];
        for (int i = 0; i < this.indicesCount; ++i) {
            final int n4 = this.faceColors3[i] * n3 - this.faceColors2[i] * n2 >> 16;
            this.field2155[i] = this.indices2[i] * n2 + this.field2199[i] * n3 >> 16;
            this.field2187[i] = n4;
        }
        dv(this);
    }
    
    public void bv(final Model model) {
        if (model == null) {
            return;
        }
        vw(this, model);
        for (int i = 0; i < model.indicesCount; ++i) {
            this.indices1[this.indicesCount] = model.indices1[i] + this.verticesCount;
            this.indices2[this.indicesCount] = model.indices2[i] + this.verticesCount;
            this.indices3[this.indicesCount] = model.indices3[i] + this.verticesCount;
            this.faceColors1[this.indicesCount] = model.faceColors1[i];
            this.faceColors2[this.indicesCount] = model.faceColors2[i];
            this.faceColors3[this.indicesCount] = model.faceColors3[i];
            if (this.faceAlphas != null) {
                this.faceAlphas[this.indicesCount] = ((model.faceAlphas != null) ? model.faceAlphas[i] : model.field2152);
            }
            if (this.field2154 != null && model.field2154 != null) {
                this.field2154[this.indicesCount] = model.field2154[i];
            }
            if (this.faceTextures != null) {
                this.faceTextures[this.indicesCount] = (short)((model.faceTextures != null) ? model.faceTextures[i] : -1);
            }
            if (this.faceRenderPriorities != null) {
                if (model.faceRenderPriorities != null && model.faceRenderPriorities[i] != -1) {
                    this.faceRenderPriorities[this.indicesCount] = (byte)(model.faceRenderPriorities[i] + this.field2153);
                }
                else {
                    this.faceRenderPriorities[this.indicesCount] = -1;
                }
            }
            ++this.indicesCount;
        }
        for (int j = 0; j < model.field2153; ++j) {
            this.field2199[this.field2153] = model.field2199[j] + this.verticesCount;
            this.field2155[this.field2153] = model.field2155[j] + this.verticesCount;
            this.field2187[this.field2153] = model.field2187[j] + this.verticesCount;
            ++this.field2153;
        }
        for (int k = 0; k < model.verticesCount; ++k) {
            this.verticesX[this.verticesCount] = model.verticesX[k];
            this.verticesY[this.verticesCount] = model.verticesY[k];
            this.verticesZ[this.verticesCount] = model.verticesZ[k];
            ++this.verticesCount;
        }
    }
    
    public void sz(final int n, final int[] array, final int n2, final int n3, final int n4) {
        this.transform(n, array, n2, n3, n4);
    }
    
    public void dl(final Skeleton skeleton, final class133 class133, final int n, final boolean[] array, final boolean b, final boolean b2) {
        final class219 kz = Skeleton.kz(skeleton, 1892699677);
        if (kz != null) {
            kz.method1222(class133, n, array, b, -994842239);
            if (b2) {
                this.ee(kz, class133.method773(-2097900247));
            }
        }
        if (!b && class133.method770(1713081171)) {
            this.method1325(class133, n);
        }
    }
    
    public void ck() {
        if (this.boundsType == 1) {
            return;
        }
        this.boundsType = 1;
        this.et = 0;
        this.bottomY = 0;
        this.xzRadius = 0;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            final int bottomY = this.verticesY[i];
            final int n2 = this.verticesZ[i];
            if (-bottomY > this.et * 1550732737) {
                this.et = -bottomY * -644693439;
            }
            if (bottomY > this.bottomY) {
                this.bottomY = bottomY;
            }
            final int xzRadius = n * n + n2 * n2;
            if (xzRadius > this.xzRadius) {
                this.xzRadius = xzRadius;
            }
        }
        this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
        this.radius = (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.et * 1550732737 * (this.et * 1550732737)) + 0.99);
        this.diameter = this.radius + (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY) + 0.99);
    }
    
    public final void method1327(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (this.boundsType != 2 && this.boundsType != 1) {
            this.method1341();
        }
        final int clipMidX = TaskHandler.getClipMidX(-1616456716);
        final int clipMidY = class12.getClipMidY(-1139847057);
        final int n9 = Model.field2192[n];
        final int n10 = Model.field2132[n];
        final int n11 = Model.field2192[n2];
        final int n12 = Model.field2132[n2];
        final int n13 = Model.field2192[n3];
        final int n14 = Model.field2132[n3];
        final int n15 = Model.field2192[n4];
        final int n16 = Model.field2132[n4];
        final int n17 = n6 * n15 + n7 * n16 >> 16;
        for (int i = 0; i < this.verticesCount; ++i) {
            int n18 = this.verticesX[i];
            int n19 = this.verticesY[i];
            int n20 = this.verticesZ[i];
            if (n3 != 0) {
                final int n21 = n19 * n13 + n18 * n14 >> 16;
                n19 = n19 * n14 - n18 * n13 >> 16;
                n18 = n21;
            }
            if (n != 0) {
                final int n22 = n19 * n10 - n20 * n9 >> 16;
                n20 = n19 * n9 + n20 * n10 >> 16;
                n19 = n22;
            }
            if (n2 != 0) {
                final int n23 = n20 * n11 + n18 * n12 >> 16;
                n20 = n20 * n12 - n18 * n11 >> 16;
                n18 = n23;
            }
            final int n24 = n18 + n5;
            final int n25 = n19 + n6;
            final int n26 = n20 + n7;
            final int n27 = n25 * n16 - n26 * n15 >> 16;
            final int n28 = n25 * n15 + n26 * n16 >> 16;
            final int n29 = n27;
            Model.field2173[i] = n28 - n17;
            Model.modelViewportXs[i] = clipMidX + n24 * UserComparator7.get3dZoom(-1398451712) / n8;
            Model.modelViewportYs[i] = clipMidY + n29 * UserComparator7.get3dZoom(-60466529) / n8;
            Model.field2172[i] = NPC.method609(n8, 1874384832);
            if (this.field2153 > 0) {
                Model.field2161[i] = n24;
                Model.field2175[i] = n29;
                Model.field2200[i] = n28;
            }
        }
        try {
            this.draw0(false, false, false, 0L);
        }
        catch (Exception ex) {}
    }
    
    public Model bp(final int[][] array, final int n, final int n2, final int n3, final boolean b, final int n4) {
        this.calculateBoundsCylinder();
        final int n5 = n - this.xzRadius;
        final int n6 = n + this.xzRadius;
        final int n7 = n3 - this.xzRadius;
        final int n8 = n3 + this.xzRadius;
        Model model;
        if (n5 >= 0 && n6 + 128 >> 7 < array.length && n7 >= 0 && n8 + 128 >> 7 < array[0].length) {
            final int n9 = n5 >> 7;
            final int n10 = n6 + 127 >> 7;
            final int n11 = n7 >> 7;
            final int n12 = n8 + 127 >> 7;
            if (array[n9][n11] == n2 && array[n10][n11] == n2 && array[n9][n12] == n2 && array[n10][n12] == n2) {
                model = this;
            }
            else {
                Model model2;
                if (b) {
                    model2 = new Model();
                    model2.verticesCount = this.verticesCount;
                    model2.indicesCount = this.indicesCount;
                    model2.field2153 = this.field2153;
                    model2.verticesX = this.verticesX;
                    model2.verticesZ = this.verticesZ;
                    model2.indices1 = this.indices1;
                    model2.indices2 = this.indices2;
                    model2.indices3 = this.indices3;
                    model2.faceColors1 = this.faceColors1;
                    model2.faceColors2 = this.faceColors2;
                    model2.faceColors3 = this.faceColors3;
                    model2.faceAlphas = this.faceAlphas;
                    model2.field2154 = this.field2154;
                    model2.faceRenderPriorities = this.faceRenderPriorities;
                    model2.faceTextures = this.faceTextures;
                    model2.field2152 = this.field2152;
                    model2.field2199 = this.field2199;
                    model2.field2155 = this.field2155;
                    model2.field2187 = this.field2187;
                    model2.vertexLabels = this.vertexLabels;
                    model2.faceLabelsAlpha = this.faceLabelsAlpha;
                    model2.isSingleTile = this.isSingleTile;
                    model2.verticesY = new int[model2.verticesCount];
                }
                else {
                    model2 = this;
                }
                if (n4 == 0) {
                    for (int i = 0; i < model2.verticesCount; ++i) {
                        final int n13 = this.verticesX[i] + n;
                        final int n14 = this.verticesZ[i] + n3;
                        final int n15 = n13 & 0x7F;
                        final int n16 = n14 & 0x7F;
                        final int n17 = n13 >> 7;
                        final int n18 = n14 >> 7;
                        model2.verticesY[i] = this.verticesY[i] + ((array[n17][n18] * (128 - n15) + array[n17 + 1][n18] * n15 >> 7) * (128 - n16) + (array[n17][n18 + 1] * (128 - n15) + array[n17 + 1][n18 + 1] * n15 >> 7) * n16 >> 7) - n2;
                    }
                }
                else {
                    for (int j = 0; j < model2.verticesCount; ++j) {
                        final int n19 = (-this.verticesY[j] << 16) / (this.et * 1550732737);
                        if (n19 < n4) {
                            final int n20 = this.verticesX[j] + n;
                            final int n21 = this.verticesZ[j] + n3;
                            final int n22 = n20 & 0x7F;
                            final int n23 = n21 & 0x7F;
                            final int n24 = n20 >> 7;
                            final int n25 = n21 >> 7;
                            model2.verticesY[j] = this.verticesY[j] + (((array[n24][n25] * (128 - n22) + array[n24 + 1][n25] * n22 >> 7) * (128 - n23) + (array[n24][n25 + 1] * (128 - n22) + array[n24 + 1][n25 + 1] * n22 >> 7) * n23 >> 7) - n2) * (n4 - n19) / n4;
                        }
                    }
                }
                dv(model2);
                model = model2;
            }
        }
        else {
            model = this;
        }
        final Model model3 = model;
        if (model3 != this) {
            model3.oy = this.oy;
            model3.ez = this.ez;
            model3.en = this.en;
        }
        return model3;
    }
    
    public static void ie(final Model model, final Frames frames, final int n, final Frames frames2, final int n2, final int[] array) {
        if (model == null) {
            model.br(n, n, n);
        }
        if (n == -1) {
            return;
        }
        if (array != null && n2 != -1) {
            final Animation animation = frames.frames[n];
            final Animation animation2 = frames2.frames[n2];
            final Skeleton skeleton = animation.skeleton;
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            int n3 = 0;
            int n4 = array[n3++];
            for (int i = 0; i < animation.transformCount; ++i) {
                int j;
                for (j = animation.transformSkeletonLabels[i]; j > n4; n4 = array[n3++]) {}
                if (j != n4 || skeleton.transformTypes[j] == 0) {
                    model.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
                }
            }
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            int n5 = 0;
            int n6 = array[n5++];
            for (int k = 0; k < animation2.transformCount; ++k) {
                int l;
                for (l = animation2.transformSkeletonLabels[k]; l > n6; n6 = array[n5++]) {}
                if (l == n6 || skeleton.transformTypes[l] == 0) {
                    model.transform(skeleton.transformTypes[l], skeleton.labels[l], animation2.transformXs[k], animation2.transformYs[k], animation2.transformZs[k]);
                }
            }
            dv(model);
            return;
        }
        ug(model, frames, n);
    }
    
    public void ct(final class133 class133, final int n) {
        final Skeleton field1280 = class133.field1280;
        if (Skeleton.kz(field1280, -1351569612) != null) {
            Skeleton.kz(field1280, -2010476646).method1221(class133, n, 1481623119);
            this.ee(Skeleton.kz(field1280, 411997093), class133.method773(-2076506354));
        }
        if (class133.method770(1713081171)) {
            this.method1325(class133, n);
        }
        dv(this);
    }
    
    Model cc(final boolean b, final Model model, final byte[] field2154) {
        model.verticesCount = this.verticesCount;
        model.indicesCount = this.indicesCount;
        model.field2153 = this.field2153;
        if (model.verticesX == null || model.verticesX.length < this.verticesCount) {
            model.verticesX = new int[this.verticesCount + 997125025];
            model.verticesY = new int[this.verticesCount + 100];
            model.verticesZ = new int[this.verticesCount + 100];
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            model.verticesX[i] = this.verticesX[i];
            model.verticesY[i] = this.verticesY[i];
            model.verticesZ[i] = this.verticesZ[i];
        }
        if (b) {
            model.field2154 = this.field2154;
        }
        else {
            model.field2154 = field2154;
            if (this.field2154 == null) {
                for (int j = 0; j < this.indicesCount; ++j) {
                    model.field2154[j] = 0;
                }
            }
            else {
                for (int k = 0; k < this.indicesCount; ++k) {
                    model.field2154[k] = this.field2154[k];
                }
            }
        }
        model.indices1 = this.indices1;
        model.indices2 = this.indices2;
        model.indices3 = this.indices3;
        model.faceColors1 = this.faceColors1;
        model.faceColors2 = this.faceColors2;
        model.faceColors3 = this.faceColors3;
        model.faceAlphas = this.faceAlphas;
        model.faceRenderPriorities = this.faceRenderPriorities;
        model.faceTextures = this.faceTextures;
        model.field2152 = this.field2152;
        model.field2199 = this.field2199;
        model.field2155 = this.field2155;
        model.field2187 = this.field2187;
        model.vertexLabels = this.vertexLabels;
        model.faceLabelsAlpha = this.faceLabelsAlpha;
        model.field2156 = this.field2156;
        model.field2160 = this.field2160;
        model.isSingleTile = this.isSingleTile;
        dv(model);
        model.overrideAmount = 0;
        return model;
    }
    
    public static void dv(final Model model) {
        if (model == null) {
            model.resetBounds();
            return;
        }
        model.boundsType = 0;
        model.aabb.clear();
    }
    
    public void dv(final Frames frames, final int n, final int[] array, final boolean b) {
        if (array == null) {
            ug(this, frames, n);
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        int n2 = 0;
        int n3 = array[n2++];
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            int j;
            for (j = animation.transformSkeletonLabels[i]; j > n3; n3 = array[n2++]) {}
            if (b) {
                if (j == n3 || skeleton.transformTypes[j] == 0) {
                    this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
                }
            }
            else if (j != n3 || skeleton.transformTypes[j] == 0) {
                this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
            }
        }
    }
    
    final void method1332(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final float n8, final float n9, final float n10, final int n11, final int n12, final int n13) {
        if (this.faceTextures != null && this.faceTextures[n] != -1) {
            int n15;
            int n16;
            int n17;
            if (this.faceRenderPriorities != null && this.faceRenderPriorities[n] != -1) {
                final int n14 = this.faceRenderPriorities[n] & 0xFF;
                n15 = this.field2199[n14];
                n16 = this.field2155[n14];
                n17 = this.field2187[n14];
            }
            else {
                n15 = this.indices1[n];
                n16 = this.indices2[n];
                n17 = this.indices3[n];
            }
            if (this.faceColors3[n] == -1) {
                DevicePcmPlayerProvider.method89(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n11, n11, Model.field2161[n15], Model.field2161[n16], Model.field2161[n17], Model.field2175[n15], Model.field2175[n16], Model.field2175[n17], Model.field2200[n15], Model.field2200[n16], Model.field2200[n17], this.faceTextures[n], (short)26065);
            }
            else {
                DevicePcmPlayerProvider.method89(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, Model.field2161[n15], Model.field2161[n16], Model.field2161[n17], Model.field2175[n15], Model.field2175[n16], Model.field2175[n17], Model.field2200[n15], Model.field2200[n16], Model.field2200[n17], this.faceTextures[n], (short)(-16054));
            }
        }
        else {
            final boolean method1331 = this.method1331(n);
            if (this.faceColors3[n] == -1 && method1331) {
                class220.cy(Rasterizer3D.field1999, n2, n3, n4, n5, n6, n7, n8, n9, n10, Model.field2140[this.faceColors1[n]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount, -1620123395);
            }
            else if (this.faceColors3[n] == -1) {
                class144.method825(n2, n3, n4, n5, n6, n7, n8, n9, n10, Model.field2140[this.faceColors1[n]], -1859113077);
            }
            else if (method1331) {
                Rasterizer3D.field1999.method1224(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount, (byte)(-58));
            }
            else {
                BoundaryObject.method1379(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, -428480375);
            }
        }
    }
    
    public static void method1332(final Model model, final Frames frames, final int n, final Frames frames2, final int n2, final int[] array) {
        if (model == null) {
            model.animate2(frames, n, frames, n, array);
        }
        if (n == -1) {
            return;
        }
        if (array != null && n2 != -1) {
            final Animation animation = frames.frames[n];
            final Animation animation2 = frames2.frames[n2];
            final Skeleton skeleton = animation.skeleton;
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            int n3 = 0;
            int n4 = array[n3++];
            for (int i = 0; i < animation.transformCount; ++i) {
                int j;
                for (j = animation.transformSkeletonLabels[i]; j > n4; n4 = array[n3++]) {}
                if (j != n4 || skeleton.transformTypes[j] == 0) {
                    model.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
                }
            }
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            int n5 = 0;
            int n6 = array[n5++];
            for (int k = 0; k < animation2.transformCount; ++k) {
                int l;
                for (l = animation2.transformSkeletonLabels[k]; l > n6; n6 = array[n5++]) {}
                if (l == n6 || skeleton.transformTypes[l] == 0) {
                    model.transform(skeleton.transformTypes[l], skeleton.labels[l], animation2.transformXs[k], animation2.transformYs[k], animation2.transformZs[k]);
                }
            }
            dv(model);
            return;
        }
        ug(model, frames, n);
    }
    
    public void ds(final int n) {
        final int n2 = Model.field2192[n];
        final int n3 = Model.field2132[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n4 = this.verticesY[i] * n3 - this.verticesZ[i] * n2 >> 16;
            this.verticesZ[i] = this.verticesY[i] * n2 + this.verticesZ[i] * n3 >> 16;
            this.verticesY[i] = n4;
        }
        dv(this);
    }
    
    public Model bc(final boolean b) {
        if (!b && Model.Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
            Model.Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(b, Model.Model_sharedSequenceModel, Model.Model_sharedSequenceModelFaceAlphas);
    }
    
    public static void ia(final Model model, final int n) {
        if (model == null) {
            model.calculateBoundingBox(n);
        }
        if (model.aabb.containsKey(n)) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        final int n8 = Model.field2132[n];
        final int n9 = Model.field2192[n];
        for (int i = 0; i < model.verticesCount; ++i) {
            final int vmethod3254 = class143.vmethod3254(model.verticesX[i], model.verticesZ[i], n8, n9, (byte)6);
            final int n10 = model.verticesY[i];
            final int addMember = ClanChannel.addMember(model.verticesX[i], model.verticesZ[i], n8, n9, (byte)91);
            if (vmethod3254 < n2) {
                n2 = vmethod3254;
            }
            if (vmethod3254 > n5) {
                n5 = vmethod3254;
            }
            if (n10 < n3) {
                n3 = n10;
            }
            if (n10 > n6) {
                n6 = n10;
            }
            if (addMember < n4) {
                n4 = addMember;
            }
            if (addMember > n7) {
                n7 = addMember;
            }
        }
        final AABB value = new AABB((n5 + n2) / 2, (n6 + n3) / 2, (n7 + n4) / 2, (n5 - n2 + 1) / 2, (n6 - n3 + 1) / 2, (n7 - n4 + 1) / 2);
        if (value.xMid * -1923653815 < 32) {
            value.xMid = -889692384;
        }
        if (value.yMidOffset * -452185969 < 32) {
            value.yMidOffset = 702402016;
        }
        if (model.isSingleTile) {
            final AABB aabb = value;
            aabb.xMid -= 222423096;
            final AABB aabb2 = value;
            aabb2.yMidOffset += 175600504;
        }
        model.aabb.put(n, value);
    }
    
    void br(final int n, final int n2, final int n3) {
        this.verticesX = new int[n];
        this.verticesY = new int[n];
        this.verticesZ = new int[n];
        this.indices1 = new int[n2];
        this.indices2 = new int[n2];
        this.indices3 = new int[n2];
        this.faceColors1 = new int[n2];
        this.faceColors2 = new int[n2];
        this.faceColors3 = new int[n2];
        if (n3 > 0) {
            this.field2199 = new int[n3];
            this.field2155 = new int[n3];
            this.field2187 = new int[n3];
        }
    }
    
    void ei(final int n, final class425 class425) {
        final float n2 = (float)this.verticesX[n];
        final float n3 = (float)(-this.verticesY[n]);
        final float n4 = (float)(-this.verticesZ[n]);
        final float n5 = 1.0f;
        this.verticesX[n] = (int)(class425.bp * n2 + class425.he * n3 + class425.uw * n4 + class425.et * n5);
        this.verticesY[n] = -(int)(class425.ld * n2 + class425.vg * n3 + class425.hz * n4 + class425.vy * n5);
        this.verticesZ[n] = -(int)(class425.yo * n2 + class425.ou * n3 + class425.eg * n4 + class425.as * n5);
    }
    
    public Model ci(final boolean b) {
        if (!b && Model.Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
            Model.Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(b, Model.Model_sharedSpotAnimationModel, Model.Model_sharedSpotAnimationModelFaceAlphas);
    }
    
    void method1310(final Model model) {
        final int length = this.faceColors1.length;
        if (this.faceRenderPriorities == null && (model.field2154 != null || this.overrideLuminance != model.overrideAmount)) {
            this.faceAlphas = new byte[length];
            Arrays.fill(this.faceRenderPriorities, this.overrideAmount);
        }
        if (this.faceAlphas == null && model.faceAlphas != null) {
            Arrays.fill(this.faceAlphas = new byte[length], (byte)0);
        }
        if (this.faceTextures == null && model.faceTextures != null) {
            Arrays.fill(this.faceTextures = new short[length], (short)(-1));
        }
        if (this.field2154 == null && model.faceAlphas != null) {
            this.faceRenderPriorities = new byte[length];
            Arrays.fill(this.faceAlphas, (byte)(-1));
        }
    }
    
    public void method1317(final class133 class133, final int n) {
        final Skeleton field1280 = class133.field1280;
        if (Skeleton.kz(field1280, -1572646625) != null) {
            Skeleton.kz(field1280, -1665750973).method1221(class133, n, 1980554520);
            this.ee(Skeleton.kz(field1280, 1810874091), class133.method773(-2042558319));
        }
        if (class133.method770(1713081171)) {
            this.method1325(class133, n);
        }
        dv(this);
    }
    
    boolean em(final int n) {
        return this.overrideAmount > 0 && n < this.field2196;
    }
    
    @Override
    void draw(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        if (this.boundsType != 1) {
            this.calculateBoundsCylinder();
        }
        ia(this, n);
        final int n10 = n8 * n5 - n6 * n4 >> 16;
        final int n11 = n7 * n2 + n10 * n3 >> 16;
        final int n12 = this.xzRadius * n3 >> 16;
        final int n13 = n11 + n12;
        if (n13 <= 50 || n11 >= 3500) {
            return;
        }
        final int n14 = n8 * n4 + n6 * n5 >> 16;
        final int n15 = (n14 - this.xzRadius) * UserComparator7.get3dZoom(-1320099830);
        if (n15 / n13 >= class264.getClipMidX2(1788412659)) {
            return;
        }
        final int n16 = (n14 + this.xzRadius) * UserComparator7.get3dZoom(-286169550);
        if (n16 / n13 <= -1346890391 * Rasterizer3D.clips.clipNegativeMidX) {
            return;
        }
        final int n17 = n7 * n3 - n10 * n2 >> 16;
        final int n18 = this.xzRadius * n2 >> 16;
        final int n19 = (n17 + (n18 + (this.bottomY * n3 >> 16))) * UserComparator7.get3dZoom(-204654938);
        if (n19 / n13 <= Rasterizer3D.clips.clipNegativeMidY * 1380452969) {
            return;
        }
        final int n20 = (n17 - (n18 + (this.et * 1550732737 * n3 >> 16))) * UserComparator7.get3dZoom(2046151423);
        if (n20 / n13 >= class142.getClipMidY2((byte)6)) {
            return;
        }
        final int n21 = n12 + (this.et * 1550732737 * n2 >> 16);
        boolean b = false;
        boolean b2 = false;
        if (n11 - n21 <= 50) {
            b2 = true;
        }
        final boolean b3 = b2 || this.field2153 > 0;
        final int method452 = Projectile.method452(-678191257);
        final int n22 = ViewportMouse.ViewportMouse_y * 148198745;
        final boolean viewportMouse_isInViewport = ViewportMouse.ViewportMouse_isInViewport;
        final boolean method453 = class173.method957(n9);
        boolean b4 = false;
        if (method453 && viewportMouse_isInViewport) {
            boolean method454 = false;
            if (Model.field2180) {
                method454 = class428.method2272(this, n, n6, n7, n8, (byte)11);
            }
            else {
                int n23 = n11 - n12;
                if (n23 <= 50) {
                    n23 = 50;
                }
                int n24;
                int n25;
                if (n14 > 0) {
                    n24 = n15 / n13;
                    n25 = n16 / n23;
                }
                else {
                    n25 = n16 / n13;
                    n24 = n15 / n23;
                }
                int n26;
                int n27;
                if (n17 > 0) {
                    n26 = n20 / n13;
                    n27 = n19 / n23;
                }
                else {
                    n27 = n19 / n13;
                    n26 = n20 / n23;
                }
                final int n28 = method452 - TaskHandler.getClipMidX(-673901293);
                final int n29 = n22 - class12.getClipMidY(-1711889850);
                if (n28 > n24 && n28 < n25 && n29 > n26 && n29 < n27) {
                    method454 = true;
                }
            }
            if (method454) {
                if (this.isSingleTile) {
                    GraphicsObject.method429(n9);
                }
                else {
                    b4 = true;
                }
            }
        }
        final int clipMidX = TaskHandler.getClipMidX(503999866);
        final int clipMidY = class12.getClipMidY(-635464644);
        int n30 = 0;
        int n31 = 0;
        if (n != 0) {
            n30 = Model.field2192[n];
            n31 = Model.field2132[n];
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            int n32 = this.verticesX[i];
            final int n33 = this.verticesY[i];
            int n34 = this.verticesZ[i];
            if (n != 0) {
                final int n35 = n34 * n30 + n32 * n31 >> 16;
                n34 = n34 * n31 - n32 * n30 >> 16;
                n32 = n35;
            }
            final int n36 = n32 + n6;
            final int n37 = n33 + n7;
            final int n38 = n34 + n8;
            final int n39 = n38 * n4 + n36 * n5 >> 16;
            final int n40 = n38 * n5 - n36 * n4 >> 16;
            final int n41 = n39;
            final int n42 = n37 * n3 - n40 * n2 >> 16;
            final int n43 = n37 * n2 + n40 * n3 >> 16;
            final int n44 = n42;
            Model.field2173[i] = n43 - n11;
            if (n43 >= 50) {
                Model.modelViewportXs[i] = clipMidX + n41 * UserComparator7.get3dZoom(2097792310) / n43;
                Model.modelViewportYs[i] = clipMidY + n44 * UserComparator7.get3dZoom(-1515781515) / n43;
                Model.field2172[i] = NPC.method609(n43, 1444080454);
            }
            else {
                Model.modelViewportXs[i] = -5000;
                b = true;
            }
            if (b3) {
                Model.field2161[i] = n41;
                Model.field2175[i] = n44;
                Model.field2200[i] = n43;
            }
        }
        try {
            this.draw0(b, b4, this.isSingleTile, n9);
        }
        catch (Exception ex) {}
    }
    
    public void cu() {
        if (this.boundsType == 1) {
            return;
        }
        this.boundsType = 1;
        this.et = 0;
        this.bottomY = 0;
        this.xzRadius = 0;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            final int bottomY = this.verticesY[i];
            final int n2 = this.verticesZ[i];
            if (-bottomY > this.et * 1550732737) {
                this.et = -bottomY * -644693439;
            }
            if (bottomY > this.bottomY) {
                this.bottomY = bottomY;
            }
            final int xzRadius = n * n + n2 * n2;
            if (xzRadius > this.xzRadius) {
                this.xzRadius = xzRadius;
            }
        }
        this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
        this.radius = (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.et * 1581357103 * (this.et * 1550732737)) + 0.99);
        this.diameter = this.radius + (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY) + 0.99);
    }
    
    public Shape no(final int n, final int n2, final int n3, final int n4) {
        final int[] array = new int[this.getVerticesCount()];
        final int[] array2 = new int[this.getVerticesCount()];
        Perspective.modelToCanvas((Client)ScriptFrame.client, this.getVerticesCount(), n, n2, n4, n3, this.getVerticesX(), this.getVerticesZ(), this.getVerticesY(), array, array2);
        return (Shape)Jarvis.convexHull(array, array2);
    }
    
    void dm(final class219 class219, final int n) {
        if (this.field2156 == null) {
            return;
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            final int[] array = this.field2156[i];
            if (array != null) {
                if (array.length != 0) {
                    final int[] array2 = this.field2160[i];
                    Model.field2134.method2251(1287909662);
                    for (int j = 0; j < array.length; ++j) {
                        final class122 yb = class219.yb(class219, array[j], (byte)(-19));
                        if (yb != null) {
                            Model.field2135.method2253(array2[j] / 255.0f, -1606075808);
                            Model.field2136.method2252(yb.method728(n, 587524853), 1877033830);
                            Model.field2136.method2255(Model.field2135, 1196929111);
                            class425.am(Model.field2134, Model.field2136, 913965177);
                        }
                    }
                    this.method1326(i, Model.field2134);
                }
            }
        }
    }
    
    public void method1342(final Model model) {
        if (model == null) {
            return;
        }
        vw(this, model);
        for (int i = 0; i < model.indicesCount; ++i) {
            this.indices1[this.indicesCount] = model.indices1[i] + this.verticesCount;
            this.indices2[this.indicesCount] = model.indices2[i] + this.verticesCount;
            this.indices3[this.indicesCount] = model.indices3[i] + this.verticesCount;
            this.faceColors1[this.indicesCount] = model.faceColors1[i];
            this.faceColors2[this.indicesCount] = model.faceColors2[i];
            this.faceColors3[this.indicesCount] = model.faceColors3[i];
            if (this.faceAlphas != null) {
                this.faceAlphas[this.indicesCount] = ((model.faceAlphas != null) ? model.faceAlphas[i] : model.field2152);
            }
            if (this.field2154 != null && model.field2154 != null) {
                this.field2154[this.indicesCount] = model.field2154[i];
            }
            if (this.faceTextures != null) {
                this.faceTextures[this.indicesCount] = (short)((model.faceTextures != null) ? model.faceTextures[i] : -1);
            }
            if (this.faceRenderPriorities != null) {
                if (model.faceRenderPriorities != null && model.faceRenderPriorities[i] != -1) {
                    this.faceRenderPriorities[this.indicesCount] = (byte)(model.faceRenderPriorities[i] + this.field2153);
                }
                else {
                    this.faceRenderPriorities[this.indicesCount] = -1;
                }
            }
            ++this.indicesCount;
        }
        for (int j = 0; j < model.field2153; ++j) {
            this.field2199[this.field2153] = model.field2199[j] + this.verticesCount;
            this.field2155[this.field2153] = model.field2155[j] + this.verticesCount;
            this.field2187[this.field2153] = model.field2187[j] + this.verticesCount;
            ++this.field2153;
        }
        for (int k = 0; k < model.verticesCount; ++k) {
            this.verticesX[this.verticesCount] = model.verticesX[k];
            this.verticesY[this.verticesCount] = model.verticesY[k];
            this.verticesZ[this.verticesCount] = model.verticesZ[k];
            ++this.verticesCount;
        }
    }
    
    public void ur(final Frames frames, final int n, final Frames frames2, final int n2, final int n3, final int n4) {
        if (this.kv() != null && n != -1) {
            final Animation animation = frames.gl()[n];
            final Skeleton sn = animation.sn();
            Animation animation2 = null;
            if (frames2 != null) {
                animation2 = frames2.gl()[n2];
                if (animation2.sn() != sn) {
                    animation2 = null;
                }
            }
            ScriptFrame.client.lu(0);
            ScriptFrame.client.os(0);
            ScriptFrame.client.mn(0);
            this.kt(sn, animation, animation2, n3, n4);
            this.to();
        }
    }
    
    public static void lx(final Model model, final int n, final class425 class425) {
        final float n2 = (float)model.verticesX[n];
        final float n3 = (float)(-model.verticesY[n]);
        final float n4 = (float)(-model.verticesZ[n]);
        final float n5 = 1.0f;
        model.verticesX[n] = (int)(class425.bp * n2 + class425.he * n3 + class425.uw * n4 + class425.et * n5);
        model.verticesY[n] = -(int)(class425.ld * n2 + class425.vg * n3 + class425.hz * n4 + class425.vy * n5);
        model.verticesZ[n] = -(int)(class425.yo * n2 + class425.ou * n3 + class425.eg * n4 + class425.as * n5);
    }
    
    public int getBufferOffset() {
        return this.th;
    }
    
    void bq(final Model model) {
        final int length = this.indices1.length;
        if (this.faceAlphas == null && (model.faceAlphas != null || this.field2152 != model.field2152)) {
            Arrays.fill(this.faceAlphas = new byte[length], this.field2152);
        }
        if (this.field2154 == null && model.field2154 != null) {
            Arrays.fill(this.field2154 = new byte[length], (byte)0);
        }
        if (this.faceTextures == null && model.faceTextures != null) {
            Arrays.fill(this.faceTextures = new short[length], (short)(-1));
        }
        if (this.faceRenderPriorities == null && model.faceRenderPriorities != null) {
            Arrays.fill(this.faceRenderPriorities = new byte[length], (byte)(-1));
        }
    }
    
    public void dk(final Skeleton skeleton, final class133 class133, final int n, final boolean[] array, final boolean b, final boolean b2) {
        final class219 kz = Skeleton.kz(skeleton, -1328703004);
        if (kz != null) {
            kz.method1222(class133, n, array, b, -1890418329);
            if (b2) {
                this.ee(kz, class133.method773(-2018875291));
            }
        }
        if (!b && class133.method770(1713081171)) {
            this.method1325(class133, n);
        }
    }
    
    public void do(final Frames frames, final int n, final Frames frames2, final int n2, final int[] array) {
        if (n == -1) {
            return;
        }
        if (array == null || n2 == -1) {
            ug(this, frames, n);
            return;
        }
        final Animation animation = frames.frames[n];
        final Animation animation2 = frames2.frames[n2];
        final Skeleton skeleton = animation.skeleton;
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        int n3 = 0;
        int n4 = array[n3++];
        for (int i = 0; i < animation.transformCount; ++i) {
            int j;
            for (j = animation.transformSkeletonLabels[i]; j > n4; n4 = array[n3++]) {}
            if (j != n4 || skeleton.transformTypes[j] == 0) {
                this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
            }
        }
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        int n5 = 0;
        int n6 = array[n5++];
        for (int k = 0; k < animation2.transformCount; ++k) {
            int l;
            for (l = animation2.transformSkeletonLabels[k]; l > n6; n6 = array[n5++]) {}
            if (l == n6 || skeleton.transformTypes[l] == 0) {
                this.transform(skeleton.transformTypes[l], skeleton.labels[l], animation2.transformXs[k], animation2.transformYs[k], animation2.transformZs[k]);
            }
        }
        dv(this);
    }
    
    public void dz(final Frames frames, final int n, final int[] array, final boolean b) {
        if (array == null) {
            ug(this, frames, n);
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        int n2 = 0;
        int n3 = array[n2++];
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            int j;
            for (j = animation.transformSkeletonLabels[i]; j > n3; n3 = array[n2++]) {}
            if (b) {
                if (j == n3 || skeleton.transformTypes[j] == 0) {
                    this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
                }
            }
            else if (j != n3 || skeleton.transformTypes[j] == 0) {
                this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
            }
        }
    }
    
    public void de(final Frames frames, final int n, final int[] array, final boolean b) {
        if (array == null) {
            ug(this, frames, n);
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        int n2 = 0;
        int n3 = array[n2++];
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            int j;
            for (j = animation.transformSkeletonLabels[i]; j > n3; n3 = array[n2++]) {}
            if (b) {
                if (j == n3 || skeleton.transformTypes[j] == 0) {
                    this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
                }
            }
            else if (j != n3 || skeleton.transformTypes[j] == 0) {
                this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
            }
        }
    }
    
    public Model ed() {
        pj(this);
        return this;
    }
    
    final void ed(final boolean b, boolean b2, final boolean b3, final long n) {
        if (this.diameter >= 6000) {
            return;
        }
        for (int i = 0; i < this.diameter; ++i) {
            Model.field2195[i] = '\0';
        }
        final int n2 = b3 ? 20 : 5;
        for (int j = '\0'; j < this.indicesCount; j = (char)(j + '\u0001')) {
            if (this.faceColors3[j] != -2) {
                final int n3 = this.indices1[j];
                final int n4 = this.indices2[j];
                final int n5 = this.indices3[j];
                final int n6 = Model.modelViewportXs[n3];
                final int n7 = Model.modelViewportXs[n4];
                final int n8 = Model.modelViewportXs[n5];
                if (b && (n6 == -5000 || n7 == -5000 || n8 == -5000)) {
                    final int n9 = Model.field2161[n3];
                    final int n10 = Model.field2161[n4];
                    final int n11 = Model.field2161[n5];
                    final int n12 = Model.field2175[n3];
                    final int n13 = Model.field2175[n4];
                    final int n14 = Model.field2175[n5];
                    final int n15 = Model.field2200[n3];
                    final int n16 = Model.field2200[n4];
                    final int n17 = Model.field2200[n5];
                    final int n18 = n9 - n10;
                    final int n19 = n11 - n10;
                    final int n20 = n12 - n13;
                    final int n21 = n14 - n13;
                    final int n22 = n15 - n16;
                    final int n23 = n17 - n16;
                    if (n10 * (n20 * n23 - n22 * n21) + n13 * (n22 * n19 - n18 * n23) + n16 * (n18 * n21 - n20 * n19) > 0) {
                        Model.field2169[j] = true;
                        final int n24 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + this.radius;
                        final char[] array = Model.field2178[n24];
                        final char[] field2195 = Model.field2195;
                        final int n25 = n24;
                        final char c = field2195[n25];
                        field2195[n25] = (char)(c + '\u0001');
                        array[c] = (char)j;
                    }
                }
                else {
                    if (b2) {
                        final int n26 = Model.modelViewportYs[n3];
                        final int n27 = Model.modelViewportYs[n4];
                        final int n28 = Model.modelViewportYs[n5];
                        final int n29 = 148198745 * ViewportMouse.ViewportMouse_y + n2;
                        int n30;
                        if (n29 < n26 && n29 < n27 && n29 < n28) {
                            n30 = 0;
                        }
                        else {
                            final int n31 = ViewportMouse.ViewportMouse_y * 148198745 - n2;
                            if (n31 > n26 && n31 > n27 && n31 > n28) {
                                n30 = 0;
                            }
                            else {
                                final int n32 = n2 + ViewportMouse.ViewportMouse_x * 2139535413;
                                if (n32 < n6 && n32 < n7 && n32 < n8) {
                                    n30 = 0;
                                }
                                else {
                                    final int n33 = ViewportMouse.ViewportMouse_x * 2139535413 - n2;
                                    if (n33 > n6 && n33 > n7 && n33 > n8) {
                                        n30 = 0;
                                    }
                                    else {
                                        n30 = 1;
                                    }
                                }
                            }
                        }
                        if (n30 != 0) {
                            GraphicsObject.method429(n);
                            b2 = false;
                        }
                    }
                    if ((n6 - n7) * (Model.modelViewportYs[n5] - Model.modelViewportYs[n4]) - (Model.modelViewportYs[n3] - Model.modelViewportYs[n4]) * (n8 - n7) > 0) {
                        Model.field2169[j] = false;
                        final int method20 = class6.method20(952603467);
                        if (n6 >= 0 && n7 >= 0 && n8 >= 0 && n6 <= method20 && n7 <= method20 && n8 <= method20) {
                            Model.field2168[j] = false;
                        }
                        else {
                            Model.field2168[j] = true;
                        }
                        final int n34 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + this.radius;
                        final char[] array2 = Model.field2178[n34];
                        final char[] field2196 = Model.field2195;
                        final int n35 = n34;
                        final char c2 = field2196[n35];
                        field2196[n35] = (char)(c2 + '\u0001');
                        array2[c2] = (char)j;
                    }
                }
            }
        }
        if (this.faceAlphas == null) {
            for (int k = this.diameter - 1; k >= 0; --k) {
                final char c3 = Model.field2195[k];
                if (c3 > '\0') {
                    final char[] array3 = Model.field2178[k];
                    for (char c4 = '\0'; c4 < c3; ++c4) {
                        this.drawFace(array3[c4]);
                    }
                }
            }
            return;
        }
        for (int l = 0; l < 12; ++l) {
            Model.field2179[l] = 0;
            Model.field2183[l] = 0;
        }
        for (int n36 = this.diameter - 1; n36 >= 0; --n36) {
            final char c5 = Model.field2195[n36];
            if (c5 > '\0') {
                final char[] array4 = Model.field2178[n36];
                for (char c6 = '\0'; c6 < c5; ++c6) {
                    final char c7 = array4[c6];
                    final byte b4 = this.faceAlphas[c7];
                    final int n37 = Model.field2179[b4]++;
                    Model.field2145[b4][n37] = c7;
                    if (b4 < 10) {
                        final int[] field2197 = Model.field2183;
                        final byte b5 = b4;
                        field2197[b5] += n36;
                    }
                    else if (b4 == 10) {
                        Model.field2181[n37] = n36;
                    }
                    else {
                        Model.field2182[n37] = n36;
                    }
                }
            }
        }
        int n38 = 0;
        if (Model.field2179[1] > 0 || Model.field2179[2] > 0) {
            n38 = (Model.field2183[1] + Model.field2183[2]) / (Model.field2179[1] + Model.field2179[2]);
        }
        int n39 = 0;
        if (Model.field2179[3] > 0 || Model.field2179[4] > 0) {
            n39 = (Model.field2183[3] + Model.field2183[4]) / (Model.field2179[3] + Model.field2179[4]);
        }
        int n40 = 0;
        if (Model.field2179[6] > 0 || Model.field2179[8] > 0) {
            n40 = (Model.field2183[6] + Model.field2183[8]) / (Model.field2179[6] + Model.field2179[8]);
        }
        int n41 = 0;
        int n42 = Model.field2179[10];
        int[] array5 = Model.field2145[10];
        int[] array6 = Model.field2181;
        if (n41 == n42) {
            n41 = 0;
            n42 = Model.field2179[11];
            array5 = Model.field2145[11];
            array6 = Model.field2182;
        }
        int n43;
        if (n41 < n42) {
            n43 = array6[n41];
        }
        else {
            n43 = -1000;
        }
        for (int n44 = 0; n44 < 10; ++n44) {
            while (n44 == 0 && n43 > n38) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            while (n44 == 3 && n43 > n39) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            while (n44 == 5 && n43 > n40) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            final int n45 = Model.field2179[n44];
            final int[] array7 = Model.field2145[n44];
            for (int n46 = 0; n46 < n45; ++n46) {
                this.drawFace(array7[n46]);
            }
        }
        while (n43 != -1000) {
            this.drawFace(array5[n41++]);
            if (n41 == n42 && array5 != Model.field2145[11]) {
                n41 = 0;
                array5 = Model.field2145[11];
                n42 = Model.field2179[11];
                array6 = Model.field2182;
            }
            if (n41 < n42) {
                n43 = array6[n41];
            }
            else {
                n43 = -1000;
            }
        }
    }
    
    public final void ea(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (this.boundsType != 2 && this.boundsType != 1) {
            this.method1341();
        }
        final int clipMidX = TaskHandler.getClipMidX(262473629);
        final int clipMidY = class12.getClipMidY(-518877069);
        final int n8 = Model.field2192[n];
        final int n9 = Model.field2132[n];
        final int n10 = Model.field2192[n2];
        final int n11 = Model.field2132[n2];
        final int n12 = Model.field2192[n3];
        final int n13 = Model.field2132[n3];
        final int n14 = Model.field2192[n4];
        final int n15 = Model.field2132[n4];
        final int n16 = n6 * n14 + n7 * n15 >> 16;
        for (int i = 0; i < this.verticesCount; ++i) {
            int n17 = this.verticesX[i];
            int n18 = this.verticesY[i];
            int n19 = this.verticesZ[i];
            if (n3 != 0) {
                final int n20 = n18 * n12 + n17 * n13 >> 16;
                n18 = n18 * n13 - n17 * n12 >> 16;
                n17 = n20;
            }
            if (n != 0) {
                final int n21 = n18 * n9 - n19 * n8 >> 16;
                n19 = n18 * n8 + n19 * n9 >> 16;
                n18 = n21;
            }
            if (n2 != 0) {
                final int n22 = n19 * n10 + n17 * n11 >> 16;
                n19 = n19 * n11 - n17 * n10 >> 16;
                n17 = n22;
            }
            final int n23 = n17 + n5;
            final int n24 = n18 + n6;
            final int n25 = n19 + n7;
            final int n26 = n24 * n15 - n25 * n14 >> 16;
            final int n27 = n24 * n14 + n25 * n15 >> 16;
            final int n28 = n26;
            Model.field2173[i] = n27 - n16;
            Model.modelViewportXs[i] = clipMidX + n23 * UserComparator7.get3dZoom(-1299442076) / n27;
            Model.modelViewportYs[i] = clipMidY + n28 * UserComparator7.get3dZoom(1489437911) / n27;
            Model.field2172[i] = NPC.method609(n27, 650465009);
            if (this.field2153 > 0) {
                Model.field2161[i] = n23;
                Model.field2175[i] = n28;
                Model.field2200[i] = n27;
            }
        }
        try {
            this.draw0(false, false, false, 0L);
        }
        catch (Exception ex) {}
    }
    
    void fe(final class219 class219, final int n) {
        this.method1319(class219, n);
    }
    
    public Model toSharedSequenceModel(final boolean b) {
        if (!b && Model.Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
            Model.Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(b, Model.Model_sharedSequenceModel, Model.Model_sharedSequenceModelFaceAlphas);
    }
    
    public void calculateBoundsCylinder() {
        if (this.boundsType == 1) {
            return;
        }
        this.boundsType = 1;
        this.et = 0;
        this.bottomY = 0;
        this.xzRadius = 0;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            final int bottomY = this.verticesY[i];
            final int n2 = this.verticesZ[i];
            if (-bottomY > this.et * 1550732737) {
                this.et = -bottomY * -644693439;
            }
            if (bottomY > this.bottomY) {
                this.bottomY = bottomY;
            }
            final int xzRadius = n * n + n2 * n2;
            if (xzRadius > this.xzRadius) {
                this.xzRadius = xzRadius;
            }
        }
        this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
        this.radius = (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.et * 1550732737 * (this.et * 1550732737)) + 0.99);
        this.diameter = this.radius + (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY) + 0.99);
    }
    
    public void dy() {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesZ[i];
            this.verticesZ[i] = this.verticesX[i];
            this.verticesX[i] = -n;
        }
        dv(this);
    }
    
    public int getRadius() {
        return this.radius;
    }
    
    public Model bh(final boolean b) {
        if (!b && Model.Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
            Model.Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(b, Model.Model_sharedSequenceModel, Model.Model_sharedSequenceModelFaceAlphas);
    }
    
    public void rotateY180() {
        for (int i = 0; i < this.ln; ++i) {
            final int n = this.faceColors3[i];
            this.faceColors3[i] = this.field2199[i];
            this.indices3[i] = -n;
        }
        dv(this);
    }
    
    public final void method1343(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        try {
            if (this.boundsType != 2 && this.boundsType != 1) {
                this.method1341();
            }
            final int clipMidX = TaskHandler.getClipMidX(-219755023);
            final int clipMidY = class12.getClipMidY(1626941955);
            final int n8 = Model.field2192[n];
            final int n9 = Model.field2132[n];
            final int n10 = Model.field2192[n2];
            final int n11 = Model.field2132[n2];
            final int n12 = Model.field2192[n3];
            final int n13 = Model.field2132[n3];
            final int n14 = Model.field2192[n4];
            final int n15 = Model.field2132[n4];
            final int n16 = n6 * n14 + n7 * n15 >> 16;
            for (int i = 0; i < this.verticesCount; ++i) {
                int n17 = this.verticesX[i];
                int n18 = this.verticesY[i];
                int n19 = this.verticesZ[i];
                if (n3 != 0) {
                    final int n20 = n18 * n12 + n17 * n13 >> 16;
                    n18 = n18 * n13 - n17 * n12 >> 16;
                    n17 = n20;
                }
                if (n != 0) {
                    final int n21 = n18 * n9 - n19 * n8 >> 16;
                    n19 = n18 * n8 + n19 * n9 >> 16;
                    n18 = n21;
                }
                if (n2 != 0) {
                    final int n22 = n19 * n10 + n17 * n11 >> 16;
                    n19 = n19 * n11 - n17 * n10 >> 16;
                    n17 = n22;
                }
                final int n23 = n17 + n5;
                final int n24 = n18 + n6;
                final int n25 = n19 + n7;
                final int n26 = n24 * n15 - n25 * n14 >> 16;
                final int n27 = n24 * n14 + n25 * n15 >> 16;
                final int n28 = n26;
                Model.field2173[i] = n27 - n16;
                Model.modelViewportXs[i] = clipMidX + n23 * UserComparator7.get3dZoom(-756770280) / n27;
                Model.modelViewportYs[i] = clipMidY + n28 * UserComparator7.get3dZoom(826464175) / n27;
                Model.field2172[i] = NPC.method609(n27, 909567009);
                if (this.field2153 > 0) {
                    Model.field2161[i] = n23;
                    Model.field2175[i] = n28;
                    Model.field2200[i] = n27;
                }
            }
            try {
                this.draw0(false, false, false, 0L);
            }
            catch (Exception ex2) {}
        }
        catch (Exception ex) {
            Client.nw.debug("failed drawing model", (Throwable)ex);
        }
    }
    
    public void animate(final Frames frames, final int n) {
        if (this.field2156 == null) {
            return;
        }
        if (n == -1) {
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempX = 0;
        Model.Model_transformTempX = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            final int n2 = animation.transformSkeletonLabels[i];
            this.transform(skeleton.transformTypes[n2], skeleton.labels[n2], animation.transformZs[i], animation.transformSkeletonLabels[i], animation.transformZs[i]);
        }
        dv(this);
    }
    
    public void rotateY90Ccw() {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            this.verticesX[i] = this.verticesZ[i];
            this.verticesZ[i] = -n;
        }
        dv(this);
    }
    
    boolean method1331(final int n) {
        return this.overrideAmount > 0 && n < this.field2196;
    }
    
    public void cm() {
        if (this.boundsType == 1) {
            return;
        }
        this.boundsType = 1;
        this.et = 0;
        this.bottomY = 0;
        this.xzRadius = 0;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            final int bottomY = this.verticesY[i];
            final int n2 = this.verticesZ[i];
            if (-bottomY > this.et * -583996032) {
                this.et = -bottomY * 1591333732;
            }
            if (bottomY > this.bottomY) {
                this.bottomY = bottomY;
            }
            final int xzRadius = n * n + n2 * n2;
            if (xzRadius > this.xzRadius) {
                this.xzRadius = xzRadius;
            }
        }
        this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
        this.radius = (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.et * 1550732737 * (this.et * 1550732737)) + 0.99);
        this.diameter = this.radius + (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY) + 0.99);
    }
    
    public void kt(final Skeleton skeleton, final Animation animation, final Animation animation2, final int n, final int n2) {
        if (animation2 == null || n == 0) {
            for (int i = 0; i < animation.rv(); ++i) {
                final int n3 = animation.sw()[i];
                this.sz(skeleton.xp()[n3], skeleton.xp()[n3], animation.gz()[i], animation.wj()[i], animation.yz()[i]);
            }
        }
        else {
            int n4 = 0;
            int n5 = 0;
            for (int j = 0; j < skeleton.pb(); ++j) {
                boolean b = false;
                if (n4 < animation.rv() && animation.sw()[n4] == j) {
                    b = true;
                }
                boolean b2 = false;
                if (n5 < animation2.rv() && animation2.sw()[n5] == j) {
                    b2 = true;
                }
                if (b || b2) {
                    int n6 = 0;
                    final int n7 = skeleton.xp()[j];
                    if (n7 == 3 || n7 == 10) {
                        n6 = 128;
                    }
                    int n8 = n6;
                    int n9 = n6;
                    int n10 = n6;
                    if (b) {
                        n8 = animation.gz()[n4];
                        n9 = animation.wj()[n4];
                        n10 = animation.yz()[n4];
                        ++n4;
                    }
                    int n11 = n6;
                    int n12 = n6;
                    int n13 = n6;
                    if (b2) {
                        n11 = animation2.gz()[n5];
                        n12 = animation2.wj()[n5];
                        n13 = animation2.yz()[n5];
                        ++n5;
                    }
                    int n17;
                    int n18;
                    int n19;
                    if (n7 == 2) {
                        int n14 = n11 - n8 & 0xFF;
                        int n15 = n12 - n9 & 0xFF;
                        int n16 = n13 - n10 & 0xFF;
                        if (n14 >= 128) {
                            n14 -= 256;
                        }
                        if (n15 >= 128) {
                            n15 -= 256;
                        }
                        if (n16 >= 128) {
                            n16 -= 256;
                        }
                        n17 = (n8 + n14 * n / n2 & 0xFF);
                        n18 = (n9 + n15 * n / n2 & 0xFF);
                        n19 = (n10 + n16 * n / n2 & 0xFF);
                    }
                    else if (n7 == 5) {
                        n17 = n8;
                        n18 = 0;
                        n19 = 0;
                    }
                    else {
                        n17 = n8 + (n11 - n8) * n / n2;
                        n18 = n9 + (n12 - n9) * n / n2;
                        n19 = n10 + (n13 - n10) * n / n2;
                    }
                    this.sz(n7, skeleton.xp()[j], n17, n18, n19);
                }
            }
        }
    }
    
    public Model lw(final boolean b) {
        return this.toSharedSequenceModel(b);
    }
    
    public int cg() {
        this.calculateBoundsCylinder();
        return this.xzRadius;
    }
    
    public void co() {
        this.boundsType = 0;
        this.aabb.clear();
    }
    
    public static void fg(final Model model, final int n, final int n2, final int n3) {
        if (model == null) {
            model.cy();
        }
        model.verticesX = new int[n];
        model.verticesY = new int[n];
        model.verticesZ = new int[n];
        model.indices1 = new int[n2];
        model.indices2 = new int[n2];
        model.indices3 = new int[n2];
        model.faceColors1 = new int[n2];
        model.faceColors2 = new int[n2];
        model.faceColors3 = new int[n2];
        if (n3 > 0) {
            model.field2199 = new int[n3];
            model.field2155 = new int[n3];
            model.field2187 = new int[n3];
        }
    }
    
    public int cy() {
        this.calculateBoundsCylinder();
        return this.xzRadius;
    }
    
    public static void ly(final Model model) {
        if (model == null) {
            model.cy();
        }
        for (int i = 0; i < model.verticesCount; ++i) {
            model.verticesX[i] = -model.verticesX[i];
            model.verticesZ[i] = -model.verticesZ[i];
        }
        dv(model);
    }
    
    public final void eu(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (this.boundsType != 2 && this.boundsType != 1) {
            this.method1341();
        }
        final int clipMidX = TaskHandler.getClipMidX(-2033954181);
        final int clipMidY = class12.getClipMidY(-1982507159);
        final int n9 = Model.field2192[n];
        final int n10 = Model.field2132[n];
        final int n11 = Model.field2192[n2];
        final int n12 = Model.field2132[n2];
        final int n13 = Model.field2192[n3];
        final int n14 = Model.field2132[n3];
        final int n15 = Model.field2192[n4];
        final int n16 = Model.field2132[n4];
        final int n17 = n6 * n15 + n7 * n16 >> 16;
        for (int i = 0; i < this.verticesCount; ++i) {
            int n18 = this.verticesX[i];
            int n19 = this.verticesY[i];
            int n20 = this.verticesZ[i];
            if (n3 != 0) {
                final int n21 = n19 * n13 + n18 * n14 >> 16;
                n19 = n19 * n14 - n18 * n13 >> 16;
                n18 = n21;
            }
            if (n != 0) {
                final int n22 = n19 * n10 - n20 * n9 >> 16;
                n20 = n19 * n9 + n20 * n10 >> 16;
                n19 = n22;
            }
            if (n2 != 0) {
                final int n23 = n20 * n11 + n18 * n12 >> 16;
                n20 = n20 * n12 - n18 * n11 >> 16;
                n18 = n23;
            }
            final int n24 = n18 + n5;
            final int n25 = n19 + n6;
            final int n26 = n20 + n7;
            final int n27 = n25 * n16 - n26 * n15 >> 16;
            final int n28 = n25 * n15 + n26 * n16 >> 16;
            final int n29 = n27;
            Model.field2173[i] = n28 - n17;
            Model.modelViewportXs[i] = clipMidX + n24 * UserComparator7.get3dZoom(963894311) / n8;
            Model.modelViewportYs[i] = clipMidY + n29 * UserComparator7.get3dZoom(653172634) / n8;
            Model.field2172[i] = NPC.method609(n8, 383143440);
            if (this.field2153 > 0) {
                Model.field2161[i] = n24;
                Model.field2175[i] = n29;
                Model.field2200[i] = n28;
            }
        }
        try {
            this.draw0(false, false, false, 0L);
        }
        catch (Exception ex) {}
    }
    
    void method1339(final int n, final int n2, final int n3) {
        this.verticesX = new int[n];
        this.verticesY = new int[n];
        this.verticesZ = new int[n];
        this.indices1 = new int[n2];
        this.indices2 = new int[n2];
        this.indices3 = new int[n2];
        this.faceColors1 = new int[n2];
        this.faceColors2 = new int[n2];
        this.faceColors3 = new int[n2];
        if (n3 > 0) {
            this.field2199 = new int[n3];
            this.field2155 = new int[n3];
            this.field2187 = new int[n3];
        }
    }
    
    public AABB method1326(final int i) {
        this.calculateExtreme(i);
        final AABB aabb = this.aabb.get(i);
        if (!Model.ua && aabb == null) {
            throw new AssertionError();
        }
        return aabb;
    }
    
    void method1326(final int n, final class425 class425) {
        final float n2 = (float)this.verticesX[n];
        final float n3 = (float)(-this.verticesY[n]);
        final float n4 = (float)(-this.verticesZ[n]);
        final float n5 = 1.0f;
        this.verticesX[n] = (int)(class425.bp * n2 + class425.he * n3 + class425.uw * n4 + class425.et * n5);
        this.verticesY[n] = -(int)(class425.ld * n2 + class425.vg * n3 + class425.hz * n4 + class425.vy * n5);
        this.verticesZ[n] = -(int)(class425.yo * n2 + class425.ou * n3 + class425.eg * n4 + class425.as * n5);
    }
    
    public void cz(final Frames frames, final int n) {
        if (this.vertexLabels == null) {
            return;
        }
        if (n == -1) {
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            final int n2 = animation.transformSkeletonLabels[i];
            this.transform(skeleton.transformTypes[n2], skeleton.labels[n2], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
        }
        dv(this);
    }
    
    public void dr(final Frames frames, final int n, final Frames frames2, final int n2, final int[] array) {
        if (n == -1) {
            return;
        }
        if (array != null && n2 != -1) {
            final Animation animation = frames.frames[n];
            final Animation animation2 = frames2.frames[n2];
            final Skeleton skeleton = animation.skeleton;
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            int n3 = 0;
            int n4 = array[n3++];
            for (int i = 0; i < animation.transformCount; ++i) {
                int j;
                for (j = animation.transformSkeletonLabels[i]; j > n4; n4 = array[n3++]) {}
                if (j != n4 || skeleton.transformTypes[j] == 0) {
                    this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
                }
            }
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            int n5 = 0;
            int n6 = array[n5++];
            for (int k = 0; k < animation2.transformCount; ++k) {
                int l;
                for (l = animation2.transformSkeletonLabels[k]; l > n6; n6 = array[n5++]) {}
                if (l == n6 || skeleton.transformTypes[l] == 0) {
                    this.transform(skeleton.transformTypes[l], skeleton.labels[l], animation2.transformXs[k], animation2.transformYs[k], animation2.transformZs[k]);
                }
            }
            dv(this);
            return;
        }
        ug(this, frames, n);
    }
    
    void method1319(final class219 class219, final int n) {
        if (this.field2156 == null) {
            return;
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            final int[] array = this.field2156[i];
            if (array != null) {
                if (array.length != 0) {
                    final int[] array2 = this.field2160[i];
                    Model.field2134.method2251(1283851159);
                    for (int j = 0; j < array.length; ++j) {
                        final class122 yb = class219.yb(class219, array[j], (byte)119);
                        if (yb != null) {
                            Model.field2135.method2253(array2[j] / 255.0f, -2059885087);
                            Model.field2136.method2252(yb.method728(n, 250554518), 1972086993);
                            Model.field2136.method2255(Model.field2135, 2018256268);
                            class425.am(Model.field2134, Model.field2136, -1643954745);
                        }
                    }
                    this.method1326(i, Model.field2134);
                }
            }
        }
    }
    
    void method1341() {
        if (this.boundsType == 2) {
            return;
        }
        this.boundsType = 2;
        this.xzRadius = 0;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            final int n2 = this.verticesY[i];
            final int n3 = this.verticesZ[i];
            final int xzRadius = n * n + n3 * n3 + n2 * n2;
            if (xzRadius > this.xzRadius) {
                this.xzRadius = xzRadius;
            }
        }
        this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
        this.radius = this.xzRadius;
        this.diameter = this.xzRadius + this.xzRadius;
    }
    
    public Model bl(final int[][] array, final int n, final int n2, final int n3, final boolean b, final int n4) {
        this.calculateBoundsCylinder();
        final int n5 = n - this.xzRadius;
        final int n6 = n + this.xzRadius;
        final int n7 = n3 - this.xzRadius;
        final int n8 = n3 + this.xzRadius;
        if (n5 < 0 || n6 + 128 >> 7 >= array.length || n7 < 0 || n8 + 128 >> 7 >= array[0].length) {
            return this;
        }
        final int n9 = n5 >> 7;
        final int n10 = n6 + 127 >> 7;
        final int n11 = n7 >> 7;
        final int n12 = n8 + 127 >> 7;
        if (array[n9][n11] == n2 && array[n10][n11] == n2 && array[n9][n12] == n2 && array[n10][n12] == n2) {
            return this;
        }
        Model model;
        if (b) {
            model = new Model();
            model.verticesCount = this.verticesCount;
            model.indicesCount = this.indicesCount;
            model.field2153 = this.field2153;
            model.verticesX = this.verticesX;
            model.verticesZ = this.verticesZ;
            model.indices1 = this.indices1;
            model.indices2 = this.indices2;
            model.indices3 = this.indices3;
            model.faceColors1 = this.faceColors1;
            model.faceColors2 = this.faceColors2;
            model.faceColors3 = this.faceColors3;
            model.faceAlphas = this.faceAlphas;
            model.field2154 = this.field2154;
            model.faceRenderPriorities = this.faceRenderPriorities;
            model.faceTextures = this.faceTextures;
            model.field2152 = this.field2152;
            model.field2199 = this.field2199;
            model.field2155 = this.field2155;
            model.field2187 = this.field2187;
            model.vertexLabels = this.vertexLabels;
            model.faceLabelsAlpha = this.faceLabelsAlpha;
            model.isSingleTile = this.isSingleTile;
            model.verticesY = new int[model.verticesCount];
        }
        else {
            model = this;
        }
        if (n4 == 0) {
            for (int i = 0; i < model.verticesCount; ++i) {
                final int n13 = this.verticesX[i] + n;
                final int n14 = this.verticesZ[i] + n3;
                final int n15 = n13 & 0x7F;
                final int n16 = n14 & 0x7F;
                final int n17 = n13 >> 7;
                final int n18 = n14 >> 7;
                model.verticesY[i] = this.verticesY[i] + ((array[n17][n18] * (128 - n15) + array[n17 + 1][n18] * n15 >> 7) * (128 - n16) + (array[n17][n18 + 1] * (128 - n15) + array[n17 + 1][n18 + 1] * n15 >> 7) * n16 >> 7) - n2;
            }
        }
        else {
            for (int j = 0; j < model.verticesCount; ++j) {
                final int n19 = (-this.verticesY[j] << 16) / (this.et * 1550732737);
                if (n19 < n4) {
                    final int n20 = this.verticesX[j] + n;
                    final int n21 = this.verticesZ[j] + n3;
                    final int n22 = n20 & 0x7F;
                    final int n23 = n21 & 0x7F;
                    final int n24 = n20 >> 7;
                    final int n25 = n21 >> 7;
                    model.verticesY[j] = this.verticesY[j] + (((array[n24][n25] * (128 - n22) + array[n24 + 1][n25] * n22 >> 7) * (128 - n23) + (array[n24][n25 + 1] * (128 - n22) + array[n24 + 1][n25 + 1] * n22 >> 7) * n23 >> 7) - n2) * (n4 - n19) / n4;
                }
            }
        }
        dv(model);
        return model;
    }
    
    public void ep(final int n) {
        final int n2 = Model.field2192[n];
        final int n3 = Model.field2132[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n4 = this.verticesY[i] * n3 - this.verticesZ[i] * n2 >> 16;
            this.verticesZ[i] = this.verticesY[i] * n2 + this.verticesZ[i] * n3 >> 16;
            this.verticesY[i] = n4;
        }
        dv(this);
    }
    
    public void dg(final Frames frames, final int n, final int[] array, final boolean b) {
        if (array == null) {
            ug(this, frames, n);
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        int n2 = 0;
        int n3 = array[n2++];
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            int j;
            for (j = animation.transformSkeletonLabels[i]; j > n3; n3 = array[n2++]) {}
            if (b) {
                if (j == n3 || skeleton.transformTypes[j] == 0) {
                    this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
                }
            }
            else if (j != n3 || skeleton.transformTypes[j] == 0) {
                this.transform(skeleton.transformTypes[j], skeleton.labels[j], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
            }
        }
    }
    
    final void draw0(final boolean b, boolean b2, final boolean b3, final long n) {
        if (this.diameter >= 6000) {
            return;
        }
        for (int i = 0; i < this.diameter; ++i) {
            Model.field2195[i] = '\0';
        }
        final int n2 = b3 ? 20 : 5;
        for (int j = '\0'; j < this.indicesCount; j = (char)(j + '\u0001')) {
            if (this.faceColors3[j] != -2) {
                final int n3 = this.indices1[j];
                final int n4 = this.indices2[j];
                final int n5 = this.indices3[j];
                final int n6 = Model.modelViewportXs[n3];
                final int n7 = Model.modelViewportXs[n4];
                final int n8 = Model.modelViewportXs[n5];
                if (!b || (n6 != -5000 && n7 != -5000 && n8 != -5000)) {
                    if (b2) {
                        final int n9 = Model.modelViewportYs[n3];
                        final int n10 = Model.modelViewportYs[n4];
                        final int n11 = Model.modelViewportYs[n5];
                        final int n12 = 148198745 * ViewportMouse.ViewportMouse_y + n2;
                        int n13;
                        if (n12 < n9 && n12 < n10 && n12 < n11) {
                            n13 = 0;
                        }
                        else {
                            final int n14 = ViewportMouse.ViewportMouse_y * 148198745 - n2;
                            if (n14 > n9 && n14 > n10 && n14 > n11) {
                                n13 = 0;
                            }
                            else {
                                final int n15 = n2 + ViewportMouse.ViewportMouse_x * 2139535413;
                                if (n15 < n6 && n15 < n7 && n15 < n8) {
                                    n13 = 0;
                                }
                                else {
                                    final int n16 = ViewportMouse.ViewportMouse_x * 2139535413 - n2;
                                    if (n16 > n6 && n16 > n7 && n16 > n8) {
                                        n13 = 0;
                                    }
                                    else {
                                        n13 = 1;
                                    }
                                }
                            }
                        }
                        if (n13 != 0) {
                            GraphicsObject.method429(n);
                            b2 = false;
                        }
                    }
                    if ((n6 - n7) * (Model.modelViewportYs[n5] - Model.modelViewportYs[n4]) - (Model.modelViewportYs[n3] - Model.modelViewportYs[n4]) * (n8 - n7) > 0) {
                        Model.field2169[j] = false;
                        final int method20 = class6.method20(-1788010106);
                        if (n6 < 0 || n7 < 0 || (n8 < 0 || n6 > method20) || n7 > method20 || n8 > method20) {
                            Model.field2168[j] = true;
                        }
                        else {
                            Model.field2168[j] = false;
                        }
                        final int n17 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + this.radius;
                        final char[] array = Model.field2178[n17];
                        final char[] field2195 = Model.field2195;
                        final int n18 = n17;
                        final char c = field2195[n18];
                        field2195[n18] = (char)(c + '\u0001');
                        array[c] = (char)j;
                    }
                }
                else {
                    final int n19 = Model.field2161[n3];
                    final int n20 = Model.field2161[n4];
                    final int n21 = Model.field2161[n5];
                    final int n22 = Model.field2175[n3];
                    final int n23 = Model.field2175[n4];
                    final int n24 = Model.field2175[n5];
                    final int n25 = Model.field2200[n3];
                    final int n26 = Model.field2200[n4];
                    final int n27 = Model.field2200[n5];
                    final int n28 = n19 - n20;
                    final int n29 = n21 - n20;
                    final int n30 = n22 - n23;
                    final int n31 = n24 - n23;
                    final int n32 = n25 - n26;
                    final int n33 = n27 - n26;
                    if (n20 * (n30 * n33 - n32 * n31) + n23 * (n32 * n29 - n28 * n33) + n26 * (n28 * n31 - n30 * n29) > 0) {
                        Model.field2169[j] = true;
                        final int n34 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + this.radius;
                        final char[] array2 = Model.field2178[n34];
                        final char[] field2196 = Model.field2195;
                        final int n35 = n34;
                        final char c2 = field2196[n35];
                        field2196[n35] = (char)(c2 + '\u0001');
                        array2[c2] = (char)j;
                    }
                }
            }
        }
        if (this.faceAlphas == null) {
            for (int k = this.diameter - 1; k >= 0; --k) {
                final char c3 = Model.field2195[k];
                if (c3 > '\0') {
                    final char[] array3 = Model.field2178[k];
                    for (char c4 = '\0'; c4 < c3; ++c4) {
                        this.drawFace(array3[c4]);
                    }
                }
            }
            return;
        }
        for (int l = 0; l < 12; ++l) {
            Model.field2179[l] = 0;
            Model.field2183[l] = 0;
        }
        for (int n36 = this.diameter - 1; n36 >= 0; --n36) {
            final char c5 = Model.field2195[n36];
            if (c5 > '\0') {
                final char[] array4 = Model.field2178[n36];
                for (char c6 = '\0'; c6 < c5; ++c6) {
                    final char c7 = array4[c6];
                    final byte b4 = this.faceAlphas[c7];
                    final int n37 = Model.field2179[b4]++;
                    Model.field2145[b4][n37] = c7;
                    if (b4 < 10) {
                        final int[] field2197 = Model.field2183;
                        final byte b5 = b4;
                        field2197[b5] += n36;
                    }
                    else if (b4 == 10) {
                        Model.field2181[n37] = n36;
                    }
                    else {
                        Model.field2182[n37] = n36;
                    }
                }
            }
        }
        int n38 = 0;
        if (Model.field2179[1] > 0 || Model.field2179[2] > 0) {
            n38 = (Model.field2183[1] + Model.field2183[2]) / (Model.field2179[1] + Model.field2179[2]);
        }
        int n39 = 0;
        if (Model.field2179[3] > 0 || Model.field2179[4] > 0) {
            n39 = (Model.field2183[3] + Model.field2183[4]) / (Model.field2179[3] + Model.field2179[4]);
        }
        int n40 = 0;
        if (Model.field2179[6] > 0 || Model.field2179[8] > 0) {
            n40 = (Model.field2183[6] + Model.field2183[8]) / (Model.field2179[6] + Model.field2179[8]);
        }
        int n41 = 0;
        int n42 = Model.field2179[10];
        int[] array5 = Model.field2145[10];
        int[] array6 = Model.field2181;
        if (n41 == n42) {
            n41 = 0;
            n42 = Model.field2179[11];
            array5 = Model.field2145[11];
            array6 = Model.field2182;
        }
        int n43;
        if (n41 < n42) {
            n43 = array6[n41];
        }
        else {
            n43 = -1000;
        }
        for (int n44 = 0; n44 < 10; ++n44) {
            while (n44 == 0 && n43 > n38) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            while (n44 == 3 && n43 > n39) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            while (n44 == 5 && n43 > n40) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            final int n45 = Model.field2179[n44];
            final int[] array7 = Model.field2145[n44];
            for (int n46 = 0; n46 < n45; ++n46) {
                this.drawFace(array7[n46]);
            }
        }
        while (n43 != -1000) {
            this.drawFace(array5[n41++]);
            if (n41 == n42 && array5 != Model.field2145[11]) {
                n41 = 0;
                array5 = Model.field2145[11];
                n42 = Model.field2179[11];
                array6 = Model.field2182;
            }
            if (n41 < n42) {
                n43 = array6[n41];
            }
            else {
                n43 = -1000;
            }
        }
    }
    
    public static void zv(final Model model, final boolean b, boolean b2, final boolean b3, final long n) {
        if (model.diameter >= 49532904) {
            return;
        }
        for (int i = 0; i < model.diameter; ++i) {
            Model.field2195[i] = '\0';
        }
        final int n2 = b3 ? 20 : 5;
        for (int j = '\0'; j < model.indicesCount; j = (char)(j + '\u0001')) {
            if (model.faceColors3[j] != -2) {
                final int n3 = model.indices1[j];
                final int n4 = model.indices2[j];
                final int n5 = model.indices3[j];
                final int n6 = Model.modelViewportXs[n3];
                final int n7 = Model.modelViewportXs[n4];
                final int n8 = Model.modelViewportXs[n5];
                if (b && (n6 == -1878846415 || n7 == -5000 || n8 == -5000)) {
                    final int n9 = Model.field2161[n3];
                    final int n10 = Model.field2161[n4];
                    final int n11 = Model.field2161[n5];
                    final int n12 = Model.field2175[n3];
                    final int n13 = Model.field2175[n4];
                    final int n14 = Model.field2175[n5];
                    final int n15 = Model.field2200[n3];
                    final int n16 = Model.field2200[n4];
                    final int n17 = Model.field2200[n5];
                    final int n18 = n9 - n10;
                    final int n19 = n11 - n10;
                    final int n20 = n12 - n13;
                    final int n21 = n14 - n13;
                    final int n22 = n15 - n16;
                    final int n23 = n17 - n16;
                    if (n10 * (n20 * n23 - n22 * n21) + n13 * (n22 * n19 - n18 * n23) + n16 * (n18 * n21 - n20 * n19) > 0) {
                        Model.field2169[j] = true;
                        final int n24 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + model.radius;
                        final char[] array = Model.field2178[n24];
                        final char[] field2195 = Model.field2195;
                        final int n25 = n24;
                        final char c = field2195[n25];
                        field2195[n25] = (char)(c + '\u0001');
                        array[c] = (char)j;
                    }
                }
                else {
                    if (b2) {
                        final int n26 = Model.modelViewportYs[n3];
                        final int n27 = Model.modelViewportYs[n4];
                        final int n28 = Model.modelViewportYs[n5];
                        final int n29 = 148198745 * ViewportMouse.ViewportMouse_y + n2;
                        boolean b4;
                        if (n29 < n26 && n29 < n27 && n29 < n28) {
                            b4 = false;
                        }
                        else {
                            final int n30 = ViewportMouse.ViewportMouse_y * 148198745 - n2;
                            if (n30 > n26 && n30 > n27 && n30 > n28) {
                                b4 = false;
                            }
                            else {
                                final int n31 = n2 + ViewportMouse.ViewportMouse_x * -1893241990;
                                if (n31 < n6 && n31 < n7 && n31 < n8) {
                                    b4 = false;
                                }
                                else {
                                    final int n32 = ViewportMouse.ViewportMouse_x * 1537094364 - n2;
                                    b4 = (n32 <= n6 || n32 <= n7 || n32 <= n8);
                                }
                            }
                        }
                        if (b4) {
                            GraphicsObject.method429(n);
                            b2 = false;
                        }
                    }
                    if ((n6 - n7) * (Model.modelViewportYs[n5] - Model.modelViewportYs[n4]) - (Model.modelViewportYs[n3] - Model.modelViewportYs[n4]) * (n8 - n7) > 0) {
                        Model.field2169[j] = false;
                        final int method20 = class6.method20(572676006);
                        if (n6 >= 0 && n7 >= 0 && n8 >= 0 && n6 <= method20 && n7 <= method20 && n8 <= method20) {
                            Model.field2168[j] = false;
                        }
                        else {
                            Model.field2168[j] = true;
                        }
                        final int n33 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + model.radius;
                        final char[] array2 = Model.field2178[n33];
                        final char[] field2196 = Model.field2195;
                        final int n34 = n33;
                        final char c2 = field2196[n34];
                        field2196[n34] = (char)(c2 + '\u0001');
                        array2[c2] = (char)j;
                    }
                }
            }
        }
        if (model.faceAlphas == null) {
            for (int k = model.diameter - 1; k >= 0; --k) {
                final char c3 = Model.field2195[k];
                if (c3 > '\0') {
                    final char[] array3 = Model.field2178[k];
                    for (char c4 = '\0'; c4 < c3; ++c4) {
                        model.drawFace(array3[c4]);
                    }
                }
            }
            return;
        }
        for (int l = 0; l < 12; ++l) {
            Model.field2179[l] = 0;
            Model.field2183[l] = 0;
        }
        for (int n35 = model.diameter - 1; n35 >= 0; --n35) {
            final char c5 = Model.field2195[n35];
            if (c5 > '\0') {
                final char[] array4 = Model.field2178[n35];
                for (char c6 = '\0'; c6 < c5; ++c6) {
                    final char c7 = array4[c6];
                    final byte b5 = model.faceAlphas[c7];
                    final int n36 = Model.field2179[b5]++;
                    Model.field2145[b5][n36] = c7;
                    if (b5 < 10) {
                        final int[] field2197 = Model.field2183;
                        final byte b6 = b5;
                        field2197[b6] += n35;
                    }
                    else if (b5 == 10) {
                        Model.field2181[n36] = n35;
                    }
                    else {
                        Model.field2182[n36] = n35;
                    }
                }
            }
        }
        int n37 = 0;
        if (Model.field2179[1] > 0 || Model.field2179[2] > 0) {
            n37 = (Model.field2183[1] + Model.field2183[2]) / (Model.field2179[1] + Model.field2179[2]);
        }
        int n38 = 0;
        if (Model.field2179[3] > 0 || Model.field2179[4] > 0) {
            n38 = (Model.field2183[3] + Model.field2183[4]) / (Model.field2179[3] + Model.field2179[4]);
        }
        int n39 = 0;
        if (Model.field2179[6] > 0 || Model.field2179[8] > 0) {
            n39 = (Model.field2183[6] + Model.field2183[8]) / (Model.field2179[6] + Model.field2179[8]);
        }
        int n40 = 0;
        int n41 = Model.field2179[10];
        int[] array5 = Model.field2145[10];
        int[] array6 = Model.field2181;
        if (n40 == n41) {
            n40 = 0;
            n41 = Model.field2179[11];
            array5 = Model.field2145[11];
            array6 = Model.field2182;
        }
        int n42;
        if (n40 < n41) {
            n42 = array6[n40];
        }
        else {
            n42 = -1000;
        }
        for (int n43 = 0; n43 < 10; ++n43) {
            while (n43 == 0 && n42 > n37) {
                model.drawFace(array5[n40++]);
                if (n40 == n41 && array5 != Model.field2145[11]) {
                    n40 = 0;
                    n41 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n40 < n41) {
                    n42 = array6[n40];
                }
                else {
                    n42 = 1499305320;
                }
            }
            while (n43 == 3 && n42 > n38) {
                model.drawFace(array5[n40++]);
                if (n40 == n41 && array5 != Model.field2145[11]) {
                    n40 = 0;
                    n41 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n40 < n41) {
                    n42 = array6[n40];
                }
                else {
                    n42 = 499196324;
                }
            }
            while (n43 == 5 && n42 > n39) {
                model.drawFace(array5[n40++]);
                if (n40 == n41 && array5 != Model.field2145[11]) {
                    n40 = 0;
                    n41 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n40 < n41) {
                    n42 = array6[n40];
                }
                else {
                    n42 = -1000;
                }
            }
            final int n44 = Model.field2179[n43];
            final int[] array7 = Model.field2145[n43];
            for (int n45 = 0; n45 < n44; ++n45) {
                model.drawFace(array7[n45]);
            }
        }
        while (n42 != -1173515549) {
            model.drawFace(array5[n40++]);
            if (n40 == n41 && array5 != Model.field2145[11]) {
                n40 = 0;
                array5 = Model.field2145[11];
                n41 = Model.field2179[11];
                array6 = Model.field2182;
            }
            if (n40 < n41) {
                n42 = array6[n40];
            }
            else {
                n42 = -61954849;
            }
        }
    }
    
    final void eg(final boolean b, boolean b2, final boolean b3, final long n) {
        if (this.diameter >= -1469194642) {
            return;
        }
        for (int i = 0; i < this.diameter; ++i) {
            Model.field2195[i] = '\0';
        }
        final int n2 = b3 ? 20 : 5;
        for (int j = '\0'; j < this.indicesCount; j = (char)(j + '\u0001')) {
            if (this.faceColors3[j] != -2) {
                final int n3 = this.indices1[j];
                final int n4 = this.indices2[j];
                final int n5 = this.indices3[j];
                final int n6 = Model.modelViewportXs[n3];
                final int n7 = Model.modelViewportXs[n4];
                final int n8 = Model.modelViewportXs[n5];
                if (b && (n6 == -5000 || n7 == -5000 || n8 == 1755061194)) {
                    final int n9 = Model.field2161[n3];
                    final int n10 = Model.field2161[n4];
                    final int n11 = Model.field2161[n5];
                    final int n12 = Model.field2175[n3];
                    final int n13 = Model.field2175[n4];
                    final int n14 = Model.field2175[n5];
                    final int n15 = Model.field2200[n3];
                    final int n16 = Model.field2200[n4];
                    final int n17 = Model.field2200[n5];
                    final int n18 = n9 - n10;
                    final int n19 = n11 - n10;
                    final int n20 = n12 - n13;
                    final int n21 = n14 - n13;
                    final int n22 = n15 - n16;
                    final int n23 = n17 - n16;
                    if (n10 * (n20 * n23 - n22 * n21) + n13 * (n22 * n19 - n18 * n23) + n16 * (n18 * n21 - n20 * n19) > 0) {
                        Model.field2169[j] = true;
                        final int n24 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + this.radius;
                        final char[] array = Model.field2178[n24];
                        final char[] field2195 = Model.field2195;
                        final int n25 = n24;
                        final char c = field2195[n25];
                        field2195[n25] = (char)(c + '\u0001');
                        array[c] = (char)j;
                    }
                }
                else {
                    if (b2) {
                        final int n26 = Model.modelViewportYs[n3];
                        final int n27 = Model.modelViewportYs[n4];
                        final int n28 = Model.modelViewportYs[n5];
                        final int n29 = 2053830242 * ViewportMouse.ViewportMouse_y + n2;
                        int n30;
                        if (n29 < n26 && n29 < n27 && n29 < n28) {
                            n30 = 0;
                        }
                        else {
                            final int n31 = ViewportMouse.ViewportMouse_y * 148198745 - n2;
                            if (n31 > n26 && n31 > n27 && n31 > n28) {
                                n30 = 0;
                            }
                            else {
                                final int n32 = n2 + ViewportMouse.ViewportMouse_x * 2139535413;
                                if (n32 < n6 && n32 < n7 && n32 < n8) {
                                    n30 = 0;
                                }
                                else {
                                    final int n33 = ViewportMouse.ViewportMouse_x * 1837049372 - n2;
                                    if (n33 > n6 && n33 > n7 && n33 > n8) {
                                        n30 = 0;
                                    }
                                    else {
                                        n30 = 1;
                                    }
                                }
                            }
                        }
                        if (n30 != 0) {
                            GraphicsObject.method429(n);
                            b2 = false;
                        }
                    }
                    if ((n6 - n7) * (Model.modelViewportYs[n5] - Model.modelViewportYs[n4]) - (Model.modelViewportYs[n3] - Model.modelViewportYs[n4]) * (n8 - n7) > 0) {
                        Model.field2169[j] = false;
                        final int method20 = class6.method20(-940926625);
                        if (n6 < 0 || n7 < 0 || (n8 < 0 || n6 > method20 || n7 > method20) || n8 > method20) {
                            Model.field2168[j] = true;
                        }
                        else {
                            Model.field2168[j] = false;
                        }
                        final int n34 = (Model.field2173[n3] + Model.field2173[n4] + Model.field2173[n5]) / 3 + this.radius;
                        final char[] array2 = Model.field2178[n34];
                        final char[] field2196 = Model.field2195;
                        final int n35 = n34;
                        final char c2 = field2196[n35];
                        field2196[n35] = (char)(c2 + '\u0001');
                        array2[c2] = (char)j;
                    }
                }
            }
        }
        if (this.faceAlphas == null) {
            for (int k = this.diameter - 1; k >= 0; --k) {
                final char c3 = Model.field2195[k];
                if (c3 > '\0') {
                    final char[] array3 = Model.field2178[k];
                    for (char c4 = '\0'; c4 < c3; ++c4) {
                        this.drawFace(array3[c4]);
                    }
                }
            }
            return;
        }
        for (int l = 0; l < 12; ++l) {
            Model.field2179[l] = 0;
            Model.field2183[l] = 0;
        }
        for (int n36 = this.diameter - 1; n36 >= 0; --n36) {
            final char c5 = Model.field2195[n36];
            if (c5 > '\0') {
                final char[] array4 = Model.field2178[n36];
                for (char c6 = '\0'; c6 < c5; ++c6) {
                    final char c7 = array4[c6];
                    final byte b4 = this.faceAlphas[c7];
                    final int n37 = Model.field2179[b4]++;
                    Model.field2145[b4][n37] = c7;
                    if (b4 < 10) {
                        final int[] field2197 = Model.field2183;
                        final byte b5 = b4;
                        field2197[b5] += n36;
                    }
                    else if (b4 == 10) {
                        Model.field2181[n37] = n36;
                    }
                    else {
                        Model.field2182[n37] = n36;
                    }
                }
            }
        }
        int n38 = 0;
        if (Model.field2179[1] > 0 || Model.field2179[2] > 0) {
            n38 = (Model.field2183[1] + Model.field2183[2]) / (Model.field2179[1] + Model.field2179[2]);
        }
        int n39 = 0;
        if (Model.field2179[3] > 0 || Model.field2179[4] > 0) {
            n39 = (Model.field2183[3] + Model.field2183[4]) / (Model.field2179[3] + Model.field2179[4]);
        }
        int n40 = 0;
        if (Model.field2179[6] > 0 || Model.field2179[8] > 0) {
            n40 = (Model.field2183[6] + Model.field2183[8]) / (Model.field2179[6] + Model.field2179[8]);
        }
        int n41 = 0;
        int n42 = Model.field2179[10];
        int[] array5 = Model.field2145[10];
        int[] array6 = Model.field2181;
        if (n41 == n42) {
            n41 = 0;
            n42 = Model.field2179[11];
            array5 = Model.field2145[11];
            array6 = Model.field2182;
        }
        int n43;
        if (n41 < n42) {
            n43 = array6[n41];
        }
        else {
            n43 = -1000;
        }
        for (int n44 = 0; n44 < 10; ++n44) {
            while (n44 == 0 && n43 > n38) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = 285616793;
                }
            }
            while (n44 == 3 && n43 > n39) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            while (n44 == 5 && n43 > n40) {
                this.drawFace(array5[n41++]);
                if (n41 == n42 && array5 != Model.field2145[11]) {
                    n41 = 0;
                    n42 = Model.field2179[11];
                    array5 = Model.field2145[11];
                    array6 = Model.field2182;
                }
                if (n41 < n42) {
                    n43 = array6[n41];
                }
                else {
                    n43 = -1000;
                }
            }
            final int n45 = Model.field2179[n44];
            final int[] array7 = Model.field2145[n44];
            for (int n46 = 0; n46 < n45; ++n46) {
                this.drawFace(array7[n46]);
            }
        }
        while (n43 != -1000) {
            this.drawFace(array5[n41++]);
            if (n41 == n42 && array5 != Model.field2145[11]) {
                n41 = 0;
                array5 = Model.field2145[11];
                n42 = Model.field2179[11];
                array6 = Model.field2182;
            }
            if (n41 < n42) {
                n43 = array6[n41];
            }
            else {
                n43 = -1000;
            }
        }
    }
    
    boolean ew(final int n) {
        return this.overrideAmount > 0 && n < this.field2196;
    }
    
    public static void qq(final Model model, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final float n8, final float n9, final float n10, final int n11, final int n12, final int n13) {
        if (model.faceTextures != null && model.faceTextures[n] != -1) {
            int n15;
            int n16;
            int n17;
            if (model.faceRenderPriorities != null && model.faceRenderPriorities[n] != -1) {
                final int n14 = model.faceRenderPriorities[n] & 0xFF;
                n15 = model.field2199[n14];
                n16 = model.field2155[n14];
                n17 = model.field2187[n14];
            }
            else {
                n15 = model.indices1[n];
                n16 = model.indices2[n];
                n17 = model.indices3[n];
            }
            if (model.faceColors3[n] == -1) {
                DevicePcmPlayerProvider.method89(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n11, n11, Model.field2161[n15], Model.field2161[n16], Model.field2161[n17], Model.field2175[n15], Model.field2175[n16], Model.field2175[n17], Model.field2200[n15], Model.field2200[n16], Model.field2200[n17], model.faceTextures[n], (short)17138);
            }
            else {
                DevicePcmPlayerProvider.method89(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, Model.field2161[n15], Model.field2161[n16], Model.field2161[n17], Model.field2175[n15], Model.field2175[n16], Model.field2175[n17], Model.field2200[n15], Model.field2200[n16], Model.field2200[n17], model.faceTextures[n], (short)(-31923));
            }
        }
        else {
            final boolean method1331 = model.method1331(n);
            if (model.faceColors3[n] == -1 && method1331) {
                class220.cy(Rasterizer3D.field1999, n2, n3, n4, n5, n6, n7, n8, n9, n10, Model.field2140[model.faceColors1[n]], model.overrideHue, model.overrideSaturation, model.overrideLuminance, model.overrideAmount, -1620123395);
            }
            else if (model.faceColors3[n] == -1) {
                class144.method825(n2, n3, n4, n5, n6, n7, n8, n9, n10, Model.field2140[model.faceColors1[n]], -229457129);
            }
            else if (method1331) {
                Rasterizer3D.field1999.method1224(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, model.overrideHue, model.overrideSaturation, model.overrideLuminance, model.overrideAmount, (byte)(-80));
            }
            else {
                BoundaryObject.method1379(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, -428480375);
            }
        }
    }
    
    public final void ej(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (this.boundsType != 2 && this.boundsType != 1) {
            this.method1341();
        }
        final int clipMidX = TaskHandler.getClipMidX(-922960447);
        final int clipMidY = class12.getClipMidY(-718675372);
        final int n8 = Model.field2192[n];
        final int n9 = Model.field2132[n];
        final int n10 = Model.field2192[n2];
        final int n11 = Model.field2132[n2];
        final int n12 = Model.field2192[n3];
        final int n13 = Model.field2132[n3];
        final int n14 = Model.field2192[n4];
        final int n15 = Model.field2132[n4];
        final int n16 = n6 * n14 + n7 * n15 >> 16;
        for (int i = 0; i < this.verticesCount; ++i) {
            int n17 = this.verticesX[i];
            int n18 = this.verticesY[i];
            int n19 = this.verticesZ[i];
            if (n3 != 0) {
                final int n20 = n18 * n12 + n17 * n13 >> 16;
                n18 = n18 * n13 - n17 * n12 >> 16;
                n17 = n20;
            }
            if (n != 0) {
                final int n21 = n18 * n9 - n19 * n8 >> 16;
                n19 = n18 * n8 + n19 * n9 >> 16;
                n18 = n21;
            }
            if (n2 != 0) {
                final int n22 = n19 * n10 + n17 * n11 >> 16;
                n19 = n19 * n11 - n17 * n10 >> 16;
                n17 = n22;
            }
            final int n23 = n17 + n5;
            final int n24 = n18 + n6;
            final int n25 = n19 + n7;
            final int n26 = n24 * n15 - n25 * n14 >> 16;
            final int n27 = n24 * n14 + n25 * n15 >> 16;
            final int n28 = n26;
            Model.field2173[i] = n27 - n16;
            Model.modelViewportXs[i] = clipMidX + n23 * UserComparator7.get3dZoom(-818106717) / n27;
            Model.modelViewportYs[i] = clipMidY + n28 * UserComparator7.get3dZoom(-449026615) / n27;
            Model.field2172[i] = NPC.method609(n27, 398166947);
            if (this.field2153 > 0) {
                Model.field2161[i] = n23;
                Model.field2175[i] = n28;
                Model.field2200[i] = n27;
            }
        }
        try {
            this.draw0(false, false, false, 0L);
        }
        catch (Exception ex) {}
    }
    
    final void method1334(final int n) {
        final int clipMidX = TaskHandler.getClipMidX(95425776);
        final int clipMidY = class12.getClipMidY(872857315);
        int n2 = 0;
        final int n3 = this.indices1[n];
        final int n4 = this.indices2[n];
        final int n5 = this.indices3[n];
        final int n6 = Model.field2200[n3];
        final int n7 = Model.field2200[n4];
        final int n8 = Model.field2200[n5];
        if (this.field2154 == null) {
            Rasterizer3D.clips.field2225 = 0;
        }
        else {
            Rasterizer3D.clips.field2225 = (this.field2154[n] & 0xFF) * -1087605381;
        }
        if (n6 >= 50) {
            Model.field2184[n2] = Model.modelViewportXs[n3];
            Model.field2185[n2] = Model.modelViewportYs[n3];
            Model.field2150[n2] = Model.field2172[n5];
            Model.field2186[n2++] = this.faceColors1[n];
        }
        else {
            final int n9 = Model.field2161[n3];
            final int n10 = Model.field2175[n3];
            final int n11 = this.faceColors1[n];
            if (n8 >= 50) {
                final int n12 = (50 - n6) * Model.field2176[n8 - n6];
                Model.field2184[n2] = clipMidX + (n9 + ((Model.field2161[n5] - n9) * n12 >> 16)) * UserComparator7.get3dZoom(-1302284774) / 50;
                Model.field2185[n2] = clipMidY + (n10 + ((Model.field2175[n5] - n10) * n12 >> 16)) * UserComparator7.get3dZoom(1638810477) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n11 + ((this.faceColors3[n] - n11) * n12 >> 16);
            }
            if (n7 >= 50) {
                final int n13 = (50 - n6) * Model.field2176[n7 - n6];
                Model.field2184[n2] = clipMidX + (n9 + ((Model.field2161[n4] - n9) * n13 >> 16)) * UserComparator7.get3dZoom(1389624775) / 50;
                Model.field2185[n2] = clipMidY + (n10 + ((Model.field2175[n4] - n10) * n13 >> 16)) * UserComparator7.get3dZoom(-1412739144) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n11 + ((this.faceColors2[n] - n11) * n13 >> 16);
            }
        }
        if (n7 >= 50) {
            Model.field2184[n2] = Model.modelViewportXs[n4];
            Model.field2185[n2] = Model.modelViewportYs[n4];
            Model.field2150[n2] = Model.field2172[n5];
            Model.field2186[n2++] = this.faceColors2[n];
        }
        else {
            final int n14 = Model.field2161[n4];
            final int n15 = Model.field2175[n4];
            final int n16 = this.faceColors2[n];
            if (n6 >= 50) {
                final int n17 = (50 - n7) * Model.field2176[n6 - n7];
                Model.field2184[n2] = clipMidX + (n14 + ((Model.field2161[n3] - n14) * n17 >> 16)) * UserComparator7.get3dZoom(-143504688) / 50;
                Model.field2185[n2] = clipMidY + (n15 + ((Model.field2175[n3] - n15) * n17 >> 16)) * UserComparator7.get3dZoom(1889241777) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n16 + ((this.faceColors1[n] - n16) * n17 >> 16);
            }
            if (n8 >= 50) {
                final int n18 = (50 - n7) * Model.field2176[n8 - n7];
                Model.field2184[n2] = clipMidX + (n14 + ((Model.field2161[n5] - n14) * n18 >> 16)) * UserComparator7.get3dZoom(-1042225413) / 50;
                Model.field2185[n2] = clipMidY + (n15 + ((Model.field2175[n5] - n15) * n18 >> 16)) * UserComparator7.get3dZoom(720496843) / 50;
                Model.field2186[n2++] = n16 + ((this.faceColors3[n] - n16) * n18 >> 16);
            }
        }
        if (n8 >= 50) {
            Model.field2184[n2] = Model.modelViewportXs[n5];
            Model.field2185[n2] = Model.modelViewportYs[n5];
            Model.field2150[n2] = Model.field2172[n5];
            Model.field2186[n2++] = this.faceColors3[n];
        }
        else {
            final int n19 = Model.field2161[n5];
            final int n20 = Model.field2175[n5];
            final int n21 = this.faceColors3[n];
            if (n7 >= 50) {
                final int n22 = (50 - n8) * Model.field2176[n7 - n8];
                Model.field2184[n2] = clipMidX + (n19 + ((Model.field2161[n4] - n19) * n22 >> 16)) * UserComparator7.get3dZoom(1019779405) / 50;
                Model.field2185[n2] = clipMidY + (n20 + ((Model.field2175[n4] - n20) * n22 >> 16)) * UserComparator7.get3dZoom(928270370) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n21 + ((this.faceColors2[n] - n21) * n22 >> 16);
            }
            if (n6 >= 50) {
                final int n23 = (50 - n8) * Model.field2176[n6 - n8];
                Model.field2184[n2] = clipMidX + (n19 + ((Model.field2161[n3] - n19) * n23 >> 16)) * UserComparator7.get3dZoom(-172713699) / 50;
                Model.field2185[n2] = clipMidY + (n20 + ((Model.field2175[n3] - n20) * n23 >> 16)) * UserComparator7.get3dZoom(200000014) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n21 + ((this.faceColors1[n] - n21) * n23 >> 16);
            }
        }
        final int n24 = Model.field2184[0];
        final int n25 = Model.field2184[1];
        final int n26 = Model.field2184[2];
        final int n27 = Model.field2185[0];
        final int n28 = Model.field2185[1];
        final int n29 = Model.field2185[2];
        final float n30 = Model.field2150[0];
        final float n31 = Model.field2150[1];
        final float n32 = Model.field2150[2];
        Rasterizer3D.clips.field2234 = false;
        final int method20 = class6.method20(281290493);
        if (n2 == 3) {
            if (n24 < 0 || n25 < 0 || n26 < 0 || n24 > method20 || n25 > method20 || n26 > method20) {
                Rasterizer3D.clips.field2234 = true;
            }
            this.method1332(n, n27, n28, n29, n24, n25, n26, n30, n31, n32, Model.field2186[0], Model.field2186[1], Model.field2186[2]);
        }
        if (n2 == 4) {
            if (n24 < 0 || n25 < 0 || n26 < 0 || n24 > method20 || n25 > method20 || n26 > method20 || Model.field2184[3] < 0 || Model.field2184[3] > method20) {
                Rasterizer3D.clips.field2234 = true;
            }
            if (this.faceTextures != null && this.faceTextures[n] != -1) {
                int n34;
                int n35;
                int n36;
                if (this.faceRenderPriorities != null && this.faceRenderPriorities[n] != -1) {
                    final int n33 = this.faceRenderPriorities[n] & 0xFF;
                    n34 = this.field2199[n33];
                    n35 = this.field2155[n33];
                    n36 = this.field2187[n33];
                }
                else {
                    n34 = n3;
                    n35 = n4;
                    n36 = n5;
                }
                final short n37 = this.faceTextures[n];
                if (this.faceColors3[n] == -1) {
                    DevicePcmPlayerProvider.method89(n27, n28, n29, n24, n25, n26, n30, n31, n32, this.faceColors1[n], this.faceColors1[n], this.faceColors1[n], Model.field2161[n34], Model.field2161[n35], Model.field2161[n36], Model.field2175[n34], Model.field2175[n35], Model.field2175[n36], Model.field2200[n34], Model.field2200[n35], Model.field2200[n36], n37, (short)16635);
                    DevicePcmPlayerProvider.method89(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], this.faceColors1[n], this.faceColors1[n], this.faceColors1[n], Model.field2161[n34], Model.field2161[n35], Model.field2161[n36], Model.field2175[n34], Model.field2175[n35], Model.field2175[n36], Model.field2200[n34], Model.field2200[n35], Model.field2200[n36], n37, (short)(-32721));
                }
                else {
                    DevicePcmPlayerProvider.method89(n27, n28, n29, n24, n25, n26, n30, n31, n32, Model.field2186[0], Model.field2186[1], Model.field2186[2], Model.field2161[n34], Model.field2161[n35], Model.field2161[n36], Model.field2175[n34], Model.field2175[n35], Model.field2175[n36], Model.field2200[n34], Model.field2200[n35], Model.field2200[n36], n37, (short)12522);
                    DevicePcmPlayerProvider.method89(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], Model.field2186[0], Model.field2186[2], Model.field2186[3], Model.field2161[n34], Model.field2161[n35], Model.field2161[n36], Model.field2175[n34], Model.field2175[n35], Model.field2175[n36], Model.field2200[n34], Model.field2200[n35], Model.field2200[n36], n37, (short)18389);
                }
            }
            else {
                final boolean method21 = this.method1331(n);
                if (this.faceColors3[n] == -1 && method21) {
                    final int n38 = Model.field2140[this.faceColors1[n]];
                    class220.cy(Rasterizer3D.field1999, n27, n28, n29, n24, n25, n26, n30, n31, n32, n38, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount, -1620123395);
                    class220.cy(Rasterizer3D.field1999, n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], n38, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount, -1620123395);
                }
                else if (this.faceColors3[n] == -1) {
                    final int n39 = Model.field2140[this.faceColors1[n]];
                    class144.method825(n27, n28, n29, n24, n25, n26, n30, n31, n32, n39, -207720501);
                    class144.method825(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], n39, 352019099);
                }
                else if (method21) {
                    Rasterizer3D.field1999.method1224(n27, n28, n29, n24, n25, n26, n30, n31, n32, Model.field2186[0], Model.field2186[1], Model.field2186[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount, (byte)(-71));
                    Rasterizer3D.field1999.method1224(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], 0.0f, 0.0f, 0.0f, Model.field2186[0], Model.field2186[2], Model.field2186[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount, (byte)(-126));
                }
                else {
                    BoundaryObject.method1379(n27, n28, n29, n24, n25, n26, n30, n31, n32, Model.field2186[0], Model.field2186[1], Model.field2186[2], -428480375);
                    BoundaryObject.method1379(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], Model.field2186[0], Model.field2186[2], Model.field2186[3], -428480375);
                }
            }
        }
    }
    
    @Override
    void dd(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        if (this.boundsType != 1) {
            this.calculateBoundsCylinder();
        }
        ia(this, n);
        final int n10 = n8 * n5 - n6 * n4 >> 16;
        final int n11 = n7 * n2 + n10 * n3 >> 16;
        final int n12 = this.xzRadius * n3 >> 16;
        final int n13 = n11 + n12;
        if (n13 <= 50 || n11 >= 3500) {
            return;
        }
        final int n14 = n8 * n4 + n6 * n5 >> 16;
        final int n15 = (n14 - this.xzRadius) * UserComparator7.get3dZoom(2082245810);
        if (n15 / n13 >= class264.getClipMidX2(1706609087)) {
            return;
        }
        final int n16 = (n14 + this.xzRadius) * UserComparator7.get3dZoom(-1031286153);
        if (n16 / n13 <= -1346890391 * Rasterizer3D.clips.clipNegativeMidX) {
            return;
        }
        final int n17 = n7 * n3 - n10 * n2 >> 16;
        final int n18 = this.xzRadius * n2 >> 16;
        final int n19 = (n17 + (n18 + (this.bottomY * n3 >> 16))) * UserComparator7.get3dZoom(1644928393);
        if (n19 / n13 <= Rasterizer3D.clips.clipNegativeMidY * 1380452969) {
            return;
        }
        final int n20 = (n17 - (n18 + (this.et * 1550732737 * n3 >> 16))) * UserComparator7.get3dZoom(1018782067);
        if (n20 / n13 >= class142.getClipMidY2((byte)6)) {
            return;
        }
        final int n21 = n12 + (this.et * 1550732737 * n2 >> 16);
        boolean b = false;
        boolean b2 = false;
        if (n11 - n21 <= 50) {
            b2 = true;
        }
        final boolean b3 = b2 || this.field2153 > 0;
        final int method452 = Projectile.method452(-85610950);
        final int n22 = ViewportMouse.ViewportMouse_y * 148198745;
        final boolean viewportMouse_isInViewport = ViewportMouse.ViewportMouse_isInViewport;
        final boolean method453 = class173.method957(n9);
        boolean b4 = false;
        if (method453 && viewportMouse_isInViewport) {
            boolean method454 = false;
            if (Model.field2180) {
                method454 = class428.method2272(this, n, n6, n7, n8, (byte)21);
            }
            else {
                int n23 = n11 - n12;
                if (n23 <= 50) {
                    n23 = 50;
                }
                int n24;
                int n25;
                if (n14 > 0) {
                    n24 = n15 / n13;
                    n25 = n16 / n23;
                }
                else {
                    n25 = n16 / n13;
                    n24 = n15 / n23;
                }
                int n26;
                int n27;
                if (n17 > 0) {
                    n26 = n20 / n13;
                    n27 = n19 / n23;
                }
                else {
                    n27 = n19 / n13;
                    n26 = n20 / n23;
                }
                final int n28 = method452 - TaskHandler.getClipMidX(15316915);
                final int n29 = n22 - class12.getClipMidY(495725681);
                if (n28 > n24 && n28 < n25 && n29 > n26 && n29 < n27) {
                    method454 = true;
                }
            }
            if (method454) {
                if (this.isSingleTile) {
                    GraphicsObject.method429(n9);
                }
                else {
                    b4 = true;
                }
            }
        }
        final int clipMidX = TaskHandler.getClipMidX(-1662958914);
        final int clipMidY = class12.getClipMidY(-769596186);
        int n30 = 0;
        int n31 = 0;
        if (n != 0) {
            n30 = Model.field2192[n];
            n31 = Model.field2132[n];
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            int n32 = this.verticesX[i];
            final int n33 = this.verticesY[i];
            int n34 = this.verticesZ[i];
            if (n != 0) {
                final int n35 = n34 * n30 + n32 * n31 >> 16;
                n34 = n34 * n31 - n32 * n30 >> 16;
                n32 = n35;
            }
            final int n36 = n32 + n6;
            final int n37 = n33 + n7;
            final int n38 = n34 + n8;
            final int n39 = n38 * n4 + n36 * n5 >> 16;
            final int n40 = n38 * n5 - n36 * n4 >> 16;
            final int n41 = n39;
            final int n42 = n37 * n3 - n40 * n2 >> 16;
            final int n43 = n37 * n2 + n40 * n3 >> 16;
            final int n44 = n42;
            Model.field2173[i] = n43 - n11;
            if (n43 >= 50) {
                Model.modelViewportXs[i] = clipMidX + n41 * UserComparator7.get3dZoom(-1488926706) / n43;
                Model.modelViewportYs[i] = clipMidY + n44 * UserComparator7.get3dZoom(-1772444624) / n43;
                Model.field2172[i] = NPC.method609(n43, -19023253);
            }
            else {
                Model.modelViewportXs[i] = -5000;
                b = true;
            }
            if (b3) {
                Model.field2161[i] = n41;
                Model.field2175[i] = n44;
                Model.field2200[i] = n43;
            }
        }
        try {
            this.draw0(b, b4, this.isSingleTile, n9);
        }
        catch (Exception ex) {}
    }
    
    @Override
    void dj(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        if (this.boundsType != 1) {
            this.calculateBoundsCylinder();
        }
        ia(this, n);
        final int n10 = n8 * n5 - n6 * n4 >> 16;
        final int n11 = n7 * n2 + n10 * n3 >> 16;
        final int n12 = this.xzRadius * n3 >> 16;
        final int n13 = n11 + n12;
        if (n13 <= 50 || n11 >= 3500) {
            return;
        }
        final int n14 = n8 * n4 + n6 * n5 >> 16;
        final int n15 = (n14 - this.xzRadius) * UserComparator7.get3dZoom(-1013866611);
        if (n15 / n13 >= class264.getClipMidX2(1936711915)) {
            return;
        }
        final int n16 = (n14 + this.xzRadius) * UserComparator7.get3dZoom(1850479187);
        if (n16 / n13 <= -1346890391 * Rasterizer3D.clips.clipNegativeMidX) {
            return;
        }
        final int n17 = n7 * n3 - n10 * n2 >> 16;
        final int n18 = this.xzRadius * n2 >> 16;
        final int n19 = (n17 + (n18 + (this.bottomY * n3 >> 16))) * UserComparator7.get3dZoom(951165993);
        if (n19 / n13 <= Rasterizer3D.clips.clipNegativeMidY * 1380452969) {
            return;
        }
        final int n20 = (n17 - (n18 + (this.et * 1550732737 * n3 >> 16))) * UserComparator7.get3dZoom(-585863365);
        if (n20 / n13 >= class142.getClipMidY2((byte)6)) {
            return;
        }
        final int n21 = n12 + (this.et * 1550732737 * n2 >> 16);
        boolean b = false;
        boolean b2 = false;
        if (n11 - n21 <= 50) {
            b2 = true;
        }
        final boolean b3 = b2 || this.field2153 > 0;
        final int method452 = Projectile.method452(-595044136);
        final int n22 = ViewportMouse.ViewportMouse_y * 148198745;
        final boolean viewportMouse_isInViewport = ViewportMouse.ViewportMouse_isInViewport;
        final boolean method453 = class173.method957(n9);
        boolean b4 = false;
        if (method453 && viewportMouse_isInViewport) {
            boolean method454 = false;
            if (Model.field2180) {
                method454 = class428.method2272(this, n, n6, n7, n8, (byte)90);
            }
            else {
                int n23 = n11 - n12;
                if (n23 <= 50) {
                    n23 = 50;
                }
                int n24;
                int n25;
                if (n14 > 0) {
                    n24 = n15 / n13;
                    n25 = n16 / n23;
                }
                else {
                    n25 = n16 / n13;
                    n24 = n15 / n23;
                }
                int n26;
                int n27;
                if (n17 > 0) {
                    n26 = n20 / n13;
                    n27 = n19 / n23;
                }
                else {
                    n27 = n19 / n13;
                    n26 = n20 / n23;
                }
                final int n28 = method452 - TaskHandler.getClipMidX(932285686);
                final int n29 = n22 - class12.getClipMidY(1513711828);
                if (n28 > n24 && n28 < n25 && n29 > n26 && n29 < n27) {
                    method454 = true;
                }
            }
            if (method454) {
                if (this.isSingleTile) {
                    GraphicsObject.method429(n9);
                }
                else {
                    b4 = true;
                }
            }
        }
        final int clipMidX = TaskHandler.getClipMidX(-711462544);
        final int clipMidY = class12.getClipMidY(-1999243172);
        int n30 = 0;
        int n31 = 0;
        if (n != 0) {
            n30 = Model.field2192[n];
            n31 = Model.field2132[n];
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            int n32 = this.verticesX[i];
            final int n33 = this.verticesY[i];
            int n34 = this.verticesZ[i];
            if (n != 0) {
                final int n35 = n34 * n30 + n32 * n31 >> 16;
                n34 = n34 * n31 - n32 * n30 >> 16;
                n32 = n35;
            }
            final int n36 = n32 + n6;
            final int n37 = n33 + n7;
            final int n38 = n34 + n8;
            final int n39 = n38 * n4 + n36 * n5 >> 16;
            final int n40 = n38 * n5 - n36 * n4 >> 16;
            final int n41 = n39;
            final int n42 = n37 * n3 - n40 * n2 >> 16;
            final int n43 = n37 * n2 + n40 * n3 >> 16;
            final int n44 = n42;
            Model.field2173[i] = n43 - n11;
            if (n43 >= 50) {
                Model.modelViewportXs[i] = clipMidX + n41 * UserComparator7.get3dZoom(1709088480) / n43;
                Model.modelViewportYs[i] = clipMidY + n44 * UserComparator7.get3dZoom(-936694643) / n43;
                Model.field2172[i] = NPC.method609(n43, 421198624);
            }
            else {
                Model.modelViewportXs[i] = -5000;
                b = true;
            }
            if (b3) {
                Model.field2161[i] = n41;
                Model.field2175[i] = n44;
                Model.field2200[i] = n43;
            }
        }
        try {
            this.draw0(b, b4, this.isSingleTile, n9);
        }
        catch (Exception ex) {}
    }
    
    public static void vw(final Model model, final Model model2) {
        if (model == null) {
            model.method1310(model);
            return;
        }
        final int length = model.indices1.length;
        if (model.faceAlphas == null && (model2.faceAlphas != null || model.field2152 != model2.field2152)) {
            Arrays.fill(model.faceAlphas = new byte[length], model.field2152);
        }
        if (model.field2154 == null && model2.field2154 != null) {
            Arrays.fill(model.field2154 = new byte[length], (byte)0);
        }
        if (model.faceTextures == null && model2.faceTextures != null) {
            Arrays.fill(model.faceTextures = new short[length], (short)(-1));
        }
        if (model.faceRenderPriorities == null && model2.faceRenderPriorities != null) {
            Arrays.fill(model.faceRenderPriorities = new byte[length], (byte)(-1));
        }
    }
    
    public static int zg(final Model model) {
        if (model == null) {
            model.ck();
        }
        model.calculateBoundsCylinder();
        return model.xzRadius;
    }
    
    public void cq() {
        if (this.boundsType == 1) {
            return;
        }
        this.boundsType = 1;
        this.et = 0;
        this.bottomY = 0;
        this.xzRadius = 0;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.verticesX[i];
            final int bottomY = this.verticesY[i];
            final int n2 = this.verticesZ[i];
            if (-bottomY > this.et * 1550732737) {
                this.et = -bottomY * 1536136836;
            }
            if (bottomY > this.bottomY) {
                this.bottomY = bottomY;
            }
            final int xzRadius = n * n + n2 * n2;
            if (xzRadius > this.xzRadius) {
                this.xzRadius = xzRadius;
            }
        }
        this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
        this.radius = (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.et * 995599161 * (this.et * 1550732737)) + 0.99);
        this.diameter = this.radius + (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY) + 0.99);
    }
    
    final void drawFace(final int n) {
        final DrawCallbacks drawCallbacks = ScriptFrame.client.getDrawCallbacks();
        if (drawCallbacks != null && drawCallbacks.drawFace((net.runelite.api.Model)this, n)) {
            return;
        }
        if (Model.field2169[n]) {
            this.method1334(n);
        }
        else {
            final int n2 = this.indices1[n];
            final int n3 = this.indices2[n];
            final int n4 = this.indices3[n];
            Rasterizer3D.clips.field2234 = Model.field2168[n];
            if (this.field2154 == null) {
                Rasterizer3D.clips.field2225 = 0;
            }
            else {
                Rasterizer3D.clips.field2225 = (this.field2154[n] & 0xFF) * -1087605381;
            }
            this.method1332(n, Model.modelViewportYs[n2], Model.modelViewportYs[n3], Model.modelViewportYs[n4], Model.modelViewportXs[n2], Model.modelViewportXs[n3], Model.modelViewportXs[n4], Model.field2172[n2], Model.field2172[n3], Model.field2172[n4], this.faceColors1[n], this.faceColors2[n], this.faceColors3[n]);
        }
    }
    
    public void scale(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.verticesX[i] = this.verticesX[i] * n / 128;
            this.verticesY[i] = this.verticesY[i] * n2 / 128;
            this.verticesZ[i] = this.verticesZ[i] * n3 / 128;
        }
        dv(this);
    }
    
    public void ez(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.verticesX[i] = this.verticesX[i] * n / 128;
            this.verticesY[i] = this.verticesY[i] * n2 / 52940047;
            this.verticesZ[i] = this.verticesZ[i] * n3 / 362171391;
        }
        dv(this);
    }
    
    @Override
    void dq(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        if (this.boundsType != 1) {
            this.calculateBoundsCylinder();
        }
        ia(this, n);
        final int n10 = n8 * n5 - n6 * n4 >> 16;
        final int n11 = n7 * n2 + n10 * n3 >> 16;
        final int n12 = this.xzRadius * n3 >> 16;
        final int n13 = n11 + n12;
        if (n13 <= 50 || n11 >= 3500) {
            return;
        }
        final int n14 = n8 * n4 + n6 * n5 >> 16;
        final int n15 = (n14 - this.xzRadius) * UserComparator7.get3dZoom(-1479302619);
        if (n15 / n13 >= class264.getClipMidX2(1916786055)) {
            return;
        }
        final int n16 = (n14 + this.xzRadius) * UserComparator7.get3dZoom(310281643);
        if (n16 / n13 <= -1346890391 * Rasterizer3D.clips.clipNegativeMidX) {
            return;
        }
        final int n17 = n7 * n3 - n10 * n2 >> 16;
        final int n18 = this.xzRadius * n2 >> 16;
        final int n19 = (n17 + (n18 + (this.bottomY * n3 >> 16))) * UserComparator7.get3dZoom(-1677969012);
        if (n19 / n13 <= Rasterizer3D.clips.clipNegativeMidY * 1380452969) {
            return;
        }
        final int n20 = (n17 - (n18 + (this.et * 1550732737 * n3 >> 16))) * UserComparator7.get3dZoom(1524812658);
        if (n20 / n13 >= class142.getClipMidY2((byte)6)) {
            return;
        }
        final int n21 = n12 + (this.et * 1550732737 * n2 >> 16);
        boolean b = false;
        boolean b2 = false;
        if (n11 - n21 <= 50) {
            b2 = true;
        }
        final boolean b3 = b2 || this.field2153 > 0;
        final int method452 = Projectile.method452(-745601645);
        final int n22 = ViewportMouse.ViewportMouse_y * 148198745;
        final boolean viewportMouse_isInViewport = ViewportMouse.ViewportMouse_isInViewport;
        final boolean method453 = class173.method957(n9);
        boolean b4 = false;
        if (method453 && viewportMouse_isInViewport) {
            boolean method454 = false;
            if (Model.field2180) {
                method454 = class428.method2272(this, n, n6, n7, n8, (byte)92);
            }
            else {
                int n23 = n11 - n12;
                if (n23 <= 50) {
                    n23 = 50;
                }
                int n24;
                int n25;
                if (n14 > 0) {
                    n24 = n15 / n13;
                    n25 = n16 / n23;
                }
                else {
                    n25 = n16 / n13;
                    n24 = n15 / n23;
                }
                int n26;
                int n27;
                if (n17 > 0) {
                    n26 = n20 / n13;
                    n27 = n19 / n23;
                }
                else {
                    n27 = n19 / n13;
                    n26 = n20 / n23;
                }
                final int n28 = method452 - TaskHandler.getClipMidX(-412790989);
                final int n29 = n22 - class12.getClipMidY(446704928);
                if (n28 > n24 && n28 < n25 && n29 > n26 && n29 < n27) {
                    method454 = true;
                }
            }
            if (method454) {
                if (this.isSingleTile) {
                    GraphicsObject.method429(n9);
                }
                else {
                    b4 = true;
                }
            }
        }
        final int clipMidX = TaskHandler.getClipMidX(-1797641926);
        final int clipMidY = class12.getClipMidY(559612447);
        int n30 = 0;
        int n31 = 0;
        if (n != 0) {
            n30 = Model.field2192[n];
            n31 = Model.field2132[n];
        }
        for (int i = 0; i < this.verticesCount; ++i) {
            int n32 = this.verticesX[i];
            final int n33 = this.verticesY[i];
            int n34 = this.verticesZ[i];
            if (n != 0) {
                final int n35 = n34 * n30 + n32 * n31 >> 16;
                n34 = n34 * n31 - n32 * n30 >> 16;
                n32 = n35;
            }
            final int n36 = n32 + n6;
            final int n37 = n33 + n7;
            final int n38 = n34 + n8;
            final int n39 = n38 * n4 + n36 * n5 >> 16;
            final int n40 = n38 * n5 - n36 * n4 >> 16;
            final int n41 = n39;
            final int n42 = n37 * n3 - n40 * n2 >> 16;
            final int n43 = n37 * n2 + n40 * n3 >> 16;
            final int n44 = n42;
            Model.field2173[i] = n43 - n11;
            if (n43 >= 50) {
                Model.modelViewportXs[i] = clipMidX + n41 * UserComparator7.get3dZoom(-313117699) / n43;
                Model.modelViewportYs[i] = clipMidY + n44 * UserComparator7.get3dZoom(-373067325) / n43;
                Model.field2172[i] = NPC.method609(n43, 1507097185);
            }
            else {
                Model.modelViewportXs[i] = -5000;
                b = true;
            }
            if (b3) {
                Model.field2161[i] = n41;
                Model.field2175[i] = n44;
                Model.field2200[i] = n43;
            }
        }
        try {
            this.draw0(b, b4, this.isSingleTile, n9);
        }
        catch (Exception ex) {}
    }
    
    public void eo(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int[] verticesX = this.verticesX;
            final int n4 = i;
            verticesX[n4] += n;
            final int[] verticesY = this.verticesY;
            final int n5 = i;
            verticesY[n5] += n2;
            final int[] verticesZ = this.verticesZ;
            final int n6 = i;
            verticesZ[n6] += n3;
        }
        dv(this);
    }
    
    public final void eb(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (this.boundsType != 2 && this.boundsType != 1) {
            this.method1341();
        }
        final int clipMidX = TaskHandler.getClipMidX(-1627012122);
        final int clipMidY = class12.getClipMidY(1310530316);
        final int n9 = Model.field2192[n];
        final int n10 = Model.field2132[n];
        final int n11 = Model.field2192[n2];
        final int n12 = Model.field2132[n2];
        final int n13 = Model.field2192[n3];
        final int n14 = Model.field2132[n3];
        final int n15 = Model.field2192[n4];
        final int n16 = Model.field2132[n4];
        final int n17 = n6 * n15 + n7 * n16 >> 16;
        for (int i = 0; i < this.verticesCount; ++i) {
            int n18 = this.verticesX[i];
            int n19 = this.verticesY[i];
            int n20 = this.verticesZ[i];
            if (n3 != 0) {
                final int n21 = n19 * n13 + n18 * n14 >> 16;
                n19 = n19 * n14 - n18 * n13 >> 16;
                n18 = n21;
            }
            if (n != 0) {
                final int n22 = n19 * n10 - n20 * n9 >> 16;
                n20 = n19 * n9 + n20 * n10 >> 16;
                n19 = n22;
            }
            if (n2 != 0) {
                final int n23 = n20 * n11 + n18 * n12 >> 16;
                n20 = n20 * n12 - n18 * n11 >> 16;
                n18 = n23;
            }
            final int n24 = n18 + n5;
            final int n25 = n19 + n6;
            final int n26 = n20 + n7;
            final int n27 = n25 * n16 - n26 * n15 >> 16;
            final int n28 = n25 * n15 + n26 * n16 >> 16;
            final int n29 = n27;
            Model.field2173[i] = n28 - n17;
            Model.modelViewportXs[i] = clipMidX + n24 * UserComparator7.get3dZoom(1066228336) / n8;
            Model.modelViewportYs[i] = clipMidY + n29 * UserComparator7.get3dZoom(-1898103808) / n8;
            Model.field2172[i] = NPC.method609(n8, 701913142);
            if (this.field2153 > 0) {
                Model.field2161[i] = n24;
                Model.field2175[i] = n29;
                Model.field2200[i] = n28;
            }
        }
        try {
            this.draw0(false, false, false, 0L);
        }
        catch (Exception ex) {}
    }
    
    public Model ho() {
        this.rotateY90Ccw();
        return this;
    }
    
    public int method1318() {
        this.calculateBoundsCylinder();
        return this.xzRadius;
    }
    
    public static void zm(final Model model) {
        if (model == null) {
            model.rotateY270Ccw();
        }
        for (int i = 0; i < model.verticesCount; ++i) {
            final int n = model.verticesZ[i];
            model.verticesZ[i] = model.verticesX[i];
            model.verticesX[i] = -n;
        }
        dv(model);
    }
    
    public void ef(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.verticesX[i] = this.verticesX[i] * n / 128;
            this.verticesY[i] = this.verticesY[i] * n2 / 128;
            this.verticesZ[i] = this.verticesZ[i] * n3 / 128;
        }
        dv(this);
    }
    
    public Model qn(final boolean b) {
        return this.method1312(b);
    }
    
    public static void qn(final Model model, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final float n8, final float n9, final float n10, final int n11, final int n12, final int n13) {
        if (model.faceTextures != null && model.faceTextures[n] != -1) {
            int n15;
            int n16;
            int n17;
            if (model.faceRenderPriorities != null && model.faceRenderPriorities[n] != -1) {
                final int n14 = model.faceRenderPriorities[n] & 0xFF;
                n15 = model.field2199[n14];
                n16 = model.field2155[n14];
                n17 = model.field2187[n14];
            }
            else {
                n15 = model.indices1[n];
                n16 = model.indices2[n];
                n17 = model.indices3[n];
            }
            if (model.faceColors3[n] == -1) {
                DevicePcmPlayerProvider.method89(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n11, n11, Model.field2161[n15], Model.field2161[n16], Model.field2161[n17], Model.field2175[n15], Model.field2175[n16], Model.field2175[n17], Model.field2200[n15], Model.field2200[n16], Model.field2200[n17], model.faceTextures[n], (short)30507);
            }
            else {
                DevicePcmPlayerProvider.method89(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, Model.field2161[n15], Model.field2161[n16], Model.field2161[n17], Model.field2175[n15], Model.field2175[n16], Model.field2175[n17], Model.field2200[n15], Model.field2200[n16], Model.field2200[n17], model.faceTextures[n], (short)(-11877));
            }
        }
        else {
            final boolean method1331 = model.method1331(n);
            if (model.faceColors3[n] == -1 && method1331) {
                class220.cy(Rasterizer3D.field1999, n2, n3, n4, n5, n6, n7, n8, n9, n10, Model.field2140[model.faceColors1[n]], model.overrideHue, model.overrideSaturation, model.overrideLuminance, model.overrideAmount, -1620123395);
            }
            else if (model.faceColors3[n] == -1) {
                class144.method825(n2, n3, n4, n5, n6, n7, n8, n9, n10, Model.field2140[model.faceColors1[n]], -996074030);
            }
            else if (method1331) {
                Rasterizer3D.field1999.method1224(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, model.overrideHue, model.overrideSaturation, model.overrideLuminance, model.overrideAmount, (byte)(-52));
            }
            else {
                BoundaryObject.method1379(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, -428480375);
            }
        }
    }
    
    public static void ug(final Model model, final Frames frames, final int n) {
        if (model == null) {
            model.animate(frames, n);
            return;
        }
        if (model.vertexLabels == null) {
            return;
        }
        if (n == -1) {
            return;
        }
        final Animation animation = frames.frames[n];
        final Skeleton skeleton = animation.skeleton;
        Model.Model_transformTempX = 0;
        Model.Model_transformTempY = 0;
        Model.Model_transformTempZ = 0;
        for (int i = 0; i < animation.transformCount; ++i) {
            final int n2 = animation.transformSkeletonLabels[i];
            model.transform(skeleton.transformTypes[n2], skeleton.labels[n2], animation.transformXs[i], animation.transformYs[i], animation.transformZs[i]);
        }
        dv(model);
    }
    
    final void ey(final int n) {
        final int clipMidX = TaskHandler.getClipMidX(399681782);
        final int clipMidY = class12.getClipMidY(606944201);
        int n2 = 0;
        final int n3 = this.indices1[n];
        final int n4 = this.indices2[n];
        final int n5 = this.indices3[n];
        final int n6 = Model.field2200[n3];
        final int n7 = Model.field2200[n4];
        final int n8 = Model.field2200[n5];
        if (this.field2154 == null) {
            Rasterizer3D.clips.field2225 = 0;
        }
        else {
            Rasterizer3D.clips.field2225 = (this.field2154[n] & 0xFF) * -1087605381;
        }
        if (n6 >= 50) {
            Model.field2184[n2] = Model.modelViewportXs[n3];
            Model.field2185[n2] = Model.modelViewportYs[n3];
            Model.field2150[n2] = Model.field2172[n5];
            Model.field2186[n2++] = this.faceColors1[n];
        }
        else {
            final int n9 = Model.field2161[n3];
            final int n10 = Model.field2175[n3];
            final int n11 = this.faceColors1[n];
            if (n8 >= 50) {
                final int n12 = (50 - n6) * Model.field2176[n8 - n6];
                Model.field2184[n2] = clipMidX + (n9 + ((Model.field2161[n5] - n9) * n12 >> 16)) * UserComparator7.get3dZoom(111911501) / 50;
                Model.field2185[n2] = clipMidY + (n10 + ((Model.field2175[n5] - n10) * n12 >> 16)) * UserComparator7.get3dZoom(-946617381) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n11 + ((this.faceColors3[n] - n11) * n12 >> 16);
            }
            if (n7 >= 50) {
                final int n13 = (50 - n6) * Model.field2176[n7 - n6];
                Model.field2184[n2] = clipMidX + (n9 + ((Model.field2161[n4] - n9) * n13 >> 16)) * UserComparator7.get3dZoom(181846008) / 50;
                Model.field2185[n2] = clipMidY + (n10 + ((Model.field2175[n4] - n10) * n13 >> 16)) * UserComparator7.get3dZoom(-132163643) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n11 + ((this.faceColors2[n] - n11) * n13 >> 16);
            }
        }
        if (n7 >= 50) {
            Model.field2184[n2] = Model.modelViewportXs[n4];
            Model.field2185[n2] = Model.modelViewportYs[n4];
            Model.field2150[n2] = Model.field2172[n5];
            Model.field2186[n2++] = this.faceColors2[n];
        }
        else {
            final int n14 = Model.field2161[n4];
            final int n15 = Model.field2175[n4];
            final int n16 = this.faceColors2[n];
            if (n6 >= 50) {
                final int n17 = (50 - n7) * Model.field2176[n6 - n7];
                Model.field2184[n2] = clipMidX + (n14 + ((Model.field2161[n3] - n14) * n17 >> 16)) * UserComparator7.get3dZoom(978700698) / 50;
                Model.field2185[n2] = clipMidY + (n15 + ((Model.field2175[n3] - n15) * n17 >> 16)) * UserComparator7.get3dZoom(-1358640230) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n16 + ((this.faceColors1[n] - n16) * n17 >> 16);
            }
            if (n8 >= 50) {
                final int n18 = (50 - n7) * Model.field2176[n8 - n7];
                Model.field2184[n2] = clipMidX + (n14 + ((Model.field2161[n5] - n14) * n18 >> 16)) * UserComparator7.get3dZoom(318649455) / 50;
                Model.field2185[n2] = clipMidY + (n15 + ((Model.field2175[n5] - n15) * n18 >> 16)) * UserComparator7.get3dZoom(-1469351734) / 50;
                Model.field2186[n2++] = n16 + ((this.faceColors3[n] - n16) * n18 >> 16);
            }
        }
        if (n8 >= 50) {
            Model.field2184[n2] = Model.modelViewportXs[n5];
            Model.field2185[n2] = Model.modelViewportYs[n5];
            Model.field2150[n2] = Model.field2172[n5];
            Model.field2186[n2++] = this.faceColors3[n];
        }
        else {
            final int n19 = Model.field2161[n5];
            final int n20 = Model.field2175[n5];
            final int n21 = this.faceColors3[n];
            if (n7 >= 50) {
                final int n22 = (50 - n8) * Model.field2176[n7 - n8];
                Model.field2184[n2] = clipMidX + (n19 + ((Model.field2161[n4] - n19) * n22 >> 16)) * UserComparator7.get3dZoom(-102230718) / 50;
                Model.field2185[n2] = clipMidY + (n20 + ((Model.field2175[n4] - n20) * n22 >> 16)) * UserComparator7.get3dZoom(-546712257) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n21 + ((this.faceColors2[n] - n21) * n22 >> 16);
            }
            if (n6 >= 50) {
                final int n23 = (50 - n8) * Model.field2176[n6 - n8];
                Model.field2184[n2] = clipMidX + (n19 + ((Model.field2161[n3] - n19) * n23 >> 16)) * UserComparator7.get3dZoom(1018882175) / 50;
                Model.field2185[n2] = clipMidY + (n20 + ((Model.field2175[n3] - n20) * n23 >> 16)) * UserComparator7.get3dZoom(1549017579) / 50;
                Model.field2150[n2] = Model.field2198;
                Model.field2186[n2++] = n21 + ((this.faceColors1[n] - n21) * n23 >> 16);
            }
        }
        final int n24 = Model.field2184[0];
        final int n25 = Model.field2184[1];
        final int n26 = Model.field2184[2];
        final int n27 = Model.field2185[0];
        final int n28 = Model.field2185[1];
        final int n29 = Model.field2185[2];
        final float n30 = Model.field2150[0];
        final float n31 = Model.field2150[1];
        final float n32 = Model.field2150[2];
        Rasterizer3D.clips.field2234 = false;
        final int method20 = class6.method20(-1521256899);
        if (n2 == 3) {
            if (n24 < 0 || n25 < 0 || n26 < 0 || n24 > method20 || n25 > method20 || n26 > method20) {
                Rasterizer3D.clips.field2234 = true;
            }
            this.method1332(n, n27, n28, n29, n24, n25, n26, n30, n31, n32, Model.field2186[0], Model.field2186[1], Model.field2186[2]);
        }
        if (n2 == 4) {
            if (n24 < 0 || (n25 < 0 || n26 < 0 || n24 > method20 || n25 > method20 || n26 > method20) || Model.field2184[3] < 0 || Model.field2184[3] > method20) {
                Rasterizer3D.clips.field2234 = true;
            }
            if (this.faceTextures == null || this.faceTextures[n] == -1) {
                final boolean method21 = this.method1331(n);
                if (this.faceColors3[n] == -1 && method21) {
                    final int n33 = Model.field2140[this.faceColors1[n]];
                    class220.cy(Rasterizer3D.field1999, n27, n28, n29, n24, n25, n26, n30, n31, n32, n33, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount, -1620123395);
                    class220.cy(Rasterizer3D.field1999, n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], n33, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount, -1620123395);
                }
                else if (this.faceColors3[n] == -1) {
                    final int n34 = Model.field2140[this.faceColors1[n]];
                    class144.method825(n27, n28, n29, n24, n25, n26, n30, n31, n32, n34, -568783421);
                    class144.method825(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], n34, 546216340);
                }
                else if (method21) {
                    Rasterizer3D.field1999.method1224(n27, n28, n29, n24, n25, n26, n30, n31, n32, Model.field2186[0], Model.field2186[1], Model.field2186[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount, (byte)(-128));
                    Rasterizer3D.field1999.method1224(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], 0.0f, 0.0f, 0.0f, Model.field2186[0], Model.field2186[2], Model.field2186[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount, (byte)(-37));
                }
                else {
                    BoundaryObject.method1379(n27, n28, n29, n24, n25, n26, n30, n31, n32, Model.field2186[0], Model.field2186[1], Model.field2186[2], -428480375);
                    BoundaryObject.method1379(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], Model.field2186[0], Model.field2186[2], Model.field2186[3], -428480375);
                }
            }
            else {
                int n36;
                int n37;
                int n38;
                if (this.faceRenderPriorities != null && this.faceRenderPriorities[n] != -1) {
                    final int n35 = this.faceRenderPriorities[n] & 0xFF;
                    n36 = this.field2199[n35];
                    n37 = this.field2155[n35];
                    n38 = this.field2187[n35];
                }
                else {
                    n36 = n3;
                    n37 = n4;
                    n38 = n5;
                }
                final short n39 = this.faceTextures[n];
                if (this.faceColors3[n] == -1) {
                    DevicePcmPlayerProvider.method89(n27, n28, n29, n24, n25, n26, n30, n31, n32, this.faceColors1[n], this.faceColors1[n], this.faceColors1[n], Model.field2161[n36], Model.field2161[n37], Model.field2161[n38], Model.field2175[n36], Model.field2175[n37], Model.field2175[n38], Model.field2200[n36], Model.field2200[n37], Model.field2200[n38], n39, (short)(-5746));
                    DevicePcmPlayerProvider.method89(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], this.faceColors1[n], this.faceColors1[n], this.faceColors1[n], Model.field2161[n36], Model.field2161[n37], Model.field2161[n38], Model.field2175[n36], Model.field2175[n37], Model.field2175[n38], Model.field2200[n36], Model.field2200[n37], Model.field2200[n38], n39, (short)(-7877));
                }
                else {
                    DevicePcmPlayerProvider.method89(n27, n28, n29, n24, n25, n26, n30, n31, n32, Model.field2186[0], Model.field2186[1], Model.field2186[2], Model.field2161[n36], Model.field2161[n37], Model.field2161[n38], Model.field2175[n36], Model.field2175[n37], Model.field2175[n38], Model.field2200[n36], Model.field2200[n37], Model.field2200[n38], n39, (short)(-29403));
                    DevicePcmPlayerProvider.method89(n27, n29, Model.field2185[3], n24, n26, Model.field2184[3], n30, n32, Model.field2150[3], Model.field2186[0], Model.field2186[2], Model.field2186[3], Model.field2161[n36], Model.field2161[n37], Model.field2161[n38], Model.field2175[n36], Model.field2175[n37], Model.field2175[n38], Model.field2200[n36], Model.field2200[n37], Model.field2200[n38], n39, (short)(-7027));
                }
            }
        }
    }
    
    void bf(final Model model) {
        final int length = this.indices1.length;
        if (this.faceAlphas == null && (model.faceAlphas != null || this.field2152 != model.field2152)) {
            Arrays.fill(this.faceAlphas = new byte[length], this.field2152);
        }
        if (this.field2154 == null && model.field2154 != null) {
            Arrays.fill(this.field2154 = new byte[length], (byte)0);
        }
        if (this.faceTextures == null && model.faceTextures != null) {
            Arrays.fill(this.faceTextures = new short[length], (short)(-1));
        }
        if (this.faceRenderPriorities == null && model.faceRenderPriorities != null) {
            Arrays.fill(this.faceRenderPriorities = new byte[length], (byte)(-1));
        }
    }
    
    public int[][] kv() {
        return this.vertexLabels;
    }
    
    public void un() {
        if (this.oy == null) {
            final int verticesCount = this.getVerticesCount();
            this.oy = new int[verticesCount];
            this.ez = new int[verticesCount];
            this.en = new int[verticesCount];
            final int[] faceIndices1 = this.getFaceIndices1();
            final int[] faceIndices2 = this.getFaceIndices2();
            final int[] faceIndices3 = this.getFaceIndices3();
            final int[] verticesX = this.getVerticesX();
            final int[] verticesY = this.getVerticesY();
            final int[] verticesZ = this.getVerticesZ();
            for (int i = 0; i < this.getFaceCount(); ++i) {
                final int n = faceIndices1[i];
                final int n2 = faceIndices2[i];
                final int n3 = faceIndices3[i];
                final int n4 = verticesX[n2] - verticesX[n];
                final int n5 = verticesY[n2] - verticesY[n];
                final int n6 = verticesZ[n2] - verticesZ[n];
                final int n7 = verticesX[n3] - verticesX[n];
                final int n8 = verticesY[n3] - verticesY[n];
                final int n9 = verticesZ[n3] - verticesZ[n];
                int n10;
                int n11;
                int n12;
                for (n10 = n5 * n9 - n8 * n6, n11 = n6 * n7 - n9 * n4, n12 = n4 * n8 - n7 * n5; n10 > 8192 || n11 > 8192 || n12 > 8192 || n10 < -8192 || n11 < -8192 || n12 < -8192; n10 >>= 1, n11 >>= 1, n12 >>= 1) {}
                int n13 = (int)Math.sqrt(n10 * n10 + n11 * n11 + n12 * n12);
                if (n13 <= 0) {
                    n13 = 1;
                }
                final int n14 = n10 * 256 / n13;
                final int n15 = n11 * 256 / n13;
                final int n16 = n12 * 256 / n13;
                final int[] oy = this.oy;
                final int n17 = n;
                oy[n17] += n14;
                final int[] ez = this.ez;
                final int n18 = n;
                ez[n18] += n15;
                final int[] en = this.en;
                final int n19 = n;
                en[n19] += n16;
                final int[] oy2 = this.oy;
                final int n20 = n2;
                oy2[n20] += n14;
                final int[] ez2 = this.ez;
                final int n21 = n2;
                ez2[n21] += n15;
                final int[] en2 = this.en;
                final int n22 = n2;
                en2[n22] += n16;
                final int[] oy3 = this.oy;
                final int n23 = n3;
                oy3[n23] += n14;
                final int[] ez3 = this.ez;
                final int n24 = n3;
                ez3[n24] += n15;
                final int[] en3 = this.en;
                final int n25 = n3;
                en3[n25] += n16;
            }
        }
    }
    
    void bu(final int n, final int n2, final int n3) {
        this.verticesX = new int[n];
        this.verticesY = new int[n];
        this.verticesZ = new int[n];
        this.indices1 = new int[n2];
        this.indices2 = new int[n2];
        this.indices3 = new int[n2];
        this.faceColors1 = new int[n2];
        this.faceColors2 = new int[n2];
        this.faceColors3 = new int[n2];
        if (n3 > 0) {
            this.field2199 = new int[n3];
            this.field2155 = new int[n3];
            this.field2187 = new int[n3];
        }
    }
    
    public void du() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.verticesX[i] = -this.verticesX[i];
            this.verticesZ[i] = -this.verticesZ[i];
        }
        dv(this);
    }
    
    public static void pj(final Model model) {
        if (model == null) {
            model.rotateY180();
            return;
        }
        for (int i = 0; i < model.verticesCount; ++i) {
            model.verticesX[i] = -model.verticesX[i];
            model.verticesZ[i] = -model.verticesZ[i];
        }
        dv(model);
    }
    
    public int[] getFaceColors3() {
        return this.faceColors3;
    }
    
    public int getFaceCount() {
        return this.indicesCount;
    }
    
    public int[] getVerticesY() {
        return this.verticesY;
    }
    
    public boolean isClickable() {
        return this.isSingleTile;
    }
    
    public int[] getVerticesX() {
        return this.verticesX;
    }
    
    public int[] getFaceIndices1() {
        return this.indices1;
    }
    
    public int[] getFaceIndices3() {
        return this.indices3;
    }
    
    public int getVerticesCount() {
        return this.verticesCount;
    }
    
    public int[] getVerticesZ() {
        return this.verticesZ;
    }
    
    public int[] getFaceIndices2() {
        return this.indices2;
    }
    
    public byte[] getTextureFaces() {
        return this.faceRenderPriorities;
    }
    
    public int[] getFaceColors2() {
        return this.faceColors2;
    }
    
    public short[] getFaceTextures() {
        return this.faceTextures;
    }
    
    public void setBufferOffset(final int th) {
        this.th = th;
    }
    
    public void setUvBufferOffset(final int ln) {
        this.ln = ln;
    }
    
    public int getUvBufferOffset() {
        return this.ln;
    }
    
    public void calculateExtreme(final int n) {
        ia(this, n);
    }
    
    public int[] getVertexNormalsX() {
        return this.oy;
    }
    
    public int[] getTexIndices2() {
        return this.field2155;
    }
    
    public byte getOverrideHue() {
        return this.overrideHue;
    }
    
    public int[] getVertexNormalsY() {
        return this.ez;
    }
    
    public int[] getTexIndices3() {
        return this.field2187;
    }
    
    public void setSceneId(final int pa) {
        this.pa = pa;
    }
    
    public int getBottomY() {
        return this.bottomY;
    }
    
    public int[] getVertexNormalsZ() {
        return this.en;
    }
    
    public int[] getFaceColors1() {
        return this.faceColors1;
    }
    
    public int[] getTexIndices1() {
        return this.field2199;
    }
    
    public byte getOverrideAmount() {
        return this.overrideAmount;
    }
    
    public int getDiameter() {
        return this.diameter;
    }
    
    public int getSceneId() {
        return this.pa;
    }
    
    public int getXYZMag() {
        return this.xzRadius;
    }
    
    public byte[] getFaceTransparencies() {
        return this.field2154;
    }
    
    public void calculateBoundsCylinder() {
        this.calculateBoundsCylinder();
    }
    
    public byte getOverrideSaturation() {
        return this.overrideSaturation;
    }
    
    public byte[] getFaceRenderPriorities() {
        return this.faceAlphas;
    }
    
    public byte getOverrideLuminance() {
        return this.overrideLuminance;
    }
}
