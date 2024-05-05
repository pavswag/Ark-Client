// 
// Decompiled by Procyon v0.5.36
// 

public abstract class Renderable extends DualNode implements net.runelite.api.Renderable
{
    public int height;
    
    protected Renderable() {
        this.height = -448344600;
    }
    
    public Model tb() {
        return this.getModel((byte)(-112));
    }
    
    protected Model al() {
        return null;
    }
    
    void draw(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        try {
            final Model model = this.getModel((byte)(-10));
            if (null != model) {
                this.height = model.et * 1;
                model.draw(n, n2, n3, n4, n5, n6, n7, n8, n9);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "iv.df(" + ')');
        }
    }
    
    static void getModel(final int n) {
        try {
            class186.Tiles_underlays = null;
            Tiles.Tiles_overlays = null;
            Tiles.Tiles_shapes = null;
            Tiles.field824 = null;
            class161.field1407 = null;
            Tiles.field819 = null;
            Tiles.field821 = null;
            FileSystem.Tiles_hue = null;
            Tiles.Tiles_saturation = null;
            class283.Tiles_lightness = null;
            UserComparator4.Tiles_hueMultiplier = null;
            class31.field92 = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "iv.an(" + ')');
        }
    }
    
    protected Model getModel(final byte b) {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "iv.an(" + ')');
        }
    }
    
    protected Model au() {
        return null;
    }
    
    public void draw(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        this.draw(n, n2, n3, n4, n5, n6, n7, n8, n9);
    }
    
    protected Model ab() {
        return null;
    }
    
    protected Model aq() {
        return null;
    }
    
    void dd(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        final Model model = this.getModel((byte)(-87));
        if (null != model) {
            this.height = model.et * 1;
            model.draw(n, n2, n3, n4, n5, n6, n7, n8, n9);
        }
    }
    
    void dj(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        final Model model = this.getModel((byte)(-41));
        if (null != model) {
            this.height = model.et * 1;
            model.draw(n, n2, n3, n4, n5, n6, n7, n8, n9);
        }
    }
    
    public void setModelHeight(final int n) {
        this.height = n * -644693439;
    }
    
    public int getModelHeight() {
        return this.height * 1550732737;
    }
    
    void dq(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        final Model model = this.getModel((byte)(-16));
        if (null != model) {
            this.height = model.et * 1;
            model.draw(n, n2, n3, n4, n5, n6, n7, n8, n9);
        }
    }
}
