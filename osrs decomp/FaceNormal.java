import java.awt.event.WindowEvent;

// 
// Decompiled by Procyon v0.5.36
// 

public class FaceNormal
{
    static final int dy = 21;
    int z;
    int y;
    static final int az = 25;
    int x;
    public static final int cp = 98;
    static final int cs = 70;
    
    FaceNormal() {
    }
    
    public static void mf(final GameEngine gameEngine, final WindowEvent windowEvent) {
        if (gameEngine == null) {
            gameEngine.ew(windowEvent);
        }
    }
    
    static int Messages_getLastChatID(final int n, final int n2) {
        try {
            final Message message = (Message)Messages.Messages_hashTable.aa(n);
            if (null == message) {
                if (n2 <= 263229985) {
                    throw new IllegalStateException();
                }
                return -1;
            }
            else {
                if (Messages.Messages_queue.sentinel != message.ej) {
                    return -1117255211 * ((Message)message.ej).type;
                }
                if (n2 <= 263229985) {
                    throw new IllegalStateException();
                }
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ir.ay(" + ')');
        }
    }
    
    public static int method1294(final int n, final int n2) {
        try {
            return (int)(ViewportMouse.ViewportMouse_entityTags[n] >>> 0 & 0x7FL);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ir.au(" + ')');
        }
    }
    
    public static long calculateTag(final int n, final int n2, final int n3, final boolean b, final int n4, final int n5) {
        try {
            long n6 = (long)((n & 0x7F) << 0 | (n2 & 0x7F) << 7 | (n3 & 0x3) << 14) | ((long)n4 & 0xFFFFFFFFL) << 17;
            if (b) {
                if (n5 <= -1492123941) {
                    throw new IllegalStateException();
                }
                n6 |= 0x10000L;
            }
            return n6;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ir.aa(" + ')');
        }
    }
    
    static World worldListStart(final int n) {
        try {
            World.World_listCount = 0;
            return Interpreter.getNextWorldListWorld(1971574397);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ir.aq(" + ')');
        }
    }
}
