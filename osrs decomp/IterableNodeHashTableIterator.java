import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class IterableNodeHashTableIterator implements Iterator
{
    IterableNodeHashTable hashTable;
    Node head;
    int index;
    Node last;
    
    public IterableNodeHashTableIterator(final IterableNodeHashTable hashTable) {
        this.last = null;
        this.hashTable = hashTable;
        this.start();
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
        if (this.head != this.hashTable.buckets[this.index - 1]) {
            return true;
        }
        while (this.index < this.hashTable.size) {
            if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
                this.head = this.hashTable.buckets[this.index - 1].previous;
                return true;
            }
            this.head = this.hashTable.buckets[this.index - 1];
        }
        return false;
    }
    
    @Override
    public Object next() {
        if (this.head != this.hashTable.buckets[this.index - 1]) {
            final Node head = this.head;
            this.head = head.previous;
            return this.last = head;
        }
        while (this.index < this.hashTable.size) {
            final Node previous = this.hashTable.buckets[this.index++].previous;
            if (previous != this.hashTable.buckets[this.index - 1]) {
                this.head = previous.previous;
                return this.last = previous;
            }
        }
        return null;
    }
    
    public Node ao() {
        this.start();
        return (Node)this.next();
    }
    
    public boolean at() {
        if (this.head != this.hashTable.buckets[this.index - 1]) {
            return true;
        }
        while (this.index < this.hashTable.size) {
            if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
                this.head = this.hashTable.buckets[this.index - 1].previous;
                return true;
            }
            this.head = this.hashTable.buckets[this.index - 1];
        }
        return false;
    }
    
    public static void ms(final IterableNodeHashTableIterator iterableNodeHashTableIterator) {
        if (iterableNodeHashTableIterator == null) {
            iterableNodeHashTableIterator.aw();
            return;
        }
        iterableNodeHashTableIterator.head = iterableNodeHashTableIterator.hashTable.buckets[0].previous;
        iterableNodeHashTableIterator.index = 1;
        iterableNodeHashTableIterator.last = null;
    }
    
    void aw() {
        this.head = this.hashTable.buckets[0].next;
        this.index = 1;
        this.last = null;
    }
    
    public boolean al() {
        if (this.head != this.hashTable.buckets[this.index - 1]) {
            return true;
        }
        while (this.index < this.hashTable.size) {
            if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
                this.head = this.hashTable.buckets[this.index - 1].previous;
                return true;
            }
            this.head = this.hashTable.buckets[this.index - 1];
        }
        return false;
    }
    
    public Node method2390() {
        this.start();
        return (Node)this.next();
    }
    
    public static void vm(final IterableNodeHashTableIterator iterableNodeHashTableIterator) {
        if (iterableNodeHashTableIterator.last == null) {
            throw new IllegalStateException();
        }
        iterableNodeHashTableIterator.last.hw();
        iterableNodeHashTableIterator.last = null;
    }
    
    public Object au() {
        if (this.head != this.hashTable.buckets[this.index - 1]) {
            final Node head = this.head;
            this.head = head.previous;
            return this.last = head;
        }
        while (this.index < this.hashTable.size) {
            final Node previous = this.hashTable.buckets[this.index++].previous;
            if (previous != this.hashTable.buckets[this.index - 1]) {
                this.head = previous.previous;
                return this.last = previous;
            }
        }
        return null;
    }
    
    public boolean aa() {
        if (this.head != this.hashTable.buckets[this.index - 1]) {
            return true;
        }
        while (this.index < this.hashTable.size) {
            if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
                this.head = this.hashTable.buckets[this.index - 1].previous;
                return true;
            }
            this.head = this.hashTable.buckets[this.index - 1];
        }
        return false;
    }
    
    void start() {
        this.head = this.hashTable.buckets[0].previous;
        this.index = 1;
        this.last = null;
    }
    
    public Object ab() {
        if (this.head != this.hashTable.buckets[this.index - 1]) {
            final Node head = this.head;
            this.head = head.previous;
            return this.last = head;
        }
        while (this.index < this.hashTable.size) {
            final Node previous = this.hashTable.buckets[this.index++].previous;
            if (previous != this.hashTable.buckets[this.index - 1]) {
                this.head = previous.previous;
                return this.last = previous;
            }
        }
        return null;
    }
    
    public Object aq() {
        if (this.head != this.hashTable.buckets[this.index - 1]) {
            final Node head = this.head;
            this.head = head.previous;
            return this.last = head;
        }
        while (this.index < this.hashTable.size) {
            final Node previous = this.hashTable.buckets[this.index++].previous;
            if (previous != this.hashTable.buckets[this.index - 1]) {
                this.head = previous.previous;
                return this.last = previous;
            }
        }
        return null;
    }
    
    public static boolean vw(final Scene scene, final int n, final int n2, final int n3) {
        final int n4 = scene.field2020[n][n2][n3];
        if (n4 == -Scene.Scene_drawnCount) {
            return false;
        }
        if (n4 == Scene.Scene_drawnCount) {
            return true;
        }
        final int n5 = n2 << 7;
        final int n6 = n3 << 7;
        if (scene.method1273(n5 + 1, scene.tileHeights[n][n2][n3], n6 + 1) && scene.method1273(n5 + 128 - 1, scene.tileHeights[n][n2 + 1][n3], n6 + 1) && scene.method1273(n5 + 658257598 - 1, scene.tileHeights[n][n2 + 1][n3 + 1], n6 - 2054709403 - 1) && scene.method1273(n5 + 1, scene.tileHeights[n][n2][n3 + 1], n6 - 332476788 - 1)) {
            scene.field2020[n][n2][n3] = Scene.Scene_drawnCount;
            return true;
        }
        scene.field2020[n][n2][n3] = -Scene.Scene_drawnCount;
        return false;
    }
    
    public static double bu(final class456 class456) {
        return class456.field3897;
    }
}
