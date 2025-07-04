package com.client;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import com.client.graphics.loaders.SpriteLoader;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;

import javax.imageio.ImageIO;

@Slf4j
public enum PlayerRights {

    PLAYER(0, "000000"),
    HELPER(11, "004080"),
    MODERATOR(1, "#DADADA", HELPER),
    ADMINISTRATOR(2, "F5FF0F", MODERATOR),
    STAFF_MANAGER(3, "4feb34", ADMINISTRATOR),
    UNKNOWN(4, "F5FF0F"),
    KRILLIN(5, "1B1ABC"), // $20 - Purple
    GOTEN(7, "118120", KRILLIN), // $50 - Green
    GOHAN(9, "6D0000", GOTEN), // $100 - Red
    CELL(17, "005C6D", GOHAN), // $250 - blue
    VEGETA(18, "4a4a4a", CELL), // $500 - black
    GOKU(32, "e38400", VEGETA), // $750 - orange
    GOGETTA(8, "e3bd00", GOKU), // $1000 - Yellow
    GOGETTA_SS(33, "ffffff", GOGETTA), // $1500 - White
    GOGETTA_SS2(34, "fb00ff", GOGETTA_SS), // $2000 - Transparent
    SS_BROLY(35, "2fff00", GOGETTA_SS2), // $3000 - Lime Green

    GUIDE_GURU(36, "4287f5", HELPER), //Guide Guru
    HITBOX(12, "437100"),
    IRONMAN(13, "3A3A3A"),
    ULTIMATE_IRONMAN(14, "717070"),
    YOUTUBER(15, "FE0018"),
    GAME_DEVELOPER(16, "eb9634", STAFF_MANAGER),
    OSRS(23, "437100"),
    OSRS_IRONMAN(31, "437100"),
    MEMBERSHIP(21, "437100"),
    ROGUE(25, "437100"),
    HC_IRONMAN(10, "60201f"),
    ROGUE_IRONMAN(26, "60201f"),
    ROGUE_HARDCORE_IRONMAN(27, "60201f"),
    GROUP_IRONMAN(28, "60201f"),
    EVENT_MAN(29, "60201f"),
    COMMUNITY_MANAGER(30, "8f8f8f", ADMINISTRATOR),
    WILDYMAN(93,"60201f"),
    HARDCORE_WILDYMAN(94, "60201f"),
    HEAD_ADMINISTRATOR(92, "f717ff", ADMINISTRATOR)
    ;

    /**
     * The level of rights that define this
     */
    private final int rightsId;

    /**
     * The rights inherited by this right
     */
    private final List<PlayerRights> inherited;

    /**
     * The color associated with the right
     */
    private final String color;

    /**
     * Creates a new right with a value to differentiate it between the others
     *
     * @param right the right required
     * @param color a color thats used to represent the players name when displayed
     * @param inherited the right or rights inherited with this level of right
     */
    PlayerRights(int right, String color, PlayerRights... inherited) {
        this.rightsId = right;
        this.inherited = Arrays.asList(inherited);
        this.color = color;
    }

    public boolean isStaffPosition() {
        return this == HELPER || this == ADMINISTRATOR || this == MODERATOR || this == STAFF_MANAGER || this == GAME_DEVELOPER || this == COMMUNITY_MANAGER || this == HEAD_ADMINISTRATOR;
    }

    public int spriteId() {
        return rightsId - 1;
    }

    public int crownId() {
        return rightsId;
    }

    public boolean hasCrown() {
        return this != PlayerRights.PLAYER;
    }

    public int getRightsId() {
        return rightsId;
    }

    public static final EnumSet[] DISPLAY_GROUPS = {
            EnumSet.of(HELPER, GUIDE_GURU, MODERATOR, ADMINISTRATOR, HEAD_ADMINISTRATOR, COMMUNITY_MANAGER, GAME_DEVELOPER, STAFF_MANAGER, UNKNOWN, KRILLIN, GOTEN, GOHAN, CELL, VEGETA, GOKU, GOGETTA,
                    GOGETTA_SS, GOGETTA_SS2, SS_BROLY, YOUTUBER),
            EnumSet.of(HITBOX, EVENT_MAN, IRONMAN, ULTIMATE_IRONMAN, OSRS,
                    OSRS_IRONMAN, MEMBERSHIP, HC_IRONMAN, ROGUE,
                    ROGUE_HARDCORE_IRONMAN, ROGUE_IRONMAN, GROUP_IRONMAN, WILDYMAN, HARDCORE_WILDYMAN)
    };

    public static PlayerRights forRightsValue(int rightsValue) {
        Optional<PlayerRights> rights = Arrays.stream(PlayerRights.values()).filter(right -> right.getRightsId() == rightsValue).findFirst();
        if (rights.isPresent()) {
            return rights.get();
        } else {
            System.err.println("No rights for value " + rightsValue);
            return PlayerRights.PLAYER;
        }
    }

    public Sprite getSprite() {
        Sprite sprite = (Sprite) sprites.get(StringUtils.longForName(name()));
        if(sprite == null) {
            String spritePath = findImagePath(name());
            if(spritePath != null) {
                if(spritePath.endsWith("gif")) {
                    sprite = SpriteLoader.fetchAnimatedSprite("/ranks/" + name() + ".gif").getInstance(13, 13);
                } else if (spritePath.endsWith("png")) {
                    try (InputStream inputStream = getClass().getResourceAsStream("/ranks/" + name() + ".png")) {
                        if (inputStream == null) {
                            log.warn("Resource not found: " + spritePath);
                            return null;
                        }
                        BufferedImage bufferedImage = ImageIO.read(inputStream);
                        sprite = new Sprite(bufferedImage);
                        if(sprite != null)
                            sprites.put(sprite, StringUtils.longForName(name()));
                    } catch (IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                } else {
                    throw new RuntimeException("Could not find player right sprite, found resource [" + spritePath + "]");
                }
            }
        }
        return sprite;
    }
    public String getResourcePath(String resource) {
        if (getClass().getResource(resource) != null) {
            return getClass().getResource(resource).toString();
        }
        return null;
    }
    public String findImagePath(String imageName) {
        String pngPath = getResourcePath("/ranks/" + imageName + ".png");
        if (pngPath != null) {
            return pngPath;
        }
        String gifPath = getResourcePath("/ranks/" + imageName + ".gif");
        if (gifPath != null) {
            return gifPath;
        }
        return null;
    }


    public static List<PlayerRights> getDisplayedRights(PlayerRights[] set) {
        List<PlayerRights> rights = new ArrayList<>();

        for (PlayerRights right : set) {
            if (DISPLAY_GROUPS[0].contains(right)) {
                rights.add(right);
                break; // Only displaying one crown from this group!
            }
        }

        for (PlayerRights right : set) {
            if (DISPLAY_GROUPS[1].contains(right)) {
                if (rights.size() < 3) {
                    rights.add(right);
                }
            }
        }

        return rights;
    }

    public static PlayerRights[] ordinalsToArray(int[] ordinals) {
        PlayerRights[] rights = new PlayerRights[ordinals.length];
        for (int index = 0; index < ordinals.length; index++) {
            rights[index] = PlayerRights.values()[ordinals[index]];
        }
        return rights;
    }

    public static Pair<Integer, PlayerRights[]> readRightsFromPacket(Buffer inStream) {
        int rightsAmount = inStream.readUnsignedByte();
        int[] ordinals = new int[rightsAmount];
        for (int right = 0; right < rightsAmount; right++) {
            ordinals[right] = inStream.readUnsignedByte();
        }
        return Pair.of(rightsAmount, PlayerRights.ordinalsToArray(ordinals));
    }

    public static boolean hasRightsOtherThan(PlayerRights[] rights, PlayerRights playerRight) {
        return Arrays.stream(rights).anyMatch(right -> right != playerRight);
    }

    public static boolean hasRights(PlayerRights[] rights, PlayerRights playerRights) {
        return Arrays.stream(rights).anyMatch(right -> right == playerRights);
    }

    public static boolean hasRightsLevel(PlayerRights[] rights, int rightsId) {
        return Arrays.stream(rights).anyMatch(right -> right.getRightsId() >= rightsId);
    }

    public static boolean hasRightsBetween(PlayerRights[] rights, int low, int high) {
        return Arrays.stream(rights).anyMatch(right -> right.getRightsId() > low && right.getRightsId() < high);
    }

    public static String buildCrownString(List<PlayerRights> rights) {
        return buildCrownString(rights.toArray(new PlayerRights[0]));
    }

    public static String buildCrownString(PlayerRights[] rights) {
        StringBuilder builder = new StringBuilder();
        for (PlayerRights right : rights) {
            if (right.hasCrown()) {
                builder.append("<rank=" + right.getRightsId() + ">");
            }
        }
        return builder.toString();
    }

    public static String buildCrownStringminus(PlayerRights[] rights) {
        StringBuilder builder = new StringBuilder();
        for (PlayerRights right : rights) {
            if (right.hasCrown()) {
                builder.append("<rank=" + right.getRightsId() + ">");
            }
        }
        return builder.toString();
    }


    public static EvictingDualNodeHashTable sprites = new EvictingDualNodeHashTable(100);

}
