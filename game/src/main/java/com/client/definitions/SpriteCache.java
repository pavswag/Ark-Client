package com.client.definitions;

import com.client.Buffer;
import com.client.EvictingDualNodeHashTable;
import com.client.RegionMusic;
import com.client.Sprite;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

public final class SpriteCache extends DualNode {

    public int id;
    public int width = -1;
    public int height = -1;
    public int offsetX = 0;
    public int offsetY = 0;
    public String name = "null";
    public byte[] pixels;
    public Sprite sprite;


    public static Map<Integer, String> spriteMap = new HashMap<Integer, String>();

    public static EvictingDualNodeHashTable cached = new EvictingDualNodeHashTable(100);
    public static EvictingDualNodeHashTable cachedSizes = new EvictingDualNodeHashTable(100);
    public static EvictingDualNodeHashTable oldschoolSpriteCache = new EvictingDualNodeHashTable(100);
    public static EvictingDualNodeHashTable widgetSpriteCache = new EvictingDualNodeHashTable(100);

    public static Sprite lookup(int id) {
        SpriteCache image = (SpriteCache)SpriteCache.cached.get(id);
        if (image == null) {
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.CUSTOM_ITEM_SPRITES, id);
            image = new SpriteCache();
            image.id = id;
            if (data != null) {
                image.decode(new Buffer(data),true);
            } else {
                System.out.println("Missing Sprite: " + id);
                return Sprite.EMPTY_SPRITE;
            }
            cached.put(image, id);
        }
        return image.sprite;
    }

    public static SpriteCache metaData(int id) {
        SpriteCache image = (SpriteCache)SpriteCache.cached.get(id);
        if (image == null) {
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.OSRS_SPRITES, id);
            image = new SpriteCache();
            image.id = id;
            if (data != null) {
                image.decode(new Buffer(data),true);
            }
            cached.put(image, id);
        }
        return image;
    }
    @SneakyThrows
    public static void load() {
        ObjectMapper om = new ObjectMapper();
        TypeReference<HashMap<Integer,String>> typeRef
                = new TypeReference<HashMap<Integer,String>>() {};
        spriteMap =  om.readValue(RegionMusic.class.getResourceAsStream("/widget-sprites.json"), typeRef);
        System.out.println("Loaded [" + spriteMap.size() + "] OG Sprites.");
    }

    public static boolean widgetSpriteExists(String img) {
        int id = -1;
        if(spriteMap == null || spriteMap.isEmpty()) {
            load();
        }
        try {
            id = spriteMap.entrySet().stream().filter(it -> it.getValue().equalsIgnoreCase(img)).findAny().get().getKey();
        } catch (Exception e) {

        }
        return id != -1;
    }

    public static Sprite lookupWidgetSprite(String img) {
        int id = -1;
        if(spriteMap == null || spriteMap.isEmpty()) {
            load();
        }
        try {
            id = spriteMap.entrySet().stream().filter(it -> it.getValue().equalsIgnoreCase(img)).findAny().get().getKey();
        } catch (Exception e) {

        }
        if(id == -1)
            return null;
        SpriteCache image = (SpriteCache)SpriteCache.widgetSpriteCache.get(id);
        if (image == null) {
            byte[] data = Js5List.widgetSprites.takeFile(id, 0);
            image = new SpriteCache();
            image.id = id;
            if (data != null) {
                image.decode(new Buffer(data),true);
                System.out.println("Found sprite [" + img +"] with id [" + id + "]");
            } else {
                System.out.println("Missing Sprite: " + id);
                return null;
            }
            if(image.sprite.subWidth < 1)
                return null;
            widgetSpriteCache.put(image, id);
        }
        return image.sprite;
    }

    public static Sprite lookupOldschoolSprite(int id) {
        SpriteCache image = (SpriteCache)SpriteCache.oldschoolSpriteCache.get(id);
        if (image == null) {
            byte[] data = Js5List.osrsSprites.takeFileFlat(id);
            image = new SpriteCache();
            image.id = id;
            if (data != null) {
                image.decode(new Buffer(data),true);
            } else {
                System.out.println("Missing Sprite: " + id);
                return Sprite.EMPTY_SPRITE;
            }
            if(image.sprite.subWidth < 1)
                return null;
            if(id == 657) {
                System.out.println("special attack width = " + image.sprite.subWidth);
                System.out.println("special attack height = " + image.sprite.subHeight);
            }
            oldschoolSpriteCache.put(image, id);
        }
        return image.sprite;
    }

    public static SpriteCache lookupMetaData(int id) {
        SpriteCache image = (SpriteCache)SpriteCache.cachedSizes.get(id);
        if (image == null) {
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.OSRS_SPRITES, id);
            image = new SpriteCache();
            image.id = id;
            if (data != null) {
                image.decode(new Buffer(data),false);
            }
            cachedSizes.put(image, id);
        }
        return image;
    }

    void decode(Buffer var1, boolean full) {
        while(true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.decodeNext(var1, var2, full);
        }
    }

    void decodeNext(Buffer buffer, int opcode, boolean full) {
        if (opcode == 1) {
            width = buffer.readShort();
        } else if (opcode == 2) {
            height = buffer.readShort();
        } else if (opcode == 3) {
            name = buffer.readStringCp1252NullTerminated();
        } else if (opcode == 4) {
            offsetX = buffer.readShort();
        } else if (opcode == 5) {
            offsetY = buffer.readShort();
        } else if (opcode == 6 && full) {
            int size = buffer.readInt();
            pixels = new byte[size];
            for (int index = 0; index < size; index++) {
                pixels[index] = buffer.readByte();
            }
            sprite = new Sprite(width,height,offsetX,offsetY,pixels);
        }
    }

    public static Sprite get(int id) {
        return lookup(id);
    }

    public static int getWidth(int id) {
        return lookupMetaData(id).width;
    }

    public static int getHeight(int id) {
        return lookupMetaData(id).height;
    }

}

