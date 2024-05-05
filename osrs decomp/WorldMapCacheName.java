import java.awt.Graphics;

// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapCacheName
{
    public static final WorldMapCacheName field2434;
    public static final WorldMapCacheName field2435;
    public static final WorldMapCacheName field2436;
    static final WorldMapCacheName field2437;
    public final String name;
    public static final WorldMapCacheName field2439;
    
    WorldMapCacheName(final String name) {
        this.name = name;
    }
    
    static {
        field2435 = new WorldMapCacheName("details");
        field2439 = new WorldMapCacheName("compositemap");
        field2436 = new WorldMapCacheName("compositetexture");
        field2437 = new WorldMapCacheName("area");
        field2434 = new WorldMapCacheName("labels");
    }
    
    public static void ff(final Canvas canvas, final Graphics g) {
        canvas.component.update(g);
    }
}
