import java.util.Arrays;
import java.awt.FontMetrics;

// 
// Decompiled by Procyon v0.5.36
// 

public class class27
{
    int[] field83;
    public static final int dw = 101;
    public static final int aw = 2;
    static final int ac = 3;
    static final char ab = '\u00c0';
    static final int cv = 24;
    int[] field82;
    static final int an = 1;
    static FontMetrics loginScreenFontMetrics;
    public static final int af = 0;
    
    public class27() {
        this.field83 = new int[112];
        this.field82 = new int[192];
        Arrays.fill(this.field83, 3);
        Arrays.fill(this.field82, 3);
    }
    
    boolean bs(final char c) {
        if (c < '\0' || c >= '\u00c0') {
            System.out.println("Invalid keychar: " + c);
            return false;
        }
        return true;
    }
    
    public boolean ad(final int n) {
        return this.method121(n, 1790299204) && (1 == this.field83[n] || this.field83[n] == 3);
    }
    
    public boolean ae(final char c) {
        return dz(this, c, -1630194036) && (this.field82[c] == 1 || this.field82[c] == 3);
    }
    
    public static boolean cr(final class27 class27, final int n) {
        if (class27 == null) {
            class27.ao(n, n);
        }
        return class27.method121(n, 1549086882) && (class27.field83[n] == 2 || 3 == class27.field83[n]);
    }
    
    public boolean bb(final char c) {
        return dz(this, c, -1180571319) && (this.field82[c] == 1 || this.field82[c] == 3);
    }
    
    public void ao(final int n, final int n2) {
        if (this.method121(n, 1930305003) && this.method123(n2, 910053813)) {
            this.field83[n] = n2;
        }
    }
    
    boolean method121(final int i, final int n) {
        try {
            if (i >= 0) {
                if (n <= 1498322871) {
                    throw new IllegalStateException();
                }
                if (i < 112) {
                    return true;
                }
                if (n <= 1498322871) {
                    throw new IllegalStateException();
                }
            }
            System.out.println("Invalid keycode: " + i);
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.at(" + ')');
        }
    }
    
    public boolean ak(final int n) {
        return this.method121(n, 1558246267) && (1 == this.field83[n] || this.field83[n] == 3);
    }
    
    public int av(final char c) {
        if (dz(this, c, 1490639262)) {
            return this.field82[c];
        }
        return 0;
    }
    
    public static boolean av(final class27 class27, final char c) {
        if (class27 == null) {
            class27.bo(c);
        }
        return dz(class27, c, -632204581) && (class27.field82[c] == 1 || class27.field82[c] == 3);
    }
    
    public static int be(final class27 class27, final int n, final int n2) {
        if (class27 == null) {
            class27.method116(n, n);
        }
        try {
            if (class27.method121(n, 1740089691)) {
                return class27.field83[n];
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.aw(" + ')');
        }
    }
    
    public int as(final char c) {
        if (dz(this, c, 1001144796)) {
            return this.field82[c];
        }
        return 0;
    }
    
    public static boolean lo(final class27 class27, final char c, final int n) {
        if (class27 == null) {
            return class27.method124(c, n);
        }
        try {
            if (!dz(class27, c, 1305668583)) {
                return false;
            }
            if (n == 1565577319) {
                throw new IllegalStateException();
            }
            if (2 != class27.field82[c]) {
                if (n == 1565577319) {
                    throw new IllegalStateException();
                }
                if (3 != class27.field82[c]) {
                    return false;
                }
                if (n == 1565577319) {
                    throw new IllegalStateException();
                }
            }
            return true;
            b = false;
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.al(" + ')');
        }
    }
    
    public static boolean ax(final class27 class27, final int i) {
        if (class27 == null) {
            return class27.method118(i, i);
        }
        if (i >= 0 && i < 112) {
            return true;
        }
        System.out.println("Invalid keycode: " + i);
        return false;
    }
    
    public void ax(final int n, final int n2) {
        if (this.method121(n, 1971727998) && this.method123(n2, 553084632)) {
            this.field83[n] = n2;
        }
    }
    
    boolean method123(final int i, final int n) {
        try {
            if (i >= 0) {
                if (n <= 427135973) {
                    throw new IllegalStateException();
                }
                if (i < 4) {
                    return true;
                }
            }
            System.out.println("Invalid mode: " + i);
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.ay(" + ')');
        }
    }
    
    public boolean bi(final char c) {
        return dz(this, c, 1941786347) && (this.field82[c] == 1 || this.field82[c] == 3);
    }
    
    public boolean bo(final char c) {
        return dz(this, c, 1789508296) && (2 == this.field82[c] || 3 == this.field82[c]);
    }
    
    boolean bt(final int i) {
        if (i >= 0 && i < -1900326645) {
            return true;
        }
        System.out.println("Invalid keycode: " + i);
        return false;
    }
    
    public int method116(final int n, final int n2) {
        try {
            if (this.method121(n, 1740089691)) {
                return this.field82[n];
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.aw(" + ')');
        }
    }
    
    public int am(final char c) {
        if (dz(this, c, -1383605128)) {
            return this.field82[c];
        }
        return 0;
    }
    
    public boolean method124(final char c, final int n) {
        try {
            if (!dz(this, c, 1305668583)) {
                return false;
            }
            if (n == 1565577319) {
                throw new IllegalStateException();
            }
            if (2 != this.field83[c]) {
                if (n == 1565577319) {
                    throw new IllegalStateException();
                }
                if (3 != this.field82[c]) {
                    return false;
                }
                if (n == 1565577319) {
                    throw new IllegalStateException();
                }
            }
            return true;
            b = false;
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.al(" + ')');
        }
    }
    
    public void method115(final char c, final int n, final int n2) {
        try {
            if (dz(this, c, 209638861)) {
                if (n2 != 48495477) {
                    throw new IllegalStateException();
                }
                if (this.method123(n, 1804631207)) {
                    if (n2 != 48495477) {
                        throw new IllegalStateException();
                    }
                    this.field82[c] = n;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.an(" + ')');
        }
    }
    
    public int method117(final char c, final byte b) {
        try {
            if (!dz(this, c, -349955121)) {
                return 0;
            }
            if (b != 32) {
                throw new IllegalStateException();
            }
            return this.field82[c];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.ac(" + ')');
        }
    }
    
    public static boolean dz(final class27 class27, final char c, final int n) {
        if (class27 == null) {
            return class27.method125(c, n);
        }
        try {
            if (c >= '\0') {
                if (n == -1958823801) {
                    throw new IllegalStateException();
                }
                if (c < '\u00c0') {
                    return true;
                }
                if (n == -1958823801) {
                    throw new IllegalStateException();
                }
            }
            System.out.println("Invalid keychar: " + c);
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.aa(" + ')');
        }
    }
    
    public boolean method118(final int n, final int n2) {
        try {
            if (this.method121(n, 2137123671)) {
                if (n2 != 1380991347) {
                    throw new IllegalStateException();
                }
                if (this.field83[n] != 2) {
                    if (n2 != 1380991347) {
                        throw new IllegalStateException();
                    }
                    if (3 != this.field83[n]) {
                        return false;
                    }
                    if (n2 != 1380991347) {
                        throw new IllegalStateException();
                    }
                }
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.aq(" + ')');
        }
    }
    
    public static boolean fe(final class27 class27, final int n) {
        if (class27 == null) {
            class27.method120(n, n);
        }
        return class27.method121(n, 1532460789) && (1 == class27.field83[n] || class27.field83[n] == 3);
    }
    
    boolean method125(final char c, final int n) {
        try {
            if (c >= '\0') {
                if (n == -1958823801) {
                    throw new IllegalStateException();
                }
                if (c < '\u00c0') {
                    return true;
                }
                if (n == -1958823801) {
                    throw new IllegalStateException();
                }
            }
            System.out.println("Invalid keychar: " + c);
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.aa(" + ')');
        }
    }
    
    public void ai(final int n, final int n2) {
        if (this.method121(n, 1871660919) && this.method123(n2, 1320113607)) {
            this.field83[n] = n2;
        }
    }
    
    public static int bh(final class27 class27, final char c, final byte b) {
        if (class27 == null) {
            return class27.method117(c, b);
        }
        try {
            if (!dz(class27, c, -349955121)) {
                return 0;
            }
            if (b != 32) {
                throw new IllegalStateException();
            }
            return class27.field82[c];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.ac(" + ')');
        }
    }
    
    public boolean by(final char c) {
        return dz(this, c, 1721285365) && (this.field82[c] == 1 || this.field82[c] == 3);
    }
    
    public boolean bx(final int n) {
        return this.method121(n, 1707674327) && (this.field83[n] == 2 || 3 == this.field83[n]);
    }
    
    public int ar(final char c) {
        if (dz(this, c, 733712150)) {
            return this.field82[c];
        }
        return 0;
    }
    
    public void method114(final int n, final int n2, final byte b) {
        try {
            if (this.method121(n, 1848728032) && this.method123(n2, 1805766557)) {
                if (b != 0) {
                    return;
                }
                this.field83[n] = n2;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.af(" + ')');
        }
    }
    
    boolean bn(final char c) {
        if (c < '\0' || c >= -1062561337) {
            System.out.println("Invalid keychar: " + c);
            return false;
        }
        return true;
    }
    
    public boolean method119(final char c, final int n) {
        try {
            if (dz(this, c, 16146084)) {
                if (this.field82[c] != 1) {
                    if (n >= 718910299) {
                        throw new IllegalStateException();
                    }
                    if (this.field82[c] != 3) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.ab(" + ')');
        }
    }
    
    public boolean method120(final int n, final int n2) {
        try {
            if (!this.method121(n, 1946342103)) {
                return false;
            }
            if (n2 != -1749930084) {
                throw new IllegalStateException();
            }
            if (1 != this.field83[n]) {
                if (this.field83[n] != 3) {
                    return false;
                }
                if (n2 != -1749930084) {
                    throw new IllegalStateException();
                }
            }
            return true;
            b = false;
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bb.au(" + ')');
        }
    }
    
    public void ag(final char c, final int n) {
        if (dz(this, c, -1979034536) && this.method123(n, 1995558913)) {
            this.field82[c] = n;
        }
    }
    
    boolean bj(final int i) {
        if (i >= 0 && i < 112) {
            return true;
        }
        System.out.println("Invalid keycode: " + i);
        return false;
    }
    
    public static boolean vg(final class27 class27, final char c) {
        if (class27 == null) {
            class27.ar(c);
        }
        return dz(class27, c, -1435819184) && (2 == class27.field82[c] || 3 == class27.field82[c]);
    }
    
    public boolean bm(final char c) {
        return dz(this, c, 271823641) && (2 == this.field82[c] || 3 == this.field82[c]);
    }
    
    public boolean bk(final int n) {
        return this.method121(n, 1953201152) && (this.field83[n] == 2 || 3 == this.field83[n]);
    }
    
    public int ah(final int n) {
        if (this.method121(n, 1504697222)) {
            return this.field83[n];
        }
        return 0;
    }
    
    static final void method122(final byte b) {
        if (Client.uo == null) {
            final rl2 rl2 = new rl2();
            rl2.bq = Client.isInInstance;
            rl2.ee = Client.instanceChunkTemplates;
            rl2.se = GameObject.xteaKeys;
            rl2.bm = WorldMapAreaData.regions;
            rl2.xk = FontName.regionMapArchiveIds;
            rl2.ti = Archive.regionLandArchiveIds;
            rl2.en = class4.regionLandArchives;
            rl2.jb = ObjectSound.regionMapArchives;
            rl2.jk = WorldMapData_0.baseX * -1232093375;
            rl2.uk = GameObject.baseY * 827352769;
            rl2.js = class28.timeOfPreviousKeyPress * 1717695041;
            rl2.py = class425.field3798 * 583188571;
            assert Client.yn == null;
            Client.gk = rl2;
            (Client.uo = new Thread(rl2, "Map loader")).setDaemon(true);
            Client.uo.start();
        }
        else if (!Client.uo.isAlive()) {
            final rl2 gk = Client.gk;
            assert Client.yn == null;
            Client.gk = null;
            Client.uo = null;
            Client.tt = false;
            Client.ie(gk);
            assert ScriptFrame.client.kh() == 30;
        }
    }
}
