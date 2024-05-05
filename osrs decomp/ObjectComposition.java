import net.runelite.api.events.PostObjectComposition;
import net.runelite.api.IterableHashTable;
import net.runelite.api.ParamHolder;

// 
// Decompiled by Procyon v0.5.36
// 

public class ObjectComposition extends DualNode implements ParamHolder, net.runelite.api.ObjectComposition
{
    short[] retextureTo;
    static AbstractArchive ObjectDefinition_archive;
    static EvictingDualNodeHashTable ObjectDefinition_cached;
    public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
    static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
    int modelSizeY;
    static ModelData[] field1691;
    int ambient;
    int[] modelIds;
    int[] models;
    public int animationId;
    public int[] transforms;
    short[] recolorTo;
    short[] retextureFrom;
    short[] recolorFrom;
    public int sizeX;
    public int sizeY;
    public String[] actions;
    public boolean boolean1;
    public int int1;
    int clipType;
    public int interactType;
    public boolean modelClipped;
    boolean isRotated;
    public int int2;
    public int mapIconId;
    int contrast;
    public String name;
    static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
    public int id;
    boolean isSolid;
    public boolean clipped;
    int modelSizeX;
    int modelHeight;
    static boolean ObjectDefinition_isLowDetail;
    int offsetX;
    int offsetHeight;
    int offsetY;
    public boolean boolean2;
    boolean nonFlatShading;
    public int mapSceneId;
    public int[] soundEffectIds;
    int transformVarbit;
    int transformVarp;
    public int ambientSoundId;
    public int int7;
    IterableNodeHashTable params;
    public int int6;
    public int int5;
    public boolean boolean3;
    public int int3;
    
    public String getName() {
        return this.name;
    }
    
    ObjectComposition() {
        this.name = Strings.at;
        this.sizeX = 1205654711;
        this.sizeY = 1159818229;
        this.interactType = -1581132706;
        this.boolean1 = true;
        this.int1 = -1041321269;
        this.clipType = -657077221;
        this.isRotated = false;
        this.modelClipped = false;
        this.animationId = 1142530427;
        this.int2 = -233970928;
        this.ambient = 0;
        this.contrast = 0;
        this.actions = new String[5];
        this.mapIconId = 1683785829;
        this.mapSceneId = 476568133;
        this.isSolid = false;
        this.clipped = true;
        this.modelSizeX = -133284736;
        this.modelHeight = -845704064;
        this.modelSizeY = -2060996480;
        this.offsetX = 0;
        this.offsetHeight = 0;
        this.offsetY = 0;
        this.boolean2 = false;
        this.nonFlatShading = false;
        this.int3 = -1776888457;
        this.transformVarbit = -1157714067;
        this.transformVarp = 1863808827;
        this.ambientSoundId = 38705135;
        this.int7 = 0;
        this.int5 = 0;
        this.int6 = 0;
        this.boolean3 = true;
    }
    
    static {
        ObjectComposition.ObjectDefinition_isLowDetail = false;
        ObjectComposition.ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
        ObjectComposition.ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
        ObjectComposition.ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
        ObjectComposition.ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
        ObjectComposition.field1691 = new ModelData[4];
        ObjectComposition.ObjectDefinition_cachedModels.dd(256);
    }
    
    public int[] fp() {
        return this.transforms;
    }
    
    void ad(final Buffer buffer, final int n) {
        if (n == 1) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra > 0) {
                if (this.modelIds == null || ObjectComposition.ObjectDefinition_isLowDetail) {
                    this.models = new int[ra];
                    this.modelIds = new int[ra];
                    for (int i = 0; i < ra; ++i) {
                        this.modelIds[i] = buffer.readUnsignedShort(-797865563);
                        this.models[i] = Buffer.ra(buffer, (byte)7);
                    }
                }
                else {
                    buffer.offset += -254100545 * ra;
                }
            }
        }
        else if (n == 2) {
            this.name = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 5) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 > 0) {
                if (this.modelIds != null && !ObjectComposition.ObjectDefinition_isLowDetail) {
                    buffer.offset += ra2 * 1262255402;
                }
                else {
                    this.models = null;
                    this.modelIds = new int[ra2];
                    for (int j = 0; j < ra2; ++j) {
                        this.modelIds[j] = buffer.readUnsignedShort(824115707);
                    }
                }
            }
        }
        else if (n == 14) {
            this.sizeX = Buffer.ra(buffer, (byte)7) * 1205654711;
        }
        else if (15 == n) {
            this.sizeY = Buffer.ra(buffer, (byte)7) * 1159818229;
        }
        else if (n == 17) {
            this.interactType = 0;
            this.boolean1 = false;
        }
        else if (n == 18) {
            this.boolean1 = false;
        }
        else if (n == 19) {
            this.int1 = Buffer.ra(buffer, (byte)7) * 1041321269;
        }
        else if (n == 21) {
            this.clipType = 0;
        }
        else if (n == 22) {
            this.isRotated = true;
        }
        else if (23 == n) {
            this.modelClipped = true;
        }
        else if (n == 24) {
            this.animationId = buffer.readUnsignedShort(293346868) * -1142530427;
            if (65535 == 1292954189 * this.animationId) {
                this.animationId = 1142530427;
            }
        }
        else if (27 == n) {
            this.interactType = 1356917295;
        }
        else if (n == 28) {
            this.int2 = Buffer.ra(buffer, (byte)7) * -1893671375;
        }
        else if (n == 29) {
            this.ambient = Buffer.wu(buffer, 435772489) * 524532799;
        }
        else if (39 == n) {
            this.contrast = Buffer.wu(buffer, 435772489) * -1238182971;
        }
        else if (n >= 30 && n < 35) {
            this.actions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
            if (this.actions[n - 30].equalsIgnoreCase(Strings.ac)) {
                this.actions[n - 30] = null;
            }
        }
        else if (n == 40) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            this.recolorFrom = new short[ra3];
            this.recolorTo = new short[ra3];
            for (int k = 0; k < ra3; ++k) {
                this.recolorFrom[k] = (short)buffer.readUnsignedShort(594232540);
                this.recolorTo[k] = (short)buffer.readUnsignedShort(-277420877);
            }
        }
        else if (n == 41) {
            final int ra4 = Buffer.ra(buffer, (byte)7);
            this.retextureFrom = new short[ra4];
            this.retextureTo = new short[ra4];
            for (int l = 0; l < ra4; ++l) {
                this.retextureFrom[l] = (short)buffer.readUnsignedShort(-463043824);
                this.retextureTo[l] = (short)buffer.readUnsignedShort(-619252906);
            }
        }
        else if (61 == n) {
            buffer.readUnsignedShort(133141665);
        }
        else if (62 == n) {
            this.isSolid = true;
        }
        else if (64 == n) {
            this.clipped = false;
        }
        else if (65 == n) {
            this.modelSizeX = buffer.readUnsignedShort(-359590807) * 1039146105;
        }
        else if (n == 66) {
            this.modelHeight = buffer.readUnsignedShort(-1427205830) * -677695703;
        }
        else if (n == 67) {
            this.modelSizeY = buffer.readUnsignedShort(-25281735) * 1862946657;
        }
        else if (n == 68) {
            this.mapSceneId = buffer.readUnsignedShort(143546544) * -476568133;
        }
        else if (69 == n) {
            Buffer.ra(buffer, (byte)7);
        }
        else if (n == 70) {
            this.offsetX = buffer.readUnsignedByte((byte)(-73)) * -327422321;
        }
        else if (71 == n) {
            this.offsetHeight = buffer.readUnsignedByte((byte)(-39)) * 956024773;
        }
        else if (72 == n) {
            this.offsetY = buffer.readUnsignedByte((byte)8) * -127229215;
        }
        else if (73 == n) {
            this.boolean2 = true;
        }
        else if (74 == n) {
            this.nonFlatShading = true;
        }
        else if (n == 75) {
            this.int3 = Buffer.ra(buffer, (byte)7) * 1776888457;
        }
        else if (n != 77 && n != 92) {
            if (78 == n) {
                this.ambientSoundId = buffer.readUnsignedShort(397487416) * -38705135;
                this.int7 = Buffer.ra(buffer, (byte)7) * 1190823625;
            }
            else if (n == 79) {
                this.int5 = buffer.readUnsignedShort(-27524667) * 1257958995;
                this.int6 = buffer.readUnsignedShort(694248063) * 230715233;
                this.int7 = Buffer.ra(buffer, (byte)7) * 1190823625;
                final int ra5 = Buffer.ra(buffer, (byte)7);
                this.transforms = new int[ra5];
                for (int n2 = 0; n2 < ra5; ++n2) {
                    this.transforms[n2] = buffer.readUnsignedShort(-1649217402);
                }
            }
            else if (81 == n) {
                this.clipType = Buffer.ra(buffer, (byte)7) * 708044032;
            }
            else if (n == 82) {
                this.mapIconId = buffer.readUnsignedShort(-1357953624) * -1683785829;
            }
            else if (89 == n) {
                this.boolean3 = false;
            }
            else if (n == 249) {
                this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-33));
            }
        }
        else {
            this.transformVarbit = buffer.readUnsignedShort(366288798) * 1157714067;
            if (1411927451 * this.transformVarbit == 65535) {
                this.transformVarbit = -1157714067;
            }
            this.transformVarp = buffer.readUnsignedShort(-939707830) * -1863808827;
            if (1685173773 * this.transformVarp == 65535) {
                this.transformVarp = 1863808827;
            }
            int unsignedShort = -1;
            if (n == 92) {
                unsignedShort = buffer.readUnsignedShort(438938570);
                if (65535 == unsignedShort) {
                    unsignedShort = -1;
                }
            }
            final int ra6 = Buffer.ra(buffer, (byte)7);
            this.soundEffectIds = new int[ra6 + 2];
            for (int n3 = 0; n3 <= ra6; ++n3) {
                this.soundEffectIds[n3] = buffer.readUnsignedShort(534843065);
                if (this.soundEffectIds[n3] == 65535) {
                    this.soundEffectIds[n3] = -1;
                }
            }
            this.soundEffectIds[1 + ra6] = unsignedShort;
        }
    }
    
    public static void ba() {
        ObjectComposition.ObjectDefinition_cached.clear();
        ObjectComposition.ObjectDefinition_cachedModelData.clear();
        ObjectComposition.ObjectDefinition_cachedEntities.clear();
        ObjectComposition.ObjectDefinition_cachedModels.clear();
    }
    
    static int method1094(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (n == 3200) {
                if (b2 != 6) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 1281407919;
                class133.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2], (byte)(-14));
                return 1;
            }
            else if (n == 3201) {
                if (b2 != 6) {
                    throw new IllegalStateException();
                }
                class1.playSong(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1119881265);
                return 1;
            }
            else {
                if (n != 3202) {
                    if (n != 3212) {
                        if (b2 != 6) {
                            throw new IllegalStateException();
                        }
                        if (3213 != n) {
                            if (b2 != 6) {
                                throw new IllegalStateException();
                            }
                            if (n != 3209) {
                                if (b2 != 6) {
                                    throw new IllegalStateException();
                                }
                                if (n != 3181) {
                                    if (b2 != 6) {
                                        throw new IllegalStateException();
                                    }
                                    if (3203 != n) {
                                        if (b2 != 6) {
                                            throw new IllegalStateException();
                                        }
                                        if (n != 3205) {
                                            if (b2 != 6) {
                                                throw new IllegalStateException();
                                            }
                                            if (3207 != n) {
                                                if (n != 3214) {
                                                    if (b2 != 6) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (n != 3215) {
                                                        if (b2 != 6) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (3210 != n) {
                                                            if (b2 != 6) {
                                                                throw new IllegalStateException();
                                                            }
                                                            if (3182 != n && n != 3204) {
                                                                if (b2 != 6) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                if (n != 3206) {
                                                                    if (3208 == n) {
                                                                        if (b2 != 6) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                    }
                                                                    else if (3211 == n) {
                                                                        if (b2 != 6) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        return 1;
                                                                    }
                                                                    else {
                                                                        if (3216 == n) {
                                                                            final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                                                            int n3 = 0;
                                                                            final class86 class86 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), n2, (short)173);
                                                                            if (class86 != null) {
                                                                                if (b2 != 6) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                int n4;
                                                                                if (class86.field886 != class86) {
                                                                                    if (b2 != 6) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    n4 = 1;
                                                                                }
                                                                                else {
                                                                                    n4 = 0;
                                                                                }
                                                                                n3 = n4;
                                                                            }
                                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n3;
                                                                            return 1;
                                                                        }
                                                                        if (3218 == n) {
                                                                            final int n5 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                                                            int n6 = 0;
                                                                            final class85 class87 = (class85)StructComposition.findEnumerated(class121.method721(2081889972), n5, (short)173);
                                                                            if (class87 != null) {
                                                                                if (b2 != 6) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                n6 = ((class87 != class85.field872) ? 1 : 0);
                                                                            }
                                                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n6;
                                                                            return 1;
                                                                        }
                                                                        if (3217 != n) {
                                                                            if (b2 != 6) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            if (n != 3219) {
                                                                                return 2;
                                                                            }
                                                                            if (b2 != 6) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                        }
                                                                        class86 field886 = class86.field886;
                                                                        class85 field887 = class85.field872;
                                                                        if (3217 == n) {
                                                                            if (b2 != 6) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            final int i = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                                                            field886 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i, (short)173);
                                                                            if (null == field886) {
                                                                                if (b2 != 6) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                throw new RuntimeException(String.format("Unrecognized device option %d", i));
                                                                            }
                                                                        }
                                                                        if (n == 3219) {
                                                                            if (b2 != 6) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            final int j = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                                                            field887 = (class85)StructComposition.findEnumerated(class121.method721(1830498693), j, (short)173);
                                                                            if (null == field887) {
                                                                                throw new RuntimeException(String.format("Unrecognized game option %d", j));
                                                                            }
                                                                        }
                                                                        int n7 = 0;
                                                                        int n8 = 0;
                                                                        if (class85.field872 == field887) {
                                                                            if (b2 != 6) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            switch (-2060299987 * field886.field887) {
                                                                                case 5: {
                                                                                    n7 = 0;
                                                                                    n8 = 100;
                                                                                    break;
                                                                                }
                                                                                default: {
                                                                                    throw new RuntimeException(String.format("Unkown device option: %s.", field886.toString()));
                                                                                }
                                                                                case 4: {
                                                                                    n7 = 0;
                                                                                    n8 = Integer.MAX_VALUE;
                                                                                    break;
                                                                                }
                                                                                case 1:
                                                                                case 2:
                                                                                case 3: {
                                                                                    n7 = 0;
                                                                                    n8 = 1;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            switch (358560065 * field887.field873) {
                                                                                case 2:
                                                                                case 3:
                                                                                case 4: {
                                                                                    n7 = 0;
                                                                                    n8 = 100;
                                                                                    break;
                                                                                }
                                                                                case 1: {
                                                                                    n7 = 0;
                                                                                    n8 = 1;
                                                                                    break;
                                                                                }
                                                                                default: {
                                                                                    throw new RuntimeException(String.format("Unkown game option: %s.", field887.toString()));
                                                                                }
                                                                            }
                                                                        }
                                                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n7;
                                                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n8;
                                                                        return 1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                class86 class88 = class86.field886;
                                                class85 class89 = class85.field872;
                                                if (3214 == n) {
                                                    final int k = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                                    class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), k, (short)173);
                                                    if (class88 == null) {
                                                        if (b2 != 6) {
                                                            throw new IllegalStateException();
                                                        }
                                                        throw new RuntimeException(String.format("Unrecognized device option %d", k));
                                                    }
                                                }
                                                if (n == 3215) {
                                                    if (b2 != 6) {
                                                        throw new IllegalStateException();
                                                    }
                                                    final int l = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                                    class89 = (class85)StructComposition.findEnumerated(class121.method721(1795089350), l, (short)173);
                                                    if (null == class89) {
                                                        if (b2 != 6) {
                                                            throw new IllegalStateException();
                                                        }
                                                        throw new RuntimeException(String.format("Unrecognized game option %d", l));
                                                    }
                                                }
                                                if (3210 == n) {
                                                    if (b2 != 6) {
                                                        throw new IllegalStateException();
                                                    }
                                                    final int m = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                                    class88 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), m, (short)173);
                                                    if (class88 == null) {
                                                        if (b2 != 6) {
                                                            throw new IllegalStateException();
                                                        }
                                                        class89 = (class85)StructComposition.findEnumerated(class121.method721(2051277304), m, (short)173);
                                                        if (class89 == null) {
                                                            throw new RuntimeException(String.format("Unrecognized client option %d", m));
                                                        }
                                                    }
                                                }
                                                else if (3182 == n) {
                                                    if (b2 != 6) {
                                                        throw new IllegalStateException();
                                                    }
                                                    class88 = class86.field884;
                                                }
                                                else if (n == 3204) {
                                                    if (b2 != 6) {
                                                        throw new IllegalStateException();
                                                    }
                                                    class89 = class85.field877;
                                                }
                                                else if (n == 3206) {
                                                    if (b2 != 6) {
                                                        throw new IllegalStateException();
                                                    }
                                                    class89 = class85.field871;
                                                }
                                                else if (n == 3208) {
                                                    if (b2 != 6) {
                                                        throw new IllegalStateException();
                                                    }
                                                    class89 = class85.field874;
                                                }
                                                int n9 = 0;
                                                if (class89 == class85.field872) {
                                                    if (b2 != 6) {
                                                        throw new IllegalStateException();
                                                    }
                                                    switch (class88.field887 * -2060299987) {
                                                        case 5: {
                                                            n9 = class103.method636(-1900076897);
                                                            break;
                                                        }
                                                        case 1: {
                                                            n9 = (ClientPreferences.ty(class20.clientPreferences, -2121061539) ? 1 : 0);
                                                            break;
                                                        }
                                                        default: {
                                                            throw new RuntimeException(String.format("Unkown device option: %s.", class88.toString()));
                                                        }
                                                        case 3: {
                                                            int n10;
                                                            if (class20.clientPreferences.method562((short)635)) {
                                                                if (b2 != 6) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n10 = 1;
                                                            }
                                                            else {
                                                                n10 = 0;
                                                            }
                                                            n9 = n10;
                                                            break;
                                                        }
                                                        case 4: {
                                                            n9 = class20.clientPreferences.getCurrentMusicVolume(1671764667);
                                                            break;
                                                        }
                                                        case 2: {
                                                            int n11;
                                                            if (ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
                                                                if (b2 != 6) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n11 = 1;
                                                            }
                                                            else {
                                                                n11 = 0;
                                                            }
                                                            n9 = n11;
                                                            break;
                                                        }
                                                    }
                                                }
                                                else {
                                                    switch (class89.field873 * 358560065) {
                                                        case 3: {
                                                            n9 = Math.round(ClientPreferences.setUsernameToRemember(class20.clientPreferences, 1942519392) * 100 / 127.0f);
                                                            break;
                                                        }
                                                        case 2: {
                                                            n9 = Math.round(ClientPreferences.xp(class20.clientPreferences, -1177228802) * 100 / 255.0f);
                                                            break;
                                                        }
                                                        default: {
                                                            throw new RuntimeException(String.format("Unkown game option: %s.", class89.toString()));
                                                        }
                                                        case 1: {
                                                            int n12;
                                                            if (class20.clientPreferences.getRoofsHidden(-2064860341)) {
                                                                if (b2 != 6) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n12 = 1;
                                                            }
                                                            else {
                                                                n12 = 0;
                                                            }
                                                            n9 = n12;
                                                            break;
                                                        }
                                                        case 4: {
                                                            n9 = Math.round(100 * class20.clientPreferences.method573(-1861682668) / 127.0f);
                                                            break;
                                                        }
                                                    }
                                                }
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n9;
                                                return 1;
                                            }
                                            if (b2 != 6) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    class86 class90 = class86.field886;
                    class85 class91 = class85.field872;
                    int a = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    if (3212 == n) {
                        if (b2 != 6) {
                            throw new IllegalStateException();
                        }
                        final int i2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        class90 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i2, (short)173);
                        if (class90 == null) {
                            throw new RuntimeException(String.format("Unrecognized device option %d", i2));
                        }
                    }
                    if (n == 3213) {
                        final int i3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        class91 = (class85)StructComposition.findEnumerated(class121.method721(1978895221), i3, (short)173);
                        if (class91 == null) {
                            if (b2 != 6) {
                                throw new IllegalStateException();
                            }
                            throw new RuntimeException(String.format("Unrecognized game option %d", i3));
                        }
                    }
                    if (n == 3209) {
                        if (b2 != 6) {
                            throw new IllegalStateException();
                        }
                        final int i4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        class90 = (class86)StructComposition.findEnumerated(ArchiveDiskAction.method1858(-678147968), i4, (short)173);
                        if (null == class90) {
                            if (b2 != 6) {
                                throw new IllegalStateException();
                            }
                            class91 = (class85)StructComposition.findEnumerated(class121.method721(1901937136), i4, (short)173);
                            if (null == class91) {
                                if (b2 != 6) {
                                    throw new IllegalStateException();
                                }
                                throw new RuntimeException(String.format("Unrecognized client option %d", i4));
                            }
                        }
                    }
                    else if (n == 3181) {
                        if (b2 != 6) {
                            throw new IllegalStateException();
                        }
                        class90 = class86.field884;
                    }
                    else if (n == 3203) {
                        class91 = class85.field877;
                    }
                    else if (3205 == n) {
                        if (b2 != 6) {
                            throw new IllegalStateException();
                        }
                        class91 = class85.field871;
                    }
                    else if (3207 == n) {
                        if (b2 != 6) {
                            throw new IllegalStateException();
                        }
                        class91 = class85.field874;
                    }
                    if (class85.field872 == class91) {
                        if (b2 != 6) {
                            throw new IllegalStateException();
                        }
                        switch (-2060299987 * class90.field887) {
                            case 4: {
                                if (a < 0) {
                                    a = 0;
                                }
                                class20.clientPreferences.method587(a, (byte)(-3));
                                break;
                            }
                            case 1: {
                                final ClientPreferences clientPreferences = class20.clientPreferences;
                                boolean b3;
                                if (a != 0) {
                                    if (b2 != 6) {
                                        throw new IllegalStateException();
                                    }
                                    b3 = true;
                                }
                                else {
                                    b3 = false;
                                }
                                clientPreferences.setIsUsernameHidden(b3, 1798514375);
                                break;
                            }
                            case 3: {
                                final ClientPreferences clientPreferences2 = class20.clientPreferences;
                                boolean b4;
                                if (a != 0) {
                                    if (b2 != 6) {
                                        throw new IllegalStateException();
                                    }
                                    b4 = true;
                                }
                                else {
                                    b4 = false;
                                }
                                clientPreferences2.method580(b4, 1980083738);
                                break;
                            }
                            default: {
                                throw new RuntimeException(String.format("Unkown device option: %s.", class90.toString()));
                            }
                            case 2: {
                                final ClientPreferences clientPreferences3 = class20.clientPreferences;
                                boolean b5;
                                if (a != 0) {
                                    if (b2 != 6) {
                                        throw new IllegalStateException();
                                    }
                                    b5 = true;
                                }
                                else {
                                    b5 = false;
                                }
                                clientPreferences3.getTitleMusicDisabled(b5, -527699713);
                                break;
                            }
                            case 5: {
                                ApproximateRouteStrategy.method359(a, -1280627199);
                                break;
                            }
                        }
                    }
                    else {
                        switch (class91.field873 * 358560065) {
                            case 3: {
                                class130.method764(Math.round(127 * Math.min(Math.max(a, 0), 100) / 100.0f), 1534718960);
                                break;
                            }
                            case 4: {
                                class135.method783(Math.round(127 * Math.min(Math.max(a, 0), 100) / 100.0f), (byte)0);
                                break;
                            }
                            case 2: {
                                class86.method502(Math.round(255 * Math.min(Math.max(a, 0), 100) / 100.0f), (byte)(-104));
                                break;
                            }
                            default: {
                                throw new RuntimeException(String.format("Unkown game option: %s.", class91.toString()));
                            }
                            case 1: {
                                ClientPreferences.pb(class20.clientPreferences, a == 1, -1505559794);
                                break;
                            }
                        }
                    }
                    return 1;
                }
                if (b2 != 6) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                CollisionMap.playJingle(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 1287836101);
                return 1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.ae(" + ')');
        }
    }
    
    public final boolean bb() {
        if (this.modelIds == null) {
            return true;
        }
        boolean b = true;
        for (int i = 0; i < this.modelIds.length; ++i) {
            b &= class157.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[i] & 0xFFFF, 0, (byte)(-21));
        }
        return b;
    }
    
    public static boolean pa(final ObjectComposition objectComposition, final int n) {
        if (objectComposition.models != null) {
            for (int i = 0; i < objectComposition.models.length; ++i) {
                if (objectComposition.models[i] == n) {
                    return class157.ObjectDefinition_modelsArchive.tryLoadFile(objectComposition.modelIds[i] & 0xB0B8C1FB, 0, (byte)5);
                }
            }
            return true;
        }
        if (null == objectComposition.modelIds) {
            return true;
        }
        if (n != 10) {
            return true;
        }
        boolean b = true;
        for (int j = 0; j < objectComposition.modelIds.length; ++j) {
            b &= class157.ObjectDefinition_modelsArchive.tryLoadFile(objectComposition.modelIds[j] & 0xFFFF, 0, (byte)72);
        }
        return b;
    }
    
    public String[] getActions() {
        return this.actions;
    }
    
    public int getId() {
        return this.id * -1529817365;
    }
    
    public void setValue(final int n, final String s) {
        this.pb(n, ScriptFrame.client.jh(s));
    }
    
    public void setValue(final int n, final int n2) {
        this.pb(n, ScriptFrame.client.xq(n2));
    }
    
    public int cf() {
        return this.sizeY * -1659393955;
    }
    
    public final ObjectComposition transform(final byte b) {
        try {
            int expandBounds = -1;
            if (-1 != 1411927451 * this.transformVarbit) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                expandBounds = class252.expandBounds(1411927451 * this.transformVarbit, 1707765619);
            }
            else if (1685173773 * this.transformVarp != -1) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                expandBounds = Varps.Varps_main[this.transformVarp * 1685173773];
            }
            int n = 0;
            Label_0155: {
                if (expandBounds >= 0) {
                    if (b == 1) {
                        throw new IllegalStateException();
                    }
                    if (expandBounds < this.soundEffectIds.length - 1) {
                        n = this.soundEffectIds[expandBounds];
                        break Label_0155;
                    }
                    if (b == 1) {
                        throw new IllegalStateException();
                    }
                }
                n = this.soundEffectIds[this.soundEffectIds.length - 1];
            }
            if (-1 == n) {
                return null;
            }
            if (b == 1) {
                throw new IllegalStateException();
            }
            return class144.vmethod3248(n, (short)8608);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.ao(" + ')');
        }
    }
    
    public final Model getModel(final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5, final byte b) {
        try {
            long n6;
            if (null == this.models) {
                if (b == 6) {
                    throw new IllegalStateException();
                }
                n6 = (-1529817365 * this.id << 10) + n2;
            }
            else {
                n6 = (this.id * -1529817365 << 10) + (n << 3) + n2;
            }
            Model model = (Model)ObjectComposition.ObjectDefinition_cachedModels.wr(n6);
            if (model == null) {
                if (b == 6) {
                    throw new IllegalStateException();
                }
                final ModelData modelData = this.getModelData(n, n2, -512287449);
                if (modelData == null) {
                    if (b == 6) {
                        throw new IllegalStateException();
                    }
                    return null;
                }
                else {
                    model = modelData.dg(this.ambient * 1284125631 + 64, 768 + -18088891 * this.contrast, -50, -10, -50);
                    ObjectComposition.ObjectDefinition_cachedModels.put(model, n6);
                }
            }
            if (this.clipType * -1437543955 >= 0) {
                model = model.bp(array, n3, n4, n5, true, -1437543955 * this.clipType);
            }
            return model;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.at(" + ')');
        }
    }
    
    void ak(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                zv(this, buffer, ra, (byte)16);
            }
            if (n <= -1047808758) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.ac(" + ')');
        }
    }
    
    public static boolean th(final ObjectComposition objectComposition) {
        if (objectComposition.soundEffectIds == null) {
            return objectComposition.ambientSoundId * 1820546879 != -1 || null != objectComposition.transforms;
        }
        for (int i = 0; i < objectComposition.soundEffectIds.length; ++i) {
            if (-1 != objectComposition.soundEffectIds[i]) {
                final ObjectComposition vmethod3248 = class144.vmethod3248(objectComposition.soundEffectIds[i], (short)23285);
                if (-1 != 290373291 * vmethod3248.ambientSoundId || vmethod3248.transforms != null) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void av(final AbstractArchive objectDefinition_archive, final AbstractArchive objectDefinition_modelsArchive, final boolean objectDefinition_isLowDetail) {
        ObjectComposition.ObjectDefinition_archive = objectDefinition_archive;
        class157.ObjectDefinition_modelsArchive = objectDefinition_modelsArchive;
        ObjectComposition.ObjectDefinition_isLowDetail = objectDefinition_isLowDetail;
    }
    
    void as(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            zv(this, buffer, ra, (byte)10);
        }
    }
    
    public int qk() {
        return this.ambientSoundId * 1970571505;
    }
    
    public static void rf(final ObjectComposition objectComposition, final Buffer buffer) {
        if (objectComposition == null) {
            objectComposition.fp();
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            zv(objectComposition, buffer, ra, (byte)(-60));
        }
    }
    
    void az(final Buffer buffer, final int n) {
        if (n == 1) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra > 0) {
                if (this.modelIds == null || ObjectComposition.ObjectDefinition_isLowDetail) {
                    this.models = new int[ra];
                    this.modelIds = new int[ra];
                    for (int i = 0; i < ra; ++i) {
                        this.modelIds[i] = buffer.readUnsignedShort(275301632);
                        this.models[i] = Buffer.ra(buffer, (byte)7);
                    }
                }
                else {
                    buffer.offset += -254100545 * ra;
                }
            }
        }
        else if (n == 2) {
            this.name = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 5) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 > 0) {
                if (this.modelIds != null && !ObjectComposition.ObjectDefinition_isLowDetail) {
                    buffer.offset += ra2 * 1262255402;
                }
                else {
                    this.models = null;
                    this.modelIds = new int[ra2];
                    for (int j = 0; j < ra2; ++j) {
                        this.modelIds[j] = buffer.readUnsignedShort(-509329390);
                    }
                }
            }
        }
        else if (n == 14) {
            this.sizeX = Buffer.ra(buffer, (byte)7) * 1205654711;
        }
        else if (15 == n) {
            this.sizeY = Buffer.ra(buffer, (byte)7) * 1159818229;
        }
        else if (n == 17) {
            this.interactType = 0;
            this.boolean1 = false;
        }
        else if (n == 18) {
            this.boolean1 = false;
        }
        else if (n == 19) {
            this.int1 = Buffer.ra(buffer, (byte)7) * 1041321269;
        }
        else if (n == 21) {
            this.clipType = 0;
        }
        else if (n == 22) {
            this.isRotated = true;
        }
        else if (23 == n) {
            this.modelClipped = true;
        }
        else if (n == 24) {
            this.animationId = buffer.readUnsignedShort(-1451819980) * -1142530427;
            if (65535 == 1292954189 * this.animationId) {
                this.animationId = 1142530427;
            }
        }
        else if (27 == n) {
            this.interactType = 1356917295;
        }
        else if (n == 28) {
            this.int2 = Buffer.ra(buffer, (byte)7) * -1893671375;
        }
        else if (n == 29) {
            this.ambient = Buffer.wu(buffer, 435772489) * 524532799;
        }
        else if (39 == n) {
            this.contrast = Buffer.wu(buffer, 435772489) * -1238182971;
        }
        else if (n >= 30 && n < 35) {
            this.actions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
            if (this.actions[n - 30].equalsIgnoreCase(Strings.ac)) {
                this.actions[n - 30] = null;
            }
        }
        else if (n == 40) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            this.recolorFrom = new short[ra3];
            this.recolorTo = new short[ra3];
            for (int k = 0; k < ra3; ++k) {
                this.recolorFrom[k] = (short)buffer.readUnsignedShort(-342438149);
                this.recolorTo[k] = (short)buffer.readUnsignedShort(-510222877);
            }
        }
        else if (n == 41) {
            final int ra4 = Buffer.ra(buffer, (byte)7);
            this.retextureFrom = new short[ra4];
            this.retextureTo = new short[ra4];
            for (int l = 0; l < ra4; ++l) {
                this.retextureFrom[l] = (short)buffer.readUnsignedShort(-941391818);
                this.retextureTo[l] = (short)buffer.readUnsignedShort(-1810796775);
            }
        }
        else if (61 == n) {
            buffer.readUnsignedShort(326951040);
        }
        else if (62 == n) {
            this.isSolid = true;
        }
        else if (64 == n) {
            this.clipped = false;
        }
        else if (65 == n) {
            this.modelSizeX = buffer.readUnsignedShort(255865028) * 1039146105;
        }
        else if (n == 66) {
            this.modelHeight = buffer.readUnsignedShort(877419536) * -677695703;
        }
        else if (n == 67) {
            this.modelSizeY = buffer.readUnsignedShort(-1822531321) * 1862946657;
        }
        else if (n == 68) {
            this.mapSceneId = buffer.readUnsignedShort(-1795784067) * -476568133;
        }
        else if (69 == n) {
            Buffer.ra(buffer, (byte)7);
        }
        else if (n == 70) {
            this.offsetX = buffer.readUnsignedByte((byte)(-56)) * -327422321;
        }
        else if (71 == n) {
            this.offsetHeight = buffer.readUnsignedByte((byte)(-46)) * 956024773;
        }
        else if (72 == n) {
            this.offsetY = buffer.readUnsignedByte((byte)(-96)) * -127229215;
        }
        else if (73 == n) {
            this.boolean2 = true;
        }
        else if (74 == n) {
            this.nonFlatShading = true;
        }
        else if (n == 75) {
            this.int3 = Buffer.ra(buffer, (byte)7) * 1776888457;
        }
        else if (n != 77 && n != 92) {
            if (78 == n) {
                this.ambientSoundId = buffer.readUnsignedShort(-453705863) * -38705135;
                this.int7 = Buffer.ra(buffer, (byte)7) * 1190823625;
            }
            else if (n == 79) {
                this.int5 = buffer.readUnsignedShort(-155337547) * 1257958995;
                this.int6 = buffer.readUnsignedShort(-1700023977) * 230715233;
                this.int7 = Buffer.ra(buffer, (byte)7) * 1190823625;
                final int ra5 = Buffer.ra(buffer, (byte)7);
                this.transforms = new int[ra5];
                for (int n2 = 0; n2 < ra5; ++n2) {
                    this.transforms[n2] = buffer.readUnsignedShort(-1027331075);
                }
            }
            else if (81 == n) {
                this.clipType = Buffer.ra(buffer, (byte)7) * 708044032;
            }
            else if (n == 82) {
                this.mapIconId = buffer.readUnsignedShort(-940542363) * -1683785829;
            }
            else if (89 == n) {
                this.boolean3 = false;
            }
            else if (n == 249) {
                this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-8));
            }
        }
        else {
            this.transformVarbit = buffer.readUnsignedShort(-328634669) * 1157714067;
            if (1411927451 * this.transformVarbit == 65535) {
                this.transformVarbit = -1157714067;
            }
            this.transformVarp = buffer.readUnsignedShort(-778895613) * -1863808827;
            if (1685173773 * this.transformVarp == 65535) {
                this.transformVarp = 1863808827;
            }
            int unsignedShort = -1;
            if (n == 92) {
                unsignedShort = buffer.readUnsignedShort(-1114027003);
                if (65535 == unsignedShort) {
                    unsignedShort = -1;
                }
            }
            final int ra6 = Buffer.ra(buffer, (byte)7);
            this.soundEffectIds = new int[ra6 + 2];
            for (int n3 = 0; n3 <= ra6; ++n3) {
                this.soundEffectIds[n3] = buffer.readUnsignedShort(130659752);
                if (this.soundEffectIds[n3] == 65535) {
                    this.soundEffectIds[n3] = -1;
                }
            }
            this.soundEffectIds[1 + ra6] = unsignedShort;
        }
    }
    
    public static Model lt(final ObjectComposition objectComposition, final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5, final SequenceDefinition sequenceDefinition, final int n6) {
        long n7;
        if (null == objectComposition.models) {
            n7 = n2 + (objectComposition.id * -1529817365 << 10);
        }
        else {
            n7 = n2 + ((objectComposition.id * -1529817365 << 10) + (n << 3));
        }
        Model dg = (Model)ObjectComposition.ObjectDefinition_cachedModels.wr(n7);
        if (dg == null) {
            final ModelData modelData = objectComposition.getModelData(n, n2, -932381275);
            if (modelData == null) {
                return null;
            }
            dg = modelData.dg(64 + objectComposition.ambient * 1284125631, 768 + objectComposition.contrast * -18088891, -50, -10, -50);
            ObjectComposition.ObjectDefinition_cachedModels.put(dg, n7);
        }
        if (sequenceDefinition == null && -1 == objectComposition.clipType * -1437543955) {
            return dg;
        }
        Model model;
        if (null != sequenceDefinition) {
            model = SequenceDefinition.ef(sequenceDefinition, dg, n6, n2, 16711935);
        }
        else {
            model = dg.toSharedSequenceModel(true);
        }
        if (-1437543955 * objectComposition.clipType >= 0) {
            model = model.bp(array, n3, n4, n5, false, -1437543955 * objectComposition.clipType);
        }
        return model;
    }
    
    public int getIntParam(final int n, final int n2, final int n3) {
        try {
            final IterableNodeHashTable params = this.params;
            int integer;
            if (null == params) {
                if (n3 >= -633281837) {
                    throw new IllegalStateException();
                }
                integer = n2;
            }
            else {
                final IntegerNode integerNode = (IntegerNode)params.aa(n);
                if (null == integerNode) {
                    if (n3 >= -633281837) {
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
            throw HealthBar.get(ex, "hq.ax(" + ')');
        }
    }
    
    final ModelData getModelData(final int n, final int n2, final int n3) {
        synchronized (ObjectComposition.ObjectDefinition_cachedModelData) {
            final int n4 = -512287449;
            ModelData modelData2;
            try {
                ModelData modelData = null;
                if (this.models == null) {
                    if (n != 10) {
                        if (n4 >= 1446803360) {
                            throw new IllegalStateException();
                        }
                        modelData2 = null;
                        return modelData2;
                    }
                    else if (null == this.modelIds) {
                        if (n4 >= 1446803360) {
                            throw new IllegalStateException();
                        }
                        modelData2 = null;
                        return modelData2;
                    }
                    else {
                        boolean isSolid = this.isSolid;
                        if (2 == n) {
                            if (n4 >= 1446803360) {
                                throw new IllegalStateException();
                            }
                            if (n2 > 3) {
                                if (n4 >= 1446803360) {
                                    throw new IllegalStateException();
                                }
                                boolean b;
                                if (!isSolid) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    b = true;
                                }
                                else {
                                    b = false;
                                }
                                isSolid = b;
                            }
                        }
                        final int length = this.modelIds.length;
                        for (int i = 0; i < length; ++i) {
                            if (n4 >= 1446803360) {
                                throw new IllegalStateException();
                            }
                            int n5 = this.modelIds[i];
                            if (isSolid) {
                                n5 += 65536;
                            }
                            modelData = (ModelData)ObjectComposition.ObjectDefinition_cachedModelData.wr(n5);
                            if (null == modelData) {
                                if (n4 >= 1446803360) {
                                    throw new IllegalStateException();
                                }
                                modelData = ModelData.ModelData_get(class157.ObjectDefinition_modelsArchive, n5 & 0xFFFF, 0);
                                if (modelData == null) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    modelData2 = null;
                                    return modelData2;
                                }
                                else {
                                    if (isSolid) {
                                        if (n4 >= 1446803360) {
                                            throw new IllegalStateException();
                                        }
                                        modelData.method1194();
                                    }
                                    ObjectComposition.ObjectDefinition_cachedModelData.put(modelData, n5);
                                }
                            }
                            if (length > 1) {
                                if (n4 >= 1446803360) {
                                    throw new IllegalStateException();
                                }
                                ObjectComposition.field1691[i] = modelData;
                            }
                        }
                        if (length > 1) {
                            if (n4 >= 1446803360) {
                                throw new IllegalStateException();
                            }
                            modelData = new ModelData(ObjectComposition.field1691, length);
                        }
                    }
                }
                else {
                    int n6 = -1;
                    int j = 0;
                    while (j < this.models.length) {
                        if (n4 >= 1446803360) {
                            throw new IllegalStateException();
                        }
                        if (this.models[j] == n) {
                            if (n4 >= 1446803360) {
                                throw new IllegalStateException();
                            }
                            n6 = j;
                            break;
                        }
                        else {
                            ++j;
                        }
                    }
                    if (n6 == -1) {
                        modelData2 = null;
                        return modelData2;
                    }
                    int n7 = this.modelIds[n6];
                    final boolean isSolid2 = this.isSolid;
                    boolean b2;
                    if (n2 > 3) {
                        if (n4 >= 1446803360) {
                            throw new IllegalStateException();
                        }
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    final boolean b3 = isSolid2 ^ b2;
                    if (b3) {
                        n7 += 65536;
                    }
                    modelData = (ModelData)ObjectComposition.ObjectDefinition_cachedModelData.wr(n7);
                    if (null == modelData) {
                        if (n4 >= 1446803360) {
                            throw new IllegalStateException();
                        }
                        modelData = ModelData.ModelData_get(class157.ObjectDefinition_modelsArchive, n7 & 0xFFFF, 0);
                        if (null == modelData) {
                            if (n4 >= 1446803360) {
                                throw new IllegalStateException();
                            }
                            modelData2 = null;
                            return modelData2;
                        }
                        else {
                            if (b3) {
                                if (n4 >= 1446803360) {
                                    throw new IllegalStateException();
                                }
                                modelData.method1194();
                            }
                            ObjectComposition.ObjectDefinition_cachedModelData.put(modelData, n7);
                        }
                    }
                }
                while (true) {
                    Label_0893: {
                        if (128 != this.modelSizeX * -60584503) {
                            break Label_0893;
                        }
                        if (n4 >= 1446803360) {
                            throw new IllegalStateException();
                        }
                        if (128 != -950870759 * this.modelHeight) {
                            break Label_0893;
                        }
                        if (n4 >= 1446803360) {
                            throw new IllegalStateException();
                        }
                        int n8;
                        if (-1734306655 * this.modelSizeY != 128) {
                            if (n4 >= 1446803360) {
                                throw new IllegalStateException();
                            }
                            break Label_0893;
                        }
                        else {
                            n8 = 0;
                        }
                        while (true) {
                            Label_0551: {
                                if (105607279 * this.offsetX != 0) {
                                    break Label_0551;
                                }
                                if (n4 >= 1446803360) {
                                    throw new IllegalStateException();
                                }
                                if (0 != this.offsetHeight * -1068622067) {
                                    break Label_0551;
                                }
                                if (n4 >= 1446803360) {
                                    throw new IllegalStateException();
                                }
                                int n9;
                                if (this.offsetY * 629285153 != 0) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    break Label_0551;
                                }
                                else {
                                    n9 = 0;
                                }
                                final ModelData modelData3 = modelData;
                                boolean b4 = false;
                                Label_1074: {
                                    if (0 == n2) {
                                        if (n4 >= 1446803360) {
                                            throw new IllegalStateException();
                                        }
                                        if (n8 == 0 && n9 == 0) {
                                            if (n4 >= 1446803360) {
                                                throw new IllegalStateException();
                                            }
                                            b4 = true;
                                            break Label_1074;
                                        }
                                    }
                                    b4 = false;
                                }
                                boolean b5;
                                if (this.recolorFrom == null) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    b5 = true;
                                }
                                else {
                                    b5 = false;
                                }
                                boolean b6;
                                if (this.retextureFrom == null) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    b6 = true;
                                }
                                else {
                                    b6 = false;
                                }
                                final ModelData modelData4 = new ModelData(modelData3, b4, b5, b6, true);
                                if (4 == n) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    if (n2 > 3) {
                                        if (n4 >= 1446803360) {
                                            throw new IllegalStateException();
                                        }
                                        modelData4.method1206(256);
                                        modelData4.changeOffset(45, 0, -45);
                                    }
                                }
                                final int n10 = n2 & 0x3;
                                if (n10 != 0) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    modelData4.method1188();
                                }
                                else if (n10 == 2) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    modelData4.method1190();
                                }
                                else if (n10 == 3) {
                                    modelData4.method1189();
                                }
                                if (this.recolorFrom != null) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    for (int k = 0; k < this.recolorFrom.length; ++k) {
                                        if (n4 >= 1446803360) {
                                            throw new IllegalStateException();
                                        }
                                        ModelData.lm(modelData4, this.recolorFrom[k], this.recolorTo[k]);
                                    }
                                }
                                if (null != this.retextureFrom) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    for (int l = 0; l < this.retextureFrom.length; ++l) {
                                        if (n4 >= 1446803360) {
                                            throw new IllegalStateException();
                                        }
                                        ModelData.jw(modelData4, this.retextureFrom[l], this.retextureTo[l]);
                                    }
                                }
                                if (n8 != 0) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    modelData4.resize(this.modelSizeX * -60584503, this.modelHeight * -950870759, -1734306655 * this.modelSizeY);
                                }
                                if (n9 != 0) {
                                    if (n4 >= 1446803360) {
                                        throw new IllegalStateException();
                                    }
                                    modelData4.changeOffset(105607279 * this.offsetX, this.offsetHeight * -1068622067, this.offsetY * 629285153);
                                }
                                modelData2 = modelData4;
                                return modelData2;
                            }
                            int n9 = 1;
                            continue;
                        }
                    }
                    int n8 = 1;
                    continue;
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "hq.ay(" + ')');
            }
            return modelData2;
        }
    }
    
    public static void bv() {
        ObjectComposition.ObjectDefinition_cached.clear();
        ObjectComposition.ObjectDefinition_cachedModelData.clear();
        ObjectComposition.ObjectDefinition_cachedEntities.clear();
        ObjectComposition.ObjectDefinition_cachedModels.clear();
    }
    
    public final Model bo(final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5, final SequenceDefinition sequenceDefinition, final int n6) {
        long n7;
        if (null == this.models) {
            n7 = n2 + (this.id * -1529817365 << 10);
        }
        else {
            n7 = n2 + ((this.id * -1529817365 << 10) + (n << 3));
        }
        Model dg = (Model)ObjectComposition.ObjectDefinition_cachedModels.wr(n7);
        if (dg == null) {
            final ModelData modelData = this.getModelData(n, n2, -2126302636);
            if (modelData == null) {
                return null;
            }
            dg = modelData.dg(1489985345 + this.ambient * 1284125631, 347244718 + this.contrast * -18088891, 149066266, -10, 939406618);
            ObjectComposition.ObjectDefinition_cachedModels.put(dg, n7);
        }
        if (sequenceDefinition == null && -1 == this.clipType * -1553366609) {
            return dg;
        }
        Model model;
        if (null != sequenceDefinition) {
            model = SequenceDefinition.ef(sequenceDefinition, dg, n6, n2, 16711935);
        }
        else {
            model = dg.toSharedSequenceModel(true);
        }
        if (1681064148 * this.clipType >= 0) {
            model = model.bp(array, n3, n4, n5, false, -1877991058 * this.clipType);
        }
        return model;
    }
    
    public static boolean bp(final ObjectComposition objectComposition, final int n) {
        if (objectComposition == null) {
            objectComposition.by(n);
        }
        try {
            if (objectComposition.modelIds != null) {
                boolean b = true;
                for (int i = 0; i < objectComposition.modelIds.length; ++i) {
                    if (n >= -589150360) {
                        throw new IllegalStateException();
                    }
                    b &= class157.ObjectDefinition_modelsArchive.tryLoadFile(objectComposition.modelIds[i] & 0xFFFF, 0, (byte)112);
                }
                return b;
            }
            if (n >= -589150360) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.aq(" + ')');
        }
    }
    
    public boolean bp() {
        if (this.soundEffectIds == null) {
            return this.ambientSoundId * 1970571505 != -1 || null != this.transforms;
        }
        for (int i = 0; i < this.soundEffectIds.length; ++i) {
            if (-1 != this.soundEffectIds[i]) {
                final ObjectComposition vmethod3248 = class144.vmethod3248(this.soundEffectIds[i], (short)27600);
                if (-1 != 1970571505 * vmethod3248.ambientSoundId || vmethod3248.transforms != null) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean bt(final ObjectComposition objectComposition, final int n) {
        if (objectComposition == null) {
            return objectComposition.needsModelFiles(n);
        }
        if (objectComposition.models != null) {
            for (int i = 0; i < objectComposition.models.length; ++i) {
                if (objectComposition.models[i] == n) {
                    return class157.ObjectDefinition_modelsArchive.tryLoadFile(objectComposition.modelIds[i] & 0xFFFF, 0, (byte)65);
                }
            }
            return true;
        }
        if (null == objectComposition.modelIds) {
            return true;
        }
        if (n != 10) {
            return true;
        }
        boolean b = true;
        for (int j = 0; j < objectComposition.modelIds.length; ++j) {
            b &= class157.ObjectDefinition_modelsArchive.tryLoadFile(objectComposition.modelIds[j] & 0x60DA8F16, 0, (byte)69);
        }
        return b;
    }
    
    public final ObjectComposition bt() {
        int expandBounds = -1;
        if (-1 != 1411927451 * this.transformVarbit) {
            expandBounds = class252.expandBounds(1411927451 * this.transformVarbit, 1931996319);
        }
        else if (1685173773 * this.transformVarp != -1) {
            expandBounds = Varps.Varps_main[this.transformVarp * 1685173773];
        }
        int n;
        if (expandBounds >= 0 && expandBounds < this.soundEffectIds.length - 1) {
            n = this.soundEffectIds[expandBounds];
        }
        else {
            n = this.soundEffectIds[this.soundEffectIds.length - 1];
        }
        if (-1 != n) {
            return class144.vmethod3248(n, (short)2504);
        }
        return null;
    }
    
    public void pb(final int n, final Node node) {
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
    
    void postDecode(final byte b) {
        try {
            if (this.int1 * 415653149 == -1) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                this.int1 = 0;
                Label_0084: {
                    if (null != this.modelIds) {
                        if (null != this.models) {
                            if (b <= 1) {
                                this.nk();
                                return;
                            }
                            if (this.models[0] != 10) {
                                break Label_0084;
                            }
                        }
                        this.int1 = 1041321269;
                    }
                }
                for (int i = 0; i < 5; ++i) {
                    if (this.actions[i] != null) {
                        this.int1 = 1041321269;
                    }
                }
            }
            if (-1 == -1850643527 * this.int3) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                int n;
                if (this.interactType * -973955889 != 0) {
                    if (b <= 1) {
                        this.nk();
                        return;
                    }
                    n = 1;
                }
                else {
                    n = 0;
                }
                this.int3 = n * 1776888457;
            }
            this.nk();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.aw(" + ')');
        }
    }
    
    static Script postDecode(final int i, final int n, final byte b) {
        try {
            final Script script = (Script)Script.Script_cached.wr(i << 16);
            if (script != null) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                return script;
            }
            else {
                final int fileFlat = AbstractArchive.getFileFlat(class126.archive12, String.valueOf(i), 1230677243);
                if (fileFlat != -1) {
                    final byte[] sh = AbstractArchive.sh(class126.archive12, fileFlat, (byte)(-8));
                    if (sh != null) {
                        if (sh.length <= 1) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            return null;
                        }
                        else {
                            final Script script2 = class33.newScript(sh, (byte)1);
                            if (script2 != null) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                Script.Script_cached.put(script2, i << 16);
                                return script2;
                            }
                        }
                    }
                    return null;
                }
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.aw(" + ')');
        }
    }
    
    void am() {
        if (this.int1 * -1053247149 == -1) {
            this.int1 = 0;
            if (null != this.modelIds && (null == this.models || this.models[0] == 10)) {
                this.int1 = 1041321269;
            }
            for (int i = 0; i < 5; ++i) {
                if (this.actions[i] != null) {
                    this.int1 = 1041321269;
                }
            }
        }
        if (-1 == -1850643527 * this.int3) {
            this.int3 = ((this.interactType * -973955889 != 0) ? 1 : 0) * 809171642;
        }
    }
    
    public final Renderable getEntity(final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5, final byte b) {
        try {
            long n6;
            if (this.models == null) {
                if (b >= -1) {
                    throw new IllegalStateException();
                }
                n6 = (this.id * -1529817365 << 10) + n2;
            }
            else {
                n6 = n2 + ((-1529817365 * this.id << 10) + (n << 3));
            }
            Renderable renderable = (Renderable)ObjectComposition.ObjectDefinition_cachedEntities.wr(n6);
            if (null == renderable) {
                if (b >= -1) {
                    throw new IllegalStateException();
                }
                final ModelData modelData = this.getModelData(n, n2, 930909307);
                if (modelData == null) {
                    if (b >= -1) {
                        throw new IllegalStateException();
                    }
                    return null;
                }
                else {
                    if (!this.isRotated) {
                        if (b >= -1) {
                            throw new IllegalStateException();
                        }
                        renderable = modelData.dg(64 + this.ambient * 1284125631, 768 + -18088891 * this.contrast, -50, -10, -50);
                    }
                    else {
                        modelData.ambient = (short)(1284125631 * this.ambient + 64);
                        modelData.contrast = (short)(this.contrast * -18088891 + 768);
                        modelData.calculateVertexNormals();
                        renderable = modelData;
                    }
                    ObjectComposition.ObjectDefinition_cachedEntities.put(renderable, n6);
                }
            }
            if (this.isRotated) {
                if (b >= -1) {
                    throw new IllegalStateException();
                }
                renderable = ((ModelData)renderable).qc();
            }
            if (-1437543955 * this.clipType >= 0) {
                if (b >= -1) {
                    throw new IllegalStateException();
                }
                if (renderable instanceof Model) {
                    renderable = ((Model)renderable).bp(array, n3, n4, n5, true, this.clipType * -1437543955);
                }
                else if (renderable instanceof ModelData) {
                    if (b >= -1) {
                        throw new IllegalStateException();
                    }
                    renderable = ((ModelData)renderable).method1187(array, n3, n4, n5, true, -1437543955 * this.clipType);
                }
            }
            return renderable;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.al(" + ')');
        }
    }
    
    void decode(final Buffer buffer, final int n) {
        if (n == 1) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra > 0) {
                if (this.modelIds != null && !ObjectComposition.ObjectDefinition_isLowDetail) {
                    buffer.offset += -254100545 * ra;
                }
                else {
                    this.models = new int[ra];
                    this.modelIds = new int[ra];
                    for (int i = 0; i < ra; ++i) {
                        this.modelIds[i] = buffer.readUnsignedShort(283438923);
                        this.models[i] = Buffer.ra(buffer, (byte)7);
                    }
                }
            }
        }
        else if (n == 2) {
            this.name = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 5) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            if (ra2 > 0) {
                if (this.modelIds == null || ObjectComposition.ObjectDefinition_isLowDetail) {
                    this.models = null;
                    this.modelIds = new int[ra2];
                    for (int j = 0; j < ra2; ++j) {
                        this.modelIds[j] = buffer.readUnsignedShort(474619975);
                    }
                }
                else {
                    buffer.offset += ra2 * 1262255402;
                }
            }
        }
        else if (n == 14) {
            this.sizeX = Buffer.ra(buffer, (byte)7) * 1205654711;
        }
        else if (15 == n) {
            this.sizeY = Buffer.ra(buffer, (byte)7) * 1159818229;
        }
        else if (n == 17) {
            this.interactType = 0;
            this.boolean1 = false;
        }
        else if (n == 18) {
            this.boolean1 = false;
        }
        else if (n == 19) {
            this.int1 = Buffer.ra(buffer, (byte)7) * 1041321269;
        }
        else if (n == 21) {
            this.clipType = 0;
        }
        else if (n == 22) {
            this.isRotated = true;
        }
        else if (23 == n) {
            this.modelClipped = true;
        }
        else if (n == 24) {
            this.animationId = buffer.readUnsignedShort(-1464875629) * -1142530427;
            if (65535 == 1292954189 * this.animationId) {
                this.animationId = 1142530427;
            }
        }
        else if (27 == n) {
            this.interactType = 1356917295;
        }
        else if (n == 28) {
            this.int2 = Buffer.ra(buffer, (byte)7) * -1893671375;
        }
        else if (n == 29) {
            this.ambient = Buffer.wu(buffer, 435772489) * 524532799;
        }
        else if (39 == n) {
            this.contrast = Buffer.wu(buffer, 435772489) * -1238182971;
        }
        else if (n >= 30 && n < 35) {
            this.actions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
            if (this.actions[n - 30].equalsIgnoreCase(Strings.ac)) {
                this.actions[n - 30] = null;
            }
        }
        else if (n == 40) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            this.recolorFrom = new short[ra3];
            this.recolorTo = new short[ra3];
            for (int k = 0; k < ra3; ++k) {
                this.recolorFrom[k] = (short)buffer.readUnsignedShort(-545408305);
                this.recolorTo[k] = (short)buffer.readUnsignedShort(-2106264935);
            }
        }
        else if (n == 41) {
            final int ra4 = Buffer.ra(buffer, (byte)7);
            this.retextureFrom = new short[ra4];
            this.retextureTo = new short[ra4];
            for (int l = 0; l < ra4; ++l) {
                this.retextureFrom[l] = (short)buffer.readUnsignedShort(25507155);
                this.retextureTo[l] = (short)buffer.readUnsignedShort(399854598);
            }
        }
        else if (61 == n) {
            buffer.readUnsignedShort(-222573929);
        }
        else if (62 == n) {
            this.isSolid = true;
        }
        else if (64 == n) {
            this.clipped = false;
        }
        else if (65 == n) {
            this.modelSizeX = buffer.readUnsignedShort(184416091) * 1039146105;
        }
        else if (n == 66) {
            this.modelHeight = buffer.readUnsignedShort(-715140535) * -677695703;
        }
        else if (n == 67) {
            this.modelSizeY = buffer.readUnsignedShort(-1344606068) * 1862946657;
        }
        else if (n == 68) {
            this.mapSceneId = buffer.readUnsignedShort(143881282) * -476568133;
        }
        else if (69 == n) {
            Buffer.ra(buffer, (byte)7);
        }
        else if (n == 70) {
            this.offsetX = buffer.readUnsignedByte((byte)(-114)) * -327422321;
        }
        else if (71 == n) {
            this.offsetHeight = buffer.readUnsignedByte((byte)(-69)) * 956024773;
        }
        else if (72 == n) {
            this.offsetY = buffer.readUnsignedByte((byte)(-95)) * -127229215;
        }
        else if (73 == n) {
            this.boolean2 = true;
        }
        else if (74 == n) {
            this.nonFlatShading = true;
        }
        else if (n == 75) {
            this.int3 = Buffer.ra(buffer, (byte)7) * 1776888457;
        }
        else if (n != 77 && n != 92) {
            if (78 == n) {
                this.ambientSoundId = buffer.readUnsignedShort(290026354) * -38705135;
                this.int7 = Buffer.ra(buffer, (byte)7) * 1190823625;
            }
            else if (n == 79) {
                this.int5 = buffer.readUnsignedShort(-1061334761) * 1257958995;
                this.int6 = buffer.readUnsignedShort(-785424707) * 230715233;
                this.int7 = Buffer.ra(buffer, (byte)7) * 1190823625;
                final int ra5 = Buffer.ra(buffer, (byte)7);
                this.transforms = new int[ra5];
                for (int n2 = 0; n2 < ra5; ++n2) {
                    this.transforms[n2] = buffer.readUnsignedShort(-1282455724);
                }
            }
            else if (81 == n) {
                this.clipType = Buffer.ra(buffer, (byte)7) * 708044032;
            }
            else if (n == 82) {
                this.mapIconId = buffer.readUnsignedShort(-767086784) * -1683785829;
            }
            else if (89 == n) {
                this.boolean3 = false;
            }
            else if (n == 249) {
                this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-7));
            }
        }
        else {
            this.transformVarbit = buffer.readUnsignedShort(-202927169) * 1157714067;
            if (1411927451 * this.transformVarbit == 65535) {
                this.transformVarbit = -1157714067;
            }
            this.transformVarp = buffer.readUnsignedShort(-270409479) * -1863808827;
            if (1685173773 * this.transformVarp == 65535) {
                this.transformVarp = 1863808827;
            }
            int unsignedShort = -1;
            if (n == 92) {
                unsignedShort = buffer.readUnsignedShort(-415454254);
                if (65535 == unsignedShort) {
                    unsignedShort = -1;
                }
            }
            final int ra6 = Buffer.ra(buffer, (byte)7);
            this.soundEffectIds = new int[ra6 + 2];
            for (int n3 = 0; n3 <= ra6; ++n3) {
                this.soundEffectIds[n3] = buffer.readUnsignedShort(583985562);
                if (this.soundEffectIds[n3] == 65535) {
                    this.soundEffectIds[n3] = -1;
                }
            }
            this.soundEffectIds[1 + ra6] = unsignedShort;
        }
    }
    
    public void nk() {
        ScriptFrame.client.getCallbacks().post((Object)new PostObjectComposition((net.runelite.api.ObjectComposition)this));
    }
    
    public static ObjectComposition qt(final ObjectComposition objectComposition) {
        if (objectComposition == null) {
            objectComposition.getName();
        }
        int expandBounds = -1;
        if (-1 != 1411927451 * objectComposition.transformVarbit) {
            expandBounds = class252.expandBounds(1411927451 * objectComposition.transformVarbit, 1305493297);
        }
        else if (1685173773 * objectComposition.transformVarp != -1) {
            expandBounds = Varps.Varps_main[objectComposition.transformVarp * 1685173773];
        }
        int n;
        if (expandBounds >= 0 && expandBounds < objectComposition.soundEffectIds.length - 1) {
            n = objectComposition.soundEffectIds[expandBounds];
        }
        else {
            n = objectComposition.soundEffectIds[objectComposition.soundEffectIds.length - 1];
        }
        if (-1 != n) {
            return class144.vmethod3248(n, (short)17939);
        }
        return null;
    }
    
    public static Model lb(final ObjectComposition objectComposition, final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5, final SequenceDefinition sequenceDefinition, final int n6) {
        if (objectComposition == null) {
            objectComposition.getId();
        }
        long n7;
        if (null == objectComposition.models) {
            n7 = n2 + (objectComposition.id * -1529817365 << 10);
        }
        else {
            n7 = n2 + ((objectComposition.id * -911274093 << 10) + (n << 3));
        }
        Model dg = (Model)ObjectComposition.ObjectDefinition_cachedModels.wr(n7);
        if (dg == null) {
            final ModelData modelData = objectComposition.getModelData(n, n2, -626716628);
            if (modelData == null) {
                return null;
            }
            dg = modelData.dg(-1541863509 + objectComposition.ambient * 1139591093, -430689957 + objectComposition.contrast * -18088891, -50, -10, -50);
            ObjectComposition.ObjectDefinition_cachedModels.put(dg, n7);
        }
        if (sequenceDefinition == null && -1 == objectComposition.clipType * -1437543955) {
            return dg;
        }
        Model model;
        if (null != sequenceDefinition) {
            model = SequenceDefinition.ef(sequenceDefinition, dg, n6, n2, 16711935);
        }
        else {
            model = dg.toSharedSequenceModel(true);
        }
        if (-707241297 * objectComposition.clipType >= 0) {
            model = model.bp(array, n3, n4, n5, false, -1029637378 * objectComposition.clipType);
        }
        return model;
    }
    
    public static void bq() {
        ObjectComposition.ObjectDefinition_cached.clear();
        ObjectComposition.ObjectDefinition_cachedModelData.clear();
        ObjectComposition.ObjectDefinition_cachedEntities.clear();
        ObjectComposition.ObjectDefinition_cachedModels.clear();
    }
    
    public static boolean decodeNext(final int n, final int n2) {
        try {
            boolean b;
            if (0x0 != (n >> 22 & 0x1)) {
                if (n2 <= 740429811) {
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
            throw HealthBar.get(ex, "hq.au(" + ')');
        }
    }
    
    void decodeNext(final Buffer buffer, final int n, final byte b) {
        try {
            if (n == 1) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra > 0) {
                    if (b == -1) {
                        return;
                    }
                    if (this.models != null) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        if (!ObjectComposition.ObjectDefinition_isLowDetail) {
                            buffer.offset += -254100545 * ra;
                            return;
                        }
                        if (b == -1) {
                            return;
                        }
                    }
                    this.models = new int[ra];
                    this.models = new int[ra];
                    for (int i = 0; i < ra; ++i) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        this.modelIds[i] = buffer.readMedium(-1452279273);
                        this.modelIds[i] = Buffer.ra(buffer, (byte)7);
                    }
                }
            }
            else if (n == 2) {
                this.name = buffer.readStringCp1252NullTerminatedOrNull((byte)0);
            }
            else if (n == 5) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                final int ra2 = Buffer.ra(buffer, (byte)7);
                if (ra2 > 0) {
                    if (this.models == null || ObjectComposition.ObjectDefinition_isLowDetail) {
                        this.modelIds = null;
                        this.models = new int[ra2];
                        for (int j = 0; j < ra2; ++j) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            this.modelIds[j] = buffer.readInt(856545210);
                        }
                    }
                    else {
                        buffer.offset += ra2 * 1262255402;
                    }
                }
            }
            else if (n == 14) {
                if (b == -1) {
                    return;
                }
                this.mapIconId = Buffer.ra(buffer, (byte)7) * 1205654711;
            }
            else if (15 == n) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                this.mapSceneId = Buffer.ra(buffer, (byte)7) * 1159818229;
            }
            else if (n == 17) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                this.int6 = 0;
                this.boolean2 = false;
            }
            else if (n == 18) {
                this.modelClipped = false;
            }
            else if (n == 19) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                this.sizeY = Buffer.ra(buffer, (byte)7) * 1041321269;
            }
            else if (n == 21) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                this.offsetX = 0;
            }
            else if (n == 22) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                this.nonFlatShading = true;
            }
            else if (23 == n) {
                this.boolean2 = true;
            }
            else if (n == 24) {
                this.int2 = buffer.method2513(-1984039376) * -1142530427;
                if (65535 == 1292954189 * this.mapSceneId) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    this.id = 1142530427;
                }
            }
            else if (27 == n) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                this.int5 = 1356917295;
            }
            else if (n == 28) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                this.sizeY = Buffer.ra(buffer, (byte)7) * -1893671375;
            }
            else if (n == 29) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                this.offsetHeight = Buffer.wu(buffer, 435772489) * 524532799;
            }
            else if (39 == n) {
                this.modelHeight = Buffer.wu(buffer, 435772489) * -1238182971;
            }
            else {
                if (n >= 30) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    if (n < 35) {
                        this.actions[n - 30] = buffer.readStringCp1252NullTerminatedOrNull((byte)0);
                        if (!this.actions[n - 30].equalsIgnoreCase(Strings.er)) {
                            return;
                        }
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        this.actions[n - 30] = null;
                        return;
                    }
                }
                if (n == 40) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    final int ra3 = Buffer.ra(buffer, (byte)7);
                    this.recolorFrom = new short[ra3];
                    this.recolorTo = new short[ra3];
                    for (int k = 0; k < ra3; ++k) {
                        this.recolorTo[k] = (short)buffer.method2518(780781429);
                        this.retextureTo[k] = (short)buffer.method2491(-898629482);
                    }
                }
                else if (n == 41) {
                    if (b == -1) {
                        return;
                    }
                    final int ra4 = Buffer.ra(buffer, (byte)7);
                    this.recolorFrom = new short[ra4];
                    this.retextureTo = new short[ra4];
                    for (int l = 0; l < ra4; ++l) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        this.retextureFrom[l] = (short)buffer.readUnsignedShort(-646955319);
                        this.recolorFrom[l] = (short)buffer._readUnsignedByteSub(-1186018024);
                    }
                }
                else if (61 == n) {
                    buffer.method2513(-611613382);
                }
                else if (62 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    this.isRotated = true;
                }
                else if (64 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    this.clipped = false;
                }
                else if (65 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    this.offsetX = buffer.method2513(-1676166404) * 1039146105;
                }
                else if (n == 66) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    this.offsetHeight = buffer.readUnsignedByteAdd(-1266856253) * -677695703;
                }
                else if (n == 67) {
                    if (b == -1) {
                        return;
                    }
                    this.offsetY = buffer.method2541(-635017095) * 1862946657;
                }
                else if (n == 68) {
                    this.id = buffer.readUnsignedShort(-2061884866) * -476568133;
                }
                else if (69 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    Buffer.ra(buffer, (byte)7);
                }
                else if (n == 70) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    this.modelSizeX = buffer.method2533((byte)(-65)) * -327422321;
                }
                else if (71 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    this.offsetY = buffer.method2533((byte)(-38)) * 956024773;
                }
                else if (72 == n) {
                    if (b == -1) {
                        return;
                    }
                    this.ambient = buffer.readUnsignedByte((byte)(-28)) * -127229215;
                }
                else if (73 == n) {
                    if (b == -1) {
                        return;
                    }
                    this.boolean2 = true;
                }
                else if (74 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    this.nonFlatShading = true;
                }
                else if (n == 75) {
                    if (b == -1) {
                        return;
                    }
                    this.interactType = Buffer.ra(buffer, (byte)7) * 1776888457;
                }
                else {
                    if (n != 77) {
                        if (n == 92) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                        }
                        else if (78 == n) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            this.ambientSoundId = buffer.method2513(-1713656342) * -38705135;
                            this.ambientSoundId = Buffer.ra(buffer, (byte)7) * 1190823625;
                            return;
                        }
                        else if (n == 79) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            this.int1 = buffer.readSignedShortAddLE(-1181862673) * 1257958995;
                            this.int1 = buffer.jn(-905484374) * 230715233;
                            this.int2 = Buffer.ra(buffer, (byte)7) * 1190823625;
                            final int ra5 = Buffer.ra(buffer, (byte)7);
                            this.transforms = new int[ra5];
                            for (int n2 = 0; n2 < ra5; ++n2) {
                                this.transforms[n2] = buffer.readUnsignedShort(-1316711094);
                            }
                            return;
                        }
                        else {
                            if (81 == n) {
                                this.offsetX = Buffer.ra(buffer, (byte)7) * 708044032;
                                return;
                            }
                            if (n == 82) {
                                if (b == -1) {
                                    return;
                                }
                                this.int6 = buffer.readUnsignedShortAddLE(-1961096702) * -1683785829;
                                return;
                            }
                            else if (89 == n) {
                                if (b == -1) {
                                    throw new IllegalStateException();
                                }
                                this.clipped = false;
                                return;
                            }
                            else {
                                if (n == 249) {
                                    this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-79));
                                }
                                return;
                            }
                        }
                    }
                    this.clipType = buffer.method2491(-54438080) * 1157714067;
                    if (1411927451 * this.modelHeight == 65535) {
                        if (b == -1) {
                            return;
                        }
                        this.modelHeight = -1157714067;
                    }
                    this.offsetX = buffer.method2498(-1244092173) * -1863808827;
                    if (1685173773 * this.contrast == 65535) {
                        this.transformVarp = 1863808827;
                    }
                    int signedShortAddLE = -1;
                    if (n == 92) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        signedShortAddLE = buffer.readSignedShortAddLE(-423137913);
                        if (65535 == signedShortAddLE) {
                            if (b == -1) {
                                return;
                            }
                            signedShortAddLE = -1;
                        }
                    }
                    final int ra6 = Buffer.ra(buffer, (byte)7);
                    this.transforms = new int[ra6 + 2];
                    for (int n3 = 0; n3 <= ra6; ++n3) {
                        this.soundEffectIds[n3] = buffer.readUnsignedShort(-95483605);
                        if (this.transforms[n3] == 65535) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            this.transforms[n3] = -1;
                        }
                    }
                    this.soundEffectIds[1 + ra6] = signedShortAddLE;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.au(" + ')');
        }
    }
    
    public final Model getModelDynamic(final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5, final SequenceDefinition sequenceDefinition, final int n6, final int n7) {
        try {
            long n8;
            if (null == this.models) {
                if (n7 == -170244579) {
                    throw new IllegalStateException();
                }
                n8 = n2 + (this.id * -1529817365 << 10);
            }
            else {
                n8 = n2 + ((this.id * -1529817365 << 10) + (n << 3));
            }
            Model dg = (Model)ObjectComposition.ObjectDefinition_cachedModels.wr(n8);
            if (dg == null) {
                final ModelData modelData = this.getModelData(n, n2, 1035462813);
                if (modelData == null) {
                    if (n7 == -170244579) {
                        throw new IllegalStateException();
                    }
                    return null;
                }
                else {
                    dg = modelData.dg(64 + this.ambient * 1284125631, 768 + this.contrast * -18088891, -50, -10, -50);
                    ObjectComposition.ObjectDefinition_cachedModels.put(dg, n8);
                }
            }
            if (sequenceDefinition == null) {
                if (n7 == -170244579) {
                    throw new IllegalStateException();
                }
                if (-1 == this.clipType * -1437543955) {
                    return dg;
                }
            }
            Model model;
            if (null != sequenceDefinition) {
                if (n7 == -170244579) {
                    throw new IllegalStateException();
                }
                model = SequenceDefinition.ef(sequenceDefinition, dg, n6, n2, 16711935);
            }
            else {
                model = dg.toSharedSequenceModel(true);
            }
            if (-1437543955 * this.clipType >= 0) {
                model = model.bp(array, n3, n4, n5, false, -1437543955 * this.clipType);
            }
            return model;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.aa(" + ')');
        }
    }
    
    public IterableHashTable getParams() {
        return (IterableHashTable)this.params;
    }
    
    public String getStringParam(final int n, final String s, final int n2) {
        try {
            return EnumComposition.method1014(this.params, n, s, 2110621235);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.ai(" + ')');
        }
    }
    
    public int ii() {
        return this.int6 * -1060997983;
    }
    
    public boolean bh() {
        if (this.soundEffectIds == null) {
            return this.ambientSoundId * 1970571505 != -1 || null != this.transforms;
        }
        for (int i = 0; i < this.soundEffectIds.length; ++i) {
            if (-1 != this.soundEffectIds[i]) {
                final ObjectComposition vmethod3248 = class144.vmethod3248(this.soundEffectIds[i], (short)19514);
                if (-1 != 1970571505 * vmethod3248.ambientSoundId || vmethod3248.transforms != null) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean by(final int n) {
        try {
            if (this.models != null) {
                boolean b = true;
                for (int i = 0; i < this.modelIds.length; ++i) {
                    if (n >= -589150360) {
                        throw new IllegalStateException();
                    }
                    b &= class157.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[i] & 0xFFFF, 0, (byte)112);
                }
                return b;
            }
            if (n >= -589150360) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.aq(" + ')');
        }
    }
    
    void ar() {
        if (this.int1 * 415653149 == -1) {
            this.int1 = 0;
            if (null != this.modelIds && (null == this.models || this.models[0] == 10)) {
                this.int1 = 1041321269;
            }
            for (int i = 0; i < 5; ++i) {
                if (this.actions[i] != null) {
                    this.int1 = 1041321269;
                }
            }
        }
        if (-1 == -1850643527 * this.int3) {
            this.int3 = ((this.interactType * -973955889 != 0) ? 1 : 0) * 1776888457;
        }
    }
    
    public String bg(final int n, final String s) {
        return EnumComposition.method1014(this.params, n, s, 1591817112);
    }
    
    public static Model la(final ObjectComposition objectComposition, final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5) {
        long n6;
        if (null == objectComposition.models) {
            n6 = (1473477817 * objectComposition.id << 10) + n2;
        }
        else {
            n6 = (objectComposition.id * -1529817365 << 10) + (n << 3) + n2;
        }
        Model model = (Model)ObjectComposition.ObjectDefinition_cachedModels.wr(n6);
        if (model == null) {
            final ModelData modelData = objectComposition.getModelData(n, n2, 837049316);
            if (modelData == null) {
                return null;
            }
            model = modelData.dg(objectComposition.ambient * 1284125631 + 64, 210937984 + -446151184 * objectComposition.contrast, -50, -625708688, -50);
            ObjectComposition.ObjectDefinition_cachedModels.put(model, n6);
        }
        if (objectComposition.clipType * 1827119507 >= 0) {
            model = model.bp(array, n3, n4, n5, true, 414226600 * objectComposition.clipType);
        }
        return model;
    }
    
    public static Renderable vy(final ObjectComposition objectComposition, final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5) {
        long n6;
        if (objectComposition.models == null) {
            n6 = (objectComposition.id * -1529817365 << 10) + n2;
        }
        else {
            n6 = n2 + ((-1529817365 * objectComposition.id << 10) + (n << 3));
        }
        Renderable renderable = (Renderable)ObjectComposition.ObjectDefinition_cachedEntities.wr(n6);
        if (null == renderable) {
            final ModelData modelData = objectComposition.getModelData(n, n2, -1393577886);
            if (modelData == null) {
                return null;
            }
            if (!objectComposition.isRotated) {
                renderable = modelData.dg(64 + objectComposition.ambient * 1284125631, 768 + -18088891 * objectComposition.contrast, -50, -10, -50);
            }
            else {
                modelData.ambient = (short)(1284125631 * objectComposition.ambient + 64);
                modelData.contrast = (short)(objectComposition.contrast * -18088891 + 768);
                modelData.calculateVertexNormals();
                renderable = modelData;
            }
            ObjectComposition.ObjectDefinition_cachedEntities.put(renderable, n6);
        }
        if (objectComposition.isRotated) {
            renderable = ((ModelData)renderable).qc();
        }
        if (-1437543955 * objectComposition.clipType >= 0) {
            if (renderable instanceof Model) {
                renderable = ((Model)renderable).bp(array, n3, n4, n5, true, objectComposition.clipType * -1437543955);
            }
            else if (renderable instanceof ModelData) {
                renderable = ((ModelData)renderable).method1187(array, n3, n4, n5, true, -1437543955 * objectComposition.clipType);
            }
        }
        return renderable;
    }
    
    public final ObjectComposition bn() {
        int expandBounds = -1;
        if (-1 != 259093902 * this.transformVarbit) {
            expandBounds = class252.expandBounds(-153347516 * this.transformVarbit, 1381778669);
        }
        else if (1685173773 * this.transformVarp != -1) {
            expandBounds = Varps.Varps_main[this.transformVarp * -576986873];
        }
        int n;
        if (expandBounds >= 0 && expandBounds < this.soundEffectIds.length - 1) {
            n = this.soundEffectIds[expandBounds];
        }
        else {
            n = this.soundEffectIds[this.soundEffectIds.length - 1];
        }
        if (-1 != n) {
            return class144.vmethod3248(n, (short)30369);
        }
        return null;
    }
    
    public final boolean method1085(final int n, final int n2) {
        try {
            if (this.models != null) {
                int i = 0;
                while (i < this.models.length) {
                    if (n2 == -1754346109) {
                        throw new IllegalStateException();
                    }
                    if (this.models[i] == n) {
                        if (n2 == -1754346109) {
                            throw new IllegalStateException();
                        }
                        return class157.ObjectDefinition_modelsArchive.tryLoadFile(this.models[i] & 0xFFFF, 0, (byte)23);
                    }
                    else {
                        ++i;
                    }
                }
                return true;
            }
            if (n2 == -1754346109) {
                throw new IllegalStateException();
            }
            if (null == this.modelIds) {
                if (n2 == -1754346109) {
                    throw new IllegalStateException();
                }
                return true;
            }
            else {
                if (n == 10) {
                    boolean b = true;
                    for (int j = 0; j < this.modelIds.length; ++j) {
                        if (n2 == -1754346109) {
                            throw new IllegalStateException();
                        }
                        b &= class157.ObjectDefinition_modelsArchive.tryLoadFile(this.models[j] & 0xFFFF, 0, (byte)(-74));
                    }
                    return b;
                }
                if (n2 == -1754346109) {
                    throw new IllegalStateException();
                }
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.ab(" + ')');
        }
    }
    
    public final boolean needsModelFiles(final int n) {
        try {
            if (this.soundEffectIds != null) {
                for (int i = 0; i < this.transforms.length; ++i) {
                    if (-1 != this.soundEffectIds[i]) {
                        if (n >= -1928114592) {
                            throw new IllegalStateException();
                        }
                        final ObjectComposition vmethod3248 = class144.vmethod3248(this.transforms[i], (short)7207);
                        if (-1 == 1970571505 * vmethod3248.int2) {
                            if (n >= -1928114592) {
                                throw new IllegalStateException();
                            }
                            if (vmethod3248.soundEffectIds == null) {
                                continue;
                            }
                            if (n >= -1928114592) {
                                throw new IllegalStateException();
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            if (n >= -1928114592) {
                throw new IllegalStateException();
            }
            if (this.id * 1970571505 == -1) {
                if (n >= -1928114592) {
                    throw new IllegalStateException();
                }
                if (null == this.soundEffectIds) {
                    return false;
                }
                if (n >= -1928114592) {
                    throw new IllegalStateException();
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.ah(" + ')');
        }
    }
    
    public static void bl() {
        ObjectComposition.ObjectDefinition_cached.clear();
        ObjectComposition.ObjectDefinition_cachedModelData.clear();
        ObjectComposition.ObjectDefinition_cachedEntities.clear();
        ObjectComposition.ObjectDefinition_cachedModels.clear();
    }
    
    public static void zv(final ObjectComposition objectComposition, final Buffer buffer, final int n, final byte b) {
        if (objectComposition == null) {
            objectComposition.decodeNext(buffer, n, b);
            return;
        }
        try {
            if (n == 1) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra > 0) {
                    if (b == -1) {
                        return;
                    }
                    if (objectComposition.modelIds != null) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        if (!ObjectComposition.ObjectDefinition_isLowDetail) {
                            buffer.offset += -254100545 * ra;
                            return;
                        }
                        if (b == -1) {
                            return;
                        }
                    }
                    objectComposition.models = new int[ra];
                    objectComposition.modelIds = new int[ra];
                    for (int i = 0; i < ra; ++i) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        objectComposition.modelIds[i] = buffer.readUnsignedShort(-1452279273);
                        objectComposition.models[i] = Buffer.ra(buffer, (byte)7);
                    }
                }
            }
            else if (n == 2) {
                objectComposition.name = buffer.readStringCp1252NullTerminated((byte)0);
            }
            else if (n == 5) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                final int ra2 = Buffer.ra(buffer, (byte)7);
                if (ra2 > 0) {
                    if (objectComposition.modelIds == null || ObjectComposition.ObjectDefinition_isLowDetail) {
                        objectComposition.models = null;
                        objectComposition.modelIds = new int[ra2];
                        for (int j = 0; j < ra2; ++j) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            objectComposition.modelIds[j] = buffer.readUnsignedShort(856545210);
                        }
                    }
                    else {
                        buffer.offset += ra2 * 1262255402;
                    }
                }
            }
            else if (n == 14) {
                if (b == -1) {
                    return;
                }
                objectComposition.sizeX = Buffer.ra(buffer, (byte)7) * 1205654711;
            }
            else if (15 == n) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                objectComposition.sizeY = Buffer.ra(buffer, (byte)7) * 1159818229;
            }
            else if (n == 17) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                objectComposition.interactType = 0;
                objectComposition.boolean1 = false;
            }
            else if (n == 18) {
                objectComposition.boolean1 = false;
            }
            else if (n == 19) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                objectComposition.int1 = Buffer.ra(buffer, (byte)7) * 1041321269;
            }
            else if (n == 21) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                objectComposition.clipType = 0;
            }
            else if (n == 22) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                objectComposition.isRotated = true;
            }
            else if (23 == n) {
                objectComposition.modelClipped = true;
            }
            else if (n == 24) {
                objectComposition.animationId = buffer.readUnsignedShort(-1984039376) * -1142530427;
                if (65535 == 1292954189 * objectComposition.animationId) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    objectComposition.animationId = 1142530427;
                }
            }
            else if (27 == n) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                objectComposition.interactType = 1356917295;
            }
            else if (n == 28) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                objectComposition.int2 = Buffer.ra(buffer, (byte)7) * -1893671375;
            }
            else if (n == 29) {
                if (b == -1) {
                    throw new IllegalStateException();
                }
                objectComposition.ambient = Buffer.wu(buffer, 435772489) * 524532799;
            }
            else if (39 == n) {
                objectComposition.contrast = Buffer.wu(buffer, 435772489) * -1238182971;
            }
            else {
                if (n >= 30) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    if (n < 35) {
                        objectComposition.actions[n - 30] = buffer.readStringCp1252NullTerminated((byte)0);
                        if (!objectComposition.actions[n - 30].equalsIgnoreCase(Strings.ac)) {
                            return;
                        }
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        objectComposition.actions[n - 30] = null;
                        return;
                    }
                }
                if (n == 40) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    final int ra3 = Buffer.ra(buffer, (byte)7);
                    objectComposition.recolorFrom = new short[ra3];
                    objectComposition.recolorTo = new short[ra3];
                    for (int k = 0; k < ra3; ++k) {
                        objectComposition.recolorFrom[k] = (short)buffer.readUnsignedShort(780781429);
                        objectComposition.recolorTo[k] = (short)buffer.readUnsignedShort(-898629482);
                    }
                }
                else if (n == 41) {
                    if (b == -1) {
                        return;
                    }
                    final int ra4 = Buffer.ra(buffer, (byte)7);
                    objectComposition.retextureFrom = new short[ra4];
                    objectComposition.retextureTo = new short[ra4];
                    for (int l = 0; l < ra4; ++l) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        objectComposition.retextureFrom[l] = (short)buffer.readUnsignedShort(-646955319);
                        objectComposition.retextureTo[l] = (short)buffer.readUnsignedShort(-1186018024);
                    }
                }
                else if (61 == n) {
                    buffer.readUnsignedShort(-611613382);
                }
                else if (62 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    objectComposition.isSolid = true;
                }
                else if (64 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    objectComposition.clipped = false;
                }
                else if (65 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    objectComposition.modelSizeX = buffer.readUnsignedShort(-1676166404) * 1039146105;
                }
                else if (n == 66) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    objectComposition.modelHeight = buffer.readUnsignedShort(-1266856253) * -677695703;
                }
                else if (n == 67) {
                    if (b == -1) {
                        return;
                    }
                    objectComposition.modelSizeY = buffer.readUnsignedShort(-635017095) * 1862946657;
                }
                else if (n == 68) {
                    objectComposition.mapSceneId = buffer.readUnsignedShort(-2061884866) * -476568133;
                }
                else if (69 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    Buffer.ra(buffer, (byte)7);
                }
                else if (n == 70) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    objectComposition.offsetX = buffer.readUnsignedByte((byte)(-65)) * -327422321;
                }
                else if (71 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    objectComposition.offsetHeight = buffer.readUnsignedByte((byte)(-38)) * 956024773;
                }
                else if (72 == n) {
                    if (b == -1) {
                        return;
                    }
                    objectComposition.offsetY = buffer.readUnsignedByte((byte)(-28)) * -127229215;
                }
                else if (73 == n) {
                    if (b == -1) {
                        return;
                    }
                    objectComposition.boolean2 = true;
                }
                else if (74 == n) {
                    if (b == -1) {
                        throw new IllegalStateException();
                    }
                    objectComposition.nonFlatShading = true;
                }
                else if (n == 75) {
                    if (b == -1) {
                        return;
                    }
                    objectComposition.int3 = Buffer.ra(buffer, (byte)7) * 1776888457;
                }
                else {
                    if (n != 77) {
                        if (n == 92) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                        }
                        else if (78 == n) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            objectComposition.ambientSoundId = buffer.readUnsignedShort(-1713656342) * -38705135;
                            objectComposition.int7 = Buffer.ra(buffer, (byte)7) * 1190823625;
                            return;
                        }
                        else if (n == 79) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            objectComposition.int5 = buffer.readUnsignedShort(-1181862673) * 1257958995;
                            objectComposition.int6 = buffer.readUnsignedShort(-905484374) * 230715233;
                            objectComposition.int7 = Buffer.ra(buffer, (byte)7) * 1190823625;
                            final int ra5 = Buffer.ra(buffer, (byte)7);
                            objectComposition.transforms = new int[ra5];
                            for (int n2 = 0; n2 < ra5; ++n2) {
                                objectComposition.transforms[n2] = buffer.readUnsignedShort(-1316711094);
                            }
                            return;
                        }
                        else {
                            if (81 == n) {
                                objectComposition.clipType = Buffer.ra(buffer, (byte)7) * 708044032;
                                return;
                            }
                            if (n == 82) {
                                if (b == -1) {
                                    return;
                                }
                                objectComposition.mapIconId = buffer.readUnsignedShort(-1961096702) * -1683785829;
                                return;
                            }
                            else if (89 == n) {
                                if (b == -1) {
                                    throw new IllegalStateException();
                                }
                                objectComposition.boolean3 = false;
                                return;
                            }
                            else {
                                if (n == 249) {
                                    objectComposition.params = ChatChannel.addMessage(buffer, objectComposition.params, (byte)(-79));
                                }
                                return;
                            }
                        }
                    }
                    objectComposition.transformVarbit = buffer.readUnsignedShort(-54438080) * 1157714067;
                    if (1411927451 * objectComposition.transformVarbit == 65535) {
                        if (b == -1) {
                            return;
                        }
                        objectComposition.transformVarbit = -1157714067;
                    }
                    objectComposition.transformVarp = buffer.readUnsignedShort(-1244092173) * -1863808827;
                    if (1685173773 * objectComposition.transformVarp == 65535) {
                        objectComposition.transformVarp = 1863808827;
                    }
                    int unsignedShort = -1;
                    if (n == 92) {
                        if (b == -1) {
                            throw new IllegalStateException();
                        }
                        unsignedShort = buffer.readUnsignedShort(-423137913);
                        if (65535 == unsignedShort) {
                            if (b == -1) {
                                return;
                            }
                            unsignedShort = -1;
                        }
                    }
                    final int ra6 = Buffer.ra(buffer, (byte)7);
                    objectComposition.soundEffectIds = new int[ra6 + 2];
                    for (int n3 = 0; n3 <= ra6; ++n3) {
                        objectComposition.soundEffectIds[n3] = buffer.readUnsignedShort(-95483605);
                        if (objectComposition.soundEffectIds[n3] == 65535) {
                            if (b == -1) {
                                throw new IllegalStateException();
                            }
                            objectComposition.soundEffectIds[n3] = -1;
                        }
                    }
                    objectComposition.soundEffectIds[1 + ra6] = unsignedShort;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.au(" + ')');
        }
    }
    
    public ObjectComposition hv() {
        return this.transform((byte)45);
    }
    
    public int mj() {
        return this.int5 * 2043119067;
    }
    
    public final ObjectComposition bj() {
        int expandBounds = -1;
        if (-1 != 1411927451 * this.transformVarbit) {
            expandBounds = class252.expandBounds(735120569 * this.transformVarbit, 1879109256);
        }
        else if (1685173773 * this.transformVarp != -1) {
            expandBounds = Varps.Varps_main[this.transformVarp * 549692019];
        }
        int n;
        if (expandBounds >= 0 && expandBounds < this.soundEffectIds.length - 1) {
            n = this.soundEffectIds[expandBounds];
        }
        else {
            n = this.soundEffectIds[this.soundEffectIds.length - 1];
        }
        if (-1 != n) {
            return class144.vmethod3248(n, (short)10611);
        }
        return null;
    }
    
    public String getStringValue(final int n) {
        final Node bm = this.bm(n);
        if (bm != null) {
            return (String)((ObjectNode)bm).by();
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
        final Node bm = this.bm(n);
        if (bm != null) {
            return ((IntegerNode)bm).getValue();
        }
        final ParamComposition xa = ScriptFrame.client.xa(n);
        if (xa.zx()) {
            throw new IllegalArgumentException("trying to get int from string param");
        }
        return xa.wl();
    }
    
    public int tj() {
        return this.sizeX * -1339930361;
    }
    
    public static boolean ku(final ObjectComposition objectComposition, final int n) {
        if (objectComposition.models != null) {
            for (int i = 0; i < objectComposition.models.length; ++i) {
                if (objectComposition.models[i] == n) {
                    return class157.ObjectDefinition_modelsArchive.tryLoadFile(objectComposition.modelIds[i] & 0xFFFF, 0, (byte)63);
                }
            }
            return true;
        }
        if (null == objectComposition.modelIds) {
            return true;
        }
        if (n != 10) {
            return true;
        }
        boolean b = true;
        for (int j = 0; j < objectComposition.modelIds.length; ++j) {
            b &= class157.ObjectDefinition_modelsArchive.tryLoadFile(objectComposition.modelIds[j] & 0xFFFF, 0, (byte)(-1));
        }
        return b;
    }
    
    public static int bm(final ObjectComposition objectComposition, final int n, final int n2) {
        final IterableNodeHashTable params = objectComposition.params;
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
    
    public Node bm(final int n) {
        if (this.getParams() == null) {
            return null;
        }
        return (Node)this.getParams().get((long)n);
    }
    
    public final Model bk(final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5) {
        long n6;
        if (null == this.models) {
            n6 = (-1529817365 * this.id << 10) + n2;
        }
        else {
            n6 = (this.id * -153794912 << 10) + (n << 3) + n2;
        }
        Model model = (Model)ObjectComposition.ObjectDefinition_cachedModels.wr(n6);
        if (model == null) {
            final ModelData modelData = this.getModelData(n, n2, -1333707024);
            if (modelData == null) {
                return null;
            }
            model = modelData.dg(this.ambient * 1284125631 + 64, -735647475 + -1517902111 * this.contrast, -50, 1095129611, -1319222382);
            ObjectComposition.ObjectDefinition_cachedModels.put(model, n6);
        }
        if (this.clipType * -1437543955 >= 0) {
            model = model.bp(array, n3, n4, n5, true, 1355092949 * this.clipType);
        }
        return model;
    }
    
    public boolean hasSound(final int n) {
        try {
            if (this.soundEffectIds != null) {
                for (int i = 0; i < this.soundEffectIds.length; ++i) {
                    if (-1 != this.soundEffectIds[i]) {
                        if (n >= -1928114592) {
                            throw new IllegalStateException();
                        }
                        final ObjectComposition vmethod3248 = class144.vmethod3248(this.soundEffectIds[i], (short)7207);
                        if (-1 == 1970571505 * vmethod3248.ambientSoundId) {
                            if (n >= -1928114592) {
                                throw new IllegalStateException();
                            }
                            if (vmethod3248.transforms == null) {
                                continue;
                            }
                            if (n >= -1928114592) {
                                throw new IllegalStateException();
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            if (n >= -1928114592) {
                throw new IllegalStateException();
            }
            if (this.ambientSoundId * 1970571505 == -1) {
                if (n >= -1928114592) {
                    throw new IllegalStateException();
                }
                if (null == this.transforms) {
                    return false;
                }
                if (n >= -1928114592) {
                    throw new IllegalStateException();
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.ah(" + ')');
        }
    }
    
    public int yt() {
        return this.int7 * -1548061831;
    }
    
    public static boolean uh(final ObjectComposition objectComposition, final int n, final int n2) {
        if (objectComposition == null) {
            objectComposition.method1085(n, n);
        }
        try {
            if (objectComposition.models != null) {
                int i = 0;
                while (i < objectComposition.models.length) {
                    if (n2 == -1754346109) {
                        throw new IllegalStateException();
                    }
                    if (objectComposition.models[i] == n) {
                        if (n2 == -1754346109) {
                            throw new IllegalStateException();
                        }
                        return class157.ObjectDefinition_modelsArchive.tryLoadFile(objectComposition.modelIds[i] & 0xFFFF, 0, (byte)23);
                    }
                    else {
                        ++i;
                    }
                }
                return true;
            }
            if (n2 == -1754346109) {
                throw new IllegalStateException();
            }
            if (null == objectComposition.modelIds) {
                if (n2 == -1754346109) {
                    throw new IllegalStateException();
                }
                return true;
            }
            else {
                if (n == 10) {
                    boolean b = true;
                    for (int j = 0; j < objectComposition.modelIds.length; ++j) {
                        if (n2 == -1754346109) {
                            throw new IllegalStateException();
                        }
                        b &= class157.ObjectDefinition_modelsArchive.tryLoadFile(objectComposition.modelIds[j] & 0xFFFF, 0, (byte)(-74));
                    }
                    return b;
                }
                if (n2 == -1754346109) {
                    throw new IllegalStateException();
                }
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hq.ab(" + ')');
        }
    }
    
    public static void bf() {
        ObjectComposition.ObjectDefinition_cached.clear();
        ObjectComposition.ObjectDefinition_cachedModelData.clear();
        ObjectComposition.ObjectDefinition_cachedEntities.clear();
        ObjectComposition.ObjectDefinition_cachedModels.clear();
    }
    
    public String bu(final int n, final String s) {
        return EnumComposition.method1014(this.params, n, s, 1607567986);
    }
    
    public int[] getImpostorIds() {
        return this.soundEffectIds;
    }
    
    public int getMapSceneId() {
        return this.mapSceneId * 771086195;
    }
    
    public void setMapIconId(final int n) {
        this.mapIconId = n * -1683785829;
    }
    
    public int getVarPlayerId() {
        return this.transformVarp * 1685173773;
    }
    
    public void setMapSceneId(final int n) {
        this.mapSceneId = n * -476568133;
    }
    
    public int getVarbitId() {
        return this.transformVarbit * 1411927451;
    }
    
    public int getMapIconId() {
        return this.mapIconId * 1270945427;
    }
}
