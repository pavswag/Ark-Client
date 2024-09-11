package com.client.definitions;

import com.client.*;
import com.client.cache.DualNode;
import com.client.definitions.server.ItemDef;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;
import com.client.util.BufferExt;
import com.client.utilities.FileOperations;
import com.google.common.base.Preconditions;
import net.runelite.api.IterableHashTable;
import net.runelite.rs.api.RSItemComposition;
import net.runelite.rs.api.RSIterableNodeHashTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ItemDefinition extends DualNode implements RSItemComposition {

    public static EvictingDualNodeHashTable sprites = new EvictingDualNodeHashTable(100);
    public static EvictingDualNodeHashTable models = new EvictingDualNodeHashTable(50);
    public static boolean isMembers = true;
    public static int totalItems;
    public static EvictingDualNodeHashTable cache = new EvictingDualNodeHashTable(64);
    private static int cacheIndex;
    private static Buffer item_data;
    private static int[] streamIndices;
    public int cost;
    public int[] originalColours;
    public int id;
    public int[] modifiedColours;
    public boolean members;
    public int noteTemplateId;
    public int femaleModel1;
    public int maleModel0;
    public String[] options;
    public int xOffset2d;
    public String name;
    public int inventoryModel;
    public int maleHeadModel0;
    public int weight;
    public int wearPos1;
    public int wearPos2;
    public int wearPos3;
    public int stacks;
    public int noteLinkId;
    public int zoom2d;


    public int maleModel1;
    public String[] interfaceOptions;
    public int xan2d;
    public int[] countObj;
    public int yOffset2d;//
    public int femaleHeadModel0;
    public int yan2d;
    public int femaleModel0;
    public int[] countCo;
    public int teamCape;
    public int zan2d;
    public String[] equipActions;
    public boolean isTradeable;
    public HashMap<Integer, Object> params;
    public int glowColor = -1;
    private short[] modifiedTextureColours;
    private short[] originalTextureColours;
    private byte femaleOffset;
    private int femaleModel2;
    private int maleHeadModel1;
    private int resizeX;
    private int femaleHeadModel1;
    private int contrast;
    private int maleModel2;
    private int resizeZ;
    private int resizeY;
    private int ambient;
    private byte maleOffset;
    private int dropOptionIndex = -2;
    private int category;
    private int unnotedId;
    private int notedId;
    private int placeholderLink;
    private int placeholderTemplate;

    private ItemDefinition() {
        id = -1;
    }

    public static void clear() {
        models = null;
        sprites = null;
        streamIndices = null;
        item_data = null;
    }



    private static ItemDefinition newCustomItems(int itemId) {
        ItemDefinition itemDef = new ItemDefinition();
        itemDef.setDefaults();
        switch (itemId) {
            case 30000:
                return copy(itemDef, 30_000, 11738, "Resource box(small)", "Open");
            case 30001:
                return copy(itemDef, 30_001, 11738, "Resource box(medium)", "Open");
            case 30002:
                return copy(itemDef, 30_002, 11738, "Resource box(large)", "Open");
            case 22375:
                return copy(itemDef, 22375, 22374, "Mossy key");


        }

        return null;
    }

    public static ItemDefinition copy(ItemDefinition itemDef, int newId, int copyingItemId, String newName, String...actions) {
        ItemDefinition copyItemDef = lookup(copyingItemId);
        itemDef.id = newId;
        itemDef.name = newName;
        itemDef.modifiedColours = copyItemDef.modifiedColours;
        itemDef.originalColours = copyItemDef.originalColours;
        itemDef.inventoryModel = copyItemDef.inventoryModel;
        itemDef.maleModel0 = copyItemDef.maleModel0;
        itemDef.femaleModel0 = copyItemDef.femaleModel0;
        itemDef.zoom2d = copyItemDef.zoom2d;
        itemDef.xan2d = copyItemDef.xan2d;
        itemDef.yan2d = copyItemDef.yan2d;
        itemDef.xOffset2d = copyItemDef.xOffset2d;
        itemDef.yOffset2d = copyItemDef.yOffset2d;
        itemDef.interfaceOptions = copyItemDef.interfaceOptions;
        itemDef.interfaceOptions = new String[5];
        if (actions != null) {
            for (int index = 0; index < actions.length; index++) {
                itemDef.interfaceOptions[index] = actions[index];
            }
        }
        itemDef.custom = true;
        return itemDef;
    }


    private static ItemDefinition customItems(ItemDefinition itemDef) {
        int itemId = itemDef.id;
        switch (itemId) {
            case 11489:
                itemDef.name = "<rank=35>The AIO Potion of POWER!<rank=35>";
                break;
            case 25087:
                itemDef.name = "Trail Of Treasure Scroll";
                break;
            case 25365:
                itemDef.name = "Vote Entry Token";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
                break;
            case 9600:
                itemDef.name = "Baba Instance Token";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
                break;
            case 9616:
                itemDef.name = "Chaotic Instance Token";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
                break;
            case 9604:
                itemDef.name = "Sol Heredit Instance Token";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
                break;
            case 29838:
                ItemDefinition def = ItemDefinition.lookup(29836);
                itemDef.inventoryModel = def.inventoryModel;
                itemDef.zoom2d = ItemDefinition.lookup(29836).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(29836).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(29836).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(29836).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(29836).yOffset2d;
                break;
            case 9608:
                itemDef.name = "Sharathteerk Instance Token";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
                break;
            case 26879:
                itemDef.name = "Wraith Essence";
                itemDef.interfaceOptions = new String[] { "Inspect", null, null, null, "Drop" };
                break;
            case 84:
                itemDef.name = "The Stick of Last Resort";
                break;
            case 33437:
                itemDef.name = "Prophet's Pillow Feather";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.inventoryModel = ItemDefinition.lookup(10087).inventoryModel;
                itemDef.zoom2d = ItemDefinition.lookup(10087).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(10087).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(10087).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(10087).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(10087).yOffset2d;
                break;
            case 33441:
                itemDef.maleModel0 = ItemDefinition.lookup(7441).maleModel0;
                itemDef.femaleModel0 = ItemDefinition.lookup(7441).femaleModel0;
                itemDef.inventoryModel = ItemDefinition.lookup(7441).inventoryModel;
                itemDef.zoom2d = ItemDefinition.lookup(7441).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(7441).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(7441).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(7441).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(7441).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(7441).yOffset2d;
                itemDef.interfaceOptions = ItemDefinition.lookup(7441).interfaceOptions;
                itemDef.originalColours = ItemDefinition.lookup(7441).originalColours;
                itemDef.modifiedColours = ItemDefinition.lookup(7441).modifiedColours;
                itemDef.originalTextureColours = ItemDefinition.lookup(7441).originalTextureColours;
                itemDef.modifiedTextureColours = ItemDefinition.lookup(7441).modifiedTextureColours;
                itemDef.name = "<rank=35> BONK! <rank=35>";
                break;
//            case 9610:
//                itemDef.name = "Instance Token";
//                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
//                break;
            case 9612:
                itemDef.name = "Yama Instance Token";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
                break;
//            case 9620:
//                itemDef.name = "Instance Token";
//                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
//                break;
//            case 9624:
//                itemDef.name = "Instance Token";
//                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
//                break;
            case 33343:  //Ember helm
                itemDef.zoom2d = 595;
                itemDef.xan2d = 310;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 21;
                break;
            case 33344:  //Ember body
                itemDef.zoom2d = 1401;
                itemDef.xan2d = 522;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -3;
                break;
            case 33345:  //Ember legs
                itemDef.zoom2d = 1804;
                itemDef.xan2d = 431;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -3;
                itemDef.yOffset2d = 5;
                break;
            case 33346:  //Ember boots
                itemDef.zoom2d = 668;
                itemDef.xan2d = 0;
                itemDef.yan2d = 1971;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 5;
                break;
            case 33347:  //Ember gloves
                itemDef.zoom2d = 961;
                itemDef.xan2d = 371;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -1;
                itemDef.yOffset2d = -1;
                break;
            case 33395:
                itemDef.name = "Chaotic GoodieBag";
                itemDef.inventoryModel = 60898;
                itemDef.zoom2d = ItemDefinition.lookup(25537).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(25537).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(25537).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(25537).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(25537).yOffset2d;
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop"};
                break;
            case 33360:
                itemDef.name = "Mini Shadow Crusade Raid Box";
                itemDef.inventoryModel = 60325;
                itemDef.zoom2d = ItemDefinition.lookup(6678).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(6678).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(6678).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(6678).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(6678).yOffset2d;
                break;
            case 33396:
                itemDef.name = "Crusade Goodie Bag";
                itemDef.inventoryModel = 60899;
                itemDef.zoom2d = ItemDefinition.lookup(25537).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(25537).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(25537).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(25537).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(25537).yOffset2d;
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop"};
                break;
            case 23309:
                itemDef.name = "Double Drop Amulet";
                break;
            case 4277:
                itemDef.name = "Treasure Map Scroll";
                itemDef.interfaceOptions = new String[] { "Tear", null, null, null, "Drop"};
                break;
            case 11505:
                itemDef.name = "Potion of ambition";
                break;
            case 33392:
                itemDef.name = "Freedom Ring";
                itemDef.inventoryModel = 60891;
                itemDef.maleModel0 = 60891;
                itemDef.femaleModel0 = 60891;
                itemDef.zoom2d = ItemDefinition.lookup(28327).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(28327).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(28327).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(28327).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(28327).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 24725:
                itemDef.name = "Hallowed Amulet";
                break;
            case 9068:
                itemDef.name = "Helm of amazement";
                break;
            case 29489:
                itemDef.name = "Prophets Pride";
                break;
            case 28416:
                itemDef.name = "Shadow Crusade Key";
                break;
            case 33394:
                itemDef.name = "Freedom Gloves";
                itemDef.inventoryModel = 60969;
                itemDef.maleModel0 = 60896;
                itemDef.femaleModel0 = 60897;
                itemDef.zoom2d = ItemDefinition.lookup(2912).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(2912).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(2912).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(2912).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(2912).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 28796:
                itemDef.name = "Staff of amazement";
                break;
            case 33393:
                itemDef.name = "Freedom Boots";
                itemDef.inventoryModel = 60970;
                itemDef.maleModel0 = 60893;
                itemDef.femaleModel0 = 60894;
                itemDef.zoom2d = ItemDefinition.lookup(2904).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(2904).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(2904).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(2904).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(2904).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33397:
                itemDef.name = "@pur@Pink Ankou Mask";
                itemDef.inventoryModel = 60905;
                itemDef.maleModel0 = 60900;
                itemDef.femaleModel0 = 60900;
                itemDef.zoom2d = ItemDefinition.lookup(20095).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20095).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20095).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20095).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20095).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33398:
                itemDef.name = "@pur@Pink Ankou Top";
                itemDef.inventoryModel = 60906;
                itemDef.maleModel0 = 60901;
                itemDef.maleModel1 = 60910;
                itemDef.femaleModel0 = 60901;
                itemDef.femaleModel1 = 60910;
                itemDef.zoom2d = ItemDefinition.lookup(20098).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20098).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20098).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20098).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20098).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33399:
                itemDef.name = "@pur@Pink Ankou Legs";
                itemDef.inventoryModel = 60907;
                itemDef.maleModel0 = 60902;
                itemDef.femaleModel0 = 60902;
                itemDef.zoom2d = ItemDefinition.lookup(20104).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20104).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20104).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20104).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20104).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33400:
                itemDef.name = "@pur@Pink Ankou Socks";
                itemDef.inventoryModel = 60908;
                itemDef.maleModel0 = 60903;
                itemDef.femaleModel0 = 60903;
                itemDef.zoom2d = ItemDefinition.lookup(20107).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20107).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20107).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20107).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20107).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33401:
                itemDef.name = "@pur@Pink Ankou Mask";
                itemDef.inventoryModel = 60909;
                itemDef.maleModel0 = 60904;
                itemDef.femaleModel0 = 60904;
                itemDef.zoom2d = ItemDefinition.lookup(20101).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20101).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20101).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20101).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20101).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33402:
                itemDef.setDefaults();
                itemDef.name = "Hallowed Gloves";
                itemDef.inventoryModel = 60913;
                itemDef.maleModel0 = 60911;
                itemDef.femaleModel0 = 60911;
                itemDef.zoom2d = ItemDefinition.lookup(22981).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(22981).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(22981).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(22981).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(22981).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 29499:
                itemDef.name = "New BIS Cape";
                break;
            case 13589:
                itemDef.name = "New BIS Boots";
                break;
            case 23593:
                itemDef.name = "New BIS Gloves";
                break;
            case 23640:
                itemDef.name = "New BIS Amulet";
                break;
            case 33403:
                itemDef.name = "Hallowed Boots";
                itemDef.inventoryModel = 60912;
                itemDef.maleModel0 = 60912;
                itemDef.femaleModel0 = 60912;
                itemDef.zoom2d = ItemDefinition.lookup(13235).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(13235).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(13235).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(13235).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(13235).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33404:
                itemDef.name = "Send Nudes";
                itemDef.inventoryModel = 60915;
                itemDef.maleModel0 = 60914;
                itemDef.femaleModel0 = 60914;
                itemDef.zoom2d = 4180;
                itemDef.xan2d = 235;
                itemDef.yan2d = 43;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 1;
                itemDef.yOffset2d = -71;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33405:
                itemDef.name = "ToDo Goodie Bag";
                itemDef.inventoryModel = 60916;
                itemDef.zoom2d = ItemDefinition.lookup(25537).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(25537).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(25537).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(25537).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(25537).yOffset2d;
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop"};
                break;
            case 10198:
                itemDef.name = "Mini-me Pet";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop"};
                break;
            case 10199:
                itemDef.name = "Shadow Pet";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop"};
                break;
            case 33406:
                itemDef.name = "Heredit Ring";
                itemDef.inventoryModel = 60917;
                itemDef.maleModel0 = 60917;
                itemDef.femaleModel0 = 60917;
                itemDef.zoom2d = ItemDefinition.lookup(12601).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(12601).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(12601).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(12601).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(12601).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33407:
                itemDef.name = "Heredit Amulet";
                itemDef.inventoryModel = 60919;
                itemDef.maleModel0 = 60920;
                itemDef.femaleModel0 = 60920;
                itemDef.zoom2d = ItemDefinition.lookup(19553).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(19553).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(19553).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(19553).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(19553).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33408:
                itemDef.name = "Heredit Boots";
                itemDef.inventoryModel = 60918;
                itemDef.maleModel0 = 60918;
                itemDef.femaleModel0 = 60918;
                itemDef.zoom2d = ItemDefinition.lookup(22954).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(22954).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(22954).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(22954).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(22954).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33409:
                itemDef.name = "Heredit Gloves";
                itemDef.inventoryModel = 60921;
                itemDef.maleModel0 = 60922;
                itemDef.femaleModel0 = 60922;
                itemDef.zoom2d = ItemDefinition.lookup(22981).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(22981).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(22981).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(22981).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(22981).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33410:
                itemDef.name = "Heredit Cape";
                itemDef.inventoryModel = 60924;
                itemDef.maleModel0 = 60925;
                itemDef.femaleModel0 = 60925;
                itemDef.zoom2d = ItemDefinition.lookup(27447).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(27447).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(27447).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(27447).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(27447).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33411:
                itemDef.name = "Heredit Quiver";
                itemDef.inventoryModel = 60923;
                itemDef.zoom2d = ItemDefinition.lookup(5562).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(5562).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(5562).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(5562).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(5562).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33412:
                itemDef.name = "Orange Party Hat";
                itemDef.inventoryModel = 60926;
                itemDef.maleModel0 = 60927;
                itemDef.femaleModel0 = 60927;
                itemDef.zoom2d = ItemDefinition.lookup(3128).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(3128).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(3128).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(3128).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(3128).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33413:
                itemDef.name = "Element Hood";
                itemDef.inventoryModel = 60928;
                itemDef.maleModel0 = 60929;
                itemDef.femaleModel0 = 60929;
                itemDef.zoom2d = ItemDefinition.lookup(20708).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20708).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20708).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20708).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20708).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33414:
                itemDef.name = "Element Top";
                itemDef.inventoryModel = 60930;
                itemDef.maleModel0 = 60931;
                itemDef.femaleModel0 = 60931;
                itemDef.zoom2d = ItemDefinition.lookup(20704).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20704).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20704).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20704).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20704).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33415:
                itemDef.name = "Element Bottoms";
                itemDef.inventoryModel = 60932;
                itemDef.maleModel0 = 60933;
                itemDef.femaleModel0 = 60933;
                itemDef.zoom2d = ItemDefinition.lookup(20706).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20706).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20706).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20706).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20706).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33416:
                itemDef.name = "Element Boots";
                itemDef.inventoryModel = 60934;
                itemDef.maleModel0 = 60934;
                itemDef.femaleModel0 = 60934;
                itemDef.zoom2d = ItemDefinition.lookup(20710).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20710).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20710).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20710).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20710).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33417:
                itemDef.name = "Gifted Sulphur Blades";
                itemDef.inventoryModel = 60935;
                itemDef.maleModel0 = 60936;
                itemDef.femaleModel0 = 60936;
                itemDef.zoom2d = ItemDefinition.lookup(29084).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(29084).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(29084).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(29084).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(29084).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 27037:
                itemDef.name = "Enhanced Raid Seed";
                break;
            case 27038:
                itemDef.name = "Enhanced Iasor";
                break;
            case 27039:
                itemDef.name = "Enhanced Hespori Seed";
                break;
            case 27040:
                itemDef.name = "Enhanced Damage Boost";
                break;
            case 27041:
                itemDef.name = "Enhanced Slayer Seed";
                break;
            case 28421:
                itemDef.name = "Isle Of The Damned Key";
                break;
            case 33418:
                itemDef.name = "Heredit Ring (or)";
                itemDef.inventoryModel = 60937;
                itemDef.maleModel0 = 60937;
                itemDef.femaleModel0 = 60937;
                itemDef.zoom2d = ItemDefinition.lookup(12601).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(12601).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(12601).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(12601).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(12601).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33419:
                itemDef.name = "Heredit Amulet (or)";
                itemDef.inventoryModel = 60939;
                itemDef.maleModel0 = 60940;
                itemDef.femaleModel0 = 60940;
                itemDef.zoom2d = ItemDefinition.lookup(19553).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(19553).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(19553).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(19553).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(19553).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33420:
                itemDef.name = "Heredit Boots (or)";
                itemDef.inventoryModel = 60938;
                itemDef.maleModel0 = 60938;
                itemDef.femaleModel0 = 60938;
                itemDef.zoom2d = ItemDefinition.lookup(22954).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(22954).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(22954).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(22954).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(22954).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33421:
                itemDef.name = "Heredit Gloves (or)";
                itemDef.inventoryModel = 60941;
                itemDef.maleModel0 = 60942;
                itemDef.femaleModel0 = 60942;
                itemDef.zoom2d = ItemDefinition.lookup(22981).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(22981).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(22981).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(22981).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(22981).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33422:
                itemDef.name = "Heredit Cape (or)";
                itemDef.inventoryModel = 60944;
                itemDef.maleModel0 = 60945;
                itemDef.femaleModel0 = 60945;
                itemDef.zoom2d = ItemDefinition.lookup(27447).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(27447).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(27447).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(27447).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(27447).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33423:
                itemDef.name = "Heredit Quiver (or)";
                itemDef.inventoryModel = 60943;
                itemDef.zoom2d = ItemDefinition.lookup(5562).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(5562).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(5562).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(5562).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(5562).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33424:
                itemDef.name = "Nova Hat";
                itemDef.inventoryModel = 60946;
                itemDef.maleModel0 = 60947;
                itemDef.femaleModel0 = 60947;
                itemDef.zoom2d = ItemDefinition.lookup(24405).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(24405).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(24405).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(24405).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(24405).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33425:
                itemDef.name = "Nova Body";
                itemDef.inventoryModel = 60948;
                itemDef.maleModel0 = 60949;
                itemDef.femaleModel0 = 60949;
                itemDef.zoom2d = ItemDefinition.lookup(24407).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(24407).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(24407).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(24407).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(24407).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33426:
                itemDef.name = "Nova Legs";
                itemDef.inventoryModel = 60950;
                itemDef.maleModel0 = 60951;
                itemDef.femaleModel0 = 60951;
                itemDef.zoom2d = ItemDefinition.lookup(24409).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(24409).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(24409).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(24409).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(24409).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33427:
                itemDef.name = "Nova Boots";
                itemDef.inventoryModel = 60952;
                itemDef.maleModel0 = 60952;
                itemDef.femaleModel0 = 60952;
                itemDef.zoom2d = ItemDefinition.lookup(24411).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(24411).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(24411).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(24411).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(24411).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33428:
                itemDef.name = "@gre@1M Nomad Certificate";
                itemDef.inventoryModel = 60953;
                itemDef.zoom2d = ItemDefinition.lookup(696).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(696).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(696).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(696).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(696).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Use", null, null, "Drop" };
                break;
            case 33429:
                itemDef.name = "@pur@10M Nomad Certificate";
                itemDef.inventoryModel = 60954;
                itemDef.zoom2d = ItemDefinition.lookup(696).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(696).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(696).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(696).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(696).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Use", null, null, "Drop" };
                break;
            case 33430:
                itemDef.name = "Wraith Sword";
                itemDef.maleModel0 = 60957;
                itemDef.femaleModel0 = 60957;
                itemDef.inventoryModel = 60956;
                itemDef.zoom2d = ItemDefinition.lookup(33202).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(33202).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(33202).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(33202).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(33202).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33431:
                itemDef.name = "Wraith Scythe";
                itemDef.maleModel0 = 60964;
                itemDef.femaleModel0 = 60964;
                itemDef.inventoryModel = 60958;
                itemDef.zoom2d = ItemDefinition.lookup(33203).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(33203).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(33203).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(33203).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(33203).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33432:
                itemDef.name = "Wraith Spear";
                itemDef.maleModel0 = 60960;
                itemDef.femaleModel0 = 60960;
                itemDef.inventoryModel = 60959;
                itemDef.zoom2d = ItemDefinition.lookup(33204).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(33204).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(33204).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(33204).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(33204).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33433:
                itemDef.name = "Wraith Staff";
                itemDef.maleModel0 = 60962;
                itemDef.femaleModel0 = 60962;
                itemDef.inventoryModel = 60961;
                itemDef.zoom2d = ItemDefinition.lookup(33205).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(33205).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(33205).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(33205).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(33205).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33434:
                itemDef.name = "Wraith Bow";
                itemDef.maleModel0 = 60963;
                itemDef.femaleModel0 = 60963;
                itemDef.inventoryModel = 60967;
                itemDef.zoom2d = ItemDefinition.lookup(33207).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(33207).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(33207).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(33207).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(33207).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33435:
                itemDef.name = "Wraith Crossbow";
                itemDef.maleModel0 = 60966;
                itemDef.femaleModel0 = 60966;
                itemDef.inventoryModel = 60965;
                itemDef.zoom2d = ItemDefinition.lookup(26269).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(26269).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(26269).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(26269).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(26269).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 29625:
                itemDef.name = "Epsteins Island Scroll";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
                break;
            case 9624:
                itemDef.name = "Tumekens Warden Instance Token";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
                break;
            case 20128:  //Darkness robes
                itemDef.maleModel0 = 31752;
                itemDef.femaleModel0 = 31836;
                itemDef.inventoryModel = 31969;
                break;
            case 20131:  //Darkness robes
                itemDef.maleModel0 = 31814;
                itemDef.maleModel1 = 31802;
                itemDef.femaleModel0 = 31877;
                itemDef.femaleModel1 = 31865;
                itemDef.inventoryModel = 32036;
                break;
            case 20137:  //Darkness robes
                itemDef.maleModel0 = 31788;
                itemDef.femaleModel0 = 31858;
                itemDef.inventoryModel = 31997;
                break;
            case 20140:  //Darkness robes
                itemDef.maleModel0 = 31818;
                itemDef.femaleModel0 = 31885;
                itemDef.inventoryModel = 32034;
                break;
            case 20134:  //Darkness robes
                itemDef.maleModel0 = 31774;
                itemDef.femaleModel0 = 31852;
                itemDef.inventoryModel = 32001;
                break;
            case 33436:
                itemDef.name = "Bank Vault";
                itemDef.inventoryModel = 60968;
                itemDef.zoom2d = ItemDefinition.lookup(7677).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(7677).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(7677).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(7677).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(7677).yOffset2d;
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Drop" };
                break;
            case 33438:
                itemDef.name = "Wraith Mask";
                itemDef.maleModel0 = 60975;
                itemDef.femaleModel0 = 60975;
                itemDef.inventoryModel = 60974;
                itemDef.zoom2d = ItemDefinition.lookup(27235).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(27235).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(27235).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(27235).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(27235).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33439:
                itemDef.name = "Wraith Body";
                itemDef.maleModel0 = 60977;
                itemDef.femaleModel0 = 60977;
                itemDef.inventoryModel = 60976;
                itemDef.zoom2d = ItemDefinition.lookup(27238).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(27238).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(27238).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(27238).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(27238).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33440:
                itemDef.name = "Wraith legs";
                itemDef.maleModel0 = 60979;
                itemDef.femaleModel0 = 60979;
                itemDef.inventoryModel = 60978;
                itemDef.zoom2d = ItemDefinition.lookup(27241).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(27241).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(27241).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(27241).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(27241).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 33442:
                itemDef.name = "100% Thrills";
                itemDef.maleModel0 = 60981;
                itemDef.femaleModel0 = 60981;
                itemDef.inventoryModel = 60980;
                itemDef.zoom2d = ItemDefinition.lookup(29796).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(29796).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(29796).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(29796).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(29796).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(29796).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33443:
                itemDef.name = "Wraith Shield";
                itemDef.maleModel0 = 60983;
                itemDef.femaleModel0 = 60983;
                itemDef.inventoryModel = 60982;
                itemDef.zoom2d = ItemDefinition.lookup(12817).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(12817).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(12817).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(12817).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(12817).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(12817).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33444:
                itemDef.name = "Wraith Book";
                itemDef.maleModel0 = 60985;
                itemDef.femaleModel0 = 60985;
                itemDef.inventoryModel = 60984;
                itemDef.zoom2d = ItemDefinition.lookup(26551).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(26551).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(26551).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(26551).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(26551).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(26551).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33445:
                itemDef.name = "Wraith Defender";
                itemDef.maleModel0 = 60987;
                itemDef.femaleModel0 = 60987;
                itemDef.inventoryModel = 60986;
                itemDef.zoom2d = ItemDefinition.lookup(27552).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(27552).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(27552).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(27552).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(27552).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(27552).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33446:
                itemDef.name = "ale of the scotty";
                itemDef.maleModel0 = 60989;
                itemDef.femaleModel0 = 60990;
                itemDef.inventoryModel = 60988;
                itemDef.zoom2d = ItemDefinition.lookup(20056).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(20056).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(20056).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(20056).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(20056).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(20056).yOffset2d;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;

        }
        return itemDef;
    }

    public transient boolean custom = false;

    public static ItemDefinition lookup(int itemId) {
        if(itemId < 0)
            throw new RuntimeException();

        ItemDefinition itemDef = (ItemDefinition) cache.get(itemId);
        if (itemDef == null) {
            if (Configuration.dumpDataLists && newCustomItems(itemId) != null) {
                return newCustomItems(itemId);
            }
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.ITEM, itemId);
            itemDef = new ItemDefinition();
            itemDef.setDefaults();
            itemDef.id = itemId;
            if (data != null) {
                try {
                    itemDef.decode(new Buffer(data));
                } catch (Exception e) {
                    /*System.out.println("Error coding item " + itemId + "[" + itemDef.name != null ? itemDef.name : "Null" + "]");
                    e.printStackTrace();*/
                }
                if (itemDef.noteTemplateId != -1 && itemDef.noteLinkId != -1) {
                    itemDef.toNote();
                }
                itemDef.sortBurntFood();
                cache.put(itemDef, itemId);
            }
        }

        itemDef = customItems(itemDef);

        return itemDef;
    }

    private void sortBurntFood() {
        if(!burntFish.contains(id))
            return;
        if(interfaceOptions == null) {
            interfaceOptions = new String[5];
        }
        interfaceOptions[0] = "Eat";
    }


    void method2789(ItemDefinition var1, ItemDefinition var2) {
        inventoryModel = var1.inventoryModel * 1;
        zoom2d = var1.zoom2d * 1;
        xan2d = 1 * var1.xan2d;
        yan2d = 1 * var1.yan2d;
        zan2d = 1 * var1.zan2d;
        xOffset2d = 1 * var1.xOffset2d;
        yOffset2d = var1.yOffset2d * 1;
        originalColours = var2.originalColours;
        modifiedColours = var2.modifiedColours;
        // originalTextureColors = var2.originalTextureColors;
        // modifiedTextureColors = var2.modifiedTextureColors;
        name = var2.name;
        members = var2.members;
        stacks = var2.stacks;
        maleModel0 = 1 * var2.maleModel0;
        maleModel1 = 1 * var2.maleModel1;
        maleModel2 = 1 * var2.maleModel2;
        femaleModel0 = var2.femaleModel0 * 1;
        femaleModel1 = var2.femaleModel1 * 1;
        femaleModel2 = 1 * var2.femaleModel2;
        maleHeadModel0 = 1 * var2.maleHeadModel0;
        maleHeadModel1 = var2.maleHeadModel1 * 1;
        femaleHeadModel0 = var2.femaleHeadModel0 * 1;
        femaleHeadModel1 = var2.femaleHeadModel1 * 1;
        teamCape = var2.teamCape * 1;
        options = var2.options;
        interfaceOptions = new String[5];
        equipActions = new String[5];
        if (null != var2.interfaceOptions) {
            for (int var4 = 0; var4 < 4; ++var4) {
                interfaceOptions[var4] = var2.interfaceOptions[var4];
            }
        }

        interfaceOptions[4] = "Discard";
        cost = 0;
    }

    void toPlaceholder(ItemDefinition var1, ItemDefinition var2) {
        inventoryModel = var1.inventoryModel * 1;
        zoom2d = 1 * var1.zoom2d;
        xan2d = var1.xan2d * 1;
        yan2d = var1.yan2d * 1;
        zan2d = var1.zan2d * 1;
        xOffset2d = 1 * var1.xOffset2d;
        yOffset2d = var1.yOffset2d * 1;
        originalColours = var1.originalColours;
        modifiedColours = var1.modifiedColours;
        originalTextureColours = var1.originalTextureColours;
        modifiedTextureColours = var1.modifiedTextureColours;
        stacks = var1.stacks;
        name = var2.name;
        cost = 0;
    }

    public static Sprite getSmallSprite(int itemId) {
        return getSmallSprite(itemId, 1);
    }

    public static Sprite getSprite(int itemId, int stackSize, int outlineColor, boolean noted, int border,int shadow) {
        if (outlineColor == 0) {
            Sprite sprite = (Sprite) sprites.get(itemId);

            if (sprite != null && sprite.height != stackSize && sprite.height != -1) {
                sprite.remove();
                sprite = null;
            }

            if (sprite != null) {
                return sprite;
            }
        }

        ItemDefinition definition = lookup(itemId);

        if (definition.countObj == null) {
            stackSize = -1;
        }

        if (stackSize > 1) {
            int stack_item_id = -1;

            for (int j1 = 0; j1 < 10; j1++) {
                if (stackSize >= definition.countCo[j1] && definition.countCo[j1] != 0) {
                    stack_item_id = definition.countObj[j1];
                }
            }

            if (stack_item_id != -1) {
                definition = lookup(stack_item_id);
            }
        }

        Model model = definition.getModel(1);

        if (model == null) {
            return null;
        }

        Sprite sprite = null;


        Sprite enabledSprite = new Sprite(32, 32);
        int centerX = Rasterizer3D.originViewX;
        int centerY = Rasterizer3D.originViewY;
        int[] lineOffsets = Rasterizer3D.scanOffsets;
        int[] pixels = Rasterizer2D.Rasterizer2D_pixels;
        int width = Rasterizer2D.Rasterizer2D_width;
        int height = Rasterizer2D.Rasterizer2D_height;
        int vp_left = Rasterizer2D.Rasterizer2D_xClipStart;
        int vp_right = Rasterizer2D.Rasterizer2D_xClipEnd;
        int vp_top = Rasterizer2D.Rasterizer2D_yClipStart;
        int vp_bottom = Rasterizer2D.Rasterizer2D_yClipEnd;
        Rasterizer3D.world = false;
        Rasterizer3D.aBoolean1464 = false;
        Rasterizer2D.initDrawingArea(32, 32, enabledSprite.pixels);
        Rasterizer2D.drawItemBox(0, 0, 32, 32, 0);
        Rasterizer3D.useViewport();
        int k3 = definition.zoom2d;

        if (outlineColor == -1) {
            k3 = (int) (k3 * 1.5D);
        }

        if (outlineColor > 0) {
            k3 = (int) (k3 * 1.04D);
        }

        int l3 = Rasterizer3D.SINE[definition.xan2d] * k3 >> 16;
        int i4 = Rasterizer3D.COSINE[definition.xan2d] * k3 >> 16;
        Rasterizer3D.renderOnGpu = true;
        model.renderModel(definition.yan2d, definition.zan2d, definition.xan2d, definition.xOffset2d,
                l3 + model.modelBaseY / 2 + definition.yOffset2d, i4 + definition.yOffset2d);
        Rasterizer3D.renderOnGpu = false;

        enabledSprite.highlight(1);

        if (outlineColor == 0) {
            enabledSprite.shadow(3153952);
        }

        Rasterizer2D.initDrawingArea(32, 32, enabledSprite.pixels);

        if (noted) {
            int old_w = sprite.width;
            int old_h = sprite.height;
            sprite.width = 32;
            sprite.height = 32;
            sprite.drawSprite(0, 0);
            sprite.width = old_w;
            sprite.height = old_h;
        }

        if (outlineColor == 0) {
            sprites.put(enabledSprite, itemId);
        }

        Rasterizer2D.initDrawingArea(height, width, pixels);
        Rasterizer2D.setDrawingArea(vp_bottom, vp_left, vp_right, vp_top);
        Rasterizer3D.originViewX = centerX;
        Rasterizer3D.originViewY = centerY;
        Rasterizer3D.scanOffsets = lineOffsets;
        Rasterizer3D.aBoolean1464 = true;
        Rasterizer3D.world = true;
        enabledSprite.width = definition.isStackable() ? 33 : 32;
        enabledSprite.height = stackSize;
        return enabledSprite;
    }


    public static Sprite getSprite(int itemId, int stackSize, int outlineColor) {

        if (outlineColor == 0) {
            Sprite sprite = (Sprite) sprites.get(itemId);
            if (sprite != null && sprite.height != stackSize && sprite.height != -1) {

                sprite.remove();
                sprite = null;
            }
            if (sprite != null)
                return sprite;
        }
        ItemDefinition itemDef = lookup(itemId);
        if(itemDef == null)
            return null;
        if (itemDef.countObj == null)
            stackSize = -1;
        if (stackSize > 1) {
            int stack_item_id = -1;
            for (int j1 = 0; j1 < 10; j1++)
                if (stackSize >= itemDef.countCo[j1] && itemDef.countCo[j1] != 0)
                    stack_item_id = itemDef.countObj[j1];

            if (stack_item_id != -1)
                itemDef = lookup(stack_item_id);
        }
        Model model = itemDef.getModel(1);
        if(itemId == 10198) {
            model = Client.localPlayer.getRotatedModel();
            if(model != null) {
                model.scale(95, 95, 95);
                model.rotate90Degrees();
                model.rotate90Degrees();
                model.rotate90Degrees();
            }
        }
        if(itemId == 10199) {
            model = Client.localPlayer.getRotatedModel();
            if(model != null) {
                model.scale(95, 95, 95);
                model.rotate90Degrees();
                model.recolor(0);
                model.prepareSkeleton();
                model.light(64, 850, -30, -50, -30, true);
            }
        }
        if (model == null)
            return null;
        Sprite sprite = null;
        if (itemDef.noteTemplateId != -1) {
            sprite = getSprite(itemDef.noteLinkId, 10, -1);
            if (sprite == null) {
                return null;
            }
        } else if (itemDef.notedId != -1) {
            sprite = getSprite(itemDef.unnotedId, 10, -1);
            if (sprite == null) {
                return null;
            }
        } else if (itemDef.placeholderTemplate != -1) {
            sprite = getSprite(itemDef.placeholderLink, 10, -1);
            if (sprite == null) {
                return null;
            }
        }
        if (itemDef.customSpriteLocation != -1)
        {
            return SpriteCache.lookup(itemDef.customSpriteLocation);
        }
        Sprite enabledSprite = new Sprite(32, 32);
        int centerX = Rasterizer3D.originViewX;
        int centerY = Rasterizer3D.originViewY;
        int[] lineOffsets = Rasterizer3D.scanOffsets;
        int[] pixels = Rasterizer2D.Rasterizer2D_pixels;
        int width = Rasterizer2D.Rasterizer2D_width;
        int height = Rasterizer2D.Rasterizer2D_height;
        int vp_left = Rasterizer2D.Rasterizer2D_xClipStart;
        int vp_right = Rasterizer2D.Rasterizer2D_xClipEnd;
        int vp_top = Rasterizer2D.Rasterizer2D_yClipStart;
        int vp_bottom = Rasterizer2D.Rasterizer2D_yClipEnd;
        Rasterizer3D.world = false;
        Rasterizer3D.aBoolean1464 = false;
        Rasterizer2D.initDrawingArea(32, 32, enabledSprite.pixels);
        Rasterizer2D.drawItemBox(0, 0, 32, 32, 0);
        Rasterizer3D.useViewport();
        int k3 = itemDef.zoom2d;
        if (outlineColor == -1)
            k3 = (int) ((double) k3 * 1.5D);
        if (outlineColor > 0)
            k3 = (int) ((double) k3 * 1.04D);
        int l3 = Rasterizer3D.SINE[itemDef.xan2d] * k3 >> 16;
        int i4 = Rasterizer3D.COSINE[itemDef.xan2d] * k3 >> 16;
        Rasterizer3D.renderOnGpu = true;
        model.renderModel(itemDef.yan2d, itemDef.zan2d, itemDef.xan2d, itemDef.xOffset2d,
                l3 + model.modelBaseY / 2 + itemDef.yOffset2d, i4 + itemDef.yOffset2d);

        enabledSprite.outline(1);
        if (outlineColor > 0) {
            enabledSprite.outline(16777215);
        }
        if (outlineColor == 0) {
            enabledSprite.shadow(3153952);
        }

        Rasterizer2D.initDrawingArea(32, 32, enabledSprite.pixels);

        if (itemDef.noteTemplateId != -1) {
            int old_w = sprite.width;
            int old_h = sprite.height;
            sprite.width = 32;
            sprite.height = 32;
            sprite.drawSprite(0, 0);
            sprite.width = old_w;
            sprite.height = old_h;
        }
        if (outlineColor == 0 && (itemId != 10198 && itemId != 10199))
            sprites.put(enabledSprite, itemId);
        Rasterizer2D.initDrawingArea(height, width, pixels);
        Rasterizer2D.setDrawingArea(vp_bottom, vp_left, vp_right, vp_top);
        Rasterizer3D.originViewX = centerX;
        Rasterizer3D.originViewY = centerY;
        Rasterizer3D.scanOffsets = lineOffsets;
        Rasterizer3D.aBoolean1464 = true;
        Rasterizer3D.world = true;
        if (itemDef.isStackable())
            enabledSprite.width = 33;
        else
            enabledSprite.width = 32;
        enabledSprite.height = stackSize;
        return enabledSprite;
    }

    public static Sprite getSmallSprite(int itemId, int stackSize) {

        ItemDefinition itemDef = lookup(itemId);
        if (itemDef.countObj == null)
            stackSize = -1;
        if (stackSize > 1) {
            int stack_item_id = -1;
            for (int j1 = 0; j1 < 10; j1++)
                if (stackSize >= itemDef.countCo[j1] && itemDef.countCo[j1] != 0)
                    stack_item_id = itemDef.countObj[j1];

            if (stack_item_id != -1)
                itemDef = lookup(stack_item_id);
        }
        Model model = itemDef.getModel(1);
        if (model == null)
            return null;
        Sprite sprite = null;
        if (itemDef.noteTemplateId != -1) {
            sprite = getSprite(itemDef.noteLinkId, 10, -1);
            if (sprite == null)
                return null;
        }
        Sprite enabledSprite = new Sprite(18, 18);
        int centerX = Rasterizer3D.originViewX;
        int centerY = Rasterizer3D.originViewY;
        int[] lineOffsets = Rasterizer3D.scanOffsets;
        int[] pixels = Rasterizer2D.Rasterizer2D_pixels;
        int width = Rasterizer2D.Rasterizer2D_width;
        int height = Rasterizer2D.Rasterizer2D_height;
        int vp_left = Rasterizer2D.Rasterizer2D_xClipStart;
        int vp_right = Rasterizer2D.Rasterizer2D_xClipEnd;
        int vp_top = Rasterizer2D.Rasterizer2D_yClipStart;
        int vp_bottom = Rasterizer2D.Rasterizer2D_yClipEnd;
        Rasterizer3D.world = false;
        Rasterizer3D.aBoolean1464 = false;
        Rasterizer2D.initDrawingArea(18, 18, enabledSprite.pixels);
        Rasterizer2D.drawItemBox(0, 0, 18, 18, 0);
        Rasterizer3D.useViewport();
        int k3 = (int) (itemDef.zoom2d * 1.6D);

        int l3 = Rasterizer3D.SINE[itemDef.xan2d] * k3 >> 16;
        int i4 = Rasterizer3D.COSINE[itemDef.xan2d] * k3 >> 16;
        Rasterizer3D.renderOnGpu = true;
        model.renderModel(itemDef.yan2d, itemDef.zan2d, itemDef.xan2d, itemDef.xOffset2d,
                l3 + model.modelBaseY / 2 + itemDef.yOffset2d, i4 + itemDef.yOffset2d);

        enabledSprite.outline(1);

        if (itemDef.noteTemplateId != -1) {
            int old_w = sprite.width;
            int old_h = sprite.height;
            sprite.width = 18;
            sprite.height = 18;
            sprite.drawSprite(0, 0);
            sprite.width = old_w;
            sprite.height = old_h;
        }

        sprites.put(enabledSprite, itemId);
        Rasterizer2D.initDrawingArea(height, width, pixels);
        Rasterizer2D.setDrawingArea(vp_bottom, vp_left, vp_right, vp_top);
        Rasterizer3D.originViewX = centerX;
        Rasterizer3D.originViewY = centerY;
        Rasterizer3D.scanOffsets = lineOffsets;
        Rasterizer3D.aBoolean1464 = true;
        Rasterizer3D.world = true;

        enabledSprite.width = 18;
        enabledSprite.height = 18;
        return enabledSprite;
    }

    public static Sprite getSprite(int itemId, int stackSize, int zoom, int outlineColor) {
        ItemDefinition itemDef = lookup(itemId);
        if (itemDef.countObj == null)
            stackSize = -1;
        if (stackSize > 1) {
            int stack_item_id = -1;
            for (int j1 = 0; j1 < 10; j1++)
                if (stackSize >= itemDef.countCo[j1] && itemDef.countCo[j1] != 0)
                    stack_item_id = itemDef.countObj[j1];

            if (stack_item_id != -1)
                itemDef = lookup(stack_item_id);
        }
        Model model = itemDef.getModel(1);
        if (model == null)
            return null;
        Sprite sprite = new Sprite(90, 90);
        int centerX = Rasterizer3D.originViewX;
        int centerY = Rasterizer3D.originViewY;
        int[] lineOffsets = Rasterizer3D.scanOffsets;
        int[] pixels = Rasterizer2D.Rasterizer2D_pixels;
        int width = Rasterizer2D.Rasterizer2D_width;
        int height = Rasterizer2D.Rasterizer2D_height;
        int vp_left = Rasterizer2D.Rasterizer2D_xClipStart;
        int vp_right = Rasterizer2D.Rasterizer2D_xClipEnd;
        int vp_top = Rasterizer2D.Rasterizer2D_yClipStart;
        int vp_bottom = Rasterizer2D.Rasterizer2D_yClipEnd;
        Rasterizer3D.world = false;
        Rasterizer3D.aBoolean1464 = false;
        Rasterizer2D.initDrawingArea(90, 90, sprite.pixels);
        Rasterizer2D.drawItemBox(0, 0, 90, 90, 0);
        Rasterizer3D.useViewport();
        int l3 = Rasterizer3D.SINE[itemDef.xan2d] * zoom >> 15;
        int i4 = Rasterizer3D.COSINE[itemDef.xan2d] * zoom >> 15;
        Rasterizer3D.renderOnGpu = true;

        model.renderModel(itemDef.yan2d, itemDef.zan2d, itemDef.xan2d, itemDef.xOffset2d,
                l3 + model.modelBaseY / 2 + itemDef.yOffset2d, i4 + itemDef.yOffset2d);

        Rasterizer3D.renderOnGpu = false;
        sprite.outline(1);
        if (outlineColor > 0) {
            sprite.outline(16777215);
        }
        if (outlineColor == 0) {
            sprite.shadow(3153952);
        }
        Rasterizer2D.initDrawingArea(90, 90, sprite.pixels);
        Rasterizer2D.initDrawingArea(height, width, pixels);
        Rasterizer2D.setDrawingArea(vp_bottom, vp_left, vp_right, vp_top);
        Rasterizer3D.originViewX = centerX;
        Rasterizer3D.originViewY = centerY;
        Rasterizer3D.scanOffsets = lineOffsets;
        Rasterizer3D.aBoolean1464 = true;
        Rasterizer3D.world = true;
        if (itemDef.isStackable())
            sprite.width = 33;
        else
            sprite.width = 32;
        sprite.height = stackSize;
        return sprite;
    }

    public boolean isDialogueModelCached(int gender) {
        int model_1 = maleHeadModel0;
        int model_2 = maleHeadModel1;
        if (gender == 1) {
            model_1 = femaleHeadModel0;
            model_2 = femaleHeadModel1;
        }
        if (model_1 == -1)
            return true;
        boolean cached = Model.isCached(model_1);
        if (model_2 != -1 && !Model.isCached(model_2))
            cached = false;
        return cached;
    }

    public Model getChatEquipModel(int gender) {
        int dialogueModel = maleHeadModel0;
        int dialogueHatModel = maleHeadModel1;
        if (gender == 1) {
            dialogueModel = femaleHeadModel0;
            dialogueHatModel = femaleHeadModel1;
        }
        if (dialogueModel == -1)
            return null;
        Model dialogueModel_ = Model.getModel(dialogueModel);
        if (dialogueHatModel != -1) {
            Model hatModel_ = Model.getModel(dialogueHatModel);
            Model[] models = {dialogueModel_, hatModel_};
            dialogueModel_ = new Model(2, models);
        }
        if (originalColours != null) {
            for (int i1 = 0; i1 < originalColours.length; i1++)
                dialogueModel_.recolor(originalColours[i1], modifiedColours[i1]);

        }
        if (modifiedTextureColours != null) {
            for (int i1 = 0; i1 < modifiedTextureColours.length; i1++)
                dialogueModel_.retexture(modifiedTextureColours[i1], originalTextureColours[i1]);
        }
        return dialogueModel_;
    }

    public boolean isEquippedModelCached(int gender) {
        int primaryModel = maleModel0;
        int secondaryModel = maleModel1;
        int emblem = maleModel2;
        if (gender == 1) {
            primaryModel = femaleModel0;
            secondaryModel = femaleModel1;
            emblem = femaleModel2;
        }
        if (primaryModel == -1)
            return true;
        boolean cached = Model.isCached(primaryModel);
        if (secondaryModel != -1 && !Model.isCached(secondaryModel))
            cached = false;
        if (emblem != -1 && !Model.isCached(emblem))
            cached = false;
        return cached;
    }

    public void createCustomSprite(String img) {
        //customSpriteLocation = img;
    }

    public void createSmallCustomSprite(String img) {
        customSmallSpriteLocation = img;
    }


    private byte[] getCustomSprite(String img) {
        String location = (Sprite.location + Configuration.CUSTOM_ITEM_SPRITES_DIRECTORY + img).toLowerCase();
        byte[] spriteData = FileOperations.readFile(location);
        Preconditions.checkState(spriteData != null, "No sprite: " + location);
        return spriteData;
    }

    public int customSpriteLocation;
    public String customSmallSpriteLocation;

    private static final List<Integer> burntFish = List.of(
            323,
            367,
            357,
            343,
            2144,
            2146,
            381,
            375,
            387,
            399,
            393,
            11938,
            13443,
            3148
    );


    public Model getEquippedModel(int gender) {
        int primaryModel = maleModel0;
        int secondaryModel = maleModel1;
        int emblem = maleModel2;

        if (gender == 1) {
            primaryModel = femaleModel0;
            secondaryModel = femaleModel1;
            emblem = femaleModel2;
        }

        if (primaryModel == -1)
            return null;
        Model primaryModel_ = Model.getModel(primaryModel);
        if (secondaryModel != -1)
            if (emblem != -1) {
                Model secondaryModel_ = Model.getModel(secondaryModel);
                Model emblemModel = Model.getModel(emblem);
                Model[] models = {primaryModel_, secondaryModel_, emblemModel};
                primaryModel_ = new Model(3, models);
            } else {
                Model model_2 = Model.getModel(secondaryModel);
                Model[] models = {primaryModel_, model_2};
                primaryModel_ = new Model(2, models);
            }
        if(primaryModel_ == null)
            return null;
        if (gender == 0 && maleOffset != 0)
            primaryModel_.offsetBy(0, maleOffset, 0);
        if (gender == 1 && femaleOffset != 0)
            primaryModel_.offsetBy(0, femaleOffset, 0);
            if (originalColours != null) {
                for (int i1 = 0; i1 < originalColours.length; i1++)
                    primaryModel_.recolor(originalColours[i1], modifiedColours[i1]);

            }
            if (modifiedTextureColours != null) {
                for (int i1 = 0; i1 < modifiedTextureColours.length; i1++)
                    primaryModel_.retexture(modifiedTextureColours[i1], originalTextureColours[i1]);
            }
        if(id == 29499) {
            primaryModel_.setTextureFromColor(-11139, 134);
            primaryModel_.setTextureFromColor(-11112, 134);
            primaryModel_.setTextureFromColor(-14541, 134);
            primaryModel_.setTextureFromColor(-14533, 134);
            primaryModel_.setTextureFromColor(-11180, 134);
            primaryModel_.setTextureFromColor(-14679, 134);
            primaryModel_.setTextureFromColor(-14518, 134);
            primaryModel_.setTextureFromColor(-11126, 134);
            primaryModel_.setTextureFromColor(-11194, 134);
            primaryModel_.setTextureFromColor(-14524, 134);
            primaryModel_.setTextureFromColor(-14685, 134);
            primaryModel_.setTextureFromColor(-11139, 134);
            primaryModel_.setTextureFromColor(-11112, 134);
            primaryModel_.setTextureFromColor(-14541, 134);
            primaryModel_.setTextureFromColor(-14533, 134);
            primaryModel_.setTextureFromColor(-11180, 134);
            primaryModel_.setTextureFromColor(-14679, 134);
            primaryModel_.setTextureFromColor(-14518, 134);
            primaryModel_.setTextureFromColor(-11126, 134);
            primaryModel_.setTextureFromColor(-11194, 134);
            primaryModel_.setTextureFromColor(-14524, 134);
            primaryModel_.setTextureFromColor(-14685, 134);
            primaryModel_.setTextureFromColor(10198, 134);
            primaryModel_.setTextureFromColor(10027, 134);
            primaryModel_.setTextureFromColor(10023, 134);
        }
        if(id == 13589 || id == 23593 || id == 23640) {
            primaryModel_.setTextureFromColor(-11139, 134);
            primaryModel_.retextureRestOfModel(134);
        }
        return primaryModel_;
    }

    private void setDefaults() {
        customSpriteLocation = -1;
        custom = false;
        customSmallSpriteLocation = null;
        equipActions = new String[]{"Remove", null, "Operate", null, null};
        inventoryModel = 0;
        name = null;
        originalColours = null;
        modifiedColours = null;
        modifiedTextureColours = null;
        originalTextureColours = null;

        zoom2d = 2000;
        xan2d = 0;
        yan2d = 0;
        zan2d = 0;
        xOffset2d = 0;
        yOffset2d = 0;
        stacks = 0;
        cost = 1;
        members = false;
        options = null;
        interfaceOptions = null;
        maleModel0 = -1;
        maleModel1 = -1;
        maleOffset = 0;
        femaleModel0 = -1;
        femaleModel1 = -1;
        femaleOffset = 0;
        maleModel2 = -1;
        femaleModel2 = -1;
        maleHeadModel0 = -1;
        maleHeadModel1 = -1;
        femaleHeadModel0 = -1;
        femaleHeadModel1 = -1;
        countObj = null;
        countCo = null;
        noteLinkId = -1;
        noteTemplateId = -1;
        notedId = -1;
        unnotedId = -1;
        placeholderLink = -1;
        placeholderTemplate = -1;
        resizeX = 128;
        resizeY = 128;
        resizeZ = 128;
        ambient = 0;
        contrast = 0;
        teamCape = 0;
        glowColor = -1;
    }

    private void copy(ItemDefinition copy) {
        yan2d = copy.yan2d;
        xan2d = copy.xan2d;
        zan2d = copy.zan2d;
        resizeX = copy.resizeX;
        resizeY = copy.resizeY;
        resizeZ = copy.resizeZ;
        zoom2d = copy.zoom2d;
        xOffset2d = copy.xOffset2d;
        yOffset2d = copy.yOffset2d;
        inventoryModel = copy.inventoryModel;
        stacks = copy.stacks;

    }

    private void toNote() {
        ItemDefinition itemDef = lookup(noteTemplateId);
        inventoryModel = itemDef.inventoryModel;
        zoom2d = itemDef.zoom2d;
        xan2d = itemDef.xan2d;
        yan2d = itemDef.yan2d;

        zan2d = itemDef.zan2d;
        xOffset2d = itemDef.xOffset2d;
        yOffset2d = itemDef.yOffset2d;

        ItemDefinition itemDef_1 = lookup(noteLinkId);
        name = itemDef_1.name;
        members = itemDef_1.members;
        cost = itemDef_1.cost;
        stacks = 1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getNote() {
        return noteTemplateId;
    }

    @Override
    public int getLinkedNoteId() {
        return 0;
    }

    @Override
    public int getPlaceholderId() {
        return placeholderLink;
    }

    @Override
    public int getPlaceholderTemplateId() {
        return 0;
    }

    @Override
    public int getPrice() {
        return getPrice();
    }

    @Override
    public boolean isMembers() {
        return members;
    }

    @Override
    public boolean isTradeable() {
        return isTradeable;
    }

    @Override
    public void setTradeable(boolean yes) {

    }

    @Override
    public int getIsStackable() {
        return stacks;
    }

    @Override
    public int getMaleModel() {
        return 0;
    }

    @Override
    public String[] getInventoryActions() {
        return this.interfaceOptions;
    }

    @Override
    public String[] getGroundActions() {
        return this.options;
    }
    @Override
    public int getShiftClickActionIndex() {
        return dropOptionIndex;
    }

    @Override
    public void setShiftClickActionIndex(int shiftClickActionIndex) {
        this.dropOptionIndex = shiftClickActionIndex;
    }

    public Model getModel(int stack_size) {
        if (countObj != null && stack_size > 1) {
            int stack_item_id = -1;
            for (int k = 0; k < 10; k++)
                if (stack_size >= countCo[k] && countCo[k] != 0)
                    stack_item_id = countObj[k];

            if (stack_item_id != -1)
                return lookup(stack_item_id).getModel(1);
        }
        Model model = (Model) models.get(id);
        if (model != null)
            return model;
        model = Model.getModel(inventoryModel);
        if (model == null)
            return null;
        if (resizeX != 128 || resizeY != 128 || resizeZ != 128)
            model.scale(resizeX, resizeZ, resizeY);
        if (originalColours != null) {
            for (int l = 0; l < originalColours.length; l++)
                model.recolor(originalColours[l], modifiedColours[l]);

        }
        if (modifiedTextureColours != null) {
            for (int i1 = 0; i1 < modifiedTextureColours.length; i1++)
                model.retexture(modifiedTextureColours[i1], originalTextureColours[i1]);
        }
        if(id == 29499) {
            model.setTextureFromColor(-11139, 134);
            model.setTextureFromColor(-11112, 134);
            model.setTextureFromColor(-14541, 134);
            model.setTextureFromColor(-14533, 134);
            model.setTextureFromColor(-11180, 134);
            model.setTextureFromColor(-14679, 134);
            model.setTextureFromColor(-14518, 134);
            model.setTextureFromColor(-11126, 134);
            model.setTextureFromColor(-11194, 134);
            model.setTextureFromColor(-14524, 134);
            model.setTextureFromColor(-14685, 134);
            model.setTextureFromColor(-11139, 134);
            model.setTextureFromColor(-11112, 134);
            model.setTextureFromColor(-14541, 134);
            model.setTextureFromColor(-14533, 134);
            model.setTextureFromColor(-11180, 134);
            model.setTextureFromColor(-14679, 134);
            model.setTextureFromColor(-14518, 134);
            model.setTextureFromColor(-11126, 134);
            model.setTextureFromColor(-11194, 134);
            model.setTextureFromColor(-14524, 134);
            model.setTextureFromColor(-14685, 134);
            model.setTextureFromColor(10198, 134);
            model.setTextureFromColor(10027, 134);
            model.setTextureFromColor(10023, 134);
        }
        if(id == 13589 || id == 23593 || id == 23640) {
            model.setTextureFromColor(-11139, 134);
            model.retextureRestOfModel(134);
        }
        int lightInt = 64 + ambient;
        int lightMag = 768 + contrast;
        model.light(lightInt, lightMag, -50, -10, -50, true);
        model.singleTile = true;
        models.put(model, id);
        return model;
    }

    @Override
    public int getInventoryModel() {
        return 0;
    }

    @Override
    public short[] getColorToReplaceWith() {
        return new short[0];
    }

    @Override
    public short[] getTextureToReplaceWith() {
        return new short[0];
    }

    @Override
    public RSIterableNodeHashTable getParams() {
        return null;
    }

    @Override
    public void setParams(IterableHashTable params) {

    }

    @Override
    public void setParams(RSIterableNodeHashTable params) {

    }

    public Model getUnshadedModel(int stack_size) {
        if (countObj != null && stack_size > 1) {
            int stack_item_id = -1;
            for (int count = 0; count < 10; count++)
                if (stack_size >= countCo[count] && countCo[count] != 0)
                    stack_item_id = countObj[count];

            if (stack_item_id != -1)
                return lookup(stack_item_id).getUnshadedModel(1);
        }
        Model model = Model.getModel(inventoryModel);
        if (model == null)
            return null;
        if (originalColours != null) {
            for (int colorPtr = 0; colorPtr < originalColours.length; colorPtr++)
                model.recolor(originalColours[colorPtr], modifiedColours[colorPtr]);

        }
        return model;
    }

    public String description;

    private void decode(Buffer buffer) {
        while (true) {
            int opcode = buffer.readUnsignedByte();
            if (opcode == 0)
                return;
            if (opcode == 1)
                inventoryModel = buffer.readUShort();
            else if (opcode == 2)
                name = buffer.readNullTerminatedString();
            else if (opcode == 3)
                description = buffer.readNullTerminatedString();
            else if (opcode == 4)
                zoom2d = buffer.readUShort();
            else if (opcode == 5)
                xan2d = buffer.readUShort();
            else if (opcode == 6)
                yan2d = buffer.readUShort();
            else if (opcode == 7) {
                xOffset2d = buffer.readUShort();
                if (xOffset2d > 32767)
                    xOffset2d -= 0x10000;
            } else if (opcode == 8) {
                yOffset2d = buffer.readUShort();
                if (yOffset2d > 32767)
                    yOffset2d -= 0x10000;
            } else if (opcode == 10) {
                buffer.readUShort();
            } else if (opcode == 11)
                stacks = 1;
            else if (opcode == 12)
                cost = buffer.readInt();
            else if (opcode == 13)
                wearPos1 = buffer.readUnsignedByte();
            else if (opcode == 14)
                wearPos2 = buffer.readUnsignedByte();
            else if (opcode == 16)
                members = true;
            else if (opcode == 23) {
                maleModel0 = buffer.readUShort();
                maleOffset = buffer.readSignedByte();
            } else if (opcode == 24)
                maleModel1 = buffer.readUShort();
            else if (opcode == 25) {
                femaleModel0 = buffer.readUShort();
                femaleOffset = buffer.readSignedByte();
            } else if (opcode == 26) {
                femaleModel1 = buffer.readUShort();
            } else if (opcode == 27) {
                wearPos3 = buffer.readUnsignedByte();
            } else if (opcode >= 30 && opcode < 35) {
                if (options == null)
                    options = new String[5];
                options[opcode - 30] = buffer.readNullTerminatedString();
                if (options[opcode - 30].equalsIgnoreCase("hidden"))
                    options[opcode - 30] = null;
            } else if (opcode >= 35 && opcode < 40) {
                if (interfaceOptions == null)
                    interfaceOptions = new String[5];
                interfaceOptions[opcode - 35] = buffer.readNullTerminatedString();
            } else if (opcode == 40) {
                int length = buffer.readUnsignedByte();
                originalColours = new int[length];
                modifiedColours = new int[length];
                for (int index = 0; index < length; index++) {
                    originalColours[index] = buffer.readUShort();
                    modifiedColours[index] = buffer.readUShort();
                }
            } else if (opcode == 41) {
                int length = buffer.readUnsignedByte();
                originalTextureColours = new short[length];
                modifiedTextureColours = new short[length];
                for (int index = 0; index < length; index++) {
                    originalTextureColours[index] = (short) buffer.readUShort();
                    modifiedTextureColours[index] = (short) buffer.readUShort();
                }
            } else if (opcode == 42) {
                dropOptionIndex = buffer.readUnsignedByte();
            } else if (opcode == 65) {
                isTradeable = true;
            } else if (opcode == 75) {
                weight = buffer.readUShort();
            } else if (opcode == 78)
                maleModel2 = buffer.readUShort();
            else if (opcode == 79)
                femaleModel2 = buffer.readUShort();
            else if (opcode == 90)
                maleHeadModel0 = buffer.readUShort();
            else if (opcode == 91)
                femaleHeadModel0 = buffer.readUShort();
            else if (opcode == 92)
                maleHeadModel1 = buffer.readUShort();
            else if (opcode == 93)
                femaleHeadModel1 = buffer.readUShort();
            else if (opcode == 94)
                category = buffer.readUShort();
            else if (opcode == 95)
                zan2d = buffer.readUShort();
            else if (opcode == 97)
                noteLinkId = buffer.readUShort();
            else if (opcode == 98)
                noteTemplateId = buffer.readUShort();
            else if (opcode >= 100 && opcode < 110) {
                if (countObj == null) {
                    countObj = new int[10];
                    countCo = new int[10];
                }
                countObj[opcode - 100] = buffer.readUShort();
                countCo[opcode - 100] = buffer.readUShort();

            } else if (opcode == 110)
                resizeX = buffer.readUShort();
            else if (opcode == 111)
                resizeY = buffer.readUShort();
            else if (opcode == 112)
                resizeZ = buffer.readUShort();
            else if (opcode == 113)
                ambient = buffer.readSignedByte();
            else if (opcode == 114)
                contrast = buffer.readSignedByte() * 5;
            else if (opcode == 115)
                teamCape = buffer.readUnsignedByte();
            else if (opcode == 139)
                unnotedId = buffer.readUShort();
            else if (opcode == 140)
                notedId = buffer.readUShort();
            else if (opcode == 148)
                placeholderLink = buffer.readUShort();
            else if (opcode == 149) {
                placeholderTemplate = buffer.readUShort();
            } else if(opcode == 248) {
                customSpriteLocation = buffer.readInt();
            } else if (opcode == 249) {
                params = BufferExt.readStringIntParameters(buffer);
            }
            if (isStackable()) {
                weight = 0;
            }
        }
    }

    @Override
    public int getHaPrice() {
        return (int) (cost * 0.6);
    }

    @Override
    public boolean isStackable() {
        return stacks == 1 || noteTemplateId > 0;
    }

    @Override
    public void resetShiftClickActionIndex() {
        this.dropOptionIndex = 0;
    }

    @Override
    public int getIntValue(int paramID) {
        return 0;
    }

    @Override
    public void setValue(int paramID, int value) {

    }

    @Override
    public String getStringValue(int paramID) {
        return null;
    }

    @Override
    public void setValue(int paramID, String value) {

    }
}