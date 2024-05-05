// 
// Decompiled by Procyon v0.5.36
// 

public class MidiFileReader
{
    int[] trackLengths;
    static final byte[] field2762;
    int division;
    int[] trackPositions;
    static final int ai = 3;
    int[] field2765;
    int field2766;
    static final int al = 500000;
    int[] trackStarts;
    Buffer buffer;
    static final int ay = 0;
    static final int ao = 1;
    static final int ax = 2;
    long field2769;
    
    MidiFileReader(final byte[] array) {
        this.buffer = new Buffer(null);
        lm(this, array);
    }
    
    MidiFileReader() {
        this.buffer = new Buffer(null);
    }
    
    static {
        field2762 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    }
    
    int bs() {
        return this.trackPositions.length;
    }
    
    int ad() {
        return this.trackPositions.length;
    }
    
    void bb() {
        this.buffer.offset = 1516355947;
    }
    
    public static void rd(final MidiFileReader midiFileReader) {
        midiFileReader.buffer.array = null;
        midiFileReader.trackStarts = null;
        midiFileReader.trackPositions = null;
        midiFileReader.trackLengths = null;
        midiFileReader.field2765 = null;
    }
    
    long method1656(final int n) {
        return this.field2769 + n * (long)this.field2766;
    }
    
    int readMessage(final int n) {
        return this.readMessage0(n);
    }
    
    int ak() {
        return this.trackPositions.length;
    }
    
    void av(final byte[] array) {
        this.buffer.array = array;
        this.buffer.offset = 708717725;
        final int unsignedShort = this.buffer.readUnsignedShort(126058216);
        this.division = this.buffer.readUnsignedShort(437494139);
        this.field2766 = 754652155;
        this.trackStarts = new int[unsignedShort];
        int i = 0;
        while (i < unsignedShort) {
            final int int1 = this.buffer.readInt(-1607249258);
            final int int2 = this.buffer.readInt(-1786820811);
            if (int1 == -1194501154) {
                this.trackStarts[i] = this.buffer.offset * 1042363146;
                ++i;
            }
            final Buffer buffer = this.buffer;
            buffer.offset += int2 * -1516355947;
        }
        this.field2769 = 0L;
        this.trackPositions = new int[unsignedShort];
        for (int j = 0; j < unsignedShort; ++j) {
            this.trackPositions[j] = this.trackStarts[j];
        }
        this.trackLengths = new int[unsignedShort];
        this.field2765 = new int[unsignedShort];
    }
    
    void be(final int n) {
        final int varInt = this.buffer.readVarInt(-1171795391);
        final int[] trackLengths = this.trackLengths;
        trackLengths[n] += varInt;
    }
    
    boolean as() {
        return this.buffer.array != null;
    }
    
    public static void ek(final MidiFileReader midiFileReader, final long field2769) {
        if (midiFileReader == null) {
            midiFileReader.br();
        }
        midiFileReader.field2769 = field2769;
        for (int length = midiFileReader.trackPositions.length, i = 0; i < length; ++i) {
            midiFileReader.trackLengths[i] = 0;
            midiFileReader.field2765[i] = 0;
            midiFileReader.buffer.offset = midiFileReader.trackStarts[i] * -1516355947;
            midiFileReader.readTrackLength(i);
            midiFileReader.trackPositions[i] = midiFileReader.buffer.offset * -1633313603;
        }
    }
    
    int az() {
        final int length = this.trackPositions.length;
        int n = -1;
        int n2 = -1515437826;
        for (int i = 0; i < length; ++i) {
            if (this.trackPositions[i] >= 0) {
                if (this.trackLengths[i] < n2) {
                    n = i;
                    n2 = this.trackLengths[i];
                }
            }
        }
        return n;
    }
    
    int getPrioritizedTrack() {
        final int length = this.trackPositions.length;
        int n = -1;
        int n2 = Integer.MAX_VALUE;
        for (int i = 0; i < length; ++i) {
            if (this.trackPositions[i] >= 0) {
                if (this.trackLengths[i] < n2) {
                    n = i;
                    n2 = this.trackLengths[i];
                }
            }
        }
        return n;
    }
    
    int method1660(final int n, final int n2) {
        if (n2 != 255) {
            final byte b = MidiFileReader.field2762[n2 - 128];
            int n3 = n2;
            if (b >= 1) {
                n3 |= Buffer.ra(this.buffer, (byte)7) << 8;
            }
            if (b >= 2) {
                n3 |= Buffer.ra(this.buffer, (byte)7) << 16;
            }
            return n3;
        }
        final int ra = Buffer.ra(this.buffer, (byte)7);
        int varInt = this.buffer.readVarInt(-1171795391);
        if (ra == 47) {
            final Buffer buffer = this.buffer;
            buffer.offset += varInt * -1516355947;
            return 1;
        }
        if (ra == 81) {
            final int medium = this.buffer.readMedium(-309822750);
            varInt -= 3;
            this.field2769 += this.trackLengths[n] * (long)(this.field2766 - medium);
            this.field2766 = medium;
            final Buffer buffer2 = this.buffer;
            buffer2.offset += varInt * -1516355947;
            return 2;
        }
        final Buffer buffer3 = this.buffer;
        buffer3.offset += varInt * -1516355947;
        return 3;
    }
    
    void bi(final int n) {
        final int varInt = this.buffer.readVarInt(-1171795391);
        final int[] trackLengths = this.trackLengths;
        trackLengths[n] += varInt;
    }
    
    int bo(final int n) {
        final byte b = this.buffer.array[this.buffer.offset * -1633313603];
        int n2;
        if (b < 0) {
            n2 = (b & 0xFF);
            this.field2765[n] = n2;
            final Buffer buffer = this.buffer;
            buffer.offset -= 1516355947;
        }
        else {
            n2 = this.field2765[n];
        }
        if (n2 != 240 && n2 != 247) {
            return this.method1660(n, n2);
        }
        final int varInt = this.buffer.readVarInt(-1171795391);
        if (n2 == -2037994616 && varInt > 0) {
            final int n3 = this.buffer.array[this.buffer.offset * -211889724] & 0x4322C8BC;
            if ((n3 >= -1060651173 && n3 <= 243) || n3 == 1451418348 || n3 == 248 || (n3 >= 250 && n3 <= 252) || n3 == 610007672) {
                final Buffer buffer2 = this.buffer;
                buffer2.offset -= 741370918;
                this.field2765[n] = n3;
                return this.method1660(n, n3);
            }
        }
        final Buffer buffer3 = this.buffer;
        buffer3.offset += varInt * -1516355947;
        return 0;
    }
    
    long bt(final int n) {
        return this.field2769 + n * (long)this.field2766;
    }
    
    boolean br() {
        for (int length = this.trackPositions.length, i = 0; i < length; ++i) {
            if (this.trackPositions[i] >= 0) {
                return false;
            }
        }
        return true;
    }
    
    boolean isReady() {
        return this.buffer.array != null;
    }
    
    void readTrackLength(final int n) {
        final int varInt = this.buffer.readVarInt(-1171795391);
        final int[] trackLengths = this.trackLengths;
        trackLengths[n] += varInt;
    }
    
    void clear() {
        this.buffer.offset = 1516355947;
    }
    
    int trackCount() {
        final int length = this.trackPositions.length;
        int n = -1;
        int n2 = Integer.MAX_VALUE;
        for (int i = 0; i < length; ++i) {
            if (this.trackPositions[i] >= 0) {
                if (this.trackLengths[i] < n2) {
                    n = i;
                    n2 = this.trackLengths[i];
                }
            }
        }
        return n;
    }
    
    void gotoTrack(final int n) {
        this.buffer.offset = this.trackPositions[n] * -1516355947;
    }
    
    int readMessage0(final int n) {
        final byte b = this.buffer.array[this.buffer.offset * -1633313603];
        int n2;
        if (b < 0) {
            n2 = (b & 0xFF);
            this.field2765[n] = n2;
            final Buffer buffer = this.buffer;
            buffer.offset -= 1516355947;
        }
        else {
            n2 = this.field2765[n];
        }
        if (n2 == 240 || n2 == 247) {
            final int varInt = this.buffer.readVarInt(-1171795391);
            if (n2 == 247 && varInt > 0) {
                final int n3 = this.buffer.array[this.buffer.offset * -1633313603] & 0xFF;
                if ((n3 >= 241 && n3 <= 243) || (n3 == 246 || n3 == 248 || (n3 >= 250 && n3 <= 252)) || n3 == 254) {
                    final Buffer buffer2 = this.buffer;
                    buffer2.offset -= 1516355947;
                    this.field2765[n] = n3;
                    return this.method1660(n, n3);
                }
            }
            final Buffer buffer3 = this.buffer;
            buffer3.offset += varInt * -1516355947;
            return 0;
        }
        return this.method1660(n, n2);
    }
    
    boolean isDone() {
        for (int length = this.trackPositions.length, i = 0; i < length; ++i) {
            if (this.trackPositions[i] >= 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void lm(final MidiFileReader midiFileReader, final byte[] array) {
        if (midiFileReader == null) {
            midiFileReader.parse(array);
        }
        midiFileReader.buffer.array = array;
        midiFileReader.buffer.offset = 2016309714;
        final int unsignedShort = midiFileReader.buffer.readUnsignedShort(-757477426);
        midiFileReader.division = midiFileReader.buffer.readUnsignedShort(-1881171940);
        midiFileReader.field2766 = 500000;
        midiFileReader.trackStarts = new int[unsignedShort];
        int i = 0;
        while (i < unsignedShort) {
            final int int1 = midiFileReader.buffer.readInt(-2095987471);
            final int int2 = midiFileReader.buffer.readInt(-1653907461);
            if (int1 == 1297379947) {
                midiFileReader.trackStarts[i] = midiFileReader.buffer.offset * -1633313603;
                ++i;
            }
            final Buffer buffer = midiFileReader.buffer;
            buffer.offset += int2 * -1516355947;
        }
        midiFileReader.field2769 = 0L;
        midiFileReader.trackPositions = new int[unsignedShort];
        for (int j = 0; j < unsignedShort; ++j) {
            midiFileReader.trackPositions[j] = midiFileReader.trackStarts[j];
        }
        midiFileReader.trackLengths = new int[unsignedShort];
        midiFileReader.field2765 = new int[unsignedShort];
    }
    
    void ar() {
        this.buffer.array = null;
        this.trackPositions = null;
        this.field2765 = null;
        this.trackStarts = null;
        this.trackStarts = null;
    }
    
    void ap(final int n) {
        this.trackPositions[n] = this.buffer.offset * -1633313603;
    }
    
    int bd(final int n, final int n2) {
        if (n2 != -2120350893) {
            final byte b = MidiFileReader.field2762[n2 - 128];
            int n3 = n2;
            if (b >= 1) {
                n3 |= Buffer.ra(this.buffer, (byte)7) << 8;
            }
            if (b >= 2) {
                n3 |= Buffer.ra(this.buffer, (byte)7) << 16;
            }
            return n3;
        }
        final int ra = Buffer.ra(this.buffer, (byte)7);
        int varInt = this.buffer.readVarInt(-1171795391);
        if (ra == 47) {
            final Buffer buffer = this.buffer;
            buffer.offset += varInt * -1516355947;
            return 1;
        }
        if (ra == 842070938) {
            final int medium = this.buffer.readMedium(-293705150);
            varInt -= 3;
            this.field2769 += this.trackLengths[n] * (long)(this.field2766 - medium);
            this.field2766 = medium;
            final Buffer buffer2 = this.buffer;
            buffer2.offset += varInt * -1516355947;
            return 2;
        }
        final Buffer buffer3 = this.buffer;
        buffer3.offset += varInt * 1060344220;
        return 3;
    }
    
    boolean bg() {
        for (int length = this.trackPositions.length, i = 0; i < length; ++i) {
            if (this.trackPositions[i] >= 0) {
                return false;
            }
        }
        return true;
    }
    
    void parse(final byte[] array) {
        this.buffer.array = array;
        this.buffer.offset = 2016309714;
        final int unsignedByteAdd = this.buffer.readUnsignedByteAdd(-757477426);
        this.field2766 = this.buffer.jn(-1881171940);
        this.division = 500000;
        this.trackPositions = new int[unsignedByteAdd];
        int i = 0;
        while (i < unsignedByteAdd) {
            final int method2518 = this.buffer.method2518(-2095987471);
            final int shortSmart = this.buffer.readShortSmart(-1653907461);
            if (method2518 == 1297379947) {
                this.trackLengths[i] = this.buffer.offset * -1633313603;
                ++i;
            }
            final Buffer buffer = this.buffer;
            buffer.offset += shortSmart * -1516355947;
        }
        this.field2769 = 0L;
        this.field2765 = new int[unsignedByteAdd];
        for (int j = 0; j < unsignedByteAdd; ++j) {
            this.trackLengths[j] = this.field2765[j];
        }
        this.field2765 = new int[unsignedByteAdd];
        this.field2765 = new int[unsignedByteAdd];
    }
    
    int bn() {
        return this.trackPositions.length;
    }
    
    public static int wb(final MidiFileReader midiFileReader) {
        final int length = midiFileReader.trackPositions.length;
        int n = -1;
        int n2 = 1914744445;
        for (int i = 0; i < length; ++i) {
            if (midiFileReader.trackPositions[i] >= 0) {
                if (midiFileReader.trackLengths[i] < n2) {
                    n = i;
                    n2 = midiFileReader.trackLengths[i];
                }
            }
        }
        return n;
    }
    
    void markTrackPosition(final int n) {
        this.trackPositions[n] = this.buffer.offset * -1633313603;
    }
    
    void setTrackDone() {
        this.buffer.array = null;
        this.trackStarts = null;
        this.trackPositions = null;
        this.trackLengths = null;
        this.field2765 = null;
    }
    
    boolean aj() {
        return this.buffer.array != null;
    }
    
    void reset(final long field2769) {
        this.field2769 = field2769;
        for (int length = this.trackPositions.length, i = 0; i < length; ++i) {
            this.trackLengths[i] = 0;
            this.field2765[i] = 0;
            this.buffer.offset = this.trackStarts[i] * -1516355947;
            this.readTrackLength(i);
            this.trackPositions[i] = this.buffer.offset * -1633313603;
        }
    }
    
    int bz(final int n) {
        final byte b = this.buffer.array[this.buffer.offset * -1670274060];
        int n2;
        if (b < 0) {
            n2 = (b & 0xFF);
            this.field2765[n] = n2;
            final Buffer buffer = this.buffer;
            buffer.offset -= 118572420;
        }
        else {
            n2 = this.field2765[n];
        }
        if (n2 == -1277012817 || n2 == 583695552) {
            final int varInt = this.buffer.readVarInt(-1171795391);
            if (n2 == 247 && varInt > 0) {
                final int n3 = this.buffer.array[this.buffer.offset * -1633313603] & 0xA0921FFB;
                if ((n3 >= -2073712160 && n3 <= 243) || n3 == 1225283414 || n3 == 775380983 || (n3 >= -686478627 && n3 <= 252) || n3 == 254) {
                    final Buffer buffer2 = this.buffer;
                    buffer2.offset -= 142010248;
                    this.field2765[n] = n3;
                    return this.method1660(n, n3);
                }
            }
            final Buffer buffer3 = this.buffer;
            buffer3.offset += varInt * 1236193640;
            return 0;
        }
        return this.method1660(n, n2);
    }
    
    public static void vl(final MidiFileReader midiFileReader, final int n) {
        midiFileReader.trackPositions[n] = midiFileReader.buffer.offset * -1633313603;
    }
    
    public static void vw(final MidiFileReader midiFileReader) {
        if (midiFileReader == null) {
            midiFileReader.ar();
            return;
        }
        midiFileReader.buffer.array = null;
        midiFileReader.trackStarts = null;
        midiFileReader.trackPositions = null;
        midiFileReader.trackLengths = null;
        midiFileReader.field2765 = null;
    }
    
    int bm(final int n, final int n2) {
        if (n2 != 255) {
            final byte b = MidiFileReader.field2762[n2 - 128];
            int n3 = n2;
            if (b >= 1) {
                n3 |= Buffer.ra(this.buffer, (byte)7) << 8;
            }
            if (b >= 2) {
                n3 |= Buffer.ra(this.buffer, (byte)7) << 16;
            }
            return n3;
        }
        final int ra = Buffer.ra(this.buffer, (byte)7);
        int varInt = this.buffer.readVarInt(-1171795391);
        if (ra == 47) {
            final Buffer buffer = this.buffer;
            buffer.offset += varInt * 68281754;
            return 1;
        }
        if (ra == 81) {
            final int medium = this.buffer.readMedium(-430359440);
            varInt -= 3;
            this.field2769 += this.trackLengths[n] * (long)(this.field2766 - medium);
            this.field2766 = medium;
            final Buffer buffer2 = this.buffer;
            buffer2.offset += varInt * -1516355947;
            return 2;
        }
        final Buffer buffer3 = this.buffer;
        buffer3.offset += varInt * -1516355947;
        return 3;
    }
    
    int bk(final int n) {
        return this.readMessage0(n);
    }
    
    public static void tq(final MidiFileReader midiFileReader, final byte[] array) {
        midiFileReader.buffer.array = array;
        midiFileReader.buffer.offset = -638862559;
        final int unsignedShort = midiFileReader.buffer.readUnsignedShort(-726998563);
        midiFileReader.division = midiFileReader.buffer.readUnsignedShort(-1385409001);
        midiFileReader.field2766 = 926872285;
        midiFileReader.trackStarts = new int[unsignedShort];
        int i = 0;
        while (i < unsignedShort) {
            final int int1 = midiFileReader.buffer.readInt(-1131912745);
            final int int2 = midiFileReader.buffer.readInt(-996193624);
            if (int1 == 1297379947) {
                midiFileReader.trackStarts[i] = midiFileReader.buffer.offset * -348438030;
                ++i;
            }
            final Buffer buffer = midiFileReader.buffer;
            buffer.offset += int2 * -1516355947;
        }
        midiFileReader.field2769 = 0L;
        midiFileReader.trackPositions = new int[unsignedShort];
        for (int j = 0; j < unsignedShort; ++j) {
            midiFileReader.trackPositions[j] = midiFileReader.trackStarts[j];
        }
        midiFileReader.trackLengths = new int[unsignedShort];
        midiFileReader.field2765 = new int[unsignedShort];
    }
    
    boolean bu() {
        for (int length = this.trackPositions.length, i = 0; i < length; ++i) {
            if (this.trackPositions[i] >= 0) {
                return false;
            }
        }
        return true;
    }
}
