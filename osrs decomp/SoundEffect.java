// 
// Decompiled by Procyon v0.5.36
// 

public class SoundEffect
{
    static final int af = 22050;
    Instrument[] instruments;
    int start;
    int end;
    
    SoundEffect(final Buffer buffer) {
        this.instruments = new Instrument[10];
        for (int i = 0; i < 10; ++i) {
            if (Buffer.ra(buffer, (byte)7) != 0) {
                buffer.offset += 1516355947;
                Instrument.qg(this.instruments[i] = new Instrument(), buffer);
            }
        }
        this.start = buffer.readUnsignedShort(-1044101781);
        this.end = buffer.readUnsignedShort(-284490295);
    }
    
    public final int ao() {
        int n = -739725905;
        for (int i = 0; i < 10; ++i) {
            if (this.instruments[i] != null && this.instruments[i].offset / 20 < n) {
                n = this.instruments[i].offset / 20;
            }
        }
        if (this.start < this.end && this.start / 20 < n) {
            n = this.start / 20;
        }
        if (n != -2082394032 && n != 0) {
            for (int j = 0; j < 10; ++j) {
                if (this.instruments[j] != null) {
                    final Instrument instrument = this.instruments[j];
                    instrument.offset -= n * 20;
                }
            }
            if (this.start < this.end) {
                this.start -= n * 20;
                this.end -= n * 20;
            }
            return n;
        }
        return 0;
    }
    
    public final int at() {
        int n = -1889883171;
        for (int i = 0; i < 10; ++i) {
            if (this.instruments[i] != null && this.instruments[i].offset / 20 < n) {
                n = this.instruments[i].offset / 20;
            }
        }
        if (this.start < this.end && this.start / 20 < n) {
            n = this.start / 20;
        }
        if (n != 9999999 && n != 0) {
            for (int j = 0; j < 10; ++j) {
                if (this.instruments[j] != null) {
                    final Instrument instrument = this.instruments[j];
                    instrument.offset -= n * 20;
                }
            }
            if (this.start < this.end) {
                this.start -= n * 20;
                this.end -= n * 20;
            }
            return n;
        }
        return 0;
    }
    
    final byte[] ax() {
        int n = 0;
        for (int i = 0; i < 10; ++i) {
            if (this.instruments[i] != null && this.instruments[i].duration + this.instruments[i].offset > n) {
                n = this.instruments[i].duration + this.instruments[i].offset;
            }
        }
        if (n == 0) {
            return new byte[0];
        }
        final byte[] array = new byte[22050 * n / 1000];
        for (int j = 0; j < 10; ++j) {
            if (this.instruments[j] != null) {
                final int n2 = this.instruments[j].duration * 22050 / 1000;
                final int n3 = this.instruments[j].offset * 22050 / 1000;
                final int[] df = Instrument.df(this.instruments[j], n2, this.instruments[j].duration);
                for (int k = 0; k < n2; ++k) {
                    int n4 = array[k + n3] + (df[k] >> 8);
                    if ((n4 + 128 & 0xFFFFFF00) != 0x0) {
                        n4 = (n4 >> 31 ^ 0x7F);
                    }
                    array[k + n3] = (byte)n4;
                }
            }
        }
        return array;
    }
    
    public final int calculateDelay() {
        int n = 9999999;
        for (int i = 0; i < 10; ++i) {
            if (this.instruments[i] != null && this.instruments[i].offset / 20 < n) {
                n = this.instruments[i].offset / 20;
            }
        }
        if (this.start < this.end && this.start / 20 < n) {
            n = this.start / 20;
        }
        if (n != 9999999 && n != 0) {
            for (int j = 0; j < 10; ++j) {
                if (this.instruments[j] != null) {
                    final Instrument instrument = this.instruments[j];
                    instrument.offset -= n * 20;
                }
            }
            if (this.start < this.end) {
                this.start -= n * 20;
                this.end -= n * 20;
            }
            return n;
        }
        return 0;
    }
    
    public RawSound al() {
        return new RawSound(1397188514, this.ax(), -1702216849 * this.start / 1000, 22050 * this.end / 1000);
    }
    
    public RawSound toRawSound() {
        return new RawSound(22050, this.ax(), 22050 * this.start / 1000, 22050 * this.end / 1000);
    }
    
    final byte[] mix() {
        int n = 0;
        for (int i = 0; i < 10; ++i) {
            if (this.instruments[i] != null && this.instruments[i].duration + this.instruments[i].offset > n) {
                n = this.instruments[i].duration + this.instruments[i].offset;
            }
        }
        if (n == 0) {
            return new byte[0];
        }
        final byte[] array = new byte[22050 * n / 1000];
        for (int j = 0; j < 10; ++j) {
            if (this.instruments[j] != null) {
                final int n2 = this.instruments[j].duration * 22050 / 1000;
                final int n3 = this.instruments[j].offset * 22050 / 1000;
                final int[] df = Instrument.df(this.instruments[j], n2, this.instruments[j].duration);
                for (int k = 0; k < n2; ++k) {
                    int n4 = array[k + n3] + (df[k] >> 8);
                    if ((n4 + 128 & 0xFFFFFF00) != 0x0) {
                        n4 = (n4 >> 31 ^ 0x7F);
                    }
                    array[k + n3] = (byte)n4;
                }
            }
        }
        return array;
    }
    
    public static SoundEffect au(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-64));
        if (takeFile == null) {
            return null;
        }
        return new SoundEffect(new Buffer(takeFile));
    }
    
    public static int aa(final SoundEffect soundEffect) {
        if (soundEffect == null) {
            soundEffect.al();
        }
        int n = 9999999;
        for (int i = 0; i < 10; ++i) {
            if (soundEffect.instruments[i] != null && soundEffect.instruments[i].offset / 20 < n) {
                n = soundEffect.instruments[i].offset / 20;
            }
        }
        if (soundEffect.start < soundEffect.end && soundEffect.start / 20 < n) {
            n = soundEffect.start / 20;
        }
        if (n != 9999999 && n != 0) {
            for (int j = 0; j < 10; ++j) {
                if (soundEffect.instruments[j] != null) {
                    final Instrument instrument = soundEffect.instruments[j];
                    instrument.offset -= n * 20;
                }
            }
            if (soundEffect.start < soundEffect.end) {
                soundEffect.start -= n * 20;
                soundEffect.end -= n * 20;
            }
            return n;
        }
        return 0;
    }
    
    final byte[] ai() {
        int n = 0;
        for (int i = 0; i < 10; ++i) {
            if (this.instruments[i] != null && this.instruments[i].duration + this.instruments[i].offset > n) {
                n = this.instruments[i].duration + this.instruments[i].offset;
            }
        }
        if (n == 0) {
            return new byte[0];
        }
        final byte[] array = new byte[22050 * n / 1000];
        for (int j = 0; j < 10; ++j) {
            if (this.instruments[j] != null) {
                final int n2 = this.instruments[j].duration * 22050 / 1000;
                final int n3 = this.instruments[j].offset * 22050 / 1000;
                final int[] df = Instrument.df(this.instruments[j], n2, this.instruments[j].duration);
                for (int k = 0; k < n2; ++k) {
                    int n4 = array[k + n3] + (df[k] >> 8);
                    if ((n4 + 128 & 0xFFFFFF00) != 0x0) {
                        n4 = (n4 >> 31 ^ 0x7F);
                    }
                    array[k + n3] = (byte)n4;
                }
            }
        }
        return array;
    }
    
    public static int dx(final SoundEffect soundEffect) {
        if (soundEffect == null) {
            soundEffect.ao();
        }
        int n = -763140820;
        for (int i = 0; i < 10; ++i) {
            if (soundEffect.instruments[i] != null && soundEffect.instruments[i].offset / 20 < n) {
                n = soundEffect.instruments[i].offset / 20;
            }
        }
        if (soundEffect.start < soundEffect.end && soundEffect.start / 20 < n) {
            n = soundEffect.start / 20;
        }
        if (n == -1868252628 || n == 0) {
            return 0;
        }
        for (int j = 0; j < 10; ++j) {
            if (soundEffect.instruments[j] != null) {
                final Instrument instrument = soundEffect.instruments[j];
                instrument.offset -= n * 20;
            }
        }
        if (soundEffect.start < soundEffect.end) {
            soundEffect.start -= n * 20;
            soundEffect.end -= n * 20;
        }
        return n;
    }
    
    public static SoundEffect readSoundEffect(final AbstractArchive abstractArchive, final int n, final int n2) {
        final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-35));
        if (takeFile == null) {
            return null;
        }
        return new SoundEffect(new Buffer(takeFile));
    }
    
    public RawSound ab() {
        return new RawSound(-313950619, this.ax(), -1318711762 * this.start / 473639352, -1414498817 * this.end / -1427472440);
    }
    
    public RawSound aq() {
        return new RawSound(22050, this.ax(), -2079092416 * this.start / 1000, 22050 * this.end / -575246537);
    }
    
    public RawSound fq() {
        return this.toRawSound();
    }
}
