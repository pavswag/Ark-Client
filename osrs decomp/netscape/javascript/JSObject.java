// 
// Decompiled by Procyon v0.5.36
// 

package netscape.javascript;

public abstract class JSObject
{
    protected JSObject() {
    }
    
    public abstract Object getSlot(final int p0) throws JSException;
    
    public abstract Object call(final String p0, final Object... p1) throws JSException;
    
    public abstract void setMember(final String p0, final Object p1) throws JSException;
    
    public abstract Object eval(final String p0) throws JSException;
    
    public abstract Object getMember(final String p0) throws JSException;
    
    public abstract void setSlot(final int p0, final Object p1) throws JSException;
    
    public abstract void removeMember(final String p0) throws JSException;
}
