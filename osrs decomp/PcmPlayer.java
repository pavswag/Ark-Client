import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;

// 
// Decompiled by Procyon v0.5.36
// 

public class PcmPlayer
{
    int field192;
    int field193;
    static final int ao = 16384;
    public static class50 pcmPlayerProvider;
    protected int[] samples;
    PcmStream stream;
    int field197;
    long timeMs;
    PcmStream[] field210;
    int field200;
    public static int field201;
    long field202;
    int field203;
    long field204;
    int field205;
    int capacity;
    boolean field207;
    public static boolean PcmPlayer_stereo;
    int field209;
    PcmStream[] field199;
    static Archive field211;
    
    protected PcmPlayer() {
        this.field197 = 572938784;
        this.timeMs = class96.clockNow(1173990459) * 9158675434300782157L;
        this.field202 = 0L;
        this.field203 = 0;
        this.field192 = 0;
        this.field205 = 0;
        this.field204 = 0L;
        this.field207 = true;
        this.field209 = 0;
        this.field210 = new PcmStream[8];
        this.field199 = new PcmStream[8];
    }
    
    public final synchronized void bs() {
        if (class354.soundSystem != null) {
            boolean b = true;
            for (int i = 0; i < 2; ++i) {
                if (this == class354.soundSystem.players[i]) {
                    class354.soundSystem.players[i] = null;
                }
                if (null != class354.soundSystem.players[i]) {
                    b = false;
                }
            }
            if (b) {
                SoundSystem.soundSystemExecutor.shutdownNow();
                SoundSystem.soundSystemExecutor = null;
                class354.soundSystem = null;
            }
        }
        this.close(-1466449702);
        this.samples = null;
    }
    
    public final synchronized void tryDiscard(final int n) {
        this.jg();
        try {
            if (this.samples == null) {
                return;
            }
            long clockNow = class96.clockNow(984429955);
            try {
                if (0L != -269385131777873879L * this.field202) {
                    if (n != 336870901) {
                        return;
                    }
                    if (clockNow < this.field202 * -269385131777873879L) {
                        if (n != 336870901) {
                            throw new IllegalStateException();
                        }
                        return;
                    }
                    else {
                        this.open(-896831859 * this.capacity, 619537570);
                        this.field202 = 0L;
                        this.field207 = true;
                    }
                }
                int i = this.position(-654786411);
                if (-1187659381 * this.field205 - i > 1667971679 * this.field203) {
                    this.field203 = (this.field205 * -1187659381 - i) * -286285409;
                }
                int n2 = 335978257 * this.field193 + 1331788289 * this.field200;
                if (256 + n2 > 16384) {
                    if (n != 336870901) {
                        throw new IllegalStateException();
                    }
                    n2 = 16128;
                }
                if (n2 + 256 > this.capacity * -896831859) {
                    if (n != 336870901) {
                        return;
                    }
                    this.capacity -= 737078272;
                    if (this.capacity * -896831859 > 16384) {
                        if (n != 336870901) {
                            throw new IllegalStateException();
                        }
                        this.capacity = 1091649536;
                    }
                    this.close(-1466449702);
                    this.open(-896831859 * this.capacity, 182405776);
                    i = 0;
                    this.field207 = true;
                    if (256 + n2 > this.capacity * -896831859) {
                        n2 = -896831859 * this.capacity - 256;
                        this.field193 = -802016783 * (n2 - 1331788289 * this.field200);
                    }
                }
                while (i < n2) {
                    if (n != 336870901) {
                        throw new IllegalStateException();
                    }
                    this.fill(this.samples, 256);
                    this.write();
                    i += 256;
                }
                if (clockNow > 7119359816026141145L * this.field204) {
                    if (n != 336870901) {
                        throw new IllegalStateException();
                    }
                    if (!this.field207) {
                        if (n != 336870901) {
                            throw new IllegalStateException();
                        }
                        if (this.field203 * 1667971679 == 0 && this.field192 * -1982890287 == 0) {
                            if (n != 336870901) {
                                throw new IllegalStateException();
                            }
                            this.close(-1466449702);
                            this.field202 = -8158358322466360295L * (2000L + clockNow);
                            return;
                        }
                        else {
                            this.field193 = Math.min(-1982890287 * this.field192, this.field203 * 1667971679) * -802016783;
                            this.field192 = -646688209 * this.field203;
                        }
                    }
                    else {
                        this.field207 = false;
                    }
                    this.field203 = 0;
                    this.field204 = (clockNow + 2000L) * -1624624044362187159L;
                }
                this.field205 = -1989091805 * i;
            }
            catch (Exception ex2) {
                this.close(-1466449702);
                this.field202 = (clockNow + 2000L) * -8158358322466360295L;
            }
            try {
                if (clockNow > 500000L + 5466236213624304261L * this.timeMs) {
                    if (n != 336870901) {
                        return;
                    }
                    clockNow = 5466236213624304261L * this.timeMs;
                }
                while (clockNow > 5000L + 5466236213624304261L * this.timeMs) {
                    if (n != 336870901) {
                        return;
                    }
                    this.skip(256, -1042309166);
                    this.timeMs += 9158675434300782157L * (256000 / (PcmPlayer.field201 * -1359271235));
                }
            }
            catch (Exception ex3) {
                this.timeMs = clockNow * 9158675434300782157L;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bu.ak(" + ')');
        }
    }
    
    final void ba(final int n) {
    }
    
    public final synchronized void shutdown(final byte b) {
        try {
            if (class354.soundSystem != null) {
                if (b != -1) {
                    return;
                }
                int n = 1;
                for (int i = 0; i < 2; ++i) {
                    if (b != -1) {
                        return;
                    }
                    if (this == class354.soundSystem.players[i]) {
                        if (b != -1) {
                            throw new IllegalStateException();
                        }
                        class354.soundSystem.players[i] = null;
                    }
                    if (null != class354.soundSystem.players[i]) {
                        n = 0;
                    }
                }
                if (n != 0) {
                    if (b != -1) {
                        return;
                    }
                    SoundSystem.soundSystemExecutor.shutdownNow();
                    SoundSystem.soundSystemExecutor = null;
                    class354.soundSystem = null;
                }
            }
            this.close(-1466449702);
            this.samples = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bu.ae(" + ')');
        }
    }
    
    final void ce(final PcmStream after, final int field255) {
        final int n = field255 >> 5;
        final PcmStream pcmStream = this.field199[n];
        if (pcmStream == null) {
            this.field210[n] = after;
        }
        else {
            pcmStream.after = after;
        }
        this.field199[n] = after;
        after.field255 = field255;
    }
    
    final void bw(final PcmStream after, final int field255) {
        final int n = field255 >> 5;
        final PcmStream pcmStream = this.field199[n];
        if (pcmStream == null) {
            this.field210[n] = after;
        }
        else {
            pcmStream.after = after;
        }
        this.field199[n] = after;
        after.field255 = field255;
    }
    
    protected int ao() throws Exception {
        return this.capacity * 637504388;
    }
    
    protected void at(final int n) throws Exception {
    }
    
    public final synchronized void run(final int n) {
        try {
            this.field207 = true;
            try {
                this.discard((byte)22);
            }
            catch (Exception ex2) {
                this.close(-1466449702);
                this.field202 = (class96.clockNow(2066914331) + 2000L) * -8158358322466360295L;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bu.ad(" + ')');
        }
    }
    
    protected void av() throws Exception {
    }
    
    public static final PcmPlayer be(final TaskHandler taskHandler, final int n, int n2) {
        if (PcmPlayer.field201 * -1359271235 == 0) {
            throw new IllegalStateException();
        }
        if (n < 0 || n >= 2) {
            throw new IllegalArgumentException();
        }
        if (n2 < 256) {
            n2 = 256;
        }
        try {
            final PcmPlayer player = PcmPlayer.pcmPlayerProvider.player(1183188913);
            player.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
            player.field200 = n2 * 918717953;
            player.init((byte)5);
            player.capacity = -1783299003 * ((n2 & 0xFFFFFC00) + 1024);
            if (player.capacity * -896831859 > 16384) {
                player.capacity = 1091649536;
            }
            player.open(player.capacity * -896831859, 1881829420);
            if (UrlRequest.field1154 * -808987209 > 0 && class354.soundSystem == null) {
                class354.soundSystem = new SoundSystem();
                (SoundSystem.soundSystemExecutor = Executors.newScheduledThreadPool(1)).scheduleAtFixedRate(class354.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }
            if (null != class354.soundSystem) {
                if (null != class354.soundSystem.players[n]) {
                    throw new IllegalArgumentException();
                }
                class354.soundSystem.players[n] = player;
            }
            return player;
        }
        catch (Throwable t) {
            return new PcmPlayer();
        }
    }
    
    public final void method228(final int n) {
        try {
            this.field207 = true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bu.az(" + ')');
        }
    }
    
    protected void method240() throws Exception {
    }
    
    static int method240(final int n, final int n2, final int n3, final int n4) {
        try {
            if ((Tiles.Tiles_renderFlags[n][n2][n3] & 0x8) == 0x0) {
                if (n > 0) {
                    if (n4 <= 1128021573) {
                        throw new IllegalStateException();
                    }
                    if (0x0 != (Tiles.Tiles_renderFlags[1][n2][n3] & 0x2)) {
                        if (n4 <= 1128021573) {
                            throw new IllegalStateException();
                        }
                        return n - 1;
                    }
                }
                return n;
            }
            if (n4 <= 1128021573) {
                throw new IllegalStateException();
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bu.ax(" + ')');
        }
    }
    
    protected int ay() throws Exception {
        return this.capacity * -896831859;
    }
    
    final void method235(final PcmStream after, final int field255, final byte b) {
        try {
            final int n = field255 >> 5;
            final PcmStream pcmStream = this.field199[n];
            if (pcmStream == null) {
                if (b == 73) {
                    throw new IllegalStateException();
                }
                this.field210[n] = after;
            }
            else {
                pcmStream.after = after;
            }
            this.field199[n] = after;
            after.field255 = field255;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bu.bi(" + ')');
        }
    }
    
    final void bv(final int[] array, final int n) {
        int n2 = n;
        if (PcmPlayer.PcmPlayer_stereo) {
            n2 <<= 1;
        }
        class384.clearIntArray(array, 0, n2);
        this.field209 -= -348458013 * n;
        if (null != this.stream && -951195189 * this.field209 <= 0) {
            this.field209 += (PcmPlayer.field201 * -1359271235 >> 4) * -348458013;
            class207.PcmStream_disable(this.stream, 555212662);
            this.method235(this.stream, this.stream.vmethod1019(), (byte)11);
            int n3 = 0;
            int n4 = 255;
            int n5 = 7;
        Label_0347:
            while (n4) {
                int n6;
                int n7;
                if (n5 < 0) {
                    n6 = (n5 & 0x3);
                    n7 = -(n5 >> 2);
                }
                else {
                    n6 = n5;
                    n7 = 0;
                }
                for (int i = n4 >>> n6 & 0x11111111; i != 0; i >>>= 4) {
                    if (0x0 != (i & 0x1)) {
                        n4 &= ~(1 << n6);
                        PcmStream pcmStream = null;
                        PcmStream after = this.field210[n6];
                        while (null != after) {
                            final AbstractSound sound = after.sound;
                            if (sound != null && sound.position > n7) {
                                n4 |= 1 << n6;
                                pcmStream = after;
                                after = after.after;
                            }
                            else {
                                after.active = true;
                                final int bz = after.bz();
                                n3 += bz;
                                if (null != sound) {
                                    final AbstractSound abstractSound = sound;
                                    abstractSound.position += bz;
                                }
                                if (n3 >= 1670800945 * this.field197) {
                                    break Label_0347;
                                }
                                PcmStream pcmStream2 = after.firstSubStream();
                                if (null != pcmStream2) {
                                    final int field255 = after.field255;
                                    while (null != pcmStream2) {
                                        this.method235(pcmStream2, field255 * pcmStream2.vmethod1019() >> 8, (byte)11);
                                        pcmStream2 = after.nextSubStream();
                                    }
                                }
                                final PcmStream after2 = after.after;
                                after.after = null;
                                if (null == pcmStream) {
                                    this.field210[n6] = after2;
                                }
                                else {
                                    pcmStream.after = after2;
                                }
                                if (after2 == null) {
                                    this.field199[n6] = pcmStream;
                                }
                                after = after2;
                            }
                        }
                    }
                    n6 += 4;
                    ++n7;
                }
                --n5;
            }
            for (int j = 0; j < 8; ++j) {
                PcmStream pcmStream3 = this.field210[j];
                this.field210[j] = (this.field199[j] = null);
                while (null != pcmStream3) {
                    final PcmStream after3 = pcmStream3.after;
                    pcmStream3.after = null;
                    pcmStream3 = after3;
                }
            }
        }
        if (this.field209 * -951195189 < 0) {
            this.field209 = 0;
        }
        if (this.stream != null) {
            this.stream.fill(array, 0, n);
        }
        this.timeMs = class96.clockNow(304748010) * 9158675434300782157L;
    }
    
    public static final PcmPlayer bo(final TaskHandler taskHandler, final int n, int n2) {
        if (PcmPlayer.field201 * -659464581 == 0) {
            throw new IllegalStateException();
        }
        if (n < 0 || n >= 2) {
            throw new IllegalArgumentException();
        }
        if (n2 < -1382725870) {
            n2 = 256;
        }
        try {
            final PcmPlayer player = PcmPlayer.pcmPlayerProvider.player(1183188913);
            player.samples = new int[-2033839746 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
            player.field200 = n2 * -473312933;
            player.init((byte)1);
            player.capacity = -1783299003 * ((n2 & 0x61DED82A) + 1394150848);
            if (player.capacity * -896831859 > 1219136441) {
                player.capacity = 767469357;
            }
            player.open(player.capacity * 2110905021, -1517983462);
            if (UrlRequest.field1154 * -928578483 > 0 && class354.soundSystem == null) {
                class354.soundSystem = new SoundSystem();
                (SoundSystem.soundSystemExecutor = Executors.newScheduledThreadPool(1)).scheduleAtFixedRate(class354.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }
            if (null != class354.soundSystem) {
                if (null != class354.soundSystem.players[n]) {
                    throw new IllegalArgumentException();
                }
                class354.soundSystem.players[n] = player;
            }
            return player;
        }
        catch (Throwable t) {
            return new PcmPlayer();
        }
    }
    
    static final void bp(final PcmStream pcmStream) {
        pcmStream.active = false;
        if (null != pcmStream.sound) {
            pcmStream.sound.position = 0;
        }
        for (PcmStream pcmStream2 = pcmStream.firstSubStream(); pcmStream2 != null; pcmStream2 = pcmStream.nextSubStream()) {
            class207.PcmStream_disable(pcmStream2, -895361395);
        }
    }
    
    public final synchronized void bt() {
        this.field207 = true;
        try {
            this.discard((byte)64);
        }
        catch (Exception ex) {
            this.close(-1466449702);
            this.field202 = (class96.clockNow(477920671) + 2000L) * -8158358322466360295L;
        }
    }
    
    static final void bc(final PcmStream pcmStream) {
        pcmStream.active = false;
        if (null != pcmStream.sound) {
            pcmStream.sound.position = 0;
        }
        for (PcmStream pcmStream2 = pcmStream.firstSubStream(); pcmStream2 != null; pcmStream2 = pcmStream.nextSubStream()) {
            class207.PcmStream_disable(pcmStream2, 1328621367);
        }
    }
    
    public final synchronized void br() {
        this.field207 = true;
        try {
            this.discard((byte)(-23));
        }
        catch (Exception ex) {
            this.close(-1466449702);
            this.field202 = (class96.clockNow(516610727) + 2000L) * -8158358322466360295L;
        }
    }
    
    final void ci(final PcmStream after, final int field255) {
        final int n = field255 >> 5;
        final PcmStream pcmStream = this.field199[n];
        if (pcmStream == null) {
            this.field210[n] = after;
        }
        else {
            pcmStream.after = after;
        }
        this.field199[n] = after;
        after.field255 = field255;
    }
    
    protected int position(final int n) throws Exception {
        try {
            return this.capacity * -896831859;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bu.aw(" + ')');
        }
    }
    
    protected void am() throws Exception {
    }
    
    protected void al() throws Exception {
    }
    
    protected void open(final int n, final int n2) throws Exception {
    }
    
    protected void write() throws Exception {
    }
    
    public static void zf(final PcmPlayer pcmPlayer, final int n) {
        if (pcmPlayer == null) {
            pcmPlayer.av();
        }
        pcmPlayer.field209 -= -348458013 * n;
        if (-951195189 * pcmPlayer.field209 < 0) {
            pcmPlayer.field209 = 0;
        }
        if (null != pcmPlayer.stream) {
            pcmPlayer.stream.skip(n);
        }
    }
    
    final void bq(final int n) {
        this.capacity = this.field209 - -1715679152 * n;
        if (-951195189 * this.capacity < 0) {
            this.field209 = 0;
        }
        if (null != this.stream) {
            this.stream.bg(n);
        }
    }
    
    protected void close(final int n) {
    }
    
    protected void aa(final int n) throws Exception {
    }
    
    protected void ai() {
    }
    
    final void bh(final PcmStream after, final int field255) {
        final int n = field255 >> 5;
        final PcmStream pcmStream = this.field199[n];
        if (pcmStream == null) {
            this.field210[n] = after;
        }
        else {
            pcmStream.after = after;
        }
        this.field199[n] = after;
        after.field255 = field255;
    }
    
    final void fill(final int[] array, final int n) {
        int n2 = n;
        if (PcmPlayer.PcmPlayer_stereo) {
            n2 <<= 1;
        }
        class384.clearIntArray(array, 0, n2);
        this.field209 -= -348458013 * n;
        if (null != this.stream && -951195189 * this.field209 <= 0) {
            this.field209 += (PcmPlayer.field201 * -1359271235 >> 4) * -348458013;
            class207.PcmStream_disable(this.stream, 2037910040);
            this.method235(this.stream, this.stream.vmethod1019(), (byte)(-105));
            int n3 = 0;
            int n4 = 255;
            int n5 = 7;
        Label_0530:
            while (n4) {
                int n6;
                int n7;
                if (n5 < 0) {
                    n6 = (n5 & 0x3);
                    n7 = -(n5 >> 2);
                }
                else {
                    n6 = n5;
                    n7 = 0;
                }
                for (int i = n4 >>> n6 & 0x11111111; i != 0; i >>>= 4) {
                    if (0x0 != (i & 0x1)) {
                        n4 &= ~(1 << n6);
                        PcmStream pcmStream = null;
                        PcmStream after = this.field210[n6];
                        while (null != after) {
                            final AbstractSound sound = after.sound;
                            if (sound != null && sound.position > n7) {
                                n4 |= 1 << n6;
                                pcmStream = after;
                                after = after.after;
                            }
                            else {
                                after.active = true;
                                final int bz = after.bz();
                                n3 += bz;
                                if (null != sound) {
                                    final AbstractSound abstractSound = sound;
                                    abstractSound.position += bz;
                                }
                                if (n3 >= 1670800945 * this.field197) {
                                    break Label_0530;
                                }
                                PcmStream pcmStream2 = after.firstSubStream();
                                if (null != pcmStream2) {
                                    final int field255 = after.field255;
                                    while (null != pcmStream2) {
                                        this.method235(pcmStream2, field255 * pcmStream2.vmethod1019() >> 8, (byte)23);
                                        pcmStream2 = after.nextSubStream();
                                    }
                                }
                                final PcmStream after2 = after.after;
                                after.after = null;
                                if (null == pcmStream) {
                                    this.field210[n6] = after2;
                                }
                                else {
                                    pcmStream.after = after2;
                                }
                                if (after2 == null) {
                                    this.field199[n6] = pcmStream;
                                }
                                after = after2;
                            }
                        }
                    }
                    n6 += 4;
                    ++n7;
                }
                --n5;
            }
            for (int j = 0; j < 8; ++j) {
                PcmStream pcmStream3 = this.field210[j];
                this.field210[j] = (this.field199[j] = null);
                while (null != pcmStream3) {
                    final PcmStream after3 = pcmStream3.after;
                    pcmStream3.after = null;
                    pcmStream3 = after3;
                }
            }
        }
        if (this.field209 * -951195189 < 0) {
            this.field209 = 0;
        }
        if (this.stream != null) {
            this.stream.fill(array, 0, n);
        }
        this.timeMs = class96.clockNow(881846564) * 9158675434300782157L;
    }
    
    public static final PcmPlayer bx(final TaskHandler taskHandler, final int n, int n2) {
        if (PcmPlayer.field201 * -1359271235 == 0) {
            throw new IllegalStateException();
        }
        if (n < 0 || n >= 2) {
            throw new IllegalArgumentException();
        }
        if (n2 < 256) {
            n2 = 256;
        }
        try {
            final PcmPlayer player = PcmPlayer.pcmPlayerProvider.player(1183188913);
            player.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
            player.field200 = n2 * 918717953;
            player.init((byte)24);
            player.capacity = -1783299003 * ((n2 & 0xFFFFFC00) + 1024);
            if (player.capacity * -896831859 > 16384) {
                player.capacity = 1091649536;
            }
            player.open(player.capacity * -896831859, 1577370534);
            if (UrlRequest.field1154 * -808987209 > 0 && class354.soundSystem == null) {
                class354.soundSystem = new SoundSystem();
                (SoundSystem.soundSystemExecutor = Executors.newScheduledThreadPool(1)).scheduleAtFixedRate(class354.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }
            if (null != class354.soundSystem) {
                if (null != class354.soundSystem.players[n]) {
                    throw new IllegalArgumentException();
                }
                class354.soundSystem.players[n] = player;
            }
            return player;
        }
        catch (Throwable t) {
            return new PcmPlayer();
        }
    }
    
    protected void ar() throws Exception {
    }
    
    final void skip(final int n, final int n2) {
        try {
            this.field209 -= -348458013 * n;
            if (-951195189 * this.field209 < 0) {
                this.field209 = 0;
            }
            if (null != this.stream) {
                if (n2 == 1876840387) {
                    throw new IllegalStateException();
                }
                this.stream.skip(n);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bu.ap(" + ')');
        }
    }
    
    public final synchronized void bd(final PcmStream stream) {
        this.stream = stream;
    }
    
    public final synchronized void bg() {
        this.field207 = true;
        try {
            this.discard((byte)(-41));
        }
        catch (Exception ex) {
            this.close(-1466449702);
            this.field202 = (class96.clockNow(1876765168) + 2000L) * -8158358322466360295L;
        }
    }
    
    protected void init(final byte b) throws Exception {
    }
    
    public final synchronized void bn() {
        if (this.samples == null) {
            return;
        }
        long clockNow = class96.clockNow(597524379);
        try {
            if (0L != -269385131777873879L * this.field202) {
                if (clockNow < this.field202 * -269385131777873879L) {
                    return;
                }
                this.open(-204717256 * this.capacity, 977186880);
                this.field202 = 0L;
                this.field207 = true;
            }
            int i = this.position(-654786411);
            if (-1187659381 * this.field205 - i > 1667971679 * this.field203) {
                this.field203 = (this.field205 * -820077102 - i) * -1620140796;
            }
            int n = 1946428477 * this.field193 + 1975927357 * this.field200;
            if (-2083952587 + n > 16384) {
                n = 988892750;
            }
            if (n + 1257885167 > this.capacity * -896831859) {
                this.capacity += 1011603646;
                if (this.capacity * -896831859 > 16384) {
                    this.capacity = 1091649536;
                }
                this.close(-1466449702);
                this.open(-1172682543 * this.capacity, -1975466399);
                i = 0;
                this.field207 = true;
                if (256 + n > this.capacity * -896831859) {
                    n = -896831859 * this.capacity + 583343718;
                    this.field193 = -1972120878 * (n - 1331788289 * this.field200);
                }
            }
            while (i < n) {
                this.fill(this.samples, 256);
                this.write();
                i += 256;
            }
            if (clockNow > 7119359816026141145L * this.field204) {
                if (!this.field207) {
                    if (this.field203 * 1359510294 == 0 && this.field192 * -1982890287 == 0) {
                        this.close(-1466449702);
                        this.field202 = -8158358322466360295L * (2000L + clockNow);
                        return;
                    }
                    this.field193 = Math.min(-1982890287 * this.field192, this.field203 * -542145634) * -802016783;
                    this.field192 = -1080034788 * this.field203;
                }
                else {
                    this.field207 = false;
                }
                this.field203 = 0;
                this.field204 = (clockNow + 2000L) * -1624624044362187159L;
            }
            this.field205 = -1989091805 * i;
        }
        catch (Exception ex) {
            this.close(-1466449702);
            this.field202 = (clockNow + 2000L) * -8158358322466360295L;
        }
        try {
            if (clockNow > 500000L + 5466236213624304261L * this.timeMs) {
                clockNow = 5466236213624304261L * this.timeMs;
            }
            while (clockNow > 5000L + 5466236213624304261L * this.timeMs) {
                this.skip(256, -698009791);
                this.timeMs += 9158675434300782157L * (256000 / (PcmPlayer.field201 * -1138853297));
            }
        }
        catch (Exception ex2) {
            this.timeMs = clockNow * 9158675434300782157L;
        }
    }
    
    protected void discard(final byte b) throws Exception {
    }
    
    protected void aq() throws Exception {
    }
    
    public final synchronized void setStream(final PcmStream stream, final int n) {
        try {
            this.stream = stream;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bu.aj(" + ')');
        }
    }
    
    protected void ag() {
    }
    
    final void bl(final int[] array, final int n) {
        int n2 = n;
        if (PcmPlayer.PcmPlayer_stereo) {
            n2 <<= 1;
        }
        class384.clearIntArray(array, 0, n2);
        this.field209 -= -348458013 * n;
        if (null != this.stream && -951195189 * this.field209 <= 0) {
            this.field209 += (PcmPlayer.field201 * -1359271235 >> 4) * -348458013;
            class207.PcmStream_disable(this.stream, 857745764);
            this.method235(this.stream, this.stream.vmethod1019(), (byte)(-19));
            int n3 = 0;
            int n4 = 255;
            int n5 = 7;
        Label_0519:
            while (n4) {
                int n6;
                int n7;
                if (n5 < 0) {
                    n6 = (n5 & 0x3);
                    n7 = -(n5 >> 2);
                }
                else {
                    n6 = n5;
                    n7 = 0;
                }
                for (int i = n4 >>> n6 & 0x11111111; i != 0; i >>>= 4) {
                    if (0x0 != (i & 0x1)) {
                        n4 &= ~(1 << n6);
                        PcmStream pcmStream = null;
                        PcmStream after = this.field210[n6];
                        while (null != after) {
                            final AbstractSound sound = after.sound;
                            if (sound != null && sound.position > n7) {
                                n4 |= 1 << n6;
                                pcmStream = after;
                                after = after.after;
                            }
                            else {
                                after.active = true;
                                final int bz = after.bz();
                                n3 += bz;
                                if (null != sound) {
                                    final AbstractSound abstractSound = sound;
                                    abstractSound.position += bz;
                                }
                                if (n3 >= 1670800945 * this.field197) {
                                    break Label_0519;
                                }
                                PcmStream pcmStream2 = after.firstSubStream();
                                if (null != pcmStream2) {
                                    final int field255 = after.field255;
                                    while (null != pcmStream2) {
                                        this.method235(pcmStream2, field255 * pcmStream2.vmethod1019() >> 8, (byte)16);
                                        pcmStream2 = after.nextSubStream();
                                    }
                                }
                                final PcmStream after2 = after.after;
                                after.after = null;
                                if (null == pcmStream) {
                                    this.field210[n6] = after2;
                                }
                                else {
                                    pcmStream.after = after2;
                                }
                                if (after2 == null) {
                                    this.field199[n6] = pcmStream;
                                }
                                after = after2;
                            }
                        }
                    }
                    n6 += 4;
                    ++n7;
                }
                --n5;
            }
            for (int j = 0; j < 8; ++j) {
                PcmStream pcmStream3 = this.field210[j];
                this.field210[j] = (this.field199[j] = null);
                while (null != pcmStream3) {
                    final PcmStream after3 = pcmStream3.after;
                    pcmStream3.after = null;
                    pcmStream3 = after3;
                }
            }
        }
        if (this.field209 * -951195189 < 0) {
            this.field209 = 0;
        }
        if (this.stream != null) {
            this.stream.fill(array, 0, n);
        }
        this.timeMs = class96.clockNow(1453451608) * 9158675434300782157L;
    }
    
    public final synchronized void bz(final PcmStream stream) {
        this.stream = stream;
    }
    
    public static void ol(final PcmPlayer pcmPlayer, final int n) {
        if (pcmPlayer == null) {
            pcmPlayer.bq(n);
        }
        pcmPlayer.field209 -= -1715679152 * n;
        if (-951195189 * pcmPlayer.field209 < 0) {
            pcmPlayer.field209 = 0;
        }
        if (null != pcmPlayer.stream) {
            pcmPlayer.stream.skip(n);
        }
    }
    
    public static void mp(final PcmPlayer pcmPlayer, final int n) {
        if (pcmPlayer == null) {
            pcmPlayer.ba(n);
            return;
        }
        pcmPlayer.field209 -= -651581134 * n;
        if (1290898414 * pcmPlayer.field209 < 0) {
            pcmPlayer.field209 = 0;
        }
        if (null != pcmPlayer.stream) {
            pcmPlayer.stream.skip(n);
        }
    }
    
    public static void qb(final NPC npc, final int n) {
        if (npc == null) {
            npc.method609();
        }
        npc.field1045 = 1731572173 * n;
    }
    
    public static int ku(final class379 class379, final int n) {
        switch (1114162931 * class379.field3620) {
            case 2: {
                return n;
            }
            case 0: {
                return 0;
            }
            case 1: {
                return n / 2;
            }
            default: {
                return 0;
            }
        }
    }
    
    public final synchronized void bm(final PcmStream stream) {
        this.stream = stream;
    }
    
    public static final PcmPlayer bk(final TaskHandler taskHandler, final int n, int n2) {
        if (PcmPlayer.field201 * -669559548 == 0) {
            throw new IllegalStateException();
        }
        if (n < 0 || n >= 2) {
            throw new IllegalArgumentException();
        }
        if (n2 < 319700995) {
            n2 = 359981852;
        }
        try {
            final PcmPlayer player = PcmPlayer.pcmPlayerProvider.player(1183188913);
            player.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
            player.field200 = n2 * 918717953;
            player.init((byte)(-33));
            player.capacity = -1783299003 * ((n2 & 0xFFFFFC00) + 1024);
            if (player.capacity * -896831859 > -1167202825) {
                player.capacity = 287678898;
            }
            player.open(player.capacity * 1496862029, 2096362820);
            if (UrlRequest.field1154 * -959942277 > 0 && class354.soundSystem == null) {
                class354.soundSystem = new SoundSystem();
                (SoundSystem.soundSystemExecutor = Executors.newScheduledThreadPool(1)).scheduleAtFixedRate(class354.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }
            if (null != class354.soundSystem) {
                if (null != class354.soundSystem.players[n]) {
                    throw new IllegalArgumentException();
                }
                class354.soundSystem.players[n] = player;
            }
            return player;
        }
        catch (Throwable t) {
            return new PcmPlayer();
        }
    }
    
    public void jg() {
        if (this.samples == null) {
            final PcmStreamMixer vf = ScriptFrame.client.vf();
            synchronized (vf) {
                vf.hi().clear();
            }
        }
    }
    
    protected void ah() {
    }
    
    public final synchronized void bu() {
        if (class354.soundSystem != null) {
            int n = 1;
            for (int i = 0; i < 2; ++i) {
                if (this == class354.soundSystem.players[i]) {
                    class354.soundSystem.players[i] = null;
                }
                if (null != class354.soundSystem.players[i]) {
                    n = 0;
                }
            }
            if (n != 0) {
                SoundSystem.soundSystemExecutor.shutdownNow();
                SoundSystem.soundSystemExecutor = null;
                class354.soundSystem = null;
            }
        }
        this.close(-1466449702);
        this.samples = null;
    }
}
