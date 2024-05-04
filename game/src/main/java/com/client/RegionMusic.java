package com.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.*;

import net.runelite.api.Point;
import org.locationtech.jts.geom.Polygon;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegionMusic {

    private static RegionMusic[] regionMusic;

    public static void load() {
        Gson gson = new Gson();
        regionMusic = gson.fromJson(new InputStreamReader(RegionMusic.class.getResourceAsStream("/region_music.json")), RegionMusic[].class);
        System.out.println("Loaded [" + regionMusic.length + "] music regions.");
    }

    public static RegionMusic forPosition(int region) {
        for (RegionMusic song : regionMusic) {
            if (song.regionIds == null)
                continue;
            for (int id : song.regionIds) {
                if (id == region)
                    return song;
            }
        }
        return null;
    }

    private String name;
    private String hint;
    private int musicId;
    private int duration;
    private int[] regionIds;
    private boolean defaultLocked;
}