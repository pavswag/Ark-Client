import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class IterableDualNodeQueue implements Iterable
{
    DualNode head;
    public DualNode sentinel;
    
    public IterableDualNodeQueue() {
        this.sentinel = new DualNode();
        this.sentinel.nextDual = this.sentinel;
        this.sentinel.previousDual = this.sentinel;
    }
    
    @Override
    public Iterator iterator() {
        return new IterableDualNodeQueueIterator(this);
    }
    
    public void at(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel.previousDual;
        dualNode.nextDual = this.sentinel;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public DualNode ak() {
        final DualNode head = this.head;
        if (head == this.sentinel) {
            return this.head = null;
        }
        this.head = head.nextDual;
        return head;
    }
    
    public DualNode av() {
        return this.previousOrLast(null);
    }
    
    public static void ax(final DualNode dualNode, final DualNode previousDual) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = previousDual;
        dualNode.nextDual = previousDual.nextDual;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public void ay(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel.previousDual;
        dualNode.nextDual = this.sentinel;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public static DualNode xi(final IterableDualNodeQueue iterableDualNodeQueue, final DualNode dualNode) {
        if (iterableDualNodeQueue == null) {
            iterableDualNodeQueue.aa(dualNode);
        }
        DualNode nextDual;
        if (dualNode == null) {
            nextDual = iterableDualNodeQueue.sentinel.nextDual;
        }
        else {
            nextDual = dualNode;
        }
        if (nextDual == iterableDualNodeQueue.sentinel) {
            return iterableDualNodeQueue.head = null;
        }
        iterableDualNodeQueue.head = nextDual.nextDual;
        return nextDual;
    }
    
    public Iterator br() {
        return new IterableDualNodeQueueIterator(this);
    }
    
    public static void DualNodeDeque_addBefore(final DualNode dualNode, final DualNode previousDual) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = previousDual;
        dualNode.nextDual = previousDual.nextDual;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public DualNode am() {
        return this.previousOrLast(null);
    }
    
    public void al() {
        while (this.sentinel.nextDual != this.sentinel) {
            GrandExchangeOfferWorldComparator.os(this.sentinel.nextDual);
        }
    }
    
    public void add(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel.previousDual;
        dualNode.nextDual = this.sentinel;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public DualNode removeLast() {
        final DualNode nextDual = this.sentinel.nextDual;
        if (nextDual == this.sentinel) {
            return null;
        }
        GrandExchangeOfferWorldComparator.os(nextDual);
        return nextDual;
    }
    
    public DualNode last() {
        return this.previousOrLast(null);
    }
    
    public void aa(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel.previousDual;
        dualNode.nextDual = this.sentinel;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public DualNode ai() {
        final DualNode nextDual = this.sentinel.nextDual;
        if (nextDual == this.sentinel) {
            return null;
        }
        GrandExchangeOfferWorldComparator.os(nextDual);
        return nextDual;
    }
    
    public DualNode ar() {
        return this.previousOrLast(null);
    }
    
    public Iterator bg() {
        return new IterableDualNodeQueueIterator(this);
    }
    
    public void clear() {
        while (this.sentinel.nextDual != this.sentinel) {
            GrandExchangeOfferWorldComparator.os(this.sentinel.nextDual);
        }
    }
    
    DualNode previousOrLast(final DualNode dualNode) {
        DualNode nextDual;
        if (dualNode == null) {
            nextDual = this.sentinel.nextDual;
        }
        else {
            nextDual = dualNode;
        }
        if (nextDual == this.sentinel) {
            return this.head = null;
        }
        this.head = nextDual.nextDual;
        return nextDual;
    }
    
    public DualNode previous() {
        final DualNode head = this.head;
        if (head == this.sentinel) {
            return this.head = null;
        }
        this.head = head.nextDual;
        return head;
    }
    
    public DualNode aj() {
        final DualNode head = this.head;
        if (head == this.sentinel) {
            return this.head = null;
        }
        this.head = head.nextDual;
        return head;
    }
    
    public DualNode ag() {
        final DualNode nextDual = this.sentinel.nextDual;
        if (nextDual == this.sentinel) {
            return null;
        }
        GrandExchangeOfferWorldComparator.os(nextDual);
        return nextDual;
    }
    
    public static void xy(final IterableDualNodeQueue iterableDualNodeQueue, final DualNode dualNode) {
        if (iterableDualNodeQueue == null) {
            iterableDualNodeQueue.clear();
        }
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = iterableDualNodeQueue.sentinel.previousDual;
        dualNode.nextDual = iterableDualNodeQueue.sentinel;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public DualNode ah() {
        return this.previousOrLast(null);
    }
    
    public Iterator bu() {
        return new IterableDualNodeQueueIterator(this);
    }
}
