// 
// Decompiled by Procyon v0.5.36
// 

public final class SceneTileModel implements net.runelite.api.SceneTileModel
{
    static final int[][] field2106;
    public int vb;
    int[] faceZ;
    static int[] field2108;
    int[] vertexX;
    int[] faceX;
    int[] triangleColorA;
    int[] vertexZ;
    int[] faceY;
    boolean field2114;
    int[] triangleColorC;
    int rotation;
    int shape;
    int[] triangleColorB;
    int underlayRgb;
    int[] vertexY;
    static int[] field2121;
    static int[] field2122;
    static float[] field2123;
    static int[] field2124;
    public int eu;
    static int[] field2125;
    int[] triangleTextureId;
    public int mi;
    int overlayRgb;
    static final int[][] field2128;
    
    SceneTileModel(final int shape, final int rotation, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int underlayRgb, final int overlayRgb) {
        this.field2114 = true;
        if (n4 != n5 || n4 != n6 || n4 != n7) {
            this.field2114 = false;
        }
        this.shape = shape;
        this.rotation = rotation;
        this.underlayRgb = underlayRgb;
        this.overlayRgb = overlayRgb;
        final int n16 = 128;
        final int n17 = n16 / 2;
        final int n18 = n16 / 4;
        final int n19 = n16 * 3 / 4;
        final int[] array = SceneTileModel.field2106[shape];
        final int length = array.length;
        this.triangleColorB = new int[length];
        this.faceZ = new int[length];
        this.triangleTextureId = new int[length];
        final int[] array2 = new int[length];
        final int[] array3 = new int[length];
        final int n20 = n2 * n16;
        final int n21 = n3 * n16;
        for (int i = 0; i < length; ++i) {
            int n22 = array[i];
            if ((n22 & 0x1) == 0x0 && n22 <= 8) {
                n22 = (n22 - rotation - rotation - 1 & 0x7) + 1;
            }
            if (n22 > 8 && n22 <= 12) {
                n22 = (n22 - 9 - rotation & 0x3) + 9;
            }
            if (n22 > 12 && n22 <= 16) {
                n22 = (n22 - 13 - rotation & 0x3) + 13;
            }
            int n23;
            int n24;
            int n25;
            int n26;
            int n27;
            if (n22 == 1) {
                n23 = n20;
                n24 = n21;
                n25 = n4;
                n26 = n8;
                n27 = n12;
            }
            else if (n22 == 2) {
                n23 = n20 + n17;
                n24 = n21;
                n25 = n4 + n5 >> 1;
                n26 = n8 + n9 >> 1;
                n27 = n12 + n13 >> 1;
            }
            else if (n22 == 3) {
                n23 = n20 + n16;
                n24 = n21;
                n25 = n5;
                n26 = n9;
                n27 = n13;
            }
            else if (n22 == 4) {
                n23 = n20 + n16;
                n24 = n21 + n17;
                n25 = n5 + n6 >> 1;
                n26 = n9 + n10 >> 1;
                n27 = n13 + n14 >> 1;
            }
            else if (n22 == 5) {
                n23 = n20 + n16;
                n24 = n21 + n16;
                n25 = n6;
                n26 = n10;
                n27 = n14;
            }
            else if (n22 == 6) {
                n23 = n20 + n17;
                n24 = n21 + n16;
                n25 = n6 + n7 >> 1;
                n26 = n10 + n11 >> 1;
                n27 = n14 + n15 >> 1;
            }
            else if (n22 == 7) {
                n23 = n20;
                n24 = n21 + n16;
                n25 = n7;
                n26 = n11;
                n27 = n15;
            }
            else if (n22 == 8) {
                n23 = n20;
                n24 = n21 + n17;
                n25 = n7 + n4 >> 1;
                n26 = n11 + n8 >> 1;
                n27 = n15 + n12 >> 1;
            }
            else if (n22 == 9) {
                n23 = n20 + n17;
                n24 = n21 + n18;
                n25 = n4 + n5 >> 1;
                n26 = n8 + n9 >> 1;
                n27 = n12 + n13 >> 1;
            }
            else if (n22 == 10) {
                n23 = n20 + n19;
                n24 = n21 + n17;
                n25 = n5 + n6 >> 1;
                n26 = n9 + n10 >> 1;
                n27 = n13 + n14 >> 1;
            }
            else if (n22 == 11) {
                n23 = n20 + n17;
                n24 = n21 + n19;
                n25 = n6 + n7 >> 1;
                n26 = n10 + n11 >> 1;
                n27 = n14 + n15 >> 1;
            }
            else if (n22 == 12) {
                n23 = n20 + n18;
                n24 = n21 + n17;
                n25 = n7 + n4 >> 1;
                n26 = n11 + n8 >> 1;
                n27 = n15 + n12 >> 1;
            }
            else if (n22 == 13) {
                n23 = n20 + n18;
                n24 = n21 + n18;
                n25 = n4;
                n26 = n8;
                n27 = n12;
            }
            else if (n22 == 14) {
                n23 = n20 + n19;
                n24 = n21 + n18;
                n25 = n5;
                n26 = n9;
                n27 = n13;
            }
            else if (n22 == 15) {
                n23 = n20 + n19;
                n24 = n21 + n19;
                n25 = n6;
                n26 = n10;
                n27 = n14;
            }
            else {
                n23 = n20 + n18;
                n24 = n21 + n19;
                n25 = n7;
                n26 = n11;
                n27 = n15;
            }
            this.triangleColorB[i] = n23;
            this.faceZ[i] = n25;
            this.triangleTextureId[i] = n24;
            array2[i] = n26;
            array3[i] = n27;
        }
        final int[] array4 = SceneTileModel.field2128[shape];
        final int n28 = array4.length / 4;
        this.vertexZ = new int[n28];
        this.faceX = new int[n28];
        this.faceY = new int[n28];
        this.vertexX = new int[n28];
        this.vertexY = new int[n28];
        this.triangleColorA = new int[n28];
        if (n != -1) {
            this.triangleColorC = new int[n28];
        }
        int n29 = 0;
        for (int j = 0; j < n28; ++j) {
            final int n30 = array4[n29];
            int n31 = array4[n29 + 1];
            int n32 = array4[n29 + 2];
            int n33 = array4[n29 + 3];
            n29 += 4;
            if (n31 < 4) {
                n31 = (n31 - rotation & 0x3);
            }
            if (n32 < 4) {
                n32 = (n32 - rotation & 0x3);
            }
            if (n33 < 4) {
                n33 = (n33 - rotation & 0x3);
            }
            this.vertexZ[j] = n31;
            this.faceX[j] = n32;
            this.faceY[j] = n33;
            if (n30 == 0) {
                this.vertexX[j] = array2[n31];
                this.vertexY[j] = array2[n32];
                this.triangleColorA[j] = array2[n33];
                if (this.triangleColorC != null) {
                    this.triangleColorC[j] = -1;
                }
            }
            else {
                this.vertexX[j] = array3[n31];
                this.vertexY[j] = array3[n32];
                this.triangleColorA[j] = array3[n33];
                if (this.triangleColorC != null) {
                    this.triangleColorC[j] = n;
                }
            }
        }
        int n34 = n4;
        int n35;
        if ((n35 = n5) < n34) {
            n34 = n5;
        }
        if (n5 > n35) {
            n35 = n5;
        }
        if (n6 < n34) {
            n34 = n6;
        }
        if (n6 > n35) {
            n35 = n6;
        }
        if (n7 < n34) {
            n34 = n7;
        }
        if (n7 > n35) {
            n35 = n7;
        }
    }
    
    static {
        SceneTileModel.field2121 = new int[6];
        SceneTileModel.field2122 = new int[6];
        SceneTileModel.field2123 = new float[6];
        SceneTileModel.field2124 = new int[6];
        SceneTileModel.field2125 = new int[6];
        SceneTileModel.field2108 = new int[6];
        field2106 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
        field2128 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
    }
    
    public int getShape() {
        return this.shape;
    }
    
    public int getBufferOffset() {
        return this.eu;
    }
    
    public int[] getFaceZ() {
        return this.faceY;
    }
    
    public int[] getFaceY() {
        return this.faceX;
    }
    
    public int getModelOverlay() {
        return this.overlayRgb;
    }
    
    public int getRotation() {
        return this.rotation;
    }
    
    public int[] getVertexX() {
        return this.triangleColorB;
    }
    
    public int[] getVertexZ() {
        return this.triangleTextureId;
    }
    
    public int getModelUnderlay() {
        return this.underlayRgb;
    }
    
    public int[] getTriangleColorA() {
        return this.vertexX;
    }
    
    public int[] getFaceX() {
        return this.vertexZ;
    }
    
    public int[] getVertexY() {
        return this.faceZ;
    }
    
    public void setBufferOffset(final int eu) {
        this.eu = eu;
    }
    
    public void setUvBufferOffset(final int mi) {
        this.mi = mi;
    }
    
    public int[] getTriangleColorC() {
        return this.triangleColorA;
    }
    
    public void setBufferLen(final int vb) {
        this.vb = vb;
    }
    
    public int[] getTriangleColorB() {
        return this.vertexY;
    }
    
    public int getUvBufferOffset() {
        return this.mi;
    }
    
    public int getBufferLen() {
        return this.vb;
    }
    
    public int[] getTriangleTextureId() {
        return this.triangleColorC;
    }
}
