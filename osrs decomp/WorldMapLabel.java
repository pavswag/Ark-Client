// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapLabel
{
    public static final int ao = 2048;
    public static final int aq = 260;
    String text;
    WorldMapLabelSize size;
    int height;
    int width;
    
    WorldMapLabel(final String text, final int n, final int n2, final WorldMapLabelSize size) {
        this.text = text;
        this.width = 1863009765 * n;
        this.height = 891924213 * n2;
        this.size = size;
    }
}
