// 
// Decompiled by Procyon v0.5.36
// 

public class class135 implements class356
{
    static final int av = 11;
    public static final class135 field1299;
    final int id;
    public static final class135 field1301;
    public static final class135 field1302;
    public static final class135 field1303;
    public final int field1304;
    public static final class135 field1305;
    public static final String kb = "Please enter your date of birth (DD/MM/YYYY)";
    
    class135(final int n, final int n2) {
        this.field1304 = -1807848051 * n;
        this.id = -175369831 * n2;
    }
    
    static {
        field1302 = new class135(2, 0);
        field1299 = new class135(1, 1);
        field1305 = new class135(0, 2);
        field1301 = new class135(3, 3);
        field1303 = new class135(4, 4);
    }
    
    static void resizeInterface(final Widget[] array, final int n, final int n2, final int n3, final boolean b, final int n4) {
        try {
            for (int i = 0; i < array.length; ++i) {
                final Widget widget = array[i];
                if (null == widget) {
                    if (n4 != 1809081725) {
                        return;
                    }
                }
                else if (widget.parentId * 913615679 != n) {
                    if (n4 != 1809081725) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    class158.alignWidgetSize(widget, n2, n3, b, -2107960553);
                    class192.alignWidgetPosition(widget, n2, n3, (byte)(-89));
                    if (-1469632775 * widget.scrollX > widget.scrollWidth * -773060713 - widget.width * -794961409) {
                        widget.scrollX = widget.scrollWidth * 18431759 - widget.width * 460912311;
                    }
                    if (widget.scrollX * -1469632775 < 0) {
                        if (n4 != 1809081725) {
                            throw new IllegalStateException();
                        }
                        widget.scrollX = 0;
                    }
                    if (widget.scrollY * 1223232735 > widget.scrollHeight * -1273374131 - widget.height * 1473950221) {
                        widget.scrollY = widget.scrollHeight * 1941770835 - 978547347 * widget.height;
                    }
                    if (widget.scrollY * 1223232735 < 0) {
                        if (n4 != 1809081725) {
                            throw new IllegalStateException();
                        }
                        widget.scrollY = 0;
                    }
                    if (0 == 883712245 * widget.type) {
                        if (n4 != 1809081725) {
                            throw new IllegalStateException();
                        }
                        WallDecoration.revalidateWidgetScroll(array, widget, b, (byte)79);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fp.ld(" + ')');
        }
    }
    
    @Override
    public int aw() {
        return -601050455 * this.id;
    }
    
    @Override
    public int an() {
        return -601050455 * this.id;
    }
    
    @Override
    public int ac() {
        return -601050455 * this.id;
    }
    
    static final void method783(int min, final byte b) {
        try {
            min = Math.min(Math.max(min, 0), 127);
            class20.clientPreferences.setAreaSoundEffectsVolume(min, 745434039);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fp.mi(" + ')');
        }
    }
    
    public static void iw(final Buffer buffer) {
        if (buffer == null) {
            buffer.hb();
        }
        if (null != buffer.array) {
            InterfaceParent.ByteArrayPool_release(buffer.array, (byte)69);
        }
        buffer.array = null;
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return -601050455 * this.id;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fp.af(" + ')');
        }
    }
}
