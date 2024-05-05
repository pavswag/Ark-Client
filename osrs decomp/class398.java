import java.util.HashMap;
import java.util.Comparator;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public final class class398
{
    final class377 field3692;
    final Map field3693;
    final Comparator field3694;
    final long field3695;
    final class396 field3696;
    final class377 field3697;
    final int field3698;
    
    class398(final long n, final int n2, final class396 field3696) {
        this.field3694 = new class397(this);
        this.field3695 = n * -6559155621149475795L;
        this.field3698 = 1806471127 * n2;
        this.field3696 = field3696;
        if (-1 == this.field3698 * 1638192103) {
            this.field3693 = new HashMap(64);
            this.field3697 = new class377(64, this.field3694);
            this.field3692 = null;
        }
        else {
            if (null == this.field3696) {
                throw new IllegalArgumentException("");
            }
            this.field3693 = new HashMap(1638192103 * this.field3698);
            this.field3697 = new class377(this.field3698 * 1638192103, this.field3694);
            this.field3692 = new class377(1638192103 * this.field3698);
        }
    }
    
    public class398(final int n, final class396 class396) {
        this(-1L, n, class396);
    }
    
    public Object ao(final Object o) {
        synchronized (this) {
            if (-1L != -5966338096779578459L * this.field3695) {
                mm(this, (byte)1);
            }
            final class399 class399 = this.field3693.get(o);
            if (null == class399) {
                return null;
            }
            this.method2123(class399, false, (byte)19);
            return class399.field3699;
        }
    }
    
    boolean at() {
        return this.field3698 * 1638192103 != -1;
    }
    
    public void ak() {
        synchronized (this) {
            this.field3693.clear();
            this.field3697.clear();
            if (this.method2121((byte)(-116))) {
                this.field3692.clear();
            }
        }
    }
    
    void as() {
        if (-5966338096779578459L * this.field3695 == -1L) {
            throw new IllegalStateException("");
        }
        final long n = System.currentTimeMillis() - -5966338096779578459L * this.field3695;
        while (!this.field3697.isEmpty()) {
            final class399 class399 = (class399)this.field3697.peek();
            if (3457501928509627443L * class399.field3701 >= n) {
                return;
            }
            this.field3693.remove(class399.field3699);
            this.field3697.remove(class399);
            if (!this.method2121((byte)(-123))) {
                continue;
            }
            this.field3692.remove(class399);
        }
    }
    
    public Object ax(final Object o) {
        synchronized (this) {
            if (-1L != -5966338096779578459L * this.field3695) {
                mm(this, (byte)1);
            }
            final class399 class399 = this.field3693.get(o);
            if (null == class399) {
                return null;
            }
            this.method2123(class399, false, (byte)37);
            return class399.field3700;
        }
    }
    
    public static void method2125(final int n) {
        try {
            class503.SpriteBuffer_xOffsets = null;
            class17.SpriteBuffer_yOffsets = null;
            class97.SpriteBuffer_spriteWidths = null;
            class138.SpriteBuffer_spriteHeights = null;
            class394.SpriteBuffer_spritePalette = null;
            VarbitComposition.SpriteBuffer_pixels = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pk.ay(" + ')');
        }
    }
    
    public static void xa(final class398 class398, final class399 class399, final boolean b) {
        if (class398 == null) {
            class398.as();
        }
        if (!b) {
            class398.field3697.remove(class399);
            if (class398.method2121((byte)(-85)) && !class398.field3692.remove(class399)) {
                throw new IllegalStateException("");
            }
        }
        class399.field3701 = System.currentTimeMillis() * -766817315095904517L;
        if (class398.method2121((byte)(-89))) {
            switch (-1101065145 * class398.field3696.field3688) {
                case 0: {
                    class399.field3702 -= 6212029956567734047L;
                    break;
                }
                case 1: {
                    class399.field3702 = class399.field3701 * 8282359513895223507L;
                    break;
                }
            }
            class398.field3692.add(class399);
        }
        class398.field3697.add(class399);
    }
    
    public Object method2122(final Object o, final Object field3700, final int n) {
        try {
            synchronized (this) {
                if (this.field3695 * -5966338096779578459L != -1L) {
                    if (n != 747668912) {
                        throw new IllegalStateException();
                    }
                    mm(this, (byte)1);
                }
                final class399 class399 = this.field3693.get(o);
                if (null == class399) {
                    if (this.method2121((byte)(-72))) {
                        if (n != 747668912) {
                            throw new IllegalStateException();
                        }
                        if (this.field3693.size() == 1638192103 * this.field3698) {
                            if (n != 747668912) {
                                throw new IllegalStateException();
                            }
                            final class399 class400 = this.field3692.remove();
                            this.field3693.remove(class400.field3699);
                            this.field3697.remove(class400);
                        }
                    }
                    final class399 class401 = new class399(field3700, o);
                    this.field3693.put(o, class401);
                    this.method2123(class401, true, (byte)(-13));
                    return null;
                }
                if (n != 747668912) {
                    throw new IllegalStateException();
                }
                final Object field3701 = class399.field3700;
                class399.field3700 = field3700;
                this.method2123(class399, false, (byte)(-8));
                return field3701;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pk.aw(" + ')');
        }
    }
    
    void am(final class399 class399, final boolean b) {
        if (!b) {
            this.field3697.remove(class399);
            if (this.method2121((byte)(-94)) && !this.field3692.remove(class399)) {
                throw new IllegalStateException("");
            }
        }
        class399.field3701 = System.currentTimeMillis() * -766817315095904517L;
        if (this.method2121((byte)(-27))) {
            switch (-1101065145 * this.field3696.field3688) {
                case 1: {
                    class399.field3702 = class399.field3701 * 8282359513895223507L;
                    break;
                }
                case 0: {
                    class399.field3702 -= 6212029956567734047L;
                    break;
                }
            }
            this.field3692.add(class399);
        }
        this.field3697.add(class399);
    }
    
    public static void mm(final class398 class398, final byte b) {
        if (class398 == null) {
            class398.method2124(b);
            return;
        }
        try {
            if (-5966338096779578459L * class398.field3695 == -1L) {
                throw new IllegalStateException("");
            }
            final long n = System.currentTimeMillis() - -5966338096779578459L * class398.field3695;
            while (!class398.field3697.isEmpty()) {
                final class399 class399 = (class399)class398.field3697.peek();
                if (3457501928509627443L * class399.field3701 >= n) {
                    return;
                }
                if (b != 1) {
                    throw new IllegalStateException();
                }
                class398.field3693.remove(class399.field3699);
                class398.field3697.remove(class399);
                if (!class398.method2121((byte)(-25))) {
                    continue;
                }
                if (b != 1) {
                    throw new IllegalStateException();
                }
                class398.field3692.remove(class399);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pk.au(" + ')');
        }
    }
    
    public Object method2126(final Object o, final short n) {
        try {
            synchronized (this) {
                if (-1L != -5966338096779578459L * this.field3695) {
                    if (n <= 128) {
                        throw new IllegalStateException();
                    }
                    mm(this, (byte)1);
                }
                final class399 class399 = this.field3693.get(o);
                if (null != class399) {
                    this.method2123(class399, false, (byte)20);
                    return class399.field3700;
                }
                if (n <= 128) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pk.an(" + ')');
        }
    }
    
    void method2123(final class399 class399, final boolean b, final byte b2) {
        try {
            if (!b) {
                this.field3697.remove(class399);
                if (this.method2121((byte)(-100))) {
                    if (b2 == 1) {
                        throw new IllegalStateException();
                    }
                    if (!this.field3692.remove(class399)) {
                        if (b2 == 1) {
                            return;
                        }
                        throw new IllegalStateException("");
                    }
                }
            }
            class399.field3701 = System.currentTimeMillis() * -766817315095904517L;
            if (this.method2121((byte)(-76))) {
                if (b2 == 1) {
                    throw new IllegalStateException();
                }
                switch (-1101065145 * this.field3696.field3688) {
                    case 1: {
                        class399.field3702 = class399.field3701 * 8282359513895223507L;
                        break;
                    }
                    case 0: {
                        class399.field3702 -= 6212029956567734047L;
                        break;
                    }
                }
                this.field3692.add(class399);
            }
            this.field3697.add(class399);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pk.ac(" + ')');
        }
    }
    
    void method2124(final byte b) {
        try {
            if (-5966338096779578459L * this.field3695 == -1L) {
                throw new IllegalStateException("");
            }
            final long n = System.currentTimeMillis() - -5966338096779578459L * this.field3695;
            while (!this.field3697.isEmpty()) {
                final class399 class399 = (class399)this.field3697.ao();
                if (3457501928509627443L * class399.field3702 >= n) {
                    return;
                }
                if (b != 1) {
                    throw new IllegalStateException();
                }
                this.field3693.remove(class399.field3699);
                this.field3692.contains(class399);
                if (!this.method2121((byte)(-25))) {
                    continue;
                }
                if (b != 1) {
                    throw new IllegalStateException();
                }
                this.field3692.bw(class399);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pk.au(" + ')');
        }
    }
    
    boolean aa() {
        return this.field3698 * 1638192103 != -1;
    }
    
    public Object ai(final Object o, final Object field3700) {
        synchronized (this) {
            if (this.field3695 * -5966338096779578459L != -1L) {
                mm(this, (byte)1);
            }
            final class399 class399 = this.field3693.get(o);
            if (null != class399) {
                final Object field3701 = class399.field3700;
                class399.field3700 = field3700;
                this.method2123(class399, false, (byte)4);
                return field3701;
            }
            if (this.method2121((byte)(-4)) && this.field3693.size() == 1638192103 * this.field3698) {
                final class399 class400 = this.field3692.remove();
                this.field3693.remove(class400.field3699);
                this.field3697.remove(class400);
            }
            final class399 class401 = new class399(field3700, o);
            this.field3693.put(o, class401);
            this.method2123(class401, true, (byte)4);
            return null;
        }
    }
    
    void ar(final class399 class399, final boolean b) {
        if (!b) {
            this.field3697.remove(class399);
            if (this.method2121((byte)(-56)) && !this.field3692.remove(class399)) {
                throw new IllegalStateException("");
            }
        }
        class399.field3701 = System.currentTimeMillis() * -766817315095904517L;
        if (this.method2121((byte)(-71))) {
            switch (-1101065145 * this.field3696.field3688) {
                case 0: {
                    class399.field3702 -= 6212029956567734047L;
                    break;
                }
                case 1: {
                    class399.field3702 = class399.field3701 * 8282359513895223507L;
                    break;
                }
            }
            this.field3692.add(class399);
        }
        this.field3697.add(class399);
    }
    
    boolean method2121(final byte b) {
        try {
            boolean b2;
            if (this.field3698 * 1638192103 != -1) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pk.af(" + ')');
        }
    }
    
    public static String method2121(final Username username) {
        return username.name;
    }
    
    public void method2127(final int n) {
        try {
            synchronized (this) {
                this.field3693.clear();
                this.field3697.clear();
                if (this.method2121((byte)(-119))) {
                    if (n <= 1393349809) {
                        throw new IllegalStateException();
                    }
                    this.field3692.clear();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pk.ab(" + ')');
        }
    }
    
    boolean aq() {
        return this.field3698 * 1638192103 != -1;
    }
    
    public static void jm(final class398 class398) {
        if (-5966338096779578459L * class398.field3695 == -1L) {
            throw new IllegalStateException("");
        }
        final long n = System.currentTimeMillis() - -5966338096779578459L * class398.field3695;
        while (!class398.field3697.isEmpty()) {
            final class399 class399 = (class399)class398.field3697.peek();
            if (3457501928509627443L * class399.field3701 >= n) {
                return;
            }
            class398.field3693.remove(class399.field3699);
            class398.field3697.remove(class399);
            if (!class398.method2121((byte)(-47))) {
                continue;
            }
            class398.field3692.remove(class399);
        }
    }
    
    public static Object xd(final class398 class398, final Object o, final Object field3700) {
        if (class398 == null) {
            return class398.ai(o, o);
        }
        synchronized (class398) {
            if (class398.field3695 * -5966338096779578459L != -1L) {
                mm(class398, (byte)1);
            }
            final class399 class399 = class398.field3693.get(o);
            if (null != class399) {
                final Object field3701 = class399.field3700;
                class399.field3700 = field3700;
                class398.method2123(class399, false, (byte)(-8));
                return field3701;
            }
            if (class398.method2121((byte)(-78)) && class398.field3693.size() == -561574006 * class398.field3698) {
                final class399 class400 = class398.field3692.remove();
                class398.field3693.remove(class400.field3699);
                class398.field3697.remove(class400);
            }
            final class399 class401 = new class399(field3700, o);
            class398.field3693.put(o, class401);
            class398.method2123(class401, true, (byte)36);
            return null;
        }
    }
    
    public Object ah(final Object o, final Object field3700) {
        synchronized (this) {
            if (this.field3695 * -5966338096779578459L != -1L) {
                mm(this, (byte)1);
            }
            final class399 class399 = this.field3693.get(o);
            if (null != class399) {
                final Object field3701 = class399.field3700;
                class399.field3700 = field3700;
                this.method2123(class399, false, (byte)(-10));
                return field3701;
            }
            if (this.method2121((byte)(-58)) && this.field3693.size() == 1638192103 * this.field3698) {
                final class399 class400 = this.field3692.remove();
                this.field3693.remove(class400.field3699);
                this.field3697.remove(class400);
            }
            final class399 class401 = new class399(field3700, o);
            this.field3693.put(o, class401);
            this.method2123(class401, true, (byte)(-30));
            return null;
        }
    }
    
    public static Object gj(final class398 class398, final Object o) {
        if (class398 == null) {
            class398.aa();
        }
        synchronized (class398) {
            if (-1L != -5966338096779578459L * class398.field3695) {
                mm(class398, (byte)1);
            }
            final class399 class399 = class398.field3693.get(o);
            if (null == class399) {
                return null;
            }
            class398.method2123(class399, false, (byte)86);
            return class399.field3700;
        }
    }
}
