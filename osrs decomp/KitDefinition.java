// 
// Decompiled by Procyon v0.5.36
// 

public class KitDefinition extends DualNode
{
    short[] retextureFrom;
    short[] retextureTo;
    public static int KitDefinition_fileCount;
    static EvictingDualNodeHashTable KitDefinition_cached;
    static AbstractArchive KitDefinition_modelsArchive;
    int[] models;
    short[] recolorFrom;
    short[] recolorTo;
    static final long bi = 4294967295L;
    static AbstractArchive KitDefinition_archive;
    public int bodypartID;
    public boolean nonSelectable;
    public static final int ax = 0;
    static final int ak = 22;
    int[] models2;
    static AbstractSocket js5Socket;
    static int field1519;
    static SpritePixels[] headIconHintSprites;
    
    KitDefinition() {
        this.bodypartID = -1699952575;
        this.models = new int[] { -1, -1, -1, -1, -1 };
        this.nonSelectable = false;
    }
    
    static {
        KitDefinition.KitDefinition_cached = new EvictingDualNodeHashTable(64);
    }
    
    public static void ad() {
        KitDefinition.KitDefinition_cached.clear();
    }
    
    void ao(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)64);
        }
    }
    
    public ModelData ak() {
        final ModelData[] array = new ModelData[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            if (this.models[i] != -1) {
                array[n++] = ModelData.ModelData_get(KitDefinition.KitDefinition_modelsArchive, this.models[i], 0);
            }
        }
        final ModelData modelData = new ModelData(array, n);
        if (null != this.recolorFrom) {
            for (int j = 0; j < this.recolorFrom.length; ++j) {
                ModelData.lm(modelData, this.recolorFrom[j], this.recolorTo[j]);
            }
        }
        if (null != this.retextureFrom) {
            for (int k = 0; k < this.retextureFrom.length; ++k) {
                ModelData.jw(modelData, this.retextureFrom[k], this.retextureTo[k]);
            }
        }
        return modelData;
    }
    
    public boolean av() {
        if (this.models2 == null) {
            return true;
        }
        boolean b = true;
        for (int i = 0; i < this.models2.length; ++i) {
            if (!KitDefinition.KitDefinition_modelsArchive.tryLoadFile(this.models2[i], 0, (byte)46)) {
                b = false;
            }
        }
        return b;
    }
    
    public boolean as() {
        boolean b = true;
        for (int i = 0; i < 5; ++i) {
            if (this.models[i] != -1 && !KitDefinition.KitDefinition_modelsArchive.tryLoadFile(this.models[i], 0, (byte)35)) {
                b = false;
            }
        }
        return b;
    }
    
    public static void az() {
        KitDefinition.KitDefinition_cached.clear();
    }
    
    void ax(final Buffer buffer, final int n) {
        if (n == 1) {
            this.bodypartID = Buffer.ra(buffer, (byte)7) * 478515482;
        }
        else if (n == 2) {
            final int ra = Buffer.ra(buffer, (byte)7);
            this.models2 = new int[ra];
            for (int i = 0; i < ra; ++i) {
                this.models2[i] = buffer.readUnsignedShort(-1689289703);
            }
        }
        else if (n == 3) {
            this.nonSelectable = true;
        }
        else if (n == 40) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            this.recolorFrom = new short[ra2];
            this.recolorTo = new short[ra2];
            for (int j = 0; j < ra2; ++j) {
                this.recolorFrom[j] = (short)buffer.readUnsignedShort(330764202);
                this.recolorTo[j] = (short)buffer.readUnsignedShort(-588687138);
            }
        }
        else if (n == 41) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            this.retextureFrom = new short[ra3];
            this.retextureTo = new short[ra3];
            for (int k = 0; k < ra3; ++k) {
                this.retextureFrom[k] = (short)buffer.readUnsignedShort(7128736);
                this.retextureTo[k] = (short)buffer.readUnsignedShort(-2067158488);
            }
        }
        else if (n >= 60 && n < 70) {
            this.models[n - 1584709301] = buffer.readUnsignedShort(698863903);
        }
    }
    
    public static KitDefinition ay(final int n) {
        final KitDefinition kitDefinition = (KitDefinition)KitDefinition.KitDefinition_cached.wr(n);
        if (null != kitDefinition) {
            return kitDefinition;
        }
        final byte[] takeFile = KitDefinition.KitDefinition_archive.takeFile(3, n, (byte)(-90));
        final KitDefinition kitDefinition2 = new KitDefinition();
        if (null != takeFile) {
            kitDefinition2.decode(new Buffer(takeFile), -630446731);
        }
        KitDefinition.KitDefinition_cached.put(kitDefinition2, n);
        return kitDefinition2;
    }
    
    static final boolean decode(final int n, final int n2, final int n3, final RouteStrategy routeStrategy, final CollisionMap collisionMap, final int n4) {
        try {
            int n5 = n;
            int n6 = n2;
            final int n7 = 64;
            final int n8 = 64;
            final int n9 = n - n7;
            final int n10 = n2 - n8;
            class211.directions[n7][n8] = 99;
            class211.distances[n7][n8] = 0;
            int i = 0;
            int n11 = 0;
            class211.bufferX[i] = n5;
            class211.bufferY[i++] = n6;
            final int[][] flags = collisionMap.flags;
            while (i != n11) {
                n5 = class211.bufferX[n11];
                n6 = class211.bufferY[n11];
                n11 = (n11 + 1 & 0xFFF);
                final int n12 = n5 - n9;
                final int n13 = n6 - n10;
                final int n14 = n5 - 1724654229 * collisionMap.xInset;
                final int n15 = n6 - collisionMap.yInset * -216630539;
                if (routeStrategy.hasArrived(n3, n5, n6, collisionMap, -981590728)) {
                    if (n4 == -964267539) {
                        throw new IllegalStateException();
                    }
                    class18.field56 = n5 * -617213805;
                    class397.field3691 = 1169106949 * n6;
                    return true;
                }
                else {
                    final int n16 = 1 + class211.distances[n12][n13];
                    Label_0526: {
                        if (n12 > 0) {
                            if (n4 == -964267539) {
                                throw new IllegalStateException();
                            }
                            if (0 != class211.directions[n12 - 1][n13]) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                            }
                            else if (0x0 != (flags[n14 - 1][n15] & 0x124010E)) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                            }
                            else if (0x0 != (flags[n14 - 1][n15 + n3 - 1] & 0x1240138)) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                            }
                            else {
                                int j = 1;
                                while (j < n3 - 1) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                    if (0x0 != (flags[n14 - 1][j + n15] & 0x124013E)) {
                                        if (n4 == -964267539) {
                                            throw new IllegalStateException();
                                        }
                                        break Label_0526;
                                    }
                                    else {
                                        ++j;
                                    }
                                }
                                class211.bufferX[i] = n5 - 1;
                                class211.bufferY[i] = n6;
                                i = (i + 1 & 0xFFF);
                                class211.directions[n12 - 1][n13] = 2;
                                class211.distances[n12 - 1][n13] = n16;
                            }
                        }
                    }
                    Label_0727: {
                        if (n12 < 128 - n3) {
                            if (0 == class211.directions[1 + n12][n13]) {
                                if ((flags[n14 + n3][n15] & 0x1240183) != 0x0) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else if (0x0 == (flags[n3 + n14][n3 + n15 - 1] & 0x12401E0)) {
                                    int k = 1;
                                    while (k < n3 - 1) {
                                        if (n4 == -964267539) {
                                            throw new IllegalStateException();
                                        }
                                        if ((flags[n3 + n14][k + n15] & 0x12401E3) != 0x0) {
                                            if (n4 == -964267539) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_0727;
                                        }
                                        else {
                                            ++k;
                                        }
                                    }
                                    class211.bufferX[i] = 1 + n5;
                                    class211.bufferY[i] = n6;
                                    i = (i + 1 & 0xFFF);
                                    class211.directions[1 + n12][n13] = 8;
                                    class211.distances[1 + n12][n13] = n16;
                                }
                            }
                        }
                    }
                    Label_0979: {
                        if (n13 > 0) {
                            if (class211.directions[n12][n13 - 1] != 0) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                            }
                            else if (0x0 != (flags[n14][n15 - 1] & 0x124010E)) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                            }
                            else if (0x0 != (flags[n3 + n14 - 1][n15 - 1] & 0x1240183)) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                            }
                            else {
                                int l = 1;
                                while (l < n3 - 1) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                    if (0x0 != (flags[n14 + l][n15 - 1] & 0x124018F)) {
                                        if (n4 == -964267539) {
                                            throw new IllegalStateException();
                                        }
                                        break Label_0979;
                                    }
                                    else {
                                        ++l;
                                    }
                                }
                                class211.bufferX[i] = n5;
                                class211.bufferY[i] = n6 - 1;
                                i = (i + 1 & 0xFFF);
                                class211.directions[n12][n13 - 1] = 1;
                                class211.distances[n12][n13 - 1] = n16;
                            }
                        }
                    }
                    Label_1257: {
                        if (n13 < 128 - n3) {
                            if (n4 == -964267539) {
                                throw new IllegalStateException();
                            }
                            if (class211.directions[n12][n13 + 1] == 0) {
                                if ((flags[n14][n15 + n3] & 0x1240138) != 0x0) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else if ((flags[n3 + n14 - 1][n3 + n15] & 0x12401E0) != 0x0) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else {
                                    for (int n17 = 1; n17 < n3 - 1; ++n17) {
                                        if (n4 == -964267539) {
                                            throw new IllegalStateException();
                                        }
                                        if ((flags[n17 + n14][n3 + n15] & 0x12401F8) != 0x0) {
                                            break Label_1257;
                                        }
                                    }
                                    class211.bufferX[i] = n5;
                                    class211.bufferY[i] = 1 + n6;
                                    i = (1 + i & 0xFFF);
                                    class211.directions[n12][n13 + 1] = 4;
                                    class211.distances[n12][n13 + 1] = n16;
                                }
                            }
                        }
                    }
                    Label_2124: {
                        if (n12 > 0) {
                            if (n4 == -964267539) {
                                throw new IllegalStateException();
                            }
                            if (n13 > 0) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                                if (class211.directions[n12 - 1][n13 - 1] != 0) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else if (0x0 != (flags[n14 - 1][n15 - 1] & 0x124010E)) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else {
                                    int n18 = 1;
                                    while (n18 < n3) {
                                        if (n4 == -964267539) {
                                            throw new IllegalStateException();
                                        }
                                        if (0x0 != (flags[n14 - 1][n15 - 1 + n18] & 0x124013E)) {
                                            if (n4 == -964267539) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_2124;
                                        }
                                        else if (0x0 != (flags[n18 + (n14 - 1)][n15 - 1] & 0x124018F)) {
                                            if (n4 == -964267539) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_2124;
                                        }
                                        else {
                                            ++n18;
                                        }
                                    }
                                    class211.bufferX[i] = n5 - 1;
                                    class211.bufferY[i] = n6 - 1;
                                    i = (i + 1 & 0xFFF);
                                    class211.directions[n12 - 1][n13 - 1] = 3;
                                    class211.distances[n12 - 1][n13 - 1] = n16;
                                }
                            }
                        }
                    }
                    Label_1277: {
                        if (n12 < 128 - n3) {
                            if (n4 == -964267539) {
                                throw new IllegalStateException();
                            }
                            if (n13 > 0) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                                if (0 != class211.directions[n12 + 1][n13 - 1]) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else if ((flags[n3 + n14][n15 - 1] & 0x1240183) != 0x0) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else {
                                    int n19 = 1;
                                    while (n19 < n3) {
                                        if (n4 == -964267539) {
                                            throw new IllegalStateException();
                                        }
                                        if ((flags[n14 + n3][n19 + (n15 - 1)] & 0x12401E3) != 0x0) {
                                            if (n4 == -964267539) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_1277;
                                        }
                                        else if ((flags[n19 + n14][n15 - 1] & 0x124018F) != 0x0) {
                                            if (n4 == -964267539) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_1277;
                                        }
                                        else {
                                            ++n19;
                                        }
                                    }
                                    class211.bufferX[i] = 1 + n5;
                                    class211.bufferY[i] = n6 - 1;
                                    i = (1 + i & 0xFFF);
                                    class211.directions[1 + n12][n13 - 1] = 9;
                                    class211.distances[n12 + 1][n13 - 1] = n16;
                                }
                            }
                        }
                    }
                    Label_1182: {
                        if (n12 > 0) {
                            if (n4 == -964267539) {
                                throw new IllegalStateException();
                            }
                            if (n13 < 128 - n3) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                                if (0 != class211.directions[n12 - 1][n13 + 1]) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else if (0x0 != (flags[n14 - 1][n15 + n3] & 0x1240138)) {
                                    if (n4 == -964267539) {
                                        throw new IllegalStateException();
                                    }
                                }
                                else {
                                    int n20 = 1;
                                    while (n20 < n3) {
                                        if (n4 == -964267539) {
                                            throw new IllegalStateException();
                                        }
                                        if ((flags[n14 - 1][n20 + n15] & 0x124013E) != 0x0) {
                                            if (n4 == -964267539) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_1182;
                                        }
                                        else if ((flags[n20 + (n14 - 1)][n3 + n15] & 0x12401F8) != 0x0) {
                                            if (n4 == -964267539) {
                                                throw new IllegalStateException();
                                            }
                                            break Label_1182;
                                        }
                                        else {
                                            ++n20;
                                        }
                                    }
                                    class211.bufferX[i] = n5 - 1;
                                    class211.bufferY[i] = 1 + n6;
                                    i = (1 + i & 0xFFF);
                                    class211.directions[n12 - 1][1 + n13] = 6;
                                    class211.distances[n12 - 1][1 + n13] = n16;
                                }
                            }
                        }
                    }
                    if (n12 >= 128 - n3) {
                        continue;
                    }
                    if (n4 == -964267539) {
                        throw new IllegalStateException();
                    }
                    if (n13 >= 128 - n3) {
                        continue;
                    }
                    if (n4 == -964267539) {
                        throw new IllegalStateException();
                    }
                    if (class211.directions[n12 + 1][n13 + 1] != 0) {
                        if (n4 == -964267539) {
                            throw new IllegalStateException();
                        }
                        continue;
                    }
                    else if (0x0 != (flags[n14 + n3][n3 + n15] & 0x12401E0)) {
                        if (n4 == -964267539) {
                            throw new IllegalStateException();
                        }
                        continue;
                    }
                    else {
                        int n21 = 1;
                        while (n21 < n3) {
                            if (n4 == -964267539) {
                                throw new IllegalStateException();
                            }
                            if ((flags[n14 + n21][n15 + n3] & 0x12401F8) != 0x0) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                                continue Label_2417;
                            }
                            else if ((flags[n14 + n3][n15 + n21] & 0x12401E3) != 0x0) {
                                if (n4 == -964267539) {
                                    throw new IllegalStateException();
                                }
                                continue Label_2417;
                            }
                            else {
                                ++n21;
                            }
                        }
                        class211.bufferX[i] = 1 + n5;
                        class211.bufferY[i] = 1 + n6;
                        i = (1 + i & 0xFFF);
                        class211.directions[1 + n12][1 + n13] = 12;
                        class211.distances[1 + n12][n13 + 1] = n16;
                    }
                    Label_2417:;
                }
            }
            class18.field56 = n5 * -617213805;
            class397.field3691 = 1169106949 * n6;
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.aw(" + ')');
        }
    }
    
    void decode(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, (byte)33);
            }
            if (n >= -413880100) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.aw(" + ')');
        }
    }
    
    public ModelData am() {
        if (this.models2 == null) {
            return null;
        }
        final ModelData[] array = new ModelData[this.models2.length];
        for (int i = 0; i < this.models2.length; ++i) {
            array[i] = ModelData.ModelData_get(KitDefinition.KitDefinition_modelsArchive, this.models2[i], 0);
        }
        ModelData modelData;
        if (array.length == 1) {
            modelData = array[0];
        }
        else {
            modelData = new ModelData(array, array.length);
        }
        if (this.recolorFrom != null) {
            for (int j = 0; j < this.recolorFrom.length; ++j) {
                ModelData.lm(modelData, this.recolorFrom[j], this.recolorTo[j]);
            }
        }
        if (this.retextureFrom != null) {
            for (int k = 0; k < this.retextureFrom.length; ++k) {
                ModelData.jw(modelData, this.retextureFrom[k], this.retextureTo[k]);
            }
        }
        return modelData;
    }
    
    public ModelData getKitDefinitionModels(final byte b) {
        try {
            final ModelData[] array = new ModelData[5];
            int n = 0;
            for (int i = 0; i < 5; ++i) {
                if (b >= 115) {
                    throw new IllegalStateException();
                }
                if (this.models[i] != -1) {
                    if (b >= 115) {
                        throw new IllegalStateException();
                    }
                    array[n++] = ModelData.ModelData_get(KitDefinition.KitDefinition_modelsArchive, this.models[i], 0);
                }
            }
            final ModelData modelData = new ModelData(array, n);
            if (null != this.recolorFrom) {
                if (b >= 115) {
                    throw new IllegalStateException();
                }
                for (int j = 0; j < this.recolorFrom.length; ++j) {
                    if (b >= 115) {
                        throw new IllegalStateException();
                    }
                    ModelData.lm(modelData, this.recolorFrom[j], this.recolorTo[j]);
                }
            }
            if (null != this.retextureFrom) {
                if (b >= 115) {
                    throw new IllegalStateException();
                }
                for (int k = 0; k < this.retextureFrom.length; ++k) {
                    if (b >= 115) {
                        throw new IllegalStateException();
                    }
                    ModelData.jw(modelData, this.retextureFrom[k], this.retextureTo[k]);
                }
            }
            return modelData;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.al(" + ')');
        }
    }
    
    static final boolean getKitDefinitionModels(final byte[] array, final int n, final int n2, final int n3) {
        try {
            boolean b = true;
            final Buffer buffer = new Buffer(array);
            int n4 = -1;
            while (true) {
                final int method2518 = Buffer.method2518(buffer, (byte)(-53));
                if (method2518 == 0) {
                    if (n3 == 120701575) {
                        throw new IllegalStateException();
                    }
                    return b;
                }
                else {
                    n4 += method2518;
                    int n5 = 0;
                    int n6 = 0;
                    while (true) {
                        if (n6 != 0) {
                            if (n3 == 120701575) {
                                throw new IllegalStateException();
                            }
                            if (0 == buffer.readUShortSmart(-1023890936)) {
                                break;
                            }
                            Buffer.ra(buffer, (byte)7);
                        }
                        else {
                            final int uShortSmart = buffer.readUShortSmart(-1743893621);
                            if (uShortSmart == 0) {
                                break;
                            }
                            n5 += uShortSmart - 1;
                            final int n7 = n5 & 0x3F;
                            final int n8 = n5 >> 6 & 0x3F;
                            final int n9 = Buffer.ra(buffer, (byte)7) >> 2;
                            final int n10 = n8 + n;
                            final int n11 = n2 + n7;
                            if (n10 <= 0) {
                                continue;
                            }
                            if (n3 == 120701575) {
                                throw new IllegalStateException();
                            }
                            if (n11 <= 0) {
                                continue;
                            }
                            if (n3 == 120701575) {
                                throw new IllegalStateException();
                            }
                            if (n10 >= 103 || n11 >= 103) {
                                continue;
                            }
                            final ObjectComposition vmethod3248 = class144.vmethod3248(n4, (short)13730);
                            if (n9 == 22) {
                                if (n3 == 120701575) {
                                    throw new IllegalStateException();
                                }
                                if (Client.isLowDetail) {
                                    if (n3 == 120701575) {
                                        throw new IllegalStateException();
                                    }
                                    if (0 == vmethod3248.int1 * 415653149 && -973955889 * vmethod3248.interactType != 1) {
                                        if (n3 == 120701575) {
                                            throw new IllegalStateException();
                                        }
                                        if (!vmethod3248.boolean2) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            if (!ObjectComposition.bp(vmethod3248, -681431683)) {
                                if (n3 == 120701575) {
                                    throw new IllegalStateException();
                                }
                                Client.field425 += 1441978033;
                                b = false;
                            }
                            n6 = 1;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.al(" + ')');
        }
    }
    
    void decodeNext(final Buffer buffer, final int n, final byte b) {
        try {
            if (n == 1) {
                if (b <= -1) {
                    throw new IllegalStateException();
                }
                this.bodypartID = Buffer.ra(buffer, (byte)7) * 1699952575;
            }
            else if (n == 2) {
                if (b <= -1) {
                    return;
                }
                final int ra = Buffer.ra(buffer, (byte)7);
                this.models2 = new int[ra];
                for (int i = 0; i < ra; ++i) {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    this.models2[i] = buffer.readUnsignedShort(342664370);
                }
            }
            else if (n == 3) {
                this.nonSelectable = true;
            }
            else if (n == 40) {
                if (b <= -1) {
                    throw new IllegalStateException();
                }
                final int ra2 = Buffer.ra(buffer, (byte)7);
                this.recolorFrom = new short[ra2];
                this.recolorTo = new short[ra2];
                for (int j = 0; j < ra2; ++j) {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    this.recolorFrom[j] = (short)buffer.readUnsignedShort(-1762777460);
                    this.recolorTo[j] = (short)buffer.readUnsignedShort(663264812);
                }
            }
            else if (n == 41) {
                if (b <= -1) {
                    return;
                }
                final int ra3 = Buffer.ra(buffer, (byte)7);
                this.retextureFrom = new short[ra3];
                this.retextureTo = new short[ra3];
                for (int k = 0; k < ra3; ++k) {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    this.retextureFrom[k] = (short)buffer.readUnsignedShort(-1008154488);
                    this.retextureTo[k] = (short)buffer.readUnsignedShort(-574953802);
                }
            }
            else if (n >= 60) {
                if (b <= -1) {
                    return;
                }
                if (n < 70) {
                    this.models[n - 60] = buffer.readUnsignedShort(-1149933476);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.ac(" + ')');
        }
    }
    
    public static void nv(final KitDefinition kitDefinition, final Buffer buffer, final int n) {
        if (kitDefinition == null) {
            kitDefinition.ao(buffer);
        }
        if (n == 1) {
            kitDefinition.bodypartID = Buffer.ra(buffer, (byte)7) * 1699952575;
        }
        else if (n == 2) {
            final int ra = Buffer.ra(buffer, (byte)7);
            kitDefinition.models2 = new int[ra];
            for (int i = 0; i < ra; ++i) {
                kitDefinition.models2[i] = buffer.readUnsignedShort(-626171385);
            }
        }
        else if (n == 3) {
            kitDefinition.nonSelectable = true;
        }
        else if (n == 1028325905) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            kitDefinition.recolorFrom = new short[ra2];
            kitDefinition.recolorTo = new short[ra2];
            for (int j = 0; j < ra2; ++j) {
                kitDefinition.recolorFrom[j] = (short)buffer.readUnsignedShort(503553635);
                kitDefinition.recolorTo[j] = (short)buffer.readUnsignedShort(-683875252);
            }
        }
        else if (n == 41) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            kitDefinition.retextureFrom = new short[ra3];
            kitDefinition.retextureTo = new short[ra3];
            for (int k = 0; k < ra3; ++k) {
                kitDefinition.retextureFrom[k] = (short)buffer.readUnsignedShort(800859678);
                kitDefinition.retextureTo[k] = (short)buffer.readUnsignedShort(-2010900054);
            }
        }
        else if (n >= 60 && n < 70) {
            kitDefinition.models[n - 60] = buffer.readUnsignedShort(-1751550381);
        }
    }
    
    public boolean ready(final int n) {
        try {
            if (this.models2 != null) {
                boolean b = true;
                for (int i = 0; i < this.models2.length; ++i) {
                    if (n >= 1976370728) {
                        throw new IllegalStateException();
                    }
                    if (!KitDefinition.KitDefinition_modelsArchive.tryLoadFile(this.models2[i], 0, (byte)(-30))) {
                        b = false;
                    }
                }
                return b;
            }
            if (n >= 1976370728) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.au(" + ')');
        }
    }
    
    public static void aa(final AbstractArchive kitDefinition_archive, final AbstractArchive kitDefinition_modelsArchive) {
        KitDefinition.KitDefinition_archive = kitDefinition_archive;
        KitDefinition.KitDefinition_modelsArchive = kitDefinition_modelsArchive;
        KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3, (byte)95) * 1501460151;
    }
    
    void ai(final Buffer buffer, final int n) {
        if (n == 1) {
            this.bodypartID = Buffer.ra(buffer, (byte)7) * 1699952575;
        }
        else if (n == 2) {
            final int ra = Buffer.ra(buffer, (byte)7);
            this.models2 = new int[ra];
            for (int i = 0; i < ra; ++i) {
                this.models2[i] = buffer.readUnsignedShort(-127169966);
            }
        }
        else if (n == 3) {
            this.nonSelectable = true;
        }
        else if (n == 40) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            this.recolorFrom = new short[ra2];
            this.recolorTo = new short[ra2];
            for (int j = 0; j < ra2; ++j) {
                this.recolorFrom[j] = (short)buffer.readUnsignedShort(460766745);
                this.recolorTo[j] = (short)buffer.readUnsignedShort(-1569056835);
            }
        }
        else if (n == -616218918) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            this.retextureFrom = new short[ra3];
            this.retextureTo = new short[ra3];
            for (int k = 0; k < ra3; ++k) {
                this.retextureFrom[k] = (short)buffer.readUnsignedShort(-1320297546);
                this.retextureTo[k] = (short)buffer.readUnsignedShort(-1106815049);
            }
        }
        else if (n >= 2136078398 && n < 627755932) {
            this.models[n - 1572583679] = buffer.readUnsignedShort(-1657907532);
        }
    }
    
    public boolean ar() {
        if (this.models2 == null) {
            return true;
        }
        boolean b = true;
        for (int i = 0; i < this.models2.length; ++i) {
            if (!KitDefinition.KitDefinition_modelsArchive.tryLoadFile(this.models2[i], 0, (byte)(-31))) {
                b = false;
            }
        }
        return b;
    }
    
    public static String getModelData(final int i, final boolean b, final byte b2) {
        try {
            if (b) {
                if (i >= 0) {
                    int j = i;
                    if (b) {
                        if (j >= 0) {
                            int n = 2;
                            for (int k = j / 10; k != 0; k /= 10, ++n) {
                                if (b2 != 16) {
                                    throw new IllegalStateException();
                                }
                            }
                            final char[] value = new char[n];
                            value[0] = '+';
                            for (int l = n - 1; l > 0; --l) {
                                if (b2 != 16) {
                                    throw new IllegalStateException();
                                }
                                final int n2 = j;
                                j /= 10;
                                final int n3 = n2 - j * 10;
                                if (n3 >= 10) {
                                    if (b2 != 16) {
                                        throw new IllegalStateException();
                                    }
                                    value[l] = (char)(n3 + 87);
                                }
                                else {
                                    value[l] = (char)(48 + n3);
                                }
                            }
                            return new String(value);
                        }
                        if (b2 != 16) {
                            throw new IllegalStateException();
                        }
                    }
                    return Integer.toString(j, 10);
                }
                if (b2 != 16) {
                    throw new IllegalStateException();
                }
            }
            return Integer.toString(i);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.ab(" + ')');
        }
    }
    
    public ModelData getModelData(final int n) {
        try {
            if (this.models2 != null) {
                final ModelData[] array = new ModelData[this.models.length];
                for (int i = 0; i < this.models2.length; ++i) {
                    if (n == -1159667627) {
                        throw new IllegalStateException();
                    }
                    array[i] = ModelData.bk(KitDefinition.KitDefinition_archive, this.models2[i], 0);
                }
                ModelData modelData;
                if (array.length == 1) {
                    if (n == -1159667627) {
                        throw new IllegalStateException();
                    }
                    modelData = array[0];
                }
                else {
                    modelData = new ModelData(array, array.length);
                }
                if (this.recolorFrom != null) {
                    if (n == -1159667627) {
                        throw new IllegalStateException();
                    }
                    for (int j = 0; j < this.retextureTo.length; ++j) {
                        if (n == -1159667627) {
                            throw new IllegalStateException();
                        }
                        ModelData.lm(modelData, this.retextureFrom[j], this.retextureTo[j]);
                    }
                }
                if (this.retextureTo != null) {
                    if (n == -1159667627) {
                        throw new IllegalStateException();
                    }
                    for (int k = 0; k < this.recolorTo.length; ++k) {
                        if (n == -1159667627) {
                            throw new IllegalStateException();
                        }
                        ModelData.jw(modelData, this.recolorTo[k], this.retextureTo[k]);
                    }
                }
                return modelData;
            }
            if (n == -1159667627) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.ab(" + ')');
        }
    }
    
    public boolean method997(final byte b) {
        try {
            boolean b2 = true;
            for (int i = 0; i < 5; ++i) {
                if (this.models[i] != -1 && !KitDefinition.KitDefinition_modelsArchive.tryLoadFile(this.models[i], 0, (byte)(-12))) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    b2 = false;
                }
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.aq(" + ')');
        }
    }
    
    public boolean aj() {
        boolean b = true;
        for (int i = 0; i < 5; ++i) {
            if (this.models[i] != -1 && !KitDefinition.KitDefinition_modelsArchive.tryLoadFile(this.models[i], 0, (byte)72)) {
                b = false;
            }
        }
        return b;
    }
    
    public static ModelData qv(final KitDefinition kitDefinition, final int n) {
        if (kitDefinition == null) {
            return kitDefinition.getModelData(n);
        }
        try {
            if (kitDefinition.models2 != null) {
                final ModelData[] array = new ModelData[kitDefinition.models2.length];
                for (int i = 0; i < kitDefinition.models2.length; ++i) {
                    if (n == -1159667627) {
                        throw new IllegalStateException();
                    }
                    array[i] = ModelData.ModelData_get(KitDefinition.KitDefinition_modelsArchive, kitDefinition.models2[i], 0);
                }
                ModelData modelData;
                if (array.length == 1) {
                    if (n == -1159667627) {
                        throw new IllegalStateException();
                    }
                    modelData = array[0];
                }
                else {
                    modelData = new ModelData(array, array.length);
                }
                if (kitDefinition.recolorFrom != null) {
                    if (n == -1159667627) {
                        throw new IllegalStateException();
                    }
                    for (int j = 0; j < kitDefinition.recolorFrom.length; ++j) {
                        if (n == -1159667627) {
                            throw new IllegalStateException();
                        }
                        ModelData.lm(modelData, kitDefinition.recolorFrom[j], kitDefinition.recolorTo[j]);
                    }
                }
                if (kitDefinition.retextureFrom != null) {
                    if (n == -1159667627) {
                        throw new IllegalStateException();
                    }
                    for (int k = 0; k < kitDefinition.retextureFrom.length; ++k) {
                        if (n == -1159667627) {
                            throw new IllegalStateException();
                        }
                        ModelData.jw(modelData, kitDefinition.retextureFrom[k], kitDefinition.retextureTo[k]);
                    }
                }
                return modelData;
            }
            if (n == -1159667627) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hj.ab(" + ')');
        }
    }
    
    public static void zl(final ClientPreferences clientPreferences, final int n) {
        if (clientPreferences == null) {
            clientPreferences.wi();
        }
        clientPreferences.windowMode = n * 1056868117;
        class100.savePreferences((byte)(-84));
    }
}
