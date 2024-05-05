import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

// 
// Decompiled by Procyon v0.5.36
// 

public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener
{
    public static int MouseHandler_currentButton;
    static final int an = 2;
    static final int aw = 4;
    public static MouseHandler MouseHandler_instance;
    public static volatile int MouseHandler_lastPressedXVolatile;
    public int md;
    public static volatile int MouseHandler_currentButtonVolatile;
    public static volatile int MouseHandler_xVolatile;
    public static volatile int MouseHandler_idleCycles;
    static final int af = 1;
    public static volatile long MouseHandler_lastMovedVolatile;
    public static int MouseHandler_x;
    public static int MouseHandler_y;
    public static volatile int MouseHandler_lastButtonVolatile;
    public static volatile int MouseHandler_yVolatile;
    public static long MouseHandler_millis;
    public static volatile int MouseHandler_lastPressedYVolatile;
    public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
    public static long MouseHandler_lastPressedTimeMillis;
    public static int MouseHandler_lastPressedX;
    public static int MouseHandler_lastPressedY;
    public static int MouseHandler_lastButton;
    static ClanChannel guestClanChannel;
    
    MouseHandler() {
    }
    
    static {
        MouseHandler.MouseHandler_instance = new MouseHandler();
        MouseHandler.MouseHandler_idleCycles = 0;
        MouseHandler.MouseHandler_currentButtonVolatile = 0;
        MouseHandler.MouseHandler_xVolatile = 1849679947;
        MouseHandler.MouseHandler_yVolatile = -225734783;
        MouseHandler.MouseHandler_lastMovedVolatile = -678214925528160149L;
        MouseHandler.MouseHandler_currentButton = 0;
        MouseHandler.MouseHandler_x = 0;
        MouseHandler.MouseHandler_y = 0;
        MouseHandler.MouseHandler_millis = 0L;
        MouseHandler.MouseHandler_lastButtonVolatile = 0;
        MouseHandler.MouseHandler_lastPressedXVolatile = 0;
        MouseHandler.MouseHandler_lastPressedYVolatile = 0;
        MouseHandler.MouseHandler_lastPressedTimeMillisVolatile = 0L;
        MouseHandler.MouseHandler_lastButton = 0;
        MouseHandler.MouseHandler_lastPressedX = 0;
        MouseHandler.MouseHandler_lastPressedY = 0;
        MouseHandler.MouseHandler_lastPressedTimeMillis = 0L;
    }
    
    public final synchronized void bb(final MouseEvent mouseEvent) {
        this.mouseMoved(mouseEvent);
    }
    
    final int ao(final MouseEvent mouseEvent) {
        final int button = mouseEvent.getButton();
        if (mouseEvent.isAltDown() || button == 2) {
            return 4;
        }
        if (!mouseEvent.isMetaDown() && 3 != button) {
            return 1;
        }
        return 2;
    }
    
    public static int at() {
        return (MouseHandler.MouseHandler_idleCycles -= 500489753) * -119381545 - 1;
    }
    
    public final void av(final MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    public final synchronized void be(final MouseEvent mouseEvent) {
        if (null != MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_idleCycles = 0;
            MouseHandler.MouseHandler_xVolatile = mouseEvent.getX() * 1634798673;
            MouseHandler.MouseHandler_yVolatile = mouseEvent.getY() * 225734783;
            MouseHandler.MouseHandler_lastMovedVolatile = mouseEvent.getWhen() * 678214925528160149L;
        }
    }
    
    public final synchronized void as(final MouseEvent mouseEvent) {
        if (MouseHandler.MouseHandler_instance != null) {
            MouseHandler.MouseHandler_idleCycles = 0;
            MouseHandler.MouseHandler_xVolatile = 1849679947;
            MouseHandler.MouseHandler_yVolatile = -225734783;
            MouseHandler.MouseHandler_lastMovedVolatile = mouseEvent.getWhen() * 678214925528160149L;
        }
    }
    
    static int method191(final int n) {
        try {
            if (null != Client.archiveLoaders) {
                if (n >= 854271946) {
                    throw new IllegalStateException();
                }
                if (Client.archiveLoadersDone * -397497277 < Client.archiveLoaders.size()) {
                    int n2 = 0;
                    for (int i = 0; i <= Client.archiveLoadersDone * -397497277; ++i) {
                        n2 += ((ArchiveLoader)Client.archiveLoaders.get(i)).loadedCount * -1464399353;
                    }
                    return n2 * 10000 / (Client.field397 * 1240602605);
                }
                if (n >= 854271946) {
                    throw new IllegalStateException();
                }
            }
            return 10000;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bd.hd(" + ')');
        }
    }
    
    final int ax(final MouseEvent mouseEvent) {
        final int button = mouseEvent.getButton();
        if (mouseEvent.isAltDown() || button == 2) {
            return 4;
        }
        if (!mouseEvent.isMetaDown() && 3 != button) {
            return 1;
        }
        return 2;
    }
    
    public static int ay() {
        return (MouseHandler.MouseHandler_idleCycles += 1288886998) * 457374606 - 1;
    }
    
    public static int xp(final MouseHandler mouseHandler, final MouseEvent mouseEvent, final byte b) {
        if (mouseHandler == null) {
            return mouseHandler.getButton(mouseEvent, b);
        }
        try {
            final int button = mouseEvent.getButton();
            if (!mouseEvent.isAltDown()) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                if (button != 2) {
                    if (!mouseEvent.isMetaDown()) {
                        if (3 != button) {
                            return 1;
                        }
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                    }
                    return 2;
                }
            }
            return 4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bd.ac(" + ')');
        }
    }
    
    public final synchronized void bi(final MouseEvent mouseEvent) {
        if (null != MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_idleCycles = 0;
            MouseHandler.MouseHandler_xVolatile = mouseEvent.getX() * -1849679947;
            MouseHandler.MouseHandler_yVolatile = mouseEvent.getY() * -2083611069;
            MouseHandler.MouseHandler_lastMovedVolatile = mouseEvent.getWhen() * 678214925528160149L;
        }
    }
    
    public final synchronized void bo(final FocusEvent focusEvent) {
        if (null != MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_currentButtonVolatile = 0;
        }
    }
    
    public final synchronized void am(final MouseEvent mouseEvent) {
        if (MouseHandler.MouseHandler_instance != null) {
            MouseHandler.MouseHandler_idleCycles = 0;
            MouseHandler.MouseHandler_xVolatile = 1546946769;
            MouseHandler.MouseHandler_yVolatile = -225734783;
            MouseHandler.MouseHandler_lastMovedVolatile = mouseEvent.getWhen() * 678214925528160149L;
        }
    }
    
    public static void al() {
        if (MouseHandler.MouseHandler_instance != null) {
            synchronized (MouseHandler.MouseHandler_instance) {
                MouseHandler.MouseHandler_instance = null;
            }
        }
    }
    
    public static boolean method195(final char c, final int n) {
        try {
            if (c >= ' ') {
                if (n == 361417104) {
                    throw new IllegalStateException();
                }
                if (c < '\u007f') {
                    return true;
                }
                if (n == 361417104) {
                    throw new IllegalStateException();
                }
            }
            if (c > '\u007f') {
                if (c < ' ') {
                    return true;
                }
                if (n == 361417104) {
                    throw new IllegalStateException();
                }
            }
            if (c > ' ') {
                if (n == 361417104) {
                    throw new IllegalStateException();
                }
                if (c <= '\u00ff') {
                    if (n == 361417104) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
            if ('\0' != c) {
                if (n == 361417104) {
                    throw new IllegalStateException();
                }
                final char[] cp1252AsciiExtension = class369.cp1252AsciiExtension;
                for (int i = 0; i < cp1252AsciiExtension.length; ++i) {
                    if (cp1252AsciiExtension[i] == c) {
                        return true;
                    }
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bd.an(" + ')');
        }
    }
    
    final int getButton(final MouseEvent mouseEvent, final byte b) {
        try {
            final int button = mouseEvent.getButton();
            if (!mouseEvent.isAltDown()) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                if (button != 2) {
                    if (!mouseEvent.isMetaDown()) {
                        if (3 != button) {
                            return 1;
                        }
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                    }
                    return 2;
                }
            }
            return 4;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bd.ac(" + ')');
        }
    }
    
    static final void method193(final Widget widget, final int n) {
        try {
            final int n2 = widget.contentType * 1021339961;
            if (n2 == 324) {
                if (-1 == Client.field639 * -1563612739) {
                    if (n == -1033157486) {
                        throw new IllegalStateException();
                    }
                    Client.field639 = 1781840109 * widget.spriteId2;
                    Client.field640 = 1885844547 * widget.spriteId;
                }
                if (1 == Client.playerAppearance.npcTransformId * 1693987821) {
                    if (n == -1033157486) {
                        return;
                    }
                    widget.spriteId2 = Client.field639 * -272472859;
                }
                else {
                    widget.spriteId2 = -1012252929 * Client.field640;
                }
                return;
            }
            if (n2 == 325) {
                if (n == -1033157486) {
                    return;
                }
                if (-1 == -1563612739 * Client.field639) {
                    if (n == -1033157486) {
                        throw new IllegalStateException();
                    }
                    Client.field639 = 1781840109 * widget.spriteId2;
                    Client.field640 = widget.spriteId * 1885844547;
                }
                if (1 == Client.playerAppearance.npcTransformId * 1693987821) {
                    widget.spriteId2 = Client.field640 * -1012252929;
                }
                else {
                    widget.spriteId2 = -272472859 * Client.field639;
                }
            }
            else if (327 == n2) {
                if (n == -1033157486) {
                    return;
                }
                widget.modelAngleX = 38330330;
                widget.modelAngleY = ((int)(Math.sin(Client.cycle * -1886224337 / 40.0) * 256.0) & 0x7FF) * -230241203;
                widget.modelType = 17527377;
                widget.modelId = 0;
            }
            else {
                if (328 != n2) {
                    return;
                }
                if (n == -1033157486) {
                    return;
                }
                widget.modelAngleX = 38330330;
                widget.modelAngleY = ((int)(Math.sin(Client.cycle * -1886224337 / 40.0) * 256.0) & 0x7FF) * -230241203;
                widget.modelType = 17527377;
                widget.modelId = 509431749;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bd.mr(" + ')');
        }
    }
    
    public static void je(final InvDefinition invDefinition, final Buffer buffer, final int n) {
        if (invDefinition == null) {
            invDefinition.ao(buffer, n);
        }
        if (2 == n) {
            invDefinition.size = buffer.readUnsignedShort(-1773020465) * -383988544;
        }
    }
    
    static void au(final Component component) {
        component.addMouseListener(MouseHandler.MouseHandler_instance);
        component.addMouseMotionListener(MouseHandler.MouseHandler_instance);
        component.addFocusListener(MouseHandler.MouseHandler_instance);
    }
    
    public static int aa() {
        return (MouseHandler.MouseHandler_idleCycles -= 500489753) * -119381545 - 1;
    }
    
    public final synchronized void ai(final MouseEvent mouseEvent) {
        if (MouseHandler.MouseHandler_instance != null) {
            MouseHandler.MouseHandler_idleCycles = 0;
            MouseHandler.MouseHandler_lastPressedXVolatile = mouseEvent.getX() * 394285213;
            MouseHandler.MouseHandler_lastPressedYVolatile = mouseEvent.getY() * -1202616623;
            MouseHandler.MouseHandler_lastPressedTimeMillisVolatile = class96.clockNow(821578018) * 4279889128239043159L;
            MouseHandler.MouseHandler_lastButtonVolatile = xp(this, mouseEvent, (byte)(-44)) * -528109255;
            if (0 != -1491866359 * MouseHandler.MouseHandler_lastButtonVolatile) {
                MouseHandler.MouseHandler_currentButtonVolatile = -946669631 * MouseHandler.MouseHandler_lastButtonVolatile;
            }
        }
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
    }
    
    @Override
    public final synchronized void focusLost(final FocusEvent focusEvent) {
        try {
            if (null != MouseHandler.MouseHandler_instance) {
                MouseHandler.MouseHandler_currentButtonVolatile = 0;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bd.focusLost(" + ')');
        }
    }
    
    @Override
    public final synchronized void mousePressed(MouseEvent mousePressed) {
        if (this.md == 0) {
            mousePressed = ScriptFrame.client.getCallbacks().mousePressed(mousePressed);
        }
        if (!mousePressed.isConsumed()) {
            ++this.md;
            try {
                final MouseEvent mouseEvent = mousePressed;
                try {
                    if (MouseHandler.MouseHandler_instance != null) {
                        MouseHandler.MouseHandler_idleCycles = 0;
                        Client.ww(-1);
                        MouseHandler.MouseHandler_lastPressedXVolatile = mouseEvent.getX() * 394285213;
                        MouseHandler.MouseHandler_lastPressedYVolatile = mouseEvent.getY() * -1202616623;
                        MouseHandler.MouseHandler_lastPressedTimeMillisVolatile = class96.clockNow(1155874390) * 4279889128239043159L;
                        MouseHandler.MouseHandler_lastButtonVolatile = xp(this, mouseEvent, (byte)(-121)) * -528109255;
                        if (0 != -1491866359 * MouseHandler.MouseHandler_lastButtonVolatile) {
                            MouseHandler.MouseHandler_currentButtonVolatile = -946669631 * MouseHandler.MouseHandler_lastButtonVolatile;
                        }
                    }
                    if (mouseEvent.isPopupTrigger()) {
                        mouseEvent.consume();
                    }
                }
                catch (RuntimeException ex) {
                    throw HealthBar.get(ex, "bd.mousePressed(" + ')');
                }
            }
            finally {
                --this.md;
            }
        }
    }
    
    @Override
    public final synchronized void mouseReleased(MouseEvent mouseReleased) {
        if (this.md == 0) {
            mouseReleased = ScriptFrame.client.getCallbacks().mouseReleased(mouseReleased);
        }
        if (!mouseReleased.isConsumed()) {
            ++this.md;
            try {
                final MouseEvent mouseEvent = mouseReleased;
                try {
                    if (null != MouseHandler.MouseHandler_instance) {
                        MouseHandler.MouseHandler_idleCycles = 0;
                        Client.ww(-1);
                        MouseHandler.MouseHandler_currentButtonVolatile = 0;
                    }
                    if (mouseEvent.isPopupTrigger()) {
                        mouseEvent.consume();
                    }
                }
                catch (RuntimeException ex) {
                    throw HealthBar.get(ex, "bd.mouseReleased(" + ')');
                }
            }
            finally {
                --this.md;
            }
        }
    }
    
    @Override
    public final void mouseClicked(MouseEvent mouseClicked) {
        mouseClicked = ScriptFrame.client.getCallbacks().mouseClicked(mouseClicked);
        if (!mouseClicked.isConsumed()) {
            final MouseEvent mouseEvent = mouseClicked;
            try {
                if (mouseEvent.isPopupTrigger()) {
                    mouseEvent.consume();
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "bd.mouseClicked(" + ')');
            }
        }
    }
    
    @Override
    public final synchronized void mouseExited(MouseEvent mouseExited) {
        if (this.md == 0) {
            mouseExited = ScriptFrame.client.getCallbacks().mouseExited(mouseExited);
        }
        if (!mouseExited.isConsumed()) {
            ++this.md;
            try {
                final MouseEvent mouseEvent = mouseExited;
                try {
                    if (MouseHandler.MouseHandler_instance != null) {
                        MouseHandler.MouseHandler_idleCycles = 0;
                        Client.ww(-1);
                        MouseHandler.MouseHandler_xVolatile = 1849679947;
                        MouseHandler.MouseHandler_yVolatile = -225734783;
                        MouseHandler.MouseHandler_lastMovedVolatile = mouseEvent.getWhen() * 678214925528160149L;
                    }
                }
                catch (RuntimeException ex) {
                    throw HealthBar.get(ex, "bd.mouseExited(" + ')');
                }
            }
            finally {
                --this.md;
            }
        }
    }
    
    @Override
    public final synchronized void mouseEntered(MouseEvent mouseEntered) {
        if (this.md == 0) {
            mouseEntered = ScriptFrame.client.getCallbacks().mouseEntered(mouseEntered);
        }
        if (!mouseEntered.isConsumed()) {
            ++this.md;
            try {
                final MouseEvent mouseEvent = mouseEntered;
                try {
                    this.mouseMoved(mouseEvent);
                }
                catch (RuntimeException ex) {
                    throw HealthBar.get(ex, "bd.mouseEntered(" + ')');
                }
            }
            finally {
                --this.md;
            }
        }
    }
    
    @Override
    public final synchronized void mouseMoved(MouseEvent mouseMoved) {
        if (this.md == 0) {
            mouseMoved = ScriptFrame.client.getCallbacks().mouseMoved(mouseMoved);
        }
        if (!mouseMoved.isConsumed()) {
            ++this.md;
            try {
                final MouseEvent mouseEvent = mouseMoved;
                try {
                    if (null != MouseHandler.MouseHandler_instance) {
                        MouseHandler.MouseHandler_idleCycles = 0;
                        Client.ww(-1);
                        MouseHandler.MouseHandler_xVolatile = mouseEvent.getX() * -1849679947;
                        MouseHandler.MouseHandler_yVolatile = mouseEvent.getY() * 225734783;
                        MouseHandler.MouseHandler_lastMovedVolatile = mouseEvent.getWhen() * 678214925528160149L;
                    }
                }
                catch (RuntimeException ex) {
                    throw HealthBar.get(ex, "bd.mouseMoved(" + ')');
                }
            }
            finally {
                --this.md;
            }
        }
    }
    
    @Override
    public final synchronized void mouseDragged(MouseEvent mouseDragged) {
        if (this.md == 0) {
            mouseDragged = ScriptFrame.client.getCallbacks().mouseDragged(mouseDragged);
        }
        if (!mouseDragged.isConsumed()) {
            ++this.md;
            try {
                final MouseEvent mouseEvent = mouseDragged;
                try {
                    this.mouseMoved(mouseEvent);
                }
                catch (RuntimeException ex) {
                    throw HealthBar.get(ex, "bd.mouseDragged(" + ')');
                }
            }
            finally {
                --this.md;
            }
        }
    }
    
    public final synchronized void bx(final FocusEvent focusEvent) {
        if (null != MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_currentButtonVolatile = 0;
        }
    }
    
    public final void ar(final MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    static void ab(final Component component) {
        component.addMouseListener(MouseHandler.MouseHandler_instance);
        component.addMouseMotionListener(MouseHandler.MouseHandler_instance);
        component.addFocusListener(MouseHandler.MouseHandler_instance);
    }
    
    public static void aq() {
        if (MouseHandler.MouseHandler_instance != null) {
            synchronized (MouseHandler.MouseHandler_instance) {
                MouseHandler.MouseHandler_instance = null;
            }
        }
    }
    
    static int method194(final int n, final Script script, final boolean b, final byte b2) {
        try {
            final Widget vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            if (n == 2600) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.scrollX * -1469632775;
                return 1;
            }
            else if (2601 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.scrollY * 1223232735;
                return 1;
            }
            else if (n == 2602) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = vmethod3380.field2916;
                return 1;
            }
            else if (2603 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.scrollWidth * -773060713;
                return 1;
            }
            else if (2604 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.scrollHeight * -1273374131;
                return 1;
            }
            else if (2605 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 942674363 * vmethod3380.modelZoom;
                return 1;
            }
            else if (n == 2606) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 797932055 * vmethod3380.modelAngleX;
                return 1;
            }
            else if (2607 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1023931993 * vmethod3380.modelAngleZ;
                return 1;
            }
            else if (2608 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -480949115 * vmethod3380.modelAngleY;
                return 1;
            }
            else if (2609 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1634279623 * vmethod3380.transparencyTop;
                return 1;
            }
            else if (2610 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 122284991 * vmethod3380.transparencyBot;
                return 1;
            }
            else if (2611 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.color * 1409091639;
                return 1;
            }
            else if (2612 == n) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1449039161 * vmethod3380.color2;
                return 1;
            }
            else if (n == 2613) {
                if (b2 == 60) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = vmethod3380.fillMode.rsOrdinal(2096946766);
                return 1;
            }
            else {
                if (n == 2614) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (vmethod3380.spriteFlipV ? 1 : 0);
                    return 1;
                }
                if (n == 2617) {
                    if (b2 == 60) {
                        throw new IllegalStateException();
                    }
                    final class309 method1817 = vmethod3380.method1817(-1740765458);
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((null != method1817) ? (method1817.field2817 * -90398499) : 0);
                }
                if (2618 == n) {
                    if (b2 == 60) {
                        throw new IllegalStateException();
                    }
                    final class309 method1818 = vmethod3380.method1817(-1740765458);
                    final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                    final int n2 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    int n3;
                    if (method1818 != null) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        n3 = method1818.field2818 * 216034339;
                    }
                    else {
                        n3 = 0;
                    }
                    interpreter_intStack[n2] = n3;
                    return 1;
                }
                else {
                    if (2619 == n) {
                        final class314 method1819 = vmethod3380.method1815((byte)11);
                        final String[] interpreter_stringStack = Interpreter.Interpreter_stringStack;
                        final int n4 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                        String mk;
                        if (null != method1819) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            mk = class379.mk(method1819.method1741((byte)19), -1389348498);
                        }
                        else {
                            mk = "";
                        }
                        interpreter_stringStack[n4] = mk;
                        return 1;
                    }
                    if (2620 == n) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        final class309 method1820 = vmethod3380.method1817(-1740765458);
                        final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                        final int n5 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        int n6;
                        if (null != method1820) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            n6 = method1820.field2816 * 1912484269;
                        }
                        else {
                            n6 = 0;
                        }
                        interpreter_intStack2[n5] = n6;
                        return 1;
                    }
                    else if (2621 == n) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        final class314 method1821 = vmethod3380.method1815((byte)18);
                        final int[] interpreter_intStack3 = Interpreter.Interpreter_intStack;
                        final int n7 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        int method1822;
                        if (method1821 != null) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            method1822 = method1821.method1716(-1665664841);
                        }
                        else {
                            method1822 = 0;
                        }
                        interpreter_intStack3[n7] = method1822;
                        return 1;
                    }
                    else if (n == 2622) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        final class314 method1823 = vmethod3380.method1815((byte)22);
                        final int[] interpreter_intStack4 = Interpreter.Interpreter_intStack;
                        final int n8 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        int method1824;
                        if (method1823 != null) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            method1824 = method1823.method1751(-2018781112);
                        }
                        else {
                            method1824 = 0;
                        }
                        interpreter_intStack4[n8] = method1824;
                        return 1;
                    }
                    else if (n == 2623) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        final class314 method1825 = vmethod3380.method1815((byte)(-72));
                        final int[] interpreter_intStack5 = Interpreter.Interpreter_intStack;
                        final int n9 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        int method1826;
                        if (method1825 != null) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            method1826 = method1825.method1746(1424429838);
                        }
                        else {
                            method1826 = 0;
                        }
                        interpreter_intStack5[n9] = method1826;
                        return 1;
                    }
                    else if (n == 2624) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        final class314 method1827 = vmethod3380.method1815((byte)(-8));
                        final int[] interpreter_intStack6 = Interpreter.Interpreter_intStack;
                        final int n10 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        while (true) {
                            Label_1727: {
                                if (method1827 == null) {
                                    break Label_1727;
                                }
                                if (b2 == 60) {
                                    throw new IllegalStateException();
                                }
                                if (!class314.method1728(method1827, 1794299510)) {
                                    break Label_1727;
                                }
                                if (b2 == 60) {
                                    throw new IllegalStateException();
                                }
                                final boolean b3 = true;
                                interpreter_intStack6[n10] = (b3 ? 1 : 0);
                                return 1;
                            }
                            final boolean b3 = false;
                            continue;
                        }
                    }
                    else if (n == 2625) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        final class314 method1828 = vmethod3380.method1815((byte)13);
                        final int[] interpreter_intStack7 = Interpreter.Interpreter_intStack;
                        final int n11 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                        boolean b4 = false;
                        Label_1569: {
                            if (method1828 != null) {
                                if (b2 == 60) {
                                    throw new IllegalStateException();
                                }
                                if (method1828.ed(1994580892)) {
                                    if (b2 == 60) {
                                        throw new IllegalStateException();
                                    }
                                    b4 = true;
                                    break Label_1569;
                                }
                            }
                            b4 = false;
                        }
                        interpreter_intStack7[n11] = (b4 ? 1 : 0);
                        return 1;
                    }
                    else if (2626 == n) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        final class314 method1829 = vmethod3380.method1815((byte)15);
                        final String[] interpreter_stringStack2 = Interpreter.Interpreter_stringStack;
                        final int n12 = (SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1;
                        String method1830;
                        if (null != method1829) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            method1830 = class314.method1751(method1829, 1348666556).method2083(1175090531);
                        }
                        else {
                            method1830 = "";
                        }
                        interpreter_stringStack2[n12] = method1830;
                        return 1;
                    }
                    else if (n == 2627) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        final class314 method1831 = vmethod3380.method1815((byte)(-66));
                        int method1832;
                        if (null != method1831) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            method1832 = method1831.method1753(1922606018);
                        }
                        else {
                            method1832 = 0;
                        }
                        final int n13 = method1832;
                        final int n14 = (null != method1831) ? method1831.method1769(-1877189318) : 0;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.min(n13, n14);
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Math.max(n13, n14);
                        return 1;
                    }
                    else if (n == 2628) {
                        if (b2 == 60) {
                            throw new IllegalStateException();
                        }
                        final class314 method1833 = vmethod3380.method1815((byte)(-41));
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ((method1833 != null) ? method1833.method1769(744622504) : 0);
                        return 1;
                    }
                    else {
                        if (n == 2629) {
                            final class314 method1834 = vmethod3380.method1815((byte)(-45));
                            final int[] interpreter_intStack8 = Interpreter.Interpreter_intStack;
                            final int n15 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            int method1835;
                            if (null != method1834) {
                                if (b2 == 60) {
                                    throw new IllegalStateException();
                                }
                                method1835 = method1834.method1781(-743051865);
                            }
                            else {
                                method1835 = 0;
                            }
                            interpreter_intStack8[n15] = method1835;
                            return 1;
                        }
                        if (n == 2630) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            final class314 method1836 = vmethod3380.method1815((byte)(-51));
                            final int[] interpreter_intStack9 = Interpreter.Interpreter_intStack;
                            final int n16 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            int method1837;
                            if (method1836 != null) {
                                if (b2 == 60) {
                                    throw new IllegalStateException();
                                }
                                method1837 = method1836.method1752((byte)(-65));
                            }
                            else {
                                method1837 = 0;
                            }
                            interpreter_intStack9[n16] = method1837;
                            return 1;
                        }
                        else if (2631 == n) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            final class314 method1838 = vmethod3380.method1815((byte)(-45));
                            final int[] interpreter_intStack10 = Interpreter.Interpreter_intStack;
                            final int n17 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            int ww;
                            if (null != method1838) {
                                if (b2 == 60) {
                                    throw new IllegalStateException();
                                }
                                ww = class314.ww(method1838, 860916461);
                            }
                            else {
                                ww = 0;
                            }
                            interpreter_intStack10[n17] = ww;
                            return 1;
                        }
                        else if (2632 == n) {
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            final class314 method1839 = vmethod3380.method1815((byte)58);
                            final int[] interpreter_intStack11 = Interpreter.Interpreter_intStack;
                            final int n18 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            int ve;
                            if (null != method1839) {
                                if (b2 == 60) {
                                    throw new IllegalStateException();
                                }
                                ve = class314.ve(method1839, (byte)(-40));
                            }
                            else {
                                ve = 0;
                            }
                            interpreter_intStack11[n18] = ve;
                            return 1;
                        }
                        else {
                            if (n == 2633) {
                                final class27 method1840 = vmethod3380.method1795(2109250007);
                                final int[] interpreter_intStack12 = Interpreter.Interpreter_intStack;
                                final int n19 = Interpreter.Interpreter_intStackSize * -964267539 - 1;
                                int be;
                                if (method1840 != null) {
                                    if (b2 == 60) {
                                        throw new IllegalStateException();
                                    }
                                    be = class27.be(method1840, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 - 1], -1240015420);
                                }
                                else {
                                    be = 0;
                                }
                                interpreter_intStack12[n19] = be;
                                return 1;
                            }
                            if (n != 2634) {
                                return 2;
                            }
                            if (b2 == 60) {
                                throw new IllegalStateException();
                            }
                            final class27 method1841 = vmethod3380.method1795(2024612722);
                            final int[] interpreter_intStack13 = Interpreter.Interpreter_intStack;
                            final int n20 = Interpreter.Interpreter_intStackSize * -964267539 - 1;
                            int bh;
                            if (method1841 != null) {
                                if (b2 == 60) {
                                    throw new IllegalStateException();
                                }
                                bh = class27.bh(method1841, (char)Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize - 1], (byte)32);
                            }
                            else {
                                bh = 0;
                            }
                            interpreter_intStack13[n20] = bh;
                            return 1;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bd.aj(" + ')');
        }
    }
    
    public final synchronized void method194(final MouseEvent mouseEvent) {
        if (MouseHandler.MouseHandler_instance != null) {
            MouseHandler.MouseHandler_idleCycles = 0;
            MouseHandler.MouseHandler_xVolatile = 1849679947;
            MouseHandler.MouseHandler_yVolatile = -225734783;
            MouseHandler.MouseHandler_lastMovedVolatile = mouseEvent.getWhen() * 678214925528160149L;
        }
    }
    
    public final synchronized void ag(final MouseEvent mouseEvent) {
        if (MouseHandler.MouseHandler_instance != null) {
            MouseHandler.MouseHandler_idleCycles = 0;
            MouseHandler.MouseHandler_lastPressedXVolatile = mouseEvent.getX() * 394285213;
            MouseHandler.MouseHandler_lastPressedYVolatile = mouseEvent.getY() * -1202616623;
            MouseHandler.MouseHandler_lastPressedTimeMillisVolatile = class96.clockNow(355854891) * 4279889128239043159L;
            MouseHandler.MouseHandler_lastButtonVolatile = xp(this, mouseEvent, (byte)(-103)) * 338783853;
            if (0 != -571961286 * MouseHandler.MouseHandler_lastButtonVolatile) {
                MouseHandler.MouseHandler_currentButtonVolatile = 1267620004 * MouseHandler.MouseHandler_lastButtonVolatile;
            }
        }
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    public final synchronized void bz(final MouseEvent mouseEvent) {
        if (null != MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_idleCycles = 0;
            MouseHandler.MouseHandler_xVolatile = mouseEvent.getX() * -1849679947;
            MouseHandler.MouseHandler_yVolatile = mouseEvent.getY() * 225734783;
            MouseHandler.MouseHandler_lastMovedVolatile = mouseEvent.getWhen() * 678214925528160149L;
        }
    }
    
    static void addPlayerToScene(final Player player, final boolean b, final int n) {
        try {
            if (null != player) {
                if (n != -1861126010) {
                    return;
                }
                if (player.isVisible(1666539507)) {
                    if (n != -1861126010) {
                        throw new IllegalStateException();
                    }
                    if (!player.isHidden) {
                        if (n != -1861126010) {
                            throw new IllegalStateException();
                        }
                        player.isUnanimated = false;
                        Label_0170: {
                            Label_0101: {
                                if (Client.isLowDetail) {
                                    if (n != -1861126010) {
                                        throw new IllegalStateException();
                                    }
                                    if (Players.Players_count * -2010934433 > 50) {
                                        break Label_0101;
                                    }
                                    if (n != -1861126010) {
                                        return;
                                    }
                                }
                                if (-2010934433 * Players.Players_count <= 200) {
                                    break Label_0170;
                                }
                                if (n != -1861126010) {
                                    throw new IllegalStateException();
                                }
                            }
                            if (b) {
                                if (n != -1861126010) {
                                    throw new IllegalStateException();
                                }
                                if (player.cd * 1590591885 == -1302441815 * player.dg) {
                                    if (n != -1861126010) {
                                        throw new IllegalStateException();
                                    }
                                    player.isUnanimated = true;
                                }
                            }
                        }
                        final int n2 = 1144428983 * player.br >> 7;
                        final int n3 = -411750205 * player.ep >> 7;
                        if (n2 >= 0) {
                            if (n != -1861126010) {
                                throw new IllegalStateException();
                            }
                            if (n2 < 104) {
                                if (n != -1861126010) {
                                    return;
                                }
                                if (n3 >= 0) {
                                    if (n != -1861126010) {
                                        throw new IllegalStateException();
                                    }
                                    if (n3 < 104) {
                                        if (n != -1861126010) {
                                            throw new IllegalStateException();
                                        }
                                        final long calculateTag = FaceNormal.calculateTag(0, 0, 0, false, player.index * -1232170701, 1560958875);
                                        if (player.attachedModel != null) {
                                            if (n != -1861126010) {
                                                throw new IllegalStateException();
                                            }
                                            if (-1886224337 * Client.cycle >= player.animationCycleStart * -1402262375) {
                                                if (n != -1861126010) {
                                                    throw new IllegalStateException();
                                                }
                                                if (-1886224337 * Client.cycle < player.animationCycleEnd * -935505685) {
                                                    player.isUnanimated = false;
                                                    player.tileHeight = class147.getTileHeight(1144428983 * player.br, -411750205 * player.ep, GameEngine.Client_plane * -1727408401, (byte)8) * -548513145;
                                                    player.cx = -14183397 * Client.cycle;
                                                    class31.scene.addNullableObject(-1727408401 * GameEngine.Client_plane, player.br * 1144428983, player.ep * -411750205, 561204023 * player.tileHeight, 60, player, player.dx * -1703696531, calculateTag, -1793206457 * player.minX, -1107395863 * player.minY, 54499173 * player.maxX, player.maxY * 806621699);
                                                    return;
                                                }
                                            }
                                        }
                                        if (0x40 == (1144428983 * player.br & 0x7F)) {
                                            if (n != -1861126010) {
                                                throw new IllegalStateException();
                                            }
                                            if (0x40 == (player.ep * -411750205 & 0x7F)) {
                                                if (n != -1861126010) {
                                                    return;
                                                }
                                                if (Client.tileLastDrawnActor[n2][n3] == Client.viewportDrawCount * 2041464667) {
                                                    if (n != -1861126010) {
                                                        throw new IllegalStateException();
                                                    }
                                                    return;
                                                }
                                                else {
                                                    Client.tileLastDrawnActor[n2][n3] = 2041464667 * Client.viewportDrawCount;
                                                }
                                            }
                                        }
                                        player.tileHeight = class147.getTileHeight(1144428983 * player.br, player.ep * -411750205, -1727408401 * GameEngine.Client_plane, (byte)(-114)) * -548513145;
                                        player.cx = Client.cycle * -14183397;
                                        class31.scene.drawEntity(GameEngine.Client_plane * -1727408401, player.br * 1144428983, player.ep * -411750205, 561204023 * player.tileHeight, 60, player, -1703696531 * player.dx, calculateTag, player.an);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bd.ib(" + ')');
        }
    }
    
    public final void ah(final MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    public static void zw(final NPC npc, final NewShit field1048) {
        if (npc == null) {
            npc.getId();
        }
        npc.field1048 = field1048;
    }
}
