import net.runelite.api.IterableHashTable;
import net.runelite.api.events.PostItemComposition;
import net.runelite.api.ParamHolder;

// 
// Decompiled by Procyon v0.5.36
// 

public class ItemComposition extends DualNode implements ParamHolder, net.runelite.api.ItemComposition
{
    static final int dd = 17;
    int field1736;
    public static final int aw = 2;
    public int price;
    public static AbstractArchive ItemDefinition_modelArchive;
    public static final int ac = -1;
    public int yf;
    static EvictingDualNodeHashTable ItemDefinition_cached;
    static EvictingDualNodeHashTable ItemDefinition_cachedModels;
    static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
    public int maleModel1;
    int model;
    int maleHeadModel2;
    public String[] groundActions;
    public short[] recolorTo;
    public short[] recolorFrom;
    public short[] retextureTo;
    public int zoom2d;
    public int xan2d;
    public int yan2d;
    public static final int at = 20;
    public int offsetX2d;
    public int offsetY2d;
    public static final int an = 1;
    public boolean isMembersOnly;
    public int maleModel;
    public short[] retextureFrom;
    public int maleModel2;
    int resizeX;
    public int isStackable;
    public String[] inventoryActions;
    int shiftClickIndex;
    int femaleModel;
    int femaleModel1;
    public String cv;
    int unnotedId;
    int maleHeadModel;
    int field1766;
    int field1767;
    int femaleModel2;
    int femaleHeadModel;
    int femaleHeadModel2;
    IterableNodeHashTable params;
    static final int au = -2;
    int field1772;
    int[] countobj;
    public int field1774;
    public int note;
    public int noteTemplate;
    public int team;
    int resizeY;
    int resizeZ;
    public int field1780;
    public int field1781;
    public int zan2d;
    public String name;
    int id;
    public boolean isTradable;
    int[] countco;
    int notedId;
    public int placeholder;
    public int placeholderTemplate;
    public static final int af = 0;
    static ClanSettings guestClanSettings;
    int femaleOffset;
    
    public String getName() {
        return this.name;
    }
    
    ItemComposition() {
        this.yf = -2;
        this.name = Strings.at;
        this.vx(-1);
        this.zoom2d = -139745840;
        this.xan2d = 0;
        this.yan2d = 0;
        this.zan2d = 0;
        this.offsetX2d = 0;
        this.offsetY2d = 0;
        this.isStackable = 0;
        this.price = -1041171269;
        this.maleModel = 1072009039;
        this.maleModel1 = -1699982907;
        this.maleModel2 = -1627653365;
        this.isMembersOnly = false;
        this.groundActions = new String[] { null, null, Strings.an, null, null };
        this.inventoryActions = new String[] { null, null, null, null, Strings.aw };
        this.shiftClickIndex = 1290787642;
        this.femaleModel = 240774559;
        this.femaleModel1 = -1308828767;
        this.femaleOffset = 0;
        this.maleHeadModel = 459970545;
        this.maleHeadModel2 = -624858415;
        this.field1767 = 0;
        this.femaleModel2 = -1230864509;
        this.femaleHeadModel = -787170795;
        this.femaleHeadModel2 = -1008801889;
        this.field1766 = -174922685;
        this.field1736 = 1191712917;
        this.field1772 = 738400803;
        this.note = -58690731;
        this.noteTemplate = -468518381;
        this.resizeX = 1106160256;
        this.resizeY = 1018432384;
        this.resizeZ = 1308512384;
        this.field1780 = 0;
        this.field1781 = 0;
        this.team = 0;
        this.field1774 = 0;
        this.isTradable = false;
        this.unnotedId = -1905271763;
        this.notedId = -1073961371;
        this.placeholder = 1652212107;
        this.placeholderTemplate = 115270063;
    }
    
    static {
        ItemComposition.ItemDefinition_cached = new EvictingDualNodeHashTable(64);
        ItemComposition.ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
        ItemComposition.ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
        ItemComposition.ItemDefinition_cached.dd(1024);
    }
    
    public final boolean cs(final int n) {
        int n2 = this.femaleModel * 1259737505;
        int n3 = this.femaleModel1 * -1975240801;
        int n4 = this.femaleModel2 * -1550321451;
        if (1 == n) {
            n2 = -1355512081 * this.maleHeadModel;
            n3 = -1937321521 * this.maleHeadModel2;
            n4 = this.femaleHeadModel * 1169668803;
        }
        if (-1 == n2) {
            return true;
        }
        boolean b = true;
        if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n2, 0, (byte)62)) {
            b = false;
        }
        if (n3 != -1 && !ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n3, 0, (byte)17)) {
            b = false;
        }
        if (-1 != n4 && !ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n4, 0, (byte)50)) {
            b = false;
        }
        return b;
    }
    
    public final ModelData ca(final int n) {
        int n2 = this.femaleModel * 1259737505;
        int n3 = -1975240801 * this.femaleModel1;
        int n4 = this.femaleModel2 * -1550321451;
        if (1 == n) {
            n2 = this.maleHeadModel * -1355512081;
            n3 = this.maleHeadModel2 * -1937321521;
            n4 = this.femaleHeadModel * 1169668803;
        }
        if (n2 == -1) {
            return null;
        }
        ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n2, 0);
        if (-1 != n3) {
            final ModelData modelData_get2 = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n3, 0);
            if (-1 != n4) {
                modelData_get = new ModelData(new ModelData[] { modelData_get, modelData_get2, ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n4, 0) }, 3);
            }
            else {
                modelData_get = new ModelData(new ModelData[] { modelData_get, modelData_get2 }, 2);
            }
        }
        if (0 == n && 0 != this.femaleOffset * 1328855603) {
            modelData_get.changeOffset(0, this.femaleOffset * 1328855603, 0);
        }
        if (1 == n && -846717499 * this.field1767 != 0) {
            modelData_get.changeOffset(0, -846717499 * this.field1767, 0);
        }
        if (this.recolorFrom != null) {
            for (int i = 0; i < this.recolorFrom.length; ++i) {
                ModelData.lm(modelData_get, this.recolorFrom[i], this.recolorTo[i]);
            }
        }
        if (this.retextureFrom != null) {
            for (int j = 0; j < this.retextureFrom.length; ++j) {
                ModelData.jw(modelData_get, this.retextureFrom[j], this.retextureTo[j]);
            }
        }
        return modelData_get;
    }
    
    public static ItemComposition ad(final int n) {
        final ItemComposition itemComposition = (ItemComposition)ItemComposition.ItemDefinition_cached.wr(n);
        if (null != itemComposition) {
            return itemComposition;
        }
        final byte[] takeFile = class355.ItemDefinition_archive.takeFile(10, n, (byte)(-68));
        final ItemComposition itemComposition2 = new ItemComposition();
        itemComposition2.id = n * -1117098283;
        if (null != takeFile) {
            yb(itemComposition2, new Buffer(takeFile), (byte)(-26));
        }
        ct(itemComposition2, -2068426156);
        if (-1 != 924764484 * itemComposition2.noteTemplate) {
            itemComposition2.genCert(HealthBarUpdate.set(itemComposition2.noteTemplate * -1375068187, (byte)54), HealthBarUpdate.set(-1758075920 * itemComposition2.note, (byte)62), -1309024725);
        }
        if (itemComposition2.notedId * 2112418018 != -1) {
            itemComposition2.genBought(HealthBarUpdate.set(itemComposition2.notedId * -1234096108, (byte)84), HealthBarUpdate.set(1846631443 * itemComposition2.unnotedId, (byte)73), 797932055);
        }
        if (itemComposition2.placeholderTemplate * 1327792934 != -1) {
            itemComposition2.genPlaceholder(HealthBarUpdate.set(itemComposition2.placeholderTemplate * 119859889, (byte)10), HealthBarUpdate.set(1513229825 * itemComposition2.placeholder, (byte)102), -652973951);
        }
        if (!FileSystem.ItemDefinition_inMembersWorld && itemComposition2.isMembersOnly) {
            itemComposition2.name = Strings.af;
            itemComposition2.isTradable = false;
            for (int i = 0; i < itemComposition2.groundActions.length; ++i) {
                itemComposition2.groundActions[i] = null;
            }
            for (int j = 0; j < itemComposition2.inventoryActions.length; ++j) {
                if (j != 4) {
                    itemComposition2.inventoryActions[j] = null;
                }
            }
            itemComposition2.shiftClickIndex = -798338479;
            itemComposition2.team = 0;
            if (itemComposition2.params != null) {
                boolean b = false;
                for (Node node = InvDefinition.xf(itemComposition2.params); null != node; node = IterableNodeHashTable.ow(itemComposition2.params)) {
                    if (class33.getParamDefinition((int)node.key, 372945378).autoDisable) {
                        node.hw();
                    }
                    else {
                        b = true;
                    }
                }
                if (!b) {
                    itemComposition2.params = null;
                }
            }
        }
        ItemComposition.ItemDefinition_cached.put(itemComposition2, n);
        return itemComposition2;
    }
    
    boolean cd() {
        return null != this.recolorTo;
    }
    
    public final Model ba(final int n) {
        if (null != this.countobj && n > 1) {
            int n2 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n >= this.countco[i] && 0 != this.countco[i]) {
                    n2 = this.countobj[i];
                }
            }
            if (-1 != n2) {
                return HealthBarUpdate.set(n2, (byte)103).getModel(1, -142459899);
            }
        }
        final Model model = (Model)ItemComposition.ItemDefinition_cachedModels.wr(-264956633 * this.id);
        if (null != model) {
            return model;
        }
        final ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, 2000117511 * this.model, 0);
        if (null == modelData_get) {
            return null;
        }
        if (this.resizeX * 614283261 != 128 || this.resizeY * 1552043943 != 128 || 128 != this.resizeZ * -302979231) {
            modelData_get.resize(614283261 * this.resizeX, 1552043943 * this.resizeY, -302979231 * this.resizeZ);
        }
        if (this.recolorFrom != null) {
            for (int j = 0; j < this.recolorFrom.length; ++j) {
                ModelData.lm(modelData_get, this.recolorFrom[j], this.recolorTo[j]);
            }
        }
        if (null != this.retextureFrom) {
            for (int k = 0; k < this.retextureFrom.length; ++k) {
                ModelData.jw(modelData_get, this.retextureFrom[k], this.retextureTo[k]);
            }
        }
        final Model dg = modelData_get.dg(64 + 2093614773 * this.field1780, 1794294545 * this.field1781 + 768, -50, -10, -50);
        dg.isSingleTile = true;
        ItemComposition.ItemDefinition_cachedModels.put(dg, this.id * -264956633);
        return dg;
    }
    
    public String cr(final int n, final String s) {
        return EnumComposition.method1014(this.params, n, s, 1821814707);
    }
    
    public static final SpritePixels ce(final int n, final int n2, final int n3, final int n4, int n5, final boolean b) {
        if (n2 == -1) {
            n5 = 0;
        }
        else if (2 == n5 && n2 != 1) {
            n5 = 1;
        }
        final long n6 = ((long)n3 << 38) + (n + ((long)n2 << 16)) + ((long)n5 << 40) + ((long)n4 << 42);
        if (!b) {
            final SpritePixels spritePixels = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.wr(n6);
            if (spritePixels != null) {
                return spritePixels;
            }
        }
        ItemComposition itemComposition = HealthBarUpdate.set(n, (byte)64);
        if (n2 > 1 && null != itemComposition.countobj) {
            int n7 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n2 >= itemComposition.countco[i] && 0 != itemComposition.countco[i]) {
                    n7 = itemComposition.countobj[i];
                }
            }
            if (n7 != -1) {
                itemComposition = HealthBarUpdate.set(n7, (byte)127);
            }
        }
        final Model model = itemComposition.getModel(1, -1285518212);
        if (model == null) {
            return null;
        }
        SpritePixels spritePixels2 = null;
        if (-1 != itemComposition.noteTemplate * -1375068187) {
            spritePixels2 = class252.getItemSprite(itemComposition.note * 1399852547, 10, 1, 0, 0, true, 70341383);
            if (null == spritePixels2) {
                return null;
            }
        }
        else if (-1276549997 * itemComposition.notedId != -1) {
            spritePixels2 = class252.getItemSprite(itemComposition.unnotedId * -1273418661, n2, n3, n4, 0, false, 1607538763);
            if (null == spritePixels2) {
                return null;
            }
        }
        else if (itemComposition.placeholderTemplate * 119859889 != -1) {
            spritePixels2 = class252.getItemSprite(-172219939 * itemComposition.placeholder, n2, 0, 0, 0, false, -558548449);
            if (null == spritePixels2) {
                return null;
            }
        }
        final int[] rasterizer2D_pixels = Rasterizer2D.Rasterizer2D_pixels;
        final int rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
        final int rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
        final float[] field4108 = Rasterizer2D.field4108;
        final int[] array = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(array);
        final SpritePixels spritePixels3 = new SpritePixels(36, 32);
        class1.method2(spritePixels3.pixels, 36, 32, null, 580310026);
        Rasterizer2D.Rasterizer2D_clear();
        class18.method68(947048934);
        WorldMapArea.getRegionLowX(16, 16, (byte)32);
        Rasterizer3D.clips.field2226 = false;
        if (-1 != itemComposition.placeholderTemplate * 119859889) {
            spritePixels2.drawAt(0, 0);
        }
        int n8 = itemComposition.zoom2d * 1014971553;
        if (b) {
            n8 *= (int)1.5;
        }
        else if (2 == n3) {
            n8 *= (int)1.04;
        }
        final int n9 = n8 * Rasterizer3D.Rasterizer3D_sine[415331477 * itemComposition.xan2d] >> 16;
        final int n10 = n8 * Rasterizer3D.Rasterizer3D_cosine[415331477 * itemComposition.xan2d] >> 16;
        model.calculateBoundsCylinder();
        model.method1343(0, -2044433177 * itemComposition.yan2d, itemComposition.zan2d * 450595207, itemComposition.xan2d * 415331477, itemComposition.offsetX2d * 151912273, 1550732737 * model.et / 2 + n9 + -271411709 * itemComposition.offsetY2d, n10 + itemComposition.offsetY2d * -271411709);
        if (-1276549997 * itemComposition.notedId != -1) {
            spritePixels2.drawAt(0, 0);
        }
        if (n3 >= 1) {
            spritePixels3.outline(1);
        }
        if (n3 >= 2) {
            spritePixels3.outline(16777215);
        }
        if (0 != n4) {
            spritePixels3.shadow(n4);
        }
        class1.method2(spritePixels3.pixels, 36, 32, null, 580310026);
        if (itemComposition.noteTemplate * -1375068187 != -1) {
            spritePixels2.drawAt(0, 0);
        }
        if (n5 == 1 || (n5 == 2 && 1 == itemComposition.isStackable * 1552863327)) {
            class492.xb(class124.ItemDefinition_fontPlain11, class101.method633(n2, 1048169383), 0, 9, 16776960, 1);
        }
        if (!b) {
            ItemComposition.ItemDefinition_cachedSprites.put(spritePixels3, n6);
        }
        class1.method2(rasterizer2D_pixels, rasterizer2D_width, rasterizer2D_height, field4108, 580310026);
        Rasterizer2D.Rasterizer2D_setClipArray(array);
        class18.method68(2037936259);
        Rasterizer3D.clips.field2226 = true;
        return spritePixels3;
    }
    
    public String cb(final int n, final String s) {
        return EnumComposition.method1014(this.params, n, s, 1927173070);
    }
    
    public static void ch() {
        ItemComposition.ItemDefinition_cachedSprites.clear();
    }
    
    public int cl(final int n, final int n2) {
        final IterableNodeHashTable params = this.params;
        int integer;
        if (null == params) {
            integer = n2;
        }
        else {
            final IntegerNode integerNode = (IntegerNode)params.aa(n);
            if (integerNode == null) {
                integer = n2;
            }
            else {
                integer = integerNode.integer;
            }
        }
        return integer;
    }
    
    public static boolean cl(final ItemComposition itemComposition, final int n) {
        int n2 = -1040157029 * itemComposition.femaleHeadModel2;
        int n3 = itemComposition.field1766 * 1679801011;
        if (n == 1) {
            n2 = itemComposition.field1736 * -560329405;
            n3 = itemComposition.field1772 * 1869912693;
        }
        if (n2 == -1) {
            return true;
        }
        boolean b = true;
        if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n2, 0, (byte)12)) {
            b = false;
        }
        if (-1 != n3 && !ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n3, 0, (byte)(-18))) {
            b = false;
        }
        return b;
    }
    
    public final boolean cn(final int n) {
        int n2 = this.femaleModel * 1259737505;
        int n3 = this.femaleModel1 * -1975240801;
        int n4 = this.femaleModel2 * -811112261;
        if (1 == n) {
            n2 = 1281141132 * this.maleHeadModel;
            n3 = -1937321521 * this.maleHeadModel2;
            n4 = this.femaleHeadModel * 1169668803;
        }
        if (-1 == n2) {
            return true;
        }
        boolean b = true;
        if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n2, 0, (byte)48)) {
            b = false;
        }
        if (n3 != -1 && !ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n3, 0, (byte)(-72))) {
            b = false;
        }
        if (-1 != n4 && !ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n4, 0, (byte)47)) {
            b = false;
        }
        return b;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public int getId() {
        return this.id * -264956633;
    }
    
    public static final SpritePixels bw(final int n, final int n2, final int n3, final int n4, int n5, final boolean b) {
        if (n2 == -1) {
            n5 = 0;
        }
        else if (2 == n5 && n2 != 1) {
            n5 = 1;
        }
        final long n6 = ((long)n3 << 38) + (n + ((long)n2 << 16)) + ((long)n5 << 768473652) + ((long)n4 << 336448191);
        if (!b) {
            final SpritePixels spritePixels = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.wr(n6);
            if (spritePixels != null) {
                return spritePixels;
            }
        }
        ItemComposition itemComposition = HealthBarUpdate.set(n, (byte)24);
        if (n2 > 1 && null != itemComposition.countobj) {
            int n7 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n2 >= itemComposition.countco[i] && 0 != itemComposition.countco[i]) {
                    n7 = itemComposition.countobj[i];
                }
            }
            if (n7 != -1) {
                itemComposition = HealthBarUpdate.set(n7, (byte)21);
            }
        }
        final Model model = itemComposition.getModel(1, -1739433994);
        if (model == null) {
            return null;
        }
        SpritePixels spritePixels2 = null;
        if (-1 != itemComposition.noteTemplate * 1619430787) {
            spritePixels2 = class252.getItemSprite(itemComposition.note * 1399852547, 10, 1, 0, 0, true, 1350498747);
            if (null == spritePixels2) {
                return null;
            }
        }
        else if (-1276549997 * itemComposition.notedId != -1) {
            spritePixels2 = class252.getItemSprite(itemComposition.unnotedId * -1273418661, n2, n3, n4, 0, false, -2367228);
            if (null == spritePixels2) {
                return null;
            }
        }
        else if (itemComposition.placeholderTemplate * 1823189813 != -1) {
            spritePixels2 = class252.getItemSprite(-573869434 * itemComposition.placeholder, n2, 0, 0, 0, false, 1274160880);
            if (null == spritePixels2) {
                return null;
            }
        }
        final int[] rasterizer2D_pixels = Rasterizer2D.Rasterizer2D_pixels;
        final int rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
        final int rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
        final float[] field4108 = Rasterizer2D.field4108;
        final int[] array = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(array);
        final SpritePixels spritePixels3 = new SpritePixels(36, 32);
        class1.method2(spritePixels3.pixels, 507291040, -2117446857, null, 580310026);
        Rasterizer2D.Rasterizer2D_clear();
        class18.method68(1314161630);
        WorldMapArea.getRegionLowX(16, 16, (byte)32);
        Rasterizer3D.clips.field2226 = false;
        if (-1 != itemComposition.placeholderTemplate * -1052577937) {
            spritePixels2.drawAt(0, 0);
        }
        int n8 = itemComposition.zoom2d * 1014971553;
        if (b) {
            n8 *= (int)1.5;
        }
        else if (2 == n3) {
            n8 *= (int)1.04;
        }
        final int n9 = n8 * Rasterizer3D.Rasterizer3D_sine[-1225997813 * itemComposition.xan2d] >> 16;
        final int n10 = n8 * Rasterizer3D.Rasterizer3D_cosine[-1412826487 * itemComposition.xan2d] >> 16;
        model.calculateBoundsCylinder();
        model.method1343(0, -2044433177 * itemComposition.yan2d, itemComposition.zan2d * 519954475, itemComposition.xan2d * -429700455, itemComposition.offsetX2d * -1555623169, 896612050 * model.et / 2 + n9 + -1707449472 * itemComposition.offsetY2d, n10 + itemComposition.offsetY2d * -271411709);
        if (974983281 * itemComposition.notedId != -1) {
            spritePixels2.drawAt(0, 0);
        }
        if (n3 >= 1) {
            spritePixels3.outline(1);
        }
        if (n3 >= 2) {
            spritePixels3.outline(16777215);
        }
        if (0 != n4) {
            spritePixels3.shadow(n4);
        }
        class1.method2(spritePixels3.pixels, -1389597368, 1515244110, null, 580310026);
        if (itemComposition.noteTemplate * -1375068187 != -1) {
            spritePixels2.drawAt(0, 0);
        }
        if (n5 == 1 || (n5 == 2 && 1 == itemComposition.isStackable * -2040776018)) {
            class492.xb(class124.ItemDefinition_fontPlain11, class101.method633(n2, 356980357), 0, 9, 414772285, 1);
        }
        if (!b) {
            ItemComposition.ItemDefinition_cachedSprites.put(spritePixels3, n6);
        }
        class1.method2(rasterizer2D_pixels, rasterizer2D_width, rasterizer2D_height, field4108, 580310026);
        Rasterizer2D.Rasterizer2D_setClipArray(array);
        class18.method68(589170590);
        Rasterizer3D.clips.field2226 = true;
        return spritePixels3;
    }
    
    public void setValue(final int n, final int n2) {
        this.xu(n, ScriptFrame.client.xq(n2));
    }
    
    public void setValue(final int n, final String s) {
        this.xu(n, ScriptFrame.client.jh(s));
    }
    
    public final ModelData cf(final int n) {
        int n2 = -1614483867 * this.femaleHeadModel2;
        int n3 = 1312051339 * this.field1766;
        if (n == 1) {
            n2 = 164011619 * this.field1736;
            n3 = 1869912693 * this.field1772;
        }
        if (-1 == n2) {
            return null;
        }
        ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n2, 0);
        if (n3 != -1) {
            modelData_get = new ModelData(new ModelData[] { modelData_get, ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n3, 0) }, 2);
        }
        if (null != this.recolorFrom) {
            for (int i = 0; i < this.recolorFrom.length; ++i) {
                ModelData.lm(modelData_get, this.recolorFrom[i], this.recolorTo[i]);
            }
        }
        if (null != this.retextureFrom) {
            for (int j = 0; j < this.retextureFrom.length; ++j) {
                ModelData.jw(modelData_get, this.retextureFrom[j], this.retextureTo[j]);
            }
        }
        return modelData_get;
    }
    
    public static void cw() {
        ItemComposition.ItemDefinition_cached.clear();
        ItemComposition.ItemDefinition_cachedModels.clear();
        ItemComposition.ItemDefinition_cachedSprites.clear();
    }
    
    public String cv(final int n, final String s) {
        return EnumComposition.method1014(this.params, n, s, 1630427981);
    }
    
    public static void ma(final ItemComposition itemComposition, final ItemComposition itemComposition2, final ItemComposition itemComposition3) {
        if (itemComposition == null) {
            itemComposition.getXan2d();
        }
        itemComposition.model = itemComposition2.model * 1;
        itemComposition.zoom2d = 1 * itemComposition2.zoom2d;
        itemComposition.xan2d = itemComposition2.xan2d * 1;
        itemComposition.yan2d = itemComposition2.yan2d * 1;
        itemComposition.zan2d = itemComposition2.zan2d * 1;
        itemComposition.offsetX2d = itemComposition2.offsetX2d * 1;
        itemComposition.offsetY2d = itemComposition2.offsetY2d * 1;
        itemComposition.recolorFrom = itemComposition2.recolorFrom;
        itemComposition.recolorTo = itemComposition2.recolorTo;
        itemComposition.retextureFrom = itemComposition2.retextureFrom;
        itemComposition.retextureTo = itemComposition2.retextureTo;
        itemComposition.isStackable = itemComposition2.isStackable * 1;
        itemComposition.name = itemComposition3.name;
        itemComposition.price = 0;
        itemComposition.isMembersOnly = false;
        itemComposition.isTradable = false;
    }
    
    public final Model getModel(final int n, final int n2) {
        try {
            if (null != this.countobj) {
                if (n2 >= 110693448) {
                    throw new IllegalStateException();
                }
                if (n > 1) {
                    if (n2 >= 110693448) {
                        throw new IllegalStateException();
                    }
                    int n3 = -1;
                    for (int i = 0; i < 10; ++i) {
                        if (n >= this.countco[i] && 0 != this.countco[i]) {
                            if (n2 >= 110693448) {
                                throw new IllegalStateException();
                            }
                            n3 = this.countobj[i];
                        }
                    }
                    if (-1 != n3) {
                        if (n2 >= 110693448) {
                            throw new IllegalStateException();
                        }
                        return HealthBarUpdate.set(n3, (byte)61).getModel(1, -1079389590);
                    }
                }
            }
            final Model model = (Model)ItemComposition.ItemDefinition_cachedModels.wr(-264956633 * this.id);
            if (null != model) {
                if (n2 >= 110693448) {
                    throw new IllegalStateException();
                }
                return model;
            }
            else {
                final ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, 2000117511 * this.model, 0);
                if (null != modelData_get) {
                    Label_0345: {
                        if (this.resizeX * 614283261 == 128) {
                            if (n2 >= 110693448) {
                                throw new IllegalStateException();
                            }
                            if (this.resizeY * 1552043943 == 128) {
                                if (n2 >= 110693448) {
                                    throw new IllegalStateException();
                                }
                                if (128 == this.resizeZ * -302979231) {
                                    break Label_0345;
                                }
                                if (n2 >= 110693448) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        modelData_get.resize(614283261 * this.resizeX, 1552043943 * this.resizeY, -302979231 * this.resizeZ);
                    }
                    if (this.recolorFrom != null) {
                        for (int j = 0; j < this.recolorFrom.length; ++j) {
                            if (n2 >= 110693448) {
                                throw new IllegalStateException();
                            }
                            ModelData.lm(modelData_get, this.recolorFrom[j], this.recolorTo[j]);
                        }
                    }
                    if (null != this.retextureFrom) {
                        if (n2 >= 110693448) {
                            throw new IllegalStateException();
                        }
                        for (int k = 0; k < this.retextureFrom.length; ++k) {
                            if (n2 >= 110693448) {
                                throw new IllegalStateException();
                            }
                            ModelData.jw(modelData_get, this.retextureFrom[k], this.retextureTo[k]);
                        }
                    }
                    final Model dg = modelData_get.dg(64 + 2093614773 * this.field1780, 1794294545 * this.field1781 + 768, -50, -10, -50);
                    dg.isSingleTile = true;
                    ItemComposition.ItemDefinition_cachedModels.put(dg, this.id * -264956633);
                    return dg;
                }
                if (n2 >= 110693448) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.at(" + ')');
        }
    }
    
    boolean hasRecolor(final short n) {
        try {
            boolean b;
            if (null != this.recolorTo) {
                if (n != 467) {
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
            throw HealthBar.get(ex, "hz.ak(" + ')');
        }
    }
    
    public int pt() {
        return this.isStackable * 1552863327;
    }
    
    public int getIntParam(final int n, final int n2, final byte b) {
        try {
            final IterableNodeHashTable params = this.params;
            int integer;
            if (null == params) {
                if (b <= 4) {
                    throw new IllegalStateException();
                }
                integer = n2;
            }
            else {
                final IntegerNode integerNode = (IntegerNode)params.aa(n);
                if (integerNode == null) {
                    if (b <= 4) {
                        throw new IllegalStateException();
                    }
                    integer = n2;
                }
                else {
                    integer = integerNode.integer;
                }
            }
            return integer;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.av(" + ')');
        }
    }
    
    public void ni() {
        this.cv = this.getName();
        ScriptFrame.client.getCallbacks().post((Object)new PostItemComposition((net.runelite.api.ItemComposition)this));
    }
    
    boolean dw() {
        return this.retextureTo != null;
    }
    
    public static void cj() {
        ItemComposition.ItemDefinition_cachedSprites.clear();
    }
    
    public int rn() {
        return this.femaleModel * 1259737505;
    }
    
    boolean cp() {
        return null != this.recolorTo;
    }
    
    public static Model mv(final ItemComposition itemComposition, final int n) {
        if (null != itemComposition.countobj && n > 1) {
            int n2 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n >= itemComposition.countco[i] && 0 != itemComposition.countco[i]) {
                    n2 = itemComposition.countobj[i];
                }
            }
            if (-1 != n2) {
                return HealthBarUpdate.set(n2, (byte)39).getModel(1, -1411663677);
            }
        }
        final Model model = (Model)ItemComposition.ItemDefinition_cachedModels.wr(50403238 * itemComposition.id);
        if (null != model) {
            return model;
        }
        final ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, 1685090810 * itemComposition.model, 0);
        if (null == modelData_get) {
            return null;
        }
        if (itemComposition.resizeX * -2029005799 != 128 || itemComposition.resizeY * 1552043943 != 128 || 128 != itemComposition.resizeZ * -302979231) {
            modelData_get.resize(-1857198423 * itemComposition.resizeX, 1552043943 * itemComposition.resizeY, -302979231 * itemComposition.resizeZ);
        }
        if (itemComposition.recolorFrom != null) {
            for (int j = 0; j < itemComposition.recolorFrom.length; ++j) {
                ModelData.lm(modelData_get, itemComposition.recolorFrom[j], itemComposition.recolorTo[j]);
            }
        }
        if (null != itemComposition.retextureFrom) {
            for (int k = 0; k < itemComposition.retextureFrom.length; ++k) {
                ModelData.jw(modelData_get, itemComposition.retextureFrom[k], itemComposition.retextureTo[k]);
            }
        }
        final Model dg = modelData_get.dg(-1399032346 + 2118723776 * itemComposition.field1780, -802284664 * itemComposition.field1781 + 768, -50, -1828433480, -50);
        dg.isSingleTile = true;
        ItemComposition.ItemDefinition_cachedModels.put(dg, itemComposition.id * -264956633);
        return dg;
    }
    
    boolean hasRetexture(final int n) {
        try {
            boolean b;
            if (this.recolorFrom != null) {
                if (n >= -1820707562) {
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
            throw HealthBar.get(ex, "hz.az(" + ')');
        }
    }
    
    public final boolean method1104(final int n, final int n2) {
        try {
            int n3 = 2144570273 * this.femaleHeadModel2;
            int n4 = this.field1766 * 1570928533;
            if (n == 1) {
                if (n2 >= -343066524) {
                    throw new IllegalStateException();
                }
                n3 = this.field1736 * -560329405;
                n4 = this.field1772 * 1869912693;
            }
            if (n3 != -1) {
                boolean b = true;
                if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n3, 0, (byte)93)) {
                    if (n2 >= -343066524) {
                        throw new IllegalStateException();
                    }
                    b = false;
                }
                if (-1 != n4) {
                    if (n2 >= -343066524) {
                        throw new IllegalStateException();
                    }
                    if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n4, 0, (byte)(-6))) {
                        if (n2 >= -343066524) {
                            throw new IllegalStateException();
                        }
                        b = false;
                    }
                }
                return b;
            }
            if (n2 >= -343066524) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.ag(" + ')');
        }
    }
    
    public final Model bv(final int n) {
        if (null != this.countobj && n > 1) {
            int n2 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n >= this.countco[i] && 0 != this.countco[i]) {
                    n2 = this.countobj[i];
                }
            }
            if (-1 != n2) {
                return HealthBarUpdate.set(n2, (byte)21).getModel(1, -2003339558);
            }
        }
        final Model model = (Model)ItemComposition.ItemDefinition_cachedModels.wr(-264956633 * this.id);
        if (null != model) {
            return model;
        }
        final ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, 2000117511 * this.model, 0);
        if (null == modelData_get) {
            return null;
        }
        if (this.resizeX * 614283261 != 128 || this.resizeY * 1552043943 != 128 || 128 != this.resizeZ * -302979231) {
            modelData_get.resize(614283261 * this.resizeX, 1552043943 * this.resizeY, -302979231 * this.resizeZ);
        }
        if (this.recolorFrom != null) {
            for (int j = 0; j < this.recolorFrom.length; ++j) {
                ModelData.lm(modelData_get, this.recolorFrom[j], this.recolorTo[j]);
            }
        }
        if (null != this.retextureFrom) {
            for (int k = 0; k < this.retextureFrom.length; ++k) {
                ModelData.jw(modelData_get, this.retextureFrom[k], this.retextureTo[k]);
            }
        }
        final Model dg = modelData_get.dg(64 + 2093614773 * this.field1780, 1794294545 * this.field1781 + 768, -50, -10, -50);
        dg.isSingleTile = true;
        ItemComposition.ItemDefinition_cachedModels.put(dg, this.id * -264956633);
        return dg;
    }
    
    void bo(final ItemComposition itemComposition, final ItemComposition itemComposition2) {
        this.model = itemComposition.model * 1;
        this.zoom2d = itemComposition.zoom2d * 1;
        this.xan2d = 1 * itemComposition.xan2d;
        this.yan2d = 1 * itemComposition.yan2d;
        this.zan2d = 1 * itemComposition.zan2d;
        this.offsetX2d = 1 * itemComposition.offsetX2d;
        this.offsetY2d = itemComposition.offsetY2d * 1;
        this.recolorFrom = itemComposition.recolorFrom;
        this.recolorTo = itemComposition.recolorTo;
        this.retextureFrom = itemComposition.retextureFrom;
        this.retextureTo = itemComposition.retextureTo;
        this.name = itemComposition2.name;
        this.isMembersOnly = itemComposition2.isMembersOnly;
        this.price = itemComposition2.price * 1;
        this.isStackable = 1685556127;
    }
    
    public static ModelData ru(final ItemComposition itemComposition, final int n) {
        int n2 = itemComposition.femaleModel * -123353728;
        int n3 = -1975240801 * itemComposition.femaleModel1;
        int n4 = itemComposition.femaleModel2 * -1702262000;
        if (1 == n) {
            n2 = itemComposition.maleHeadModel * 88579015;
            n3 = itemComposition.maleHeadModel2 * 2028242426;
            n4 = itemComposition.femaleHeadModel * 1442120490;
        }
        if (n2 == -1) {
            return null;
        }
        ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n2, 0);
        if (-1 != n3) {
            final ModelData modelData_get2 = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n3, 0);
            if (-1 != n4) {
                modelData_get = new ModelData(new ModelData[] { modelData_get, modelData_get2, ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n4, 0) }, 3);
            }
            else {
                modelData_get = new ModelData(new ModelData[] { modelData_get, modelData_get2 }, 2);
            }
        }
        if (0 == n && 0 != itemComposition.femaleOffset * 273664327) {
            modelData_get.changeOffset(0, itemComposition.femaleOffset * -1381380683, 0);
        }
        if (1 == n && -846717499 * itemComposition.field1767 != 0) {
            modelData_get.changeOffset(0, -846717499 * itemComposition.field1767, 0);
        }
        if (itemComposition.recolorFrom != null) {
            for (int i = 0; i < itemComposition.recolorFrom.length; ++i) {
                ModelData.lm(modelData_get, itemComposition.recolorFrom[i], itemComposition.recolorTo[i]);
            }
        }
        if (itemComposition.retextureFrom != null) {
            for (int j = 0; j < itemComposition.retextureFrom.length; ++j) {
                ModelData.jw(modelData_get, itemComposition.retextureFrom[j], itemComposition.retextureTo[j]);
            }
        }
        return modelData_get;
    }
    
    public ItemComposition bp(final int n) {
        if (this.countobj != null && n > 1) {
            int n2 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n >= this.countco[i] && 0 != this.countco[i]) {
                    n2 = this.countobj[i];
                }
            }
            if (-1 != n2) {
                return HealthBarUpdate.set(n2, (byte)113);
            }
        }
        return this;
    }
    
    public static void ct(final ItemComposition itemComposition, final int n) {
        if (itemComposition == null) {
            itemComposition.post(n);
        }
        try {
            if (itemComposition.isStackable * 1552863327 == 1) {
                if (n >= -2003691595) {
                    throw new IllegalStateException();
                }
                itemComposition.field1774 = 0;
            }
            itemComposition.ni();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.an(" + ')');
        }
    }
    
    public static void ct() {
        ItemComposition.ItemDefinition_cachedSprites.clear();
    }
    
    void bt(final ItemComposition itemComposition, final ItemComposition itemComposition2) {
        this.model = 1 * itemComposition.model;
        this.zoom2d = 1 * itemComposition.zoom2d;
        this.xan2d = 1 * itemComposition.xan2d;
        this.yan2d = 1 * itemComposition.yan2d;
        this.zan2d = 1 * itemComposition.zan2d;
        this.offsetX2d = 1 * itemComposition.offsetX2d;
        this.offsetY2d = 1 * itemComposition.offsetY2d;
        this.recolorFrom = itemComposition2.recolorFrom;
        this.recolorTo = itemComposition2.recolorTo;
        this.retextureFrom = itemComposition2.retextureFrom;
        this.retextureTo = itemComposition2.retextureTo;
        this.name = itemComposition2.name;
        this.isMembersOnly = itemComposition2.isMembersOnly;
        this.isStackable = itemComposition2.isStackable * 1;
        this.maleModel = 1 * itemComposition2.maleModel;
        this.maleModel1 = 1 * itemComposition2.maleModel1;
        this.maleModel2 = itemComposition2.maleModel2 * 1;
        this.femaleModel = itemComposition2.femaleModel * 1;
        this.femaleModel1 = itemComposition2.femaleModel1 * 1;
        this.femaleModel2 = itemComposition2.femaleModel2 * 1;
        this.maleHeadModel = 1 * itemComposition2.maleHeadModel;
        this.maleHeadModel2 = itemComposition2.maleHeadModel2 * 1;
        this.femaleHeadModel = itemComposition2.femaleHeadModel * 1;
        this.femaleHeadModel2 = 1 * itemComposition2.femaleHeadModel2;
        this.field1766 = 1 * itemComposition2.field1766;
        this.field1736 = itemComposition2.field1736 * 1;
        this.field1772 = 1 * itemComposition2.field1772;
        this.team = itemComposition2.team * 1;
        this.groundActions = itemComposition2.groundActions;
        this.field1774 = itemComposition2.field1774 * 1;
        this.inventoryActions = new String[5];
        if (null != itemComposition2.inventoryActions) {
            for (int i = 0; i < 4; ++i) {
                this.inventoryActions[i] = itemComposition2.inventoryActions[i];
            }
        }
        this.inventoryActions[4] = Strings.al;
        this.price = 0;
    }
    
    public ItemComposition bc(final int n) {
        if (this.countobj != null && n > 1) {
            int n2 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n >= this.countco[i] && 0 != this.countco[i]) {
                    n2 = this.countobj[i];
                }
            }
            if (-1 != n2) {
                return HealthBarUpdate.set(n2, (byte)16);
            }
        }
        return this;
    }
    
    void br(final ItemComposition itemComposition, final ItemComposition itemComposition2) {
        this.model = itemComposition.model * 1;
        this.zoom2d = 1 * itemComposition.zoom2d;
        this.xan2d = itemComposition.xan2d * 1;
        this.yan2d = itemComposition.yan2d * 1;
        this.zan2d = itemComposition.zan2d * 1;
        this.offsetX2d = itemComposition.offsetX2d * 1;
        this.offsetY2d = itemComposition.offsetY2d * 1;
        this.recolorFrom = itemComposition.recolorFrom;
        this.recolorTo = itemComposition.recolorTo;
        this.retextureFrom = itemComposition.retextureFrom;
        this.retextureTo = itemComposition.retextureTo;
        this.isStackable = itemComposition.isStackable * 1;
        this.name = itemComposition2.name;
        this.price = 0;
        this.isMembersOnly = false;
        this.isTradable = false;
    }
    
    public static void tz(final ItemComposition itemComposition, final ItemComposition itemComposition2, final ItemComposition itemComposition3) {
        if (itemComposition == null) {
            itemComposition.getName();
        }
        itemComposition.model = itemComposition2.model * 1;
        itemComposition.zoom2d = 1 * itemComposition2.zoom2d;
        itemComposition.xan2d = itemComposition2.xan2d * 1;
        itemComposition.yan2d = itemComposition2.yan2d * 1;
        itemComposition.zan2d = itemComposition2.zan2d * 1;
        itemComposition.offsetX2d = itemComposition2.offsetX2d * 1;
        itemComposition.offsetY2d = itemComposition2.offsetY2d * 1;
        itemComposition.recolorFrom = itemComposition2.recolorFrom;
        itemComposition.recolorTo = itemComposition2.recolorTo;
        itemComposition.retextureFrom = itemComposition2.retextureFrom;
        itemComposition.retextureTo = itemComposition2.retextureTo;
        itemComposition.isStackable = itemComposition2.isStackable * 1;
        itemComposition.name = itemComposition3.name;
        itemComposition.price = 0;
        itemComposition.isMembersOnly = false;
        itemComposition.isTradable = false;
    }
    
    static final String ci(final int i) {
        if (i < -1869109472) {
            return "<col=ffff00>" + i + "</col>";
        }
        if (i < 2087643601) {
            return "<col=ffffff>" + i / 1000 + Strings.gv + "</col>";
        }
        return "<col=00ff80>" + i / 1000000 + Strings.gp + "</col>";
    }
    
    void decode(final Buffer buffer, final byte b) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                qh(this, buffer, ra, (byte)(-19));
            }
            if (b == 2) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.aw(" + ')');
        }
    }
    
    public int getShiftClickIndex(final byte b) {
        int yf;
        if (this.yf == -2) {
            final int n = 42;
            try {
                if (this.shiftClickIndex * -377028789 != -1) {
                    if (n == 15) {
                        throw new IllegalStateException();
                    }
                    if (this.inventoryActions == null) {
                        if (n == 15) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        if (this.shiftClickIndex * -377028789 < 0) {
                            int n2;
                            if (Strings.aw.equalsIgnoreCase(this.inventoryActions[4])) {
                                if (n == 15) {
                                    throw new IllegalStateException();
                                }
                                n2 = 4;
                            }
                            else {
                                n2 = -1;
                            }
                            yf = n2;
                            return yf;
                        }
                        if (n == 15) {
                            throw new IllegalStateException();
                        }
                        int n3;
                        if (this.inventoryActions[-377028789 * this.shiftClickIndex] != null) {
                            if (n == 15) {
                                throw new IllegalStateException();
                            }
                            n3 = -377028789 * this.shiftClickIndex;
                        }
                        else {
                            n3 = -1;
                        }
                        yf = n3;
                        return yf;
                    }
                }
                yf = -1;
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "hz.am(" + ')');
            }
        }
        else {
            yf = this.yf;
        }
        return yf;
    }
    
    public final ModelData getModelData(final int n, final int n2) {
        try {
            if (null != this.countobj) {
                if (n2 != -305031719) {
                    throw new IllegalStateException();
                }
                if (n > 1) {
                    if (n2 != -305031719) {
                        throw new IllegalStateException();
                    }
                    int n3 = -1;
                    for (int i = 0; i < 10; ++i) {
                        if (n2 != -305031719) {
                            throw new IllegalStateException();
                        }
                        if (n >= this.countco[i]) {
                            if (n2 != -305031719) {
                                throw new IllegalStateException();
                            }
                            if (this.countco[i] != 0) {
                                if (n2 != -305031719) {
                                    throw new IllegalStateException();
                                }
                                n3 = this.countobj[i];
                            }
                        }
                    }
                    if (n3 != -1) {
                        if (n2 != -305031719) {
                            throw new IllegalStateException();
                        }
                        return HealthBarUpdate.set(n3, (byte)88).getModelData(1, -305031719);
                    }
                }
            }
            final ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, 2000117511 * this.model, 0);
            if (modelData_get != null) {
                while (true) {
                    Label_0249: {
                        if (this.resizeX * 614283261 != 128) {
                            break Label_0249;
                        }
                        if (n2 != -305031719) {
                            throw new IllegalStateException();
                        }
                        if (this.resizeY * 1552043943 != 128) {
                            break Label_0249;
                        }
                        if (-302979231 * this.resizeZ != 128) {
                            if (n2 != -305031719) {
                                throw new IllegalStateException();
                            }
                            break Label_0249;
                        }
                        if (this.recolorFrom != null) {
                            if (n2 != -305031719) {
                                throw new IllegalStateException();
                            }
                            for (int j = 0; j < this.recolorFrom.length; ++j) {
                                if (n2 != -305031719) {
                                    throw new IllegalStateException();
                                }
                                ModelData.lm(modelData_get, this.recolorFrom[j], this.recolorTo[j]);
                            }
                        }
                        if (null != this.retextureFrom) {
                            if (n2 != -305031719) {
                                throw new IllegalStateException();
                            }
                            for (int k = 0; k < this.retextureFrom.length; ++k) {
                                if (n2 != -305031719) {
                                    throw new IllegalStateException();
                                }
                                ModelData.jw(modelData_get, this.retextureFrom[k], this.retextureTo[k]);
                            }
                        }
                        return modelData_get;
                    }
                    modelData_get.resize(this.resizeX * 614283261, this.resizeY * 1552043943, -302979231 * this.resizeZ);
                    continue;
                }
            }
            if (n2 != -305031719) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.al(" + ')');
        }
    }
    
    boolean dm() {
        return this.retextureTo != null;
    }
    
    void post(final int n) {
        this.field1774 = n * -1698175273;
    }
    
    void decodeNext(final Buffer buffer, final int n, final byte b) {
        try {
            if (n == 1) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.field1766 = buffer.readMedium(-1754228801) * 19259063;
            }
            else if (2 == n) {
                if (b >= 2) {
                    return;
                }
                this.name = buffer.readStringCp1252NullTerminatedOrNull((byte)0);
                this.setXan2d(-1);
            }
            else if (4 == n) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.maleModel = buffer.method2498(-1685829981) * 354264929;
            }
            else if (5 == n) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.note = buffer.readVarInt(344270307) * -111167811;
            }
            else if (n == 6) {
                if (b >= 2) {
                    return;
                }
                this.offsetY2d = buffer.method2541(149770420) * -1698175273;
            }
            else if (n == 7) {
                if (b >= 2) {
                    return;
                }
                this.note = buffer.readInt(340084669) * 233220529;
                if (this.yan2d * 151912273 > 32767) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    this.yf = this.placeholderTemplate + 1448017920;
                }
            }
            else if (8 == n) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.note = buffer._readUnsignedByteSub(-1080726659) * -780188501;
                if (-271411709 * this.zan2d > 32767) {
                    if (b >= 2) {
                        return;
                    }
                    this.maleModel1 = this.note - 1152057344;
                }
            }
            else if (9 == n) {
                buffer.readStringCp1252NullTerminatedOrNull((byte)0);
            }
            else if (n == 11) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.noteTemplate = 1685556127;
            }
            else if (n == 12) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.placeholder = buffer.readUnsignedShort(-1224672117) * -1041171269;
            }
            else if (n == 13) {
                this.maleModel = Buffer.ra(buffer, (byte)7) * -1072009039;
            }
            else if (n == 14) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.team = Buffer.ra(buffer, (byte)7) * 1699982907;
            }
            else if (16 == n) {
                this.isMembersOnly = true;
            }
            else if (23 == n) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.field1772 = buffer.method2498(843033967) * -240774559;
                this.field1772 = Buffer.ra(buffer, (byte)7) * -1007890181;
            }
            else if (n == 24) {
                this.femaleHeadModel2 = buffer.readMedium(-1373739066) * 1308828767;
            }
            else if (n == 25) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.femaleModel = buffer.readMedium(-1122867664) * -459970545;
                this.femaleHeadModel = Buffer.ra(buffer, (byte)7) * -677816051;
            }
            else if (n == 26) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.femaleHeadModel = buffer.method2513(-99776406) * 624858415;
            }
            else if (n == 27) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                this.maleModel2 = Buffer.ra(buffer, (byte)7) * 1627653365;
            }
            else {
                if (n >= 30) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    if (n < 35) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.inventoryActions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
                        if (!this.groundActions[n - 30].equalsIgnoreCase(Strings.hy)) {
                            return;
                        }
                        if (b >= 2) {
                            return;
                        }
                        this.inventoryActions[n - 30] = null;
                        return;
                    }
                }
                if (n >= 35 && n < 40) {
                    if (b >= 2) {
                        return;
                    }
                    this.inventoryActions[n - 35] = buffer.readStringCp1252NullTerminated((byte)0);
                }
                else if (n == 40) {
                    if (b >= 2) {
                        return;
                    }
                    final int ra = Buffer.ra(buffer, (byte)7);
                    this.recolorFrom = new short[ra];
                    this.recolorTo = new short[ra];
                    for (int i = 0; i < ra; ++i) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.retextureFrom[i] = (short)buffer.method2513(-1144883826);
                        this.retextureFrom[i] = (short)buffer.jn(-386305756);
                    }
                }
                else if (41 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    this.recolorFrom = new short[ra2];
                    this.recolorFrom = new short[ra2];
                    for (int j = 0; j < ra2; ++j) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.recolorFrom[j] = (short)buffer.method2513(-1545105214);
                        this.retextureTo[j] = (short)buffer.method2541(-286115407);
                    }
                }
                else if (42 == n) {
                    if (b >= 2) {
                        return;
                    }
                    this.field1766 = Buffer.wu(buffer, 435772489) * -645393821;
                }
                else if (n == 65) {
                    this.isMembersOnly = true;
                }
                else if (75 == n) {
                    this.field1780 = buffer.readUnsignedByteNeg((byte)(-109)) * 1825858873;
                }
                else if (78 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    this.field1772 = buffer.readShortSmart(-1918603739) * 1230864509;
                }
                else if (n == 79) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    this.femaleOffset = buffer.readInt(-667601927) * 787170795;
                }
                else if (90 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    this.resizeZ = buffer.readUnsignedByteAdd(-960295987) * 1008801889;
                }
                else if (n == 91) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    this.resizeX = buffer.readInt(-1234773889) * -1191712917;
                }
                else if (n == 92) {
                    this.resizeX = buffer.method2498(-494237193) * 174922685;
                }
                else if (93 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    this.field1767 = buffer.method2516(589852488) * -738400803;
                }
                else if (94 == n) {
                    buffer.readSignedShortAddLE(-1939700741);
                }
                else if (95 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    this.offsetX2d = buffer.method2498(-969293820) * 1724640311;
                }
                else if (97 == n) {
                    if (b >= 2) {
                        return;
                    }
                    this.placeholderTemplate = buffer.readUnsignedByteAdd(-50436323) * 58690731;
                }
                else if (n == 98) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    this.xan2d = buffer.readUnsignedShortAddLE(64064630) * 468518381;
                }
                else {
                    if (n >= 100) {
                        if (b >= 2) {
                            return;
                        }
                        if (n < 110) {
                            if (b >= 2) {
                                return;
                            }
                            if (this.countco == null) {
                                if (b >= 2) {
                                    throw new IllegalStateException();
                                }
                                this.countco = new int[10];
                                this.countco = new int[10];
                            }
                            this.countobj[n - 100] = buffer.readSignedShortAddLE(-504474416);
                            this.countobj[n - 100] = buffer._readUnsignedByteSub(506287311);
                            return;
                        }
                    }
                    if (110 == n) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.femaleModel1 = buffer.method2541(-369255067) * -662446763;
                    }
                    else if (n == 111) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.resizeX = buffer._readUnsignedByteSub(-284657307) * 1450797079;
                    }
                    else if (112 == n) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.femaleModel1 = buffer.method2541(-158314987) * 547093665;
                    }
                    else if (n == 113) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.field1781 = Buffer.wu(buffer, 435772489) * -2035992675;
                    }
                    else if (n == 114) {
                        if (b >= 2) {
                            return;
                        }
                        this.maleModel2 = Buffer.wu(buffer, 435772489) * -297744971;
                    }
                    else if (n == 115) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.isStackable = Buffer.ra(buffer, (byte)7) * 1067505549;
                    }
                    else if (139 == n) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.femaleHeadModel2 = buffer.readUnsignedShortAddLE(-1297890761) * 1905271763;
                    }
                    else if (n == 140) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.notedId = buffer.readUnsignedShortAddLE(-455123583) * 1073961371;
                    }
                    else if (n == 148) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.zoom2d = buffer._readUnsignedByteSub(52807640) * -1652212107;
                    }
                    else if (149 == n) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        this.xan2d = buffer.method2516(454694063) * -115270063;
                    }
                    else if (n == 249) {
                        this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-78));
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.ac(" + ')');
        }
    }
    
    public String cx(final int n, final String s) {
        return EnumComposition.method1014(this.params, n, s, 1668505251);
    }
    
    public static void if(final ItemComposition itemComposition, final Buffer buffer, final int n) {
        if (itemComposition == null) {
            itemComposition.bv(n);
        }
        if (n == 1) {
            itemComposition.model = buffer.readUnsignedShort(-1151195311) * 1661344246;
        }
        else if (2 == n) {
            itemComposition.name = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (4 == n) {
            itemComposition.zoom2d = buffer.readUnsignedShort(119536470) * 354264929;
        }
        else if (5 == n) {
            itemComposition.xan2d = buffer.readUnsignedShort(135727836) * -111167811;
        }
        else if (n == 6) {
            itemComposition.yan2d = buffer.readUnsignedShort(665341131) * -1061110720;
        }
        else if (n == 7) {
            itemComposition.offsetX2d = buffer.readUnsignedShort(204882643) * -284871015;
            if (itemComposition.offsetX2d * 1080372948 > 645221591) {
                itemComposition.offsetX2d += 1448017920;
            }
        }
        else if (8 == n) {
            itemComposition.offsetY2d = buffer.readUnsignedShort(-1375276093) * -1943392433;
            if (1285802536 * itemComposition.offsetY2d > 32767) {
                itemComposition.offsetY2d -= 1152057344;
            }
        }
        else if (9 == n) {
            buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 11) {
            itemComposition.isStackable = 1033195166;
        }
        else if (n == 12) {
            itemComposition.price = buffer.readInt(-1192717879) * 1808338691;
        }
        else if (n == 13) {
            itemComposition.maleModel = Buffer.ra(buffer, (byte)7) * -6024810;
        }
        else if (n == 14) {
            itemComposition.maleModel1 = Buffer.ra(buffer, (byte)7) * -2099563701;
        }
        else if (16 == n) {
            itemComposition.isMembersOnly = true;
        }
        else if (23 == n) {
            itemComposition.femaleModel = buffer.readUnsignedShort(-1067632243) * 581262242;
            itemComposition.femaleOffset = Buffer.ra(buffer, (byte)7) * -1804053649;
        }
        else if (n == 24) {
            itemComposition.femaleModel1 = buffer.readUnsignedShort(50257374) * 1308828767;
        }
        else if (n == 25) {
            itemComposition.maleHeadModel = buffer.readUnsignedShort(380330129) * -459970545;
            itemComposition.field1767 = Buffer.ra(buffer, (byte)7) * -677816051;
        }
        else if (n == 26) {
            itemComposition.maleHeadModel2 = buffer.readUnsignedShort(-2124589552) * -498468585;
        }
        else if (n == 27) {
            itemComposition.maleModel2 = Buffer.ra(buffer, (byte)7) * 1435843574;
        }
        else if (n >= 30 && n < 35) {
            itemComposition.groundActions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
            if (itemComposition.groundActions[n - 30].equalsIgnoreCase(Strings.ac)) {
                itemComposition.groundActions[n - 30] = null;
            }
        }
        else if (n >= 142174624 && n < 2049844401) {
            itemComposition.inventoryActions[n - 1248534726] = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == -1068346295) {
            final int ra = Buffer.ra(buffer, (byte)7);
            itemComposition.recolorFrom = new short[ra];
            itemComposition.recolorTo = new short[ra];
            for (int i = 0; i < ra; ++i) {
                itemComposition.recolorFrom[i] = (short)buffer.readUnsignedShort(66757040);
                itemComposition.recolorTo[i] = (short)buffer.readUnsignedShort(-275925670);
            }
        }
        else if (41 == n) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            itemComposition.retextureFrom = new short[ra2];
            itemComposition.retextureTo = new short[ra2];
            for (int j = 0; j < ra2; ++j) {
                itemComposition.retextureFrom[j] = (short)buffer.readUnsignedShort(162671449);
                itemComposition.retextureTo[j] = (short)buffer.readUnsignedShort(-132626599);
            }
        }
        else if (42 == n) {
            itemComposition.shiftClickIndex = Buffer.wu(buffer, 435772489) * 1095755693;
        }
        else if (n == 1184338843) {
            itemComposition.isTradable = true;
        }
        else if (75 == n) {
            itemComposition.field1774 = buffer.readUnsignedByte((byte)(-92)) * 1825858873;
        }
        else if (-1112701739 == n) {
            itemComposition.femaleModel2 = buffer.readUnsignedShort(647928414) * 1230864509;
        }
        else if (n == 79) {
            itemComposition.femaleHeadModel = buffer.readUnsignedShort(-947549730) * 787170795;
        }
        else if (90 == n) {
            itemComposition.femaleHeadModel2 = buffer.readUnsignedShort(-132857488) * 1008801889;
        }
        else if (n == 91) {
            itemComposition.field1736 = buffer.readUnsignedShort(-1059792132) * -1705234057;
        }
        else if (n == 1346115703) {
            itemComposition.field1766 = buffer.readUnsignedShort(-1362314634) * 1242496441;
        }
        else if (-1128485792 == n) {
            itemComposition.field1772 = buffer.readUnsignedShort(-1216645574) * 967086693;
        }
        else if (-542751387 == n) {
            buffer.readUnsignedShort(-1989778495);
        }
        else if (2044498222 == n) {
            itemComposition.zan2d = buffer.readUnsignedShort(-1730238817) * 1022125416;
        }
        else if (1072763631 == n) {
            itemComposition.note = buffer.readUnsignedShort(396451907) * 58690731;
        }
        else if (n == 98) {
            itemComposition.noteTemplate = buffer.readUnsignedShort(-1727166500) * 804437629;
        }
        else if (n >= 100 && n < -1549431638) {
            if (itemComposition.countobj == null) {
                itemComposition.countobj = new int[10];
                itemComposition.countco = new int[10];
            }
            itemComposition.countobj[n - 1826140607] = buffer.readUnsignedShort(-9520557);
            itemComposition.countco[n + 1192042586] = buffer.readUnsignedShort(-1196108817);
        }
        else if (110 == n) {
            itemComposition.resizeX = buffer.readUnsignedShort(-973652950) * -1678789156;
        }
        else if (n == 111) {
            itemComposition.resizeY = buffer.readUnsignedShort(-1128704299) * 1450797079;
        }
        else if (-2061207289 == n) {
            itemComposition.resizeZ = buffer.readUnsignedShort(-746634931) * 547093665;
        }
        else if (n == 113) {
            itemComposition.field1780 = Buffer.wu(buffer, 435772489) * -1741739584;
        }
        else if (n == 114) {
            itemComposition.field1781 = Buffer.wu(buffer, 435772489) * -297744971;
        }
        else if (n == 115) {
            itemComposition.team = Buffer.ra(buffer, (byte)7) * 1067505549;
        }
        else if (139 == n) {
            itemComposition.unnotedId = buffer.readUnsignedShort(497676919) * 1905271763;
        }
        else if (n == 140) {
            itemComposition.notedId = buffer.readUnsignedShort(-2112725567) * 2116358669;
        }
        else if (n == 148) {
            itemComposition.placeholder = buffer.readUnsignedShort(-1202135984) * -1652212107;
        }
        else if (149 == n) {
            itemComposition.placeholderTemplate = buffer.readUnsignedShort(-2093681006) * -115270063;
        }
        else if (n == 249) {
            itemComposition.params = ChatChannel.addMessage(buffer, itemComposition.params, (byte)(-55));
        }
    }
    
    public static boolean tf(final ItemComposition itemComposition, final int n) {
        int n2 = itemComposition.femaleModel * 1259737505;
        int n3 = itemComposition.femaleModel1 * -1975240801;
        int n4 = itemComposition.femaleModel2 * -1550321451;
        if (1 == n) {
            n2 = -1355512081 * itemComposition.maleHeadModel;
            n3 = -1937321521 * itemComposition.maleHeadModel2;
            n4 = itemComposition.femaleHeadModel * 1169668803;
        }
        if (-1 == n2) {
            return true;
        }
        boolean b = true;
        if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n2, 0, (byte)(-86))) {
            b = false;
        }
        if (n3 != -1 && !ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n3, 0, (byte)22)) {
            b = false;
        }
        if (-1 != n4 && !ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n4, 0, (byte)4)) {
            b = false;
        }
        return b;
    }
    
    void genCert(final ItemComposition itemComposition, final ItemComposition itemComposition2, final int n) {
        try {
            this.model = itemComposition.model * 1;
            this.zoom2d = itemComposition.zoom2d * 1;
            this.xan2d = 1 * itemComposition.xan2d;
            this.yan2d = 1 * itemComposition.yan2d;
            this.zan2d = 1 * itemComposition.zan2d;
            this.offsetX2d = 1 * itemComposition.offsetX2d;
            this.offsetY2d = itemComposition.offsetY2d * 1;
            this.recolorFrom = itemComposition.recolorFrom;
            this.recolorTo = itemComposition.recolorTo;
            this.retextureFrom = itemComposition.retextureFrom;
            this.retextureTo = itemComposition.retextureTo;
            this.name = itemComposition2.name;
            this.vx(-1);
            this.isMembersOnly = itemComposition2.isMembersOnly;
            this.price = itemComposition2.price * 1;
            this.isStackable = 1685556127;
            this.zv(itemComposition, itemComposition2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.au(" + ')');
        }
    }
    
    public ItemComposition getCountObj(final int n, final int n2) {
        try {
            if (this.countobj != null) {
                if (n2 == 1004478988) {
                    throw new IllegalStateException();
                }
                if (n > 1) {
                    if (n2 == 1004478988) {
                        throw new IllegalStateException();
                    }
                    int n3 = -1;
                    for (int i = 0; i < 10; ++i) {
                        if (n >= this.countco[i]) {
                            if (n2 == 1004478988) {
                                throw new IllegalStateException();
                            }
                            if (0 != this.countco[i]) {
                                if (n2 == 1004478988) {
                                    throw new IllegalStateException();
                                }
                                n3 = this.countobj[i];
                            }
                        }
                    }
                    if (-1 != n3) {
                        if (n2 == 1004478988) {
                            throw new IllegalStateException();
                        }
                        return HealthBarUpdate.set(n3, (byte)81);
                    }
                }
            }
            return this;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.aa(" + ')');
        }
    }
    
    public IterableHashTable getParams() {
        return (IterableHashTable)this.params;
    }
    
    public final ModelData method1111(final int n, final int n2) {
        try {
            int n3 = this.femaleModel * 1259737505;
            int n4 = -1975240801 * this.femaleModel1;
            int n5 = this.femaleModel2 * -1550321451;
            if (1 == n) {
                n3 = this.maleHeadModel * -1355512081;
                n4 = this.maleHeadModel2 * -1937321521;
                n5 = this.femaleHeadModel * 1169668803;
            }
            if (n3 != -1) {
                ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n3, 0);
                if (-1 != n4) {
                    final ModelData modelData_get2 = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n4, 0);
                    if (-1 != n5) {
                        if (n2 <= 1270525717) {
                            throw new IllegalStateException();
                        }
                        modelData_get = new ModelData(new ModelData[] { modelData_get, modelData_get2, ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n5, 0) }, 3);
                    }
                    else {
                        modelData_get = new ModelData(new ModelData[] { modelData_get, modelData_get2 }, 2);
                    }
                }
                if (0 == n) {
                    if (n2 <= 1270525717) {
                        throw new IllegalStateException();
                    }
                    if (0 != this.femaleOffset * 1328855603) {
                        if (n2 <= 1270525717) {
                            throw new IllegalStateException();
                        }
                        modelData_get.changeOffset(0, this.femaleOffset * 1328855603, 0);
                    }
                }
                if (1 == n) {
                    if (n2 <= 1270525717) {
                        throw new IllegalStateException();
                    }
                    if (-846717499 * this.field1767 != 0) {
                        if (n2 <= 1270525717) {
                            throw new IllegalStateException();
                        }
                        modelData_get.changeOffset(0, -846717499 * this.field1767, 0);
                    }
                }
                if (this.recolorFrom != null) {
                    if (n2 <= 1270525717) {
                        throw new IllegalStateException();
                    }
                    for (int i = 0; i < this.recolorFrom.length; ++i) {
                        if (n2 <= 1270525717) {
                            throw new IllegalStateException();
                        }
                        ModelData.lm(modelData_get, this.recolorFrom[i], this.recolorTo[i]);
                    }
                }
                if (this.retextureFrom != null) {
                    if (n2 <= 1270525717) {
                        throw new IllegalStateException();
                    }
                    for (int j = 0; j < this.retextureFrom.length; ++j) {
                        if (n2 <= 1270525717) {
                            throw new IllegalStateException();
                        }
                        ModelData.jw(modelData_get, this.retextureFrom[j], this.retextureTo[j]);
                    }
                }
                return modelData_get;
            }
            if (n2 <= 1270525717) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.ai(" + ')');
        }
    }
    
    public static final SpritePixels bh(final int n, final int n2, final int n3, final int n4, int n5, final boolean b) {
        if (n2 == -1) {
            n5 = 0;
        }
        else if (2 == n5 && n2 != 1) {
            n5 = 1;
        }
        final long n6 = ((long)n3 << 38) + (n + ((long)n2 << 16)) + ((long)n5 << -203257833) + ((long)n4 << 42);
        if (!b) {
            final SpritePixels spritePixels = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.wr(n6);
            if (spritePixels != null) {
                return spritePixels;
            }
        }
        ItemComposition itemComposition = HealthBarUpdate.set(n, (byte)45);
        if (n2 > 1 && null != itemComposition.countobj) {
            int n7 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n2 >= itemComposition.countco[i] && 0 != itemComposition.countco[i]) {
                    n7 = itemComposition.countobj[i];
                }
            }
            if (n7 != -1) {
                itemComposition = HealthBarUpdate.set(n7, (byte)31);
            }
        }
        final Model model = itemComposition.getModel(1, -79009458);
        if (model == null) {
            return null;
        }
        SpritePixels spritePixels2 = null;
        if (-1 != itemComposition.noteTemplate * -1375068187) {
            spritePixels2 = class252.getItemSprite(itemComposition.note * -2096481335, 10, 1, 0, 0, true, 1436001650);
            if (null == spritePixels2) {
                return null;
            }
        }
        else if (-1276549997 * itemComposition.notedId != -1) {
            spritePixels2 = class252.getItemSprite(itemComposition.unnotedId * -1273418661, n2, n3, n4, 0, false, 950265296);
            if (null == spritePixels2) {
                return null;
            }
        }
        else if (itemComposition.placeholderTemplate * -494553438 != -1) {
            spritePixels2 = class252.getItemSprite(-172219939 * itemComposition.placeholder, n2, 0, 0, 0, false, 427103552);
            if (null == spritePixels2) {
                return null;
            }
        }
        final int[] rasterizer2D_pixels = Rasterizer2D.Rasterizer2D_pixels;
        final int rasterizer2D_width = Rasterizer2D.Rasterizer2D_width;
        final int rasterizer2D_height = Rasterizer2D.Rasterizer2D_height;
        final float[] field4108 = Rasterizer2D.field4108;
        final int[] array = new int[4];
        Rasterizer2D.Rasterizer2D_getClipArray(array);
        final SpritePixels spritePixels3 = new SpritePixels(420750449, -1750733186);
        class1.method2(spritePixels3.pixels, 1892977371, 32, null, 580310026);
        Rasterizer2D.Rasterizer2D_clear();
        class18.method68(-348486021);
        WorldMapArea.getRegionLowX(16, 16, (byte)32);
        Rasterizer3D.clips.field2226 = false;
        if (-1 != itemComposition.placeholderTemplate * 119859889) {
            spritePixels2.drawAt(0, 0);
        }
        int n8 = itemComposition.zoom2d * 1014971553;
        if (b) {
            n8 *= (int)1.5;
        }
        else if (2 == n3) {
            n8 *= (int)1.04;
        }
        final int n9 = n8 * Rasterizer3D.Rasterizer3D_sine[-581171982 * itemComposition.xan2d] >> 16;
        final int n10 = n8 * Rasterizer3D.Rasterizer3D_cosine[415331477 * itemComposition.xan2d] >> 16;
        model.calculateBoundsCylinder();
        model.method1343(0, -550567056 * itemComposition.yan2d, itemComposition.zan2d * 469460638, itemComposition.xan2d * 415331477, itemComposition.offsetX2d * 151912273, 496086964 * model.et / 2 + n9 + -271411709 * itemComposition.offsetY2d, n10 + itemComposition.offsetY2d * -657111612);
        if (-1282505287 * itemComposition.notedId != -1) {
            spritePixels2.drawAt(0, 0);
        }
        if (n3 >= 1) {
            spritePixels3.outline(1);
        }
        if (n3 >= 2) {
            spritePixels3.outline(16777215);
        }
        if (0 != n4) {
            spritePixels3.shadow(n4);
        }
        class1.method2(spritePixels3.pixels, -944855314, 1169883024, null, 580310026);
        if (itemComposition.noteTemplate * -1375068187 != -1) {
            spritePixels2.drawAt(0, 0);
        }
        if (n5 == 1 || (n5 == 2 && 1 == itemComposition.isStackable * -202335171)) {
            class492.xb(class124.ItemDefinition_fontPlain11, class101.method633(n2, 1180051462), 0, 9, 130671709, 1);
        }
        if (!b) {
            ItemComposition.ItemDefinition_cachedSprites.put(spritePixels3, n6);
        }
        class1.method2(rasterizer2D_pixels, rasterizer2D_width, rasterizer2D_height, field4108, 580310026);
        Rasterizer2D.Rasterizer2D_setClipArray(array);
        class18.method68(1155825053);
        Rasterizer3D.clips.field2226 = true;
        return spritePixels3;
    }
    
    void by(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            qh(this, buffer, ra, (byte)(-93));
        }
    }
    
    public static ModelData by(final ItemComposition itemComposition, final int n, final int n2) {
        if (itemComposition == null) {
            return itemComposition.method1106(n, n);
        }
        try {
            int n3 = 2144570273 * itemComposition.femaleHeadModel2;
            int n4 = 1570928533 * itemComposition.field1766;
            if (n == 1) {
                if (n2 >= -437867363) {
                    throw new IllegalStateException();
                }
                n3 = -560329405 * itemComposition.field1736;
                n4 = 1869912693 * itemComposition.field1772;
            }
            if (-1 != n3) {
                ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n3, 0);
                if (n4 != -1) {
                    if (n2 >= -437867363) {
                        throw new IllegalStateException();
                    }
                    modelData_get = new ModelData(new ModelData[] { modelData_get, ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n4, 0) }, 2);
                }
                if (null != itemComposition.recolorFrom) {
                    if (n2 >= -437867363) {
                        throw new IllegalStateException();
                    }
                    for (int i = 0; i < itemComposition.recolorFrom.length; ++i) {
                        if (n2 >= -437867363) {
                            throw new IllegalStateException();
                        }
                        ModelData.lm(modelData_get, itemComposition.recolorFrom[i], itemComposition.recolorTo[i]);
                    }
                }
                if (null != itemComposition.retextureFrom) {
                    if (n2 >= -437867363) {
                        throw new IllegalStateException();
                    }
                    for (int j = 0; j < itemComposition.retextureFrom.length; ++j) {
                        if (n2 >= -437867363) {
                            throw new IllegalStateException();
                        }
                        ModelData.jw(modelData_get, itemComposition.retextureFrom[j], itemComposition.retextureTo[j]);
                    }
                }
                return modelData_get;
            }
            if (n2 >= -437867363) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.ah(" + ')');
        }
    }
    
    void bx(final ItemComposition itemComposition, final ItemComposition itemComposition2) {
        this.model = itemComposition.model * 1;
        this.zoom2d = itemComposition.zoom2d * 1;
        this.xan2d = 1 * itemComposition.xan2d;
        this.yan2d = 1 * itemComposition.yan2d;
        this.zan2d = 1 * itemComposition.zan2d;
        this.offsetX2d = 1 * itemComposition.offsetX2d;
        this.offsetY2d = itemComposition.offsetY2d * 1;
        this.recolorFrom = itemComposition.recolorFrom;
        this.recolorTo = itemComposition.recolorTo;
        this.retextureFrom = itemComposition.retextureFrom;
        this.retextureTo = itemComposition.retextureTo;
        this.name = itemComposition2.name;
        this.isMembersOnly = itemComposition2.isMembersOnly;
        this.price = itemComposition2.price * 1;
        this.isStackable = 1685556127;
    }
    
    public String getStringParam(final int n, final String s, final byte b) {
        try {
            return EnumComposition.method1014(this.params, n, s, 1596663323);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.ar(" + ')');
        }
    }
    
    public static void hp(final ItemComposition itemComposition, final ItemComposition itemComposition2, final ItemComposition itemComposition3) {
        if (itemComposition == null) {
            itemComposition.cd();
        }
        itemComposition.model = itemComposition2.model * 1;
        itemComposition.zoom2d = itemComposition2.zoom2d * 1;
        itemComposition.xan2d = 1 * itemComposition2.xan2d;
        itemComposition.yan2d = 1 * itemComposition2.yan2d;
        itemComposition.zan2d = 1 * itemComposition2.zan2d;
        itemComposition.offsetX2d = 1 * itemComposition2.offsetX2d;
        itemComposition.offsetY2d = itemComposition2.offsetY2d * 1;
        itemComposition.recolorFrom = itemComposition2.recolorFrom;
        itemComposition.recolorTo = itemComposition2.recolorTo;
        itemComposition.retextureFrom = itemComposition2.retextureFrom;
        itemComposition.retextureTo = itemComposition2.retextureTo;
        itemComposition.name = itemComposition3.name;
        itemComposition.isMembersOnly = itemComposition3.isMembersOnly;
        itemComposition.price = itemComposition3.price * 1;
        itemComposition.isStackable = 1685556127;
    }
    
    void ap() {
        if (this.isStackable * 1552863327 == 1) {
            this.field1774 = 0;
        }
    }
    
    public static void yb(final ItemComposition itemComposition, final Buffer buffer, final byte b) {
        Label_0010: {
            if (itemComposition != null) {
                break Label_0010;
            }
            itemComposition.decode(buffer, b);
            try {
                while (true) {
                    final int ra = Buffer.ra(buffer, (byte)7);
                    if (ra == 0) {
                        break;
                    }
                    qh(itemComposition, buffer, ra, (byte)(-19));
                }
                if (b == 2) {
                    throw new IllegalStateException();
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "hz.aw(" + ')');
            }
        }
    }
    
    public final ModelData cm(final int n) {
        int n2 = 2144570273 * this.femaleHeadModel2;
        int n3 = 1570928533 * this.field1766;
        if (n == 1) {
            n2 = -560329405 * this.field1736;
            n3 = 1869912693 * this.field1772;
        }
        if (-1 == n2) {
            return null;
        }
        ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n2, 0);
        if (n3 != -1) {
            modelData_get = new ModelData(new ModelData[] { modelData_get, ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, n3, 0) }, 2);
        }
        if (null != this.recolorFrom) {
            for (int i = 0; i < this.recolorFrom.length; ++i) {
                ModelData.lm(modelData_get, this.recolorFrom[i], this.recolorTo[i]);
            }
        }
        if (null != this.retextureFrom) {
            for (int j = 0; j < this.retextureFrom.length; ++j) {
                ModelData.jw(modelData_get, this.retextureFrom[j], this.retextureTo[j]);
            }
        }
        return modelData_get;
    }
    
    public void hl(final ItemComposition itemComposition, final ItemComposition itemComposition2) {
        this.setName(itemComposition2.getMembersName());
        this.cv = itemComposition2.getMembersName();
    }
    
    public int cg(final int n, final int n2) {
        final IterableNodeHashTable params = this.params;
        int integer;
        if (null == params) {
            integer = n2;
        }
        else {
            final IntegerNode integerNode = (IntegerNode)params.aa(n);
            if (integerNode == null) {
                integer = n2;
            }
            else {
                integer = integerNode.integer;
            }
        }
        return integer;
    }
    
    public static void co() {
        ItemComposition.ItemDefinition_cached.clear();
        ItemComposition.ItemDefinition_cachedModels.clear();
        ItemComposition.ItemDefinition_cachedSprites.clear();
    }
    
    public String cy(final int n, final String s) {
        return EnumComposition.method1014(this.params, n, s, 1979191669);
    }
    
    public void vx(final int n) {
        if ("Members object".equals(this.getName()) && this.cv != null) {
            this.setName(this.cv + " (Members)");
        }
    }
    
    void bn(final ItemComposition itemComposition, final ItemComposition itemComposition2) {
        this.model = itemComposition.model * 1;
        this.zoom2d = 1 * itemComposition.zoom2d;
        this.xan2d = itemComposition.xan2d * 1;
        this.yan2d = itemComposition.yan2d * 1;
        this.zan2d = itemComposition.zan2d * 1;
        this.offsetX2d = itemComposition.offsetX2d * 1;
        this.offsetY2d = itemComposition.offsetY2d * 1;
        this.recolorFrom = itemComposition.recolorFrom;
        this.recolorTo = itemComposition.recolorTo;
        this.retextureFrom = itemComposition.retextureFrom;
        this.retextureTo = itemComposition.retextureTo;
        this.isStackable = itemComposition.isStackable * 1;
        this.name = itemComposition2.name;
        this.price = 0;
        this.isMembersOnly = false;
        this.isTradable = false;
    }
    
    public static void cz() {
        ItemComposition.ItemDefinition_cached.clear();
        ItemComposition.ItemDefinition_cachedModels.clear();
        ItemComposition.ItemDefinition_cachedSprites.clear();
    }
    
    void genBought(final ItemComposition itemComposition, final ItemComposition itemComposition2, final int n) {
        try {
            this.model = 1 * itemComposition.model;
            this.zoom2d = 1 * itemComposition.zoom2d;
            this.xan2d = 1 * itemComposition.xan2d;
            this.yan2d = 1 * itemComposition.yan2d;
            this.zan2d = 1 * itemComposition.zan2d;
            this.offsetX2d = 1 * itemComposition.offsetX2d;
            this.offsetY2d = 1 * itemComposition.offsetY2d;
            this.recolorFrom = itemComposition2.recolorFrom;
            this.recolorTo = itemComposition2.recolorTo;
            this.retextureFrom = itemComposition2.retextureFrom;
            this.retextureTo = itemComposition2.retextureTo;
            this.name = itemComposition2.name;
            this.vx(-1);
            this.isMembersOnly = itemComposition2.isMembersOnly;
            this.isStackable = itemComposition2.isStackable * 1;
            this.maleModel = 1 * itemComposition2.maleModel;
            this.maleModel1 = 1 * itemComposition2.maleModel1;
            this.maleModel2 = itemComposition2.maleModel2 * 1;
            this.femaleModel = itemComposition2.femaleModel * 1;
            this.femaleModel1 = itemComposition2.femaleModel1 * 1;
            this.femaleModel2 = itemComposition2.femaleModel2 * 1;
            this.maleHeadModel = 1 * itemComposition2.maleHeadModel;
            this.maleHeadModel2 = itemComposition2.maleHeadModel2 * 1;
            this.femaleHeadModel = itemComposition2.femaleHeadModel * 1;
            this.femaleHeadModel2 = 1 * itemComposition2.femaleHeadModel2;
            this.field1766 = 1 * itemComposition2.field1766;
            this.field1736 = itemComposition2.field1736 * 1;
            this.field1772 = 1 * itemComposition2.field1772;
            this.team = itemComposition2.team * 1;
            this.groundActions = itemComposition2.groundActions;
            this.field1774 = itemComposition2.field1774 * 1;
            this.inventoryActions = new String[5];
            if (null != itemComposition2.inventoryActions) {
                if (n != 797932055) {
                    throw new IllegalStateException();
                }
                for (int i = 0; i < 4; ++i) {
                    if (n != 797932055) {
                        throw new IllegalStateException();
                    }
                    this.inventoryActions[i] = itemComposition2.inventoryActions[i];
                }
            }
            this.inventoryActions[4] = Strings.al;
            this.price = 0;
            this.yz(itemComposition, itemComposition2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.ab(" + ')');
        }
    }
    
    public static void genPlaceholder(final ItemComposition itemComposition, final Buffer buffer, final int n) {
        if (itemComposition == null) {
            itemComposition.getTextureToReplace();
        }
        if (n == 1) {
            itemComposition.model = buffer.readUnsignedShort(879894594) * 19259063;
        }
        else if (2 == n) {
            itemComposition.name = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (4 == n) {
            itemComposition.zoom2d = buffer.readUnsignedShort(-335121451) * 354264929;
        }
        else if (5 == n) {
            itemComposition.xan2d = buffer.readUnsignedShort(529942856) * 562382912;
        }
        else if (n == 6) {
            itemComposition.yan2d = buffer.readUnsignedShort(-1589206087) * -1698175273;
        }
        else if (n == 7) {
            itemComposition.offsetX2d = buffer.readUnsignedShort(-2106245689) * 233220529;
            if (itemComposition.offsetX2d * -838143002 > 32767) {
                itemComposition.offsetX2d += 1448017920;
            }
        }
        else if (8 == n) {
            itemComposition.offsetY2d = buffer.readUnsignedShort(179917368) * -780188501;
            if (1349661329 * itemComposition.offsetY2d > -127093559) {
                itemComposition.offsetY2d -= 5671841;
            }
        }
        else if (9 == n) {
            buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 11) {
            itemComposition.isStackable = 889327556;
        }
        else if (n == 12) {
            itemComposition.price = buffer.readInt(-1389789800) * 186362771;
        }
        else if (n == 13) {
            itemComposition.maleModel = Buffer.ra(buffer, (byte)7) * -1072009039;
        }
        else if (n == 14) {
            itemComposition.maleModel1 = Buffer.ra(buffer, (byte)7) * 1699982907;
        }
        else if (16 == n) {
            itemComposition.isMembersOnly = true;
        }
        else if (23 == n) {
            itemComposition.femaleModel = buffer.readUnsignedShort(-2000678661) * -240774559;
            itemComposition.femaleOffset = Buffer.ra(buffer, (byte)7) * -1007890181;
        }
        else if (n == 24) {
            itemComposition.femaleModel1 = buffer.readUnsignedShort(718810908) * 1308828767;
        }
        else if (n == 25) {
            itemComposition.maleHeadModel = buffer.readUnsignedShort(-880060698) * -459970545;
            itemComposition.field1767 = Buffer.ra(buffer, (byte)7) * 1661879059;
        }
        else if (n == 26) {
            itemComposition.maleHeadModel2 = buffer.readUnsignedShort(-308496038) * -536791533;
        }
        else if (n == 27) {
            itemComposition.maleModel2 = Buffer.ra(buffer, (byte)7) * 1627653365;
        }
        else if (n >= 30 && n < 1508646878) {
            itemComposition.groundActions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
            if (itemComposition.groundActions[n - 30].equalsIgnoreCase(Strings.ac)) {
                itemComposition.groundActions[n - 30] = null;
            }
        }
        else if (n >= 214833912 && n < 40) {
            itemComposition.inventoryActions[n - 423054502] = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 124851968) {
            final int ra = Buffer.ra(buffer, (byte)7);
            itemComposition.recolorFrom = new short[ra];
            itemComposition.recolorTo = new short[ra];
            for (int i = 0; i < ra; ++i) {
                itemComposition.recolorFrom[i] = (short)buffer.readUnsignedShort(-1327041510);
                itemComposition.recolorTo[i] = (short)buffer.readUnsignedShort(-1818881098);
            }
        }
        else if (2129177476 == n) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            itemComposition.retextureFrom = new short[ra2];
            itemComposition.retextureTo = new short[ra2];
            for (int j = 0; j < ra2; ++j) {
                itemComposition.retextureFrom[j] = (short)buffer.readUnsignedShort(-1162550665);
                itemComposition.retextureTo[j] = (short)buffer.readUnsignedShort(720863427);
            }
        }
        else if (42 == n) {
            itemComposition.shiftClickIndex = Buffer.wu(buffer, 435772489) * 1596890034;
        }
        else if (n == -1062767375) {
            itemComposition.isTradable = true;
        }
        else if (-1122831045 == n) {
            itemComposition.field1774 = buffer.readUnsignedByte((byte)(-10)) * 1825858873;
        }
        else if (78 == n) {
            itemComposition.femaleModel2 = buffer.readUnsignedShort(-142662703) * 1484971221;
        }
        else if (n == 563784646) {
            itemComposition.femaleHeadModel = buffer.readUnsignedShort(-1401900209) * 787170795;
        }
        else if (90 == n) {
            itemComposition.femaleHeadModel2 = buffer.readUnsignedShort(436555437) * 1008801889;
        }
        else if (n == 870729244) {
            itemComposition.field1736 = buffer.readUnsignedShort(-1770569463) * 1424678676;
        }
        else if (n == 92) {
            itemComposition.field1766 = buffer.readUnsignedShort(539524143) * 174922685;
        }
        else if (93 == n) {
            itemComposition.field1772 = buffer.readUnsignedShort(-800622032) * -1121976247;
        }
        else if (-57679536 == n) {
            buffer.readUnsignedShort(305296720);
        }
        else if (95 == n) {
            itemComposition.zan2d = buffer.readUnsignedShort(-1166586635) * 1724640311;
        }
        else if (97 == n) {
            itemComposition.note = buffer.readUnsignedShort(724808748) * 58690731;
        }
        else if (n == 98) {
            itemComposition.noteTemplate = buffer.readUnsignedShort(158869782) * -1531633795;
        }
        else if (n >= 100 && n < -1186478568) {
            if (itemComposition.countobj == null) {
                itemComposition.countobj = new int[10];
                itemComposition.countco = new int[10];
            }
            itemComposition.countobj[n - 100] = buffer.readUnsignedShort(-301577957);
            itemComposition.countco[n - 632558861] = buffer.readUnsignedShort(-236908324);
        }
        else if (-396140477 == n) {
            itemComposition.resizeX = buffer.readUnsignedShort(102821777) * 638203893;
        }
        else if (n == 111) {
            itemComposition.resizeY = buffer.readUnsignedShort(-184708543) * 2110951210;
        }
        else if (112 == n) {
            itemComposition.resizeZ = buffer.readUnsignedShort(21060391) * 37900935;
        }
        else if (n == -609206429) {
            itemComposition.field1780 = Buffer.wu(buffer, 435772489) * -2035992675;
        }
        else if (n == 8177790) {
            itemComposition.field1781 = Buffer.wu(buffer, 435772489) * -443853091;
        }
        else if (n == 193863757) {
            itemComposition.team = Buffer.ra(buffer, (byte)7) * -1604943878;
        }
        else if (-60305644 == n) {
            itemComposition.unnotedId = buffer.readUnsignedShort(-695004459) * -1483864454;
        }
        else if (n == 140) {
            itemComposition.notedId = buffer.readUnsignedShort(-2133566634) * 1073961371;
        }
        else if (n == 148) {
            itemComposition.placeholder = buffer.readUnsignedShort(-1346682601) * -1652212107;
        }
        else if (796769266 == n) {
            itemComposition.placeholderTemplate = buffer.readUnsignedShort(-279191744) * -492633329;
        }
        else if (n == 804769825) {
            itemComposition.params = ChatChannel.addMessage(buffer, itemComposition.params, (byte)(-17));
        }
    }
    
    void genPlaceholder(final ItemComposition itemComposition, final ItemComposition itemComposition2, final int n) {
        try {
            this.model = itemComposition.model * 1;
            this.zoom2d = 1 * itemComposition.zoom2d;
            this.xan2d = itemComposition.xan2d * 1;
            this.yan2d = itemComposition.yan2d * 1;
            this.zan2d = itemComposition.zan2d * 1;
            this.offsetX2d = itemComposition.offsetX2d * 1;
            this.offsetY2d = itemComposition.offsetY2d * 1;
            this.recolorFrom = itemComposition.recolorFrom;
            this.recolorTo = itemComposition.recolorTo;
            this.retextureFrom = itemComposition.retextureFrom;
            this.retextureTo = itemComposition.retextureTo;
            this.isStackable = itemComposition.isStackable * 1;
            this.name = itemComposition2.name;
            this.vx(-1);
            this.price = 0;
            this.isMembersOnly = false;
            this.isTradable = false;
            this.hl(itemComposition, itemComposition2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.aq(" + ')');
        }
    }
    
    public final boolean method1105(final int n, final int n2) {
        try {
            int n3 = this.femaleModel * 1259737505;
            int n4 = this.femaleModel1 * -1975240801;
            int n5 = this.femaleModel2 * -1550321451;
            if (1 == n) {
                n3 = -1355512081 * this.maleHeadModel;
                n4 = -1937321521 * this.maleHeadModel2;
                n5 = this.femaleHeadModel * 1169668803;
            }
            if (-1 == n3) {
                return true;
            }
            boolean b = true;
            if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n3, 0, (byte)65)) {
                if (n2 == 523869725) {
                    throw new IllegalStateException();
                }
                b = false;
            }
            if (n4 != -1) {
                if (n2 == 523869725) {
                    throw new IllegalStateException();
                }
                if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n4, 0, (byte)(-25))) {
                    if (n2 == 523869725) {
                        throw new IllegalStateException();
                    }
                    b = false;
                }
            }
            if (-1 != n5) {
                if (n2 == 523869725) {
                    throw new IllegalStateException();
                }
                if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n5, 0, (byte)51)) {
                    if (n2 == 523869725) {
                        throw new IllegalStateException();
                    }
                    b = false;
                }
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.ax(" + ')');
        }
    }
    
    public ItemComposition bl(final int n) {
        if (this.countobj != null && n > 1) {
            int n2 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n >= this.countco[i] && 0 != this.countco[i]) {
                    n2 = this.countobj[i];
                }
            }
            if (-1 != n2) {
                return HealthBarUpdate.set(n2, (byte)25);
            }
        }
        return this;
    }
    
    void bz(final ItemComposition itemComposition, final ItemComposition itemComposition2) {
        this.model = itemComposition.model * 1;
        this.zoom2d = itemComposition.zoom2d * 1;
        this.xan2d = 1 * itemComposition.xan2d;
        this.yan2d = 1 * itemComposition.yan2d;
        this.zan2d = 1 * itemComposition.zan2d;
        this.offsetX2d = 1 * itemComposition.offsetX2d;
        this.offsetY2d = itemComposition.offsetY2d * 1;
        this.recolorFrom = itemComposition.recolorFrom;
        this.recolorTo = itemComposition.recolorTo;
        this.retextureFrom = itemComposition.retextureFrom;
        this.retextureTo = itemComposition.retextureTo;
        this.name = itemComposition2.name;
        this.isMembersOnly = itemComposition2.isMembersOnly;
        this.price = itemComposition2.price * 1;
        this.isStackable = 1685556127;
    }
    
    public void zv(final ItemComposition itemComposition, final ItemComposition itemComposition2) {
        this.setName(itemComposition2.getMembersName());
        this.cv = itemComposition2.getMembersName();
    }
    
    public Node hq(final int n) {
        if (this.getParams() == null) {
            return null;
        }
        return (Node)this.getParams().get((long)n);
    }
    
    public int getNote() {
        return this.noteTemplate * -1375068187;
    }
    
    public int getLinkedNoteId() {
        return this.note * 1399852547;
    }
    
    public int getPrice() {
        return this.price * -1706039181;
    }
    
    public int getPlaceholderId() {
        return this.placeholder * -172219939;
    }
    
    public short[] getTextureToReplace() {
        return this.retextureFrom;
    }
    
    public void setShiftClickActionIndex(final int yf) {
        this.yf = yf;
    }
    
    public int getShiftClickActionIndex() {
        return this.getShiftClickIndex((byte)42);
    }
    
    public void setTextureToReplaceWith(final short[] retextureTo) {
        this.retextureTo = retextureTo;
    }
    
    public String[] getInventoryActions() {
        return this.inventoryActions;
    }
    
    public short[] getTextureToReplaceWith() {
        return this.retextureTo;
    }
    
    public void setColorToReplaceWith(final short[] recolorTo) {
        this.recolorTo = recolorTo;
    }
    
    public void setTextureToReplace(final short[] retextureFrom) {
        this.retextureFrom = retextureFrom;
    }
    
    public short[] getColorToReplaceWith() {
        return this.recolorTo;
    }
    
    public int getHaPrice() {
        return (int)(this.getPrice() * 0.6f);
    }
    
    public boolean isTradeable() {
        return this.isTradable;
    }
    
    public int getInventoryModel() {
        return this.model * 2000117511;
    }
    
    public String getMembersName() {
        return this.cv;
    }
    
    public void setInventoryModel(final int n) {
        this.model = n * 19259063;
    }
    
    public short[] getColorToReplace() {
        return this.recolorFrom;
    }
    
    public boolean isStackable() {
        return this.pt() != 0;
    }
    
    public void setColorToReplace(final short[] recolorFrom) {
        this.recolorFrom = recolorFrom;
    }
    
    public boolean isMembers() {
        return this.isMembersOnly;
    }
    
    public int getYan2d() {
        return this.yan2d * -2044433177;
    }
    
    public String getStringValue(final int n) {
        final Node hq = this.hq(n);
        if (hq != null) {
            return (String)((ObjectNode)hq).by();
        }
        final ParamComposition xa = ScriptFrame.client.xa(n);
        if (!xa.zx()) {
            throw new IllegalArgumentException("trying to get string from int param");
        }
        return xa.zt();
    }
    
    public int getXan2d() {
        return this.xan2d * 415331477;
    }
    
    public void setXan2d(final int n) {
        this.xan2d = n * -111167811;
    }
    
    public void setZan2d(final int n) {
        this.zan2d = n * 1724640311;
    }
    
    public void setParams(final IterableHashTable iterableHashTable) {
        this.params = (IterableNodeHashTable)iterableHashTable;
    }
    
    public int getZan2d() {
        return this.zan2d * 450595207;
    }
    
    public void setYan2d(final int n) {
        this.yan2d = n * -1698175273;
    }
    
    public int getIntValue(final int n) {
        final Node hq = this.hq(n);
        if (hq != null) {
            return ((IntegerNode)hq).getValue();
        }
        final ParamComposition xa = ScriptFrame.client.xa(n);
        if (xa.zx()) {
            throw new IllegalArgumentException("trying to get int from string param");
        }
        return xa.wl();
    }
    
    public int getPlaceholderTemplateId() {
        return this.placeholderTemplate * 119859889;
    }
    
    public static int[] qb(final Widget widget, final Buffer buffer) {
        if (widget == null) {
            widget.getActions();
        }
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra == 0) {
            return null;
        }
        final int[] array = new int[ra];
        for (int i = 0; i < ra; ++i) {
            array[i] = buffer.readInt(-1743342631);
        }
        return array;
    }
    
    public void xu(final int n, final Node node) {
        final ParamComposition xa = ScriptFrame.client.xa(n);
        if (xa.zx() == node instanceof ObjectNode) {
            if (this.getParams() == null) {
                this.setParams((IterableHashTable)ScriptFrame.client.mo(16));
            }
            this.getParams().put((net.runelite.api.Node)node, (long)n);
            return;
        }
        if (xa.zx()) {
            throw new IllegalArgumentException("trying to put int into string param");
        }
        throw new IllegalArgumentException("trying to put string into int param");
    }
    
    public void yz(final ItemComposition itemComposition, final ItemComposition itemComposition2) {
        this.setName(itemComposition2.getMembersName());
        this.cv = itemComposition2.getMembersName();
    }
    
    public final boolean cq(final int n) {
        int n2 = 2144570273 * this.femaleHeadModel2;
        int n3 = this.field1766 * 1570928533;
        if (n == 1) {
            n2 = this.field1736 * -560329405;
            n3 = this.field1772 * 1869912693;
        }
        if (n2 == -1) {
            return true;
        }
        boolean b = true;
        if (!ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n2, 0, (byte)20)) {
            b = false;
        }
        if (-1 != n3 && !ItemComposition.ItemDefinition_modelArchive.tryLoadFile(n3, 0, (byte)(-14))) {
            b = false;
        }
        return b;
    }
    
    void bk(final Buffer buffer, final int n) {
        if (n == 1) {
            this.model = buffer.readUnsignedShort(412924417) * 19259063;
        }
        else if (2 == n) {
            this.name = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (4 == n) {
            this.zoom2d = buffer.readUnsignedShort(198651900) * 354264929;
        }
        else if (5 == n) {
            this.xan2d = buffer.readUnsignedShort(768059601) * -111167811;
        }
        else if (n == 6) {
            this.yan2d = buffer.readUnsignedShort(-898050311) * -1698175273;
        }
        else if (n == 7) {
            this.offsetX2d = buffer.readUnsignedShort(80540442) * 233220529;
            if (this.offsetX2d * 151912273 > 32767) {
                this.offsetX2d += 1448017920;
            }
        }
        else if (8 == n) {
            this.offsetY2d = buffer.readUnsignedShort(-1956400174) * -780188501;
            if (-271411709 * this.offsetY2d > 32767) {
                this.offsetY2d -= 1152057344;
            }
        }
        else if (9 == n) {
            buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 11) {
            this.isStackable = 1685556127;
        }
        else if (n == 12) {
            this.price = buffer.readInt(-1717392120) * -1041171269;
        }
        else if (n == 13) {
            this.maleModel = Buffer.ra(buffer, (byte)7) * -1072009039;
        }
        else if (n == 14) {
            this.maleModel1 = Buffer.ra(buffer, (byte)7) * 1699982907;
        }
        else if (16 == n) {
            this.isMembersOnly = true;
        }
        else if (23 == n) {
            this.femaleModel = buffer.readUnsignedShort(-1698603000) * -240774559;
            this.femaleOffset = Buffer.ra(buffer, (byte)7) * -1007890181;
        }
        else if (n == 24) {
            this.femaleModel1 = buffer.readUnsignedShort(-154588865) * 1308828767;
        }
        else if (n == 25) {
            this.maleHeadModel = buffer.readUnsignedShort(-104166741) * -459970545;
            this.field1767 = Buffer.ra(buffer, (byte)7) * -677816051;
        }
        else if (n == 26) {
            this.maleHeadModel2 = buffer.readUnsignedShort(-703396351) * 624858415;
        }
        else if (n == 27) {
            this.maleModel2 = Buffer.ra(buffer, (byte)7) * 1627653365;
        }
        else if (n >= 30 && n < 35) {
            this.groundActions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
            if (this.groundActions[n - 30].equalsIgnoreCase(Strings.ac)) {
                this.groundActions[n - 30] = null;
            }
        }
        else if (n >= 35 && n < 40) {
            this.inventoryActions[n - 35] = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 40) {
            final int ra = Buffer.ra(buffer, (byte)7);
            this.recolorFrom = new short[ra];
            this.recolorTo = new short[ra];
            for (int i = 0; i < ra; ++i) {
                this.recolorFrom[i] = (short)buffer.readUnsignedShort(-367232317);
                this.recolorTo[i] = (short)buffer.readUnsignedShort(504008765);
            }
        }
        else if (41 == n) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            this.retextureFrom = new short[ra2];
            this.retextureTo = new short[ra2];
            for (int j = 0; j < ra2; ++j) {
                this.retextureFrom[j] = (short)buffer.readUnsignedShort(747169295);
                this.retextureTo[j] = (short)buffer.readUnsignedShort(-1330801785);
            }
        }
        else if (42 == n) {
            this.shiftClickIndex = Buffer.wu(buffer, 435772489) * -645393821;
        }
        else if (n == 65) {
            this.isTradable = true;
        }
        else if (75 == n) {
            this.field1774 = buffer.readUnsignedByte((byte)(-55)) * 1825858873;
        }
        else if (78 == n) {
            this.femaleModel2 = buffer.readUnsignedShort(-1780989757) * 1230864509;
        }
        else if (n == 79) {
            this.femaleHeadModel = buffer.readUnsignedShort(-1003953428) * 787170795;
        }
        else if (90 == n) {
            this.femaleHeadModel2 = buffer.readUnsignedShort(-2118799118) * 1008801889;
        }
        else if (n == 91) {
            this.field1736 = buffer.readUnsignedShort(-663406224) * -1191712917;
        }
        else if (n == 92) {
            this.field1766 = buffer.readUnsignedShort(451099176) * 174922685;
        }
        else if (93 == n) {
            this.field1772 = buffer.readUnsignedShort(-1000727035) * -738400803;
        }
        else if (94 == n) {
            buffer.readUnsignedShort(-64314620);
        }
        else if (95 == n) {
            this.zan2d = buffer.readUnsignedShort(-431827267) * 1724640311;
        }
        else if (97 == n) {
            this.note = buffer.readUnsignedShort(-2112421685) * 58690731;
        }
        else if (n == 98) {
            this.noteTemplate = buffer.readUnsignedShort(-999232973) * 468518381;
        }
        else if (n >= 100 && n < 110) {
            if (this.countobj == null) {
                this.countobj = new int[10];
                this.countco = new int[10];
            }
            this.countobj[n - 100] = buffer.readUnsignedShort(544441669);
            this.countco[n - 100] = buffer.readUnsignedShort(-660365089);
        }
        else if (110 == n) {
            this.resizeX = buffer.readUnsignedShort(-327190278) * -662446763;
        }
        else if (n == 111) {
            this.resizeY = buffer.readUnsignedShort(420488142) * 1450797079;
        }
        else if (112 == n) {
            this.resizeZ = buffer.readUnsignedShort(-1399191646) * 547093665;
        }
        else if (n == 113) {
            this.field1780 = Buffer.wu(buffer, 435772489) * -2035992675;
        }
        else if (n == 114) {
            this.field1781 = Buffer.wu(buffer, 435772489) * -297744971;
        }
        else if (n == 115) {
            this.team = Buffer.ra(buffer, (byte)7) * 1067505549;
        }
        else if (139 == n) {
            this.unnotedId = buffer.readUnsignedShort(2854581) * 1905271763;
        }
        else if (n == 140) {
            this.notedId = buffer.readUnsignedShort(-1258304181) * 1073961371;
        }
        else if (n == 148) {
            this.placeholder = buffer.readUnsignedShort(-662243196) * -1652212107;
        }
        else if (149 == n) {
            this.placeholderTemplate = buffer.readUnsignedShort(-457495050) * -115270063;
        }
        else if (n == 249) {
            this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-66));
        }
    }
    
    public final ModelData method1106(final int n, final int n2) {
        try {
            int n3 = 2144570273 * this.femaleHeadModel2;
            int n4 = 1570928533 * this.field1767;
            if (n == 1) {
                if (n2 >= -437867363) {
                    throw new IllegalStateException();
                }
                n3 = -560329405 * this.femaleModel1;
                n4 = 1869912693 * this.notedId;
            }
            if (-1 != n3) {
                ModelData bk = ModelData.bk(ItemComposition.ItemDefinition_modelArchive, n3, 0);
                if (n4 != -1) {
                    if (n2 >= -437867363) {
                        throw new IllegalStateException();
                    }
                    bk = new ModelData(new ModelData[] { bk, ModelData.bk(ItemComposition.ItemDefinition_modelArchive, n4, 0) }, 2);
                }
                if (null != this.retextureFrom) {
                    if (n2 >= -437867363) {
                        throw new IllegalStateException();
                    }
                    for (int i = 0; i < this.retextureTo.length; ++i) {
                        if (n2 >= -437867363) {
                            throw new IllegalStateException();
                        }
                        ModelData.lm(bk, this.retextureTo[i], this.retextureFrom[i]);
                    }
                }
                if (null != this.retextureFrom) {
                    if (n2 >= -437867363) {
                        throw new IllegalStateException();
                    }
                    for (int j = 0; j < this.retextureTo.length; ++j) {
                        if (n2 >= -437867363) {
                            throw new IllegalStateException();
                        }
                        ModelData.jw(bk, this.recolorTo[j], this.retextureTo[j]);
                    }
                }
                return bk;
            }
            if (n2 >= -437867363) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.ah(" + ')');
        }
    }
    
    public static void qh(final ItemComposition itemComposition, final Buffer buffer, final int n, final byte b) {
        if (itemComposition == null) {
            itemComposition.decodeNext(buffer, n, b);
        }
        try {
            if (n == 1) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.model = buffer.readUnsignedShort(-1754228801) * 19259063;
            }
            else if (2 == n) {
                if (b >= 2) {
                    return;
                }
                itemComposition.name = buffer.readStringCp1252NullTerminated((byte)0);
                itemComposition.vx(-1);
            }
            else if (4 == n) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.zoom2d = buffer.readUnsignedShort(-1685829981) * 354264929;
            }
            else if (5 == n) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.xan2d = buffer.readUnsignedShort(344270307) * -111167811;
            }
            else if (n == 6) {
                if (b >= 2) {
                    return;
                }
                itemComposition.yan2d = buffer.readUnsignedShort(149770420) * -1698175273;
            }
            else if (n == 7) {
                if (b >= 2) {
                    return;
                }
                itemComposition.offsetX2d = buffer.readUnsignedShort(340084669) * 233220529;
                if (itemComposition.offsetX2d * 151912273 > 32767) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    itemComposition.offsetX2d += 1448017920;
                }
            }
            else if (8 == n) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.offsetY2d = buffer.readUnsignedShort(-1080726659) * -780188501;
                if (-271411709 * itemComposition.offsetY2d > 32767) {
                    if (b >= 2) {
                        return;
                    }
                    itemComposition.offsetY2d -= 1152057344;
                }
            }
            else if (9 == n) {
                buffer.readStringCp1252NullTerminated((byte)0);
            }
            else if (n == 11) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.isStackable = 1685556127;
            }
            else if (n == 12) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.price = buffer.readInt(-1224672117) * -1041171269;
            }
            else if (n == 13) {
                itemComposition.maleModel = Buffer.ra(buffer, (byte)7) * -1072009039;
            }
            else if (n == 14) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.maleModel1 = Buffer.ra(buffer, (byte)7) * 1699982907;
            }
            else if (16 == n) {
                itemComposition.isMembersOnly = true;
            }
            else if (23 == n) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.femaleModel = buffer.readUnsignedShort(843033967) * -240774559;
                itemComposition.femaleOffset = Buffer.ra(buffer, (byte)7) * -1007890181;
            }
            else if (n == 24) {
                itemComposition.femaleModel1 = buffer.readUnsignedShort(-1373739066) * 1308828767;
            }
            else if (n == 25) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.maleHeadModel = buffer.readUnsignedShort(-1122867664) * -459970545;
                itemComposition.field1767 = Buffer.ra(buffer, (byte)7) * -677816051;
            }
            else if (n == 26) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.maleHeadModel2 = buffer.readUnsignedShort(-99776406) * 624858415;
            }
            else if (n == 27) {
                if (b >= 2) {
                    throw new IllegalStateException();
                }
                itemComposition.maleModel2 = Buffer.ra(buffer, (byte)7) * 1627653365;
            }
            else {
                if (n >= 30) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    if (n < 35) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.groundActions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
                        if (!itemComposition.groundActions[n - 30].equalsIgnoreCase(Strings.ac)) {
                            return;
                        }
                        if (b >= 2) {
                            return;
                        }
                        itemComposition.groundActions[n - 30] = null;
                        return;
                    }
                }
                if (n >= 35 && n < 40) {
                    if (b >= 2) {
                        return;
                    }
                    itemComposition.inventoryActions[n - 35] = buffer.readStringCp1252NullTerminated((byte)0);
                }
                else if (n == 40) {
                    if (b >= 2) {
                        return;
                    }
                    final int ra = Buffer.ra(buffer, (byte)7);
                    itemComposition.recolorFrom = new short[ra];
                    itemComposition.recolorTo = new short[ra];
                    for (int i = 0; i < ra; ++i) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.recolorFrom[i] = (short)buffer.readUnsignedShort(-1144883826);
                        itemComposition.recolorTo[i] = (short)buffer.readUnsignedShort(-386305756);
                    }
                }
                else if (41 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    itemComposition.retextureFrom = new short[ra2];
                    itemComposition.retextureTo = new short[ra2];
                    for (int j = 0; j < ra2; ++j) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.retextureFrom[j] = (short)buffer.readUnsignedShort(-1545105214);
                        itemComposition.retextureTo[j] = (short)buffer.readUnsignedShort(-286115407);
                    }
                }
                else if (42 == n) {
                    if (b >= 2) {
                        return;
                    }
                    itemComposition.shiftClickIndex = Buffer.wu(buffer, 435772489) * -645393821;
                }
                else if (n == 65) {
                    itemComposition.isTradable = true;
                }
                else if (75 == n) {
                    itemComposition.field1774 = buffer.readUnsignedByte((byte)(-109)) * 1825858873;
                }
                else if (78 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    itemComposition.femaleModel2 = buffer.readUnsignedShort(-1918603739) * 1230864509;
                }
                else if (n == 79) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    itemComposition.femaleHeadModel = buffer.readUnsignedShort(-667601927) * 787170795;
                }
                else if (90 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    itemComposition.femaleHeadModel2 = buffer.readUnsignedShort(-960295987) * 1008801889;
                }
                else if (n == 91) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    itemComposition.field1736 = buffer.readUnsignedShort(-1234773889) * -1191712917;
                }
                else if (n == 92) {
                    itemComposition.field1766 = buffer.readUnsignedShort(-494237193) * 174922685;
                }
                else if (93 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    itemComposition.field1772 = buffer.readUnsignedShort(589852488) * -738400803;
                }
                else if (94 == n) {
                    buffer.readUnsignedShort(-1939700741);
                }
                else if (95 == n) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    itemComposition.zan2d = buffer.readUnsignedShort(-969293820) * 1724640311;
                }
                else if (97 == n) {
                    if (b >= 2) {
                        return;
                    }
                    itemComposition.note = buffer.readUnsignedShort(-50436323) * 58690731;
                }
                else if (n == 98) {
                    if (b >= 2) {
                        throw new IllegalStateException();
                    }
                    itemComposition.noteTemplate = buffer.readUnsignedShort(64064630) * 468518381;
                }
                else {
                    if (n >= 100) {
                        if (b >= 2) {
                            return;
                        }
                        if (n < 110) {
                            if (b >= 2) {
                                return;
                            }
                            if (itemComposition.countobj == null) {
                                if (b >= 2) {
                                    throw new IllegalStateException();
                                }
                                itemComposition.countobj = new int[10];
                                itemComposition.countco = new int[10];
                            }
                            itemComposition.countobj[n - 100] = buffer.readUnsignedShort(-504474416);
                            itemComposition.countco[n - 100] = buffer.readUnsignedShort(506287311);
                            return;
                        }
                    }
                    if (110 == n) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.resizeX = buffer.readUnsignedShort(-369255067) * -662446763;
                    }
                    else if (n == 111) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.resizeY = buffer.readUnsignedShort(-284657307) * 1450797079;
                    }
                    else if (112 == n) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.resizeZ = buffer.readUnsignedShort(-158314987) * 547093665;
                    }
                    else if (n == 113) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.field1780 = Buffer.wu(buffer, 435772489) * -2035992675;
                    }
                    else if (n == 114) {
                        if (b >= 2) {
                            return;
                        }
                        itemComposition.field1781 = Buffer.wu(buffer, 435772489) * -297744971;
                    }
                    else if (n == 115) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.team = Buffer.ra(buffer, (byte)7) * 1067505549;
                    }
                    else if (139 == n) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.unnotedId = buffer.readUnsignedShort(-1297890761) * 1905271763;
                    }
                    else if (n == 140) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.notedId = buffer.readUnsignedShort(-455123583) * 1073961371;
                    }
                    else if (n == 148) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.placeholder = buffer.readUnsignedShort(52807640) * -1652212107;
                    }
                    else if (149 == n) {
                        if (b >= 2) {
                            throw new IllegalStateException();
                        }
                        itemComposition.placeholderTemplate = buffer.readUnsignedShort(454694063) * -115270063;
                    }
                    else if (n == 249) {
                        itemComposition.params = ChatChannel.addMessage(buffer, itemComposition.params, (byte)(-78));
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hz.ac(" + ')');
        }
    }
    
    public static void oz(final ItemComposition itemComposition, final ItemComposition itemComposition2, final ItemComposition itemComposition3) {
        if (itemComposition == null) {
            itemComposition.getMembersName();
        }
        itemComposition.model = 1 * itemComposition2.model;
        itemComposition.zoom2d = 1 * itemComposition2.zoom2d;
        itemComposition.xan2d = 1 * itemComposition2.xan2d;
        itemComposition.yan2d = 1 * itemComposition2.yan2d;
        itemComposition.zan2d = 1 * itemComposition2.zan2d;
        itemComposition.offsetX2d = 1 * itemComposition2.offsetX2d;
        itemComposition.offsetY2d = 1 * itemComposition2.offsetY2d;
        itemComposition.recolorFrom = itemComposition3.recolorFrom;
        itemComposition.recolorTo = itemComposition3.recolorTo;
        itemComposition.retextureFrom = itemComposition3.retextureFrom;
        itemComposition.retextureTo = itemComposition3.retextureTo;
        itemComposition.name = itemComposition3.name;
        itemComposition.isMembersOnly = itemComposition3.isMembersOnly;
        itemComposition.isStackable = itemComposition3.isStackable * 1;
        itemComposition.maleModel = 1 * itemComposition3.maleModel;
        itemComposition.maleModel1 = 1 * itemComposition3.maleModel1;
        itemComposition.maleModel2 = itemComposition3.maleModel2 * 1;
        itemComposition.femaleModel = itemComposition3.femaleModel * 1;
        itemComposition.femaleModel1 = itemComposition3.femaleModel1 * 1;
        itemComposition.femaleModel2 = itemComposition3.femaleModel2 * 1;
        itemComposition.maleHeadModel = 1 * itemComposition3.maleHeadModel;
        itemComposition.maleHeadModel2 = itemComposition3.maleHeadModel2 * 1;
        itemComposition.femaleHeadModel = itemComposition3.femaleHeadModel * 1;
        itemComposition.femaleHeadModel2 = 1 * itemComposition3.femaleHeadModel2;
        itemComposition.field1766 = 1 * itemComposition3.field1766;
        itemComposition.field1736 = itemComposition3.field1736 * 1;
        itemComposition.field1772 = 1 * itemComposition3.field1772;
        itemComposition.team = itemComposition3.team * 1;
        itemComposition.groundActions = itemComposition3.groundActions;
        itemComposition.field1774 = itemComposition3.field1774 * 1;
        itemComposition.inventoryActions = new String[5];
        if (null != itemComposition3.inventoryActions) {
            for (int i = 0; i < 4; ++i) {
                itemComposition.inventoryActions[i] = itemComposition3.inventoryActions[i];
            }
        }
        itemComposition.inventoryActions[4] = Strings.al;
        itemComposition.price = 0;
    }
    
    public static boolean oz(final ItemComposition itemComposition, final int n) {
        if (itemComposition == null) {
            itemComposition.hasRetexture(n);
        }
        try {
            boolean b;
            if (itemComposition.retextureTo != null) {
                if (n >= -1820707562) {
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
            throw HealthBar.get(ex, "hz.az(" + ')');
        }
    }
    
    public static void vr(final ItemComposition itemComposition, final ItemComposition itemComposition2, final ItemComposition itemComposition3) {
        if (itemComposition == null) {
            itemComposition.hl(itemComposition, itemComposition);
            return;
        }
        itemComposition.model = 1 * itemComposition2.model;
        itemComposition.zoom2d = 1 * itemComposition2.zoom2d;
        itemComposition.xan2d = 1 * itemComposition2.xan2d;
        itemComposition.yan2d = 1 * itemComposition2.yan2d;
        itemComposition.zan2d = 1 * itemComposition2.zan2d;
        itemComposition.offsetX2d = 1 * itemComposition2.offsetX2d;
        itemComposition.offsetY2d = 1 * itemComposition2.offsetY2d;
        itemComposition.recolorFrom = itemComposition3.recolorFrom;
        itemComposition.recolorTo = itemComposition3.recolorTo;
        itemComposition.retextureFrom = itemComposition3.retextureFrom;
        itemComposition.retextureTo = itemComposition3.retextureTo;
        itemComposition.name = itemComposition3.name;
        itemComposition.isMembersOnly = itemComposition3.isMembersOnly;
        itemComposition.isStackable = itemComposition3.isStackable * 1;
        itemComposition.maleModel = 1 * itemComposition3.maleModel;
        itemComposition.maleModel1 = 1 * itemComposition3.maleModel1;
        itemComposition.maleModel2 = itemComposition3.maleModel2 * 1;
        itemComposition.femaleModel = itemComposition3.femaleModel * 1;
        itemComposition.femaleModel1 = itemComposition3.femaleModel1 * 1;
        itemComposition.femaleModel2 = itemComposition3.femaleModel2 * 1;
        itemComposition.maleHeadModel = 1 * itemComposition3.maleHeadModel;
        itemComposition.maleHeadModel2 = itemComposition3.maleHeadModel2 * 1;
        itemComposition.femaleHeadModel = itemComposition3.femaleHeadModel * 1;
        itemComposition.femaleHeadModel2 = 1 * itemComposition3.femaleHeadModel2;
        itemComposition.field1766 = 1 * itemComposition3.field1766;
        itemComposition.field1736 = itemComposition3.field1736 * 1;
        itemComposition.field1772 = 1 * itemComposition3.field1772;
        itemComposition.team = itemComposition3.team * 1;
        itemComposition.groundActions = itemComposition3.groundActions;
        itemComposition.field1774 = itemComposition3.field1774 * 1;
        itemComposition.inventoryActions = new String[5];
        if (null != itemComposition3.inventoryActions) {
            for (int i = 0; i < 4; ++i) {
                itemComposition.inventoryActions[i] = itemComposition3.inventoryActions[i];
            }
        }
        itemComposition.inventoryActions[4] = Strings.al;
        itemComposition.price = 0;
    }
    
    public final ModelData bf(final int n) {
        if (null != this.countobj && n > 1) {
            int n2 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n >= this.countco[i] && this.countco[i] != 0) {
                    n2 = this.countobj[i];
                }
            }
            if (n2 != -1) {
                return HealthBarUpdate.set(n2, (byte)42).getModelData(1, -305031719);
            }
        }
        final ModelData modelData_get = ModelData.ModelData_get(ItemComposition.ItemDefinition_modelArchive, 2000117511 * this.model, 0);
        if (modelData_get == null) {
            return null;
        }
        if (this.resizeX * 614283261 != 128 || this.resizeY * 1552043943 != 128 || -302979231 * this.resizeZ != 128) {
            modelData_get.resize(this.resizeX * 614283261, this.resizeY * 1552043943, -302979231 * this.resizeZ);
        }
        if (this.recolorFrom != null) {
            for (int j = 0; j < this.recolorFrom.length; ++j) {
                ModelData.lm(modelData_get, this.recolorFrom[j], this.recolorTo[j]);
            }
        }
        if (null != this.retextureFrom) {
            for (int k = 0; k < this.retextureFrom.length; ++k) {
                ModelData.jw(modelData_get, this.retextureFrom[k], this.retextureTo[k]);
            }
        }
        return modelData_get;
    }
}
