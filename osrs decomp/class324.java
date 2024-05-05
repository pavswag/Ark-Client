// 
// Decompiled by Procyon v0.5.36
// 

public class class324 implements class356
{
    static final class324 field3038;
    static final class324 field3039;
    public static final class324 field3040;
    static final class324 field3041;
    static final class324 field3042;
    final int field3043;
    public static final String kr = "DD/MM/YYYY and is after 01/01/1900";
    
    class324(final int n) {
        this.field3043 = n * 1221393021;
    }
    
    static {
        field3039 = new class324(0);
        field3038 = new class324(1);
        field3041 = new class324(2);
        field3040 = new class324(3);
        field3042 = new class324(4);
    }
    
    static void method1838(final int n) {
        try {
            if (Client.oculusOrbOnLocalPlayer) {
                if (n <= -905551138) {
                    throw new IllegalStateException();
                }
                if (MusicPatchNode.localPlayer != null) {
                    final int n2 = MusicPatchNode.localPlayer.cf[0];
                    final int n3 = MusicPatchNode.localPlayer.dy[0];
                    if (n2 >= 0) {
                        if (n <= -905551138) {
                            throw new IllegalStateException();
                        }
                        if (n3 >= 0) {
                            if (n <= -905551138) {
                                return;
                            }
                            if (n2 < 104) {
                                if (n3 < 104) {
                                    class33.oculusOrbFocalPointX = 462679329 * MusicPatchNode.localPlayer.br;
                                    final int n4 = class147.getTileHeight(1144428983 * MusicPatchNode.localPlayer.br, -411750205 * MusicPatchNode.localPlayer.ep, -1727408401 * GameEngine.Client_plane, (byte)(-68)) - 394960243 * Client.camFollowHeight;
                                    if (n4 < class96.field1064 * 470489225) {
                                        if (n <= -905551138) {
                                            throw new IllegalStateException();
                                        }
                                        class96.field1064 = -1138369095 * n4;
                                    }
                                    class144.oculusOrbFocalPointY = -72020645 * MusicPatchNode.localPlayer.ep;
                                    Client.oculusOrbOnLocalPlayer = false;
                                    return;
                                }
                                if (n <= -905551138) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ms.ni(" + ')');
        }
    }
    
    @Override
    public int aw() {
        return this.field3043 * 753754445;
    }
    
    @Override
    public int an() {
        return this.field3043 * -1109405995;
    }
    
    @Override
    public int ac() {
        return this.field3043 * -1109405995;
    }
    
    static void method1839(final int n, final int n2, final int n3, final int n4, final short n5) {
        try {
            for (ObjectSound objectSound = (ObjectSound)ObjectSound.objectSounds.last(); objectSound != null; objectSound = (ObjectSound)ObjectSound.objectSounds.previous()) {
                if (n5 >= 3202) {
                    throw new IllegalStateException();
                }
                if (-1 == objectSound.soundEffectId * 1671764667 && null == objectSound.soundEffectIds) {
                    if (n5 >= 3202) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    int n6 = 0;
                    if (n2 > -823707049 * objectSound.maxX) {
                        if (n5 >= 3202) {
                            throw new IllegalStateException();
                        }
                        n6 += n2 - objectSound.maxX * -823707049;
                    }
                    else if (n2 < objectSound.x * 506576733) {
                        if (n5 >= 3202) {
                            throw new IllegalStateException();
                        }
                        n6 += 506576733 * objectSound.x - n2;
                    }
                    if (n3 > objectSound.maxY * -1828326483) {
                        if (n5 >= 3202) {
                            return;
                        }
                        n6 += n3 - objectSound.maxY * -1828326483;
                    }
                    else if (n3 < 99345247 * objectSound.y) {
                        if (n5 >= 3202) {
                            throw new IllegalStateException();
                        }
                        n6 += objectSound.y * 99345247 - n3;
                    }
                    if (n6 - 64 <= -1826007749 * objectSound.field673 && class20.clientPreferences.method573(-1731594779) != 0) {
                        if (n5 >= 3202) {
                            throw new IllegalStateException();
                        }
                        if (n == objectSound.plane * 776275305) {
                            n6 -= 64;
                            if (n6 < 0) {
                                if (n5 >= 3202) {
                                    return;
                                }
                                n6 = 0;
                            }
                            final int n7 = (objectSound.field673 * -1826007749 - n6) * class20.clientPreferences.method573(-1729402152) / (-1826007749 * objectSound.field673);
                            if (null == objectSound.stream2) {
                                if (objectSound.soundEffectId * 1671764667 >= 0) {
                                    if (n5 >= 3202) {
                                        throw new IllegalStateException();
                                    }
                                    final SoundEffect soundEffect = SoundEffect.readSoundEffect(class426.field3811, objectSound.soundEffectId * 1671764667, 0);
                                    if (null != soundEffect) {
                                        if (n5 >= 3202) {
                                            throw new IllegalStateException();
                                        }
                                        final RawPcmStream rawPcmStream = RawPcmStream.createRawPcmStream(soundEffect.toRawSound().resample(WorldMapSectionType.decimator), 100, n7);
                                        rawPcmStream.setNumLoops(-1);
                                        class130.pcmStreamMixer.addSubStream(rawPcmStream);
                                        objectSound.stream2 = rawPcmStream;
                                    }
                                }
                            }
                            else {
                                objectSound.stream2.method295(n7);
                            }
                            if (objectSound.stream1 == null) {
                                if (null == objectSound.soundEffectIds) {
                                    continue;
                                }
                                if (n5 >= 3202) {
                                    throw new IllegalStateException();
                                }
                                final ObjectSound objectSound2 = objectSound;
                                final int field679 = objectSound2.field679 - n4 * -713890281;
                                objectSound2.field679 = field679;
                                if (field679 * -428166745 > 0) {
                                    continue;
                                }
                                if (n5 >= 3202) {
                                    return;
                                }
                                final SoundEffect soundEffect2 = SoundEffect.readSoundEffect(class426.field3811, objectSound.soundEffectIds[(int)(Math.random() * objectSound.soundEffectIds.length)], 0);
                                if (null != soundEffect2) {
                                    if (n5 >= 3202) {
                                        throw new IllegalStateException();
                                    }
                                    final RawPcmStream rawPcmStream2 = RawPcmStream.createRawPcmStream(soundEffect2.toRawSound().resample(WorldMapSectionType.decimator), 100, n7);
                                    rawPcmStream2.setNumLoops(0);
                                    class130.pcmStreamMixer.addSubStream(rawPcmStream2);
                                    objectSound.stream1 = rawPcmStream2;
                                    objectSound.field679 = (-442346035 * objectSound.field681 + (int)(Math.random() * (-1018564833 * objectSound.field682 - -442346035 * objectSound.field681))) * -713890281;
                                }
                                continue;
                            }
                            else {
                                objectSound.stream1.method295(n7);
                                if (Node.fh(objectSound.stream1)) {
                                    continue;
                                }
                                if (n5 >= 3202) {
                                    return;
                                }
                                objectSound.stream1 = null;
                                continue;
                            }
                        }
                    }
                    if (null != objectSound.stream2) {
                        if (n5 >= 3202) {
                            throw new IllegalStateException();
                        }
                        class130.pcmStreamMixer.removeSubStream(objectSound.stream2);
                        objectSound.stream2 = null;
                    }
                    if (objectSound.stream1 != null) {
                        if (n5 >= 3202) {
                            throw new IllegalStateException();
                        }
                        class130.pcmStreamMixer.removeSubStream(objectSound.stream1);
                        objectSound.stream1 = null;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ms.au(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.field3043 * -1109405995;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ms.af(" + ')');
        }
    }
}
