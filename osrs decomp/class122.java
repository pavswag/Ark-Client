import java.net.UnknownHostException;
import java.io.IOException;
import java.net.Socket;

// 
// Decompiled by Procyon v0.5.36
// 

public class class122
{
    boolean field1186;
    float[][] field1197;
    float[][] field1187;
    final class425[] field1189;
    class425[] field1190;
    class425[] field1191;
    public class122 field1192;
    boolean field1193;
    class425 field1194;
    public final int field1195;
    class425 field1196;
    float[][] field1198;
    float[][] field1188;
    class425 field1199;
    public static final int ak = 20;
    
    public class122(final int n, final Buffer buffer, final boolean b) {
        this.field1199 = new class425();
        this.field1193 = true;
        this.field1194 = new class425();
        this.field1186 = true;
        this.field1196 = new class425();
        this.field1195 = buffer.readUnsignedByte((byte)(-75)) * -1987716595;
        this.field1189 = new class425[n];
        this.field1190 = new class425[this.field1189.length];
        this.field1191 = new class425[this.field1189.length];
        this.field1187 = new float[this.field1189.length][3];
        for (int i = 0; i < this.field1189.length; ++i) {
            this.field1189[i] = new class425(buffer, b);
            this.field1187[i][0] = Buffer.iu(buffer, 1017864129);
            this.field1187[i][1] = Buffer.iu(buffer, 466314277);
            this.field1187[i][2] = Buffer.iu(buffer, 2007960527);
        }
        xz(this, 685443179);
    }
    
    float[] bs(final int n) {
        return this.field1198[n];
    }
    
    float[] ba(final int n) {
        return this.field1188[n];
    }
    
    class425 ae(final int n) {
        if (this.field1191[n] == null) {
            (this.field1191[n] = new class425(this.method726(n, (byte)8))).method2259(-49766360);
        }
        return this.field1191[n];
    }
    
    void bb(final class425 class425) {
        this.field1199.method2252(class425, 2089708608);
        this.field1193 = true;
        this.field1186 = true;
    }
    
    float[] method734(final int n, final int n2) {
        try {
            return this.field1188[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.ay(" + ')');
        }
    }
    
    class425 ak(final int n) {
        if (this.field1190[n] == null) {
            this.field1190[n] = new class425(this.method727(n, (byte)0));
            if (this.field1192 != null) {
                this.field1190[n].method2255(this.field1192.method726(n, (byte)8), 1579602661);
            }
            else {
                this.field1190[n].method2255(class425.field3792, 1184866870);
            }
        }
        return this.field1190[n];
    }
    
    class425 av(final int n) {
        return this.field1189[n];
    }
    
    class425 be() {
        return this.field1199;
    }
    
    public float[] gf(final int n) {
        return wl(this, n, 689701217);
    }
    
    class425 as(final int n) {
        if (this.field1190[n] == null) {
            this.field1190[n] = new class425(this.method727(n, (byte)0));
            if (this.field1192 != null) {
                this.field1190[n].method2255(this.field1192.method726(n, (byte)8), 1435322956);
            }
            else {
                this.field1190[n].method2255(class425.field3792, 1699202608);
            }
        }
        return this.field1190[n];
    }
    
    public static float[] fh(final class122 class122, final int n, final int n2) {
        if (class122 == null) {
            class122.method731(n, n);
        }
        try {
            return class122.field1197[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.aa(" + ')');
        }
    }
    
    class425 az(final int n) {
        if (this.field1190[n] == null) {
            this.field1190[n] = new class425(this.method727(n, (byte)0));
            if (this.field1192 != null) {
                this.field1190[n].method2255(this.field1192.method726(n, (byte)8), 1162664282);
            }
            else {
                this.field1190[n].method2255(class425.field3792, 1558668685);
            }
        }
        return this.field1190[n];
    }
    
    float[] method731(final int n, final int n2) {
        try {
            return this.field1188[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.aa(" + ')');
        }
    }
    
    void bi(final class425 class425) {
        this.field1199.method2252(class425, 2123749342);
        this.field1193 = true;
        this.field1186 = true;
    }
    
    float[] bv(final int n) {
        return this.field1188[n];
    }
    
    class425 bo() {
        return this.field1199;
    }
    
    float[] bp(final int n) {
        return this.field1188[n];
    }
    
    float[] bc(final int n) {
        return this.field1188[n];
    }
    
    float[] br(final int n) {
        return this.field1198[n];
    }
    
    static final void method727(final int n, final int n2, final int n3, final int n4, final int n5) {
        try {
            for (int i = n2; i <= n2 + n4; ++i) {
                if (n5 == 2045439667) {
                    throw new IllegalStateException();
                }
                for (int j = n; j <= n3 + n; ++j) {
                    if (n5 == 2045439667) {
                        throw new IllegalStateException();
                    }
                    if (j >= 0 && j < 104) {
                        if (n5 == 2045439667) {
                            throw new IllegalStateException();
                        }
                        if (i >= 0 && i < 104) {
                            Client.gk.dw[0][j][i] = 127;
                            if (j == n) {
                                if (n5 == 2045439667) {
                                    throw new IllegalStateException();
                                }
                                if (j > 0) {
                                    if (n5 == 2045439667) {
                                        return;
                                    }
                                    Client.gk.kw[0][j][i] = Client.gk.kw[0][j - 1][i];
                                }
                            }
                            if (n + n3 == j) {
                                if (n5 == 2045439667) {
                                    throw new IllegalStateException();
                                }
                                if (j < 103) {
                                    if (n5 == 2045439667) {
                                        throw new IllegalStateException();
                                    }
                                    Client.gk.kw[0][j][i] = Client.gk.kw[0][j + 1][i];
                                }
                            }
                            if (i == n2) {
                                if (n5 == 2045439667) {
                                    throw new IllegalStateException();
                                }
                                if (i > 0) {
                                    if (n5 == 2045439667) {
                                        throw new IllegalStateException();
                                    }
                                    Client.gk.kw[0][j][i] = Client.gk.kw[0][j][i - 1];
                                }
                            }
                            if (i == n2 + n4) {
                                if (n5 == 2045439667) {
                                    throw new IllegalStateException();
                                }
                                if (i < 103) {
                                    if (n5 == 2045439667) {
                                        return;
                                    }
                                    Client.gk.kw[0][j][i] = Client.gk.kw[0][j][1 + i];
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.aw(" + ')');
        }
    }
    
    class425 method727(final int n, final byte b) {
        try {
            return this.field1189[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.an(" + ')');
        }
    }
    
    class425 am(final int n) {
        return this.field1189[n];
    }
    
    public class425 method728(final int n, final int n2) {
        try {
            if (this.field1186) {
                this.field1196.method2252(this.method732(n, 2116559151), 1829163387);
                this.field1196.method2255(bk(this, (byte)2), 1290444179);
                this.field1186 = false;
            }
            return this.field1196;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.al(" + ')');
        }
    }
    
    class425 method726(final int n, final byte b) {
        try {
            if (this.field1190[n] == null) {
                this.field1190[n] = new class425(this.method727(n, (byte)0));
                if (this.field1192 != null) {
                    if (b != 8) {
                        throw new IllegalStateException();
                    }
                    this.field1190[n].method2255(this.field1192.method726(n, (byte)8), 1396004011);
                }
                else {
                    this.field1190[n].method2255(class425.field3792, 1996237100);
                }
            }
            return this.field1190[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.aw(" + ')');
        }
    }
    
    class425 method732(final int n, final int n2) {
        try {
            if (this.field1191[n] == null) {
                if (n2 <= -258593861) {
                    throw new IllegalStateException();
                }
                (this.field1191[n] = new class425(this.method726(n, (byte)8))).method2259(-49766360);
            }
            return this.field1191[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.ac(" + ')');
        }
    }
    
    float[] bq(final int n) {
        return this.field1197[n];
    }
    
    public static void dk(final class122 class122) {
        class122.field1198 = new float[class122.field1189.length][3];
        class122.field1197 = new float[class122.field1189.length][3];
        class122.field1188 = new float[class122.field1189.length][3];
        class425 class123;
        synchronized (class425.field3793) {
            if (0 == class425.field3794 * -910698341) {
                class123 = new class425();
            }
            else {
                class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-55));
                class123 = class425.field3793[class425.field3794 * -910698341];
            }
        }
        final class425 class124 = class123;
        for (int i = 0; i < class122.field1189.length; ++i) {
            final class425 method727 = class122.method727(i, (byte)0);
            class124.method2252(method727, 1944105306);
            class124.method2259(-49766360);
            class122.field1198[i] = class425.sn(class124, 983485416);
            class122.field1197[i][0] = method727.et;
            class122.field1197[i][1] = method727.vy;
            class122.field1197[i][2] = method727.as;
            class122.field1188[i] = method727.method2261(-1876607413);
        }
        class124.method2249(1198141071);
    }
    
    public float[] fa(final int n) {
        return this.method734(n, -2141341986);
    }
    
    public static class425 ot(final class122 class122, final int n) {
        if (class122 == null) {
            return class122.method729(n);
        }
        if (class122.field1191[n] == null) {
            (class122.field1191[n] = new class425(class122.method726(n, (byte)8))).method2259(-49766360);
        }
        return class122.field1191[n];
    }
    
    void method733(final class425 class425, final int n) {
        try {
            this.field1199.method2252(class425, 2092815731);
            this.field1193 = true;
            this.field1186 = true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.au(" + ')');
        }
    }
    
    float[] method730(final int n, final int n2) {
        try {
            return this.field1198[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.at(" + ')');
        }
    }
    
    static final void method737(final int n) {
        try {
            if (!ViewportMouse.ViewportMouse_false0) {
                final int scene_cameraPitchSine = Scene.Scene_cameraPitchSine;
                final int scene_cameraPitchCosine = Scene.Scene_cameraPitchCosine;
                final int scene_cameraYawSine = Scene.Scene_cameraYawSine;
                final int scene_cameraYawCosine = Scene.Scene_cameraYawCosine;
                final int n2 = 50;
                final int n3 = 3500;
                final int n4 = (2139535413 * ViewportMouse.ViewportMouse_x - TaskHandler.getClipMidX(-1222275683)) * n2 / UserComparator7.get3dZoom(337497352);
                final int n5 = (148198745 * ViewportMouse.ViewportMouse_y - class12.getClipMidY(-1074701096)) * n2 / UserComparator7.get3dZoom(-2136440610);
                final int n6 = (2139535413 * ViewportMouse.ViewportMouse_x - TaskHandler.getClipMidX(-1889737509)) * n3 / UserComparator7.get3dZoom(860263236);
                final int n7 = (ViewportMouse.ViewportMouse_y * 148198745 - class12.getClipMidY(-262347789)) * n3 / UserComparator7.get3dZoom(642408317);
                final int n8 = scene_cameraPitchCosine * n5 + scene_cameraPitchSine * n2 >> 16;
                final int n9 = scene_cameraPitchCosine * n2 - scene_cameraPitchSine * n5 >> 16;
                final int n10 = n8;
                final int n11 = n3 * scene_cameraPitchSine + scene_cameraPitchCosine * n7 >> 16;
                final int n12 = scene_cameraPitchCosine * n3 - n7 * scene_cameraPitchSine >> 16;
                final int n13 = n11;
                final int method2093 = class387.method2093(n4, n9, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-59));
                final int method2094 = class437.method2295(n4, n9, scene_cameraYawCosine, scene_cameraYawSine, (byte)34);
                final int n14 = method2093;
                final int method2095 = class387.method2093(n6, n12, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-40));
                final int method2096 = class437.method2295(n6, n12, scene_cameraYawCosine, scene_cameraYawSine, (byte)(-28));
                final int n15 = method2095;
                ViewportMouse.field2207 = -1666864639 * ((n14 + n15) / 2);
                class294.field2715 = -158275257 * ((n10 + n13) / 2);
                ViewportMouse.field2208 = -393366251 * ((method2096 + method2094) / 2);
                ViewportMouse.field2209 = (n15 - n14) / 2 * 1520532401;
                UserComparator8.field1157 = 101851969 * ((n13 - n10) / 2);
                ReflectionCheck.field166 = (method2096 - method2094) / 2 * 1785143657;
                EnumComposition.field1536 = Math.abs(ViewportMouse.field2209 * 1677061457) * 1650720741;
                ViewportMouse.field2211 = Math.abs(-864785215 * UserComparator8.field1157) * 1274213335;
                class9.field29 = Math.abs(-2085912871 * ReflectionCheck.field166) * 1268910509;
                return;
            }
            if (n >= -414392398) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.ai(" + ')');
        }
    }
    
    public static void ki(final class122 class122) {
        class122.field1198 = new float[class122.field1189.length][3];
        class122.field1197 = new float[class122.field1189.length][3];
        class122.field1188 = new float[class122.field1189.length][3];
        class425 class123;
        synchronized (class425.field3793) {
            if (0 == class425.field3794 * -910698341) {
                class123 = new class425();
            }
            else {
                class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-83));
                class123 = class425.field3793[class425.field3794 * -910698341];
            }
        }
        final class425 class124 = class123;
        for (int i = 0; i < class122.field1189.length; ++i) {
            final class425 method727 = class122.method727(i, (byte)0);
            class124.method2252(method727, 1809915307);
            class124.method2259(-49766360);
            class122.field1198[i] = class425.sn(class124, 1796143368);
            class122.field1197[i][0] = method727.et;
            class122.field1197[i][1] = method727.vy;
            class122.field1197[i][2] = method727.as;
            class122.field1188[i] = method727.method2261(-2009710332);
        }
        class124.method2249(1198141071);
    }
    
    public static Socket ki(final class15 class15, final String s, final int n) throws IOException, UnknownHostException {
        if (class15 == null) {
            class15.aq();
        }
        return null;
    }
    
    class425 by(final int n) {
        if (this.field1191[n] == null) {
            (this.field1191[n] = new class425(this.method726(n, (byte)8))).method2259(-49766360);
        }
        return this.field1191[n];
    }
    
    class425 bx() {
        return this.field1199;
    }
    
    class425 ar(final int n) {
        return this.field1189[n];
    }
    
    public class425 bd(final int n) {
        if (this.field1186) {
            this.field1196.method2252(this.method732(n, 1211179459), 1624520625);
            this.field1196.method2255(bk(this, (byte)2), 1167589682);
            this.field1186 = false;
        }
        return this.field1196;
    }
    
    public static class381 er(final class379 class379, final int index) {
        if (class379 == null) {
            class379.method2027(index, index);
        }
        return class379.field3619.get(index);
    }
    
    public void il(final class425 class425) {
        this.method733(class425, -2093338496);
    }
    
    public static void eu(final class166 class166, final class437 class167, final UrlRequester urlRequester) {
        if (class166 == null) {
            class166.ap(urlRequester);
        }
        JSONObject jsonObject;
        try {
            jsonObject = class437.hj(class167, -288365426).getJSONObject("message");
        }
        catch (Exception ex) {
            class166.sg(class166, 1932988150);
            class166.field1419 = 440772802;
            return;
        }
        try {
            class166.method934(jsonObject.getJSONArray("images"), urlRequester, 2041464667);
        }
        catch (Exception ex2) {
            class166.field1424.clear();
        }
        try {
            class166.method935(jsonObject.getJSONArray("labels"), (byte)3);
        }
        catch (Exception ex3) {
            class166.field1425.clear();
        }
        try {
            class166.method936(jsonObject.getJSONObject("behaviour"), -28927295);
        }
        catch (Exception ex4) {
            class166.field1420 = null;
            class166.field1422[0] = 0.0f;
            class166.field1422[1] = 0.0f;
            class166.field1422[2] = 1.0f;
            class166.field1422[3] = 1.0f;
            class166.field1423.clear();
        }
        try {
            class166.method941(jsonObject.getJSONObject("meta"), 891662681);
        }
        catch (Exception ex5) {
            class166.field1426.clear();
            class166.field1417.clear();
        }
    }
    
    public static HitSplatDefinition method725(final int n, final byte b) {
        try {
            final HitSplatDefinition hitSplatDefinition = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.wr(n);
            if (hitSplatDefinition == null) {
                final byte[] takeFile = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, n, (byte)(-49));
                final HitSplatDefinition hitSplatDefinition2 = new HitSplatDefinition();
                if (takeFile != null) {
                    if (b != 4) {
                        throw new IllegalStateException();
                    }
                    hitSplatDefinition2.decode(new Buffer(takeFile), 1967654150);
                }
                HitSplatDefinition.HitSplatDefinition_cached.put(hitSplatDefinition2, n);
                return hitSplatDefinition2;
            }
            if (b != 4) {
                throw new IllegalStateException();
            }
            return hitSplatDefinition;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.af(" + ')');
        }
    }
    
    void method725(final int n) {
        try {
            this.field1188 = new float[this.field1189.length][3];
            this.field1187 = new float[this.field1189.length][3];
            this.field1197 = new float[this.field1189.length][3];
            class425 class425;
            synchronized (class425.field3793) {
                if (0 == class425.field3794 * -910698341) {
                    class425 = new class425();
                }
                else {
                    class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-120));
                    class425 = class425.field3793[class425.field3794 * -910698341];
                }
            }
            final class425 class426 = class425;
            for (int i = 0; i < this.field1189.length; ++i) {
                if (n != 685443179) {
                    throw new IllegalStateException();
                }
                final class425 method726 = this.method726(i, (byte)0);
                class426.method2252(method726, 1919850341);
                class426.method2251(-49766360);
                this.field1198[i] = class425.sn(class426, -869294518);
                this.field1187[i][0] = method726.et;
                this.field1187[i][1] = method726.yo;
                this.field1197[i][2] = method726.es;
                this.field1188[i] = method726.method2261(-1193193638);
            }
            class426.method2251(1198141071);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.af(" + ')');
        }
    }
    
    float[] bn(final int n) {
        return this.field1198[n];
    }
    
    public static class425 gu(final class122 class122) {
        if (class122.field1193) {
            class122.field1194.method2252(class122.method729(376832033), 1553920437);
            if (class122.field1192 != null) {
                class122.field1194.method2255(bk(class122.field1192, (byte)2), 2136013565);
            }
            class122.field1193 = false;
        }
        return class122.field1194;
    }
    
    class425 method729(final int n) {
        try {
            return this.field1199;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.ab(" + ')');
        }
    }
    
    class425 method735(final byte b) {
        try {
            if (this.field1186) {
                if (b != 2) {
                    throw new IllegalStateException();
                }
                this.field1199.method2252(this.ak(535482001), 1842204492);
                if (this.field1192 != null) {
                    if (b != 2) {
                        throw new IllegalStateException();
                    }
                    this.field1194.method2252(bk(this.field1192, (byte)2), 1947079637);
                }
                this.field1193 = false;
            }
            return this.field1194;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.aq(" + ')');
        }
    }
    
    class425 aj(final int n) {
        if (this.field1190[n] == null) {
            this.field1190[n] = new class425(this.method727(n, (byte)0));
            if (this.field1192 != null) {
                this.field1190[n].method2255(this.field1192.method726(n, (byte)8), 1783861666);
            }
            else {
                this.field1190[n].method2255(class425.field3792, 1450220242);
            }
        }
        return this.field1190[n];
    }
    
    void ag() {
        this.field1198 = new float[this.field1189.length][3];
        this.field1197 = new float[this.field1189.length][3];
        this.field1188 = new float[this.field1189.length][3];
        class425 class425;
        synchronized (class425.field3793) {
            if (0 == class425.field3794 * -910698341) {
                class425 = new class425();
            }
            else {
                class425.field3793[(class425.field3794 -= 718430632) * -910698341].method2250((byte)(-123));
                class425 = class425.field3793[class425.field3794 * -910698341];
            }
        }
        final class425 class426 = class425;
        for (int i = 0; i < this.field1189.length; ++i) {
            final class425 method727 = this.method727(i, (byte)0);
            class426.method2252(method727, 1668521832);
            class426.method2259(-49766360);
            this.field1198[i] = class425.sn(class426, -408909175);
            this.field1197[i][0] = method727.et;
            this.field1197[i][1] = method727.vy;
            this.field1197[i][2] = method727.as;
            this.field1188[i] = method727.method2261(-1089038767);
        }
        class426.method2249(1198141071);
    }
    
    float[] bl(final int n) {
        return this.field1188[n];
    }
    
    public static void ew(final class122 class122) {
        class122.field1198 = new float[class122.field1189.length][3];
        class122.field1197 = new float[class122.field1189.length][3];
        class122.field1188 = new float[class122.field1189.length][3];
        class425 class123;
        synchronized (class425.field3793) {
            if (0 == class425.field3794 * -910698341) {
                class123 = new class425();
            }
            else {
                class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-66));
                class123 = class425.field3793[class425.field3794 * -910698341];
            }
        }
        final class425 class124 = class123;
        for (int i = 0; i < class122.field1189.length; ++i) {
            final class425 method727 = class122.method727(i, (byte)0);
            class124.method2252(method727, 1825752856);
            class124.method2259(-49766360);
            class122.field1198[i] = class425.sn(class124, 728080494);
            class122.field1197[i][0] = method727.et;
            class122.field1197[i][1] = method727.vy;
            class122.field1197[i][2] = method727.as;
            class122.field1188[i] = method727.method2261(-885110135);
        }
        class124.method2249(1198141071);
    }
    
    public class425 bj(final int n) {
        if (this.field1186) {
            this.field1196.method2252(this.method732(n, 2064857698), 1792772787);
            this.field1196.method2255(bk(this, (byte)2), 1813412779);
            this.field1186 = false;
        }
        return this.field1196;
    }
    
    public static float[] wl(final class122 class122, final int n, final int n2) {
        if (class122 == null) {
            class122.method730(n, n);
        }
        try {
            return class122.field1198[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.at(" + ')');
        }
    }
    
    public static void xz(final class122 class122, final int n) {
        if (class122 == null) {
            class122.method725(n);
            return;
        }
        try {
            class122.field1198 = new float[class122.field1189.length][3];
            class122.field1197 = new float[class122.field1189.length][3];
            class122.field1188 = new float[class122.field1189.length][3];
            class425 class123;
            synchronized (class425.field3793) {
                if (0 == class425.field3794 * -910698341) {
                    class123 = new class425();
                }
                else {
                    class425.field3793[(class425.field3794 += 564638317) * -910698341].method2250((byte)(-120));
                    class123 = class425.field3793[class425.field3794 * -910698341];
                }
            }
            final class425 class124 = class123;
            for (int i = 0; i < class122.field1189.length; ++i) {
                if (n != 685443179) {
                    throw new IllegalStateException();
                }
                final class425 method727 = class122.method727(i, (byte)0);
                class124.method2252(method727, 1919850341);
                class124.method2259(-49766360);
                class122.field1198[i] = class425.sn(class124, -869294518);
                class122.field1197[i][0] = method727.et;
                class122.field1197[i][1] = method727.vy;
                class122.field1197[i][2] = method727.as;
                class122.field1188[i] = method727.method2261(-1193193638);
            }
            class124.method2249(1198141071);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.af(" + ')');
        }
    }
    
    class425 bm() {
        if (this.field1193) {
            this.field1194.method2252(this.method729(1097734684), 1679034636);
            if (this.field1192 != null) {
                this.field1194.method2255(bk(this.field1192, (byte)2), 1657217110);
            }
            this.field1193 = false;
        }
        return this.field1194;
    }
    
    class425 bk() {
        return this.field1199;
    }
    
    public static class425 bk(final class122 class122, final byte b) {
        if (class122 == null) {
            class122.method735(b);
        }
        try {
            if (class122.field1193) {
                if (b != 2) {
                    throw new IllegalStateException();
                }
                class122.field1194.method2252(class122.method729(535482001), 1842204492);
                if (class122.field1192 != null) {
                    if (b != 2) {
                        throw new IllegalStateException();
                    }
                    class122.field1194.method2255(bk(class122.field1192, (byte)2), 1947079637);
                }
                class122.field1193 = false;
            }
            return class122.field1194;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ew.aq(" + ')');
        }
    }
    
    public float[] qd(final int n) {
        return fh(this, n, 2097133235);
    }
    
    public static class425 ey(final class122 class122, final int n) {
        if (class122 == null) {
            class122.bq(n);
        }
        if (class122.field1191[n] == null) {
            (class122.field1191[n] = new class425(class122.method726(n, (byte)8))).method2259(-49766360);
        }
        return class122.field1191[n];
    }
    
    float[] bf(final int n) {
        return this.field1197[n];
    }
    
    float[] bu(final int n) {
        return this.field1197[n];
    }
}
