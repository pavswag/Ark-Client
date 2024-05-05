import java.util.Iterator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.AbstractQueue;

// 
// Decompiled by Procyon v0.5.36
// 

public class class377 extends AbstractQueue
{
    Map field3606;
    int field3607;
    class375[] field3608;
    final Comparator field3609;
    int field3610;
    
    public class377(final int n) {
        this(n, null);
    }
    
    public class377(final int n, final Comparator field3609) {
        this.field3607 = 0;
        this.field3608 = new class375[n];
        this.field3606 = new HashMap();
        this.field3609 = field3609;
    }
    
    @Override
    public boolean remove(final Object o) {
        try {
            final class375 class375 = this.field3606.remove(o);
            if (class375 == null) {
                return false;
            }
            this.field3607 += 6390717;
            this.field3610 -= 1689217947;
            if (class375.field3601 * -1919098739 == this.field3610 * -1960181101) {
                this.field3608[-1960181101 * this.field3610] = null;
                return true;
            }
            final class375 class376 = this.field3608[-1960181101 * this.field3610];
            this.field3608[this.field3610 * -1960181101] = null;
            this.field3608[-1919098739 * class375.field3601] = class376;
            this.field3608[class375.field3601 * -1919098739].field3601 = class375.field3601 * 1;
            this.method1996(-1919098739 * class375.field3601, (byte)12);
            if (this.field3608[-1919098739 * class375.field3601] == class376) {
                this.method1995(-1919098739 * class375.field3601, (byte)(-29));
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.remove(" + ')');
        }
    }
    
    @Override
    public int size() {
        try {
            return -1960181101 * this.field3610;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.size(" + ')');
        }
    }
    
    public Object[] cs() {
        final Object[] array = super.toArray();
        if (this.field3609 != null) {
            Arrays.sort(array, this.field3609);
        }
        else {
            Arrays.sort(array);
        }
        return array;
    }
    
    @Override
    public Object[] toArray() {
        try {
            final Object[] array = super.toArray();
            if (this.field3609 != null) {
                Arrays.sort(array, this.field3609);
            }
            else {
                Arrays.sort(array);
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.toArray(" + ')');
        }
    }
    
    @Override
    public Iterator iterator() {
        try {
            return new class376(this);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.iterator(" + ')');
        }
    }
    
    public int ba() {
        return -1260712261 * this.field3610;
    }
    
    public boolean ce(final Object o) {
        return this.field3606.containsKey(o);
    }
    
    @Override
    public boolean contains(final Object o) {
        try {
            return this.field3606.containsKey(o);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.contains(" + ')');
        }
    }
    
    public Object[] cn() {
        final Object[] array = super.toArray();
        if (this.field3609 != null) {
            Arrays.sort(array, this.field3609);
        }
        else {
            Arrays.sort(array);
        }
        return array;
    }
    
    public boolean bw(final Object o) {
        return this.field3606.containsKey(o);
    }
    
    public boolean cf(final Object o) {
        final class375 class375 = this.field3606.remove(o);
        if (class375 == null) {
            return false;
        }
        this.field3607 += 6390717;
        this.field3610 -= 1689217947;
        if (class375.field3601 * -1919098739 == this.field3610 * -1960181101) {
            this.field3608[-1960181101 * this.field3610] = null;
            return true;
        }
        final class375 class376 = this.field3608[-1960181101 * this.field3610];
        this.field3608[this.field3610 * -1960181101] = null;
        this.field3608[-1919098739 * class375.field3601] = class376;
        this.field3608[class375.field3601 * -1919098739].field3601 = class375.field3601 * 1;
        this.method1996(-1919098739 * class375.field3601, (byte)30);
        if (this.field3608[-1919098739 * class375.field3601] == class376) {
            this.method1995(-1919098739 * class375.field3601, (byte)(-101));
        }
        return true;
    }
    
    public Object ao() {
        if (this.field3610 * -1960181101 == 0) {
            return null;
        }
        return this.field3608[0].field3600;
    }
    
    public Object at() {
        if (this.field3610 * -1960181101 == 0) {
            return null;
        }
        return this.field3608[0].field3600;
    }
    
    void av(int i) {
        final class375 class375 = this.field3608[i];
        while (i > 0) {
            final int n = i - 1 >>> 1;
            final class375 class376 = this.field3608[n];
            if (null != this.field3609) {
                if (this.field3609.compare(class375.field3600, class376.field3600) >= 0) {
                    break;
                }
            }
            else if (((Comparable)class375.field3600).compareTo(class376.field3600) >= 0) {
                break;
            }
            this.field3608[i] = class376;
            this.field3608[i].field3601 = -450371003 * i;
            i = n;
        }
        this.field3608[i] = class375;
        this.field3608[i].field3601 = -450371003 * i;
    }
    
    @Override
    public Object peek() {
        try {
            if (this.field3610 * -1960181101 == 0) {
                return null;
            }
            return this.field3608[0].field3600;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.peek(" + ')');
        }
    }
    
    public Object ax() {
        if (-560976972 * this.field3610 == 0) {
            return null;
        }
        this.field3607 += 221819636;
        final Object field3600 = this.field3608[0].field3600;
        this.field3606.remove(field3600);
        this.field3610 -= 1689217947;
        if (this.field3610 * 1834638852 == 0) {
            this.field3608[-1960181101 * this.field3610] = null;
        }
        else {
            this.field3608[0] = this.field3608[this.field3610 * -1960181101];
            this.field3608[0].field3601 = 0;
            this.field3608[-1960181101 * this.field3610] = null;
            this.method1996(0, (byte)85);
        }
        return field3600;
    }
    
    public Object ay() {
        if (this.field3607 * -1960181101 == 0) {
            return null;
        }
        return this.field3608[0].field3600;
    }
    
    @Override
    public Object poll() {
        try {
            if (-1960181101 * this.field3610 == 0) {
                return null;
            }
            this.field3607 += 6390717;
            final Object field3600 = this.field3608[0].field3600;
            this.field3606.remove(field3600);
            this.field3610 -= 1689217947;
            if (this.field3610 * -1960181101 == 0) {
                this.field3608[-1960181101 * this.field3610] = null;
            }
            else {
                this.field3608[0] = this.field3608[this.field3610 * -1960181101];
                this.field3608[0].field3601 = 0;
                this.field3608[-1960181101 * this.field3610] = null;
                this.method1996(0, (byte)55);
            }
            return field3600;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.poll(" + ')');
        }
    }
    
    public Object[] cc() {
        final Object[] array = super.toArray();
        if (this.field3609 != null) {
            Arrays.sort(array, this.field3609);
        }
        else {
            Arrays.sort(array);
        }
        return array;
    }
    
    @Override
    public boolean offer(final Object o) {
        try {
            if (this.field3606.containsKey(o)) {
                throw new IllegalArgumentException("");
            }
            this.field3607 += 6390717;
            final int n = this.field3610 * -1960181101;
            if (n >= this.field3608.length) {
                this.method1997((byte)7);
            }
            this.field3610 += 1689217947;
            if (n == 0) {
                this.field3608[0] = new class375(o, 0);
                this.field3606.put(o, this.field3608[0]);
            }
            else {
                this.field3608[n] = new class375(o, n);
                this.field3606.put(o, this.field3608[n]);
                this.method1995(n, (byte)(-89));
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.offer(" + ')');
        }
    }
    
    public boolean ci(final Object o) {
        return this.field3606.containsKey(o);
    }
    
    void method1996(int i, final byte b) {
        try {
            final class375 class375 = this.field3608[i];
            while (i < -1960181101 * this.field3610 >>> 1) {
                final int n = (i << 1) + 1;
                final class375 class376 = this.field3608[n];
                final int n2 = 2 + (i << 1);
                final class375 class377 = this.field3608[n2];
                int n3 = 0;
                Label_0219: {
                    if (null != this.field3609) {
                        if (b <= 8) {
                            throw new IllegalStateException();
                        }
                        if (n2 < -1960181101 * this.field3610) {
                            if (b <= 8) {
                                throw new IllegalStateException();
                            }
                            if (this.field3609.compare(class376.field3600, class377.field3600) > 0) {
                                if (b <= 8) {
                                    return;
                                }
                                n3 = n2;
                                break Label_0219;
                            }
                        }
                        n3 = n;
                    }
                    else {
                        if (n2 < -1960181101 * this.field3610) {
                            if (b <= 8) {
                                return;
                            }
                            if (((Comparable)class376.field3600).compareTo(class377.field3600) > 0) {
                                n3 = n2;
                                break Label_0219;
                            }
                        }
                        n3 = n;
                    }
                }
                if (null != this.field3609) {
                    if (b <= 8) {
                        throw new IllegalStateException();
                    }
                    if (this.field3609.compare(class375.field3600, this.field3608[n3].field3600) <= 0) {
                        if (b <= 8) {
                            return;
                        }
                        break;
                    }
                }
                else if (((Comparable)class375.field3600).compareTo(this.field3608[n3].field3600) <= 0) {
                    if (b <= 8) {
                        return;
                    }
                    break;
                }
                this.field3608[i] = this.field3608[n3];
                this.field3608[i].field3601 = -450371003 * i;
                i = n3;
            }
            this.field3608[i] = class375;
            this.field3608[i].field3601 = -450371003 * i;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.aw(" + ')');
        }
    }
    
    public Object al() {
        if (this.field3610 * 605854129 == 0) {
            return null;
        }
        return this.field3608[0].field3600;
    }
    
    void method1995(int i, final byte b) {
        try {
            final class375 class375 = this.field3608[i];
            while (i > 0) {
                if (b >= 5) {
                    return;
                }
                final int n = i - 1 >>> 1;
                final class375 class376 = this.field3608[n];
                if (null != this.field3609) {
                    if (this.field3609.compare(class375.field3600, class376.field3600) >= 0) {
                        break;
                    }
                }
                else if (((Comparable)class375.field3600).compareTo(class376.field3600) >= 0) {
                    if (b >= 5) {
                        return;
                    }
                    break;
                }
                this.field3608[i] = class376;
                this.field3608[i].field3601 = -450371003 * i;
                i = n;
            }
            this.field3608[i] = class375;
            this.field3608[i].field3601 = -450371003 * i;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.an(" + ')');
        }
    }
    
    static Object[] method1998(final Buffer buffer, final int[] array, final byte b) {
        try {
            final int uShortSmart = buffer.readUShortSmart(-1448696249);
            final Object[] array2 = new Object[uShortSmart * array.length];
            for (int i = 0; i < uShortSmart; ++i) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                for (int j = 0; j < array.length; ++j) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    array2[j + i * array.length] = class103.method639(array[j], -1314441096).method2435(buffer, -1183771146);
                }
            }
            return array2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.ac(" + ')');
        }
    }
    
    void method1998() {
        this.field3608 = Arrays.copyOf(this.field3608, 1 + (this.field3608.length << 1));
    }
    
    public static Widget zf(final class205 class205) {
        return class205.field1850;
    }
    
    public static Iterator bq(final class377 class377) {
        if (class377 == null) {
            class377.method1998();
        }
        return new class376(class377);
    }
    
    public int bq() {
        return -1960181101 * this.field3610;
    }
    
    void au() {
        this.field3608 = Arrays.copyOf(this.field3608, 1 + (this.field3608.length << 1));
    }
    
    public Object aa() {
        if (this.field3610 * -1960181101 == 0) {
            return null;
        }
        return this.field3608[0].field3600;
    }
    
    public Object ai() {
        if (-1960181101 * this.field3610 == 0) {
            return null;
        }
        this.field3607 += 6390717;
        final Object field3600 = this.field3608[0].field3600;
        this.field3606.remove(field3600);
        this.field3610 -= 1689217947;
        if (this.field3610 * -1960181101 == 0) {
            this.field3608[-1960181101 * this.field3610] = null;
        }
        else {
            this.field3608[0] = this.field3608[this.field3610 * -1960181101];
            this.field3608[0].field3601 = 0;
            this.field3608[-1960181101 * this.field3610] = null;
            this.method1996(0, (byte)78);
        }
        return field3600;
    }
    
    public Iterator bg() {
        return new class376(this);
    }
    
    void method1997(final byte b) {
        try {
            this.field3608 = Arrays.copyOf(this.field3608, 1 + (this.field3608.length << 1));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oe.af(" + ')');
        }
    }
    
    public boolean ab(final Object o) {
        if (this.field3606.containsKey(o)) {
            throw new IllegalArgumentException("");
        }
        this.field3607 += 6390717;
        final int n = this.field3610 * -1960181101;
        if (n >= this.field3608.length) {
            this.method1997((byte)90);
        }
        this.field3610 += 1689217947;
        if (n == 0) {
            this.field3608[0] = new class375(o, 0);
            this.field3606.put(o, this.field3608[0]);
        }
        else {
            this.field3608[n] = new class375(o, n);
            this.field3606.put(o, this.field3608[n]);
            this.method1995(n, (byte)(-98));
        }
        return true;
    }
    
    public boolean aq(final Object o) {
        if (this.field3606.containsKey(o)) {
            throw new IllegalArgumentException("");
        }
        this.field3607 += 6390717;
        final int n = this.field3610 * -1960181101;
        if (n >= this.field3608.length) {
            this.method1997((byte)81);
        }
        this.field3610 += 1689217947;
        if (n == 0) {
            this.field3608[0] = new class375(o, 0);
            this.field3606.put(o, this.field3608[0]);
        }
        else {
            this.field3608[n] = new class375(o, n);
            this.field3606.put(o, this.field3608[n]);
            this.method1995(n, (byte)(-127));
        }
        return true;
    }
    
    public Object ag() {
        if (-1960181101 * this.field3610 == 0) {
            return null;
        }
        this.field3607 += 6390717;
        final Object field3600 = this.field3608[0].field3600;
        this.field3606.remove(field3600);
        this.field3610 -= 1689217947;
        if (this.field3610 * -1960181101 == 0) {
            this.field3608[-1960181101 * this.field3610] = null;
        }
        else {
            this.field3608[0] = this.field3608[this.field3610 * -1960181101];
            this.field3608[0].field3601 = 0;
            this.field3608[-1960181101 * this.field3610] = null;
            this.method1996(0, (byte)42);
        }
        return field3600;
    }
    
    public static boolean mg(final class377 class377, final Object o) {
        return class377.field3606.containsKey(o);
    }
    
    public static void yx(final class377 class377, int i) {
        if (class377 == null) {
            class377.av(i);
        }
        final class375 class378 = class377.field3608[i];
        while (i > 0) {
            final int n = i - 1 >>> 1;
            final class375 class379 = class377.field3608[n];
            if (null != class377.field3609) {
                if (class377.field3609.compare(class378.field3600, class379.field3600) >= 0) {
                    break;
                }
            }
            else if (((Comparable)class378.field3600).compareTo(class379.field3600) >= 0) {
                break;
            }
            class377.field3608[i] = class379;
            class377.field3608[i].field3601 = -450371003 * i;
            i = n;
        }
        class377.field3608[i] = class378;
        class377.field3608[i].field3601 = -450371003 * i;
    }
    
    void ah(int i) {
        final class375 class375 = this.field3608[i];
        while (i > 0) {
            final int n = i - 1 >>> 1;
            final class375 class376 = this.field3608[n];
            if (null != this.field3609) {
                if (this.field3609.compare(class375.field3600, class376.field3600) >= 0) {
                    break;
                }
            }
            else if (((Comparable)class375.field3600).compareTo(class376.field3600) >= 0) {
                break;
            }
            this.field3608[i] = class376;
            this.field3608[i].field3601 = -450371003 * i;
            i = n;
        }
        this.field3608[i] = class375;
        this.field3608[i].field3601 = -450371003 * i;
    }
    
    public int bf() {
        return -1960181101 * this.field3610;
    }
    
    public Iterator bu() {
        return new class376(this);
    }
}
