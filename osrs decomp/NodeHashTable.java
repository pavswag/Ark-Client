import java.util.Iterator;
import net.runelite.api.HashTable;

// 
// Decompiled by Procyon v0.5.36
// 

public final class NodeHashTable implements HashTable
{
    Node current;
    Node[] buckets;
    int size;
    Node currentGet;
    int index;
    
    public NodeHashTable(final int size) {
        this.index = 0;
        this.size = size;
        this.buckets = new Node[size];
        for (int i = 0; i < size; ++i) {
            final Node[] buckets = this.buckets;
            final int n = i;
            final Node node = new Node();
            buckets[n] = node;
            final Node node2 = node;
            node2.previous = node2;
            node2.next = node2;
        }
    }
    
    public Iterator iterator() {
        return new rl9(this);
    }
    
    public void ao(final Node node, final long key) {
        if (node.next != null) {
            node.hw();
        }
        final Node previous = this.buckets[(int)(key & (long)(this.size - 1))];
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
        node.key = key;
    }
    
    public Node at(final long n) {
        final Node node = this.buckets[(int)(n & (long)(this.size - 1))];
        this.currentGet = node.previous;
        while (this.currentGet != node) {
            if (this.currentGet.key == n) {
                final Node currentGet = this.currentGet;
                this.currentGet = this.currentGet.previous;
                return currentGet;
            }
            this.currentGet = this.currentGet.previous;
        }
        return this.currentGet = null;
    }
    
    public Node av() {
        if (this.index > 0 && this.current != this.buckets[this.index - 1]) {
            final Node current = this.current;
            this.current = current.previous;
            return current;
        }
        while (this.index < this.size) {
            final Node previous = this.buckets[this.index++].previous;
            if (previous != this.buckets[this.index - 1]) {
                this.current = previous.previous;
                return previous;
            }
        }
        return null;
    }
    
    public static Node ek(final NodeHashTable nodeHashTable, final long n) {
        final Node node = nodeHashTable.buckets[(int)(n & (long)(nodeHashTable.size - 1))];
        nodeHashTable.currentGet = node.previous;
        while (nodeHashTable.currentGet != node) {
            if (nodeHashTable.currentGet.key == n) {
                final Node currentGet = nodeHashTable.currentGet;
                nodeHashTable.currentGet = nodeHashTable.currentGet.previous;
                return currentGet;
            }
            nodeHashTable.currentGet = nodeHashTable.currentGet.previous;
        }
        return nodeHashTable.currentGet = null;
    }
    
    public void ax(final Node node, final long key) {
        if (node.previous != null) {
            node.os();
        }
        final Node previous = this.buckets[(int)(key & (long)(this.size - 1))];
        node.previous = previous.next;
        node.previous = previous;
        node.previous.next = node;
        node.previous.next = node;
        node.key = key;
    }
    
    public void ay(final Node node, final long key) {
        if (node.next != null) {
            node.hw();
        }
        final Node previous = this.buckets[(int)(key & (long)(this.size - 1))];
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
        node.key = key;
    }
    
    public Node first() {
        this.index = 0;
        return this.next();
    }
    
    public Node al(final long n) {
        final Node node = this.buckets[(int)(n & (long)(this.size - 1))];
        this.currentGet = node.previous;
        while (this.currentGet != node) {
            if (this.currentGet.key == n) {
                final Node currentGet = this.currentGet;
                this.currentGet = this.currentGet.previous;
                return currentGet;
            }
            this.currentGet = this.currentGet.previous;
        }
        return this.currentGet = null;
    }
    
    public void put(final Node node, final long key) {
        if (node.next != null) {
            node.hw();
        }
        final Node previous = this.buckets[(int)(key & (long)(this.size - 1))];
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
        node.key = key;
    }
    
    public Node next() {
        if (this.index > 0 && this.current != this.buckets[this.index - 1]) {
            final Node current = this.current;
            this.current = current.previous;
            return current;
        }
        while (this.index < this.size) {
            final Node previous = this.buckets[this.index++].previous;
            if (previous != this.buckets[this.index - 1]) {
                this.current = previous.previous;
                return previous;
            }
        }
        return null;
    }
    
    public Node au(final long n) {
        final Node node = this.buckets[(int)(n & (long)(this.size - 1))];
        this.currentGet = node.previous;
        while (this.currentGet != node) {
            if (this.currentGet.key == n) {
                final Node currentGet = this.currentGet;
                this.currentGet = this.currentGet.previous;
                return currentGet;
            }
            this.currentGet = this.currentGet.previous;
        }
        return this.currentGet = null;
    }
    
    public void aa(final Node node, final long key) {
        if (node.next != null) {
            node.hw();
        }
        final Node previous = this.buckets[(int)(key & (long)(this.size - 1))];
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
        node.key = key;
    }
    
    public Node ai() {
        this.index = 0;
        return this.next();
    }
    
    public Node ar() {
        if (this.index > 0 && this.current != this.buckets[this.index - 1]) {
            final Node current = this.current;
            this.current = current.previous;
            return current;
        }
        while (this.index < this.size) {
            final Node previous = this.buckets[this.index++].previous;
            if (previous != this.buckets[this.index - 1]) {
                this.current = previous.previous;
                return previous;
            }
        }
        return null;
    }
    
    public Node get(final long n) {
        final Node node = this.buckets[(int)(n & (long)(this.size - 1))];
        this.currentGet = node.previous;
        while (this.currentGet != node) {
            if (this.currentGet.key == n) {
                final Node currentGet = this.currentGet;
                this.currentGet = this.currentGet.previous;
                return currentGet;
            }
            this.currentGet = this.currentGet.previous;
        }
        return this.currentGet = null;
    }
    
    public Node ab(final long n) {
        final Node node = this.buckets[(int)(n & (long)(this.size - 1))];
        this.currentGet = node.previous;
        while (this.currentGet != node) {
            if (this.currentGet.key == n) {
                final Node currentGet = this.currentGet;
                this.currentGet = this.currentGet.previous;
                return currentGet;
            }
            this.currentGet = this.currentGet.previous;
        }
        return this.currentGet = null;
    }
    
    public Node ag() {
        if (this.index > 0 && this.current != this.buckets[this.index - 1]) {
            final Node current = this.current;
            this.current = current.previous;
            return current;
        }
        while (this.index < this.size) {
            final Node previous = this.buckets[this.index++].previous;
            if (previous != this.buckets[this.index - 1]) {
                this.current = previous.previous;
                return previous;
            }
        }
        return null;
    }
    
    public static void jx(final NodeHashTable nodeHashTable, final Node node, final long key) {
        if (nodeHashTable == null) {
            nodeHashTable.ax(node, key);
        }
        if (node.next != null) {
            node.hw();
        }
        final Node previous = nodeHashTable.buckets[(int)(key & (long)(nodeHashTable.size - 1))];
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
        node.key = key;
    }
    
    public Node ah() {
        if (this.index > 0 && this.current != this.buckets[this.index - 1]) {
            final Node current = this.current;
            this.current = current.previous;
            return current;
        }
        while (this.index < this.size) {
            final Node previous = this.buckets[this.index++].previous;
            if (previous != this.buckets[this.index - 1]) {
                this.current = previous.previous;
                return previous;
            }
        }
        return null;
    }
    
    public static void jr(final class12 class12, final String[] array) {
        if (class12 == null) {
            class12.getInputStream();
        }
    }
}
