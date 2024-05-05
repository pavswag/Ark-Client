import java.awt.Polygon;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import java.awt.Shape;
import java.util.Iterator;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcDespawned;

// 
// Decompiled by Procyon v0.5.36
// 

public final class NPC extends Actor implements net.runelite.api.NPC
{
    int field1045;
    String nameChange;
    static final int ac = 31;
    static int field1047;
    NewShit field1048;
    public int kv;
    NPCComposition definition;
    static int field1050;
    NewShit field1051;
    static final int ae = 19136776;
    static final int ei = 1;
    public static final int bi = 8192;
    class489 field1052;
    
    public String getName() {
        NPCComposition npcComposition = this.hb();
        if (npcComposition != null && npcComposition.getConfigs() != null) {
            npcComposition = npcComposition.xw();
        }
        return (npcComposition == null) ? null : npcComposition.getName().replace(' ', ' ');
    }
    
    NPC() {
        this.nameChange = "";
        this.field1045 = 2139129811;
    }
    
    static {
        NPC.field1050 = -1714612375;
        NPC.field1047 = -1963015503;
    }
    
    void cs(final NewShit field1051) {
        this.field1051 = field1051;
    }
    
    final void bs(final int n, final int n2, final boolean b) {
        if (-1 != super.defaultHeight * -1623717335 && ItemContainer.SpotAnimationDefinition_get(super.crawlLeftSequence * -867463453, (byte)121).replyMode * 1957040329 == 1) {
            super.sequenceDelay = -309083316;
        }
        if (!b) {
            final int n3 = n - super.pathX[0];
            final int n4 = n2 - super.hitSplatTypes2[0];
            if (n3 >= -8 && n3 <= 8 && n4 >= -1635777588 && n4 <= 8) {
                if (super.field975 * 222179878 < 9) {
                    super.runSequence = super.movementFrameCycle + 400971895;
                }
                for (int i = super.movementFrame * 1134756167; i > 0; --i) {
                    super.pathY[i] = super.pathX[i - 1];
                    super.hitSplatValues2[i] = super.pathY[i - 1];
                    this.da[i] = this.da[i - 1];
                }
                super.hitSplatValues2[0] = n;
                super.hitSplatValues[0] = n2;
                this.da[0] = MoveSpeed.CRAWL;
                return;
            }
        }
        super.movementFrameCycle = 0;
        super.targetIndex = 0;
        super.field957 = 0;
        this.cf[0] = n;
        super.hitSplatTypes[0] = n2;
        super.pathLength = -1102445696 * this.cf[0] + 828354898 * super.movementSequence;
        super.recolourStartCycle = super.movementSequence * -1974745916 + -1887439488 * this.dy[0];
    }
    
    void ca(final NewShit field1048) {
        this.field1048 = field1048;
    }
    
    void ba(final int n, final int n2, final short n3) {
        if (this.field1052 == null) {
            this.field1052 = new class489(this.definition);
        }
        class489.vc(this.field1052, n, n2, n3, -1442971356);
    }
    
    public static int[] ae(final NPC npc, final byte b) {
        if (npc == null) {
            return npc.method596(b);
        }
        try {
            if (npc.field1052 == null) {
                return npc.definition.method1029(-1475728711);
            }
            if (b != 14) {
                throw new IllegalStateException();
            }
            return npc.field1052.method2546((byte)(-91));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ao(" + ')');
        }
    }
    
    void ae(final String s) {
        this.nameChange = ((null == s) ? "" : s);
    }
    
    void ce(final int[] array, final short[] array2) {
        if (this.field1052 == null) {
            this.field1052 = new class489(this.definition);
        }
        this.field1052.method2547(array, array2, (byte)12);
    }
    
    public static void ov(final NPC npc, final int[] array, final short[] array2) {
        if (npc.field1052 == null) {
            npc.field1052 = new class489(npc.definition);
        }
        npc.field1052.method2547(array, array2, (byte)12);
    }
    
    void cl() {
        this.field1048 = null;
    }
    
    NewShit cn() {
        return this.field1051;
    }
    
    public int getId() {
        NPCComposition npcComposition = this.hb();
        if (npcComposition != null && npcComposition.getConfigs() != null) {
            npcComposition = npcComposition.xw();
        }
        return (npcComposition == null) ? -1 : npcComposition.getId();
    }
    
    void cf() {
        this.field1051 = null;
    }
    
    @Override
    final boolean cv() {
        return null != this.definition;
    }
    
    int[] method596(final byte b) {
        try {
            if (this.field1052 == null) {
                return this.definition.method1029(-1475728711);
            }
            if (b != 14) {
                throw new IllegalStateException();
            }
            return this.field1052.method2546((byte)(-91));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ao(" + ')');
        }
    }
    
    final String method605(final int n) {
        try {
            if (this.nameChange.isEmpty()) {
                NPCComposition npcComposition = this.definition;
                if (null != npcComposition.transforms) {
                    npcComposition = NPCComposition.ur(npcComposition, 1440094468);
                    if (null == npcComposition) {
                        if (n >= -1061723035) {
                            throw new IllegalStateException();
                        }
                        npcComposition = this.definition;
                    }
                }
                return npcComposition.name;
            }
            if (n >= -1061723035) {
                throw new IllegalStateException();
            }
            return this.nameChange;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.at(" + ')');
        }
    }
    
    void method601(final byte b) {
        try {
            this.field1051 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ak(" + ')');
        }
    }
    
    void method598(final NewShit field1048, final int n) {
        try {
            this.field1048 = field1048;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.am(" + ')');
        }
    }
    
    boolean be(final int n) {
        return n < 0 || n > 4 || (-189357307 * this.field1045 & 1 << n) != 0x0;
    }
    
    @Override
    final boolean isVisible(final int n) {
        try {
            if (null != this.definition) {
                return true;
            }
            if (n != 1666539507) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.as(" + ')');
        }
    }
    
    public void pv(final NPCComposition npcComposition) {
        if (npcComposition == null) {
            ScriptFrame.client.getCallbacks().post((Object)new NpcDespawned((net.runelite.api.NPC)this));
            return;
        }
        final NPCComposition hb = this.hb();
        if (hb == null) {
            return;
        }
        if (npcComposition.getId() == hb.getId()) {
            return;
        }
        ScriptFrame.client.getCallbacks().postDeferred((Object)new NpcChanged((net.runelite.api.NPC)this, (net.runelite.api.NPCComposition)hb));
    }
    
    public static boolean tl(final class12 class12) {
        return class12 == null && class12.am();
    }
    
    public int getIndex() {
        return this.kv;
    }
    
    void az(final String s) {
        this.nameChange = ((null == s) ? "" : s);
    }
    
    short[] method602(final int n) {
        try {
            if (this.field1052 == null) {
                return this.definition.method1031(800844396);
            }
            if (n == 1759508233) {
                throw new IllegalStateException();
            }
            return this.field1052.method2544(496795655);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ax(" + ')');
        }
    }
    
    final void method594(final int n, final int n2, final boolean b, final int n3) {
        try {
            if (-1 != this.cs * -1372355773) {
                if (n3 == 1913276055) {
                    throw new IllegalStateException();
                }
                if (ItemContainer.SpotAnimationDefinition_get(this.cs * -1372355773, (byte)0).priority * 1957040329 == 1) {
                    this.cs = 1690721941;
                    Label_0243: {
                        if (this instanceof NPC) {
                            switch (this.getId()) {
                                case 8615:
                                case 8616:
                                case 8617:
                                case 8618:
                                case 8619:
                                case 8620:
                                case 8621:
                                case 8622: {
                                    break Label_0243;
                                }
                            }
                        }
                        final AnimationChanged animationChanged = new AnimationChanged();
                        animationChanged.setActor((net.runelite.api.Actor)this);
                        ScriptFrame.client.getCallbacks().post((Object)animationChanged);
                    }
                }
            }
            if (!b) {
                final int n4 = n - this.cf[0];
                final int n5 = n2 - this.dy[0];
                if (n4 >= -8) {
                    if (n3 == 1913276055) {
                        throw new IllegalStateException();
                    }
                    if (n4 <= 8) {
                        if (n3 == 1913276055) {
                            return;
                        }
                        if (n5 >= -8) {
                            if (n3 == 1913276055) {
                                throw new IllegalStateException();
                            }
                            if (n5 <= 8) {
                                if (n3 == 1913276055) {
                                    throw new IllegalStateException();
                                }
                                if (this.cb * 1134756167 < 9) {
                                    if (n3 == 1913276055) {
                                        throw new IllegalStateException();
                                    }
                                    this.cb += 400971895;
                                }
                                for (int i = this.cb * 1134756167; i > 0; --i) {
                                    if (n3 == 1913276055) {
                                        throw new IllegalStateException();
                                    }
                                    this.cf[i] = this.cf[i - 1];
                                    this.dy[i] = this.dy[i - 1];
                                    this.da[i] = this.da[i - 1];
                                }
                                this.cf[0] = n;
                                this.dy[0] = n2;
                                this.da[0] = MoveSpeed.WALK;
                                return;
                            }
                        }
                    }
                }
            }
            this.cb = 0;
            this.dk = 0;
            this.bc = 0;
            this.cf[0] = n;
            this.dy[0] = n2;
            this.br = -1102445696 * this.cf[0] + -1606165824 * this.bt;
            this.ep = this.bt * 254242752 + -1887439488 * this.dy[0];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ay(" + ')');
        }
    }
    
    public static void sr(final NPC npc, final byte b) {
        if (npc == null) {
            npc.method601(b);
            return;
        }
        try {
            npc.field1048 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ak(" + ')');
        }
    }
    
    void bv(final int n, final int n2, final short n3) {
        if (this.field1052 == null) {
            this.field1052 = new class489(this.definition);
        }
        class489.vc(this.field1052, n, n2, n3, 1612667941);
    }
    
    public static void fc(final NPC npc, final int n, final int n2, final boolean b) {
        if (npc == null) {
            npc.bs(n, n, b);
        }
        if (-1 != npc.cs * -1372355773 && ItemContainer.SpotAnimationDefinition_get(npc.cs * -1372355773, (byte)64).priority * 1957040329 == 1) {
            npc.cs = 1690721941;
        }
        if (!b) {
            final int n3 = n - npc.cf[0];
            final int n4 = n2 - npc.dy[0];
            if (n3 >= -8 && n3 <= 8 && n4 >= -8 && n4 <= 8) {
                if (npc.cb * 1134756167 < 9) {
                    npc.cb += 400971895;
                }
                for (int i = npc.cb * 1134756167; i > 0; --i) {
                    npc.cf[i] = npc.cf[i - 1];
                    npc.dy[i] = npc.dy[i - 1];
                    npc.da[i] = npc.da[i - 1];
                }
                npc.cf[0] = n;
                npc.dy[0] = n2;
                npc.da[0] = MoveSpeed.WALK;
                return;
            }
        }
        npc.cb = 0;
        npc.dk = 0;
        npc.bc = 0;
        npc.cf[0] = n;
        npc.dy[0] = n2;
        npc.br = -1102445696 * npc.cf[0] + -1606165824 * npc.bt;
        npc.ep = npc.bt * 254242752 + -1887439488 * npc.dy[0];
    }
    
    void ck(final NewShit field1048) {
        this.field1048 = field1048;
    }
    
    public NPCComposition hb() {
        return this.definition;
    }
    
    final String bo() {
        if (!this.nameChange.isEmpty()) {
            return this.nameChange;
        }
        NPCComposition npcComposition = this.definition;
        if (null != npcComposition.transforms) {
            npcComposition = NPCComposition.ur(npcComposition, 1918593431);
            if (null == npcComposition) {
                npcComposition = this.definition;
            }
        }
        return npcComposition.name;
    }
    
    void bp(final int n, final int n2, final short n3) {
        if (this.field1052 == null) {
            this.field1052 = new class489(this.definition);
        }
        class489.vc(this.field1052, n, n2, n3, 1818907800);
    }
    
    final void bt(final int n, final MoveSpeed moveSpeed) {
        int n2 = this.cf[0];
        int n3 = this.dy[0];
        if (n == 0) {
            --n2;
            ++n3;
        }
        if (n == 1) {
            ++n3;
        }
        if (n == 2) {
            ++n2;
            ++n3;
        }
        if (3 == n) {
            --n2;
        }
        if (n == 4) {
            ++n2;
        }
        if (n == 5) {
            --n2;
            --n3;
        }
        if (6 == n) {
            --n3;
        }
        if (n == 7) {
            ++n2;
            --n3;
        }
        if (-1372355773 * this.cs != -1 && ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)89).priority * -480870242 == 1) {
            this.cs = -1877124267;
        }
        if (1134756167 * this.cb < 9) {
            this.cb += 1815817733;
        }
        for (int i = this.cb * -253020415; i > 0; --i) {
            this.cf[i] = this.cf[i - 1];
            this.dy[i] = this.dy[i - 1];
            this.da[i] = this.da[i - 1];
        }
        this.cf[0] = n2;
        this.dy[0] = n3;
        this.da[0] = moveSpeed;
    }
    
    void bc(final int n, final int n2, final short n3) {
        if (this.field1052 == null) {
            this.field1052 = new class489(this.definition);
        }
        class489.vc(this.field1052, n, n2, n3, 918437832);
    }
    
    int[] br() {
        if (this.field1052 != null) {
            return this.field1052.method2546((byte)(-84));
        }
        return this.definition.method1029(-70273452);
    }
    
    void ci() {
        this.field1051 = null;
    }
    
    void method607(final int n, final int n2) {
        try {
            this.field1045 = 1731572173 * n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.aw(" + ')');
        }
    }
    
    void method600(final NewShit field1051, final int n) {
        try {
            this.field1051 = field1051;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.av(" + ')');
        }
    }
    
    protected final Model al() {
        if (this.definition == null) {
            return null;
        }
        final SequenceDefinition sequenceDefinition = (-1 != -1372355773 * this.cs && 6917641 * this.bd == 0) ? ItemContainer.SpotAnimationDefinition_get(-278887549 * this.cs, (byte)117) : null;
        final SequenceDefinition sequenceDefinition2 = (-1 != -1302441815 * this.dg && (this.dg * 1105722490 != this.cd * 1590591885 || sequenceDefinition == null)) ? ItemContainer.SpotAnimationDefinition_get(-1020505610 * this.dg, (byte)122) : null;
        Model model;
        if (this.field1048 != null && this.field1048.field1558) {
            model = MusicPatchNode.localPlayer.appearance.getModel(sequenceDefinition, 934493175 * this.dw, sequenceDefinition2, this.bp * 424813829, (byte)80);
        }
        else {
            model = this.definition.method1021(sequenceDefinition, this.dw * 464974006, sequenceDefinition2, this.bp * -1117056257, this.field1048, (byte)(-36));
        }
        if (null == model) {
            return null;
        }
        model.calculateBoundsCylinder();
        this.cp = model.et * 2070391287;
        final int indicesCount = model.indicesCount;
        final Model cp = this.cp(model, (byte)127);
        if (431254778 * this.definition.size == 1) {
            cp.isSingleTile = true;
        }
        if (this.dq != 0 && Client.cycle * 1266497927 >= -845093896 * this.dj && -1886224337 * Client.cycle < 707232483 * this.bn) {
            cp.overrideHue = this.du;
            cp.overrideSaturation = this.db;
            cp.overrideLuminance = this.df;
            cp.overrideAmount = this.dq;
            cp.field2196 = (short)indicesCount;
        }
        else {
            cp.overrideAmount = 0;
        }
        return cp;
    }
    
    void cu(final NewShit field1048) {
        this.field1048 = field1048;
    }
    
    public static String zh(final NPC npc, final int n) {
        if (npc == null) {
            return npc.method605(n);
        }
        try {
            if (npc.nameChange.isEmpty()) {
                NPCComposition npcComposition = npc.definition;
                if (null != npcComposition.transforms) {
                    npcComposition = NPCComposition.ur(npcComposition, 1440094468);
                    if (null == npcComposition) {
                        if (n >= -1061723035) {
                            throw new IllegalStateException();
                        }
                        npcComposition = npc.definition;
                    }
                }
                return npcComposition.name;
            }
            if (n >= -1061723035) {
                throw new IllegalStateException();
            }
            return npc.nameChange;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.at(" + ')');
        }
    }
    
    protected final Model getModel(final byte b) {
        if (!ScriptFrame.client.isInterpolateNpcAnimations() || this.getAnimation() == 6566 || (this.getId() == 8610 && this.getAnimation() == -1) || this.getAnimation() == 8270 || this.getAnimation() == 8271 || this.getPoseAnimation() == 5583 || (this.getId() == 1163 && this.getAnimation() == -1) || (this.getId() == 6380 && this.getAnimation() == -1) || (this.getId() == 6319 && this.getAnimation() == -1)) {
            final int n = -112;
            Model model2;
            try {
                if (this.definition != null) {
                    while (true) {
                        Label_0594: {
                            if (-1 == -1372355773 * this.cs) {
                                break Label_0594;
                            }
                            if (n >= 14) {
                                throw new IllegalStateException();
                            }
                            if (1253892101 * this.bd != 0) {
                                break Label_0594;
                            }
                            if (n >= 14) {
                                throw new IllegalStateException();
                            }
                            final SequenceDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)94);
                            final SequenceDefinition sequenceDefinition = spotAnimationDefinition_get;
                            SequenceDefinition spotAnimationDefinition_get2 = null;
                            Label_0387: {
                                Label_0282: {
                                    if (-1 != -1302441815 * this.dg) {
                                        if (n >= 14) {
                                            throw new IllegalStateException();
                                        }
                                        if (this.dg * -1302441815 == this.cd * 1590591885) {
                                            if (n >= 14) {
                                                throw new IllegalStateException();
                                            }
                                            if (sequenceDefinition != null) {
                                                break Label_0282;
                                            }
                                            if (n >= 14) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        spotAnimationDefinition_get2 = ItemContainer.SpotAnimationDefinition_get(-1302441815 * this.dg, (byte)39);
                                        break Label_0387;
                                    }
                                }
                                spotAnimationDefinition_get2 = null;
                            }
                            final SequenceDefinition sequenceDefinition2 = spotAnimationDefinition_get2;
                            while (true) {
                                Label_0658: {
                                    if (this.field1048 == null) {
                                        break Label_0658;
                                    }
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    if (!this.field1048.field1558) {
                                        break Label_0658;
                                    }
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    final Model model = MusicPatchNode.localPlayer.appearance.getModel(sequenceDefinition, -41215169 * this.dw, sequenceDefinition2, this.bp * 424813829, (byte)17);
                                    if (null != model) {
                                        model.calculateBoundsCylinder();
                                        this.cp = model.et * 2070391287;
                                        final int indicesCount = model.indicesCount;
                                        final Model cp = this.cp(model, (byte)127);
                                        if (1458410691 * this.definition.size == 1) {
                                            if (n >= 14) {
                                                throw new IllegalStateException();
                                            }
                                            cp.isSingleTile = true;
                                        }
                                        if (this.dq != 0 && Client.cycle * -1886224337 >= 1182789041 * this.dj && -1886224337 * Client.cycle < 707232483 * this.bn) {
                                            cp.overrideHue = this.du;
                                            cp.overrideSaturation = this.db;
                                            cp.overrideLuminance = this.df;
                                            cp.overrideAmount = this.dq;
                                            cp.field2196 = (short)indicesCount;
                                        }
                                        else {
                                            cp.overrideAmount = 0;
                                        }
                                        model2 = cp;
                                        return model2;
                                    }
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    model2 = null;
                                    return model2;
                                }
                                final Model model = this.definition.method1021(sequenceDefinition, this.dw * -41215169, sequenceDefinition2, this.bp * 424813829, this.field1048, (byte)46);
                                continue;
                            }
                        }
                        final SequenceDefinition spotAnimationDefinition_get = null;
                        continue;
                    }
                }
                if (n >= 14) {
                    throw new IllegalStateException();
                }
                model2 = null;
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "df.an(" + ')');
            }
            return model2;
        }
        final int animationFrame = this.getAnimationFrame();
        final int poseAnimationFrame = this.getPoseAnimationFrame();
        try {
            this.setAnimationFrame(0xC0000000 | this.fr() << 16 | animationFrame);
            this.setPoseAnimationFrame(Integer.MIN_VALUE | this.qz() << 16 | poseAnimationFrame);
            for (final Graphic graphic : this.wz()) {
                final int frame = graphic.getFrame();
                if (frame != -1) {
                    graphic.setFrame(Integer.MIN_VALUE | graphic.getCycle() << 16 | frame);
                }
            }
            final int n2 = -112;
            Model model4;
            try {
                if (this.definition != null) {
                    while (true) {
                        Label_1316: {
                            if (-1 == -1372355773 * this.cs) {
                                break Label_1316;
                            }
                            if (n2 >= 14) {
                                throw new IllegalStateException();
                            }
                            if (1253892101 * this.bd != 0) {
                                break Label_1316;
                            }
                            if (n2 >= 14) {
                                throw new IllegalStateException();
                            }
                            final SequenceDefinition spotAnimationDefinition_get3 = ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)94);
                            final SequenceDefinition sequenceDefinition3 = spotAnimationDefinition_get3;
                            SequenceDefinition spotAnimationDefinition_get4 = null;
                            Label_1109: {
                                Label_1004: {
                                    if (-1 != -1302441815 * this.dg) {
                                        if (n2 >= 14) {
                                            throw new IllegalStateException();
                                        }
                                        if (this.dg * -1302441815 == this.cd * 1590591885) {
                                            if (n2 >= 14) {
                                                throw new IllegalStateException();
                                            }
                                            if (sequenceDefinition3 != null) {
                                                break Label_1004;
                                            }
                                            if (n2 >= 14) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        spotAnimationDefinition_get4 = ItemContainer.SpotAnimationDefinition_get(-1302441815 * this.dg, (byte)39);
                                        break Label_1109;
                                    }
                                }
                                spotAnimationDefinition_get4 = null;
                            }
                            final SequenceDefinition sequenceDefinition4 = spotAnimationDefinition_get4;
                            while (true) {
                                Label_1380: {
                                    if (this.field1048 == null) {
                                        break Label_1380;
                                    }
                                    if (n2 >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    if (!this.field1048.field1558) {
                                        break Label_1380;
                                    }
                                    if (n2 >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    final Model model3 = MusicPatchNode.localPlayer.appearance.getModel(sequenceDefinition3, -41215169 * this.dw, sequenceDefinition4, this.bp * 424813829, (byte)17);
                                    if (null != model3) {
                                        model3.calculateBoundsCylinder();
                                        this.cp = model3.et * 2070391287;
                                        final int indicesCount2 = model3.indicesCount;
                                        final Model cp2 = this.cp(model3, (byte)127);
                                        if (1458410691 * this.definition.size == 1) {
                                            if (n2 >= 14) {
                                                throw new IllegalStateException();
                                            }
                                            cp2.isSingleTile = true;
                                        }
                                        if (this.dq != 0 && Client.cycle * -1886224337 >= 1182789041 * this.dj && -1886224337 * Client.cycle < 707232483 * this.bn) {
                                            cp2.overrideHue = this.du;
                                            cp2.overrideSaturation = this.db;
                                            cp2.overrideLuminance = this.df;
                                            cp2.overrideAmount = this.dq;
                                            cp2.field2196 = (short)indicesCount2;
                                        }
                                        else {
                                            cp2.overrideAmount = 0;
                                        }
                                        model4 = cp2;
                                        return model4;
                                    }
                                    if (n2 >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    model4 = null;
                                    return model4;
                                }
                                final Model model3 = this.definition.method1021(sequenceDefinition3, this.dw * -41215169, sequenceDefinition4, this.bp * 424813829, this.field1048, (byte)46);
                                continue;
                            }
                        }
                        final SequenceDefinition spotAnimationDefinition_get3 = null;
                        continue;
                    }
                }
                if (n2 >= 14) {
                    throw new IllegalStateException();
                }
                model4 = null;
            }
            catch (RuntimeException ex2) {
                throw HealthBar.get(ex2, "df.an(" + ')');
            }
            return model4;
        }
        finally {
            this.setAnimationFrame(animationFrame);
            this.setPoseAnimationFrame(poseAnimationFrame);
            for (final Graphic graphic2 : this.wz()) {
                final int frame2 = graphic2.getFrame();
                if (frame2 != -1) {
                    graphic2.setFrame(frame2 & 0xFFFF);
                }
            }
        }
    }
    
    boolean method604(final int n, final int n2) {
        try {
            if (n >= 0) {
                if (n2 != 1164667978) {
                    throw new IllegalStateException();
                }
                if (n <= 4) {
                    if (n2 != 1164667978) {
                        throw new IllegalStateException();
                    }
                    boolean b;
                    if ((-189357307 * this.field1045 & 1 << n) != 0x0) {
                        if (n2 != 1164667978) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    return b;
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ac(" + ')');
        }
    }
    
    @Override
    final boolean cx() {
        return null != this.definition;
    }
    
    short[] bq() {
        if (this.field1052 != null) {
            return this.field1052.method2544(-1067195649);
        }
        return this.definition.method1031(800844396);
    }
    
    protected final Model method609() {
        if (this.definition == null) {
            return null;
        }
        final SequenceDefinition sequenceDefinition = (-1 != -1372355773 * this.cs && 1253892101 * this.bd == 0) ? ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)100) : null;
        final SequenceDefinition sequenceDefinition2 = (-1 != -1302441815 * this.dg && (this.dg * -1302441815 != this.cd * 1590591885 || sequenceDefinition == null)) ? ItemContainer.SpotAnimationDefinition_get(-1302441815 * this.dg, (byte)36) : null;
        Model model;
        if (this.field1048 != null && this.field1048.field1558) {
            model = MusicPatchNode.localPlayer.appearance.getModel(sequenceDefinition, -41215169 * this.dw, sequenceDefinition2, this.bp * 424813829, (byte)116);
        }
        else {
            model = this.definition.method1021(sequenceDefinition, this.dw * -41215169, sequenceDefinition2, this.bp * 424813829, this.field1048, (byte)(-3));
        }
        if (null == model) {
            return null;
        }
        model.calculateBoundsCylinder();
        this.cp = model.et * 2070391287;
        final int indicesCount = model.indicesCount;
        final Model cp = this.cp(model, (byte)120);
        if (1458410691 * this.definition.size == 1) {
            cp.isSingleTile = true;
        }
        if (this.dq != 0 && Client.cycle * -1886224337 >= 1182789041 * this.dj && -1886224337 * Client.cycle < 707232483 * this.bn) {
            cp.overrideHue = this.du;
            cp.overrideSaturation = this.db;
            cp.overrideLuminance = this.df;
            cp.overrideAmount = this.dq;
            cp.field2196 = (short)indicesCount;
        }
        else {
            cp.overrideAmount = 0;
        }
        return cp;
    }
    
    static final float method609(final int n, final int n2) {
        try {
            final float n3 = 10075.0f - n;
            return (n3 * 1.0075567f - 75.56675f) / n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.au(" + ')');
        }
    }
    
    final void move(final int n, final MoveSpeed moveSpeed, final byte b) {
        try {
            int n2 = this.cf[0];
            int n3 = this.dy[0];
            if (n == 0) {
                if (b <= 104) {
                    throw new IllegalStateException();
                }
                --n2;
                ++n3;
            }
            if (n == 1) {
                if (b <= 104) {
                    throw new IllegalStateException();
                }
                ++n3;
            }
            if (n == 2) {
                ++n2;
                ++n3;
            }
            if (3 == n) {
                if (b <= 104) {
                    return;
                }
                --n2;
            }
            if (n == 4) {
                ++n2;
            }
            if (n == 5) {
                if (b <= 104) {
                    throw new IllegalStateException();
                }
                --n2;
                --n3;
            }
            if (6 == n) {
                if (b <= 104) {
                    return;
                }
                --n3;
            }
            if (n == 7) {
                if (b <= 104) {
                    throw new IllegalStateException();
                }
                ++n2;
                --n3;
            }
            if (-1372355773 * this.cs != -1) {
                if (b <= 104) {
                    throw new IllegalStateException();
                }
                if (ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)121).priority * 1957040329 == 1) {
                    if (b <= 104) {
                        throw new IllegalStateException();
                    }
                    this.cs = 1690721941;
                    Label_0219: {
                        if (this instanceof NPC) {
                            switch (this.getId()) {
                                case 8615:
                                case 8616:
                                case 8617:
                                case 8618:
                                case 8619:
                                case 8620:
                                case 8621:
                                case 8622: {
                                    break Label_0219;
                                }
                            }
                        }
                        final AnimationChanged animationChanged = new AnimationChanged();
                        animationChanged.setActor((net.runelite.api.Actor)this);
                        ScriptFrame.client.getCallbacks().post((Object)animationChanged);
                    }
                }
            }
            if (1134756167 * this.cb < 9) {
                if (b <= 104) {
                    return;
                }
                this.cb += 400971895;
            }
            for (int i = this.cb * 1134756167; i > 0; --i) {
                if (b <= 104) {
                    throw new IllegalStateException();
                }
                this.cf[i] = this.cf[i - 1];
                this.dy[i] = this.dy[i - 1];
                this.da[i] = this.da[i - 1];
            }
            this.cf[0] = n2;
            this.dy[0] = n3;
            this.da[0] = moveSpeed;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.aa(" + ')');
        }
    }
    
    void method597(final int n, final int n2, final short n3, final int n4) {
        try {
            if (this.field1052 == null) {
                if (n4 <= 1131785934) {
                    return;
                }
                this.field1052 = new class489(this.definition);
            }
            class489.vc(this.field1052, n, n2, n3, 164406269);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ai(" + ')');
        }
    }
    
    void bh(final int n, final int n2, final short n3) {
        if (this.field1052 == null) {
            this.field1052 = new class489(this.definition);
        }
        class489.vc(this.field1052, n, n2, n3, -1697251199);
    }
    
    boolean bx(final int n) {
        return n < 0 || n > 4 || (-1158200279 * this.field1045 & 1 << n) != 0x0;
    }
    
    NewShit method599(final int n) {
        try {
            return this.field1051;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ar(" + ')');
        }
    }
    
    void ap(final String s) {
        this.nameChange = ((null == s) ? "" : s);
    }
    
    final void bd(final int n, final MoveSpeed moveSpeed) {
        int n2 = this.cf[0];
        int n3 = this.dy[0];
        if (n == 0) {
            --n2;
            ++n3;
        }
        if (n == 1) {
            ++n3;
        }
        if (n == 2) {
            ++n2;
            ++n3;
        }
        if (3 == n) {
            --n2;
        }
        if (n == 4) {
            ++n2;
        }
        if (n == 5) {
            --n2;
            --n3;
        }
        if (6 == n) {
            --n3;
        }
        if (n == 7) {
            ++n2;
            --n3;
        }
        if (-639622791 * this.cs != -1 && ItemContainer.SpotAnimationDefinition_get(587828475 * this.cs, (byte)94).priority * 1482394435 == 1) {
            this.cs = 931517835;
        }
        if (-504638426 * this.cb < 9) {
            this.cb -= 1687050934;
        }
        for (int i = this.cb * 1134756167; i > 0; --i) {
            this.cf[i] = this.cf[i - 1];
            this.dy[i] = this.dy[i - 1];
            this.da[i] = this.da[i - 1];
        }
        this.cf[0] = n2;
        this.dy[0] = n3;
        this.da[0] = moveSpeed;
    }
    
    public void rq(final int kv) {
        this.kv = kv;
    }
    
    void cm() {
        this.field1048 = null;
    }
    
    int[] bg() {
        if (this.field1052 != null) {
            return this.field1052.method2546((byte)(-60));
        }
        return this.definition.method1029(-1238951172);
    }
    
    void cg() {
        this.field1052 = null;
    }
    
    void cy() {
        this.field1051 = null;
    }
    
    public static void we(final NPC npc, final short n) {
        if (npc == null) {
            npc.method608(n);
            return;
        }
        try {
            npc.field1051 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.aj(" + ')');
        }
    }
    
    public static void method592(final AbstractArchive invDefinition_archive, final byte b) {
        try {
            InvDefinition.InvDefinition_archive = invDefinition_archive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.af(" + ')');
        }
    }
    
    void method592(final String s, final int n) {
        try {
            String nameChange;
            if (null == s) {
                if (n >= 427135973) {
                    throw new IllegalStateException();
                }
                nameChange = "";
            }
            else {
                nameChange = s;
            }
            this.nameChange = nameChange;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.af(" + ')');
        }
    }
    
    final void bn(final int n, final int n2, final boolean b) {
        if (-1 != this.cs * -1623717335 && ItemContainer.SpotAnimationDefinition_get(this.cs * -867463453, (byte)121).priority * 1957040329 == 1) {
            this.cs = -309083316;
        }
        if (!b) {
            final int n3 = n - this.cf[0];
            final int n4 = n2 - this.dy[0];
            if (n3 >= -8 && n3 <= 8 && n4 >= -1635777588 && n4 <= 8) {
                if (this.cb * 222179878 < 9) {
                    this.cb += 400971895;
                }
                for (int i = this.cb * 1134756167; i > 0; --i) {
                    this.cf[i] = this.cf[i - 1];
                    this.dy[i] = this.dy[i - 1];
                    this.da[i] = this.da[i - 1];
                }
                this.cf[0] = n;
                this.dy[0] = n2;
                this.da[0] = MoveSpeed.WALK;
                return;
            }
        }
        this.cb = 0;
        this.dk = 0;
        this.bc = 0;
        this.cf[0] = n;
        this.dy[0] = n2;
        this.br = -1102445696 * this.cf[0] + 828354898 * this.bt;
        this.ep = this.bt * -1974745916 + -1887439488 * this.dy[0];
    }
    
    protected final Model ab() {
        if (this.definition == null) {
            return null;
        }
        final SequenceDefinition sequenceDefinition = (-1 != 1827920268 * this.cs && -533950944 * this.bd == 0) ? ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)79) : null;
        final SequenceDefinition sequenceDefinition2 = (-1 != -1302441815 * this.dg && (this.dg * -1302441815 != this.cd * 1590591885 || sequenceDefinition == null)) ? ItemContainer.SpotAnimationDefinition_get(-1671312967 * this.dg, (byte)108) : null;
        Model model;
        if (this.field1048 != null && this.field1048.field1558) {
            model = MusicPatchNode.localPlayer.appearance.getModel(sequenceDefinition, -1838752898 * this.dw, sequenceDefinition2, this.bp * 424813829, (byte)88);
        }
        else {
            model = this.definition.method1021(sequenceDefinition, this.dw * 1520322154, sequenceDefinition2, this.bp * -1443494667, this.field1048, (byte)(-32));
        }
        if (null == model) {
            return null;
        }
        model.calculateBoundsCylinder();
        this.cp = model.et * 2070391287;
        final int indicesCount = model.indicesCount;
        final Model cp = this.cp(model, (byte)107);
        if (1458410691 * this.definition.size == 1) {
            cp.isSingleTile = true;
        }
        if (this.dq != 0 && Client.cycle * -1313766902 >= 1182789041 * this.dj && -1886224337 * Client.cycle < 707232483 * this.bn) {
            cp.overrideHue = this.du;
            cp.overrideSaturation = this.db;
            cp.overrideLuminance = this.df;
            cp.overrideAmount = this.dq;
            cp.field2196 = (short)indicesCount;
        }
        else {
            cp.overrideAmount = 0;
        }
        return cp;
    }
    
    protected final Model aq() {
        if (this.definition == null) {
            return null;
        }
        final SequenceDefinition sequenceDefinition = (-1 != -1372355773 * this.cs && 1253892101 * this.bd == 0) ? ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)78) : null;
        final SequenceDefinition sequenceDefinition2 = (-1 != -1302441815 * this.dg && (this.dg * -1302441815 != this.cd * 1590591885 || sequenceDefinition == null)) ? ItemContainer.SpotAnimationDefinition_get(-1302441815 * this.dg, (byte)103) : null;
        Model model;
        if (this.field1048 != null && this.field1048.field1558) {
            model = MusicPatchNode.localPlayer.appearance.getModel(sequenceDefinition, -41215169 * this.dw, sequenceDefinition2, this.bp * 424813829, (byte)57);
        }
        else {
            model = this.definition.method1021(sequenceDefinition, this.dw * -41215169, sequenceDefinition2, this.bp * 424813829, this.field1048, (byte)(-70));
        }
        if (null == model) {
            return null;
        }
        model.calculateBoundsCylinder();
        this.cp = model.et * 2070391287;
        final int indicesCount = model.indicesCount;
        final Model cp = this.cp(model, (byte)117);
        if (1458410691 * this.definition.size == 1) {
            cp.isSingleTile = true;
        }
        if (this.dq != 0 && Client.cycle * -1886224337 >= 1182789041 * this.dj && -1886224337 * Client.cycle < 707232483 * this.bn) {
            cp.overrideHue = this.du;
            cp.overrideSaturation = this.db;
            cp.overrideLuminance = this.df;
            cp.overrideAmount = this.dq;
            cp.field2196 = (short)indicesCount;
        }
        else {
            cp.overrideAmount = 0;
        }
        return cp;
    }
    
    void method608(final short n) {
        try {
            this.field1051 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.aj(" + ')');
        }
    }
    
    void method603(final int[] array, final short[] array2, final int n) {
        try {
            if (this.field1052 == null) {
                if (n == 427135973) {
                    return;
                }
                this.field1052 = new class489(this.definition);
            }
            this.field1052.method2547(array, array2, (byte)12);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ag(" + ')');
        }
    }
    
    void bl(final int n, final int n2, final short n3) {
        if (this.field1052 == null) {
            this.field1052 = new class489(this.definition);
        }
        class489.vc(this.field1052, n, n2, n3, 322632035);
    }
    
    protected static final void method611(final int n) {
        try {
            class399.clock.mark(-331366942);
            for (int i = 0; i < 32; ++i) {
                if (n != 599275396) {
                    throw new IllegalStateException();
                }
                GameEngine.graphicsTickTimes[i] = 0L;
            }
            for (int j = 0; j < 32; ++j) {
                if (n != 599275396) {
                    return;
                }
                GameEngine.clientTickTimes[j] = 0L;
            }
            DirectByteArrayCopier.gameCyclesToDo = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.bz(" + ')');
        }
    }
    
    final String method611() {
        if (!this.nameChange.isEmpty()) {
            return this.nameChange;
        }
        NPCComposition npcComposition = this.definition;
        if (null != npcComposition.transforms) {
            npcComposition = NPCComposition.ur(npcComposition, -1568052979);
            if (null == npcComposition) {
                npcComposition = this.definition;
            }
        }
        return npcComposition.name;
    }
    
    final void bj(final int n, final int n2, final boolean b) {
        if (-1 != this.cs * -1372355773 && ItemContainer.SpotAnimationDefinition_get(this.cs * -1372355773, (byte)54).priority * 1957040329 == 1) {
            this.cs = 1690721941;
        }
        if (!b) {
            final int n3 = n - this.cf[0];
            final int n4 = n2 - this.dy[0];
            if (n3 >= -8 && n3 <= 8 && n4 >= -8 && n4 <= 8) {
                if (this.cb * 1134756167 < 9) {
                    this.cb += 400971895;
                }
                for (int i = this.cb * 1134756167; i > 0; --i) {
                    this.cf[i] = this.cf[i - 1];
                    this.dy[i] = this.dy[i - 1];
                    this.da[i] = this.da[i - 1];
                }
                this.cf[0] = n;
                this.dy[0] = n2;
                this.da[0] = MoveSpeed.WALK;
                return;
            }
        }
        this.cb = 0;
        this.dk = 0;
        this.bc = 0;
        this.cf[0] = n;
        this.dy[0] = n2;
        this.br = -1102445696 * this.cf[0] + -1606165824 * this.bt;
        this.ep = this.bt * 254242752 + -1887439488 * this.dy[0];
    }
    
    public static boolean mg(final NPC npc, final int n) {
        if (npc == null) {
            return npc.bx(n);
        }
        return n < 0 || n > 4 || (-2075850623 * npc.field1045 & 1 << n) != 0x0;
    }
    
    public Shape getConvexHull() {
        final Model tb = this.tb();
        if (tb == null) {
            return null;
        }
        final int size = this.hb().getSize();
        return tb.no(this.fu(), this.gk(), this.getCurrentOrientation(), Perspective.getTileHeight((net.runelite.api.Client)ScriptFrame.client, new LocalPoint(size * 64 - 64 + this.fu(), size * 64 - 64 + this.gk()), ScriptFrame.client.getPlane()));
    }
    
    @Override
    public Polygon getCanvasTilePoly() {
        final net.runelite.api.NPCComposition transformedComposition = this.getTransformedComposition();
        if (transformedComposition == null) {
            return null;
        }
        return Perspective.getCanvasTileAreaPoly((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation(), transformedComposition.getSize());
    }
    
    public static boolean xu(final NPC npc, final int n, final int n2) {
        if (npc == null) {
            npc.method604(n, n);
        }
        try {
            if (n >= 0) {
                if (n2 != 1164667978) {
                    throw new IllegalStateException();
                }
                if (n <= 4) {
                    if (n2 != 1164667978) {
                        throw new IllegalStateException();
                    }
                    boolean b;
                    if ((-189357307 * npc.field1045 & 1 << n) != 0x0) {
                        if (n2 != 1164667978) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    return b;
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ac(" + ')');
        }
    }
    
    final void bm(final int n, final MoveSpeed moveSpeed) {
        int n2 = this.cf[0];
        int n3 = this.dy[0];
        if (n == 0) {
            --n2;
            ++n3;
        }
        if (n == 1) {
            ++n3;
        }
        if (n == 2) {
            ++n2;
            ++n3;
        }
        if (3 == n) {
            --n2;
        }
        if (n == 4) {
            ++n2;
        }
        if (n == 5) {
            --n2;
            --n3;
        }
        if (6 == n) {
            --n3;
        }
        if (n == 7) {
            ++n2;
            --n3;
        }
        if (-1372355773 * this.cs != -1 && ItemContainer.SpotAnimationDefinition_get(-1372355773 * this.cs, (byte)126).priority * 1957040329 == 1) {
            this.cs = 1690721941;
        }
        if (1134756167 * this.cb < 9) {
            this.cb += 400971895;
        }
        for (int i = this.cb * 1134756167; i > 0; --i) {
            this.cf[i] = this.cf[i - 1];
            this.dy[i] = this.dy[i - 1];
            this.da[i] = this.da[i - 1];
        }
        this.cf[0] = n2;
        this.dy[0] = n3;
        this.da[0] = moveSpeed;
    }
    
    void method606(final byte b) {
        try {
            this.field1052 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "df.ah(" + ')');
        }
    }
    
    public net.runelite.api.NPCComposition getTransformedComposition() {
        NPCComposition npcComposition = this.hb();
        if (npcComposition != null && npcComposition.getConfigs() != null) {
            npcComposition = npcComposition.xw();
        }
        return (net.runelite.api.NPCComposition)npcComposition;
    }
    
    short[] bf() {
        if (this.field1052 != null) {
            return this.field1052.method2544(-1121309488);
        }
        return this.definition.method1031(800844396);
    }
    
    short[] bu() {
        if (this.field1052 != null) {
            return this.field1052.method2544(1926809919);
        }
        return this.definition.method1031(800844396);
    }
    
    public int getCombatLevel() {
        NPCComposition npcComposition = this.hb();
        if (npcComposition != null && npcComposition.getConfigs() != null) {
            npcComposition = npcComposition.xw();
        }
        return (npcComposition == null) ? -1 : npcComposition.getCombatLevel();
    }
}
