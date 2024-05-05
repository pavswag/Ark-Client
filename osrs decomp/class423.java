// 
// Decompiled by Procyon v0.5.36
// 

public class class423
{
    float field3782;
    public static final int aq = 768;
    float field3783;
    float field3784;
    static final String av = ",";
    
    class423(final float field3784, final float field3785, final float field3786) {
        this.field3784 = field3784;
        this.field3782 = field3785;
        this.field3783 = field3786;
    }
    
    static {
        new class423(0.0f, 0.0f, 0.0f);
        new class423(1.0f, 1.0f, 1.0f);
        new class423(1.0f, 0.0f, 0.0f);
        new class423(0.0f, 1.0f, 0.0f);
        new class423(0.0f, 0.0f, 1.0f);
    }
    
    @Override
    public String toString() {
        try {
            return this.field3784 + ", " + this.field3782 + ", " + this.field3783;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qr.toString(" + ')');
        }
    }
    
    public static float po(final class423 class423, final byte b) {
        if (class423 == null) {
            return class423.method2239(b);
        }
        try {
            return (float)Math.sqrt(class423.field3783 * class423.field3783 + (class423.field3784 * class423.field3784 + class423.field3782 * class423.field3782));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qr.af(" + ')');
        }
    }
    
    final float aw() {
        return (float)Math.sqrt(this.field3783 * this.field3783 + (this.field3784 * this.field3784 + this.field3782 * this.field3782));
    }
    
    final float an() {
        return (float)Math.sqrt(this.field3783 * this.field3783 + (this.field3784 * this.field3784 + this.field3782 * this.field3782));
    }
    
    final float ac() {
        return (float)Math.sqrt(this.field3783 * this.field3783 + (this.field3784 * this.field3784 + this.field3782 * this.field3782));
    }
    
    final float method2239(final byte b) {
        try {
            return (float)Math.sqrt(this.field3784 * this.field3783 + (this.field3784 * this.field3783 + this.field3782 * this.field3782));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qr.af(" + ')');
        }
    }
    
    public String ahj() {
        return this.field3784 + ", " + this.field3782 + ", " + this.field3783;
    }
    
    public String ahm() {
        return this.field3784 + ", " + this.field3782 + ", " + this.field3783;
    }
    
    public String ahp() {
        return this.field3784 + ", " + this.field3782 + ", " + this.field3783;
    }
}
