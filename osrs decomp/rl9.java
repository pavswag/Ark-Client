import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

class rl9 implements Iterator
{
    public final /* synthetic */ NodeHashTable kh;
    public int bk;
    public Node cy;
    
    public rl9(final NodeHashTable kh) {
        this.kh = kh;
    }
    
    @Override
    public boolean hasNext() {
        if (this.bk > 0 && this.kh.buckets[this.bk - 1] != this.cy) {
            return true;
        }
        for (int i = this.bk; i < this.kh.size; ++i) {
            final Node node = this.kh.buckets[i];
            if (node != node.pt()) {
                return true;
            }
        }
        return false;
    }
    
    public Node hi() {
        if (this.bk > 0 && this.kh.buckets[this.bk - 1] != this.cy) {
            final Node cy = this.cy;
            this.cy = cy.pt();
            return cy;
        }
        while (this.bk < this.kh.size) {
            final Node node = this.kh.buckets[this.bk++];
            final Node pt = node.pt();
            if (node != pt) {
                this.cy = pt.pt();
                return pt;
            }
        }
        throw new NoSuchElementException();
    }
}
