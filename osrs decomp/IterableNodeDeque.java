import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.5.36
// 

public class IterableNodeDeque implements Iterable, Collection
{
    Node sentinel;
    Node field3581;
    
    public IterableNodeDeque() {
        this.sentinel = new Node();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new RuntimeException();
    }
    
    @Override
    public int size() {
        return this.method1977();
    }
    
    public Object[] cs() {
        return this.bs();
    }
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oi.equals(" + ')');
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return super.hashCode();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oi.hashCode(" + ')');
        }
    }
    
    @Override
    public void clear() {
        this.rsClear();
    }
    
    @Override
    public boolean isEmpty() {
        return this.method1971();
    }
    
    @Override
    public boolean add(final Object o) {
        return class272.hx(this, (Node)o);
    }
    
    @Override
    public Object[] toArray() {
        return this.bs();
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            array[n++] = node;
        }
        return array;
    }
    
    @Override
    public Iterator iterator() {
        return new IterableNodeDequeDescendingIterator(this);
    }
    
    Node[] bs() {
        final Node[] array = new Node[this.method1977()];
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            array[n++] = node;
        }
        return array;
    }
    
    public Object[] ca(final Object[] array) {
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            array[n++] = node;
        }
        return array;
    }
    
    public int ba() {
        return super.hashCode();
    }
    
    public Node ae() {
        final Node field3581 = this.field3581;
        if (field3581 == this.sentinel) {
            return this.field3581 = null;
        }
        this.field3581 = field3581.previous;
        return field3581;
    }
    
    public boolean cr(final Collection collection) {
        throw new RuntimeException();
    }
    
    public boolean ce(final Object o) {
        throw new RuntimeException();
    }
    
    public boolean cb(final Collection collection) {
        throw new RuntimeException();
    }
    
    @Override
    public boolean contains(final Object o) {
        throw new RuntimeException();
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        throw new RuntimeException();
    }
    
    public boolean cl(final Collection collection) {
        throw new RuntimeException();
    }
    
    public Object[] cn() {
        return this.bs();
    }
    
    public static void dc(final IterableNodeDeque iterableNodeDeque, final Node node) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.size();
        }
        if (node.next != null) {
            node.hw();
        }
        node.next = iterableNodeDeque.sentinel;
        node.previous = iterableNodeDeque.sentinel.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public static boolean dc(final IterableNodeDeque iterableNodeDeque, final Object obj) {
        if (iterableNodeDeque == null) {
            return iterableNodeDeque.equals(obj);
        }
        return iterableNodeDeque.equals(obj);
    }
    
    public boolean cf(final Object o) {
        throw new RuntimeException();
    }
    
    public boolean cw(final Object o) {
        return class272.hx(this, (Node)o);
    }
    
    public boolean cv(final Collection collection) {
        throw new RuntimeException();
    }
    
    public void ao() {
        while (this.sentinel.previous != this.sentinel) {
            this.sentinel.previous.hw();
        }
    }
    
    public boolean method1971() {
        return this.sentinel.previous == this.sentinel;
    }
    
    public boolean cj(final Object o) {
        return class272.hx(this, (Node)o);
    }
    
    public static void as(final Node node, final Node next) {
        if (node.next != null) {
            node.hw();
        }
        node.next = next;
        node.previous = next.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        throw new RuntimeException();
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        throw new RuntimeException();
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        throw new RuntimeException();
    }
    
    public void ax() {
        while (this.sentinel.previous != this.sentinel) {
            this.sentinel.previous.hw();
        }
    }
    
    boolean method1972(final Node node) {
        this.addFirst(node);
        return true;
    }
    
    int bi() {
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            ++n;
        }
        return n;
    }
    
    public static boolean bi(final MidiPcmStream midiPcmStream, final MusicPatchNode musicPatchNode) {
        if (midiPcmStream == null) {
            midiPcmStream.ea();
        }
        if (musicPatchNode.stream == null) {
            if (musicPatchNode.field2798 * -602614853 >= 0) {
                musicPatchNode.hw();
                if (1959190999 * musicPatchNode.field2784 > 0 && midiPcmStream.field2733[musicPatchNode.field2801 * 1021419297][musicPatchNode.field2784 * 1959190999] == musicPatchNode) {
                    midiPcmStream.field2733[musicPatchNode.field2801 * 1021419297][1959190999 * musicPatchNode.field2784] = null;
                }
            }
            return true;
        }
        return false;
    }
    
    public static Iterator bi(final IterableNodeDeque iterableNodeDeque) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.method1977();
        }
        return new IterableNodeDequeDescendingIterator(iterableNodeDeque);
    }
    
    public boolean bv() {
        return this.method1971();
    }
    
    public Object[] ck(final Object[] array) {
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            array[n++] = node;
        }
        return array;
    }
    
    public boolean bo() {
        return this.sentinel.previous == this.sentinel;
    }
    
    public Node up() {
        return this.method1979(null);
    }
    
    public boolean bp() {
        return this.method1971();
    }
    
    public Object[] cc() {
        return this.bs();
    }
    
    public static Node[] dv(final IterableNodeDeque iterableNodeDeque) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.ahh();
        }
        final Node[] array = new Node[iterableNodeDeque.method1977()];
        int n = 0;
        for (Node node = iterableNodeDeque.sentinel.previous; node != iterableNodeDeque.sentinel; node = node.previous) {
            array[n++] = node;
        }
        return array;
    }
    
    Node[] bt() {
        final Node[] array = new Node[this.method1977()];
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            array[n++] = node;
        }
        return array;
    }
    
    public boolean bc(final Object o) {
        throw new RuntimeException();
    }
    
    public Iterator br() {
        return new IterableNodeDequeDescendingIterator(this);
    }
    
    public boolean ci(final Object o) {
        throw new RuntimeException();
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
    
    public static void am(final Node node, final Node next) {
        if (node.next != null) {
            node.hw();
        }
        node.next = next;
        node.previous = next.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    int method1977() {
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            ++n;
        }
        return n;
    }
    
    public Object[] cu(final Object[] array) {
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            array[n++] = node;
        }
        return array;
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
    
    public static void IterableNodeDeque_addBefore(final Node node, final Node next) {
        if (node.next != null) {
            node.hw();
        }
        node.next = next;
        node.previous = next.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public static boolean rc(final IterableNodeDeque iterableNodeDeque, final Collection collection) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.bq();
        }
        throw new RuntimeException();
    }
    
    public boolean cx(final Collection collection) {
        throw new RuntimeException();
    }
    
    public int bq() {
        return super.hashCode();
    }
    
    public static Node dk(final IterableNodeDeque iterableNodeDeque, final Node node) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.ao();
        }
        Node previous;
        if (node == null) {
            previous = iterableNodeDeque.sentinel.previous;
        }
        else {
            previous = node;
        }
        if (previous == iterableNodeDeque.sentinel) {
            return iterableNodeDeque.field3581 = null;
        }
        iterableNodeDeque.field3581 = previous.previous;
        return previous;
    }
    
    public static int mo(final IterableNodeDeque iterableNodeDeque) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.ba();
        }
        return iterableNodeDeque.hashCode();
    }
    
    public Node last() {
        return this.method1979(null);
    }
    
    Node[] method1978() {
        final Node[] array = new Node[this.method1977()];
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            array[n++] = node;
        }
        return array;
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
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    public boolean bh(final Object o) {
        throw new RuntimeException();
    }
    
    public Node by() {
        final Node field3581 = this.field3581;
        if (field3581 == this.sentinel) {
            return this.field3581 = null;
        }
        this.field3581 = field3581.previous;
        return field3581;
    }
    
    public static void ar(final Node node, final Node next) {
        if (node.next != null) {
            node.hw();
        }
        node.next = next;
        node.previous = next.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public static boolean vi(final IterableNodeDeque iterableNodeDeque, final Object obj) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.rsClear();
        }
        return iterableNodeDeque.equals(obj);
    }
    
    public static int hp(final IterableNodeDeque iterableNodeDeque) {
        if (iterableNodeDeque == null) {
            return iterableNodeDeque.bi();
        }
        int n = 0;
        for (Node node = iterableNodeDeque.sentinel.previous; node != iterableNodeDeque.sentinel; node = node.previous) {
            ++n;
        }
        return n;
    }
    
    public Node ap() {
        return this.sentinel;
    }
    
    public boolean bd() {
        return this.sentinel.previous == this.sentinel;
    }
    
    public void co() {
        this.rsClear();
    }
    
    public boolean cy(final Collection collection) {
        throw new RuntimeException();
    }
    
    public static Node rsClear(final IterableNodeDeque iterableNodeDeque, final Node node) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.hashCode();
        }
        Node previous;
        if (node == null) {
            previous = iterableNodeDeque.sentinel.previous;
        }
        else {
            previous = node;
        }
        if (previous == iterableNodeDeque.sentinel) {
            return iterableNodeDeque.field3581 = null;
        }
        iterableNodeDeque.field3581 = previous.previous;
        return previous;
    }
    
    public void rsClear() {
        while (this.sentinel.previous != this.sentinel) {
            this.sentinel.previous.hw();
        }
    }
    
    Node[] bn() {
        final Node[] array = new Node[this.method1977()];
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            array[n++] = node;
        }
        return array;
    }
    
    Node method1979(final Node node) {
        Node previous;
        if (node == null) {
            previous = this.sentinel.previous;
        }
        else {
            previous = node;
        }
        if (previous == this.sentinel) {
            return this.field3581 = null;
        }
        this.field3581 = previous.previous;
        return previous;
    }
    
    public Node previous() {
        final Node field3581 = this.field3581;
        if (field3581 == this.sentinel) {
            return this.field3581 = null;
        }
        this.field3581 = field3581.previous;
        return field3581;
    }
    
    public Node aj() {
        final Node field3581 = this.field3581;
        if (field3581 == this.sentinel) {
            return this.field3581 = null;
        }
        this.field3581 = field3581.previous;
        return field3581;
    }
    
    public void ag(final Node node) {
        if (node.next != null) {
            node.hw();
        }
        node.next = this.sentinel.next;
        node.previous = this.sentinel;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public boolean bz() {
        return this.sentinel.previous == this.sentinel;
    }
    
    boolean cq(final Node node) {
        this.addFirst(node);
        return true;
    }
    
    public boolean bm() {
        return this.sentinel.previous == this.sentinel;
    }
    
    public static boolean bk(final IterableNodeDeque iterableNodeDeque, final Node node) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.ap();
        }
        iterableNodeDeque.addFirst(node);
        return true;
    }
    
    int bk() {
        int n = 0;
        for (Node node = this.sentinel.previous; node != this.sentinel; node = node.previous) {
            ++n;
        }
        return n;
    }
    
    public int aht() {
        return this.method1977();
    }
    
    public static Node wh(final IterableNodeDeque iterableNodeDeque) {
        final Node field3581 = iterableNodeDeque.field3581;
        if (field3581 == iterableNodeDeque.sentinel) {
            return iterableNodeDeque.field3581 = null;
        }
        iterableNodeDeque.field3581 = field3581.previous;
        return field3581;
    }
    
    public static void qa(final IterableNodeDeque iterableNodeDeque, final Node node) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.ahh();
        }
        if (node.next != null) {
            node.hw();
        }
        node.next = iterableNodeDeque.sentinel;
        node.previous = iterableNodeDeque.sentinel.previous;
        node.next.previous = node;
        node.previous.next = node;
    }
    
    public static int wk(final IterableNodeDeque iterableNodeDeque) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.previous();
        }
        return iterableNodeDeque.hashCode();
    }
    
    public static boolean lg(final IterableNodeDeque iterableNodeDeque, final Object o) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.size();
        }
        throw new RuntimeException();
    }
    
    public static boolean uj(final IterableNodeDeque iterableNodeDeque, final Object obj) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.cs();
        }
        return iterableNodeDeque.equals(obj);
    }
    
    public int bf() {
        return this.method1977();
    }
    
    public Iterator bu() {
        return new IterableNodeDequeDescendingIterator(this);
    }
    
    public int ahh() {
        return this.method1977();
    }
}
