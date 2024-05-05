// 
// Decompiled by Procyon v0.5.36
// 

public class Link
{
    public Link previous;
    public Link next;
    
    public static Node ic(final IterableNodeHashTable iterableNodeHashTable) {
        if (iterableNodeHashTable == null) {
            return iterableNodeHashTable.ag();
        }
        iterableNodeHashTable.index = 0;
        return IterableNodeHashTable.ow(iterableNodeHashTable);
    }
    
    public void remove() {
        if (this.next == null) {
            return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.previous = null;
        this.next = null;
    }
    
    public Link bl() {
        return this.next;
    }
    
    public void oh() {
        this.remove();
    }
    
    public Link wv() {
        return this.previous;
    }
}
