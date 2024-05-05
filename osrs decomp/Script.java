// 
// Decompiled by Procyon v0.5.36
// 

public class Script extends DualNode implements net.runelite.api.Script
{
    String field794;
    static final int by = 0;
    int[] opcodes;
    int[] intOperands;
    String[] stringOperands;
    int localIntCount;
    int localStringCount;
    int stringArgumentCount;
    int intArgumentCount;
    IterableNodeHashTable[] switches;
    static EvictingDualNodeHashTable Script_cached;
    public static NetFileRequest NetCache_currentResponse;
    
    Script() {
    }
    
    static {
        Script.Script_cached = new EvictingDualNodeHashTable(128);
    }
    
    public int dp() {
        return this.stringArgumentCount * 1178893217;
    }
    
    public int bw() {
        return this.intArgumentCount * -1203198865;
    }
    
    static Script ao(final int i, final int n) {
        final Script script = (Script)Script.Script_cached.wr(i << 16);
        if (script != null) {
            return script;
        }
        final int fileFlat = AbstractArchive.getFileFlat(class126.archive12, String.valueOf(i), 527870709);
        if (fileFlat == -1) {
            return null;
        }
        final byte[] sh = AbstractArchive.sh(class126.archive12, fileFlat, (byte)(-10));
        if (sh != null) {
            if (sh.length <= 1) {
                return null;
            }
            final Script script2 = class33.newScript(sh, (byte)1);
            if (script2 != null) {
                Script.Script_cached.put(script2, i << 16);
                return script2;
            }
        }
        return null;
    }
    
    static Script at(final int n, final int n2, final int n3) {
        final Script postDecode = ObjectComposition.postDecode((n2 << 8) + n, n, (byte)(-77));
        if (null != postDecode) {
            return postDecode;
        }
        final int method1527 = class262.method1527(n3, n, 1975379723);
        final Script script = (Script)Script.Script_cached.wr(method1527 << 16);
        Script script2 = null;
        Label_0143: {
            if (null != script) {
                script2 = script;
            }
            else {
                final int fileFlat = AbstractArchive.getFileFlat(class126.archive12, String.valueOf(method1527), 1363244126);
                if (-1 == fileFlat) {
                    script2 = null;
                }
                else {
                    final byte[] sh = AbstractArchive.sh(class126.archive12, fileFlat, (byte)(-7));
                    if (null != sh) {
                        if (sh.length <= 1) {
                            script2 = null;
                            break Label_0143;
                        }
                        final Script script3 = class33.newScript(sh, (byte)1);
                        if (script3 != null) {
                            Script.Script_cached.put(script3, method1527 << 16);
                            script2 = script3;
                            break Label_0143;
                        }
                    }
                    script2 = null;
                }
            }
        }
        final Script script4 = script2;
        if (script4 != null) {
            return script4;
        }
        return null;
    }
    
    static Script ax(final byte[] array) {
        final Script script = new Script();
        final Buffer buffer = new Buffer(array);
        buffer.offset = -1516355947 * (buffer.array.length - 2);
        final int n = buffer.array.length - 2 - buffer.readUnsignedShort(-1933172346) - 12;
        buffer.offset = -1516355947 * n;
        final int int1 = buffer.readInt(-1026781034);
        script.localIntCount = buffer.readUnsignedShort(-1020926575) * -140315817;
        script.localStringCount = buffer.readUnsignedShort(-1183288665) * -1816416047;
        script.intArgumentCount = buffer.readUnsignedShort(-2106316872) * -603637105;
        script.stringArgumentCount = buffer.readUnsignedShort(227086029) * -751032223;
        final int ra = Buffer.ra(buffer, (byte)7);
        if (ra > 0) {
            script.switches = script.newIterableNodeHashTable(ra, 2033492127);
            for (int i = 0; i < ra; ++i) {
                int unsignedShort = buffer.readUnsignedShort(-1127780228);
                final IterableNodeHashTable iterableNodeHashTable = new IterableNodeHashTable((unsignedShort > 0) ? class70.method442(unsignedShort, 1496826272) : 1);
                script.switches[i] = iterableNodeHashTable;
                while (unsignedShort-- > 0) {
                    iterableNodeHashTable.put(new IntegerNode(buffer.readInt(-1040808599)), buffer.readInt(-2016324961));
                }
            }
        }
        buffer.offset = 0;
        script.field794 = buffer.readStringCp1252NullTerminatedOrNull((byte)15);
        script.opcodes = new int[int1];
        script.intOperands = new int[int1];
        script.stringOperands = new String[int1];
        int n2 = 0;
        while (-1633313603 * buffer.offset < n) {
            final int unsignedShort2 = buffer.readUnsignedShort(192156296);
            if (unsignedShort2 == 3) {
                script.stringOperands[n2] = buffer.readStringCp1252NullTerminated((byte)0);
            }
            else if (unsignedShort2 < 100 && unsignedShort2 != 21 && unsignedShort2 != 38 && 39 != unsignedShort2) {
                script.intOperands[n2] = buffer.readInt(-1112135350);
            }
            else {
                script.intOperands[n2] = Buffer.ra(buffer, (byte)7);
            }
            script.opcodes[n2++] = unsignedShort2;
        }
        return script;
    }
    
    static Script ay(final int i, final int n) {
        final Script script = (Script)Script.Script_cached.wr(i << 16);
        if (script != null) {
            return script;
        }
        final int fileFlat = AbstractArchive.getFileFlat(class126.archive12, String.valueOf(i), 1709856093);
        if (fileFlat == -1) {
            return null;
        }
        final byte[] sh = AbstractArchive.sh(class126.archive12, fileFlat, (byte)(-29));
        if (sh != null) {
            if (sh.length <= 1) {
                return null;
            }
            final Script script2 = class33.newScript(sh, (byte)1);
            if (script2 != null) {
                Script.Script_cached.put(script2, i << 16);
                return script2;
            }
        }
        return null;
    }
    
    static Script al(final int n, final int n2, final int n3) {
        final Script postDecode = ObjectComposition.postDecode((n2 << 8) + n, n, (byte)(-42));
        if (null != postDecode) {
            return postDecode;
        }
        final int method1527 = class262.method1527(n3, n, 710526576);
        final Script script = (Script)Script.Script_cached.wr(method1527 << 16);
        Script script2 = null;
        Label_0198: {
            if (null != script) {
                script2 = script;
            }
            else {
                final int fileFlat = AbstractArchive.getFileFlat(class126.archive12, String.valueOf(method1527), -109322301);
                if (-1 == fileFlat) {
                    script2 = null;
                }
                else {
                    final byte[] sh = AbstractArchive.sh(class126.archive12, fileFlat, (byte)(-61));
                    if (null != sh) {
                        if (sh.length <= 1) {
                            script2 = null;
                            break Label_0198;
                        }
                        final Script script3 = class33.newScript(sh, (byte)1);
                        if (script3 != null) {
                            Script.Script_cached.put(script3, method1527 << 16);
                            script2 = script3;
                            break Label_0198;
                        }
                    }
                    script2 = null;
                }
            }
        }
        final Script script4 = script2;
        if (script4 != null) {
            return script4;
        }
        return null;
    }
    
    public static int ea(final class399 class399) {
        if (class399 == null) {
            class399.ahv();
        }
        return class399.field3699.hashCode();
    }
    
    IterableNodeHashTable[] newIterableNodeHashTable(final int n, final int n2) {
        try {
            return new IterableNodeHashTable[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ch.au(" + ')');
        }
    }
    
    static Script aa(final int i, final int n) {
        final Script script = (Script)Script.Script_cached.wr(i << 16);
        if (script != null) {
            return script;
        }
        final int fileFlat = AbstractArchive.getFileFlat(class126.archive12, String.valueOf(i), 412805306);
        if (fileFlat == -1) {
            return null;
        }
        final byte[] sh = AbstractArchive.sh(class126.archive12, fileFlat, (byte)79);
        if (sh != null) {
            if (sh.length <= 1) {
                return null;
            }
            final Script script2 = class33.newScript(sh, (byte)1);
            if (script2 != null) {
                Script.Script_cached.put(script2, i << 16);
                return script2;
            }
        }
        return null;
    }
    
    IterableNodeHashTable[] ai(final int n) {
        return new IterableNodeHashTable[n];
    }
    
    public static int method460(int n, int i, final int n2) {
        try {
            int n3 = 1;
            while (i > 1) {
                if (n2 >= -1229852866) {
                    throw new IllegalStateException();
                }
                if ((i & 0x1) != 0x0) {
                    if (n2 >= -1229852866) {
                        throw new IllegalStateException();
                    }
                    n3 *= n;
                }
                n *= n;
                i >>= 1;
            }
            if (1 != i) {
                return n3;
            }
            if (n2 >= -1229852866) {
                throw new IllegalStateException();
            }
            return n3 * n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ch.af(" + ')');
        }
    }
    
    static Script ab(final int n) {
        final Script script = (Script)Script.Script_cached.wr(n);
        if (null != script) {
            return script;
        }
        final byte[] bh = class126.archive12.bh(n, 0, (byte)(-4));
        if (null == bh) {
            return null;
        }
        final Script script2 = class33.newScript(bh, (byte)1);
        Script.Script_cached.put(script2, n);
        return script2;
    }
    
    static Script aq(final int n, final int n2, final int n3) {
        final Script postDecode = ObjectComposition.postDecode((n2 << 8) + n, n, (byte)(-16));
        if (null != postDecode) {
            return postDecode;
        }
        final int method1527 = class262.method1527(n3, n, 1891104876);
        final Script script = (Script)Script.Script_cached.wr(method1527 << 16);
        Script script2 = null;
        Label_0212: {
            if (null != script) {
                script2 = script;
            }
            else {
                final int fileFlat = AbstractArchive.getFileFlat(class126.archive12, String.valueOf(method1527), -750958888);
                if (-1 == fileFlat) {
                    script2 = null;
                }
                else {
                    final byte[] sh = AbstractArchive.sh(class126.archive12, fileFlat, (byte)(-11));
                    if (null != sh) {
                        if (sh.length <= 1) {
                            script2 = null;
                            break Label_0212;
                        }
                        final Script script3 = class33.newScript(sh, (byte)1);
                        if (script3 != null) {
                            Script.Script_cached.put(script3, method1527 << 16);
                            script2 = script3;
                            break Label_0212;
                        }
                    }
                    script2 = null;
                }
            }
        }
        final Script script4 = script2;
        if (script4 != null) {
            return script4;
        }
        return null;
    }
    
    public int[] getIntOperands() {
        return this.intOperands;
    }
    
    public int[] getInstructions() {
        return this.opcodes;
    }
}
