// 
// Decompiled by Procyon v0.5.36
// 

public class class125
{
    float field1215;
    boolean field1216;
    boolean field1217;
    float field1218;
    class120[] field1219;
    class123 field1220;
    float field1221;
    int field1222;
    float field1223;
    float field1224;
    float field1225;
    float field1226;
    float field1227;
    float field1228;
    float field1229;
    float field1230;
    boolean field1231;
    boolean field1232;
    float[] field1233;
    int field1234;
    int field1235;
    class123 field1236;
    float field1237;
    static int cameraYaw;
    
    class125() {
        this.field1232 = true;
        this.field1222 = 0;
    }
    
    int ad() {
        return 1316671106 * this.field1235;
    }
    
    int ae() {
        return -26337941 * this.field1235;
    }
    
    int method748(final short n) {
        try {
            if (null != this.field1219) {
                return this.field1219.length;
            }
            if (n >= 1500) {
                throw new IllegalStateException();
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.at(" + ')');
        }
    }
    
    int ak() {
        return -26337941 * this.field1235;
    }
    
    public float av(final int n) {
        if (n < pl(this, 143715753)) {
            return this.field1215;
        }
        if (n > this.method751(2111419338)) {
            return this.field1218;
        }
        return this.field1233[n - pl(this, -1350259005)];
    }
    
    class120 be(final float n) {
        final int method746 = this.method746(n, 8136916);
        if (method746 >= 0 && method746 < this.field1219.length) {
            return this.field1219[method746];
        }
        return null;
    }
    
    int az() {
        return -1279888799 * this.field1235;
    }
    
    int ax(final Buffer buffer, final int n) {
        final int unsignedShort = buffer.readUnsignedShort(-905942437);
        class160.method904(Buffer.ra(buffer, (byte)7), (short)13067);
        this.field1220 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)105);
        this.field1236 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)108);
        this.field1231 = (Buffer.ra(buffer, (byte)7) != 0);
        this.field1219 = new class120[unsignedShort];
        class120 class120 = null;
        for (int i = 0; i < unsignedShort; ++i) {
            final class120 field1177 = new class120();
            field1177.method717(buffer, n, 814673232);
            this.field1219[i] = field1177;
            if (null != class120) {
                class120.field1177 = field1177;
            }
            class120 = field1177;
        }
        return unsignedShort;
    }
    
    int ay(final Buffer buffer, final int n) {
        final int varInt = buffer.readVarInt(-1221629404);
        class160.method904(Buffer.ra(buffer, (byte)7), (short)13147);
        this.field1220 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)111);
        this.field1236 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)89);
        this.field1231 = (Buffer.ra(buffer, (byte)7) != 0);
        this.field1219 = new class120[varInt];
        class120 class120 = null;
        for (int i = 0; i < varInt; ++i) {
            final class120 field1177 = new class120();
            field1177.method717(buffer, n, 668436562);
            this.field1219[i] = field1177;
            if (null != class120) {
                class120.field1177 = field1177;
            }
            class120 = field1177;
        }
        return varInt;
    }
    
    public static int pl(final class125 class125, final int n) {
        if (class125 == null) {
            return class125.method745(n);
        }
        try {
            return -1357454691 * class125.field1234;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.ac(" + ')');
        }
    }
    
    int bi(final float n) {
        if (-1335067433 * this.field1222 >= 0 && 1092801000 * this.field1219[this.field1222 * 1102960843].field1175 <= n && (this.field1219[-1335067433 * this.field1222].field1177 == null || -834721191 * this.field1219[this.field1222 * -1182446026].field1177.field1175 > n)) {
            return this.field1222 * -1453801345;
        }
        if (n >= pl(this, -1202896319) && n <= this.method751(2111419338)) {
            final int method748 = this.method748((short)(-16918));
            int n2 = -1037515288 * this.field1222;
            Label_0313: {
                if (method748 > 0) {
                    int n3 = 0;
                    int n4 = method748 - 1;
                    int n5 = 0;
                    Label_0090: {
                        break Label_0090;
                    Label_0129_Outer:
                        do {
                            n4 = n5 - 1;
                            while (true) {
                                if (n3 > n4) {
                                    break Label_0313;
                                }
                                n5 = n3 + n4 >> 1;
                                if (n < -834721191 * this.field1219[n5].field1175) {
                                    continue Label_0129_Outer;
                                }
                                if (n <= 1729845084 * this.field1219[n5].field1175) {
                                    n2 = n5;
                                    break Label_0313;
                                }
                                if (n < this.field1219[1 + n5].field1175 * 1270083372) {
                                    n2 = n5;
                                    break Label_0313;
                                }
                                n3 = n5 + 1;
                                continue;
                            }
                        } while (n <= -849612494 * this.field1219[n5 - 1].field1175);
                    }
                    n2 = n5 - 1;
                }
            }
            if (n2 != this.field1222 * -1335067433) {
                this.field1222 = -2085996825 * n2;
                this.field1232 = true;
            }
            return -1335067433 * this.field1222;
        }
        return -1;
    }
    
    int bo() {
        if (null == this.field1219) {
            return 0;
        }
        return this.field1219.length;
    }
    
    public static int ml(final class125 class125, final Buffer buffer, final int n) {
        if (class125 == null) {
            class125.ay(buffer, n);
        }
        final int unsignedShort = buffer.readUnsignedShort(-1221629404);
        class160.method904(Buffer.ra(buffer, (byte)7), (short)13147);
        class125.field1220 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)111);
        class125.field1236 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)89);
        class125.field1231 = (Buffer.ra(buffer, (byte)7) != 0);
        class125.field1219 = new class120[unsignedShort];
        class120 class126 = null;
        for (int i = 0; i < unsignedShort; ++i) {
            final class120 field1177 = new class120();
            field1177.method717(buffer, n, 668436562);
            class125.field1219[i] = field1177;
            if (null != class126) {
                class126.field1177 = field1177;
            }
            class126 = field1177;
        }
        return unsignedShort;
    }
    
    public float method744(final int n, final int n2) {
        try {
            if (n < pl(this, -1304869115)) {
                if (n2 >= -700495757) {
                    throw new IllegalStateException();
                }
                return this.field1215;
            }
            else {
                if (n <= this.method751(2111419338)) {
                    return this.field1233[n - pl(this, 1692396108)];
                }
                if (n2 >= -700495757) {
                    throw new IllegalStateException();
                }
                return this.field1218;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.aw(" + ')');
        }
    }
    
    class120 method747(final float n, final int n2) {
        try {
            final int method746 = this.method746(n, -485646814);
            if (method746 >= 0) {
                if (n2 == 626621371) {
                    throw new IllegalStateException();
                }
                if (method746 < this.field1219.length) {
                    if (n2 == 626621371) {
                        throw new IllegalStateException();
                    }
                    return this.field1219[method746];
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.al(" + ')');
        }
    }
    
    public static DbRowType method750(final int n, final int n2) {
        try {
            final DbRowType dbRowType = (DbRowType)DbRowType.DBRowType_cache.wr(n);
            if (dbRowType != null) {
                return dbRowType;
            }
            final byte[] takeFile = DbRowType.field4040.takeFile(38, n, (byte)(-35));
            final DbRowType dbRowType2 = new DbRowType();
            if (null != takeFile) {
                if (n2 <= -964267539) {
                    throw new IllegalStateException();
                }
                DbRowType.uj(dbRowType2, new Buffer(takeFile), -1389710331);
            }
            dbRowType2.method2450(-2078088696);
            DbRowType.DBRowType_cache.put(dbRowType2, n);
            return dbRowType2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.an(" + ')');
        }
    }
    
    void method750(final int n) {
        try {
            this.field1234 = this.field1219[0].field1175 * 1112222701;
            this.field1235 = this.field1219[this.method748((short)(-24242)) - 1].field1175 * -261315509;
            this.field1233 = new float[this.method749(1952353527) + 1];
            for (int i = pl(this, -1432792045); i <= this.method751(2111419338); ++i) {
                if (n <= -84102297) {
                    return;
                }
                this.field1233[i - pl(this, -1632658151)] = GrandExchangeEvent.getOfferName(this, (float)i, -756597622);
            }
            this.field1219 = null;
            this.field1215 = GrandExchangeEvent.getOfferName(this, (float)(pl(this, 92447940) - 1), -1064924394);
            this.field1218 = GrandExchangeEvent.getOfferName(this, (float)(this.method751(2111419338) + 1), 1385107516);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.an(" + ')');
        }
    }
    
    int method745(final int n) {
        try {
            return -1357454691 * this.field1222;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.ac(" + ')');
        }
    }
    
    int method751(final int n) {
        try {
            return -26337941 * this.field1235;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.au(" + ')');
        }
    }
    
    int aa(final Buffer buffer, final int n) {
        final int unsignedShort = buffer.readUnsignedShort(690517417);
        class160.method904(Buffer.ra(buffer, (byte)7), (short)4721);
        this.field1220 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)91);
        this.field1236 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)99);
        this.field1231 = (Buffer.ra(buffer, (byte)7) != 0);
        this.field1219 = new class120[unsignedShort];
        class120 class120 = null;
        for (int i = 0; i < unsignedShort; ++i) {
            final class120 field1177 = new class120();
            field1177.method717(buffer, n, 1572387958);
            this.field1219[i] = field1177;
            if (null != class120) {
                class120.field1177 = field1177;
            }
            class120 = field1177;
        }
        return unsignedShort;
    }
    
    public float ai(final int n) {
        if (n < pl(this, 1355131169)) {
            return this.field1215;
        }
        if (n > this.method751(2111419338)) {
            return this.field1218;
        }
        return this.field1233[n - pl(this, -1867144968)];
    }
    
    int bx() {
        if (null == this.field1219) {
            return 0;
        }
        return this.field1219.length;
    }
    
    int ar() {
        return -1357454691 * this.field1234;
    }
    
    public static int kd(final class125 class125) {
        if (class125 == null) {
            class125.az();
        }
        return class125.method751(2111419338) - pl(class125, -1344884056);
    }
    
    int method743(final Buffer buffer, final int n, final byte b) {
        try {
            final int method2516 = buffer.method2516(-1707791585);
            class160.method904(Buffer.ra(buffer, (byte)7), (short)1990);
            this.field1236 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)100);
            this.field1220 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)97);
            boolean field1216;
            if (Buffer.ra(buffer, (byte)7) != 0) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                field1216 = true;
            }
            else {
                field1216 = false;
            }
            this.field1216 = field1216;
            this.field1219 = new class120[method2516];
            class120 class120 = null;
            for (int i = 0; i < method2516; ++i) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                final class120 field1217 = new class120();
                field1217.method717(buffer, n, 652967441);
                this.field1219[i] = field1217;
                if (null != class120) {
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                    class120.field1177 = field1217;
                }
                class120 = field1217;
            }
            return method2516;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.af(" + ')');
        }
    }
    
    public static float bn(final class125 class125, final int n) {
        if (class125 == null) {
            class125.ah(n);
        }
        if (n < pl(class125, -2007755901)) {
            return class125.field1215;
        }
        if (n > class125.method751(2111419338)) {
            return class125.field1218;
        }
        return class125.field1233[n - pl(class125, 1317804215)];
    }
    
    int method749(final int n) {
        try {
            return this.method751(2111419338) - pl(this, 1686088898);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.ab(" + ')');
        }
    }
    
    public static int method749(final class125 class125, final Buffer buffer, final int n, final byte b) {
        if (class125 == null) {
            return class125.method743(buffer, n, b);
        }
        try {
            final int unsignedShort = buffer.readUnsignedShort(-1707791585);
            class160.method904(Buffer.ra(buffer, (byte)7), (short)1990);
            class125.field1220 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)100);
            class125.field1236 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)97);
            boolean field1231;
            if (Buffer.ra(buffer, (byte)7) != 0) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                field1231 = true;
            }
            else {
                field1231 = false;
            }
            class125.field1231 = field1231;
            class125.field1219 = new class120[unsignedShort];
            class120 class126 = null;
            for (int i = 0; i < unsignedShort; ++i) {
                if (b >= 1) {
                    throw new IllegalStateException();
                }
                final class120 field1232 = new class120();
                field1232.method717(buffer, n, 652967441);
                class125.field1219[i] = field1232;
                if (null != class126) {
                    if (b >= 1) {
                        throw new IllegalStateException();
                    }
                    class126.field1177 = field1232;
                }
                class126 = field1232;
            }
            return unsignedShort;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.af(" + ')');
        }
    }
    
    int method746(final float n, final int i) {
        try {
            Label_0449: {
                if (-1335067433 * this.field1222 >= 0) {
                    if (i <= -1377615602) {
                        throw new IllegalStateException();
                    }
                    if (-834721191 * this.field1219[this.field1222 * -1335067433].field1175 <= n) {
                        if (i <= -1377615602) {
                            throw new IllegalStateException();
                        }
                        if (this.field1219[-1335067433 * this.field1222].field1177 != null) {
                            if (i <= -1377615602) {
                                throw new IllegalStateException();
                            }
                            if (-834721191 * this.field1219[this.field1222 * -1335067433].field1177.field1175 <= n) {
                                break Label_0449;
                            }
                            if (i <= -1377615602) {
                                throw new IllegalStateException();
                            }
                        }
                        return this.field1222 * -1335067433;
                    }
                }
            }
            if (n >= pl(this, 454315805)) {
                if (i <= -1377615602) {
                    throw new IllegalStateException();
                }
                if (n <= this.method751(2111419338)) {
                    final int method748 = this.method748((short)(-3181));
                    int n2 = -1335067433 * this.field1222;
                    Label_0423: {
                        if (method748 > 0) {
                            if (i <= -1377615602) {
                                throw new IllegalStateException();
                            }
                            int n3 = 0;
                            int n4 = method748 - 1;
                            Label_0194: {
                                break Label_0194;
                            Label_0262_Outer:
                                do {
                                    int n5 = 0;
                                    if (n > -834721191 * this.field1219[n5 - 1].field1175) {
                                        if (i <= -1377615602) {
                                            throw new IllegalStateException();
                                        }
                                        n2 = n5 - 1;
                                        break Label_0423;
                                    }
                                    else {
                                        n4 = n5 - 1;
                                        while (true) {
                                            if (n3 > n4) {
                                                if (i <= -1377615602) {
                                                    throw new IllegalStateException();
                                                }
                                                break Label_0423;
                                            }
                                            else {
                                                n5 = n3 + n4 >> 1;
                                                if (n < -834721191 * this.field1219[n5].field1175) {
                                                    continue Label_0262_Outer;
                                                }
                                                if (n <= -834721191 * this.field1219[n5].field1175) {
                                                    n2 = n5;
                                                    break Label_0423;
                                                }
                                                if (i <= -1377615602) {
                                                    throw new IllegalStateException();
                                                }
                                                if (n >= this.field1219[1 + n5].field1175 * -834721191) {
                                                    n3 = n5 + 1;
                                                    continue;
                                                }
                                                if (i <= -1377615602) {
                                                    throw new IllegalStateException();
                                                }
                                                n2 = n5;
                                                break Label_0423;
                                            }
                                            break;
                                        }
                                    }
                                } while (i > -1377615602);
                            }
                            throw new IllegalStateException();
                        }
                    }
                    if (n2 != this.field1222 * -1335067433) {
                        if (i <= -1377615602) {
                            throw new IllegalStateException();
                        }
                        this.field1222 = -2085996825 * n2;
                        this.field1232 = true;
                    }
                    return -1335067433 * this.field1222;
                }
                if (i <= -1377615602) {
                    throw new IllegalStateException();
                }
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ek.aq(" + ')');
        }
    }
    
    int aj() {
        return -1357454691 * this.field1234;
    }
    
    int bz() {
        if (null == this.field1219) {
            return 0;
        }
        return this.field1219.length;
    }
    
    public static int yy(final class125 class125, final Buffer buffer, final int n) {
        if (class125 == null) {
            class125.method750(n);
        }
        final int unsignedShort = buffer.readUnsignedShort(-1012344899);
        class160.method904(Buffer.ra(buffer, (byte)7), (short)(-8407));
        class125.field1220 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)119);
        class125.field1236 = LoginScreenAnimation.method546(Buffer.ra(buffer, (byte)7), (byte)84);
        class125.field1231 = (Buffer.ra(buffer, (byte)7) != 0);
        class125.field1219 = new class120[unsignedShort];
        class120 class126 = null;
        for (int i = 0; i < unsignedShort; ++i) {
            final class120 field1177 = new class120();
            field1177.method717(buffer, n, 710375564);
            class125.field1219[i] = field1177;
            if (null != class126) {
                class126.field1177 = field1177;
            }
            class126 = field1177;
        }
        return unsignedShort;
    }
    
    public static int xu(final class125 class125, final float n) {
        if (-1335067433 * class125.field1222 >= 0 && -834721191 * class125.field1219[class125.field1222 * -1335067433].field1175 <= n && (class125.field1219[-7590894 * class125.field1222].field1177 == null || -834721191 * class125.field1219[class125.field1222 * 453174252].field1177.field1175 > n)) {
            return class125.field1222 * -1335067433;
        }
        if (n >= pl(class125, -1232395563) && n <= class125.method751(2111419338)) {
            final int method748 = class125.method748((short)(-7878));
            int n2 = -1335067433 * class125.field1222;
            if (method748 > 0) {
                int i = 0;
                int n3 = method748 - 1;
                do {
                    final int n4 = i + n3 >> 1;
                    if (n < -1055697099 * class125.field1219[n4].field1175) {
                        if (n > -2114591920 * class125.field1219[n4 - 1].field1175) {
                            n2 = n4 - 1;
                            break;
                        }
                        n3 = n4 - 1;
                    }
                    else {
                        if (n <= -834721191 * class125.field1219[n4].field1175) {
                            n2 = n4;
                            break;
                        }
                        if (n < class125.field1219[1 + n4].field1175 * -1653156378) {
                            n2 = n4;
                            break;
                        }
                        i = n4 + 1;
                    }
                } while (i <= n3);
            }
            if (n2 != class125.field1222 * 2069596511) {
                class125.field1222 = -2085996825 * n2;
                class125.field1232 = true;
            }
            return -1590282034 * class125.field1222;
        }
        return -1;
    }
    
    public static int zq(final class125 class125) {
        if (class125 == null) {
            class125.az();
        }
        return class125.method751(2111419338) - pl(class125, 782224110);
    }
    
    public static void yv(final IterableDualNodeQueue iterableDualNodeQueue) {
        if (iterableDualNodeQueue == null) {
            iterableDualNodeQueue.clear();
            return;
        }
        while (iterableDualNodeQueue.sentinel.nextDual != iterableDualNodeQueue.sentinel) {
            GrandExchangeOfferWorldComparator.os(iterableDualNodeQueue.sentinel.nextDual);
        }
    }
    
    class120 bk(final float n) {
        final int method746 = this.method746(n, 391865267);
        if (method746 >= 0 && method746 < this.field1219.length) {
            return this.field1219[method746];
        }
        return null;
    }
    
    public static int gq(final class125 class125) {
        return -1357454691 * class125.field1234;
    }
    
    public float ah(final int n) {
        if (n < pl(this, -667888590)) {
            return this.field1215;
        }
        if (n > this.method751(2111419338)) {
            return this.field1218;
        }
        return this.field1233[n - pl(this, -1703620829)];
    }
}
