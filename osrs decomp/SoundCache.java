// 
// Decompiled by Procyon v0.5.36
// 

public class SoundCache
{
    AbstractArchive soundEffectIndex;
    NodeHashTable musicSamples;
    static final int ay = 10;
    NodeHashTable rawSounds;
    static final String bp = "oldschool";
    AbstractArchive musicSampleIndex;
    static final int ai = 11;
    
    public SoundCache(final AbstractArchive musicSampleIndex, final AbstractArchive soundEffectIndex) {
        this.musicSamples = new NodeHashTable(256);
        this.rawSounds = new NodeHashTable(256);
        this.musicSampleIndex = musicSampleIndex;
        this.soundEffectIndex = soundEffectIndex;
    }
    
    public RawSound ay(final int n, final int[] array) {
        if (this.soundEffectIndex.getGroupCount(-1607444587) == 1) {
            return this.getMusicSample0(0, n, array, (byte)84);
        }
        if (this.soundEffectIndex.getGroupFileCount(n, (byte)73) == 1) {
            return this.getMusicSample0(n, 0, array, (byte)18);
        }
        throw new RuntimeException();
    }
    
    public RawSound getSoundEffect(final int n, final int[] array, final int n2) {
        try {
            if (this.musicSampleIndex.getGroupCount(-324919451) == 1) {
                if (n2 >= 1686349829) {
                    throw new IllegalStateException();
                }
                return this.getSoundEffect0(0, n, array, -1986343683);
            }
            else {
                if (this.musicSampleIndex.getGroupFileCount(n, (byte)105) != 1) {
                    throw new RuntimeException();
                }
                if (n2 >= 1686349829) {
                    throw new IllegalStateException();
                }
                return this.getSoundEffect0(n, 0, array, -1115909998);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ba.aw(" + ')');
        }
    }
    
    public RawSound al(final int n, final int[] array) {
        if (this.musicSampleIndex.getGroupCount(541504899) == 1) {
            return this.getSoundEffect0(0, n, array, -1967741989);
        }
        if (this.musicSampleIndex.getGroupFileCount(n, (byte)6) == 1) {
            return this.getSoundEffect0(n, 0, array, -1848935474);
        }
        throw new RuntimeException();
    }
    
    public static RawSound getMusicSample0(final SoundCache soundCache, final int n, final int n2, final int[] array) {
        if (soundCache == null) {
            return soundCache.getSoundEffect0(n, n, array, n);
        }
        final long n3 = (long)((n2 ^ ((n << 4 & 0xFFFF) | n >>> 12)) | n << 16) ^ 0x100000000L;
        final RawSound rawSound = (RawSound)soundCache.rawSounds.at(n3);
        if (null != rawSound) {
            return rawSound;
        }
        if (array != null && array[0] <= 0) {
            return null;
        }
        VorbisSample musicSample = (VorbisSample)soundCache.musicSamples.at(n3);
        if (null == musicSample) {
            musicSample = VorbisSample.readMusicSample(soundCache.soundEffectIndex, n, n2);
            if (musicSample == null) {
                return null;
            }
            soundCache.musicSamples.put(musicSample, n3);
        }
        final RawSound rawSound2 = musicSample.toRawSound(array);
        if (rawSound2 == null) {
            return null;
        }
        musicSample.hw();
        soundCache.rawSounds.put(rawSound2, n3);
        return rawSound2;
    }
    
    RawSound getMusicSample0(final int n, final int n2, final int[] array, final byte b) {
        try {
            final long n3 = (long)((n2 ^ ((n << 4 & 0xFFFF) | n >>> 12)) | n << 16) ^ 0x100000000L;
            final RawSound rawSound = (RawSound)this.rawSounds.at(n3);
            if (null != rawSound) {
                if (b <= -1) {
                    throw new IllegalStateException();
                }
                return rawSound;
            }
            else {
                if (array != null && array[0] <= 0) {
                    return null;
                }
                VorbisSample musicSample = (VorbisSample)this.musicSamples.at(n3);
                if (null == musicSample) {
                    if (b <= -1) {
                        throw new IllegalStateException();
                    }
                    musicSample = VorbisSample.readMusicSample(this.soundEffectIndex, n, n2);
                    if (musicSample == null) {
                        if (b <= -1) {
                            throw new IllegalStateException();
                        }
                        return null;
                    }
                    else {
                        this.musicSamples.put(musicSample, n3);
                    }
                }
                final RawSound rawSound2 = musicSample.toRawSound(array);
                if (rawSound2 != null) {
                    musicSample.hw();
                    this.rawSounds.put(rawSound2, n3);
                    return rawSound2;
                }
                if (b <= -1) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ba.an(" + ')');
        }
    }
    
    public RawSound getMusicSample(final int n, final int[] array, final int n2) {
        try {
            if (this.soundEffectIndex.getGroupCount(-596791499) == 1) {
                if (n2 == -1450505922) {
                    throw new IllegalStateException();
                }
                return this.getMusicSample0(0, n, array, (byte)7);
            }
            else {
                if (this.soundEffectIndex.getGroupFileCount(n, (byte)80) == 1) {
                    return this.getMusicSample0(n, 0, array, (byte)66);
                }
                throw new RuntimeException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ba.ac(" + ')');
        }
    }
    
    RawSound au(final int n, final int n2, final int[] array) {
        final long n3 = (n2 ^ ((n << 4 & 0xFFFF) | n >>> 12)) | n << 16;
        final RawSound rawSound = (RawSound)this.rawSounds.at(n3);
        if (rawSound != null) {
            return rawSound;
        }
        if (null != array && array[0] <= 0) {
            return null;
        }
        final SoundEffect soundEffect = SoundEffect.readSoundEffect(this.musicSampleIndex, n, n2);
        if (soundEffect == null) {
            return null;
        }
        final RawSound rawSound2 = soundEffect.toRawSound();
        this.rawSounds.put(rawSound2, n3);
        if (array != null) {
            final int n4 = 0;
            array[n4] -= rawSound2.samples.length;
        }
        return rawSound2;
    }
    
    public RawSound aa(final int n, final int[] array) {
        if (this.musicSampleIndex.getGroupCount(107866659) == 1) {
            return this.getSoundEffect0(0, n, array, -1425077996);
        }
        if (this.musicSampleIndex.getGroupFileCount(n, (byte)50) == 1) {
            return this.getSoundEffect0(n, 0, array, -1308302013);
        }
        throw new RuntimeException();
    }
    
    RawSound getSoundEffect0(final int n, final int n2, final int[] array, final int n3) {
        try {
            final long n4 = (n2 ^ ((n << 4 & 0xFFFF) | n >>> 12)) | n << 16;
            final RawSound rawSound = (RawSound)this.rawSounds.at(n4);
            if (rawSound != null) {
                if (n3 >= -849125057) {
                    throw new IllegalStateException();
                }
                return rawSound;
            }
            else {
                if (null != array) {
                    if (n3 >= -849125057) {
                        throw new IllegalStateException();
                    }
                    if (array[0] <= 0) {
                        return null;
                    }
                }
                final SoundEffect soundEffect = SoundEffect.readSoundEffect(this.musicSampleIndex, n, n2);
                if (soundEffect != null) {
                    final RawSound rawSound2 = soundEffect.toRawSound();
                    this.rawSounds.put(rawSound2, n4);
                    if (array != null) {
                        if (n3 >= -849125057) {
                            throw new IllegalStateException();
                        }
                        final int n5 = 0;
                        array[n5] -= rawSound2.samples.length;
                    }
                    return rawSound2;
                }
                if (n3 >= -849125057) {
                    throw new IllegalStateException();
                }
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ba.af(" + ')');
        }
    }
    
    RawSound aq(final int n, final int n2, final int[] array) {
        final long n3 = (long)((n2 ^ ((n << 4 & 0x3251D6ED) | n >>> 12)) | n << 16) ^ 0x100000000L;
        final RawSound rawSound = (RawSound)this.rawSounds.at(n3);
        if (null != rawSound) {
            return rawSound;
        }
        if (array != null && array[0] <= 0) {
            return null;
        }
        VorbisSample musicSample = (VorbisSample)this.musicSamples.at(n3);
        if (null == musicSample) {
            musicSample = VorbisSample.readMusicSample(this.soundEffectIndex, n, n2);
            if (musicSample == null) {
                return null;
            }
            this.musicSamples.put(musicSample, n3);
        }
        final RawSound rawSound2 = musicSample.toRawSound(array);
        if (rawSound2 == null) {
            return null;
        }
        musicSample.hw();
        this.rawSounds.put(rawSound2, n3);
        return rawSound2;
    }
    
    public static RawSound uw(final SoundCache soundCache, final int n, final int[] array) {
        if (soundCache.musicSampleIndex.getGroupCount(690565819) == 1) {
            return soundCache.getSoundEffect0(0, n, array, -1615279816);
        }
        if (soundCache.musicSampleIndex.getGroupFileCount(n, (byte)17) == 1) {
            return soundCache.getSoundEffect0(n, 0, array, -1561993471);
        }
        throw new RuntimeException();
    }
}
