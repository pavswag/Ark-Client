package com.client;

import com.client.js5.Js5List;
import net.runelite.api.ModelData;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSModelData;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSVertexNormal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mesh extends Renderable implements RSModelData {

    static int[] field2399 = new int[10000];

    static int[] field2427 = new int[10000];

    static int field2428 = 0;

    static int[] ModelData_sine;

    static int[] ModelData_cosine;

    int verticesCount = 0;

    int[] verticesX;

    int[] verticesY;

    int[] verticesZ;

    int faceCount = 0;

    int[] indices1;

    int[] indices2;

    int[] indices3;

    byte[] faceRenderTypes;

    byte[] faceRenderPriorities;

    byte[] faceAlphas;

    byte[] textureCoords;

    short[] faceColors;

    short[] faceTextures;

    byte priority = 0;

    int textureTriangleCount;

    byte[] textureRenderTypes;

    short[] texTriangleX;

    short[] texTriangleY;

    short[] texTriangleZ;

    int[] vertexSkins;

    int[] faceSkins;

    int[][] vertexLabels;

    int[][] faceLabelsAlpha;

    int[][] field2413;

    int[][] field2414;

    FaceNormal[] faceNormals;

    VertexNormal[] vertexNormals;

    VertexNormal[] vertexVertices;

    public short ambient;

    public short contrast;

    boolean isBoundsCalculated = false;

    int field2401;

    int field2422;
    int field2423;
    int field2424;
    int field2425;

    static {
        ModelData_sine = Rasterizer3D.SINE;
        ModelData_cosine = Rasterizer3D.COSINE;
    }

    public Mesh(Mesh[] var1, int var2) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.verticesCount = 0;
        this.faceCount = 0;
        this.textureTriangleCount = 0;
        this.priority = -1;

        int var10;
        Mesh var11;
        for(var10 = 0; var10 < var2; ++var10) {
            var11 = var1[var10];
            if (var11 != null) {
                this.verticesCount += var11.verticesCount;
                this.faceCount += var11.faceCount;
                this.textureTriangleCount += var11.textureTriangleCount;
                if (var11.faceRenderPriorities != null) {
                    var4 = true;
                } else {
                    if (this.priority == -1) {
                        this.priority = var11.priority;
                    }

                    if (this.priority != var11.priority) {
                        var4 = true;
                    }
                }

                var3 |= var11.faceRenderTypes != null;
                var5 |= var11.faceAlphas != null;
                var6 |= var11.faceSkins != null;
                var7 |= var11.faceTextures != null;
                var8 |= var11.textureCoords != null;
                var9 |= var11.field2413 != null;
            }
        }

        this.verticesX = new int[this.verticesCount];
        this.verticesY = new int[this.verticesCount];
        this.verticesZ = new int[this.verticesCount];
        this.vertexSkins = new int[this.verticesCount];
        this.indices1 = new int[this.faceCount];
        this.indices2 = new int[this.faceCount];
        this.indices3 = new int[this.faceCount];
        if (var3) {
            this.faceRenderTypes = new byte[this.faceCount];
        }

        if (var4) {
            this.faceRenderPriorities = new byte[this.faceCount];
        }

        if (var5) {
            this.faceAlphas = new byte[this.faceCount];
        }

        if (var6) {
            this.faceSkins = new int[this.faceCount];
        }

        if (var7) {
            this.faceTextures = new short[this.faceCount];
        }

        if (var8) {
            this.textureCoords = new byte[this.faceCount];
        }

        if (var9) {
            this.field2413 = new int[this.verticesCount][];
            this.field2414 = new int[this.verticesCount][];
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

        for(var10 = 0; var10 < var2; ++var10) {
            var11 = var1[var10];
            if (var11 != null) {
                int var12;
                for(var12 = 0; var12 < var11.faceCount; ++var12) {
                    if (var3 && var11.faceRenderTypes != null) {
                        this.faceRenderTypes[this.faceCount] = var11.faceRenderTypes[var12];
                    }

                    if (var4) {
                        if (var11.faceRenderPriorities != null) {
                            this.faceRenderPriorities[this.faceCount] = var11.faceRenderPriorities[var12];
                        } else {
                            this.faceRenderPriorities[this.faceCount] = var11.priority;
                        }
                    }

                    if (var5 && var11.faceAlphas != null) {
                        this.faceAlphas[this.faceCount] = var11.faceAlphas[var12];
                    }

                    if (var6 && var11.faceSkins != null) {
                        this.faceSkins[this.faceCount] = var11.faceSkins[var12];
                    }

                    if (var7) {
                        if (var11.faceTextures != null) {
                            this.faceTextures[this.faceCount] = var11.faceTextures[var12];
                        } else {
                            this.faceTextures[this.faceCount] = -1;
                        }
                    }

                    if (var8) {
                        if (var11.textureCoords != null && var11.textureCoords[var12] != -1) {
                            this.textureCoords[this.faceCount] = (byte)(this.textureTriangleCount + var11.textureCoords[var12]);
                        } else {
                            this.textureCoords[this.faceCount] = -1;
                        }
                    }

                    this.faceColors[this.faceCount] = var11.faceColors[var12];
                    this.indices1[this.faceCount] = this.method4258(var11, var11.indices1[var12]);
                    this.indices2[this.faceCount] = this.method4258(var11, var11.indices2[var12]);
                    this.indices3[this.faceCount] = this.method4258(var11, var11.indices3[var12]);
                    ++this.faceCount;
                }

                for(var12 = 0; var12 < var11.textureTriangleCount; ++var12) {
                    byte var13 = this.textureRenderTypes[this.textureTriangleCount] = var11.textureRenderTypes[var12];
                    if (var13 == 0) {
                        this.texTriangleX[this.textureTriangleCount] = (short)this.method4258(var11, var11.texTriangleX[var12]);
                        this.texTriangleY[this.textureTriangleCount] = (short)this.method4258(var11, var11.texTriangleY[var12]);
                        this.texTriangleZ[this.textureTriangleCount] = (short)this.method4258(var11, var11.texTriangleZ[var12]);
                    }

                    ++this.textureTriangleCount;
                }
            }
        }
    }

    Mesh(byte[] var1) {

        Buffer var2 = new Buffer(10);
        var2.writeShort(-2);
        if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
            this.method4233(var1);
        } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
            this.method4231(var1);
        } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
            this.method4235(var1);
        } else {
            this.method4236(var1);
        }

    }

    public Mesh(Mesh var1, boolean var2, boolean var3, boolean var4, boolean var5) {
        this.verticesCount = var1.verticesCount;
        this.faceCount = var1.faceCount;
        this.textureTriangleCount = var1.textureTriangleCount;
        int var6;
        if (var2) {
            this.verticesX = var1.verticesX;
            this.verticesY = var1.verticesY;
            this.verticesZ = var1.verticesZ;
        } else {
            this.verticesX = new int[this.verticesCount];
            this.verticesY = new int[this.verticesCount];
            this.verticesZ = new int[this.verticesCount];

            for(var6 = 0; var6 < this.verticesCount; ++var6) {
                this.verticesX[var6] = var1.verticesX[var6];
                this.verticesY[var6] = var1.verticesY[var6];
                this.verticesZ[var6] = var1.verticesZ[var6];
            }
        }

        if (var3) {
            this.faceColors = var1.faceColors;
        } else {
            this.faceColors = new short[this.faceCount];

            for(var6 = 0; var6 < this.faceCount; ++var6) {
                this.faceColors[var6] = var1.faceColors[var6];
            }
        }

        if (!var4 && var1.faceTextures != null) {
            this.faceTextures = new short[this.faceCount];

            for(var6 = 0; var6 < this.faceCount; ++var6) {
                this.faceTextures[var6] = var1.faceTextures[var6];
            }
        } else {
            this.faceTextures = var1.faceTextures;
        }

        this.faceAlphas = var1.faceAlphas;
        this.indices1 = var1.indices1;
        this.indices2 = var1.indices2;
        this.indices3 = var1.indices3;
        this.faceRenderTypes = var1.faceRenderTypes;
        this.faceRenderPriorities = var1.faceRenderPriorities;
        this.textureCoords = var1.textureCoords;
        this.priority = var1.priority;
        this.textureRenderTypes = var1.textureRenderTypes;
        this.texTriangleX = var1.texTriangleX;
        this.texTriangleY = var1.texTriangleY;
        this.texTriangleZ = var1.texTriangleZ;
        this.vertexSkins = var1.vertexSkins;
        this.faceSkins = var1.faceSkins;
        this.vertexLabels = var1.vertexLabels;
        this.faceLabelsAlpha = var1.faceLabelsAlpha;
        this.vertexNormals = var1.vertexNormals;
        this.faceNormals = var1.faceNormals;
        this.vertexVertices = var1.vertexVertices;
        this.field2413 = var1.field2413;
        this.field2414 = var1.field2414;
        this.ambient = var1.ambient;
        this.contrast = var1.contrast;
    }

    void method4233(byte[] var1) {
        Buffer var2 = new Buffer(var1);
        Buffer var3 = new Buffer(var1);
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var2.pos = var1.length - 26;
        int var9 = var2.readUShort();
        int var10 = var2.readUShort();
        int var11 = var2.readUnsignedByte();
        int var12 = var2.readUnsignedByte();
        int var13 = var2.readUnsignedByte();
        int var14 = var2.readUnsignedByte();
        int var15 = var2.readUnsignedByte();
        int var16 = var2.readUnsignedByte();
        int var17 = var2.readUnsignedByte();
        int var18 = var2.readUnsignedByte();
        int var19 = var2.readUShort();
        int var20 = var2.readUShort();
        int var21 = var2.readUShort();
        int var22 = var2.readUShort();
        int var23 = var2.readUShort();
        int var24 = var2.readUShort();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28;
        if (var11 > 0) {
            this.textureRenderTypes = new byte[var11];
            var2.pos = 0;

            for(var28 = 0; var28 < var11; ++var28) {
                byte var29 = this.textureRenderTypes[var28] = var2.readSignedByte();
                if (var29 == 0) {
                    ++var25;
                }

                if (var29 >= 1 && var29 <= 3) {
                    ++var26;
                }

                if (var29 == 2) {
                    ++var27;
                }
            }
        }

        var28 = var11 + var9;
        int var30 = var28;
        if (var12 == 1) {
            var28 += var10;
        }

        int var31 = var28;
        var28 += var10;
        int var32 = var28;
        if (var13 == 255) {
            var28 += var10;
        }

        int var33 = var28;
        if (var15 == 1) {
            var28 += var10;
        }

        int var34 = var28;
        var28 += var24;
        int var35 = var28;
        if (var14 == 1) {
            var28 += var10;
        }

        int var36 = var28;
        var28 += var22;
        int var37 = var28;
        if (var16 == 1) {
            var28 += var10 * 2;
        }

        int var38 = var28;
        var28 += var23;
        int var39 = var28;
        var28 += var10 * 2;
        int var40 = var28;
        var28 += var19;
        int var41 = var28;
        var28 += var20;
        int var42 = var28;
        var28 += var21;
        int var43 = var28;
        var28 += var25 * 6;
        int var44 = var28;
        var28 += var26 * 6;
        int var45 = var28;
        var28 += var26 * 6;
        int var46 = var28;
        var28 += var26 * 2;
        int var47 = var28;
        var28 += var26;
        int var48 = var28;
        var28 += var26 * 2 + var27 * 2;
        this.verticesCount = var9;
        this.faceCount = var10;
        this.textureTriangleCount = var11;
        this.verticesX = new int[var9];
        this.verticesY = new int[var9];
        this.verticesZ = new int[var9];
        this.indices1 = new int[var10];
        this.indices2 = new int[var10];
        this.indices3 = new int[var10];
        if (var17 == 1) {
            this.vertexSkins = new int[var9];
        }

        if (var12 == 1) {
            this.faceRenderTypes = new byte[var10];
        }

        if (var13 == 255) {
            this.faceRenderPriorities = new byte[var10];
        } else {
            this.priority = (byte)var13;
        }

        if (var14 == 1) {
            this.faceAlphas = new byte[var10];
        }

        if (var15 == 1) {
            this.faceSkins = new int[var10];
        }

        if (var16 == 1) {
            this.faceTextures = new short[var10];
        }

        if (var16 == 1 && var11 > 0) {
            this.textureCoords = new byte[var10];
        }

        if (var18 == 1) {
            this.field2413 = new int[var9][];
            this.field2414 = new int[var9][];
        }

        this.faceColors = new short[var10];
        if (var11 > 0) {
            this.texTriangleX = new short[var11];
            this.texTriangleY = new short[var11];
            this.texTriangleZ = new short[var11];
        }

        var2.pos = var11;
        var3.pos = var40;
        var4.pos = var41;
        var5.pos = var42;
        var6.pos = var34;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;

        int var53;
        int var54;
        int var55;
        int var56;
        int var57;
        for(var53 = 0; var53 < var9; ++var53) {
            var54 = var2.readUnsignedByte();
            var55 = 0;
            if ((var54 & 1) != 0) {
                var55 = var3.readShortSmart();
            }

            var56 = 0;
            if ((var54 & 2) != 0) {
                var56 = var4.readShortSmart();
            }

            var57 = 0;
            if ((var54 & 4) != 0) {
                var57 = var5.readShortSmart();
            }

            this.verticesX[var53] = var50 + var55;
            this.verticesY[var53] = var51 + var56;
            this.verticesZ[var53] = var52 + var57;
            var50 = this.verticesX[var53];
            var51 = this.verticesY[var53];
            var52 = this.verticesZ[var53];
            if (var17 == 1) {
                this.vertexSkins[var53] = var6.readUnsignedByte();
            }
        }

        if (var18 == 1) {
            for(var53 = 0; var53 < var9; ++var53) {
                var54 = var6.readUnsignedByte();
                this.field2413[var53] = new int[var54];
                this.field2414[var53] = new int[var54];

                for(var55 = 0; var55 < var54; ++var55) {
                    this.field2413[var53][var55] = var6.readUnsignedByte();
                    this.field2414[var53][var55] = var6.readUnsignedByte();
                }
            }
        }

        var2.pos = var39;
        var3.pos = var30;
        var4.pos = var32;
        var5.pos = var35;
        var6.pos = var33;
        var7.pos = var37;
        var8.pos = var38;

        for(var53 = 0; var53 < var10; ++var53) {
            this.faceColors[var53] = (short)var2.readUShort();
            if (var12 == 1) {
                this.faceRenderTypes[var53] = var3.readSignedByte();
            }

            if (var13 == 255) {
                this.faceRenderPriorities[var53] = var4.readSignedByte();
            }

            if (var14 == 1) {
                this.faceAlphas[var53] = var5.readSignedByte();
            }

            if (var15 == 1) {
                this.faceSkins[var53] = var6.readUnsignedByte();
            }

            if (var16 == 1) {
                this.faceTextures[var53] = (short)(var7.readUShort() - 1);
            }

            if (this.textureCoords != null && this.faceTextures[var53] != -1) {
                this.textureCoords[var53] = (byte)(var8.readUnsignedByte() - 1);
            }
        }

        var2.pos = var36;
        var3.pos = var31;
        var53 = 0;
        var54 = 0;
        var55 = 0;
        var56 = 0;

        int var58;
        for(var57 = 0; var57 < var10; ++var57) {
            var58 = var3.readUnsignedByte();
            if (var58 == 1) {
                var53 = var2.readShortSmart() + var56;
                var54 = var2.readShortSmart() + var53;
                var55 = var2.readShortSmart() + var54;
                var56 = var55;
                this.indices1[var57] = var53;
                this.indices2[var57] = var54;
                this.indices3[var57] = var55;
            }

            if (var58 == 2) {
                var54 = var55;
                var55 = var2.readShortSmart() + var56;
                var56 = var55;
                this.indices1[var57] = var53;
                this.indices2[var57] = var54;
                this.indices3[var57] = var55;
            }

            if (var58 == 3) {
                var53 = var55;
                var55 = var2.readShortSmart() + var56;
                var56 = var55;
                this.indices1[var57] = var53;
                this.indices2[var57] = var54;
                this.indices3[var57] = var55;
            }

            if (var58 == 4) {
                int var59 = var53;
                var53 = var54;
                var54 = var59;
                var55 = var2.readShortSmart() + var56;
                var56 = var55;
                this.indices1[var57] = var53;
                this.indices2[var57] = var59;
                this.indices3[var57] = var55;
            }
        }

        var2.pos = var43;
        var3.pos = var44;
        var4.pos = var45;
        var5.pos = var46;
        var6.pos = var47;
        var7.pos = var48;

        for(var57 = 0; var57 < var11; ++var57) {
            var58 = this.textureRenderTypes[var57] & 255;
            if (var58 == 0) {
                this.texTriangleX[var57] = (short)var2.readUShort();
                this.texTriangleY[var57] = (short)var2.readUShort();
                this.texTriangleZ[var57] = (short)var2.readUShort();
            }
        }

        var2.pos = var28;
        var57 = var2.readUnsignedByte();
        if (var57 != 0) {
            var2.readUShort();
            var2.readUShort();
            var2.readUShort();
            var2.readInt();
        }

    }

    void method4231(byte[] var1) {
        boolean var2 = false;
        boolean var3 = false;
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var4.pos = var1.length - 23;
        int var9 = var4.readUShort();
        int var10 = var4.readUShort();
        int var11 = var4.readUnsignedByte();
        int var12 = var4.readUnsignedByte();
        int var13 = var4.readUnsignedByte();
        int var14 = var4.readUnsignedByte();
        int var15 = var4.readUnsignedByte();
        int var16 = var4.readUnsignedByte();
        int var17 = var4.readUnsignedByte();
        int var18 = var4.readUShort();
        int var19 = var4.readUShort();
        int var20 = var4.readUShort();
        int var21 = var4.readUShort();
        int var22 = var4.readUShort();
        int var23 = 0;
        byte var24 = (byte)var23;
        var23 += var9;
        int var25 = var23;
        var23 += var10;
        int var26 = var23;
        if (var13 == 255) {
            var23 += var10;
        }

        int var27 = var23;
        if (var15 == 1) {
            var23 += var10;
        }

        int var28 = var23;
        if (var12 == 1) {
            var23 += var10;
        }

        int var29 = var23;
        var23 += var22;
        int var30 = var23;
        if (var14 == 1) {
            var23 += var10;
        }

        int var31 = var23;
        var23 += var21;
        int var32 = var23;
        var23 += var10 * 2;
        int var33 = var23;
        var23 += var11 * 6;
        int var34 = var23;
        var23 += var18;
        int var35 = var23;
        var23 += var19;
        int var10000 = var23 + var20;
        this.verticesCount = var9;
        this.faceCount = var10;
        this.textureTriangleCount = var11;
        this.verticesX = new int[var9];
        this.verticesY = new int[var9];
        this.verticesZ = new int[var9];
        this.indices1 = new int[var10];
        this.indices2 = new int[var10];
        this.indices3 = new int[var10];
        if (var11 > 0) {
            this.textureRenderTypes = new byte[var11];
            this.texTriangleX = new short[var11];
            this.texTriangleY = new short[var11];
            this.texTriangleZ = new short[var11];
        }

        if (var16 == 1) {
            this.vertexSkins = new int[var9];
        }

        if (var12 == 1) {
            this.faceRenderTypes = new byte[var10];
            this.textureCoords = new byte[var10];
            this.faceTextures = new short[var10];
        }

        if (var13 == 255) {
            this.faceRenderPriorities = new byte[var10];
        } else {
            this.priority = (byte)var13;
        }

        if (var14 == 1) {
            this.faceAlphas = new byte[var10];
        }

        if (var15 == 1) {
            this.faceSkins = new int[var10];
        }

        if (var17 == 1) {
            this.field2413 = new int[var9][];
            this.field2414 = new int[var9][];
        }

        this.faceColors = new short[var10];
        var4.pos = var24;
        var5.pos = var34;
        var6.pos = var35;
        var7.pos = var23;
        var8.pos = var29;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;

        int var40;
        int var41;
        int var42;
        int var43;
        int var44;
        for(var40 = 0; var40 < var9; ++var40) {
            var41 = var4.readUnsignedByte();
            var42 = 0;
            if ((var41 & 1) != 0) {
                var42 = var5.readShortSmart();
            }

            var43 = 0;
            if ((var41 & 2) != 0) {
                var43 = var6.readShortSmart();
            }

            var44 = 0;
            if ((var41 & 4) != 0) {
                var44 = var7.readShortSmart();
            }

            this.verticesX[var40] = var37 + var42;
            this.verticesY[var40] = var38 + var43;
            this.verticesZ[var40] = var39 + var44;
            var37 = this.verticesX[var40];
            var38 = this.verticesY[var40];
            var39 = this.verticesZ[var40];
            if (var16 == 1) {
                this.vertexSkins[var40] = var8.readUnsignedByte();
            }
        }

        if (var17 == 1) {
            for(var40 = 0; var40 < var9; ++var40) {
                var41 = var8.readUnsignedByte();
                this.field2413[var40] = new int[var41];
                this.field2414[var40] = new int[var41];

                for(var42 = 0; var42 < var41; ++var42) {
                    this.field2413[var40][var42] = var8.readUnsignedByte();
                    this.field2414[var40][var42] = var8.readUnsignedByte();
                }
            }
        }

        var4.pos = var32;
        var5.pos = var28;
        var6.pos = var26;
        var7.pos = var30;
        var8.pos = var27;

        for(var40 = 0; var40 < var10; ++var40) {
            this.faceColors[var40] = (short)var4.readUShort();
            if (var12 == 1) {
                var41 = var5.readUnsignedByte();
                if ((var41 & 1) == 1) {
                    this.faceRenderTypes[var40] = 1;
                    var2 = true;
                } else {
                    this.faceRenderTypes[var40] = 0;
                }

                if ((var41 & 2) == 2) {
                    this.textureCoords[var40] = (byte)(var41 >> 2);
                    this.faceTextures[var40] = this.faceColors[var40];
                    this.faceColors[var40] = 127;
                    if (this.faceTextures[var40] != -1) {
                        var3 = true;
                    }
                } else {
                    this.textureCoords[var40] = -1;
                    this.faceTextures[var40] = -1;
                }
            }

            if (var13 == 255) {
                this.faceRenderPriorities[var40] = var6.readSignedByte();
            }

            if (var14 == 1) {
                this.faceAlphas[var40] = var7.readSignedByte();
            }

            if (var15 == 1) {
                this.faceSkins[var40] = var8.readUnsignedByte();
            }
        }

        var4.pos = var31;
        var5.pos = var25;
        var40 = 0;
        var41 = 0;
        var42 = 0;
        var43 = 0;

        int var45;
        int var46;
        for(var44 = 0; var44 < var10; ++var44) {
            var45 = var5.readUnsignedByte();
            if (var45 == 1) {
                var40 = var4.readShortSmart() + var43;
                var41 = var4.readShortSmart() + var40;
                var42 = var4.readShortSmart() + var41;
                var43 = var42;
                this.indices1[var44] = var40;
                this.indices2[var44] = var41;
                this.indices3[var44] = var42;
            }

            if (var45 == 2) {
                var41 = var42;
                var42 = var4.readShortSmart() + var43;
                var43 = var42;
                this.indices1[var44] = var40;
                this.indices2[var44] = var41;
                this.indices3[var44] = var42;
            }

            if (var45 == 3) {
                var40 = var42;
                var42 = var4.readShortSmart() + var43;
                var43 = var42;
                this.indices1[var44] = var40;
                this.indices2[var44] = var41;
                this.indices3[var44] = var42;
            }

            if (var45 == 4) {
                var46 = var40;
                var40 = var41;
                var41 = var46;
                var42 = var4.readShortSmart() + var43;
                var43 = var42;
                this.indices1[var44] = var40;
                this.indices2[var44] = var46;
                this.indices3[var44] = var42;
            }
        }

        var4.pos = var33;

        for(var44 = 0; var44 < var11; ++var44) {
            this.textureRenderTypes[var44] = 0;
            this.texTriangleX[var44] = (short)var4.readUShort();
            this.texTriangleY[var44] = (short)var4.readUShort();
            this.texTriangleZ[var44] = (short)var4.readUShort();
        }

        if (this.textureCoords != null) {
            boolean var47 = false;

            for(var45 = 0; var45 < var10; ++var45) {
                var46 = this.textureCoords[var45] & 255;
                if (var46 != 255) {
                    if (this.indices1[var45] == (this.texTriangleX[var46] & '\uffff') && this.indices2[var45] == (this.texTriangleY[var46] & '\uffff') && this.indices3[var45] == (this.texTriangleZ[var46] & '\uffff')) {
                        this.textureCoords[var45] = -1;
                    } else {
                        var47 = true;
                    }
                }
            }

            if (!var47) {
                this.textureCoords = null;
            }
        }

        if (!var3) {
            this.faceTextures = null;
        }

        if (!var2) {
            this.faceRenderTypes = null;
        }

    }

    void method4235(byte[] var1) {
        Buffer var2 = new Buffer(var1);
        Buffer var3 = new Buffer(var1);
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var2.pos = var1.length - 23;
        int var9 = var2.readUShort();
        int var10 = var2.readUShort();
        int var11 = var2.readUnsignedByte();
        int var12 = var2.readUnsignedByte();
        int var13 = var2.readUnsignedByte();
        int var14 = var2.readUnsignedByte();
        int var15 = var2.readUnsignedByte();
        int var16 = var2.readUnsignedByte();
        int var17 = var2.readUnsignedByte();
        int var18 = var2.readUShort();
        int var19 = var2.readUShort();
        int var20 = var2.readUShort();
        int var21 = var2.readUShort();
        int var22 = var2.readUShort();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26;
        if (var11 > 0) {
            this.textureRenderTypes = new byte[var11];
            var2.pos = 0;

            for(var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.textureRenderTypes[var26] = var2.readSignedByte();
                if (var27 == 0) {
                    ++var23;
                }

                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }

                if (var27 == 2) {
                    ++var25;
                }
            }
        }

        var26 = var11 + var9;
        int var28 = var26;
        if (var12 == 1) {
            var26 += var10;
        }

        int var29 = var26;
        var26 += var10;
        int var30 = var26;
        if (var13 == 255) {
            var26 += var10;
        }

        int var31 = var26;
        if (var15 == 1) {
            var26 += var10;
        }

        int var32 = var26;
        if (var17 == 1) {
            var26 += var9;
        }

        int var33 = var26;
        if (var14 == 1) {
            var26 += var10;
        }

        int var34 = var26;
        var26 += var21;
        int var35 = var26;
        if (var16 == 1) {
            var26 += var10 * 2;
        }

        int var36 = var26;
        var26 += var22;
        int var37 = var26;
        var26 += var10 * 2;
        int var38 = var26;
        var26 += var18;
        int var39 = var26;
        var26 += var19;
        int var40 = var26;
        var26 += var20;
        int var41 = var26;
        var26 += var23 * 6;
        int var42 = var26;
        var26 += var24 * 6;
        int var43 = var26;
        var26 += var24 * 6;
        int var44 = var26;
        var26 += var24 * 2;
        int var45 = var26;
        var26 += var24;
        int var46 = var26;
        var26 += var24 * 2 + var25 * 2;
        this.verticesCount = var9;
        this.faceCount = var10;
        this.textureTriangleCount = var11;
        this.verticesX = new int[var9];
        this.verticesY = new int[var9];
        this.verticesZ = new int[var9];
        this.indices1 = new int[var10];
        this.indices2 = new int[var10];
        this.indices3 = new int[var10];
        if (var17 == 1) {
            this.vertexSkins = new int[var9];
        }

        if (var12 == 1) {
            this.faceRenderTypes = new byte[var10];
        }

        if (var13 == 255) {
            this.faceRenderPriorities = new byte[var10];
        } else {
            this.priority = (byte)var13;
        }

        if (var14 == 1) {
            this.faceAlphas = new byte[var10];
        }

        if (var15 == 1) {
            this.faceSkins = new int[var10];
        }

        if (var16 == 1) {
            this.faceTextures = new short[var10];
        }

        if (var16 == 1 && var11 > 0) {
            this.textureCoords = new byte[var10];
        }

        this.faceColors = new short[var10];
        if (var11 > 0) {
            this.texTriangleX = new short[var11];
            this.texTriangleY = new short[var11];
            this.texTriangleZ = new short[var11];
        }

        var2.pos = var11;
        var3.pos = var38;
        var4.pos = var39;
        var5.pos = var40;
        var6.pos = var32;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;

        int var51;
        int var52;
        int var53;
        int var54;
        int var55;
        for(var51 = 0; var51 < var9; ++var51) {
            var52 = var2.readUnsignedByte();
            var53 = 0;
            if ((var52 & 1) != 0) {
                var53 = var3.readShortSmart();
            }

            var54 = 0;
            if ((var52 & 2) != 0) {
                var54 = var4.readShortSmart();
            }

            var55 = 0;
            if ((var52 & 4) != 0) {
                var55 = var5.readShortSmart();
            }

            this.verticesX[var51] = var48 + var53;
            this.verticesY[var51] = var49 + var54;
            this.verticesZ[var51] = var50 + var55;
            var48 = this.verticesX[var51];
            var49 = this.verticesY[var51];
            var50 = this.verticesZ[var51];
            if (var17 == 1) {
                this.vertexSkins[var51] = var6.readUnsignedByte();
            }
        }

        var2.pos = var37;
        var3.pos = var28;
        var4.pos = var30;
        var5.pos = var33;
        var6.pos = var31;
        var7.pos = var35;
        var8.pos = var36;

        for(var51 = 0; var51 < var10; ++var51) {
            this.faceColors[var51] = (short)var2.readUShort();
            if (var12 == 1) {
                this.faceRenderTypes[var51] = var3.readSignedByte();
            }

            if (var13 == 255) {
                this.faceRenderPriorities[var51] = var4.readSignedByte();
            }

            if (var14 == 1) {
                this.faceAlphas[var51] = var5.readSignedByte();
            }

            if (var15 == 1) {
                this.faceSkins[var51] = var6.readUnsignedByte();
            }

            if (var16 == 1) {
                this.faceTextures[var51] = (short)(var7.readUShort() - 1);
            }

            if (this.textureCoords != null && this.faceTextures[var51] != -1) {
                this.textureCoords[var51] = (byte)(var8.readUnsignedByte() - 1);
            }
        }

        var2.pos = var34;
        var3.pos = var29;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        var54 = 0;

        int var56;
        for(var55 = 0; var55 < var10; ++var55) {
            var56 = var3.readUnsignedByte();
            if (var56 == 1) {
                var51 = var2.readShortSmart() + var54;
                var52 = var2.readShortSmart() + var51;
                var53 = var2.readShortSmart() + var52;
                var54 = var53;
                this.indices1[var55] = var51;
                this.indices2[var55] = var52;
                this.indices3[var55] = var53;
            }

            if (var56 == 2) {
                var52 = var53;
                var53 = var2.readShortSmart() + var54;
                var54 = var53;
                this.indices1[var55] = var51;
                this.indices2[var55] = var52;
                this.indices3[var55] = var53;
            }

            if (var56 == 3) {
                var51 = var53;
                var53 = var2.readShortSmart() + var54;
                var54 = var53;
                this.indices1[var55] = var51;
                this.indices2[var55] = var52;
                this.indices3[var55] = var53;
            }

            if (var56 == 4) {
                int var57 = var51;
                var51 = var52;
                var52 = var57;
                var53 = var2.readShortSmart() + var54;
                var54 = var53;
                this.indices1[var55] = var51;
                this.indices2[var55] = var57;
                this.indices3[var55] = var53;
            }
        }

        var2.pos = var41;
        var3.pos = var42;
        var4.pos = var43;
        var5.pos = var44;
        var6.pos = var45;
        var7.pos = var46;

        for(var55 = 0; var55 < var11; ++var55) {
            var56 = this.textureRenderTypes[var55] & 255;
            if (var56 == 0) {
                this.texTriangleX[var55] = (short)var2.readUShort();
                this.texTriangleY[var55] = (short)var2.readUShort();
                this.texTriangleZ[var55] = (short)var2.readUShort();
            }
        }

        var2.pos = var26;
        var55 = var2.readUnsignedByte();
        if (var55 != 0) {
            var2.readUShort();
            var2.readUShort();
            var2.readUShort();
            var2.readInt();
        }

    }

    void method4236(byte[] var1) {
        boolean var2 = false;
        boolean var3 = false;
        Buffer var4 = new Buffer(var1);
        Buffer var5 = new Buffer(var1);
        Buffer var6 = new Buffer(var1);
        Buffer var7 = new Buffer(var1);
        Buffer var8 = new Buffer(var1);
        var4.pos = var1.length - 18;
        int var9 = var4.readUShort();
        int var10 = var4.readUShort();
        int var11 = var4.readUnsignedByte();
        int var12 = var4.readUnsignedByte();
        int var13 = var4.readUnsignedByte();
        int var14 = var4.readUnsignedByte();
        int var15 = var4.readUnsignedByte();
        int var16 = var4.readUnsignedByte();
        int var17 = var4.readUShort();
        int var18 = var4.readUShort();
        int var19 = var4.readUShort();
        int var20 = var4.readUShort();
        int var21 = 0;
        byte var22 = (byte)var21;
        var21 += var9;
        int var23 = var21;
        var21 += var10;
        int var24 = var21;
        if (var13 == 255) {
            var21 += var10;
        }

        int var25 = var21;
        if (var15 == 1) {
            var21 += var10;
        }

        int var26 = var21;
        if (var12 == 1) {
            var21 += var10;
        }

        int var27 = var21;
        if (var16 == 1) {
            var21 += var9;
        }

        int var28 = var21;
        if (var14 == 1) {
            var21 += var10;
        }

        int var29 = var21;
        var21 += var20;
        int var30 = var21;
        var21 += var10 * 2;
        int var31 = var21;
        var21 += var11 * 6;
        int var32 = var21;
        var21 += var17;
        int var33 = var21;
        var21 += var18;
        int var10000 = var21 + var19;
        this.verticesCount = var9;
        this.faceCount = var10;
        this.textureTriangleCount = var11;
        this.verticesX = new int[var9];
        this.verticesY = new int[var9];
        this.verticesZ = new int[var9];
        this.indices1 = new int[var10];
        this.indices2 = new int[var10];
        this.indices3 = new int[var10];
        if (var11 > 0) {
            this.textureRenderTypes = new byte[var11];
            this.texTriangleX = new short[var11];
            this.texTriangleY = new short[var11];
            this.texTriangleZ = new short[var11];
        }

        if (var16 == 1) {
            this.vertexSkins = new int[var9];
        }

        if (var12 == 1) {
            this.faceRenderTypes = new byte[var10];
            this.textureCoords = new byte[var10];
            this.faceTextures = new short[var10];
        }

        if (var13 == 255) {
            this.faceRenderPriorities = new byte[var10];
        } else {
            this.priority = (byte)var13;
        }

        if (var14 == 1) {
            this.faceAlphas = new byte[var10];
        }

        if (var15 == 1) {
            this.faceSkins = new int[var10];
        }

        this.faceColors = new short[var10];
        var4.pos = var22;
        var5.pos = var32;
        var6.pos = var33;
        var7.pos = var21;
        var8.pos = var27;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;

        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        for(var38 = 0; var38 < var9; ++var38) {
            var39 = var4.readUnsignedByte();
            var40 = 0;
            if ((var39 & 1) != 0) {
                var40 = var5.readShortSmart();
            }

            var41 = 0;
            if ((var39 & 2) != 0) {
                var41 = var6.readShortSmart();
            }

            var42 = 0;
            if ((var39 & 4) != 0) {
                var42 = var7.readShortSmart();
            }

            this.verticesX[var38] = var35 + var40;
            this.verticesY[var38] = var36 + var41;
            this.verticesZ[var38] = var37 + var42;
            var35 = this.verticesX[var38];
            var36 = this.verticesY[var38];
            var37 = this.verticesZ[var38];
            if (var16 == 1) {
                this.vertexSkins[var38] = var8.readUnsignedByte();
            }
        }

        var4.pos = var30;
        var5.pos = var26;
        var6.pos = var24;
        var7.pos = var28;
        var8.pos = var25;

        for(var38 = 0; var38 < var10; ++var38) {
            this.faceColors[var38] = (short)var4.readUShort();
            if (var12 == 1) {
                var39 = var5.readUnsignedByte();
                if ((var39 & 1) == 1) {
                    this.faceRenderTypes[var38] = 1;
                    var2 = true;
                } else {
                    this.faceRenderTypes[var38] = 0;
                }

                if ((var39 & 2) == 2) {
                    this.textureCoords[var38] = (byte)(var39 >> 2);
                    this.faceTextures[var38] = this.faceColors[var38];
                    this.faceColors[var38] = 127;
                    if (this.faceTextures[var38] != -1) {
                        var3 = true;
                    }
                } else {
                    this.textureCoords[var38] = -1;
                    this.faceTextures[var38] = -1;
                }
            }

            if (var13 == 255) {
                this.faceRenderPriorities[var38] = var6.readSignedByte();
            }

            if (var14 == 1) {
                this.faceAlphas[var38] = var7.readSignedByte();
            }

            if (var15 == 1) {
                this.faceSkins[var38] = var8.readUnsignedByte();
            }
        }

        var4.pos = var29;
        var5.pos = var23;
        var38 = 0;
        var39 = 0;
        var40 = 0;
        var41 = 0;

        int var43;
        int var44;
        for(var42 = 0; var42 < var10; ++var42) {
            var43 = var5.readUnsignedByte();
            if (var43 == 1) {
                var38 = var4.readShortSmart() + var41;
                var39 = var4.readShortSmart() + var38;
                var40 = var4.readShortSmart() + var39;
                var41 = var40;
                this.indices1[var42] = var38;
                this.indices2[var42] = var39;
                this.indices3[var42] = var40;
            }

            if (var43 == 2) {
                var39 = var40;
                var40 = var4.readShortSmart() + var41;
                var41 = var40;
                this.indices1[var42] = var38;
                this.indices2[var42] = var39;
                this.indices3[var42] = var40;
            }

            if (var43 == 3) {
                var38 = var40;
                var40 = var4.readShortSmart() + var41;
                var41 = var40;
                this.indices1[var42] = var38;
                this.indices2[var42] = var39;
                this.indices3[var42] = var40;
            }

            if (var43 == 4) {
                var44 = var38;
                var38 = var39;
                var39 = var44;
                var40 = var4.readShortSmart() + var41;
                var41 = var40;
                this.indices1[var42] = var38;
                this.indices2[var42] = var44;
                this.indices3[var42] = var40;
            }
        }

        var4.pos = var31;

        for(var42 = 0; var42 < var11; ++var42) {
            this.textureRenderTypes[var42] = 0;
            this.texTriangleX[var42] = (short)var4.readUShort();
            this.texTriangleY[var42] = (short)var4.readUShort();
            this.texTriangleZ[var42] = (short)var4.readUShort();
        }

        if (this.textureCoords != null) {
            boolean var45 = false;

            for(var43 = 0; var43 < var10; ++var43) {
                var44 = this.textureCoords[var43] & 255;
                if (var44 != 255) {
                    if (this.indices1[var43] == (this.texTriangleX[var44] & '\uffff') && this.indices2[var43] == (this.texTriangleY[var44] & '\uffff') && this.indices3[var43] == (this.texTriangleZ[var44] & '\uffff')) {
                        this.textureCoords[var43] = -1;
                    } else {
                        var45 = true;
                    }
                }
            }

            if (!var45) {
                this.textureCoords = null;
            }
        }

        if (!var3) {
            this.faceTextures = null;
        }

        if (!var2) {
            this.faceRenderTypes = null;
        }

    }

    final int method4258(Mesh var1, int var2) {
        int var3 = -1;
        int var4 = var1.verticesX[var2];
        int var5 = var1.verticesY[var2];
        int var6 = var1.verticesZ[var2];

        for(int var7 = 0; var7 < this.verticesCount; ++var7) {
            if (var4 == this.verticesX[var7] && var5 == this.verticesY[var7] && var6 == this.verticesZ[var7]) {
                var3 = var7;
                break;
            }
        }

        if (var3 == -1) {
            this.verticesX[this.verticesCount] = var4;
            this.verticesY[this.verticesCount] = var5;
            this.verticesZ[this.verticesCount] = var6;
            if (var1.vertexSkins != null) {
                this.vertexSkins[this.verticesCount] = var1.vertexSkins[var2];
            }

            if (var1.field2413 != null) {
                this.field2413[this.verticesCount] = var1.field2413[var2];
                this.field2414[this.verticesCount] = var1.field2414[var2];
            }

            var3 = this.verticesCount++;
        }

        return var3;
    }

    Mesh() {}

    public Mesh copyModelData() {
        Mesh var1 = new Mesh();
        if (this.faceRenderTypes != null) {
            var1.faceRenderTypes = new byte[this.faceCount];

            for(int var2 = 0; var2 < this.faceCount; ++var2) {
                var1.faceRenderTypes[var2] = this.faceRenderTypes[var2];
            }
        }

        var1.verticesCount = this.verticesCount;
        var1.faceCount = this.faceCount;
        var1.textureTriangleCount = this.textureTriangleCount;
        var1.verticesX = this.verticesX;
        var1.verticesY = this.verticesY;
        var1.verticesZ = this.verticesZ;
        var1.indices1 = this.indices1;
        var1.indices2 = this.indices2;
        var1.indices3 = this.indices3;
        var1.faceRenderPriorities = this.faceRenderPriorities;
        var1.faceAlphas = this.faceAlphas;
        var1.textureCoords = this.textureCoords;
        var1.faceColors = this.faceColors;
        var1.faceTextures = this.faceTextures;
        var1.priority = this.priority;
        var1.textureRenderTypes = this.textureRenderTypes;
        var1.texTriangleX = this.texTriangleX;
        var1.texTriangleY = this.texTriangleY;
        var1.texTriangleZ = this.texTriangleZ;
        var1.vertexSkins = this.vertexSkins;
        var1.faceSkins = this.faceSkins;
        var1.vertexLabels = this.vertexLabels;
        var1.faceLabelsAlpha = this.faceLabelsAlpha;
        var1.vertexNormals = this.vertexNormals;
        var1.faceNormals = this.faceNormals;
        var1.ambient = this.ambient;
        var1.contrast = this.contrast;
        return var1;
    }

    public Mesh method4239(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
        this.calculateBounds();
        int var7 = var2 + this.field2422;
        int var8 = var2 + this.field2423;
        int var9 = var4 + this.field2425;
        int var10 = var4 + this.field2424;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
                return this;
            } else {
                Mesh var11 = new Mesh();
                var11.verticesCount = this.verticesCount;
                var11.faceCount = this.faceCount;
                var11.textureTriangleCount = this.textureTriangleCount;
                var11.verticesX = this.verticesX;
                var11.verticesZ = this.verticesZ;
                var11.indices1 = this.indices1;
                var11.indices2 = this.indices2;
                var11.indices3 = this.indices3;
                var11.faceRenderTypes = this.faceRenderTypes;
                var11.faceRenderPriorities = this.faceRenderPriorities;
                var11.faceAlphas = this.faceAlphas;
                var11.textureCoords = this.textureCoords;
                var11.faceColors = this.faceColors;
                var11.faceTextures = this.faceTextures;
                var11.priority = this.priority;
                var11.textureRenderTypes = this.textureRenderTypes;
                var11.texTriangleX = this.texTriangleX;
                var11.texTriangleY = this.texTriangleY;
                var11.texTriangleZ = this.texTriangleZ;
                var11.vertexSkins = this.vertexSkins;
                var11.faceSkins = this.faceSkins;
                var11.vertexLabels = this.vertexLabels;
                var11.faceLabelsAlpha = this.faceLabelsAlpha;
                var11.ambient = this.ambient;
                var11.contrast = this.contrast;
                var11.verticesY = new int[var11.verticesCount];
                int var12;
                int var13;
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                int var19;
                int var20;
                int var21;
                if (var6 == 0) {
                    for(var12 = 0; var12 < var11.verticesCount; ++var12) {
                        var13 = var2 + this.verticesX[var12];
                        var14 = var4 + this.verticesZ[var12];
                        var15 = var13 & 127;
                        var16 = var14 & 127;
                        var17 = var13 >> 7;
                        var18 = var14 >> 7;
                        var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                        var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                        var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                        var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
                    }
                } else {
                    for(var12 = 0; var12 < var11.verticesCount; ++var12) {
                        var13 = (-this.verticesY[var12] << 16) / super.modelBaseY;
                        if (var13 < var6) {
                            var14 = var2 + this.verticesX[var12];
                            var15 = var4 + this.verticesZ[var12];
                            var16 = var14 & 127;
                            var17 = var15 & 127;
                            var18 = var14 >> 7;
                            var19 = var15 >> 7;
                            var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                            var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                            int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                            var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12];
                        }
                    }
                }

                var11.invalidate();
                return var11;
            }
        } else {
            return this;
        }
    }

    void method4240() {
        int[] var1;
        int var2;
        int var10002;
        int var3;
        int var4;
        if (this.vertexSkins != null) {
            var1 = new int[256];
            var2 = 0;

            for(var3 = 0; var3 < this.verticesCount; ++var3) {
                var4 = this.vertexSkins[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.vertexLabels = new int[var2 + 1][];

            for(var3 = 0; var3 <= var2; ++var3) {
                this.vertexLabels[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for(var3 = 0; var3 < this.verticesCount; this.vertexLabels[var4][var1[var4]++] = var3++) {
                var4 = this.vertexSkins[var3];
            }

            this.vertexSkins = null;
        }

        if (this.faceSkins != null) {
            var1 = new int[256];
            var2 = 0;

            for(var3 = 0; var3 < this.faceCount; ++var3) {
                var4 = this.faceSkins[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }

            this.faceLabelsAlpha = new int[var2 + 1][];

            for(var3 = 0; var3 <= var2; ++var3) {
                this.faceLabelsAlpha[var3] = new int[var1[var3]];
                var1[var3] = 0;
            }

            for(var3 = 0; var3 < this.faceCount; this.faceLabelsAlpha[var4][var1[var4]++] = var3++) {
                var4 = this.faceSkins[var3];
            }

            this.faceSkins = null;
        }

    }

    public void method4281() {
        for(int var1 = 0; var1 < this.verticesCount; ++var1) {
            int var2 = this.verticesX[var1];
            this.verticesX[var1] = this.verticesZ[var1];
            this.verticesZ[var1] = -var2;
        }

        this.invalidate();
    }

    public void method4242() {
        for(int var1 = 0; var1 < this.verticesCount; ++var1) {
            this.verticesX[var1] = -this.verticesX[var1];
            this.verticesZ[var1] = -this.verticesZ[var1];
        }

        this.invalidate();
    }

    public void method4243() {
        for(int var1 = 0; var1 < this.verticesCount; ++var1) {
            int var2 = this.verticesZ[var1];
            this.verticesZ[var1] = this.verticesX[var1];
            this.verticesX[var1] = -var2;
        }

        this.invalidate();
    }

    public void method4244(int var1) {
        int var2 = ModelData_sine[var1];
        int var3 = ModelData_cosine[var1];

        for(int var4 = 0; var4 < this.verticesCount; ++var4) {
            int var5 = var2 * this.verticesZ[var4] + var3 * this.verticesX[var4] >> 16;
            this.verticesZ[var4] = var3 * this.verticesZ[var4] - var2 * this.verticesX[var4] >> 16;
            this.verticesX[var4] = var5;
        }

        this.invalidate();
    }

    public void changeOffset(int var1, int var2, int var3) {
        for(int var4 = 0; var4 < this.verticesCount; ++var4) {
            int[] var10000 = this.verticesX;
            var10000[var4] += var1;
            var10000 = this.verticesY;
            var10000[var4] += var2;
            var10000 = this.verticesZ;
            var10000[var4] += var3;
        }

        this.invalidate();
    }

    public RSModelData retexture(short var1, short var2) {

        return this;
    }

    public void method4306() {
        int var1;
        for(var1 = 0; var1 < this.verticesCount; ++var1) {
            this.verticesZ[var1] = -this.verticesZ[var1];
        }

        for(var1 = 0; var1 < this.faceCount; ++var1) {
            int var2 = this.indices1[var1];
            this.indices1[var1] = this.indices3[var1];
            this.indices3[var1] = var2;
        }

        this.invalidate();
    }

    public void resize(int var1, int var2, int var3) {
        for(int var4 = 0; var4 < this.verticesCount; ++var4) {
            this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
            this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
            this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
        }

        this.invalidate();
    }

    public void calculateVertexNormals() {
        if (this.vertexNormals == null) {
            this.vertexNormals = new VertexNormal[this.verticesCount];

            int var1;
            for(var1 = 0; var1 < this.verticesCount; ++var1) {
                this.vertexNormals[var1] = new VertexNormal();
            }

            for(var1 = 0; var1 < this.faceCount; ++var1) {
                int var2 = this.indices1[var1];
                int var3 = this.indices2[var1];
                int var4 = this.indices3[var1];
                int var5 = this.verticesX[var3] - this.verticesX[var2];
                int var6 = this.verticesY[var3] - this.verticesY[var2];
                int var7 = this.verticesZ[var3] - this.verticesZ[var2];
                int var8 = this.verticesX[var4] - this.verticesX[var2];
                int var9 = this.verticesY[var4] - this.verticesY[var2];
                int var10 = this.verticesZ[var4] - this.verticesZ[var2];
                int var11 = var6 * var10 - var9 * var7;
                int var12 = var7 * var8 - var10 * var5;

                int var13;
                for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
                    var11 >>= 1;
                    var12 >>= 1;
                }

                int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
                if (var14 <= 0) {
                    var14 = 1;
                }

                var11 = var11 * 256 / var14;
                var12 = var12 * 256 / var14;
                var13 = var13 * 256 / var14;
                byte var15;
                if (this.faceRenderTypes == null) {
                    var15 = 0;
                } else {
                    var15 = this.faceRenderTypes[var1];
                }

                if (var15 == 0) {
                    VertexNormal var16 = this.vertexNormals[var2];
                    var16.x += var11;
                    var16.y += var12;
                    var16.z += var13;
                    ++var16.magnitude;
                    var16 = this.vertexNormals[var3];
                    var16.x += var11;
                    var16.y += var12;
                    var16.z += var13;
                    ++var16.magnitude;
                    var16 = this.vertexNormals[var4];
                    var16.x += var11;
                    var16.y += var12;
                    var16.z += var13;
                    ++var16.magnitude;
                } else if (var15 == 1) {
                    if (this.faceNormals == null) {
                        this.faceNormals = new FaceNormal[this.faceCount];
                    }

                    FaceNormal var17 = this.faceNormals[var1] = new FaceNormal();
                    var17.x = var11;
                    var17.y = var12;
                    var17.z = var13;
                }
            }

        }
    }

    public void invalidate() {
        this.vertexNormals = null;
        this.vertexVertices = null;
        this.faceNormals = null;
        this.isBoundsCalculated = false;
    }

    void calculateBounds() {
        if (!this.isBoundsCalculated) {
            super.modelBaseY = 0;
            this.field2401 = 0;
            this.field2422 = 999999;
            this.field2423 = -999999;
            this.field2424 = -99999;
            this.field2425 = 99999;

            for(int var1 = 0; var1 < this.verticesCount; ++var1) {
                int var2 = this.verticesX[var1];
                int var3 = this.verticesY[var1];
                int var4 = this.verticesZ[var1];
                if (var2 < this.field2422) {
                    this.field2422 = var2;
                }

                if (var2 > this.field2423) {
                    this.field2423 = var2;
                }

                if (var4 < this.field2425) {
                    this.field2425 = var4;
                }

                if (var4 > this.field2424) {
                    this.field2424 = var4;
                }

                if (-var3 > super.modelBaseY) {
                    super.modelBaseY = -var3;
                }

                if (var3 > this.field2401) {
                    this.field2401 = var3;
                }
            }

            this.isBoundsCalculated = true;
        }
    }

    public final Model toModel(int var1, int var2, int var3, int var4, int var5) {
        this.calculateVertexNormals();
        int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
        int var7 = var6 * var2 >> 8;
        Model var8 = new Model();
        var8.colorsX = new int[this.faceCount];
        var8.colorsY = new int[this.faceCount];
        var8.colorsZ = new int[this.faceCount];
        if (this.textureTriangleCount > 0 && this.textureCoords != null) {
            int[] var9 = new int[this.textureTriangleCount];

            int var10;
            for(var10 = 0; var10 < this.faceCount; ++var10) {
                if (this.textureCoords[var10] != -1) {
                    ++var9[this.textureCoords[var10] & 255];
                }
            }

            var8.texturesCount = 0;

            for(var10 = 0; var10 < this.textureTriangleCount; ++var10) {
                if (var9[var10] > 0 && this.textureRenderTypes[var10] == 0) {
                    ++var8.texturesCount;
                }
            }

            var8.texturesX = new int[var8.texturesCount];
            var8.texturesY = new int[var8.texturesCount];
            var8.texturesZ = new int[var8.texturesCount];
            var10 = 0;

            int var11;
            for(var11 = 0; var11 < this.textureTriangleCount; ++var11) {
                if (var9[var11] > 0 && this.textureRenderTypes[var11] == 0) {
                    var8.texturesX[var10] = this.texTriangleX[var11] & '\uffff';
                    var8.texturesY[var10] = this.texTriangleY[var11] & '\uffff';
                    var8.texturesZ[var10] = this.texTriangleZ[var11] & '\uffff';
                    var9[var11] = var10++;
                } else {
                    var9[var11] = -1;
                }
            }

            var8.textures = new byte[this.faceCount];

            for(var11 = 0; var11 < this.faceCount; ++var11) {
                if (this.textureCoords[var11] != -1) {
                    var8.textures[var11] = (byte)var9[this.textureCoords[var11] & 255];
                } else {
                    var8.textures[var11] = -1;
                }
            }
        }

        for(int var16 = 0; var16 < this.faceCount; ++var16) {
            byte var17;
            if (this.faceRenderTypes == null) {
                var17 = 0;
            } else {
                var17 = this.faceRenderTypes[var16];
            }

            byte var18;
            if (this.faceAlphas == null) {
                var18 = 0;
            } else {
                var18 = this.faceAlphas[var16];
            }

            short var12;
            if (this.faceTextures == null) {
                var12 = -1;
            } else {
                var12 = this.faceTextures[var16];
            }

            if (var18 == -2) {
                var17 = 3;
            }

            if (var18 == -1) {
                var17 = 2;
            }

            VertexNormal var13;
            int var14;
            FaceNormal var19;
            if (var12 == -1) {
                if (var17 != 0) {
                    if (var17 == 1) {
                        var19 = this.faceNormals[var16];
                        var14 = (var4 * var19.y + var5 * var19.z + var3 * var19.x) / (var7 / 2 + var7) + var1;
                        var8.colorsX[var16] = method4255(this.faceColors[var16] & '\uffff', var14);
                        var8.colorsZ[var16] = -1;
                    } else if (var17 == 3) {
                        var8.colorsX[var16] = 128;
                        var8.colorsZ[var16] = -1;
                    } else {
                        var8.colorsZ[var16] = -2;
                    }
                } else {
                    int var15 = this.faceColors[var16] & '\uffff';
                    if (this.vertexVertices != null && this.vertexVertices[this.indices1[var16]] != null) {
                        var13 = this.vertexVertices[this.indices1[var16]];
                    } else {
                        var13 = this.vertexNormals[this.indices1[var16]];
                    }

                    var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
                    var8.colorsX[var16] = method4255(var15, var14);
                    if (this.vertexVertices != null && this.vertexVertices[this.indices2[var16]] != null) {
                        var13 = this.vertexVertices[this.indices2[var16]];
                    } else {
                        var13 = this.vertexNormals[this.indices2[var16]];
                    }

                    var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
                    var8.colorsY[var16] = method4255(var15, var14);
                    if (this.vertexVertices != null && this.vertexVertices[this.indices3[var16]] != null) {
                        var13 = this.vertexVertices[this.indices3[var16]];
                    } else {
                        var13 = this.vertexNormals[this.indices3[var16]];
                    }

                    var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
                    var8.colorsZ[var16] = method4255(var15, var14);
                }
            } else if (var17 != 0) {
                if (var17 == 1) {
                    var19 = this.faceNormals[var16];
                    var14 = (var4 * var19.y + var5 * var19.z + var3 * var19.x) / (var7 / 2 + var7) + var1;
                    var8.colorsX[var16] = method4266(var14);
                    var8.colorsZ[var16] = -1;
                } else {
                    var8.colorsZ[var16] = -2;
                }
            } else {
                if (this.vertexVertices != null && this.vertexVertices[this.indices1[var16]] != null) {
                    var13 = this.vertexVertices[this.indices1[var16]];
                } else {
                    var13 = this.vertexNormals[this.indices1[var16]];
                }

                var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
                var8.colorsX[var16] = method4266(var14);
                if (this.vertexVertices != null && this.vertexVertices[this.indices2[var16]] != null) {
                    var13 = this.vertexVertices[this.indices2[var16]];
                } else {
                    var13 = this.vertexNormals[this.indices2[var16]];
                }

                var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
                var8.colorsY[var16] = method4266(var14);
                if (this.vertexVertices != null && this.vertexVertices[this.indices3[var16]] != null) {
                    var13 = this.vertexVertices[this.indices3[var16]];
                } else {
                    var13 = this.vertexNormals[this.indices3[var16]];
                }

                var14 = (var4 * var13.y + var5 * var13.z + var3 * var13.x) / (var7 * var13.magnitude) + var1;
                var8.colorsZ[var16] = method4266(var14);
            }
        }

        this.method4240();
        var8.verticesCount = this.verticesCount;
        var8.verticesX = this.verticesX;
        var8.modelParticles = new int[this.verticesCount];
        var8.verticesY = this.verticesY;
        var8.verticesZ = this.verticesZ;
        var8.trianglesCount = this.faceCount;
        var8.trianglesX = this.indices1;
        var8.trianglesY = this.indices2;
        var8.trianglesZ = this.indices3;
        var8.renderPriorities = this.faceRenderPriorities;
        var8.faceTransparencies = this.faceAlphas;
        var8.facePriority = this.priority;
        var8.groupedVertexLabels = this.vertexLabels;
        var8.groupedTriangleLabels = this.faceLabelsAlpha;
        var8.materials = this.faceTextures;
        var8.skeletalBones = this.field2413;
        var8.skeletalScales = this.field2414;
        if ((Client.instance.getGpuFlags() & 4) == 4) {
            vertexNormals();

            var8.vertexNormalsX = this.vertexNormalsX;
            var8.vertexNormalsY = this.vertexNormalsY;
            var8.vertexNormalsZ = this.vertexNormalsZ;
        }

        return var8;
    }

    public static Mesh getModel(int var1) {
        byte[] var3 = Js5List.models.takeFile(var1, 0);
        return var3 == null ? null : new Mesh(var3);
    }

    public static Mesh get(int var1, int var2) {
        byte[] var3 = Js5List.models.takeFile(var1, var2);
        return var3 == null ? null : new Mesh(var3);
    }

    public static void method4253(Mesh var0, Mesh var1, int var2, int var3, int var4, boolean var5) {
        var0.calculateBounds();
        var0.calculateVertexNormals();
        var1.calculateBounds();
        var1.calculateVertexNormals();
        ++field2428;
        int var6 = 0;
        int[] var7 = var1.verticesX;
        int var8 = var1.verticesCount;

        int var9;
        for(var9 = 0; var9 < var0.verticesCount; ++var9) {
            VertexNormal var10 = var0.vertexNormals[var9];
            if (var10.magnitude != 0) {
                int var11 = var0.verticesY[var9] - var3;
                if (var11 <= var1.field2401) {
                    int var12 = var0.verticesX[var9] - var2;
                    if (var12 >= var1.field2422 && var12 <= var1.field2423) {
                        int var13 = var0.verticesZ[var9] - var4;
                        if (var13 >= var1.field2425 && var13 <= var1.field2424) {
                            for(int var14 = 0; var14 < var8; ++var14) {
                                VertexNormal var15 = var1.vertexNormals[var14];
                                if (var12 == var7[var14] && var13 == var1.verticesZ[var14] && var11 == var1.verticesY[var14] && var15.magnitude != 0) {
                                    if (var0.vertexVertices == null) {
                                        var0.vertexVertices = new VertexNormal[var0.verticesCount];
                                    }

                                    if (var1.vertexVertices == null) {
                                        var1.vertexVertices = new VertexNormal[var8];
                                    }

                                    VertexNormal var16 = var0.vertexVertices[var9];
                                    if (var16 == null) {
                                        var16 = var0.vertexVertices[var9] = new VertexNormal(var10);
                                    }

                                    VertexNormal var17 = var1.vertexVertices[var14];
                                    if (var17 == null) {
                                        var17 = var1.vertexVertices[var14] = new VertexNormal(var15);
                                    }

                                    var16.x += var15.x;
                                    var16.y += var15.y;
                                    var16.z += var15.z;
                                    var16.magnitude += var15.magnitude;
                                    var17.x += var10.x;
                                    var17.y += var10.y;
                                    var17.z += var10.z;
                                    var17.magnitude += var10.magnitude;
                                    ++var6;
                                    field2399[var9] = field2428;
                                    field2427[var14] = field2428;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (var6 >= 3 && var5) {
            for(var9 = 0; var9 < var0.faceCount; ++var9) {
                if (field2399[var0.indices1[var9]] == field2428 && field2399[var0.indices2[var9]] == field2428 && field2399[var0.indices3[var9]] == field2428) {
                    if (var0.faceRenderTypes == null) {
                        var0.faceRenderTypes = new byte[var0.faceCount];
                    }

                    var0.faceRenderTypes[var9] = 2;
                }
            }

            for(var9 = 0; var9 < var1.faceCount; ++var9) {
                if (field2428 == field2427[var1.indices1[var9]] && field2428 == field2427[var1.indices2[var9]] && field2428 == field2427[var1.indices3[var9]]) {
                    if (var1.faceRenderTypes == null) {
                        var1.faceRenderTypes = new byte[var1.faceCount];
                    }

                    var1.faceRenderTypes[var9] = 2;
                }
            }

        }
    }

    static final int method4255(int var0, int var1) {
        var1 = (var0 & 127) * var1 >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 'ﾀ') + var1;
    }

    static final int method4266(int var0) {
        if (var0 < 2) {
            var0 = 2;
        } else if (var0 > 126) {
            var0 = 126;
        }

        return var0;
    }

    private int[] vertexNormalsX;

    private int[] vertexNormalsY;

    private int[] vertexNormalsZ;



    public void vertexNormals()
    {
        RSVertexNormal[] vertexNormals = getVertexNormals();
        RSVertexNormal[] vertexVertices = getVertexVertices();

        if (vertexNormals != null && vertexNormalsX == null)
        {
            int verticesCount = getVerticesCount();

            vertexNormalsX = new int[verticesCount];
            vertexNormalsY = new int[verticesCount];
            vertexNormalsZ = new int[verticesCount];

            for (int i = 0; i < verticesCount; ++i)
            {
                RSVertexNormal vertexNormal;

                if (vertexVertices != null && (vertexNormal = vertexVertices[i]) != null)
                {
                    vertexNormalsX[i] = vertexNormal.getX();
                    vertexNormalsY[i] = vertexNormal.getY();
                    vertexNormalsZ[i] = vertexNormal.getZ();
                }
                else if ((vertexNormal = vertexNormals[i]) != null)
                {
                    vertexNormalsX[i] = vertexNormal.getX();
                    vertexNormalsY[i] = vertexNormal.getY();
                    vertexNormalsZ[i] = vertexNormal.getZ();
                }
            }
        }
    }

    @Override
    public short getAmbient() {
        return ambient;
    }

    @Override
    public short getContrast() {
        return contrast;
    }

    @Override
    public RSModelData cloneVertices()
    {
        int[] newVericesX = Arrays.copyOf(this.getVerticesX(), this.getVerticesX().length);
        int[] newVericesY = Arrays.copyOf(this.getVerticesY(), this.getVerticesX().length);
        int[] newVericesZ = Arrays.copyOf(this.getVerticesZ(), this.getVerticesX().length);

        this.setVerticesX(newVericesX);
        this.setVerticesY(newVericesY);
        this.setVerticesZ(newVericesZ);

        return this;
    }

    @Override
    public RSModelData cloneColors()
    {
        short[] newFaceColor = Arrays.copyOf(this.getFaceColors(), this.getFaceColors().length);
        this.setFaceColors(newFaceColor);

        return this;
    }

    @Override
    public RSModelData cloneTextures()
    {
        short[] newFaceColor = Arrays.copyOf(this.getFaceTextures(), this.getFaceTextures().length);
        this.setFaceTextures(newFaceColor);

        return this;
    }

    @Override
    public RSModelData cloneTransparencies()
    {
        byte[] newFaceColor = Arrays.copyOf(this.getFaceTransparencies(), this.getFaceTransparencies().length);
        this.setFaceTransparencies(newFaceColor);

        return this;
    }

    @Override
    public int getFaceCount() {
        return faceCount;
    }

    @Override
    public int[] getFaceIndices1() {
        return indices1;
    }

    @Override
    public int[] getFaceIndices2() {
        return indices2;
    }

    @Override
    public int[] getFaceIndices3() {
        return indices3;
    }

    @Override
    public int[] getVerticesX() {
        return verticesX;
    }

    @Override
    public void setVerticesX(int[] var1) {
        this.verticesX = var1;
    }

    @Override
    public int[] getVerticesY() {
        return verticesY;
    }

    @Override
    public void setVerticesY(int[] var1) {
        this.verticesY = var1;
    }

    @Override
    public int[] getVerticesZ() {
        return verticesZ;
    }

    @Override
    public void setVerticesZ(int[] var1) {
        this.verticesZ = var1;
    }

    @Override
    public short[] getTexTriangleX() {
        return texTriangleX;
    }

    @Override
    public short[] getTexTriangleY() {
        return texTriangleY;
    }

    @Override
    public short[] getTexTriangleZ() {
        return texTriangleZ;
    }

    @Override
    public short[] getFaceTextures() {
        return faceTextures;
    }

    @Override
    public RSModelData rotateY90Ccw() {
        for (int var1 = 0; var1 < this.getVerticesCount(); ++var1)
        {
            int var2 = this.getVerticesX()[var1];
            this.getVerticesX()[var1] = this.getVerticesZ()[var1];
            this.getVerticesZ()[var1] = -var2;
        }

        this.invalidate();

        return this;
    }

    @Override
    public RSModelData rotateY180Ccw() {
        for (int var1 = 0; var1 < this.getVerticesCount(); ++var1)
        {
            this.getVerticesX()[var1] = -this.getVerticesX()[var1];
            this.getVerticesZ()[var1] = -this.getVerticesZ()[var1];
        }

        this.invalidate();

        return this;
    }

    @Override
    public RSModelData rotateY270Ccw() {
        for (int var1 = 0; var1 < this.getVerticesCount(); ++var1)
        {
            int var2 = this.getVerticesZ()[var1];
            this.getVerticesZ()[var1] = this.getVerticesX()[var1];
            this.getVerticesX()[var1] = -var2;
        }

        this.invalidate();

        return this;
    }

    @Override
    public RSModelData translate(int x, int y, int z) {
        for (int i = 0; i < this.getVerticesCount(); ++i)
        {
            int[] vertexX = this.getVerticesX();
            int[] vertexY = this.getVerticesY();
            int[] vertexZ = this.getVerticesZ();

            vertexX[i] += x;
            vertexY[i] += y;
            vertexZ[i] += z;
        }

        this.invalidate();

        return this;
    }

    @Override
    public RSModelData scale(int x, int y, int z) {
        for (int i = 0; i < this.getVerticesCount(); ++i)
        {
            this.getVerticesX()[i] = this.getVerticesX()[i] * x / 128;
            this.getVerticesY()[i] = this.getVerticesY()[i] * y / 128;
            this.getVerticesZ()[i] = this.getVerticesZ()[i] * z / 128;
        }

        this.invalidate();

        return this;
    }

    @Override
    public void setFaceTextures(short[] var1) {
        faceTextures = var1;
    }

    @Override
    public byte[] getFaceTransparencies() {
        return faceAlphas;
    }

    @Override
    public void setFaceTransparencies(byte[] var1) {
        faceAlphas = var1;
    }

    @Override
    public short[] getFaceColors() {
        return faceColors;
    }

    @Override
    public Model light(int ambient, int contrast, int x, int y, int z) {
        return toModel(ambient,contrast,x,y,z);
    }

    @Override
    public Model light() {
        return this.toModel(DEFAULT_AMBIENT, DEFAULT_CONTRAST, DEFAULT_X, DEFAULT_Y, DEFAULT_Z);
    }

    @Override
    public RSModelData recolor(short var1, short var2) {
        rs$recolor(var1,var2);
        return this;

    }


    @Override
    public void setFaceColors(short[] var1) {
        faceColors = var1;
    }

    @Override
    public byte[] getTextureCoords() {
        return textureCoords;
    }

    @Override
    public byte[] getTextureRenderTypes() {
        return textureRenderTypes;
    }



    @Override
    public int getVerticesCount() {
        return verticesCount;
    }

    @Override
    public RSVertexNormal[] getVertexNormals() {
        return vertexNormals;
    }

    @Override
    public RSVertexNormal[] getVertexVertices() {
        return vertexVertices;
    }

    @Override
    public void rs$recolor(short var1, short var2) {
        for(int var3 = 0; var3 < this.faceCount; ++var3) {
            if (this.faceColors[var3] == var1) {
                this.faceColors[var3] = var2;
            }
        }
    }

    @Override
    public void rs$retexture(short var1, short var2) {
        if (this.faceTextures != null) {
            for(int var3 = 0; var3 < this.faceCount; ++var3) {
                if (this.faceTextures[var3] == var1) {
                    this.faceTextures[var3] = var2;
                }
            }
        }
    }

    @Override
    public RSModelData shallowCopy() {
        return copyModelData();
    }

    @Override
    public RSModelData newModelData(ModelData var1, boolean var2, boolean var3, boolean var4, boolean var5) {
        return new Mesh((Mesh) var1,var2,var3,var4,var5);
    }

}