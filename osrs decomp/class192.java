// 
// Decompiled by Procyon v0.5.36
// 

public class class192
{
    static final class192 field1611;
    static final class192 field1612;
    static final class192 field1613;
    static int menuX;
    static final class192 field1615;
    static final class192 field1616;
    static final int al = 3;
    static final class192 field1617;
    static final class192 field1618;
    static final int ay = 5;
    static final int ba = 500;
    
    class192(final int n, final class204 class204) {
    }
    
    static {
        field1617 = new class192(0, class204.field1839);
        field1612 = new class192(1, class204.field1840);
        field1613 = new class192(2, class204.field1835);
        field1611 = new class192(3, class204.field1837);
        field1615 = new class192(4, class204.field1834);
        field1616 = new class192(5, class204.field1838);
        field1618 = new class192(6, class204.field1843);
    }
    
    static void alignWidgetPosition(final Widget widget, final int n, final int n2, final byte b) {
        try {
            if (-1596536121 * widget.xAlignment == 0) {
                widget.x = -942335045 * widget.rawX;
                widget.me(-1);
            }
            else if (-1596536121 * widget.xAlignment == 1) {
                if (b >= 1) {
                    return;
                }
                widget.x = ((n - -794961409 * widget.width) / 2 + -115015413 * widget.rawX) * 750411281;
                widget.me(-1);
            }
            else if (-1596536121 * widget.xAlignment == 2) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                widget.x = 750411281 * (n - -794961409 * widget.width - -115015413 * widget.rawX);
                widget.me(-1);
            }
            else if (widget.xAlignment * -1596536121 == 3) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                widget.x = (widget.rawX * -115015413 * n >> 14) * 750411281;
                widget.me(-1);
            }
            else if (4 == -1596536121 * widget.xAlignment) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                widget.x = ((n * (widget.rawX * -115015413) >> 14) + (n - -794961409 * widget.width) / 2) * 750411281;
                widget.me(-1);
            }
            else {
                widget.x = (n - -794961409 * widget.width - (-115015413 * widget.rawX * n >> 14)) * 750411281;
                widget.me(-1);
            }
            if (widget.yAlignment * 1484444061 == 0) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                widget.y = 843760119 * widget.rawY;
                widget.gr(-1);
            }
            else if (1 == 1484444061 * widget.yAlignment) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                widget.y = ((n2 - 1473950221 * widget.height) / 2 + widget.rawY * 1651158159) * -1520068583;
                widget.gr(-1);
            }
            else if (1484444061 * widget.yAlignment == 2) {
                widget.y = -1520068583 * (n2 - widget.height * 1473950221 - 1651158159 * widget.rawY);
                widget.gr(-1);
            }
            else if (3 == widget.yAlignment * 1484444061) {
                widget.y = -1520068583 * (widget.rawY * 1651158159 * n2 >> 14);
                widget.gr(-1);
            }
            else if (4 == widget.yAlignment * 1484444061) {
                if (b >= 1) {
                    return;
                }
                widget.y = ((n2 - widget.height * 1473950221) / 2 + (n2 * (widget.rawY * 1651158159) >> 14)) * -1520068583;
                widget.gr(-1);
            }
            else {
                widget.y = (n2 - widget.height * 1473950221 - (widget.rawY * 1651158159 * n2 >> 14)) * -1520068583;
                widget.gr(-1);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hl.lj(" + ')');
        }
    }
}
