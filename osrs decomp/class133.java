import java.util.Arrays;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.5.36
// 

public class class133 extends DualNode
{
    int field1281;
    public static final int bz = 38;
    class125[][] field1279;
    public Skeleton field1280;
    public byte[] gh;
    public int[] lz;
    int field1278;
    public class125[][] field1282;
    static int field1283;
    public int[] iy;
    public short[] pr;
    public float[] cl;
    Future field1284;
    public int[] cr;
    public int[] qw;
    List field1285;
    public static final float gz;
    public float[] sq;
    public float[] mq;
    static final int bi = 2;
    public int[] va;
    static ClanSettings field1286;
    public static final /* synthetic */ boolean ts;
    boolean field1287;
    
    class133(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final int n, final boolean b) {
        this.field1281 = n * 1049522741;
        final Buffer yp = Buffer.yp(abstractArchive.loadData(this.field1281 * -1156919267 >> 16 & 0xFFFF, this.field1281 * -1156919267 & 0xFFFF));
        yp.oo();
        final int pp = yp.pp();
        byte[] array;
        if (b) {
            array = abstractArchive2.dc(0, pp);
        }
        else {
            array = abstractArchive2.dc(pp, 0);
        }
        this.field1280 = yy(pp, array);
        this.field1284 = class374.field3598.submit(() -> this.yg(yp));
        this.field1285 = Collections.emptyList();
    }
    
    static {
        ts = !class133.class.desiredAssertionStatus();
        gz = Math.ulp(1.0f);
    }
    
    public void sl(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] qd = class426.qd(this.field1278 * -744553313);
        float kn = qd[0];
        float kn2 = qd[1];
        float kn3 = qd[2];
        final int n3 = this.cr[n * 9 + 3];
        final int n4 = this.cr[n * 9 + 4];
        final int n5 = this.cr[n * 9 + 5];
        if (n3 != 0) {
            kn = this.kn(n3, n2);
        }
        if (n4 != 0) {
            kn2 = this.kn(n4, n2);
        }
        if (n5 != 0) {
            kn3 = this.kn(n5, n2);
        }
        final class425 class427 = class425;
        class427.et = kn;
        class427.vy = kn2;
        class427.as = kn3;
    }
    
    void ad(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] wl = class122.wl(class426, this.field1278 * 540704180, 689701217);
        float method744 = wl[0];
        float method745 = wl[1];
        float method746 = wl[2];
        if (this.field1279[n] != null) {
            final class125 class427 = this.field1279[n][0];
            final class125 class428 = this.field1279[n][1];
            final class125 class429 = this.field1279[n][2];
            if (null != class427) {
                method744 = class427.method744(n2, -1118122159);
            }
            if (class428 != null) {
                method745 = class428.method744(n2, -1999651151);
            }
            if (class429 != null) {
                method746 = class429.method744(n2, -1674751589);
            }
        }
        final class424 method747 = class131.method767((byte)(-11));
        method747.method2241(1.0f, 0.0f, 0.0f, method744, 749287521);
        final class424 method748 = class131.method767((byte)(-89));
        method748.method2241(0.0f, 1.0f, 0.0f, method745, 749287521);
        final class424 method749 = class131.method767((byte)12);
        method749.method2241(0.0f, 0.0f, 1.0f, method746, 749287521);
        final class424 method750 = class131.method767((byte)87);
        method750.method2242(method749, (byte)84);
        method750.method2242(method747, (byte)57);
        method750.method2242(method748, (byte)125);
        class425 class430;
        synchronized (class425.field3793) {
            if (0 == class425.field3794 * 652550762) {
                class430 = new class425();
            }
            else {
                class425.field3793[(class425.field3794 -= 1340498910) * -1129163430].method2250((byte)(-47));
                class430 = class425.field3793[-910698341 * class425.field3794];
            }
        }
        final class425 class431 = class430;
        class431.method2256(method750, (byte)(-63));
        class425.method2255(class431, 1104068098);
        method747.method2243((byte)(-61));
        method748.method2243((byte)(-81));
        method749.method2243((byte)(-98));
        method750.method2243((byte)(-78));
        class431.method2249(1198141071);
    }
    
    void ae(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] fh = class122.fh(class426, this.field1278 * -744553313, 540389908);
        float method744 = fh[0];
        float method745 = fh[1];
        float method746 = fh[2];
        if (null != this.field1279[n]) {
            final class125 class427 = this.field1279[n][3];
            final class125 class428 = this.field1279[n][4];
            final class125 class429 = this.field1279[n][5];
            if (class427 != null) {
                method744 = class427.method744(n2, -2021016406);
            }
            if (class428 != null) {
                method745 = class428.method744(n2, -2065526236);
            }
            if (class429 != null) {
                method746 = class429.method744(n2, -2115259052);
            }
        }
        class425.et = method744;
        class425.vy = method745;
        class425.as = method746;
    }
    
    public static boolean cr(final ClientPreferences clientPreferences) {
        return clientPreferences.hideUsername;
    }
    
    void bb(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] method734 = class426.method734(-744553313 * this.field1278, -2140302395);
        float method735 = method734[0];
        float method736 = method734[1];
        float method737 = method734[2];
        if (null != this.field1279[n]) {
            final Object o = this.field1279[n][6];
            final class125 class427 = this.field1279[n][7];
            final class125 class428 = this.field1279[n][8];
            if (o != null) {
                method735 = ((class125)o).method744(n2, -1555047649);
            }
            if (null != class427) {
                method736 = class427.method744(n2, -1614643660);
            }
            if (null != class428) {
                method737 = class428.method744(n2, -1320778696);
            }
        }
        Object o;
        synchronized (class425.field3793) {
            if (-2134274549 * class425.field3794 == 0) {
                o = new class425();
            }
            else {
                class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-124));
                o = class425.field3793[-910698341 * class425.field3794];
            }
        }
        final class125 class429 = (class125)o;
        ((class425)class429).method2260(method735, method736, method737, 691804305);
        class425.method2255((class425)class429, 1456468723);
        ((class425)class429).method2249(1198141071);
    }
    
    void ao(final Buffer buffer, final int n) {
        buffer.readUnsignedShort(-1171732614);
        buffer.readUnsignedShort(-265441270);
        this.field1278 = Buffer.ra(buffer, (byte)7) * 2106398559;
        final int unsignedShort = buffer.readUnsignedShort(-113917240);
        this.field1279 = new class125[class219.nv(Skeleton.kz(this.field1280, 219113487), -668665502)][];
        this.field1282 = new class125[this.field1280.method1234(646305676)][];
        final class124[] array = new class124[unsignedShort];
        for (int i = 0; i < unsignedShort; ++i) {
            class126 field1243 = (class126)StructComposition.findEnumerated(VarpDefinition.method983(-483162450), Buffer.ra(buffer, (byte)7), (short)173);
            if (null == field1243) {
                field1243 = class126.field1243;
            }
            final class126 class126 = field1243;
            final int shortSmart = buffer.readShortSmart(2113432759);
            final class127 method705 = UserComparator9.method705(Buffer.ra(buffer, (byte)7), -817945649);
            final class125 class127 = new class125();
            class125.method749(class127, buffer, n, (byte)(-84));
            array[i] = new class124(this, class127, class126, method705, shortSmart);
            final int oo = class126.oo(class126, -1917645336);
            class125[][] array2;
            if (class126.field1240 == class126) {
                array2 = this.field1279;
            }
            else {
                array2 = this.field1282;
            }
            if (array2[shortSmart] == null) {
                array2[shortSmart] = new class125[oo];
            }
            if (class126.field1247 == class126) {
                this.field1287 = true;
            }
        }
        final int n2 = unsignedShort / (1719893363 * class133.field1283);
        int n3 = unsignedShort % (class133.field1283 * 361417104);
        int n4 = 0;
        for (int j = 0; j < -1609019153 * class133.field1283; ++j) {
            final int n5 = n4;
            n4 += n2;
            if (n3 > 0) {
                ++n4;
                --n3;
            }
            if (n4 == n5) {
                break;
            }
            this.field1285.add(class374.field3598.submit((Callable<Object>)new class128(this, n5, n4, array)));
        }
    }
    
    public void ao(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] fa = class426.fa(this.field1278 * -744553313);
        float kn = fa[0];
        float kn2 = fa[1];
        float kn3 = fa[2];
        final int n3 = this.cr[n * 9 + 6];
        final int n4 = this.cr[n * 9 + 7];
        final int n5 = this.cr[n * 9 + 8];
        if (n3 != 0) {
            kn = this.kn(n3, n2);
        }
        if (n4 != 0) {
            kn2 = this.kn(n4, n2);
        }
        if (n5 != 0) {
            kn3 = this.kn(n5, n2);
        }
        final class425 vi = class425.vi();
        vi.cf(kn, kn2, kn3);
        class425.bm(vi);
        vi.iw();
    }
    
    void method776(final class425 class425, final int n, final class122 class426, final int n2, final int n3) {
        try {
            final float[] wl = class122.wl(class426, this.field1278 * -744553313, 689701217);
            float method744 = wl[0];
            float method745 = wl[1];
            float method746 = wl[2];
            if (this.field1279[n] != null) {
                if (n3 >= -362988431) {
                    throw new IllegalStateException();
                }
                final class125 class427 = this.field1279[n][0];
                final class125 class428 = this.field1279[n][1];
                final class125 class429 = this.field1279[n][2];
                if (null != class427) {
                    if (n3 >= -362988431) {
                        throw new IllegalStateException();
                    }
                    method744 = class427.method744(n2, -1453071914);
                }
                if (class428 != null) {
                    if (n3 >= -362988431) {
                        throw new IllegalStateException();
                    }
                    method745 = class428.method744(n2, -2024475281);
                }
                if (class429 != null) {
                    if (n3 >= -362988431) {
                        throw new IllegalStateException();
                    }
                    method746 = class429.method744(n2, -1489920931);
                }
            }
            final class424 method747 = class131.method767((byte)(-20));
            method747.method2241(1.0f, 0.0f, 0.0f, method744, 749287521);
            final class424 method748 = class131.method767((byte)70);
            method748.method2241(0.0f, 1.0f, 0.0f, method745, 749287521);
            final class424 method749 = class131.method767((byte)(-15));
            method749.method2241(0.0f, 0.0f, 1.0f, method746, 749287521);
            final class424 method750 = class131.method767((byte)30);
            method750.method2242(method749, (byte)31);
            method750.method2242(method747, (byte)43);
            method750.method2242(method748, (byte)73);
            class425 class430;
            synchronized (class425.field3793) {
                if (0 == class425.field3794 * -910698341) {
                    if (n3 >= -362988431) {
                        return;
                    }
                    class430 = new class425();
                }
                else {
                    class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-106));
                    class430 = class425.field3793[-910698341 * class425.field3794];
                }
            }
            final class425 class431 = class430;
            class431.method2256(method750, (byte)(-48));
            class425.method2255(class431, 1545077271);
            method747.method2243((byte)(-73));
            method748.method2243((byte)(-51));
            method749.method2243((byte)(-95));
            method750.method2243((byte)(-6));
            class431.method2249(1198141071);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.aq(" + ')');
        }
    }
    
    public void ak(final int n, final class122 class122, final int n2, final int n3) {
        class425 class123;
        synchronized (class425.field3793) {
            if (0 == -910698341 * class425.field3794) {
                class123 = new class425();
            }
            else {
                class425.field3793[(class425.field3794 += 581569689) * -910698341].method2250((byte)(-48));
                class123 = class425.field3793[-910698341 * class425.field3794];
            }
        }
        final class425 class124 = class123;
        this.method776(class124, n2, class122, n, -1366884139);
        this.method772(class124, n2, class122, n, -1876303915);
        this.method775(class124, n2, class122, n, 2032809415);
        class122.method733(class124, -2093532589);
        class124.method2249(1198141071);
    }
    
    public int av() {
        return this.field1278 * 1923262966;
    }
    
    void be(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] method734 = class426.method734(-744553313 * this.field1278, -2143768055);
        float method735 = method734[0];
        float method736 = method734[1];
        float method737 = method734[2];
        if (null != this.field1279[n]) {
            final Object o = this.field1279[n][6];
            final class125 class427 = this.field1279[n][7];
            final class125 class428 = this.field1279[n][8];
            if (o != null) {
                method735 = ((class125)o).method744(n2, -1375501555);
            }
            if (null != class427) {
                method736 = class427.method744(n2, -1496871291);
            }
            if (null != class428) {
                method737 = class428.method744(n2, -1260700774);
            }
        }
        Object o;
        synchronized (class425.field3793) {
            if (-910698341 * class425.field3794 == 0) {
                o = new class425();
            }
            else {
                class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-3));
                o = class425.field3793[-910698341 * class425.field3794];
            }
        }
        final class125 class429 = (class125)o;
        ((class425)class429).method2260(method735, method736, method737, 119673828);
        class425.method2255((class425)class429, 1100049253);
        ((class425)class429).method2249(1198141071);
    }
    
    public boolean as() {
        return this.field1287;
    }
    
    void az(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] wl = class122.wl(class426, this.field1278 * -744553313, 689701217);
        float method744 = wl[0];
        float method745 = wl[1];
        float method746 = wl[2];
        if (this.field1279[n] != null) {
            final class125 class427 = this.field1279[n][0];
            final class125 class428 = this.field1279[n][1];
            final class125 class429 = this.field1279[n][2];
            if (null != class427) {
                method744 = class427.method744(n2, -1353498447);
            }
            if (class428 != null) {
                method745 = class428.method744(n2, -1766075218);
            }
            if (class429 != null) {
                method746 = class429.method744(n2, -1041345262);
            }
        }
        final class424 method747 = class131.method767((byte)11);
        method747.method2241(1.0f, 0.0f, 0.0f, method744, 749287521);
        final class424 method748 = class131.method767((byte)6);
        method748.method2241(0.0f, 1.0f, 0.0f, method745, 749287521);
        final class424 method749 = class131.method767((byte)(-54));
        method749.method2241(0.0f, 0.0f, 1.0f, method746, 749287521);
        final class424 method750 = class131.method767((byte)50);
        method750.method2242(method749, (byte)105);
        method750.method2242(method747, (byte)7);
        method750.method2242(method748, (byte)94);
        class425 class430;
        synchronized (class425.field3793) {
            if (0 == class425.field3794 * -910698341) {
                class430 = new class425();
            }
            else {
                class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-43));
                class430 = class425.field3793[-910698341 * class425.field3794];
            }
        }
        final class425 class431 = class430;
        class431.method2256(method750, (byte)(-125));
        class425.method2255(class431, 1950375064);
        method747.method2243((byte)(-5));
        method748.method2243((byte)(-26));
        method749.method2243((byte)(-67));
        method750.method2243((byte)(-84));
        class431.method2249(1198141071);
    }
    
    void ax(final Buffer buffer, final int n) {
        buffer.readUnsignedShort(-541167353);
        buffer.readUnsignedShort(-1464819018);
        this.field1278 = Buffer.ra(buffer, (byte)7) * -1991005177;
        final int unsignedShort = buffer.readUnsignedShort(-2115502743);
        this.field1279 = new class125[class219.nv(Skeleton.kz(this.field1280, -312016765), -1182529487)][];
        this.field1282 = new class125[this.field1280.method1234(-45612163)][];
        final class124[] array = new class124[unsignedShort];
        for (int i = 0; i < unsignedShort; ++i) {
            class126 field1243 = (class126)StructComposition.findEnumerated(VarpDefinition.method983(727727471), Buffer.ra(buffer, (byte)7), (short)173);
            if (null == field1243) {
                field1243 = class126.field1243;
            }
            final class126 class126 = field1243;
            final int shortSmart = buffer.readShortSmart(1689699579);
            final class127 method705 = UserComparator9.method705(Buffer.ra(buffer, (byte)7), -1214354953);
            final class125 class127 = new class125();
            class125.method749(class127, buffer, n, (byte)(-77));
            array[i] = new class124(this, class127, class126, method705, shortSmart);
            final int oo = class126.oo(class126, 682121227);
            class125[][] array2;
            if (class126.field1240 == class126) {
                array2 = this.field1279;
            }
            else {
                array2 = this.field1282;
            }
            if (array2[shortSmart] == null) {
                array2[shortSmart] = new class125[oo];
            }
            if (class126.field1247 == class126) {
                this.field1287 = true;
            }
        }
        final int n2 = unsignedShort / (-809614081 * class133.field1283);
        int n3 = unsignedShort % (class133.field1283 * -1609019153);
        int n4 = 0;
        for (int j = 0; j < -1609019153 * class133.field1283; ++j) {
            final int n5 = n4;
            n4 += n2;
            if (n3 > 0) {
                ++n4;
                --n3;
            }
            if (n4 == n5) {
                break;
            }
            this.field1285.add(class374.field3598.submit((Callable<Object>)new class128(this, n5, n4, array)));
        }
    }
    
    public static class133 ay(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final int n, final boolean b) {
        boolean b2 = true;
        final byte[] file = abstractArchive.getFile(n >> 16 & 0xFFFF, n & 0xFFFF, -606351717);
        if (null == file) {
            return null;
        }
        final int n2 = (file[1] & 0xFF) << 8 | (file[2] & 0xFF);
        byte[] array;
        if (b) {
            array = abstractArchive2.getFile(0, n2, -606351717);
        }
        else {
            array = abstractArchive2.getFile(n2, 0, -606351717);
        }
        if (null == array) {
            b2 = false;
        }
        if (!b2) {
            return null;
        }
        if (null == class374.field3598) {
            class133.field1283 = Runtime.getRuntime().availableProcessors() * -1243816433;
            class374.field3598 = new ThreadPoolExecutor(0, -1609019153 * class133.field1283, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(100 + -1988125348 * class133.field1283), new class130());
        }
        try {
            return new class133(abstractArchive, abstractArchive2, n, b);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    void bi(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] method734 = class426.method734(-744553313 * this.field1278, -2141984637);
        float method735 = method734[0];
        float method736 = method734[1];
        float method737 = method734[2];
        if (null != this.field1279[n]) {
            final Object o = this.field1279[n][6];
            final class125 class427 = this.field1279[n][7];
            final class125 class428 = this.field1279[n][8];
            if (o != null) {
                method735 = ((class125)o).method744(n2, -899279174);
            }
            if (null != class427) {
                method736 = class427.method744(n2, -1413299620);
            }
            if (null != class428) {
                method737 = class428.method744(n2, -930173665);
            }
        }
        Object o;
        synchronized (class425.field3793) {
            if (-1319000195 * class425.field3794 == 0) {
                o = new class425();
            }
            else {
                class425.field3793[(class425.field3794 -= 1234448817) * -910698341].method2250((byte)(-88));
                o = class425.field3793[-910698341 * class425.field3794];
            }
        }
        final class125 class429 = (class125)o;
        ((class425)class429).method2260(method735, method736, method737, -1822777242);
        class425.method2255((class425)class429, 1906184528);
        ((class425)class429).method2249(1198141071);
    }
    
    public boolean method774(final int n) {
        try {
            if (null == this.field1284 && this.field1285 == null) {
                if (n != -63286081) {
                    throw new IllegalStateException();
                }
                return true;
            }
            else {
                if (this.field1284 != null) {
                    if (n != -63286081) {
                        throw new IllegalStateException();
                    }
                    if (!this.field1284.isDone()) {
                        if (n != -63286081) {
                            throw new IllegalStateException();
                        }
                        return false;
                    }
                    else {
                        this.field1284 = null;
                    }
                }
                boolean b = true;
                for (int i = 0; i < this.field1285.size(); ++i) {
                    if (n != -63286081) {
                        throw new IllegalStateException();
                    }
                    if (!((Future)this.field1285.get(i)).isDone()) {
                        if (n != -63286081) {
                            throw new IllegalStateException();
                        }
                        b = false;
                    }
                    else {
                        this.field1285.remove(i);
                        --i;
                    }
                }
                if (b) {
                    this.field1285 = null;
                    return true;
                }
                if (n != -63286081) {
                    throw new IllegalStateException();
                }
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.aw(" + ')');
        }
    }
    
    void method772(final class425 class425, final int n, final class122 class426, final int n2, final int n3) {
        try {
            final float[] method734 = class426.method734(-744553313 * this.field1278, -2141341986);
            float method735 = method734[0];
            float method736 = method734[1];
            float method737 = method734[2];
            if (null != this.field1279[n]) {
                if (n3 >= -966914563) {
                    throw new IllegalStateException();
                }
                final Object o = this.field1279[n][6];
                final class125 class427 = this.field1279[n][7];
                final class125 class428 = this.field1279[n][8];
                if (o != null) {
                    if (n3 >= -966914563) {
                        throw new IllegalStateException();
                    }
                    method735 = ((class125)o).method744(n2, -1599255440);
                }
                if (null != class427) {
                    if (n3 >= -966914563) {
                        throw new IllegalStateException();
                    }
                    method736 = class427.method744(n2, -1320109879);
                }
                if (null != class428) {
                    if (n3 >= -966914563) {
                        throw new IllegalStateException();
                    }
                    method737 = class428.method744(n2, -1753875121);
                }
            }
            Object o;
            synchronized (class425.field3793) {
                if (-910698341 * class425.field3794 == 0) {
                    if (n3 >= -966914563) {
                        throw new IllegalStateException();
                    }
                    o = new class425();
                }
                else {
                    class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-124));
                    o = class425.field3793[-910698341 * class425.field3794];
                }
            }
            final class125 class429 = (class125)o;
            ((class425)class429).method2260(method735, method736, method737, -2045639991);
            class425.method2255((class425)class429, 1139469665);
            ((class425)class429).method2249(1198141071);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.at(" + ')');
        }
    }
    
    void method769(final Buffer buffer, final int n, final byte b) {
        try {
            buffer._readUnsignedByteSub(-697993691);
            buffer.method2518(196138183);
            this.field1281 = Buffer.ra(buffer, (byte)7) * 2106398559;
            final int medium = buffer.readMedium(-376786090);
            this.field1279 = new class125[class219.nv(Skeleton.kz(this.field1280, 485057822), -1415640515)][];
            this.field1282 = new class125[this.field1280.method1234(612928159)][];
            final class124[] array = new class124[medium];
            for (int i = 0; i < medium; ++i) {
                class126 field1244 = (class126)StructComposition.findEnumerated(VarpDefinition.method983(335062925), Buffer.ra(buffer, (byte)7), (short)173);
                if (null == field1244) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    field1244 = class126.field1244;
                }
                final class126 class126 = field1244;
                final int unsignedShort = buffer.readUnsignedShort(1391642638);
                final class127 method705 = UserComparator9.method705(Buffer.ra(buffer, (byte)7), -500821406);
                final class125 class127 = new class125();
                class125.method749(class127, buffer, n, (byte)(-26));
                array[i] = new class124(this, class127, class126, method705, unsignedShort);
                final int oo = class126.oo(class126, -406434338);
                class125[][] array2;
                if (class126.field1240 == class126) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    array2 = this.field1279;
                }
                else {
                    array2 = this.field1282;
                }
                if (array2[unsignedShort] == null) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    array2[unsignedShort] = new class125[oo];
                }
                if (class126.field1241 == class126) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    this.field1287 = true;
                }
            }
            final int n2 = medium / (-1609019153 * class133.field1283);
            int n3 = medium % (class133.field1283 * -1609019153);
            int n4 = 0;
            int j = 0;
            while (j < -1609019153 * class133.field1283) {
                if (b >= 3) {
                    return;
                }
                final int n5 = n4;
                n4 += n2;
                if (n3 > 0) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    ++n4;
                    --n3;
                }
                if (n4 == n5) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    break;
                }
                else {
                    this.field1285.add(class374.field3598.submit((Callable<Object>)new class128(this, n5, n4, array)));
                    ++j;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.an(" + ')');
        }
    }
    
    public int method773(final int n) {
        try {
            return this.field1278 * -744553313;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.ac(" + ')');
        }
    }
    
    public static boolean gk(final class133 class133) {
        return class133.field1287;
    }
    
    public boolean dz(final int n, final int n2, final int n3, final int n4) {
        int n5 = this.qw[n];
        if (n5 < 0 || this.pr[n5] > n2 || (n5 + 1 < n4 && this.pr[n5 + 1] <= n2)) {
            if (n4 - n3 > 0) {
                int i = n3;
                int n6 = n4 - 1;
                do {
                    final int n7 = n6 + i >> 1;
                    if (n2 < this.pr[n7]) {
                        if (n2 > this.pr[n7 - 1]) {
                            n5 = n7 - 1;
                            break;
                        }
                        n6 = n7 - 1;
                    }
                    else {
                        if (n2 <= this.pr[n7]) {
                            n5 = n7;
                            break;
                        }
                        if (n2 < this.pr[n7 + 1]) {
                            n5 = n7;
                            break;
                        }
                        i = n7 + 1;
                    }
                } while (i <= n6);
            }
            if (!class133.ts && n5 == -1) {
                throw new AssertionError();
            }
            if (n5 != this.qw[n]) {
                this.qw[n] = n5;
                return true;
            }
        }
        return false;
    }
    
    static void queueSoundEffect(final int n, final int n2, final int n3, final byte b) {
        try {
            if (ClientPreferences.setUsernameToRemember(class20.clientPreferences, 1583264693) != 0) {
                if (b >= 8) {
                    throw new IllegalStateException();
                }
                if (0 != n2) {
                    if (b >= 8) {
                        throw new IllegalStateException();
                    }
                    if (Client.soundEffectCount * -297150195 < 50) {
                        Client.soundEffectIds[Client.soundEffectCount * -297150195] = n;
                        Client.queuedSoundEffectLoops[Client.soundEffectCount * -297150195] = n2;
                        Client.queuedSoundEffectDelays[Client.soundEffectCount * -297150195] = n3;
                        Client.soundEffects[-297150195 * Client.soundEffectCount] = null;
                        Client.soundLocations[Client.soundEffectCount * -297150195] = 0;
                        Client.soundEffectCount += 831233477;
                        Client.ua(-1);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.he(" + ')');
        }
    }
    
    public static void fr(final class133 class133, final class425 class134, final int n, final class122 class135, final int n2) {
        final float[] fh = class122.fh(class135, class133.field1278 * -744553313, 1957061639);
        float method744 = fh[0];
        float method745 = fh[1];
        float method746 = fh[2];
        if (null != class133.field1279[n]) {
            final class125 class136 = class133.field1279[n][3];
            final class125 class137 = class133.field1279[n][4];
            final class125 class138 = class133.field1279[n][5];
            if (class136 != null) {
                method744 = class136.method744(n2, -1765865983);
            }
            if (class137 != null) {
                method745 = class137.method744(n2, -893628976);
            }
            if (class138 != null) {
                method746 = class138.method744(n2, -2119734709);
            }
        }
        class134.et = method744;
        class134.vy = method745;
        class134.as = method746;
    }
    
    public boolean method770(final int n) {
        try {
            return this.field1287;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.au(" + ')');
        }
    }
    
    public static class133 aa(final AbstractArchive abstractArchive, final AbstractArchive abstractArchive2, final int n, final boolean b) {
        boolean b2 = true;
        final byte[] file = abstractArchive.getFile(n >> 16 & 0x1073D083, n & 0xFFFF, -606351717);
        if (null == file) {
            return null;
        }
        final int n2 = (file[1] & 0xFF) << 8 | (file[2] & 0xFF);
        byte[] array;
        if (b) {
            array = abstractArchive2.getFile(0, n2, -606351717);
        }
        else {
            array = abstractArchive2.getFile(n2, 0, -606351717);
        }
        if (null == array) {
            b2 = false;
        }
        if (!b2) {
            return null;
        }
        if (null == class374.field3598) {
            class133.field1283 = Runtime.getRuntime().availableProcessors() * -1357423466;
            class374.field3598 = new ThreadPoolExecutor(0, -1246097741 * class133.field1283, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1692989204 + 1283907559 * class133.field1283), new class130());
        }
        try {
            return new class133(abstractArchive, abstractArchive2, n, b);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public boolean ai() {
        if (null == this.field1284 && this.field1285 == null) {
            return true;
        }
        if (this.field1284 != null) {
            if (!this.field1284.isDone()) {
                return false;
            }
            this.field1284 = null;
        }
        int n = 1;
        for (int i = 0; i < this.field1285.size(); ++i) {
            if (!((Future)this.field1285.get(i)).isDone()) {
                n = 0;
            }
            else {
                this.field1285.remove(i);
                --i;
            }
        }
        if (n == 0) {
            return false;
        }
        this.field1285 = null;
        return true;
    }
    
    public static void bh(final class133 class133, final Buffer buffer, final int n, final byte b) {
        if (class133 == null) {
            class133.method769(buffer, n, b);
        }
        try {
            buffer.readUnsignedShort(-697993691);
            buffer.readUnsignedShort(196138183);
            class133.field1278 = Buffer.ra(buffer, (byte)7) * 2106398559;
            final int unsignedShort = buffer.readUnsignedShort(-376786090);
            class133.field1279 = new class125[class219.nv(Skeleton.kz(class133.field1280, 485057822), -1415640515)][];
            class133.field1282 = new class125[class133.field1280.method1234(612928159)][];
            final class124[] array = new class124[unsignedShort];
            for (int i = 0; i < unsignedShort; ++i) {
                class126 field1243 = (class126)StructComposition.findEnumerated(VarpDefinition.method983(335062925), Buffer.ra(buffer, (byte)7), (short)173);
                if (null == field1243) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    field1243 = class126.field1243;
                }
                final class126 class134 = field1243;
                final int shortSmart = buffer.readShortSmart(1391642638);
                final class127 method705 = UserComparator9.method705(Buffer.ra(buffer, (byte)7), -500821406);
                final class125 class135 = new class125();
                class125.method749(class135, buffer, n, (byte)(-26));
                array[i] = new class124(class133, class135, class134, method705, shortSmart);
                final int oo = class126.oo(class134, -406434338);
                class125[][] array2;
                if (class126.field1240 == class134) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    array2 = class133.field1279;
                }
                else {
                    array2 = class133.field1282;
                }
                if (array2[shortSmart] == null) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    array2[shortSmart] = new class125[oo];
                }
                if (class126.field1247 == class134) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    class133.field1287 = true;
                }
            }
            final int n2 = unsignedShort / (-1609019153 * class133.field1283);
            int n3 = unsignedShort % (class133.field1283 * -1609019153);
            int n4 = 0;
            int j = 0;
            while (j < -1609019153 * class133.field1283) {
                if (b >= 3) {
                    return;
                }
                final int n5 = n4;
                n4 += n2;
                if (n3 > 0) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    ++n4;
                    --n3;
                }
                if (n4 == n5) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    break;
                }
                else {
                    class133.field1285.add(class374.field3598.submit((Callable<Object>)new class128(class133, n5, n4, array)));
                    ++j;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.an(" + ')');
        }
    }
    
    void by(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] fh = class122.fh(class426, this.field1278 * -744553313, 962805315);
        float method744 = fh[0];
        float method745 = fh[1];
        float method746 = fh[2];
        if (null != this.field1279[n]) {
            final class125 class427 = this.field1279[n][3];
            final class125 class428 = this.field1279[n][4];
            final class125 class429 = this.field1279[n][5];
            if (class427 != null) {
                method744 = class427.method744(n2, -1153369949);
            }
            if (class428 != null) {
                method745 = class428.method744(n2, -823839020);
            }
            if (class429 != null) {
                method746 = class429.method744(n2, -1051756925);
            }
        }
        class425.et = method744;
        class425.vy = method745;
        class425.as = method746;
    }
    
    public int ar() {
        return this.field1278 * -413757052;
    }
    
    public float im(final int n, final float n2, final boolean b) {
        final byte b2 = this.gh[n * 2];
        final byte b3 = this.gh[n * 2 + 1];
        final int n3 = this.iy[n * 2];
        final int n4 = this.iy[n * 2 + 1];
        final float n5 = 0.0f;
        if (n4 - n3 == 0) {
            return n5;
        }
        final float n6 = this.pr[n3];
        final float n7 = this.pr[n4 - 1];
        final float n8 = n7 - n6;
        if (0.0f == n8) {
            return this.cl[n3 * 5 + 0];
        }
        float n9;
        if (n2 > n7) {
            n9 = (n2 - n7) / n8;
        }
        else {
            n9 = (n2 - n6) / n8;
        }
        final float n10 = (float)(int)n9;
        float n11 = Math.abs(n9 - n10) * n8;
        final float abs = Math.abs(n10 + 1.0f);
        final float n12 = abs / 2.0f;
        final float n13 = n12 - (int)n12;
        if (b) {
            if (b2 == 4) {
                if (0.0f != n13) {
                    n11 += n6;
                }
                else {
                    n11 = n7 - n11;
                }
            }
            else if (b2 != 2 && b2 != 3) {
                if (b2 == 1) {
                    final float n14 = n6 - n2;
                    final float n15 = this.cl[n3 * 5 + 1];
                    final float n16 = this.cl[n3 * 5 + 2];
                    float n17 = this.cl[n3 * 5 + 0];
                    if (0.0f != n15) {
                        n17 -= n16 * n14 / n15;
                    }
                    return n17;
                }
            }
            else {
                n11 = n7 - n11;
            }
        }
        else if (b3 == 4) {
            if (n13 != 0.0f) {
                n11 = n7 - n11;
            }
            else {
                n11 += n6;
            }
        }
        else if (b3 != 2 && b3 != 3) {
            if (b3 == 1) {
                final float n18 = n2 - n7;
                final float n19 = this.cl[(n4 - 1) * 5 + 3];
                final float n20 = this.cl[(n4 - 1) * 5 + 4];
                float n21 = this.cl[(n4 - 1) * 5 + 0];
                if (0.0f != n19) {
                    n21 += n20 * n18 / n19;
                }
                return n21;
            }
        }
        else {
            n11 += n6;
        }
        float wq = this.wq(n, n11);
        if (b && b2 == 3) {
            wq -= abs * (this.cl[(n4 - 1) * 5 + 0] - this.cl[n3 * 5 + 0]);
        }
        else if (!b && b3 == 3) {
            wq += (this.cl[(n4 - 1) * 5 + 0] - this.cl[n3 * 5 + 0]) * abs;
        }
        return wq;
    }
    
    public void kb(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] gf = class426.gf(this.field1278 * -744553313);
        float kn = gf[0];
        float kn2 = gf[1];
        float kn3 = gf[2];
        final int n3 = this.cr[n * 9 + 0];
        final int n4 = this.cr[n * 9 + 1];
        final int n5 = this.cr[n * 9 + 2];
        if (n3 != 0) {
            kn = this.kn(n3, n2);
        }
        if (n4 != 0) {
            kn2 = this.kn(n4, n2);
        }
        if (n5 != 0) {
            kn3 = this.kn(n5, n2);
        }
        final class424 ew = class424.ew();
        final class424 ew2 = class424.ew();
        ew2.td(0.0f, 0.0f, 1.0f, kn3);
        ew.jb(ew2);
        ew2.td(1.0f, 0.0f, 0.0f, kn);
        ew.jb(ew2);
        ew2.td(0.0f, 1.0f, 0.0f, kn2);
        ew.jb(ew2);
        final class425 vi = class425.vi();
        vi.oi(ew);
        class425.bm(vi);
        vi.iw();
    }
    
    public float kn(final int n, final int n2) {
        return this.wq(n - 1, (float)n2);
    }
    
    static final void method777(final int n, final int n2, final int n3, final int n4) {
        try {
            if (-2100544359 * class36.cameraX < n) {
                if (n4 == -1835821708) {
                    throw new IllegalStateException();
                }
                class36.cameraX += (2083910077 * KeyHandler.field81 + class138.field1314 * -1514927571 * (n - -2100544359 * class36.cameraX) / 1000) * -1682679895;
                if (-2100544359 * class36.cameraX > n) {
                    if (n4 == -1835821708) {
                        throw new IllegalStateException();
                    }
                    class36.cameraX = -1682679895 * n;
                }
            }
            if (class36.cameraX * -2100544359 > n) {
                class36.cameraX -= -1682679895 * (KeyHandler.field81 * 2083910077 + class138.field1314 * -1514927571 * (-2100544359 * class36.cameraX - n) / 1000);
                if (-2100544359 * class36.cameraX < n) {
                    if (n4 == -1835821708) {
                        throw new IllegalStateException();
                    }
                    class36.cameraX = n * -1682679895;
                }
            }
            if (1772923873 * class174.cameraY < n2) {
                if (n4 == -1835821708) {
                    throw new IllegalStateException();
                }
                class174.cameraY += (2083910077 * KeyHandler.field81 + (n2 - class174.cameraY * 1772923873) * (class138.field1314 * -1514927571) / 1000) * -424093663;
                if (class174.cameraY * 1772923873 > n2) {
                    if (n4 == -1835821708) {
                        throw new IllegalStateException();
                    }
                    class174.cameraY = -424093663 * n2;
                }
            }
            if (class174.cameraY * 1772923873 > n2) {
                if (n4 == -1835821708) {
                    throw new IllegalStateException();
                }
                class174.cameraY -= (KeyHandler.field81 * 2083910077 + (1772923873 * class174.cameraY - n2) * (-1514927571 * class138.field1314) / 1000) * -424093663;
                if (1772923873 * class174.cameraY < n2) {
                    if (n4 == -1835821708) {
                        throw new IllegalStateException();
                    }
                    class174.cameraY = -424093663 * n2;
                }
            }
            if (-91399205 * class297.cameraZ < n3) {
                if (n4 == -1835821708) {
                    throw new IllegalStateException();
                }
                class297.cameraZ += (-1514927571 * class138.field1314 * (n3 - -91399205 * class297.cameraZ) / 1000 + KeyHandler.field81 * 2083910077) * 46344275;
                if (-91399205 * class297.cameraZ > n3) {
                    if (n4 == -1835821708) {
                        throw new IllegalStateException();
                    }
                    class297.cameraZ = n3 * 46344275;
                }
            }
            if (-91399205 * class297.cameraZ > n3) {
                if (n4 == -1835821708) {
                    throw new IllegalStateException();
                }
                class297.cameraZ -= (-1514927571 * class138.field1314 * (class297.cameraZ * -91399205 - n3) / 1000 + 2083910077 * KeyHandler.field81) * 46344275;
                if (-91399205 * class297.cameraZ < n3) {
                    if (n4 == -1835821708) {
                        throw new IllegalStateException();
                    }
                    class297.cameraZ = 46344275 * n3;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.il(" + ')');
        }
    }
    
    public void method771(final int n, final class122 class122, final int n2, final int n3, final int n4) {
        final class425 vi = class425.vi();
        this.kb(vi, n2, class122, n);
        this.ao(vi, n2, class122, n);
        this.sl(vi, n2, class122, n);
        class122.il(vi);
        vi.iw();
    }
    
    void method775(final class425 class425, final int n, final class122 class426, final int n2, final int n3) {
        try {
            final float[] fh = class122.fh(class426, this.field1278 * -744553313, 2097133235);
            float method744 = fh[0];
            float method745 = fh[1];
            float method746 = fh[2];
            if (null != this.field1279[n]) {
                final class125 class427 = this.field1279[n][3];
                final class125 class428 = this.field1279[n][4];
                final class125 class429 = this.field1279[n][5];
                if (class427 != null) {
                    if (n3 <= 1401960191) {
                        throw new IllegalStateException();
                    }
                    method744 = class427.method744(n2, -1677194647);
                }
                if (class428 != null) {
                    if (n3 <= 1401960191) {
                        throw new IllegalStateException();
                    }
                    method745 = class428.method744(n2, -2050927243);
                }
                if (class429 != null) {
                    method746 = class429.method744(n2, -1917493818);
                }
            }
            class425.et = method744;
            class425.vy = method745;
            class425.as = method746;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fh.al(" + ')');
        }
    }
    
    public void aj(final int n, final class122 class122, final int n2, final int n3) {
        class425 class123;
        synchronized (class425.field3793) {
            if (0 == -910698341 * class425.field3794) {
                class123 = new class425();
            }
            else {
                class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-25));
                class123 = class425.field3793[-910698341 * class425.field3794];
            }
        }
        final class425 class124 = class123;
        this.method776(class124, n2, class122, n, -2124298429);
        this.method772(class124, n2, class122, n, -1624433511);
        this.method775(class124, n2, class122, n, 1838788389);
        class122.method733(class124, -1846725676);
        class124.method2249(1198141071);
    }
    
    public boolean ag() {
        if (null == this.field1284 && this.field1285 == null) {
            return true;
        }
        if (this.field1284 != null) {
            if (!this.field1284.isDone()) {
                return false;
            }
            this.field1284 = null;
        }
        int n = 1;
        for (int i = 0; i < this.field1285.size(); ++i) {
            if (!((Future)this.field1285.get(i)).isDone()) {
                n = 0;
            }
            else {
                this.field1285.remove(i);
                --i;
            }
        }
        if (n == 0) {
            return false;
        }
        this.field1285 = null;
        return true;
    }
    
    public static Skeleton yy(final int n, final byte[] array) {
        return new Skeleton(n, array);
    }
    
    public void yg(final Buffer buffer) {
        try {
            buffer.pp();
            buffer.pp();
            this.field1278 = buffer.oo() * 2106398559;
            this.cr = new int[this.field1280.tw().ax() * 9];
            this.va = new int[this.field1280.pb() * 1];
            final int pp = buffer.pp();
            final int[] array = new int[pp];
            this.iy = new int[pp * 2];
            Arrays.fill(this.qw = new int[pp], -1);
            this.lz = new int[pp];
            this.mq = new float[pp * 5];
            this.gh = new byte[pp * 2];
            int n = 0;
            int n2 = 0;
            for (int i = 0; i < pp; ++i) {
                final int oo = buffer.oo();
                final int rb = buffer.rb();
                final int oo2 = buffer.oo();
                final int pp2 = buffer.pp();
                buffer.oo();
                this.gh[i * 2] = buffer.bm();
                this.gh[i * 2 + 1] = buffer.bm();
                this.lz[i] = ((buffer.oo() != 0) ? (6 * n2++) : -1);
                array[i] = buffer.fa();
                this.iy[i * 2] = n;
                this.iy[i * 2 + 1] = n + pp2;
                n += pp2;
                buffer.gx(buffer.fa() + 22 * pp2);
                int[] array2;
                int n3;
                if (oo == 1) {
                    array2 = this.cr;
                    n3 = 9;
                }
                else {
                    array2 = this.va;
                    n3 = 1;
                }
                final int zx = zx(oo2);
                if (zx < n3) {
                    array2[rb * n3 + zx] = i + 1;
                }
                if (oo == 4) {
                    this.field1287 = true;
                }
            }
            this.sq = new float[6 * n2];
            this.pr = new short[n];
            this.cl = new float[n * 5];
            for (int j = 0; j < pp; ++j) {
                buffer.gx(array[j]);
                for (int k = this.iy[j * 2]; k < this.iy[j * 2 + 1]; ++k) {
                    this.pr[k] = (short)buffer.nr();
                    for (int l = 0; l < 5; ++l) {
                        this.cl[k * 5 + l] = buffer.hz();
                    }
                }
            }
        }
        catch (Exception ex) {
            Client.nw.error("AnimMaya{}", (Object)(this.field1281 * -1156919267), (Object)ex);
            throw ex;
        }
    }
    
    public static int zx(final int n) {
        if (n >= 0 && n <= 9) {
            return n - 1;
        }
        if (n >= 10 && n <= 15) {
            return n - 10;
        }
        if (n == 16) {
            return 0;
        }
        return -1;
    }
    
    void bk(final class425 class425, final int n, final class122 class426, final int n2) {
        final float[] method734 = class426.method734(-744553313 * this.field1278, -2145759891);
        float method735 = method734[0];
        float method736 = method734[1];
        float method737 = method734[2];
        if (null != this.field1279[n]) {
            final Object o = this.field1279[n][6];
            final class125 class427 = this.field1279[n][7];
            final class125 class428 = this.field1279[n][8];
            if (o != null) {
                method735 = ((class125)o).method744(n2, -808402141);
            }
            if (null != class427) {
                method736 = class427.method744(n2, -2072435977);
            }
            if (null != class428) {
                method737 = class428.method744(n2, -1430722397);
            }
        }
        Object o;
        synchronized (class425.field3793) {
            if (-910698341 * class425.field3794 == 0) {
                o = new class425();
            }
            else {
                class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-125));
                o = class425.field3793[-910698341 * class425.field3794];
            }
        }
        final class125 class429 = (class125)o;
        ((class425)class429).method2260(method735, method736, method737, -284702389);
        class425.method2255((class425)class429, 1128174859);
        ((class425)class429).method2249(1198141071);
    }
    
    public static int lu(final float[] array, final int n, final float n2, final boolean b, final float n3, final boolean b2, final float[] array2) {
        return class103.method638(array, n, n2, b, n3, b2, array2, (byte)(-57));
    }
    
    public boolean ah() {
        if (null == this.field1284 && this.field1285 == null) {
            return true;
        }
        if (this.field1284 != null) {
            if (!this.field1284.isDone()) {
                return false;
            }
            this.field1284 = null;
        }
        int n = 1;
        for (int i = 0; i < this.field1285.size(); ++i) {
            if (!((Future)this.field1285.get(i)).isDone()) {
                n = 0;
            }
            else {
                this.field1285.remove(i);
                --i;
            }
        }
        if (n == 0) {
            return false;
        }
        this.field1285 = null;
        return true;
    }
    
    public float wq(final int n, final float n2) {
        final int n3 = this.iy[n * 2];
        final int n4 = this.iy[n * 2 + 1];
        final short n5 = this.pr[n3];
        final short n6 = this.pr[n4 - 1];
        if (n2 < n5) {
            return (this.gh[n * 2] == 0) ? this.cl[n3 * 5 + 0] : this.im(n, n2, true);
        }
        if (n2 > n6) {
            return (this.gh[n * 2 + 1] == 0) ? this.cl[(n4 - 1) * 5 + 0] : this.im(n, n2, false);
        }
        final boolean dz = this.dz(n, (int)n2, n3, n4);
        final int n7 = this.qw[n];
        final int n8 = this.lz[n];
        if (n4 - n3 <= 0) {
            return 0.0f;
        }
        final float n9 = this.cl[n7 * 5 + 3];
        final float n10 = this.cl[n7 * 5 + 4];
        boolean b = false;
        boolean b2 = false;
        if (0.0f == n9 && 0.0f == n10) {
            b = true;
        }
        else if (Float.MAX_VALUE == n9 && Float.MAX_VALUE == n10) {
            b2 = true;
        }
        else if (n7 + 1 < n4) {
            if (dz) {
                final float n11 = this.pr[n7];
                final float n12 = this.cl[n7 * 5 + 0];
                final float n13 = n11 + 0.33333334f * n9;
                float n14 = n10 * 0.33333334f + n12;
                final float n15 = this.pr[n7 + 1];
                final float n16 = this.cl[(n7 + 1) * 5 + 0];
                final float n17 = n15 - 0.33333334f * this.cl[n7 * 5 + 6];
                float n18 = n16 - this.cl[(n7 + 1) * 5 + 2] * 0.33333334f;
                if (n8 != -1) {
                    final float n19 = n15 - n11;
                    if (n19 != 0.0f) {
                        final float n20 = n13 - n11;
                        final float n21 = n17 - n11;
                        float n22 = n20 / n19;
                        float n23 = n21 / n19;
                        this.sq[n8 + 5] = ((n22 == 0.33333334f && n23 == 0.6666667f) ? 1.0f : 0.0f);
                        final float n24 = n22;
                        final float n25 = n23;
                        if (n22 < 0.0f) {
                            n22 = 0.0f;
                        }
                        if (n23 > 1.0f) {
                            n23 = 1.0f;
                        }
                        if (n22 > 1.0f || n23 < -1.0f) {
                            float n26 = 1.0f - n23;
                            if (n26 < 0.0f) {
                                n26 = 0.0f;
                            }
                            if ((n22 > 1.0f || n26 > 1.0f) && 1.0f + n22 * (n22 - 2.0f + n26) + (n26 - 2.0f) * n26 + class133.gz > 0.0f) {
                                if (class133.gz + n22 < 1.3333334f) {
                                    final float n27 = n22 - 2.0f;
                                    final float n28 = n22 - 1.0f;
                                    final float n29 = (float)Math.sqrt(n27 * n27 - n28 * 4.0f * n28);
                                    final float n30 = (-n27 + n29) * 0.5f;
                                    if (n26 + class133.gz > n30) {
                                        n26 = n30 - class133.gz;
                                    }
                                    else {
                                        final float n31 = 0.5f * (-n27 - n29);
                                        if (n26 < n31 + class133.gz) {
                                            n26 = n31 + class133.gz;
                                        }
                                    }
                                }
                                else {
                                    n22 = 1.3333334f - class133.gz;
                                    n26 = 0.33333334f - class133.gz;
                                }
                            }
                            n23 = 1.0f - n26;
                        }
                        if (n22 != n24 && n24 != 0.0f) {
                            n14 = n12 + (n14 - n12) * n22 / n24;
                        }
                        if (n23 != n25 && n25 != 0.0f) {
                            n18 = n16 - (n16 - n18) * (1.0f - n23) / (1.0f - n25);
                        }
                        this.mq[n * 5 + 4] = n11;
                        this.sq[n8 + 4] = n15;
                        final float n32 = n22 - 0.0f;
                        final float n33 = n23 - n22;
                        final float n34 = 1.0f - n23;
                        final float n35 = n33 - n32;
                        this.mq[n * 5 + 3] = n34 - n33 - n35;
                        this.mq[n * 5 + 2] = n35 + n35 + n35;
                        this.mq[n * 5 + 1] = n32 + n32 + n32;
                        this.mq[n * 5 + 0] = 0.0f;
                        final float n36 = n14 - n12;
                        final float n37 = n18 - n14;
                        final float n38 = n16 - n18;
                        final float n39 = n37 - n36;
                        this.sq[n8 + 3] = n38 - n37 - n39;
                        this.sq[n8 + 2] = n39 + n39 + n39;
                        this.sq[n8 + 1] = n36 + n36 + n36;
                        this.sq[n8 + 0] = n12;
                    }
                }
                else {
                    this.mq[n * 5 + 4] = n11;
                    final float n40 = n15 - n11;
                    final float n41 = n16 - n12;
                    final float n42 = n13 - n11;
                    float n43 = 0.0f;
                    float n44 = 0.0f;
                    if (n42 != 0.0f) {
                        n43 = (n14 - n12) / n42;
                    }
                    final float n45 = n15 - n17;
                    if (n45 != 0.0f) {
                        n44 = (n16 - n18) / n45;
                    }
                    final float n46 = 1.0f / (n40 * n40);
                    final float n47 = n40 * n43;
                    final float n48 = n40 * n44;
                    this.mq[n * 5 + 0] = n46 * (n47 + n48 - n41 - n41) / n40;
                    this.mq[n * 5 + 1] = (n41 + n41 + n41 - n47 - n47 - n48) * n46;
                    this.mq[n * 5 + 2] = n43;
                    this.mq[n * 5 + 3] = n12;
                }
            }
        }
        else {
            b = true;
        }
        if (b) {
            return this.cl[n7 * 5 + 0];
        }
        if (b2) {
            return (this.pr[n7] != n2 && n7 + 1 < n4) ? this.cl[(n7 + 1) * 5 + 0] : this.cl[n7 * 5 + 0];
        }
        if (n8 != -1) {
            float n49;
            if (this.mq[n * 5 + 4] == n2) {
                n49 = 0.0f;
            }
            else if (n2 == this.sq[n8 + 4]) {
                n49 = 1.0f;
            }
            else {
                n49 = (n2 - this.mq[n * 5 + 4]) / (this.sq[n8 + 4] - this.mq[n * 5 + 4]);
            }
            float n50;
            if (this.sq[n8 + 5] != 0.0f) {
                n50 = n49;
            }
            else {
                final float[] array = { this.mq[n * 5 + 0] - n49, this.mq[n * 5 + 1], this.mq[n * 5 + 2], this.mq[n * 5 + 3] };
                final float[] array2 = new float[5];
                float n51;
                if (lu(array, 3, 0.0f, true, 1.0f, true, array2) == 1) {
                    n51 = array2[0];
                }
                else {
                    n51 = 0.0f;
                }
                n50 = n51 * (this.sq[n8 + 1] + (n51 * this.sq[n8 + 3] + this.sq[n8 + 2]) * n51) + this.sq[n8 + 0];
            }
            return n50;
        }
        final float n52 = n2 - this.mq[n * 5 + 4];
        return this.mq[n * 5 + 3] + n52 * (this.mq[n * 5 + 2] + (this.mq[n * 5 + 1] + n52 * this.mq[n * 5 + 0]) * n52);
    }
}
