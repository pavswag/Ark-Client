import java.awt.Graphics;

// 
// Decompiled by Procyon v0.5.36
// 

public class MidiPcmStream extends PcmStream
{
    MusicPatchNode[][] field2753;
    static Widget mousedOverWidgetIf1;
    int field2735;
    int[] field2736;
    long field2758;
    int[] field2738;
    int[] field2739;
    int[] field2740;
    int[] field2741;
    int[] field2742;
    MusicPatchPcmStream patchStream;
    int[] field2744;
    int[] field2745;
    int[] field2746;
    int[] field2747;
    int trackLength;
    int[] field2749;
    int[] field2750;
    int[] field2751;
    int[] field2752;
    MusicPatchNode[][] field2733;
    MidiFileReader midiFile;
    NodeHashTable musicPatches;
    int track;
    int field2757;
    long field2737;
    static final int ai = 2;
    boolean field2759;
    int[] field2760;
    
    public MidiPcmStream() {
        this.field2757 = 673362688;
        this.field2735 = -1778707904;
        this.field2744 = new int[16];
        this.field2752 = new int[16];
        this.field2738 = new int[16];
        this.field2739 = new int[16];
        this.field2745 = new int[16];
        this.field2741 = new int[16];
        this.field2742 = new int[16];
        this.field2740 = new int[16];
        this.field2760 = new int[16];
        this.field2746 = new int[16];
        this.field2747 = new int[16];
        this.field2736 = new int[16];
        this.field2749 = new int[16];
        this.field2750 = new int[16];
        this.field2751 = new int[16];
        this.field2753 = new MusicPatchNode[16][128];
        this.field2733 = new MusicPatchNode[16][128];
        this.midiFile = new MidiFileReader();
        this.patchStream = new MusicPatchPcmStream(this);
        this.musicPatches = new NodeHashTable(128);
        this.method1626(-964267539);
    }
    
    void dp(final int n, final int n2, final int n3) {
    }
    
    void method1628(final int n, final int n2) {
        try {
            final int n3 = n & 0xF0;
            if (128 == n3) {
                if (n2 >= 102591832) {
                    throw new IllegalStateException();
                }
                this.method1621(n & 0xF, n >> 8 & 0x7F, n >> 16 & 0x7F, (byte)71);
            }
            else if (144 == n3) {
                if (n2 >= 102591832) {
                    throw new IllegalStateException();
                }
                final int n4 = n & 0xF;
                final int n5 = n >> 8 & 0x7F;
                final int n6 = n >> 16 & 0x7F;
                if (n6 > 0) {
                    if (n2 >= 102591832) {
                        return;
                    }
                    this.method1620(n4, n5, n6, -1380723164);
                }
                else {
                    this.method1621(n4, n5, 64, (byte)46);
                }
            }
            else if (160 == n3) {
                if (n2 >= 102591832) {
                    return;
                }
                this.method1622(n & 0xF, n >> 8 & 0x7F, n >> 16 & 0x7F, -939740093);
            }
            else if (176 == n3) {
                if (n2 >= 102591832) {
                    throw new IllegalStateException();
                }
                final int n7 = n & 0xF;
                final int n8 = n >> 8 & 0x7F;
                final int n9 = n >> 16 & 0x7F;
                if (n8 == 0) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2741[n7] = (n9 << 14) + (this.field2741[n7] & 0xFFE03FFF);
                }
                if (n8 == 32) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2741[n7] = (this.field2741[n7] & 0xFFFFC07F) + (n9 << 7);
                }
                if (n8 == 1) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2740[n7] = (this.field2740[n7] & 0xFFFFC07F) + (n9 << 7);
                }
                if (33 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2740[n7] = (this.field2740[n7] & 0xFFFFFF80) + n9;
                }
                if (5 == n8) {
                    this.field2760[n7] = (this.field2760[n7] & 0xFFFFC07F) + (n9 << 7);
                }
                if (37 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2760[n7] = (this.field2760[n7] & 0xFFFFFF80) + n9;
                }
                if (7 == n8) {
                    this.field2744[n7] = (this.field2744[n7] & 0xFFFFC07F) + (n9 << 7);
                }
                if (39 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2744[n7] = n9 + (this.field2744[n7] & 0xFFFFFF80);
                }
                if (10 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2752[n7] = (this.field2752[n7] & 0xFFFFC07F) + (n9 << 7);
                }
                if (42 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2752[n7] = n9 + (this.field2752[n7] & 0xFFFFFF80);
                }
                if (11 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2738[n7] = (this.field2738[n7] & 0xFFFFC07F) + (n9 << 7);
                }
                if (43 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2738[n7] = n9 + (this.field2738[n7] & 0xFFFFFF80);
                }
                if (n8 == 64) {
                    if (n9 >= 64) {
                        if (n2 >= 102591832) {
                            throw new IllegalStateException();
                        }
                        final int[] field2746 = this.field2746;
                        final int n10 = n7;
                        field2746[n10] |= 0x1;
                    }
                    else {
                        final int[] field2747 = this.field2746;
                        final int n11 = n7;
                        field2747[n11] &= 0xFFFFFFFE;
                    }
                }
                if (65 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    if (n9 >= 64) {
                        final int[] field2748 = this.field2746;
                        final int n12 = n7;
                        field2748[n12] |= 0x2;
                    }
                    else {
                        this.method1640(n7, (byte)(-36));
                        final int[] field2749 = this.field2746;
                        final int n13 = n7;
                        field2749[n13] &= 0xFFFFFFFD;
                    }
                }
                if (n8 == 99) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2747[n7] = (n9 << 7) + (this.field2747[n7] & 0x7F);
                }
                if (n8 == 98) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2747[n7] = n9 + (this.field2747[n7] & 0x3F80);
                }
                if (n8 == 101) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2747[n7] = (this.field2747[n7] & 0x7F) + 16384 + (n9 << 7);
                }
                if (n8 == 100) {
                    if (n2 >= 102591832) {
                        return;
                    }
                    this.field2747[n7] = n9 + (16384 + (this.field2747[n7] & 0x3F80));
                }
                if (120 == n8) {
                    this.method1624(n7, -1922101165);
                }
                if (121 == n8) {
                    if (n2 >= 102591832) {
                        return;
                    }
                    this.method1625(n7, 794110733);
                }
                if (n8 == 123) {
                    if (n2 >= 102591832) {
                        return;
                    }
                    this.method1612(n7, -2058759132);
                }
                if (n8 == 6 && 16384 == this.field2747[n7]) {
                    this.field2736[n7] = (this.field2736[n7] & 0xFFFFC07F) + (n9 << 7);
                }
                if (38 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    if (16384 == this.field2747[n7]) {
                        this.field2736[n7] = n9 + (this.field2736[n7] & 0xFFFFFF80);
                    }
                }
                if (n8 == 16) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2749[n7] = (this.field2749[n7] & 0xFFFFC07F) + (n9 << 7);
                }
                if (n8 == 48) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.field2749[n7] = n9 + (this.field2749[n7] & 0xFFFFFF80);
                }
                if (81 == n8) {
                    if (n2 >= 102591832) {
                        return;
                    }
                    if (n9 >= 64) {
                        if (n2 >= 102591832) {
                            return;
                        }
                        final int[] field2750 = this.field2746;
                        final int n14 = n7;
                        field2750[n14] |= 0x4;
                    }
                    else {
                        this.method1627(n7, -850992562);
                        final int[] field2751 = this.field2746;
                        final int n15 = n7;
                        field2751[n15] &= 0xFFFFFFFB;
                    }
                }
                if (17 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.method1629(n7, (this.field2750[n7] & 0xFFFFC07F) + (n9 << 7), -1731550836);
                }
                if (49 == n8) {
                    if (n2 >= 102591832) {
                        throw new IllegalStateException();
                    }
                    this.method1629(n7, (this.field2750[n7] & 0xFFFFFF80) + n9, -1731550836);
                }
            }
            else if (192 == n3) {
                if (n2 >= 102591832) {
                    throw new IllegalStateException();
                }
                final int n16 = n & 0xF;
                this.method1641(n16, (n >> 8 & 0x7F) + this.field2741[n16], 1612007289);
            }
            else if (n3 == 208) {
                if (n2 >= 102591832) {
                    return;
                }
                zq(this, n & 0xF, n >> 8 & 0x7F, 1736841186);
            }
            else if (224 == n3) {
                if (n2 >= 102591832) {
                    return;
                }
                ts(this, n & 0xF, (n >> 8 & 0x7F) + (n >> 9 & 0x3F80), 1611025845);
            }
            else {
                if (0xFF != (n & 0xFF)) {
                    return;
                }
                if (n2 >= 102591832) {
                    throw new IllegalStateException();
                }
                this.method1626(-964267539);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bs(" + ')');
        }
    }
    
    void en(final int n) {
        if (0x0 != (this.field2746[n] & 0x4)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
                if (musicPatchNode.field2801 * -1972201472 == n) {
                    musicPatchNode.field2803 = 0;
                }
            }
        }
    }
    
    public synchronized boolean ca(final MusicTrack musicTrack, final AbstractArchive abstractArchive, final SoundCache soundCache, final int n) {
        MusicTrack.wf(musicTrack);
        boolean b = true;
        int[] array = null;
        if (n > 0) {
            array = new int[] { n };
        }
        for (ByteArrayNode byteArrayNode = (ByteArrayNode)musicTrack.table.first(); null != byteArrayNode; byteArrayNode = (ByteArrayNode)musicTrack.table.next()) {
            final int n2 = (int)byteArrayNode.hr;
            MusicPatch musicPatch = (MusicPatch)this.musicPatches.at(n2);
            if (null == musicPatch) {
                final byte[] sh = AbstractArchive.sh(abstractArchive, n2, (byte)(-8));
                MusicPatch musicPatch2;
                if (sh == null) {
                    musicPatch2 = null;
                }
                else {
                    musicPatch2 = new MusicPatch(sh);
                }
                musicPatch = musicPatch2;
                if (null == musicPatch) {
                    b = false;
                    continue;
                }
                this.musicPatches.put(musicPatch, n2);
            }
            if (!musicPatch.method1663(soundCache, byteArrayNode.byteArray, array, -528008101)) {
                b = false;
            }
        }
        if (b) {
            musicTrack.ao();
        }
        return b;
    }
    
    void method1625(int i, final int n) {
        try {
            if (i >= 0) {
                this.field2744[i] = 12800;
                this.field2752[i] = 8192;
                this.field2738[i] = 16383;
                this.field2742[i] = 8192;
                this.field2740[i] = 0;
                this.field2760[i] = 8192;
                this.method1640(i, (byte)(-109));
                this.method1627(i, -1437271181);
                this.field2746[i] = 0;
                this.field2747[i] = 32767;
                this.field2736[i] = 256;
                this.field2749[i] = 0;
                this.method1629(i, 8192, -1731550836);
                return;
            }
            if (n <= -1202730735) {
                throw new IllegalStateException();
            }
            for (i = 0; i < 16; ++i) {
                if (n <= -1202730735) {
                    return;
                }
                this.method1625(i, 1171995547);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ad(" + ')');
        }
    }
    
    void method1612(final int n, final int n2) {
        try {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); null != musicPatchNode; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
                if (n >= 0) {
                    if (n2 >= -1326450429) {
                        throw new IllegalStateException();
                    }
                    if (n != musicPatchNode.field2801 * 1021419297) {
                        continue;
                    }
                    if (n2 >= -1326450429) {
                        throw new IllegalStateException();
                    }
                }
                if (musicPatchNode.field2798 * -602614853 < 0) {
                    if (n2 >= -1326450429) {
                        return;
                    }
                    this.field2753[1021419297 * musicPatchNode.field2801][-630482265 * musicPatchNode.field2788] = null;
                    musicPatchNode.field2798 = 0;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ae(" + ')');
        }
    }
    
    public static void cr(final MidiPcmStream midiPcmStream, final int n, final int n2, final int n3) {
        if (midiPcmStream == null) {
            midiPcmStream.du(n, n, n);
            return;
        }
        midiPcmStream.method1621(n, n2, 1921522566, (byte)27);
        if (0x0 != (midiPcmStream.field2746[n] & 0x2)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.first(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.next()) {
                if (n == musicPatchNode.field2801 * 1021419297 && musicPatchNode.field2798 * -602614853 < 0) {
                    midiPcmStream.field2753[n][musicPatchNode.field2788 * -1545276213] = null;
                    midiPcmStream.field2753[n][n2] = musicPatchNode;
                    final int n4 = -279706293 * musicPatchNode.field2804 + (-1077015879 * musicPatchNode.field2793 * (musicPatchNode.field2792 * -528496990) >> 12);
                    final MusicPatchNode musicPatchNode2 = musicPatchNode;
                    musicPatchNode2.field2804 += (n2 - musicPatchNode.field2788 * -117547961 << 8) * -1277480258;
                    musicPatchNode.field2792 = (n4 - musicPatchNode.field2804 * -279706293) * -101879483;
                    musicPatchNode.field2793 = 230199296;
                    musicPatchNode.field2788 = n2 * -1339790057;
                    return;
                }
            }
        }
        final MusicPatch patch = (MusicPatch)midiPcmStream.musicPatches.at(midiPcmStream.field2745[n]);
        if (patch == null) {
            return;
        }
        final RawSound rawSound = patch.rawSounds[n2];
        if (null == rawSound) {
            return;
        }
        final MusicPatchNode musicPatchNode3 = new MusicPatchNode();
        musicPatchNode3.field2801 = n * 721126860;
        musicPatchNode3.patch = patch;
        musicPatchNode3.rawSound = rawSound;
        musicPatchNode3.field2786 = patch.field2775[n2];
        musicPatchNode3.field2784 = -1957781017 * patch.field2776[n2];
        musicPatchNode3.field2788 = -355922885 * n2;
        musicPatchNode3.field2789 = -284955771 * (-141411814 + -1650867934 * patch.field2772 * (n3 * n3) * patch.field2773[n2] >> 11);
        musicPatchNode3.field2790 = (patch.field2774[n2] & 0xFF) * -539102003;
        musicPatchNode3.field2804 = ((n2 << 8) - (patch.field2771[n2] & 0x7FFF)) * 451092095;
        musicPatchNode3.field2794 = 0;
        musicPatchNode3.field2795 = 0;
        musicPatchNode3.field2802 = 0;
        musicPatchNode3.field2798 = -81590643;
        musicPatchNode3.field2783 = 0;
        if (midiPcmStream.field2749[n] == 0) {
            musicPatchNode3.stream = RawPcmStream.method294(rawSound, midiPcmStream.method1630(musicPatchNode3, 1733980810), xf(midiPcmStream, musicPatchNode3, -571722874), tb(midiPcmStream, musicPatchNode3, -2115175011));
        }
        else {
            musicPatchNode3.stream = RawPcmStream.method294(rawSound, midiPcmStream.method1630(musicPatchNode3, 1405241798), 0, tb(midiPcmStream, musicPatchNode3, -1452986957));
            midiPcmStream.method1639(musicPatchNode3, patch.field2771[n2] < 0, 2135859650);
        }
        if (patch.field2771[n2] < 0) {
            musicPatchNode3.stream.setNumLoops(-1);
        }
        if (1959190999 * musicPatchNode3.field2784 >= 0) {
            final MusicPatchNode musicPatchNode4 = midiPcmStream.field2733[n][-587028102 * musicPatchNode3.field2784];
            if (null != musicPatchNode4 && musicPatchNode4.field2798 * -602614853 < 0) {
                midiPcmStream.field2753[n][-630482265 * musicPatchNode4.field2788] = null;
                musicPatchNode4.field2798 = 0;
            }
            midiPcmStream.field2733[n][musicPatchNode3.field2784 * 1309894243] = musicPatchNode3;
        }
        midiPcmStream.patchStream.queue.addFirst(musicPatchNode3);
        midiPcmStream.field2753[n][n2] = musicPatchNode3;
    }
    
    public synchronized void ce(final int n) {
        this.field2757 = 1881678515 * n;
    }
    
    @Override
    protected synchronized PcmStream bb() {
        return this.patchStream;
    }
    
    public synchronized void cb() {
        MidiFileReader.vw(this.midiFile);
        this.method1626(-964267539);
    }
    
    void da(final int n) {
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); null != musicPatchNode; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (n < 0 || 1021419297 * musicPatchNode.field2801 == n) {
                if (null != musicPatchNode.stream) {
                    musicPatchNode.stream.method268(PcmPlayer.field201 * -658266942 / 100);
                    if (musicPatchNode.stream.eo()) {
                        this.patchStream.mixer.addSubStream(musicPatchNode.stream);
                    }
                    MusicPatchNode.bk(musicPatchNode, (byte)10);
                }
                if (musicPatchNode.field2798 * -602614853 < 0) {
                    this.field2753[musicPatchNode.field2801 * 1021419297][-201837357 * musicPatchNode.field2788] = null;
                }
                musicPatchNode.hw();
            }
        }
    }
    
    public synchronized boolean ch() {
        return this.midiFile.isReady();
    }
    
    void el(final int n) {
        if (0x0 != (this.field2746[n] & 0x4)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
                if (musicPatchNode.field2801 * 1021419297 == n) {
                    musicPatchNode.field2803 = 0;
                }
            }
        }
    }
    
    public synchronized void cl(final MusicTrack musicTrack, final boolean field2759) {
        this.clear((byte)21);
        MidiFileReader.lm(this.midiFile, musicTrack.midi);
        this.field2759 = field2759;
        this.field2737 = 0L;
        for (int ad = this.midiFile.ad(), i = 0; i < ad; ++i) {
            this.midiFile.gotoTrack(i);
            this.midiFile.readTrackLength(i);
            this.midiFile.markTrackPosition(i);
        }
        this.track = this.midiFile.trackCount() * 911615763;
        this.trackLength = this.midiFile.trackLengths[this.track * -2130330853] * -1172591539;
        this.field2758 = this.midiFile.method1656(this.trackLength * 2049666181) * -5361838125554816559L;
    }
    
    public synchronized boolean cn(final MusicTrack musicTrack, final AbstractArchive abstractArchive, final SoundCache soundCache, final int n) {
        MusicTrack.wf(musicTrack);
        boolean b = true;
        int[] array = null;
        if (n > 0) {
            array = new int[] { n };
        }
        for (ByteArrayNode byteArrayNode = (ByteArrayNode)musicTrack.table.first(); null != byteArrayNode; byteArrayNode = (ByteArrayNode)musicTrack.table.next()) {
            final int n2 = (int)byteArrayNode.hr;
            MusicPatch musicPatch = (MusicPatch)this.musicPatches.at(n2);
            if (null == musicPatch) {
                final byte[] sh = AbstractArchive.sh(abstractArchive, n2, (byte)66);
                MusicPatch musicPatch2;
                if (sh == null) {
                    musicPatch2 = null;
                }
                else {
                    musicPatch2 = new MusicPatch(sh);
                }
                musicPatch = musicPatch2;
                if (null == musicPatch) {
                    b = false;
                    continue;
                }
                this.musicPatches.put(musicPatch, n2);
            }
            if (!musicPatch.method1663(soundCache, byteArrayNode.byteArray, array, -578631683)) {
                b = false;
            }
        }
        if (b) {
            musicTrack.ao();
        }
        return b;
    }
    
    int ex(final MusicPatchNode musicPatchNode) {
        final MusicPatchNode2 field2786 = musicPatchNode.field2786;
        final int n = this.field2744[-251956317 * musicPatchNode.field2801] * this.field2738[1021419297 * musicPatchNode.field2801] + 1439828268 >> 13;
        int n2 = -69880683 + -1714210238 * this.field2757 * (musicPatchNode.field2789 * -254585523 * (n * n + 16384 >> 15) + 16384 >> 15) >> 8;
        if (354539497 * field2786.field2719 > 0) {
            n2 = (int)(n2 * Math.pow(0.5, field2786.field2719 * -1537334919 * (musicPatchNode.field2794 * -814647939 * 1.953125E-5)) + 0.5);
        }
        if (null != field2786.field2718) {
            final int n3 = 566056741 * musicPatchNode.field2795;
            int n4 = field2786.field2718[1 + musicPatchNode.field2802 * 891662681];
            if (-1517093692 * musicPatchNode.field2802 < field2786.field2718.length - 2) {
                final int n5 = (field2786.field2718[musicPatchNode.field2802 * 99031685] & 0xFF) << 8;
                n4 += (field2786.field2718[3 + -255031697 * musicPatchNode.field2802] - n4) * (n3 - n5) / (((field2786.field2718[41591691 * musicPatchNode.field2802 + 2] & 0x421AAE6A) << 8) - n5);
            }
            n2 = n2 * n4 + 32 >> 6;
        }
        if (137557187 * musicPatchNode.field2798 > 0 && field2786.field2717 != null) {
            final int n6 = -602614853 * musicPatchNode.field2798;
            int n7 = field2786.field2717[1 + -371546193 * musicPatchNode.field2783];
            if (musicPatchNode.field2783 * -371546193 < field2786.field2717.length - 2) {
                final int n8 = (field2786.field2717[musicPatchNode.field2783 * 887659148] & 0xFF) << 8;
                n7 += (field2786.field2717[musicPatchNode.field2783 * 1613638397 + 3] - n7) * (n6 - n8) / (((field2786.field2717[musicPatchNode.field2783 * 1781952581 + 2] & 0xFF) << 8) - n8);
            }
            n2 = n7 * n2 - 1174884891 >> 6;
        }
        return n2;
    }
    
    public static int tb(final MidiPcmStream midiPcmStream, final MusicPatchNode musicPatchNode, final int n) {
        if (midiPcmStream == null) {
            midiPcmStream.method1632(musicPatchNode, n);
        }
        try {
            final int n2 = midiPcmStream.field2752[musicPatchNode.field2801 * 1021419297];
            if (n2 >= 8192) {
                return 16384 - ((16384 - n2) * (128 - musicPatchNode.field2790 * 1083381765) + 32 >> 6);
            }
            if (n == 522688965) {
                throw new IllegalStateException();
            }
            return 32 + n2 * (musicPatchNode.field2790 * 1083381765) >> 6;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bl(" + ')');
        }
    }
    
    void dc(final int n, final int n2) {
        if (n2 != this.field2745[n]) {
            this.field2745[n] = n2;
            for (int i = 0; i < 128; ++i) {
                this.field2733[n][i] = null;
            }
        }
    }
    
    public synchronized void bw(final int n) {
        try {
            for (MusicPatch musicPatch = (MusicPatch)this.musicPatches.first(); musicPatch != null; musicPatch = (MusicPatch)this.musicPatches.next()) {
                if (n == -1429517478) {
                    throw new IllegalStateException();
                }
                MusicPatch.fp(musicPatch, (byte)(-21));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ac(" + ')');
        }
    }
    
    public synchronized void cf() {
        for (MusicPatch musicPatch = (MusicPatch)this.musicPatches.first(); null != musicPatch; musicPatch = (MusicPatch)this.musicPatches.next()) {
            musicPatch.hw();
        }
    }
    
    public synchronized boolean cw() {
        return this.midiFile.isReady();
    }
    
    public synchronized void cv(final MusicTrack musicTrack, final boolean field2759) {
        this.clear((byte)92);
        MidiFileReader.lm(this.midiFile, musicTrack.midi);
        this.field2759 = field2759;
        this.field2737 = 0L;
        for (int ad = this.midiFile.ad(), i = 0; i < ad; ++i) {
            this.midiFile.gotoTrack(i);
            this.midiFile.readTrackLength(i);
            this.midiFile.markTrackPosition(i);
        }
        this.track = this.midiFile.trackCount() * 1303477277;
        this.trackLength = this.midiFile.trackLengths[this.track * -2130330853] * -1172591539;
        this.field2758 = this.midiFile.method1656(this.trackLength * 879563806) * -5361838125554816559L;
    }
    
    public synchronized void clear(final byte b) {
        try {
            MidiFileReader.vw(this.midiFile);
            this.method1626(-964267539);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ao(" + ')');
        }
    }
    
    public static void ft(final MidiPcmStream midiPcmStream, final int n) {
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.last(); null != musicPatchNode; musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.previous()) {
            if (n < 0 || 1021419297 * musicPatchNode.field2801 == n) {
                if (null != musicPatchNode.stream) {
                    musicPatchNode.stream.method268(PcmPlayer.field201 * -1359271235 / 100);
                    if (musicPatchNode.stream.eo()) {
                        midiPcmStream.patchStream.mixer.addSubStream(musicPatchNode.stream);
                    }
                    MusicPatchNode.bk(musicPatchNode, (byte)(-50));
                }
                if (musicPatchNode.field2798 * -602614853 < 0) {
                    midiPcmStream.field2753[musicPatchNode.field2801 * -2031904173][-1006692268 * musicPatchNode.field2788] = null;
                }
                musicPatchNode.hw();
            }
        }
    }
    
    @Override
    protected synchronized void fill(final int[] array, int n, int n2) {
        try {
            Label_0024: {
                if (this.midiFile.isReady()) {
                    final int n3 = this.midiFile.division * (this.field2735 * 437930689) / (-1359271235 * PcmPlayer.field201);
                    long n4 = 0L;
                    Label_0193: {
                        break Label_0193;
                        do {
                            final int n5 = (int)((-8691691867109044431L * this.field2758 - 8370013022464380265L * this.field2737 + n3 - 1L) / n3);
                            this.field2737 += n3 * (long)n5 * 389160967981716185L;
                            this.patchStream.fill(array, n, n5);
                            n += n5;
                            n2 -= n5;
                            dj(this, 486029060);
                            if (!this.midiFile.isReady()) {
                                break Label_0024;
                            }
                            n4 = n2 * (long)n3 + this.field2737 * 8370013022464380265L;
                        } while (this.field2758 * -8691691867109044431L - n4 < 0L);
                    }
                    this.field2737 = n4 * 389160967981716185L;
                }
            }
            this.patchStream.fill(array, n, n2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.at(" + ')');
        }
    }
    
    void method1623(final int n, final int n2, final int n3) {
        try {
            this.field2740[n] = n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ak(" + ')');
        }
    }
    
    void method1620(final int n, final int n2, final int n3, final int n4) {
        try {
            this.method1621(n, n2, 64, (byte)104);
            if (0x0 != (this.field2746[n] & 0x2)) {
                if (n4 >= 283632252) {
                    throw new IllegalStateException();
                }
                for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.first(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.next()) {
                    if (n4 >= 283632252) {
                        throw new IllegalStateException();
                    }
                    if (n == musicPatchNode.field2801 * 1021419297) {
                        if (n4 >= 283632252) {
                            throw new IllegalStateException();
                        }
                        if (musicPatchNode.field2798 * -602614853 < 0) {
                            if (n4 >= 283632252) {
                                throw new IllegalStateException();
                            }
                            this.field2753[n][musicPatchNode.field2788 * -630482265] = null;
                            this.field2753[n][n2] = musicPatchNode;
                            final int n5 = -279706293 * musicPatchNode.field2804 + (-1077015879 * musicPatchNode.field2793 * (musicPatchNode.field2792 * 274954637) >> 12);
                            final MusicPatchNode musicPatchNode2 = musicPatchNode;
                            musicPatchNode2.field2804 += (n2 - musicPatchNode.field2788 * -630482265 << 8) * -1343136669;
                            musicPatchNode.field2792 = (n5 - musicPatchNode.field2804 * -279706293) * -101879483;
                            musicPatchNode.field2793 = 230199296;
                            musicPatchNode.field2788 = n2 * -1339790057;
                            return;
                        }
                    }
                }
            }
            final MusicPatch patch = (MusicPatch)this.musicPatches.at(this.field2745[n]);
            if (patch == null) {
                if (n4 >= 283632252) {
                    throw new IllegalStateException();
                }
            }
            else {
                final RawSound rawSound = patch.rawSounds[n2];
                if (null != rawSound) {
                    final MusicPatchNode musicPatchNode3 = new MusicPatchNode();
                    musicPatchNode3.field2801 = n * -2055035679;
                    musicPatchNode3.patch = patch;
                    musicPatchNode3.rawSound = rawSound;
                    musicPatchNode3.field2786 = patch.field2775[n2];
                    musicPatchNode3.field2784 = -1957781017 * patch.field2776[n2];
                    musicPatchNode3.field2788 = -1339790057 * n2;
                    musicPatchNode3.field2789 = -284955771 * (1024 + -1979814511 * patch.field2772 * (n3 * n3) * patch.field2773[n2] >> 11);
                    musicPatchNode3.field2790 = (patch.field2774[n2] & 0xFF) * -539102003;
                    musicPatchNode3.field2804 = ((n2 << 8) - (patch.field2771[n2] & 0x7FFF)) * -1343136669;
                    musicPatchNode3.field2794 = 0;
                    musicPatchNode3.field2795 = 0;
                    musicPatchNode3.field2802 = 0;
                    musicPatchNode3.field2798 = -81590643;
                    musicPatchNode3.field2783 = 0;
                    if (this.field2749[n] == 0) {
                        if (n4 >= 283632252) {
                            throw new IllegalStateException();
                        }
                        musicPatchNode3.stream = RawPcmStream.method294(rawSound, this.method1630(musicPatchNode3, 1876045884), xf(this, musicPatchNode3, 1797141600), tb(this, musicPatchNode3, -1585355620));
                    }
                    else {
                        musicPatchNode3.stream = RawPcmStream.method294(rawSound, this.method1630(musicPatchNode3, 1905115536), 0, tb(this, musicPatchNode3, 2104687585));
                        final MusicPatchNode musicPatchNode4 = musicPatchNode3;
                        boolean b;
                        if (patch.field2771[n2] < 0) {
                            if (n4 >= 283632252) {
                                return;
                            }
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        this.method1639(musicPatchNode4, b, 2135313615);
                    }
                    if (patch.field2771[n2] < 0) {
                        if (n4 >= 283632252) {
                            throw new IllegalStateException();
                        }
                        musicPatchNode3.stream.setNumLoops(-1);
                    }
                    if (1959190999 * musicPatchNode3.field2784 >= 0) {
                        if (n4 >= 283632252) {
                            throw new IllegalStateException();
                        }
                        final MusicPatchNode musicPatchNode5 = this.field2733[n][1959190999 * musicPatchNode3.field2784];
                        if (null != musicPatchNode5 && musicPatchNode5.field2798 * -602614853 < 0) {
                            if (n4 >= 283632252) {
                                throw new IllegalStateException();
                            }
                            this.field2753[n][-630482265 * musicPatchNode5.field2788] = null;
                            musicPatchNode5.field2798 = 0;
                        }
                        this.field2733[n][musicPatchNode3.field2784 * 1959190999] = musicPatchNode3;
                    }
                    this.patchStream.queue.addFirst(musicPatchNode3);
                    this.field2753[n][n2] = musicPatchNode3;
                    return;
                }
                if (n4 >= 283632252) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.av(" + ')');
        }
    }
    
    public synchronized boolean cj() {
        return this.midiFile.isReady();
    }
    
    @Override
    protected synchronized PcmStream be() {
        return null;
    }
    
    public synchronized void cp(final int n, final int n2) {
        this.method1619(n, n2, (byte)52);
    }
    
    void method1622(final int n, final int n2, final int n3, final int n4) {
    }
    
    public static void ts(final MidiPcmStream midiPcmStream, final int n, final int n2, final int n3) {
        if (midiPcmStream == null) {
            midiPcmStream.method1623(n, n, n);
        }
        try {
            midiPcmStream.field2742[n] = n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ak(" + ')');
        }
    }
    
    int ek(final MusicPatchNode musicPatchNode) {
        final int n = this.field2752[musicPatchNode.field2801 * 1021419297];
        if (n < 8192) {
            return 32 + n * (musicPatchNode.field2790 * 1083381765) >> 6;
        }
        return 935517112 - ((1420697474 - n) * (1598615070 - musicPatchNode.field2790 * 1083381765) + 32 >> 6);
    }
    
    int eh(final MusicPatchNode musicPatchNode) {
        final int n = this.field2752[musicPatchNode.field2801 * 1021419297];
        if (n < 8192) {
            return 32 + n * (musicPatchNode.field2790 * 1083381765) >> 6;
        }
        return 16384 - ((16384 - n) * (128 - musicPatchNode.field2790 * 1083381765) + 32 >> 6);
    }
    
    void eq(int i) {
        if (i < 0) {
            for (i = 0; i < 16; ++i) {
                this.method1625(i, 605524522);
            }
            return;
        }
        this.field2744[i] = 12800;
        this.field2752[i] = 8192;
        this.field2738[i] = 16383;
        this.field2742[i] = 8192;
        this.field2740[i] = 0;
        this.field2760[i] = 8192;
        this.method1640(i, (byte)(-14));
        this.method1627(i, -1399202551);
        this.field2746[i] = 0;
        this.field2747[i] = 32767;
        this.field2736[i] = 256;
        this.field2749[i] = 0;
        this.method1629(i, 8192, -1731550836);
    }
    
    void method1624(final int n, final int n2) {
        try {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); null != musicPatchNode; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
                if (n2 >= 1038029064) {
                    throw new IllegalStateException();
                }
                if (n >= 0) {
                    if (1021419297 * musicPatchNode.field2801 != n) {
                        continue;
                    }
                    if (n2 >= 1038029064) {
                        return;
                    }
                }
                if (null != musicPatchNode.stream) {
                    if (n2 >= 1038029064) {
                        throw new IllegalStateException();
                    }
                    musicPatchNode.stream.method268(PcmPlayer.field201 * -1359271235 / 100);
                    if (musicPatchNode.stream.eo()) {
                        if (n2 >= 1038029064) {
                            throw new IllegalStateException();
                        }
                        this.patchStream.mixer.addSubStream(musicPatchNode.stream);
                    }
                    MusicPatchNode.bk(musicPatchNode, (byte)(-60));
                }
                if (musicPatchNode.field2798 * -602614853 < 0) {
                    if (n2 >= 1038029064) {
                        throw new IllegalStateException();
                    }
                    this.field2753[musicPatchNode.field2801 * 1021419297][-630482265 * musicPatchNode.field2788] = null;
                }
                musicPatchNode.hw();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.az(" + ')');
        }
    }
    
    public synchronized boolean isReady(final int n) {
        try {
            return this.midiFile.isReady();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ax(" + ')');
        }
    }
    
    @Override
    protected synchronized void skip(int n) {
        try {
            if (this.midiFile.isReady()) {
                final int n2 = this.midiFile.division * (437930689 * this.field2735) / (-1359271235 * PcmPlayer.field201);
                do {
                    final long n3 = 8370013022464380265L * this.field2737 + n2 * (long)n;
                    if (-8691691867109044431L * this.field2758 - n3 >= 0L) {
                        this.field2737 = 389160967981716185L * n3;
                        break;
                    }
                    final int n4 = (int)((this.field2758 * -8691691867109044431L - 8370013022464380265L * this.field2737 + n2 - 1L) / n2);
                    this.field2737 += n4 * (long)n2 * 389160967981716185L;
                    this.patchStream.skip(n4);
                    n -= n4;
                    dj(this, 486029060);
                } while (this.midiFile.isReady());
            }
            this.patchStream.skip(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ay(" + ')');
        }
    }
    
    @Override
    protected synchronized PcmStream bi() {
        return this.patchStream;
    }
    
    int method1631(final MusicPatchNode musicPatchNode, final int n) {
        try {
            final int n2 = this.field2745[musicPatchNode.field2789 * 1021419297];
            if (n2 >= 8192) {
                return 16384 - ((16384 - n2) * (128 - musicPatchNode.field2799 * 1083381765) + 32 >> 6);
            }
            if (n == 522688965) {
                throw new IllegalStateException();
            }
            return 32 + n2 * (musicPatchNode.field2796 * 1083381765) >> 6;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bl(" + ')');
        }
    }
    
    void dl(final MusicPatchNode musicPatchNode, final boolean b) {
        final int length = musicPatchNode.rawSound.samples.length;
        int n;
        if (b && musicPatchNode.rawSound.field176) {
            n = (int)(this.field2749[1021419297 * musicPatchNode.field2801] * (long)(length + length - musicPatchNode.rawSound.start) >> 6);
            final int n2 = length << 8;
            if (n >= n2) {
                n = n2 + n2 - 1 - n;
                musicPatchNode.stream.method264(true);
            }
        }
        else {
            n = (int)(this.field2749[musicPatchNode.field2801 * 976182423] * (long)length >> 6);
        }
        musicPatchNode.stream.method263(n);
    }
    
    public synchronized void ck() {
        for (MusicPatch musicPatch = (MusicPatch)this.musicPatches.first(); musicPatch != null; musicPatch = (MusicPatch)this.musicPatches.next()) {
            MusicPatch.fp(musicPatch, (byte)(-36));
        }
    }
    
    @Override
    protected synchronized int bo() {
        return 0;
    }
    
    void di(final int n, final int n2, final int n3) {
        this.method1621(n, n2, 64, (byte)5);
        if (0x0 != (this.field2746[n] & 0x2)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.first(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.next()) {
                if (n == musicPatchNode.field2801 * 1021419297 && musicPatchNode.field2798 * -602614853 < 0) {
                    this.field2753[n][musicPatchNode.field2788 * -630482265] = null;
                    this.field2753[n][n2] = musicPatchNode;
                    final int n4 = -279706293 * musicPatchNode.field2804 + (-1077015879 * musicPatchNode.field2793 * (musicPatchNode.field2792 * 274954637) >> 12);
                    final MusicPatchNode musicPatchNode2 = musicPatchNode;
                    musicPatchNode2.field2804 += (n2 - musicPatchNode.field2788 * -630482265 << 8) * -1343136669;
                    musicPatchNode.field2792 = (n4 - musicPatchNode.field2804 * -279706293) * -101879483;
                    musicPatchNode.field2793 = 230199296;
                    musicPatchNode.field2788 = n2 * -1339790057;
                    return;
                }
            }
        }
        final MusicPatch patch = (MusicPatch)this.musicPatches.at(this.field2745[n]);
        if (patch == null) {
            return;
        }
        final RawSound rawSound = patch.rawSounds[n2];
        if (null == rawSound) {
            return;
        }
        final MusicPatchNode musicPatchNode3 = new MusicPatchNode();
        musicPatchNode3.field2801 = n * -2055035679;
        musicPatchNode3.patch = patch;
        musicPatchNode3.rawSound = rawSound;
        musicPatchNode3.field2786 = patch.field2775[n2];
        musicPatchNode3.field2784 = -1957781017 * patch.field2776[n2];
        musicPatchNode3.field2788 = -1339790057 * n2;
        musicPatchNode3.field2789 = -284955771 * (1024 + -1979814511 * patch.field2772 * (n3 * n3) * patch.field2773[n2] >> 11);
        musicPatchNode3.field2790 = (patch.field2774[n2] & 0xFF) * -539102003;
        musicPatchNode3.field2804 = ((n2 << 8) - (patch.field2771[n2] & 0x7FFF)) * -1343136669;
        musicPatchNode3.field2794 = 0;
        musicPatchNode3.field2795 = 0;
        musicPatchNode3.field2802 = 0;
        musicPatchNode3.field2798 = -81590643;
        musicPatchNode3.field2783 = 0;
        if (this.field2749[n] == 0) {
            musicPatchNode3.stream = RawPcmStream.method294(rawSound, this.method1630(musicPatchNode3, 1570592697), xf(this, musicPatchNode3, -2018498840), tb(this, musicPatchNode3, 11367252));
        }
        else {
            musicPatchNode3.stream = RawPcmStream.method294(rawSound, this.method1630(musicPatchNode3, 1511971485), 0, tb(this, musicPatchNode3, 638097057));
            this.method1639(musicPatchNode3, patch.field2771[n2] < 0, 2126571294);
        }
        if (patch.field2771[n2] < 0) {
            musicPatchNode3.stream.setNumLoops(-1);
        }
        if (1959190999 * musicPatchNode3.field2784 >= 0) {
            final MusicPatchNode musicPatchNode4 = this.field2733[n][1959190999 * musicPatchNode3.field2784];
            if (null != musicPatchNode4 && musicPatchNode4.field2798 * -602614853 < 0) {
                this.field2753[n][-630482265 * musicPatchNode4.field2788] = null;
                musicPatchNode4.field2798 = 0;
            }
            this.field2733[n][musicPatchNode3.field2784 * 1959190999] = musicPatchNode3;
        }
        this.patchStream.queue.addFirst(musicPatchNode3);
        this.field2753[n][n2] = musicPatchNode3;
    }
    
    boolean fs(final MusicPatchNode musicPatchNode, final int[] array, final int n, final int n2) {
        musicPatchNode.field2796 = 652897503 * (PcmPlayer.field201 * -1359271235 / 100);
        if (-602614853 * musicPatchNode.field2798 >= 0 && (musicPatchNode.stream == null || musicPatchNode.stream.ep())) {
            MusicPatchNode.bk(musicPatchNode, (byte)(-17));
            musicPatchNode.hw();
            if (1959190999 * musicPatchNode.field2784 > 0 && musicPatchNode == this.field2733[musicPatchNode.field2801 * 1021419297][musicPatchNode.field2784 * 1959190999]) {
                this.field2733[1021419297 * musicPatchNode.field2801][musicPatchNode.field2784 * 1959190999] = null;
            }
            return true;
        }
        final int n3 = musicPatchNode.field2793 * -1077015879;
        if (n3 > 0) {
            int n4 = n3 - (int)(16.0 * Math.pow(2.0, this.field2760[1021419297 * musicPatchNode.field2801] * 4.921259842519685E-4) + 0.5);
            if (n4 < 0) {
                n4 = 0;
            }
            musicPatchNode.field2793 = n4 * -871310455;
        }
        musicPatchNode.stream.method269(this.method1630(musicPatchNode, 1468247128));
        final MusicPatchNode2 field2786 = musicPatchNode.field2786;
        int n5 = 0;
        musicPatchNode.field2799 -= 1164121829;
        musicPatchNode.field2791 += 100789159 * field2786.field2724;
        final double n6 = 5.086263020833333E-6 * ((274954637 * musicPatchNode.field2792 * (musicPatchNode.field2793 * -1077015879) >> 12) + (-630482265 * musicPatchNode.field2788 - 60 << 8));
        if (354539497 * field2786.field2719 > 0) {
            if (field2786.field2722 * 821482501 > 0) {
                musicPatchNode.field2794 += (int)(128.0 * Math.pow(2.0, 821482501 * field2786.field2722 * n6) + 0.5) * 349596629;
            }
            else {
                musicPatchNode.field2794 += 1798695552;
            }
        }
        if (null != field2786.field2718) {
            if (field2786.field2720 * -32542335 > 0) {
                musicPatchNode.field2795 += (int)(128.0 * Math.pow(2.0, -32542335 * field2786.field2720 * n6) + 0.5) * -257124661;
            }
            else {
                musicPatchNode.field2795 += 1447781760;
            }
            while (891662681 * musicPatchNode.field2802 < field2786.field2718.length - 2 && musicPatchNode.field2795 * 873438947 > (field2786.field2718[musicPatchNode.field2802 * 891662681 + 2] & 0xFF) << 8) {
                musicPatchNode.field2802 -= 934605358;
            }
            if (musicPatchNode.field2802 * 891662681 == field2786.field2718.length - 2 && 0 == field2786.field2718[1 + 891662681 * musicPatchNode.field2802]) {
                n5 = 1;
            }
        }
        if (musicPatchNode.field2798 * -602614853 >= 0 && field2786.field2717 != null && 0x0 == (this.field2746[1021419297 * musicPatchNode.field2801] & 0x1) && (musicPatchNode.field2784 * 1959190999 < 0 || musicPatchNode != this.field2733[musicPatchNode.field2801 * 1021419297][musicPatchNode.field2784 * 1959190999])) {
            if (-574961187 * field2786.field2725 > 0) {
                musicPatchNode.field2798 += (int)(128.0 * Math.pow(2.0, field2786.field2725 * -574961187 * n6) + 0.5) * 81590643;
            }
            else {
                musicPatchNode.field2798 += 1853667712;
            }
            while (musicPatchNode.field2783 * -371546193 < field2786.field2717.length - 2 && -602614853 * musicPatchNode.field2798 > (field2786.field2717[2 + -371546193 * musicPatchNode.field2783] & 0xFF) << 8) {
                musicPatchNode.field2783 += 2121932446;
            }
            if (field2786.field2717.length - 2 == musicPatchNode.field2783 * -371546193) {
                n5 = 1;
            }
        }
        if (n5 != 0) {
            musicPatchNode.stream.method268(-1971564769 * musicPatchNode.field2796);
            if (null != array) {
                musicPatchNode.stream.fill(array, n, n2);
            }
            else {
                musicPatchNode.stream.skip(n2);
            }
            if (musicPatchNode.stream.eo()) {
                this.patchStream.mixer.addSubStream(musicPatchNode.stream);
            }
            MusicPatchNode.bk(musicPatchNode, (byte)28);
            if (musicPatchNode.field2798 * -602614853 >= 0) {
                musicPatchNode.hw();
                if (1959190999 * musicPatchNode.field2784 > 0 && this.field2733[1021419297 * musicPatchNode.field2801][1959190999 * musicPatchNode.field2784] == musicPatchNode) {
                    this.field2733[1021419297 * musicPatchNode.field2801][musicPatchNode.field2784 * 1959190999] = null;
                }
            }
            return true;
        }
        musicPatchNode.stream.method267(musicPatchNode.field2796 * -1971564769, xf(this, musicPatchNode, 679640786), tb(this, musicPatchNode, 1057936977));
        return false;
    }
    
    void method1637(final int n) {
        try {
            int ad = this.trackLength * -2130330853;
            int n2 = this.track * 2049666181;
            long method1656 = this.field2737 * -8691691867109044431L;
            while (this.field2735 * 2049666181 == n2) {
                if (n != 486029060) {
                    throw new IllegalStateException();
                }
                while (this.midiFile.trackStarts[ad] == n2) {
                    if (n != 486029060) {
                        return;
                    }
                    this.midiFile.gotoTrack(ad);
                    final int bo = this.midiFile.bo(ad);
                    if (bo != 0) {
                        if (n != 486029060) {
                            return;
                        }
                        this.midiFile.bb();
                        this.midiFile.be(ad);
                        if (!this.midiFile.as()) {
                            break;
                        }
                        if (!this.field2759 || n2 == 0) {
                            this.eq(-964267539);
                            MidiFileReader.vw(this.midiFile);
                            return;
                        }
                        if (n != 486029060) {
                            throw new IllegalStateException();
                        }
                        this.midiFile.reset(method1656);
                        break;
                    }
                    else {
                        if ((bo & 0x80) != 0x0) {
                            this.method1624(bo, -1376449037);
                        }
                        this.midiFile.be(ad);
                        this.midiFile.ap(ad);
                    }
                }
                ad = this.midiFile.ad();
                n2 = this.midiFile.trackLengths[ad];
                method1656 = this.midiFile.method1656(n2);
            }
            this.field2757 = 911615763 * ad;
            this.trackLength = -1172591539 * n2;
            this.field2737 = -5361838125554816559L * method1656;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bp(" + ')');
        }
    }
    
    public synchronized void ct(final int n, final int n2) {
        this.method1619(n, n2, (byte)(-74));
    }
    
    void dv(final MusicPatchNode musicPatchNode, final boolean b) {
        final int length = musicPatchNode.rawSound.samples.length;
        int n;
        if (b && musicPatchNode.rawSound.field176) {
            n = (int)(this.field2749[1021419297 * musicPatchNode.field2801] * (long)(length + length - musicPatchNode.rawSound.start) >> 6);
            final int n2 = length << 8;
            if (n >= n2) {
                n = n2 + n2 - 1 - n;
                musicPatchNode.stream.method264(true);
            }
        }
        else {
            n = (int)(this.field2749[musicPatchNode.field2801 * 1021419297] * (long)length >> 6);
        }
        musicPatchNode.stream.method263(n);
    }
    
    public static void tt(final MidiPcmStream midiPcmStream, final int n) {
        if (midiPcmStream == null) {
            midiPcmStream.method1627(n, n);
            return;
        }
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.last(); null != musicPatchNode; musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.previous()) {
            if (n < 0 || 1021419297 * musicPatchNode.field2801 == n) {
                if (null != musicPatchNode.stream) {
                    musicPatchNode.stream.method268(PcmPlayer.field201 * -1359271235 / 100);
                    if (musicPatchNode.stream.eo()) {
                        midiPcmStream.patchStream.mixer.addSubStream(musicPatchNode.stream);
                    }
                    MusicPatchNode.bk(musicPatchNode, (byte)(-35));
                }
                if (musicPatchNode.field2798 * -602614853 < 0) {
                    midiPcmStream.field2753[musicPatchNode.field2801 * 1943353848][2011314404 * musicPatchNode.field2788] = null;
                }
                musicPatchNode.hw();
            }
        }
    }
    
    @Override
    protected synchronized void bt(final int[] array, int n, int n2) {
        if (this.midiFile.isReady()) {
            final int n3 = this.midiFile.division * (this.field2735 * 437930689) / (-1359271235 * PcmPlayer.field201);
            do {
                final long n4 = n2 * (long)n3 + this.field2737 * 8370013022464380265L;
                if (this.field2758 * -8691691867109044431L - n4 >= 0L) {
                    this.field2737 = n4 * 389160967981716185L;
                    break;
                }
                final int n5 = (int)((-8691691867109044431L * this.field2758 - 8370013022464380265L * this.field2737 + n3 - 1L) / n3);
                this.field2737 += n3 * (long)n5 * 389160967981716185L;
                this.patchStream.fill(array, n, n5);
                n += n5;
                n2 -= n5;
                dj(this, 486029060);
            } while (this.midiFile.isReady());
        }
        this.patchStream.fill(array, n, n2);
    }
    
    void ds(final int n) {
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); null != musicPatchNode; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (n < 0 || 1021419297 * musicPatchNode.field2801 == n) {
                if (null != musicPatchNode.stream) {
                    musicPatchNode.stream.method268(PcmPlayer.field201 * -1359271235 / 100);
                    if (musicPatchNode.stream.eo()) {
                        this.patchStream.mixer.addSubStream(musicPatchNode.stream);
                    }
                    MusicPatchNode.bk(musicPatchNode, (byte)106);
                }
                if (musicPatchNode.field2798 * 134613144 < 0) {
                    this.field2753[musicPatchNode.field2801 * 478989243][-630482265 * musicPatchNode.field2788] = null;
                }
                musicPatchNode.hw();
            }
        }
    }
    
    void dh(final int n, final int n2, final int n3) {
    }
    
    boolean method1646(final MusicPatchNode musicPatchNode, final short n) {
        try {
            if (musicPatchNode.stream != null) {
                return false;
            }
            if (n == 145) {
                throw new IllegalStateException();
            }
            if (musicPatchNode.field2798 * -602614853 >= 0) {
                if (n == 145) {
                    throw new IllegalStateException();
                }
                musicPatchNode.hw();
                if (1959190999 * musicPatchNode.field2784 > 0) {
                    if (n == 145) {
                        throw new IllegalStateException();
                    }
                    if (this.field2733[musicPatchNode.field2801 * 1021419297][musicPatchNode.field2784 * 1959190999] == musicPatchNode) {
                        if (n == 145) {
                            throw new IllegalStateException();
                        }
                        this.field2733[musicPatchNode.field2801 * 1021419297][1959190999 * musicPatchNode.field2784] = null;
                    }
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bc(" + ')');
        }
    }
    
    void method1629(final int n, final int n2, final int n3) {
        try {
            this.field2750[n] = n2;
            this.field2751[n] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * n2) + 0.5);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.br(" + ')');
        }
    }
    
    public static void ei(final MidiPcmStream midiPcmStream) {
        if (midiPcmStream == null) {
            midiPcmStream.bz();
        }
        int trackCount = midiPcmStream.track * -2130330853;
        int n = midiPcmStream.trackLength * -2102446898;
        long method1656 = midiPcmStream.field2758 * -8691691867109044431L;
        while (midiPcmStream.trackLength * -1768406958 == n) {
            while (midiPcmStream.midiFile.trackLengths[trackCount] == n) {
                midiPcmStream.midiFile.gotoTrack(trackCount);
                final int message = midiPcmStream.midiFile.readMessage(trackCount);
                if (message != 0) {
                    midiPcmStream.midiFile.bb();
                    midiPcmStream.midiFile.markTrackPosition(trackCount);
                    if (!midiPcmStream.midiFile.isDone()) {
                        break;
                    }
                    if (midiPcmStream.field2759 && n != 0) {
                        midiPcmStream.midiFile.reset(method1656);
                        break;
                    }
                    midiPcmStream.method1626(-964267539);
                    MidiFileReader.vw(midiPcmStream.midiFile);
                    return;
                }
                else {
                    if ((message & 0xD563C3DC) != 0x0) {
                        midiPcmStream.method1628(message, -557182311);
                    }
                    midiPcmStream.midiFile.readTrackLength(trackCount);
                    midiPcmStream.midiFile.markTrackPosition(trackCount);
                }
            }
            trackCount = midiPcmStream.midiFile.trackCount();
            n = midiPcmStream.midiFile.trackLengths[trackCount];
            method1656 = midiPcmStream.midiFile.method1656(n);
        }
        midiPcmStream.track = -351302444 * trackCount;
        midiPcmStream.trackLength = -1172591539 * n;
        midiPcmStream.field2758 = -5361838125554816559L * method1656;
    }
    
    public synchronized void ci(final int n) {
        this.field2757 = 1881678515 * n;
    }
    
    public synchronized boolean loadMusicTrack(final MusicTrack musicTrack, final AbstractArchive abstractArchive, final SoundCache soundCache, final int n, final int n2) {
        try {
            MusicTrack.wf(musicTrack);
            boolean b = true;
            int[] array = null;
            if (n > 0) {
                array = new int[] { n };
            }
            for (ByteArrayNode byteArrayNode = (ByteArrayNode)musicTrack.table.first(); null != byteArrayNode; byteArrayNode = (ByteArrayNode)musicTrack.table.next()) {
                final int n3 = (int)byteArrayNode.hr;
                MusicPatch musicPatch = (MusicPatch)this.musicPatches.at(n3);
                if (null == musicPatch) {
                    final byte[] sh = AbstractArchive.sh(abstractArchive, n3, (byte)(-18));
                    MusicPatch musicPatch2;
                    if (sh == null) {
                        if (n2 >= -350669271) {
                            throw new IllegalStateException();
                        }
                        musicPatch2 = null;
                    }
                    else {
                        musicPatch2 = new MusicPatch(sh);
                    }
                    musicPatch = musicPatch2;
                    if (null == musicPatch) {
                        if (n2 >= -350669271) {
                            throw new IllegalStateException();
                        }
                        b = false;
                        continue;
                    }
                    else {
                        this.musicPatches.put(musicPatch, n3);
                    }
                }
                if (!musicPatch.method1663(soundCache, byteArrayNode.byteArray, array, 875110520)) {
                    if (n2 >= -350669271) {
                        throw new IllegalStateException();
                    }
                    b = false;
                }
            }
            if (b) {
                if (n2 >= -350669271) {
                    throw new IllegalStateException();
                }
                musicTrack.ao();
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.aw(" + ')');
        }
    }
    
    void method1621(final int n, final int n2, final int n3, final byte b) {
        try {
            final MusicPatchNode musicPatchNode = this.field2753[n][n2];
            if (null != musicPatchNode) {
                this.field2753[n][n2] = null;
                if (0x0 != (this.field2746[n] & 0x2)) {
                    for (MusicPatchNode musicPatchNode2 = (MusicPatchNode)this.patchStream.queue.last(); null != musicPatchNode2; musicPatchNode2 = (MusicPatchNode)this.patchStream.queue.previous()) {
                        if (b <= 3) {
                            throw new IllegalStateException();
                        }
                        if (1021419297 * musicPatchNode2.field2801 == 1021419297 * musicPatchNode.field2801) {
                            if (b <= 3) {
                                throw new IllegalStateException();
                            }
                            if (musicPatchNode2.field2798 * -602614853 < 0) {
                                if (b <= 3) {
                                    throw new IllegalStateException();
                                }
                                if (musicPatchNode2 != musicPatchNode) {
                                    if (b <= 3) {
                                        throw new IllegalStateException();
                                    }
                                    musicPatchNode.field2798 = 0;
                                    break;
                                }
                            }
                        }
                    }
                }
                else {
                    musicPatchNode.field2798 = 0;
                }
                return;
            }
            if (b <= 3) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.am(" + ')');
        }
    }
    
    public static void method1621(final MidiPcmStream midiPcmStream, final int n) {
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.last(); null != musicPatchNode; musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.previous()) {
            if ((n < 0 || n == musicPatchNode.field2801 * 1021419297) && musicPatchNode.field2798 * -602614853 < 0) {
                midiPcmStream.field2753[1021419297 * musicPatchNode.field2801][-630482265 * musicPatchNode.field2788] = null;
                musicPatchNode.field2798 = 0;
            }
        }
    }
    
    int em(final MusicPatchNode musicPatchNode) {
        int n = (274954637 * musicPatchNode.field2788 * (-1077015879 * musicPatchNode.field2790) >> 12) + -279706293 * musicPatchNode.field2788 + (this.field2746[musicPatchNode.field2795 * 1021419297] * (this.field2747[1021419297 * musicPatchNode.field2801] - 8192) >> 12);
        final MusicPatchNode2 field2786 = musicPatchNode.field2786;
        if (field2786.field2725 * -1668380791 > 0 && (-1552238757 * field2786.field2724 > 0 || this.field2741[musicPatchNode.field2788 * 1021419297] > 0)) {
            int n2 = field2786.field2724 * -1552238757 << 2;
            final int n3 = 391036783 * field2786.field2724 << 1;
            if (667306259 * musicPatchNode.field2795 < n3) {
                n2 = n2 * (musicPatchNode.field2790 * 667306259) / n3;
            }
            n += (int)(Math.sin(0.01227184630308513 * (musicPatchNode.field2792 * -2032101041 & 0x1FF)) * (n2 + (this.field2746[1021419297 * musicPatchNode.field2790] >> 7)));
        }
        final int n4 = (int)(256 * musicPatchNode.rawSound.start * Math.pow(2.0, 3.255208333333333E-4 * n) / (PcmPlayer.field201 * -1359271235) + 0.5);
        return (n4 < 1) ? 1 : n4;
    }
    
    @Override
    protected synchronized int vmethod5648() {
        return 0;
    }
    
    void df(final int n, final int n2) {
    }
    
    public synchronized boolean cu(final MusicTrack musicTrack, final AbstractArchive abstractArchive, final SoundCache soundCache, final int n) {
        MusicTrack.wf(musicTrack);
        boolean b = true;
        int[] array = null;
        if (n > 0) {
            array = new int[] { n };
        }
        ByteArrayNode byteArrayNode = (ByteArrayNode)musicTrack.table.first();
    Label_0096_Outer:
        while (null != byteArrayNode) {
            final int n2 = (int)byteArrayNode.hr;
            MusicPatch musicPatch = (MusicPatch)this.musicPatches.at(n2);
            while (true) {
                Label_0176: {
                    if (null != musicPatch) {
                        break Label_0176;
                    }
                    final byte[] sh = AbstractArchive.sh(abstractArchive, n2, (byte)(-8));
                    MusicPatch musicPatch2;
                    if (sh == null) {
                        musicPatch2 = null;
                    }
                    else {
                        musicPatch2 = new MusicPatch(sh);
                    }
                    musicPatch = musicPatch2;
                    if (null != musicPatch) {
                        this.musicPatches.put(musicPatch, n2);
                        break Label_0176;
                    }
                    b = false;
                    byteArrayNode = (ByteArrayNode)musicTrack.table.next();
                    continue Label_0096_Outer;
                }
                if (!musicPatch.method1663(soundCache, byteArrayNode.byteArray, array, -1230380670)) {
                    b = false;
                }
                continue;
            }
        }
        if (b) {
            musicTrack.ao();
        }
        return b;
    }
    
    void dm(final int n, final int n2) {
        this.field2739[n] = n2;
        this.field2741[n] = (n2 & 0xA4AAF284);
        this.method1641(n, n2, 1944423622);
    }
    
    public int method1644(final byte b) {
        try {
            return 1380277371 * this.field2757;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.an(" + ')');
        }
    }
    
    public synchronized void clearAll(final int n) {
        try {
            for (MusicPatch musicPatch = (MusicPatch)this.musicPatches.first(); null != musicPatch; musicPatch = (MusicPatch)this.musicPatches.next()) {
                musicPatch.hw();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.au(" + ')');
        }
    }
    
    public void lx(final int n) {
        this.setPcmStreamVolume(n, (byte)19);
    }
    
    public synchronized void cx(final MusicTrack musicTrack, final boolean field2759) {
        this.clear((byte)(-18));
        MidiFileReader.lm(this.midiFile, musicTrack.midi);
        this.field2759 = field2759;
        this.field2737 = 0L;
        for (int ad = this.midiFile.ad(), i = 0; i < ad; ++i) {
            this.midiFile.gotoTrack(i);
            this.midiFile.readTrackLength(i);
            this.midiFile.markTrackPosition(i);
        }
        this.track = this.midiFile.trackCount() * 908528068;
        this.trackLength = this.midiFile.trackLengths[this.track * -2130330853] * 1888921809;
        this.field2758 = this.midiFile.method1656(this.trackLength * 2049666181) * -5361838125554816559L;
    }
    
    void ec() {
        int trackCount = this.track * -2130330853;
        int n = this.trackLength * 2049666181;
        long method1656 = this.field2758 * -8691691867109044431L;
        while (this.trackLength * 2049666181 == n) {
            while (this.midiFile.trackLengths[trackCount] == n) {
                this.midiFile.gotoTrack(trackCount);
                final int message = this.midiFile.readMessage(trackCount);
                if (message != 0) {
                    this.midiFile.bb();
                    this.midiFile.markTrackPosition(trackCount);
                    if (!this.midiFile.isDone()) {
                        break;
                    }
                    if (this.field2759 && n != 0) {
                        this.midiFile.reset(method1656);
                        break;
                    }
                    this.method1626(-964267539);
                    MidiFileReader.vw(this.midiFile);
                    return;
                }
                else {
                    if ((message & 0x80) != 0x0) {
                        this.method1628(message, -501765010);
                    }
                    this.midiFile.readTrackLength(trackCount);
                    this.midiFile.markTrackPosition(trackCount);
                }
            }
            trackCount = this.midiFile.trackCount();
            n = this.midiFile.trackLengths[trackCount];
            method1656 = this.midiFile.method1656(n);
        }
        this.track = 911615763 * trackCount;
        this.trackLength = -1172591539 * n;
        this.field2758 = -5361838125554816559L * method1656;
    }
    
    int method1630(final MusicPatchNode musicPatchNode, final int n) {
        try {
            int n2 = (274954637 * musicPatchNode.field2792 * (-1077015879 * musicPatchNode.field2793) >> 12) + -279706293 * musicPatchNode.field2804 + (this.field2736[musicPatchNode.field2801 * 1021419297] * (this.field2742[1021419297 * musicPatchNode.field2801] - 8192) >> 12);
            final MusicPatchNode2 field2786 = musicPatchNode.field2786;
            Label_0264: {
                if (field2786.field2724 * -1668380791 > 0) {
                    if (n <= 1391456291) {
                        throw new IllegalStateException();
                    }
                    if (-1552238757 * field2786.field2723 <= 0) {
                        if (n <= 1391456291) {
                            throw new IllegalStateException();
                        }
                        if (this.field2740[musicPatchNode.field2801 * 1021419297] <= 0) {
                            break Label_0264;
                        }
                        if (n <= 1391456291) {
                            throw new IllegalStateException();
                        }
                    }
                    int n3 = field2786.field2723 * -1552238757 << 2;
                    final int n4 = 391036783 * field2786.field2721 << 1;
                    if (667306259 * musicPatchNode.field2799 < n4) {
                        if (n <= 1391456291) {
                            throw new IllegalStateException();
                        }
                        n3 = n3 * (musicPatchNode.field2799 * 667306259) / n4;
                    }
                    n2 += (int)(Math.sin(0.01227184630308513 * (musicPatchNode.field2791 * -2032101041 & 0x1FF)) * (n3 + (this.field2740[1021419297 * musicPatchNode.field2801] >> 7)));
                }
            }
            final int n5 = (int)(256 * musicPatchNode.rawSound.sampleRate * Math.pow(2.0, 3.255208333333333E-4 * n2) / (PcmPlayer.field201 * -1359271235) + 0.5);
            int n6;
            if (n5 < 1) {
                if (n <= 1391456291) {
                    throw new IllegalStateException();
                }
                n6 = 1;
            }
            else {
                n6 = n5;
            }
            return n6;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bq(" + ')');
        }
    }
    
    void dk(final MusicPatchNode musicPatchNode, final boolean b) {
        final int length = musicPatchNode.rawSound.samples.length;
        int n;
        if (b && musicPatchNode.rawSound.field176) {
            n = (int)(this.field2749[1021419297 * musicPatchNode.field2801] * (long)(length + length - musicPatchNode.rawSound.start) >> 6);
            final int n2 = length << 8;
            if (n >= n2) {
                n = n2 + n2 - 1 - n;
                musicPatchNode.stream.method264(true);
            }
        }
        else {
            n = (int)(this.field2749[musicPatchNode.field2801 * 1021419297] * (long)length >> 6);
        }
        musicPatchNode.stream.method263(n);
    }
    
    void do(final int n, final int n2, final int n3) {
        this.method1621(n, n2, 64, (byte)40);
        if (0x0 != (this.field2746[n] & 0x2)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.first(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.next()) {
                if (n == musicPatchNode.field2801 * 1021419297 && musicPatchNode.field2798 * -602614853 < 0) {
                    this.field2753[n][musicPatchNode.field2788 * -630482265] = null;
                    this.field2753[n][n2] = musicPatchNode;
                    final int n4 = -279706293 * musicPatchNode.field2804 + (-1077015879 * musicPatchNode.field2793 * (musicPatchNode.field2792 * 274954637) >> 12);
                    final MusicPatchNode musicPatchNode2 = musicPatchNode;
                    musicPatchNode2.field2804 += (n2 - musicPatchNode.field2788 * -630482265 << 8) * -1343136669;
                    musicPatchNode.field2792 = (n4 - musicPatchNode.field2804 * -279706293) * -101879483;
                    musicPatchNode.field2793 = 230199296;
                    musicPatchNode.field2788 = n2 * -1339790057;
                    return;
                }
            }
        }
        final MusicPatch patch = (MusicPatch)this.musicPatches.at(this.field2745[n]);
        if (patch == null) {
            return;
        }
        final RawSound rawSound = patch.rawSounds[n2];
        if (null == rawSound) {
            return;
        }
        final MusicPatchNode musicPatchNode3 = new MusicPatchNode();
        musicPatchNode3.field2801 = n * -2055035679;
        musicPatchNode3.patch = patch;
        musicPatchNode3.rawSound = rawSound;
        musicPatchNode3.field2786 = patch.field2775[n2];
        musicPatchNode3.field2784 = -1957781017 * patch.field2776[n2];
        musicPatchNode3.field2788 = -1339790057 * n2;
        musicPatchNode3.field2789 = -284955771 * (1024 + -1979814511 * patch.field2772 * (n3 * n3) * patch.field2773[n2] >> 11);
        musicPatchNode3.field2790 = (patch.field2774[n2] & 0xFF) * -539102003;
        musicPatchNode3.field2804 = ((n2 << 8) - (patch.field2771[n2] & 0x7FFF)) * -1343136669;
        musicPatchNode3.field2794 = 0;
        musicPatchNode3.field2795 = 0;
        musicPatchNode3.field2802 = 0;
        musicPatchNode3.field2798 = -81590643;
        musicPatchNode3.field2783 = 0;
        if (this.field2749[n] == 0) {
            musicPatchNode3.stream = RawPcmStream.method294(rawSound, this.method1630(musicPatchNode3, 1662776351), xf(this, musicPatchNode3, 991080098), tb(this, musicPatchNode3, -914493357));
        }
        else {
            musicPatchNode3.stream = RawPcmStream.method294(rawSound, this.method1630(musicPatchNode3, 1689602258), 0, tb(this, musicPatchNode3, -1899251211));
            this.method1639(musicPatchNode3, patch.field2771[n2] < 0, 2135072701);
        }
        if (patch.field2771[n2] < 0) {
            musicPatchNode3.stream.setNumLoops(-1);
        }
        if (1959190999 * musicPatchNode3.field2784 >= 0) {
            final MusicPatchNode musicPatchNode4 = this.field2733[n][1959190999 * musicPatchNode3.field2784];
            if (null != musicPatchNode4 && musicPatchNode4.field2798 * -602614853 < 0) {
                this.field2753[n][-630482265 * musicPatchNode4.field2788] = null;
                musicPatchNode4.field2798 = 0;
            }
            this.field2733[n][musicPatchNode3.field2784 * 1959190999] = musicPatchNode3;
        }
        this.patchStream.queue.addFirst(musicPatchNode3);
        this.field2753[n][n2] = musicPatchNode3;
    }
    
    void dz(final MusicPatchNode musicPatchNode, final boolean b) {
        final int length = musicPatchNode.rawSound.samples.length;
        int n;
        if (b && musicPatchNode.rawSound.field176) {
            n = (int)(this.field2749[-344917976 * musicPatchNode.field2801] * (long)(length + length - musicPatchNode.rawSound.start) >> 6);
            final int n2 = length << 8;
            if (n >= n2) {
                n = n2 + n2 - 1 - n;
                musicPatchNode.stream.method264(true);
            }
        }
        else {
            n = (int)(this.field2749[musicPatchNode.field2801 * 1021419297] * (long)length >> 6);
        }
        musicPatchNode.stream.method263(n);
    }
    
    void de(final int n, final int n2, final int n3) {
        final MusicPatchNode musicPatchNode = this.field2753[n][n2];
        if (null == musicPatchNode) {
            return;
        }
        this.field2753[n][n2] = null;
        if (0x0 != (this.field2746[n] & 0x2)) {
            for (MusicPatchNode musicPatchNode2 = (MusicPatchNode)this.patchStream.queue.last(); null != musicPatchNode2; musicPatchNode2 = (MusicPatchNode)this.patchStream.queue.previous()) {
                if (1021419297 * musicPatchNode2.field2801 == 1021419297 * musicPatchNode.field2801 && musicPatchNode2.field2798 * -602614853 < 0 && musicPatchNode2 != musicPatchNode) {
                    musicPatchNode.field2798 = 0;
                    break;
                }
            }
        }
        else {
            musicPatchNode.field2798 = 0;
        }
    }
    
    public static void pi(final MidiPcmStream midiPcmStream, final int n) {
        if (0x0 != (midiPcmStream.field2746[n] & 0x4)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.previous()) {
                if (musicPatchNode.field2801 * -651278385 == n) {
                    musicPatchNode.field2803 = 0;
                }
            }
        }
    }
    
    void ed(final int n) {
        final int n2 = n & 0xF0;
        if (128 == n2) {
            this.method1621(n & 0xF, n >> 8 & 0x7F, n >> 16 & 0x7F, (byte)28);
            return;
        }
        if (144 == n2) {
            final int n3 = n & 0xF;
            final int n4 = n >> 8 & 0x7F;
            final int n5 = n >> 16 & 0x7F;
            if (n5 > 0) {
                this.method1620(n3, n4, n5, -49500482);
            }
            else {
                this.method1621(n3, n4, 64, (byte)72);
            }
            return;
        }
        if (160 == n2) {
            this.method1622(n & 0xF, n >> 8 & 0x7F, n >> 16 & 0x7F, -1037328378);
            return;
        }
        if (176 == n2) {
            final int n6 = n & 0xF;
            final int n7 = n >> 8 & 0x7F;
            final int n8 = n >> 16 & 0x7F;
            if (n7 == 0) {
                this.field2741[n6] = (n8 << 14) + (this.field2741[n6] & 0xFFE03FFF);
            }
            if (n7 == 32) {
                this.field2741[n6] = (this.field2741[n6] & 0xFFFFC07F) + (n8 << 7);
            }
            if (n7 == 1) {
                this.field2740[n6] = (this.field2740[n6] & 0xFFFFC07F) + (n8 << 7);
            }
            if (33 == n7) {
                this.field2740[n6] = (this.field2740[n6] & 0xFFFFFF80) + n8;
            }
            if (5 == n7) {
                this.field2760[n6] = (this.field2760[n6] & 0xFFFFC07F) + (n8 << 7);
            }
            if (37 == n7) {
                this.field2760[n6] = (this.field2760[n6] & 0xFFFFFF80) + n8;
            }
            if (7 == n7) {
                this.field2744[n6] = (this.field2744[n6] & 0xFFFFC07F) + (n8 << 7);
            }
            if (39 == n7) {
                this.field2744[n6] = n8 + (this.field2744[n6] & 0xFFFFFF80);
            }
            if (10 == n7) {
                this.field2752[n6] = (this.field2752[n6] & 0xFFFFC07F) + (n8 << 7);
            }
            if (42 == n7) {
                this.field2752[n6] = n8 + (this.field2752[n6] & 0xFFFFFF80);
            }
            if (11 == n7) {
                this.field2738[n6] = (this.field2738[n6] & 0xFFFFC07F) + (n8 << 7);
            }
            if (43 == n7) {
                this.field2738[n6] = n8 + (this.field2738[n6] & 0xFFFFFF80);
            }
            if (n7 == 64) {
                if (n8 >= 64) {
                    final int[] field2746 = this.field2746;
                    final int n9 = n6;
                    field2746[n9] |= 0x1;
                }
                else {
                    final int[] field2747 = this.field2746;
                    final int n10 = n6;
                    field2747[n10] &= 0xFFFFFFFE;
                }
            }
            if (65 == n7) {
                if (n8 >= 64) {
                    final int[] field2748 = this.field2746;
                    final int n11 = n6;
                    field2748[n11] |= 0x2;
                }
                else {
                    this.method1640(n6, (byte)(-74));
                    final int[] field2749 = this.field2746;
                    final int n12 = n6;
                    field2749[n12] &= 0xFFFFFFFD;
                }
            }
            if (n7 == 99) {
                this.field2747[n6] = (n8 << 7) + (this.field2747[n6] & 0x7F);
            }
            if (n7 == 98) {
                this.field2747[n6] = n8 + (this.field2747[n6] & 0x3F80);
            }
            if (n7 == 101) {
                this.field2747[n6] = (this.field2747[n6] & 0x7F) + 16384 + (n8 << 7);
            }
            if (n7 == 100) {
                this.field2747[n6] = n8 + (16384 + (this.field2747[n6] & 0x3F80));
            }
            if (120 == n7) {
                this.method1624(n6, -233409085);
            }
            if (121 == n7) {
                this.method1625(n6, -1086942931);
            }
            if (n7 == 123) {
                this.method1612(n6, -1578098207);
            }
            if (n7 == 6 && 16384 == this.field2747[n6]) {
                this.field2736[n6] = (this.field2736[n6] & 0xFFFFC07F) + (n8 << 7);
            }
            if (38 == n7 && 16384 == this.field2747[n6]) {
                this.field2736[n6] = n8 + (this.field2736[n6] & 0xFFFFFF80);
            }
            if (n7 == 16) {
                this.field2749[n6] = (this.field2749[n6] & 0xFFFFC07F) + (n8 << 7);
            }
            if (n7 == 48) {
                this.field2749[n6] = n8 + (this.field2749[n6] & 0xFFFFFF80);
            }
            if (81 == n7) {
                if (n8 >= 64) {
                    final int[] field2750 = this.field2746;
                    final int n13 = n6;
                    field2750[n13] |= 0x4;
                }
                else {
                    this.method1627(n6, -427369850);
                    final int[] field2751 = this.field2746;
                    final int n14 = n6;
                    field2751[n14] &= 0xFFFFFFFB;
                }
            }
            if (17 == n7) {
                this.method1629(n6, (this.field2750[n6] & 0xFFFFC07F) + (n8 << 7), -1731550836);
            }
            if (49 == n7) {
                this.method1629(n6, (this.field2750[n6] & 0xFFFFFF80) + n8, -1731550836);
            }
            return;
        }
        if (192 == n2) {
            final int n15 = n & 0xF;
            this.method1641(n15, (n >> 8 & 0x7F) + this.field2741[n15], 1935841777);
            return;
        }
        if (n2 == 208) {
            zq(this, n & 0xF, n >> 8 & 0x7F, 1736841186);
            return;
        }
        if (224 == n2) {
            ts(this, n & 0xF, (n >> 8 & 0x7F) + (n >> 9 & 0x3F80), 1611025845);
            return;
        }
        if (0xFF == (n & 0xFF)) {
            this.method1626(-964267539);
        }
    }
    
    void ea() {
        this.method1624(-1, -1082248272);
        this.method1625(-1, 1435817543);
        for (int i = 0; i < 16; ++i) {
            this.field2745[i] = this.field2739[i];
        }
        for (int j = 0; j < 16; ++j) {
            this.field2741[j] = (this.field2739[j] & 0xFFFFFF80);
        }
    }
    
    public synchronized void removeAll(final int n) {
        this.field2757 = 1099002506 * n;
    }
    
    public synchronized void setMusicTrack(final MusicTrack musicTrack, final boolean field2759, final int n) {
        try {
            this.clear((byte)(-110));
            MidiFileReader.lm(this.midiFile, musicTrack.midi);
            this.field2759 = field2759;
            this.field2737 = 0L;
            for (int ad = this.midiFile.ad(), i = 0; i < ad; ++i) {
                this.midiFile.gotoTrack(i);
                this.midiFile.readTrackLength(i);
                this.midiFile.markTrackPosition(i);
            }
            this.track = this.midiFile.trackCount() * 911615763;
            this.trackLength = this.midiFile.trackLengths[this.track * -2130330853] * -1172591539;
            this.field2758 = this.midiFile.method1656(this.trackLength * 2049666181) * -5361838125554816559L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.aa(" + ')');
        }
    }
    
    public synchronized void method1618(final int n, final int n2, final byte b) {
        try {
            this.method1619(n, n2, (byte)(-22));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ai(" + ')');
        }
    }
    
    void dx(final int n, final int n2) {
        this.field2742[n] = n2;
    }
    
    public static void gi(final MidiPcmStream midiPcmStream, final int n, final int n2) {
        midiPcmStream.field2739[n] = n2;
        midiPcmStream.field2741[n] = (n2 & 0x7CE82F7C);
        midiPcmStream.method1641(n, n2, 2111089971);
    }
    
    boolean method1638(final MusicPatchNode musicPatchNode, final int[] array, final int n, final int n2, final int n3) {
        try {
            musicPatchNode.field2796 = 652897503 * (PcmPlayer.field201 * -1359271235 / 100);
            Label_0200: {
                if (-602614853 * musicPatchNode.field2798 >= 0) {
                    if (n3 == -1837375516) {
                        throw new IllegalStateException();
                    }
                    if (musicPatchNode.stream != null) {
                        if (n3 == -1837375516) {
                            throw new IllegalStateException();
                        }
                        if (!musicPatchNode.stream.ep()) {
                            break Label_0200;
                        }
                        if (n3 == -1837375516) {
                            throw new IllegalStateException();
                        }
                    }
                    MusicPatchNode.bk(musicPatchNode, (byte)(-61));
                    musicPatchNode.hw();
                    if (1959190999 * musicPatchNode.field2784 > 0) {
                        if (n3 == -1837375516) {
                            throw new IllegalStateException();
                        }
                        if (musicPatchNode == this.field2733[musicPatchNode.field2801 * 1021419297][musicPatchNode.field2784 * 1959190999]) {
                            this.field2733[1021419297 * musicPatchNode.field2801][musicPatchNode.field2784 * 1959190999] = null;
                        }
                    }
                    return true;
                }
            }
            final int n4 = musicPatchNode.field2793 * -1077015879;
            if (n4 > 0) {
                if (n3 == -1837375516) {
                    throw new IllegalStateException();
                }
                int n5 = n4 - (int)(16.0 * Math.pow(2.0, this.field2760[1021419297 * musicPatchNode.field2801] * 4.921259842519685E-4) + 0.5);
                if (n5 < 0) {
                    n5 = 0;
                }
                musicPatchNode.field2793 = n5 * -871310455;
            }
            musicPatchNode.stream.method269(this.method1630(musicPatchNode, 1667221549));
            final MusicPatchNode2 field2786 = musicPatchNode.field2786;
            boolean b = false;
            musicPatchNode.field2799 -= 1164121829;
            musicPatchNode.field2791 += 100789159 * field2786.field2724;
            final double n6 = 5.086263020833333E-6 * ((274954637 * musicPatchNode.field2792 * (musicPatchNode.field2793 * -1077015879) >> 12) + (-630482265 * musicPatchNode.field2788 - 60 << 8));
            if (354539497 * field2786.field2719 > 0) {
                if (n3 == -1837375516) {
                    throw new IllegalStateException();
                }
                if (field2786.field2722 * 821482501 > 0) {
                    if (n3 == -1837375516) {
                        throw new IllegalStateException();
                    }
                    musicPatchNode.field2794 += (int)(128.0 * Math.pow(2.0, 821482501 * field2786.field2722 * n6) + 0.5) * 349596629;
                }
                else {
                    musicPatchNode.field2794 += 1798695552;
                }
            }
            if (null != field2786.field2718) {
                if (field2786.field2720 * -32542335 > 0) {
                    if (n3 == -1837375516) {
                        throw new IllegalStateException();
                    }
                    musicPatchNode.field2795 += (int)(128.0 * Math.pow(2.0, -32542335 * field2786.field2720 * n6) + 0.5) * -257124661;
                }
                else {
                    musicPatchNode.field2795 += 1447781760;
                }
                while (891662681 * musicPatchNode.field2802 < field2786.field2718.length - 2) {
                    if (n3 == -1837375516) {
                        throw new IllegalStateException();
                    }
                    if (musicPatchNode.field2795 * 873438947 <= (field2786.field2718[musicPatchNode.field2802 * 891662681 + 2] & 0xFF) << 8) {
                        break;
                    }
                    if (n3 == -1837375516) {
                        throw new IllegalStateException();
                    }
                    musicPatchNode.field2802 -= 934605358;
                }
                if (musicPatchNode.field2802 * 891662681 == field2786.field2718.length - 2) {
                    if (n3 == -1837375516) {
                        throw new IllegalStateException();
                    }
                    if (0 == field2786.field2718[1 + 891662681 * musicPatchNode.field2802]) {
                        if (n3 == -1837375516) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                }
            }
            Label_1072: {
                if (musicPatchNode.field2798 * -602614853 >= 0) {
                    if (n3 == -1837375516) {
                        throw new IllegalStateException();
                    }
                    if (field2786.field2717 != null) {
                        if (n3 == -1837375516) {
                            throw new IllegalStateException();
                        }
                        if (0x0 == (this.field2746[1021419297 * musicPatchNode.field2801] & 0x1)) {
                            if (n3 == -1837375516) {
                                throw new IllegalStateException();
                            }
                            if (musicPatchNode.field2784 * 1959190999 >= 0) {
                                if (n3 == -1837375516) {
                                    throw new IllegalStateException();
                                }
                                if (musicPatchNode == this.field2733[musicPatchNode.field2801 * 1021419297][musicPatchNode.field2784 * 1959190999]) {
                                    break Label_1072;
                                }
                                if (n3 == -1837375516) {
                                    throw new IllegalStateException();
                                }
                            }
                            if (-574961187 * field2786.field2725 > 0) {
                                musicPatchNode.field2798 += (int)(128.0 * Math.pow(2.0, field2786.field2725 * -574961187 * n6) + 0.5) * 81590643;
                            }
                            else {
                                musicPatchNode.field2798 += 1853667712;
                            }
                            while (musicPatchNode.field2783 * -371546193 < field2786.field2717.length - 2 && -602614853 * musicPatchNode.field2798 > (field2786.field2717[2 + -371546193 * musicPatchNode.field2783] & 0xFF) << 8) {
                                if (n3 == -1837375516) {
                                    throw new IllegalStateException();
                                }
                                musicPatchNode.field2783 += 2121932446;
                            }
                            if (field2786.field2717.length - 2 == musicPatchNode.field2783 * -371546193) {
                                if (n3 == -1837375516) {
                                    throw new IllegalStateException();
                                }
                                b = true;
                            }
                        }
                    }
                }
            }
            if (!b) {
                musicPatchNode.stream.method267(musicPatchNode.field2796 * -1971564769, xf(this, musicPatchNode, -606314672), tb(this, musicPatchNode, -941309509));
                return false;
            }
            if (n3 == -1837375516) {
                throw new IllegalStateException();
            }
            musicPatchNode.stream.method268(-1971564769 * musicPatchNode.field2796);
            if (null != array) {
                if (n3 == -1837375516) {
                    throw new IllegalStateException();
                }
                musicPatchNode.stream.fill(array, n, n2);
            }
            else {
                musicPatchNode.stream.skip(n2);
            }
            if (musicPatchNode.stream.eo()) {
                if (n3 == -1837375516) {
                    throw new IllegalStateException();
                }
                this.patchStream.mixer.addSubStream(musicPatchNode.stream);
            }
            MusicPatchNode.bk(musicPatchNode, (byte)(-108));
            if (musicPatchNode.field2798 * -602614853 >= 0) {
                if (n3 == -1837375516) {
                    throw new IllegalStateException();
                }
                musicPatchNode.hw();
                if (1959190999 * musicPatchNode.field2784 > 0) {
                    if (n3 == -1837375516) {
                        throw new IllegalStateException();
                    }
                    if (this.field2733[1021419297 * musicPatchNode.field2801][1959190999 * musicPatchNode.field2784] == musicPatchNode) {
                        this.field2733[1021419297 * musicPatchNode.field2801][musicPatchNode.field2784 * 1959190999] = null;
                    }
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bh(" + ')');
        }
    }
    
    public static void vk(final MidiPcmStream midiPcmStream, int i) {
        if (midiPcmStream == null) {
            midiPcmStream.nextSubStream();
        }
        if (i < 0) {
            for (i = 0; i < 16; ++i) {
                midiPcmStream.method1625(i, 452647106);
            }
            return;
        }
        midiPcmStream.field2744[i] = 12800;
        midiPcmStream.field2752[i] = 8192;
        midiPcmStream.field2738[i] = 16383;
        midiPcmStream.field2742[i] = 8192;
        midiPcmStream.field2740[i] = 0;
        midiPcmStream.field2760[i] = 8192;
        midiPcmStream.method1640(i, (byte)(-125));
        midiPcmStream.method1627(i, -295029725);
        midiPcmStream.field2746[i] = 0;
        midiPcmStream.field2747[i] = 32767;
        midiPcmStream.field2736[i] = 256;
        midiPcmStream.field2749[i] = 0;
        midiPcmStream.method1629(i, 8192, -1731550836);
    }
    
    void method1640(final int n, final byte b) {
        try {
            if (0x0 != (this.field2746[n] & 0x2)) {
                if (b >= 1) {
                    return;
                }
                for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                    if (1021419297 * musicPatchNode.field2801 == n) {
                        if (b >= 1) {
                            throw new IllegalStateException();
                        }
                        if (this.field2753[n][musicPatchNode.field2788 * -630482265] == null) {
                            if (b >= 1) {
                                throw new IllegalStateException();
                            }
                            if (-602614853 * musicPatchNode.field2798 < 0) {
                                if (b >= 1) {
                                    throw new IllegalStateException();
                                }
                                musicPatchNode.field2798 = 0;
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.by(" + ')');
        }
    }
    
    @Override
    protected synchronized PcmStream bx() {
        return null;
    }
    
    void method1639(final MusicPatchNode musicPatchNode, final boolean b, final int n) {
        try {
            final int length = musicPatchNode.rawSound.samples.length;
            int n2 = 0;
            Label_0171: {
                if (b) {
                    if (n <= 2126274284) {
                        throw new IllegalStateException();
                    }
                    if (musicPatchNode.rawSound.field176) {
                        if (n <= 2126274284) {
                            return;
                        }
                        n2 = (int)(this.field2749[1021419297 * musicPatchNode.field2801] * (long)(length + length - musicPatchNode.rawSound.start) >> 6);
                        final int n3 = length << 8;
                        if (n2 >= n3) {
                            if (n <= 2126274284) {
                                return;
                            }
                            n2 = n3 + n3 - 1 - n2;
                            musicPatchNode.stream.method264(true);
                        }
                        break Label_0171;
                    }
                }
                n2 = (int)(this.field2749[musicPatchNode.field2801 * 1021419297] * (long)length >> 6);
            }
            musicPatchNode.stream.method263(n2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ar(" + ')');
        }
    }
    
    void method1626(final int n) {
        try {
            this.method1624(-1, 1037039964);
            this.method1625(-1, 1613137555);
            for (int i = 0; i < 16; ++i) {
                if (n != -964267539) {
                    return;
                }
                this.field2745[i] = this.field2739[i];
            }
            for (int j = 0; j < 16; ++j) {
                if (n != -964267539) {
                    throw new IllegalStateException();
                }
                this.field2741[j] = (this.field2739[j] & 0xFFFFFF80);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ap(" + ')');
        }
    }
    
    public static boolean method1626(final MidiPcmStream midiPcmStream, final MusicPatchNode musicPatchNode) {
        if (midiPcmStream == null) {
            midiPcmStream.eh(musicPatchNode);
        }
        if (musicPatchNode.stream == null) {
            if (musicPatchNode.field2798 * -602614853 >= 0) {
                musicPatchNode.hw();
                if (-724197343 * musicPatchNode.field2784 > 0 && midiPcmStream.field2733[musicPatchNode.field2801 * 1021419297][musicPatchNode.field2784 * -793617907] == musicPatchNode) {
                    midiPcmStream.field2733[musicPatchNode.field2801 * 1021419297][1959190999 * musicPatchNode.field2784] = null;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    protected synchronized void bd(final int[] array, int n, int n2) {
        if (this.midiFile.isReady()) {
            final int n3 = this.midiFile.division * (this.field2735 * 437930689) / (-1938748707 * PcmPlayer.field201);
            do {
                final long n4 = n2 * (long)n3 + this.field2737 * 8370013022464380265L;
                if (this.field2758 * -8691691867109044431L - n4 >= 0L) {
                    this.field2737 = n4 * 389160967981716185L;
                    break;
                }
                final int n5 = (int)((-8691691867109044431L * this.field2758 - 8370013022464380265L * this.field2737 + n3 - 1L) / n3);
                this.field2737 += n3 * (long)n5 * 389160967981716185L;
                this.patchStream.fill(array, n, n5);
                n += n5;
                n2 -= n5;
                dj(this, 486029060);
            } while (this.midiFile.isReady());
        }
        this.patchStream.fill(array, n, n2);
    }
    
    public synchronized void cm() {
        for (MusicPatch musicPatch = (MusicPatch)this.musicPatches.first(); null != musicPatch; musicPatch = (MusicPatch)this.musicPatches.next()) {
            musicPatch.hw();
        }
    }
    
    @Override
    protected synchronized void bg(int n) {
        Label_0181: {
            if (this.midiFile.isReady()) {
                final int n2 = this.midiFile.division * (437930689 * this.field2735) / (-1359271235 * PcmPlayer.field201);
                long n3 = 0L;
                Label_0163: {
                    break Label_0163;
                    do {
                        final int n4 = (int)((this.field2758 * -8691691867109044431L - 8370013022464380265L * this.field2737 + n2 - 1L) / n2);
                        this.field2737 += n4 * (long)n2 * 389160967981716185L;
                        this.patchStream.skip(n4);
                        n -= n4;
                        dj(this, 486029060);
                        if (!this.midiFile.isReady()) {
                            break Label_0181;
                        }
                        n3 = 8370013022464380265L * this.field2737 + n2 * (long)n;
                    } while (-8691691867109044431L * this.field2758 - n3 < 0L);
                }
                this.field2737 = 389160967981716185L * n3;
            }
        }
        this.patchStream.skip(n);
    }
    
    public synchronized void co() {
        MidiFileReader.vw(this.midiFile);
        this.method1626(-964267539);
    }
    
    void eu(final int n) {
        if (0x0 != (this.field2746[n] & 0x2)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
                if (1021419297 * musicPatchNode.field2801 == n && this.field2753[n][musicPatchNode.field2788 * -630482265] == null && -602614853 * musicPatchNode.field2798 < 0) {
                    musicPatchNode.field2798 = 0;
                }
            }
        }
    }
    
    public synchronized void setPcmStreamVolume(final int n, final byte b) {
        try {
            this.field2757 = 1881678515 * n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.af(" + ')');
        }
    }
    
    public static void setPcmStreamVolume(final AbstractArchive enumDefinition_archive, final int n) {
        try {
            EnumComposition.EnumDefinition_archive = enumDefinition_archive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.af(" + ')');
        }
    }
    
    void method1627(final int n, final int n2) {
        try {
            if (0x0 != (this.field2746[n] & 0x4)) {
                if (n2 >= 98808232) {
                    throw new IllegalStateException();
                }
                for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
                    if (n2 >= 98808232) {
                        throw new IllegalStateException();
                    }
                    if (musicPatchNode.field2801 * 1021419297 == n) {
                        if (n2 >= 98808232) {
                            return;
                        }
                        musicPatchNode.field2803 = 0;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bn(" + ')');
        }
    }
    
    public synchronized void cz() {
        MidiFileReader.vw(this.midiFile);
        this.method1626(-964267539);
    }
    
    public static void firstSubStream(final MidiPcmStream midiPcmStream, final MusicPatchNode musicPatchNode, final boolean b) {
        if (midiPcmStream == null) {
            midiPcmStream.dz(musicPatchNode, b);
        }
        final int length = musicPatchNode.rawSound.samples.length;
        int n;
        if (b && musicPatchNode.rawSound.field176) {
            n = (int)(midiPcmStream.field2749[1670915322 * musicPatchNode.field2801] * (long)(length + length - musicPatchNode.rawSound.start) >> 6);
            final int n2 = length << 8;
            if (n >= n2) {
                n = n2 + n2 - 1 - n;
                musicPatchNode.stream.method264(true);
            }
        }
        else {
            n = (int)(midiPcmStream.field2749[musicPatchNode.field2801 * 1021419297] * (long)length >> 6);
        }
        musicPatchNode.stream.method263(n);
    }
    
    @Override
    protected synchronized PcmStream firstSubStream() {
        try {
            return this.patchStream;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ab(" + ')');
        }
    }
    
    @Override
    protected synchronized PcmStream nextSubStream() {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.aq(" + ')');
        }
    }
    
    void method1642(final int n, final int n2, final int n3) {
        final MusicPatchNode musicPatchNode = this.field2733[n][n2];
        if (null == musicPatchNode) {
            return;
        }
        this.field2753[n][n2] = null;
        if (0x0 != (this.field2736[n] & 0x2)) {
            for (MusicPatchNode musicPatchNode2 = (MusicPatchNode)this.patchStream.queue.as(); null != musicPatchNode2; musicPatchNode2 = (MusicPatchNode)this.patchStream.queue.uk()) {
                if (1021419297 * musicPatchNode2.field2801 == 1021419297 * musicPatchNode.field2804 && musicPatchNode2.field2792 * -602614853 < 0 && musicPatchNode2 != musicPatchNode) {
                    musicPatchNode.field2801 = 0;
                    break;
                }
            }
        }
        else {
            musicPatchNode.field2802 = 0;
        }
    }
    
    public static int method1619(final MidiPcmStream midiPcmStream, final MusicPatchNode musicPatchNode) {
        if (midiPcmStream == null) {
            midiPcmStream.em(musicPatchNode);
        }
        int n = (274954637 * musicPatchNode.field2792 * (-1077015879 * musicPatchNode.field2793) >> 12) + -279706293 * musicPatchNode.field2804 + (midiPcmStream.field2736[musicPatchNode.field2801 * 1021419297] * (midiPcmStream.field2742[1021419297 * musicPatchNode.field2801] - 8192) >> 12);
        final MusicPatchNode2 field2786 = musicPatchNode.field2786;
        if (field2786.field2724 * -1668380791 > 0 && (-1552238757 * field2786.field2723 > 0 || midiPcmStream.field2740[musicPatchNode.field2801 * 1021419297] > 0)) {
            int n2 = field2786.field2723 * -1552238757 << 2;
            final int n3 = 391036783 * field2786.field2721 << 1;
            if (667306259 * musicPatchNode.field2799 < n3) {
                n2 = n2 * (musicPatchNode.field2799 * 667306259) / n3;
            }
            n += (int)(Math.sin(0.01227184630308513 * (musicPatchNode.field2791 * -2032101041 & 0x1FF)) * (n2 + (midiPcmStream.field2740[1021419297 * musicPatchNode.field2801] >> 7)));
        }
        final int n4 = (int)(256 * musicPatchNode.rawSound.sampleRate * Math.pow(2.0, 3.255208333333333E-4 * n) / (PcmPlayer.field201 * -1359271235) + 0.5);
        return (n4 < 1) ? 1 : n4;
    }
    
    void method1619(final int n, final int n2, final byte b) {
        try {
            this.field2739[n] = n2;
            this.field2741[n] = (n2 & 0xFFFFFF80);
            this.method1641(n, n2, 1627005536);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ag(" + ')');
        }
    }
    
    int method1632(final MusicPatchNode musicPatchNode, final int n) {
        try {
            final int n2 = this.field2740[musicPatchNode.field2798 * 1021419297];
            if (n2 >= 8192) {
                return 16384 - ((16384 - n2) * (128 - musicPatchNode.field2795 * 1083381765) + 32 >> 6);
            }
            if (n == 522688965) {
                throw new IllegalStateException();
            }
            return 32 + n2 * (musicPatchNode.field2802 * 1083381765) >> 6;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bl(" + ')');
        }
    }
    
    @Override
    protected synchronized int bz() {
        try {
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.al(" + ')');
        }
    }
    
    void eg(final int n) {
        if (0x0 != (this.field2746[n] & 0x4)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
                if (musicPatchNode.field2801 * 1021419297 == n) {
                    musicPatchNode.field2803 = 0;
                }
            }
        }
    }
    
    int ew(final MusicPatchNode musicPatchNode) {
        final MusicPatchNode2 field2786 = musicPatchNode.field2786;
        final int n = this.field2744[1021419297 * musicPatchNode.field2801] * this.field2738[-1361194661 * musicPatchNode.field2801] + 164079214 >> 13;
        int n2 = 128 + -965919098 * this.field2757 * (musicPatchNode.field2789 * -254585523 * (n * n + 1991680641 >> 15) + 16384 >> 15) >> 8;
        if (354539497 * field2786.field2719 > 0) {
            n2 = (int)(n2 * Math.pow(0.5, field2786.field2719 * 1138111851 * (musicPatchNode.field2794 * -814647939 * 1.953125E-5)) + 0.5);
        }
        if (null != field2786.field2718) {
            final int n3 = 584474482 * musicPatchNode.field2795;
            int n4 = field2786.field2718[1 + musicPatchNode.field2802 * 2119214866];
            if (554937197 * musicPatchNode.field2802 < field2786.field2718.length - 2) {
                final int n5 = (field2786.field2718[musicPatchNode.field2802 * -1691261767] & 0xD670A7E1) << 8;
                n4 += (field2786.field2718[3 + -1738039833 * musicPatchNode.field2802] - n4) * (n3 - n5) / (((field2786.field2718[891662681 * musicPatchNode.field2802 + 2] & 0xFF) << 8) - n5);
            }
            n2 = n2 * n4 - 450816130 >> 6;
        }
        if (-602614853 * musicPatchNode.field2798 > 0 && field2786.field2717 != null) {
            final int n6 = -602614853 * musicPatchNode.field2798;
            int n7 = field2786.field2717[1 + 389266638 * musicPatchNode.field2783];
            if (musicPatchNode.field2783 * -801563177 < field2786.field2717.length - 2) {
                final int n8 = (field2786.field2717[musicPatchNode.field2783 * 752707071] & 0xFF) << 8;
                n7 += (field2786.field2717[musicPatchNode.field2783 * 1648162759 + 3] - n7) * (n6 - n8) / (((field2786.field2717[musicPatchNode.field2783 * -39374307 + 2] & 0x56A41C0) << 8) - n8);
            }
            n2 = n7 * n2 - 2062348854 >> 6;
        }
        return n2;
    }
    
    @Override
    protected synchronized void bj(final int[] array, int n, int n2) {
        if (this.midiFile.isReady()) {
            final int n3 = this.midiFile.division * (this.field2735 * 437930689) / (885818897 * PcmPlayer.field201);
            do {
                final long n4 = n2 * (long)n3 + this.field2737 * 8370013022464380265L;
                if (this.field2758 * -8691691867109044431L - n4 >= 0L) {
                    this.field2737 = n4 * 389160967981716185L;
                    break;
                }
                final int n5 = (int)((-8691691867109044431L * this.field2758 - 8370013022464380265L * this.field2737 + n3 - 1L) / n3);
                this.field2737 += n3 * (long)n5 * 389160967981716185L;
                this.patchStream.fill(array, n, n5);
                n += n5;
                n2 -= n5;
                dj(this, 486029060);
            } while (this.midiFile.isReady());
        }
        this.patchStream.fill(array, n, n2);
    }
    
    void dj(final int n, final int n2) {
    }
    
    public static void dj(final MidiPcmStream midiPcmStream, final int n) {
        if (midiPcmStream == null) {
            midiPcmStream.method1637(n);
        }
        try {
            int trackCount = midiPcmStream.track * -2130330853;
            int n2 = midiPcmStream.trackLength * 2049666181;
            long method1656 = midiPcmStream.field2758 * -8691691867109044431L;
            while (midiPcmStream.trackLength * 2049666181 == n2) {
                if (n != 486029060) {
                    throw new IllegalStateException();
                }
                while (midiPcmStream.midiFile.trackLengths[trackCount] == n2) {
                    if (n != 486029060) {
                        return;
                    }
                    midiPcmStream.midiFile.gotoTrack(trackCount);
                    final int message = midiPcmStream.midiFile.readMessage(trackCount);
                    if (message != 0) {
                        if (n != 486029060) {
                            return;
                        }
                        midiPcmStream.midiFile.bb();
                        midiPcmStream.midiFile.markTrackPosition(trackCount);
                        if (!midiPcmStream.midiFile.isDone()) {
                            break;
                        }
                        if (!midiPcmStream.field2759 || n2 == 0) {
                            midiPcmStream.method1626(-964267539);
                            MidiFileReader.vw(midiPcmStream.midiFile);
                            return;
                        }
                        if (n != 486029060) {
                            throw new IllegalStateException();
                        }
                        midiPcmStream.midiFile.reset(method1656);
                        break;
                    }
                    else {
                        if ((message & 0x80) != 0x0) {
                            midiPcmStream.method1628(message, -1376449037);
                        }
                        midiPcmStream.midiFile.readTrackLength(trackCount);
                        midiPcmStream.midiFile.markTrackPosition(trackCount);
                    }
                }
                trackCount = midiPcmStream.midiFile.trackCount();
                n2 = midiPcmStream.midiFile.trackLengths[trackCount];
                method1656 = midiPcmStream.midiFile.method1656(n2);
            }
            midiPcmStream.track = 911615763 * trackCount;
            midiPcmStream.trackLength = -1172591539 * n2;
            midiPcmStream.field2758 = -5361838125554816559L * method1656;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bp(" + ')');
        }
    }
    
    public static void vw(final Canvas canvas, final Graphics g) {
        canvas.component.paint(g);
    }
    
    public static void zq(final MidiPcmStream midiPcmStream, final int n, final int n2, final int n3) {
        if (midiPcmStream == null) {
            midiPcmStream.method1642(n, n, n);
            return;
        }
    }
    
    public static void xt(final class235 class235, final int[] array, final int[] array2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, final int n11, final int n12, final int n13) {
        if (class235 == null) {
            class235.method1351(array, array, n, n, n, n, n, n, n, n, n, n, n, n, n);
        }
        if (class235.al.field2234) {
            if (n5 > class235.al.field2233 * 571147771) {
                n5 = class235.al.field2233 * 571147771;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= n5) {
            return;
        }
        n3 += n4;
        n6 += n7 * n4;
        final int n14 = n5 - n4;
        if (class235.an) {
            final int n15 = n4 - class235.al.field2231 * 93675259;
            n8 += (n11 >> 3) * n15;
            n9 += (n12 >> 3) * n15;
            n10 += (n13 >> 3) * n15;
            final int n16 = n10 >> 12;
            int n17;
            int n18;
            if (n16 != 0) {
                n17 = n8 / n16;
                n18 = n9 / n16;
                if (n17 < 0) {
                    n17 = 0;
                }
                else if (n17 > 4032) {
                    n17 = 4032;
                }
            }
            else {
                n17 = 0;
                n18 = 0;
            }
            n8 += n11;
            n9 += n12;
            n10 += n13;
            final int n19 = n10 >> 12;
            int n20;
            int n21;
            if (n19 != 0) {
                n20 = n8 / n19;
                n21 = n9 / n19;
                if (n20 < 0) {
                    n20 = 0;
                }
                else if (n20 > 4032) {
                    n20 = 4032;
                }
            }
            else {
                n20 = 0;
                n21 = 0;
            }
            n = (n17 << 20) + n18;
            int n22 = (n20 - n17 >> 3 << 20) + (n21 - n18 >> 3);
            int n23 = n14 >> 3;
            n7 <<= 3;
            int n24 = n6 >> 8;
            if (class235.af) {
                if (n23 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                        final int n25 = n20;
                        final int n26 = n21;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n27 = n10 >> 12;
                        if (n27 != 0) {
                            n20 = n8 / n27;
                            n21 = n9 / n27;
                            if (n20 < 0) {
                                n20 = 0;
                            }
                            else if (n20 > 4032) {
                                n20 = 4032;
                            }
                        }
                        else {
                            n20 = 0;
                            n21 = 0;
                        }
                        n = (n25 << 20) + n26;
                        n22 = (n20 - n25 >> 3 << 20) + (n21 - n26 >> 3);
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n28 = n5 - n4 & 0x7;
                if (n28 > 0) {
                    do {
                        n2 = array2[(n & 0xFC0) + (n >>> 26)];
                        array[n3++] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n22;
                    } while (--n28 > 0);
                }
            }
            else {
                if (n23 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                        final int n29 = n20;
                        final int n30 = n21;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n31 = n10 >> 12;
                        if (n31 != 0) {
                            n20 = n8 / n31;
                            n21 = n9 / n31;
                            if (n20 < 0) {
                                n20 = 0;
                            }
                            else if (n20 > 4032) {
                                n20 = 4032;
                            }
                        }
                        else {
                            n20 = 0;
                            n21 = 0;
                        }
                        n = (n29 << 20) + n30;
                        n22 = (n20 - n29 >> 3 << 20) + (n21 - n30 >> 3);
                        n6 += n7;
                        n24 = n6 >> 8;
                    } while (--n23 > 0);
                }
                int n32 = n5 - n4 & 0x7;
                if (n32 > 0) {
                    do {
                        if ((n2 = array2[(n & 0xFC0) + (n >>> 26)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n24 & 0xFF00FF00) + ((n2 & 0xFF00) * n24 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n22;
                    } while (--n32 > 0);
                }
            }
        }
        else {
            final int n33 = n4 - class235.al.field2231 * 93675259;
            n8 += (n11 >> 3) * n33;
            n9 += (n12 >> 3) * n33;
            n10 += (n13 >> 3) * n33;
            final int n34 = n10 >> 14;
            int n35;
            int n36;
            if (n34 != 0) {
                n35 = n8 / n34;
                n36 = n9 / n34;
                if (n35 < 0) {
                    n35 = 0;
                }
                else if (n35 > 16256) {
                    n35 = 16256;
                }
            }
            else {
                n35 = 0;
                n36 = 0;
            }
            n8 += n11;
            n9 += n12;
            n10 += n13;
            final int n37 = n10 >> 14;
            int n38;
            int n39;
            if (n37 != 0) {
                n38 = n8 / n37;
                n39 = n9 / n37;
                if (n38 < 0) {
                    n38 = 0;
                }
                else if (n38 > 16256) {
                    n38 = 16256;
                }
            }
            else {
                n38 = 0;
                n39 = 0;
            }
            n = (n35 << 18) + n36;
            int n40 = (n38 - n35 >> 3 << 18) + (n39 - n36 >> 3);
            int n41 = n14 >> 3;
            n7 <<= 3;
            int n42 = n6 >> 8;
            if (class235.af) {
                if (n41 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n40;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n40;
                        final int n43 = n38;
                        final int n44 = n39;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n45 = n10 >> 14;
                        if (n45 != 0) {
                            n38 = n8 / n45;
                            n39 = n9 / n45;
                            if (n38 < 0) {
                                n38 = 0;
                            }
                            else if (n38 > 16256) {
                                n38 = 16256;
                            }
                        }
                        else {
                            n38 = 0;
                            n39 = 0;
                        }
                        n = (n43 << 18) + n44;
                        n40 = (n38 - n43 >> 3 << 18) + (n39 - n44 >> 3);
                        n6 += n7;
                        n42 = n6 >> 8;
                    } while (--n41 > 0);
                }
                int n46 = n5 - n4 & 0x7;
                if (n46 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        n += n40;
                    } while (--n46 > 0);
                }
            }
            else {
                if (n41 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n40;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n40;
                        final int n47 = n38;
                        final int n48 = n39;
                        n8 += n11;
                        n9 += n12;
                        n10 += n13;
                        final int n49 = n10 >> 14;
                        if (n49 != 0) {
                            n38 = n8 / n49;
                            n39 = n9 / n49;
                            if (n38 < 0) {
                                n38 = 0;
                            }
                            else if (n38 > 16256) {
                                n38 = 16256;
                            }
                        }
                        else {
                            n38 = 0;
                            n39 = 0;
                        }
                        n = (n47 << 18) + n48;
                        n40 = (n38 - n47 >> 3 << 18) + (n39 - n48 >> 3);
                        n6 += n7;
                        n42 = n6 >> 8;
                    } while (--n41 > 0);
                }
                int n50 = n5 - n4 & 0x7;
                if (n50 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (((n2 & 0xFF00FF) * n42 & 0xFF00FF00) + ((n2 & 0xFF00) * n42 & 0xFF0000) >> 8 | 0xFF000000);
                        }
                        ++n3;
                        n += n40;
                    } while (--n50 > 0);
                }
            }
        }
    }
    
    public synchronized void cq() {
        for (MusicPatch musicPatch = (MusicPatch)this.musicPatches.first(); null != musicPatch; musicPatch = (MusicPatch)this.musicPatches.next()) {
            musicPatch.hw();
        }
    }
    
    @Override
    protected synchronized void bm(final int[] array, int n, int n2) {
        if (this.midiFile.isReady()) {
            final int n3 = this.midiFile.division * (this.field2735 * 437930689) / (-1359271235 * PcmPlayer.field201);
            do {
                final long n4 = n2 * (long)n3 + this.field2737 * 8370013022464380265L;
                if (this.field2758 * -8691691867109044431L - n4 >= 0L) {
                    this.field2737 = n4 * 389160967981716185L;
                    break;
                }
                final int n5 = (int)((-8691691867109044431L * this.field2758 - 8370013022464380265L * this.field2737 + n3 - 1L) / n3);
                this.field2737 += n3 * (long)n5 * 389160967981716185L;
                this.patchStream.fill(array, n, n5);
                n += n5;
                n2 -= n5;
                dj(this, 486029060);
            } while (this.midiFile.isReady());
        }
        this.patchStream.fill(array, n, n2);
    }
    
    @Override
    protected synchronized PcmStream bk() {
        return null;
    }
    
    void eo(int i) {
        if (i < 0) {
            for (i = 0; i < 16; ++i) {
                this.method1625(i, -124986761);
            }
            return;
        }
        this.field2744[i] = 12800;
        this.field2752[i] = 8192;
        this.field2738[i] = 16383;
        this.field2742[i] = 8192;
        this.field2740[i] = 0;
        this.field2760[i] = 8192;
        this.method1640(i, (byte)(-23));
        this.method1627(i, -896099039);
        this.field2746[i] = 0;
        this.field2747[i] = 32767;
        this.field2736[i] = 256;
        this.field2749[i] = 0;
        this.method1629(i, 8192, -1731550836);
    }
    
    void eb(final int n) {
        if (0x0 != (this.field2746[n] & 0x4)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
                if (musicPatchNode.field2801 * 1021419297 == n) {
                    musicPatchNode.field2803 = 0;
                }
            }
        }
    }
    
    void method1641(final int n, final int n2, final int n3) {
        try {
            if (n2 != this.field2745[n]) {
                if (n3 <= 1529980485) {
                    throw new IllegalStateException();
                }
                this.field2745[n] = n2;
                for (int i = 0; i < 128; ++i) {
                    if (n3 <= 1529980485) {
                        throw new IllegalStateException();
                    }
                    this.field2733[n][i] = null;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.ah(" + ')');
        }
    }
    
    public static int xf(final MidiPcmStream midiPcmStream, final MusicPatchNode musicPatchNode, final int n) {
        if (midiPcmStream == null) {
            return midiPcmStream.method1631(musicPatchNode, n);
        }
        try {
            final MusicPatchNode2 field2786 = musicPatchNode.field2786;
            final int n2 = midiPcmStream.field2744[1021419297 * musicPatchNode.field2801] * midiPcmStream.field2738[1021419297 * musicPatchNode.field2801] + 4096 >> 13;
            int n3 = 128 + 1380277371 * midiPcmStream.field2757 * (musicPatchNode.field2789 * -254585523 * (n2 * n2 + 16384 >> 15) + 16384 >> 15) >> 8;
            if (354539497 * field2786.field2719 > 0) {
                n3 = (int)(n3 * Math.pow(0.5, field2786.field2719 * 354539497 * (musicPatchNode.field2794 * -814647939 * 1.953125E-5)) + 0.5);
            }
            if (null != field2786.field2718) {
                final int n4 = 873438947 * musicPatchNode.field2795;
                int n5 = field2786.field2718[1 + musicPatchNode.field2802 * 891662681];
                if (891662681 * musicPatchNode.field2802 < field2786.field2718.length - 2) {
                    if (n == 1171226834) {
                        throw new IllegalStateException();
                    }
                    final int n6 = (field2786.field2718[musicPatchNode.field2802 * 891662681] & 0xFF) << 8;
                    n5 += (field2786.field2718[3 + 891662681 * musicPatchNode.field2802] - n5) * (n4 - n6) / (((field2786.field2718[891662681 * musicPatchNode.field2802 + 2] & 0xFF) << 8) - n6);
                }
                n3 = n3 * n5 + 32 >> 6;
            }
            if (-602614853 * musicPatchNode.field2798 > 0) {
                if (n == 1171226834) {
                    throw new IllegalStateException();
                }
                if (field2786.field2717 != null) {
                    if (n == 1171226834) {
                        throw new IllegalStateException();
                    }
                    final int n7 = -602614853 * musicPatchNode.field2798;
                    int n8 = field2786.field2717[1 + -371546193 * musicPatchNode.field2783];
                    if (musicPatchNode.field2783 * -371546193 < field2786.field2717.length - 2) {
                        if (n == 1171226834) {
                            throw new IllegalStateException();
                        }
                        final int n9 = (field2786.field2717[musicPatchNode.field2783 * -371546193] & 0xFF) << 8;
                        n8 += (field2786.field2717[musicPatchNode.field2783 * -371546193 + 3] - n8) * (n7 - n9) / (((field2786.field2717[musicPatchNode.field2783 * -371546193 + 2] & 0xFF) << 8) - n9);
                    }
                    n3 = n8 * n3 + 32 >> 6;
                }
            }
            return n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ln.bv(" + ')');
        }
    }
    
    public static void qm(final MidiPcmStream midiPcmStream, final int n) {
        if (0x0 != (midiPcmStream.field2746[n] & 0x2)) {
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)midiPcmStream.patchStream.queue.previous()) {
                if (1021419297 * musicPatchNode.field2801 == n && midiPcmStream.field2753[n][musicPatchNode.field2788 * -630482265] == null && -602614853 * musicPatchNode.field2798 < 0) {
                    musicPatchNode.field2798 = 0;
                }
            }
        }
    }
    
    void ef(final int n) {
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.patchStream.queue.last(); null != musicPatchNode; musicPatchNode = (MusicPatchNode)this.patchStream.queue.previous()) {
            if ((n < 0 || n == musicPatchNode.field2801 * 1021419297) && musicPatchNode.field2798 * -602614853 < 0) {
                this.field2753[1021419297 * musicPatchNode.field2801][-630482265 * musicPatchNode.field2788] = null;
                musicPatchNode.field2798 = 0;
            }
        }
    }
    
    public static void vo(final ClanMate clanMate) {
        if (clanMate == null) {
            clanMate.ax();
            return;
        }
        clanMate.friend = TriBool.TriBool_unknown;
    }
    
    void ey() {
        int trackCount = this.track * -2130330853;
        int n = this.trackLength * 2049666181;
        long method1656 = this.field2758 * -8691691867109044431L;
        while (this.trackLength * 2049666181 == n) {
            while (this.midiFile.trackLengths[trackCount] == n) {
                this.midiFile.gotoTrack(trackCount);
                final int message = this.midiFile.readMessage(trackCount);
                if (message != 0) {
                    this.midiFile.bb();
                    this.midiFile.markTrackPosition(trackCount);
                    if (!this.midiFile.isDone()) {
                        break;
                    }
                    if (this.field2759 && n != 0) {
                        this.midiFile.reset(method1656);
                        break;
                    }
                    this.method1626(-964267539);
                    MidiFileReader.vw(this.midiFile);
                    return;
                }
                else {
                    if ((message & 0x80) != 0x0) {
                        this.method1628(message, -2078249866);
                    }
                    this.midiFile.readTrackLength(trackCount);
                    this.midiFile.markTrackPosition(trackCount);
                }
            }
            trackCount = this.midiFile.trackCount();
            n = this.midiFile.trackLengths[trackCount];
            method1656 = this.midiFile.method1656(n);
        }
        this.track = 911615763 * trackCount;
        this.trackLength = -1172591539 * n;
        this.field2758 = -5361838125554816559L * method1656;
    }
    
    @Override
    protected synchronized void bf(int n) {
        if (this.midiFile.isReady()) {
            final int n2 = this.midiFile.division * (437930689 * this.field2735) / (-1359271235 * PcmPlayer.field201);
            do {
                final long n3 = 8370013022464380265L * this.field2737 + n2 * (long)n;
                if (-8691691867109044431L * this.field2758 - n3 >= 0L) {
                    this.field2737 = 389160967981716185L * n3;
                    break;
                }
                final int n4 = (int)((this.field2758 * -8691691867109044431L - 8370013022464380265L * this.field2737 + n2 - 1L) / n2);
                this.field2737 += n4 * (long)n2 * 389160967981716185L;
                this.patchStream.skip(n4);
                n -= n4;
                dj(this, 486029060);
            } while (this.midiFile.isReady());
        }
        this.patchStream.skip(n);
    }
    
    public static void un(final MidiPcmStream midiPcmStream, final int n, final int n2) {
        midiPcmStream.field2739[n] = n2;
        midiPcmStream.field2741[n] = (n2 & 0xFFFFFF80);
        midiPcmStream.method1641(n, n2, 1718934379);
    }
    
    @Override
    protected synchronized void bu(int n) {
        if (this.midiFile.isReady()) {
            final int n2 = this.midiFile.division * (437930689 * this.field2735) / (-1359271235 * PcmPlayer.field201);
            do {
                final long n3 = 8370013022464380265L * this.field2737 + n2 * (long)n;
                if (-8691691867109044431L * this.field2758 - n3 >= 0L) {
                    this.field2737 = 389160967981716185L * n3;
                    break;
                }
                final int n4 = (int)((this.field2758 * -8691691867109044431L - 8370013022464380265L * this.field2737 + n2 - 1L) / n2);
                this.field2737 += n4 * (long)n2 * 389160967981716185L;
                this.patchStream.skip(n4);
                n -= n4;
                dj(this, 486029060);
            } while (this.midiFile.isReady());
        }
        this.patchStream.skip(n);
    }
    
    void du(final int n, final int n2, final int n3) {
    }
}
