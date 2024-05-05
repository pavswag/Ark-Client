// 
// Decompiled by Procyon v0.5.36
// 

public class VerticalAlignment implements class356
{
    static final int ay = 30;
    static final VerticalAlignment field1605;
    public final int value;
    public static Widget[][] Widget_interfaceComponents;
    final int id;
    static final VerticalAlignment VerticalAlignment_centered;
    static final VerticalAlignment field1610;
    public static final int aq = 6;
    
    VerticalAlignment(final int n, final int n2) {
        this.value = -441541533 * n;
        this.id = -1969701431 * n2;
    }
    
    static {
        field1610 = new VerticalAlignment(2, 0);
        VerticalAlignment_centered = new VerticalAlignment(1, 1);
        field1605 = new VerticalAlignment(0, 2);
    }
    
    static final void method1036(final String s, final int n) {
        try {
            UserComparator5.addGameMessage(30, "", s, -397121414);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hn.at(" + ')');
        }
    }
    
    @Override
    public int aw() {
        return -934136935 * this.id;
    }
    
    @Override
    public int an() {
        return -1332614023 * this.id;
    }
    
    @Override
    public int ac() {
        return -1332614023 * this.id;
    }
    
    public static void im(final WorldMap worldMap, final boolean b) {
        if (worldMap == null) {
            worldMap.fl();
        }
        worldMap.elementsDisabled = !b;
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return -1332614023 * this.id;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hn.af(" + ')');
        }
    }
    
    public static int hashString(final CharSequence charSequence, final int n) {
        try {
            final int length = charSequence.length();
            int n2 = 0;
            for (int i = 0; i < length; ++i) {
                if (n <= -107229618) {
                    throw new IllegalStateException();
                }
                n2 = (n2 << 5) - n2 + class100.vmethod5708(charSequence.charAt(i), (byte)(-80));
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hn.aq(" + ')');
        }
    }
}
