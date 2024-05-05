// 
// Decompiled by Procyon v0.5.36
// 

public class SoundEnvelope
{
    int form;
    int[] durations;
    int segments;
    int start;
    int end;
    int step;
    int ticks;
    int[] phases;
    int phaseIndex;
    int amplitude;
    int max;
    
    SoundEnvelope() {
        this.segments = 2;
        this.durations = new int[2];
        this.phases = new int[2];
        this.durations[0] = 0;
        this.durations[1] = 65535;
        this.phases[0] = 0;
        this.phases[1] = 65535;
    }
    
    final int ao(final int n) {
        if (this.max >= this.ticks) {
            this.amplitude = this.phases[this.phaseIndex++] << 15;
            if (this.phaseIndex >= this.segments) {
                this.phaseIndex = this.segments - 1;
            }
            this.ticks = (int)(this.durations[this.phaseIndex] / 65536.0 * n);
            if (this.ticks > this.max) {
                this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
            }
        }
        this.amplitude += this.step;
        ++this.max;
        return this.amplitude - this.step >> 15;
    }
    
    public static float[] lc(final class166 class166) {
        return class166.field1422;
    }
    
    final int ay(final int n) {
        if (this.form >= this.form) {
            final int[] durations = this.durations;
            final int end = this.end;
            this.max = end + 1;
            this.start = durations[end] << 15;
            if (this.amplitude >= this.step) {
                this.amplitude = this.phaseIndex - 1;
            }
            this.amplitude = (int)(this.phases[this.phaseIndex] / 65536.0 * n);
            if (this.form > this.end) {
                this.amplitude = ((this.phases[this.ticks] << 15) - this.step) / (this.max - this.phaseIndex);
            }
        }
        this.segments += this.step;
        this.amplitude = this.start + 1;
        return this.phaseIndex - this.step >> 15;
    }
    
    final void reset() {
        this.ticks = 0;
        this.phaseIndex = 0;
        this.step = 0;
        this.amplitude = 0;
        this.max = 0;
    }
    
    final void al(final Buffer buffer) {
        this.step = Buffer.ra(buffer, (byte)7);
        this.durations = new int[this.phaseIndex];
        this.phases = new int[this.ticks];
        for (int i = 0; i < this.form; ++i) {
            this.durations[i] = buffer.readUnsignedByteAdd(101811866);
            this.durations[i] = buffer.readUnsignedShort(-1134388939);
        }
    }
    
    final void decodeSegments(final Buffer buffer) {
        this.form = Buffer.ra(buffer, (byte)7);
        this.start = buffer.readInt(-1284662081);
        this.end = buffer.readInt(-1008611028);
        dk(this, buffer);
    }
    
    final int doStep(final int n) {
        if (this.max >= this.ticks) {
            this.amplitude = this.phases[this.phaseIndex++] << 15;
            if (this.phaseIndex >= this.segments) {
                this.phaseIndex = this.segments - 1;
            }
            this.ticks = (int)(this.durations[this.phaseIndex] / 65536.0 * n);
            if (this.ticks > this.max) {
                this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
            }
        }
        this.amplitude += this.step;
        ++this.max;
        return this.amplitude - this.step >> 15;
    }
    
    public static void dk(final SoundEnvelope soundEnvelope, final Buffer buffer) {
        if (soundEnvelope == null) {
            soundEnvelope.al(buffer);
            return;
        }
        soundEnvelope.segments = Buffer.ra(buffer, (byte)7);
        soundEnvelope.durations = new int[soundEnvelope.segments];
        soundEnvelope.phases = new int[soundEnvelope.segments];
        for (int i = 0; i < soundEnvelope.segments; ++i) {
            soundEnvelope.durations[i] = buffer.readUnsignedShort(101811866);
            soundEnvelope.phases[i] = buffer.readUnsignedShort(-1134388939);
        }
    }
    
    final void au(final Buffer buffer) {
        this.form = Buffer.ra(buffer, (byte)7);
        this.start = buffer.readInt(-1991624058);
        this.end = buffer.readInt(-1266373950);
        dk(this, buffer);
    }
    
    final void aa() {
        this.ticks = 0;
        this.phaseIndex = 0;
        this.step = 0;
        this.amplitude = 0;
        this.max = 0;
    }
    
    public static int pq(final SoundEnvelope soundEnvelope, final int n) {
        if (soundEnvelope == null) {
            return soundEnvelope.ay(n);
        }
        if (soundEnvelope.max >= soundEnvelope.ticks) {
            soundEnvelope.amplitude = soundEnvelope.phases[soundEnvelope.phaseIndex++] << 15;
            if (soundEnvelope.phaseIndex >= soundEnvelope.segments) {
                soundEnvelope.phaseIndex = soundEnvelope.segments - 1;
            }
            soundEnvelope.ticks = (int)(soundEnvelope.durations[soundEnvelope.phaseIndex] / 65536.0 * n);
            if (soundEnvelope.ticks > soundEnvelope.max) {
                soundEnvelope.step = ((soundEnvelope.phases[soundEnvelope.phaseIndex] << 15) - soundEnvelope.amplitude) / (soundEnvelope.ticks - soundEnvelope.max);
            }
        }
        soundEnvelope.amplitude += soundEnvelope.step;
        ++soundEnvelope.max;
        return soundEnvelope.amplitude - soundEnvelope.step >> 15;
    }
    
    final void decode(final Buffer buffer) {
        this.segments = Buffer.ra(buffer, (byte)7);
        this.durations = new int[this.segments];
        this.phases = new int[this.segments];
        for (int i = 0; i < this.segments; ++i) {
            this.durations[i] = buffer.readUnsignedShort(-1731847894);
            this.phases[i] = buffer.readUnsignedShort(-1922543797);
        }
    }
    
    final void ab(final Buffer buffer) {
        this.form = Buffer.ra(buffer, (byte)7);
        this.start = buffer.readInt(-1298878479);
        this.end = buffer.readInt(-1260891186);
        dk(this, buffer);
    }
    
    final void aq(final Buffer buffer) {
        this.form = Buffer.ra(buffer, (byte)7);
        this.start = buffer.readInt(-988955935);
        this.end = buffer.readInt(-954445584);
        dk(this, buffer);
    }
    
    public static void jh(final SoundEnvelope soundEnvelope, final Buffer buffer) {
        if (soundEnvelope == null) {
            soundEnvelope.reset();
        }
        soundEnvelope.segments = Buffer.ra(buffer, (byte)7);
        soundEnvelope.durations = new int[soundEnvelope.segments];
        soundEnvelope.phases = new int[soundEnvelope.segments];
        for (int i = 0; i < soundEnvelope.segments; ++i) {
            soundEnvelope.durations[i] = buffer.readUnsignedShort(-181251105);
            soundEnvelope.phases[i] = buffer.readUnsignedShort(835883809);
        }
    }
}
