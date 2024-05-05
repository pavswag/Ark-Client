// 
// Decompiled by Procyon v0.5.36
// 

public class HorizontalAlignment implements class356
{
    static final HorizontalAlignment field1547;
    static final HorizontalAlignment HorizontalAlignment_centered;
    static final HorizontalAlignment field1549;
    public final int value;
    final int id;
    public static final int al = 10;
    static PcmPlayer pcmPlayer1;
    public static final int ar = 28;
    public static final int ap = 24;
    public static String userHomeDirectory;
    
    HorizontalAlignment(final int n, final int n2) {
        this.value = -782562361 * n;
        this.id = -1771456679 * n2;
    }
    
    static {
        field1547 = new HorizontalAlignment(0, 0);
        HorizontalAlignment_centered = new HorizontalAlignment(2, 1);
        field1549 = new HorizontalAlignment(1, 2);
    }
    
    static HorizontalAlignment[] at() {
        return new HorizontalAlignment[] { HorizontalAlignment.field1547, HorizontalAlignment.field1549, HorizontalAlignment.HorizontalAlignment_centered };
    }
    
    static HorizontalAlignment[] ay() {
        return new HorizontalAlignment[] { HorizontalAlignment.field1547, HorizontalAlignment.field1549, HorizontalAlignment.HorizontalAlignment_centered };
    }
    
    @Override
    public int aw() {
        return 455418089 * this.id;
    }
    
    static HorizontalAlignment[] al() {
        return new HorizontalAlignment[] { HorizontalAlignment.field1547, HorizontalAlignment.field1549, HorizontalAlignment.HorizontalAlignment_centered };
    }
    
    @Override
    public int an() {
        return -1390267137 * this.id;
    }
    
    @Override
    public int ac() {
        return 455418089 * this.id;
    }
    
    public static int method1019(final boolean b, final boolean b2, final byte b3) {
        try {
            int n = 0;
            if (b) {
                if (b3 == 1) {
                    throw new IllegalStateException();
                }
                n += -1171541559 * NetCache.NetCache_pendingPriorityWritesCount + -1952694793 * NetCache.NetCache_pendingPriorityResponsesCount;
            }
            if (b2) {
                n += NetCache.NetCache_pendingWritesCount * -32010957 + -1651605431 * NetCache.NetCache_pendingResponsesCount;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hd.au(" + ')');
        }
    }
    
    static HorizontalAlignment[] aa() {
        return new HorizontalAlignment[] { HorizontalAlignment.field1547, HorizontalAlignment.field1549, HorizontalAlignment.HorizontalAlignment_centered };
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return 455418089 * this.id;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hd.af(" + ')');
        }
    }
    
    static HorizontalAlignment[] ab() {
        return new HorizontalAlignment[] { HorizontalAlignment.field1547, HorizontalAlignment.field1549, HorizontalAlignment.HorizontalAlignment_centered };
    }
    
    static HorizontalAlignment[] aq() {
        return new HorizontalAlignment[] { HorizontalAlignment.field1547, HorizontalAlignment.field1549, HorizontalAlignment.HorizontalAlignment_centered };
    }
}
