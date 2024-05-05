import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

class rl7 implements Iterator
{
    public Node cn;
    public final /* synthetic */ NodeDeque nk;
    
    public rl7(final NodeDeque nk) {
        this.nk = nk;
        this.cn = this.nk.jp().pt();
    }
    
    @Override
    public void remove() {
        final Node og = this.cn.og();
        if (og == this.nk.jp()) {
            throw new IllegalStateException();
        }
        og.gy();
    }
    
    @Override
    public boolean hasNext() {
        return this.cn != this.nk.jp();
    }
    
    public Node au() {
        if (this.cn == this.nk.jp()) {
            throw new NoSuchElementException();
        }
        final Node cn = this.cn;
        this.cn = this.cn.pt();
        return cn;
    }
}
