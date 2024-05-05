import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class ModeWhere implements class356
{
    static final ModeWhere field3557;
    static final ModeWhere field3558;
    static final ModeWhere field3559;
    static final ModeWhere field3560;
    static final ModeWhere field3561;
    static final ModeWhere field3562;
    public static String operatingSystemName;
    static final ModeWhere field3564;
    static final ModeWhere field3565;
    static final ModeWhere field3566;
    static final ModeWhere field3567;
    static final ModeWhere field3568;
    static final int wr = 3;
    final int id;
    final Set field3570;
    static String field3571;
    public static final int bb = 1;
    static final ModeWhere field3572;
    static final int bd = 42;
    static final ModeWhere field3573;
    public static final int bi = 27;
    
    ModeWhere(final String s, final int n) {
        this.field3570 = new HashSet();
        this.id = 1696685323 * n;
    }
    
    ModeWhere(final String s, final int n, final class355[] array) {
        this.field3570 = new HashSet();
        this.id = n * 1696685323;
        for (int i = 0; i < array.length; ++i) {
            this.field3570.add(array[i]);
        }
    }
    
    static {
        field3573 = new ModeWhere("", 0, new class355[] { class355.field3539 });
        field3558 = new ModeWhere("", 1, new class355[] { class355.field3540, class355.field3539 });
        field3559 = new ModeWhere("", 2, new class355[] { class355.field3540, class355.field3541, class355.field3539 });
        field3568 = new ModeWhere("", 3, new class355[] { class355.field3540 });
        field3561 = new ModeWhere("", 4);
        field3564 = new ModeWhere("", 5, new class355[] { class355.field3540, class355.field3539 });
        field3557 = new ModeWhere("", 6, new class355[] { class355.field3539 });
        field3560 = new ModeWhere("", 8, new class355[] { class355.field3540, class355.field3539 });
        field3565 = new ModeWhere("", 9, new class355[] { class355.field3540, class355.field3541 });
        field3566 = new ModeWhere("", 10, new class355[] { class355.field3540 });
        field3567 = new ModeWhere("", 11, new class355[] { class355.field3540 });
        field3572 = new ModeWhere("", 12, new class355[] { class355.field3540, class355.field3539 });
        field3562 = new ModeWhere("", 13, new class355[] { class355.field3540 });
        $values((byte)(-88));
    }
    
    static ModeWhere[] at() {
        return new ModeWhere[] { ModeWhere.field3557, ModeWhere.field3565, ModeWhere.field3564, ModeWhere.field3573, ModeWhere.field3568, ModeWhere.field3567, ModeWhere.field3558, ModeWhere.field3572, ModeWhere.field3560, ModeWhere.field3559, ModeWhere.field3561, ModeWhere.field3562, ModeWhere.field3566 };
    }
    
    static final void Widget_setKeyIgnoreHeld(final Widget widget, final int n, final byte b) {
        try {
            if (null != widget.field2954) {
                if (null == widget.field2952) {
                    if (b >= 57) {
                        throw new IllegalStateException();
                    }
                    widget.field2952 = new int[widget.field2954.length];
                }
                widget.field2952[n] = Integer.MAX_VALUE;
                return;
            }
            if (b >= 57) {
                throw new IllegalStateException();
            }
            throw new RuntimeException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ne.ay(" + ')');
        }
    }
    
    @Override
    public int aw() {
        return this.id * -336951645;
    }
    
    static ModeWhere[] al() {
        return new ModeWhere[] { ModeWhere.field3557, ModeWhere.field3565, ModeWhere.field3564, ModeWhere.field3573, ModeWhere.field3568, ModeWhere.field3567, ModeWhere.field3558, ModeWhere.field3572, ModeWhere.field3560, ModeWhere.field3559, ModeWhere.field3561, ModeWhere.field3562, ModeWhere.field3566 };
    }
    
    static String method1953(String substring, final int n) {
        try {
            final PlayerType[] playerType_values = StudioGame.PlayerType_values((byte)42);
            int i = 0;
            while (i < playerType_values.length) {
                if (n != 1227239523) {
                    throw new IllegalStateException();
                }
                final PlayerType playerType = playerType_values[i];
                if (playerType.modIcon * 2138745227 != -1 && substring.startsWith(ArchiveDiskActionHandler.addImageTag(playerType.modIcon * 2138745227, 938011940))) {
                    if (n != 1227239523) {
                        throw new IllegalStateException();
                    }
                    substring = substring.substring(6 + Integer.toString(playerType.modIcon * 2138745227).length());
                    break;
                }
                else {
                    ++i;
                }
            }
            return substring;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ne.nh(" + ')');
        }
    }
    
    @Override
    public int an() {
        return this.id * 955467446;
    }
    
    @Override
    public int ac() {
        return this.id * -336951645;
    }
    
    static ModeWhere[] $values(final byte b) {
        try {
            return new ModeWhere[] { ModeWhere.field3557, ModeWhere.field3565, ModeWhere.field3564, ModeWhere.field3573, ModeWhere.field3568, ModeWhere.field3567, ModeWhere.field3558, ModeWhere.field3572, ModeWhere.field3560, ModeWhere.field3559, ModeWhere.field3561, ModeWhere.field3562, ModeWhere.field3566 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ne.au(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.id * -336951645;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ne.af(" + ')');
        }
    }
    
    static ModeWhere[] ab() {
        return new ModeWhere[] { ModeWhere.field3557, ModeWhere.field3565, ModeWhere.field3564, ModeWhere.field3573, ModeWhere.field3568, ModeWhere.field3567, ModeWhere.field3558, ModeWhere.field3572, ModeWhere.field3560, ModeWhere.field3559, ModeWhere.field3561, ModeWhere.field3562, ModeWhere.field3566 };
    }
    
    static ModeWhere[] aq() {
        return new ModeWhere[] { ModeWhere.field3557, ModeWhere.field3565, ModeWhere.field3564, ModeWhere.field3573, ModeWhere.field3568, ModeWhere.field3567, ModeWhere.field3558, ModeWhere.field3572, ModeWhere.field3560, ModeWhere.field3559, ModeWhere.field3561, ModeWhere.field3562, ModeWhere.field3566 };
    }
}
