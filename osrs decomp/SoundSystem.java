import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.5.36
// 

public class SoundSystem implements Runnable
{
    static Widget scriptDotWidget;
    static ScheduledExecutorService soundSystemExecutor;
    static final int uy = 5;
    volatile PcmPlayer[] players;
    static final int dx = 19;
    
    SoundSystem() {
        this.players = new PcmPlayer[2];
    }
    
    @Override
    public void run() {
        try {
            try {
                for (int i = 0; i < 2; ++i) {
                    final PcmPlayer pcmPlayer = this.players[i];
                    if (null != pcmPlayer) {
                        pcmPlayer.tryDiscard(336870901);
                    }
                }
            }
            catch (Exception ex) {
                class387.RunException_sendStackTrace(null, ex, (byte)8);
            }
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "bq.run(" + ')');
        }
    }
    
    static int method246(final int n, final int n2) {
        try {
            return (int)((Math.log(n) / Interpreter.field702 - 7.0) * 256.0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bq.br(" + ')');
        }
    }
    
    public static Widget getWidgetChild(final int n, final int n2, final int n3) {
        try {
            final Widget vmethod3380 = class165.vmethod3380(n, (byte)5);
            if (n2 != -1) {
                if (vmethod3380 != null) {
                    if (n3 == -1273201221) {
                        throw new IllegalStateException();
                    }
                    if (null != vmethod3380.children) {
                        if (n2 < vmethod3380.children.length) {
                            return vmethod3380.children[n2];
                        }
                        if (n3 == -1273201221) {
                            throw new IllegalStateException();
                        }
                    }
                }
                return null;
            }
            if (n3 == -1273201221) {
                throw new IllegalStateException();
            }
            return vmethod3380;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bq.aw(" + ')');
        }
    }
    
    public static boolean loadInterface(final int n, final int n2) {
        try {
            if (class264.Widget_loadedInterfaces[n]) {
                if (n2 != 1376777516) {
                    throw new IllegalStateException();
                }
                return true;
            }
            else if (!UserComparator3.Widget_archive.method1889(n, 1172505784)) {
                if (n2 != 1376777516) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                final int groupFileCount = UserComparator3.Widget_archive.getGroupFileCount(n, (byte)119);
                if (groupFileCount != 0) {
                    if (VerticalAlignment.Widget_interfaceComponents[n] == null) {
                        if (n2 != 1376777516) {
                            throw new IllegalStateException();
                        }
                        VerticalAlignment.Widget_interfaceComponents[n] = new Widget[groupFileCount];
                    }
                    for (int i = 0; i < groupFileCount; ++i) {
                        if (n2 != 1376777516) {
                            throw new IllegalStateException();
                        }
                        if (VerticalAlignment.Widget_interfaceComponents[n][i] == null) {
                            if (n2 != 1376777516) {
                                throw new IllegalStateException();
                            }
                            final byte[] takeFile = UserComparator3.Widget_archive.takeFile(n, i, (byte)(-46));
                            if (takeFile != null) {
                                if (n2 != 1376777516) {
                                    throw new IllegalStateException();
                                }
                                VerticalAlignment.Widget_interfaceComponents[n][i] = new Widget();
                                VerticalAlignment.Widget_interfaceComponents[n][i].id = (i + (n << 16)) * 346484955;
                                if (takeFile[0] == -1) {
                                    if (n2 != 1376777516) {
                                        throw new IllegalStateException();
                                    }
                                    VerticalAlignment.Widget_interfaceComponents[n][i].decode(new Buffer(takeFile), 604095410);
                                }
                                else {
                                    VerticalAlignment.Widget_interfaceComponents[n][i].decodeLegacy(new Buffer(takeFile), -1896942489);
                                }
                            }
                        }
                    }
                    return class264.Widget_loadedInterfaces[n] = true;
                }
                if (n2 != 1376777516) {
                    throw new IllegalStateException();
                }
                return class264.Widget_loadedInterfaces[n] = true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bq.ac(" + ')');
        }
    }
    
    public void gd() {
        try {
            for (int i = 0; i < 2; ++i) {
                final PcmPlayer pcmPlayer = this.players[i];
                if (null != pcmPlayer) {
                    pcmPlayer.tryDiscard(336870901);
                }
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
        }
    }
    
    public void gy() {
        try {
            for (int i = 0; i < 2; ++i) {
                final PcmPlayer pcmPlayer = this.players[i];
                if (null != pcmPlayer) {
                    pcmPlayer.tryDiscard(336870901);
                }
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
        }
    }
    
    static int method247(final int n, final Script script, final boolean b, final int n2) {
        try {
            return 2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bq.bl(" + ')');
        }
    }
}
