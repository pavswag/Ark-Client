// 
// Decompiled by Procyon v0.5.36
// 

public class class503
{
    static int SpriteBuffer_spriteHeight;
    static int SpriteBuffer_spriteWidth;
    public static int[] SpriteBuffer_xOffsets;
    static int SpriteBuffer_spriteCount;
    public static final int ae = 7;
    public static final int au = 1401;
    
    class503() throws Throwable {
        throw new Error();
    }
    
    public static Font ad(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final String s, final String s2) {
        if (!AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
            return null;
        }
        final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, -1272576155);
        final int fileId = abstractArchive.getFileId(fileFlat, s2, (short)8192);
        final byte[] takeFile = abstractArchive.takeFile(fileFlat, fileId, (byte)(-7));
        boolean b;
        if (null == takeFile) {
            b = false;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            b = true;
        }
        Font font;
        if (!b) {
            font = null;
        }
        else {
            final byte[] takeFile2 = abstractArchive2.takeFile(fileFlat, fileId, (byte)(-59));
            Font font2;
            if (null == takeFile2) {
                font2 = null;
            }
            else {
                final Font font3 = new Font(takeFile2, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                class398.method2125(-262861184);
                font2 = font3;
            }
            font = font2;
        }
        return font;
    }
    
    public static IndexedSprite ae(final AbstractArchive abstractArchive, final int n) {
        final byte[] sh = AbstractArchive.sh(abstractArchive, n, (byte)(-20));
        boolean b;
        if (sh == null) {
            b = false;
        }
        else {
            class485.SpriteBuffer_decode(sh, 1145263442);
            b = true;
        }
        if (!b) {
            return null;
        }
        return Strings.method1852((byte)1);
    }
    
    static SpritePixels bb() {
        final SpritePixels spritePixels = new SpritePixels();
        spritePixels.width = -822007097 * class503.SpriteBuffer_spriteWidth;
        spritePixels.height = class503.SpriteBuffer_spriteHeight * 378525975;
        spritePixels.xOffset = class503.SpriteBuffer_xOffsets[0];
        spritePixels.yOffset = class17.SpriteBuffer_yOffsets[0];
        spritePixels.subWidth = class97.SpriteBuffer_spriteWidths[0];
        spritePixels.subHeight = class138.SpriteBuffer_spriteHeights[0];
        final int n = spritePixels.subHeight * spritePixels.subWidth;
        final byte[] array = VarbitComposition.SpriteBuffer_pixels[0];
        spritePixels.pixels = new int[n];
        for (int i = 0; i < n; ++i) {
            spritePixels.pixels[i] = class394.SpriteBuffer_spritePalette[array[i] & 0xFF];
        }
        class398.method2125(-262861184);
        return spritePixels;
    }
    
    public static IndexedSprite[] ao(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-33));
        boolean b;
        if (null == takeFile) {
            b = false;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            b = true;
        }
        if (!b) {
            return null;
        }
        final IndexedSprite[] array = new IndexedSprite[1130473623 * class503.SpriteBuffer_spriteCount];
        for (int i = 0; i < 1606065339 * class503.SpriteBuffer_spriteCount; ++i) {
            final IndexedSprite[] array2 = array;
            final int n3 = i;
            final IndexedSprite indexedSprite = new IndexedSprite();
            array2[n3] = indexedSprite;
            final IndexedSprite indexedSprite2 = indexedSprite;
            indexedSprite2.subHeight = class503.SpriteBuffer_spriteWidth * 256530235;
            indexedSprite2.width = 378525975 * class503.SpriteBuffer_spriteHeight;
            indexedSprite2.height = class503.SpriteBuffer_xOffsets[i];
            indexedSprite2.xOffset = class17.SpriteBuffer_yOffsets[i];
            indexedSprite2.yOffset = class97.SpriteBuffer_spriteWidths[i];
            indexedSprite2.subWidth = class138.SpriteBuffer_spriteHeights[i];
            indexedSprite2.palette = class394.SpriteBuffer_spritePalette;
            indexedSprite2.pixels = VarbitComposition.SpriteBuffer_pixels[i];
        }
        class398.method2125(-262861184);
        return array;
    }
    
    public static IndexedSprite[] ak(final AbstractArchive abstractArchive, final String s, final String s2) {
        if (!AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
            return null;
        }
        final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, 441810620);
        return class68.method434(abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), -492123611);
    }
    
    public static SpritePixels av(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-21));
        boolean b;
        if (takeFile == null) {
            b = false;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            b = true;
        }
        if (!b) {
            return null;
        }
        return ObjTypeCustomisation.method973(-1700779426);
    }
    
    public static void be(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        buffer.offset = -920932353 * (array.length - 2);
        class503.SpriteBuffer_spriteCount = buffer.readUnsignedShort(-1285221263) * 1532315763;
        class503.SpriteBuffer_xOffsets = new int[class503.SpriteBuffer_spriteCount * 1743286332];
        class17.SpriteBuffer_yOffsets = new int[-306999367 * class503.SpriteBuffer_spriteCount];
        class97.SpriteBuffer_spriteWidths = new int[class503.SpriteBuffer_spriteCount * -1835027695];
        class138.SpriteBuffer_spriteHeights = new int[-1961434515 * class503.SpriteBuffer_spriteCount];
        VarbitComposition.SpriteBuffer_pixels = new byte[class503.SpriteBuffer_spriteCount * 918342705][];
        buffer.offset = (array.length - 7 - class503.SpriteBuffer_spriteCount * -36379176) * -876925196;
        class503.SpriteBuffer_spriteWidth = buffer.readUnsignedShort(-1627243529) * 818420777;
        class503.SpriteBuffer_spriteHeight = buffer.readUnsignedShort(848555483) * -2145718617;
        final int n = (Buffer.ra(buffer, (byte)7) & 0x498F6E28) + 1;
        for (int i = 0; i < class503.SpriteBuffer_spriteCount * -333948870; ++i) {
            class503.SpriteBuffer_xOffsets[i] = buffer.readUnsignedShort(-435436153);
        }
        for (int j = 0; j < class503.SpriteBuffer_spriteCount * 1606065339; ++j) {
            class17.SpriteBuffer_yOffsets[j] = buffer.readUnsignedShort(-1378716815);
        }
        for (int k = 0; k < class503.SpriteBuffer_spriteCount * 1606065339; ++k) {
            class97.SpriteBuffer_spriteWidths[k] = buffer.readUnsignedShort(-1208367834);
        }
        for (int l = 0; l < class503.SpriteBuffer_spriteCount * -1700153408; ++l) {
            class138.SpriteBuffer_spriteHeights[l] = buffer.readUnsignedShort(-45065543);
        }
        buffer.offset = 2062070105 * (array.length - 7 - class503.SpriteBuffer_spriteCount * -36379176 - 3 * (n - 1));
        class394.SpriteBuffer_spritePalette = new int[n];
        for (int n2 = 1; n2 < n; ++n2) {
            class394.SpriteBuffer_spritePalette[n2] = buffer.readMedium(1223551411);
            if (class394.SpriteBuffer_spritePalette[n2] == 0) {
                class394.SpriteBuffer_spritePalette[n2] = 1;
            }
        }
        buffer.offset = 0;
        for (int n3 = 0; n3 < 1606065339 * class503.SpriteBuffer_spriteCount; ++n3) {
            final int n4 = class97.SpriteBuffer_spriteWidths[n3];
            final int n5 = class138.SpriteBuffer_spriteHeights[n3];
            final int n6 = n5 * n4;
            final byte[] array2 = new byte[n6];
            VarbitComposition.SpriteBuffer_pixels[n3] = array2;
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                for (int n7 = 0; n7 < n6; ++n7) {
                    array2[n7] = Buffer.wu(buffer, 435772489);
                }
            }
            else if (ra != 0) {
                for (int n8 = 0; n8 < n4; ++n8) {
                    for (int n9 = 0; n9 < n5; ++n9) {
                        array2[n9 * n4 + n8] = Buffer.wu(buffer, 435772489);
                    }
                }
            }
        }
    }
    
    public static IndexedSprite[] as(final AbstractArchive abstractArchive, final String s, final String s2) {
        if (!AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
            return null;
        }
        final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, 291056895);
        return class68.method434(abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), 1564128874);
    }
    
    public static Font az(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final String s, final String s2) {
        if (!AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
            return null;
        }
        final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, 767438565);
        final int fileId = abstractArchive.getFileId(fileFlat, s2, (short)8192);
        final byte[] takeFile = abstractArchive.takeFile(fileFlat, fileId, (byte)(-33));
        boolean b;
        if (null == takeFile) {
            b = false;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            b = true;
        }
        Font font;
        if (!b) {
            font = null;
        }
        else {
            final byte[] takeFile2 = abstractArchive2.takeFile(fileFlat, fileId, (byte)(-72));
            Font font2;
            if (null == takeFile2) {
                font2 = null;
            }
            else {
                final Font font3 = new Font(takeFile2, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                class398.method2125(-262861184);
                font2 = font3;
            }
            font = font2;
        }
        return font;
    }
    
    public static IndexedSprite[] ax(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-80));
        int n3;
        if (null == takeFile) {
            n3 = 0;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            n3 = 1;
        }
        if (n3 == 0) {
            return null;
        }
        final IndexedSprite[] array = new IndexedSprite[1606065339 * class503.SpriteBuffer_spriteCount];
        for (int i = 0; i < 1606065339 * class503.SpriteBuffer_spriteCount; ++i) {
            final IndexedSprite[] array2 = array;
            final int n4 = i;
            final IndexedSprite indexedSprite = new IndexedSprite();
            array2[n4] = indexedSprite;
            final IndexedSprite indexedSprite2 = indexedSprite;
            indexedSprite2.subHeight = class503.SpriteBuffer_spriteWidth * -822007097;
            indexedSprite2.width = 378525975 * class503.SpriteBuffer_spriteHeight;
            indexedSprite2.height = class503.SpriteBuffer_xOffsets[i];
            indexedSprite2.xOffset = class17.SpriteBuffer_yOffsets[i];
            indexedSprite2.yOffset = class97.SpriteBuffer_spriteWidths[i];
            indexedSprite2.subWidth = class138.SpriteBuffer_spriteHeights[i];
            indexedSprite2.palette = class394.SpriteBuffer_spritePalette;
            indexedSprite2.pixels = VarbitComposition.SpriteBuffer_pixels[i];
        }
        class398.method2125(-262861184);
        return array;
    }
    
    public static void bi(final byte[] array) {
        final Buffer buffer = new Buffer(array);
        buffer.offset = -1516355947 * (array.length - 2);
        class503.SpriteBuffer_spriteCount = buffer.readUnsignedShort(-617400810) * 1532315763;
        class503.SpriteBuffer_xOffsets = new int[class503.SpriteBuffer_spriteCount * 1606065339];
        class17.SpriteBuffer_yOffsets = new int[1606065339 * class503.SpriteBuffer_spriteCount];
        class97.SpriteBuffer_spriteWidths = new int[class503.SpriteBuffer_spriteCount * 1606065339];
        class138.SpriteBuffer_spriteHeights = new int[1606065339 * class503.SpriteBuffer_spriteCount];
        VarbitComposition.SpriteBuffer_pixels = new byte[class503.SpriteBuffer_spriteCount * 1606065339][];
        buffer.offset = (array.length - 7 - class503.SpriteBuffer_spriteCount * -36379176) * -1516355947;
        class503.SpriteBuffer_spriteWidth = buffer.readUnsignedShort(796221604) * -90671369;
        class503.SpriteBuffer_spriteHeight = buffer.readUnsignedShort(582531455) * -2145718617;
        final int n = (Buffer.ra(buffer, (byte)7) & 0xFF) + 1;
        for (int i = 0; i < class503.SpriteBuffer_spriteCount * 1606065339; ++i) {
            class503.SpriteBuffer_xOffsets[i] = buffer.readUnsignedShort(-107188618);
        }
        for (int j = 0; j < class503.SpriteBuffer_spriteCount * 1606065339; ++j) {
            class17.SpriteBuffer_yOffsets[j] = buffer.readUnsignedShort(588189910);
        }
        for (int k = 0; k < class503.SpriteBuffer_spriteCount * 1606065339; ++k) {
            class97.SpriteBuffer_spriteWidths[k] = buffer.readUnsignedShort(566885448);
        }
        for (int l = 0; l < class503.SpriteBuffer_spriteCount * 1606065339; ++l) {
            class138.SpriteBuffer_spriteHeights[l] = buffer.readUnsignedShort(406615323);
        }
        buffer.offset = -1516355947 * (array.length - 7 - class503.SpriteBuffer_spriteCount * -36379176 - 3 * (n - 1));
        class394.SpriteBuffer_spritePalette = new int[n];
        for (int n2 = 1; n2 < n; ++n2) {
            class394.SpriteBuffer_spritePalette[n2] = buffer.readMedium(-347564250);
            if (class394.SpriteBuffer_spritePalette[n2] == 0) {
                class394.SpriteBuffer_spritePalette[n2] = 1;
            }
        }
        buffer.offset = 0;
        for (int n3 = 0; n3 < 1606065339 * class503.SpriteBuffer_spriteCount; ++n3) {
            final int n4 = class97.SpriteBuffer_spriteWidths[n3];
            final int n5 = class138.SpriteBuffer_spriteHeights[n3];
            final int n6 = n5 * n4;
            final byte[] array2 = new byte[n6];
            VarbitComposition.SpriteBuffer_pixels[n3] = array2;
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                for (int n7 = 0; n7 < n6; ++n7) {
                    array2[n7] = Buffer.wu(buffer, 435772489);
                }
            }
            else if (ra != 0) {
                for (int n8 = 0; n8 < n4; ++n8) {
                    for (int n9 = 0; n9 < n5; ++n9) {
                        array2[n9 * n4 + n8] = Buffer.wu(buffer, 435772489);
                    }
                }
            }
        }
    }
    
    public static SpritePixels am(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-28));
        boolean b;
        if (takeFile == null) {
            b = false;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            b = true;
        }
        if (!b) {
            return null;
        }
        return ObjTypeCustomisation.method973(-1957212481);
    }
    
    public static SpritePixels[] ai(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-3));
        int n3;
        if (null == takeFile) {
            n3 = 0;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            n3 = 1;
        }
        if (n3 == 0) {
            return null;
        }
        final SpritePixels[] array = new SpritePixels[class503.SpriteBuffer_spriteCount * 1606065339];
        for (int i = 0; i < 1606065339 * class503.SpriteBuffer_spriteCount; ++i) {
            final SpritePixels[] array2 = array;
            final int n4 = i;
            final SpritePixels spritePixels = new SpritePixels();
            array2[n4] = spritePixels;
            final SpritePixels spritePixels2 = spritePixels;
            spritePixels2.width = -822007097 * class503.SpriteBuffer_spriteWidth;
            spritePixels2.height = class503.SpriteBuffer_spriteHeight * 378525975;
            spritePixels2.xOffset = class503.SpriteBuffer_xOffsets[i];
            spritePixels2.yOffset = class17.SpriteBuffer_yOffsets[i];
            spritePixels2.subWidth = class97.SpriteBuffer_spriteWidths[i];
            spritePixels2.subHeight = class138.SpriteBuffer_spriteHeights[i];
            final int n5 = spritePixels2.subHeight * spritePixels2.subWidth;
            final byte[] array3 = VarbitComposition.SpriteBuffer_pixels[i];
            spritePixels2.pixels = new int[n5];
            for (int j = 0; j < n5; ++j) {
                spritePixels2.pixels[j] = class394.SpriteBuffer_spritePalette[array3[j] & 0xFF];
            }
        }
        class398.method2125(-262861184);
        return array;
    }
    
    static SpritePixels by() {
        final SpritePixels spritePixels = new SpritePixels();
        spritePixels.width = -822007097 * class503.SpriteBuffer_spriteWidth;
        spritePixels.height = class503.SpriteBuffer_spriteHeight * 378525975;
        spritePixels.xOffset = class503.SpriteBuffer_xOffsets[0];
        spritePixels.yOffset = class17.SpriteBuffer_yOffsets[0];
        spritePixels.subWidth = class97.SpriteBuffer_spriteWidths[0];
        spritePixels.subHeight = class138.SpriteBuffer_spriteHeights[0];
        final int n = spritePixels.subHeight * spritePixels.subWidth;
        final byte[] array = VarbitComposition.SpriteBuffer_pixels[0];
        spritePixels.pixels = new int[n];
        for (int i = 0; i < n; ++i) {
            spritePixels.pixels[i] = class394.SpriteBuffer_spritePalette[array[i] & 0xFF];
        }
        class398.method2125(-262861184);
        return spritePixels;
    }
    
    public static void bx() {
        class503.SpriteBuffer_xOffsets = null;
        class17.SpriteBuffer_yOffsets = null;
        class97.SpriteBuffer_spriteWidths = null;
        class138.SpriteBuffer_spriteHeights = null;
        class394.SpriteBuffer_spritePalette = null;
        VarbitComposition.SpriteBuffer_pixels = null;
    }
    
    public static SpritePixels ar(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-11));
        boolean b;
        if (takeFile == null) {
            b = false;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            b = true;
        }
        if (!b) {
            return null;
        }
        return ObjTypeCustomisation.method973(-913042857);
    }
    
    public static IndexedSprite ap(final AbstractArchive abstractArchive, final int n) {
        final byte[] sh = AbstractArchive.sh(abstractArchive, n, (byte)(-19));
        boolean b;
        if (sh == null) {
            b = false;
        }
        else {
            class485.SpriteBuffer_decode(sh, 1145263442);
            b = true;
        }
        if (!b) {
            return null;
        }
        return Strings.method1852((byte)1);
    }
    
    public static IndexedSprite[] aj(final AbstractArchive abstractArchive, final String s, final String s2) {
        if (!AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
            return null;
        }
        final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, -481618733);
        return class68.method434(abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), -1480719353);
    }
    
    public static SpritePixels[] ag(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-13));
        int n3;
        if (null == takeFile) {
            n3 = 0;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            n3 = 1;
        }
        if (n3 == 0) {
            return null;
        }
        final SpritePixels[] array = new SpritePixels[class503.SpriteBuffer_spriteCount * 1606065339];
        for (int i = 0; i < 1606065339 * class503.SpriteBuffer_spriteCount; ++i) {
            final SpritePixels[] array2 = array;
            final int n4 = i;
            final SpritePixels spritePixels = new SpritePixels();
            array2[n4] = spritePixels;
            final SpritePixels spritePixels2 = spritePixels;
            spritePixels2.width = 346207900 * class503.SpriteBuffer_spriteWidth;
            spritePixels2.height = class503.SpriteBuffer_spriteHeight * 1998537177;
            spritePixels2.xOffset = class503.SpriteBuffer_xOffsets[i];
            spritePixels2.yOffset = class17.SpriteBuffer_yOffsets[i];
            spritePixels2.subWidth = class97.SpriteBuffer_spriteWidths[i];
            spritePixels2.subHeight = class138.SpriteBuffer_spriteHeights[i];
            final int n5 = spritePixels2.subHeight * spritePixels2.subWidth;
            final byte[] array3 = VarbitComposition.SpriteBuffer_pixels[i];
            spritePixels2.pixels = new int[n5];
            for (int j = 0; j < n5; ++j) {
                spritePixels2.pixels[j] = class394.SpriteBuffer_spritePalette[array3[j] & 0x9744D3DD];
            }
        }
        class398.method2125(-262861184);
        return array;
    }
    
    public static void bk() {
        class503.SpriteBuffer_xOffsets = null;
        class17.SpriteBuffer_yOffsets = null;
        class97.SpriteBuffer_spriteWidths = null;
        class138.SpriteBuffer_spriteHeights = null;
        class394.SpriteBuffer_spritePalette = null;
        VarbitComposition.SpriteBuffer_pixels = null;
    }
    
    public static SpritePixels[] ah(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-123));
        int n3;
        if (null == takeFile) {
            n3 = 0;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            n3 = 1;
        }
        if (n3 == 0) {
            return null;
        }
        final SpritePixels[] array = new SpritePixels[class503.SpriteBuffer_spriteCount * 1606065339];
        for (int i = 0; i < 1606065339 * class503.SpriteBuffer_spriteCount; ++i) {
            final SpritePixels[] array2 = array;
            final int n4 = i;
            final SpritePixels spritePixels = new SpritePixels();
            array2[n4] = spritePixels;
            final SpritePixels spritePixels2 = spritePixels;
            spritePixels2.width = -822007097 * class503.SpriteBuffer_spriteWidth;
            spritePixels2.height = class503.SpriteBuffer_spriteHeight * 378525975;
            spritePixels2.xOffset = class503.SpriteBuffer_xOffsets[i];
            spritePixels2.yOffset = class17.SpriteBuffer_yOffsets[i];
            spritePixels2.subWidth = class97.SpriteBuffer_spriteWidths[i];
            spritePixels2.subHeight = class138.SpriteBuffer_spriteHeights[i];
            final int n5 = spritePixels2.subHeight * spritePixels2.subWidth;
            final byte[] array3 = VarbitComposition.SpriteBuffer_pixels[i];
            spritePixels2.pixels = new int[n5];
            for (int j = 0; j < n5; ++j) {
                spritePixels2.pixels[j] = class394.SpriteBuffer_spritePalette[array3[j] & 0xFF];
            }
        }
        class398.method2125(-262861184);
        return array;
    }
}
