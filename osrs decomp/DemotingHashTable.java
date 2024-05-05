// 
// Decompiled by Procyon v0.5.36
// 

public final class DemotingHashTable
{
    IterableDualNodeQueue queue;
    int remaining;
    IterableNodeHashTable hashTable;
    class276 field2453;
    int capacity;
    
    public DemotingHashTable(final int n) {
        this(n, n);
    }
    
    public DemotingHashTable(final int n, final int n2) {
        this.queue = new IterableDualNodeQueue();
        this.capacity = n;
        this.remaining = n;
        int n3;
        for (n3 = 1; n3 + n3 < n && n3 < n2; n3 += n3) {}
        this.hashTable = new IterableNodeHashTable(n3);
    }
    
    public static void dp(final DemotingHashTable demotingHashTable, final Object o, final long n, final int n2) {
        if (n2 > demotingHashTable.capacity) {
            throw new IllegalStateException();
        }
        class7.oy(demotingHashTable, n);
        demotingHashTable.remaining -= n2;
        while (demotingHashTable.remaining < 0) {
            final Wrapper wrapper = (Wrapper)demotingHashTable.queue.removeLast();
            if (wrapper == null) {
                throw new RuntimeException("");
            }
            if (!wrapper.isSoft()) {}
            demotingHashTable.removeWrapper(wrapper);
            if (demotingHashTable.field2453 == null) {
                continue;
            }
            demotingHashTable.field2453.method1571(wrapper.get());
        }
        final DirectWrapper directWrapper = new DirectWrapper(o, n2);
        demotingHashTable.hashTable.put(directWrapper, n);
        demotingHashTable.queue.add(directWrapper);
        directWrapper.ef = 0L;
    }
    
    public void ad(final int n) {
        for (Wrapper wrapper = (Wrapper)IntHashTable.pp(this.queue); wrapper != null; wrapper = (Wrapper)this.queue.previous()) {
            if (wrapper.isSoft()) {
                if (wrapper.get() == null) {
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                    this.remaining += wrapper.size;
                }
            }
            else {
                final Wrapper wrapper2 = wrapper;
                final long ef = wrapper2.ef + 1L;
                wrapper2.ef = ef;
                if (ef > n) {
                    final SoftWrapper softWrapper = new SoftWrapper(wrapper.get(), wrapper.size);
                    this.hashTable.put(softWrapper, wrapper.hr);
                    IterableDualNodeQueue.DualNodeDeque_addBefore(softWrapper, wrapper);
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                }
            }
        }
    }
    
    public void ae(final int n) {
        for (Wrapper wrapper = (Wrapper)IntHashTable.pp(this.queue); wrapper != null; wrapper = (Wrapper)this.queue.previous()) {
            if (wrapper.isSoft()) {
                if (wrapper.get() == null) {
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                    this.remaining += wrapper.size;
                }
            }
            else {
                final Wrapper wrapper2 = wrapper;
                final long ef = wrapper2.ef + 1L;
                wrapper2.ef = ef;
                if (ef > n) {
                    final SoftWrapper softWrapper = new SoftWrapper(wrapper.get(), wrapper.size);
                    this.hashTable.put(softWrapper, wrapper.hr);
                    IterableDualNodeQueue.DualNodeDeque_addBefore(softWrapper, wrapper);
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                }
            }
        }
    }
    
    public void bb() {
        class125.yv(this.queue);
        this.hashTable.clear();
        this.remaining = this.capacity;
    }
    
    void ao(final long n) {
        this.removeWrapper((Wrapper)this.hashTable.aa(n));
    }
    
    public Object at(final long n) {
        final Wrapper wrapper = (Wrapper)this.hashTable.aa(n);
        if (wrapper == null) {
            return null;
        }
        final Object value = wrapper.get();
        if (value == null) {
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
            this.remaining += wrapper.size;
            return null;
        }
        if (wrapper.isSoft()) {
            final DirectWrapper directWrapper = new DirectWrapper(value, wrapper.size);
            this.hashTable.put(directWrapper, wrapper.hr);
            this.queue.add(directWrapper);
            directWrapper.ef = 0L;
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
        }
        else {
            this.queue.add(wrapper);
            wrapper.ef = 0L;
        }
        return value;
    }
    
    public void az(final int n) {
        for (Wrapper wrapper = (Wrapper)IntHashTable.pp(this.queue); wrapper != null; wrapper = (Wrapper)this.queue.previous()) {
            if (wrapper.isSoft()) {
                if (wrapper.get() == null) {
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                    this.remaining += wrapper.size;
                }
            }
            else {
                final Wrapper wrapper2 = wrapper;
                final long ef = wrapper2.ef + 1L;
                wrapper2.ef = ef;
                if (ef > n) {
                    final SoftWrapper softWrapper = new SoftWrapper(wrapper.get(), wrapper.size);
                    this.hashTable.put(softWrapper, wrapper.hr);
                    IterableDualNodeQueue.DualNodeDeque_addBefore(softWrapper, wrapper);
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                }
            }
        }
    }
    
    void ax(final long n) {
        this.removeWrapper((Wrapper)this.hashTable.aa(n));
    }
    
    public Object ay(final long n) {
        final Wrapper wrapper = (Wrapper)this.hashTable.aa(n);
        if (wrapper == null) {
            return null;
        }
        final Object value = wrapper.get();
        if (value == null) {
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
            this.remaining += wrapper.size;
            return null;
        }
        if (wrapper.isSoft()) {
            final DirectWrapper directWrapper = new DirectWrapper(value, wrapper.size);
            this.hashTable.put(directWrapper, wrapper.hr);
            this.queue.add(directWrapper);
            directWrapper.ef = 0L;
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
        }
        else {
            this.queue.add(wrapper);
            wrapper.ef = 0L;
        }
        return value;
    }
    
    public void bi() {
        class125.yv(this.queue);
        this.hashTable.clear();
        this.remaining = this.capacity;
    }
    
    public static void zi(final DemotingHashTable demotingHashTable, final int n) {
        if (demotingHashTable == null) {
            demotingHashTable.by();
        }
        for (Wrapper wrapper = (Wrapper)IntHashTable.pp(demotingHashTable.queue); wrapper != null; wrapper = (Wrapper)demotingHashTable.queue.previous()) {
            if (wrapper.isSoft()) {
                if (wrapper.get() == null) {
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                    demotingHashTable.remaining += wrapper.size;
                }
            }
            else {
                final Wrapper wrapper2 = wrapper;
                final long ef = wrapper2.ef + 1L;
                wrapper2.ef = ef;
                if (ef > n) {
                    final SoftWrapper softWrapper = new SoftWrapper(wrapper.get(), wrapper.size);
                    demotingHashTable.hashTable.put(softWrapper, wrapper.hr);
                    IterableDualNodeQueue.DualNodeDeque_addBefore(softWrapper, wrapper);
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                }
            }
        }
    }
    
    void removeWrapper(final Wrapper wrapper) {
        if (wrapper != null) {
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
            this.remaining += wrapper.size;
        }
    }
    
    public Object al(final long n) {
        final Wrapper wrapper = (Wrapper)this.hashTable.aa(n);
        if (wrapper == null) {
            return null;
        }
        final Object value = wrapper.get();
        if (value == null) {
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
            this.remaining += wrapper.size;
            return null;
        }
        if (wrapper.isSoft()) {
            final DirectWrapper directWrapper = new DirectWrapper(value, wrapper.size);
            this.hashTable.put(directWrapper, wrapper.hr);
            this.queue.add(directWrapper);
            directWrapper.ef = 0L;
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
        }
        else {
            this.queue.add(wrapper);
            wrapper.ef = 0L;
        }
        return value;
    }
    
    void remove(final long n) {
        this.ag((Wrapper)this.hashTable.aq(n));
    }
    
    public void method1577(final Object o, final long n) {
        yu(this, o, n, 1);
    }
    
    public void put(final Object o, final long n, final int n2) {
        if (n2 > this.remaining) {
            throw new IllegalStateException();
        }
        class7.oy(this, n);
        this.capacity = this.remaining - n2;
        while (this.capacity < 0) {
            final Wrapper wrapper = (Wrapper)this.queue.ai();
            if (wrapper == null) {
                throw new RuntimeException("");
            }
            if (!wrapper.aq()) {}
            this.ag(wrapper);
            if (this.field2453 == null) {
                continue;
            }
            this.field2453.method1571(wrapper.get());
        }
        final DirectWrapper directWrapper = new DirectWrapper(o, n2);
        this.hashTable.ao(directWrapper, n);
        this.queue.at(directWrapper);
        directWrapper.ef = 0L;
    }
    
    public Object aa(final long n) {
        final Wrapper wrapper = (Wrapper)this.hashTable.aa(n);
        if (wrapper == null) {
            return null;
        }
        final Object value = wrapper.get();
        if (value == null) {
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
            this.remaining += wrapper.size;
            return null;
        }
        if (wrapper.isSoft()) {
            final DirectWrapper directWrapper = new DirectWrapper(value, wrapper.size);
            this.hashTable.put(directWrapper, wrapper.hr);
            this.queue.add(directWrapper);
            directWrapper.ef = 0L;
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
        }
        else {
            this.queue.add(wrapper);
            wrapper.ef = 0L;
        }
        return value;
    }
    
    void ai(final long n) {
        this.removeWrapper((Wrapper)this.hashTable.aa(n));
    }
    
    public void by() {
        class125.yv(this.queue);
        this.hashTable.clear();
        this.remaining = this.capacity;
    }
    
    public void ar(final Object o, final long n, final int n2) {
        if (n2 > this.capacity) {
            throw new IllegalStateException();
        }
        class7.oy(this, n);
        this.remaining -= n2;
        while (this.remaining < 0) {
            final Wrapper wrapper = (Wrapper)this.queue.removeLast();
            if (wrapper == null) {
                throw new RuntimeException("");
            }
            if (!wrapper.isSoft()) {}
            this.removeWrapper(wrapper);
            if (this.field2453 == null) {
                continue;
            }
            this.field2453.method1571(wrapper.get());
        }
        final DirectWrapper directWrapper = new DirectWrapper(o, n2);
        this.hashTable.put(directWrapper, n);
        this.queue.add(directWrapper);
        directWrapper.ef = 0L;
    }
    
    public void ap() {
        class125.yv(this.queue);
        this.hashTable.clear();
        this.remaining = this.capacity;
    }
    
    public Object get(final long n) {
        final Wrapper wrapper = (Wrapper)this.hashTable.aa(n);
        if (wrapper == null) {
            return null;
        }
        final Object value = wrapper.get();
        if (value == null) {
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
            this.remaining += wrapper.size;
            return null;
        }
        if (wrapper.isSoft()) {
            final DirectWrapper directWrapper = new DirectWrapper(value, wrapper.size);
            this.hashTable.put(directWrapper, wrapper.hr);
            this.queue.add(directWrapper);
            directWrapper.ef = 0L;
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
        }
        else {
            this.queue.add(wrapper);
            wrapper.ef = 0L;
        }
        return value;
    }
    
    public static void te(final DemotingHashTable demotingHashTable, final Object o, final long n, final int n2) {
        if (n2 > demotingHashTable.capacity) {
            throw new IllegalStateException();
        }
        class7.oy(demotingHashTable, n);
        demotingHashTable.remaining -= n2;
        while (demotingHashTable.remaining < 0) {
            final Wrapper wrapper = (Wrapper)demotingHashTable.queue.removeLast();
            if (wrapper == null) {
                throw new RuntimeException("");
            }
            if (!wrapper.isSoft()) {}
            demotingHashTable.removeWrapper(wrapper);
            if (demotingHashTable.field2453 == null) {
                continue;
            }
            demotingHashTable.field2453.method1571(wrapper.get());
        }
        final DirectWrapper directWrapper = new DirectWrapper(o, n2);
        demotingHashTable.hashTable.put(directWrapper, n);
        demotingHashTable.queue.add(directWrapper);
        directWrapper.ef = 0L;
    }
    
    public void demote(final int n) {
        for (Wrapper wrapper = (Wrapper)IntHashTable.pp(this.queue); wrapper != null; wrapper = (Wrapper)this.queue.previous()) {
            if (wrapper.isSoft()) {
                if (wrapper.get() == null) {
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                    this.remaining += wrapper.size;
                }
            }
            else {
                final Wrapper wrapper2 = wrapper;
                final long ef = wrapper2.ef + 1L;
                wrapper2.ef = ef;
                if (ef > n) {
                    final SoftWrapper softWrapper = new SoftWrapper(wrapper.get(), wrapper.size);
                    this.hashTable.put(softWrapper, wrapper.hr);
                    IterableDualNodeQueue.DualNodeDeque_addBefore(softWrapper, wrapper);
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                }
            }
        }
    }
    
    public void clear() {
        class125.yv(this.queue);
        this.hashTable.clear();
        this.remaining = this.capacity;
    }
    
    void ag(final Wrapper wrapper) {
        if (wrapper != null) {
            wrapper.hw();
            GrandExchangeOfferWorldComparator.os(wrapper);
            this.remaining += wrapper.size;
        }
    }
    
    public static void yg(final DemotingHashTable demotingHashTable, final int n) {
        for (Wrapper wrapper = (Wrapper)IntHashTable.pp(demotingHashTable.queue); wrapper != null; wrapper = (Wrapper)demotingHashTable.queue.previous()) {
            if (wrapper.isSoft()) {
                if (wrapper.get() == null) {
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                    demotingHashTable.remaining += wrapper.size;
                }
            }
            else {
                final Wrapper wrapper2 = wrapper;
                final long ef = wrapper2.ef + 1L;
                wrapper2.ef = ef;
                if (ef > n) {
                    final SoftWrapper softWrapper = new SoftWrapper(wrapper.get(), wrapper.size);
                    demotingHashTable.hashTable.put(softWrapper, wrapper.hr);
                    IterableDualNodeQueue.DualNodeDeque_addBefore(softWrapper, wrapper);
                    wrapper.hw();
                    GrandExchangeOfferWorldComparator.os(wrapper);
                }
            }
        }
    }
    
    public static void yu(final DemotingHashTable demotingHashTable, final Object o, final long n, final int n2) {
        if (demotingHashTable == null) {
            demotingHashTable.put(o, n, n2);
        }
        if (n2 > demotingHashTable.capacity) {
            throw new IllegalStateException();
        }
        class7.oy(demotingHashTable, n);
        demotingHashTable.remaining -= n2;
        while (demotingHashTable.remaining < 0) {
            final Wrapper wrapper = (Wrapper)demotingHashTable.queue.removeLast();
            if (wrapper == null) {
                throw new RuntimeException("");
            }
            if (!wrapper.isSoft()) {}
            demotingHashTable.removeWrapper(wrapper);
            if (demotingHashTable.field2453 == null) {
                continue;
            }
            demotingHashTable.field2453.method1571(wrapper.get());
        }
        final DirectWrapper directWrapper = new DirectWrapper(o, n2);
        demotingHashTable.hashTable.put(directWrapper, n);
        demotingHashTable.queue.add(directWrapper);
        directWrapper.ef = 0L;
    }
}
