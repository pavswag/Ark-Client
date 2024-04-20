package com.client.definitions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import com.client.Client;
import com.client.Configuration;
import com.client.RSFont;
import com.client.definitions.server.ItemDef;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DefinitionDumper {

    public static void dumpDefs() {
        if (Configuration.dumpDataLists) {
            dumpCustomItems();
            dumpItems();
            dumpNpcs();
        }
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
    public static void dumpCustomItems() {
        for(int i = 0; i < ItemDefinition.totalItems; i++) {
            if(ItemDefinition.lookup(i).custom) {
                if(ItemDefinition.lookup(i).name == null || ItemDefinition.lookup(i).name.equalsIgnoreCase("null"))
                    continue;
                String fileName = i + "-" + RSFont.removeOldSyntax(ItemDefinition.lookup(i).name).replace("\\", "-").replace("/", "-");
                if(fileName.contains(">")) {
                    fileName = fileName.substring(fileName.indexOf(">") + 1);
                }
                System.out.println("Dumping " + fileName);
                toJson(ItemDefinition.lookup(i), "./temp/items/" + fileName + ".json");
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
