// 
// Decompiled by Procyon v0.5.36
// 

public class class219
{
    public static final int ah = 21;
    class122[] field2001;
    static final boolean af = false;
    int field2002;
    
    class219(final Buffer buffer, final int n) {
        this.field2001 = new class122[n];
        this.field2002 = Buffer.ra(buffer, (byte)7) * -265983497;
        for (int i = 0; i < this.field2001.length; ++i) {
            this.field2001[i] = new class122(this.field2002 * 1558849479, buffer, false);
        }
        this.method1218(698731352);
    }
    
    void ad(final class133 class133, final int n, final boolean[] array, final boolean b) {
        final int method773 = class133.method773(-1899719301);
        int n2 = 0;
        final class122[] method774 = this.method1220((byte)(-38));
        for (int i = 0; i < method774.length; ++i) {
            final class122 class134 = method774[i];
            if (array == null || b == array[n2]) {
                class133.method771(n, class134, n2, method773, 413820273);
            }
            ++n2;
        }
    }
    
    void at() {
        final class122[] field2001 = this.field2001;
        for (int i = 0; i < field2001.length; ++i) {
            final class122 class122 = field2001[i];
            if (875758789 * class122.field1195 >= 0) {
                class122.field1192 = this.field2001[class122.field1195 * 875758789];
            }
        }
    }
    
    void ak(final class133 class133, final int n, final boolean[] array, final boolean b) {
        final int method773 = class133.method773(-1834057666);
        int n2 = 0;
        final class122[] method774 = this.method1220((byte)73);
        for (int i = 0; i < method774.length; ++i) {
            final class122 class134 = method774[i];
            if (array == null || b == array[n2]) {
                class133.method771(n, class134, n2, method773, 1249667094);
            }
            ++n2;
        }
    }
    
    class122[] av() {
        return this.field2001;
    }
    
    void as(final class133 class133, final int n) {
        this.method1222(class133, n, null, false, -79481237);
    }
    
    void az(final class133 class133, final int n, final boolean[] array, final boolean b) {
        final int method773 = class133.method773(-1601095784);
        int n2 = 0;
        final class122[] method774 = this.method1220((byte)(-24));
        for (int i = 0; i < method774.length; ++i) {
            final class122 class134 = method774[i];
            if (array == null || b == array[n2]) {
                class133.method771(n, class134, n2, method773, -664708040);
            }
            ++n2;
        }
    }
    
    public int ax() {
        return nv(this, -1415640515);
    }
    
    public int ay() {
        return this.field2001.length;
    }
    
    class122 method1219(final int n, final byte b) {
        try {
            if (n < nv(this, -492307617)) {
                return this.field2001[n];
            }
            if (b == 3) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ic.aw(" + ')');
        }
    }
    
    class122[] am() {
        return this.field2001;
    }
    
    void al() {
        final class122[] field2001 = this.field2001;
        for (int i = 0; i < field2001.length; ++i) {
            final class122 class122 = field2001[i];
            if (875758789 * class122.field1195 >= 0) {
                class122.field1192 = this.field2001[class122.field1195 * 875758789];
            }
        }
    }
    
    public int method1217(final int n) {
        try {
            return this.field2001.length;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ic.an(" + ')');
        }
    }
    
    class122[] method1220(final byte b) {
        try {
            return this.field2001;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ic.ac(" + ')');
        }
    }
    
    public static int nv(final class219 class219, final int n) {
        if (class219 == null) {
            class219.method1217(n);
        }
        try {
            return class219.field2001.length;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ic.an(" + ')');
        }
    }
    
    void method1221(final class133 class133, final int n, final int n2) {
        try {
            this.method1222(class133, n, null, false, -493842919);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ic.au(" + ')');
        }
    }
    
    public int aa() {
        return this.field2001.length;
    }
    
    public int fy() {
        return this.field2001.length;
    }
    
    class122[] ar() {
        return this.field2001;
    }
    
    public static class122 yb(final class219 class219, final int n, final byte b) {
        if (class219 == null) {
            return class219.method1219(n, b);
        }
        try {
            if (n < nv(class219, -492307617)) {
                return class219.field2001[n];
            }
            if (b == 3) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ic.aw(" + ')');
        }
    }
    
    public static class122 la(final class219 class219, final int n) {
        if (class219 == null) {
            class219.fy();
        }
        if (n >= nv(class219, 1502095984)) {
            return null;
        }
        return class219.field2001[n];
    }
    
    void method1218(final int n) {
        try {
            final class122[] field2001 = this.field2001;
            for (int i = 0; i < field2001.length; ++i) {
                if (n == -1519227694) {
                    throw new IllegalStateException();
                }
                final class122 class122 = field2001[i];
                if (875758789 * class122.field1195 >= 0) {
                    if (n == -1519227694) {
                        throw new IllegalStateException();
                    }
                    class122.field1192 = this.field2001[class122.field1195 * 875758789];
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ic.af(" + ')');
        }
    }
    
    void method1222(final class133 class133, final int n, final boolean[] array, final boolean b, final int n2) {
        try {
            final int method773 = class133.method773(-1981334299);
            int n3 = 0;
            final class122[] method774 = this.method1220((byte)53);
            int i = 0;
        Label_0028_Outer:
            while (i < method774.length) {
                final class122 class134 = method774[i];
                while (true) {
                    Label_0089: {
                        if (array == null) {
                            break Label_0089;
                        }
                        if (n2 == 780654770) {
                            throw new IllegalStateException();
                        }
                        if (b == array[n3]) {
                            if (n2 == 780654770) {
                                throw new IllegalStateException();
                            }
                            break Label_0089;
                        }
                        ++n3;
                        ++i;
                        continue Label_0028_Outer;
                    }
                    class133.method771(n, class134, n3, method773, -434592312);
                    continue;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ic.ab(" + ')');
        }
    }
    
    void aq() {
        final class122[] field2001 = this.field2001;
        for (int i = 0; i < field2001.length; ++i) {
            final class122 class122 = field2001[i];
            if (-938949749 * class122.field1195 >= 0) {
                class122.field1192 = this.field2001[class122.field1195 * 875758789];
            }
        }
    }
    
    void aj(final class133 class133, final int n) {
        this.method1222(class133, n, null, false, 238451461);
    }
    
    class122 ag(final int n) {
        if (n >= nv(this, 1765132086)) {
            return null;
        }
        return this.field2001[n];
    }
    
    class122 ah(final int n) {
        if (n >= nv(this, -2078472143)) {
            return null;
        }
        return this.field2001[n];
    }
    
    public static int ey(final class20 class20) {
        return class20.field64 * -673848331;
    }
}
