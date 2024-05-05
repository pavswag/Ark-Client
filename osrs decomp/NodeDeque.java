import java.util.Iterator;
import net.runelite.api.Deque;

// 
// Decompiled by Procyon v0.5.36
// 

public class NodeDeque implements Deque
{
    public Node sentinel;
    Node current;
    
    public NodeDeque() {
        this.sentinel = new Node();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }
    
    public void clear() {
        la(this);
    }
    
    public Iterator iterator() {
        return new rl7(this);
    }
    
    public Node ad() {
        final Node next = this.sentinel.next;
        if (next == this.sentinel) {
            return null;
        }
        next.hw();
        return next;
    }
    
    public Node ae() {
        final Node previous = this.sentinel.previous;
        if (previous == this.sentinel) {
            return this.current = null;
        }
        this.current = previous.previous;
        return previous;
    }
    
    public Node bb() {
        final Node next = this.sentinel.next;
        if (next == this.sentinel) {
            return this.current = null;
        }
        this.current = next.next;
        return next;
    }
    
    public void rd(final Node node) {
        this.addFirst(node);
    }
    
    public Node dn() {
        return this.last();
    }
    
    public void ao() {
        while (true) {
            final Node previous = this.sentinel.previous;
            if (previous == this.sentinel) {
                break;
            }
            previous.hw();
        }
        this.current = null;
    }
    
    public Node previous() {
        final Node current = this.current;
        if (current == this.sentinel) {
            return this.current = null;
        }
        this.current = current.previous;
        return current;
    }
    
    public Node ak() {
        final Node next = this.sentinel.next;
        if (next == this.sentinel) {
            return null;
        }
        next.hw();
        return next;
    }
    
    public Node th() {
        return this.previous();
    }
    
    public static void av(final Node node, final Node previous) {
        if (node.next != null) {
            node.hw();
        }
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public Node be() {
        final Node current = this.current;
        if (current == this.sentinel) {
            return this.current = null;
        }
        this.current = current.next;
        return current;
    }
    
    public Node is() {
        return this.current;
    }
    
    public Node as() {
        final Node previous = this.sentinel.previous;
        if (previous == this.sentinel) {
            return null;
        }
        previous.hw();
        return previous;
    }
    
    public void ax(final Node node) {
        if (node.next != null) {
            node.hw();
        }
        node.next = this.sentinel.next;
        node.previous = this.sentinel;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public void ay() {
        while (true) {
            final Node previous = this.sentinel.previous;
            if (previous == this.sentinel) {
                break;
            }
            previous.hw();
        }
        this.current = null;
    }
    
    public Node bi() {
        final Node current = this.current;
        if (current == this.sentinel) {
            return this.current = null;
        }
        this.current = current.previous;
        return current;
    }
    
    public void addLast(final Node node) {
        if (node.next != null) {
            node.hw();
        }
        node.next = this.sentinel;
        node.previous = this.sentinel.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public static void am(final Node node, final Node previous) {
        if (node.next != null) {
            node.hw();
        }
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public Node first() {
        final Node next = this.sentinel.next;
        if (next == this.sentinel) {
            return this.current = null;
        }
        this.current = next.next;
        return next;
    }
    
    public Node jp() {
        return this.sentinel;
    }
    
    public void addFirst(final Node node) {
        if (node.next != null) {
            node.hw();
        }
        node.next = this.sentinel.next;
        node.previous = this.sentinel;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public static void NodeDeque_addBefore(final Node node, final Node previous) {
        if (node.next != null) {
            node.hw();
        }
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public Node removeLast() {
        final Node previous = this.sentinel.previous;
        if (previous == this.sentinel) {
            return null;
        }
        previous.hw();
        return previous;
    }
    
    public Node next() {
        final Node current = this.current;
        if (current == this.sentinel) {
            return this.current = null;
        }
        this.current = current.next;
        return current;
    }
    
    public void ai(final Node node) {
        if (node.next != null) {
            node.hw();
        }
        node.next = this.sentinel.next;
        node.previous = this.sentinel;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public Node by() {
        final Node next = this.sentinel.next;
        if (next == this.sentinel) {
            return this.current = null;
        }
        this.current = next.next;
        return next;
    }
    
    public Node bx() {
        final Node current = this.current;
        if (current == this.sentinel) {
            return this.current = null;
        }
        this.current = current.next;
        return current;
    }
    
    public static void ar(final Node node, final Node previous) {
        if (node.next != null) {
            node.hw();
        }
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public Node ap() {
        final Node previous = this.sentinel.previous;
        if (previous == this.sentinel) {
            return this.current = null;
        }
        this.current = previous.previous;
        return previous;
    }
    
    public static void la(final NodeDeque nodeDeque) {
        if (nodeDeque == null) {
            nodeDeque.clear();
        }
        while (true) {
            final Node previous = nodeDeque.sentinel.previous;
            if (previous == nodeDeque.sentinel) {
                break;
            }
            previous.hw();
        }
        nodeDeque.current = null;
    }
    
    public Node uk() {
        return this.removeLast();
    }
    
    public void clear() {
        while (true) {
            final Node next = this.sentinel.next;
            if (next == this.sentinel) {
                break;
            }
            next.gh();
        }
        this.current = null;
    }
    
    public Node removeFirst() {
        final Node next = this.sentinel.next;
        if (next == this.sentinel) {
            return this.current = null;
        }
        this.current = next.next;
        return next;
    }
    
    public static Node removeFirst(final NodeDeque nodeDeque) {
        final Node next = nodeDeque.sentinel.next;
        if (next == nodeDeque.sentinel) {
            return null;
        }
        next.hw();
        return next;
    }
    
    public Node last() {
        final Node previous = this.sentinel.previous;
        if (previous == this.sentinel) {
            return this.current = null;
        }
        this.current = previous.previous;
        return previous;
    }
    
    public Node aj() {
        final Node previous = this.sentinel.previous;
        if (previous == this.sentinel) {
            return null;
        }
        previous.hw();
        return previous;
    }
    
    public void ag(final Node node) {
        if (node.next != null) {
            node.hw();
        }
        node.next = this.sentinel;
        node.previous = this.sentinel.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public static Node od(final NodeDeque nodeDeque) {
        if (nodeDeque == null) {
            nodeDeque.removeFirst();
        }
        final Node next = nodeDeque.sentinel.next;
        if (next == nodeDeque.sentinel) {
            return null;
        }
        next.hw();
        return next;
    }
    
    public static void zd(final NodeDeque nodeDeque, final Node node) {
        if (nodeDeque == null) {
            nodeDeque.rd(node);
        }
        if (node.next != null) {
            node.hw();
        }
        node.next = nodeDeque.sentinel;
        node.previous = nodeDeque.sentinel.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public static int zy(final KeyHandler keyHandler) {
        return -885520444 * keyHandler.KeyHandler_idleCycles;
    }
    
    public Node bk() {
        final Node current = this.current;
        if (current == this.sentinel) {
            return this.current = null;
        }
        this.current = current.next;
        return current;
    }
    
    public static NodeDeque qz() {
        return new NodeDeque();
    }
}
