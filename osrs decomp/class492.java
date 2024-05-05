// 
// Decompiled by Procyon v0.5.36
// 

public interface class492
{
    void an(final Buffer p0);
    
    default void xb(final AbstractFont abstractFont, final String s, final int n, final int n2, final int n3, final int n4) {
        if (abstractFont == null) {
            abstractFont.draw(s, n, n, n, n);
        }
        if (s == null) {
            return;
        }
        AbstractFont.pr(abstractFont, n3, n4);
        abstractFont.draw0(s, n, n2);
    }
    
    void method2556(final Buffer p0, final byte p1);
}
