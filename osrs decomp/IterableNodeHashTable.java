import java.util.Iterator;
import net.runelite.api.IterableHashTable;

// 
// Decompiled by Procyon v0.5.36
// 

public final class IterableNodeHashTable implements Iterable, IterableHashTable
{
    Node[] buckets;
    int size;
    Node currentGet;
    Node current;
    int index;
    
    public IterableNodeHashTable(final int size) {
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
    
    public net.runelite.api.Node get(final long n) {
        return (net.runelite.api.Node)this.aa(n);
    }
    
    public void put(final net.runelite.api.Node node, final long n) {
        final net.runelite.api.Node value = this.get(n);
        if (value != null) {
            ((Node)value).gy();
        }
        this.zq(node, n);
    }
    
    @Override
    public Iterator iterator() {
        return new IterableNodeHashTableIterator(this);
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
    
    public Iterator br() {
        return new IterableNodeHashTableIterator(this);
    }
    
    public void clear() {
        for (int i = 0; i < this.size; ++i) {
            final Node node = this.buckets[i];
            while (true) {
                final Node previous = node.previous;
                if (previous == node) {
                    break;
                }
                previous.hw();
            }
        }
        this.currentGet = null;
        this.current = null;
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
    
    public Node first() {
        this.index = 0;
        return ow(this);
    }
    
    public static void vt(final IterableNodeHashTable iterableNodeHashTable, final Node node, final long key) {
        if (iterableNodeHashTable == null) {
            iterableNodeHashTable.ar();
        }
        if (node.next != null) {
            node.hw();
        }
        final Node previous = iterableNodeHashTable.buckets[(int)(key & (long)(iterableNodeHashTable.size - 1))];
        node.next = previous.next;
        node.previous = previous;
        node.next.previous = node;
        node.previous.next = node;
        node.key = key;
    }
    
    public Node next() {
        if (this.size > 0 && this.currentGet != this.buckets[this.size - 1]) {
            final Node currentGet = this.currentGet;
            this.current = currentGet.previous;
            return currentGet;
        }
        while (this.size < this.size) {
            final Node next = this.buckets[this.size++].next;
            if (next != this.buckets[this.index - 1]) {
                this.current = next.previous;
                return next;
            }
        }
        return null;
    }
    
    public Node aa(final long n) {
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
    
    public Node ai() {
        this.index = 0;
        return ow(this);
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
    
    public Iterator bg() {
        return new IterableNodeHashTableIterator(this);
    }
    
    public static Node ow(final IterableNodeHashTable iterableNodeHashTable) {
        if (iterableNodeHashTable == null) {
            iterableNodeHashTable.next();
        }
        if (iterableNodeHashTable.index > 0 && iterableNodeHashTable.current != iterableNodeHashTable.buckets[iterableNodeHashTable.index - 1]) {
            final Node current = iterableNodeHashTable.current;
            iterableNodeHashTable.current = current.previous;
            return current;
        }
        while (iterableNodeHashTable.index < iterableNodeHashTable.size) {
            final Node previous = iterableNodeHashTable.buckets[iterableNodeHashTable.index++].previous;
            if (previous != iterableNodeHashTable.buckets[iterableNodeHashTable.index - 1]) {
                iterableNodeHashTable.current = previous.previous;
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
    
    public Node aq(final long n) {
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
        this.index = 0;
        return ow(this);
    }
    
    public void hq() {
        this.clear();
    }
    
    public void zq(final net.runelite.api.Node node, final long n) {
        this.put((Node)node, n);
    }
    
    public static IterableNodeHashTable yz(final int n) {
        return new IterableNodeHashTable(n);
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
    
    public Iterator bu() {
        return new IterableNodeHashTableIterator(this);
    }
}
