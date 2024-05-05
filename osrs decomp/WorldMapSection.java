// 
// Decompiled by Procyon v0.5.36
// 

public interface WorldMapSection
{
    boolean ad(final int p0, final int p1, final int p2);
    
    boolean ae(final int p0, final int p1, final int p2);
    
    int[] ao(final int p0, final int p1, final int p2);
    
    void at(final WorldMapArea p0);
    
    Coord av(final int p0, final int p1);
    
    void as(final Buffer p0);
    
    int[] ax(final int p0, final int p1, final int p2);
    
    boolean ay(final int p0, final int p1);
    
    boolean containsPosition(final int p0, final int p1, final int p2);
    
    void am(final Buffer p0);
    
    void al(final WorldMapArea p0);
    
    boolean containsCoord(final int p0, final int p1, final int p2, final byte p3);
    
    int[] getBorderTileLengths(final int p0, final int p1, final int p2, final byte p3);
    
    default byte hm(final Buffer buffer) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        return array[offset * -1977631917 - 1];
    }
    
    Coord coord(final int p0, final int p1, final byte p2);
    
    void aa(final WorldMapArea p0);
    
    Coord ai(final int p0, final int p1);
    
    void ar(final Buffer p0);
    
    boolean ap(final int p0, final int p1, final int p2);
    
    void expandBounds(final WorldMapArea p0, final int p1);
    
    void read(final Buffer p0, final byte p1);
    
    void aj(final Buffer p0);
    
    Coord ag(final int p0, final int p1);
    
    Coord ah(final int p0, final int p1);
}
