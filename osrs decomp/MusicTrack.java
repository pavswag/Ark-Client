// 
// Decompiled by Procyon v0.5.36
// 

public class MusicTrack extends Node
{
    byte[] midi;
    NodeHashTable table;
    
    MusicTrack(final Buffer buffer) {
        buffer.offset = (buffer.array.length - 3) * -1516355947;
        final int ra = Buffer.ra(buffer, (byte)7);
        final int unsignedShort = buffer.readUnsignedShort(-427177130);
        int n = 14 + ra * 10;
        buffer.offset = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        for (int i = 0; i < ra; ++i) {
            int n10 = -1;
            while (true) {
                final int ra2 = Buffer.ra(buffer, (byte)7);
                if (ra2 != n10) {
                    ++n;
                }
                n10 = (ra2 & 0xF);
                if (ra2 == 7) {
                    break;
                }
                if (ra2 == 23) {
                    ++n2;
                }
                else if (n10 == 0) {
                    ++n4;
                }
                else if (n10 == 1) {
                    ++n5;
                }
                else if (n10 == 2) {
                    ++n3;
                }
                else if (n10 == 3) {
                    ++n6;
                }
                else if (n10 == 4) {
                    ++n7;
                }
                else if (n10 == 5) {
                    ++n8;
                }
                else {
                    if (n10 != 6) {
                        throw new RuntimeException();
                    }
                    ++n9;
                }
            }
        }
        final int n11 = n + 5 * n2 + 2 * (n4 + n5 + n3 + n6 + n8) + (n7 + n9);
        final int n12 = buffer.offset * -1633313603;
        for (int n13 = ra + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9, j = 0; j < n13; ++j) {
            buffer.readVarInt(-1171795391);
        }
        final int n14 = n11 + (buffer.offset * -1633313603 - n12);
        int n15 = buffer.offset * -1633313603;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        int n23 = 0;
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        int n27 = 0;
        int n28 = 0;
        for (int k = 0; k < n3; ++k) {
            n28 = (n28 + Buffer.ra(buffer, (byte)7) & 0x7F);
            if (n28 != 0 && n28 != 32) {
                if (n28 == 1) {
                    ++n16;
                }
                else if (n28 == 33) {
                    ++n17;
                }
                else if (n28 == 7) {
                    ++n18;
                }
                else if (n28 == 39) {
                    ++n19;
                }
                else if (n28 == 10) {
                    ++n20;
                }
                else if (n28 == 42) {
                    ++n21;
                }
                else if (n28 == 99) {
                    ++n22;
                }
                else if (n28 == 98) {
                    ++n23;
                }
                else if (n28 == 101) {
                    ++n24;
                }
                else if (n28 == 100) {
                    ++n25;
                }
                else if (n28 != 64 && n28 != 65 && n28 != 120 && n28 != 121 && n28 != 123) {
                    ++n27;
                }
                else {
                    ++n26;
                }
            }
            else {
                ++n9;
            }
        }
        int n29 = 0;
        int n30 = buffer.offset * -1633313603;
        buffer.offset += n26 * -1516355947;
        int n31 = buffer.offset * -1633313603;
        buffer.offset += n8 * -1516355947;
        int n32 = buffer.offset * -1633313603;
        buffer.offset += n7 * -1516355947;
        int n33 = buffer.offset * -1633313603;
        buffer.offset += n6 * -1516355947;
        int n34 = buffer.offset * -1633313603;
        buffer.offset += n16 * -1516355947;
        int n35 = buffer.offset * -1633313603;
        buffer.offset += n18 * -1516355947;
        int n36 = buffer.offset * -1633313603;
        buffer.offset += n20 * -1516355947;
        int n37 = buffer.offset * -1633313603;
        buffer.offset += (n4 + n5 + n8) * -1516355947;
        int n38 = buffer.offset * -1633313603;
        buffer.offset += n4 * -1516355947;
        int n39 = buffer.offset * -1633313603;
        buffer.offset += n27 * -1516355947;
        int n40 = buffer.offset * -1633313603;
        buffer.offset += n5 * -1516355947;
        int n41 = buffer.offset * -1633313603;
        buffer.offset += n17 * -1516355947;
        int n42 = buffer.offset * -1633313603;
        buffer.offset += n19 * -1516355947;
        int n43 = buffer.offset * -1633313603;
        buffer.offset += n21 * -1516355947;
        int n44 = buffer.offset * -1633313603;
        buffer.offset += n9 * -1516355947;
        int n45 = buffer.offset * -1633313603;
        buffer.offset += n6 * -1516355947;
        int n46 = buffer.offset * -1633313603;
        buffer.offset += n22 * -1516355947;
        int n47 = buffer.offset * -1633313603;
        buffer.offset += n23 * -1516355947;
        int n48 = buffer.offset * -1633313603;
        buffer.offset += n24 * -1516355947;
        int n49 = buffer.offset * -1633313603;
        buffer.offset += n25 * -1516355947;
        int n50 = buffer.offset * -1633313603;
        buffer.offset += n2 * -254100545;
        this.midi = new byte[n14];
        final Buffer buffer2 = new Buffer(this.midi);
        buffer2.writeInt(1297377380, -2081835031);
        buffer2.writeInt(6, -2081835031);
        buffer2.writeVarInt((ra > 1) ? 1 : 0, (byte)(-63));
        buffer2.writeVarInt(ra, (byte)22);
        buffer2.writeVarInt(unsignedShort, (byte)85);
        buffer.offset = n12 * -1516355947;
        int n51 = 0;
        int n52 = 0;
        int n53 = 0;
        int n54 = 0;
        int n55 = 0;
        int n56 = 0;
        int n57 = 0;
        final int[] array = new int[128];
        int n58 = 0;
        for (int l = 0; l < ra; ++l) {
            buffer2.writeInt(1297379947, -2081835031);
            final Buffer buffer3 = buffer2;
            buffer3.offset -= 1770456492;
            final int n59 = buffer2.offset * -1633313603;
            int n60 = -1;
            while (true) {
                buffer2.writeSmartByteShort(buffer.readVarInt(-1171795391), (byte)101);
                final int n61 = buffer.array[n29++] & 0xFF;
                final boolean b = n61 != n60;
                n60 = (n61 & 0xF);
                if (n61 == 7) {
                    if (b) {
                        buffer2.writeShort(255, (byte)9);
                    }
                    buffer2.writeShort(47, (byte)102);
                    buffer2.writeShort(0, (byte)2);
                    buffer2.writeLengthInt(buffer2.offset * -1633313603 - n59, 1718879396);
                    break;
                }
                if (n61 == 23) {
                    if (b) {
                        buffer2.writeShort(255, (byte)105);
                    }
                    buffer2.writeShort(81, (byte)50);
                    buffer2.writeShort(3, (byte)53);
                    buffer2.writeShort(buffer.array[n50++], (byte)119);
                    buffer2.writeShort(buffer.array[n50++], (byte)83);
                    buffer2.writeShort(buffer.array[n50++], (byte)98);
                }
                else {
                    n51 ^= n61 >> 4;
                    if (n60 == 0) {
                        if (b) {
                            buffer2.writeShort(144 + n51, (byte)27);
                        }
                        n52 += buffer.array[n37++];
                        n53 += buffer.array[n38++];
                        buffer2.writeShort(n52 & 0x7F, (byte)111);
                        buffer2.writeShort(n53 & 0x7F, (byte)18);
                    }
                    else if (n60 == 1) {
                        if (b) {
                            buffer2.writeShort(128 + n51, (byte)87);
                        }
                        n52 += buffer.array[n37++];
                        n54 += buffer.array[n40++];
                        buffer2.writeShort(n52 & 0x7F, (byte)65);
                        buffer2.writeShort(n54 & 0x7F, (byte)112);
                    }
                    else if (n60 == 2) {
                        if (b) {
                            buffer2.writeShort(176 + n51, (byte)118);
                        }
                        n58 = (n58 + buffer.array[n15++] & 0x7F);
                        buffer2.writeShort(n58, (byte)39);
                        byte b2;
                        if (n58 != 0 && n58 != 32) {
                            if (n58 == 1) {
                                b2 = buffer.array[n34++];
                            }
                            else if (n58 == 33) {
                                b2 = buffer.array[n41++];
                            }
                            else if (n58 == 7) {
                                b2 = buffer.array[n35++];
                            }
                            else if (n58 == 39) {
                                b2 = buffer.array[n42++];
                            }
                            else if (n58 == 10) {
                                b2 = buffer.array[n36++];
                            }
                            else if (n58 == 42) {
                                b2 = buffer.array[n43++];
                            }
                            else if (n58 == 99) {
                                b2 = buffer.array[n46++];
                            }
                            else if (n58 == 98) {
                                b2 = buffer.array[n47++];
                            }
                            else if (n58 == 101) {
                                b2 = buffer.array[n48++];
                            }
                            else if (n58 == 100) {
                                b2 = buffer.array[n49++];
                            }
                            else if (n58 != 64 && n58 != 65 && n58 != 120 && n58 != 121 && n58 != 123) {
                                b2 = buffer.array[n39++];
                            }
                            else {
                                b2 = buffer.array[n30++];
                            }
                        }
                        else {
                            b2 = buffer.array[n44++];
                        }
                        buffer2.writeShort((array[n58] += b2) & 0x7F, (byte)29);
                    }
                    else if (n60 == 3) {
                        if (b) {
                            buffer2.writeShort(224 + n51, (byte)23);
                        }
                        n55 = n55 + buffer.array[n45++] + (buffer.array[n33++] << 7);
                        buffer2.writeShort(n55 & 0x7F, (byte)47);
                        buffer2.writeShort(n55 >> 7 & 0x7F, (byte)54);
                    }
                    else if (n60 == 4) {
                        if (b) {
                            buffer2.writeShort(208 + n51, (byte)86);
                        }
                        n56 += buffer.array[n32++];
                        buffer2.writeShort(n56 & 0x7F, (byte)91);
                    }
                    else if (n60 == 5) {
                        if (b) {
                            buffer2.writeShort(160 + n51, (byte)114);
                        }
                        n52 += buffer.array[n37++];
                        n57 += buffer.array[n31++];
                        buffer2.writeShort(n52 & 0x7F, (byte)83);
                        buffer2.writeShort(n57 & 0x7F, (byte)20);
                    }
                    else {
                        if (n60 != 6) {
                            throw new RuntimeException();
                        }
                        if (b) {
                            buffer2.writeShort(192 + n51, (byte)14);
                        }
                        buffer2.writeShort(buffer.array[n44++], (byte)63);
                    }
                }
            }
        }
    }
    
    void ao() {
        this.table = null;
    }
    
    void at() {
        if (this.table != null) {
            return;
        }
        this.table = new NodeHashTable(16);
        final int[] array = new int[16];
        final int[] array2 = new int[16];
        array[9] = (array2[9] = 128);
        final MidiFileReader midiFileReader = new MidiFileReader(this.midi);
        for (int ad = midiFileReader.ad(), i = 0; i < ad; ++i) {
            midiFileReader.gotoTrack(i);
            midiFileReader.readTrackLength(i);
            midiFileReader.markTrackPosition(i);
        }
    Label_0112:
        while (true) {
            final int trackCount = midiFileReader.trackCount();
            while (midiFileReader.trackLengths[trackCount] == midiFileReader.trackLengths[trackCount]) {
                midiFileReader.gotoTrack(trackCount);
                final int message = midiFileReader.readMessage(trackCount);
                if (message == 1) {
                    midiFileReader.bb();
                    midiFileReader.markTrackPosition(trackCount);
                    if (!midiFileReader.isDone()) {
                        break;
                    }
                    break Label_0112;
                }
                else {
                    final int n = message & 0xF0;
                    if (n == 176) {
                        final int n2 = message & 0xF;
                        final int n3 = message >> 8 & 0x7F;
                        final int n4 = message >> 16 & 0x7F;
                        if (n3 == 0) {
                            array[n2] = (array[n2] & 0xFFE03FFF) + (n4 << 14);
                        }
                        if (n3 == 32) {
                            array[n2] = (array[n2] & 0xFFFFC07F) + (n4 << 7);
                        }
                    }
                    if (n == 192) {
                        final int n5 = message & 0xF;
                        array2[n5] = array[n5] + (message >> 8 & 0x7F);
                    }
                    if (n == 144) {
                        final int n6 = message & 0xF;
                        final int n7 = message >> 8 & 0x7F;
                        if ((message >> 16 & 0x7F) > 0) {
                            final int n8 = array2[n6];
                            ByteArrayNode byteArrayNode = (ByteArrayNode)this.table.at(n8);
                            if (byteArrayNode == null) {
                                byteArrayNode = new ByteArrayNode(new byte[128]);
                                this.table.put(byteArrayNode, n8);
                            }
                            byteArrayNode.byteArray[n7] = 1;
                        }
                    }
                    midiFileReader.readTrackLength(trackCount);
                    midiFileReader.markTrackPosition(trackCount);
                }
            }
        }
    }
    
    void ay() {
        this.table = null;
    }
    
    void clear() {
        if (this.table != null) {
            return;
        }
        this.table = new NodeHashTable(16);
        final int[] array = new int[16];
        final int[] array2 = new int[16];
        array[9] = (array2[9] = 128);
        final MidiFileReader midiFileReader = new MidiFileReader(this.midi);
        for (int az = midiFileReader.az(), i = 0; i < az; ++i) {
            midiFileReader.readTrackLength(i);
            midiFileReader.readTrackLength(i);
            midiFileReader.markTrackPosition(i);
        }
    Label_0112:
        while (true) {
            final int prioritizedTrack = midiFileReader.getPrioritizedTrack();
            while (midiFileReader.field2765[prioritizedTrack] == midiFileReader.trackStarts[prioritizedTrack]) {
                midiFileReader.markTrackPosition(prioritizedTrack);
                final int bk = midiFileReader.bk(prioritizedTrack);
                if (bk == 1) {
                    midiFileReader.setTrackDone();
                    midiFileReader.bi(prioritizedTrack);
                    if (!midiFileReader.as()) {
                        break;
                    }
                    break Label_0112;
                }
                else {
                    final int n = bk & 0xF0;
                    if (n == 176) {
                        final int n2 = bk & 0xF;
                        final int n3 = bk >> 8 & 0x7F;
                        final int n4 = bk >> 16 & 0x7F;
                        if (n3 == 0) {
                            array[n2] = (array[n2] & 0xFFE03FFF) + (n4 << 14);
                        }
                        if (n3 == 32) {
                            array[n2] = (array[n2] & 0xFFFFC07F) + (n4 << 7);
                        }
                    }
                    if (n == 192) {
                        final int n5 = bk & 0xF;
                        array2[n5] = array[n5] + (bk >> 8 & 0x7F);
                    }
                    if (n == 144) {
                        final int n6 = bk & 0xF;
                        final int n7 = bk >> 8 & 0x7F;
                        if ((bk >> 16 & 0x7F) > 0) {
                            final int n8 = array2[n6];
                            ByteArrayNode byteArrayNode = (ByteArrayNode)this.table.ab(n8);
                            if (byteArrayNode == null) {
                                byteArrayNode = new ByteArrayNode(new byte[128]);
                                this.table.put(byteArrayNode, n8);
                            }
                            byteArrayNode.byteArray[n7] = 1;
                        }
                    }
                    midiFileReader.markTrackPosition(prioritizedTrack);
                    midiFileReader.gotoTrack(prioritizedTrack);
                }
            }
        }
    }
    
    void al() {
        this.table = null;
    }
    
    void method1673() {
        if (this.table != null) {
            return;
        }
        this.table = new NodeHashTable(16);
        final int[] array = new int[16];
        final int[] array2 = new int[16];
        array[9] = (array2[9] = 128);
        final MidiFileReader midiFileReader = new MidiFileReader(this.midi);
        for (int ad = midiFileReader.ad(), i = 0; i < ad; ++i) {
            midiFileReader.gotoTrack(i);
            midiFileReader.readTrackLength(i);
            midiFileReader.markTrackPosition(i);
        }
    Label_0320:
        while (true) {
            final int trackCount = midiFileReader.trackCount();
            while (midiFileReader.trackLengths[trackCount] == midiFileReader.trackLengths[trackCount]) {
                midiFileReader.gotoTrack(trackCount);
                final int message = midiFileReader.readMessage(trackCount);
                if (message == 1) {
                    midiFileReader.bb();
                    midiFileReader.markTrackPosition(trackCount);
                    if (!midiFileReader.isDone()) {
                        break;
                    }
                    break Label_0320;
                }
                else {
                    final int n = message & 0xF0;
                    if (n == 176) {
                        final int n2 = message & 0xF;
                        final int n3 = message >> 8 & 0x7F;
                        final int n4 = message >> 16 & 0x7F;
                        if (n3 == 0) {
                            array[n2] = (array[n2] & 0xFFE03FFF) + (n4 << 14);
                        }
                        if (n3 == 32) {
                            array[n2] = (array[n2] & 0xFFFFC07F) + (n4 << 7);
                        }
                    }
                    if (n == 192) {
                        final int n5 = message & 0xF;
                        array2[n5] = array[n5] + (message >> 8 & 0x7F);
                    }
                    if (n == 144) {
                        final int n6 = message & 0xF;
                        final int n7 = message >> 8 & 0x7F;
                        if ((message >> 16 & 0x7F) > 0) {
                            final int n8 = array2[n6];
                            ByteArrayNode byteArrayNode = (ByteArrayNode)this.table.at(n8);
                            if (byteArrayNode == null) {
                                byteArrayNode = new ByteArrayNode(new byte[128]);
                                this.table.put(byteArrayNode, n8);
                            }
                            byteArrayNode.byteArray[n7] = 1;
                        }
                    }
                    midiFileReader.readTrackLength(trackCount);
                    midiFileReader.markTrackPosition(trackCount);
                }
            }
        }
    }
    
    public static MusicTrack ac(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-77));
        if (takeFile == null) {
            return null;
        }
        return new MusicTrack(new Buffer(takeFile));
    }
    
    public static MusicTrack au(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-91));
        if (takeFile == null) {
            return null;
        }
        return new MusicTrack(new Buffer(takeFile));
    }
    
    public static MusicTrack readTrack(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-112));
        if (takeFile == null) {
            return null;
        }
        return new MusicTrack(new Buffer(takeFile));
    }
    
    public static MusicTrack ab(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-93));
        if (takeFile == null) {
            return null;
        }
        return new MusicTrack(new Buffer(takeFile));
    }
    
    void aq() {
        if (this.table != null) {
            return;
        }
        this.table = new NodeHashTable(16);
        final int[] array = new int[16];
        final int[] array2 = new int[16];
        array[9] = (array2[9] = 128);
        final MidiFileReader midiFileReader = new MidiFileReader(this.midi);
        for (int ad = midiFileReader.ad(), i = 0; i < ad; ++i) {
            midiFileReader.gotoTrack(i);
            midiFileReader.readTrackLength(i);
            midiFileReader.markTrackPosition(i);
        }
    Label_0525:
        while (true) {
            final int trackCount = midiFileReader.trackCount();
            while (midiFileReader.trackLengths[trackCount] == midiFileReader.trackLengths[trackCount]) {
                midiFileReader.gotoTrack(trackCount);
                final int message = midiFileReader.readMessage(trackCount);
                if (message == 1) {
                    midiFileReader.bb();
                    midiFileReader.markTrackPosition(trackCount);
                    if (!midiFileReader.isDone()) {
                        break;
                    }
                    break Label_0525;
                }
                else {
                    final int n = message & 0xF0;
                    if (n == 176) {
                        final int n2 = message & 0xF;
                        final int n3 = message >> 8 & 0x7F;
                        final int n4 = message >> 16 & 0x7F;
                        if (n3 == 0) {
                            array[n2] = (array[n2] & 0xFFE03FFF) + (n4 << 14);
                        }
                        if (n3 == 32) {
                            array[n2] = (array[n2] & 0xFFFFC07F) + (n4 << 7);
                        }
                    }
                    if (n == 192) {
                        final int n5 = message & 0xF;
                        array2[n5] = array[n5] + (message >> 8 & 0x7F);
                    }
                    if (n == 144) {
                        final int n6 = message & 0xF;
                        final int n7 = message >> 8 & 0x7F;
                        if ((message >> 16 & 0x7F) > 0) {
                            final int n8 = array2[n6];
                            ByteArrayNode byteArrayNode = (ByteArrayNode)this.table.at(n8);
                            if (byteArrayNode == null) {
                                byteArrayNode = new ByteArrayNode(new byte[128]);
                                this.table.put(byteArrayNode, n8);
                            }
                            byteArrayNode.byteArray[n7] = 1;
                        }
                    }
                    midiFileReader.readTrackLength(trackCount);
                    midiFileReader.markTrackPosition(trackCount);
                }
            }
        }
    }
    
    public static void mg(final SpritePixels spritePixels, int bk, int bi, final int n, final int n2) {
        if (spritePixels == null) {
            spritePixels.drawTransOverlayAt(bk, bk, bk, bk);
            return;
        }
        if (n == 256) {
            spritePixels.drawAt(bk, bi);
            return;
        }
        bk += spritePixels.xOffset;
        bi += spritePixels.yOffset;
        int n3 = bk + bi * SpritePixels.ae;
        int n4 = 0;
        int subHeight = spritePixels.subHeight;
        int subWidth = spritePixels.subWidth;
        int n5 = SpritePixels.ae - subWidth;
        int n6 = 0;
        if (bi < SpritePixels.bi) {
            final int n7 = SpritePixels.bi - bi;
            subHeight -= n7;
            bi = SpritePixels.bi;
            n4 += n7 * subWidth;
            n3 += n7 * SpritePixels.ae;
        }
        if (bi + subHeight > SpritePixels.be) {
            subHeight -= bi + subHeight - SpritePixels.be;
        }
        if (bk < SpritePixels.bk) {
            final int n8 = SpritePixels.bk - bk;
            subWidth -= n8;
            bk = SpritePixels.bk;
            n4 += n8;
            n3 += n8;
            n6 += n8;
            n5 += n8;
        }
        if (bk + subWidth > SpritePixels.bx) {
            final int n9 = bk + subWidth - SpritePixels.bx;
            subWidth -= n9;
            n6 += n9;
            n5 += n9;
        }
        if (subWidth <= 0 || subHeight <= 0) {
            return;
        }
        SpritePixels.Sprite_drawTransOverlay(SpritePixels.ad, spritePixels.pixels, 0, n4, n3, subWidth, subHeight, n5, n6, n, n2);
    }
    
    public static void wf(final MusicTrack musicTrack) {
        if (musicTrack == null) {
            musicTrack.clear();
            return;
        }
        if (musicTrack.table != null) {
            return;
        }
        musicTrack.table = new NodeHashTable(16);
        final int[] array = new int[16];
        final int[] array2 = new int[16];
        array[9] = (array2[9] = 128);
        final MidiFileReader midiFileReader = new MidiFileReader(musicTrack.midi);
        for (int ad = midiFileReader.ad(), i = 0; i < ad; ++i) {
            midiFileReader.gotoTrack(i);
            midiFileReader.readTrackLength(i);
            midiFileReader.markTrackPosition(i);
        }
    Label_0528:
        while (true) {
            final int trackCount = midiFileReader.trackCount();
            while (midiFileReader.trackLengths[trackCount] == midiFileReader.trackLengths[trackCount]) {
                midiFileReader.gotoTrack(trackCount);
                final int message = midiFileReader.readMessage(trackCount);
                if (message == 1) {
                    midiFileReader.bb();
                    midiFileReader.markTrackPosition(trackCount);
                    if (!midiFileReader.isDone()) {
                        break;
                    }
                    break Label_0528;
                }
                else {
                    final int n = message & 0xF0;
                    if (n == 176) {
                        final int n2 = message & 0xF;
                        final int n3 = message >> 8 & 0x7F;
                        final int n4 = message >> 16 & 0x7F;
                        if (n3 == 0) {
                            array[n2] = (array[n2] & 0xFFE03FFF) + (n4 << 14);
                        }
                        if (n3 == 32) {
                            array[n2] = (array[n2] & 0xFFFFC07F) + (n4 << 7);
                        }
                    }
                    if (n == 192) {
                        final int n5 = message & 0xF;
                        array2[n5] = array[n5] + (message >> 8 & 0x7F);
                    }
                    if (n == 144) {
                        final int n6 = message & 0xF;
                        final int n7 = message >> 8 & 0x7F;
                        if ((message >> 16 & 0x7F) > 0) {
                            final int n8 = array2[n6];
                            ByteArrayNode byteArrayNode = (ByteArrayNode)musicTrack.table.at(n8);
                            if (byteArrayNode == null) {
                                byteArrayNode = new ByteArrayNode(new byte[128]);
                                musicTrack.table.put(byteArrayNode, n8);
                            }
                            byteArrayNode.byteArray[n7] = 1;
                        }
                    }
                    midiFileReader.readTrackLength(trackCount);
                    midiFileReader.markTrackPosition(trackCount);
                }
            }
        }
    }
}
