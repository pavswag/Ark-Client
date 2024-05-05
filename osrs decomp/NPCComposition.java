import net.runelite.api.IterableHashTable;
import net.runelite.api.ParamHolder;

// 
// Decompiled by Procyon v0.5.36
// 

public class NPCComposition extends DualNode implements ParamHolder, net.runelite.api.NPCComposition
{
    static AbstractArchive field1559;
    static AbstractArchive NpcDefinition_archive;
    public int runBackSequence;
    static EvictingDualNodeHashTable NpcDefinition_cached;
    static EvictingDualNodeHashTable NpcDefinition_cachedModels;
    public int id;
    public String name;
    public boolean isClickable;
    int[] models;
    public int rotation;
    int heightScale;
    public int turnLeftSequence;
    public int turnRightSequence;
    public int walkSequence;
    public int walkBackSequence;
    public int walkLeftSequence;
    public int walkRightSequence;
    public int crawlSequence;
    public boolean isFollower;
    public int runLeftSequence;
    public short[] retextureTo;
    public boolean isVisible;
    public int crawlBackSequence;
    public int crawlLeftSequence;
    public int crawlRightSequence;
    short[] recolorFrom;
    int ambient;
    short[] retextureFrom;
    public short[] recolorTo;
    public String[] actions;
    public boolean drawMapDot;
    public int runRightSequence;
    int transformVarbit;
    int widthScale;
    IterableNodeHashTable params;
    public int size;
    public static final int af = 8;
    int transformVarp;
    public int[] transforms;
    public int combatLevel;
    int contrast;
    public boolean isInteractable;
    public int runSequence;
    public int idleSequence;
    int[] headIconArchiveIds;
    short[] headIconSpriteIndexes;
    int[] field1604;
    
    public String getName() {
        return this.name;
    }
    
    NPCComposition() {
        this.name = Strings.at;
        this.size = -1159021589;
        this.idleSequence = -1304162881;
        this.turnLeftSequence = -1526449071;
        this.turnRightSequence = -1325267127;
        this.walkSequence = -1653161499;
        this.walkBackSequence = 820247353;
        this.walkLeftSequence = -1030172671;
        this.walkRightSequence = 2142663477;
        this.runSequence = -1104808909;
        this.runBackSequence = 1535672631;
        this.runLeftSequence = 257868351;
        this.runRightSequence = 1734270145;
        this.crawlSequence = 237251001;
        this.crawlBackSequence = 1296177123;
        this.crawlLeftSequence = 2136803683;
        this.crawlRightSequence = -2044090389;
        this.actions = new String[5];
        this.drawMapDot = true;
        this.combatLevel = 959716425;
        this.transformVarbit = 1835076736;
        this.widthScale = 2129768832;
        this.isVisible = false;
        this.transformVarp = 0;
        this.heightScale = 0;
        this.rotation = -1472822432;
        this.ambient = -1998015621;
        this.contrast = -17057377;
        this.isInteractable = true;
        this.isClickable = true;
        this.isFollower = false;
        this.headIconArchiveIds = null;
        this.headIconSpriteIndexes = null;
    }
    
    static {
        NPCComposition.NpcDefinition_cached = new EvictingDualNodeHashTable(64);
        NPCComposition.NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
    }
    
    void ad() {
    }
    
    public String ba(final int n, final String s) {
        return EnumComposition.method1014(this.params, n, s, 1565555626);
    }
    
    void ae() {
    }
    
    public static ModelData cr(final NPCComposition npcComposition, final int[] array, final NewShit newShit) {
        if (npcComposition == null) {
            npcComposition.isFollower();
        }
        int[] field1555 = array;
        if (newShit != null && newShit.field1555 != null) {
            field1555 = newShit.field1555;
        }
        if (null == field1555) {
            return null;
        }
        boolean b = false;
        for (int i = 0; i < field1555.length; ++i) {
            if (field1555[i] != -1 && !NPCComposition.field1559.tryLoadFile(field1555[i], 0, (byte)24)) {
                b = true;
            }
        }
        if (b) {
            return null;
        }
        final ModelData[] array2 = new ModelData[field1555.length];
        for (int j = 0; j < field1555.length; ++j) {
            array2[j] = ModelData.ModelData_get(NPCComposition.field1559, field1555[j], 0);
        }
        ModelData modelData;
        if (array2.length == 1) {
            modelData = array2[0];
            if (null == modelData) {
                modelData = new ModelData(array2, array2.length);
            }
        }
        else {
            modelData = new ModelData(array2, array2.length);
        }
        if (null != npcComposition.recolorFrom) {
            short[] array3 = npcComposition.retextureTo;
            if (newShit != null && null != newShit.field1554) {
                array3 = newShit.field1554;
            }
            for (int k = 0; k < npcComposition.recolorFrom.length; ++k) {
                ModelData.lm(modelData, npcComposition.recolorFrom[k], array3[k]);
            }
        }
        if (npcComposition.retextureFrom != null) {
            short[] array4 = npcComposition.recolorTo;
            if (null != newShit && newShit.field1557 != null) {
                array4 = newShit.field1557;
            }
            for (int l = 0; l < npcComposition.retextureFrom.length; ++l) {
                ModelData.jw(modelData, npcComposition.retextureFrom[l], array4[l]);
            }
        }
        return modelData;
    }
    
    void bb(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, 1239995114);
        }
    }
    
    public short[] cn() {
        return this.headIconSpriteIndexes;
    }
    
    public String[] getActions() {
        return this.actions;
    }
    
    public int getId() {
        return this.id * -1115372301;
    }
    
    public int[] bw() {
        return this.headIconArchiveIds;
    }
    
    public void setValue(final int n, final String s) {
        this.tq(n, ScriptFrame.client.jh(s));
    }
    
    public void setValue(final int n, final int n2) {
        this.tq(n, ScriptFrame.client.xq(n2));
    }
    
    public String getStringParam(final int n, final String s, final int n2) {
        try {
            return EnumComposition.method1014(this.params, n, s, 2050135786);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.ao(" + ')');
        }
    }
    
    public int getSize() {
        return this.size * 1458410691;
    }
    
    public final NPCComposition transform(final int n) {
        try {
            int expandBounds = -1;
            if (-1 != 1781845069 * this.heightScale) {
                if (n == -151833963) {
                    throw new IllegalStateException();
                }
                expandBounds = class252.expandBounds(1781845069 * this.ambient, 1327767157);
            }
            else if (2051988897 * this.contrast != -1) {
                if (n == -151833963) {
                    throw new IllegalStateException();
                }
                expandBounds = Varps.Varps_temp[this.transformVarbit * 2051988897];
            }
            while (true) {
                Label_0150: {
                    if (expandBounds < 0) {
                        break Label_0150;
                    }
                    if (n == -151833963) {
                        throw new IllegalStateException();
                    }
                    int n2;
                    if (expandBounds >= this.transforms.length - 1) {
                        if (n == -151833963) {
                            throw new IllegalStateException();
                        }
                        break Label_0150;
                    }
                    else {
                        n2 = this.transforms[expandBounds];
                    }
                    if (n2 != -1) {
                        return AbstractArchive.getNpcDefinition(n2, (byte)(-7));
                    }
                    return null;
                }
                int n2 = this.transforms[this.transforms.length - 1];
                continue;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.at(" + ')');
        }
    }
    
    public static NPCComposition ak(final int n) {
        final NPCComposition npcComposition = (NPCComposition)NPCComposition.NpcDefinition_cached.wr(n);
        if (null != npcComposition) {
            return npcComposition;
        }
        final byte[] takeFile = NPCComposition.NpcDefinition_archive.takeFile(9, n, (byte)(-109));
        final NPCComposition npcComposition2 = new NPCComposition();
        npcComposition2.id = 1690060341 * n;
        if (null != takeFile) {
            npcComposition2.decode(new Buffer(takeFile), 820852104);
        }
        npcComposition2.postDecode(835833293);
        NPCComposition.NpcDefinition_cached.put(npcComposition2, n);
        return npcComposition2;
    }
    
    public short[] method1031(final int n) {
        try {
            return this.headIconSpriteIndexes;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.av(" + ')');
        }
    }
    
    public static void as(final AbstractArchive npcDefinition_archive, final AbstractArchive field1559) {
        NPCComposition.NpcDefinition_archive = npcDefinition_archive;
        NPCComposition.field1559 = field1559;
    }
    
    public static void fk(final NPCComposition npcComposition) {
        if (npcComposition == null) {
            npcComposition.getCombatLevel();
        }
    }
    
    public static NPCComposition az(final int n) {
        final NPCComposition npcComposition = (NPCComposition)NPCComposition.NpcDefinition_cached.wr(n);
        if (null != npcComposition) {
            return npcComposition;
        }
        final byte[] takeFile = NPCComposition.NpcDefinition_archive.takeFile(9, n, (byte)(-11));
        final NPCComposition npcComposition2 = new NPCComposition();
        npcComposition2.id = -1772751813 * n;
        if (null != takeFile) {
            npcComposition2.decode(new Buffer(takeFile), -1554941598);
        }
        npcComposition2.postDecode(835833293);
        NPCComposition.NpcDefinition_cached.put(npcComposition2, n);
        return npcComposition2;
    }
    
    public int getIntParam(final int n, final int n2, final int n3) {
        try {
            final IterableNodeHashTable params = this.params;
            int integer;
            if (null == params) {
                if (n3 <= 1337101604) {
                    throw new IllegalStateException();
                }
                integer = n2;
            }
            else {
                final IntegerNode integerNode = (IntegerNode)params.aa(n);
                if (null == integerNode) {
                    if (n3 <= 1337101604) {
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
            throw HealthBar.get(ex, "hs.ay(" + ')');
        }
    }
    
    public boolean rp() {
        return null != this.headIconArchiveIds && this.headIconSpriteIndexes != null;
    }
    
    public static ModelData pr(final NPCComposition npcComposition, final NewShit newShit) {
        if (null == npcComposition.transforms) {
            return bu(npcComposition, npcComposition.field1604, newShit, -1568808377);
        }
        final NPCComposition ur = ur(npcComposition, 2141022628);
        if (null == ur) {
            return null;
        }
        return ur.method1022(newShit, (byte)64);
    }
    
    void bi(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, 1239995114);
        }
    }
    
    public String bv(final int n, final String s) {
        return EnumComposition.method1014(this.params, n, s, 2108161937);
    }
    
    public short ck(final int n) {
        if (null != this.headIconSpriteIndexes && n < this.headIconSpriteIndexes.length) {
            return this.headIconSpriteIndexes[n];
        }
        return -1;
    }
    
    public final Model bo(final SequenceDefinition sequenceDefinition, final int n, final SequenceDefinition sequenceDefinition2, final int n2, final NewShit newShit) {
        if (null == this.transforms) {
            long n3 = this.id * -1115372301;
            if (null != newShit) {
                n3 |= -1176524468931644747L * newShit.field1556 << 16;
            }
            Model dg = (Model)NPCComposition.NpcDefinition_cachedModels.wr(n3);
            if (dg == null) {
                final ModelData bu = bu(this, this.models, newShit, -474003824);
                if (bu == null) {
                    return null;
                }
                dg = bu.dg(64 + this.transformVarp * -1500709613, this.heightScale * -2057653211 + 850, -30, -50, -30);
                NPCComposition.NpcDefinition_cachedModels.put(dg, n3);
            }
            Model model;
            if (null != sequenceDefinition && sequenceDefinition2 != null) {
                model = sequenceDefinition.applyTransformations(dg, n, sequenceDefinition2, n2, 1822154193);
            }
            else if (sequenceDefinition != null) {
                model = sequenceDefinition.transformActorModel(dg, n, (byte)(-30));
            }
            else if (sequenceDefinition2 != null) {
                model = sequenceDefinition2.transformActorModel(dg, n2, (byte)(-52));
            }
            else {
                model = dg.toSharedSequenceModel(true);
            }
            if (this.transformVarbit * 1661958697 != 128 || this.widthScale * 521320011 != 128) {
                model.scale(this.transformVarbit * 1661958697, this.widthScale * 521320011, 1661958697 * this.transformVarbit);
            }
            return model;
        }
        final NPCComposition ur = ur(this, -78792425);
        if (ur == null) {
            return null;
        }
        return ur.method1021(sequenceDefinition, n, sequenceDefinition2, n2, newShit, (byte)115);
    }
    
    public Node cc(final int n) {
        if (this.getParams() == null) {
            return null;
        }
        return (Node)this.getParams().get((long)n);
    }
    
    public int cc(final int n) {
        if (null == this.headIconArchiveIds || n >= this.headIconArchiveIds.length) {
            return -1;
        }
        return this.headIconArchiveIds[n];
    }
    
    public boolean bc() {
        return null != this.headIconArchiveIds && this.headIconSpriteIndexes != null;
    }
    
    public static boolean ia(final NPCComposition npcComposition) {
        return null != npcComposition.headIconArchiveIds && npcComposition.headIconSpriteIndexes != null;
    }
    
    ModelData br(final int[] array, final NewShit newShit) {
        int[] field1555 = array;
        if (newShit != null && newShit.field1555 != null) {
            field1555 = newShit.field1555;
        }
        if (null == field1555) {
            return null;
        }
        int n = 0;
        for (int i = 0; i < field1555.length; ++i) {
            if (field1555[i] != -1 && !NPCComposition.field1559.tryLoadFile(field1555[i], 0, (byte)14)) {
                n = 1;
            }
        }
        if (n != 0) {
            return null;
        }
        final ModelData[] array2 = new ModelData[field1555.length];
        for (int j = 0; j < field1555.length; ++j) {
            array2[j] = ModelData.ModelData_get(NPCComposition.field1559, field1555[j], 0);
        }
        ModelData modelData;
        if (array2.length == 1) {
            modelData = array2[0];
            if (null == modelData) {
                modelData = new ModelData(array2, array2.length);
            }
        }
        else {
            modelData = new ModelData(array2, array2.length);
        }
        if (null != this.recolorFrom) {
            short[] array3 = this.retextureTo;
            if (newShit != null && null != newShit.field1554) {
                array3 = newShit.field1554;
            }
            for (int k = 0; k < this.recolorFrom.length; ++k) {
                ModelData.lm(modelData, this.recolorFrom[k], array3[k]);
            }
        }
        if (this.retextureFrom != null) {
            short[] array4 = this.recolorTo;
            if (null != newShit && newShit.field1557 != null) {
                array4 = newShit.field1557;
            }
            for (int l = 0; l < this.retextureFrom.length; ++l) {
                ModelData.jw(modelData, this.retextureFrom[l], array4[l]);
            }
        }
        return modelData;
    }
    
    public int[] ci() {
        return this.headIconArchiveIds;
    }
    
    void postDecode(final int n) {
    }
    
    public static void am(final AbstractArchive npcDefinition_archive, final AbstractArchive field1559) {
        NPCComposition.NpcDefinition_archive = npcDefinition_archive;
        NPCComposition.field1559 = field1559;
    }
    
    ModelData method1023(final int[] array, final NewShit newShit, final int n) {
        try {
            int[] field1555 = array;
            if (newShit != null) {
                if (n >= 232011844) {
                    throw new IllegalStateException();
                }
                if (newShit.field1555 != null) {
                    if (n >= 232011844) {
                        throw new IllegalStateException();
                    }
                    field1555 = newShit.field1555;
                }
            }
            if (null == field1555) {
                if (n >= 232011844) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                int n2 = 0;
                for (int i = 0; i < field1555.length; ++i) {
                    if (n >= 232011844) {
                        throw new IllegalStateException();
                    }
                    if (field1555[i] != -1 && !NPCComposition.NpcDefinition_archive.tryLoadFile(field1555[i], 0, (byte)(-42))) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        n2 = 1;
                    }
                }
                if (n2 == 0) {
                    final ModelData[] array2 = new ModelData[field1555.length];
                    for (int j = 0; j < field1555.length; ++j) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        array2[j] = ModelData.ModelData_get(NPCComposition.field1559, field1555[j], 0);
                    }
                    ModelData modelData;
                    if (array2.length == 1) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        modelData = array2[0];
                        if (null == modelData) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            modelData = new ModelData(array2, array2.length);
                        }
                    }
                    else {
                        modelData = new ModelData(array2, array2.length);
                    }
                    if (null != this.recolorFrom) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        short[] array3 = this.recolorTo;
                        if (newShit != null && null != newShit.field1557) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            array3 = newShit.field1557;
                        }
                        for (int k = 0; k < this.headIconSpriteIndexes.length; ++k) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            ModelData.lm(modelData, this.recolorFrom[k], array3[k]);
                        }
                    }
                    if (this.recolorFrom != null) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        short[] array4 = this.recolorTo;
                        if (null != newShit && newShit.field1557 != null) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            array4 = newShit.field1554;
                        }
                        for (int l = 0; l < this.headIconSpriteIndexes.length; ++l) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            ModelData.jw(modelData, this.headIconSpriteIndexes[l], array4[l]);
                        }
                    }
                    return modelData;
                }
                if (n >= 232011844) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.al(" + ')');
        }
    }
    
    public short[] cu() {
        return this.headIconSpriteIndexes;
    }
    
    void decode(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, 1239995114);
            }
            if (n == -1039397390) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.ac(" + ')');
        }
    }
    
    public static NPCComposition ur(final NPCComposition npcComposition, final int n) {
        if (npcComposition == null) {
            return npcComposition.transform(n);
        }
        try {
            int expandBounds = -1;
            if (-1 != 1781845069 * npcComposition.ambient) {
                if (n == -151833963) {
                    throw new IllegalStateException();
                }
                expandBounds = class252.expandBounds(1781845069 * npcComposition.ambient, 1327767157);
            }
            else if (2051988897 * npcComposition.contrast != -1) {
                if (n == -151833963) {
                    throw new IllegalStateException();
                }
                expandBounds = Varps.Varps_main[npcComposition.contrast * 2051988897];
            }
            while (true) {
                Label_0160: {
                    if (expandBounds < 0) {
                        break Label_0160;
                    }
                    if (n == -151833963) {
                        throw new IllegalStateException();
                    }
                    int n2;
                    if (expandBounds >= npcComposition.transforms.length - 1) {
                        if (n == -151833963) {
                            throw new IllegalStateException();
                        }
                        break Label_0160;
                    }
                    else {
                        n2 = npcComposition.transforms[expandBounds];
                    }
                    if (n2 != -1) {
                        return AbstractArchive.getNpcDefinition(n2, (byte)(-7));
                    }
                    return null;
                }
                int n2 = npcComposition.transforms[npcComposition.transforms.length - 1];
                continue;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.at(" + ')');
        }
    }
    
    public static boolean cx(final NPCComposition npcComposition) {
        if (npcComposition.transforms == null) {
            return true;
        }
        int expandBounds = -1;
        if (-1 != npcComposition.ambient * 687827384) {
            expandBounds = class252.expandBounds(npcComposition.ambient * 1948515912, 1769373465);
        }
        else if (-1 != -1723557293 * npcComposition.contrast) {
            expandBounds = Varps.Varps_main[-956688706 * npcComposition.contrast];
        }
        if (expandBounds >= 0 && expandBounds < npcComposition.transforms.length) {
            return -1 != npcComposition.transforms[expandBounds];
        }
        return npcComposition.transforms[npcComposition.transforms.length - 1] != -1;
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2) {
        try {
            if (1 == n) {
                final int ra = Buffer.ra(buffer, (byte)7);
                this.models = new int[ra];
                for (int i = 0; i < ra; ++i) {
                    if (n2 != 1239995114) {
                        return;
                    }
                    this.models[i] = buffer.readUnsignedShort(-2100232755);
                }
            }
            else if (2 == n) {
                this.name = buffer.readStringCp1252NullTerminated((byte)0);
            }
            else if (n == 12) {
                if (n2 != 1239995114) {
                    return;
                }
                this.size = Buffer.ra(buffer, (byte)7) * -1159021589;
            }
            else if (13 == n) {
                if (n2 != 1239995114) {
                    throw new IllegalStateException();
                }
                this.idleSequence = buffer.readUnsignedShort(-904811108) * 1304162881;
            }
            else if (n == 14) {
                if (n2 != 1239995114) {
                    return;
                }
                this.walkSequence = buffer.readUnsignedShort(-1419288290) * 1653161499;
            }
            else if (n == 15) {
                if (n2 != 1239995114) {
                    throw new IllegalStateException();
                }
                this.turnLeftSequence = buffer.readUnsignedShort(-1612558063) * 1526449071;
            }
            else if (16 == n) {
                if (n2 != 1239995114) {
                    return;
                }
                this.turnRightSequence = buffer.readUnsignedShort(-1494231735) * 1325267127;
            }
            else if (n == 17) {
                if (n2 != 1239995114) {
                    return;
                }
                this.walkSequence = buffer.readUnsignedShort(-445007973) * 1653161499;
                this.walkBackSequence = buffer.readUnsignedShort(-1404207838) * -820247353;
                this.walkLeftSequence = buffer.readUnsignedShort(-1177976083) * 1030172671;
                this.walkRightSequence = buffer.readUnsignedShort(-1533431757) * -2142663477;
            }
            else if (n == 18) {
                if (n2 != 1239995114) {
                    throw new IllegalStateException();
                }
                buffer.readUnsignedShort(-2086827712);
            }
            else {
                if (n >= 30) {
                    if (n2 != 1239995114) {
                        throw new IllegalStateException();
                    }
                    if (n < 35) {
                        this.actions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
                        if (!this.actions[n - 30].equalsIgnoreCase(Strings.ac)) {
                            return;
                        }
                        if (n2 != 1239995114) {
                            throw new IllegalStateException();
                        }
                        this.actions[n - 30] = null;
                        return;
                    }
                }
                if (40 == n) {
                    if (n2 != 1239995114) {
                        throw new IllegalStateException();
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    this.recolorFrom = new short[ra2];
                    this.retextureTo = new short[ra2];
                    for (int j = 0; j < ra2; ++j) {
                        if (n2 != 1239995114) {
                            throw new IllegalStateException();
                        }
                        this.recolorFrom[j] = (short)buffer.readUnsignedShort(-1155165947);
                        this.retextureTo[j] = (short)buffer.readUnsignedShort(-1855735589);
                    }
                }
                else if (41 == n) {
                    if (n2 != 1239995114) {
                        throw new IllegalStateException();
                    }
                    final int ra3 = Buffer.ra(buffer, (byte)7);
                    this.retextureFrom = new short[ra3];
                    this.recolorTo = new short[ra3];
                    for (int k = 0; k < ra3; ++k) {
                        if (n2 != 1239995114) {
                            throw new IllegalStateException();
                        }
                        this.retextureFrom[k] = (short)buffer.readUnsignedShort(369350520);
                        this.recolorTo[k] = (short)buffer.readUnsignedShort(-341444843);
                    }
                }
                else if (60 == n) {
                    if (n2 != 1239995114) {
                        return;
                    }
                    final int ra4 = Buffer.ra(buffer, (byte)7);
                    this.field1604 = new int[ra4];
                    for (int l = 0; l < ra4; ++l) {
                        if (n2 != 1239995114) {
                            return;
                        }
                        this.field1604[l] = buffer.readUnsignedShort(-1257942048);
                    }
                }
                else if (93 == n) {
                    this.drawMapDot = false;
                }
                else if (95 == n) {
                    this.combatLevel = buffer.readUnsignedShort(-921873820) * -959716425;
                }
                else if (97 == n) {
                    this.transformVarbit = buffer.readUnsignedShort(218480925) * 1121632793;
                }
                else if (n == 98) {
                    if (n2 != 1239995114) {
                        throw new IllegalStateException();
                    }
                    this.widthScale = buffer.readUnsignedShort(-664859366) * 889054051;
                }
                else if (n == 99) {
                    if (n2 != 1239995114) {
                        throw new IllegalStateException();
                    }
                    this.isVisible = true;
                }
                else if (100 == n) {
                    if (n2 != 1239995114) {
                        throw new IllegalStateException();
                    }
                    this.transformVarp = Buffer.wu(buffer, 435772489) * 1774081307;
                }
                else if (n == 101) {
                    if (n2 != 1239995114) {
                        throw new IllegalStateException();
                    }
                    this.heightScale = Buffer.wu(buffer, 435772489) * 352282209;
                }
                else if (102 == n) {
                    if (n2 != 1239995114) {
                        throw new IllegalStateException();
                    }
                    final int ra5 = Buffer.ra(buffer, (byte)7);
                    int n3 = 0;
                    for (int n4 = ra5; n4; n4 >>= 1) {
                        ++n3;
                    }
                    this.headIconArchiveIds = new int[n3];
                    this.headIconSpriteIndexes = new short[n3];
                    for (int n5 = 0; n5 < n3; ++n5) {
                        if (n2 != 1239995114) {
                            throw new IllegalStateException();
                        }
                        if ((ra5 & 1 << n5) == 0x0) {
                            if (n2 != 1239995114) {
                                throw new IllegalStateException();
                            }
                            this.headIconArchiveIds[n5] = -1;
                            this.headIconSpriteIndexes[n5] = -1;
                        }
                        else {
                            this.headIconArchiveIds[n5] = buffer.method2516(1833245645);
                            this.headIconSpriteIndexes[n5] = (short)buffer.method2491(1556461715);
                        }
                    }
                }
                else if (n == 103) {
                    this.rotation = buffer.readUnsignedShort(-729475099) * 222409755;
                }
                else {
                    if (n != 106) {
                        if (n2 != 1239995114) {
                            throw new IllegalStateException();
                        }
                        if (n == 118) {
                            if (n2 != 1239995114) {
                                throw new IllegalStateException();
                            }
                        }
                        else if (107 == n) {
                            if (n2 != 1239995114) {
                                return;
                            }
                            this.isInteractable = false;
                            return;
                        }
                        else if (109 == n) {
                            if (n2 != 1239995114) {
                                return;
                            }
                            this.isClickable = false;
                            return;
                        }
                        else if (n == 111) {
                            if (n2 != 1239995114) {
                                throw new IllegalStateException();
                            }
                            this.isFollower = true;
                            return;
                        }
                        else if (114 == n) {
                            if (n2 != 1239995114) {
                                throw new IllegalStateException();
                            }
                            this.runSequence = buffer.readUnsignedShort(-395680091) * 1104808909;
                            return;
                        }
                        else {
                            if (n == 115) {
                                this.runSequence = buffer.readUnsignedShort(162063926) * 1104808909;
                                this.runBackSequence = buffer.readUnsignedShort(-878004914) * -1535672631;
                                this.runLeftSequence = buffer.readUnsignedShort(-1771051347) * -257868351;
                                this.runRightSequence = buffer.readUnsignedShort(-615033747) * -1734270145;
                                return;
                            }
                            if (n == 116) {
                                if (n2 != 1239995114) {
                                    throw new IllegalStateException();
                                }
                                this.crawlSequence = buffer.readUnsignedShort(-623111045) * -237251001;
                                return;
                            }
                            else if (117 == n) {
                                if (n2 != 1239995114) {
                                    return;
                                }
                                this.crawlSequence = buffer.readUnsignedShort(-1264186533) * -237251001;
                                this.crawlBackSequence = buffer.readUnsignedShort(-1701731002) * -1296177123;
                                this.crawlLeftSequence = buffer.readUnsignedShort(790398941) * -2136803683;
                                this.crawlRightSequence = buffer.readUnsignedShort(-616002619) * 2044090389;
                                return;
                            }
                            else {
                                if (249 != n) {
                                    return;
                                }
                                if (n2 != 1239995114) {
                                    throw new IllegalStateException();
                                }
                                this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-119));
                                return;
                            }
                        }
                    }
                    this.ambient = buffer.readUnsignedShort(-806120087) * 1998015621;
                    if (65535 == this.ambient * 1781845069) {
                        this.ambient = -1998015621;
                    }
                    this.contrast = buffer.readUnsignedShort(405222555) * 17057377;
                    if (this.contrast * 2051988897 == 65535) {
                        this.contrast = -17057377;
                    }
                    int unsignedShort = -1;
                    if (n == 118) {
                        if (n2 != 1239995114) {
                            throw new IllegalStateException();
                        }
                        unsignedShort = buffer.readUnsignedShort(-484172177);
                        if (unsignedShort == 65535) {
                            if (n2 != 1239995114) {
                                throw new IllegalStateException();
                            }
                            unsignedShort = -1;
                        }
                    }
                    final int ra6 = Buffer.ra(buffer, (byte)7);
                    this.transforms = new int[ra6 + 2];
                    for (int n6 = 0; n6 <= ra6; ++n6) {
                        if (n2 != 1239995114) {
                            throw new IllegalStateException();
                        }
                        this.transforms[n6] = buffer.readUnsignedShort(461707673);
                        if (this.transforms[n6] == 65535) {
                            if (n2 != 1239995114) {
                                throw new IllegalStateException();
                            }
                            this.transforms[n6] = -1;
                        }
                    }
                    this.transforms[ra6 + 1] = unsignedShort;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.au(" + ')');
        }
    }
    
    public boolean transformIsVisible(final int n) {
        try {
            if (this.transforms == null) {
                return true;
            }
            int expandBounds = -1;
            if (-1 != this.ambient * 1781845069) {
                if (n != 41635170) {
                    throw new IllegalStateException();
                }
                expandBounds = class252.expandBounds(this.ambient * 1781845069, 2042454646);
            }
            else if (-1 != 2051988897 * this.contrast) {
                if (n != 41635170) {
                    throw new IllegalStateException();
                }
                expandBounds = Varps.Varps_main[2051988897 * this.contrast];
            }
            if (expandBounds >= 0) {
                if (n != 41635170) {
                    throw new IllegalStateException();
                }
                if (expandBounds < this.transforms.length) {
                    boolean b;
                    if (-1 != this.transforms[expandBounds]) {
                        if (n != 41635170) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    return b;
                }
                if (n != 41635170) {
                    throw new IllegalStateException();
                }
            }
            boolean b2;
            if (this.transforms[this.transforms.length - 1] != -1) {
                if (n != 41635170) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.aa(" + ')');
        }
    }
    
    public IterableHashTable getParams() {
        return (IterableHashTable)this.params;
    }
    
    public boolean method1028(final byte b) {
        try {
            if (null == this.headIconArchiveIds) {
                return false;
            }
            if (b == 1) {
                throw new IllegalStateException();
            }
            if (this.headIconSpriteIndexes == null) {
                return false;
            }
            return true;
            b2 = false;
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.ai(" + ')');
        }
    }
    
    public boolean bh() {
        return this.isFollower;
    }
    
    void bx(final Buffer buffer, final int n) {
        if (1 == n) {
            final int ra = Buffer.ra(buffer, (byte)7);
            this.models = new int[ra];
            for (int i = 0; i < ra; ++i) {
                this.models[i] = buffer.readUnsignedShort(-1018158192);
            }
        }
        else if (2 == n) {
            this.name = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 12) {
            this.size = Buffer.ra(buffer, (byte)7) * -1159021589;
        }
        else if (13 == n) {
            this.idleSequence = buffer.readUnsignedShort(826463277) * 1304162881;
        }
        else if (n == 14) {
            this.walkSequence = buffer.readUnsignedShort(616105518) * 1653161499;
        }
        else if (n == 15) {
            this.turnLeftSequence = buffer.readUnsignedShort(50443142) * 1526449071;
        }
        else if (16 == n) {
            this.turnRightSequence = buffer.readUnsignedShort(-1434189947) * 1325267127;
        }
        else if (n == 17) {
            this.walkSequence = buffer.readUnsignedShort(-455008624) * 1653161499;
            this.walkBackSequence = buffer.readUnsignedShort(-36248169) * -820247353;
            this.walkLeftSequence = buffer.readUnsignedShort(310594717) * 1030172671;
            this.walkRightSequence = buffer.readUnsignedShort(729629386) * -2142663477;
        }
        else if (n == 18) {
            buffer.readUnsignedShort(-1189509331);
        }
        else if (n >= 30 && n < 35) {
            this.actions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
            if (this.actions[n - 30].equalsIgnoreCase(Strings.ac)) {
                this.actions[n - 30] = null;
            }
        }
        else if (40 == n) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            this.recolorFrom = new short[ra2];
            this.retextureTo = new short[ra2];
            for (int j = 0; j < ra2; ++j) {
                this.recolorFrom[j] = (short)buffer.readUnsignedShort(727515947);
                this.retextureTo[j] = (short)buffer.readUnsignedShort(170037496);
            }
        }
        else if (41 == n) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            this.retextureFrom = new short[ra3];
            this.recolorTo = new short[ra3];
            for (int k = 0; k < ra3; ++k) {
                this.retextureFrom[k] = (short)buffer.readUnsignedShort(-1419699102);
                this.recolorTo[k] = (short)buffer.readUnsignedShort(-931579295);
            }
        }
        else if (60 == n) {
            final int ra4 = Buffer.ra(buffer, (byte)7);
            this.field1604 = new int[ra4];
            for (int l = 0; l < ra4; ++l) {
                this.field1604[l] = buffer.readUnsignedShort(-189852077);
            }
        }
        else if (93 == n) {
            this.drawMapDot = false;
        }
        else if (95 == n) {
            this.combatLevel = buffer.readUnsignedShort(366471690) * -959716425;
        }
        else if (97 == n) {
            this.transformVarbit = buffer.readUnsignedShort(828325951) * 1121632793;
        }
        else if (n == 98) {
            this.widthScale = buffer.readUnsignedShort(-268916280) * 889054051;
        }
        else if (n == 99) {
            this.isVisible = true;
        }
        else if (100 == n) {
            this.transformVarp = Buffer.wu(buffer, 435772489) * 1774081307;
        }
        else if (n == 101) {
            this.heightScale = Buffer.wu(buffer, 435772489) * 352282209;
        }
        else if (102 == n) {
            final int ra5 = Buffer.ra(buffer, (byte)7);
            int n2 = 0;
            for (int n3 = ra5; n3; n3 >>= 1) {
                ++n2;
            }
            this.headIconArchiveIds = new int[n2];
            this.headIconSpriteIndexes = new short[n2];
            for (int n4 = 0; n4 < n2; ++n4) {
                if ((ra5 & 1 << n4) == 0x0) {
                    this.headIconArchiveIds[n4] = -1;
                    this.headIconSpriteIndexes[n4] = -1;
                }
                else {
                    this.headIconArchiveIds[n4] = buffer.method2516(48913718);
                    this.headIconSpriteIndexes[n4] = (short)buffer.method2491(23994444);
                }
            }
        }
        else if (n == 103) {
            this.rotation = buffer.readUnsignedShort(-1154456421) * 222409755;
        }
        else if (n == 106 || n == 118) {
            this.ambient = buffer.readUnsignedShort(-1692955011) * 1998015621;
            if (65535 == this.ambient * 1781845069) {
                this.ambient = -1998015621;
            }
            this.contrast = buffer.readUnsignedShort(794974729) * 17057377;
            if (this.contrast * 2051988897 == 65535) {
                this.contrast = -17057377;
            }
            int unsignedShort = -1;
            if (n == 118) {
                unsignedShort = buffer.readUnsignedShort(-137085147);
                if (unsignedShort == 65535) {
                    unsignedShort = -1;
                }
            }
            final int ra6 = Buffer.ra(buffer, (byte)7);
            this.transforms = new int[ra6 + 2];
            for (int n5 = 0; n5 <= ra6; ++n5) {
                this.transforms[n5] = buffer.readUnsignedShort(-148560033);
                if (this.transforms[n5] == 65535) {
                    this.transforms[n5] = -1;
                }
            }
            this.transforms[ra6 + 1] = unsignedShort;
        }
        else if (107 == n) {
            this.isInteractable = false;
        }
        else if (109 == n) {
            this.isClickable = false;
        }
        else if (n == 111) {
            this.isFollower = true;
        }
        else if (114 == n) {
            this.runSequence = buffer.readUnsignedShort(763936612) * 1104808909;
        }
        else if (n == 115) {
            this.runSequence = buffer.readUnsignedShort(-1169885217) * 1104808909;
            this.runBackSequence = buffer.readUnsignedShort(-834728897) * -1535672631;
            this.runLeftSequence = buffer.readUnsignedShort(-1684453691) * -257868351;
            this.runRightSequence = buffer.readUnsignedShort(-153601964) * -1734270145;
        }
        else if (n == 116) {
            this.crawlSequence = buffer.readUnsignedShort(223206250) * -237251001;
        }
        else if (117 == n) {
            this.crawlSequence = buffer.readUnsignedShort(-696610542) * -237251001;
            this.crawlBackSequence = buffer.readUnsignedShort(-525564982) * -1296177123;
            this.crawlLeftSequence = buffer.readUnsignedShort(-1649221137) * -2136803683;
            this.crawlRightSequence = buffer.readUnsignedShort(630607023) * 2044090389;
        }
        else if (249 == n) {
            this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-68));
        }
    }
    
    public short method1032(final int n, final int n2) {
        try {
            if (null != this.headIconSpriteIndexes) {
                if (n2 == 1939708877) {
                    throw new IllegalStateException();
                }
                if (n < this.headIconSpriteIndexes.length) {
                    return this.headIconSpriteIndexes[n];
                }
                if (n2 == 1939708877) {
                    throw new IllegalStateException();
                }
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.ar(" + ')');
        }
    }
    
    public final ModelData bd(final NewShit newShit) {
        if (null == this.transforms) {
            return bu(this, this.field1604, newShit, -766298677);
        }
        final NPCComposition ur = ur(this, 327568817);
        if (null == ur) {
            return null;
        }
        return ur.method1022(newShit, (byte)64);
    }
    
    public short cm(final int n) {
        if (null != this.headIconSpriteIndexes && n < this.headIconSpriteIndexes.length) {
            return this.headIconSpriteIndexes[n];
        }
        return -1;
    }
    
    ModelData bg(final int[] array, final NewShit newShit) {
        int[] field1555 = array;
        if (newShit != null && newShit.field1555 != null) {
            field1555 = newShit.field1555;
        }
        if (null == field1555) {
            return null;
        }
        int n = 0;
        for (int i = 0; i < field1555.length; ++i) {
            if (field1555[i] != -1 && !NPCComposition.field1559.tryLoadFile(field1555[i], 0, (byte)63)) {
                n = 1;
            }
        }
        if (n != 0) {
            return null;
        }
        final ModelData[] array2 = new ModelData[field1555.length];
        for (int j = 0; j < field1555.length; ++j) {
            array2[j] = ModelData.ModelData_get(NPCComposition.field1559, field1555[j], 0);
        }
        ModelData modelData;
        if (array2.length == 1) {
            modelData = array2[0];
            if (null == modelData) {
                modelData = new ModelData(array2, array2.length);
            }
        }
        else {
            modelData = new ModelData(array2, array2.length);
        }
        if (null != this.recolorFrom) {
            short[] array3 = this.retextureTo;
            if (newShit != null && null != newShit.field1554) {
                array3 = newShit.field1554;
            }
            for (int k = 0; k < this.recolorFrom.length; ++k) {
                ModelData.lm(modelData, this.recolorFrom[k], array3[k]);
            }
        }
        if (this.retextureFrom != null) {
            short[] array4 = this.recolorTo;
            if (null != newShit && newShit.field1557 != null) {
                array4 = newShit.field1557;
            }
            for (int l = 0; l < this.retextureFrom.length; ++l) {
                ModelData.jw(modelData, this.retextureFrom[l], array4[l]);
            }
        }
        return modelData;
    }
    
    public boolean isVisible() {
        return this.isVisible;
    }
    
    public static String vy(final NPCComposition npcComposition, final int n, final String s, final int n2) {
        if (npcComposition == null) {
            return npcComposition.getStringParam(n, s, n);
        }
        try {
            return EnumComposition.method1014(npcComposition.params, n, s, 2050135786);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.ao(" + ')');
        }
    }
    
    public static void pg(final NPCComposition npcComposition, final Buffer buffer) {
        if (npcComposition == null) {
            npcComposition.isFollower();
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            npcComposition.decodeNext(buffer, ra, 1239995114);
        }
    }
    
    ModelData bn(final int[] array, final NewShit newShit) {
        int[] field1555 = array;
        if (newShit != null && newShit.field1555 != null) {
            field1555 = newShit.field1555;
        }
        if (null == field1555) {
            return null;
        }
        boolean b = false;
        for (int i = 0; i < field1555.length; ++i) {
            if (field1555[i] != -1 && !NPCComposition.field1559.tryLoadFile(field1555[i], 0, (byte)6)) {
                b = true;
            }
        }
        if (b) {
            return null;
        }
        final ModelData[] array2 = new ModelData[field1555.length];
        for (int j = 0; j < field1555.length; ++j) {
            array2[j] = ModelData.ModelData_get(NPCComposition.field1559, field1555[j], 0);
        }
        ModelData modelData;
        if (array2.length == 1) {
            modelData = array2[0];
            if (null == modelData) {
                modelData = new ModelData(array2, array2.length);
            }
        }
        else {
            modelData = new ModelData(array2, array2.length);
        }
        if (null != this.recolorFrom) {
            short[] array3 = this.retextureTo;
            if (newShit != null && null != newShit.field1554) {
                array3 = newShit.field1554;
            }
            for (int k = 0; k < this.recolorFrom.length; ++k) {
                ModelData.lm(modelData, this.recolorFrom[k], array3[k]);
            }
        }
        if (this.retextureFrom != null) {
            short[] array4 = this.recolorTo;
            if (null != newShit && newShit.field1557 != null) {
                array4 = newShit.field1557;
            }
            for (int l = 0; l < this.retextureFrom.length; ++l) {
                ModelData.jw(modelData, this.retextureFrom[l], array4[l]);
            }
        }
        return modelData;
    }
    
    public final Model method1021(final SequenceDefinition sequenceDefinition, final int n, final SequenceDefinition sequenceDefinition2, final int n2, final NewShit newShit, final byte b) {
        try {
            if (null == this.transforms) {
                long n3 = this.id * -1115372301;
                if (null != newShit) {
                    if (b == 11) {
                        throw new IllegalStateException();
                    }
                    n3 |= -1176524468931644747L * newShit.field1556 << 16;
                }
                Model dg = (Model)NPCComposition.NpcDefinition_cachedModels.wr(n3);
                if (dg == null) {
                    if (b == 11) {
                        throw new IllegalStateException();
                    }
                    final ModelData bu = bu(this, this.models, newShit, -417083855);
                    if (bu == null) {
                        return null;
                    }
                    dg = bu.dg(64 + this.transformVarp * -1500709613, this.heightScale * -2057653211 + 850, -30, -50, -30);
                    NPCComposition.NpcDefinition_cachedModels.put(dg, n3);
                }
                Model model = null;
                Label_0378: {
                    if (null != sequenceDefinition) {
                        if (b == 11) {
                            throw new IllegalStateException();
                        }
                        if (sequenceDefinition2 != null) {
                            if (b == 11) {
                                throw new IllegalStateException();
                            }
                            model = sequenceDefinition.applyTransformations(dg, n, sequenceDefinition2, n2, 1923165788);
                            break Label_0378;
                        }
                    }
                    if (sequenceDefinition != null) {
                        if (b == 11) {
                            throw new IllegalStateException();
                        }
                        model = sequenceDefinition.transformActorModel(dg, n, (byte)(-23));
                    }
                    else if (sequenceDefinition2 != null) {
                        if (b == 11) {
                            throw new IllegalStateException();
                        }
                        model = sequenceDefinition2.transformActorModel(dg, n2, (byte)(-89));
                    }
                    else {
                        model = dg.toSharedSequenceModel(true);
                    }
                }
                if (this.transformVarbit * 1661958697 == 128) {
                    if (this.widthScale * 521320011 == 128) {
                        return model;
                    }
                    if (b == 11) {
                        throw new IllegalStateException();
                    }
                }
                model.scale(this.transformVarbit * 1661958697, this.widthScale * 521320011, 1661958697 * this.transformVarbit);
                return model;
            }
            if (b == 11) {
                throw new IllegalStateException();
            }
            final NPCComposition ur = ur(this, -1591447842);
            if (ur != null) {
                return ur.method1021(sequenceDefinition, n, sequenceDefinition2, n2, newShit, (byte)(-8));
            }
            if (b == 11) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.ab(" + ')');
        }
    }
    
    public final ModelData method1022(final NewShit newShit, final byte b) {
        try {
            if (null == this.transforms) {
                return bu(this, this.field1604, newShit, -817052624);
            }
            if (b != 64) {
                throw new IllegalStateException();
            }
            final NPCComposition ur = ur(this, 1757138189);
            if (null != ur) {
                return ur.method1022(newShit, (byte)64);
            }
            if (b != 64) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.aq(" + ')');
        }
    }
    
    public static int method1022(final long n) {
        try {
            return (int)(n >>> 7 & 0x7FL);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.aq(" + ')');
        }
    }
    
    public static NPCComposition aj(final int n) {
        final NPCComposition npcComposition = (NPCComposition)NPCComposition.NpcDefinition_cached.wr(n);
        if (null != npcComposition) {
            return npcComposition;
        }
        final byte[] takeFile = NPCComposition.NpcDefinition_archive.takeFile(9, n, (byte)(-113));
        final NPCComposition npcComposition2 = new NPCComposition();
        npcComposition2.id = -1772751813 * n;
        if (null != takeFile) {
            npcComposition2.decode(new Buffer(takeFile), 1131909426);
        }
        npcComposition2.postDecode(835833293);
        NPCComposition.NpcDefinition_cached.put(npcComposition2, n);
        return npcComposition2;
    }
    
    public int[] method1029(final int n) {
        try {
            return this.headIconArchiveIds;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.ag(" + ')');
        }
    }
    
    public static void bl() {
        NPCComposition.NpcDefinition_cached.clear();
        NPCComposition.NpcDefinition_cachedModels.clear();
    }
    
    public final Model bz(final SequenceDefinition sequenceDefinition, final int n, final SequenceDefinition sequenceDefinition2, final int n2, final NewShit newShit) {
        if (null == this.transforms) {
            long n3 = this.id * -1115372301;
            if (null != newShit) {
                n3 |= -1176524468931644747L * newShit.field1556 << 16;
            }
            Model dg = (Model)NPCComposition.NpcDefinition_cachedModels.wr(n3);
            if (dg == null) {
                final ModelData bu = bu(this, this.models, newShit, -709454640);
                if (bu == null) {
                    return null;
                }
                dg = bu.dg(64 + this.transformVarp * -1500709613, this.heightScale * -2057653211 + 850, -30, -50, -30);
                NPCComposition.NpcDefinition_cachedModels.put(dg, n3);
            }
            Model model;
            if (null != sequenceDefinition && sequenceDefinition2 != null) {
                model = sequenceDefinition.applyTransformations(dg, n, sequenceDefinition2, n2, 1459327937);
            }
            else if (sequenceDefinition != null) {
                model = sequenceDefinition.transformActorModel(dg, n, (byte)(-37));
            }
            else if (sequenceDefinition2 != null) {
                model = sequenceDefinition2.transformActorModel(dg, n2, (byte)(-106));
            }
            else {
                model = dg.toSharedSequenceModel(true);
            }
            if (this.transformVarbit * 1661958697 != 128 || this.widthScale * 521320011 != 128) {
                model.scale(this.transformVarbit * 1661958697, this.widthScale * 521320011, 1661958697 * this.transformVarbit);
            }
            return model;
        }
        final NPCComposition ur = ur(this, 347387552);
        if (ur == null) {
            return null;
        }
        return ur.method1021(sequenceDefinition, n, sequenceDefinition2, n2, newShit, (byte)(-35));
    }
    
    public static int mg(final NPCComposition npcComposition, final int n, final int n2) {
        if (npcComposition == null) {
            return npcComposition.bf(n, n);
        }
        final IterableNodeHashTable params = npcComposition.params;
        int integer;
        if (null == params) {
            integer = n2;
        }
        else {
            final IntegerNode integerNode = (IntegerNode)params.aa(n);
            if (null == integerNode) {
                integer = n2;
            }
            else {
                integer = integerNode.integer;
            }
        }
        return integer;
    }
    
    public String getStringValue(final int n) {
        final Node cc = this.cc(n);
        if (cc != null) {
            return (String)((ObjectNode)cc).by();
        }
        final ParamComposition xa = ScriptFrame.client.xa(n);
        if (!xa.zx()) {
            throw new IllegalArgumentException("trying to get string from int param");
        }
        return xa.zt();
    }
    
    public void setParams(final IterableHashTable iterableHashTable) {
        this.params = (IterableNodeHashTable)iterableHashTable;
    }
    
    public int getIntValue(final int n) {
        final Node cc = this.cc(n);
        if (cc != null) {
            return ((IntegerNode)cc).getValue();
        }
        final ParamComposition xa = ScriptFrame.client.xa(n);
        if (xa.zx()) {
            throw new IllegalArgumentException("trying to get int from string param");
        }
        return xa.wl();
    }
    
    public NPCComposition xw() {
        return ur(this, 1271441583);
    }
    
    public short cq(final int n) {
        if (null == this.headIconSpriteIndexes || n >= this.headIconSpriteIndexes.length) {
            return -1;
        }
        return this.headIconSpriteIndexes[n];
    }
    
    public final ModelData bm(final NewShit newShit) {
        if (null == this.transforms) {
            return bu(this, this.field1604, newShit, -1613431917);
        }
        final NPCComposition ur = ur(this, 548993368);
        if (null == ur) {
            return null;
        }
        return ur.method1022(newShit, (byte)64);
    }
    
    public void tq(final int n, final Node node) {
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
    
    public int method1030(final int n, final byte b) {
        try {
            if (null != this.headIconArchiveIds) {
                if (b <= 14) {
                    throw new IllegalStateException();
                }
                if (n < this.headIconArchiveIds.length) {
                    return this.headIconArchiveIds[n];
                }
                if (b <= 14) {
                    throw new IllegalStateException();
                }
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.ah(" + ')');
        }
    }
    
    public static ModelData yk(final NPCComposition npcComposition, final NewShit newShit) {
        if (null == npcComposition.transforms) {
            return bu(npcComposition, npcComposition.field1604, newShit, -1519571988);
        }
        final NPCComposition ur = ur(npcComposition, 1670360243);
        if (null == ur) {
            return null;
        }
        return ur.method1022(newShit, (byte)64);
    }
    
    public static int qz(final NPCComposition npcComposition, final int n, final int n2) {
        final IterableNodeHashTable params = npcComposition.params;
        int integer;
        if (null == params) {
            integer = n2;
        }
        else {
            final IntegerNode integerNode = (IntegerNode)params.aa(n);
            if (null == integerNode) {
                integer = n2;
            }
            else {
                integer = integerNode.integer;
            }
        }
        return integer;
    }
    
    public int bf(final int n, final int n2) {
        final IterableNodeHashTable params = this.params;
        int integer;
        if (null == params) {
            integer = n2;
        }
        else {
            final IntegerNode integerNode = (IntegerNode)params.get((long)n);
            if (null == integerNode) {
                integer = n2;
            }
            else {
                integer = integerNode.integer;
            }
        }
        return integer;
    }
    
    public static ModelData bu(final NPCComposition npcComposition, final int[] array, final NewShit newShit, final int n) {
        if (npcComposition == null) {
            npcComposition.method1023(array, newShit, n);
        }
        try {
            int[] field1555 = array;
            if (newShit != null) {
                if (n >= 232011844) {
                    throw new IllegalStateException();
                }
                if (newShit.field1555 != null) {
                    if (n >= 232011844) {
                        throw new IllegalStateException();
                    }
                    field1555 = newShit.field1555;
                }
            }
            if (null == field1555) {
                if (n >= 232011844) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                int n2 = 0;
                for (int i = 0; i < field1555.length; ++i) {
                    if (n >= 232011844) {
                        throw new IllegalStateException();
                    }
                    if (field1555[i] != -1 && !NPCComposition.field1559.tryLoadFile(field1555[i], 0, (byte)(-42))) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        n2 = 1;
                    }
                }
                if (n2 == 0) {
                    final ModelData[] array2 = new ModelData[field1555.length];
                    for (int j = 0; j < field1555.length; ++j) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        array2[j] = ModelData.ModelData_get(NPCComposition.field1559, field1555[j], 0);
                    }
                    ModelData modelData;
                    if (array2.length == 1) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        modelData = array2[0];
                        if (null == modelData) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            modelData = new ModelData(array2, array2.length);
                        }
                    }
                    else {
                        modelData = new ModelData(array2, array2.length);
                    }
                    if (null != npcComposition.recolorFrom) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        short[] array3 = npcComposition.retextureTo;
                        if (newShit != null && null != newShit.field1554) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            array3 = newShit.field1554;
                        }
                        for (int k = 0; k < npcComposition.recolorFrom.length; ++k) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            ModelData.lm(modelData, npcComposition.recolorFrom[k], array3[k]);
                        }
                    }
                    if (npcComposition.retextureFrom != null) {
                        if (n >= 232011844) {
                            throw new IllegalStateException();
                        }
                        short[] array4 = npcComposition.recolorTo;
                        if (null != newShit && newShit.field1557 != null) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            array4 = newShit.field1557;
                        }
                        for (int l = 0; l < npcComposition.retextureFrom.length; ++l) {
                            if (n >= 232011844) {
                                throw new IllegalStateException();
                            }
                            ModelData.jw(modelData, npcComposition.retextureFrom[l], array4[l]);
                        }
                    }
                    return modelData;
                }
                if (n >= 232011844) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hs.al(" + ')');
        }
    }
    
    public boolean isClickable() {
        return this.isClickable;
    }
    
    public boolean isInteractible() {
        return this.isInteractable;
    }
    
    public boolean isMinimapVisible() {
        return this.drawMapDot;
    }
    
    public int[] getConfigs() {
        return this.transforms;
    }
    
    public int getCombatLevel() {
        return this.combatLevel * 2062903815;
    }
    
    public int[] getModels() {
        return this.models;
    }
    
    public boolean isFollower() {
        return this.isFollower;
    }
}
