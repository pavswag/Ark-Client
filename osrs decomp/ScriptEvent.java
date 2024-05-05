// 
// Decompiled by Procyon v0.5.36
// 

public class ScriptEvent extends Node implements net.runelite.api.ScriptEvent
{
    boolean field849;
    int keyPressed;
    static int field851;
    int mouseX;
    int mouseY;
    int opIndex;
    Widget widget;
    int keyTyped;
    Widget dragTarget;
    String targetName;
    int field859;
    int type;
    Object[] args;
    static AbstractArchive Widget_spritesArchive;
    
    public ScriptEvent() {
        this.type = -1484849228;
    }
    
    public void run() {
        Client.ua(this);
    }
    
    static Object method489(final int n, final int n2) {
        try {
            return Language.method1948((class478)StructComposition.findEnumerated(class478.method2432(-2017312753), n, (short)173), (byte)90);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dr.cn(" + ')');
        }
    }
    
    public static void sd(final ScriptEvent scriptEvent, final Widget dragTarget, final byte b) {
        if (scriptEvent == null) {
            scriptEvent.method491(dragTarget, b);
        }
        try {
            scriptEvent.dragTarget = dragTarget;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dr.aw(" + ')');
        }
    }
    
    public void at(final Widget dragTarget) {
        this.dragTarget = dragTarget;
    }
    
    public Widget hd() {
        return this.dragTarget;
    }
    
    public void method491(final Widget widget, final byte b) {
        try {
            this.widget = widget;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dr.aw(" + ')');
        }
    }
    
    public void al(final Widget dragTarget) {
        this.dragTarget = dragTarget;
    }
    
    public void setType(final int n, final int n2) {
        try {
            this.type = 941178879 * n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dr.an(" + ')');
        }
    }
    
    public void method492(final Object[] args) {
        this.args = args;
    }
    
    public static boolean method492(final int n, final int n2) {
        try {
            boolean b;
            if (0x0 != (n >> 21 & 0x1)) {
                if (n2 >= 1590591885) {
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
            throw HealthBar.get(ex, "dr.ac(" + ')');
        }
    }
    
    public ScriptEvent he(final net.runelite.api.widgets.Widget widget) {
        this.dragTarget = (Widget)widget;
        return this;
    }
    
    public Object[] getArguments() {
        return this.args;
    }
    
    public void au(final int n) {
        this.type = -1679334575 * n;
    }
    
    public void ye(final Object[] args) {
        this.args = args;
    }
    
    public void setArgs(final Object[] args, final int n) {
        try {
            this.args = args;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dr.af(" + ')');
        }
    }
    
    public void ab(final int n) {
        this.type = 941178879 * n;
    }
    
    public int getOp() {
        return this.opIndex * 684782445;
    }
    
    public int getMouseY() {
        return this.mouseY * 650213389;
    }
    
    public String getOpbase() {
        return this.targetName;
    }
    
    public int getTypedKeyCode() {
        return this.keyTyped * -2125751633;
    }
    
    public int getTypedKeyChar() {
        return this.keyPressed * -19398649;
    }
    
    public int getMouseX() {
        return this.mouseX * -1266615561;
    }
}
