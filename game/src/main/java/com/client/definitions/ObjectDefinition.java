package com.client.definitions;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.client.*;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;
import lombok.ToString;
import net.runelite.api.IterableHashTable;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSIterableNodeHashTable;
import net.runelite.rs.api.RSObjectComposition;
import org.apache.commons.lang3.StringUtils;

@ToString
public final class ObjectDefinition extends DualNode implements RSObjectComposition {


	private int clipType;
	public transient boolean custom;

	public static EvictingDualNodeHashTable cache = new EvictingDualNodeHashTable(64);
	public static ObjectDefinition lookup(int i) {

		if (i == 1753 || i == 1751 || i == 1752 || i == 12605 || i == 1750 || i == 11812 || i == 11811 || i == 11817 || i == 11947 || i == 11815 || i == 12600 || i == 11814 || i == 12599 || i == 11813 || i == 12598) {
			i = 13424;
		}
		ObjectDefinition objectDef = (ObjectDefinition) cache.get(i);
		if (objectDef == null) {
			objectDef = new ObjectDefinition();
			objectDef.id = i;
			objectDef.setDefaults();
			byte[] data = Js5List.configs.takeFile(Js5ConfigType.OBJECT, i);
			if(data != null) {
				objectDef.decode(new Buffer(data));
				cache.put(objectDef, i);
			}
		}

		/*switch (i) {
			case 46539:
				objectDef.actions = new String[]{null, "Collect", null, null, null};
				objectDef.custom = true;
				break;

			case 33285:
			case 33286:
				objectDef.name = "Stairs";
				objectDef.description = "Stairway to heaven.";
				objectDef.actions = new String[]{ null, "Climb", null, null, null};
				objectDef.custom = true;
				break;
			case 2079:
				objectDef.name = "Offline Reward Chest";
				objectDef.description = "Offline Reward Chest.";
				objectDef.actions = new String[]{ null, "Open", null, null, null};
				objectDef.custom = true;
				break;
			case 26645:
				objectDef.name = "Resource Area";
				objectDef.description = "Resource Area.";
				objectDef.actions = new String[]{ null, "Enter", null, null, null};
				objectDef.custom = true;
				break;
			case 30386:
				objectDef.name = "Fightcaves Portal";
				objectDef.description = "Fightcaves Portal.";
				objectDef.actions = new String[]{ null, "Enter", "Inferno", null, null};
				objectDef.custom = true;
				break;
			case 22772:
				objectDef.name = "Hunter & Herblore";
				objectDef.description = "Hunter & Herblore XP Stall.";
				objectDef.actions = new String[]{ null, "Steal From", null, null, null};
				objectDef.custom = true;
				break;
			case 31934:
			case 34687:
				objectDef.name = "Demon Hunter & Slayer";
				objectDef.description = "Demon Hunter & Slayer statue.";
				objectDef.actions = new String[]{ null, "Attune", null, null, null};
				objectDef.custom = true;
				break;

			case 30645:
				objectDef.name = "Santa's Sleigh";
				objectDef.description = "Santa's Sleigh.";
				objectDef.actions = new String[]{ null, null, null, null, null};
				objectDef.mapSceneID = -1;
				objectDef.custom = true;
				break;
			case 31619:
				objectDef.actions = new String[]{ null, "Access", null, null, null};
				objectDef.custom = true;
				break;
			case 15311:
			case 15313:
			case 15317:
			case 15315:
				objectDef.name = "Presents";
				objectDef.description = "Presents.";
				objectDef.actions = new String[]{ null, null, null, null, null};
				objectDef.mapSceneID = -1;
				objectDef.custom = true;
				break;
			case 15305:
				objectDef.name = "Christmas Tree";
				objectDef.description = "Christmas Tree.";
				objectDef.actions = new String[]{ null, null, null, null, null};
				objectDef.mapSceneID = -1;
				objectDef.sizeX = 3;
				objectDef.sizeY = 3;
				objectDef.modelSizeY = 340; // Width
				objectDef.modelSizeX = 500; // Thickness
				objectDef.modelSizeZ = 400; // Height
				objectDef.custom = true;
				break;
			case 15319:
				objectDef.name = "Santa's Sack";
				objectDef.description = "Santa's Sack.";
				objectDef.actions = new String[]{ null, null, null, null, null};
				objectDef.mapSceneID = -1;
				objectDef.custom = true;
				break;
			case 41126:
			case 41128:
			case 41130:
				objectDef.actions = new String[]{ null, null, null, null, null};
				objectDef.custom = true;
				break;
			case 36201: // Raids 1 lobby entrance
				objectDef.actions = new String[]{ "Enter", null, null, null, null};
				objectDef.custom = true;
				break;
			case 36062:
				objectDef.description = "Teleports you anywhere around ArkCane.";
				objectDef.actions = new String[] { "Activate", "Previous Location", null, null, null };
				objectDef.custom = true;
				break;
			case 4152:
				objectDef.name = "Skilling Portal";
				objectDef.description = "Teleports you to various skilling areas.";
				objectDef.actions = new String[] { "Teleport", null, null, null, null };
				objectDef.custom = true;
				break;
			case 1206:
				objectDef.name = "Hespori Vines";
				objectDef.description = "The vines of Hespori.";
				objectDef.actions = new String[] { "Pick", null, null, null, null };
				objectDef.custom = true;
				break;
			case 33222:
				objectDef.name = "Burning Ore";
				objectDef.description = "I should try heating this up.";
				objectDef.actions = new String[] { "Mine", null, null, null, null };
				objectDef.custom = true;
				break;
			case 8880:
				objectDef.name = "Tool Box";
				objectDef.description = "Useful tools for resources in the area.";
				objectDef.actions = new String[] { "Take-tools", null, null, null, null };
				objectDef.custom = true;
				break;
			case 29771:
				objectDef.name = "Tools";
				objectDef.description = "Useful tools for resources in the area.";
				objectDef.actions = new String[] { null , null, null, null, null };
				objectDef.custom = true;
				break;
			case 33223:
				objectDef.name = "Enchanted stone";
				objectDef.description = "A fragile ancient stone.";
				objectDef.actions = new String[] { "Mine", null, null, null, null };
				objectDef.custom = true;
				break;

			case 33311:
				objectDef.name = "Fire";
				objectDef.description = "Looks very hot.";
				objectDef.actions = new String[] { "Burn-essence", "Burn-runes", null, null, null };
				objectDef.custom = true;
				break;
			case 12768:
				objectDef.name = "@gre@Nature Chest";
				objectDef.description = "Requires a Hespori key to open.";
				objectDef.custom = true;
				break;
			case 37743: // nightmare good flower
				objectDef.animationId = 8617;
				objectDef.custom = true;
				break;
			case 37740: // nightmare bad flower
				objectDef.animationId = 8623;
				objectDef.custom = true;
				break;
			case 37738: // nightmare spore spawn
				objectDef.animationId = 8630;
				objectDef.custom = true;
				break;
			case 35914:
				objectDef.name = "Ahrim The Blighted";
				objectDef.actions = new String[] { "Awaken", null, null, null, null };
				objectDef.custom = true;
				break;
			case 9362:
				objectDef.name = "Dharok The Wretched";
				objectDef.actions = new String[] { "Awaken", null, null, null, null };
				objectDef.custom = true;
				break;
			case 14766:
				objectDef.name = "Verac The Defiled";
				objectDef.actions = new String[] { "Awaken", null, null, null, null };
				objectDef.custom = true;
				break;
			case 9360:
				objectDef.name = "Torag The Corrupted";
				objectDef.actions = new String[] { "Awaken", null, null, null, null };
				objectDef.custom = true;
				break;
			case 28723:
				objectDef.name = "Karil The Tainted";
				objectDef.actions = new String[] { "Awaken", null, null, null, null };
				objectDef.custom = true;
				break;
			case 31716:
				objectDef.name = "Guthan The Infested";
				objectDef.actions = new String[] { "Awaken", null, null, null, null };
				objectDef.custom = true;
				break;
			case 31622:
				objectDef.name = "Tournament Entrance";
				objectDef.actions = new String[] { "Enter", "Check Players", "Check Active", null, null };
				objectDef.custom = true;
				break;
			case 30943:
				objectDef.actions = new String[] { "Upgrade", null, null, null, null };
				objectDef.custom = true;
				break;
			case 31624:
				objectDef.name = "@pur@Platinum Altar";
				objectDef.custom = true;
				break;
			case 29064:
				objectDef.name = "ArkCane Leaderboards";
				objectDef.actions = new String[] { "View", null, null, null, null };
				objectDef.custom = true;
				break;
			case 32508:
				objectDef.name = "Hunllef's Chest";
				objectDef.actions = new String[] { "Unlock", null, null, null, null };
				objectDef.custom = true;
				break;
			case 6097:
				objectDef.actions = new String[] { "Donate", null, null, null, null };
				objectDef.custom = true;
				break;
			case 14888:
				objectDef.name = "Jewelry Oven";
				objectDef.custom = true;
				break;
			case 40949:
				objectDef.name = "Furnace";
				objectDef.actions = new String[] { "Smelt", null, null, null, null };
				objectDef.custom = true;
				break;
			case 43749:
				objectDef.name = "Legendary Zone Barrier";
				objectDef.actions = new String[] { "Pass", null, null, null, null };
				objectDef.solid = 0;
				objectDef.contouredGround = true;
				objectDef.sizeY = 1;
				objectDef.description = "A Barrier Protecting Legendary Zone Access.";
				objectDef.custom = true;
				break;
			case 43751:
				objectDef.name = "Diamond Zone Barrier";
				objectDef.actions = new String[] { "Pass", null, null, null, null };
				objectDef.solid = 0;
				objectDef.contouredGround = true;
				objectDef.sizeY = 1;
				objectDef.description = "A Barrier Protecting Diamond Zone Access.";
				objectDef.custom = true;
				break;
			case 29165:
				objectDef.name = "Coin Stack";
				objectDef.actions = new String[] { null, "Steal From", null, null, null };
				objectDef.custom = true;
				break;
			case 13681:
				objectDef.name = "Animal Cage";
				objectDef.actions = new String[] { null, null, null, null, null };
				objectDef.custom = true;
				break;
			case 30720:
				objectDef.name = "@red@Corrupt Chest";
				objectDef.actions = new String[] { "Open", null, null, null, null };
				objectDef.custom = true;
				break;
			case 34662:
				objectDef.actions = new String[] { "Open", "Teleport", null, null, null };
				objectDef.custom = true;
				break;
			case 12202:
				objectDef.actions = new String[] { "Dig", null, null, null, null };
				objectDef.custom = true;
				break;
			case 30107:
				objectDef.name = "Raids Reward Chest";
				objectDef.actions = new String[] { "Open", null, null, null, null };
				objectDef.custom = true;
				break;
			case 36197:
				objectDef.name = "Home Teleport";
				objectDef.custom = true;

				break;
			case 10562:
				objectDef.actions = new String[] { "Open", null, null, null, null };
				objectDef.custom = true;
				break;
			case 8207:
				objectDef.actions = new String[] { "Care-To", null, null, null, null };
				objectDef.name = "Herb Patch";
				objectDef.custom = true;
				break;
			case 8720:
				objectDef.name = "Vote shop";
				objectDef.custom = true;
				break;
			case 8210:
				objectDef.actions = new String[] { "Rake", null, null, null, null };
				objectDef.name = "Herb Patch";
				objectDef.custom = true;
				break;
			case 29150:
				objectDef.actions = new String[] { "Venerate", null, null, null, null };
				objectDef.custom = true;
				break;
			case 6764:
				objectDef.name = null;
				objectDef.actions = new String[] { null, null, null, null, null };
				objectDef.custom = true;
				break;
			case 8139:
			case 8140:
			case 8141:
			case 8142:
				objectDef.actions = new String[] { "Inspect", null, null, null, null };
				objectDef.name = "Herbs";
				objectDef.custom = true;
				break;
			case 2341:
				objectDef.actions = new String[] { null, null, null, null, null };
				objectDef.custom = true;
				break;
			case 14217:
				objectDef.actions = new String[5];
				objectDef.custom = true;
				break;
			case 3840:
				objectDef.actions = new String[5];
				objectDef.actions[0] = "Fill";
				objectDef.actions[1] = "Empty-From";
				objectDef.name = "Compost Bin";
				objectDef.custom = true;
				break;
			case 172:
				objectDef.name = "Ckey chest";
				objectDef.custom = true;
				break;
			case 31925:
				objectDef.name = "Max Island";
				objectDef.actions = new String[] { "Tele to", null, null, null, null };
				objectDef.custom = true;
				break;
			case 2996:
				objectDef.name = "Vote Chest";
				objectDef.actions = new String[] { "Unlock", null, null, null, null };
				objectDef.custom = true;
				break;

			case 12309:
				objectDef.actions = new String[5];
				objectDef.actions[0] = "Bank";
				objectDef.actions[1] = "Buy gloves";
				objectDef.actions[2] = null;
				objectDef.name = "Chest";
				objectDef.custom = true;
				break;
			case 32572:
				objectDef.actions = new String[5];
				objectDef.actions[0] = "Bank";
				objectDef.name = "Group chest";
				objectDef.custom = true;
				break;
			case 1750:
				objectDef.objectModels = new int[] { 8131, };
				objectDef.name = "Willow";
				objectDef.sizeX = 2;
				objectDef.sizeY = 2;
				objectDef.ambient = 25;
				objectDef.actions = new String[] { "Chop down", null, null, null, null };
				objectDef.mapSceneID = 3;
				objectDef.custom = true;
				break;

			case 26782:
				objectDef.actions = new String[] { "Recharge", null, null, null, null };
				objectDef.custom = true;
				break;

			case 20845:
				objectDef.objectModels = new int[] { 19201 };
				objectDef.name = "Jack-o-Lantern";
				objectDef.sizeX = 3;
				objectDef.sizeY = 3;
				objectDef.animationId = 0;
				objectDef.description = "A Jack-o-Lantern.";
				objectDef.custom = true;
				break;

			case 1751:
				objectDef.objectModels = new int[] { 8037, 8040, };
				objectDef.name = "Oak";
				objectDef.sizeX = 3;
				objectDef.sizeY = 3;
				objectDef.ambient = 25;
				objectDef.actions = new String[] { "Chop down", null, null, null, null };
				objectDef.mapSceneID = 1;
				objectDef.custom = true;
				break;

			case 7814:
				objectDef.actions = new String[] { "Teleport", null, null, null, null };
				objectDef.custom = true;
				break;

			case 8356:
				objectDef.actions = new String[] { "Teleport", "Mt. Quidamortem", null, null, null };
				objectDef.custom = true;
				break;

			case 28900:
				objectDef.actions = new String[] { "Teleport", "Recharge Crystals", null, null, null };
				objectDef.custom = true;
				break;
			case 26740:
				objectDef.name = "Player Outlast";
				objectDef.actions = new String[] { "Join", "Setup", null, null, null };
				objectDef.custom = true;
				break;

			case 28837:
				objectDef.actions = new String[] { "Set Destination", null, null, null, null };
				objectDef.custom = true;
				break;

			case 26742:
			case 26743:
			case 26744:
			case 26745:
			case 26746:
			case 26747:
			case 26748:
			case 26749:
				objectDef = ObjectDefinition.lookup(26741);
				objectDef.custom = true;
				break;

			case 7811:
				objectDef.name = "District Supplies";
				objectDef.actions = new String[] { "Blood Money", "Free", "Quick-Sets", null, null };
				objectDef.custom = true;
				break;
			case 10061:
			case 10060:
				objectDef.name = "Trading Post";
				objectDef.actions = new String[] { "Bank", "Open", "Collect", null, null };
				objectDef.custom = true;
				break;
			case 13287:
				objectDef.name = "Storage chest (UIM)";
				objectDef.description = "A chest to store items for UIM.";
				objectDef.custom = true;
				break;
			case 1752:
				objectDef.objectModels = new int[] { 4146, };
				objectDef.name = "Hollow tree";
				objectDef.ambient = 25;
				objectDef.actions = new String[] { "Chop down", null, null, null, null };
				objectDef.modifiedColours = new int[] { 13592, 10512, };
				objectDef.originalColours = new int[] { 7056, 6674, };
				objectDef.mapSceneID = 0;
				objectDef.custom = true;
				break;
			case 4873:
				objectDef.name = "Wilderness Lever";
				objectDef.sizeX = 3;
				objectDef.sizeY = 3;
				objectDef.ambient = 25;
				objectDef.actions = new String[] { "Enter Deep Wildy", null, null, null, null };
				objectDef.mapSceneID = 3;
				objectDef.custom = true;
				break;
			case 2544:
				objectDef.name = "Dagannoth Manhole";
				objectDef.custom = true;
				break;
			case 29345:
				objectDef.name = "Training Teleports Portal";
				objectDef.actions = new String[] { "Teleport", null, null, null, null };
				objectDef.custom = true;
				break;
			case 29346:
				objectDef.name = "Wilderness Teleports Portal";
				objectDef.actions = new String[] { "Teleport", null, null, null, null };
				objectDef.custom = true;
				break;
			case 29347:
				objectDef.name = "Boss Teleports Portal";
				objectDef.actions = new String[] { "Teleport", null, null, null, null };
				objectDef.custom = true;
				break;
			case 29349:
				objectDef.name = "Mini-Game Teleports Portal";
				objectDef.actions = new String[] { "Teleport", null, null, null, null };
				objectDef.custom = true;
				break;
			case 7127:
				objectDef.name = "Leaderboards";
				objectDef.actions = new String[] { "Open", "Wins", "Kills", "KDR", null };
				objectDef.custom = true;
				break;
			case 4155:
				objectDef.name = "Zul Andra Portal";
				objectDef.custom = true;
				break;
			case 2123:
				objectDef.name = "Mt. Quidamortem Slayer Dungeon";
				objectDef.custom = true;
				break;
			case 4150:
				objectDef.name = "Warriors Guild Mini-game Portal";
				objectDef.custom = true;
				break;
			case 11803:
				objectDef.name = "Donator Slayer Dungeon";
				objectDef.custom = true;
				break;
			case 4151:
				objectDef.name = "Barrows Mini-game Portal";
				objectDef.custom = true;
				break;
			case 1753:
				objectDef.objectModels = new int[] { 8157, };
				objectDef.name = "Yew";
				objectDef.sizeX = 3;
				objectDef.sizeY = 3;
				objectDef.ambient = 25;
				objectDef.actions = new String[] { "Chop down", null, null, null, null };
				objectDef.mapSceneID = 3;
				objectDef.custom = true;
				break;

			case 6943:
				objectDef.objectModels = new int[] { 1270, };
				objectDef.name = "Bank booth";
				objectDef.impenetrable = false;
				objectDef.ambient = 25;
				objectDef.contrast = 25;
				objectDef.actions = new String[] { null, "Bank", "Collect", null, null };
				objectDef.custom = true;
				break;

			case 25016:
			case 25017:
			case 25018:
			case 25029:
				objectDef.actions = new String[] { "Push-Through", null, null, null, null };
				objectDef.custom = true;
				break;

			case 19038:
				objectDef.actions = new String[] { null, null, null, null, null };
				objectDef.sizeX = 3;
				objectDef.sizeY = 3;
				objectDef.modelSizeY = 500; // Width
				objectDef.modelSizeX = 500; // Thickness
				objectDef.modelSizeZ = 400; // Height
				objectDef.custom = true;
				break;

			case 18826:
			case 18819:
			case 18818:
				objectDef.sizeX = 3;
				objectDef.sizeY = 3;
				objectDef.modelSizeY = 200; // Width
				objectDef.modelSizeX = 200; // Thickness
				objectDef.modelSizeZ = 100; // Height
				objectDef.custom = true;
				break;

			case 27777:
				objectDef.name = "Gangplank";
				objectDef.actions = new String[] { "Travel to CrabClaw Isle", null, null, null, null };
				objectDef.sizeX = 1;
				objectDef.sizeY = 1;
				objectDef.modelSizeY = 80; // Width
				objectDef.modelSizeX = 80; // Thickness
				objectDef.modelSizeZ = 250; // Height
				objectDef.custom = true;
				break;
			case 13641:
				objectDef.name = "Teleportation Device";
				objectDef.actions = new String[] { "Quick-Teleport", null, null, null, null };
				objectDef.sizeX = 1;
				objectDef.sizeY = 1;
				objectDef.modelSizeY = 80; // Width
				objectDef.modelSizeX = 80; // Thickness
				objectDef.modelSizeZ = 250; // Height
				objectDef.custom = true;
				break;

			case 29333:
				objectDef.name = "Trading post";
				objectDef.actions = new String[] { "Open", null, "Collect", null, null };
				objectDef.objectModels = new int[] { 60884 };
				objectDef.ambient = 25;
				objectDef.nonFlatShading = false;
				objectDef.description = "Buy and sell items with players here!";
				objectDef.custom = true;
				break;

			case 11700:
				objectDef.objectModels = new int[] { 4086 };
				objectDef.name = "Venom";
				objectDef.sizeX = 3;
				objectDef.sizeY = 3;
				objectDef.solid = 0;
				objectDef.contouredGround = true;
				objectDef.animationId = 1261;
				objectDef.originalColours = new int[] { 31636 };
				objectDef.modifiedColours = new int[] { 10543 };
				objectDef.modelSizeX = 160;
				objectDef.modelSizeZ = 160;
				objectDef.modelSizeY = 160;
				objectDef.actions = new String[5];
				objectDef.custom = true;
				// objectDef.description = new String(
				// "It's a cloud of venomous smoke that is extremely toxic.");
				break;

			case 11601: // 11601
				objectDef.originalTextureColours = new short[] { 2 };
				objectDef.modifiedTextureColours = new short[] { 46 };
				objectDef.custom = true;
				break;

			case 43708:
			case 43711:
			case 43814:
			case 43707:
				objectDef.actions = new String[] { "Craft", null, null, null, null };
				objectDef.description = "It's a runecrafting guardian.";
				objectDef.custom = true;
				break;
			case 32541:
				objectDef.name = "Xeric's Trials";
				objectDef.actions = new String[] { "Challenge", null, null, null, null };
				objectDef.description = "It's a Xeric's Champion cape.";
				objectDef.custom = true;
				break;

			case 43703:
				objectDef.actions = new String[] { "Attune", null, null, null, null };
				objectDef.description = "It's a Mining guardian.";
				objectDef.custom = true;
				break;

			case 31984:
				objectDef.name = "Benji's Pet Dragon";
				objectDef.actions = new String[] { null, null, null, null, null };
				objectDef.description = "Use bones on me and gain double XP while I eat.";
				objectDef.custom = true;
				break;


			case 33493:
				objectDef.name = "Powerup Pill";
				objectDef.description = "A Powerup Pill.";
				objectDef.actions = new String[]{ "Consume", null, null, null, null};
				objectDef.objectModels = new int[] { 47106 };
				objectDef.mapSceneID = 28;
				objectDef.sizeX = 1;
				objectDef.sizeY = 1;
				objectDef.modelSizeY = 25; // Width
				objectDef.modelSizeX = 25; // Thickness
				objectDef.modelSizeZ = 25; // Height
				objectDef.custom = true;
				break;

			case 33494:
				objectDef.name = "Medi Pack";
				objectDef.description = "A Medi Pack.";
				objectDef.actions = new String[]{ "Consume", null, null, null, null};
				objectDef.objectModels = new int[] { 47105 };
				objectDef.mapSceneID = 29;
				objectDef.sizeX = 1;
				objectDef.sizeY = 1;
				objectDef.modelSizeY = 25; // Width
				objectDef.modelSizeX = 25; // Thickness
				objectDef.modelSizeZ = 25; // Height
				objectDef.custom = true;
				break;

			case 13616:
				objectDef.custom = true;
				objectDef.name = "Valentine's Portal";
				objectDef.description = "Valentine's Portal.";
				objectDef.objectModels = new int[] { 65133, 11231 };
				objectDef.actions = new String[]{ null, "Enter", null, null, null};
				break;

		}*/
		if (Client.debugModels) {

			if (objectDef.name == null || objectDef.name.equalsIgnoreCase("null"))
				objectDef.name = "test";

			objectDef.interactive = 1;
		}
		return objectDef;
	}

	public static void dumpList() {
		try {
			FileWriter fw = new FileWriter("./temp/" + "object_data.json");
			fw.write("[\n");
			for (int i = 0; i < totalObjects; i++) {
				ObjectDefinition def = ObjectDefinition.lookup(i);
				String output = "[\"" + StringUtils.join(def.actions, "\", \"") + "\"],";

				String finalOutput = "	{\n" + "		\"id\": " + def.id + ",\n		" + "\"name\": \"" + def.name
						+ "\",\n		\"models\": " + Arrays.toString(def.objectModels) + ",\n		\"actions\": "
						+ output.replaceAll(", \"\"]", ", \"Examine\"]").replaceAll("\"\"", "null")
						.replace("[\"null\"]", "[null, null, null, null, \"Examine\"]")
						.replaceAll(", \"Remove\"", ", \"Remove\", \"Examine\"")
						+ "	\n		\"width\": " + def.modelSizeY + "\n	},";
				fw.write(finalOutput.replaceAll("\"name\": \"null\",", "\"name\": null,"));
				fw.write(System.getProperty("line.separator"));
			}
			fw.write("]");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void setDefaults() {
		objectModels = null;
		custom = false;
		objectTypes = null;
		soundRetain = -1;
		clipType = -256;
		name = null;
		description = null;
		originalColours = null;
		modifiedColours = null;
		originalTextureColours = null;
		modifiedTextureColours = null;
		sizeX = 1;
		sizeY = 1;
		solid = 1;
		impenetrable = true;
		interactive = 0;
		contouredGround = false;
		nonFlatShading = false;
		modelClipped = false;
		animationId = -1;
		decorDisplacement = 16;
		ambient = 0;
		contrast = 0;
		actions = null;
		mapAreaId = -1;
		mapSceneID = -1;
		isRotated = false;
		clipped = true;
		modelSizeX = 128;
		modelSizeZ = 128;
		modelSizeY = 128;
		clipMask = 0;
		offsetX = 0;
		offsetZ = 0;
		offsetY = 0;
		obstructive = false;
		isHollow = false;
		supportItems = -1;
		varbit = -1;
		varp = -1;
		transforms = null;
	}

	public void method574(OnDemandFetcher class42_sub1) {
		if (objectModels == null)
			return;
		for (int j = 0; j < objectModels.length; j++)
			class42_sub1.method560(objectModels[j] & 0xffff, 0);
	}

	public static void nullLoader() {
		baseModels = null;
		models = null;
		cache = null;
	}

	public static int totalObjects;

	public static void init() {
		totalObjects = Js5List.configs.getGroupFileCount(Js5ConfigType.OBJECT);
		System.out.println("Loaded [" + totalObjects + "] Object Definitions.");
	}

	public boolean modelTypeCached(int i) {
		if (objectTypes == null) {
			if (objectModels == null)
				return true;
			if (i != 10)
				return true;
			boolean flag1 = true;
			Model model = (Model) ObjectDefinition.models.get(id);
			for (int k = 0; k < objectModels.length; k++)
				flag1 &= Model.isCached(objectModels[k] & 0xffff);

			return flag1;
		}
		Model model = (Model) ObjectDefinition.models.get(id);
		for (int j = 0; j < objectTypes.length; j++)
			if (objectTypes[j] == i)
				return Model.isCached(objectModels[j] & 0xffff);

		return true;
	}
	public Model modelAt(int type, int orientation, int aY, int bY, int cY, int dY, int frameId, SequenceDefinition primary, int tick) {
		Model model = model(type, frameId, orientation, primary, tick);
		if (model == null)
			return null;
		if (contouredGround || nonFlatShading)
			model = new Model(contouredGround, nonFlatShading, model);
		if (contouredGround) {
			int y = (aY + bY + cY + dY) / 4;
			for (int vertex = 0; vertex < model.verticesCount; vertex++) {
				int x = model.verticesX[vertex];
				int z = model.verticesZ[vertex];
				int l2 = aY + ((bY - aY) * (x + 64)) / 128;
				int i3 = dY + ((cY - dY) * (x + 64)) / 128;
				int j3 = l2 + ((i3 - l2) * (z + 64)) / 128;
				model.verticesY[vertex] += j3 - y;
			}

			model.normalise();
			model.resetBounds();
		}

		return model;
	}

	public boolean modelCached() {
		if (objectModels == null)
			return true;
		boolean flag1 = true;
		for (int i = 0; i < objectModels.length; i++)
			flag1 &= Model.isCached(objectModels[i] & 0xffff);
		return flag1;
	}

	public ObjectDefinition transform() {
		int i = -1;
		if (varp != -1) {
			VariableBits varBit = VariableBits.lookup(varp);
			int j = varBit.baseVar;
			int k = varBit.startBit;
			int l = varBit.endBit;
			int i1 = Client.anIntArray1232[l - k];
			i = clientInstance.variousSettings[j] >> k & i1;
		} else if (varbit != -1)
			i = clientInstance.variousSettings[varbit];
		int var3;
		if (i >= 0 && i < transforms.length)
			var3 = transforms[i];
		else
			var3 = transforms[transforms.length - 1];
		return var3 == -1 ? null : lookup(var3);
	}

	public Model model(int j, int animation_id, int l, SequenceDefinition primary, int tick) {
		Model model = null;
		long l1;
		if (objectTypes == null) {
			if (j != 10)
				return null;
			l1 = (long) ((id << 6) + l) + ((long) (animation_id + 1) << 32);
			Model model_1 = (Model) models.get(l1);
			if (model_1 != null) {
				return model_1;
			}
			if (objectModels == null)
				return null;
			boolean flag1 = isRotated ^ (l > 3);
			int k1 = objectModels.length;
			for (int i2 = 0; i2 < k1; i2++) {
				int l2 = objectModels[i2];
				if (flag1)
					l2 += 0x10000;
				model = (Model) baseModels.get(l2);
				if (model == null) {
					model = Model.getModel(l2 & 0xffff);
					if (model == null)
						return null;
					if (flag1)
						model.mirror();
					baseModels.put(model, l2);
				}
				if (k1 > 1)
					aModelArray741s[i2] = model;
			}

			if (k1 > 1)
				model = new Model(k1, aModelArray741s);
		} else {
			int i1 = -1;
			for (int j1 = 0; j1 < objectTypes.length; j1++) {
				if (objectTypes[j1] != j)
					continue;
				i1 = j1;
				break;
			}

			if (i1 == -1)
				return null;
			l1 = (long) ((id << 8) + (i1 << 3) + l) + ((long) (animation_id + 1) << 32);
			Model model_2 = (Model) models.get(l1);
			if (model_2 != null) {
				return model_2;
			}
			if (objectModels == null) {
				return null;
			}
//			System.out.println("j = " + j);
			int j2 = objectModels[i1];
			boolean flag3 = isRotated ^ (l > 3);
			if (flag3)
				j2 += 0x10000;
			model = (Model) baseModels.get(j2);
			if (model == null) {
				model = Model.getModel(j2 & 0xffff);
				if (model == null)
					return null;
				if (flag3)
					model.mirror();
				baseModels.put(model, j2);
			}
		}
		boolean flag;
		flag = modelSizeX != 128 || modelSizeZ != 128 || modelSizeY != 128;
		boolean flag2;
		flag2 = offsetX != 0 || offsetZ != 0 || offsetY != 0;
		Model model_3 = new Model(originalColours == null,
				SeqFrame.noAnimationInProgress(animation_id), l == 0 && animation_id == -1 && !flag
				&& !flag2, originalTextureColours == null, model);

		if (animation_id != -1 || primary != null) {
			if (primary != null && primary.isSkeletalAnimation()) {
				model_3 = Model.emptyModel;
				model_3.buildSharedSequenceModel(model, false);
				model_3.playSkeletal(primary, tick);
			} else if (animation_id != -1) {
				model_3.generateBones();
				model_3.interpolate(animation_id);
			}
		}

		model_3.groupedTriangleLabels = null;
		model_3.groupedVertexLabels = null;
		while (l-- > 0)
			model_3.rotate90Degrees();

		if (originalColours != null) {
			for (int k2 = 0; k2 < originalColours.length; k2++)
				model_3.recolor(originalColours[k2],
						modifiedColours[k2]);

		}
		if (originalTextureColours != null) {
			for (int k2 = 0; k2 < originalTextureColours.length; k2++)
				model_3.retexture(originalTextureColours[k2],
						modifiedTextureColours[k2]);

		}
		if (flag)
			model_3.scale(modelSizeX, modelSizeY, modelSizeZ);
		if (flag2)
			model_3.offsetBy(offsetX, offsetZ, offsetY);
		model_3.light(85 + ambient, 768 + contrast, -50, -10, -50, !nonFlatShading);
		if (supportItems == 1)
			model_3.itemDropHeight = model_3.modelBaseY;

/*
		if (this.clipType * 256 >= 0) {
			model_3 = ((Model)model_3).contourGround(var3, var4, var5, var6, true, this.clipType * 256);
		}
*/


		models.put(model_3, l1);
		return model_3;
	}

	public int category;
	public int[] ambientSoundIds;
	private boolean randomizeAnimStart;
	public int soundMin;
	public int soundMax;
	public int ambientSoundId;
	public int soundRetain;
	public int soundDistance;
	public int soundDistance() {
		if(soundDistance <= 0) {
			System.out.println("[" + id + "] has a sound distance off [" + soundDistance + "]");
			return 1;
		}
		return soundDistance;
	}
	private Map<Integer, Object> params = null;

	public void decode(Buffer buffer) {
		while(true) {
			int opcode = buffer.readUnsignedByte();

			if (opcode == 0) {
				break;
			} else if (opcode == 1) {
				int len = buffer.readUnsignedByte();
				if (len > 0) {
					if (objectModels == null) {
						objectTypes = new int[len];
						objectModels = new int[len];

						for (int i = 0; i < len; i++) {
							objectModels[i] = buffer.readUShort();
							objectTypes[i] = buffer.readUnsignedByte();
						}
					} else {
						buffer.pos += len * 3;
					}
				}
			} else if (opcode == 2) {
				name = buffer.readNullTerminatedString();
			}/*else if (type == 3) {
					description = stream.readString();
			}*/ else if (opcode == 5) {
				int len = buffer.readUnsignedByte();
				if (len > 0) {
					if (objectModels == null) {
						objectTypes = null;
						objectModels = new int[len];
						for (int i = 0; i < len; i++) {
							objectModels[i] = buffer.readUShort();
						}
					} else {
						buffer.pos += len * 2;
					}
				}
			} else if (opcode == 14) {
				sizeX = buffer.readUnsignedByte();
			} else if (opcode == 15) {
				sizeY = buffer.readUnsignedByte();
			} else if (opcode == 17) {
				solid = 0;
				impenetrable = false;
			} else if (opcode == 18) {
				impenetrable = false;
			} else if (opcode == 19) {
				interactive = (buffer.readUnsignedByte());
			} else if (opcode == 21) {
				contouredGround = true;
			} else if (opcode == 22) {
				nonFlatShading = true;
			} else if (opcode == 23) {
				modelClipped = true;
			} else if (opcode == 24) {
				animationId = buffer.readUShort();
				if (animationId == 0xFFFF) {
					animationId = -1;
				}
			} else if (opcode == 27) {
				solid = 1;
			} else if (opcode == 28) {
				decorDisplacement = buffer.readUnsignedByte();
			} else if (opcode == 29) {
				ambient = buffer.readSignedByte();
			} else if (opcode == 39) {
				contrast = buffer.readSignedByte() * 25;
			} else if (opcode >= 30 && opcode < 35) {
				if (actions == null) {
					actions = new String[5];
				}
				actions[opcode - 30] = buffer.readNullTerminatedString();
				if (actions[opcode - 30] != null && actions[opcode - 30].equalsIgnoreCase("Hidden")) {
					actions[opcode - 30] = null;
				}
			} else if (opcode == 40) {
				int len = buffer.readUnsignedByte();
				originalColours = new int[len];
				modifiedColours = new int[len];
				for (int i = 0; i < len; i++) {
					originalColours[i] = buffer.readUShort();
					modifiedColours[i] = buffer.readUShort();
				}
			} else if (opcode == 41) {
				int len = buffer.readUnsignedByte();
				originalTextureColours = new short[len];
				modifiedTextureColours = new short[len];
				for (int i = 0; i < len; i++) {
					originalTextureColours[i] = (short) buffer.readUShort();
					modifiedTextureColours[i] = (short) buffer.readUShort();
				}
			}/* else if (opcode == 60) {
				minimapFunction = buffer.readUShort();
			}*/ else if (opcode == 61) {
				category = buffer.readUShort();
			} else if (opcode == 62) {
				isRotated = true;
			} else if (opcode == 64) {
				clipped = false;
			} else if (opcode == 65) {
				modelSizeX = buffer.readUShort();
			} else if (opcode == 66) {
				modelSizeZ = buffer.readUShort();
			} else if (opcode == 67) {
				modelSizeY = buffer.readUShort();
			} else if (opcode == 68) {
				mapSceneID = buffer.readUShort();
			} else if (opcode == 69) {
				clipMask = buffer.readUnsignedByte();
			} else if (opcode == 70) {
				offsetX = buffer.readSignedWord();
			} else if (opcode == 71) {
				offsetZ = buffer.readSignedWord();
			} else if (opcode == 72) {
				offsetY = buffer.readSignedWord();
			} else if (opcode == 73) {
				obstructive = true;
			} else if (opcode == 74) {
				isHollow = true;
			} else if (opcode == 75) {
				supportItems = buffer.readUnsignedByte();
			} else if (opcode == 78) {
				ambientSoundId = buffer.readUShort(); // ambient sound id
				soundDistance = buffer.readUnsignedByte();
				soundRetain = buffer.readUnsignedByte();
			} else if (opcode == 79) {
				soundMin = buffer.readUShort();
				soundMax = buffer.readUShort();
				soundDistance = buffer.readUnsignedByte();

				soundRetain = buffer.readUnsignedByte();

				int length = buffer.readUnsignedByte();
				int[] anims = new int[length];

				for (int index = 0; index < length; ++index)
				{
					anims[index] = buffer.readUShort();
				}
				ambientSoundIds = anims;
			} else if (opcode == 81) {
				clipType = buffer.readUnsignedByte() * 256;
			} else if (opcode == 82) {
				mapAreaId = buffer.readUShort();
			} else if (opcode == 89) {
				randomizeAnimStart = true;
			} else if(opcode == 90) {
				buffer.readUnsignedByte();
			} else if (opcode == 77 || opcode == 92) {
				varp = buffer.readUShort();

				if (varp == 0xFFFF) {
					varp = -1;
				}

				varbit = buffer.readUShort();

				if (varbit == 0xFFFF) {
					varbit = -1;
				}

				int value = -1;

				if (opcode == 92) {
					value = buffer.readUShort();

					if (value == 0xFFFF) {
						value = -1;
					}
				}

				int len = buffer.readUnsignedByte();

				transforms = new int[len + 2];
				for (int i = 0; i <= len; ++i) {
					transforms[i] = buffer.readUShort();
					if (transforms[i] == 0xFFFF) {
						transforms[i] = -1;
					}
				}
				transforms[len + 1] = value;
			} else if (opcode == 249) {
				int length = buffer.readUnsignedByte();

				Map<Integer, Object> params = new HashMap<>(length);
				for (int i = 0; i < length; i++)
				{
					boolean isString = buffer.readUnsignedByte() == 1;
					int key = buffer.read24Int();
					Object value;

					if (isString) {
						value = buffer.readString();
						System.out.println(value);
					} else {
						value = buffer.readInt();
					}

					params.put(key, value);
				}

				this.params = params;
			} else {

			}

		}

		if (name != null && !name.equals("null")) {
			interactive = objectModels != null && (objectTypes == null || objectTypes[0] == 10) ? 1 : 0;
			if (actions != null)
				interactive = 1;
		}

		if (isHollow) {
			solid = 0;
			impenetrable = false;
		}

		if (supportItems == -1) {
			supportItems = solid;
		}
	}

	public static EvictingDualNodeHashTable ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);

	private ObjectDefinition() {
		id = -1;
	}

	private short[] originalTextureColours;
	private short[] modifiedTextureColours;
	public boolean obstructive;
	@SuppressWarnings("unused")
	private int contrast;
	@SuppressWarnings("unused")
	private int ambient;
	private int offsetX;
	public String name;
	private int modelSizeY;
	private static final Model[] aModelArray741s = new Model[4];
	public int sizeX;
	private int offsetZ;
	public int mapAreaId;
	private int[] modifiedColours;
	private int modelSizeX;
	public int varbit;
	private boolean isRotated;
	public static boolean lowMem;
	public int id;
	public boolean impenetrable;
	public int mapSceneID;
	public int transforms[];
	public int supportItems;
	public int sizeY;
	public boolean contouredGround;
	public boolean modelClipped;
	public static Client clientInstance;
	private boolean isHollow;
	public int solid;
	public int clipMask;
	private boolean nonFlatShading;
	private static int cacheIndex;
	private int modelSizeZ;
	public int[] objectModels;
	public int varp;
	public int decorDisplacement;
	private int[] objectTypes;
	public String description;
	public int interactive;
	public boolean clipped;
	public static EvictingDualNodeHashTable models = new EvictingDualNodeHashTable(30);
	public int animationId;
	private int offsetY;
	private int[] originalColours;
	public static EvictingDualNodeHashTable baseModels = new EvictingDualNodeHashTable(500);
	public String actions[];
	private boolean field2118 = false;
	private int field2130 = 0;

	@Override
	public int getAccessBitMask() {
		return 0;
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

	@Override
	public int getId() {
		return id;
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
	public String[] getActions() {
		return this.actions;
	}

	@Override
	public int getMapSceneId() {
		return 0;
	}

	@Override
	public int getMapIconId() {
		return 0;
	}

	@Override
	public int[] getImpostorIds() {
		return null;
	}

	@Override
	public RSObjectComposition getImpostor() {
		return null;
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

	@Override
	public void decodeNext(RSBuffer buffer, int opcode) {

	}

	@Override
	public int[] getModelIds() {
		return objectModels;
	}

	@Override
	public void setModelIds(int[] modelIds) {

	}

	@Override
	public int[] getModels() {
		return new int[0];
	}

	@Override
	public void setModels(int[] models) {

	}

	@Override
	public boolean getObjectDefinitionIsLowDetail() {
		return false;
	}

	@Override
	public int getSizeX() {
		return 0;
	}

	@Override
	public void setSizeX(int sizeX) {

	}

	@Override
	public int getSizeY() {
		return 0;
	}

	@Override
	public void setSizeY(int sizeY) {

	}

	@Override
	public int getInteractType() {
		return 0;
	}

	@Override
	public void setInteractType(int interactType) {

	}

	public void setSolid(int interactType) {

	}

	@Override
	public boolean getBoolean1() {
		return false;
	}

	@Override
	public void setBoolean1(boolean boolean1) {

	}

	@Override
	public int getInt1() {
		return 0;
	}

	@Override
	public void setInt1(int int1) {

	}

	@Override
	public int getInt2() {
		return 0;
	}

	@Override
	public void setInt2(int int2) {

	}

	@Override
	public int getClipType() {
		return 0;
	}

	@Override
	public void setClipType(int clipType) {

	}

	@Override
	public boolean getNonFlatShading() {
		return false;
	}

	@Override
	public void setNonFlatShading(boolean nonFlatShading) {

	}

	@Override
	public void setModelClipped(boolean modelClipped) {

	}

	@Override
	public boolean getModelClipped() {
		return false;
	}

	@Override
	public int getAnimationId() {
		return animationId;
	}

	@Override
	public void setAnimationId(int animationId) {
		this.animationId = animationId;
	}

	@Override
	public int getAmbient() {
		return 0;
	}

	@Override
	public void setAmbient(int ambient) {

	}

	@Override
	public int getContrast() {
		return 0;
	}

	@Override
	public void setContrast(int contrast) {

	}

	@Override
	public short[] getRecolorFrom() {
		return new short[0];
	}

	@Override
	public void setRecolorFrom(short[] recolorFrom) {

	}

	@Override
	public short[] getRecolorTo() {
		return new short[0];
	}

	@Override
	public void setRecolorTo(short[] recolorTo) {

	}

	@Override
	public short[] getRetextureFrom() {
		return new short[0];
	}

	@Override
	public void setRetextureFrom(short[] retextureFrom) {

	}

	@Override
	public short[] getRetextureTo() {
		return new short[0];
	}

	@Override
	public void setRetextureTo(short[] retextureTo) {

	}

	@Override
	public void setIsRotated(boolean rotated) {

	}

	@Override
	public boolean getIsRotated() {
		return false;
	}

	@Override
	public void setClipped(boolean clipped) {

	}

	@Override
	public boolean getClipped() {
		return false;
	}

	@Override
	public void setMapSceneId(int mapSceneId) {

	}

	@Override
	public void setModelSizeX(int modelSizeX) {

	}

	@Override
	public int getModelSizeX() {
		return 0;
	}

	@Override
	public void setModelHeight(int modelHeight) {

	}

	@Override
	public void setModelSizeY(int modelSizeY) {

	}

	@Override
	public void setOffsetX(int modelSizeY) {

	}

	@Override
	public void setOffsetHeight(int offsetHeight) {

	}

	@Override
	public void setOffsetY(int offsetY) {

	}

	@Override
	public void setInt3(int int3) {

	}

	@Override
	public void setInt5(int int5) {

	}

	@Override
	public void setInt6(int int6) {

	}

	@Override
	public void setInt7(int int7) {

	}

	@Override
	public void setBoolean2(boolean boolean2) {

	}

	@Override
	public void setIsSolid(boolean isSolid) {

	}

	@Override
	public void setAmbientSoundId(int ambientSoundId) {

	}

	@Override
	public void setSoundEffectIds(int[] soundEffectIds) {

	}

	@Override
	public int[] getSoundEffectIds() {
		return new int[0];
	}

	public void setAmbientSoundIds(int[] soundEffectIds) {

	}

	public int[] getAmbientSoundIds() {
		return new int[0];
	}

	@Override
	public void setMapIconId(int mapIconId) {

	}

	@Override
	public void setBoolean3(boolean boolean3) {

	}

	@Override
	public void setTransformVarbit(int transformVarbit) {

	}

	@Override
	public int getTransformVarbit() {
		return 0;
	}

	@Override
	public void setTransformVarp(int transformVarp) {

	}

	@Override
	public int getTransformVarp() {
		return 0;
	}

	@Override
	public void setTransforms(int[] transforms) {

	}

	@Override
	public int[] getTransforms() {
		return transforms;
	}

	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId != -1 || this.ambientSoundIds != null;
		} else {
			for (int transform : this.transforms) {
				if (transform != -1) {
					ObjectDefinition var2 = lookup(transform);
					if (var2.ambientSoundId != -1 || var2.ambientSoundIds != null) {
						return true;
					}
				}
			}
			return false;
		}
	}

/*	public static Renderable getObjectModel(int type, int orientation, int[][] tilesHeight, int mean, int var17, int var18, Object reference) {
		Renderable obj;
		if(reference instanceof ObjectDefinition) {
//            System.out.println("fetching renderable for "+type);
			final int id = ((ObjectDefinition) reference).type;
//            obj = ObjectDefinition.lookup(id).modelAt(type, orientation, center, east, northEast, north, -1);
			obj = ((ObjectDefinition) reference).modelAt(type, orientation, tilesHeight, var17, mean, var18);
		} else
			obj = ((ObjectDefinition) reference).getEntity(type, orientation, tilesHeight, var17, mean, var18);
		return obj;
	}*/
}