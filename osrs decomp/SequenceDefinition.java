import java.util.HashMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;
import net.runelite.api.Animation;

// 
// Decompiled by Procyon v0.5.36
// 

public class SequenceDefinition extends DualNode implements Animation
{
    public static final Set et;
    int animMayaStart;
    public static EvictingDualNodeHashTable SequenceDefinition_cached;
    public int iterations;
    public static final int ac = 2;
    boolean[] animMayaMasks;
    static AbstractArchive SequenceDefinition_animationsArchive;
    static AbstractArchive SequenceDefinition_skeletonsArchive;
    static final int aw = 1;
    public int forcedPriority;
    public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
    public int SequenceDefinition_cachedModelId;
    int[] chatFrameIds;
    static boolean field1814;
    int animMayaEnd;
    public int eh;
    public int[] frameIds;
    public int frameCount;
    public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
    public int[] soundEffects;
    public int[] frameLengths;
    int[] mergedBoneGroups;
    static final int an = 0;
    public boolean stretches;
    public boolean field1823;
    public int shield;
    public int weapon;
    static AbstractArchive SequenceDefinition_archive;
    public Map animMayaFrameSounds;
    public int precedenceAnimating;
    public int priority;
    public int replyMode;
    
    SequenceDefinition() {
        this.SequenceDefinition_cachedModelId = -526927311;
        this.animMayaStart = 0;
        this.animMayaEnd = 0;
        this.frameCount = -332517881;
        this.stretches = false;
        this.forcedPriority = -2088242069;
        this.shield = -766640841;
        this.weapon = -960826081;
        this.iterations = 2043481909;
        this.field1823 = false;
        this.precedenceAnimating = -738419331;
        this.priority = 2012018311;
        this.replyMode = -950238702;
    }
    
    static {
        SequenceDefinition.field1814 = false;
        SequenceDefinition.SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
        SequenceDefinition.SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
        SequenceDefinition.SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
        et = (Set)ImmutableSet.of((Object)472, (Object)1729);
    }
    
    static class133 cs(final int n) {
        if (class20.method82(n, 854271946) != 0) {
            return null;
        }
        final class133 class133 = (class133)SequenceDefinition.SequenceDefinition_cachedModel.wr(n);
        class133 class134;
        if (null != class133) {
            class134 = class133;
        }
        else {
            final class133 method1180 = class211.method1180(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, 197987423);
            if (null != method1180) {
                SequenceDefinition.SequenceDefinition_cachedModel.put(method1180, n);
            }
            class134 = method1180;
        }
        return class134;
    }
    
    static int method1135(final byte[] array, final int n, final int n2, final int n3) {
        try {
            int n4 = -1;
            for (int i = n; i < n2; ++i) {
                if (n3 == -290584708) {
                    throw new IllegalStateException();
                }
                n4 = (n4 >>> 8 ^ Buffer.crc32Table[(n4 ^ array[i]) & 0xFF]);
            }
            return ~n4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.bs(" + ')');
        }
    }
    
    Model method1135(final Model model, int n, final SequenceDefinition sequenceDefinition, int n2) {
        n = this.frameIds[n];
        final Frames frames = WorldMapID.getFrames(n >> 16, 1377956105);
        n &= 0xFFFF;
        if (null == frames) {
            return sequenceDefinition.transformActorModel(model, n2, (byte)(-12));
        }
        n2 = sequenceDefinition.frameIds[n2];
        final Frames frames2 = WorldMapID.getFrames(n2 >> 16, 1554020886);
        n2 &= 0xFFFF;
        if (null == frames2) {
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, -48137992));
            Model.ug(sharedSequenceModel, frames, n);
            return sharedSequenceModel;
        }
        final Model sharedSequenceModel2 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, -172501145) & !frames2.hasAlphaTransform(n2, 1028361526));
        Model.method1332(sharedSequenceModel2, frames, n, frames2, n2, this.mergedBoneGroups);
        return sharedSequenceModel2;
    }
    
    void ae() {
        if (1069382699 * this.precedenceAnimating == -1) {
            if (null != this.mergedBoneGroups || null != this.animMayaMasks) {
                this.precedenceAnimating = 1476838662;
            }
            else {
                this.precedenceAnimating = 0;
            }
        }
        if (-1 == this.priority * 1957040329) {
            if (null == this.mergedBoneGroups && this.animMayaMasks == null) {
                this.priority = 0;
            }
            else {
                this.priority = 270930674;
            }
        }
    }
    
    public static int ce(final int n) {
        final class133 class133 = (class133)SequenceDefinition.SequenceDefinition_cachedModel.wr(n);
        class133 class134;
        if (class133 != null) {
            class134 = class133;
        }
        else {
            final class133 method1180 = class211.method1180(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, 324760637);
            if (null != method1180) {
                SequenceDefinition.SequenceDefinition_cachedModel.put(method1180, n);
            }
            class134 = method1180;
        }
        final class133 class135 = class134;
        if (null == class135) {
            return 2;
        }
        return class135.method774(-63286081) ? 0 : 1;
    }
    
    public Model bb(final Model model, int n) {
        if (!this.isCachedModelIdSet(-1769460313)) {
            n = this.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, 1504818046);
            n &= 0xFFFF;
            if (null == frames) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, 746119541));
            Model.ug(sharedSequenceModel, frames, n);
            return sharedSequenceModel;
        }
        else {
            final class133 method626 = TileItem.method626(this.SequenceDefinition_cachedModelId * 1938551039, 2146143073);
            if (null == method626) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel2 = model.toSharedSequenceModel(!method626.method770(1713081171));
            sharedSequenceModel2.method1317(method626, n);
            return sharedSequenceModel2;
        }
    }
    
    public int getId() {
        return this.eh;
    }
    
    static Frames bw(final int n) {
        final Frames frames = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.wr(n);
        if (frames != null) {
            return frames;
        }
        final Frames method524 = PendingSpawn.method524(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, -894572511);
        if (method524 != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put(method524, n);
        }
        return method524;
    }
    
    public boolean isCachedModelIdSet(final int n) {
        try {
            boolean b;
            if (this.SequenceDefinition_cachedModelId * 1238147375 >= 0) {
                if (n == 1671088558) {
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
            throw HealthBar.get(ex, "ha.ao(" + ')');
        }
    }
    
    public Model applyTransformations(final Model model, int n, final SequenceDefinition sequenceDefinition, int n2, final int n3) {
        if (n < 0) {
            n = ((n ^ Integer.MIN_VALUE) & 0xFFFF);
        }
        if (n2 < 0) {
            n2 = ((n2 ^ Integer.MIN_VALUE) & 0xFFFF);
        }
        final int n4 = n;
        final int n5 = n2;
        int n6 = n4;
        final int n7 = 1451879882;
        Model model2;
        try {
            if (SequenceDefinition.field1814) {
                if (n7 <= 1422738245) {
                    throw new IllegalStateException();
                }
                if (!this.isCachedModelIdSet(528780304)) {
                    if (n7 <= 1422738245) {
                        throw new IllegalStateException();
                    }
                    if (!sequenceDefinition.isCachedModelIdSet(-1553118563)) {
                        if (n7 <= 1422738245) {
                            throw new IllegalStateException();
                        }
                        model2 = this.method1126(model, n6, sequenceDefinition, n5, (byte)52);
                        return model2;
                    }
                }
            }
            final Model sharedSequenceModel = model.toSharedSequenceModel(false);
            boolean cachedModelIdSet = false;
            Frames frames = null;
            Skeleton skeleton = null;
            Label_0386: {
                if (this.isCachedModelIdSet(-298382613)) {
                    if (n7 <= 1422738245) {
                        throw new IllegalStateException();
                    }
                    final class133 method1131 = this.method1131((byte)4);
                    if (null == method1131) {
                        if (n7 <= 1422738245) {
                            throw new IllegalStateException();
                        }
                        model2 = sharedSequenceModel;
                        return model2;
                    }
                    else {
                        if (sequenceDefinition.isCachedModelIdSet(-1499964341)) {
                            if (n7 <= 1422738245) {
                                throw new IllegalStateException();
                            }
                            if (this.animMayaMasks == null) {
                                if (n7 <= 1422738245) {
                                    throw new IllegalStateException();
                                }
                                sharedSequenceModel.method1317(method1131, n6);
                                model2 = sharedSequenceModel;
                                return model2;
                            }
                        }
                        skeleton = method1131.field1280;
                        final Model model3 = sharedSequenceModel;
                        final Skeleton skeleton2 = skeleton;
                        final class133 class133 = method1131;
                        final int n8 = n6;
                        final boolean[] animMayaMasks = this.animMayaMasks;
                        final boolean b = false;
                        boolean b2;
                        if (!sequenceDefinition.isCachedModelIdSet(-1447966042)) {
                            if (n7 <= 1422738245) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        Model.ee(model3, skeleton2, class133, n8, animMayaMasks, b, b2);
                    }
                }
                else {
                    final int n9 = this.frameIds[n6];
                    frames = WorldMapID.getFrames(n9 >> 16, 746118634);
                    n6 = (n9 & 0xFFFF);
                    if (frames != null) {
                        Label_0522: {
                            if (!sequenceDefinition.isCachedModelIdSet(-1590123636)) {
                                if (this.mergedBoneGroups != null) {
                                    if (n7 <= 1422738245) {
                                        throw new IllegalStateException();
                                    }
                                    if (-1 != n5) {
                                        break Label_0522;
                                    }
                                    if (n7 <= 1422738245) {
                                        throw new IllegalStateException();
                                    }
                                }
                                Model.ug(sharedSequenceModel, frames, n6);
                                model2 = sharedSequenceModel;
                                return model2;
                            }
                        }
                        if (this.mergedBoneGroups != null) {
                            if (n7 <= 1422738245) {
                                throw new IllegalStateException();
                            }
                            if (n5 == -1) {
                                if (n7 <= 1422738245) {
                                    throw new IllegalStateException();
                                }
                            }
                            else {
                                cachedModelIdSet = sequenceDefinition.isCachedModelIdSet(602151857);
                                if (!cachedModelIdSet) {
                                    sharedSequenceModel.method1322(frames, n6, this.mergedBoneGroups, false);
                                }
                                break Label_0386;
                            }
                        }
                        Model.ug(sharedSequenceModel, frames, n6);
                        model2 = sharedSequenceModel;
                        return model2;
                    }
                    if (n7 <= 1422738245) {
                        throw new IllegalStateException();
                    }
                    model2 = sequenceDefinition.transformActorModel(model, n5, (byte)(-111));
                    return model2;
                }
            }
            if (sequenceDefinition.isCachedModelIdSet(-564622343)) {
                if (n7 <= 1422738245) {
                    throw new IllegalStateException();
                }
                final class133 method1132 = sequenceDefinition.method1131((byte)(-53));
                if (method1132 == null) {
                    if (n7 <= 1422738245) {
                        throw new IllegalStateException();
                    }
                    model2 = sharedSequenceModel;
                    return model2;
                }
                else {
                    if (skeleton == null) {
                        skeleton = method1132.field1280;
                    }
                    Model.ee(sharedSequenceModel, skeleton, method1132, n5, this.animMayaMasks, true, true);
                }
            }
            else {
                final int n10 = sequenceDefinition.frameIds[n5];
                final Frames frames2 = WorldMapID.getFrames(n10 >> 16, 1727483448);
                final int n11 = n10 & 0xFFFF;
                if (frames2 == null) {
                    if (n7 <= 1422738245) {
                        throw new IllegalStateException();
                    }
                    model2 = this.transformActorModel(model, n6, (byte)(-33));
                    return model2;
                }
                else {
                    sharedSequenceModel.method1322(frames2, n11, this.mergedBoneGroups, true);
                }
            }
            if (cachedModelIdSet) {
                if (n7 <= 1422738245) {
                    throw new IllegalStateException();
                }
                if (frames != null) {
                    sharedSequenceModel.method1322(frames, n6, this.mergedBoneGroups, false);
                }
            }
            Model.dv(sharedSequenceModel);
            model2 = sharedSequenceModel;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.at(" + ')');
        }
        return model2;
    }
    
    void ak(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)(-23));
        }
    }
    
    Model be(final Model model, int n, int n2) {
        if (!this.isCachedModelIdSet(-2058472306)) {
            n = this.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, 1299186926);
            n &= 0xFFFF;
            if (frames == null) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, -728571592));
            n2 &= 0x3;
            if (n2 == 1) {
                Model.zm(sharedSequenceModel);
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel);
            }
            else if (n2 == 3) {
                sharedSequenceModel.rotateY90Ccw();
            }
            Model.ug(sharedSequenceModel, frames, n);
            if (n2 == 1) {
                sharedSequenceModel.rotateY90Ccw();
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel);
            }
            else if (n2 == 3) {
                Model.zm(sharedSequenceModel);
            }
            return sharedSequenceModel;
        }
        else {
            final class133 method626 = TileItem.method626(-1713418167 * this.SequenceDefinition_cachedModelId, 2139594039);
            if (null == method626) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel2 = model.toSharedSequenceModel(!method626.method770(1713081171));
            n2 &= 0x3;
            if (n2 == 1) {
                Model.zm(sharedSequenceModel2);
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel2);
            }
            else if (n2 == 3) {
                sharedSequenceModel2.rotateY90Ccw();
            }
            sharedSequenceModel2.method1317(method626, n);
            if (1 == n2) {
                sharedSequenceModel2.rotateY90Ccw();
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel2);
            }
            else if (3 == n2) {
                Model.zm(sharedSequenceModel2);
            }
            return sharedSequenceModel2;
        }
    }
    
    public static SequenceDefinition as(final int n) {
        final SequenceDefinition sequenceDefinition = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.wr(n);
        if (null != sequenceDefinition) {
            return sequenceDefinition;
        }
        final byte[] takeFile = SequenceDefinition.SequenceDefinition_archive.takeFile(12, n, (byte)(-106));
        final SequenceDefinition sequenceDefinition2 = new SequenceDefinition();
        if (takeFile != null) {
            sequenceDefinition2.decode(new Buffer(takeFile), 1877633819);
        }
        sequenceDefinition2.postDecode(-910530452);
        SequenceDefinition.SequenceDefinition_cached.put(sequenceDefinition2, n);
        return sequenceDefinition2;
    }
    
    static final void method1129(final int n, final int n2, final int n3, final boolean b, final int n4) {
        try {
            if (SoundSystem.loadInterface(n, 1376777516)) {
                class135.resizeInterface(VerticalAlignment.Widget_interfaceComponents[n], -1, n2, n3, b, 1809081725);
                return;
            }
            if (n4 != -726165376) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.lc(" + ')');
        }
    }
    
    void az(final Buffer buffer, final int n) {
        if (n == 1) {
            final int unsignedShort = buffer.readUnsignedShort(-2005689592);
            this.frameLengths = new int[unsignedShort];
            for (int i = 0; i < unsignedShort; ++i) {
                this.frameLengths[i] = buffer.readUnsignedShort(-2119849596);
            }
            this.frameIds = new int[unsignedShort];
            for (int j = 0; j < unsignedShort; ++j) {
                this.frameIds[j] = buffer.readUnsignedShort(-407632587);
            }
            for (int k = 0; k < unsignedShort; ++k) {
                this.frameIds[k] += buffer.readUnsignedShort(-265503048) << 16;
            }
        }
        else if (2 == n) {
            this.frameCount = buffer.readUnsignedShort(-1164020838) * 332517881;
        }
        else if (n == 3) {
            final int ra = Buffer.ra(buffer, (byte)7);
            this.mergedBoneGroups = new int[1 + ra];
            for (int l = 0; l < ra; ++l) {
                this.mergedBoneGroups[l] = Buffer.ra(buffer, (byte)7);
            }
            this.mergedBoneGroups[ra] = 9999999;
        }
        else if (n == 4) {
            this.stretches = true;
        }
        else if (5 == n) {
            this.forcedPriority = Buffer.ra(buffer, (byte)7) * -1276641873;
        }
        else if (6 == n) {
            this.shield = buffer.readUnsignedShort(653480431) * 766640841;
        }
        else if (n == 7) {
            this.weapon = buffer.readUnsignedShort(-1610393165) * 960826081;
        }
        else if (n == 8) {
            this.iterations = Buffer.ra(buffer, (byte)7) * -413193849;
            this.field1823 = true;
        }
        else if (n == 9) {
            this.precedenceAnimating = Buffer.ra(buffer, (byte)7) * 738419331;
        }
        else if (10 == n) {
            this.priority = Buffer.ra(buffer, (byte)7) * -2012018311;
        }
        else if (n == 11) {
            this.replyMode = Buffer.ra(buffer, (byte)7) * 1672364297;
        }
        else if (n == 12) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            this.chatFrameIds = new int[ra2];
            for (int n2 = 0; n2 < ra2; ++n2) {
                this.chatFrameIds[n2] = buffer.readUnsignedShort(-1983834909);
            }
            for (int n3 = 0; n3 < ra2; ++n3) {
                this.chatFrameIds[n3] += buffer.readUnsignedShort(311474766) << 16;
            }
        }
        else if (n == 13) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            this.soundEffects = new int[ra3];
            for (int n4 = 0; n4 < ra3; ++n4) {
                this.soundEffects[n4] = buffer.readMedium(1231886138);
            }
        }
        else if (14 == n) {
            this.SequenceDefinition_cachedModelId = buffer.readInt(-2031478709) * 526927311;
        }
        else if (n == 15) {
            final int unsignedShort2 = buffer.readUnsignedShort(-512328198);
            this.animMayaFrameSounds = new HashMap();
            for (int n5 = 0; n5 < unsignedShort2; ++n5) {
                this.animMayaFrameSounds.put(buffer.readUnsignedShort(165368038), buffer.readMedium(469334489));
            }
        }
        else if (n == 16) {
            this.animMayaStart = buffer.readUnsignedShort(-1733467221) * 732547785;
            this.animMayaEnd = buffer.readUnsignedShort(438891853) * -1631071449;
        }
        else if (n == 17) {
            this.animMayaMasks = new boolean[256];
            for (int n6 = 0; n6 < this.animMayaMasks.length; ++n6) {
                this.animMayaMasks[n6] = false;
            }
            for (int ra4 = Buffer.ra(buffer, (byte)7), n7 = 0; n7 < ra4; ++n7) {
                this.animMayaMasks[Buffer.ra(buffer, (byte)7)] = true;
            }
        }
    }
    
    public int method1128(final int n) {
        try {
            return this.animMayaEnd * 1833069719 - -968724615 * this.animMayaStart;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.ax(" + ')');
        }
    }
    
    public Model transformWidgetModel(final Model model, final int n, final byte b) {
        try {
            if (this.isCachedModelIdSet(204874306)) {
                return this.transformActorModel(model, n, (byte)(-92));
            }
            final int n2 = this.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n2 >> 16, 1690269747);
            final int n3 = n2 & 0xFFFF;
            if (frames != null) {
                Frames frames2 = null;
                int n4 = 0;
                if (this.chatFrameIds != null) {
                    if (b == 32) {
                        throw new IllegalStateException();
                    }
                    if (n < this.chatFrameIds.length) {
                        if (b == 32) {
                            throw new IllegalStateException();
                        }
                        final int n5 = this.chatFrameIds[n];
                        frames2 = WorldMapID.getFrames(n5 >> 16, -442206339);
                        n4 = (n5 & 0xFFFF);
                    }
                }
                if (null != frames2) {
                    if (b == 32) {
                        throw new IllegalStateException();
                    }
                    if (65535 != n4) {
                        boolean b2;
                        if (!frames.hasAlphaTransform(n3, -100012645)) {
                            if (b == 32) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        boolean b3;
                        if (!frames2.hasAlphaTransform(n4, 586226879)) {
                            if (b == 32) {
                                throw new IllegalStateException();
                            }
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        final Model sharedSequenceModel = model.toSharedSequenceModel(b2 & b3);
                        Model.ug(sharedSequenceModel, frames, n3);
                        Model.ug(sharedSequenceModel, frames2, n4);
                        return sharedSequenceModel;
                    }
                    if (b == 32) {
                        throw new IllegalStateException();
                    }
                }
                boolean b4;
                if (!frames.hasAlphaTransform(n3, 2041463438)) {
                    if (b == 32) {
                        throw new IllegalStateException();
                    }
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                final Model sharedSequenceModel2 = model.toSharedSequenceModel(b4);
                Model.ug(sharedSequenceModel2, frames, n3);
                return sharedSequenceModel2;
            }
            if (b == 32) {
                throw new IllegalStateException();
            }
            return model.toSharedSequenceModel(true);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.ay(" + ')');
        }
    }
    
    public Model bi(final Model model, int n) {
        if (!this.isCachedModelIdSet(837526416)) {
            n = this.frameLengths[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, 2020246419);
            n &= 0xFFFF;
            if (null == frames) {
                return model.bh(true);
            }
            final Model ci = model.ci(!frames.hasAlphaTransform(n, 1409607745));
            Model.ug(ci, frames, n);
            return ci;
        }
        else {
            final class133 method626 = TileItem.method626(this.weapon * -1716638417, 2145038401);
            if (null == method626) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel = model.toSharedSequenceModel(!method626.method770(1713081171));
            sharedSequenceModel.ct(method626, n);
            return sharedSequenceModel;
        }
    }
    
    static Frames bp(final int n) {
        final Frames frames = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.wr(n);
        if (frames != null) {
            return frames;
        }
        final Frames method524 = PendingSpawn.method524(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, 1984517350);
        if (method524 != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put(method524, n);
        }
        return method524;
    }
    
    static class133 cc(final int n) {
        if (class20.method82(n, 854271946) != 0) {
            return null;
        }
        final class133 class133 = (class133)SequenceDefinition.SequenceDefinition_cachedModel.wr(n);
        class133 class134;
        if (null != class133) {
            class134 = class133;
        }
        else {
            final class133 method1180 = class211.method1180(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, 499342238);
            if (null != method1180) {
                SequenceDefinition.SequenceDefinition_cachedModel.put(method1180, n);
            }
            class134 = method1180;
        }
        return class134;
    }
    
    public Model bt(final Model model, int n, final SequenceDefinition sequenceDefinition, int n2) {
        if (SequenceDefinition.field1814 && !this.isCachedModelIdSet(-1592879083) && !sequenceDefinition.isCachedModelIdSet(262873433)) {
            return this.method1126(model, n, sequenceDefinition, n2, (byte)(-5));
        }
        final Model sharedSequenceModel = model.toSharedSequenceModel(false);
        boolean cachedModelIdSet = false;
        Frames frames = null;
        Skeleton skeleton = null;
        if (this.isCachedModelIdSet(124166958)) {
            final class133 method1131 = this.method1131((byte)(-28));
            if (null == method1131) {
                return sharedSequenceModel;
            }
            if (sequenceDefinition.isCachedModelIdSet(-1388167983) && this.animMayaMasks == null) {
                sharedSequenceModel.method1317(method1131, n);
                return sharedSequenceModel;
            }
            skeleton = method1131.field1280;
            Model.ee(sharedSequenceModel, skeleton, method1131, n, this.animMayaMasks, false, !sequenceDefinition.isCachedModelIdSet(884790103));
        }
        else {
            n = this.frameIds[n];
            frames = WorldMapID.getFrames(n >> 16, 119245666);
            n &= 0xFFFF;
            if (frames == null) {
                return sequenceDefinition.transformActorModel(model, n2, (byte)(-8));
            }
            if (!sequenceDefinition.isCachedModelIdSet(-1191969098) && (this.mergedBoneGroups == null || -1 == n2)) {
                Model.ug(sharedSequenceModel, frames, n);
                return sharedSequenceModel;
            }
            if (this.mergedBoneGroups == null || n2 == -1) {
                Model.ug(sharedSequenceModel, frames, n);
                return sharedSequenceModel;
            }
            cachedModelIdSet = sequenceDefinition.isCachedModelIdSet(-1609077347);
            if (!cachedModelIdSet) {
                sharedSequenceModel.method1322(frames, n, this.mergedBoneGroups, false);
            }
        }
        if (sequenceDefinition.isCachedModelIdSet(-1831645635)) {
            final class133 method1132 = sequenceDefinition.method1131((byte)(-85));
            if (method1132 == null) {
                return sharedSequenceModel;
            }
            if (skeleton == null) {
                skeleton = method1132.field1280;
            }
            Model.ee(sharedSequenceModel, skeleton, method1132, n2, this.animMayaMasks, true, true);
        }
        else {
            n2 = sequenceDefinition.frameIds[n2];
            final Frames frames2 = WorldMapID.getFrames(n2 >> 16, -546109747);
            n2 &= 0xFFFF;
            if (frames2 == null) {
                return this.transformActorModel(model, n, (byte)(-25));
            }
            sharedSequenceModel.method1322(frames2, n2, this.mergedBoneGroups, true);
        }
        if (cachedModelIdSet && frames != null) {
            sharedSequenceModel.method1322(frames, n, this.mergedBoneGroups, false);
        }
        Model.dv(sharedSequenceModel);
        return sharedSequenceModel;
    }
    
    public int xn() {
        return this.frameCount * 1363943497;
    }
    
    static Frames bc(final int n) {
        final Frames frames = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.wr(n);
        if (frames != null) {
            return frames;
        }
        final Frames method524 = PendingSpawn.method524(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, 2130637515);
        if (method524 != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put(method524, n);
        }
        return method524;
    }
    
    Model br(final Model model, int n, final SequenceDefinition sequenceDefinition, int n2) {
        n = this.frameIds[n];
        final Frames frames = WorldMapID.getFrames(n >> 16, 2082590192);
        n &= 0xFFFF;
        if (null == frames) {
            return sequenceDefinition.transformActorModel(model, n2, (byte)(-66));
        }
        n2 = sequenceDefinition.frameIds[n2];
        final Frames frames2 = WorldMapID.getFrames(n2 >> 16, 374640603);
        n2 &= 0xFFFF;
        if (null == frames2) {
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, 2031442074));
            Model.ug(sharedSequenceModel, frames, n);
            return sharedSequenceModel;
        }
        final Model sharedSequenceModel2 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, 602016305) & !frames2.hasAlphaTransform(n2, -1266673739));
        Model.method1332(sharedSequenceModel2, frames, n, frames2, n2, this.mergedBoneGroups);
        return sharedSequenceModel2;
    }
    
    class133 ci() {
        if (this.isCachedModelIdSet(-1499484133)) {
            return TileItem.method626(1420017749 * this.SequenceDefinition_cachedModelId, 2147021207);
        }
        return null;
    }
    
    void decode(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, (byte)14);
            }
            if (n != 1877633819) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.aw(" + ')');
        }
    }
    
    public static void decode(final SequenceDefinition sequenceDefinition) {
        if (sequenceDefinition == null) {
            sequenceDefinition.getId();
        }
        if (1069382699 * sequenceDefinition.precedenceAnimating == -1) {
            if (null == sequenceDefinition.mergedBoneGroups && null == sequenceDefinition.animMayaMasks) {
                sequenceDefinition.precedenceAnimating = 0;
            }
            else {
                sequenceDefinition.precedenceAnimating = 1476838662;
            }
        }
        if (-1 == sequenceDefinition.priority * 1957040329) {
            if (null == sequenceDefinition.mergedBoneGroups && sequenceDefinition.animMayaMasks == null) {
                sequenceDefinition.priority = 0;
            }
            else {
                sequenceDefinition.priority = 270930674;
            }
        }
    }
    
    public static SequenceDefinition am(final int n) {
        final SequenceDefinition sequenceDefinition = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.wr(n);
        if (null != sequenceDefinition) {
            return sequenceDefinition;
        }
        final byte[] takeFile = SequenceDefinition.SequenceDefinition_archive.takeFile(12, n, (byte)(-73));
        final SequenceDefinition sequenceDefinition2 = new SequenceDefinition();
        if (takeFile != null) {
            sequenceDefinition2.decode(new Buffer(takeFile), 1877633819);
        }
        sequenceDefinition2.postDecode(1213101672);
        SequenceDefinition.SequenceDefinition_cached.put(sequenceDefinition2, n);
        return sequenceDefinition2;
    }
    
    Model method1130(final Model model, int n, final int n2) {
        if (n >= 0 || this.bq()) {
            if (n < 0) {
                n = ((n ^ Integer.MIN_VALUE) & 0xFFFF);
            }
            final int n3 = n;
            final int n4 = -1926546328;
            Model model2;
            try {
                if (!this.isCachedModelIdSet(1701969380)) {
                    if (n4 >= 197366738) {
                        throw new IllegalStateException();
                    }
                    final int n5 = this.frameIds[n3];
                    final Frames frames = WorldMapID.getFrames(n5 >> 16, 488275791);
                    final int n6 = n5 & 0xFFFF;
                    if (frames == null) {
                        model2 = model.method1312(true);
                    }
                    else {
                        boolean b;
                        if (!frames.hasAlphaTransform(n6, -299026728)) {
                            if (n4 >= 197366738) {
                                throw new IllegalStateException();
                            }
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        final Model method1312 = model.method1312(b);
                        Model.ug(method1312, frames, n6);
                        model2 = method1312;
                    }
                }
                else {
                    final class133 method1313 = TileItem.method626(1238147375 * this.SequenceDefinition_cachedModelId, 2140657667);
                    if (method1313 == null) {
                        if (n4 >= 197366738) {
                            throw new IllegalStateException();
                        }
                        model2 = model.method1312(true);
                    }
                    else {
                        boolean b2;
                        if (!method1313.method770(1713081171)) {
                            if (n4 >= 197366738) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        final Model method1314 = model.method1312(b2);
                        method1314.method1317(method1313, n3);
                        model2 = method1314;
                    }
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ha.al(" + ')');
            }
            return model2;
        }
        final int n7 = n ^ Integer.MIN_VALUE;
        final int n8 = n7 >> 16 & 0x3FFF;
        n = (n7 & 0xFFFF);
        int n9 = n + 1;
        if (n9 >= this.frameIds.length) {
            n9 = -1;
        }
        final int n10 = this.frameIds[n];
        final Frames dq = ScriptFrame.client.dq(n10 >> 16);
        final int n11 = n10 & 0xFFFF;
        int n12 = -1;
        Frames dq2 = null;
        if (n9 != -1) {
            final int n13 = this.frameIds[n9];
            dq2 = ScriptFrame.client.dq(n13 >> 16);
            n12 = (n13 & 0xFFFF);
        }
        if (dq == null) {
            return model.qn(true);
        }
        final Model qn = model.qn(!dq.gl()[n11].yk());
        qn.ur(dq, n11, dq2, n12, n8, this.frameLengths[n]);
        return qn;
    }
    
    public static Model et(final SequenceDefinition sequenceDefinition, final Model model, int n) {
        if (sequenceDefinition == null) {
            sequenceDefinition.bi(model, n);
        }
        if (!sequenceDefinition.isCachedModelIdSet(837526416)) {
            n = sequenceDefinition.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, 2020246419);
            n &= 0xFFFF;
            if (null == frames) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, 1409607745));
            Model.ug(sharedSequenceModel, frames, n);
            return sharedSequenceModel;
        }
        else {
            final class133 method626 = TileItem.method626(sequenceDefinition.SequenceDefinition_cachedModelId * -1716638417, 2145038401);
            if (null == method626) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel2 = model.toSharedSequenceModel(!method626.method770(1713081171));
            sharedSequenceModel2.method1317(method626, n);
            return sharedSequenceModel2;
        }
    }
    
    void decodeNext(final Buffer buffer, final int n, final byte b) {
        try {
            if (n == 1) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                final int unsignedShort = buffer.readUnsignedShort(-631314543);
                this.frameLengths = new int[unsignedShort];
                for (int i = 0; i < unsignedShort; ++i) {
                    if (b == 0) {
                        return;
                    }
                    this.frameLengths[i] = buffer.readUnsignedShort(489385674);
                }
                this.frameIds = new int[unsignedShort];
                for (int j = 0; j < unsignedShort; ++j) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    this.frameIds[j] = buffer.readUnsignedShort(-1291848929);
                }
                for (int k = 0; k < unsignedShort; ++k) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    this.frameIds[k] += buffer.readUnsignedShort(-1957323533) << 16;
                }
            }
            else if (2 == n) {
                this.frameCount = buffer.readUnsignedShort(662238305) * 332517881;
            }
            else if (n == 3) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                final int ra = Buffer.ra(buffer, (byte)7);
                this.mergedBoneGroups = new int[1 + ra];
                for (int l = 0; l < ra; ++l) {
                    this.mergedBoneGroups[l] = Buffer.ra(buffer, (byte)7);
                }
                this.mergedBoneGroups[ra] = 9999999;
            }
            else if (n == 4) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                this.stretches = true;
            }
            else if (5 == n) {
                if (b == 0) {
                    return;
                }
                this.forcedPriority = Buffer.ra(buffer, (byte)7) * -1276641873;
            }
            else if (6 == n) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                this.shield = buffer.readUnsignedShort(-46134641) * 766640841;
            }
            else if (n == 7) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                this.weapon = buffer.readUnsignedShort(-862954667) * 960826081;
            }
            else if (n == 8) {
                this.iterations = Buffer.ra(buffer, (byte)7) * -413193849;
                this.field1823 = true;
            }
            else if (n == 9) {
                this.precedenceAnimating = Buffer.ra(buffer, (byte)7) * 738419331;
            }
            else if (10 == n) {
                if (b == 0) {
                    return;
                }
                this.priority = Buffer.ra(buffer, (byte)7) * -2012018311;
            }
            else if (n == 11) {
                if (b == 0) {
                    return;
                }
                this.replyMode = Buffer.ra(buffer, (byte)7) * 1672364297;
            }
            else if (n == 12) {
                final int ra2 = Buffer.ra(buffer, (byte)7);
                this.chatFrameIds = new int[ra2];
                for (int n2 = 0; n2 < ra2; ++n2) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    this.chatFrameIds[n2] = buffer.readUnsignedShort(-386308957);
                }
                for (int n3 = 0; n3 < ra2; ++n3) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    this.chatFrameIds[n3] += buffer.readUnsignedShort(-888735824) << 16;
                }
            }
            else if (n == 13) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                final int ra3 = Buffer.ra(buffer, (byte)7);
                this.soundEffects = new int[ra3];
                for (int n4 = 0; n4 < ra3; ++n4) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    this.soundEffects[n4] = buffer.readMedium(177949144);
                }
            }
            else if (14 == n) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                this.SequenceDefinition_cachedModelId = buffer.readInt(-2020709198) * 526927311;
            }
            else if (n == 15) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                final int unsignedShort2 = buffer.readUnsignedShort(-461600300);
                this.animMayaFrameSounds = new HashMap();
                for (int n5 = 0; n5 < unsignedShort2; ++n5) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    this.animMayaFrameSounds.put(buffer.readUnsignedShort(-417931195), buffer.readMedium(-1649990669));
                }
            }
            else if (n == 16) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                this.animMayaStart = buffer.readUnsignedShort(-165174990) * 732547785;
                this.animMayaEnd = buffer.readUnsignedShort(-225973117) * -1631071449;
            }
            else if (n == 17) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                this.animMayaMasks = new boolean[256];
                for (int n6 = 0; n6 < this.animMayaMasks.length; ++n6) {
                    if (b == 0) {
                        return;
                    }
                    this.animMayaMasks[n6] = false;
                }
                for (int ra4 = Buffer.ra(buffer, (byte)7), n7 = 0; n7 < ra4; ++n7) {
                    if (b == 0) {
                        return;
                    }
                    this.animMayaMasks[Buffer.ra(buffer, (byte)7)] = true;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.ac(" + ')');
        }
    }
    
    public boolean bq() {
        return this.isCachedModelIdSet(1471844378);
    }
    
    public Model vt(final Model model, final int n) {
        return this.method1130(model, n, -1926546328);
    }
    
    void postDecode(final int n) {
        try {
            Label_0084: {
                if (1069382699 * this.precedenceAnimating == -1) {
                    if (n >= 1573434537) {
                        throw new IllegalStateException();
                    }
                    if (null == this.mergedBoneGroups) {
                        if (n >= 1573434537) {
                            throw new IllegalStateException();
                        }
                        if (null == this.animMayaMasks) {
                            this.precedenceAnimating = 0;
                            break Label_0084;
                        }
                    }
                    this.precedenceAnimating = 1476838662;
                }
            }
            if (-1 == this.priority * 1957040329) {
                if (n >= 1573434537) {
                    throw new IllegalStateException();
                }
                if (null == this.mergedBoneGroups && this.animMayaMasks == null) {
                    this.priority = 0;
                }
                else {
                    this.priority = 270930674;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.au(" + ')');
        }
    }
    
    Model method1126(final Model model, int n, final SequenceDefinition sequenceDefinition, int n2, final byte b) {
        try {
            n = this.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, 1872736941);
            n &= 0xFFFF;
            if (null == frames) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                return sequenceDefinition.transformActorModel(model, n2, (byte)(-117));
            }
            else {
                n2 = sequenceDefinition.frameIds[n2];
                final Frames frames2 = WorldMapID.getFrames(n2 >> 16, -1564784352);
                n2 &= 0xFFFF;
                if (null != frames2) {
                    boolean b2;
                    if (!frames.hasAlphaTransform(n, -438067522)) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    boolean b3;
                    if (!frames2.hasAlphaTransform(n2, -1096423846)) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        b3 = true;
                    }
                    else {
                        b3 = false;
                    }
                    final Model sharedSequenceModel = model.toSharedSequenceModel(b2 & b3);
                    Model.method1332(sharedSequenceModel, frames, n, frames2, n2, this.mergedBoneGroups);
                    return sharedSequenceModel;
                }
                if (b == 0) {
                    throw new IllegalStateException();
                }
                boolean b4;
                if (!frames.hasAlphaTransform(n, -1166769749)) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                final Model sharedSequenceModel2 = model.toSharedSequenceModel(b4);
                Model.ug(sharedSequenceModel2, frames, n);
                return sharedSequenceModel2;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.aa(" + ')');
        }
    }
    
    static Frames bh(final int n) {
        final Frames frames = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.wr(n);
        if (frames != null) {
            return frames;
        }
        final Frames method524 = PendingSpawn.method524(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, n, false, -923005348);
        if (method524 != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put(method524, n);
        }
        return method524;
    }
    
    Model bx(final Model model, int n, int n2) {
        if (!this.isCachedModelIdSet(-1773877668)) {
            n = this.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, -616996593);
            n &= 0x17E5B872;
            if (frames == null) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, -12726073));
            n2 &= 0x3;
            if (n2 == 1) {
                Model.zm(sharedSequenceModel);
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel);
            }
            else if (n2 == 3) {
                sharedSequenceModel.rotateY90Ccw();
            }
            Model.ug(sharedSequenceModel, frames, n);
            if (n2 == 1) {
                sharedSequenceModel.rotateY90Ccw();
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel);
            }
            else if (n2 == 3) {
                Model.zm(sharedSequenceModel);
            }
            return sharedSequenceModel;
        }
        else {
            final class133 method626 = TileItem.method626(168349591 * this.SequenceDefinition_cachedModelId, 2145766101);
            if (null == method626) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel2 = model.toSharedSequenceModel(!method626.method770(1713081171));
            n2 &= 0x3;
            if (n2 == 1) {
                Model.zm(sharedSequenceModel2);
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel2);
            }
            else if (n2 == 3) {
                sharedSequenceModel2.rotateY90Ccw();
            }
            sharedSequenceModel2.method1317(method626, n);
            if (1 == n2) {
                sharedSequenceModel2.rotateY90Ccw();
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel2);
            }
            else if (3 == n2) {
                Model.zm(sharedSequenceModel2);
            }
            return sharedSequenceModel2;
        }
    }
    
    public static void ar(final AbstractArchive sequenceDefinition_archive, final AbstractArchive sequenceDefinition_animationsArchive, final AbstractArchive sequenceDefinition_skeletonsArchive) {
        SequenceDefinition.SequenceDefinition_archive = sequenceDefinition_archive;
        SequenceDefinition.SequenceDefinition_animationsArchive = sequenceDefinition_animationsArchive;
        SequenceDefinition.SequenceDefinition_skeletonsArchive = sequenceDefinition_skeletonsArchive;
    }
    
    void ap() {
        if (1069382699 * this.precedenceAnimating == -1) {
            if (null != this.mergedBoneGroups || null != this.animMayaMasks) {
                this.precedenceAnimating = 1476838662;
            }
            else {
                this.precedenceAnimating = 0;
            }
        }
        if (-1 == this.priority * 1957040329) {
            if (null == this.mergedBoneGroups && this.animMayaMasks == null) {
                this.priority = 0;
            }
            else {
                this.priority = 270930674;
            }
        }
    }
    
    Model bd(final Model model, int n) {
        if (!this.isCachedModelIdSet(-1983790722)) {
            n = this.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, 467666539);
            n &= 0xFFFF;
            if (frames == null) {
                return model.method1312(true);
            }
            final Model method1312 = model.method1312(!frames.hasAlphaTransform(n, 479259882));
            Model.ug(method1312, frames, n);
            return method1312;
        }
        else {
            final class133 method1313 = TileItem.method626(1238147375 * this.SequenceDefinition_cachedModelId, 2143463858);
            if (method1313 == null) {
                return model.method1312(true);
            }
            final Model method1314 = model.method1312(!method1313.method770(1713081171));
            method1314.method1317(method1313, n);
            return method1314;
        }
    }
    
    Model bg(final Model model, int n, final SequenceDefinition sequenceDefinition, int n2) {
        n = this.frameIds[n];
        final Frames frames = WorldMapID.getFrames(n >> 16, 897655315);
        n &= 0x7A9FAD20;
        if (null == frames) {
            return sequenceDefinition.transformActorModel(model, n2, (byte)(-35));
        }
        n2 = sequenceDefinition.frameIds[n2];
        final Frames frames2 = WorldMapID.getFrames(n2 >> 16, -2135765363);
        n2 &= 0xFFFF;
        if (null == frames2) {
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, -1776560890));
            Model.ug(sharedSequenceModel, frames, n);
            return sharedSequenceModel;
        }
        final Model sharedSequenceModel2 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, -42127960) & !frames2.hasAlphaTransform(n2, -515402288));
        Model.method1332(sharedSequenceModel2, frames, n, frames2, n2, this.mergedBoneGroups);
        return sharedSequenceModel2;
    }
    
    public boolean mb() {
        return this.SequenceDefinition_cachedModelId * 1238147375 >= 0;
    }
    
    public static Model re(final SequenceDefinition sequenceDefinition, final Model model, int n, int n2) {
        if (sequenceDefinition == null) {
            return sequenceDefinition.bf(model, n);
        }
        if (!sequenceDefinition.isCachedModelIdSet(364444547)) {
            n = sequenceDefinition.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, -344419564);
            n &= 0xFFFF;
            if (frames == null) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, -673554604));
            n2 &= 0x3;
            if (n2 == 1) {
                Model.zm(sharedSequenceModel);
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel);
            }
            else if (n2 == 3) {
                sharedSequenceModel.rotateY90Ccw();
            }
            Model.ug(sharedSequenceModel, frames, n);
            if (n2 == 1) {
                sharedSequenceModel.rotateY90Ccw();
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel);
            }
            else if (n2 == 3) {
                Model.zm(sharedSequenceModel);
            }
            return sharedSequenceModel;
        }
        else {
            final class133 method626 = TileItem.method626(1238147375 * sequenceDefinition.SequenceDefinition_cachedModelId, 2147295099);
            if (null == method626) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel2 = model.toSharedSequenceModel(!method626.method770(1713081171));
            n2 &= 0x3;
            if (n2 == 1) {
                Model.zm(sharedSequenceModel2);
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel2);
            }
            else if (n2 == 3) {
                sharedSequenceModel2.rotateY90Ccw();
            }
            sharedSequenceModel2.method1317(method626, n);
            if (1 == n2) {
                sharedSequenceModel2.rotateY90Ccw();
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel2);
            }
            else if (3 == n2) {
                Model.zm(sharedSequenceModel2);
            }
            return sharedSequenceModel2;
        }
    }
    
    public Model bn(final Model model, int n, final SequenceDefinition sequenceDefinition, int n2) {
        if (SequenceDefinition.field1814 && !this.isCachedModelIdSet(-1562264791) && !sequenceDefinition.isCachedModelIdSet(-1056946583)) {
            return this.method1126(model, n, sequenceDefinition, n2, (byte)20);
        }
        final Model sharedSequenceModel = model.toSharedSequenceModel(false);
        boolean cachedModelIdSet = false;
        Frames frames = null;
        Skeleton skeleton = null;
        if (this.isCachedModelIdSet(-532419696)) {
            final class133 method1131 = this.method1131((byte)(-30));
            if (null == method1131) {
                return sharedSequenceModel;
            }
            if (sequenceDefinition.isCachedModelIdSet(-636179230) && this.animMayaMasks == null) {
                sharedSequenceModel.method1317(method1131, n);
                return sharedSequenceModel;
            }
            skeleton = method1131.field1280;
            Model.ee(sharedSequenceModel, skeleton, method1131, n, this.animMayaMasks, false, !sequenceDefinition.isCachedModelIdSet(1549985832));
        }
        else {
            n = this.frameIds[n];
            frames = WorldMapID.getFrames(n >> 16, -6829684);
            n &= 0xFFFF;
            if (frames == null) {
                return sequenceDefinition.transformActorModel(model, n2, (byte)(-27));
            }
            if (!sequenceDefinition.isCachedModelIdSet(-538075153) && (this.mergedBoneGroups == null || -1 == n2)) {
                Model.ug(sharedSequenceModel, frames, n);
                return sharedSequenceModel;
            }
            if (this.mergedBoneGroups == null || n2 == -1) {
                Model.ug(sharedSequenceModel, frames, n);
                return sharedSequenceModel;
            }
            cachedModelIdSet = sequenceDefinition.isCachedModelIdSet(228799911);
            if (!cachedModelIdSet) {
                sharedSequenceModel.method1322(frames, n, this.mergedBoneGroups, false);
            }
        }
        if (sequenceDefinition.isCachedModelIdSet(499298987)) {
            final class133 method1132 = sequenceDefinition.method1131((byte)(-62));
            if (method1132 == null) {
                return sharedSequenceModel;
            }
            if (skeleton == null) {
                skeleton = method1132.field1280;
            }
            Model.ee(sharedSequenceModel, skeleton, method1132, n2, this.animMayaMasks, true, true);
        }
        else {
            n2 = sequenceDefinition.frameIds[n2];
            final Frames frames2 = WorldMapID.getFrames(n2 >> 16, -884620793);
            n2 &= 0xFFFF;
            if (frames2 == null) {
                return this.transformActorModel(model, n, (byte)(-35));
            }
            sharedSequenceModel.method1322(frames2, n2, this.mergedBoneGroups, true);
        }
        if (cachedModelIdSet && frames != null) {
            sharedSequenceModel.method1322(frames, n, this.mergedBoneGroups, false);
        }
        Model.dv(sharedSequenceModel);
        return sharedSequenceModel;
    }
    
    public Model transformActorModel(final Model model, int n, final byte b) {
        if (n >= 0 || this.bq()) {
            if (n < 0) {
                n = ((n ^ Integer.MIN_VALUE) & 0xFFFF);
            }
            final int n2 = n;
            final int n3 = -114;
            Model model2;
            try {
                if (!this.isCachedModelIdSet(596572848)) {
                    final int n4 = this.frameIds[n2];
                    final Frames frames = WorldMapID.getFrames(n4 >> 16, -1835195272);
                    final int n5 = n4 & 0xFFFF;
                    if (null == frames) {
                        if (n3 >= 0) {
                            throw new IllegalStateException();
                        }
                        model2 = model.toSharedSequenceModel(true);
                    }
                    else {
                        boolean b2;
                        if (!frames.hasAlphaTransform(n5, 997946133)) {
                            if (n3 >= 0) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        final Model sharedSequenceModel = model.toSharedSequenceModel(b2);
                        Model.ug(sharedSequenceModel, frames, n5);
                        model2 = sharedSequenceModel;
                    }
                }
                else {
                    final class133 method626 = TileItem.method626(this.SequenceDefinition_cachedModelId * 1238147375, 2142933215);
                    if (null == method626) {
                        model2 = model.toSharedSequenceModel(true);
                    }
                    else {
                        boolean b3;
                        if (!method626.method770(1713081171)) {
                            if (n3 >= 0) {
                                throw new IllegalStateException();
                            }
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        final Model sharedSequenceModel2 = model.toSharedSequenceModel(b3);
                        sharedSequenceModel2.method1317(method626, n2);
                        model2 = sharedSequenceModel2;
                    }
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ha.ab(" + ')');
            }
            return model2;
        }
        final int n6 = n ^ Integer.MIN_VALUE;
        final int n7 = n6 >> 16 & 0x3FFF;
        final boolean b4 = (n6 & 0x40000000) != 0x0;
        n = (n6 & 0xFFFF);
        int n8 = n + 1;
        if (n8 >= this.frameIds.length) {
            if (SequenceDefinition.et.contains(this.eh)) {
                n8 = -1;
            }
            else if (b4) {
                n8 -= this.xn();
            }
            else {
                n8 = 0;
            }
        }
        final int n9 = this.frameIds[n];
        final Frames dq = ScriptFrame.client.dq(n9 >> 16);
        final int n10 = n9 & 0xFFFF;
        int n11 = -1;
        Frames dq2 = null;
        if (n8 >= 0 && n8 < this.frameIds.length) {
            final int n12 = this.frameIds[n8];
            dq2 = ScriptFrame.client.dq(n12 >> 16);
            n11 = (n12 & 0xFFFF);
        }
        if (dq == null) {
            return model.lw(true);
        }
        final Model lw = model.lw(!dq.gl()[n10].yk());
        lw.ur(dq, n10, dq2, n11, n7, this.frameLengths[n]);
        return lw;
    }
    
    Model transformObjectModel(final Model model, int n, int n2, final int n3) {
        if (n >= 0 || this.bq()) {
            if (n < 0) {
                n = ((n ^ Integer.MIN_VALUE) & 0xFFFF);
            }
            final int n4 = n;
            final int n5 = n2;
            final int n6 = n4;
            final int n7 = 16711935;
            Model model2;
            try {
                if (!this.isCachedModelIdSet(-268939495)) {
                    if (n7 != 16711935) {
                        throw new IllegalStateException();
                    }
                    final int n8 = this.frameLengths[n6];
                    final Frames frames = WorldMapID.getFrames(n8 >> 16, -1087159182);
                    final int n9 = n8 & 0xFFFF;
                    if (frames == null) {
                        if (n7 != 16711935) {
                            throw new IllegalStateException();
                        }
                        model2 = model.bh(true);
                    }
                    else {
                        boolean b;
                        if (!frames.hasAlphaTransform(n9, 854896761)) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        final Model lw = model.lw(b);
                        final int n10 = n5 & 0x3;
                        if (n10 == 1) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.zm(lw);
                        }
                        else if (n10 == 2) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.pj(lw);
                        }
                        else if (n10 == 3) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            lw.ca();
                        }
                        Model.ug(lw, frames, n9);
                        if (n10 == 1) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            lw.ck();
                        }
                        else if (n10 == 2) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.pj(lw);
                        }
                        else if (n10 == 3) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.zm(lw);
                        }
                        model2 = lw;
                    }
                }
                else {
                    final class133 method626 = TileItem.method626(1238147375 * this.iterations, 2142207160);
                    if (null == method626) {
                        if (n7 != 16711935) {
                            throw new IllegalStateException();
                        }
                        model2 = model.method1312(true);
                    }
                    else {
                        boolean b2;
                        if (!method626.method774(1713081171)) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        final Model sharedSequenceModel = model.toSharedSequenceModel(b2);
                        final int n11 = n5 & 0x3;
                        if (n11 == 1) {
                            Model.zm(sharedSequenceModel);
                        }
                        else if (n11 == 2) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.pj(sharedSequenceModel);
                        }
                        else if (n11 == 3) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            sharedSequenceModel.cq();
                        }
                        sharedSequenceModel.ch(method626, n6);
                        if (n11 != 0) {
                            sharedSequenceModel.dp();
                        }
                        else if (n11 == 2) {
                            Model.pj(sharedSequenceModel);
                        }
                        else if (3 == n11) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.zm(sharedSequenceModel);
                        }
                        model2 = sharedSequenceModel;
                    }
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ha.aq(" + ')');
            }
            return model2;
        }
        final int n12 = n ^ Integer.MIN_VALUE;
        final int n13 = n12 >> 16 & 0x3FFF;
        n = (n12 & 0xFFFF);
        int n14 = n + 1;
        if (n14 >= this.soundEffects.length) {
            if (SequenceDefinition.et.contains(this.forcedPriority)) {
                n14 = -1;
            }
            else {
                n14 -= this.getId();
            }
        }
        final int n15 = this.frameIds[n];
        final Frames dq = ScriptFrame.client.dq(n15 >> 16);
        final int n16 = n15 & 0xFFFF;
        int n17 = -1;
        Frames dq2 = null;
        if (n14 >= 0 && n14 < this.soundEffects.length) {
            final int n18 = this.frameIds[n14];
            dq2 = ScriptFrame.client.dq(n18 >> 16);
            n17 = (n18 & 0xFFFF);
        }
        if (dq == null) {
            return model.toSharedSequenceModel(true);
        }
        final Model lw2 = model.lw(!dq.gl()[n16].yk());
        n2 &= 0x3;
        if (n2 == 1) {
            lw2.ho();
        }
        else if (n2 == 2) {
            lw2.ed();
        }
        else if (n2 == 3) {
            lw2.ho();
        }
        lw2.ur(dq, n16, dq2, n17, n13, this.soundEffects[n]);
        if (n2 == 1) {
            lw2.ed();
        }
        else if (n2 == 2) {
            lw2.qk();
        }
        else if (n2 == 3) {
            lw2.ed();
        }
        return lw2;
    }
    
    void aj(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)(-36));
        }
    }
    
    public int bl() {
        return this.animMayaEnd * 1833069719 - -968724615 * this.animMayaStart;
    }
    
    Model bz(final Model model, int n) {
        if (!this.isCachedModelIdSet(410525360)) {
            n = this.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, 2045706329);
            n &= 0x7BFE5E54;
            if (frames == null) {
                return model.method1312(true);
            }
            final Model method1312 = model.method1312(!frames.hasAlphaTransform(n, 1027822751));
            Model.ug(method1312, frames, n);
            return method1312;
        }
        else {
            final class133 method1313 = TileItem.method626(-1039799324 * this.SequenceDefinition_cachedModelId, 2142424491);
            if (method1313 == null) {
                return model.method1312(true);
            }
            final Model method1314 = model.method1312(!method1313.method770(1713081171));
            method1314.method1317(method1313, n);
            return method1314;
        }
    }
    
    public static void od(final SequenceDefinition sequenceDefinition, final Buffer buffer, final int n) {
        if (sequenceDefinition == null) {
            sequenceDefinition.bl();
        }
        if (n == 1) {
            final int unsignedShort = buffer.readUnsignedShort(72341591);
            sequenceDefinition.frameLengths = new int[unsignedShort];
            for (int i = 0; i < unsignedShort; ++i) {
                sequenceDefinition.frameLengths[i] = buffer.readUnsignedShort(-1079441722);
            }
            sequenceDefinition.frameIds = new int[unsignedShort];
            for (int j = 0; j < unsignedShort; ++j) {
                sequenceDefinition.frameIds[j] = buffer.readUnsignedShort(344395547);
            }
            for (int k = 0; k < unsignedShort; ++k) {
                sequenceDefinition.frameIds[k] += buffer.readUnsignedShort(398109585) << 16;
            }
        }
        else if (2 == n) {
            sequenceDefinition.frameCount = buffer.readUnsignedShort(-239999700) * 332517881;
        }
        else if (n == 3) {
            final int ra = Buffer.ra(buffer, (byte)7);
            sequenceDefinition.mergedBoneGroups = new int[1 + ra];
            for (int l = 0; l < ra; ++l) {
                sequenceDefinition.mergedBoneGroups[l] = Buffer.ra(buffer, (byte)7);
            }
            sequenceDefinition.mergedBoneGroups[ra] = 9999999;
        }
        else if (n == 4) {
            sequenceDefinition.stretches = true;
        }
        else if (5 == n) {
            sequenceDefinition.forcedPriority = Buffer.ra(buffer, (byte)7) * -1276641873;
        }
        else if (6 == n) {
            sequenceDefinition.shield = buffer.readUnsignedShort(231618444) * 766640841;
        }
        else if (n == 7) {
            sequenceDefinition.weapon = buffer.readUnsignedShort(-2119724277) * 960826081;
        }
        else if (n == 8) {
            sequenceDefinition.iterations = Buffer.ra(buffer, (byte)7) * -413193849;
            sequenceDefinition.field1823 = true;
        }
        else if (n == 9) {
            sequenceDefinition.precedenceAnimating = Buffer.ra(buffer, (byte)7) * 738419331;
        }
        else if (10 == n) {
            sequenceDefinition.priority = Buffer.ra(buffer, (byte)7) * -2012018311;
        }
        else if (n == 11) {
            sequenceDefinition.replyMode = Buffer.ra(buffer, (byte)7) * 1672364297;
        }
        else if (n == 12) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            sequenceDefinition.chatFrameIds = new int[ra2];
            for (int n2 = 0; n2 < ra2; ++n2) {
                sequenceDefinition.chatFrameIds[n2] = buffer.readUnsignedShort(-275686545);
            }
            for (int n3 = 0; n3 < ra2; ++n3) {
                sequenceDefinition.chatFrameIds[n3] += buffer.readUnsignedShort(405265290) << 16;
            }
        }
        else if (n == 13) {
            final int ra3 = Buffer.ra(buffer, (byte)7);
            sequenceDefinition.soundEffects = new int[ra3];
            for (int n4 = 0; n4 < ra3; ++n4) {
                sequenceDefinition.soundEffects[n4] = buffer.readMedium(-348323935);
            }
        }
        else if (14 == n) {
            sequenceDefinition.SequenceDefinition_cachedModelId = buffer.readInt(-1501006604) * 526927311;
        }
        else if (n == 15) {
            final int unsignedShort2 = buffer.readUnsignedShort(294375087);
            sequenceDefinition.animMayaFrameSounds = new HashMap();
            for (int n5 = 0; n5 < unsignedShort2; ++n5) {
                sequenceDefinition.animMayaFrameSounds.put(buffer.readUnsignedShort(577572617), buffer.readMedium(679570374));
            }
        }
        else if (n == 16) {
            sequenceDefinition.animMayaStart = buffer.readUnsignedShort(-1245828740) * 732547785;
            sequenceDefinition.animMayaEnd = buffer.readUnsignedShort(-1444069536) * -1631071449;
        }
        else if (n == 17) {
            sequenceDefinition.animMayaMasks = new boolean[256];
            for (int n6 = 0; n6 < sequenceDefinition.animMayaMasks.length; ++n6) {
                sequenceDefinition.animMayaMasks[n6] = false;
            }
            for (int ra4 = Buffer.ra(buffer, (byte)7), n7 = 0; n7 < ra4; ++n7) {
                sequenceDefinition.animMayaMasks[Buffer.ra(buffer, (byte)7)] = true;
            }
        }
    }
    
    public Model bj(final Model model, int n, final SequenceDefinition sequenceDefinition, int n2) {
        if (SequenceDefinition.field1814 && !this.isCachedModelIdSet(901596972) && !sequenceDefinition.isCachedModelIdSet(-1494265733)) {
            return this.method1126(model, n, sequenceDefinition, n2, (byte)(-14));
        }
        final Model sharedSequenceModel = model.toSharedSequenceModel(false);
        boolean cachedModelIdSet = false;
        Frames frames = null;
        Skeleton skeleton = null;
        if (this.isCachedModelIdSet(-524973539)) {
            final class133 method1131 = this.method1131((byte)14);
            if (null == method1131) {
                return sharedSequenceModel;
            }
            if (sequenceDefinition.isCachedModelIdSet(-563396159) && this.animMayaMasks == null) {
                sharedSequenceModel.method1317(method1131, n);
                return sharedSequenceModel;
            }
            skeleton = method1131.field1280;
            Model.ee(sharedSequenceModel, skeleton, method1131, n, this.animMayaMasks, false, !sequenceDefinition.isCachedModelIdSet(-1710426297));
        }
        else {
            n = this.frameIds[n];
            frames = WorldMapID.getFrames(n >> 16, -1115429048);
            n &= 0x42EDE5A5;
            if (frames == null) {
                return sequenceDefinition.transformActorModel(model, n2, (byte)(-27));
            }
            if (!sequenceDefinition.isCachedModelIdSet(-2055695392) && (this.mergedBoneGroups == null || -1 == n2)) {
                Model.ug(sharedSequenceModel, frames, n);
                return sharedSequenceModel;
            }
            if (this.mergedBoneGroups == null || n2 == -1) {
                Model.ug(sharedSequenceModel, frames, n);
                return sharedSequenceModel;
            }
            cachedModelIdSet = sequenceDefinition.isCachedModelIdSet(530281739);
            if (!cachedModelIdSet) {
                sharedSequenceModel.method1322(frames, n, this.mergedBoneGroups, false);
            }
        }
        if (sequenceDefinition.isCachedModelIdSet(-940400258)) {
            final class133 method1132 = sequenceDefinition.method1131((byte)(-31));
            if (method1132 == null) {
                return sharedSequenceModel;
            }
            if (skeleton == null) {
                skeleton = method1132.field1280;
            }
            Model.ee(sharedSequenceModel, skeleton, method1132, n2, this.animMayaMasks, true, true);
        }
        else {
            n2 = sequenceDefinition.frameIds[n2];
            final Frames frames2 = WorldMapID.getFrames(n2 >> 16, 1931447080);
            n2 &= 0xFFFF;
            if (frames2 == null) {
                return this.transformActorModel(model, n, (byte)(-57));
            }
            sharedSequenceModel.method1322(frames2, n2, this.mergedBoneGroups, true);
        }
        if (cachedModelIdSet && frames != null) {
            sharedSequenceModel.method1322(frames, n, this.mergedBoneGroups, false);
        }
        Model.dv(sharedSequenceModel);
        return sharedSequenceModel;
    }
    
    Model bk(final Model model, int n, int n2) {
        if (!this.isCachedModelIdSet(-964207824)) {
            n = this.frameIds[n];
            final Frames frames = WorldMapID.getFrames(n >> 16, 836891344);
            n &= 0xFFFF;
            if (frames == null) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n, 191728469));
            n2 &= 0x3;
            if (n2 == 1) {
                Model.zm(sharedSequenceModel);
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel);
            }
            else if (n2 == 3) {
                sharedSequenceModel.rotateY90Ccw();
            }
            Model.ug(sharedSequenceModel, frames, n);
            if (n2 == 1) {
                sharedSequenceModel.rotateY90Ccw();
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel);
            }
            else if (n2 == 3) {
                Model.zm(sharedSequenceModel);
            }
            return sharedSequenceModel;
        }
        else {
            final class133 method626 = TileItem.method626(1238147375 * this.SequenceDefinition_cachedModelId, 2140160120);
            if (null == method626) {
                return model.toSharedSequenceModel(true);
            }
            final Model sharedSequenceModel2 = model.toSharedSequenceModel(!method626.method770(1713081171));
            n2 &= 0x3;
            if (n2 == 1) {
                Model.zm(sharedSequenceModel2);
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel2);
            }
            else if (n2 == 3) {
                sharedSequenceModel2.rotateY90Ccw();
            }
            sharedSequenceModel2.method1317(method626, n);
            if (1 == n2) {
                sharedSequenceModel2.rotateY90Ccw();
            }
            else if (n2 == 2) {
                Model.pj(sharedSequenceModel2);
            }
            else if (3 == n2) {
                Model.zm(sharedSequenceModel2);
            }
            return sharedSequenceModel2;
        }
    }
    
    class133 method1131(final byte b) {
        try {
            if (!this.isCachedModelIdSet(632753914)) {
                return null;
            }
            if (b == 6) {
                throw new IllegalStateException();
            }
            return TileItem.method626(1238147375 * this.SequenceDefinition_cachedModelId, 2146493961);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ha.ah(" + ')');
        }
    }
    
    public static Model ef(final SequenceDefinition sequenceDefinition, final Model model, int n, int n2, final int n3) {
        if (sequenceDefinition == null) {
            return sequenceDefinition.transformObjectModel(model, n, n, n);
        }
        if (n >= 0 || sequenceDefinition.bq()) {
            if (n < 0) {
                n = ((n ^ Integer.MIN_VALUE) & 0xFFFF);
            }
            final int n4 = n;
            final int n5 = n2;
            final int n6 = n4;
            final int n7 = 16711935;
            Model model2;
            try {
                if (!sequenceDefinition.isCachedModelIdSet(-268939495)) {
                    if (n7 != 16711935) {
                        throw new IllegalStateException();
                    }
                    final int n8 = sequenceDefinition.frameIds[n6];
                    final Frames frames = WorldMapID.getFrames(n8 >> 16, -1087159182);
                    final int n9 = n8 & 0xFFFF;
                    if (frames == null) {
                        if (n7 != 16711935) {
                            throw new IllegalStateException();
                        }
                        model2 = model.toSharedSequenceModel(true);
                    }
                    else {
                        boolean b;
                        if (!frames.hasAlphaTransform(n9, 854896761)) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        final Model sharedSequenceModel = model.toSharedSequenceModel(b);
                        final int n10 = n5 & 0x3;
                        if (n10 == 1) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.zm(sharedSequenceModel);
                        }
                        else if (n10 == 2) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.pj(sharedSequenceModel);
                        }
                        else if (n10 == 3) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            sharedSequenceModel.rotateY90Ccw();
                        }
                        Model.ug(sharedSequenceModel, frames, n9);
                        if (n10 == 1) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            sharedSequenceModel.rotateY90Ccw();
                        }
                        else if (n10 == 2) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.pj(sharedSequenceModel);
                        }
                        else if (n10 == 3) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.zm(sharedSequenceModel);
                        }
                        model2 = sharedSequenceModel;
                    }
                }
                else {
                    final class133 method626 = TileItem.method626(1238147375 * sequenceDefinition.SequenceDefinition_cachedModelId, 2142207160);
                    if (null == method626) {
                        if (n7 != 16711935) {
                            throw new IllegalStateException();
                        }
                        model2 = model.toSharedSequenceModel(true);
                    }
                    else {
                        boolean b2;
                        if (!method626.method770(1713081171)) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        final Model sharedSequenceModel2 = model.toSharedSequenceModel(b2);
                        final int n11 = n5 & 0x3;
                        if (n11 == 1) {
                            Model.zm(sharedSequenceModel2);
                        }
                        else if (n11 == 2) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.pj(sharedSequenceModel2);
                        }
                        else if (n11 == 3) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            sharedSequenceModel2.rotateY90Ccw();
                        }
                        sharedSequenceModel2.method1317(method626, n6);
                        if (n11 != 0) {
                            sharedSequenceModel2.rotateY90Ccw();
                        }
                        else if (n11 == 2) {
                            Model.pj(sharedSequenceModel2);
                        }
                        else if (3 == n11) {
                            if (n7 != 16711935) {
                                throw new IllegalStateException();
                            }
                            Model.zm(sharedSequenceModel2);
                        }
                        model2 = sharedSequenceModel2;
                    }
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ha.aq(" + ')');
            }
            return model2;
        }
        final int n12 = n ^ Integer.MIN_VALUE;
        final int n13 = n12 >> 16 & 0x3FFF;
        n = (n12 & 0xFFFF);
        int n14 = n + 1;
        if (n14 >= sequenceDefinition.frameIds.length) {
            if (SequenceDefinition.et.contains(sequenceDefinition.eh)) {
                n14 = -1;
            }
            else {
                n14 -= sequenceDefinition.xn();
            }
        }
        final int n15 = sequenceDefinition.frameIds[n];
        final Frames dq = ScriptFrame.client.dq(n15 >> 16);
        final int n16 = n15 & 0xFFFF;
        int n17 = -1;
        Frames dq2 = null;
        if (n14 >= 0 && n14 < sequenceDefinition.frameIds.length) {
            final int n18 = sequenceDefinition.frameIds[n14];
            dq2 = ScriptFrame.client.dq(n18 >> 16);
            n17 = (n18 & 0xFFFF);
        }
        if (dq == null) {
            return model.lw(true);
        }
        final Model lw = model.lw(!dq.gl()[n16].yk());
        n2 &= 0x3;
        if (n2 == 1) {
            lw.qk();
        }
        else if (n2 == 2) {
            lw.ed();
        }
        else if (n2 == 3) {
            lw.ho();
        }
        lw.ur(dq, n16, dq2, n17, n13, sequenceDefinition.frameLengths[n]);
        if (n2 == 1) {
            lw.ho();
        }
        else if (n2 == 2) {
            lw.ed();
        }
        else if (n2 == 3) {
            lw.qk();
        }
        return lw;
    }
    
    public Model bf(final Model model, final int n) {
        if (this.isCachedModelIdSet(-1665299305)) {
            return this.transformActorModel(model, n, (byte)(-65));
        }
        final int n2 = this.frameIds[n];
        final Frames frames = WorldMapID.getFrames(n2 >> 16, -777595783);
        final int n3 = n2 & 0xFFFF;
        if (frames == null) {
            return model.toSharedSequenceModel(true);
        }
        Frames frames2 = null;
        int n4 = 0;
        if (this.chatFrameIds != null && n < this.chatFrameIds.length) {
            final int n5 = this.chatFrameIds[n];
            frames2 = WorldMapID.getFrames(n5 >> 16, 729636040);
            n4 = (n5 & 0xFFFF);
        }
        if (null != frames2 && 65535 != n4) {
            final Model sharedSequenceModel = model.toSharedSequenceModel(!frames.hasAlphaTransform(n3, 2115601263) & !frames2.hasAlphaTransform(n4, -1862107189));
            Model.ug(sharedSequenceModel, frames, n3);
            Model.ug(sharedSequenceModel, frames2, n4);
            return sharedSequenceModel;
        }
        final Model sharedSequenceModel2 = model.toSharedSequenceModel(!frames.hasAlphaTransform(n3, 471545464));
        Model.ug(sharedSequenceModel2, frames, n3);
        return sharedSequenceModel2;
    }
    
    public static int uv(final SequenceDefinition sequenceDefinition) {
        return sequenceDefinition.animMayaEnd * 1833069719 - -968724615 * sequenceDefinition.animMayaStart;
    }
}
