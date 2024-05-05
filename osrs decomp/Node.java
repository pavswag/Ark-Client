// 
// Decompiled by Procyon v0.5.36
// 

public class Node implements net.runelite.api.Node
{
    public long key;
    public Node previous;
    public Node next;
    
    public boolean gc() {
        return this.next != null;
    }
    
    public void os() {
    }
    
    public Node pt() {
        return this.previous;
    }
    
    public boolean gf() {
        return this.next != null;
    }
    
    public static boolean fh(final Node node) {
        if (node == null) {
            node.hasNext();
        }
        return node.next != null;
    }
    
    public static boolean pr(final class461 class461, final Object o) {
        if (class461 == null) {
            class461.gq(o);
        }
        if (o != null && o instanceof class461) {
            final class461 class462 = (class461)o;
            if (class461.field3972 == null) {
                if (class462.field3972 != null) {
                    return false;
                }
            }
            else if (!class461.field3972.equals(class462.field3972)) {
                return false;
            }
            if (null == class461.field3973) {
                if (class462.field3973 != null) {
                    return false;
                }
            }
            else if (!class461.field3973.equals(class462.field3973)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public static void xa(final Node node) {
        if (node.next == null) {
            return;
        }
        node.next.previous = node.previous;
        node.previous.next = node.next;
        node.previous = null;
        node.next = null;
    }
    
    public void zf() {
        if (this.next == null) {
            return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.previous = null;
        this.next = null;
    }
    
    public boolean hasNext() {
        return this.next != null;
    }
    
    public static Object ir(final class128 class128) {
        for (int i = class128.val$workStart; i < class128.val$workEnd; ++i) {
            class128.val$curveLoadJobs[i].call();
        }
        return null;
    }
    
    public void hw() {
        this.remove();
        if (this.next == null) {
            return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.previous = null;
        this.next = null;
    }
    
    public void gy() {
        this.hw();
    }
    
    public void gh() {
        if (this.next == null) {
            return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.previous = null;
        this.next = null;
    }
    
    public void gu() {
        if (this.next == null) {
            return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.previous = null;
        this.next = null;
    }
    
    public void remove() {
        this.os();
    }
    
    public long getHash() {
        return this.key;
    }
    
    public Node og() {
        return this.next;
    }
}
