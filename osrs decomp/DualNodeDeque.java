// 
// Decompiled by Procyon v0.5.36
// 

public final class DualNodeDeque
{
    DualNode sentinel;
    
    public DualNodeDeque() {
        this.sentinel = new DualNode();
        this.sentinel.nextDual = this.sentinel;
        this.sentinel.previousDual = this.sentinel;
    }
    
    public DualNode at() {
        final DualNode nextDual = this.sentinel.nextDual;
        if (nextDual == this.sentinel) {
            return null;
        }
        return nextDual;
    }
    
    public DualNode removeLast() {
        final DualNode nextDual = this.sentinel.nextDual;
        if (nextDual == this.sentinel) {
            return null;
        }
        return nextDual;
    }
    
    public static DualNode pm(final DualNodeDeque dualNodeDeque) {
        final DualNode nextDual = dualNodeDeque.sentinel.nextDual;
        if (nextDual == dualNodeDeque.sentinel) {
            return null;
        }
        return nextDual;
    }
    
    public void al(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel;
        dualNode.nextDual = this.sentinel.nextDual;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public void addLast(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel;
        dualNode.nextDual = this.sentinel.nextDual;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public void ac(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel.previousDual;
        dualNode.nextDual = this.sentinel;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public void au(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel.previousDual;
        dualNode.nextDual = this.sentinel;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public void addFirst(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel.previousDual;
        dualNode.nextDual = this.sentinel;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public void ab(final DualNode dualNode) {
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = this.sentinel;
        dualNode.nextDual = this.sentinel.nextDual;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
    
    public static void uw(final DualNodeDeque dualNodeDeque, final DualNode dualNode) {
        if (dualNodeDeque == null) {
            dualNodeDeque.addFirst(dualNode);
            return;
        }
        if (dualNode.previousDual != null) {
            GrandExchangeOfferWorldComparator.os(dualNode);
        }
        dualNode.previousDual = dualNodeDeque.sentinel;
        dualNode.nextDual = dualNodeDeque.sentinel.nextDual;
        dualNode.previousDual.nextDual = dualNode;
        dualNode.nextDual.previousDual = dualNode;
    }
}
