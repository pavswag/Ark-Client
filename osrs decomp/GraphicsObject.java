import net.runelite.api.Animation;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.coords.LocalPoint;

// 
// Decompiled by Procyon v0.5.36
// 

public class GraphicsObject extends Renderable implements net.runelite.api.GraphicsObject
{
    int frameCycle;
    int cycleStart;
    int plane;
    boolean isFinished;
    int y;
    int z;
    SequenceDefinition sequenceDefinition;
    int x;
    int id;
    int frame;
    static boolean ClanChat_inClanChat;
    public static final int am = 1;
    
    public GraphicsObject() {
    }
    
    GraphicsObject(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this.frame = 0;
        this.frameCycle = 0;
        this.isFinished = false;
        this.id = n * -1726780687;
        this.plane = 1295796889 * n2;
        this.x = n3 * -620581055;
        this.y = -652580511 * n4;
        this.z = 186790935 * n5;
        this.cycleStart = 1889540095 * (n7 + n6);
        final int n8 = ItemContainer.SpotAnimationDefinition_get(-1107802607 * this.id, 1435340581).sequence * 374130911;
        if (n8 != -1) {
            this.isFinished = false;
            this.sequenceDefinition = ItemContainer.SpotAnimationDefinition_get(n8, (byte)52);
        }
        else {
            this.isFinished = true;
        }
        this.xr();
    }
    
    public static void to(final GraphicsObject graphicsObject, final int n) {
        if (graphicsObject.isFinished) {
            return;
        }
        graphicsObject.frameCycle += n * 735964010;
        if (!graphicsObject.sequenceDefinition.isCachedModelIdSet(-1555634472)) {
            while (graphicsObject.frameCycle * 770512108 > graphicsObject.sequenceDefinition.frameLengths[graphicsObject.frame * 1976896309]) {
                graphicsObject.frameCycle -= graphicsObject.sequenceDefinition.frameLengths[257322877 * graphicsObject.frame] * 1582072345;
                graphicsObject.frame -= 267696178;
                if (158616165 * graphicsObject.frame >= graphicsObject.sequenceDefinition.frameIds.length) {
                    graphicsObject.isFinished = true;
                    break;
                }
            }
        }
        else {
            graphicsObject.frame += n * -976513309;
            if (graphicsObject.frame * 158616165 >= graphicsObject.sequenceDefinition.method1128(-750177324)) {
                graphicsObject.isFinished = true;
            }
        }
    }
    
    public LocalPoint getLocation() {
        return new LocalPoint(this.jn(), this.wk());
    }
    
    public int getId() {
        return this.id * -1107802607;
    }
    
    public static void cv(final GraphicsObject graphicsObject, final int n) {
        if (graphicsObject.isFinished) {
            return;
        }
        graphicsObject.frameCycle += n * -1180781567;
        if (!graphicsObject.sequenceDefinition.isCachedModelIdSet(-1813380146)) {
            while (graphicsObject.frameCycle * -1243891993 > graphicsObject.sequenceDefinition.frameLengths[graphicsObject.frame * 158616165]) {
                graphicsObject.frameCycle -= graphicsObject.sequenceDefinition.frameLengths[158616165 * graphicsObject.frame] * -1521037169;
                graphicsObject.frame += 639915885;
                if (417765595 * graphicsObject.frame >= graphicsObject.sequenceDefinition.frameIds.length) {
                    graphicsObject.isFinished = true;
                    break;
                }
            }
        }
        else {
            graphicsObject.frame += n * 639915885;
            if (graphicsObject.frame * 1632887508 >= graphicsObject.sequenceDefinition.method1128(1442750497)) {
                graphicsObject.isFinished = true;
            }
        }
    }
    
    static final void method429(final long n) {
        try {
            ViewportMouse.ViewportMouse_entityTags[(ViewportMouse.ViewportMouse_entityCount -= 429048361) * -1048050201 - 1] = n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cx.ao(" + ')');
        }
    }
    
    static final void method433(int n, int n2, final byte b) {
        try {
            if (n < 128) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                n = 128;
            }
            else if (n > 383) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                n = 383;
            }
            if (1897923909 * WorldMapSectionType.cameraPitch < n) {
                WorldMapSectionType.cameraPitch += 528729485 * (WorldMapElement.field1503 * 942361787 * (n - WorldMapSectionType.cameraPitch * 1897923909) / 1000 + 1039880989 * Archive.field3467);
                Client.bc(-1);
                if (1897923909 * WorldMapSectionType.cameraPitch > n) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    WorldMapSectionType.cameraPitch = 528729485 * n;
                    Client.bc(-1);
                }
            }
            else if (1897923909 * WorldMapSectionType.cameraPitch > n) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                WorldMapSectionType.cameraPitch -= (WorldMapElement.field1503 * 942361787 * (WorldMapSectionType.cameraPitch * 1897923909 - n) / 1000 + Archive.field3467 * 1039880989) * 528729485;
                Client.bc(-1);
                if (WorldMapSectionType.cameraPitch * 1897923909 < n) {
                    if (b <= 0) {
                        return;
                    }
                    WorldMapSectionType.cameraPitch = n * 528729485;
                    Client.bc(-1);
                }
            }
            n2 &= 0x7FF;
            int n3 = n2 - class125.cameraYaw * -1010818347;
            if (n3 > 1024) {
                n3 -= 2048;
            }
            else if (n3 < -1024) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                n3 += 2048;
            }
            if (n3 > 0) {
                class125.cameraYaw += -1545206147 * (n3 * (942361787 * WorldMapElement.field1503) / 1000 + 1039880989 * Archive.field3467);
                class125.cameraYaw = (class125.cameraYaw * -1010818347 & 0x7FF) * -1545206147;
            }
            else if (n3 < 0) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                class125.cameraYaw -= -1545206147 * (1039880989 * Archive.field3467 + -n3 * (942361787 * WorldMapElement.field1503) / 1000);
                class125.cameraYaw = (class125.cameraYaw * -1010818347 & 0x7FF) * -1545206147;
            }
            int n4 = n2 - class125.cameraYaw * -1010818347;
            if (n4 > 1024) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                n4 -= 2048;
            }
            else if (n4 < -1024) {
                n4 += 2048;
            }
            Label_0535: {
                if (n4 < 0) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    if (n3 > 0) {
                        break Label_0535;
                    }
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                }
                if (n4 <= 0 || n3 >= 0) {
                    return;
                }
                if (b <= 0) {
                    throw new IllegalStateException();
                }
            }
            class125.cameraYaw = n2 * -1545206147;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cx.is(" + ')');
        }
    }
    
    public void hn(final int n) {
        this.x = n * -620581055;
    }
    
    public void dt(final int n) {
        final int n2 = -34;
        try {
            if (this.isFinished) {
                if (n2 >= 1) {}
            }
            else {
                this.frameCycle += n * -1521037169;
                if (!this.sequenceDefinition.isCachedModelIdSet(1292413671)) {
                    if (n2 >= 1) {
                        throw new IllegalStateException();
                    }
                    while (this.frameCycle * -1355788689 > this.sequenceDefinition.frameLengths[this.frame * 158616165]) {
                        if (n2 >= 1) {
                            throw new IllegalStateException();
                        }
                        this.frameCycle -= this.sequenceDefinition.frameLengths[158616165 * this.frame] * -1521037169;
                        this.frame += 639915885;
                        if (158616165 * this.frame < this.sequenceDefinition.frameIds.length) {
                            continue;
                        }
                        if (n2 >= 1) {
                            break;
                        }
                        this.isFinished = true;
                        break;
                    }
                }
                else {
                    this.frame += n * 639915885;
                    if (this.frame * 158616165 >= this.sequenceDefinition.method1128(-1150407276)) {
                        if (n2 >= 1) {
                            throw new IllegalStateException();
                        }
                        this.isFinished = true;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cx.af(" + ')');
        }
    }
    
    @Override
    protected final Model al() {
        final SpotAnimationDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(-1107802607 * this.id, 1487649072);
        Model model;
        if (!this.isFinished) {
            model = spotAnimationDefinition_get.getModel(137446941 * this.frame, 904021857);
        }
        else {
            model = spotAnimationDefinition_get.getModel(-1, -691670703);
        }
        if (model == null) {
            return null;
        }
        return model;
    }
    
    public static int dm(final IterableNodeDeque iterableNodeDeque) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.ap();
        }
        int n = 0;
        for (Node node = iterableNodeDeque.sentinel.previous; node != iterableNodeDeque.sentinel; node = node.previous) {
            ++n;
        }
        return n;
    }
    
    @Override
    protected final Model getModel(final byte b) {
        return this.fa();
    }
    
    public static void getModel(final short n) {
        try {
            if (MouseHandler.MouseHandler_instance != null) {
                if (n != 152) {
                    throw new IllegalStateException();
                }
                synchronized (MouseHandler.MouseHandler_instance) {
                    MouseHandler.MouseHandler_instance = null;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cx.an(" + ')');
        }
    }
    
    public int getLevel() {
        return this.plane * 397044137;
    }
    
    public boolean finished() {
        return this.isFinished;
    }
    
    public void pi(final int n) {
        this.y = n * -652580511;
    }
    
    public Model fa() {
        final int n = -112;
        Model model2;
        try {
            final SpotAnimationDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(-1107802607 * this.id, 1610312952);
            Model model;
            if (!this.isFinished) {
                if (n >= 14) {
                    throw new IllegalStateException();
                }
                model = spotAnimationDefinition_get.getModel(158616165 * this.frame, -1066689699);
            }
            else {
                model = spotAnimationDefinition_get.getModel(-1, -475437354);
            }
            model2 = ((model == null) ? null : model);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cx.an(" + ')');
        }
        return model2;
    }
    
    @Override
    protected final Model au() {
        final SpotAnimationDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(-1107802607 * this.id, 197066114);
        Model model;
        if (!this.isFinished) {
            model = spotAnimationDefinition_get.getModel(158616165 * this.frame, -547956671);
        }
        else {
            model = spotAnimationDefinition_get.getModel(-1, 1677567410);
        }
        if (model == null) {
            return null;
        }
        return model;
    }
    
    final void advance(final int n, final byte b) {
        this.dt(n);
    }
    
    @Override
    protected final Model ab() {
        final SpotAnimationDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(-396197054 * this.id, -514724979);
        Model model;
        if (!this.isFinished) {
            model = spotAnimationDefinition_get.getModel(392700909 * this.frame, -263321838);
        }
        else {
            model = spotAnimationDefinition_get.getModel(-1, -1862547635);
        }
        if (model == null) {
            return null;
        }
        return model;
    }
    
    @Override
    protected final Model aq() {
        final SpotAnimationDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(-1107802607 * this.id, 2030099362);
        Model model;
        if (!this.isFinished) {
            model = spotAnimationDefinition_get.getModel(158616165 * this.frame, 1485185385);
        }
        else {
            model = spotAnimationDefinition_get.getModel(-1, 935601683);
        }
        if (model == null) {
            return null;
        }
        return model;
    }
    
    public static int od(final GrandExchangeOfferOwnWorldComparator grandExchangeOfferOwnWorldComparator, final Object o, final Object o2) {
        if (grandExchangeOfferOwnWorldComparator == null) {
            return grandExchangeOfferOwnWorldComparator.aq(o, o);
        }
        return grandExchangeOfferOwnWorldComparator.compare_bridged((GrandExchangeEvent)o, (GrandExchangeEvent)o2, (byte)3);
    }
    
    public int getZ() {
        return this.z * -769506393;
    }
    
    public int jn() {
        return this.x * -1570643775;
    }
    
    public SequenceDefinition yz() {
        return this.sequenceDefinition;
    }
    
    public void xr() {
        ScriptFrame.client.getCallbacks().post((Object)new GraphicsObjectCreated((net.runelite.api.GraphicsObject)this));
    }
    
    public int wk() {
        return this.y * -161744223;
    }
    
    public int getStartCycle() {
        return this.cycleStart * -1927288833;
    }
    
    public int getAnimationFrame() {
        return this.frame * 158616165;
    }
    
    public void setFinished(final boolean isFinished) {
        this.isFinished = isFinished;
    }
}
