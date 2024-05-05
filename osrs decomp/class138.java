import java.io.RandomAccessFile;
import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class class138 extends class139
{
    public static final int ad = 6;
    static final int bb = 2;
    static int field1314;
    static final int ac = 3500;
    public static final float al = 75.0f;
    final /* synthetic */ class142 this$0;
    int field1315;
    static final int dc = 0;
    public static final int be = 4096;
    public static int[] SpriteBuffer_spriteHeights;
    
    class138(final class142 this$0) {
        this.this$0 = this$0;
        this.field1315 = 1030741753;
    }
    
    static void updateGameState(final int n, final int n2) {
        try {
            if (Client.gameState * -1275976559 != n) {
                if (-1275976559 * Client.gameState == 30) {
                    if (n2 <= 372776577) {
                        return;
                    }
                    Client.field590.method1138((byte)(-85));
                }
                if (0 == -1275976559 * Client.gameState) {
                    if (n2 <= 372776577) {
                        throw new IllegalStateException();
                    }
                    ScriptFrame.client.bs(-274523606);
                }
                Label_0297: {
                    if (n != 20) {
                        if (n2 <= 372776577) {
                            throw new IllegalStateException();
                        }
                        if (40 != n) {
                            if (n2 <= 372776577) {
                                throw new IllegalStateException();
                            }
                            if (45 != n) {
                                if (n2 <= 372776577) {
                                    throw new IllegalStateException();
                                }
                                if (n != 50) {
                                    break Label_0297;
                                }
                                if (n2 <= 372776577) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                    class284.method1595(0, 2044655506);
                    Client.field391 = 0;
                    Client.field392 = 0;
                    Client.timer.method2096(n, (byte)13);
                    if (n != 20) {
                        if (n2 <= 372776577) {
                            throw new IllegalStateException();
                        }
                        class14.method53(false, -1713084686);
                    }
                }
                if (n != 20) {
                    if (n2 <= 372776577) {
                        throw new IllegalStateException();
                    }
                    if (n != 40) {
                        if (n2 <= 372776577) {
                            throw new IllegalStateException();
                        }
                        if (null != class333.field3090) {
                            class333.field3090.close(143996603);
                            class333.field3090 = null;
                        }
                    }
                }
                if (Client.gameState * -1275976559 == 25) {
                    if (n2 <= 372776577) {
                        return;
                    }
                    Client.field489 = 0;
                    Client.field427 = 0;
                    Client.field593 = -1903772507;
                    Client.field425 = 0;
                    Client.field426 = -1711800473;
                }
                Label_0407: {
                    if (n != 5) {
                        if (10 == n) {
                            if (n2 <= 372776577) {
                                throw new IllegalStateException();
                            }
                        }
                        else if (20 == n) {
                            if (n2 <= 372776577) {
                                return;
                            }
                            int n3;
                            if (11 == -1275976559 * Client.gameState) {
                                if (n2 <= 372776577) {
                                    throw new IllegalStateException();
                                }
                                n3 = 4;
                            }
                            else {
                                n3 = 0;
                            }
                            KeyHandler.getIdleCycles(NetFileRequest.archive10, class452.archive8, false, n3, (byte)(-37));
                            break Label_0407;
                        }
                        else if (11 == n) {
                            if (n2 <= 372776577) {
                                return;
                            }
                            KeyHandler.getIdleCycles(NetFileRequest.archive10, class452.archive8, false, 4, (byte)(-115));
                            break Label_0407;
                        }
                        else {
                            if (50 != n) {
                                Player.method519(1198190304);
                                break Label_0407;
                            }
                            if (n2 <= 372776577) {
                                throw new IllegalStateException();
                            }
                            class205.method1137("", "Updating date of birth...", "", -1811264707);
                            KeyHandler.getIdleCycles(NetFileRequest.archive10, class452.archive8, false, 7, (byte)(-123));
                            break Label_0407;
                        }
                    }
                    int n4;
                    if (class134.method779((byte)68)) {
                        if (n2 <= 372776577) {
                            throw new IllegalStateException();
                        }
                        n4 = 0;
                    }
                    else {
                        n4 = 12;
                    }
                    KeyHandler.getIdleCycles(NetFileRequest.archive10, class452.archive8, true, n4, (byte)(-43));
                }
                Client.gameState = 188619889 * n;
                Client.ao(-1);
                return;
            }
            if (n2 <= 372776577) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fd.hi(" + ')');
        }
    }
    
    void method801(final ClanSettings clanSettings) {
        ClanSettings.jp(clanSettings, this.field1315 * -469795657, (byte)(-36));
    }
    
    public static void method801(final String[] array, final int[] array2, final int n, final int n2, final byte b) {
        try {
            if (n < n2) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                final int n3 = (n + n2) / 2;
                int n4 = n;
                final String anotherString = array[n3];
                array[n3] = array[n2];
                array[n2] = anotherString;
                final int n5 = array2[n3];
                array2[n3] = array2[n2];
                array2[n2] = n5;
                int i = n;
            Label_0214_Outer:
                while (i < n2) {
                    if (b != 1) {
                        return;
                    }
                    while (true) {
                        Label_0230: {
                            if (null == anotherString) {
                                break Label_0230;
                            }
                            if (array[i] != null) {
                                if (b != 1) {
                                    throw new IllegalStateException();
                                }
                                if (array[i].compareTo(anotherString) < (i & 0x1)) {
                                    if (b != 1) {
                                        throw new IllegalStateException();
                                    }
                                    break Label_0230;
                                }
                            }
                            ++i;
                            continue Label_0214_Outer;
                        }
                        final String s = array[i];
                        array[i] = array[n4];
                        array[n4] = s;
                        final int n6 = array2[i];
                        array2[i] = array2[n4];
                        array2[n4++] = n6;
                        continue;
                    }
                }
                array[n2] = array[n4];
                array[n4] = anotherString;
                array2[n2] = array2[n4];
                array2[n4] = n5;
                method801(array, array2, n, n4 - 1, (byte)1);
                method801(array, array2, 1 + n4, n2, (byte)1);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fd.aw(" + ')');
        }
    }
    
    static void method800(final byte b) {
        try {
            Login.worldSelectOpen = false;
            Client.tn(-1);
            class123.leftTitleSprite.ca(Login.xPadding * 578342931, 0);
            ParamComposition.rightTitleSprite.ca(578342931 * Login.xPadding + 382, 0);
            Canvas.logoSprite.ax(Login.xPadding * 578342931 + 382 - Canvas.logoSprite.yOffset / 2, 18);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fd.am(" + ')');
        }
    }
    
    static final void method796(final String s, final String s2, final int n, final int n2, final int n3, final int n4, final int n5, final short n6) {
        try {
            SceneTilePaint.insertMenuItem(s, s2, n, n2, n3, n4, n5, false, (byte)126);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fd.km(" + ')');
        }
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            ClanSettings.jp(clanSettings, this.field1315 * -469795657, (byte)(-122));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fd.an(" + ')');
        }
    }
    
    @Override
    void ac(final Buffer buffer) {
        this.field1315 = buffer.readUnsignedShort(-640146078) * -1030741753;
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1315 = buffer.readUnsignedShort(-867857503) * -1030741753;
    }
    
    public static void rh(final WorldMap worldMap) {
        if (worldMap == null) {
            worldMap.fl();
        }
        WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
    }
    
    static double vmethod3254(final double n) {
        try {
            return Math.exp(n * -n / 2.0) / Math.sqrt(6.283185307179586);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fd.af(" + ')');
        }
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1315 = buffer.readUnsignedShort(348040909) * -1030741753;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fd.af(" + ')');
        }
    }
    
    public static File vmethod3254(final String key, final int n) {
        try {
            if (!FileSystem.FileSystem_hasPermissions) {
                if (n >= -214580013) {
                    throw new IllegalStateException();
                }
                throw new RuntimeException("");
            }
            else {
                final File file = FileSystem.FileSystem_cacheFiles.get(key);
                if (null != file) {
                    return file;
                }
                final File file2 = new File(class513.FileSystem_cacheDir, key);
                RandomAccessFile randomAccessFile = null;
                try {
                    if (new File(file2.getParent()).exists()) {
                        randomAccessFile = new RandomAccessFile(file2, "rw");
                        final int read = randomAccessFile.read();
                        randomAccessFile.seek(0L);
                        randomAccessFile.write(read);
                        randomAccessFile.seek(0L);
                        randomAccessFile.close();
                        FileSystem.FileSystem_cacheFiles.put(key, file2);
                        return file2;
                    }
                    if (n >= -214580013) {
                        throw new IllegalStateException();
                    }
                    throw new RuntimeException("");
                }
                catch (Exception ex2) {
                    try {
                        if (null != randomAccessFile) {
                            if (n >= -214580013) {
                                throw new IllegalStateException();
                            }
                            randomAccessFile.close();
                        }
                    }
                    catch (Exception ex3) {}
                    throw new RuntimeException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fd.af(" + ')');
        }
    }
    
    public static int fq(final class314 class314) {
        return class314.field2851.method2038(-1296915014);
    }
    
    static final void method797(final MenuAction menuAction, final int n, final int n2, final byte b) {
        try {
            if (menuAction != null) {
                class17.menuAction(68640743 * menuAction.param0, menuAction.param1 * 1427372077, 532700261 * menuAction.opcode, 1480765569 * menuAction.identifier, 680599237 * menuAction.itemId, menuAction.action, menuAction.target, n, n2, -1502367933);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fd.kv(" + ')');
        }
    }
}
