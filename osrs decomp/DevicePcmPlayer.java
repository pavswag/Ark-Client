import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Line;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioFormat;

// 
// Decompiled by Procyon v0.5.36
// 

public class DevicePcmPlayer extends PcmPlayer
{
    int capacity2;
    AudioFormat format;
    SourceDataLine line;
    byte[] byteSamples;
    
    DevicePcmPlayer() {
    }
    
    @Override
    protected int ao() {
        return this.capacity2 * -552651193 - (this.line.available() >> (DevicePcmPlayer.ab ? 2 : 1));
    }
    
    @Override
    protected void at(final int n) throws LineUnavailableException {
        try {
            (this.line = (SourceDataLine)AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, this.format, n << (DevicePcmPlayer.ab ? 2 : 1)))).open();
            this.line.start();
            this.capacity2 = n * -1465543817;
        }
        catch (LineUnavailableException ex) {
            if (class18.method63(n, 515447241) != 1) {
                this.open(class70.method442(n, -385172354), -2094670509);
                return;
            }
            this.line = null;
            throw ex;
        }
    }
    
    @Override
    protected void av() {
        this.line.flush();
    }
    
    protected void ax() {
        int n = 256;
        if (DevicePcmPlayer.ab) {
            n <<= 1;
        }
        for (int i = 0; i < n; ++i) {
            int n2 = this.ai[i];
            if (0x0 != (n2 + 8388608 & 0xFF000000)) {
                n2 = (0x7FFFFF ^ n2 >> 31);
            }
            this.byteSamples[i * 2] = (byte)(n2 >> 8);
            this.byteSamples[2 * i + 1] = (byte)(n2 >> 16);
        }
        this.line.write(this.byteSamples, 0, n << 1);
    }
    
    @Override
    protected int ay() {
        return this.capacity2 * -552651193 - (this.line.available() >> (DevicePcmPlayer.ab ? 2 : 1));
    }
    
    @Override
    protected int position(final int n) {
        try {
            final int n2 = this.capacity2 * -552651193;
            final int available = this.line.available();
            int n3;
            if (DevicePcmPlayer.ab) {
                if (n != -654786411) {
                    throw new IllegalStateException();
                }
                n3 = 2;
            }
            else {
                n3 = 1;
            }
            return n2 - (available >> n3);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ae.aw(" + ')');
        }
    }
    
    @Override
    protected void am() {
        this.line.flush();
    }
    
    @Override
    protected void al() {
        this.format = new AudioFormat((float)(DevicePcmPlayer.au * -1359271235), 16, DevicePcmPlayer.ab ? 2 : 1, true, false);
        this.byteSamples = new byte[256 << (DevicePcmPlayer.ab ? 2 : 1)];
    }
    
    @Override
    protected void open(final int n, final int n2) {
        try {
            final int n3 = 182405776;
            try {
                try {
                    final Class<SourceDataLine> lineClass = SourceDataLine.class;
                    final AudioFormat format = this.format;
                    int n4;
                    if (DevicePcmPlayer.ab) {
                        if (n3 == 1689901440) {
                            throw new IllegalStateException();
                        }
                        n4 = 2;
                    }
                    else {
                        n4 = 1;
                    }
                    (this.line = (SourceDataLine)AudioSystem.getLine(new DataLine.Info(lineClass, format, n << n4))).open();
                    this.line.start();
                    this.capacity2 = n * -1465543817;
                }
                catch (LineUnavailableException ex) {
                    if (class18.method63(n, -440671694) == 1) {
                        this.line = null;
                        throw ex;
                    }
                    if (n3 != 1689901440) {
                        this.open(class70.method442(n, 698228402), -811878074);
                    }
                }
            }
            catch (RuntimeException ex2) {
                throw HealthBar.get(ex2, "ae.an(" + ')');
            }
        }
        catch (IllegalArgumentException ex3) {
            Client.nw.error("Unable to get audio system line. Audio will be unavailable.", (Throwable)ex3);
            throw ex3;
        }
    }
    
    @Override
    protected void write() {
        int n = 256;
        if (DevicePcmPlayer.ab) {
            n <<= 1;
        }
        for (int i = 0; i < n; ++i) {
            int n2 = this.ai[i];
            if (0x0 != (n2 + 8388608 & 0xFF000000)) {
                n2 = (0x7FFFFF ^ n2 >> 31);
            }
            this.byteSamples[i * 2] = (byte)(n2 >> 8);
            this.byteSamples[2 * i + 1] = (byte)(n2 >> 16);
        }
        this.line.write(this.byteSamples, 0, n << 1);
    }
    
    @Override
    protected void close(final int n) {
        try {
            if (this.line != null) {
                if (n != -1466449702) {
                    return;
                }
                this.line.close();
                this.line = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ae.au(" + ')');
        }
    }
    
    @Override
    protected void aa(final int n) throws LineUnavailableException {
        try {
            (this.line = (SourceDataLine)AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, this.format, n << (DevicePcmPlayer.ab ? 2 : 1)))).open();
            this.line.start();
            this.capacity2 = n * -1465543817;
        }
        catch (LineUnavailableException ex) {
            if (class18.method63(n, 1170708507) != 1) {
                this.open(class70.method442(n, 113838603), -511149841);
                return;
            }
            this.line = null;
            throw ex;
        }
    }
    
    @Override
    protected void ai() {
        if (this.line != null) {
            this.line.close();
            this.line = null;
        }
    }
    
    @Override
    protected void ar() {
        this.line.flush();
    }
    
    @Override
    protected void init(final byte b) {
        try {
            final float sampleRate = (float)(DevicePcmPlayer.au * -1359271235);
            final int sampleSizeInBits = 16;
            int channels;
            if (DevicePcmPlayer.ab) {
                if (b == 12) {
                    throw new IllegalStateException();
                }
                channels = 2;
            }
            else {
                channels = 1;
            }
            this.format = new AudioFormat(sampleRate, sampleSizeInBits, channels, true, false);
            final int n = 256;
            int n2;
            if (DevicePcmPlayer.ab) {
                if (b == 12) {
                    return;
                }
                n2 = 2;
            }
            else {
                n2 = 1;
            }
            this.byteSamples = new byte[n << n2];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ae.af(" + ')');
        }
    }
    
    @Override
    protected void discard(final byte b) {
        try {
            this.line.flush();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ae.ab(" + ')');
        }
    }
    
    @Override
    protected void aq() {
        this.format = new AudioFormat((float)(DevicePcmPlayer.au * -1359271235), 16, DevicePcmPlayer.ab ? 2 : 1, true, false);
        this.byteSamples = new byte[-495269443 << (DevicePcmPlayer.ab ? 2 : 1)];
    }
    
    @Override
    protected void ag() {
        if (this.line != null) {
            this.line.close();
            this.line = null;
        }
    }
    
    @Override
    protected void ah() {
        if (this.line != null) {
            this.line.close();
            this.line = null;
        }
    }
}
