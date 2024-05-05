import net.runelite.api.events.FocusChanged;
import java.util.Iterator;
import java.awt.event.FocusEvent;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

// 
// Decompiled by Procyon v0.5.36
// 

public class KeyHandler implements KeyListener, FocusListener
{
    Collection field76;
    Collection field77;
    volatile int KeyHandler_idleCycles;
    boolean[] KeyHandler_pressedKeys;
    class29[] field80;
    static final int af = 100;
    static int field81;
    static final int ax = 2;
    public static final byte bk = -1;
    
    KeyHandler() {
        this.field80 = new class29[3];
        this.KeyHandler_pressedKeys = new boolean[112];
        this.KeyHandler_idleCycles = 0;
        this.field77 = new ArrayList(100);
        this.field76 = new ArrayList(100);
    }
    
    public final synchronized void ad(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        int method1345;
        if (keyCode >= 0 && keyCode < class28.KeyHandler_keyCodes.length) {
            method1345 = ViewportMouse.method1345(keyCode, (byte)(-55));
            if (0x0 != (method1345 & 0xD9468D93)) {
                method1345 = -1;
            }
        }
        else {
            method1345 = -1;
        }
        if (method1345 >= 0) {
            this.KeyHandler_pressedKeys[method1345] = true;
            this.field77.add(new class33(1, method1345));
            this.KeyHandler_idleCycles = 0;
        }
        keyEvent.consume();
    }
    
    public final synchronized void ae(final KeyEvent keyEvent) {
        final char keyChar = keyEvent.getKeyChar();
        if (keyChar && -351002310 != keyChar) {
            boolean b = false;
            Label_0115: {
                if ((keyChar <= '\0' || keyChar >= -1832943298) && (keyChar < ' ' || keyChar > 1818194793)) {
                    if (keyChar != '\0') {
                        final char[] cp1252AsciiExtension = class369.cp1252AsciiExtension;
                        for (int i = 0; i < cp1252AsciiExtension.length; ++i) {
                            if (cp1252AsciiExtension[i] == keyChar) {
                                b = true;
                                break Label_0115;
                            }
                        }
                    }
                    b = false;
                }
                else {
                    b = true;
                }
            }
            if (b) {
                this.field77.add(new class33(3, keyChar));
            }
        }
        keyEvent.consume();
    }
    
    synchronized void bb() {
        final Collection field76 = this.field76;
        this.field76 = this.field77;
        this.field77 = field76;
    }
    
    public int ao() {
        return 581428417 * this.KeyHandler_idleCycles;
    }
    
    void at(final class29 class29, final int n) {
        this.field80[n] = class29;
    }
    
    public final synchronized void ak(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        int n;
        if (keyCode >= 0 && keyCode < class28.KeyHandler_keyCodes.length) {
            n = (ViewportMouse.method1345(keyCode, (byte)(-43)) & 0xFFFFFF7F);
        }
        else {
            n = -1;
        }
        if (n >= 0) {
            this.KeyHandler_pressedKeys[n] = false;
            this.field77.add(new class33(2, n));
        }
        keyEvent.consume();
    }
    
    void av(final Component component) {
        component.setFocusTraversalKeysEnabled(false);
        component.addKeyListener(this);
        component.addFocusListener(this);
    }
    
    synchronized void be() {
        final Collection field76 = this.field76;
        this.field76 = this.field77;
        this.field77 = field76;
    }
    
    synchronized void as(final Component component) {
        component.removeKeyListener(this);
        component.removeFocusListener(this);
        synchronized (this) {
            this.field77.add(new class33(4, 0));
        }
    }
    
    public final synchronized void az(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        int method1345;
        if (keyCode >= 0 && keyCode < class28.KeyHandler_keyCodes.length) {
            method1345 = ViewportMouse.method1345(keyCode, (byte)9);
            if (0x0 != (method1345 & 0x80)) {
                method1345 = -1;
            }
        }
        else {
            method1345 = -1;
        }
        if (method1345 >= 0) {
            this.KeyHandler_pressedKeys[method1345] = true;
            this.field77.add(new class33(1, method1345));
            this.KeyHandler_idleCycles = 0;
        }
        keyEvent.consume();
    }
    
    public int ax() {
        return 581428417 * this.KeyHandler_idleCycles;
    }
    
    public int ay() {
        return -360653713 * this.KeyHandler_idleCycles;
    }
    
    synchronized void bi() {
        final Collection field76 = this.field76;
        this.field76 = this.field77;
        this.field77 = field76;
    }
    
    public final synchronized void bo(final FocusEvent focusEvent) {
        for (int i = 0; i < 112; ++i) {
            if (this.KeyHandler_pressedKeys[i]) {
                this.KeyHandler_pressedKeys[i] = false;
                this.field77.add(new class33(2, i));
            }
        }
        this.field77.add(new class33(4, 0));
    }
    
    static void method108(final SequenceDefinition sequenceDefinition, final int n, final int n2, final int n3, final int n4) {
        try {
            if (-297150195 * Client.soundEffectCount < 50) {
                if (n4 <= -1334788260) {
                    throw new IllegalStateException();
                }
                if (class20.clientPreferences.method573(-1837465111) != 0) {
                    if (sequenceDefinition.animMayaFrameSounds != null) {
                        if (n4 <= -1334788260) {
                            throw new IllegalStateException();
                        }
                        if (sequenceDefinition.animMayaFrameSounds.containsKey(n)) {
                            class161.method908(sequenceDefinition.animMayaFrameSounds.get(n), n2, n3, 2140947227);
                            return;
                        }
                        if (n4 <= -1334788260) {
                            throw new IllegalStateException();
                        }
                    }
                    return;
                }
                if (n4 <= -1334788260) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.ha(" + ')');
        }
    }
    
    public boolean[] method108() {
        return this.KeyHandler_pressedKeys;
    }
    
    void method102(final Component component, final byte b) {
        try {
            component.setFocusTraversalKeysEnabled(false);
            component.addKeyListener(this);
            component.addFocusListener(this);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.aw(" + ')');
        }
    }
    
    synchronized void am(final Component component) {
        component.removeKeyListener(this);
        component.removeFocusListener(this);
        synchronized (this) {
            this.field77.add(new class33(4, 0));
        }
    }
    
    void al(final class29 class29, final int n) {
        this.field80[n] = class29;
    }
    
    public static double getIdleCycles(final double n, final double n2, final double n3) {
        try {
            return class138.vmethod3254((n - n2) / n3) / n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.an(" + ')');
        }
    }
    
    static void getIdleCycles(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final boolean b, final int n, final byte b2) {
        try {
            if (class12.clearLoginScreen) {
                if (n == 4) {
                    class129.method763(4, (byte)51);
                }
                return;
            }
            if (0 == n) {
                if (b2 >= 3) {
                    throw new IllegalStateException();
                }
                Login.method444(b, -1830611678);
            }
            else {
                class129.method763(n, (byte)39);
            }
            Rasterizer2D.Rasterizer2D_clear();
            class123.leftTitleSprite = Strings.method1853(AbstractArchive.ui(abstractArchive, "title.jpg", "", 1648560407), 504889561);
            Client.qg(-1);
            ParamComposition.rightTitleSprite = class123.leftTitleSprite.mirrorHorizontally();
            Client.ut(-1);
            final int n2 = Client.worldProperties * -205173751;
            if ((n2 & 0x20000000) != 0x0) {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_deadman_mode", "", -146128512);
            }
            else if (0x0 != (n2 & 0x40000000)) {
                if (b2 >= 3) {
                    throw new IllegalStateException();
                }
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_seasonal_mode", "", 313418457);
            }
            else if ((n2 & 0x100) != 0x0) {
                if (b2 >= 3) {
                    throw new IllegalStateException();
                }
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo_speedrunning", "", 2049692581);
            }
            else {
                Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "logo", "", -1070059423);
            }
            Login.titleboxSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebox", "", -884653668);
            class292.titlebuttonSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton", "", 621917997);
            class439.field3828 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_large", "", -1920614594);
            class376.field3605 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "play_now_text", "", 2114172391);
            MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "titlebutton_wide42,1", "", -691270939);
            class396.runesSprite = class314.method1708(abstractArchive2, "runes", "", 1411006030);
            class148.title_muteSprite = class314.method1708(abstractArchive2, "title_mute", "", 1455613865);
            Login.options_buttons_0Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,0", "", 736085020);
            Login.field733 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,4", "", 141620347);
            class158.options_buttons_2Sprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,2", "", -744990758);
            Login.field745 = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(abstractArchive2, "options_radio_buttons,6", "", 1062815117);
            ChatChannel.field817 = 1622050401 * Login.options_buttons_0Sprite.yOffset;
            FloorUnderlayDefinition.field1642 = Login.options_buttons_0Sprite.subWidth * 905476585;
            class121.field1184 = new LoginScreenAnimation(class396.runesSprite);
            if (b) {
                if (b2 >= 3) {
                    throw new IllegalStateException();
                }
                Login.Login_username = "";
                Client.it(-1);
                Login.Login_password = "";
                Login.field748 = new String[8];
                Login.field747 = 0;
            }
            class204.field1846 = 0;
            Messages.otp = "";
            Login.field751 = true;
            Login.worldSelectOpen = false;
            Client.tn(-1);
            if (!ClientPreferences.ss(class20.clientPreferences, -1197954221)) {
                if (b2 >= 3) {
                    throw new IllegalStateException();
                }
                class282.method1592(2, class399.archive6, "scape main", "", 255, false, -541968853);
            }
            else {
                class297.musicPlayerStatus = -626822165;
                class297.musicTrackArchive = null;
                class379.musicTrackGroupId = 1643562499;
                VarpDefinition.musicTrackFileId = -1823837761;
                class100.musicTrackVolume = 0;
                class120.musicTrackBoolean = false;
                class162.pcmSampleLength = 440964570;
            }
            class177.vmethod3380(false, 1867902391);
            class12.clearLoginScreen = true;
            Login.xPadding = 983792155 * ((GameEngine.canvasWidth * -1687260435 - 765) / 2);
            Login.loginBoxX = 794898887 * Login.xPadding + 2036160930;
            class143.loginBoxCenter = -1036961612 + Login.loginBoxX * -949768875;
            class123.leftTitleSprite.ca(578342931 * Login.xPadding, 0);
            ParamComposition.rightTitleSprite.ca(382 + Login.xPadding * 578342931, 0);
            Canvas.logoSprite.ax(382 + Login.xPadding * 578342931 - Canvas.logoSprite.yOffset / 2, 18);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.an(" + ')');
        }
    }
    
    public int getIdleCycles(final byte b) {
        try {
            return 581428417 * this.KeyHandler_idleCycles;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.an(" + ')');
        }
    }
    
    synchronized void method106(final Component component, final int n) {
        try {
            component.removeKeyListener(this);
            component.removeFocusListener(this);
            synchronized (this) {
                this.field77.add(new class33(4, 0));
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.ac(" + ')');
        }
    }
    
    void method103(final int n) {
        try {
            this.KeyHandler_idleCycles -= 132994239;
            this.method104((byte)(-64));
            final Iterator<class33> iterator = (Iterator<class33>)this.field77.iterator();
            while (iterator.hasNext()) {
                if (n != 190164456) {
                    return;
                }
                final class33 class33 = iterator.next();
                int i = 0;
                while (i < this.field80.length) {
                    if (n != 190164456) {
                        throw new IllegalStateException();
                    }
                    if (class33.method142(this.field80[i], 2098097689)) {
                        if (n != 190164456) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else {
                        ++i;
                    }
                }
            }
            this.field77.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.au(" + ')');
        }
    }
    
    void aa(final class29 class29, final int n) {
        this.field80[n] = class29;
    }
    
    @Override
    public final synchronized void focusGained(final FocusEvent focusEvent) {
        try {
            this.field77.add(new class33(4, 1));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.focusGained(" + ')');
        }
    }
    
    @Override
    public final synchronized void focusLost(final FocusEvent focusEvent) {
        this.ik(focusEvent);
        try {
            for (int i = 0; i < 112; ++i) {
                if (this.KeyHandler_pressedKeys[i]) {
                    this.KeyHandler_pressedKeys[i] = false;
                    this.field77.add(new class33(2, i));
                }
            }
            this.field77.add(new class33(4, 0));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.focusLost(" + ')');
        }
    }
    
    @Override
    public final synchronized void keyTyped(final KeyEvent keyEvent) {
        if (!bj(keyEvent)) {
            ScriptFrame.client.getCallbacks().keyTyped(keyEvent);
        }
        if (!keyEvent.isConsumed()) {
            try {
                final char keyChar = keyEvent.getKeyChar();
                if (keyChar && '\uffff' != keyChar) {
                    int n = 0;
                    Label_0176: {
                        if ((keyChar > '\0' && keyChar < '\u0080') || (keyChar >= ' ' && keyChar <= '\u00ff')) {
                            n = 1;
                        }
                        else {
                            if (keyChar != '\0') {
                                final char[] cp1252AsciiExtension = class369.cp1252AsciiExtension;
                                for (int i = 0; i < cp1252AsciiExtension.length; ++i) {
                                    if (cp1252AsciiExtension[i] == keyChar) {
                                        n = 1;
                                        break Label_0176;
                                    }
                                }
                            }
                            n = 0;
                        }
                    }
                    if (n != 0) {
                        this.field77.add(new class33(3, keyChar));
                    }
                }
                keyEvent.consume();
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ap.keyTyped(" + ')');
            }
        }
    }
    
    @Override
    public final synchronized void keyPressed(final KeyEvent keyEvent) {
        if (!bj(keyEvent)) {
            ScriptFrame.client.getCallbacks().keyPressed(keyEvent);
        }
        if (!keyEvent.isConsumed()) {
            try {
                final int keyCode = keyEvent.getKeyCode();
                int method1345;
                if (keyCode >= 0 && keyCode < class28.KeyHandler_keyCodes.length) {
                    method1345 = ViewportMouse.method1345(keyCode, (byte)(-119));
                    if (0x0 != (method1345 & 0x80)) {
                        method1345 = -1;
                    }
                }
                else {
                    method1345 = -1;
                }
                if (method1345 >= 0) {
                    this.KeyHandler_pressedKeys[method1345] = true;
                    this.field77.add(new class33(1, method1345));
                    this.KeyHandler_idleCycles = 0;
                }
                keyEvent.consume();
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ap.keyPressed(" + ')');
            }
        }
    }
    
    @Override
    public final synchronized void keyReleased(final KeyEvent keyEvent) {
        if (!bj(keyEvent)) {
            ScriptFrame.client.getCallbacks().keyReleased(keyEvent);
        }
        if (!keyEvent.isConsumed()) {
            try {
                final int keyCode = keyEvent.getKeyCode();
                int n;
                if (keyCode >= 0 && keyCode < class28.KeyHandler_keyCodes.length) {
                    n = (ViewportMouse.method1345(keyCode, (byte)(-125)) & 0xFFFFFF7F);
                }
                else {
                    n = -1;
                }
                if (n >= 0) {
                    this.KeyHandler_pressedKeys[n] = false;
                    this.field77.add(new class33(2, n));
                }
                keyEvent.consume();
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ap.keyReleased(" + ')');
            }
        }
    }
    
    static int getWidgetFlags(final Widget widget, final int n) {
        final int n2 = 311252747;
        int integer;
        try {
            final IntegerNode integerNode = (IntegerNode)Client.widgetFlags.at(widget.childIndex * 55577617 + ((long)(1713081171 * widget.id) << 32));
            if (integerNode != null) {
                if (n2 <= 209086632) {
                    throw new IllegalStateException();
                }
                integer = integerNode.integer;
            }
            else {
                integer = widget.flags * 1652991301;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.ng(" + ')');
        }
        int n3 = integer;
        if (Client.dl) {
            n3 |= 0x200000;
        }
        return n3;
    }
    
    public final synchronized void by(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        int method1345;
        if (keyCode >= 0 && keyCode < class28.KeyHandler_keyCodes.length) {
            method1345 = ViewportMouse.method1345(keyCode, (byte)(-42));
            if (0x0 != (method1345 & 0x80)) {
                method1345 = -1;
            }
        }
        else {
            method1345 = -1;
        }
        if (method1345 >= 0) {
            this.KeyHandler_pressedKeys[method1345] = true;
            this.field77.add(new class33(1, method1345));
            this.KeyHandler_idleCycles = 0;
        }
        keyEvent.consume();
    }
    
    public final synchronized void bx(final FocusEvent focusEvent) {
        for (int i = 0; i < -1853507994; ++i) {
            if (this.KeyHandler_pressedKeys[i]) {
                this.KeyHandler_pressedKeys[i] = false;
                this.field77.add(new class33(2, i));
            }
        }
        this.field77.add(new class33(4, 0));
    }
    
    void ar(final Component component) {
        component.setFocusTraversalKeysEnabled(false);
        component.addKeyListener(this);
        component.addFocusListener(this);
    }
    
    public final synchronized void ap(final KeyEvent keyEvent) {
        final char keyChar = keyEvent.getKeyChar();
        if (keyChar && -477978230 != keyChar) {
            int n = 0;
            Label_0008: {
                if ((keyChar <= '\0' || keyChar >= '\u0080') && (keyChar < 1121572036 || keyChar > 691285556)) {
                    if (keyChar != '\0') {
                        final char[] cp1252AsciiExtension = class369.cp1252AsciiExtension;
                        for (int i = 0; i < cp1252AsciiExtension.length; ++i) {
                            if (cp1252AsciiExtension[i] == keyChar) {
                                n = 1;
                                break Label_0008;
                            }
                        }
                    }
                    n = 0;
                }
                else {
                    n = 1;
                }
            }
            if (n != 0) {
                this.field77.add(new class33(3, keyChar));
            }
        }
        keyEvent.consume();
    }
    
    void method100(final class29 class29, final int n, final int n2) {
        try {
            this.field80[n] = class29;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.af(" + ')');
        }
    }
    
    public static int method100(final byte b) {
        try {
            return -1048050201 * ViewportMouse.ViewportMouse_entityCount;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.af(" + ')');
        }
    }
    
    synchronized void method104(final byte b) {
        try {
            final Collection field76 = this.field76;
            this.field76 = this.field77;
            this.field77 = field76;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.ab(" + ')');
        }
    }
    
    void aq(final class29 class29, final int n) {
        this.field80[n] = class29;
    }
    
    void aj() {
        this.KeyHandler_idleCycles -= 132994239;
        this.method104((byte)(-85));
        for (final class33 class33 : this.field76) {
            for (int n = 0; n < this.field80.length && !class33.method142(this.field80[n], 121605144); ++n) {}
        }
        this.field76.clear();
    }
    
    public int ag() {
        return 2130864358 * this.KeyHandler_idleCycles;
    }
    
    public static void hq(final KeyHandler keyHandler, final int n) {
        if (keyHandler == null) {
            keyHandler.method103(n);
        }
        try {
            keyHandler.KeyHandler_idleCycles -= 132994239;
            keyHandler.method104((byte)(-64));
            final Iterator<class33> iterator = (Iterator<class33>)keyHandler.field76.iterator();
            while (iterator.hasNext()) {
                if (n != 190164456) {
                    return;
                }
                final class33 class33 = iterator.next();
                int i = 0;
                while (i < keyHandler.field80.length) {
                    if (n != 190164456) {
                        throw new IllegalStateException();
                    }
                    if (class33.method142(keyHandler.field80[i], 2098097689)) {
                        if (n != 190164456) {
                            throw new IllegalStateException();
                        }
                        break;
                    }
                    else {
                        ++i;
                    }
                }
            }
            keyHandler.field76.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.au(" + ')');
        }
    }
    
    public static boolean bj(final KeyEvent keyEvent) {
        return (ScriptFrame.client.kh() == 10 || ScriptFrame.client.kh() == 11) && ScriptFrame.client.getCurrentLoginField() == 1 && !keyEvent.isMetaDown() && !keyEvent.isControlDown();
    }
    
    public static void mu(final KeyHandler keyHandler, final class29 class29, final int n, final int n2) {
        if (keyHandler == null) {
            keyHandler.method100(class29, n, n);
            return;
        }
        try {
            keyHandler.field80[n] = class29;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.af(" + ')');
        }
    }
    
    public int ff() {
        return this.KeyHandler_idleCycles * 581428417;
    }
    
    public static void jn(final KeyHandler keyHandler, final Component component, final byte b) {
        if (keyHandler == null) {
            keyHandler.method102(component, b);
            return;
        }
        try {
            component.setFocusTraversalKeysEnabled(false);
            component.addKeyListener(keyHandler);
            component.addFocusListener(keyHandler);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.aw(" + ')');
        }
    }
    
    static final void method107(final byte b) {
        try {
            for (PendingSpawn pendingSpawn = (PendingSpawn)Client.pendingSpawns.last(); pendingSpawn != null; pendingSpawn = (PendingSpawn)Client.pendingSpawns.previous()) {
                if (1457211081 * pendingSpawn.endCycle == -1) {
                    pendingSpawn.startCycle = 0;
                    Messages.method656(pendingSpawn, -1336825850);
                }
                else {
                    pendingSpawn.hw();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ap.jl(" + ')');
        }
    }
    
    public final synchronized void bk(final FocusEvent focusEvent) {
        this.field77.add(new class33(4, 1));
    }
    
    void ah(final Component component) {
        component.setFocusTraversalKeysEnabled(false);
        component.addKeyListener(this);
        component.addFocusListener(this);
    }
    
    public void ik(final FocusEvent focusEvent) {
        final FocusChanged focusChanged = new FocusChanged();
        focusChanged.setFocused(false);
        ScriptFrame.client.getCallbacks().post((Object)focusChanged);
    }
}
