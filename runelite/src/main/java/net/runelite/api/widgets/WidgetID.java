/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api.widgets;

/**
 * Utility class mapping widget IDs to global constants.
 * <p>
 * The constants defined directly under the {@link WidgetID} class are
 * Widget group IDs. All child IDs are defined in sub-classes relating
 * to their group.
 * <p>
 * For a more direct group-child widget mapping, use the
 * {@link WidgetInfo} enum class.
 */
public final class WidgetID
{
	public static final int FAIRY_RING_PANEL_GROUP_ID = 100000;
	public static final int FAIRY_RING_GROUP_ID = 100001;
	public static final int LOGOUT_PANEL_ID = 100002;

	public static final int SHOP = 3900;
	public static final int PRICE_CHECKER = 18500;
	public static final int ITEMS_KEPT_ON_DEATH = 17110;
	public static final int ITEMS_LOST_ON_LOST = 17112;
	public static final int LOOTING_BAG_OPEN = 26706;
	public static final int LOOTING_BAG_DEPOIST = 26716;
	public static final int RUNE_POUCH_RUNES = 41710;
	public static final int RUNE_POUCH_INVENTORY = 41711;
	public static final int BANK_GROUP_1 = 50300;
	public static final int BANK_GROUP_2 = 50301;
	public static final int BANK_GROUP_3 = 50302;
	public static final int BANK_GROUP_4 = 50303;
	public static final int BANK_GROUP_5 = 50304;
	public static final int BANK_GROUP_6 = 50305;
	public static final int BANK_GROUP_7 = 50306;
	public static final int BANK_GROUP_8 = 50307;
	public static final int BANK_GROUP_9 = 50308;
	public static final int BANK_GROUP_10 = 50309;
	public static final int BANK_INVENTORY_GROUP_ID = 5064;
	public static final int INVENTORY_GROUP_ID = 3214;
	public static final int INVENTORY_BANK_ID = 5064;
	public static final int EQUIPMENT_GROUP_ID = 1688;
	public static final int EQUIPMENT_INVENTORY_GROUP_ID = 3214;

	public static final int BANK_GROUP_ID = 100003;
	public static final int GRAND_EXCHANGE_INVENTORY_GROUP_ID = 100005;
	public static final int GRAND_EXCHANGE_GROUP_ID = 100006;
	public static final int DEPOSIT_BOX_GROUP_ID = 100007;
	public static final int PLAYER_TRADE_SCREEN_GROUP_ID = 100008;
	public static final int PLAYER_TRADE_INVENTORY_GROUP_ID = 100009;
	public static final int FRIENDS_LIST_GROUP_ID = 100010;
	public static final int IGNORE_LIST_GROUP_ID = 100011;
	public static final int RAIDING_PARTY_GROUP_ID = 100012;
	public static final int EMOTES_GROUP_ID = 100016;
	public static final int RUNE_POUCH_GROUP_ID = 100017;
	public static final int ACHIEVEMENT_DIARY_GROUP_ID = 100018;
	public static final int PEST_CONTROL_BOAT_GROUP_ID = 100019;
	public static final int PEST_CONTROL_GROUP_ID = 100020;
	public static final int FRIENDS_CHAT_GROUP_ID = 100021;
	public static final int MINIMAP_GROUP_ID = 100022;
	public static final int LOGIN_CLICK_TO_PLAY_GROUP_ID = 100023;
	public static final int CLUE_SCROLL_GROUP_ID = 100024;
	public static final int FIXED_VIEWPORT_GROUP_ID = 548;
	public static final int RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX_GROUP_ID = 161;
	public static final int RESIZABLE_VIEWPORT_BOTTOM_LINE_GROUP_ID = 100025;
	public static final int PRAYER_GROUP_ID = 100026;
	public static final int QUICK_PRAYERS_GROUP_ID = 100027;
	public static final int SHOP_GROUP_ID = 100028;
	public static final int SHOP_INVENTORY_GROUP_ID = 100029;
	public static final int SMITHING_GROUP_ID = 100030;
	public static final int GUIDE_PRICES_GROUP_ID = 100031;
	public static final int GUIDE_PRICES_INVENTORY_GROUP_ID = 100032;
	public static final int COMBAT_GROUP_ID = 5858;
	public static final int DIALOG_NPC_GROUP_ID = 100034;
	public static final int SLAYER_REWARDS_GROUP_ID = 100035;
	public static final int PRIVATE_CHAT = 100036;
	public static final int CHATBOX_GROUP_ID = 100037;
	public static final int VOLCANIC_MINE_GROUP_ID = 100038;
	public static final int BA_ATTACKER_GROUP_ID = 100039;
	public static final int BA_COLLECTOR_GROUP_ID = 100040;
	public static final int BA_DEFENDER_GROUP_ID = 100041;
	public static final int BA_HEALER_GROUP_ID = 100042;
	public static final int BA_REWARD_GROUP_ID = 100043;
	public static final int BA_TEAM_GROUP_ID = 100044;
	public static final int LEVEL_UP_GROUP_ID = 100045;
	public static final int DIALOG_SPRITE_GROUP_ID = 100046;
	public static final int QUEST_COMPLETED_GROUP_ID = 100047;
	public static final int CLUE_SCROLL_REWARD_GROUP_ID = 100048;
	public static final int BARROWS_REWARD_GROUP_ID = 100049;
	public static final int RAIDS_GROUP_ID = 100050;
	public static final int TOB_GROUP_ID = 100051;
	public static final int MOTHERLODE_MINE_GROUP_ID = 100052;
	public static final int EXPERIENCE_DROP_GROUP_ID = 100053;
	public static final int PUZZLE_BOX_GROUP_ID = 100054;
	public static final int LIGHT_BOX_GROUP_ID = 100055;
	public static final int NIGHTMARE_ZONE_GROUP_ID = 100056;
	public static final int NIGHTMARE_PILLAR_HEALTH_GROUP_ID = 100057;
	public static final int BLAST_FURNACE_GROUP_ID = 100058;
	public static final int WORLD_MAP_GROUP_ID = 100059;
	public static final int PYRAMID_PLUNDER_GROUP_ID = 100060;
	public static final int CHAMBERS_OF_XERIC_REWARD_GROUP_ID = 100061;
	public static final int THEATRE_OF_BLOOD_REWARD_GROUP_ID = 100062;
	public static final int EXPERIENCE_TRACKER_GROUP_ID = 100063;
	public static final int TITHE_FARM_GROUP_ID = 100064;
	public static final int KINGDOM_GROUP_ID = 100065;
	public static final int BARROWS_GROUP_ID = 100066;
	public static final int BLAST_MINE_GROUP_ID = 100067;
	public static final int MTA_ALCHEMY_GROUP_ID = 100068;
	public static final int MTA_ENCHANTMENT_GROUP_ID = 100069;
	public static final int MTA_GRAVEYARD_GROUP_ID = 100070;
	public static final int MTA_TELEKINETIC_GROUP_ID = 100071;
	public static final int CORP_DAMAGE = 100072;
	public static final int DESTROY_ITEM_GROUP_ID = 100073;
	public static final int VARROCK_MUSEUM_QUIZ_GROUP_ID = 100074;
	public static final int KILL_LOGS_GROUP_ID = 100075;
	public static final int DIARY_QUEST_GROUP_ID = 100076;
	public static final int THEATRE_OF_BLOOD_GROUP_ID = 100077;
	public static final int WORLD_SWITCHER_GROUP_ID = 100078;
	public static final int DIALOG_OPTION_GROUP_ID = 100079;
	public static final int DIALOG_PLAYER_GROUP_ID = 100080;
	public static final int DRIFT_NET_FISHING_REWARD_GROUP_ID = 100081;
	public static final int FOSSIL_ISLAND_OXYGENBAR_ID = 100082;
	public static final int MINIGAME_TAB_ID = 100083;
	public static final int SPELLBOOK_GROUP_ID = 100084;
	public static final int PVP_GROUP_ID = 100085;
	public static final int FISHING_TRAWLER_GROUP_ID = 100086;
	public static final int FISHING_TRAWLER_REWARD_GROUP_ID = 100087;
	public static final int ZEAH_MESS_HALL_GROUP_ID = 100088;
	public static final int KOUREND_FAVOUR_GROUP_ID = 100089;
	public static final int LOOTING_BAG_GROUP_ID = 100090;
	public static final int SKOTIZO_GROUP_ID = 100091;
	public static final int ENTERING_HOUSE_GROUP_ID = 100092;
	public static final int FULLSCREEN_CONTAINER_TLI = 100093;
	public static final int QUESTLIST_GROUP_ID = 100094;
	public static final int SKILLS_GROUP_ID = 100095;
	public static final int MUSIC_GROUP_ID = 100096;
	public static final int BARROWS_PUZZLE_GROUP_ID = 100097;
	public static final int KEPT_ON_DEATH_GROUP_ID = 100098;
	public static final int GUIDE_PRICE_GROUP_ID = 100099;
	public static final int SEED_VAULT_INVENTORY_GROUP_ID = 100100;
	public static final int BEGINNER_CLUE_MAP_CHAMPIONS_GUILD = 100101;
	public static final int BEGINNER_CLUE_MAP_VARROCK_EAST_MINE = 100102;
	public static final int BEGINNER_CLUE_MAP_DRAYNOR = 100103;
	public static final int BEGINNER_CLUE_MAP_NORTH_OF_FALADOR = 100104;
	public static final int BEGINNER_CLUE_MAP_WIZARDS_TOWER = 100105;
	public static final int SEED_BOX_GROUP_ID = 100106;
	public static final int SEED_VAULT_GROUP_ID = 100107;
	public static final int EXPLORERS_RING_ALCH_GROUP_ID = 100108;
	public static final int SETTINGS_SIDE_GROUP_ID = 100109;
	public static final int SETTINGS_GROUP_ID = 100110;
	public static final int GWD_KC_GROUP_ID = 100111;
	public static final int LMS_GROUP_ID = 100112;
	public static final int LMS_INGAME_GROUP_ID = 100113;
	public static final int ADVENTURE_LOG_ID = 100114;
	public static final int COLLECTION_LOG_ID = 100115;
	public static final int GENERIC_SCROLL_GROUP_ID = 100116;
	public static final int GAUNTLET_TIMER_GROUP_ID = 100117;
	public static final int HALLOWED_SEPULCHRE_TIMER_GROUP_ID = 100118;
	public static final int BANK_PIN_GROUP_ID = 100119;
	public static final int HEALTH_OVERLAY_BAR_GROUP_ID = 100120;
	public static final int CHAMBERS_OF_XERIC_STORAGE_UNIT_PRIVATE_GROUP_ID = 100121;
	public static final int CHAMBERS_OF_XERIC_STORAGE_UNIT_SHARED_GROUP_ID = 100122;
	public static final int CHAMBERS_OF_XERIC_STORAGE_UNIT_INVENTORY_GROUP_ID = 100123;
	public static final int DUEL_INVENTORY_GROUP_ID = 100124;
	public static final int DUEL_INVENTORY_OTHER_GROUP_ID = 100125;
	public static final int TRAILBLAZER_AREAS_GROUP_ID = 100126;
	public static final int DIALOG_MINIGAME_GROUP_ID = 100127;
	public static final int PEST_CONTROL_EXCHANGE_WINDOW_GROUP_ID = 100128;
	public static final int GAUNTLET_MAP_GROUP_ID = 100129;
	public static final int PLAYER_TRADE_CONFIRM_GROUP_ID = 100130;
	public static final int OPTIONS_GROUP_ID = 100131;
	public static final int JEWELLERY_BOX_GROUP_ID = 100132;
	public static final int EQUIPMENT_PAGE_GROUP_ID = 100133;
	public static final int QUESTTAB_GROUP_ID = 100134;
	public static final int MUSICTAB_GROUP_ID = 100135;
	public static final int FOSSIL_ISLAND_MUSHROOM_TELE_GROUP_ID = 100136;
	public static final int THEATRE_OF_BLOOD_PARTY_GROUP_ID = 100137;
	public static final int DIALOG_NOTIFICATION_GROUP_ID = 100138;
	public static final int DIALOG_SPRITE2_ID = 100139;
	public static final int MULTISKILL_MENU_GROUP_ID = 100140;
	public static final int TEMPOROSS_GROUP_ID = 100141;
	public static final int CLAN_GROUP_ID = 100142;
	public static final int CLAN_GUEST_GROUP_ID = 100143;
	public static final int GRAVESTONE_GROUP_ID = 100144;
	public static final int POH_TREASURE_CHEST_INVENTORY_GROUP_ID = 100145;
	public static final int GROUP_IRON_GROUP_ID = 100146;
	public static final int GROUP_STORAGE_GROUP_ID = 100147;

	static class WorldMap
	{
		static final int MAPVIEW = 7;
		static final int OVERVIEW_MAP = 10;
		static final int BOTTOM_BAR = 23;
		static final int SEARCH = 26;
		static final int SURFACE_SELECTOR = 34;
		static final int TOOLTIP = 41;
	}

	static class SlayerRewards
	{
		static final int TOP_BAR = 12;
	}

	static class DialogOption
	{
		static final int OPTIONS = 1;
	}

	static class DialogNPC
	{
		static final int HEAD_MODEL = 6;
		static final int NAME = 3;
		static final int TEXT = 5;
	}

	static class DialogPlayer
	{
		static final int NAME = 3;
		static final int TEXT = 5;
		static final int HEAD_MODEL = 6;
	}

	static class LogoutPanel
	{
		static final int WORLD_SWITCHER_BUTTON = 3;
		static final int LOGOUT_BUTTON = 6;
	}

	static class PestControl
	{
		static final int KNIGHT_INFO_CONTAINER = 2;

		static final int ACTIVITY_SHIELD_CONTAINER = 9;
		static final int ACTIVITY_BAR = 10;
		static final int ACTIVITY_PROGRESS = 12;

		static final int PURPLE_SHIELD = 13;
		static final int BLUE_SHIELD = 14;
		static final int YELLOW_SHIELD = 15;
		static final int RED_SHIELD = 16;

		static final int PURPLE_ICON = 17;
		static final int BLUE_ICON = 18;
		static final int YELLOW_ICON = 19;
		static final int RED_ICON = 20;

		static final int PURPLE_HEALTH = 21;
		static final int BLUE_HEALTH = 22;
		static final int YELLOW_HEALTH = 23;
		static final int RED_HEALTH = 24;
	}

	static class FriendList
	{
		static final int TITLE = 3;
		static final int FULL_CONTAINER = 5;
		static final int SORT_BY_NAME_BUTTON = 7;
		static final int SORT_BY_LAST_WORLD_CHANGE_BUTTON = 8;
		static final int SORT_BY_WORLD_BUTTON = 9;
		static final int LEGACY_SORT_BUTTON = 10;
		static final int NAMES_CONTAINER = 11;
		static final int SCROLL_BAR = 12;
		static final int LOADING_TEXT = 13;
		static final int PREVIOUS_NAME_HOLDER = 18;
	}

	static class IgnoreList
	{
		static final int TITLE = 3;
		static final int FULL_CONTAINER = 5;
		static final int SORT_BY_NAME_BUTTON = 7;
		static final int LEGACY_SORT_BUTTON = 8;
		static final int NAMES_CONTAINER = 9;
		static final int SCROLL_BAR = 10;
		static final int LOADING_TEXT = 11;
		static final int PREVIOUS_NAME_HOLDER = 16;
	}

	static class FriendsChat
	{
		static final int ROOT = 0;
		static final int TITLE = 1;
		static final int OWNER = 2;
		static final int LIST = 12;
	}

	static class Bank
	{
		static final int BANK_CONTAINER = 1;
		static final int INVENTORY_ITEM_CONTAINER = 3;
		static final int BANK_TITLE_BAR = 3;
		static final int TUTORIAL_BUTTON = 4;
		static final int ITEM_COUNT_TOP = 5;
		static final int ITEM_COUNT_BAR = 6;
		static final int ITEM_COUNT_BOTTOM = 7;
		static final int GROUP_STORAGE_BUTTON = 8;
		static final int CONTENT_CONTAINER = 10;
		static final int TAB_CONTAINER = 11;
		static final int ITEM_CONTAINER = 13;
		static final int SCROLLBAR = 14;
		static final int SEARCH_BUTTON_BACKGROUND = 40;
		static final int DEPOSIT_INVENTORY = 42;
		static final int DEPOSIT_EQUIPMENT = 44;
		static final int INCINERATOR = 46;
		static final int INCINERATOR_CONFIRM = 47;
		static final int EQUIPMENT_CONTENT_CONTAINER = 69;
		static final int SETTINGS_BUTTON = 112;
		static final int EQUIPMENT_BUTTON = 113;
	}

	static class GroupStorage
	{
		static final int ITEM_CONTAINER = 10;
	}

	static class GrandExchange
	{
		static final int WINDOW_CONTAINER = 0;
		static final int WINDOW_BORDERS = 2;
		static final int HISTORY_BUTTON = 3;
		static final int BACK_BUTTON = 4;
		static final int OFFER1 = 7;
		static final int OFFER2 = 8;
		static final int OFFER3 = 9;
		static final int OFFER4 = 10;
		static final int OFFER5 = 11;
		static final int OFFER6 = 12;
		static final int OFFER7 = 13;
		static final int OFFER8 = 14;
		static final int OFFER_CONTAINER = 25;
		static final int OFFER_DESCRIPTION = 26;
		static final int OFFER_PRICE = 27;
		static final int OFFER_CONFIRM_BUTTON = 29;
	}

	static class GrandExchangeInventory
	{
		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class DepositBox
	{
		static final int INVENTORY_ITEM_CONTAINER = 2;
	}

	static class Shop
	{
		static final int ITEMS_CONTAINER = 2;
		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class Smithing
	{
		static final int INVENTORY_ITEM_CONTAINER = 0;

		static final int QTY_1 = 3;
		static final int QTY_5 = 4;
		static final int QTY_10 = 5;
		static final int QTY_X = 6;
		static final int QTY_ALL = 7;

		static final int DAGGER = 9;
		static final int SWORD = 10;
		static final int SCIMITAR = 11;
		static final int LONG_SWORD = 12;
		static final int TWO_H_SWORD = 13;
		static final int AXE = 14;
		static final int MACE = 15;
		static final int WARHAMMER = 16;
		static final int BATTLE_AXE = 17;
		static final int CLAWS = 18;
		static final int CHAIN_BODY = 19;
		static final int PLATE_LEGS = 20;
		static final int PLATE_SKIRT = 21;
		static final int PLATE_BODY = 22;
		static final int NAILS = 23;
		static final int MED_HELM = 24;
		static final int FULL_HELM = 25;
		static final int SQ_SHIELD = 26;
		static final int KITE_SHIELD = 27;
		static final int EXCLUSIVE1 = 28;
		static final int DART_TIPS = 29;
		static final int ARROW_HEADS = 30;
		static final int KNIVES = 31;
		static final int EXCLUSIVE2 = 32;
		static final int JAVELIN_HEADS = 33;
		static final int BOLTS = 34;
		static final int LIMBS = 35;
	}

	static class GuidePrices
	{
		static final int ITEM_CONTAINER = 2;
		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class Equipment
	{
		static final int HELMET = 15;
		static final int CAPE = 16;
		static final int AMULET = 17;
		static final int WEAPON = 18;
		static final int BODY = 19;
		static final int SHIELD = 20;
		static final int LEGS = 21;
		static final int GLOVES = 22;
		static final int BOOTS = 23;
		static final int RING = 24;
		static final int AMMO = 25;

		static final int INVENTORY_ITEM_CONTAINER = 0;
	}

	static class Emotes
	{
		static final int EMOTE_WINDOW = 0;
		static final int EMOTE_CONTAINER = 1;
		static final int EMOTE_SCROLLBAR = 2;
	}

	static class Cluescroll
	{
		static final int CLUE_TEXT = 2;
		static final int CLUE_SCROLL_ITEM_CONTAINER = 3;
	}

	static class Minimap
	{
		static final int XP_ORB = 1;
		static final int HEALTH_ORB = 2;
		static final int PRAYER_ORB = 13;
		static final int QUICK_PRAYER_ORB = 15; // Has the "Quick-prayers" name
		static final int PRAYER_ORB_TEXT = 16;
		static final int RUN_ORB = 21;
		static final int TOGGLE_RUN_ORB = 23; // Has the "Toggle run" name
		static final int RUN_ORB_TEXT = 24;
		static final int SPEC_ORB = 29;
		static final int SPEC_CLICKBOX = 31;
		static final int WORLDMAP_ORB = 43;
		static final int WIKI_BANNER_PARENT = 44;
		static final int WIKI_BANNER = 45;
		static final int WORLDMAP_OPTIONS = 48;
	}

	static class LoginClickToPlayScreen
	{
		static final int MESSAGE_OF_THE_DAY = 7;
	}

	static class FixedViewport
	{
		static final int MINIMAP = 8;
		static final int MINIMAP_DRAW_AREA = 21;
		static final int FIXED_VIEWPORT = 32;
		static final int MULTICOMBAT_INDICATOR = 36;
		static final int FRIENDS_CHAT_TAB = 46;
		static final int FRIENDS_TAB = 48;
		static final int IGNORES_TAB = 47;
		static final int LOGOUT_TAB = 49;
		static final int OPTIONS_TAB = 50;
		static final int EMOTES_TAB = 51;
		static final int MUSIC_TAB = 52;
		static final int FRIENDS_CHAT_ICON = 53;
		static final int FRIENDS_ICON = 55;
		static final int IGNORES_ICON = 54;
		static final int LOGOUT_ICON = 56;
		static final int OPTIONS_ICON = 57;
		static final int EMOTES_ICON = 58;
		static final int MUSIC_ICON = 59;
		static final int COMBAT_TAB = 62;
		static final int STATS_TAB = 63;
		static final int QUESTS_TAB = 64;
		static final int INVENTORY_TAB = 65;
		static final int EQUIPMENT_TAB = 66;
		static final int PRAYER_TAB = 67;
		static final int MAGIC_TAB = 68;
		static final int COMBAT_ICON = 69;
		static final int STATS_ICON = 70;
		static final int QUESTS_ICON = 71;
		static final int INVENTORY_ICON = 72;
		static final int EQUIPMENT_ICON = 73;
		static final int PRAYER_ICON = 74;
		static final int MAGIC_ICON = 75;
		static final int ROOT_INTERFACE_CONTAINER = 16;
		static final int BANK_CONTAINER = 77;
		static final int INTERFACE_CONTAINER = 78;
		static final int INVENTORY_CONTAINER = 82;
	}

	static class ResizableViewport
	{
		static final int RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX = 15;
		static final int MULTICOMBAT_INDICATOR = 19;
		static final int MINIMAP = 93;
		static final int MINIMAP_DRAW_AREA = 29;
		static final int MINIMAP_ORB_HOLDER = 32;
		static final int FRIENDS_CHAT_TAB = 42;
		static final int IGNORES_TAB = 43;
		static final int FRIENDS_TAB = 44;
		static final int LOGOUT_TAB = 45;
		static final int OPTIONS_TAB = 46;
		static final int EMOTES_TAB = 47;
		static final int MUSIC_TAB = 48;
		static final int FRIENDS_CHAT_ICON = 49;
		static final int FRIENDS_ICON = 51;
		static final int IGNORES_ICON = 50;
		static final int LOGOUT_ICON = 52;
		static final int OPTIONS_ICON = 53;
		static final int EMOTES_ICON = 54;
		static final int MUSIC_ICON = 55;
		static final int COMBAT_TAB = 58;
		static final int STATS_TAB = 59;
		static final int QUESTS_TAB = 60;
		static final int INVENTORY_TAB = 61;
		static final int EQUIPMENT_TAB = 62;
		static final int PRAYER_TAB = 63;
		static final int MAGIC_TAB = 64;
		static final int COMBAT_ICON = 65;
		static final int STATS_ICON = 66;
		static final int QUESTS_ICON = 67;
		static final int INVENTORY_ICON = 68;
		static final int EQUIPMENT_ICON = 69;
		static final int PRAYER_ICON = 70;
		static final int MAGIC_ICON = 71;
		static final int INTERFACE_CONTAINER = 72;
		static final int INVENTORY_CONTAINER = 78;
	}

	static class ResizableViewportBottomLine
	{
		static final int RESIZABLE_VIEWPORT_BOTTOM_LINE = 15;
		static final int MINIMAP = 90;
		static final int MINIMAP_DRAW_AREA = 29;
		static final int MINIMAP_ORB_HOLDER = 32;
		static final int LOGOUT_BUTTON_OVERLAY = 33;
		static final int MINIMAP_LOGOUT_BUTTON = 34;
		static final int FC_ICON = 43;
		static final int FRIEND_ICON = 45;
		static final int SETTINGS_ICON = 46;
		static final int EMOTE_ICON = 47;
		static final int MUSIC_ICON = 48;
		static final int INVENTORY_TAB = 54;
		static final int PRAYER_TAB = 56;
		static final int MAGIC_TAB = 57;
		static final int CMB_ICON = 58;
		static final int SKILLS_ICON = 59;
		static final int QUESTS_ICON = 60;
		static final int INVENTORY_ICON = 61;
		static final int EQUIP_ICON = 62;
		static final int PRAYER_ICON = 63;
		static final int MAGIC_ICON = 64;
		static final int INTERFACE_CONTAINER = 69;
		static final int INVENTORY_CONTAINER = 75;
	}

	static class Chatbox
	{
		static final int PARENT = 0;
		static final int BUTTONS = 1;
		static final int TAB_ALL = 4;
		static final int TAB_GAME = 7;
		static final int TAB_PUBLIC = 11;
		static final int TAB_PRIVATE = 15;
		static final int TAB_CHANNEL = 19;
		static final int TAB_CLAN = 23;
		static final int TAB_TRADE = 27;
		static final int REPORT_TEXT = 33;
		static final int FRAME = 34;
		static final int TRANSPARENT_BACKGROUND = 35;
		static final int CONTAINER = 37;
		static final int TITLE = 41;
		static final int FULL_INPUT = 42;
		static final int GE_SEARCH_RESULTS = 50;
		static final int MESSAGES = 53;
		static final int TRANSPARENT_BACKGROUND_LINES = 54;
		static final int INPUT = 55;
		static final int MESSAGE_LINES = 56;
		static final int FIRST_MESSAGE = 57;
	}

	static class Prayer
	{
		static final int THICK_SKIN = 5;
		static final int BURST_OF_STRENGTH = 6;
		static final int CLARITY_OF_THOUGHT = 7;
		static final int SHARP_EYE = 23;
		static final int MYSTIC_WILL = 24;
		static final int ROCK_SKIN = 8;
		static final int SUPERHUMAN_STRENGTH = 9;
		static final int IMPROVED_REFLEXES = 10;
		static final int RAPID_RESTORE = 11;
		static final int RAPID_HEAL = 12;
		static final int PROTECT_ITEM = 13;
		static final int HAWK_EYE = 25;
		static final int MYSTIC_LORE = 26;
		static final int STEEL_SKIN = 14;
		static final int ULTIMATE_STRENGTH = 15;
		static final int INCREDIBLE_REFLEXES = 16;
		static final int PROTECT_FROM_MAGIC = 17;
		static final int PROTECT_FROM_MISSILES = 18;
		static final int PROTECT_FROM_MELEE = 19;
		static final int EAGLE_EYE = 27;
		static final int MYSTIC_MIGHT = 28;
		static final int RETRIBUTION = 20;
		static final int REDEMPTION = 21;
		static final int SMITE = 22;
		static final int PRESERVE = 33;
		static final int CHIVALRY = 29;
		static final int PIETY = 30;
		static final int RIGOUR = 31;
		static final int AUGURY = 32;
	}

	public static class QuickPrayer
	{
		static final int PRAYERS = 4;

		public static final int THICK_SKIN_CHILD_ID = 0;
		public static final int BURST_OF_STRENGTH_CHILD_ID = 1;
		public static final int CLARITY_OF_THOUGHT_CHILD_ID = 2;
		public static final int SHARP_EYE_CHILD_ID = 18;
		public static final int MYSTIC_WILL_CHILD_ID = 19;
		public static final int ROCK_SKIN_CHILD_ID = 3;
		public static final int SUPERHUMAN_STRENGTH_CHILD_ID = 4;
		public static final int IMPROVED_REFLEXES_CHILD_ID = 5;
		public static final int RAPID_RESTORE_CHILD_ID = 6;
		public static final int RAPID_HEAL_CHILD_ID = 7;
		public static final int PROTECT_ITEM_CHILD_ID = 8;
		public static final int HAWK_EYE_CHILD_ID = 20;
		public static final int MYSTIC_LORE_CHILD_ID = 21;
		public static final int STEEL_SKIN_CHILD_ID = 9;
		public static final int ULTIMATE_STRENGTH_CHILD_ID = 10;
		public static final int INCREDIBLE_REFLEXES_CHILD_ID = 11;
		public static final int PROTECT_FROM_MAGIC_CHILD_ID = 12;
		public static final int PROTECT_FROM_MISSILES_CHILD_ID = 13;
		public static final int PROTECT_FROM_MELEE_CHILD_ID = 14;
		public static final int EAGLE_EYE_CHILD_ID = 22;
		public static final int MYSTIC_MIGHT_CHILD_ID = 23;
		public static final int RETRIBUTION_CHILD_ID = 15;
		public static final int REDEMPTION_CHILD_ID = 16;
		public static final int SMITE_CHILD_ID = 17;
		public static final int PRESERVE_CHILD_ID = 28;
		public static final int CHIVALRY_CHILD_ID = 25;
		public static final int PIETY_CHILD_ID = 26;
		public static final int RIGOUR_CHILD_ID = 24;
		public static final int AUGURY_CHILD_ID = 27;
	}

	static class Combat
	{
		static final int WEAPON_NAME = 1;
		static final int LEVEL = 3;
		static final int STYLE_ONE = 4;
		static final int STYLE_TWO = 8;
		static final int STYLE_THREE = 12;
		static final int STYLE_FOUR = 16;
		static final int SPELLS = 20;
		static final int DEFENSIVE_SPELL_BOX = 21;
		static final int DEFENSIVE_SPELL_ICON = 23;
		static final int DEFENSIVE_SPELL_SHIELD = 24;
		static final int DEFENSIVE_SPELL_TEXT = 25;
		static final int SPELL_BOX = 26;
		static final int SPELL_ICON = 28;
		static final int SPELL_TEXT = 29;
		static final int AUTO_RETALIATE = 30;
		static final int SPECIAL_ATTACK_BAR = 34;
		static final int SPECIAL_ATTACK_CLICKBOX = 36;
		static final int TOOLTIP = 41;
	}

	static class VolcanicMine
	{
		static final int STABILITY_INFOBOX_CONTAINER = 2;
		static final int TIME_LEFT = 6;
		static final int POINTS = 8;
		static final int STABILITY = 10;
		static final int PLAYER_COUNT = 12;
		static final int VENT_A_PERCENTAGE = 16;
		static final int VENT_B_PERCENTAGE = 17;
		static final int VENT_C_PERCENTAGE = 18;
		static final int VENT_A_STATUS = 20;
		static final int VENT_B_STATUS = 21;
		static final int VENT_C_STATUS = 22;
		static final int VENTS_INFOBOX_CONTAINER = 26;
	}

	static class BarbarianAssault
	{
		static class ATK
		{
			static final int ROLE_SPRITE = 11;
			static final int ROLE = 12;
		}

		static class HLR
		{
			static final int TEAMMATES = 13;
			static final int TEAMMATE1 = 18;
			static final int TEAMMATE2 = 22;
			static final int TEAMMATE3 = 26;
			static final int TEAMMATE4 = 30;
		}

		static final int TEAM = 2;

		static final int ROLE_SPRITE = 10;
		static final int ROLE = 11;

		static final int REWARD_TEXT = 57;
	}

	static class LevelUp
	{
		static final int SKILL = 1;
		static final int LEVEL = 2;
		static final int CONTINUE = 3;
	}

	static class QuestCompleted
	{
		static final int NAME_TEXT = 4;
	}

	static class Raids
	{
		static final int POINTS_INFOBOX = 3;
	}

	static class Tob
	{
		static final int PARTY_INTERFACE = 5;
		static final int PARTY_STATS = 7;
		static final int HEALTHBAR_CONTAINER = 9;
	}

	static class PuzzleBox
	{
		static final int VISIBLE_BOX = 4;
	}

	static class LightBox
	{
		static final int LIGHT_BOX = 1;
		static final int LIGHT_BOX_WINDOW = 2;
		static final int LIGHT_BULB_CONTAINER = 3;
		static final int LIGHT_BOX_BUTTON_CONTAINER = 6;
		static final int BUTTON_A = 8;
		static final int BUTTON_B = 9;
		static final int BUTTON_C = 10;
		static final int BUTTON_D = 11;
		static final int BUTTON_E = 12;
		static final int BUTTON_F = 13;
		static final int BUTTON_G = 14;
		static final int BUTTON_H = 15;
	}

	static class DialogSprite
	{
		static final int SPRITE = 1;
		static final int TEXT = 2;
	}

	static class ExperienceTracker
	{
		static final int WIDGET = 4;
		static final int BOTTOM_BAR = 16;
	}

	static class FairyRingPanel
	{
		static final int HEADER = 2;
		static final int LIST = 7;
		static final int FAVORITES = 8;
		static final int SEPARATOR = 9;
		static final int SCROLLBAR = 152;
	}

	static class FairyRing
	{
		static final int LEFT_ORB_CLOCKWISE = 19;
		static final int LEFT_ORB_COUNTER_CLOCKWISE = 20;
		static final int MIDDLE_ORB_CLOCKWISE = 21;
		static final int MIDDLE_ORB_COUNTER_CLOCKWISE = 22;
		static final int RIGHT_ORB_CLOCKWISE = 23;
		static final int RIGHT_ORB_COUNTER_CLOCKWISE = 24;
		static final int TELEPORT_BUTTON = 26;
	}

	static class FairyRingCode
	{
		static final int FAIRY_QUEEN_HIDEOUT = 139;
	}

	static class Barrows
	{
		static final int BARROWS_BROTHERS = 4;
		static final int BARROWS_POTENTIAL = 5;
	}

	static class Diary
	{
		static final int DIARY_TITLE = 2;
		static final int DIARY_TEXT = 3;
	}

	static class DestroyItem
	{
		static final int DESTROY_ITEM_NAME = 6;
		static final int DESTROY_ITEM_YES = 1;
		static final int DESTROY_ITEM_NO = 3;
	}

	static class VarrockMuseum
	{
		static final int VARROCK_MUSEUM_QUESTION = 28;
		static final int VARROCK_MUSEUM_FIRST_ANSWER = 29;
		static final int VARROCK_MUSEUM_SECOND_ANSWER = 30;
		static final int VARROCK_MUSEUM_THIRD_ANSWER = 31;
	}

	static class KillLog
	{
		static final int TITLE = 3;
		static final int MONSTER = 13;
		static final int KILLS = 14;
		static final int STREAK = 15;
	}

	static class WorldSwitcher
	{
		static final int CONTAINER = 1;
		static final int WORLD_LIST = 16;
		static final int LOGOUT_BUTTON = 23;
	}

	static class Minigames
	{
		static final int TELEPORT_BUTTON = 26;
	}

	public static class StandardSpellBook
	{
		static final int LUMBRIDGE_HOME_TELEPORT = 5;
		public static final int KOUREND_HOME_TELEPORT = 4;
	}

	static class AncientSpellBook
	{
		static final int EDGEVILLE_HOME_TELEPORT = 99;
	}

	static class LunarSpellBook
	{
		static final int LUNAR_HOME_TELEPORT = 100;
	}

	static class ArceuusSpellBook
	{
		static final int ARCEUUS_HOME_TELEPORT = 144;
	}

	static class Pvp
	{
		static final int KILLDEATH_RATIO = 26;
		static final int WILDERNESS_SKULL_CONTAINER = 44;
		static final int SKULL_CONTAINER = 45;
		static final int SAFE_ZONE = 47;
		static final int WILDERNESS_LEVEL = 50; // this can also be the Deadman Mode "Protection" text
	}

	static class KourendFavour
	{
		static final int KOUREND_FAVOUR_OVERLAY = 1;
	}

	static class Zeah
	{
		static final int MESS_HALL_COOKING_DISPLAY = 2;
	}

	static class LootingBag
	{
		static final int LOOTING_BAG_INVENTORY = 5;
	}

	static class Skotizo
	{
		static final int CONTAINER = 2;
	}

	static class QuestList
	{
		static final int BOX = 0;
		static final int SCROLLBAR = 4;
		static final int CONTAINER = 5;
		static final int FREE_CONTAINER = 6;
		static final int MEMBERS_CONTAINER = 7;
		static final int MINIQUEST_CONTAINER = 8;
	}

	static class Music
	{
		static final int CONTAINER = 0;
		static final int LIST = 3;
		static final int SCROLLBAR = 4;
	}

	static class Barrows_Puzzle
	{
		static final int PARENT = 0;
		static final int SEQUENCE_1 = 3;
		static final int ANSWER1_CONTAINER = 12;
		static final int ANSWER1 = 13;
		static final int ANSWER2_CONTAINER = 14;
		static final int ANSWER2 = 15;
		static final int ANSWER3_CONTAINER = 16;
		static final int ANSWER3 = 17;
	}

	static class SeedVault
	{
		static final int INVENTORY_ITEM_CONTAINER = 1;
		static final int TITLE_CONTAINER = 2;
		static final int ITEM_CONTAINER = 15;
		static final int ITEM_TEXT = 16;
	}

	static class ExplorersRing
	{
		static final int INVENTORY = 7;
	}

	static class SettingsSide
	{
		static final int CAMERA_ZOOM_SLIDER_TRACK = 100;
		static final int MUSIC_SLIDER = 29;
		static final int SOUND_EFFECT_SLIDER = 43;
		static final int AREA_SOUND_SLIDER = 57;
	}

	static class Settings
	{
		static final int INIT = 1;
	}

	static class AchievementDiary
	{
		static final int CONTAINER = 2;
	}

	static class Skills
	{
		static final int CONTAINER = 0;
	}

	static class Lms
	{
		static final int INFO = 2;
	}

	static class LmsKDA
	{
		static final int INFO = 4;
	}

	static class AdventureLog
	{
		static final int CONTAINER = 0;
	}

	static class CollectionLog
	{
		static final int CONTAINER = 0;
		static final int TABS = 3;
		static final int ENTRY = 17;
		static final int ENTRY_HEADER = 19;
		static final int ENTRY_ITEMS = 36;
	}

	static class GenericScroll
	{
		static final int TEXT = 7;
	}

	static class GauntletTimer
	{
		static final int CONTAINER = 2;
	}

	static class HallowedSepulchreTimer
	{
		static final int CONTAINER = 2;
	}

	// Also used for many other interfaces!
	static class BankPin
	{
		static final int CONTAINER = 0;
		static final int TOP_LEFT_TEXT = 2;
		static final int FIRST_ENTERED = 3;
		static final int SECOND_ENTERED = 4;
		static final int THIRD_ENTERED = 5;
		static final int FOURTH_ENTERED = 6;
		static final int INSTRUCTION_TEXT = 10;
		static final int EXIT_BUTTON = 13;
		static final int FORGOT_BUTTON = 15;
		static final int BUTTON_1 = 16;
		static final int BUTTON_2 = 18;
		static final int BUTTON_3 = 20;
		static final int BUTTON_4 = 22;
		static final int BUTTON_5 = 24;
		static final int BUTTON_6 = 26;
		static final int BUTTON_7 = 28;
		static final int BUTTON_8 = 30;
		static final int BUTTON_9 = 32;
		static final int BUTTON_10 = 34;
	}

	static class TrailblazerAreas
	{
		static final int TELEPORT = 59;
	}

	static class TemporossStatus
	{
		static final int STATUS_INDICATOR = 2;
	}

	static class DialogNotification
	{
		static final int TEXT = 0;
		static final int CONTINUE = 1;
	}

	static class PestControlExchangeWindow
	{
		static final int ITEM_LIST = 2;
		static final int BOTTOM = 5;
		static final int POINTS = 8;
		static final int CONFIRM_BUTTON = 6;
	}

	static class MinigameDialog
	{
		static final int TEXT = 1;
		static final int CONTINUE = 2;
	}

	static class TheatreOfBlood
	{
		static final int RAIDING_PARTY = 9;
		static final int ORB_BOX = 10;
		static final int BOSS_HEALTH_BAR = 35;
	}

	static class TheatreOfBloodParty
	{
		static final int CONTAINER = 10;
	}

	static class EquipmentWidgetIdentifiers
	{
		static final int EQUIP_YOUR_CHARACTER = 3;
		static final int STAB_ATTACK_BONUS = 24;
		static final int SLASH_ATTACK_BONUS = 25;
		static final int CRUSH_ATTACK_BONUS = 26;
		static final int MAGIC_ATTACK_BONUS = 27;
		static final int RANGED_ATTACK_BONUS = 28;
		static final int STAB_DEFENCE_BONUS = 30;
		static final int SLASH_DEFENCE_BONUS = 31;
		static final int CRUSH_DEFENCE_BONUS = 32;
		static final int MAGIC_DEFENCE_BONUS = 33;
		static final int RANGED_DEFENCE_BONUS = 34;
		static final int MELEE_STRENGTH = 36;
		static final int RANGED_STRENGTH = 37;
		static final int MAGIC_DAMAGE = 38;
		static final int PRAYER_BONUS = 39;
		static final int UNDEAD_DAMAGE_BONUS = 41;
		static final int SLAYER_DAMAGE_BONUS = 42;
		static final int WEIGHT = 49;
	}

	static class FossilMushroomTeleport
	{
		static final int ROOT = 2;
		static final int HOUSE_ON_HILL = 4;
		static final int VERDANT_VALLEY = 8;
		static final int SWAMP = 12;
		static final int MUSHROOM_MEADOW = 16;
	}

	static class SpellBook
	{
		static final int FILTERED_SPELLS_BOUNDS = 3;
		static final int TOOLTIP = 189;

		// NORMAL SPELLS
		static final int LUMBRIDGE_HOME_TELEPORT = 5;
		static final int WIND_STRIKE = 6;
		static final int CONFUSE = 7;
		static final int ENCHANT_CROSSBOW_BOLT = 8;
		static final int WATER_STRIKE = 9;
		static final int LVL_1_ENCHANT = 10;
		static final int EARTH_STRIKE = 11;
		static final int WEAKEN = 12;
		static final int FIRE_STRIKE = 13;
		static final int BONES_TO_BANANAS = 14;
		static final int WIND_BOLT = 15;
		static final int CURSE = 16;
		static final int BIND = 17;
		static final int LOW_LEVEL_ALCHEMY = 18;
		static final int WATER_BOLT = 19;
		static final int VARROCK_TELEPORT = 20;
		static final int LVL_2_ENCHANT = 21;
		static final int EARTH_BOLT = 22;
		static final int LUMBRIDGE_TELEPORT = 23;
		static final int TELEKINETIC_GRAB = 24;
		static final int FIRE_BOLT = 25;
		static final int FALADOR_TELEPORT = 26;
		static final int CRUMBLE_UNDEAD = 27;
		static final int TELEPORT_TO_HOUSE = 28;
		static final int WIND_BLAST = 29;
		static final int SUPERHEAT_ITEM = 30;
		static final int CAMELOT_TELEPORT = 31;
		static final int WATER_BLAST = 32;
		static final int LVL_3_ENCHANT = 33;
		static final int IBAN_BLAST = 34;
		static final int SNARE = 35;
		static final int MAGIC_DART = 36;
		static final int ARDOUGNE_TELEPORT = 37;
		static final int EARTH_BLAST = 38;
		static final int HIGH_LEVEL_ALCHEMY = 39;
		static final int CHARGE_WATER_ORB = 40;
		static final int LVL_4_ENCHANT = 41;
		static final int WATCHTOWER_TELEPORT = 42;
		static final int FIRE_BLAST = 43;
		static final int CHARGE_EARTH_ORB = 44;
		static final int BONES_TO_PEACHES = 45;
		static final int SARADOMIN_STRIKE = 46;
		static final int CLAWS_OF_GUTHIX = 47;
		static final int FLAMES_OF_ZAMORAK = 48;
		static final int TROLLHEIM_TELEPORT = 49;
		static final int WIND_WAVE = 50;
		static final int CHARGE_FIRE_ORB = 51;
		static final int TELEPORT_TO_APE_ATOLL = 52;
		static final int WATER_WAVE = 53;
		static final int CHARGE_AIR_ORB = 54;
		static final int VULNERABILITY = 55;
		static final int LVL_5_ENCHANT = 56;
		static final int TELEPORT_TO_KOUREND = 57;
		static final int EARTH_WAVE = 58;
		static final int ENFEEBLE = 59;
		static final int TELEOTHER_LUMBRIDGE = 60;
		static final int FIRE_WAVE = 61;
		static final int ENTANGLE = 62;
		static final int STUN = 63;
		static final int CHARGE = 64;
		static final int WIND_SURGE = 65;
		static final int TELEOTHER_FALADOR = 66;
		static final int WATER_SURGE = 67;
		static final int TELE_BLOCK = 68;
		static final int BOUNTY_TARGET_TELEPORT = 69;
		static final int LVL_6_ENCHANT = 70;
		static final int TELEOTHER_CAMELOT = 71;
		static final int EARTH_SURGE = 72;
		static final int LVL_7_ENCHANT = 73;
		static final int FIRE_SURGE = 74;

		// ANCIENT SPELLS
		static final int ICE_RUSH = 75;
		static final int ICE_BLITZ = 76;
		static final int ICE_BURST = 77;
		static final int ICE_BARRAGE = 78;
		static final int BLOOD_RUSH = 79;
		static final int BLOOD_BLITZ = 80;
		static final int BLOOD_BURST = 81;
		static final int BLOOD_BARRAGE = 82;
		static final int SMOKE_RUSH = 83;
		static final int SMOKE_BLITZ = 84;
		static final int SMOKE_BURST = 85;
		static final int SMOKE_BARRAGE = 86;
		static final int SHADOW_RUSH = 87;
		static final int SHADOW_BLITZ = 88;
		static final int SHADOW_BURST = 89;
		static final int SHADOW_BARRAGE = 90;
		static final int PADDEWWA_TELEPORT = 91;
		static final int SENNTISTEN_TELEPORT = 92;
		static final int KHARYRLL_TELEPORT = 93;
		static final int LASSAR_TELEPORT = 94;
		static final int DAREEYAK_TELEPORT = 95;
		static final int CARRALLANGER_TELEPORT = 96;
		static final int ANNAKARL_TELEPORT = 97;
		static final int GHORROCK_TELEPORT = 98;
		static final int EDGEVILLE_HOME_TELEPORT = 99;

		// LUNAR SPELLS
		static final int LUNAR_HOME_TELEPORT = 100;
		static final int BAKE_PIE = 101;
		static final int CURE_PLANT = 102;
		static final int MONSTER_EXAMINE = 103;
		static final int NPC_CONTACT = 104;
		static final int CURE_OTHER = 105;
		static final int HUMIDIFY = 106;
		static final int MOONCLAN_TELEPORT = 107;
		static final int TELE_GROUP_MOONCLAN = 108;
		static final int CURE_ME = 109;
		static final int HUNTER_KIT = 110;
		static final int WATERBIRTH_TELEPORT = 111;
		static final int TELE_GROUP_WATERBIRTH = 112;
		static final int CURE_GROUP = 113;
		static final int STAT_SPY = 114;
		static final int BARBARIAN_TELEPORT = 115;
		static final int TELE_GROUP_BARBARIAN = 116;
		static final int SUPERGLASS_MAKE = 117;
		static final int TAN_LEATHER = 118;
		static final int KHAZARD_TELEPORT = 119;
		static final int TELE_GROUP_KHAZARD = 120;
		static final int DREAM = 121;
		static final int STRING_JEWELLERY = 122;
		static final int STAT_RESTORE_POT_SHARE = 123;
		static final int MAGIC_IMBUE = 124;
		static final int FERTILE_SOIL = 125;
		static final int BOOST_POTION_SHARE = 126;
		static final int FISHING_GUILD_TELEPORT = 127;
		static final int TELE_GROUP_FISHING_GUILD = 128;
		static final int PLANK_MAKE = 129;
		static final int CATHERBY_TELEPORT = 130;
		static final int TELE_GROUP_CATHERBY = 131;
		static final int RECHARGE_DRAGONSTONE = 132;
		static final int ICE_PLATEAU_TELEPORT = 133;
		static final int TELE_GROUP_ICE_PLATEAU = 134;
		static final int ENERGY_TRANSFER = 135;
		static final int HEAL_OTHER = 136;
		static final int VENGEANCE_OTHER = 137;
		static final int VENGEANCE = 138;
		static final int HEAL_GROUP = 139;
		static final int SPELLBOOK_SWAP = 140;
		static final int GEOMANCY = 141;
		static final int SPIN_FLAX = 142;
		static final int OURANIA_TELEPORT = 143;

		// ARCEUUS SPELLS
		static final int ARCEUUS_HOME_TELEPORT = 144;
		static final int BASIC_REANIMATION = 145;
		static final int ARCEUUS_LIBRARY_TELEPORT = 146;
		static final int ADEPT_REANIMATION = 147;
		static final int EXPERT_REANIMATION = 148;
		static final int MASTER_REANIMATION = 149;
		static final int DRAYNOR_MANOR_TELEPORT = 150;
		static final int MIND_ALTAR_TELEPORT = 152;
		static final int RESPAWN_TELEPORT = 153;
		static final int SALVE_GRAVEYARD_TELEPORT = 154;
		static final int FENKENSTRAINS_CASTLE_TELEPORT = 155;
		static final int WEST_ARDOUGNE_TELEPORT = 156;
		static final int HARMONY_ISLAND_TELEPORT = 157;
		static final int CEMETERY_TELEPORT = 158;
		static final int RESURRECT_CROPS = 159;
		static final int BARROWS_TELEPORT = 160;
		static final int APE_ATOLL_TELEPORT = 161;
		static final int BATTLEFRONT_TELEPORT = 162;
		static final int INFERIOR_DEMONBANE = 163;
		static final int SUPERIOR_DEMONBANE = 164;
		static final int DARK_DEMONBANE = 165;
		static final int MARK_OF_DARKNESS = 166;
		static final int GHOSTLY_GRASP = 167;
		static final int SKELETAL_GRASP = 168;
		static final int UNDEAD_GRASP = 169;
		static final int WARD_OF_ARCEUUS = 170;
		static final int LESSER_CORRUPTION = 171;
		static final int GREATER_CORRUPTION = 172;
		static final int DEMONIC_OFFERING = 173;
		static final int SINISTER_OFFERING = 174;
		static final int DEGRIME = 175;
		static final int SHADOW_VEIL = 176;
		static final int VILE_VIGOUR = 177;
		static final int DARK_LURE = 178;
		static final int DEATH_CHARGE = 179;
		static final int RESURRECT_LESSER_GHOST = 180;
		static final int RESURRECT_LESSER_SKELETON = 181;
		static final int RESURRECT_LESSER_ZOMBIE = 182;
		static final int RESURRECT_SUPERIOR_GHOST = 183;
		static final int RESURRECT_SUPERIOR_SKELETON = 184;
		static final int RESURRECT_SUPERIOR_ZOMBIE = 185;
		static final int RESURRECT_GREATER_GHOST = 186;
		static final int RESURRECT_GREATER_SKELETON = 187;
		static final int RESURRECT_GREATER_ZOMBIE = 188;
	}

	static class DialogSprite2
	{
		static final int SPRITE1 = 1;
		static final int TEXT = 2;
		static final int SPRITE2 = 3;
		static final int CONTINUE = 4;
	}

	static class QuestTab
	{
		static final int QUEST_TAB = 3;
	}

	public static class TradeScreen
	{
		public static final int FIRST_TRADING_WITH = 31;
		public static final int SECOND_ACCEPT_FUNC = 13;
		public static final int SECOND_DECLINE_FUNC = 14;
		public static final int SECOND_MY_OFFER = 23;
		public static final int SECOND_THEIR_OFFER = 24;
		public static final int SECOND_ACCEPT_TEXT = 25;
		public static final int SECOND_DECLINE_TEXT = 26;
		public static final int SECOND_MY_ITEMS = 28;
		public static final int SECOND_THEIR_ITEMS = 29;
		public static final int SECOND_TRADING_WITH = 30;
	}

	public static class DuelConfig
	{
		public static final int CONFIG_GROUP_IP = 482;
		public static final int TITLE = 35;
		public static final int OPPONENT_ATT = 9;
		public static final int OPPONENT_STR = 13;
		public static final int OPPONENT_DEF = 17;
		public static final int OPPONENT_HP = 21;
	}

	public static class DuelResult
	{
		public static final int RESULT_GROUP_ID = 372;
		public static final int TITLE = 16;
		public static final int TOTAL_STAKED = 32;
		public static final int TOTAL_TAX = 39;
		public static final int WINNINGS = 40;
	}

	static class JewelBox
	{
		static final int DUEL_RING = 2;
		static final int GAME_NECK = 3;
		static final int COMB_BRAC = 4;
		static final int SKIL_NECK = 5;
		static final int RING_OFGP = 6;
		static final int AMUL_GLOR = 7; // yes
	}

	static class Options
	{
		static final int CAMERA_ZOOM_SLIDER_HANDLE = 15;
		static final int MUSIC_SLIDER = 37;
		static final int SOUND_EFFECT_SLIDER = 43;
		static final int AREA_SOUND_SLIDER = 49;
	}

	static class GauntletMap
	{
		static final int CONTAINER = 4;
	}

	static class Clan
	{
		static final int LAYER = 0;
		static final int HEADER = 1;
		static final int MEMBERS = 6;
	}

	static class ClanGuest
	{
		static final int LAYER = 0;
		static final int HEADER = 1;
		static final int MEMBERS = 6;
	}
}