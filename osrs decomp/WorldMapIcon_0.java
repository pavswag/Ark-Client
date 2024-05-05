// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapIcon_0 extends AbstractWorldMapIcon
{
    final int subWidth;
    final int element;
    final WorldMapLabel label;
    final int subHeight;
    public static short[] field2359;
    static final byte be = 0;
    
    WorldMapIcon_0(final Coord coord, final Coord coord2, final int n, final WorldMapLabel label) {
        super(coord, coord2);
        this.subHeight = -1078535861 * n;
        this.label = label;
        final SpritePixels spriteBool = class354.method1935(this.getElement(-315675775), 1964916184).getSpriteBool(false, -16711936);
        if (spriteBool != null) {
            this.element = -717434413 * spriteBool.subWidth;
            this.subWidth = spriteBool.subHeight * 935195051;
        }
        else {
            this.element = 0;
            this.subWidth = 0;
        }
    }
    
    @Override
    WorldMapLabel ao() {
        return this.label;
    }
    
    @Override
    int av() {
        return 1694335235 * this.subWidth;
    }
    
    public static void ns(final class12 class12, final boolean b) {
        if (class12 == null) {
            class12.getSession();
        }
    }
    
    @Override
    WorldMapLabel ax() {
        return this.label;
    }
    
    @Override
    public int ay() {
        return 1767565411 * this.subHeight;
    }
    
    @Override
    WorldMapLabel getLabel(final int n) {
        try {
            return this.label;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jt.aw(" + ')');
        }
    }
    
    @Override
    public int getElement(final int n) {
        try {
            return 1767565411 * this.subHeight;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jt.an(" + ')');
        }
    }
    
    @Override
    int getSubWidth(final int n) {
        try {
            return -1314083237 * this.element;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jt.ac(" + ')');
        }
    }
    
    @Override
    int getSubHeight(final int n) {
        try {
            return 1694335235 * this.subWidth;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "jt.au(" + ')');
        }
    }
    
    @Override
    public int aa() {
        return 1767565411 * this.subHeight;
    }
    
    @Override
    WorldMapLabel ai() {
        return this.label;
    }
    
    @Override
    int ar() {
        return 1613644944 * this.subWidth;
    }
    
    @Override
    int ag() {
        return -1314083237 * this.element;
    }
    
    @Override
    int ah() {
        return -1314083237 * this.element;
    }
}
