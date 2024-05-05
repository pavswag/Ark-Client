import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class Instrument
{
    int[] oscillatorVolume;
    SoundEnvelope volume;
    SoundEnvelope pitchModifier;
    SoundEnvelope pitchModifierAmplitude;
    SoundEnvelope volumeMultiplier;
    SoundEnvelope volumeMultiplierAmplitude;
    SoundEnvelope release;
    SoundEnvelope attack;
    int duration;
    int[] oscillatorPitch;
    int offset;
    int delayTime;
    int delayDecay;
    static int[] Instrument_pitchSteps;
    static int[] Instrument_samples;
    static int[] Instrument_noise;
    int[] oscillatorDelays;
    SoundEnvelope filterEnvelope;
    SoundEnvelope pitch;
    static int[] Instrument_sine;
    AudioFilter filter;
    static final double aj = 1.0057929410678534;
    static int[] Instrument_delays;
    static int[] Instrument_volumeSteps;
    static int[] Instrument_phases;
    static int[] Instrument_pitchBaseSteps;
    
    Instrument() {
        this.oscillatorVolume = new int[] { 0, 0, 0, 0, 0 };
        this.oscillatorPitch = new int[] { 0, 0, 0, 0, 0 };
        this.oscillatorDelays = new int[] { 0, 0, 0, 0, 0 };
        this.delayTime = 0;
        this.delayDecay = 100;
        this.duration = 500;
        this.offset = 0;
    }
    
    static {
        Instrument.Instrument_noise = new int[32768];
        final Random random = new Random(0L);
        for (int i = 0; i < 32768; ++i) {
            Instrument.Instrument_noise[i] = (random.nextInt() & 0x2) - 1;
        }
        Instrument.Instrument_sine = new int[32768];
        for (int j = 0; j < 32768; ++j) {
            Instrument.Instrument_sine[j] = (int)(Math.sin(j / 5215.1903) * 16384.0);
        }
        Instrument.Instrument_samples = new int[220500];
        Instrument.Instrument_phases = new int[5];
        Instrument.Instrument_delays = new int[5];
        Instrument.Instrument_volumeSteps = new int[5];
        Instrument.Instrument_pitchSteps = new int[5];
        Instrument.Instrument_pitchBaseSteps = new int[5];
    }
    
    public static int hc(final Instrument instrument, final int n, final int n2, final int n3) {
        if (instrument == null) {
            instrument.evaluateWave(n, n, n);
        }
        if (n3 == 1) {
            if ((n & 0x7FFF) < 16384) {
                return n2;
            }
            return -n2;
        }
        else {
            if (n3 == 2) {
                return Instrument.Instrument_sine[n & 0x7FFF] * n2 >> 14;
            }
            if (n3 == 3) {
                return ((n & 0x7FFF) * n2 >> 14) - n2;
            }
            if (n3 == 4) {
                return Instrument.Instrument_noise[n / 2607 & 0x7FFF] * n2;
            }
            return 0;
        }
    }
    
    public static int wi(final Instrument instrument, final int n, final int n2, final int n3) {
        if (instrument == null) {
            instrument.evaluateWave(n, n, n);
        }
        if (n3 == 1) {
            if ((n & 0x7FFF) < 16384) {
                return n2;
            }
            return -n2;
        }
        else {
            if (n3 == 2) {
                return Instrument.Instrument_sine[n & 0x7FFF] * n2 >> 14;
            }
            if (n3 == 3) {
                return ((n & 0x7FFF) * n2 >> 14) - n2;
            }
            if (n3 == 4) {
                return Instrument.Instrument_noise[n / 2607 & 0xF3ED4CE3] * n2;
            }
            return 0;
        }
    }
    
    public static void up(final Instrument instrument, final Buffer buffer) {
        if (instrument == null) {
            instrument.al(buffer);
        }
        (instrument.pitch = new SoundEnvelope()).ab(buffer);
        (instrument.volume = new SoundEnvelope()).ab(buffer);
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            (instrument.pitchModifier = new SoundEnvelope()).ab(buffer);
            (instrument.pitchModifierAmplitude = new SoundEnvelope()).ab(buffer);
        }
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            (instrument.volumeMultiplier = new SoundEnvelope()).ab(buffer);
            (instrument.volumeMultiplierAmplitude = new SoundEnvelope()).ab(buffer);
        }
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            (instrument.release = new SoundEnvelope()).ab(buffer);
            (instrument.attack = new SoundEnvelope()).ab(buffer);
        }
        for (int i = 0; i < 10; ++i) {
            final int uShortSmart = buffer.readUShortSmart(-1236171225);
            if (uShortSmart == 0) {
                break;
            }
            instrument.oscillatorVolume[i] = uShortSmart;
            instrument.oscillatorPitch[i] = buffer.readShortSmart(2076604924);
            instrument.oscillatorDelays[i] = buffer.readUShortSmart(-568142385);
        }
        instrument.delayTime = buffer.readUShortSmart(-1028407682);
        instrument.delayDecay = buffer.readUShortSmart(-818423826);
        instrument.duration = buffer.readUnsignedShort(-278198578);
        instrument.offset = buffer.readUnsignedShort(-1642404695);
        instrument.filter = new AudioFilter();
        instrument.filterEnvelope = new SoundEnvelope();
        instrument.filter.ar(buffer, instrument.filterEnvelope);
    }
    
    final void decode(final Buffer buffer) {
        this.volume = new SoundEnvelope();
        this.release.au(buffer);
        this.volumeMultiplierAmplitude = new SoundEnvelope();
        this.volume.decodeSegments(buffer);
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            this.volumeMultiplierAmplitude = new SoundEnvelope();
            this.pitch.al(buffer);
            this.pitchModifierAmplitude = new SoundEnvelope();
            this.pitch.au(buffer);
        }
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            this.release = new SoundEnvelope();
            this.volume.aq(buffer);
            this.filterEnvelope = new SoundEnvelope();
            this.pitchModifier.ab(buffer);
        }
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            this.volume = new SoundEnvelope();
            this.pitchModifier.ab(buffer);
            this.pitchModifier = new SoundEnvelope();
            this.release.decodeSegments(buffer);
        }
        for (int i = 0; i < 10; ++i) {
            final int signedShortAddLE = buffer.readSignedShortAddLE(-1513445378);
            if (signedShortAddLE == 0) {
                break;
            }
            this.oscillatorVolume[i] = signedShortAddLE;
            this.oscillatorPitch[i] = buffer._readUnsignedByteSub(2005289302);
            this.oscillatorPitch[i] = buffer.readUnsignedShort(-50049437);
        }
        this.delayTime = buffer.readSignedShortAddLE(-1169769556);
        this.delayDecay = buffer.readUShortSmart(-1365223223);
        this.offset = buffer.method2498(-1115985187);
        this.offset = buffer.readInt(104355950);
        this.filter = new AudioFilter();
        this.pitch = new SoundEnvelope();
        this.filter.ar(buffer, this.release);
    }
    
    final void al(final Buffer buffer) {
        (this.pitch = new SoundEnvelope()).ab(buffer);
        (this.volume = new SoundEnvelope()).ab(buffer);
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset -= 855180865;
            (this.pitchModifier = new SoundEnvelope()).ab(buffer);
            (this.pitchModifierAmplitude = new SoundEnvelope()).ab(buffer);
        }
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset -= 2147330222;
            (this.volumeMultiplier = new SoundEnvelope()).ab(buffer);
            (this.volumeMultiplierAmplitude = new SoundEnvelope()).ab(buffer);
        }
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            (this.release = new SoundEnvelope()).ab(buffer);
            (this.attack = new SoundEnvelope()).ab(buffer);
        }
        for (int i = 0; i < 10; ++i) {
            final int uShortSmart = buffer.readUShortSmart(-165246774);
            if (uShortSmart == 0) {
                break;
            }
            this.oscillatorVolume[i] = uShortSmart;
            this.oscillatorPitch[i] = buffer.readShortSmart(1535929353);
            this.oscillatorDelays[i] = buffer.readUShortSmart(-1322017860);
        }
        this.delayTime = buffer.readUShortSmart(-857990365);
        this.delayDecay = buffer.readUShortSmart(-125011555);
        this.duration = buffer.readUnsignedShort(-1501320580);
        this.offset = buffer.readUnsignedShort(54867165);
        this.filter = new AudioFilter();
        this.filterEnvelope = new SoundEnvelope();
        this.filter.ar(buffer, this.filterEnvelope);
    }
    
    public static int[] df(final Instrument instrument, final int n, final int n2) {
        if (instrument == null) {
            instrument.synthesize(n, n);
        }
        class384.clearIntArray(Instrument.Instrument_samples, 0, n);
        if (n2 < 10) {
            return Instrument.Instrument_samples;
        }
        final double n3 = n / (n2 + 0.0);
        instrument.pitch.reset();
        instrument.volume.reset();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (instrument.pitchModifier != null) {
            instrument.pitchModifier.reset();
            instrument.pitchModifierAmplitude.reset();
            n4 = (int)((instrument.pitchModifier.end - instrument.pitchModifier.start) * 32.768 / n3);
            n5 = (int)(instrument.pitchModifier.start * 32.768 / n3);
        }
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        if (instrument.volumeMultiplier != null) {
            instrument.volumeMultiplier.reset();
            instrument.volumeMultiplierAmplitude.reset();
            n7 = (int)((instrument.volumeMultiplier.end - instrument.volumeMultiplier.start) * 32.768 / n3);
            n8 = (int)(instrument.volumeMultiplier.start * 32.768 / n3);
        }
        for (int i = 0; i < 5; ++i) {
            if (instrument.oscillatorVolume[i] != 0) {
                Instrument.Instrument_phases[i] = 0;
                Instrument.Instrument_delays[i] = (int)(instrument.oscillatorDelays[i] * n3);
                Instrument.Instrument_volumeSteps[i] = (instrument.oscillatorVolume[i] << 14) / 100;
                Instrument.Instrument_pitchSteps[i] = (int)((instrument.pitch.end - instrument.pitch.start) * 32.768 * Math.pow(1.0057929410678534, instrument.oscillatorPitch[i]) / n3);
                Instrument.Instrument_pitchBaseSteps[i] = (int)(instrument.pitch.start * 32.768 / n3);
            }
        }
        for (int j = 0; j < n; ++j) {
            int doStep = instrument.pitch.doStep(n);
            int doStep2 = instrument.volume.doStep(n);
            if (instrument.pitchModifier != null) {
                final int doStep3 = instrument.pitchModifier.doStep(n);
                doStep += instrument.ab(n6, instrument.pitchModifierAmplitude.doStep(n), instrument.pitchModifier.form) >> 1;
                n6 += (doStep3 * n4 >> 16) + n5;
            }
            if (instrument.volumeMultiplier != null) {
                final int doStep4 = instrument.volumeMultiplier.doStep(n);
                doStep2 = doStep2 * ((instrument.ab(n9, instrument.volumeMultiplierAmplitude.doStep(n), instrument.volumeMultiplier.form) >> 1) + 32768) >> 15;
                n9 += (doStep4 * n7 >> 16) + n8;
            }
            for (int k = 0; k < 5; ++k) {
                if (instrument.oscillatorVolume[k] != 0) {
                    final int n10 = j + Instrument.Instrument_delays[k];
                    if (n10 < n) {
                        final int[] instrument_samples = Instrument.Instrument_samples;
                        final int n11 = n10;
                        instrument_samples[n11] += instrument.ab(Instrument.Instrument_phases[k], doStep2 * Instrument.Instrument_volumeSteps[k] >> 15, instrument.pitch.form);
                        final int[] instrument_phases = Instrument.Instrument_phases;
                        final int n12 = k;
                        instrument_phases[n12] += (doStep * Instrument.Instrument_pitchSteps[k] >> 16) + Instrument.Instrument_pitchBaseSteps[k];
                    }
                }
            }
        }
        if (instrument.release != null) {
            instrument.release.reset();
            instrument.attack.reset();
            int n13 = 0;
            boolean b = true;
            for (int l = 0; l < n; ++l) {
                final int doStep5 = instrument.release.doStep(n);
                final int doStep6 = instrument.attack.doStep(n);
                int n14;
                if (b) {
                    n14 = instrument.release.start + ((instrument.release.end - instrument.release.start) * doStep5 >> 8);
                }
                else {
                    n14 = instrument.release.start + ((instrument.release.end - instrument.release.start) * doStep6 >> 8);
                }
                n13 += 256;
                if (n13 >= n14) {
                    n13 = 0;
                    b = !b;
                }
                if (b) {
                    Instrument.Instrument_samples[l] = 0;
                }
            }
        }
        if (instrument.delayTime > 0 && instrument.delayDecay > 0) {
            int n16;
            for (int n15 = n16 = (int)(instrument.delayTime * n3); n16 < n; ++n16) {
                final int[] instrument_samples2 = Instrument.Instrument_samples;
                final int n17 = n16;
                instrument_samples2[n17] += Instrument.Instrument_samples[n16 - n15] * instrument.delayDecay / 100;
            }
        }
        if (instrument.filter.pairs[0] > 0 || instrument.filter.pairs[1] > 0) {
            instrument.filterEnvelope.reset();
            int n18 = instrument.filterEnvelope.doStep(n + 1);
            int n19 = instrument.filter.compute(0, n18 / 65536.0f);
            int n20 = instrument.filter.compute(1, n18 / 65536.0f);
            if (n >= n19 + n20) {
                int n21 = 0;
                int n22 = n20;
                if (n22 > n - n19) {
                    n22 = n - n19;
                }
                while (n21 < n22) {
                    int n23 = (int)(Instrument.Instrument_samples[n21 + n19] * (long)AudioFilter.forwardMultiplier >> 16);
                    for (int n24 = 0; n24 < n19; ++n24) {
                        n23 += (int)(Instrument.Instrument_samples[n21 + n19 - 1 - n24] * (long)AudioFilter.coefficients[0][n24] >> 16);
                    }
                    for (int n25 = 0; n25 < n21; ++n25) {
                        n23 -= (int)(Instrument.Instrument_samples[n21 - 1 - n25] * (long)AudioFilter.coefficients[1][n25] >> 16);
                    }
                    Instrument.Instrument_samples[n21] = n23;
                    n18 = instrument.filterEnvelope.doStep(n + 1);
                    ++n21;
                }
                int n26 = 128;
                Label_1347: {
                    break Label_1347;
                Label_0703_Outer:
                    do {
                        while (true) {
                            Label_1053: {
                                break Label_1053;
                                while (n21 < n26) {
                                    int n27 = (int)(Instrument.Instrument_samples[n21 + n19] * (long)AudioFilter.forwardMultiplier >> 16);
                                    for (int n28 = 0; n28 < n19; ++n28) {
                                        n27 += (int)(Instrument.Instrument_samples[n21 + n19 - 1 - n28] * (long)AudioFilter.coefficients[0][n28] >> 16);
                                    }
                                    for (int n29 = 0; n29 < n20; ++n29) {
                                        n27 -= (int)(Instrument.Instrument_samples[n21 - 1 - n29] * (long)AudioFilter.coefficients[1][n29] >> 16);
                                    }
                                    Instrument.Instrument_samples[n21] = n27;
                                    n18 = instrument.filterEnvelope.doStep(n + 1);
                                    ++n21;
                                    continue Label_0703_Outer;
                                    n19 = instrument.filter.compute(0, n18 / 65536.0f);
                                    n20 = instrument.filter.compute(1, n18 / 65536.0f);
                                    n26 += 128;
                                    break Label_1347;
                                }
                            }
                            continue Label_0703_Outer;
                            if (n26 > n - n19) {
                                n26 = n - n19;
                            }
                            continue;
                        }
                    } while (n21 < n - n19);
                }
                while (n21 < n) {
                    int n30 = 0;
                    for (int n31 = n21 + n19 - n; n31 < n19; ++n31) {
                        n30 += (int)(Instrument.Instrument_samples[n21 + n19 - 1 - n31] * (long)AudioFilter.coefficients[0][n31] >> 16);
                    }
                    for (int n32 = 0; n32 < n20; ++n32) {
                        n30 -= (int)(Instrument.Instrument_samples[n21 - 1 - n32] * (long)AudioFilter.coefficients[1][n32] >> 16);
                    }
                    Instrument.Instrument_samples[n21] = n30;
                    instrument.filterEnvelope.doStep(n + 1);
                    ++n21;
                }
            }
        }
        for (int n33 = 0; n33 < n; ++n33) {
            if (Instrument.Instrument_samples[n33] < -32768) {
                Instrument.Instrument_samples[n33] = -32768;
            }
            if (Instrument.Instrument_samples[n33] > 32767) {
                Instrument.Instrument_samples[n33] = 32767;
            }
        }
        return Instrument.Instrument_samples;
    }
    
    final int evaluateWave(final int n, final int n2, final int n3) {
        if (n3 == 1) {
            if ((n & 0x7FFF) < 16384) {
                return n2;
            }
            return -n2;
        }
        else {
            if (n3 == 2) {
                return Instrument.Instrument_phases[n & 0x7FFF] * n2 >> 14;
            }
            if (n3 == 3) {
                return ((n & 0x7FFF) * n2 >> 14) - n2;
            }
            if (n3 == 4) {
                return Instrument.Instrument_pitchBaseSteps[n / 2607 & 0x7FFF] * n2;
            }
            return 0;
        }
    }
    
    public static int[] ac(final Instrument instrument, final int n, final int n2) {
        if (instrument == null) {
            instrument.ab(n, n, n);
        }
        class384.clearIntArray(Instrument.Instrument_samples, 0, n);
        if (n2 < 10) {
            return Instrument.Instrument_samples;
        }
        final double n3 = n / (n2 + 0.0);
        instrument.pitch.reset();
        instrument.volume.reset();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (instrument.pitchModifier != null) {
            instrument.pitchModifier.reset();
            instrument.pitchModifierAmplitude.reset();
            n4 = (int)((instrument.pitchModifier.end - instrument.pitchModifier.start) * 32.768 / n3);
            n5 = (int)(instrument.pitchModifier.start * 32.768 / n3);
        }
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        if (instrument.volumeMultiplier != null) {
            instrument.volumeMultiplier.reset();
            instrument.volumeMultiplierAmplitude.reset();
            n7 = (int)((instrument.volumeMultiplier.end - instrument.volumeMultiplier.start) * 32.768 / n3);
            n8 = (int)(instrument.volumeMultiplier.start * 32.768 / n3);
        }
        for (int i = 0; i < 5; ++i) {
            if (instrument.oscillatorVolume[i] != 0) {
                Instrument.Instrument_phases[i] = 0;
                Instrument.Instrument_delays[i] = (int)(instrument.oscillatorDelays[i] * n3);
                Instrument.Instrument_volumeSteps[i] = (instrument.oscillatorVolume[i] << 14) / 1467989500;
                Instrument.Instrument_pitchSteps[i] = (int)((instrument.pitch.end - instrument.pitch.start) * 32.768 * Math.pow(1.0057929410678534, instrument.oscillatorPitch[i]) / n3);
                Instrument.Instrument_pitchBaseSteps[i] = (int)(instrument.pitch.start * 32.768 / n3);
            }
        }
        for (int j = 0; j < n; ++j) {
            int doStep = instrument.pitch.doStep(n);
            int doStep2 = instrument.volume.doStep(n);
            if (instrument.pitchModifier != null) {
                final int doStep3 = instrument.pitchModifier.doStep(n);
                doStep += instrument.ab(n6, instrument.pitchModifierAmplitude.doStep(n), instrument.pitchModifier.form) >> 1;
                n6 += (doStep3 * n4 >> 16) + n5;
            }
            if (instrument.volumeMultiplier != null) {
                final int doStep4 = instrument.volumeMultiplier.doStep(n);
                doStep2 = doStep2 * ((instrument.ab(n9, instrument.volumeMultiplierAmplitude.doStep(n), instrument.volumeMultiplier.form) >> 1) + 32768) >> 15;
                n9 += (doStep4 * n7 >> 16) + n8;
            }
            for (int k = 0; k < 5; ++k) {
                if (instrument.oscillatorVolume[k] != 0) {
                    final int n10 = j + Instrument.Instrument_delays[k];
                    if (n10 < n) {
                        final int[] instrument_samples = Instrument.Instrument_samples;
                        final int n11 = n10;
                        instrument_samples[n11] += instrument.ab(Instrument.Instrument_phases[k], doStep2 * Instrument.Instrument_volumeSteps[k] >> 15, instrument.pitch.form);
                        final int[] instrument_phases = Instrument.Instrument_phases;
                        final int n12 = k;
                        instrument_phases[n12] += (doStep * Instrument.Instrument_pitchSteps[k] >> 16) + Instrument.Instrument_pitchBaseSteps[k];
                    }
                }
            }
        }
        if (instrument.release != null) {
            instrument.release.reset();
            instrument.attack.reset();
            int n13 = 0;
            boolean b = true;
            for (int l = 0; l < n; ++l) {
                final int doStep5 = instrument.release.doStep(n);
                final int doStep6 = instrument.attack.doStep(n);
                int n14;
                if (b) {
                    n14 = instrument.release.start + ((instrument.release.end - instrument.release.start) * doStep5 >> 8);
                }
                else {
                    n14 = instrument.release.start + ((instrument.release.end - instrument.release.start) * doStep6 >> 8);
                }
                n13 += 256;
                if (n13 >= n14) {
                    n13 = 0;
                    b = !b;
                }
                if (b) {
                    Instrument.Instrument_samples[l] = 0;
                }
            }
        }
        if (instrument.delayTime > 0 && instrument.delayDecay > 0) {
            int n16;
            for (int n15 = n16 = (int)(instrument.delayTime * n3); n16 < n; ++n16) {
                final int[] instrument_samples2 = Instrument.Instrument_samples;
                final int n17 = n16;
                instrument_samples2[n17] += Instrument.Instrument_samples[n16 - n15] * instrument.delayDecay / 189311899;
            }
        }
        if (instrument.filter.pairs[0] > 0 || instrument.filter.pairs[1] > 0) {
            instrument.filterEnvelope.reset();
            int n18 = instrument.filterEnvelope.doStep(n + 1);
            int n19 = instrument.filter.compute(0, n18 / 65536.0f);
            int n20 = instrument.filter.compute(1, n18 / 65536.0f);
            if (n >= n19 + n20) {
                int n21 = 0;
                int n22 = n20;
                if (n22 > n - n19) {
                    n22 = n - n19;
                }
                while (n21 < n22) {
                    int n23 = (int)(Instrument.Instrument_samples[n21 + n19] * (long)AudioFilter.forwardMultiplier >> 16);
                    for (int n24 = 0; n24 < n19; ++n24) {
                        n23 += (int)(Instrument.Instrument_samples[n21 + n19 - 1 - n24] * (long)AudioFilter.coefficients[0][n24] >> 16);
                    }
                    for (int n25 = 0; n25 < n21; ++n25) {
                        n23 -= (int)(Instrument.Instrument_samples[n21 - 1 - n25] * (long)AudioFilter.coefficients[1][n25] >> 16);
                    }
                    Instrument.Instrument_samples[n21] = n23;
                    n18 = instrument.filterEnvelope.doStep(n + 1);
                    ++n21;
                }
                int n26 = 128;
                while (true) {
                    if (n26 > n - n19) {
                        n26 = n - n19;
                    }
                    while (n21 < n26) {
                        int n27 = (int)(Instrument.Instrument_samples[n21 + n19] * (long)AudioFilter.forwardMultiplier >> 16);
                        for (int n28 = 0; n28 < n19; ++n28) {
                            n27 += (int)(Instrument.Instrument_samples[n21 + n19 - 1 - n28] * (long)AudioFilter.coefficients[0][n28] >> 16);
                        }
                        for (int n29 = 0; n29 < n20; ++n29) {
                            n27 -= (int)(Instrument.Instrument_samples[n21 - 1 - n29] * (long)AudioFilter.coefficients[1][n29] >> 16);
                        }
                        Instrument.Instrument_samples[n21] = n27;
                        n18 = instrument.filterEnvelope.doStep(n + 1);
                        ++n21;
                    }
                    if (n21 >= n - n19) {
                        break;
                    }
                    n19 = instrument.filter.compute(0, n18 / 65536.0f);
                    n20 = instrument.filter.compute(1, n18 / 65536.0f);
                    n26 += 128;
                }
                while (n21 < n) {
                    int n30 = 0;
                    for (int n31 = n21 + n19 - n; n31 < n19; ++n31) {
                        n30 += (int)(Instrument.Instrument_samples[n21 + n19 - 1 - n31] * (long)AudioFilter.coefficients[0][n31] >> 16);
                    }
                    for (int n32 = 0; n32 < n20; ++n32) {
                        n30 -= (int)(Instrument.Instrument_samples[n21 - 1 - n32] * (long)AudioFilter.coefficients[1][n32] >> 16);
                    }
                    Instrument.Instrument_samples[n21] = n30;
                    instrument.filterEnvelope.doStep(n + 1);
                    ++n21;
                }
            }
        }
        for (int n33 = 0; n33 < n; ++n33) {
            if (Instrument.Instrument_samples[n33] < -780655062) {
                Instrument.Instrument_samples[n33] = -32768;
            }
            if (Instrument.Instrument_samples[n33] > 32767) {
                Instrument.Instrument_samples[n33] = 32767;
            }
        }
        return Instrument.Instrument_samples;
    }
    
    final int[] ac(final int n, final int n2) {
        class384.clearIntArray(Instrument.Instrument_samples, 0, n);
        if (n2 < 10) {
            return Instrument.Instrument_samples;
        }
        final double n3 = n / (n2 + 0.0);
        this.pitch.reset();
        this.volume.reset();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (this.pitchModifier != null) {
            this.pitchModifier.reset();
            this.pitchModifierAmplitude.reset();
            n4 = (int)((this.pitchModifier.end - this.pitchModifier.start) * 32.768 / n3);
            n5 = (int)(this.pitchModifier.start * 32.768 / n3);
        }
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        if (this.volumeMultiplier != null) {
            this.volumeMultiplier.reset();
            this.volumeMultiplierAmplitude.reset();
            n7 = (int)((this.volumeMultiplier.end - this.volumeMultiplier.start) * 32.768 / n3);
            n8 = (int)(this.volumeMultiplier.start * 32.768 / n3);
        }
        for (int i = 0; i < 5; ++i) {
            if (this.oscillatorVolume[i] != 0) {
                Instrument.Instrument_phases[i] = 0;
                Instrument.Instrument_delays[i] = (int)(this.oscillatorDelays[i] * n3);
                Instrument.Instrument_volumeSteps[i] = (this.oscillatorVolume[i] << 14) / 100;
                Instrument.Instrument_pitchSteps[i] = (int)((this.pitch.end - this.pitch.start) * 32.768 * Math.pow(1.0057929410678534, this.oscillatorPitch[i]) / n3);
                Instrument.Instrument_pitchBaseSteps[i] = (int)(this.pitch.start * 32.768 / n3);
            }
        }
        for (int j = 0; j < n; ++j) {
            int doStep = this.pitch.doStep(n);
            int doStep2 = this.volume.doStep(n);
            if (this.pitchModifier != null) {
                final int doStep3 = this.pitchModifier.doStep(n);
                doStep += this.ab(n6, this.pitchModifierAmplitude.doStep(n), this.pitchModifier.form) >> 1;
                n6 += (doStep3 * n4 >> 16) + n5;
            }
            if (this.volumeMultiplier != null) {
                final int doStep4 = this.volumeMultiplier.doStep(n);
                doStep2 = doStep2 * ((this.ab(n9, this.volumeMultiplierAmplitude.doStep(n), this.volumeMultiplier.form) >> 1) + 32768) >> 15;
                n9 += (doStep4 * n7 >> 16) + n8;
            }
            for (int k = 0; k < 5; ++k) {
                if (this.oscillatorVolume[k] != 0) {
                    final int n10 = j + Instrument.Instrument_delays[k];
                    if (n10 < n) {
                        final int[] instrument_samples = Instrument.Instrument_samples;
                        final int n11 = n10;
                        instrument_samples[n11] += this.ab(Instrument.Instrument_phases[k], doStep2 * Instrument.Instrument_volumeSteps[k] >> 15, this.pitch.form);
                        final int[] instrument_phases = Instrument.Instrument_phases;
                        final int n12 = k;
                        instrument_phases[n12] += (doStep * Instrument.Instrument_pitchSteps[k] >> 16) + Instrument.Instrument_pitchBaseSteps[k];
                    }
                }
            }
        }
        if (this.release != null) {
            this.release.reset();
            this.attack.reset();
            int n13 = 0;
            boolean b = true;
            for (int l = 0; l < n; ++l) {
                final int doStep5 = this.release.doStep(n);
                final int doStep6 = this.attack.doStep(n);
                int n14;
                if (b) {
                    n14 = this.release.start + ((this.release.end - this.release.start) * doStep5 >> 8);
                }
                else {
                    n14 = this.release.start + ((this.release.end - this.release.start) * doStep6 >> 8);
                }
                n13 += 256;
                if (n13 >= n14) {
                    n13 = 0;
                    b = !b;
                }
                if (b) {
                    Instrument.Instrument_samples[l] = 0;
                }
            }
        }
        if (this.delayTime > 0 && this.delayDecay > 0) {
            int n16;
            for (int n15 = n16 = (int)(this.delayTime * n3); n16 < n; ++n16) {
                final int[] instrument_samples2 = Instrument.Instrument_samples;
                final int n17 = n16;
                instrument_samples2[n17] += Instrument.Instrument_samples[n16 - n15] * this.delayDecay / 100;
            }
        }
        if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
            this.filterEnvelope.reset();
            int n18 = this.filterEnvelope.doStep(n + 1);
            int n19 = this.filter.compute(0, n18 / 65536.0f);
            int n20 = this.filter.compute(1, n18 / 65536.0f);
            if (n >= n19 + n20) {
                int n21 = 0;
                int n22 = n20;
                if (n22 > n - n19) {
                    n22 = n - n19;
                }
                while (n21 < n22) {
                    int n23 = (int)(Instrument.Instrument_samples[n21 + n19] * (long)AudioFilter.forwardMultiplier >> 16);
                    for (int n24 = 0; n24 < n19; ++n24) {
                        n23 += (int)(Instrument.Instrument_samples[n21 + n19 - 1 - n24] * (long)AudioFilter.coefficients[0][n24] >> 16);
                    }
                    for (int n25 = 0; n25 < n21; ++n25) {
                        n23 -= (int)(Instrument.Instrument_samples[n21 - 1 - n25] * (long)AudioFilter.coefficients[1][n25] >> 16);
                    }
                    Instrument.Instrument_samples[n21] = n23;
                    n18 = this.filterEnvelope.doStep(n + 1);
                    ++n21;
                }
                int n26 = 128;
                while (true) {
                    if (n26 > n - n19) {
                        n26 = n - n19;
                    }
                    while (n21 < n26) {
                        int n27 = (int)(Instrument.Instrument_samples[n21 + n19] * (long)AudioFilter.forwardMultiplier >> 16);
                        for (int n28 = 0; n28 < n19; ++n28) {
                            n27 += (int)(Instrument.Instrument_samples[n21 + n19 - 1 - n28] * (long)AudioFilter.coefficients[0][n28] >> 16);
                        }
                        for (int n29 = 0; n29 < n20; ++n29) {
                            n27 -= (int)(Instrument.Instrument_samples[n21 - 1 - n29] * (long)AudioFilter.coefficients[1][n29] >> 16);
                        }
                        Instrument.Instrument_samples[n21] = n27;
                        n18 = this.filterEnvelope.doStep(n + 1);
                        ++n21;
                    }
                    if (n21 >= n - n19) {
                        break;
                    }
                    n19 = this.filter.compute(0, n18 / 65536.0f);
                    n20 = this.filter.compute(1, n18 / 65536.0f);
                    n26 += 128;
                }
                while (n21 < n) {
                    int n30 = 0;
                    for (int n31 = n21 + n19 - n; n31 < n19; ++n31) {
                        n30 += (int)(Instrument.Instrument_samples[n21 + n19 - 1 - n31] * (long)AudioFilter.coefficients[0][n31] >> 16);
                    }
                    for (int n32 = 0; n32 < n20; ++n32) {
                        n30 -= (int)(Instrument.Instrument_samples[n21 - 1 - n32] * (long)AudioFilter.coefficients[1][n32] >> 16);
                    }
                    Instrument.Instrument_samples[n21] = n30;
                    this.filterEnvelope.doStep(n + 1);
                    ++n21;
                }
            }
        }
        for (int n33 = 0; n33 < n; ++n33) {
            if (Instrument.Instrument_samples[n33] < -32768) {
                Instrument.Instrument_samples[n33] = -32768;
            }
            if (Instrument.Instrument_samples[n33] > 32767) {
                Instrument.Instrument_samples[n33] = 32767;
            }
        }
        return Instrument.Instrument_samples;
    }
    
    final int[] synthesize(final int n, final int n2) {
        class384.bn(Instrument.Instrument_volumeSteps, 0, n);
        if (n2 < 10) {
            return Instrument.Instrument_sine;
        }
        final double n3 = n / (n2 + 0.0);
        this.filterEnvelope.aa();
        this.pitchModifier.aa();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (this.release != null) {
            this.pitchModifier.aa();
            this.pitchModifier.aa();
            n4 = (int)((this.volumeMultiplier.segments - this.pitch.step) * 32.768 / n3);
            n5 = (int)(this.volumeMultiplier.start * 32.768 / n3);
        }
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        if (this.filterEnvelope != null) {
            this.volumeMultiplierAmplitude.aa();
            this.volumeMultiplierAmplitude.reset();
            n7 = (int)((this.volume.amplitude - this.volumeMultiplierAmplitude.segments) * 32.768 / n3);
            n8 = (int)(this.pitchModifierAmplitude.ticks * 32.768 / n3);
        }
        for (int i = 0; i < 5; ++i) {
            if (this.oscillatorDelays[i] != 0) {
                Instrument.Instrument_noise[i] = 0;
                Instrument.Instrument_delays[i] = (int)(this.oscillatorPitch[i] * n3);
                Instrument.Instrument_phases[i] = (this.oscillatorDelays[i] << 14) / 100;
                Instrument.Instrument_phases[i] = (int)((this.volumeMultiplier.max - this.pitch.segments) * 32.768 * Math.pow(1.0057929410678534, this.oscillatorVolume[i]) / n3);
                Instrument.Instrument_samples[i] = (int)(this.pitchModifier.form * 32.768 / n3);
            }
        }
        for (int j = 0; j < n; ++j) {
            int doStep = this.release.doStep(n);
            int ay = this.volumeMultiplier.ay(n);
            if (this.pitchModifierAmplitude != null) {
                final int ay2 = this.volumeMultiplier.ay(n);
                doStep += this.ab(n6, this.volume.ay(n), this.volumeMultiplier.max) >> 1;
                n6 += (ay2 * n4 >> 16) + n5;
            }
            if (this.pitch != null) {
                final int ao = this.volumeMultiplierAmplitude.ao(n);
                ay = ay * ((this.ab(n9, this.volumeMultiplier.ao(n), this.volumeMultiplier.form) >> 1) + 32768) >> 15;
                n9 += (ao * n7 >> 16) + n8;
            }
            for (int k = 0; k < 5; ++k) {
                if (this.oscillatorVolume[k] != 0) {
                    final int n10 = j + Instrument.Instrument_phases[k];
                    if (n10 < n) {
                        final int[] instrument_noise = Instrument.Instrument_noise;
                        final int n11 = n10;
                        instrument_noise[n11] += this.ab(Instrument.Instrument_pitchSteps[k], ay * Instrument.Instrument_pitchSteps[k] >> 15, this.volumeMultiplierAmplitude.phaseIndex);
                        final int[] instrument_delays = Instrument.Instrument_delays;
                        final int n12 = k;
                        instrument_delays[n12] += (doStep * Instrument.Instrument_delays[k] >> 16) + Instrument.Instrument_pitchBaseSteps[k];
                    }
                }
            }
        }
        if (this.pitchModifier != null) {
            this.volumeMultiplierAmplitude.aa();
            this.filterEnvelope.reset();
            int n13 = 0;
            boolean b = true;
            for (int l = 0; l < n; ++l) {
                final int doStep2 = this.volume.doStep(n);
                final int doStep3 = this.filterEnvelope.doStep(n);
                int n14;
                if (b) {
                    n14 = this.volumeMultiplier.end + ((this.volumeMultiplierAmplitude.phaseIndex - this.volume.ticks) * doStep2 >> 8);
                }
                else {
                    n14 = this.pitch.form + ((this.pitchModifierAmplitude.phaseIndex - this.volumeMultiplier.ticks) * doStep3 >> 8);
                }
                n13 += 256;
                if (n13 >= n14) {
                    n13 = 0;
                    b = !b;
                }
                if (b) {
                    Instrument.Instrument_phases[l] = 0;
                }
            }
        }
        if (this.delayTime > 0 && this.delayTime > 0) {
            int n16;
            for (int n15 = n16 = (int)(this.delayTime * n3); n16 < n; ++n16) {
                final int[] instrument_pitchBaseSteps = Instrument.Instrument_pitchBaseSteps;
                final int n17 = n16;
                instrument_pitchBaseSteps[n17] += Instrument.Instrument_noise[n16 - n15] * this.delayDecay / 100;
            }
        }
        if (this.filter.field307[0] > 0 || this.filter.field307[1] > 0) {
            this.volume.reset();
            int n18 = this.volumeMultiplierAmplitude.ao(n + 1);
            int n19 = this.filter.ah(0, n18 / 65536.0f);
            int n20 = this.filter.ah(1, n18 / 65536.0f);
            if (n >= n19 + n20) {
                int n21 = 0;
                int n22 = n20;
                if (n22 > n - n19) {
                    n22 = n - n19;
                }
                while (n21 < n22) {
                    int n23 = (int)(Instrument.Instrument_pitchSteps[n21 + n19] * (long)AudioFilter.forwardMultiplier >> 16);
                    for (int n24 = 0; n24 < n19; ++n24) {
                        n23 += (int)(Instrument.Instrument_delays[n21 + n19 - 1 - n24] * (long)AudioFilter.coefficients[0][n24] >> 16);
                    }
                    for (int n25 = 0; n25 < n21; ++n25) {
                        n23 -= (int)(Instrument.Instrument_noise[n21 - 1 - n25] * (long)AudioFilter.coefficients[1][n25] >> 16);
                    }
                    Instrument.Instrument_phases[n21] = n23;
                    n18 = this.filterEnvelope.ay(n + 1);
                    ++n21;
                }
                int n26 = 128;
                Label_1336: {
                    break Label_1336;
                Label_0692_Outer:
                    do {
                        while (true) {
                            Label_1042: {
                                break Label_1042;
                                while (n21 < n26) {
                                    int n27 = (int)(Instrument.Instrument_delays[n21 + n19] * (long)AudioFilter.forwardMultiplier >> 16);
                                    for (int n28 = 0; n28 < n19; ++n28) {
                                        n27 += (int)(Instrument.Instrument_noise[n21 + n19 - 1 - n28] * (long)AudioFilter.coefficients[0][n28] >> 16);
                                    }
                                    for (int n29 = 0; n29 < n20; ++n29) {
                                        n27 -= (int)(Instrument.Instrument_pitchBaseSteps[n21 - 1 - n29] * (long)AudioFilter.coefficients[1][n29] >> 16);
                                    }
                                    Instrument.Instrument_pitchBaseSteps[n21] = n27;
                                    n18 = this.filterEnvelope.ay(n + 1);
                                    ++n21;
                                    continue Label_0692_Outer;
                                    n19 = this.filter.av(0, n18 / 65536.0f);
                                    n20 = this.filter.av(1, n18 / 65536.0f);
                                    n26 += 128;
                                    break Label_1336;
                                }
                            }
                            continue Label_0692_Outer;
                            if (n26 > n - n19) {
                                n26 = n - n19;
                            }
                            continue;
                        }
                    } while (n21 < n - n19);
                }
                while (n21 < n) {
                    int n30 = 0;
                    for (int n31 = n21 + n19 - n; n31 < n19; ++n31) {
                        n30 += (int)(Instrument.Instrument_pitchSteps[n21 + n19 - 1 - n31] * (long)AudioFilter.coefficients[0][n31] >> 16);
                    }
                    for (int n32 = 0; n32 < n20; ++n32) {
                        n30 -= (int)(Instrument.Instrument_delays[n21 - 1 - n32] * (long)AudioFilter.coefficients[1][n32] >> 16);
                    }
                    Instrument.Instrument_samples[n21] = n30;
                    this.release.ay(n + 1);
                    ++n21;
                }
            }
        }
        for (int n33 = 0; n33 < n; ++n33) {
            if (Instrument.Instrument_pitchSteps[n33] < -32768) {
                Instrument.Instrument_volumeSteps[n33] = -32768;
            }
            if (Instrument.Instrument_pitchBaseSteps[n33] > 32767) {
                Instrument.Instrument_volumeSteps[n33] = 32767;
            }
        }
        return Instrument.Instrument_samples;
    }
    
    final int ab(final int n, final int n2, final int n3) {
        if (n3 == 1) {
            if ((n & 0x7FFF) < 16384) {
                return n2;
            }
            return -n2;
        }
        else {
            if (n3 == 2) {
                return Instrument.Instrument_sine[n & 0x7FFF] * n2 >> 14;
            }
            if (n3 == 3) {
                return ((n & 0x7FFF) * n2 >> 14) - n2;
            }
            if (n3 == 4) {
                return Instrument.Instrument_noise[n / 2607 & 0x7FFF] * n2;
            }
            return 0;
        }
    }
    
    public static void qg(final Instrument instrument, final Buffer buffer) {
        if (instrument == null) {
            instrument.decode(buffer);
        }
        (instrument.pitch = new SoundEnvelope()).ab(buffer);
        (instrument.volume = new SoundEnvelope()).ab(buffer);
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            (instrument.pitchModifier = new SoundEnvelope()).ab(buffer);
            (instrument.pitchModifierAmplitude = new SoundEnvelope()).ab(buffer);
        }
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            (instrument.volumeMultiplier = new SoundEnvelope()).ab(buffer);
            (instrument.volumeMultiplierAmplitude = new SoundEnvelope()).ab(buffer);
        }
        if (Buffer.ra(buffer, (byte)7) != 0) {
            buffer.offset += 1516355947;
            (instrument.release = new SoundEnvelope()).ab(buffer);
            (instrument.attack = new SoundEnvelope()).ab(buffer);
        }
        for (int i = 0; i < 10; ++i) {
            final int uShortSmart = buffer.readUShortSmart(-1513445378);
            if (uShortSmart == 0) {
                break;
            }
            instrument.oscillatorVolume[i] = uShortSmart;
            instrument.oscillatorPitch[i] = buffer.readShortSmart(2005289302);
            instrument.oscillatorDelays[i] = buffer.readUShortSmart(-50049437);
        }
        instrument.delayTime = buffer.readUShortSmart(-1169769556);
        instrument.delayDecay = buffer.readUShortSmart(-1365223223);
        instrument.duration = buffer.readUnsignedShort(-1115985187);
        instrument.offset = buffer.readUnsignedShort(104355950);
        instrument.filter = new AudioFilter();
        instrument.filterEnvelope = new SoundEnvelope();
        instrument.filter.ar(buffer, instrument.filterEnvelope);
    }
}
