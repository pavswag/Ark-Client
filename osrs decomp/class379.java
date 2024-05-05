import java.util.ArrayList;

// 
// Decompiled by Procyon v0.5.36
// 

public class class379
{
    static final int at = 9;
    public static final int an = 1;
    int field3611;
    static final int ac = 1;
    static final int ab = 42;
    AbstractFont field3612;
    public static int musicTrackGroupId;
    int field3614;
    int field3615;
    int field3616;
    int field3617;
    boolean field3618;
    static final int af = 0;
    ArrayList field3619;
    int field3620;
    int field3621;
    static final int by = 1;
    static final int aw = 0;
    
    public class379() {
        this.field3616 = 1729616775;
        this.field3614 = -1966324537;
        this.field3615 = 0;
        this.field3620 = 0;
        this.field3617 = 0;
        this.field3618 = true;
        this.field3619 = new ArrayList();
        this.field3611 = 0;
        this.field3621 = 0;
    }
    
    public int dp(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            final int n = toIndex;
            toIndex = fromIndex;
            fromIndex = n;
        }
        this.field3619.subList(fromIndex, toIndex).clear();
        int i = fromIndex;
        if (this.method2005((byte)16) && 1 == -81624845 * this.field3611) {
            while (i > 0) {
                --i;
                final char field3624 = this.field3619.get(i).field3624;
                if (1738764984 == field3624) {
                    break;
                }
                if (field3624 == '\t') {
                    break;
                }
            }
        }
        this.method2026(i, toIndex, -93545195);
        return fromIndex;
    }
    
    int method2030(final int index, boolean b, final int n) {
        try {
            if (index < this.field3619.size()) {
                if (n >= -142378407) {
                    throw new IllegalStateException();
                }
                int n2 = this.field3619.get(index).field3623 * -727185157;
                for (int i = index; i > 0; --i) {
                    if (n >= -142378407) {
                        throw new IllegalStateException();
                    }
                    if (((class381)this.field3619.get(i - 1)).field3623 * -727185157 < n2) {
                        if (!b) {
                            if (n >= -142378407) {
                                throw new IllegalStateException();
                            }
                            return i;
                        }
                        else {
                            b = false;
                            n2 = ((class381)this.field3619.get(i - 1)).field3623 * -727185157;
                        }
                    }
                }
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bs(" + ')');
        }
    }
    
    void en() {
        this.method2026(0, this.field3619.size(), -93545195);
    }
    
    public void ca(int n) {
        if (null != this.field3612 && n < 2 * this.field3612.ascent) {
            n = Integer.MAX_VALUE;
        }
        if (233637321 * this.field3616 != n) {
            this.field3616 = 417866873 * n;
            this.method2025(-224307219);
        }
    }
    
    public int method2019(final int n) {
        try {
            if (this.field3619.isEmpty() || this.method2021((byte)(-90)) != 1) {
                int n2 = -1;
                int max = 0;
                for (int i = this.field3619.size() - 1; i >= 0; --i) {
                    if (n <= -682966940) {
                        throw new IllegalStateException();
                    }
                    final class381 class381 = this.field3619.get(i);
                    if (n2 != -727185157 * class381.field3625) {
                        if (n <= -682966940) {
                            throw new IllegalStateException();
                        }
                        max = Math.max(eo(this, class381, false, -640469009) + 1620071571 * class381.field3625, max);
                        n2 = class381.field3625 * -727185157;
                    }
                }
                return max;
            }
            if (n <= -682966940) {
                throw new IllegalStateException();
            }
            int n3;
            if (this.field3619.isEmpty()) {
                if (n <= -682966940) {
                    throw new IllegalStateException();
                }
                n3 = 0;
            }
            else {
                n3 = this.field3619.get(this.field3619.size() - 1).field3625 * 1620071571 + this.method2036((byte)79);
            }
            return n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ad(" + ')');
        }
    }
    
    class381 ba() {
        if (this.field3619.size() == 0) {
            return null;
        }
        return this.field3619.get(this.field3619.size() - 1);
    }
    
    public int method2020(final int n) {
        try {
            return this.method2004(-1516640667) ? 0 : (this.field3612.ascent + this.field3619.get(this.field3619.size() - 1).field3623 * -727185157);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ae(" + ')');
        }
    }
    
    public void cr(final int n) {
        if (n != this.field3611 * -29893609) {
            this.field3611 = -1609622617 * n;
            this.method2025(-224307219);
        }
    }
    
    public int ce() {
        return this.field3619.size();
    }
    
    int method2036(final byte b) {
        try {
            int eo;
            if (this.method2004(-1299794546)) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                eo = 0;
            }
            else {
                eo = eo(this, this.field3619.get(this.field3619.size() - 1), false, -1991448760);
            }
            return eo;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bb(" + ')');
        }
    }
    
    public int da() {
        return this.method2020(-2138486573) / this.field3612.ascent;
    }
    
    public class380 ch(final char c, final int n, final int n2) {
        return this.method2012(Character.toString(c), n, n2, (byte)97);
    }
    
    public static int mn(final class379 class379) {
        if (class379 == null) {
            class379.bc();
        }
        return class379.method2004(1310416757) ? 0 : eo(class379, class379.field3619.get(class379.field3619.size() - 1), false, -316285649);
    }
    
    int ex(final class381 class381, final boolean b) {
        if (class381.field3624 == '\n') {
            return 0;
        }
        if (!b && 0 != this.field3621 * 874587033) {
            return this.field3612.advances[-367500756];
        }
        final int n = this.field3612.advances[class381.field3624];
        if (n != 0) {
            return n;
        }
        if ('\t' == class381.field3624) {
            return this.field3612.advances[32] * 3;
        }
        return this.field3612.advances[-1092307082];
    }
    
    static final void Clan_joinChat(final String s, final int n) {
        try {
            if (!s.equals("")) {
                final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2508, Client.packetWriter.isaacCipher, (short)(-15796));
                packetBufferNode.packetBuffer.bf(DynamicObject.stringCp1252NullTerminatedByteSize(s, (byte)(-66)), (byte)56);
                packetBufferNode.packetBuffer.ce(s, -1721175051);
                Client.packetWriter.addNode(packetBufferNode, 414135591);
                return;
            }
            if (n <= -293599480) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.nl(" + ')');
        }
    }
    
    public int db(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            final int n = toIndex;
            toIndex = fromIndex;
            fromIndex = n;
        }
        this.field3619.subList(fromIndex, toIndex).clear();
        int i = fromIndex;
        if (this.method2005((byte)16) && 1 == -29893609 * this.field3611) {
            while (i > 0) {
                --i;
                final char field3624 = this.field3619.get(i).field3624;
                if (' ' == field3624) {
                    break;
                }
                if (field3624 == '\t') {
                    break;
                }
            }
        }
        this.method2026(i, toIndex, -93545195);
        return fromIndex;
    }
    
    class380 dc(final String s, final int n) {
        return this.method2012(s, this.field3619.size(), n, (byte)(-6));
    }
    
    boolean bw() {
        return this.field3614 * -366584362 > 1;
    }
    
    public void cf(final AbstractFont field3612) {
        if (field3612 != this.field3612) {
            this.field3612 = field3612;
            if (null != this.field3612) {
                if (this.field3617 * -1059679999 == 0) {
                    this.field3617 = this.field3612.ascent * 1279946497;
                }
                if (!this.method2004(-267039972)) {
                    this.method2025(-224307219);
                }
            }
        }
    }
    
    public boolean cv(final int n, final int n2) {
        if (n != 252193353 * this.field3615 || n2 != 1114162931 * this.field3620) {
            this.field3615 = 1135601657 * n;
            this.field3620 = -99433925 * n2;
            this.method2025(-224307219);
        }
        return true;
    }
    
    public boolean method2010(final int n, final int n2, final int n3) {
        try {
            if (n == 252193353 * this.field3615) {
                if (n3 <= 572838994) {
                    throw new IllegalStateException();
                }
                if (n2 == 1114162931 * this.field3620) {
                    return true;
                }
                if (n3 <= 572838994) {
                    throw new IllegalStateException();
                }
            }
            this.field3615 = 1135601657 * n;
            this.field3620 = -99433925 * n2;
            this.method2025(-224307219);
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ao(" + ')');
        }
    }
    
    public void method2029(final int n, final int n2) {
        try {
            if (n != 874587033 * this.field3621) {
                this.field3621 = n * 1523286185;
                this.method2025(-224307219);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.at(" + ')');
        }
    }
    
    public int method2017(final int n, int n2, final byte b) {
        try {
            if (null != this.field3612) {
                if (b <= 32) {
                    throw new IllegalStateException();
                }
                if (!this.method2004(-1020853515)) {
                    if (b <= 32) {
                        throw new IllegalStateException();
                    }
                    if (n > this.field3619.size()) {
                        if (b <= 32) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        int n3;
                        if (n2 > 0) {
                            n3 = 1;
                        }
                        else {
                            n3 = -1;
                            n2 = -n2;
                        }
                        int n4 = 0;
                        int n5 = 0;
                        if (n > 0) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            final class381 class381 = this.field3619.get(n - 1);
                            n4 = class381.field3625 * 1620071571 + this.method2027(n - 1, -465870520);
                            n5 = class381.field3625 * -727185157;
                        }
                        else if (n3 == -1) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            if (0 == n) {
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                return 0;
                            }
                        }
                        int n6 = 0;
                        int n7 = n;
                        int n8 = 16777215;
                        int n9;
                        if (n3 != 0) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            n9 = this.field3619.size() + 1;
                        }
                        else {
                            n9 = 0;
                        }
                        for (int i = n9, n10 = n + n3; i != n10; n10 += n3) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            final class381 class382 = this.field3619.get(n10 - 1);
                            if (n5 != -727185157 * class382.field3625) {
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                ++n6;
                                n5 = -727185157 * class382.field3625;
                                if (n6 > n2) {
                                    if (b <= 32) {
                                        throw new IllegalStateException();
                                    }
                                    return n7;
                                }
                            }
                            if (n6 == n2) {
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                final int abs = Math.abs(class382.field3625 * 1620071571 + this.method2027(n10 - 1, -465870520) - n4);
                                if (abs >= n8) {
                                    return n7;
                                }
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                n7 = n10;
                                n8 = abs;
                            }
                        }
                        if (n3 == 1) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            return this.field3619.size();
                        }
                        else {
                            if (n5 != 0) {
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                ++n6;
                            }
                            if (16777215 != n8 && (n6 != n2 || n4 >= n8)) {
                                return n7;
                            }
                            return 0;
                        }
                    }
                }
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.az(" + ')');
        }
    }
    
    class380 method2013(final String s, final int n, final byte b) {
        try {
            return this.method2012(s, this.field3619.size(), n, (byte)(-70));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.av(" + ')');
        }
    }
    
    class380 dw(final String s, final int n) {
        return this.method2012(s, this.field3619.size(), n, (byte)(-57));
    }
    
    public class383 cj(final int n, final int n2) {
        if (n == n2) {
            return new class383(this, 0, 0);
        }
        if (n > this.field3619.size() || n2 > this.field3619.size()) {
            return new class383(this, 0, 0);
        }
        if (n2 < n) {
            return new class383(this, n2, n);
        }
        return new class383(this, n, n2);
    }
    
    public int method2022(final short n) {
        try {
            return this.field3614 * -64830711;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.be(" + ')');
        }
    }
    
    public class380 cp(final String s, final int n, int n2) {
        if (0 == n2) {
            n2 = 1320153966;
        }
        int i = n;
        if (this.field3619.size() >= n2) {
            this.method2026(n, i, -93545195);
            return new class380(i, true);
        }
        this.field3619.ensureCapacity(this.field3619.size() + s.length());
        for (int index = 0; index < s.length() && this.field3619.size() < n2; ++index) {
            final class381 element = new class381();
            element.field3624 = s.charAt(index);
            this.field3619.add(i, element);
            ++i;
        }
        this.method2026(n, i, -93545195);
        if (-64830711 * this.field3614 != 0 && this.method2021((byte)(-40)) > this.field3614 * -201490485) {
            while (i != n) {
                --i;
                yd(this, i, 137212939);
                if (this.method2021((byte)(-22)) <= this.field3614 * 27808219) {
                    return new class380(i, true);
                }
            }
            return new class380(i, true);
        }
        return new class380(i, false);
    }
    
    public static void method2015(final byte b) {
        try {
            ItemComposition.ItemDefinition_cached.clear();
            ItemComposition.ItemDefinition_cachedModels.clear();
            ItemComposition.ItemDefinition_cachedSprites.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.as(" + ')');
        }
    }
    
    public int method2015(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            final int n = toIndex;
            toIndex = fromIndex;
            fromIndex = n;
        }
        this.field3619.subList(fromIndex, toIndex).clear();
        int i = fromIndex;
        if (this.method2005((byte)16) && 1 == -29893609 * this.field3611) {
            while (i > 0) {
                --i;
                final char field3624 = this.field3619.get(i).field3624;
                if (' ' == field3624) {
                    break;
                }
                if (field3624 == '\t') {
                    break;
                }
            }
        }
        this.method2026(i, toIndex, -93545195);
        return fromIndex;
    }
    
    int eh(final class381 class381, final boolean b) {
        if (class381.field3624 == '\n') {
            return 0;
        }
        if (!b && 0 != this.field3621 * 874587033) {
            return this.field3612.advances[42];
        }
        final int n = this.field3612.advances[class381.field3624];
        if (n != 0) {
            return n;
        }
        if ('\t' == class381.field3624) {
            return this.field3612.advances[32] * 3;
        }
        return this.field3612.advances[32];
    }
    
    int fh(final int index, boolean b) {
        if (index < this.field3619.size()) {
            int n = this.field3619.get(index).field3623 * -727185157;
            for (int i = index; i > 0; --i) {
                if (((class381)this.field3619.get(i - 1)).field3623 * -727185157 < n) {
                    if (!b) {
                        return i;
                    }
                    b = false;
                    n = ((class381)this.field3619.get(i - 1)).field3623 * -727185157;
                }
            }
        }
        return 0;
    }
    
    int ev(final int index) {
        return (index < this.field3619.size()) ? eo(this, this.field3619.get(index), false, -875397476) : 0;
    }
    
    public int es() {
        return 874587033 * this.field3621;
    }
    
    public static String mk(final class379 class379, final int n) {
        if (class379 == null) {
            return class379.method2007(n);
        }
        try {
            if (!class379.method2004(-813391360)) {
                final StringBuilder sb = new StringBuilder(class379.method2006(1367232975));
                for (int i = 0; i < class379.method2006(1772671571); ++i) {
                    if (n != -1389348498) {
                        throw new IllegalStateException();
                    }
                    sb.append(ml(class379, i, 2094672267).field3624);
                }
                return sb.toString();
            }
            if (n != -1389348498) {
                throw new IllegalStateException();
            }
            return "";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ab(" + ')');
        }
    }
    
    public static class383 ln(final class379 class379, final int n, final int n2) {
        if (class379 == null) {
            class379.eg(n, n);
        }
        if (n == n2) {
            return new class383(class379, 0, 0);
        }
        if (n > class379.field3619.size() || n2 > class379.field3619.size()) {
            return new class383(class379, 0, 0);
        }
        if (n2 < n) {
            return new class383(class379, n2, n);
        }
        return new class383(class379, n, n2);
    }
    
    int eq() {
        return this.method2004(277409497) ? 0 : eo(this, this.field3619.get(this.field3619.size() - 1), false, -1481451001);
    }
    
    class461 ee(final int n, final int n2) {
        final int min = Math.min(n, n2);
        final int max = Math.max(n, n2);
        final int size = this.field3619.size();
        if (min == 0 && max == size) {
            return new class461(0, size);
        }
        final int method2030 = this.method2030(min, false, -1525868533);
        final int method2031 = this.method2031(max, false, -590168303);
        switch (this.field3620 * 1114162931) {
            case 0: {
                if (252193353 * this.field3615 == 0) {
                    return new class461(method2030, size);
                }
                return new class461(this.method2030(min, true, -1311996478), size);
            }
            case 2: {
                if (252193353 * this.field3615 == 2) {
                    return new class461(0, method2031);
                }
                return new class461(0, this.method2031(max, true, -569576421));
            }
            case 1: {
                return new class461(0, size);
            }
            default: {
                return new class461(0, size);
            }
        }
    }
    
    public int method2018(final int n, int n2, final byte b) {
        try {
            if (null != this.field3612) {
                if (b <= 32) {
                    throw new IllegalStateException();
                }
                if (!this.method2004(-1020853515)) {
                    if (b <= 32) {
                        throw new IllegalStateException();
                    }
                    if (n > this.field3619.size()) {
                        if (b <= 32) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        int n3;
                        if (n2 > 0) {
                            n3 = 1;
                        }
                        else {
                            n3 = -1;
                            n2 = -n2;
                        }
                        int n4 = 0;
                        int n5 = 0;
                        if (n > 0) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            final class381 class381 = this.field3619.get(n - 1);
                            n4 = class381.field3625 * 1620071571 + this.method2027(n - 1, -465870520);
                            n5 = class381.field3623 * -727185157;
                        }
                        else if (n3 == -1) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            if (0 == n) {
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                return 0;
                            }
                        }
                        int n6 = 0;
                        int n7 = n;
                        int n8 = 16777215;
                        int n9;
                        if (n3 != 0) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            n9 = this.field3619.size() + 1;
                        }
                        else {
                            n9 = 0;
                        }
                        for (int i = n9, n10 = n + n3; i != n10; n10 += n3) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            final class381 class382 = this.field3619.get(n10 - 1);
                            if (n5 != -727185157 * class382.field3623) {
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                ++n6;
                                n5 = -727185157 * class382.field3623;
                                if (n6 > n2) {
                                    if (b <= 32) {
                                        throw new IllegalStateException();
                                    }
                                    return n7;
                                }
                            }
                            if (n6 == n2) {
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                final int abs = Math.abs(class382.field3625 * 1620071571 + this.method2027(n10 - 1, -465870520) - n4);
                                if (abs >= n8) {
                                    return n7;
                                }
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                n7 = n10;
                                n8 = abs;
                            }
                        }
                        if (n3 == 1) {
                            if (b <= 32) {
                                throw new IllegalStateException();
                            }
                            return this.field3619.size();
                        }
                        else {
                            if (n5 != 0) {
                                if (b <= 32) {
                                    throw new IllegalStateException();
                                }
                                ++n6;
                            }
                            if (16777215 != n8 && (n6 != n2 || n4 >= n8)) {
                                return n7;
                            }
                            return 0;
                        }
                    }
                }
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.az(" + ')');
        }
    }
    
    public void method2011(final int n, final byte b) {
        try {
            if (this.field3617 * -1059679999 != n) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                this.field3617 = n * 1279946497;
                this.method2025(-224307219);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ax(" + ')');
        }
    }
    
    public void method2009(final int n, final byte b) {
        try {
            if (n != this.field3611 * -29893609) {
                if (b == 1) {
                    throw new IllegalStateException();
                }
                this.field3611 = -1609622617 * n;
                this.method2025(-224307219);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ay(" + ')');
        }
    }
    
    public int dt(final int n) {
        return this.method2016(n, n + 1, 819758812);
    }
    
    public static int ps(final class379 class379) {
        if (class379 == null) {
            return class379.ds();
        }
        return class379.method2004(-1739069527) ? 0 : eo(class379, class379.field3619.get(class379.field3619.size() - 1), false, -1030364568);
    }
    
    public static int op(final class379 class379, final int n, final byte b) {
        if (class379 == null) {
            return class379.method2039(n, b);
        }
        try {
            switch (class379.field3615 * 252193353) {
                case 1: {
                    return n / 2;
                }
                case 2: {
                    return n;
                }
                case 0: {
                    return 0;
                }
                default: {
                    return 0;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bo(" + ')');
        }
    }
    
    public int method2038(final int n) {
        try {
            return this.field3616 * 233637321;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bi(" + ')');
        }
    }
    
    void dl() {
        this.field3619.clear();
    }
    
    public void ck(final int n) {
        if (n != this.field3614 * 208776021) {
            this.field3614 = n * -1302119211;
            this.method2025(-224307219);
        }
    }
    
    public int method2039(final int n, final byte b) {
        try {
            switch (this.field3617 * 252193353) {
                case 1: {
                    return n / 2;
                }
                case 2: {
                    return n;
                }
                case 0: {
                    return 0;
                }
                default: {
                    return 0;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bo(" + ')');
        }
    }
    
    void di() {
        this.field3619.clear();
    }
    
    int fs(final int index, boolean b) {
        if (index < this.field3619.size()) {
            int n = this.field3619.get(index).field3623 * -727185157;
            for (int i = index; i < this.field3619.size() - 1; ++i) {
                if (((class381)this.field3619.get(i + 1)).field3623 * -727185157 > n) {
                    if (!b) {
                        return i;
                    }
                    b = false;
                    n = ((class381)this.field3619.get(1 + i)).field3623 * -727185157;
                }
            }
        }
        return this.field3619.size();
    }
    
    public static int ud(final class379 class379, final int index, boolean b) {
        if (index < class379.field3619.size()) {
            int n = class379.field3619.get(index).field3623 * -727185157;
            for (int i = index; i < class379.field3619.size() - 1; ++i) {
                if (((class381)class379.field3619.get(i + 1)).field3623 * -727185157 > n) {
                    if (!b) {
                        return i;
                    }
                    b = false;
                    n = ((class381)class379.field3619.get(1 + i)).field3623 * -727185157;
                }
            }
        }
        return class379.field3619.size();
    }
    
    public boolean bp() {
        return this.field3619.size() == 0;
    }
    
    public class380 ct(final String s, final int n, int n2) {
        if (0 == n2) {
            n2 = Integer.MAX_VALUE;
        }
        int i = n;
        if (this.field3619.size() >= n2) {
            this.method2026(n, i, -93545195);
            return new class380(i, true);
        }
        this.field3619.ensureCapacity(this.field3619.size() + s.length());
        for (int index = 0; index < s.length() && this.field3619.size() < n2; ++index) {
            final class381 element = new class381();
            element.field3624 = s.charAt(index);
            this.field3619.add(i, element);
            ++i;
        }
        this.method2026(n, i, -93545195);
        if (-64830711 * this.field3614 != 0 && this.method2021((byte)(-45)) > this.field3614 * -64830711) {
            while (i != n) {
                --i;
                yd(this, i, -2077974415);
                if (this.method2021((byte)(-103)) <= this.field3614 * -64830711) {
                    return new class380(i, true);
                }
            }
            return new class380(i, true);
        }
        return new class380(i, false);
    }
    
    public String cc() {
        if (this.method2004(1509840134)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(this.method2006(1423096471));
        for (int i = 0; i < this.method2006(2122858312); ++i) {
            sb.append(ml(this, i, 276829670).field3624);
        }
        return sb.toString();
    }
    
    public int dv(final int n) {
        return this.method2016(n, n + 1, -924593737);
    }
    
    public static int dv(final class379 class379) {
        if (!class379.field3619.isEmpty() && class379.method2021((byte)16) == 1) {
            return class379.field3619.isEmpty() ? 0 : (class379.field3619.get(class379.field3619.size() - 1).field3625 * 1620071571 + class379.method2036((byte)126));
        }
        int n = -1;
        int max = 0;
        for (int i = class379.field3619.size() - 1; i >= 0; --i) {
            final class381 class380 = class379.field3619.get(i);
            if (n != -727185157 * class380.field3623) {
                max = Math.max(eo(class379, class380, false, -1683123924) + 1334855298 * class380.field3625, max);
                n = class380.field3623 * -170557187;
            }
        }
        return max;
    }
    
    public static class381 ml(final class379 class379, final int index, final int n) {
        if (class379 == null) {
            class379.method2002(index, index);
        }
        try {
            return class379.field3619.get(index);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.af(" + ')');
        }
    }
    
    int method2027(final int index, final int n) {
        try {
            int eo;
            if (index < this.field3619.size()) {
                if (n != -465870520) {
                    throw new IllegalStateException();
                }
                eo = eo(this, this.field3619.get(index), false, 208589170);
            }
            else {
                eo = 0;
            }
            return eo;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bt(" + ')');
        }
    }
    
    public int ds() {
        return this.method2020(-1758283442) / this.field3612.ascent;
    }
    
    public int dh(final int n, int n2) {
        if (null == this.field3612 || this.method2004(-1450720512) || n > this.field3619.size()) {
            return 0;
        }
        int n3;
        if (n2 > 0) {
            n3 = 1;
        }
        else {
            n3 = -1;
            n2 = -n2;
        }
        int n4 = 0;
        int n5 = 0;
        if (n > 0) {
            final class381 class381 = this.field3619.get(n - 1);
            n4 = class381.field3625 * -1566299994 + this.method2027(n - 1, -465870520);
            n5 = class381.field3623 * -727185157;
        }
        else if (n3 == -1 && 0 == n) {
            return 0;
        }
        int n6 = 0;
        int n7 = n;
        int n8 = 16777215;
        for (int i = (n3 != 0) ? (this.field3619.size() + 1) : 0, n9 = n + n3; i != n9; n9 += n3) {
            final class381 class382 = this.field3619.get(n9 - 1);
            if (n5 != -727185157 * class382.field3623) {
                ++n6;
                n5 = -727185157 * class382.field3623;
                if (n6 > n2) {
                    return n7;
                }
            }
            if (n6 == n2) {
                final int abs = Math.abs(class382.field3625 * 1524539477 + this.method2027(n9 - 1, -465870520) - n4);
                if (abs >= n8) {
                    return n7;
                }
                n7 = n9;
                n8 = abs;
            }
        }
        if (n3 == 1) {
            return this.field3619.size();
        }
        if (n5 != 0) {
            ++n6;
        }
        if (16777215 != n8 && (n6 != n2 || n4 >= n8)) {
            return n7;
        }
        return 0;
    }
    
    public static int yh(final class379 class379, final int n) {
        if (class379 == null) {
            return class379.method2024(n);
        }
        try {
            return 874587033 * class379.field3621;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bx(" + ')');
        }
    }
    
    boolean bc() {
        return this.field3614 * -34680010 > 1;
    }
    
    int method2031(final int index, boolean b, final int n) {
        try {
            if (index < this.field3619.size()) {
                int n2 = this.field3619.get(index).field3623 * -727185157;
                for (int i = index; i < this.field3619.size() - 1; ++i) {
                    if (n == -1554297660) {
                        throw new IllegalStateException();
                    }
                    if (((class381)this.field3619.get(i + 1)).field3623 * -727185157 > n2) {
                        if (n == -1554297660) {
                            throw new IllegalStateException();
                        }
                        if (!b) {
                            if (n == -1554297660) {
                                throw new IllegalStateException();
                            }
                            return i;
                        }
                        else {
                            b = false;
                            n2 = ((class381)this.field3619.get(1 + i)).field3623 * -727185157;
                        }
                    }
                }
            }
            return this.field3619.size();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.br(" + ')');
        }
    }
    
    class461 ei(final int n, final int n2) {
        final int min = Math.min(n, n2);
        final int max = Math.max(n, n2);
        final int size = this.field3619.size();
        if (min == 0 && max == size) {
            return new class461(0, size);
        }
        final int method2030 = this.method2030(min, false, -737438674);
        final int method2031 = this.method2031(max, false, -1961641976);
        switch (this.field3620 * 581288459) {
            case 1: {
                return new class461(0, size);
            }
            default: {
                return new class461(0, size);
            }
            case 2: {
                if (252193353 * this.field3615 == 2) {
                    return new class461(0, method2031);
                }
                return new class461(0, this.method2031(max, true, -1168241450));
            }
            case 0: {
                if (252193353 * this.field3615 == 0) {
                    return new class461(method2030, size);
                }
                return new class461(this.method2030(min, true, -776404686), size);
            }
        }
    }
    
    public String ci() {
        if (this.method2004(1075008623)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(this.method2006(1451594799));
        for (int i = 0; i < this.method2006(1559813152); ++i) {
            sb.append(ml(this, i, 920333670).field3624);
        }
        return sb.toString();
    }
    
    public boolean method2004(final int n) {
        try {
            boolean b;
            if (this.field3619.size() == 0) {
                if (n == 755827339) {
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
            throw HealthBar.get(ex, "oq.aw(" + ')');
        }
    }
    
    void method2008(final byte b) {
        try {
            this.field3619.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.am(" + ')');
        }
    }
    
    int em(final int index) {
        return (index < this.field3619.size()) ? eo(this, this.field3619.get(index), false, -1451839945) : 0;
    }
    
    public void method2003(final int n, final byte b) {
        try {
            if (n != this.field3614 * -64830711) {
                this.field3614 = n * -181159111;
                this.method2025(-224307219);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.al(" + ')');
        }
    }
    
    public int df(final int n, final int n2) {
        if (null == this.field3612) {
            return 0;
        }
        if (this.method2005((byte)16) && n > 233637321 * this.field3616) {
            return this.field3619.size();
        }
        if (!this.field3619.isEmpty()) {
            for (int i = 0; i < this.field3619.size(); ++i) {
                final class381 class381 = this.field3619.get(i);
                if (n2 <= class381.field3623 * -727185157 + he(this, -297150195)) {
                    if (n2 < -1306333957 * class381.field3623) {
                        break;
                    }
                    if (n < 1620071571 * class381.field3625) {
                        return (i > 0) ? (i - 1) : 0;
                    }
                    if (i + 1 != this.field3619.size() && this.field3619.get(i + 1).field3623 * -727185157 != -727185157 * class381.field3623) {
                        if (n < -1109471664 * class381.field3625 + eo(this, this.field3619.get(i), false, -1491936074)) {
                            return i;
                        }
                        if (n2 <= 102291174 * class381.field3623 + he(this, -297150195)) {
                            return i + 1;
                        }
                    }
                }
            }
            final class381 class382 = this.field3619.get(this.field3619.size() - 1);
            if (n >= class382.field3625 * 1620071571 && n <= class382.field3625 * 1508953863 + this.method2036((byte)16) && n2 >= -352381548 * class382.field3623 && n2 <= 1540417254 * class382.field3623 + he(this, -297150195)) {
                return this.field3619.size() - 1;
            }
        }
        return this.field3619.size();
    }
    
    public void cu(int n) {
        if (null != this.field3612 && n < 2 * this.field3612.ascent) {
            n = Integer.MAX_VALUE;
        }
        if (233637321 * this.field3616 != n) {
            this.field3616 = 417866873 * n;
            this.method2025(-224307219);
        }
    }
    
    public static int method2023(final class379 class379, final int n) {
        if (class379 == null) {
            class379.method2019(n);
        }
        try {
            if (class379.field3619.isEmpty() || class379.method2021((byte)(-90)) != 1) {
                int n2 = -1;
                int max = 0;
                for (int i = class379.field3619.size() - 1; i >= 0; --i) {
                    if (n <= -682966940) {
                        throw new IllegalStateException();
                    }
                    final class381 class380 = class379.field3619.get(i);
                    if (n2 != -727185157 * class380.field3623) {
                        if (n <= -682966940) {
                            throw new IllegalStateException();
                        }
                        max = Math.max(eo(class379, class380, false, -640469009) + 1620071571 * class380.field3625, max);
                        n2 = class380.field3623 * -727185157;
                    }
                }
                return max;
            }
            if (n <= -682966940) {
                throw new IllegalStateException();
            }
            int n3;
            if (class379.field3619.isEmpty()) {
                if (n <= -682966940) {
                    throw new IllegalStateException();
                }
                n3 = 0;
            }
            else {
                n3 = class379.field3619.get(class379.field3619.size() - 1).field3625 * 1620071571 + class379.method2036((byte)79);
            }
            return n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ad(" + ')');
        }
    }
    
    class381 method2023(final int n) {
        try {
            if (this.field3619.size() != 0) {
                return this.field3619.get(this.field3619.size() - 1);
            }
            if (n != -1433710051) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.an(" + ')');
        }
    }
    
    boolean method2005(final byte b) {
        try {
            return this.field3614 * -64830711 > 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ac(" + ')');
        }
    }
    
    class381 bq() {
        if (this.field3619.size() == 0) {
            return null;
        }
        return this.field3619.get(this.field3619.size() - 1);
    }
    
    public int dk(final int n) {
        return this.method2016(n, n + 1, 1823087470);
    }
    
    public class380 do(final String s) {
        gx(this, (byte)(-17));
        return this.method2013(s, 0, (byte)(-10));
    }
    
    public static void wd(final class379 class379, final int n) {
        if (n != class379.field3611 * -2145931746) {
            class379.field3611 = -517642729 * n;
            class379.method2025(-224307219);
        }
    }
    
    public static int he(final class379 class379, final int n) {
        if (class379 == null) {
            return class379.method2041(n);
        }
        try {
            return class379.field3617 * -1059679999;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ap(" + ')');
        }
    }
    
    public int de(final int n, final int n2) {
        if (null == this.field3612) {
            return 0;
        }
        if (this.method2005((byte)16) && n > 233637321 * this.field3616) {
            return this.field3619.size();
        }
        if (!this.field3619.isEmpty()) {
            for (int i = 0; i < this.field3619.size(); ++i) {
                final class381 class381 = this.field3619.get(i);
                if (n2 <= class381.field3623 * -727185157 + he(this, -297150195)) {
                    if (n2 < -727185157 * class381.field3623) {
                        break;
                    }
                    if (n < 1620071571 * class381.field3625) {
                        return (i > 0) ? (i - 1) : 0;
                    }
                    if (i + 1 != this.field3619.size() && this.field3619.get(i + 1).field3623 * -727185157 != -727185157 * class381.field3623) {
                        if (n < 1620071571 * class381.field3625 + eo(this, this.field3619.get(i), false, -160161433)) {
                            return i;
                        }
                        if (n2 <= -727185157 * class381.field3623 + he(this, -297150195)) {
                            return i + 1;
                        }
                    }
                }
            }
            final class381 class382 = this.field3619.get(this.field3619.size() - 1);
            if (n >= class382.field3625 * 1620071571 && n <= class382.field3625 * 1620071571 + this.method2036((byte)78) && n2 >= -727185157 * class382.field3623 && n2 <= -727185157 * class382.field3623 + he(this, -297150195)) {
                return this.field3619.size() - 1;
            }
        }
        return this.field3619.size();
    }
    
    public static class461 so(final class379 class379, final int n, final int n2) {
        if (class379 == null) {
            class379.dv(n);
        }
        final int min = Math.min(n, n2);
        final int max = Math.max(n, n2);
        final int size = class379.field3619.size();
        if (min == 0 && max == size) {
            return new class461(0, size);
        }
        final int method2030 = class379.method2030(min, false, -1906967639);
        final int method2031 = class379.method2031(max, false, -938408504);
        switch (class379.field3620 * -308958704) {
            default: {
                return new class461(0, size);
            }
            case 2: {
                if (-1677434563 * class379.field3615 == 2) {
                    return new class461(0, method2031);
                }
                return new class461(0, class379.method2031(max, true, -1666409273));
            }
            case 1: {
                return new class461(0, size);
            }
            case 0: {
                if (379804323 * class379.field3615 == 0) {
                    return new class461(method2030, size);
                }
                return new class461(class379.method2030(min, true, -1064248461), size);
            }
        }
    }
    
    public static class381 ge(final class379 class379, final int n) {
        if (class379 == null) {
            return class379.method2023(n);
        }
        try {
            if (class379.field3619.size() != 0) {
                return class379.field3619.get(class379.field3619.size() - 1);
            }
            if (n != -1433710051) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.an(" + ')');
        }
    }
    
    public int ea() {
        return this.field3611 * -29893609;
    }
    
    public int method2006(final int n) {
        try {
            return this.field3619.size();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.au(" + ')');
        }
    }
    
    public void method2037(final AbstractFont field3612, final int n) {
        try {
            if (field3612 != this.field3612) {
                if (n >= -343958170) {
                    return;
                }
                this.field3612 = field3612;
                if (null != this.field3612) {
                    if (n >= -343958170) {
                        throw new IllegalStateException();
                    }
                    if (this.field3617 * -1059679999 == 0) {
                        this.field3617 = this.field3612.ascent * 1279946497;
                    }
                    if (!this.method2004(1810527999)) {
                        if (n >= -343958170) {
                            throw new IllegalStateException();
                        }
                        this.method2025(-224307219);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.aa(" + ')');
        }
    }
    
    public class383 method2035(final int n, final int n2, final byte b) {
        try {
            if (n != n2) {
                if (n <= this.field3619.size()) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    if (n2 > this.field3619.size()) {
                        if (b <= 1) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        if (n2 < n) {
                            return new class383(this, n2, n);
                        }
                        return new class383(this, n, n2);
                    }
                }
                return new class383(this, 0, 0);
            }
            if (b <= 1) {
                throw new IllegalStateException();
            }
            return new class383(this, 0, 0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ai(" + ')');
        }
    }
    
    public int dx() {
        if (!this.field3619.isEmpty() && this.method2021((byte)(-14)) == 1) {
            return this.field3619.isEmpty() ? 0 : (this.field3619.get(this.field3619.size() - 1).field3625 * -621804146 + this.method2036((byte)113));
        }
        int n = -1;
        int max = 0;
        for (int i = this.field3619.size() - 1; i >= 0; --i) {
            final class381 class381 = this.field3619.get(i);
            if (n != -92247249 * class381.field3623) {
                max = Math.max(eo(this, class381, false, -688222490) + -876790606 * class381.field3625, max);
                n = class381.field3623 * 250297571;
            }
        }
        return max;
    }
    
    public int dy() {
        if (!this.field3619.isEmpty() && this.method2021((byte)96) == 1) {
            return this.field3619.isEmpty() ? 0 : (this.field3619.get(this.field3619.size() - 1).field3625 * -1798693242 + this.method2036((byte)58));
        }
        int n = -1;
        int max = 0;
        for (int i = this.field3619.size() - 1; i >= 0; --i) {
            final class381 class381 = this.field3619.get(i);
            if (n != -727185157 * class381.field3623) {
                max = Math.max(eo(this, class381, false, 62438083) + 1620071571 * class381.field3625, max);
                n = class381.field3623 * 259825493;
            }
        }
        return max;
    }
    
    public static void gg(final class379 class379, int n) {
        if (null != class379.field3612 && n < 2 * class379.field3612.ascent) {
            n = 2118272013;
        }
        if (233637321 * class379.field3616 != n) {
            class379.field3616 = 2085711179 * n;
            class379.method2025(-224307219);
        }
    }
    
    boolean bh() {
        return this.field3614 * -1145283492 > 1;
    }
    
    public int method2021(final byte b) {
        try {
            return this.method2020(-1779681141) / this.field3612.ascent;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.by(" + ')');
        }
    }
    
    public int method2024(final int n) {
        try {
            return 874587033 * this.field3614;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bx(" + ')');
        }
    }
    
    public class380 method2014(final String s, final int n) {
        try {
            gx(this, (byte)(-108));
            return this.method2013(s, 0, (byte)24);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ar(" + ')');
        }
    }
    
    public int method2041(final int n) {
        try {
            return this.field3614 * -1059679999;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ap(" + ')');
        }
    }
    
    void method2026(final int n, final int n2, final int n3) {
        try {
            if (!this.method2004(-838103370)) {
                if (n3 != -93545195) {
                    throw new IllegalStateException();
                }
                if (this.field3612 != null) {
                    final class461 ly = ly(this, n, n2, 2105841802);
                    boolean b = false;
                    Label_0078: {
                        if ((int)ly.field3972 == 0) {
                            if (n3 != -93545195) {
                                throw new IllegalStateException();
                            }
                            if ((int)ly.field3973 == this.field3619.size()) {
                                b = true;
                                break Label_0078;
                            }
                        }
                        b = false;
                    }
                    final boolean b2 = b;
                    int intValue = (int)ly.field3972;
                    int n4 = 0;
                    int n5;
                    if (b2) {
                        if (n3 != -93545195) {
                            throw new IllegalStateException();
                        }
                        n5 = 0;
                    }
                    else {
                        n5 = this.field3619.get((int)ly.field3972).field3623 * -727185157;
                    }
                    int n6 = n5;
                    int n7 = 0;
                    for (int i = (int)ly.field3972; i <= (int)ly.field3973; ++i) {
                        boolean b3;
                        if (i >= this.field3619.size()) {
                            if (n3 != -93545195) {
                                throw new IllegalStateException();
                            }
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        final boolean b4 = b3;
                        final ArrayList field3619 = this.field3619;
                        int index;
                        if (!b4) {
                            if (n3 != -93545195) {
                                throw new IllegalStateException();
                            }
                            index = i;
                        }
                        else {
                            index = this.field3619.size() - 1;
                        }
                        final class381 class381 = field3619.get(index);
                        int eo;
                        if (!b4) {
                            if (n3 != -93545195) {
                                throw new IllegalStateException();
                            }
                            eo = eo(this, class381, false, -1267721849);
                        }
                        else {
                            eo = 0;
                        }
                        final int n8 = eo;
                        boolean b5 = false;
                        Label_0407: {
                            if (!b4) {
                                if (n3 != -93545195) {
                                    throw new IllegalStateException();
                                }
                                if (class381.field3624 == '\n') {
                                    if (n3 != -93545195) {
                                        throw new IllegalStateException();
                                    }
                                    b5 = true;
                                    break Label_0407;
                                }
                            }
                            b5 = false;
                        }
                        final boolean b6 = b5;
                        int n9 = 0;
                        Label_0484: {
                            if (!b4) {
                                if (n3 != -93545195) {
                                    throw new IllegalStateException();
                                }
                                if (this.method2005((byte)16)) {
                                    if (n3 != -93545195) {
                                        return;
                                    }
                                    if (n4 + n8 > 233637321 * this.field3616) {
                                        if (n3 != -93545195) {
                                            return;
                                        }
                                        n9 = 1;
                                        break Label_0484;
                                    }
                                }
                            }
                            n9 = 0;
                        }
                        final int n10 = n9;
                        Label_0896: {
                            if (!b6) {
                                if (n3 != -93545195) {
                                    return;
                                }
                                if (n10 == 0) {
                                    if (n3 != -93545195) {
                                        throw new IllegalStateException();
                                    }
                                    if (!b4) {
                                        break Label_0896;
                                    }
                                    if (n3 != -93545195) {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                            int n11 = i;
                            int n12 = 0;
                            if (n10 != 0) {
                                if (n3 != -93545195) {
                                    throw new IllegalStateException();
                                }
                                int n13 = 0;
                                if (1 == this.field3611 * -29893609) {
                                    int j = n11;
                                    while (j > intValue) {
                                        if (n3 != -93545195) {
                                            throw new IllegalStateException();
                                        }
                                        final class381 class382 = this.field3619.get(j);
                                        final int n14 = n13;
                                        int eo2;
                                        if (j < n11) {
                                            if (n3 != -93545195) {
                                                throw new IllegalStateException();
                                            }
                                            eo2 = eo(this, class382, false, -1926330364);
                                        }
                                        else {
                                            eo2 = 0;
                                        }
                                        n13 = n14 + eo2;
                                        if (class382.field3624 != ' ') {
                                            if (n3 != -93545195) {
                                                throw new IllegalStateException();
                                            }
                                            if ('\n' != class382.field3624) {
                                                --j;
                                                continue;
                                            }
                                            if (n3 != -93545195) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        n11 = j;
                                        n4 -= n13;
                                        n12 = n13;
                                        break;
                                    }
                                }
                            }
                            int n15 = -op(this, n4, (byte)80);
                            for (int k = intValue; k < n11; ++k) {
                                if (n3 != -93545195) {
                                    throw new IllegalStateException();
                                }
                                final class381 class383 = this.field3619.get(k);
                                final int eo3 = eo(this, class383, false, -972332407);
                                class383.field3625 = n15 * -961418853;
                                class383.field3623 = n6 * -2052537805;
                                n15 += eo3;
                            }
                            intValue = n11;
                            n4 = n12;
                            n6 += he(this, -297150195);
                            ++n7;
                        }
                        final int n16 = n4;
                        int n17;
                        if (!b4) {
                            if (n3 != -93545195) {
                                throw new IllegalStateException();
                            }
                            n17 = n8;
                        }
                        else {
                            n17 = 0;
                        }
                        n4 = n16 + n17;
                    }
                    if (1114162931 * this.field3620 != 0) {
                        if (n3 != -93545195) {
                            throw new IllegalStateException();
                        }
                        if (b2) {
                            if (n3 != -93545195) {
                                throw new IllegalStateException();
                            }
                            final int dg = this.dg(n7 * he(this, -297150195), 1181323624);
                            for (int l = 0; l < this.field3619.size(); ++l) {
                                if (n3 != -93545195) {
                                    throw new IllegalStateException();
                                }
                                final class381 class384 = this.field3619.get(l);
                                class384.field3623 -= dg * -2052537805;
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bd(" + ')');
        }
    }
    
    public void cm(final AbstractFont field3612) {
        if (field3612 != this.field3612) {
            this.field3612 = field3612;
            if (null != this.field3612) {
                if (this.field3617 * -1059679999 == 0) {
                    this.field3617 = this.field3612.ascent * 1279946497;
                }
                if (!this.method2004(2084550318)) {
                    this.method2025(-224307219);
                }
            }
        }
    }
    
    public static int rh(final class379 class379) {
        return class379.field3614 * -64830711;
    }
    
    public void co(final int n) {
        if (this.field3617 * 1031647515 != n) {
            this.field3617 = n * 1279946497;
            this.method2025(-224307219);
        }
    }
    
    public static int qi(final class379 class379, final int n, int n2) {
        if (null == class379.field3612 || class379.method2004(-1195214983) || n > class379.field3619.size()) {
            return 0;
        }
        int n3;
        if (n2 > 0) {
            n3 = 1;
        }
        else {
            n3 = -1;
            n2 = -n2;
        }
        int n4 = 0;
        int n5 = 0;
        if (n > 0) {
            final class381 class380 = class379.field3619.get(n - 1);
            n4 = class380.field3625 * 1620071571 + class379.method2027(n - 1, -465870520);
            n5 = class380.field3623 * -727185157;
        }
        else if (n3 == -1 && 0 == n) {
            return 0;
        }
        int n6 = 0;
        int n7 = n;
        int n8 = 16777215;
        for (int i = (n3 != 0) ? (class379.field3619.size() + 1) : 0, n9 = n + n3; i != n9; n9 += n3) {
            final class381 class381 = class379.field3619.get(n9 - 1);
            if (n5 != -727185157 * class381.field3623) {
                ++n6;
                n5 = -727185157 * class381.field3623;
                if (n6 > n2) {
                    return n7;
                }
            }
            if (n6 == n2) {
                final int abs = Math.abs(class381.field3625 * 1620071571 + class379.method2027(n9 - 1, -465870520) - n4);
                if (abs >= n8) {
                    return n7;
                }
                n7 = n9;
                n8 = abs;
            }
        }
        if (n3 == 1) {
            return class379.field3619.size();
        }
        if (n5 != 0) {
            ++n6;
        }
        if (16777215 != n8 && (n6 != n2 || n4 >= n8)) {
            return n7;
        }
        return 0;
    }
    
    void er() {
        this.method2026(0, this.field3619.size(), -93545195);
    }
    
    public static class461 ly(final class379 class379, final int n, final int n2, final int n3) {
        if (class379 == null) {
            return class379.method2001(n, n, n);
        }
        try {
            final int min = Math.min(n, n2);
            final int max = Math.max(n, n2);
            final int size = class379.field3619.size();
            if (min == 0) {
                if (n3 <= -504605111) {
                    throw new IllegalStateException();
                }
                if (max == size) {
                    if (n3 <= -504605111) {
                        throw new IllegalStateException();
                    }
                    return new class461(0, size);
                }
            }
            final int method2030 = class379.method2030(min, false, -423936082);
            final int method2031 = class379.method2031(max, false, -985100260);
            switch (class379.field3620 * 1114162931) {
                case 0: {
                    if (252193353 * class379.field3615 != 0) {
                        return new class461(class379.method2030(min, true, -1363605607), size);
                    }
                    if (n3 <= -504605111) {
                        throw new IllegalStateException();
                    }
                    return new class461(method2030, size);
                }
                case 2: {
                    if (252193353 * class379.field3615 != 2) {
                        return new class461(0, class379.method2031(max, true, -1894731936));
                    }
                    if (n3 <= -504605111) {
                        throw new IllegalStateException();
                    }
                    return new class461(0, method2031);
                }
                case 1: {
                    return new class461(0, size);
                }
                default: {
                    return new class461(0, size);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bn(" + ')');
        }
    }
    
    public static void gx(final class379 class379, final byte b) {
        if (class379 == null) {
            class379.method2008(b);
        }
        try {
            class379.field3619.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.am(" + ')');
        }
    }
    
    public int eu() {
        return 874587033 * this.field3621;
    }
    
    public class381 method2002(final int index, final int n) {
        try {
            return this.field3619.get(index);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.af(" + ')');
        }
    }
    
    class461 method2001(final int n, final int n2, final int n3) {
        try {
            final int min = Math.min(n, n2);
            final int max = Math.max(n, n2);
            final int size = this.field3619.size();
            if (min == 0) {
                if (n3 <= -504605111) {
                    throw new IllegalStateException();
                }
                if (max == size) {
                    if (n3 <= -504605111) {
                        throw new IllegalStateException();
                    }
                    return new class461(0, size);
                }
            }
            final int method2030 = this.method2030(min, false, -423936082);
            final int method2031 = this.method2031(max, false, -985100260);
            switch (this.field3614 * 1114162931) {
                case 0: {
                    if (252193353 * this.field3611 != 0) {
                        return new class461(this.method2031(min, true, -1363605607), size);
                    }
                    if (n3 <= -504605111) {
                        throw new IllegalStateException();
                    }
                    return new class461(method2030, size);
                }
                case 2: {
                    if (252193353 * this.field3615 != 2) {
                        return new class461(0, this.method2031(max, true, -1894731936));
                    }
                    if (n3 <= -504605111) {
                        throw new IllegalStateException();
                    }
                    return new class461(0, method2031);
                }
                case 1: {
                    return new class461(0, size);
                }
                default: {
                    return new class461(0, size);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bn(" + ')');
        }
    }
    
    public class383 cz(final int n, final int n2) {
        if (n == n2) {
            return new class383(this, 0, 0);
        }
        if (n > this.field3619.size() || n2 > this.field3619.size()) {
            return new class383(this, 0, 0);
        }
        if (n2 < n) {
            return new class383(this, n2, n);
        }
        return new class383(this, n, n2);
    }
    
    void dr() {
        this.field3619.clear();
    }
    
    public static String wb(final WorldMapArea worldMapArea) {
        return worldMapArea.externalName;
    }
    
    public String method2007(final int n) {
        try {
            if (!this.method2004(-813391360)) {
                final StringBuilder sb = new StringBuilder(this.method2038(1367232975));
                for (int i = 0; i < this.method2038(1772671571); ++i) {
                    if (n != -1389348498) {
                        throw new IllegalStateException();
                    }
                    sb.append(ml(this, i, 2094672267).field3624);
                }
                return sb.toString();
            }
            if (n != -1389348498) {
                throw new IllegalStateException();
            }
            return "";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ab(" + ')');
        }
    }
    
    public void method2033(int n, final byte b) {
        try {
            if (null != this.field3612) {
                if (b != 2) {
                    return;
                }
                if (n < 2 * this.field3612.ascent) {
                    if (b != 2) {
                        return;
                    }
                    n = Integer.MAX_VALUE;
                }
            }
            if (233637321 * this.field3616 != n) {
                if (b != 2) {
                    throw new IllegalStateException();
                }
                this.field3616 = 417866873 * n;
                this.method2025(-224307219);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.aq(" + ')');
        }
    }
    
    public int method2016(int fromIndex, int toIndex, final int n) {
        try {
            if (toIndex < fromIndex) {
                if (n == -964267539) {
                    throw new IllegalStateException();
                }
                final int n2 = toIndex;
                toIndex = fromIndex;
                fromIndex = n2;
            }
            this.field3619.subList(fromIndex, toIndex).clear();
            int i = fromIndex;
            if (this.method2005((byte)16) && 1 == -29893609 * this.field3611) {
                if (n == -964267539) {
                    throw new IllegalStateException();
                }
                while (i > 0) {
                    if (n == -964267539) {
                        throw new IllegalStateException();
                    }
                    --i;
                    final char field3624 = this.field3619.get(i).field3624;
                    if (' ' == field3624) {
                        break;
                    }
                    if (n == -964267539) {
                        throw new IllegalStateException();
                    }
                    if (field3624 != '\t') {
                        continue;
                    }
                    if (n == -964267539) {
                        throw new IllegalStateException();
                    }
                    break;
                }
            }
            this.method2026(i, toIndex, -93545195);
            return fromIndex;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.aj(" + ')');
        }
    }
    
    public class380 method2032(final char c, final int n, final int n2, final int n3) {
        try {
            return this.method2012(Character.toString(c), n, n2, (byte)9);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ag(" + ')');
        }
    }
    
    public boolean bl() {
        return this.field3619.size() == 0;
    }
    
    int ep() {
        return this.method2004(-1454066660) ? 0 : eo(this, this.field3619.get(this.field3619.size() - 1), false, -427169203);
    }
    
    public int dg(final int n, final int n2) {
        try {
            switch (1114162931 * this.field3620) {
                default: {
                    return 0;
                }
                case 1: {
                    return n / 2;
                }
                case 2: {
                    return n;
                }
                case 0: {
                    return 0;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bz(" + ')');
        }
    }
    
    public static void oo(final class379 class379, final int n, final int n2) {
        if (class379 == null) {
            class379.da();
        }
        if (!class379.method2004(-1081502150) && class379.field3612 != null) {
            final class461 ly = ly(class379, n, n2, 1060489718);
            final boolean b = (int)ly.field3972 == 0 && (int)ly.field3973 == class379.field3619.size();
            int intValue = (int)ly.field3972;
            int n3 = 0;
            int n4 = b ? 0 : (class379.field3619.get((int)ly.field3972).field3623 * -727185157);
            int n5 = 0;
            for (int i = (int)ly.field3972; i <= (int)ly.field3973; ++i) {
                final boolean b2 = i >= class379.field3619.size();
                final class381 class380 = class379.field3619.get(b2 ? (class379.field3619.size() - 1) : i);
                final int n6 = b2 ? 0 : eo(class379, class380, false, -1430983930);
                final boolean b3 = !b2 && class380.field3624 == '\n';
                final boolean b4 = !b2 && class379.method2005((byte)16) && n3 + n6 > 233637321 * class379.field3616;
                if (b3 || b4 || b2) {
                    int n7 = i;
                    int n8 = 0;
                    if (b4) {
                        int n9 = 0;
                        if (1 == class379.field3611 * -408395346) {
                            for (int j = n7; j > intValue; --j) {
                                final class381 class381 = class379.field3619.get(j);
                                n9 += ((j < n7) ? eo(class379, class381, false, 223104988) : 0);
                                if (class381.field3624 == ' ' || '\n' == class381.field3624) {
                                    n7 = j;
                                    n3 -= n9;
                                    n8 = n9;
                                    break;
                                }
                            }
                        }
                    }
                    int n10 = -op(class379, n3, (byte)45);
                    for (int k = intValue; k < n7; ++k) {
                        final class381 class382 = class379.field3619.get(k);
                        final int eo = eo(class379, class382, false, -986656111);
                        class382.field3625 = n10 * -1938553686;
                        class382.field3623 = n4 * -1731554451;
                        n10 += eo;
                    }
                    intValue = n7;
                    n3 = n8;
                    n4 += he(class379, -297150195);
                    ++n5;
                }
                n3 += (b2 ? 0 : n6);
            }
            if (1114162931 * class379.field3620 != 0 && b) {
                final int dg = class379.dg(n5 * he(class379, -297150195), -595833960);
                for (int l = 0; l < class379.field3619.size(); ++l) {
                    final class381 class383 = class379.field3619.get(l);
                    class383.field3623 -= dg * 1332883240;
                }
            }
        }
    }
    
    public int method2040(final int n, final int n2) {
        if (null == this.field3612) {
            return 0;
        }
        if (this.method2005((byte)16) && n > 710040546 * this.field3616) {
            return this.field3619.size();
        }
        if (!this.field3619.isEmpty()) {
            for (int i = 0; i < this.field3619.size(); ++i) {
                final class381 class381 = this.field3619.get(i);
                if (n2 <= class381.field3623 * -727185157 + he(this, -297150195)) {
                    if (n2 < -727185157 * class381.field3623) {
                        break;
                    }
                    if (n < 1620071571 * class381.field3625) {
                        return (i > 0) ? (i - 1) : 0;
                    }
                    if (i + 1 != this.field3619.size() && this.field3619.get(i + 1).field3623 * -1683185662 != -952699005 * class381.field3623) {
                        if (n < 1620071571 * class381.field3625 + eo(this, this.field3619.get(i), false, -246448173)) {
                            return i;
                        }
                        if (n2 <= -799026859 * class381.field3623 + he(this, -297150195)) {
                            return i + 1;
                        }
                    }
                }
            }
            final class381 class382 = this.field3619.get(this.field3619.size() - 1);
            if (n >= class382.field3625 * 1140719500 && n <= class382.field3625 * 1620071571 + this.method2036((byte)5) && n2 >= -727185157 * class382.field3623 && n2 <= -727185157 * class382.field3623 + he(this, -297150195)) {
                return this.field3619.size() - 1;
            }
        }
        return this.field3619.size();
    }
    
    public static int hz(final class379 class379, final int index, boolean b) {
        if (index < class379.field3619.size()) {
            int n = class379.field3619.get(index).field3623 * 1805710269;
            for (int i = index; i > 0; --i) {
                if (((class381)class379.field3619.get(i - 1)).field3623 * 234665793 < n) {
                    if (!b) {
                        return i;
                    }
                    b = false;
                    n = ((class381)class379.field3619.get(i - 1)).field3623 * 565507201;
                }
            }
        }
        return 0;
    }
    
    void eg(final int n, final int n2) {
        if (this.method2004(-1400013667) || this.field3612 == null) {
            return;
        }
        final class461 ly = ly(this, n, n2, 1562476425);
        final boolean b = (int)ly.field3972 == 0 && (int)ly.field3973 == this.field3619.size();
        int intValue = (int)ly.field3972;
        int n3 = 0;
        int n4 = b ? 0 : (this.field3619.get((int)ly.field3972).field3623 * -727185157);
        int n5 = 0;
        for (int i = (int)ly.field3972; i <= (int)ly.field3973; ++i) {
            final boolean b2 = i >= this.field3619.size();
            final class381 class381 = this.field3619.get((!b2) ? i : (this.field3619.size() - 1));
            final int n6 = (!b2) ? eo(this, class381, false, -86624010) : 0;
            final boolean b3 = !b2 && class381.field3624 == '\n';
            final boolean b4 = !b2 && this.method2005((byte)16) && n3 + n6 > 233637321 * this.field3616;
            if (b3 || b4 || b2) {
                int n7 = i;
                int n8 = 0;
                if (b4) {
                    int n9 = 0;
                    if (1 == this.field3611 * -29893609) {
                        for (int j = n7; j > intValue; --j) {
                            final class381 class382 = this.field3619.get(j);
                            n9 += ((j < n7) ? eo(this, class382, false, -794805174) : 0);
                            if (class382.field3624 == ' ' || '\n' == class382.field3624) {
                                n7 = j;
                                n3 -= n9;
                                n8 = n9;
                                break;
                            }
                        }
                    }
                }
                int n10 = -op(this, n3, (byte)49);
                for (int k = intValue; k < n7; ++k) {
                    final class381 class383 = this.field3619.get(k);
                    final int eo = eo(this, class383, false, -753275694);
                    class383.field3625 = n10 * -961418853;
                    class383.field3623 = n4 * -2052537805;
                    n10 += eo;
                }
                intValue = n7;
                n3 = n8;
                n4 += he(this, -297150195);
                ++n5;
            }
            n3 += ((!b2) ? n6 : false);
        }
        if (1114162931 * this.field3620 != 0 && b) {
            final int dg = this.dg(n5 * he(this, -297150195), -1404052394);
            for (int l = 0; l < this.field3619.size(); ++l) {
                final class381 class384 = this.field3619.get(l);
                class384.field3623 -= dg * -2052537805;
            }
        }
    }
    
    int ew(final int index) {
        return (index < this.field3619.size()) ? eo(this, this.field3619.get(index), false, -142367746) : 0;
    }
    
    public int ej() {
        return this.field3614 * -64830711;
    }
    
    int method2028(final class381 class381, final boolean b, final int n) {
        try {
            if (class381.field3624 == '\n') {
                if (n >= 291308709) {
                    throw new IllegalStateException();
                }
                return 0;
            }
            else {
                if (!b) {
                    if (0 != this.field3616 * 874587033) {
                        return this.field3612.heights[42];
                    }
                    if (n >= 291308709) {
                        throw new IllegalStateException();
                    }
                }
                final int n2 = this.field3612.widths[class381.field3624];
                if (n2 != 0) {
                    return n2;
                }
                if (n >= 291308709) {
                    throw new IllegalStateException();
                }
                if ('\t' == class381.field3624) {
                    return this.field3612.topBearings[32] * 3;
                }
                return this.field3612.topBearings[32];
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bj(" + ')');
        }
    }
    
    public static class380 hk(final class379 class379, final String s, final int n) {
        return class379.method2012(s, class379.field3619.size(), n, (byte)(-14));
    }
    
    public static int yz(final class379 class379, final int n, final int n2, final byte b) {
        if (class379 == null) {
            return class379.method2017(n, n, b);
        }
        try {
            if (null == class379.field3612) {
                return 0;
            }
            if (!class379.method2005((byte)16) || n <= 233637321 * class379.field3616) {
                if (!class379.field3619.isEmpty()) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    for (int i = 0; i < class379.field3619.size(); ++i) {
                        final class381 class380 = class379.field3619.get(i);
                        if (n2 <= class380.field3623 * -727185157 + he(class379, -297150195)) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            if (n2 < -727185157 * class380.field3623) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                break;
                            }
                            else if (n < 1620071571 * class380.field3625) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                return (i > 0) ? (i - 1) : 0;
                            }
                            else if (i + 1 != class379.field3619.size()) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                if (class379.field3619.get(i + 1).field3623 * -727185157 != -727185157 * class380.field3623) {
                                    if (n < 1620071571 * class380.field3625 + eo(class379, class379.field3619.get(i), false, -935952959)) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return i;
                                    }
                                    else if (n2 <= -727185157 * class380.field3623 + he(class379, -297150195)) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        return i + 1;
                                    }
                                }
                            }
                        }
                    }
                    final class381 class381 = class379.field3619.get(class379.field3619.size() - 1);
                    if (n >= class381.field3625 * 1620071571) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        if (n <= class381.field3625 * 1620071571 + class379.method2036((byte)80) && n2 >= -727185157 * class381.field3623) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            if (n2 <= -727185157 * class381.field3623 + he(class379, -297150195)) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                return class379.field3619.size() - 1;
                            }
                        }
                    }
                }
                return class379.field3619.size();
            }
            if (b >= 0) {
                throw new IllegalStateException();
            }
            return class379.field3619.size();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ak(" + ')');
        }
    }
    
    public static int yd(final class379 class379, final int n, final int n2) {
        if (class379 == null) {
            class379.du(n, n);
        }
        try {
            return class379.method2016(n, n + 1, -1296659257);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.as(" + ')');
        }
    }
    
    public static int fz(final class379 class379, final int n, int n2) {
        if (class379 == null) {
            return class379.dq(n, n);
        }
        if (null == class379.field3612 || class379.method2004(-1138065968) || n > class379.field3619.size()) {
            return 0;
        }
        int n3;
        if (n2 > 0) {
            n3 = 1;
        }
        else {
            n3 = -1;
            n2 = -n2;
        }
        int n4 = 0;
        int n5 = 0;
        if (n > 0) {
            final class381 class380 = class379.field3619.get(n - 1);
            n4 = class380.field3625 * 1620071571 + class379.method2027(n - 1, -465870520);
            n5 = class380.field3623 * -727185157;
        }
        else if (n3 == -1 && 0 == n) {
            return 0;
        }
        int n6 = 0;
        int n7 = n;
        int n8 = 16777215;
        for (int i = (n3 != 0) ? (class379.field3619.size() + 1) : 0, n9 = n + n3; i != n9; n9 += n3) {
            final class381 class381 = class379.field3619.get(n9 - 1);
            if (n5 != -727185157 * class381.field3623) {
                ++n6;
                n5 = -727185157 * class381.field3623;
                if (n6 > n2) {
                    return n7;
                }
            }
            if (n6 == n2) {
                final int abs = Math.abs(class381.field3625 * 1620071571 + class379.method2027(n9 - 1, -465870520) - n4);
                if (abs >= n8) {
                    return n7;
                }
                n7 = n9;
                n8 = abs;
            }
        }
        if (n3 == 1) {
            return class379.field3619.size();
        }
        if (n5 != 0) {
            ++n6;
        }
        if (16777215 != n8 && (n6 != n2 || n4 >= n8)) {
            return n7;
        }
        return 0;
    }
    
    public void cq(final int n) {
        if (n != this.field3614 * -64830711) {
            this.field3614 = n * -181159111;
            this.method2025(-224307219);
        }
    }
    
    void method2025(final int n) {
        try {
            this.method2026(0, this.field3619.size(), -93545195);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bm(" + ')');
        }
    }
    
    public int method2034(final int n) {
        try {
            return this.field3616 * -1059679999;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ap(" + ')');
        }
    }
    
    public static String jt(final class379 class379) {
        if (class379 == null) {
            class379.bl();
        }
        if (class379.method2004(1214666107)) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(class379.method2006(1319861202));
        for (int i = 0; i < class379.method2006(2096797395); ++i) {
            sb.append(ml(class379, i, 2112619274).field3624);
        }
        return sb.toString();
    }
    
    public int dq(final int n, int n2) {
        if (null == this.field3612 || this.method2004(-1138065968) || n > this.field3619.size()) {
            return 0;
        }
        int n3;
        if (n2 > 0) {
            n3 = 1;
        }
        else {
            n3 = -1;
            n2 = -n2;
        }
        int n4 = 0;
        int n5 = 0;
        if (n > 0) {
            final class381 class381 = this.field3619.get(n - 1);
            n4 = class381.field3625 * 1620071571 + this.method2027(n - 1, -465870520);
            n5 = class381.field3625 * -727185157;
        }
        else if (n3 == -1 && 0 == n) {
            return 0;
        }
        int n6 = 0;
        int n7 = n;
        int n8 = 16777215;
        for (int i = (n3 != 0) ? (this.field3619.size() + 1) : 0, n9 = n + n3; i != n9; n9 += n3) {
            final class381 class382 = this.field3619.get(n9 - 1);
            if (n5 != -727185157 * class382.field3625) {
                ++n6;
                n5 = -727185157 * class382.field3623;
                if (n6 > n2) {
                    return n7;
                }
            }
            if (n6 == n2) {
                final int abs = Math.abs(class382.field3623 * 1620071571 + this.method2027(n9 - 1, -465870520) - n4);
                if (abs >= n8) {
                    return n7;
                }
                n7 = n9;
                n8 = abs;
            }
        }
        if (n3 == 1) {
            return this.field3619.size();
        }
        if (n5 != 0) {
            ++n6;
        }
        if (16777215 != n8 && (n6 != n2 || n4 >= n8)) {
            return n7;
        }
        return 0;
    }
    
    public static int eo(final class379 class379, final class381 class380, final boolean b, final int n) {
        if (class379 == null) {
            return class379.method2028(class380, b, n);
        }
        try {
            if (class380.field3624 == '\n') {
                if (n >= 291308709) {
                    throw new IllegalStateException();
                }
                return 0;
            }
            else {
                if (!b) {
                    if (0 != class379.field3621 * 874587033) {
                        return class379.field3612.advances[42];
                    }
                    if (n >= 291308709) {
                        throw new IllegalStateException();
                    }
                }
                final int n2 = class379.field3612.advances[class380.field3624];
                if (n2 != 0) {
                    return n2;
                }
                if (n >= 291308709) {
                    throw new IllegalStateException();
                }
                if ('\t' == class380.field3624) {
                    return class379.field3612.advances[32] * 3;
                }
                return class379.field3612.advances[32];
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bj(" + ')');
        }
    }
    
    public int eb(final int n) {
        switch (-257396230 * this.field3620) {
            case 1: {
                return n / 2;
            }
            case 0: {
                return 0;
            }
            case 2: {
                return n;
            }
            default: {
                return 0;
            }
        }
    }
    
    public static int tq(final class379 class379, final int n) {
        if (class379 == null) {
            class379.method2034(n);
        }
        try {
            return class379.field3611 * -29893609;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.bk(" + ')');
        }
    }
    
    public class380 method2012(final String s, final int n, int n2, final byte b) {
        try {
            if (0 == n2) {
                n2 = Integer.MAX_VALUE;
            }
            int i = n;
            if (this.field3619.size() < n2) {
                this.field3619.ensureCapacity(this.field3619.size() + s.length());
                for (int j = 0; j < s.length(); ++j) {
                    if (b == 11) {
                        throw new IllegalStateException();
                    }
                    if (this.field3619.size() >= n2) {
                        break;
                    }
                    final class381 element = new class381();
                    element.field3624 = s.charAt(j);
                    this.field3619.add(i, element);
                    ++i;
                }
                this.method2026(n, i, -93545195);
                if (-64830711 * this.field3614 != 0) {
                    if (b == 11) {
                        throw new IllegalStateException();
                    }
                    if (this.method2021((byte)84) > this.field3614 * -64830711) {
                        if (b == 11) {
                            throw new IllegalStateException();
                        }
                        while (i != n) {
                            --i;
                            yd(this, i, 712183830);
                            if (this.method2021((byte)27) <= this.field3614 * -64830711) {
                                if (b == 11) {
                                    throw new IllegalStateException();
                                }
                                return new class380(i, true);
                            }
                        }
                        if (b == 11) {
                            throw new IllegalStateException();
                        }
                        return new class380(i, true);
                    }
                }
                return new class380(i, false);
            }
            if (b == 11) {
                throw new IllegalStateException();
            }
            this.method2026(n, i, -93545195);
            return new class380(i, true);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "oq.ah(" + ')');
        }
    }
    
    public static void ik(final class379 class379, final int n) {
        if (n != class379.field3611 * 186212914) {
            class379.field3611 = -1847115765 * n;
            class379.method2025(-224307219);
        }
    }
    
    public int ef() {
        return this.field3614 * -294567207;
    }
    
    public static class380 yt(final class379 class379, final String s, final int n, int n2) {
        if (class379 == null) {
            class379.di();
        }
        if (0 == n2) {
            n2 = -505796284;
        }
        int i = n;
        if (class379.field3619.size() >= n2) {
            class379.method2026(n, i, -93545195);
            return new class380(i, true);
        }
        class379.field3619.ensureCapacity(class379.field3619.size() + s.length());
        for (int index = 0; index < s.length() && class379.field3619.size() < n2; ++index) {
            final class381 element = new class381();
            element.field3624 = s.charAt(index);
            class379.field3619.add(i, element);
            ++i;
        }
        class379.method2026(n, i, -93545195);
        if (862044313 * class379.field3614 != 0 && class379.method2021((byte)(-100)) > class379.field3614 * -64830711) {
            while (i != n) {
                --i;
                yd(class379, i, 1831896488);
                if (class379.method2021((byte)(-32)) <= class379.field3614 * -909631674) {
                    return new class380(i, true);
                }
            }
            return new class380(i, true);
        }
        return new class380(i, false);
    }
    
    public static class461 yu(final class379 class379, final int n, final int n2) {
        if (class379 == null) {
            class379.de(n, n);
        }
        final int min = Math.min(n, n2);
        final int max = Math.max(n, n2);
        final int size = class379.field3619.size();
        if (min == 0 && max == size) {
            return new class461(0, size);
        }
        final int method2030 = class379.method2030(min, false, -459227398);
        final int method2031 = class379.method2031(max, false, -373297993);
        switch (class379.field3620 * 1114162931) {
            case 2: {
                if (252193353 * class379.field3615 == 2) {
                    return new class461(0, method2031);
                }
                return new class461(0, class379.method2031(max, true, 1141884043));
            }
            case 0: {
                if (252193353 * class379.field3615 == 0) {
                    return new class461(method2030, size);
                }
                return new class461(class379.method2030(min, true, -1396373733), size);
            }
            case 1: {
                return new class461(0, size);
            }
            default: {
                return new class461(0, size);
            }
        }
    }
    
    public static int qd(final class379 class379, final int n, int n2) {
        if (null == class379.field3612 || class379.method2004(-586743255) || n > class379.field3619.size()) {
            return 0;
        }
        int n3;
        if (n2 > 0) {
            n3 = 1;
        }
        else {
            n3 = -1;
            n2 = -n2;
        }
        int n4 = 0;
        int n5 = 0;
        if (n > 0) {
            final class381 class380 = class379.field3619.get(n - 1);
            n4 = class380.field3625 * 1620071571 + class379.method2027(n - 1, -465870520);
            n5 = class380.field3623 * -727185157;
        }
        else if (n3 == -1 && 0 == n) {
            return 0;
        }
        int n6 = 0;
        int n7 = n;
        int n8 = 16777215;
        for (int i = (n3 != 0) ? (class379.field3619.size() + 1) : 0, n9 = n + n3; i != n9; n9 += n3) {
            final class381 class381 = class379.field3619.get(n9 - 1);
            if (n5 != -727185157 * class381.field3623) {
                ++n6;
                n5 = -727185157 * class381.field3623;
                if (n6 > n2) {
                    return n7;
                }
            }
            if (n6 == n2) {
                final int abs = Math.abs(class381.field3625 * 1620071571 + class379.method2027(n9 - 1, -465870520) - n4);
                if (abs >= n8) {
                    return n7;
                }
                n7 = n9;
                n8 = abs;
            }
        }
        if (n3 == 1) {
            return class379.field3619.size();
        }
        if (n5 != 0) {
            ++n6;
        }
        if (16777215 == n8 || (n6 == n2 && n4 < n8)) {
            return 0;
        }
        return n7;
    }
    
    class381 bf() {
        if (this.field3619.size() == 0) {
            return null;
        }
        return this.field3619.get(this.field3619.size() - 1);
    }
    
    public int du(final int n, final int n2) {
        if (null == this.field3612) {
            return 0;
        }
        if (this.method2005((byte)16) && n > 233637321 * this.field3616) {
            return this.field3619.size();
        }
        if (!this.field3619.isEmpty()) {
            for (int i = 0; i < this.field3619.size(); ++i) {
                final class381 class381 = this.field3619.get(i);
                if (n2 <= class381.field3625 * -727185157 + he(this, -297150195)) {
                    if (n2 < -727185157 * class381.field3623) {
                        break;
                    }
                    if (n < 1620071571 * class381.field3623) {
                        return (i > 0) ? (i - 1) : 0;
                    }
                    if (i + 1 != this.field3619.size() && this.field3619.get(i + 1).field3625 * -727185157 != -727185157 * class381.field3625) {
                        if (n < 1620071571 * class381.field3623 + eo(this, this.field3619.get(i), false, -160161433)) {
                            return i;
                        }
                        if (n2 <= -727185157 * class381.field3623 + he(this, -297150195)) {
                            return i + 1;
                        }
                    }
                }
            }
            final class381 class382 = this.field3619.get(this.field3619.size() - 1);
            if (n >= class382.field3625 * 1620071571 && n <= class382.field3625 * 1620071571 + this.method2036((byte)78) && n2 >= -727185157 * class382.field3623 && n2 <= -727185157 * class382.field3623 + he(this, -297150195)) {
                return this.field3619.size() - 1;
            }
        }
        return this.field3619.size();
    }
}
