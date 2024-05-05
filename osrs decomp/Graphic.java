import net.runelite.api.ActorSpotAnim;

// 
// Decompiled by Procyon v0.5.36
// 

public class Graphic extends Node implements ActorSpotAnim
{
    public int field4168;
    public int field4169;
    public int field4170;
    public int field4171;
    public int field4172;
    
    public Graphic(final int n, final int n2, final int n3, final int n4) {
        this.field4170 = -1446975881;
        this.field4169 = 0;
        this.field4168 = 0;
        this.field4171 = 0;
        this.field4172 = 0;
        this.field4170 = 1446975881 * n;
        this.field4172 = 1378946551 * n2;
        this.field4171 = -114615265 * n3;
        this.field4169 = -793313949 * n4;
    }
    
    public int getId() {
        return this.field4170 * -1171575623;
    }
    
    public void setFrame(final int n) {
        this.field4169 = n * -793313949;
    }
    
    public int getFrame() {
        return this.field4169 * 971664459;
    }
    
    public void setHeight(final int n) {
        this.field4172 = n * 1378946551;
    }
    
    public int getHeight() {
        return this.field4172 * -790772793;
    }
    
    public void setId(final int n) {
        this.field4170 = n * 1446975881;
    }
    
    public int getCycle() {
        return this.field4168 * 77733639;
    }
    
    public void setCycle(final int n) {
        this.field4168 = n * 1417617079;
    }
}
