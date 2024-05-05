import net.runelite.api.Mesh;

// 
// Decompiled by Procyon v0.5.36
// 

public class ModelData extends Renderable implements net.runelite.api.ModelData
{
    static int[] ModelData_cosine;
    int[][] field1899;
    static final int aw = -1;
    int verticesCount;
    int[] indices2;
    int[] indices3;
    int[] indices1;
    int faceCount;
    int[] verticesY;
    public int[] jy;
    static final int af = -3;
    int[] vertexSkins;
    int[] faceSkins;
    byte[] faceRenderPriorities;
    public short contrast;
    byte[] textureCoords;
    public int[] cp;
    short[] faceColors;
    short[] faceTextures;
    byte priority;
    int[][] vertexLabels;
    byte[] textureRenderTypes;
    public int[] rb;
    short[] texTriangleX;
    public short ambient;
    int field1918;
    static int[] ModelData_sine;
    int[] verticesX;
    short[] texTriangleZ;
    int[][] faceLabelsAlpha;
    int field1923;
    int[][] field1924;
    FaceNormal[] faceNormals;
    VertexNormal[] vertexVertices;
    byte[] faceRenderTypes;
    int textureTriangleCount;
    byte[] faceAlphas;
    boolean isBoundsCalculated;
    int field1931;
    int field1932;
    short[] texTriangleY;
    int field1934;
    static final int an = -2;
    static int[] field1935;
    static int[] field1936;
    static int field1937;
    VertexNormal[] vertexNormals;
    int[] verticesZ;
    
    ModelData() {
        this.verticesCount = 0;
        this.faceCount = 0;
        this.priority = 0;
        this.isBoundsCalculated = false;
    }
    
    ModelData(final byte[] array) {
        this.verticesCount = 0;
        this.faceCount = 0;
        this.priority = 0;
        this.isBoundsCalculated = false;
        new Buffer(10).writeVarInt(-2, (byte)(-9));
        if (array[array.length - 1] == -3 && array[array.length - 2] == -1) {
            this.method1183(array);
        }
        else if (array[array.length - 1] == -2 && array[array.length - 2] == -1) {
            this.method1203(array);
        }
        else if (array[array.length - 1] == -1 && array[array.length - 2] == -1) {
            nh(this, array);
        }
        else {
            this.method1185(array);
        }
    }
    
    public ModelData(final ModelData[] array, final int n) {
        this.verticesCount = 0;
        this.faceCount = 0;
        this.priority = 0;
        this.isBoundsCalculated = false;
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        boolean b6 = false;
        boolean b7 = false;
        this.verticesCount = 0;
        this.faceCount = 0;
        this.textureTriangleCount = 0;
        this.priority = -1;
        for (final ModelData modelData : array) {
            if (modelData != null) {
                this.verticesCount += modelData.verticesCount;
                this.faceCount += modelData.faceCount;
                this.textureTriangleCount += modelData.textureTriangleCount;
                if (modelData.faceRenderPriorities != null) {
                    b2 = true;
                }
                else {
                    if (this.priority == -1) {
                        this.priority = modelData.priority;
                    }
                    if (this.priority != modelData.priority) {
                        b2 = true;
                    }
                }
                b |= (modelData.faceRenderTypes != null);
                b3 |= (modelData.faceAlphas != null);
                b4 |= (modelData.verticesX != null);
                b5 |= (modelData.faceTextures != null);
                b6 |= (modelData.textureCoords != null);
                b7 |= (modelData.field1899 != null);
            }
        }
        this.indices2 = new int[this.verticesCount];
        this.indices3 = new int[this.verticesCount];
        this.indices1 = new int[this.verticesCount];
        this.faceSkins = new int[this.verticesCount];
        this.verticesY = new int[this.faceCount];
        this.verticesZ = new int[this.faceCount];
        this.vertexSkins = new int[this.faceCount];
        if (b) {
            this.faceRenderTypes = new byte[this.faceCount];
        }
        if (b2) {
            this.faceRenderPriorities = new byte[this.faceCount];
        }
        if (b3) {
            this.faceAlphas = new byte[this.faceCount];
        }
        if (b4) {
            this.verticesX = new int[this.faceCount];
        }
        if (b5) {
            this.faceTextures = new short[this.faceCount];
        }
        if (b6) {
            this.textureCoords = new byte[this.faceCount];
        }
        if (b7) {
            this.field1899 = new int[this.verticesCount][];
            this.field1924 = new int[this.verticesCount][];
        }
        this.faceColors = new short[this.faceCount];
        if (this.textureTriangleCount > 0) {
            this.textureRenderTypes = new byte[this.textureTriangleCount];
            this.texTriangleX = new short[this.textureTriangleCount];
            this.texTriangleY = new short[this.textureTriangleCount];
            this.texTriangleZ = new short[this.textureTriangleCount];
        }
        this.verticesCount = 0;
        this.faceCount = 0;
        this.textureTriangleCount = 0;
        for (final ModelData modelData2 : array) {
            if (modelData2 != null) {
                for (int k = 0; k < modelData2.faceCount; ++k) {
                    if (b && modelData2.faceRenderTypes != null) {
                        this.faceRenderTypes[this.faceCount] = modelData2.faceRenderTypes[k];
                    }
                    if (b2) {
                        if (modelData2.faceRenderPriorities != null) {
                            this.faceRenderPriorities[this.faceCount] = modelData2.faceRenderPriorities[k];
                        }
                        else {
                            this.faceRenderPriorities[this.faceCount] = modelData2.priority;
                        }
                    }
                    if (b3 && modelData2.faceAlphas != null) {
                        this.faceAlphas[this.faceCount] = modelData2.faceAlphas[k];
                    }
                    if (b4 && modelData2.verticesX != null) {
                        this.verticesX[this.faceCount] = modelData2.verticesX[k];
                    }
                    if (b5) {
                        if (modelData2.faceTextures != null) {
                            this.faceTextures[this.faceCount] = modelData2.faceTextures[k];
                        }
                        else {
                            this.faceTextures[this.faceCount] = -1;
                        }
                    }
                    if (b6) {
                        if (modelData2.textureCoords != null && modelData2.textureCoords[k] != -1) {
                            this.textureCoords[this.faceCount] = (byte)(modelData2.textureCoords[k] + this.textureTriangleCount);
                        }
                        else {
                            this.textureCoords[this.faceCount] = -1;
                        }
                    }
                    this.faceColors[this.faceCount] = modelData2.faceColors[k];
                    this.verticesY[this.faceCount] = this.method1202(modelData2, modelData2.verticesY[k]);
                    this.verticesZ[this.faceCount] = this.method1202(modelData2, modelData2.verticesZ[k]);
                    this.vertexSkins[this.faceCount] = this.method1202(modelData2, modelData2.vertexSkins[k]);
                    ++this.faceCount;
                }
                for (int l = 0; l < modelData2.textureTriangleCount; ++l) {
                    if ((this.textureRenderTypes[this.textureTriangleCount] = modelData2.textureRenderTypes[l]) == 0) {
                        this.texTriangleX[this.textureTriangleCount] = (short)this.method1202(modelData2, modelData2.texTriangleX[l]);
                        this.texTriangleY[this.textureTriangleCount] = (short)this.method1202(modelData2, modelData2.texTriangleY[l]);
                        this.texTriangleZ[this.textureTriangleCount] = (short)this.method1202(modelData2, modelData2.texTriangleZ[l]);
                    }
                    ++this.textureTriangleCount;
                }
            }
        }
    }
    
    public ModelData(final ModelData modelData, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.verticesCount = 0;
        this.faceCount = 0;
        this.priority = 0;
        this.isBoundsCalculated = false;
        this.verticesCount = modelData.verticesCount;
        this.faceCount = modelData.faceCount;
        this.textureTriangleCount = modelData.textureTriangleCount;
        if (b) {
            this.indices2 = modelData.indices2;
            this.indices3 = modelData.indices3;
            this.indices1 = modelData.indices1;
        }
        else {
            this.indices2 = new int[this.verticesCount];
            this.indices3 = new int[this.verticesCount];
            this.indices1 = new int[this.verticesCount];
            for (int i = 0; i < this.verticesCount; ++i) {
                this.indices2[i] = modelData.indices2[i];
                this.indices3[i] = modelData.indices3[i];
                this.indices1[i] = modelData.indices1[i];
            }
        }
        if (b2) {
            this.faceColors = modelData.faceColors;
        }
        else {
            this.faceColors = new short[this.faceCount];
            for (int j = 0; j < this.faceCount; ++j) {
                this.faceColors[j] = modelData.faceColors[j];
            }
        }
        if (!b3 && modelData.faceTextures != null) {
            this.faceTextures = new short[this.faceCount];
            for (int k = 0; k < this.faceCount; ++k) {
                this.faceTextures[k] = modelData.faceTextures[k];
            }
        }
        else {
            this.faceTextures = modelData.faceTextures;
        }
        if (b4) {
            this.faceAlphas = modelData.faceAlphas;
        }
        else {
            this.faceAlphas = new byte[this.faceCount];
            if (modelData.faceAlphas == null) {
                for (int l = 0; l < this.faceCount; ++l) {
                    this.faceAlphas[l] = 0;
                }
            }
            else {
                for (int n = 0; n < this.faceCount; ++n) {
                    this.faceAlphas[n] = modelData.faceAlphas[n];
                }
            }
        }
        this.verticesY = modelData.verticesY;
        this.verticesZ = modelData.verticesZ;
        this.vertexSkins = modelData.vertexSkins;
        this.faceRenderTypes = modelData.faceRenderTypes;
        this.faceRenderPriorities = modelData.faceRenderPriorities;
        this.textureCoords = modelData.textureCoords;
        this.priority = modelData.priority;
        this.textureRenderTypes = modelData.textureRenderTypes;
        this.texTriangleX = modelData.texTriangleX;
        this.texTriangleY = modelData.texTriangleY;
        this.texTriangleZ = modelData.texTriangleZ;
        this.faceSkins = modelData.faceSkins;
        this.verticesX = modelData.verticesX;
        this.vertexLabels = modelData.vertexLabels;
        this.faceLabelsAlpha = modelData.faceLabelsAlpha;
        this.vertexNormals = modelData.vertexNormals;
        this.faceNormals = modelData.faceNormals;
        this.vertexVertices = modelData.vertexVertices;
        this.field1899 = modelData.field1899;
        this.field1924 = modelData.field1924;
        this.ambient = modelData.ambient;
        this.contrast = modelData.contrast;
    }
    
    static {
        ModelData.field1935 = new int[10000];
        ModelData.field1936 = new int[10000];
        ModelData.field1937 = 0;
        ModelData.ModelData_sine = Rasterizer3D.Rasterizer3D_sine;
        ModelData.ModelData_cosine = Rasterizer3D.Rasterizer3D_cosine;
    }
    
    public VertexNormal[] cs() {
        return this.vertexVertices;
    }
    
    void cs() {
        for (int i = 0; i < this.field1932; ++i) {
            this.verticesY[i] = -this.indices3[i];
            this.vertexSkins[i] = -this.indices1[i];
        }
        this.dk();
    }
    
    static final int dp(final int n, int n2) {
        n2 = n2 * (n & 0x7F) >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    public void ca() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices2[i] = -this.indices2[i];
            this.indices1[i] = -this.indices1[i];
        }
        this.ci();
    }
    
    public void calculateVertexNormals() {
        if (this.vertexNormals != null) {
            return;
        }
        this.vertexNormals = new VertexNormal[this.verticesCount];
        for (int i = 0; i < this.verticesCount; ++i) {
            this.vertexNormals[i] = new VertexNormal();
        }
        for (int j = 0; j < this.faceCount; ++j) {
            final int n = this.verticesY[j];
            final int n2 = this.verticesZ[j];
            final int n3 = this.vertexSkins[j];
            final int n4 = this.indices2[n2] - this.indices2[n];
            final int n5 = this.indices3[n2] - this.indices3[n];
            final int n6 = this.indices1[n2] - this.indices1[n];
            final int n7 = this.indices2[n3] - this.indices2[n];
            final int n8 = this.indices3[n3] - this.indices3[n];
            final int n9 = this.indices1[n3] - this.indices1[n];
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
            byte b;
            if (this.faceRenderTypes == null) {
                b = 0;
            }
            else {
                b = this.faceRenderTypes[j];
            }
            if (b == 0) {
                final VertexNormal vertexNormal2;
                final VertexNormal vertexNormal = vertexNormal2 = this.vertexNormals[n];
                vertexNormal2.z += n14 * 690600101;
                final VertexNormal vertexNormal3 = vertexNormal;
                vertexNormal3.x += n15 * -1303307195;
                final VertexNormal vertexNormal4 = vertexNormal;
                vertexNormal4.magnitude += n16 * 1279987923;
                final VertexNormal vertexNormal5 = vertexNormal;
                vertexNormal5.y -= 1992029881;
                final VertexNormal vertexNormal7;
                final VertexNormal vertexNormal6 = vertexNormal7 = this.vertexNormals[n2];
                vertexNormal7.z += n14 * 690600101;
                final VertexNormal vertexNormal8 = vertexNormal6;
                vertexNormal8.x += n15 * -1303307195;
                final VertexNormal vertexNormal9 = vertexNormal6;
                vertexNormal9.magnitude += n16 * 1279987923;
                final VertexNormal vertexNormal10 = vertexNormal6;
                vertexNormal10.y -= 1992029881;
                final VertexNormal vertexNormal12;
                final VertexNormal vertexNormal11 = vertexNormal12 = this.vertexNormals[n3];
                vertexNormal12.z += n14 * 690600101;
                final VertexNormal vertexNormal13 = vertexNormal11;
                vertexNormal13.x += n15 * -1303307195;
                final VertexNormal vertexNormal14 = vertexNormal11;
                vertexNormal14.magnitude += n16 * 1279987923;
                final VertexNormal vertexNormal15 = vertexNormal11;
                vertexNormal15.y -= 1992029881;
            }
            else if (b == 1) {
                if (this.faceNormals == null) {
                    this.faceNormals = new FaceNormal[this.faceCount];
                }
                final FaceNormal[] faceNormals = this.faceNormals;
                final int n17 = j;
                final FaceNormal faceNormal = new FaceNormal();
                faceNormals[n17] = faceNormal;
                final FaceNormal faceNormal2 = faceNormal;
                faceNormal2.x = n14 * 769404891;
                faceNormal2.y = n15 * -1145821753;
                faceNormal2.z = n16 * -2013236337;
            }
        }
    }
    
    public void cd(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices2[i] = this.indices2[i] * n / 128;
            this.indices3[i] = this.indices3[i] * n2 / 128;
            this.indices1[i] = this.indices1[i] * n3 / 128;
        }
        this.ci();
    }
    
    void ba(final byte[] array) {
        int n = 0;
        boolean b = false;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        buffer.offset = (array.length - 18) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-29487235);
        final int unsignedShort2 = buffer.readUnsignedShort(-450454515);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-415884032);
        final int unsignedShort4 = buffer.readUnsignedShort(-160687620);
        buffer.readUnsignedShort(-919220778);
        final int unsignedShort5 = buffer.readUnsignedShort(508940533);
        final int n5;
        final int n4;
        final int n3;
        int n2 = n3 = (n4 = (n5 = 0) + unsignedShort) + unsignedShort2;
        if (ra3 == -1551595014) {
            n2 += unsignedShort2;
        }
        final int n6 = n2;
        if (ra5 == 1) {
            n2 += unsignedShort2;
        }
        final int n7 = n2;
        if (ra2 == 1) {
            n2 += unsignedShort2;
        }
        final int n8 = n2;
        if (ra6 == 1) {
            n2 += unsignedShort;
        }
        final int n9 = n2;
        if (ra4 == 1) {
            n2 += unsignedShort2;
        }
        final int n10 = n2;
        final int n15;
        final int n14;
        final int n13;
        final int n12;
        final int n11 = (n12 = (n13 = (n14 = (n15 = n2 + unsignedShort5) + unsignedShort2 * 2) + ra * 6) + unsignedShort3) + unsignedShort4;
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        if (ra6 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
            this.textureCoords = new byte[unsignedShort2];
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra3 == 421130645) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        this.faceColors = new short[unsignedShort2];
        buffer.offset = n5 * 1912423264;
        buffer2.offset = n13 * -1516355947;
        buffer3.offset = n12 * -1516355947;
        buffer4.offset = n11 * -1516355947;
        buffer5.offset = n8 * -1516355947;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            final int ra7 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra7 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1653466270);
            }
            int shortSmart2 = 0;
            if ((ra7 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1403924388);
            }
            int shortSmart3 = 0;
            if ((ra7 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1688085996);
            }
            this.indices2[i] = n16 + shortSmart;
            this.indices3[i] = n17 + shortSmart2;
            this.indices1[i] = n18 + shortSmart3;
            n16 = this.indices2[i];
            n17 = this.indices3[i];
            n18 = this.indices1[i];
            if (ra6 == 1) {
                this.faceSkins[i] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n15 * -1198512140;
        buffer2.offset = n7 * 238977688;
        buffer3.offset = n3 * -1516355947;
        buffer4.offset = n9 * -1535341201;
        buffer5.offset = n6 * -310818147;
        for (int j = 0; j < unsignedShort2; ++j) {
            this.faceColors[j] = (short)buffer.readUnsignedShort(-1449086094);
            if (ra2 == 1) {
                final int ra8 = Buffer.ra(buffer2, (byte)7);
                if ((ra8 & 0x1) == 0x1) {
                    this.faceRenderTypes[j] = 1;
                    n = 1;
                }
                else {
                    this.faceRenderTypes[j] = 0;
                }
                if ((ra8 & 0x2) == 0x2) {
                    this.textureCoords[j] = (byte)(ra8 >> 2);
                    this.faceTextures[j] = this.faceColors[j];
                    this.faceColors[j] = 127;
                    if (this.faceTextures[j] != -1) {
                        b = true;
                    }
                }
                else {
                    this.textureCoords[j] = -1;
                    this.faceTextures[j] = -1;
                }
            }
            if (ra3 == 2062803247) {
                this.faceRenderPriorities[j] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[j] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n10 * -1477591197;
        buffer2.offset = n4 * -1516355947;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        for (int k = 0; k < unsignedShort2; ++k) {
            final int ra9 = Buffer.ra(buffer2, (byte)7);
            if (ra9 == 1) {
                n19 = buffer.readShortSmart(1833099687) + n22;
                n20 = buffer.readShortSmart(1773026832) + n19;
                n21 = (n22 = buffer.readShortSmart(1385219841) + n20);
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
            if (ra9 == 2) {
                n20 = n21;
                n21 = (n22 += buffer.readShortSmart(1316868143));
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
            if (ra9 == 3) {
                n19 = n21;
                n21 = (n22 += buffer.readShortSmart(1926624066));
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
            if (ra9 == 4) {
                final int n23 = n19;
                n19 = n20;
                n20 = n23;
                n21 = (n22 += buffer.readShortSmart(1497712429));
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
        }
        buffer.offset = n14 * 327654495;
        for (int l = 0; l < ra; ++l) {
            this.textureRenderTypes[l] = 0;
            this.texTriangleX[l] = (short)buffer.readUnsignedShort(-1431844839);
            this.texTriangleY[l] = (short)buffer.readUnsignedShort(641387189);
            this.texTriangleZ[l] = (short)buffer.readUnsignedShort(815260492);
        }
        if (this.textureCoords != null) {
            int n24 = 0;
            for (int n25 = 0; n25 < unsignedShort2; ++n25) {
                final int n26 = this.textureCoords[n25] & 0xFF;
                if (n26 != -994245861) {
                    if ((this.texTriangleX[n26] & 0xFFFF) == this.verticesY[n25] && (this.texTriangleY[n26] & 0xFAB78FF4) == this.verticesZ[n25] && (this.texTriangleZ[n26] & 0x42871173) == this.vertexSkins[n25]) {
                        this.textureCoords[n25] = -1;
                    }
                    else {
                        n24 = 1;
                    }
                }
            }
            if (n24 == 0) {
                this.textureCoords = null;
            }
        }
        if (!b) {
            this.faceTextures = null;
        }
        if (n == 0) {
            this.faceRenderTypes = null;
        }
    }
    
    public static Model ba(final ModelData modelData, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (modelData == null) {
            modelData.cs();
        }
        modelData.calculateVertexNormals();
        final int n6 = n2 * (int)Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5) >> 8;
        final Model model = new Model();
        model.faceColors1 = new int[modelData.faceCount];
        model.faceColors2 = new int[modelData.faceCount];
        model.faceColors3 = new int[modelData.faceCount];
        if (modelData.textureTriangleCount > 0 && modelData.textureCoords != null) {
            final int[] array = new int[modelData.textureTriangleCount];
            for (int i = 0; i < modelData.faceCount; ++i) {
                if (modelData.textureCoords[i] != -1) {
                    final int[] array2 = array;
                    final int n7 = modelData.textureCoords[i] & 0xFF;
                    ++array2[n7];
                }
            }
            model.field2153 = 0;
            for (int j = 0; j < modelData.textureTriangleCount; ++j) {
                if (array[j] > 0 && modelData.textureRenderTypes[j] == 0) {
                    final Model model2 = model;
                    ++model2.field2153;
                }
            }
            model.field2199 = new int[model.field2153];
            model.field2155 = new int[model.field2153];
            model.field2187 = new int[model.field2153];
            int n8 = 0;
            for (int k = 0; k < modelData.textureTriangleCount; ++k) {
                if (array[k] > 0 && modelData.textureRenderTypes[k] == 0) {
                    model.field2199[n8] = (modelData.texTriangleX[k] & 0xFFFF);
                    model.field2155[n8] = (modelData.texTriangleY[k] & 0xFFFF);
                    model.field2187[n8] = (modelData.texTriangleZ[k] & 0xFFFF);
                    array[k] = n8++;
                }
                else {
                    array[k] = -1;
                }
            }
            model.faceRenderPriorities = new byte[modelData.faceCount];
            for (int l = 0; l < modelData.faceCount; ++l) {
                if (modelData.textureCoords[l] != -1) {
                    model.faceRenderPriorities[l] = (byte)array[modelData.textureCoords[l] & 0xFF];
                }
                else {
                    model.faceRenderPriorities[l] = -1;
                }
            }
        }
        for (int n9 = 0; n9 < modelData.faceCount; ++n9) {
            int n10;
            if (modelData.faceRenderTypes == null) {
                n10 = 0;
            }
            else {
                n10 = modelData.faceRenderTypes[n9];
            }
            byte b;
            if (modelData.faceAlphas == null) {
                b = 0;
            }
            else {
                b = modelData.faceAlphas[n9];
            }
            int n11;
            if (modelData.faceTextures == null) {
                n11 = -1;
            }
            else {
                n11 = modelData.faceTextures[n9];
            }
            if (b == -2) {
                n10 = 3;
            }
            if (b == -1) {
                n10 = 2;
            }
            if (n11 == -1) {
                if (n10 == 0) {
                    final int n12 = modelData.faceColors[n9] & 0xFFFF;
                    VertexNormal vertexNormal;
                    if (modelData.vertexVertices != null && modelData.vertexVertices[modelData.verticesY[n9]] != null) {
                        vertexNormal = modelData.vertexVertices[modelData.verticesY[n9]];
                    }
                    else {
                        vertexNormal = modelData.vertexNormals[modelData.verticesY[n9]];
                    }
                    model.faceColors1[n9] = method1186(n12, n + (n3 * (vertexNormal.z * -1941999827) + n4 * (vertexNormal.x * 124229261) + n5 * (vertexNormal.magnitude * 2108671835)) / (n6 * (vertexNormal.y * -1837445001)));
                    VertexNormal vertexNormal2;
                    if (modelData.vertexVertices != null && modelData.vertexVertices[modelData.verticesZ[n9]] != null) {
                        vertexNormal2 = modelData.vertexVertices[modelData.verticesZ[n9]];
                    }
                    else {
                        vertexNormal2 = modelData.vertexNormals[modelData.verticesZ[n9]];
                    }
                    model.faceColors2[n9] = method1186(n12, n + (n3 * (vertexNormal2.z * -1941999827) + n4 * (vertexNormal2.x * 124229261) + n5 * (vertexNormal2.magnitude * 2108671835)) / (n6 * (vertexNormal2.y * -1837445001)));
                    VertexNormal vertexNormal3;
                    if (modelData.vertexVertices != null && modelData.vertexVertices[modelData.vertexSkins[n9]] != null) {
                        vertexNormal3 = modelData.vertexVertices[modelData.vertexSkins[n9]];
                    }
                    else {
                        vertexNormal3 = modelData.vertexNormals[modelData.vertexSkins[n9]];
                    }
                    model.faceColors3[n9] = method1186(n12, n + (n3 * (vertexNormal3.z * -1941999827) + n4 * (vertexNormal3.x * 124229261) + n5 * (vertexNormal3.magnitude * 2108671835)) / (n6 * (vertexNormal3.y * -1837445001)));
                }
                else if (n10 == 1) {
                    final FaceNormal faceNormal = modelData.faceNormals[n9];
                    model.faceColors1[n9] = method1186(modelData.faceColors[n9] & 0xFFFF, n + (n3 * (faceNormal.x * -18074541) + n4 * (faceNormal.y * 1542458359) + n5 * (faceNormal.z * -446870673)) / (n6 + n6 / 2));
                    model.faceColors3[n9] = -1;
                }
                else if (n10 == 3) {
                    model.faceColors1[n9] = 128;
                    model.faceColors3[n9] = -1;
                }
                else {
                    model.faceColors3[n9] = -2;
                }
            }
            else if (n10 == 0) {
                VertexNormal vertexNormal4;
                if (modelData.vertexVertices != null && modelData.vertexVertices[modelData.verticesY[n9]] != null) {
                    vertexNormal4 = modelData.vertexVertices[modelData.verticesY[n9]];
                }
                else {
                    vertexNormal4 = modelData.vertexNormals[modelData.verticesY[n9]];
                }
                model.faceColors1[n9] = method1200(n + (n3 * (vertexNormal4.z * -1941999827) + n4 * (vertexNormal4.x * 124229261) + n5 * (vertexNormal4.magnitude * 2108671835)) / (n6 * (vertexNormal4.y * -1837445001)));
                VertexNormal vertexNormal5;
                if (modelData.vertexVertices != null && modelData.vertexVertices[modelData.verticesZ[n9]] != null) {
                    vertexNormal5 = modelData.vertexVertices[modelData.verticesZ[n9]];
                }
                else {
                    vertexNormal5 = modelData.vertexNormals[modelData.verticesZ[n9]];
                }
                model.faceColors2[n9] = method1200(n + (n3 * (vertexNormal5.z * -1941999827) + n4 * (vertexNormal5.x * 124229261) + n5 * (vertexNormal5.magnitude * 2108671835)) / (n6 * (vertexNormal5.y * -1837445001)));
                VertexNormal vertexNormal6;
                if (modelData.vertexVertices != null && modelData.vertexVertices[modelData.vertexSkins[n9]] != null) {
                    vertexNormal6 = modelData.vertexVertices[modelData.vertexSkins[n9]];
                }
                else {
                    vertexNormal6 = modelData.vertexNormals[modelData.vertexSkins[n9]];
                }
                model.faceColors3[n9] = method1200(n + (n3 * (vertexNormal6.z * -1941999827) + n4 * (vertexNormal6.x * 124229261) + n5 * (vertexNormal6.magnitude * 2108671835)) / (n6 * (vertexNormal6.y * -1837445001)));
            }
            else if (n10 == 1) {
                final FaceNormal faceNormal2 = modelData.faceNormals[n9];
                model.faceColors1[n9] = method1200(n + (n3 * (faceNormal2.x * -18074541) + n4 * (faceNormal2.y * 1542458359) + n5 * (faceNormal2.z * -446870673)) / (n6 + n6 / 2));
                model.faceColors3[n9] = -1;
            }
            else {
                model.faceColors3[n9] = -2;
            }
        }
        modelData.di();
        model.verticesCount = modelData.verticesCount;
        model.verticesX = modelData.indices2;
        model.verticesY = modelData.indices3;
        model.verticesZ = modelData.indices1;
        model.indicesCount = modelData.faceCount;
        model.indices1 = modelData.verticesY;
        model.indices2 = modelData.verticesZ;
        model.indices3 = modelData.vertexSkins;
        model.faceAlphas = modelData.faceRenderPriorities;
        model.field2154 = modelData.faceAlphas;
        model.field2152 = modelData.priority;
        model.vertexLabels = modelData.vertexLabels;
        model.faceLabelsAlpha = modelData.faceLabelsAlpha;
        model.faceTextures = modelData.faceTextures;
        model.field2156 = modelData.field1899;
        model.field2160 = modelData.field1924;
        return model;
    }
    
    void invalidate() {
        this.vertexNormals = null;
        this.vertexVertices = null;
        this.faceNormals = null;
        this.isBoundsCalculated = false;
    }
    
    void ce() {
        if (this.isBoundsCalculated) {
            return;
        }
        this.et = 0;
        this.field1931 = 0;
        this.field1932 = 999999;
        this.field1923 = -999999;
        this.field1934 = -99999;
        this.field1918 = 99999;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.indices2[i];
            final int field1931 = this.indices3[i];
            final int n2 = this.indices1[i];
            if (n < this.field1932) {
                this.field1932 = n;
            }
            if (n > this.field1923) {
                this.field1923 = n;
            }
            if (n2 < this.field1918) {
                this.field1918 = n2;
            }
            if (n2 > this.field1934) {
                this.field1934 = n2;
            }
            if (-field1931 > this.et * 1550732737) {
                this.et = -field1931 * -644693439;
            }
            if (field1931 > this.field1931) {
                this.field1931 = field1931;
            }
        }
        this.isBoundsCalculated = true;
    }
    
    public final Model toModel(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.calculateVertexNormals();
        final int n6 = n2 * (int)Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5) >> 8;
        final Model model = new Model();
        model.faceColors1 = new int[this.faceCount];
        model.faceColors2 = new int[this.faceCount];
        model.faceColors3 = new int[this.faceCount];
        if (this.textureTriangleCount > 0 && this.textureCoords != null) {
            final int[] array = new int[this.textureTriangleCount];
            for (int i = 0; i < this.faceCount; ++i) {
                if (this.textureCoords[i] != -1) {
                    final int[] array2 = array;
                    final int n7 = this.textureCoords[i] & 0xFF;
                    ++array2[n7];
                }
            }
            model.field2153 = 0;
            for (int j = 0; j < this.textureTriangleCount; ++j) {
                if (array[j] > 0 && this.textureRenderTypes[j] == 0) {
                    final Model model2 = model;
                    ++model2.field2153;
                }
            }
            model.field2199 = new int[model.field2153];
            model.field2155 = new int[model.field2153];
            model.field2187 = new int[model.field2153];
            int n8 = 0;
            for (int k = 0; k < this.textureTriangleCount; ++k) {
                if (array[k] > 0 && this.textureRenderTypes[k] == 0) {
                    model.field2199[n8] = (this.texTriangleX[k] & 0xFFFF);
                    model.field2155[n8] = (this.texTriangleY[k] & 0xFFFF);
                    model.field2187[n8] = (this.texTriangleZ[k] & 0xFFFF);
                    array[k] = n8++;
                }
                else {
                    array[k] = -1;
                }
            }
            model.faceRenderPriorities = new byte[this.faceCount];
            for (int l = 0; l < this.faceCount; ++l) {
                if (this.textureCoords[l] != -1) {
                    model.faceRenderPriorities[l] = (byte)array[this.textureCoords[l] & 0xFF];
                }
                else {
                    model.faceRenderPriorities[l] = -1;
                }
            }
        }
        for (int n9 = 0; n9 < this.faceCount; ++n9) {
            int n10;
            if (this.faceRenderTypes == null) {
                n10 = 0;
            }
            else {
                n10 = this.faceRenderTypes[n9];
            }
            byte b;
            if (this.faceAlphas == null) {
                b = 0;
            }
            else {
                b = this.faceAlphas[n9];
            }
            int n11;
            if (this.faceTextures == null) {
                n11 = -1;
            }
            else {
                n11 = this.faceTextures[n9];
            }
            if (b == -2) {
                n10 = 3;
            }
            if (b == -1) {
                n10 = 2;
            }
            if (n11 == -1) {
                if (n10 == 0) {
                    final int n12 = this.faceColors[n9] & 0xFFFF;
                    VertexNormal vertexNormal;
                    if (this.vertexVertices != null && this.vertexVertices[this.verticesY[n9]] != null) {
                        vertexNormal = this.vertexVertices[this.verticesY[n9]];
                    }
                    else {
                        vertexNormal = this.vertexNormals[this.verticesY[n9]];
                    }
                    model.faceColors1[n9] = method1186(n12, n + (n3 * (vertexNormal.z * -1941999827) + n4 * (vertexNormal.x * 124229261) + n5 * (vertexNormal.magnitude * 2108671835)) / (n6 * (vertexNormal.y * -1837445001)));
                    VertexNormal vertexNormal2;
                    if (this.vertexVertices != null && this.vertexVertices[this.verticesZ[n9]] != null) {
                        vertexNormal2 = this.vertexVertices[this.verticesZ[n9]];
                    }
                    else {
                        vertexNormal2 = this.vertexNormals[this.verticesZ[n9]];
                    }
                    model.faceColors2[n9] = method1186(n12, n + (n3 * (vertexNormal2.z * -1941999827) + n4 * (vertexNormal2.x * 124229261) + n5 * (vertexNormal2.magnitude * 2108671835)) / (n6 * (vertexNormal2.y * -1837445001)));
                    VertexNormal vertexNormal3;
                    if (this.vertexVertices != null && this.vertexVertices[this.vertexSkins[n9]] != null) {
                        vertexNormal3 = this.vertexVertices[this.vertexSkins[n9]];
                    }
                    else {
                        vertexNormal3 = this.vertexNormals[this.vertexSkins[n9]];
                    }
                    model.faceColors3[n9] = method1186(n12, n + (n3 * (vertexNormal3.z * -1941999827) + n4 * (vertexNormal3.x * 124229261) + n5 * (vertexNormal3.magnitude * 2108671835)) / (n6 * (vertexNormal3.y * -1837445001)));
                }
                else if (n10 == 1) {
                    final FaceNormal faceNormal = this.faceNormals[n9];
                    model.faceColors1[n9] = method1186(this.faceColors[n9] & 0xFFFF, n + (n3 * (faceNormal.x * -18074541) + n4 * (faceNormal.y * 1542458359) + n5 * (faceNormal.z * -446870673)) / (n6 + n6 / 2));
                    model.faceColors3[n9] = -1;
                }
                else if (n10 == 3) {
                    model.faceColors1[n9] = 128;
                    model.faceColors3[n9] = -1;
                }
                else {
                    model.faceColors3[n9] = -2;
                }
            }
            else if (n10 == 0) {
                VertexNormal vertexNormal4;
                if (this.vertexVertices != null && this.vertexVertices[this.verticesY[n9]] != null) {
                    vertexNormal4 = this.vertexVertices[this.verticesY[n9]];
                }
                else {
                    vertexNormal4 = this.vertexNormals[this.verticesY[n9]];
                }
                model.faceColors1[n9] = method1200(n + (n3 * (vertexNormal4.z * -1941999827) + n4 * (vertexNormal4.x * 124229261) + n5 * (vertexNormal4.magnitude * 2108671835)) / (n6 * (vertexNormal4.y * -1837445001)));
                VertexNormal vertexNormal5;
                if (this.vertexVertices != null && this.vertexVertices[this.verticesZ[n9]] != null) {
                    vertexNormal5 = this.vertexVertices[this.verticesZ[n9]];
                }
                else {
                    vertexNormal5 = this.vertexNormals[this.verticesZ[n9]];
                }
                model.faceColors2[n9] = method1200(n + (n3 * (vertexNormal5.z * -1941999827) + n4 * (vertexNormal5.x * 124229261) + n5 * (vertexNormal5.magnitude * 2108671835)) / (n6 * (vertexNormal5.y * -1837445001)));
                VertexNormal vertexNormal6;
                if (this.vertexVertices != null && this.vertexVertices[this.vertexSkins[n9]] != null) {
                    vertexNormal6 = this.vertexVertices[this.vertexSkins[n9]];
                }
                else {
                    vertexNormal6 = this.vertexNormals[this.vertexSkins[n9]];
                }
                model.faceColors3[n9] = method1200(n + (n3 * (vertexNormal6.z * -1941999827) + n4 * (vertexNormal6.x * 124229261) + n5 * (vertexNormal6.magnitude * 2108671835)) / (n6 * (vertexNormal6.y * -1837445001)));
            }
            else if (n10 == 1) {
                final FaceNormal faceNormal2 = this.faceNormals[n9];
                model.faceColors1[n9] = method1200(n + (n3 * (faceNormal2.x * -18074541) + n4 * (faceNormal2.y * 1542458359) + n5 * (faceNormal2.z * -446870673)) / (n6 + n6 / 2));
                model.faceColors3[n9] = -1;
            }
            else {
                model.faceColors3[n9] = -2;
            }
        }
        this.di();
        model.verticesCount = this.verticesCount;
        model.verticesX = this.indices2;
        model.verticesY = this.indices3;
        model.verticesZ = this.indices1;
        model.indicesCount = this.faceCount;
        model.indices1 = this.verticesY;
        model.indices2 = this.verticesZ;
        model.indices3 = this.vertexSkins;
        model.faceAlphas = this.faceRenderPriorities;
        model.field2154 = this.faceAlphas;
        model.field2152 = this.priority;
        model.vertexLabels = this.vertexLabels;
        model.faceLabelsAlpha = this.faceLabelsAlpha;
        model.faceTextures = this.faceTextures;
        model.field2156 = this.field1899;
        model.field2160 = this.field1924;
        return model;
    }
    
    public void cb(final short n, final short n2) {
        for (int i = 0; i < this.faceCount; ++i) {
            if (this.faceColors[i] == n) {
                this.faceColors[i] = n2;
            }
        }
    }
    
    public void ch(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices2[i] = this.indices2[i] * n / 128;
            this.indices3[i] = this.indices3[i] * n2 / 128;
            this.indices1[i] = this.indices1[i] * n3 / 128;
        }
        this.ci();
    }
    
    public ModelData ch(final int n, final int n2, final int n3) {
        this.changeOffset(n, n2, n3);
        return this;
    }
    
    public void cl(final int n) {
        final int n2 = ModelData.ModelData_sine[n];
        final int n3 = ModelData.ModelData_cosine[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n4 = this.indices1[i] * n2 + this.indices2[i] * n3 >> 16;
            this.indices1[i] = this.indices1[i] * n3 - this.indices2[i] * n2 >> 16;
            this.indices2[i] = n4;
        }
        this.ci();
    }
    
    public void cn() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices2[i] = -this.indices2[i];
            this.indices1[i] = -this.indices1[i];
        }
        this.ci();
    }
    
    void dc() {
        if (this.faceSkins != null) {
            final int[] array = new int[256];
            int n = 0;
            for (int i = 0; i < this.verticesCount; ++i) {
                final int n2 = this.faceSkins[i];
                final int[] array2 = array;
                final int n3 = n2;
                ++array2[n3];
                if (n2 > n) {
                    n = n2;
                }
            }
            this.vertexLabels = new int[n + 1][];
            for (int j = 0; j <= n; ++j) {
                this.vertexLabels[j] = new int[array[j]];
                array[j] = 0;
            }
            for (int k = 0; k < this.verticesCount; ++k) {
                final int n4 = this.faceSkins[k];
                this.vertexLabels[n4][array[n4]++] = k;
            }
            this.faceSkins = null;
        }
        if (this.verticesX != null) {
            final int[] array3 = new int[256];
            int n5 = 0;
            for (int l = 0; l < this.faceCount; ++l) {
                final int n6 = this.verticesX[l];
                final int[] array4 = array3;
                final int n7 = n6;
                ++array4[n7];
                if (n6 > n5) {
                    n5 = n6;
                }
            }
            this.faceLabelsAlpha = new int[n5 + 1][];
            for (int n8 = 0; n8 <= n5; ++n8) {
                this.faceLabelsAlpha[n8] = new int[array3[n8]];
                array3[n8] = 0;
            }
            for (int n9 = 0; n9 < this.faceCount; ++n9) {
                final int n10 = this.verticesX[n9];
                this.faceLabelsAlpha[n10][array3[n10]++] = n9;
            }
            this.verticesX = null;
        }
    }
    
    public short[] on() {
        return this.texTriangleY;
    }
    
    public void cf(final int n) {
        final int n2 = ModelData.ModelData_sine[n];
        final int n3 = ModelData.ModelData_cosine[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n4 = this.indices1[i] * n2 + this.indices2[i] * n3 >> 16;
            this.indices1[i] = this.indices1[i] * n3 - this.indices2[i] * n2 >> 16;
            this.indices2[i] = n4;
        }
        this.ci();
    }
    
    public void cw() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices1[i] = -this.indices1[i];
        }
        for (int j = 0; j < this.faceCount; ++j) {
            final int n = this.verticesY[j];
            this.verticesY[j] = this.vertexSkins[j];
            this.vertexSkins[j] = n;
        }
        this.ci();
    }
    
    public void cv(final short n, final short n2) {
        for (int i = 0; i < this.faceCount; ++i) {
            if (this.faceColors[i] == n) {
                this.faceColors[i] = n2;
            }
        }
    }
    
    public ModelData copyModelData() {
        this.method1190();
        return this;
    }
    
    void method1184(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        final Buffer buffer6 = new Buffer(array);
        final Buffer buffer7 = new Buffer(array);
        buffer.offset = (array.length - 23) * -1516355947;
        final int signedShortAddLE = buffer.readSignedShortAddLE(-1263250796);
        final int jn = buffer.jn(-2002030055);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedByteAdd = buffer.readUnsignedByteAdd(876883841);
        final int method2513 = buffer.method2513(-435176740);
        final int jn2 = buffer.jn(-1431584774);
        final int jn3 = buffer.jn(-1021983654);
        final int uShortSmart = buffer.readUShortSmart(-769856271);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (ra > 0) {
            this.faceAlphas = new byte[ra];
            buffer.offset = 0;
            for (int i = 0; i < ra; ++i) {
                final byte[] faceRenderPriorities = this.faceRenderPriorities;
                final int n4 = i;
                final byte wu = Buffer.wu(buffer, 435772489);
                faceRenderPriorities[n4] = wu;
                final byte b = wu;
                if (b == 0) {
                    ++n;
                }
                if (b >= 1 && b <= 3) {
                    ++n2;
                }
                if (b == 2) {
                    ++n3;
                }
            }
        }
        final int n7;
        final int n6;
        int n5 = n6 = (n7 = ra) + signedShortAddLE;
        if (ra2 == 1) {
            n5 += jn;
        }
        final int n8 = n5;
        final int n10;
        int n9 = n10 = n5 + jn;
        if (ra3 == 255) {
            n9 += jn;
        }
        final int n11 = n9;
        if (ra5 == 1) {
            n9 += jn;
        }
        final int n12 = n9;
        if (ra7 == 1) {
            n9 += signedShortAddLE;
        }
        final int n13 = n9;
        if (ra4 == 1) {
            n9 += jn;
        }
        final int n14 = n9;
        final int n16;
        int n15 = n16 = n9 + jn3;
        if (ra6 == 1) {
            n15 += jn * 2;
        }
        final int n17 = n15;
        final int n28;
        final int n27;
        final int n26;
        final int n25;
        final int n24;
        final int n23;
        final int n22;
        final int n21;
        final int n20;
        final int n19;
        final int n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = n15 + uShortSmart) + jn * 2) + unsignedByteAdd) + method2513) + jn2) + n * 6) + n2 * 6) + n2 * 6) + n2 * 2) + n2) + (n2 * 2 + n3 * 2);
        this.field1923 = signedShortAddLE;
        this.field1918 = jn;
        this.field1923 = ra;
        this.faceSkins = new int[signedShortAddLE];
        this.verticesX = new int[signedShortAddLE];
        this.vertexSkins = new int[signedShortAddLE];
        this.faceSkins = new int[jn];
        this.faceSkins = new int[jn];
        this.indices2 = new int[jn];
        if (ra7 == 1) {
            this.indices3 = new int[signedShortAddLE];
        }
        if (ra2 == 1) {
            this.textureRenderTypes = new byte[jn];
        }
        if (ra3 == 255) {
            this.faceAlphas = new byte[jn];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceRenderPriorities = new byte[jn];
        }
        if (ra5 == 1) {
            this.verticesZ = new int[jn];
        }
        if (ra6 == 1) {
            this.texTriangleZ = new short[jn];
        }
        if (ra6 == 1 && ra > 0) {
            this.textureCoords = new byte[jn];
        }
        this.faceColors = new short[jn];
        if (ra > 0) {
            this.texTriangleZ = new short[ra];
            this.faceColors = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        buffer.offset = n7 * -1516355947;
        buffer2.offset = n27 * -1516355947;
        buffer3.offset = n26 * -1516355947;
        buffer4.offset = n25 * -1516355947;
        buffer5.offset = n12 * -1516355947;
        int n29 = 0;
        int n30 = 0;
        int n31 = 0;
        for (int j = 0; j < signedShortAddLE; ++j) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int varInt = 0;
            if ((ra8 & 0x1) != 0x0) {
                varInt = buffer2.readVarInt(1971231296);
            }
            int uShortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                uShortSmart2 = buffer3.readUShortSmart(1612360719);
            }
            int varInt2 = 0;
            if ((ra8 & 0x4) != 0x0) {
                varInt2 = buffer4.readVarInt(1233827137);
            }
            this.faceSkins[j] = n29 + varInt;
            this.verticesY[j] = n30 + uShortSmart2;
            this.verticesZ[j] = n31 + varInt2;
            n29 = this.verticesX[j];
            n30 = this.faceSkins[j];
            n31 = this.vertexSkins[j];
            if (ra7 == 1) {
                this.faceSkins[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n28 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n10 * -1516355947;
        buffer4.offset = n13 * -1516355947;
        buffer5.offset = n11 * -1516355947;
        buffer6.offset = n16 * -1516355947;
        buffer7.offset = n17 * -1516355947;
        for (int k = 0; k < jn; ++k) {
            this.faceTextures[k] = (short)buffer.readMedium(818831461);
            if (ra2 == 1) {
                this.faceRenderPriorities[k] = Buffer.wu(buffer2, 435772489);
            }
            if (ra3 == 255) {
                this.faceRenderTypes[k] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.textureCoords[k] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.indices3[k] = Buffer.ra(buffer5, (byte)7);
            }
            if (ra6 == 1) {
                this.texTriangleX[k] = (short)(buffer6.readInt(-512750476) - 1);
            }
            if (this.faceAlphas != null && this.texTriangleZ[k] != -1) {
                this.faceRenderPriorities[k] = (byte)(Buffer.ra(buffer7, (byte)7) - 1);
            }
        }
        buffer.offset = n14 * -1516355947;
        buffer2.offset = n8 * -1516355947;
        int n32 = 0;
        int n33 = 0;
        int n34 = 0;
        int n35 = 0;
        for (int l = 0; l < jn; ++l) {
            final int ra9 = Buffer.ra(buffer2, (byte)7);
            if (ra9 == 1) {
                n32 = buffer.readUnsignedShortAddLE(2046431705) + n35;
                n33 = buffer.readUnsignedShortAddLE(2108210038) + n32;
                n34 = (n35 = buffer.readVarInt(1902436320) + n33);
                this.indices2[l] = n32;
                this.vertexSkins[l] = n33;
                this.verticesZ[l] = n34;
            }
            if (ra9 == 2) {
                n33 = n34;
                n34 = (n35 += buffer.method2513(1971941001));
                this.verticesY[l] = n32;
                this.verticesY[l] = n33;
                this.verticesY[l] = n34;
            }
            if (ra9 == 3) {
                n32 = n34;
                n34 = (n35 += buffer.method2491(1721982940));
                this.verticesX[l] = n32;
                this.verticesX[l] = n33;
                this.indices1[l] = n34;
            }
            if (ra9 == 4) {
                final int n36 = n32;
                n32 = n33;
                n33 = n36;
                n34 = (n35 += buffer.method2541(2094378484));
                this.vertexSkins[l] = n32;
                this.faceSkins[l] = n33;
                this.verticesX[l] = n34;
            }
        }
        buffer.offset = n24 * -1516355947;
        buffer2.offset = n23 * -1516355947;
        buffer3.offset = n22 * -1516355947;
        buffer4.offset = n21 * -1516355947;
        buffer5.offset = n20 * -1516355947;
        buffer6.offset = n19 * -1516355947;
        for (int n37 = 0; n37 < ra; ++n37) {
            if ((this.textureRenderTypes[n37] & 0xFF) == 0x0) {
                this.texTriangleY[n37] = (short)buffer.jn(561169310);
                this.texTriangleX[n37] = (short)buffer.method2516(68763571);
                this.texTriangleY[n37] = (short)buffer.method2491(103185776);
            }
        }
        buffer.offset = n18 * -1516355947;
        if (Buffer.ra(buffer, (byte)7) != 0) {
            new ModelData0();
            buffer.readUShortSmart(-1770689374);
            buffer.method2513(-1095546204);
            buffer.readUnsignedShort(806373583);
            buffer.jn(-1881895983);
        }
    }
    
    public void method1194() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices1[i] = -this.indices1[i];
        }
        for (int j = 0; j < this.faceCount; ++j) {
            final int n = this.verticesY[j];
            this.verticesY[j] = this.vertexSkins[j];
            this.vertexSkins[j] = n;
        }
        this.ci();
    }
    
    public void method1189() {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.indices1[i];
            this.indices1[i] = this.indices2[i];
            this.indices2[i] = -n;
        }
        this.ci();
    }
    
    public static ModelData sw(final ModelData modelData, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        return new ModelData(modelData, b, b2, b3, b4);
    }
    
    public void dw() {
        if (this.vertexNormals != null) {
            return;
        }
        this.vertexNormals = new VertexNormal[this.verticesCount];
        for (int i = 0; i < this.verticesCount; ++i) {
            this.vertexNormals[i] = new VertexNormal();
        }
        for (int j = 0; j < this.faceCount; ++j) {
            final int n = this.verticesY[j];
            final int n2 = this.verticesZ[j];
            final int n3 = this.vertexSkins[j];
            final int n4 = this.indices2[n2] - this.indices2[n];
            final int n5 = this.indices3[n2] - this.indices3[n];
            final int n6 = this.indices1[n2] - this.indices1[n];
            final int n7 = this.indices2[n3] - this.indices2[n];
            final int n8 = this.indices3[n3] - this.indices3[n];
            final int n9 = this.indices1[n3] - this.indices1[n];
            int n10;
            int n11;
            int n12;
            for (n10 = n5 * n9 - n8 * n6, n11 = n6 * n7 - n9 * n4, n12 = n4 * n8 - n7 * n5; n10 > 8192 || n11 > 8192 || n12 > 8192 || n10 < -389469498 || n11 < -1905863943 || n12 < -1738698907; n10 >>= 1, n11 >>= 1, n12 >>= 1) {}
            int n13 = (int)Math.sqrt(n10 * n10 + n11 * n11 + n12 * n12);
            if (n13 <= 0) {
                n13 = 1;
            }
            final int n14 = n10 * 256 / n13;
            final int n15 = n11 * 256 / n13;
            final int n16 = n12 * 1989362291 / n13;
            byte b;
            if (this.faceRenderTypes == null) {
                b = 0;
            }
            else {
                b = this.faceRenderTypes[j];
            }
            if (b == 0) {
                final VertexNormal vertexNormal2;
                final VertexNormal vertexNormal = vertexNormal2 = this.vertexNormals[n];
                vertexNormal2.z += n14 * 328354862;
                final VertexNormal vertexNormal3 = vertexNormal;
                vertexNormal3.x += n15 * -1303307195;
                final VertexNormal vertexNormal4 = vertexNormal;
                vertexNormal4.magnitude += n16 * -362430901;
                final VertexNormal vertexNormal5 = vertexNormal;
                vertexNormal5.y += 1073301069;
                final VertexNormal vertexNormal7;
                final VertexNormal vertexNormal6 = vertexNormal7 = this.vertexNormals[n2];
                vertexNormal7.z += n14 * 690600101;
                final VertexNormal vertexNormal8 = vertexNormal6;
                vertexNormal8.x += n15 * -1901731085;
                final VertexNormal vertexNormal9 = vertexNormal6;
                vertexNormal9.magnitude += n16 * 711778803;
                final VertexNormal vertexNormal10 = vertexNormal6;
                vertexNormal10.y -= 1992029881;
                final VertexNormal vertexNormal12;
                final VertexNormal vertexNormal11 = vertexNormal12 = this.vertexNormals[n3];
                vertexNormal12.z += n14 * 690600101;
                final VertexNormal vertexNormal13 = vertexNormal11;
                vertexNormal13.x += n15 * -1303307195;
                final VertexNormal vertexNormal14 = vertexNormal11;
                vertexNormal14.magnitude += n16 * 1688166178;
                final VertexNormal vertexNormal15 = vertexNormal11;
                vertexNormal15.y += 1108281853;
            }
            else if (b == 1) {
                if (this.faceNormals == null) {
                    this.faceNormals = new FaceNormal[this.faceCount];
                }
                final FaceNormal[] faceNormals = this.faceNormals;
                final int n17 = j;
                final FaceNormal faceNormal = new FaceNormal();
                faceNormals[n17] = faceNormal;
                final FaceNormal faceNormal2 = faceNormal;
                faceNormal2.x = n14 * 1219045431;
                faceNormal2.y = n15 * -1383295079;
                faceNormal2.z = n16 * -1973704156;
            }
        }
    }
    
    public void cj() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices1[i] = -this.indices1[i];
        }
        for (int j = 0; j < this.faceCount; ++j) {
            final int n = this.verticesY[j];
            this.verticesY[j] = this.vertexSkins[j];
            this.vertexSkins[j] = n;
        }
        this.ci();
    }
    
    public ModelData cj() {
        this.faceAlphas = this.faceAlphas.clone();
        return this;
    }
    
    static final int method1200(int n) {
        if (n < 2) {
            n = 2;
        }
        else if (n > 126) {
            n = 126;
        }
        return n;
    }
    
    public void cp(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices2[i] = this.indices2[i] * n / 78035716;
            this.indices3[i] = this.indices3[i] * n2 / -768723878;
            this.indices1[i] = this.indices1[i] * n3 / -526983290;
        }
        this.ci();
    }
    
    public void recolor(final short n, final short n2) {
        for (int i = 0; i < this.textureTriangleCount; ++i) {
            if (this.faceTextures[i] == n) {
                this.texTriangleY[i] = n2;
            }
        }
    }
    
    public byte[] fh() {
        return this.textureRenderTypes;
    }
    
    public ModelData rs(final short n, final short n2) {
        jw(this, n, n2);
        return this;
    }
    
    public void pe() {
        final VertexNormal[] bk = this.bk();
        final VertexNormal[] cs = this.cs();
        if (bk != null && this.rb == null) {
            final int verticesCount = this.getVerticesCount();
            this.rb = new int[verticesCount];
            this.jy = new int[verticesCount];
            this.cp = new int[verticesCount];
            for (int i = 0; i < verticesCount; ++i) {
                final VertexNormal vertexNormal;
                if (cs != null && (vertexNormal = cs[i]) != null) {
                    this.rb[i] = vertexNormal.wa();
                    this.jy[i] = vertexNormal.cz();
                    this.cp[i] = vertexNormal.bi();
                }
                else {
                    final VertexNormal vertexNormal2;
                    if ((vertexNormal2 = bk[i]) != null) {
                        this.rb[i] = vertexNormal2.wa();
                        this.jy[i] = vertexNormal2.cz();
                        this.cp[i] = vertexNormal2.bi();
                    }
                }
            }
        }
    }
    
    public void resize(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices2[i] = this.indices2[i] * n / 128;
            this.indices3[i] = this.indices3[i] * n2 / 128;
            this.indices1[i] = this.indices1[i] * n3 / 128;
        }
        this.ci();
    }
    
    public ModelData method1187(final int[][] array, final int n, final int n2, final int n3, final boolean b, final int n4) {
        this.dk();
        final int n5 = n + this.field1932;
        final int n6 = n + this.field1923;
        final int n7 = n3 + this.field1918;
        final int n8 = n3 + this.field1934;
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
        ModelData modelData;
        if (b) {
            modelData = new ModelData();
            modelData.verticesCount = this.verticesCount;
            modelData.faceCount = this.faceCount;
            modelData.textureTriangleCount = this.textureTriangleCount;
            modelData.indices2 = this.indices2;
            modelData.indices1 = this.indices1;
            modelData.verticesY = this.verticesY;
            modelData.verticesZ = this.verticesZ;
            modelData.vertexSkins = this.vertexSkins;
            modelData.faceRenderTypes = this.faceRenderTypes;
            modelData.faceRenderPriorities = this.faceRenderPriorities;
            modelData.faceAlphas = this.faceAlphas;
            modelData.textureCoords = this.textureCoords;
            modelData.faceColors = this.faceColors;
            modelData.faceTextures = this.faceTextures;
            modelData.priority = this.priority;
            modelData.textureRenderTypes = this.textureRenderTypes;
            modelData.texTriangleX = this.texTriangleX;
            modelData.texTriangleY = this.texTriangleY;
            modelData.texTriangleZ = this.texTriangleZ;
            modelData.faceSkins = this.faceSkins;
            modelData.verticesX = this.verticesX;
            modelData.vertexLabels = this.vertexLabels;
            modelData.faceLabelsAlpha = this.faceLabelsAlpha;
            modelData.ambient = this.ambient;
            modelData.contrast = this.contrast;
            modelData.indices3 = new int[modelData.verticesCount];
        }
        else {
            modelData = this;
        }
        if (n4 == 0) {
            for (int i = 0; i < modelData.verticesCount; ++i) {
                final int n13 = this.indices2[i] + n;
                final int n14 = this.indices1[i] + n3;
                final int n15 = n13 & 0x7F;
                final int n16 = n14 & 0x7F;
                final int n17 = n13 >> 7;
                final int n18 = n14 >> 7;
                modelData.indices3[i] = this.indices3[i] + ((array[n17][n18] * (128 - n15) + array[n17 + 1][n18] * n15 >> 7) * (128 - n16) + (array[n17][n18 + 1] * (128 - n15) + array[n17 + 1][n18 + 1] * n15 >> 7) * n16 >> 7) - n2;
            }
        }
        else {
            for (int j = 0; j < modelData.verticesCount; ++j) {
                final int n19 = (-this.indices3[j] << 16) / (this.et * 1550732737);
                if (n19 < n4) {
                    final int n20 = this.indices2[j] + n;
                    final int n21 = this.indices1[j] + n3;
                    final int n22 = n20 & 0x7F;
                    final int n23 = n21 & 0x7F;
                    final int n24 = n20 >> 7;
                    final int n25 = n21 >> 7;
                    modelData.indices3[j] = this.indices3[j] + (((array[n24][n25] * (128 - n22) + array[n24 + 1][n25] * n22 >> 7) * (128 - n23) + (array[n24][n25 + 1] * (128 - n22) + array[n24 + 1][n25 + 1] * n22 >> 7) * n23 >> 7) - n2) * (n4 - n19) / n4;
                }
            }
        }
        modelData.ci();
        return modelData;
    }
    
    final int method1202(final ModelData modelData, final int n) {
        int n2 = -1;
        final int n3 = modelData.indices2[n];
        final int n4 = modelData.indices3[n];
        final int n5 = modelData.indices1[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            if (n3 == this.indices2[i] && n4 == this.indices3[i] && n5 == this.indices1[i]) {
                n2 = i;
                break;
            }
        }
        if (n2 == -1) {
            this.indices2[this.verticesCount] = n3;
            this.indices3[this.verticesCount] = n4;
            this.indices1[this.verticesCount] = n5;
            if (modelData.faceSkins != null) {
                this.faceSkins[this.verticesCount] = modelData.faceSkins[n];
            }
            if (modelData.field1899 != null) {
                this.field1899[this.verticesCount] = modelData.field1899[n];
                this.field1924[this.verticesCount] = modelData.field1924[n];
            }
            n2 = this.verticesCount++;
        }
        return n2;
    }
    
    static void dt(final ModelData modelData, final ModelData modelData2, final int n, final int n2, final int n3, final boolean b) {
        modelData.dk();
        modelData.calculateVertexNormals();
        modelData2.dk();
        modelData2.calculateVertexNormals();
        ++ModelData.field1937;
        int n4 = 0;
        final int[] indices2 = modelData2.indices2;
        final int verticesCount = modelData2.verticesCount;
        for (int i = 0; i < modelData.verticesCount; ++i) {
            final VertexNormal vertexNormal = modelData.vertexNormals[i];
            if (vertexNormal.y * -1837445001 != 0) {
                final int n5 = modelData.indices3[i] - n2;
                if (n5 <= modelData2.field1931) {
                    final int n6 = modelData.indices2[i] - n;
                    if (n6 >= modelData2.field1932) {
                        if (n6 <= modelData2.field1923) {
                            final int n7 = modelData.indices1[i] - n3;
                            if (n7 >= modelData2.field1918) {
                                if (n7 <= modelData2.field1934) {
                                    for (int j = 0; j < verticesCount; ++j) {
                                        final VertexNormal vertexNormal2 = modelData2.vertexNormals[j];
                                        if (n6 == indices2[j] && n7 == modelData2.indices1[j] && n5 == modelData2.indices3[j] && vertexNormal2.y * -1837445001 != 0) {
                                            if (modelData.vertexVertices == null) {
                                                modelData.vertexVertices = new VertexNormal[modelData.verticesCount];
                                            }
                                            if (modelData2.vertexVertices == null) {
                                                modelData2.vertexVertices = new VertexNormal[verticesCount];
                                            }
                                            VertexNormal vertexNormal3 = modelData.vertexVertices[i];
                                            if (vertexNormal3 == null) {
                                                final VertexNormal[] vertexVertices = modelData.vertexVertices;
                                                final int n8 = i;
                                                final VertexNormal vertexNormal4 = new VertexNormal(vertexNormal);
                                                vertexVertices[n8] = vertexNormal4;
                                                vertexNormal3 = vertexNormal4;
                                            }
                                            VertexNormal vertexNormal5 = modelData2.vertexVertices[j];
                                            if (vertexNormal5 == null) {
                                                final VertexNormal[] vertexVertices2 = modelData2.vertexVertices;
                                                final int n9 = j;
                                                final VertexNormal vertexNormal6 = new VertexNormal(vertexNormal2);
                                                vertexVertices2[n9] = vertexNormal6;
                                                vertexNormal5 = vertexNormal6;
                                            }
                                            final VertexNormal vertexNormal7 = vertexNormal3;
                                            vertexNormal7.z += vertexNormal2.z * 1;
                                            final VertexNormal vertexNormal8 = vertexNormal3;
                                            vertexNormal8.x += vertexNormal2.x * 1;
                                            final VertexNormal vertexNormal9 = vertexNormal3;
                                            vertexNormal9.magnitude += vertexNormal2.magnitude * 1;
                                            final VertexNormal vertexNormal10 = vertexNormal3;
                                            vertexNormal10.y += vertexNormal2.y * 1;
                                            final VertexNormal vertexNormal11 = vertexNormal5;
                                            vertexNormal11.z += vertexNormal.z * 1;
                                            final VertexNormal vertexNormal12 = vertexNormal5;
                                            vertexNormal12.x += vertexNormal.x * 1;
                                            final VertexNormal vertexNormal13 = vertexNormal5;
                                            vertexNormal13.magnitude += vertexNormal.magnitude * 1;
                                            final VertexNormal vertexNormal14 = vertexNormal5;
                                            vertexNormal14.y += vertexNormal.y * 1;
                                            ++n4;
                                            ModelData.field1935[i] = ModelData.field1937;
                                            ModelData.field1936[j] = ModelData.field1937;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (n4 >= 3 && b) {
            for (int k = 0; k < modelData.faceCount; ++k) {
                if (ModelData.field1935[modelData.verticesY[k]] == ModelData.field1937 && ModelData.field1935[modelData.verticesZ[k]] == ModelData.field1937 && ModelData.field1935[modelData.vertexSkins[k]] == ModelData.field1937) {
                    if (modelData.faceRenderTypes == null) {
                        modelData.faceRenderTypes = new byte[modelData.faceCount];
                    }
                    modelData.faceRenderTypes[k] = 2;
                }
            }
            for (int l = 0; l < modelData2.faceCount; ++l) {
                if (ModelData.field1936[modelData2.verticesY[l]] == ModelData.field1937 && ModelData.field1936[modelData2.verticesZ[l]] == ModelData.field1937 && ModelData.field1936[modelData2.vertexSkins[l]] == ModelData.field1937) {
                    if (modelData2.faceRenderTypes == null) {
                        modelData2.faceRenderTypes = new byte[modelData2.faceCount];
                    }
                    modelData2.faceRenderTypes[l] = 2;
                }
            }
        }
    }
    
    public ModelData tp(final int n, final int n2, final int n3) {
        this.resize(n, n2, n3);
        return this;
    }
    
    public ModelData ps() {
        this.method1188();
        return this;
    }
    
    static final int method1186(final int n, int n2) {
        n2 = n2 * (n & 0x7F) >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    final int bv(final ModelData modelData, final int n) {
        int n2 = -1;
        final int n3 = modelData.indices2[n];
        final int n4 = modelData.indices3[n];
        final int n5 = modelData.indices1[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            if (n3 == this.indices2[i] && n4 == this.indices3[i] && n5 == this.indices1[i]) {
                n2 = i;
                break;
            }
        }
        if (n2 == -1) {
            this.indices2[this.verticesCount] = n3;
            this.indices3[this.verticesCount] = n4;
            this.indices1[this.verticesCount] = n5;
            if (modelData.faceSkins != null) {
                this.faceSkins[this.verticesCount] = modelData.faceSkins[n];
            }
            if (modelData.field1899 != null) {
                this.field1899[this.verticesCount] = modelData.field1899[n];
                this.field1924[this.verticesCount] = modelData.field1924[n];
            }
            n2 = this.verticesCount++;
        }
        return n2;
    }
    
    public static ModelData bo(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-5));
        if (takeFile == null) {
            return null;
        }
        return new ModelData(takeFile);
    }
    
    void di() {
        if (this.faceSkins != null) {
            final int[] array = new int[256];
            int n = 0;
            for (int i = 0; i < this.verticesCount; ++i) {
                final int n2 = this.faceSkins[i];
                final int[] array2 = array;
                final int n3 = n2;
                ++array2[n3];
                if (n2 > n) {
                    n = n2;
                }
            }
            this.vertexLabels = new int[n + 1][];
            for (int j = 0; j <= n; ++j) {
                this.vertexLabels[j] = new int[array[j]];
                array[j] = 0;
            }
            for (int k = 0; k < this.verticesCount; ++k) {
                final int n4 = this.faceSkins[k];
                this.vertexLabels[n4][array[n4]++] = k;
            }
            this.faceSkins = null;
        }
        if (this.verticesX != null) {
            final int[] array3 = new int[256];
            int n5 = 0;
            for (int l = 0; l < this.faceCount; ++l) {
                final int n6 = this.verticesX[l];
                final int[] array4 = array3;
                final int n7 = n6;
                ++array4[n7];
                if (n6 > n5) {
                    n5 = n6;
                }
            }
            this.faceLabelsAlpha = new int[n5 + 1][];
            for (int n8 = 0; n8 <= n5; ++n8) {
                this.faceLabelsAlpha[n8] = new int[array3[n8]];
                array3[n8] = 0;
            }
            for (int n9 = 0; n9 < this.faceCount; ++n9) {
                final int n10 = this.verticesX[n9];
                this.faceLabelsAlpha[n10][array3[n10]++] = n9;
            }
            this.verticesX = null;
        }
    }
    
    public ModelData ok(final short n, final short n2) {
        lm(this, n, n2);
        return this;
    }
    
    public ModelData bp() {
        this.faceColors = this.faceColors.clone();
        return this;
    }
    
    public void cc() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices2[i] = -this.indices2[i];
            this.indices1[i] = -this.indices1[i];
        }
        this.ci();
    }
    
    void bt(final byte[] array) {
        boolean b = false;
        boolean b2 = false;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        buffer.offset = (array.length - 23) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-1698514121);
        final int unsignedShort2 = buffer.readUnsignedShort(-1301931763);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-1340532364);
        final int unsignedShort4 = buffer.readUnsignedShort(351486620);
        buffer.readUnsignedShort(-1244218789);
        final int unsignedShort5 = buffer.readUnsignedShort(-545310067);
        final int unsignedShort6 = buffer.readUnsignedShort(-481973716);
        final int n4;
        final int n3;
        final int n2;
        int n = n2 = (n3 = (n4 = 0) + unsignedShort) + unsignedShort2;
        if (ra3 == 255) {
            n += unsignedShort2;
        }
        final int n5 = n;
        if (ra5 == 1) {
            n += unsignedShort2;
        }
        final int n6 = n;
        if (ra2 == 1) {
            n += unsignedShort2;
        }
        final int n7 = n;
        final int n9;
        int n8 = n9 = n + unsignedShort6;
        if (ra4 == 1) {
            n8 += unsignedShort2;
        }
        final int n10 = n8;
        final int n15;
        final int n14;
        final int n13;
        final int n12;
        final int n11 = (n12 = (n13 = (n14 = (n15 = n8 + unsignedShort5) + unsignedShort2 * 2) + ra * 6) + unsignedShort3) + unsignedShort4;
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        if (ra6 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
            this.textureCoords = new byte[unsignedShort2];
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        if (ra7 == 1) {
            this.field1899 = new int[unsignedShort][];
            this.field1924 = new int[unsignedShort][];
        }
        this.faceColors = new short[unsignedShort2];
        buffer.offset = n4 * -1516355947;
        buffer2.offset = n13 * -1516355947;
        buffer3.offset = n12 * -1516355947;
        buffer4.offset = n11 * -1516355947;
        buffer5.offset = n7 * -1516355947;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1291675075);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1868392237);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(2048793374);
            }
            this.indices2[i] = n16 + shortSmart;
            this.indices3[i] = n17 + shortSmart2;
            this.indices1[i] = n18 + shortSmart3;
            n16 = this.indices2[i];
            n17 = this.indices3[i];
            n18 = this.indices1[i];
            if (ra6 == 1) {
                this.faceSkins[i] = Buffer.ra(buffer5, (byte)7);
            }
        }
        if (ra7 == 1) {
            for (int j = 0; j < unsignedShort; ++j) {
                final int ra9 = Buffer.ra(buffer5, (byte)7);
                this.field1899[j] = new int[ra9];
                this.field1924[j] = new int[ra9];
                for (int k = 0; k < ra9; ++k) {
                    this.field1899[j][k] = Buffer.ra(buffer5, (byte)7);
                    this.field1924[j][k] = Buffer.ra(buffer5, (byte)7);
                }
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n2 * -1516355947;
        buffer4.offset = n9 * -1516355947;
        buffer5.offset = n5 * -1516355947;
        for (int l = 0; l < unsignedShort2; ++l) {
            this.faceColors[l] = (short)buffer.readUnsignedShort(-581184601);
            if (ra2 == 1) {
                final int ra10 = Buffer.ra(buffer2, (byte)7);
                if ((ra10 & 0x1) == 0x1) {
                    this.faceRenderTypes[l] = 1;
                    b = true;
                }
                else {
                    this.faceRenderTypes[l] = 0;
                }
                if ((ra10 & 0x2) == 0x2) {
                    this.textureCoords[l] = (byte)(ra10 >> 2);
                    this.faceTextures[l] = this.faceColors[l];
                    this.faceColors[l] = 127;
                    if (this.faceTextures[l] != -1) {
                        b2 = true;
                    }
                }
                else {
                    this.textureCoords[l] = -1;
                    this.faceTextures[l] = -1;
                }
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[l] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[l] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[l] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n10 * -1516355947;
        buffer2.offset = n3 * -1516355947;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        for (int n23 = 0; n23 < unsignedShort2; ++n23) {
            final int ra11 = Buffer.ra(buffer2, (byte)7);
            if (ra11 == 1) {
                n19 = buffer.readShortSmart(1766463891) + n22;
                n20 = buffer.readShortSmart(1598357626) + n19;
                n21 = (n22 = buffer.readShortSmart(1521100773) + n20);
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 2) {
                n20 = n21;
                n21 = (n22 += buffer.readShortSmart(2035142440));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 3) {
                n19 = n21;
                n21 = (n22 += buffer.readShortSmart(1210479953));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 4) {
                final int n24 = n19;
                n19 = n20;
                n20 = n24;
                n21 = (n22 += buffer.readShortSmart(1837199448));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
        }
        buffer.offset = n14 * -1516355947;
        for (int n25 = 0; n25 < ra; ++n25) {
            this.textureRenderTypes[n25] = 0;
            this.texTriangleX[n25] = (short)buffer.readUnsignedShort(583872966);
            this.texTriangleY[n25] = (short)buffer.readUnsignedShort(-432944193);
            this.texTriangleZ[n25] = (short)buffer.readUnsignedShort(774967773);
        }
        if (this.textureCoords != null) {
            boolean b3 = false;
            for (int n26 = 0; n26 < unsignedShort2; ++n26) {
                final int n27 = this.textureCoords[n26] & 0xFF;
                if (n27 != 255) {
                    if ((this.texTriangleX[n27] & 0xFFFF) == this.verticesY[n26] && (this.texTriangleY[n27] & 0xFFFF) == this.verticesZ[n26] && (this.texTriangleZ[n27] & 0xFFFF) == this.vertexSkins[n26]) {
                        this.textureCoords[n26] = -1;
                    }
                    else {
                        b3 = true;
                    }
                }
            }
            if (!b3) {
                this.textureCoords = null;
            }
        }
        if (!b2) {
            this.faceTextures = null;
        }
        if (!b) {
            this.faceRenderTypes = null;
        }
    }
    
    static final int dh(final int n, int n2) {
        n2 = n2 * (n & 0x7F) >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    public ModelData bc() {
        final ModelData modelData = new ModelData();
        if (this.faceRenderTypes != null) {
            modelData.faceRenderTypes = new byte[this.faceCount];
            for (int i = 0; i < this.faceCount; ++i) {
                modelData.faceRenderTypes[i] = this.faceRenderTypes[i];
            }
        }
        modelData.verticesCount = this.verticesCount;
        modelData.faceCount = this.faceCount;
        modelData.textureTriangleCount = this.textureTriangleCount;
        modelData.indices2 = this.indices2;
        modelData.indices3 = this.indices3;
        modelData.indices1 = this.indices1;
        modelData.verticesY = this.verticesY;
        modelData.verticesZ = this.verticesZ;
        modelData.vertexSkins = this.vertexSkins;
        modelData.faceRenderPriorities = this.faceRenderPriorities;
        modelData.faceAlphas = this.faceAlphas;
        modelData.textureCoords = this.textureCoords;
        modelData.faceColors = this.faceColors;
        modelData.faceTextures = this.faceTextures;
        modelData.priority = this.priority;
        modelData.textureRenderTypes = this.textureRenderTypes;
        modelData.texTriangleX = this.texTriangleX;
        modelData.texTriangleY = this.texTriangleY;
        modelData.texTriangleZ = this.texTriangleZ;
        modelData.faceSkins = this.faceSkins;
        modelData.verticesX = this.verticesX;
        modelData.vertexLabels = this.vertexLabels;
        modelData.faceLabelsAlpha = this.faceLabelsAlpha;
        modelData.vertexNormals = this.vertexNormals;
        modelData.faceNormals = this.faceNormals;
        modelData.ambient = this.ambient;
        modelData.contrast = this.contrast;
        return modelData;
    }
    
    void br(final byte[] array) {
        boolean b = false;
        boolean b2 = false;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        buffer.offset = (array.length - 23) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-667046969);
        final int unsignedShort2 = buffer.readUnsignedShort(-80793991);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(104260321);
        final int unsignedShort4 = buffer.readUnsignedShort(-1904330870);
        buffer.readUnsignedShort(-259049036);
        final int unsignedShort5 = buffer.readUnsignedShort(709730654);
        final int unsignedShort6 = buffer.readUnsignedShort(-602239247);
        final int n4;
        final int n3;
        final int n2;
        int n = n2 = (n3 = (n4 = 0) + unsignedShort) + unsignedShort2;
        if (ra3 == 255) {
            n += unsignedShort2;
        }
        final int n5 = n;
        if (ra5 == 1) {
            n += unsignedShort2;
        }
        final int n6 = n;
        if (ra2 == 1) {
            n += unsignedShort2;
        }
        final int n7 = n;
        final int n9;
        int n8 = n9 = n + unsignedShort6;
        if (ra4 == 1) {
            n8 += unsignedShort2;
        }
        final int n10 = n8;
        final int n15;
        final int n14;
        final int n13;
        final int n12;
        final int n11 = (n12 = (n13 = (n14 = (n15 = n8 + unsignedShort5) + unsignedShort2 * 2) + ra * 6) + unsignedShort3) + unsignedShort4;
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        if (ra6 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
            this.textureCoords = new byte[unsignedShort2];
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        if (ra7 == 1) {
            this.field1899 = new int[unsignedShort][];
            this.field1924 = new int[unsignedShort][];
        }
        this.faceColors = new short[unsignedShort2];
        buffer.offset = n4 * -1516355947;
        buffer2.offset = n13 * -1516355947;
        buffer3.offset = n12 * -1516355947;
        buffer4.offset = n11 * -1516355947;
        buffer5.offset = n7 * -1516355947;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(2056520271);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1735217890);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1470238110);
            }
            this.indices2[i] = n16 + shortSmart;
            this.indices3[i] = n17 + shortSmart2;
            this.indices1[i] = n18 + shortSmart3;
            n16 = this.indices2[i];
            n17 = this.indices3[i];
            n18 = this.indices1[i];
            if (ra6 == 1) {
                this.faceSkins[i] = Buffer.ra(buffer5, (byte)7);
            }
        }
        if (ra7 == 1) {
            for (int j = 0; j < unsignedShort; ++j) {
                final int ra9 = Buffer.ra(buffer5, (byte)7);
                this.field1899[j] = new int[ra9];
                this.field1924[j] = new int[ra9];
                for (int k = 0; k < ra9; ++k) {
                    this.field1899[j][k] = Buffer.ra(buffer5, (byte)7);
                    this.field1924[j][k] = Buffer.ra(buffer5, (byte)7);
                }
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n2 * -1516355947;
        buffer4.offset = n9 * -1516355947;
        buffer5.offset = n5 * -1516355947;
        for (int l = 0; l < unsignedShort2; ++l) {
            this.faceColors[l] = (short)buffer.readUnsignedShort(-978439996);
            if (ra2 == 1) {
                final int ra10 = Buffer.ra(buffer2, (byte)7);
                if ((ra10 & 0x1) == 0x1) {
                    this.faceRenderTypes[l] = 1;
                    b = true;
                }
                else {
                    this.faceRenderTypes[l] = 0;
                }
                if ((ra10 & 0x2) == 0x2) {
                    this.textureCoords[l] = (byte)(ra10 >> 2);
                    this.faceTextures[l] = this.faceColors[l];
                    this.faceColors[l] = 127;
                    if (this.faceTextures[l] != -1) {
                        b2 = true;
                    }
                }
                else {
                    this.textureCoords[l] = -1;
                    this.faceTextures[l] = -1;
                }
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[l] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[l] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[l] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n10 * -1516355947;
        buffer2.offset = n3 * -1516355947;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        for (int n23 = 0; n23 < unsignedShort2; ++n23) {
            final int ra11 = Buffer.ra(buffer2, (byte)7);
            if (ra11 == 1) {
                n19 = buffer.readShortSmart(1170686617) + n22;
                n20 = buffer.readShortSmart(1205600844) + n19;
                n21 = (n22 = buffer.readShortSmart(1547249996) + n20);
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 2) {
                n20 = n21;
                n21 = (n22 += buffer.readShortSmart(1904745011));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 3) {
                n19 = n21;
                n21 = (n22 += buffer.readShortSmart(1989160451));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 4) {
                final int n24 = n19;
                n19 = n20;
                n20 = n24;
                n21 = (n22 += buffer.readShortSmart(1910980656));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
        }
        buffer.offset = n14 * -1516355947;
        for (int n25 = 0; n25 < ra; ++n25) {
            this.textureRenderTypes[n25] = 0;
            this.texTriangleX[n25] = (short)buffer.readUnsignedShort(-1538493556);
            this.texTriangleY[n25] = (short)buffer.readUnsignedShort(-1776332859);
            this.texTriangleZ[n25] = (short)buffer.readUnsignedShort(660697426);
        }
        if (this.textureCoords != null) {
            boolean b3 = false;
            for (int n26 = 0; n26 < unsignedShort2; ++n26) {
                final int n27 = this.textureCoords[n26] & 0xFF;
                if (n27 != 255) {
                    if ((this.texTriangleX[n27] & 0xFFFF) == this.verticesY[n26] && (this.texTriangleY[n27] & 0xFFFF) == this.verticesZ[n26] && (this.texTriangleZ[n27] & 0xFFFF) == this.vertexSkins[n26]) {
                        this.textureCoords[n26] = -1;
                    }
                    else {
                        b3 = true;
                    }
                }
            }
            if (!b3) {
                this.textureCoords = null;
            }
        }
        if (!b2) {
            this.faceTextures = null;
        }
        if (!b) {
            this.faceRenderTypes = null;
        }
    }
    
    void ci() {
        this.vertexNormals = null;
        this.vertexVertices = null;
        this.faceNormals = null;
        this.isBoundsCalculated = false;
    }
    
    void method1183(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        final Buffer buffer6 = new Buffer(array);
        final Buffer buffer7 = new Buffer(array);
        buffer.offset = (array.length - 26) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-919984643);
        final int unsignedShort2 = buffer.readUnsignedShort(585361335);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int ra8 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-259676);
        final int unsignedShort4 = buffer.readUnsignedShort(-537577706);
        final int unsignedShort5 = buffer.readUnsignedShort(-1719988220);
        final int unsignedShort6 = buffer.readUnsignedShort(-964841651);
        final int unsignedShort7 = buffer.readUnsignedShort(329559683);
        final int unsignedShort8 = buffer.readUnsignedShort(-7529975);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            buffer.offset = 0;
            for (int i = 0; i < ra; ++i) {
                final byte[] textureRenderTypes = this.textureRenderTypes;
                final int n4 = i;
                final byte wu = Buffer.wu(buffer, 435772489);
                textureRenderTypes[n4] = wu;
                final byte b = wu;
                if (b == 0) {
                    ++n;
                }
                if (b >= 1 && b <= 3) {
                    ++n2;
                }
                if (b == 2) {
                    ++n3;
                }
            }
        }
        final int n7;
        final int n6;
        int n5 = n6 = (n7 = ra) + unsignedShort;
        if (ra2 == 1) {
            n5 += unsignedShort2;
        }
        final int n8 = n5;
        final int n10;
        int n9 = n10 = n5 + unsignedShort2;
        if (ra3 == 255) {
            n9 += unsignedShort2;
        }
        final int n11 = n9;
        if (ra5 == 1) {
            n9 += unsignedShort2;
        }
        final int n12 = n9;
        final int n14;
        int n13 = n14 = n9 + unsignedShort8;
        if (ra4 == 1) {
            n13 += unsignedShort2;
        }
        final int n15 = n13;
        final int n17;
        int n16 = n17 = n13 + unsignedShort6;
        if (ra6 == 1) {
            n16 += unsignedShort2 * 2;
        }
        final int n18 = n16;
        final int n29;
        final int n28;
        final int n27;
        final int n26;
        final int n25;
        final int n24;
        final int n23;
        final int n22;
        final int n21;
        final int n20;
        final int n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = n16 + unsignedShort7) + unsignedShort2 * 2) + unsignedShort3) + unsignedShort4) + unsignedShort5) + n * 6) + n2 * 6) + n2 * 6) + n2 * 2) + n2) + (n2 * 2 + n3 * 2);
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra7 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        if (ra6 == 1) {
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra6 == 1 && ra > 0) {
            this.textureCoords = new byte[unsignedShort2];
        }
        if (ra8 == 1) {
            this.field1899 = new int[unsignedShort][];
            this.field1924 = new int[unsignedShort][];
        }
        this.faceColors = new short[unsignedShort2];
        if (ra > 0) {
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        buffer.offset = n7 * -1516355947;
        buffer2.offset = n28 * -1516355947;
        buffer3.offset = n27 * -1516355947;
        buffer4.offset = n26 * -1516355947;
        buffer5.offset = n12 * -1516355947;
        int n30 = 0;
        int n31 = 0;
        int n32 = 0;
        for (int j = 0; j < unsignedShort; ++j) {
            final int ra9 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra9 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1984773887);
            }
            int shortSmart2 = 0;
            if ((ra9 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1891417419);
            }
            int shortSmart3 = 0;
            if ((ra9 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1158704054);
            }
            this.indices2[j] = n30 + shortSmart;
            this.indices3[j] = n31 + shortSmart2;
            this.indices1[j] = n32 + shortSmart3;
            n30 = this.indices2[j];
            n31 = this.indices3[j];
            n32 = this.indices1[j];
            if (ra7 == 1) {
                this.faceSkins[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        if (ra8 == 1) {
            for (int k = 0; k < unsignedShort; ++k) {
                final int ra10 = Buffer.ra(buffer5, (byte)7);
                this.field1899[k] = new int[ra10];
                this.field1924[k] = new int[ra10];
                for (int l = 0; l < ra10; ++l) {
                    this.field1899[k][l] = Buffer.ra(buffer5, (byte)7);
                    this.field1924[k][l] = Buffer.ra(buffer5, (byte)7);
                }
            }
        }
        buffer.offset = n29 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n10 * -1516355947;
        buffer4.offset = n14 * -1516355947;
        buffer5.offset = n11 * -1516355947;
        buffer6.offset = n17 * -1516355947;
        buffer7.offset = n18 * -1516355947;
        for (int n33 = 0; n33 < unsignedShort2; ++n33) {
            this.faceColors[n33] = (short)buffer.readUnsignedShort(-1905684193);
            if (ra2 == 1) {
                this.faceRenderTypes[n33] = Buffer.wu(buffer2, 435772489);
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[n33] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[n33] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[n33] = Buffer.ra(buffer5, (byte)7);
            }
            if (ra6 == 1) {
                this.faceTextures[n33] = (short)(buffer6.readUnsignedShort(-1878345076) - 1);
            }
            if (this.textureCoords != null && this.faceTextures[n33] != -1) {
                this.textureCoords[n33] = (byte)(Buffer.ra(buffer7, (byte)7) - 1);
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n8 * -1516355947;
        int n34 = 0;
        int n35 = 0;
        int n36 = 0;
        int n37 = 0;
        for (int n38 = 0; n38 < unsignedShort2; ++n38) {
            final int ra11 = Buffer.ra(buffer2, (byte)7);
            if (ra11 == 1) {
                n34 = buffer.readShortSmart(1184502579) + n37;
                n35 = buffer.readShortSmart(1486728131) + n34;
                n36 = (n37 = buffer.readShortSmart(2106854967) + n35);
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
            if (ra11 == 2) {
                n35 = n36;
                n36 = (n37 += buffer.readShortSmart(1334906078));
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
            if (ra11 == 3) {
                n34 = n36;
                n36 = (n37 += buffer.readShortSmart(1302283287));
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
            if (ra11 == 4) {
                final int n39 = n34;
                n34 = n35;
                n35 = n39;
                n36 = (n37 += buffer.readShortSmart(1540794586));
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
        }
        buffer.offset = n25 * -1516355947;
        buffer2.offset = n24 * -1516355947;
        buffer3.offset = n23 * -1516355947;
        buffer4.offset = n22 * -1516355947;
        buffer5.offset = n21 * -1516355947;
        buffer6.offset = n20 * -1516355947;
        for (int n40 = 0; n40 < ra; ++n40) {
            if ((this.textureRenderTypes[n40] & 0xFF) == 0x0) {
                this.texTriangleX[n40] = (short)buffer.readUnsignedShort(-879847774);
                this.texTriangleY[n40] = (short)buffer.readUnsignedShort(-20147323);
                this.texTriangleZ[n40] = (short)buffer.readUnsignedShort(-1266812844);
            }
        }
        buffer.offset = n19 * -1516355947;
        if (Buffer.ra(buffer, (byte)7) != 0) {
            new ModelData0();
            buffer.readUnsignedShort(-1877779192);
            buffer.readUnsignedShort(-1352244344);
            buffer.readUnsignedShort(-1928849213);
            buffer.readInt(-985212241);
        }
    }
    
    public void changeOffset(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int[] indices2 = this.indices2;
            final int n4 = i;
            indices2[n4] += n;
            final int[] indices3 = this.indices3;
            final int n5 = i;
            indices3[n5] += n2;
            final int[] indices4 = this.indices1;
            final int n6 = i;
            indices4[n6] += n3;
        }
        this.ci();
    }
    
    public void cu() {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.indices1[i];
            this.indices1[i] = this.indices2[i];
            this.indices2[i] = -n;
        }
        this.ci();
    }
    
    public void dm(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices2[i] = this.indices2[i] * n / 128;
            this.indices3[i] = this.indices3[i] * n2 / 128;
            this.indices1[i] = this.indices1[i] * n3 / 128;
        }
        this.ci();
    }
    
    public static void nh(final ModelData modelData, final byte[] array) {
        if (modelData == null) {
            modelData.method1184(array);
            return;
        }
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        final Buffer buffer6 = new Buffer(array);
        final Buffer buffer7 = new Buffer(array);
        buffer.offset = (array.length - 23) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-1263250796);
        final int unsignedShort2 = buffer.readUnsignedShort(-2002030055);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(876883841);
        final int unsignedShort4 = buffer.readUnsignedShort(-435176740);
        final int unsignedShort5 = buffer.readUnsignedShort(-1431584774);
        final int unsignedShort6 = buffer.readUnsignedShort(-1021983654);
        final int unsignedShort7 = buffer.readUnsignedShort(-769856271);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (ra > 0) {
            modelData.textureRenderTypes = new byte[ra];
            buffer.offset = 0;
            for (int i = 0; i < ra; ++i) {
                final byte[] textureRenderTypes = modelData.textureRenderTypes;
                final int n4 = i;
                final byte wu = Buffer.wu(buffer, 435772489);
                textureRenderTypes[n4] = wu;
                final byte b = wu;
                if (b == 0) {
                    ++n;
                }
                if (b >= 1 && b <= 3) {
                    ++n2;
                }
                if (b == 2) {
                    ++n3;
                }
            }
        }
        final int n7;
        final int n6;
        int n5 = n6 = (n7 = ra) + unsignedShort;
        if (ra2 == 1) {
            n5 += unsignedShort2;
        }
        final int n8 = n5;
        final int n10;
        int n9 = n10 = n5 + unsignedShort2;
        if (ra3 == 255) {
            n9 += unsignedShort2;
        }
        final int n11 = n9;
        if (ra5 == 1) {
            n9 += unsignedShort2;
        }
        final int n12 = n9;
        if (ra7 == 1) {
            n9 += unsignedShort;
        }
        final int n13 = n9;
        if (ra4 == 1) {
            n9 += unsignedShort2;
        }
        final int n14 = n9;
        final int n16;
        int n15 = n16 = n9 + unsignedShort6;
        if (ra6 == 1) {
            n15 += unsignedShort2 * 2;
        }
        final int n17 = n15;
        final int n28;
        final int n27;
        final int n26;
        final int n25;
        final int n24;
        final int n23;
        final int n22;
        final int n21;
        final int n20;
        final int n19;
        final int n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = n15 + unsignedShort7) + unsignedShort2 * 2) + unsignedShort3) + unsignedShort4) + unsignedShort5) + n * 6) + n2 * 6) + n2 * 6) + n2 * 2) + n2) + (n2 * 2 + n3 * 2);
        modelData.verticesCount = unsignedShort;
        modelData.faceCount = unsignedShort2;
        modelData.textureTriangleCount = ra;
        modelData.indices2 = new int[unsignedShort];
        modelData.indices3 = new int[unsignedShort];
        modelData.indices1 = new int[unsignedShort];
        modelData.verticesY = new int[unsignedShort2];
        modelData.verticesZ = new int[unsignedShort2];
        modelData.vertexSkins = new int[unsignedShort2];
        if (ra7 == 1) {
            modelData.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            modelData.faceRenderTypes = new byte[unsignedShort2];
        }
        if (ra3 == 255) {
            modelData.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            modelData.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            modelData.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            modelData.verticesX = new int[unsignedShort2];
        }
        if (ra6 == 1) {
            modelData.faceTextures = new short[unsignedShort2];
        }
        if (ra6 == 1 && ra > 0) {
            modelData.textureCoords = new byte[unsignedShort2];
        }
        modelData.faceColors = new short[unsignedShort2];
        if (ra > 0) {
            modelData.texTriangleX = new short[ra];
            modelData.texTriangleY = new short[ra];
            modelData.texTriangleZ = new short[ra];
        }
        buffer.offset = n7 * -1516355947;
        buffer2.offset = n27 * -1516355947;
        buffer3.offset = n26 * -1516355947;
        buffer4.offset = n25 * -1516355947;
        buffer5.offset = n12 * -1516355947;
        int n29 = 0;
        int n30 = 0;
        int n31 = 0;
        for (int j = 0; j < unsignedShort; ++j) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1971231296);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1612360719);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1233827137);
            }
            modelData.indices2[j] = n29 + shortSmart;
            modelData.indices3[j] = n30 + shortSmart2;
            modelData.indices1[j] = n31 + shortSmart3;
            n29 = modelData.indices2[j];
            n30 = modelData.indices3[j];
            n31 = modelData.indices1[j];
            if (ra7 == 1) {
                modelData.faceSkins[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n28 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n10 * -1516355947;
        buffer4.offset = n13 * -1516355947;
        buffer5.offset = n11 * -1516355947;
        buffer6.offset = n16 * -1516355947;
        buffer7.offset = n17 * -1516355947;
        for (int k = 0; k < unsignedShort2; ++k) {
            modelData.faceColors[k] = (short)buffer.readUnsignedShort(818831461);
            if (ra2 == 1) {
                modelData.faceRenderTypes[k] = Buffer.wu(buffer2, 435772489);
            }
            if (ra3 == 255) {
                modelData.faceRenderPriorities[k] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                modelData.faceAlphas[k] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                modelData.verticesX[k] = Buffer.ra(buffer5, (byte)7);
            }
            if (ra6 == 1) {
                modelData.faceTextures[k] = (short)(buffer6.readUnsignedShort(-512750476) - 1);
            }
            if (modelData.textureCoords != null && modelData.faceTextures[k] != -1) {
                modelData.textureCoords[k] = (byte)(Buffer.ra(buffer7, (byte)7) - 1);
            }
        }
        buffer.offset = n14 * -1516355947;
        buffer2.offset = n8 * -1516355947;
        int n32 = 0;
        int n33 = 0;
        int n34 = 0;
        int n35 = 0;
        for (int l = 0; l < unsignedShort2; ++l) {
            final int ra9 = Buffer.ra(buffer2, (byte)7);
            if (ra9 == 1) {
                n32 = buffer.readShortSmart(2046431705) + n35;
                n33 = buffer.readShortSmart(2108210038) + n32;
                n34 = (n35 = buffer.readShortSmart(1902436320) + n33);
                modelData.verticesY[l] = n32;
                modelData.verticesZ[l] = n33;
                modelData.vertexSkins[l] = n34;
            }
            if (ra9 == 2) {
                n33 = n34;
                n34 = (n35 += buffer.readShortSmart(1971941001));
                modelData.verticesY[l] = n32;
                modelData.verticesZ[l] = n33;
                modelData.vertexSkins[l] = n34;
            }
            if (ra9 == 3) {
                n32 = n34;
                n34 = (n35 += buffer.readShortSmart(1721982940));
                modelData.verticesY[l] = n32;
                modelData.verticesZ[l] = n33;
                modelData.vertexSkins[l] = n34;
            }
            if (ra9 == 4) {
                final int n36 = n32;
                n32 = n33;
                n33 = n36;
                n34 = (n35 += buffer.readShortSmart(2094378484));
                modelData.verticesY[l] = n32;
                modelData.verticesZ[l] = n33;
                modelData.vertexSkins[l] = n34;
            }
        }
        buffer.offset = n24 * -1516355947;
        buffer2.offset = n23 * -1516355947;
        buffer3.offset = n22 * -1516355947;
        buffer4.offset = n21 * -1516355947;
        buffer5.offset = n20 * -1516355947;
        buffer6.offset = n19 * -1516355947;
        for (int n37 = 0; n37 < ra; ++n37) {
            if ((modelData.textureRenderTypes[n37] & 0xFF) == 0x0) {
                modelData.texTriangleX[n37] = (short)buffer.readUnsignedShort(561169310);
                modelData.texTriangleY[n37] = (short)buffer.readUnsignedShort(68763571);
                modelData.texTriangleZ[n37] = (short)buffer.readUnsignedShort(103185776);
            }
        }
        buffer.offset = n18 * -1516355947;
        if (Buffer.ra(buffer, (byte)7) != 0) {
            new ModelData0();
            buffer.readUnsignedShort(-1770689374);
            buffer.readUnsignedShort(-1095546204);
            buffer.readUnsignedShort(806373583);
            buffer.readInt(-1881895983);
        }
    }
    
    void method1203(final byte[] array) {
        boolean b = false;
        boolean b2 = false;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        buffer.offset = (array.length - 23) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-514877144);
        final int unsignedShort2 = buffer.readUnsignedShort(-1162706547);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-360966121);
        final int unsignedShort4 = buffer.readUnsignedShort(-1971720478);
        buffer.readUnsignedShort(682172629);
        final int unsignedShort5 = buffer.readUnsignedShort(375281554);
        final int unsignedShort6 = buffer.readUnsignedShort(32636529);
        final int n4;
        final int n3;
        final int n2;
        int n = n2 = (n3 = (n4 = 0) + unsignedShort) + unsignedShort2;
        if (ra3 == 255) {
            n += unsignedShort2;
        }
        final int n5 = n;
        if (ra5 == 1) {
            n += unsignedShort2;
        }
        final int n6 = n;
        if (ra2 == 1) {
            n += unsignedShort2;
        }
        final int n7 = n;
        final int n9;
        int n8 = n9 = n + unsignedShort6;
        if (ra4 == 1) {
            n8 += unsignedShort2;
        }
        final int n10 = n8;
        final int n15;
        final int n14;
        final int n13;
        final int n12;
        final int n11 = (n12 = (n13 = (n14 = (n15 = n8 + unsignedShort5) + unsignedShort2 * 2) + ra * 6) + unsignedShort3) + unsignedShort4;
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        if (ra6 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
            this.textureCoords = new byte[unsignedShort2];
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        if (ra7 == 1) {
            this.field1899 = new int[unsignedShort][];
            this.field1924 = new int[unsignedShort][];
        }
        this.faceColors = new short[unsignedShort2];
        buffer.offset = n4 * -1516355947;
        buffer2.offset = n13 * -1516355947;
        buffer3.offset = n12 * -1516355947;
        buffer4.offset = n11 * -1516355947;
        buffer5.offset = n7 * -1516355947;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1244062175);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1927617060);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1752135752);
            }
            this.indices2[i] = n16 + shortSmart;
            this.indices3[i] = n17 + shortSmart2;
            this.indices1[i] = n18 + shortSmart3;
            n16 = this.indices2[i];
            n17 = this.indices3[i];
            n18 = this.indices1[i];
            if (ra6 == 1) {
                this.faceSkins[i] = Buffer.ra(buffer5, (byte)7);
            }
        }
        if (ra7 == 1) {
            for (int j = 0; j < unsignedShort; ++j) {
                final int ra9 = Buffer.ra(buffer5, (byte)7);
                this.field1899[j] = new int[ra9];
                this.field1924[j] = new int[ra9];
                for (int k = 0; k < ra9; ++k) {
                    this.field1899[j][k] = Buffer.ra(buffer5, (byte)7);
                    this.field1924[j][k] = Buffer.ra(buffer5, (byte)7);
                }
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n2 * -1516355947;
        buffer4.offset = n9 * -1516355947;
        buffer5.offset = n5 * -1516355947;
        for (int l = 0; l < unsignedShort2; ++l) {
            this.faceColors[l] = (short)buffer.readUnsignedShort(489634053);
            if (ra2 == 1) {
                final int ra10 = Buffer.ra(buffer2, (byte)7);
                if ((ra10 & 0x1) == 0x1) {
                    this.faceRenderTypes[l] = 1;
                    b = true;
                }
                else {
                    this.faceRenderTypes[l] = 0;
                }
                if ((ra10 & 0x2) == 0x2) {
                    this.textureCoords[l] = (byte)(ra10 >> 2);
                    this.faceTextures[l] = this.faceColors[l];
                    this.faceColors[l] = 127;
                    if (this.faceTextures[l] != -1) {
                        b2 = true;
                    }
                }
                else {
                    this.textureCoords[l] = -1;
                    this.faceTextures[l] = -1;
                }
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[l] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[l] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[l] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n10 * -1516355947;
        buffer2.offset = n3 * -1516355947;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        for (int n23 = 0; n23 < unsignedShort2; ++n23) {
            final int ra11 = Buffer.ra(buffer2, (byte)7);
            if (ra11 == 1) {
                n19 = buffer.readShortSmart(1461015598) + n22;
                n20 = buffer.readShortSmart(1351847590) + n19;
                n21 = (n22 = buffer.readShortSmart(1925006621) + n20);
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 2) {
                n20 = n21;
                n21 = (n22 += buffer.readShortSmart(1154814202));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 3) {
                n19 = n21;
                n21 = (n22 += buffer.readShortSmart(1983296982));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 4) {
                final int n24 = n19;
                n19 = n20;
                n20 = n24;
                n21 = (n22 += buffer.readShortSmart(1979359343));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
        }
        buffer.offset = n14 * -1516355947;
        for (int n25 = 0; n25 < ra; ++n25) {
            this.textureRenderTypes[n25] = 0;
            this.texTriangleX[n25] = (short)buffer.readUnsignedShort(307324662);
            this.texTriangleY[n25] = (short)buffer.readUnsignedShort(-1329357815);
            this.texTriangleZ[n25] = (short)buffer.readUnsignedShort(753029702);
        }
        if (this.textureCoords != null) {
            boolean b3 = false;
            for (int n26 = 0; n26 < unsignedShort2; ++n26) {
                final int n27 = this.textureCoords[n26] & 0xFF;
                if (n27 != 255) {
                    if ((this.texTriangleX[n27] & 0xFFFF) == this.verticesY[n26] && (this.texTriangleY[n27] & 0xFFFF) == this.verticesZ[n26] && (this.texTriangleZ[n27] & 0xFFFF) == this.vertexSkins[n26]) {
                        this.textureCoords[n26] = -1;
                    }
                    else {
                        b3 = true;
                    }
                }
            }
            if (!b3) {
                this.textureCoords = null;
            }
        }
        if (!b2) {
            this.faceTextures = null;
        }
        if (!b) {
            this.faceRenderTypes = null;
        }
    }
    
    public ModelData qc() {
        final ModelData modelData = new ModelData();
        if (this.faceRenderTypes != null) {
            modelData.faceRenderTypes = new byte[this.faceCount];
            for (int i = 0; i < this.faceCount; ++i) {
                modelData.faceRenderTypes[i] = this.faceRenderTypes[i];
            }
        }
        modelData.verticesCount = this.verticesCount;
        modelData.faceCount = this.faceCount;
        modelData.textureTriangleCount = this.textureTriangleCount;
        modelData.indices2 = this.indices2;
        modelData.indices3 = this.indices3;
        modelData.indices1 = this.indices1;
        modelData.verticesY = this.verticesY;
        modelData.verticesZ = this.verticesZ;
        modelData.vertexSkins = this.vertexSkins;
        modelData.faceRenderPriorities = this.faceRenderPriorities;
        modelData.faceAlphas = this.faceAlphas;
        modelData.textureCoords = this.textureCoords;
        modelData.faceColors = this.faceColors;
        modelData.faceTextures = this.faceTextures;
        modelData.priority = this.priority;
        modelData.textureRenderTypes = this.textureRenderTypes;
        modelData.texTriangleX = this.texTriangleX;
        modelData.texTriangleY = this.texTriangleY;
        modelData.texTriangleZ = this.texTriangleZ;
        modelData.faceSkins = this.faceSkins;
        modelData.verticesX = this.verticesX;
        modelData.vertexLabels = this.vertexLabels;
        modelData.faceLabelsAlpha = this.faceLabelsAlpha;
        modelData.vertexNormals = this.vertexNormals;
        modelData.faceNormals = this.faceNormals;
        modelData.ambient = this.ambient;
        modelData.contrast = this.contrast;
        return modelData;
    }
    
    public short[] sq() {
        return this.texTriangleX;
    }
    
    public void cx(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int[] indices2 = this.indices2;
            final int n4 = i;
            indices2[n4] += n;
            final int[] indices3 = this.indices3;
            final int n5 = i;
            indices3[n5] += n2;
            final int[] indices4 = this.indices1;
            final int n6 = i;
            indices4[n6] += n3;
        }
        this.ci();
    }
    
    void bq(final byte[] array) {
        boolean b = false;
        int n = 0;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        buffer.offset = (array.length - 18) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-1523143906);
        final int unsignedShort2 = buffer.readUnsignedShort(-1833151557);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(454193740);
        final int unsignedShort4 = buffer.readUnsignedShort(-802530404);
        buffer.readUnsignedShort(-1349533948);
        final int unsignedShort5 = buffer.readUnsignedShort(220272305);
        final int n5;
        final int n4;
        final int n3;
        int n2 = n3 = (n4 = (n5 = 0) + unsignedShort) + unsignedShort2;
        if (ra3 == 255) {
            n2 += unsignedShort2;
        }
        final int n6 = n2;
        if (ra5 == 1) {
            n2 += unsignedShort2;
        }
        final int n7 = n2;
        if (ra2 == 1) {
            n2 += unsignedShort2;
        }
        final int n8 = n2;
        if (ra6 == 1) {
            n2 += unsignedShort;
        }
        final int n9 = n2;
        if (ra4 == 1) {
            n2 += unsignedShort2;
        }
        final int n10 = n2;
        final int n15;
        final int n14;
        final int n13;
        final int n12;
        final int n11 = (n12 = (n13 = (n14 = (n15 = n2 + unsignedShort5) + unsignedShort2 * 2) + ra * 6) + unsignedShort3) + unsignedShort4;
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        if (ra6 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
            this.textureCoords = new byte[unsignedShort2];
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        this.faceColors = new short[unsignedShort2];
        buffer.offset = n5 * -1516355947;
        buffer2.offset = n13 * -1516355947;
        buffer3.offset = n12 * -1516355947;
        buffer4.offset = n11 * -1516355947;
        buffer5.offset = n8 * -1516355947;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            final int ra7 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra7 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1585627127);
            }
            int shortSmart2 = 0;
            if ((ra7 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1573900898);
            }
            int shortSmart3 = 0;
            if ((ra7 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1201336539);
            }
            this.indices2[i] = n16 + shortSmart;
            this.indices3[i] = n17 + shortSmart2;
            this.indices1[i] = n18 + shortSmart3;
            n16 = this.indices2[i];
            n17 = this.indices3[i];
            n18 = this.indices1[i];
            if (ra6 == 1) {
                this.faceSkins[i] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n7 * -1516355947;
        buffer3.offset = n3 * -1516355947;
        buffer4.offset = n9 * -1516355947;
        buffer5.offset = n6 * -1516355947;
        for (int j = 0; j < unsignedShort2; ++j) {
            this.faceColors[j] = (short)buffer.readUnsignedShort(-1657772276);
            if (ra2 == 1) {
                final int ra8 = Buffer.ra(buffer2, (byte)7);
                if ((ra8 & 0x1) == 0x1) {
                    this.faceRenderTypes[j] = 1;
                    b = true;
                }
                else {
                    this.faceRenderTypes[j] = 0;
                }
                if ((ra8 & 0x2) == 0x2) {
                    this.textureCoords[j] = (byte)(ra8 >> 2);
                    this.faceTextures[j] = this.faceColors[j];
                    this.faceColors[j] = 127;
                    if (this.faceTextures[j] != -1) {
                        n = 1;
                    }
                }
                else {
                    this.textureCoords[j] = -1;
                    this.faceTextures[j] = -1;
                }
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[j] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[j] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n10 * -1516355947;
        buffer2.offset = n4 * -1516355947;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        for (int k = 0; k < unsignedShort2; ++k) {
            final int ra9 = Buffer.ra(buffer2, (byte)7);
            if (ra9 == 1) {
                n19 = buffer.readShortSmart(1640612276) + n22;
                n20 = buffer.readShortSmart(1847229057) + n19;
                n21 = (n22 = buffer.readShortSmart(1826890176) + n20);
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
            if (ra9 == 2) {
                n20 = n21;
                n21 = (n22 += buffer.readShortSmart(1868392443));
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
            if (ra9 == 3) {
                n19 = n21;
                n21 = (n22 += buffer.readShortSmart(1472099857));
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
            if (ra9 == 4) {
                final int n23 = n19;
                n19 = n20;
                n20 = n23;
                n21 = (n22 += buffer.readShortSmart(1364531179));
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
        }
        buffer.offset = n14 * -1516355947;
        for (int l = 0; l < ra; ++l) {
            this.textureRenderTypes[l] = 0;
            this.texTriangleX[l] = (short)buffer.readUnsignedShort(637494933);
            this.texTriangleY[l] = (short)buffer.readUnsignedShort(-905001244);
            this.texTriangleZ[l] = (short)buffer.readUnsignedShort(-939088024);
        }
        if (this.textureCoords != null) {
            boolean b2 = false;
            for (int n24 = 0; n24 < unsignedShort2; ++n24) {
                final int n25 = this.textureCoords[n24] & 0xFF;
                if (n25 != 255) {
                    if ((this.texTriangleX[n25] & 0xFFFF) == this.verticesY[n24] && (this.texTriangleY[n25] & 0xFFFF) == this.verticesZ[n24] && (this.texTriangleZ[n25] & 0xFFFF) == this.vertexSkins[n24]) {
                        this.textureCoords[n24] = -1;
                    }
                    else {
                        b2 = true;
                    }
                }
            }
            if (!b2) {
                this.textureCoords = null;
            }
        }
        if (n == 0) {
            this.faceTextures = null;
        }
        if (!b) {
            this.faceRenderTypes = null;
        }
    }
    
    public Model bq() {
        return this.yc(64, 768, -50, -10, -50);
    }
    
    void dk() {
        if (this.isBoundsCalculated) {
            return;
        }
        this.et = 0;
        this.field1931 = 0;
        this.field1932 = 999999;
        this.field1923 = -999999;
        this.field1934 = -99999;
        this.field1918 = 99999;
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.indices2[i];
            final int field1931 = this.indices3[i];
            final int n2 = this.indices1[i];
            if (n < this.field1932) {
                this.field1932 = n;
            }
            if (n > this.field1923) {
                this.field1923 = n;
            }
            if (n2 < this.field1918) {
                this.field1918 = n2;
            }
            if (n2 > this.field1934) {
                this.field1934 = n2;
            }
            if (-field1931 > this.et * 1550732737) {
                this.et = -field1931 * -644693439;
            }
            if (field1931 > this.field1931) {
                this.field1931 = field1931;
            }
        }
        this.isBoundsCalculated = true;
    }
    
    void do() {
        if (this.faceSkins != null) {
            final int[] array = new int[256];
            int n = 0;
            for (int i = 0; i < this.verticesCount; ++i) {
                final int n2 = this.faceSkins[i];
                final int[] array2 = array;
                final int n3 = n2;
                ++array2[n3];
                if (n2 > n) {
                    n = n2;
                }
            }
            this.vertexLabels = new int[n + 1][];
            for (int j = 0; j <= n; ++j) {
                this.vertexLabels[j] = new int[array[j]];
                array[j] = 0;
            }
            for (int k = 0; k < this.verticesCount; ++k) {
                final int n4 = this.faceSkins[k];
                this.vertexLabels[n4][array[n4]++] = k;
            }
            this.faceSkins = null;
        }
        if (this.verticesX != null) {
            final int[] array3 = new int[256];
            int n5 = 0;
            for (int l = 0; l < this.faceCount; ++l) {
                final int n6 = this.verticesX[l];
                final int[] array4 = array3;
                final int n7 = n6;
                ++array4[n7];
                if (n6 > n5) {
                    n5 = n6;
                }
            }
            this.faceLabelsAlpha = new int[n5 + 1][];
            for (int n8 = 0; n8 <= n5; ++n8) {
                this.faceLabelsAlpha[n8] = new int[array3[n8]];
                array3[n8] = 0;
            }
            for (int n9 = 0; n9 < this.faceCount; ++n9) {
                final int n10 = this.verticesX[n9];
                this.faceLabelsAlpha[n10][array3[n10]++] = n9;
            }
            this.verticesX = null;
        }
    }
    
    public final Model dz(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.calculateVertexNormals();
        final int n6 = n2 * (int)Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5) >> 8;
        final Model model = new Model();
        model.faceColors1 = new int[this.faceCount];
        model.faceColors2 = new int[this.faceCount];
        model.faceColors3 = new int[this.faceCount];
        if (this.textureTriangleCount > 0 && this.textureCoords != null) {
            final int[] array = new int[this.textureTriangleCount];
            for (int i = 0; i < this.faceCount; ++i) {
                if (this.textureCoords[i] != -1) {
                    final int[] array2 = array;
                    final int n7 = this.textureCoords[i] & 0xFF;
                    ++array2[n7];
                }
            }
            model.field2153 = 0;
            for (int j = 0; j < this.textureTriangleCount; ++j) {
                if (array[j] > 0 && this.textureRenderTypes[j] == 0) {
                    final Model model2 = model;
                    ++model2.field2153;
                }
            }
            model.field2199 = new int[model.field2153];
            model.field2155 = new int[model.field2153];
            model.field2187 = new int[model.field2153];
            int n8 = 0;
            for (int k = 0; k < this.textureTriangleCount; ++k) {
                if (array[k] > 0 && this.textureRenderTypes[k] == 0) {
                    model.field2199[n8] = (this.texTriangleX[k] & 0x4CAB753F);
                    model.field2155[n8] = (this.texTriangleY[k] & 0xB21DACAE);
                    model.field2187[n8] = (this.texTriangleZ[k] & 0xFFFF);
                    array[k] = n8++;
                }
                else {
                    array[k] = -1;
                }
            }
            model.faceRenderPriorities = new byte[this.faceCount];
            for (int l = 0; l < this.faceCount; ++l) {
                if (this.textureCoords[l] != -1) {
                    model.faceRenderPriorities[l] = (byte)array[this.textureCoords[l] & 0xFF];
                }
                else {
                    model.faceRenderPriorities[l] = -1;
                }
            }
        }
        for (int n9 = 0; n9 < this.faceCount; ++n9) {
            int n10;
            if (this.faceRenderTypes == null) {
                n10 = 0;
            }
            else {
                n10 = this.faceRenderTypes[n9];
            }
            byte b;
            if (this.faceAlphas == null) {
                b = 0;
            }
            else {
                b = this.faceAlphas[n9];
            }
            int n11;
            if (this.faceTextures == null) {
                n11 = -1;
            }
            else {
                n11 = this.faceTextures[n9];
            }
            if (b == -743747204) {
                n10 = 3;
            }
            if (b == -1) {
                n10 = 2;
            }
            if (n11 == -1) {
                if (n10 == 0) {
                    final int n12 = this.faceColors[n9] & 0xFD8B87D6;
                    VertexNormal vertexNormal;
                    if (this.vertexVertices != null && this.vertexVertices[this.verticesY[n9]] != null) {
                        vertexNormal = this.vertexVertices[this.verticesY[n9]];
                    }
                    else {
                        vertexNormal = this.vertexNormals[this.verticesY[n9]];
                    }
                    model.faceColors1[n9] = method1186(n12, n + (n3 * (vertexNormal.z * -1941999827) + n4 * (vertexNormal.x * 124229261) + n5 * (vertexNormal.magnitude * 1215517409)) / (n6 * (vertexNormal.y * 1333234373)));
                    VertexNormal vertexNormal2;
                    if (this.vertexVertices != null && this.vertexVertices[this.verticesZ[n9]] != null) {
                        vertexNormal2 = this.vertexVertices[this.verticesZ[n9]];
                    }
                    else {
                        vertexNormal2 = this.vertexNormals[this.verticesZ[n9]];
                    }
                    model.faceColors2[n9] = method1186(n12, n + (n3 * (vertexNormal2.z * 2119647653) + n4 * (vertexNormal2.x * 124229261) + n5 * (vertexNormal2.magnitude * 2108671835)) / (n6 * (vertexNormal2.y * -1837445001)));
                    VertexNormal vertexNormal3;
                    if (this.vertexVertices != null && this.vertexVertices[this.vertexSkins[n9]] != null) {
                        vertexNormal3 = this.vertexVertices[this.vertexSkins[n9]];
                    }
                    else {
                        vertexNormal3 = this.vertexNormals[this.vertexSkins[n9]];
                    }
                    model.faceColors3[n9] = method1186(n12, n + (n3 * (vertexNormal3.z * -254709211) + n4 * (vertexNormal3.x * 124229261) + n5 * (vertexNormal3.magnitude * 431017970)) / (n6 * (vertexNormal3.y * 170537058)));
                }
                else if (n10 == 1) {
                    final FaceNormal faceNormal = this.faceNormals[n9];
                    model.faceColors1[n9] = method1186(this.faceColors[n9] & 0xFFFF, n + (n3 * (faceNormal.x * -18074541) + n4 * (faceNormal.y * 510023215) + n5 * (faceNormal.z * -446870673)) / (n6 + n6 / 2));
                    model.faceColors3[n9] = -1;
                }
                else if (n10 == 3) {
                    model.faceColors1[n9] = 128;
                    model.faceColors3[n9] = -1;
                }
                else {
                    model.faceColors3[n9] = -1647769187;
                }
            }
            else if (n10 == 0) {
                VertexNormal vertexNormal4;
                if (this.vertexVertices != null && this.vertexVertices[this.verticesY[n9]] != null) {
                    vertexNormal4 = this.vertexVertices[this.verticesY[n9]];
                }
                else {
                    vertexNormal4 = this.vertexNormals[this.verticesY[n9]];
                }
                model.faceColors1[n9] = method1200(n + (n3 * (vertexNormal4.z * -1941999827) + n4 * (vertexNormal4.x * 124229261) + n5 * (vertexNormal4.magnitude * -1032287220)) / (n6 * (vertexNormal4.y * -1837445001)));
                VertexNormal vertexNormal5;
                if (this.vertexVertices != null && this.vertexVertices[this.verticesZ[n9]] != null) {
                    vertexNormal5 = this.vertexVertices[this.verticesZ[n9]];
                }
                else {
                    vertexNormal5 = this.vertexNormals[this.verticesZ[n9]];
                }
                model.faceColors2[n9] = method1200(n + (n3 * (vertexNormal5.z * 1359817843) + n4 * (vertexNormal5.x * 124229261) + n5 * (vertexNormal5.magnitude * 2108671835)) / (n6 * (vertexNormal5.y * -1837445001)));
                VertexNormal vertexNormal6;
                if (this.vertexVertices != null && this.vertexVertices[this.vertexSkins[n9]] != null) {
                    vertexNormal6 = this.vertexVertices[this.vertexSkins[n9]];
                }
                else {
                    vertexNormal6 = this.vertexNormals[this.vertexSkins[n9]];
                }
                model.faceColors3[n9] = method1200(n + (n3 * (vertexNormal6.z * -1941999827) + n4 * (vertexNormal6.x * 2041303530) + n5 * (vertexNormal6.magnitude * -202076184)) / (n6 * (vertexNormal6.y * -1837445001)));
            }
            else if (n10 == 1) {
                final FaceNormal faceNormal2 = this.faceNormals[n9];
                model.faceColors1[n9] = method1200(n + (n3 * (faceNormal2.x * -18074541) + n4 * (faceNormal2.y * 1542458359) + n5 * (faceNormal2.z * -312873938)) / (n6 + n6 / 2));
                model.faceColors3[n9] = -1;
            }
            else {
                model.faceColors3[n9] = 1931752367;
            }
        }
        this.di();
        model.verticesCount = this.verticesCount;
        model.verticesX = this.indices2;
        model.verticesY = this.indices3;
        model.verticesZ = this.indices1;
        model.indicesCount = this.faceCount;
        model.indices1 = this.verticesY;
        model.indices2 = this.verticesZ;
        model.indices3 = this.vertexSkins;
        model.faceAlphas = this.faceRenderPriorities;
        model.field2154 = this.faceAlphas;
        model.field2152 = this.priority;
        model.vertexLabels = this.vertexLabels;
        model.faceLabelsAlpha = this.faceLabelsAlpha;
        model.faceTextures = this.faceTextures;
        model.field2156 = this.field1899;
        model.field2160 = this.field1924;
        return model;
    }
    
    public static void jw(final ModelData modelData, final short n, final short n2) {
        if (modelData == null) {
            modelData.retexture(n, n);
            return;
        }
        if (modelData.faceTextures == null) {
            return;
        }
        for (int i = 0; i < modelData.faceCount; ++i) {
            if (modelData.faceTextures[i] == n) {
                modelData.faceTextures[i] = n2;
            }
        }
    }
    
    static final int de(final int n, int n2) {
        n2 = n2 * (n & 0x9B698295) >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 974969325;
        }
        return (n & 0x71B7DE5A) + n2;
    }
    
    public static void de(final ModelData modelData) {
        if (modelData == null) {
            modelData.copyModelData();
        }
        modelData.vertexNormals = null;
        modelData.vertexVertices = null;
        modelData.faceNormals = null;
        modelData.isBoundsCalculated = false;
    }
    
    public short[] sv() {
        return this.texTriangleZ;
    }
    
    void method1185(final byte[] array) {
        boolean b = false;
        int n = 0;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        buffer.offset = (array.length - 18) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(549285250);
        final int unsignedShort2 = buffer.readUnsignedShort(-215634139);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(769348209);
        final int unsignedShort4 = buffer.readUnsignedShort(57348879);
        buffer.readUnsignedShort(-353334539);
        final int unsignedShort5 = buffer.readUnsignedShort(240591042);
        final int n5;
        final int n4;
        final int n3;
        int n2 = n3 = (n4 = (n5 = 0) + unsignedShort) + unsignedShort2;
        if (ra3 == 255) {
            n2 += unsignedShort2;
        }
        final int n6 = n2;
        if (ra5 == 1) {
            n2 += unsignedShort2;
        }
        final int n7 = n2;
        if (ra2 == 1) {
            n2 += unsignedShort2;
        }
        final int n8 = n2;
        if (ra6 == 1) {
            n2 += unsignedShort;
        }
        final int n9 = n2;
        if (ra4 == 1) {
            n2 += unsignedShort2;
        }
        final int n10 = n2;
        final int n15;
        final int n14;
        final int n13;
        final int n12;
        final int n11 = (n12 = (n13 = (n14 = (n15 = n2 + unsignedShort5) + unsignedShort2 * 2) + ra * 6) + unsignedShort3) + unsignedShort4;
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        if (ra6 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
            this.textureCoords = new byte[unsignedShort2];
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        this.faceColors = new short[unsignedShort2];
        buffer.offset = n5 * -1516355947;
        buffer2.offset = n13 * -1516355947;
        buffer3.offset = n12 * -1516355947;
        buffer4.offset = n11 * -1516355947;
        buffer5.offset = n8 * -1516355947;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            final int ra7 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra7 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1752919491);
            }
            int shortSmart2 = 0;
            if ((ra7 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1676914976);
            }
            int shortSmart3 = 0;
            if ((ra7 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1171264904);
            }
            this.indices2[i] = n16 + shortSmart;
            this.indices3[i] = n17 + shortSmart2;
            this.indices1[i] = n18 + shortSmart3;
            n16 = this.indices2[i];
            n17 = this.indices3[i];
            n18 = this.indices1[i];
            if (ra6 == 1) {
                this.faceSkins[i] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n7 * -1516355947;
        buffer3.offset = n3 * -1516355947;
        buffer4.offset = n9 * -1516355947;
        buffer5.offset = n6 * -1516355947;
        for (int j = 0; j < unsignedShort2; ++j) {
            this.faceColors[j] = (short)buffer.readUnsignedShort(655994587);
            if (ra2 == 1) {
                final int ra8 = Buffer.ra(buffer2, (byte)7);
                if ((ra8 & 0x1) == 0x1) {
                    this.faceRenderTypes[j] = 1;
                    b = true;
                }
                else {
                    this.faceRenderTypes[j] = 0;
                }
                if ((ra8 & 0x2) == 0x2) {
                    this.textureCoords[j] = (byte)(ra8 >> 2);
                    this.faceTextures[j] = this.faceColors[j];
                    this.faceColors[j] = 127;
                    if (this.faceTextures[j] != -1) {
                        n = 1;
                    }
                }
                else {
                    this.textureCoords[j] = -1;
                    this.faceTextures[j] = -1;
                }
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[j] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[j] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n10 * -1516355947;
        buffer2.offset = n4 * -1516355947;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        for (int k = 0; k < unsignedShort2; ++k) {
            final int ra9 = Buffer.ra(buffer2, (byte)7);
            if (ra9 == 1) {
                n19 = buffer.readShortSmart(1101044284) + n22;
                n20 = buffer.readShortSmart(1516522278) + n19;
                n21 = (n22 = buffer.readShortSmart(1940828348) + n20);
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
            if (ra9 == 2) {
                n20 = n21;
                n21 = (n22 += buffer.readShortSmart(2113208017));
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
            if (ra9 == 3) {
                n19 = n21;
                n21 = (n22 += buffer.readShortSmart(1462829470));
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
            if (ra9 == 4) {
                final int n23 = n19;
                n19 = n20;
                n20 = n23;
                n21 = (n22 += buffer.readShortSmart(1413087679));
                this.verticesY[k] = n19;
                this.verticesZ[k] = n20;
                this.vertexSkins[k] = n21;
            }
        }
        buffer.offset = n14 * -1516355947;
        for (int l = 0; l < ra; ++l) {
            this.textureRenderTypes[l] = 0;
            this.texTriangleX[l] = (short)buffer.readUnsignedShort(-999882445);
            this.texTriangleY[l] = (short)buffer.readUnsignedShort(787038244);
            this.texTriangleZ[l] = (short)buffer.readUnsignedShort(704136559);
        }
        if (this.textureCoords != null) {
            boolean b2 = false;
            for (int n24 = 0; n24 < unsignedShort2; ++n24) {
                final int n25 = this.textureCoords[n24] & 0xFF;
                if (n25 != 255) {
                    if ((this.texTriangleX[n25] & 0xFFFF) == this.verticesY[n24] && (this.texTriangleY[n25] & 0xFFFF) == this.verticesZ[n24] && (this.texTriangleZ[n25] & 0xFFFF) == this.vertexSkins[n24]) {
                        this.textureCoords[n24] = -1;
                    }
                    else {
                        b2 = true;
                    }
                }
            }
            if (!b2) {
                this.textureCoords = null;
            }
        }
        if (n == 0) {
            this.faceTextures = null;
        }
        if (!b) {
            this.faceRenderTypes = null;
        }
    }
    
    public static void gv(final ModelData modelData, final byte[] array) {
        if (modelData == null) {
            modelData.xr();
        }
        boolean b = false;
        boolean b2 = false;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        buffer.offset = (array.length - 23) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(30229587);
        final int unsignedShort2 = buffer.readUnsignedShort(-1567390877);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-1975459940);
        final int unsignedShort4 = buffer.readUnsignedShort(-310647337);
        buffer.readUnsignedShort(-2071947118);
        final int unsignedShort5 = buffer.readUnsignedShort(627955691);
        final int unsignedShort6 = buffer.readUnsignedShort(824867692);
        final int n4;
        final int n3;
        final int n2;
        int n = n2 = (n3 = (n4 = 0) + unsignedShort) + unsignedShort2;
        if (ra3 == 255) {
            n += unsignedShort2;
        }
        final int n5 = n;
        if (ra5 == 1) {
            n += unsignedShort2;
        }
        final int n6 = n;
        if (ra2 == 1) {
            n += unsignedShort2;
        }
        final int n7 = n;
        final int n9;
        int n8 = n9 = n + unsignedShort6;
        if (ra4 == 1) {
            n8 += unsignedShort2;
        }
        final int n10 = n8;
        final int n15;
        final int n14;
        final int n13;
        final int n12;
        final int n11 = (n12 = (n13 = (n14 = (n15 = n8 + unsignedShort5) + unsignedShort2 * 2) + ra * 6) + unsignedShort3) + unsignedShort4;
        modelData.verticesCount = unsignedShort;
        modelData.faceCount = unsignedShort2;
        modelData.textureTriangleCount = ra;
        modelData.indices2 = new int[unsignedShort];
        modelData.indices3 = new int[unsignedShort];
        modelData.indices1 = new int[unsignedShort];
        modelData.verticesY = new int[unsignedShort2];
        modelData.verticesZ = new int[unsignedShort2];
        modelData.vertexSkins = new int[unsignedShort2];
        if (ra > 0) {
            modelData.textureRenderTypes = new byte[ra];
            modelData.texTriangleX = new short[ra];
            modelData.texTriangleY = new short[ra];
            modelData.texTriangleZ = new short[ra];
        }
        if (ra6 == 1) {
            modelData.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            modelData.faceRenderTypes = new byte[unsignedShort2];
            modelData.textureCoords = new byte[unsignedShort2];
            modelData.faceTextures = new short[unsignedShort2];
        }
        if (ra3 == 255) {
            modelData.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            modelData.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            modelData.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            modelData.verticesX = new int[unsignedShort2];
        }
        if (ra7 == 1) {
            modelData.field1899 = new int[unsignedShort][];
            modelData.field1924 = new int[unsignedShort][];
        }
        modelData.faceColors = new short[unsignedShort2];
        buffer.offset = n4 * -1516355947;
        buffer2.offset = n13 * -1516355947;
        buffer3.offset = n12 * -1516355947;
        buffer4.offset = n11 * -1516355947;
        buffer5.offset = n7 * -1516355947;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1715586743);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1793760723);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1930607593);
            }
            modelData.indices2[i] = n16 + shortSmart;
            modelData.indices3[i] = n17 + shortSmart2;
            modelData.indices1[i] = n18 + shortSmart3;
            n16 = modelData.indices2[i];
            n17 = modelData.indices3[i];
            n18 = modelData.indices1[i];
            if (ra6 == 1) {
                modelData.faceSkins[i] = Buffer.ra(buffer5, (byte)7);
            }
        }
        if (ra7 == 1) {
            for (int j = 0; j < unsignedShort; ++j) {
                final int ra9 = Buffer.ra(buffer5, (byte)7);
                modelData.field1899[j] = new int[ra9];
                modelData.field1924[j] = new int[ra9];
                for (int k = 0; k < ra9; ++k) {
                    modelData.field1899[j][k] = Buffer.ra(buffer5, (byte)7);
                    modelData.field1924[j][k] = Buffer.ra(buffer5, (byte)7);
                }
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n2 * -1516355947;
        buffer4.offset = n9 * -1516355947;
        buffer5.offset = n5 * -1516355947;
        for (int l = 0; l < unsignedShort2; ++l) {
            modelData.faceColors[l] = (short)buffer.readUnsignedShort(-515519569);
            if (ra2 == 1) {
                final int ra10 = Buffer.ra(buffer2, (byte)7);
                if ((ra10 & 0x1) == 0x1) {
                    modelData.faceRenderTypes[l] = 1;
                    b = true;
                }
                else {
                    modelData.faceRenderTypes[l] = 0;
                }
                if ((ra10 & 0x2) == 0x2) {
                    modelData.textureCoords[l] = (byte)(ra10 >> 2);
                    modelData.faceTextures[l] = modelData.faceColors[l];
                    modelData.faceColors[l] = 127;
                    if (modelData.faceTextures[l] != -1) {
                        b2 = true;
                    }
                }
                else {
                    modelData.textureCoords[l] = -1;
                    modelData.faceTextures[l] = -1;
                }
            }
            if (ra3 == 255) {
                modelData.faceRenderPriorities[l] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                modelData.faceAlphas[l] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                modelData.verticesX[l] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n10 * -1516355947;
        buffer2.offset = n3 * -1516355947;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        for (int n23 = 0; n23 < unsignedShort2; ++n23) {
            final int ra11 = Buffer.ra(buffer2, (byte)7);
            if (ra11 == 1) {
                n19 = buffer.readShortSmart(1769268447) + n22;
                n20 = buffer.readShortSmart(2071578162) + n19;
                n21 = (n22 = buffer.readShortSmart(1334613268) + n20);
                modelData.verticesY[n23] = n19;
                modelData.verticesZ[n23] = n20;
                modelData.vertexSkins[n23] = n21;
            }
            if (ra11 == 2) {
                n20 = n21;
                n21 = (n22 += buffer.readShortSmart(1925359791));
                modelData.verticesY[n23] = n19;
                modelData.verticesZ[n23] = n20;
                modelData.vertexSkins[n23] = n21;
            }
            if (ra11 == 3) {
                n19 = n21;
                n21 = (n22 += buffer.readShortSmart(2035184688));
                modelData.verticesY[n23] = n19;
                modelData.verticesZ[n23] = n20;
                modelData.vertexSkins[n23] = n21;
            }
            if (ra11 == 4) {
                final int n24 = n19;
                n19 = n20;
                n20 = n24;
                n21 = (n22 += buffer.readShortSmart(1475449035));
                modelData.verticesY[n23] = n19;
                modelData.verticesZ[n23] = n20;
                modelData.vertexSkins[n23] = n21;
            }
        }
        buffer.offset = n14 * -1516355947;
        for (int n25 = 0; n25 < ra; ++n25) {
            modelData.textureRenderTypes[n25] = 0;
            modelData.texTriangleX[n25] = (short)buffer.readUnsignedShort(-142943120);
            modelData.texTriangleY[n25] = (short)buffer.readUnsignedShort(3751707);
            modelData.texTriangleZ[n25] = (short)buffer.readUnsignedShort(-1794668263);
        }
        if (modelData.textureCoords != null) {
            int n26 = 0;
            for (int n27 = 0; n27 < unsignedShort2; ++n27) {
                final int n28 = modelData.textureCoords[n27] & 0xFF;
                if (n28 != 255) {
                    if ((modelData.texTriangleX[n28] & 0xFFFF) == modelData.verticesY[n27] && (modelData.texTriangleY[n28] & 0xFFFF) == modelData.verticesZ[n27] && (modelData.texTriangleZ[n28] & 0xFFFF) == modelData.vertexSkins[n27]) {
                        modelData.textureCoords[n27] = -1;
                    }
                    else {
                        n26 = 1;
                    }
                }
            }
            if (n26 == 0) {
                modelData.textureCoords = null;
            }
        }
        if (!b2) {
            modelData.faceTextures = null;
        }
        if (!b) {
            modelData.faceRenderTypes = null;
        }
    }
    
    void method1193() {
        this.vertexNormals = null;
        this.vertexVertices = null;
        this.faceNormals = null;
        this.isBoundsCalculated = false;
    }
    
    public static void lm(final ModelData modelData, final short n, final short n2) {
        if (modelData == null) {
            modelData.recolor(n, n);
        }
        for (int i = 0; i < modelData.faceCount; ++i) {
            if (modelData.faceColors[i] == n) {
                modelData.faceColors[i] = n2;
            }
        }
    }
    
    public ModelData bh(final int[][] array, final int n, final int n2, final int n3, final boolean b, final int n4) {
        this.dk();
        final int n5 = n + this.field1932;
        final int n6 = n + this.field1923;
        final int n7 = n3 + this.field1918;
        final int n8 = n3 + this.field1934;
        if (n5 < 0 || n6 + 128 >> 7 >= array.length || n7 < 0 || n8 + 128 >> 7 >= array[0].length) {
            return this;
        }
        final int n9 = n5 >> 7;
        final int n10 = n6 - 1227007250 >> 7;
        final int n11 = n7 >> 7;
        final int n12 = n8 + 127 >> 7;
        if (array[n9][n11] == n2 && array[n10][n11] == n2 && array[n9][n12] == n2 && array[n10][n12] == n2) {
            return this;
        }
        ModelData modelData;
        if (b) {
            modelData = new ModelData();
            modelData.verticesCount = this.verticesCount;
            modelData.faceCount = this.faceCount;
            modelData.textureTriangleCount = this.textureTriangleCount;
            modelData.indices2 = this.indices2;
            modelData.indices1 = this.indices1;
            modelData.verticesY = this.verticesY;
            modelData.verticesZ = this.verticesZ;
            modelData.vertexSkins = this.vertexSkins;
            modelData.faceRenderTypes = this.faceRenderTypes;
            modelData.faceRenderPriorities = this.faceRenderPriorities;
            modelData.faceAlphas = this.faceAlphas;
            modelData.textureCoords = this.textureCoords;
            modelData.faceColors = this.faceColors;
            modelData.faceTextures = this.faceTextures;
            modelData.priority = this.priority;
            modelData.textureRenderTypes = this.textureRenderTypes;
            modelData.texTriangleX = this.texTriangleX;
            modelData.texTriangleY = this.texTriangleY;
            modelData.texTriangleZ = this.texTriangleZ;
            modelData.faceSkins = this.faceSkins;
            modelData.verticesX = this.verticesX;
            modelData.vertexLabels = this.vertexLabels;
            modelData.faceLabelsAlpha = this.faceLabelsAlpha;
            modelData.ambient = this.ambient;
            modelData.contrast = this.contrast;
            modelData.indices3 = new int[modelData.verticesCount];
        }
        else {
            modelData = this;
        }
        if (n4 == 0) {
            for (int i = 0; i < modelData.verticesCount; ++i) {
                final int n13 = this.indices2[i] + n;
                final int n14 = this.indices1[i] + n3;
                final int n15 = n13 & 0xF752A038;
                final int n16 = n14 & 0x24C1B95B;
                final int n17 = n13 >> 7;
                final int n18 = n14 >> 7;
                modelData.indices3[i] = this.indices3[i] + ((array[n17][n18] * (128 - n15) + array[n17 + 1][n18] * n15 >> 7) * (-1867314573 - n16) + (array[n17][n18 + 1] * (-407361740 - n15) + array[n17 + 1][n18 + 1] * n15 >> 7) * n16 >> 7) - n2;
            }
        }
        else {
            for (int j = 0; j < modelData.verticesCount; ++j) {
                final int n19 = (-this.indices3[j] << 16) / (this.et * 1550732737);
                if (n19 < n4) {
                    final int n20 = this.indices2[j] + n;
                    final int n21 = this.indices1[j] + n3;
                    final int n22 = n20 & 0x7F;
                    final int n23 = n21 & 0x7F;
                    final int n24 = n20 >> 7;
                    final int n25 = n21 >> 7;
                    modelData.indices3[j] = this.indices3[j] + (((array[n24][n25] * (45163965 - n22) + array[n24 + 1][n25] * n22 >> 7) * (1350985583 - n23) + (array[n24][n25 + 1] * (1478222767 - n22) + array[n24 + 1][n25 + 1] * n22 >> 7) * n23 >> 7) - n2) * (n4 - n19) / n4;
                }
            }
        }
        modelData.ci();
        return modelData;
    }
    
    static void method1198(final ModelData modelData, final ModelData modelData2, final int n, final int n2, final int n3, final boolean b) {
        modelData.dk();
        modelData.calculateVertexNormals();
        modelData2.dk();
        modelData2.calculateVertexNormals();
        ++ModelData.field1937;
        int n4 = 0;
        final int[] indices2 = modelData2.indices2;
        final int verticesCount = modelData2.verticesCount;
        for (int i = 0; i < modelData.verticesCount; ++i) {
            final VertexNormal vertexNormal = modelData.vertexNormals[i];
            if (vertexNormal.y * -1837445001 != 0) {
                final int n5 = modelData.indices3[i] - n2;
                if (n5 <= modelData2.field1931) {
                    final int n6 = modelData.indices2[i] - n;
                    if (n6 >= modelData2.field1932) {
                        if (n6 <= modelData2.field1923) {
                            final int n7 = modelData.indices1[i] - n3;
                            if (n7 >= modelData2.field1918) {
                                if (n7 <= modelData2.field1934) {
                                    for (int j = 0; j < verticesCount; ++j) {
                                        final VertexNormal vertexNormal2 = modelData2.vertexNormals[j];
                                        if (n6 == indices2[j] && n7 == modelData2.indices1[j] && n5 == modelData2.indices3[j] && vertexNormal2.y * -1837445001 != 0) {
                                            if (modelData.vertexVertices == null) {
                                                modelData.vertexVertices = new VertexNormal[modelData.verticesCount];
                                            }
                                            if (modelData2.vertexVertices == null) {
                                                modelData2.vertexVertices = new VertexNormal[verticesCount];
                                            }
                                            VertexNormal vertexNormal3 = modelData.vertexVertices[i];
                                            if (vertexNormal3 == null) {
                                                final VertexNormal[] vertexVertices = modelData.vertexVertices;
                                                final int n8 = i;
                                                final VertexNormal vertexNormal4 = new VertexNormal(vertexNormal);
                                                vertexVertices[n8] = vertexNormal4;
                                                vertexNormal3 = vertexNormal4;
                                            }
                                            VertexNormal vertexNormal5 = modelData2.vertexVertices[j];
                                            if (vertexNormal5 == null) {
                                                final VertexNormal[] vertexVertices2 = modelData2.vertexVertices;
                                                final int n9 = j;
                                                final VertexNormal vertexNormal6 = new VertexNormal(vertexNormal2);
                                                vertexVertices2[n9] = vertexNormal6;
                                                vertexNormal5 = vertexNormal6;
                                            }
                                            final VertexNormal vertexNormal7 = vertexNormal3;
                                            vertexNormal7.z += vertexNormal2.z * 1;
                                            final VertexNormal vertexNormal8 = vertexNormal3;
                                            vertexNormal8.x += vertexNormal2.x * 1;
                                            final VertexNormal vertexNormal9 = vertexNormal3;
                                            vertexNormal9.magnitude += vertexNormal2.magnitude * 1;
                                            final VertexNormal vertexNormal10 = vertexNormal3;
                                            vertexNormal10.y += vertexNormal2.y * 1;
                                            final VertexNormal vertexNormal11 = vertexNormal5;
                                            vertexNormal11.z += vertexNormal.z * 1;
                                            final VertexNormal vertexNormal12 = vertexNormal5;
                                            vertexNormal12.x += vertexNormal.x * 1;
                                            final VertexNormal vertexNormal13 = vertexNormal5;
                                            vertexNormal13.magnitude += vertexNormal.magnitude * 1;
                                            final VertexNormal vertexNormal14 = vertexNormal5;
                                            vertexNormal14.y += vertexNormal.y * 1;
                                            ++n4;
                                            ModelData.field1935[i] = ModelData.field1937;
                                            ModelData.field1936[j] = ModelData.field1937;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (n4 < 3 || !b) {
            return;
        }
        for (int k = 0; k < modelData.faceCount; ++k) {
            if (ModelData.field1935[modelData.verticesY[k]] == ModelData.field1937 && ModelData.field1935[modelData.verticesZ[k]] == ModelData.field1937 && ModelData.field1935[modelData.vertexSkins[k]] == ModelData.field1937) {
                if (modelData.faceRenderTypes == null) {
                    modelData.faceRenderTypes = new byte[modelData.faceCount];
                }
                modelData.faceRenderTypes[k] = 2;
            }
        }
        for (int l = 0; l < modelData2.faceCount; ++l) {
            if (ModelData.field1936[modelData2.verticesY[l]] == ModelData.field1937 && ModelData.field1936[modelData2.verticesZ[l]] == ModelData.field1937 && ModelData.field1936[modelData2.vertexSkins[l]] == ModelData.field1937) {
                if (modelData2.faceRenderTypes == null) {
                    modelData2.faceRenderTypes = new byte[modelData2.faceCount];
                }
                modelData2.faceRenderTypes[l] = 2;
            }
        }
    }
    
    public static ModelData bx(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-50));
        if (takeFile == null) {
            return null;
        }
        return new ModelData(takeFile);
    }
    
    public void method1206(final int n) {
        final int n2 = ModelData.ModelData_sine[n];
        final int n3 = ModelData.ModelData_cosine[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n4 = this.indices1[i] * n2 + this.indices2[i] * n3 >> 16;
            this.indices1[i] = this.indices1[i] * n3 - this.indices2[i] * n2 >> 16;
            this.indices2[i] = n4;
        }
        this.ci();
    }
    
    void calculateBounds() {
        this.vertexNormals = null;
        this.vertexVertices = null;
        this.faceNormals = null;
        this.isBoundsCalculated = false;
    }
    
    void bd(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        final Buffer buffer6 = new Buffer(array);
        final Buffer buffer7 = new Buffer(array);
        buffer.offset = (array.length - 26) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-404369574);
        final int unsignedShort2 = buffer.readUnsignedShort(-21305028);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int ra8 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-1855336875);
        final int unsignedShort4 = buffer.readUnsignedShort(279627611);
        final int unsignedShort5 = buffer.readUnsignedShort(71428512);
        final int unsignedShort6 = buffer.readUnsignedShort(708773356);
        final int unsignedShort7 = buffer.readUnsignedShort(831094607);
        final int unsignedShort8 = buffer.readUnsignedShort(-1123305343);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            buffer.offset = 0;
            for (int i = 0; i < ra; ++i) {
                final byte[] textureRenderTypes = this.textureRenderTypes;
                final int n4 = i;
                final byte wu = Buffer.wu(buffer, 435772489);
                textureRenderTypes[n4] = wu;
                final byte b = wu;
                if (b == 0) {
                    ++n;
                }
                if (b >= 1 && b <= 3) {
                    ++n2;
                }
                if (b == 2) {
                    ++n3;
                }
            }
        }
        final int n7;
        final int n6;
        int n5 = n6 = (n7 = ra) + unsignedShort;
        if (ra2 == 1) {
            n5 += unsignedShort2;
        }
        final int n8 = n5;
        final int n10;
        int n9 = n10 = n5 + unsignedShort2;
        if (ra3 == 255) {
            n9 += unsignedShort2;
        }
        final int n11 = n9;
        if (ra5 == 1) {
            n9 += unsignedShort2;
        }
        final int n12 = n9;
        final int n14;
        int n13 = n14 = n9 + unsignedShort8;
        if (ra4 == 1) {
            n13 += unsignedShort2;
        }
        final int n15 = n13;
        final int n17;
        int n16 = n17 = n13 + unsignedShort6;
        if (ra6 == 1) {
            n16 += unsignedShort2 * 2;
        }
        final int n18 = n16;
        final int n29;
        final int n28;
        final int n27;
        final int n26;
        final int n25;
        final int n24;
        final int n23;
        final int n22;
        final int n21;
        final int n20;
        final int n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = n16 + unsignedShort7) + unsignedShort2 * 2) + unsignedShort3) + unsignedShort4) + unsignedShort5) + n * 6) + n2 * 6) + n2 * 6) + n2 * 2) + n2) + (n2 * 2 + n3 * 2);
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra7 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        if (ra6 == 1) {
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra6 == 1 && ra > 0) {
            this.textureCoords = new byte[unsignedShort2];
        }
        if (ra8 == 1) {
            this.field1899 = new int[unsignedShort][];
            this.field1924 = new int[unsignedShort][];
        }
        this.faceColors = new short[unsignedShort2];
        if (ra > 0) {
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        buffer.offset = n7 * -1516355947;
        buffer2.offset = n28 * -1516355947;
        buffer3.offset = n27 * -1516355947;
        buffer4.offset = n26 * -1516355947;
        buffer5.offset = n12 * -1516355947;
        int n30 = 0;
        int n31 = 0;
        int n32 = 0;
        for (int j = 0; j < unsignedShort; ++j) {
            final int ra9 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra9 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1583882470);
            }
            int shortSmart2 = 0;
            if ((ra9 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1165354604);
            }
            int shortSmart3 = 0;
            if ((ra9 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1402432472);
            }
            this.indices2[j] = n30 + shortSmart;
            this.indices3[j] = n31 + shortSmart2;
            this.indices1[j] = n32 + shortSmart3;
            n30 = this.indices2[j];
            n31 = this.indices3[j];
            n32 = this.indices1[j];
            if (ra7 == 1) {
                this.faceSkins[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        if (ra8 == 1) {
            for (int k = 0; k < unsignedShort; ++k) {
                final int ra10 = Buffer.ra(buffer5, (byte)7);
                this.field1899[k] = new int[ra10];
                this.field1924[k] = new int[ra10];
                for (int l = 0; l < ra10; ++l) {
                    this.field1899[k][l] = Buffer.ra(buffer5, (byte)7);
                    this.field1924[k][l] = Buffer.ra(buffer5, (byte)7);
                }
            }
        }
        buffer.offset = n29 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n10 * -1516355947;
        buffer4.offset = n14 * -1516355947;
        buffer5.offset = n11 * -1516355947;
        buffer6.offset = n17 * -1516355947;
        buffer7.offset = n18 * -1516355947;
        for (int n33 = 0; n33 < unsignedShort2; ++n33) {
            this.faceColors[n33] = (short)buffer.readUnsignedShort(225569958);
            if (ra2 == 1) {
                this.faceRenderTypes[n33] = Buffer.wu(buffer2, 435772489);
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[n33] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[n33] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[n33] = Buffer.ra(buffer5, (byte)7);
            }
            if (ra6 == 1) {
                this.faceTextures[n33] = (short)(buffer6.readUnsignedShort(-1710399166) - 1);
            }
            if (this.textureCoords != null && this.faceTextures[n33] != -1) {
                this.textureCoords[n33] = (byte)(Buffer.ra(buffer7, (byte)7) - 1);
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n8 * -1516355947;
        int n34 = 0;
        int n35 = 0;
        int n36 = 0;
        int n37 = 0;
        for (int n38 = 0; n38 < unsignedShort2; ++n38) {
            final int ra11 = Buffer.ra(buffer2, (byte)7);
            if (ra11 == 1) {
                n34 = buffer.readShortSmart(2141651116) + n37;
                n35 = buffer.readShortSmart(1771847491) + n34;
                n36 = (n37 = buffer.readShortSmart(1596238713) + n35);
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
            if (ra11 == 2) {
                n35 = n36;
                n36 = (n37 += buffer.readShortSmart(1949392498));
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
            if (ra11 == 3) {
                n34 = n36;
                n36 = (n37 += buffer.readShortSmart(1725213968));
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
            if (ra11 == 4) {
                final int n39 = n34;
                n34 = n35;
                n35 = n39;
                n36 = (n37 += buffer.readShortSmart(1831867890));
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
        }
        buffer.offset = n25 * -1516355947;
        buffer2.offset = n24 * -1516355947;
        buffer3.offset = n23 * -1516355947;
        buffer4.offset = n22 * -1516355947;
        buffer5.offset = n21 * -1516355947;
        buffer6.offset = n20 * -1516355947;
        for (int n40 = 0; n40 < ra; ++n40) {
            if ((this.textureRenderTypes[n40] & 0xFF) == 0x0) {
                this.texTriangleX[n40] = (short)buffer.readUnsignedShort(-1752760209);
                this.texTriangleY[n40] = (short)buffer.readUnsignedShort(-340546502);
                this.texTriangleZ[n40] = (short)buffer.readUnsignedShort(278653064);
            }
        }
        buffer.offset = n19 * -1516355947;
        if (Buffer.ra(buffer, (byte)7) != 0) {
            new ModelData0();
            buffer.readUnsignedShort(-23100558);
            buffer.readUnsignedShort(-411015027);
            buffer.readUnsignedShort(-1384012435);
            buffer.readInt(-2110875031);
        }
    }
    
    public void cm(final int n) {
        final int n2 = ModelData.ModelData_sine[n];
        final int n3 = ModelData.ModelData_cosine[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n4 = this.indices1[i] * n2 + this.indices2[i] * n3 >> 16;
            this.indices1[i] = this.indices1[i] * n3 - this.indices2[i] * n2 >> 16;
            this.indices2[i] = n4;
        }
        this.ci();
    }
    
    void bg(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        final Buffer buffer6 = new Buffer(array);
        final Buffer buffer7 = new Buffer(array);
        buffer.offset = (array.length - 23) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-1388923165);
        final int unsignedShort2 = buffer.readUnsignedShort(-57692333);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-749453996);
        final int unsignedShort4 = buffer.readUnsignedShort(-1908684387);
        final int unsignedShort5 = buffer.readUnsignedShort(-779863720);
        final int unsignedShort6 = buffer.readUnsignedShort(-654249997);
        final int unsignedShort7 = buffer.readUnsignedShort(-822099427);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            buffer.offset = 0;
            for (int i = 0; i < ra; ++i) {
                final byte[] textureRenderTypes = this.textureRenderTypes;
                final int n4 = i;
                final byte wu = Buffer.wu(buffer, 435772489);
                textureRenderTypes[n4] = wu;
                final byte b = wu;
                if (b == 0) {
                    ++n;
                }
                if (b >= 1 && b <= 3) {
                    ++n2;
                }
                if (b == 2) {
                    ++n3;
                }
            }
        }
        final int n7;
        final int n6;
        int n5 = n6 = (n7 = ra) + unsignedShort;
        if (ra2 == 1) {
            n5 += unsignedShort2;
        }
        final int n8 = n5;
        final int n10;
        int n9 = n10 = n5 + unsignedShort2;
        if (ra3 == 255) {
            n9 += unsignedShort2;
        }
        final int n11 = n9;
        if (ra5 == 1) {
            n9 += unsignedShort2;
        }
        final int n12 = n9;
        if (ra7 == 1) {
            n9 += unsignedShort;
        }
        final int n13 = n9;
        if (ra4 == 1) {
            n9 += unsignedShort2;
        }
        final int n14 = n9;
        final int n16;
        int n15 = n16 = n9 + unsignedShort6;
        if (ra6 == 1) {
            n15 += unsignedShort2 * 2;
        }
        final int n17 = n15;
        final int n28;
        final int n27;
        final int n26;
        final int n25;
        final int n24;
        final int n23;
        final int n22;
        final int n21;
        final int n20;
        final int n19;
        final int n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = n15 + unsignedShort7) + unsignedShort2 * 2) + unsignedShort3) + unsignedShort4) + unsignedShort5) + n * 6) + n2 * 6) + n2 * 6) + n2 * 2) + n2) + (n2 * 2 + n3 * 2);
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra7 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        if (ra6 == 1) {
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra6 == 1 && ra > 0) {
            this.textureCoords = new byte[unsignedShort2];
        }
        this.faceColors = new short[unsignedShort2];
        if (ra > 0) {
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        buffer.offset = n7 * -1516355947;
        buffer2.offset = n27 * -1516355947;
        buffer3.offset = n26 * -1516355947;
        buffer4.offset = n25 * -1516355947;
        buffer5.offset = n12 * -1516355947;
        int n29 = 0;
        int n30 = 0;
        int n31 = 0;
        for (int j = 0; j < unsignedShort; ++j) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1593400190);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(2082736074);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1920057725);
            }
            this.indices2[j] = n29 + shortSmart;
            this.indices3[j] = n30 + shortSmart2;
            this.indices1[j] = n31 + shortSmart3;
            n29 = this.indices2[j];
            n30 = this.indices3[j];
            n31 = this.indices1[j];
            if (ra7 == 1) {
                this.faceSkins[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n28 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n10 * -1516355947;
        buffer4.offset = n13 * -1516355947;
        buffer5.offset = n11 * -1516355947;
        buffer6.offset = n16 * -1516355947;
        buffer7.offset = n17 * -1516355947;
        for (int k = 0; k < unsignedShort2; ++k) {
            this.faceColors[k] = (short)buffer.readUnsignedShort(-1375859412);
            if (ra2 == 1) {
                this.faceRenderTypes[k] = Buffer.wu(buffer2, 435772489);
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[k] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[k] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[k] = Buffer.ra(buffer5, (byte)7);
            }
            if (ra6 == 1) {
                this.faceTextures[k] = (short)(buffer6.readUnsignedShort(-46432988) - 1);
            }
            if (this.textureCoords != null && this.faceTextures[k] != -1) {
                this.textureCoords[k] = (byte)(Buffer.ra(buffer7, (byte)7) - 1);
            }
        }
        buffer.offset = n14 * -1516355947;
        buffer2.offset = n8 * -1516355947;
        int n32 = 0;
        int n33 = 0;
        int n34 = 0;
        int n35 = 0;
        for (int l = 0; l < unsignedShort2; ++l) {
            final int ra9 = Buffer.ra(buffer2, (byte)7);
            if (ra9 == 1) {
                n32 = buffer.readShortSmart(1500602142) + n35;
                n33 = buffer.readShortSmart(1209932887) + n32;
                n34 = (n35 = buffer.readShortSmart(1786318645) + n33);
                this.verticesY[l] = n32;
                this.verticesZ[l] = n33;
                this.vertexSkins[l] = n34;
            }
            if (ra9 == 2) {
                n33 = n34;
                n34 = (n35 += buffer.readShortSmart(1700630260));
                this.verticesY[l] = n32;
                this.verticesZ[l] = n33;
                this.vertexSkins[l] = n34;
            }
            if (ra9 == 3) {
                n32 = n34;
                n34 = (n35 += buffer.readShortSmart(1577794286));
                this.verticesY[l] = n32;
                this.verticesZ[l] = n33;
                this.vertexSkins[l] = n34;
            }
            if (ra9 == 4) {
                final int n36 = n32;
                n32 = n33;
                n33 = n36;
                n34 = (n35 += buffer.readShortSmart(1612023953));
                this.verticesY[l] = n32;
                this.verticesZ[l] = n33;
                this.vertexSkins[l] = n34;
            }
        }
        buffer.offset = n24 * -1516355947;
        buffer2.offset = n23 * -1516355947;
        buffer3.offset = n22 * -1516355947;
        buffer4.offset = n21 * -1516355947;
        buffer5.offset = n20 * -1516355947;
        buffer6.offset = n19 * -1516355947;
        for (int n37 = 0; n37 < ra; ++n37) {
            if ((this.textureRenderTypes[n37] & 0xFF) == 0x0) {
                this.texTriangleX[n37] = (short)buffer.readUnsignedShort(-1491410133);
                this.texTriangleY[n37] = (short)buffer.readUnsignedShort(-1747759796);
                this.texTriangleZ[n37] = (short)buffer.readUnsignedShort(-471349371);
            }
        }
        buffer.offset = n18 * -1516355947;
        if (Buffer.ra(buffer, (byte)7) != 0) {
            new ModelData0();
            buffer.readUnsignedShort(-1670641749);
            buffer.readUnsignedShort(563785550);
            buffer.readUnsignedShort(-1676890611);
            buffer.readInt(-1419279539);
        }
    }
    
    public void cg(final int n) {
        final int n2 = ModelData.ModelData_sine[n];
        final int n3 = ModelData.ModelData_cosine[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n4 = this.indices1[i] * n2 + this.indices2[i] * n3 >> 16;
            this.indices1[i] = this.indices1[i] * n3 - this.indices2[i] * n2 >> 16;
            this.indices2[i] = n4;
        }
        this.ci();
    }
    
    public void co(final short n, final short n2) {
        for (int i = 0; i < this.faceCount; ++i) {
            if (this.faceColors[i] == n) {
                this.faceColors[i] = n2;
            }
        }
    }
    
    public void cy(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int[] indices2 = this.indices2;
            final int n4 = i;
            indices2[n4] += n;
            final int[] indices3 = this.indices3;
            final int n5 = i;
            indices3[n5] += n2;
            final int[] indices4 = this.indices1;
            final int n6 = i;
            indices4[n6] += n3;
        }
        this.ci();
    }
    
    public static ModelData ModelData_get(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-110));
        if (takeFile == null) {
            return null;
        }
        return new ModelData(takeFile);
    }
    
    void bn(final byte[] array) {
        boolean b = false;
        boolean b2 = false;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        buffer.offset = (array.length - 23) * -564976068;
        final int unsignedShort = buffer.readUnsignedShort(-1740913932);
        final int unsignedShort2 = buffer.readUnsignedShort(-1801450657);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-165341302);
        final int unsignedShort4 = buffer.readUnsignedShort(81637524);
        buffer.readUnsignedShort(-1626630863);
        final int unsignedShort5 = buffer.readUnsignedShort(691133078);
        final int unsignedShort6 = buffer.readUnsignedShort(-559699642);
        final int n4;
        final int n3;
        final int n2;
        int n = n2 = (n3 = (n4 = 0) + unsignedShort) + unsignedShort2;
        if (ra3 == 255) {
            n += unsignedShort2;
        }
        final int n5 = n;
        if (ra5 == 1) {
            n += unsignedShort2;
        }
        final int n6 = n;
        if (ra2 == 1) {
            n += unsignedShort2;
        }
        final int n7 = n;
        final int n9;
        int n8 = n9 = n + unsignedShort6;
        if (ra4 == 1) {
            n8 += unsignedShort2;
        }
        final int n10 = n8;
        final int n15;
        final int n14;
        final int n13;
        final int n12;
        final int n11 = (n12 = (n13 = (n14 = (n15 = n8 + unsignedShort5) + unsignedShort2 * 2) + ra * 6) + unsignedShort3) + unsignedShort4;
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        if (ra6 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
            this.textureCoords = new byte[unsignedShort2];
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        if (ra7 == 1) {
            this.field1899 = new int[unsignedShort][];
            this.field1924 = new int[unsignedShort][];
        }
        this.faceColors = new short[unsignedShort2];
        buffer.offset = n4 * -1555996293;
        buffer2.offset = n13 * -1516355947;
        buffer3.offset = n12 * -1516355947;
        buffer4.offset = n11 * -1516355947;
        buffer5.offset = n7 * -1516355947;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1713515672);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(2082882231);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(2056703425);
            }
            this.indices2[i] = n16 + shortSmart;
            this.indices3[i] = n17 + shortSmart2;
            this.indices1[i] = n18 + shortSmart3;
            n16 = this.indices2[i];
            n17 = this.indices3[i];
            n18 = this.indices1[i];
            if (ra6 == 1) {
                this.faceSkins[i] = Buffer.ra(buffer5, (byte)7);
            }
        }
        if (ra7 == 1) {
            for (int j = 0; j < unsignedShort; ++j) {
                final int ra9 = Buffer.ra(buffer5, (byte)7);
                this.field1899[j] = new int[ra9];
                this.field1924[j] = new int[ra9];
                for (int k = 0; k < ra9; ++k) {
                    this.field1899[j][k] = Buffer.ra(buffer5, (byte)7);
                    this.field1924[j][k] = Buffer.ra(buffer5, (byte)7);
                }
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n2 * -1247086320;
        buffer4.offset = n9 * -1516355947;
        buffer5.offset = n5 * -1516355947;
        for (int l = 0; l < unsignedShort2; ++l) {
            this.faceColors[l] = (short)buffer.readUnsignedShort(211901909);
            if (ra2 == 1) {
                final int ra10 = Buffer.ra(buffer2, (byte)7);
                if ((ra10 & 0x1) == 0x1) {
                    this.faceRenderTypes[l] = 1;
                    b = true;
                }
                else {
                    this.faceRenderTypes[l] = 0;
                }
                if ((ra10 & 0x2) == 0x2) {
                    this.textureCoords[l] = (byte)(ra10 >> 2);
                    this.faceTextures[l] = this.faceColors[l];
                    this.faceColors[l] = 127;
                    if (this.faceTextures[l] != -1) {
                        b2 = true;
                    }
                }
                else {
                    this.textureCoords[l] = -1;
                    this.faceTextures[l] = -1;
                }
            }
            if (ra3 == -1116545397) {
                this.faceRenderPriorities[l] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[l] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[l] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n10 * -1516355947;
        buffer2.offset = n3 * -1516355947;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        for (int n23 = 0; n23 < unsignedShort2; ++n23) {
            final int ra11 = Buffer.ra(buffer2, (byte)7);
            if (ra11 == 1) {
                n19 = buffer.readShortSmart(1629932391) + n22;
                n20 = buffer.readShortSmart(1887472618) + n19;
                n21 = (n22 = buffer.readShortSmart(1770568984) + n20);
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 2) {
                n20 = n21;
                n21 = (n22 += buffer.readShortSmart(1504041332));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 3) {
                n19 = n21;
                n21 = (n22 += buffer.readShortSmart(1357261566));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
            if (ra11 == 4) {
                final int n24 = n19;
                n19 = n20;
                n20 = n24;
                n21 = (n22 += buffer.readShortSmart(1298454893));
                this.verticesY[n23] = n19;
                this.verticesZ[n23] = n20;
                this.vertexSkins[n23] = n21;
            }
        }
        buffer.offset = n14 * -543080197;
        for (int n25 = 0; n25 < ra; ++n25) {
            this.textureRenderTypes[n25] = 0;
            this.texTriangleX[n25] = (short)buffer.readUnsignedShort(-852923187);
            this.texTriangleY[n25] = (short)buffer.readUnsignedShort(-762604894);
            this.texTriangleZ[n25] = (short)buffer.readUnsignedShort(-1183019094);
        }
        if (this.textureCoords != null) {
            boolean b3 = false;
            for (int n26 = 0; n26 < unsignedShort2; ++n26) {
                final int n27 = this.textureCoords[n26] & 0x9357DB24;
                if (n27 != 255) {
                    if ((this.texTriangleX[n27] & 0xFFFF) == this.verticesY[n26] && (this.texTriangleY[n27] & 0xBB9C02AF) == this.verticesZ[n26] && (this.texTriangleZ[n27] & 0x37909D98) == this.vertexSkins[n26]) {
                        this.textureCoords[n26] = -1;
                    }
                    else {
                        b3 = true;
                    }
                }
            }
            if (!b3) {
                this.textureCoords = null;
            }
        }
        if (!b2) {
            this.faceTextures = null;
        }
        if (!b) {
            this.faceRenderTypes = null;
        }
    }
    
    public void cz() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices1[i] = -this.indices1[i];
        }
        for (int j = 0; j < this.faceCount; ++j) {
            final int n = this.verticesY[j];
            this.verticesY[j] = this.vertexSkins[j];
            this.vertexSkins[j] = n;
        }
        this.ci();
    }
    
    void dr() {
        if (this.faceSkins != null) {
            final int[] array = new int[256];
            int n = 0;
            for (int i = 0; i < this.verticesCount; ++i) {
                final int n2 = this.faceSkins[i];
                final int[] array2 = array;
                final int n3 = n2;
                ++array2[n3];
                if (n2 > n) {
                    n = n2;
                }
            }
            this.vertexLabels = new int[n + 1][];
            for (int j = 0; j <= n; ++j) {
                this.vertexLabels[j] = new int[array[j]];
                array[j] = 0;
            }
            for (int k = 0; k < this.verticesCount; ++k) {
                final int n4 = this.faceSkins[k];
                this.vertexLabels[n4][array[n4]++] = k;
            }
            this.faceSkins = null;
        }
        if (this.verticesX != null) {
            final int[] array3 = new int[256];
            int n5 = 0;
            for (int l = 0; l < this.faceCount; ++l) {
                final int n6 = this.verticesX[l];
                final int[] array4 = array3;
                final int n7 = n6;
                ++array4[n7];
                if (n6 > n5) {
                    n5 = n6;
                }
            }
            this.faceLabelsAlpha = new int[n5 + 1][];
            for (int n8 = 0; n8 <= n5; ++n8) {
                this.faceLabelsAlpha[n8] = new int[array3[n8]];
                array3[n8] = 0;
            }
            for (int n9 = 0; n9 < this.faceCount; ++n9) {
                final int n10 = this.verticesX[n9];
                this.faceLabelsAlpha[n10][array3[n10]++] = n9;
            }
            this.verticesX = null;
        }
    }
    
    public ModelData aq() {
        return sw(this, true, true, true, true);
    }
    
    public void retexture(final short n, final short n2) {
        for (int i = 0; i < this.field1934; ++i) {
            if (this.texTriangleX[i] == n) {
                this.texTriangleZ[i] = n2;
            }
        }
    }
    
    public void method1188() {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.indices2[i];
            this.indices2[i] = this.indices1[i];
            this.indices1[i] = -n;
        }
        this.ci();
    }
    
    final int bl(final ModelData modelData, final int n) {
        int n2 = -1;
        final int n3 = modelData.indices2[n];
        final int n4 = modelData.indices3[n];
        final int n5 = modelData.indices1[n];
        for (int i = 0; i < this.verticesCount; ++i) {
            if (n3 == this.indices2[i] && n4 == this.indices3[i] && n5 == this.indices1[i]) {
                n2 = i;
                break;
            }
        }
        if (n2 == -1) {
            this.indices2[this.verticesCount] = n3;
            this.indices3[this.verticesCount] = n4;
            this.indices1[this.verticesCount] = n5;
            if (modelData.faceSkins != null) {
                this.faceSkins[this.verticesCount] = modelData.faceSkins[n];
            }
            if (modelData.field1899 != null) {
                this.field1899[this.verticesCount] = modelData.field1899[n];
                this.field1924[this.verticesCount] = modelData.field1924[n];
            }
            n2 = this.verticesCount++;
        }
        return n2;
    }
    
    public final Model dg(final int n, final int n2, final int n3, final int n4, final int n5) {
        Client.nw.trace("Lighting model {}", (Object)this);
        this.calculateVertexNormals();
        final int n6 = n2 * (int)Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5) >> 8;
        final Model model = new Model();
        model.faceColors1 = new int[this.faceCount];
        model.faceColors2 = new int[this.faceCount];
        model.faceColors3 = new int[this.faceCount];
        if (this.textureTriangleCount > 0 && this.textureCoords != null) {
            final int[] array = new int[this.textureTriangleCount];
            for (int i = 0; i < this.faceCount; ++i) {
                if (this.textureCoords[i] != -1) {
                    final int[] array2 = array;
                    final int n7 = this.textureCoords[i] & 0xFF;
                    ++array2[n7];
                }
            }
            model.field2153 = 0;
            for (int j = 0; j < this.textureTriangleCount; ++j) {
                if (array[j] > 0 && this.textureRenderTypes[j] == 0) {
                    final Model model2 = model;
                    ++model2.field2153;
                }
            }
            model.field2199 = new int[model.field2153];
            model.field2155 = new int[model.field2153];
            model.field2187 = new int[model.field2153];
            int n8 = 0;
            for (int k = 0; k < this.textureTriangleCount; ++k) {
                if (array[k] > 0 && this.textureRenderTypes[k] == 0) {
                    model.field2199[n8] = (this.texTriangleX[k] & 0xFFFF);
                    model.field2155[n8] = (this.texTriangleY[k] & 0xFFFF);
                    model.field2187[n8] = (this.texTriangleZ[k] & 0xFFFF);
                    array[k] = n8++;
                }
                else {
                    array[k] = -1;
                }
            }
            model.faceRenderPriorities = new byte[this.faceCount];
            for (int l = 0; l < this.faceCount; ++l) {
                if (this.textureCoords[l] != -1) {
                    model.faceRenderPriorities[l] = (byte)array[this.textureCoords[l] & 0xFF];
                }
                else {
                    model.faceRenderPriorities[l] = -1;
                }
            }
        }
        for (int n9 = 0; n9 < this.faceCount; ++n9) {
            int n10;
            if (this.faceRenderTypes == null) {
                n10 = 0;
            }
            else {
                n10 = this.faceRenderTypes[n9];
            }
            byte b;
            if (this.faceAlphas == null) {
                b = 0;
            }
            else {
                b = this.faceAlphas[n9];
            }
            int n11;
            if (this.faceTextures == null) {
                n11 = -1;
            }
            else {
                n11 = this.faceTextures[n9];
            }
            if (b == -2) {
                n10 = 3;
            }
            if (b == -1) {
                n10 = 2;
            }
            if (n11 == -1) {
                if (n10 == 0) {
                    final int n12 = this.faceColors[n9] & 0xFFFF;
                    VertexNormal vertexNormal;
                    if (this.vertexVertices != null && this.vertexVertices[this.verticesY[n9]] != null) {
                        vertexNormal = this.vertexVertices[this.verticesY[n9]];
                    }
                    else {
                        vertexNormal = this.vertexNormals[this.verticesY[n9]];
                    }
                    model.faceColors1[n9] = method1186(n12, n + (n3 * (vertexNormal.z * -1941999827) + n4 * (vertexNormal.x * 124229261) + n5 * (vertexNormal.magnitude * 2108671835)) / (n6 * (vertexNormal.y * -1837445001)));
                    VertexNormal vertexNormal2;
                    if (this.vertexVertices != null && this.vertexVertices[this.verticesZ[n9]] != null) {
                        vertexNormal2 = this.vertexVertices[this.verticesZ[n9]];
                    }
                    else {
                        vertexNormal2 = this.vertexNormals[this.verticesZ[n9]];
                    }
                    model.faceColors2[n9] = method1186(n12, n + (n3 * (vertexNormal2.z * -1941999827) + n4 * (vertexNormal2.x * 124229261) + n5 * (vertexNormal2.magnitude * 2108671835)) / (n6 * (vertexNormal2.y * -1837445001)));
                    VertexNormal vertexNormal3;
                    if (this.vertexVertices != null && this.vertexVertices[this.vertexSkins[n9]] != null) {
                        vertexNormal3 = this.vertexVertices[this.vertexSkins[n9]];
                    }
                    else {
                        vertexNormal3 = this.vertexNormals[this.vertexSkins[n9]];
                    }
                    model.faceColors3[n9] = method1186(n12, n + (n3 * (vertexNormal3.z * -1941999827) + n4 * (vertexNormal3.x * 124229261) + n5 * (vertexNormal3.magnitude * 2108671835)) / (n6 * (vertexNormal3.y * -1837445001)));
                }
                else if (n10 == 1) {
                    final FaceNormal faceNormal = this.faceNormals[n9];
                    model.faceColors1[n9] = method1186(this.faceColors[n9] & 0xFFFF, n + (n3 * (faceNormal.x * -18074541) + n4 * (faceNormal.y * 1542458359) + n5 * (faceNormal.z * -446870673)) / (n6 + n6 / 2));
                    model.faceColors3[n9] = -1;
                }
                else if (n10 == 3) {
                    model.faceColors1[n9] = 128;
                    model.faceColors3[n9] = -1;
                }
                else {
                    model.faceColors3[n9] = -2;
                }
            }
            else if (n10 == 0) {
                VertexNormal vertexNormal4;
                if (this.vertexVertices != null && this.vertexVertices[this.verticesY[n9]] != null) {
                    vertexNormal4 = this.vertexVertices[this.verticesY[n9]];
                }
                else {
                    vertexNormal4 = this.vertexNormals[this.verticesY[n9]];
                }
                model.faceColors1[n9] = method1200(n + (n3 * (vertexNormal4.z * -1941999827) + n4 * (vertexNormal4.x * 124229261) + n5 * (vertexNormal4.magnitude * 2108671835)) / (n6 * (vertexNormal4.y * -1837445001)));
                VertexNormal vertexNormal5;
                if (this.vertexVertices != null && this.vertexVertices[this.verticesZ[n9]] != null) {
                    vertexNormal5 = this.vertexVertices[this.verticesZ[n9]];
                }
                else {
                    vertexNormal5 = this.vertexNormals[this.verticesZ[n9]];
                }
                model.faceColors2[n9] = method1200(n + (n3 * (vertexNormal5.z * -1941999827) + n4 * (vertexNormal5.x * 124229261) + n5 * (vertexNormal5.magnitude * 2108671835)) / (n6 * (vertexNormal5.y * -1837445001)));
                VertexNormal vertexNormal6;
                if (this.vertexVertices != null && this.vertexVertices[this.vertexSkins[n9]] != null) {
                    vertexNormal6 = this.vertexVertices[this.vertexSkins[n9]];
                }
                else {
                    vertexNormal6 = this.vertexNormals[this.vertexSkins[n9]];
                }
                model.faceColors3[n9] = method1200(n + (n3 * (vertexNormal6.z * -1941999827) + n4 * (vertexNormal6.x * 124229261) + n5 * (vertexNormal6.magnitude * 2108671835)) / (n6 * (vertexNormal6.y * -1837445001)));
            }
            else if (n10 == 1) {
                final FaceNormal faceNormal2 = this.faceNormals[n9];
                model.faceColors1[n9] = method1200(n + (n3 * (faceNormal2.x * -18074541) + n4 * (faceNormal2.y * 1542458359) + n5 * (faceNormal2.z * -446870673)) / (n6 + n6 / 2));
                model.faceColors3[n9] = -1;
            }
            else {
                model.faceColors3[n9] = -2;
            }
        }
        this.di();
        model.verticesCount = this.verticesCount;
        model.verticesX = this.indices2;
        model.verticesY = this.indices3;
        model.verticesZ = this.indices1;
        model.indicesCount = this.faceCount;
        model.indices1 = this.verticesY;
        model.indices2 = this.verticesZ;
        model.indices3 = this.vertexSkins;
        model.faceAlphas = this.faceRenderPriorities;
        model.field2154 = this.faceAlphas;
        model.field2152 = this.priority;
        model.vertexLabels = this.vertexLabels;
        model.faceLabelsAlpha = this.faceLabelsAlpha;
        model.faceTextures = this.faceTextures;
        model.field2156 = this.field1899;
        model.field2160 = this.field1924;
        final Model model3 = model;
        if (model3 == null) {
            return null;
        }
        this.pe();
        model3.oy = this.rb;
        model3.ez = this.jy;
        model3.en = this.cp;
        return model3;
    }
    
    public static ModelData bz(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-37));
        if (takeFile == null) {
            return null;
        }
        return new ModelData(takeFile);
    }
    
    public Model yc(final int n, final int n2, final int n3, final int n4, final int n5) {
        return this.dg(n, n2, n3, n4, n5);
    }
    
    public static ModelData ej(final ModelData[] array, final int n) {
        return new ModelData(array, n);
    }
    
    public static void mu(final ModelData modelData, final byte[] array) {
        if (modelData == null) {
            modelData.calculateBounds();
            return;
        }
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        final Buffer buffer6 = new Buffer(array);
        final Buffer buffer7 = new Buffer(array);
        buffer.offset = (array.length - 23) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(-394905058);
        final int unsignedShort2 = buffer.readUnsignedShort(-1293106094);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-559471947);
        final int unsignedShort4 = buffer.readUnsignedShort(-1027872175);
        final int unsignedShort5 = buffer.readUnsignedShort(-784992277);
        final int unsignedShort6 = buffer.readUnsignedShort(-209960889);
        final int unsignedShort7 = buffer.readUnsignedShort(628339674);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (ra > 0) {
            modelData.textureRenderTypes = new byte[ra];
            buffer.offset = 0;
            for (int i = 0; i < ra; ++i) {
                final byte[] textureRenderTypes = modelData.textureRenderTypes;
                final int n4 = i;
                final byte wu = Buffer.wu(buffer, 435772489);
                textureRenderTypes[n4] = wu;
                final byte b = wu;
                if (b == 0) {
                    ++n;
                }
                if (b >= 1 && b <= 3) {
                    ++n2;
                }
                if (b == 2) {
                    ++n3;
                }
            }
        }
        final int n7;
        final int n6;
        int n5 = n6 = (n7 = ra) + unsignedShort;
        if (ra2 == 1) {
            n5 += unsignedShort2;
        }
        final int n8 = n5;
        final int n10;
        int n9 = n10 = n5 + unsignedShort2;
        if (ra3 == 1137300336) {
            n9 += unsignedShort2;
        }
        final int n11 = n9;
        if (ra5 == 1) {
            n9 += unsignedShort2;
        }
        final int n12 = n9;
        if (ra7 == 1) {
            n9 += unsignedShort;
        }
        final int n13 = n9;
        if (ra4 == 1) {
            n9 += unsignedShort2;
        }
        final int n14 = n9;
        final int n16;
        int n15 = n16 = n9 + unsignedShort6;
        if (ra6 == 1) {
            n15 += unsignedShort2 * 2;
        }
        final int n17 = n15;
        final int n28;
        final int n27;
        final int n26;
        final int n25;
        final int n24;
        final int n23;
        final int n22;
        final int n21;
        final int n20;
        final int n19;
        final int n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = n15 + unsignedShort7) + unsignedShort2 * 2) + unsignedShort3) + unsignedShort4) + unsignedShort5) + n * 6) + n2 * 6) + n2 * 6) + n2 * 2) + n2) + (n2 * 2 + n3 * 2);
        modelData.verticesCount = unsignedShort;
        modelData.faceCount = unsignedShort2;
        modelData.textureTriangleCount = ra;
        modelData.indices2 = new int[unsignedShort];
        modelData.indices3 = new int[unsignedShort];
        modelData.indices1 = new int[unsignedShort];
        modelData.verticesY = new int[unsignedShort2];
        modelData.verticesZ = new int[unsignedShort2];
        modelData.vertexSkins = new int[unsignedShort2];
        if (ra7 == 1) {
            modelData.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            modelData.faceRenderTypes = new byte[unsignedShort2];
        }
        if (ra3 == 888031703) {
            modelData.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            modelData.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            modelData.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            modelData.verticesX = new int[unsignedShort2];
        }
        if (ra6 == 1) {
            modelData.faceTextures = new short[unsignedShort2];
        }
        if (ra6 == 1 && ra > 0) {
            modelData.textureCoords = new byte[unsignedShort2];
        }
        modelData.faceColors = new short[unsignedShort2];
        if (ra > 0) {
            modelData.texTriangleX = new short[ra];
            modelData.texTriangleY = new short[ra];
            modelData.texTriangleZ = new short[ra];
        }
        buffer.offset = n7 * -1516355947;
        buffer2.offset = n27 * -1516355947;
        buffer3.offset = n26 * -129701827;
        buffer4.offset = n25 * 2125241828;
        buffer5.offset = n12 * 1049624243;
        int n29 = 0;
        int n30 = 0;
        int n31 = 0;
        for (int j = 0; j < unsignedShort; ++j) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1121042438);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1148201400);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1676285758);
            }
            modelData.indices2[j] = n29 + shortSmart;
            modelData.indices3[j] = n30 + shortSmart2;
            modelData.indices1[j] = n31 + shortSmart3;
            n29 = modelData.indices2[j];
            n30 = modelData.indices3[j];
            n31 = modelData.indices1[j];
            if (ra7 == 1) {
                modelData.faceSkins[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n28 * -1516355947;
        buffer2.offset = n6 * -1439674309;
        buffer3.offset = n10 * -1707164273;
        buffer4.offset = n13 * -479614196;
        buffer5.offset = n11 * -1516355947;
        buffer6.offset = n16 * 941522642;
        buffer7.offset = n17 * 717868435;
        for (int k = 0; k < unsignedShort2; ++k) {
            modelData.faceColors[k] = (short)buffer.readUnsignedShort(739840872);
            if (ra2 == 1) {
                modelData.faceRenderTypes[k] = Buffer.wu(buffer2, 435772489);
            }
            if (ra3 == 43328877) {
                modelData.faceRenderPriorities[k] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                modelData.faceAlphas[k] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                modelData.verticesX[k] = Buffer.ra(buffer5, (byte)7);
            }
            if (ra6 == 1) {
                modelData.faceTextures[k] = (short)(buffer6.readUnsignedShort(-1092471975) - 1);
            }
            if (modelData.textureCoords != null && modelData.faceTextures[k] != -1) {
                modelData.textureCoords[k] = (byte)(Buffer.ra(buffer7, (byte)7) - 1);
            }
        }
        buffer.offset = n14 * -1516355947;
        buffer2.offset = n8 * -1516355947;
        int n32 = 0;
        int n33 = 0;
        int n34 = 0;
        int n35 = 0;
        for (int l = 0; l < unsignedShort2; ++l) {
            final int ra9 = Buffer.ra(buffer2, (byte)7);
            if (ra9 == 1) {
                n32 = buffer.readShortSmart(1946398222) + n35;
                n33 = buffer.readShortSmart(1295108664) + n32;
                n34 = (n35 = buffer.readShortSmart(1338659927) + n33);
                modelData.verticesY[l] = n32;
                modelData.verticesZ[l] = n33;
                modelData.vertexSkins[l] = n34;
            }
            if (ra9 == 2) {
                n33 = n34;
                n34 = (n35 += buffer.readShortSmart(2064125566));
                modelData.verticesY[l] = n32;
                modelData.verticesZ[l] = n33;
                modelData.vertexSkins[l] = n34;
            }
            if (ra9 == 3) {
                n32 = n34;
                n34 = (n35 += buffer.readShortSmart(1527173862));
                modelData.verticesY[l] = n32;
                modelData.verticesZ[l] = n33;
                modelData.vertexSkins[l] = n34;
            }
            if (ra9 == 4) {
                final int n36 = n32;
                n32 = n33;
                n33 = n36;
                n34 = (n35 += buffer.readShortSmart(2147183446));
                modelData.verticesY[l] = n32;
                modelData.verticesZ[l] = n33;
                modelData.vertexSkins[l] = n34;
            }
        }
        buffer.offset = n24 * -1516355947;
        buffer2.offset = n23 * -1277208434;
        buffer3.offset = n22 * -1516355947;
        buffer4.offset = n21 * -1986252123;
        buffer5.offset = n20 * -1622838568;
        buffer6.offset = n19 * 893276114;
        for (int n37 = 0; n37 < ra; ++n37) {
            if ((modelData.textureRenderTypes[n37] & 0x8C9127BE) == 0x0) {
                modelData.texTriangleX[n37] = (short)buffer.readUnsignedShort(864802393);
                modelData.texTriangleY[n37] = (short)buffer.readUnsignedShort(-1829404334);
                modelData.texTriangleZ[n37] = (short)buffer.readUnsignedShort(-1604487764);
            }
        }
        buffer.offset = n18 * -1516355947;
        if (Buffer.ra(buffer, (byte)7) != 0) {
            new ModelData0();
            buffer.readUnsignedShort(-1368395891);
            buffer.readUnsignedShort(-320036789);
            buffer.readUnsignedShort(-947032577);
            buffer.readInt(-1189047403);
        }
    }
    
    public static void wf(final ModelData modelData) {
        if (modelData.faceSkins != null) {
            final int[] array = new int[680791843];
            int n = 0;
            for (int i = 0; i < modelData.verticesCount; ++i) {
                final int n2 = modelData.faceSkins[i];
                final int[] array2 = array;
                final int n3 = n2;
                ++array2[n3];
                if (n2 > n) {
                    n = n2;
                }
            }
            modelData.vertexLabels = new int[n + 1][];
            for (int j = 0; j <= n; ++j) {
                modelData.vertexLabels[j] = new int[array[j]];
                array[j] = 0;
            }
            for (int k = 0; k < modelData.verticesCount; ++k) {
                final int n4 = modelData.faceSkins[k];
                modelData.vertexLabels[n4][array[n4]++] = k;
            }
            modelData.faceSkins = null;
        }
        if (modelData.verticesX != null) {
            final int[] array3 = new int[-1854902625];
            int n5 = 0;
            for (int l = 0; l < modelData.faceCount; ++l) {
                final int n6 = modelData.verticesX[l];
                final int[] array4 = array3;
                final int n7 = n6;
                ++array4[n7];
                if (n6 > n5) {
                    n5 = n6;
                }
            }
            modelData.faceLabelsAlpha = new int[n5 + 1][];
            for (int n8 = 0; n8 <= n5; ++n8) {
                modelData.faceLabelsAlpha[n8] = new int[array3[n8]];
                array3[n8] = 0;
            }
            for (int n9 = 0; n9 < modelData.faceCount; ++n9) {
                final int n10 = modelData.verticesX[n9];
                modelData.faceLabelsAlpha[n10][array3[n10]++] = n9;
            }
            modelData.verticesX = null;
        }
    }
    
    public static void vp(final ModelData modelData) {
        if (modelData == null) {
            modelData.rotateY90Ccw();
        }
        for (int i = 0; i < modelData.verticesCount; ++i) {
            final int n = modelData.indices1[i];
            modelData.indices1[i] = modelData.indices2[i];
            modelData.indices2[i] = -n;
        }
        modelData.ci();
    }
    
    public byte[] zz() {
        return this.textureCoords;
    }
    
    public void cq() {
        for (int i = 0; i < this.verticesCount; ++i) {
            final int n = this.indices1[i];
            this.indices1[i] = this.indices2[i];
            this.indices2[i] = -n;
        }
        this.ci();
    }
    
    void bm(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        final Buffer buffer6 = new Buffer(array);
        final Buffer buffer7 = new Buffer(array);
        buffer.offset = (array.length - 26) * -1516355947;
        final int unsignedShort = buffer.readUnsignedShort(37345473);
        final int unsignedShort2 = buffer.readUnsignedShort(-174266864);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int ra8 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(458693613);
        final int unsignedShort4 = buffer.readUnsignedShort(685960598);
        final int unsignedShort5 = buffer.readUnsignedShort(-863214153);
        final int unsignedShort6 = buffer.readUnsignedShort(-756783308);
        final int unsignedShort7 = buffer.readUnsignedShort(-1388484459);
        final int unsignedShort8 = buffer.readUnsignedShort(47480243);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            buffer.offset = 0;
            for (int i = 0; i < ra; ++i) {
                final byte[] textureRenderTypes = this.textureRenderTypes;
                final int n4 = i;
                final byte wu = Buffer.wu(buffer, 435772489);
                textureRenderTypes[n4] = wu;
                final byte b = wu;
                if (b == 0) {
                    ++n;
                }
                if (b >= 1 && b <= 3) {
                    ++n2;
                }
                if (b == 2) {
                    ++n3;
                }
            }
        }
        final int n7;
        final int n6;
        int n5 = n6 = (n7 = ra) + unsignedShort;
        if (ra2 == 1) {
            n5 += unsignedShort2;
        }
        final int n8 = n5;
        final int n10;
        int n9 = n10 = n5 + unsignedShort2;
        if (ra3 == 255) {
            n9 += unsignedShort2;
        }
        final int n11 = n9;
        if (ra5 == 1) {
            n9 += unsignedShort2;
        }
        final int n12 = n9;
        final int n14;
        int n13 = n14 = n9 + unsignedShort8;
        if (ra4 == 1) {
            n13 += unsignedShort2;
        }
        final int n15 = n13;
        final int n17;
        int n16 = n17 = n13 + unsignedShort6;
        if (ra6 == 1) {
            n16 += unsignedShort2 * 2;
        }
        final int n18 = n16;
        final int n29;
        final int n28;
        final int n27;
        final int n26;
        final int n25;
        final int n24;
        final int n23;
        final int n22;
        final int n21;
        final int n20;
        final int n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = n16 + unsignedShort7) + unsignedShort2 * 2) + unsignedShort3) + unsignedShort4) + unsignedShort5) + n * 6) + n2 * 6) + n2 * 6) + n2 * 2) + n2) + (n2 * 2 + n3 * 2);
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra7 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        if (ra6 == 1) {
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra6 == 1 && ra > 0) {
            this.textureCoords = new byte[unsignedShort2];
        }
        if (ra8 == 1) {
            this.field1899 = new int[unsignedShort][];
            this.field1924 = new int[unsignedShort][];
        }
        this.faceColors = new short[unsignedShort2];
        if (ra > 0) {
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        buffer.offset = n7 * -1516355947;
        buffer2.offset = n28 * -1516355947;
        buffer3.offset = n27 * -1516355947;
        buffer4.offset = n26 * -1516355947;
        buffer5.offset = n12 * -1516355947;
        int n30 = 0;
        int n31 = 0;
        int n32 = 0;
        for (int j = 0; j < unsignedShort; ++j) {
            final int ra9 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra9 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1675434208);
            }
            int shortSmart2 = 0;
            if ((ra9 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1806841920);
            }
            int shortSmart3 = 0;
            if ((ra9 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1796291869);
            }
            this.indices2[j] = n30 + shortSmart;
            this.indices3[j] = n31 + shortSmart2;
            this.indices1[j] = n32 + shortSmart3;
            n30 = this.indices2[j];
            n31 = this.indices3[j];
            n32 = this.indices1[j];
            if (ra7 == 1) {
                this.faceSkins[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        if (ra8 == 1) {
            for (int k = 0; k < unsignedShort; ++k) {
                final int ra10 = Buffer.ra(buffer5, (byte)7);
                this.field1899[k] = new int[ra10];
                this.field1924[k] = new int[ra10];
                for (int l = 0; l < ra10; ++l) {
                    this.field1899[k][l] = Buffer.ra(buffer5, (byte)7);
                    this.field1924[k][l] = Buffer.ra(buffer5, (byte)7);
                }
            }
        }
        buffer.offset = n29 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n10 * -1516355947;
        buffer4.offset = n14 * -1516355947;
        buffer5.offset = n11 * -1516355947;
        buffer6.offset = n17 * -1516355947;
        buffer7.offset = n18 * -1516355947;
        for (int n33 = 0; n33 < unsignedShort2; ++n33) {
            this.faceColors[n33] = (short)buffer.readUnsignedShort(-1613738301);
            if (ra2 == 1) {
                this.faceRenderTypes[n33] = Buffer.wu(buffer2, 435772489);
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[n33] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[n33] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[n33] = Buffer.ra(buffer5, (byte)7);
            }
            if (ra6 == 1) {
                this.faceTextures[n33] = (short)(buffer6.readUnsignedShort(-541600847) - 1);
            }
            if (this.textureCoords != null && this.faceTextures[n33] != -1) {
                this.textureCoords[n33] = (byte)(Buffer.ra(buffer7, (byte)7) - 1);
            }
        }
        buffer.offset = n15 * -1516355947;
        buffer2.offset = n8 * -1516355947;
        int n34 = 0;
        int n35 = 0;
        int n36 = 0;
        int n37 = 0;
        for (int n38 = 0; n38 < unsignedShort2; ++n38) {
            final int ra11 = Buffer.ra(buffer2, (byte)7);
            if (ra11 == 1) {
                n34 = buffer.readShortSmart(1574653195) + n37;
                n35 = buffer.readShortSmart(1501416094) + n34;
                n36 = (n37 = buffer.readShortSmart(1831705081) + n35);
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
            if (ra11 == 2) {
                n35 = n36;
                n36 = (n37 += buffer.readShortSmart(2111043609));
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
            if (ra11 == 3) {
                n34 = n36;
                n36 = (n37 += buffer.readShortSmart(1490786297));
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
            if (ra11 == 4) {
                final int n39 = n34;
                n34 = n35;
                n35 = n39;
                n36 = (n37 += buffer.readShortSmart(2070804857));
                this.verticesY[n38] = n34;
                this.verticesZ[n38] = n35;
                this.vertexSkins[n38] = n36;
            }
        }
        buffer.offset = n25 * -1516355947;
        buffer2.offset = n24 * -1516355947;
        buffer3.offset = n23 * -1516355947;
        buffer4.offset = n22 * -1516355947;
        buffer5.offset = n21 * -1516355947;
        buffer6.offset = n20 * -1516355947;
        for (int n40 = 0; n40 < ra; ++n40) {
            if ((this.textureRenderTypes[n40] & 0xFF) == 0x0) {
                this.texTriangleX[n40] = (short)buffer.readUnsignedShort(109644972);
                this.texTriangleY[n40] = (short)buffer.readUnsignedShort(-1553049653);
                this.texTriangleZ[n40] = (short)buffer.readUnsignedShort(-58836624);
            }
        }
        buffer.offset = n19 * -1516355947;
        if (Buffer.ra(buffer, (byte)7) != 0) {
            new ModelData0();
            buffer.readUnsignedShort(552768155);
            buffer.readUnsignedShort(-1574441968);
            buffer.readUnsignedShort(-818957072);
            buffer.readInt(-901661354);
        }
    }
    
    public VertexNormal[] bk() {
        return this.vertexNormals;
    }
    
    public static ModelData bk(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-49));
        if (takeFile == null) {
            return null;
        }
        return new ModelData(takeFile);
    }
    
    public ModelData ez() {
        this.indices2 = this.indices2.clone();
        this.indices3 = this.indices3.clone();
        this.indices1 = this.indices1.clone();
        return this;
    }
    
    public void method1190() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.indices2[i] = -this.indices2[i];
            this.indices1[i] = -this.indices1[i];
        }
        this.ci();
    }
    
    public static void tu(final ModelData modelData, final int n, final int n2, final int n3) {
        if (modelData == null) {
            modelData.cm(n);
        }
        for (int i = 0; i < modelData.verticesCount; ++i) {
            modelData.indices2[i] = modelData.indices2[i] * n / 128;
            modelData.indices3[i] = modelData.indices3[i] * n2 / 128;
            modelData.indices1[i] = modelData.indices1[i] * n3 / 128;
        }
        modelData.ci();
    }
    
    public ModelData uy() {
        this.faceTextures = this.faceTextures.clone();
        return this;
    }
    
    public ModelData xr() {
        final ModelData modelData = new ModelData();
        if (this.faceRenderTypes != null) {
            modelData.faceRenderTypes = new byte[this.faceCount];
            for (int i = 0; i < this.faceCount; ++i) {
                modelData.faceRenderTypes[i] = this.faceRenderTypes[i];
            }
        }
        modelData.verticesCount = this.verticesCount;
        modelData.faceCount = this.faceCount;
        modelData.textureTriangleCount = this.textureTriangleCount;
        modelData.indices2 = this.indices2;
        modelData.indices3 = this.indices3;
        modelData.indices1 = this.indices1;
        modelData.verticesY = this.verticesY;
        modelData.verticesZ = this.verticesZ;
        modelData.vertexSkins = this.vertexSkins;
        modelData.faceRenderPriorities = this.faceRenderPriorities;
        modelData.faceAlphas = this.faceAlphas;
        modelData.textureCoords = this.textureCoords;
        modelData.faceColors = this.faceColors;
        modelData.faceTextures = this.faceTextures;
        modelData.priority = this.priority;
        modelData.textureRenderTypes = this.textureRenderTypes;
        modelData.texTriangleX = this.texTriangleX;
        modelData.texTriangleY = this.texTriangleY;
        modelData.texTriangleZ = this.texTriangleZ;
        modelData.faceSkins = this.faceSkins;
        modelData.verticesX = this.verticesX;
        modelData.vertexLabels = this.vertexLabels;
        modelData.faceLabelsAlpha = this.faceLabelsAlpha;
        modelData.vertexNormals = this.vertexNormals;
        modelData.faceNormals = this.faceNormals;
        modelData.ambient = this.ambient;
        modelData.contrast = this.contrast;
        return modelData;
    }
    
    public static void xr(final ModelData modelData, final byte[] array) {
        if (modelData == null) {
            modelData.aq();
        }
        boolean b = false;
        int n = 0;
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        buffer.offset = (array.length - 23) * 1897443165;
        final int unsignedShort = buffer.readUnsignedShort(-1298125413);
        final int unsignedShort2 = buffer.readUnsignedShort(-1436601832);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-22964750);
        final int unsignedShort4 = buffer.readUnsignedShort(-814173962);
        buffer.readUnsignedShort(-1118491014);
        final int unsignedShort5 = buffer.readUnsignedShort(-995172451);
        final int unsignedShort6 = buffer.readUnsignedShort(-676449922);
        final int n5;
        final int n4;
        final int n3;
        int n2 = n3 = (n4 = (n5 = 0) + unsignedShort) + unsignedShort2;
        if (ra3 == 892724674) {
            n2 += unsignedShort2;
        }
        final int n6 = n2;
        if (ra5 == 1) {
            n2 += unsignedShort2;
        }
        final int n7 = n2;
        if (ra2 == 1) {
            n2 += unsignedShort2;
        }
        final int n8 = n2;
        final int n10;
        int n9 = n10 = n2 + unsignedShort6;
        if (ra4 == 1) {
            n9 += unsignedShort2;
        }
        final int n11 = n9;
        final int n16;
        final int n15;
        final int n14;
        final int n13;
        final int n12 = (n13 = (n14 = (n15 = (n16 = n9 + unsignedShort5) + unsignedShort2 * 2) + ra * 6) + unsignedShort3) + unsignedShort4;
        modelData.verticesCount = unsignedShort;
        modelData.faceCount = unsignedShort2;
        modelData.textureTriangleCount = ra;
        modelData.indices2 = new int[unsignedShort];
        modelData.indices3 = new int[unsignedShort];
        modelData.indices1 = new int[unsignedShort];
        modelData.verticesY = new int[unsignedShort2];
        modelData.verticesZ = new int[unsignedShort2];
        modelData.vertexSkins = new int[unsignedShort2];
        if (ra > 0) {
            modelData.textureRenderTypes = new byte[ra];
            modelData.texTriangleX = new short[ra];
            modelData.texTriangleY = new short[ra];
            modelData.texTriangleZ = new short[ra];
        }
        if (ra6 == 1) {
            modelData.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            modelData.faceRenderTypes = new byte[unsignedShort2];
            modelData.textureCoords = new byte[unsignedShort2];
            modelData.faceTextures = new short[unsignedShort2];
        }
        if (ra3 == 255) {
            modelData.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            modelData.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            modelData.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            modelData.verticesX = new int[unsignedShort2];
        }
        if (ra7 == 1) {
            modelData.field1899 = new int[unsignedShort][];
            modelData.field1924 = new int[unsignedShort][];
        }
        modelData.faceColors = new short[unsignedShort2];
        buffer.offset = n5 * -1516355947;
        buffer2.offset = n14 * 1842304720;
        buffer3.offset = n13 * -1516355947;
        buffer4.offset = n12 * -1516355947;
        buffer5.offset = n8 * 200795025;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(2086691887);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1612194925);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(2067540771);
            }
            modelData.indices2[i] = n17 + shortSmart;
            modelData.indices3[i] = n18 + shortSmart2;
            modelData.indices1[i] = n19 + shortSmart3;
            n17 = modelData.indices2[i];
            n18 = modelData.indices3[i];
            n19 = modelData.indices1[i];
            if (ra6 == 1) {
                modelData.faceSkins[i] = Buffer.ra(buffer5, (byte)7);
            }
        }
        if (ra7 == 1) {
            for (int j = 0; j < unsignedShort; ++j) {
                final int ra9 = Buffer.ra(buffer5, (byte)7);
                modelData.field1899[j] = new int[ra9];
                modelData.field1924[j] = new int[ra9];
                for (int k = 0; k < ra9; ++k) {
                    modelData.field1899[j][k] = Buffer.ra(buffer5, (byte)7);
                    modelData.field1924[j][k] = Buffer.ra(buffer5, (byte)7);
                }
            }
        }
        buffer.offset = n16 * -1516355947;
        buffer2.offset = n7 * -1516355947;
        buffer3.offset = n3 * 1918413665;
        buffer4.offset = n10 * -933177784;
        buffer5.offset = n6 * 1688810135;
        for (int l = 0; l < unsignedShort2; ++l) {
            modelData.faceColors[l] = (short)buffer.readUnsignedShort(-148732184);
            if (ra2 == 1) {
                final int ra10 = Buffer.ra(buffer2, (byte)7);
                if ((ra10 & 0x1) == 0x1) {
                    modelData.faceRenderTypes[l] = 1;
                    b = true;
                }
                else {
                    modelData.faceRenderTypes[l] = 0;
                }
                if ((ra10 & 0x2) == 0x2) {
                    modelData.textureCoords[l] = (byte)(ra10 >> 2);
                    modelData.faceTextures[l] = modelData.faceColors[l];
                    modelData.faceColors[l] = (short)(-600675011);
                    if (modelData.faceTextures[l] != -1) {
                        n = 1;
                    }
                }
                else {
                    modelData.textureCoords[l] = -1;
                    modelData.faceTextures[l] = -1;
                }
            }
            if (ra3 == -1756734811) {
                modelData.faceRenderPriorities[l] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                modelData.faceAlphas[l] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                modelData.verticesX[l] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n11 * 1292971777;
        buffer2.offset = n4 * -1516355947;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        int n23 = 0;
        for (int n24 = 0; n24 < unsignedShort2; ++n24) {
            final int ra11 = Buffer.ra(buffer2, (byte)7);
            if (ra11 == 1) {
                n20 = buffer.readShortSmart(1790113606) + n23;
                n21 = buffer.readShortSmart(1972592742) + n20;
                n22 = (n23 = buffer.readShortSmart(1870286293) + n21);
                modelData.verticesY[n24] = n20;
                modelData.verticesZ[n24] = n21;
                modelData.vertexSkins[n24] = n22;
            }
            if (ra11 == 2) {
                n21 = n22;
                n22 = (n23 += buffer.readShortSmart(1852961566));
                modelData.verticesY[n24] = n20;
                modelData.verticesZ[n24] = n21;
                modelData.vertexSkins[n24] = n22;
            }
            if (ra11 == 3) {
                n20 = n22;
                n22 = (n23 += buffer.readShortSmart(2134788758));
                modelData.verticesY[n24] = n20;
                modelData.verticesZ[n24] = n21;
                modelData.vertexSkins[n24] = n22;
            }
            if (ra11 == 4) {
                final int n25 = n20;
                n20 = n21;
                n21 = n25;
                n22 = (n23 += buffer.readShortSmart(1913336868));
                modelData.verticesY[n24] = n20;
                modelData.verticesZ[n24] = n21;
                modelData.vertexSkins[n24] = n22;
            }
        }
        buffer.offset = n15 * -622675180;
        for (int n26 = 0; n26 < ra; ++n26) {
            modelData.textureRenderTypes[n26] = 0;
            modelData.texTriangleX[n26] = (short)buffer.readUnsignedShort(157433969);
            modelData.texTriangleY[n26] = (short)buffer.readUnsignedShort(-1767623883);
            modelData.texTriangleZ[n26] = (short)buffer.readUnsignedShort(-824226202);
        }
        if (modelData.textureCoords != null) {
            boolean b2 = false;
            for (int n27 = 0; n27 < unsignedShort2; ++n27) {
                final int n28 = modelData.textureCoords[n27] & 0xFF;
                if (n28 != 1939300498) {
                    if ((modelData.texTriangleX[n28] & 0xEBE3FF9B) == modelData.verticesY[n27] && (modelData.texTriangleY[n28] & 0xFFFF) == modelData.verticesZ[n27] && (modelData.texTriangleZ[n28] & 0xF2F0669E) == modelData.vertexSkins[n27]) {
                        modelData.textureCoords[n27] = -1;
                    }
                    else {
                        b2 = true;
                    }
                }
            }
            if (!b2) {
                modelData.textureCoords = null;
            }
        }
        if (n == 0) {
            modelData.faceTextures = null;
        }
        if (!b) {
            modelData.faceRenderTypes = null;
        }
    }
    
    void bu(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        final Buffer buffer2 = new Buffer(array);
        final Buffer buffer3 = new Buffer(array);
        final Buffer buffer4 = new Buffer(array);
        final Buffer buffer5 = new Buffer(array);
        final Buffer buffer6 = new Buffer(array);
        final Buffer buffer7 = new Buffer(array);
        buffer.offset = (array.length - 23) * -1881752330;
        final int unsignedShort = buffer.readUnsignedShort(877646025);
        final int unsignedShort2 = buffer.readUnsignedShort(-1382833117);
        final int ra = Buffer.ra(buffer, (byte)7);
        final int ra2 = Buffer.ra(buffer, (byte)7);
        final int ra3 = Buffer.ra(buffer, (byte)7);
        final int ra4 = Buffer.ra(buffer, (byte)7);
        final int ra5 = Buffer.ra(buffer, (byte)7);
        final int ra6 = Buffer.ra(buffer, (byte)7);
        final int ra7 = Buffer.ra(buffer, (byte)7);
        final int unsignedShort3 = buffer.readUnsignedShort(-514482367);
        final int unsignedShort4 = buffer.readUnsignedShort(378033897);
        final int unsignedShort5 = buffer.readUnsignedShort(-452823571);
        final int unsignedShort6 = buffer.readUnsignedShort(-1860409626);
        final int unsignedShort7 = buffer.readUnsignedShort(26826262);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (ra > 0) {
            this.textureRenderTypes = new byte[ra];
            buffer.offset = 0;
            for (int i = 0; i < ra; ++i) {
                final byte[] textureRenderTypes = this.textureRenderTypes;
                final int n4 = i;
                final byte wu = Buffer.wu(buffer, 435772489);
                textureRenderTypes[n4] = wu;
                final byte b = wu;
                if (b == 0) {
                    ++n;
                }
                if (b >= 1 && b <= 3) {
                    ++n2;
                }
                if (b == 2) {
                    ++n3;
                }
            }
        }
        final int n7;
        final int n6;
        int n5 = n6 = (n7 = ra) + unsignedShort;
        if (ra2 == 1) {
            n5 += unsignedShort2;
        }
        final int n8 = n5;
        final int n10;
        int n9 = n10 = n5 + unsignedShort2;
        if (ra3 == 679788973) {
            n9 += unsignedShort2;
        }
        final int n11 = n9;
        if (ra5 == 1) {
            n9 += unsignedShort2;
        }
        final int n12 = n9;
        if (ra7 == 1) {
            n9 += unsignedShort;
        }
        final int n13 = n9;
        if (ra4 == 1) {
            n9 += unsignedShort2;
        }
        final int n14 = n9;
        final int n16;
        int n15 = n16 = n9 + unsignedShort6;
        if (ra6 == 1) {
            n15 += unsignedShort2 * 2;
        }
        final int n17 = n15;
        final int n28;
        final int n27;
        final int n26;
        final int n25;
        final int n24;
        final int n23;
        final int n22;
        final int n21;
        final int n20;
        final int n19;
        final int n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = n15 + unsignedShort7) + unsignedShort2 * 2) + unsignedShort3) + unsignedShort4) + unsignedShort5) + n * 6) + n2 * 6) + n2 * 6) + n2 * 2) + n2) + (n2 * 2 + n3 * 2);
        this.verticesCount = unsignedShort;
        this.faceCount = unsignedShort2;
        this.textureTriangleCount = ra;
        this.indices2 = new int[unsignedShort];
        this.indices3 = new int[unsignedShort];
        this.indices1 = new int[unsignedShort];
        this.verticesY = new int[unsignedShort2];
        this.verticesZ = new int[unsignedShort2];
        this.vertexSkins = new int[unsignedShort2];
        if (ra7 == 1) {
            this.faceSkins = new int[unsignedShort];
        }
        if (ra2 == 1) {
            this.faceRenderTypes = new byte[unsignedShort2];
        }
        if (ra3 == 255) {
            this.faceRenderPriorities = new byte[unsignedShort2];
        }
        else {
            this.priority = (byte)ra3;
        }
        if (ra4 == 1) {
            this.faceAlphas = new byte[unsignedShort2];
        }
        if (ra5 == 1) {
            this.verticesX = new int[unsignedShort2];
        }
        if (ra6 == 1) {
            this.faceTextures = new short[unsignedShort2];
        }
        if (ra6 == 1 && ra > 0) {
            this.textureCoords = new byte[unsignedShort2];
        }
        this.faceColors = new short[unsignedShort2];
        if (ra > 0) {
            this.texTriangleX = new short[ra];
            this.texTriangleY = new short[ra];
            this.texTriangleZ = new short[ra];
        }
        buffer.offset = n7 * -172971331;
        buffer2.offset = n27 * -35623277;
        buffer3.offset = n26 * -1516355947;
        buffer4.offset = n25 * -1958171409;
        buffer5.offset = n12 * -959047756;
        int n29 = 0;
        int n30 = 0;
        int n31 = 0;
        for (int j = 0; j < unsignedShort; ++j) {
            final int ra8 = Buffer.ra(buffer, (byte)7);
            int shortSmart = 0;
            if ((ra8 & 0x1) != 0x0) {
                shortSmart = buffer2.readShortSmart(1147458043);
            }
            int shortSmart2 = 0;
            if ((ra8 & 0x2) != 0x0) {
                shortSmart2 = buffer3.readShortSmart(1215634204);
            }
            int shortSmart3 = 0;
            if ((ra8 & 0x4) != 0x0) {
                shortSmart3 = buffer4.readShortSmart(1115920956);
            }
            this.indices2[j] = n29 + shortSmart;
            this.indices3[j] = n30 + shortSmart2;
            this.indices1[j] = n31 + shortSmart3;
            n29 = this.indices2[j];
            n30 = this.indices3[j];
            n31 = this.indices1[j];
            if (ra7 == 1) {
                this.faceSkins[j] = Buffer.ra(buffer5, (byte)7);
            }
        }
        buffer.offset = n28 * -1516355947;
        buffer2.offset = n6 * -1516355947;
        buffer3.offset = n10 * -1516355947;
        buffer4.offset = n13 * -1516355947;
        buffer5.offset = n11 * 949914880;
        buffer6.offset = n16 * 702585222;
        buffer7.offset = n17 * -1516355947;
        for (int k = 0; k < unsignedShort2; ++k) {
            this.faceColors[k] = (short)buffer.readUnsignedShort(324474659);
            if (ra2 == 1) {
                this.faceRenderTypes[k] = Buffer.wu(buffer2, 435772489);
            }
            if (ra3 == 255) {
                this.faceRenderPriorities[k] = Buffer.wu(buffer3, 435772489);
            }
            if (ra4 == 1) {
                this.faceAlphas[k] = Buffer.wu(buffer4, 435772489);
            }
            if (ra5 == 1) {
                this.verticesX[k] = Buffer.ra(buffer5, (byte)7);
            }
            if (ra6 == 1) {
                this.faceTextures[k] = (short)(buffer6.readUnsignedShort(615848648) - 1);
            }
            if (this.textureCoords != null && this.faceTextures[k] != -1) {
                this.textureCoords[k] = (byte)(Buffer.ra(buffer7, (byte)7) - 1);
            }
        }
        buffer.offset = n14 * -714773712;
        buffer2.offset = n8 * -1516355947;
        int n32 = 0;
        int n33 = 0;
        int n34 = 0;
        int n35 = 0;
        for (int l = 0; l < unsignedShort2; ++l) {
            final int ra9 = Buffer.ra(buffer2, (byte)7);
            if (ra9 == 1) {
                n32 = buffer.readShortSmart(1837054225) + n35;
                n33 = buffer.readShortSmart(1113772602) + n32;
                n34 = (n35 = buffer.readShortSmart(1254946264) + n33);
                this.verticesY[l] = n32;
                this.verticesZ[l] = n33;
                this.vertexSkins[l] = n34;
            }
            if (ra9 == 2) {
                n33 = n34;
                n34 = (n35 += buffer.readShortSmart(2146343938));
                this.verticesY[l] = n32;
                this.verticesZ[l] = n33;
                this.vertexSkins[l] = n34;
            }
            if (ra9 == 3) {
                n32 = n34;
                n34 = (n35 += buffer.readShortSmart(2009171629));
                this.verticesY[l] = n32;
                this.verticesZ[l] = n33;
                this.vertexSkins[l] = n34;
            }
            if (ra9 == 4) {
                final int n36 = n32;
                n32 = n33;
                n33 = n36;
                n34 = (n35 += buffer.readShortSmart(1620572083));
                this.verticesY[l] = n32;
                this.verticesZ[l] = n33;
                this.vertexSkins[l] = n34;
            }
        }
        buffer.offset = n24 * -1516355947;
        buffer2.offset = n23 * -1516355947;
        buffer3.offset = n22 * 1298691582;
        buffer4.offset = n21 * -1516355947;
        buffer5.offset = n20 * -1516355947;
        buffer6.offset = n19 * -1516355947;
        for (int n37 = 0; n37 < ra; ++n37) {
            if ((this.textureRenderTypes[n37] & 0xFF) == 0x0) {
                this.texTriangleX[n37] = (short)buffer.readUnsignedShort(680363229);
                this.texTriangleY[n37] = (short)buffer.readUnsignedShort(-395853234);
                this.texTriangleZ[n37] = (short)buffer.readUnsignedShort(-956434090);
            }
        }
        buffer.offset = n18 * -1516355947;
        if (Buffer.ra(buffer, (byte)7) != 0) {
            new ModelData0();
            buffer.readUnsignedShort(-1931916400);
            buffer.readUnsignedShort(-543930985);
            buffer.readUnsignedShort(612411741);
            buffer.readInt(-1791881492);
        }
    }
    
    static final int du(final int n, int n2) {
        n2 = n2 * (n & 0xF1B82A8C) >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    public static void jb(final ModelData modelData, final int n, final int n2, final int n3) {
        if (modelData == null) {
            modelData.cx(n, n, n);
            return;
        }
        for (int i = 0; i < modelData.verticesCount; ++i) {
            final int[] indices2 = modelData.indices2;
            final int n4 = i;
            indices2[n4] += n;
            final int[] indices3 = modelData.indices3;
            final int n5 = i;
            indices3[n5] += n2;
            final int[] indices4 = modelData.indices1;
            final int n6 = i;
            indices4[n6] += n3;
        }
        modelData.ci();
    }
    
    public ModelData pj() {
        this.method1189();
        return this;
    }
    
    public int getFaceCount() {
        return this.faceCount;
    }
    
    public int[] getVerticesY() {
        return this.indices3;
    }
    
    public int[] getVerticesX() {
        return this.indices2;
    }
    
    public int[] getFaceIndices1() {
        return this.verticesY;
    }
    
    public int[] getFaceIndices3() {
        return this.vertexSkins;
    }
    
    public int getVerticesCount() {
        return this.verticesCount;
    }
    
    public int[] getVerticesZ() {
        return this.indices1;
    }
    
    public int[] getFaceIndices2() {
        return this.verticesZ;
    }
    
    public short[] getFaceTextures() {
        return this.faceTextures;
    }
    
    public short[] getFaceColors() {
        return this.faceColors;
    }
    
    public byte[] getFaceTransparencies() {
        return this.faceAlphas;
    }
}
