package com.client.graphics.textures;

import com.client.Buffer1;
import com.client.Client;
import com.client.Deque;
import com.client.FileArchive;
import net.runelite.rs.api.RSTexture;
import net.runelite.rs.api.RSTextureProvider;

public class TextureProvider implements RSTextureProvider, TextureLoader {

    private final Texture[] textures;

    private Deque deque;

    private int capacity;

    private int remaining;

    private double brightness;

    private int textureSize;

    private final FileArchive archive;

    public TextureProvider(FileArchive textureArchive, FileArchive configArchive, int capacity, int textureSize) {
        deque = new Deque();
        archive = textureArchive;
        this.capacity = capacity;
        this.remaining = this.capacity;
        this.textureSize = textureSize;
        int textureCount;

        Buffer1 stream = new Buffer1(configArchive.readFile("textures.dat"));
        textureCount = stream.readUShort();

        System.out.println("Loaded " + textureCount + " textures from textures.dat");
        int newTextureCount = 0;
        textures = new Texture[200];
        for (int var9 = 0; var9 < 200; ++var9) {
            if(stream.currentPosition >= stream.payload.length) {
                newTextureCount = var9;
                System.out.println("Ran out of payload on texture [" + var9 + "]");
                break;
            }
            Texture text =  new Texture(stream);
            textures[text.id] = text;
        }
        for (int i = newTextureCount; i < 162; i++) {//TODO When adding more textures, increase this value
            Texture originalTexture = textures[40];
            if (originalTexture != null) {
                Texture text =  new Texture(originalTexture, i);

                textures[text.id] = text;

//                System.out.println("Loaded texture " + i + " - " + text.id);
            }
        }
        setMaxSize(128);
        setSize(128);

    }

    @Override
    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
        clear();
    }

    public void setTextureSize(int textureSize) {
        this.textureSize = textureSize;
        clear();
    }

    @Override
    public void setMaxSize(int maxSize) {
        capacity = maxSize;
    }

    @Override
    public void setSize(int size) {
        remaining = size;
    }

    @Override
    public RSTexture[] getTextures() {
        return textures;
    }

    @Override
    public int[] load(int textureId) {
        return getTexturePixels(textureId);
    }

    public int[] getTexturePixels(int textureID) {
        Texture texture = textures[textureID];
        if (texture != null) {
            if (texture.pixels != null) {
                deque.insertTail(texture);
                texture.isLoaded = true;
                return texture.pixels;
            }

            boolean hasLoaded = texture.load(brightness, textureSize, archive);
            if (hasLoaded) {
                if (remaining == 0) {
                    Texture currentTexture = (Texture)deque.popHead();
                    currentTexture.reset();
                } else {
                    --remaining;
                }

                deque.insertTail(texture);
                texture.isLoaded = true;
                return texture.pixels;
            }
        }

        return null;
    }

    public int getAverageTextureRGB(int textureID) {
        return textures[textureID] != null ? textures[textureID].averageRGB : 0;
    }

    public boolean isTransparent(int textureID) {
        return textures[textureID].isTransparent;
    }

    @Override
    public boolean isLowDetail(int textureID) {
        return textureSize == 64;
    }

    public void clear() {
        for (Texture texture : textures) {
            if (texture != null) {
                texture.reset();
            }
        }

        deque = new Deque();
        remaining = capacity;
    }

    public void animate(int textureID) {
        for (Texture texture : textures) {
            if (texture != null && texture.animationDirection != 0 && texture.isLoaded) {
                texture.animate(textureID);
                texture.isLoaded = false;
            }
        }
    }

    public static final void method1307(int var0, int var1, int var2) {
        Client instance = Client.getInstance();
        int var3;
        for(var3 = 0; var3 < 8; ++var3) {
            for(int var4 = 0; var4 < 8; ++var4) {
                instance.tileHeights[var0][var3 + var1][var4 + var2] = 0;
            }
        }

        if (var1 > 0) {
            for(var3 = 1; var3 < 8; ++var3) {
                instance.tileHeights[var0][var1][var3 + var2] = instance.tileHeights[var0][var1 - 1][var3 + var2];
            }
        }

        if (var2 > 0) {
            for(var3 = 1; var3 < 8; ++var3) {
                instance.tileHeights[var0][var3 + var1][var2] = instance.tileHeights[var0][var3 + var1][var2 - 1];
            }
        }

        if (var1 > 0 && instance.tileHeights[var0][var1 - 1][var2] != 0) {
            instance.tileHeights[var0][var1][var2] = instance.tileHeights[var0][var1 - 1][var2];
        } else if (var2 > 0 && instance.tileHeights[var0][var1][var2 - 1] != 0) {
            instance.tileHeights[var0][var1][var2] = instance.tileHeights[var0][var1][var2 - 1];
        } else if (var1 > 0 && var2 > 0 && instance.tileHeights[var0][var1 - 1][var2 - 1] != 0) {
            instance.tileHeights[var0][var1][var2] = instance.tileHeights[var0][var1 - 1][var2 - 1];
        }
    }
}
