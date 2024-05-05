import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;

// 
// Decompiled by Procyon v0.5.36
// 

public class class148 extends class139
{
    static final int al = 8;
    final /* synthetic */ class142 this$0;
    static final int as = 360;
    static final String aa = "random.dat";
    public static final int aj = 19;
    String field1347;
    static final int ai = 2;
    public static final int av = 99;
    static IndexedSprite[] title_muteSprite;
    
    class148(final class142 this$0) {
        this.this$0 = this$0;
    }
    
    public static final PcmPlayer method843(final TaskHandler taskHandler, final int n, int n2, final int n3) {
        try {
            if (PcmPlayer.field201 * -1359271235 != 0) {
                if (n >= 0) {
                    if (n3 != 1831095645) {
                        throw new IllegalStateException();
                    }
                    if (n < 2) {
                        if (n2 < 256) {
                            if (n3 != 1831095645) {
                                throw new IllegalStateException();
                            }
                            n2 = 256;
                        }
                        try {
                            final PcmPlayer player;
                            final PcmPlayer pcmPlayer = player = PcmPlayer.pcmPlayerProvider.player(1183188913);
                            final int n4 = 256;
                            int n5;
                            if (PcmPlayer.PcmPlayer_stereo) {
                                if (n3 != 1831095645) {
                                    throw new IllegalStateException();
                                }
                                n5 = 2;
                            }
                            else {
                                n5 = 1;
                            }
                            player.samples = new int[n4 * n5];
                            pcmPlayer.field200 = n2 * 918717953;
                            pcmPlayer.init((byte)28);
                            pcmPlayer.capacity = -1783299003 * ((n2 & 0xFFFFFC00) + 1024);
                            if (pcmPlayer.capacity * -896831859 > 16384) {
                                if (n3 != 1831095645) {
                                    throw new IllegalStateException();
                                }
                                pcmPlayer.capacity = 1091649536;
                            }
                            pcmPlayer.open(pcmPlayer.capacity * -896831859, 162133052);
                            if (UrlRequest.field1154 * -808987209 > 0) {
                                if (n3 != 1831095645) {
                                    throw new IllegalStateException();
                                }
                                if (class354.soundSystem == null) {
                                    if (n3 != 1831095645) {
                                        throw new IllegalStateException();
                                    }
                                    class354.soundSystem = new SoundSystem();
                                    (SoundSystem.soundSystemExecutor = Executors.newScheduledThreadPool(1)).scheduleAtFixedRate(class354.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
                                }
                            }
                            if (null != class354.soundSystem) {
                                if (n3 != 1831095645) {
                                    throw new IllegalStateException();
                                }
                                if (null != class354.soundSystem.players[n]) {
                                    if (n3 != 1831095645) {
                                        throw new IllegalStateException();
                                    }
                                    throw new IllegalArgumentException();
                                }
                                else {
                                    class354.soundSystem.players[n] = pcmPlayer;
                                }
                            }
                            return pcmPlayer;
                        }
                        catch (Throwable t) {
                            return new PcmPlayer();
                        }
                    }
                }
                throw new IllegalArgumentException();
            }
            if (n3 != 1831095645) {
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fc.as(" + ')');
        }
    }
    
    static final void method844(final int n) {
        try {
            Client.packetWriter.addNode(class330.getPacketBufferNode(ClientPacket.field2532, Client.packetWriter.isaacCipher, (short)(-31998)), 414135591);
            Interpreter.field704 = true;
            InterfaceParent interfaceParent = (InterfaceParent)Client.interfaceParents.first();
        Label_0094_Outer:
            while (interfaceParent != null) {
                if (n >= 1938452949) {
                    throw new IllegalStateException();
                }
                while (true) {
                    Label_0114: {
                        if (0 == -1702664641 * interfaceParent.type) {
                            break Label_0114;
                        }
                        if (n >= 1938452949) {
                            throw new IllegalStateException();
                        }
                        if (interfaceParent.type * -1702664641 == 3) {
                            if (n >= 1938452949) {
                                throw new IllegalStateException();
                            }
                            break Label_0114;
                        }
                        interfaceParent = (InterfaceParent)Client.interfaceParents.next();
                        continue Label_0094_Outer;
                    }
                    class357.closeInterface(interfaceParent, true, -2108168630);
                    continue;
                }
            }
            if (Client.meslayerContinueWidget != null) {
                class144.invalidateWidget(Client.meslayerContinueWidget, -2105356327);
                Client.meslayerContinueWidget = null;
            }
            Interpreter.field704 = false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fc.ml(" + ')');
        }
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        clanSettings.name = this.field1347;
    }
    
    public static Clock method840(final int n) {
        try {
            try {
                return new NanoClock();
            }
            catch (Throwable t) {
                return new MilliClock();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fc.al(" + ')');
        }
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            clanSettings.name = this.field1347;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fc.an(" + ')');
        }
    }
    
    public static EnumComposition vmethod3248(final int n, final byte b) {
        try {
            final EnumComposition enumComposition = (EnumComposition)EnumComposition.EnumDefinition_cached.wr(n);
            if (null != enumComposition) {
                return enumComposition;
            }
            final byte[] takeFile = EnumComposition.EnumDefinition_archive.takeFile(8, n, (byte)(-88));
            final EnumComposition enumComposition2 = new EnumComposition();
            if (takeFile != null) {
                enumComposition2.decode(new Buffer(takeFile), (byte)1);
            }
            EnumComposition.EnumDefinition_cached.put(enumComposition2, n);
            return enumComposition2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fc.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1347 = buffer.readStringCp1252NullTerminated((byte)0);
        buffer.readInt(-1368796758);
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1347 = buffer.readStringCp1252NullTerminated((byte)0);
        buffer.readInt(-1142557849);
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1347 = buffer.readStringCp1252NullTerminated((byte)0);
            buffer.readInt(-1823467188);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fc.af(" + ')');
        }
    }
}
