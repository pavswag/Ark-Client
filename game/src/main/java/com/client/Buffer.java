package com.client;

import java.math.BigInteger;

import com.client.sign.Signlink;
import net.runelite.rs.api.RSBuffer;

public final class Buffer extends Cacheable implements RSBuffer {

    public int read24Int() {
        pos += 3;
        return ((payload[pos - 3] & 0xff) << 16) + ((payload[pos - 2] & 0xff) << 8) + (payload[pos - 1] & 0xff);
    }

    public String readStrings() {
        int i = pos;
        while (payload[pos++] != 10)
            ;
        return new String(payload, i, pos - i - 1);
    }

    private static final BigInteger RSA_MODULUS = new BigInteger("96370464727586244907903973058763258117048532334065862720521262492088970511731601575030921891846663359720755630098868394757646117422826305205080472054291366098813928280866698443277715451560286347696280565121776070700241218786623905308675075753718153290901069871878126335032945490768786190504888143766468577251");
    private static final BigInteger RSA_EXPONENT = new BigInteger("65537");

    public static Buffer create() {
        synchronized (nodeList) {
            Buffer stream = null;
            if (anInt1412 > 0) {
                anInt1412--;
                stream = (Buffer) nodeList.popHead();
            }
            if (stream != null) {
                stream.pos = 0;
                return stream;
            }
        }
        Buffer stream_1 = new Buffer();
        stream_1.pos = 0;
        stream_1.payload = new byte[RSSocket.SIZE];
        return stream_1;
    }

    public int getSmart() {
        try {
            // checks current without modifying position
            if (pos >= payload.length) {
                return payload[payload.length - 1] & 0xFF;
            }
            int value = payload[pos] & 0xFF;

            if (value < 128) {
                return readUnsignedByte();
            } else {
                return readUShortA() - 32768;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return readUShortA() - 32768;
        }
    }

    public static Buffer create(int initialCapacity) {
        synchronized (nodeList) {
            Buffer stream = null;
            if (anInt1412 > 0) {
                anInt1412--;
                stream = (Buffer) nodeList.popHead();
            }
            if (stream != null) {
                stream.pos = 0;
                return stream;
            }
        }
        Buffer stream_1 = new Buffer();
        stream_1.pos = 0;
        stream_1.payload = new byte[initialCapacity];
        return stream_1;
    }

    public Buffer() {
    }

    public byte[] getData(byte[] buffer2) {
        for (int i = 0; i < buffer2.length; i++)
            buffer2[i] = payload[pos++];
        return buffer2;
    }


    public static int allocatedMinCount = 0;

    public static int allocatedMidCount = 0;

    public static int allocatedMaxCount = 0;

    public static final byte[][] allocatedMin = new byte[1000][];

    public static final byte[][] allocatedMid = new byte[250][];

    public static final byte[][] allocatedMax = new byte[50][];

    public static synchronized byte[] allocate(int length) {
        byte[] data;
        if (length == 100 && allocatedMinCount > 0) {
            data = allocatedMin[--allocatedMinCount];
            allocatedMin[allocatedMinCount] = null;
            return data;
        } else if (length == 5000 && allocatedMidCount > 0) {
            data = allocatedMid[--allocatedMidCount];
            allocatedMid[allocatedMidCount] = null;
            return data;
        } else if (length == 30000 && allocatedMaxCount > 0) {
            data = allocatedMax[--allocatedMaxCount];
            allocatedMax[allocatedMaxCount] = null;
            return data;
        } else {
            return new byte[length];
        }
    }
    public Buffer(int size) {
        this.payload = allocate(size);
        this.pos = 0;
    }
    public Buffer(byte abyte0[]) {
        payload = abyte0;
        pos = 0;
    }

    public void createFrame(int i) {
        if (Configuration.developerMode)
            Client.instance.devConsole.print_message("Outgoing Packet " + i, 0);
        payload[pos++] = (byte) (i + encryption.getNextKey());
    }

    public void writeUnsignedByte(int i) {
        payload[pos++] = (byte) i;
    }

    final int v(int i) {
        pos += 3;
        return (0xff & payload[pos - 3] << 16)
                + (0xff & payload[pos - 2] << 8)
                + (0xff & payload[pos - 1]);
    }

    public int readUnsignedByte2() {
        return -263;
    }

    public int g2() {
        pos += 2;
        return ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] & 0xff);
    }

    public int g4() {
        pos += 4;
        return ((payload[pos - 4] & 0xff) << 24)
                + ((payload[pos - 3] & 0xff) << 16)
                + ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] & 0xff);
    }

    public int readShort2() {
        pos += 2;
        int i = ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] & 0xff);
        if (i > 60000)
            i = -65535 + i;
        return i;

    }

    public int readUSmart2() {
        int baseVal = 0;
        int lastVal = 0;
        while ((lastVal = readSmart()) == 32767) {
            baseVal += 32767;
        }
        return baseVal + lastVal;
    }

    public int readShort() {
        pos += 2;
        int value = ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] & 0xff);

        if (value > 32767) {
            value -= 0x10000;
        }
        return value;
    }

    public String readNewString() {
        int i = pos;
        while (payload[pos++] != 0)
            ;
        return new String(payload, i, pos - i - 1);
    }

    public void writeWord(int i) {
        payload[pos++] = (byte) (i >> 8);
        payload[pos++] = (byte) i;
    }

    public void method400(int i) {
        payload[pos++] = (byte) i;
        payload[pos++] = (byte) (i >> 8);
    }

    public void writeDWordBigEndian(int i) {
        payload[pos++] = (byte) (i >> 16);
        payload[pos++] = (byte) (i >> 8);
        payload[pos++] = (byte) i;
    }

    public void writeInt(int i) {
        payload[pos++] = (byte) (i >> 24);
        payload[pos++] = (byte) (i >> 16);
        payload[pos++] = (byte) (i >> 8);
        payload[pos++] = (byte) i;
    }

    @Override
    public void writeLong(long var1) {

    }

    @Override
    public void writeStringCp1252NullTerminated(String string) {

    }

    public void method403(int j) {
        payload[pos++] = (byte) j;
        payload[pos++] = (byte) (j >> 8);
        payload[pos++] = (byte) (j >> 16);
        payload[pos++] = (byte) (j >> 24);
    }

    public void writeQWord(long l) {
        try {
            payload[pos++] = (byte) (int) (l >> 56);
            payload[pos++] = (byte) (int) (l >> 48);
            payload[pos++] = (byte) (int) (l >> 40);
            payload[pos++] = (byte) (int) (l >> 32);
            payload[pos++] = (byte) (int) (l >> 24);
            payload[pos++] = (byte) (int) (l >> 16);
            payload[pos++] = (byte) (int) (l >> 8);
            payload[pos++] = (byte) (int) l;
        } catch (RuntimeException runtimeexception) {
            Signlink.reporterror("14395, " + 5 + ", " + l + ", "
                    + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void writeString(String s) {
        System.arraycopy(s.getBytes(), 0, payload, pos, s.length());
        pos += s.length();
        payload[pos++] = 10;
    }

    public void writeBytes(byte abyte0[], int length, int startingPosition) {
        for (int k = startingPosition; k < startingPosition + length; k++)
            payload[pos++] = abyte0[k];
    }

    public void writeHiddenString(String string) {
        writeByte(string.length());
        byte[] stringBytes = string.getBytes();
        for (int index = 0; index < stringBytes.length; index++)
            stringBytes[index] += 15;
        writeBytes(stringBytes, stringBytes.length, 0);
    }

    public String readHiddenString() {
        int length = readUnsignedByte();
        byte[] stringBytes = new byte[length];
        for (int index = 0; index < length; index++) {
            stringBytes[index] = (byte) (readUnsignedByte() - 15);
        }
        return new String(stringBytes);
    }

    public void writeByte(int i) {
        payload[pos++] = (byte) i;
    }

    public void writeCESU8(CharSequence charSequence) {
        int value = method868(charSequence);
        this.payload[++this.pos - 1] = 0;
        this.writeVarInt(value);
        this.pos += method3810(this.payload, this.pos, charSequence);
    }
    public static int method3810(byte[] output, int offset, CharSequence input) {
        int length = input.length();
        int outIndex = offset;

        for (int currentChar = 0; currentChar < length; ++currentChar) {
            char charAt = input.charAt(currentChar);
            if (charAt <= 127) {
                output[outIndex++] = (byte) charAt;
            } else if (charAt <= 2047) {
                output[outIndex++] = (byte) (192 | charAt >> 6);
                output[outIndex++] = (byte) (128 | charAt & 63);
            } else {
                output[outIndex++] = (byte) (224 | charAt >> 12);
                output[outIndex++] = (byte) (128 | charAt >> 6 & 63);
                output[outIndex++] = (byte) (128 | charAt & 63);
            }
        }

        return outIndex - offset;
    }
    public static int method868(CharSequence str) {
        int length = str.length();
        int byteLength = 0;

        for (int currentChar = 0; currentChar < length; ++currentChar) {
            char charAt = str.charAt(currentChar);
            if (charAt <= 127) {
                ++byteLength;
            } else if (charAt <= 2047) {
                byteLength += 2;
            } else {
                byteLength += 3;
            }
        }

        return byteLength;
    }

    public void writeSmartByteShort(int var1) {
        if (var1 >= 0 && var1 < 128) {
            this.writeByte(var1);
        } else if (var1 >= 0 && var1 < 32768) {
            this.writeShort(var1 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void writeVarInt(int var1) {
        if ((var1 & -128) != 0) { // L: 228
            if ((var1 & -16384) != 0) { // L: 229
                if ((var1 & -2097152) != 0) { // L: 230
                    if ((var1 & -268435456) != 0) { // L: 231
                        this.writeByte(var1 >>> 28 | 128);
                    }
                    this.writeByte(var1 >>> 21 | 128); // L: 232
                }
                this.writeByte(var1 >>> 14 | 128); // L: 234
            }
            this.writeByte(var1 >>> 7 | 128); // L: 236
        }
        this.writeByte(var1 & 127); // L: 238
    }

    public void writeBytes(int i) {
        payload[pos - i - 1] = (byte) i;
    }

    public int read24BitInt()
    {
        return (this.readUnsignedByte() << 16) + (this.readUnsignedByte() << 8) + this.readUnsignedByte();
    }

    public int readUnsignedByte() {
        return payload[pos++] & 0xff;
    }
    public int readLargeSmart() {
        return this.payload[this.pos] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUShort();
    }

    public byte readSignedByte() {
        return payload[pos++];
    }

    public int readTriByte() {
        pos += 3;
        return ((payload[pos - 3] & 0xff) << 16)
                + ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] & 0xff);
    }


    public int readUShort() {
        pos += 2;
        return ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] & 0xff);
    }

    public int readUnsignedShort() {
        this.pos += 2;
        return (this.payload[this.pos - 1] & 255) + ((this.payload[this.pos - 2] & 255) << 8);
    }

    public int method1606() {
        int var2 = 0;

        int var3;
        for (var3 = this.readUShortSmart(); var3 == 32767; var3 = this.readUShortSmart()) {
            var2 += 32767;
        }

        var2 += var3;
        return var2;
    }

    public int readUShortSmart() {
        int var2 = this.payload[this.pos] & 0xFF;
        return var2 < 128 ? this.readUnsignedByte() - 1 : this.readUShort() - 0x8001;
    }

    public int readSignedWord() {
        pos += 2;
        int i = ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] & 0xff);
        if (i > 32767)
            i -= 0x10000;
        return i;
    }

    public int read3Bytes() {
        pos += 3;
        return ((payload[pos - 3] & 0xff) << 16)
                + ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] & 0xff);
    }

    public int readDWord() {
        pos += 4;
        return ((payload[pos - 4] & 0xff) << 24)
                + ((payload[pos - 3] & 0xff) << 16)
                + ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] & 0xff);
    }

    public long readQWord() {
        long l = readDWord() & 0xffffffffL;
        long l1 = readDWord() & 0xffffffffL;
        return (l << 32) + l1;
    }

    public String readString() {
        int i = pos;
        while (payload[pos++] != 10)
            ;
        return new String(payload, i, pos - i - 1);
    }

    public String readNullTerminatedString() {
        int i = pos;
        while (payload[pos++] != 0)
            ;
        return new String(payload, i, pos - i - 1);
    }

    private static final char[] OSRS_CHARACTERS = new char[]
            {
                    '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026',
                    '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039',
                    '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018',
                    '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014',
                    '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000',
                    '\u017e', '\u0178'
            };

    public String readOSRSString()
    {
        StringBuilder sb = new StringBuilder();

        for (; ; )
        {
            int ch = this.readUnsignedByte();

            if (ch == 0)
            {
                break;
            }

            if (ch >= 128 && ch < 160)
            {
                char var7 = OSRS_CHARACTERS[ch - 128];
                if (0 == var7)
                {
                    var7 = '?';
                }

                ch = var7;
            }

            sb.append((char) ch);
        }
        return sb.toString();
    }

    public byte[] readBytes() {
        int i = pos;
        while (payload[pos++] != 10)
            ;
        byte abyte0[] = new byte[pos - i - 1];
        System.arraycopy(payload, i, abyte0, i - i, pos - 1 - i);
        return abyte0;
    }

    public void readBytes(int length, int offset, byte abyte0[]) {
        for (int l = offset; l < offset + length; l++)
            abyte0[l] = payload[pos++];
    }

    public void readBytes(byte[] var1, int var2, int var3) {
        for (int var4 = var2; var4 < var3 + var2; ++var4) {
            var1[var4] = this.payload[++this.pos - 1];
        }
    }

    public void initBitAccess() {
        bitPosition = pos * 8;
    }


    public int bitsRemaining(int var1) {
        return var1 * 8 - this.bitPosition;
    }
    public int readBits(int var1) {
        int var2 = this.bitPosition >> 3;
        int var3 = 8 - (this.bitPosition & 7);
        int var4 = 0;

        for (this.bitPosition += var1; var1 > var3; var3 = 8) {
            var4 += (payload[var2++] & anIntArray1409[var3]) << var1 - var3;
            var1 -= var3;
        }

        if (var3 == var1) {
            var4 += payload[var2] & anIntArray1409[var3];
        } else {
            var4 += payload[var2] >> var3 - var1 & anIntArray1409[var1];
        }

        return var4;
    }

    public void finishBitAccess() {
        pos = (bitPosition + 7) / 8;
    }

    public int method421() {
        try {
            int i = payload[pos] & 0xff;
            if (i < 128)
                return readUnsignedByte() - 64;
            else
                return readUShort() - 49152;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void doKeys() {
        int i = pos;
        pos = 0;
        byte abyte0[] = new byte[i];
        readBytes(i, 0, abyte0);
        BigInteger biginteger2 = new BigInteger(abyte0);
        BigInteger biginteger3 = biginteger2.modPow(RSA_EXPONENT, RSA_MODULUS);
        byte abyte1[] = biginteger3.toByteArray();
        pos = 0;
        writeUnsignedByte(abyte1.length);
        writeBytes(abyte1, abyte1.length, 0);
    }

    public void method424(int i) {
        payload[pos++] = (byte) (-i);
    }

    public void method425(int j) {
        payload[pos++] = (byte) (128 - j);
    }

    public int method426() {
        return payload[pos++] - 128 & 0xff;
    }

    public int method427() {
        return -payload[pos++] & 0xff;
    }

    public int method428() {
        return 128 - payload[pos++] & 0xff;
    }

    public byte method429() {
        return (byte) (-payload[pos++]);
    }

    public byte method430() {
        return (byte) (128 - payload[pos++]);
    }

    public void method431(int i) {
        payload[pos++] = (byte) i;
        payload[pos++] = (byte) (i >> 8);
    }

    public void method432(int j) {
        payload[pos++] = (byte) (j >> 8);
        payload[pos++] = (byte) (j + 128);
    }

    public void method433(int j) {
        payload[pos++] = (byte) (j + 128);
        payload[pos++] = (byte) (j >> 8);
    }

    public int method434() {
        pos += 2;
        return ((payload[pos - 1] & 0xff) << 8)
                + (payload[pos - 2] & 0xff);
    }

    public int readUShortA() {
        pos += 2;
        return ((payload[pos - 2] & 0xff) << 8)
                + (payload[pos - 1] - 128 & 0xff);
    }

    public int method436() {
        pos += 2;
        return ((payload[pos - 1] & 0xff) << 8)
                + (payload[pos - 2] - 128 & 0xff);
    }

    public int method437() {
        pos += 2;
        int j = ((payload[pos - 1] & 0xff) << 8)
                + (payload[pos - 2] & 0xff);
        if (j > 32767)
            j -= 0x10000;
        return j;
    }

    public int method438() {
        pos += 2;
        int j = ((payload[pos - 1] & 0xff) << 8)
                + (payload[pos - 2] - 128 & 0xff);
        if (j > 32767)
            j -= 0x10000;
        return j;
    }

    public int method439() {
        pos += 4;
        return ((payload[pos - 2] & 0xff) << 24)
                + ((payload[pos - 1] & 0xff) << 16)
                + ((payload[pos - 4] & 0xff) << 8)
                + (payload[pos - 3] & 0xff);
    }

    public int method440() {
        pos += 4;
        return ((payload[pos - 3] & 0xff) << 24)
                + ((payload[pos - 4] & 0xff) << 16)
                + ((payload[pos - 1] & 0xff) << 8)
                + (payload[pos - 2] & 0xff);
    }
    public int readUnsignedIntSmartShortCompat() {
        int var1 = 0;

        int var2;
        for (var2 = this.readUSmart(); var2 == 32767; var2 = this.readUSmart()) {
            var1 += 32767;
        }

        var1 += var2;
        return var1;
    }

    public int readUSmart() {
        int peek = payload[pos] & 0xFF;
        return peek < 128 ? this.readUnsignedByte() : this.readUShort() - 0x8000;
    }
    public int readSmart() {
        int value = payload[pos] & 0xFF;
        if (value < 128) {
            return readUnsignedByte() - 64;
        } else {
            return readUShort() - 49152;
        }
    }

    @Override
    public byte[] getPayload() {
        return new byte[0];
    }

    @Override
    public int getOffset() {
        return 0;
    }

    public void setOffset(int var11) {
        pos = var11;
    }
    public void method441(int i, byte abyte0[], int j) {
        for (int k = (i + j) - 1; k >= i; k--)
            payload[pos++] = (byte) (abyte0[k] + 128);

    }

    public void method442(int i, int j, byte abyte0[]) {
        for (int k = (j + i) - 1; k >= j; k--)
            abyte0[k] = payload[pos++];

    }
    public int getUIncrementalSmart() {
        int value = 0, remainder;
        for (remainder = readUSmart(); remainder == 32767; remainder = readUSmart()) {
            value += 32767;
        }
        value += remainder;
        return value;
    }
    public int getLength() {
        return payload.length;
    }

    public byte payload[];
    public int pos;
    public int bitPosition;
    public static final int[] anIntArray1409 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    public ISAACRandomGen encryption;
    public static int anInt1412;
    public static final Deque nodeList = new Deque();
    public byte readByte() {
        return this.payload[++this.pos - 1];
    }
    public int readInt() {
        pos += 4;
        return ((payload[pos - 4] & 0xff) << 24) + ((payload[pos - 3] & 0xff) << 16) + ((payload[pos - 2] & 0xff) << 8) + (payload[pos - 1] & 0xff);
    }

    public int readNextIntFromPayload() {
        pos += 4;
        return ((payload[pos - 1] & 0xff) << 24) + ((payload[pos - 2] & 0xff) << 16) + ((payload[pos - 3] & 0xff) << 8)
                + (payload[pos - 4] & 0xff);
    }
    public String readStringCp1252NullCircumfixed() {
        byte var1 = this.payload[++this.pos - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        } else {
            int var2 = this.pos;

            while (this.payload[++this.pos - 1] != 0) {
            }

            int var3 = this.pos - var2 - 1;
            return var3 == 0 ? "" : decodeStringCp1252(this.payload, var2, var3);
        }
    }
    public static final char[] cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
    public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
        char[] var3 = new char[var2];
        int var4 = 0;

        for (int var5 = 0; var5 < var2; ++var5) {
            int var6 = var0[var5 + var1] & 255;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = cp1252AsciiExtension[var6 - 128];
                    if (var7 == 0) {
                        var7 = '?';
                    }

                    var6 = var7;
                }

                var3[var4++] = (char)var6;
            }
        }

        return new String(var3, 0, var4);
    }
    @Override
    public String readStringCp1252NullTerminated() {
        return readNullTerminatedString();
    }


    public void xteaDecrypt(int[] data, int start, int end) {
        int position = this.pos;
        this.pos = start;
        int numBlocks = (end - start) / 8;

        for (int block = 0; block < numBlocks; ++block) {
            int v0 = this.readInt();
            int v1 = this.readInt();
            int sum = -957401312;
            int delta = -1640531527;

            for (int var11 = 32; var11-- > 0; v0 -= v1 + (v1 << 4 ^ v1 >>> 5) ^ sum + data[sum & 3]) {
                v1 -= v0 + (v0 << 4 ^ v0 >>> 5) ^ data[sum >>> 11 & 3] + sum;
                sum -= delta;
            }

            this.pos -= 8;
            this.writeInt(v0);
            this.writeInt(v1);
        }

        this.pos = position;
    }
    public void writeShort(int value) {
        payload[pos++] = (byte) (value >> 8);
        payload[pos++] = (byte) value;
    }

    @Override
    public void writeMedium(int var1) {
        this.payload[++this.pos - 1] = (byte) (var1 >> 16);
        this.payload[++this.pos - 1] = (byte) (var1 >> 8);
        this.payload[++this.pos - 1] = (byte) var1;
    }

    public int readVarInt() {
        byte var1 = this.payload[++this.pos - 1]; // L: 410
        int var2;
        for (var2 = 0; var1 < 0; var1 = this.payload[++this.pos - 1]) {
            var2 = (var2 | var1 & 127) << 7; // L: 413
        }
        return var2 | var1; // L: 416
    }
    public String readCESU8() {
        byte var1 = this.payload[++this.pos - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        } else {
            int var2 = this.readVarInt();
            if (var2 + this.pos > this.payload.length) {
                throw new IllegalStateException("");
            } else {
                byte[] var4 = this.payload;
                int var5 = this.pos;
                char[] var6 = new char[var2];
                int var7 = 0;
                int var8 = var5;

                int var11;
                for (int var9 = var2 + var5; var8 < var9; var6[var7++] = (char) var11) {
                    int var10 = var4[var8++] & 255;
                    if (var10 < 128) {
                        if (var10 == 0) {
                            var11 = 65533;
                        } else {
                            var11 = var10;
                        }
                    } else if (var10 < 192) {
                        var11 = 65533;
                    } else if (var10 < 224) {
                        if (var8 < var9 && (var4[var8] & 192) == 128) {
                            var11 = (var10 & 31) << 6 | var4[var8++] & 63;
                            if (var11 < 128) {
                                var11 = 65533;
                            }
                        } else {
                            var11 = 65533;
                        }
                    } else if (var10 < 240) {
                        if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) {
                            var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                            if (var11 < 2048) {
                                var11 = 65533;
                            }
                        } else {
                            var11 = 65533;
                        }
                    } else if (var10 < 248) {
                        if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) {
                            var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                            if (var11 >= 65536 && var11 <= 1114111) {
                                var11 = 65533;
                            } else {
                                var11 = 65533;
                            }
                        } else {
                            var11 = 65533;
                        }
                    } else {
                        var11 = 65533;
                    }
                }

                String var3 = new String(var6, 0, var7);
                this.pos += var2;
                return var3;
            }
        }
    }

    public int readNullableLargeSmart() {
        if (this.payload[this.pos] < 0) {
            return this.readInt() & Integer.MAX_VALUE;
        } else {
            int var1 = this.readUShort();
            return var1 == 32767 ? -1 : var1;
        }
    }


    public int readMedium() {
        this.pos += 3;
        return ((this.payload[this.pos - 3] & 255) << 16) + (this.payload[this.pos - 1] & 255) + ((this.payload[this.pos - 2] & 255) << 8);
    }

    public int readShortSmart() {
        int var1 = this.payload[this.pos] & 255;
        return var1 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - '쀀';
    }

    public void writeLengthInt(int var1) {
        if (var1 < 0) {
            throw new IllegalArgumentException();
        } else {
            this.payload[this.pos - var1 - 4] = (byte) (var1 >> 24);
            this.payload[this.pos - var1 - 3] = (byte) (var1 >> 16);
            this.payload[this.pos - var1 - 2] = (byte) (var1 >> 8);
            this.payload[this.pos - var1 - 1] = (byte) var1;
        }
    }

    public int readShortSmartSub() {
        int var1 = this.payload[this.pos] & 255;
        return var1 < 128 ? this.readUnsignedByte() - 1 : this.readUShort() - '老';
    }

    public int readShortOSRS() {
        this.pos += 2;
        int var1 = (this.payload[this.pos - 1] & 255) + ((this.payload[this.pos - 2] & 255) << 8);
        if (var1 > 32767) {
            var1 -= 65536;
        }

        return var1;
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readSmartByteorshort() {
        int value = payload[pos] & 0xFF;
        if (value < 128) {
            return readUnsignedByte() - 0x40;
        } else {
            return readUShort() - 0xc000;
        }
    }
}
