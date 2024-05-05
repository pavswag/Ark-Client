import java.lang.ref.SoftReference;

// 
// Decompiled by Procyon v0.5.36
// 

public class SoftWrapper extends Wrapper
{
    SoftReference ref;
    
    SoftWrapper(final Object referent, final int n) {
        super(n);
        this.ref = new SoftReference((T)referent);
    }
    
    @Override
    Object aw() {
        return this.ref.get();
    }
    
    @Override
    boolean isSoft() {
        return true;
    }
    
    @Override
    Object ac() {
        return this.ref.get();
    }
    
    @Override
    boolean au() {
        return true;
    }
    
    @Override
    Object get() {
        return this.ref.get();
    }
    
    @Override
    boolean ab() {
        return true;
    }
    
    @Override
    boolean aq() {
        return true;
    }
}
