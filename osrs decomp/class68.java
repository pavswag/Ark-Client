import java.io.InputStream;
import java.net.URLConnection;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.api.events.GrandExchangeSearched;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.5.36
// 

public class class68
{
    static final int ac = 1000;
    static final String an = "services";
    public static final int cq = 82;
    static final String af = "m=accountappeal/login.ws";
    static final String aw = "passwordchoice.ws";
    static final BigInteger field716;
    static final int at = 4;
    static final int aa = 5;
    static final BigInteger field717;
    
    class68() throws Throwable {
        throw new Error();
    }
    
    static {
        field717 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
        field716 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
    }
    
    static void findItemDefinitions(final String s, final boolean b, final short n) {
        final GrandExchangeSearched grandExchangeSearched = new GrandExchangeSearched();
        ScriptFrame.client.getCallbacks().post((Object)grandExchangeSearched);
        if (!grandExchangeSearched.isConsumed()) {
            final int n2 = 255;
            try {
                final String lowerCase = s.toLowerCase();
                short[] foundItemIds = new short[16];
                int n3 = 0;
                for (int i = 0; i < -1485716275 * MouseRecorder.ItemDefinition_fileCount; ++i) {
                    if (n2 != 255) {
                        throw new IllegalStateException();
                    }
                    final ItemComposition set = HealthBarUpdate.set(i, (byte)115);
                    if (b) {
                        if (n2 != 255) {
                            throw new IllegalStateException();
                        }
                        if (!set.isTradable) {
                            continue;
                        }
                    }
                    if (set.noteTemplate * -1375068187 == -1) {
                        if (set.name.toLowerCase().indexOf(lowerCase) == -1) {
                            if (n2 != 255) {
                                throw new IllegalStateException();
                            }
                        }
                        else if (n3 >= 250) {
                            if (n2 != 255) {
                                throw new IllegalStateException();
                            }
                            class264.foundItemIdCount = 316033701;
                            class399.foundItemIds = null;
                            return;
                        }
                        else {
                            if (n3 >= foundItemIds.length) {
                                if (n2 != 255) {
                                    throw new IllegalStateException();
                                }
                                final short[] array = new short[foundItemIds.length * 2];
                                for (int j = 0; j < n3; ++j) {
                                    if (n2 != 255) {
                                        throw new IllegalStateException();
                                    }
                                    array[j] = foundItemIds[j];
                                }
                                foundItemIds = array;
                            }
                            foundItemIds[n3++] = (short)i;
                        }
                    }
                }
                class399.foundItemIds = foundItemIds;
                FontName.foundItemIndex = 0;
                class264.foundItemIdCount = -316033701 * n3;
                final String[] array2 = new String[class264.foundItemIdCount * 1764192979];
                for (int k = 0; k < class264.foundItemIdCount * 1764192979; ++k) {
                    if (n2 != 255) {
                        throw new IllegalStateException();
                    }
                    array2[k] = HealthBarUpdate.set(foundItemIds[k], (byte)105).name;
                }
                GrandExchangeOffer.method1930(array2, class399.foundItemIds, -680765702);
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "cv.nf(" + ')');
            }
        }
    }
    
    static boolean at(final String spec) {
        if (spec == null) {
            return false;
        }
        try {
            new URL(spec);
        }
        catch (MalformedURLException ex) {
            return false;
        }
        return true;
    }
    
    static boolean ay(final String spec) {
        if (spec == null) {
            return false;
        }
        try {
            new URL(spec);
        }
        catch (MalformedURLException ex) {
            return false;
        }
        return true;
    }
    
    static long aw() {
        try {
            final URLConnection openConnection = new URL(InvDefinition.method977("services", false, -854917675) + "m=accountappeal/login.ws").openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(-648470571);
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            final InputStream inputStream = openConnection.getInputStream();
            final Buffer buffer = new Buffer(new byte[1000]);
            while (true) {
                final int read = inputStream.read(buffer.array, 1680524610 * buffer.offset, -1200940649 - -1633313603 * buffer.offset);
                if (-1 == read) {
                    buffer.offset = 0;
                    return Buffer.ks(buffer, (byte)1);
                }
                final Buffer buffer2 = buffer;
                buffer2.offset += -1516355947 * read;
                if (578814497 * buffer.offset >= 1000) {
                    return 0L;
                }
            }
        }
        catch (Exception ex) {
            return 0L;
        }
    }
    
    static boolean al(final String spec) {
        if (spec == null) {
            return false;
        }
        try {
            new URL(spec);
        }
        catch (MalformedURLException ex) {
            return false;
        }
        return true;
    }
    
    static long ac() {
        try {
            final URLConnection openConnection = new URL(InvDefinition.method977("services", false, -843357213) + "m=accountappeal/login.ws").openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            final InputStream inputStream = openConnection.getInputStream();
            final Buffer buffer = new Buffer(new byte[1000]);
            while (true) {
                final int read = inputStream.read(buffer.array, -1633313603 * buffer.offset, 1000 - -1633313603 * buffer.offset);
                if (-1 == read) {
                    buffer.offset = 0;
                    return Buffer.ks(buffer, (byte)1);
                }
                final Buffer buffer2 = buffer;
                buffer2.offset += -1516355947 * read;
                if (-1633313603 * buffer.offset >= 1000) {
                    return 0L;
                }
            }
        }
        catch (Exception ex) {
            return 0L;
        }
    }
    
    static long au() {
        try {
            final URLConnection openConnection = new URL(InvDefinition.method977("services", false, -28050475) + "m=accountappeal/login.ws").openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            final InputStream inputStream = openConnection.getInputStream();
            final Buffer buffer = new Buffer(new byte[-411792358]);
            while (true) {
                final int read = inputStream.read(buffer.array, 1960572173 * buffer.offset, 1000 - 537621587 * buffer.offset);
                if (-1 == read) {
                    buffer.offset = 0;
                    return Buffer.ks(buffer, (byte)1);
                }
                final Buffer buffer2 = buffer;
                buffer2.offset += -1516355947 * read;
                if (-1633313603 * buffer.offset >= 511344869) {
                    return 0L;
                }
            }
        }
        catch (Exception ex) {
            return 0L;
        }
    }
    
    static final void Widget_setKeyRate(final Widget widget, final int n, final int n2, final int n3, final int n4) {
        try {
            if (widget.field2936 != null) {
                widget.field2936[n] = n2;
                widget.field2977[n] = n3;
                return;
            }
            if (n4 >= 80155403) {
                throw new IllegalStateException();
            }
            throw new RuntimeException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cv.aa(" + ')');
        }
    }
    
    static boolean Widget_setKeyRate(final String spec) {
        if (spec == null) {
            return false;
        }
        try {
            new URL(spec);
        }
        catch (MalformedURLException ex) {
            return false;
        }
        return true;
    }
    
    public static IndexedSprite[] method434(final AbstractArchive abstractArchive, final int n, final int n2, final int n3) {
        try {
            final byte[] takeFile = abstractArchive.takeFile(n, n2, (byte)(-69));
            int n4;
            if (null == takeFile) {
                if (n3 >= 1679393935) {
                    throw new IllegalStateException();
                }
                n4 = 0;
            }
            else {
                class485.SpriteBuffer_decode(takeFile, 1145263442);
                n4 = 1;
            }
            if (n4 != 0) {
                final IndexedSprite[] array = new IndexedSprite[1606065339 * class503.SpriteBuffer_spriteCount];
                for (int i = 0; i < 1606065339 * class503.SpriteBuffer_spriteCount; ++i) {
                    final IndexedSprite[] array2 = array;
                    final int n5 = i;
                    final IndexedSprite indexedSprite = new IndexedSprite();
                    array2[n5] = indexedSprite;
                    final IndexedSprite indexedSprite2 = indexedSprite;
                    indexedSprite2.subHeight = class503.SpriteBuffer_spriteWidth * -822007097;
                    indexedSprite2.width = 378525975 * class503.SpriteBuffer_spriteHeight;
                    indexedSprite2.height = class503.SpriteBuffer_xOffsets[i];
                    indexedSprite2.xOffset = class17.SpriteBuffer_yOffsets[i];
                    indexedSprite2.yOffset = class97.SpriteBuffer_spriteWidths[i];
                    indexedSprite2.subWidth = class138.SpriteBuffer_spriteHeights[i];
                    indexedSprite2.palette = class394.SpriteBuffer_spritePalette;
                    indexedSprite2.pixels = VarbitComposition.SpriteBuffer_pixels[i];
                }
                class398.method2125(-262861184);
                return array;
            }
            if (n3 >= 1679393935) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cv.af(" + ')');
        }
    }
    
    static long ab() {
        try {
            final URLConnection openConnection = new URL(InvDefinition.method977("services", false, -703414801) + "m=accountappeal/login.ws").openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            final InputStream inputStream = openConnection.getInputStream();
            final Buffer buffer = new Buffer(new byte[-588025164]);
            while (true) {
                final int read = inputStream.read(buffer.array, -1633313603 * buffer.offset, 1000 - -1633313603 * buffer.offset);
                if (-1 == read) {
                    buffer.offset = 0;
                    return Buffer.ks(buffer, (byte)1);
                }
                final Buffer buffer2 = buffer;
                buffer2.offset += -225579219 * read;
                if (-1633313603 * buffer.offset >= 1304107812) {
                    return 0L;
                }
            }
        }
        catch (Exception ex) {
            return 0L;
        }
    }
    
    static boolean aq(final String spec) {
        if (spec == null) {
            return false;
        }
        try {
            new URL(spec);
        }
        catch (MalformedURLException ex) {
            return false;
        }
        return true;
    }
}
