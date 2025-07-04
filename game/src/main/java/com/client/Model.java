package com.client;

import java.awt.Shape;
import java.util.*;

import com.client.definitions.SeqBase;
import com.client.definitions.SequenceDefinition;
import com.client.definitions.SeqFrame;
import com.client.definitions.anims.defs.SeqBaseDefs;
import com.client.definitions.anims.defs.SeqFrameDefs;
import com.client.definitions.skeletal.AB;
import com.client.definitions.skeletal.ABW;
import com.client.definitions.skeletal.SkaFSet;
import com.client.definitions.skeletal.TO;
import com.client.engine.impl.MouseHandler;
import com.client.js5.Js5List;
import com.client.particle.ParticleAttachment;
import com.client.util.math.Matrix4f;
import com.client.utilities.ObjectKeyUtil;
import com.displee.cache.index.Index;
import com.google.common.collect.ImmutableSet;
import net.runelite.api.Perspective;
import net.runelite.api.model.Jarvis;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSModel;

import static net.runelite.api.ObjectID.*;

public class Model extends Renderable implements RSModel {

    public boolean DEBUG_MODELS = false;


    public static void clear() {
        modelHeaders = null;
        hasAnEdgeToRestrict = null;
        outOfReach = null;
        vertexScreenY = null;
        vertexScreenZ = null;
        vertexMovedX = null;
        vertexMovedY = null;
        vertexMovedZ = null;
        depth = null;
        faceLists = null;
        anIntArray1673 = null;
        anIntArrayArray1674 = null;
        anIntArray1675 = null;
        anIntArray1676 = null;
        anIntArray1677 = null;
        SINE = null;
        COSINE = null;
        modelColors = null;
        modelLocations = null;
    }
    public static boolean newmodel[];
    public void scale2(int i) {
        for (int i1 = 0; i1 < verticesCount; i1++) {
            verticesX[i1] = verticesX[i1] / i;
            verticesY[i1] = verticesY[i1] / i;
            verticesZ[i1] = verticesZ[i1] / i;
        }
    }
    public Model(int modelId) {
        if (modelId == 0) {
            return;
        }

        if (modelId == 39284 || modelId == 1295) { // broken models
            return;
        }

        try {
            this.verticesCount = 0;
            this.trianglesCount = 0;
            this.facePriority = 0;
            this.isBoundsCalculated = false;

            byte[] data = modelHeaders[modelId].data;
            if (data[data.length - 1] == -3 && data[data.length - 2] == -1) {
                ModelLoader.decodeType3(this, data);
            } else if (data[data.length - 1] == -2 && data[data.length - 2] == -1) {
                ModelLoader.decodeType2(this, data);
            } else if (data[data.length - 1] == -1 && data[data.length - 2] == -1) {
                ModelLoader.decodeType1(this, data);
            } else {
                ModelLoader.decodeOldFormat(this, data);
            }

            if (newmodel[modelId]) {
                scale2(4);// 2 is too big -- 3 is almost right
                if (renderPriorities != null) {
                    for (int j = 0; j < renderPriorities.length; j++) {
                        renderPriorities[j] = 10;
                    }
                }
            }
            int[][] attachments = ParticleAttachment.getAttachments(modelId);
            if (attachments != null) {
                System.out.println("Found particles for model [" + modelId + "]");
                for (int[] attach : attachments) {
                    if (attach[0] == -1) {
                        for (int z = 0; z < getFaceIndices1().length; ++z) {
                            modelParticles[getFaceIndices1()[z]] = attach[1] + 1;
                        }
                    } else if (attach[0] == -2) {
                        for (int z = 0; z < getFaceIndices2().length; ++z) {
                            modelParticles[getFaceIndices2()[z]] = attach[1] + 1;
                        }
                    } else if (attach[0] == -3) {
                        for (int z = 0; z < getFaceIndices3().length; ++z) {
                            modelParticles[getFaceIndices3()[z]] = attach[1] + 1;
                        }
                    } else if (attach[0] == -4) {
                        for (int z = 0; z < getFaceIndices1().length; ++z) {
                            modelParticles[getFaceIndices1()[z]] = attach[1] + 1;
                        }

                        for (int z = 0; z < getFaceIndices2().length; ++z) {
                            modelParticles[getFaceIndices2()[z]] = attach[1] + 1;
                        }

                        for (int z = 0; z < getFaceIndices3().length; ++z) {
                            modelParticles[getFaceIndices3()[z]] = attach[1] + 1;
                        }
                    } else {
                        modelParticles[attach[0]] = attach[1] + 1;
                        System.out.println("Vert [" + attach[0] + "] = " + (attach[1] + 1));
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error decoding model: " + modelId);
        }
    }

    public static void loadModel(final byte[] modelData, final int modelId) {
        if (modelData == null) {
            final ModelHeader modelHeader = modelHeaders[modelId] = new ModelHeader();
            modelHeader.vertexCount = 0;
            modelHeader.triangleCount = 0;
            modelHeader.texturedTriangleCount = 0;
            return;
        }
        final Buffer stream = new Buffer(modelData);
        stream.pos = modelData.length - 18;
        final ModelHeader modelHeader = modelHeaders[modelId] = new ModelHeader();
        modelHeader.data = modelData;
        modelHeader.vertexCount = stream.readUShort();
        modelHeader.triangleCount = stream.readUShort();
        modelHeader.texturedTriangleCount = stream.readUnsignedByte();
        final int useTextures = stream.readUnsignedByte();
        final int useTrianglePriority = stream.readUnsignedByte();
        final int useAlpha = stream.readUnsignedByte();
        final int useTriangleSkins = stream.readUnsignedByte();
        final int useVertexSkins = stream.readUnsignedByte();
        final int dataLengthX = stream.readUShort();
        final int dataLengthY = stream.readUShort();
        final int dataLengthZ = stream.readUShort();
        final int dataLengthTriangle = stream.readUShort();
        int offset = 0;
        modelHeader.vertexDirectionOffset = offset;
        offset += modelHeader.vertexCount;
        modelHeader.triangleTypeOffset = offset;
        offset += modelHeader.triangleCount;
        modelHeader.trianglePriorityOffset = offset;
        if (useTrianglePriority == 255) {
            offset += modelHeader.triangleCount;
        } else {
            modelHeader.trianglePriorityOffset = -useTrianglePriority - 1;
        }
        modelHeader.triangleSkinOffset = offset;
        if (useTriangleSkins == 1) {
            offset += modelHeader.triangleCount;
        } else {
            modelHeader.triangleSkinOffset = -1;
        }
        modelHeader.texturePointerOffset = offset;
        if (useTextures == 1) {
            offset += modelHeader.triangleCount;
        } else {
            modelHeader.texturePointerOffset = -1;
        }
        modelHeader.vertexSkinOffset = offset;
        if (useVertexSkins == 1) {
            offset += modelHeader.vertexCount;
        } else {
            modelHeader.vertexSkinOffset = -1;
        }
        modelHeader.triangleAlphaOffset = offset;
        if (useAlpha == 1) {
            offset += modelHeader.triangleCount;
        } else {
            modelHeader.triangleAlphaOffset = -1;
        }
        modelHeader.triangleDataOffset = offset;
        offset += dataLengthTriangle;
        modelHeader.colourDataOffset = offset;
        offset += modelHeader.triangleCount * 2;
        modelHeader.texturedTriangleOffset = offset;
        offset += modelHeader.texturedTriangleCount * 6;
        modelHeader.dataOffsetX = offset;
        offset += dataLengthX;
        modelHeader.dataOffsetY = offset;
        offset += dataLengthY;
        modelHeader.dataOffsetZ = offset;
        offset += dataLengthZ;
    }

    public static void init() {
        modelHeaders = new ModelHeader[90000];
        newmodel = new boolean[100000];
    }

    public static void resetModel(final int model) {
        modelHeaders[model] = null;
    }

    public static Model getModel(int file) {
        if (modelHeaders == null) {
            return null;
        }

        ModelHeader header = modelHeaders[file];
        if (header == null) {
            byte[] var3 = Js5List.models.takeFile(file, 0);
            if(var3 != null) {
                loadModel(var3, file);
            }
            return null;
        } else {
            try {
                return new Model(file);
            } catch (Exception e) {
                return null;
            }
        }
    }

    public static boolean isCached(int file) {
        if (modelHeaders == null)
            return false;

        ModelHeader mdl = modelHeaders[file];
        if (mdl == null) {
            byte[] var3 = Js5List.models.takeFile(file, 0);
            if(var3 != null) {
                loadModel(var3, file);
            }
            return false;
        } else {
            return true;
        }
    }

    Model() {
        verticesCount = 0;
        trianglesCount = 0;
        texturesCount = 0;
        facePriority = 0;
        singleTile = true;
        this.isBoundsCalculated = false;
    }

    public Model(int length, Model[] models) {
        try {
            singleTile = false;
            boolean typeFlag = false;
            boolean priorityFlag = false;
            boolean alphaFlag = false;
            boolean tSkinFlag = false;
            boolean colorFlag = false;
            boolean textureFlag = false;
            boolean coordinateFlag = false;
            boolean mergeSkeletalData = false;
            verticesCount = 0;
            trianglesCount = 0;
            texturesCount = 0;
            facePriority = -1;
            Model build;
            for (int count = 0; count < length; count++) {
                build = models[count];
                if (build != null) {
                    verticesCount += build.verticesCount;
                    trianglesCount += build.trianglesCount;
                    texturesCount += build.texturesCount;
                    typeFlag |= build.drawType != null;
                    alphaFlag |= build.faceTransparencies != null;
                    if (build.renderPriorities != null) {
                        priorityFlag = true;
                    } else {
                        if (facePriority == -1)
                            facePriority = build.facePriority;

                        if (facePriority != build.facePriority)
                            priorityFlag = true;
                    }
                    tSkinFlag |= build.triangleData != null;
                    colorFlag |= build.colors != null;
                    textureFlag |= build.materials != null;
                    coordinateFlag |= build.textures != null;
                    mergeSkeletalData |= build.skeletalBones != null;
                }
            }

            modelParticles = new int[verticesCount];
            verticesX = new int[verticesCount];
            verticesY = new int[verticesCount];
            verticesZ = new int[verticesCount];
            vertexData = new int[verticesCount];
            trianglesX = new int[trianglesCount];
            trianglesY = new int[trianglesCount];
            trianglesZ = new int[trianglesCount];
            if (colorFlag)
                colors = new short[trianglesCount];

            if (typeFlag)
                drawType = new int[trianglesCount];

            if (priorityFlag)
                renderPriorities = new byte[trianglesCount];

            if (alphaFlag)
                faceTransparencies = new byte[trianglesCount];

            if (tSkinFlag)
                triangleData = new int[trianglesCount];

            if (mergeSkeletalData) {
                this.skeletalBones = new int[this.verticesCount][];
                this.skeletalScales = new int[this.verticesCount][];
            }

            if (textureFlag)
                materials = new short[trianglesCount];

            if (coordinateFlag)
                textures = new byte[trianglesCount];

            if (texturesCount > 0) {
                textureTypes = new byte[texturesCount];
                texturesX = new int[texturesCount];
                texturesY = new int[texturesCount];
                texturesZ = new int[texturesCount];
            }
            verticesCount = 0;
            trianglesCount = 0;
            texturesCount = 0;
            int textureFace = 0;
            for (int index = 0; index < length; index++) {
                build = models[index];
                if (build != null) {
                    for (int face = 0; face < build.trianglesCount; face++) {
                        if (typeFlag && build.drawType != null)
                            drawType[trianglesCount] = build.drawType[face];

                        if (priorityFlag)
                            if (build.renderPriorities == null)
                                renderPriorities[trianglesCount] = build.facePriority;
                            else
                                renderPriorities[trianglesCount] = build.renderPriorities[face];

                        if (alphaFlag && build.faceTransparencies != null)
                            faceTransparencies[trianglesCount] = build.faceTransparencies[face];

                        if (tSkinFlag && build.triangleData != null)
                            triangleData[trianglesCount] = build.triangleData[face];

                        if (textureFlag) {
                            if (build.materials != null)
                                materials[trianglesCount] = build.materials[face];
                            else
                                materials[trianglesCount] = -1;
                        }
                        if (coordinateFlag) {
                            if (build.textures != null && build.textures[face] != -1) {
                                textures[trianglesCount] = (byte) (build.textures[face] + textureFace);
                            } else {
                                textures[trianglesCount] = -1;
                            }
                        }

                        colors[trianglesCount] = build.colors[face];
                        trianglesX[trianglesCount] = getFirstIdenticalVertexId(build, build.trianglesX[face]);
                        trianglesY[trianglesCount] = getFirstIdenticalVertexId(build, build.trianglesY[face]);
                        trianglesZ[trianglesCount] = getFirstIdenticalVertexId(build, build.trianglesZ[face]);
                        trianglesCount++;
                    }
                    for (int textureEdge = 0; textureEdge < build.texturesCount; textureEdge++) {
                        texturesX[texturesCount] = (short) getFirstIdenticalVertexId(build, build.texturesX[textureEdge]);
                        texturesY[texturesCount] = (short) getFirstIdenticalVertexId(build, build.texturesY[textureEdge]);
                        texturesZ[texturesCount] = (short) getFirstIdenticalVertexId(build, build.texturesZ[textureEdge]);
                        texturesCount++;
                    }
                    textureFace += build.texturesCount;
                }
            }


            vertexNormals();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public int getShadowIntensity() {
        calculateBoundsCylinder();
        return diagonal2DAboveOrigin;
    }

    public Model(Model model) {
        if (model.drawType != null) {
            drawType = new int[model.trianglesCount];
            for (int face = 0; face < model.trianglesCount; face++) {
                drawType[face] = model.drawType[face];
            }
        }

        singleTile = false;
        verticesCount = model.verticesCount;
        trianglesCount = model.trianglesCount;
        texturesCount = model.texturesCount;
        colorsX = model.colorsX;
        colorsY = model.colorsY;
        colorsZ = model.colorsZ;
        modelParticles = model.modelParticles;
        verticesY = model.verticesY;
        verticesX = model.verticesX;
        verticesZ = model.verticesZ;
        colors = model.colors;
        faceTransparencies = model.faceTransparencies;
        renderPriorities = model.renderPriorities;
        facePriority = model.facePriority;
        trianglesX = model.trianglesX;
        trianglesY = model.trianglesY;
        trianglesZ = model.trianglesZ;
        texturesX = model.texturesX;
        texturesY = model.texturesY;
        texturesZ = model.texturesZ;
        super.modelBaseY = model.modelBaseY;
        textures = model.textures;
        materials = model.materials;
        diagonal2DAboveOrigin = model.diagonal2DAboveOrigin;
        diagonal3DAboveOrigin = model.diagonal3DAboveOrigin;
        diagonal3D = model.diagonal3D;
        minX = model.minX;
        maxZ = model.maxZ;
        minZ = model.minZ;
        maxX = model.maxX;

        //New
        vertexNormalsX = model.vertexNormalsX;
        vertexNormalsY = model.vertexNormalsY;
        vertexNormalsZ = model.vertexNormalsZ;
        faceTextureUVCoordinates = model.faceTextureUVCoordinates;
    }


    //Players - graphics in particular
    public Model(Model models[]) {
        int modelCount = 2;
        singleTile = false;
        anInt1620++;
        boolean renderTypeFlag = false;
        boolean priorityFlag = false;
        boolean alphaFlag = false;
        boolean colorFlag = false;
        boolean textureFlag = false;
        boolean coordinateFlag = false;
        verticesCount = 0;
        trianglesCount = 0;
        texturesCount = 0;
        facePriority = -1;
        Model build;
        for (int currentModel = 0; currentModel < modelCount; currentModel++) {
            build = models[currentModel];
            if (build != null) {
                verticesCount += build.verticesCount;
                trianglesCount += build.trianglesCount;
                texturesCount += build.texturesCount;
                renderTypeFlag |= drawType != null;
                if (build.renderPriorities != null) {
                    priorityFlag = true;
                } else {
                    if (facePriority == -1)
                        facePriority = build.facePriority;

                    if (facePriority != build.facePriority)
                        priorityFlag = true;
                }
                alphaFlag |= build.faceTransparencies != null;
                colorFlag |= build.colors != null;
                textureFlag |= build.materials != null;
                coordinateFlag |= build.textures != null;
            }
        }

        modelParticles = new int[verticesCount];
        verticesX = new int[verticesCount];
        verticesY = new int[verticesCount];
        verticesZ = new int[verticesCount];
        trianglesX = new int[trianglesCount];
        trianglesY = new int[trianglesCount];
        trianglesZ = new int[trianglesCount];
        colorsX = new int[trianglesCount];
        colorsY = new int[trianglesCount];
        colorsZ = new int[trianglesCount];

        if (renderTypeFlag)
            drawType = new int[trianglesCount];

        if (priorityFlag)
            renderPriorities = new byte[trianglesCount];

        if (alphaFlag)
            faceTransparencies = new byte[trianglesCount];

        if (textureFlag)
            materials = new short[trianglesCount];

        if (coordinateFlag)
            textures = new byte[trianglesCount];

        if(texturesCount > 0) {
            textureTypes = new byte[texturesCount];
            texturesX = new int[texturesCount];
            texturesY = new int[texturesCount];
            texturesZ = new int[texturesCount];
        }

        if (colorFlag)
            colors = new short[trianglesCount];

        verticesCount = 0;
        trianglesCount = 0;
        texturesCount = 0;
        for (int currentModel = 0; currentModel < modelCount; currentModel++) {
            build = models[currentModel];
            if (build != null) {
                int vertex = verticesCount;
                for (int point = 0; point < build.verticesCount; point++) {
                    verticesX[verticesCount] = build.verticesX[point];
                    verticesY[verticesCount] = build.verticesY[point];
                    verticesZ[verticesCount] = build.verticesZ[point];
                    modelParticles[verticesCount] = build.modelParticles[point];
                    verticesCount++;
                }
                for (int face = 0; face < build.trianglesCount; face++) {
                    trianglesX[trianglesCount] = build.trianglesX[face] + vertex;
                    trianglesY[trianglesCount] = build.trianglesY[face] + vertex;
                    trianglesZ[trianglesCount] = build.trianglesZ[face] + vertex;
                    try {
                        colorsX[trianglesCount] = build.colorsX[face];
                        colorsY[trianglesCount] = build.colorsY[face];
                        colorsZ[trianglesCount] = build.colorsZ[face];
                    } catch (Exception e) {
                    }
                    colors[trianglesCount] = build.colors[face];
                    if(renderTypeFlag && build.drawType != null) {
                        drawType[trianglesCount] = build.drawType[face];
                    }

                    if (alphaFlag && build.faceTransparencies != null) {
                        faceTransparencies[trianglesCount] = build.faceTransparencies[face];
                    }

                    if (priorityFlag)
                        if (build.renderPriorities == null)
                            renderPriorities[trianglesCount] = build.facePriority;
                        else
                            renderPriorities[trianglesCount] = build.renderPriorities[face];

                    if (colorFlag && build.colors != null)
                        colors[trianglesCount] = build.colors[face];

                    if(textureFlag) {
                        if(build.materials != null) {
                            materials[trianglesCount] = build.materials[face];
                        } else
                            materials[trianglesCount] = -1;
                    }
                    if(coordinateFlag) {
                        if(build.textures != null && build.textures[face] != -1) {
                            textures[trianglesCount] = (byte) (build.textures[face] + texturesCount);

                        } else
                            textures[trianglesCount] = -1;

                    }

                    trianglesCount++;
                }

                try {
                    for (int texture = 0; texture < build.texturesCount; texture++) {
                        if(texturesX.length == texturesCount || build.texturesX.length == texturesCount)
                            break;
                        texturesX[texturesCount] = (short) (build.texturesX[texture] + vertex);
                        texturesY[texturesCount] = (short) (build.texturesY[texture] + vertex);
                        texturesZ[texturesCount] = (short) (build.texturesZ[texture] + vertex);
                        texturesCount++;
                    }
                    texturesCount += build.texturesCount;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        calculateBoundsCylinder();
        resetBounds();
    }

    public Model(boolean colorFlag, boolean alphaFlag, boolean animated, Model model) {
        this(colorFlag, alphaFlag, animated, false, model);
    }

    public Model(boolean colorFlag, boolean alphaFlag, boolean animated, boolean textureFlag, Model model) {
        singleTile = false;
        verticesCount = model.verticesCount;
        trianglesCount = model.trianglesCount;
        texturesCount = model.texturesCount;
        if (animated) {
            modelParticles = model.modelParticles;
            verticesX = model.verticesX;
            verticesY = model.verticesY;
            verticesZ = model.verticesZ;
        } else {
            modelParticles = new int[verticesCount];
            verticesX = new int[verticesCount];
            verticesY = new int[verticesCount];
            verticesZ = new int[verticesCount];
            for (int point = 0; point < verticesCount; point++) {
                verticesX[point] = model.verticesX[point];
                verticesY[point] = model.verticesY[point];
                verticesZ[point] = model.verticesZ[point];
                modelParticles[point] = model.modelParticles[point];
            }

        }
        if (colorFlag) {
            colors = model.colors;
        } else {
            colors = new short[trianglesCount];
            System.arraycopy(model.colors, 0, colors, 0, trianglesCount);
        }

        if (!textureFlag && model.materials != null) {
            materials = new short[trianglesCount];
            System.arraycopy(model.materials, 0, materials, 0, trianglesCount);
        } else {
            materials = model.materials;
        }

        if (alphaFlag) {
            faceTransparencies = model.faceTransparencies;
        } else {
            faceTransparencies = new byte[trianglesCount];
            if (model.faceTransparencies == null) {
                for (int l = 0; l < trianglesCount; l++) {
                    faceTransparencies[l] = 0;
                }

            } else {
                System.arraycopy(model.faceTransparencies, 0, faceTransparencies, 0, trianglesCount);
            }
        }
        vertexData = model.vertexData;
        triangleData = model.triangleData;
        drawType = model.drawType;
        trianglesX = model.trianglesX;
        trianglesY = model.trianglesY;
        trianglesZ = model.trianglesZ;
        renderPriorities = model.renderPriorities;
        facePriority = model.facePriority;
        texturesX = model.texturesX;
        texturesY = model.texturesY;
        texturesZ = model.texturesZ;
        textures = model.textures;
        textureTypes = model.textureTypes;
        normals = model.normals;
        faceNormals = model.faceNormals;
        this.skeletalBones = model.skeletalBones;
        this.skeletalScales = model.skeletalScales;

        vertexNormalsOffsets = model.vertexNormalsOffsets;
    }

    public Model(boolean resetVertices, boolean resetColors, Model model) {
        singleTile = false;
        verticesCount = model.verticesCount;
        trianglesCount = model.trianglesCount;
        texturesCount = model.texturesCount;

        if (resetVertices) {
            verticesY = new int[verticesCount];

            for (int j = 0; j < verticesCount; j++) {
                verticesY[j] = model.verticesY[j];
            }
        } else {
            verticesY = model.verticesY;
        }

        if (resetColors) {
            colorsX = new int[trianglesCount];
            colorsY = new int[trianglesCount];
            colorsZ = new int[trianglesCount];
            for (int face = 0; face < trianglesCount; face++) {
                colorsX[face] = model.colorsX[face];
                colorsY[face] = model.colorsY[face];
                colorsZ[face] = model.colorsZ[face];
            }

            drawType = new int[trianglesCount];
            if (model.drawType == null) {
                for (int face = 0; face < trianglesCount; face++) {
                    drawType[face] = 0;
                }
            } else {
                System.arraycopy(model.drawType, 0, drawType, 0, trianglesCount);
            }


        } else {
            colorsX = model.colorsX;
            colorsY = model.colorsY;
            colorsZ = model.colorsZ;
            drawType = model.drawType;
        }

        modelParticles = model.modelParticles;
        verticesX = model.verticesX;
        verticesZ = model.verticesZ;
        colors = model.colors;
        faceTransparencies = model.faceTransparencies;
        renderPriorities = model.renderPriorities;
        facePriority = model.facePriority;
        trianglesX = model.trianglesX;
        trianglesY = model.trianglesY;
        trianglesZ = model.trianglesZ;
        texturesX = model.texturesX;
        texturesY = model.texturesY;
        texturesZ = model.texturesZ;
        super.modelBaseY = model.modelBaseY;
        textures = model.textures;
        materials = model.materials;
        diagonal2DAboveOrigin = model.diagonal2DAboveOrigin;
        diagonal3DAboveOrigin = model.diagonal3DAboveOrigin;
        diagonal3D = model.diagonal3D;
        minX = model.minX;
        maxZ = model.maxZ;
        minZ = model.minZ;
        maxX = model.maxX;

        //New
        vertexNormalsX = model.vertexNormalsX;
        vertexNormalsY = model.vertexNormalsY;
        vertexNormalsZ = model.vertexNormalsZ;
        faceTextureUVCoordinates = model.faceTextureUVCoordinates;
    }

    static Model Model_sharedSequenceModel = new Model();

    static byte[] Model_sharedSequenceModelFaceAlphas = new byte[1];

    public Model toSharedSequenceModel(boolean var1) {
        if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.trianglesCount) {
            Model_sharedSequenceModelFaceAlphas = new byte[this.trianglesCount + 100];
        }

        return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
    }

    Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
        var2.verticesCount = this.verticesCount;
        var2.trianglesCount = this.trianglesCount;
        var2.texturesCount = this.texturesCount;
        if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
            var2.modelParticles = new int[verticesCount + 100];
            var2.verticesX = new int[this.verticesCount + 100];
            var2.verticesY = new int[this.verticesCount + 100];
            var2.verticesZ = new int[this.verticesCount + 100];
        }

        int var4;
        for(var4 = 0; var4 < this.verticesCount; ++var4) {
            var2.verticesX[var4] = this.verticesX[var4];
            var2.verticesY[var4] = this.verticesY[var4];
            var2.verticesZ[var4] = this.verticesZ[var4];
            var2.modelParticles[var4] = this.modelParticles[var4];
        }

        if (var1) {
            var2.faceTransparencies = this.faceTransparencies;
        } else {
            var2.faceTransparencies = var3;
            if (this.faceTransparencies == null) {
                for(var4 = 0; var4 < this.trianglesCount; ++var4) {
                    var2.faceTransparencies[var4] = 0;
                }
            } else {
                for(var4 = 0; var4 < this.trianglesCount; ++var4) {
                    var2.faceTransparencies[var4] = this.faceTransparencies[var4];
                }
            }
        }

        var2.trianglesX = this.trianglesX;
        var2.trianglesY = this.trianglesY;
        var2.trianglesZ = this.trianglesZ;
        var2.colorsX = this.colorsX;
        var2.colorsY = this.colorsY;
        var2.colorsZ = this.colorsZ;
        var2.renderPriorities = this.renderPriorities;
        var2.textures = this.textures;
        var2.materials = this.materials;
        var2.facePriority = this.facePriority;
        var2.texturesX = this.texturesX;
        var2.texturesY = this.texturesY;
        var2.texturesZ = this.texturesZ;
        var2.groupedVertexLabels = this.groupedVertexLabels;
        var2.groupedTriangleLabels = this.groupedTriangleLabels;
        var2.skeletalBones = this.skeletalBones;
        var2.skeletalScales = this.skeletalScales;
        var2.singleTile = this.singleTile;
        var2.resetBounds();


        var2.vertexNormalsX = this.vertexNormalsX;
        var2.vertexNormalsY = this.vertexNormalsY;
        var2.vertexNormalsZ = this.vertexNormalsZ;

        return var2;
    }

    public void buildSharedSequenceModel(Model model, boolean replaceAlpha) {
        verticesCount = model.verticesCount;
        trianglesCount = model.trianglesCount;
        texturesCount = model.texturesCount;

        if (sharedVerticesX.length < verticesCount) {
            sharedVerticesX = new int[verticesCount + 100];
            sharedVerticesY = new int[verticesCount + 100];
            sharedVerticesZ = new int[verticesCount + 100];
        }

        modelParticles = new int[verticesCount];
        verticesX = sharedVerticesX;
        verticesY = sharedVerticesY;
        verticesZ = sharedVerticesZ;
        for (int point = 0; point < verticesCount; point++) {
            verticesX[point] = model.verticesX[point];
            verticesY[point] = model.verticesY[point];
            verticesZ[point] = model.verticesZ[point];
            modelParticles[point] = model.modelParticles[point];
        }

        if (replaceAlpha) {
            faceTransparencies = model.faceTransparencies;
        } else {
            if (sharedTriangleAlpha.length < trianglesCount) {
                sharedTriangleAlpha = new byte[trianglesCount + 100];
            }
            faceTransparencies = sharedTriangleAlpha;
            if (model.faceTransparencies == null) {
                for (int face = 0; face < trianglesCount; face++) {
                    faceTransparencies[face] = 0;
                }
            } else {
                System.arraycopy(model.faceTransparencies, 0, faceTransparencies, 0, trianglesCount);
            }
        }

        drawType = model.drawType;
        colors = model.colors;
        renderPriorities = model.renderPriorities;
        facePriority = model.facePriority;
        groupedTriangleLabels = model.groupedTriangleLabels;
        groupedVertexLabels = model.groupedVertexLabels;
        trianglesX = model.trianglesX;
        trianglesY = model.trianglesY;
        trianglesZ = model.trianglesZ;
        colorsX = model.colorsX;
        colorsY = model.colorsY;
        skeletalBones = model.skeletalBones;
        skeletalScales = model.skeletalScales;
        colorsZ = model.colorsZ;
        texturesX = model.texturesX;
        texturesY = model.texturesY;
        texturesZ = model.texturesZ;
        textures = model.textures;
        textureTypes = model.textureTypes;
        materials = model.materials;

        //New
        vertexNormalsOffsets = model.vertexNormalsOffsets;
        vertexNormalsX = model.vertexNormalsX;
        vertexNormalsY = model.vertexNormalsY;
        vertexNormalsZ = model.vertexNormalsZ;
//        faceTextureUVCoordinates = model.faceTextureUVCoordinates;

        model.resetBounds();
    }

    private int getFirstIdenticalVertexId(final Model model, final int vertex) {
        int vertexId = -1;
        int p = model.modelParticles[vertex];
        final int x = model.verticesX[vertex];
        final int y = model.verticesY[vertex];
        final int z = model.verticesZ[vertex];
        for (int v = 0; v < this.verticesCount; v++) {
            if (x != this.verticesX[v] || y != this.verticesY[v] || z != this.verticesZ[v]) {
                continue;
            }
            vertexId = v;
            break;
        }

        if (vertexId == -1) {
            modelParticles[verticesCount] = p;
            this.verticesX[this.verticesCount] = x;
            this.verticesY[this.verticesCount] = y;
            this.verticesZ[this.verticesCount] = z;
            if (model.vertexData != null) {
                this.vertexData[this.verticesCount] = model.vertexData[vertex];
            }
            if (model.skeletalBones != null) {
                this.skeletalBones[this.verticesCount] = model.skeletalBones[vertex];
                this.skeletalScales[this.verticesCount] = model.skeletalScales[vertex];
            }
            vertexId = this.verticesCount++;

        }
        return vertexId;
    }

    public void calculateBoundsCylinder() {
        if (this.boundsType != 1) {
            this.boundsType = 1;
            super.modelBaseY = 0;
            diagonal2DAboveOrigin = 0;
            bottomY = 0;
            for (int vertex = 0; vertex < verticesCount; vertex++) {
                final int x = verticesX[vertex];
                final int y = verticesY[vertex];
                final int z = verticesZ[vertex];
                if (-y > super.modelBaseY) {
                    super.modelBaseY = -y;
                }
                if (y > bottomY) {
                    bottomY = y;
                }
                final int bounds = x * x + z * z;
                if (bounds > diagonal2DAboveOrigin) {
                    diagonal2DAboveOrigin = bounds;
                }
            }

            diagonal2DAboveOrigin = (int)(Math.sqrt(diagonal2DAboveOrigin) + 0.98999999999999999);
            diagonal3DAboveOrigin = (int)(Math.sqrt(diagonal2DAboveOrigin * diagonal2DAboveOrigin + super.modelBaseY * super.modelBaseY) + 0.98999999999999999);
            diagonal3D = diagonal3DAboveOrigin + (int)(Math.sqrt(diagonal2DAboveOrigin * diagonal2DAboveOrigin + bottomY * bottomY) + 0.98999999999999999);
        }
    }

    void calculateDiagonals() {
        if (this.boundsType != 2) {
            this.boundsType = 2;
            this.diagonal2DAboveOrigin = 0;

            for (int count = 0; count < this.verticesCount; ++count) {
                int x = this.verticesX[count];
                int y = this.verticesY[count];
                int z = this.verticesZ[count];
                int bounds = x * x + z * z + y * y;
                if (bounds > this.diagonal2DAboveOrigin) {
                    this.diagonal2DAboveOrigin = bounds;
                }
            }

            this.diagonal2DAboveOrigin = (int)(Math.sqrt((double)this.diagonal2DAboveOrigin) + 0.99D);
            this.diagonal3DAboveOrigin = this.diagonal2DAboveOrigin;
            this.diagonal3D = this.diagonal2DAboveOrigin + this.diagonal2DAboveOrigin;
        }
    }

    public void normalise() {
        super.modelBaseY = 0;
        bottomY = 0;
        for (int vertex = 0; vertex < verticesCount; vertex++) {
            final int y = verticesY[vertex];
            if (-y > super.modelBaseY) {
                super.modelBaseY = -y;
            }
            if (y > bottomY) {
                bottomY = y;
            }
        }

        this.diagonal3DAboveOrigin = (int)(Math.sqrt(diagonal2DAboveOrigin * diagonal2DAboveOrigin + super.modelBaseY * super.modelBaseY) + 0.98999999999999999);
        this.diagonal3D = diagonal3DAboveOrigin + (int)(Math.sqrt(diagonal2DAboveOrigin * diagonal2DAboveOrigin + bottomY * bottomY) + 0.98999999999999999);
    }

    public void calculateBounds() {
        if (!this.isBoundsCalculated) {
            super.modelBaseY = 0;
            diagonal2DAboveOrigin = 0;
            bottomY = 0;
            minX = 0xf423f;
            maxX = 0xfff0bdc1;
            maxZ = 0xfffe7961;
            minZ = 0x1869f;

            for (int vertex = 0; vertex < verticesCount; vertex++) {
                final int x = verticesX[vertex];
                final int y = verticesY[vertex];
                final int z = verticesZ[vertex];
                if (x < minX) {
                    minX = x;
                }
                if (x > maxX) {
                    maxX = x;
                }
                if (z < minZ) {
                    minZ = z;
                }
                if (z > maxZ) {
                    maxZ = z;
                }
                if (-y > super.modelBaseY) {
                    super.modelBaseY = -y;
                }
                if (y > bottomY) {
                    bottomY = y;
                }
                final int bounds = x * x + z * z;
                if (bounds > diagonal2DAboveOrigin) {
                    diagonal2DAboveOrigin = bounds;
                }
            }
            this.isBoundsCalculated = true;
        }
    }

    public void prepareSkeleton() {
        if (vertexData != null) {
            int ai[] = new int[256];
            int j = 0;
            for (int l = 0; l < verticesCount; l++) {
                int j1 = vertexData[l];
                ai[j1]++;
                if (j1 > j)
                    j = j1;
            }
            groupedVertexLabels = new int[j + 1][];
            for (int k1 = 0; k1 <= j; k1++) {
                groupedVertexLabels[k1] = new int[ai[k1]];
                ai[k1] = 0;
            }
            for (int j2 = 0; j2 < verticesCount; j2++) {
                int l2 = vertexData[j2];
                groupedVertexLabels[l2][ai[l2]++] = j2;
            }
            //vertexData = null;
        }
        if (triangleData != null) {
            int ai1[] = new int[256];
            int k = 0;
            for (int i1 = 0; i1 < trianglesCount; i1++) {
                int l1 = triangleData[i1];
                ai1[l1]++;
                if (l1 > k)
                    k = l1;
            }
            groupedTriangleLabels = new int[k + 1][];
            for (int uid = 0; uid <= k; uid++) {
                groupedTriangleLabels[uid] = new int[ai1[uid]];
                ai1[uid] = 0;
            }
            for (int k2 = 0; k2 < trianglesCount; k2++) {
                int i3 = triangleData[k2];
                groupedTriangleLabels[i3][ai1[i3]++] = k2;
            }
            //triangleData = null;
        }
    }

    private void transform(int animationType, int[] skin, int x, int y, int z) {
        int i1 = skin.length;
        if (animationType == 0) {
            int j1 = 0;
            xAnimOffset = 0;
            yAnimOffset = 0;
            zAnimOffset = 0;
            for (int l3 : skin) {
                if (l3 < groupedVertexLabels.length) {
                    int[] ai5 = groupedVertexLabels[l3];
                    for (int j6 : ai5) {
                        xAnimOffset += verticesX[j6];
                        yAnimOffset += verticesY[j6];
                        zAnimOffset += verticesZ[j6];
                        j1++;
                    }
                }
            }
            if (j1 > 0) {
                xAnimOffset = (int) (xAnimOffset / j1 + x);
                yAnimOffset = (int) (yAnimOffset / j1 + y);
                zAnimOffset = (int) (zAnimOffset / j1 + z);
                return;
            } else {
                xAnimOffset = (int) x;
                yAnimOffset = (int) y;
                zAnimOffset = (int) z;
                return;
            }
        }
        if (animationType == 1) {
            for (int l2 : skin) {
                if (l2 < groupedVertexLabels.length) {
                    int[] ai1 = groupedVertexLabels[l2];
                    for (int j5 : ai1) {
                        verticesX[j5] += x;
                        verticesY[j5] += y;
                        verticesZ[j5] += z;
                    }
                }
            }
            return;
        }
        if (animationType == 2) {
            for (int i3 : skin) {
                if (i3 < groupedVertexLabels.length) {
                    int[] ai2 = groupedVertexLabels[i3];
                    for (int k5 : ai2) {
                        verticesX[k5] -= xAnimOffset;
                        verticesY[k5] -= yAnimOffset;
                        verticesZ[k5] -= zAnimOffset;
                        int k6 = x;
                        int l6 = y;
                        int i7 = z;
                        if (i7 != 0) {
                            int j7 = SINE[i7];
                            int i8 = COSINE[i7];
                            int l8 = verticesY[k5] * j7 + verticesX[k5] * i8 >> 16;
                            verticesY[k5] = verticesY[k5] * i8 - verticesX[k5] * j7 >> 16;
                            verticesX[k5] = l8;
                        }
                        if (k6 != 0) {
                            int k7 = SINE[k6];
                            int j8 = COSINE[k6];
                            int i9 = verticesY[k5] * j8 - verticesZ[k5] * k7 >> 16;
                            verticesZ[k5] = verticesY[k5] * k7 + verticesZ[k5] * j8 >> 16;
                            verticesY[k5] = i9;
                        }
                        if (l6 != 0) {
                            int l7 = SINE[l6];
                            int k8 = COSINE[l6];
                            int j9 = verticesZ[k5] * l7 + verticesX[k5] * k8 >> 16;
                            verticesZ[k5] = verticesZ[k5] * k8 - verticesX[k5] * l7 >> 16;
                            verticesX[k5] = j9;
                        }
                        verticesX[k5] += xAnimOffset;
                        verticesY[k5] += yAnimOffset;
                        verticesZ[k5] += zAnimOffset;
                    }
                }
            }
            return;
        }
        if (animationType == 3) {
            for (int j3 : skin) {
                if (j3 < groupedVertexLabels.length) {
                    int[] ai3 = groupedVertexLabels[j3];
                    for (int l5 : ai3) {
                        verticesX[l5] -= xAnimOffset;
                        verticesY[l5] -= yAnimOffset;
                        verticesZ[l5] -= zAnimOffset;
                        verticesX[l5] = (int) ((verticesX[l5] * x) / 128);
                        verticesY[l5] = (int) ((verticesY[l5] * y) / 128);
                        verticesZ[l5] = (int) ((verticesZ[l5] * z) / 128);
                        verticesX[l5] += xAnimOffset;
                        verticesY[l5] += yAnimOffset;
                        verticesZ[l5] += zAnimOffset;
                    }
                }
            }
            return;
        }
        if (animationType == 5 && groupedTriangleLabels != null && faceTransparencies != null) {
            for (int k3 : skin) {
                if (k3 < groupedTriangleLabels.length) {
                    int[] ai4 = groupedTriangleLabels[k3];
                    for (int i6 : ai4) {
                        int i = (faceTransparencies[i6] & 255) + x * 8;

                        if (i < 0) {
                            i = 0;
                        } else if (i > 255) {
                            i = 255;
                        }
                        this.faceTransparencies[i6] = (byte) i;
                    }
                }
            }
        }
    }

    public void playSkeletal(SequenceDefinition seqDefinition, int tick) {
        int skeletalId = seqDefinition.getSkeletalId();
        Index frameIndex = SeqFrameDefs.getFrameIndex();
        Index baseIndex = SeqBaseDefs.getBaseIndex();
        SkaFSet skeletalFrameset = SkaFSet.getSkaf(frameIndex, baseIndex, skeletalId);
        transformSkeletal(skeletalFrameset, tick);
    }

    public void transformSkeletal(SkaFSet skaFSet, int tick) {
        SeqBase base = skaFSet.seqBase;
        ABW ABW = base.getABW();
        //tick = 0;
        if (ABW != null) {
            base.getABW().ut(skaFSet, tick);
            this.transformSkeletal(base.getABW(), skaFSet.getFid());
        }
        if (skaFSet.hExisting()) {
            this.applyAlphaTransforms(skaFSet, tick);
        }
    }

    public void playSkeletalDouble(SequenceDefinition primary, SequenceDefinition secondary, int primaryTick, int secondaryTick) {
        int primarySkeletalId = primary.getSkeletalId();
        int secondarySkeletalId = secondary.getSkeletalId();
        Index frameIndex = SeqFrameDefs.getFrameIndex();
        Index baseIndex = SeqBaseDefs.getBaseIndex();
        SkaFSet primarySkeletalFrameset = SkaFSet.getSkaf(frameIndex, baseIndex, primarySkeletalId);
        SkaFSet secondarySkeletalFrameset = SkaFSet.getSkaf(frameIndex, baseIndex, secondarySkeletalId);
        boolean[] mask = primary.getBooleanMasks();
        SeqBase base = primarySkeletalFrameset.seqBase;

        transformSkeletalMultiple(base, primarySkeletalFrameset, primaryTick, mask, false, !secondary.isSkeletalAnimation());
        transformSkeletalMultiple(base, secondarySkeletalFrameset, secondaryTick, mask, true, true);
    }

    private static Matrix4f fbm = new Matrix4f();
    private static Matrix4f sm = new Matrix4f();
    private static Matrix4f cbm = new Matrix4f();

    private void transformVertex(int vertex, Matrix4f bm) {
        float x = ((float) (verticesX[vertex]));
        float y = ((float) (-verticesY[vertex]));
        float z = ((float) (-verticesZ[vertex]));

        // The position is treated as a 4D vector with it's w-component being 1.0, that means that it will represent a position/location in 3d space
        // rather than a direction
        float w = 1f;
        int newX = ((int) (bm.values[0] * x + bm.values[4] * y + bm.values[8] * z + bm.values[12] * w));
        int newY = -((int) (bm.values[1] * x + bm.values[5] * y + bm.values[9] * z + bm.values[13] * w));
        int newZ = -((int) (bm.values[2] * x + bm.values[6] * y + bm.values[10] * z + bm.values[14] * w));

        verticesX[vertex] = newX;
        verticesY[vertex] = newY;
        verticesZ[vertex] = newZ;
    }

    private void transformSkeletal(ABW animBoneWrapper, int frameId) {
        if (skeletalBones == null) {
            return;
        }

        for (int vertex = 0; vertex < verticesCount; vertex++) {
            int[] bonesForVertex = skeletalBones[vertex];
            if (bonesForVertex != null && bonesForVertex.length != 0) {
                int[] scalesForVertex = skeletalScales[vertex];
                fbm.zero(); // instead of identity() likely because of the scaling below
                for (int i = 0; i < bonesForVertex.length; i++) {
                    int bi = bonesForVertex[i];
                    AB bone = animBoneWrapper.getAB(bi);
                    if (bone != null) {
                        sm.sc(((float) (scalesForVertex[i])) / 255.0F);
                        cbm.sf(bone.gcbm(frameId));
                        cbm.mp(sm);
                        fbm.a(cbm);
                    }
                }
                this.transformVertex(vertex, fbm);
            }
        }
    }

    public void transformSkeletalMultiple(SeqBase base, SkaFSet skaFSet, int tick, boolean[] mask, boolean state, boolean hasSkeletalAnimations) {
        ABW boneAnimationWrapper = base.getABW();
        if (boneAnimationWrapper != null) {
            boneAnimationWrapper.ut(skaFSet, tick, mask, state);
            if (hasSkeletalAnimations) {
                this.transformSkeletal(boneAnimationWrapper, skaFSet.getFid());
            }
        }
        if (!state && skaFSet.hExisting()) {
            this.applyAlphaTransforms(skaFSet, tick);
        }
    }

    private void applyAlphaTransforms(SkaFSet skaFSet, int tick) {
        SeqBase base = skaFSet.seqBase;
        for (int baseIndex = 0; baseIndex < base.getLength(); baseIndex++) {
            int type = base.getTypes()[baseIndex];
            if (type == 5 && skaFSet.tt != null && skaFSet.tt[baseIndex] != null && skaFSet.tt[baseIndex][0] != null && groupedTriangleLabels != null && faceTransparencies != null) {
                TO TO = skaFSet.tt[baseIndex][0];
                int[] vertexLabels = base.getGroupLabels()[baseIndex];
                for (int label : vertexLabels) {
                    if (label < groupedTriangleLabels.length) {
                        int[] triangleLabels = groupedTriangleLabels[label];
                        for (int triangleIndex : triangleLabels) {
                            int alpha = (int) ((float) (this.faceTransparencies[triangleIndex] & 255) + TO.gv(tick) * 255.0F);
                            if (alpha < 0) {
                                alpha = 0;
                            } else if (alpha > 255) {
                                alpha = 255;
                            }

                            faceTransparencies[triangleIndex] = (byte) alpha;
                        }
                    }
                }
            }
        }
    }

    public void interpolate(int frameId) {
        if (groupedVertexLabels == null) {
//            System.out.println("GroupVertex null");
            return;
        }

        if (frameId == -1) {
//            System.out.println("frameId null");
            return;
        }

        SeqFrame frame = SeqFrame.get(frameId);
        if (frame == null) {
//            System.out.println("frame null");
            return;
        }

        SeqBase base = frame.getBase();
        xAnimOffset = 0;
        yAnimOffset = 0;
        zAnimOffset = 0;
        for (int index = 0; index < frame.getBaseCount(); index++) {
            int pos = frame.getBases()[index];
            transform(base.getTypes()[pos], base.getGroupLabels()[pos], frame.getXModifier()[index], frame.getYModifier()[index], frame.getZModifier()[index]);
        }

        this.resetBounds();
        invalidate();
    }


    public void mix(int[] label, int idle, int current) {
        if (current != -1) {
            if (label != null && idle != -1) {
                SeqFrame anim = SeqFrame.get(current);
                if (anim == null)
                    return;

                SeqFrame skin = SeqFrame.get(idle);
                if (skin == null) {
                    interpolate(current);
                    return;
                }
                SeqBase list = anim.getBase();

                xAnimOffset = 0;
                yAnimOffset = 0;
                zAnimOffset = 0;
                byte idOffset = 0;
                int id = idOffset + 1;
                int table = label[id++];
                int var11;
                int condition;
                for (var11 = 0; var11 < anim.getBaseCount(); var11++) {
                    for (condition = anim.getBases()[var11]; condition > table; table = label[id++]) {
                        ;
                    }
                    if (condition != table || list.getTypes()[condition] == 0) {
                        transform(list.getTypes()[condition], list.getGroupLabels()[condition], anim.getXModifier()[var11], anim.getYModifier()[var11], anim.getZModifier()[var11]);
                    }
                }
                xAnimOffset = 0;
                yAnimOffset = 0;
                zAnimOffset = 0;
                idOffset = 0;
                id = idOffset + 1;
                table = label[id++];
                for (var11 = 0; var11 < skin.getBaseCount(); var11++) {
                    for (condition = skin.getBases()[var11]; condition > table; table = label[id++]) {
                        ;
                    }
                    if (condition == table || list.getTypes()[condition] == 0) {
                        transform(list.getTypes()[condition], list.getGroupLabels()[condition], skin.getXModifier()[var11], skin.getYModifier()[var11], skin.getZModifier()[var11]);
                    }
                }
                this.resetBounds();
                this.invalidate();
            } else {
                this.interpolate(current);
            }
        }
    }

    public void rotate90Degrees() {
        for (int vertex = 0; vertex < verticesCount; vertex++) {
            int x = verticesX[vertex];
            verticesX[vertex] = verticesZ[vertex];
            verticesZ[vertex] = -x;
        }

        this.resetBounds();
        invalidate();
    }

    public void rotateZ(int factor) {
        int sin = SINE[factor];
        int cos = COSINE[factor];
        for (int point = 0; point < verticesCount; point++) {
            int y = verticesY[point] * cos - verticesZ[point] * sin >> 16;
            verticesZ[point] = verticesY[point] * sin + verticesZ[point] * cos >> 16;
            verticesY[point] = y;
        }

        this.resetBounds();
        invalidate();
    }

    public void offsetBy(int x, int y, int z) {
        for (int point = 0; point < verticesCount; point++) {
            verticesX[point] += x;
            verticesY[point] += y;
            verticesZ[point] += z;
        }

        this.resetBounds();
        invalidate();
    }
    public Model recolor(int replace) {
        if(colors != null) {
            for (int face = 0; face < trianglesCount; face++) {
                    colors[face] = (short) replace;
            }
        }
        return this;
    }
    public Model recolor(int found, int replace) {
        if(colors != null) {
            for (int face = 0; face < trianglesCount; face++) {
                if (colors[face] == (short) found) {
                    colors[face] = (short) replace;
                }
            }
        }
        return this;
    }

    public net.runelite.api.Model recolor(short found, short replace) {
        if(colors != null) {
            for (int face = 0; face < trianglesCount; face++) {
                if (colors[face] == (short) found) {
                    colors[face] = (short) replace;
                }
            }
        }
        return this;
    }

    @Override
    public net.runelite.api.Model light(int i, int i1, int defaultX, int defaultY, int defaultZ) {
        return light(i ,i1, defaultX, defaultY, defaultZ, true);
    }

    public void recolorShort(short[] found, short[] replace) {
        if(colors != null) {
            for (int face = 0; face < trianglesCount; face++) {
                if (colors[face] == found[0]) {
                    colors[face] = replace[0];
                }
            }
        }
    }

    public void retexture(short found, short replace) {
        if(materials != null) {
            for (int face = 0; face < trianglesCount; face++) {
                if (materials[face] == found) {
                    materials[face] = replace;
                }
            }
        }
    }

    public void setTextureFromColor(int color, int texture) {
        if(colors == null)
            return;
        if(materials == null) {
            materials = new short[trianglesCount];
            Arrays.fill(materials, (short) -1);
        }
        for (int face = 0; face < trianglesCount; face++) {
            if (colors[face] == color) {
                materials[face] = (short) texture;
            }
        }
    }
    public void retextureRestOfModel(int texture) {
        if(materials == null)
            throw new IllegalStateException("Materials is null, this method requires some texturing before usage.");
        for (int face = 0; face < trianglesCount; face++) {
            if (materials[face] == -1) {
                materials[face] = (short) texture;
            }
        }
    }

    public void mirror() {
        for (int vertex = 0; vertex < verticesCount; vertex++)
            verticesZ[vertex] = -verticesZ[vertex];

        for (int face = 0; face < trianglesCount; face++) {
            int newTriangleZ = trianglesX[face];
            trianglesX[face] = trianglesZ[face];
            trianglesZ[face] = newTriangleZ;
        }
    }

    public Model scale(int x, int z, int y) {
        for (int index = 0; index < verticesCount; index++) {
            verticesX[index] = (verticesX[index] * x) / 128;
            verticesY[index] = (verticesY[index] * y) / 128;
            verticesZ[index] = (verticesZ[index] * z) / 128;
        }

        this.resetBounds();
        invalidate();
        return this;
    }

    @Override
    public net.runelite.api.Model translate(int i, int i1, int i2) {
        offsetBy(i, i1, i2);
        return this;
    }

    @Override
    public net.runelite.api.Model light() {
        return light(139, 2643, -50, -10, -50);
    }

    public void calculateVertexNormals() {
        if (this.normals == null) {
            this.normals = new VertexNormal[this.verticesCount];

            int var1;
            for (var1 = 0; var1 < this.verticesCount; ++var1) {
                this.normals[var1] = new VertexNormal();
            }

            for (var1 = 0; var1 < this.trianglesCount; ++var1) {
                int var2 = this.trianglesX[var1];
                int var3 = this.trianglesY[var1];
                int var4 = this.trianglesZ[var1];
                int var5 = this.verticesX[var3] - this.verticesX[var2];
                int var6 = this.verticesY[var3] - this.verticesY[var2];
                int var7 = this.verticesZ[var3] - this.verticesZ[var2];
                int var8 = this.verticesX[var4] - this.verticesX[var2];
                int var9 = this.verticesY[var4] - this.verticesY[var2];
                int var10 = this.verticesZ[var4] - this.verticesZ[var2];
                int var11 = var6 * var10 - var9 * var7;
                int var12 = var7 * var8 - var10 * var5;

                int var13;
                for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
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
                int var15; //should be byte
                if (this.drawType == null) {
                    var15 = 0;
                } else {
                    var15 = this.drawType[var1];
                }

                if (var15 == 0) {
                    VertexNormal var16 = this.normals[var2];
                    var16.x += var11;
                    var16.y += var12;
                    var16.z += var13;
                    ++var16.magnitude;
                    var16 = this.normals[var3];
                    var16.x += var11;
                    var16.y += var12;
                    var16.z += var13;
                    ++var16.magnitude;
                    var16 = this.normals[var4];
                    var16.x += var11;
                    var16.y += var12;
                    var16.z += var13;
                    ++var16.magnitude;
                } else if (var15 == 1) {
                    if (this.faceNormals == null) {
                        this.faceNormals = new FaceNormal[this.trianglesCount];
                    }

                    FaceNormal var17 = this.faceNormals[var1] = new FaceNormal();
                    var17.x = var11;
                    var17.y = var12;
                    var17.z = var13;
                }
            }

        }
    }



    private int method4319(int var0, int var1) {
        var1 = (var0 & 127) * var1 >> 7;
        if (var1 < 2) {
            var1 = 2;
        } else if (var1 > 126) {
            var1 = 126;
        }

        return (var0 & 'ﾀ') + var1;
    }

    private int method4320(int var0) {
        if (var0 < 2) {
            var0 = 2;
        } else if (var0 > 126) {
            var0 = 126;
        }

        return var0;
    }

    public Model light(int ambient, int contrast, int x, int y, int z, boolean flatShading) {
        this.calculateVertexNormals();
        int magnitude = (int)Math.sqrt((double)(z * z + x * x + y * y));
        int var7 = magnitude * contrast >> 8;
        Model model = new Model();
        model.colorsX = new int[this.trianglesCount];
        model.colorsY = new int[this.trianglesCount];
        model.colorsZ = new int[this.trianglesCount];
        if (this.texturesCount > 0 && this.textures != null) {
            int[] var9 = new int[this.texturesCount];

            int var10;
            for (var10 = 0; var10 < this.trianglesCount; ++var10) {
                if (this.textures[var10] != -1) {
                    ++var9[this.textures[var10] & 255];
                }
            }

            model.texturesCount = 0;

            for (var10 = 0; var10 < this.texturesCount; ++var10) {
                if (var9[var10] > 0 && this.textureTypes[var10] == 0) {
                    ++model.texturesCount;
                }
            }

            model.texturesX = new int[model.texturesCount]; //should be int (Model is int, ModelData is short)
            model.texturesY = new int[model.texturesCount]; //should be int
            model.texturesZ = new int[model.texturesCount]; //should be int
            var10 = 0;

            int var11;
            for (var11 = 0; var11 < this.texturesCount; ++var11) {
                if (var9[var11] > 0 && this.textureTypes[var11] == 0) {
                    model.texturesX[var10] = (short) (this.texturesX[var11] & '\uffff'); //should be int (short cast redundant)
                    model.texturesY[var10] = (short) (this.texturesY[var11] & '\uffff'); //should be int (short cast redundant)
                    model.texturesZ[var10] = (short) (this.texturesZ[var11] & '\uffff'); //should be int (short cast redundant)
                    var9[var11] = var10++;
                } else {
                    var9[var11] = -1;
                }
            }

            model.textures = new byte[this.trianglesCount];

            for (var11 = 0; var11 < this.trianglesCount; ++var11) {
                if (this.textures[var11] != -1) {
                    model.textures[var11] = (byte)var9[this.textures[var11] & 255];
                } else {
                    model.textures[var11] = -1;
                }
            }
        }

        for (int var16 = 0; var16 < this.trianglesCount; ++var16) {
            int var17; //should be byte
            if (this.drawType == null) {
                var17 = 0;
            } else {
                var17 = this.drawType[var16];
            }

            byte var18;
            if (this.faceTransparencies == null) {
                var18 = 0;
            } else {
                var18 = this.faceTransparencies[var16];
            }

            short var12;
            if (this.materials == null) {
                var12 = -1;
            } else {
                var12 = this.materials[var16];
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
                        var14 = (y * var19.y + z * var19.z + x * var19.x) / (var7 / 2 + var7) + ambient;
                        model.colorsX[var16] = light(this.colors[var16] & '\uffff', var14);
                        model.colorsZ[var16] = -1;
                    } else if (var17 == 3) {
                        model.colorsX[var16] = 128;
                        model.colorsZ[var16] = -1;
                    } else {
                        model.colorsZ[var16] = -2;
                    }
                } else {
                    int var15 = this.colors[var16] & '\uffff';
                    if (this.vertexNormalsOffsets != null && this.vertexNormalsOffsets[this.trianglesX[var16]] != null) {
                        var13 = this.vertexNormalsOffsets[this.trianglesX[var16]];
                    } else {
                        var13 = this.normals[this.trianglesX[var16]];
                    }

                    var14 = (y * var13.y + z * var13.z + x * var13.x) / (var7 * var13.magnitude) + ambient;
                    model.colorsX[var16] = light(var15, var14);
                    if (this.vertexNormalsOffsets != null && this.vertexNormalsOffsets[this.trianglesY[var16]] != null) {
                        var13 = this.vertexNormalsOffsets[this.trianglesY[var16]];
                    } else {
                        var13 = this.normals[this.trianglesY[var16]];
                    }

                    var14 = (y * var13.y + z * var13.z + x * var13.x) / (var7 * var13.magnitude) + ambient;
                    model.colorsY[var16] = light(var15, var14);
                    if (this.vertexNormalsOffsets != null && this.vertexNormalsOffsets[this.trianglesZ[var16]] != null) {
                        var13 = this.vertexNormalsOffsets[this.trianglesZ[var16]];
                    } else {
                        var13 = this.normals[this.trianglesZ[var16]];
                    }

                    var14 = (y * var13.y + z * var13.z + x * var13.x) / (var7 * var13.magnitude) + ambient;
                    model.colorsZ[var16] = light(var15, var14);
                }
            } else if (var17 != 0) {
                if (var17 == 1) {
                    var19 = this.faceNormals[var16];
                    var14 = (y * var19.y + z * var19.z + x * var19.x) / (var7 / 2 + var7) + ambient;
                    model.colorsX[var16] = light(var14);
                    model.colorsZ[var16] = -1;
                } else {
                    model.colorsZ[var16] = -2;
                }
            } else {
                if (this.vertexNormalsOffsets != null && this.vertexNormalsOffsets[this.trianglesX[var16]] != null) {
                    var13 = this.vertexNormalsOffsets[this.trianglesX[var16]];
                } else {
                    var13 = this.normals[this.trianglesX[var16]];
                }

                var14 = (y * var13.y + z * var13.z + x * var13.x) / (var7 * var13.magnitude) + ambient;
                model.colorsX[var16] = light(var14);
                if (this.vertexNormalsOffsets != null && this.vertexNormalsOffsets[this.trianglesY[var16]] != null) {
                    var13 = this.vertexNormalsOffsets[this.trianglesY[var16]];
                } else {
                    var13 = this.normals[this.trianglesY[var16]];
                }

                var14 = (y * var13.y + z * var13.z + x * var13.x) / (var7 * var13.magnitude) + ambient;
                model.colorsY[var16] = light(var14);
                if (this.vertexNormalsOffsets != null && this.vertexNormalsOffsets[this.trianglesZ[var16]] != null) {
                    var13 = this.vertexNormalsOffsets[this.trianglesZ[var16]];
                } else {
                    var13 = this.normals[this.trianglesZ[var16]];
                }

                var14 = (y * var13.y + z * var13.z + x * var13.x) / (var7 * var13.magnitude) + ambient;
                model.colorsZ[var16] = light(var14);
            }
        }

        this.prepareSkeleton();
        model.verticesCount = this.verticesCount;
        model.modelParticles = this.modelParticles;
        model.verticesX = this.verticesX;
        model.verticesY = this.verticesY;
        model.verticesZ = this.verticesZ;
        model.trianglesCount = this.trianglesCount;
        model.trianglesX = this.trianglesX;
        model.trianglesY = this.trianglesY;
        model.trianglesZ = this.trianglesZ;
        model.renderPriorities = this.renderPriorities;
        model.faceTransparencies = this.faceTransparencies;
        model.facePriority = this.facePriority;
        model.groupedVertexLabels = this.groupedVertexLabels;
        model.groupedTriangleLabels = this.groupedTriangleLabels;
        model.materials = this.materials;
        model.skeletalBones = this.skeletalBones;
        model.skeletalScales = this.skeletalScales;
        this.colorsX = model.colorsX;
        this.colorsY = model.colorsY;
        this.colorsZ = model.colorsZ;
        this.texturesCount = model.texturesCount;
        this.textures = model.textures;
        this.texturesX = model.texturesX;
        this.texturesY = model.texturesY;
        this.texturesZ = model.texturesZ;

        if (flatShading) {
            calculateBoundsCylinder();
        } else {
            vertexNormalsOffsets = new VertexNormal[verticesCount];
            for (int point = 0; point < verticesCount; point++) {
                VertexNormal norm = super.normals[point];
                VertexNormal merge = vertexNormalsOffsets[point] = new VertexNormal();
                merge.x = norm.x;
                merge.y = norm.y;
                merge.z = norm.z;
                merge.magnitude = norm.magnitude;
            }

            calculateBounds();
        }

        resetBounds();

        if (textures == null) {
            vertexNormals();
        }

        VertexNormal[] vertexNormals2 = normals;
        VertexNormal[] vertexVertices = vertexNormalsOffsets;

        if (vertexNormals2 != null && vertexNormalsX == null)
        {
            int verticesCount = getVerticesCount();

            vertexNormalsX = new int[verticesCount];
            vertexNormalsY = new int[verticesCount];
            vertexNormalsZ = new int[verticesCount];

            for (int i = 0; i < verticesCount; ++i) {
                VertexNormal vertexNormal;

                if (vertexVertices != null && (vertexNormal = vertexVertices[i]) != null) {
                    vertexNormalsX[i] = vertexNormal.getX();
                    vertexNormalsY[i] = vertexNormal.getY();
                    vertexNormalsZ[i] = vertexNormal.getZ();
                } else if ((vertexNormal = vertexNormals2[i]) != null) {
                    vertexNormalsX[i] = vertexNormal.getX();
                    vertexNormalsY[i] = vertexNormal.getY();
                    vertexNormalsZ[i] = vertexNormal.getZ();
                }
            }
        }

        this.normals = model.normals;
        this.vertexNormalsOffsets = model.vertexNormalsOffsets;
        return this;
    }

    public final void setLighting(int intensity, int specular, int x, int y, int z) {
        setLighting(intensity, specular, x, y, z, false);
    }

    public final void setLighting(int intensity, int specular, int x, int y, int z, boolean player) {
        for (int face = 0; face < trianglesCount; face++) {
            int a = trianglesX[face];
            int b = trianglesY[face];
            int c = trianglesZ[face];
            if(materials != null) {
                if(player) {
                    //These checks are all important! - black triangle check
                    if(faceTransparencies != null && colors != null) {
                        if(colors[face] == 0 && renderPriorities[face] == 0) {
                            if(drawType[face] == 2 && materials[face] == -1) {
                                faceTransparencies[face] = (byte) 255;
                            }
                        }
                    } else if(faceTransparencies == null) {
                        if(colors[face] == 0 && renderPriorities[face] == 0) {
                            if(materials[face] == -1) {
                                faceTransparencies = new byte[trianglesCount];
                            }
                        }
                    }
                }
            }
            if (drawType == null) {
                int hsl = colors[face] & '\uffff';
                VertexNormal vertex = super.normals[a];
                int dir_light_intensity = intensity + (x * vertex.x + y * vertex.y + z * vertex.z) / (specular * vertex.magnitude);
                colorsX[face] = light(hsl, dir_light_intensity, 0);

                vertex = super.normals[b];
                dir_light_intensity = intensity + (x * vertex.x + y * vertex.y + z * vertex.z) / (specular * vertex.magnitude);
                colorsY[face] = light(hsl, dir_light_intensity, 0);

                vertex = super.normals[c];
                dir_light_intensity = intensity + (x * vertex.x + y * vertex.y + z * vertex.z) / (specular * vertex.magnitude);
                colorsZ[face] = light(hsl, dir_light_intensity, 0);
            } else if ((drawType[face] & 1) == 0) {
                int type = drawType[face];
                int hsl = colors[face] & '\uffff';
                VertexNormal vertex = super.normals[a];
                int dir_light_intensity = intensity + (x * vertex.x + y * vertex.y + z * vertex.z) / (specular * vertex.magnitude);
                colorsX[face] = light(hsl, dir_light_intensity, type);

                vertex = super.normals[b];
                dir_light_intensity = intensity + (x * vertex.x + y * vertex.y + z * vertex.z) / (specular * vertex.magnitude);
                colorsY[face] = light(hsl, dir_light_intensity, type);

                vertex = super.normals[c];
                dir_light_intensity = intensity + (x * vertex.x + y * vertex.y + z * vertex.z) / (specular * vertex.magnitude);
                colorsZ[face] = light(hsl, dir_light_intensity, type);
            }
        }
        super.normals = null;
        vertexNormalsOffsets = null;
        vertexData = null;
        triangleData = null;
        if (drawType != null) {
            for (int face = 0; face < trianglesCount; face++)
                if ((drawType[face] & 2) == 2)
                    return;
        }
        colors = null;
    }

    public static final int light(int light) {
        if(light >= 2) {
            if(light > 126) {
                light = 126;
            }
        } else {
            light = 2;
        }
        return light;
    }

    public static final int light(int hsl, int light) {
        light = light * (hsl & 127) >> 7;
        if(light < 2) {
            light = 2;
        } else if(light > 126) {
            light = 126;
        }
        return (hsl & '\uff80') + light;
    }

    public static final int light(int hsl, int light, int type) {
        if ((type & 2) == 2)
            return light(light);

        return light(hsl, light);
    }

    public void renderModel(final int rotationY, final int rotationZ, final int rotationXW, final int translationX, final int translationY, final int translationZ) {

        if (this.boundsType != 2 && this.boundsType != 1) {
            this.calculateDiagonals();
        }

        final int centerX = Rasterizer3D.originViewX;
        final int centerY = Rasterizer3D.originViewY;
        final int sineY = SINE[rotationY];
        final int cosineY = COSINE[rotationY];
        final int sineZ = SINE[rotationZ];
        final int cosineZ = COSINE[rotationZ];
        final int sineXW = SINE[rotationXW];
        final int cosineXW = COSINE[rotationXW];
        final int transformation = translationY * sineXW + translationZ * cosineXW >> 16;
        for (int vertex = 0; vertex < verticesCount; vertex++) {
            int x = this.verticesX[vertex];
            int y = this.verticesY[vertex];
            int z = this.verticesZ[vertex];
            if (rotationZ != 0) {
                final int newX = y * sineZ + x * cosineZ >> 16;
                y = y * cosineZ - x * sineZ >> 16;
                x = newX;
            }
            if (rotationY != 0) {
                final int newX = z * sineY + x * cosineY >> 16;
                z = z * cosineY - x * sineY >> 16;
                x = newX;
            }
            x += translationX;
            y += translationY;
            z += translationZ;
            final int newY = y * cosineXW - z * sineXW >> 16;
            z = y * sineXW + z * cosineXW >> 16;
            y = newY;
            vertexScreenZ[vertex] = z - transformation;
            vertexScreenX[vertex] = centerX + (x << 9) / z;
            vertexScreenY[vertex] = centerY + (y << 9) / z;
            if (texturesCount > 0) {
                vertexMovedX[vertex] = x;
                vertexMovedY[vertex] = y;
                vertexMovedZ[vertex] = z;
            }
        }

        try {
            this.withinObject(false, false, 0, 0);
        } catch (final Exception ex) {
            ex.printStackTrace();
        }
    }

    private static boolean mouseInViewport = false;

    public static void cursorCalculations() {
        int mouseX = MouseHandler.MouseHandler_x;
        int mouseY = MouseHandler.MouseHandler_y;
        if (MouseHandler.lastButton != 0) {
            mouseX = MouseHandler.MouseHandler_lastPressedX;
            mouseY = MouseHandler.MouseHandler_lastPressedY;
        }

        if (mouseX >= Client.instance.getViewportXOffset() && mouseX < Client.instance.getViewportXOffset() + Client.instance.getViewportWidth() && mouseY >= Client.instance.getViewportYOffset() && mouseY < Client.instance.getViewportHeight() + Client.instance.getViewportYOffset()) {
            cursorX = mouseX - Client.instance.getViewportXOffset();
            cursorY = mouseY - Client.instance.getViewportYOffset();
            mouseInViewport = true;
        } else {
            mouseInViewport = false;
        }
        objectsHovering = 0;
    }

    public void calculateBoundingBox(int orientation) {
        if (!this.aabb.containsKey(orientation)) {
            int minX = 0;
            int minZ = 0;
            int minY = 0;
            int maxX = 0;
            int maxZ = 0;
            int maxY = 0;
            int cosine = COSINE[orientation];
            int sine = SINE[orientation];

            for(int vert = 0; vert < this.verticesCount; ++vert) {
                int x = Rasterizer3D.method3549(this.verticesX[vert], this.verticesZ[vert], cosine, sine);
                int y = this.verticesY[vert];
                int z = Rasterizer3D.method3352(this.verticesX[vert], this.verticesZ[vert], cosine, sine);
                if (x < minX) {
                    minX = x;
                }

                if (x > maxX) {
                    maxX = x;
                }

                if (y < minZ) {
                    minZ = y;
                }

                if (y > maxZ) {
                    maxZ = y;
                }

                if (z < minY) {
                    minY = z;
                }

                if (z > maxY) {
                    maxY = z;
                }
            }

            AABB aabb = new AABB((maxX + minX) / 2, (maxZ + minZ) / 2, (maxY + minY) / 2, (maxX - minX + 1) / 2, (maxZ - minZ + 1) / 2, (maxY - minY + 1) / 2);

            if (aabb.xMidOffset < 32) {
                aabb.xMidOffset = 32;
            }

            if (aabb.zMidOffset < 32) {
                aabb.zMidOffset = 32;
            }

            if (this.singleTile) {
                aabb.xMidOffset += 8;
                aabb.zMidOffset += 8;
            }

            this.aabb.put(orientation, aabb);
        }

    }

    @Override
    public byte[] getTextureFaces() {
        return textures;
    }

    @Override
    public int[] getTexIndices1() {
        return texturesX;
    }

    @Override
    public int[] getTexIndices2() {
        return texturesY;
    }

    @Override
    public int[] getTexIndices3() {
        return texturesZ;
    }
    static boolean field2214 = true;

    private static void method6489(long uid) {
        hoveringObjects[objectsHovering++] = uid;
    }
    @Override
    public final void renderAtPoint(int orientation, int pitchSine, int pitchCos, int yawSin, int yawCos, int offsetX, int offsetY, int offsetZ, long uid, int plane) {
        if (this.boundsType != 1) {
            this.calculateBoundsCylinder();
        }
        calculateBoundingBox(orientation);
        int sceneX = offsetZ * yawCos - offsetX * yawSin >> 16;
        int sceneY = offsetY * pitchSine + sceneX * pitchCos >> 16;
        int dimensionSinY = diagonal2DAboveOrigin * pitchCos >> 16;
        int pos = sceneY + dimensionSinY;
        final boolean gpu = Client.instance.isGpu() && Rasterizer3D.world;
        if (pos <= 50 || (sceneY >= 3500 && !gpu))
            return;
        int xRot = offsetZ * yawSin + offsetX * yawCos >> 16;
        int objX = (xRot - diagonal2DAboveOrigin) * Rasterizer3D.fieldOfView;
        if (objX / pos >= Rasterizer2D.viewportCenterX)
            return;

        int objWidth = (xRot + diagonal2DAboveOrigin) * Rasterizer3D.fieldOfView;
        if (objWidth / pos <= -Rasterizer2D.viewportCenterX)
            return;

        int yRot = offsetY * pitchCos - sceneX * pitchSine >> 16;
        int dimensionCosY = diagonal2DAboveOrigin * pitchSine >> 16;

        int var20 = (pitchCos * this.bottomY >> 16) + dimensionCosY;
        int objHeight = (yRot + var20) * Rasterizer3D.fieldOfView;
        if (objHeight / pos <= -Rasterizer2D.viewportCenterY)
            return;

        int offset = dimensionCosY + (super.modelBaseY * pitchCos >> 16);
        int objY = (yRot - offset) * Rasterizer3D.fieldOfView;
        if (objY / pos >= Rasterizer2D.viewportCenterY)
            return;

        int size = dimensionSinY + (super.modelBaseY * pitchSine >> 16);

        boolean var25 = false;
        boolean nearSight = sceneY - size <= 50;

        boolean inView = nearSight || this.materials != null;

        boolean highlighted = false;
        int var40;
        int var41;
        int var42;
        int var52;
        int var55;
        int var56;
        int var57;
        int field2233 = 0, field2234 = 0, field1055 = 0, field1782 = 0, field2237 = 0, field78 = 0, field2244 = 0, field992 = 0, field410 = 0;
        boolean var33 = uid > 0;
        boolean var31 = mouseInViewport;
        if (var33 && var31) {
            boolean withinBounds = false;
            if (field2214) {
                boolean var38 = mouseInViewport;
                boolean var36;
                if (!var38) {
                    var36 = false;
                } else {
                    int var44;
                    int var45;
                    int var46;
                    int var47;
                    int var48;
                    if (mouseInViewport) {
                        byte var43 = 50;
                        var44 = method3846();
                        var45 = (cursorX - Rasterizer3D.getClipMidX()) * var43 / Rasterizer3D.get3dZoom();
                        var46 = (cursorY - Rasterizer3D.getClipMidY()) * var43 / Rasterizer3D.get3dZoom();
                        var47 = (cursorX - Rasterizer3D.getClipMidX()) * var44 / Rasterizer3D.get3dZoom();
                        var48 = (cursorY - Rasterizer3D.getClipMidY()) * var44 / Rasterizer3D.get3dZoom();
                        int var49 = method2285(var46, var43, pitchCos, pitchSine);
                        var57 = method3247(var46, var43, pitchCos, pitchSine);
                        var46 = var49;
                        var49 = method2285(var48, var44, pitchCos, pitchSine);
                        int var50 = var44 * pitchCos - var48 * pitchSine >> 16;
                        var48 = var49;
                        var49 = method3183(var45, var57, yawCos, yawSin);
                        var57 = method2382(var45, var57, yawCos, yawSin);
                        var45 = var49;
                        var49 = method3183(var47, var50, yawCos, yawSin);
                        var44 = method2382(var47, var50, yawCos, yawSin);
                        field2233 = (var49 + var45) / 2;
                        field2234 = (var48 + var46) / 2;
                        field1055 = (var57 + var44) / 2;
                        field1782 = (var49 - var45) / 2;
                        field2237 = (var48 - var46) / 2;
                        field78 = (var44 - var57) / 2;
                        field410 = Math.abs(field1782);
                        field2244 = Math.abs(field2237);
                        field992 = Math.abs(field78);
                    }

                    AABB var51 = (AABB)this.aabb.get(orientation);
                    var40 = var51.xMid + offsetX;
                    var41 = offsetY + var51.yMid;
                    var42 = offsetZ + var51.zMid;
                    var57 = var51.xMidOffset;
                    var44 = var51.yMidOffset;
                    var45 = var51.zMidOffset;
                    var46 = field2233 - var40;
                    var47 = field2234 - var41;
                    var48 = field1055 - var42;
                    if (Math.abs(var46) > var57 + field410) {
                        var36 = false;
                    } else if (Math.abs(var47) > var44 + field2244) {
                        var36 = false;
                    } else if (Math.abs(var48) > var45 + field992) {
                        var36 = false;
                    } else if (Math.abs(var48 * field2237 - var47 * field78) > var44 * field992 + var45 * field2244) {
                        var36 = false;
                    } else if (Math.abs(var46 * field78 - var48 * field1782) > var45 * field410 + var57 * field992) {
                        var36 = false;
                    } else if (Math.abs(var47 * field1782 - var46 * field2237) > var57 * field2244 + var44 * field410) {
                        var36 = false;
                    } else {
                        var36 = true;
                    }
                }

                withinBounds = var36;
            }

            if(plane < Client.instance.getPlane() && !IGNORE_HEIGHT_FIX.contains(ObjectKeyUtil.getObjectId(uid))) {
                withinBounds = false;
            }

            if (withinBounds) {
                if (this.singleTile) {
                    hoveringObjects[objectsHovering++] = uid;
                } else {
                    highlighted = true;
                }
            }
        }

        int sineX = 0;
        int cosineX = 0;
        if (orientation != 0) {
            sineX = SINE[orientation];
            cosineX = COSINE[orientation];
        }

        for (int index = 0; index < this.verticesCount; ++index) {
            int positionX = this.verticesX[index];
            int rasterY = this.verticesY[index];
            int positionZ = this.verticesZ[index];
            if (orientation != 0) {
                int rotatedX = positionZ * sineX + positionX * cosineX >> 16;
                positionZ = positionZ * cosineX - positionX * sineX >> 16;
                positionX = rotatedX;
            }

            positionX += offsetX;
            rasterY += offsetY;
            positionZ += offsetZ;

            int positionY = positionZ * yawSin + yawCos * positionX >> 16;
            positionZ = yawCos * positionZ - positionX * yawSin >> 16;
            positionX = positionY;
            positionY = pitchCos * rasterY - positionZ * pitchSine >> 16;
            positionZ = rasterY * pitchSine + pitchCos * positionZ >> 16;
            vertexScreenZ[index] = positionZ - sceneY;
            if (positionZ >= 50) {
                vertexScreenX[index] = positionX * Rasterizer3D.fieldOfView / positionZ + Rasterizer3D.originViewX;
                vertexScreenY[index] = positionY * Rasterizer3D.fieldOfView / positionZ + Rasterizer3D.originViewY;
            } else {
                vertexScreenX[index] = -5000;
                var25 = true;
            }

            if (inView) {
                vertexMovedX[index] = positionX;
                vertexMovedY[index] = positionY;
                vertexMovedZ[index] = positionZ;
            }
        }

        try {
            if (!gpu || (highlighted && !(Math.sqrt(offsetX * offsetX + offsetZ * offsetZ) > 35 * Perspective.LOCAL_TILE_SIZE))) {
                withinObject(var25, highlighted, uid, plane);
            }
            if (gpu) {
                Client.instance.getDrawCallbacks().draw(this, orientation, pitchSine, pitchCos, yawSin, yawCos, offsetX, offsetY, offsetZ, uid);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static final int method2382(int var0, int var1, int var2, int var3) {
        return var3 * var0 + var2 * var1 >> 16;
    }

    static final int method3183(int var0, int var1, int var2, int var3) {
        return var0 * var2 - var3 * var1 >> 16;
    }

    static final int method3247(int var0, int var1, int var2, int var3) {
        return var2 * var1 - var3 * var0 >> 16;
    }

    static final int method2285(int var0, int var1, int var2, int var3) {
        return var0 * var2 + var3 * var1 >> 16;
    }

    static final int method3846() {
        return field1964;
    }

    static int field1964 = 0;
    @ObfuscatedName("aq")
    static void method3852(int var0) {
        field1964 = var0;
    }

    @ObfuscatedName("al")
    static void method3874(int var0) {
        int var1 = var0 * 210;
        method3852(var1);
    }

    private boolean inBounds(int x, int y, int z, int screenX, int screenY, int screenZ, int size) {
        int height = cursorY + size;
        if (height < x && height < y && height < z) {
            return false;
        } else {
            height = cursorY - size;
            if (height > x && height > y && height > z) {
                return false;
            } else {
                height = cursorX + size;
                if (height < screenX && height < screenY && height < screenZ) {
                    return false;
                } else {
                    height = cursorX - size;
                    return height <= screenX || height <= screenY || height <= screenZ;
                }
            }
        }
    }
    static final Set<Integer> IGNORE_HEIGHT_FIX = ImmutableSet.of(
            BALANCING_LEDGE_23547,
            26503, 26461, //bandos door
            4469, 4470
    );
    final void withinObject(boolean var25, boolean highlighted, long uid, int plane) {
        final boolean gpu = Client.instance.isGpu() && Rasterizer3D.world;

        if (diagonal3D < 6000) {
            for (int diagonalIndex = 0; diagonalIndex < diagonal3D; diagonalIndex++) {
                depth[diagonalIndex] = 0;
            }

            int size = singleTile ? 20 : 5;

            int var15;
            int var16;
            int var18;
            for (int currentTriangle = 0; currentTriangle < this.trianglesCount; ++currentTriangle) {
                if (this.colorsZ[currentTriangle] != -2) {
                    int triX = this.trianglesX[currentTriangle];
                    int triY = this.trianglesY[currentTriangle];
                    int triZ = this.trianglesZ[currentTriangle];
                    int screenXX = vertexScreenX[triX];
                    int screenXY = vertexScreenX[triY];
                    int screenXZ = vertexScreenX[triZ];
                    int index;

                    if (gpu) {
                        if (screenXX == -5000 || screenXY == -5000 || screenXZ == -5000) {
                            continue;
                        }
                        if (highlighted && inBounds(vertexScreenY[triX], vertexScreenY[triY], vertexScreenY[triZ], screenXX, screenXY, screenXZ,size)) {
                            if(plane >= Client.instance.getPlane() || IGNORE_HEIGHT_FIX.contains(ObjectKeyUtil.getObjectId(uid)))
                                hoveringObjects[objectsHovering++] = uid;
                        }
                        continue;
                    }

                    if (!var25 || screenXX != -5000 && screenXY != -5000 && screenXZ != -5000) {
                        if (highlighted && inBounds(vertexScreenY[triX], vertexScreenY[triY], vertexScreenY[triZ], screenXX, screenXY, screenXZ, size)) {
                            if(plane >= Client.instance.getPlane() || IGNORE_HEIGHT_FIX.contains(ObjectKeyUtil.getObjectId(uid)))
                                hoveringObjects[objectsHovering++] = uid;
                            highlighted = false;
                        }

                        if ((screenXX - screenXY) * (vertexScreenY[triZ] - vertexScreenY[triY]) - (screenXZ - screenXY) * (vertexScreenY[triX] - vertexScreenY[triY]) > 0) {
                            outOfReach[currentTriangle] = false;
                            if (screenXX >= 0 && screenXY >= 0 && screenXZ >= 0 && screenXX <= Rasterizer3D.lastX && screenXY <= Rasterizer3D.lastX && screenXZ <= Rasterizer3D.lastX) {
                                hasAnEdgeToRestrict[currentTriangle] = false;
                            } else {
                                hasAnEdgeToRestrict[currentTriangle] = true;
                            }

                            index = (vertexScreenZ[triX] + vertexScreenZ[triY] + vertexScreenZ[triZ]) / 3 + this.diagonal3DAboveOrigin;
                            if (index < 0)
                                index = 0;

                            faceLists[index][depth[index]++] = currentTriangle;
                        }
                    } else {
                        index = vertexMovedX[triX];
                        var15 = vertexMovedX[triY];
                        var16 = vertexMovedX[triZ];
                        int var30 = vertexMovedY[triX];
                        var18 = vertexMovedY[triY];
                        int var19 = vertexMovedY[triZ];
                        int var20 = vertexMovedZ[triX];
                        int var21 = vertexMovedZ[triY];
                        int var22 = vertexMovedZ[triZ];
                        index -= var15;
                        var16 -= var15;
                        var30 -= var18;
                        var19 -= var18;
                        var20 -= var21;
                        var22 -= var21;
                        int var23 = var30 * var22 - var20 * var19;
                        int var24 = var20 * var16 - index * var22;
                        int var25a = index * var19 - var30 * var16;
                        if (var15 * var23 + var18 * var24 + var21 * var25a > 0) {
                            outOfReach[currentTriangle] = true;
                            int var26 = (vertexScreenZ[triX] + vertexScreenZ[triY] + vertexScreenZ[triZ]) / 3 + this.diagonal3DAboveOrigin;
                            faceLists[var26][depth[var26]++] = currentTriangle;
                        }
                    }
                }
            }
            if (gpu) {
//                System.out.println("GPU mode");
                return;
            }
            if (this.renderPriorities == null) {
                for (int faceIndex = this.diagonal3D - 1; faceIndex >= 0; --faceIndex) {
                    int depth = Model.depth[faceIndex];
                    if (depth > 0) {
                        for (int index = 0; index < depth; ++index) {
                            this.drawFace(faceLists[faceIndex][index]);
                        }
                    }
                }

            } else {
                for (int currentIndex = 0; currentIndex < 12; ++currentIndex) {
                    anIntArray1673[currentIndex] = 0;
                    anIntArray1677[currentIndex] = 0;
                }

                for (int depthIndex = this.diagonal3D - 1; depthIndex >= 0; --depthIndex) {
                    int var8 = depth[depthIndex];
                    if (var8 > 0) {

                        for (int var10 = 0; var10 < var8; ++var10) {
                            int var11 = faceLists[depthIndex][var10];
                            byte var31 = this.renderPriorities[var11];
                            int var28 = anIntArray1673[var31]++;
                            anIntArrayArray1674[var31][var28] = var11;
                            if (var31 < 10) {
                                anIntArray1677[var31] += depthIndex;
                            } else if (var31 == 10) {
                                anIntArray1675[var28] = depthIndex;
                            } else {
                                anIntArray1676[var28] = depthIndex;
                            }
                        }
                    }
                }

                int var7 = 0;
                if (anIntArray1673[1] > 0 || anIntArray1673[2] > 0) {
                    var7 = (anIntArray1677[1] + anIntArray1677[2]) / (anIntArray1673[1] + anIntArray1673[2]);
                }

                int var8 = 0;
                if (anIntArray1673[3] > 0 || anIntArray1673[4] > 0) {
                    var8 = (anIntArray1677[3] + anIntArray1677[4]) / (anIntArray1673[3] + anIntArray1673[4]);
                }

                int var9 = 0;
                if (anIntArray1673[6] > 0 || anIntArray1673[8] > 0) {
                    var9 = (anIntArray1677[8] + anIntArray1677[6]) / (anIntArray1673[8] + anIntArray1673[6]);
                }

                int var11 = 0;
                int var12 = anIntArray1673[10];
                int[] var13 = anIntArrayArray1674[10];
                int[] var14 = anIntArray1675;
                if (var11 == var12) {
                    var11 = 0;
                    var12 = anIntArray1673[11];
                    var13 = anIntArrayArray1674[11];
                    var14 = anIntArray1676;
                }

                int var10;
                if (var11 < var12) {
                    var10 = var14[var11];
                } else {
                    var10 = -1000;
                }

                for (var15 = 0; var15 < 10; ++var15) {
                    while (var15 == 0 && var10 > var7) {
                        this.drawFace(var13[var11++]);
                        if (var11 == var12 && var13 != anIntArrayArray1674[11]) {
                            var11 = 0;
                            var12 = anIntArray1673[11];
                            var13 = anIntArrayArray1674[11];
                            var14 = anIntArray1676;
                        }

                        if (var11 < var12) {
                            var10 = var14[var11];
                        } else {
                            var10 = -1000;
                        }
                    }

                    while (var15 == 3 && var10 > var8) {
                        this.drawFace(var13[var11++]);
                        if (var11 == var12 && var13 != anIntArrayArray1674[11]) {
                            var11 = 0;
                            var12 = anIntArray1673[11];
                            var13 = anIntArrayArray1674[11];
                            var14 = anIntArray1676;
                        }

                        if (var11 < var12) {
                            var10 = var14[var11];
                        } else {
                            var10 = -1000;
                        }
                    }

                    while (var15 == 5 && var10 > var9) {
                        this.drawFace(var13[var11++]);
                        if (var11 == var12 && var13 != anIntArrayArray1674[11]) {
                            var11 = 0;
                            var12 = anIntArray1673[11];
                            var13 = anIntArrayArray1674[11];
                            var14 = anIntArray1676;
                        }

                        if (var11 < var12) {
                            var10 = var14[var11];
                        } else {
                            var10 = -1000;
                        }
                    }

                    var16 = anIntArray1673[var15];
                    int[] var17 = anIntArrayArray1674[var15];

                    for (var18 = 0; var18 < var16; ++var18) {
                        this.drawFace(var17[var18]);
                    }
                }

                while (var10 != -1000) {
                    this.drawFace(var13[var11++]);
                    if (var11 == var12 && var13 != anIntArrayArray1674[11]) {
                        var11 = 0;
                        var13 = anIntArrayArray1674[11];
                        var12 = anIntArray1673[11];
                        var14 = anIntArray1676;
                    }

                    if (var11 < var12) {
                        var10 = var14[var11];
                    } else {
                        var10 = -1000;
                    }
                }

            }
        }
        /*for (int m = 0; m < verticesCount; m++) {

            int pid = modelParticles[m] - 1;
            if (pid < 0) {
                continue;
            }

            ParticleDefinition def = ParticleDefinition.cache[pid];
            int pX = verticesX[m] >> 0;
            int pY = verticesY[m] >> 0;
            int pZ = verticesZ[m] >> 0;
            if (lastRenderedRotation != 0) {
                int sine = Model.SINE[lastRenderedRotation];
                int cosine = Model.COSINE[lastRenderedRotation];
                int rotatedX = pZ * sine + pX * cosine >> 16;
                pZ = pZ * cosine - pX * sine >> 16;
                pX = rotatedX;
            }
            pX += offX;
            pZ += offZ;
            com.client.particle.Vector basePos = new com.client.particle.Vector(pX, -pY, pZ);
            for (int p = 0; p < def.getSpawnRate(); p++) {
                Particle particle = new Particle(def, basePos, pid);
                Client.instance.addParticle(particle);
            }
        }*/
    }

    private int lastRenderedRotation = 0;
    public void drawFace(int face) { //method484
        if (outOfReach[face]) {
            faceRotation(face);
            return;
        }
        int triX = trianglesX[face];
        int triY = trianglesY[face];
        int triZ = trianglesZ[face];
        Rasterizer3D.textureOutOfDrawingBounds = hasAnEdgeToRestrict[face];
        if (faceTransparencies == null)
            Rasterizer3D.alpha = 0;
        else
            Rasterizer3D.alpha = faceTransparencies[face] & 0xff;

        int type;
        if (drawType == null)
            type = 0;
        else
            type = drawType[face] & 3;

        if (materials != null && materials[face] != -1) {
            int textureA = triX;
            int textureB = triY;
            int textureC = triZ;
            if (textures != null && textures[face] != -1) {
                int coordinate = textures[face] & 0xff;
                textureA = texturesX[coordinate];
                textureB = texturesY[coordinate];
                textureC = texturesZ[coordinate];
            }

            if (colorsZ[face] == -1 || type == 3) {
                Rasterizer3D.drawTexturedTriangle(
                        vertexScreenY[triX], vertexScreenY[triY], vertexScreenY[triZ],
                        vertexScreenX[triX], vertexScreenX[triY], vertexScreenX[triZ],
                        colorsX[face], colorsX[face], colorsX[face],
                        vertexMovedX[textureA], vertexMovedX[textureB], vertexMovedX[textureC],
                        vertexMovedY[textureA], vertexMovedY[textureB], vertexMovedY[textureC],
                        vertexMovedZ[textureA], vertexMovedZ[textureB], vertexMovedZ[textureC],
                        materials[face]);
            } else {
                Rasterizer3D.drawTexturedTriangle(
                        vertexScreenY[triX], vertexScreenY[triY], vertexScreenY[triZ],
                        vertexScreenX[triX], vertexScreenX[triY], vertexScreenX[triZ],
                        colorsX[face], colorsY[face], colorsZ[face],
                        vertexMovedX[textureA], vertexMovedX[textureB], vertexMovedX[textureC],
                        vertexMovedY[textureA], vertexMovedY[textureB], vertexMovedY[textureC],
                        vertexMovedZ[textureA], vertexMovedZ[textureB], vertexMovedZ[textureC],
                        materials[face]);
            }

        } else if(colorsZ[face] == -1) {//From old to new clause
            Rasterizer3D.drawFlatTriangle(
                    vertexScreenY[triX], vertexScreenY[triY], vertexScreenY[triZ],
                    vertexScreenX[triX], vertexScreenX[triY], vertexScreenX[triZ],
                    modelColors[colorsX[face]]);

        } else {
            if (type == 0) {
                Rasterizer3D.drawShadedTriangle(vertexScreenY[triX], vertexScreenY[triY],
                        vertexScreenY[triZ], vertexScreenX[triX], vertexScreenX[triY],
                        vertexScreenX[triZ], colorsX[face], colorsY[face], colorsZ[face]);
            }
            if (type == 1) {
                Rasterizer3D.drawFlatTriangle(vertexScreenY[triX], vertexScreenY[triY],
                        vertexScreenY[triZ], vertexScreenX[triX], vertexScreenX[triY],
                        vertexScreenX[triZ], modelColors[colorsX[face]]);
            }
        }
    }

    private final void faceRotation(int triangle) {
        int centreX = Rasterizer3D.originViewX;
        int centreY = Rasterizer3D.originViewY;
        int counter = 0;
        int x = trianglesX[triangle];
        int y = trianglesY[triangle];
        int z = trianglesZ[triangle];
        int movedX = vertexMovedZ[x];
        int movedY = vertexMovedZ[y];
        int movedZ = vertexMovedZ[z];
        if (movedX >= 50) {
            xPosition[counter] = vertexScreenX[x];
            yPosition[counter] = vertexScreenY[x];
            zPosition[counter++] = colorsX[triangle];
        } else {
            int movedX2 = vertexMovedX[x];
            int movedY2 = vertexMovedY[x];
            int colour = colorsX[triangle];
            if (movedZ >= 50) {
                int k5 = (50 - movedX) * modelLocations[movedZ - movedX];
                xPosition[counter] = centreX + (movedX2 + ((vertexMovedX[z] - movedX2) * k5 >> 16)) * Rasterizer3D.fieldOfView / 50;
                yPosition[counter] = centreY + (movedY2 + ((vertexMovedY[z] - movedY2) * k5 >> 16)) * Rasterizer3D.fieldOfView / 50;
                zPosition[counter++] = colour + ((colorsZ[triangle] - colour) * k5 >> 16);
            }
            if (movedY >= 50) {
                int l5 = (50 - movedX) * modelLocations[movedY - movedX];
                xPosition[counter] = centreX + (movedX2 + ((vertexMovedX[y] - movedX2) * l5 >> 16)) * Rasterizer3D.fieldOfView / 50;
                yPosition[counter] = centreY + (movedY2 + ((vertexMovedY[y] - movedY2) * l5 >> 16)) * Rasterizer3D.fieldOfView / 50;
                zPosition[counter++] = colour + ((colorsY[triangle] - colour) * l5 >> 16);
            }
        }
        if (movedY >= 50) {
            xPosition[counter] = vertexScreenX[y];
            yPosition[counter] = vertexScreenY[y];
            zPosition[counter++] = colorsY[triangle];
        } else {
            int movedX2 = vertexMovedX[y];
            int movedY2 = vertexMovedY[y];
            int colour = colorsY[triangle];
            if (movedX >= 50) {
                int i6 = (50 - movedY) * modelLocations[movedX - movedY];
                xPosition[counter] = centreX + (movedX2 + ((vertexMovedX[x] - movedX2) * i6 >> 16)) * Rasterizer3D.fieldOfView / 50;
                yPosition[counter] = centreY + (movedY2 + ((vertexMovedY[x] - movedY2) * i6 >> 16)) * Rasterizer3D.fieldOfView / 50;
                zPosition[counter++] = colour + ((colorsX[triangle] - colour) * i6 >> 16);
            }
            if (movedZ >= 50) {
                int j6 = (50 - movedY) * modelLocations[movedZ - movedY];
                xPosition[counter] = centreX + (movedX2 + ((vertexMovedX[z] - movedX2) * j6 >> 16)) * Rasterizer3D.fieldOfView / 50;
                yPosition[counter] = centreY + (movedY2 + ((vertexMovedY[z] - movedY2) * j6 >> 16)) * Rasterizer3D.fieldOfView / 50;
                zPosition[counter++] = colour + ((colorsZ[triangle] - colour) * j6 >> 16);
            }
        }
        if (movedZ >= 50) {
            xPosition[counter] = vertexScreenX[z];
            yPosition[counter] = vertexScreenY[z];
            zPosition[counter++] = colorsZ[triangle];
        } else {
            int movedX2 = vertexMovedX[z];
            int movedY2 = vertexMovedY[z];
            int colour = colorsZ[triangle];
            if (movedY >= 50) {
                int k6 = (50 - movedZ) * modelLocations[movedY - movedZ];
                xPosition[counter] = centreX + (movedX2 + ((vertexMovedX[y] - movedX2) * k6 >> 16)) * Rasterizer3D.fieldOfView / 50;
                yPosition[counter] = centreY + (movedY2 + ((vertexMovedY[y] - movedY2) * k6 >> 16)) * Rasterizer3D.fieldOfView / 50;
                zPosition[counter++] = colour + ((colorsY[triangle] - colour) * k6 >> 16);
            }
            if (movedX >= 50) {
                int l6 = (50 - movedZ) * modelLocations[movedX - movedZ];
                xPosition[counter] = centreX + (movedX2 + ((vertexMovedX[x] - movedX2) * l6 >> 16)) * Rasterizer3D.fieldOfView / 50;
                yPosition[counter] = centreY + (movedY2 + ((vertexMovedY[x] - movedY2) * l6 >> 16)) * Rasterizer3D.fieldOfView / 50;
                zPosition[counter++] = colour + ((colorsX[triangle] - colour) * l6 >> 16);
            }
        }
        int xA = xPosition[0];
        int xB = xPosition[1];
        int xC = xPosition[2];
        int yA = yPosition[0];
        int yB = yPosition[1];
        int yC = yPosition[2];
        if ((xA - xB) * (yC - yB) - (yA - yB) * (xC - xB) > 0) {
            Rasterizer3D.textureOutOfDrawingBounds = false;
            int textureA = x;
            int textureB = y;
            int textureC = z;
            if (counter == 3) {
                if (xA < 0 || xB < 0 || xC < 0 || xA > Rasterizer2D.lastX || xB > Rasterizer2D.lastX || xC > Rasterizer2D.lastX) {
                    Rasterizer3D.textureOutOfDrawingBounds = true;
                }

                int drawType;
                if (this.drawType == null) {
                    drawType = 0;
                } else {
                    drawType = this.drawType[triangle] & 3;
                }

                if (materials != null && materials[triangle] != -1) {

                    if (textures != null && textures[triangle] != -1) {
                        int coordinate = textures[triangle] & 0xff;
                        textureA = texturesX[coordinate];
                        textureB = texturesY[coordinate];
                        textureC = texturesZ[coordinate];
                    }

                    if (colorsZ[triangle] == -1) {
                        Rasterizer3D.drawTexturedTriangle(
                                yA, yB, yC,
                                xA, xB, xC,
                                colorsX[triangle], colorsX[triangle], colorsX[triangle],
                                vertexMovedX[textureA], vertexMovedX[textureB], vertexMovedX[textureC],
                                vertexMovedY[textureA], vertexMovedY[textureB], vertexMovedY[textureC],
                                vertexMovedZ[textureA], vertexMovedZ[textureB], vertexMovedZ[textureC],
                                materials[triangle]);
                    } else {
                        Rasterizer3D.drawTexturedTriangle(
                                yA, yB, yC,
                                xA, xB, xC,
                                zPosition[0], zPosition[1], zPosition[2],
                                vertexMovedX[textureA], vertexMovedX[textureB], vertexMovedX[textureC],
                                vertexMovedY[textureA], vertexMovedY[textureB], vertexMovedY[textureC],
                                vertexMovedZ[textureA], vertexMovedZ[textureB], vertexMovedZ[textureC],
                                materials[triangle]);
                    }
                } else {
                    if (drawType == 0) {
                        Rasterizer3D.drawShadedTriangle(yA, yB, yC, xA, xB, xC, zPosition[0], zPosition[1], zPosition[2]);
                    } else if (drawType == 1) {
                        Rasterizer3D.drawFlatTriangle(yA, yB, yC, xA, xB, xC, modelColors[colorsX[triangle]]);
                    }
                }
            }
            if (counter == 4) {
                if (xA < 0 || xB < 0 || xC < 0 || xA > Rasterizer2D.lastX || xB > Rasterizer2D.lastX || xC > Rasterizer2D.lastX || xPosition[3] < 0 || xPosition[3] > Rasterizer2D.lastX) {
                    Rasterizer3D.textureOutOfDrawingBounds = true;
                }
                int drawType;
                if (this.drawType == null) {
                    drawType = 0;
                } else {
                    drawType = this.drawType[triangle] & 3;
                }

                if (materials != null && materials[triangle] != -1) {
                    if (textures != null && textures[triangle] != -1) {
                        int coordinate = textures[triangle] & 0xff;
                        textureA = texturesX[coordinate];
                        textureB = texturesY[coordinate];
                        textureC = texturesZ[coordinate];
                    }
                    if (colorsZ[triangle] == -1) {
                        Rasterizer3D.drawTexturedTriangle(
                                yA, yB, yC,
                                xA, xB, xC,
                                colorsX[triangle], colorsX[triangle], colorsX[triangle],
                                vertexMovedX[textureA], vertexMovedX[textureB], vertexMovedX[textureC],
                                vertexMovedY[textureA], vertexMovedY[textureB], vertexMovedY[textureC],
                                vertexMovedZ[textureA], vertexMovedZ[textureB], vertexMovedZ[textureC],
                                materials[triangle]);
                        Rasterizer3D.drawTexturedTriangle(
                                yA, yC, yPosition[3],
                                xA, xC, xPosition[3],
                                colorsX[triangle], colorsX[triangle], colorsX[triangle],
                                vertexMovedX[textureA], vertexMovedX[textureB], vertexMovedX[textureC],
                                vertexMovedY[textureA], vertexMovedY[textureB], vertexMovedY[textureC],
                                vertexMovedZ[textureA], vertexMovedZ[textureB], vertexMovedZ[textureC],
                                materials[triangle]);
                    } else {
                        Rasterizer3D.drawTexturedTriangle(
                                yA, yB, yC,
                                xA, xB, xC,
                                zPosition[0], zPosition[1], zPosition[2],
                                vertexMovedX[textureA], vertexMovedX[textureB], vertexMovedX[textureC],
                                vertexMovedY[textureA], vertexMovedY[textureB], vertexMovedY[textureC],
                                vertexMovedZ[textureA], vertexMovedZ[textureB], vertexMovedZ[textureC],
                                materials[triangle]);
                        Rasterizer3D.drawTexturedTriangle(
                                yA, yC, yPosition[3],
                                xA, xC, xPosition[3],
                                zPosition[0], zPosition[2], zPosition[3],
                                vertexMovedX[textureA], vertexMovedX[textureB], vertexMovedX[textureC],
                                vertexMovedY[textureA], vertexMovedY[textureB], vertexMovedY[textureC],
                                vertexMovedZ[textureA], vertexMovedZ[textureB], vertexMovedZ[textureC],
                                materials[triangle]);
                    }
                } else {
                    if (drawType == 0) {
                        Rasterizer3D.drawShadedTriangle(yA, yB, yC, xA, xB, xC, zPosition[0], zPosition[1], zPosition[2]);
                        Rasterizer3D.drawShadedTriangle(yA, yC, yPosition[3], xA, xC, xPosition[3], zPosition[0], zPosition[2], zPosition[3]);
                        return;
                    }
                    if (drawType == 1) {
                        int l8 = modelColors[colorsX[triangle]];
                        Rasterizer3D.drawFlatTriangle(yA, yB, yC, xA, xB, xC, l8);
                        Rasterizer3D.drawFlatTriangle(yA, yC, yPosition[3], xA, xC, xPosition[3], l8);
                    }
                }
            }
        }
    }



    private int boundsType;
    boolean isBoundsCalculated;

    public int skeletalBones[][];
    public int skeletalScales[][];

    private float[] faceTextureUVCoordinates;
    public int[] vertexNormalsX, vertexNormalsY, vertexNormalsZ;

    public short[] materials;
    public byte[] textures;
    public byte[] textureTypes;

    public static int anInt1620;
    public static Model emptyModel = new Model();
    private static int sharedVerticesX[] = new int[2000];
    private static int sharedVerticesY[] = new int[2000];
    private static int sharedVerticesZ[] = new int[2000];
    private static byte sharedTriangleAlpha[] = new byte[2000];
    public int[] modelParticles;
    public int verticesCount;
    public int verticesX[];
    public int verticesY[];
    public int verticesZ[];
    public int trianglesCount;
    public int trianglesX[];
    public int trianglesY[];
    public int trianglesZ[];
    public int colorsX[];
    public int colorsY[];
    public int colorsZ[];
    public int drawType[];
    public byte[] renderPriorities;
    public byte faceTransparencies[];
    public short colors[];
    public byte facePriority = 0;
    public int texturesCount;
    public int texturesX[];
    public int texturesY[];
    public int texturesZ[];
    public int minX;
    public int maxX;
    public int maxZ;
    public int minZ;
    public int diagonal2DAboveOrigin;
    public int bottomY;
    public int diagonal3D;
    public int diagonal3DAboveOrigin;
    public int itemDropHeight;
    public int vertexData[];
    public int triangleData[];
    public int groupedVertexLabels[][];
    public int groupedTriangleLabels[][];


    public short ambient;

    public short contrast;

    public boolean isSingleTile = false;
    public boolean singleTile;
    public VertexNormal vertexNormalsOffsets[];
    private FaceNormal[] faceNormals;
    static ModelHeader modelHeaders[];
    static boolean hasAnEdgeToRestrict[] = new boolean[25000];
    static boolean outOfReach[] = new boolean[25000];
    static int vertexScreenX[] = new int[25000];
    static int vertexScreenY[] = new int[25000];
    static int vertexScreenZ[] = new int[25000];
    static int vertexMovedX[] = new int[25000];
    static int vertexMovedY[] = new int[25000];
    static int vertexMovedZ[] = new int[25000];
    static int depth[] = new int[6000];
    static int faceLists[][] = new int[6000][2048];
    static int anIntArray1673[] = new int[12];
    static int anIntArrayArray1674[][] = new int[12][25000];
    static int anIntArray1676[] = new int[25000];
    static int anIntArray1675[] = new int[25000];
    static int anIntArray1677[] = new int[12];
    static int xPosition[] = new int[10];
    static int yPosition[] = new int[10];
    static int zPosition[] = new int[10];
    static int xAnimOffset;
    static int yAnimOffset;
    static int zAnimOffset;
    public static boolean objectExist;
    public static int cursorX;
    public static int cursorY;
    public static int objectsHovering;
    public static long hoveringObjects[] = new long[25000];
    public static int SINE[];
    public static int COSINE[];
    static int modelColors[];
    static int modelLocations[];

    HashMap<Integer, net.runelite.api.AABB> aabb = new HashMap<Integer, net.runelite.api.AABB>();

    static {
        SINE = Rasterizer3D.SINE;
        COSINE = Rasterizer3D.COSINE;
        modelColors = Rasterizer3D.hslToRgb;
        modelLocations = Rasterizer3D.anIntArray1469;
    }


    public int bufferOffset;
    public int uvBufferOffset;

    @Override
    public List<Vertex> getVertices() {
        int[] verticesX = getVerticesX();
        int[] verticesY = getVerticesY();
        int[] verticesZ = getVerticesZ();
        ArrayList<Vertex> vertices = new ArrayList<>(getVerticesCount());
        for (int i = 0; i < getVerticesCount(); i++) {
            Vertex vertex = new Vertex(verticesX[i], verticesY[i], verticesZ[i]);
            vertices.add(vertex);
        }
        return vertices;
    }

    @Override
    public List<Triangle> getTriangles() {
        int[] trianglesX = getFaceIndices1();
        int[] trianglesY = getFaceIndices2();
        int[] trianglesZ = getFaceIndices3();

        List<Vertex> vertices = getVertices();
        List<Triangle> triangles = new ArrayList<>(getFaceCount());

        for (int i = 0; i < getFaceCount(); ++i)
        {
            int triangleX = trianglesX[i];
            int triangleY = trianglesY[i];
            int triangleZ = trianglesZ[i];

            Triangle triangle = new Triangle(vertices.get(triangleX),vertices.get(triangleY),vertices.get(triangleZ));
            triangles.add(triangle);
        }

        return triangles;
    }

    @Override
    public int getVerticesCount() {
        return verticesCount;
    }

    @Override
    public int[] getVerticesX() {
        return verticesX;
    }

    @Override
    public int[] getVerticesY() {
        return verticesY;
    }

    @Override
    public int[] getVerticesZ() {
        return verticesZ;
    }

    @Override
    public int getFaceCount() {
        return this.trianglesCount;
    }

    @Override
    public int[] getFaceIndices1() {
        return trianglesX;
    }

    @Override
    public int[] getFaceIndices2() {
        return trianglesY;
    }

    @Override
    public int[] getFaceIndices3() {
        return trianglesZ;
    }

    @Override
    public int[] getFaceColors1() {
        return this.colorsX;
    }

    @Override
    public int[] getFaceColors2() {
        return colorsY;
    }

    @Override
    public int[] getFaceColors3() {
        return colorsZ;
    }

    @Override
    public byte[] getFaceTransparencies() {
        return faceTransparencies;
    }

    private int sceneId;

    @Override
    public int getSceneId() {
        return sceneId;
    }

    @Override
    public void setSceneId(int sceneId) {
        this.sceneId = sceneId;
    }

    @Override
    public int getBufferOffset() {
        return bufferOffset;
    }

    @Override
    public void setBufferOffset(int bufferOffset) {
        this.bufferOffset = bufferOffset;
    }

    @Override
    public int getUvBufferOffset() {
        return uvBufferOffset;
    }

    @Override
    public void setUvBufferOffset(int uvBufferOffset) {
        this.uvBufferOffset = uvBufferOffset;
    }

    @Override
    public int getModelHeight() {
        return modelBaseY;
    }

    @Override
    public void animate(int type, int[] list, int x, int y, int z) {

    }

    @Override
    public byte[] getFaceRenderPriorities() {
        return this.renderPriorities;
    }

    @Override
    public int[][] getGroupedVertexLabels() {
        return new int[0][];
    }

    @Override
    public int getRadius() {
        return diagonal3DAboveOrigin;
    }

    @Override
    public int getDiameter() {
        return diagonal3D;
    }

    @Override
    public short[] getFaceTextures() {
        return materials;
    }

    @Override
    public void calculateExtreme(int orientation) {
        calculateBoundingBox(orientation);
    }

    public void resetBounds() {
        this.boundsType = 0;
        this.aabb.clear();
    }

    @Override
    public RSModel toSharedModel(boolean b) {
        return null;
    }

    @Override
    public RSModel toSharedSpotAnimModel(boolean b) {
        return null;
    }

    void invalidate() {
        this.vertexNormalsOffsets = null;
        this.normals = null;
        this.faceNormals = null;
        this.isBoundsCalculated = false;
    }

    @Override
    public Model rotateY90Ccw() {
        rotate90Degrees();
        this.resetBounds();
        invalidate();
        return this;
    }

    @Override
    public Model rotateY180Ccw() {
        for (int vert = 0; vert < this.verticesCount; ++vert)
        {
            this.verticesX[vert] = -this.verticesX[vert];
            this.verticesZ[vert] = -this.verticesZ[vert];
        }

        this.resetBounds();
        invalidate();
        return this;
    }

    private RSModel unskewedModel;

    @Override
    public void setUnskewedModel(RSModel unskewedModel)
    {
        this.unskewedModel = unskewedModel;
    }

    @Override
    public RSModel getUnskewedModel()
    {
        return unskewedModel;
    }
    @Override
    public Model rotateY270Ccw() {
        for (int vert = 0; vert < this.verticesCount; ++vert)
        {
            int var2 = this.verticesZ[vert];
            this.verticesZ[vert] = this.verticesX[vert];
            this.verticesX[vert] = -var2;
        }

        this.resetBounds();
        invalidate();
        return this;
    }

    @Override
    public int getXYZMag() {
        return diagonal2DAboveOrigin;
    }

    @Override
    public boolean isClickable() {
        return singleTile;
    }

    @Override
    public void interpolateFrames(RSFrames frames, int frameId, RSFrames nextFrames, int nextFrameId, int interval, int intervalCount) {

    }

    @Override
    public int[] getVertexNormalsX() {
        if (vertexNormalsX == null) {
            vertexNormals();
        }
        return vertexNormalsX;
    }

    @Override
    public void setVertexNormalsX(int[] vertexNormalsX) {
        this.vertexNormalsX = vertexNormalsX;
    }

    @Override
    public int[] getVertexNormalsY() {
        if (vertexNormalsY == null) {
            vertexNormals();
        }
        return vertexNormalsY;
    }

    @Override
    public void setVertexNormalsY(int[] vertexNormalsY) {
        this.vertexNormalsY = vertexNormalsY;
    }

    @Override
    public int[] getVertexNormalsZ() {
        if (vertexNormalsZ == null) {
            vertexNormals();
        }
        return vertexNormalsZ;
    }

    @Override
    public void setVertexNormalsZ(int[] vertexNormalsZ) {
        this.vertexNormalsZ = vertexNormalsZ;
    }


    @Override
    public byte getOverrideAmount() {
        return 0;
    }

    @Override
    public byte getOverrideHue() {
        return 0;
    }

    @Override
    public byte getOverrideSaturation() {
        return 0;
    }

    @Override
    public byte getOverrideLuminance() {
        return 0;
    }

    @Override
    public HashMap<Integer, net.runelite.api.AABB> getAABBMap() {
        return aabb;
    }

    @Override
    public Shape getConvexHull(int localX, int localY, int orientation, int tileHeight) {
        int[] x2d = new int[getVerticesCount()];
        int[] y2d = new int[getVerticesCount()];

        Perspective.modelToCanvas(Client.instance, getVerticesCount(), localX, localY, tileHeight, orientation, getVerticesX(), getVerticesZ(), getVerticesY(), x2d, y2d);

        return Jarvis.convexHull(x2d, y2d);
    }

    @Override
    public int getBottomY() {
        return modelBaseY;
    }

    private void vertexNormals()
    {

        if (vertexNormalsX == null)
        {
            int verticesCount = getVerticesCount();

            vertexNormalsX = new int[verticesCount];
            vertexNormalsY = new int[verticesCount];
            vertexNormalsZ = new int[verticesCount];

            int[] trianglesX = getFaceIndices1();
            int[] trianglesY = getFaceIndices2();
            int[] trianglesZ = getFaceIndices3();
            int[] verticesX = getVerticesX();
            int[] verticesY = getVerticesY();
            int[] verticesZ = getVerticesZ();

            for (int i = 0; i < trianglesCount; ++i)
            {
                int var9 = trianglesX[i];
                int var10 = trianglesY[i];
                int var11 = trianglesZ[i];

                int var12 = verticesX[var10] - verticesX[var9];
                int var13 = verticesY[var10] - verticesY[var9];
                int var14 = verticesZ[var10] - verticesZ[var9];
                int var15 = verticesX[var11] - verticesX[var9];
                int var16 = verticesY[var11] - verticesY[var9];
                int var17 = verticesZ[var11] - verticesZ[var9];

                int var18 = var13 * var17 - var16 * var14;
                int var19 = var14 * var15 - var17 * var12;

                int var20;
                for (var20 = var12 * var16 - var15 * var13; var18 > 8192 || var19 > 8192 || var20 > 8192 || var18 < -8192 || var19 < -8192 || var20 < -8192; var20 >>= 1)
                {
                    var18 >>= 1;
                    var19 >>= 1;
                }

                int var21 = (int) Math.sqrt(var18 * var18 + var19 * var19 + var20 * var20);
                if (var21 <= 0)
                {
                    var21 = 1;
                }

                var18 = var18 * 256 / var21;
                var19 = var19 * 256 / var21;
                var20 = var20 * 256 / var21;

                vertexNormalsX[var9] += var18;
                vertexNormalsY[var9] += var19;
                vertexNormalsZ[var9] += var20;

                vertexNormalsX[var10] += var18;
                vertexNormalsY[var10] += var19;
                vertexNormalsZ[var10] += var20;

                vertexNormalsX[var11] += var18;
                vertexNormalsY[var11] += var19;
                vertexNormalsZ[var11] += var20;
            }
        }
    }

    public int lastOrientation = -1;

    @Override
    public int getLastOrientation() {
        return lastOrientation;
    }

    @Override
    public Model cloneColors() {
        short[] newFaceColor = Arrays.copyOf(this.getFaceColors(), this.getFaceColors().length);
        this.setFaceColors(newFaceColor);
        return this;
    }

    @Override
    public AABB getAABB(int orientation) {
        calculateExtreme(orientation);
        lastOrientation = orientation;
        return (AABB) getAABBMap().get(lastOrientation);
    }



    public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
        this.calculateBoundsCylinder();
        int var7 = var2 - this.diagonal2DAboveOrigin;
        int var8 = var2 + this.diagonal2DAboveOrigin;
        int var9 = var4 - this.diagonal2DAboveOrigin;
        int var10 = var4 + this.diagonal2DAboveOrigin;
        if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
            var7 >>= 7;
            var8 = var8 + 127 >> 7;
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
                return this;
            } else {
                Model var11;
                if (var5) {
                    var11 = new Model();
                    var11.verticesCount = this.verticesCount;
                    var11.trianglesCount = this.trianglesCount;
                    var11.texturesCount = this.texturesCount;
                    var11.verticesX = this.verticesX;
                    var11.verticesZ = this.verticesZ;
                    var11.modelParticles = this.modelParticles;
                    var11.trianglesX = this.trianglesX;
                    var11.trianglesY = this.trianglesY;
                    var11.trianglesZ = this.trianglesZ;
                    var11.colorsX = this.colorsX;
                    var11.colorsY = this.colorsY;
                    var11.colorsZ = this.colorsZ;
                    var11.renderPriorities = this.renderPriorities;
                    var11.faceTransparencies = this.faceTransparencies;
                    var11.textures = this.textures;
                    var11.materials = this.materials;
                    var11.facePriority = this.facePriority;
                    var11.texturesX = this.texturesX;
                    var11.texturesY = this.texturesY;
                    var11.texturesZ = this.texturesZ;
                    var11.groupedVertexLabels = this.groupedVertexLabels;
                    var11.groupedTriangleLabels = this.groupedTriangleLabels;
                    var11.isSingleTile = this.isSingleTile;
                    var11.verticesY = new int[var11.verticesCount];
                } else {
                    var11 = this;
                }

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

                var11.resetBounds();
                return var11;
            }
        } else {
            if ((Client.instance.getGpuFlags() & 2) == 2)
            {
                setUnskewedModel(this);
            }
            return this;
        }
    }


    private short[] originalColors;



    private void setFaceColors(short[] newFaceColor) {
        this.colors = newFaceColor;
    }

    public short[] getFaceColors() {
        return colors;
    }
}