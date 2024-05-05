import net.runelite.api.worldmap.MapElementConfig;

// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapElement extends DualNode implements MapElementConfig
{
    int[] field1480;
    static WorldMapElement[] WorldMapElement_cached;
    static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
    public final int objectId;
    public int field1484;
    int sprite2;
    public String name;
    public String[] menuActions;
    public int textSize;
    static final int ay = 0;
    public boolean field1489;
    int field1490;
    public boolean field1491;
    public VerticalAlignment verticalAlignment;
    public String menuTargetName;
    public int sprite1;
    static AbstractArchive WorldMapElement_archive;
    int field1496;
    int field1497;
    public HorizontalAlignment horizontalAlignment;
    int field1499;
    int[] field1500;
    byte[] field1501;
    public int category;
    static int field1503;
    
    WorldMapElement(final int n) {
        this.sprite1 = 771758991;
        this.sprite2 = -1486786935;
        this.textSize = 0;
        this.field1489 = true;
        this.field1491 = false;
        this.menuActions = new String[5];
        this.field1499 = -1896307301;
        this.field1490 = -1629628643;
        this.field1496 = Integer.MIN_VALUE;
        this.field1497 = Integer.MIN_VALUE;
        this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
        this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
        this.category = 627392423;
        this.objectId = -1846037181 * n;
    }
    
    static {
        WorldMapElement.WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);
    }
    
    public static void ad() {
        WorldMapElement.WorldMapElement_cachedSprites.clear();
    }
    
    public static void ae() {
        WorldMapElement.WorldMapElement_cachedSprites.clear();
    }
    
    public static SpritePixels fd(final WorldMapElement worldMapElement, final int n, final int n2) {
        if (worldMapElement == null) {
            return worldMapElement.getSprite(n, n);
        }
        try {
            if (n < 0) {
                if (n2 != 685104861) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final SpritePixels spritePixels = (SpritePixels)WorldMapElement.WorldMapElement_cachedSprites.wr(n);
                if (null == spritePixels) {
                    final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(WorldMapElement.WorldMapElement_archive, n, 0, -420746264);
                    if (null != spriteBuffer_getSprite) {
                        WorldMapElement.WorldMapElement_cachedSprites.put(spriteBuffer_getSprite, n);
                    }
                    return spriteBuffer_getSprite;
                }
                if (n2 != 685104861) {
                    throw new IllegalStateException();
                }
                return spritePixels;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hw.aq(" + ')');
        }
    }
    
    public static WorldMapElement ao(final int n) {
        if (n >= 0 && n < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[n] != null) {
            return WorldMapElement.WorldMapElement_cached[n];
        }
        return new WorldMapElement(n);
    }
    
    public int ak() {
        return this.objectId * 219774827;
    }
    
    void av() {
        if (this.field1480 != null) {
            for (int i = 0; i < this.field1480.length; i += 2) {
                if (this.field1480[i] < 2140325741 * this.field1499) {
                    this.field1499 = this.field1480[i] * -251176347;
                }
                else if (this.field1480[i] > this.field1496 * -1897586587) {
                    this.field1496 = this.field1480[i] * -281505427;
                }
                if (this.field1480[i + 1] < this.field1490 * -1117233973) {
                    this.field1490 = this.field1480[i + 1] * -517855005;
                }
                else if (this.field1480[i + 1] > -2068879661 * this.field1497) {
                    this.field1497 = this.field1480[i + 1] * -1539448485;
                }
            }
        }
    }
    
    public int az() {
        return this.objectId * 219774827;
    }
    
    void ax(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, 2070639109);
        }
    }
    
    public static WorldMapElement ay(final int n) {
        if (n >= 0 && n < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[n] != null) {
            return WorldMapElement.WorldMapElement_cached[n];
        }
        return new WorldMapElement(n);
    }
    
    static final void method988(final byte b) {
        try {
            if (ItemContainer.field844) {
                if (b != 1) {
                    throw new IllegalStateException();
                }
                for (int i = 0; i < -2010934433 * Players.Players_count; ++i) {
                    Player.ue(Client.players[Players.Players_indices[i]], 453146982);
                }
                ItemContainer.field844 = false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hw.ia(" + ')');
        }
    }
    
    void decode(final Buffer buffer, final int n) {
        if (n == 1) {
            this.sprite1 = buffer.method2516(549622661) * -771758991;
        }
        else if (n == 2) {
            this.sprite2 = buffer.method2516(696975810) * 1486786935;
        }
        else if (n == 3) {
            this.name = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 4) {
            this.field1484 = buffer.readMedium(-775187784) * 578146139;
        }
        else if (n == 5) {
            buffer.readMedium(1952843278);
        }
        else if (6 == n) {
            this.textSize = Buffer.ra(buffer, (byte)7) * 485929563;
        }
        else if (7 == n) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if ((ra & 0x1) == 0x0) {
                this.field1489 = false;
            }
            if ((ra & 0x2) == 0x2) {
                this.field1491 = true;
            }
        }
        else if (8 == n) {
            Buffer.ra(buffer, (byte)7);
        }
        else if (n >= 10 && n <= 14) {
            this.menuActions[n - 10] = buffer.readStringCp1252NullTerminated((byte)0);
        }
        else if (n == 15) {
            final int ra2 = Buffer.ra(buffer, (byte)7);
            this.field1480 = new int[2 * ra2];
            for (int i = 0; i < 2 * ra2; ++i) {
                this.field1480[i] = buffer.readUnsignedByte((byte)(-58));
            }
            buffer.readInt(-2103697005);
            this.field1500 = new int[Buffer.ra(buffer, (byte)7)];
            for (int j = 0; j < this.field1500.length; ++j) {
                this.field1500[j] = buffer.readInt(-1945807398);
            }
            this.field1501 = new byte[ra2];
            for (int k = 0; k < ra2; ++k) {
                this.field1501[k] = Buffer.wu(buffer, 435772489);
            }
        }
        else if (16 != n) {
            if (17 == n) {
                this.menuTargetName = buffer.readStringCp1252NullTerminated((byte)0);
            }
            else if (18 == n) {
                buffer.method2516(1995269976);
            }
            else if (19 == n) {
                this.category = buffer.readUnsignedShort(320886332) * -627392423;
            }
            else if (n == 21) {
                buffer.readInt(-985220343);
            }
            else if (22 == n) {
                buffer.readInt(-1988467718);
            }
            else if (23 == n) {
                Buffer.ra(buffer, (byte)7);
                Buffer.ra(buffer, (byte)7);
                Buffer.ra(buffer, (byte)7);
            }
            else if (n == 24) {
                buffer.readUnsignedByte((byte)(-22));
                buffer.readUnsignedByte((byte)(-2));
            }
            else if (25 == n) {
                buffer.method2516(1345373408);
            }
            else if (n == 28) {
                Buffer.ra(buffer, (byte)7);
            }
            else if (29 == n) {
                this.horizontalAlignment = (HorizontalAlignment)StructComposition.findEnumerated(class473.method2421((byte)(-45)), Buffer.ra(buffer, (byte)7), (short)173);
            }
            else if (30 == n) {
                this.verticalAlignment = (VerticalAlignment)StructComposition.findEnumerated(new VerticalAlignment[] { VerticalAlignment.field1605, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1610 }, Buffer.ra(buffer, (byte)7), (short)173);
            }
        }
    }
    
    public int getObjectId(final int n) {
        try {
            return this.objectId * 219774827;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hw.al(" + ')');
        }
    }
    
    public SpritePixels lk(final boolean b) {
        return this.getSpriteBool(b, -16711936);
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2) {
        try {
            if (n == 1) {
                if (n2 == 1750672475) {
                    throw new IllegalStateException();
                }
                this.sprite1 = buffer.method2516(422350142) * -771758991;
            }
            else if (n == 2) {
                if (n2 == 1750672475) {
                    return;
                }
                this.sprite2 = buffer.method2516(478002223) * 1486786935;
            }
            else if (n == 3) {
                this.name = buffer.readStringCp1252NullTerminated((byte)0);
            }
            else if (n == 4) {
                if (n2 == 1750672475) {
                    return;
                }
                this.field1484 = buffer.readMedium(990802201) * 578146139;
            }
            else if (n == 5) {
                buffer.readMedium(-836391510);
            }
            else if (6 == n) {
                if (n2 == 1750672475) {
                    return;
                }
                this.textSize = Buffer.ra(buffer, (byte)7) * 485929563;
            }
            else if (7 == n) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if ((ra & 0x1) == 0x0) {
                    if (n2 == 1750672475) {
                        return;
                    }
                    this.field1489 = false;
                }
                if ((ra & 0x2) == 0x2) {
                    if (n2 == 1750672475) {
                        return;
                    }
                    this.field1491 = true;
                }
            }
            else if (8 == n) {
                Buffer.ra(buffer, (byte)7);
            }
            else {
                if (n >= 10) {
                    if (n2 == 1750672475) {
                        return;
                    }
                    if (n <= 14) {
                        this.menuActions[n - 10] = buffer.readStringCp1252NullTerminated((byte)0);
                        return;
                    }
                }
                if (n == 15) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    this.field1480 = new int[2 * ra2];
                    for (int i = 0; i < 2 * ra2; ++i) {
                        if (n2 == 1750672475) {
                            return;
                        }
                        this.field1480[i] = buffer.readUnsignedByte((byte)(-119));
                    }
                    buffer.readInt(-1978085384);
                    this.field1500 = new int[Buffer.ra(buffer, (byte)7)];
                    for (int j = 0; j < this.field1500.length; ++j) {
                        if (n2 == 1750672475) {
                            throw new IllegalStateException();
                        }
                        this.field1500[j] = buffer.readInt(-1896571749);
                    }
                    this.field1501 = new byte[ra2];
                    for (int k = 0; k < ra2; ++k) {
                        if (n2 == 1750672475) {
                            throw new IllegalStateException();
                        }
                        this.field1501[k] = Buffer.wu(buffer, 435772489);
                    }
                }
                else if (16 == n) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                }
                else if (17 == n) {
                    this.menuTargetName = buffer.readStringCp1252NullTerminated((byte)0);
                }
                else if (18 == n) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                    buffer.method2516(-66916527);
                }
                else if (19 == n) {
                    this.category = buffer.readUnsignedShort(-1959309969) * -627392423;
                }
                else if (n == 21) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                    buffer.readInt(-1819704685);
                }
                else if (22 == n) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                    buffer.readInt(-1240763908);
                }
                else if (23 == n) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                    Buffer.ra(buffer, (byte)7);
                    Buffer.ra(buffer, (byte)7);
                    Buffer.ra(buffer, (byte)7);
                }
                else if (n == 24) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                    buffer.readUnsignedByte((byte)(-47));
                    buffer.readUnsignedByte((byte)(-12));
                }
                else if (25 == n) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                    buffer.method2516(2129948577);
                }
                else if (n == 28) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                    Buffer.ra(buffer, (byte)7);
                }
                else if (29 == n) {
                    this.horizontalAlignment = (HorizontalAlignment)StructComposition.findEnumerated(class473.method2421((byte)(-126)), Buffer.ra(buffer, (byte)7), (short)173);
                }
                else if (30 == n) {
                    if (n2 == 1750672475) {
                        throw new IllegalStateException();
                    }
                    this.verticalAlignment = (VerticalAlignment)StructComposition.findEnumerated(new VerticalAlignment[] { VerticalAlignment.field1605, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1610 }, Buffer.ra(buffer, (byte)7), (short)173);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hw.ac(" + ')');
        }
    }
    
    void method985(final int n) {
        try {
            if (this.field1480 != null) {
                if (n != 262144) {
                    throw new IllegalStateException();
                }
                for (int i = 0; i < this.field1480.length; i += 2) {
                    if (this.field1480[i] < 2140325741 * this.field1499) {
                        if (n != 262144) {
                            throw new IllegalStateException();
                        }
                        this.field1499 = this.field1480[i] * -251176347;
                    }
                    else if (this.field1480[i] > this.field1496 * -1897586587) {
                        if (n != 262144) {
                            throw new IllegalStateException();
                        }
                        this.field1496 = this.field1480[i] * -281505427;
                    }
                    if (this.field1480[i + 1] < this.field1490 * -1117233973) {
                        if (n != 262144) {
                            throw new IllegalStateException();
                        }
                        this.field1490 = this.field1480[i + 1] * -517855005;
                    }
                    else if (this.field1480[i + 1] > -2068879661 * this.field1497) {
                        if (n != 262144) {
                            throw new IllegalStateException();
                        }
                        this.field1497 = this.field1480[i + 1] * -1539448485;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hw.au(" + ')');
        }
    }
    
    public static boolean aa(final AbstractArchive abstractArchive, final AbstractArchive worldMapElement_archive) {
        WorldMapElement.WorldMapElement_archive = worldMapElement_archive;
        if (!abstractArchive.isFullyLoaded((short)128)) {
            return false;
        }
        class328.WorldMapElement_count = abstractArchive.getGroupFileCount(35, (byte)40) * 827991417;
        WorldMapElement.WorldMapElement_cached = new WorldMapElement[class328.WorldMapElement_count * -1703136055];
        for (int i = 0; i < class328.WorldMapElement_count * -1703136055; ++i) {
            final byte[] takeFile = abstractArchive.takeFile(35, i, (byte)(-28));
            WorldMapElement.WorldMapElement_cached[i] = new WorldMapElement(i);
            if (takeFile != null) {
                WorldMapElement.WorldMapElement_cached[i].ag(new Buffer(takeFile), -1056093346);
                WorldMapElement.WorldMapElement_cached[i].method985(262144);
            }
        }
        return true;
    }
    
    void ai(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            this.decodeNext(buffer, ra, 1522254283);
        }
    }
    
    void ar() {
        if (this.field1480 != null) {
            for (int i = 0; i < this.field1480.length; i += 2) {
                if (this.field1480[i] < 2140325741 * this.field1499) {
                    this.field1499 = this.field1480[i] * -787885789;
                }
                else if (this.field1480[i] > this.field1496 * -1897586587) {
                    this.field1496 = this.field1480[i] * -281505427;
                }
                if (this.field1480[i + 1] < this.field1490 * -1117233973) {
                    this.field1490 = this.field1480[i + 1] * -517855005;
                }
                else if (this.field1480[i + 1] > -2068879661 * this.field1497) {
                    this.field1497 = this.field1480[i + 1] * -1539448485;
                }
            }
        }
    }
    
    public SpritePixels getSpriteBool(final boolean b, final int n) {
        try {
            int n2;
            if (b) {
                if (n != -16711936) {
                    throw new IllegalStateException();
                }
                n2 = this.sprite2 * 2035390535;
            }
            else {
                n2 = 1458003089 * this.sprite1;
            }
            return fd(this, n2, 685104861);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hw.ab(" + ')');
        }
    }
    
    SpritePixels getSprite(final int n, final int n2) {
        try {
            if (n < 0) {
                if (n2 != 685104861) {
                    throw new IllegalStateException();
                }
                return null;
            }
            else {
                final SpritePixels spritePixels = (SpritePixels)WorldMapElement.WorldMapElement_cachedSprites.get(n);
                if (null == spritePixels) {
                    final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(WorldMapElement.WorldMapElement_archive, n, 0, -420746264);
                    if (null != spriteBuffer_getSprite) {
                        WorldMapElement.WorldMapElement_cachedSprites.put(spriteBuffer_getSprite, n);
                    }
                    return spriteBuffer_getSprite;
                }
                if (n2 != 685104861) {
                    throw new IllegalStateException();
                }
                return spritePixels;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hw.aq(" + ')');
        }
    }
    
    SpritePixels aj(final int n) {
        if (n < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)WorldMapElement.WorldMapElement_cachedSprites.wr(n);
        if (null != spritePixels) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(WorldMapElement.WorldMapElement_archive, n, 0, 1829126473);
        if (null != spriteBuffer_getSprite) {
            WorldMapElement.WorldMapElement_cachedSprites.put(spriteBuffer_getSprite, n);
        }
        return spriteBuffer_getSprite;
    }
    
    void ag(final Buffer buffer, final int n) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                this.decodeNext(buffer, ra, 1073520708);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "hw.aw(" + ')');
        }
    }
    
    public static SpritePixels hk(final WorldMapElement worldMapElement, final int n) {
        if (worldMapElement == null) {
            worldMapElement.ak();
        }
        if (n < 0) {
            return null;
        }
        final SpritePixels spritePixels = (SpritePixels)WorldMapElement.WorldMapElement_cachedSprites.wr(n);
        if (null != spritePixels) {
            return spritePixels;
        }
        final SpritePixels spriteBuffer_getSprite = class484.SpriteBuffer_getSprite(WorldMapElement.WorldMapElement_archive, n, 0, -1965970692);
        if (null != spriteBuffer_getSprite) {
            WorldMapElement.WorldMapElement_cachedSprites.put(spriteBuffer_getSprite, n);
        }
        return spriteBuffer_getSprite;
    }
    
    void ah() {
        if (this.field1480 != null) {
            for (int i = 0; i < this.field1480.length; i += 2) {
                if (this.field1480[i] < 2140325741 * this.field1499) {
                    this.field1499 = this.field1480[i] * -251176347;
                }
                else if (this.field1480[i] > this.field1496 * -1897586587) {
                    this.field1496 = this.field1480[i] * -281505427;
                }
                if (this.field1480[i + 1] < this.field1490 * -1117233973) {
                    this.field1490 = this.field1480[i + 1] * -517855005;
                }
                else if (this.field1480[i + 1] > -2068879661 * this.field1497) {
                    this.field1497 = this.field1480[i + 1] * -1539448485;
                }
            }
        }
    }
    
    public int getCategory() {
        return this.category * -461862935;
    }
}
