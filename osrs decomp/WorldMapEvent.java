// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapEvent
{
    public int mapElement;
    public Coord coord1;
    public Coord coord2;
    
    public WorldMapEvent(final int n, final Coord coord1, final Coord coord2) {
        this.mapElement = 271164285 * n;
        this.coord1 = coord1;
        this.coord2 = coord2;
    }
}
