// 
// Decompiled by Procyon v0.5.36
// 

public class HitSplatDefinition extends DualNode
{
    public int field1663;
    public static AbstractArchive field1664;
    public static AbstractArchive HitSplatDefinition_fontsArchive;
    static EvictingDualNodeHashTable HitSplatDefinition_cached;
    static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
    static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
    public static final int al = 0;
    public static AbstractArchive HitSplatDefinition_archive;
    static final int be = 3;
    int fontId;
    public int textColor;
    public static final int at = 1;
    public int field1672;
    int field1673;
    int field1674;
    int field1675;
    static final int aa = 16777215;
    public int field1676;
    int transformVarp;
    public int field1678;
    String field1679;
    public int field1680;
    public int[] transforms;
    int transformVarbit;
    public int field1683;
    int field1684;
    
    HitSplatDefinition() {
        this.fontId = -1427566695;
        this.textColor = 659007217;
        this.field1672 = -1307612166;
        this.field1684 = -1067276637;
        this.field1673 = -1113583925;
        this.field1674 = 42326427;
        this.field1675 = 1203704241;
        this.field1663 = 0;
        this.field1676 = 0;
        this.field1683 = 481029747;
        this.field1679 = "";
        this.field1678 = -720956497;
        this.field1680 = 0;
        this.transformVarbit = -753468781;
        this.transformVarp = 663321583;
    }
    
    static {
        HitSplatDefinition.HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
        HitSplatDefinition.HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
        HitSplatDefinition.HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
    }
    
    public String ad(final int n) {
        String s = this.field1679;
        Label_0051: {
            break Label_0051;
            int i = 0;
            do {
                s = s.substring(0, i) + KitDefinition.getModelData(n, false, (byte)16) + s.substring(i + 2);
                i = s.indexOf("%1");
            } while (i >= 0);
        }
        return s;
    }
    
    public String ae(final int n) {
        String s = this.field1679;
        Label_0060: {
            break Label_0060;
            int i = 0;
            do {
                s = s.substring(0, i) + KitDefinition.getModelData(n, false, (byte)16) + s.substring(i + 2);
                i = s.indexOf("%1");
            } while (i >= 0);
        }
        return s;
    }
    
    public SpritePixels method1081() {
        if (1481785964 * this.field1673 < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(this.field1673 * -1798902719);
        if (spritePixels != null) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, this.field1673 * -466249443, 0, 333728604);
        if (spriteBuffer_getSprite != null) {
            HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, this.field1673 * -466249443);
        }
        return spriteBuffer_getSprite;
    }
    
    static int method1081(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (n == 3500) {
                if (b2 != 1) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Client.keyHandlerInstance.getKeyPressed(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -680355127) ? 1 : 0);
                return 1;
            }
            else if (n == 3501) {
                if (b2 != 1) {
                    throw new IllegalStateException();
                }
                final int n2 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                final int n3 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                boolean b3;
                if (Client.keyHandlerInstance.method1153(n2, (byte)92)) {
                    if (b2 != 1) {
                        throw new IllegalStateException();
                    }
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                interpreter_intStack[n3] = (b3 ? 1 : 0);
                return 1;
            }
            else {
                if (3502 == n) {
                    final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                    final int n5 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b4;
                    if (class207.ux(Client.keyHandlerInstance, n4, 1556637445)) {
                        if (b2 != 1) {
                            throw new IllegalStateException();
                        }
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    interpreter_intStack2[n5] = (b4 ? 1 : 0);
                    return 1;
                }
                return 2;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.bb(" + ')');
        }
    }
    
    public static SpritePixels dc(final HitSplatDefinition hitSplatDefinition, final int n) {
        if (hitSplatDefinition == null) {
            hitSplatDefinition.method1076(n);
        }
        try {
            if (728089333 * hitSplatDefinition.field1684 < 0) {
                if (n >= 2116163662) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(728089333 * hitSplatDefinition.field1684);
                if (spritePixels == null) {
                    final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, 728089333 * hitSplatDefinition.field1684, 0, 710007229);
                    if (null != spriteBuffer_getSprite) {
                        if (n >= 2116163662) {
                            throw new IllegalStateException();
                        }
                        HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, 728089333 * hitSplatDefinition.field1684);
                    }
                    return spriteBuffer_getSprite;
                }
                if (n >= 2116163662) {
                    throw new IllegalStateException();
                }
                return spritePixels;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.ab(" + ')');
        }
    }
    
    public static HitSplatDefinition ao(final int n) {
        final HitSplatDefinition hitSplatDefinition = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.wr(n);
        if (hitSplatDefinition != null) {
            return hitSplatDefinition;
        }
        final byte[] takeFile = HitSplatDefinition.HitSplatDefinition_archive.takeFile(1623310074, n, (byte)(-122));
        final HitSplatDefinition hitSplatDefinition2 = new HitSplatDefinition();
        if (takeFile != null) {
            hitSplatDefinition2.decode(new Buffer(takeFile), 1336661418);
        }
        HitSplatDefinition.HitSplatDefinition_cached.put(hitSplatDefinition2, n);
        return hitSplatDefinition2;
    }
    
    public SpritePixels method1078(final byte b) {
        try {
            if (170092719 * this.field1675 < 0) {
                return null;
            }
            final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(this.field1675 * 170092719);
            if (spritePixels == null) {
                final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, this.field1675 * 170092719, 0, 1839029471);
                if (spriteBuffer_getSprite != null) {
                    if (b <= 1) {
                        throw new IllegalStateException();
                    }
                    HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, 170092719 * this.field1675);
                }
                return spriteBuffer_getSprite;
            }
            if (b <= 1) {
                throw new IllegalStateException();
            }
            return spritePixels;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.at(" + ')');
        }
    }
    
    public final HitSplatDefinition ak() {
        int expandBounds = -1;
        if (-1 != 1173802085 * this.transformVarbit) {
            expandBounds = class252.expandBounds(this.transformVarbit * -106494121, 1378585505);
        }
        else if (-1 != this.transformVarp * -756179250) {
            expandBounds = Varps.Varps_main[-1580274447 * this.transformVarp];
        }
        int n;
        if (expandBounds < 0 || expandBounds >= this.transforms.length - 1) {
            n = this.transforms[this.transforms.length - 1];
        }
        else {
            n = this.transforms[expandBounds];
        }
        if (n != -1) {
            return class122.method725(n, (byte)4);
        }
        return null;
    }
    
    void av(final Buffer buffer, final int n) {
        if (n == 1) {
            this.fontId = buffer.method2516(1077219081) * 1427566695;
        }
        else if (2 == n) {
            this.textColor = buffer.readMedium(86142979) * -407348977;
        }
        else if (n == 3) {
            this.field1684 = buffer.method2516(61958093) * 1067276637;
        }
        else if (n == 4) {
            this.field1674 = buffer.method2516(1299544638) * -42326427;
        }
        else if (5 == n) {
            this.field1673 = buffer.method2516(179784434) * 1113583925;
        }
        else if (n == 6) {
            this.field1675 = buffer.method2516(1511800667) * -1203704241;
        }
        else if (n == 7) {
            this.field1663 = buffer.readUnsignedByte((byte)(-96)) * -924786991;
        }
        else if (8 == n) {
            this.field1679 = buffer.readStringCp1252NullCircumfixed((short)(-30151));
        }
        else if (n == 9) {
            this.field1672 = buffer.readUnsignedShort(-11045990) * -877673633;
        }
        else if (10 == n) {
            this.field1676 = buffer.readUnsignedByte((byte)(-123)) * -1866102945;
        }
        else if (11 == n) {
            this.field1683 = 0;
        }
        else if (12 == n) {
            this.field1678 = Buffer.ra(buffer, (byte)7) * 720956497;
        }
        else if (13 == n) {
            this.field1680 = buffer.readUnsignedByte((byte)(-45)) * 219094333;
        }
        else if (n == 14) {
            this.field1683 = buffer.readUnsignedShort(816041590) * -481029747;
        }
        else if (n == 17 || n == 18) {
            this.transformVarbit = buffer.readUnsignedShort(-1023039428) * 753468781;
            if (1173802085 * this.transformVarbit == 65535) {
                this.transformVarbit = -753468781;
            }
            this.transformVarp = buffer.readUnsignedShort(-282032028) * -663321583;
            if (this.transformVarp * -1580274447 == 65535) {
                this.transformVarp = 663321583;
            }
            int unsignedShort = -1;
            if (n == 18) {
                unsignedShort = buffer.readUnsignedShort(-294954317);
                if (65535 == unsignedShort) {
                    unsignedShort = -1;
                }
            }
            final int ra = Buffer.ra(buffer, (byte)7);
            this.transforms = new int[ra + 2];
            for (int i = 0; i <= ra; ++i) {
                this.transforms[i] = buffer.readUnsignedShort(-1499577);
                if (65535 == this.transforms[i]) {
                    this.transforms[i] = -1;
                }
            }
            this.transforms[ra + 1] = unsignedShort;
        }
    }
    
    public final HitSplatDefinition as() {
        int expandBounds = -1;
        if (-1 != 1173802085 * this.transformVarbit) {
            expandBounds = class252.expandBounds(this.transformVarbit * 1173802085, 2061546777);
        }
        else if (-1 != this.transformVarp * -2143251457) {
            expandBounds = Varps.Varps_main[-1580274447 * this.transformVarp];
        }
        int n;
        if (expandBounds >= 0 && expandBounds < this.transforms.length - 1) {
            n = this.transforms[expandBounds];
        }
        else {
            n = this.transforms[this.transforms.length - 1];
        }
        if (n != -1) {
            return class122.method725(n, (byte)4);
        }
        return null;
    }
    
    public static void fh(final HitSplatDefinition hitSplatDefinition, final Buffer buffer) {
        if (hitSplatDefinition == null) {
            hitSplatDefinition.bm();
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            hitSplatDefinition.decodeNext(buffer, ra, (byte)1);
        }
    }
    
    public final HitSplatDefinition az() {
        int expandBounds = -1;
        if (-1 != -1531757343 * this.transformVarbit) {
            expandBounds = class252.expandBounds(this.transformVarbit * 1173802085, 2080171463);
        }
        else if (-1 != this.transformVarp * -1580274447) {
            expandBounds = Varps.Varps_main[617756669 * this.transformVarp];
        }
        int n;
        if (expandBounds >= 0 && expandBounds < this.transforms.length - 1) {
            n = this.transforms[expandBounds];
        }
        else {
            n = this.transforms[this.transforms.length - 1];
        }
        if (n != -1) {
            return class122.method725(n, (byte)4);
        }
        return null;
    }
    
    public static HitSplatDefinition ax(final int n) {
        final HitSplatDefinition hitSplatDefinition = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.wr(n);
        if (hitSplatDefinition != null) {
            return hitSplatDefinition;
        }
        final byte[] takeFile = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, n, (byte)(-97));
        final HitSplatDefinition hitSplatDefinition2 = new HitSplatDefinition();
        if (takeFile != null) {
            hitSplatDefinition2.decode(new Buffer(takeFile), 1772810325);
        }
        HitSplatDefinition.HitSplatDefinition_cached.put(hitSplatDefinition2, n);
        return hitSplatDefinition2;
    }
    
    public int bi() {
        return this.field1672 * 292771999;
    }
    
    public SpritePixels bi() {
        if (-153839723 * this.field1673 < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(this.field1673 * 609190515);
        if (spritePixels != null) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, this.field1673 * 677464414, 0, -575780438);
        if (spriteBuffer_getSprite != null) {
            HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, this.field1673 * -612187434);
        }
        return spriteBuffer_getSprite;
    }
    
    public SpritePixels bo() {
        if (170092719 * this.field1675 < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(this.field1675 * 170092719);
        if (spritePixels != null) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, this.field1675 * 170092719, 0, 351583008);
        if (spriteBuffer_getSprite != null) {
            HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, 170092719 * this.field1675);
        }
        return spriteBuffer_getSprite;
    }
    
    void decodeNext(final Buffer buffer, final int n, final byte b) {
        try {
            if (n == 1) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                this.fontId = buffer.method2516(1454910852) * 1427566695;
            }
            else if (2 == n) {
                if (b != 1) {
                    return;
                }
                this.textColor = buffer.readMedium(-992963164) * -407348977;
            }
            else if (n == 3) {
                this.field1684 = buffer.method2516(258654860) * 1067276637;
            }
            else if (n == 4) {
                this.field1674 = buffer.method2516(432348780) * -42326427;
            }
            else if (5 == n) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                this.field1673 = buffer.method2516(1582479651) * 1113583925;
            }
            else if (n == 6) {
                if (b != 1) {
                    return;
                }
                this.field1675 = buffer.method2516(1746407775) * -1203704241;
            }
            else if (n == 7) {
                this.field1663 = buffer.readUnsignedByte((byte)(-91)) * -924786991;
            }
            else if (8 == n) {
                this.field1679 = buffer.readStringCp1252NullCircumfixed((short)(-27035));
            }
            else if (n == 9) {
                this.field1672 = buffer.readUnsignedShort(-735890334) * -877673633;
            }
            else if (10 == n) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                this.field1676 = buffer.readUnsignedByte((byte)(-37)) * -1866102945;
            }
            else if (11 == n) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                this.field1683 = 0;
            }
            else if (12 == n) {
                this.field1678 = Buffer.ra(buffer, (byte)7) * 720956497;
            }
            else if (13 == n) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                this.field1680 = buffer.readUnsignedByte((byte)(-13)) * 219094333;
            }
            else if (n == 14) {
                if (b != 1) {
                    return;
                }
                this.field1683 = buffer.readUnsignedShort(-2039023905) * -481029747;
            }
            else {
                if (n != 17) {
                    if (b != 1) {
                        throw new IllegalStateException();
                    }
                    if (n != 18) {
                        return;
                    }
                }
                this.transformVarbit = buffer.readUnsignedShort(-1558626191) * 753468781;
                if (1173802085 * this.transformVarbit == 65535) {
                    if (b != 1) {
                        throw new IllegalStateException();
                    }
                    this.transformVarbit = -753468781;
                }
                this.transformVarp = buffer.readUnsignedShort(-1683724219) * -663321583;
                if (this.transformVarp * -1580274447 == 65535) {
                    this.transformVarp = 663321583;
                }
                int unsignedShort = -1;
                if (n == 18) {
                    if (b != 1) {
                        throw new IllegalStateException();
                    }
                    unsignedShort = buffer.readUnsignedShort(-1252871079);
                    if (65535 == unsignedShort) {
                        unsignedShort = -1;
                    }
                }
                final int ra = Buffer.ra(buffer, (byte)7);
                this.transforms = new int[ra + 2];
                for (int i = 0; i <= ra; ++i) {
                    if (b != 1) {
                        throw new IllegalStateException();
                    }
                    this.transforms[i] = buffer.readUnsignedShort(-1274792633);
                    if (65535 == this.transforms[i]) {
                        if (b != 1) {
                            return;
                        }
                        this.transforms[i] = -1;
                    }
                }
                this.transforms[ra + 1] = unsignedShort;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.aw(" + ')');
        }
    }
    
    void am(final Buffer buffer, final int n) {
        if (n == 1) {
            this.fontId = buffer.method2516(843054154) * 1427566695;
        }
        else if (2 == n) {
            this.textColor = buffer.readMedium(-1664778981) * -407348977;
        }
        else if (n == 3) {
            this.field1684 = buffer.method2516(1369801299) * 1067276637;
        }
        else if (n == 4) {
            this.field1674 = buffer.method2516(1264228852) * -42326427;
        }
        else if (5 == n) {
            this.field1673 = buffer.method2516(1504753669) * 1113583925;
        }
        else if (n == 6) {
            this.field1675 = buffer.method2516(1903172003) * -1203704241;
        }
        else if (n == 7) {
            this.field1663 = buffer.readUnsignedByte((byte)(-122)) * -924786991;
        }
        else if (8 == n) {
            this.field1679 = buffer.readStringCp1252NullCircumfixed((short)(-32086));
        }
        else if (n == 9) {
            this.field1672 = buffer.readUnsignedShort(-629265713) * -877673633;
        }
        else if (10 == n) {
            this.field1676 = buffer.readUnsignedByte((byte)(-26)) * -1866102945;
        }
        else if (11 == n) {
            this.field1683 = 0;
        }
        else if (12 == n) {
            this.field1678 = Buffer.ra(buffer, (byte)7) * 720956497;
        }
        else if (13 == n) {
            this.field1680 = buffer.readUnsignedByte((byte)(-25)) * 219094333;
        }
        else if (n == 14) {
            this.field1683 = buffer.readUnsignedShort(-325102921) * -481029747;
        }
        else if (n == 17 || n == 18) {
            this.transformVarbit = buffer.readUnsignedShort(113359226) * 753468781;
            if (1173802085 * this.transformVarbit == 65535) {
                this.transformVarbit = -753468781;
            }
            this.transformVarp = buffer.readUnsignedShort(807365714) * -663321583;
            if (this.transformVarp * -1580274447 == 65535) {
                this.transformVarp = 663321583;
            }
            int unsignedShort = -1;
            if (n == 18) {
                unsignedShort = buffer.readUnsignedShort(-1573849689);
                if (65535 == unsignedShort) {
                    unsignedShort = -1;
                }
            }
            final int ra = Buffer.ra(buffer, (byte)7);
            this.transforms = new int[ra + 2];
            for (int i = 0; i <= ra; ++i) {
                this.transforms[i] = buffer.readUnsignedShort(272972147);
                if (65535 == this.transforms[i]) {
                    this.transforms[i] = -1;
                }
            }
            this.transforms[ra + 1] = unsignedShort;
        }
    }
    
    public SpritePixels method1072(final int n) {
        try {
            if (1100815213 * this.field1674 < 0) {
                if (n <= 1473950221) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(this.field1674 * 1100815213);
                if (null == spritePixels) {
                    final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, 1100815213 * this.field1674, 0, -1094014063);
                    if (spriteBuffer_getSprite != null) {
                        if (n <= 1473950221) {
                            throw new IllegalStateException();
                        }
                        HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, 1100815213 * this.field1674);
                    }
                    return spriteBuffer_getSprite;
                }
                if (n <= 1473950221) {
                    throw new IllegalStateException();
                }
                return spritePixels;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.al(" + ')');
        }
    }
    
    void decode(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, (byte)1);
            }
            if (n <= 868016454) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.an(" + ')');
        }
    }
    
    public final HitSplatDefinition transform(final byte b) {
        try {
            int expandBounds = -1;
            if (-1 != 1173802085 * this.transformVarbit) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                expandBounds = class252.expandBounds(this.transformVarbit * 1173802085, 1419921071);
            }
            else if (-1 != this.transformVarp * -1580274447) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                expandBounds = Varps.Varps_main[-1580274447 * this.transformVarp];
            }
            int n;
            if (expandBounds >= 0 && expandBounds < this.transforms.length - 1) {
                n = this.transforms[expandBounds];
            }
            else {
                n = this.transforms[this.transforms.length - 1];
            }
            if (n == -1) {
                return null;
            }
            if (b >= 0) {
                throw new IllegalStateException();
            }
            return class122.method725(n, (byte)4);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.ac(" + ')');
        }
    }
    
    public String getString(final int n, final int n2) {
        try {
            String s = this.field1679;
            while (true) {
                final int index = s.indexOf("%1");
                if (index < 0) {
                    break;
                }
                s = s.substring(0, index) + KitDefinition.getModelData(n, false, (byte)16) + s.substring(index + 2);
            }
            if (n2 >= -182047433) {
                throw new IllegalStateException();
            }
            return s;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.au(" + ')');
        }
    }
    
    public Font getFont(final int n) {
        try {
            if (-1 == 1857366871 * this.fontId) {
                if (n != 1644925127) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final Font font = (Font)HitSplatDefinition.HitSplatDefinition_cachedFonts.wr(1857366871 * this.fontId);
                if (font == null) {
                    final AbstractArchive field1664 = HitSplatDefinition.field1664;
                    final AbstractArchive hitSplatDefinition_fontsArchive = HitSplatDefinition.HitSplatDefinition_fontsArchive;
                    final int n2 = 1857366871 * this.fontId;
                    final byte[] takeFile = field1664.takeFile(n2, 0, (byte)(-126));
                    int n3;
                    if (null == takeFile) {
                        if (n != 1644925127) {
                            throw new IllegalStateException();
                        }
                        n3 = 0;
                    }
                    else {
                        class485.SpriteBuffer_decode(takeFile, 1145263442);
                        n3 = 1;
                    }
                    Font font2;
                    if (n3 == 0) {
                        if (n != 1644925127) {
                            throw new IllegalStateException();
                        }
                        font2 = null;
                    }
                    else {
                        final byte[] takeFile2 = hitSplatDefinition_fontsArchive.takeFile(n2, 0, (byte)(-11));
                        Font font3;
                        if (takeFile2 == null) {
                            if (n != 1644925127) {
                                throw new IllegalStateException();
                            }
                            font3 = null;
                        }
                        else {
                            final Font font4 = new Font(takeFile2, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                            class398.method2125(-262861184);
                            font3 = font4;
                        }
                        font2 = font3;
                    }
                    final Font font5 = font2;
                    if (null != font5) {
                        if (n != 1644925127) {
                            throw new IllegalStateException();
                        }
                        HitSplatDefinition.HitSplatDefinition_cachedFonts.put(font5, 1857366871 * this.fontId);
                    }
                    return font5;
                }
                if (n != 1644925127) {
                    throw new IllegalStateException();
                }
                return font;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.aa(" + ')');
        }
    }
    
    void ai(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)1);
        }
    }
    
    void ar(final Buffer buffer, final int n) {
        if (n == 1) {
            this.fontId = buffer.method2516(1145753063) * 1427566695;
        }
        else if (2 == n) {
            this.textColor = buffer.readMedium(1878523891) * -407348977;
        }
        else if (n == 3) {
            this.field1684 = buffer.method2516(1218903553) * 1067276637;
        }
        else if (n == 4) {
            this.field1674 = buffer.method2516(1003018522) * -42326427;
        }
        else if (5 == n) {
            this.field1673 = buffer.method2516(896438137) * 1113583925;
        }
        else if (n == 6) {
            this.field1675 = buffer.method2516(1408434027) * -1203704241;
        }
        else if (n == 7) {
            this.field1663 = buffer.readUnsignedByte((byte)(-28)) * -924786991;
        }
        else if (8 == n) {
            this.field1679 = buffer.readStringCp1252NullCircumfixed((short)(-12474));
        }
        else if (n == 9) {
            this.field1672 = buffer.readUnsignedShort(-873155858) * -877673633;
        }
        else if (10 == n) {
            this.field1676 = buffer.readUnsignedByte((byte)(-15)) * -1866102945;
        }
        else if (11 == n) {
            this.field1683 = 0;
        }
        else if (12 == n) {
            this.field1678 = Buffer.ra(buffer, (byte)7) * 720956497;
        }
        else if (13 == n) {
            this.field1680 = buffer.readUnsignedByte((byte)(-121)) * 219094333;
        }
        else if (n == 14) {
            this.field1683 = buffer.readUnsignedShort(-1635136271) * -481029747;
        }
        else if (n == 17 || n == 18) {
            this.transformVarbit = buffer.readUnsignedShort(-693304215) * 753468781;
            if (1173802085 * this.transformVarbit == 65535) {
                this.transformVarbit = -753468781;
            }
            this.transformVarp = buffer.readUnsignedShort(-1539544052) * -663321583;
            if (this.transformVarp * -1580274447 == 65535) {
                this.transformVarp = 663321583;
            }
            int unsignedShort = -1;
            if (n == 18) {
                unsignedShort = buffer.readUnsignedShort(-889484258);
                if (65535 == unsignedShort) {
                    unsignedShort = -1;
                }
            }
            final int ra = Buffer.ra(buffer, (byte)7);
            this.transforms = new int[ra + 2];
            for (int i = 0; i <= ra; ++i) {
                this.transforms[i] = buffer.readUnsignedShort(-155645341);
                if (65535 == this.transforms[i]) {
                    this.transforms[i] = -1;
                }
            }
            this.transforms[ra + 1] = unsignedShort;
        }
    }
    
    public String ap(final int n) {
        String s = this.field1679;
        Label_0060: {
            break Label_0060;
            int i = 0;
            do {
                s = s.substring(0, i) + KitDefinition.getModelData(n, false, (byte)16) + s.substring(i + 2);
                i = s.indexOf("%1");
            } while (i >= 0);
        }
        return s;
    }
    
    public static void bd() {
        HitSplatDefinition.HitSplatDefinition_cached.clear();
        HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
        HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
    }
    
    public static SpritePixels iy(final HitSplatDefinition hitSplatDefinition) {
        if (-466249443 * hitSplatDefinition.field1673 < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(hitSplatDefinition.field1673 * -466249443);
        if (spritePixels != null) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, hitSplatDefinition.field1673 * -466249443, 0, 898274027);
        if (spriteBuffer_getSprite != null) {
            HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, hitSplatDefinition.field1673 * -2047586410);
        }
        return spriteBuffer_getSprite;
    }
    
    public static String ra(final HitSplatDefinition hitSplatDefinition, final int n) {
        if (hitSplatDefinition == null) {
            return hitSplatDefinition.ae(n);
        }
        String s = hitSplatDefinition.field1679;
        Label_0070: {
            break Label_0070;
            int i = 0;
            do {
                s = s.substring(0, i) + KitDefinition.getModelData(n, false, (byte)16) + s.substring(i + 2);
                i = s.indexOf("%1");
            } while (i >= 0);
        }
        return s;
    }
    
    public SpritePixels method1076(final int n) {
        try {
            if (728089333 * this.fontId < 0) {
                if (n >= 2116163662) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedFonts.get(728089333 * this.fontId);
                if (spritePixels == null) {
                    final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, 728089333 * this.field1673, 0, 710007229);
                    if (null != spriteBuffer_getSprite) {
                        if (n >= 2116163662) {
                            throw new IllegalStateException();
                        }
                        HitSplatDefinition.HitSplatDefinition_cachedFonts.put(spriteBuffer_getSprite, 728089333 * this.field1675);
                    }
                    return spriteBuffer_getSprite;
                }
                if (n >= 2116163662) {
                    throw new IllegalStateException();
                }
                return spritePixels;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.ab(" + ')');
        }
    }
    
    public SpritePixels method1077(final int n) {
        try {
            if (-466249443 * this.field1673 < 0) {
                if (n >= 218740551) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(this.field1673 * -466249443);
                if (spritePixels == null) {
                    final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, this.field1673 * -466249443, 0, 20819222);
                    if (spriteBuffer_getSprite != null) {
                        if (n >= 218740551) {
                            throw new IllegalStateException();
                        }
                        HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, this.field1673 * -466249443);
                    }
                    return spriteBuffer_getSprite;
                }
                if (n >= 218740551) {
                    throw new IllegalStateException();
                }
                return spritePixels;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hb.aq(" + ')');
        }
    }
    
    public final HitSplatDefinition aj() {
        int expandBounds = -1;
        if (-1 != 1173802085 * this.transformVarbit) {
            expandBounds = class252.expandBounds(this.transformVarbit * 1173802085, 2024022414);
        }
        else if (-1 != this.transformVarp * -1580274447) {
            expandBounds = Varps.Varps_main[-668715763 * this.transformVarp];
        }
        int n;
        if (expandBounds < 0 || expandBounds >= this.transforms.length - 1) {
            n = this.transforms[this.transforms.length - 1];
        }
        else {
            n = this.transforms[expandBounds];
        }
        if (n != -1) {
            return class122.method725(n, (byte)4);
        }
        return null;
    }
    
    public Font bz() {
        if (-1 == 668904608 * this.fontId) {
            return null;
        }
        final Font font = (Font)HitSplatDefinition.HitSplatDefinition_cachedFonts.wr(1857366871 * this.fontId);
        if (font != null) {
            return font;
        }
        final AbstractArchive field1664 = HitSplatDefinition.field1664;
        final AbstractArchive hitSplatDefinition_fontsArchive = HitSplatDefinition.HitSplatDefinition_fontsArchive;
        final int n = 1857366871 * this.fontId;
        final byte[] takeFile = field1664.takeFile(n, 0, (byte)(-77));
        int n2;
        if (null == takeFile) {
            n2 = 0;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            n2 = 1;
        }
        Font font2;
        if (n2 == 0) {
            font2 = null;
        }
        else {
            final byte[] takeFile2 = hitSplatDefinition_fontsArchive.takeFile(n, 0, (byte)(-104));
            Font font3;
            if (takeFile2 == null) {
                font3 = null;
            }
            else {
                final Font font4 = new Font(takeFile2, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                class398.method2125(-262861184);
                font3 = font4;
            }
            font2 = font3;
        }
        final Font font5 = font2;
        if (null != font5) {
            HitSplatDefinition.HitSplatDefinition_cachedFonts.put(font5, 1531805076 * this.fontId);
        }
        return font5;
    }
    
    public static SpritePixels zx(final HitSplatDefinition hitSplatDefinition) {
        if (1100815213 * hitSplatDefinition.field1674 < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(hitSplatDefinition.field1674 * 1110850418);
        if (null != spritePixels) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, -1242132835 * hitSplatDefinition.field1674, 0, 1213129481);
        if (spriteBuffer_getSprite != null) {
            HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, 1100815213 * hitSplatDefinition.field1674);
        }
        return spriteBuffer_getSprite;
    }
    
    public Font bm() {
        if (-1 == 1857366871 * this.fontId) {
            return null;
        }
        final Font font = (Font)HitSplatDefinition.HitSplatDefinition_cachedFonts.wr(-644588611 * this.fontId);
        if (font != null) {
            return font;
        }
        final AbstractArchive field1664 = HitSplatDefinition.field1664;
        final AbstractArchive hitSplatDefinition_fontsArchive = HitSplatDefinition.HitSplatDefinition_fontsArchive;
        final int n = 1857366871 * this.fontId;
        final byte[] takeFile = field1664.takeFile(n, 0, (byte)(-60));
        int n2;
        if (null == takeFile) {
            n2 = 0;
        }
        else {
            class485.SpriteBuffer_decode(takeFile, 1145263442);
            n2 = 1;
        }
        Font font2;
        if (n2 == 0) {
            font2 = null;
        }
        else {
            final byte[] takeFile2 = hitSplatDefinition_fontsArchive.takeFile(n, 0, (byte)(-105));
            Font font3;
            if (takeFile2 == null) {
                font3 = null;
            }
            else {
                final Font font4 = new Font(takeFile2, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels);
                class398.method2125(-262861184);
                font3 = font4;
            }
            font2 = font3;
        }
        final Font font5 = font2;
        if (null != font5) {
            HitSplatDefinition.HitSplatDefinition_cachedFonts.put(font5, -898121873 * this.fontId);
        }
        return font5;
    }
    
    public SpritePixels bk() {
        if (1100815213 * this.field1674 < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(this.field1674 * 1100815213);
        if (null != spritePixels) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, 1100815213 * this.field1674, 0, -115701406);
        if (spriteBuffer_getSprite != null) {
            HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, 1100815213 * this.field1674);
        }
        return spriteBuffer_getSprite;
    }
    
    void ah(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)1);
        }
    }
    
    public static SpritePixels ey(final HitSplatDefinition hitSplatDefinition) {
        if (737275718 * hitSplatDefinition.field1684 < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HitSplatDefinition.HitSplatDefinition_cachedSprites.wr(2075649144 * hitSplatDefinition.field1684);
        if (spritePixels != null) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HitSplatDefinition.field1664, 728089333 * hitSplatDefinition.field1684, 0, 670116879);
        if (null != spriteBuffer_getSprite) {
            HitSplatDefinition.HitSplatDefinition_cachedSprites.put(spriteBuffer_getSprite, 728089333 * hitSplatDefinition.field1684);
        }
        return spriteBuffer_getSprite;
    }
}
