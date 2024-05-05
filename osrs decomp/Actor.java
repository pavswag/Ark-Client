import net.runelite.api.NPCComposition;
import net.runelite.api.coords.WorldArea;
import java.util.Iterator;
import net.runelite.api.IterableHashTable;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.GraphicChanged;
import java.awt.Polygon;
import net.runelite.api.coords.LocalPoint;
import java.awt.Graphics2D;
import net.runelite.api.coords.WorldPoint;
import java.awt.image.BufferedImage;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.events.OverheadTextChanged;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.Hitsplat;
import com.google.common.collect.ImmutableSet;
import net.runelite.api.events.AnimationChanged;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class Actor extends Renderable implements net.runelite.api.Actor
{
    int crawlRightSequence;
    int field1005;
    int sequenceFrameCycle;
    boolean isWalking;
    int idleSequence;
    int[] hitSplatCycles;
    boolean field938;
    int field986;
    boolean showPublicPlayerChat;
    int targetIndex;
    int runSequence;
    int field985;
    String overheadText;
    int field984;
    int x;
    public static final Set sk;
    int walkLeftSequence;
    int field1006;
    int runLeftSequence;
    int recolourEndCycle;
    int walkSequence;
    int turnRightSequence;
    int walkRightSequence;
    int movingOrientation;
    int rotation;
    int spotAnimation;
    int field1002;
    int[] hitSplatValues2;
    byte hitSplatCount;
    int[] pathY;
    int[] hitSplatTypes;
    int exactMoveDirection;
    int turnLeftSequence;
    int field999;
    IterableNodeDeque healthBars;
    int walkBackSequence;
    boolean false0;
    int field983;
    public boolean hb;
    int[] hitSplatTypes2;
    int movementFrameCycle;
    int[] pathX;
    boolean isAutoChatting;
    int crawlBackSequence;
    int field975;
    int combatLevelChange;
    byte recolourHue;
    int currentSequenceFrameIndex;
    int pathLength;
    int playerCycle;
    int y;
    IterableNodeHashTable graphics;
    int npcCycle;
    int field957;
    int orientation;
    int movementSequence;
    int field993;
    int exactMoveArrive1Cycle;
    int movementFrame;
    int sequence;
    int defaultHeight;
    int sequenceFrame;
    int field936;
    int runBackSequence;
    MoveSpeed[] pathTraversed;
    byte recolourSaturation;
    byte recolourLuminance;
    int overheadTextCyclesRemaining;
    int runRightSequence;
    int graphicsCount;
    int[] hitSplatValues;
    int field970;
    int recolourStartCycle;
    int crawlSequence;
    byte recolourAmount;
    int crawlLeftSequence;
    int field1003;
    int sequenceDelay;
    public static final String kw = "There was a problem updating your DOB.";
    
    Actor() {
        this.isWalking = false;
        this.idleSequence = -1967111979;
        this.sequenceFrameCycle = -1196796229;
        this.crawlRightSequence = 767436785;
        this.exactMoveDirection = 603869663;
        this.targetIndex = -1672510249;
        this.runSequence = 1683505383;
        this.field985 = -497469823;
        this.recolourEndCycle = -1927855919;
        this.field984 = -140602839;
        this.x = 1320156809;
        this.walkLeftSequence = -725472713;
        this.field1006 = 1530081757;
        this.runLeftSequence = 1035736995;
        this.field936 = 1110395975;
        this.walkSequence = 2025717011;
        this.walkRightSequence = 919918425;
        this.overheadText = null;
        this.te(-1);
        this.showPublicPlayerChat = false;
        this.spotAnimation = -1924554444;
        this.field1002 = 0;
        this.recolourStartCycle = 0;
        this.hitSplatCount = 0;
        this.pathY = new int[4];
        this.hitSplatTypes = new int[4];
        this.hitSplatValues = new int[4];
        this.hitSplatValues2 = new int[4];
        this.hitSplatCycles = new int[4];
        this.healthBars = new IterableNodeDeque();
        this.rotation = -1052277865;
        this.zr(-1);
        this.false0 = false;
        this.field983 = 1409690365;
        this.runBackSequence = 1213206377;
        this.movementFrameCycle = -1388623137;
        this.npcCycle = -327373721;
        this.crawlBackSequence = 0;
        this.field975 = 0;
        this.combatLevelChange = 0;
        this.overheadTextCyclesRemaining = 1690721941;
        Label_0423: {
            if (this instanceof NPC) {
                switch (((NPC)this).getId()) {
                    case 8615:
                    case 8616:
                    case 8617:
                    case 8618:
                    case 8619:
                    case 8620:
                    case 8621:
                    case 8622: {
                        break Label_0423;
                    }
                }
            }
            final AnimationChanged animationChanged = new AnimationChanged();
            animationChanged.setActor((net.runelite.api.Actor)this);
            ScriptFrame.client.getCallbacks().post((Object)animationChanged);
        }
        this.currentSequenceFrameIndex = 0;
        this.pathLength = 0;
        this.playerCycle = 0;
        this.y = 0;
        this.graphics = new IterableNodeHashTable(4);
        this.runRightSequence = 0;
        this.defaultHeight = 0;
        this.sequenceFrame = 233502456;
        this.field999 = 887211183;
        this.turnRightSequence = 368061749;
        this.graphicsCount = 0;
        this.field993 = -1759588000;
        this.field970 = 0;
        this.hitSplatTypes2 = new int[10];
        this.pathX = new int[10];
        this.pathTraversed = new MoveSpeed[10];
        this.crawlLeftSequence = 0;
        this.field1003 = 0;
        this.sequenceDelay = -1392091407;
    }
    
    static {
        sk = (Set)ImmutableSet.of((Object)0, (Object)2, (Object)16, (Object)17, (Object)18, (Object)19, (Object[])new Integer[] { 20, 21, 22 });
    }
    
    void method527(final int n) {
        try {
            this.field938 = false;
            this.field983 = 1409690365;
            this.runBackSequence = 1213206377;
            this.movementFrameCycle = -1388623137;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.cd(" + ')');
        }
    }
    
    public void ba(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        int bi = 0;
        if (n >= 0) {
            final HitSplatDefinition hitSplatDefinition = (HitSplatDefinition)ScriptFrame.client.op().get(n);
            if (hitSplatDefinition != null) {
                bi = hitSplatDefinition.bi();
            }
        }
        final Hitsplat hitsplat = new Hitsplat(n, n2, n5 + bi + n6);
        final HitsplatApplied hitsplatApplied = new HitsplatApplied();
        hitsplatApplied.setActor((net.runelite.api.Actor)this);
        hitsplatApplied.setHitsplat(hitsplat);
        ScriptFrame.client.getCallbacks().post((Object)hitsplatApplied);
    }
    
    final void method536(final byte b) {
        try {
            this.field970 = 0;
            this.field1003 = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.cb(" + ')');
        }
    }
    
    IterableNodeHashTable method532(final byte b) {
        try {
            return this.graphics;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.ch(" + ')');
        }
    }
    
    public Graphic pd(final int n, final int n2, final int n3, final int n4) {
        return new Graphic(n, n2, n3, n4);
    }
    
    Model db(final Model model) {
        if (-500494421 * this.runRightSequence == 0) {
            return model;
        }
        final IterableNodeHashTableIterator iterableNodeHashTableIterator = new IterableNodeHashTableIterator(this.graphics);
        int verticesCount = model.verticesCount;
        int indicesCount = model.indicesCount;
        int field2153 = model.field2153;
        final byte field2154 = model.field2152;
        for (Graphic graphic = (Graphic)iterableNodeHashTableIterator.method2390(); graphic != null; graphic = (Graphic)iterableNodeHashTableIterator.next()) {
            if (graphic.field4169 * 971664459 != -1) {
                final Model method1042 = ItemContainer.SpotAnimationDefinition_get(-1171575623 * graphic.field4170, -813947732).method1042(-1943393538);
                if (null != method1042) {
                    verticesCount += method1042.verticesCount;
                    indicesCount += method1042.indicesCount;
                    field2153 += method1042.field2153;
                }
            }
        }
        final Model model2 = new Model(verticesCount, indicesCount, field2153, field2154);
        model2.method1342(model);
        for (Graphic graphic2 = (Graphic)iterableNodeHashTableIterator.method2390(); null != graphic2; graphic2 = (Graphic)iterableNodeHashTableIterator.next()) {
            if (-1 != graphic2.field4169 * 971664459) {
                final Model model3 = ItemContainer.SpotAnimationDefinition_get(graphic2.field4170 * -1171575623, 409806383).getModel(971664459 * graphic2.field4169, -1621049162);
                if (null != model3) {
                    model3.offsetBy(0, -(-790772793 * graphic2.field4172), 0);
                    model2.method1342(model3);
                }
            }
        }
        return model2;
    }
    
    public static void dn(final Actor actor, final int n, final int n2) {
        if (actor == null) {
            actor.removeHealthBar(n, n);
            return;
        }
        try {
            final HealthBarDefinition healthBarDefinition = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.wr(n);
            HealthBarDefinition healthBarDefinition2;
            if (healthBarDefinition != null) {
                if (n2 != 1269115179) {
                    throw new IllegalStateException();
                }
                healthBarDefinition2 = healthBarDefinition;
            }
            else {
                final byte[] takeFile = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, n, (byte)(-2));
                final HealthBarDefinition healthBarDefinition3 = new HealthBarDefinition();
                if (null != takeFile) {
                    if (n2 != 1269115179) {
                        throw new IllegalStateException();
                    }
                    healthBarDefinition3.decode(new Buffer(takeFile), (byte)39);
                }
                HealthBarDefinition.HealthBarDefinition_cached.put(healthBarDefinition3, n);
                healthBarDefinition2 = healthBarDefinition3;
            }
            final HealthBarDefinition healthBarDefinition4 = healthBarDefinition2;
            HealthBar healthBar = (HealthBar)actor.healthBars.up();
            while (null != healthBar) {
                if (healthBarDefinition4 == healthBar.definition) {
                    if (n2 != 1269115179) {
                        throw new IllegalStateException();
                    }
                    healthBar.hw();
                }
                else {
                    healthBar = (HealthBar)actor.healthBars.by();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.cw(" + ')');
        }
    }
    
    final void removeHealthBar(final int n, final int n2) {
        try {
            final HealthBarDefinition healthBarDefinition = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.wr(n);
            HealthBarDefinition healthBarDefinition2;
            if (healthBarDefinition != null) {
                if (n2 != 1269115179) {
                    throw new IllegalStateException();
                }
                healthBarDefinition2 = healthBarDefinition;
            }
            else {
                final byte[] takeFile = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, n, (byte)(-2));
                final HealthBarDefinition healthBarDefinition3 = new HealthBarDefinition();
                if (null != takeFile) {
                    if (n2 != 1269115179) {
                        throw new IllegalStateException();
                    }
                    healthBarDefinition3.decode(new Buffer(takeFile), (byte)39);
                }
                HealthBarDefinition.HealthBarDefinition_cached.vq(healthBarDefinition3, n);
                healthBarDefinition2 = healthBarDefinition3;
            }
            final HealthBarDefinition healthBarDefinition4 = healthBarDefinition2;
            HealthBar healthBar = (HealthBar)this.healthBars.aj();
            while (null != healthBar) {
                if (healthBarDefinition4 == healthBar.definition) {
                    if (n2 != 1269115179) {
                        throw new IllegalStateException();
                    }
                    healthBar.zf();
                }
                else {
                    healthBar = (HealthBar)this.healthBars.previous();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.cw(" + ')');
        }
    }
    
    boolean cv() {
        return false;
    }
    
    static final int method537(final int n, final int n2, final int n3) {
        try {
            final int n4 = 57 * n2 + n;
            final int n5 = n4 << 13 ^ n4;
            return (1376312589 + (15731 * (n5 * n5) + 789221) * n5 & Integer.MAX_VALUE) >> 19 & 0xFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.av(" + ')');
        }
    }
    
    final void dw() {
        this.field970 = 0;
        this.field1003 = 0;
    }
    
    void updateGraphic(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            final int n6 = n4 + Client.cycle * -1886224337;
            final Graphic graphic = (Graphic)this.graphics.aa(n);
            if (null != graphic) {
                graphic.hw();
                this.runRightSequence += 1822461181;
            }
            if (65535 != n2) {
                if (n5 <= -2058412227) {
                    throw new IllegalStateException();
                }
                if (n2 != -1) {
                    int n7 = 0;
                    if (n4 > 0) {
                        if (n5 <= -2058412227) {
                            throw new IllegalStateException();
                        }
                        n7 = -1;
                    }
                    this.graphics.put(new Graphic(n2, n3, n6, n7), n);
                    this.runRightSequence -= 1822461181;
                    this.zx(n, n2, n3, n4);
                    return;
                }
                if (n5 <= -2058412227) {
                    this.zx(n, n2, n3, n4);
                    return;
                }
            }
            this.zx(n, n2, n3, n4);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.cj(" + ')');
        }
    }
    
    Model method530(final Model model, final byte b) {
        final int n = 106;
        Model model2;
        try {
            if (-500494421 * this.runRightSequence == 0) {
                if (n <= 104) {
                    throw new IllegalStateException();
                }
                model2 = model;
            }
            else {
                final IterableNodeHashTableIterator iterableNodeHashTableIterator = new IterableNodeHashTableIterator(this.graphics);
                int verticesCount = model.verticesCount;
                int indicesCount = model.indicesCount;
                int field2153 = model.field2153;
                final byte field2154 = model.field2152;
                for (Graphic graphic = (Graphic)iterableNodeHashTableIterator.method2390(); graphic != null; graphic = (Graphic)iterableNodeHashTableIterator.next()) {
                    if (graphic.field4169 * 971664459 == -1) {
                        if (n <= 104) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final Model method1042 = ItemContainer.SpotAnimationDefinition_get(-1171575623 * graphic.field4170, 499145783).method1042(767740458);
                        if (null == method1042) {
                            if (n <= 104) {
                                throw new IllegalStateException();
                            }
                        }
                        else {
                            verticesCount += method1042.verticesCount;
                            indicesCount += method1042.indicesCount;
                            field2153 += method1042.field2153;
                        }
                    }
                }
                final Model model3 = new Model(verticesCount, indicesCount, field2153, field2154);
                model3.method1342(model);
                for (Graphic graphic2 = (Graphic)iterableNodeHashTableIterator.method2390(); null != graphic2; graphic2 = (Graphic)iterableNodeHashTableIterator.next()) {
                    if (n <= 104) {
                        throw new IllegalStateException();
                    }
                    if (-1 == graphic2.field4169 * 971664459) {
                        if (n <= 104) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final Model model4 = ItemContainer.SpotAnimationDefinition_get(graphic2.field4170 * -1171575623, 2052934649).getModel(971664459 * graphic2.field4169, -2067893122);
                        if (null != model4) {
                            model4.offsetBy(0, -(-790772793 * graphic2.field4172), 0);
                            model3.method1342(model4);
                        }
                    }
                }
                model2 = model3;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.cp(" + ')');
        }
        final Model model5 = model2;
        model5.un();
        return model5;
    }
    
    boolean isVisible(final int n) {
        try {
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.as(" + ')');
        }
    }
    
    void dt(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n4 + Client.cycle * -1886224337;
        final Graphic graphic = (Graphic)this.graphics.aa(n);
        if (null != graphic) {
            graphic.hw();
            this.runRightSequence += 1822461181;
        }
        if (65535 != n2 && n2 != -1) {
            int n6 = 0;
            if (n4 > 0) {
                n6 = -1;
            }
            this.graphics.put(new Graphic(n2, n3, n5, n6), n);
            this.runRightSequence -= 1822461181;
        }
    }
    
    final void di(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final HealthBarDefinition healthBarDefinition = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.wr(n);
        HealthBarDefinition healthBarDefinition2;
        if (null != healthBarDefinition) {
            healthBarDefinition2 = healthBarDefinition;
        }
        else {
            final byte[] takeFile = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, n, (byte)(-46));
            final HealthBarDefinition healthBarDefinition3 = new HealthBarDefinition();
            if (null != takeFile) {
                healthBarDefinition3.decode(new Buffer(takeFile), (byte)6);
            }
            HealthBarDefinition.HealthBarDefinition_cached.put(healthBarDefinition3, n);
            healthBarDefinition2 = healthBarDefinition3;
        }
        final HealthBarDefinition healthBarDefinition4 = healthBarDefinition2;
        Node node = null;
        Node node2 = null;
        int n7 = healthBarDefinition4.int2 * 1525821745;
        int n8 = 0;
        for (HealthBar healthBar = (HealthBar)this.healthBars.up(); healthBar != null; healthBar = (HealthBar)this.healthBars.by()) {
            ++n8;
            if (healthBar.definition.field1521 * -696374900 == healthBarDefinition4.field1521 * -431598869) {
                healthBar.put(n4 + n2, n5, n6, n3, -869970014);
                return;
            }
            if (520914669 * healthBar.definition.int1 <= -970443958 * healthBarDefinition4.int1) {
                node = healthBar;
            }
            if (1525821745 * healthBar.definition.int2 > n7) {
                node2 = healthBar;
                n7 = -737946232 * healthBar.definition.int2;
            }
        }
        if (null == node2 && n8 >= 4) {
            return;
        }
        final HealthBar healthBar2 = new HealthBar(healthBarDefinition4);
        if (node == null) {
            this.healthBars.addLast(healthBar2);
        }
        else {
            IterableNodeDeque.IterableNodeDeque_addBefore(healthBar2, node);
        }
        healthBar2.put(n2 + n4, n5, n6, n3, -869970014);
        if (n8 >= 4) {
            node2.hw();
        }
    }
    
    public int[] ie() {
        return this.pathX;
    }
    
    void method533(final int n) {
        try {
            final IterableNodeHashTableIterator iterableNodeHashTableIterator = new IterableNodeHashTableIterator(this.graphics);
            for (Graphic graphic = (Graphic)iterableNodeHashTableIterator.method2390(); null != graphic; graphic = (Graphic)iterableNodeHashTableIterator.next()) {
                if (n >= -1723490434) {
                    throw new IllegalStateException();
                }
                graphic.hw();
            }
            this.runRightSequence = 0;
            this.fq();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.ct(" + ')');
        }
    }
    
    public int[] td() {
        return this.hitSplatValues;
    }
    
    IterableNodeHashTable dh() {
        return this.graphics;
    }
    
    public static int method539(final CharSequence charSequence, final byte b) {
        try {
            final int length = charSequence.length();
            int n = 0;
            for (int i = 0; i < length; ++i) {
                if (b <= 8) {
                    throw new IllegalStateException();
                }
                n = (n << 5) - n + charSequence.charAt(i);
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.al(" + ')');
        }
    }
    
    final void dm() {
        this.field970 = 0;
        this.field1003 = 0;
    }
    
    static Message Messages_getByChannelAndID(final int i, final int n, final int n2) {
        try {
            return Messages.Messages_channels.get(i).getMessage(n, -2100835042);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.ac(" + ')');
        }
    }
    
    boolean cx() {
        return false;
    }
    
    public int gk() {
        return this.field1005 * -411750205;
    }
    
    final void do(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        boolean b = true;
        int n7 = 1;
        for (int i = 0; i < 4; ++i) {
            if (this.hitSplatValues[i] > n5) {
                b = false;
            }
            else {
                n7 = 0;
            }
        }
        int n8 = -1;
        int n9 = -1;
        int n10 = 0;
        if (n >= 0) {
            final HitSplatDefinition method725 = class122.method725(n, (byte)4);
            n9 = -1542146559 * method725.field1678;
            n10 = -989280825 * method725.field1672;
        }
        if (n7 != 0) {
            if (n9 == -1) {
                return;
            }
            n8 = 0;
            int n11 = 0;
            if (n9 == 0) {
                n11 = this.hitSplatValues[0];
            }
            else if (n9 != 0) {
                n11 = this.hitSplatTypes[0];
            }
            for (int j = 1; j < 4; ++j) {
                if (n9 == 0) {
                    if (this.hitSplatValues[j] < n11) {
                        n8 = j;
                        n11 = this.hitSplatValues[j];
                    }
                }
                else if (n9 && this.hitSplatTypes[j] < n11) {
                    n8 = j;
                    n11 = this.hitSplatTypes[j];
                }
            }
            if (n9 && n11 >= n2) {
                return;
            }
        }
        else {
            if (b) {
                this.hitSplatCount = 0;
            }
            for (int k = 0; k < 4; ++k) {
                final byte hitSplatCount = this.hitSplatCount;
                this.hitSplatCount = (byte)((1 + this.hitSplatCount) % 4);
                if (this.hitSplatValues[hitSplatCount] <= n5) {
                    n8 = hitSplatCount;
                    break;
                }
            }
        }
        if (n8 < 0) {
            return;
        }
        this.pathY[n8] = n;
        this.hitSplatTypes[n8] = n2;
        this.hitSplatValues2[n8] = n3;
        this.hitSplatCycles[n8] = n4;
        this.hitSplatValues[n8] = n5 + n10 + n6;
    }
    
    void dz(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n4 + Client.cycle * -1886224337;
        final Graphic graphic = (Graphic)this.graphics.aa(n);
        if (null != graphic) {
            graphic.hw();
            this.runRightSequence -= 1287323085;
        }
        if (65535 != n2 && n2 != -1) {
            int n6 = 0;
            if (n4 > 0) {
                n6 = -1;
            }
            this.graphics.put(new Graphic(n2, n3, n5, n6), n);
            this.runRightSequence -= 2010255727;
        }
    }
    
    public int fr() {
        return this.pathLength * 1356757385;
    }
    
    public static void ri(final Actor actor, final int n) {
        if (actor == null) {
            actor.dt(n, n, n, n);
            return;
        }
        final HealthBarDefinition healthBarDefinition = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.wr(n);
        HealthBarDefinition healthBarDefinition2;
        if (healthBarDefinition != null) {
            healthBarDefinition2 = healthBarDefinition;
        }
        else {
            final byte[] takeFile = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, n, (byte)(-54));
            final HealthBarDefinition healthBarDefinition3 = new HealthBarDefinition();
            if (null != takeFile) {
                healthBarDefinition3.decode(new Buffer(takeFile), (byte)48);
            }
            HealthBarDefinition.HealthBarDefinition_cached.put(healthBarDefinition3, n);
            healthBarDefinition2 = healthBarDefinition3;
        }
        final HealthBarDefinition healthBarDefinition4 = healthBarDefinition2;
        for (HealthBar healthBar = (HealthBar)actor.healthBars.up(); null != healthBar; healthBar = (HealthBar)actor.healthBars.by()) {
            if (healthBarDefinition4 == healthBar.definition) {
                healthBar.hw();
                return;
            }
        }
    }
    
    public static void lv(final Actor actor, final int n) {
        if (actor == null) {
            actor.isVisible(n);
        }
        final HealthBarDefinition healthBarDefinition = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.wr(n);
        HealthBarDefinition healthBarDefinition2;
        if (healthBarDefinition != null) {
            healthBarDefinition2 = healthBarDefinition;
        }
        else {
            final byte[] takeFile = HealthBarDefinition.HealthBarDefinition_archive.takeFile(-950529253, n, (byte)(-67));
            final HealthBarDefinition healthBarDefinition3 = new HealthBarDefinition();
            if (null != takeFile) {
                healthBarDefinition3.decode(new Buffer(takeFile), (byte)52);
            }
            HealthBarDefinition.HealthBarDefinition_cached.put(healthBarDefinition3, n);
            healthBarDefinition2 = healthBarDefinition3;
        }
        final HealthBarDefinition healthBarDefinition4 = healthBarDefinition2;
        for (HealthBar healthBar = (HealthBar)actor.healthBars.up(); null != healthBar; healthBar = (HealthBar)actor.healthBars.by()) {
            if (healthBarDefinition4 == healthBar.definition) {
                healthBar.hw();
                return;
            }
        }
    }
    
    public void vi() {
        this.method533(-2086288959);
    }
    
    public int getOrientation() {
        return this.turnLeftSequence * -1751341433;
    }
    
    public IterableNodeDeque ry() {
        return this.healthBars;
    }
    
    final void addHitSplat(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        try {
            boolean b = true;
            int n8 = 1;
            for (int i = 0; i < 4; ++i) {
                if (n7 != 1919870398) {
                    throw new IllegalStateException();
                }
                if (this.hitSplatValues[i] > n5) {
                    if (n7 != 1919870398) {
                        this.ba(n, n2, n3, n4, n5, n6);
                        return;
                    }
                    b = false;
                }
                else {
                    n8 = 0;
                }
            }
            int n9 = -1;
            int n10 = -1;
            int n11 = 0;
            if (n >= 0) {
                if (n7 != 1919870398) {
                    throw new IllegalStateException();
                }
                final HitSplatDefinition method725 = class122.method725(n, (byte)4);
                n10 = 1897913521 * method725.field1678;
                n11 = 292771999 * method725.field1672;
            }
            if (n8 != 0) {
                if (n7 != 1919870398) {
                    this.ba(n, n2, n3, n4, n5, n6);
                    return;
                }
                if (n10 == -1) {
                    this.ba(n, n2, n3, n4, n5, n6);
                    return;
                }
                n9 = 0;
                int n12 = 0;
                if (n10 == 0) {
                    n12 = this.hitSplatValues[0];
                }
                else if (n10 != 0) {
                    if (n7 != 1919870398) {
                        this.ba(n, n2, n3, n4, n5, n6);
                        return;
                    }
                    n12 = this.hitSplatTypes[0];
                }
                for (int j = 1; j < 4; ++j) {
                    if (n7 != 1919870398) {
                        throw new IllegalStateException();
                    }
                    if (n10 == 0) {
                        if (n7 != 1919870398) {
                            throw new IllegalStateException();
                        }
                        if (this.hitSplatValues[j] < n12) {
                            n9 = j;
                            n12 = this.hitSplatValues[j];
                        }
                    }
                    else if (n10 != 0) {
                        if (n7 != 1919870398) {
                            this.ba(n, n2, n3, n4, n5, n6);
                            return;
                        }
                        if (this.hitSplatTypes[j] < n12) {
                            n9 = j;
                            n12 = this.hitSplatTypes[j];
                        }
                    }
                }
                if (n10 != 0) {
                    if (n7 != 1919870398) {
                        this.ba(n, n2, n3, n4, n5, n6);
                        return;
                    }
                    if (n12 >= n2) {
                        if (n7 != 1919870398) {
                            this.ba(n, n2, n3, n4, n5, n6);
                            return;
                        }
                        this.ba(n, n2, n3, n4, n5, n6);
                        return;
                    }
                }
            }
            else {
                if (b) {
                    this.hitSplatCount = 0;
                }
                int k = 0;
                while (k < 4) {
                    if (n7 != 1919870398) {
                        throw new IllegalStateException();
                    }
                    final byte hitSplatCount = this.hitSplatCount;
                    this.hitSplatCount = (byte)((1 + this.hitSplatCount) % 4);
                    if (this.hitSplatValues[hitSplatCount] <= n5) {
                        if (n7 != 1919870398) {
                            throw new IllegalStateException();
                        }
                        n9 = hitSplatCount;
                        break;
                    }
                    else {
                        ++k;
                    }
                }
            }
            if (n9 >= 0) {
                this.pathY[n9] = n;
                this.hitSplatTypes[n9] = n2;
                this.hitSplatValues2[n9] = n3;
                this.hitSplatCycles[n9] = n4;
                this.hitSplatValues[n9] = n5 + n11 + n6;
                this.ba(n, n2, n3, n4, n5, n6);
                return;
            }
            if (n7 != 1919870398) {
                throw new IllegalStateException();
            }
            this.ba(n, n2, n3, n4, n5, n6);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.co(" + ')');
        }
    }
    
    public int[] fg() {
        return this.pathY;
    }
    
    public static void er(final Actor actor, final int n, final int n2, final int n3, final int n4) {
        if (actor == null) {
            actor.fg();
        }
        final int n5 = n4 + Client.cycle * -1886224337;
        final Graphic graphic = (Graphic)actor.graphics.aa(n);
        if (null != graphic) {
            graphic.hw();
            actor.runRightSequence += 1822461181;
        }
        if (65535 == n2 || n2 == -1) {
            return;
        }
        int n6 = 0;
        if (n4 > 0) {
            n6 = -1;
        }
        actor.graphics.put(new Graphic(n2, n3, n5, n6), n);
        actor.runRightSequence -= 1822461181;
    }
    
    public void te(final int n) {
        final String overheadText = this.getOverheadText();
        if (overheadText != null) {
            ScriptFrame.client.getCallbacks().post((Object)new OverheadTextChanged((net.runelite.api.Actor)this, overheadText));
        }
    }
    
    final void addHealthBar(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final byte b) {
        this.xf(n, n2, n3, n4, n5, n6);
        try {
            final HealthBarDefinition healthBarDefinition = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.wr(n);
            HealthBarDefinition healthBarDefinition2;
            if (null != healthBarDefinition) {
                if (b <= 75) {
                    return;
                }
                healthBarDefinition2 = healthBarDefinition;
            }
            else {
                final byte[] takeFile = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, n, (byte)(-46));
                final HealthBarDefinition healthBarDefinition3 = new HealthBarDefinition();
                if (null != takeFile) {
                    if (b <= 75) {
                        throw new IllegalStateException();
                    }
                    healthBarDefinition3.decode(new Buffer(takeFile), (byte)85);
                }
                HealthBarDefinition.HealthBarDefinition_cached.put(healthBarDefinition3, n);
                healthBarDefinition2 = healthBarDefinition3;
            }
            final HealthBarDefinition healthBarDefinition4 = healthBarDefinition2;
            HealthBar healthBar = null;
            Node node = null;
            int n7 = healthBarDefinition4.int2 * 1525821745;
            int n8 = 0;
            HealthBar healthBar2 = (HealthBar)this.healthBars.up();
            while (healthBar2 != null) {
                if (b <= 75) {
                    throw new IllegalStateException();
                }
                ++n8;
                if (healthBar2.definition.field1521 * -431598869 == healthBarDefinition4.field1521 * -431598869) {
                    if (b <= 75) {
                        throw new IllegalStateException();
                    }
                    healthBar2.put(n4 + n2, n5, n6, n3, -869970014);
                    return;
                }
                else {
                    if (520914669 * healthBar2.definition.int1 <= 520914669 * healthBarDefinition4.int1) {
                        if (b <= 75) {
                            throw new IllegalStateException();
                        }
                        healthBar = healthBar2;
                    }
                    if (1525821745 * healthBar2.definition.int2 > n7) {
                        if (b <= 75) {
                            throw new IllegalStateException();
                        }
                        node = healthBar2;
                        n7 = 1525821745 * healthBar2.definition.int2;
                    }
                    healthBar2 = (HealthBar)this.healthBars.by();
                }
            }
            if (null == node) {
                if (b <= 75) {
                    throw new IllegalStateException();
                }
                if (n8 >= 4) {
                    if (b <= 75) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            final HealthBar healthBar3 = new HealthBar(healthBarDefinition4);
            if (healthBar == null) {
                if (b <= 75) {
                    return;
                }
                this.healthBars.addLast(healthBar3);
            }
            else {
                IterableNodeDeque.IterableNodeDeque_addBefore(healthBar3, healthBar);
            }
            healthBar3.put(n2 + n4, n5, n6, n3, -869970014);
            if (n8 >= 4) {
                if (b <= 75) {
                    throw new IllegalStateException();
                }
                node.hw();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.cz(" + ')');
        }
    }
    
    final void dr(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final HealthBarDefinition healthBarDefinition = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.wr(n);
        HealthBarDefinition healthBarDefinition2;
        if (null != healthBarDefinition) {
            healthBarDefinition2 = healthBarDefinition;
        }
        else {
            final byte[] takeFile = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, n, (byte)(-1));
            final HealthBarDefinition healthBarDefinition3 = new HealthBarDefinition();
            if (null != takeFile) {
                healthBarDefinition3.decode(new Buffer(takeFile), (byte)5);
            }
            HealthBarDefinition.HealthBarDefinition_cached.put(healthBarDefinition3, n);
            healthBarDefinition2 = healthBarDefinition3;
        }
        final HealthBarDefinition healthBarDefinition4 = healthBarDefinition2;
        Node node = null;
        Node node2 = null;
        int n7 = healthBarDefinition4.int2 * 1525821745;
        int n8 = 0;
        for (HealthBar healthBar = (HealthBar)this.healthBars.up(); healthBar != null; healthBar = (HealthBar)this.healthBars.by()) {
            ++n8;
            if (healthBar.definition.field1521 * -380549468 == healthBarDefinition4.field1521 * 552594223) {
                healthBar.put(n4 + n2, n5, n6, n3, -869970014);
                return;
            }
            if (-797036281 * healthBar.definition.int1 <= 1852898328 * healthBarDefinition4.int1) {
                node = healthBar;
            }
            if (1525821745 * healthBar.definition.int2 > n7) {
                node2 = healthBar;
                n7 = 1562385266 * healthBar.definition.int2;
            }
        }
        if (null == node2 && n8 >= 4) {
            return;
        }
        final HealthBar healthBar2 = new HealthBar(healthBarDefinition4);
        if (node == null) {
            this.healthBars.addLast(healthBar2);
        }
        else {
            IterableNodeDeque.IterableNodeDeque_addBefore(healthBar2, node);
        }
        healthBar2.put(n2 + n4, n5, n6, n3, -869970014);
        if (n8 >= 4) {
            node2.hw();
        }
    }
    
    public static void method538(final int n, final AbstractArchive musicTrackArchive, final int n2, final int n3, final int n4, final boolean musicTrackBoolean, final int n5) {
        try {
            class297.musicPlayerStatus = -626822165;
            class297.musicTrackArchive = musicTrackArchive;
            class379.musicTrackGroupId = n2 * -1643562499;
            VarpDefinition.musicTrackFileId = n3 * 1823837761;
            class100.musicTrackVolume = n4 * 111967803;
            class120.musicTrackBoolean = musicTrackBoolean;
            class162.pcmSampleLength = n * -1927001363;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.aq(" + ')');
        }
    }
    
    public int getPoseAnimationFrame() {
        return this.crawlBackSequence * 424813829;
    }
    
    public void setPoseAnimationFrame(final int n) {
        this.crawlBackSequence = n * 1348853709;
    }
    
    public int getCurrentOrientation() {
        return this.field986 * -1703696531;
    }
    
    public Point getCanvasSpriteLocation(final SpritePixels spritePixels, final int n) {
        return Perspective.getCanvasSpriteLocation((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation(), spritePixels, n);
    }
    
    public int getIdlePoseAnimation() {
        return this.sequenceFrameCycle * 1590591885;
    }
    
    public void setIdlePoseAnimation(final int n) {
        this.sequenceFrameCycle = n * 1196796229;
    }
    
    public Point getCanvasImageLocation(final BufferedImage bufferedImage, final int n) {
        return Perspective.getCanvasImageLocation((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation(), bufferedImage, n);
    }
    
    IterableNodeHashTable dg() {
        return this.graphics;
    }
    
    public int fu() {
        return this.walkBackSequence * 1144428983;
    }
    
    public WorldPoint getWorldLocation() {
        return WorldPoint.fromLocal((net.runelite.api.Client)ScriptFrame.client, this.zg()[0] * 128 + 64, this.ie()[0] * 128 + 64, ScriptFrame.client.getPlane());
    }
    
    public static IterableNodeHashTable qq(final Actor actor, final byte b) {
        if (actor == null) {
            return actor.method532(b);
        }
        try {
            return actor.graphics;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "de.ch(" + ')');
        }
    }
    
    public Point getCanvasTextLocation(final Graphics2D graphics2D, final String s, final int n) {
        return Perspective.getCanvasTextLocation((net.runelite.api.Client)ScriptFrame.client, graphics2D, this.getLocalLocation(), s, n);
    }
    
    public LocalPoint getLocalLocation() {
        return new LocalPoint(this.fu(), this.gk());
    }
    
    public Polygon getCanvasTilePoly() {
        return Perspective.getCanvasTilePoly((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation());
    }
    
    public Point getMinimapLocation() {
        return Perspective.localToMinimap((net.runelite.api.Client)ScriptFrame.client, this.getLocalLocation());
    }
    
    public void fq() {
        final GraphicChanged graphicChanged = new GraphicChanged();
        graphicChanged.setActor((net.runelite.api.Actor)this);
        ScriptFrame.client.getCallbacks().post((Object)graphicChanged);
    }
    
    public void zx(final int n, final int n2, final int n3, final int n4) {
        final GraphicChanged graphicChanged = new GraphicChanged();
        graphicChanged.setActor((net.runelite.api.Actor)this);
        ScriptFrame.client.getCallbacks().post((Object)graphicChanged);
    }
    
    public int[] zy() {
        return this.hitSplatTypes;
    }
    
    public int[] zg() {
        return this.hitSplatTypes2;
    }
    
    public void xf(final int i, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n4 == 0) {
            if (this.hb) {
                return;
            }
            if (!Actor.sk.contains(i)) {
                return;
            }
            this.hb = true;
            if (this == ScriptFrame.client.fv()) {
                Client.nw.debug("You died!");
            }
            ScriptFrame.client.getCallbacks().post((Object)new ActorDeath((net.runelite.api.Actor)this));
        }
        else if (n4 > 0) {
            if (this instanceof NPC && ((NPC)this).getId() == 319 && this.hb) {
                return;
            }
            this.hb = false;
        }
    }
    
    public int jh() {
        return this.rotation * 1005900761;
    }
    
    public void pz(final int n, final int n2, final int n3, final int n4) {
        this.updateGraphic(n, n2, n3, n4, 329491762);
    }
    
    public static void qv(final Actor actor) {
        final IterableNodeHashTableIterator iterableNodeHashTableIterator = new IterableNodeHashTableIterator(actor.graphics);
        for (Graphic graphic = (Graphic)iterableNodeHashTableIterator.method2390(); null != graphic; graphic = (Graphic)iterableNodeHashTableIterator.next()) {
            graphic.hw();
        }
        actor.runRightSequence = 0;
    }
    
    public void zr(final int n) {
        Client.fj(this);
    }
    
    public IterableNodeHashTable wz() {
        return this.graphics;
    }
    
    public int qz() {
        return this.field975 * -767724643;
    }
    
    void du() {
        final IterableNodeHashTableIterator iterableNodeHashTableIterator = new IterableNodeHashTableIterator(this.graphics);
        for (Graphic graphic = (Graphic)iterableNodeHashTableIterator.method2390(); null != graphic; graphic = (Graphic)iterableNodeHashTableIterator.next()) {
            graphic.hw();
        }
        this.runRightSequence = 0;
    }
    
    public net.runelite.api.Actor getInteracting() {
        final int jh = this.jh();
        if (jh == -1) {
            return null;
        }
        if (jh < 65536) {
            return (net.runelite.api.Actor)ScriptFrame.client.pb()[jh];
        }
        return (net.runelite.api.Actor)ScriptFrame.client.ic()[jh - 65536];
    }
    
    public int getAnimationFrame() {
        return this.currentSequenceFrameIndex * -41215169;
    }
    
    public int getAnimation() {
        final int n = this.overheadTextCyclesRemaining * -1372355773;
        switch (n) {
            case 7592:
            case 7593:
            case 7949:
            case 7950:
            case 7951:
            case 7952:
            case 7957:
            case 7960:
            case 8059:
            case 8123:
            case 8124:
            case 8125:
            case 8126:
            case 8127:
            case 8234:
            case 8235:
            case 8236:
            case 8237:
            case 8238:
            case 8241:
            case 8242:
            case 8243:
            case 8244:
            case 8245:
            case 8248:
            case 8249:
            case 8250:
            case 8251:
            case 8252:
            case 8255:
            case 8256:
            case 8257:
            case 8258: {
                return -1;
            }
            default: {
                return n;
            }
        }
    }
    
    public int getPoseAnimation() {
        return this.npcCycle * -1302441815;
    }
    
    public void setAnimationFrame(final int n) {
        this.currentSequenceFrameIndex = n * -63286081;
    }
    
    public void setWalkAnimation(final int n) {
        this.targetIndex = n * 1672510249;
    }
    
    public int getWalkRotateLeft() {
        return this.field985 * -127994241;
    }
    
    public void setWalkRotateRight(final int n) {
        this.recolourEndCycle = n * 1927855919;
    }
    
    public int getIdleRotateRight() {
        return this.exactMoveDirection * 1796560353;
    }
    
    public void setWalkRotate180(final int n) {
        this.runSequence = n * -1683505383;
    }
    
    public int getRunAnimation() {
        return this.field984 * 1939789287;
    }
    
    public boolean isInteracting() {
        return this.jh() != -1;
    }
    
    public void setIdleRotateRight(final int n) {
        this.exactMoveDirection = n * -603869663;
    }
    
    public void setWalkRotateLeft(final int n) {
        this.field985 = n * 497469823;
    }
    
    public void setRunAnimation(final int n) {
        this.field984 = n * 140602839;
    }
    
    public int getHealthScale() {
        final IterableNodeDeque ry = this.ry();
        if (ry != null) {
            final Node pt = ry.ap().pt();
            if (pt instanceof HealthBar) {
                return ((HealthBar)pt).wv().ij();
            }
        }
        return -1;
    }
    
    public int getWalkRotate180() {
        return this.runSequence * 1648569641;
    }
    
    public IterableHashTable getSpotAnims() {
        return (IterableHashTable)this.wz();
    }
    
    public boolean hasSpotAnim(final int n) {
        final Iterator iterator = this.wz().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == n) {
                return true;
            }
        }
        return false;
    }
    
    public int getWalkRotateRight() {
        return this.recolourEndCycle * -1059657777;
    }
    
    public void createSpotAnim(final int n, final int n2, final int n3, final int n4) {
        final IterableNodeHashTable wz = this.wz();
        final Graphic graphic = (Graphic)wz.get((long)n);
        if (graphic != null) {
            graphic.gy();
            this.runRightSequence = (this.runRightSequence * -500494421 - 1) * -1822461181;
        }
        if (n2 != -1) {
            int n5 = 0;
            if (n4 > 0) {
                n5 = -1;
            }
            wz.put((net.runelite.api.Node)this.pd(n2, n3, ScriptFrame.client.getGameCycle() + n4, n5), n);
            this.runRightSequence = (this.runRightSequence * -500494421 + 1) * -1822461181;
        }
    }
    
    @Deprecated
    public void setActionFrame(final int n) {
        this.currentSequenceFrameIndex = n * -63286081;
    }
    
    public void setAnimation(final int n) {
        this.overheadTextCyclesRemaining = n * -1690721941;
    }
    
    public void removeSpotAnim(final int n) {
        final Graphic graphic = (Graphic)this.wz().get((long)n);
        if (graphic != null) {
            graphic.gy();
            this.runRightSequence = (this.runRightSequence * -500494421 - 1) * -1822461181;
        }
    }
    
    public int getIdleRotateLeft() {
        return this.crawlRightSequence * 1319769839;
    }
    
    public void clearSpotAnims() {
        this.wz().hq();
        this.runRightSequence = 0 * -1822461181;
    }
    
    public int getGraphic() {
        final Iterator iterator = this.wz().iterator();
        if (iterator.hasNext()) {
            return iterator.next().getId();
        }
        return -1;
    }
    
    public int getHealthRatio() {
        final IterableNodeDeque ry = this.ry();
        if (ry != null) {
            final Node pt = ry.ap().pt();
            if (pt instanceof HealthBar) {
                final Node pt2 = ((HealthBar)pt).vc().ap().pt();
                if (pt2 instanceof HealthBarUpdate) {
                    return ((HealthBarUpdate)pt2).tg();
                }
            }
        }
        return -1;
    }
    
    public void setPoseAnimation(final int n) {
        this.npcCycle = n * 327373721;
    }
    
    public void setIdleRotateLeft(final int n) {
        this.crawlRightSequence = n * -767436785;
    }
    
    public int getWalkAnimation() {
        return this.targetIndex * 736907545;
    }
    
    public void setOverheadText(final String overheadText) {
        this.overheadText = overheadText;
    }
    
    public int getGraphicHeight() {
        final Iterator iterator = this.wz().iterator();
        if (iterator.hasNext()) {
            return iterator.next().getHeight();
        }
        return 0;
    }
    
    public void setSpotAnimFrame(final int frame) {
        final Iterator iterator = this.wz().iterator();
        if (iterator.hasNext()) {
            iterator.next().setFrame(frame);
        }
    }
    
    public WorldArea getWorldArea() {
        int size = 1;
        if (this instanceof net.runelite.api.NPC) {
            NPCComposition npcComposition = ((net.runelite.api.NPC)this).getComposition();
            if (npcComposition != null && npcComposition.getConfigs() != null) {
                npcComposition = npcComposition.transform();
            }
            if (npcComposition != null) {
                size = npcComposition.getSize();
            }
        }
        return new WorldArea(this.getWorldLocation(), size, size);
    }
    
    public int getOverheadCycle() {
        return this.spotAnimation * -536830723;
    }
    
    public void setGraphicHeight(final int height) {
        final Iterator iterator = this.wz().iterator();
        if (iterator.hasNext()) {
            iterator.next().setHeight(height);
        }
    }
    
    public boolean isDead() {
        return this.hb;
    }
    
    public int getLogicalHeight() {
        return this.sequenceFrame * -767387641;
    }
    
    public void setDead(final boolean hb) {
        this.hb = hb;
    }
    
    public void setOverheadCycle(final int n) {
        this.spotAnimation = n * 1655791701;
    }
    
    public void setGraphic(final int id) {
        if (id == -1) {
            this.wz().hq();
            this.runRightSequence = 0 * -1822461181;
            return;
        }
        final Iterator iterator = this.wz().iterator();
        if (iterator.hasNext()) {
            iterator.next().setId(id);
            return;
        }
        this.wz().put((net.runelite.api.Node)this.pd(id, 0, 0, 0), 0L);
        this.runRightSequence = (this.runRightSequence * -500494421 + 1) * -1822461181;
    }
    
    public String getOverheadText() {
        return this.overheadText;
    }
    
    public int getSpotAnimFrame() {
        final Iterator iterator = this.wz().iterator();
        if (iterator.hasNext()) {
            return iterator.next().getFrame();
        }
        return 0;
    }
}
