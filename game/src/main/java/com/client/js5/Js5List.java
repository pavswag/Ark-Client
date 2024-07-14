package com.client.js5;

import com.client.js5.disk.LocalArchive;
import com.client.js5.util.Js5ConfigType;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
public class Js5List {

    public static LocalArchive animations;

    public static LocalArchive skeletons;

    public static LocalArchive configs;

    public static LocalArchive interfaces;

    public static LocalArchive soundEffects;

    public static LocalArchive maps;

    public static LocalArchive musicTracks;

    public static LocalArchive models;

    public static LocalArchive sprites;

    public static LocalArchive textures;

    public static LocalArchive binary;

    public static LocalArchive musicJingles;

    public static LocalArchive clientScript;

    public static LocalArchive fonts;

    public static LocalArchive widgetSprites;

    public static LocalArchive musicSamples;

    public static LocalArchive musicPatches;

    public static LocalArchive archive17;

    public static LocalArchive worldmapGeography;

    public static LocalArchive worldmap;

    public static LocalArchive osrsSprites;

    public static LocalArchive worldmapGround;

    public static LocalArchive dbtableindex;

    public static HashMap<Js5ConfigType,Integer> configSizes = new HashMap<>();

    public static void initConfigSizes() {
        for (Js5ConfigType configType : Js5ConfigType.values()) {
            int size = 0;
            try {
                size = Js5List.configs.getGroupFileCount(configType);
            }catch (Exception ignored) {}
            configSizes.put(configType,size);
            log.info("{} read -> {}",configType.getName(),size);
        }
    }

    public static int getConfigSize(Js5ConfigType type) {
        return configSizes.get(type);
    }

}
