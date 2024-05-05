import net.runelite.api.HashTable;
import net.runelite.api.WidgetNode;
import net.runelite.api.FontTypeFace;
import java.util.Arrays;
import java.awt.Rectangle;
import net.runelite.api.Point;
import net.runelite.api.widgets.WidgetInfo;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.36
// 

public class Widget extends Node implements net.runelite.api.widgets.Widget
{
    static class398 field2867;
    class166 field2868;
    public boolean textShadowed;
    public static final int ac = 1400;
    public static final int ab = 1402;
    public static final int at = 3;
    public static final int aa = 4;
    public int field2870;
    static EvictingDualNodeHashTable Widget_cachedSprites;
    public int qa;
    static EvictingDualNodeHashTable Widget_cachedModels;
    static EvictingDualNodeHashTable Widget_cachedFonts;
    static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
    public int modelAngleY;
    public Object[] field2876;
    public static boolean field2877;
    static class398 field2878;
    public int id;
    public int childIndex;
    public int width;
    public int buttonType;
    public boolean isIf3;
    public boolean field2891;
    public int yAlignment;
    public boolean spriteFlipH;
    public int heightAlignment;
    public int rawX;
    public static int mz;
    public int rawY;
    public int rawWidth;
    public boolean fill;
    public Object[] field2892;
    public int[] varTransmitTriggers;
    public PlayerComposition field2894;
    public int height;
    public int field2896;
    public int field2897;
    public int parentId;
    public boolean spriteTiling;
    public int scrollX;
    public int scrollY;
    public static final /* synthetic */ boolean qx;
    public int scrollWidth;
    public int scrollHeight;
    public int color;
    public int color2;
    public int mouseOverColor;
    public int type;
    public boolean noScrollThrough;
    public FillMode fillMode;
    public int transparencyTop;
    public int transparencyBot;
    public int lineWid;
    public boolean isScrollBar;
    public int spriteId2;
    public int spriteId;
    public String spellActionName;
    public int spriteAngle;
    public int xAlignment;
    public int outline;
    public boolean hasListener;
    public boolean noClickThrough;
    public int[] itemIds;
    public int mouseOverRedirect;
    public Object[] onInvTransmit;
    public short js;
    int modelType2;
    int modelId2;
    public int sequenceId;
    public int modelZoom;
    public int modelOffsetX;
    public static final int an = 1338;
    public int kw;
    public int modelAngleX;
    public Object[] onClanTransmit;
    public boolean field2978;
    public Object[] onTargetEnter;
    public int modelRotation;
    public int rotationKey;
    public int[] field2936;
    public int sequenceId2;
    public boolean spriteFlipV;
    public int itemQuantityMode;
    public int fontId;
    public Object[] onRelease;
    public String buttonText;
    public int textLineHeight;
    public int textXAlignment;
    public int itemQuantity;
    public Object[] field2946;
    public int dragThreshold;
    int field2948;
    HashMap field2949;
    HashMap field2950;
    class312 field2951;
    public int[] field2952;
    public Object[] onStockTransmit;
    public byte[][] field2954;
    public byte[][] field2955;
    public String[] actions;
    public static final int ay = 5;
    public String field3004;
    public boolean modelOrthog;
    public Widget parent;
    public int dragZoneSize;
    public Object[] field2961;
    public static final int aw = 1339;
    public int mouseOverColor2;
    public int modelType;
    public int rawHeight;
    public boolean field2913;
    public Object[] onClickRepeat;
    public int x;
    public Object[] onHold;
    public int vc;
    public boolean modelTransparency;
    public Object[] onMouseRepeat;
    public Object[] onMouseLeave;
    public Object[] onDrag;
    public Object[] onDragComplete;
    public Object[] onLoad;
    public Object[] onTargetLeave;
    public Object[] onVarTransmit;
    public int[] field2977;
    public boolean isHidden;
    public int[] invTransmitTriggers;
    public Object[] onStatTransmit;
    public int[] statTransmitTriggers;
    public Object[] onTimer;
    public Object[] onOp;
    public Object[] field2984;
    public Object[] onScroll;
    public Object[] onChatTransmit;
    public Object[] onKey;
    public Object[] field2988;
    public int modelId;
    public int textYAlignment;
    public static final int af = 1337;
    public int contentType;
    public Object[] onMouseOver;
    public Object[] onMiscTransmit;
    public short zh;
    public Object[] onDialogAbort;
    public Object[] onSubChange;
    public Object[] onResize;
    public Object[] onFriendTransmit;
    public Object[] field2998;
    public Object[] onClick;
    public int[][] cs1Instructions;
    public int[] cs1Comparisons;
    public int[] cs1ComparisonValues;
    public int cycle;
    public String text;
    public String dataText;
    public int field3006;
    public int[] field3007;
    public int itemId;
    public int flags;
    public int modelFrame;
    public int modelFrameCycle;
    public Widget[] children;
    public int widthAlignment;
    public int modelOffsetY;
    public int field3015;
    public int modelAngleZ;
    public int field3017;
    public String text2;
    public int rootIndex;
    public int y;
    public String field2916;
    public int spriteShadow;
    public boolean prioritizeMenuEntry;
    public boolean field2969;
    
    public String getName() {
        return this.ec().replace(' ', ' ');
    }
    
    public Widget() {
        this.qa = -1;
        this.kw = -1;
        this.vc = -1;
        this.js = -1;
        this.zh = -1;
        this.modelOrthog = false;
        this.id = -346484955;
        this.childIndex = 1274125071;
        this.buttonType = 0;
        this.contentType = 0;
        this.xAlignment = 0;
        this.yAlignment = 0;
        this.widthAlignment = 0;
        this.heightAlignment = 0;
        this.rawX = 0;
        this.rawY = 0;
        this.rawWidth = 0;
        this.rawHeight = 0;
        this.x = 0;
        this.me(-1);
        this.y = 0;
        this.gr(-1);
        this.width = 0;
        this.height = 0;
        this.field2896 = 915397977;
        this.field2897 = -1855082267;
        this.parentId = -908641471;
        this.spriteTiling = false;
        this.scrollX = 0;
        this.scrollY = 0;
        this.scrollWidth = 0;
        this.scrollHeight = 0;
        this.color = 0;
        this.color2 = 0;
        this.mouseOverColor = 0;
        this.mouseOverColor2 = 0;
        this.noScrollThrough = false;
        this.fillMode = FillMode.SOLID;
        this.transparencyTop = 0;
        this.transparencyBot = 0;
        this.lineWid = 1040382753;
        this.isScrollBar = false;
        this.spriteId2 = 504605111;
        this.spriteId = -1679014525;
        this.spriteAngle = 0;
        this.field2913 = false;
        this.outline = 0;
        this.spriteShadow = 0;
        this.modelType = -1714481443;
        this.modelId = -509431749;
        this.modelType2 = 1918873989;
        this.modelId2 = -1559002165;
        this.sequenceId = 1195025605;
        this.sequenceId2 = 1782995843;
        this.modelOffsetX = 0;
        this.modelOffsetY = 0;
        this.modelAngleX = 0;
        this.modelAngleY = 0;
        this.modelAngleZ = 0;
        this.modelZoom = 471890156;
        this.modelRotation = 0;
        this.rotationKey = 0;
        this.field2891 = false;
        this.spriteFlipV = false;
        this.itemQuantityMode = -1523066442;
        this.fontId = -1858899927;
        this.field2916 = "";
        this.buttonText = "";
        this.textLineHeight = 0;
        this.textXAlignment = 0;
        this.textYAlignment = 0;
        this.isIf3 = false;
        this.field2948 = -996199275;
        this.flags = 0;
        this.fill = false;
        this.field3004 = "";
        this.parent = null;
        this.dragZoneSize = 0;
        this.dragThreshold = 0;
        this.spriteFlipH = false;
        this.text2 = "";
        this.field2978 = false;
        this.mouseOverRedirect = 597372633;
        this.text = "";
        this.dataText = Strings.au;
        this.itemId = 1852876811;
        this.itemQuantity = 0;
        this.modelFrame = 0;
        this.modelFrameCycle = 0;
        this.isHidden = false;
        this.modelTransparency = false;
        this.field3015 = -3554691;
        this.field2870 = 0;
        this.field3017 = 0;
        this.field3006 = 0;
        this.rootIndex = 1548573671;
        this.cycle = -414825897;
        this.hasListener = false;
        this.prioritizeMenuEntry = false;
        this.field2969 = false;
    }
    
    static {
        Widget.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
        Widget.Widget_cachedModels = new EvictingDualNodeHashTable(50);
        Widget.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
        Widget.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
        Widget.field2878 = new class398(10, class396.field3689);
        Widget.field2867 = new class398(10, class396.field3689);
        Widget.field2877 = false;
        qx = !Widget.class.desiredAssertionStatus();
    }
    
    void fp() {
        this.hasListener = true;
        final ArrayList method929 = this.field2868.method929(-2072145802);
        final ArrayList method930 = this.field2868.method942((byte)1);
        this.children = new Widget[method929.size() + method930.size()];
        int n = 0;
        for (final class172 class172 : method929) {
            final Widget method931 = class314.method1731(5, this, n, 0, 0, 0, 0, class172.field1444, (byte)55);
            method931.spellActionName = class172.field1445.method679((byte)115);
            Widget.field2878.method2122(method931.spellActionName, new class311(class172.field1445), 747668912);
            this.children[n++] = method931;
        }
        for (final class173 class173 : method930) {
            final Widget method932 = class314.method1731(4, this, n, 0, 0, 0, 0, class173.field1448, (byte)33);
            method932.field2916 = class173.field1447;
            method932.fontId = this.field2949.get(1845750621 * class173.field1446) * 1858899927;
            method932.textXAlignment = class173.field1449 * 329326313;
            method932.textYAlignment = 1890763397 * class173.field1450;
            this.children[n++] = method932;
        }
    }
    
    public static Widget cs(final int n, final int n2) {
        final Widget vmethod3380 = class165.vmethod3380(n, (byte)5);
        if (n2 == -1) {
            return vmethod3380;
        }
        if (vmethod3380 == null || null == vmethod3380.children || n2 >= vmethod3380.children.length) {
            return null;
        }
        return vmethod3380.children[n2];
    }
    
    public boolean isHidden() {
        if (!Widget.qx && !ScriptFrame.client.isClientThread()) {
            throw new AssertionError((Object)"must be called on client thread");
        }
        if (this.isSelfHidden()) {
            return true;
        }
        final net.runelite.api.widgets.Widget parent = this.getParent();
        if (parent == null) {
            if (WidgetInfo.TO_GROUP(this.getId()) != ScriptFrame.client.getTopLevelInterfaceId()) {
                return true;
            }
        }
        else if (parent.isHidden()) {
            return true;
        }
        return false;
    }
    
    public Widget of(final int n) {
        this.modelType = n * -1714481443;
        return this;
    }
    
    public boolean dp() {
        return 11 == 883712245 * this.type || 12 == this.type * 1073957309;
    }
    
    public class27 method1795(final int n) {
        try {
            class27 field2827;
            if (this.field2951 != null) {
                if (n <= 1796333672) {
                    throw new IllegalStateException();
                }
                field2827 = this.field2951.field2827;
            }
            else {
                field2827 = null;
            }
            return field2827;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bs(" + ')');
        }
    }
    
    public String en(final String s) {
        if (11 == this.type * 883712245 && null != this.field2868 && this.method1808(-1315584835)) {
            return class166.ya(this.field2868, s, (byte)(-68));
        }
        return null;
    }
    
    public static boolean ca(final int n) {
        if (class264.Widget_loadedInterfaces[n]) {
            return true;
        }
        if (!UserComparator3.Widget_archive.method1889(n, 1635405072)) {
            return false;
        }
        final int groupFileCount = UserComparator3.Widget_archive.getGroupFileCount(n, (byte)110);
        if (groupFileCount == 0) {
            return class264.Widget_loadedInterfaces[n] = true;
        }
        if (VerticalAlignment.Widget_interfaceComponents[n] == null) {
            VerticalAlignment.Widget_interfaceComponents[n] = new Widget[groupFileCount];
        }
        for (int i = 0; i < groupFileCount; ++i) {
            if (VerticalAlignment.Widget_interfaceComponents[n][i] == null) {
                final byte[] takeFile = UserComparator3.Widget_archive.takeFile(n, i, (byte)(-92));
                if (takeFile != null) {
                    VerticalAlignment.Widget_interfaceComponents[n][i] = new Widget();
                    VerticalAlignment.Widget_interfaceComponents[n][i].id = (i + (n << 16)) * 346484955;
                    if (takeFile[0] == -1) {
                        VerticalAlignment.Widget_interfaceComponents[n][i].decode(new Buffer(takeFile), 1041068241);
                    }
                    else {
                        VerticalAlignment.Widget_interfaceComponents[n][i].decodeLegacy(new Buffer(takeFile), -647995361);
                    }
                }
            }
        }
        return class264.Widget_loadedInterfaces[n] = true;
    }
    
    public void method1824(final int i, final int j, final byte b) {
        try {
            if (11 == 883712245 * this.type) {
                if (null == this.field2949) {
                    if (b == 4) {
                        throw new IllegalStateException();
                    }
                    nk(this, (byte)(-77));
                }
                this.field2949.put(i, j);
                return;
            }
            if (b == 4) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ad(" + ')');
        }
    }
    
    public Font cd() {
        Widget.field2877 = false;
        if (this.fontId * -93154958 == -1) {
            return null;
        }
        final Font font = (Font)Widget.Widget_cachedFonts.wr(-1065036825 * this.fontId);
        if (null != font) {
            return font;
        }
        final AbstractArchive widget_spritesArchive = ScriptEvent.Widget_spritesArchive;
        final AbstractArchive widget_fontsArchive = class146.Widget_fontsArchive;
        final int n = -1065036825 * this.fontId;
        final byte[] takeFile = widget_spritesArchive.takeFile(n, 0, (byte)(-34));
        int n2;
        if (null == takeFile) {
            n2 = 0;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            n2 = 1;
        }
        Font font2;
        if (n2 == 0) {
            font2 = null;
        }
        else {
            final byte[] takeFile2 = widget_fontsArchive.takeFile(n, 0, (byte)(-52));
            Font font3;
            if (null == takeFile2) {
                font3 = null;
            }
            else {
                final Font font4 = new Font(takeFile2, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                class398.method2125(-262861184);
                font3 = font4;
            }
            font2 = font3;
        }
        final Font font5 = font2;
        if (font5 != null) {
            Widget.Widget_cachedFonts.put(font5, -964503006 * this.fontId);
        }
        else {
            Widget.field2877 = true;
        }
        return font5;
    }
    
    public void method1805(final String key, final int i, final int n) {
        try {
            if (11 == 883712245 * this.type) {
                if (null == this.field2950) {
                    if (n <= 782710260) {
                        throw new IllegalStateException();
                    }
                    nk(this, (byte)(-128));
                }
                this.field2950.put(key, i);
                return;
            }
            if (n <= 782710260) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ae(" + ')');
        }
    }
    
    public SpritePixels cr(final boolean b, final UrlRequester urlRequester) {
        Widget.field2877 = false;
        if (null != this.spellActionName) {
            final SpritePixels method1826 = this.method1826(urlRequester, (byte)13);
            if (null != method1826) {
                return method1826;
            }
        }
        int n;
        if (b) {
            n = -1352724779 * this.spriteId;
        }
        else {
            n = -363627527 * this.spriteId2;
        }
        if (n == -1) {
            return null;
        }
        final long n2 = ((long)(this.spriteShadow * -353676735) << 40) + (((this.noClickThrough ? 1 : 0) << 38) + (((long)(this.outline * 1638912775) << 36) + n) + ((this.textShadowed ? 1 : 0) << 39));
        final SpritePixels spritePixels = (SpritePixels)Widget.Widget_cachedSprites.wr(n2);
        if (null != spritePixels) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(ScriptEvent.Widget_spritesArchive, n, 0, 1987600221);
        if (null == spriteBuffer_getSprite) {
            Widget.field2877 = true;
            return null;
        }
        this.method1797(spriteBuffer_getSprite, 1028586955);
        Widget.Widget_cachedSprites.put(spriteBuffer_getSprite, n2);
        return spriteBuffer_getSprite;
    }
    
    public static Widget ce(final int n) {
        final int n2 = n >> 16;
        final int n3 = n & 0xFFFF;
        if ((VerticalAlignment.Widget_interfaceComponents[n2] == null || VerticalAlignment.Widget_interfaceComponents[n2][n3] == null) && !SoundSystem.loadInterface(n2, 1376777516)) {
            return null;
        }
        return VerticalAlignment.Widget_interfaceComponents[n2][n3];
    }
    
    public static boolean method1804(final Widget widget) {
        return 11 == 1145719928 * widget.type || 12 == widget.type * 883712245;
    }
    
    public String method1804() {
        if (11 == 883712245 * this.type && null != this.field2868) {
            final String li = class166.li(this.field2868, (byte)89);
            for (final class177 class177 : this.field2868.method931(1963953546)) {
                final String format = String.format("%%%S%%", class177.method963((byte)(-63)));
                if (class177.vmethod3379((byte)(-61)) == 0) {
                    li.replaceAll(format, Integer.toString(class177.vmethod3378(772557701)));
                }
                else {
                    li.replaceAll(format, class177.vmethod3380((byte)125));
                }
            }
            return li;
        }
        return null;
    }
    
    public int method1804(final String s, final int n) {
        try {
            if (11 == this.type * 883712245) {
                if (n == 2002322473) {
                    throw new IllegalStateException();
                }
                if (null != this.field2868) {
                    if (this.method1807(-1872205769)) {
                        return class166.method932(this.field2868, s, (byte)92);
                    }
                    if (n == 2002322473) {
                        throw new IllegalStateException();
                    }
                }
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bb(" + ')');
        }
    }
    
    public static SpriteMask cb(final Widget widget, boolean b) {
        if (widget == null) {
            widget.getOriginalWidth();
        }
        if (-1352724779 * widget.spriteId == -1) {
            b = false;
        }
        final int n = b ? (-1352724779 * widget.spriteId) : (-363627527 * widget.spriteId2);
        if (-1 == n) {
            return null;
        }
        final long n2 = ((widget.textShadowed ? 1 : 0) << 39) + (((widget.noClickThrough ? 1 : 0) << 38) + (((long)(1638912775 * widget.outline) << 36) + n)) + ((long)(widget.spriteShadow * -353676735) << 40);
        final SpriteMask spriteMask = (SpriteMask)Widget.Widget_cachedSpriteMasks.wr(n2);
        if (null != spriteMask) {
            return spriteMask;
        }
        final SpritePixels sprite = widget.getSprite(b, null, (byte)0);
        if (sprite == null) {
            return null;
        }
        final SpritePixels gm = SpritePixels.gm(sprite);
        final int[] array = new int[gm.subHeight];
        final int[] array2 = new int[gm.subHeight];
        for (int i = 0; i < gm.subHeight; ++i) {
            int n3 = 0;
            int subWidth = gm.subWidth;
            for (int j = 0; j < gm.subWidth; ++j) {
                if (gm.pixels[j + i * gm.subWidth] == 0) {
                    n3 = j;
                    break;
                }
            }
            for (int k = gm.subWidth - 1; k >= n3; --k) {
                if (0 == gm.pixels[i * gm.subWidth + k]) {
                    subWidth = k + 1;
                    break;
                }
            }
            array2[i] = subWidth - (array[i] = n3);
        }
        final SpriteMask spriteMask2 = new SpriteMask(gm.subWidth, gm.subHeight, array2, array, n);
        Widget.Widget_cachedSpriteMasks.put(spriteMask2, n2);
        return spriteMask2;
    }
    
    public Widget cb(final int n) {
        this.scrollWidth = n * -1469650905;
        return this;
    }
    
    SpritePixels cb(final UrlRequester urlRequester) {
        if (this.spellActionName != null && null != urlRequester) {
            class311 class311 = (class311)Widget.field2878.method2126(this.spellActionName, (short)5668);
            if (null == class311) {
                class311 = new class311(this.spellActionName, urlRequester);
                Widget.field2878.method2122(this.spellActionName, class311, 747668912);
            }
            return class311.method1690((byte)108);
        }
        return null;
    }
    
    public void da(final int i, final int j) {
        if (11 != 1682323956 * this.type) {
            return;
        }
        if (null == this.field2949) {
            nk(this, (byte)(-52));
        }
        this.field2949.put(i, j);
    }
    
    public Widget ov(final String s) {
        this.rc(s.replace(' ', ' '));
        return this;
    }
    
    public static class312 pa(final Widget widget) {
        return widget.field2951;
    }
    
    void ch(final SpritePixels spritePixels) {
        if (this.noClickThrough) {
            SecureRandomCallable.ig(spritePixels);
        }
        if (this.textShadowed) {
            SpritePixels.xw(spritePixels);
        }
        if (202967813 * this.outline > 0) {
            SpritePixels.jx(spritePixels, 1638912775 * this.outline);
        }
        if (this.outline * 1638912775 >= 1) {
            spritePixels.outline(1);
        }
        if (655978048 * this.outline >= 2) {
            spritePixels.outline(235239089);
        }
        if (0 != -1921019285 * this.spriteShadow) {
            spritePixels.shadow(-353676735 * this.spriteShadow);
        }
    }
    
    public boolean contains(final Point point) {
        final Rectangle bounds = this.getBounds();
        return bounds != null && bounds.contains(new java.awt.Point(point.getX(), point.getY()));
    }
    
    public Rectangle getBounds() {
        return new Rectangle(this.kw, this.vc, this.getWidth(), this.getHeight());
    }
    
    int[] cl(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra == 0) {
            return null;
        }
        final int[] array = new int[ra];
        for (int i = 0; i < ra; ++i) {
            array[i] = buffer.readInt(-1782883707);
        }
        return array;
    }
    
    public static boolean cn(final int n) {
        if (class264.Widget_loadedInterfaces[n]) {
            return true;
        }
        if (!UserComparator3.Widget_archive.method1889(n, -685296776)) {
            return false;
        }
        final int groupFileCount = UserComparator3.Widget_archive.getGroupFileCount(n, (byte)14);
        if (groupFileCount == 0) {
            return class264.Widget_loadedInterfaces[n] = true;
        }
        if (VerticalAlignment.Widget_interfaceComponents[n] == null) {
            VerticalAlignment.Widget_interfaceComponents[n] = new Widget[groupFileCount];
        }
        for (int i = 0; i < groupFileCount; ++i) {
            if (VerticalAlignment.Widget_interfaceComponents[n][i] == null) {
                final byte[] takeFile = UserComparator3.Widget_archive.takeFile(n, i, (byte)(-89));
                if (takeFile != null) {
                    VerticalAlignment.Widget_interfaceComponents[n][i] = new Widget();
                    VerticalAlignment.Widget_interfaceComponents[n][i].id = (i + (n << 16)) * 1306943178;
                    if (takeFile[0] == -1) {
                        VerticalAlignment.Widget_interfaceComponents[n][i].decode(new Buffer(takeFile), -392338170);
                    }
                    else {
                        VerticalAlignment.Widget_interfaceComponents[n][i].decodeLegacy(new Buffer(takeFile), -496140213);
                    }
                }
            }
        }
        return class264.Widget_loadedInterfaces[n] = true;
    }
    
    public int ex() {
        return (this.field2950 != null && this.field2950.size() > 0) ? 1 : 0;
    }
    
    public static boolean sc(final Widget widget, final int n) {
        if (widget == null) {
            widget.method1808(n);
        }
        try {
            if (11 != 883712245 * widget.type) {
                if (12 != widget.type * 883712245) {
                    return false;
                }
                if (n <= -2026319687) {
                    throw new IllegalStateException();
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.as(" + ')');
        }
    }
    
    public static class314 tb(final Widget widget) {
        return (null != widget.field2951) ? widget.field2951.field2823 : null;
    }
    
    public net.runelite.api.widgets.Widget getParent() {
        final int parentId = this.getParentId();
        if (parentId == -1) {
            return null;
        }
        return (net.runelite.api.widgets.Widget)ScriptFrame.client.ex(parentId);
    }
    
    public Widget nl(final int n) {
        return this.zn(-1, n);
    }
    
    public String[] getActions() {
        return this.actions;
    }
    
    public boolean db() {
        return 11 == 883712245 * this.type || 12 == this.type * 883712245;
    }
    
    public void me(final int n) {
        if (this.js > -1) {
            this.setRelativeX(this.js);
        }
    }
    
    public int getId() {
        return this.id * 1713081171;
    }
    
    public static Widget bw(final int n) {
        final int n2 = n >> 16;
        final int n3 = n & 0xFFFF;
        if ((VerticalAlignment.Widget_interfaceComponents[n2] == null || VerticalAlignment.Widget_interfaceComponents[n2][n3] == null) && !SoundSystem.loadInterface(n2, 1376777516)) {
            return null;
        }
        return VerticalAlignment.Widget_interfaceComponents[n2][n3];
    }
    
    public static String lf(final Widget widget, final String s) {
        if (widget == null) {
            widget.en(s);
        }
        if (11 != widget.type * 883712245 || null == widget.field2868 || !widget.method1807(439768721)) {
            return null;
        }
        return class166.ya(widget.field2868, s, (byte)70);
    }
    
    Object[] cf(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra == 0) {
            return null;
        }
        final Object[] array = new Object[ra];
        for (int i = 0; i < ra; ++i) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 == 0) {
                array[i] = new Integer(buffer.readInt(-1652404489));
            }
            else if (ra2 != 0) {
                array[i] = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        this.field2978 = true;
        return array;
    }
    
    SpritePixels cw(final UrlRequester urlRequester) {
        if (this.spellActionName != null && null != urlRequester) {
            class311 class311 = (class311)Widget.field2878.method2126(this.spellActionName, (short)7662);
            if (null == class311) {
                class311 = new class311(this.spellActionName, urlRequester);
                Widget.field2878.method2122(this.spellActionName, class311, 747668912);
            }
            return class311.method1690((byte)19);
        }
        return null;
    }
    
    SpritePixels cv(final UrlRequester urlRequester) {
        if (!this.method1796((byte)(-76))) {
            return this.method1825(urlRequester, (byte)1);
        }
        final String string = this.spellActionName + (this.noClickThrough ? 1 : 0) + (this.textShadowed ? 1 : 0) + this.outline * 1638912775 + -353676735 * this.spriteShadow;
        SpritePixels method2602 = (SpritePixels)Widget.field2867.method2126(string, (short)843);
        if (null == method2602) {
            final SpritePixels method2603 = this.method1825(urlRequester, (byte)1);
            if (null != method2603) {
                method2602 = method2603.method2602();
                this.method1797(method2602, 225796659);
                Widget.field2867.method2122(string, method2602, 747668912);
            }
        }
        return method2602;
    }
    
    boolean method1796(final byte b) {
        try {
            if (this.noClickThrough) {
                return true;
            }
            if (b >= 0) {
                throw new IllegalStateException();
            }
            if (this.textShadowed || 0 != 1638912775 * this.outline) {
                return true;
            }
            if (b >= 0) {
                throw new IllegalStateException();
            }
            boolean b2;
            if (0 != this.spriteShadow * -353676735) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                return true;
            }
            else {
                b2 = false;
            }
            return b2;
            b2 = true;
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ao(" + ')');
        }
    }
    
    public int getType() {
        return this.type * 883712245;
    }
    
    public class312 fw() {
        return this.field2951;
    }
    
    public static void ft(final Widget widget, final int n, final int n2) {
        widget.field2894.equipment[n] = n2;
        widget.field2894.setHash(-469114674);
    }
    
    public Widget getSprite(final int n) {
        this.modelAngleY = n * -230241203;
        return this;
    }
    
    public SpritePixels getSprite(final boolean b, final UrlRequester urlRequester, final byte b2) {
        if (this.getSpriteId() != -1) {
            final net.runelite.api.SpritePixels spritePixels = Client.qp.get(this.getId());
            if (spritePixels != null) {
                return (SpritePixels)spritePixels;
            }
        }
        final boolean b3 = false;
        SpritePixels spritePixels2;
        try {
            Widget.field2877 = false;
            if (null != this.spellActionName) {
                final SpritePixels method1826 = this.method1826(urlRequester, (byte)42);
                if (null != method1826) {
                    spritePixels2 = method1826;
                    return spritePixels2;
                }
            }
            int n;
            if (b) {
                if (b3) {
                    throw new IllegalStateException();
                }
                n = -1352724779 * this.spriteId;
            }
            else {
                n = -363627527 * this.spriteId2;
            }
            if (n == -1) {
                if (b3) {
                    throw new IllegalStateException();
                }
                spritePixels2 = null;
            }
            else {
                final long n2 = (long)(this.spriteShadow * -353676735) << 40;
                long n3;
                if (this.noClickThrough) {
                    if (b3) {
                        throw new IllegalStateException();
                    }
                    n3 = 1L;
                }
                else {
                    n3 = 0L;
                }
                final long n4 = (n3 << 38) + (((long)(this.outline * 1638912775) << 36) + n);
                long n5;
                if (this.textShadowed) {
                    if (b3) {
                        throw new IllegalStateException();
                    }
                    n5 = 1L;
                }
                else {
                    n5 = 0L;
                }
                final long n6 = n2 + (n4 + (n5 << 39));
                final SpritePixels spritePixels3 = (SpritePixels)Widget.Widget_cachedSprites.wr(n6);
                if (null != spritePixels3) {
                    if (b3) {
                        throw new IllegalStateException();
                    }
                    spritePixels2 = spritePixels3;
                }
                else {
                    final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(ScriptEvent.Widget_spritesArchive, n, 0, 1921565071);
                    if (null == spriteBuffer_getSprite) {
                        if (b3) {
                            throw new IllegalStateException();
                        }
                        Widget.field2877 = true;
                        spritePixels2 = null;
                    }
                    else {
                        this.method1797(spriteBuffer_getSprite, -2012216835);
                        Widget.Widget_cachedSprites.put(spriteBuffer_getSprite, n6);
                        spritePixels2 = spriteBuffer_getSprite;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.at(" + ')');
        }
        return spritePixels2;
    }
    
    public void method1802(final String s, final UrlRequester urlRequester, final int n) {
        try {
            if (883712245 * this.type == 11) {
                if (n != 554088678) {
                    return;
                }
                if (null != s) {
                    class166.la(this.field2868 = new class166(), s, urlRequester, -1306660801);
                    return;
                }
                if (n != 554088678) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ak(" + ')');
        }
    }
    
    public Model dw(final SequenceDefinition sequenceDefinition, final int n, final boolean b, final PlayerComposition playerComposition, final NPCComposition npcComposition, final NewShit newShit) {
        Widget.field2877 = false;
        int n2;
        int n3;
        if (b) {
            n2 = this.modelType2 * 1761517389;
            n3 = this.modelId2 * -3148259;
        }
        else {
            n2 = this.modelType * -123768459;
            n3 = this.modelId * -168077555;
        }
        if (6 == n2) {
            if (null == npcComposition) {
                return null;
            }
            n3 = npcComposition.id * -1115372301;
        }
        if (n2 == 0) {
            return null;
        }
        if (n2 && -1 == n3) {
            return null;
        }
        if (newShit != null && newShit.field1558 && 6 == n2) {
            n2 = 3;
        }
        long n4 = n3 + (n2 << 16);
        if (newShit != null) {
            n4 |= newShit.field1556 * -1176524468931644747L << 20;
        }
        Model model = (Model)Widget.Widget_cachedModels.wr(n4);
        if (model == null) {
            ModelData modelData = null;
            int n5 = 64;
            int n6 = 768;
            switch (n2) {
                case 6: {
                    modelData = AbstractArchive.getNpcDefinition(n3, (byte)5).method1022(newShit, (byte)64);
                    break;
                }
                case 1: {
                    modelData = ModelData.ModelData_get(DynamicObject.field813, n3, 0);
                    break;
                }
                case 4: {
                    final ItemComposition set = HealthBarUpdate.set(n3, (byte)87);
                    modelData = set.getModelData(10, -305031719);
                    n5 += set.field1780 * 2093614773;
                    n6 += 1794294545 * set.field1781;
                    break;
                }
                case 3: {
                    modelData = ((null != playerComposition) ? playerComposition.getModelData((byte)97) : null);
                    break;
                }
                case 2: {
                    modelData = AbstractArchive.getNpcDefinition(n3, (byte)(-111)).method1022(null, (byte)64);
                    break;
                }
            }
            if (modelData == null) {
                Widget.field2877 = true;
                return null;
            }
            model = modelData.dg(n5, n6, -50, -10, -50);
            Widget.Widget_cachedModels.put(model, n4);
        }
        if (sequenceDefinition != null) {
            model = sequenceDefinition.transformWidgetModel(model, n, (byte)41);
        }
        return model;
    }
    
    boolean cj() {
        return this.noClickThrough || this.textShadowed || 0 != 1638912775 * this.outline || 0 != this.spriteShadow * -353676735;
    }
    
    public int method1810(final int n) {
        try {
            if (this.field2950 == null) {
                return 0;
            }
            if (n == -1440515106) {
                throw new IllegalStateException();
            }
            if (this.field2950.size() <= 0) {
                return 0;
            }
            if (n == -1440515106) {
                throw new IllegalStateException();
            }
            boolean b = true;
            return b ? 1 : 0;
            b = false;
            return b ? 1 : 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.be(" + ')');
        }
    }
    
    void cp(final SpritePixels spritePixels) {
        if (this.noClickThrough) {
            SecureRandomCallable.ig(spritePixels);
        }
        if (this.textShadowed) {
            SpritePixels.xw(spritePixels);
        }
        if (1638912775 * this.outline > 0) {
            SpritePixels.jx(spritePixels, 1638912775 * this.outline);
        }
        if (this.outline * 1638912775 >= 1) {
            spritePixels.outline(1);
        }
        if (1638912775 * this.outline >= 2) {
            spritePixels.outline(16777215);
        }
        if (0 != -353676735 * this.spriteShadow) {
            spritePixels.shadow(-353676735 * this.spriteShadow);
        }
    }
    
    public boolean method1808(final int n) {
        try {
            boolean b;
            if (2 == 1888225603 * this.field2948) {
                if (n == 577525846) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.by(" + ')');
        }
    }
    
    public int ek() {
        return (this.field2950 != null && this.field2950.size() > 0) ? 1 : 0;
    }
    
    public int eh() {
        if (this.type * 883712245 != 11 || null == this.field2868 || this.field2950 == null || this.field2950.isEmpty()) {
            return -1;
        }
        final String li = class166.li(this.field2868, (byte)84);
        if (li != null && this.field2950.containsKey(class166.li(this.field2868, (byte)101))) {
            return (int)this.field2950.get(li);
        }
        return -1;
    }
    
    public static void fk(final Widget widget, final int n, final int n2) {
        final PlayerComposition field2894 = widget.field2894;
        final boolean b = n2 != 698121858 * field2894.npcTransformId;
        field2894.npcTransformId = 325591525 * n2;
        if (b) {
            if (653057724 * field2894.npcTransformId == n) {
                for (int i = 0; i < PlayerComposition.equipmentIndices.length; ++i) {
                    final int n3 = PlayerComposition.equipmentIndices[i];
                    if (field2894.field2841[n3] > 0 && field2894.field2841[n3] < -198677777) {
                        field2894.field2841[n3] = field2894.bodyColors[n3];
                    }
                }
            }
            else {
                Label_0284: {
                    if (field2894.field2841[0] >= 512) {
                        int n4;
                        if (field2894.field2841[0] >= 1572346656) {
                            final ItemComposition set = HealthBarUpdate.set(field2894.field2841[0] - 512, (byte)36);
                            n4 = ((622494345 * class204.field1840.field1831 != set.maleModel1 * 1744550049 && class204.field1840.field1831 * -2043815442 != 1147172099 * set.maleModel2) ? 1 : 0);
                        }
                        else {
                            n4 = 0;
                        }
                        if (n4 == 0) {
                            break Label_0284;
                        }
                    }
                    field2894.field2841[622494345 * class204.field1840.field1831] = 1;
                }
                for (int j = 0; j < 7; ++j) {
                    final int n5 = PlayerComposition.equipmentIndices[j];
                    if (field2894.field2841[n5] > 0 && field2894.field2841[n5] < 1543256714) {
                        class163.method915(n2, field2894.field2841, j, 2022197315);
                    }
                }
            }
        }
        field2894.setHash(-469114674);
    }
    
    public boolean fh(final UrlRequester urlRequester) {
        if (this.type * 883712245 == 11 && this.field2868 != null) {
            class166.qr(this.field2868, urlRequester, (byte)(-62));
            if (this.field2868.method926((byte)(-8)) != this.field2948 * 1888225603) {
                this.field2948 = this.field2868.method926((byte)(-96)) * 996199275;
                if (this.field2948 * 1888225603 >= -1818901544) {
                    return true;
                }
                if (2 == this.field2948 * 424418513) {
                    this.method1813(1652307373);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public int ev() {
        return this.parentId * 913615679;
    }
    
    public Widget ev(final int n) {
        this.xAlignment = n * 1656805111;
        return this;
    }
    
    public static boolean pv(final Widget widget, final int n) {
        if (widget == null) {
            widget.method1801(n);
        }
        try {
            if (widget.modelOrthog && 883712245 * widget.type != 0 && widget.type * 883712245 != 11) {
                if (n >= -1330251867) {
                    throw new IllegalStateException();
                }
                if (!widget.field2978) {
                    if (n >= -1330251867) {
                        throw new IllegalStateException();
                    }
                    if (1338 != widget.contentType * 1021339961) {
                        if (12 != 883712245 * widget.type) {
                            return false;
                        }
                        if (n >= -1330251867) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.am(" + ')');
        }
    }
    
    public Widget ks(final int n) {
        this.spriteId2 = n * -504605111;
        return this;
    }
    
    public Widget hn(final int n) {
        this.modelAngleZ = n * -1051718121;
        return this;
    }
    
    public static Model hn(final Widget widget, final SequenceDefinition sequenceDefinition, final int n, final boolean b, final PlayerComposition playerComposition, final NPCComposition npcComposition, final NewShit newShit) {
        if (widget == null) {
            widget.dm(sequenceDefinition, n, b, playerComposition, npcComposition, newShit);
        }
        Widget.field2877 = false;
        int n2;
        int n3;
        if (b) {
            n2 = widget.modelType2 * 1761517389;
            n3 = widget.modelId2 * 184965049;
        }
        else {
            n2 = widget.modelType * -133720257;
            n3 = widget.modelId * -168077555;
        }
        if (6 == n2) {
            if (null == npcComposition) {
                return null;
            }
            n3 = npcComposition.id * -1115372301;
        }
        if (n2 == 0) {
            return null;
        }
        if (n2 && -1 == n3) {
            return null;
        }
        if (newShit != null && newShit.field1558 && 6 == n2) {
            n2 = 3;
        }
        long n4 = n3 + (n2 << 16);
        if (newShit != null) {
            n4 |= newShit.field1556 * -1176524468931644747L << 20;
        }
        Model model = (Model)Widget.Widget_cachedModels.wr(n4);
        if (model == null) {
            ModelData modelData = null;
            int n5 = 443168773;
            int n6 = 64664126;
            switch (n2) {
                case 6: {
                    modelData = AbstractArchive.getNpcDefinition(n3, (byte)0).method1022(newShit, (byte)64);
                    break;
                }
                case 1: {
                    modelData = ModelData.ModelData_get(DynamicObject.field813, n3, 0);
                    break;
                }
                case 4: {
                    final ItemComposition set = HealthBarUpdate.set(n3, (byte)17);
                    modelData = set.getModelData(10, -305031719);
                    n5 += set.field1780 * 2093614773;
                    n6 += 1794294545 * set.field1781;
                    break;
                }
                case 3: {
                    modelData = ((null != playerComposition) ? playerComposition.getModelData((byte)98) : null);
                    break;
                }
                case 2: {
                    modelData = AbstractArchive.getNpcDefinition(n3, (byte)(-128)).method1022(null, (byte)64);
                    break;
                }
            }
            if (modelData == null) {
                Widget.field2877 = true;
                return null;
            }
            model = modelData.dg(n5, n6, -1280133797, 855169405, 1174270507);
            Widget.Widget_cachedModels.put(model, n4);
        }
        if (sequenceDefinition != null) {
            model = sequenceDefinition.transformWidgetModel(model, n, (byte)31);
        }
        return model;
    }
    
    public static Object[] pk(final Widget widget, final Buffer buffer, final int n) {
        if (widget == null) {
            widget.readListener(buffer, n);
        }
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra != 0) {
                final Object[] array = new Object[ra];
                for (int i = 0; i < ra; ++i) {
                    if (n != -1943743675) {
                        throw new IllegalStateException();
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    if (ra2 == 0) {
                        array[i] = new Integer(buffer.readInt(-1903835442));
                    }
                    else if (ra2 != 0) {
                        if (n != -1943743675) {
                            throw new IllegalStateException();
                        }
                        array[i] = buffer.readStringCp1252NullTerminated((byte)0);
                    }
                }
                widget.field2978 = true;
                return array;
            }
            if (n != -1943743675) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.aq(" + ')');
        }
    }
    
    public void eq(final String key, final int i) {
        if (11 != 883712245 * this.type) {
            return;
        }
        if (null == this.field2950) {
            nk(this, (byte)(-83));
        }
        this.field2950.put(key, i);
    }
    
    public int getIndex() {
        return this.childIndex * 55577617;
    }
    
    public int[] ee() {
        if (11 == 883712245 * this.type && this.field2868 != null) {
            final int[] array = new int[3];
            int n = 0;
            for (final class177 class177 : this.field2868.method931(1848568122)) {
                if (!class177.method963((byte)(-4)).equals("user_id")) {
                    if (class177.vmethod3379((byte)21) != 0) {
                        return null;
                    }
                    array[n++] = class177.vmethod3378(393772679);
                    if (n > 3) {
                        return null;
                    }
                    continue;
                }
            }
            return array;
        }
        return null;
    }
    
    void method1823(final byte b) {
        try {
            this.field2950 = new HashMap();
            this.field2949 = new HashMap();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.az(" + ')');
        }
    }
    
    void method1797(final SpritePixels spritePixels, final int n) {
        try {
            if (this.noClickThrough) {
                if (n == 201150742) {
                    throw new IllegalStateException();
                }
                SecureRandomCallable.ig(spritePixels);
            }
            if (this.textShadowed) {
                SpritePixels.xw(spritePixels);
            }
            if (1638912775 * this.outline > 0) {
                if (n == 201150742) {
                    throw new IllegalStateException();
                }
                SpritePixels.jx(spritePixels, 1638912775 * this.outline);
            }
            if (this.outline * 1638912775 >= 1) {
                if (n == 201150742) {
                    throw new IllegalStateException();
                }
                spritePixels.outline(1);
            }
            if (1638912775 * this.outline >= 2) {
                if (n == 201150742) {
                    throw new IllegalStateException();
                }
                spritePixels.outline(16777215);
            }
            if (0 != -353676735 * this.spriteShadow) {
                if (n == 201150742) {
                    throw new IllegalStateException();
                }
                spritePixels.shadow(-353676735 * this.spriteShadow);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ax(" + ')');
        }
    }
    
    SpritePixels method1825(final UrlRequester urlRequester, final byte b) {
        try {
            if (this.spellActionName != null) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                if (null != urlRequester) {
                    if (b != 1) {
                        throw new IllegalStateException();
                    }
                    class311 class311 = (class311)Widget.field2878.method2126(this.spellActionName, (short)21675);
                    if (null == class311) {
                        if (b != 1) {
                            throw new IllegalStateException();
                        }
                        class311 = new class311(this.spellActionName, urlRequester);
                        Widget.field2878.method2122(this.spellActionName, class311, 747668912);
                    }
                    return class311.method1690((byte)26);
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ay(" + ')');
        }
    }
    
    public void dt(final int n, final String s) {
        if (null == this.actions || this.actions.length <= n) {
            final String[] actions = new String[n + 1];
            if (this.actions != null) {
                for (int i = 0; i < this.actions.length; ++i) {
                    actions[i] = this.actions[i];
                }
            }
            this.actions = actions;
        }
        this.actions[n] = s;
    }
    
    public Widget us(final int n, final int n2) {
        return this.dx(n).tt(n2);
    }
    
    public String method1809(final String s, final int n) {
        try {
            if (11 == this.type * 883712245 && null != this.field2868) {
                if (n >= 549613875) {
                    throw new IllegalStateException();
                }
                if (this.method1807(1306716058)) {
                    return class166.ya(this.field2868, s, (byte)16);
                }
                if (n >= 549613875) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bi(" + ')');
        }
    }
    
    boolean fc(final class314 class314) {
        int n = 0;
        if (null != this.field2916 && !this.field2916.isEmpty()) {
            final int n2 = n;
            final String field2916 = this.field2916;
            final StringBuilder sb = new StringBuilder(field2916.length());
            int n3 = 0;
            int n4 = -1;
            for (int i = 0; i < field2916.length(); ++i) {
                final char char1 = field2916.charAt(i);
                if (char1 == '<') {
                    sb.append(field2916.substring(n3, i));
                    n4 = i;
                }
                else if (char1 == '>' && -1 != n4) {
                    final String substring = field2916.substring(n4 + 1, i);
                    n4 = -1;
                    if (substring.equals("lt")) {
                        sb.append("<");
                    }
                    else if (substring.equals("gt")) {
                        sb.append(">");
                    }
                    else if (substring.equals("br")) {
                        sb.append("\n");
                    }
                    n3 = 1 + i;
                }
            }
            if (n3 < field2916.length()) {
                sb.append(field2916.substring(n3, field2916.length()));
            }
            n = (n2 | (class314.method1708(sb.toString(), 1585004793) ? 1 : 0));
            this.field2916 = "";
        }
        if (null != this.buttonText && !this.buttonText.isEmpty()) {
            final boolean b = n != 0;
            final String buttonText = this.buttonText;
            final StringBuilder sb2 = new StringBuilder(buttonText.length());
            int n5 = 0;
            int n6 = -1;
            for (int j = 0; j < buttonText.length(); ++j) {
                final char char2 = buttonText.charAt(j);
                if ('<' == char2) {
                    sb2.append(buttonText.substring(n5, j));
                    n6 = j;
                }
                else if (-478455053 == char2 && -1 != n6) {
                    final String substring2 = buttonText.substring(1 + n6, j);
                    n6 = -1;
                    if (substring2.equals("lt")) {
                        sb2.append("<");
                    }
                    else if (substring2.equals("gt")) {
                        sb2.append(">");
                    }
                    else if (substring2.equals("br")) {
                        sb2.append("\n");
                    }
                    n5 = 1 + j;
                }
            }
            if (n5 < buttonText.length()) {
                sb2.append(buttonText.substring(n5, buttonText.length()));
            }
            n = ((b | class314.method1709(sb2.toString(), (byte)2)) ? 1 : 0);
            this.buttonText = "";
        }
        return n != 0;
    }
    
    public Widget wc(final net.runelite.api.widgets.Widget widget) {
        this.parent = (Widget)widget;
        return this;
    }
    
    public void dl(final int n, final String s) {
        if (null == this.actions || this.actions.length <= n) {
            final String[] actions = new String[n + 1];
            if (this.actions != null) {
                for (int i = 0; i < this.actions.length; ++i) {
                    actions[i] = this.actions[i];
                }
            }
            this.actions = actions;
        }
        this.actions[n] = s;
    }
    
    public void dl(final int n) {
        this.parentId = n * 908641471;
    }
    
    public Widget ua(final int n, final int n2) {
        return this.ly(n).uu(n2);
    }
    
    void ck(final Buffer buffer) {
        Buffer.ra(buffer, (byte)7);
        this.modelOrthog = true;
        this.type = Buffer.ra(buffer, (byte)7) * -1183495331;
        this.contentType = buffer.readUnsignedShort(158634788) * 577746185;
        this.rawX = buffer.readUnsignedByte((byte)(-18)) * 1806877347;
        this.rawY = buffer.readUnsignedByte((byte)(-53)) * 1231090287;
        this.rawWidth = buffer.readUnsignedShort(402623901) * -1495372107;
        if (9 == this.type * 883712245) {
            this.rawHeight = buffer.readUnsignedByte((byte)(-9)) * 1193771871;
        }
        else {
            this.rawHeight = buffer.readUnsignedShort(-2142264367) * 1193771871;
        }
        this.widthAlignment = Buffer.wu(buffer, 435772489) * 387308049;
        this.heightAlignment = Buffer.wu(buffer, 435772489) * -480958745;
        this.xAlignment = Buffer.wu(buffer, 435772489) * 1656805111;
        this.yAlignment = Buffer.wu(buffer, 435772489) * -362988363;
        this.parentId = buffer.readUnsignedShort(-1858290629) * 908641471;
        if (this.parentId * 913615679 == 65535) {
            this.parentId = -908641471;
        }
        else {
            this.parentId = 908641471 * (913615679 * this.parentId + (1713081171 * this.id & 0xFFFF0000));
        }
        this.spriteTiling = (Buffer.ra(buffer, (byte)7) == 1);
        if (this.type * 883712245 == 0) {
            this.scrollWidth = buffer.readUnsignedShort(-44000347) * -1469650905;
            this.scrollHeight = buffer.readUnsignedShort(21998786) * -1357451643;
            this.hasListener = (Buffer.ra(buffer, (byte)7) == 1);
        }
        if (this.type * 883712245 == 5) {
            this.spriteId2 = buffer.readInt(-990982628) * -504605111;
            this.spriteAngle = buffer.readUnsignedShort(353438903) * 877496813;
            this.field2913 = (Buffer.ra(buffer, (byte)7) == 1);
            this.transparencyTop = Buffer.ra(buffer, (byte)7) * 1833148663;
            this.outline = Buffer.ra(buffer, (byte)7) * 646392503;
            this.spriteShadow = buffer.readInt(-963756568) * -140657215;
            this.noClickThrough = (Buffer.ra(buffer, (byte)7) == 1);
            this.textShadowed = (Buffer.ra(buffer, (byte)7) == 1);
        }
        if (this.type * 883712245 == 6) {
            this.modelType = -1714481443;
            this.modelId = buffer.readUnsignedShort(-915399037) * 509431749;
            if (this.modelId * -168077555 == 65535) {
                this.modelId = -509431749;
            }
            this.modelOffsetX = buffer.readUnsignedByte((byte)(-35)) * 1759898391;
            this.modelOffsetY = buffer.readUnsignedByte((byte)(-57)) * 1163821709;
            this.modelAngleX = buffer.readUnsignedShort(623530495) * -142910041;
            this.modelAngleY = buffer.readUnsignedShort(-656119090) * -230241203;
            this.modelAngleZ = buffer.readUnsignedShort(-1924766879) * -1051718121;
            this.modelZoom = buffer.readUnsignedShort(450527250) * -467727501;
            this.sequenceId = buffer.readUnsignedShort(-191058026) * -1195025605;
            if (this.sequenceId * -1526544909 == 65535) {
                this.sequenceId = 1195025605;
            }
            this.field2891 = (Buffer.ra(buffer, (byte)7) == 1);
            buffer.readUnsignedShort(-208866206);
            if (241981169 * this.widthAlignment != 0) {
                this.modelRotation = buffer.readUnsignedShort(-1042359838) * 1436736911;
            }
            if (0 != this.heightAlignment * -480604969) {
                buffer.readUnsignedShort(62942366);
            }
        }
        if (4 == 883712245 * this.type) {
            this.fontId = buffer.readUnsignedShort(95002079) * 1858899927;
            if (this.fontId * -1065036825 == 65535) {
                this.fontId = -1858899927;
            }
            this.field2916 = buffer.readStringCp1252NullTerminated((byte)0);
            this.textLineHeight = Buffer.ra(buffer, (byte)7) * 2116078665;
            this.textXAlignment = Buffer.ra(buffer, (byte)7) * 1612549297;
            this.textYAlignment = Buffer.ra(buffer, (byte)7) * -522107433;
            this.isIf3 = (Buffer.ra(buffer, (byte)7) == 1);
            this.color = buffer.readInt(-1262976483) * -1604768377;
        }
        if (3 == 883712245 * this.type) {
            this.color = buffer.readInt(-1474851812) * -1604768377;
            this.noScrollThrough = (Buffer.ra(buffer, (byte)7) == 1);
            this.transparencyTop = Buffer.ra(buffer, (byte)7) * 1833148663;
        }
        if (883712245 * this.type == 9) {
            this.lineWid = Buffer.ra(buffer, (byte)7) * 1040382753;
            this.color = buffer.readInt(-1886428557) * -1604768377;
            this.isScrollBar = (Buffer.ra(buffer, (byte)7) == 1);
        }
        this.flags = buffer.readMedium(12016978) * -882629235;
        this.field3004 = buffer.readStringCp1252NullTerminated((byte)0);
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra > 0) {
            this.actions = new String[ra];
            for (int i = 0; i < ra; ++i) {
                this.actions[i] = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        this.dragZoneSize = Buffer.ra(buffer, (byte)7) * 1773001161;
        this.dragThreshold = Buffer.ra(buffer, (byte)7) * 1466803237;
        this.spriteFlipH = (Buffer.ra(buffer, (byte)7) == 1);
        this.text2 = buffer.readStringCp1252NullTerminated((byte)0);
        this.onLoad = pk(this, buffer, -1943743675);
        this.onMouseOver = pk(this, buffer, -1943743675);
        this.onMouseLeave = pk(this, buffer, -1943743675);
        this.onTargetLeave = pk(this, buffer, -1943743675);
        this.onTargetEnter = pk(this, buffer, -1943743675);
        this.onVarTransmit = pk(this, buffer, -1943743675);
        this.onInvTransmit = pk(this, buffer, -1943743675);
        this.onStatTransmit = pk(this, buffer, -1943743675);
        this.onTimer = pk(this, buffer, -1943743675);
        this.onOp = pk(this, buffer, -1943743675);
        this.onMouseRepeat = pk(this, buffer, -1943743675);
        this.onClick = pk(this, buffer, -1943743675);
        this.onClickRepeat = pk(this, buffer, -1943743675);
        this.onRelease = pk(this, buffer, -1943743675);
        this.onHold = pk(this, buffer, -1943743675);
        this.onDrag = pk(this, buffer, -1943743675);
        this.onDragComplete = pk(this, buffer, -1943743675);
        this.onScroll = pk(this, buffer, -1943743675);
        this.varTransmitTriggers = ip(this, buffer, 1664985017);
        this.invTransmitTriggers = ip(this, buffer, 1664985017);
        this.statTransmitTriggers = ip(this, buffer, 1664985017);
    }
    
    public int[] method1812(final int n) {
        try {
            if (11 == 883712245 * this.type) {
                if (n != 574261316) {
                    throw new IllegalStateException();
                }
                if (this.field2868 != null) {
                    final int[] array = new int[3];
                    int n2 = 0;
                    final Iterator<class177> iterator = this.field2868.method931(1040030333).iterator();
                    while (iterator.hasNext()) {
                        if (n != 574261316) {
                            throw new IllegalStateException();
                        }
                        final class177 class177 = iterator.next();
                        if (class177.method963((byte)(-44)).equals("user_id")) {
                            continue;
                        }
                        if (n != 574261316) {
                            throw new IllegalStateException();
                        }
                        if (class177.vmethod3379((byte)(-8)) != 0) {
                            return null;
                        }
                        if (n != 574261316) {
                            throw new IllegalStateException();
                        }
                        array[n2++] = class177.vmethod3378(974898818);
                        if (n2 <= 3) {
                            continue;
                        }
                        if (n != 574261316) {
                            throw new IllegalStateException();
                        }
                        return null;
                    }
                    return array;
                }
                if (n != 574261316) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bo(" + ')');
        }
    }
    
    public static void di() {
        Widget.Widget_cachedSprites.clear();
        Widget.Widget_cachedModels.clear();
        Widget.Widget_cachedFonts.clear();
        Widget.Widget_cachedSpriteMasks.clear();
    }
    
    public static boolean ms(final Widget widget, int n, int n2, final int n3, final int n4, final byte b) {
        if (widget == null) {
            widget.method1806(n, n, n, n, b);
        }
        try {
            if (883712245 * widget.type == 11 && null != widget.field2868) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                if (widget.method1807(-2127450908)) {
                    n -= n3;
                    n2 -= n4;
                    final int n5 = (int)(widget.field2868.method930(2102888659)[0] * (widget.width * -794961409));
                    final int n6 = (int)(widget.field2868.method930(2104665215)[1] * (1473950221 * widget.height));
                    final int n7 = n5 + (int)(widget.field2868.method930(2087104002)[2] * (widget.width * -794961409));
                    final int n8 = n6 + (int)(widget.field2868.method930(2113655795)[3] * (1473950221 * widget.height));
                    if (n >= n5 && n2 >= n6) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        if (n < n7 && n2 < n8) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ap(" + ')');
        }
    }
    
    public boolean fs(final UrlRequester urlRequester) {
        if (this.type * -49386753 == 11 && this.field2868 != null) {
            class166.qr(this.field2868, urlRequester, (byte)(-24));
            if (this.field2868.method926((byte)(-56)) != this.field2948 * -1359647653) {
                this.field2948 = this.field2868.method926((byte)(-23)) * 996199275;
                if (this.field2948 * 1888225603 >= 1402586910) {
                    return true;
                }
                if (2 == this.field2948 * 728909299) {
                    this.method1813(1652307373);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static void bp(final AbstractArchive widget_archive, final AbstractArchive field813, final AbstractArchive widget_spritesArchive, final AbstractArchive widget_fontsArchive) {
        int groupCount = 0;
        if (null != widget_archive) {
            UserComparator3.Widget_archive = widget_archive;
            DynamicObject.field813 = field813;
            ScriptEvent.Widget_spritesArchive = widget_spritesArchive;
            class146.Widget_fontsArchive = widget_fontsArchive;
            groupCount = UserComparator3.Widget_archive.getGroupCount(-1940723015);
        }
        VerticalAlignment.Widget_interfaceComponents = new Widget[groupCount][];
        class264.Widget_loadedInterfaces = new boolean[groupCount];
    }
    
    public static String ui(final Widget widget, final String s) {
        if (11 == widget.type * 883712245 && null != widget.field2868 && widget.method1807(-1315584835)) {
            return class166.ya(widget.field2868, s, (byte)(-68));
        }
        return null;
    }
    
    void ct(final SpritePixels spritePixels) {
        if (this.noClickThrough) {
            SecureRandomCallable.ig(spritePixels);
        }
        if (this.textShadowed) {
            SpritePixels.xw(spritePixels);
        }
        if (-1616482482 * this.outline > 0) {
            SpritePixels.jx(spritePixels, -1249122125 * this.outline);
        }
        if (this.outline * -621353932 >= 1) {
            spritePixels.outline(1);
        }
        if (1638912775 * this.outline >= 2) {
            spritePixels.outline(62221066);
        }
        if (0 != -353676735 * this.spriteShadow) {
            spritePixels.shadow(-353676735 * this.spriteShadow);
        }
    }
    
    public static Widget cc(final int n, final int n2) {
        final Widget vmethod3380 = class165.vmethod3380(n, (byte)5);
        if (n2 == -1) {
            return vmethod3380;
        }
        if (vmethod3380 != null && null != vmethod3380.children && n2 < vmethod3380.children.length) {
            return vmethod3380.children[n2];
        }
        return null;
    }
    
    public boolean dv() {
        return !this.modelOrthog || 883712245 * this.type == 0 || this.type * 883712245 == 11 || this.field2978 || 1338 == this.contentType * 1021339961 || 12 == 883712245 * this.type;
    }
    
    public static void rw(final Widget widget) {
        if (widget == null) {
            widget.hasListener();
        }
        widget.field2951 = new class312();
        for (int i = 1; i <= 12; ++i) {
            widget.field2951.field2827.method114(i, 0, (byte)0);
        }
        for (char c = '\0'; c < ' '; ++c) {
            widget.field2951.field2827.method115(c, 0, 48495477);
        }
        widget.field2951.field2827.method115('\u0080', 0, 48495477);
        widget.field2951.field2827.method114(82, 2, (byte)0);
        widget.field2951.field2827.method114(81, 2, (byte)0);
        widget.field2951.field2827.method114(86, 2, (byte)0);
    }
    
    public Widget ml(final int n) {
        this.fontId = n * 1858899927;
        return this;
    }
    
    public Widget tt(final int n) {
        this.rawY = n * 1231090287;
        return this;
    }
    
    public void method1814(final byte b) {
        try {
            this.field2951 = new class312();
            for (int i = 1; i <= 12; ++i) {
                this.field2951.field2827.method114(i, 0, (byte)0);
            }
            for (char c = '\0'; c < ' '; ++c) {
                this.field2951.field2827.method115(c, 0, 48495477);
            }
            this.field2951.field2827.method115('\u0080', 0, 48495477);
            this.field2951.field2827.method114(82, 2, (byte)0);
            this.field2951.field2827.method114(81, 2, (byte)0);
            this.field2951.field2827.method114(86, 2, (byte)0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bt(" + ')');
        }
    }
    
    public void ds(final int i, final int j) {
        if (11 != 883712245 * this.type) {
            return;
        }
        if (null == this.field2949) {
            nk(this, (byte)(-79));
        }
        this.field2949.put(i, j);
    }
    
    public static void bc(final AbstractArchive widget_archive, final AbstractArchive field813, final AbstractArchive widget_spritesArchive, final AbstractArchive widget_fontsArchive) {
        int groupCount = 0;
        if (null != widget_archive) {
            UserComparator3.Widget_archive = widget_archive;
            DynamicObject.field813 = field813;
            ScriptEvent.Widget_spritesArchive = widget_spritesArchive;
            class146.Widget_fontsArchive = widget_fontsArchive;
            groupCount = UserComparator3.Widget_archive.getGroupCount(-1038733862);
        }
        VerticalAlignment.Widget_interfaceComponents = new Widget[groupCount][];
        class264.Widget_loadedInterfaces = new boolean[groupCount];
    }
    
    public static void ia(final Widget widget) {
        if (widget == null) {
            widget.lk();
        }
        widget.field2949 = new HashMap();
        widget.field2950 = new HashMap();
    }
    
    public Widget method1818(final int n) {
        this.textXAlignment = n * 1612549297;
        return this;
    }
    
    public class312 method1818(final int n) {
        try {
            return this.field2951;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.br(" + ')');
        }
    }
    
    public int[] ei() {
        if (11 == 1420610855 * this.type && this.field2868 != null) {
            final int[] array = new int[3];
            int n = 0;
            for (final class177 class177 : this.field2868.method931(1491519239)) {
                if (!class177.method963((byte)28).equals("user_id")) {
                    if (class177.vmethod3379((byte)37) != 0) {
                        return null;
                    }
                    array[n++] = class177.vmethod3378(-1554007568);
                    if (n > 3) {
                        return null;
                    }
                    continue;
                }
            }
            return array;
        }
        return null;
    }
    
    public static Widget ci(final int n, final int n2) {
        final Widget vmethod3380 = class165.vmethod3380(n, (byte)5);
        if (n2 == -1) {
            return vmethod3380;
        }
        if (vmethod3380 != null && null != vmethod3380.children && n2 < vmethod3380.children.length) {
            return vmethod3380.children[n2];
        }
        return null;
    }
    
    public String getText() {
        return this.ey().replace(' ', ' ');
    }
    
    public boolean method1801(final int n) {
        try {
            boolean b;
            if (2 == 1888225603 * this.modelType2) {
                if (n == 577525846) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.by(" + ')');
        }
    }
    
    public int em() {
        if (this.type * 883712245 != 11 || (null == this.field2868 || this.field2950 == null) || this.field2950.isEmpty()) {
            return -1;
        }
        final String li = class166.li(this.field2868, (byte)17);
        if (li != null && this.field2950.containsKey(class166.li(this.field2868, (byte)27))) {
            return (int)this.field2950.get(li);
        }
        return -1;
    }
    
    int[] readListenerTriggers(final Buffer buffer, final int n) {
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra != 0) {
                final int[] array = new int[ra];
                for (int i = 0; i < ra; ++i) {
                    if (n != 1664985017) {
                        throw new IllegalStateException();
                    }
                    array[i] = buffer.readMedium(-1979146216);
                }
                return array;
            }
            if (n != 1664985017) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.al(" + ')');
        }
    }
    
    public Widget va(final int n) {
        this.scrollX = n * 66597705;
        return this;
    }
    
    public void df(String replaceAll, final UrlRequester urlRequester, final long i) {
        if (11 != 883712245 * this.type || -1L == i) {
            return;
        }
        replaceAll = replaceAll.replaceAll("%userid%", Long.toString(i));
        this.field2868 = new class166();
        if (!class166.nu(this.field2868, replaceAll, urlRequester, 324045806)) {
            this.field2868 = null;
            return;
        }
        if (null == this.field2949 || this.field2950 == null) {
            nk(this, (byte)(-55));
        }
    }
    
    public boolean et(int n, int n2, final int n3, final int n4) {
        if (883712245 * this.type != 11 || null == this.field2868 || !this.method1807(-1796127799)) {
            return false;
        }
        n -= n3;
        n2 -= n4;
        final int n5 = (int)(this.field2868.method930(2108301794)[0] * (this.width * -794961409));
        final int n6 = (int)(this.field2868.method930(2118198648)[1] * (829655922 * this.height));
        final int n7 = n5 + (int)(this.field2868.method930(2128874951)[2] * (this.width * 1110842778));
        final int n8 = n6 + (int)(this.field2868.method930(2082244215)[3] * (1874382989 * this.height));
        return n >= n5 && n2 >= n6 && n < n7 && n2 < n8;
    }
    
    void cu(final Buffer buffer) {
        Buffer.ra(buffer, (byte)7);
        this.isIf3 = true;
        this.id = Buffer.ra(buffer, (byte)7) * -1183495331;
        this.modelId = buffer.readUnsignedShortAddLE(844784458) * 577746185;
        this.field2870 = buffer.readUnsignedByteNeg((byte)(-39)) * 1806877347;
        this.dragZoneSize = buffer.method2529((byte)(-97)) * -1553874236;
        this.modelRotation = buffer.jn(-137360841) * -1495372107;
        if (9 == this.modelFrame * -710788397) {
            this.modelId = buffer.method2523((byte)(-65)) * 1849058192;
        }
        else {
            this.height = buffer.jn(114223544) * -1319602417;
        }
        this.flags = Buffer.wu(buffer, 435772489) * 387308049;
        this.scrollHeight = Buffer.wu(buffer, 435772489) * -480958745;
        this.modelZoom = Buffer.wu(buffer, 435772489) * 365177477;
        this.parentId = Buffer.wu(buffer, 435772489) * -362988363;
        this.id = buffer.readUnsignedByteAdd(-714835800) * 908641471;
        if (this.widthAlignment * 1210575748 == 65535) {
            this.vc = 583677323;
        }
        else {
            this.modelOffsetX = -1163217892 * (913615679 * this.width + (-972440119 * this.scrollWidth & 0xE3B2FA37));
        }
        this.spriteTiling = (Buffer.ra(buffer, (byte)7) == 1);
        if (this.sequenceId * 1485466991 == 0) {
            this.cycle = buffer.method2513(-140474307) * -1469650905;
            this.spriteShadow = buffer.method2513(-1229725433) * -1357451643;
            this.field2969 = (Buffer.ra(buffer, (byte)7) == 1);
        }
        if (this.modelFrameCycle * 1984404542 == 5) {
            this.fontId = buffer.method2516(-1844224948) * -504605111;
            this.rawHeight = buffer.readVarInt(-391054887) * 877496813;
            this.isHidden = (Buffer.ra(buffer, (byte)7) == 1);
            this.scrollHeight = Buffer.ra(buffer, (byte)7) * 1833148663;
            this.x = Buffer.ra(buffer, (byte)7) * 646392503;
            this.type = buffer._readUnsignedByteSub(-1434819639) * -140657215;
            this.hasListener = (Buffer.ra(buffer, (byte)7) == 1);
            this.fill = (Buffer.ra(buffer, (byte)7) == 1);
        }
        if (this.textXAlignment * 883712245 == 6) {
            this.scrollWidth = -1269646810;
            this.rootIndex = buffer.method2518(260568387) * 509431749;
            if (this.vc * -168077555 == -1356936563) {
                this.type = -256678604;
            }
            this.spriteAngle = buffer.method2529((byte)(-100)) * 1759898391;
            this.kw = buffer.method2523((byte)(-67)) * -2018580308;
            this.modelOffsetX = buffer.method2516(-1540757291) * 597754703;
            this.field2870 = buffer.method2513(497014315) * -230241203;
            this.transparencyTop = buffer.readUnsignedShortAddLE(-1602276567) * 2056326315;
            this.yAlignment = buffer.readMedium(385645788) * -467727501;
            this.textLineHeight = buffer.readMedium(-207378272) * 1669602039;
            if (this.rawWidth * 1258254807 == 65535) {
                this.rawWidth = 1195025605;
            }
            this.textShadowed = (Buffer.ra(buffer, (byte)7) == 1);
            buffer.method2513(-192548717);
            if (-1915305180 * this.spriteId2 != 0) {
                this.sequenceId = buffer._readUnsignedByteSub(-367516960) * 1436736911;
            }
            if (0 != this.mouseOverColor * -480604969) {
                buffer.method2498(-383905346);
            }
        }
        if (4 == 883712245 * this.spriteAngle) {
            this.qa = buffer.readUnsignedShort(-242533504) * 1481896181;
            if (this.modelAngleY * 600958440 == 65535) {
                this.modelFrameCycle = -1858899927;
            }
            this.buttonText = buffer.readStringCp1252NullTerminatedOrNull((byte)0);
            this.field3015 = Buffer.ra(buffer, (byte)7) * -530231764;
            this.itemQuantity = Buffer.ra(buffer, (byte)7) * 1612549297;
            this.type = Buffer.ra(buffer, (byte)7) * -522107433;
            this.spriteFlipV = (Buffer.ra(buffer, (byte)7) == 1);
            this.outline = buffer._readUnsignedByteSub(-1575807963) * -1604768377;
        }
        if (3 == 883712245 * this.spriteId2) {
            this.itemQuantityMode = buffer._readUnsignedByteSub(-1454914812) * -544624979;
            this.field2913 = (Buffer.ra(buffer, (byte)7) == 1);
            this.transparencyBot = Buffer.ra(buffer, (byte)7) * -1066042954;
        }
        if (-1191635968 * this.modelId == 9) {
            this.sequenceId2 = Buffer.ra(buffer, (byte)7) * 1040382753;
            this.scrollY = buffer.method2491(-1461603469) * -1424102030;
            this.noScrollThrough = (Buffer.ra(buffer, (byte)7) == 1);
        }
        this.heightAlignment = buffer.readUnsignedShortAddLE(1361717732) * -882629235;
        this.spellActionName = buffer.readStringCp1252NullTerminated((byte)0);
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra > 0) {
            this.actions = new String[ra];
            for (int i = 0; i < ra; ++i) {
                this.actions[i] = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        this.field2897 = Buffer.ra(buffer, (byte)7) * 1773001161;
        this.itemId = Buffer.ra(buffer, (byte)7) * 1466803237;
        this.fill = (Buffer.ra(buffer, (byte)7) == 1);
        this.dataText = buffer.readStringCp1252NullTerminatedOrNull((byte)0);
        this.onClick = pk(this, buffer, -1943743675);
        this.onInvTransmit = pk(this, buffer, -1943743675);
        this.onStatTransmit = pk(this, buffer, -1943743675);
        this.onChatTransmit = pk(this, buffer, -1943743675);
        this.onDrag = pk(this, buffer, -1943743675);
        this.onClick = pk(this, buffer, -1943743675);
        this.onClickRepeat = pk(this, buffer, -1943743675);
        this.onDragComplete = pk(this, buffer, -1943743675);
        this.onDragComplete = pk(this, buffer, -1943743675);
        this.onChatTransmit = pk(this, buffer, -1943743675);
        this.onStockTransmit = pk(this, buffer, -1943743675);
        this.onClanTransmit = pk(this, buffer, -1943743675);
        this.onOp = pk(this, buffer, -1943743675);
        this.onInvTransmit = pk(this, buffer, -1943743675);
        this.onDragComplete = pk(this, buffer, -1943743675);
        this.field2876 = pk(this, buffer, -1943743675);
        this.onMouseRepeat = pk(this, buffer, -1943743675);
        this.onKey = pk(this, buffer, -1943743675);
        this.field2952 = ip(this, buffer, 1664985017);
        this.cs1Comparisons = ip(this, buffer, 1664985017);
        this.varTransmitTriggers = ip(this, buffer, 1664985017);
    }
    
    public void jp(final int n) {
        this.childIndex = n * -1274125071;
    }
    
    public Widget lk(final int n) {
        this.itemQuantityMode = n * -761533221;
        return this;
    }
    
    public int lk() {
        if (this.type * 883712245 != 11 || null == this.field2868 || this.field2950 == null || this.field2950.isEmpty()) {
            return -1;
        }
        final String li = class166.li(this.field2868, (byte)99);
        if (li != null && this.field2950.containsKey(class166.li(this.field2868, (byte)11))) {
            return (int)this.field2950.get(li);
        }
        return -1;
    }
    
    public Model dm(final SequenceDefinition sequenceDefinition, final int n, final boolean b, final PlayerComposition playerComposition, final NPCComposition npcComposition, final NewShit newShit) {
        Widget.field2877 = false;
        int n2;
        int n3;
        if (b) {
            n2 = this.field2948 * 1761517389;
            n3 = this.modelId2 * 184965049;
        }
        else {
            n2 = this.modelAngleY * -133720257;
            n3 = this.rootIndex * -168077555;
        }
        if (6 == n2) {
            if (null == npcComposition) {
                return null;
            }
            n3 = npcComposition.rotation * -1115372301;
        }
        if (n2 == 0) {
            return null;
        }
        if (n2 && -1 == n3) {
            return null;
        }
        if (newShit != null && newShit.field1558 && 6 == n2) {
            n2 = 3;
        }
        long n4 = n3 + (n2 << 16);
        if (newShit != null) {
            n4 |= newShit.field1556 * -1176524468931644747L << 20;
        }
        Model model = (Model)Widget.Widget_cachedSprites.wr(n4);
        if (model == null) {
            ModelData modelData = null;
            int n5 = 443168773;
            int n6 = 64664126;
            switch (n2) {
                case 6: {
                    modelData = AbstractArchive.getNpcDefinition(n3, (byte)0).method1022(newShit, (byte)64);
                    break;
                }
                case 1: {
                    modelData = ModelData.bo(DynamicObject.field813, n3, 0);
                    break;
                }
                case 4: {
                    final ItemComposition set = HealthBarUpdate.set(n3, (byte)17);
                    modelData = set.method1106(10, -305031719);
                    n5 += set.team * 2093614773;
                    n6 += 1794294545 * set.placeholder;
                    break;
                }
                case 3: {
                    modelData = ((null != playerComposition) ? playerComposition.getModelData((byte)98) : null);
                    break;
                }
                case 2: {
                    modelData = AbstractArchive.getNpcDefinition(n3, (byte)(-128)).method1022(null, (byte)64);
                    break;
                }
            }
            if (modelData == null) {
                Widget.field2877 = true;
                return null;
            }
            model = modelData.toModel(n5, n6, -1280133797, 855169405, 1174270507);
            Widget.Widget_cachedModels.vq(model, n4);
        }
        if (sequenceDefinition != null) {
            model = sequenceDefinition.transformActorModel(model, n, (byte)31);
        }
        return model;
    }
    
    public static void nk(final Widget widget, final byte b) {
        if (widget == null) {
            widget.method1823(b);
        }
        try {
            widget.field2949 = new HashMap();
            widget.field2950 = new HashMap();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.az(" + ')');
        }
    }
    
    public void rc(final String field3004) {
        this.field3004 = field3004;
    }
    
    SpritePixels cx(final UrlRequester urlRequester) {
        if (!this.method1796((byte)(-75))) {
            return this.method1825(urlRequester, (byte)1);
        }
        final String string = this.spellActionName + (this.noClickThrough ? 1 : 0) + (this.textShadowed ? 1 : 0) + this.outline * -331135186 + -1772135496 * this.spriteShadow;
        SpritePixels method2602 = (SpritePixels)Widget.field2867.method2126(string, (short)30924);
        if (null == method2602) {
            final SpritePixels method2603 = this.method1825(urlRequester, (byte)1);
            if (null != method2603) {
                method2602 = method2603.method2602();
                this.method1797(method2602, 1923625646);
                Widget.field2867.method2122(string, method2602, 747668912);
            }
        }
        return method2602;
    }
    
    public String ec() {
        return this.field3004;
    }
    
    public Widget ls(final int n, final int n2, final int n3, final int n4) {
        return this.ly(n).uu(n2).ep(n3).gw(n4);
    }
    
    public net.runelite.api.widgets.Widget getChild(final int n) {
        final Widget[] rh = this.rh();
        if (rh == null || n < 0 || n >= rh.length) {
            return null;
        }
        return (net.runelite.api.widgets.Widget)rh[n];
    }
    
    public void dk(final int n, final String s) {
        if (null == this.actions || this.actions.length <= n) {
            final String[] actions = new String[n + 1];
            if (this.actions != null) {
                for (int i = 0; i < this.actions.length; ++i) {
                    actions[i] = this.actions[i];
                }
            }
            this.actions = actions;
        }
        this.actions[n] = s;
    }
    
    public SpriteMask do(boolean b) {
        if (-1352724779 * this.spriteId == -1) {
            b = false;
        }
        final int n = b ? (-1352724779 * this.spriteId) : (-363627527 * this.spriteId2);
        if (-1 == n) {
            return null;
        }
        final long n2 = ((this.textShadowed ? 1 : 0) << 39) + (((this.noClickThrough ? 1 : 0) << 38) + (((long)(1638912775 * this.outline) << 36) + n)) + ((long)(this.spriteShadow * -353676735) << 40);
        final SpriteMask spriteMask = (SpriteMask)Widget.Widget_cachedSpriteMasks.wr(n2);
        if (null != spriteMask) {
            return spriteMask;
        }
        final SpritePixels sprite = this.getSprite(b, null, (byte)0);
        if (sprite == null) {
            return null;
        }
        final SpritePixels gm = SpritePixels.gm(sprite);
        final int[] array = new int[gm.subHeight];
        final int[] array2 = new int[gm.subHeight];
        for (int i = 0; i < gm.subHeight; ++i) {
            int n3 = 0;
            int subWidth = gm.subWidth;
            for (int j = 0; j < gm.subWidth; ++j) {
                if (gm.pixels[j + i * gm.subWidth] == 0) {
                    n3 = j;
                    break;
                }
            }
            for (int k = gm.subWidth - 1; k >= n3; --k) {
                if (0 == gm.pixels[i * gm.subWidth + k]) {
                    subWidth = k + 1;
                    break;
                }
            }
            array2[i] = subWidth - (array[i] = n3);
        }
        final SpriteMask spriteMask2 = new SpriteMask(gm.subWidth, gm.subHeight, array2, array, n);
        Widget.Widget_cachedSpriteMasks.put(spriteMask2, n2);
        return spriteMask2;
    }
    
    public boolean dz() {
        return !this.modelOrthog || 1049578908 * this.type == 0 || this.type * 1817360071 == 11 || this.field2978 || 1246189319 == this.contentType * 1021339961 || 12 == 725709836 * this.type;
    }
    
    public void mo(final int qa) {
        this.qa = qa;
    }
    
    public Widget iw(final boolean field2913) {
        this.field2913 = field2913;
        return this;
    }
    
    public class312 fr() {
        return this.field2951;
    }
    
    public Widget vn(final int n, final int n2, final int n3, final int n4) {
        return this.dx(n).tt(n2).ev(n3).wn(n4);
    }
    
    public static SpriteMask vn(final Widget widget, boolean b, final byte b2) {
        if (widget == null) {
            return widget.getSpriteMask(b, b2);
        }
        try {
            if (-1352724779 * widget.spriteId == -1) {
                if (b2 == -1) {
                    throw new IllegalStateException();
                }
                b = false;
            }
            int n;
            if (b) {
                if (b2 == -1) {
                    throw new IllegalStateException();
                }
                n = -1352724779 * widget.spriteId;
            }
            else {
                n = -363627527 * widget.spriteId2;
            }
            final int n2 = n;
            if (-1 == n2) {
                if (b2 == -1) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                long n3;
                if (widget.textShadowed) {
                    if (b2 == -1) {
                        throw new IllegalStateException();
                    }
                    n3 = 1L;
                }
                else {
                    n3 = 0L;
                }
                final long n4 = n3 << 39;
                long n5;
                if (widget.noClickThrough) {
                    if (b2 == -1) {
                        throw new IllegalStateException();
                    }
                    n5 = 1L;
                }
                else {
                    n5 = 0L;
                }
                final long n6 = n4 + ((n5 << 38) + (((long)(1638912775 * widget.outline) << 36) + n2)) + ((long)(widget.spriteShadow * -353676735) << 40);
                final SpriteMask spriteMask = (SpriteMask)Widget.Widget_cachedSpriteMasks.wr(n6);
                if (null != spriteMask) {
                    return spriteMask;
                }
                final SpritePixels sprite = widget.getSprite(b, null, (byte)0);
                if (sprite != null) {
                    final SpritePixels gm = SpritePixels.gm(sprite);
                    final int[] array = new int[gm.subHeight];
                    final int[] array2 = new int[gm.subHeight];
                    for (int i = 0; i < gm.subHeight; ++i) {
                        if (b2 == -1) {
                            throw new IllegalStateException();
                        }
                        int n7 = 0;
                        int subWidth = gm.subWidth;
                        int j = 0;
                        while (j < gm.subWidth) {
                            if (b2 == -1) {
                                throw new IllegalStateException();
                            }
                            if (gm.pixels[j + i * gm.subWidth] == 0) {
                                if (b2 == -1) {
                                    throw new IllegalStateException();
                                }
                                n7 = j;
                                break;
                            }
                            else {
                                ++j;
                            }
                        }
                        int k = gm.subWidth - 1;
                        while (k >= n7) {
                            if (b2 == -1) {
                                throw new IllegalStateException();
                            }
                            if (0 == gm.pixels[i * gm.subWidth + k]) {
                                if (b2 == -1) {
                                    throw new IllegalStateException();
                                }
                                subWidth = k + 1;
                                break;
                            }
                            else {
                                --k;
                            }
                        }
                        array2[i] = subWidth - (array[i] = n7);
                    }
                    final SpriteMask spriteMask2 = new SpriteMask(gm.subWidth, gm.subHeight, array2, array, n2);
                    Widget.Widget_cachedSpriteMasks.put(spriteMask2, n6);
                    return spriteMask2;
                }
                if (b2 == -1) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ah(" + ')');
        }
    }
    
    public static void ge(final Widget widget, final PlayerComposition playerComposition, final boolean b) {
        widget.modelType = 1980701349;
        widget.field2894 = new PlayerComposition(playerComposition);
        if (!b) {
            widget.field2894.field2841 = Arrays.copyOf(widget.field2894.bodyColors, widget.field2894.bodyColors.length);
            widget.field2894.setHash(-469114674);
        }
    }
    
    public void setType(final int n) {
        this.type = n * -1183495331;
    }
    
    static Widget fl(final int n, final Widget widget, final int n2, final int n3, final int n4, final int n5, final int n6, final float[] array) {
        final Widget widget2 = new Widget();
        widget2.type = -1183495331 * n;
        widget2.parentId = -1292508593 * widget.id;
        widget2.childIndex = -1274125071 * n2;
        widget2.modelOrthog = true;
        widget2.xAlignment = 1656805111 * n3;
        widget2.yAlignment = -158913655 * n4;
        widget2.widthAlignment = 240733828 * n5;
        widget2.heightAlignment = 979587087 * n6;
        widget2.rawX = 1806877347 * (int)(-221935938 * widget.width * array[0]);
        widget2.rawY = 1231090287 * (int)(-1562381234 * widget.height * array[1]);
        widget2.rawWidth = -1495372107 * (int)(-1506195714 * widget.width * array[2]);
        widget2.rawHeight = -436454064 * (int)(array[3] * (1473950221 * widget.height));
        return widget2;
    }
    
    public static int[] ip(final Widget widget, final Buffer buffer, final int n) {
        if (widget == null) {
            return widget.readListenerTriggers(buffer, n);
        }
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra != 0) {
                final int[] array = new int[ra];
                for (int i = 0; i < ra; ++i) {
                    if (n != 1664985017) {
                        throw new IllegalStateException();
                    }
                    array[i] = buffer.readInt(-1979146216);
                }
                return array;
            }
            if (n != 1664985017) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.al(" + ')');
        }
    }
    
    void fo() {
        this.hasListener = true;
        final ArrayList method929 = this.field2868.method929(-861137795);
        final ArrayList method930 = this.field2868.method942((byte)1);
        this.children = new Widget[method929.size() + method930.size()];
        int n = 0;
        for (final class172 class172 : method929) {
            final Widget method931 = class314.method1731(5, this, n, 0, 0, 0, 0, class172.field1444, (byte)(-38));
            method931.spellActionName = class172.field1445.method679((byte)34);
            Widget.field2878.method2122(method931.spellActionName, new class311(class172.field1445), 747668912);
            this.children[n++] = method931;
        }
        for (final class173 class173 : method930) {
            final Widget method932 = class314.method1731(4, this, n, 0, 0, 0, 0, class173.field1448, (byte)(-26));
            method932.field2916 = class173.field1447;
            method932.fontId = this.field2949.get(1845750621 * class173.field1446) * 1858899927;
            method932.textXAlignment = class173.field1449 * 329326313;
            method932.textYAlignment = 1890763397 * class173.field1450;
            this.children[n++] = method932;
        }
    }
    
    public int getContentType() {
        return this.contentType * 1021339961;
    }
    
    public class27 fa() {
        return (this.field2951 != null) ? this.field2951.field2827 : null;
    }
    
    public Widget fa(final boolean isIf3) {
        this.isIf3 = isIf3;
        return this;
    }
    
    public int ed() {
        return this.rootIndex * 372799529;
    }
    
    public boolean ea() {
        return 2 == 1888225603 * this.field2948;
    }
    
    void decodeLegacy(final Buffer buffer, final int n) {
        try {
            this.modelOrthog = false;
            this.type = Buffer.ra(buffer, (byte)7) * -1183495331;
            this.buttonType = Buffer.ra(buffer, (byte)7) * -1494876793;
            this.contentType = buffer.readUnsignedShort(-914607767) * 577746185;
            this.rawX = buffer.readUnsignedByte((byte)(-70)) * 1806877347;
            this.rawY = buffer.readUnsignedByte((byte)(-78)) * 1231090287;
            this.rawWidth = buffer.readUnsignedShort(80213708) * -1495372107;
            this.rawHeight = buffer.readUnsignedShort(-630064823) * 1193771871;
            this.transparencyTop = Buffer.ra(buffer, (byte)7) * 1833148663;
            this.parentId = buffer.readUnsignedShort(271800442) * 908641471;
            if (this.parentId * 913615679 == 65535) {
                this.parentId = -908641471;
            }
            else {
                this.parentId = ((1713081171 * this.id & 0xFFFF0000) + 913615679 * this.parentId) * 908641471;
            }
            this.mouseOverRedirect = buffer.readUnsignedShort(499146948) * -597372633;
            if (65535 == -529297769 * this.mouseOverRedirect) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                this.mouseOverRedirect = 597372633;
            }
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra > 0) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                this.cs1Comparisons = new int[ra];
                this.cs1ComparisonValues = new int[ra];
                for (int i = 0; i < ra; ++i) {
                    this.cs1Comparisons[i] = Buffer.ra(buffer, (byte)7);
                    this.cs1ComparisonValues[i] = buffer.readUnsignedShort(-660200382);
                }
            }
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 > 0) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                this.cs1Instructions = new int[ra2][];
                for (int j = 0; j < ra2; ++j) {
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                    final int unsignedShort = buffer.readUnsignedShort(-1965878086);
                    this.cs1Instructions[j] = new int[unsignedShort];
                    for (int k = 0; k < unsignedShort; ++k) {
                        if (n == -1086551379) {
                            throw new IllegalStateException();
                        }
                        this.cs1Instructions[j][k] = buffer.readUnsignedShort(-1898286448);
                        if (65535 == this.cs1Instructions[j][k]) {
                            if (n == -1086551379) {
                                throw new IllegalStateException();
                            }
                            this.cs1Instructions[j][k] = -1;
                        }
                    }
                }
            }
            if (0 == 883712245 * this.type) {
                this.scrollHeight = buffer.readUnsignedShort(-916298383) * -1357451643;
                this.spriteTiling = (Buffer.ra(buffer, (byte)7) == 1);
            }
            if (this.type * 883712245 == 1) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                buffer.readUnsignedShort(-680376943);
                Buffer.ra(buffer, (byte)7);
            }
            if (3 == this.type * 883712245) {
                this.noScrollThrough = (Buffer.ra(buffer, (byte)7) == 1);
            }
            Label_0978: {
                if (4 != this.type * 883712245) {
                    if (n == -1086551379) {
                        return;
                    }
                    if (883712245 * this.type != 1) {
                        break Label_0978;
                    }
                    if (n == -1086551379) {
                        return;
                    }
                }
                this.textXAlignment = Buffer.ra(buffer, (byte)7) * 1612549297;
                this.textYAlignment = Buffer.ra(buffer, (byte)7) * -522107433;
                this.textLineHeight = Buffer.ra(buffer, (byte)7) * 2116078665;
                this.fontId = buffer.readUnsignedShort(686274518) * 1858899927;
                if (65535 == -1065036825 * this.fontId) {
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                    this.fontId = -1858899927;
                }
                boolean isIf3;
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                    isIf3 = true;
                }
                else {
                    isIf3 = false;
                }
                this.isIf3 = isIf3;
            }
            if (883712245 * this.type == 4) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                this.field2916 = buffer.readStringCp1252NullTerminated((byte)0);
                this.buttonText = buffer.readStringCp1252NullTerminated((byte)0);
            }
            Label_1101: {
                if (883712245 * this.type != 1 && 3 != this.type * 883712245) {
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                    if (this.type * 883712245 != 4) {
                        break Label_1101;
                    }
                    if (n == -1086551379) {
                        return;
                    }
                }
                this.color = buffer.readInt(-1175653669) * -1604768377;
            }
            Label_1408: {
                if (3 != 883712245 * this.type) {
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                    if (4 != 883712245 * this.type) {
                        break Label_1408;
                    }
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                }
                this.color2 = buffer.readInt(-1425952800) * 714852617;
                this.mouseOverColor = buffer.readInt(-1027957327) * -1045335587;
                this.mouseOverColor2 = buffer.readInt(-1808806114) * 1230092841;
            }
            if (883712245 * this.type == 5) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                this.spriteId2 = buffer.readInt(-1548379509) * -504605111;
                this.spriteId = buffer.readInt(-1985846538) * 1679014525;
            }
            if (this.type * 883712245 == 6) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                this.modelType = -1714481443;
                this.modelId = buffer.readUnsignedShort(-26780739) * 509431749;
                if (65535 == this.modelId * -168077555) {
                    this.modelId = -509431749;
                }
                this.modelType2 = 1918873989;
                this.modelId2 = buffer.readUnsignedShort(-1828322314) * 1559002165;
                if (this.modelId2 * -3148259 == 65535) {
                    if (n == -1086551379) {
                        return;
                    }
                    this.modelId2 = -1559002165;
                }
                this.sequenceId = buffer.readUnsignedShort(18536558) * -1195025605;
                if (-1526544909 * this.sequenceId == 65535) {
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                    this.sequenceId = 1195025605;
                }
                this.sequenceId2 = buffer.readUnsignedShort(660377159) * -1782995843;
                if (65535 == -717228843 * this.sequenceId2) {
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                    this.sequenceId2 = 1782995843;
                }
                this.modelZoom = buffer.readUnsignedShort(-601141163) * -467727501;
                this.modelAngleX = buffer.readUnsignedShort(-419869700) * -142910041;
                this.modelAngleY = buffer.readUnsignedShort(-826136620) * -230241203;
            }
            if (8 == this.type * 883712245) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                this.field2916 = buffer.readStringCp1252NullTerminated((byte)0);
            }
            if (35076151 * this.buttonType == 2) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                this.text2 = buffer.readStringCp1252NullTerminated((byte)0);
                this.text = buffer.readStringCp1252NullTerminated((byte)0);
                this.flags = -882629235 * (this.flags * 1652991301 | (buffer.readUnsignedShort(-27868886) & 0x3F) << 11);
            }
            Label_1868: {
                if (1 != 35076151 * this.buttonType) {
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                    if (35076151 * this.buttonType != 4) {
                        if (n == -1086551379) {
                            return;
                        }
                        if (35076151 * this.buttonType != 5) {
                            if (n == -1086551379) {
                                throw new IllegalStateException();
                            }
                            if (35076151 * this.buttonType != 6) {
                                break Label_1868;
                            }
                            if (n == -1086551379) {
                                throw new IllegalStateException();
                            }
                        }
                    }
                }
                this.dataText = buffer.readStringCp1252NullTerminated((byte)0);
                if (this.dataText.length() == 0) {
                    if (n == -1086551379) {
                        throw new IllegalStateException();
                    }
                    if (this.buttonType * 35076151 == 1) {
                        if (n == -1086551379) {
                            throw new IllegalStateException();
                        }
                        this.dataText = Strings.au;
                    }
                    if (35076151 * this.buttonType == 4) {
                        this.dataText = Strings.ab;
                    }
                    if (35076151 * this.buttonType == 5) {
                        if (n == -1086551379) {
                            throw new IllegalStateException();
                        }
                        this.dataText = Strings.ab;
                    }
                    if (6 == this.buttonType * 35076151) {
                        if (n == -1086551379) {
                            throw new IllegalStateException();
                        }
                        this.dataText = Strings.aq;
                    }
                }
            }
            Label_1927: {
                if (this.buttonType * 35076151 != 1) {
                    if (n == -1086551379) {
                        return;
                    }
                    if (4 != 35076151 * this.buttonType) {
                        if (5 != this.buttonType * 35076151) {
                            break Label_1927;
                        }
                        if (n == -1086551379) {
                            throw new IllegalStateException();
                        }
                    }
                }
                this.flags = (1652991301 * this.flags | 0x400000) * -882629235;
            }
            if (this.buttonType * 35076151 == 6) {
                if (n == -1086551379) {
                    throw new IllegalStateException();
                }
                this.flags = (this.flags * 1652991301 | 0x1) * -882629235;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.au(" + ')');
        }
    }
    
    public static void fm(final Widget widget, final int n, final int n2) {
        widget.field2894.equipment[n] = n2;
        widget.field2894.setHash(-469114674);
    }
    
    public static void fm(final Widget widget, final int n, final String s, final byte b) {
        if (widget == null) {
            widget.setAction(n, s, b);
        }
        try {
            Label_0096: {
                if (null != widget.actions) {
                    if (widget.actions.length > n) {
                        break Label_0096;
                    }
                    if (b != 2) {
                        throw new IllegalStateException();
                    }
                }
                final String[] actions = new String[n + 1];
                if (widget.actions != null) {
                    for (int i = 0; i < widget.actions.length; ++i) {
                        if (b != 2) {
                            return;
                        }
                        actions[i] = widget.actions[i];
                    }
                }
                widget.actions = actions;
            }
            widget.actions[n] = s;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ar(" + ')');
        }
    }
    
    public boolean fe(final UrlRequester urlRequester) {
        if (this.type * 655203041 == 11 && this.field2868 != null) {
            class166.qr(this.field2868, urlRequester, (byte)14);
            if (this.field2868.method926((byte)37) != this.field2948 * 253387958) {
                this.field2948 = this.field2868.method926((byte)(-2)) * -714860289;
                if (this.field2948 * 566600117 >= 100) {
                    return true;
                }
                if (2 == this.field2948 * -881625161) {
                    this.method1813(1652307373);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    SpritePixels method1826(final UrlRequester urlRequester, final byte b) {
        try {
            if (this.method1796((byte)(-32))) {
                final StringBuilder append = new StringBuilder().append(this.spellActionName);
                int i;
                if (this.noClickThrough) {
                    if (b == 3) {
                        throw new IllegalStateException();
                    }
                    i = 1;
                }
                else {
                    i = 0;
                }
                final StringBuilder append2 = append.append(i);
                int j;
                if (this.textShadowed) {
                    if (b == 3) {
                        throw new IllegalStateException();
                    }
                    j = 1;
                }
                else {
                    j = 0;
                }
                final String string = append2.append(j).append(this.outline * 1638912775).append(-353676735 * this.spriteShadow).toString();
                SpritePixels method2602 = (SpritePixels)Widget.field2867.method2126(string, (short)20067);
                if (null == method2602) {
                    final SpritePixels method2603 = this.method1825(urlRequester, (byte)1);
                    if (null != method2603) {
                        method2602 = method2603.method2602();
                        this.method1797(method2602, 340032974);
                        Widget.field2867.method2122(string, method2602, 747668912);
                    }
                }
                return method2602;
            }
            if (b == 3) {
                throw new IllegalStateException();
            }
            return this.method1825(urlRequester, (byte)1);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.aa(" + ')');
        }
    }
    
    public static String kg(final Widget widget, final String s) {
        if (11 == widget.type * -1845636870 && null != widget.field2868 && widget.method1807(-1075080138)) {
            return class166.ya(widget.field2868, s, (byte)(-64));
        }
        return null;
    }
    
    public void setAction(final int n, final String s) {
        fm(this, n, s, (byte)2);
    }
    
    public Font getFont(final int n) {
        try {
            Widget.field2877 = false;
            if (this.fontId * -1065036825 == -1) {
                if (n >= -520982295) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final Font font = (Font)Widget.Widget_cachedFonts.wr(-1065036825 * this.fontId);
                if (null == font) {
                    final AbstractArchive widget_spritesArchive = ScriptEvent.Widget_spritesArchive;
                    final AbstractArchive widget_fontsArchive = class146.Widget_fontsArchive;
                    final int n2 = -1065036825 * this.fontId;
                    final byte[] takeFile = widget_spritesArchive.takeFile(n2, 0, (byte)(-4));
                    int n3;
                    if (null == takeFile) {
                        if (n >= -520982295) {
                            throw new IllegalStateException();
                        }
                        n3 = 0;
                    }
                    else {
                        class485.SpriteBuffer_decode(takeFile, 1145263442);
                        n3 = 1;
                    }
                    Font font2;
                    if (n3 == 0) {
                        if (n >= -520982295) {
                            throw new IllegalStateException();
                        }
                        font2 = null;
                    }
                    else {
                        final byte[] takeFile2 = widget_fontsArchive.takeFile(n2, 0, (byte)(-126));
                        Font font3;
                        if (null == takeFile2) {
                            if (n >= -520982295) {
                                throw new IllegalStateException();
                            }
                            font3 = null;
                        }
                        else {
                            final Font font4 = new Font(takeFile2, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                            class398.method2125(-262861184);
                            font3 = font4;
                        }
                        font2 = font3;
                    }
                    final Font font5 = font2;
                    if (font5 != null) {
                        Widget.Widget_cachedFonts.put(font5, -1065036825 * this.fontId);
                    }
                    else {
                        Widget.field2877 = true;
                    }
                    return font5;
                }
                if (n >= -520982295) {
                    throw new IllegalStateException();
                }
                return font;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ai(" + ')');
        }
    }
    
    public Widget getFont(final int n) {
        this.itemQuantity = n * -568259577;
        return this;
    }
    
    public boolean fi(final UrlRequester urlRequester) {
        if (this.rotationKey * 655203041 == 11 && this.field2868 != null) {
            class166.qr(this.field2868, urlRequester, (byte)14);
            if (this.field2868.method926((byte)37) != this.modelId2 * 253387958) {
                this.modelType2 = this.field2868.method926((byte)(-2)) * -714860289;
                if (this.modelType2 * 566600117 >= 100) {
                    return true;
                }
                if (2 == this.modelType2 * -881625161) {
                    this.method1813(1652307373);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public void ic(final int vc) {
        this.vc = vc;
    }
    
    public int getWidth() {
        return this.width * -794961409;
    }
    
    public Widget dx(final int n) {
        this.rawX = n * 1806877347;
        return this;
    }
    
    public void dy(final int i, final int j) {
        if (11 != 883712245 * this.type) {
            return;
        }
        if (null == this.field2949) {
            nk(this, (byte)(-78));
        }
        this.field2949.put(i, j);
    }
    
    public static void gg(final Widget widget, final PlayerComposition playerComposition, final boolean b) {
        widget.modelType = 883531787;
        widget.field2894 = new PlayerComposition(playerComposition);
        if (!b) {
            widget.field2894.field2841 = Arrays.copyOf(widget.field2894.bodyColors, widget.field2894.bodyColors.length);
            widget.field2894.setHash(-469114674);
        }
    }
    
    public Widget lv(final int n) {
        this.modelZoom = n * -467727501;
        return this;
    }
    
    public void fx() {
        this.field2951 = new class312();
        for (int i = 1; i <= 12; ++i) {
            this.field2951.field2827.method114(i, 0, (byte)0);
        }
        for (char c = '\0'; c < -387791360; ++c) {
            this.field2951.field2827.method115(c, 0, 48495477);
        }
        this.field2951.field2827.method115((char)1533474392, 0, 48495477);
        this.field2951.field2827.method114(1493367022, 2, (byte)0);
        this.field2951.field2827.method114(81, 2, (byte)0);
        this.field2951.field2827.method114(1626375063, 2, (byte)0);
    }
    
    public static void bh(final AbstractArchive widget_archive, final AbstractArchive field813, final AbstractArchive widget_spritesArchive, final AbstractArchive widget_fontsArchive) {
        int groupCount = 0;
        if (null != widget_archive) {
            UserComparator3.Widget_archive = widget_archive;
            DynamicObject.field813 = field813;
            ScriptEvent.Widget_spritesArchive = widget_spritesArchive;
            class146.Widget_fontsArchive = widget_fontsArchive;
            groupCount = UserComparator3.Widget_archive.getGroupCount(-1015801169);
        }
        VerticalAlignment.Widget_interfaceComponents = new Widget[groupCount][];
        class264.Widget_loadedInterfaces = new boolean[groupCount];
    }
    
    public void revalidate() {
        if (!Widget.qx && !ScriptFrame.client.isClientThread()) {
            throw new AssertionError((Object)"must be called on client thread");
        }
        ScriptFrame.client.qw((net.runelite.api.widgets.Widget)this);
    }
    
    public boolean method1807(final int n) {
        try {
            boolean b;
            if (2 == 1888225603 * this.field2948) {
                if (n == 577525846) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.by(" + ')');
        }
    }
    
    public String method1827(final int n) {
        try {
            if (11 == 883712245 * this.type) {
                if (n >= 1801507147) {
                    throw new IllegalStateException();
                }
                if (null != this.field2868) {
                    final String li = class166.li(this.field2868, (byte)79);
                    final Iterator<class177> iterator = this.field2868.method931(1491892431).iterator();
                    while (iterator.hasNext()) {
                        if (n >= 1801507147) {
                            throw new IllegalStateException();
                        }
                        final class177 class177 = iterator.next();
                        final String format = String.format("%%%S%%", class177.method963((byte)89));
                        if (class177.vmethod3379((byte)(-41)) == 0) {
                            li.replaceAll(format, Integer.toString(class177.vmethod3378(421671702)));
                        }
                        else {
                            li.replaceAll(format, class177.vmethod3380((byte)88));
                        }
                    }
                    return li;
                }
                if (n >= 1801507147) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bx(" + ')');
        }
    }
    
    public void setAction(final int n, final String s, final byte b) {
        try {
            Label_0085: {
                if (null != this.actions) {
                    if (this.actions.length > n) {
                        break Label_0085;
                    }
                    if (b != 2) {
                        throw new IllegalStateException();
                    }
                }
                final String[] actions = new String[n + 1];
                if (this.actions != null) {
                    for (int i = 0; i < this.actions.length; ++i) {
                        if (b != 2) {
                            return;
                        }
                        actions[i] = this.actions[i];
                    }
                }
                this.actions = actions;
            }
            this.actions[n] = s;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ar(" + ')');
        }
    }
    
    public boolean method1806(int n, int n2, final int n3, final int n4, final byte b) {
        try {
            if (883712245 * this.yAlignment == 11 && null != this.field2868) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                if (this.method1801(-2127450908)) {
                    n -= n3;
                    n2 -= n4;
                    final int n5 = (int)(this.field2868.method930(2102888659)[0] * (this.rootIndex * -794961409));
                    final int n6 = (int)(this.field2868.method930(2104665215)[1] * (1473950221 * this.textLineHeight));
                    final int n7 = n5 + (int)(this.field2868.method930(2087104002)[2] * (this.rawX * -794961409));
                    final int n8 = n6 + (int)(this.field2868.method930(2113655795)[3] * (1473950221 * this.fontId));
                    if (n >= n5 && n2 >= n6) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        if (n < n7 && n2 < n8) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ap(" + ')');
        }
    }
    
    void method1813(final int n) {
        try {
            this.hasListener = true;
            final ArrayList method929 = this.field2868.method929(434177359);
            final ArrayList method930 = this.field2868.method942((byte)1);
            this.children = new Widget[method929.size() + method930.size()];
            int n2 = 0;
            final Iterator<class172> iterator = method929.iterator();
            while (iterator.hasNext()) {
                if (n != 1652307373) {
                    throw new IllegalStateException();
                }
                final class172 class172 = iterator.next();
                final Widget method931 = class314.method1731(5, this, n2, 0, 0, 0, 0, class172.field1444, (byte)34);
                method931.spellActionName = class172.field1445.method679((byte)82);
                Widget.field2878.method2122(method931.spellActionName, new class311(class172.field1445), 747668912);
                this.children[n2++] = method931;
            }
            for (final class173 class173 : method930) {
                final Widget method932 = class314.method1731(4, this, n2, 0, 0, 0, 0, class173.field1448, (byte)(-19));
                method932.field2916 = class173.field1447;
                method932.fontId = this.field2949.get(1845750621 * class173.field1446) * 1858899927;
                method932.textXAlignment = class173.field1449 * 329326313;
                method932.textYAlignment = 1890763397 * class173.field1450;
                this.children[n2++] = method932;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bd(" + ')');
        }
    }
    
    Object[] cm(final Buffer buffer) {
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra == 0) {
            return null;
        }
        final Object[] array = new Object[ra];
        for (int i = 0; i < ra; ++i) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 == 0) {
                array[i] = new Integer(buffer.readInt(-2099852577));
            }
            else if (ra2 != 0) {
                array[i] = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        this.field2978 = true;
        return array;
    }
    
    public int getOpacity() {
        return this.transparencyTop * 1634279623;
    }
    
    boolean method1816(final class314 class314, final byte b) {
        try {
            int n = 0;
            if (null != this.field2916 && !this.field2916.isEmpty()) {
                final int n2 = n;
                final String field2916 = this.field2916;
                final StringBuilder sb = new StringBuilder(field2916.length());
                int n3 = 0;
                int n4 = -1;
                for (int i = 0; i < field2916.length(); ++i) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    final char char1 = field2916.charAt(i);
                    if (char1 == '<') {
                        sb.append(field2916.substring(n3, i));
                        n4 = i;
                    }
                    else if (char1 == '>') {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        if (-1 != n4) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            final String substring = field2916.substring(n4 + 1, i);
                            n4 = -1;
                            if (substring.equals("lt")) {
                                sb.append("<");
                            }
                            else if (substring.equals("gt")) {
                                if (b == -1) {
                                    throw new IllegalStateException();
                                }
                                sb.append(">");
                            }
                            else if (substring.equals("br")) {
                                sb.append("\n");
                            }
                            n3 = 1 + i;
                        }
                    }
                }
                if (n3 < field2916.length()) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    sb.append(field2916.substring(n3, field2916.length()));
                }
                n = (n2 | (class314.method1708(sb.toString(), 1247495644) ? 1 : 0));
                this.field2916 = "";
            }
            if (null != this.buttonText) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                if (!this.buttonText.isEmpty()) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    final boolean b2 = n != 0;
                    final String buttonText = this.buttonText;
                    final StringBuilder sb2 = new StringBuilder(buttonText.length());
                    int n5 = 0;
                    int n6 = -1;
                    for (int j = 0; j < buttonText.length(); ++j) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        final char char2 = buttonText.charAt(j);
                        if ('<' == char2) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            sb2.append(buttonText.substring(n5, j));
                            n6 = j;
                        }
                        else if ('>' == char2) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            if (-1 != n6) {
                                if (b == -1) {
                                    throw new IllegalStateException();
                                }
                                final String substring2 = buttonText.substring(1 + n6, j);
                                n6 = -1;
                                if (substring2.equals("lt")) {
                                    if (b == -1) {
                                        throw new IllegalStateException();
                                    }
                                    sb2.append("<");
                                }
                                else if (substring2.equals("gt")) {
                                    if (b == -1) {
                                        throw new IllegalStateException();
                                    }
                                    sb2.append(">");
                                }
                                else if (substring2.equals("br")) {
                                    if (b == -1) {
                                        throw new IllegalStateException();
                                    }
                                    sb2.append("\n");
                                }
                                n5 = 1 + j;
                            }
                        }
                    }
                    if (n5 < buttonText.length()) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        sb2.append(buttonText.substring(n5, buttonText.length()));
                    }
                    n = ((b2 | class314.method1709(sb2.toString(), (byte)2)) ? 1 : 0);
                    this.buttonText = "";
                }
            }
            return n != 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bg(" + ')');
        }
    }
    
    public int iy() {
        return (this.field2950 != null && this.field2950.size() > 0) ? 1 : 0;
    }
    
    public Widget[] rh() {
        return this.children;
    }
    
    public Widget im(final int n) {
        this.scrollY = n * 946188063;
        return this;
    }
    
    public void setWidth(final int n) {
        this.width = n * 1774069247;
    }
    
    public Widget mb(final int n) {
        this.itemId = n * -1852876811;
        return this;
    }
    
    SpritePixels co(final UrlRequester urlRequester) {
        if (this.spellActionName != null && null != urlRequester) {
            class311 class311 = (class311)Widget.field2878.method2126(this.spellActionName, (short)4119);
            if (null == class311) {
                class311 = new class311(this.spellActionName, urlRequester);
                Widget.field2878.method2122(this.spellActionName, class311, 747668912);
            }
            return class311.method1690((byte)9);
        }
        return null;
    }
    
    public static void fg(final Widget widget, final int n, final int n2) {
        final PlayerComposition field2894 = widget.field2894;
        final boolean b = n2 != 1693987821 * field2894.npcTransformId;
        field2894.npcTransformId = 325591525 * n2;
        Label_0026: {
            if (b) {
                if (1693987821 * field2894.npcTransformId != n) {
                    while (true) {
                        Label_0328: {
                            if (field2894.field2841[0] < 512) {
                                break Label_0328;
                            }
                            int n3;
                            if (field2894.field2841[0] >= -267856001) {
                                final ItemComposition set = HealthBarUpdate.set(field2894.field2841[0] - 512, (byte)66);
                                n3 = ((622494345 * class204.field1840.field1831 != set.maleModel1 * -1719338253 && class204.field1840.field1831 * 1168870012 != -800363399 * set.maleModel2) ? 1 : 0);
                            }
                            else {
                                n3 = 0;
                            }
                            if (n3 != 0) {
                                break Label_0328;
                            }
                            for (int i = 0; i < 7; ++i) {
                                final int n4 = PlayerComposition.equipmentIndices[i];
                                if (field2894.field2841[n4] > 0 && field2894.field2841[n4] < 1508737098) {
                                    class163.method915(n2, field2894.field2841, i, 1915858727);
                                }
                            }
                            break Label_0026;
                        }
                        field2894.field2841[-1281331594 * class204.field1840.field1831] = 1;
                        continue;
                    }
                }
                for (int j = 0; j < PlayerComposition.equipmentIndices.length; ++j) {
                    final int n5 = PlayerComposition.equipmentIndices[j];
                    if (field2894.field2841[n5] > 0 && field2894.field2841[n5] < 1637445911) {
                        field2894.field2841[n5] = field2894.bodyColors[n5];
                    }
                }
            }
        }
        field2894.setHash(-469114674);
    }
    
    SpritePixels cy(final UrlRequester urlRequester) {
        if (!this.method1796((byte)(-36))) {
            return this.method1825(urlRequester, (byte)1);
        }
        final String string = this.spellActionName + (this.noClickThrough ? 1 : 0) + (this.textShadowed ? 1 : 0) + this.outline * 1638912775 + -353676735 * this.spriteShadow;
        SpritePixels method2602 = (SpritePixels)Widget.field2867.method2126(string, (short)22429);
        if (null == method2602) {
            final SpritePixels method2603 = this.method1825(urlRequester, (byte)1);
            if (null != method2603) {
                method2602 = method2603.method2602();
                this.method1797(method2602, -734435133);
                Widget.field2867.method2122(string, method2602, 747668912);
            }
        }
        return method2602;
    }
    
    public Widget er(final String field2916) {
        this.field2916 = field2916;
        return this;
    }
    
    public Widget vx(final boolean spriteTiling) {
        this.spriteTiling = spriteTiling;
        return this;
    }
    
    public Widget il(final boolean field2978) {
        this.field2978 = field2978;
        return this;
    }
    
    public Widget ly(final int n) {
        this.rawWidth = n * -1495372107;
        return this;
    }
    
    public Widget gw(final int n) {
        this.heightAlignment = n * -480958745;
        return this;
    }
    
    public boolean eu() {
        return 2 == 1888225603 * this.field2948;
    }
    
    public class309 method1817(final int n) {
        try {
            class309 field2822;
            if (this.field2951 != null) {
                if (n != -1740765458) {
                    throw new IllegalStateException();
                }
                field2822 = this.field2951.field2822;
            }
            else {
                field2822 = null;
            }
            return field2822;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bn(" + ')');
        }
    }
    
    SpritePixels cz(final UrlRequester urlRequester) {
        if (this.spellActionName != null && null != urlRequester) {
            class311 class311 = (class311)Widget.field2878.method2126(this.spellActionName, (short)16934);
            if (null == class311) {
                class311 = new class311(this.spellActionName, urlRequester);
                Widget.field2878.method2122(this.spellActionName, class311, 747668912);
            }
            return class311.method1690((byte)(-66));
        }
        return null;
    }
    
    public static void dr() {
        Widget.Widget_cachedSprites.clear();
        Widget.Widget_cachedModels.clear();
        Widget.Widget_cachedFonts.clear();
        Widget.Widget_cachedSpriteMasks.clear();
    }
    
    public void wb(final boolean modelOrthog) {
        this.modelOrthog = modelOrthog;
    }
    
    void decode(final Buffer buffer, final int n) {
        try {
            Buffer.ra(buffer, (byte)7);
            this.modelOrthog = true;
            this.type = Buffer.ra(buffer, (byte)7) * -1183495331;
            this.contentType = buffer.readUnsignedShort(-860283863) * 577746185;
            this.rawX = buffer.readUnsignedByte((byte)(-108)) * 1806877347;
            this.rawY = buffer.readUnsignedByte((byte)(-2)) * 1231090287;
            this.rawWidth = buffer.readUnsignedShort(-1284593302) * -1495372107;
            if (9 == this.type * 883712245) {
                if (n >= 1622125384) {
                    throw new IllegalStateException();
                }
                this.rawHeight = buffer.readUnsignedByte((byte)(-12)) * 1193771871;
            }
            else {
                this.rawHeight = buffer.readUnsignedShort(-672369583) * 1193771871;
            }
            this.widthAlignment = Buffer.wu(buffer, 435772489) * 387308049;
            this.heightAlignment = Buffer.wu(buffer, 435772489) * -480958745;
            this.xAlignment = Buffer.wu(buffer, 435772489) * 1656805111;
            this.yAlignment = Buffer.wu(buffer, 435772489) * -362988363;
            this.parentId = buffer.readUnsignedShort(-778192163) * 908641471;
            if (this.parentId * 913615679 == 65535) {
                if (n >= 1622125384) {
                    throw new IllegalStateException();
                }
                this.parentId = -908641471;
            }
            else {
                this.parentId = 908641471 * (913615679 * this.parentId + (1713081171 * this.id & 0xFFFF0000));
            }
            boolean spriteTiling;
            if (Buffer.ra(buffer, (byte)7) == 1) {
                if (n >= 1622125384) {
                    return;
                }
                spriteTiling = true;
            }
            else {
                spriteTiling = false;
            }
            this.spriteTiling = spriteTiling;
            if (this.type * 883712245 == 0) {
                if (n >= 1622125384) {
                    return;
                }
                this.scrollWidth = buffer.readUnsignedShort(881940245) * -1469650905;
                this.scrollHeight = buffer.readUnsignedShort(440622161) * -1357451643;
                this.hasListener = (Buffer.ra(buffer, (byte)7) == 1);
            }
            if (this.type * 883712245 == 5) {
                if (n >= 1622125384) {
                    throw new IllegalStateException();
                }
                this.spriteId2 = buffer.readInt(-908579072) * -504605111;
                this.spriteAngle = buffer.readUnsignedShort(-154531078) * 877496813;
                boolean field2913;
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    if (n >= 1622125384) {
                        throw new IllegalStateException();
                    }
                    field2913 = true;
                }
                else {
                    field2913 = false;
                }
                this.field2913 = field2913;
                this.transparencyTop = Buffer.ra(buffer, (byte)7) * 1833148663;
                this.outline = Buffer.ra(buffer, (byte)7) * 646392503;
                this.spriteShadow = buffer.readInt(-886750098) * -140657215;
                boolean noClickThrough;
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    if (n >= 1622125384) {
                        return;
                    }
                    noClickThrough = true;
                }
                else {
                    noClickThrough = false;
                }
                this.noClickThrough = noClickThrough;
                boolean textShadowed;
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    if (n >= 1622125384) {
                        throw new IllegalStateException();
                    }
                    textShadowed = true;
                }
                else {
                    textShadowed = false;
                }
                this.textShadowed = textShadowed;
            }
            if (this.type * 883712245 == 6) {
                if (n >= 1622125384) {
                    throw new IllegalStateException();
                }
                this.modelType = -1714481443;
                this.modelId = buffer.readUnsignedShort(-1319093383) * 509431749;
                if (this.modelId * -168077555 == 65535) {
                    if (n >= 1622125384) {
                        throw new IllegalStateException();
                    }
                    this.modelId = -509431749;
                }
                this.modelOffsetX = buffer.readUnsignedByte((byte)(-5)) * 1759898391;
                this.modelOffsetY = buffer.readUnsignedByte((byte)(-47)) * 1163821709;
                this.modelAngleX = buffer.readUnsignedShort(-140094174) * -142910041;
                this.modelAngleY = buffer.readUnsignedShort(-378140908) * -230241203;
                this.modelAngleZ = buffer.readUnsignedShort(-1907530721) * -1051718121;
                this.modelZoom = buffer.readUnsignedShort(-1404062034) * -467727501;
                this.sequenceId = buffer.readUnsignedShort(-1930645584) * -1195025605;
                if (this.sequenceId * -1526544909 == 65535) {
                    if (n >= 1622125384) {
                        throw new IllegalStateException();
                    }
                    this.sequenceId = 1195025605;
                }
                boolean field2914;
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    if (n >= 1622125384) {
                        return;
                    }
                    field2914 = true;
                }
                else {
                    field2914 = false;
                }
                this.field2891 = field2914;
                buffer.readUnsignedShort(-1758445604);
                if (241981169 * this.widthAlignment != 0) {
                    if (n >= 1622125384) {
                        return;
                    }
                    this.modelRotation = buffer.readUnsignedShort(-1203596649) * 1436736911;
                }
                if (0 != this.heightAlignment * -480604969) {
                    if (n >= 1622125384) {
                        throw new IllegalStateException();
                    }
                    buffer.readUnsignedShort(-1062872092);
                }
            }
            if (4 == 883712245 * this.type) {
                if (n >= 1622125384) {
                    throw new IllegalStateException();
                }
                this.fontId = buffer.readUnsignedShort(133273303) * 1858899927;
                if (this.fontId * -1065036825 == 65535) {
                    if (n >= 1622125384) {
                        throw new IllegalStateException();
                    }
                    this.fontId = -1858899927;
                }
                this.field2916 = buffer.readStringCp1252NullTerminated((byte)0);
                this.textLineHeight = Buffer.ra(buffer, (byte)7) * 2116078665;
                this.textXAlignment = Buffer.ra(buffer, (byte)7) * 1612549297;
                this.textYAlignment = Buffer.ra(buffer, (byte)7) * -522107433;
                boolean isIf3;
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    if (n >= 1622125384) {
                        throw new IllegalStateException();
                    }
                    isIf3 = true;
                }
                else {
                    isIf3 = false;
                }
                this.isIf3 = isIf3;
                this.color = buffer.readInt(-1766490051) * -1604768377;
            }
            if (3 == 883712245 * this.type) {
                if (n >= 1622125384) {
                    throw new IllegalStateException();
                }
                this.color = buffer.readInt(-1326725156) * -1604768377;
                boolean noScrollThrough;
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    if (n >= 1622125384) {
                        return;
                    }
                    noScrollThrough = true;
                }
                else {
                    noScrollThrough = false;
                }
                this.noScrollThrough = noScrollThrough;
                this.transparencyTop = Buffer.ra(buffer, (byte)7) * 1833148663;
            }
            if (883712245 * this.type == 9) {
                if (n >= 1622125384) {
                    throw new IllegalStateException();
                }
                this.lineWid = Buffer.ra(buffer, (byte)7) * 1040382753;
                this.color = buffer.readInt(-1393871203) * -1604768377;
                this.isScrollBar = (Buffer.ra(buffer, (byte)7) == 1);
            }
            this.flags = buffer.readMedium(364517684) * -882629235;
            this.field3004 = buffer.readStringCp1252NullTerminated((byte)0);
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra > 0) {
                if (n >= 1622125384) {
                    throw new IllegalStateException();
                }
                this.actions = new String[ra];
                for (int i = 0; i < ra; ++i) {
                    if (n >= 1622125384) {
                        return;
                    }
                    this.actions[i] = buffer.readStringCp1252NullTerminated((byte)0);
                }
            }
            this.dragZoneSize = Buffer.ra(buffer, (byte)7) * 1773001161;
            this.dragThreshold = Buffer.ra(buffer, (byte)7) * 1466803237;
            boolean spriteFlipH;
            if (Buffer.ra(buffer, (byte)7) == 1) {
                if (n >= 1622125384) {
                    throw new IllegalStateException();
                }
                spriteFlipH = true;
            }
            else {
                spriteFlipH = false;
            }
            this.spriteFlipH = spriteFlipH;
            this.text2 = buffer.readStringCp1252NullTerminated((byte)0);
            this.onLoad = pk(this, buffer, -1943743675);
            this.onMouseOver = pk(this, buffer, -1943743675);
            this.onMouseLeave = pk(this, buffer, -1943743675);
            this.onTargetLeave = pk(this, buffer, -1943743675);
            this.onTargetEnter = pk(this, buffer, -1943743675);
            this.onVarTransmit = pk(this, buffer, -1943743675);
            this.onInvTransmit = pk(this, buffer, -1943743675);
            this.onStatTransmit = pk(this, buffer, -1943743675);
            this.onTimer = pk(this, buffer, -1943743675);
            this.onOp = pk(this, buffer, -1943743675);
            this.onMouseRepeat = pk(this, buffer, -1943743675);
            this.onClick = pk(this, buffer, -1943743675);
            this.onClickRepeat = pk(this, buffer, -1943743675);
            this.onRelease = pk(this, buffer, -1943743675);
            this.onHold = pk(this, buffer, -1943743675);
            this.onDrag = pk(this, buffer, -1943743675);
            this.onDragComplete = pk(this, buffer, -1943743675);
            this.onScroll = pk(this, buffer, -1943743675);
            this.varTransmitTriggers = ip(this, buffer, 1664985017);
            this.invTransmitTriggers = ip(this, buffer, 1664985017);
            this.statTransmitTriggers = ip(this, buffer, 1664985017);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ab(" + ')');
        }
    }
    
    Object[] readListener(final Buffer buffer, final int n) {
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra != 0) {
                final Object[] array = new Object[ra];
                for (int i = 0; i < ra; ++i) {
                    if (n != -1943743675) {
                        throw new IllegalStateException();
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    if (ra2 == 0) {
                        array[i] = new Integer(buffer.readInt(-1903835442));
                    }
                    else if (ra2 != 0) {
                        if (n != -1943743675) {
                            throw new IllegalStateException();
                        }
                        array[i] = buffer.readStringCp1252NullTerminatedOrNull((byte)0);
                    }
                }
                this.noScrollThrough = true;
                return array;
            }
            if (n != -1943743675) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.aq(" + ')');
        }
    }
    
    public void method1803(String replaceAll, final UrlRequester urlRequester, final long i) {
        try {
            if (11 != 883712245 * this.type || -1L == i) {
                return;
            }
            replaceAll = replaceAll.replaceAll("%userid%", Long.toString(i));
            this.field2868 = new class166();
            if (!class166.nu(this.field2868, replaceAll, urlRequester, 493996582)) {
                this.field2868 = null;
                return;
            }
            if (null == this.field2949 || this.field2950 == null) {
                nk(this, (byte)(-119));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.aj(" + ')');
        }
    }
    
    public static int getModel(final Widget widget) {
        return (widget.field2950 != null && widget.field2950.size() > 0) ? 1 : 0;
    }
    
    public Model getModel(final SequenceDefinition sequenceDefinition, final int n, final boolean b, final PlayerComposition playerComposition, final NPCComposition npcComposition, final NewShit newShit, final int n2) {
        try {
            Widget.field2877 = false;
            int n3;
            int n4;
            if (b) {
                if (n2 == 1781879508) {
                    throw new IllegalStateException();
                }
                n3 = this.modelType2 * 1761517389;
                n4 = this.modelId2 * -3148259;
            }
            else {
                n3 = this.modelType * -123768459;
                n4 = this.modelId * -168077555;
            }
            if (6 == n3) {
                if (null == npcComposition) {
                    return null;
                }
                n4 = npcComposition.id * -1115372301;
            }
            if (n3 == 0) {
                return null;
            }
            if (n3 != 0) {
                if (n2 == 1781879508) {
                    throw new IllegalStateException();
                }
                if (-1 == n4) {
                    if (n2 == 1781879508) {
                        throw new IllegalStateException();
                    }
                    return null;
                }
            }
            if (newShit != null) {
                if (n2 == 1781879508) {
                    throw new IllegalStateException();
                }
                if (newShit.field1558) {
                    if (n2 == 1781879508) {
                        throw new IllegalStateException();
                    }
                    if (6 == n3) {
                        if (n2 == 1781879508) {
                            throw new IllegalStateException();
                        }
                        n3 = 3;
                    }
                }
            }
            long n5 = n4 + (n3 << 16);
            if (newShit != null) {
                if (n2 == 1781879508) {
                    throw new IllegalStateException();
                }
                n5 |= newShit.field1556 * -1176524468931644747L << 20;
            }
            Model model = (Model)Widget.Widget_cachedModels.wr(n5);
            if (model == null) {
                if (n2 == 1781879508) {
                    throw new IllegalStateException();
                }
                ModelData modelData = null;
                int n6 = 64;
                int n7 = 768;
                switch (n3) {
                    case 1: {
                        modelData = ModelData.ModelData_get(DynamicObject.field813, n4, 0);
                        break;
                    }
                    case 4: {
                        final ItemComposition set = HealthBarUpdate.set(n4, (byte)112);
                        modelData = set.getModelData(10, -305031719);
                        n6 += set.field1780 * 2093614773;
                        n7 += 1794294545 * set.field1781;
                        break;
                    }
                    case 2: {
                        modelData = AbstractArchive.getNpcDefinition(n4, (byte)(-54)).method1022(null, (byte)64);
                        break;
                    }
                    case 6: {
                        modelData = AbstractArchive.getNpcDefinition(n4, (byte)(-120)).method1022(newShit, (byte)64);
                        break;
                    }
                    case 3: {
                        ModelData modelData2;
                        if (null != playerComposition) {
                            if (n2 == 1781879508) {
                                throw new IllegalStateException();
                            }
                            modelData2 = playerComposition.getModelData((byte)126);
                        }
                        else {
                            modelData2 = null;
                        }
                        modelData = modelData2;
                        break;
                    }
                }
                if (modelData == null) {
                    if (n2 == 1781879508) {
                        throw new IllegalStateException();
                    }
                    Widget.field2877 = true;
                    return null;
                }
                else {
                    model = modelData.dg(n6, n7, -50, -10, -50);
                    Widget.Widget_cachedModels.put(model, n5);
                }
            }
            if (sequenceDefinition != null) {
                if (n2 == 1781879508) {
                    throw new IllegalStateException();
                }
                model = sequenceDefinition.transformWidgetModel(model, n, (byte)(-59));
            }
            return model;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ag(" + ')');
        }
    }
    
    public static void bl(final AbstractArchive widget_archive, final AbstractArchive field813, final AbstractArchive widget_spritesArchive, final AbstractArchive widget_fontsArchive) {
        int groupCount = 0;
        if (null != widget_archive) {
            UserComparator3.Widget_archive = widget_archive;
            DynamicObject.field813 = field813;
            ScriptEvent.Widget_spritesArchive = widget_spritesArchive;
            class146.Widget_fontsArchive = widget_fontsArchive;
            groupCount = UserComparator3.Widget_archive.getGroupCount(-1909377872);
        }
        VerticalAlignment.Widget_interfaceComponents = new Widget[groupCount][];
        class264.Widget_loadedInterfaces = new boolean[groupCount];
    }
    
    public void setHeight(final int n) {
        this.height = n * 60157125;
    }
    
    public void ep(final String key, final int i) {
        if (11 != 883712245 * this.type) {
            return;
        }
        if (null == this.field2950) {
            nk(this, (byte)(-84));
        }
        this.field2950.put(key, i);
    }
    
    public Widget ep(final int n) {
        this.widthAlignment = n * 387308049;
        return this;
    }
    
    public int getHeight() {
        return this.height * 1473950221;
    }
    
    public static int jo(final Widget widget, final String s) {
        if (11 == widget.type * 883712245 && null != widget.field2868 && widget.method1807(2049251692)) {
            return class166.method932(widget.field2868, s, (byte)26);
        }
        return -1;
    }
    
    public boolean method1820(final UrlRequester urlRequester, final int n) {
        try {
            if (this.type * 883712245 == 11) {
                if (n <= 13973491) {
                    throw new IllegalStateException();
                }
                if (this.field2868 != null) {
                    class166.qr(this.field2868, urlRequester, (byte)(-18));
                    if (this.field2868.method926((byte)(-28)) != this.field2948 * 1888225603) {
                        if (n <= 13973491) {
                            throw new IllegalStateException();
                        }
                        this.field2948 = this.field2868.method926((byte)2) * 996199275;
                        if (this.field2948 * 1888225603 >= 100) {
                            if (n <= 13973491) {
                                throw new IllegalStateException();
                            }
                            return true;
                        }
                        else if (2 == this.field2948 * 1888225603) {
                            if (n <= 13973491) {
                                throw new IllegalStateException();
                            }
                            this.method1813(1652307373);
                            return true;
                        }
                    }
                    return false;
                }
                if (n <= 13973491) {
                    throw new IllegalStateException();
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bz(" + ')');
        }
    }
    
    public static void fu(final Widget widget, final int n) {
        final ItemComposition set = HealthBarUpdate.set(n, (byte)44);
        widget.field2894.field2841[1195930965 * set.maleModel] = 512 + n;
        if (-1529774604 * set.maleModel1 != -1) {
            widget.field2894.field2841[set.maleModel1 * 2033568843] = 0;
        }
        if (set.maleModel2 * 723093341 != -1) {
            widget.field2894.field2841[set.maleModel2 * 1574352227] = 0;
        }
        widget.field2894.setHash(-469114674);
    }
    
    public static void qp(final Widget widget) {
        if (widget == null) {
            widget.getBounds();
        }
        widget.field2949 = new HashMap();
        widget.field2950 = new HashMap();
    }
    
    public Widget lq(final int n) {
        this.scrollHeight = n * -1357451643;
        return this;
    }
    
    public String eg(final String s) {
        if (11 == this.type * 883712245 && null != this.field2868 && this.method1807(921413764)) {
            return class166.ya(this.field2868, s, (byte)(-35));
        }
        return null;
    }
    
    public boolean ej() {
        return 2 == -838503643 * this.field2948;
    }
    
    public String jq() {
        if (11 == 883712245 * this.type && null != this.field2868) {
            final String li = class166.li(this.field2868, (byte)116);
            for (final class177 class177 : this.field2868.method931(840842327)) {
                final String format = String.format("%%%S%%", class177.method963((byte)(-18)));
                if (class177.vmethod3379((byte)73) == 0) {
                    li.replaceAll(format, Integer.toString(class177.vmethod3378(-1603349003)));
                }
                else {
                    li.replaceAll(format, class177.vmethod3380((byte)42));
                }
            }
            return li;
        }
        return null;
    }
    
    public class314 method1815(final byte b) {
        try {
            class314 field2823;
            if (null != this.field2951) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                field2823 = this.field2951.field2823;
            }
            else {
                field2823 = null;
            }
            return field2823;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bj(" + ')');
        }
    }
    
    public void dd(final String s, final UrlRequester urlRequester) {
        if (706341050 * this.type == 11 && null != s) {
            class166.la(this.field2868 = new class166(), s, urlRequester, 675217035);
        }
    }
    
    public int[] mp() {
        return this.field3007;
    }
    
    public void dj(final String s, final UrlRequester urlRequester) {
        if (883712245 * this.type == 11 && null != s) {
            class166.la(this.field2868 = new class166(), s, urlRequester, -588024458);
        }
    }
    
    public int getItemId() {
        return this.itemId * -2006098851;
    }
    
    public Point getCanvasLocation() {
        return new Point(this.kw, this.vc);
    }
    
    public void setOnDialogAbortListener(final Object[] onDialogAbort) {
        this.onDialogAbort = onDialogAbort;
    }
    
    public void setOnMouseLeaveListener(final Object[] onMouseLeave) {
        this.onMouseLeave = onMouseLeave;
    }
    
    public void setOnTargetLeaveListener(final Object[] onTargetLeave) {
        this.onTargetLeave = onTargetLeave;
    }
    
    public void setOnMouseOverListener(final Object[] onMouseOver) {
        this.onMouseOver = onMouseOver;
    }
    
    public void setOnVarTransmitListener(final Object[] onVarTransmit) {
        this.onVarTransmit = onVarTransmit;
    }
    
    public void setOnReleaseListener(final Object[] onRelease) {
        this.onRelease = onRelease;
    }
    
    public int getItemQuantityMode() {
        return this.itemQuantityMode * -1681772717;
    }
    
    public void setVarTransmitTrigger(final int[] varTransmitTriggers) {
        this.varTransmitTriggers = varTransmitTriggers;
    }
    
    public Object[] getOnVarTransmitListener() {
        return this.onVarTransmit;
    }
    
    public void setOnMouseRepeatListener(final Object[] onMouseRepeat) {
        this.onMouseRepeat = onMouseRepeat;
    }
    
    public void setOnTargetEnterListener(final Object[] onTargetEnter) {
        this.onTargetEnter = onTargetEnter;
    }
    
    public void setOnDragCompleteListener(final Object[] onDragComplete) {
        this.onDragComplete = onDragComplete;
    }
    
    public Object[] getOnInvTransmitListener() {
        return this.onInvTransmit;
    }
    
    public static void go(final Widget widget, final int n) {
        final ItemComposition set = HealthBarUpdate.set(n, (byte)33);
        widget.field2894.field2841[-1924630099 * set.maleModel] = -1933372952 + n;
        if (-1719338253 * set.maleModel1 != -1) {
            widget.field2894.field2841[set.maleModel1 * -1719338253] = 0;
        }
        if (set.maleModel2 * -226784756 != -1) {
            widget.field2894.field2841[set.maleModel2 * -625166098] = 0;
        }
        widget.field2894.setHash(-469114674);
    }
    
    public Widget go(final int n) {
        this.transparencyTop = n * 1833148663;
        return this;
    }
    
    public static void gr(final Widget widget, final int n) {
        final ItemComposition set = HealthBarUpdate.set(n, (byte)113);
        widget.field2894.field2841[2058799079 * set.maleModel] = -1029430394 + n;
        if (-7947090 * set.maleModel1 != -1) {
            widget.field2894.field2841[set.maleModel1 * -1719338253] = 0;
        }
        if (set.maleModel2 * 1314220666 != -1) {
            widget.field2894.field2841[set.maleModel2 * 723093341] = 0;
        }
        widget.field2894.setHash(-469114674);
    }
    
    public void gr(final int n) {
        if (this.zh > -1) {
            this.setRelativeY(this.zh);
        }
    }
    
    public static boolean gr(final Widget widget, int n, int n2, final int n3, final int n4) {
        if (1622921433 * widget.type != 11 || null == widget.field2868 || !widget.method1807(958094799)) {
            return false;
        }
        n -= n3;
        n2 -= n4;
        final int n5 = (int)(widget.field2868.method930(2134468550)[0] * (widget.width * 712516532));
        final int n6 = (int)(widget.field2868.method930(2094635293)[1] * (1473950221 * widget.height));
        final int n7 = n5 + (int)(widget.field2868.method930(2097971203)[2] * (widget.width * -794961409));
        final int n8 = n6 + (int)(widget.field2868.method930(2071491454)[3] * (1473950221 * widget.height));
        return n >= n5 && n2 >= n6 && n < n7 && n2 < n8;
    }
    
    public Widget pu(final int n) {
        this.flags = n * -882629235;
        return this;
    }
    
    public Widget lj(final int n) {
        this.textYAlignment = n * -522107433;
        return this;
    }
    
    boolean fq(final class314 class314) {
        int n = 0;
        if (null != this.field2916 && !this.field2916.isEmpty()) {
            final int n2 = n;
            final String field2916 = this.field2916;
            final StringBuilder sb = new StringBuilder(field2916.length());
            int n3 = 0;
            int n4 = -1;
            for (int i = 0; i < field2916.length(); ++i) {
                final char char1 = field2916.charAt(i);
                if (char1 == '<') {
                    sb.append(field2916.substring(n3, i));
                    n4 = i;
                }
                else if (char1 == '>' && -1 != n4) {
                    final String substring = field2916.substring(n4 + 1, i);
                    n4 = -1;
                    if (substring.equals("lt")) {
                        sb.append("<");
                    }
                    else if (substring.equals("gt")) {
                        sb.append(">");
                    }
                    else if (substring.equals("br")) {
                        sb.append("\n");
                    }
                    n3 = 1 + i;
                }
            }
            if (n3 < field2916.length()) {
                sb.append(field2916.substring(n3, field2916.length()));
            }
            n = (n2 | (class314.method1708(sb.toString(), -180190586) ? 1 : 0));
            this.field2916 = "";
        }
        if (null != this.buttonText && !this.buttonText.isEmpty()) {
            final boolean b = n != 0;
            final String buttonText = this.buttonText;
            final StringBuilder sb2 = new StringBuilder(buttonText.length());
            int n5 = 0;
            int n6 = -1;
            for (int j = 0; j < buttonText.length(); ++j) {
                final char char2 = buttonText.charAt(j);
                if ('<' == char2) {
                    sb2.append(buttonText.substring(n5, j));
                    n6 = j;
                }
                else if ('>' == char2 && -1 != n6) {
                    final String substring2 = buttonText.substring(1 + n6, j);
                    n6 = -1;
                    if (substring2.equals("lt")) {
                        sb2.append("<");
                    }
                    else if (substring2.equals("gt")) {
                        sb2.append(">");
                    }
                    else if (substring2.equals("br")) {
                        sb2.append("\n");
                    }
                    n5 = 1 + j;
                }
            }
            if (n5 < buttonText.length()) {
                sb2.append(buttonText.substring(n5, buttonText.length()));
            }
            n = ((b | class314.method1709(sb2.toString(), (byte)2)) ? 1 : 0);
            this.buttonText = "";
        }
        return n != 0;
    }
    
    public void vp(final int n) {
        this.id = n * 346484955;
    }
    
    public Widget wn(final int n) {
        this.yAlignment = n * -362988363;
        return this;
    }
    
    public FillMode zq() {
        return this.fillMode;
    }
    
    public void yf(final int kw) {
        this.kw = kw;
    }
    
    public AbstractFont yx() {
        return this.getFont(-1026608542);
    }
    
    public static void ym(final Widget widget, final Buffer buffer) {
        if (widget == null) {
            widget.cu(buffer);
        }
        Buffer.ra(buffer, (byte)7);
        widget.modelOrthog = true;
        widget.type = Buffer.ra(buffer, (byte)7) * -1183495331;
        widget.contentType = buffer.readUnsignedShort(844784458) * 577746185;
        widget.rawX = buffer.readUnsignedByte((byte)(-39)) * 1806877347;
        widget.rawY = buffer.readUnsignedByte((byte)(-97)) * -1553874236;
        widget.rawWidth = buffer.readUnsignedShort(-137360841) * -1495372107;
        if (9 == widget.type * -710788397) {
            widget.rawHeight = buffer.readUnsignedByte((byte)(-65)) * 1849058192;
        }
        else {
            widget.rawHeight = buffer.readUnsignedShort(114223544) * -1319602417;
        }
        widget.widthAlignment = Buffer.wu(buffer, 435772489) * 387308049;
        widget.heightAlignment = Buffer.wu(buffer, 435772489) * -480958745;
        widget.xAlignment = Buffer.wu(buffer, 435772489) * 365177477;
        widget.yAlignment = Buffer.wu(buffer, 435772489) * -362988363;
        widget.parentId = buffer.readUnsignedShort(-714835800) * 908641471;
        if (widget.parentId * 1210575748 == 65535) {
            widget.parentId = 583677323;
        }
        else {
            widget.parentId = -1163217892 * (913615679 * widget.parentId + (-972440119 * widget.id & 0xE3B2FA37));
        }
        widget.spriteTiling = (Buffer.ra(buffer, (byte)7) == 1);
        if (widget.type * 1485466991 == 0) {
            widget.scrollWidth = buffer.readUnsignedShort(-140474307) * -1469650905;
            widget.scrollHeight = buffer.readUnsignedShort(-1229725433) * -1357451643;
            widget.hasListener = (Buffer.ra(buffer, (byte)7) == 1);
        }
        if (widget.type * 1984404542 == 5) {
            widget.spriteId2 = buffer.readInt(-1844224948) * -504605111;
            widget.spriteAngle = buffer.readUnsignedShort(-391054887) * 877496813;
            widget.field2913 = (Buffer.ra(buffer, (byte)7) == 1);
            widget.transparencyTop = Buffer.ra(buffer, (byte)7) * 1833148663;
            widget.outline = Buffer.ra(buffer, (byte)7) * 646392503;
            widget.spriteShadow = buffer.readInt(-1434819639) * -140657215;
            widget.noClickThrough = (Buffer.ra(buffer, (byte)7) == 1);
            widget.textShadowed = (Buffer.ra(buffer, (byte)7) == 1);
        }
        if (widget.type * 883712245 == 6) {
            widget.modelType = -1269646810;
            widget.modelId = buffer.readUnsignedShort(260568387) * 509431749;
            if (widget.modelId * -168077555 == -1356936563) {
                widget.modelId = -256678604;
            }
            widget.modelOffsetX = buffer.readUnsignedByte((byte)(-100)) * 1759898391;
            widget.modelOffsetY = buffer.readUnsignedByte((byte)(-67)) * -2018580308;
            widget.modelAngleX = buffer.readUnsignedShort(-1540757291) * 597754703;
            widget.modelAngleY = buffer.readUnsignedShort(497014315) * -230241203;
            widget.modelAngleZ = buffer.readUnsignedShort(-1602276567) * 2056326315;
            widget.modelZoom = buffer.readUnsignedShort(385645788) * -467727501;
            widget.sequenceId = buffer.readUnsignedShort(-207378272) * 1669602039;
            if (widget.sequenceId * 1258254807 == 65535) {
                widget.sequenceId = 1195025605;
            }
            widget.field2891 = (Buffer.ra(buffer, (byte)7) == 1);
            buffer.readUnsignedShort(-192548717);
            if (-1915305180 * widget.widthAlignment != 0) {
                widget.modelRotation = buffer.readUnsignedShort(-367516960) * 1436736911;
            }
            if (0 != widget.heightAlignment * -480604969) {
                buffer.readUnsignedShort(-383905346);
            }
        }
        if (4 == 883712245 * widget.type) {
            widget.fontId = buffer.readUnsignedShort(-242533504) * 1481896181;
            if (widget.fontId * 600958440 == 65535) {
                widget.fontId = -1858899927;
            }
            widget.field2916 = buffer.readStringCp1252NullTerminated((byte)0);
            widget.textLineHeight = Buffer.ra(buffer, (byte)7) * -530231764;
            widget.textXAlignment = Buffer.ra(buffer, (byte)7) * 1612549297;
            widget.textYAlignment = Buffer.ra(buffer, (byte)7) * -522107433;
            widget.isIf3 = (Buffer.ra(buffer, (byte)7) == 1);
            widget.color = buffer.readInt(-1575807963) * -1604768377;
        }
        if (3 == 883712245 * widget.type) {
            widget.color = buffer.readInt(-1454914812) * -544624979;
            widget.noScrollThrough = (Buffer.ra(buffer, (byte)7) == 1);
            widget.transparencyTop = Buffer.ra(buffer, (byte)7) * -1066042954;
        }
        if (-1191635968 * widget.type == 9) {
            widget.lineWid = Buffer.ra(buffer, (byte)7) * 1040382753;
            widget.color = buffer.readInt(-1461603469) * -1424102030;
            widget.isScrollBar = (Buffer.ra(buffer, (byte)7) == 1);
        }
        widget.flags = buffer.readMedium(1361717732) * -882629235;
        widget.field3004 = buffer.readStringCp1252NullTerminated((byte)0);
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra > 0) {
            widget.actions = new String[ra];
            for (int i = 0; i < ra; ++i) {
                widget.actions[i] = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        widget.dragZoneSize = Buffer.ra(buffer, (byte)7) * 1773001161;
        widget.dragThreshold = Buffer.ra(buffer, (byte)7) * 1466803237;
        widget.spriteFlipH = (Buffer.ra(buffer, (byte)7) == 1);
        widget.text2 = buffer.readStringCp1252NullTerminated((byte)0);
        widget.onLoad = pk(widget, buffer, -1943743675);
        widget.onMouseOver = pk(widget, buffer, -1943743675);
        widget.onMouseLeave = pk(widget, buffer, -1943743675);
        widget.onTargetLeave = pk(widget, buffer, -1943743675);
        widget.onTargetEnter = pk(widget, buffer, -1943743675);
        widget.onVarTransmit = pk(widget, buffer, -1943743675);
        widget.onInvTransmit = pk(widget, buffer, -1943743675);
        widget.onStatTransmit = pk(widget, buffer, -1943743675);
        widget.onTimer = pk(widget, buffer, -1943743675);
        widget.onOp = pk(widget, buffer, -1943743675);
        widget.onMouseRepeat = pk(widget, buffer, -1943743675);
        widget.onClick = pk(widget, buffer, -1943743675);
        widget.onClickRepeat = pk(widget, buffer, -1943743675);
        widget.onRelease = pk(widget, buffer, -1943743675);
        widget.onHold = pk(widget, buffer, -1943743675);
        widget.onDrag = pk(widget, buffer, -1943743675);
        widget.onDragComplete = pk(widget, buffer, -1943743675);
        widget.onScroll = pk(widget, buffer, -1943743675);
        widget.varTransmitTriggers = ip(widget, buffer, 1664985017);
        widget.invTransmitTriggers = ip(widget, buffer, 1664985017);
        widget.statTransmitTriggers = ip(widget, buffer, 1664985017);
    }
    
    public Widget zn(int n, final int type) {
        if (!Widget.qx && !ScriptFrame.client.isClientThread()) {
            throw new AssertionError((Object)"must be called on client thread");
        }
        final Widget zb = ScriptFrame.client.zb();
        zb.setType(type);
        zb.dl(this.getId());
        zb.vp(this.getId());
        zb.wb(true);
        Object[] rh = this.rh();
        if (n < 0) {
            if (rh == null) {
                n = 0;
            }
            else {
                n = 0;
                for (int i = ((net.runelite.api.widgets.Widget[])rh).length - 1; i >= 0; --i) {
                    if (rh[i] != null) {
                        n = i + 1;
                        break;
                    }
                }
            }
        }
        if (rh == null) {
            rh = new Widget[n + 1];
            this.setChildren((net.runelite.api.widgets.Widget[])rh);
        }
        else if (((net.runelite.api.widgets.Widget[])rh).length <= n) {
            final Widget[] array = new Widget[n + 1];
            System.arraycopy(rh, 0, array, 0, ((net.runelite.api.widgets.Widget[])rh).length);
            rh = array;
            this.setChildren((net.runelite.api.widgets.Widget[])rh);
        }
        ((Widget)(rh[n] = zb)).jp(n);
        return zb;
    }
    
    public int getRelativeY() {
        return this.y * -747355095;
    }
    
    public int getModelId() {
        return this.modelId * -168077555;
    }
    
    public void setForcedPosition(final int relativeX, final int relativeY) {
        this.js = (short)relativeX;
        this.zh = (short)relativeY;
        this.setRelativeX(relativeX);
        this.setRelativeY(relativeY);
    }
    
    public int getRelativeX() {
        return this.x * 262951665;
    }
    
    public int getClickMask() {
        return this.flags * 1652991301;
    }
    
    public void setRelativeX(final int n) {
        this.x = n * 750411281;
    }
    
    public int getRotationY() {
        return this.modelAngleZ * -1023931993;
    }
    
    public int getRotationZ() {
        return this.modelAngleY * -480949115;
    }
    
    public net.runelite.api.widgets.Widget[] getNestedChildren() {
        if (!Widget.qx && !ScriptFrame.client.isClientThread()) {
            throw new AssertionError((Object)"must be called on client thread");
        }
        if (this.ev() == this.getId()) {
            return new net.runelite.api.widgets.Widget[0];
        }
        final WidgetNode widgetNode = (WidgetNode)((HashTable)ScriptFrame.client.xr()).get((long)this.getId());
        if (widgetNode == null) {
            return (net.runelite.api.widgets.Widget[])new Widget[0];
        }
        final int id = widgetNode.getId();
        final ArrayList<Widget> list = new ArrayList<Widget>();
        for (final Widget widget : ScriptFrame.client.fo(id)) {
            if (widget != null && widget.ev() == -1) {
                list.add(widget);
            }
        }
        return list.toArray((net.runelite.api.widgets.Widget[])new Widget[list.size()]);
    }
    
    public void setRelativeY(final int n) {
        this.y = n * -1520068583;
    }
    
    public int getModelType() {
        return this.modelType * -123768459;
    }
    
    public int getRotationX() {
        return this.modelAngleX * 797932055;
    }
    
    public net.runelite.api.widgets.Widget[] getDynamicChildren() {
        final Widget[] rh = this.rh();
        if (rh == null) {
            return new net.runelite.api.widgets.Widget[0];
        }
        final ArrayList<Widget> list = new ArrayList<Widget>();
        for (final Widget widget : rh) {
            if (widget != null && widget.ev() == this.getId()) {
                list.add(widget);
            }
        }
        return list.toArray(new net.runelite.api.widgets.Widget[list.size()]);
    }
    
    public int getTextColor() {
        return this.color * 1409091639;
    }
    
    public net.runelite.api.widgets.Widget[] getStaticChildren() {
        if (this.ev() == this.getId()) {
            return new net.runelite.api.widgets.Widget[0];
        }
        final ArrayList<Widget> list = new ArrayList<Widget>();
        for (final Widget widget : ScriptFrame.client.fo(WidgetInfo.TO_GROUP(this.getId()))) {
            if (widget != null && widget.ev() == this.getId()) {
                list.add(widget);
            }
        }
        return list.toArray((net.runelite.api.widgets.Widget[])new Widget[list.size()]);
    }
    
    public int getAnimationId() {
        return this.sequenceId * -1526544909;
    }
    
    public int getParentId() {
        if (!Widget.qx && !ScriptFrame.client.isClientThread()) {
            throw new AssertionError((Object)"must be called on client thread");
        }
        final int ev = this.ev();
        if (ev != -1) {
            return ev;
        }
        final int id = this.getId();
        if (WidgetInfo.TO_GROUP(id) == ScriptFrame.client.getTopLevelInterfaceId()) {
            return -1;
        }
        final int qa = this.qa;
        if (qa != -1) {
            final WidgetNode widgetNode = (WidgetNode)((HashTable)ScriptFrame.client.xr()).get((long)qa);
            if (widgetNode != null && widgetNode.getId() == WidgetInfo.TO_GROUP(id)) {
                return qa;
            }
            this.qa = -1;
        }
        final int to_GROUP = WidgetInfo.TO_GROUP(this.getId());
        for (final InterfaceParent interfaceParent : ScriptFrame.client.xr()) {
            if (to_GROUP == interfaceParent.getId()) {
                return (int)interfaceParent.getHash();
            }
        }
        return -1;
    }
    
    public void setChildren(final net.runelite.api.widgets.Widget[] array) {
        this.children = (Widget[])array;
    }
    
    public int getSpriteId() {
        return this.spriteId2 * -363627527;
    }
    
    public boolean getSpriteTiling() {
        return this.field2913;
    }
    
    public int getOriginalHeight() {
        return this.rawHeight * 1756076191;
    }
    
    public void setOnOpListener(final Object[] onOp) {
        this.onOp = onOp;
    }
    
    public boolean isSelfHidden() {
        return this.spriteTiling;
    }
    
    public int getOriginalX() {
        return this.rawX * -115015413;
    }
    
    public int getModelZoom() {
        return this.modelZoom * 942674363;
    }
    
    public int getScrollX() {
        return this.scrollX * -1469632775;
    }
    
    public int getScrollHeight() {
        return this.scrollHeight * -1273374131;
    }
    
    public void deleteAllChildren() {
        if (this.rh() != null) {
            Arrays.fill(this.rh(), null);
        }
    }
    
    public void setOnKeyListener(final Object[] onKey) {
        this.onKey = onKey;
    }
    
    public int getItemQuantity() {
        return this.itemQuantity * 1336975799;
    }
    
    public int getScrollWidth() {
        return this.scrollWidth * -773060713;
    }
    
    public int getScrollY() {
        return this.scrollY * 1223232735;
    }
    
    public int getOriginalY() {
        return this.rawY * 1651158159;
    }
    
    public int getOriginalWidth() {
        return this.rawWidth * -1960603747;
    }
    
    public void setOnTimerListener(final Object[] onTimer) {
        this.onTimer = onTimer;
    }
    
    public Object[] getOnKeyListener() {
        return this.onKey;
    }
    
    public void setBorderType(final int n) {
        this.outline = n * 646392503;
    }
    
    public boolean getTextShadowed() {
        return this.isIf3;
    }
    
    public int getFontId() {
        return this.fontId * -1065036825;
    }
    
    public Object[] getOnLoadListener() {
        return this.onLoad;
    }
    
    public int getDragDeadTime() {
        return this.dragThreshold * -1849043027;
    }
    
    public boolean isIf3() {
        return this.modelOrthog;
    }
    
    public boolean hasListener() {
        return this.field2978;
    }
    
    public int getBorderType() {
        return this.outline * 1638912775;
    }
    
    public int getLineHeight() {
        return this.textLineHeight * -931338759;
    }
    
    public int getXTextAlignment() {
        return this.textXAlignment * 1002257489;
    }
    
    public void revalidateScroll() {
        if (!Widget.qx && !ScriptFrame.client.isClientThread()) {
            throw new AssertionError((Object)"must be called on client thread");
        }
        ScriptFrame.client.qw((net.runelite.api.widgets.Widget)this);
        ScriptFrame.client.xf((net.runelite.api.widgets.Widget[])ScriptFrame.client.oh()[WidgetInfo.TO_GROUP(this.getId())], (net.runelite.api.widgets.Widget)this, false);
    }
    
    public Object[] getOnOpListener() {
        return this.onOp;
    }
    
    public void setDragDeadTime(final int n) {
        this.dragThreshold = n * 1466803237;
    }
    
    public int getXPositionMode() {
        return this.xAlignment * -1596536121;
    }
    
    public int getYTextAlignment() {
        return this.textYAlignment * -1553957401;
    }
    
    public int getDragDeadZone() {
        return this.dragZoneSize * 154898553;
    }
    
    public void setDragDeadZone(final int n) {
        this.dragZoneSize = n * 1773001161;
    }
    
    public int getYPositionMode() {
        return this.yAlignment * 1484444061;
    }
    
    public int getWidthMode() {
        return this.widthAlignment * 241981169;
    }
    
    public void setOnHoldListener(final Object[] onHold) {
        this.onHold = onHold;
    }
    
    public void setTargetVerb(final String text2) {
        this.text2 = text2;
    }
    
    public void setOnDragListener(final Object[] onDrag) {
        this.onDrag = onDrag;
    }
    
    public int getHeightMode() {
        return this.heightAlignment * -480604969;
    }
    
    public void setNoClickThrough(final boolean hasListener) {
        this.hasListener = hasListener;
    }
    
    public void setNoScrollThrough(final boolean prioritizeMenuEntry) {
        this.prioritizeMenuEntry = prioritizeMenuEntry;
    }
    
    public String getTargetVerb() {
        return this.text2;
    }
    
    public void setOnClickListener(final Object[] onClick) {
        this.onClick = onClick;
    }
    
    public boolean getNoScrollThrough() {
        return this.prioritizeMenuEntry;
    }
    
    public boolean isFilled() {
        return this.noScrollThrough;
    }
    
    public boolean getNoClickThrough() {
        return this.hasListener;
    }
    
    public net.runelite.api.widgets.Widget getDragParent() {
        return (net.runelite.api.widgets.Widget)this.parent;
    }
    
    public class309 fz() {
        return (this.field2951 != null) ? this.field2951.field2822 : null;
    }
    
    public static void gs(final Widget widget, final int n) {
        final ItemComposition set = HealthBarUpdate.set(n, (byte)46);
        widget.field2894.field2841[-1935812527 * set.maleModel] = 512 + n;
        if (-1719338253 * set.maleModel1 != -1) {
            widget.field2894.field2841[set.maleModel1 * -1719338253] = 0;
        }
        if (set.maleModel2 * 723093341 != -1) {
            widget.field2894.field2841[set.maleModel2 * 723093341] = 0;
        }
        widget.field2894.setHash(-469114674);
    }
    
    void cq(final Buffer buffer) {
        Buffer.ra(buffer, (byte)7);
        this.modelOrthog = true;
        this.type = Buffer.ra(buffer, (byte)7) * -1183495331;
        this.contentType = buffer.readUnsignedShort(709173802) * 577746185;
        this.rawX = buffer.readUnsignedByte((byte)(-1)) * 1806877347;
        this.rawY = buffer.readUnsignedByte((byte)(-125)) * 1231090287;
        this.rawWidth = buffer.readUnsignedShort(-544709605) * -1495372107;
        if (9 == this.type * 883712245) {
            this.rawHeight = buffer.readUnsignedByte((byte)13) * 1193771871;
        }
        else {
            this.rawHeight = buffer.readUnsignedShort(-1010104336) * 1193771871;
        }
        this.widthAlignment = Buffer.wu(buffer, 435772489) * 387308049;
        this.heightAlignment = Buffer.wu(buffer, 435772489) * -480958745;
        this.xAlignment = Buffer.wu(buffer, 435772489) * 1656805111;
        this.yAlignment = Buffer.wu(buffer, 435772489) * -362988363;
        this.parentId = buffer.readUnsignedShort(690474928) * 908641471;
        if (this.parentId * 913615679 == 65535) {
            this.parentId = -908641471;
        }
        else {
            this.parentId = 908641471 * (913615679 * this.parentId + (1713081171 * this.id & 0xFFFF0000));
        }
        this.spriteTiling = (Buffer.ra(buffer, (byte)7) == 1);
        if (this.type * 883712245 == 0) {
            this.scrollWidth = buffer.readUnsignedShort(-32778485) * -1469650905;
            this.scrollHeight = buffer.readUnsignedShort(-1122783003) * -1357451643;
            this.hasListener = (Buffer.ra(buffer, (byte)7) == 1);
        }
        if (this.type * 883712245 == 5) {
            this.spriteId2 = buffer.readInt(-1232678807) * -504605111;
            this.spriteAngle = buffer.readUnsignedShort(759766515) * 877496813;
            this.field2913 = (Buffer.ra(buffer, (byte)7) == 1);
            this.transparencyTop = Buffer.ra(buffer, (byte)7) * 1833148663;
            this.outline = Buffer.ra(buffer, (byte)7) * 646392503;
            this.spriteShadow = buffer.readInt(-960501131) * -140657215;
            this.noClickThrough = (Buffer.ra(buffer, (byte)7) == 1);
            this.textShadowed = (Buffer.ra(buffer, (byte)7) == 1);
        }
        if (this.type * 883712245 == 6) {
            this.modelType = -1714481443;
            this.modelId = buffer.readUnsignedShort(-1526862456) * 509431749;
            if (this.modelId * -168077555 == 65535) {
                this.modelId = -509431749;
            }
            this.modelOffsetX = buffer.readUnsignedByte((byte)(-37)) * 1759898391;
            this.modelOffsetY = buffer.readUnsignedByte((byte)(-84)) * 1163821709;
            this.modelAngleX = buffer.readUnsignedShort(-1848846140) * -142910041;
            this.modelAngleY = buffer.readUnsignedShort(842682582) * -230241203;
            this.modelAngleZ = buffer.readUnsignedShort(-475940629) * -1051718121;
            this.modelZoom = buffer.readUnsignedShort(-795679408) * -467727501;
            this.sequenceId = buffer.readUnsignedShort(308201222) * -1195025605;
            if (this.sequenceId * -1526544909 == 65535) {
                this.sequenceId = 1195025605;
            }
            this.field2891 = (Buffer.ra(buffer, (byte)7) == 1);
            buffer.readUnsignedShort(-632024120);
            if (241981169 * this.widthAlignment != 0) {
                this.modelRotation = buffer.readUnsignedShort(-1366774064) * 1436736911;
            }
            if (0 != this.heightAlignment * -480604969) {
                buffer.readUnsignedShort(-510002182);
            }
        }
        if (4 == 883712245 * this.type) {
            this.fontId = buffer.readUnsignedShort(-2013284838) * 1858899927;
            if (this.fontId * -1065036825 == 65535) {
                this.fontId = -1858899927;
            }
            this.field2916 = buffer.readStringCp1252NullTerminated((byte)0);
            this.textLineHeight = Buffer.ra(buffer, (byte)7) * 2116078665;
            this.textXAlignment = Buffer.ra(buffer, (byte)7) * 1612549297;
            this.textYAlignment = Buffer.ra(buffer, (byte)7) * -522107433;
            this.isIf3 = (Buffer.ra(buffer, (byte)7) == 1);
            this.color = buffer.readInt(-1737859204) * -1604768377;
        }
        if (3 == 883712245 * this.type) {
            this.color = buffer.readInt(-1048116656) * -1604768377;
            this.noScrollThrough = (Buffer.ra(buffer, (byte)7) == 1);
            this.transparencyTop = Buffer.ra(buffer, (byte)7) * 1833148663;
        }
        if (883712245 * this.type == 9) {
            this.lineWid = Buffer.ra(buffer, (byte)7) * 1040382753;
            this.color = buffer.readInt(-1422439164) * -1604768377;
            this.isScrollBar = (Buffer.ra(buffer, (byte)7) == 1);
        }
        this.flags = buffer.readMedium(399826839) * -882629235;
        this.field3004 = buffer.readStringCp1252NullTerminated((byte)0);
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra > 0) {
            this.actions = new String[ra];
            for (int i = 0; i < ra; ++i) {
                this.actions[i] = buffer.readStringCp1252NullTerminated((byte)0);
            }
        }
        this.dragZoneSize = Buffer.ra(buffer, (byte)7) * 1773001161;
        this.dragThreshold = Buffer.ra(buffer, (byte)7) * 1466803237;
        this.spriteFlipH = (Buffer.ra(buffer, (byte)7) == 1);
        this.text2 = buffer.readStringCp1252NullTerminated((byte)0);
        this.onLoad = pk(this, buffer, -1943743675);
        this.onMouseOver = pk(this, buffer, -1943743675);
        this.onMouseLeave = pk(this, buffer, -1943743675);
        this.onTargetLeave = pk(this, buffer, -1943743675);
        this.onTargetEnter = pk(this, buffer, -1943743675);
        this.onVarTransmit = pk(this, buffer, -1943743675);
        this.onInvTransmit = pk(this, buffer, -1943743675);
        this.onStatTransmit = pk(this, buffer, -1943743675);
        this.onTimer = pk(this, buffer, -1943743675);
        this.onOp = pk(this, buffer, -1943743675);
        this.onMouseRepeat = pk(this, buffer, -1943743675);
        this.onClick = pk(this, buffer, -1943743675);
        this.onClickRepeat = pk(this, buffer, -1943743675);
        this.onRelease = pk(this, buffer, -1943743675);
        this.onHold = pk(this, buffer, -1943743675);
        this.onDrag = pk(this, buffer, -1943743675);
        this.onDragComplete = pk(this, buffer, -1943743675);
        this.onScroll = pk(this, buffer, -1943743675);
        this.varTransmitTriggers = ip(this, buffer, 1664985017);
        this.invTransmitTriggers = ip(this, buffer, 1664985017);
        this.statTransmitTriggers = ip(this, buffer, 1664985017);
    }
    
    public Widget jl(final int n) {
        this.sequenceId = n * -1195025605;
        return this;
    }
    
    public void fb() {
        this.field2951 = new class312();
        for (int i = 1; i <= 12; ++i) {
            this.field2951.field2827.method114(i, 0, (byte)0);
        }
        for (char c = '\0'; c < -1582912027; ++c) {
            this.field2951.field2827.method115(c, 0, 48495477);
        }
        this.field2951.field2827.method115('\u0080', 0, 48495477);
        this.field2951.field2827.method114(1412148639, 2, (byte)0);
        this.field2951.field2827.method114(235003602, 2, (byte)0);
        this.field2951.field2827.method114(1343330795, 2, (byte)0);
    }
    
    public int method1811(final int n) {
        try {
            if (this.type * 883712245 == 11) {
                if (n != 1876121307) {
                    throw new IllegalStateException();
                }
                if (null != this.field2868) {
                    if (n != 1876121307) {
                        throw new IllegalStateException();
                    }
                    if (this.field2950 != null) {
                        if (n != 1876121307) {
                            throw new IllegalStateException();
                        }
                        if (!this.field2950.isEmpty()) {
                            final String li = class166.li(this.field2868, (byte)123);
                            if (li != null) {
                                if (n != 1876121307) {
                                    throw new IllegalStateException();
                                }
                                if (this.field2950.containsKey(class166.li(this.field2868, (byte)89))) {
                                    if (n != 1876121307) {
                                        throw new IllegalStateException();
                                    }
                                    return (int)this.field2950.get(li);
                                }
                            }
                            return -1;
                        }
                        if (n != 1876121307) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bk(" + ')');
        }
    }
    
    public void dq(String replaceAll, final UrlRequester urlRequester, final long i) {
        if (11 != 883712245 * this.type || -1L == i) {
            return;
        }
        replaceAll = replaceAll.replaceAll("%userid%", Long.toString(i));
        this.field2868 = new class166();
        if (!class166.nu(this.field2868, replaceAll, urlRequester, 196998937)) {
            this.field2868 = null;
            return;
        }
        if (null == this.field2949 || this.field2950 == null) {
            nk(this, (byte)(-50));
        }
    }
    
    public static void eo(final Widget widget) {
        if (widget == null) {
            widget.fx();
        }
        widget.field2951 = new class312();
        for (int i = 1; i <= 12; ++i) {
            widget.field2951.field2827.method114(i, 0, (byte)0);
        }
        for (char c = '\0'; c < -387791360; ++c) {
            widget.field2951.field2827.method115(c, 0, 48495477);
        }
        widget.field2951.field2827.method115((char)1533474392, 0, 48495477);
        widget.field2951.field2827.method114(1493367022, 2, (byte)0);
        widget.field2951.field2827.method114(81, 2, (byte)0);
        widget.field2951.field2827.method114(1626375063, 2, (byte)0);
    }
    
    public void eo(final String key, final int i) {
        if (11 != 883712245 * this.type) {
            return;
        }
        if (null == this.field2950) {
            nk(this, (byte)(-3));
        }
        this.field2950.put(key, i);
    }
    
    public boolean fj() {
        final class314 method1815 = this.method1815((byte)29);
        if (method1815 == null) {
            return false;
        }
        boolean b = false;
        if (!method1815.da(200146670) && -1 != 1224195658 * this.fontId) {
            final int jo = class314.jo(method1815, -1343098801);
            final int method1816 = class314.method1714(method1815, -91399205);
            final int method1817 = method1815.method1753(476470413);
            final int method1818 = method1815.method1769(-987872518);
            final Font font = this.getFont(-550596355);
            if (null != font) {
                b = (b | method1815.method1737(font, 2101406289) | this.method1816(method1815, (byte)(-74)) | method1815.method1713(jo, method1816, (byte)56) | method1815.method1725(method1817, method1818, (byte)19));
            }
        }
        else if (method1815.da(1563809536)) {
            b |= this.method1816(method1815, (byte)49);
        }
        class314.ov(method1815, (byte)(-61));
        return b;
    }
    
    public String eb(final String s) {
        if (11 != this.type * 883712245 || null == this.field2868 || !this.method1807(1446399468)) {
            return null;
        }
        return class166.ya(this.field2868, s, (byte)(-21));
    }
    
    public Widget mz(final int n) {
        this.color = n * -1604768377;
        return this;
    }
    
    public Widget gq(final int n) {
        this.textLineHeight = n * 2116078665;
        return this;
    }
    
    public SpriteMask getSpriteMask(boolean b, final byte b2) {
        try {
            if (-1352724779 * this.rawY == -1) {
                if (b2 == -1) {
                    throw new IllegalStateException();
                }
                b = false;
            }
            int n;
            if (b) {
                if (b2 == -1) {
                    throw new IllegalStateException();
                }
                n = -1352724779 * this.widthAlignment;
            }
            else {
                n = -363627527 * this.modelRotation;
            }
            final int n2 = n;
            if (-1 == n2) {
                if (b2 == -1) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                long n3;
                if (this.textShadowed) {
                    if (b2 == -1) {
                        throw new IllegalStateException();
                    }
                    n3 = 1L;
                }
                else {
                    n3 = 0L;
                }
                final long n4 = n3 << 39;
                long n5;
                if (this.field2978) {
                    if (b2 == -1) {
                        throw new IllegalStateException();
                    }
                    n5 = 1L;
                }
                else {
                    n5 = 0L;
                }
                final long n6 = n4 + ((n5 << 38) + (((long)(1638912775 * this.field2870) << 36) + n2)) + ((long)(this.widthAlignment * -353676735) << 40);
                final SpriteMask spriteMask = (SpriteMask)Widget.Widget_cachedSprites.wr(n6);
                if (null != spriteMask) {
                    return spriteMask;
                }
                final SpritePixels sprite = this.getSprite(b, null, (byte)0);
                if (sprite != null) {
                    final SpritePixels gm = SpritePixels.gm(sprite);
                    final int[] array = new int[gm.xOffset];
                    final int[] array2 = new int[gm.width];
                    for (int i = 0; i < gm.width; ++i) {
                        if (b2 == -1) {
                            throw new IllegalStateException();
                        }
                        int n7 = 0;
                        int height = gm.height;
                        int j = 0;
                        while (j < gm.subHeight) {
                            if (b2 == -1) {
                                throw new IllegalStateException();
                            }
                            if (gm.pixels[j + i * gm.width] == 0) {
                                if (b2 == -1) {
                                    throw new IllegalStateException();
                                }
                                n7 = j;
                                break;
                            }
                            else {
                                ++j;
                            }
                        }
                        int k = gm.subWidth - 1;
                        while (k >= n7) {
                            if (b2 == -1) {
                                throw new IllegalStateException();
                            }
                            if (0 == gm.pixels[i * gm.height + k]) {
                                if (b2 == -1) {
                                    throw new IllegalStateException();
                                }
                                height = k + 1;
                                break;
                            }
                            else {
                                --k;
                            }
                        }
                        array2[i] = height - (array[i] = n7);
                    }
                    final SpriteMask spriteMask2 = new SpriteMask(gm.subWidth, gm.width, array2, array, n2);
                    Widget.Widget_cachedSpriteMasks.put(spriteMask2, n6);
                    return spriteMask2;
                }
                if (b2 == -1) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.ah(" + ')');
        }
    }
    
    public static boolean ig(final Widget widget) {
        return !widget.modelOrthog || 883712245 * widget.type == 0 || widget.type * 883712245 == 11 || widget.field2978 || 1338 == widget.contentType * 1021339961 || 12 == 883712245 * widget.type;
    }
    
    public Widget ef(final int n) {
        this.modelAngleX = n * -142910041;
        return this;
    }
    
    public boolean ef(int n, int n2, final int n3, final int n4) {
        if (883712245 * this.type == 11 && null != this.field2868 && this.method1807(-708525211)) {
            n -= n3;
            n2 -= n4;
            final int n5 = (int)(this.field2868.method930(2102498589)[0] * (this.width * -794961409));
            final int n6 = (int)(this.field2868.method930(2079574020)[1] * (1473950221 * this.height));
            final int n7 = n5 + (int)(this.field2868.method930(2083979399)[2] * (this.width * -794961409));
            final int n8 = n6 + (int)(this.field2868.method930(2064940507)[3] * (1473950221 * this.height));
            return n >= n5 && n2 >= n6 && n < n7 && n2 < n8;
        }
        return false;
    }
    
    public static void gj(final Widget widget, final PlayerComposition playerComposition, final boolean b) {
        widget.modelType = 883531787;
        widget.field2894 = new PlayerComposition(playerComposition);
        if (!b) {
            widget.field2894.field2841 = Arrays.copyOf(widget.field2894.bodyColors, widget.field2894.bodyColors.length);
            widget.field2894.setHash(-469114674);
        }
    }
    
    public Widget yt(final int n) {
        this.modelId = n * 509431749;
        return this;
    }
    
    public Widget uy(final boolean noScrollThrough) {
        this.noScrollThrough = noScrollThrough;
        return this;
    }
    
    public Widget uu(final int n) {
        this.rawHeight = n * 1193771871;
        return this;
    }
    
    public String ey() {
        return this.field2916;
    }
    
    public SpriteMask un(final boolean b) {
        return vn(this, b, (byte)29);
    }
    
    public static boolean un(final Widget widget, final class314 class314) {
        if (widget == null) {
            widget.getText();
        }
        int n = 0;
        if (null != widget.field2916 && !widget.field2916.isEmpty()) {
            final int n2 = n;
            final String field2916 = widget.field2916;
            final StringBuilder sb = new StringBuilder(field2916.length());
            int n3 = 0;
            int n4 = -1;
            for (int i = 0; i < field2916.length(); ++i) {
                final char char1 = field2916.charAt(i);
                if (char1 == '<') {
                    sb.append(field2916.substring(n3, i));
                    n4 = i;
                }
                else if (char1 == -310847143 && -1 != n4) {
                    final String substring = field2916.substring(n4 + 1, i);
                    n4 = -1;
                    if (substring.equals("lt")) {
                        sb.append("<");
                    }
                    else if (substring.equals("gt")) {
                        sb.append(">");
                    }
                    else if (substring.equals("br")) {
                        sb.append("\n");
                    }
                    n3 = 1 + i;
                }
            }
            if (n3 < field2916.length()) {
                sb.append(field2916.substring(n3, field2916.length()));
            }
            n = (n2 | (class314.method1708(sb.toString(), -739396142) ? 1 : 0));
            widget.field2916 = "";
        }
        if (null != widget.buttonText && !widget.buttonText.isEmpty()) {
            final boolean b = n != 0;
            final String buttonText = widget.buttonText;
            final StringBuilder sb2 = new StringBuilder(buttonText.length());
            int n5 = 0;
            int n6 = -1;
            for (int j = 0; j < buttonText.length(); ++j) {
                final char char2 = buttonText.charAt(j);
                if ('<' == char2) {
                    sb2.append(buttonText.substring(n5, j));
                    n6 = j;
                }
                else if (932649182 == char2 && -1 != n6) {
                    final String substring2 = buttonText.substring(1 + n6, j);
                    n6 = -1;
                    if (substring2.equals("lt")) {
                        sb2.append("<");
                    }
                    else if (substring2.equals("gt")) {
                        sb2.append(">");
                    }
                    else if (substring2.equals("br")) {
                        sb2.append("\n");
                    }
                    n5 = 1 + j;
                }
            }
            if (n5 < buttonText.length()) {
                sb2.append(buttonText.substring(n5, buttonText.length()));
            }
            n = ((b | class314.method1709(sb2.toString(), (byte)2)) ? 1 : 0);
            widget.buttonText = "";
        }
        return n != 0;
    }
    
    public int[] uq() {
        return this.itemIds;
    }
    
    public boolean method1822(final byte b) {
        try {
            final class314 method1815 = this.method1815((byte)56);
            if (method1815 == null) {
                return false;
            }
            boolean b2 = false;
            Label_0237: {
                if (!method1815.da(1727686434)) {
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                    if (-1 != -1065036825 * this.fontId) {
                        if (b >= 1) {
                            throw new IllegalStateException();
                        }
                        final int jo = class314.jo(method1815, -1303646018);
                        final int method1816 = class314.method1714(method1815, -91399205);
                        final int method1817 = method1815.method1753(276664254);
                        final int method1818 = method1815.method1769(1780556150);
                        final Font font = this.getFont(-1297665542);
                        if (null != font) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            b2 = (b2 | method1815.method1737(font, 1219787460) | this.method1816(method1815, (byte)(-12)) | method1815.method1713(jo, method1816, (byte)24) | method1815.method1725(method1817, method1818, (byte)19));
                        }
                        break Label_0237;
                    }
                }
                if (method1815.da(1828098152)) {
                    b2 |= this.method1816(method1815, (byte)86);
                }
            }
            class314.ov(method1815, (byte)(-76));
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mq.bu(" + ')');
        }
    }
    
    public Widget jb(final int n) {
        this.contentType = n * 577746185;
        return this;
    }
}
