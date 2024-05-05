// 
// Decompiled by Procyon v0.5.36
// 

public class class297
{
    public static AbstractArchive musicPatchesArchive;
    public static AbstractArchive musicSamplesArchive;
    public static AbstractArchive soundEffectsArchive;
    public static AbstractArchive musicTrackArchive;
    public static int musicPlayerStatus;
    public static SoundCache soundCache;
    static int cameraZ;
    public static final int ay = 1792;
    
    class297() throws Throwable {
        throw new Error();
    }
    
    static {
        class297.musicPlayerStatus = 0;
    }
    
    public static void ao(final AbstractArchive musicTrackArchive, final int n, final int n2, final int n3, final boolean musicTrackBoolean) {
        class297.musicPlayerStatus = -626822165;
        class297.musicTrackArchive = musicTrackArchive;
        class379.musicTrackGroupId = n * -1643562499;
        VarpDefinition.musicTrackFileId = 1823837761 * n2;
        class100.musicTrackVolume = 111967803 * n3;
        class120.musicTrackBoolean = musicTrackBoolean;
        class162.pcmSampleLength = 1504627152;
    }
    
    public static boolean at(final AbstractArchive musicPatchesArchive, final AbstractArchive musicSamplesArchive, final AbstractArchive soundEffectsArchive, final MidiPcmStream midiPcmStream) {
        class297.musicPatchesArchive = musicPatchesArchive;
        class297.musicSamplesArchive = musicSamplesArchive;
        class297.soundEffectsArchive = soundEffectsArchive;
        class475.midiPcmStream = midiPcmStream;
        return true;
    }
    
    public static void ak(final int n, final AbstractArchive abstractArchive, final String s, final String s2, final int n2, final boolean b) {
        if (AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
            final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, 1810129675);
            Actor.method538(n, abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), n2, b, -673688646);
        }
    }
    
    public static void av() {
        class475.midiPcmStream.clear((byte)(-35));
        class297.musicPlayerStatus = -626822165;
        class297.musicTrackArchive = null;
    }
    
    public static void as(final int n, final AbstractArchive abstractArchive, final String s, final String s2, final int n2, final boolean b) {
        if (AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
            final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, -54145120);
            Actor.method538(n, abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), n2, b, -354262644);
        }
    }
    
    public static void az(final int n, final AbstractArchive musicTrackArchive, final int n2, final int n3, final int n4, final boolean musicTrackBoolean) {
        class297.musicPlayerStatus = -626822165;
        class297.musicTrackArchive = musicTrackArchive;
        class379.musicTrackGroupId = n2 * -1643562499;
        VarpDefinition.musicTrackFileId = n3 * 1823837761;
        class100.musicTrackVolume = n4 * 111967803;
        class120.musicTrackBoolean = musicTrackBoolean;
        class162.pcmSampleLength = n * -1927001363;
    }
    
    public static void ax(final AbstractArchive musicTrackArchive, final int n, final int n2, final int n3, final boolean musicTrackBoolean) {
        class297.musicPlayerStatus = -626822165;
        class297.musicTrackArchive = musicTrackArchive;
        class379.musicTrackGroupId = n * -182695301;
        VarpDefinition.musicTrackFileId = -2135250830 * n2;
        class100.musicTrackVolume = 1956427836 * n3;
        class120.musicTrackBoolean = musicTrackBoolean;
        class162.pcmSampleLength = 1504627152;
    }
    
    public static boolean ay(final AbstractArchive musicPatchesArchive, final AbstractArchive musicSamplesArchive, final AbstractArchive soundEffectsArchive, final MidiPcmStream midiPcmStream) {
        class297.musicPatchesArchive = musicPatchesArchive;
        class297.musicSamplesArchive = musicSamplesArchive;
        class297.soundEffectsArchive = soundEffectsArchive;
        class475.midiPcmStream = midiPcmStream;
        return true;
    }
    
    public static void am(final int n, final AbstractArchive abstractArchive, final String s, final String s2, final int n2, final boolean b) {
        if (AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
            final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, -1934621217);
            Actor.method538(n, abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), n2, b, -789847682);
        }
    }
    
    public static boolean aa(final AbstractArchive musicPatchesArchive, final AbstractArchive musicSamplesArchive, final AbstractArchive soundEffectsArchive, final MidiPcmStream midiPcmStream) {
        class297.musicPatchesArchive = musicPatchesArchive;
        class297.musicSamplesArchive = musicSamplesArchive;
        class297.soundEffectsArchive = soundEffectsArchive;
        class475.midiPcmStream = midiPcmStream;
        return true;
    }
    
    public static void ai(final AbstractArchive musicTrackArchive, final int n, final int n2, final int n3, final boolean musicTrackBoolean) {
        class297.musicPlayerStatus = -626822165;
        class297.musicTrackArchive = musicTrackArchive;
        class379.musicTrackGroupId = n * -202962778;
        VarpDefinition.musicTrackFileId = 1823837761 * n2;
        class100.musicTrackVolume = 1221280450 * n3;
        class120.musicTrackBoolean = musicTrackBoolean;
        class162.pcmSampleLength = -171872116;
    }
    
    public static void ar() {
        class475.midiPcmStream.clear((byte)(-7));
        class297.musicPlayerStatus = -626822165;
        class297.musicTrackArchive = null;
    }
    
    static int compareWorlds(final World world, final World world2, final int n, final boolean b, final byte b2) {
        try {
            if (n == 1) {
                if (b2 <= 0) {
                    throw new IllegalStateException();
                }
                int n2 = -1396846889 * world.population;
                int n3 = -1396846889 * world2.population;
                if (!b) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    if (-1 == n2) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        n2 = 2001;
                    }
                    if (n3 == -1) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        n3 = 2001;
                    }
                }
                return n2 - n3;
            }
            else {
                if (n == 2) {
                    return -665846519 * world.location - -665846519 * world2.location;
                }
                if (n == 3) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    if (world.activity.equals("-")) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (world2.activity.equals("-")) {
                            return 0;
                        }
                        int n4;
                        if (b) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            n4 = -1;
                        }
                        else {
                            n4 = 1;
                        }
                        return n4;
                    }
                    else {
                        if (!world2.activity.equals("-")) {
                            return world.activity.compareTo(world2.activity);
                        }
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        int n5;
                        if (b) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            n5 = 1;
                        }
                        else {
                            n5 = -1;
                        }
                        return n5;
                    }
                }
                else if (4 == n) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    int n6;
                    if (World.ez(world, (byte)105)) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (World.ez(world2, (byte)59)) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            n6 = 0;
                        }
                        else {
                            n6 = 1;
                        }
                    }
                    else if (World.ez(world2, (byte)24)) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        n6 = -1;
                    }
                    else {
                        n6 = 0;
                    }
                    return n6;
                }
                else if (n == 5) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    int n7;
                    if (world.method408(671253830)) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (world2.method408(555881941)) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            n7 = 0;
                        }
                        else {
                            n7 = 1;
                        }
                    }
                    else {
                        n7 = (world2.method408(408455672) ? -1 : 0);
                    }
                    return n7;
                }
                else if (n == 6) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    int n8;
                    if (world.isPvp(2121026905)) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (world2.isPvp(1140984375)) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            n8 = 0;
                        }
                        else {
                            n8 = 1;
                        }
                    }
                    else if (world2.isPvp(1625717126)) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        n8 = -1;
                    }
                    else {
                        n8 = 0;
                    }
                    return n8;
                }
                else {
                    if (7 == n) {
                        int n9;
                        if (world.isMembersOnly(1029039210)) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            if (world2.isMembersOnly(1029039210)) {
                                if (b2 <= 0) {
                                    throw new IllegalStateException();
                                }
                                n9 = 0;
                            }
                            else {
                                n9 = 1;
                            }
                        }
                        else if (world2.isMembersOnly(1029039210)) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            n9 = -1;
                        }
                        else {
                            n9 = 0;
                        }
                        return n9;
                    }
                    return -2091224171 * world.id - world2.id * -2091224171;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ly.ab(" + ')');
        }
    }
    
    public static void aj(final int n, final AbstractArchive abstractArchive, final String s, final String s2, final int n2, final boolean b) {
        if (AbstractArchive.sh(abstractArchive, s, s2, -1313069490)) {
            final int fileFlat = AbstractArchive.getFileFlat(abstractArchive, s, -838492475);
            Actor.method538(n, abstractArchive, fileFlat, abstractArchive.getFileId(fileFlat, s2, (short)8192), n2, b, -416986334);
        }
    }
    
    public static void ag(final int n) {
        if (926096579 * class297.musicPlayerStatus != 0) {
            class100.musicTrackVolume = n * 111967803;
        }
        else {
            class475.midiPcmStream.setPcmStreamVolume(n, (byte)19);
        }
    }
    
    public static void ah(final int n) {
        if (-2138642109 * class297.musicPlayerStatus != 0) {
            class100.musicTrackVolume = n * -910915100;
        }
        else {
            class475.midiPcmStream.setPcmStreamVolume(n, (byte)19);
        }
    }
}
