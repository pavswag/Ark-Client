import net.runelite.api.IterableHashTable;
import net.runelite.api.ParamHolder;

// 
// Decompiled by Procyon v0.5.36
// 

public class StructComposition extends DualNode implements ParamHolder, net.runelite.api.StructComposition
{
    static final int de = 10;
    static AbstractArchive StructDefinition_archive;
    IterableNodeHashTable params;
    public int mg;
    static EvictingDualNodeHashTable StructDefinition_cached;
    static final int aq = 3;
    
    StructComposition() {
        this.mg = -1;
    }
    
    static {
        StructComposition.StructDefinition_cached = new EvictingDualNodeHashTable(64);
    }
    
    public static void ad() {
        StructComposition.StructDefinition_cached.clear();
    }
    
    public static void ae() {
        StructComposition.StructDefinition_cached.clear();
    }
    
    public int getId() {
        return this.mg;
    }
    
    public void setValue(final int n, final int n2) {
        this.gd(n, ScriptFrame.client.xq(n2));
    }
    
    public void setValue(final int n, final String s) {
        this.gd(n, ScriptFrame.client.jh(s));
    }
    
    public static StructComposition ao(final int n) {
        final StructComposition structComposition = (StructComposition)StructComposition.StructDefinition_cached.wr(n);
        if (null != structComposition) {
            return structComposition;
        }
        final byte[] takeFile = StructComposition.StructDefinition_archive.takeFile(34, n, (byte)(-125));
        final StructComposition structComposition2 = new StructComposition();
        if (null != takeFile) {
            gi(structComposition2, new Buffer(takeFile), -560752221);
        }
        iw(structComposition2, -1436129588);
        StructComposition.StructDefinition_cached.put(structComposition2, n);
        return structComposition2;
    }
    
    public static void at(final AbstractArchive structDefinition_archive) {
        StructComposition.StructDefinition_archive = structDefinition_archive;
    }
    
    void av(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            co(this, buffer, ra, 209402697);
        }
    }
    
    void as(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                co(this, buffer, ra, -1196220711);
            }
            if (n >= 2124221074) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ht.ac(" + ')');
        }
    }
    
    public int az(final int n, final int n2) {
        final IterableNodeHashTable params = this.params;
        int integer;
        if (params == null) {
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
    
    void ax() {
    }
    
    public static void ay(final AbstractArchive structDefinition_archive) {
        StructComposition.StructDefinition_archive = structDefinition_archive;
    }
    
    public Node ie(final int n) {
        if (this.getParams() == null) {
            return null;
        }
        return (Node)this.getParams().get((long)n);
    }
    
    void postDecode(final int n) {
    }
    
    static int method1070(int n, final Script script, final boolean b, final int n2) {
        try {
            boolean b2 = true;
            Widget vmethod3380;
            if (n >= 2000) {
                n -= 1000;
                vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
                b2 = false;
            }
            else {
                Widget widget;
                if (b) {
                    if (n2 >= -964267539) {
                        throw new IllegalStateException();
                    }
                    widget = SoundSystem.scriptDotWidget;
                }
                else {
                    widget = class1.scriptActiveWidget;
                }
                vmethod3380 = widget;
            }
            if (1300 == n) {
                if (n2 >= -964267539) {
                    throw new IllegalStateException();
                }
                final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
                if (n3 >= 0) {
                    if (n2 >= -964267539) {
                        throw new IllegalStateException();
                    }
                    if (n3 <= 9) {
                        Widget.fm(vmethod3380, n3, Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987], (byte)2);
                        return 1;
                    }
                    if (n2 >= -964267539) {
                        throw new IllegalStateException();
                    }
                }
                SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                return 1;
            }
            else if (n == 1301) {
                if (n2 >= -964267539) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                vmethod3380.parent = SoundSystem.getWidgetChild(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539], 1600705235);
                return 1;
            }
            else if (1302 == n) {
                if (n2 >= -964267539) {
                    throw new IllegalStateException();
                }
                final Widget widget2 = vmethod3380;
                boolean spriteFlipH;
                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                    if (n2 >= -964267539) {
                        throw new IllegalStateException();
                    }
                    spriteFlipH = true;
                }
                else {
                    spriteFlipH = false;
                }
                widget2.spriteFlipH = spriteFlipH;
                return 1;
            }
            else if (n == 1303) {
                if (n2 >= -964267539) {
                    throw new IllegalStateException();
                }
                vmethod3380.dragZoneSize = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1773001161;
                return 1;
            }
            else if (n == 1304) {
                if (n2 >= -964267539) {
                    throw new IllegalStateException();
                }
                vmethod3380.dragThreshold = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 1466803237;
                return 1;
            }
            else if (n == 1305) {
                if (n2 >= -964267539) {
                    throw new IllegalStateException();
                }
                vmethod3380.field3004 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            else if (n == 1306) {
                if (n2 >= -964267539) {
                    throw new IllegalStateException();
                }
                vmethod3380.text2 = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                return 1;
            }
            else if (1307 == n) {
                if (n2 >= -964267539) {
                    throw new IllegalStateException();
                }
                vmethod3380.actions = null;
                return 1;
            }
            else {
                if (n == 1308) {
                    vmethod3380.field2969 = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                    return 1;
                }
                if (1309 == n) {
                    Interpreter.Interpreter_intStackSize -= 427135973;
                    return 1;
                }
                if (1350 == n) {
                    if (n2 >= -964267539) {
                        throw new IllegalStateException();
                    }
                    byte[] array = null;
                    byte[] array2 = null;
                    if (b2) {
                        if (n2 >= -964267539) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStackSize += 23607566;
                        int i = 0;
                        while (i < 10) {
                            if (n2 >= -964267539) {
                                throw new IllegalStateException();
                            }
                            if (Interpreter.Interpreter_intStack[i + -964267539 * Interpreter.Interpreter_intStackSize] < 0) {
                                if (n2 >= -964267539) {
                                    throw new IllegalStateException();
                                }
                                break;
                            }
                            else {
                                i += 2;
                            }
                        }
                        if (i > 0) {
                            array = new byte[i / 2];
                            array2 = new byte[i / 2];
                            for (i -= 2; i >= 0; i -= 2) {
                                array[i / 2] = (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + i];
                                array2[i / 2] = (byte)Interpreter.Interpreter_intStack[1 + (-964267539 * Interpreter.Interpreter_intStackSize + i)];
                            }
                        }
                    }
                    else {
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        array = new byte[] { (byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] };
                        array2 = new byte[] { (byte)Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] };
                    }
                    final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] - 1;
                    if (n4 >= 0) {
                        if (n2 >= -964267539) {
                            throw new IllegalStateException();
                        }
                        if (n4 <= 9) {
                            class7.Widget_setKey(vmethod3380, n4, array, array2, 71833059);
                            return 1;
                        }
                        if (n2 >= -964267539) {
                            throw new IllegalStateException();
                        }
                    }
                    throw new RuntimeException();
                }
                else if (1351 == n) {
                    if (n2 >= -964267539) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    class7.Widget_setKey(vmethod3380, 10, new byte[] { (byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] }, new byte[] { (byte)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1] }, 1887295232);
                    return 1;
                }
                else if (1352 == n) {
                    if (n2 >= -964267539) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStackSize -= 1281407919;
                    final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                    final int n6 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                    final int n7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 2];
                    if (n5 >= 0) {
                        if (n2 >= -964267539) {
                            throw new IllegalStateException();
                        }
                        if (n5 <= 9) {
                            class68.Widget_setKeyRate(vmethod3380, n5, n6, n7, -1038667453);
                            return 1;
                        }
                        if (n2 >= -964267539) {
                            throw new IllegalStateException();
                        }
                    }
                    throw new RuntimeException();
                }
                else if (n == 1353) {
                    if (n2 >= -964267539) {
                        throw new IllegalStateException();
                    }
                    class68.Widget_setKeyRate(vmethod3380, 10, Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -635612095);
                    return 1;
                }
                else {
                    if (n == 1354) {
                        Interpreter.Interpreter_intStackSize -= 427135973;
                        final int n8 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize] - 1;
                        if (n8 >= 0) {
                            if (n2 >= -964267539) {
                                throw new IllegalStateException();
                            }
                            if (n8 <= 9) {
                                ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, n8, (byte)(-105));
                                return 1;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (1355 != n) {
                        return 2;
                    }
                    if (n2 >= -964267539) {
                        throw new IllegalStateException();
                    }
                    ModeWhere.Widget_setKeyIgnoreHeld(vmethod3380, 10, (byte)17);
                    return 1;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ht.al(" + ')');
        }
    }
    
    public static int method1071(final int n, final int n2) {
        try {
            return n >> 17 & 0x7;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ht.an(" + ')');
        }
    }
    
    void decode(final Buffer buffer, final int n) {
        if (n == 249) {
            this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-15));
        }
    }
    
    public void gd(final int n, final Node node) {
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
    
    public static void iw(final StructComposition structComposition, final int n) {
        if (structComposition == null) {
            structComposition.postDecode(n);
        }
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2) {
        try {
            if (n == 249) {
                if (n2 >= 935514660) {
                    throw new IllegalStateException();
                }
                this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-113));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ht.au(" + ')');
        }
    }
    
    public static void aa(final AbstractArchive structDefinition_archive) {
        StructComposition.StructDefinition_archive = structDefinition_archive;
    }
    
    public IterableHashTable getParams() {
        return (IterableHashTable)this.params;
    }
    
    void ai() {
    }
    
    public static void gi(final StructComposition structComposition, final Buffer buffer, final int n) {
        if (structComposition == null) {
            structComposition.as(buffer, n);
            return;
        }
        Label_0011: {
            break Label_0011;
            try {
                while (true) {
                    final int ra = Buffer.ra(buffer, (byte)7);
                    if (ra == 0) {
                        break;
                    }
                    co(structComposition, buffer, ra, -1196220711);
                }
                if (n >= 2124221074) {
                    throw new IllegalStateException();
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ht.ac(" + ')');
            }
        }
    }
    
    void ar(final Buffer buffer, final int n) {
        if (n == 249) {
            this.params = ChatChannel.addMessage(buffer, this.params, (byte)(-16));
        }
    }
    
    public static void co(final StructComposition structComposition, final Buffer buffer, final int n, final int n2) {
        if (structComposition == null) {
            structComposition.decodeNext(buffer, n, n);
            return;
        }
        try {
            if (n == 249) {
                if (n2 >= 935514660) {
                    throw new IllegalStateException();
                }
                structComposition.params = ChatChannel.addMessage(buffer, structComposition.params, (byte)(-113));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ht.au(" + ')');
        }
    }
    
    public static class356 findEnumerated(final class356[] array, final int n, final short n2) {
        try {
            int i = 0;
            while (i < array.length) {
                final class356 class356 = array[i];
                if (n == class356.rsOrdinal(741942848)) {
                    if (n2 != 173) {
                        throw new IllegalStateException();
                    }
                    return class356;
                }
                else {
                    ++i;
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ht.af(" + ')');
        }
    }
    
    static void findEnumerated(final byte b) {
        try {
            for (ObjectSound objectSound = (ObjectSound)ObjectSound.objectSounds.last(); null != objectSound; objectSound = (ObjectSound)ObjectSound.objectSounds.previous()) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                if (objectSound.stream2 != null) {
                    if (b != 1) {
                        return;
                    }
                    class130.pcmStreamMixer.removeSubStream(objectSound.stream2);
                    objectSound.stream2 = null;
                }
                if (null != objectSound.stream1) {
                    if (b != 1) {
                        throw new IllegalStateException();
                    }
                    class130.pcmStreamMixer.removeSubStream(objectSound.stream1);
                    objectSound.stream1 = null;
                }
            }
            NodeDeque.la(ObjectSound.objectSounds);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ht.af(" + ')');
        }
    }
    
    public int getIntParam(final int n, final int n2, final byte b) {
        try {
            final IterableNodeHashTable params = this.params;
            int integer;
            if (params == null) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                integer = n2;
            }
            else {
                final IntegerNode integerNode = (IntegerNode)params.aa(n);
                if (null == integerNode) {
                    if (b >= 0) {
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
            throw HealthBar.get(ex, "ht.ab(" + ')');
        }
    }
    
    public String getStringParam(final int n, final String s, final int n2) {
        try {
            return EnumComposition.method1014(this.params, n, s, 1493473883);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ht.aq(" + ')');
        }
    }
    
    public int aj(final int n, final int n2) {
        final IterableNodeHashTable params = this.params;
        int integer;
        if (params == null) {
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
    
    void ag() {
    }
    
    public String getStringValue(final int n) {
        final Node ie = this.ie(n);
        if (ie != null) {
            return (String)((ObjectNode)ie).by();
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
        final Node ie = this.ie(n);
        if (ie != null) {
            return ((IntegerNode)ie).getValue();
        }
        final ParamComposition xa = ScriptFrame.client.xa(n);
        if (xa.zx()) {
            throw new IllegalArgumentException("trying to get int from string param");
        }
        return xa.wl();
    }
    
    void ah(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            co(this, buffer, ra, 471598402);
        }
    }
}
