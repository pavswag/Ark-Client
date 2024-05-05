import java.math.BigInteger;

// 
// Decompiled by Procyon v0.5.36
// 

public class Buffer extends Node
{
    public int offset;
    public static final int aq = 30000;
    public byte[] array;
    public static final int ac = 100;
    static int[] crc32Table;
    static long[] crc64Table;
    
    public Buffer(final byte[] array) {
        this.array = array;
        this.offset = 0;
    }
    
    public Buffer(final int n) {
        this.array = AbstractWorldMapData.ByteArrayPool_getArray(n, 1786635610);
        this.offset = 0;
    }
    
    public Buffer(final int n, final boolean b) {
        this.array = ByteArrayPool.ByteArrayPool_getArrayBool(n, b, (byte)10);
    }
    
    static {
        Buffer.crc32Table = new int[256];
        for (int i = 0; i < 256; ++i) {
            int n = i;
            for (int j = 0; j < 8; ++j) {
                if (0x1 == (n & 0x1)) {
                    n = (n >>> 1 ^ 0xEDB88320);
                }
                else {
                    n >>>= 1;
                }
            }
            Buffer.crc32Table[i] = n;
        }
        Buffer.crc64Table = new long[256];
        for (int k = 0; k < 256; ++k) {
            long n2 = k;
            for (int l = 0; l < 8; ++l) {
                if (0x1L == (n2 & 0x1L)) {
                    n2 = (n2 >>> 1 ^ 0xC96C5795D7870F42L);
                }
                else {
                    n2 >>>= 1;
                }
            }
            Buffer.crc64Table[k] = n2;
        }
    }
    
    public void fp(final long n) {
        final byte[] array = this.array;
        final int offset = this.offset + 2018822060;
        this.offset = offset;
        array[offset * 40819295 - 1] = (byte)(n >> 56);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 48);
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1209657897;
        this.offset = offset3;
        array3[offset3 * 976423669 - 1] = (byte)(n >> -233220885);
        final byte[] array4 = this.array;
        final int offset4 = this.offset - 2145156816;
        this.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 32);
        final byte[] array5 = this.array;
        final int offset5 = this.offset - 1516355947;
        this.offset = offset5;
        array5[offset5 * -1633313603 - 1] = (byte)(n >> 24);
        final byte[] array6 = this.array;
        final int offset6 = this.offset - 86674210;
        this.offset = offset6;
        array6[offset6 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array7 = this.array;
        final int offset7 = this.offset - 1667399674;
        this.offset = offset7;
        array7[offset7 * 1335042037 - 1] = (byte)(n >> 8);
        final byte[] array8 = this.array;
        final int offset8 = this.offset - 1516355947;
        this.offset = offset8;
        array8[offset8 * 796851435 - 1] = (byte)n;
    }
    
    public void writeBytes(final byte[] array, final int n, final int n2, final byte b) {
        try {
            for (int i = n; i < n2 + n; ++i) {
                if (b <= 5) {
                    throw new IllegalStateException();
                }
                final byte[] array2 = this.array;
                final int offset = this.offset - 1516355947;
                this.offset = offset;
                array2[offset * -1633313603 - 1] = array[i];
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cs(" + ')');
        }
    }
    
    public static byte writeByteNeg(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.method2531(n);
        }
        try {
            final byte[] array = buffer.array;
            final int offset = buffer.offset - 1516355947;
            buffer.offset = offset;
            return (byte)(array[offset * -1633313603 - 1] - 128);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dd(" + ')');
        }
    }
    
    public void writeByteNeg(final int n, final int n2) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(0 - n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dp(" + ')');
        }
    }
    
    public int method2518(final int n) {
        try {
            this.offset -= 1770456492;
            return ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 16) + ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 24) + ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 8) + (this.array[this.offset * -1633313603 - 4] & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.en(" + ')');
        }
    }
    
    public static int method2518(final Buffer buffer, final byte b) {
        if (buffer == null) {
            buffer.method2520(b);
        }
        try {
            int n = 0;
            int n2;
            for (n2 = buffer.readUShortSmart(-1114398735); 32767 == n2; n2 = buffer.readUShortSmart(-1058220918)) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                n += 32767;
            }
            return n + n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dw(" + ')');
        }
    }
    
    public void writeLengthShort(final int n, final int n2) {
        try {
            if (n >= 0) {
                if (n2 >= -645823490) {
                    throw new IllegalStateException();
                }
                if (n <= 65535) {
                    this.array[-1633313603 * this.offset - n - 2] = (byte)(n >> 8);
                    this.array[-1633313603 * this.offset - n - 1] = (byte)n;
                    return;
                }
                if (n2 >= -645823490) {
                    throw new IllegalStateException();
                }
            }
            throw new IllegalArgumentException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ca(" + ')');
        }
    }
    
    public int readUShortSmart(final int n) {
        try {
            if ((this.array[this.offset * -1633313603] & 0xFF) >= 128) {
                return this.readUnsignedShort(635917395) - 32768;
            }
            if (n >= -45304924) {
                throw new IllegalStateException();
            }
            return ra(this, (byte)7);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cd(" + ')');
        }
    }
    
    public void writeInt(final int n, final int n2) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 24);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 16);
            final byte[] array3 = this.array;
            final int offset3 = this.offset - 1516355947;
            this.offset = offset3;
            array3[offset3 * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array4 = this.array;
            final int offset4 = this.offset - 1516355947;
            this.offset = offset4;
            array4[offset4 * -1633313603 - 1] = (byte)n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ba(" + ')');
        }
    }
    
    public int readMedium(final int n) {
        try {
            this.offset -= 254100545;
            return ((this.array[-1633313603 * this.offset - 2] & 0xFF) << 8) + ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 16) + (this.array[this.offset * -1633313603 - 1] & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cr(" + ')');
        }
    }
    
    public void writeStringCp1252NullCircumfixed(final String s, final int n) {
        try {
            if (s.indexOf(0) >= 0) {
                throw new IllegalArgumentException("");
            }
            this.offset += WorldMapSprite.encodeStringCp1252(s, 0, s.length(), this.array, this.offset * -1633313603, (byte)39) * -1516355947;
            this.array[(this.offset -= 1516355947) * -1633313603 - 1] = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.bh(" + ')');
        }
    }
    
    public float method2487(final int n) {
        try {
            return Float.intBitsToFloat(this.readSignedShortAddLE(-2077887374));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cb(" + ')');
        }
    }
    
    public int readUnsignedShortAddLE(final int n) {
        try {
            this.offset += 1262255402;
            return ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 8) + (this.array[-1633313603 * this.offset - 2] & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.da(" + ')');
        }
    }
    
    public void to(final byte[] array, final int n, final int n2) {
        io(this, array, n, n2, -1570744551);
    }
    
    public String readCESU8(final int n) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            if (0 != array[offset * -1633313603 - 1]) {
                if (n <= 753243764) {
                    throw new IllegalStateException();
                }
                throw new IllegalStateException("");
            }
            else {
                final int signedShortAddLE = this.readSignedShortAddLE(-1171795391);
                if (signedShortAddLE + this.offset * -1633313603 <= this.array.length) {
                    final byte[] array2 = this.array;
                    final int n2 = this.offset * -1633313603;
                    final char[] value = new char[signedShortAddLE];
                    int count = 0;
                    int i = n2;
                    final int n3 = n2 + signedShortAddLE;
                    while (i < n3) {
                        if (n <= 753243764) {
                            throw new IllegalStateException();
                        }
                        final int n4 = array2[i++] & 0xFF;
                        int n5 = 0;
                        Label_0234: {
                            if (n4 < 128) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                if (n4 == 0) {
                                    if (n <= 753243764) {
                                        throw new IllegalStateException();
                                    }
                                    n5 = 65533;
                                }
                                else {
                                    n5 = n4;
                                }
                            }
                            else if (n4 < 192) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                n5 = 65533;
                            }
                            else if (n4 < 224) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                if (i < n3 && 0x80 == (array2[i] & 0xC0)) {
                                    n5 = ((n4 & 0x1F) << 6 | (array2[i++] & 0x3F));
                                    if (n5 < 128) {
                                        if (n <= 753243764) {
                                            throw new IllegalStateException();
                                        }
                                        n5 = 65533;
                                    }
                                }
                                else {
                                    n5 = 65533;
                                }
                            }
                            else if (n4 < 240) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                if (1 + i < n3) {
                                    if (n <= 753243764) {
                                        throw new IllegalStateException();
                                    }
                                    if ((array2[i] & 0xC0) == 0x80) {
                                        if (n <= 753243764) {
                                            throw new IllegalStateException();
                                        }
                                        if (0x80 == (array2[i + 1] & 0xC0)) {
                                            if (n <= 753243764) {
                                                throw new IllegalStateException();
                                            }
                                            n5 = ((n4 & 0xF) << 12 | (array2[i++] & 0x3F) << 6 | (array2[i++] & 0x3F));
                                            if (n5 >= 2048) {
                                                break Label_0234;
                                            }
                                            if (n <= 753243764) {
                                                throw new IllegalStateException();
                                            }
                                            n5 = 65533;
                                            break Label_0234;
                                        }
                                    }
                                }
                                n5 = 65533;
                            }
                            else if (n4 < 248) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                if (2 + i < n3) {
                                    if (n <= 753243764) {
                                        throw new IllegalStateException();
                                    }
                                    if ((array2[i] & 0xC0) == 0x80) {
                                        if (n <= 753243764) {
                                            throw new IllegalStateException();
                                        }
                                        if (0x80 == (array2[i + 1] & 0xC0)) {
                                            if (n <= 753243764) {
                                                throw new IllegalStateException();
                                            }
                                            if (0x80 == (array2[i + 2] & 0xC0)) {
                                                final int n6 = (n4 & 0x7) << 18 | (array2[i++] & 0x3F) << 12 | (array2[i++] & 0x3F) << 6 | (array2[i++] & 0x3F);
                                                if (n6 >= 65536) {
                                                    if (n <= 753243764) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (n6 <= 1114111) {
                                                        n5 = 65533;
                                                        break Label_0234;
                                                    }
                                                    if (n <= 753243764) {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                                n5 = 65533;
                                                break Label_0234;
                                            }
                                        }
                                    }
                                }
                                n5 = 65533;
                            }
                            else {
                                n5 = 65533;
                            }
                        }
                        value[count++] = (char)n5;
                    }
                    final String s = new String(value, 0, count);
                    this.offset += -1516355947 * signedShortAddLE;
                    return s;
                }
                if (n <= 753243764) {
                    throw new IllegalStateException();
                }
                throw new IllegalStateException("");
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ch(" + ')');
        }
    }
    
    public void writeIntLE(final int n, final int n2) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 16);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 24);
            final byte[] array3 = this.array;
            final int offset3 = this.offset - 1516355947;
            this.offset = offset3;
            array3[offset3 * -1633313603 - 1] = (byte)n;
            final byte[] array4 = this.array;
            final int offset4 = this.offset - 1516355947;
            this.offset = offset4;
            array4[offset4 * -1633313603 - 1] = (byte)(n >> 8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.el(" + ')');
        }
    }
    
    public int readUnsignedShort(final int n) {
        try {
            this.offset += 1262255402;
            return (this.array[this.offset * -1633313603 - 1] & 0xFF) + ((this.array[-1633313603 * this.offset - 2] & 0xFF) << 8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cl(" + ')');
        }
    }
    
    public void writeLengthInt(final int n, final int n2) {
        try {
            if (n < 0) {
                throw new IllegalArgumentException();
            }
            this.array[-1633313603 * this.offset - n - 4] = (byte)(n >> 24);
            this.array[-1633313603 * this.offset - n - 3] = (byte)(n >> 16);
            this.array[-1633313603 * this.offset - n - 2] = (byte)(n >> 8);
            this.array[this.offset * -1633313603 - n - 1] = (byte)n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cn(" + ')');
        }
    }
    
    public static int rd(final Buffer buffer) {
        if (buffer == null) {
            buffer.kz();
        }
        int n = 0;
        int n2 = 0;
        int i;
        do {
            i = ra(buffer, (byte)7);
            n |= (i & 0x7F) << n2;
            n2 += 7;
        } while (i > 127);
        return n;
    }
    
    public int id() {
        if (this.array[-1633313603 * this.offset] < 0) {
            return this.readInt(-1607763808) & Integer.MAX_VALUE;
        }
        return this.readUnsignedShort(-1978850873);
    }
    
    public int rb() {
        return this.readShortSmart(1391642638);
    }
    
    public int pp() {
        return this.readUnsignedShort(-697993691);
    }
    
    public int readUnsignedByteNeg(final byte b) {
        try {
            this.offset -= 1770456492;
            return (this.array[-1633313603 * this.offset - 2] & 0xFF) + (((this.array[this.offset * -1633313603 - 4] & 0xFF) << 16) + ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 24) + ((this.array[this.offset * -1633313603 - 1] & 0xFF) << 8));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.eg(" + ')');
        }
    }
    
    public int method2541(final int n) {
        try {
            if (this.array[-1633313603 * this.offset] >= 0) {
                return this.readUnsignedShort(-1645502044);
            }
            if (n <= -109318245) {
                throw new IllegalStateException();
            }
            return this.readInt(-2082398963) & Integer.MAX_VALUE;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dc(" + ')');
        }
    }
    
    public int me() {
        this.offset -= 1770456492;
        return (this.array[-1633313603 * this.offset - 2] & 0xFF) + (((this.array[this.offset * -1633313603 - 4] & 0xFF) << 16) + ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 24) + ((this.array[this.offset * -1633313603 - 1] & 0xFF) << 8));
    }
    
    public int it() {
        if (this.array[this.offset * -1633313603] < 0) {
            return this.readInt(-1244019607) & 0x38084AA6;
        }
        final int unsignedShort = this.readUnsignedShort(-1287920133);
        if (32767 == unsignedShort) {
            return -1;
        }
        return unsignedShort;
    }
    
    public int lf() {
        this.offset += 456416395;
        int n = (this.array[-1633313603 * this.offset - 1] - 128 & 0xFF) + ((this.array[this.offset * -1633313603 - 2] & 0x1540E02A) << 8);
        if (n > 32767) {
            n -= 690112296;
        }
        return n;
    }
    
    public static int lf(final Buffer buffer) {
        if (buffer == null) {
            buffer.hf();
        }
        buffer.offset += 1262255402;
        return ((buffer.array[-1633313603 * buffer.offset - 2] & 0xFF) << 8) + (buffer.array[buffer.offset * -1633313603 - 1] - 128 & 0xFF);
    }
    
    public byte readByte(final int n) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            return array[offset * -1633313603 - 1];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cf(" + ')');
        }
    }
    
    public void writeIntME(final int n, final byte b) {
        try {
            if (n >= 0) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                if (n < 128) {
                    if (b == 0) {
                        throw new IllegalStateException();
                    }
                    this.writeShort(n, (byte)100);
                    return;
                }
            }
            if (n >= 0) {
                if (b == 0) {
                    throw new IllegalStateException();
                }
                if (n < 32768) {
                    this.writeVarInt(32768 + n, (byte)29);
                    return;
                }
            }
            throw new IllegalArgumentException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ck(" + ')');
        }
    }
    
    public String readStringCp1252NullTerminated(final byte b) {
        try {
            final int n = this.offset * -1633313603;
            do {
                final byte[] array = this.array;
                final int offset = this.offset - 1516355947;
                this.offset = offset;
                if (array[offset * -1633313603 - 1] != 0) {
                    continue;
                }
                final int n2 = -1633313603 * this.offset - n - 1;
                if (n2 != 0) {
                    return decodeStringCp1252(this.array, n, n2, 1427711862);
                }
                if (b != 0) {
                    throw new IllegalStateException();
                }
                return "";
            } while (b == 0);
            throw new IllegalStateException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cw(" + ')');
        }
    }
    
    public long readLong(final byte b) {
        try {
            return (((long)this.readInt(-1103529613) & 0xFFFFFFFFL) << 32) + ((long)this.method2516(-1363164440) & 0xFFFFFFFFL);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cv(" + ')');
        }
    }
    
    public static void ma(final Buffer buffer, final int n) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)n;
        final byte[] array2 = buffer.array;
        final int offset2 = buffer.offset - 1516355947;
        buffer.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array3 = buffer.array;
        final int offset3 = buffer.offset - 1516355947;
        buffer.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array4 = buffer.array;
        final int offset4 = buffer.offset - 1516355947;
        buffer.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 24);
    }
    
    public void mt(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1427095488;
        this.offset = offset2;
        array2[offset2 * 1606292297 - 1] = (byte)(n >> 24);
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1516355947;
        this.offset = offset3;
        array3[offset3 * -1399203235 - 1] = (byte)n;
        final byte[] array4 = this.array;
        final int offset4 = this.offset + 1656765419;
        this.offset = offset4;
        array4[offset4 * -938096318 - 1] = (byte)(n >> 8);
    }
    
    public void ft(final Buffer buffer) {
        this.writeBytes(buffer.array, 0, buffer.offset * 930677495, (byte)76);
    }
    
    public int method2529(final byte b) {
        try {
            this.offset -= 254100545;
            int n = (this.array[this.offset * -1633313603 - 1] & 0xFF) + (((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8) + ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 16));
            if (n > 8388607) {
                if (b != 3) {
                    throw new IllegalStateException();
                }
                n -= 16777216;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cy(" + ')');
        }
    }
    
    public String readStringCp1252NullCircumfixed(final short n) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            if (array[offset * -1633313603 - 1] == 0) {
                final int n2 = -1633313603 * this.offset;
                do {
                    final byte[] array2 = this.array;
                    final int offset2 = this.offset - 1516355947;
                    this.offset = offset2;
                    if (array2[offset2 * -1633313603 - 1] != 0) {
                        continue;
                    }
                    final int n3 = this.offset * -1633313603 - n2 - 1;
                    if (n3 == 0) {
                        return "";
                    }
                    return decodeStringCp1252(this.array, n2, n3, 548759659);
                } while (n < 218);
                throw new IllegalStateException();
            }
            if (n >= 218) {
                throw new IllegalStateException();
            }
            throw new IllegalStateException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cj(" + ')');
        }
    }
    
    public int nr() {
        return this.readUnsignedByte((byte)(-12));
    }
    
    public int is() {
        if ((this.array[this.offset * 1401294553] & 0xA3954E39) < 128) {
            return ra(this, (byte)7) + 1349812172;
        }
        return this.readUnsignedShort(55431480) - 433391393;
    }
    
    public void jv(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset + 152497148;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array2 = this.array;
        final int offset2 = this.offset + 2107677631;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1516355947;
        this.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)n;
    }
    
    public int readShortSmart(final int n) {
        try {
            if ((this.array[this.offset * -1633313603] & 0xFF) >= 128) {
                return this.readUnsignedShort(-784417139) - 49152;
            }
            if (n <= 1098597678) {
                throw new IllegalStateException();
            }
            return ra(this, (byte)7) - 64;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cp(" + ')');
        }
    }
    
    public static int ts(final Buffer buffer) {
        if (buffer == null) {
            buffer.ko();
        }
        buffer.offset += 1262255402;
        int n = ((buffer.array[-1633313603 * buffer.offset - 1] & 0xFF) << 8) + (buffer.array[-1633313603 * buffer.offset - 2] - 128 & 0xFF);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public void ek(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n + 128);
    }
    
    public void fk(final Buffer buffer) {
        this.writeBytes(buffer.array, 0, buffer.offset * -1633313603, (byte)115);
    }
    
    public static int fv(final String s) {
        return s.length() + 2;
    }
    
    public void fh(final long n) {
        final byte[] array = this.array;
        final int offset = this.offset - 267704712;
        this.offset = offset;
        array[offset * -1022103687 - 1] = (byte)(n >> -1678118969);
        final byte[] array2 = this.array;
        final int offset2 = this.offset + 741147914;
        this.offset = offset2;
        array2[offset2 * -653195343 - 1] = (byte)(n >> 32);
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1516355947;
        this.offset = offset3;
        array3[offset3 * 1219457323 - 1] = (byte)(n >> 24);
        final byte[] array4 = this.array;
        final int offset4 = this.offset - 1516355947;
        this.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array5 = this.array;
        final int offset5 = this.offset - 1516355947;
        this.offset = offset5;
        array5[offset5 * -1157945034 - 1] = (byte)(n >> 8);
        final byte[] array6 = this.array;
        final int offset6 = this.offset - 1585703115;
        this.offset = offset6;
        array6[offset6 * -755720052 - 1] = (byte)n;
    }
    
    static int ev(final byte[] array, final int n, final int n2) {
        int n3 = -1;
        for (int i = n; i < n2; ++i) {
            n3 = (n3 >>> 8 ^ Buffer.crc32Table[(n3 ^ array[i]) & 0x9AB2CFA2]);
        }
        return ~n3;
    }
    
    public int ev() {
        return this.readInt(-1694820613);
    }
    
    public static void ks(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.jn(n);
        }
        if (n >= 0 && n <= 65535) {
            buffer.array[-1633313603 * buffer.offset - n - 2] = (byte)(n >> 8);
            buffer.array[-1633313603 * buffer.offset - n - 1] = (byte)n;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static long ks(final Buffer buffer, final byte b) {
        if (buffer == null) {
            buffer.readLong(b);
        }
        try {
            return (((long)buffer.readInt(-1103529613) & 0xFFFFFFFFL) << 32) + ((long)buffer.readInt(-1363164440) & 0xFFFFFFFFL);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cv(" + ')');
        }
    }
    
    public int ks() {
        this.offset += 1262255402;
        return ((this.array[-1633313603 * this.offset - 2] & 0xFF) << 8) + (this.array[this.offset * -1633313603 - 1] - 128 & 0xFF);
    }
    
    public void writeIntIME(final int n, final int n2) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)n;
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array3 = this.array;
            final int offset3 = this.offset - 1516355947;
            this.offset = offset3;
            array3[offset3 * -1633313603 - 1] = (byte)(n >> 16);
            final byte[] array4 = this.array;
            final int offset4 = this.offset - 1516355947;
            this.offset = offset4;
            array4[offset4 * -1633313603 - 1] = (byte)(n >> 24);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.es(" + ')');
        }
    }
    
    public int mv() {
        this.offset -= 1770456492;
        return (this.array[-1633313603 * this.offset - 2] & 0xFF) + (((this.array[this.offset * -1633313603 - 4] & 0xFF) << 16) + ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 24) + ((this.array[this.offset * -1633313603 - 1] & 0xFF) << 8));
    }
    
    public int hd() {
        this.offset += 1262255402;
        int n = (this.array[this.offset * -1305205573 - 1] & 0xC7720E78) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8);
        if (n > -1324726809) {
            n -= 1338536454;
        }
        return n;
    }
    
    public int hn() {
        this.offset -= 254100545;
        int n = (this.array[this.offset * -1633313603 - 1] & 0xFF) + (((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8) + ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 16));
        if (n > 8388607) {
            n -= 16777216;
        }
        return n;
    }
    
    public byte hi() {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return array[offset * -1633313603 - 1];
    }
    
    public int lc() {
        this.offset -= 254100545;
        return ((this.array[-1633313603 * this.offset - 2] & 0xFF) << 8) + ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 16) + (this.array[-1633313603 * this.offset - 3] & 0xFF);
    }
    
    public int method2533(final byte b) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            return array[offset * -1633313603 - 1] - 128 & 0xFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.db(" + ')');
        }
    }
    
    public void ee(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(128 - n);
    }
    
    public void lt(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 24);
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1516355947;
        this.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)n;
        final byte[] array4 = this.array;
        final int offset4 = this.offset - 1516355947;
        this.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 8);
    }
    
    public static void ax(final Buffer buffer, final int n) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array2 = buffer.array;
        final int offset2 = buffer.offset - 1516355947;
        buffer.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)n;
        final byte[] array3 = buffer.array;
        final int offset3 = buffer.offset - 1516355947;
        buffer.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)(n >> 24);
        final byte[] array4 = buffer.array;
        final int offset4 = buffer.offset - 1516355947;
        buffer.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 16);
    }
    
    public void xteaEncrypt(final int[] array, final int n, final int n2, final int n3) {
        try {
            final int n4 = -1633313603 * this.offset;
            this.offset = n * -1516355947;
            for (int n5 = (n2 - n) / 8, i = 0; i < n5; ++i) {
                int int1 = this.readInt(-1982655842);
                int int2 = this.readInt(-931823345);
                int n6 = 0;
                final int n7 = -1640531527;
                int n8 = 32;
                while (n8-- > 0) {
                    if (n3 >= 998834361) {
                        return;
                    }
                    int1 += ((int2 << 4 ^ int2 >>> 5) + int2 ^ n6 + array[n6 & 0x3]);
                    n6 += n7;
                    int2 += ((int1 << 4 ^ int1 >>> 5) + int1 ^ array[n6 >>> 11 & 0x3] + n6);
                }
                this.offset -= 754054312;
                this.writeInt(int1, -2081835031);
                this.writeInt(int2, -2081835031);
            }
            this.offset = -1516355947 * n4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dt(" + ')');
        }
    }
    
    public static void tn(final Buffer buffer, final boolean b) {
        if (buffer == null) {
            buffer.lu();
        }
        buffer.writeShort(b ? 1 : 0, (byte)93);
    }
    
    public static int tn(final Buffer buffer, final int n) {
        if (buffer == null) {
            return buffer.readSignedShortAdd(n);
        }
        try {
            buffer.offset += 1262255402;
            int n2 = (buffer.array[-1633313603 * buffer.offset - 1] - 128 & 0xFF) + ((buffer.array[buffer.offset * -1633313603 - 2] & 0xFF) << 8);
            if (n2 > 32767) {
                if (n == -997181501) {
                    throw new IllegalStateException();
                }
                n2 -= 65536;
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.et(" + ')');
        }
    }
    
    public void writeLongMedium(final long n) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 40);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 32);
            final byte[] array3 = this.array;
            final int offset3 = this.offset - 1516355947;
            this.offset = offset3;
            array3[offset3 * -1633313603 - 1] = (byte)(n >> 24);
            final byte[] array4 = this.array;
            final int offset4 = this.offset - 1516355947;
            this.offset = offset4;
            array4[offset4 * -1633313603 - 1] = (byte)(n >> 16);
            final byte[] array5 = this.array;
            final int offset5 = this.offset - 1516355947;
            this.offset = offset5;
            array5[offset5 * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array6 = this.array;
            final int offset6 = this.offset - 1516355947;
            this.offset = offset6;
            array6[offset6 * -1633313603 - 1] = (byte)n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.bv(" + ')');
        }
    }
    
    public void fc(final String s) {
        if (s.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.array[(this.offset -= 1691682651) * -1633313603 - 1] = 0;
        this.offset += WorldMapSprite.encodeStringCp1252(s, 0, s.length(), this.array, 1323956263 * this.offset, (byte)15) * 1234871530;
        this.array[(this.offset -= 1516355947) * -1053116184 - 1] = 0;
    }
    
    public void xteaEncryptAll(final int[] array, final int n) {
        try {
            final int n2 = this.offset * -1633313603 / 8;
            this.offset = 0;
            for (int i = 0; i < n2; ++i) {
                if (n != -794961409) {
                    throw new IllegalStateException();
                }
                int int1 = this.readInt(-1343494358);
                int int2 = this.readInt(-1586992596);
                int n3 = 0;
                final int n4 = -1640531527;
                int n5 = 32;
                while (n5-- > 0) {
                    int1 += ((int2 << 4 ^ int2 >>> 5) + int2 ^ n3 + array[n3 & 0x3]);
                    n3 += n4;
                    int2 += (int1 + (int1 << 4 ^ int1 >>> 5) ^ n3 + array[n3 >>> 11 & 0x3]);
                }
                this.offset -= 754054312;
                this.writeInt(int1, -2081835031);
                this.writeInt(int2, -2081835031);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dl(" + ')');
        }
    }
    
    public void writeSmartByteShort(final int n, final byte b) {
        try {
            if (0x0 != (n & 0xFFFFFF80)) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                if ((n & 0xFFFFC000) != 0x0) {
                    if (0x0 != (n & 0xFFE00000)) {
                        if ((n & 0xF0000000) != 0x0) {
                            if (b <= 0) {
                                throw new IllegalStateException();
                            }
                            this.writeShort(n >>> 28 | 0x80, (byte)26);
                        }
                        this.writeShort(n >>> 21 | 0x80, (byte)101);
                    }
                    this.writeShort(n >>> 14 | 0x80, (byte)18);
                }
                this.writeShort(n >>> 7 | 0x80, (byte)11);
            }
            this.writeShort(n & 0x7F, (byte)121);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cq(" + ')');
        }
    }
    
    public float hb() {
        return Float.intBitsToFloat(this.readInt(-1606470972));
    }
    
    public int readVarInt(final int n) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            byte b = array[offset * -1633313603 - 1];
            int n2 = 0;
            while (b < 0) {
                n2 = (n2 | (b & 0x7F)) << 7;
                final byte[] array2 = this.array;
                final int offset2 = this.offset - 1516355947;
                this.offset = offset2;
                b = array2[offset2 * -1633313603 - 1];
            }
            return n2 | b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.di(" + ')');
        }
    }
    
    public static int ti(final Buffer buffer) {
        if ((buffer.array[buffer.offset * -1633313603] & 0xFF) < 128) {
            return ra(buffer, (byte)7) - 64;
        }
        return buffer.readUnsignedShort(-87758888) - 49152;
    }
    
    public void fs(final long n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 40);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -2136570688 - 1] = (byte)(n >> 32);
        final byte[] array3 = this.array;
        final int offset3 = this.offset + 99451184;
        this.offset = offset3;
        array3[offset3 * 841881916 - 1] = (byte)(n >> 24);
        final byte[] array4 = this.array;
        final int offset4 = this.offset + 44314116;
        this.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array5 = this.array;
        final int offset5 = this.offset + 1911189774;
        this.offset = offset5;
        array5[offset5 * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array6 = this.array;
        final int offset6 = this.offset + 1328548678;
        this.offset = offset6;
        array6[offset6 * -1395339434 - 1] = (byte)n;
    }
    
    public static void ru(final Buffer buffer, final CharSequence charSequence, final byte b) {
        if (buffer == null) {
            buffer.writeCESU8(charSequence, b);
            return;
        }
        try {
            final int method956 = class173.method956(charSequence, -955607746);
            buffer.array[(buffer.offset -= 1516355947) * -1633313603 - 1] = 0;
            buffer.writeSmartByteShort(method956, (byte)67);
            buffer.offset += GrandExchangeOffer.method1929(buffer.array, -1633313603 * buffer.offset, charSequence, 2076819739) * -1516355947;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ci(" + ')');
        }
    }
    
    public static void writeBoolean(final Buffer buffer) {
        if (null != buffer.array) {
            InterfaceParent.ByteArrayPool_release(buffer.array, (byte)27);
        }
        buffer.array = null;
    }
    
    public void writeBoolean(final boolean b, final int n) {
        try {
            int n2;
            if (b) {
                if (n != 614283261) {
                    return;
                }
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            this.writeShort(n2, (byte)4);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.bp(" + ')');
        }
    }
    
    public static int or(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.readUnsignedShortAdd(n);
        }
        try {
            buffer.offset += 1262255402;
            return ((buffer.array[-1633313603 * buffer.offset - 2] & 0xFF) << 8) + (buffer.array[buffer.offset * -1633313603 - 1] - 128 & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ep(" + ')');
        }
    }
    
    public static int or(final Buffer buffer) {
        if (buffer == null) {
            return buffer.lf();
        }
        buffer.offset += 1671829279;
        return ((buffer.array[-1633313603 * buffer.offset - 2] & 0xFF) << 8) + ((buffer.array[buffer.offset * -1633313603 - 3] & 0xFF) << 16) + (buffer.array[buffer.offset * -1633313603 - 1] & 0x22728767);
    }
    
    public int ie() {
        if ((this.array[this.offset * -682678719] & 0xFF) < 128) {
            return ra(this, (byte)7);
        }
        return this.readUnsignedShort(-1877010610) + 1964603060;
    }
    
    public void readBytes(final byte[] array, final int n, final int n2, final int n3) {
        try {
            for (int i = n; i < n + n2; ++i) {
                if (n3 != -1570744551) {
                    throw new IllegalStateException();
                }
                final int n4 = i;
                final byte[] array2 = this.array;
                final int offset = this.offset - 1516355947;
                this.offset = offset;
                array[n4] = array2[offset * -1633313603 - 1];
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ct(" + ')');
        }
    }
    
    public void method2476(final Buffer buffer, final int n) {
        try {
            this.writeBytes(buffer.array, 0, buffer.offset * -1633313603, (byte)36);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cc(" + ')');
        }
    }
    
    public void xteaDecrypt(final int[] array, final int n, final int n2, final int n3) {
        try {
            final int n4 = -1633313603 * this.offset;
            this.offset = -1516355947 * n;
            for (int n5 = (n2 - n) / 8, i = 0; i < n5; ++i) {
                if (n3 != -1350839672) {
                    return;
                }
                int int1 = this.readInt(-1602943376);
                int int2 = this.readInt(-1275087685);
                int n6 = -957401312;
                final int n7 = -1640531527;
                int n8 = 32;
                while (n8-- > 0) {
                    if (n3 != -1350839672) {
                        throw new IllegalStateException();
                    }
                    int2 -= (int1 + (int1 << 4 ^ int1 >>> 5) ^ n6 + array[n6 >>> 11 & 0x3]);
                    n6 -= n7;
                    int1 -= ((int2 << 4 ^ int2 >>> 5) + int2 ^ array[n6 & 0x3] + n6);
                }
                this.offset -= 754054312;
                this.writeInt(int1, -2081835031);
                this.writeInt(int2, -2081835031);
            }
            this.offset = -1516355947 * n4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dv(" + ')');
        }
    }
    
    public static int fn(final String s) {
        return s.length() + 1;
    }
    
    public boolean ha() {
        return (ra(this, (byte)7) & 0x1) == 0x1;
    }
    
    public void writeShortAdd(final int n, final int n2) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n + 128);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ds(" + ')');
        }
    }
    
    public void ih(final byte[] array, final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final int n3 = i;
            final byte[] array2 = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[n3] = array2[offset * -1633313603 - 1];
        }
    }
    
    public static void yl(final Buffer buffer, final int[] array) {
        final int n = buffer.offset * -1633313603 / 8;
        buffer.offset = 0;
        for (int i = 0; i < n; ++i) {
            int int1 = buffer.readInt(-2091641163);
            int int2 = buffer.readInt(-886400054);
            int n2 = 0;
            final int n3 = -1640531527;
            int n4 = 32;
            while (n4-- > 0) {
                int1 += ((int2 << 4 ^ int2 >>> 5) + int2 ^ n2 + array[n2 & 0x3]);
                n2 += n3;
                int2 += (int1 + (int1 << 4 ^ int1 >>> 5) ^ n2 + array[n2 >>> 11 & 0x3]);
            }
            buffer.offset -= 754054312;
            buffer.writeInt(int1, -2081835031);
            buffer.writeInt(int2, -2081835031);
        }
    }
    
    public void method2500(final int n, final byte b) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n + 128);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dy(" + ')');
        }
    }
    
    public void xm(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n + 128);
    }
    
    public String ia() {
        final int n = this.offset * -1633313603;
        byte[] array;
        int offset;
        do {
            array = this.array;
            offset = this.offset - 768596379;
            this.offset = offset;
        } while (array[offset * -1633313603 - 1] != 0);
        final int n2 = -1633313603 * this.offset - n - 1;
        if (n2 == 0) {
            return "";
        }
        return decodeStringCp1252(this.array, n, n2, 2056493641);
    }
    
    public void ei(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)n;
    }
    
    public static int tz(final Buffer buffer) {
        if (buffer == null) {
            buffer.ie();
        }
        buffer.offset += 1262255402;
        int n = ((buffer.array[-1633313603 * buffer.offset - 1] & 0xFF) << 8) + (buffer.array[-1633313603 * buffer.offset - 2] - 128 & 0xFF);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public void writeCESU8(final CharSequence charSequence, final byte b) {
        try {
            final int method956 = class173.method956(charSequence, -955607746);
            this.array[(this.offset -= 1516355947) * -1633313603 - 1] = 0;
            this.writeShortAddLE(method956, (byte)67);
            this.offset += GrandExchangeOffer.method1929(this.array, -1633313603 * this.offset, charSequence, 2076819739) * -1516355947;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ci(" + ')');
        }
    }
    
    public void ja(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        this.array[408510746 * this.offset - n - 4] = (byte)(n >> 24);
        this.array[-1633313603 * this.offset - n - 3] = (byte)(n >> 16);
        this.array[-1633313603 * this.offset - n - 2] = (byte)(n >> 8);
        this.array[this.offset * -1633313603 - n - 1] = (byte)n;
    }
    
    public int mm() {
        this.offset -= 388985199;
        return ((this.array[this.offset * -1633313603 - 2] & 0x3DCCB7CE) << 16) + ((this.array[1026846011 * this.offset - 1] & 0x51006D87) << 24) + ((this.array[this.offset * -1493154514 - 3] & 0xFF) << 8) + (this.array[this.offset * 611260798 - 4] & 0xFF);
    }
    
    static int em(final byte[] array, final int n, final int n2) {
        int n3 = -1;
        for (int i = n; i < n2; ++i) {
            n3 = (n3 >>> 8 ^ Buffer.crc32Table[(n3 ^ array[i]) & 0xFF]);
        }
        return ~n3;
    }
    
    public int _readUnsignedByteSub(final int n) {
        try {
            final byte b = 0;
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            return b - array[offset * -1633313603 - 1] & 0xFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.df(" + ')');
        }
    }
    
    public int readSignedShortAdd(final int n) {
        try {
            this.offset += 1262255402;
            int n2 = (this.array[-1633313603 * this.offset - 1] - 128 & 0xFF) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8);
            if (n2 > 32767) {
                if (n == -997181501) {
                    throw new IllegalStateException();
                }
                n2 -= 65536;
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.et(" + ')');
        }
    }
    
    public void method2479(final int n, final int n2) {
        try {
            if (n >= 0 && n <= 255) {
                this.array[-1633313603 * this.offset - n - 1] = (byte)n;
                return;
            }
            throw new IllegalArgumentException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cu(" + ')');
        }
    }
    
    public int lk() {
        this.offset += 495423935;
        int n = (this.array[2144201089 * this.offset - 1] - 128 & 0x8DE3905C) + ((this.array[this.offset * -70142717 - 2] & 0xFF) << 8);
        if (n > 32767) {
            n -= 1514477379;
        }
        return n;
    }
    
    public int km() {
        this.offset += 1262255402;
        return ((this.array[this.offset * 264819280 - 1] & 0x2EDFEEA5) << 8) + (this.array[1662341004 * this.offset - 2] + 1559044548 & 0xFF);
    }
    
    public int method2491(final int n) {
        try {
            if ((this.array[-1633313603 * this.offset] & 0xFF) >= 128) {
                return this.readUnsignedShort(-185942187) - 32769;
            }
            if (n == 427135973) {
                throw new IllegalStateException();
            }
            return ra(this, (byte)7) - 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dm(" + ')');
        }
    }
    
    public int hx() {
        this.offset += 1671310354;
        int n = (this.array[this.offset * -501561725 - 1] & 0xFF) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8);
        if (n > 32767) {
            n += 1685490324;
        }
        return n;
    }
    
    public int hr() {
        this.offset -= 1770456492;
        return ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 16) + ((this.array[-1633313603 * this.offset - 4] & 0xFF) << 24) + ((this.array[-1633313603 * this.offset - 2] & 0xFF) << 8) + (this.array[-1633313603 * this.offset - 1] & 0xFF);
    }
    
    public void je(final int[] array, final int n, final int n2) {
        final int n3 = -1633313603 * this.offset;
        this.offset = -1516355947 * n;
        for (int n4 = (n2 - n) / 8, i = 0; i < n4; ++i) {
            int uShortSmart = this.readUShortSmart(-1122571259);
            int method2516 = this.method2516(-1597894107);
            int n5 = -957401312;
            final int n6 = -1640531527;
            int n7 = 32;
            while (n7-- > 0) {
                method2516 -= (uShortSmart + (uShortSmart << 4 ^ uShortSmart >>> 5) ^ n5 + array[n5 >>> 11 & 0x3]);
                n5 -= n6;
                uShortSmart -= ((method2516 << 4 ^ method2516 >>> 5) + method2516 ^ array[n5 & 0x3] + n5);
            }
            this.offset -= 754054312;
            this.method2511(uShortSmart, -2081835031);
            this.writeInt(method2516, -2081835031);
        }
        this.offset = -1516355947 * n3;
    }
    
    public static void io(final Buffer buffer, final byte[] array, final int n, final int n2, final int n3) {
        if (buffer == null) {
            buffer.readBytes(array, n, n, n);
            return;
        }
        try {
            for (int i = n; i < n + n2; ++i) {
                if (n3 != -1570744551) {
                    throw new IllegalStateException();
                }
                final int n4 = i;
                final byte[] array2 = buffer.array;
                final int offset = buffer.offset - 1516355947;
                buffer.offset = offset;
                array[n4] = array2[offset * -1633313603 - 1];
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ct(" + ')');
        }
    }
    
    public int io() {
        if ((this.array[-1633313603 * this.offset] & 0xFF) < 128) {
            return ra(this, (byte)7) - 1;
        }
        return this.readUnsignedShort(-765828365) - 32769;
    }
    
    public static int zc(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.readUnsignedShortLE(n);
        }
        try {
            buffer.offset += 1262255402;
            return ((buffer.array[buffer.offset * -1633313603 - 1] & 0xFF) << 8) + (buffer.array[-1633313603 * buffer.offset - 2] - 128 & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.eo(" + ')');
        }
    }
    
    public void lx(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)n;
    }
    
    public int readInt(final int n) {
        try {
            this.offset -= 1770456492;
            return ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 16) + ((this.array[-1633313603 * this.offset - 4] & 0xFF) << 24) + ((this.array[-1633313603 * this.offset - 2] & 0xFF) << 8) + (this.array[-1633313603 * this.offset - 1] & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cx(" + ')');
        }
    }
    
    public void lb(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset + 1619293179;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * 826468725 - 1] = (byte)n;
    }
    
    public void ec(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)n;
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
    }
    
    public static void ls(final Buffer buffer, final long n) {
        if (buffer == null) {
            buffer.km();
        }
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 56);
        final byte[] array2 = buffer.array;
        final int offset2 = buffer.offset - 1516355947;
        buffer.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 48);
        final byte[] array3 = buffer.array;
        final int offset3 = buffer.offset - 1516355947;
        buffer.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)(n >> 40);
        final byte[] array4 = buffer.array;
        final int offset4 = buffer.offset - 1516355947;
        buffer.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 32);
        final byte[] array5 = buffer.array;
        final int offset5 = buffer.offset - 1516355947;
        buffer.offset = offset5;
        array5[offset5 * -1633313603 - 1] = (byte)(n >> 24);
        final byte[] array6 = buffer.array;
        final int offset6 = buffer.offset - 1516355947;
        buffer.offset = offset6;
        array6[offset6 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array7 = buffer.array;
        final int offset7 = buffer.offset - 1516355947;
        buffer.offset = offset7;
        array7[offset7 * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array8 = buffer.array;
        final int offset8 = buffer.offset - 1516355947;
        buffer.offset = offset8;
        array8[offset8 * -1633313603 - 1] = (byte)n;
    }
    
    public int ls() {
        this.offset += 1262255402;
        int n = (this.array[-1633313603 * this.offset - 1] - 128 & 0xFF) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public int ll() {
        this.offset -= 176731007;
        int n = ((this.array[-1633313603 * this.offset - 1] & 0xD64390D3) << 16) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8) + (this.array[-658948704 * this.offset - 3] & 0xAB89DE39);
        if (n > -1313494335) {
            n -= 1994819657;
        }
        return n;
    }
    
    public int mq() {
        this.offset -= 1770456492;
        return ((this.array[this.offset * -432894763 - 2] & 0xFF) << 16) + ((this.array[-1633313603 * this.offset - 1] & 0xA04C5131) << 24) + ((this.array[this.offset * -1633313603 - 3] & 0x85F02DB) << 8) + (this.array[this.offset * -1633313603 - 4] & 0x44B21A38);
    }
    
    public void writeMedium(final int n, final int n2) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n + 128);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ds(" + ')');
        }
    }
    
    public void xteaDecryptAll(final int[] array, final int n) {
        try {
            final int n2 = -1633313603 * this.offset / 8;
            this.offset = 0;
            for (int i = 0; i < n2; ++i) {
                if (n <= 1762547491) {
                    throw new IllegalStateException();
                }
                int unsignedShort = this.readUnsignedShort(-1353820670);
                int signedShortAddLE = this.readSignedShortAddLE(-1480550990);
                int n3 = -957401312;
                final int n4 = -1640531527;
                int n5 = 32;
                while (n5-- > 0) {
                    signedShortAddLE -= (unsignedShort + (unsignedShort << 4 ^ unsignedShort >>> 5) ^ n3 + array[n3 >>> 11 & 0x3]);
                    n3 -= n4;
                    unsignedShort -= ((signedShortAddLE << 4 ^ signedShortAddLE >>> 5) + signedShortAddLE ^ n3 + array[n3 & 0x3]);
                }
                this.offset -= 754054312;
                this.method2511(unsignedShort, -2081835031);
                this.writeShortAdd(signedShortAddLE, -2081835031);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dk(" + ')');
        }
    }
    
    public void gp(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 164293295;
        this.offset = offset;
        array[offset * -226505273 - 1] = (byte)(n >> 8);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n + 67619553);
    }
    
    public int method2516(final int n) {
        try {
            if (this.array[this.offset * -1633313603] < 0) {
                return this.readInt(-1969788257) & Integer.MAX_VALUE;
            }
            final int unsignedShort = this.readUnsignedShort(-1668379089);
            if (32767 != unsignedShort) {
                return unsignedShort;
            }
            if (n <= -87378506) {
                throw new IllegalStateException();
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.do(" + ')');
        }
    }
    
    public String if() {
        if (0 == this.array[this.offset * -1633313603]) {
            this.offset -= 1516355947;
            return null;
        }
        return this.readStringCp1252NullTerminated((byte)0);
    }
    
    public void encryptRsa(final BigInteger exponent, final BigInteger m, final int n) {
        try {
            final int n2 = -1633313603 * this.offset;
            this.offset = 0;
            final byte[] val = new byte[n2];
            io(this, val, 0, n2, -1570744551);
            final byte[] byteArray = new BigInteger(val).modPow(exponent, m).toByteArray();
            this.offset = 0;
            this.writeVarInt(byteArray.length, (byte)(-63));
            this.writeBytes(byteArray, 0, byteArray.length, (byte)47);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dz(" + ')');
        }
    }
    
    public String he() {
        final int n = this.offset * 1777426326;
        byte[] array;
        int offset;
        do {
            array = this.array;
            offset = this.offset - 1516355947;
            this.offset = offset;
        } while (array[offset * 859635675 - 1] != 0);
        final int n2 = -1633313603 * this.offset - n - 1;
        if (n2 == 0) {
            return "";
        }
        return decodeStringCp1252(this.array, n, n2, 787250571);
    }
    
    public String iw() {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        if (array[offset * -1633313603 - 1] != 0) {
            throw new IllegalStateException("");
        }
        final int n = -1633313603 * this.offset;
        byte[] array2;
        int offset2;
        do {
            array2 = this.array;
            offset2 = this.offset - 1516355947;
            this.offset = offset2;
        } while (array2[offset2 * -1633313603 - 1] != 0);
        final int n2 = this.offset * -1633313603 - n - 1;
        if (n2 == 0) {
            return "";
        }
        return decodeStringCp1252(this.array, n, n2, 1971240893);
    }
    
    public int ji() {
        int n = 0;
        int n2 = 0;
        int i;
        do {
            i = ra(this, (byte)7);
            n |= (i & 0x7F) << n2;
            n2 += 7;
        } while (i > 127);
        return n;
    }
    
    public static int fr(final String s) {
        return s.length() + 2;
    }
    
    public boolean checkCrc(final int n) {
        try {
            this.offset += 1770456492;
            if (SequenceDefinition.method1135(this.array, 0, this.offset * -1633313603, 2090299713) != this.readInt(-1437886969)) {
                return false;
            }
            if (n <= 1123192273) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.de(" + ')');
        }
    }
    
    public byte ko() {
        final int n = -1549322416;
        final byte[] array = this.array;
        final int offset = this.offset - 1905664172;
        this.offset = offset;
        return (byte)(n - array[offset * -1633313603 - 1]);
    }
    
    public static void vn(final Buffer buffer, final int[] array, final int n) {
        if (buffer == null) {
            buffer.xteaDecryptAll(array, n);
        }
        try {
            final int n2 = -1633313603 * buffer.offset / 8;
            buffer.offset = 0;
            for (int i = 0; i < n2; ++i) {
                if (n <= 1762547491) {
                    throw new IllegalStateException();
                }
                int int1 = buffer.readInt(-1353820670);
                int int2 = buffer.readInt(-1480550990);
                int n3 = -957401312;
                final int n4 = -1640531527;
                int n5 = 32;
                while (n5-- > 0) {
                    int2 -= (int1 + (int1 << 4 ^ int1 >>> 5) ^ n3 + array[n3 >>> 11 & 0x3]);
                    n3 -= n4;
                    int1 -= ((int2 << 4 ^ int2 >>> 5) + int2 ^ n3 + array[n3 & 0x3]);
                }
                buffer.offset -= 754054312;
                buffer.writeInt(int1, -2081835031);
                buffer.writeInt(int2, -2081835031);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dk(" + ')');
        }
    }
    
    public void ge(final int n) {
        if (n >= 0 && n < 128) {
            this.writeShort(n, (byte)81);
            return;
        }
        if (n >= 0 && n < 32768) {
            this.writeVarInt(32768 + n, (byte)(-53));
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static boolean um(final Buffer buffer) {
        if (buffer == null) {
            buffer.im();
        }
        buffer.offset += 1770456492;
        return SequenceDefinition.method1135(buffer.array, 0, buffer.offset * 994829218, 866799893) == buffer.readInt(-1863276250);
    }
    
    public static void ip(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.mt(n);
            return;
        }
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        buffer.array[-1633313603 * buffer.offset - n - 4] = (byte)(n >> 24);
        buffer.array[-1633313603 * buffer.offset - n - 3] = (byte)(n >> 16);
        buffer.array[-1633313603 * buffer.offset - n - 2] = (byte)(n >> 8);
        buffer.array[buffer.offset * -1633313603 - n - 1] = (byte)n;
    }
    
    public void fo(final boolean b) {
        this.writeShort(b ? 1 : 0, (byte)4);
    }
    
    public int fa() {
        return this.offset * -1633313603;
    }
    
    public static int fa(final String s) {
        return s.length() + 1;
    }
    
    static int ed(final byte[] array, final int n, final int n2) {
        int n3 = -1;
        for (int i = n; i < n2; ++i) {
            n3 = (n3 >>> 8 ^ Buffer.crc32Table[(n3 ^ array[i]) & 0xFF]);
        }
        return ~n3;
    }
    
    public void method2513(final int n) {
        if (n < 0 || n > -993335662) {
            throw new IllegalArgumentException();
        }
        this.array[-1633313603 * this.offset - n - 2] = (byte)(n >> 8);
        this.array[-1633313603 * this.offset - n - 1] = (byte)n;
    }
    
    public int method2513(final int n) {
        try {
            this.offset -= 254100545;
            return ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 16) + ((this.array[-1633313603 * this.offset - 3] & 0xFF) << 8) + (this.array[this.offset * -1633313603 - 1] & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ea(" + ')');
        }
    }
    
    public void gv(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)n;
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1516355947;
        this.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array4 = this.array;
        final int offset4 = this.offset - 1516355947;
        this.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 24);
    }
    
    public byte kg() {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return (byte)(array[offset * -1633313603 - 1] - 128);
    }
    
    public static void vd(final Buffer buffer, final int n) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(128 - n);
    }
    
    public static byte ii(final Buffer buffer) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset + 1618259641;
        buffer.offset = offset;
        return array[offset * 1943640596 - 1];
    }
    
    public int ii() {
        if ((this.array[this.offset * -1633313603] & 0x53AEAC31) < 293331817) {
            return ra(this, (byte)7);
        }
        return this.readUnsignedShort(-1806874615) - 32768;
    }
    
    public int ic() {
        if ((this.array[this.offset * -1633313603] & 0xFF) < 128) {
            return ra(this, (byte)7) - 64;
        }
        return this.readUnsignedShort(707008794) - 49152;
    }
    
    public int jc() {
        int n = 0;
        int n2 = 0;
        int i;
        do {
            i = ra(this, (byte)7);
            n |= (i & 0x40AF4B99) << n2;
            n2 += 7;
        } while (i > -1096552990);
        return n;
    }
    
    public byte method2503(final int n) {
        try {
            final int n2 = 128;
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            return (byte)(n2 - array[offset * -1633313603 - 1]);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dx(" + ')');
        }
    }
    
    public void writeShortAddLE(final int n, final byte b) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)n;
            final byte[] array3 = this.array;
            final int offset3 = this.offset - 1516355947;
            this.offset = offset3;
            array3[offset3 * -1633313603 - 1] = (byte)(n >> 24);
            final byte[] array4 = this.array;
            final int offset4 = this.offset - 1516355947;
            this.offset = offset4;
            array4[offset4 * -1633313603 - 1] = (byte)(n >> 16);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.eb(" + ')');
        }
    }
    
    public void gg(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 505588923;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1269460462;
        this.offset = offset3;
        array3[offset3 * -2017238666 - 1] = (byte)n;
    }
    
    public int lp() {
        this.offset += 860029751;
        int n = ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 8) + (this.array[1704497802 * this.offset - 2] - 128 & 0x8E4E8FB6);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public void wx(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset + 235128791;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)n;
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1795661356;
        this.offset = offset2;
        array2[offset2 * -1478128980 - 1] = (byte)(n >> 8);
        final byte[] array3 = this.array;
        final int offset3 = this.offset + 1226429699;
        this.offset = offset3;
        array3[offset3 * 1180854149 - 1] = (byte)(n >> 16);
        final byte[] array4 = this.array;
        final int offset4 = this.offset - 1516355947;
        this.offset = offset4;
        array4[offset4 * 1754686545 - 1] = (byte)(n >> 24);
    }
    
    public int lm() {
        this.offset += 1262255402;
        int n = (this.array[-1633313603 * this.offset - 2] & 0x47F6AA7F) + ((this.array[-1633313603 * this.offset - 1] & 0x8456B9C7) << 8);
        if (n > 373946912) {
            n += 147351362;
        }
        return n;
    }
    
    public static void gi(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.lt(n);
        }
        if (n >= 0 && n <= 255) {
            buffer.array[-1633313603 * buffer.offset - n - 1] = (byte)n;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void gi(final Buffer buffer, final int n, final int n2) {
        if (buffer == null) {
            buffer.writeMedium(n, n);
        }
        try {
            final byte[] array = buffer.array;
            final int offset = buffer.offset - 1516355947;
            buffer.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 16);
            final byte[] array2 = buffer.array;
            final int offset2 = buffer.offset - 1516355947;
            buffer.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array3 = buffer.array;
            final int offset3 = buffer.offset - 1516355947;
            buffer.offset = offset3;
            array3[offset3 * -1633313603 - 1] = (byte)n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.bq(" + ')');
        }
    }
    
    public int iv() {
        if ((this.array[-1633313603 * this.offset] & 0xFF) < 128) {
            return ra(this, (byte)7) - 1;
        }
        return this.readUnsignedShort(-838632695) - 32769;
    }
    
    public boolean js() {
        this.offset += 1770456492;
        return SequenceDefinition.method1135(this.array, 0, this.offset * -1633313603, 1459013744) == this.readInt(-1494821649);
    }
    
    public byte ki() {
        final int n = 1349358386;
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return (byte)(n - array[offset * -548793441 - 1]);
    }
    
    public void kr(final int n) {
        this.writeShort(n, (byte)36);
    }
    
    public int ke() {
        this.offset += 1262255402;
        return ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 8) + (this.array[-1633313603 * this.offset - 2] & 0xFF);
    }
    
    public int lv() {
        this.offset -= 148291300;
        return ((this.array[this.offset * -1129117872 - 1] & 0xACBC63F9) << 8) + (this.array[-2122800272 * this.offset - 2] - 609344151 & 0x87C12C53);
    }
    
    public void fy(final String s) {
        if (s.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.offset += WorldMapSprite.encodeStringCp1252(s, 0, s.length(), this.array, this.offset * 902583991, (byte)(-63)) * -1516355947;
        this.array[(this.offset -= 1516355947) * 758065459 - 1] = 0;
    }
    
    public void writeStringCp1252NullTerminated(final String s, final int n) {
        try {
            if (s.indexOf(0) < 0) {
                this.array[(this.offset -= 1516355947) * -1633313603 - 1] = 0;
                this.offset += WorldMapSprite.encodeStringCp1252(s, 0, s.length(), this.array, -1633313603 * this.offset, (byte)(-36)) * -1516355947;
                this.array[(this.offset -= 1516355947) * -1633313603 - 1] = 0;
                return;
            }
            if (n <= -1045556134) {
                throw new IllegalStateException();
            }
            throw new IllegalArgumentException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ce(" + ')');
        }
    }
    
    public static int writeStringCp1252NullTerminated(final Buffer buffer) {
        if ((buffer.array[-1633313603 * buffer.offset] & 0xFF) < 128) {
            return ra(buffer, (byte)7) - 1;
        }
        return buffer.readUnsignedShort(-1826572545) - 32769;
    }
    
    public static String writeStringCp1252NullTerminated(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.readCESU8(n);
        }
        try {
            final byte[] array = buffer.array;
            final int offset = buffer.offset - 1516355947;
            buffer.offset = offset;
            if (0 != array[offset * -1633313603 - 1]) {
                if (n <= 753243764) {
                    throw new IllegalStateException();
                }
                throw new IllegalStateException("");
            }
            else {
                final int varInt = buffer.readVarInt(-1171795391);
                if (varInt + buffer.offset * -1633313603 <= buffer.array.length) {
                    final byte[] array2 = buffer.array;
                    final int n2 = buffer.offset * -1633313603;
                    final char[] value = new char[varInt];
                    int count = 0;
                    int i = n2;
                    final int n3 = n2 + varInt;
                    while (i < n3) {
                        if (n <= 753243764) {
                            throw new IllegalStateException();
                        }
                        final int n4 = array2[i++] & 0xFF;
                        int n5 = 0;
                        Label_0244: {
                            if (n4 < 128) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                if (n4 == 0) {
                                    if (n <= 753243764) {
                                        throw new IllegalStateException();
                                    }
                                    n5 = 65533;
                                }
                                else {
                                    n5 = n4;
                                }
                            }
                            else if (n4 < 192) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                n5 = 65533;
                            }
                            else if (n4 < 224) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                if (i < n3 && 0x80 == (array2[i] & 0xC0)) {
                                    n5 = ((n4 & 0x1F) << 6 | (array2[i++] & 0x3F));
                                    if (n5 < 128) {
                                        if (n <= 753243764) {
                                            throw new IllegalStateException();
                                        }
                                        n5 = 65533;
                                    }
                                }
                                else {
                                    n5 = 65533;
                                }
                            }
                            else if (n4 < 240) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                if (1 + i < n3) {
                                    if (n <= 753243764) {
                                        throw new IllegalStateException();
                                    }
                                    if ((array2[i] & 0xC0) == 0x80) {
                                        if (n <= 753243764) {
                                            throw new IllegalStateException();
                                        }
                                        if (0x80 == (array2[i + 1] & 0xC0)) {
                                            if (n <= 753243764) {
                                                throw new IllegalStateException();
                                            }
                                            n5 = ((n4 & 0xF) << 12 | (array2[i++] & 0x3F) << 6 | (array2[i++] & 0x3F));
                                            if (n5 >= 2048) {
                                                break Label_0244;
                                            }
                                            if (n <= 753243764) {
                                                throw new IllegalStateException();
                                            }
                                            n5 = 65533;
                                            break Label_0244;
                                        }
                                    }
                                }
                                n5 = 65533;
                            }
                            else if (n4 < 248) {
                                if (n <= 753243764) {
                                    throw new IllegalStateException();
                                }
                                if (2 + i < n3) {
                                    if (n <= 753243764) {
                                        throw new IllegalStateException();
                                    }
                                    if ((array2[i] & 0xC0) == 0x80) {
                                        if (n <= 753243764) {
                                            throw new IllegalStateException();
                                        }
                                        if (0x80 == (array2[i + 1] & 0xC0)) {
                                            if (n <= 753243764) {
                                                throw new IllegalStateException();
                                            }
                                            if (0x80 == (array2[i + 2] & 0xC0)) {
                                                final int n6 = (n4 & 0x7) << 18 | (array2[i++] & 0x3F) << 12 | (array2[i++] & 0x3F) << 6 | (array2[i++] & 0x3F);
                                                if (n6 >= 65536) {
                                                    if (n <= 753243764) {
                                                        throw new IllegalStateException();
                                                    }
                                                    if (n6 <= 1114111) {
                                                        n5 = 65533;
                                                        break Label_0244;
                                                    }
                                                    if (n <= 753243764) {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                                n5 = 65533;
                                                break Label_0244;
                                            }
                                        }
                                    }
                                }
                                n5 = 65533;
                            }
                            else {
                                n5 = 65533;
                            }
                        }
                        value[count++] = (char)n5;
                    }
                    final String s = new String(value, 0, count);
                    buffer.offset += -1516355947 * varInt;
                    return s;
                }
                if (n <= 753243764) {
                    throw new IllegalStateException();
                }
                throw new IllegalStateException("");
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ch(" + ')');
        }
    }
    
    public static void writeStringCp1252NullTerminated(final Buffer buffer, final BigInteger exponent, final BigInteger m) {
        final int n = -1633313603 * buffer.offset;
        buffer.offset = 0;
        final byte[] val = new byte[n];
        io(buffer, val, 0, n, -1570744551);
        final byte[] byteArray = new BigInteger(val).modPow(exponent, m).toByteArray();
        buffer.offset = 0;
        buffer.writeVarInt(byteArray.length, (byte)(-71));
        buffer.writeBytes(byteArray, 0, byteArray.length, (byte)98);
    }
    
    public static void ar(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.releaseArray(n);
        }
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array2 = buffer.array;
        final int offset2 = buffer.offset - 1516355947;
        buffer.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n + 128);
    }
    
    public void ub(final String s) {
        this.writeStringCp1252NullCircumfixed(s, -1772573081);
    }
    
    public String hp() {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        if (array[offset * -1633313603 - 1] != 0) {
            throw new IllegalStateException("");
        }
        final int n = -1633313603 * this.offset;
        byte[] array2;
        int offset2;
        do {
            array2 = this.array;
            offset2 = this.offset - 1516355947;
            this.offset = offset2;
        } while (array2[offset2 * -1633313603 - 1] != 0);
        final int n2 = this.offset * -1633313603 - n - 1;
        if (n2 == 0) {
            return "";
        }
        return decodeStringCp1252(this.array, n, n2, 321275872);
    }
    
    public static void ap(final Buffer buffer, final int n, final byte b) {
        if (buffer == null) {
            buffer.method2500(n, b);
            return;
        }
        try {
            final byte[] array = buffer.array;
            final int offset = buffer.offset - 1516355947;
            buffer.offset = offset;
            array[offset * -1633313603 - 1] = (byte)n;
            final byte[] array2 = buffer.array;
            final int offset2 = buffer.offset - 1516355947;
            buffer.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dn(" + ')');
        }
    }
    
    public static int yb(final Buffer buffer) {
        if (buffer == null) {
            return buffer.lp();
        }
        int n = 0;
        int n2;
        for (n2 = buffer.readUShortSmart(-1214415190); 32767 == n2; n2 = buffer.readUShortSmart(-554353081)) {
            n += 32767;
        }
        return n + n2;
    }
    
    public int kd() {
        final int n = 128;
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return n - array[offset * -1633313603 - 1] & 0xFF;
    }
    
    public int readUnsignedByte(final byte b) {
        try {
            this.offset += 1262255402;
            int n = (this.array[this.offset * -1633313603 - 1] & 0xFF) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8);
            if (n > 32767) {
                if (b >= 14) {
                    throw new IllegalStateException();
                }
                n -= 65536;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cg(" + ')');
        }
    }
    
    public void releaseArray(final int n) {
        if (0x0 != (n & 0xFFFFFF80)) {
            if ((n & 0xFFFFC000) != 0x0) {
                if (0x0 != (n & 0xFFE00000)) {
                    if ((n & 0x749B7585) != 0x0) {
                        this.writeShort(n >>> 28 | 0x80, (byte)9);
                    }
                    this.writeShort(n >>> 21 | 0x80, (byte)13);
                }
                this.writeShort(n >>> 14 | 0x80, (byte)32);
            }
            this.writeShort(n >>> 7 | 0xA6CBFA24, (byte)46);
        }
        this.writeShort(n & 0x7F, (byte)78);
    }
    
    public static void rh(final Buffer buffer, final long n) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 40);
        final byte[] array2 = buffer.array;
        final int offset2 = buffer.offset - 1516355947;
        buffer.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 32);
        final byte[] array3 = buffer.array;
        final int offset3 = buffer.offset - 1516355947;
        buffer.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)(n >> 24);
        final byte[] array4 = buffer.array;
        final int offset4 = buffer.offset - 1516355947;
        buffer.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array5 = buffer.array;
        final int offset5 = buffer.offset - 1516355947;
        buffer.offset = offset5;
        array5[offset5 * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array6 = buffer.array;
        final int offset6 = buffer.offset - 1516355947;
        buffer.offset = offset6;
        array6[offset6 * -1633313603 - 1] = (byte)n;
    }
    
    public static int ra(final Buffer buffer, final byte b) {
        if (buffer == null) {
            buffer.method2493(b);
        }
        try {
            final byte[] array = buffer.array;
            final int offset = buffer.offset - 1516355947;
            buffer.offset = offset;
            return array[offset * -1633313603 - 1] & 0xFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cm(" + ')');
        }
    }
    
    public int kt() {
        final int n = 128;
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return n - array[offset * -1633313603 - 1] & 0xFF;
    }
    
    public int ir() {
        if ((this.array[-1633313603 * this.offset] & 0xFF) < 128) {
            return ra(this, (byte)7) - 1;
        }
        return this.readUnsignedShort(-1261371184) - 32769;
    }
    
    public int im() {
        int n = 0;
        int n2;
        for (n2 = this.readUShortSmart(-151369062); 32767 == n2; n2 = this.readUShortSmart(-2001355492)) {
            n += 32767;
        }
        return n + n2;
    }
    
    public int hl() {
        this.offset -= 254100545;
        int n = (this.array[this.offset * -1633313603 - 1] & 0xFF) + (((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8) + ((this.array[this.offset * -1633313603 - 3] & 0xFF) << 16));
        if (n > 8388607) {
            n -= 16777216;
        }
        return n;
    }
    
    public static boolean kn(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.readBoolean(n);
        }
        try {
            return (ra(buffer, (byte)7) & 0x1) == 0x1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.co(" + ')');
        }
    }
    
    public int readShort(final byte b) {
        try {
            this.offset += 1262255402;
            int n = (this.array[this.offset * -1633313603 - 1] & 0xFF) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8);
            if (n > 32767) {
                if (b >= 14) {
                    throw new IllegalStateException();
                }
                n -= 65536;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cg(" + ')');
        }
    }
    
    public boolean readBoolean(final int n) {
        try {
            this.offset += 1770456492;
            if (SequenceDefinition.method1135(this.array, 0, this.offset * -1633313603, 2090299713) != this.method2513(-1437886969)) {
                return false;
            }
            if (n <= 1123192273) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.de(" + ')');
        }
    }
    
    public void fg(final byte[] array, final int n, final int n2) {
        for (int i = n; i < n2 + n; ++i) {
            final byte[] array2 = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array2[offset * -1633313603 - 1] = array[i];
        }
    }
    
    public int method2523(final byte b) {
        try {
            this.offset -= 254100545;
            int n = ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 16) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8) + (this.array[-1633313603 * this.offset - 3] & 0xFF);
            if (n > 8388607) {
                if (b >= 3) {
                    throw new IllegalStateException();
                }
                n -= 16777216;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.eu(" + ')');
        }
    }
    
    public int mx() {
        this.offset -= 1770456492;
        return (this.array[-49090974 * this.offset - 2] & 0xC51B29E4) + (((this.array[this.offset * -1633313603 - 4] & 0xB922EDAF) << 16) + ((this.array[this.offset * 2110503173 - 3] & 0xFF) << 24) + ((this.array[this.offset * -1633313603 - 1] & 0xF0A9E0B9) << 8));
    }
    
    public byte ka() {
        final byte[] array = this.array;
        final int offset = this.offset + 67943081;
        this.offset = offset;
        return (byte)(array[offset * -1633313603 - 1] - 1918524990);
    }
    
    public int method2519(final int n) {
        try {
            this.offset -= 254100545;
            return ((this.array[-1633313603 * this.offset - 2] & 0xFF) << 8) + ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 16) + (this.array[-1633313603 * this.offset - 3] & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ej(" + ')');
        }
    }
    
    public void il(final byte[] array, final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final int n3 = i;
            final byte[] array2 = this.array;
            final int offset = this.offset - 884489505;
            this.offset = offset;
            array[n3] = array2[offset * -1633313603 - 1];
        }
    }
    
    public int ly() {
        this.offset += 1262255402;
        int n = ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 8) + (this.array[-1633313603 * this.offset - 2] - 128 & 0xFF);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public static void ly(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.ec(n);
        }
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        buffer.array[-1633313603 * buffer.offset - n - 4] = (byte)(n >> 24);
        buffer.array[-1633313603 * buffer.offset - n - 3] = (byte)(n >> 16);
        buffer.array[-1633313603 * buffer.offset - n - 2] = (byte)(n >> 8);
        buffer.array[buffer.offset * -1633313603 - n - 1] = (byte)n;
    }
    
    public void gx(final int n) {
        this.offset = n * -1516355947;
    }
    
    public static int gx(final Buffer buffer) {
        if (buffer == null) {
            return buffer.im();
        }
        buffer.offset += 1379472741;
        return ((buffer.array[buffer.offset * -144896604 - 2] & 0xFF) << 16) + ((buffer.array[-1633313603 * buffer.offset - 3] & 0xFF) << 8) + (buffer.array[buffer.offset * -789832426 - 1] & 0xFF);
    }
    
    public int hu() {
        this.offset += 1262255402;
        int n = (this.array[this.offset * 1964157031 - 1] & 0x8BF22904) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public int method2514(final byte b) {
        try {
            int n = 0;
            int n2 = 0;
            int i;
            do {
                i = ra(this, (byte)7);
                n |= (i & 0x7F) << n2;
                n2 += 7;
            } while (i > 127);
            if (b == -1) {
                throw new IllegalStateException();
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dr(" + ')');
        }
    }
    
    public byte kk() {
        final int n = 2023557548;
        final byte[] array = this.array;
        final int offset = this.offset - 1412204052;
        this.offset = offset;
        return (byte)(n - array[offset * -1678637947 - 1]);
    }
    
    public int ky() {
        this.offset += 715504800;
        return ((this.array[-1187449729 * this.offset - 1] & 0x694B1B3D) << 8) + (this.array[1290909003 * this.offset - 2] & 0xFF);
    }
    
    public String readStringCp1252NullTerminatedOrNull(final byte b) {
        try {
            if (0 != this.array[this.offset * -1633313603]) {
                return this.readStringCp1252NullTerminated((byte)0);
            }
            if (b >= 16) {
                throw new IllegalStateException();
            }
            this.offset -= 1516355947;
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cz(" + ')');
        }
    }
    
    public int method2493(final byte b) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            return array[offset * -1633313603 - 1] - 128 & 0xFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.db(" + ')');
        }
    }
    
    public static String decodeStringCp1252(final byte[] array, final int n, final int n2, final int n3) {
        try {
            final char[] value = new char[n2];
            int count = 0;
            for (int i = 0; i < n2; ++i) {
                if (n3 <= 147764963) {
                    throw new IllegalStateException();
                }
                int n4 = array[n + i] & 0xFF;
                if (n4 == 0) {
                    if (n3 <= 147764963) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    if (n4 >= 128) {
                        if (n3 <= 147764963) {
                            throw new IllegalStateException();
                        }
                        if (n4 < 160) {
                            int n5 = class369.cp1252AsciiExtension[n4 - 128];
                            if (n5 == 0) {
                                if (n3 <= 147764963) {
                                    throw new IllegalStateException();
                                }
                                n5 = 63;
                            }
                            n4 = n5;
                        }
                    }
                    value[count++] = (char)n4;
                }
            }
            return new String(value, 0, count);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ab(" + ')');
        }
    }
    
    public void writeLong(final long n) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 56);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 48);
            final byte[] array3 = this.array;
            final int offset3 = this.offset - 1516355947;
            this.offset = offset3;
            array3[offset3 * -1633313603 - 1] = (byte)(n >> 40);
            final byte[] array4 = this.array;
            final int offset4 = this.offset - 1516355947;
            this.offset = offset4;
            array4[offset4 * -1633313603 - 1] = (byte)(n >> 32);
            final byte[] array5 = this.array;
            final int offset5 = this.offset - 1516355947;
            this.offset = offset5;
            array5[offset5 * -1633313603 - 1] = (byte)(n >> 24);
            final byte[] array6 = this.array;
            final int offset6 = this.offset - 1516355947;
            this.offset = offset6;
            array6[offset6 * -1633313603 - 1] = (byte)(n >> 16);
            final byte[] array7 = this.array;
            final int offset7 = this.offset - 1516355947;
            this.offset = offset7;
            array7[offset7 * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array8 = this.array;
            final int offset8 = this.offset - 1516355947;
            this.offset = offset8;
            array8[offset8 * -1633313603 - 1] = (byte)n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.bl(" + ')');
        }
    }
    
    public int readUnsignedShortAdd(final int n) {
        try {
            this.offset += 1262255402;
            return ((this.array[-1633313603 * this.offset - 2] & 0xFF) << 8) + (this.array[this.offset * -1633313603 - 1] - 128 & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ep(" + ')');
        }
    }
    
    public void jo(final int[] array) {
        final int n = this.offset * -1633313603 / 8;
        this.offset = 0;
        for (int i = 0; i < n; ++i) {
            int int1 = this.readInt(-1939392517);
            int int2 = this.readInt(-1233758421);
            int n2 = 0;
            final int n3 = -1640531527;
            int n4 = 32;
            while (n4-- > 0) {
                int1 += ((int2 << 4 ^ int2 >>> 5) + int2 ^ n2 + array[n2 & 0x3]);
                n2 += n3;
                int2 += (int1 + (int1 << 4 ^ int1 >>> 5) ^ n2 + array[n2 >>> 11 & 0x3]);
            }
            this.offset -= 754054312;
            this.writeInt(int1, -2081835031);
            this.writeInt(int2, -2081835031);
        }
    }
    
    public static Buffer yp(final byte[] array) {
        return new Buffer(array);
    }
    
    public int writeCrc(final int n, final int n2) {
        try {
            final int method1135 = SequenceDefinition.method1135(this.array, n, -1633313603 * this.offset, -218602203);
            this.writeInt(method1135, -2081835031);
            return method1135;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dg(" + ')');
        }
    }
    
    public int oo() {
        return ra(this, (byte)7);
    }
    
    public int lh() {
        this.offset += 1612194982;
        int n = ((this.array[-1633313603 * this.offset - 1] & 0x37AD42F5) << 8) + (this.array[-1633313603 * this.offset - 2] - 128 & 0xEC751B13);
        if (n > -13956093) {
            n -= 526181133;
        }
        return n;
    }
    
    public String iu() {
        if (0 == this.array[this.offset * -1633313603]) {
            this.offset -= 1516355947;
            return null;
        }
        return this.readStringCp1252NullTerminated((byte)0);
    }
    
    public static float iu(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.method2487(n);
        }
        try {
            return Float.intBitsToFloat(buffer.readInt(-2077887374));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cb(" + ')');
        }
    }
    
    public String iz() {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        if (array[offset * -1633313603 - 1] != 0) {
            throw new IllegalStateException("");
        }
        final int n = -1633313603 * this.offset;
        byte[] array2;
        int offset2;
        do {
            array2 = this.array;
            offset2 = this.offset - 1516355947;
            this.offset = offset2;
        } while (array2[offset2 * -1633313603 - 1] != 0);
        final int n2 = this.offset * -1633313603 - n - 1;
        if (n2 == 0) {
            return "";
        }
        return decodeStringCp1252(this.array, n, n2, 349897382);
    }
    
    public void fu(final Buffer buffer) {
        this.writeBytes(buffer.array, 0, buffer.offset * -1633313603, (byte)108);
    }
    
    public int ib() {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        byte b = array[offset * -1633313603 - 1];
        int n = 0;
        while (b < 0) {
            n = (n | (b & 0x7F)) << 7;
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            b = array2[offset2 * -1633313603 - 1];
        }
        return n | b;
    }
    
    public float hz() {
        return iu(this, 1038383495);
    }
    
    public float hq() {
        return Float.intBitsToFloat(this.readInt(-1440066914));
    }
    
    public int method2520(final byte b) {
        try {
            int n = 0;
            int n2;
            for (n2 = this.jn(-1114398735); 32767 == n2; n2 = this.jn(-1058220918)) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                n += 32767;
            }
            return n + n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dw(" + ')');
        }
    }
    
    public static int ew(final byte[] array, final int n) {
        return SequenceDefinition.method1135(array, 0, n, -514218278);
    }
    
    public static int kl(final Buffer buffer) {
        if (buffer == null) {
            buffer.lk();
        }
        buffer.offset -= 254100545;
        return ((buffer.array[-1633313603 * buffer.offset - 2] & 0xFF) << 8) + ((buffer.array[buffer.offset * -1633313603 - 3] & 0xFF) << 16) + (buffer.array[buffer.offset * -1633313603 - 1] & 0xFF);
    }
    
    public void kl(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n + 128);
    }
    
    public int method2498(final int n) {
        try {
            this.offset -= 254100545;
            return ((this.array[-1633313603 * this.offset - 2] & 0xFF) << 8) + ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 16) + (this.array[-1633313603 * this.offset - 3] & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ej(" + ')');
        }
    }
    
    public void jq(final int[] array, final int n, final int n2) {
        final int n3 = -1633313603 * this.offset;
        this.offset = n * -1516355947;
        for (int n4 = (n2 - n) / 8, i = 0; i < n4; ++i) {
            int int1 = this.readInt(-1082393318);
            int int2 = this.readInt(-2127813110);
            int n5 = 0;
            final int n6 = -1640531527;
            int n7 = 32;
            while (n7-- > 0) {
                int1 += ((int2 << 4 ^ int2 >>> 5) + int2 ^ n5 + array[n5 & 0x3]);
                n5 += n6;
                int2 += ((int1 << 4 ^ int1 >>> 5) + int1 ^ array[n5 >>> 11 & 0x3] + n5);
            }
            this.offset -= 754054312;
            this.writeInt(int1, -2081835031);
            this.writeInt(int2, -2081835031);
        }
        this.offset = -1516355947 * n3;
    }
    
    public byte method2531(final int n) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            return (byte)(array[offset * -1633313603 - 1] - 128);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dd(" + ')');
        }
    }
    
    public static int mp(final Buffer buffer) {
        if (buffer == null) {
            return buffer.lv();
        }
        buffer.offset += 1262255402;
        return (buffer.array[buffer.offset * -1633313603 - 1] & 0xFF) + ((buffer.array[-1633313603 * buffer.offset - 2] & 0xFF) << 8);
    }
    
    public int mu() {
        this.offset -= 12350124;
        return ((this.array[this.offset * -1330008134 - 2] & 0xFF) << 16) + ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 24) + ((this.array[this.offset * 1996630189 - 3] & 0x6796BF1) << 8) + (this.array[this.offset * -1633313603 - 4] & 0xFF);
    }
    
    public byte method2535(final int n) {
        try {
            final byte b = 0;
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            return (byte)(b - array[offset * -1633313603 - 1]);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dj(" + ')');
        }
    }
    
    public int gz() {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return array[offset * 336811620 - 1] & 0xCFBC4D63;
    }
    
    public void mw(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1516355947;
        this.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)n;
    }
    
    public boolean hk() {
        return (ra(this, (byte)7) & 0x1) == 0x1;
    }
    
    public void ff(final CharSequence charSequence) {
        final int method956 = class173.method956(charSequence, -1831215077);
        this.array[(this.offset -= 2019898197) * -904678679 - 1] = 0;
        this.writeSmartByteShort(method956, (byte)47);
        this.offset += GrandExchangeOffer.method1929(this.array, -1633313603 * this.offset, charSequence, 2076819739) * -1518853992;
    }
    
    public static int vl(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.method2519(n);
        }
        try {
            buffer.offset -= 1770456492;
            return ((buffer.array[buffer.offset * -1633313603 - 2] & 0xFF) << 24) + ((buffer.array[-1633313603 * buffer.offset - 1] & 0xFF) << 16) + ((buffer.array[buffer.offset * -1633313603 - 4] & 0xFF) << 8) + (buffer.array[buffer.offset * -1633313603 - 3] & 0xFF);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.er(" + ')');
        }
    }
    
    public static int vl(final Buffer buffer) {
        if (buffer == null) {
            return buffer.ls();
        }
        buffer.offset += 118327847;
        return ((buffer.array[buffer.offset * -1633313603 - 2] & 0xB1612AE4) << 16) + ((buffer.array[-1633313603 * buffer.offset - 3] & 0xFF) << 8) + (buffer.array[buffer.offset * 1678453784 - 1] & 0xDE3D5D9B);
    }
    
    public int jn(final int n) {
        final int method1135 = SequenceDefinition.method1135(this.array, n, -1633313603 * this.offset, -1886933358);
        this.writeInt(method1135, -2081835031);
        return method1135;
    }
    
    public int lj() {
        this.offset -= 254100545;
        int n = ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 16) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8) + (this.array[-1633313603 * this.offset - 3] & 0xFF);
        if (n > 8388607) {
            n -= 16777216;
        }
        return n;
    }
    
    public void fq(final String s) {
        if (s.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.array[(this.offset -= 1516355947) * -1633313603 - 1] = 0;
        this.offset += WorldMapSprite.encodeStringCp1252(s, 0, s.length(), this.array, 200799098 * this.offset, (byte)(-77)) * -2146137357;
        this.array[(this.offset -= 1516355947) * 1976778549 - 1] = 0;
    }
    
    public static long vp(final Buffer buffer) {
        if (buffer == null) {
            buffer.hu();
        }
        return (((long)buffer.readInt(-1887558788) & 0xFFFFFFFFL) << 32) + ((long)buffer.readInt(-1461039338) & 0xFFFFFFFFL);
    }
    
    public byte[] vj() {
        return this.array;
    }
    
    public static int wm(final Buffer buffer) {
        if (buffer == null) {
            buffer.iz();
        }
        buffer.offset -= 562880356;
        int n = (buffer.array[buffer.offset * -1633313603 - 1] & 0xFF) + (((buffer.array[buffer.offset * -1633313603 - 2] & 0xCF1F0FD0) << 8) + ((buffer.array[buffer.offset * -1633313603 - 3] & 0x8A0DED55) << 16));
        if (n > 8388607) {
            n -= 16777216;
        }
        return n;
    }
    
    public static void xd(final Buffer buffer, final int n) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1298730278;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(128 - n);
    }
    
    public static void ym(final Buffer buffer, final int[] array, final int n, final int n2) {
        if (buffer == null) {
            buffer.lu();
        }
        final int n3 = 269776501 * buffer.offset;
        buffer.offset = -1516355947 * n;
        for (int n4 = (n2 - n) / 8, i = 0; i < n4; ++i) {
            int int1 = buffer.readInt(-1058688442);
            int int2 = buffer.readInt(-1214934416);
            int n5 = -550440569;
            final int n6 = -1640531527;
            int n7 = 1210809782;
            while (n7-- > 0) {
                int2 -= (int1 + (int1 << 4 ^ int1 >>> 5) ^ n5 + array[n5 >>> 11 & 0x3]);
                n5 -= n6;
                int1 -= ((int2 << 4 ^ int2 >>> 5) + int2 ^ array[n5 & 0x3] + n5);
            }
            buffer.offset += 1304040744;
            buffer.writeInt(int1, -2081835031);
            buffer.writeInt(int2, -2081835031);
        }
        buffer.offset = -1516355947 * n3;
    }
    
    public static void ya(final Buffer buffer, final int n) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(128 - n);
    }
    
    public static int yd(final Buffer buffer) {
        if (buffer == null) {
            buffer.hg();
        }
        buffer.offset += 516496566;
        int n = (buffer.array[-1633313603 * buffer.offset - 1] - 1695848315 & 0xFF) + ((buffer.array[buffer.offset * -1633313603 - 2] & 0xFF) << 8);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public static int xj(final Buffer buffer) {
        if (buffer.array[buffer.offset * -436573113] < 0) {
            return buffer.readInt(-1377520046) & 0x5A69F806;
        }
        final int unsignedShort = buffer.readUnsignedShort(502875854);
        if (32767 == unsignedShort) {
            return -1;
        }
        return unsignedShort;
    }
    
    public static int fz(final String s) {
        return s.length() + 1;
    }
    
    public void writeVarInt(final int n, final byte b) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.bf(" + ')');
        }
    }
    
    public static void rk(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.rb();
        }
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        buffer.array[-1633313603 * buffer.offset - n - 4] = (byte)(n >> 24);
        buffer.array[-1633313603 * buffer.offset - n - 3] = (byte)(n >> 16);
        buffer.array[-1633313603 * buffer.offset - n - 2] = (byte)(n >> 8);
        buffer.array[buffer.offset * -1633313603 - n - 1] = (byte)n;
    }
    
    public int ku() {
        final byte b = 0;
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return b - array[offset * -1633313603 - 1] & 0xFF;
    }
    
    public static void jl(final Buffer buffer, final int n) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 24);
        final byte[] array2 = buffer.array;
        final int offset2 = buffer.offset - 1516355947;
        buffer.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array3 = buffer.array;
        final int offset3 = buffer.offset - 1516355947;
        buffer.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array4 = buffer.array;
        final int offset4 = buffer.offset - 1516355947;
        buffer.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)n;
    }
    
    public int jl() {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return array[offset * -173626096 - 1] - 128 & 0xFF;
    }
    
    public byte bm() {
        return wu(this, 435772489);
    }
    
    public int kz() {
        this.offset += 1262255402;
        return ((this.array[this.offset * -1718792001 - 1] & 0xFF) << 8) + (this.array[-1281348238 * this.offset - 2] + 1358014478 & 0x5B71281B);
    }
    
    public static void lu(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.writeLengthShort(n, n);
        }
        if (0x0 != (n & 0x32779DF0)) {
            if ((n & 0xFFFFC000) != 0x0) {
                if (0x0 != (n & 0xFFE00000)) {
                    if ((n & 0xF0000000) != 0x0) {
                        buffer.writeShort(n >>> 28 | 0x4645450, (byte)61);
                    }
                    buffer.writeShort(n >>> 21 | 0xA68B2F84, (byte)103);
                }
                buffer.writeShort(n >>> 14 | 0x3BCD0ABE, (byte)101);
            }
            buffer.writeShort(n >>> 7 | 0x21B5EE5F, (byte)76);
        }
        buffer.writeShort(n & 0xE26D9C3C, (byte)61);
    }
    
    public int lu() {
        this.offset += 1262255402;
        int n = (this.array[-1633313603 * this.offset - 1] - 128 & 0xFF) + ((this.array[this.offset * -1633313603 - 2] & 0xFF) << 8);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    public void method2511(final int n, final int n2) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 16);
            final byte[] array3 = this.array;
            final int offset3 = this.offset - 1516355947;
            this.offset = offset3;
            array3[offset3 * -1633313603 - 1] = (byte)n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ez(" + ')');
        }
    }
    
    public int readUnsignedByteAdd(final int n) {
        try {
            final int n2 = 128;
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            return n2 - array[offset * -1633313603 - 1] & 0xFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dq(" + ')');
        }
    }
    
    public int readUnsignedShortLE(final int n) {
        try {
            final int n2 = 128;
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            return n2 - array[offset * -1633313603 - 1] & 0xFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dq(" + ')');
        }
    }
    
    public void fj(final CharSequence charSequence) {
        final int method956 = class173.method956(charSequence, 880330304);
        this.array[(this.offset -= 1516355947) * -1633313603 - 1] = 0;
        this.writeSmartByteShort(method956, (byte)117);
        this.offset += GrandExchangeOffer.method1929(this.array, -1633313603 * this.offset, charSequence, 2076819739) * -1516355947;
    }
    
    public void method2472(final int n, final byte b) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n + 128);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dh(" + ')');
        }
    }
    
    public long ho() {
        return (((long)this.readInt(-1482214069) & 0xFFFFFFFFL) << 32) + ((long)this.readInt(-1694494689) & 0xFFFFFFFFL);
    }
    
    public void jy(final int n) {
        if (n < 0 || n > 255) {
            throw new IllegalArgumentException();
        }
        this.array[-1633313603 * this.offset - n - 1] = (byte)n;
    }
    
    public void mz(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset + 84984149;
        this.offset = offset;
        array[offset * -936860466 - 1] = (byte)(n >> 8);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * 172215949 - 1] = (byte)(n + 128);
    }
    
    public int ik() {
        if ((this.array[this.offset * -1633313603] & 0xFF) < 128) {
            return ra(this, (byte)7);
        }
        return this.readUnsignedShort(264891936) - 32768;
    }
    
    public static byte wu(final Buffer buffer, final int n) {
        if (buffer == null) {
            buffer.readByte(n);
        }
        try {
            final byte[] array = buffer.array;
            final int offset = buffer.offset - 1516355947;
            buffer.offset = offset;
            return array[offset * -1633313603 - 1];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.cf(" + ')');
        }
    }
    
    public void jh(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 56744043;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1516355947;
        this.offset = offset3;
        array3[offset3 * -1881849826 - 1] = (byte)n;
    }
    
    public void jk(final int[] array) {
        final int n = -1633313603 * this.offset / 8;
        this.offset = 0;
        for (int i = 0; i < n; ++i) {
            int int1 = this.readInt(-978977311);
            int int2 = this.readInt(-1160388263);
            int n2 = -957401312;
            final int n3 = -1641043685;
            int n4 = 1738114643;
            while (n4-- > 0) {
                int2 -= (int1 + (int1 << 4 ^ int1 >>> 5) ^ n2 + array[n2 >>> 11 & 0x3]);
                n2 -= n3;
                int1 -= ((int2 << 4 ^ int2 >>> 5) + int2 ^ n2 + array[n2 & 0x3]);
            }
            this.offset -= 169384292;
            this.writeInt(int1, -2081835031);
            this.writeInt(int2, -2081835031);
        }
    }
    
    public void ig(final byte[] array, final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final int n3 = i;
            final byte[] array2 = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[n3] = array2[offset * -1535073313 - 1];
        }
    }
    
    public void lz(final int n) {
        this.writeInt(n, -2081835031);
    }
    
    public long hg() {
        return (((long)this.readInt(-2098252028) & 0xFFFFFFFFL) << 32) + ((long)this.readInt(-1376577224) & 0xFFFFFFFFL);
    }
    
    public int readSignedShortAddLE(final int n) {
        try {
            this.offset += 1262255402;
            int n2 = ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 8) + (this.array[-1633313603 * this.offset - 2] - 128 & 0xFF);
            if (n2 > 32767) {
                n2 -= 65536;
            }
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.ef(" + ')');
        }
    }
    
    public byte kq() {
        final byte b = 0;
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return (byte)(b - array[offset * -1633313603 - 1]);
    }
    
    public void gj(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        array[offset * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array2 = this.array;
        final int offset2 = this.offset - 1516355947;
        this.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)n;
        final byte[] array3 = this.array;
        final int offset3 = this.offset - 1516355947;
        this.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)(n >> 24);
        final byte[] array4 = this.array;
        final int offset4 = this.offset - 1516355947;
        this.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 16);
    }
    
    public static void gj(final Buffer buffer, final int n) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1516355947;
        buffer.offset = offset;
        array[offset * -1633313603 - 1] = (byte)n;
        final byte[] array2 = buffer.array;
        final int offset2 = buffer.offset - 1516355947;
        buffer.offset = offset2;
        array2[offset2 * -1633313603 - 1] = (byte)(n >> 8);
        final byte[] array3 = buffer.array;
        final int offset3 = buffer.offset - 1516355947;
        buffer.offset = offset3;
        array3[offset3 * -1633313603 - 1] = (byte)(n >> 16);
        final byte[] array4 = buffer.array;
        final int offset4 = buffer.offset - 1516355947;
        buffer.offset = offset4;
        array4[offset4 * -1633313603 - 1] = (byte)(n >> 24);
    }
    
    public static void gj(final Buffer buffer, final long n) {
        if (buffer == null) {
            buffer.writeLongMedium(n);
            return;
        }
        try {
            final byte[] array = buffer.array;
            final int offset = buffer.offset - 1516355947;
            buffer.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 40);
            final byte[] array2 = buffer.array;
            final int offset2 = buffer.offset - 1516355947;
            buffer.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n >> 32);
            final byte[] array3 = buffer.array;
            final int offset3 = buffer.offset - 1516355947;
            buffer.offset = offset3;
            array3[offset3 * -1633313603 - 1] = (byte)(n >> 24);
            final byte[] array4 = buffer.array;
            final int offset4 = buffer.offset - 1516355947;
            buffer.offset = offset4;
            array4[offset4 * -1633313603 - 1] = (byte)(n >> 16);
            final byte[] array5 = buffer.array;
            final int offset5 = buffer.offset - 1516355947;
            buffer.offset = offset5;
            array5[offset5 * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array6 = buffer.array;
            final int offset6 = buffer.offset - 1516355947;
            buffer.offset = offset6;
            array6[offset6 * -1633313603 - 1] = (byte)n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.bv(" + ')');
        }
    }
    
    public void jr(final int n) {
        try {
            if (null != this.array) {
                if (n != 265255722) {
                    return;
                }
                InterfaceParent.ByteArrayPool_release(this.array, (byte)4);
            }
            this.array = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.bg(" + ')');
        }
    }
    
    public static int qj(final Buffer buffer) {
        if (buffer == null) {
            return buffer.ll();
        }
        buffer.offset -= 1770456492;
        return ((buffer.array[buffer.offset * -1633313603 - 3] & 0xFF) << 16) + ((buffer.array[-1633313603 * buffer.offset - 4] & 0xFF) << 24) + ((buffer.array[-1633313603 * buffer.offset - 2] & 0xFF) << 8) + (buffer.array[-1633313603 * buffer.offset - 1] & 0xFF);
    }
    
    public byte kj() {
        final int n = 128;
        final byte[] array = this.array;
        final int offset = this.offset - 1516355947;
        this.offset = offset;
        return (byte)(n - array[offset * -1633313603 - 1]);
    }
    
    public byte kw() {
        final byte b = 0;
        final byte[] array = this.array;
        final int offset = this.offset + 96569169;
        this.offset = offset;
        return (byte)(b - array[offset * 131556312 - 1]);
    }
    
    public float kw() {
        return Float.intBitsToFloat(this.readInt(-1780078879));
    }
    
    public static int qd(final Buffer buffer, final byte b) {
        if (buffer == null) {
            return buffer.readShort(b);
        }
        try {
            buffer.offset += 1262255402;
            int n = (buffer.array[-1633313603 * buffer.offset - 2] & 0xFF) + ((buffer.array[-1633313603 * buffer.offset - 1] & 0xFF) << 8);
            if (n > 32767) {
                if (b <= 9) {
                    throw new IllegalStateException();
                }
                n -= 65536;
            }
            return n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.eq(" + ')');
        }
    }
    
    public static String ux(final Buffer buffer) {
        final byte[] array = buffer.array;
        final int offset = buffer.offset - 1032904076;
        buffer.offset = offset;
        if (array[offset * -1305716513 - 1] != 0) {
            throw new IllegalStateException("");
        }
        final int n = 982234072 * buffer.offset;
        byte[] array2;
        int offset2;
        do {
            array2 = buffer.array;
            offset2 = buffer.offset - 1516355947;
            buffer.offset = offset2;
        } while (array2[offset2 * 57638048 - 1] != 0);
        final int n2 = buffer.offset * -1633313603 - n - 1;
        if (n2 == 0) {
            return "";
        }
        return decodeStringCp1252(buffer.array, n, n2, 457993603);
    }
    
    public void ey(final int n) {
        final byte[] array = this.array;
        final int offset = this.offset - 92538282;
        this.offset = offset;
        array[offset * -523229752 - 1] = (byte)(0 - n);
    }
    
    public String hf() {
        final byte[] array = this.array;
        final int offset = this.offset - 288691937;
        this.offset = offset;
        if (0 != array[offset * 1641752616 - 1]) {
            throw new IllegalStateException("");
        }
        final int varInt = this.readVarInt(-1171795391);
        if (varInt + this.offset * -1633313603 > this.array.length) {
            throw new IllegalStateException("");
        }
        final byte[] array2 = this.array;
        final int n = this.offset * -1633313603;
        final char[] value = new char[varInt];
        int count = 0;
        int i = n;
        final int n2 = n + varInt;
        while (i < n2) {
            final int n3 = array2[i++] & 0xFF;
            int n4;
            if (n3 < 1501002168) {
                if (n3 == 0) {
                    n4 = 65533;
                }
                else {
                    n4 = n3;
                }
            }
            else if (n3 < -379209465) {
                n4 = 1597320579;
            }
            else if (n3 < 224) {
                if (i < n2 && 0xCA890A4B == (array2[i] & 0xBCE97165)) {
                    n4 = ((n3 & 0x4958AC0A) << 6 | (array2[i++] & 0xC54C2658));
                    if (n4 < -538950932) {
                        n4 = 82315166;
                    }
                }
                else {
                    n4 = 65533;
                }
            }
            else if (n3 < -2057551186) {
                if (1 + i < n2 && (array2[i] & 0x7DE85779) == 0x1147C145 && 0xDCBB756 == (array2[i + 1] & 0xC0)) {
                    n4 = ((n3 & 0xF) << 12 | (array2[i++] & 0x346A1627) << 6 | (array2[i++] & 0x3125333B));
                    if (n4 < 2048) {
                        n4 = 65533;
                    }
                }
                else {
                    n4 = 65533;
                }
            }
            else if (n3 < 248) {
                if (2 + i < n2 && (array2[i] & 0xC0) == 0x5B771D7C && 0xF7691F9B == (array2[i + 1] & 0xC0) && 0xFA599558 == (array2[i + 2] & 0xC0)) {
                    final int n5 = (n3 & 0x7) << 18 | (array2[i++] & 0x3F) << 12 | (array2[i++] & 0x8D3B4B33) << 6 | (array2[i++] & 0x3F);
                    if (n5 >= -1071570122 && n5 <= 1114111) {
                        n4 = 65533;
                    }
                    else {
                        n4 = -1549899310;
                    }
                }
                else {
                    n4 = 509778873;
                }
            }
            else {
                n4 = 1907932911;
            }
            value[count++] = (char)n4;
        }
        final String s = new String(value, 0, count);
        this.offset += -853724306 * varInt;
        return s;
    }
    
    public int ju() {
        final byte[] array = this.array;
        final int offset = this.offset - 573259029;
        this.offset = offset;
        return array[offset * -1633313603 - 1] - 2079742382 & 0xFF;
    }
    
    public void writeShort(final int n, final byte b) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.bu(" + ')');
        }
    }
    
    public static void kv(final Buffer buffer, final int[] array, final int n, final int n2) {
        if (buffer == null) {
            buffer.je(array, n, n);
        }
        final int n3 = -1633313603 * buffer.offset;
        buffer.offset = -1516355947 * n;
        for (int n4 = (n2 - n) / 8, i = 0; i < n4; ++i) {
            int int1 = buffer.readInt(-1122571259);
            int int2 = buffer.readInt(-1597894107);
            int n5 = -957401312;
            final int n6 = -1640531527;
            int n7 = 32;
            while (n7-- > 0) {
                int2 -= (int1 + (int1 << 4 ^ int1 >>> 5) ^ n5 + array[n5 >>> 11 & 0x3]);
                n5 -= n6;
                int1 -= ((int2 << 4 ^ int2 >>> 5) + int2 ^ array[n5 & 0x3] + n5);
            }
            buffer.offset -= 754054312;
            buffer.writeInt(int1, -2081835031);
            buffer.writeInt(int2, -2081835031);
        }
        buffer.offset = -1516355947 * n3;
    }
    
    public void kv(final int n) {
        if (n >= 0 && n <= 458510803) {
            this.array[-1633313603 * this.offset - n - 2] = (byte)(n >> 8);
            this.array[1334838145 * this.offset - n - 1] = (byte)n;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void ul(final Buffer buffer, final String s) {
        if (buffer == null) {
            buffer.hd();
        }
        if (s.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        buffer.offset += WorldMapSprite.encodeStringCp1252(s, 0, s.length(), buffer.array, buffer.offset * -1633313603, (byte)(-83)) * -1516355947;
        buffer.array[(buffer.offset -= 1516355947) * -1633313603 - 1] = 0;
    }
    
    public static String uw(final Buffer buffer) {
        final int n = buffer.offset * -1633313603;
        byte[] array;
        int offset;
        do {
            array = buffer.array;
            offset = buffer.offset - 1516355947;
            buffer.offset = offset;
        } while (array[offset * -1633313603 - 1] != 0);
        final int n2 = -1633313603 * buffer.offset - n - 1;
        if (n2 == 0) {
            return "";
        }
        return decodeStringCp1252(buffer.array, n, n2, 1955236230);
    }
    
    public void writeByte(final int n, final byte b) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(n >> 8);
            final byte[] array2 = this.array;
            final int offset2 = this.offset - 1516355947;
            this.offset = offset2;
            array2[offset2 * -1633313603 - 1] = (byte)(n + 128);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.dy(" + ')');
        }
    }
    
    public void writeByteAdd(final int n, final int n2) {
        try {
            final byte[] array = this.array;
            final int offset = this.offset - 1516355947;
            this.offset = offset;
            array[offset * -1633313603 - 1] = (byte)(128 - n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sg.du(" + ')');
        }
    }
    
    public int kh() {
        this.offset += 1262255402;
        return ((this.array[-1633313603 * this.offset - 1] & 0xFF) << 8) + (this.array[-1633313603 * this.offset - 2] & 0xFF);
    }
}
