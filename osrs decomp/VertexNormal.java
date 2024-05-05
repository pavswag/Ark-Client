// 
// Decompiled by Procyon v0.5.36
// 

public class VertexNormal
{
    int y;
    int x;
    int magnitude;
    int z;
    static final int aq = 10;
    static final int dm = 1000;
    
    VertexNormal() {
    }
    
    VertexNormal(final VertexNormal vertexNormal) {
        this.z = 1 * vertexNormal.z;
        this.x = 1 * vertexNormal.x;
        this.magnitude = vertexNormal.magnitude * 1;
        this.y = 1 * vertexNormal.y;
    }
    
    static int method1346(final int n, final int n2) {
        try {
            return (int)Math.pow(2.0, n / 256.0f + 7.0f);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ib.bs(" + ')');
        }
    }
    
    public int bi() {
        return this.magnitude * 2108671835;
    }
    
    public int pm() {
        return this.y * -1837445001;
    }
    
    public int cz() {
        return this.x * 124229261;
    }
    
    public int wa() {
        return this.z * -1941999827;
    }
}
