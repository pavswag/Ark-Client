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
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

public class DefinitionDumper {
    private static final boolean dumpModels = false;
    private static final boolean dumpMaps = false;

    private static final boolean dumpRegions = true;
    private static List<Integer> customModels = new ArrayList<>();
    public static void dumpDefs() {
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
        if(dumpModels)
            Client.instance.resourceProvider.dumpModels();
        if(dumpMaps)
            Client.instance.resourceProvider.dumpMaps();
        if(dumpRegions) {
            regionsToDumpAndConvert.forEach(regionID -> {
                File parent = new File("./temp/maps/" + regionID + "/");
                if(parent.exists())
                    parent.mkdirs();
                int landscape = -1;
                int loc = -1;
                for(int i = 0; i < Client.instance.resourceProvider.getMapIndices1().length; i++) {
                    if(Client.instance.resourceProvider.getMapIndices1()[i] == regionID) {
                        landscape = Client.instance.resourceProvider.mapIndices2[i];
                        loc = Client.instance.resourceProvider.mapIndices3[i];
                    }
                }
                if(landscape != -1 && loc != -1) {
                    System.out.println("--");
                    System.out.println("Region[" + regionID + "]");
                    System.out.println("Original files = [" + landscape + "/" + loc + "]");
                    int regionX = regionID >> 8;
                    int regionY = regionID & 255;
                    String name = "_" + regionX + "_" + regionY;
                    System.out.println("New names:");
                    System.out.println("l" + name);
                    System.out.println("m" + name);
                    File source=new File("./temp/index4/" + landscape  +".gz");
                    File destination=new File("./temp/maps/" + regionID + "/m" + name + ".gz");
                    try {
                        FileUtils.copyFile(source, destination);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    source=new File("./temp/index4/" + loc  +".gz");
                    destination=new File("./temp/maps/" + regionID + "/l" + name + ".gz");
                    try {
                        FileUtils.copyFile(source, destination);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
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
            9783);
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
            itemDefinitions[i] = ItemDefinition.lookup(i);
        }
        toJson(itemDefinitions, "./temp/item_definitions.json");
    }

    private static <T> void toJson(T t, String filePath) {
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(t);
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(prettyJson);
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
