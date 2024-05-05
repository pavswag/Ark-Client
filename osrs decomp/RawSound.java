// 
// Decompiled by Procyon v0.5.36
// 

public class RawSound extends AbstractSound
{
    public byte[] samples;
    public boolean field176;
    public int sampleRate;
    int end;
    public int start;
    
    RawSound(final int sampleRate, final byte[] samples, final int start, final int end) {
        this.sampleRate = sampleRate;
        this.samples = samples;
        this.start = start;
        this.end = end;
    }
    
    RawSound(final int sampleRate, final byte[] samples, final int start, final int end, final boolean field176) {
        this.sampleRate = sampleRate;
        this.samples = samples;
        this.start = start;
        this.end = end;
        this.field176 = field176;
    }
    
    public RawSound an(final Decimator decimator) {
        this.samples = decimator.resample(this.samples, 33076536);
        this.sampleRate = Decimator.yr(decimator, this.sampleRate, (byte)53);
        if (this.start == this.end) {
            final int scalePosition = decimator.scalePosition(this.start, 896342529);
            this.end = scalePosition;
            this.start = scalePosition;
        }
        else {
            this.start = decimator.scalePosition(this.start, -545633262);
            this.end = decimator.scalePosition(this.end, 575222873);
            if (this.start == this.end) {
                --this.start;
            }
        }
        return this;
    }
    
    public RawSound wy(final Decimator decimator) {
        return this.resample(decimator);
    }
    
    public RawSound resample(final Decimator decimator) {
        this.samples = decimator.resample(this.samples, 33076536);
        this.sampleRate = Decimator.yr(decimator, this.sampleRate, (byte)45);
        if (this.start == this.end) {
            final int scalePosition = decimator.scalePosition(this.start, 2001424421);
            this.end = scalePosition;
            this.start = scalePosition;
        }
        else {
            this.start = decimator.scalePosition(this.start, 668972378);
            this.end = decimator.scalePosition(this.end, -454181658);
            if (this.start == this.end) {
                --this.start;
            }
        }
        return this;
    }
}
