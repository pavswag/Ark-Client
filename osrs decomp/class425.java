import java.util.Arrays;
import java.util.Objects;

// 
// Decompiled by Procyon v0.5.36
// 

public final class class425
{
    public float hz;
    public static final class425 field3792;
    public static class425[] field3793;
    public float es;
    public float vy;
    public float bp;
    public float yo;
    public float ld;
    public float ts;
    public float uw;
    public float ou;
    public float pf;
    static final float af = 1.0E-4f;
    public static int field3794;
    public float he;
    public float as;
    static SpritePixels[] headIconPrayerSprites;
    public float et;
    public float vg;
    static int field3796;
    public float eg;
    public float le;
    public float[] field3797;
    static int field3798;
    public static final int ax = 44;
    static final int ag = 9;
    
    public class425(final class425 class425) {
        this.bz(class425);
    }
    
    public class425() {
        this.ku();
    }
    
    public class425(final Buffer buffer, final boolean b) {
        this.ek(buffer, b);
    }
    
    static {
        class425.field3793 = new class425[0];
        WorldMapSection1.expandBounds(100, -14812643);
        field3792 = new class425();
    }
    
    public void cs() {
        final float n = 1.0f / this.method2258(-1628536196);
        final float bp = n * (this.le * this.hz * this.as + (this.ts * this.ou * this.vy + (this.vg * this.eg * this.pf - this.as * (this.vg * this.ts) - this.ou * this.hz * this.pf)) - this.vy * (this.le * this.eg));
        final float ld = (-this.ld * this.eg * this.pf + this.ld * this.ts * this.as + this.pf * (this.yo * this.hz) - this.ts * this.yo * this.vy - this.as * (this.es * this.hz) + this.es * this.eg * this.vy) * n;
        final float yo = n * (this.le * this.yo * this.vy + (this.pf * (this.ou * this.ld) - this.ld * this.le * this.as - this.pf * (this.vg * this.yo)) + this.as * (this.es * this.vg) - this.ou * this.es * this.vy);
        final float es = n * (this.hz * (this.es * this.ou) + (this.vg * this.yo * this.ts + (this.ld * this.le * this.eg + this.ts * (this.ou * -this.ld)) - this.hz * (this.yo * this.le) - this.eg * (this.es * this.vg)));
        final float he = n * (this.et * (this.eg * this.le) + (this.pf * (this.uw * this.ou) + (this.ts * this.he * this.as + this.pf * (-this.he * this.eg)) - this.ou * this.ts * this.et - this.le * this.uw * this.as));
        final float vg = (this.et * (this.yo * this.ts) + (this.pf * (this.eg * this.bp) - this.as * (this.ts * this.bp) - this.uw * this.yo * this.pf) + this.as * (this.es * this.uw) - this.et * (this.es * this.eg)) * n;
        final float ou = n * (this.et * (this.ou * this.es) + (this.pf * (-this.bp * this.ou) + this.as * (this.le * this.bp) + this.yo * this.he * this.pf - this.yo * this.le * this.et - this.as * (this.he * this.es)));
        final float le = n * (this.he * this.es * this.eg + (this.uw * (this.le * this.yo) + (this.bp * this.ou * this.ts - this.eg * (this.le * this.bp) - this.ts * (this.yo * this.he))) - this.ou * this.es * this.uw);
        final float uw = n * (this.vy * (this.le * this.uw) + (this.vg * this.ts * this.et + (this.pf * (this.hz * this.he) - this.he * this.ts * this.vy - this.uw * this.vg * this.pf)) - this.et * (this.le * this.hz));
        final float hz = n * (this.hz * -this.bp * this.pf + this.bp * this.ts * this.vy + this.ld * this.uw * this.pf - this.ld * this.ts * this.et - this.uw * this.es * this.vy + this.et * (this.hz * this.es));
        final float eg = n * (this.vg * this.bp * this.pf - this.vy * (this.bp * this.le) - this.ld * this.he * this.pf + this.et * (this.le * this.ld) + this.es * this.he * this.vy - this.es * this.vg * this.et);
        final float ts = (this.he * this.ld * this.ts + (this.hz * (this.bp * this.le) + -this.bp * this.vg * this.ts) - this.ld * this.le * this.uw - this.es * this.he * this.hz + this.es * this.vg * this.uw) * n;
        final float et = (this.et * (this.hz * this.ou) + (this.hz * -this.he * this.as + this.he * this.eg * this.vy + this.uw * this.vg * this.as - this.et * (this.eg * this.vg) - this.uw * this.ou * this.vy)) * n;
        final float vy = (this.et * (this.ld * this.eg) + (this.hz * this.bp * this.as - this.eg * this.bp * this.vy - this.as * (this.ld * this.uw)) + this.uw * this.yo * this.vy - this.yo * this.hz * this.et) * n;
        final float as = n * (this.as * (this.ld * this.he) + (this.vg * -this.bp * this.as + this.ou * this.bp * this.vy) - this.et * (this.ld * this.ou) - this.he * this.yo * this.vy + this.vg * this.yo * this.et);
        final float pf = n * (this.eg * (this.vg * this.bp) - this.hz * (this.ou * this.bp) - this.eg * (this.ld * this.he) + this.uw * (this.ld * this.ou) + this.he * this.yo * this.hz - this.uw * (this.vg * this.yo));
        this.bp = bp;
        this.ld = ld;
        this.yo = yo;
        this.es = es;
        this.he = he;
        this.vg = vg;
        this.ou = ou;
        this.le = le;
        this.uw = uw;
        this.hz = hz;
        this.eg = eg;
        this.ts = ts;
        this.et = et;
        this.vy = vy;
        this.as = as;
        this.pf = pf;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final class425 class425 = (class425)o;
        return Float.compare(class425.bp, this.bp) == 0 && Float.compare(class425.ld, this.ld) == 0 && Float.compare(class425.yo, this.yo) == 0 && Float.compare(class425.es, this.es) == 0 && Float.compare(class425.he, this.he) == 0 && Float.compare(class425.vg, this.vg) == 0 && Float.compare(class425.ou, this.ou) == 0 && Float.compare(class425.le, this.le) == 0 && Float.compare(class425.uw, this.uw) == 0 && Float.compare(class425.hz, this.hz) == 0 && Float.compare(class425.eg, this.eg) == 0 && Float.compare(class425.ts, this.ts) == 0 && Float.compare(class425.et, this.et) == 0 && Float.compare(class425.vy, this.vy) == 0 && Float.compare(class425.as, this.as) == 0 && Float.compare(class425.pf, this.pf) == 0;
    }
    
    @Override
    public String toString() {
        return "Mat4{m0=" + this.bp + ", m1=" + this.ld + ", m2=" + this.yo + ", m3=" + this.es + ", m4=" + this.he + ", m5=" + this.vg + ", m6=" + this.ou + ", m7=" + this.le + ", m8=" + this.uw + ", m9=" + this.hz + ", m10=" + this.eg + ", m11=" + this.ts + ", m12=" + this.et + ", m13=" + this.vy + ", m14=" + this.as + ", m15=" + this.pf + '}';
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.bp, this.ld, this.yo, this.es, this.he, this.vg, this.ou, this.le, this.uw, this.hz, this.eg, this.ts, this.et, this.vy, this.as, this.pf);
    }
    
    public void bs(final float bp, final float vg, final float eg) {
        this.method2250((byte)(-28));
        this.bp = bp;
        this.vg = vg;
        this.eg = eg;
    }
    
    public float[] ca() {
        final float[] array = { (float)(-Math.asin(this.ou)), 0.0f, 0.0f };
        if (Math.abs(Math.cos(array[0])) > 0.005) {
            final double y = this.yo;
            final double x = this.eg;
            final double y2 = this.he;
            final double x2 = this.vg;
            array[1] = (float)Math.atan2(y, x);
            array[2] = (float)Math.atan2(y2, x2);
        }
        else {
            final double n = this.ld;
            final double n2 = this.bp;
            if (this.ou < 0.0f) {
                array[1] = (float)Math.atan2(n, n2);
            }
            else {
                array[1] = (float)(-Math.atan2(n, n2));
            }
            array[2] = 0.0f;
        }
        return array;
    }
    
    void ad(final Buffer buffer, final boolean b) {
        if (b) {
            final class426 class426 = new class426();
            class426.method2266(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)3), (short)12988), -679711519);
            class426.method2267(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-59)), (short)17648), 1665202061);
            class426.io(class426, MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-121)), (short)18429), (byte)32);
            class426.rx(class426, (float)buffer.readUnsignedByte((byte)(-109)), (float)buffer.readUnsignedByte((byte)(-50)), (float)buffer.readUnsignedByte((byte)(-57)), (byte)111);
            yx(this, class426, (byte)10);
        }
        else {
            for (int i = 0; i < 16; ++i) {
                this.field3797[i] = Buffer.iu(buffer, 1809152456);
            }
        }
    }
    
    float[] ae() {
        final float[] array = new float[3];
        if (this.yo < 0.999 && this.yo > -0.999) {
            array[1] = (float)(-Math.asin(this.yo));
            final double cos = Math.cos(array[1]);
            array[0] = (float)Math.atan2(this.ou / cos, this.eg / cos);
            array[2] = (float)Math.atan2(this.ld / cos, this.bp / cos);
        }
        else {
            array[0] = 0.0f;
            array[1] = (float)Math.atan2(this.yo, 0.0);
            array[2] = (float)Math.atan2(-this.hz, this.vg);
        }
        return array;
    }
    
    float ce() {
        return this.uw * (this.le * this.yo) * this.vy + (this.yo * this.vg * this.ts * this.et + (this.he * this.yo * this.hz * this.pf + (this.et * (this.ld * this.le * this.eg) + (this.uw * (this.ou * this.ld) * this.pf + (this.as * (this.ld * this.he * this.ts) + (this.bp * this.le * this.hz * this.as + (this.bp * this.ou * this.ts * this.vy + (this.vg * this.bp * this.eg * this.pf - this.as * (this.vg * this.bp * this.ts) - this.pf * (this.bp * this.ou * this.hz))) - this.eg * (this.bp * this.le) * this.vy - this.ld * this.he * this.eg * this.pf)) - this.et * (this.ts * (this.ld * this.ou)) - this.as * (this.ld * this.le * this.uw))) - this.yo * this.he * this.ts * this.vy - this.pf * (this.yo * this.vg * this.uw))) - this.et * (this.hz * (this.yo * this.le)) - this.hz * (this.es * this.he) * this.as + this.vy * (this.eg * (this.he * this.es)) + this.es * this.vg * this.uw * this.as - this.et * (this.vg * this.es * this.eg) - this.uw * (this.ou * this.es) * this.vy + this.et * (this.es * this.ou * this.hz);
    }
    
    public float[] bb() {
        final float[] array = new float[3];
        final class423 class423 = new class423(this.bp, this.ld, this.yo);
        final class423 class424 = new class423(this.he, this.vg, this.ou);
        final class423 class425 = new class423(this.uw, this.hz, this.eg);
        array[0] = class423.po(class423, (byte)(-36));
        array[1] = class423.po(class424, (byte)(-17));
        array[2] = class423.po(class425, (byte)30);
        return array;
    }
    
    public void da(final class425 class425) {
        System.arraycopy(class425.field3797, 0, this.field3797, 0, 16);
    }
    
    public void cn() {
        final float n = 1.0f / this.method2258(-611957643);
        final float bp = n * (this.le * this.hz * this.as + (this.ts * this.ou * this.vy + (this.vg * this.eg * this.pf - this.as * (this.vg * this.ts) - this.ou * this.hz * this.pf)) - this.vy * (this.le * this.eg));
        final float ld = (-this.ld * this.eg * this.pf + this.ld * this.ts * this.as + this.pf * (this.yo * this.hz) - this.ts * this.yo * this.vy - this.as * (this.es * this.hz) + this.es * this.eg * this.vy) * n;
        final float yo = n * (this.le * this.yo * this.vy + (this.pf * (this.ou * this.ld) - this.ld * this.le * this.as - this.pf * (this.vg * this.yo)) + this.as * (this.es * this.vg) - this.ou * this.es * this.vy);
        final float es = n * (this.hz * (this.es * this.ou) + (this.vg * this.yo * this.ts + (this.ld * this.le * this.eg + this.ts * (this.ou * -this.ld)) - this.hz * (this.yo * this.le) - this.eg * (this.es * this.vg)));
        final float he = n * (this.et * (this.eg * this.le) + (this.pf * (this.uw * this.ou) + (this.ts * this.he * this.as + this.pf * (-this.he * this.eg)) - this.ou * this.ts * this.et - this.le * this.uw * this.as));
        final float vg = (this.et * (this.yo * this.ts) + (this.pf * (this.eg * this.bp) - this.as * (this.ts * this.bp) - this.uw * this.yo * this.pf) + this.as * (this.es * this.uw) - this.et * (this.es * this.eg)) * n;
        final float ou = n * (this.et * (this.ou * this.es) + (this.pf * (-this.bp * this.ou) + this.as * (this.le * this.bp) + this.yo * this.he * this.pf - this.yo * this.le * this.et - this.as * (this.he * this.es)));
        final float le = n * (this.he * this.es * this.eg + (this.uw * (this.le * this.yo) + (this.bp * this.ou * this.ts - this.eg * (this.le * this.bp) - this.ts * (this.yo * this.he))) - this.ou * this.es * this.uw);
        final float uw = n * (this.vy * (this.le * this.uw) + (this.vg * this.ts * this.et + (this.pf * (this.hz * this.he) - this.he * this.ts * this.vy - this.uw * this.vg * this.pf)) - this.et * (this.le * this.hz));
        final float hz = n * (this.hz * -this.bp * this.pf + this.bp * this.ts * this.vy + this.ld * this.uw * this.pf - this.ld * this.ts * this.et - this.uw * this.es * this.vy + this.et * (this.hz * this.es));
        final float eg = n * (this.vg * this.bp * this.pf - this.vy * (this.bp * this.le) - this.ld * this.he * this.pf + this.et * (this.le * this.ld) + this.es * this.he * this.vy - this.es * this.vg * this.et);
        final float ts = (this.he * this.ld * this.ts + (this.hz * (this.bp * this.le) + -this.bp * this.vg * this.ts) - this.ld * this.le * this.uw - this.es * this.he * this.hz + this.es * this.vg * this.uw) * n;
        final float et = (this.et * (this.hz * this.ou) + (this.hz * -this.he * this.as + this.he * this.eg * this.vy + this.uw * this.vg * this.as - this.et * (this.eg * this.vg) - this.uw * this.ou * this.vy)) * n;
        final float vy = (this.et * (this.ld * this.eg) + (this.hz * this.bp * this.as - this.eg * this.bp * this.vy - this.as * (this.ld * this.uw)) + this.uw * this.yo * this.vy - this.yo * this.hz * this.et) * n;
        final float as = n * (this.as * (this.ld * this.he) + (this.vg * -this.bp * this.as + this.ou * this.bp * this.vy) - this.et * (this.ld * this.ou) - this.he * this.yo * this.vy + this.vg * this.yo * this.et);
        final float pf = n * (this.eg * (this.vg * this.bp) - this.hz * (this.ou * this.bp) - this.eg * (this.ld * this.he) + this.uw * (this.ld * this.ou) + this.he * this.yo * this.hz - this.uw * (this.vg * this.yo));
        this.bp = bp;
        this.ld = ld;
        this.yo = yo;
        this.es = es;
        this.he = he;
        this.vg = vg;
        this.ou = ou;
        this.le = le;
        this.uw = uw;
        this.hz = hz;
        this.eg = eg;
        this.ts = ts;
        this.et = et;
        this.vy = vy;
        this.as = as;
        this.pf = pf;
    }
    
    public static void in(final class425 class425, final class424 class426) {
        if (class425 == null) {
            class425.bk();
            return;
        }
        final float n = class426.field3791 * class426.field3791;
        final float n2 = class426.field3791 * class426.field3788;
        final float n3 = class426.field3789 * class426.field3791;
        final float n4 = class426.field3791 * class426.field3790;
        final float n5 = class426.field3788 * class426.field3788;
        final float n6 = class426.field3788 * class426.field3789;
        final float n7 = class426.field3790 * class426.field3788;
        final float n8 = class426.field3789 * class426.field3789;
        final float n9 = class426.field3790 * class426.field3789;
        final float n10 = class426.field3790 * class426.field3790;
        class425.bp = n5 + n - n10 - n8;
        class425.ld = n4 + (n6 + n4 + n6);
        class425.yo = n7 + (n7 - n3 - n3);
        class425.he = n6 + (n6 - n4 - n4);
        class425.vg = n8 + n - n5 - n10;
        class425.ou = n9 + (n2 + n9) + n2;
        class425.uw = n3 + (n7 + n3 + n7);
        class425.hz = n9 - n2 - n2 + n9;
        class425.eg = n + n10 - n8 - n5;
    }
    
    void bw(final class426 class426) {
        this.bp = class426.field3810;
        this.ld = class426.field3799;
        this.yo = class426.field3800;
        this.es = 0.0f;
        this.he = class426.field3801;
        this.vg = class426.field3802;
        this.ou = class426.field3803;
        this.le = 0.0f;
        this.uw = class426.field3804;
        this.hz = class426.field3805;
        this.eg = class426.field3806;
        this.ts = 0.0f;
        this.et = class426.field3807;
        this.vy = class426.field3808;
        this.as = class426.field3809;
        this.pf = 1.0f;
    }
    
    public void os(final class425 class425) {
        System.arraycopy(class425.field3797, 0, this.field3797, 0, 16);
    }
    
    public void cf(final float n, final float n2, final float n3) {
        this.method2260(n, n2, n3, -814200416);
    }
    
    public void method2255(final class425 class425, final int n) {
        try {
            final float bp = this.es * class425.et + (this.yo * class425.uw + (class425.he * this.ld + class425.bp * this.bp));
            final float ld = class425.vy * this.es + (class425.ld * this.bp + this.ld * class425.vg + class425.hz * this.yo);
            final float yo = this.bp * class425.yo + class425.ou * this.ld + this.yo * class425.eg + class425.as * this.es;
            final float es = this.yo * class425.ts + (this.ld * class425.le + this.bp * class425.es) + this.es * class425.pf;
            final float he = this.vg * class425.he + this.he * class425.bp + class425.uw * this.ou + this.le * class425.et;
            final float vg = class425.vy * this.le + (this.ou * class425.hz + (this.vg * class425.vg + class425.ld * this.he));
            final float ou = class425.yo * this.he + this.vg * class425.ou + class425.eg * this.ou + class425.as * this.le;
            final float le = this.ou * class425.ts + (class425.es * this.he + class425.le * this.vg) + this.le * class425.pf;
            final float uw = class425.bp * this.uw + this.hz * class425.he + class425.uw * this.eg + this.ts * class425.et;
            final float hz = class425.vy * this.ts + (this.hz * class425.vg + class425.ld * this.uw + this.eg * class425.hz);
            final float eg = this.ts * class425.as + (class425.ou * this.hz + class425.yo * this.uw + this.eg * class425.eg);
            final float ts = class425.es * this.uw + class425.le * this.hz + this.eg * class425.ts + this.ts * class425.pf;
            final float et = this.as * class425.uw + (class425.he * this.vy + this.et * class425.bp) + this.pf * class425.et;
            final float vy = this.et * class425.ld + this.vy * class425.vg + this.as * class425.hz + this.pf * class425.vy;
            final float as = class425.as * this.pf + (class425.yo * this.et + this.vy * class425.ou + class425.eg * this.as);
            final float pf = class425.le * this.vy + this.et * class425.es + this.as * class425.ts + class425.pf * this.pf;
            this.bp = bp;
            this.ld = ld;
            this.yo = yo;
            this.es = es;
            this.he = he;
            this.vg = vg;
            this.ou = ou;
            this.le = le;
            this.uw = uw;
            this.hz = hz;
            this.eg = eg;
            this.ts = ts;
            this.et = et;
            this.vy = vy;
            this.as = as;
            this.pf = pf;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.ao(" + ')');
        }
    }
    
    public void method2253(final float n, final int n2) {
        try {
            this.method2260(n, n, n, -814200416);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.at(" + ')');
        }
    }
    
    void ak(final Buffer buffer, final boolean b) {
        if (b) {
            final class426 class426 = new class426();
            class426.method2266(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-86)), (short)14324), -973705903);
            class426.method2267(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-118)), (short)2175), 1665202061);
            class426.io(class426, MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-50)), (short)11040), (byte)90);
            class426.rx(class426, (float)buffer.readUnsignedByte((byte)(-21)), (float)buffer.readUnsignedByte((byte)(-15)), (float)buffer.readUnsignedByte((byte)(-76)), (byte)126);
            yx(this, class426, (byte)90);
        }
        else {
            for (int i = 0; i < 16; ++i) {
                this.field3797[i] = Buffer.iu(buffer, 1401049201);
            }
        }
    }
    
    public float[] method2261(final int n) {
        try {
            final float[] array = new float[3];
            final class423 class423 = new class423(this.bp, this.ld, this.yo);
            final class423 class424 = new class423(this.he, this.vg, this.ou);
            final class423 class425 = new class423(this.uw, this.hz, this.eg);
            array[0] = class423.po(class423, (byte)79);
            array[1] = class423.po(class424, (byte)(-84));
            array[2] = class423.po(class425, (byte)(-12));
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.av(" + ')');
        }
    }
    
    public void be() {
        this.bp = 1.0f;
        this.ld = 0.0f;
        this.yo = 0.0f;
        this.es = 0.0f;
        this.he = 0.0f;
        this.vg = 1.0f;
        this.ou = 0.0f;
        this.le = 0.0f;
        this.uw = 0.0f;
        this.hz = 0.0f;
        this.eg = 1.0f;
        this.ts = 0.0f;
        this.et = 0.0f;
        this.vy = 0.0f;
        this.as = 0.0f;
        this.pf = 1.0f;
    }
    
    public static float[] gf(final class425 class425) {
        if (class425 == null) {
            class425.ce();
        }
        final float[] array = new float[3];
        final class423 class426 = new class423(class425.bp, class425.ld, class425.yo);
        final class423 class427 = new class423(class425.he, class425.vg, class425.ou);
        final class423 class428 = new class423(class425.uw, class425.hz, class425.eg);
        array[0] = class423.po(class426, (byte)59);
        array[1] = class423.po(class427, (byte)(-20));
        array[2] = class423.po(class428, (byte)(-45));
        return array;
    }
    
    public void as() {
        synchronized (class425.field3793) {
            if (-990589151 * class425.field3794 < 1335461836 * class425.field3796 - 1) {
                class425.field3793[(class425.field3794 -= 414031096) * -910698341 - 1] = this;
            }
        }
    }
    
    public void ek(final Buffer buffer, final boolean b) {
        this.method2247(buffer, b, (byte)39);
    }
    
    void az(final Buffer buffer, final boolean b) {
        if (b) {
            final class426 class426 = new class426();
            class426.method2266(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-46)), (short)5415), -1591896398);
            class426.method2267(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-36)), (short)13419), 1665202061);
            class426.io(class426, MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-18)), (short)18660), (byte)53);
            class426.rx(class426, (float)buffer.readUnsignedByte((byte)(-18)), (float)buffer.readUnsignedByte((byte)(-38)), (float)buffer.readUnsignedByte((byte)(-35)), (byte)109);
            yx(this, class426, (byte)97);
        }
        else {
            for (int i = 0; i < 16; ++i) {
                this.field3797[i] = Buffer.iu(buffer, 637467711);
            }
        }
    }
    
    public void method2256(final class424 class424, final byte b) {
        try {
            final float n = class424.field3791 * class424.field3791;
            final float n2 = class424.field3791 * class424.field3788;
            final float n3 = class424.field3789 * class424.field3791;
            final float n4 = class424.field3791 * class424.field3790;
            final float n5 = class424.field3788 * class424.field3788;
            final float n6 = class424.field3788 * class424.field3789;
            final float n7 = class424.field3790 * class424.field3788;
            final float n8 = class424.field3789 * class424.field3789;
            final float n9 = class424.field3790 * class424.field3789;
            final float n10 = class424.field3790 * class424.field3790;
            this.bp = n5 + n - n10 - n8;
            this.ld = n4 + (n6 + n4 + n6);
            this.yo = n7 + (n7 - n3 - n3);
            this.he = n6 + (n6 - n4 - n4);
            this.vg = n8 + n - n5 - n10;
            this.ou = n9 + (n2 + n9) + n2;
            this.uw = n3 + (n7 + n3 + n7);
            this.hz = n9 - n2 - n2 + n9;
            this.eg = n + n10 - n8 - n5;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.ax(" + ')');
        }
    }
    
    public void method2254(final class425 class425, final int n) {
        this.yo = class425.le;
        this.es = class425.ou;
        this.he = class425.bp;
        this.eg = class425.es;
        this.uw = class425.et;
        this.uw = class425.et;
        this.le = class425.as;
        this.yo = class425.eg;
        this.es = class425.eg;
        this.ou = class425.et;
        this.le = class425.eg;
        this.vy = class425.ou;
        this.le = class425.ld;
        this.bp = class425.vy;
        this.uw = class425.es;
        this.et = class425.es;
    }
    
    public void bi() {
        this.bp = 1.0f;
        this.ld = 0.0f;
        this.yo = 0.0f;
        this.es = 0.0f;
        this.he = 0.0f;
        this.vg = 1.0f;
        this.ou = 0.0f;
        this.le = 0.0f;
        this.uw = 0.0f;
        this.hz = 0.0f;
        this.eg = 1.0f;
        this.ts = 0.0f;
        this.et = 0.0f;
        this.vy = 0.0f;
        this.as = 0.0f;
        this.pf = 1.0f;
    }
    
    public void bo(final class425 class425) {
        System.arraycopy(class425.field3797, 0, this.field3797, 0, 16);
    }
    
    public static float[] sn(final class425 class425, final int n) {
        if (class425 == null) {
            return class425.method2246(n);
        }
        try {
            final float[] array = { (float)(-Math.asin(class425.ou)), 0.0f, 0.0f };
            if (Math.abs(Math.cos(array[0])) > 0.005) {
                if (n == -1632760729) {
                    throw new IllegalStateException();
                }
                final double y = class425.yo;
                final double x = class425.eg;
                final double y2 = class425.he;
                final double x2 = class425.vg;
                array[1] = (float)Math.atan2(y, x);
                array[2] = (float)Math.atan2(y2, x2);
            }
            else {
                final double n2 = class425.ld;
                final double n3 = class425.bp;
                if (class425.ou < 0.0f) {
                    if (n == -1632760729) {
                        throw new IllegalStateException();
                    }
                    array[1] = (float)Math.atan2(n2, n3);
                }
                else {
                    array[1] = (float)(-Math.atan2(n2, n3));
                }
                array[2] = 0.0f;
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.au(" + ')');
        }
    }
    
    public void bp(final class424 class424) {
        final float n = class424.field3791 * class424.field3791;
        final float n2 = class424.field3791 * class424.field3788;
        final float n3 = class424.field3789 * class424.field3791;
        final float n4 = class424.field3791 * class424.field3790;
        final float n5 = class424.field3788 * class424.field3788;
        final float n6 = class424.field3788 * class424.field3789;
        final float n7 = class424.field3790 * class424.field3788;
        final float n8 = class424.field3789 * class424.field3789;
        final float n9 = class424.field3790 * class424.field3789;
        final float n10 = class424.field3790 * class424.field3790;
        this.bp = n5 + n - n10 - n8;
        this.ld = n4 + (n6 + n4 + n6);
        this.yo = n7 + (n7 - n3 - n3);
        this.he = n6 + (n6 - n4 - n4);
        this.vg = n8 + n - n5 - n10;
        this.ou = n9 + (n2 + n9) + n2;
        this.uw = n3 + (n7 + n3 + n7);
        this.hz = n9 - n2 - n2 + n9;
        this.eg = n + n10 - n8 - n5;
    }
    
    public static boolean yl(final class425 class425, final Object o) {
        if (class425 == null) {
            return class425.equals(o);
        }
        if (!(o instanceof class425)) {
            return false;
        }
        final class425 class426 = (class425)o;
        for (int i = 0; i < 16; ++i) {
            if (class426.field3797[i] != class425.field3797[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean ia(final class425 class425, final Object o) {
        if (class425 == null) {
            class425.bb();
        }
        if (!(o instanceof class425)) {
            return false;
        }
        final class425 class426 = (class425)o;
        for (int i = 0; i < 16; ++i) {
            if (class426.field3797[i] != class425.field3797[i]) {
                return false;
            }
        }
        return true;
    }
    
    public void br(final float bp, final float vg, final float eg) {
        this.method2250((byte)(-52));
        this.bp = bp;
        this.vg = vg;
        this.eg = eg;
    }
    
    public static boolean nu(final class425 class425, final Object o) {
        if (class425 == null) {
            class425.ce();
        }
        if (!(o instanceof class425)) {
            return false;
        }
        final class425 class426 = (class425)o;
        for (int i = 0; i < 16; ++i) {
            if (class426.field3797[i] != class425.field3797[i]) {
                return false;
            }
        }
        return true;
    }
    
    void method2247(final Buffer buffer, final boolean b, final byte b2) {
        if (b) {
            final int n = 39;
            try {
                if (b) {
                    if (n != 1) {
                        final class426 class426 = new class426();
                        class426.method2266(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-49)), (short)13359), -1749175533);
                        class426.method2267(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-94)), (short)15788), 1665202061);
                        class426.io(class426, MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-78)), (short)30151), (byte)61);
                        class426.rx(class426, (float)buffer.readUnsignedByte((byte)(-114)), (float)buffer.readUnsignedByte((byte)(-103)), (float)buffer.readUnsignedByte((byte)(-100)), (byte)117);
                        yx(this, class426, (byte)87);
                    }
                }
                else {
                    for (int i = 0; i < 16; ++i) {
                        if (n == 1) {
                            throw new IllegalStateException();
                        }
                        this.field3797[i] = Buffer.iu(buffer, 1195246602);
                    }
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "qj.aw(" + ')');
            }
        }
        else {
            this.bp = buffer.hz();
            this.ld = buffer.hz();
            this.yo = buffer.hz();
            this.es = buffer.hz();
            this.he = buffer.hz();
            this.vg = buffer.hz();
            this.ou = buffer.hz();
            this.le = buffer.hz();
            this.uw = buffer.hz();
            this.hz = buffer.hz();
            this.eg = buffer.hz();
            this.ts = buffer.hz();
            this.et = buffer.hz();
            this.vy = buffer.hz();
            this.as = buffer.hz();
            this.pf = buffer.hz();
        }
    }
    
    public static void am(final class425 class425, final class425 class426, final int n) {
        if (class425 == null) {
            class425.method2254(class425, n);
            return;
        }
        class425.bp += class426.bp;
        class425.ld += class426.ld;
        class425.yo += class426.yo;
        class425.es += class426.es;
        class425.he += class426.he;
        class425.vg += class426.vg;
        class425.ou += class426.ou;
        class425.le += class426.le;
        class425.uw += class426.uw;
        class425.hz += class426.hz;
        class425.eg += class426.eg;
        class425.ts += class426.ts;
        class425.et += class426.et;
        class425.vy += class426.vy;
        class425.as += class426.as;
        class425.pf += class426.pf;
    }
    
    public void am() {
        synchronized (class425.field3793) {
            if (1274282021 * class425.field3794 < -2095080743 * class425.field3796 - 1) {
                class425.field3793[(class425.field3794 += 49957957) * -910698341 - 1] = this;
            }
        }
    }
    
    public void method2252(final class425 class425, final int n) {
        this.bp = class425.bp;
        this.ld = class425.ld;
        this.yo = class425.yo;
        this.es = class425.es;
        this.he = class425.he;
        this.vg = class425.vg;
        this.ou = class425.ou;
        this.le = class425.le;
        this.uw = class425.uw;
        this.hz = class425.hz;
        this.eg = class425.eg;
        this.ts = class425.ts;
        this.et = class425.et;
        this.vy = class425.vy;
        this.as = class425.as;
        this.pf = class425.pf;
    }
    
    public void method2249(final int n) {
        try {
            synchronized (class425.field3793) {
                if (-910698341 * class425.field3794 < -2095080743 * class425.field3796 - 1) {
                    if (n != 1198141071) {
                        return;
                    }
                    class425.field3793[(class425.field3794 -= 564638317) * -910698341 - 1] = this;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.an(" + ')');
        }
    }
    
    float[] method2248(final short n) {
        try {
            final float[] array = new float[3];
            Label_0108: {
                if (this.yo >= 0.999) {
                    break Label_0108;
                }
                if (n <= 258) {
                    throw new IllegalStateException();
                }
                if (this.yo <= -0.999) {
                    break Label_0108;
                }
                if (n <= 258) {
                    throw new IllegalStateException();
                }
                array[1] = (float)(-Math.asin(this.yo));
                final double cos = Math.cos(array[1]);
                array[0] = (float)Math.atan2(this.ou / cos, this.eg / cos);
                array[2] = (float)Math.atan2(this.ld / cos, this.bp / cos);
                return array;
            }
            array[0] = 0.0f;
            array[1] = (float)Math.atan2(this.yo, 0.0);
            array[2] = (float)Math.atan2(-this.hz, this.vg);
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.ac(" + ')');
        }
    }
    
    public void bq(final class425 class425) {
        System.arraycopy(class425.field3797, 0, this.field3797, 0, 16);
    }
    
    public void iw() {
        this.method2249(1198141071);
    }
    
    static class134[] method2246(final int n) {
        try {
            return new class134[] { class134.field1291, class134.field1298, class134.field1290, class134.field1293, class134.field1288, class134.field1292, class134.field1289, class134.field1294, class134.field1295 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.au(" + ')');
        }
    }
    
    public float[] method2246(final int n) {
        try {
            final float[] array = { (float)(-Math.asin(this.ts)), 0.0f, 0.0f };
            if (Math.abs(Math.cos(array[0])) > 0.005) {
                if (n == -1632760729) {
                    throw new IllegalStateException();
                }
                final double y = this.vy;
                final double x = this.et;
                final double y2 = this.es;
                final double x2 = this.es;
                array[1] = (float)Math.atan2(y, x);
                array[2] = (float)Math.atan2(y2, x2);
            }
            else {
                final double n2 = this.et;
                final double n3 = this.ld;
                if (this.eg < 0.0f) {
                    if (n == -1632760729) {
                        throw new IllegalStateException();
                    }
                    array[1] = (float)Math.atan2(n2, n3);
                }
                else {
                    array[1] = (float)(-Math.atan2(n2, n3));
                }
                array[2] = 0.0f;
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.au(" + ')');
        }
    }
    
    public void method2260(final float bp, final float vg, final float eg, final int n) {
        try {
            this.method2250((byte)(-59));
            this.bp = bp;
            this.vg = vg;
            this.eg = eg;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.aa(" + ')');
        }
    }
    
    public static float[] method2257(final class425 class425) {
        if (class425 == null) {
            class425.bi();
        }
        final float[] array = new float[3];
        final class423 class426 = new class423(class425.bp, class425.ld, class425.yo);
        final class423 class427 = new class423(class425.he, class425.vg, class425.ou);
        final class423 class428 = new class423(class425.uw, class425.hz, class425.eg);
        array[0] = class423.po(class426, (byte)5);
        array[1] = class423.po(class427, (byte)(-100));
        array[2] = class423.po(class428, (byte)19);
        return array;
    }
    
    void method2257(final class426 class426, final byte b) {
        try {
            this.le = class426.field3808;
            this.ou = class426.field3802;
            this.et = class426.field3805;
            this.he = 0.0f;
            this.hz = class426.field3803;
            this.hz = class426.field3801;
            this.es = class426.field3806;
            this.vg = 0.0f;
            this.ts = class426.field3803;
            this.uw = class426.field3803;
            this.et = class426.field3806;
            this.uw = 0.0f;
            this.ld = class426.field3810;
            this.eg = class426.field3802;
            this.as = class426.field3804;
            this.as = 1.0f;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.ai(" + ')');
        }
    }
    
    public static void gi(final class425 class425, final class425 class426) {
        final float bp = class425.es * class426.et + (class425.yo * class426.uw + (class426.he * class425.ld + class426.bp * class425.bp));
        final float ld = class426.vy * class425.es + (class426.ld * class425.bp + class425.ld * class426.vg + class426.hz * class425.yo);
        final float yo = class425.bp * class426.yo + class426.ou * class425.ld + class425.yo * class426.eg + class426.as * class425.es;
        final float es = class425.yo * class426.ts + (class425.ld * class426.le + class425.bp * class426.es) + class425.es * class426.pf;
        final float he = class425.vg * class426.he + class425.he * class426.bp + class426.uw * class425.ou + class425.le * class426.et;
        final float vg = class426.vy * class425.le + (class425.ou * class426.hz + (class425.vg * class426.vg + class426.ld * class425.he));
        final float ou = class426.yo * class425.he + class425.vg * class426.ou + class426.eg * class425.ou + class426.as * class425.le;
        final float le = class425.ou * class426.ts + (class426.es * class425.he + class426.le * class425.vg) + class425.le * class426.pf;
        final float uw = class426.bp * class425.uw + class425.hz * class426.he + class426.uw * class425.eg + class425.ts * class426.et;
        final float hz = class426.vy * class425.ts + (class425.hz * class426.vg + class426.ld * class425.uw + class425.eg * class426.hz);
        final float eg = class425.ts * class426.as + (class426.ou * class425.hz + class426.yo * class425.uw + class425.eg * class426.eg);
        final float ts = class426.es * class425.uw + class426.le * class425.hz + class425.eg * class426.ts + class425.ts * class426.pf;
        final float et = class425.as * class426.uw + (class426.he * class425.vy + class425.et * class426.bp) + class425.pf * class426.et;
        final float vy = class425.et * class426.ld + class425.vy * class426.vg + class425.as * class426.hz + class425.pf * class426.vy;
        final float as = class426.as * class425.pf + (class426.yo * class425.et + class425.vy * class426.ou + class426.eg * class425.as);
        final float pf = class426.le * class425.vy + class425.et * class426.es + class425.as * class426.ts + class426.pf * class425.pf;
        class425.bp = bp;
        class425.ld = ld;
        class425.yo = yo;
        class425.es = es;
        class425.he = he;
        class425.vg = vg;
        class425.ou = ou;
        class425.le = le;
        class425.uw = uw;
        class425.hz = hz;
        class425.eg = eg;
        class425.ts = ts;
        class425.et = et;
        class425.vy = vy;
        class425.as = as;
        class425.pf = pf;
    }
    
    public static float kr(final class425 class425) {
        return class425.uw * (class425.le * class425.yo) * class425.vy + (class425.yo * class425.vg * class425.ts * class425.et + (class425.he * class425.yo * class425.hz * class425.pf + (class425.et * (class425.ld * class425.le * class425.eg) + (class425.uw * (class425.ou * class425.ld) * class425.pf + (class425.as * (class425.ld * class425.he * class425.ts) + (class425.bp * class425.le * class425.hz * class425.as + (class425.bp * class425.ou * class425.ts * class425.vy + (class425.vg * class425.bp * class425.eg * class425.pf - class425.as * (class425.vg * class425.bp * class425.ts) - class425.pf * (class425.bp * class425.ou * class425.hz))) - class425.eg * (class425.bp * class425.le) * class425.vy - class425.ld * class425.he * class425.eg * class425.pf)) - class425.et * (class425.ts * (class425.ld * class425.ou)) - class425.as * (class425.ld * class425.le * class425.uw))) - class425.yo * class425.he * class425.ts * class425.vy - class425.pf * (class425.yo * class425.vg * class425.uw))) - class425.et * (class425.hz * (class425.yo * class425.le)) - class425.hz * (class425.es * class425.he) * class425.as + class425.vy * (class425.eg * (class425.he * class425.es)) + class425.es * class425.vg * class425.uw * class425.as - class425.et * (class425.vg * class425.es * class425.eg) - class425.uw * (class425.ou * class425.es) * class425.vy + class425.et * (class425.es * class425.ou * class425.hz);
    }
    
    public void bh(final class424 class424) {
        final float n = class424.field3791 * class424.field3791;
        final float n2 = class424.field3791 * class424.field3788;
        final float n3 = class424.field3789 * class424.field3791;
        final float n4 = class424.field3791 * class424.field3790;
        final float n5 = class424.field3788 * class424.field3788;
        final float n6 = class424.field3788 * class424.field3789;
        final float n7 = class424.field3790 * class424.field3788;
        final float n8 = class424.field3789 * class424.field3789;
        final float n9 = class424.field3790 * class424.field3789;
        final float n10 = class424.field3790 * class424.field3790;
        this.bp = n5 + n - n10 - n8;
        this.ld = n4 + (n6 + n4 + n6);
        this.yo = n7 + (n7 - n3 - n3);
        this.he = n6 + (n6 - n4 - n4);
        this.vg = n8 + n - n5 - n10;
        this.ou = n9 + (n2 + n9) + n2;
        this.uw = n3 + (n7 + n3 + n7);
        this.hz = n9 - n2 - n2 + n9;
        this.eg = n + n10 - n8 - n5;
    }
    
    float[] by() {
        final float[] array = new float[3];
        if (this.yo < 0.999 && this.yo > -0.999) {
            array[1] = (float)(-Math.asin(this.yo));
            final double cos = Math.cos(array[1]);
            array[0] = (float)Math.atan2(this.ou / cos, this.eg / cos);
            array[2] = (float)Math.atan2(this.ld / cos, this.bp / cos);
        }
        else {
            array[0] = 0.0f;
            array[1] = (float)Math.atan2(this.yo, 0.0);
            array[2] = (float)Math.atan2(-this.hz, this.vg);
        }
        return array;
    }
    
    public void bx(final class425 class425) {
        for (int i = 0; i < this.field3797.length; ++i) {
            final float[] field3797 = this.field3797;
            final int n = i;
            field3797[n] += class425.field3797[i];
        }
    }
    
    static void ar(final int n) {
        class425.field3796 = n * 1268073833;
        class425.field3793 = new class425[n];
        class425.field3794 = 0;
    }
    
    public static class425 vi() {
        synchronized (class425.field3793) {
            if (class425.field3794 * -910698341 == 0) {
                return vu();
            }
            final class425[] field3793 = class425.field3793;
            final int n = class425.field3794 * -910698341 - 1;
            class425.field3794 = n * -564638317;
            final class425 class425 = field3793[n];
            class425.ku();
            return class425;
        }
    }
    
    public void bd(final float n) {
        this.method2260(n, n, n, -773442312);
    }
    
    public void bg(final float bp, final float vg, final float eg) {
        this.method2250((byte)(-107));
        this.bp = bp;
        this.vg = vg;
        this.eg = eg;
    }
    
    public static int kt(final class166 class166) {
        return 371416339 * class166.field1419;
    }
    
    static final void method2264(final byte b) {
        try {
            int i = 0;
            while (i == 0) {
                if (b != 32) {
                    throw new IllegalStateException();
                }
                i = 1;
                for (int j = 0; j < 730065501 * Client.menuOptionsCount - 1; ++j) {
                    if (Client.menuOpcodes[j] < 1000 && Client.menuOpcodes[j + 1] > 1000) {
                        if (b != 32) {
                            throw new IllegalStateException();
                        }
                        final String s = Client.menuTargets[j];
                        Client.menuTargets[j] = Client.menuTargets[1 + j];
                        Client.menuTargets[j + 1] = s;
                        final String s2 = Client.menuActions[j];
                        Client.menuActions[j] = Client.menuActions[1 + j];
                        Client.menuActions[j + 1] = s2;
                        final int n = Client.menuOpcodes[j];
                        Client.menuOpcodes[j] = Client.menuOpcodes[j + 1];
                        Client.menuOpcodes[j + 1] = n;
                        final int n2 = Client.menuArguments1[j];
                        Client.menuArguments1[j] = Client.menuArguments1[1 + j];
                        Client.menuArguments1[1 + j] = n2;
                        final int n3 = Client.menuArguments2[j];
                        Client.menuArguments2[j] = Client.menuArguments2[j + 1];
                        Client.menuArguments2[1 + j] = n3;
                        final int n4 = Client.menuIdentifiers[j];
                        Client.menuIdentifiers[j] = Client.menuIdentifiers[1 + j];
                        Client.menuIdentifiers[j + 1] = n4;
                        final int n5 = Client.menuItemIds[j];
                        Client.menuItemIds[j] = Client.menuItemIds[1 + j];
                        Client.menuItemIds[1 + j] = n5;
                        final boolean b2 = Client.menuShiftClick[j];
                        Client.menuShiftClick[j] = Client.menuShiftClick[1 + j];
                        Client.menuShiftClick[1 + j] = b2;
                        i = 0;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.kn(" + ')');
        }
    }
    
    public static void sg(final class425 class425) {
        if (class425 == null) {
            class425.bb();
        }
        final float n = 1.0f / class425.method2258(-1491842504);
        final float bp = n * (class425.le * class425.hz * class425.as + (class425.ts * class425.ou * class425.vy + (class425.vg * class425.eg * class425.pf - class425.as * (class425.vg * class425.ts) - class425.ou * class425.hz * class425.pf)) - class425.vy * (class425.le * class425.eg));
        final float ld = (-class425.ld * class425.eg * class425.pf + class425.ld * class425.ts * class425.as + class425.pf * (class425.yo * class425.hz) - class425.ts * class425.yo * class425.vy - class425.as * (class425.es * class425.hz) + class425.es * class425.eg * class425.vy) * n;
        final float yo = n * (class425.le * class425.yo * class425.vy + (class425.pf * (class425.ou * class425.ld) - class425.ld * class425.le * class425.as - class425.pf * (class425.vg * class425.yo)) + class425.as * (class425.es * class425.vg) - class425.ou * class425.es * class425.vy);
        final float es = n * (class425.hz * (class425.es * class425.ou) + (class425.vg * class425.yo * class425.ts + (class425.ld * class425.le * class425.eg + class425.ts * (class425.ou * -class425.ld)) - class425.hz * (class425.yo * class425.le) - class425.eg * (class425.es * class425.vg)));
        final float he = n * (class425.et * (class425.eg * class425.le) + (class425.pf * (class425.uw * class425.ou) + (class425.ts * class425.he * class425.as + class425.pf * (-class425.he * class425.eg)) - class425.ou * class425.ts * class425.et - class425.le * class425.uw * class425.as));
        final float vg = (class425.et * (class425.yo * class425.ts) + (class425.pf * (class425.eg * class425.bp) - class425.as * (class425.ts * class425.bp) - class425.uw * class425.yo * class425.pf) + class425.as * (class425.es * class425.uw) - class425.et * (class425.es * class425.eg)) * n;
        final float ou = n * (class425.et * (class425.ou * class425.es) + (class425.pf * (-class425.bp * class425.ou) + class425.as * (class425.le * class425.bp) + class425.yo * class425.he * class425.pf - class425.yo * class425.le * class425.et - class425.as * (class425.he * class425.es)));
        final float le = n * (class425.he * class425.es * class425.eg + (class425.uw * (class425.le * class425.yo) + (class425.bp * class425.ou * class425.ts - class425.eg * (class425.le * class425.bp) - class425.ts * (class425.yo * class425.he))) - class425.ou * class425.es * class425.uw);
        final float uw = n * (class425.vy * (class425.le * class425.uw) + (class425.vg * class425.ts * class425.et + (class425.pf * (class425.hz * class425.he) - class425.he * class425.ts * class425.vy - class425.uw * class425.vg * class425.pf)) - class425.et * (class425.le * class425.hz));
        final float hz = n * (class425.hz * -class425.bp * class425.pf + class425.bp * class425.ts * class425.vy + class425.ld * class425.uw * class425.pf - class425.ld * class425.ts * class425.et - class425.uw * class425.es * class425.vy + class425.et * (class425.hz * class425.es));
        final float eg = n * (class425.vg * class425.bp * class425.pf - class425.vy * (class425.bp * class425.le) - class425.ld * class425.he * class425.pf + class425.et * (class425.le * class425.ld) + class425.es * class425.he * class425.vy - class425.es * class425.vg * class425.et);
        final float ts = (class425.he * class425.ld * class425.ts + (class425.hz * (class425.bp * class425.le) + -class425.bp * class425.vg * class425.ts) - class425.ld * class425.le * class425.uw - class425.es * class425.he * class425.hz + class425.es * class425.vg * class425.uw) * n;
        final float et = (class425.et * (class425.hz * class425.ou) + (class425.hz * -class425.he * class425.as + class425.he * class425.eg * class425.vy + class425.uw * class425.vg * class425.as - class425.et * (class425.eg * class425.vg) - class425.uw * class425.ou * class425.vy)) * n;
        final float vy = (class425.et * (class425.ld * class425.eg) + (class425.hz * class425.bp * class425.as - class425.eg * class425.bp * class425.vy - class425.as * (class425.ld * class425.uw)) + class425.uw * class425.yo * class425.vy - class425.yo * class425.hz * class425.et) * n;
        final float as = n * (class425.as * (class425.ld * class425.he) + (class425.vg * -class425.bp * class425.as + class425.ou * class425.bp * class425.vy) - class425.et * (class425.ld * class425.ou) - class425.he * class425.yo * class425.vy + class425.vg * class425.yo * class425.et);
        final float pf = n * (class425.eg * (class425.vg * class425.bp) - class425.hz * (class425.ou * class425.bp) - class425.eg * (class425.ld * class425.he) + class425.uw * (class425.ld * class425.ou) + class425.he * class425.yo * class425.hz - class425.uw * (class425.vg * class425.yo));
        class425.bp = bp;
        class425.ld = ld;
        class425.yo = yo;
        class425.es = es;
        class425.he = he;
        class425.vg = vg;
        class425.ou = ou;
        class425.le = le;
        class425.uw = uw;
        class425.hz = hz;
        class425.eg = eg;
        class425.ts = ts;
        class425.et = et;
        class425.vy = vy;
        class425.as = as;
        class425.pf = pf;
    }
    
    public void bn(final float n) {
        this.method2260(n, n, n, -1044467047);
    }
    
    public void method2250(final byte b) {
        try {
            this.bp = 1.0f;
            this.ld = 0.0f;
            this.yo = 0.0f;
            this.es = 0.0f;
            this.he = 0.0f;
            this.vg = 1.0f;
            this.ou = 0.0f;
            this.le = 0.0f;
            this.uw = 0.0f;
            this.hz = 0.0f;
            this.eg = 1.0f;
            this.ts = 0.0f;
            this.et = 0.0f;
            this.vy = 0.0f;
            this.as = 0.0f;
            this.pf = 1.0f;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.ab(" + ')');
        }
    }
    
    public void method2251(final int n) {
        try {
            this.bp = 0.0f;
            this.ld = 0.0f;
            this.yo = 0.0f;
            this.es = 0.0f;
            this.he = 0.0f;
            this.vg = 0.0f;
            this.ou = 0.0f;
            this.le = 0.0f;
            this.uw = 0.0f;
            this.hz = 0.0f;
            this.eg = 0.0f;
            this.ts = 0.0f;
            this.et = 0.0f;
            this.vy = 0.0f;
            this.as = 0.0f;
            this.pf = 0.0f;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.aq(" + ')');
        }
    }
    
    float method2258(final int n) {
        try {
            return this.uw * (this.le * this.yo) * this.vy + (this.yo * this.vg * this.ts * this.et + (this.he * this.yo * this.hz * this.pf + (this.et * (this.ld * this.le * this.eg) + (this.uw * (this.ou * this.ld) * this.pf + (this.as * (this.ld * this.he * this.ts) + (this.bp * this.le * this.hz * this.as + (this.bp * this.ou * this.ts * this.vy + (this.vg * this.bp * this.eg * this.pf - this.as * (this.vg * this.bp * this.ts) - this.pf * (this.bp * this.ou * this.hz))) - this.eg * (this.bp * this.le) * this.vy - this.ld * this.he * this.eg * this.pf)) - this.et * (this.ts * (this.ld * this.ou)) - this.as * (this.ld * this.le * this.uw))) - this.yo * this.he * this.ts * this.vy - this.pf * (this.yo * this.vg * this.uw))) - this.et * (this.hz * (this.yo * this.le)) - this.hz * (this.es * this.he) * this.as + this.vy * (this.eg * (this.he * this.es)) + this.es * this.vg * this.uw * this.as - this.et * (this.vg * this.es * this.eg) - this.uw * (this.ou * this.es) * this.vy + this.et * (this.es * this.ou * this.hz);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.ag(" + ')');
        }
    }
    
    public void bl(final class424 class424) {
        final float n = class424.field3791 * class424.field3791;
        final float n2 = class424.field3791 * class424.field3788;
        final float n3 = class424.field3789 * class424.field3791;
        final float n4 = class424.field3791 * class424.field3790;
        final float n5 = class424.field3788 * class424.field3788;
        final float n6 = class424.field3788 * class424.field3789;
        final float n7 = class424.field3790 * class424.field3788;
        final float n8 = class424.field3789 * class424.field3789;
        final float n9 = class424.field3790 * class424.field3789;
        final float n10 = class424.field3790 * class424.field3790;
        this.bp = n5 + n - n10 - n8;
        this.ld = n4 + (n6 + n4 + n6);
        this.yo = n7 + (n7 - n3 - n3);
        this.he = n6 + (n6 - n4 - n4);
        this.vg = n8 + n - n5 - n10;
        this.ou = n9 + (n2 + n9) + n2;
        this.uw = n3 + (n7 + n3 + n7);
        this.hz = n9 - n2 - n2 + n9;
        this.eg = n + n10 - n8 - n5;
    }
    
    public void bz(final class425 class425) {
        this.method2252(class425, 1919850341);
    }
    
    public static float[] hz(final class425 class425) {
        if (class425 == null) {
            return class425.ca();
        }
        final float[] array = new float[3];
        if (class425.yo < 0.999 && class425.yo > -0.999) {
            array[1] = (float)(-Math.asin(class425.yo));
            final double cos = Math.cos(array[1]);
            array[0] = (float)Math.atan2(class425.ou / cos, class425.eg / cos);
            array[2] = (float)Math.atan2(class425.ld / cos, class425.bp / cos);
        }
        else {
            array[0] = 0.0f;
            array[1] = (float)Math.atan2(class425.yo, 0.0);
            array[2] = (float)Math.atan2(-class425.hz, class425.vg);
        }
        return array;
    }
    
    public void bj(final float n) {
        this.method2260(n, n, n, -2102205308);
    }
    
    public void oi(final class424 class424) {
        this.method2256(class424, (byte)(-48));
    }
    
    public static void yx(final class425 class425, final class426 class426, final byte b) {
        if (class425 == null) {
            class425.method2257(class426, b);
        }
        try {
            class425.bp = class426.field3810;
            class425.ld = class426.field3799;
            class425.yo = class426.field3800;
            class425.es = 0.0f;
            class425.he = class426.field3801;
            class425.vg = class426.field3802;
            class425.ou = class426.field3803;
            class425.le = 0.0f;
            class425.uw = class426.field3804;
            class425.hz = class426.field3805;
            class425.eg = class426.field3806;
            class425.ts = 0.0f;
            class425.et = class426.field3807;
            class425.vy = class426.field3808;
            class425.as = class426.field3809;
            class425.pf = 1.0f;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.ai(" + ')');
        }
    }
    
    public float[] cq() {
        final float[] array = new float[3];
        final class423 class423 = new class423(this.bp, this.ld, this.yo);
        final class423 class424 = new class423(this.he, this.vg, this.ou);
        final class423 class425 = new class423(this.uw, this.hz, this.eg);
        array[0] = class423.po(class423, (byte)(-20));
        array[1] = class423.po(class424, (byte)51);
        array[2] = class423.po(class425, (byte)4);
        return array;
    }
    
    public void ku() {
        this.method2250((byte)(-10));
    }
    
    public void bm(final class425 class425) {
        this.method2255(class425, 2018256268);
    }
    
    public void bk() {
        this.bp = 0.0f;
        this.ld = 0.0f;
        this.yo = 0.0f;
        this.es = 0.0f;
        this.he = 0.0f;
        this.vg = 0.0f;
        this.ou = 0.0f;
        this.le = 0.0f;
        this.uw = 0.0f;
        this.hz = 0.0f;
        this.eg = 0.0f;
        this.ts = 0.0f;
        this.et = 0.0f;
        this.vy = 0.0f;
        this.as = 0.0f;
        this.pf = 0.0f;
    }
    
    public static int fj(final class425 class425) {
        if (class425 == null) {
            class425.ahv();
        }
        return 1 * 31 + Arrays.hashCode(class425.field3797);
    }
    
    public boolean gq(final Object o) {
        if (!(o instanceof class425)) {
            return false;
        }
        final class425 class425 = (class425)o;
        for (int i = 0; i < 16; ++i) {
            if (class425.field3797[i] != this.field3797[i]) {
                return false;
            }
        }
        return true;
    }
    
    public void method2259(final int n) {
        try {
            final float n2 = 1.0f / this.method2258(-671681757);
            final float bp = n2 * (this.le * this.hz * this.as + (this.ts * this.ou * this.vy + (this.vg * this.eg * this.pf - this.as * (this.vg * this.ts) - this.ou * this.hz * this.pf)) - this.vy * (this.le * this.eg));
            final float ld = (-this.ld * this.eg * this.pf + this.ld * this.ts * this.as + this.pf * (this.yo * this.hz) - this.ts * this.yo * this.vy - this.as * (this.es * this.hz) + this.es * this.eg * this.vy) * n2;
            final float yo = n2 * (this.le * this.yo * this.vy + (this.pf * (this.ou * this.ld) - this.ld * this.le * this.as - this.pf * (this.vg * this.yo)) + this.as * (this.es * this.vg) - this.ou * this.es * this.vy);
            final float es = n2 * (this.hz * (this.es * this.ou) + (this.vg * this.yo * this.ts + (this.ld * this.le * this.eg + this.ts * (this.ou * -this.ld)) - this.hz * (this.yo * this.le) - this.eg * (this.es * this.vg)));
            final float he = n2 * (this.et * (this.eg * this.le) + (this.pf * (this.uw * this.ou) + (this.ts * this.he * this.as + this.pf * (-this.he * this.eg)) - this.ou * this.ts * this.et - this.le * this.uw * this.as));
            final float vg = (this.et * (this.yo * this.ts) + (this.pf * (this.eg * this.bp) - this.as * (this.ts * this.bp) - this.uw * this.yo * this.pf) + this.as * (this.es * this.uw) - this.et * (this.es * this.eg)) * n2;
            final float ou = n2 * (this.et * (this.ou * this.es) + (this.pf * (-this.bp * this.ou) + this.as * (this.le * this.bp) + this.yo * this.he * this.pf - this.yo * this.le * this.et - this.as * (this.he * this.es)));
            final float le = n2 * (this.he * this.es * this.eg + (this.uw * (this.le * this.yo) + (this.bp * this.ou * this.ts - this.eg * (this.le * this.bp) - this.ts * (this.yo * this.he))) - this.ou * this.es * this.uw);
            final float uw = n2 * (this.vy * (this.le * this.uw) + (this.vg * this.ts * this.et + (this.pf * (this.hz * this.he) - this.he * this.ts * this.vy - this.uw * this.vg * this.pf)) - this.et * (this.le * this.hz));
            final float hz = n2 * (this.hz * -this.bp * this.pf + this.bp * this.ts * this.vy + this.ld * this.uw * this.pf - this.ld * this.ts * this.et - this.uw * this.es * this.vy + this.et * (this.hz * this.es));
            final float eg = n2 * (this.vg * this.bp * this.pf - this.vy * (this.bp * this.le) - this.ld * this.he * this.pf + this.et * (this.le * this.ld) + this.es * this.he * this.vy - this.es * this.vg * this.et);
            final float ts = (this.he * this.ld * this.ts + (this.hz * (this.bp * this.le) + -this.bp * this.vg * this.ts) - this.ld * this.le * this.uw - this.es * this.he * this.hz + this.es * this.vg * this.uw) * n2;
            final float et = (this.et * (this.hz * this.ou) + (this.hz * -this.he * this.as + this.he * this.eg * this.vy + this.uw * this.vg * this.as - this.et * (this.eg * this.vg) - this.uw * this.ou * this.vy)) * n2;
            final float vy = (this.et * (this.ld * this.eg) + (this.hz * this.bp * this.as - this.eg * this.bp * this.vy - this.as * (this.ld * this.uw)) + this.uw * this.yo * this.vy - this.yo * this.hz * this.et) * n2;
            final float as = n2 * (this.as * (this.ld * this.he) + (this.vg * -this.bp * this.as + this.ou * this.bp * this.vy) - this.et * (this.ld * this.ou) - this.he * this.yo * this.vy + this.vg * this.yo * this.et);
            final float pf = n2 * (this.eg * (this.vg * this.bp) - this.hz * (this.ou * this.bp) - this.eg * (this.ld * this.he) + this.uw * (this.ld * this.ou) + this.he * this.yo * this.hz - this.uw * (this.vg * this.yo));
            this.bp = bp;
            this.ld = ld;
            this.yo = yo;
            this.es = es;
            this.he = he;
            this.vg = vg;
            this.ou = ou;
            this.le = le;
            this.uw = uw;
            this.hz = hz;
            this.eg = eg;
            this.ts = ts;
            this.et = et;
            this.vy = vy;
            this.as = as;
            this.pf = pf;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.ah(" + ')');
        }
    }
    
    public int aht() {
        return 1 * 31 + Arrays.hashCode(this.field3797);
    }
    
    static final int method2262(final int n, final int n2) {
        try {
            if (Math.abs(n - -1010818347 * class125.cameraYaw) <= 1024) {
                return n;
            }
            if (n2 <= -2081112459) {
                throw new IllegalStateException();
            }
            int n3;
            if (n < -1010818347 * class125.cameraYaw) {
                if (n2 <= -2081112459) {
                    throw new IllegalStateException();
                }
                n3 = 1;
            }
            else {
                n3 = -1;
            }
            return n3 * 2048 + n;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "qj.ig(" + ')');
        }
    }
    
    public static void pz(final class425 class425, final class425 class426) {
        final float bp = class425.es * class426.et + (class425.yo * class426.uw + (class426.he * class425.ld + class426.bp * class425.bp));
        final float ld = class426.vy * class425.es + (class426.ld * class425.bp + class425.ld * class426.vg + class426.hz * class425.yo);
        final float yo = class425.bp * class426.yo + class426.ou * class425.ld + class425.yo * class426.eg + class426.as * class425.es;
        final float es = class425.yo * class426.ts + (class425.ld * class426.le + class425.bp * class426.es) + class425.es * class426.pf;
        final float he = class425.vg * class426.he + class425.he * class426.bp + class426.uw * class425.ou + class425.le * class426.et;
        final float vg = class426.vy * class425.le + (class425.ou * class426.hz + (class425.vg * class426.vg + class426.ld * class425.he));
        final float ou = class426.yo * class425.he + class425.vg * class426.ou + class426.eg * class425.ou + class426.as * class425.le;
        final float le = class425.ou * class426.ts + (class426.es * class425.he + class426.le * class425.vg) + class425.le * class426.pf;
        final float uw = class426.bp * class425.uw + class425.hz * class426.he + class426.uw * class425.eg + class425.ts * class426.et;
        final float hz = class426.vy * class425.ts + (class425.hz * class426.vg + class426.ld * class425.uw + class425.eg * class426.hz);
        final float eg = class425.ts * class426.as + (class426.ou * class425.hz + class426.yo * class425.uw + class425.eg * class426.eg);
        final float ts = class426.es * class425.uw + class426.le * class425.hz + class425.eg * class426.ts + class425.ts * class426.pf;
        final float et = class425.as * class426.uw + (class426.he * class425.vy + class425.et * class426.bp) + class425.pf * class426.et;
        final float vy = class425.et * class426.ld + class425.vy * class426.vg + class425.as * class426.hz + class425.pf * class426.vy;
        final float as = class426.as * class425.pf + (class426.yo * class425.et + class425.vy * class426.ou + class426.eg * class425.as);
        final float pf = class426.le * class425.vy + class425.et * class426.es + class425.as * class426.ts + class426.pf * class425.pf;
        class425.bp = bp;
        class425.ld = ld;
        class425.yo = yo;
        class425.es = es;
        class425.he = he;
        class425.vg = vg;
        class425.ou = ou;
        class425.le = le;
        class425.uw = uw;
        class425.hz = hz;
        class425.eg = eg;
        class425.ts = ts;
        class425.et = et;
        class425.vy = vy;
        class425.as = as;
        class425.pf = pf;
    }
    
    public static void qy(final class425 class425, final Buffer buffer, final boolean b) {
        if (class425 == null) {
            class425.cs();
            return;
        }
        if (b) {
            final class426 class426 = new class426();
            class426.method2266(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-11)), (short)3378), -898796246);
            class426.method2267(MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-89)), (short)31869), 1665202061);
            class426.io(class426, MusicPatchNode.method1679(buffer.readUnsignedByte((byte)(-25)), (short)14502), (byte)5);
            class426.rx(class426, (float)buffer.readUnsignedByte((byte)(-6)), (float)buffer.readUnsignedByte((byte)(-81)), (float)buffer.readUnsignedByte((byte)(-56)), (byte)110);
            yx(class425, class426, (byte)41);
        }
        else {
            for (int i = 0; i < 16; ++i) {
                class425.field3797[i] = Buffer.iu(buffer, 1235015960);
            }
        }
    }
    
    public static void qf(final class425 class425, final class424 class426) {
        if (class425 == null) {
            class425.bp(class426);
        }
        final float n = class426.field3791 * class426.field3791;
        final float n2 = class426.field3791 * class426.field3788;
        final float n3 = class426.field3789 * class426.field3791;
        final float n4 = class426.field3791 * class426.field3790;
        final float n5 = class426.field3788 * class426.field3788;
        final float n6 = class426.field3788 * class426.field3789;
        final float n7 = class426.field3790 * class426.field3788;
        final float n8 = class426.field3789 * class426.field3789;
        final float n9 = class426.field3790 * class426.field3789;
        final float n10 = class426.field3790 * class426.field3790;
        class425.bp = n5 + n - n10 - n8;
        class425.ld = n4 + (n6 + n4 + n6);
        class425.yo = n7 + (n7 - n3 - n3);
        class425.he = n6 + (n6 - n4 - n4);
        class425.vg = n8 + n - n5 - n10;
        class425.ou = n9 + (n2 + n9) + n2;
        class425.uw = n3 + (n7 + n3 + n7);
        class425.hz = n9 - n2 - n2 + n9;
        class425.eg = n + n10 - n8 - n5;
    }
    
    public static class425 vu() {
        return new class425();
    }
    
    public void bu(final class425 class425) {
        final float bp = this.es * class425.et + (this.yo * class425.uw + (class425.he * this.ld + class425.bp * this.bp));
        final float ld = class425.vy * this.es + (class425.ld * this.bp + this.ld * class425.vg + class425.hz * this.yo);
        final float yo = this.bp * class425.yo + class425.ou * this.ld + this.yo * class425.eg + class425.as * this.es;
        final float es = this.yo * class425.ts + (this.ld * class425.le + this.bp * class425.es) + this.es * class425.pf;
        final float he = this.vg * class425.he + this.he * class425.bp + class425.uw * this.ou + this.le * class425.et;
        final float vg = class425.vy * this.le + (this.ou * class425.hz + (this.vg * class425.vg + class425.ld * this.he));
        final float ou = class425.yo * this.he + this.vg * class425.ou + class425.eg * this.ou + class425.as * this.le;
        final float le = this.ou * class425.ts + (class425.es * this.he + class425.le * this.vg) + this.le * class425.pf;
        final float uw = class425.bp * this.uw + this.hz * class425.he + class425.uw * this.eg + this.ts * class425.et;
        final float hz = class425.vy * this.ts + (this.hz * class425.vg + class425.ld * this.uw + this.eg * class425.hz);
        final float eg = this.ts * class425.as + (class425.ou * this.hz + class425.yo * this.uw + this.eg * class425.eg);
        final float ts = class425.es * this.uw + class425.le * this.hz + this.eg * class425.ts + this.ts * class425.pf;
        final float et = this.as * class425.uw + (class425.he * this.vy + this.et * class425.bp) + this.pf * class425.et;
        final float vy = this.et * class425.ld + this.vy * class425.vg + this.as * class425.hz + this.pf * class425.vy;
        final float as = class425.as * this.pf + (class425.yo * this.et + this.vy * class425.ou + class425.eg * this.as);
        final float pf = class425.le * this.vy + this.et * class425.es + this.as * class425.ts + class425.pf * this.pf;
        this.bp = bp;
        this.ld = ld;
        this.yo = yo;
        this.es = es;
        this.he = he;
        this.vg = vg;
        this.ou = ou;
        this.le = le;
        this.uw = uw;
        this.hz = hz;
        this.eg = eg;
        this.ts = ts;
        this.et = et;
        this.vy = vy;
        this.as = as;
        this.pf = pf;
    }
    
    public int ahv() {
        return 1 * 31 + Arrays.hashCode(this.field3797);
    }
    
    public int ahh() {
        return 1 * -322521754 + Arrays.hashCode(this.field3797);
    }
    
    public String ahj() {
        final StringBuilder sb = new StringBuilder();
        sn(this, 1466353408);
        this.method2248((short)15282);
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (j > 0) {
                    sb.append("\t");
                }
                float f = this.field3797[j + i * 4];
                if (Math.sqrt(f * f) < 9.999999747378752E-5) {
                    f = 0.0f;
                }
                sb.append(f);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public String ahm() {
        final StringBuilder sb = new StringBuilder();
        sn(this, -49407121);
        this.method2248((short)31447);
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (j > 0) {
                    sb.append("\t");
                }
                float f = this.field3797[j + i * 4];
                if (Math.sqrt(f * f) < 9.999999747378752E-5) {
                    f = 0.0f;
                }
                sb.append(f);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public String ahp() {
        final StringBuilder sb = new StringBuilder();
        sn(this, 1837987795);
        this.method2248((short)14141);
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (j > 0) {
                    sb.append("\t");
                }
                float f = this.field3797[j + i * 4];
                if (Math.sqrt(f * f) < 9.999999747378752E-5) {
                    f = 0.0f;
                }
                sb.append(f);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
