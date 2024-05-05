// 
// Decompiled by Procyon v0.5.36
// 

public class MusicPatchPcmStream extends PcmStream
{
    MidiPcmStream superStream;
    NodeDeque queue;
    PcmStreamMixer mixer;
    static final int ao = 32;
    
    MusicPatchPcmStream(final MidiPcmStream superStream) {
        this.queue = new NodeDeque();
        this.mixer = new PcmStreamMixer();
        this.superStream = superStream;
    }
    
    @Override
    protected PcmStream bb() {
        final MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last();
        if (musicPatchNode == null) {
            return null;
        }
        if (null != musicPatchNode.stream) {
            return musicPatchNode.stream;
        }
        return this.nextSubStream();
    }
    
    @Override
    protected void fill(final int[] array, final int n, final int n2) {
        try {
            this.mixer.fill(array, n, n2);
        Label_0197:
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.queue.previous()) {
                if (!this.superStream.method1646(musicPatchNode, (short)3954)) {
                    int n3 = n;
                    int i = n2;
                    while (i > musicPatchNode.field2796 * -1971564769) {
                        this.method1670(musicPatchNode, array, n3, -1971564769 * musicPatchNode.field2796, n3 + i, 1090554723);
                        n3 += -1971564769 * musicPatchNode.field2796;
                        i -= -1971564769 * musicPatchNode.field2796;
                        if (this.superStream.method1638(musicPatchNode, array, n3, i, 769270888)) {
                            continue Label_0197;
                        }
                    }
                    this.method1670(musicPatchNode, array, n3, i, i + n3, 1090554723);
                    final MusicPatchNode musicPatchNode2 = musicPatchNode;
                    musicPatchNode2.field2796 -= 652897503 * i;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lc.at(" + ')');
        }
    }
    
    @Override
    protected PcmStream be() {
        MusicPatchNode musicPatchNode;
        do {
            musicPatchNode = (MusicPatchNode)this.queue.previous();
            if (musicPatchNode == null) {
                return null;
            }
        } while (musicPatchNode.stream == null);
        return musicPatchNode.stream;
    }
    
    @Override
    protected void skip(final int n) {
        try {
            this.mixer.skip(n);
        Label_0125:
            for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.queue.previous()) {
                if (!this.superStream.method1646(musicPatchNode, (short)19212)) {
                    int i = n;
                    while (i > musicPatchNode.field2796 * -1971564769) {
                        this.method1668(musicPatchNode, musicPatchNode.field2796 * -1971564769, (byte)1);
                        i -= musicPatchNode.field2796 * -1971564769;
                        if (this.superStream.method1638(musicPatchNode, null, 0, i, 577556390)) {
                            continue Label_0125;
                        }
                    }
                    this.method1668(musicPatchNode, i, (byte)1);
                    final MusicPatchNode musicPatchNode2 = musicPatchNode;
                    musicPatchNode2.field2796 -= i * 652897503;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lc.ay(" + ')');
        }
    }
    
    @Override
    protected PcmStream bi() {
        final MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last();
        if (musicPatchNode == null) {
            return null;
        }
        if (null != musicPatchNode.stream) {
            return musicPatchNode.stream;
        }
        return this.nextSubStream();
    }
    
    @Override
    protected int bo() {
        return 0;
    }
    
    @Override
    protected void bt(final int[] array, final int n, final int n2) {
        this.mixer.fill(array, n, n2);
    Label_0142:
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.queue.previous()) {
            if (!this.superStream.method1646(musicPatchNode, (short)15663)) {
                int n3 = n;
                int i = n2;
                while (i > musicPatchNode.field2796 * -1971564769) {
                    this.method1670(musicPatchNode, array, n3, -1971564769 * musicPatchNode.field2796, n3 + i, 1090554723);
                    n3 += -1971564769 * musicPatchNode.field2796;
                    i -= -1971564769 * musicPatchNode.field2796;
                    if (this.superStream.method1638(musicPatchNode, array, n3, i, -2072046989)) {
                        continue Label_0142;
                    }
                }
                this.method1670(musicPatchNode, array, n3, i, i + n3, 1090554723);
                final MusicPatchNode musicPatchNode2 = musicPatchNode;
                musicPatchNode2.field2796 -= 652897503 * i;
            }
        }
    }
    
    void aw(final MusicPatchNode musicPatchNode, final int[] array, int n, int n2, final int n3) {
        if (0x0 != (this.superStream.field2746[musicPatchNode.field2801 * 1021419297] & 0x4) && musicPatchNode.field2798 * -857882660 < 0) {
            final int n4 = this.superStream.field2751[880924733 * musicPatchNode.field2801] / (-2105859019 * PcmPlayer.field201);
            while (true) {
                final int n5 = (n4 + 1048575 - musicPatchNode.field2803 * -51110070) / n4;
                if (n5 > n2) {
                    break;
                }
                musicPatchNode.stream.fill(array, n, n5);
                n += n5;
                n2 -= n5;
                musicPatchNode.field2803 += (n4 * n5 - 1048576) * -1999877033;
                int n6 = -1359271235 * PcmPlayer.field201 / 1782284966;
                final int n7 = 262144 / n4;
                if (n7 < n6) {
                    n6 = n7;
                }
                final RawPcmStream stream = musicPatchNode.stream;
                if (this.superStream.field2749[-1034782341 * musicPatchNode.field2801] == 0) {
                    musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, stream.method270(), stream.method262(), stream.method285());
                }
                else {
                    musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, stream.method270(), 0, stream.method285());
                    this.superStream.method1639(musicPatchNode, musicPatchNode.patch.field2771[-630482265 * musicPatchNode.field2788] < 0, 2147473859);
                    musicPatchNode.stream.db(n6, stream.method262());
                }
                if (musicPatchNode.patch.field2771[musicPatchNode.field2788 * 1442935755] < 0) {
                    musicPatchNode.stream.setNumLoops(-1);
                }
                stream.method268(n6);
                stream.fill(array, n, n3 - n);
                if (!stream.eo()) {
                    continue;
                }
                this.mixer.addSubStream(stream);
            }
            musicPatchNode.field2803 += n4 * n2 * -1999877033;
        }
        musicPatchNode.stream.fill(array, n, n2);
    }
    
    @Override
    protected int vmethod5648() {
        return 0;
    }
    
    void method1668(final MusicPatchNode musicPatchNode, int n, final byte b) {
        try {
            if (0x0 != (this.superStream.field2746[1021419297 * musicPatchNode.field2801] & 0x4)) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                if (-602614853 * musicPatchNode.field2798 < 0) {
                    if (b != 1) {
                        return;
                    }
                    final int n2 = this.superStream.field2751[musicPatchNode.field2801 * 1021419297] / (PcmPlayer.field201 * -1359271235);
                    final int n3 = (1048575 + n2 - -89170073 * musicPatchNode.field2803) / n2;
                    musicPatchNode.field2803 = (n2 * n + -89170073 * musicPatchNode.field2803 & 0xFFFFF) * -1999877033;
                    if (n3 <= n) {
                        if (b != 1) {
                            throw new IllegalStateException();
                        }
                        if (this.superStream.field2749[musicPatchNode.field2801 * 1021419297] == 0) {
                            if (b != 1) {
                                return;
                            }
                            musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, musicPatchNode.stream.method270(), musicPatchNode.stream.method262(), musicPatchNode.stream.method285());
                        }
                        else {
                            musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, musicPatchNode.stream.method270(), 0, musicPatchNode.stream.method285());
                            final MidiPcmStream superStream = this.superStream;
                            boolean b2;
                            if (musicPatchNode.patch.field2771[musicPatchNode.field2788 * -630482265] < 0) {
                                if (b != 1) {
                                    return;
                                }
                                b2 = true;
                            }
                            else {
                                b2 = false;
                            }
                            superStream.method1639(musicPatchNode, b2, 2140923303);
                        }
                        if (musicPatchNode.patch.field2771[-630482265 * musicPatchNode.field2788] < 0) {
                            if (b != 1) {
                                throw new IllegalStateException();
                            }
                            musicPatchNode.stream.setNumLoops(-1);
                        }
                        n = -89170073 * musicPatchNode.field2803 / n2;
                    }
                }
            }
            musicPatchNode.stream.skip(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lc.an(" + ')');
        }
    }
    
    void ac(final MusicPatchNode musicPatchNode, final int[] array, int n, int n2, final int n3) {
        if (0x0 != (this.superStream.field2746[musicPatchNode.field2801 * -487246590] & 0x4) && musicPatchNode.field2798 * -602614853 < 0) {
            final int n4 = this.superStream.field2751[1021419297 * musicPatchNode.field2801] / (639042225 * PcmPlayer.field201);
            while (true) {
                final int n5 = (n4 + 1048575 - musicPatchNode.field2803 * -89170073) / n4;
                if (n5 > n2) {
                    break;
                }
                musicPatchNode.stream.fill(array, n, n5);
                n += n5;
                n2 -= n5;
                musicPatchNode.field2803 += (n4 * n5 - 1048576) * 1042441399;
                int n6 = 1288722767 * PcmPlayer.field201 / 100;
                final int n7 = 602263950 / n4;
                if (n7 < n6) {
                    n6 = n7;
                }
                final RawPcmStream stream = musicPatchNode.stream;
                if (this.superStream.field2749[1633125425 * musicPatchNode.field2801] == 0) {
                    musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, stream.method270(), stream.method262(), stream.method285());
                }
                else {
                    musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, stream.method270(), 0, stream.method285());
                    this.superStream.method1639(musicPatchNode, musicPatchNode.patch.field2771[-630482265 * musicPatchNode.field2788] < 0, 2137896831);
                    musicPatchNode.stream.db(n6, stream.method262());
                }
                if (musicPatchNode.patch.field2771[musicPatchNode.field2788 * -630482265] < 0) {
                    musicPatchNode.stream.setNumLoops(-1);
                }
                stream.method268(n6);
                stream.fill(array, n, n3 - n);
                if (!stream.eo()) {
                    continue;
                }
                this.mixer.addSubStream(stream);
            }
            musicPatchNode.field2803 += n4 * n2 * -1999877033;
        }
        musicPatchNode.stream.fill(array, n, n2);
    }
    
    void au(final MusicPatchNode musicPatchNode, final int[] array, int n, int n2, final int n3) {
        if (0x0 != (this.superStream.field2746[musicPatchNode.field2801 * 1021419297] & 0x4) && musicPatchNode.field2798 * -602614853 < 0) {
            final int n4 = this.superStream.field2751[1021419297 * musicPatchNode.field2801] / (-1359271235 * PcmPlayer.field201);
            while (true) {
                final int n5 = (n4 + 1048575 - musicPatchNode.field2803 * -89170073) / n4;
                if (n5 > n2) {
                    break;
                }
                musicPatchNode.stream.fill(array, n, n5);
                n += n5;
                n2 -= n5;
                musicPatchNode.field2803 += (n4 * n5 - 1048576) * -1999877033;
                int n6 = -1359271235 * PcmPlayer.field201 / 100;
                final int n7 = 262144 / n4;
                if (n7 < n6) {
                    n6 = n7;
                }
                final RawPcmStream stream = musicPatchNode.stream;
                if (this.superStream.field2749[1021419297 * musicPatchNode.field2801] == 0) {
                    musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, stream.method270(), stream.method262(), stream.method285());
                }
                else {
                    musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, stream.method270(), 0, stream.method285());
                    this.superStream.method1639(musicPatchNode, musicPatchNode.patch.field2771[-630482265 * musicPatchNode.field2788] < 0, 2144720719);
                    musicPatchNode.stream.db(n6, stream.method262());
                }
                if (musicPatchNode.patch.field2771[musicPatchNode.field2788 * -630482265] < 0) {
                    musicPatchNode.stream.setNumLoops(-1);
                }
                stream.method268(n6);
                stream.fill(array, n, n3 - n);
                if (!stream.eo()) {
                    continue;
                }
                this.mixer.addSubStream(stream);
            }
            musicPatchNode.field2803 += n4 * n2 * -1999877033;
        }
        musicPatchNode.stream.fill(array, n, n2);
    }
    
    void aa(final MusicPatchNode musicPatchNode, int n) {
        if (0x0 != (this.superStream.field2746[-481579299 * musicPatchNode.field2801] & 0x4) && -602614853 * musicPatchNode.field2798 < 0) {
            final int n2 = this.superStream.field2751[musicPatchNode.field2801 * 807505742] / (PcmPlayer.field201 * -1796767944);
            final int n3 = (-695844437 + n2 - -1994069708 * musicPatchNode.field2803) / n2;
            musicPatchNode.field2803 = (n2 * n + -89170073 * musicPatchNode.field2803 & 0xFFFFF) * -1999877033;
            if (n3 <= n) {
                if (this.superStream.field2749[musicPatchNode.field2801 * 1097130511] == 0) {
                    musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, musicPatchNode.stream.method270(), musicPatchNode.stream.method262(), musicPatchNode.stream.method285());
                }
                else {
                    musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, musicPatchNode.stream.method270(), 0, musicPatchNode.stream.method285());
                    this.superStream.method1639(musicPatchNode, musicPatchNode.patch.field2771[musicPatchNode.field2788 * -630482265] < 0, 2133622460);
                }
                if (musicPatchNode.patch.field2771[-630482265 * musicPatchNode.field2788] < 0) {
                    musicPatchNode.stream.setNumLoops(-1);
                }
                n = -493786897 * musicPatchNode.field2803 / n2;
            }
        }
        musicPatchNode.stream.skip(n);
    }
    
    @Override
    protected PcmStream bx() {
        MusicPatchNode musicPatchNode;
        do {
            musicPatchNode = (MusicPatchNode)this.queue.previous();
            if (musicPatchNode == null) {
                return null;
            }
        } while (musicPatchNode.stream == null);
        return musicPatchNode.stream;
    }
    
    @Override
    protected void bd(final int[] array, final int n, final int n2) {
        this.mixer.fill(array, n, n2);
    Label_0181:
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.queue.previous()) {
            if (!this.superStream.method1646(musicPatchNode, (short)(-3861))) {
                int n3 = n;
                int i = n2;
                while (i > musicPatchNode.field2796 * -914797421) {
                    this.method1670(musicPatchNode, array, n3, 564023377 * musicPatchNode.field2796, n3 + i, 1090554723);
                    n3 += -284496406 * musicPatchNode.field2796;
                    i -= -1971564769 * musicPatchNode.field2796;
                    if (this.superStream.method1638(musicPatchNode, array, n3, i, 1821384343)) {
                        continue Label_0181;
                    }
                }
                this.method1670(musicPatchNode, array, n3, i, i + n3, 1090554723);
                final MusicPatchNode musicPatchNode2 = musicPatchNode;
                musicPatchNode2.field2796 -= -1849352893 * i;
            }
        }
    }
    
    @Override
    protected void bg(final int n) {
        this.mixer.skip(n);
    Label_0046:
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.queue.previous()) {
            if (!this.superStream.method1646(musicPatchNode, (short)14636)) {
                int i = n;
                while (i > musicPatchNode.field2796 * -1971564769) {
                    this.method1668(musicPatchNode, musicPatchNode.field2796 * -1971564769, (byte)1);
                    i -= musicPatchNode.field2796 * -1971564769;
                    if (this.superStream.method1638(musicPatchNode, null, 0, i, 1528324054)) {
                        continue Label_0046;
                    }
                }
                this.method1668(musicPatchNode, i, (byte)1);
                final MusicPatchNode musicPatchNode2 = musicPatchNode;
                musicPatchNode2.field2796 -= i * 652897503;
            }
        }
    }
    
    void method1670(final MusicPatchNode musicPatchNode, final int[] array, int n, int n2, final int n3, final int n4) {
        try {
            if (0x0 != (this.superStream.field2746[musicPatchNode.field2801 * 1021419297] & 0x4) && musicPatchNode.field2798 * -602614853 < 0) {
                if (n4 != 1090554723) {
                    return;
                }
                final int n5 = this.superStream.field2751[1021419297 * musicPatchNode.field2801] / (-1359271235 * PcmPlayer.field201);
                while (true) {
                    final int n6 = (n5 + 1048575 - musicPatchNode.field2803 * -89170073) / n5;
                    if (n6 > n2) {
                        if (n4 != 1090554723) {
                            throw new IllegalStateException();
                        }
                        musicPatchNode.field2803 += n5 * n2 * -1999877033;
                        break;
                    }
                    else {
                        musicPatchNode.stream.fill(array, n, n6);
                        n += n6;
                        n2 -= n6;
                        musicPatchNode.field2803 += (n5 * n6 - 1048576) * -1999877033;
                        int n7 = -1359271235 * PcmPlayer.field201 / 100;
                        final int n8 = 262144 / n5;
                        if (n8 < n7) {
                            if (n4 != 1090554723) {
                                throw new IllegalStateException();
                            }
                            n7 = n8;
                        }
                        final RawPcmStream stream = musicPatchNode.stream;
                        if (this.superStream.field2749[1021419297 * musicPatchNode.field2801] == 0) {
                            if (n4 != 1090554723) {
                                throw new IllegalStateException();
                            }
                            musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, stream.method270(), stream.method262(), stream.method285());
                        }
                        else {
                            musicPatchNode.stream = RawPcmStream.method294(musicPatchNode.rawSound, stream.method270(), 0, stream.method285());
                            final MidiPcmStream superStream = this.superStream;
                            boolean b;
                            if (musicPatchNode.patch.field2771[-630482265 * musicPatchNode.field2788] < 0) {
                                if (n4 != 1090554723) {
                                    throw new IllegalStateException();
                                }
                                b = true;
                            }
                            else {
                                b = false;
                            }
                            superStream.method1639(musicPatchNode, b, 2143076996);
                            musicPatchNode.stream.db(n7, stream.method262());
                        }
                        if (musicPatchNode.patch.field2771[musicPatchNode.field2788 * -630482265] < 0) {
                            if (n4 != 1090554723) {
                                throw new IllegalStateException();
                            }
                            musicPatchNode.stream.setNumLoops(-1);
                        }
                        stream.method268(n7);
                        stream.fill(array, n, n3 - n);
                        if (!stream.eo()) {
                            continue;
                        }
                        if (n4 != 1090554723) {
                            throw new IllegalStateException();
                        }
                        this.mixer.addSubStream(stream);
                    }
                }
            }
            musicPatchNode.stream.fill(array, n, n2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lc.af(" + ')');
        }
    }
    
    @Override
    protected PcmStream firstSubStream() {
        try {
            final MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last();
            if (musicPatchNode == null) {
                return null;
            }
            if (null != musicPatchNode.stream) {
                return musicPatchNode.stream;
            }
            return this.nextSubStream();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lc.ab(" + ')');
        }
    }
    
    @Override
    protected PcmStream nextSubStream() {
        try {
            MusicPatchNode musicPatchNode;
            do {
                musicPatchNode = (MusicPatchNode)this.queue.previous();
                if (musicPatchNode == null) {
                    return null;
                }
            } while (musicPatchNode.stream == null);
            return musicPatchNode.stream;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lc.aq(" + ')');
        }
    }
    
    @Override
    protected int bz() {
        try {
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lc.al(" + ')');
        }
    }
    
    @Override
    protected void bj(final int[] array, final int n, final int n2) {
        this.mixer.fill(array, n, n2);
    Label_0179:
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.queue.previous()) {
            if (!this.superStream.method1646(musicPatchNode, (short)(-1521))) {
                int n3 = n;
                int i = n2;
                while (i > musicPatchNode.field2796 * -1334453510) {
                    this.method1670(musicPatchNode, array, n3, 1256464660 * musicPatchNode.field2796, n3 + i, 1090554723);
                    n3 += -1412009045 * musicPatchNode.field2796;
                    i -= -1971564769 * musicPatchNode.field2796;
                    if (this.superStream.method1638(musicPatchNode, array, n3, i, 1758340875)) {
                        continue Label_0179;
                    }
                }
                this.method1670(musicPatchNode, array, n3, i, i + n3, 1090554723);
                final MusicPatchNode musicPatchNode2 = musicPatchNode;
                musicPatchNode2.field2796 -= -186641801 * i;
            }
        }
    }
    
    static int method1665(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (4200 == n) {
                if (b2 <= 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)101).name;
                return 1;
            }
            else if (4201 == n) {
                if (b2 <= 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n2 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n3 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                final ItemComposition set = HealthBarUpdate.set(n2, (byte)110);
                if (n3 >= 1) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    if (n3 <= 5) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (set.groundActions[n3 - 1] != null) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = set.groundActions[n3 - 1];
                            return 1;
                        }
                    }
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                return 1;
            }
            else if (n == 4202) {
                if (b2 <= 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                final int n5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                final ItemComposition set2 = HealthBarUpdate.set(n4, (byte)70);
                Label_0952: {
                    if (n5 < 1) {
                        break Label_0952;
                    }
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    if (n5 > 5) {
                        break Label_0952;
                    }
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    if (null == set2.inventoryActions[n5 - 1]) {
                        break Label_0952;
                    }
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = set2.inventoryActions[n5 - 1];
                    return 1;
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                return 1;
            }
            else if (4203 == n) {
                if (b2 <= 0) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)114).price * -1706039181;
                return 1;
            }
            else if (n == 4204) {
                if (b2 <= 0) {
                    throw new IllegalStateException();
                }
                final int n6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                final int n7 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                boolean b3;
                if (HealthBarUpdate.set(n6, (byte)59).isStackable * 1552863327 == 1) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                interpreter_intStack[n7] = (b3 ? 1 : 0);
                return 1;
            }
            else if (n == 4205) {
                if (b2 <= 0) {
                    throw new IllegalStateException();
                }
                final int n8 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                final ItemComposition set3 = HealthBarUpdate.set(n8, (byte)109);
                if (-1375068187 * set3.noteTemplate == -1) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    if (1399852547 * set3.note >= 0) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = set3.note * 1399852547;
                        return 1;
                    }
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n8;
                return 1;
            }
            else {
                if (n == 4206) {
                    final int n9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    final ItemComposition set4 = HealthBarUpdate.set(n9, (byte)48);
                    if (-1375068187 * set4.noteTemplate >= 0 && set4.note * 1399852547 >= 0) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = set4.note * 1399852547;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n9;
                    }
                    return 1;
                }
                if (n == 4207) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    final int n10 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                    final int n11 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b4;
                    if (HealthBarUpdate.set(n10, (byte)92).isMembersOnly) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    interpreter_intStack2[n11] = (b4 ? 1 : 0);
                    return 1;
                }
                else if (4208 == n) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    final int n12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    final ItemComposition set5 = HealthBarUpdate.set(n12, (byte)71);
                    Label_1127: {
                        if (-1 != 119859889 * set5.placeholderTemplate) {
                            break Label_1127;
                        }
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (set5.placeholder * -172219939 < 0) {
                            break Label_1127;
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = set5.placeholder * -172219939;
                        return 1;
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n12;
                    return 1;
                }
                else if (n == 4209) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    final int n13 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    final ItemComposition set6 = HealthBarUpdate.set(n13, (byte)80);
                    if (set6.placeholderTemplate * 119859889 >= 0) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (set6.placeholder * -172219939 >= 0) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -172219939 * set6.placeholder;
                            return 1;
                        }
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n13;
                    return 1;
                }
                else if (4210 == n) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    final String s = Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                    final int n14 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    final String s2 = s;
                    boolean b5;
                    if (n14 != 0) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        b5 = true;
                    }
                    else {
                        b5 = false;
                    }
                    class68.findItemDefinitions(s2, b5, (short)255);
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1764192979 * class264.foundItemIdCount;
                    return 1;
                }
                else if (4211 == n) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    Label_1506: {
                        if (class399.foundItemIds == null) {
                            break Label_1506;
                        }
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (-859067495 * FontName.foundItemIndex >= class264.foundItemIdCount * 1764192979) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            break Label_1506;
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class399.foundItemIds[(FontName.foundItemIndex += 1333557417) * -859067495 - 1] & 0xFFFF);
                        }
                        return 1;
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    return 1;
                }
                else if (4212 == n) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    FontName.foundItemIndex = 0;
                    return 1;
                }
                else if (n == 4213) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    final int shiftClickIndex = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)65).getShiftClickIndex((byte)42);
                    if (shiftClickIndex == -1) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = shiftClickIndex;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = shiftClickIndex + 1;
                    }
                    return 1;
                }
                else {
                    if (4214 == n) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)98).maleModel * -1935812527;
                        return 1;
                    }
                    if (4215 == n) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)68).maleModel1 * -1719338253;
                        return 1;
                    }
                    else {
                        if (4216 == n) {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)16).maleModel2 * 723093341;
                            return 1;
                        }
                        if (4217 != n) {
                            return 2;
                        }
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1162544887 * HealthBarUpdate.set(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)19).field1774;
                        return 1;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lc.bm(" + ')');
        }
    }
    
    protected void method1665(final int[] array, final int n, final int n2) {
        this.mixer.fill(array, n, n2);
    Label_0145:
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.queue.previous()) {
            if (!this.superStream.method1646(musicPatchNode, (short)8330)) {
                int n3 = n;
                int i = n2;
                while (i > musicPatchNode.field2796 * -1971564769) {
                    this.method1670(musicPatchNode, array, n3, -1971564769 * musicPatchNode.field2796, n3 + i, 1090554723);
                    n3 += -1971564769 * musicPatchNode.field2796;
                    i -= 1825653407 * musicPatchNode.field2796;
                    if (this.superStream.method1638(musicPatchNode, array, n3, i, -433885863)) {
                        continue Label_0145;
                    }
                }
                this.method1670(musicPatchNode, array, n3, i, i + n3, 1090554723);
                final MusicPatchNode musicPatchNode2 = musicPatchNode;
                musicPatchNode2.field2796 -= -1392902949 * i;
            }
        }
    }
    
    @Override
    protected PcmStream bk() {
        MusicPatchNode musicPatchNode;
        do {
            musicPatchNode = (MusicPatchNode)this.queue.previous();
            if (musicPatchNode == null) {
                return null;
            }
        } while (musicPatchNode.stream == null);
        return musicPatchNode.stream;
    }
    
    @Override
    protected void bf(final int n) {
        this.mixer.skip(n);
    Label_0142:
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.queue.previous()) {
            if (!this.superStream.method1646(musicPatchNode, (short)(-1980))) {
                int i = n;
                while (i > musicPatchNode.field2796 * -1971564769) {
                    this.method1668(musicPatchNode, musicPatchNode.field2796 * -1971564769, (byte)1);
                    i -= musicPatchNode.field2796 * -1971564769;
                    if (this.superStream.method1638(musicPatchNode, null, 0, i, 1190197055)) {
                        continue Label_0142;
                    }
                }
                this.method1668(musicPatchNode, i, (byte)1);
                final MusicPatchNode musicPatchNode2 = musicPatchNode;
                musicPatchNode2.field2796 -= i * 652897503;
            }
        }
    }
    
    @Override
    protected void bu(final int n) {
        this.mixer.skip(n);
    Label_0041:
        for (MusicPatchNode musicPatchNode = (MusicPatchNode)this.queue.last(); musicPatchNode != null; musicPatchNode = (MusicPatchNode)this.queue.previous()) {
            if (!this.superStream.method1646(musicPatchNode, (short)5610)) {
                int i = n;
                while (i > musicPatchNode.field2796 * -1971564769) {
                    this.method1668(musicPatchNode, musicPatchNode.field2796 * -1971564769, (byte)1);
                    i -= musicPatchNode.field2796 * -1971564769;
                    if (this.superStream.method1638(musicPatchNode, null, 0, i, 1444445394)) {
                        continue Label_0041;
                    }
                }
                this.method1668(musicPatchNode, i, (byte)1);
                final MusicPatchNode musicPatchNode2 = musicPatchNode;
                musicPatchNode2.field2796 -= i * 652897503;
            }
        }
    }
}
