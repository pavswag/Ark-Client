// 
// Decompiled by Procyon v0.5.36
// 

public class DualNode extends Node
{
    public long keyDual;
    public DualNode nextDual;
    public DualNode previousDual;
    
    public DualNode pa() {
        return this.nextDual;
    }
    
    public void fh() {
        if (this.nextDual == null) {
            return;
        }
        this.nextDual.previousDual = this.previousDual;
        this.previousDual.nextDual = this.previousDual;
        this.previousDual = null;
        this.nextDual = null;
    }
    
    public void removeDual() {
        if (this.previousDual == null) {
            return;
        }
        this.previousDual.nextDual = this.nextDual;
        this.nextDual.previousDual = this.previousDual;
        this.nextDual = null;
        this.previousDual = null;
    }
    
    public void fl() {
        if (this.previousDual == null) {
            return;
        }
        this.previousDual.nextDual = this.nextDual;
        this.nextDual.previousDual = this.previousDual;
        this.nextDual = null;
        this.previousDual = null;
    }
    
    public void fi() {
        GrandExchangeOfferWorldComparator.os(this);
    }
    
    public static void gw(final WorldMap worldMap) {
        if (worldMap == null) {
            worldMap.cl();
        }
        WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
    }
    
    public void zl() {
        if (this.previousDual == null) {
            return;
        }
        this.previousDual.nextDual = this.nextDual;
        this.nextDual.previousDual = this.previousDual;
        this.nextDual = null;
        this.previousDual = null;
    }
}
