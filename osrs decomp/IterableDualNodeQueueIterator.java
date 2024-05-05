import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class IterableDualNodeQueueIterator implements Iterator
{
    DualNode head;
    IterableDualNodeQueue queue;
    DualNode last;
    
    IterableDualNodeQueueIterator(final IterableDualNodeQueue queue) {
        this.last = null;
        this.queue = queue;
        this.head = this.queue.sentinel.nextDual;
        this.last = null;
    }
    
    @Override
    public void remove() {
        if (this.last == null) {
            throw new IllegalStateException();
        }
        GrandExchangeOfferWorldComparator.os(this.last);
        this.last = null;
    }
    
    @Override
    public boolean hasNext() {
        return this.head != this.queue.sentinel;
    }
    
    @Override
    public Object next() {
        DualNode head = this.head;
        if (head == this.queue.sentinel) {
            head = null;
            this.head = null;
        }
        else {
            this.head = head.nextDual;
        }
        return this.last = head;
    }
    
    public boolean at() {
        return this.head != this.queue.sentinel;
    }
    
    public void ay() {
        if (this.last == null) {
            throw new IllegalStateException();
        }
        GrandExchangeOfferWorldComparator.os(this.last);
        this.last = null;
    }
    
    public static class381 tz(final class379 class379) {
        if (class379.field3619.size() == 0) {
            return null;
        }
        return class379.field3619.get(class379.field3619.size() - 1);
    }
    
    public boolean al() {
        return this.head != this.queue.sentinel;
    }
    
    public Object au() {
        DualNode head = this.head;
        if (head == this.queue.sentinel) {
            head = null;
            this.head = null;
        }
        else {
            this.head = head.nextDual;
        }
        return this.last = head;
    }
    
    public boolean aa() {
        return this.head != this.queue.sentinel;
    }
    
    public Object ab() {
        DualNode head = this.head;
        if (head == this.queue.sentinel) {
            head = null;
            this.head = null;
        }
        else {
            this.head = head.nextDual;
        }
        return this.last = head;
    }
}
