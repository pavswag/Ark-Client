import java.util.Map;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.36
// 

class class395 implements Comparator
{
    static final int cz = 89;
    static final int an = 200;
    final /* synthetic */ class394 this$0;
    
    class395(final class394 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public boolean equals(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pp.equals(" + ')');
        }
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.method2118((Map.Entry)o, (Map.Entry)o2, 226740004);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pp.compare(" + ')');
        }
    }
    
    public static int lr(final class395 class395, final Object o, final Object o2) {
        if (class395 == null) {
            class395.gq(o);
        }
        return class395.method2118((Map.Entry)o, (Map.Entry)o2, -1762118595);
    }
    
    public int al(final Object o, final Object o2) {
        return this.method2118((Map.Entry)o, (Map.Entry)o2, 181644901);
    }
    
    int an(final Map.Entry entry, final Map.Entry entry2) {
        return entry2.getValue().compareTo(entry.getValue());
    }
    
    public boolean gk(final Object obj) {
        try {
            return super.equals(obj);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pp.equals(" + ')');
        }
    }
    
    public boolean gi(final Object obj) {
        return super.equals(obj);
    }
    
    int method2118(final Map.Entry entry, final Map.Entry entry2, final int n) {
        try {
            return entry2.getValue().compareTo(entry.getValue());
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pp.af(" + ')');
        }
    }
    
    public int ab(final Object o, final Object o2) {
        return this.method2118((Map.Entry)o, (Map.Entry)o2, -659020020);
    }
    
    public int aq(final Object o, final Object o2) {
        return this.method2118((Map.Entry)o, (Map.Entry)o2, 482858325);
    }
    
    public boolean gm(final Object obj) {
        return super.equals(obj);
    }
    
    public static boolean hk(final class395 class395, final Object obj) {
        if (class395 == null) {
            return class395.gk(obj);
        }
        return class395.equals(obj);
    }
    
    public boolean gq(final Object obj) {
        return super.equals(obj);
    }
}
