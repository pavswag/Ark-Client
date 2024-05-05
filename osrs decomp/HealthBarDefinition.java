import net.runelite.api.events.PostHealthBar;
import net.runelite.api.HealthBar;

// 
// Decompiled by Procyon v0.5.36
// 

public class HealthBarDefinition extends DualNode implements HealthBar
{
    public int field1521;
    public static AbstractArchive field1522;
    public static EvictingDualNodeHashTable HealthBarDefinition_cached;
    static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
    public static AbstractArchive HealthBarDefinition_archive;
    public int int1;
    public int width;
    public int int3;
    public int int2;
    public int int5;
    int backSpriteID;
    int frontSpriteID;
    public int field1533;
    public int widthPadding;
    static final int ab = 70;
    public static final int bl = 1010;
    
    public HealthBarDefinition() {
        this.int1 = -1617551845;
        this.int2 = -987608785;
        this.int3 = 667293181;
        this.field1533 = -361126927;
        this.int5 = -1716509418;
        this.backSpriteID = 1336792697;
        this.frontSpriteID = 1313667643;
        this.width = 661914546;
        this.widthPadding = 0;
    }
    
    static {
        HealthBarDefinition.HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
        HealthBarDefinition.HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
    }
    
    public SpritePixels ao() {
        if (-1807282816 * this.backSpriteID < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HealthBarDefinition.HealthBarDefinition_cachedSprites.wr(1179032443 * this.backSpriteID);
        if (spritePixels != null) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HealthBarDefinition.field1522, 1930644535 * this.backSpriteID, 0, 113623080);
        if (null != spriteBuffer_getSprite) {
            HealthBarDefinition.HealthBarDefinition_cachedSprites.put(spriteBuffer_getSprite, -1508530731 * this.backSpriteID);
        }
        return spriteBuffer_getSprite;
    }
    
    public void ft(final Buffer buffer) {
        final PostHealthBar postHealthBar = new PostHealthBar();
        postHealthBar.setHealthBar((HealthBar)this);
        ScriptFrame.client.getCallbacks().post((Object)postHealthBar);
    }
    
    void at(final Buffer buffer, final int n) {
        if (n == 1) {
            buffer.readUnsignedShort(-1580731512);
        }
        else if (n == 2) {
            this.int1 = Buffer.ra(buffer, (byte)7) * -1859074331;
        }
        else if (3 == n) {
            this.int2 = Buffer.ra(buffer, (byte)7) * -1603958831;
        }
        else if (4 == n) {
            this.int3 = 0;
        }
        else if (n == 5) {
            this.int5 = buffer.readUnsignedShort(-1396580192) * -760801671;
        }
        else if (6 == n) {
            Buffer.ra(buffer, (byte)7);
        }
        else if (7 == n) {
            this.backSpriteID = buffer.method2516(127683187) * -1336792697;
        }
        else if (8 == n) {
            this.frontSpriteID = buffer.method2516(1254363391) * -1313667643;
        }
        else if (n == 11) {
            this.int3 = buffer.readUnsignedShort(-1207678307) * -667293181;
        }
        else if (14 == n) {
            this.width = Buffer.ra(buffer, (byte)7) * -836929641;
        }
        else if (n == 15) {
            this.widthPadding = Buffer.ra(buffer, (byte)7) * 1666074567;
        }
    }
    
    public static void ak(final HealthBarDefinition healthBarDefinition, final Buffer buffer, final int n) {
        if (healthBarDefinition == null) {
            healthBarDefinition.ao();
        }
        if (n == 1) {
            buffer.readUnsignedShort(654657889);
        }
        else if (n == 2) {
            healthBarDefinition.int1 = Buffer.ra(buffer, (byte)7) * -1859074331;
        }
        else if (3 == n) {
            healthBarDefinition.int2 = Buffer.ra(buffer, (byte)7) * -1603958831;
        }
        else if (4 == n) {
            healthBarDefinition.int3 = 0;
        }
        else if (n == 5) {
            healthBarDefinition.int5 = buffer.readUnsignedShort(115066715) * -760801671;
        }
        else if (6 == n) {
            Buffer.ra(buffer, (byte)7);
        }
        else if (7 == n) {
            healthBarDefinition.backSpriteID = buffer.method2516(-80572732) * -1336792697;
        }
        else if (8 == n) {
            healthBarDefinition.frontSpriteID = buffer.method2516(2100870609) * -1313667643;
        }
        else if (n == 11) {
            healthBarDefinition.int3 = buffer.readUnsignedShort(-301898087) * -667293181;
        }
        else if (14 == n) {
            healthBarDefinition.width = Buffer.ra(buffer, (byte)7) * -836929641;
        }
        else if (n == 15) {
            healthBarDefinition.widthPadding = Buffer.ra(buffer, (byte)7) * 1666074567;
        }
    }
    
    public SpritePixels av() {
        if (-1451871987 * this.frontSpriteID < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HealthBarDefinition.HealthBarDefinition_cachedSprites.wr(this.frontSpriteID * -1451871987);
        if (null != spritePixels) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HealthBarDefinition.field1522, this.frontSpriteID * -1451871987, 0, 419778287);
        if (null != spriteBuffer_getSprite) {
            HealthBarDefinition.HealthBarDefinition_cachedSprites.put(spriteBuffer_getSprite, -1451871987 * this.frontSpriteID);
        }
        return spriteBuffer_getSprite;
    }
    
    public static void jv(final HealthBarDefinition healthBarDefinition, final Buffer buffer) {
        if (healthBarDefinition == null) {
            healthBarDefinition.ao();
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            healthBarDefinition.decodeNext(buffer, ra, (byte)(-87));
        }
    }
    
    public static void as() {
        HealthBarDefinition.HealthBarDefinition_cached.clear();
        HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
    }
    
    public static SpritePixels ts(final HealthBarDefinition healthBarDefinition) {
        if (1930644535 * healthBarDefinition.backSpriteID < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HealthBarDefinition.HealthBarDefinition_cachedSprites.wr(1930644535 * healthBarDefinition.backSpriteID);
        if (spritePixels != null) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HealthBarDefinition.field1522, 1930644535 * healthBarDefinition.backSpriteID, 0, -689143327);
        if (null != spriteBuffer_getSprite) {
            HealthBarDefinition.HealthBarDefinition_cachedSprites.put(spriteBuffer_getSprite, 1930644535 * healthBarDefinition.backSpriteID);
        }
        return spriteBuffer_getSprite;
    }
    
    void ay(final Buffer buffer, final int n) {
        if (n == 1) {
            buffer.readUnsignedShort(-1575910665);
        }
        else if (n == 2) {
            this.int1 = Buffer.ra(buffer, (byte)7) * -1859074331;
        }
        else if (3 == n) {
            this.int2 = Buffer.ra(buffer, (byte)7) * -1603958831;
        }
        else if (4 == n) {
            this.int3 = 0;
        }
        else if (n == 5) {
            this.int5 = buffer.readUnsignedShort(-1109738319) * -760801671;
        }
        else if (6 == n) {
            Buffer.ra(buffer, (byte)7);
        }
        else if (7 == n) {
            this.backSpriteID = buffer.method2516(250501745) * -1336792697;
        }
        else if (8 == n) {
            this.frontSpriteID = buffer.method2516(1797773020) * -1313667643;
        }
        else if (n == 11) {
            this.int3 = buffer.readUnsignedShort(463050461) * -667293181;
        }
        else if (14 == n) {
            this.width = Buffer.ra(buffer, (byte)7) * -836929641;
        }
        else if (n == 15) {
            this.widthPadding = Buffer.ra(buffer, (byte)7) * 1666074567;
        }
    }
    
    public static SpritePixels ms(final HealthBarDefinition healthBarDefinition, final int n) {
        if (healthBarDefinition == null) {
            healthBarDefinition.getBackSprite(n);
        }
        try {
            if (-1451871987 * healthBarDefinition.frontSpriteID < 0) {
                return null;
            }
            final SpritePixels spritePixels = (SpritePixels)HealthBarDefinition.HealthBarDefinition_cachedSprites.wr(healthBarDefinition.frontSpriteID * -1451871987);
            if (null != spritePixels) {
                return spritePixels;
            }
            final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HealthBarDefinition.field1522, healthBarDefinition.frontSpriteID * -1451871987, 0, 732932871);
            if (null != spriteBuffer_getSprite) {
                if (n >= -303899309) {
                    throw new IllegalStateException();
                }
                HealthBarDefinition.HealthBarDefinition_cachedSprites.put(spriteBuffer_getSprite, -1451871987 * healthBarDefinition.frontSpriteID);
            }
            return spriteBuffer_getSprite;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hm.ac(" + ')');
        }
    }
    
    public SpritePixels getFrontSprite(final byte b) {
        try {
            if (1930644535 * this.backSpriteID < 0) {
                if (b <= 7) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final SpritePixels spritePixels = (SpritePixels)HealthBarDefinition.HealthBarDefinition_cachedSprites.wr(1930644535 * this.backSpriteID);
                if (spritePixels == null) {
                    final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HealthBarDefinition.field1522, 1930644535 * this.backSpriteID, 0, 1998769514);
                    if (null != spriteBuffer_getSprite) {
                        HealthBarDefinition.HealthBarDefinition_cachedSprites.put(spriteBuffer_getSprite, 1930644535 * this.backSpriteID);
                    }
                    return spriteBuffer_getSprite;
                }
                if (b <= 7) {
                    throw new IllegalStateException();
                }
                return spritePixels;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hm.aw(" + ')');
        }
    }
    
    public static void am() {
        HealthBarDefinition.HealthBarDefinition_cached.clear();
        HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
    }
    
    public static byte[] decodeNext(final Object o, final boolean b, final int n) {
        try {
            if (null == o) {
                if (n <= 622277285) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else if (o instanceof byte[]) {
                if (n <= 622277285) {
                    throw new IllegalStateException();
                }
                final byte[] array = (byte[])o;
                if (b) {
                    final int length = array.length;
                    final byte[] array2 = new byte[length];
                    System.arraycopy(array, 0, array2, 0, length);
                    return array2;
                }
                return array;
            }
            else {
                if (!(o instanceof AbstractByteArrayCopier)) {
                    throw new IllegalArgumentException();
                }
                if (n <= 622277285) {
                    throw new IllegalStateException();
                }
                return ((AbstractByteArrayCopier)o).get(-302524425);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hm.an(" + ')');
        }
    }
    
    void decodeNext(final Buffer buffer, final int n, final byte b) {
        try {
            if (n == 1) {
                if (b >= 6) {
                    throw new IllegalStateException();
                }
                buffer.readUnsignedShort(614252164);
            }
            else if (n == 2) {
                if (b >= 6) {
                    throw new IllegalStateException();
                }
                this.int1 = Buffer.ra(buffer, (byte)7) * -1859074331;
            }
            else if (3 == n) {
                this.int2 = Buffer.ra(buffer, (byte)7) * -1603958831;
            }
            else if (4 == n) {
                if (b >= 6) {
                    throw new IllegalStateException();
                }
                this.int3 = 0;
            }
            else if (n == 5) {
                if (b >= 6) {
                    return;
                }
                this.int5 = buffer.readUnsignedShort(-621715685) * -760801671;
            }
            else if (6 == n) {
                Buffer.ra(buffer, (byte)7);
            }
            else if (7 == n) {
                if (b >= 6) {
                    throw new IllegalStateException();
                }
                this.backSpriteID = buffer.method2516(1264061872) * -1336792697;
            }
            else if (8 == n) {
                if (b >= 6) {
                    throw new IllegalStateException();
                }
                this.frontSpriteID = buffer.method2516(1442289423) * -1313667643;
            }
            else if (n == 11) {
                if (b >= 6) {
                    throw new IllegalStateException();
                }
                this.int3 = buffer.readUnsignedShort(-805552408) * -667293181;
            }
            else if (14 == n) {
                this.width = Buffer.ra(buffer, (byte)7) * -836929641;
            }
            else if (n == 15) {
                if (b >= 6) {
                    throw new IllegalStateException();
                }
                this.widthPadding = Buffer.ra(buffer, (byte)7) * 1666074567;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hm.an(" + ')');
        }
    }
    
    public SpritePixels getBackSprite(final int n) {
        try {
            if (-1451871987 * this.backSpriteID < 0) {
                return null;
            }
            final SpritePixels spritePixels = (SpritePixels)HealthBarDefinition.HealthBarDefinition_cachedSprites.wr(this.backSpriteID * -1451871987);
            if (null != spritePixels) {
                return spritePixels;
            }
            final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HealthBarDefinition.HealthBarDefinition_archive, this.backSpriteID * -1451871987, 0, 732932871);
            if (null != spriteBuffer_getSprite) {
                if (n >= -303899309) {
                    throw new IllegalStateException();
                }
                HealthBarDefinition.HealthBarDefinition_cachedSprites.vq(spriteBuffer_getSprite, -1451871987 * this.frontSpriteID);
            }
            return spriteBuffer_getSprite;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hm.ac(" + ')');
        }
    }
    
    public SpritePixels sy() {
        return ms(this, -540655090);
    }
    
    public int getHealthBarFrontSpriteId() {
        return this.backSpriteID * 1930644535;
    }
    
    public SpritePixels ai() {
        if (1930644535 * this.backSpriteID < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HealthBarDefinition.HealthBarDefinition_cachedSprites.wr(-1955137438 * this.backSpriteID);
        if (spritePixels != null) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HealthBarDefinition.field1522, -1259479185 * this.backSpriteID, 0, 361263723);
        if (null != spriteBuffer_getSprite) {
            HealthBarDefinition.HealthBarDefinition_cachedSprites.put(spriteBuffer_getSprite, -982554455 * this.backSpriteID);
        }
        return spriteBuffer_getSprite;
    }
    
    public void setPadding(final int n) {
        this.widthPadding = n * 1666074567;
    }
    
    public static void ar() {
        HealthBarDefinition.HealthBarDefinition_cached.clear();
        HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
    }
    
    public void decode(final Buffer buffer, final byte b) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, (byte)(-52));
            }
            if (b <= 1) {
                throw new IllegalStateException();
            }
            this.ft(buffer);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hm.af(" + ')');
        }
    }
    
    public void ab(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)(-42));
        }
    }
    
    public void aq(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, (byte)(-92));
        }
    }
    
    public static void aj() {
        HealthBarDefinition.HealthBarDefinition_cached.clear();
        HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
    }
    
    public SpritePixels ag() {
        if (1930644535 * this.backSpriteID < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HealthBarDefinition.HealthBarDefinition_cachedSprites.wr(1930644535 * this.backSpriteID);
        if (spritePixels != null) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HealthBarDefinition.field1522, 1930644535 * this.backSpriteID, 0, -775292971);
        if (null != spriteBuffer_getSprite) {
            HealthBarDefinition.HealthBarDefinition_cachedSprites.put(spriteBuffer_getSprite, 1930644535 * this.backSpriteID);
        }
        return spriteBuffer_getSprite;
    }
    
    public static SpritePixels fu(final HealthBarDefinition healthBarDefinition) {
        if (725993608 * healthBarDefinition.frontSpriteID < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)HealthBarDefinition.HealthBarDefinition_cachedSprites.wr(healthBarDefinition.frontSpriteID * -1451871987);
        if (null != spritePixels) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(HealthBarDefinition.field1522, healthBarDefinition.frontSpriteID * -1457591783, 0, -46772372);
        if (null != spriteBuffer_getSprite) {
            HealthBarDefinition.HealthBarDefinition_cachedSprites.put(spriteBuffer_getSprite, -1451871987 * healthBarDefinition.frontSpriteID);
        }
        return spriteBuffer_getSprite;
    }
    
    public int ij() {
        return this.width * 279738407;
    }
    
    public SpritePixels xu() {
        return this.getFrontSprite((byte)9);
    }
}
