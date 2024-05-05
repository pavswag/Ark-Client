// 
// Decompiled by Procyon v0.5.36
// 

public class LoginType
{
    static final LoginType field3990;
    static final LoginType field3991;
    public static final LoginType oldscape;
    static final LoginType field3993;
    static final LoginType field3994;
    static final LoginType field3995;
    static final LoginType field3996;
    static final LoginType field3997;
    public static final LoginType field3998;
    final int field3999;
    final String field4000;
    
    LoginType(final int n, final int n2, final String s, final String field4000, final boolean b, final LoginType[] array) {
        this.field3999 = n * 800568237;
        this.field4000 = field4000;
    }
    
    LoginType(final int n, final int n2, final String s, final String field4000) {
        this.field3999 = n * 800568237;
        this.field4000 = field4000;
    }
    
    static {
        oldscape = new LoginType(4, 0, "", "");
        field3991 = new LoginType(6, 1, "", "");
        field3993 = new LoginType(3, 2, "", "");
        field3994 = new LoginType(8, 3, "", "");
        field3990 = new LoginType(7, 4, "", "");
        field3995 = new LoginType(5, 5, "", "");
        field3996 = new LoginType(2, 6, "", "");
        field3997 = new LoginType(1, 7, "", "");
        field3998 = new LoginType(0, -1, "", "", true, new LoginType[] { LoginType.oldscape, LoginType.field3991, LoginType.field3993, LoginType.field3990, LoginType.field3994 });
    }
    
    @Override
    public String toString() {
        try {
            return this.field4000;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sw.toString(" + ')');
        }
    }
    
    public static int uf(final GrandExchangeOfferNameComparator grandExchangeOfferNameComparator, final Object o, final Object o2) {
        if (grandExchangeOfferNameComparator == null) {
            grandExchangeOfferNameComparator.gm(o);
        }
        return GrandExchangeOfferNameComparator.ct(grandExchangeOfferNameComparator, (GrandExchangeEvent)o, (GrandExchangeEvent)o2, -816587812);
    }
    
    public String ahj() {
        return this.field4000;
    }
    
    public String ahm() {
        return this.field4000;
    }
}
