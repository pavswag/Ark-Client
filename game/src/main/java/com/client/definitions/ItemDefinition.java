package com.client.definitions;

import com.client.*;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;
import com.client.util.BufferExt;
import com.client.utilities.FileOperations;
import com.google.common.base.Preconditions;
import net.runelite.api.IterableHashTable;
import net.runelite.rs.api.RSItemComposition;
import net.runelite.rs.api.RSIterableNodeHashTable;

import java.util.HashMap;

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
    public int[] modifiedColours;
    public int id;
    public int[] originalColours;
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
        itemDef.originalColours = copyItemDef.originalColours;
        itemDef.modifiedColours = copyItemDef.modifiedColours;
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
            case 6798:
                itemDef.custom = true;
                itemDef.name = "Damage Reduction Scroll(10min)";
                itemDef.stacks = 1;
                break;
            case 6799:
                itemDef.custom = true;
                itemDef.name = "Damage Reduction Scroll(30min)";
                itemDef.stacks = 1;
                break;
            case 6800:
                itemDef.custom = true;
                itemDef.name = "Damage Reduction Scroll(60min)";
                itemDef.stacks = 1;
                break;
            case 6801:
                itemDef.custom = true;
                itemDef.name = "Slayer task damage(10min)";
                itemDef.stacks = 1;
                break;
            case 6802:
                itemDef.custom = true;
                itemDef.name = "Slayer task damage(30min)";
                itemDef.stacks = 1;
                break;
            case 6803:
                itemDef.custom = true;
                itemDef.name = "Slayer task damage(60min)";
                itemDef.stacks = 1;
                break;
            case 6804:
                itemDef.custom = true;
                itemDef.name = "Double harvest(10min)";
                itemDef.stacks = 1;
                break;
            case 6806:
                itemDef.custom = true;
                itemDef.name = "Double harvest(30min)";
                itemDef.stacks = 1;
                break;
            case 6808:
                itemDef.custom = true;
                itemDef.name = "Double harvest(60min)";
                itemDef.stacks = 0;
                break;
            case 26551:
                itemDef.custom = true;
                itemDef.name = "ArkCane grimoire";
                itemDef.interfaceOptions = new String[] { null, "Wield", "Read", null, "Drop" };
                break;
            case 8232:
                itemDef.setDefaults();
                itemDef.custom = true;
                itemDef.name = "@red@lil' Nyx";
                //itemDef.description = "The most powerful pet, see ::foepets for full list of perks.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.inventoryModel = 60050;
                itemDef.zoom2d = 4280;
                itemDef.xan2d = 270;
                itemDef.yan2d = 322;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -1;
                itemDef.yOffset2d = 83;
                break;
            case 8230:
                itemDef.setDefaults();
                itemDef.custom = true;
                itemDef.name = "@gre@lil' Flying pumpkin";
                //itemDef.description = "The most powerful pet, see ::foepets for full list of perks.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.inventoryModel = 49469;
                itemDef.zoom2d = 5980;
                itemDef.xan2d = 96;
                itemDef.yan2d = 119;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 6;
                itemDef.yOffset2d = -48;
                break;
            case 8231:
                itemDef.setDefaults();
                itemDef.custom = true;
                itemDef.name = "@gre@lil' Jack-O-Kraken";
                //itemDef.description = "The most powerful pet, see ::foepets for full list of perks.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.inventoryModel = 60049;
                itemDef.zoom2d = 7480;
                itemDef.xan2d = 200;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -322;
                break;
            case 13372:
                itemDef.custom = true;
                itemDef.name = "Juan Gloves";
                break;
            case 24364:
                itemDef.custom = true;
                itemDef.name = "Island Scroll (15min)";
                itemDef.stacks = 0;
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, null};
                break;
            case 24365:
                itemDef.custom = true;
                itemDef.name = "Island Scroll (30min)";
                itemDef.stacks = 0;
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, null};
                break;
            case 24366:
                itemDef.custom = true;
                itemDef.name = "Island Scroll (60min)";
                itemDef.stacks = 0;
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, null};
                break;
            case 20754:
                itemDef.custom = true;
                itemDef.stacks = 0;
                break;

            case 26545:
                itemDef.custom = true;
                itemDef.name = "Hope (Random Perks)";
                break;
            case 26546:
                itemDef.custom = true;
                itemDef.name = "(Skilling) Fragment";
                break;
            case 26547:
                itemDef.custom = true;
                itemDef.name = "(Combat) Fragment";
                break;
            case 26548:
                itemDef.custom = true;
                itemDef.name = "(Misc) Fragment";
                break;


            case 26575:
                itemDef.custom = true;
                itemDef.name = "Key Of Araphel.";
                break;
            case 21726:
            case 21728:
                itemDef.custom = true;
                itemDef.stacks = 1;
                break;
            case 12863:
                itemDef.custom = true;
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, null};
                break;
            case 13092: //this makes crystal halberds wieldable, weird af.
            case 13093:
            case 13094:
            case 13095:
            case 13096:
            case 13097:
            case 13098:
            case 13099:
            case 13100:
            case 13101:
                itemDef.custom = true;
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, null};
                break;
            case 23933:
                itemDef.custom = true;
                itemDef.name = "Vote crystal";
                break;
            case 9698:
                itemDef.custom = true;
                itemDef.name = "Unfired burning rune";
                //itemDef.description = "I should burn this.";
                itemDef.createCustomSprite("Unfired_burning_rune.png");
                break;
            case 9699:
                itemDef.custom = true;
                itemDef.name = "Burning rune";
                //itemDef.description = "Hot to the touch.";
                itemDef.createCustomSprite("Burning_rune.png");
                break;
            case 23778:
                itemDef.custom = true;
                itemDef.name = "Uncut toxic gem";
                //itemDef.description = "I should use a chisel on this.";
                break;
            case 22374:
                itemDef.custom = true;
                itemDef.name = "Hespori key";
                //itemDef.description = "Can be used on the Hespori chest.";
                break;
            case 23783:
                itemDef.custom = true;
                itemDef.name = "Toxic gem";
                //itemDef.description = "I should be careful with this.";
                break;
            case 9017:
                itemDef.custom = true;
                itemDef.name = "Hespori essence";
                //itemDef.description = "Maybe I should burn this.";
                itemDef.interfaceOptions = new String[] {  null, null, null, null, "Drop" };
                break;
            case 19473:
                itemDef.custom = true;
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                break;
            case 10556:
            case 10557:
            case 10558:
            case 10559:
                itemDef.custom = true;
                itemDef.interfaceOptions = new String[] { null, "Wear", "Feature", null, "Drop" };
                break;
            case 21898:
            case 28902:
                itemDef.custom = true;
                itemDef.interfaceOptions = new String[] { null, "Wear", "Teleports", "Features", null };
                break;
            case 27363:
                itemDef.name = "Masori assembler max cape";
                itemDef.maleModel0 = 46501;
                itemDef.femaleModel0 = 46506;
                itemDef.interfaceOptions = new String[] { null, "Wear", "Teleports", "Features", null };
                itemDef.custom = true;
                break;
            case 12873:
            case 12875:
            case 12877:
            case 12879:
            case 12881:
            case 12883:
            case 13024:
            case 13026:
            case 23113:
            case 23116:
            case 23110:
            case 12871:
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 7774:
                itemDef.name = "@yel@10 Credits";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 7775:
                itemDef.name = "@red@50 Credits";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 7776:
                itemDef.name = "@blu@100 Credits";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 23804:
                itemDef.name = "Imbue Dust";
                itemDef.custom = true;
                break;
            case 22517:
                itemDef.name = "Crystal Shard";
                itemDef.custom = true;
                break;
            case 23951:
                itemDef.name = "Crystalline Key";
                itemDef.custom = true;
                break;
            case 33237:
                itemDef.name = "@yel@1 Nomad Point Certificate";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.inventoryModel = 60039;
                itemDef.zoom2d = ItemDefinition.lookup(691).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(691).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(691).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(691).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(691).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(691).yOffset2d;
                itemDef.custom = true;
                break;
            case 691:
                itemDef.name = "@gre@10,000 Nomad Point Certificate";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 692:
                itemDef.name = "@red@25,000 Nomad Point Certificate";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 693:
                itemDef.name = "@cya@50,000 Nomad Point Certificate";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 696:
                itemDef.name = "<col=f5c964>250,000 Nomad Point Certificate";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 23877:
                itemDef.name = "Crystal Shard";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 1;
                itemDef.custom = true;
                break;
            case 23943:
                itemDef.interfaceOptions = new String[] { null, "Wear", "Uncharge", "Check", "Drop" };
                itemDef.custom = true;
                break;
            case 2996:
                itemDef.name = "@red@PKP Ticket";
                itemDef.custom = true;
                break;
            case 23776:
                itemDef.name = "@red@Hunllef's Key";
                itemDef.custom = true;
                break;
            case 13148:
                itemDef.name = "@red@Reset Lamp";
                itemDef.custom = true;
                break;
            case 6792:
                itemDef.name = "@red@Seren's Key";
                itemDef.custom = true;
                break;
            case 4185:
                itemDef.name = "@red@Porazdir's Key";
                itemDef.custom = true;
                break;
            case 21880:
                itemDef.name = "Wrath Rune";
                itemDef.cost = 1930;
                itemDef.custom = true;
                break;
            case 12885:
            case 13277:
            case 19701:
            case 13245:
            case 12007:
            case 22106:
            case 12936:
            case 24495:
                itemDef.interfaceOptions = new String[] { null, null, "Open", null, "Drop" };
                itemDef.custom = true;
                break;
            case 21262:
                itemDef.name = "Vote Genie Pet";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Release" };
                itemDef.custom = true;
                break;
            case 21817:
                itemDef.interfaceOptions = new String[] { null, "Wear", "Dismantle", null, null, };
                itemDef.custom = true;
                break;
            case 21347:
                itemDef.interfaceOptions = new String[] { null, null, null, "Chisel-Options", null, };
                itemDef.custom = true;
                break;
            case 21259:
                itemDef.name = "@red@Name Change Scroll";
                itemDef.interfaceOptions = new String[] { null, null, "Read", null, null, };
                itemDef.custom = true;
                break;
            case 22547:
            case 22552:
            case 22542:
                itemDef.interfaceOptions = new String[] { null, null, null, null, null, };
                itemDef.custom = true;
                break;
            case 22555:
            case 22550:
            case 22545:
                itemDef.interfaceOptions = new String[] { null, "Wield", "Check", "Uncharge", null, };
                itemDef.custom = true;
                break;
            case 732:
                itemDef.name = "@blu@Imbuedeifer";
                itemDef.cost = 1930;
                itemDef.custom = true;
                break;
            case 21881:
                itemDef.name = "Wrath Rune";
                itemDef.cost = 1930;
                itemDef.custom = true;
                break;
            case 13226:
                itemDef.name = "Herb Sack";
                //itemDef.description = "Thats a nice looking sack.";
                itemDef.custom = true;
                break;
/*            case 3456:
                itemDef.name = "@whi@Common Raids Key";
                //itemDef.description = "Can be used on the storage unit.";
                break;
            case 3464:
                itemDef.name = "@pur@Rare Raids Key";
                //itemDef.description = "Can be used on the storage unit.";
                break;*/
/*            case 3468:
                itemDef.name = "@pur@Raids@yel@--@pur@ Key";
                //itemDef.description = "Can be used on the storage unit.";
                break;
            case 25432:
                itemDef.name = "@pur@Raids@yel@++@pur@ Key";
                //itemDef.description = "Can be used on the storage unit.";
                break;*/
            case 10943:
                itemDef.name = "@pur@Donor Vault Token";
                itemDef.interfaceOptions = new String[] { "Tear", null, null, null, "Drop" };
                itemDef.custom = true;
                break;

            case 27463:
            case 27465:
            case 27467:
            case 27469:
            case 27471:
                itemDef.interfaceOptions = new String[] { null, "Wield", "Check", null, "Destroy" };
                itemDef.equipActions = new String[]{"Remove", null, "Check", null, null};
                itemDef.custom = true;
                break;
            case 6829:
                itemDef.name = "@yel@P2P Division pass box";
                itemDef.inventoryModel = 60052;
                itemDef.zoom2d = ItemDefinition.lookup(13346).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(13346).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(13346).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(13346).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(13346).yOffset2d;
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.custom = true;
                break;
            case 6831:
                itemDef.name = "@cya@F2P Division pass box";
                itemDef.inventoryModel = 49466;
                itemDef.zoom2d = ItemDefinition.lookup(13346).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(13346).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(13346).yan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(13346).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(13346).yOffset2d;
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.custom = true;

                break;
            case 6832:
                itemDef.name = "@red@YT Stream Giveaway Box";
                //itemDef.description = "Spawns items to giveaway for your youtube stream.";
                itemDef.interfaceOptions = new String[] { "Giveaway", null, null, null, "Drop" };
                itemDef.custom = true;

                break;
            case 6833:
                itemDef.name = "@red@YT Stream Giveaway Box (t2)";
                //itemDef.description = "Spawns items to giveaway for your youtube stream.";
                itemDef.interfaceOptions = new String[] { "Giveaway", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 13190:
                itemDef.name = "@yel@100m OSRS GP";
                itemDef.interfaceOptions = new String[] { "Redeem", null, null, null, "Drop" };
                itemDef.custom = true;
                //itemDef.description = "Redeem for 100m OSRS GP!";
                break;
            case 6121:
                itemDef.name = "Break Vials Instruction";
                itemDef.custom = true;
                //itemDef.description = "How does one break a vial, its impossible?";
                break;
            case 2528:
                itemDef.name = "@red@Experience Lamp";
                itemDef.custom = true;
                //itemDef.description = "Should I rub it......";
                break;
            case 5509:
                itemDef.name = "Small Pouch";
                itemDef.createCustomSprite("Small_pouch.png");
                itemDef.interfaceOptions = new String[] { "Fill", "Empty", "Check", null, null };
                itemDef.custom = true;
                break;
            case 5510:
                itemDef.name = "Medium Pouch";
                itemDef.createCustomSprite("Medium_pouch.png");
                itemDef.interfaceOptions = new String[] { "Fill", "Empty", "Check", null, null };
                itemDef.custom = true;
                break;
            case 5512:
                itemDef.name = "Large Pouch";
                itemDef.createCustomSprite("Large_pouch.png");
                itemDef.interfaceOptions = new String[] { "Fill", "Empty", "Check", null, null };
                itemDef.custom = true;
                break;
            case 10724: //full skeleton
            case 10725:
            case 10726:
            case 10727:
            case 10728:
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 5514:
                itemDef.name = "Giant Pouch";
                itemDef.custom = true;
                itemDef.createCustomSprite("Giant_pouch.png");
                break;
            case 22610: //vesta spear
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 22613: //vesta longsword
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 22504: //stat warhammer
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 4224:
            case 4225:
            case 4226:
            case 4227:
            case 4228:
            case 4229:
            case 4230:
            case 4231:
            case 4232:
            case 4233:
            case 4234:
            case 4235://crystal sheild
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 4212:
            case 4214:
            case 4215:
            case 4216:
            case 4217:
            case 4218:
            case 4219:
            case 4220:
            case 4221:
            case 4222:
            case 4223:
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 2841:
                itemDef.name = "@red@Bonus Exp Scroll";
                itemDef.interfaceOptions = new String[] { "@yel@Activate", null, null, null, "Drop" };
                itemDef.custom = true;
                //itemDef.description = "You will get double experience using this scroll.";
                break;
            case 21791:
            case 21793:
            case 21795:
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 19841:
                itemDef.name = "Master Casket";
                itemDef.custom = true;
                break;
            case 21034:
                itemDef.interfaceOptions = new String[] { "Read", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 6830:
                itemDef.name = "@yel@BETA @blu@BOX";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 21079:
                itemDef.interfaceOptions = new String[] { "Read", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 22093:
                itemDef.name = "@gre@Vote Streak Key";
                itemDef.custom = true;
                //itemDef.description = "Thanks for voting!";
                break;
            case 22885:
                itemDef.name = "@gre@Kronos seed";
                itemDef.custom = true;
                //itemDef.description = "Provides whole server with bonus xp for 1 skill for 5 hours!";
                break;
            case 23824:
                itemDef.name = "Slaughter charge";
                itemDef.custom = true;
                //itemDef.description = "Can be used on bracelet of slaughter to charge it.";
                break;
            case 22883:
                itemDef.name = "@gre@Iasor seed";
                itemDef.custom = true;
                //itemDef.description = "Increased drop rate (+10%) for whole server for 5 hours!";
                break;
            case 22881:
                itemDef.name = "@gre@Attas seed";
                itemDef.custom = true;
                //itemDef.description = "Provides the whole server with bonus xp for 5 hours!";
                break;
            case 20906:
                itemDef.name = "@gre@Golpar seed";
                itemDef.custom = true;
                //itemDef.description = "Provides whole server with double c keys, resource boxes, coin bags, and clues!";
                break;
            case 6112:
                itemDef.name = "@gre@Kelda seed";
                itemDef.custom = true;
                //itemDef.description = "Provides whole server with x2 Larren's keys for 1 hour!";
                break;
            case 20903:
                itemDef.name = "@gre@Noxifer seed";
                itemDef.custom = true;
                //itemDef.description = "Provides whole server with x2 Slayer points for 1 hour!";
                break;
            case 20909:
                itemDef.name = "@gre@Buchu seed";
                itemDef.custom = true;
                //itemDef.description = "Provides whole server with x2 Boss points for 1 hour!";
                break;
            case 22869:
                itemDef.name = "@gre@Celastrus seed";
                //itemDef.description = "Provides whole server with x2 Brimstone keys for 1 hour!";
                itemDef.custom = true;
                break;
            case 4205:
                itemDef.name = "@gre@Consecration seed";
                //itemDef.description = "Provides the whole server with +5 PC points for 1 hour.";
                itemDef.stacks = 1;
                itemDef.custom = true;
                break;
            case 11864:
            case 11865:
            case 19639:
            case 19641:
            case 19643:
            case 19645:
            case 19647:
            case 19649:
            case 24444:
            case 24370:
            case 23075:
            case 23073:
            case 21888:
            case 21890:
            case 21264:
            case 21266:
                itemDef.equipActions[2] = "Log";
                itemDef.equipActions[1] = "Check";
                itemDef.custom = true;
                break;
            case 13136:
                itemDef.equipActions[2] = "Elidinis";
                itemDef.equipActions[1] = "Kalphite Hive";
                itemDef.custom = true;
                break;
            case 2550:
                itemDef.equipActions[2] = "Check";
                itemDef.custom = true;
                break;
            case 19557:
                itemDef.setDefaults();
//                itemDef = ItemDefinition.lookup(19556);
                itemDef.inventoryModel = ItemDefinition.lookup(19556).inventoryModel;
                itemDef.name = "Monkey";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(19556).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(19556).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(19556).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(19556).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(19556).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(19556).yOffset2d;
                itemDef.custom = true;
                break;
            case 19942:
                itemDef.setDefaults();
//                itemDef = ItemDefinition.lookup(23184);
                itemDef.inventoryModel = ItemDefinition.lookup(23184).inventoryModel;
                itemDef.name = "Lil Mimic";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(23184).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(23184).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(23184).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(23184).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(23184).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(23184).yOffset2d;
                itemDef.custom = true;
                break;
            case 1712:
            case 1710:
            case 1708:
            case 1706:
            case 19707:
                itemDef.equipActions[1] = "Edgeville";
                itemDef.equipActions[2] = "Karamja";
                itemDef.equipActions[3] = "Draynor";
                itemDef.equipActions[4] = "Al-Kharid";
                itemDef.custom = true;
                break;
            case 21816:
                itemDef.interfaceOptions = new String[] { null, "Wear", "Uncharge", null, "Drop" };
                itemDef.equipActions[1] = "Check";
                itemDef.equipActions[2] = "Toggle-absorption";
                itemDef.custom = true;
                break;
            case 2552:
            case 2554:
            case 2556:
            case 2558:
            case 2560:
            case 2562:
            case 2564:
            case 2566: // Ring of duelling
                itemDef.equipActions[2] = "Shantay Pass";
                itemDef.equipActions[1] = "Clan wars";
                itemDef.custom = true;
                break;
            case 6680:
                itemDef.inventoryModel = 60026;
                itemDef.name = "Mini Arbograve Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = 1480;
                itemDef.xan2d = 172;
                itemDef.yan2d = 160;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -14;
                itemDef.custom = true;
                break;
            case 12579:
                itemDef.inventoryModel = 60026;
                itemDef.name = "Arbograve Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = (ItemDefinition.lookup(6199).zoom2d);
                itemDef.xan2d = ItemDefinition.lookup(6199).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(6199).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(6199).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(6199).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(6199).yOffset2d;
                itemDef.custom = true;
                break;
            case 12582:
                itemDef.inventoryModel = 60027;
                itemDef.name = "Chambers Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = (ItemDefinition.lookup(6199).zoom2d);
                itemDef.xan2d = ItemDefinition.lookup(6199).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(6199).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(6199).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(6199).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(6199).yOffset2d;
                itemDef.custom = true;
                break;
            case 12585:
                itemDef.inventoryModel = 60027;
                itemDef.name = "Mini Chambers Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = 1480;
                itemDef.xan2d = 172;
                itemDef.yan2d = 160;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -14;
                itemDef.custom = true;
                break;
            case 12588:
                itemDef.inventoryModel = 60028;
                itemDef.name = "Donation Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = (ItemDefinition.lookup(6199).zoom2d);
                itemDef.xan2d = ItemDefinition.lookup(6199).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(6199).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(6199).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(6199).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(6199).yOffset2d;
                itemDef.custom = true;
                break;
            case 19887:
                itemDef.inventoryModel = 60028;
                itemDef.name = "Mini Donation Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = 1480;
                itemDef.xan2d = 172;
                itemDef.yan2d = 160;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -14;
                itemDef.custom = true;
                break;
            case 19891:
                itemDef.inventoryModel = 60029;
                itemDef.name = "Theatre Of Blood Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = (ItemDefinition.lookup(6199).zoom2d);
                itemDef.xan2d = ItemDefinition.lookup(6199).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(6199).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(6199).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(6199).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(6199).yOffset2d;
                itemDef.custom = true;
                break;
            case 19895:
                itemDef.inventoryModel = 60029;
                itemDef.name = "Mini Theatre Of Blood Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = 1480;
                itemDef.xan2d = 172;
                itemDef.yan2d = 160;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -14;
                itemDef.custom = true;
                break;
            case 19897:
                itemDef.inventoryModel = 60030;
                itemDef.name = " Cosmetic Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = (ItemDefinition.lookup(6199).zoom2d);
                itemDef.xan2d = ItemDefinition.lookup(6199).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(6199).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(6199).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(6199).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(6199).yOffset2d;
                itemDef.custom = true;
                break;
            case 11739:
                itemDef.inventoryModel = 60031;
                itemDef.name = "@gre@Vote Mystery Box";
                //itemDef.description = "Probably contains cosmetics, or maybe not...";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.zoom2d = (ItemDefinition.lookup(6199).zoom2d);
                itemDef.xan2d = ItemDefinition.lookup(6199).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(6199).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(6199).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(6199).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(6199).yOffset2d;
                itemDef.custom = true;
                break;
            case 6828:
                itemDef.inventoryModel = 60032;
                itemDef.name = "Super Mystery Box";
                //itemDef.description = "Mystery box that contains goodies.";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = (ItemDefinition.lookup(6199).zoom2d);
                itemDef.xan2d = ItemDefinition.lookup(6199).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(6199).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(6199).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(6199).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(6199).yOffset2d;
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 6677:
                itemDef.inventoryModel = 60032;
                itemDef.name = "Mini Super Mystery Box";
                //itemDef.description = "Mystery box that contains goodies.";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = 1480;
                itemDef.xan2d = 172;
                itemDef.yan2d = 160;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -14;
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 6199:
                itemDef.name = "Mystery Box";
                //itemDef.description = "Mystery box that contains goodies.";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.custom = true;
                break;
            case 6679:
                itemDef.inventoryModel = ItemDefinition.lookup(6199).inventoryModel;
                itemDef.originalColours = ItemDefinition.lookup(6199).originalColours;
                itemDef.modifiedColours = ItemDefinition.lookup(6199).modifiedColours;
                itemDef.name = "Mini Mystery Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = 1480;
                itemDef.xan2d = 172;
                itemDef.yan2d = 160;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -14;
                itemDef.custom = true;
                break;
            case 12789:
                itemDef.name = "@red@Youtube Mystery Box";
                //itemDef.description = "Mystery box that contains goodies.";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 13346:
                itemDef.name = "Ultra Mystery Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.custom = true;
                break;
            case 6678:
                itemDef.inventoryModel = ItemDefinition.lookup(13346).inventoryModel;
                itemDef.originalColours = ItemDefinition.lookup(13346).originalColours;
                itemDef.modifiedColours = ItemDefinition.lookup(13346).modifiedColours;
                itemDef.name = "Mini Ultra Mystery Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.zoom2d = 1480;
                itemDef.xan2d = 172;
                itemDef.yan2d = 160;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -14;
                itemDef.custom = true;
                break;
            case 8167:
                itemDef.name = "@or2@Nomad Mystery Chest @red@(locked)";
                itemDef.interfaceOptions = new String[] { "Unlock", null, null, "Quick-Open", "Drop" };
                itemDef.custom = true;
                break;
            case 13438:
                itemDef.name = "Slayer Mystery Chest";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 30010:
                itemDef.setDefaults();
                itemDef.name = "Postie Pete";
                //itemDef.description = "50% chance to pick up crystal keys that drop.";
                itemDef.createCustomSprite("Postie_Pete.png");
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 30011:
                itemDef.setDefaults();
                itemDef.name = "Imp";
                //itemDef.description = "50% chance to pick up clue scrolls that drop.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Imp.png");
                itemDef.custom = true;
                break;
            case 30012:
                itemDef.setDefaults();
                itemDef.name = "Toucan";
                //itemDef.description = "50% chance to pick up resource packs.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                itemDef.createCustomSprite("Toucan.png");
                break;
            case 30013:
                itemDef.setDefaults();
                itemDef.name = "Penguin King";
                //itemDef.description = "50% chance to auto-pick up coin bags.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Penguin_King.png");
                itemDef.custom = true;
                break;
            case 30014:
                itemDef.setDefaults();
                itemDef.name = "K'klik";
                //itemDef.description = "An extra 5% in drop rate boost.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("K'klik.png");
                itemDef.custom = true;
                break;
            case 30015:
                itemDef.setDefaults();
                itemDef.name = "Shadow warrior";
                //itemDef.description = "50% chance for an additional +10% strength bonus in pvm.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Shadow_warrior.png");
                itemDef.custom = true;
                break;
            case 30016:
                itemDef.setDefaults();
                itemDef.name = "Shadow archer";
                //itemDef.description = "50% chance for an additional +10% range str bonus in PvM.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Shadow_archer.png");
                itemDef.custom = true;
                break;
            case 30017:
                itemDef.setDefaults();
                itemDef.name = "Shadow wizard";
                //itemDef.description = "50% chance for an additional +10% mage str bonus in PvM.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Shadow_wizard.png");
                itemDef.custom = true;
                break;
            case 30018:
                itemDef.setDefaults();
                itemDef.name = "Healer Death Spawn";
                //itemDef.description = "5% chance hit restores HP.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Healer_Death_Spawn.png");
                itemDef.custom = true;
                break;
            case 30019:
                itemDef.setDefaults();
                itemDef.name = "Holy Death Spawn";
                //itemDef.description = "5% chance 1/2 of your hit is restored into prayer.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Holy_Death_Spawn.png");
                itemDef.custom = true;
                break;
            case 30020:
                itemDef.setDefaults();
                itemDef.name = "Corrupt beast";
                //itemDef.description = "50% chance for an additional +10% strength bonus for melee, mage, and range in pvm.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Corrupt_beast.png");
                itemDef.custom = true;
                break;
            case 30021:
                itemDef.setDefaults();
                itemDef.name = "Roc";
                //itemDef.description = "An extra 10% in drop rate boost.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Roc.png");
                itemDef.custom = true;
                break;
            case 30022:
                itemDef.setDefaults();
                itemDef.name = "@red@Kratos";
                //itemDef.description = "The most powerful pet, see ::foepets for full list of perks.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Yama.png");
                itemDef.custom = true;
                break;
            case 30023:
                itemDef.setDefaults();
                itemDef.name = "Rain cloud";
                //itemDef.description = "Don't worry be happy.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Rain_cloud.png");
                itemDef.custom = true;
                break;
            case 8866:
                itemDef.name = "Storage chest key (UIM)";
                //itemDef.description = "Used to open the UIM storage chest 1 time.";
                itemDef.custom = true;
                itemDef.stacks = 1;
                break;
            case 8868:
                itemDef.name = "Perm. storage chest key (UIM)";
                //itemDef.description = "Permanently unlocks UIM storage chest.";
                itemDef.custom = true;
                break;
            case 771:
                itemDef.name = "@cya@Ancient branch";
                //itemDef.description = "Burning items in the FoE with this branch provides a 1 time +10% FoE value increase.";
                itemDef.custom = true;
                break;
            case 2399:
                itemDef.name = "@or2@Nomad Mystery Key";
                //itemDef.description = "Used to unlock the Nomad Mystery Chest.";
                itemDef.custom = true;
                break;
            case 10832:
                itemDef.name = "Small coin bag";
                itemDef.interfaceOptions = new String[] { "Open", null, "Open-All", null, "Drop" };
                itemDef.custom = true;
                //itemDef.description = "I can see some coins inside.";
                break;
            case 10833:
                itemDef.name = "Medium coin bag";
                itemDef.interfaceOptions = new String[] { "Open", null, "Open-All", null, "Drop" };
                itemDef.custom = true;
                //itemDef.description = "I can see some coins inside.";
                break;
            case 10834:
                itemDef.name = "Large coin bag";
                itemDef.interfaceOptions = new String[] { "Open", null, "Open-All", null, "Drop" };
                itemDef.custom = true;
                //itemDef.description = "I can see some coins inside.";
                break;
            case 22316:
                itemDef.name = "Sword of ArkCane";
                //itemDef.description = "The Sword of ArkCane.";
                itemDef.custom = true;
                break;
            case 30110:
                itemDef.setDefaults();
                itemDef.name = "Dark postie pete";
                //itemDef.description = "Picks up all crystal keys and 25% chance to double.";
                itemDef.createCustomSprite("dark_Postie_Pete.png");
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 30111:
                itemDef.setDefaults();
                itemDef.name = "Dark imp";
                //itemDef.description = "Picks up all clue scrolls and 25% chance to double.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Imp.png");
                itemDef.custom = true;
                break;
            case 30112:
                itemDef.setDefaults();
                itemDef.name = "Dark toucan";
                //itemDef.description = "Picks up all resource boxes and 25% chance to double.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Toucan.png");
                itemDef.custom = true;
                break;
            case 30113:
                itemDef.setDefaults();
                itemDef.name = "Dark penguin King";
                //itemDef.description = "Picks up all coin bags and 25% chance to double.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Penguin_King.png");
                itemDef.custom = true;
                break;
            case 30114:
                itemDef.setDefaults();
                itemDef.name = "Dark k'klik";
                //itemDef.description = "An extra 10% in drop rate boost.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_K'klik.png");
                itemDef.custom = true;
                break;
            case 30115:
                itemDef.setDefaults();
                itemDef.name = "Dark shadow warrior";
                //itemDef.description = "Gives constant +10% strength bonus in pvm.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Shadow_warrior.png");
                itemDef.custom = true;
                break;
            case 30116:
                itemDef.setDefaults();
                itemDef.name = "Dark shadow archer";
                //itemDef.description = "Gives constant +10% range str bonus in PvM.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Shadow_archer.png");
                itemDef.custom = true;
                break;
            case 30117:
                itemDef.setDefaults();
                itemDef.name = "Dark shadow wizard";
                //itemDef.description = "Gives constant +10% mage str bonus in PvM.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Shadow_wizard.png");
                itemDef.custom = true;
                break;
            case 30118:
                itemDef.setDefaults();
                itemDef.name = "Dark healer death spawn";
                //itemDef.description = "10% chance hit restores HP.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Healer_Death_Spawn.png");
                itemDef.custom = true;
                break;
            case 30119:
                itemDef.setDefaults();
                itemDef.name = "Dark holy death spawn";
                //itemDef.description = "10% chance 1/2 of your hit is restored into prayer.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Holy_Death_Spawn.png");
                itemDef.custom = true;
                break;
            case 30120:
                itemDef.setDefaults();
                itemDef.name = "Dark corrupt beast";
                //itemDef.description = "Extra 10% in drop rate and constant +10% strength bonus for all styles in pvm.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Corrupt_beast.png");
                itemDef.custom = true;
                break;
            case 30121:
                itemDef.setDefaults();
                itemDef.name = "Dark roc";
                //itemDef.description = "An extra 20% in drop rate boost.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_Roc.png");
                itemDef.custom = true;
                break;
            case 30122:
                itemDef.setDefaults();
                itemDef.id = 30022;
                itemDef.inventoryModel = 47025;
                itemDef.name = "@gre@$$@blu@CashMoney@gre@$$";
                //itemDef.description = "The Spender's pet.";
                itemDef.interfaceOptions = new String[] { "Check", null, "Empty", null, "Drop" };
                itemDef.zoom2d = 1765;
                itemDef.xan2d = 148;
                itemDef.yan2d = 2026;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -2;
                itemDef.yOffset2d = 78;
                itemDef.custom = true;
                break;
            case 30123:
                itemDef.setDefaults();
                itemDef.name = "Dark seren";
                //itemDef.description = "85% chance for Wildy Event Boss to hit a 0 and 25% chance to double key.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("dark_seren.png");
                itemDef.custom = true;
                break;

            case 23939:
                itemDef.name = "Seren";
                //itemDef.description = "50% chance for wildy event bosses to hit a 0 on you.";
                itemDef.createCustomSprite("seren.png");
                itemDef.custom = true;
                break;
            case 21046:
                itemDef.name = "@cya@Chest rate bonus (+15%)";
                //itemDef.description = "A single use +15% chance from chests, or to receive a rare raids key.";
                itemDef.stacks = 1;
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 11666:
                itemDef.name = "Full Elite Void Token";
                //itemDef.description = "Use this token to receive a full elite void set with all combat pieces.";
                itemDef.interfaceOptions = new String[] { "Activate", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 1004:
                itemDef.name = "@gre@20m Coins";
                //itemDef.description = "Lovely coins.";
                itemDef.stacks = 0;
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 7629:
                itemDef.name = "@or3@2x Slayer point scroll";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 1;
                itemDef.custom = true;
                break;
            case 24460:
                itemDef.name = "@or3@Faster clues (30 mins)";
                //itemDef.description = "Clue rates are halved for npcs and skilling.";
                itemDef.interfaceOptions = new String[] { "Boost", null, null, null, "Drop" };
                itemDef.stacks = 1;
                itemDef.custom = true;
                break;
            case 7968:
                itemDef.name = "@or3@+25% Skilling pet rate (30 mins)";
                itemDef.interfaceOptions = new String[] { "Boost", null, null, null, "Drop" };
                itemDef.stacks = 1;
                itemDef.custom = true;
                break;
            case 8899:
                itemDef.name = "@gre@50m Coins";
                //itemDef.description = "Lovely coins.";
                itemDef.stacks = 0;
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 4035:
                itemDef.interfaceOptions = new String[] { "Teleport", null, null, null, null };
                itemDef.custom = true;
                break;
            case 10835:
                itemDef.name = "Buldging coin bag";
                itemDef.interfaceOptions = new String[] { "Open", null, "Open-All", null, "Drop" };
                itemDef.custom = true;
                //itemDef.description = "I can see some coins inside.";
                break;
            case 15098:
                itemDef.name = "Dice (up to 100)";
                //itemDef.description = "A 100-sided dice.";
                itemDef.inventoryModel = 31223;
                itemDef.zoom2d = 1104;
                itemDef.yan2d = 215;
                itemDef.xan2d = 94;
                itemDef.yOffset2d = -5;
                itemDef.xOffset2d = -18;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Public-roll";
                itemDef.interfaceOptions[2] = null;
                itemDef.name = "Dice (up to 100)";
                itemDef.ambient = 15;
                itemDef.contrast = 25;
                itemDef.createCustomSprite("Dice_Bag.png");
                itemDef.custom = true;
                break;
            case 11773:
            case 11771:
            case 11770:
            case 11772:
                itemDef.ambient += 45;
                itemDef.custom = true;
                break;
            case 12792:
                itemDef.name = "Graceful Recolor Box";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 6769:
                itemDef.name = "@yel@$5 Scroll";
                //itemDef.description = "Claim this scroll to be rewarded with 5 donator points.";
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 2403:
                itemDef.name = "@yel@$10 Scroll";
                //itemDef.description = "Claim this scroll to be rewarded with 10 donator points.";
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 2396:
                itemDef.name = "@yel@$25 Scroll";
                //itemDef.description = "Claim this scroll to be rewarded with 25 donator points.";
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 786:
                itemDef.name = "@yel@$50 Donator";
                //itemDef.description = "Claim this scroll to be rewarded with 50 donator points.";
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 761:
                itemDef.name = "@yel@$100 Donator";
                //itemDef.description = "Claim this scroll to be rewarded with 100 donator points.";
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 956:
                itemDef.name = "@yel@$1 Donator";
                //itemDef.description = "Claim this scroll to be rewarded with 100 donator points.";
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 607:
                itemDef.name = "@red@$250 Scroll";
                //itemDef.description = "Claim this scroll to be rewarded with 250 donator points.";
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 608:
                itemDef.name = "@gre@$500 Scroll";
                //itemDef.description = "Claim this scroll to be rewarded with 500 donator points.";
                itemDef.interfaceOptions = new String[] { "Claim", null, null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 1464:
                itemDef.name = "Archery ticket";
                itemDef.custom = true;
                //itemDef.description = "Exchange this for a Vote Point.";
                break;

            case 33049:
                itemDef.setDefaults();
                itemDef.name = "Agility master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 677, 801, 43540, 43543, 43546, 43549, 43550, 43552, 43554, 43558,
                        43560, 43575 };
                itemDef.inventoryModel = 50030;
                itemDef.maleModel0 = 50031;
                itemDef.femaleModel0 = 50031;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33033:
                itemDef.setDefaults();
                itemDef.name = "Attack master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 7104, 9151, 911, 914, 917, 920, 921, 923, 925, 929, 931, 946 };
                itemDef.inventoryModel = 50032;
                itemDef.maleModel0 = 50033;
                itemDef.femaleModel0 = 50033;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33055:
                itemDef.setDefaults();
                itemDef.name = "Construction master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 6061, 5945, 6327, 6330, 6333, 6336, 6337, 6339, 6341, 6345, 6347,
                        6362 };
                itemDef.inventoryModel = 50034;
                itemDef.maleModel0 = 50035;
                itemDef.femaleModel0 = 50035;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33040:
                itemDef.setDefaults();
                itemDef.name = "Cooking master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 920, 920, 51856, 51859, 51862, 51865, 51866, 51868, 51870, 51874,
                        51876, 51891 };
                itemDef.inventoryModel = 50036;
                itemDef.maleModel0 = 50037;
                itemDef.femaleModel0 = 50037;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33045:
                itemDef.setDefaults();
                itemDef.name = "Crafting master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 9142, 9152, 4511, 4514, 4517, 4520, 4521, 4523, 4525, 4529, 4531,
                        4546 };
                itemDef.inventoryModel = 50038;
                itemDef.maleModel0 = 50039;
                itemDef.femaleModel0 = 50039;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33034:
                itemDef.setDefaults();
                itemDef.name = "Defence master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 10460, 10473, 41410, 41413, 41416, 41419, 41420, 41422, 41424,
                        41428, 41430, 41445 };
                itemDef.inventoryModel = 50040;
                itemDef.maleModel0 = 50041;
                itemDef.femaleModel0 = 50041;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33052:
                itemDef.setDefaults();
                itemDef.name = "Farming master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 14775, 14792, 22026, 22029, 22032, 22035, 22036, 22038, 22040,
                        22044, 22046, 22061 };
                itemDef.inventoryModel = 50042;
                itemDef.maleModel0 = 50043;
                itemDef.femaleModel0 = 50043;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33044:
                itemDef.setDefaults();
                itemDef.name = "Firemaking master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 8125, 9152, 4015, 4018, 4021, 4024, 4025, 4027, 4029, 4033, 4035,
                        4050 };
                itemDef.inventoryModel = 50044;
                itemDef.maleModel0 = 50045;
                itemDef.femaleModel0 = 50045;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33043:
                itemDef.setDefaults();
                itemDef.name = "Fishing master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 9144, 9152, 38202, 38205, 38208, 38211, 38212, 38214, 38216,
                        38220, 38222, 38237 };
                itemDef.inventoryModel = 50046;
                itemDef.maleModel0 = 50047;
                itemDef.femaleModel0 = 50047;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33042:
                itemDef.setDefaults();
                itemDef.name = "Fletching master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 6067, 9152, 33670, 33673, 33676, 33679, 33680, 33682, 33684,
                        33688, 33690, 33705 };
                itemDef.inventoryModel = 50048;
                itemDef.maleModel0 = 50049;
                itemDef.femaleModel0 = 50049;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33048:
                itemDef.setDefaults();
                itemDef.name = "Herblore master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 9145, 9156, 22414, 22417, 22420, 22423, 22424, 22426, 22428,
                        22432, 22434, 22449 };
                itemDef.inventoryModel = 50050;
                itemDef.maleModel0 = 50051;
                itemDef.femaleModel0 = 50051;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33036:
                itemDef.setDefaults();
                itemDef.name = "Hitpoints master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 818, 951, 8291, 8294, 8297, 8300, 8301, 8303, 8305, 8309, 8311,
                        8319 };
                itemDef.inventoryModel = 50052;
                itemDef.maleModel0 = 50053;
                itemDef.femaleModel0 = 50053;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                //itemDef.femaleOffset = 4;
                break;
            case 33054:
                itemDef.setDefaults();
                itemDef.name = "Hunter master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 5262, 6020, 8472, 8475, 8478, 8481, 8482, 8484, 8486, 8490, 8492,
                        8507 };
                itemDef.inventoryModel = 50054;
                itemDef.maleModel0 = 50055;
                itemDef.femaleModel0 = 50055;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33039:
                itemDef.setDefaults();
                itemDef.name = "Magic master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 43569, 43685, 6336, 6339, 6342, 6345, 6346, 6348, 6350, 6354,
                        6356, 6371 };
                itemDef.inventoryModel = 50056;
                itemDef.maleModel0 = 50057;
                itemDef.femaleModel0 = 50057;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33047:
                itemDef.setDefaults();
                itemDef.name = "Mining master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 36296, 36279, 10386, 10389, 10392, 10395, 10396, 10398, 10400,
                        10404, 10406, 10421 };
                itemDef.inventoryModel = 50058;
                itemDef.maleModel0 = 50059;
                itemDef.femaleModel0 = 50059;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33038:
                itemDef.setDefaults();
                itemDef.name = "Prayer master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 9163, 9168, 117, 120, 123, 126, 127, 127, 127, 127, 127, 127 };
                itemDef.inventoryModel = 50060;
                itemDef.maleModel0 = 50061;
                itemDef.femaleModel0 = 50061;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33037:
                itemDef.setDefaults();
                itemDef.name = "Range master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 3755, 3998, 15122, 15125, 15128, 15131, 15132, 15134, 15136,
                        15140, 15142, 15157 };
                itemDef.inventoryModel = 50062;
                itemDef.maleModel0 = 50063;
                itemDef.femaleModel0 = 50063;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33053:
                itemDef.setDefaults();
                itemDef.name = "Runecrafting master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                // 4 //7 //10 //13 //14//16//18//22 //24//39
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 9152, 8128, 10318, 10321, 10324, 10327, 10328, 10330, 10332,
                        10336, 10338, 10353 };
                itemDef.inventoryModel = 50064;
                itemDef.maleModel0 = 50065;
                itemDef.femaleModel0 = 50065;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33051:
                itemDef.setDefaults();
                itemDef.name = "Slayer master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                itemDef.modifiedColours = new int[] { 57022, 48811 };
                itemDef.originalColours = new int[] { 912, 920 };
                itemDef.inventoryModel = 50066;
                itemDef.maleModel0 = 50067;
                itemDef.femaleModel0 = 50067;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33046:
                itemDef.setDefaults();
                itemDef.name = "Smithing master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 8115, 9148, 10386, 10389, 10392, 10395, 10396, 10398, 10400,
                        10404, 10406, 10421 };
                itemDef.inventoryModel = 50068;
                itemDef.maleModel0 = 50069;
                itemDef.femaleModel0 = 50069;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33035:
                itemDef.setDefaults();
                itemDef.name = "Strength master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 935, 931, 27538, 27541, 27544, 27547, 27548, 27550, 27552, 27556,
                        27558, 27573 };
                itemDef.inventoryModel = 50070;
                itemDef.maleModel0 = 50071;
                itemDef.femaleModel0 = 50071;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = 5;
                break;
            case 33050:
                itemDef.setDefaults();
                itemDef.name = "Thieving master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 11, 0, 58779, 58782, 58785, 58788, 58789, 57891, 58793, 58797,
                        58799, 58814 };
                itemDef.maleModel0 = 50073;
                itemDef.femaleModel0 = 50073;
                itemDef.inventoryModel = 50072;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                //itemDef.maleOffset = 5;
                itemDef.custom = true;
                break;

            case 33041:
                itemDef.setDefaults();
                itemDef.name = "Woodcutting master cape";
                //itemDef.description = "	A cape worn by those who've overachieved.";
                itemDef.modifiedColours = new int[] { 57022, 48811, 2, 1029, 1032, 11, 12, 14, 16, 20, 22, 2 };
                itemDef.originalColours = new int[] { 25109, 24088, 6693, 6696, 6699, 6702, 6703, 6705, 6707, 6711,
                        6713, 6728 };
                itemDef.inventoryModel = 50074;
                itemDef.maleModel0 = 50075;
                itemDef.femaleModel0 = 50075;
                itemDef.zoom2d = 2300;
                itemDef.xan2d = 400;
                itemDef.yan2d = 1020;
                itemDef.xOffset2d = 3;
                itemDef.yOffset2d = 30;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.custom = true;
                //itemDef.maleOffset = -2;
                break;
            case 27:
                itemDef.name = "Division Pass";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, null };
                itemDef.custom = true;
                break;
            case 22999:
                itemDef.name = "Infinite Overload Potion";
                //itemDef.description = "A Magical Overload Potion.";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, null };
                itemDef.custom = true;
                break;
            case 11429:
                itemDef.name = "Infinite Aggression Potion";
                //itemDef.description = "A Magical Aggression Potion.";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, null };
                itemDef.custom = true;
                break;
            case 6805:
                itemDef.name = "Fortune Spin";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, null };
                itemDef.custom = true;
                break;
            case 6807:
                itemDef.name = "1k Prestige Points";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, null };
                itemDef.custom = true;
                break;
            case 11481:
                itemDef.name = "Infinite Prayer Potion";
                //itemDef.description = "A Magical Prayer Potion.";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, null };
                itemDef.custom = true;
                break;
            case 11433:
                itemDef.name = "Rage Potion";
                //itemDef.description = "A Magical Prayer Potion.";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, null };
                itemDef.custom = true;
                break;
            case 26500:
                itemDef.name = "Donor Boss Scroll";
                //itemDef.description = "This scroll will reset your donor boss Kill Allowance.";
                itemDef.interfaceOptions = new String[] { "read", null, null, null, null };
                itemDef.custom = true;
                break;
            case 26515:
                itemDef.name = "Winner Trophy";
                //itemDef.description = "Given to winners during the ArkCane Bingo.";
                itemDef.custom = true;
                break;
            case 26598:
                itemDef.name = "Lava Eel Bait";
                //itemDef.description = "For use with a oily fishing rod.";
                itemDef.interfaceOptions = new String[] { "use", null, null, null, "drop" };
                itemDef.custom = true;
                break;
            case 33056:
                itemDef.setDefaults();
                itemDef.id = 33056;
                itemDef.inventoryModel = 65270;
                itemDef.name = "Completionist cape";
                //itemDef.description = "A cape worn by those who've overachieved.";

                itemDef.zoom2d = 7000;
                itemDef.xan2d = 496;
                itemDef.yan2d = 983;
                itemDef.zan2d = 26;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 12;

                itemDef.maleModel0 = 65310;
                itemDef.femaleModel0 = 65310;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = "Teleports";
                itemDef.interfaceOptions[3] = "Features";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33058:
                itemDef.setDefaults();
                itemDef.id = 33058;
                itemDef.inventoryModel = 60000;
                itemDef.name = "Seren godbow";
                //itemDef.description = "An intricate bow of pure crystal.";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1748;
                itemDef.xan2d = 983;
                itemDef.yan2d = 496;
                itemDef.zan2d = 26;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 12;
                itemDef.maleModel0 = 60000;
                itemDef.femaleModel0 = 60000;
                itemDef.custom = true;
                break;
            case 7478:
                itemDef.name = "@cya@AFK Token";
                //itemDef.description = "An AFK Token which can be sold to others.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.custom = true;
                break;

            case 33059:
                itemDef.setDefaults();
                itemDef.id = 33059;
                itemDef.inventoryModel = 60005;
                itemDef.name = "Halloween Body";
                //itemDef.description = "Halloween Body.";

                itemDef.zoom2d = 2078;
                itemDef.xan2d = 320;
                itemDef.yan2d = 2043;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 34;

                itemDef.maleModel0 = 60006;
                itemDef.femaleModel0 = 60006;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33060:
                itemDef.setDefaults();
                itemDef.id = 33060;
                itemDef.inventoryModel = 60007;
                itemDef.name = "Halloween boots";
                //itemDef.description = "Halloween boots.";

                itemDef.zoom2d = 1017;
                itemDef.xan2d = 357;
                itemDef.yan2d = 2043;
                itemDef.zan2d = 9;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 19;

                itemDef.maleModel0 = 60008;
                itemDef.femaleModel0 = 60008;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33061:
                itemDef.setDefaults();
                itemDef.id = 33061;
                itemDef.inventoryModel = 60009;
                itemDef.name = "Halloween cape";
                //itemDef.description = "Halloween cape.";

                itemDef.zoom2d = 2165;
                itemDef.xan2d = 320;
                itemDef.yan2d = 1191;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 15;
                itemDef.yOffset2d = 54;

                itemDef.maleModel0 = 60010;
                itemDef.femaleModel0 = 60010;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33062:
                itemDef.setDefaults();
                itemDef.id = 33062;
                itemDef.inventoryModel = 60011;
                itemDef.name = "Halloween gloves";
                //itemDef.description = "Halloween gloves.";

                itemDef.zoom2d = 804;
                itemDef.xan2d = 320;
                itemDef.yan2d = 2043;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 13;

                itemDef.maleModel0 = 60012;
                itemDef.femaleModel0 = 60012;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33063:
                itemDef.setDefaults();
                itemDef.id = 33063;
                itemDef.inventoryModel = 60013;
                itemDef.name = "Halloween head";
                //itemDef.description = "Halloween head.";

                itemDef.zoom2d = 843;
                itemDef.xan2d = 9;
                itemDef.yan2d = 1852;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -3;
                itemDef.yOffset2d = -2;

                itemDef.maleModel0 = 60014;
                itemDef.femaleModel0 = 60014;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33064:
                itemDef.setDefaults();
                itemDef.id = 33064;
                itemDef.inventoryModel = 60015;
                itemDef.name = "Halloween legs";
                //itemDef.description = "Halloween legs.";

                itemDef.zoom2d = 1835;
                itemDef.xan2d = 478;
                itemDef.yan2d = 2026;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -3;
                itemDef.yOffset2d = -2;

                itemDef.maleModel0 = 60016;
                itemDef.femaleModel0 = 60016;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33065:
                itemDef.setDefaults();
                itemDef.id = 33065;
                itemDef.inventoryModel = 60001;
                itemDef.name = "Beaver";
                //itemDef.description = "Beaver";

                itemDef.zoom2d = 3000;
                itemDef.xan2d = 150;
                itemDef.yan2d = 26;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 5;
                itemDef.yOffset2d = -9;

                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33066:
                itemDef.setDefaults();
                itemDef.id = 33066;
                itemDef.inventoryModel = 47003;
                itemDef.name = "Rock";
                //itemDef.description = "Rock";

                itemDef.zoom2d = 4500;
                itemDef.xan2d = 41;
                itemDef.yan2d = 36;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -4;
                itemDef.yOffset2d = 0;

                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33067:
                itemDef.setDefaults();
                itemDef.id = 33067;
                itemDef.inventoryModel = 47004;
                itemDef.name = "Mystery Box";
                //itemDef.description = "Mystery Box";

                itemDef.zoom2d = 3000;
                itemDef.xan2d = 9;
                itemDef.yan2d = 26;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -3;
                itemDef.yOffset2d = 26;

                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33068:
                itemDef.setDefaults();
                itemDef.id = 33068;
                itemDef.inventoryModel = 60002;
                itemDef.name = "Fish";
                //itemDef.description = "Fish";

                itemDef.zoom2d = 3000;
                itemDef.xan2d = 26;
                itemDef.yan2d = 1748;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -10;
                itemDef.yOffset2d = 13;

                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33069:
                itemDef.setDefaults();
                itemDef.id = 33069;
                itemDef.inventoryModel = 60003;
                itemDef.name = "Magic";
                //itemDef.description = "Magic";

                itemDef.zoom2d = 2687;
                itemDef.xan2d = 26;
                itemDef.yan2d = 1748;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -10;
                itemDef.yOffset2d = 13;

                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33070:
                itemDef.setDefaults();
                itemDef.id = 33070;
                itemDef.inventoryModel = 47008;
                itemDef.name = "Skeleton";
                //itemDef.description = "Skeleton";

                itemDef.zoom2d = 3500;
                itemDef.xan2d = 165;
                itemDef.yan2d = 1800;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -26;
                itemDef.yOffset2d = -43;

                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33071:
                itemDef.setDefaults();
                itemDef.id = 33071;
                itemDef.inventoryModel = 60004;
                itemDef.name = "head";
                //itemDef.description = "head";

                itemDef.zoom2d = 1765;
                itemDef.xan2d = 148;
                itemDef.yan2d = 2026;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -2;
                itemDef.yOffset2d = 78;

                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;

            /* Fragment's */
            case 33072:
                itemDef.setDefaults();
                itemDef.name = "The Fusionist";
                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to save Materials/Platinum when fusing items.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("alchemaniac.png");
                itemDef.custom = true;
                break;
            case 33073:
                itemDef.setDefaults();
                itemDef.name = "Dwarf Overload";
                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to automatically reload your cannon on kill.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Arcane_Conduit.png");
                itemDef.custom = true;
                break;
            case 33074:
                itemDef.setDefaults();
                itemDef.name = "PK Master";
                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Double PK Points.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Armadylean_Decree.png");
                itemDef.custom = true;
                break;
            case 33075:
                itemDef.setDefaults();
                itemDef.name = "Wildy Slayer";
                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Earn double slayer points while skulled in wilderness.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Bandosian_Might.png");
                itemDef.custom = true;
                break;
            case 33076:
                itemDef.setDefaults();
                itemDef.name = "Sneaky Sneaky";
                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double pickpocket loot when stealing from master farmer.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Barbarian_Pest_Wars.png");
                itemDef.custom = true;
                break;
            case 33077:
                itemDef.setDefaults();
                itemDef.name = "Iron Giant";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to smelt an extra bar when smelting bar's.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Bottomless_Quiver.png");
                itemDef.custom = true;
                break;
            case 33078:
                itemDef.setDefaults();
                itemDef.name = "Slayer Override";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Earn 100% more slayer point's upon completing a slayer task.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Catch_Of_The_Day.png");
                itemDef.custom = true;
                break;
            case 33079:
                itemDef.setDefaults();
                itemDef.name = "Runecrafter";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "you will no longer receive rune's lower than or equal to level 20.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Certified_Farmer.png");
                itemDef.custom = true;
                break;
            case 33080:
                itemDef.setDefaults();
                itemDef.name = "Pro Fletcher";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Fletching logs & Stringing bows grant 50% more fletching exp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Chef's_Catch.png");
                itemDef.custom = true;
                break;
            case 33081:
                itemDef.setDefaults();
                itemDef.name = "Chisel Master";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to make 50% more bolt tips per gem, arrow  tips, dart tips.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Chinchonkers.png");
                itemDef.custom = true;
                break;
            case 33082:
                itemDef.setDefaults();
                itemDef.name = "Ava's Accomplice";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to save ammo when using ranged weapon.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Clued_In.png");
                itemDef.custom = true;
                break;
            case 33083:
                itemDef.setDefaults();
                itemDef.name = "Deeper Pockets";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to send drops to your bank.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Deeper_Pockets.png");
                itemDef.custom = true;
                break;
            case 33084:
                itemDef.setDefaults();
                itemDef.name = "Recharger";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "charges have a 60% chance to be saved.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Dine_&_Dash.png");
                itemDef.custom = true;
                break;
            case 33085:
                itemDef.setDefaults();
                itemDef.name = "Magic Paper CHANCED";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "chance to note drops.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Divine_Restoration.png");
                itemDef.custom = true;
                break;
            case 33086:
                itemDef.setDefaults();
                itemDef.name = "Dragon Bait";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "50% increase hunter catch rate.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Dragon_On_A_Bit.png");
                itemDef.custom = true;
                break;
            case 33087:
                itemDef.setDefaults();
                itemDef.name = "Skilled Thief";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double thieving xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Enchanted_Jeweler.png");
                itemDef.custom = true;
                break;
            case 33088:
                itemDef.setDefaults();
                itemDef.name = "Crafting Guru";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double crafting xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Golden_Brick_Road.png");
                itemDef.custom = true;
                break;
            case 33089:
                itemDef.setDefaults();
                itemDef.name = "Hot Hands";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double cooking xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Grave_Robber.png");
                itemDef.custom = true;
                break;
            case 33090:
                itemDef.setDefaults();
                itemDef.name = "Magic Master";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to save rune's when casting spells.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Homewrecker.png");
                itemDef.custom = true;
                break;
            case 33091:
                itemDef.setDefaults();
                itemDef.name = "Yin Yang";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "25% slower prayer drain.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Hot_On_The_Trail.png");
                itemDef.custom = true;
                break;
            case 33092:
                itemDef.setDefaults();
                itemDef.name = "Nomad Master";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double Nomad Points when burning.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Imcando's_Apprentice.png");
                itemDef.custom = true;
                break;
            case 33093:
                itemDef.setDefaults();
                itemDef.name = "Demon Slayer";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double demon hunter xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Just_Druid!.png");
                itemDef.custom = true;
                break;
            case 33094:
                itemDef.setDefaults();
                itemDef.name = "Slayer Master";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double slayer xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Larger_Recharger.png");
                itemDef.custom = true;
                break;
            case 33095:
                itemDef.setDefaults();
                itemDef.name = "Pyromaniac";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double firemaking xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Livin'_On_A_Prayer.png");
                itemDef.custom = true;
                break;
            case 33096:
                itemDef.setDefaults();
                itemDef.name = "Skilled Hunter";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double hunter xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Message_In_A_Bottle.png");
                itemDef.custom = true;
                break;
            case 33097:
                itemDef.setDefaults();
                itemDef.name = "Molten Miner";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double mining xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Mixologist.png");
                itemDef.custom = true;
                break;
            case 33098:
                itemDef.setDefaults();
                itemDef.name = "Woodchipper";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double woodcutting xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Molten_Miner.png");
                itemDef.custom = true;
                break;
            case 33099:
                itemDef.setDefaults();
                itemDef.name = "Bare Hands";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double fishing xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Mother's_Magic_Fossils.png");
                itemDef.custom = true;
                break;
            case 33100:
                itemDef.setDefaults();
                itemDef.name = "Bare Hands x3";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to triple your fish when fishing.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Plank_Stretcher.png");
                itemDef.custom = true;
                break;
            case 33101:
                itemDef.setDefaults();
                itemDef.name = "Praying Respects";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double prayer xp.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Praying_Respects.png");
                itemDef.custom = true;
                break;
            case 33102:
                itemDef.setDefaults();
                itemDef.name = "Novice Zerk";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Gain 5% Melee Damage Bonus.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Pro_Tips.png");
                itemDef.custom = true;
                break;
            case 33103:
                itemDef.setDefaults();
                itemDef.name = "Novice Magician";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Gain 5% Magic Damage Bonus.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Profletchional.png");
                itemDef.custom = true;
                break;
            case 33104:
                itemDef.setDefaults();
                itemDef.name = "Novice Ranger";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Gain 5% Range Damage Bonus.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Rock_Solid.png");
                itemDef.custom = true;
                break;
            case 33105:
                itemDef.setDefaults();
                itemDef.name = "Pro Zerk";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Gain 10% Melee Damage Bonus.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Rogues'_Chompy_Farm.png");
                itemDef.custom = true;
                break;
            case 33106:
                itemDef.setDefaults();
                itemDef.name = "Pro Magician";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Gain 10% Magic Damage.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Rooty_Tooty_2x_Runeys.png");
                itemDef.custom = true;
                break;
            case 33107:
                itemDef.setDefaults();
                itemDef.name = "Pro Ranger";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Gain 10% Range Damage Bonus.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Rumple-Bow-String.png");
                itemDef.custom = true;
                break;
            case 33108:
                itemDef.setDefaults();
                itemDef.name = "Swedish Swindle";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "10% Bonus Drop Rate.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Rune_Escape.png");
                itemDef.custom = true;
                break;
            case 33109:
                itemDef.setDefaults();
                itemDef.name = "Raiders Luck";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "10% Chance to get an extra key from COX.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Saradominist_Defence.png");
                itemDef.custom = true;
                break;
            case 33110:
                itemDef.setDefaults();
                itemDef.name = "Clepto Maniac";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Collect all drop's.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Seedy_Business.png");
                itemDef.custom = true;
                break;
            case 33111:
                itemDef.setDefaults();
                itemDef.name = "Magic Paper";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Note all drop's.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Slash_&_Burn.png");
                itemDef.custom = true;
                break;
            case 33112:
                itemDef.setDefaults();
                itemDef.name = "Pot Of Gold";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "20% Increased Drop Rate.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Slay_All_Day.png");
                itemDef.custom = true;
                break;
            case 33113:
                itemDef.setDefaults();
                itemDef.name = "Mystery Madness";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double reward's from any mystery box.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Slay_'n'_Pay.png");
                itemDef.custom = true;
                break;
            case 33114:
                itemDef.setDefaults();
                itemDef.name = "Casket Master";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance of an extra clue casket upon openin.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Smithing_Double.png");
                itemDef.custom = true;
                break;
            case 33115:
                itemDef.setDefaults();
                itemDef.name = "Voting King";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "2 extra vote point's per vote.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Smooth_Criminal.png");
                itemDef.custom = true;
                break;
            case 33116:
                itemDef.setDefaults();
                itemDef.name = "Pet Locator";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Extra Chance to find a pet.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Special_Discount.png");
                itemDef.custom = true;
                break;
            case 33117:
                itemDef.setDefaults();
                itemDef.name = "Monk Heals";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to double health when using healer icon.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Superior_Tracking.png");
                itemDef.custom = true;
                break;
            case 33118:
                itemDef.setDefaults();
                itemDef.name = "Dragon Fire";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Permanent Anti-fire potion effect.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Tactical_Duelist.png");
                itemDef.custom = true;
                break;
            case 33119:
                itemDef.setDefaults();
                itemDef.name = "Overload Protection";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Overload's no longer deal damage.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Thrall_Damage.png");
                itemDef.custom = true;
                break;
            case 33120:
                itemDef.setDefaults();
                itemDef.name = "Lucky Coin";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Chance to save 20% when donating to the well.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Unholy_Ranger.png");
                itemDef.custom = true;
                break;
            case 33121:
                itemDef.setDefaults();
                itemDef.name = "Cannon Extender";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "100 extra cannon ball's can be held in your cannon.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Unholy_Warrior.png");
                itemDef.custom = true;
                break;
            case 33122:
                itemDef.setDefaults();
                itemDef.name = "Pure Skills";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "2x Skilling xp to all skills.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Unholy_Wizard.png");
                itemDef.custom = true;
                break;
            case 33123:
                itemDef.setDefaults();
                itemDef.name = "Pc Pro";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "3x Pest control points.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Venomaster.png");
                itemDef.custom = true;
                break;
            case 33124:
                itemDef.setDefaults();
                itemDef.name = "Slayer Guru";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "Double slayer task size.";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Zamorakian_Sight.png");
                itemDef.custom = true;
                break;

            /*skilling crystals*/
            case 33125:
                itemDef.setDefaults();
                itemDef.name = "Skilling Crystal (easy)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from skilling, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("skilling_easy.png");
                itemDef.custom = true;
                break;
            case 33126:
                itemDef.setDefaults();
                itemDef.name = "Skilling Crystal (medium)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from skilling, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("skilling_medium.png");
                itemDef.custom = true;
                break;
            case 33127:
                itemDef.setDefaults();
                itemDef.name = "Skilling Crystal (hard)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from skilling, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("skilling_hard.png");
                itemDef.custom = true;
                break;
            case 33128:
                itemDef.setDefaults();
                itemDef.name = "Skilling Crystal (elite)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from skilling, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("skilling_elite.png");
                itemDef.custom = true;
                break;



            /*PVM crystals*/
            case 33129:
                itemDef.setDefaults();
                itemDef.name = "PVM Crystal (easy)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from PVM, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("pvm_easy.png");
                itemDef.custom = true;
                break;
            case 33130:
                itemDef.setDefaults();
                itemDef.name = "PVM Crystal (medium)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from PVM, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("pvm_medium.png");
                itemDef.custom = true;
                break;
            case 33131:
                itemDef.setDefaults();
                itemDef.name = "PVM Crystal (hard)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from PVM, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("pvm_hard.png");
                itemDef.custom = true;
                break;
            case 33132:
                itemDef.setDefaults();
                itemDef.name = "PVM Crystal (elite)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from PVM, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("pvm_elite.png");
                itemDef.custom = true;
                break;


            /*Misc crystals*/
            case 33133:
                itemDef.setDefaults();
                itemDef.name = "Misc Crystal (easy)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from Various Activities, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("misc_easy.png");
                itemDef.custom = true;
                break;
            case 33134:
                itemDef.setDefaults();
                itemDef.name = "Misc Crystal (medium)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from Various Activities, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("misc_medium.png");
                itemDef.custom = true;
                break;
            case 33135:
                itemDef.setDefaults();
                itemDef.name = "Misc Crystal (hard)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from Various Activities, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("misc_hard.png");
                itemDef.custom = true;
                break;
            case 33136:
                itemDef.setDefaults();
                itemDef.name = "Misc Crystal (elite)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from Various Activities, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("misc_elite.png");
                itemDef.custom = true;
                break;
            /*Foundry crystals*/
            case 33137:
                itemDef.setDefaults();
                itemDef.name = "Foundry Crystal (easy)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from Foundry Points, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("foundry_easy.png");
                itemDef.custom = true;
                break;
            case 33138:
                itemDef.setDefaults();
                itemDef.name = "Foundry Crystal (medium)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from Foundry Points, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("foundry_medium.png");
                itemDef.custom = true;
                break;
            case 33139:
                itemDef.setDefaults();
                itemDef.name = "Foundry Crystal (hard)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from Foundry Points, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("foundry_hard.png");
                itemDef.custom = true;
                break;
            case 33140:
                itemDef.setDefaults();
                itemDef.name = "Foundry Crystal (elite)";

                itemDef.inventoryModel = ItemDefinition.lookup(26546).inventoryModel;
                //itemDef.description = "A Crystal gained from Foundry Points, used with the fusion system.";
                itemDef.interfaceOptions = new String[] { "Use", null, null, null, "Destroy" };
                itemDef.stacks = 1;
                itemDef.createCustomSprite("foundry_elite.png");
                itemDef.custom = true;
                break;

            /* Fragment's */

            case 33141:
                itemDef.setDefaults();
                itemDef.id = 33141;
                itemDef.inventoryModel = 46806;
                itemDef.name = "Virtus Mask";
                //itemDef.description = "An ancient mage's mask.";
                itemDef.zoom2d = 880;
                itemDef.xan2d = 2009;
                itemDef.yan2d = 2026;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 1;
                itemDef.yOffset2d = 1;
                itemDef.maleModel0 = 46809;
                itemDef.femaleModel0 = 46804;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;
            case 33142:
                itemDef.setDefaults();
                itemDef.id = 33142;
                itemDef.inventoryModel = 46802;
                itemDef.name = "Virtus robe top";
                //itemDef.description = "An ancient mage's robe top.";

                itemDef.zoom2d = 1180;
                itemDef.xan2d = 530;
                itemDef.yan2d = 2026;
                itemDef.zan2d = 9;
                itemDef.xOffset2d = 1;
                itemDef.yOffset2d = 5;

                itemDef.femaleModel0 = 46803;
                itemDef.maleModel0 = 46808;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;

            case 33143:
                itemDef.setDefaults();
                itemDef.id = 33143;
                itemDef.inventoryModel = 46807;
                itemDef.name = "Virtus robe legs";
                //itemDef.description = "An ancient mage's robe legs.";

                itemDef.zoom2d = 1580;
                itemDef.xan2d = 320;
                itemDef.yan2d = 2043;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -2;
                itemDef.yOffset2d = -8;

                itemDef.maleModel0 = 46810;
                itemDef.femaleModel0 = 46805;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;

            case 33144:
                itemDef.setDefaults();
                itemDef.id = 33144;
                itemDef.inventoryModel = 46813;
                itemDef.name = "Pernix cowl";
                //itemDef.description = "An ancient ranger's cowl.";

                itemDef.zoom2d = 1070;
                itemDef.xan2d = 304;
                itemDef.yan2d = 43;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -200;

                itemDef.maleModel0 = 46817;
                itemDef.femaleModel0 = 46813;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;

            case 33145:
                itemDef.setDefaults();
                itemDef.id = 33145;
                itemDef.inventoryModel = 46811;
                itemDef.name = "Pernix body";
                //itemDef.description = "An ancient ranger's body armour.";

                itemDef.zoom2d = 1380;
                itemDef.xan2d = 565;
                itemDef.yan2d = 26;
                itemDef.zan2d = 9;
                itemDef.xOffset2d = -3;
                itemDef.yOffset2d = 1;

                itemDef.maleModel0 = 46816;
                itemDef.femaleModel0 = 46812;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;

            case 33146:
                itemDef.setDefaults();
                itemDef.id = 33146;
                itemDef.inventoryModel = 46815;
                itemDef.name = "Pernix chaps";
                //itemDef.description = "An ancient ranger's chaps.";

                itemDef.zoom2d = 1680;
                itemDef.xan2d = 530;
                itemDef.yan2d = 9;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -2;
                itemDef.yOffset2d = 1;

                itemDef.maleModel0 = 46818;
                itemDef.femaleModel0 = 46814;
                //itemDef.groundActions = new String[5];
                //itemDef.groundActions[2] = "Take";
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[4] = "Drop";
                itemDef.custom = true;
                break;


            case 33147:
                itemDef.setDefaults();
                itemDef.id = 33147;
                itemDef.inventoryModel = 46826;
                itemDef.name = "Korai's sword";
                //itemDef.description = "The sword of a Void Knight.";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1598;
                itemDef.xan2d = 322;
                itemDef.yan2d = 1504;
                itemDef.zan2d = 9;
                itemDef.xOffset2d = 7;
                itemDef.yOffset2d = 7;
                itemDef.femaleModel0 = 46819;
                itemDef.maleModel0 = 46820;
                itemDef.custom = true;
                break;

            case 33148:
                itemDef.setDefaults();
                itemDef.id = 33148;
                itemDef.inventoryModel = 46821;
                itemDef.name = "Noxious scythe";
                //itemDef.description = "A lethal scythe, made from spider parts.";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 2680;
                itemDef.xan2d = 320;
                itemDef.yan2d = 1591;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 12;
                itemDef.yOffset2d = 50;
                itemDef.maleModel0 = 46822;
                itemDef.femaleModel0 = 46822;
                itemDef.custom = true;
                break;

            case 21129:
                itemDef.name = "Rng of wealth(i5)";
                itemDef.custom = true;
                break;

            case 33149:
                itemDef.setDefaults();
                itemDef.id = 33149;
                itemDef.inventoryModel = 46823;
                itemDef.name = "Noxious staff";
                //itemDef.description = "A lethal staff, made from spider parts.";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 2780;
                itemDef.xan2d = 320;
                itemDef.yan2d = 1678;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -4;
                itemDef.yOffset2d = 12;
                itemDef.maleModel0 = 46824;
                itemDef.femaleModel0 = 46824;
                itemDef.custom = true;
                break;

            case 3128:
                itemDef.id = 3128;
                itemDef.inventoryModel = ItemDefinition.lookup(1044).inventoryModel;
                itemDef.name = "Durial's Green Party Hat";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.originalColours = ItemDefinition.lookup(1044).originalColours;
                itemDef.modifiedColours = ItemDefinition.lookup(1044).modifiedColours;
                itemDef.zoom2d = ItemDefinition.lookup(1044).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(1044).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(1044).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(1044).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(1044).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(1044).yOffset2d;
                itemDef.maleModel0 = ItemDefinition.lookup(1044).maleModel0;
                itemDef.femaleModel0 = ItemDefinition.lookup(1044).femaleModel0;
                itemDef.custom = true;
                break;

            case 33238:
                itemDef.id = 33238;
                itemDef.inventoryModel = (60040);
                itemDef.name = "Sponges Hat";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(1044).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(1044).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(1044).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(1044).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(1044).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(1044).yOffset2d;
                itemDef.maleModel0 = (60041);
                itemDef.femaleModel0 = (60042);
                itemDef.custom = true;
                break;

            case 33239:
                itemDef.id = 33239;
                itemDef.inventoryModel = (60043);
                itemDef.name = "Golden Nut";
                itemDef.interfaceOptions = new String[] { null, "Use", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(4012).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(4012).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(4012).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(4012).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(4012).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(4012).yOffset2d;
                itemDef.custom = true;
                break;

            case 33150:
                itemDef.setDefaults();
                itemDef.id = 33150;
                itemDef.inventoryModel = 46752;
                itemDef.name = "Sirenic hauberk";
                //itemDef.description = "Made from sirenic scales and strengthened by algarum thread.";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1417;
                itemDef.xan2d = 478;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 4;
                itemDef.maleModel0 = 46754;
                itemDef.femaleModel0 = 46753;
                itemDef.custom = true;
                break;
            case 33151:
                itemDef.setDefaults();
                itemDef.id = 33151;
                itemDef.inventoryModel = 46755;
                itemDef.name = "Sirenic mask";
                //itemDef.description = "Made from sirenic scales and strengthened by algarum thread.";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 583;
                itemDef.xan2d = 513;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -3;
                itemDef.maleModel0 = 46757;
                itemDef.femaleModel0 = 46756;
                itemDef.custom = true;
                break;
            case 33152:
                itemDef.setDefaults();
                itemDef.id = 33152;
                itemDef.inventoryModel = 46758;
                itemDef.name = "Sirenic chaps";
                //itemDef.description = "Made from sirenic scales and strengthened by algarum thread.";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1800;
                itemDef.xan2d = 530;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 2;
                itemDef.maleModel0 = 46760;
                itemDef.femaleModel0 = 46759;
                itemDef.custom = true;
                break;

            case 33153:
                itemDef.setDefaults();
                itemDef.id = 33153;
                itemDef.inventoryModel = 46765;
                itemDef.name = "Malevolent helm";
                //itemDef.description = "Armour infused with malevolent energy.";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 809;
                itemDef.xan2d = 0;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -3;
                itemDef.maleModel0 = 46768;
                itemDef.femaleModel0 = 46761;
                itemDef.custom = true;
                break;
            case 33154:
                itemDef.setDefaults();
                itemDef.id = 33154;
                itemDef.inventoryModel = 46762;
                itemDef.name = "Malevolent cuirass";
                //itemDef.description = "Armour infused with malevolent energy.";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1678;
                itemDef.xan2d = 513;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 0;
                itemDef.maleModel0 = 46767;
                itemDef.femaleModel0 = 46763;
                itemDef.custom = true;
                break;
            case 33155:
                itemDef.setDefaults();
                itemDef.id = 33155;
                itemDef.inventoryModel = 46766;
                itemDef.name = "Malevolent greaves";
                //itemDef.description = "Armour infused with malevolent energy.";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1800;
                itemDef.xan2d = 530;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -3;
                itemDef.maleModel0 = 46769;
                itemDef.femaleModel0 = 46764;
                itemDef.custom = true;
                break;

            case 33156:
                itemDef.setDefaults();
                itemDef.id = 33156;
                itemDef.inventoryModel = 46770;
                itemDef.name = "Tectonic mask";
                //itemDef.description = "A powerful mask from the depths.";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 809;
                itemDef.xan2d = 0;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -3;
                itemDef.maleModel0 = 46772;
                itemDef.femaleModel0 = 46771;
                itemDef.custom = true;
                break;
            case 33157:
                itemDef.setDefaults();
                itemDef.id = 33157;
                itemDef.inventoryModel = 46773;
                itemDef.name = "Tectonic robe top";
                //itemDef.description = "A powerful robe from the depths.";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1678;
                itemDef.xan2d = 513;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 6;
                itemDef.maleModel0 = 46775;
                itemDef.femaleModel0 = 46774;
                itemDef.custom = true;
                break;
            case 33158:
                itemDef.setDefaults();
                itemDef.id = 33158;
                itemDef.inventoryModel = 46776;
                itemDef.name = "Tectonic robe bottom";
                //itemDef.description = "A powerful robe from the depths.";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1800;
                itemDef.xan2d = 530;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 3;
                itemDef.maleModel0 = 46778;
                itemDef.femaleModel0 = 46777;
                itemDef.custom = true;
                break;
            case 12161:
                itemDef.name = "Christmas Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.custom = true;
                break;
            case 33159:
                itemDef.setDefaults();
                itemDef.id = 33159;
                itemDef.inventoryModel = 46779;
                itemDef.name = "Christmas Imp";
                //itemDef.description = "A Christmas Imp.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.zoom2d = 1452;
                itemDef.xan2d = 0;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -7;
                itemDef.custom = true;
                break;


            case 33160:
                itemDef.setDefaults();
                itemDef.id = 33160;
                itemDef.inventoryModel = 60018;
                itemDef.name = "Candy Cane Twisted Bow";
                //itemDef.description = "A Candy Cane Twisted Bow.";
                itemDef.interfaceOptions = new String[] { null, "Wield", "Check", "Uncharge", "Drop" };
                itemDef.zoom2d = 1980;
                itemDef.xan2d = 461;
                itemDef.yan2d = 320;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -4;
                itemDef.yOffset2d = 12;
                itemDef.maleModel0 = 60019;
                itemDef.femaleModel0 = 60019;
                itemDef.custom = true;
                break;


            case 33161:
                itemDef.setDefaults();
                itemDef.id = 33161;
                itemDef.inventoryModel = 60020;
                itemDef.name = "Candy Cane Scythe";
                //itemDef.description = "A Candy Cane Scythe.";
                itemDef.interfaceOptions = new String[] { null, "Wield", "Check", "Uncharge", "Drop" };
                itemDef.zoom2d = 1780;
                itemDef.xan2d = 304;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 2;
                itemDef.yOffset2d = 6;
                itemDef.maleModel0 = 60021;
                itemDef.femaleModel0 = 60021;
                itemDef.custom = true;
                break;


            case 33162:
                itemDef.setDefaults();
                itemDef.id = 33159;
                itemDef.inventoryModel = 60022;
                itemDef.name = "Candy Cane Whip";
                //itemDef.description = "A Candy Cane Whip.";
                itemDef.interfaceOptions = new String[] { null, "Wield", "Check", "Uncharge", "Drop" };
                itemDef.zoom2d = 980;
                itemDef.xan2d = 320;
                itemDef.yan2d = 436;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 2;
                itemDef.yOffset2d = 12;
                itemDef.maleModel0 = 60023;
                itemDef.femaleModel0 = 60023;
                itemDef.custom = true;
                break;

            /*case 33163:
                itemDef.setDefaults();
                itemDef.id = 33163;
                itemDef.modelId = 49981;
                itemDef.name = "AOE Tier (1) Bow";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 2757;
                itemDef.xan2d = 459;
                itemDef.yan2d = 1000;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 23;
                itemDef.yOffset2d = 17;
                itemDef.maleModel0 = 49980;
                itemDef.femaleModel0 = 49980;
                break;
            case 33164:
                itemDef.setDefaults();
                itemDef.id = 33164;
                itemDef.modelId = 49983;
                itemDef.name = "AOE Tier (2) Bow";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 2757;
                itemDef.xan2d = 459;
                itemDef.yan2d = 1000;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 23;
                itemDef.yOffset2d = 17;
                itemDef.maleModel0 = 49982;
                itemDef.femaleModel0 = 49982;
                break;
            case 33165:
                itemDef.setDefaults();
                itemDef.id = 33165;
                itemDef.modelId = 49985;
                itemDef.name = "AOE Tier (3) Bow";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 2757;
                itemDef.xan2d = 459;
                itemDef.yan2d = 1000;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 23;
                itemDef.yOffset2d = 17;
                itemDef.maleModel0 = 49984;
                itemDef.femaleModel0 = 49984;
                break;
            case 33166:
                itemDef.setDefaults();
                itemDef.id = 33166;
                itemDef.modelId = 49987;
                itemDef.name = "AOE Tier (4) Bow";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 2757;
                itemDef.xan2d = 459;
                itemDef.yan2d = 1000;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 23;
                itemDef.yOffset2d = 17;
                itemDef.maleModel0 = 49986;
                itemDef.femaleModel0 = 49986;
                break;
            case 33167:
                itemDef.setDefaults();
                itemDef.id = 33167;
                itemDef.modelId = 49989;
                itemDef.name = "AOE Tier (5) Bow";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 2757;
                itemDef.xan2d = 459;
                itemDef.yan2d = 1000;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 23;
                itemDef.yOffset2d = 17;
                itemDef.maleModel0 = 49988;
                itemDef.femaleModel0 = 49988;
                break;
            case 33168:
                itemDef.setDefaults();
                itemDef.id = 33168;
                itemDef.modelId = 49991;
                itemDef.name = "AOE God Tier Bow";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 2757;
                itemDef.xan2d = 459;
                itemDef.yan2d = 1000;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 23;
                itemDef.yOffset2d = 17;
                itemDef.maleModel0 = 49990;
                itemDef.femaleModel0 = 49990;
                break;
            case 33169:
                itemDef.setDefaults();
                itemDef.id = 33169;
                itemDef.modelId = 49900;
                itemDef.name = "AOE Tier (1) Staff";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1887;
                itemDef.xan2d = 357;
                itemDef.yan2d = 1504;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -26;
                itemDef.yOffset2d = -61;
                itemDef.maleModel0 = 49901;
                itemDef.femaleModel0 = 49901;
                break;
            case 33170:
                itemDef.setDefaults();
                itemDef.id = 33170;
                itemDef.modelId = 49902;
                itemDef.name = "AOE Tier (2) Staff";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1887;
                itemDef.xan2d = 357;
                itemDef.yan2d = 1504;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -26;
                itemDef.yOffset2d = -61;
                itemDef.maleModel0 = 49903;
                itemDef.femaleModel0 = 49903;
                break;
            case 33171:
                itemDef.setDefaults();
                itemDef.id = 33171;
                itemDef.modelId = 49904;
                itemDef.name = "AOE Tier (3) Staff";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1887;
                itemDef.xan2d = 357;
                itemDef.yan2d = 1504;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -26;
                itemDef.yOffset2d = -61;
                itemDef.maleModel0 = 49905;
                itemDef.femaleModel0 = 49905;
                break;
            case 33172:
                itemDef.setDefaults();
                itemDef.id = 33172;
                itemDef.modelId = 49906;
                itemDef.name = "AOE Tier (4) Staff";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1887;
                itemDef.xan2d = 357;
                itemDef.yan2d = 1504;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -26;
                itemDef.yOffset2d = -61;
                itemDef.maleModel0 = 49907;
                itemDef.femaleModel0 = 49907;
                break;
            case 33174:
                itemDef.setDefaults();
                itemDef.id = 33174;
                itemDef.modelId = 49911;
                itemDef.name = "AOE Tier (5) Staff";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1887;
                itemDef.xan2d = 357;
                itemDef.yan2d = 1504;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -26;
                itemDef.yOffset2d = -61;
                itemDef.maleModel0 = 49910;
                itemDef.femaleModel0 = 49910;
                break;
            case 33173:
                itemDef.setDefaults();
                itemDef.id = 33173;
                itemDef.modelId = 49908;
                itemDef.name = "AOE God Tier Staff";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1887;
                itemDef.xan2d = 357;
                itemDef.yan2d = 1504;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -26;
                itemDef.yOffset2d = -61;
                itemDef.maleModel0 = 49909;
                itemDef.femaleModel0 = 49909;
                break;*/
            case 33175:
                itemDef.setDefaults();
                itemDef.id = 33175;
                itemDef.inventoryModel = 60024;
                itemDef.name = "Axe Of Araphel";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1980;
                itemDef.xan2d = 490;
                itemDef.yan2d = 306;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -15;
                itemDef.yOffset2d = -14;
                itemDef.maleModel0 = 60025;
                itemDef.femaleModel0 = 60025;
                itemDef.custom = true;
                break;
            case 33176:
//				itemDef.setDefaults();
                itemDef.id = 33176;
                itemDef.name = "Discord Booster's Cape";
                itemDef.inventoryModel = 46830;
                itemDef.zoom2d = 2600;
                itemDef.xan2d = 0;
                itemDef.yan2d = 0;
                itemDef.zan2d = 3;
                itemDef.xOffset2d = 4;
                itemDef.yOffset2d = 6;
                itemDef.interfaceOptions = new String[5];
                itemDef.interfaceOptions[1] = "Wear";
                itemDef.interfaceOptions[2] = null;
                itemDef.maleModel0 = 46830;
                itemDef.femaleModel0 = 46830;
                itemDef.custom = true;
                break;
            case 25478:
                itemDef.name = "Bounty Protection Scroll";
                itemDef.custom = true;
                break;
            case 20238:
                itemDef.name = "Tasks System Reset";
                itemDef.custom = true;
                break;
            case 25481:
                itemDef.name = "Collection Log Reset Scroll";
                itemDef.custom = true;
                break;
            case 10533:
                itemDef.name = "Guardian Angel Pet";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 33177:
                itemDef.setDefaults();
                itemDef.id = 33177;
                itemDef.inventoryModel = 49914;
                itemDef.name = "Golden blowpipe";
                itemDef.interfaceOptions = new String[] { null, "Wield", "Check", "Unload", "Uncharge" };
                itemDef.zoom2d = 1480;
                itemDef.xan2d = 374;
                itemDef.yan2d = 235;
                itemDef.zan2d = 130;
                itemDef.xOffset2d = 28;
                itemDef.yOffset2d = -138;
                itemDef.maleModel0 = 49914;
                itemDef.femaleModel0 = 49914;
                itemDef.custom = true;
                break;
            case 33183:
                itemDef.setDefaults();
                itemDef.id = 33183;
                itemDef.inventoryModel = 47054;
                itemDef.name = "Cape of malar";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1780;
                itemDef.xan2d = 320;
                itemDef.yan2d = 843;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 10;
                itemDef.maleModel0 = 47055;
                itemDef.femaleModel0 = 47055;
                itemDef.custom = true;
                break;
            case 33184:
                itemDef.setDefaults();
                itemDef.id = 33184;
                itemDef.inventoryModel = 47056;
                itemDef.name = "Blood Scythe";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 3280;
                itemDef.xan2d = 250;
                itemDef.yan2d = 670;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 29;
                itemDef.yOffset2d = -513;
                itemDef.maleModel0 = 47057;
                itemDef.femaleModel0 = 47057;
                itemDef.custom = true;
                break;
            case 33186:
                itemDef.setDefaults();
                itemDef.id = 33186;
                itemDef.inventoryModel = 47060;
                itemDef.name = "Mask Of Malar";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 680;
                itemDef.xan2d = 0;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -5;
                itemDef.maleModel0 = 47061;
                itemDef.femaleModel0 = 47061;
                itemDef.custom = true;
                break;
            case 33187:
                itemDef.setDefaults();
                itemDef.id = 33187;
                itemDef.inventoryModel = 47062;
                itemDef.name = "Chest Of Malar";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1280;
                itemDef.xan2d = 443;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 5;
                itemDef.maleModel0 = 47063;
                itemDef.femaleModel0 = 47063;
                itemDef.custom = true;
                break;
            case 33188:
                itemDef.setDefaults();
                itemDef.id = 33188;
                itemDef.inventoryModel = 47064;
                itemDef.name = "Bottoms Of Malar";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1680;
                itemDef.xan2d = 583;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -2;
                itemDef.yOffset2d = 3;
                itemDef.maleModel0 = 47065;
                itemDef.femaleModel0 = 47065;
                itemDef.custom = true;
                break;
            case 33189:
                itemDef.setDefaults();
                itemDef.id = 33189;
                itemDef.inventoryModel = 47068;
                itemDef.name = "Dragon Guard Helm";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 980;
                itemDef.xan2d = 217;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 0;
                itemDef.maleModel0 = 47069;
                itemDef.femaleModel0 = 47069;
                itemDef.custom = true;
                break;
            case 33190:
                itemDef.setDefaults();
                itemDef.id = 33190;
                itemDef.inventoryModel = 47070;
                itemDef.name = "Dragon Guard Chest";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1280;
                itemDef.xan2d = 443;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 5;
                itemDef.maleModel0 = 47071;
                itemDef.femaleModel0 = 47071;
                itemDef.custom = true;
                break;
            case 33191:
                itemDef.setDefaults();
                itemDef.id = 33191;
                itemDef.inventoryModel = 47072;
                itemDef.name = "Dragon Guard Bottoms";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1680;
                itemDef.xan2d = 583;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -2;
                itemDef.yOffset2d = 3;
                itemDef.maleModel0 = 47073;
                itemDef.femaleModel0 = 47073;
                itemDef.custom = true;
                break;
            case 33195:
                itemDef.setDefaults();
                itemDef.id = 33195;
                itemDef.inventoryModel = 47081;
                itemDef.name = "Blood Helm";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 980;
                itemDef.xan2d = 217;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 0;
                itemDef.maleModel0 = 47082;
                itemDef.femaleModel0 = 47082;
                itemDef.custom = true;
                break;
            case 33196:
                itemDef.setDefaults();
                itemDef.id = 33196;
                itemDef.inventoryModel = 47083;
                itemDef.name = "Blood Chest";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1280;
                itemDef.xan2d = 443;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 5;
                itemDef.maleModel0 = 47084;
                itemDef.femaleModel0 = 47084;
                itemDef.custom = true;
                break;
            case 33197:
                itemDef.setDefaults();
                itemDef.id = 33197;
                itemDef.inventoryModel = 47085;
                itemDef.name = "Blood Bottoms";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1680;
                itemDef.xan2d = 583;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -2;
                itemDef.yOffset2d = 3;
                itemDef.maleModel0 = 47086;
                itemDef.femaleModel0 = 47086;
                itemDef.custom = true;
                break;
            case 33198:
                itemDef.setDefaults();
                itemDef.id = 33198;
                itemDef.inventoryModel = 47087;
                itemDef.name = "Reaper Cape";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1780;
                itemDef.xan2d = 548;
                itemDef.yan2d = 791;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 4;
                itemDef.yOffset2d = -2;
                itemDef.maleModel0 = 47088;
                itemDef.femaleModel0 = 47088;
                itemDef.custom = true;
                break;
            case 33199:
                itemDef.setDefaults();
                itemDef.id = 33199;
                itemDef.inventoryModel = 47089;
                itemDef.name = "Reaper Helm";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 680;
                itemDef.xan2d = 0;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = -8;
                itemDef.maleModel0 = 47090;
                itemDef.femaleModel0 = 47090;
                itemDef.custom = true;
                break;
            case 33200:
                itemDef.setDefaults();
                itemDef.id = 33200;
                itemDef.inventoryModel = 47091;
                itemDef.name = "Reaper Chest";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1380;
                itemDef.xan2d = 478;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 0;
                itemDef.maleModel0 = 47092;
                itemDef.femaleModel0 = 47092;
                itemDef.custom = true;
                break;
            case 33201:
                itemDef.setDefaults();
                itemDef.id = 33201;
                itemDef.inventoryModel = 47093;
                itemDef.name = "Reaper Bottoms";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = 1980;
                itemDef.xan2d = 320;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 18;
                itemDef.maleModel0 = 47094;
                itemDef.femaleModel0 = 47094;
                itemDef.custom = true;
                break;
            case 33202:
                itemDef.setDefaults();
                itemDef.id = 33202;
                itemDef.inventoryModel = 47095;
                itemDef.name = "Demon X Sword";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 2080;
                itemDef.xan2d = 496;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 0;
                itemDef.maleModel0 = 47096;
                itemDef.femaleModel0 = 47096;
                itemDef.custom = true;
                break;
            case 33203:
                itemDef.setDefaults();
                itemDef.id = 33203;
                itemDef.inventoryModel = 47097;
                itemDef.name = "Demon X Scythe";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1580;
                itemDef.xan2d = 320;
                itemDef.yan2d = 1104;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -7;
                itemDef.yOffset2d = -5;
                itemDef.maleModel0 = 47221;
                itemDef.femaleModel0 = 47221;
                itemDef.custom = true;
                break;
            case 33204:
                itemDef.setDefaults();
                itemDef.id = 33204;
                itemDef.inventoryModel = 47099;
                itemDef.name = "Demon X Spear";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1580;
                itemDef.xan2d = 320;
                itemDef.yan2d = 1052;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -4;
                itemDef.yOffset2d = 12;
                itemDef.maleModel0 = 47100;
                itemDef.femaleModel0 = 47100;
                itemDef.custom = true;
                break;
            case 33205:
                itemDef.setDefaults();
                itemDef.id = 33205;
                itemDef.inventoryModel = 47101;
                itemDef.name = "Demon X Staff";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1280;
                itemDef.xan2d = 320;
                itemDef.yan2d = 1104;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 0;
                itemDef.maleModel0 = 47102;
                itemDef.femaleModel0 = 47102;
                itemDef.custom = true;
                break;
            case 33206:
                itemDef.setDefaults();
                itemDef.id = 33206;
                itemDef.inventoryModel = 47103;
                itemDef.name = "Ascension Crossbow";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 880;
                itemDef.xan2d = 344;
                itemDef.yan2d = 1278;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 1;
                itemDef.yOffset2d = 4;
                itemDef.maleModel0 = 47104;
                itemDef.femaleModel0 = 47104;
                itemDef.custom = true;
                break;
            case 33207:
                itemDef.setDefaults();
                itemDef.id = 33207;
                itemDef.inventoryModel = 47108;
                itemDef.name = "Demon X Bow";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1780;
                itemDef.xan2d = 530;
                itemDef.yan2d = 1591;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 15;
                itemDef.yOffset2d = -8;
                itemDef.maleModel0 = 47109;
                itemDef.femaleModel0 = 47109;
                itemDef.custom = true;
                break;
            case 33208:
                itemDef.setDefaults();
                itemDef.name = "@gre@Lil' Groot";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("Groot.png");
                itemDef.custom = true;
                break;
            case 33209:
                itemDef.setDefaults();
                itemDef.name = "@gre@Xmas Box";
                itemDef.interfaceOptions = new String[] { "Open", null, null, "Quick-Open", "Drop" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("xmas_box.png");
                itemDef.custom = true;
                break;
            case 33210:
                itemDef.setDefaults();
                itemDef.name = "lil' Gingie";
                //itemDef.description = "The most powerful pet, see ::foepets for full list of perks.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.inventoryModel = 60034;
                itemDef.zoom2d = 1780;
                itemDef.xan2d = 240;
                itemDef.yan2d = 26;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -1;
                itemDef.yOffset2d = 17;
                itemDef.custom = true;
                break;
            case 33211:
                itemDef.setDefaults();
                itemDef.name = "lil' Elf";
                //itemDef.description = "The most powerful pet, see ::foepets for full list of perks.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.inventoryModel = 60033;
                itemDef.zoom2d = 1780;
                itemDef.xan2d = 287;
                itemDef.yan2d = 217;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 5;
                itemDef.yOffset2d = 43;
                itemDef.custom = true;
                break;
            case 33212:
                itemDef.setDefaults();
                itemDef.name = "lil' Evil Snowman";
                //itemDef.description = "The most powerful pet, see ::foepets for full list of perks.";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.inventoryModel = 46750;
                itemDef.zoom2d = 2980;
                itemDef.xan2d = 165;
                itemDef.yan2d = 0;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 0;
                itemDef.yOffset2d = 149;
                itemDef.custom = true;
                break;
            case 33213:
                itemDef.setDefaults();
                itemDef.name = "Christmas Pudding";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("pudding.png");
                itemDef.custom = true;
                break;
            case 33214:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5309.png");
                itemDef.custom = true;
                break;
            case 33215:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5310.png");
                itemDef.custom = true;
                break;
            case 33216:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5311.png");
                itemDef.custom = true;
                break;
            case 33217:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5312.png");
                itemDef.custom = true;
                break;
            case 33218:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5313.png");
                itemDef.custom = true;
                break;
            case 33219:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5314.png");
                itemDef.custom = true;
                break;
            case 33220:
                itemDef.setDefaults();
                itemDef.name = "Faster melee";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5315.png");
                itemDef.custom = true;
                break;
            case 33221:
                itemDef.setDefaults();
                itemDef.name = "Faster Range";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5316.png");
                itemDef.custom = true;
                break;
            case 33222:
                itemDef.setDefaults();
                itemDef.name = "Faster Magic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5317.png");
                itemDef.custom = true;
                break;
            case 33223:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5318.png");
                itemDef.custom = true;
                break;
            case 33224:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5319.png");
                itemDef.custom = true;
                break;
            case 33225:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5320.png");
                itemDef.custom = true;
                break;
            case 33226:
                itemDef.setDefaults();
                itemDef.name = "3x Xp Bonus";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5321.png");
                itemDef.custom = true;
                break;
            case 33227:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5322.png");
                itemDef.custom = true;
                break;
            case 33228:
                itemDef.setDefaults();
                itemDef.name = "Simplified Farming";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5323.png");
                itemDef.custom = true;
                break;
            case 33229:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5324.png");
                itemDef.custom = true;
                break;
            case 33230:
                itemDef.setDefaults();
                itemDef.name = "Maximum Damage";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5325.png");
                itemDef.custom = true;
                break;
            case 33231:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5326.png");
                itemDef.custom = true;
                break;
            case 33232:
                itemDef.setDefaults();
                itemDef.name = "Meteor";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5327.png");
                itemDef.custom = true;
                break;
            case 33233:
                itemDef.setDefaults();
                itemDef.name = "AOE Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5328.png");
                itemDef.custom = true;
                break;
            case 33234:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" } ;
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5329.png");
                itemDef.custom = true;
                break;
            case 33235:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5330.png");
                itemDef.custom = true;
                break;
            case 33236:
                itemDef.setDefaults();
                itemDef.name = "Relic";
                itemDef.interfaceOptions = new String[] { "Attune", null, null, null, "Destroy" };
                itemDef.stacks = 0;
                itemDef.createCustomSprite("5335.png");
                itemDef.custom = true;
                break;
            case 5020:
//                itemDef.setDefaults();
                itemDef.name = "Durial Ticket";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Destroy" };
                itemDef.custom = true;
                break;
            case 11740:
//                itemDef.setDefaults();
                itemDef.name = "Elon Musk Island Scroll";
                itemDef.interfaceOptions = new String[] { "Consume", null, null, null, "Destroy" };
                itemDef.custom = true;
                break;
            case 26269:
                itemDef.setDefaults();
                itemDef.id = 26269;
                itemDef.inventoryModel = 49477;
                itemDef.name = "Demon X Crossbow";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                itemDef.zoom2d = 1280;
                itemDef.xan2d = 322;
                itemDef.yan2d = 200;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = 6;
                itemDef.yOffset2d = 48;
                itemDef.maleModel0 = 60033;//49478
                itemDef.femaleModel0 = 60033;
                itemDef.custom = true;
                break;
            case 23859:
                itemDef.name = "Bloodbark Cape";
                itemDef.custom = true;
                break;
            case 22993:
                itemDef.name = "Seed pack";
                itemDef.interfaceOptions = new String[] { "Open", null, "Open-All", null, "Drop" };
                itemDef.custom = true;
                //itemDef.description = "I can see some seeds in here.";
                break;
            case 11738:
                itemDef.name = "Herb box";
                itemDef.interfaceOptions = new String[] { "Open", null, "Open-All", null, "Drop" };
                itemDef.inventoryModel =  60038;
                itemDef.custom = true;
                //itemDef.description = "I can see some herbs in here.";
                break;
            case 26858:
                itemDef.name = "AFK Robes";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 26860:
                itemDef.name = "AFK Robes";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 26862:
                itemDef.name = "AFK Robes";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.custom = true;
                break;
            case 26914:
                itemDef.name = "Collectors Amulet";
                itemDef.custom = true;
                break;
            case 28274:
                itemDef.name = "Smoked gem";
                itemDef.custom = true;
                break;
            case 28669:
                itemDef.name = "Pheasant";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 10998:
                itemDef.name = "13th Pet Goblin";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 24864:
                itemDef.name = "Maniacal Monkey";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 24863:
                itemDef.name = "Zombie Monkey";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;

            case 19903:
                //skele set
                itemDef.name = "Skele set";
                itemDef.custom = true;
                break;
            case 19911:
                //clown set
                itemDef.name = "Clown set";
                itemDef.custom = true;
                break;
            case 20280:
                //ornate set
                itemDef.name = "Ornate set";
                itemDef.custom = true;
                break;
            case 20281:
                //ankou set
                itemDef.name = "Ankou set";
                itemDef.custom = true;
                break;
            case 20282:
                //evil chicken set
                itemDef.name = "Evil Chicken set";
                itemDef.custom = true;
                break;
            case 24405:
                itemDef.name = "Twisted hat";
                itemDef.custom = true;
                break;
            case 24407:
                itemDef.name = "Twisted coat";
                itemDef.custom = true;
                break;
            case 24409:
                itemDef.name = "Twisted trousers";
                itemDef.custom = true;
                break;
            case 24411:
                itemDef.name = "Twisted boots";
                itemDef.custom = true;
                break;
            case 11279:
                itemDef.name = "Baby Green Dragon";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 33241:
                itemDef.name = "Baby Blue Dragon";
                itemDef.inventoryModel = 60045;
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(11279).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(11279).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(11279).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(11279).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(11279).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(11279).yOffset2d;
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 33240:
                itemDef.name = "Baby Red Dragon";
                itemDef.inventoryModel = 60044;
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(11279).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(11279).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(11279).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(11279).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(11279).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(11279).yOffset2d;
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 33242:
                itemDef.custom = true;
                itemDef.name = "Baby Black Dragon";
                itemDef.inventoryModel = 60046;
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(11279).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(11279).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(11279).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(11279).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(11279).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(11279).yOffset2d;
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 33243:
                itemDef.setDefaults();
                itemDef.name = "@red@Realm Nyx";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.inventoryModel = 60047;
                itemDef.zoom2d = 4280;
                itemDef.xan2d = 270;
                itemDef.yan2d = 322;
                itemDef.zan2d = 0;
                itemDef.xOffset2d = -1;
                itemDef.yOffset2d = 83;
                itemDef.custom = true;
                break;
            case 25959:
                itemDef.custom = true;
                itemDef.name = "Infernal Crystal";
                itemDef.interfaceOptions = new String[] { null, null, null, null, "Drop" };
                break;
            case 23680:
                itemDef.custom = true;
                itemDef.name = "Crystal Pickaxe";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 23673:
                itemDef.custom = true;
                itemDef.name = "Crystal Axe";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 23762:
                itemDef.custom = true;
                itemDef.name = "Crystal Harpoon";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 6644:
                itemDef.name = "@blu@Crystal Armour";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 6642:
                itemDef.name = "@gre@Crystal Armour";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 6641:
                itemDef.name = "@yel@Crystal Armour";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 6650:
                itemDef.name = "@bla@Crystal Armour";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 6645:
                itemDef.name = "@MAG@Crystal Armour";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 6640:
                itemDef.name = "@red@Crystal Armour";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 6646:
                itemDef.name = "@whi@Crystal Armour";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.stacks = 0;
                itemDef.custom = true;
                break;
            case 24866:  //Shoulder Monkey
            case 24862:  //Shoulder Monkey
            case 19556:  //Shoulder Monkey
            case 24867:  //Shoulder Monkey
            case 24865:  //Shoulder Monkey
                itemDef.custom = true;
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                break;
            case 20211:
                itemDef.custom = true;
                itemDef.name = "Cape of darkness";
                itemDef.stacks = 0;
                break;
            case 10595:
                itemDef.custom = true;
                itemDef.name = "Penguin Suit";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 6722:
                itemDef.custom = true;
                itemDef.name = "Zombie head";
                itemDef.interfaceOptions = new String[] { "Talk-At", null, "Display", null, "Drop" };
                break;
            case 4079:
                itemDef.custom = true;
                itemDef.name = "Yo-Yo";
                itemDef.interfaceOptions = new String[] { "Play", null, "Loop", "Walk", null,};
                break;
            case 28136:
                itemDef.custom = true;
                itemDef.name = "Forestry backpack";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 84:
                itemDef.custom = true;
                itemDef.name = "Armadyl staff";
                itemDef.interfaceOptions = new String[] { null, "Wield", null, null, "Drop" };
                break;
            case 33245:
                itemDef.custom = true;
                itemDef.id = 33245;
                itemDef.inventoryModel = (60100);
                itemDef.name = "Centurians party Hat";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(1044).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(1044).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(1044).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(1044).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(1044).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(1044).yOffset2d;
                itemDef.maleModel0 = (60101);
                itemDef.femaleModel0 = (60102);
                break;
            case 33246:
                itemDef.custom = true;
                itemDef.id = 33246;
                itemDef.inventoryModel = (60106);
                itemDef.name = "Sponges Skeleton Mask";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9925).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9925).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9925).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9925).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9925).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9925).yOffset2d;
                itemDef.maleModel0 = (60111);
                itemDef.femaleModel0 = (60117);
                break;
            case 33247:
                itemDef.custom = true;
                itemDef.id = 33247;
                itemDef.inventoryModel = (60103);
                itemDef.name = "Sponges Skeleton Body";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9924).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9924).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9924).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9924).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9924).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9924).yOffset2d;
                itemDef.maleModel0 = (60113);
                itemDef.maleModel1 = (60108);
                itemDef.femaleModel0 = (60119);
                itemDef.femaleModel1 = (60114);
                break;
            case 33248:
                itemDef.custom = true;
                itemDef.id = 33248;
                itemDef.inventoryModel = (60107);
                itemDef.name = "Sponges Skeleton Legs";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9923).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9923).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9923).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9923).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9923).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9923).yOffset2d;
                itemDef.maleModel0 = (60112);
                itemDef.femaleModel0 = (60118);
                break;
            case 33249:
                itemDef.custom = true;
                itemDef.id = 33249;
                itemDef.inventoryModel = (60104);
                itemDef.name = "Sponges Skeleton Boots";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9921).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9921).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9921).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9921).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9921).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9921).yOffset2d;
                itemDef.maleModel0 = (60109);
                itemDef.femaleModel0 = (60115);
                break;
            case 33250:
                itemDef.custom = true;
                itemDef.id = 33250;
                itemDef.inventoryModel = (60105);
                itemDef.name = "Sponges Skeleton Gloves";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9922).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9922).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9922).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9922).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9922).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9922).yOffset2d;
                itemDef.maleModel0 = (60110);
                itemDef.femaleModel0 = (60116);
                break;
            case 33261:
                itemDef.custom = true;
                itemDef.id = 33261;
                itemDef.inventoryModel = (60123);
                itemDef.name = "Green Skeleton Mask";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9925).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9925).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9925).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9925).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9925).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9925).yOffset2d;
                itemDef.maleModel0 = (60128);
                itemDef.femaleModel0 = (60134);
                break;
            case 33262:
                itemDef.custom = true;
                itemDef.id = 33262;
                itemDef.inventoryModel = (60120);
                itemDef.name = "Green Skeleton Body";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9924).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9924).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9924).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9924).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9924).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9924).yOffset2d;
                itemDef.maleModel0 = (60130);
                itemDef.maleModel1 = (60125);
                itemDef.femaleModel0 = (60136);
                itemDef.femaleModel1 = (60131);
                break;
            case 33263:
                itemDef.custom = true;
                itemDef.id = 33263;
                itemDef.inventoryModel = (60124);
                itemDef.name = "Green Skeleton Legs";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9923).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9923).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9923).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9923).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9923).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9923).yOffset2d;
                itemDef.maleModel0 = (60129);
                itemDef.femaleModel0 = (60135);
                break;
            case 33264:
                itemDef.custom = true;
                itemDef.id = 33264;
                itemDef.inventoryModel = (60121);
                itemDef.name = "Green Skeleton Boots";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9921).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9921).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9921).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9921).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9921).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9921).yOffset2d;
                itemDef.maleModel0 = (60126);
                itemDef.femaleModel0 = (60132);
                break;
            case 33265:
                itemDef.custom = true;
                itemDef.id = 33265;
                itemDef.inventoryModel = (60122);
                itemDef.name = "Green Skeleton Gloves";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop" };
                itemDef.zoom2d = ItemDefinition.lookup(9922).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9922).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9922).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9922).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9922).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9922).yOffset2d;
                itemDef.maleModel0 = (60127);
                itemDef.femaleModel0 = (60133);
                break;
            case 33266:
                itemDef.custom = true;
                itemDef.id = 33266;
                itemDef.inventoryModel = (60138);
                itemDef.name = "Red Skeleton Mask";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop"};
                itemDef.zoom2d = ItemDefinition.lookup(9925).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9925).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9925).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9925).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9925).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9925).yOffset2d;
                itemDef.maleModel0 = (60143);
                itemDef.femaleModel0 = (60149);
                break;
            case 33267:
                itemDef.custom = true;
                itemDef.id = 33267;
                itemDef.inventoryModel = (60152);
                itemDef.name = "Red Skeleton Body";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop"};
                itemDef.zoom2d = ItemDefinition.lookup(9924).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9924).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9924).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9924).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9924).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9924).yOffset2d;
                itemDef.maleModel0 = (60145);
                itemDef.maleModel1 = (60140);
                itemDef.femaleModel0 = (60151);
                itemDef.femaleModel1 = (60146);
                break;
            case 33268:
                itemDef.custom = true;
                itemDef.id = 33268;
                itemDef.inventoryModel = (60139);
                itemDef.name = "Red Skeleton Legs";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop"};
                itemDef.zoom2d = ItemDefinition.lookup(9923).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9923).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9923).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9923).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9923).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9923).yOffset2d;
                itemDef.maleModel0 = (60144);
                itemDef.femaleModel0 = (60150);
                break;
            case 33269:
                itemDef.custom = true;
                itemDef.id = 33269;
                itemDef.inventoryModel = (60136);
                itemDef.name = "Red Skeleton Boots";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop"};
                itemDef.zoom2d = ItemDefinition.lookup(9921).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9921).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9921).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9921).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9921).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9921).yOffset2d;
                itemDef.maleModel0 = (60141);
                itemDef.femaleModel0 = (60147);
                break;
            case 33270:
                itemDef.custom = true;
                itemDef.id = 33270;
                itemDef.inventoryModel = (60137);
                itemDef.name = "Red Skeleton gloves";
                itemDef.interfaceOptions = new String[] { null, "Wear", null, null, "Drop"};
                itemDef.zoom2d = ItemDefinition.lookup(9922).zoom2d;
                itemDef.xan2d = ItemDefinition.lookup(9922).xan2d;
                itemDef.yan2d = ItemDefinition.lookup(9922).yan2d;
                itemDef.zan2d = ItemDefinition.lookup(9922).zan2d;
                itemDef.xOffset2d = ItemDefinition.lookup(9922).xOffset2d;
                itemDef.yOffset2d = ItemDefinition.lookup(9922).yOffset2d;
                itemDef.maleModel0 = (60142);
                itemDef.femaleModel0 = (60148);
                break;

            case 28301:
            case 28295:
            case 28304:
            case 28298:
            case 28285:
            case 28279:
            case 28281:
            case 28283:
            case 28293:
            case 28287:
            case 28291:
            case 28289:
                itemDef.custom = true;
                itemDef.interfaceOptions = new String[] { null, null, null, null, null };
                break;
            case 22947:
                itemDef.custom = true;
                itemDef.name = "Scroll Of Levitation";
                itemDef.interfaceOptions = new String[] { null, "Equip", null, null, "Drop" };
                break;
            case 25646:
                itemDef.custom = true;
                itemDef.name = "@gre@$100 Deals chest";
                break;
            case 25649:
                itemDef.custom = true;
                itemDef.name = "@blu@$250 Deals chest";
                break;
            case 25648:
                itemDef.custom = true;
                itemDef.name = "@cya@$750 Deals chest";
                break;
            case 25650:
                itemDef.custom = true;
                itemDef.name = "@red@$999 Deals chest";
                break;
            case 33251:
                itemDef.custom = true;
                itemDef.name = "Arkcane Donation Coin";
                itemDef.createCustomSprite("dono_coin.png");
                break;
            case 33252:  //Coin Token
            case 33253:  //Coin Token
            case 33254:  //Coin Token
            case 33255:  //Coin Token
            case 33256:  //Coin Token
            case 33257:  //Coin Token
            case 33258:  //Coin Token
            case 33259:  //Coin Token
                itemDef.custom = true;
                itemDef.name = "Coinflip Token";
                String color = "";
                switch (itemId) {
                    case 33252: color = "blue"; break;
                    case 33253: color = "green"; break;
                    case 33254: color = "orange"; break;
                    case 33255: color = "pink"; break;
                    case 33256: color = "purple"; break;
                    case 33257: color = "red"; break;
                    case 33258: color = "teal"; break;
                    case 33259: color = "yellow"; break;
                }
                itemDef.createCustomSprite(color + "_coin.png");
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                break;
            case 33260:
                itemDef.custom = true;
                itemDef.name = "Phone";
                itemDef.interfaceOptions = new String[] { "Open", null, null, null, "Drop" };
                itemDef.inventoryModel = (60053);
                itemDef.zoom2d = 1991;
                itemDef.xan2d = 96;
                itemDef.yan2d = 165;
                itemDef.zan2d = 9;
                itemDef.xOffset2d = 9;
                itemDef.yOffset2d = 26;
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
                    System.out.println("Error coding item " + itemId + "[" + itemDef.name != null ? itemDef.name : "Null" + "]");
                    e.printStackTrace();
                }
                if (itemDef.noteTemplateId != -1 && itemDef.noteLinkId != -1) {
                    itemDef.toNote();
                }
                cache.put(itemDef, itemId);
            }
        }

        if (Configuration.dumpDataLists) {
            itemDef = customItems(itemDef);
        }
        return itemDef;
    }


    void method2789(ItemDefinition var1, ItemDefinition var2) {
        inventoryModel = var1.inventoryModel * 1;
        zoom2d = var1.zoom2d * 1;
        xan2d = 1 * var1.xan2d;
        yan2d = 1 * var1.yan2d;
        zan2d = 1 * var1.zan2d;
        xOffset2d = 1 * var1.xOffset2d;
        yOffset2d = var1.yOffset2d * 1;
        modifiedColours = var2.modifiedColours;
        originalColours = var2.originalColours;
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
        modifiedColours = var1.modifiedColours;
        originalColours = var1.originalColours;
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

            if (sprite != null && sprite.maxHeight != stackSize && sprite.maxHeight != -1) {
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
        int[] pixels = Rasterizer2D.pixels;
        int width = Rasterizer2D.width;
        int height = Rasterizer2D.height;
        int vp_left = Rasterizer2D.leftX;
        int vp_right = Rasterizer2D.bottomX;
        int vp_top = Rasterizer2D.topY;
        int vp_bottom = Rasterizer2D.bottomY;
        Rasterizer3D.world = false;
        Rasterizer3D.aBoolean1464 = false;
        Rasterizer2D.initDrawingArea(32, 32, enabledSprite.myPixels);
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

        Rasterizer2D.initDrawingArea(32, 32, enabledSprite.myPixels);

        if (noted) {
            int old_w = sprite.maxWidth;
            int old_h = sprite.maxHeight;
            sprite.maxWidth = 32;
            sprite.maxHeight = 32;
            sprite.drawSprite(0, 0);
            sprite.maxWidth = old_w;
            sprite.maxHeight = old_h;
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
        enabledSprite.maxWidth = definition.isStackable() ? 33 : 32;
        enabledSprite.maxHeight = stackSize;
        return enabledSprite;
    }


    public static Sprite getSprite(int itemId, int stackSize, int outlineColor) {
        if (outlineColor == 0) {
            Sprite sprite = (Sprite) sprites.get(itemId);
            if (sprite != null && sprite.maxHeight != stackSize && sprite.maxHeight != -1) {

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
        int[] pixels = Rasterizer2D.pixels;
        int width = Rasterizer2D.width;
        int height = Rasterizer2D.height;
        int vp_left = Rasterizer2D.leftX;
        int vp_right = Rasterizer2D.bottomX;
        int vp_top = Rasterizer2D.topY;
        int vp_bottom = Rasterizer2D.bottomY;
        Rasterizer3D.world = false;
        Rasterizer3D.aBoolean1464 = false;
        Rasterizer2D.initDrawingArea(32, 32, enabledSprite.myPixels);
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

        Rasterizer2D.initDrawingArea(32, 32, enabledSprite.myPixels);

        if (itemDef.noteTemplateId != -1) {
            int old_w = sprite.maxWidth;
            int old_h = sprite.maxHeight;
            sprite.maxWidth = 32;
            sprite.maxHeight = 32;
            sprite.drawSprite(0, 0);
            sprite.maxWidth = old_w;
            sprite.maxHeight = old_h;
        }
        if (outlineColor == 0)
            sprites.put(enabledSprite, itemId);
        Rasterizer2D.initDrawingArea(height, width, pixels);
        Rasterizer2D.setDrawingArea(vp_bottom, vp_left, vp_right, vp_top);
        Rasterizer3D.originViewX = centerX;
        Rasterizer3D.originViewY = centerY;
        Rasterizer3D.scanOffsets = lineOffsets;
        Rasterizer3D.aBoolean1464 = true;
        Rasterizer3D.world = true;
        if (itemDef.isStackable())
            enabledSprite.maxWidth = 33;
        else
            enabledSprite.maxWidth = 32;
        enabledSprite.maxHeight = stackSize;
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
        int[] pixels = Rasterizer2D.pixels;
        int width = Rasterizer2D.width;
        int height = Rasterizer2D.height;
        int vp_left = Rasterizer2D.leftX;
        int vp_right = Rasterizer2D.bottomX;
        int vp_top = Rasterizer2D.topY;
        int vp_bottom = Rasterizer2D.bottomY;
        Rasterizer3D.world = false;
        Rasterizer3D.aBoolean1464 = false;
        Rasterizer2D.initDrawingArea(18, 18, enabledSprite.myPixels);
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
            int old_w = sprite.maxWidth;
            int old_h = sprite.maxHeight;
            sprite.maxWidth = 18;
            sprite.maxHeight = 18;
            sprite.drawSprite(0, 0);
            sprite.maxWidth = old_w;
            sprite.maxHeight = old_h;
        }

        sprites.put(enabledSprite, itemId);
        Rasterizer2D.initDrawingArea(height, width, pixels);
        Rasterizer2D.setDrawingArea(vp_bottom, vp_left, vp_right, vp_top);
        Rasterizer3D.originViewX = centerX;
        Rasterizer3D.originViewY = centerY;
        Rasterizer3D.scanOffsets = lineOffsets;
        Rasterizer3D.aBoolean1464 = true;
        Rasterizer3D.world = true;

        enabledSprite.maxWidth = 18;
        enabledSprite.maxHeight = 18;
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
        int[] pixels = Rasterizer2D.pixels;
        int width = Rasterizer2D.width;
        int height = Rasterizer2D.height;
        int vp_left = Rasterizer2D.leftX;
        int vp_right = Rasterizer2D.bottomX;
        int vp_top = Rasterizer2D.topY;
        int vp_bottom = Rasterizer2D.bottomY;
        Rasterizer3D.world = false;
        Rasterizer3D.aBoolean1464 = false;
        Rasterizer2D.initDrawingArea(90, 90, sprite.myPixels);
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
        Rasterizer2D.initDrawingArea(90, 90, sprite.myPixels);
        Rasterizer2D.initDrawingArea(height, width, pixels);
        Rasterizer2D.setDrawingArea(vp_bottom, vp_left, vp_right, vp_top);
        Rasterizer3D.originViewX = centerX;
        Rasterizer3D.originViewY = centerY;
        Rasterizer3D.scanOffsets = lineOffsets;
        Rasterizer3D.aBoolean1464 = true;
        Rasterizer3D.world = true;
        if (itemDef.isStackable())
            sprite.maxWidth = 33;
        else
            sprite.maxWidth = 32;
        sprite.maxHeight = stackSize;
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
        if (modifiedColours != null) {
            for (int i1 = 0; i1 < modifiedColours.length; i1++)
                dialogueModel_.recolor(modifiedColours[i1], originalColours[i1]);

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
        if (gender == 0 && maleOffset != 0)
            primaryModel_.offsetBy(0, maleOffset, 0);
        if (gender == 1 && femaleOffset != 0)
            primaryModel_.offsetBy(0, femaleOffset, 0);
            if (modifiedColours != null) {
                for (int i1 = 0; i1 < modifiedColours.length; i1++)
                    primaryModel_.recolor(modifiedColours[i1], originalColours[i1]);

            }
            if (modifiedTextureColours != null) {
                for (int i1 = 0; i1 < modifiedTextureColours.length; i1++)
                    primaryModel_.retexture(modifiedTextureColours[i1], originalTextureColours[i1]);
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
        modifiedColours = null;
        originalColours = null;
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
        if (modifiedColours != null) {
            for (int l = 0; l < modifiedColours.length; l++)
                model.recolor(modifiedColours[l], originalColours[l]);

        }
        if (modifiedTextureColours != null) {
            for (int i1 = 0; i1 < modifiedTextureColours.length; i1++)
                model.retexture(modifiedTextureColours[i1], originalTextureColours[i1]);
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
        if (modifiedColours != null) {
            for (int colorPtr = 0; colorPtr < modifiedColours.length; colorPtr++)
                model.recolor(modifiedColours[colorPtr], originalColours[colorPtr]);

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
                modifiedColours = new int[length];
                originalColours = new int[length];
                for (int index = 0; index < length; index++) {
                    modifiedColours[index] = buffer.readUShort();
                    originalColours[index] = buffer.readUShort();
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