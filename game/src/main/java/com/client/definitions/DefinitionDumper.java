package com.client.definitions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.client.Client;
import com.client.Configuration;
import com.client.RSFont;
import com.client.definitions.server.ItemDef;
import com.client.graphics.textures.Texture;
import com.client.sign.Signlink;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;

public class DefinitionDumper {
    private static final boolean dumpModels = false;
    private static final boolean dumpMaps = false;

    private static final boolean dumpRegions = false;

    private static final boolean dumpTextures = true;
    private static final boolean dumpSprites = false;
    private static List<Integer> customModels = new ArrayList<>();
    private static int widgetSpriteId = 0;
    public static void dumpDefs() {
        for(int i = 126; i <= 161; i++) {
            dumpCustomTexture(i);
        }
        if(dumpSprites) {
            File base = new File(Signlink.getCacheDirectory() + "sprites/");
            dumpSprite(base);
            toJson(SpriteCache.spriteMap, "./temp/widget-sprites.json");
        }
        if (Configuration.dumpDataLists) {
            dumpCustomItems();
            moveCustomModels();
            dumpItems();
            dumpCustomObjects();
            moveCustomModels();
            dumpCustomNpcs();
            moveCustomModels();
            dumpNpcs();
        }
        if(dumpTextures) {
            for(int i = 0; i < Client.instance.getTextureProvider().getTextures().length; i++) {
                int[] pixels = null;
                try {
                    pixels = Client.instance.getTextureProvider().load(i);
                } catch (Exception e) {
                    continue;
                }
                if(pixels == null)
                    continue;
                Texture texture = (Texture) Client.instance.getTextureProvider().getTextures()[i];

                toJson(texture, "./temp/textures/" + i + ".json");
            }
        }
        if(dumpRegions) {
            regionsToDumpAndConvert.forEach(regionID -> {
                    System.out.println("--");
                    System.out.println("Region[" + regionID + "]");
                    int regionX = regionID >> 8;
                    int regionY = regionID & 255;
                    String name = "_" + regionX + "_" + regionY;
                    System.out.println("New names:");
                    System.out.println("l" + name);
                    System.out.println("m" + name);
            });
        }
    }
    private static int spriteId = 5607;

    public static void dumpCustomText() {
        for(int i = 126; i <= 161; i++) {
            System.out.println("Dumping texture " + i);
            dumpCustomTexture(i);
        }
        spriteId = 5607;
        System.exit(0);
    }
    public static void dumpCustomTexture(int id) {
        Texture texture = new Texture();
        texture.fileIds = new int[] {spriteId};
        texture.averageRGB = 26715;
        texture.field2441 = new int[] { 137 };
        texture.isTransparent = true;
        texture.animationDirection = 1;
        texture.animationSpeed = 2;
        toJson(texture, "./temp/textures/" + id + ".json");
        spriteId++;
    }
    @SneakyThrows
    private static void dumpSprite(File file) {
        for(File f : file.listFiles()) {
            if(f.isDirectory()) {
                dumpSprite(f);
            } else {
                if(f.getName().contains(".png")) {
                    SpriteCache.spriteMap.put(widgetSpriteId, f.getAbsolutePath().substring(f.getAbsolutePath().indexOf("sprites") + 8).replace(".png", ""));
                    FileUtils.copyFile(f, new File("./temp/widget-sprites/" + widgetSpriteId + ".png"));
                    widgetSpriteId++;
                    System.out.println("Processed Sprite [" + f.getAbsolutePath().substring(f.getAbsolutePath().indexOf("sprites") + 8) + "]");
                }
            }
        }
    }
    private static List<Integer> regionsToDumpAndConvert = List.of(
            12342,
            14393,
            14910,
            14909,
            9531,
            9275,
            7763,
            6722,
            11343,
            8534,
            9783,
            12075,
            12074
    );
    public static void moveCustomModels() {
        customModels.forEach(model -> {
            File map = new File("./temp/index1/" + model + ".gz");
            if(map.exists()) {
                try {
                    Files.move(map.toPath(), Paths.get("./temp/custom_models/" + model + ".gz"), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Moved model " + model);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        customModels.clear();
    }
    public static void dumpNpcs() {
        Map<Integer, Npc> npcs = new HashMap<>();
        for (int i = 0; i < 100_000; i++) {
            try {
                NpcDefinition def = NpcDefinition.lookup(i);
                if (def != null) {
                    npcs.put(i, new Npc(def.name, def.combatLevel, def.size));
                }
            } catch (Exception e) {
            }
        }
        toJson(npcs, "./temp/npc_definitions.json");
    }
    public static void dumpCustomNpcs() {
        for(int i = 0; i < NpcDefinition.totalAmount; i++) {
            NpcDefinition npcDefinition = NpcDefinition.lookup(i);
            if(npcDefinition == null)
                continue;
            if(npcDefinition.custom) {
                if(npcDefinition.name == null || npcDefinition.name.equalsIgnoreCase("null"))
                    continue;
                String fileName = i + "-" + RSFont.removeOldSyntax(npcDefinition.name).replace("\\", "-").replace("/", "-");
                if(fileName.contains(">")) {
                    fileName = fileName.substring(fileName.indexOf(">") + 1);
                }
                fileName = fileName.replace("<-col>", "");

                fileName = fileName.trim();

                System.out.println("Dumping npc " + fileName);
                toJson(npcDefinition, "./temp/npcs/" + fileName + ".json");

                if(npcDefinition.models != null) {
                    for(int model: npcDefinition.models) {
                        customModels.add(model);
                    }
                }
            }
        }
    }
    public static void dumpCustomObjects() {
        for(int i = 0; i < ObjectDefinition.totalObjects; i++) {
            ObjectDefinition objectDefinition = ObjectDefinition.lookup(i);
            if(objectDefinition == null)
                continue;
            if(objectDefinition.custom) {
                if(objectDefinition.name == null || objectDefinition.name.equalsIgnoreCase("null"))
                    continue;
                String fileName = i + "-" + RSFont.removeOldSyntax(objectDefinition.name).replace("\\", "-").replace("/", "-");
                if(fileName.contains(">")) {
                    fileName = fileName.substring(fileName.indexOf(">") + 1);
                }

                System.out.println("Dumping object " + fileName);
                toJson(objectDefinition, "./temp/objects/" + fileName + ".json");

                if(objectDefinition.objectModels != null)
                    for(int model: objectDefinition.objectModels)
                        customModels.add(model);
            }
        }
    }
    public static void dumpCustomItems() {
        for(int i = 0; i < ItemDefinition.totalItems; i++) {
            ItemDefinition itemDefinition = ItemDefinition.lookup(i);
            if(itemDefinition == null)
                continue;
            if(itemDefinition.custom) {
                if(itemDefinition.name == null || itemDefinition.name.equalsIgnoreCase("null"))
                    continue;
                String fileName = i + "-" + RSFont.removeOldSyntax(itemDefinition.name).replace("\\", "-").replace("/", "-");
                if(fileName.contains(">")) {
                    fileName = fileName.substring(fileName.indexOf(">") + 1);
                }

                System.out.println("Dumping item " + fileName);
                toJson(itemDefinition, "./temp/items/" + fileName + ".json");

                if(itemDefinition.inventoryModel != -1)
                    customModels.add(itemDefinition.inventoryModel);
                if(itemDefinition.maleModel0 != -1)
                    customModels.add(itemDefinition.maleModel0);
                if(itemDefinition.maleModel1 != -1)
                    customModels.add(itemDefinition.maleModel1);
                if(itemDefinition.femaleModel0 != -1)
                    customModels.add(itemDefinition.femaleModel0);
                if(itemDefinition.femaleModel1 != -1)
                    customModels.add(itemDefinition.femaleModel1);
            }
        }
    }
    public static void dumpItems() {
        ItemDefinition[] itemDefinitions = new ItemDefinition[ItemDefinition.totalItems];
        for(int i = 0; i < ItemDefinition.totalItems; i++) {
            ItemDefinition definition = ItemDefinition.lookup(i);
            itemDefinitions[i] = definition;
            toJson(definition, "./dump/items/" + i + "_" + definition.getName() + ".json");
        }
        toJson(itemDefinitions, "./dump/item_definitions.json");
    }

    @SneakyThrows
    private static <T> void toJson(T t, String filePath) {
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(t);
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(filePath));
        bw.write(prettyJson);
        bw.flush();
        bw.close();
    }

    private static class Npc {
        private final String name;
        private final int combatLevel;
        private final int size;

        public Npc(String name, int combatLevel, int size) {
            this.name = name;
            this.combatLevel = combatLevel;
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public int getCombatLevel() {
            return combatLevel;
        }

        public int getSize() {
            return size;
        }
    }
}
