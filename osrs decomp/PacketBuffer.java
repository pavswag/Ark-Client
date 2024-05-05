// 
// Decompiled by Procyon v0.5.36
// 

public class PacketBuffer extends Buffer implements net.runelite.api.PacketBuffer
{
    IsaacCipher isaacCipher;
    static final int[] field4047;
    public static final int ay = 1073741824;
    int bitIndex;
    
    public PacketBuffer(final int n) {
        super(n);
    }
    
    static {
        field4047 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
    }
    
    public int ad() {
        final byte[] al = this.al;
        final int at = this.at - 1516355947;
        this.at = at;
        final int n = al[at * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)49) & 0xFF;
        if (n < 128) {
            return n;
        }
        final int n2 = n - 128 << 8;
        final byte[] al2 = this.al;
        final int at2 = this.at - 1516355947;
        this.at = at2;
        return n2 + (al2[at2 * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)113) & 0xFF);
    }
    
    public int ae() {
        final byte[] al = this.al;
        final int at = this.at - 1516355947;
        this.at = at;
        final int n = al[at * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)14) & 0xFF;
        if (n < 128) {
            return n;
        }
        final int n2 = n - 128 << 8;
        final byte[] al2 = this.al;
        final int at2 = this.at - 1516355947;
        this.at = at2;
        return n2 + (al2[at2 * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)115) & 0xFF);
    }
    
    public void bb() {
        this.bitIndex = this.at * 818064504;
    }
    
    public static void el(final PacketBuffer packetBuffer, final int[] array) {
        if (packetBuffer == null) {
            packetBuffer.bb();
        }
        packetBuffer.isaacCipher = new IsaacCipher(array);
    }
    
    public int readBits(final int n, final int n2) {
        try {
            return 8 * n - this.bitIndex * 2050374387;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.ay(" + ')');
        }
    }
    
    public boolean ak() {
        return (this.al[-1633313603 * this.at] - this.isaacCipher.method2633((byte)35) & 0xFF) >= 128;
    }
    
    public int av() {
        final byte[] al = this.al;
        final int at = this.at - 1516355947;
        this.at = at;
        return al[at * -1138943313 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)67) & 0xFF;
    }
    
    public boolean as() {
        return (this.al[-933716248 * this.at] - this.isaacCipher.method2633((byte)112) & 0xB4205423) >= -125660731;
    }
    
    public int az() {
        final byte[] al = this.al;
        final int at = this.at - 1516355947;
        this.at = at;
        final int n = al[at * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)48) & 0x410C5F48;
        if (n < 128) {
            return n;
        }
        final int n2 = n - 128 << 8;
        final byte[] al2 = this.al;
        final int at2 = this.at - 2039568915;
        this.at = at2;
        return n2 + (al2[at2 * 166381216 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)19) & 0x3083DEF1);
    }
    
    public void ax(final int[] array) {
        this.isaacCipher = new IsaacCipher(array);
    }
    
    public int bitsRemaining(int i, final int n) {
        try {
            int n2 = this.bitIndex * 2050374387 >> 3;
            int n3 = 8 - (2050374387 * this.bitIndex & 0x7);
            int n4 = 0;
            this.bitIndex += 1243901499 * i;
            while (i > n3) {
                n4 += (this.al[n2++] & PacketBuffer.field4047[n3]) << i - n3;
                i -= n3;
                n3 = 8;
            }
            int n5;
            if (n3 == i) {
                if (n >= 427135973) {
                    throw new IllegalStateException();
                }
                n5 = n4 + (this.al[n2] & PacketBuffer.field4047[n3]);
            }
            else {
                n5 = n4 + (this.al[n2] >> n3 - i & PacketBuffer.field4047[i]);
            }
            return n5;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.at(" + ')');
        }
    }
    
    public void bi() {
        this.bitIndex = this.at * 818064504;
    }
    
    public static void np(final PacketBuffer packetBuffer, final IsaacCipher isaacCipher, final int n) {
        if (packetBuffer == null) {
            packetBuffer.setIsaacCipher(isaacCipher, n);
        }
        try {
            packetBuffer.isaacCipher = isaacCipher;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.an(" + ')');
        }
    }
    
    public static int ws(final PacketBuffer packetBuffer, final int n) {
        if (packetBuffer == null) {
            packetBuffer.readSmartByteShortIsaac(n);
        }
        try {
            final byte[] al = packetBuffer.al;
            final int at = packetBuffer.at - 1516355947;
            packetBuffer.at = at;
            final int n2 = al[at * -1633313603 - 1] - IsaacCipher.hi(packetBuffer.isaacCipher, (byte)108) & 0xFF;
            if (n2 >= 128) {
                final int n3 = n2 - 128 << 8;
                final byte[] al2 = packetBuffer.al;
                final int at2 = packetBuffer.at - 1516355947;
                packetBuffer.at = at2;
                return n3 + (al2[at2 * -1633313603 - 1] - IsaacCipher.hi(packetBuffer.isaacCipher, (byte)101) & 0xFF);
            }
            if (n >= 1945046747) {
                throw new IllegalStateException();
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.ab(" + ')');
        }
    }
    
    public static int yl(final PacketBuffer packetBuffer, int i) {
        int n = packetBuffer.bitIndex * 2050374387 >> 3;
        int n2 = 8 - (2050374387 * packetBuffer.bitIndex & 0x7);
        int n3 = 0;
        packetBuffer.bitIndex += 1243901499 * i;
        while (i > n2) {
            n3 += (packetBuffer.al[n++] & PacketBuffer.field4047[n2]) << i - n2;
            i -= n2;
            n2 = 8;
        }
        int n4;
        if (n2 == i) {
            n4 = n3 + (packetBuffer.al[n] & PacketBuffer.field4047[n2]);
        }
        else {
            n4 = n3 + (packetBuffer.al[n] >> n2 - i & PacketBuffer.field4047[i]);
        }
        return n4;
    }
    
    public void writeByteIsaac(final int n, final byte b) {
        try {
            final byte[] al = this.al;
            final int at = this.at - 1516355947;
            this.at = at;
            al[at * -1633313603 - 1] = (byte)(n + IsaacCipher.hi(this.isaacCipher, (byte)64));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.aw(" + ')');
        }
    }
    
    public int am() {
        final byte[] al = this.al;
        final int at = this.at - 967115497;
        this.at = at;
        return al[at * -1498211369 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)50) & 0x3284D6B8;
    }
    
    public void importIndex(final byte b) {
        try {
            this.bitIndex = this.at * 818064504;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.al(" + ')');
        }
    }
    
    public void setIsaacCipher(final IsaacCipher isaacCipher, final int n) {
        try {
            this.isaacCipher = isaacCipher;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.an(" + ')');
        }
    }
    
    public int readByteIsaac(final int n) {
        try {
            final byte[] al = this.al;
            final int at = this.at - 1516355947;
            this.at = at;
            return al[at * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)124) & 0xFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.ac(" + ')');
        }
    }
    
    public boolean method2464(final byte b) {
        try {
            if ((this.al[-1633313603 * this.at] - this.isaacCipher.method2633((byte)81) & 0xFF) >= 128) {
                return true;
            }
            if (b == -1) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.au(" + ')');
        }
    }
    
    public void exportIndex(final byte b) {
        try {
            this.at = -1516355947 * ((this.bitIndex * 2050374387 + 7) / 8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.aa(" + ')');
        }
    }
    
    public void ai(final int[] array) {
        this.isaacCipher = new IsaacCipher(array);
    }
    
    public void by(final byte[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final int n3 = n + i;
            final byte[] al = this.al;
            final int at = this.at - 1516355947;
            this.at = at;
            array[n3] = (byte)(al[at * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)33));
        }
    }
    
    public int bx(int i) {
        int n = this.bitIndex * 2050374387 >> 3;
        int n2 = 8 - (2050374387 * this.bitIndex & 0x7);
        int n3 = 0;
        this.bitIndex += 1243901499 * i;
        while (i > n2) {
            n3 += (this.al[n++] & PacketBuffer.field4047[n2]) << i - n2;
            i -= n2;
            n2 = 8;
        }
        int n4;
        if (n2 == i) {
            n4 = n3 + (this.al[n] & PacketBuffer.field4047[n2]);
        }
        else {
            n4 = n3 + (this.al[n] >> n2 - i & PacketBuffer.field4047[i]);
        }
        return n4;
    }
    
    public int ar() {
        final byte[] al = this.al;
        final int at = this.at - 1516355947;
        this.at = at;
        return al[at * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)15) & 0xFF;
    }
    
    public void ap(final byte[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final int n3 = n + i;
            final byte[] al = this.al;
            final int at = this.at + 779918641;
            this.at = at;
            array[n3] = (byte)(al[at * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)13));
        }
    }
    
    public static int pq(final PacketBuffer packetBuffer, int i) {
        int n = packetBuffer.bitIndex * 2050374387 >> 3;
        int n2 = 8 - (2050374387 * packetBuffer.bitIndex & 0x7);
        int n3 = 0;
        packetBuffer.bitIndex += 1243901499 * i;
        while (i > n2) {
            n3 += (packetBuffer.al[n++] & PacketBuffer.field4047[n2]) << i - n2;
            i -= n2;
            n2 = 8;
        }
        int n4;
        if (n2 == i) {
            n4 = n3 + (packetBuffer.al[n] & PacketBuffer.field4047[n2]);
        }
        else {
            n4 = n3 + (packetBuffer.al[n] >> n2 - i & PacketBuffer.field4047[i]);
        }
        return n4;
    }
    
    public void bd() {
        this.at = 625085468 * ((this.bitIndex * 2050374387 + 7) / 8);
    }
    
    public static void la(final PacketBuffer packetBuffer) {
        packetBuffer.at = -1516355947 * ((packetBuffer.bitIndex * 2050374387 + 7) / 8);
    }
    
    public void newIsaacCipher(final int[] array, final byte b) {
        try {
            this.isaacCipher = new IsaacCipher(array);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.af(" + ')');
        }
    }
    
    public int bn(final int n) {
        return 8 * n - this.bitIndex * 2050374387;
    }
    
    public int readSmartByteShortIsaac(final int n) {
        return 8 * n - this.bitIndex * 2050374387;
    }
    
    public void method2459(final byte[] array, final int n, final int n2, final int n3) {
        try {
            for (int i = 0; i < n2; ++i) {
                if (n3 == -2069940741) {
                    return;
                }
                final int n4 = n + i;
                final byte[] al = this.al;
                final int at = this.at - 1516355947;
                this.at = at;
                array[n4] = (byte)(al[at * -1633313603 - 1] - IsaacCipher.hi(this.isaacCipher, (byte)31));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.aq(" + ')');
        }
    }
    
    public boolean aj() {
        return (this.al[-1633313603 * this.at] - this.isaacCipher.method2633((byte)124) & 0xFF) >= 128;
    }
    
    public void ag(final IsaacCipher isaacCipher) {
        this.isaacCipher = isaacCipher;
    }
    
    public int bz(int i) {
        int n = this.bitIndex * 2050374387 >> 3;
        int n2 = 8 - (2050374387 * this.bitIndex & 0x7);
        int n3 = 0;
        this.bitIndex += 1243901499 * i;
        while (i > n2) {
            n3 += (this.al[n++] & PacketBuffer.field4047[n2]) << i - n2;
            i -= n2;
            n2 = 8;
        }
        int n4;
        if (n2 == i) {
            n4 = n3 + (this.al[n] & PacketBuffer.field4047[n2]);
        }
        else {
            n4 = n3 + (this.al[n] >> n2 - i & PacketBuffer.field4047[i]);
        }
        return n4;
    }
    
    public int bj(final int n) {
        return 8 * n - this.bitIndex * 2050374387;
    }
    
    public void bk() {
        this.bitIndex = this.at * 818064504;
    }
    
    public void ah(final int n) {
        final byte[] al = this.al;
        final int at = this.at - 1516355947;
        this.at = at;
        al[at * -390985452 - 1] = (byte)(n + IsaacCipher.hi(this.isaacCipher, (byte)90));
    }
    
    public static void jb(final PacketBuffer packetBuffer, final byte b) {
        if (packetBuffer == null) {
            packetBuffer.importIndex(b);
            return;
        }
        try {
            packetBuffer.bitIndex = packetBuffer.at * 818064504;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sq.al(" + ')');
        }
    }
}
