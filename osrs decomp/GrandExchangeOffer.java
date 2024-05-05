import net.runelite.api.GrandExchangeOfferState;

// 
// Decompiled by Procyon v0.5.36
// 

public class GrandExchangeOffer implements net.runelite.api.GrandExchangeOffer
{
    public int currentQuantity;
    public int id;
    public int unitPrice;
    public static final int av = 25;
    public int totalQuantity;
    public int currentPrice;
    static String field3530;
    byte state;
    public static final int al = 1024;
    static final int cw = 20;
    
    public GrandExchangeOffer() {
    }
    
    public GrandExchangeOffer(final Buffer buffer, final boolean b) {
        this.state = Buffer.wu(buffer, 435772489);
        this.id = buffer.readUnsignedShort(-1390345714) * -2000800301;
        this.unitPrice = buffer.readInt(-1226492666) * 945098885;
        this.totalQuantity = buffer.readInt(-1343401036) * 275172041;
        this.currentQuantity = buffer.readInt(-967787223) * 832101099;
        this.currentPrice = buffer.readInt(-1718644383) * 2084457045;
        if (b) {
            hw(this, ArchiveDiskActionHandler.addImageTag(buffer, (byte)(-20)), 1482046738);
        }
    }
    
    public GrandExchangeOfferState getState() {
        final byte tm = this.tm();
        final boolean b = (tm & 0x8) == 0x8;
        final boolean b2 = (tm & 0x4) == 0x4;
        if (tm == 0) {
            return GrandExchangeOfferState.EMPTY;
        }
        if (b2 && this.getQuantitySold() < this.getTotalQuantity()) {
            return b ? GrandExchangeOfferState.CANCELLED_SELL : GrandExchangeOfferState.CANCELLED_BUY;
        }
        if (b) {
            if (b2) {
                return GrandExchangeOfferState.SOLD;
            }
            return GrandExchangeOfferState.SELLING;
        }
        else {
            if (b2) {
                return GrandExchangeOfferState.BOUGHT;
            }
            return GrandExchangeOfferState.BUYING;
        }
    }
    
    public int at() {
        return this.state & 0x7;
    }
    
    void av(final int n) {
        this.state &= (byte)(-1938528902);
        this.state |= (byte)(n & 0x7);
    }
    
    public static void gf(final GrandExchangeOffer grandExchangeOffer, final int n) {
        if (grandExchangeOffer == null) {
            grandExchangeOffer.status(n);
        }
        grandExchangeOffer.state &= 0xFFFFFFF8;
        grandExchangeOffer.state |= (byte)(n & 0x7);
    }
    
    public int ax() {
        return ((this.state & 0x8) == 0x8) ? 1 : 0;
    }
    
    public int ay() {
        return ((this.state & 0x8) == 0x8) ? 1 : 0;
    }
    
    public byte tm() {
        return this.state;
    }
    
    public int status(final int n) {
        try {
            return this.state & 0x7;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nb.aw(" + ')');
        }
    }
    
    void am(final int n) {
        this.state &= (byte)(-1817152155);
        if (n == 1) {
            this.state |= 0x8;
        }
    }
    
    public int al() {
        return this.state & 0x7;
    }
    
    public static int method1929(final byte[] array, final int n, final CharSequence charSequence, final int n2) {
        try {
            final int length = charSequence.length();
            int n3 = n;
            for (int i = 0; i < length; ++i) {
                if (n2 != 2076819739) {
                    throw new IllegalStateException();
                }
                final char char1 = charSequence.charAt(i);
                if (char1 <= '\u007f') {
                    if (n2 != 2076819739) {
                        throw new IllegalStateException();
                    }
                    array[n3++] = (byte)char1;
                }
                else if (char1 <= '\u07ff') {
                    if (n2 != 2076819739) {
                        throw new IllegalStateException();
                    }
                    array[n3++] = (byte)(0xC0 | char1 >> 6);
                    array[n3++] = (byte)(0x80 | (char1 & '?'));
                }
                else {
                    array[n3++] = (byte)(0xE0 | char1 >> 12);
                    array[n3++] = (byte)(0x80 | (char1 >> 6 & 0x3F));
                    array[n3++] = (byte)(0x80 | (char1 & '?'));
                }
            }
            return n3 - n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nb.an(" + ')');
        }
    }
    
    void method1929(final Integer n, final int n2) {
    }
    
    public int type(final byte b) {
        try {
            return ((this.state & 0x8) == 0x8) ? 1 : 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nb.ac(" + ')');
        }
    }
    
    void method1928(final int n, final byte b) {
        try {
            this.state &= 0xFFFFFFF8;
            this.state |= (byte)(n & 0x7);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nb.au(" + ')');
        }
    }
    
    public static FillMode[] method1928(final int n) {
        try {
            return new FillMode[] { FillMode.field4120, FillMode.SOLID, FillMode.field4119 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nb.au(" + ')');
        }
    }
    
    void ai(final int n) {
        this.state &= 0xFFFFFFF8;
        this.state |= (byte)(n & 0x7);
    }
    
    public static int ys(final GrandExchangeOffer grandExchangeOffer) {
        return ((grandExchangeOffer.state & 0x8) == 0x8) ? 1 : 0;
    }
    
    public static void hw(final GrandExchangeOffer grandExchangeOffer, final Integer n, final int n2) {
        if (grandExchangeOffer == null) {
            grandExchangeOffer.method1929(n, n2);
        }
    }
    
    public static void method1930(final String[] array, final short[] array2, final int n) {
        try {
            class309.sortItemsByName(array, array2, 0, array.length - 1, 1826563573);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nb.af(" + ')');
        }
    }
    
    void method1927(final int n, final int n2) {
        try {
            this.state &= 0xFFFFFFF7;
            if (n == 1) {
                if (n2 <= 1786853844) {
                    throw new IllegalStateException();
                }
                this.state |= 0x8;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nb.ab(" + ')');
        }
    }
    
    void aq(final Integer n) {
    }
    
    void ag(final int n) {
        this.state &= 0xFFFFFFF7;
        if (n == 1) {
            this.state |= 0x8;
        }
    }
    
    public int getPrice() {
        return this.unitPrice * -1994102707;
    }
    
    public int getItemId() {
        return this.id * -300881317;
    }
    
    public int getSpent() {
        return this.currentPrice * 1510761213;
    }
    
    public int getQuantitySold() {
        return this.currentQuantity * -52036157;
    }
    
    public int getTotalQuantity() {
        return this.totalQuantity * 857042809;
    }
}
