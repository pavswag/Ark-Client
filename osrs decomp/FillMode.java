// 
// Decompiled by Procyon v0.5.36
// 

public class FillMode implements class356
{
    public final int field4118;
    static final FillMode field4119;
    static final FillMode field4120;
    final int field4121;
    public static final FillMode SOLID;
    static final int ao = 11;
    
    FillMode(final int n, final int n2) {
        this.field4118 = n * -311706931;
        this.field4121 = -1236781981 * n2;
    }
    
    static {
        SOLID = new FillMode(0, 0);
        field4119 = new FillMode(1, 1);
        field4120 = new FillMode(2, 2);
    }
    
    public static FillMode[] at() {
        return new FillMode[] { FillMode.field4120, FillMode.SOLID, FillMode.field4119 };
    }
    
    @Override
    public int aw() {
        return -1089213109 * this.field4121;
    }
    
    public static FillMode[] al() {
        return new FillMode[] { FillMode.field4120, FillMode.SOLID, FillMode.field4119 };
    }
    
    static void changeWorldSelectSorting(final int n, final int n2, final int n3) {
        try {
            final int[] world_sortOption1 = new int[4];
            final int[] world_sortOption2 = new int[4];
            world_sortOption1[0] = n;
            world_sortOption2[0] = n2;
            int n4 = 1;
            for (int i = 0; i < 4; ++i) {
                if (n != World.World_sortOption1[i]) {
                    if (n3 >= 207612479) {
                        return;
                    }
                    world_sortOption1[n4] = World.World_sortOption1[i];
                    world_sortOption2[n4] = World.World_sortOption2[i];
                    ++n4;
                }
            }
            World.World_sortOption1 = world_sortOption1;
            World.World_sortOption2 = world_sortOption2;
            class123.sortWorlds(class31.World_worlds, 0, class31.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2, -139825594);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ta.an(" + ')');
        }
    }
    
    public int changeWorldSelectSorting() {
        return -1089213109 * this.field4121;
    }
    
    @Override
    public int ac() {
        return -1089213109 * this.field4121;
    }
    
    public static FillMode[] aa() {
        return new FillMode[] { FillMode.field4120, FillMode.SOLID, FillMode.field4119 };
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return -1089213109 * this.field4121;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ta.af(" + ')');
        }
    }
    
    public static FillMode[] ab() {
        return new FillMode[] { FillMode.field4120, FillMode.SOLID, FillMode.field4119 };
    }
    
    public static FillMode[] aq() {
        return new FillMode[] { FillMode.field4120, FillMode.SOLID, FillMode.field4119 };
    }
}
