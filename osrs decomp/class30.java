import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;

// 
// Decompiled by Procyon v0.5.36
// 

public class class30
{
    static final String aw = "_";
    public static final int ay = 9;
    static final int cl = 20;
    static final int af = 9;
    static final int ao = 7;
    
    class30() throws Throwable {
        throw new Error();
    }
    
    static {
        ImageIO.setUseCache(false);
    }
    
    public static final SpritePixels method132(final byte[] buf) {
        BufferedImage read = null;
        try {
            synchronized (ImageIO.class) {
                read = ImageIO.read(new ByteArrayInputStream(buf));
            }
            final int width = read.getWidth();
            final int height = read.getHeight();
            final int[] pix = new int[width * height];
            new PixelGrabber(read, 0, 0, width, height, pix, 0, width).grabPixels();
            return new SpritePixels(pix, width, height);
        }
        catch (IOException ex) {}
        catch (InterruptedException ex2) {}
        return new SpritePixels(0, 0);
    }
    
    public static String method132(final CharSequence charSequence, final LoginType loginType, final byte b) {
        try {
            if (null != charSequence) {
                int n;
                int i;
                for (n = 0, i = charSequence.length(); n < i && MouseRecorder.method494(charSequence.charAt(n), 1929251930); ++n) {
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                }
                while (i > n) {
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                    if (!MouseRecorder.method494(charSequence.charAt(i - 1), 2100090869)) {
                        break;
                    }
                    --i;
                }
                final int capacity = i - n;
                if (capacity >= 1) {
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                    if (capacity > class283.method1594(loginType, -740837934)) {
                        if (b >= 1) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        final StringBuilder sb = new StringBuilder(capacity);
                        for (int j = n; j < i; ++j) {
                            final char char1 = charSequence.charAt(j);
                            int n2 = 0;
                            Label_0913: {
                                if (Character.isISOControl(char1)) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    n2 = 0;
                                }
                                else if (MenuAction.isAlphaNumeric(char1, -2123095492)) {
                                    if (b >= 1) {
                                        throw new IllegalStateException();
                                    }
                                    n2 = 1;
                                }
                                else {
                                    final char[] field4001 = class469.field4001;
                                    int k = 0;
                                    while (k < field4001.length) {
                                        if (b >= 1) {
                                            throw new IllegalStateException();
                                        }
                                        if (field4001[k] == char1) {
                                            if (b >= 1) {
                                                throw new IllegalStateException();
                                            }
                                            n2 = 1;
                                            break Label_0913;
                                        }
                                        else {
                                            ++k;
                                        }
                                    }
                                    final char[] field4002 = class469.field4002;
                                    int l = 0;
                                    while (l < field4002.length) {
                                        if (b >= 1) {
                                            throw new IllegalStateException();
                                        }
                                        if (field4002[l] == char1) {
                                            if (b >= 1) {
                                                throw new IllegalStateException();
                                            }
                                            n2 = 1;
                                            break Label_0913;
                                        }
                                        else {
                                            ++l;
                                        }
                                    }
                                    n2 = 0;
                                }
                            }
                            if (n2 == 0) {
                                if (b >= 1) {
                                    throw new IllegalStateException();
                                }
                            }
                            else {
                                char lowerCase = '\0';
                                switch (char1) {
                                    case '\u00d2':
                                    case '\u00d3':
                                    case '\u00d4':
                                    case '\u00d5':
                                    case '\u00d6':
                                    case '\u00f2':
                                    case '\u00f3':
                                    case '\u00f4':
                                    case '\u00f5':
                                    case '\u00f6': {
                                        lowerCase = 'o';
                                        break;
                                    }
                                    case '\u00cd':
                                    case '\u00ce':
                                    case '\u00cf':
                                    case '\u00ed':
                                    case '\u00ee':
                                    case '\u00ef': {
                                        lowerCase = 'i';
                                        break;
                                    }
                                    case '\u00d1':
                                    case '\u00f1': {
                                        lowerCase = 'n';
                                        break;
                                    }
                                    case '\u00c8':
                                    case '\u00c9':
                                    case '\u00ca':
                                    case '\u00cb':
                                    case '\u00e8':
                                    case '\u00e9':
                                    case '\u00ea':
                                    case '\u00eb': {
                                        lowerCase = 'e';
                                        break;
                                    }
                                    case '\u00ff':
                                    case '\u0178': {
                                        lowerCase = 'y';
                                        break;
                                    }
                                    case '\u00c7':
                                    case '\u00e7': {
                                        lowerCase = 'c';
                                        break;
                                    }
                                    case '#':
                                    case '[':
                                    case ']': {
                                        lowerCase = char1;
                                        break;
                                    }
                                    case '\u00df': {
                                        lowerCase = 'b';
                                        break;
                                    }
                                    default: {
                                        lowerCase = Character.toLowerCase(char1);
                                        break;
                                    }
                                    case ' ':
                                    case '-':
                                    case '_':
                                    case ' ': {
                                        lowerCase = '_';
                                        break;
                                    }
                                    case '\u00c0':
                                    case '\u00c1':
                                    case '\u00c2':
                                    case '\u00c3':
                                    case '\u00c4':
                                    case '\u00e0':
                                    case '\u00e1':
                                    case '\u00e2':
                                    case '\u00e3':
                                    case '\u00e4': {
                                        lowerCase = 'a';
                                        break;
                                    }
                                    case '\u00d9':
                                    case '\u00da':
                                    case '\u00db':
                                    case '\u00dc':
                                    case '\u00f9':
                                    case '\u00fa':
                                    case '\u00fb':
                                    case '\u00fc': {
                                        lowerCase = 'u';
                                        break;
                                    }
                                }
                                final char c = lowerCase;
                                if (c != '\0') {
                                    sb.append(c);
                                }
                            }
                        }
                        if (sb.length() != 0) {
                            return sb.toString();
                        }
                        if (b >= 1) {
                            throw new IllegalStateException();
                        }
                        return null;
                    }
                }
                return null;
            }
            if (b >= 1) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bk.aw(" + ')');
        }
    }
    
    public static int ja(final Buffer buffer) {
        final byte b = 0;
        final byte[] array = buffer.array;
        final int offset = buffer.offset + 75582635;
        buffer.offset = offset;
        return b - array[offset * 675582835 - 1] & 0x8B70DFCD;
    }
    
    public static final SpritePixels an(final byte[] buf) {
        BufferedImage read = null;
        try {
            synchronized (ImageIO.class) {
                read = ImageIO.read(new ByteArrayInputStream(buf));
            }
            final int width = read.getWidth();
            final int height = read.getHeight();
            final int[] pix = new int[width * height];
            new PixelGrabber(read, 0, 0, width, height, pix, 0, width).grabPixels();
            return new SpritePixels(pix, width, height);
        }
        catch (IOException ex) {}
        catch (InterruptedException ex2) {}
        return new SpritePixels(0, 0);
    }
    
    public static long method130(final int n, final int n2) {
        try {
            return ViewportMouse.ViewportMouse_entityTags[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bk.ac(" + ')');
        }
    }
    
    static final void method131(final PacketBuffer packetBuffer, final int n) {
        try {
            PacketBuffer.jb(packetBuffer, (byte)(-29));
            final int bitsRemaining = packetBuffer.bitsRemaining(8, -1490965572);
            if (bitsRemaining < Client.npcCount * 265474485) {
                if (n != 900654741) {
                    throw new IllegalStateException();
                }
                for (int i = bitsRemaining; i < 265474485 * Client.npcCount; ++i) {
                    if (n != 900654741) {
                        throw new IllegalStateException();
                    }
                    Client.field485[(Client.field484 -= 1359666311) * 216061641 - 1] = Client.npcIndices[i];
                }
            }
            if (bitsRemaining <= Client.npcCount * 265474485) {
                Client.npcCount = 0;
                for (int j = 0; j < bitsRemaining; ++j) {
                    if (n != 900654741) {
                        throw new IllegalStateException();
                    }
                    final int n2 = Client.npcIndices[j];
                    final NPC npc = Client.npcs[n2];
                    if (packetBuffer.bitsRemaining(1, -1544607869) == 0) {
                        if (n != 900654741) {
                            throw new IllegalStateException();
                        }
                        Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = n2;
                        npc.de = -1014023335 * Client.cycle;
                    }
                    else {
                        final int bitsRemaining2 = packetBuffer.bitsRemaining(2, -944837087);
                        if (bitsRemaining2 == 0) {
                            if (n != 900654741) {
                                return;
                            }
                            Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = n2;
                            npc.de = Client.cycle * -1014023335;
                            Client.field417[(Client.field416 += 1487412345) * 606834121 - 1] = n2;
                        }
                        else if (bitsRemaining2 != 0) {
                            if (n != 900654741) {
                                throw new IllegalStateException();
                            }
                            Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = n2;
                            npc.de = Client.cycle * -1014023335;
                            npc.move(packetBuffer.bitsRemaining(3, -1551952341), MoveSpeed.WALK, (byte)110);
                            if (1 == packetBuffer.bitsRemaining(1, -1834997927)) {
                                if (n != 900654741) {
                                    throw new IllegalStateException();
                                }
                                Client.field417[(Client.field416 += 1487412345) * 606834121 - 1] = n2;
                            }
                        }
                        else if (bitsRemaining2 == 2) {
                            if (n != 900654741) {
                                throw new IllegalStateException();
                            }
                            Client.npcIndices[(Client.npcCount += 1796101277) * 265474485 - 1] = n2;
                            npc.de = -1014023335 * Client.cycle;
                            if (packetBuffer.bitsRemaining(1, -1318741814) == 1) {
                                if (n != 900654741) {
                                    return;
                                }
                                npc.move(packetBuffer.bitsRemaining(3, -1702575344), MoveSpeed.RUN, (byte)125);
                                npc.move(packetBuffer.bitsRemaining(3, -411910904), MoveSpeed.RUN, (byte)126);
                            }
                            else {
                                npc.move(packetBuffer.bitsRemaining(3, -1825320482), MoveSpeed.CRAWL, (byte)124);
                            }
                            if (packetBuffer.bitsRemaining(1, -1696706191) == 1) {
                                if (n != 900654741) {
                                    throw new IllegalStateException();
                                }
                                Client.field417[(Client.field416 += 1487412345) * 606834121 - 1] = n2;
                            }
                        }
                        else if (bitsRemaining2 == 3) {
                            if (n != 900654741) {
                                throw new IllegalStateException();
                            }
                            Client.field485[(Client.field484 -= 1359666311) * 216061641 - 1] = n2;
                        }
                    }
                }
                return;
            }
            if (n != 900654741) {
                return;
            }
            throw new RuntimeException("");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bk.kt(" + ')');
        }
    }
}
