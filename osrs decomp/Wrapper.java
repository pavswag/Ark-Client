// 
// Decompiled by Procyon v0.5.36
// 

public abstract class Wrapper extends DualNode
{
    final int size;
    
    Wrapper(final int size) {
        this.size = size;
    }
    
    abstract Object aw();
    
    abstract boolean isSoft();
    
    abstract Object ac();
    
    abstract boolean au();
    
    abstract Object get();
    
    abstract boolean ab();
    
    abstract boolean aq();
    
    public static void xr(final UserList list, final User user, final Username username, final Username username2) {
        if (list == null) {
            list.di();
        }
        list.mapRemove(user, (byte)(-27));
        user.set(username, username2, (byte)7);
        list.mapPut(user, -928835205);
    }
}
