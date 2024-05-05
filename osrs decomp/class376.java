import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class class376 implements Iterator
{
    static final int ab = 3;
    class377 field3602;
    int field3603;
    int field3604;
    static IndexedSprite field3605;
    
    class376(final class377 field3602) {
        this.field3604 = 0;
        this.field3603 = 1950564823 * this.field3602.field3607;
        this.field3602 = field3602;
    }
    
    @Override
    public void remove() {
        try {
            throw new UnsupportedOperationException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "os.remove(" + ')');
        }
    }
    
    @Override
    public boolean hasNext() {
        try {
            return this.field3604 * 1092736727 < -1960181101 * this.field3602.field3610;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "os.hasNext(" + ')');
        }
    }
    
    @Override
    public Object next() {
        try {
            if (this.field3603 * -1365662605 != -874295403 * this.field3602.field3607) {
                throw new ConcurrentModificationException();
            }
            if (this.field3604 * 1092736727 < -1960181101 * this.field3602.field3610) {
                final Object field3600 = this.field3602.field3608[1092736727 * this.field3604].field3600;
                this.field3604 += 1525775591;
                return field3600;
            }
            throw new NoSuchElementException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "os.next(" + ')');
        }
    }
    
    public static int tg(final class314 class314) {
        if (class314 == null) {
            class314.jf();
        }
        return 1953737631 * class314.field2858 / class379.he(class314.field2851, -297150195);
    }
    
    public boolean at() {
        return this.field3604 * 426526155 < -1960181101 * this.field3602.field3610;
    }
    
    public static void dt(final class376 class376) {
        if (class376 == null) {
            class376.remove();
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public boolean al() {
        return this.field3604 * 1092736727 < -1960181101 * this.field3602.field3610;
    }
    
    public boolean aa() {
        return this.field3604 * 1092736727 < -1960181101 * this.field3602.field3610;
    }
    
    public Object ab() {
        if (this.field3603 * -1365662605 != -874295403 * this.field3602.field3607) {
            throw new ConcurrentModificationException();
        }
        if (this.field3604 * 1092736727 < -1960181101 * this.field3602.field3610) {
            final Object field3600 = this.field3602.field3608[1092736727 * this.field3604].field3600;
            this.field3604 += 1525775591;
            return field3600;
        }
        throw new NoSuchElementException();
    }
    
    public Object aq() {
        if (this.field3603 * -1365662605 != -874295403 * this.field3602.field3607) {
            throw new ConcurrentModificationException();
        }
        if (this.field3604 * 1092736727 < -1960181101 * this.field3602.field3610) {
            final Object field3600 = this.field3602.field3608[1092736727 * this.field3604].field3600;
            this.field3604 += 1525775591;
            return field3600;
        }
        throw new NoSuchElementException();
    }
    
    public static Object bm(final class376 class376) {
        if (class376.field3603 * -1365662605 != -874295403 * class376.field3602.field3607) {
            throw new ConcurrentModificationException();
        }
        if (class376.field3604 * 1092736727 < -1960181101 * class376.field3602.field3610) {
            final Object field3600 = class376.field3602.field3608[1092736727 * class376.field3604].field3600;
            class376.field3604 += 1525775591;
            return field3600;
        }
        throw new NoSuchElementException();
    }
}
