import net.runelite.api.kit.KitType;
import net.runelite.api.ColorTextureOverride;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.36
// 

public class PlayerComposition implements net.runelite.api.PlayerComposition
{
    public static short[][] field2828;
    static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
    int[] equipment;
    static final int sw = 7680;
    public int field2840;
    public int field2831;
    long field2834;
    long hash;
    ObjTypeCustomisation[] customisations;
    boolean isFemale;
    public static short[] field2837;
    int[] field2841;
    static final int[] equipmentIndices;
    public static final int dr = 105;
    public int npcTransformId;
    int[] bodyColors;
    
    PlayerComposition(final PlayerComposition playerComposition) {
        this.field2840 = -1029929221;
        this.npcTransformId = 0;
        this.isFemale = false;
        this.method1692(Arrays.copyOf(playerComposition.bodyColors, playerComposition.bodyColors.length), Arrays.copyOf(playerComposition.field2841, playerComposition.field2841.length), (ObjTypeCustomisation[])((playerComposition.customisations != null) ? ((ObjTypeCustomisation[])Arrays.copyOf(playerComposition.customisations, playerComposition.customisations.length)) : null), false, Arrays.copyOf(playerComposition.equipment, playerComposition.equipment.length), 1693987821 * playerComposition.npcTransformId, playerComposition.field2831 * -2131733097, playerComposition.field2840 * -1004049459, (byte)88);
    }
    
    public PlayerComposition() {
        this.field2840 = -1029929221;
        this.npcTransformId = 0;
        this.isFemale = false;
    }
    
    static {
        equipmentIndices = new int[] { 622494345 * class204.field1839.field1831, class204.field1840.field1831 * 622494345, 622494345 * class204.field1835.field1831, 622494345 * class204.field1837.field1831, class204.field1834.field1831 * 622494345, 622494345 * class204.field1838.field1831, 622494345 * class204.field1843.field1831 };
        PlayerComposition.PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
    }
    
    void bs() {
        final long n = 800274196296009541L * this.field2834;
        final int n2 = this.field2841[5];
        final int n3 = this.field2841[9];
        this.field2841[5] = n3;
        this.field2841[9] = n2;
        this.field2834 = 0L;
        for (int i = 0; i < 12; ++i) {
            this.field2834 = (this.field2834 * 800274196296009541L << 4) * 4410892792882131853L;
            if (this.field2841[i] >= 256) {
                this.field2834 += 4410892792882131853L * (this.field2841[i] - 256);
            }
        }
        if (this.field2841[0] >= 256) {
            this.field2834 += (this.field2841[0] - 1669183895 >> 4) * 4410892792882131853L;
        }
        if (this.field2841[1] >= 256) {
            this.field2834 += (this.field2841[1] - 256 >> 8) * 4410892792882131853L;
        }
        for (int j = 0; j < 5; ++j) {
            this.field2834 = 4410892792882131853L * (800274196296009541L * this.field2834 << 3);
            this.field2834 += this.equipment[j] * 4410892792882131853L;
        }
        this.field2834 = 4410892792882131853L * (800274196296009541L * this.field2834 << 1);
        this.field2834 += this.npcTransformId * -7585466391638339447L;
        this.field2841[5] = n2;
        this.field2841[9] = n3;
        if ((n != 0L && this.field2834 * 800274196296009541L != n) || this.isFemale) {
            PlayerComposition.PlayerAppearance_cachedModels.remove(n);
        }
    }
    
    int[] ad(final int n) {
        final int[] array = new int[12];
        for (int i = 0; i < 7; ++i) {
            class163.method915(n, array, i, 1195401916);
        }
        return array;
    }
    
    static void bb(final int n, final int[] array, final int n2) {
        for (int i = 0; i < 743589639 * KitDefinition.KitDefinition_fileCount; ++i) {
            final KitDefinition kitDefinition_get = class100.KitDefinition_get(i, 857953210);
            if (kitDefinition_get != null && !kitDefinition_get.nonSelectable && ((1 == n) ? 7 : 0) + n2 == 1015855167 * kitDefinition_get.bodypartID) {
                array[PlayerComposition.equipmentIndices[n2]] = 256 + i;
                break;
            }
        }
    }
    
    public int getChatHeadId(final short n) {
        try {
            if (this.field2831 * -2131733097 != -1) {
                return 305419896 + AbstractArchive.getNpcDefinition(this.field2831 * -2131733097, (byte)(-107)).id * -1115372301;
            }
            if (n == 198) {
                throw new IllegalStateException();
            }
            return (this.field2841[11] << 5) + ((this.field2841[8] << 10) + ((this.equipment[0] << 25) + (this.equipment[4] << 20) + (this.field2841[0] << 15))) + this.field2841[1];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.ao(" + ')');
        }
    }
    
    void setHash(final int n) {
        try {
            this.method1693(this.bodyColors, this.field2841, this.equipment, 1693987821 * this.npcTransformId, -2131733097 * this.field2831, -122282478);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.ax(" + ')');
        }
    }
    
    public void ak(int[] method1697, int[] method1698, final int[] equipment, final int n, final int n2) {
        if (null == method1697) {
            method1697 = this.method1697(n, 545819497);
        }
        if (null == method1698) {
            method1698 = this.method1697(n, 94020386);
        }
        this.bodyColors = method1697;
        this.field2841 = method1698;
        this.equipment = equipment;
        this.npcTransformId = 325591525 * n;
        this.field2831 = -11568601 * n2;
        this.method1702(1418315210);
    }
    
    public void av(final int[] array, final int[] array2, final ObjTypeCustomisation[] customisations, final boolean isFemale, final int[] array3, final int n, final int n2, final int n3) {
        this.customisations = customisations;
        this.isFemale = isFemale;
        this.field2840 = n3 * 1029929221;
        this.method1693(array, array2, array3, n, n2, -8556081);
    }
    
    public void be(final int n, final boolean b) {
        if (n == 1 && 1 == this.npcTransformId * 1693987821) {
            return;
        }
        int n2 = this.field2841[PlayerComposition.equipmentIndices[n]];
        if (n2 == 0) {
            return;
        }
        n2 -= 256;
        KitDefinition kitDefinition_get;
        do {
            if (!b) {
                if (--n2 < 0) {
                    n2 = KitDefinition.KitDefinition_fileCount * 743589639 - 1;
                }
            }
            else if (++n2 >= 743589639 * KitDefinition.KitDefinition_fileCount) {
                n2 = 0;
            }
            kitDefinition_get = class100.KitDefinition_get(n2, -1668342574);
        } while (null == kitDefinition_get || kitDefinition_get.nonSelectable || kitDefinition_get.bodypartID * 1015855167 != n + ((1 == this.npcTransformId * 1693987821) ? 7 : 0));
        this.field2841[PlayerComposition.equipmentIndices[n]] = 256 + n2;
        this.method1702(1418315210);
    }
    
    public void as(int[] method1697, int[] method1698, final int[] equipment, final int n, final int n2) {
        if (null == method1697) {
            method1697 = this.method1697(n, -2127206555);
        }
        if (null == method1698) {
            method1698 = this.method1697(n, -4562284);
        }
        this.bodyColors = method1697;
        this.field2841 = method1698;
        this.equipment = equipment;
        this.npcTransformId = -1832857176 * n;
        this.field2831 = -537896132 * n2;
        this.method1702(1418315210);
    }
    
    int[] az(final int n) {
        final int[] array = new int[12];
        for (int i = 0; i < 7; ++i) {
            class163.method915(n, array, i, 2058313722);
        }
        return array;
    }
    
    void method1702(final int n) {
        try {
            final long n2 = 800274196296009541L * this.field2834;
            final int n3 = this.field2841[5];
            final int n4 = this.field2841[9];
            this.field2841[5] = n4;
            this.field2841[9] = n3;
            this.field2834 = 0L;
            for (int i = 0; i < 12; ++i) {
                if (n != 1418315210) {
                    return;
                }
                this.field2834 = (this.field2834 * 800274196296009541L << 4) * 4410892792882131853L;
                if (this.field2841[i] >= 256) {
                    if (n != 1418315210) {
                        throw new IllegalStateException();
                    }
                    this.field2834 += 4410892792882131853L * (this.field2841[i] - 256);
                }
            }
            if (this.field2841[0] >= 256) {
                if (n != 1418315210) {
                    throw new IllegalStateException();
                }
                this.field2834 += (this.field2841[0] - 256 >> 4) * 4410892792882131853L;
            }
            if (this.field2841[1] >= 256) {
                this.field2834 += (this.field2841[1] - 256 >> 8) * 4410892792882131853L;
            }
            for (int j = 0; j < 5; ++j) {
                if (n != 1418315210) {
                    throw new IllegalStateException();
                }
                this.field2834 = 4410892792882131853L * (800274196296009541L * this.field2834 << 3);
                this.field2834 += this.equipment[j] * 4410892792882131853L;
            }
            this.field2834 = 4410892792882131853L * (800274196296009541L * this.field2834 << 1);
            this.field2834 += this.npcTransformId * -7585466391638339447L;
            this.field2841[5] = n3;
            this.field2841[9] = n4;
            Label_0423: {
                Label_0375: {
                    if (n2 == 0L) {
                        break Label_0375;
                    }
                    if (n != 1418315210) {
                        throw new IllegalStateException();
                    }
                    if (this.field2834 * 800274196296009541L != n2) {
                        break Label_0423;
                    }
                    if (n != 1418315210) {
                        throw new IllegalStateException();
                    }
                    break Label_0375;
                }
                if (!this.isFemale) {
                    return;
                }
                if (n != 1418315210) {
                    throw new IllegalStateException();
                }
            }
            PlayerComposition.PlayerAppearance_cachedModels.remove(n2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.at(" + ')');
        }
    }
    
    ModelData getModelData(final byte b) {
        try {
            if (-1 != this.field2831 * -2131733097) {
                if (b <= 92) {
                    throw new IllegalStateException();
                }
                return AbstractArchive.getNpcDefinition(this.field2831 * -2131733097, (byte)(-15)).method1022(null, (byte)64);
            }
            else {
                boolean b2 = false;
                for (int i = 0; i < 12; ++i) {
                    if (b <= 92) {
                        throw new IllegalStateException();
                    }
                    final int n = this.field2841[i];
                    if (n >= 256) {
                        if (b <= 92) {
                            throw new IllegalStateException();
                        }
                        if (n < 512) {
                            if (b <= 92) {
                                throw new IllegalStateException();
                            }
                            if (!class100.KitDefinition_get(n - 256, -452164983).method997((byte)10)) {
                                b2 = true;
                            }
                        }
                    }
                    if (n >= 512) {
                        if (b <= 92) {
                            throw new IllegalStateException();
                        }
                        if (!HealthBarUpdate.set(n - 512, (byte)47).method1104(this.npcTransformId * 1693987821, -1902431331)) {
                            if (b <= 92) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                    }
                }
                if (!b2) {
                    final ModelData[] array = new ModelData[12];
                    int n2 = 0;
                    for (int j = 0; j < 12; ++j) {
                        if (b <= 92) {
                            throw new IllegalStateException();
                        }
                        final int n3 = this.field2841[j];
                        if (n3 >= 256 && n3 < 512) {
                            if (b <= 92) {
                                throw new IllegalStateException();
                            }
                            final ModelData kitDefinitionModels = class100.KitDefinition_get(n3 - 256, 21709876).getKitDefinitionModels((byte)(-37));
                            if (kitDefinitionModels != null) {
                                if (b <= 92) {
                                    throw new IllegalStateException();
                                }
                                array[n2++] = kitDefinitionModels;
                            }
                        }
                        if (n3 >= 512) {
                            if (b <= 92) {
                                throw new IllegalStateException();
                            }
                            final ModelData by = ItemComposition.by(HealthBarUpdate.set(n3 - 512, (byte)83), this.npcTransformId * 1693987821, -1738550121);
                            if (null != by) {
                                if (b <= 92) {
                                    throw new IllegalStateException();
                                }
                                array[n2++] = by;
                            }
                        }
                    }
                    final ModelData modelData = new ModelData(array, n2);
                    for (int k = 0; k < 5; ++k) {
                        if (b <= 92) {
                            throw new IllegalStateException();
                        }
                        if (this.equipment[k] < PlayerComposition.field2828[k].length) {
                            ModelData.lm(modelData, PlayerComposition.field2837[k], PlayerComposition.field2828[k][this.equipment[k]]);
                        }
                        if (this.equipment[k] < class437.field3825[k].length) {
                            if (b <= 92) {
                                throw new IllegalStateException();
                            }
                            ModelData.lm(modelData, WorldMapIcon_0.field2359[k], class437.field3825[k][this.equipment[k]]);
                        }
                    }
                    return modelData;
                }
                if (b <= 92) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.ay(" + ')');
        }
    }
    
    static void bi(final int n, final int[] array, final int n2) {
        for (int i = 0; i < -251548014 * KitDefinition.KitDefinition_fileCount; ++i) {
            final KitDefinition kitDefinition_get = class100.KitDefinition_get(i, 1155219908);
            if (kitDefinition_get != null && !kitDefinition_get.nonSelectable && ((1 == n) ? 7 : 0) + n2 == 1015855167 * kitDefinition_get.bodypartID) {
                array[PlayerComposition.equipmentIndices[n2]] = 256 + i;
                break;
            }
        }
    }
    
    void bv() {
        this.method1693(this.bodyColors, this.field2841, this.equipment, 1195789184 * this.npcTransformId, -2131733097 * this.field2831, 518626700);
    }
    
    public void bo(final int n, final boolean b) {
        int n2 = this.equipment[n];
        if (!b) {
            do {
                --n2;
                if (n2 < 0) {
                    n2 = PlayerComposition.field2828[n].length - 1;
                }
            } while (!ClanSettings.method867(n, n2, (byte)22));
        }
        else {
            do {
                if (++n2 >= PlayerComposition.field2828[n].length) {
                    n2 = 0;
                }
            } while (!ClanSettings.method867(n, n2, (byte)13));
        }
        this.equipment[n] = n2;
        this.method1702(1418315210);
    }
    
    public static void ok(final PlayerComposition playerComposition, final int n, final boolean b, final int i) {
        if (playerComposition == null) {
            playerComposition.method1699(n, b, n);
            return;
        }
        try {
            int n2 = playerComposition.equipment[n];
            Label_0130: {
                if (!b) {
                    if (i >= -1151481052) {
                        throw new IllegalStateException();
                    }
                    Label_0026: {
                        break Label_0026;
                    Label_0060_Outer:
                        do {
                            n2 = PlayerComposition.field2828[n].length - 1;
                            while (true) {
                                if (ClanSettings.method867(n, n2, (byte)68)) {
                                    if (i >= -1151481052) {
                                        throw new IllegalStateException();
                                    }
                                    break Label_0130;
                                }
                                else {
                                    --n2;
                                    if (n2 < 0) {
                                        continue Label_0060_Outer;
                                    }
                                    continue;
                                }
                                break;
                            }
                        } while (i < -1151481052);
                    }
                    return;
                }
                else {
                    while (true) {
                        if (++n2 >= PlayerComposition.field2828[n].length) {
                            if (i >= -1151481052) {
                                return;
                            }
                            n2 = 0;
                        }
                        if (ClanSettings.method867(n, n2, (byte)63)) {
                            if (i >= -1151481052) {
                                return;
                            }
                            break;
                        }
                    }
                }
            }
            playerComposition.equipment[n] = n2;
            playerComposition.method1702(1418315210);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.ab(" + ')');
        }
    }
    
    public static void bp() {
        PlayerComposition.PlayerAppearance_cachedModels.clear();
    }
    
    public void bt(final Buffer buffer) {
        buffer.writeShort(1693987821 * this.npcTransformId, (byte)92);
        for (int i = 0; i < 7; ++i) {
            final int n = this.field2841[PlayerComposition.equipmentIndices[i]];
            if (n == 0) {
                buffer.writeShort(-1, (byte)53);
            }
            else {
                buffer.writeShort(n - 256, (byte)14);
            }
        }
        for (int j = 0; j < 5; ++j) {
            buffer.writeShort(this.equipment[j], (byte)63);
        }
    }
    
    public static void bc() {
        PlayerComposition.PlayerAppearance_cachedModels.clear();
    }
    
    public Model br(final SequenceDefinition sequenceDefinition, final int n, final SequenceDefinition sequenceDefinition2, final int n2) {
        if (-1 != -2131733097 * this.field2831) {
            return AbstractArchive.getNpcDefinition(this.field2831 * -2131733097, (byte)(-41)).method1021(sequenceDefinition, n, sequenceDefinition2, n2, null, (byte)10);
        }
        long n3 = this.field2834 * 800274196296009541L;
        int[] field2841 = this.field2841;
        if (sequenceDefinition != null && (sequenceDefinition.shield * -932726919 >= 0 || sequenceDefinition.weapon * -170018527 >= 0)) {
            field2841 = new int[12];
            for (int i = 0; i < 12; ++i) {
                field2841[i] = this.field2841[i];
            }
            if (-932726919 * sequenceDefinition.shield >= 0) {
                n3 += -932726919 * sequenceDefinition.shield - this.field2841[5] << 40;
                field2841[5] = sequenceDefinition.shield * -932726919;
            }
            if (-170018527 * sequenceDefinition.weapon >= 0) {
                n3 += sequenceDefinition.weapon * -170018527 - this.field2841[3] << 48;
                field2841[3] = sequenceDefinition.weapon * -170018527;
            }
        }
        Model dg = (Model)PlayerComposition.PlayerAppearance_cachedModels.wr(n3);
        if (null == dg) {
            boolean b = false;
            for (int j = 0; j < 12; ++j) {
                final int n4 = field2841[j];
                if (n4 >= 256 && n4 < 512 && !class100.KitDefinition_get(n4 - 256, -2129457586).ready(-1660928785)) {
                    b = true;
                }
                if (n4 >= 512 && !HealthBarUpdate.set(n4 - 512, (byte)113).method1105(this.npcTransformId * 1693987821, -1686902783)) {
                    b = true;
                }
            }
            if (b) {
                if (-1L != 1976929687773021041L * this.hash) {
                    dg = (Model)PlayerComposition.PlayerAppearance_cachedModels.wr(1976929687773021041L * this.hash);
                }
                if (null == dg) {
                    return null;
                }
            }
            if (dg == null) {
                final ModelData[] array = new ModelData[12];
                int n5 = 0;
                for (int k = 0; k < 12; ++k) {
                    final int n6 = field2841[k];
                    if (n6 >= 256 && n6 < 512) {
                        final ModelData qv = KitDefinition.qv(class100.KitDefinition_get(n6 - 256, 1541329039), 1165205501);
                        if (qv != null) {
                            array[n5++] = qv;
                        }
                    }
                    if (n6 >= 512) {
                        final ItemComposition set = HealthBarUpdate.set(n6 - 512, (byte)104);
                        final ModelData method1111 = set.method1111(1693987821 * this.npcTransformId, 2025448517);
                        if (method1111 != null) {
                            if (null != this.customisations) {
                                final ObjTypeCustomisation objTypeCustomisation = this.customisations[k];
                                if (objTypeCustomisation != null) {
                                    if (objTypeCustomisation.recol != null && set.recolorFrom != null && set.recolorTo.length == objTypeCustomisation.recol.length) {
                                        for (int l = 0; l < set.recolorFrom.length; ++l) {
                                            ModelData.lm(method1111, set.recolorTo[l], objTypeCustomisation.recol[l]);
                                        }
                                    }
                                    if (null != objTypeCustomisation.retex && set.retextureFrom != null && objTypeCustomisation.retex.length == set.retextureTo.length) {
                                        for (int n7 = 0; n7 < set.retextureFrom.length; ++n7) {
                                            ModelData.jw(method1111, set.retextureTo[n7], objTypeCustomisation.retex[n7]);
                                        }
                                    }
                                }
                            }
                            array[n5++] = method1111;
                        }
                    }
                }
                final ModelData modelData = new ModelData(array, n5);
                for (int n8 = 0; n8 < 5; ++n8) {
                    if (this.equipment[n8] < PlayerComposition.field2828[n8].length) {
                        ModelData.lm(modelData, PlayerComposition.field2837[n8], PlayerComposition.field2828[n8][this.equipment[n8]]);
                    }
                    if (this.equipment[n8] < class437.field3825[n8].length) {
                        ModelData.lm(modelData, WorldMapIcon_0.field2359[n8], class437.field3825[n8][this.equipment[n8]]);
                    }
                }
                dg = modelData.dg(64, 850, -30, -50, -30);
                PlayerComposition.PlayerAppearance_cachedModels.put(dg, n3);
                this.hash = n3 * 3107045911833599377L;
            }
        }
        Model model;
        if (sequenceDefinition == null && sequenceDefinition2 == null) {
            model = dg.toSharedSequenceModel(true);
        }
        else if (sequenceDefinition != null && null != sequenceDefinition2) {
            model = sequenceDefinition.applyTransformations(dg, n, sequenceDefinition2, n2, 1555486161);
        }
        else if (null != sequenceDefinition) {
            model = sequenceDefinition.transformActorModel(dg, n, (byte)(-99));
        }
        else {
            model = sequenceDefinition2.transformActorModel(dg, n2, (byte)(-8));
        }
        return model;
    }
    
    int[] method1697(final int n, final int n2) {
        try {
            final int[] array = new int[12];
            for (int i = 0; i < 7; ++i) {
                class163.method915(n, array, i, 1266886036);
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.aw(" + ')');
        }
    }
    
    public void am(final int[] array, final int[] array2, final ObjTypeCustomisation[] customisations, final boolean isFemale, final int[] array3, final int n, final int n2, final int n3) {
        this.customisations = customisations;
        this.isFemale = isFemale;
        this.field2840 = n3 * 1029929221;
        this.method1693(array, array2, array3, n, n2, 827291885);
    }
    
    public void write(final Buffer buffer, final byte b) {
        try {
            buffer.writeShortAddLE(1693987821 * this.field2840, (byte)8);
            for (int i = 0; i < 7; ++i) {
                final int n = this.field2841[PlayerComposition.equipmentIndices[i]];
                if (n == 0) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    buffer.writeShortAddLE(-1, (byte)63);
                }
                else {
                    buffer.writeIntME(n - 256, (byte)91);
                }
            }
            for (int j = 0; j < 5; ++j) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                buffer.writeIntME(this.equipment[j], (byte)117);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.al(" + ')');
        }
    }
    
    public void method1693(int[] method1697, int[] method1698, final int[] equipment, final int n, final int n2, final int n3) {
        try {
            if (null == method1697) {
                if (n3 <= -397694263) {
                    return;
                }
                method1697 = this.method1697(n, -1826313610);
            }
            if (null == method1698) {
                if (n3 <= -397694263) {
                    throw new IllegalStateException();
                }
                method1698 = this.method1697(n, 1564505092);
            }
            this.bodyColors = method1697;
            this.field2841 = method1698;
            this.equipment = equipment;
            this.npcTransformId = 325591525 * n;
            this.field2831 = -11568601 * n2;
            this.method1702(1418315210);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.an(" + ')');
        }
    }
    
    public int bq() {
        if (this.field2831 * -2131733097 == -1) {
            return (this.field2841[11] << 5) + ((this.field2841[8] << 10) + ((this.equipment[0] << 25) + (this.equipment[4] << 20) + (this.field2841[0] << 15))) + this.field2841[1];
        }
        return 305419896 + AbstractArchive.getNpcDefinition(this.field2831 * -2131733097, (byte)(-48)).id * -1115372301;
    }
    
    public void changeAppearance(final int n, final boolean b, final int n2) {
        try {
            if (n == 1) {
                if (n2 >= 1720825291) {
                    throw new IllegalStateException();
                }
                if (1 == this.npcTransformId * 1693987821) {
                    if (n2 >= 1720825291) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            int n3 = this.field2841[PlayerComposition.equipmentIndices[n]];
            if (n3 == 0) {
                if (n2 >= 1720825291) {
                    throw new IllegalStateException();
                }
            }
            else {
                n3 -= 256;
                while (true) {
                    if (!b) {
                        if (n2 >= 1720825291) {
                            throw new IllegalStateException();
                        }
                        --n3;
                        if (n3 < 0) {
                            if (n2 >= 1720825291) {
                                return;
                            }
                            n3 = KitDefinition.KitDefinition_fileCount * 743589639 - 1;
                        }
                    }
                    else if (++n3 >= 743589639 * KitDefinition.KitDefinition_fileCount) {
                        n3 = 0;
                    }
                    final KitDefinition kitDefinition_get = class100.KitDefinition_get(n3, 607363354);
                    if (null != kitDefinition_get && !kitDefinition_get.nonSelectable) {
                        if (n2 >= 1720825291) {
                            throw new IllegalStateException();
                        }
                        final int n4 = kitDefinition_get.bodypartID * 1015855167;
                        int n5;
                        if (1 == this.npcTransformId * 1693987821) {
                            if (n2 >= 1720825291) {
                                throw new IllegalStateException();
                            }
                            n5 = 7;
                        }
                        else {
                            n5 = 0;
                        }
                        if (n4 != n + n5) {
                            continue;
                        }
                        if (n2 >= 1720825291) {
                            return;
                        }
                        this.field2841[PlayerComposition.equipmentIndices[n]] = 256 + n3;
                        this.method1702(1418315210);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.au(" + ')');
        }
    }
    
    public Model getModel(final SequenceDefinition sequenceDefinition, final int n, final SequenceDefinition sequenceDefinition2, final int n2, final byte b) {
        try {
            if (-1 == -2131733097 * this.field2831) {
                long n3 = this.field2834 * 800274196296009541L;
                int[] field2841 = this.field2841;
                Label_0301: {
                    if (sequenceDefinition != null) {
                        if (b <= 4) {
                            throw new IllegalStateException();
                        }
                        if (sequenceDefinition.shield * -932726919 < 0) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            if (sequenceDefinition.weapon * -170018527 < 0) {
                                break Label_0301;
                            }
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                        }
                        field2841 = new int[12];
                        for (int i = 0; i < 12; ++i) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            field2841[i] = this.field2841[i];
                        }
                        if (-932726919 * sequenceDefinition.shield >= 0) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            n3 += -932726919 * sequenceDefinition.shield - this.field2841[5] << 40;
                            field2841[5] = sequenceDefinition.shield * -932726919;
                        }
                        if (-170018527 * sequenceDefinition.weapon >= 0) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            n3 += sequenceDefinition.weapon * -170018527 - this.field2841[3] << 48;
                            field2841[3] = sequenceDefinition.weapon * -170018527;
                        }
                    }
                }
                Model dg = (Model)PlayerComposition.PlayerAppearance_cachedModels.wr(n3);
                if (null == dg) {
                    int n4 = 0;
                    for (int j = 0; j < 12; ++j) {
                        if (b <= 4) {
                            throw new IllegalStateException();
                        }
                        final int n5 = field2841[j];
                        if (n5 >= 256) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            if (n5 < 512 && !class100.KitDefinition_get(n5 - 256, -398203160).ready(1647976754)) {
                                if (b <= 4) {
                                    throw new IllegalStateException();
                                }
                                n4 = 1;
                            }
                        }
                        if (n5 >= 512) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            if (!HealthBarUpdate.set(n5 - 512, (byte)104).method1105(this.npcTransformId * 1693987821, 1487793992)) {
                                if (b <= 4) {
                                    throw new IllegalStateException();
                                }
                                n4 = 1;
                            }
                        }
                    }
                    if (n4 != 0) {
                        if (b <= 4) {
                            throw new IllegalStateException();
                        }
                        if (-1L != 1976929687773021041L * this.hash) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            dg = (Model)PlayerComposition.PlayerAppearance_cachedModels.wr(1976929687773021041L * this.hash);
                        }
                        if (null == dg) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            return null;
                        }
                    }
                    if (dg == null) {
                        final ModelData[] array = new ModelData[12];
                        int n6 = 0;
                        for (int k = 0; k < 12; ++k) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            final int n7 = field2841[k];
                            if (n7 >= 256) {
                                if (b <= 4) {
                                    throw new IllegalStateException();
                                }
                                if (n7 < 512) {
                                    if (b <= 4) {
                                        throw new IllegalStateException();
                                    }
                                    final ModelData qv = KitDefinition.qv(class100.KitDefinition_get(n7 - 256, 1653303319), -240292107);
                                    if (qv != null) {
                                        if (b <= 4) {
                                            throw new IllegalStateException();
                                        }
                                        array[n6++] = qv;
                                    }
                                }
                            }
                            if (n7 >= 512) {
                                final ItemComposition set = HealthBarUpdate.set(n7 - 512, (byte)31);
                                final ModelData method1111 = set.method1111(1693987821 * this.npcTransformId, 1938506301);
                                if (method1111 != null) {
                                    if (b <= 4) {
                                        throw new IllegalStateException();
                                    }
                                    if (null != this.customisations) {
                                        if (b <= 4) {
                                            throw new IllegalStateException();
                                        }
                                        final ObjTypeCustomisation objTypeCustomisation = this.customisations[k];
                                        if (objTypeCustomisation != null) {
                                            if (b <= 4) {
                                                throw new IllegalStateException();
                                            }
                                            if (objTypeCustomisation.recol != null && set.recolorFrom != null) {
                                                if (b <= 4) {
                                                    throw new IllegalStateException();
                                                }
                                                if (set.recolorTo.length == objTypeCustomisation.recol.length) {
                                                    if (b <= 4) {
                                                        throw new IllegalStateException();
                                                    }
                                                    for (int l = 0; l < set.recolorFrom.length; ++l) {
                                                        if (b <= 4) {
                                                            throw new IllegalStateException();
                                                        }
                                                        ModelData.lm(method1111, set.recolorTo[l], objTypeCustomisation.recol[l]);
                                                    }
                                                }
                                            }
                                            if (null != objTypeCustomisation.retex) {
                                                if (b <= 4) {
                                                    throw new IllegalStateException();
                                                }
                                                if (set.retextureFrom != null && objTypeCustomisation.retex.length == set.retextureTo.length) {
                                                    if (b <= 4) {
                                                        throw new IllegalStateException();
                                                    }
                                                    for (int n8 = 0; n8 < set.retextureFrom.length; ++n8) {
                                                        if (b <= 4) {
                                                            throw new IllegalStateException();
                                                        }
                                                        ModelData.jw(method1111, set.retextureTo[n8], objTypeCustomisation.retex[n8]);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    array[n6++] = method1111;
                                }
                            }
                        }
                        final ModelData modelData = new ModelData(array, n6);
                        for (int n9 = 0; n9 < 5; ++n9) {
                            if (b <= 4) {
                                throw new IllegalStateException();
                            }
                            if (this.equipment[n9] < PlayerComposition.field2828[n9].length) {
                                if (b <= 4) {
                                    throw new IllegalStateException();
                                }
                                ModelData.lm(modelData, PlayerComposition.field2837[n9], PlayerComposition.field2828[n9][this.equipment[n9]]);
                            }
                            if (this.equipment[n9] < class437.field3825[n9].length) {
                                ModelData.lm(modelData, WorldMapIcon_0.field2359[n9], class437.field3825[n9][this.equipment[n9]]);
                            }
                        }
                        dg = modelData.dg(64, 850, -30, -50, -30);
                        PlayerComposition.PlayerAppearance_cachedModels.put(dg, n3);
                        this.hash = n3 * 3107045911833599377L;
                    }
                }
                if (sequenceDefinition == null) {
                    if (b <= 4) {
                        throw new IllegalStateException();
                    }
                    if (sequenceDefinition2 == null) {
                        if (b <= 4) {
                            throw new IllegalStateException();
                        }
                        return dg.toSharedSequenceModel(true);
                    }
                }
                if (sequenceDefinition != null) {
                    if (b <= 4) {
                        throw new IllegalStateException();
                    }
                    if (null != sequenceDefinition2) {
                        if (b <= 4) {
                            throw new IllegalStateException();
                        }
                        return sequenceDefinition.applyTransformations(dg, n, sequenceDefinition2, n2, 1451879882);
                    }
                }
                Model model;
                if (null != sequenceDefinition) {
                    if (b <= 4) {
                        throw new IllegalStateException();
                    }
                    model = sequenceDefinition.transformActorModel(dg, n, (byte)(-114));
                }
                else {
                    model = sequenceDefinition2.transformActorModel(dg, n2, (byte)(-66));
                }
                return model;
            }
            if (b <= 4) {
                throw new IllegalStateException();
            }
            return AbstractArchive.getNpcDefinition(this.field2831 * -2131733097, (byte)(-24)).method1021(sequenceDefinition, n, sequenceDefinition2, n2, null, (byte)49);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.aa(" + ')');
        }
    }
    
    public int[] getColors() {
        return this.equipment;
    }
    
    static void by(final int n, final int[] array, final int n2) {
        for (int i = 0; i < 743589639 * KitDefinition.KitDefinition_fileCount; ++i) {
            final KitDefinition kitDefinition_get = class100.KitDefinition_get(i, 2024528013);
            if (kitDefinition_get != null && !kitDefinition_get.nonSelectable && ((1 == n) ? 7 : 0) + n2 == 882478061 * kitDefinition_get.bodypartID) {
                array[PlayerComposition.equipmentIndices[n2]] = 256 + i;
                break;
            }
        }
    }
    
    public void ar(final int[] array, final int[] array2, final ObjTypeCustomisation[] customisations, final boolean isFemale, final int[] array3, final int n, final int n2, final int n3) {
        this.customisations = customisations;
        this.isFemale = isFemale;
        this.field2840 = n3 * -888834712;
        this.method1693(array, array2, array3, n, n2, 1119652293);
    }
    
    int[] ap(final int n) {
        final int[] array = new int[12];
        for (int i = 0; i < 7; ++i) {
            class163.method915(n, array, i, 1338646046);
        }
        return array;
    }
    
    public static void xb(final PlayerComposition playerComposition, final int n, final boolean b) {
        int n2 = playerComposition.equipment[n];
        if (!b) {
            do {
                --n2;
                if (n2 < 0) {
                    n2 = PlayerComposition.field2828[n].length - 1;
                }
            } while (!ClanSettings.method867(n, n2, (byte)81));
        }
        else {
            do {
                ++n2;
                if (n2 >= PlayerComposition.field2828[n].length) {
                    n2 = 0;
                }
            } while (!ClanSettings.method867(n, n2, (byte)59));
        }
        playerComposition.equipment[n] = n2;
        playerComposition.method1702(1418315210);
    }
    
    public void bd(final int n) {
        if (-1066907287 * this.npcTransformId == n) {
            return;
        }
        this.method1693(null, null, this.equipment, n, -1, 603346218);
    }
    
    ModelData bg() {
        if (-1 != this.field2831 * -2131733097) {
            return AbstractArchive.getNpcDefinition(this.field2831 * -2131733097, (byte)(-72)).method1022(null, (byte)64);
        }
        int n = 0;
        for (int i = 0; i < 12; ++i) {
            final int n2 = this.field2841[i];
            if (n2 >= 256 && n2 < -2054696259 && !class100.KitDefinition_get(n2 - 256, 1793015172).method997((byte)54)) {
                n = 1;
            }
            if (n2 >= 512 && !HealthBarUpdate.set(n2 - 512, (byte)14).method1104(this.npcTransformId * 1693987821, -711110051)) {
                n = 1;
            }
        }
        if (n != 0) {
            return null;
        }
        final ModelData[] array = new ModelData[12];
        int n3 = 0;
        for (int j = 0; j < 12; ++j) {
            final int n4 = this.field2841[j];
            if (n4 >= 256 && n4 < 512) {
                final ModelData kitDefinitionModels = class100.KitDefinition_get(n4 - 256, -907891653).getKitDefinitionModels((byte)(-49));
                if (kitDefinitionModels != null) {
                    array[n3++] = kitDefinitionModels;
                }
            }
            if (n4 >= 512) {
                final ModelData by = ItemComposition.by(HealthBarUpdate.set(n4 - 512, (byte)25), this.npcTransformId * 7469784, -1065310064);
                if (null != by) {
                    array[n3++] = by;
                }
            }
        }
        final ModelData modelData = new ModelData(array, n3);
        for (int k = 0; k < 5; ++k) {
            if (this.equipment[k] < PlayerComposition.field2828[k].length) {
                ModelData.lm(modelData, PlayerComposition.field2837[k], PlayerComposition.field2828[k][this.equipment[k]]);
            }
            if (this.equipment[k] < class437.field3825[k].length) {
                ModelData.lm(modelData, WorldMapIcon_0.field2359[k], class437.field3825[k][this.equipment[k]]);
            }
        }
        return modelData;
    }
    
    public static byte[] method1692(final CharSequence charSequence, final byte b) {
        try {
            final int length = charSequence.length();
            final byte[] array = new byte[length];
            for (int i = 0; i < length; ++i) {
                if (b >= -1) {
                    throw new IllegalStateException();
                }
                final char char1 = charSequence.charAt(i);
                if (char1 > '\u007f') {
                    array[i] = 63;
                }
                else {
                    array[i] = (byte)char1;
                }
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.af(" + ')');
        }
    }
    
    public static final void method1692(final long n) {
        try {
            if (n <= 0L) {
                return;
            }
            if (0L == n % 10L) {
                final long n2 = n - 1L;
                try {
                    Thread.sleep(n2);
                }
                catch (InterruptedException ex2) {}
                try {
                    Thread.sleep(1L);
                }
                catch (InterruptedException ex3) {}
            }
            else {
                try {
                    Thread.sleep(n);
                }
                catch (InterruptedException ex4) {}
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.af(" + ')');
        }
    }
    
    public void method1692(final int[] array, final int[] array2, final ObjTypeCustomisation[] customisations, final boolean isFemale, final int[] array3, final int n, final int n2, final int n3, final byte b) {
        try {
            this.customisations = customisations;
            this.isFemale = isFemale;
            this.field2840 = n3 * 1029929221;
            this.method1693(array, array2, array3, n, n2, -84427173);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.af(" + ')');
        }
    }
    
    void bn() {
        final long n = 800274196296009541L * this.field2834;
        final int n2 = this.field2841[5];
        final int n3 = this.field2841[9];
        this.field2841[5] = n3;
        this.field2841[9] = n2;
        this.field2834 = 0L;
        for (int i = 0; i < 12; ++i) {
            this.field2834 = (this.field2834 * 800274196296009541L << 4) * 4410892792882131853L;
            if (this.field2841[i] >= -1592521168) {
                this.field2834 += 4410892792882131853L * (this.field2841[i] - 256);
            }
        }
        if (this.field2841[0] >= 1284192560) {
            this.field2834 += (this.field2841[0] - 256 >> 4) * 4410892792882131853L;
        }
        if (this.field2841[1] >= -963100452) {
            this.field2834 += (this.field2841[1] - 640750922 >> 8) * 4410892792882131853L;
        }
        for (int j = 0; j < 5; ++j) {
            this.field2834 = 4410892792882131853L * (800274196296009541L * this.field2834 << 3);
            this.field2834 += this.equipment[j] * 4410892792882131853L;
        }
        this.field2834 = 4410892792882131853L * (800274196296009541L * this.field2834 << 1);
        this.field2834 += this.npcTransformId * -7585466391638339447L;
        this.field2841[5] = n2;
        this.field2841[9] = n3;
        if ((n != 0L && this.field2834 * 800274196296009541L != n) || this.isFemale) {
            PlayerComposition.PlayerAppearance_cachedModels.remove(n);
        }
    }
    
    public void method1699(final int n, final boolean b, final int n2) {
        try {
            if (n == 1) {
                if (n2 >= 1720825291) {
                    throw new IllegalStateException();
                }
                if (1 == this.field2840 * 1693987821) {
                    if (n2 >= 1720825291) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            int n3 = this.field2841[PlayerComposition.equipmentIndices[n]];
            if (n3 == 0) {
                if (n2 >= 1720825291) {
                    throw new IllegalStateException();
                }
            }
            else {
                n3 -= 256;
                while (true) {
                    if (!b) {
                        if (n2 >= 1720825291) {
                            throw new IllegalStateException();
                        }
                        --n3;
                        if (n3 < 0) {
                            if (n2 >= 1720825291) {
                                return;
                            }
                            n3 = KitDefinition.KitDefinition_fileCount * 743589639 - 1;
                        }
                    }
                    else if (++n3 >= 743589639 * KitDefinition.KitDefinition_fileCount) {
                        n3 = 0;
                    }
                    final KitDefinition kitDefinition_get = class100.KitDefinition_get(n3, 607363354);
                    if (null != kitDefinition_get && !kitDefinition_get.nonSelectable) {
                        if (n2 >= 1720825291) {
                            throw new IllegalStateException();
                        }
                        final int n4 = kitDefinition_get.bodypartID * 1015855167;
                        int n5;
                        if (1 == this.npcTransformId * 1693987821) {
                            if (n2 >= 1720825291) {
                                throw new IllegalStateException();
                            }
                            n5 = 7;
                        }
                        else {
                            n5 = 0;
                        }
                        if (n4 != n + n5) {
                            continue;
                        }
                        if (n2 >= 1720825291) {
                            return;
                        }
                        this.equipment[PlayerComposition.equipmentIndices[n]] = 256 + n3;
                        this.setHash(1418315210);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.au(" + ')');
        }
    }
    
    public void method1694(final int n, final int n2) {
        try {
            if (1693987821 * this.npcTransformId == n) {
                return;
            }
            this.method1693(null, null, this.equipment, n, -1, 1968160037);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.aq(" + ')');
        }
    }
    
    public void ag(final int[] array, final int[] array2, final ObjTypeCustomisation[] customisations, final boolean isFemale, final int[] array3, final int n, final int n2, final int n3) {
        this.customisations = customisations;
        this.isFemale = isFemale;
        this.field2840 = n3 * 1029929221;
        this.method1693(array, array2, array3, n, n2, 8277253);
    }
    
    public static void bl() {
        PlayerComposition.PlayerAppearance_cachedModels.clear();
    }
    
    public void bz(final int n, final boolean b) {
        int n2 = this.equipment[n];
        if (!b) {
            do {
                --n2;
                if (n2 < 0) {
                    n2 = PlayerComposition.field2828[n].length - 1;
                }
            } while (!ClanSettings.method867(n, n2, (byte)41));
        }
        else {
            do {
                if (++n2 >= PlayerComposition.field2828[n].length) {
                    n2 = 0;
                }
            } while (!ClanSettings.method867(n, n2, (byte)49));
        }
        this.equipment[n] = n2;
        this.method1702(1418315210);
    }
    
    public void setHash() {
        this.method1702(1418315210);
    }
    
    public void bj(final Buffer buffer) {
        buffer.writeShort(1693987821 * this.npcTransformId, (byte)106);
        for (int i = 0; i < 7; ++i) {
            final int n = this.field2841[PlayerComposition.equipmentIndices[i]];
            if (n == 0) {
                buffer.writeShort(-1, (byte)68);
            }
            else {
                buffer.writeShort(n + 46987117, (byte)71);
            }
        }
        for (int j = 0; j < 5; ++j) {
            buffer.writeShort(this.equipment[j], (byte)94);
        }
    }
    
    public static int[] vl(final PlayerComposition playerComposition, final int n) {
        if (playerComposition == null) {
            playerComposition.method1694(n, n);
        }
        final int[] array = new int[12];
        for (int i = 0; i < 7; ++i) {
            class163.method915(n, array, i, 1659888460);
        }
        return array;
    }
    
    public void bm(final int n, final boolean b) {
        int n2 = this.equipment[n];
        if (!b) {
            do {
                if (--n2 < 0) {
                    n2 = PlayerComposition.field2828[n].length - 1;
                }
            } while (!ClanSettings.method867(n, n2, (byte)49));
        }
        else {
            do {
                ++n2;
                if (n2 >= PlayerComposition.field2828[n].length) {
                    n2 = 0;
                }
            } while (!ClanSettings.method867(n, n2, (byte)77));
        }
        this.equipment[n] = n2;
        this.method1702(1418315210);
    }
    
    public void ah(final int[] array, final int[] array2, final ObjTypeCustomisation[] customisations, final boolean isFemale, final int[] array3, final int n, final int n2, final int n3) {
        this.customisations = customisations;
        this.isFemale = isFemale;
        this.npcTransformId = n3 * 1029929221;
        this.method1693(array, array2, array3, n, n2, 8277253);
    }
    
    public static int yt(final PlayerComposition playerComposition) {
        if (playerComposition == null) {
            playerComposition.bs();
        }
        if (playerComposition.field2831 * 326101195 == -1) {
            return (playerComposition.field2841[11] << 5) + ((playerComposition.field2841[8] << 10) + ((playerComposition.equipment[0] << 25) + (playerComposition.equipment[4] << 20) + (playerComposition.field2841[0] << 15))) + playerComposition.field2841[1];
        }
        return 1169259612 + AbstractArchive.getNpcDefinition(playerComposition.field2831 * 609322779, (byte)(-92)).id * -1115372301;
    }
    
    public static void yo(final PlayerComposition playerComposition, final Buffer buffer, final byte b) {
        if (playerComposition == null) {
            playerComposition.write(buffer, b);
        }
        try {
            buffer.writeShort(1693987821 * playerComposition.npcTransformId, (byte)8);
            for (int i = 0; i < 7; ++i) {
                final int n = playerComposition.field2841[PlayerComposition.equipmentIndices[i]];
                if (n == 0) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    buffer.writeShort(-1, (byte)63);
                }
                else {
                    buffer.writeShort(n - 256, (byte)91);
                }
            }
            for (int j = 0; j < 5; ++j) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                buffer.writeShort(playerComposition.equipment[j], (byte)117);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mw.al(" + ')');
        }
    }
    
    public static void uj(final PlayerComposition playerComposition, int[] method1697, int[] method1698, final int[] equipment, final int n, final int n2) {
        if (playerComposition == null) {
            playerComposition.bq();
        }
        if (null == method1697) {
            method1697 = playerComposition.method1697(n, -710808975);
        }
        if (null == method1698) {
            method1698 = playerComposition.method1697(n, 1282480463);
        }
        playerComposition.bodyColors = method1697;
        playerComposition.field2841 = method1698;
        playerComposition.equipment = equipment;
        playerComposition.npcTransformId = 325591525 * n;
        playerComposition.field2831 = -11568601 * n2;
        playerComposition.method1702(1418315210);
    }
    
    public static void ju(final PlayerComposition playerComposition, final int[] array, final int[] array2, final ObjTypeCustomisation[] customisations, final boolean isFemale, final int[] array3, final int n, final int n2, final int n3) {
        if (playerComposition == null) {
            playerComposition.ah(array, array, customisations, isFemale, array, n, n, n);
        }
        playerComposition.customisations = customisations;
        playerComposition.isFemale = isFemale;
        playerComposition.field2840 = n3 * 1029929221;
        playerComposition.method1693(array, array2, array3, n, n2, 109475088);
    }
    
    public int bu() {
        if (this.field2831 * -2131733097 == -1) {
            return (this.field2841[11] << 5) + ((this.field2841[8] << 10) + ((this.equipment[0] << 25) + (this.equipment[4] << 20) + (this.field2841[0] << 15))) + this.field2841[1];
        }
        return 305419896 + AbstractArchive.getNpcDefinition(this.field2831 * -2131733097, (byte)(-99)).id * -1115372301;
    }
    
    public ColorTextureOverride[] getColorTextureOverrides() {
        return (ColorTextureOverride[])this.customisations;
    }
    
    public void setTransformedNpcId(final int n) {
        this.field2831 = n * -11568601;
    }
    
    public int getKitId(final KitType kitType) {
        final int n = this.getEquipmentIds()[kitType.getIndex()];
        if (n < 256 || n >= 512) {
            return -1;
        }
        return n - 256;
    }
    
    public int getEquipmentId(final KitType kitType) {
        final int n = this.getEquipmentIds()[kitType.getIndex()];
        if (n < 512) {
            return -1;
        }
        return n - 512;
    }
    
    public int[] getEquipmentIds() {
        return this.field2841;
    }
    
    public int getGender() {
        return this.npcTransformId * 1693987821;
    }
    
    public boolean isFemale() {
        return this.getGender() == 1;
    }
}
