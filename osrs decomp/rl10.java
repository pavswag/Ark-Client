import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

class rl10 implements Iterator
{
    public final /* synthetic */ LinkDeque wk;
    public Link pw;
    
    public rl10(final LinkDeque wk) {
        this.wk = wk;
        this.pw = this.wk.current.wv();
    }
    
    @Override
    public void remove() {
        final Link bl = this.pw.bl();
        if (bl == this.wk.current) {
            throw new IllegalStateException();
        }
        bl.oh();
    }
    
    @Override
    public boolean hasNext() {
        return this.pw != this.wk.current;
    }
    
    public FriendLoginUpdate fw() {
        if (this.pw == this.wk.current) {
            throw new NoSuchElementException();
        }
        final FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate)this.pw;
        this.pw = this.pw.wv();
        return friendLoginUpdate;
    }
}
