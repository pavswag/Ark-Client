// 
// Decompiled by Procyon v0.5.36
// 

public interface class272 extends class274
{
    default boolean hx(final IterableNodeDeque iterableNodeDeque, final Node node) {
        if (iterableNodeDeque == null) {
            iterableNodeDeque.method1972(node);
        }
        iterableNodeDeque.addFirst(node);
        return true;
    }
    
    default boolean gr(final class12 class12) {
        if (class12 == null) {
            class12.aj();
        }
        return false;
    }
    
    default void na(final DemotingHashTable demotingHashTable, final Object o, final long n) {
        if (demotingHashTable == null) {
            demotingHashTable.ai(n);
            return;
        }
        DemotingHashTable.yu(demotingHashTable, o, n, 1);
    }
}
