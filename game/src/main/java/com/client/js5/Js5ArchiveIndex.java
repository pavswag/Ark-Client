package com.client.js5;

public enum Js5ArchiveIndex {
    ANIMATIONS(0),
    SKELETONS(1),
    CONFIGS(2),
    INTERFACES(3),
    SOUNDEFFECTS(4),
    MAPS(5),
    MUSIC_TRACKS(6),
    MODELS(7),
    SPRITES(8),
    TEXTURES(9),
    BINARY(10),
    MUSIC_JINGLES(11),
    CLIENTSCRIPT(12),
    FONTS(13),
    MUSIC_SAMPLES(14),
    MUSIC_PATCHES(15),
    OSRS_SPRITES(16),
    ARCHIVE_17(17),
    WORLDMAP_GEOGRAPHY(18),
    WORLDMAP(19),
    WORLDMAP_GROUND(20),
    DBTABLEINDEX(21),
    WIDGET_SPRITES(22),
    DAT_IDX(25),

    ;

    private final int id;

    Js5ArchiveIndex(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
