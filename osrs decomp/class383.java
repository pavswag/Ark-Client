import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class class383
{
    int field3649;
    int field3648;
    static final int lh = 16;
    class379 field3650;
    
    class383(final class379 field3650, final int n, final int n2) {
        this.field3649 = 0;
        this.field3648 = 0;
        this.field3650 = field3650;
        this.field3649 = n * -1672722573;
        this.field3648 = n2 * 1839294905;
    }
    
    int ad() {
        if (this.method2078(536203531)) {
            return 0;
        }
        final class381 ml = class379.ml(this.field3650, this.field3648 * 93003089 - 1, 607213343);
        if ('\n' == ml.field3624) {
            return 0;
        }
        if (this.method2082(ml, -2137552054)) {
            return this.field3650.field3612.advances[-98524550];
        }
        final int n = this.field3650.field3612.advances[ml.field3624];
        if (n != 0) {
            return n;
        }
        if (ml.field3624 == '\t') {
            return this.field3650.field3612.advances[-1784777317] * 3;
        }
        return this.field3650.field3612.advances[32];
    }
    
    public class461 ae() {
        if (this.method2078(835665274)) {
            return new class461(0, 0);
        }
        final class381 ml = class379.ml(this.field3650, 987221129 * this.field3648 - 1, 643343559);
        return new class461(1442798728 * ml.field3625 + lo(this, -2139094912), -1619628804 * ml.field3623);
    }
    
    public class461 bb() {
        if (this.method2078(1553737770)) {
            return new class461(0, 0);
        }
        final class381 ml = class379.ml(this.field3650, 987221129 * this.field3648 - 1, 367822363);
        return new class461(1620071571 * ml.field3625 + lo(this, -2139094912), -727185157 * ml.field3623);
    }
    
    public String ao() {
        if (this.method2078(-207727649)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(ud(this, (byte)74));
        for (int i = -816892485 * this.field3649; i < this.field3649 * 987221129; ++i) {
            sb.append(class379.ml(this.field3650, i, 387863192).field3624);
        }
        return sb.toString();
    }
    
    public String at() {
        if (this.method2078(-1018582684)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(ud(this, (byte)58));
        for (int i = -816892485 * this.field3649; i < this.field3648 * -439151731; ++i) {
            sb.append(class379.ml(this.field3650, i, 1931059824).field3624);
        }
        return sb.toString();
    }
    
    boolean ak(final class381 class381) {
        return 2 == this.field3650.field3621 * 1216491921 || (this.field3650.field3621 * 874587033 != 0 && class379.ge(this.field3650, -1433710051) != class381);
    }
    
    public int av() {
        return this.field3648 * -157443508 - -282843536 * this.field3649;
    }
    
    boolean as(final class381 class381) {
        return 2 == this.field3650.field3621 * 874587033 || (this.field3650.field3621 * 874587033 != 0 && class379.ge(this.field3650, -1433710051) != class381);
    }
    
    public static int lo(final class383 class383, final int n) {
        if (class383 == null) {
            class383.method2084(n);
        }
        try {
            if (class383.method2078(52965697)) {
                if (n != -2139094912) {
                    throw new IllegalStateException();
                }
                return 0;
            }
            else {
                final class381 ml = class379.ml(class383.field3650, class383.field3648 * 987221129 - 1, 1670460876);
                if ('\n' == ml.field3624) {
                    if (n != -2139094912) {
                        throw new IllegalStateException();
                    }
                    return 0;
                }
                else if (class383.method2082(ml, -2138550127)) {
                    if (n != -2139094912) {
                        throw new IllegalStateException();
                    }
                    return class383.field3650.field3612.advances[42];
                }
                else {
                    final int n2 = class383.field3650.field3612.advances[ml.field3624];
                    if (n2 != 0) {
                        return n2;
                    }
                    if (ml.field3624 == '\t') {
                        return class383.field3650.field3612.advances[32] * 3;
                    }
                    return class383.field3650.field3612.advances[32];
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.ab(" + ')');
        }
    }
    
    boolean az(final class381 class381) {
        return 2 == this.field3650.field3621 * 874587033 || (this.field3650.field3621 * 874587033 != 0 && class379.ge(this.field3650, -1433710051) != class381);
    }
    
    public String ay() {
        if (this.method2078(-207727649)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(ud(this, (byte)74));
        for (int i = -816892485 * this.field3649; i < this.field3648 * 987221129; ++i) {
            sb.append(class379.ml(this.field3650, i, 387863192).field3624);
        }
        return sb.toString();
    }
    
    public class381 bi(final int n) {
        if (n < 0 || n >= ud(this, (byte)31)) {
            return null;
        }
        return class379.ml(this.field3650, this.field3649 * 1553652365 + n, 224273750);
    }
    
    public static int ud(final class383 class383, final byte b) {
        if (class383 == null) {
            class383.method2079(b);
        }
        try {
            return class383.field3648 * 987221129 - -816892485 * class383.field3649;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.ac(" + ')');
        }
    }
    
    public boolean method2078(final int n) {
        try {
            boolean b;
            if (987221129 * this.field3648 == -816892485 * this.field3649) {
                if (n == -769802917) {
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
            throw HealthBar.get(ex, "oa.aw(" + ')');
        }
    }
    
    public int am() {
        return this.field3648 * 987221129 - -816892485 * this.field3649;
    }
    
    public class381 method2080(final int n, final int n2) {
        try {
            if (n >= 0) {
                if (n2 != -1037292745) {
                    throw new IllegalStateException();
                }
                if (n < ud(this, (byte)60)) {
                    return class379.ml(this.field3650, this.field3649 * -816892485 + n, 1209764508);
                }
                if (n2 != -1037292745) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.al(" + ')');
        }
    }
    
    static String method2081(final int i, final int n) {
        try {
            return "<col=" + Integer.toHexString(i) + ">";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.an(" + ')');
        }
    }
    
    boolean method2081(final int n, final int n2) {
        try {
            if (class379.yh(this.field3650, 785448473) != 2) {
                if (n2 <= 439537412) {
                    throw new IllegalStateException();
                }
                if (class379.yh(this.field3650, 785448473) == 1) {
                    if (n2 <= 439537412) {
                        throw new IllegalStateException();
                    }
                    if (!this.field3650.field3618) {
                        return true;
                    }
                    if (n2 <= 439537412) {
                        throw new IllegalStateException();
                    }
                    if (this.field3648 * 987221129 - 1 != n) {
                        if (n2 <= 439537412) {
                            throw new IllegalStateException();
                        }
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.an(" + ')');
        }
    }
    
    public int method2079(final byte b) {
        try {
            return this.field3648 * 987221129 - -816892485 * this.field3648;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.ac(" + ')');
        }
    }
    
    public static String vm(final class383 class383) {
        if (class383 == null) {
            class383.ao();
        }
        if (class383.method2078(535363956)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(ud(class383, (byte)34));
        for (int i = -816892485 * class383.field3649; i < class383.field3648 * 987221129; ++i) {
            sb.append(class379.ml(class383.field3650, i, 2083737508).field3624);
        }
        return sb.toString();
    }
    
    boolean method2082(final class381 class381, final int n) {
        try {
            if (2 == this.field3650.field3621 * 874587033) {
                return true;
            }
            if (this.field3650.field3621 * 874587033 == 0) {
                if (n >= -2136737661) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (class379.ge(this.field3650, -1433710051) == class381) {
                    return false;
                }
                if (n >= -2136737661) {
                    throw new IllegalStateException();
                }
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.au(" + ')');
        }
    }
    
    boolean ai(final int n) {
        if (class379.yh(this.field3650, 785448473) != 2) {
            if (class379.yh(this.field3650, 785448473) == 1) {
                if (!this.field3650.field3618) {
                    return true;
                }
                if (this.field3648 * -123190061 - 1 != n) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public class461 by() {
        if (this.method2078(1592583605)) {
            return new class461(0, 0);
        }
        final class381 ml = class379.ml(this.field3650, 987221129 * this.field3648 - 1, 1493245137);
        return new class461(1620071571 * ml.field3625 + lo(this, -2139094912), -727185157 * ml.field3623);
    }
    
    public int ar() {
        return this.field3648 * 987221129 - -816892485 * this.field3649;
    }
    
    public class461 ap() {
        if (this.method2078(-942289402)) {
            return new class461(0, 0);
        }
        final class381 ml = class379.ml(this.field3650, -1651280911 * this.field3648 - 1, 1718661519);
        return new class461(1620071571 * ml.field3625 + lo(this, -2139094912), -727185157 * ml.field3623);
    }
    
    public static class381 mb(final class383 class383, final int n) {
        if (class383 == null) {
            class383.ai(n);
        }
        if (n >= 0 && n < ud(class383, (byte)87)) {
            return class379.ml(class383.field3650, class383.field3649 * -1066174517 + n, 438731131);
        }
        return null;
    }
    
    public static class461 cy(final class383 class383, final byte b) {
        if (class383 == null) {
            return class383.method2077(b);
        }
        try {
            if (!class383.method2078(1356803995)) {
                final class381 ml = class379.ml(class383.field3650, 987221129 * class383.field3648 - 1, 1423115086);
                return new class461(1620071571 * ml.field3625 + lo(class383, -2139094912), -727185157 * ml.field3623);
            }
            if (b <= 1) {
                throw new IllegalStateException();
            }
            return new class461(0, 0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.aq(" + ')');
        }
    }
    
    public String method2083(final int n) {
        try {
            if (!this.method2078(888125791)) {
                final StringBuilder sb = new StringBuilder(ud(this, (byte)121));
                for (int i = -816892485 * this.field3649; i < this.field3648 * 987221129; ++i) {
                    if (n == -1501890865) {
                        throw new IllegalStateException();
                    }
                    sb.append(class379.ml(this.field3650, i, 1201560910).field3624);
                }
                return sb.toString();
            }
            if (n == -1501890865) {
                throw new IllegalStateException();
            }
            return "";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.af(" + ')');
        }
    }
    
    int method2084(final int n) {
        try {
            if (this.method2078(52965697)) {
                if (n != -2139094912) {
                    throw new IllegalStateException();
                }
                return 0;
            }
            else {
                final class381 ml = class379.ml(this.field3650, this.field3648 * 987221129 - 1, 1670460876);
                if ('\n' == ml.field3624) {
                    if (n != -2139094912) {
                        throw new IllegalStateException();
                    }
                    return 0;
                }
                else if (this.method2082(ml, -2138550127)) {
                    if (n != -2139094912) {
                        throw new IllegalStateException();
                    }
                    return this.field3650.field3612.topBearings[42];
                }
                else {
                    final int n2 = this.field3650.field3612.topBearings[ml.field3624];
                    if (n2 != 0) {
                        return n2;
                    }
                    if (ml.field3624 == '\t') {
                        return this.field3650.field3612.advances[32] * 3;
                    }
                    return this.field3650.field3612.heights[32];
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.ab(" + ')');
        }
    }
    
    public static void method2084(final int n) {
        try {
            DbTableType.DBTableType_cache.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.ab(" + ')');
        }
    }
    
    public class461 method2077(final byte b) {
        try {
            if (!this.method2078(1356803995)) {
                final class381 ml = class379.ml(this.field3650, 987221129 * this.field3648 - 1, 1423115086);
                return new class461(1620071571 * ml.field3625 + lo(this, -2139094912), -727185157 * ml.field3625);
            }
            if (b <= 1) {
                throw new IllegalStateException();
            }
            return new class461(0, 0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.aq(" + ')');
        }
    }
    
    boolean aj(final class381 class381) {
        return 2 == this.field3650.field3621 * 874587033 || (this.field3650.field3621 * 874587033 != 0 && class379.ge(this.field3650, -1433710051) != class381);
    }
    
    boolean ag(final int n) {
        if (class379.yh(this.field3650, 785448473) != 2) {
            if (class379.yh(this.field3650, 785448473) == 1) {
                if (!this.field3650.field3618) {
                    return true;
                }
                if (this.field3648 * -1430156061 - 1 != n) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    static void method2086(final Buffer buffer, final byte b) {
        try {
            if (Client.randomDatData == null) {
                final byte[] array = new byte[24];
                try {
                    BufferedFile.cu(JagexCache.JagexCache_randomDat, 0L);
                    BufferedFile.mg(JagexCache.JagexCache_randomDat, array, 421254913);
                    int i = 0;
                    while (i < 24) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        if (array[i] != 0) {
                            if (b == 0) {
                                throw new IllegalStateException();
                            }
                            break;
                        }
                        else {
                            ++i;
                        }
                    }
                    if (i >= 24) {
                        throw new IOException();
                    }
                }
                catch (Exception ex2) {
                    for (int j = 0; j < 24; ++j) {
                        if (b == 0) {
                            throw new IllegalStateException();
                        }
                        array[j] = -1;
                    }
                }
                final byte[] array2 = array;
                buffer.writeBytes(array2, 0, array2.length, (byte)121);
                return;
            }
            if (b == 0) {
                throw new IllegalStateException();
            }
            buffer.writeBytes(Client.randomDatData, 0, Client.randomDatData.length, (byte)61);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.nj(" + ')');
        }
    }
    
    public static String vf(final class383 class383) {
        if (class383 == null) {
            class383.ap();
        }
        if (class383.method2078(807887781)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(ud(class383, (byte)102));
        for (int i = -816892485 * class383.field3649; i < class383.field3648 * -1689448518; ++i) {
            sb.append(class379.ml(class383.field3650, i, 305706853).field3624);
        }
        return sb.toString();
    }
    
    public static String yz(final class383 class383) {
        if (class383 == null) {
            class383.am();
        }
        if (class383.method2078(1947892140)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(ud(class383, (byte)92));
        for (int i = -816892485 * class383.field3649; i < class383.field3648 * 987221129; ++i) {
            sb.append(class379.ml(class383.field3650, i, 332860774).field3624);
        }
        return sb.toString();
    }
    
    boolean method2085(final int n) {
        return class379.yh(this.field3650, 785448473) == 2 || (class379.yh(this.field3650, 785448473) == 1 && (!this.field3650.field3618 || this.field3648 * -1771909377 - 1 != n));
    }
    
    static final int method2085(final int n, final int n2, final byte b) {
        try {
            return (Actor.method537(n - 1, n2, -821259514) + Actor.method537(n + 1, n2, -1297477927) + Actor.method537(n, n2 - 1, -215242667) + Actor.method537(n, n2 + 1, -771867893)) / 8 + (Actor.method537(n - 1, n2 - 1, -1598492457) + Actor.method537(1 + n, n2 - 1, -918705420) + Actor.method537(n - 1, n2 + 1, -527335769) + Actor.method537(1 + n, 1 + n2, -1414487809)) / 16 + Actor.method537(n, n2, -1041731236) / 4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oa.ah(" + ')');
        }
    }
}
