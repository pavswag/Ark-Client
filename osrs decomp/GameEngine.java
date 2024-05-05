import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.awt.Rectangle;
import java.util.Iterator;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.image.ImageObserver;
import java.awt.Font;
import java.net.URL;
import net.runelite.api.events.FocusChanged;
import java.awt.event.FocusEvent;
import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Canvas;
import java.awt.event.WindowListener;
import java.awt.event.FocusListener;
import java.applet.Applet;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener, net.runelite.api.GameEngine
{
    Canvas canvas;
    static GameEngine gameEngine;
    public Thread pr;
    static int GameEngine_redundantStartThreadCount;
    int maxCanvasHeight;
    boolean hasErrored;
    protected static TaskHandler taskHandler;
    static int cycleDurationMillis;
    static int fiveOrOne;
    protected static int fps;
    volatile long field109;
    static long[] clientTickTimes;
    protected int contentWidth;
    static volatile boolean volatileFocus;
    protected int contentHeight;
    int canvasY;
    public static int canvasWidth;
    int field116;
    int field117;
    int maxCanvasWidth;
    Frame frame;
    protected boolean field120;
    protected static KeyHandler keyHandler;
    static long[] graphicsTickTimes;
    volatile boolean fullRedraw;
    static int field124;
    boolean resizeCanvasNextFrame;
    volatile boolean isCanvasInvalid;
    static boolean isKilled;
    MouseWheelHandler mouseWheelHandler;
    int canvasX;
    final EventQueue eventQueue;
    static long stopTimeMs;
    Clipboard clipboard;
    static long garbageCollectorLastCollectionTime;
    static long garbageCollectorLastCheckTimeMs;
    static int Client_plane;
    
    protected GameEngine() {
        this.hasErrored = false;
        this.canvasX = 0;
        this.canvasY = 0;
        this.field120 = false;
        this.fullRedraw = true;
        this.resizeCanvasNextFrame = false;
        this.isCanvasInvalid = false;
        this.field109 = 0L;
        EventQueue systemEventQueue = null;
        try {
            systemEventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        catch (Throwable t) {}
        this.eventQueue = systemEventQueue;
        PcmPlayer.pcmPlayerProvider = new DevicePcmPlayerProvider();
    }
    
    static {
        GameEngine.gameEngine = null;
        GameEngine.GameEngine_redundantStartThreadCount = 0;
        GameEngine.stopTimeMs = 0L;
        GameEngine.isKilled = false;
        GameEngine.cycleDurationMillis = -2033050820;
        GameEngine.fiveOrOne = -341822119;
        GameEngine.fps = 0;
        GameEngine.graphicsTickTimes = new long[32];
        GameEngine.clientTickTimes = new long[32];
        GameEngine.field124 = -1669766140;
        GameEngine.volatileFocus = true;
        GameEngine.keyHandler = new KeyHandler();
        GameEngine.garbageCollectorLastCollectionTime = -3922098655801851377L;
        GameEngine.garbageCollectorLastCheckTimeMs = 4496549445389278039L;
    }
    
    @Override
    public void run() {
        this.gx();
        try {
            try {
                if (null != TaskHandler.javaVendor) {
                    final String lowerCase = TaskHandler.javaVendor.toLowerCase();
                    if (lowerCase.indexOf("sun") != -1 || lowerCase.indexOf("apple") != -1) {
                        final String javaVersion = TaskHandler.javaVersion;
                        if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.") || javaVersion.equals("1.3") || javaVersion.startsWith("1.3.") || javaVersion.equals("1.4") || javaVersion.startsWith("1.4.") || javaVersion.equals("1.5") || javaVersion.startsWith("1.5.") || javaVersion.equals("1.6.0")) {
                            this.error("wrongjava", -1294118678);
                            return;
                        }
                        if (javaVersion.startsWith("1.6.0_")) {
                            int n;
                            for (n = 6; n < javaVersion.length() && class149.isDigit(javaVersion.charAt(n), -200557618); ++n) {}
                            final String substring = javaVersion.substring(6, n);
                            if (WorldMapSectionType.isNumber(substring, 88944891) && PacketBufferNode.release(substring, (byte)27) < 10) {
                                this.error("wrongjava", -748289620);
                                return;
                            }
                        }
                        GameEngine.fiveOrOne = -1709110595;
                    }
                }
                this.setFocusCycleRoot(true);
                this.addCanvas(-1549595366);
                this.setUp((byte)42);
                class399.clock = class148.method840(450057476);
                while (951500247553634275L * GameEngine.stopTimeMs == 0L || class96.clockNow(55191168) < 951500247553634275L * GameEngine.stopTimeMs) {
                    DirectByteArrayCopier.gameCyclesToDo = class399.clock.wait(GameEngine.cycleDurationMillis * 2118369515, -1500331287 * GameEngine.fiveOrOne, -1491982008) * 89306205;
                    for (int i = 0; i < DirectByteArrayCopier.gameCyclesToDo * -873938955; ++i) {
                        nc(this, 1294253430);
                    }
                    this.graphicsTick((byte)29);
                    xn(this, this.canvas, 1513004820);
                }
            }
            catch (Exception ex) {
                class387.RunException_sendStackTrace(null, ex, (byte)8);
                this.error("crash", -2128881192);
            }
            this.kill(812160949);
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "bm.run(" + ')');
        }
    }
    
    public abstract void fp();
    
    protected void cs(final String data) {
        this.clipboard.setContents(new StringSelection(data), null);
    }
    
    public final void update(final Graphics graphics) {
        try {
            this.paint(graphics);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.update(" + ')');
        }
    }
    
    void dp() {
        final long clockNow = class96.clockNow(2119797645);
        final long n = GameEngine.clientTickTimes[702273735 * class335.field3093];
        GameEngine.clientTickTimes[-105094121 * class335.field3093] = clockNow;
        class335.field3093 = -1240221692 * (class335.field3093 * -2112543606 + 1 & 0x1F);
        if (n == 0L || clockNow > n) {}
        synchronized (this) {
            AbstractByteArrayCopier.hasFocus = GameEngine.volatileFocus;
        }
        this.doCycle(-2081916691);
    }
    
    protected final void method185(final int n) {
        try {
            PacketWriter.field1141 = null;
            class244.fontHelvetica13 = null;
            class27.loginScreenFontMetrics = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.bs(" + ')');
        }
    }
    
    protected Clipboard ca() {
        return this.clipboard;
    }
    
    protected void method163(final boolean field120, final byte b) {
        try {
            if (field120 != this.field120) {
                if (b != 14) {
                    return;
                }
                this.field120 = field120;
                AbstractRasterProvider.nv(RouteStrategy.rasterProvider, field120, -1022741876);
                RouteStrategy.rasterProvider.apply((byte)0);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ad(" + ')');
        }
    }
    
    protected final void cd(final int n, final int n2, final int n3, final int n4) {
        try {
            if (null != GameEngine.gameEngine) {
                GameEngine.GameEngine_redundantStartThreadCount += 1564523937;
                if (GameEngine.GameEngine_redundantStartThreadCount * 1470919505 >= 3) {
                    this.error("alreadyloaded", 1617725624);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            }
            else {
                GameEngine.gameEngine = this;
                GameEngine.canvasWidth = n * 2082454245;
                class262.canvasHeight = -16547605 * n2;
                RunException.RunException_revision = n3 * -850532629;
                class441.field3835 = -1496319204 * n4;
                class100.RunException_applet = this;
                if (null == GameEngine.taskHandler) {
                    GameEngine.taskHandler = new TaskHandler();
                }
                GameEngine.taskHandler.newThreadTask(this, 1, (byte)0);
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
            this.error("crash", 1205057188);
        }
    }
    
    protected abstract void vmethod1485(final int p0);
    
    protected final boolean checkHost(final int n) {
        try {
            String s = this.getDocumentBase().getHost().toLowerCase();
            if (!s.equals("jagex.com")) {
                if (n >= 975266980) {
                    throw new IllegalStateException();
                }
                if (!s.endsWith(".jagex.com")) {
                    if (!s.equals("runescape.com")) {
                        if (n >= 975266980) {
                            throw new IllegalStateException();
                        }
                        if (s.endsWith(".runescape.com")) {
                            if (n >= 975266980) {
                                throw new IllegalStateException();
                            }
                        }
                        else {
                            if (s.endsWith("127.0.0.1")) {
                                return true;
                            }
                            while (s.length() > 0) {
                                if (n >= 975266980) {
                                    throw new IllegalStateException();
                                }
                                if (s.charAt(s.length() - 1) < '0') {
                                    break;
                                }
                                if (n >= 975266980) {
                                    throw new IllegalStateException();
                                }
                                if (s.charAt(s.length() - 1) > '9') {
                                    break;
                                }
                                if (n >= 975266980) {
                                    throw new IllegalStateException();
                                }
                                s = s.substring(0, s.length() - 1);
                            }
                            if (s.endsWith("192.168.1.")) {
                                return true;
                            }
                            this.error("invalidhost", 1689121582);
                            return false;
                        }
                    }
                    return true;
                }
                if (n >= 975266980) {
                    throw new IllegalStateException();
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ae(" + ')');
        }
    }
    
    protected final void cr() {
        class394.method2104(this.canvas, -1018034590);
    }
    
    protected void ce() {
        this.clipboard = this.getToolkit().getSystemClipboard();
    }
    
    final void method166(final int n) {
        try {
            final Bounds frameContentBounds = this.getFrameContentBounds(-1516355947);
            if (frameContentBounds.highX * 944313703 == -927540391 * this.contentWidth) {
                if (n >= 1164114216) {
                    return;
                }
                if (-1747234661 * this.contentHeight == frameContentBounds.highY * -1376251093) {
                    if (n >= 1164114216) {
                        throw new IllegalStateException();
                    }
                    if (!this.resizeCanvasNextFrame) {
                        return;
                    }
                    if (n >= 1164114216) {
                        return;
                    }
                }
            }
            this.resizeCanvas(1698796359);
            this.resizeCanvasNextFrame = false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.bb(" + ')');
        }
    }
    
    protected abstract void cb();
    
    final synchronized void da() {
        if (GameEngine.isKilled) {
            return;
        }
        GameEngine.isKilled = true;
        try {
            this.canvas.removeFocusListener(this);
        }
        catch (Exception ex) {}
        try {
            this.kill0(-72974483);
        }
        catch (Exception ex2) {}
        if (this.frame != null) {
            try {
                System.exit(0);
            }
            catch (Throwable t) {}
        }
        if (null != GameEngine.taskHandler) {
            try {
                GameEngine.taskHandler.close(831049950);
            }
            catch (Exception ex3) {}
        }
        this.vmethod1485(-1086551379);
    }
    
    final void ch() {
        GameEngine.keyHandler.method106(this.canvas, -888034364);
        final Canvas canvas = this.canvas;
        canvas.removeMouseListener(MouseHandler.MouseHandler_instance);
        canvas.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
        canvas.removeFocusListener(MouseHandler.MouseHandler_instance);
        MouseHandler.MouseHandler_currentButtonVolatile = 0;
        if (this.mouseWheelHandler != null) {
            this.mouseWheelHandler.method85(this.canvas, 109187860);
        }
        this.addCanvas(-1803506032);
        KeyHandler.jn(GameEngine.keyHandler, this.canvas, (byte)64);
        class394.method2104(this.canvas, -1907610252);
        if (this.mouseWheelHandler != null) {
            MouseWheelHandler.zd(this.mouseWheelHandler, this.canvas, -215761426);
        }
        this.method181(-1334984441);
    }
    
    public final void el(final WindowEvent windowEvent) {
    }
    
    protected Clipboard cn() {
        return this.clipboard;
    }
    
    public final void ex(final WindowEvent windowEvent) {
    }
    
    @Override
    public abstract void init();
    
    protected abstract void gc();
    
    protected abstract void fd();
    
    void db() {
        final long clockNow = class96.clockNow(-417439777);
        final long n = GameEngine.clientTickTimes[702273735 * class335.field3093];
        GameEngine.clientTickTimes[702273735 * class335.field3093] = clockNow;
        class335.field3093 = 94857463 * (class335.field3093 * 702273735 + 1 & 0x1F);
        if (n == 0L || clockNow > n) {}
        synchronized (this) {
            AbstractByteArrayCopier.hasFocus = GameEngine.volatileFocus;
        }
        this.doCycle(-2098685834);
    }
    
    @Override
    public final void start() {
        try {
            if (GameEngine.gameEngine == this && !GameEngine.isKilled) {
                GameEngine.stopTimeMs = 0L;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.start(" + ')');
        }
    }
    
    @Override
    public final void stop() {
        try {
            if (GameEngine.gameEngine == this && !GameEngine.isKilled) {
                GameEngine.stopTimeMs = (class96.clockNow(-160464610) + 4000L) * -2406892942717923893L;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.stop(" + ')');
        }
    }
    
    public static void on(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.et();
            return;
        }
        if (gameEngine == GameEngine.gameEngine && !GameEngine.isKilled) {
            GameEngine.stopTimeMs = class96.clockNow(837356449) * -2406892942717923893L;
            PlayerComposition.method1692(5000L);
            gameEngine.kill(69370348);
        }
    }
    
    @Override
    public final void destroy() {
        try {
            if (this == GameEngine.gameEngine && !GameEngine.isKilled) {
                GameEngine.stopTimeMs = class96.clockNow(-451893560) * -2406892942717923893L;
                PlayerComposition.method1692(5000L);
                this.kill(497965592);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.destroy(" + ')');
        }
    }
    
    protected void bw() {
        this.clipboard = this.getToolkit().getSystemClipboard();
    }
    
    protected void cf(final class29 class29, final int n) {
        KeyHandler.mu(GameEngine.keyHandler, class29, n, -123589902);
    }
    
    void cw() {
        final int n = 5159447 * this.canvasX;
        final int n2 = 895830209 * this.canvasY;
        final int n3 = -927540391 * this.contentWidth - -1687260435 * GameEngine.canvasWidth - n;
        final int n4 = this.contentHeight * -1747234661 - class262.canvasHeight * -1396000821 - n2;
        if (n <= 0 && n3 <= 0 && n2 <= 0) {
            if (n4 <= 0) {
                return;
            }
        }
        try {
            final Container container = this.container((byte)6);
            int left = 0;
            int top = 0;
            if (container == this.frame) {
                final Insets insets = this.frame.getInsets();
                left = insets.left;
                top = insets.top;
            }
            final Graphics graphics = container.getGraphics();
            graphics.setColor(Color.black);
            if (n > 0) {
                graphics.fillRect(left, top, n, -1747234661 * this.contentHeight);
            }
            if (n2 > 0) {
                graphics.fillRect(left, top, 150481567 * this.contentWidth, n2);
            }
            if (n3 > 0) {
                graphics.fillRect(left + this.contentWidth * -927540391 - n3, top, n3, this.contentHeight * 1466747240);
            }
            if (n4 > 0) {
                graphics.fillRect(left, top + this.contentHeight * 2005870194 - n4, -927540391 * this.contentWidth, n4);
            }
        }
        catch (Exception ex) {}
    }
    
    protected void method179(final String data, final byte b) {
        try {
            this.clipboard.setContents(new StringSelection(data), null);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ao(" + ')');
        }
    }
    
    protected abstract void fw();
    
    Container ft() {
        if (null != this.frame) {
            return this.frame;
        }
        return this;
    }
    
    final void post(final Object source, final int n) {
        if (!ScriptFrame.client.hasHintArrow() && this.eventQueue != null) {
            for (int n2 = 0; n2 < 50 && this.eventQueue.peekEvent() != null; ++n2) {
                try {
                    Thread.sleep(1L);
                }
                catch (InterruptedException ex) {}
            }
            if (source != null) {
                this.eventQueue.postEvent(new ActionEvent(source, 1001, "dummy"));
            }
        }
        if (Client.rz != null) {
            Client.rz.draw(Client.field444);
        }
    }
    
    public void startThread(final FocusEvent focusEvent) {
        final FocusChanged focusChanged = new FocusChanged();
        focusChanged.setFocused(true);
        ScriptFrame.client.getCallbacks().post((Object)focusChanged);
    }
    
    protected final void startThread(final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            try {
                if (null != GameEngine.gameEngine) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    GameEngine.GameEngine_redundantStartThreadCount -= 914573903;
                    if (GameEngine.GameEngine_redundantStartThreadCount * 1470919505 < 3) {
                        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                        return;
                    }
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    this.error("alreadyloaded", 858563294);
                }
                else {
                    GameEngine.gameEngine = this;
                    GameEngine.canvasWidth = n * 2082454245;
                    Client.vk(-1);
                    class262.canvasHeight = -16547605 * n2;
                    Client.kp(-1);
                    RunException.RunException_revision = n3 * -136548689;
                    class441.field3835 = 767373001 * n4;
                    class100.RunException_applet = this;
                    if (null == GameEngine.taskHandler) {
                        GameEngine.taskHandler = new TaskHandler();
                    }
                    GameEngine.taskHandler.newThreadTask(this, 1, (byte)0);
                }
            }
            catch (Exception ex) {
                class387.RunException_sendStackTrace(null, ex, (byte)8);
                this.error("crash", -1769013593);
            }
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "bm.ak(" + ')');
        }
    }
    
    protected final void method186(final byte b) {
        try {
            class394.method2104(this.canvas, 1714263236);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.av(" + ')');
        }
    }
    
    protected final void dw(final int n, final int n2, final int n3, final int n4) {
        try {
            if (null != GameEngine.gameEngine) {
                GameEngine.GameEngine_redundantStartThreadCount -= 914573903;
                if (GameEngine.GameEngine_redundantStartThreadCount * -59836021 >= 3) {
                    this.error("alreadyloaded", 146922259);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            }
            else {
                GameEngine.gameEngine = this;
                GameEngine.canvasWidth = n * -759017878;
                class262.canvasHeight = -1784005023 * n2;
                RunException.RunException_revision = n3 * -136548689;
                class441.field3835 = 767373001 * n4;
                class100.RunException_applet = this;
                if (null == GameEngine.taskHandler) {
                    GameEngine.taskHandler = new TaskHandler();
                }
                GameEngine.taskHandler.newThreadTask(this, 1, (byte)0);
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
            this.error("crash", -62440740);
        }
    }
    
    public static void dw(final GameEngine gameEngine, final boolean field120) {
        if (field120 != gameEngine.field120) {
            gameEngine.field120 = field120;
            AbstractRasterProvider.nv(RouteStrategy.rasterProvider, field120, -2106633368);
            RouteStrategy.rasterProvider.apply((byte)0);
        }
    }
    
    final void cj() {
        GameEngine.keyHandler.method106(this.canvas, 1146077895);
        final Canvas canvas = this.canvas;
        canvas.removeMouseListener(MouseHandler.MouseHandler_instance);
        canvas.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
        canvas.removeFocusListener(MouseHandler.MouseHandler_instance);
        MouseHandler.MouseHandler_currentButtonVolatile = 0;
        if (this.mouseWheelHandler != null) {
            this.mouseWheelHandler.method85(this.canvas, 109187860);
        }
        this.addCanvas(759046030);
        KeyHandler.jn(GameEngine.keyHandler, this.canvas, (byte)64);
        class394.method2104(this.canvas, -266758715);
        if (this.mouseWheelHandler != null) {
            MouseWheelHandler.zd(this.mouseWheelHandler, this.canvas, -1965095158);
        }
        this.method181(-908164626);
    }
    
    public static void le(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.ca();
        }
        final Container container = gameEngine.container((byte)6);
        if (null == container) {
            return;
        }
        final Bounds frameContentBounds = gameEngine.getFrameContentBounds(-1516355947);
        gameEngine.contentWidth = Math.max(944313703 * frameContentBounds.highX, 69014751 * gameEngine.field116) * -2050638615;
        gameEngine.contentHeight = Math.max(frameContentBounds.highY * -1376251093, 1673949127 * gameEngine.field117) * -1550051949;
        if (-927540391 * gameEngine.contentWidth <= 0) {
            gameEngine.contentWidth = -2050638615;
        }
        if (-1747234661 * gameEngine.contentHeight <= 0) {
            gameEngine.contentHeight = -1550051949;
        }
        GameEngine.canvasWidth = Math.min(-927540391 * gameEngine.contentWidth, 2087275977 * gameEngine.maxCanvasWidth) * 2082454245;
        class262.canvasHeight = Math.min(-1747234661 * gameEngine.contentHeight, 83534669 * gameEngine.maxCanvasHeight) * -16547605;
        gameEngine.canvasX = (gameEngine.contentWidth * -927540391 - -1687260435 * GameEngine.canvasWidth) / 2 * 1463717787;
        gameEngine.canvasY = 0;
        gameEngine.canvas.setSize(GameEngine.canvasWidth * -1687260435, class262.canvasHeight * 1658005443);
        RouteStrategy.rasterProvider = new RasterProvider(-1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight, gameEngine.canvas, gameEngine.field120);
        if (container == gameEngine.frame) {
            final Insets insets = gameEngine.frame.getInsets();
            gameEngine.canvas.setLocation(insets.left + -744210797 * gameEngine.canvasX, gameEngine.canvasY * 895830209 + insets.top);
        }
        else {
            gameEngine.canvas.setLocation(gameEngine.canvasX * -744210797, 895830209 * gameEngine.canvasY);
        }
        gameEngine.fullRedraw = true;
        gameEngine.resizeGame((byte)72);
    }
    
    final synchronized void kill(final int n) {
        try {
            if (!GameEngine.isKilled) {
                GameEngine.isKilled = true;
                try {
                    this.canvas.removeFocusListener(this);
                }
                catch (Exception ex2) {}
                try {
                    this.kill0(-72974483);
                }
                catch (Exception ex3) {}
                if (this.frame != null) {
                    if (n == -1279409393) {
                        throw new IllegalStateException();
                    }
                    try {
                        System.exit(0);
                    }
                    catch (Throwable t) {}
                }
                if (null != GameEngine.taskHandler) {
                    if (n == -1279409393) {
                        throw new IllegalStateException();
                    }
                    try {
                        GameEngine.taskHandler.close(-1782899864);
                    }
                    catch (Exception ex4) {}
                }
                this.vmethod1485(-1086551379);
                return;
            }
            if (n == -1279409393) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.be(" + ')');
        }
    }
    
    protected abstract void gf();
    
    public static void is(final GameEngine gameEngine, final boolean field120, final byte b) {
        if (gameEngine == null) {
            gameEngine.method163(field120, b);
            return;
        }
        try {
            if (field120 != gameEngine.field120) {
                if (b != 14) {
                    return;
                }
                gameEngine.field120 = field120;
                AbstractRasterProvider.nv(RouteStrategy.rasterProvider, field120, -1022741876);
                RouteStrategy.rasterProvider.apply((byte)0);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ad(" + ')');
        }
    }
    
    final void cp() {
        GameEngine.keyHandler.method106(this.canvas, -44493606);
        final Canvas canvas = this.canvas;
        canvas.removeMouseListener(MouseHandler.MouseHandler_instance);
        canvas.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
        canvas.removeFocusListener(MouseHandler.MouseHandler_instance);
        MouseHandler.MouseHandler_currentButtonVolatile = 0;
        if (this.mouseWheelHandler != null) {
            this.mouseWheelHandler.method85(this.canvas, 109187860);
        }
        this.addCanvas(-1851740702);
        KeyHandler.jn(GameEngine.keyHandler, this.canvas, (byte)64);
        class394.method2104(this.canvas, 1028597963);
        if (this.mouseWheelHandler != null) {
            MouseWheelHandler.zd(this.mouseWheelHandler, this.canvas, 2108619234);
        }
        this.method181(-1703383794);
    }
    
    public static void cp(final String s, final Throwable t) {
        class387.RunException_sendStackTrace(s, t, (byte)8);
    }
    
    void clearBackground(final byte b) {
        try {
            final int n = -744210797 * this.canvasX;
            final int n2 = 895830209 * this.canvasY;
            final int n3 = -927540391 * this.contentWidth - -1687260435 * GameEngine.canvasWidth - n;
            final int n4 = this.contentHeight * -1747234661 - class262.canvasHeight * 1658005443 - n2;
            if (n <= 0) {
                if (b != 23) {
                    throw new IllegalStateException();
                }
                if (n3 <= 0) {
                    if (b != 23) {
                        throw new IllegalStateException();
                    }
                    if (n2 <= 0) {
                        if (n4 <= 0) {
                            return;
                        }
                        if (b != 23) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
            try {
                final Container container = this.container((byte)6);
                int left = 0;
                int top = 0;
                if (container == this.frame) {
                    if (b != 23) {
                        throw new IllegalStateException();
                    }
                    final Insets insets = this.frame.getInsets();
                    left = insets.left;
                    top = insets.top;
                }
                final Graphics graphics = container.getGraphics();
                graphics.setColor(Color.black);
                if (n > 0) {
                    graphics.fillRect(left, top, n, -1747234661 * this.contentHeight);
                }
                if (n2 > 0) {
                    if (b != 23) {
                        throw new IllegalStateException();
                    }
                    graphics.fillRect(left, top, -927540391 * this.contentWidth, n2);
                }
                if (n3 > 0) {
                    if (b != 23) {
                        throw new IllegalStateException();
                    }
                    graphics.fillRect(left + this.contentWidth * -927540391 - n3, top, n3, this.contentHeight * -1747234661);
                }
                if (n4 > 0) {
                    graphics.fillRect(left, top + this.contentHeight * -1747234661 - n4, -927540391 * this.contentWidth, n4);
                }
            }
            catch (Exception ex2) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.as(" + ')');
        }
    }
    
    public final void eh(final WindowEvent windowEvent) {
    }
    
    protected void fk(final String s) {
        if (this.hasErrored) {
            return;
        }
        this.hasErrored = true;
        System.out.println("error_game_" + s);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + s + ".ws"), "_self");
        }
        catch (Exception ex) {}
    }
    
    protected final void fv(final int n, final String s, final boolean b) {
        try {
            final Graphics graphics = this.canvas.getGraphics();
            if (null == class244.fontHelvetica13) {
                class244.fontHelvetica13 = new Font("Helvetica", 1, 13);
                class27.loginScreenFontMetrics = this.canvas.getFontMetrics(class244.fontHelvetica13);
            }
            if (b) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, -1687260435 * GameEngine.canvasWidth, 1984746741 * class262.canvasHeight);
            }
            final Color color = new Color(1008144199, 17, 17);
            try {
                if (PacketWriter.field1141 == null) {
                    PacketWriter.field1141 = this.canvas.createImage(304, 1607740619);
                }
                final Graphics graphics2 = PacketWriter.field1141.getGraphics();
                graphics2.setColor(color);
                graphics2.drawRect(0, 0, 303, 33);
                graphics2.fillRect(2, 2, 3 * n, 30);
                graphics2.setColor(Color.black);
                graphics2.drawRect(1, 1, 301, 1392632740);
                graphics2.fillRect(n * 3 + 2, 2, 300 - 3 * n, 30);
                graphics2.setFont(class244.fontHelvetica13);
                graphics2.setColor(Color.white);
                graphics2.drawString(s, (304 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22);
                graphics.drawImage(PacketWriter.field1141, GameEngine.canvasWidth * 515736743 / 2 - 152, class262.canvasHeight * 1658005443 / 2 - 18, null);
            }
            catch (Exception ex) {
                final int x = 1223070138 * GameEngine.canvasWidth / 2 - 308081473;
                final int y = 527246150 * class262.canvasHeight / 2 - 18;
                graphics.setColor(color);
                graphics.drawRect(x, y, 1858310946, 33);
                graphics.fillRect(x + 2, 2 + y, n * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(1 + x, y + 1, 301, 31);
                graphics.fillRect(3 * n + (2 + x), y + 2, -2135006800 - 3 * n, 30);
                graphics.setFont(class244.fontHelvetica13);
                graphics.setColor(Color.white);
                graphics.drawString(s, x + (304 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22 + y);
            }
        }
        catch (Exception ex2) {
            this.canvas.repaint();
        }
    }
    
    public abstract void fh();
    
    public void nm(final int n) {
        this.maxCanvasWidth = n * -753509255;
    }
    
    public final void ee(final WindowEvent windowEvent) {
    }
    
    final synchronized void addCanvas(final int n) {
        try {
            final Container container = this.container((byte)6);
            if (null != this.canvas) {
                if (n == 902164980) {
                    throw new IllegalStateException();
                }
                this.canvas.removeFocusListener(this);
                container.remove(this.canvas);
            }
            GameEngine.canvasWidth = Math.max(container.getWidth(), this.field116 * 69014751) * 2082454245;
            Client.vk(-1);
            class262.canvasHeight = Math.max(container.getHeight(), this.field117 * 1673949127) * -16547605;
            Client.kp(-1);
            if (null != this.frame) {
                if (n == 902164980) {
                    throw new IllegalStateException();
                }
                final Insets insets = this.frame.getInsets();
                GameEngine.canvasWidth -= (insets.right + insets.left) * 2082454245;
                Client.vk(-1);
                class262.canvasHeight -= (insets.bottom + insets.top) * -16547605;
                Client.kp(-1);
            }
            this.canvas = new Canvas(this);
            container.setBackground(Color.BLACK);
            container.setLayout(null);
            container.add(this.canvas);
            this.canvas.setSize(-1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight);
            this.canvas.setVisible(true);
            this.canvas.setBackground(Color.BLACK);
            if (this.frame == container) {
                if (n == 902164980) {
                    throw new IllegalStateException();
                }
                final Insets insets2 = this.frame.getInsets();
                this.canvas.setLocation(insets2.left + -744210797 * this.canvasX, insets2.top + 895830209 * this.canvasY);
            }
            else {
                this.canvas.setLocation(this.canvasX * -744210797, this.canvasY * 895830209);
            }
            this.canvas.addFocusListener(this);
            this.canvas.requestFocus();
            this.fullRedraw = true;
            Label_0510: {
                if (null != RouteStrategy.rasterProvider) {
                    if (n == 902164980) {
                        throw new IllegalStateException();
                    }
                    if (1313069155 * RouteStrategy.rasterProvider.width == GameEngine.canvasWidth * -1687260435) {
                        if (n == 902164980) {
                            return;
                        }
                        if (1658005443 * class262.canvasHeight == 1695726685 * RouteStrategy.rasterProvider.height) {
                            if (n == 902164980) {
                                throw new IllegalStateException();
                            }
                            ((RasterProvider)RouteStrategy.rasterProvider).setComponent(this.canvas, (byte)44);
                            RouteStrategy.rasterProvider.drawFull(0, 0, -893520439);
                            break Label_0510;
                        }
                    }
                }
                RouteStrategy.rasterProvider = new RasterProvider(-1687260435 * GameEngine.canvasWidth, class262.canvasHeight * 1658005443, this.canvas, this.field120);
            }
            this.isCanvasInvalid = false;
            this.field109 = class96.clockNow(1655647545) * -515103886995160589L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.az(" + ')');
        }
    }
    
    protected Clipboard getClipboard(final int n) {
        try {
            return this.clipboard;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ax(" + ')');
        }
    }
    
    protected void setUpClipboard(final int n) {
        try {
            this.clipboard = this.getToolkit().getSystemClipboard();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ay(" + ')');
        }
    }
    
    protected void dt(final boolean field120) {
        if (field120 != this.field120) {
            this.field120 = field120;
            AbstractRasterProvider.nv(RouteStrategy.rasterProvider, field120, 897213302);
            RouteStrategy.rasterProvider.apply((byte)0);
        }
    }
    
    final void method181(final int n) {
        try {
            this.resizeCanvasNextFrame = true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.bi(" + ')');
        }
    }
    
    protected final void bv(final int n, final int n2) {
        if (n != 2087275977 * this.maxCanvasWidth || 83534669 * this.maxCanvasHeight != n2) {
            this.method181(-308326596);
        }
        this.maxCanvasWidth = n * -753509255;
        this.maxCanvasHeight = n2 * 524036191;
    }
    
    protected final void fc(final int n, final String s, final boolean b) {
        try {
            final Graphics graphics = this.canvas.getGraphics();
            if (null == class244.fontHelvetica13) {
                class244.fontHelvetica13 = new Font("Helvetica", 1, 13);
                class27.loginScreenFontMetrics = this.canvas.getFontMetrics(class244.fontHelvetica13);
            }
            if (b) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, 2094430171 * GameEngine.canvasWidth, 1916189544 * class262.canvasHeight);
            }
            final Color color = new Color(140, 17, 17);
            try {
                if (PacketWriter.field1141 == null) {
                    PacketWriter.field1141 = this.canvas.createImage(304, 34);
                }
                final Graphics graphics2 = PacketWriter.field1141.getGraphics();
                graphics2.setColor(color);
                graphics2.drawRect(0, 0, 2057049657, 33);
                graphics2.fillRect(2, 2, 3 * n, 30);
                graphics2.setColor(Color.black);
                graphics2.drawRect(1, 1, -661605756, -1246122833);
                graphics2.fillRect(n * 3 + 2, 2, 300 - 3 * n, 30);
                graphics2.setFont(class244.fontHelvetica13);
                graphics2.setColor(Color.white);
                graphics2.drawString(s, (-1946999059 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22);
                graphics.drawImage(PacketWriter.field1141, GameEngine.canvasWidth * -169001378 / 2 - 152, class262.canvasHeight * 1658005443 / 2 - 18, null);
            }
            catch (Exception ex) {
                final int x = -1687260435 * GameEngine.canvasWidth / 2 - 152;
                final int y = 1658005443 * class262.canvasHeight / 2 - 18;
                graphics.setColor(color);
                graphics.drawRect(x, y, 303, 33);
                graphics.fillRect(x + 2, 2 + y, n * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(1 + x, y + 1, -1299690707, 276043293);
                graphics.fillRect(3 * n + (2 + x), y + 2, 538904330 - 3 * n, 30);
                graphics.setFont(class244.fontHelvetica13);
                graphics.setColor(Color.white);
                graphics.drawString(s, x + (304 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22 + y);
            }
        }
        catch (Exception ex2) {
            this.canvas.repaint();
        }
    }
    
    final synchronized void dl() {
        final Container container = this.container((byte)6);
        if (null != this.canvas) {
            this.canvas.removeFocusListener(this);
            container.remove(this.canvas);
        }
        GameEngine.canvasWidth = Math.max(container.getWidth(), this.field116 * -1258157441) * 2082454245;
        class262.canvasHeight = Math.max(container.getHeight(), this.field117 * 1426239306) * -16547605;
        if (null != this.frame) {
            final Insets insets = this.frame.getInsets();
            GameEngine.canvasWidth -= (insets.right + insets.left) * -2082603289;
            class262.canvasHeight -= (insets.bottom + insets.top) * -16547605;
        }
        this.canvas = new Canvas(this);
        container.setBackground(Color.BLACK);
        container.setLayout(null);
        container.add(this.canvas);
        this.canvas.setSize(-1058781625 * GameEngine.canvasWidth, 2098881115 * class262.canvasHeight);
        this.canvas.setVisible(true);
        this.canvas.setBackground(Color.BLACK);
        if (this.frame == container) {
            final Insets insets2 = this.frame.getInsets();
            this.canvas.setLocation(insets2.left + 1893100664 * this.canvasX, insets2.top + -1828249033 * this.canvasY);
        }
        else {
            this.canvas.setLocation(this.canvasX * 1342665558, this.canvasY * 895830209);
        }
        this.canvas.addFocusListener(this);
        this.canvas.requestFocus();
        this.fullRedraw = true;
        if (null != RouteStrategy.rasterProvider && 163168565 * RouteStrategy.rasterProvider.width == GameEngine.canvasWidth * -1687260435 && -934386346 * class262.canvasHeight == 1695726685 * RouteStrategy.rasterProvider.height) {
            ((RasterProvider)RouteStrategy.rasterProvider).setComponent(this.canvas, (byte)127);
            RouteStrategy.rasterProvider.drawFull(0, 0, -2144659546);
        }
        else {
            RouteStrategy.rasterProvider = new RasterProvider(-1687260435 * GameEngine.canvasWidth, class262.canvasHeight * 1658005443, this.canvas, this.field120);
        }
        this.isCanvasInvalid = false;
        this.field109 = class96.clockNow(-123244483) * -515103886995160589L;
    }
    
    final synchronized void di() {
        final Container container = this.container((byte)6);
        if (null != this.canvas) {
            this.canvas.removeFocusListener(this);
            container.remove(this.canvas);
        }
        GameEngine.canvasWidth = Math.max(container.getWidth(), this.field116 * 69014751) * 2082454245;
        class262.canvasHeight = Math.max(container.getHeight(), this.field117 * 1673949127) * -16547605;
        if (null != this.frame) {
            final Insets insets = this.frame.getInsets();
            GameEngine.canvasWidth -= (insets.right + insets.left) * 2082454245;
            class262.canvasHeight -= (insets.bottom + insets.top) * -16547605;
        }
        this.canvas = new Canvas(this);
        container.setBackground(Color.BLACK);
        container.setLayout(null);
        container.add(this.canvas);
        this.canvas.setSize(-1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight);
        this.canvas.setVisible(true);
        this.canvas.setBackground(Color.BLACK);
        if (this.frame == container) {
            final Insets insets2 = this.frame.getInsets();
            this.canvas.setLocation(insets2.left + -744210797 * this.canvasX, insets2.top + 895830209 * this.canvasY);
        }
        else {
            this.canvas.setLocation(this.canvasX * -744210797, this.canvasY * 895830209);
        }
        this.canvas.addFocusListener(this);
        this.canvas.requestFocus();
        this.fullRedraw = true;
        if (null != RouteStrategy.rasterProvider && 1313069155 * RouteStrategy.rasterProvider.width == GameEngine.canvasWidth * -1687260435 && 1658005443 * class262.canvasHeight == 1695726685 * RouteStrategy.rasterProvider.height) {
            ((RasterProvider)RouteStrategy.rasterProvider).setComponent(this.canvas, (byte)84);
            RouteStrategy.rasterProvider.drawFull(0, 0, 1282122906);
        }
        else {
            RouteStrategy.rasterProvider = new RasterProvider(-1687260435 * GameEngine.canvasWidth, class262.canvasHeight * 1658005443, this.canvas, this.field120);
        }
        this.isCanvasInvalid = false;
        this.field109 = class96.clockNow(713684195) * -515103886995160589L;
    }
    
    public final void fs(final WindowEvent windowEvent) {
    }
    
    protected class170 bp() {
        if (this.mouseWheelHandler == null) {
            MouseWheelHandler.zd(this.mouseWheelHandler = new MouseWheelHandler(), this.canvas, -1292958576);
        }
        return this.mouseWheelHandler;
    }
    
    final void ct() {
        GameEngine.keyHandler.method106(this.canvas, -1425593570);
        final Canvas canvas = this.canvas;
        canvas.removeMouseListener(MouseHandler.MouseHandler_instance);
        canvas.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
        canvas.removeFocusListener(MouseHandler.MouseHandler_instance);
        MouseHandler.MouseHandler_currentButtonVolatile = 0;
        if (this.mouseWheelHandler != null) {
            this.mouseWheelHandler.method85(this.canvas, 109187860);
        }
        this.addCanvas(-1544686112);
        KeyHandler.jn(GameEngine.keyHandler, this.canvas, (byte)64);
        class394.method2104(this.canvas, -501067257);
        if (this.mouseWheelHandler != null) {
            MouseWheelHandler.zd(this.mouseWheelHandler, this.canvas, 757874510);
        }
        this.method181(-343258222);
    }
    
    protected Clipboard cc() {
        return this.clipboard;
    }
    
    protected abstract void fn(final boolean p0);
    
    protected abstract void draw(final boolean p0, final short p1);
    
    public void draw() {
        if (ScriptFrame.client.isStretchedEnabled()) {
            final Canvas canvas = this.getCanvas();
            final Dimension stretchedDimensions = ScriptFrame.client.getStretchedDimensions();
            canvas.setSize(stretchedDimensions);
            canvas.setLocation((canvas.getParent().getWidth() - stretchedDimensions.width) / 2, 0);
            canvas.validate();
        }
    }
    
    public static void xn(final GameEngine gameEngine, final Object source, final int n) {
        if (gameEngine == null) {
            gameEngine.post(source, n);
            return;
        }
        if (!ScriptFrame.client.isGpu() && gameEngine.eventQueue != null) {
            for (int n2 = 0; n2 < 50 && gameEngine.eventQueue.peekEvent() != null; ++n2) {
                try {
                    Thread.sleep(1L);
                }
                catch (InterruptedException ex) {}
            }
            if (source != null) {
                gameEngine.eventQueue.postEvent(new ActionEvent(source, 1001, "dummy"));
            }
        }
        if (Client.rz != null) {
            Client.rz.draw(Client.uh);
        }
    }
    
    final void ds() {
        this.resizeCanvasNextFrame = true;
    }
    
    public boolean oc() {
        return this.isCanvasInvalid;
    }
    
    void dh() {
        final long clockNow = class96.clockNow(957828286);
        final long n = GameEngine.clientTickTimes[702273735 * class335.field3093];
        GameEngine.clientTickTimes[702273735 * class335.field3093] = clockNow;
        class335.field3093 = 94857463 * (class335.field3093 * -879553567 + 1 & 0x1F);
        if (n == 0L || clockNow > n) {}
        synchronized (this) {
            AbstractByteArrayCopier.hasFocus = GameEngine.volatileFocus;
        }
        this.doCycle(-2145498198);
    }
    
    protected class170 bc() {
        if (this.mouseWheelHandler == null) {
            MouseWheelHandler.zd(this.mouseWheelHandler = new MouseWheelHandler(), this.canvas, 1308935098);
        }
        return this.mouseWheelHandler;
    }
    
    protected void error(final String s, final int n) {
        try {
            if (!this.hasErrored) {
                this.hasErrored = true;
                System.out.println("error_game_" + s);
                try {
                    this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + s + ".ws"), "_self");
                }
                catch (Exception ex2) {}
                return;
            }
            if (n == 1235713104) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.br(" + ')');
        }
    }
    
    public final void ei(final WindowEvent windowEvent) {
    }
    
    protected void ci() {
        this.clipboard = this.getToolkit().getSystemClipboard();
    }
    
    public final void aw(final Graphics graphics) {
        this.paint(graphics);
    }
    
    protected abstract void resizeGame(final byte p0);
    
    public static void mm(final GameEngine gameEngine, final int n, final int n2, final int n3, final int n4) {
        if (gameEngine == null) {
            gameEngine.ci();
            return;
        }
        try {
            if (null != GameEngine.gameEngine) {
                GameEngine.GameEngine_redundantStartThreadCount -= 914573903;
                if (GameEngine.GameEngine_redundantStartThreadCount * 1470919505 >= 3) {
                    gameEngine.error("alreadyloaded", 896729460);
                    return;
                }
                gameEngine.getAppletContext().showDocument(gameEngine.getDocumentBase(), "_self");
            }
            else {
                GameEngine.gameEngine = gameEngine;
                GameEngine.canvasWidth = n * 2082454245;
                class262.canvasHeight = -16547605 * n2;
                RunException.RunException_revision = n3 * -136548689;
                class441.field3835 = 767373001 * n4;
                class100.RunException_applet = gameEngine;
                if (null == GameEngine.taskHandler) {
                    GameEngine.taskHandler = new TaskHandler();
                }
                GameEngine.taskHandler.newThreadTask(gameEngine, 1, (byte)0);
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
            gameEngine.error("crash", 332720012);
        }
    }
    
    public final void em(final WindowEvent windowEvent) {
        this.destroy();
    }
    
    protected final void setMaxCanvasSize(int width, int height, final byte b) {
        if (ScriptFrame.client.isStretchedEnabled() && ScriptFrame.client.isResized()) {
            final Dimension realDimensions = ScriptFrame.client.getRealDimensions();
            width = realDimensions.width;
            height = realDimensions.height;
        }
        final int n = width;
        final int n2 = height;
        final int n3 = n;
        final int n4 = 2;
        try {
            Label_0087: {
                if (n3 == 2087275977 * this.maxCanvasWidth) {
                    if (83534669 * this.maxCanvasHeight == n2) {
                        break Label_0087;
                    }
                    if (n4 != 2) {
                        throw new IllegalStateException();
                    }
                }
                this.method181(-480956714);
            }
            this.maxCanvasWidth = n3 * -753509255;
            this.maxCanvasHeight = n2 * -438874747;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.al(" + ')');
        }
    }
    
    static void setMaxCanvasSize(final int n) {
        try {
            final Iterator iterator = Messages.Messages_hashTable.iterator();
            while (iterator.hasNext()) {
                if (n == 608753495) {
                    return;
                }
                iterator.next().fillIsFromFriend((byte)(-124));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.al(" + ')');
        }
    }
    
    void df() {
        final Container container = this.container((byte)6);
        final long clockNow = class96.clockNow(783234153);
        final long n = GameEngine.graphicsTickTimes[Rasterizer3D.field2000 * -689745739];
        GameEngine.graphicsTickTimes[-689745739 * Rasterizer3D.field2000] = clockNow;
        Rasterizer3D.field2000 = -1417208419 * (1 + -689745739 * Rasterizer3D.field2000 & 0x1F);
        if (0L != n && clockNow > n) {
            final int n2 = (int)(clockNow - n);
            GameEngine.fps = (32000 + (n2 >> 1)) / n2 * 1691803635;
        }
        if ((GameEngine.field124 += 769754581) * 148605821 - 1 > 50) {
            GameEngine.field124 += 166976614;
            this.fullRedraw = true;
            this.canvas.setSize(GameEngine.canvasWidth * -1687260435, 1658005443 * class262.canvasHeight);
            this.canvas.setVisible(true);
            if (container == this.frame) {
                final Insets insets = this.frame.getInsets();
                this.canvas.setLocation(-744210797 * this.canvasX + insets.left, insets.top + 895830209 * this.canvasY);
            }
            else {
                this.canvas.setLocation(this.canvasX * -744210797, 895830209 * this.canvasY);
            }
        }
        if (this.isCanvasInvalid) {
            this.replaceCanvas(1698172633);
        }
        this.method166(-212550234);
        this.draw(this.fullRedraw, (short)24316);
        if (this.fullRedraw) {
            this.clearBackground((byte)23);
        }
        this.fullRedraw = false;
    }
    
    public final void et() {
        if (GameEngine.gameEngine != this || GameEngine.isKilled) {
            return;
        }
        GameEngine.stopTimeMs = 0L;
    }
    
    protected Clipboard cu() {
        return this.clipboard;
    }
    
    protected final void dm(final int n, final int n2, final int n3, final int n4) {
        try {
            if (null != GameEngine.gameEngine) {
                GameEngine.GameEngine_redundantStartThreadCount -= 914573903;
                if (GameEngine.GameEngine_redundantStartThreadCount * -1355550869 >= 3) {
                    this.error("alreadyloaded", 1041797247);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            }
            else {
                GameEngine.gameEngine = this;
                GameEngine.canvasWidth = n * 1138129439;
                class262.canvasHeight = -16547605 * n2;
                RunException.RunException_revision = n3 * -136548689;
                class441.field3835 = 767373001 * n4;
                class100.RunException_applet = this;
                if (null == GameEngine.taskHandler) {
                    GameEngine.taskHandler = new TaskHandler();
                }
                GameEngine.taskHandler.newThreadTask(this, 1, (byte)0);
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
            this.error("crash", 1005525310);
        }
    }
    
    public static void hr(final GameEngine gameEngine, final int n, final String s, final boolean b, final int n2) {
        Label_0012: {
            if (gameEngine != null) {
                break Label_0012;
            }
            gameEngine.drawInitial(n, s, b, n);
            try {
                try {
                    final Graphics graphics = gameEngine.canvas.getGraphics();
                    if (null == class244.fontHelvetica13) {
                        if (n2 >= -1948942042) {
                            throw new IllegalStateException();
                        }
                        class244.fontHelvetica13 = new Font("Helvetica", 1, 13);
                        class27.loginScreenFontMetrics = gameEngine.canvas.getFontMetrics(class244.fontHelvetica13);
                    }
                    if (b) {
                        if (n2 >= -1948942042) {
                            return;
                        }
                        graphics.setColor(Color.black);
                        graphics.fillRect(0, 0, -1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight);
                    }
                    final Color color = new Color(140, 17, 17);
                    try {
                        if (PacketWriter.field1141 == null) {
                            if (n2 >= -1948942042) {
                                return;
                            }
                            PacketWriter.field1141 = gameEngine.canvas.createImage(304, 34);
                        }
                        final Graphics graphics2 = PacketWriter.field1141.getGraphics();
                        graphics2.setColor(color);
                        graphics2.drawRect(0, 0, 303, 33);
                        graphics2.fillRect(2, 2, 3 * n, 30);
                        graphics2.setColor(Color.black);
                        graphics2.drawRect(1, 1, 301, 31);
                        graphics2.fillRect(n * 3 + 2, 2, 300 - 3 * n, 30);
                        graphics2.setFont(class244.fontHelvetica13);
                        graphics2.setColor(Color.white);
                        graphics2.drawString(s, (304 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22);
                        graphics.drawImage(PacketWriter.field1141, GameEngine.canvasWidth * -1687260435 / 2 - 152, class262.canvasHeight * 1658005443 / 2 - 18, null);
                    }
                    catch (Exception ex2) {
                        final int x = -1687260435 * GameEngine.canvasWidth / 2 - 152;
                        final int y = 1658005443 * class262.canvasHeight / 2 - 18;
                        graphics.setColor(color);
                        graphics.drawRect(x, y, 303, 33);
                        graphics.fillRect(x + 2, 2 + y, n * 3, 30);
                        graphics.setColor(Color.black);
                        graphics.drawRect(1 + x, y + 1, 301, 31);
                        graphics.fillRect(3 * n + (2 + x), y + 2, 300 - 3 * n, 30);
                        graphics.setFont(class244.fontHelvetica13);
                        graphics.setColor(Color.white);
                        graphics.drawString(s, x + (304 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22 + y);
                    }
                }
                catch (Exception ex3) {
                    gameEngine.canvas.repaint();
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "bm.bn(" + ')');
            }
        }
    }
    
    public void hr(final int n) {
        this.maxCanvasHeight = n * -438874747;
    }
    
    public final void an(final Graphics graphics) {
        this.paint(graphics);
    }
    
    public static void nc(final GameEngine gameEngine, final int n) {
        if (gameEngine == null) {
            gameEngine.clientTick(n);
        }
        try {
            final long clockNow = class96.clockNow(1811202151);
            final long n2 = GameEngine.clientTickTimes[702273735 * class335.field3093];
            GameEngine.clientTickTimes[702273735 * class335.field3093] = clockNow;
            class335.field3093 = 94857463 * (class335.field3093 * 702273735 + 1 & 0x1F);
            if (n2 != 0L) {
                if (n == 1003505289) {
                    throw new IllegalStateException();
                }
                if (clockNow > n2 && n == 1003505289) {
                    throw new IllegalStateException();
                }
            }
            synchronized (gameEngine) {
                AbstractByteArrayCopier.hasFocus = GameEngine.volatileFocus;
            }
            gameEngine.doCycle(-2106306379);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ap(" + ')');
        }
    }
    
    static void method189(final int n, final int n2, final int n3, final ObjectComposition obj, final int n4, final byte b) {
        final ObjectSound aj = Client.aj();
        aj.plane = n * 241949401;
        aj.x = n2 * 128 * 971082997;
        aj.y = n3 * 128 * -136365921;
        int n5 = obj.tj();
        int n6 = obj.cf();
        if (n4 == 1 || n4 == 3) {
            n5 = obj.cf();
            n6 = obj.tj();
        }
        aj.maxX = (n5 + n2) * 128 * 391008615;
        aj.maxY = (n6 + n3) * 128 * -898897883;
        aj.soundEffectId = obj.qk() * 24779379;
        aj.field673 = obj.yt() * 128 * -345588749;
        aj.field681 = obj.mj() * 682794757;
        aj.field682 = obj.ii() * -1569403681;
        aj.soundEffectIds = obj.fp();
        if (obj.getImpostorIds() != null) {
            aj.obj = obj;
        }
        assert Client.gk != null;
        Client.gk.oh.rd(aj);
    }
    
    public final synchronized void method189(final Graphics graphics) {
        if (GameEngine.gameEngine == this && !GameEngine.isKilled) {
            this.fullRedraw = true;
            if (class96.clockNow(646879891) - -6171487387477770437L * this.field109 > 1000L) {
                final Rectangle clipBounds = graphics.getClipBounds();
                if (clipBounds == null || (clipBounds.width >= GameEngine.canvasWidth * -334073675 && clipBounds.height >= 1658005443 * class262.canvasHeight)) {
                    this.isCanvasInvalid = true;
                }
            }
        }
    }
    
    public void sf() {
        if (ScriptFrame.client.isStretchedEnabled()) {
            ScriptFrame.client.invalidateStretching(false);
            if (ScriptFrame.client.isResized()) {
                final Dimension realDimensions = ScriptFrame.client.getRealDimensions();
                this.nm(realDimensions.width);
                this.hr(realDimensions.height);
            }
        }
    }
    
    public final void ec(final WindowEvent windowEvent) {
    }
    
    protected void dk(final boolean field120) {
        if (field120 != this.field120) {
            this.field120 = field120;
            AbstractRasterProvider.nv(RouteStrategy.rasterProvider, field120, -572724659);
            RouteStrategy.rasterProvider.apply((byte)0);
        }
    }
    
    final synchronized void do() {
        final Container container = this.container((byte)6);
        if (null != this.canvas) {
            this.canvas.removeFocusListener(this);
            container.remove(this.canvas);
        }
        GameEngine.canvasWidth = Math.max(container.getWidth(), this.field116 * -1519342189) * 2082454245;
        class262.canvasHeight = Math.max(container.getHeight(), this.field117 * 133553358) * -281054358;
        if (null != this.frame) {
            final Insets insets = this.frame.getInsets();
            GameEngine.canvasWidth -= (insets.right + insets.left) * 2082454245;
            class262.canvasHeight -= (insets.bottom + insets.top) * -16547605;
        }
        this.canvas = new Canvas(this);
        container.setBackground(Color.BLACK);
        container.setLayout(null);
        container.add(this.canvas);
        this.canvas.setSize(-1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight);
        this.canvas.setVisible(true);
        this.canvas.setBackground(Color.BLACK);
        if (this.frame == container) {
            final Insets insets2 = this.frame.getInsets();
            this.canvas.setLocation(insets2.left + -744210797 * this.canvasX, insets2.top + 1510249106 * this.canvasY);
        }
        else {
            this.canvas.setLocation(this.canvasX * -744210797, this.canvasY * 1530318169);
        }
        this.canvas.addFocusListener(this);
        this.canvas.requestFocus();
        this.fullRedraw = true;
        if (null != RouteStrategy.rasterProvider && -540244595 * RouteStrategy.rasterProvider.width == GameEngine.canvasWidth * -1687260435 && -1831173084 * class262.canvasHeight == -1216940728 * RouteStrategy.rasterProvider.height) {
            ((RasterProvider)RouteStrategy.rasterProvider).setComponent(this.canvas, (byte)63);
            RouteStrategy.rasterProvider.drawFull(0, 0, -261993821);
        }
        else {
            RouteStrategy.rasterProvider = new RasterProvider(-1687260435 * GameEngine.canvasWidth, class262.canvasHeight * 1658005443, this.canvas, this.field120);
        }
        this.isCanvasInvalid = false;
        this.field109 = class96.clockNow(1723093467) * -515103886995160589L;
    }
    
    public void gd() {
        try {
            if (null != TaskHandler.javaVendor) {
                final String lowerCase = TaskHandler.javaVendor.toLowerCase();
                if (lowerCase.indexOf("sun") != -1 || lowerCase.indexOf("apple") != -1) {
                    final String javaVersion = TaskHandler.javaVersion;
                    if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.") || javaVersion.equals("1.3") || javaVersion.startsWith("1.3.") || javaVersion.equals("1.4") || javaVersion.startsWith("1.4.") || javaVersion.equals("1.5") || javaVersion.startsWith("1.5.") || javaVersion.equals("1.6.0")) {
                        this.error("wrongjava", -1984286157);
                        return;
                    }
                    if (javaVersion.startsWith("1.6.0_")) {
                        int n;
                        for (n = 6; n < javaVersion.length() && class149.isDigit(javaVersion.charAt(n), -1725060782); ++n) {}
                        final String substring = javaVersion.substring(6, n);
                        if (WorldMapSectionType.isNumber(substring, -258102702) && PacketBufferNode.release(substring, (byte)84) < 10) {
                            this.error("wrongjava", 1225947011);
                            return;
                        }
                    }
                    GameEngine.fiveOrOne = -1709110595;
                }
            }
            this.setFocusCycleRoot(true);
            this.addCanvas(-453136424);
            this.setUp((byte)(-33));
            class399.clock = class148.method840(483410853);
            while (951500247553634275L * GameEngine.stopTimeMs == 0L || class96.clockNow(1697889039) < 951500247553634275L * GameEngine.stopTimeMs) {
                DirectByteArrayCopier.gameCyclesToDo = class399.clock.wait(GameEngine.cycleDurationMillis * 2118369515, -1500331287 * GameEngine.fiveOrOne, -869275510) * 89306205;
                for (int i = 0; i < DirectByteArrayCopier.gameCyclesToDo * -873938955; ++i) {
                    nc(this, -746993883);
                }
                this.graphicsTick((byte)29);
                xn(this, this.canvas, 2062931138);
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
            this.error("crash", 981813616);
        }
        this.kill(417700866);
    }
    
    protected void dz(final boolean field120) {
        if (field120 != this.field120) {
            this.field120 = field120;
            AbstractRasterProvider.nv(RouteStrategy.rasterProvider, field120, 125940170);
            RouteStrategy.rasterProvider.apply((byte)0);
        }
    }
    
    protected final void fr(final int n, final String s, final boolean b) {
        try {
            final Graphics graphics = this.canvas.getGraphics();
            if (null == class244.fontHelvetica13) {
                class244.fontHelvetica13 = new Font("Helvetica", 1, 13);
                class27.loginScreenFontMetrics = this.canvas.getFontMetrics(class244.fontHelvetica13);
            }
            if (b) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, -993006901 * GameEngine.canvasWidth, 2067971846 * class262.canvasHeight);
            }
            final Color color = new Color(1193952064, 17, 17);
            try {
                if (PacketWriter.field1141 == null) {
                    PacketWriter.field1141 = this.canvas.createImage(304, 34);
                }
                final Graphics graphics2 = PacketWriter.field1141.getGraphics();
                graphics2.setColor(color);
                graphics2.drawRect(0, 0, 760597504, 155827970);
                graphics2.fillRect(2, 2, 3 * n, 30);
                graphics2.setColor(Color.black);
                graphics2.drawRect(1, 1, -966513652, 1315851656);
                graphics2.fillRect(n * 3 + 2, 2, -1985740001 - 3 * n, 30);
                graphics2.setFont(class244.fontHelvetica13);
                graphics2.setColor(Color.white);
                graphics2.drawString(s, (304 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22);
                graphics.drawImage(PacketWriter.field1141, GameEngine.canvasWidth * -1687260435 / 2 + 765801451, class262.canvasHeight * 1658005443 / 2 - 18, null);
            }
            catch (Exception ex) {
                final int x = -1687260435 * GameEngine.canvasWidth / 2 - 719073224;
                final int y = 1658005443 * class262.canvasHeight / 2 - 18;
                graphics.setColor(color);
                graphics.drawRect(x, y, -516238593, -1487814245);
                graphics.fillRect(x + 2, 2 + y, n * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(1 + x, y + 1, -1137518944, 31);
                graphics.fillRect(3 * n + (2 + x), y + 2, -60976142 - 3 * n, 30);
                graphics.setFont(class244.fontHelvetica13);
                graphics.setColor(Color.white);
                graphics.drawString(s, x + (646464829 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22 + y);
            }
        }
        catch (Exception ex2) {
            this.canvas.repaint();
        }
    }
    
    protected final boolean de() {
        String s = this.getDocumentBase().getHost().toLowerCase();
        if (s.equals("jagex.com") || s.endsWith(".jagex.com")) {
            return true;
        }
        if (s.equals("runescape.com") || s.endsWith(".runescape.com")) {
            return true;
        }
        if (s.endsWith("127.0.0.1")) {
            return true;
        }
        while (s.length() > 0 && s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= -1107988483) {
            s = s.substring(0, s.length() - 1);
        }
        if (s.endsWith("192.168.1.")) {
            return true;
        }
        this.error("invalidhost", -1888210231);
        return false;
    }
    
    public static void de(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.ci();
            return;
        }
        final Container container = gameEngine.container((byte)6);
        if (null == container) {
            return;
        }
        final Bounds frameContentBounds = gameEngine.getFrameContentBounds(-1516355947);
        gameEngine.contentWidth = Math.max(944313703 * frameContentBounds.highX, 69014751 * gameEngine.field116) * -2050638615;
        gameEngine.contentHeight = Math.max(frameContentBounds.highY * -1376251093, 1673949127 * gameEngine.field117) * -1550051949;
        if (-927540391 * gameEngine.contentWidth <= 0) {
            gameEngine.contentWidth = -2050638615;
        }
        if (-1747234661 * gameEngine.contentHeight <= 0) {
            gameEngine.contentHeight = -1550051949;
        }
        GameEngine.canvasWidth = Math.min(-927540391 * gameEngine.contentWidth, 2087275977 * gameEngine.maxCanvasWidth) * 2082454245;
        class262.canvasHeight = Math.min(-1747234661 * gameEngine.contentHeight, 83534669 * gameEngine.maxCanvasHeight) * -16547605;
        gameEngine.canvasX = (gameEngine.contentWidth * -927540391 - -1687260435 * GameEngine.canvasWidth) / 2 * 1463717787;
        gameEngine.canvasY = 0;
        gameEngine.canvas.setSize(GameEngine.canvasWidth * -1687260435, class262.canvasHeight * 1658005443);
        RouteStrategy.rasterProvider = new RasterProvider(-1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight, gameEngine.canvas, gameEngine.field120);
        if (container == gameEngine.frame) {
            final Insets insets = gameEngine.frame.getInsets();
            gameEngine.canvas.setLocation(insets.left + -744210797 * gameEngine.canvasX, gameEngine.canvasY * 895830209 + insets.top);
        }
        else {
            gameEngine.canvas.setLocation(gameEngine.canvasX * -744210797, 895830209 * gameEngine.canvasY);
        }
        gameEngine.fullRedraw = true;
        gameEngine.resizeGame((byte)37);
    }
    
    protected final boolean ge() {
        return this.frame != null;
    }
    
    public abstract void fl();
    
    protected abstract void fo();
    
    protected static int gt() {
        int n = 0;
        Label_0079: {
            if (class291.garbageCollector != null) {
                if (class291.garbageCollector.isValid()) {
                    break Label_0079;
                }
            }
            try {
                for (final GarbageCollectorMXBean garbageCollector : ManagementFactory.getGarbageCollectorMXBeans()) {
                    if (garbageCollector.isValid()) {
                        class291.garbageCollector = garbageCollector;
                        GameEngine.garbageCollectorLastCheckTimeMs = 4496549445389278039L;
                        GameEngine.garbageCollectorLastCollectionTime = -3922098655801851377L;
                    }
                }
            }
            catch (Throwable t) {}
        }
        if (null != class291.garbageCollector) {
            final long clockNow = class96.clockNow(1193189321);
            final long collectionTime = class291.garbageCollector.getCollectionTime();
            if (-3199239881614683375L * GameEngine.garbageCollectorLastCollectionTime != -1L) {
                final long n2 = collectionTime - -3199239881614683375L * GameEngine.garbageCollectorLastCollectionTime;
                final long n3 = clockNow - 9118577410129870745L * GameEngine.garbageCollectorLastCheckTimeMs;
                if (n3 != 0L) {
                    n = (int)(100L * n2 / n3);
                }
            }
            GameEngine.garbageCollectorLastCollectionTime = 3922098655801851377L * collectionTime;
            GameEngine.garbageCollectorLastCheckTimeMs = -4496549445389278039L * clockNow;
        }
        return n;
    }
    
    protected abstract void fa();
    
    public static void za(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.cp();
            return;
        }
        if (GameEngine.gameEngine == gameEngine && !GameEngine.isKilled) {
            GameEngine.stopTimeMs = 0L;
        }
    }
    
    public boolean za() {
        return this.resizeCanvasNextFrame;
    }
    
    public void ed(final boolean resizeCanvasNextFrame) {
        this.resizeCanvasNextFrame = resizeCanvasNextFrame;
    }
    
    public final void ed(final WindowEvent windowEvent) {
    }
    
    public final void ea() {
        if (GameEngine.gameEngine != this || GameEngine.isKilled) {
            return;
        }
        GameEngine.stopTimeMs = 0L;
    }
    
    public final synchronized void au(final Graphics graphics) {
        if (GameEngine.gameEngine == this && !GameEngine.isKilled) {
            this.fullRedraw = true;
            if (class96.clockNow(-486258269) - -6171487387477770437L * this.field109 > 1000L) {
                final Rectangle clipBounds = graphics.getClipBounds();
                if (clipBounds == null || (clipBounds.width >= GameEngine.canvasWidth * -1687260435 && clipBounds.height >= 1658005443 * class262.canvasHeight)) {
                    this.isCanvasInvalid = true;
                }
            }
        }
    }
    
    protected void fm(final String s) {
        if (this.hasErrored) {
            return;
        }
        this.hasErrored = true;
        System.out.println("error_game_" + s);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + s + ".ws"), "_self");
        }
        catch (Exception ex) {}
    }
    
    public static void tx(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.gd();
        }
        class158.vmethod3254((byte)4);
        KeyHandler.jn(GameEngine.keyHandler, gameEngine.canvas, (byte)64);
    }
    
    protected class170 mouseWheel(final int n) {
        try {
            if (this.mouseWheelHandler == null) {
                if (n <= -1914628905) {
                    throw new IllegalStateException();
                }
                MouseWheelHandler.zd(this.mouseWheelHandler = new MouseWheelHandler(), this.canvas, -1336020209);
            }
            return this.mouseWheelHandler;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.aa(" + ')');
        }
    }
    
    public static void kf(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.destroy();
        }
        final Container container = gameEngine.container((byte)6);
        final long clockNow = class96.clockNow(2146069755);
        final long n = GameEngine.graphicsTickTimes[Rasterizer3D.field2000 * 1619524634];
        GameEngine.graphicsTickTimes[-1134613253 * Rasterizer3D.field2000] = clockNow;
        Rasterizer3D.field2000 = 1655534107 * (1 + -689745739 * Rasterizer3D.field2000 & 0x1F);
        if (0L != n && clockNow > n) {
            final int n2 = (int)(clockNow - n);
            GameEngine.fps = (-1382603890 + (n2 >> 1)) / n2 * 1691803635;
        }
        if ((GameEngine.field124 += 1062200873) * -464338692 - 1 > 50) {
            GameEngine.field124 += 166976614;
            gameEngine.fullRedraw = true;
            gameEngine.canvas.setSize(GameEngine.canvasWidth * -1687260435, 706318287 * class262.canvasHeight);
            gameEngine.canvas.setVisible(true);
            if (container == gameEngine.frame) {
                final Insets insets = gameEngine.frame.getInsets();
                gameEngine.canvas.setLocation(1881118304 * gameEngine.canvasX + insets.left, insets.top + 895830209 * gameEngine.canvasY);
            }
            else {
                gameEngine.canvas.setLocation(gameEngine.canvasX * -744210797, 1137168852 * gameEngine.canvasY);
            }
        }
        if (gameEngine.isCanvasInvalid) {
            gameEngine.replaceCanvas(945944437);
        }
        gameEngine.method166(-920130140);
        gameEngine.draw(gameEngine.fullRedraw, (short)24072);
        if (gameEngine.fullRedraw) {
            gameEngine.clearBackground((byte)23);
        }
        gameEngine.fullRedraw = false;
    }
    
    protected final void setUpKeyboard(final byte b) {
        try {
            class158.vmethod3254((byte)4);
            KeyHandler.jn(GameEngine.keyHandler, this.canvas, (byte)64);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ai(" + ')');
        }
    }
    
    public abstract void fi();
    
    final void dx() {
        final Bounds frameContentBounds = this.getFrameContentBounds(-1516355947);
        if (frameContentBounds.highX * -948238754 != 1882268173 * this.contentWidth || -1747234661 * this.contentHeight != frameContentBounds.highY * -1376251093 || this.resizeCanvasNextFrame) {
            this.resizeCanvas(1474255908);
            this.resizeCanvasNextFrame = false;
        }
    }
    
    final void dy() {
        this.resizeCanvasNextFrame = true;
    }
    
    protected final boolean gg() {
        return this.frame != null;
    }
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
        this.startThread(focusEvent);
        try {
            GameEngine.volatileFocus = true;
            this.fullRedraw = true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.focusGained(" + ')');
        }
    }
    
    @Override
    public final void focusLost(final FocusEvent focusEvent) {
        try {
            GameEngine.volatileFocus = false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.focusLost(" + ')');
        }
    }
    
    protected abstract void fx();
    
    protected abstract void fy();
    
    protected class170 bh() {
        if (this.mouseWheelHandler == null) {
            MouseWheelHandler.zd(this.mouseWheelHandler = new MouseWheelHandler(), this.canvas, -512958595);
        }
        return this.mouseWheelHandler;
    }
    
    void graphicsTick(final byte b) {
        this.cy();
        try {
            final Container container = this.container((byte)6);
            final long clockNow = class96.clockNow(1755738982);
            final long n = GameEngine.graphicsTickTimes[Rasterizer3D.field2000 * -689745739];
            GameEngine.graphicsTickTimes[-689745739 * Rasterizer3D.field2000] = clockNow;
            Rasterizer3D.field2000 = -1417208419 * (1 + -689745739 * Rasterizer3D.field2000 & 0x1F);
            if (0L != n) {
                if (b != 29) {
                    throw new IllegalStateException();
                }
                if (clockNow > n) {
                    if (b != 29) {
                        throw new IllegalStateException();
                    }
                    final int n2 = (int)(clockNow - n);
                    GameEngine.fps = (32000 + (n2 >> 1)) / n2 * 1691803635;
                }
            }
            if ((GameEngine.field124 += 769754581) * 148605821 - 1 > 50) {
                if (b != 29) {
                    throw new IllegalStateException();
                }
                GameEngine.field124 += 166976614;
                this.fullRedraw = true;
                this.canvas.setSize(GameEngine.canvasWidth * -1687260435, 1658005443 * class262.canvasHeight);
                this.canvas.setVisible(true);
                if (container == this.frame) {
                    if (b != 29) {
                        throw new IllegalStateException();
                    }
                    final Insets insets = this.frame.getInsets();
                    this.canvas.setLocation(-744210797 * this.canvasX + insets.left, insets.top + 895830209 * this.canvasY);
                }
                else {
                    this.canvas.setLocation(this.canvasX * -744210797, 895830209 * this.canvasY);
                }
            }
            if (this.isCanvasInvalid) {
                if (b != 29) {
                    throw new IllegalStateException();
                }
                this.replaceCanvas(1142186209);
            }
            this.method166(-1941798605);
            this.draw(this.fullRedraw, (short)7737);
            if (this.fullRedraw) {
                if (b != 29) {
                    throw new IllegalStateException();
                }
                this.clearBackground((byte)23);
            }
            this.fullRedraw = false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.by(" + ')');
        }
    }
    
    public final void bx(final FocusEvent focusEvent) {
        GameEngine.volatileFocus = false;
    }
    
    final void resizeCanvas(final int n) {
        this.sf();
        try {
            final Container container = this.container((byte)6);
            if (null != container) {
                final Bounds frameContentBounds = this.getFrameContentBounds(-1516355947);
                this.contentWidth = Math.max(944313703 * frameContentBounds.highX, 69014751 * this.field116) * -2050638615;
                this.contentHeight = Math.max(frameContentBounds.highY * -1376251093, 1673949127 * this.field117) * -1550051949;
                if (-927540391 * this.contentWidth <= 0) {
                    if (n >= 2119369406) {
                        this.draw();
                        return;
                    }
                    this.contentWidth = -2050638615;
                }
                if (-1747234661 * this.contentHeight <= 0) {
                    if (n >= 2119369406) {
                        throw new IllegalStateException();
                    }
                    this.contentHeight = -1550051949;
                }
                GameEngine.canvasWidth = Math.min(-927540391 * this.contentWidth, 2087275977 * this.maxCanvasWidth) * 2082454245;
                Client.vk(-1);
                class262.canvasHeight = Math.min(-1747234661 * this.contentHeight, 83534669 * this.maxCanvasHeight) * -16547605;
                Client.kp(-1);
                this.canvasX = (this.contentWidth * -927540391 - -1687260435 * GameEngine.canvasWidth) / 2 * 1463717787;
                this.canvasY = 0;
                this.canvas.setSize(GameEngine.canvasWidth * -1687260435, class262.canvasHeight * 1658005443);
                RouteStrategy.rasterProvider = new RasterProvider(-1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight, this.canvas, this.field120);
                if (container == this.frame) {
                    final Insets insets = this.frame.getInsets();
                    this.canvas.setLocation(insets.left + -744210797 * this.canvasX, this.canvasY * 895830209 + insets.top);
                }
                else {
                    this.canvas.setLocation(this.canvasX * -744210797, 895830209 * this.canvasY);
                }
                this.fullRedraw = true;
                this.resizeGame((byte)79);
                this.draw();
                return;
            }
            if (n >= 2119369406) {
                throw new IllegalStateException();
            }
            this.draw();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ar(" + ')');
        }
    }
    
    void clientTick(final int n) {
        try {
            this.clipboard = this.getToolkit().getSystemClipboard();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ay(" + ')');
        }
    }
    
    public static void ys(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.df();
        }
        final Container container = gameEngine.container((byte)6);
        final long clockNow = class96.clockNow(23779710);
        final long n = GameEngine.graphicsTickTimes[Rasterizer3D.field2000 * -689745739];
        GameEngine.graphicsTickTimes[-689745739 * Rasterizer3D.field2000] = clockNow;
        Rasterizer3D.field2000 = -1417208419 * (1 + -689745739 * Rasterizer3D.field2000 & 0x1F);
        if (0L != n && clockNow > n) {
            final int n2 = (int)(clockNow - n);
            GameEngine.fps = (32000 + (n2 >> 1)) / n2 * 1691803635;
        }
        if ((GameEngine.field124 += 769754581) * 148605821 - 1 > 50) {
            GameEngine.field124 += 166976614;
            gameEngine.fullRedraw = true;
            gameEngine.canvas.setSize(GameEngine.canvasWidth * -1687260435, 1658005443 * class262.canvasHeight);
            gameEngine.canvas.setVisible(true);
            if (container == gameEngine.frame) {
                final Insets insets = gameEngine.frame.getInsets();
                gameEngine.canvas.setLocation(-744210797 * gameEngine.canvasX + insets.left, insets.top + 895830209 * gameEngine.canvasY);
            }
            else {
                gameEngine.canvas.setLocation(gameEngine.canvasX * -744210797, 895830209 * gameEngine.canvasY);
            }
        }
        if (gameEngine.isCanvasInvalid) {
            gameEngine.replaceCanvas(847650772);
        }
        gameEngine.method166(-396472741);
        gameEngine.draw(gameEngine.fullRedraw, (short)20094);
        if (gameEngine.fullRedraw) {
            gameEngine.clearBackground((byte)23);
        }
        gameEngine.fullRedraw = false;
    }
    
    protected abstract void doCycle(final int p0);
    
    protected final void cm() {
        KeyHandler.hq(GameEngine.keyHandler, 190164456);
    }
    
    public final synchronized void paint(final Graphics graphics) {
        try {
            if (GameEngine.gameEngine == this && !GameEngine.isKilled) {
                this.fullRedraw = true;
                if (class96.clockNow(-236357307) - -6171487387477770437L * this.field109 > 1000L) {
                    final Rectangle clipBounds = graphics.getClipBounds();
                    if (clipBounds == null || (clipBounds.width >= GameEngine.canvasWidth * -1687260435 && clipBounds.height >= 1658005443 * class262.canvasHeight)) {
                        this.isCanvasInvalid = true;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.paint(" + ')');
        }
    }
    
    Container container(final byte b) {
        try {
            if (null == this.frame) {
                return this;
            }
            if (b != 6) {
                throw new IllegalStateException();
            }
            return this.frame;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.bg(" + ')');
        }
    }
    
    @Override
    public final void windowOpened(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowClosing(final WindowEvent windowEvent) {
        try {
            this.destroy();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.windowClosing(" + ')');
        }
    }
    
    @Override
    public final void windowClosed(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowIconified(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowDeiconified(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowActivated(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowDeactivated(final WindowEvent windowEvent) {
    }
    
    protected void cg(final class29 class29, final int n) {
        KeyHandler.mu(GameEngine.keyHandler, class29, n, 330446593);
    }
    
    protected abstract void co();
    
    protected void fg(final String s) {
        if (this.hasErrored) {
            return;
        }
        this.hasErrored = true;
        System.out.println("error_game_" + s);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + s + ".ws"), "_self");
        }
        catch (Exception ex) {}
    }
    
    public void cy() {
        GameEngine.field124 = 0 * 769754581;
    }
    
    public final void er(final WindowEvent windowEvent) {
    }
    
    public void gx() {
        (this.pr = Thread.currentThread()).setName("Client");
        this.pr.setUncaughtExceptionHandler((p0, t) -> cp(null, t));
    }
    
    public void gy() {
        try {
            if (null != TaskHandler.javaVendor) {
                final String lowerCase = TaskHandler.javaVendor.toLowerCase();
                if (lowerCase.indexOf("sun") != -1 || lowerCase.indexOf("apple") != -1) {
                    final String javaVersion = TaskHandler.javaVersion;
                    if (javaVersion.equals("1.1") || javaVersion.startsWith("1.1.") || javaVersion.equals("1.2") || javaVersion.startsWith("1.2.") || javaVersion.equals("1.3") || javaVersion.startsWith("1.3.") || javaVersion.equals("1.4") || javaVersion.startsWith("1.4.") || javaVersion.equals("1.5") || javaVersion.startsWith("1.5.") || javaVersion.equals("1.6.0")) {
                        this.error("wrongjava", 867728822);
                        return;
                    }
                    if (javaVersion.startsWith("1.6.0_")) {
                        int n;
                        for (n = 6; n < javaVersion.length() && class149.isDigit(javaVersion.charAt(n), 186393927); ++n) {}
                        final String substring = javaVersion.substring(6, n);
                        if (WorldMapSectionType.isNumber(substring, -1571426846) && PacketBufferNode.release(substring, (byte)92) < 10) {
                            this.error("wrongjava", -2002459390);
                            return;
                        }
                    }
                    GameEngine.fiveOrOne = -1709110595;
                }
            }
            this.setFocusCycleRoot(true);
            this.addCanvas(2070556909);
            this.setUp((byte)91);
            class399.clock = class148.method840(-774699412);
            while (951500247553634275L * GameEngine.stopTimeMs == 0L || class96.clockNow(673189286) < 951500247553634275L * GameEngine.stopTimeMs) {
                DirectByteArrayCopier.gameCyclesToDo = class399.clock.wait(GameEngine.cycleDurationMillis * 348118455, 299523984 * GameEngine.fiveOrOne, -900377971) * -1145499060;
                for (int i = 0; i < DirectByteArrayCopier.gameCyclesToDo * 2142982630; ++i) {
                    nc(this, -1128791201);
                }
                this.graphicsTick((byte)29);
                xn(this, this.canvas, 1743306475);
            }
        }
        catch (Exception ex) {
            class387.RunException_sendStackTrace(null, ex, (byte)8);
            this.error("crash", 1843211231);
        }
        this.kill(-1055352876);
    }
    
    protected abstract void gw();
    
    protected abstract void gh();
    
    public final void af(final Graphics graphics) {
        this.paint(graphics);
    }
    
    protected final void drawInitial(final int n, final String s, final boolean b, final int n2) {
        try {
            try {
                final Graphics graphics = this.canvas.getGraphics();
                if (null == class244.fontHelvetica13) {
                    if (n2 >= -1948942042) {
                        throw new IllegalStateException();
                    }
                    class244.fontHelvetica13 = new Font("Helvetica", 1, 13);
                    class27.loginScreenFontMetrics = this.canvas.getFontMetrics(class244.fontHelvetica13);
                }
                if (b) {
                    if (n2 >= -1948942042) {
                        return;
                    }
                    graphics.setColor(Color.black);
                    graphics.fillRect(0, 0, -1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight);
                }
                final Color color = new Color(140, 17, 17);
                try {
                    if (PacketWriter.field1141 == null) {
                        if (n2 >= -1948942042) {
                            return;
                        }
                        PacketWriter.field1141 = this.canvas.createImage(304, 34);
                    }
                    final Graphics graphics2 = PacketWriter.field1141.getGraphics();
                    graphics2.setColor(color);
                    graphics2.drawRect(0, 0, 303, 33);
                    graphics2.fillRect(2, 2, 3 * n, 30);
                    graphics2.setColor(Color.black);
                    graphics2.drawRect(1, 1, 301, 31);
                    graphics2.fillRect(n * 3 + 2, 2, 300 - 3 * n, 30);
                    graphics2.setFont(class244.fontHelvetica13);
                    graphics2.setColor(Color.white);
                    graphics2.drawString(s, (304 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22);
                    graphics.drawImage(PacketWriter.field1141, GameEngine.canvasWidth * -1687260435 / 2 - 152, class262.canvasHeight * 1658005443 / 2 - 18, null);
                }
                catch (Exception ex2) {
                    final int x = -1687260435 * GameEngine.canvasWidth / 2 - 152;
                    final int y = 1658005443 * class262.canvasHeight / 2 - 18;
                    graphics.setColor(color);
                    graphics.drawRect(x, y, 303, 33);
                    graphics.fillRect(x + 2, 2 + y, n * 3, 30);
                    graphics.setColor(Color.black);
                    graphics.drawRect(1 + x, y + 1, 301, 31);
                    graphics.fillRect(3 * n + (2 + x), y + 2, 300 - 3 * n, 30);
                    graphics.setFont(class244.fontHelvetica13);
                    graphics.setColor(Color.white);
                    graphics.drawString(s, x + (304 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22 + y);
                }
            }
            catch (Exception ex3) {
                this.canvas.repaint();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.bn(" + ')');
        }
    }
    
    protected static int gu() {
        int n = 0;
        Label_0079: {
            if (class291.garbageCollector != null) {
                if (class291.garbageCollector.isValid()) {
                    break Label_0079;
                }
            }
            try {
                for (final GarbageCollectorMXBean garbageCollector : ManagementFactory.getGarbageCollectorMXBeans()) {
                    if (garbageCollector.isValid()) {
                        class291.garbageCollector = garbageCollector;
                        GameEngine.garbageCollectorLastCheckTimeMs = 4496549445389278039L;
                        GameEngine.garbageCollectorLastCollectionTime = -3922098655801851377L;
                    }
                }
            }
            catch (Throwable t) {}
        }
        if (null != class291.garbageCollector) {
            final long clockNow = class96.clockNow(15041803);
            final long collectionTime = class291.garbageCollector.getCollectionTime();
            if (-3199239881614683375L * GameEngine.garbageCollectorLastCollectionTime != -1L) {
                final long n2 = collectionTime - -3199239881614683375L * GameEngine.garbageCollectorLastCollectionTime;
                final long n3 = clockNow - 9118577410129870745L * GameEngine.garbageCollectorLastCheckTimeMs;
                if (n3 != 0L) {
                    n = (int)(100L * n2 / n3);
                }
            }
            GameEngine.garbageCollectorLastCollectionTime = 3922098655801851377L * collectionTime;
            GameEngine.garbageCollectorLastCheckTimeMs = -4496549445389278039L * clockNow;
        }
        return n;
    }
    
    void cz() {
        final int n = -744210797 * this.canvasX;
        final int n2 = 895830209 * this.canvasY;
        final int n3 = -927540391 * this.contentWidth - -1687260435 * GameEngine.canvasWidth - n;
        final int n4 = this.contentHeight * -1747234661 - class262.canvasHeight * 1658005443 - n2;
        if (n <= 0 && n3 <= 0 && n2 <= 0) {
            if (n4 <= 0) {
                return;
            }
        }
        try {
            final Container container = this.container((byte)6);
            int left = 0;
            int top = 0;
            if (container == this.frame) {
                final Insets insets = this.frame.getInsets();
                left = insets.left;
                top = insets.top;
            }
            final Graphics graphics = container.getGraphics();
            graphics.setColor(Color.black);
            if (n > 0) {
                graphics.fillRect(left, top, n, -1747234661 * this.contentHeight);
            }
            if (n2 > 0) {
                graphics.fillRect(left, top, -927540391 * this.contentWidth, n2);
            }
            if (n3 > 0) {
                graphics.fillRect(left + this.contentWidth * -927540391 - n3, top, n3, this.contentHeight * -1747234661);
            }
            if (n4 > 0) {
                graphics.fillRect(left, top + this.contentHeight * -1747234661 - n4, -927540391 * this.contentWidth, n4);
            }
        }
        catch (Exception ex) {}
    }
    
    final synchronized void dr() {
        final Container container = this.container((byte)6);
        if (null != this.canvas) {
            this.canvas.removeFocusListener(this);
            container.remove(this.canvas);
        }
        GameEngine.canvasWidth = Math.max(container.getWidth(), this.field116 * 69014751) * 2082454245;
        class262.canvasHeight = Math.max(container.getHeight(), this.field117 * 1673949127) * -16547605;
        if (null != this.frame) {
            final Insets insets = this.frame.getInsets();
            GameEngine.canvasWidth -= (insets.right + insets.left) * 2082454245;
            class262.canvasHeight -= (insets.bottom + insets.top) * -16547605;
        }
        this.canvas = new Canvas(this);
        container.setBackground(Color.BLACK);
        container.setLayout(null);
        container.add(this.canvas);
        this.canvas.setSize(-1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight);
        this.canvas.setVisible(true);
        this.canvas.setBackground(Color.BLACK);
        if (this.frame == container) {
            final Insets insets2 = this.frame.getInsets();
            this.canvas.setLocation(insets2.left + -744210797 * this.canvasX, insets2.top + 895830209 * this.canvasY);
        }
        else {
            this.canvas.setLocation(this.canvasX * -744210797, this.canvasY * 895830209);
        }
        this.canvas.addFocusListener(this);
        this.canvas.requestFocus();
        this.fullRedraw = true;
        if (null != RouteStrategy.rasterProvider && 1313069155 * RouteStrategy.rasterProvider.width == GameEngine.canvasWidth * -1687260435 && 1658005443 * class262.canvasHeight == 1695726685 * RouteStrategy.rasterProvider.height) {
            ((RasterProvider)RouteStrategy.rasterProvider).setComponent(this.canvas, (byte)8);
            RouteStrategy.rasterProvider.drawFull(0, 0, 1608103191);
        }
        else {
            RouteStrategy.rasterProvider = new RasterProvider(-1687260435 * GameEngine.canvasWidth, class262.canvasHeight * 1658005443, this.canvas, this.field120);
        }
        this.isCanvasInvalid = false;
        this.field109 = class96.clockNow(2079584375) * -515103886995160589L;
    }
    
    protected static int ga() {
        int n = 0;
        Label_0079: {
            if (class291.garbageCollector != null) {
                if (class291.garbageCollector.isValid()) {
                    break Label_0079;
                }
            }
            try {
                for (final GarbageCollectorMXBean garbageCollector : ManagementFactory.getGarbageCollectorMXBeans()) {
                    if (garbageCollector.isValid()) {
                        class291.garbageCollector = garbageCollector;
                        GameEngine.garbageCollectorLastCheckTimeMs = 4496549445389278039L;
                        GameEngine.garbageCollectorLastCollectionTime = -3922098655801851377L;
                    }
                }
            }
            catch (Throwable t) {}
        }
        if (null != class291.garbageCollector) {
            final long clockNow = class96.clockNow(1011490396);
            final long collectionTime = class291.garbageCollector.getCollectionTime();
            if (-3199239881614683375L * GameEngine.garbageCollectorLastCollectionTime != -1L) {
                final long n2 = collectionTime - -3199239881614683375L * GameEngine.garbageCollectorLastCollectionTime;
                final long n3 = clockNow - 9118577410129870745L * GameEngine.garbageCollectorLastCheckTimeMs;
                if (n3 != 0L) {
                    n = (int)(100L * n2 / n3);
                }
            }
            GameEngine.garbageCollectorLastCollectionTime = 3922098655801851377L * collectionTime;
            GameEngine.garbageCollectorLastCheckTimeMs = -4496549445389278039L * clockNow;
        }
        return n;
    }
    
    public final synchronized void ab(final Graphics graphics) {
        if (GameEngine.gameEngine == this && !GameEngine.isKilled) {
            this.fullRedraw = true;
            if (class96.clockNow(622436992) - -6171487387477770437L * this.field109 > 1000L) {
                final Rectangle clipBounds = graphics.getClipBounds();
                if (clipBounds == null || (clipBounds.width >= GameEngine.canvasWidth * -1687260435 && clipBounds.height >= 1658005443 * class262.canvasHeight)) {
                    this.isCanvasInvalid = true;
                }
            }
        }
    }
    
    public final synchronized void aq(final Graphics graphics) {
        if (GameEngine.gameEngine == this && !GameEngine.isKilled) {
            this.fullRedraw = true;
            if (class96.clockNow(312598050) - -6171487387477770437L * this.field109 > 1000L) {
                final Rectangle clipBounds = graphics.getClipBounds();
                if (clipBounds == null || (clipBounds.width >= GameEngine.canvasWidth * -1687260435 && clipBounds.height >= 1658005443 * class262.canvasHeight)) {
                    this.isCanvasInvalid = true;
                }
            }
        }
    }
    
    final void replaceCanvas(final int n) {
        ScriptFrame.client.openMenu(false);
    }
    
    protected final void method169(final byte b) {
        try {
            KeyHandler.hq(GameEngine.keyHandler, 190164456);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ag(" + ')');
        }
    }
    
    protected final void bl(final int n, final int n2) {
        if (n != 2087275977 * this.maxCanvasWidth || 83534669 * this.maxCanvasHeight != n2) {
            this.method181(-2084705385);
        }
        this.maxCanvasWidth = n * -753509255;
        this.maxCanvasHeight = n2 * -438874747;
    }
    
    public void resizeCanvas() {
        this.resizeCanvas(1698796359);
    }
    
    final synchronized void ep() {
        if (GameEngine.isKilled) {
            return;
        }
        GameEngine.isKilled = true;
        try {
            this.canvas.removeFocusListener(this);
        }
        catch (Exception ex) {}
        try {
            this.kill0(-72974483);
        }
        catch (Exception ex2) {}
        if (this.frame != null) {
            try {
                System.exit(0);
            }
            catch (Throwable t) {}
        }
        if (null != GameEngine.taskHandler) {
            try {
                GameEngine.taskHandler.close(-1129421458);
            }
            catch (Exception ex3) {}
        }
        this.vmethod1485(-1086551379);
    }
    
    protected final boolean dg() {
        String s = this.getDocumentBase().getHost().toLowerCase();
        if (s.equals("jagex.com") || s.endsWith(".jagex.com")) {
            return true;
        }
        if (s.equals("runescape.com") || s.endsWith(".runescape.com")) {
            return true;
        }
        if (s.endsWith("127.0.0.1")) {
            return true;
        }
        while (s.length() > 0 && s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9') {
            s = s.substring(0, s.length() - 1);
        }
        if (s.endsWith("192.168.1.")) {
            return true;
        }
        this.error("invalidhost", -213495388);
        return false;
    }
    
    public static void hv(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.stop();
        }
        if (gameEngine == GameEngine.gameEngine && !GameEngine.isKilled) {
            GameEngine.stopTimeMs = class96.clockNow(-139430543) * -2406892942717923893L;
            PlayerComposition.method1692(5000L);
            gameEngine.kill(-1680663447);
        }
    }
    
    public static Container hv(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.oc();
        }
        if (null != gameEngine.frame) {
            return gameEngine.frame;
        }
        return gameEngine;
    }
    
    public static void hz(final GameEngine gameEngine, final class29 class29, final int n) {
        if (gameEngine == null) {
            gameEngine.dd();
            return;
        }
        KeyHandler.mu(GameEngine.keyHandler, class29, n, 1517381685);
    }
    
    public static void ol(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.bc();
        }
        final Container container = gameEngine.container((byte)6);
        if (null == container) {
            return;
        }
        final Bounds frameContentBounds = gameEngine.getFrameContentBounds(-1516355947);
        gameEngine.contentWidth = Math.max(944313703 * frameContentBounds.highX, 69014751 * gameEngine.field116) * -2050638615;
        gameEngine.contentHeight = Math.max(frameContentBounds.highY * -1376251093, 1673949127 * gameEngine.field117) * -1550051949;
        if (-927540391 * gameEngine.contentWidth <= 0) {
            gameEngine.contentWidth = -2050638615;
        }
        if (-1747234661 * gameEngine.contentHeight <= 0) {
            gameEngine.contentHeight = -1550051949;
        }
        GameEngine.canvasWidth = Math.min(-927540391 * gameEngine.contentWidth, 2087275977 * gameEngine.maxCanvasWidth) * 2082454245;
        class262.canvasHeight = Math.min(-1747234661 * gameEngine.contentHeight, 83534669 * gameEngine.maxCanvasHeight) * -16547605;
        gameEngine.canvasX = (gameEngine.contentWidth * -927540391 - -1687260435 * GameEngine.canvasWidth) / 2 * 1463717787;
        gameEngine.canvasY = 0;
        gameEngine.canvas.setSize(GameEngine.canvasWidth * -1687260435, class262.canvasHeight * 1658005443);
        RouteStrategy.rasterProvider = new RasterProvider(-1687260435 * GameEngine.canvasWidth, 1658005443 * class262.canvasHeight, gameEngine.canvas, gameEngine.field120);
        if (container == gameEngine.frame) {
            final Insets insets = gameEngine.frame.getInsets();
            gameEngine.canvas.setLocation(insets.left + -744210797 * gameEngine.canvasX, gameEngine.canvasY * 895830209 + insets.top);
        }
        else {
            gameEngine.canvas.setLocation(gameEngine.canvasX * -744210797, 895830209 * gameEngine.canvasY);
        }
        gameEngine.fullRedraw = true;
        gameEngine.resizeGame((byte)17);
    }
    
    public Canvas getCanvas() {
        return this.canvas;
    }
    
    public final void eg(final WindowEvent windowEvent) {
    }
    
    public final void ew(final WindowEvent windowEvent) {
        this.destroy();
    }
    
    public void kl(final boolean isCanvasInvalid) {
        this.isCanvasInvalid = isCanvasInvalid;
    }
    
    protected abstract void kill0(final int p0);
    
    void dd() {
        final Container container = this.container((byte)6);
        final long clockNow = class96.clockNow(652001504);
        final long n = GameEngine.graphicsTickTimes[Rasterizer3D.field2000 * 1151958567];
        GameEngine.graphicsTickTimes[-1903434896 * Rasterizer3D.field2000] = clockNow;
        Rasterizer3D.field2000 = -1417208419 * (1 + -689745739 * Rasterizer3D.field2000 & 0x842273CE);
        if (0L != n && clockNow > n) {
            final int n2 = (int)(clockNow - n);
            GameEngine.fps = (1798715468 + (n2 >> 1)) / n2 * 1691803635;
        }
        if ((GameEngine.field124 += 769754581) * -1956251093 - 1 > 196179764) {
            GameEngine.field124 += 166976614;
            this.fullRedraw = true;
            this.canvas.setSize(GameEngine.canvasWidth * 662719275, -31410281 * class262.canvasHeight);
            this.canvas.setVisible(true);
            if (container == this.frame) {
                final Insets insets = this.frame.getInsets();
                this.canvas.setLocation(-744210797 * this.canvasX + insets.left, insets.top + -1412449547 * this.canvasY);
            }
            else {
                this.canvas.setLocation(this.canvasX * -744210797, -475338998 * this.canvasY);
            }
        }
        if (this.isCanvasInvalid) {
            this.replaceCanvas(-2123569243);
        }
        this.method166(722126841);
        this.draw(this.fullRedraw, (short)29575);
        if (this.fullRedraw) {
            this.clearBackground((byte)23);
        }
        this.fullRedraw = false;
    }
    
    public Thread getClientThread() {
        return this.pr;
    }
    
    public boolean isClientThread() {
        return this.pr == Thread.currentThread();
    }
    
    protected final void ff() {
        PacketWriter.field1141 = null;
        class244.fontHelvetica13 = null;
        class27.loginScreenFontMetrics = null;
    }
    
    Bounds go() {
        final Container container = this.container((byte)6);
        int max = Math.max(container.getWidth(), this.field116 * -1044856143);
        int max2 = Math.max(container.getHeight(), -1305050727 * this.field117);
        if (null != this.frame) {
            final Insets insets = this.frame.getInsets();
            max -= insets.right + insets.left;
            max2 -= insets.top + insets.bottom;
        }
        return new Bounds(max, max2);
    }
    
    Container gr() {
        if (null != this.frame) {
            return this.frame;
        }
        return this;
    }
    
    public void vf(final Object o) {
        xn(this, o, 1513004820);
    }
    
    protected final void fq(final int n, final String s, final boolean b) {
        try {
            final Graphics graphics = this.canvas.getGraphics();
            if (null == class244.fontHelvetica13) {
                class244.fontHelvetica13 = new Font("Helvetica", 1, 13);
                class27.loginScreenFontMetrics = this.canvas.getFontMetrics(class244.fontHelvetica13);
            }
            if (b) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, 1604933886 * GameEngine.canvasWidth, 2102851015 * class262.canvasHeight);
            }
            final Color color = new Color(140, 17, 17);
            try {
                if (PacketWriter.field1141 == null) {
                    PacketWriter.field1141 = this.canvas.createImage(-1077818123, 1514998152);
                }
                final Graphics graphics2 = PacketWriter.field1141.getGraphics();
                graphics2.setColor(color);
                graphics2.drawRect(0, 0, 303, 33);
                graphics2.fillRect(2, 2, 3 * n, 30);
                graphics2.setColor(Color.black);
                graphics2.drawRect(1, 1, 301, 31);
                graphics2.fillRect(n * 3 + 2, 2, 300 - 3 * n, 30);
                graphics2.setFont(class244.fontHelvetica13);
                graphics2.setColor(Color.white);
                graphics2.drawString(s, (-1673646257 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22);
                graphics.drawImage(PacketWriter.field1141, GameEngine.canvasWidth * -1687260435 / 2 - 152, class262.canvasHeight * 1658005443 / 2 - 18, null);
            }
            catch (Exception ex) {
                final int x = -1687260435 * GameEngine.canvasWidth / 2 + 475005573;
                final int y = 1658005443 * class262.canvasHeight / 2 - 18;
                graphics.setColor(color);
                graphics.drawRect(x, y, -1821930983, 33);
                graphics.fillRect(x + 2, 2 + y, n * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(1 + x, y + 1, -1701335359, 1487202307);
                graphics.fillRect(3 * n + (2 + x), y + 2, 522520098 - 3 * n, 30);
                graphics.setFont(class244.fontHelvetica13);
                graphics.setColor(Color.white);
                graphics.drawString(s, x + (304 - class27.loginScreenFontMetrics.stringWidth(s)) / 2, 22 + y);
            }
        }
        catch (Exception ex2) {
            this.canvas.repaint();
        }
    }
    
    public static void vp(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.run();
        }
        if (GameEngine.gameEngine != gameEngine || GameEngine.isKilled) {
            return;
        }
        GameEngine.stopTimeMs = (class96.clockNow(1174706404) + 4000L) * -2406892942717923893L;
    }
    
    protected abstract void fz(final boolean p0);
    
    Bounds gs() {
        final Container container = this.container((byte)6);
        int max = Math.max(container.getWidth(), this.field116 * 69014751);
        int max2 = Math.max(container.getHeight(), 1673949127 * this.field117);
        if (null != this.frame) {
            final Insets insets = this.frame.getInsets();
            max -= insets.right + insets.left;
            max2 -= insets.top + insets.bottom;
        }
        return new Bounds(max, max2);
    }
    
    protected abstract void fb();
    
    protected abstract void setUp(final byte p0);
    
    public final void bk(final FocusEvent focusEvent) {
        GameEngine.volatileFocus = true;
        this.fullRedraw = true;
    }
    
    public final void ez() {
        if (GameEngine.gameEngine == this && !GameEngine.isKilled) {
            GameEngine.stopTimeMs = 0L;
        }
    }
    
    final synchronized void eo() {
        if (GameEngine.isKilled) {
            return;
        }
        GameEngine.isKilled = true;
        try {
            this.canvas.removeFocusListener(this);
        }
        catch (Exception ex) {}
        try {
            this.kill0(-72974483);
        }
        catch (Exception ex2) {}
        if (this.frame != null) {
            try {
                System.exit(0);
            }
            catch (Throwable t) {}
        }
        if (null != GameEngine.taskHandler) {
            try {
                GameEngine.taskHandler.close(522027584);
            }
            catch (Exception ex3) {}
        }
        this.vmethod1485(-1086551379);
    }
    
    protected void fj(final String s) {
        if (this.hasErrored) {
            return;
        }
        this.hasErrored = true;
        System.out.println("error_game_" + s);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + s + ".ws"), "_self");
        }
        catch (Exception ex) {}
    }
    
    public final void eb(final WindowEvent windowEvent) {
    }
    
    protected void method160(final class29 class29, final int n, final byte b) {
        try {
            KeyHandler.mu(GameEngine.keyHandler, class29, n, 107693889);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ah(" + ')');
        }
    }
    
    public static void jk(final GameEngine gameEngine, final byte b) {
        if (gameEngine == null) {
            gameEngine.method169(b);
            return;
        }
        try {
            KeyHandler.hq(GameEngine.keyHandler, 190164456);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ag(" + ')');
        }
    }
    
    public final void ef() {
        if (GameEngine.gameEngine == this && !GameEngine.isKilled) {
            GameEngine.stopTimeMs = (class96.clockNow(597756630) + 4000L) * -2406892942717923893L;
        }
    }
    
    public static void xg(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.cr();
        }
        class394.method2104(gameEngine.canvas, -1018034590);
    }
    
    public static void qv(final GameEngine gameEngine) {
        if (gameEngine == null) {
            gameEngine.sf();
            return;
        }
        KeyHandler.hq(GameEngine.keyHandler, 190164456);
    }
    
    public static Clipboard zr(final GameEngine gameEngine, final int n) {
        if (gameEngine == null) {
            gameEngine.getClipboard(n);
        }
        try {
            return gameEngine.clipboard;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.ax(" + ')');
        }
    }
    
    protected final boolean gj() {
        return this.frame != null;
    }
    
    public final void ey(final WindowEvent windowEvent) {
    }
    
    protected final boolean hasFrame(final int n) {
        try {
            boolean b;
            if (this.frame != null) {
                if (n <= 447814518) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.bf(" + ')');
        }
    }
    
    Bounds getFrameContentBounds(final int n) {
        try {
            final Container container = this.container((byte)6);
            int max = Math.max(container.getWidth(), this.field116 * 69014751);
            int max2 = Math.max(container.getHeight(), 1673949127 * this.field117);
            if (null != this.frame) {
                if (n != -1516355947) {
                    throw new IllegalStateException();
                }
                final Insets insets = this.frame.getInsets();
                max -= insets.right + insets.left;
                max2 -= insets.top + insets.bottom;
            }
            return new Bounds(max, max2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bm.bu(" + ')');
        }
    }
    
    void du() {
        final long clockNow = class96.clockNow(-84529913);
        final long n = GameEngine.clientTickTimes[1876302371 * class335.field3093];
        GameEngine.clientTickTimes[702273735 * class335.field3093] = clockNow;
        class335.field3093 = 390659723 * (class335.field3093 * 1792635681 + 1 & 0x56E76AE9);
        if (n == 0L || clockNow > n) {}
        synchronized (this) {
            AbstractByteArrayCopier.hasFocus = GameEngine.volatileFocus;
        }
        this.doCycle(-2102387167);
    }
}
