import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Clipboard;

// 
// Decompiled by Procyon v0.5.36
// 

public class class314
{
    int field2842;
    int field2843;
    static final int an = 0;
    static final int aq = 0;
    static final int av = 3;
    int field2844;
    static final int au = 3;
    boolean field2846;
    boolean field2848;
    int field2847;
    boolean field2845;
    int field2849;
    class379 field2850;
    class379 field2851;
    int field2852;
    int field2853;
    int field2854;
    int field2855;
    int field2856;
    int field2857;
    static final int aw = 1;
    int field2858;
    int field2859;
    int field2860;
    class308 field2862;
    class308 field2861;
    
    class314() {
        this.field2851 = new class379();
        this.field2850 = new class379();
        this.field2846 = false;
        this.field2848 = true;
        this.field2847 = 0;
        this.field2845 = false;
        this.field2849 = 0;
        this.field2860 = 0;
        this.field2844 = 0;
        this.field2852 = 0;
        this.field2853 = 0;
        this.field2854 = 0;
        this.field2855 = 0;
        this.field2856 = 1473042979;
        this.field2857 = 763922309;
        this.field2842 = 0;
        this.field2858 = 0;
        this.field2859 = 0;
        this.field2843 = 0;
        this.field2851.method2009(1, (byte)(-43));
        this.field2850.method2009(1, (byte)90);
    }
    
    public boolean method1745(final byte b) {
        try {
            if (method1728(this, 1975751028)) {
                if (b >= 69) {
                    throw new IllegalStateException();
                }
                if (-870124373 * this.field2847 % 60 < 30) {
                    return true;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cs(" + ')');
        }
    }
    
    boolean dp(String method1757) {
        if (!class379.mk(this.field2851, -1389348498).equals(method1757)) {
            method1757 = this.method1757(method1757, (byte)2);
            this.field2851.method2014(method1757, -844450457);
            this.method1713(-466889091 * this.field2859, 607166941 * this.field2843, (byte)20);
            this.method1761((byte)94);
            xj(this, 2059732322);
            return true;
        }
        return false;
    }
    
    public void method1724(final boolean b, final int n) {
        try {
            this.method1762(class379.yz(this.field2851, (int)class383.cy(this.field2850.method2035(0, 1350344153 * this.field2847, (byte)81), (byte)114).field3973, 1953737631 * this.field2858 + 607166941 * this.field2855, (byte)(-75)), b, (byte)118);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bs(" + ')');
        }
    }
    
    public void en(final int n) {
        this.field2851.method2009(n, (byte)49);
    }
    
    public boolean method1748(final int n) {
        if (this.method1765(n, (byte)11)) {
            this.kq(-435163155);
            final class380 method2032 = this.field2851.method2032((char)n, this.field2852 * 1184167863, 336147926 * this.field2856, 2095093880);
            this.method1725(class380.bt(method2032, 1114002240), class380.bt(method2032, 510676229), (byte)19);
            this.method1761((byte)5);
            xj(this, 1970938336);
        }
        return true;
    }
    
    boolean method1723(final int n) {
        try {
            return 542296527 * this.field2844 != this.field2857 * 1350344153;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cv(" + ')');
        }
    }
    
    public static void method1723(final class314 class314, final class461 class315, final class461 class316) {
        if (class314 == null) {
            class314.ho();
        }
        if ((int)class316.field3972 < (int)class315.field3972) {
            class314.method1725((int)class315.field3973, (int)class316.field3972, (byte)19);
        }
        else {
            class314.method1725((int)class315.field3972, (int)class316.field3973, (byte)19);
        }
    }
    
    boolean method1782(final int n, final int n2) {
        try {
            if (32 != n) {
                if (n2 <= 762193092) {
                    throw new IllegalStateException();
                }
                if (10 != n) {
                    if (n2 <= 762193092) {
                        throw new IllegalStateException();
                    }
                    if (9 != n) {
                        return false;
                    }
                    if (n2 <= 762193092) {
                        throw new IllegalStateException();
                    }
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cd(" + ')');
        }
    }
    
    public void method1777(final int n) {
        try {
            this.field2843 = Math.max(0, this.field2843 * 607166941 - class379.he(this.field2851, -297150195)) * -2081112459;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ba(" + ')');
        }
    }
    
    public void method1787(final byte b) {
        try {
            this.field2856 = Math.min(Math.max(0, this.field2850.method2006(-2065329489) - 1953737631 * this.field2854), 607166941 * this.field2859 + class379.he(this.field2851, -297150195)) * -2081112459;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bv(" + ')');
        }
    }
    
    public static boolean method1753(final class314 class314) {
        if (class314 == null) {
            class314.iz();
        }
        return method1728(class314, 1746277733) && -870124373 * class314.field2847 % 60 < 30;
    }
    
    public int method1753(final int n) {
        try {
            return this.field2853 * 542296527;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cn(" + ')');
        }
    }
    
    public boolean method1743(int n) {
        if (n < 0) {
            n = Integer.MAX_VALUE;
        }
        boolean b = n == this.field2851.method2038(-1296915014);
        this.field2851.method2033(n, (byte)2);
        this.field2850.method2033(n, (byte)2);
        if (this.method1761((byte)(-81))) {
            xj(this, 1778142317);
            b = true;
        }
        return b;
    }
    
    public void method1772(final boolean b, final int n) {
        try {
            this.method1762((int)ws(this, 1350344153 * this.field2852, -600467207).field3973, b, (byte)31);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bb(" + ')');
        }
    }
    
    String method1757(final String s, final byte b) {
        try {
            final StringBuilder sb = new StringBuilder(s.length());
            for (int i = 0; i < s.length(); ++i) {
                final char char1 = s.charAt(i);
                if (this.method1765(char1, (byte)11)) {
                    if (b >= 99) {
                        throw new IllegalStateException();
                    }
                    sb.append(char1);
                }
            }
            return sb.toString();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cb(" + ')');
        }
    }
    
    public boolean da(final int n) {
        try {
            return this.field2845;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ca(" + ')');
        }
    }
    
    public static void ov(final class314 class314, final byte b) {
        if (class314 == null) {
            class314.method1779(b);
        }
        try {
            class314.field2847 = (-870124373 * class314.field2847 + 1) % 60 * -867080701;
            if (2106407237 * class314.field2855 > 0) {
                if (b == 1) {
                    return;
                }
                class314.field2855 -= 238055821;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.af(" + ')');
        }
    }
    
    void method1762(final int n, final boolean b, final byte b2) {
        try {
            if (b) {
                if (b2 <= -1) {
                    return;
                }
                this.method1725(this.field2853 * 542296527, n, (byte)19);
            }
            else {
                this.method1725(n, n, (byte)19);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ch(" + ')');
        }
    }
    
    public void el(final int n) {
        this.field2849 = n * 258208179;
    }
    
    public int method1752(final byte b) {
        try {
            return this.field2849 * 1959011707;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cl(" + ')');
        }
    }
    
    public static class461 method1747(final class314 class314, final int n) {
        if (class314 == null) {
            return class314.ja(n);
        }
        final int method2006 = class314.field2851.method2006(1769580829);
        int i = 0;
        int j = method2006;
        for (int k = n; k > 0; --k) {
            if (class314.method1782(class379.ml(class314.field2851, k - 1, 1075515195).field3624, 1107347939)) {
                i = k;
                break;
            }
        }
        for (int l = n; l < method2006; ++l) {
            if (class314.method1782(class379.ml(class314.field2851, l, 442864134).field3624, 2088968886)) {
                j = l;
                break;
            }
        }
        return new class461(i, j);
    }
    
    public int method1747(final int n) {
        try {
            return 607166941 * this.field2859;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ck(" + ')');
        }
    }
    
    public static boolean method1747(final class314 class314, final int n) {
        if (class314 == null) {
            class314.es(n);
        }
        if (class314.method1765(n, (byte)11)) {
            class314.kq(1411119150);
            final class380 method2032 = class314.field2851.method2032((char)n, class314.field2852 * 1350344153, -1383048587 * class314.field2856, 1470568688);
            class314.method1725(class380.bt(method2032, 492557457), class380.bt(method2032, 1112078186), (byte)19);
            class314.method1761((byte)103);
            xj(class314, 1382969948);
        }
        return true;
    }
    
    public int id() {
        return this.field2857 * 626167564;
    }
    
    public int in() {
        return this.field2853 * 542296527;
    }
    
    boolean db(String method1757) {
        if (!class379.mk(this.field2851, -1389348498).equals(method1757)) {
            method1757 = this.method1757(method1757, (byte)(-77));
            this.field2851.method2014(method1757, -844450457);
            this.method1713(-466889091 * this.field2859, 607166941 * this.field2843, (byte)99);
            this.method1761((byte)55);
            xj(this, 1321759705);
            return true;
        }
        return false;
    }
    
    public static void sd(final class314 class314) {
        final class461 cy = class383.cy(class314.field2851.method2035(0, 1350344153 * class314.field2852, (byte)52), (byte)104);
        final int he = class379.he(class314.field2851, -297150195);
        final int n = (int)cy.field3972 - 10;
        final int n2 = n + 20;
        final int n3 = (int)cy.field3973 - 3;
        final int n4 = he + (6 + n3);
        final int n5 = class314.field2859 * -466889091;
        final int n6 = n5 + -212351097 * class314.field2842;
        final int n7 = class314.field2843 * 607166941;
        final int n8 = 1953737631 * class314.field2858 + n7;
        int n9 = -466889091 * class314.field2859;
        int n10 = 607166941 * class314.field2843;
        if (n < n5) {
            n9 = n;
        }
        else if (n2 > n6) {
            n9 = n2 - class314.field2842 * -212351097;
        }
        if (n3 < n7) {
            n10 = n3;
        }
        else if (n4 > n8) {
            n10 = n4 - class314.field2858 * 1953737631;
        }
        class314.method1713(n9, n10, (byte)44);
    }
    
    class461 method1767(final int n) {
        final int method2006 = this.field2851.method2006(1735676670);
        int i = 0;
        int j = method2006;
        for (int k = n; k > 0; --k) {
            if (class379.ml(this.field2851, k - 1, 1047666505).field3624 == '\n') {
                i = k;
                break;
            }
        }
        for (int l = n; l < method2006; ++l) {
            if (class379.ml(this.field2851, l, 155547198).field3624 == '\n') {
                j = l;
                break;
            }
        }
        return new class461(i, j);
    }
    
    public class383 method1742(final int n) {
        try {
            return this.field2850.method2035(542296527 * this.field2858, this.field2855 * 1350344153, (byte)105);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bw(" + ')');
        }
    }
    
    public static void os(final class314 class314) {
        class314.method1725(0, class314.field2851.method2006(1781499190), (byte)19);
    }
    
    public int it() {
        return this.field2857 * -522869069;
    }
    
    public int method1716(final int n) {
        try {
            return this.field2851.method2038(-1296915014);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cq(" + ')');
        }
    }
    
    public boolean dn(final int n) {
        try {
            boolean b;
            if (this.method1751(-2099770085) > 1) {
                if (n >= 424813829) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cx(" + ')');
        }
    }
    
    class461 method1760(final int n, final int n2) {
        try {
            final int method2006 = this.field2850.method2006(1818608293);
            int i = 0;
            int j = method2006;
            int k = n;
            while (k > 0) {
                if (class379.ml(this.field2850, k - 1, 1621218542).field3624 == '\n') {
                    if (n2 != -600467207) {
                        throw new IllegalStateException();
                    }
                    i = k;
                    break;
                }
                else {
                    --k;
                }
            }
            int l = n;
            while (l < method2006) {
                if (n2 != -600467207) {
                    throw new IllegalStateException();
                }
                if (class379.ml(this.field2850, l, 1256987777).field3624 == '\n') {
                    if (n2 != -600467207) {
                        throw new IllegalStateException();
                    }
                    j = l;
                    break;
                }
                else {
                    ++l;
                }
            }
            return new class461(i, j);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cw(" + ')');
        }
    }
    
    boolean method1756(final int n) {
        switch (-947277461 * this.field2844) {
            case 3: {
                return class149.isDigit((char)n, 1339478168);
            }
            case 2: {
                return class134.isCharAlphabetic((char)n, (byte)3);
            }
            default: {
                return true;
            }
            case 1: {
                return MenuAction.isAlphaNumeric((char)n, -1386386147);
            }
            case 4: {
                final char c = (char)n;
                return class149.isDigit(c, 502168786) || c == 'k' || c == 'K' || c == 'm' || 'M' == c || c == 'b' || c == 'B';
            }
        }
    }
    
    public static int method1714(final class314 class314, final int n) {
        if (class314 == null) {
            class314.method1747(n);
        }
        try {
            return 607166941 * class314.field2843;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ck(" + ')');
        }
    }
    
    public boolean method1714(final int n, final int n2, final int n3) {
        try {
            boolean b = true;
            Label_0093: {
                if (n >= 0) {
                    if (n3 <= -1213231735) {
                        throw new IllegalStateException();
                    }
                    if (n <= 2) {
                        break Label_0093;
                    }
                    if (n3 <= -1213231735) {
                        throw new IllegalStateException();
                    }
                }
                b = false;
            }
            Label_0062: {
                if (n2 >= 0) {
                    if (n3 <= -1213231735) {
                        throw new IllegalStateException();
                    }
                    if (n2 <= 2) {
                        break Label_0062;
                    }
                }
                b = false;
            }
            if (!b) {
                return false;
            }
            if (n3 <= -1213231735) {
                throw new IllegalStateException();
            }
            return this.field2851.method2010(n, n2, 1438102335);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ao(" + ')');
        }
    }
    
    public void fw(final boolean b) {
        this.method1762((int)ws(this, this.field2852 * 129914700, -600467207).field3972, b, (byte)82);
    }
    
    public void ft(final boolean field2848) {
        this.field2848 = field2848;
        this.field2846 = (field2848 && this.field2846);
    }
    
    public boolean method1784(final int n, final byte b) {
        try {
            this.field2844 = n * -399838397;
            final String mk = class379.mk(this.field2850, -1389348498);
            final int length = mk.length();
            final String method1757 = this.method1757(mk, (byte)(-35));
            if (method1757.length() == length) {
                return false;
            }
            if (b <= 0) {
                throw new IllegalStateException();
            }
            this.field2851.method2014(method1757, -844450457);
            this.method1725(-466889091 * this.field2858, 607166941 * this.field2853, (byte)125);
            this.method1761((byte)12);
            xj(this, 1064556397);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.av(" + ')');
        }
    }
    
    public void method1780(final int n) {
        try {
            if (!this.kq(-2077467902)) {
                if (n != -1555798008) {
                    throw new IllegalStateException();
                }
                if (1350344153 * this.field2852 > 0) {
                    final int method2016 = this.field2851.method2016((int)this.method1759(1350344153 * this.field2852 - 1, (byte)(-77)).field3972, 1350344153 * this.field2852, 572114493);
                    xj(this, 1431434675);
                    this.method1725(method2016, method2016, (byte)19);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ak(" + ')');
        }
    }
    
    public boolean method1719(final int n, final byte b) {
        try {
            this.field2851.method2003(n, (byte)47);
            if (!this.method1761((byte)(-32))) {
                return false;
            }
            if (b != 16) {
                throw new IllegalStateException();
            }
            xj(this, 1241300031);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.at(" + ')');
        }
    }
    
    boolean method1765(final int n, final byte b) {
        try {
            switch (-947277461 * this.field2844) {
                default: {
                    return true;
                }
                case 4: {
                    final char c = (char)n;
                    if (!class149.isDigit(c, -1479679666)) {
                        if (c != 'k') {
                            if (b != 11) {
                                throw new IllegalStateException();
                            }
                            if (c != 'K' && c != 'm' && 'M' != c) {
                                if (b != 11) {
                                    throw new IllegalStateException();
                                }
                                if (c != 'b') {
                                    if (c != 'B') {
                                        return false;
                                    }
                                    if (b != 11) {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    if (b != 11) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
                case 2: {
                    return class134.isCharAlphabetic((char)n, (byte)3);
                }
                case 3: {
                    return class149.isDigit((char)n, -1438574831);
                }
                case 1: {
                    return MenuAction.isAlphaNumeric((char)n, -222257130);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.dw(" + ')');
        }
    }
    
    boolean method1761(final byte b) {
        try {
            if (!this.da(-188389586)) {
                return false;
            }
            boolean b2 = false;
            if (this.field2851.method2006(1351664755) > this.field2857 * -522869069) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                this.field2851.method2016(-522869069 * this.field2857, this.field2851.method2006(1916619932), -97326659);
                b2 = true;
            }
            final int method1751 = this.method1751(-2012614606);
            if (this.field2851.method2021((byte)36) > method1751) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                this.field2851.method2016(this.field2851.method2018(0, method1751, (byte)58) - 1, this.field2851.method2006(2035937208), 1318830509);
                b2 = true;
            }
            if (b2) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                int n = this.field2852 * 1350344153;
                int n2 = 542296527 * this.field2853;
                final int method1752 = this.field2851.method2006(1370942271);
                if (1350344153 * this.field2852 > method1752) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    n = method1752;
                }
                if (this.field2853 * 542296527 > method1752) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    n2 = method1752;
                }
                this.method1725(n2, n, (byte)19);
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cj(" + ')');
        }
    }
    
    public void method1773(final boolean b, final byte b2) {
        try {
            if (this.field2855 * 1350344153 < this.field2851.method2038(1787167198)) {
                if (b2 >= 0) {
                    return;
                }
                this.method1762(this.field2850.method2018(this.field2856 * 1350344153, 1, (byte)33), b, (byte)12);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bd(" + ')');
        }
    }
    
    public class379 hc() {
        return this.field2850;
    }
    
    public int is() {
        return this.field2855 * 542296527;
    }
    
    void jv(final class461 class461, final class461 class462) {
        if ((int)class462.field3972 < (int)class461.field3972) {
            this.method1725((int)class461.field3973, (int)class462.field3972, (byte)19);
        }
        else {
            this.method1725((int)class461.field3972, (int)class462.field3973, (byte)19);
        }
    }
    
    public static void rn(final class314 class314) {
        if (class314 == null) {
            class314.hm();
            return;
        }
        if (!class314.kq(1125548481) && class314.field2852 * -1248526025 < class314.field2851.method2006(1247628260)) {
            final int yd = class379.yd(class314.field2851, 1100220161 * class314.field2852, -227407596);
            xj(class314, 1173652642);
            class314.method1725(yd, yd, (byte)19);
        }
    }
    
    void method1764(final byte b) {
        try {
            final class461 cy = class383.cy(this.field2850.method2035(0, 1350344153 * this.field2842, (byte)121), (byte)3);
            final int he = class379.he(this.field2850, -297150195);
            final int n = (int)cy.field3973 - 10;
            final int n2 = n + 20;
            final int n3 = (int)cy.field3972 - 3;
            final int n4 = he + (6 + n3);
            final int n5 = this.field2842 * -466889091;
            final int n6 = n5 + -212351097 * this.field2857;
            final int n7 = this.field2855 * 607166941;
            final int n8 = 1953737631 * this.field2847 + n7;
            int n9 = -466889091 * this.field2853;
            int n10 = 607166941 * this.field2852;
            if (n < n5) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                n9 = n;
            }
            else if (n2 > n6) {
                n9 = n2 - this.field2853 * -212351097;
            }
            if (n3 < n7) {
                if (b <= 1) {
                    return;
                }
                n10 = n3;
            }
            else if (n4 > n8) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                n10 = n4 - this.field2842 * 1953737631;
            }
            this.method1725(n9, n10, (byte)81);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cp(" + ')');
        }
    }
    
    public void method1770(final int n) {
        try {
            if (!this.kq(-268108675)) {
                if (n <= 735041974) {
                    return;
                }
                if (this.field2852 * 1350344153 > 0) {
                    final int yd = class379.yd(this.field2851, this.field2852 * 1350344153 - 1, 1484829823);
                    xj(this, 2139675311);
                    this.method1725(yd, yd, (byte)19);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.as(" + ')');
        }
    }
    
    public void eh() {
        this.field2845 = false;
    }
    
    public void fk(final boolean field2848) {
        this.field2848 = field2848;
        this.field2846 = (field2848 && this.field2846);
    }
    
    public boolean ev(final int n) {
        this.field2844 = n * 347370433;
        final String mk = class379.mk(this.field2851, -1389348498);
        final int length = mk.length();
        final String method1757 = this.method1757(mk, (byte)(-113));
        if (method1757.length() != length) {
            this.field2851.method2014(method1757, -844450457);
            this.method1713(-466889091 * this.field2859, 607166941 * this.field2843, (byte)8);
            this.method1761((byte)69);
            xj(this, 1578861533);
            return true;
        }
        return false;
    }
    
    public void es(final int n) {
        this.field2849 = n * -1211353108;
    }
    
    public void hd(final class308 field2862) {
        this.field2862 = field2862;
    }
    
    public void hn(final class308 field2861) {
        this.field2861 = field2861;
    }
    
    public static void pk(final class314 class314) {
        if (class314 == null) {
            class314.ia();
        }
        class314.field2843 = Math.max(0, class314.field2843 * 607166941 - class379.he(class314.field2851, -297150195)) * -2081112459;
    }
    
    public void ee() {
        if (!this.kq(-696519683) && this.field2852 * 1350344153 > 0) {
            final int yd = class379.yd(this.field2851, this.field2852 * 1350344153 - 1, -2132731360);
            xj(this, 1899083994);
            this.method1725(yd, yd, (byte)19);
        }
    }
    
    public void method1785(final int n) {
        try {
            if (!this.kq(671651217)) {
                if (n >= -2061505572) {
                    throw new IllegalStateException();
                }
                if (this.field2852 * 1350344153 < this.field2851.method2006(1609974739)) {
                    if (n >= -2061505572) {
                        throw new IllegalStateException();
                    }
                    final int method2016 = this.field2851.method2016(1350344153 * this.field2852, (int)this.method1759(this.field2852 * 1350344153, (byte)(-66)).field3973, -1166656832);
                    xj(this, 1279667218);
                    this.method1725(method2016, method2016, (byte)19);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.az(" + ')');
        }
    }
    
    public void method1715(final int n, final int n2) {
        try {
            this.field2851.method2011(n, (byte)(-54));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ax(" + ')');
        }
    }
    
    public boolean method1713(final int b, final int b2, final byte b3) {
        try {
            if (!this.da(953926789)) {
                this.field2859 = -1473981739 * b;
                this.field2843 = b2 * -2081112459;
                return false;
            }
            final int n = -466889091 * this.field2859;
            final int n2 = 607166941 * this.field2843;
            final int max = Math.max(0, class379.method2023(this.field2851, -298165365) - this.field2842 * -212351097 + 2);
            final int max2 = Math.max(0, this.field2851.method2020(-1760321375) - this.field2858 * 1953737631 + 1);
            this.field2859 = Math.max(0, Math.min(max, b)) * -1473981739;
            this.field2843 = Math.max(0, Math.min(max2, b2)) * -2081112459;
            if (n == this.field2859 * -466889091) {
                if (b3 <= 4) {
                    throw new IllegalStateException();
                }
                if (607166941 * this.field2843 == n2) {
                    return false;
                }
                if (b3 <= 4) {
                    throw new IllegalStateException();
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ay(" + ')');
        }
    }
    
    public void dt(final boolean b) {
        this.method1762(class379.yz(this.field2851, (int)class383.cy(this.field2851.method2035(0, this.field2852 * 1350344153, (byte)79), (byte)70).field3972, 607166941 * this.field2843, (byte)(-118)), b, (byte)75);
    }
    
    public static void pr(final class314 class314, final boolean b, final byte b2) {
        if (class314 == null) {
            class314.method1731(b, b2);
        }
        try {
            if (class314.field2852 * 1350344153 > 0) {
                if (b2 == 9) {
                    throw new IllegalStateException();
                }
                class314.method1762(class314.field2851.method2018(1350344153 * class314.field2852, -1, (byte)95), b, (byte)12);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bm(" + ')');
        }
    }
    
    public static void sr(final class314 class314, final boolean b) {
        if (class314.field2852 * 1350344153 < class314.field2851.method2006(2019997160)) {
            class314.method1762((int)class314.method1759(1 + class314.field2852 * 343338137, (byte)(-40)).field3973, b, (byte)105);
        }
    }
    
    public void hs(final class308 field2861) {
        this.field2861 = field2861;
    }
    
    public class379 ht() {
        return this.field2850;
    }
    
    public void method1726(final boolean b, final byte b2) {
        try {
            this.method1762(0, b, (byte)6);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bi(" + ')');
        }
    }
    
    public void method1778(final byte b) {
        try {
            this.field2843 = Math.min(Math.max(0, this.field2851.method2020(-2065329489) - 1953737631 * this.field2858), 607166941 * this.field2843 + class379.he(this.field2851, -297150195)) * -2081112459;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bv(" + ')');
        }
    }
    
    public void fc(final boolean b) {
        if (1350344153 * this.field2852 > 0) {
            this.method1762((int)this.method1759(1350344153 * this.field2852 - 1, (byte)(-13)).field3972, b, (byte)17);
        }
    }
    
    public void dl(final boolean b) {
        if (this.field2852 * 1350344153 > 0) {
            this.method1762(this.field2851.method2018(1350344153 * this.field2852, -up(this, -186359389), (byte)124), b, (byte)27);
        }
    }
    
    public int method1781(final int n) {
        try {
            return class379.tq(this.field2851, 817014315);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cg(" + ')');
        }
    }
    
    public class379 hb() {
        return this.field2850;
    }
    
    public void method1786(final boolean b, final int n) {
        try {
            if (1350344153 * this.field2852 > 0) {
                if (n <= -62559459) {
                    return;
                }
                this.method1762((int)this.method1759(1350344153 * this.field2852 - 1, (byte)(-127)).field3972, b, (byte)53);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bo(" + ')');
        }
    }
    
    public int ix() {
        return this.field2849 * 1959011707;
    }
    
    public static void fs(final class314 class314, final boolean b, final byte b2) {
        if (class314 == null) {
            class314.method1732(b, b2);
            return;
        }
        try {
            if (class314.field2852 * 1350344153 < class314.field2851.method2006(1787167198)) {
                if (b2 >= 0) {
                    return;
                }
                class314.method1762(class314.field2851.method2018(class314.field2852 * 1350344153, 1, (byte)33), b, (byte)12);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bd(" + ')');
        }
    }
    
    public static int up(final class314 class314, final int n) {
        if (class314 == null) {
            class314.method1763(n);
        }
        try {
            return 1953737631 * class314.field2858 / class379.he(class314.field2851, -297150195);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ct(" + ')');
        }
    }
    
    boolean jf() {
        return -158729629 * this.field2853 != this.field2852 * 1350344153;
    }
    
    public static void ru(final class314 class314) {
        if (class314 == null) {
            class314.ic();
        }
        if (!class314.kq(-940321573) && class314.field2852 * 1350344153 < class314.field2851.method2006(1763124259)) {
            final int method2016 = class314.field2851.method2016(1350344153 * class314.field2852, (int)class314.method1759(class314.field2852 * 1350344153, (byte)(-65)).field3973, 1483896951);
            xj(class314, 1223394745);
            class314.method1725(method2016, method2016, (byte)19);
        }
    }
    
    public void method1775(final class308 field2861, final int n) {
        try {
            this.field2861 = field2861;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bp(" + ')');
        }
    }
    
    public int ie() {
        return -1244085490 * this.field2843;
    }
    
    int method1763(final int n) {
        try {
            return 607166941 * this.field2856;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ck(" + ')');
        }
    }
    
    public int method1746(final int n) {
        try {
            return this.field2857 * -522869069;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cf(" + ')');
        }
    }
    
    boolean dv(String method1757) {
        if (!class379.mk(this.field2851, -1389348498).equals(method1757)) {
            method1757 = this.method1757(method1757, (byte)(-80));
            this.field2851.method2014(method1757, -844450457);
            this.method1713(-466889091 * this.field2859, 607166941 * this.field2843, (byte)106);
            this.method1761((byte)(-63));
            xj(this, 1061733761);
            return true;
        }
        return false;
    }
    
    public void fn() {
        this.method1725(0, this.field2851.method2006(1567514218), (byte)19);
    }
    
    public class383 ha() {
        return this.field2851.method2035(542296527 * this.field2853, this.field2852 * 1350344153, (byte)119);
    }
    
    public void method1733(final boolean b, final byte b2) {
        try {
            if (this.field2843 * 1350344153 > 0) {
                if (b2 != 1) {
                    throw new IllegalStateException();
                }
                this.method1762(this.field2850.method2018(1350344153 * this.field2847, -up(this, -2810550), (byte)61), b, (byte)70);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bt(" + ')');
        }
    }
    
    public static boolean method1733(final class314 class314, final int n, final byte b) {
        if (class314 == null) {
            return class314.method1784(n, b);
        }
        try {
            class314.field2844 = n * -399838397;
            final String mk = class379.mk(class314.field2851, -1389348498);
            final int length = mk.length();
            final String method1757 = class314.method1757(mk, (byte)(-35));
            if (method1757.length() == length) {
                return false;
            }
            if (b <= 0) {
                throw new IllegalStateException();
            }
            class314.field2851.method2014(method1757, -844450457);
            class314.method1713(-466889091 * class314.field2859, 607166941 * class314.field2843, (byte)125);
            class314.method1761((byte)12);
            xj(class314, 1064556397);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.av(" + ')');
        }
    }
    
    public static class461 ws(final class314 class314, final int n, final int n2) {
        if (class314 == null) {
            return class314.method1760(n, n);
        }
        try {
            final int method2006 = class314.field2851.method2006(1818608293);
            int i = 0;
            int j = method2006;
            int k = n;
            while (k > 0) {
                if (class379.ml(class314.field2851, k - 1, 1621218542).field3624 == '\n') {
                    if (n2 != -600467207) {
                        throw new IllegalStateException();
                    }
                    i = k;
                    break;
                }
                else {
                    --k;
                }
            }
            int l = n;
            while (l < method2006) {
                if (n2 != -600467207) {
                    throw new IllegalStateException();
                }
                if (class379.ml(class314.field2851, l, 1256987777).field3624 == '\n') {
                    if (n2 != -600467207) {
                        throw new IllegalStateException();
                    }
                    j = l;
                    break;
                }
                else {
                    ++l;
                }
            }
            return new class461(i, j);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cw(" + ')');
        }
    }
    
    public boolean ds(final int n) {
        this.field2851.method2003(n, (byte)(-18));
        if (this.method1761((byte)(-110))) {
            xj(this, 1737314688);
            return true;
        }
        return false;
    }
    
    public int ih() {
        return this.field2853 * 1743324789;
    }
    
    public class379 method1740(final int n) {
        try {
            return this.field2851;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bc(" + ')');
        }
    }
    
    public static class461 method1740(final class314 class314) {
        if (class314 == null) {
            class314.kj();
        }
        return new class461(class379.op(class314.field2851, class314.field2842 * -212351097, (byte)108), class314.field2851.dg(class314.field2858 * 1953737631, 673257027));
    }
    
    public static boolean method1740(final class314 class314, final int n, final int n2) {
        final boolean b = class314.field2842 * 1275656499 != n || n2 != 1953737631 * class314.field2858;
        class314.field2842 = 1632693089 * n;
        class314.field2858 = 1048260676 * n2;
        return b | class314.method1713(class314.field2859 * -14596488, 607166941 * class314.field2843, (byte)12);
    }
    
    public boolean ia() {
        return this.field2848;
    }
    
    public void method1735(int n, int n2, final boolean b, final boolean b2, final int n3) {
        try {
            int yz;
            if (!this.field2848) {
                if (n3 <= 1541459247) {
                    throw new IllegalStateException();
                }
                yz = 0;
            }
            else {
                n += -466889091 * this.field2842;
                n2 += 607166941 * this.field2857;
                final class461 jp = this.jp(351336662);
                yz = class379.yz(this.field2850, n - (int)jp.field3973, n2 - (int)jp.field3973, (byte)(-22));
            }
            if (b) {
                if (n3 <= 1541459247) {
                    throw new IllegalStateException();
                }
                if (b2) {
                    if (n3 <= 1541459247) {
                        throw new IllegalStateException();
                    }
                    this.field2857 = -1271167213;
                    this.method1758(this.method1759(-600117957 * this.field2847, (byte)(-44)), this.method1759(yz, (byte)(-128)), 1153538536);
                    return;
                }
            }
            if (b) {
                if (n3 <= 1541459247) {
                    throw new IllegalStateException();
                }
                this.field2860 = -1271167213;
                final class461 method1759 = this.method1759(yz, (byte)(-124));
                this.method1710((int)method1759.field3973, (int)method1759.field3972, (byte)19);
                this.field2852 = (int)method1759.field3973 * 1170826227;
            }
            else if (b2) {
                if (n3 <= 1541459247) {
                    throw new IllegalStateException();
                }
                this.method1710(this.field2843 * -600117957, yz, (byte)19);
            }
            else {
                if (this.field2853 * 2106407237 > 0 && yz == -600117957 * this.field2849) {
                    if (n3 <= 1541459247) {
                        throw new IllegalStateException();
                    }
                    if (542296527 * this.field2843 == 1350344153 * this.field2859) {
                        if (n3 <= 1541459247) {
                            throw new IllegalStateException();
                        }
                        this.field2843 = -1271167213;
                        final class461 method1760 = this.method1759(yz, (byte)(-11));
                        this.method1710((int)method1760.field3972, (int)method1760.field3972, (byte)19);
                    }
                    else {
                        this.field2859 = 1752632870;
                        final class461 ws = ws(this, yz, -600467207);
                        this.method1710((int)ws.field3972, (int)ws.field3972, (byte)19);
                    }
                }
                else {
                    this.field2842 = 0;
                    this.method1710(yz, yz, (byte)19);
                    this.field2860 = 1170826227 * yz;
                }
                this.field2856 = 1656428229;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.br(" + ')');
        }
    }
    
    public void ei() {
        if (!this.kq(-1299024686) && this.field2852 * 1350344153 > 0) {
            final int yd = class379.yd(this.field2851, this.field2852 * 1350344153 - 1, -327922657);
            xj(this, 916585690);
            this.method1725(yd, yd, (byte)19);
        }
    }
    
    public boolean method1744(final int n) {
        this.field2844 = n * -399838397;
        final String mk = class379.mk(this.field2851, -1389348498);
        final int length = mk.length();
        final String method1757 = this.method1757(mk, (byte)57);
        if (method1757.length() != length) {
            this.field2851.method2014(method1757, -844450457);
            this.method1713(-466889091 * this.field2859, 607166941 * this.field2843, (byte)101);
            this.method1761((byte)87);
            xj(this, 1212993121);
            return true;
        }
        return false;
    }
    
    public void method1707(final boolean field2848, final int n) {
        try {
            this.field2848 = field2848;
            while (true) {
                Label_0052: {
                    if (!field2848) {
                        break Label_0052;
                    }
                    if (n == 544358779) {
                        throw new IllegalStateException();
                    }
                    if (!this.field2846) {
                        break Label_0052;
                    }
                    if (n == 544358779) {
                        return;
                    }
                    final boolean field2849 = true;
                    this.field2846 = field2849;
                    return;
                }
                final boolean field2849 = false;
                continue;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.aw(" + ')');
        }
    }
    
    class461 ja(final int n) {
        final int dk = this.field2850.dk(1769580829);
        int i = 0;
        int j = dk;
        for (int k = n; k > 0; --k) {
            if (this.method1782(class379.ml(this.field2850, k - 1, 1075515195).field3624, 1107347939)) {
                i = k;
                break;
            }
        }
        for (int l = n; l < dk; ++l) {
            if (this.method1782(class379.ml(this.field2850, l, 442864134).field3624, 2088968886)) {
                j = l;
                break;
            }
        }
        return new class461(i, j);
    }
    
    public boolean method1720(final int n, final int n2) {
        try {
            if (this.method1765(n, (byte)11)) {
                this.kq(1772299463);
                final class380 method2032 = this.field2851.method2032((char)n, this.field2852 * 1350344153, -1383048587 * this.field2856, 1267710833);
                this.method1725(class380.bt(method2032, 930785393), class380.bt(method2032, 1016507575), (byte)19);
                this.method1761((byte)27);
                xj(this, 1220338251);
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.am(" + ')');
        }
    }
    
    public void em() {
        this.field2845 = false;
    }
    
    public boolean method1711(int n, final int n2) {
        try {
            if (n < 0) {
                if (n2 <= 1218316967) {
                    throw new IllegalStateException();
                }
                n = Integer.MAX_VALUE;
            }
            boolean b = n == this.field2851.method2038(-1296915014);
            this.field2851.method2033(n, (byte)2);
            this.field2850.method2033(n, (byte)2);
            if (this.method1761((byte)107)) {
                xj(this, 937897643);
                b = true;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.al(" + ')');
        }
    }
    
    boolean df(final AbstractFont abstractFont) {
        final boolean b = !this.field2845;
        this.field2851.method2037(abstractFont, -1494204123);
        this.field2850.method2037(abstractFont, -1091572264);
        this.field2845 = true;
        boolean b2 = b | this.method1713(this.field2859 * 1683512601, this.field2843 * 607166941, (byte)97) | this.method1725(this.field2853 * -729011145, this.field2852 * -2049560920, (byte)19);
        if (this.method1761((byte)30)) {
            xj(this, 1629421476);
            b2 = true;
        }
        return b2;
    }
    
    public boolean et(int n) {
        if (n < 0) {
            n = Integer.MAX_VALUE;
        }
        boolean b = n == this.field2851.method2038(-1296915014);
        this.field2851.method2033(n, (byte)2);
        this.field2850.method2033(n, (byte)2);
        if (this.method1761((byte)33)) {
            xj(this, 1154876834);
            b = true;
        }
        return b;
    }
    
    public int method1769(final int n) {
        try {
            return this.field2852 * 1350344153;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cc(" + ')');
        }
    }
    
    class461 jp(final int n) {
        final int method2006 = this.field2851.method2006(1806113865);
        int i = 0;
        int j = method2006;
        for (int k = n; k > 0; --k) {
            if (class379.ml(this.field2851, k - 1, 1559288745).field3624 == '\n') {
                i = k;
                break;
            }
        }
        for (int l = n; l < method2006; ++l) {
            if (class379.ml(this.field2851, l, 249791678).field3624 == '\n') {
                j = l;
                break;
            }
        }
        return new class461(i, j);
    }
    
    void method1766(final int n) {
        this.field2850.method2029(n, -2109034133);
    }
    
    public void hx() {
        this.field2843 = Math.min(Math.max(0, this.field2851.method2020(-1756636858) - 1953737631 * this.field2858), 607166941 * this.field2843 + class379.he(this.field2851, -297150195)) * -2081112459;
    }
    
    public static void hr(final class314 class314, final byte b) {
        if (class314 == null) {
            class314.method1764(b);
        }
        try {
            final class461 cy = class383.cy(class314.field2851.method2035(0, 1350344153 * class314.field2852, (byte)121), (byte)3);
            final int he = class379.he(class314.field2851, -297150195);
            final int n = (int)cy.field3972 - 10;
            final int n2 = n + 20;
            final int n3 = (int)cy.field3973 - 3;
            final int n4 = he + (6 + n3);
            final int n5 = class314.field2859 * -466889091;
            final int n6 = n5 + -212351097 * class314.field2842;
            final int n7 = class314.field2843 * 607166941;
            final int n8 = 1953737631 * class314.field2858 + n7;
            int n9 = -466889091 * class314.field2859;
            int n10 = 607166941 * class314.field2843;
            if (n < n5) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                n9 = n;
            }
            else if (n2 > n6) {
                n9 = n2 - class314.field2842 * -212351097;
            }
            if (n3 < n7) {
                if (b <= 1) {
                    return;
                }
                n10 = n3;
            }
            else if (n4 > n8) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                n10 = n4 - class314.field2858 * 1953737631;
            }
            class314.method1713(n9, n10, (byte)81);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cp(" + ')');
        }
    }
    
    public static int rx(final class314 class314) {
        if (class314 == null) {
            return class314.is();
        }
        return class314.field2853 * 542296527;
    }
    
    public boolean method1706(final boolean b, final int n) {
        try {
            boolean b2;
            if (b && this.field2848) {
                if (n <= -2128528233) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            final boolean field2846 = b2;
            boolean b3;
            if (field2846 != this.field2846) {
                if (n <= -2128528233) {
                    throw new IllegalStateException();
                }
                b3 = true;
            }
            else {
                b3 = false;
            }
            final boolean b4 = b3;
            if (!(this.field2846 = field2846)) {
                if (n <= -2128528233) {
                    throw new IllegalStateException();
                }
                this.method1725(this.field2852 * 1350344153, this.field2852 * 1350344153, (byte)19);
            }
            return b4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.an(" + ')');
        }
    }
    
    boolean method1708(String method1757, final int n) {
        try {
            if (!class379.mk(this.field2851, -1389348498).equals(method1757)) {
                method1757 = this.method1757(method1757, (byte)94);
                this.field2851.method2014(method1757, -844450457);
                this.method1713(-466889091 * this.field2859, 607166941 * this.field2843, (byte)101);
                this.method1761((byte)(-78));
                xj(this, 1300772906);
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ac(" + ')');
        }
    }
    
    public static IndexedSprite[] method1708(final AbstractArchive abstractArchive, final String s, final String s2, final int n) {
        try {
            if (AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
                final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, 453648599);
                return class68.method434(abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), -844576199);
            }
            if (n == -525777980) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ac(" + ')');
        }
    }
    
    public static class379 qc(final class314 class314) {
        if (class314 == null) {
            return class314.hc();
        }
        return class314.field2850;
    }
    
    public int io() {
        return this.field2851.method2038(-1296915014);
    }
    
    public boolean method1755(final int n) {
        this.field2857 = n * 1383561339;
        if (this.method1761((byte)64)) {
            xj(this, 1486694102);
            return true;
        }
        return false;
    }
    
    public void ec() {
        if (!this.kq(-249926899) && this.field2852 * 1350344153 > 0) {
            final int yd = class379.yd(this.field2851, this.field2852 * 1350344153 - 1, -79390881);
            xj(this, 1773251826);
            this.method1725(yd, yd, (byte)19);
        }
    }
    
    public void method1738(final Clipboard clipboard, final int n) {
        try {
            final Transferable contents = clipboard.getContents(null);
            if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                if (n == 1459826529) {
                    throw new IllegalStateException();
                }
                try {
                    final String method1757 = this.method1757((String)contents.getTransferData(DataFlavor.stringFlavor), (byte)83);
                    this.kq(1832115193);
                    final class380 method1758 = this.field2851.method2012(method1757, 1350344153 * this.field2852, this.field2856 * -1383048587, (byte)(-18));
                    this.method1725(class380.bt(method1758, -1721966411), class380.bt(method1758, 1174810060), (byte)19);
                    this.method1761((byte)32);
                    xj(this, 1427589831);
                }
                catch (Exception ex2) {}
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bq(" + ')');
        }
    }
    
    public void dk(final boolean b) {
        if (this.field2852 * 1350344153 < this.field2851.method2006(2008078255)) {
            this.method1762((int)this.method1759(1 + this.field2852 * 1350344153, (byte)(-107)).field3973, b, (byte)102);
        }
    }
    
    public void hm() {
        this.field2843 = Math.min(Math.max(0, this.field2851.method2020(-1896940164) - 1953737631 * this.field2858), 607166941 * this.field2843 + class379.he(this.field2851, -297150195)) * -2081112459;
    }
    
    void do() {
        this.field2847 = (-870124373 * this.field2847 + 1) % 60 * -867080701;
        if (1432184767 * this.field2855 > 0) {
            this.field2855 -= 1382901300;
        }
    }
    
    public boolean if() {
        return this.field2848;
    }
    
    public void gd(final boolean b) {
        if (this.field2852 * 466322500 < this.field2851.method2006(1965331172)) {
            this.method1762((int)this.method1759(1 + this.field2852 * -1638159333, (byte)(-113)).field3973, b, (byte)11);
        }
    }
    
    boolean dz(final String s) {
        this.field2850.method2014(s, -844450457);
        return true;
    }
    
    String jw(final String s) {
        final StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (this.method1765(char1, (byte)11)) {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public boolean he() {
        return this.field2846;
    }
    
    public boolean iw() {
        return method1728(this, 2132683842) && -870124373 * this.field2847 % 60 < 30;
    }
    
    public int ji() {
        return class379.tq(this.field2851, 817014315);
    }
    
    public void fr(final boolean b) {
        if (1350344153 * this.field2852 < this.field2851.method2006(1534107574)) {
            this.method1762(this.field2851.method2018(1350344153 * this.field2852, up(this, 556697690), (byte)94), b, (byte)32);
        }
    }
    
    boolean de(final String s) {
        this.field2850.method2014(s, -844450457);
        return true;
    }
    
    public static void so(final class314 class314, final boolean b, final byte b2) {
        if (class314 == null) {
            class314.method1733(b, b2);
            return;
        }
        try {
            if (class314.field2852 * 1350344153 > 0) {
                if (b2 != 1) {
                    throw new IllegalStateException();
                }
                class314.method1762(class314.field2851.method2018(1350344153 * class314.field2852, -up(class314, -2810550), (byte)61), b, (byte)70);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bt(" + ')');
        }
    }
    
    public void fl() {
        if (!this.kq(-420561075) && 1350344153 * this.field2852 > 0) {
            final int method2016 = this.field2851.method2016((int)this.method1759(1350344153 * this.field2852 - 1, (byte)(-85)).field3972, 1350344153 * this.field2852, -520767017);
            xj(this, 1303698041);
            this.method1725(method2016, method2016, (byte)19);
        }
    }
    
    public int ip() {
        return -947277461 * this.field2852;
    }
    
    public void fo() {
        if (!this.kq(-1295305605) && this.field2852 * 1350344153 < this.field2851.method2006(1290149015)) {
            final int method2016 = this.field2851.method2016(1350344153 * this.field2852, (int)this.method1759(this.field2852 * 1350344153, (byte)(-34)).field3973, -72454566);
            xj(this, 1386389550);
            this.method1725(method2016, method2016, (byte)19);
        }
    }
    
    public void gt(final boolean b) {
        this.method1762(class379.yz(this.field2851, (int)class383.cy(this.field2851.method2035(0, 1872940289 * this.field2852, (byte)100), (byte)38).field3972, 944283786 * this.field2858 + 607166941 * this.field2843, (byte)(-10)), b, (byte)95);
    }
    
    public void fa(final boolean b) {
        if (1350344153 * this.field2852 > 0) {
            this.method1762((int)this.method1759(1350344153 * this.field2852 - 1, (byte)(-28)).field3972, b, (byte)61);
        }
    }
    
    public static void sk(final class314 class314, final boolean b) {
        class314.method1762((int)ws(class314, class314.field2852 * 1350344153, -600467207).field3972, b, (byte)90);
    }
    
    public static boolean sv(final class314 class314, final int n, final int n2) {
        if (class314 == null) {
            class314.dj(n, n);
        }
        boolean b = true;
        if (n < 0 || n > 2) {
            b = false;
        }
        if (n2 < 0 || n2 > 2) {
            b = false;
        }
        return b && class314.field2851.method2010(n, n2, 1810323060);
    }
    
    public boolean ed(final int n) {
        try {
            return this.field2848;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ci(" + ')');
        }
    }
    
    public void ea(final int n) {
        this.field2851.method2011(n, (byte)(-125));
    }
    
    boolean method1709(final String s, final byte b) {
        try {
            this.field2850.method2014(s, -844450457);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.au(" + ')');
        }
    }
    
    public void fm(final boolean b) {
        this.method1762((int)ws(this, 1350344153 * this.field2852, -600467207).field3973, b, (byte)109);
    }
    
    public void fe() {
        if (!this.kq(-1497762124) && this.field2852 * 1350344153 < this.field2851.method2006(1907156937)) {
            final int yd = class379.yd(this.field2851, 1350344153 * this.field2852, -380858492);
            xj(this, 1594420878);
            this.method1725(yd, yd, (byte)19);
        }
    }
    
    public static void tx(final class314 class314, final boolean b, final short n) {
        if (class314 == null) {
            class314.method1721(b, n);
            return;
        }
        try {
            if (1350344153 * class314.field2852 < class314.field2851.method2006(1962874314)) {
                if (n <= 128) {
                    throw new IllegalStateException();
                }
                class314.method1762(class314.field2851.method2018(1350344153 * class314.field2852, up(class314, 1219591840), (byte)121), b, (byte)102);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bj(" + ')');
        }
    }
    
    public boolean method1712(final int n, final int n2) {
        try {
            this.field2857 = n * 1383561339;
            if (!this.method1761((byte)41)) {
                return false;
            }
            if (n2 >= -325859048) {
                throw new IllegalStateException();
            }
            xj(this, 1583522408);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.aa(" + ')');
        }
    }
    
    public void gl(final Clipboard clipboard) {
        final class383 method2035 = this.field2851.method2035(542296527 * this.field2853, this.field2852 * 1350344153, (byte)124);
        if (!method2035.method2078(-1166560659)) {
            final String method2036 = method2035.method2083(-446756954);
            if (!method2036.isEmpty()) {
                clipboard.setContents(new StringSelection(method2036), null);
            }
        }
    }
    
    public static boolean ty(final class314 class314) {
        if (class314 == null) {
            class314.hc();
        }
        return method1728(class314, 2021086816) && -870124373 * class314.field2847 % 60 < 30;
    }
    
    public void gn(final Clipboard clipboard) {
        final Transferable contents = clipboard.getContents(null);
        if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                final String method1757 = this.method1757((String)contents.getTransferData(DataFlavor.stringFlavor), (byte)(-62));
                this.kq(-1625059396);
                final class380 method1758 = this.field2851.method2012(method1757, 1350344153 * this.field2852, this.field2856 * -1383048587, (byte)(-46));
                this.method1725(class380.bt(method1758, 1621715854), class380.bt(method1758, 452013699), (byte)19);
                this.method1761((byte)(-51));
                xj(this, 969608411);
            }
            catch (Exception ex) {}
        }
    }
    
    void kg() {
        if (this.field2862 != null) {
            this.field2862.vmethod5708(427135973);
        }
    }
    
    public void method1705(final int n, final int n2) {
        try {
            this.field2849 = n * 258208179;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ai(" + ')');
        }
    }
    
    public boolean ii() {
        return this.field2845;
    }
    
    public void fi() {
        if (!this.kq(1702833112) && 1350344153 * this.field2852 > 0) {
            final int method2016 = this.field2851.method2016((int)this.method1759(1350344153 * this.field2852 - 1, (byte)(-128)).field3972, 1350344153 * this.field2852, 216296042);
            xj(this, 1754866991);
            this.method1725(method2016, method2016, (byte)19);
        }
    }
    
    public int ic() {
        return this.field2853 * 542296527;
    }
    
    public int jc() {
        return class379.tq(this.field2851, 817014315);
    }
    
    public boolean dx(final int n, final int n2) {
        final boolean b = this.field2842 * -212351097 != n || n2 != 1953737631 * this.field2858;
        this.field2842 = -1340125641 * n;
        this.field2858 = 86683743 * n2;
        return b | this.method1713(this.field2859 * -466889091, 607166941 * this.field2843, (byte)7);
    }
    
    public void gg(final boolean b) {
        if (this.field2852 * 1350344153 < this.field2851.method2006(2103009513)) {
            this.method1762(this.field2851.method2018(this.field2852 * -1965713190, 1, (byte)114), b, (byte)9);
        }
    }
    
    public int iv() {
        return 830459702 * this.field2843;
    }
    
    public static int ve(final class314 class314, final byte b) {
        if (class314 == null) {
            return class314.method1754(b);
        }
        try {
            return class379.yh(class314.field2851, 785448473);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cy(" + ')');
        }
    }
    
    boolean fx() {
        return 542296527 * this.field2853 != this.field2852 * 1350344153;
    }
    
    public class379 method1741(final byte b) {
        try {
            return this.field2850;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bh(" + ')');
        }
    }
    
    public void method1722(final boolean b, final int n) {
        try {
            this.method1762((int)ws(this, this.field2855 * 1350344153, -600467207).field3973, b, (byte)41);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.by(" + ')');
        }
    }
    
    public void method1729(final boolean b, final int n) {
        try {
            if (iq(this, -888867330) && !b) {
                if (n >= -1430979971) {
                    throw new IllegalStateException();
                }
                this.method1762(Math.max(542296527 * this.field2853, this.field2852 * 1350344153), b, (byte)121);
            }
            else if (this.field2852 * 1350344153 < this.field2851.method2006(1482114163)) {
                if (n >= -1430979971) {
                    throw new IllegalStateException();
                }
                this.method1762(1 + 1350344153 * this.field2852, b, (byte)8);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bx(" + ')');
        }
    }
    
    public void method1771(final int n) {
        this.field2850.method2011(n, (byte)(-125));
    }
    
    public boolean hp() {
        return this.field2846;
    }
    
    public boolean method1725(int method2006, int method2007, final byte b) {
        try {
            if (this.da(-1231670052)) {
                if (method2006 > this.field2851.method2006(1350377634)) {
                    if (b != 19) {
                        throw new IllegalStateException();
                    }
                    method2006 = this.field2851.method2006(1667831279);
                }
                if (method2007 > this.field2851.method2006(1199734043)) {
                    method2007 = this.field2851.method2006(1668164590);
                }
                boolean b2 = false;
                Label_0274: {
                    if (542296527 * this.field2853 == method2006) {
                        if (this.field2852 * 1350344153 == method2007) {
                            b2 = false;
                            break Label_0274;
                        }
                        if (b != 19) {
                            throw new IllegalStateException();
                        }
                    }
                    b2 = true;
                }
                final boolean b3 = b2;
                this.field2853 = 1269275951 * method2006;
                if (method2007 != this.field2852 * 1350344153) {
                    if (b != 19) {
                        throw new IllegalStateException();
                    }
                    this.field2852 = method2007 * -405138839;
                    this.field2847 = 0;
                    hr(this, (byte)46);
                }
                if (b3) {
                    if (b != 19) {
                        throw new IllegalStateException();
                    }
                    if (this.field2861 != null) {
                        if (b != 19) {
                            throw new IllegalStateException();
                        }
                        this.field2861.vmethod5708(427135973);
                    }
                }
                return b3;
            }
            if (b != 19) {
                throw new IllegalStateException();
            }
            this.field2853 = 1269275951 * method2006;
            this.field2852 = -405138839 * method2007;
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ap(" + ')');
        }
    }
    
    void kd() {
        final class461 cy = class383.cy(this.field2851.method2035(0, 1350344153 * this.field2852, (byte)116), (byte)23);
        final int he = class379.he(this.field2851, -297150195);
        final int n = (int)cy.field3972 - 10;
        final int n2 = n + 20;
        final int n3 = (int)cy.field3973 - 3;
        final int n4 = he + (6 + n3);
        final int n5 = this.field2859 * -466889091;
        final int n6 = n5 + -212351097 * this.field2842;
        final int n7 = this.field2843 * 607166941;
        final int n8 = 1953737631 * this.field2858 + n7;
        int n9 = -466889091 * this.field2859;
        int n10 = 607166941 * this.field2843;
        if (n < n5) {
            n9 = n;
        }
        else if (n2 > n6) {
            n9 = n2 - this.field2842 * -212351097;
        }
        if (n3 < n7) {
            n10 = n3;
        }
        else if (n4 > n8) {
            n10 = n4 - this.field2858 * 1953737631;
        }
        this.method1713(n9, n10, (byte)68);
    }
    
    public void method1732(final boolean b, final byte b2) {
        try {
            if (this.field2857 * 1350344153 > 0) {
                if (b2 != 1) {
                    throw new IllegalStateException();
                }
                this.method1762(this.field2850.method2018(1350344153 * this.field2858, -up(this, -2810550), (byte)61), b, (byte)70);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bt(" + ')');
        }
    }
    
    public static void oe(final class314 class314, final int n) {
        if (class314 == null) {
            class314.method1771(n);
            return;
        }
        try {
            class314.field2845 = false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ar(" + ')');
        }
    }
    
    public int method1783(final int n) {
        try {
            return class379.tq(this.field2850, 817014315);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cg(" + ')');
        }
    }
    
    public void method1727(int n, int n2, final int n3) {
        try {
            if (this.field2845 && method1728(this, 1877239255)) {
                n += -466889091 * this.field2859;
                n2 += this.field2843 * 607166941;
                final class461 jb = this.jb(-766531417);
                final int yz = class379.yz(this.field2851, n - (int)jb.field3972, n2 - (int)jb.field3973, (byte)(-67));
                switch (this.field2860 * -971547877) {
                    case 2: {
                        this.method1758(ws(this, this.field2854 * -600117957, -600467207), ws(this, yz, -600467207), -65071382);
                        break;
                    }
                    case 1: {
                        this.method1758(this.method1759(-600117957 * this.field2854, (byte)(-58)), this.method1759(yz, (byte)(-116)), 2102584642);
                        break;
                    }
                    case 0: {
                        this.method1725(this.field2853 * 542296527, yz, (byte)19);
                        break;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bg(" + ')');
        }
    }
    
    public static boolean kt(final class314 class314) {
        if (class314 == null) {
            class314.jg();
        }
        if (!class314.da(-1235694322)) {
            return false;
        }
        boolean b = false;
        if (class314.field2851.method2006(1558013401) > class314.field2857 * -522869069) {
            class314.field2851.method2016(-522869069 * class314.field2857, class314.field2851.method2006(1452267483), 191521569);
            b = true;
        }
        final int method1751 = class314.method1751(-2140583862);
        if (class314.field2851.method2021((byte)(-8)) > method1751) {
            class314.field2851.method2016(class314.field2851.method2018(0, method1751, (byte)40) - 1, class314.field2851.method2006(1124439651), 800365310);
            b = true;
        }
        if (b) {
            int n = class314.field2852 * -1070907659;
            int n2 = 542296527 * class314.field2853;
            final int method1752 = class314.field2851.method2006(1169442764);
            if (-595866112 * class314.field2852 > method1752) {
                n = method1752;
            }
            if (class314.field2853 * 1559696495 > method1752) {
                n2 = method1752;
            }
            class314.method1725(n2, n, (byte)19);
        }
        return b;
    }
    
    void kt() {
        final class461 cy = class383.cy(this.field2851.method2035(0, 1350344153 * this.field2852, (byte)17), (byte)50);
        final int he = class379.he(this.field2851, -297150195);
        final int n = (int)cy.field3972 - 10;
        final int n2 = n + 20;
        final int n3 = (int)cy.field3973 - 3;
        final int n4 = he + (6 + n3);
        final int n5 = this.field2859 * -466889091;
        final int n6 = n5 + -212351097 * this.field2842;
        final int n7 = this.field2843 * 607166941;
        final int n8 = 1953737631 * this.field2858 + n7;
        int n9 = -466889091 * this.field2859;
        int n10 = 607166941 * this.field2843;
        if (n < n5) {
            n9 = n;
        }
        else if (n2 > n6) {
            n9 = n2 - this.field2842 * -212351097;
        }
        if (n3 < n7) {
            n10 = n3;
        }
        else if (n4 > n8) {
            n10 = n4 - this.field2858 * 1953737631;
        }
        this.method1713(n9, n10, (byte)90);
    }
    
    public int im() {
        return this.field2851.method2022((short)8871);
    }
    
    public void hl(final class308 field2861) {
        this.field2861 = field2861;
    }
    
    public void gb(final Clipboard clipboard) {
        final Transferable contents = clipboard.getContents(null);
        if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                final String method1757 = this.method1757((String)contents.getTransferData(DataFlavor.stringFlavor), (byte)(-117));
                this.kq(-1108441002);
                final class380 method1758 = this.field2851.method2012(method1757, 1350344153 * this.field2852, this.field2856 * -1383048587, (byte)48);
                this.method1725(class380.bt(method1758, -1426639899), class380.bt(method1758, -1466104102), (byte)19);
                this.method1761((byte)10);
                xj(this, 1021120894);
            }
            catch (Exception ex) {}
        }
    }
    
    public static class383 method1751(final class314 class314, final int n) {
        if (class314 == null) {
            class314.method1742(n);
        }
        try {
            return class314.field2851.method2035(542296527 * class314.field2853, class314.field2852 * 1350344153, (byte)105);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bw(" + ')');
        }
    }
    
    public int method1751(final int n) {
        try {
            return this.field2851.method2022((short)22905);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cm(" + ')');
        }
    }
    
    void method1758(final class461 class461, final class461 class462, final int n) {
        try {
            if ((int)class462.field3972 < (int)class461.field3972) {
                if (n <= -1776463596) {
                    throw new IllegalStateException();
                }
                this.method1725((int)class461.field3973, (int)class462.field3972, (byte)19);
            }
            else {
                this.method1725((int)class461.field3972, (int)class462.field3973, (byte)19);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.co(" + ')');
        }
    }
    
    public void fg(final boolean b) {
        this.method1762(class379.yz(this.field2851, (int)class383.cy(this.field2851.method2035(0, 1350344153 * this.field2852, (byte)83), (byte)81).field3972, 1953737631 * this.field2858 + 607166941 * this.field2843, (byte)(-22)), b, (byte)48);
    }
    
    public static void fg(final class314 class314, final boolean b, final byte b2) {
        if (class314 == null) {
            class314.method1773(b, b2);
        }
        try {
            class314.method1762(class314.field2851.method2006(1238944873), b, (byte)85);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.be(" + ')');
        }
    }
    
    public int method1754(final byte b) {
        try {
            return this.field2857 * 1959011707;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cl(" + ')');
        }
    }
    
    public static void la(final class314 class314) {
        if (class314 == null) {
            class314.ik();
        }
        if (!class314.kq(157388418) && 1350344153 * class314.field2852 > 0) {
            final int method2016 = class314.field2851.method2016((int)class314.method1759(1350344153 * class314.field2852 - 1, (byte)(-106)).field3972, 1350344153 * class314.field2852, -721499125);
            xj(class314, 1495870330);
            class314.method1725(method2016, method2016, (byte)19);
        }
    }
    
    public static void mx(final class314 class314, final byte b) {
        if (class314 == null) {
            class314.method1787(b);
            return;
        }
        try {
            class314.method1725(0, class314.field2851.method2006(1631033028), (byte)19);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ae(" + ')');
        }
    }
    
    void ka() {
        final class461 cy = class383.cy(this.field2851.method2035(0, 1350344153 * this.field2852, (byte)51), (byte)52);
        final int he = class379.he(this.field2851, -297150195);
        final int n = (int)cy.field3972 - 10;
        final int n2 = n + 20;
        final int n3 = (int)cy.field3973 - 3;
        final int n4 = he + (6 + n3);
        final int n5 = this.field2859 * -466889091;
        final int n6 = n5 + -212351097 * this.field2842;
        final int n7 = this.field2843 * 607166941;
        final int n8 = 1953737631 * this.field2858 + n7;
        int n9 = -466889091 * this.field2859;
        int n10 = 607166941 * this.field2843;
        if (n < n5) {
            n9 = n;
        }
        else if (n2 > n6) {
            n9 = n2 - this.field2842 * -212351097;
        }
        if (n3 < n7) {
            n10 = n3;
        }
        else if (n4 > n8) {
            n10 = n4 - this.field2858 * 1953737631;
        }
        this.method1713(n9, n10, (byte)108);
    }
    
    public void er(final int n) {
        this.field2851.method2029(n, -2109034133);
    }
    
    public static boolean ye(final class314 class314) {
        if (class314 == null) {
            class314.fe();
        }
        return method1728(class314, 1952771922) && -870124373 * class314.field2847 % 60 < 30;
    }
    
    public int il() {
        return this.field2853 * 542296527;
    }
    
    public static void ow(final class314 class314, int n, int n2, final boolean b, final boolean b2, final int n3) {
        if (class314 == null) {
            class314.method1735(n, n, b, b, n);
        }
        try {
            int yz;
            if (!class314.field2845) {
                if (n3 <= 1541459247) {
                    throw new IllegalStateException();
                }
                yz = 0;
            }
            else {
                n += -466889091 * class314.field2859;
                n2 += 607166941 * class314.field2843;
                final class461 jb = class314.jb(351336662);
                yz = class379.yz(class314.field2851, n - (int)jb.field3972, n2 - (int)jb.field3973, (byte)(-22));
            }
            if (b) {
                if (n3 <= 1541459247) {
                    throw new IllegalStateException();
                }
                if (b2) {
                    if (n3 <= 1541459247) {
                        throw new IllegalStateException();
                    }
                    class314.field2860 = -1271167213;
                    class314.method1758(class314.method1759(-600117957 * class314.field2854, (byte)(-44)), class314.method1759(yz, (byte)(-128)), 1153538536);
                    return;
                }
            }
            if (b) {
                if (n3 <= 1541459247) {
                    throw new IllegalStateException();
                }
                class314.field2860 = -1271167213;
                final class461 method1759 = class314.method1759(yz, (byte)(-124));
                class314.method1725((int)method1759.field3972, (int)method1759.field3973, (byte)19);
                class314.field2854 = (int)method1759.field3972 * 1170826227;
            }
            else if (b2) {
                if (n3 <= 1541459247) {
                    throw new IllegalStateException();
                }
                class314.method1725(class314.field2854 * -600117957, yz, (byte)19);
            }
            else {
                if (class314.field2855 * 2106407237 > 0 && yz == -600117957 * class314.field2854) {
                    if (n3 <= 1541459247) {
                        throw new IllegalStateException();
                    }
                    if (542296527 * class314.field2853 == 1350344153 * class314.field2852) {
                        if (n3 <= 1541459247) {
                            throw new IllegalStateException();
                        }
                        class314.field2860 = -1271167213;
                        final class461 method1760 = class314.method1759(yz, (byte)(-11));
                        class314.method1725((int)method1760.field3972, (int)method1760.field3973, (byte)19);
                    }
                    else {
                        class314.field2860 = 1752632870;
                        final class461 ws = ws(class314, yz, -600467207);
                        class314.method1725((int)ws.field3972, (int)ws.field3973, (byte)19);
                    }
                }
                else {
                    class314.field2860 = 0;
                    class314.method1725(yz, yz, (byte)19);
                    class314.field2854 = 1170826227 * yz;
                }
                class314.field2855 = 1656428229;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.br(" + ')');
        }
    }
    
    public void gx(final Clipboard clipboard) {
        if (iq(this, 660901526)) {
            this.method1736(clipboard, (byte)8);
            this.kq(-556972571);
        }
    }
    
    public void gy(final boolean b) {
        if (this.field2852 * 1350344153 < this.field2851.method2006(1770640597)) {
            this.method1762(this.field2851.method2018(this.field2852 * 1350344153, 1, (byte)104), b, (byte)80);
        }
    }
    
    public void gw(final boolean b) {
        this.method1762((int)ws(this, this.field2852 * 1350344153, -600467207).field3972, b, (byte)66);
    }
    
    public void gh(final boolean b) {
        this.method1762(class379.yz(this.field2851, (int)class383.cy(this.field2851.method2035(0, 1350344153 * this.field2852, (byte)74), (byte)120).field3972, 1953737631 * this.field2858 + 1600130610 * this.field2843, (byte)(-123)), b, (byte)109);
    }
    
    public boolean jj() {
        return this.method1751(-2098231855) > 1;
    }
    
    public boolean hy() {
        return this.field2848;
    }
    
    public void eu(final int n) {
        this.field2851.method2011(n, (byte)(-115));
    }
    
    public static void method1779(final boolean b, final int n) {
        try {
            Label_0044: {
                if (!b) {
                    break Label_0044;
                }
                if (n <= -964267539) {
                    return;
                }
                if (null == Rasterizer2D.field4108) {
                    break Label_0044;
                }
                if (n <= -964267539) {
                    throw new IllegalStateException();
                }
                Rasterizer3D.field1999 = Rasterizer3D.field1992;
                return;
            }
            Rasterizer3D.field1999 = Rasterizer3D.field1998;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.af(" + ')');
        }
    }
    
    void method1779(final byte b) {
        try {
            this.field2857 = (-870124373 * this.field2856 + 1) % 60 * -867080701;
            if (2106407237 * this.field2859 > 0) {
                if (b == 1) {
                    return;
                }
                this.field2852 -= 238055821;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.af(" + ')');
        }
    }
    
    public static PacketBufferNode method1779(final int n, String s, final Language language, final int n2, final byte b) {
        try {
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2476, Client.packetWriter.isaacCipher, (short)(-19218));
            packetBufferNode.packetBuffer.bf(0, (byte)78);
            final int n3 = -1633313603 * packetBufferNode.packetBuffer.at;
            packetBufferNode.packetBuffer.bf(n, (byte)27);
            final String lowerCase = s.toLowerCase();
            int n4 = 0;
            if (lowerCase.startsWith(Strings.hs)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n4 = 0;
                s = s.substring(Strings.hs.length());
            }
            else if (lowerCase.startsWith(Strings.hl)) {
                n4 = 1;
                s = s.substring(Strings.hl.length());
            }
            else if (lowerCase.startsWith(Strings.hr)) {
                n4 = 2;
                s = s.substring(Strings.hr.length());
            }
            else if (lowerCase.startsWith(Strings.hg)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n4 = 3;
                s = s.substring(Strings.hg.length());
            }
            else if (lowerCase.startsWith(Strings.ht)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n4 = 4;
                s = s.substring(Strings.ht.length());
            }
            else if (lowerCase.startsWith(Strings.hq)) {
                n4 = 5;
                s = s.substring(Strings.hq.length());
            }
            else if (lowerCase.startsWith(Strings.hk)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n4 = 6;
                s = s.substring(Strings.hk.length());
            }
            else if (lowerCase.startsWith(Strings.hp)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n4 = 7;
                s = s.substring(Strings.hp.length());
            }
            else if (lowerCase.startsWith(Strings.hf)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n4 = 8;
                s = s.substring(Strings.hf.length());
            }
            else if (lowerCase.startsWith(Strings.if)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n4 = 9;
                s = s.substring(Strings.if.length());
            }
            else if (lowerCase.startsWith(Strings.iu)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n4 = 10;
                s = s.substring(Strings.iu.length());
            }
            else if (lowerCase.startsWith(Strings.iy)) {
                n4 = 11;
                s = s.substring(Strings.iy.length());
            }
            else if (Language.Language_EN != language) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                if (lowerCase.startsWith(Strings.hn)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 0;
                    s = s.substring(Strings.hn.length());
                }
                else if (lowerCase.startsWith(Strings.hh)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 1;
                    s = s.substring(Strings.hh.length());
                }
                else if (lowerCase.startsWith(Strings.hc)) {
                    n4 = 2;
                    s = s.substring(Strings.hc.length());
                }
                else if (lowerCase.startsWith(Strings.ho)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 3;
                    s = s.substring(Strings.ho.length());
                }
                else if (lowerCase.startsWith(Strings.hb)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 4;
                    s = s.substring(Strings.hb.length());
                }
                else if (lowerCase.startsWith(Strings.hz)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 5;
                    s = s.substring(Strings.hz.length());
                }
                else if (lowerCase.startsWith(Strings.ha)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 6;
                    s = s.substring(Strings.ha.length());
                }
                else if (lowerCase.startsWith(Strings.he)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 7;
                    s = s.substring(Strings.he.length());
                }
                else if (lowerCase.startsWith(Strings.hy)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 8;
                    s = s.substring(Strings.hy.length());
                }
                else if (lowerCase.startsWith(Strings.ia)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 9;
                    s = s.substring(Strings.ia.length());
                }
                else if (lowerCase.startsWith(Strings.iw)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 10;
                    s = s.substring(Strings.iw.length());
                }
                else if (lowerCase.startsWith(Strings.iz)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n4 = 11;
                    s = s.substring(Strings.iz.length());
                }
            }
            final String lowerCase2 = s.toLowerCase();
            int n5 = 0;
            if (lowerCase2.startsWith(Strings.ig)) {
                n5 = 1;
                s = s.substring(Strings.ig.length());
            }
            else if (lowerCase2.startsWith(Strings.il)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n5 = 2;
                s = s.substring(Strings.il.length());
            }
            else if (lowerCase2.startsWith(Strings.in)) {
                n5 = 3;
                s = s.substring(Strings.in.length());
            }
            else if (lowerCase2.startsWith(Strings.ii)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n5 = 4;
                s = s.substring(Strings.ii.length());
            }
            else if (lowerCase2.startsWith(Strings.ie)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                n5 = 5;
                s = s.substring(Strings.ie.length());
            }
            else if (Language.Language_EN != language) {
                if (lowerCase2.startsWith(Strings.ih)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n5 = 1;
                    s = s.substring(Strings.ih.length());
                }
                else if (lowerCase2.startsWith(Strings.is)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n5 = 2;
                    s = s.substring(Strings.is.length());
                }
                else if (lowerCase2.startsWith(Strings.ic)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n5 = 3;
                    s = s.substring(Strings.ic.length());
                }
                else if (lowerCase2.startsWith(Strings.ik)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n5 = 4;
                    s = s.substring(Strings.ik.length());
                }
                else if (lowerCase2.startsWith(Strings.iq)) {
                    if (b <= 10) {
                        throw new IllegalStateException();
                    }
                    n5 = 5;
                    s = s.substring(Strings.iq.length());
                }
            }
            packetBufferNode.packetBuffer.bf(n4, (byte)10);
            packetBufferNode.packetBuffer.bf(n5, (byte)14);
            WorldMapArea.readWorldMapSection(packetBufferNode.packetBuffer, s, -53610141);
            if (n == class324.field3040.rsOrdinal(385613794)) {
                if (b <= 10) {
                    throw new IllegalStateException();
                }
                packetBufferNode.packetBuffer.bf(n2, (byte)83);
            }
            packetBufferNode.packetBuffer.cu(packetBufferNode.packetBuffer.at * -1633313603 - n3, 39256433);
            return packetBufferNode;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.af(" + ')');
        }
    }
    
    class461 kk() {
        return new class461(class379.op(this.field2851, this.field2842 * -212351097, (byte)68), this.field2851.dg(this.field2858 * 1953737631, 366850977));
    }
    
    public void method1734(final boolean b, final int n) {
        try {
            if (iq(this, -888867330) && !b) {
                if (n >= -1430979971) {
                    throw new IllegalStateException();
                }
                this.method1762(Math.max(542296527 * this.field2844, this.field2855 * 1350344153), b, (byte)121);
            }
            else if (this.field2854 * 1350344153 < this.field2851.dk(1482114163)) {
                if (n >= -1430979971) {
                    throw new IllegalStateException();
                }
                this.method1762(1 + 1350344153 * this.field2858, b, (byte)8);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bx(" + ')');
        }
    }
    
    public void gu(final boolean b) {
        this.method1762(this.field2851.method2006(1971062708), b, (byte)54);
    }
    
    public static void qu(final class314 class314, final boolean b, final int n) {
        if (class314 == null) {
            class314.method1724(b, n);
            return;
        }
        try {
            class314.method1762(class379.yz(class314.field2851, (int)class383.cy(class314.field2851.method2035(0, 1350344153 * class314.field2852, (byte)81), (byte)114).field3972, 1953737631 * class314.field2858 + 607166941 * class314.field2843, (byte)(-75)), b, (byte)118);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bs(" + ')');
        }
    }
    
    class461 method1759(final int n, final byte b) {
        try {
            final int method2006 = this.field2851.method2006(1616977564);
            int i = 0;
            int j = method2006;
            for (int k = n; k > 0; --k) {
                if (b >= 4) {
                    throw new IllegalStateException();
                }
                if (this.method1782(class379.ml(this.field2851, k - 1, 1345867261).field3624, 1230751066)) {
                    i = k;
                    break;
                }
            }
            int l = n;
            while (l < method2006) {
                if (b >= 4) {
                    throw new IllegalStateException();
                }
                if (this.method1782(class379.ml(this.field2851, l, 328310804).field3624, 1265522746)) {
                    if (b >= 4) {
                        throw new IllegalStateException();
                    }
                    j = l;
                    break;
                }
                else {
                    ++l;
                }
            }
            return new class461(i, j);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cz(" + ')');
        }
    }
    
    public boolean dr(final boolean b) {
        final boolean field2846 = b && this.field2848;
        final boolean b2 = field2846 != this.field2846;
        if (!(this.field2846 = field2846)) {
            this.method1725(this.field2852 * -876088831, this.field2852 * 1350344153, (byte)19);
        }
        return b2;
    }
    
    public void ga(final boolean field2848) {
        this.field2848 = field2848;
        this.field2846 = (field2848 && this.field2846);
    }
    
    boolean method1737(final AbstractFont abstractFont, final int n) {
        try {
            boolean b;
            if (!this.field2845) {
                if (n <= 1058907962) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            final boolean b2 = b;
            this.field2851.method2037(abstractFont, -1950541126);
            this.field2850.method2037(abstractFont, -918148565);
            this.field2845 = true;
            boolean b3 = b2 | this.method1713(this.field2859 * -466889091, this.field2843 * 607166941, (byte)25) | this.method1725(this.field2853 * 542296527, this.field2852 * 1350344153, (byte)19);
            if (this.method1761((byte)23)) {
                if (n <= 1058907962) {
                    throw new IllegalStateException();
                }
                xj(this, 1185795883);
                b3 = true;
            }
            return b3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ab(" + ')');
        }
    }
    
    public boolean method1710(final int n, final int n2, final byte b) {
        try {
            boolean b2 = false;
            Label_0037: {
                if (this.field2842 * -212351097 == n) {
                    if (b != 63) {
                        throw new IllegalStateException();
                    }
                    if (n2 == 1953737631 * this.field2858) {
                        b2 = false;
                        break Label_0037;
                    }
                    if (b != 63) {
                        throw new IllegalStateException();
                    }
                }
                b2 = true;
            }
            final boolean b3 = b2;
            this.field2842 = -1340125641 * n;
            this.field2858 = 86683743 * n2;
            return b3 | this.method1713(this.field2859 * -466889091, 607166941 * this.field2843, (byte)115);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.aq(" + ')');
        }
    }
    
    public void method1768(final byte b) {
        try {
            if (!this.kq(2035423595)) {
                if (b == 0) {
                    return;
                }
                if (this.field2852 * 1350344153 < this.field2851.method2006(1649412428)) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    final int yd = class379.yd(this.field2851, 1350344153 * this.field2852, 772421272);
                    xj(this, 2063742849);
                    this.method1725(yd, yd, (byte)19);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.aj(" + ')');
        }
    }
    
    public void method1717(final int n, final int n2) {
        try {
            this.field2851.method2009(n, (byte)(-57));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ag(" + ')');
        }
    }
    
    public void method1739(final class308 field2862, final int n) {
        try {
            this.field2862 = field2862;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bl(" + ')');
        }
    }
    
    public boolean ep(final int n) {
        this.field2844 = n * -399838397;
        final String mk = class379.mk(this.field2851, -1389348498);
        final int length = mk.length();
        final String method1757 = this.method1757(mk, (byte)(-74));
        if (method1757.length() != length) {
            this.field2851.method2014(method1757, -844450457);
            this.method1713(2067955070 * this.field2859, 1552595193 * this.field2843, (byte)116);
            this.method1761((byte)(-87));
            xj(this, 2145087894);
            return true;
        }
        return false;
    }
    
    public int jo() {
        return -947277461 * this.field2844;
    }
    
    public static int jo(final class314 class314, final int n) {
        if (class314 == null) {
            class314.method1783(n);
        }
        try {
            return class314.field2859 * -466889091;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cu(" + ')');
        }
    }
    
    boolean dg(String method1757) {
        if (!class379.mk(this.field2851, -1389348498).equals(method1757)) {
            method1757 = this.method1757(method1757, (byte)(-49));
            this.field2851.method2014(method1757, -844450457);
            this.method1713(-466889091 * this.field2859, 607166941 * this.field2843, (byte)67);
            this.method1761((byte)82);
            xj(this, 1042395829);
            return true;
        }
        return false;
    }
    
    public void method1730(final boolean b, final byte b2) {
        try {
            if (this.field2852 * 1350344153 < this.field2851.method2006(1925441462)) {
                this.method1762((int)this.method1759(1 + this.field2852 * 1350344153, (byte)(-42)).field3973, b, (byte)119);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bz(" + ')');
        }
    }
    
    public void hv(final class308 field2862) {
        this.field2862 = field2862;
    }
    
    public boolean iz() {
        if (!iq(this, -1369411738)) {
            return false;
        }
        final int method2016 = this.field2850.method2016(542296527 * this.field2858, this.field2849 * 1350344153, -1930898926);
        xj(this, 1254812672);
        this.method1725(method2016, method2016, (byte)19);
        return true;
    }
    
    public static boolean fu(final class314 class314, int n) {
        if (class314 == null) {
            class314.ew();
        }
        if (n < 0) {
            n = Integer.MAX_VALUE;
        }
        boolean b = n == class314.field2851.method2038(-1296915014);
        class314.field2851.method2033(n, (byte)2);
        class314.field2850.method2033(n, (byte)2);
        if (class314.method1761((byte)(-26))) {
            xj(class314, 1069938766);
            b = true;
        }
        return b;
    }
    
    public boolean jm() {
        return this.method1751(-2118415115) > 1;
    }
    
    public int iq() {
        return 607166941 * this.field2843;
    }
    
    public static boolean iq(final class314 class314, final int n) {
        if (class314 == null) {
            class314.method1723(n);
        }
        try {
            return 542296527 * class314.field2853 != class314.field2852 * 1350344153;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cv(" + ')');
        }
    }
    
    public class383 hq() {
        return this.field2851.method2035(-1938040515 * this.field2853, this.field2852 * 1350344153, (byte)52);
    }
    
    public boolean eg(final int n) {
        this.field2851.method2003(n, (byte)13);
        if (this.method1761((byte)(-72))) {
            xj(this, 1029085539);
            return true;
        }
        return false;
    }
    
    public void ew() {
        this.field2845 = false;
    }
    
    public static void qq(final class314 class314, final Clipboard clipboard) {
        if (class314 == null) {
            class314.hx();
            return;
        }
        if (iq(class314, 1536484861)) {
            class314.method1736(clipboard, (byte)93);
            class314.kq(-444632142);
        }
    }
    
    public static int ww(final class314 class314, final int n) {
        if (class314 == null) {
            class314.method1749(n);
        }
        try {
            return -947277461 * class314.field2844;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cr(" + ')');
        }
    }
    
    public boolean ej(final int n, final int n2) {
        boolean b = true;
        if (n < 0 || n > 2) {
            b = false;
        }
        if (n2 < 0 || n2 > 2) {
            b = false;
        }
        return b && this.field2851.method2010(n, n2, 981033088);
    }
    
    public int jq() {
        return class379.yh(this.field2851, 785448473);
    }
    
    public void method1721(final boolean b, final short n) {
        try {
            if (1350344153 * this.field2859 < this.field2850.method2038(1962874314)) {
                if (n <= 128) {
                    throw new IllegalStateException();
                }
                this.method1762(this.field2850.method2018(1350344153 * this.field2857, up(this, 1219591840), (byte)121), b, (byte)102);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bj(" + ')');
        }
    }
    
    public static void gm(final class314 class314, int n, int n2, final boolean b, final boolean b2) {
        if (class314 == null) {
            class314.ec();
            return;
        }
        int yz;
        if (!class314.field2845) {
            yz = 0;
        }
        else {
            n += -466889091 * class314.field2859;
            n2 += 607166941 * class314.field2843;
            final class461 jb = class314.jb(-143803626);
            yz = class379.yz(class314.field2851, n - (int)jb.field3972, n2 - (int)jb.field3973, (byte)(-39));
        }
        if (b && b2) {
            class314.field2860 = -1271167213;
            class314.method1758(class314.method1759(-600117957 * class314.field2854, (byte)(-16)), class314.method1759(yz, (byte)(-63)), 1024162725);
        }
        else if (b) {
            class314.field2860 = -1271167213;
            final class461 method1759 = class314.method1759(yz, (byte)(-30));
            class314.method1725((int)method1759.field3972, (int)method1759.field3973, (byte)19);
            class314.field2854 = (int)method1759.field3972 * 1170826227;
        }
        else if (b2) {
            class314.method1725(class314.field2854 * -600117957, yz, (byte)19);
        }
        else {
            if (class314.field2855 * 2106407237 > 0 && yz == -600117957 * class314.field2854) {
                if (542296527 * class314.field2853 == 1350344153 * class314.field2852) {
                    class314.field2860 = -1271167213;
                    final class461 method1760 = class314.method1759(yz, (byte)(-96));
                    class314.method1725((int)method1760.field3972, (int)method1760.field3973, (byte)19);
                }
                else {
                    class314.field2860 = 1752632870;
                    final class461 ws = ws(class314, yz, -600467207);
                    class314.method1725((int)ws.field3972, (int)ws.field3973, (byte)19);
                }
            }
            else {
                class314.field2860 = 0;
                class314.method1725(yz, yz, (byte)19);
                class314.field2854 = 1170826227 * yz;
            }
            class314.field2855 = 1656428229;
        }
    }
    
    public boolean dj(final int n, final int n2) {
        final boolean b = this.field2842 * -212351097 != n || n2 != 1953737631 * this.field2858;
        this.field2842 = -1340125641 * n;
        this.field2858 = 86683743 * n2;
        return b | this.method1713(this.field2859 * -466889091, 607166941 * this.field2843, (byte)44);
    }
    
    public void gz(final Clipboard clipboard) {
        if (iq(this, -710188736)) {
            this.method1736(clipboard, (byte)22);
            this.kq(-430944182);
        }
    }
    
    public static boolean gz(final class314 class314, final int n) {
        class314.field2851.method2003(n, (byte)85);
        if (class314.method1761((byte)22)) {
            xj(class314, 1146098241);
            return true;
        }
        return false;
    }
    
    public class383 hk() {
        return this.field2851.method2035(542296527 * this.field2853, this.field2852 * 1298518473, (byte)64);
    }
    
    public int jx() {
        return -947277461 * this.field2844;
    }
    
    public void ff(final boolean b) {
        this.method1762(class379.yz(this.field2851, (int)class383.cy(this.field2851.method2035(0, this.field2852 * 1973931892, (byte)6), (byte)4).field3972, -1640137087 * this.field2843, (byte)(-78)), b, (byte)113);
    }
    
    public void go(final boolean b) {
        this.method1762(class379.yz(this.field2851, (int)class383.cy(this.field2851.method2035(0, this.field2852 * 1350344153, (byte)16), (byte)76).field3972, 607166941 * this.field2843, (byte)(-88)), b, (byte)101);
    }
    
    boolean jd() {
        if (!iq(this, -1369411738)) {
            return false;
        }
        final int method2016 = this.field2851.method2016(542296527 * this.field2853, this.field2852 * 1350344153, -1930898926);
        xj(this, 1254812672);
        this.method1725(method2016, method2016, (byte)19);
        return true;
    }
    
    public static void jd(final class314 class314, final boolean b, final int n) {
        if (class314 == null) {
            class314.method1734(b, n);
            return;
        }
        try {
            class314.method1762(class379.yz(class314.field2851, (int)class383.cy(class314.field2851.method2035(0, class314.field2852 * 1350344153, (byte)4), (byte)31).field3972, 607166941 * class314.field2843, (byte)(-96)), b, (byte)12);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bn(" + ')');
        }
    }
    
    public static void gr(final class314 class314, final Clipboard clipboard) {
        final class383 method2035 = class314.field2851.method2035(542296527 * class314.field2853, class314.field2852 * -1499807185, (byte)80);
        if (!method2035.method2078(726250264)) {
            final String method2036 = method2035.method2083(1764982112);
            if (!method2036.isEmpty()) {
                clipboard.setContents(new StringSelection(method2036), null);
            }
        }
    }
    
    public void gr(final boolean b) {
        this.method1762(class379.yz(this.field2851, (int)class383.cy(this.field2851.method2035(0, this.field2852 * 1350344153, (byte)4), (byte)99).field3972, 607166941 * this.field2843, (byte)(-4)), b, (byte)4);
    }
    
    public boolean jn() {
        return this.method1751(-2053530043) > 1;
    }
    
    public static void vf(final class314 class314, final Clipboard clipboard) {
        final class383 method2035 = class314.field2851.method2035(-1752252471 * class314.field2853, class314.field2852 * -917728367, (byte)51);
        if (!method2035.method2078(-1435717854)) {
            final String method2036 = method2035.method2083(-468631847);
            if (!method2036.isEmpty()) {
                clipboard.setContents(new StringSelection(method2036), null);
            }
        }
    }
    
    public static void yj(final class314 class314) {
        class314.field2847 = (-870124373 * class314.field2847 + 1) % 60 * -867080701;
        if (2106407237 * class314.field2855 > 0) {
            class314.field2855 -= 238055821;
        }
    }
    
    public static boolean zg(final class314 class314, String method1757) {
        if (!class379.mk(class314.field2851, -1389348498).equals(method1757)) {
            method1757 = class314.method1757(method1757, (byte)13);
            class314.field2851.method2014(method1757, -844450457);
            class314.method1713(-466889091 * class314.field2859, 607166941 * class314.field2843, (byte)51);
            class314.method1761((byte)(-34));
            xj(class314, 1702120122);
            return true;
        }
        return false;
    }
    
    public static void xj(final class314 class314, final int n) {
        if (class314 == null) {
            class314.method1766(n);
        }
        try {
            if (class314.field2862 != null) {
                if (n <= 855676172) {
                    throw new IllegalStateException();
                }
                class314.field2862.vmethod5708(427135973);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.dm(" + ')');
        }
    }
    
    public static void yv(final class314 class314, final boolean b, final int n) {
        if (class314 == null) {
            class314.method1722(b, n);
        }
        try {
            class314.method1762((int)ws(class314, class314.field2852 * 1350344153, -600467207).field3972, b, (byte)41);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.by(" + ')');
        }
    }
    
    public boolean fz(int method2006, int method2007) {
        if (!this.da(742700247)) {
            this.field2853 = 1269275951 * method2006;
            this.field2852 = 936197709 * method2007;
            return false;
        }
        if (method2006 > this.field2851.method2006(1501345959)) {
            method2006 = this.field2851.method2006(1617148085);
        }
        if (method2007 > this.field2851.method2006(1820287364)) {
            method2007 = this.field2851.method2006(1849121630);
        }
        final boolean b = 542296527 * this.field2853 != method2006 || this.field2852 * 1350344153 != method2007;
        this.field2853 = -1798373024 * method2006;
        if (method2007 != this.field2852 * 1350344153) {
            this.field2852 = method2007 * -2117510466;
            this.field2847 = 0;
            hr(this, (byte)26);
        }
        if (b && this.field2861 != null) {
            this.field2861.vmethod5708(427135973);
        }
        return b;
    }
    
    public void gs(final boolean b) {
        this.method1762(0, b, (byte)52);
    }
    
    class461 jz(final int n) {
        final int method2006 = this.field2851.method2006(1388027815);
        int i = 0;
        int j = method2006;
        for (int k = n; k > 0; --k) {
            if (this.method1782(class379.ml(this.field2851, k - 1, 1940487259).field3624, 1743385280)) {
                i = k;
                break;
            }
        }
        for (int l = n; l < method2006; ++l) {
            if (this.method1782(class379.ml(this.field2851, l, 680195657).field3624, 1730235675)) {
                j = l;
                break;
            }
        }
        return new class461(i, j);
    }
    
    public int method1749(final int n) {
        try {
            return -947277461 * this.field2842;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.cr(" + ')');
        }
    }
    
    void ku() {
        final class461 cy = class383.cy(this.field2851.method2035(0, 1350344153 * this.field2852, (byte)25), (byte)72);
        final int he = class379.he(this.field2851, -297150195);
        final int n = (int)cy.field3972 - 10;
        final int n2 = n + 20;
        final int n3 = (int)cy.field3973 - 3;
        final int n4 = he + (6 + n3);
        final int n5 = this.field2859 * -466889091;
        final int n6 = n5 + -212351097 * this.field2842;
        final int n7 = this.field2843 * 607166941;
        final int n8 = 1953737631 * this.field2858 + n7;
        int n9 = -466889091 * this.field2859;
        int n10 = 607166941 * this.field2843;
        if (n < n5) {
            n9 = n;
        }
        else if (n2 > n6) {
            n9 = n2 - this.field2842 * -212351097;
        }
        if (n3 < n7) {
            n10 = n3;
        }
        else if (n4 > n8) {
            n10 = n4 - this.field2858 * 1953737631;
        }
        this.method1713(n9, n10, (byte)66);
    }
    
    void jl(final int n, final boolean b) {
        if (b) {
            this.method1725(this.field2853 * 542296527, n, (byte)19);
        }
        else {
            this.method1725(n, n, (byte)19);
        }
    }
    
    public void fb() {
        this.method1725(0, this.field2851.method2006(1592276617), (byte)19);
    }
    
    static Widget method1731(final int n, final Widget widget, final int n2, final int n3, final int n4, final int n5, final int n6, final float[] array, final byte b) {
        try {
            final Widget widget2 = new Widget();
            widget2.type = -1183495331 * n;
            widget2.parentId = -1942978835 * widget.id;
            widget2.childIndex = -1274125071 * n2;
            widget2.modelOrthog = true;
            widget2.xAlignment = 1656805111 * n3;
            widget2.yAlignment = -362988363 * n4;
            widget2.widthAlignment = 387308049 * n5;
            widget2.heightAlignment = -480958745 * n6;
            widget2.rawX = 1806877347 * (int)(-794961409 * widget.width * array[0]);
            widget2.rawY = 1231090287 * (int)(1473950221 * widget.height * array[1]);
            widget2.rawWidth = -1495372107 * (int)(-794961409 * widget.width * array[2]);
            widget2.rawHeight = 1193771871 * (int)(array[3] * (1473950221 * widget.height));
            return widget2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bm(" + ')');
        }
    }
    
    public void method1731(final boolean b, final byte b2) {
        try {
            if (this.field2857 * 1350344153 < this.field2851.dk(1787167198)) {
                if (b2 >= 0) {
                    return;
                }
                this.method1762(this.field2851.method2018(this.field2856 * 1350344153, 1, (byte)33), b, (byte)12);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bd(" + ')');
        }
    }
    
    public static boolean method1728(final class314 class314, final int n) {
        if (class314 == null) {
            return class314.ey(n);
        }
        try {
            return class314.field2846;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ce(" + ')');
        }
    }
    
    public void method1728(final boolean b, final int n) {
        try {
            if (iq(this, -818668023) && !b) {
                if (n <= 201832934) {
                    return;
                }
                this.method1762(Math.min(542296527 * this.field2853, 1350344153 * this.field2852), b, (byte)35);
            }
            else if (this.field2852 * 1350344153 > 0) {
                if (n <= 201832934) {
                    throw new IllegalStateException();
                }
                this.method1762(this.field2852 * 1350344153 - 1, b, (byte)107);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bk(" + ')');
        }
    }
    
    class461 jt(final int n) {
        final int method2006 = this.field2851.method2006(1992571483);
        int i = 0;
        int j = method2006;
        for (int k = n; k > 0; --k) {
            if (class379.ml(this.field2851, k - 1, 681820542).field3624 == '\n') {
                i = k;
                break;
            }
        }
        for (int l = n; l < method2006; ++l) {
            if (class379.ml(this.field2851, l, 801481710).field3624 == '\n') {
                j = l;
                break;
            }
        }
        return new class461(i, j);
    }
    
    boolean dq(final AbstractFont abstractFont) {
        final boolean b = !this.field2845;
        this.field2851.method2037(abstractFont, -2135210752);
        this.field2850.method2037(abstractFont, -1756869595);
        this.field2845 = true;
        boolean b2 = b | this.method1713(this.field2859 * -466889091, this.field2843 * 607166941, (byte)119) | this.method1725(this.field2853 * -668371905, this.field2852 * 1350344153, (byte)19);
        if (this.method1761((byte)(-14))) {
            xj(this, 1119996730);
            b2 = true;
        }
        return b2;
    }
    
    public boolean eo(int n) {
        if (n < 0) {
            n = 432139515;
        }
        boolean b = n == this.field2851.method2038(-1296915014);
        this.field2851.method2033(n, (byte)2);
        this.field2850.method2033(n, (byte)2);
        if (this.method1761((byte)(-36))) {
            xj(this, 1479166194);
            b = true;
        }
        return b;
    }
    
    public int jg() {
        return -947277461 * this.field2844;
    }
    
    public void eb(final int n) {
        this.field2849 = n * 258208179;
    }
    
    public class379 ho() {
        return this.field2850;
    }
    
    public static void jy(final IterableDualNodeQueue iterableDualNodeQueue, final DualNode dualNode) {
        if (iterableDualNodeQueue == null) {
            iterableDualNodeQueue.ay(dualNode);
        }
        iterableDualNodeQueue.add(dualNode);
    }
    
    class461 jy(final int n) {
        final int method2006 = this.field2851.method2006(1266012235);
        int i = 0;
        int j = method2006;
        for (int k = n; k > 0; --k) {
            if (class379.ml(this.field2851, k - 1, 258572504).field3624 == '\n') {
                i = k;
                break;
            }
        }
        for (int l = n; l < method2006; ++l) {
            if (class379.ml(this.field2851, l, 2035582684).field3624 == '\n') {
                j = l;
                break;
            }
        }
        return new class461(i, j);
    }
    
    public void method1718(final int n, final short n2) {
        try {
            this.field2851.method2029(n, -2120915806);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ah(" + ')');
        }
    }
    
    public int ik() {
        return 607166941 * this.field2843;
    }
    
    class461 jh(final int n) {
        final int method2006 = this.field2851.method2006(1177435415);
        int i = 0;
        int j = method2006;
        for (int k = n; k > 0; --k) {
            if (this.method1782(class379.ml(this.field2851, k - 1, 2116574098).field3624, 2037707483)) {
                i = k;
                break;
            }
        }
        for (int l = n; l < method2006; ++l) {
            if (this.method1782(class379.ml(this.field2851, l, 1975115607).field3624, 842411230)) {
                j = l;
                break;
            }
        }
        return new class461(i, j);
    }
    
    public int ig() {
        return this.field2852 * 1350344153;
    }
    
    boolean kq(final int n) {
        try {
            if (!iq(this, -1129772276)) {
                return false;
            }
            final int method2016 = this.field2851.method2016(542296527 * this.field2853, this.field2852 * 1350344153, 1596917550);
            xj(this, 1799614479);
            this.method1725(method2016, method2016, (byte)19);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ad(" + ')');
        }
    }
    
    public void gj(final boolean b) {
        if (iq(this, 2009281562) && !b) {
            this.method1762(Math.min(542296527 * this.field2853, 1350344153 * this.field2852), b, (byte)36);
        }
        else if (this.field2852 * 1350344153 > 0) {
            this.method1762(this.field2852 * 1350344153 - 1, b, (byte)77);
        }
    }
    
    void jr(final class461 class461, final class461 class462) {
        if ((int)class462.field3972 < (int)class461.field3972) {
            this.method1725((int)class461.field3973, (int)class462.field3972, (byte)19);
        }
        else {
            this.method1725((int)class461.field3972, (int)class462.field3973, (byte)19);
        }
    }
    
    class461 kj() {
        return new class461(class379.op(this.field2851, this.field2859 * -212351097, (byte)68), this.field2851.dh(this.field2844 * 1953737631, 366850977));
    }
    
    boolean kw(final int n) {
        switch (-947277461 * this.field2844) {
            case 4: {
                final char c = (char)n;
                return class149.isDigit(c, 2060205930) || c == 'k' || c == 'K' || c == 'm' || 'M' == c || c == 'b' || c == 'B';
            }
            case 3: {
                return class149.isDigit((char)n, -215760798);
            }
            default: {
                return true;
            }
            case 1: {
                return MenuAction.isAlphaNumeric((char)n, -576786405);
            }
            case 2: {
                return class134.isCharAlphabetic((char)n, (byte)3);
            }
        }
    }
    
    public static void xr(final class314 class314, final boolean b) {
        class314.method1762(class379.yz(class314.field2851, (int)class383.cy(class314.field2851.method2035(0, class314.field2852 * 1350344153, (byte)27), (byte)127).field3972, 1218006448 * class314.field2843, (byte)(-89)), b, (byte)44);
    }
    
    public static boolean vu(final class314 class314, final int b, final int b2) {
        if (class314 == null) {
            return class314.kq(b);
        }
        if (!class314.da(-841432292)) {
            class314.field2859 = -222752982 * b;
            class314.field2843 = b2 * -218901033;
            return false;
        }
        final int n = -466889091 * class314.field2859;
        final int n2 = 607166941 * class314.field2843;
        final int max = Math.max(0, class379.method2023(class314.field2851, 1649905196) - class314.field2842 * 1539115522 + 2);
        final int max2 = Math.max(0, class314.field2851.method2020(-2055102246) - class314.field2858 * -335824962 + 1);
        class314.field2859 = Math.max(0, Math.min(max, b)) * -1096673451;
        class314.field2843 = Math.max(0, Math.min(max2, b2)) * -2081112459;
        return n != class314.field2859 * 1303766726 || 1902750554 * class314.field2843 != n2;
    }
    
    public void hj() {
        this.field2843 = Math.min(Math.max(0, this.field2851.method2020(-1906560555) - 1953737631 * this.field2858), 607166941 * this.field2843 + class379.he(this.field2851, -297150195)) * -2081112459;
    }
    
    public boolean ey(final int n) {
        try {
            return this.field2845;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.ce(" + ')');
        }
    }
    
    public boolean hf() {
        return this.field2848;
    }
    
    public void method1776(final Clipboard clipboard, final byte b) {
        try {
            if (iq(this, -306594009)) {
                if (b <= 99) {
                    return;
                }
                this.method1736(clipboard, (byte)72);
                this.kq(80262119);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bf(" + ')');
        }
    }
    
    public void method1736(final Clipboard clipboard, final byte b) {
        try {
            final class383 method2035 = this.field2851.method2035(542296527 * this.field2853, this.field2852 * 1350344153, (byte)122);
            if (!method2035.method2078(-379374545)) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                final String method2036 = method2035.method2083(-684085942);
                if (!method2036.isEmpty()) {
                    if (b <= 0) {
                        throw new IllegalStateException();
                    }
                    clipboard.setContents(new StringSelection(method2036), null);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.bu(" + ')');
        }
    }
    
    boolean du(final String s) {
        this.field2850.method2014(s, -844450457);
        return true;
    }
    
    class461 jb(final int n) {
        try {
            return new class461(class379.op(this.field2851, this.field2842 * -212351097, (byte)88), this.field2851.dg(this.field2858 * 1953737631, 1521607060));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mz.dc(" + ')');
        }
    }
}
