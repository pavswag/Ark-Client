// 
// Decompiled by Procyon v0.5.36
// 

public abstract class PcmStream extends Node
{
    volatile boolean active;
    PcmStream after;
    AbstractSound sound;
    int field255;
    
    protected PcmStream() {
        this.active = true;
    }
    
    int vmethod1019() {
        return 255;
    }
    
    int cr() {
        return 255;
    }
    
    protected abstract PcmStream bb();
    
    protected abstract void fill(final int[] p0, final int p1, final int p2);
    
    protected abstract PcmStream be();
    
    protected abstract void skip(final int p0);
    
    protected abstract PcmStream bi();
    
    protected abstract int bo();
    
    protected abstract void bt(final int[] p0, final int p1, final int p2);
    
    protected abstract int vmethod5648();
    
    final void fa(final int[] array, final int n, final int n2) {
        if (this.active) {
            this.fill(array, n, n2);
        }
        else {
            this.skip(n2);
        }
    }
    
    final void fy(final int[] array, final int n, final int n2) {
        if (this.active) {
            this.fill(array, n, n2);
        }
        else {
            this.skip(n2);
        }
    }
    
    protected abstract PcmStream bx();
    
    protected abstract void bd(final int[] p0, final int p1, final int p2);
    
    protected abstract void bg(final int p0);
    
    int cg() {
        return -803599889;
    }
    
    int cy() {
        return 255;
    }
    
    protected abstract PcmStream firstSubStream();
    
    protected abstract PcmStream nextSubStream();
    
    protected abstract int bz();
    
    protected abstract void bj(final int[] p0, final int p1, final int p2);
    
    public static void gr(final PcmStream pcmStream, final int[] array, final int n, final int n2) {
        if (pcmStream == null) {
            pcmStream.fa(array, n, n);
        }
        if (pcmStream.active) {
            pcmStream.fill(array, n, n2);
        }
        else {
            pcmStream.skip(n2);
        }
    }
    
    final void update(final int[] array, final int n, final int n2) {
        if (this.active) {
            this.bm(array, n, n2);
        }
        else {
            this.skip(n2);
        }
    }
    
    protected abstract void bm(final int[] p0, final int p1, final int p2);
    
    protected abstract PcmStream bk();
    
    public static void wk(final PcmStream pcmStream, final int[] array, final int n, final int n2) {
        if (pcmStream == null) {
            pcmStream.update(array, n, n);
        }
        if (pcmStream.active) {
            pcmStream.fill(array, n, n2);
        }
        else {
            pcmStream.skip(n2);
        }
    }
    
    protected abstract void bf(final int p0);
    
    protected abstract void bu(final int p0);
}
