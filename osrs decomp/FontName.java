// 
// Decompiled by Procyon v0.5.36
// 

public class FontName
{
    static int foundItemIndex;
    static int[] regionMapArchiveIds;
    public static final FontName FontName_bold12;
    public static final FontName FontName_verdana11;
    public static final FontName FontName_plain11;
    public static final FontName FontName_verdana15;
    String name;
    static int field3968;
    public static final FontName FontName_verdana13;
    static int field3970;
    public static final FontName FontName_plain12;
    
    FontName(final String name) {
        this.name = name;
    }
    
    static {
        FontName_plain11 = new FontName("p11_full");
        FontName_plain12 = new FontName("p12_full");
        FontName_bold12 = new FontName("b12_full");
        FontName_verdana11 = new FontName("verdana_11pt_regular");
        FontName_verdana13 = new FontName("verdana_13pt_regular");
        FontName_verdana15 = new FontName("verdana_15pt_regular");
    }
    
    public static FontName[] aw() {
        return new FontName[] { FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_bold12 };
    }
    
    public static FontName[] an() {
        return new FontName[] { FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_bold12 };
    }
    
    public static FontName[] ac() {
        return new FontName[] { FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_bold12 };
    }
    
    public static FontName[] au() {
        return new FontName[] { FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_bold12 };
    }
    
    public static FontName[] method2388(final byte b) {
        try {
            return new FontName[] { FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_bold12 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ri.af(" + ')');
        }
    }
    
    public static FontName[] ab() {
        return new FontName[] { FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_bold12 };
    }
    
    public static FontName[] aq() {
        return new FontName[] { FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_bold12 };
    }
}
