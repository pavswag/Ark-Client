import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class IterableNodeDequeDescendingIterator implements Iterator
{
    Node last;
    IterableNodeDeque deque;
    Node field3579;
    
    IterableNodeDequeDescendingIterator(final IterableNodeDeque deque) {
        this.last = null;
        this.setDeque(deque);
    }
    
    @Override
    public void remove() {
        if (this.last == null) {
            throw new IllegalStateException();
        }
        this.last.hw();
        this.last = null;
    }
    
    @Override
    public boolean hasNext() {
        return this.field3579 != this.deque.sentinel && this.field3579 != null;
    }
    
    @Override
    public Object next() {
        Node field3579 = this.field3579;
        if (field3579 == this.deque.sentinel) {
            field3579 = null;
            this.field3579 = null;
        }
        else {
            this.field3579 = field3579.previous;
        }
        return this.last = field3579;
    }
    
    public boolean at() {
        return this.field3579 != this.deque.sentinel && this.field3579 != null;
    }
    
    public static boolean pk(final IterableNodeDequeDescendingIterator iterableNodeDequeDescendingIterator) {
        return iterableNodeDequeDescendingIterator.field3579 != iterableNodeDequeDescendingIterator.deque.sentinel && iterableNodeDequeDescendingIterator.field3579 != null;
    }
    
    public void ay() {
        if (this.last == null) {
            throw new IllegalStateException();
        }
        this.last.hw();
        this.last = null;
    }
    
    public static void ds(final IterableNodeDequeDescendingIterator iterableNodeDequeDescendingIterator) {
        iterableNodeDequeDescendingIterator.field3579 = ((iterableNodeDequeDescendingIterator.deque != null) ? iterableNodeDequeDescendingIterator.deque.sentinel.previous : null);
        iterableNodeDequeDescendingIterator.last = null;
    }
    
    public boolean al() {
        return this.field3579 != this.deque.sentinel && this.field3579 != null;
    }
    
    void start() {
        this.field3579 = ((this.deque != null) ? this.deque.sentinel.previous : null);
        this.last = null;
    }
    
    void ac() {
        this.field3579 = ((this.deque != null) ? this.deque.sentinel.previous : null);
        this.last = null;
    }
    
    public Object au() {
        Node field3579 = this.field3579;
        if (field3579 == this.deque.sentinel) {
            field3579 = null;
            this.field3579 = null;
        }
        else {
            this.field3579 = field3579.previous;
        }
        return this.last = field3579;
    }
    
    void setDeque(final IterableNodeDeque deque) {
        this.deque = deque;
        this.start();
    }
    
    public Object ab() {
        Node field3579 = this.field3579;
        if (field3579 == this.deque.sentinel) {
            field3579 = null;
            this.field3579 = null;
        }
        else {
            this.field3579 = field3579.previous;
        }
        return this.last = field3579;
    }
    
    public Object aq() {
        Node field3579 = this.field3579;
        if (field3579 == this.deque.sentinel) {
            field3579 = null;
            this.field3579 = null;
        }
        else {
            this.field3579 = field3579.previous;
        }
        return this.last = field3579;
    }
}
