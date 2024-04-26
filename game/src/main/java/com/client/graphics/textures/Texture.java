package com.client.graphics.textures;

import com.client.*;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.disk.AbstractArchive;
import net.runelite.rs.api.RSTexture;

public class Texture extends DualNode implements RSTexture {

    private static int[] animatedPixels;

    public int averageRGB;

    public boolean isTransparent;

    public int[] fileIds;

    int[] field2439;

    int[] field2440;

    public int[] field2441;

    public int animationDirection;

    public int animationSpeed;

    transient int[] pixels;

    int id;

    transient boolean isLoaded = false;

    Texture(Buffer var1) {
        this.averageRGB = var1.readUShort();
        this.isTransparent = var1.readUnsignedByte() == 1;
        int fileCount = var1.readUnsignedByte();
        if (fileCount >= 1 && fileCount <= 4) {
            this.fileIds = new int[fileCount];

            int var3;
            for(var3 = 0; var3 < fileCount; ++var3) {
                this.fileIds[var3] = var1.readUShort();
            }

            if (fileCount > 1) {
                this.field2439 = new int[fileCount - 1];

                for(var3 = 0; var3 < fileCount - 1; ++var3) {
                    this.field2439[var3] = var1.readUnsignedByte();
                }
            }

            if (fileCount > 1) {
                this.field2440 = new int[fileCount - 1];

                for(var3 = 0; var3 < fileCount - 1; ++var3) {
                    this.field2440[var3] = var1.readUnsignedByte();
                }
            }

            this.field2441 = new int[fileCount];

            for(var3 = 0; var3 < fileCount; ++var3) {
                this.field2441[var3] = var1.readInt();
            }

            this.animationDirection = var1.readUnsignedByte();
            this.animationSpeed = var1.readUnsignedByte();
            this.pixels = null;
            this.customTexture = averageRGB == 26715;
        } else {
            throw new RuntimeException();
        }
    }

    public Texture(Texture originalTexture, int newID) {
        this.isLoaded = false;
        int count = 0;
        id = newID;
        isTransparent = originalTexture.isTransparent;
        count = originalTexture.fileIds.length;
        fileIds = new int[count];
        for (int index = 0; index < count; index++) {
            fileIds[index] = newID;
        }
        field2439 = new int[count -1];
        for (int index = 0; index < count -1; index++) {
            field2439[index] = newID;
        }
        field2440 = new int[count -1];
        for (int index = 0; index < count -1; index++) {
            field2440[index] = newID;
        }
        field2441 = new int[count];
        for (int index = 0; index < count; index++) {
            field2441[index] = newID;
        }

        if (newID >= 126) {
            animationSpeed = originalTexture.animationSpeed;
            animationDirection = originalTexture.animationDirection;
        } else {
            animationSpeed = 0;
            animationDirection = 0;
        }
        averageRGB = originalTexture.averageRGB;
        this.pixels = null;
    }
    private boolean customTexture = false;

    public Texture() {

    }

    boolean load(double var1, int var3, AbstractArchive var4) {
        int var5;
        for(var5 = 0; var5 < this.fileIds.length; ++var5) {
            if(customTexture) {
                if(Js5List.configs.getFile(43, fileIds[var5]) == null)
                    return false;
            } else {
                if (var4.getFileFlat(this.fileIds[var5]) == null) {
                    return false;
                }
            }
        }

        var5 = var3 * var3;
        this.pixels = new int[var5];

        for(int var6 = 0; var6 < this.fileIds.length; ++var6) {
            int var8 = this.fileIds[var6];
            byte[] var10 = null;
            if(customTexture) {
                //var10 = Js5List.configs.getFile(43, fileIds[var5]);
                var10 = var4.takeFileFlat(var8);
            } else {
                var10 = var4.takeFileFlat(var8);
            }
            boolean var9;
            if (var10 == null) {
                var9 = false;
            } else {
                SpriteData.decode(var10);
                var9 = true;
            }

            IndexedImage var7;
            if (!var9) {
                var7 = null;
            } else {
                IndexedImage var11 = new IndexedImage();
                var11.width = SpriteData.spriteWidth;
                var11.height = SpriteData.spriteHeight;
                var11.xOffset = SpriteData.xOffsets[0];
                var11.yOffset = SpriteData.yOffsets[0];
                var11.subWidth = SpriteData.spriteWidths[0];
                var11.subHeight = SpriteData.spriteHeights[0];
                var11.palette = SpriteData.spritePalette;
                var11.palettePixels = SpriteData.pixels[0];
                SpriteData.xOffsets = null;
                SpriteData.yOffsets = null;
                SpriteData.spriteWidths = null;
                SpriteData.spriteHeights = null;
                SpriteData.spritePalette = null;
                SpriteData.pixels = null;
                var7 = var11;
            }

            var7.normalize();
            var10 = var7.palettePixels;
            int[] var18 = var7.palette;
            int var12 = this.field2441[var6];
            if ((var12 & -16777216) == 16777216) {
            }

            if ((var12 & -16777216) == 33554432) {
            }

            int var13;
            int var14;
            int var15;
            int var16;
            if ((var12 & -16777216) == 50331648) {
                var13 = var12 & 16711935;
                var14 = var12 >> 8 & 255;

                for(var15 = 0; var15 < var18.length; ++var15) {
                    var16 = var18[var15];
                    if (var16 >> 8 == (var16 & '\uffff')) {
                        var16 &= 255;
                        var18[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
                    }
                }
            }

            for(var13 = 0; var13 < var18.length; ++var13) {
                var18[var13] = Rasterizer3D.adjustBrightness(var18[var13], var1);
            }

            if (var6 == 0) {
                var13 = 0;
            } else {
                var13 = this.field2439[var6 - 1];
            }

            if (var13 == 0) {
                if (var3 == var7.subWidth) {
                    for(var14 = 0; var14 < var5; ++var14) {
                        this.pixels[var14] = var18[var10[var14] & 255];
                    }
                } else if (var7.subWidth == 64 && var3 == 128) {
                    var14 = 0;

                    for(var15 = 0; var15 < var3; ++var15) {
                        for(var16 = 0; var16 < var3; ++var16) {
                            this.pixels[var14++] = var18[var10[(var15 >> 1 << 6) + (var16 >> 1)] & 255];
                        }
                    }
                } else {
                    if (var7.subWidth != 128 || var3 != 64) {
                        System.out.println("var7.subWidth = " + var7.subWidth);
                        System.out.println("var3 = " + var3);
                        throw new RuntimeException();
                    }

                    var14 = 0;

                    for(var15 = 0; var15 < var3; ++var15) {
                        for(var16 = 0; var16 < var3; ++var16) {
                            this.pixels[var14++] = var18[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
                        }
                    }
                }
            }

            if (var13 == 1) {
            }

            if (var13 == 2) {
            }

            if (var13 == 3) {
            }
        }

        return true;
    }

    void reset() {
        this.pixels = null;
    }

    void animate(int var1) {
        if (Client.instance.isGpu()) {
            Client.instance.getDrawCallbacks().animate(this, var1);
            return;
        }

        if (this.pixels != null) {
            short var2;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int[] var10;
            if (this.animationDirection == 1 || this.animationDirection == 3) {
                if (animatedPixels == null || animatedPixels.length < this.pixels.length) {
                    animatedPixels = new int[this.pixels.length];
                }

                if (this.pixels.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.pixels.length;
                var4 = var2 * this.animationSpeed * var1;
                var5 = var3 - 1;
                if (this.animationDirection == 1) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; ++var6) {
                    var7 = var6 + var4 & var5;
                    animatedPixels[var6] = this.pixels[var7];
                }

                var10 = this.pixels;
                this.pixels = animatedPixels;
                animatedPixels = var10;
            }

            if (this.animationDirection == 2 || this.animationDirection == 4) {
                if (animatedPixels == null || animatedPixels.length < this.pixels.length) {
                    animatedPixels = new int[this.pixels.length];
                }

                if (this.pixels.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.pixels.length;
                var4 = this.animationSpeed * var1;
                var5 = var2 - 1;
                if (this.animationDirection == 2) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; var6 += var2) {
                    for (var7 = 0; var7 < var2; ++var7) {
                        int var8 = var6 + var7;
                        int var9 = var6 + (var7 + var4 & var5);
                        animatedPixels[var8] = this.pixels[var9];
                    }
                }

                var10 = this.pixels;
                this.pixels = animatedPixels;
                animatedPixels = var10;
            }

        }
    }




    private transient float textureU;
    private transient float textureV;

    public float getU() {
        return textureU;
    }
    public void setU(float u) {
        textureU = u;
    }

    public float getV() {
        return textureV;
    }

    public void setV(float v) {
        textureV = v;
    }

    public int[] getPixels() {
        return pixels;
    }

    public int getAnimationSpeed() {
        return animationSpeed;
    }

    @Override
    public boolean isLoaded() {
        return isLoaded;
    }

    public int getAnimationDirection() {
        return animationDirection;
    }

}
