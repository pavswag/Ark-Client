package com.client;

import com.client.connection.Connection;

import java.time.LocalDateTime;

public class Configuration {

	/**
	 * Client version is a number that will tell the server whether
	 * the player has the most up-to-date client, otherwise they
	 * will receive an error on login to update their client.
	 */
	public static final int CLIENT_VERSION = 37;

	public static boolean LOCALHOST = false;

	/**
	 * Cache version is written to the cache folder inside a version file.
	 * This is read on startup to tell if the cache is out of date or not.
	 */
	public static final int CACHE_VERSION = 16; // Set this to the same value, v0.030 = 30, v1.120 = 1120 -- LIVE Server = 13
	public static final String CACHE_LINK = "https://turmoilrsps.quest/cache.7z";

	/**
	 * The server version. The cache path is append with a _v1/2/3 etc for the version number
	 * to prevent overwriting older version caches.
	 * This should only be changed when a new server is launched, otherwise change {@link Configuration#CLIENT_VERSION}.
	 */


	public static boolean SAVE_ACCOUNTS = true;
	public static final String CLIENT_TITLE = "kyros";
	public static final String WEBSITE = "https://deadscapeps.quest";
	public static World CONNECTION = null;
	public static final String DEV_CACHE_NAME = "local_cache";

	public static final String CUSTOM_ITEM_SPRITES_DIRECTORY = "item_sprites/";

	public static boolean developerMode = false;
	public static boolean dumpDataLists = false;
	public static boolean newFonts; // TODO text offsets (i.e. spacing between characters) are incorrect, needs automatic fix from kourend


	public static final LocalDateTime LAUNCH_TIME = LocalDateTime.now();
	public static final String ERROR_LOG_DIRECTORY = "error_logs/";
	public static String ERROR_LOG_FILE = ("error_log_"
			+ LAUNCH_TIME.getYear() + "_"
			+ LAUNCH_TIME.getMonth() + "_"
			+ LAUNCH_TIME.getDayOfMonth()
			+ ".txt").toLowerCase();

	/**
	 * Attack option priorities 0 -> Depends on combat level 1 -> Always right-click
	 * 2 -> Left-click where available 3 -> Hidden
	 */
	public static int playerAttackOptionPriority;
	public static int npcAttackOptionPriority = 2;

	public static final boolean DUMP_SPRITES = false;
	public static final boolean PRINT_EMPTY_INTERFACE_SECTIONS = true;

	public static boolean playerNames = true;
	public static boolean npcNames = false;
	public static boolean skillOrbs = false;

	/**
	 * Seasonal Events
	 */
	public static boolean HALLOWEEN;
	public static boolean CHRISTMAS;
	public static boolean CHRISTMAS_EVENT;
	public static boolean EASTER;

	public static boolean osbuddyGameframe;

	public static int xpPosition;
	public static boolean escapeCloseInterface;
	public static boolean alwaysLeftClickAttack;
	public static boolean hideCombatOverlay;

	public final static int GOLD = 0xffc600;
	public final static int SILVER = 0xC0C0C0;
	public final static int BRONZE = 0xcd7f32;
	public final static int YELLOW = 0xffff01;
    public static int areaSoundEffectVolume = 127;
	public static int soundEffectVolume = 127;
	public static int musicVolume = 127;
	public static boolean disableLoginScreenMusic = true;
}