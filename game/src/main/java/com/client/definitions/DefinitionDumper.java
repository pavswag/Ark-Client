package com.client.definitions;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.client.*;
import com.client.graphics.textures.Texture;
import com.client.sign.Signlink;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;

import javax.imageio.ImageIO;

public class DefinitionDumper {
    private static final boolean dumpModels = false;
    private static final boolean dumpMaps = false;

    private static final boolean dumpRegions = true;

    private static final boolean dumpTextures = false;
    private static final boolean dumpSprites = false;
    private static List<Integer> customModels = new ArrayList<>();
    private static int widgetSpriteId = 0;
    public static void dumpDefs() {
        if(dumpSprites) {
            File base = new File(Signlink.getCacheDirectory() + "sprites/");
            dumpSprite(base);
            toJson(SpriteCache.spriteMap, "./temp/widget-sprites.json");
        }
        //dumpItems();
        if (Configuration.dumpDataLists) {
            dumpCustomItems();
            moveCustomModels();
            dumpItems();
            dumpCustomObjects();
            moveCustomModels();
            dumpCustomNpcs();
            moveCustomModels();
            dumpNpcs();
        }
        if(dumpTextures) {
            for(int i = 0; i < Client.instance.getTextureProvider().getTextures().length; i++) {
                int[] pixels = null;
                try {
                    pixels = Client.instance.getTextureProvider().load(i);
                } catch (Exception e) {
                    continue;
                }
                if(pixels == null)
                    continue;
                Texture texture = (Texture) Client.instance.getTextureProvider().getTextures()[i];

                toJson(texture, "./temp/textures/" + i + ".json");
            }
        }

        if(dumpRegions) {
            //start();
            regionsToDumpAndConvert.forEach(regionID -> {
                File parent = new File("./temp/maps/" + regionID + "/");
                if(parent.exists())
                    parent.mkdirs();
                int landscape = -1;
                int loc = -1;
                if(mapIndices1 != null) {
                    for (int i = 0; i < mapIndices1.length; i++) {
                        if (mapIndices1[i] == regionID) {
                            landscape = mapIndices2[i];
                            loc = mapIndices3[i];
                        }
                    }
                }
                int regionX = regionID >> 8;
                int regionY = regionID & 255;
                if(landscape != -1 && loc != -1) {
                    System.out.println("--");
                    System.out.println("Region[" + regionID + "]");
                    System.out.println("Original files = [" + landscape + "/" + loc + "]");
                    String name = "_" + regionX + "_" + regionY;
                    System.out.println("New names:");
                    System.out.println("l" + name);
                    System.out.println("m" + name);
                    File source=new File("./temp/index4/" + landscape  +".gz");
                    File destination=new File("./temp/maps/l" + name + ".gz");
                    try {
                        FileUtils.copyFile(source, destination);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    source=new File("./temp/index4/" + loc  +".gz");
                    destination=new File("./temp/maps/m" + name + ".gz");
                    try {
                        FileUtils.copyFile(source, destination);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    String name = "_" + regionX + "_" + regionY;
                    System.out.println("New names for [" + regionID + "]");
                    System.out.println("l" + name);
                    System.out.println("m" + name);
                }
            });
            if(mapIndices2 != null) {
                for (int i = 0; i < mapIndices2.length; i++) {
                    if (mapIndices2[i] == 1 || mapIndices3[i] == 1) {
                        System.out.println("Map files point to region [" + mapIndices1[i] + "]");
                    }
                }
            }
        }
    }
    
    public static int[] mapIndices1;
    public static int[] mapIndices2;
    public static int[] mapIndices3;

    @SneakyThrows
    public static void start() {
        byte[] fileData = FileArchive.getBytesFromFile(new File("./temp/map_index"));
        Buffer stream = new Buffer(fileData);
        int length = stream.readUShort();
        mapIndices1 = new int[length];
        mapIndices2 = new int[length];
        mapIndices3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            mapIndices1[i2] = stream.readUShort();
            mapIndices2[i2] = stream.readUShort();
            mapIndices3[i2] = stream.readUShort();
        }
    }
    private static int spriteId = 5607;

    public static void dumpCustomText() {
        for(int i = 126; i <= 161; i++) {
            System.out.println("Dumping texture " + i);
            dumpCustomTexture(i);
        }
        spriteId = 5607;
        System.exit(0);
    }
    public static void dumpCustomTexture(int id) {
        Texture texture = new Texture();
        texture.fileIds = new int[] {spriteId};
        texture.averageRGB = 26715;
        texture.field2441 = new int[] { 137 };
        texture.isTransparent = true;
        texture.animationDirection = 1;
        texture.animationSpeed = 2;
        toJson(texture, "./temp/textures/" + id + ".json");
        spriteId++;
    }
    @SneakyThrows
    private static void dumpSprite(File file) {
        for(File f : file.listFiles()) {
            if(f.isDirectory()) {
                dumpSprite(f);
            } else {
                if(f.getName().contains(".png")) {
                    SpriteCache.spriteMap.put(widgetSpriteId, f.getAbsolutePath().substring(f.getAbsolutePath().indexOf("sprites") + 8).replace(".png", ""));
                    FileUtils.copyFile(f, new File("./temp/widget-sprites/" + widgetSpriteId + ".png"));
                    widgetSpriteId++;
                    System.out.println("Processed Sprite [" + f.getAbsolutePath().substring(f.getAbsolutePath().indexOf("sprites") + 8) + "]");
                }
            }
        }
    }
    private static List<Integer> regionsToDumpAndConvert = List.of(
    );
    public static void moveCustomModels() {
        customModels.forEach(model -> {
            File map = new File("./temp/index1/" + model + ".gz");
            if(map.exists()) {
                try {
                    Files.move(map.toPath(), Paths.get("./temp/custom_models/" + model + ".gz"), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Moved model " + model);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        customModels.clear();
    }
    public static void dumpNpcs() {
        Map<Integer, Npc> npcs = new HashMap<>();
        for (int i = 0; i < 100_000; i++) {
            try {
                NpcDefinition def = NpcDefinition.lookup(i);
                if (def != null) {
                    npcs.put(i, new Npc(def.name, def.combatLevel, def.size));
                }
            } catch (Exception e) {
            }
        }
        toJson(npcs, "./temp/npc_definitions.json");
    }
    public static void dumpCustomNpcs() {
        for(int i = 0; i < NpcDefinition.totalAmount; i++) {
            NpcDefinition npcDefinition = NpcDefinition.lookup(i);
            if(npcDefinition == null)
                continue;
            if(npcDefinition.custom) {
                if(npcDefinition.name == null || npcDefinition.name.equalsIgnoreCase("null"))
                    continue;
                String fileName = i + "-" + RSFont.removeOldSyntax(npcDefinition.name).replace("\\", "-").replace("/", "-");
                if(fileName.contains(">")) {
                    fileName = fileName.substring(fileName.indexOf(">") + 1);
                }
                fileName = fileName.replace("<-col>", "");

                fileName = fileName.trim();

                System.out.println("Dumping npc " + fileName);
                toJson(npcDefinition, "./temp/npcs/" + fileName + ".json");

                if(npcDefinition.models != null) {
                    for(int model: npcDefinition.models) {
                        customModels.add(model);
                    }
                }
            }
        }
    }
    public static void dumpCustomObjects() {
        for(int i = 0; i < ObjectDefinition.totalObjects; i++) {
            ObjectDefinition objectDefinition = ObjectDefinition.lookup(i);
            if(objectDefinition == null)
                continue;
            if(objectDefinition.custom) {
                if(objectDefinition.name == null || objectDefinition.name.equalsIgnoreCase("null"))
                    continue;
                String fileName = i + "-" + RSFont.removeOldSyntax(objectDefinition.name).replace("\\", "-").replace("/", "-");
                if(fileName.contains(">")) {
                    fileName = fileName.substring(fileName.indexOf(">") + 1);
                }

                System.out.println("Dumping object " + fileName);
                toJson(objectDefinition, "./temp/objects/" + fileName + ".json");

                if(objectDefinition.objectModels != null)
                    for(int model: objectDefinition.objectModels)
                        customModels.add(model);
            }
        }
    }
    public static void dumpCustomItems() {
        for(int i = 0; i < ItemDefinition.totalItems; i++) {
            ItemDefinition itemDefinition = ItemDefinition.lookup(i);
            if(itemDefinition == null)
                continue;
            if(itemDefinition.custom) {
                if(itemDefinition.name == null || itemDefinition.name.equalsIgnoreCase("null"))
                    continue;
                String fileName = i + "-" + RSFont.removeOldSyntax(itemDefinition.name).replace("\\", "-").replace("/", "-");
                if(fileName.contains(">")) {
                    fileName = fileName.substring(fileName.indexOf(">") + 1);
                }

                System.out.println("Dumping item " + fileName);
                toJson(itemDefinition, "./temp/items/" + fileName + ".json");

                if(itemDefinition.inventoryModel != -1)
                    customModels.add(itemDefinition.inventoryModel);
                if(itemDefinition.maleModel0 != -1)
                    customModels.add(itemDefinition.maleModel0);
                if(itemDefinition.maleModel1 != -1)
                    customModels.add(itemDefinition.maleModel1);
                if(itemDefinition.femaleModel0 != -1)
                    customModels.add(itemDefinition.femaleModel0);
                if(itemDefinition.femaleModel1 != -1)
                    customModels.add(itemDefinition.femaleModel1);
            }
        }
    }
    public static void dumpItems() {
        ItemDefinition[] itemDefinitions = new ItemDefinition[ItemDefinition.totalItems];
        for(int i = 0; i < ItemDefinition.totalItems; i++) {
            ItemDefinition definition = ItemDefinition.lookup(i);
            if(definition == null || definition.getName() == null)
                continue;
            itemDefinitions[i] = definition;
            toJson(definition, "./temp/items/" + i + "-" + definition.getName().replace("/", "_") + ".json");
        }
        toJson(itemDefinitions, "./temp/item_definitions.json");
    }

    @SneakyThrows
    private static <T> void toJson(T t, String filePath) {
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(t);
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(filePath));
        bw.write(prettyJson);
        bw.flush();
        bw.close();
    }

    private static class Npc {
        private final String name;
        private final int combatLevel;
        private final int size;

        public Npc(String name, int combatLevel, int size) {
            this.name = name;
            this.combatLevel = combatLevel;
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public int getCombatLevel() {
            return combatLevel;
        }

        public int getSize() {
            return size;
        }
    }


    public static void dumpLocalPlayerImage() {

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
        Model model = Client.localPlayer.getRotatedModel();

        int zoom2d = 575;
        int xan2d = 50;
        int zan2d = 25;
        int yan2d = 65;


        Sprite enabledSprite = new Sprite(150, 150);
        Rasterizer3D.world = false;
        Rasterizer3D.aBoolean1464 = false;
        Rasterizer2D.initDrawingArea(150, 150, enabledSprite.pixels);
        Rasterizer3D.useViewport();
        int k3 = (int) (zoom2d * 1.6D);

        int l3 = Rasterizer3D.SINE[xan2d] * k3 >> 16;
        int i4 = Rasterizer3D.COSINE[xan2d] * k3 >> 16;
        Rasterizer3D.renderOnGpu = true;
        model.renderModel(yan2d, zan2d, xan2d, 45,
                l3 + model.modelBaseY / 2, i4);

        Rasterizer3D.aBoolean1464 = true;
        Rasterizer3D.world = true;
        Rasterizer2D.initDrawingArea(height, width, pixels);
        Rasterizer2D.setDrawingArea(vp_bottom, vp_left, vp_right, vp_top);
        Rasterizer3D.originViewX = centerX;
        Rasterizer3D.originViewY = centerY;
        Rasterizer3D.scanOffsets = lineOffsets;
        Rasterizer3D.aBoolean1464 = true;
        Rasterizer3D.world = true;
        dumpImage(enabledSprite, "myPlayer-" + System.currentTimeMillis());
    }
    /**
     * Dumps a sprite with the specified name.
     * @param name
     * @param image
     */
    public static void dumpImage(Sprite image, String name) {
        File directory = new File(Signlink.getCacheDirectory() + "sprite_dump/");
        if (!directory.exists()) {
            directory.mkdir();
        }
        BufferedImage bi = new BufferedImage(image.width, image.height, BufferedImage.TYPE_INT_RGB);
        bi.setRGB(0, 0, image.width, image.height, image.pixels, 0, image.width);
        Image img = makeColorTransparent(bi, new Color(0, 0, 0));
        BufferedImage trans = imageToBufferedImage(img);
        try {
            File out = new File(Signlink.getCacheDirectory() + "sprite_dump/" + name + ".png");
            ImageIO.write(trans, "png", out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Turns an Image into a BufferedImage.
     * @param image
     * @return
     */
    private static BufferedImage imageToBufferedImage(Image image) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, 0, 0, null);
        g2.dispose();
        return bufferedImage;
    }

    /**
     * Makes the specified color transparent in a buffered image.
     * @param im
     * @param color
     * @return
     */
    public static Image makeColorTransparent(BufferedImage im, final Color color) {
        RGBImageFilter filter = new RGBImageFilter() {
            public int markerRGB = color.getRGB() | 0xFF000000;
            public final int filterRGB(int x, int y, int rgb) {
                if ((rgb | 0xFF000000) == markerRGB) {
                    return 0x00FFFFFF & rgb;
                } else {
                    return rgb;
                }
            }
        };
        ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
        return Toolkit.getDefaultToolkit().createImage(ip);
    }
}
