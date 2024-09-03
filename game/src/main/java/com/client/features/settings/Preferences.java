package com.client.features.settings;


import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import com.client.Client;
import com.client.Configuration;
import com.client.Rasterizer3D;
import com.client.audio.StaticSound;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.builder.impl.NotificationTab;
import com.client.graphics.interfaces.impl.SettingsTabWidget;
import com.client.graphics.interfaces.impl.Slider;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import static com.client.Rasterizer3D.setBrightness;
import static com.client.graphics.interfaces.impl.SettingsTabWidget.*;
import static com.client.graphics.interfaces.impl.Slider.*;

public class Preferences implements net.runelite.api.Preferences {

    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(Preferences.class.getName());

    private static Preferences preferences = new Preferences();

    public static Preferences getPreferences() {
        return preferences;
    }

    public static void load() {
        try {
            File preferencesFile = new File(getFileLocation());
            if (preferencesFile.exists()) {
                ObjectNode node = new ObjectMapper().readValue(preferencesFile, ObjectNode.class);

                if (node.has("soundVolume")) {
                    preferences.soundVolume = node.get("soundVolume").intValue();
                    int value = preferences.soundVolume;
                    StaticSound.updateSoundEffectVolume((int) value);
                    setSliderValue(SOUND_SLIDER, value, SOUND);
                }
                if (node.has("areaSoundVolume")) {
                    preferences.areaSoundVolume = node.get("areaSoundVolume").intValue();
                    int value = preferences.areaSoundVolume;
                    StaticSound.updateAreaVolume((int) value);
                    setSliderValue(AREA_SOUND_SLIDER, value, AREA_SOUND);
                }
                if (node.has("musicVolume")) {
                    preferences.musicVolume = node.get("musicVolume").intValue();
                    int value = preferences.musicVolume;
                    StaticSound.updateMusicVolume((int) value);
                    setSliderValue(MUSIC_SLIDER, value, MUSIC);
                }
                if (node.has("brightness"))
                    preferences.brightness = node.get("brightness").doubleValue();
                if (node.has("screenWidth"))
                    preferences.screenWidth = node.get("screenWidth").intValue();
                if (node.has("screenHeight"))
                    preferences.screenHeight = node.get("screenHeight").intValue();
                if (node.has("dragTime"))
                    preferences.dragTime = node.get("dragTime").intValue();
                if (node.has("resized"))
                    preferences.resized = node.get("resized").booleanValue();
           /*     if (node.has("hidePetOptions"))
                    preferences.hidePetOptions = node.get("hidePetOptions").booleanValue();*/
                if (node.has("pmNotifications"))
                    preferences.pmNotifications = node.get("pmNotifications").booleanValue();
                if (node.has("mode1"))
                    preferences.fixed = node.get("mode1").booleanValue();
                if (node.has("groundItemTextShowMoreThan"))
                    preferences.groundItemTextShowMoreThan = node.get("groundItemTextShowMoreThan").textValue();
                if (node.has("groundItemTextShow"))
                    preferences.groundItemTextShow = node.get("groundItemTextShow").textValue();
                if (node.has("groundItemTextHide"))
                    preferences.groundItemTextHide = node.get("groundItemTextHide").textValue();
                if (node.has("groundItemAlwaysShowUntradables"))
                    preferences.groundItemAlwaysShowUntradables = node.get("groundItemAlwaysShowUntradables").booleanValue();
                if (node.has("musicEnabled"))
                    preferences.musicEnabled = node.get("musicEnabled").booleanValue();


            } else {
                save();
            }
        } catch (Exception e) {
            log.severe("Error while loading preferences.");
            e.printStackTrace();
        }
    }

    public static void setSliderValue(int widget, int val, int content) {
        RSInterface parent = RSInterface.get(widget);
        assert parent != null;
        if(parent.slider != null) {
            Slider slider = parent.slider;
            slider.setValue(val);
            slider.handleContent(content);
        }
    }

    public static void save() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(getFileLocation()), preferences);
        } catch (IOException e) {
            log.severe("Error while saving preferences.");
            e.printStackTrace();
        }
    }

    public static String getFileLocation() {
        return System.getProperty("user.home") + File.separator + Configuration.CLIENT_TITLE.toLowerCase() + "_properties.json";
    }

    public int soundVolume = 5;
    public int areaSoundVolume = 5;
    public int musicVolume = 5;
    public double brightness = 0.75;
    public Boolean fixed = true;
    public int screenWidth;
    public int screenHeight;
    public int dragTime = 5;
    public boolean hidePetOptions;
    public boolean pmNotifications;
    public String groundItemTextShowMoreThan = "";
    public String groundItemTextShow = "";
    public String groundItemTextHide = "";
    public boolean groundItemAlwaysShowUntradables;
    public boolean musicEnabled;
    public boolean resized = false;
    public Preferences() { }

    public void updateClientConfiguration() {
        // Brightness
        setBrightness(brightness);
        brightnessSlider.setValue(brightness);
        musicVolumeSlider.setValue(10 - musicVolume);
        soundVolumeSlider.setValue(10 - soundVolume);
        areaSoundVolumeSlider.setValue(10 - areaSoundVolume);
        interfaceCache.get(HIDE_LOCAL_PET_OPTIONS).active = hidePetOptions;
/*
        NotificationTab.instance.scrollable.update(">value", groundItemTextShowMoreThan);
        NotificationTab.instance.scrollable.update("show", groundItemTextShow);
        NotificationTab.instance.scrollable.update("hide", groundItemTextHide);
        NotificationTab.instance.scrollable.updateButtonText(NotificationTab.ALWAYS_SHOW_UNTRADABLES_BUTTON_ID);*/
    }


    @Override
    public String getRememberedUsername() {
        return null;
    }

    @Override
    public void setRememberedUsername(String username) {

    }

    @Override
    public int getSoundEffectVolume() {
        return soundVolume;
    }

    @Override
    public void setSoundEffectVolume(int volume) {
        this.soundVolume = volume;
    }

    @Override
    public int getAreaSoundEffectVolume() {
        return areaSoundVolume;
    }

    @Override
    public void setAreaSoundEffectVolume(int volume) {
        this.areaSoundVolume = volume;
    }

    @Override
    public boolean getHideUsername() {
        return false;
    }
}
