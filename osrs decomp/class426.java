// 
// Decompiled by Procyon v0.5.36
// 

public class class426
{
    static final int aj = 7;
    float field3799;
    float field3800;
    float field3801;
    float field3802;
    float field3803;
    float field3804;
    float field3805;
    float field3806;
    float field3807;
    float field3808;
    float field3809;
    float field3810;
    static Archive field3811;
    
    class426() {
        this.method2269((short)(-23475));
    }
    
    static {
        new class426();
    }
    
    @Override
    public String toString() {
        try {
            return this.field3810 + "," + this.field3801 + "," + this.field3804 + "," + this.field3807 + "\n" + this.field3799 + "," + this.field3802 + "," + this.field3805 + "," + this.field3808 + "\n" + this.field3800 + "," + this.field3803 + "," + this.field3806 + "," + this.field3809;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qc.toString(" + ')');
        }
    }
    
    void at() {
        this.field3809 = 0.0f;
        this.field3808 = 0.0f;
        this.field3807 = 0.0f;
        this.field3805 = 0.0f;
        this.field3804 = 0.0f;
        this.field3803 = 0.0f;
        this.field3801 = 0.0f;
        this.field3800 = 0.0f;
        this.field3799 = 0.0f;
        this.field3806 = 1.0f;
        this.field3802 = 1.0f;
        this.field3810 = 1.0f;
    }
    
    void av(final float n) {
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final float field3810 = this.field3810;
        final float field3811 = this.field3801;
        final float field3812 = this.field3804;
        final float field3813 = this.field3807;
        this.field3810 = field3810 * n2 - this.field3799 * n3;
        this.field3799 = n2 * this.field3799 + field3810 * n3;
        this.field3801 = field3811 * n2 - this.field3802 * n3;
        this.field3802 = n3 * field3811 + n2 * this.field3802;
        this.field3804 = n2 * field3812 - this.field3805 * n3;
        this.field3805 = n2 * this.field3805 + n3 * field3812;
        this.field3807 = n2 * field3813 - n3 * this.field3808;
        this.field3808 = n2 * this.field3808 + n3 * field3813;
    }
    
    static final void drawSpriteOnMinimap(final int n, final int n2, final int n3, final int n4, final SpritePixels spritePixels, final SpriteMask spriteMask, final int n5) {
        try {
            final int n6 = -1609285207;
            try {
                if (spritePixels == null) {
                    if (n6 != -1609285207) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    final int n7 = Client.camAngleY * 704283033 & 0x7FF;
                    final int n8 = n4 * n4 + n3 * n3;
                    if (n8 > 6400) {
                        if (n6 != -1609285207) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final int n9 = Rasterizer3D.Rasterizer3D_sine[n7];
                        final int n10 = Rasterizer3D.Rasterizer3D_cosine[n7];
                        final int n11 = n3 * n10 + n4 * n9 >> 16;
                        final int n12 = n4 * n10 - n9 * n3 >> 16;
                        if (n8 > 2500) {
                            if (n6 != -1609285207) {
                                throw new IllegalStateException();
                            }
                            spritePixels.method2609(spriteMask.width * 1484188043 / 2 + n11 - spritePixels.width / 2, spriteMask.height * 939947663 / 2 - n12 - spritePixels.height / 2, n, n2, 1484188043 * spriteMask.width, 939947663 * spriteMask.height, spriteMask.xStarts, spriteMask.xWidths);
                        }
                        else {
                            spritePixels.drawAt(n11 + (n + spriteMask.width * 1484188043 / 2) - spritePixels.width / 2, 939947663 * spriteMask.height / 2 + n2 - n12 - spritePixels.height / 2);
                        }
                    }
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "qc.ns(" + ')');
            }
        }
        catch (Exception ex2) {}
    }
    
    void ax(final float n) {
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final float field3799 = this.field3799;
        final float field3800 = this.field3802;
        final float field3801 = this.field3805;
        final float field3802 = this.field3808;
        this.field3799 = field3799 * n2 - this.field3800 * n3;
        this.field3800 = this.field3800 * n2 + n3 * field3799;
        this.field3802 = n2 * field3800 - n3 * this.field3803;
        this.field3803 = this.field3803 * n2 + field3800 * n3;
        this.field3805 = field3801 * n2 - n3 * this.field3806;
        this.field3806 = this.field3806 * n2 + n3 * field3801;
        this.field3808 = n2 * field3802 - this.field3809 * n3;
        this.field3809 = n3 * field3802 + n2 * this.field3809;
    }
    
    void ay(final float n) {
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final float field3799 = this.field3799;
        final float field3800 = this.field3802;
        final float field3801 = this.field3805;
        final float field3802 = this.field3808;
        this.field3799 = field3799 * n2 - this.field3800 * n3;
        this.field3800 = this.field3800 * n2 + n3 * field3799;
        this.field3802 = n2 * field3800 - n3 * this.field3803;
        this.field3803 = this.field3803 * n2 + field3800 * n3;
        this.field3805 = field3801 * n2 - n3 * this.field3806;
        this.field3806 = this.field3806 * n2 + n3 * field3801;
        this.field3808 = n2 * field3802 - this.field3809 * n3;
        this.field3809 = n3 * field3802 + n2 * this.field3809;
    }
    
    void method2267(final float n, final int n2) {
        try {
            final float n3 = (float)Math.cos(n);
            final float n4 = (float)Math.sin(n);
            final float field3810 = this.field3810;
            final float field3811 = this.field3801;
            final float field3812 = this.field3804;
            final float field3813 = this.field3807;
            this.field3810 = n4 * this.field3800 + n3 * field3810;
            this.field3800 = n3 * this.field3800 - field3810 * n4;
            this.field3801 = n4 * this.field3803 + field3811 * n3;
            this.field3803 = this.field3803 * n3 - field3811 * n4;
            this.field3804 = n4 * this.field3806 + n3 * field3812;
            this.field3806 = this.field3806 * n3 - n4 * field3812;
            this.field3807 = n3 * field3813 + n4 * this.field3809;
            this.field3809 = n3 * this.field3809 - field3813 * n4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qc.aw(" + ')');
        }
    }
    
    void al() {
        this.field3808 = 0.0f;
        this.field3807 = 0.0f;
        this.field3807 = 0.0f;
        this.field3809 = 0.0f;
        this.field3808 = 0.0f;
        this.field3800 = 0.0f;
        this.field3804 = 0.0f;
        this.field3806 = 0.0f;
        this.field3810 = 0.0f;
        this.field3802 = 1.0f;
        this.field3799 = 1.0f;
        this.field3803 = 1.0f;
    }
    
    public static void rx(final class426 class426, final float n, final float n2, final float n3, final byte b) {
        if (class426 == null) {
            class426.method2265(n, n, n, b);
        }
        try {
            class426.field3807 += n;
            class426.field3808 += n2;
            class426.field3809 += n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qc.au(" + ')');
        }
    }
    
    void method2266(final float n, final int n2) {
        try {
            final float n3 = (float)Math.cos(n);
            final float n4 = (float)Math.sin(n);
            final float field3799 = this.field3799;
            final float field3800 = this.field3802;
            final float field3801 = this.field3805;
            final float field3802 = this.field3808;
            this.field3799 = field3799 * n3 - this.field3800 * n4;
            this.field3800 = this.field3800 * n3 + n4 * field3799;
            this.field3802 = n3 * field3800 - n4 * this.field3803;
            this.field3803 = this.field3803 * n3 + field3800 * n4;
            this.field3805 = field3801 * n3 - n4 * this.field3806;
            this.field3806 = this.field3806 * n3 + n4 * field3801;
            this.field3808 = n3 * field3802 - this.field3809 * n4;
            this.field3809 = n4 * field3802 + n3 * this.field3809;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qc.an(" + ')');
        }
    }
    
    void method2268(final float n, final byte b) {
        try {
            final float n2 = (float)Math.cos(n);
            final float n3 = (float)Math.sin(n);
            final float field3810 = this.field3810;
            final float field3811 = this.field3805;
            final float field3812 = this.field3801;
            final float field3813 = this.field3807;
            this.field3800 = field3810 * n2 - this.field3803 * n3;
            this.field3805 = n2 * this.field3800 + field3810 * n3;
            this.field3807 = field3811 * n2 - this.field3810 * n3;
            this.field3803 = n3 * field3811 + n2 * this.field3799;
            this.field3805 = n2 * field3812 - this.field3808 * n3;
            this.field3801 = n2 * this.field3801 + n3 * field3812;
            this.field3806 = n2 * field3813 - n3 * this.field3800;
            this.field3799 = n2 * this.field3804 + n3 * field3813;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qc.ac(" + ')');
        }
    }
    
    public static void io(final class426 class426, final float n, final byte b) {
        if (class426 == null) {
            class426.method2268(n, b);
        }
        try {
            final float n2 = (float)Math.cos(n);
            final float n3 = (float)Math.sin(n);
            final float field3810 = class426.field3810;
            final float field3811 = class426.field3801;
            final float field3812 = class426.field3804;
            final float field3813 = class426.field3807;
            class426.field3810 = field3810 * n2 - class426.field3799 * n3;
            class426.field3799 = n2 * class426.field3799 + field3810 * n3;
            class426.field3801 = field3811 * n2 - class426.field3802 * n3;
            class426.field3802 = n3 * field3811 + n2 * class426.field3802;
            class426.field3804 = n2 * field3812 - class426.field3805 * n3;
            class426.field3805 = n2 * class426.field3805 + n3 * field3812;
            class426.field3807 = n2 * field3813 - n3 * class426.field3808;
            class426.field3808 = n2 * class426.field3808 + n3 * field3813;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qc.ac(" + ')');
        }
    }
    
    public static void vt(final class426 class426) {
        if (class426 == null) {
            class426.al();
            return;
        }
        class426.field3809 = 0.0f;
        class426.field3808 = 0.0f;
        class426.field3807 = 0.0f;
        class426.field3805 = 0.0f;
        class426.field3804 = 0.0f;
        class426.field3803 = 0.0f;
        class426.field3801 = 0.0f;
        class426.field3800 = 0.0f;
        class426.field3799 = 0.0f;
        class426.field3806 = 1.0f;
        class426.field3802 = 1.0f;
        class426.field3810 = 1.0f;
    }
    
    void method2265(final float n, final float n2, final float n3, final byte b) {
        try {
            this.field3807 = this.field3806 + n;
            this.field3810 = this.field3804 + n2;
            this.field3806 += n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qc.au(" + ')');
        }
    }
    
    void aa(final float n) {
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final float field3799 = this.field3799;
        final float field3800 = this.field3802;
        final float field3801 = this.field3805;
        final float field3802 = this.field3808;
        this.field3799 = field3799 * n2 - this.field3800 * n3;
        this.field3800 = this.field3800 * n2 + n3 * field3799;
        this.field3802 = n2 * field3800 - n3 * this.field3803;
        this.field3803 = this.field3803 * n2 + field3800 * n3;
        this.field3805 = field3801 * n2 - n3 * this.field3806;
        this.field3806 = this.field3806 * n2 + n3 * field3801;
        this.field3808 = n2 * field3802 - this.field3809 * n3;
        this.field3809 = n3 * field3802 + n2 * this.field3809;
    }
    
    void ai(final float n) {
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final float field3810 = this.field3810;
        final float field3811 = this.field3801;
        final float field3812 = this.field3804;
        final float field3813 = this.field3807;
        this.field3810 = n3 * this.field3800 + n2 * field3810;
        this.field3800 = n2 * this.field3800 - field3810 * n3;
        this.field3801 = n3 * this.field3803 + field3811 * n2;
        this.field3803 = this.field3803 * n2 - field3811 * n3;
        this.field3804 = n3 * this.field3806 + n2 * field3812;
        this.field3806 = this.field3806 * n2 - n3 * field3812;
        this.field3807 = n2 * field3813 + n3 * this.field3809;
        this.field3809 = n2 * this.field3809 - field3813 * n3;
    }
    
    void ar(final float n) {
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final float field3810 = this.field3810;
        final float field3811 = this.field3801;
        final float field3812 = this.field3804;
        final float field3813 = this.field3807;
        this.field3810 = field3810 * n2 - this.field3799 * n3;
        this.field3799 = n2 * this.field3799 + field3810 * n3;
        this.field3801 = field3811 * n2 - this.field3802 * n3;
        this.field3802 = n3 * field3811 + n2 * this.field3802;
        this.field3804 = n2 * field3812 - this.field3805 * n3;
        this.field3805 = n2 * this.field3805 + n3 * field3812;
        this.field3807 = n2 * field3813 - n3 * this.field3808;
        this.field3808 = n2 * this.field3808 + n3 * field3813;
    }
    
    void method2269(final short n) {
        try {
            this.field3809 = 0.0f;
            this.field3808 = 0.0f;
            this.field3807 = 0.0f;
            this.field3805 = 0.0f;
            this.field3804 = 0.0f;
            this.field3803 = 0.0f;
            this.field3801 = 0.0f;
            this.field3800 = 0.0f;
            this.field3799 = 0.0f;
            this.field3806 = 1.0f;
            this.field3802 = 1.0f;
            this.field3810 = 1.0f;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qc.af(" + ')');
        }
    }
    
    public static void cz(final class426 class426, final float n) {
        if (class426 == null) {
            class426.ab();
        }
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final float field3799 = class426.field3799;
        final float field3800 = class426.field3802;
        final float field3801 = class426.field3805;
        final float field3802 = class426.field3808;
        class426.field3799 = field3799 * n2 - class426.field3800 * n3;
        class426.field3800 = class426.field3800 * n2 + n3 * field3799;
        class426.field3802 = n2 * field3800 - n3 * class426.field3803;
        class426.field3803 = class426.field3803 * n2 + field3800 * n3;
        class426.field3805 = field3801 * n2 - n3 * class426.field3806;
        class426.field3806 = class426.field3806 * n2 + n3 * field3801;
        class426.field3808 = n2 * field3802 - class426.field3809 * n3;
        class426.field3809 = n3 * field3802 + n2 * class426.field3809;
    }
    
    void ab() {
        this.field3809 = 0.0f;
        this.field3808 = 0.0f;
        this.field3807 = 0.0f;
        this.field3805 = 0.0f;
        this.field3804 = 0.0f;
        this.field3803 = 0.0f;
        this.field3801 = 0.0f;
        this.field3800 = 0.0f;
        this.field3799 = 0.0f;
        this.field3806 = 1.0f;
        this.field3802 = 1.0f;
        this.field3810 = 1.0f;
    }
    
    void aq() {
        this.field3809 = 0.0f;
        this.field3808 = 0.0f;
        this.field3807 = 0.0f;
        this.field3805 = 0.0f;
        this.field3804 = 0.0f;
        this.field3803 = 0.0f;
        this.field3801 = 0.0f;
        this.field3800 = 0.0f;
        this.field3799 = 0.0f;
        this.field3806 = 1.0f;
        this.field3802 = 1.0f;
        this.field3810 = 1.0f;
    }
    
    void ag(final float n) {
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final float field3810 = this.field3810;
        final float field3811 = this.field3801;
        final float field3812 = this.field3804;
        final float field3813 = this.field3807;
        this.field3810 = n3 * this.field3800 + n2 * field3810;
        this.field3800 = n2 * this.field3800 - field3810 * n3;
        this.field3801 = n3 * this.field3803 + field3811 * n2;
        this.field3803 = this.field3803 * n2 - field3811 * n3;
        this.field3804 = n3 * this.field3806 + n2 * field3812;
        this.field3806 = this.field3806 * n2 - n3 * field3812;
        this.field3807 = n2 * field3813 + n3 * this.field3809;
        this.field3809 = n2 * this.field3809 - field3813 * n3;
    }
    
    void ah(final float n) {
        final float n2 = (float)Math.cos(n);
        final float n3 = (float)Math.sin(n);
        final float field3810 = this.field3810;
        final float field3811 = this.field3801;
        final float field3812 = this.field3804;
        final float field3813 = this.field3807;
        this.field3810 = n3 * this.field3800 + n2 * field3810;
        this.field3800 = n2 * this.field3800 - field3810 * n3;
        this.field3801 = n3 * this.field3803 + field3811 * n2;
        this.field3803 = this.field3803 * n2 - field3811 * n3;
        this.field3804 = n3 * this.field3806 + n2 * field3812;
        this.field3806 = this.field3806 * n2 - n3 * field3812;
        this.field3807 = n2 * field3813 + n3 * this.field3809;
        this.field3809 = n2 * this.field3809 - field3813 * n3;
    }
    
    public String ahj() {
        return this.field3810 + "," + this.field3801 + "," + this.field3804 + "," + this.field3807 + "\n" + this.field3799 + "," + this.field3802 + "," + this.field3805 + "," + this.field3808 + "\n" + this.field3800 + "," + this.field3803 + "," + this.field3806 + "," + this.field3809;
    }
    
    public String ahm() {
        return this.field3810 + "," + this.field3801 + "," + this.field3804 + "," + this.field3807 + "\n" + this.field3799 + "," + this.field3802 + "," + this.field3805 + "," + this.field3808 + "\n" + this.field3800 + "," + this.field3803 + "," + this.field3806 + "," + this.field3809;
    }
    
    public String ahp() {
        return this.field3810 + "," + this.field3801 + "," + this.field3804 + "," + this.field3807 + "\n" + this.field3799 + "," + this.field3802 + "," + this.field3805 + "," + this.field3808 + "\n" + this.field3800 + "," + this.field3803 + "," + this.field3806 + "," + this.field3809;
    }
}
