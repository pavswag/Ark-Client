import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.api.WorldMapData;

// 
// Decompiled by Procyon v0.5.36
// 

public class WorldMapArea implements WorldMapData
{
    int regionHighX;
    String internalName;
    String externalName;
    int backGroundColor;
    int zoom;
    LinkedList sections;
    int regionLowX;
    Coord origin;
    int regionLowY;
    int regionHighY;
    boolean isMain;
    int id;
    public static final int bd = 56;
    
    public WorldMapArea() {
        this.id = 1431885777;
        this.backGroundColor = 1277906969;
        this.zoom = 1102813389;
        this.origin = null;
        this.regionLowX = 325424625;
        this.regionHighX = 0;
        this.regionLowY = -498392157;
        this.regionHighY = 0;
        this.isMain = false;
    }
    
    public static boolean cs(final WorldMapArea worldMapArea, final int n, final int n2, final int n3) {
        final Iterator iterator = worldMapArea.sections.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().containsCoord(n, n2, n3, (byte)(-107))) {
                return true;
            }
        }
        return false;
    }
    
    public String bs() {
        return this.internalName;
    }
    
    public int ca() {
        return 71630679 * this.origin.y;
    }
    
    public int ba() {
        return -1157501957 * this.zoom;
    }
    
    public static int ae(final WorldMapArea worldMapArea) {
        return worldMapArea.regionHighX * 1854846129;
    }
    
    public int ce() {
        return -113644749 * this.origin.plane;
    }
    
    public boolean bb(final int n, final int n2) {
        final int n3 = n / 64;
        final int n4 = n2 / 64;
        if (n3 < this.regionLowX * 77939951 || n3 > this.regionHighX * 1854846129) {
            return false;
        }
        if (n4 >= 2059655157 * this.regionLowY && n4 <= -1086956513 * this.regionHighY) {
            final Iterator iterator = this.sections.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().containsPosition(n, n2, -1801197276)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static boolean nb(final WorldMapArea worldMapArea, final int n, final int n2, final int n3) {
        if (worldMapArea == null) {
            return worldMapArea.containsPosition(n, n, n);
        }
        try {
            final int n4 = n / 64;
            final int n5 = n2 / 64;
            if (n4 >= worldMapArea.regionLowX * 77939951) {
                if (n4 <= worldMapArea.regionHighX * 1854846129) {
                    if (n5 >= 2059655157 * worldMapArea.regionLowY) {
                        if (n3 <= 1528990176) {
                            throw new IllegalStateException();
                        }
                        if (n5 <= -1086956513 * worldMapArea.regionHighY) {
                            final Iterator iterator = worldMapArea.sections.iterator();
                            while (iterator.hasNext()) {
                                if (n3 <= 1528990176) {
                                    throw new IllegalStateException();
                                }
                                if (iterator.next().containsPosition(n, n2, -1749100775)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        if (n3 <= 1528990176) {
                            throw new IllegalStateException();
                        }
                    }
                    return false;
                }
                if (n3 <= 1528990176) {
                    throw new IllegalStateException();
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ac(" + ')');
        }
    }
    
    public int cn() {
        return -884180522 * this.origin.y;
    }
    
    public static int tg(final WorldMapArea worldMapArea) {
        return 2096256750 * worldMapArea.origin.plane;
    }
    
    public int bw() {
        return this.regionHighY * 1845792372;
    }
    
    public Coord cf() {
        return new Coord(this.origin);
    }
    
    int getBackGroundColor(final int n) {
        try {
            return -1302793257 * this.backGroundColor;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ao(" + ')');
        }
    }
    
    public boolean getIsMain(final int n) {
        try {
            return this.isMain;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.at(" + ')');
        }
    }
    
    public void ak(final Buffer buffer, final int n) {
        this.zoom = n * -1431885777;
        this.internalName = buffer.readStringCp1252NullTerminatedOrNull((byte)0);
        this.externalName = buffer.readStringCp1252NullTerminated((byte)0);
        this.origin = new Coord(buffer.readSignedShortAddLE(-1457787402));
        this.zoom = buffer.readUnsignedShortAddLE(-1438039092) * -1277906969;
        Buffer.ra(buffer, (byte)7);
        this.isMain = (Buffer.ra(buffer, (byte)7) == 1);
        this.regionHighY = Buffer.ra(buffer, (byte)7) * -1102813389;
        final int ra = Buffer.ra(buffer, (byte)7);
        this.sections = new LinkedList();
        for (int i = 0; i < ra; ++i) {
            this.sections.add(this.readWorldMapSection(buffer, 427135973));
        }
        this.setBounds(1031445825);
    }
    
    public int getRegionHighY(final int n) {
        try {
            return this.regionHighY * -1086956513;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.av(" + ')');
        }
    }
    
    public int[] be(final int n, final int n2, final int n3) {
        for (final WorldMapSection worldMapSection : this.sections) {
            if (worldMapSection.containsCoord(n, n2, n3, (byte)(-79))) {
                return worldMapSection.getBorderTileLengths(n, n2, n3, (byte)8);
            }
        }
        return null;
    }
    
    public int getOriginY(final int n) {
        try {
            return -2105445199 * this.origin.y;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.as(" + ')');
        }
    }
    
    public static void eh(final WorldMapArea worldMapArea) {
        if (worldMapArea == null) {
            worldMapArea.cu();
        }
        final Iterator iterator = worldMapArea.sections.iterator();
        while (iterator.hasNext()) {
            iterator.next().expandBounds(worldMapArea, 1484327916);
        }
    }
    
    public int getZoom(final int n) {
        try {
            return -1157501957 * this.zoom;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ax(" + ')');
        }
    }
    
    public String getExternalName(final short n) {
        try {
            return this.externalName;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ay(" + ')');
        }
    }
    
    public int[] bi(final int n, final int n2, final int n3) {
        for (final WorldMapSection worldMapSection : this.sections) {
            if (worldMapSection.containsCoord(n, n2, n3, (byte)(-61))) {
                return worldMapSection.getBorderTileLengths(n, n2, n3, (byte)67);
            }
        }
        return null;
    }
    
    public int bv() {
        return this.regionLowX * 77939951;
    }
    
    public Coord bo(final int n, final int n2) {
        for (final WorldMapSection worldMapSection : this.sections) {
            if (worldMapSection.containsPosition(n, n2, -2036119834)) {
                return worldMapSection.coord(n, n2, (byte)3);
            }
        }
        return null;
    }
    
    public int cc() {
        return -113644749 * this.origin.plane;
    }
    
    void bt() {
        final Iterator iterator = this.sections.iterator();
        while (iterator.hasNext()) {
            iterator.next().expandBounds(this, 1624384171);
        }
    }
    
    public int bc() {
        return 2059655157 * this.regionLowY;
    }
    
    public String br() {
        return this.externalName;
    }
    
    public boolean containsCoord(final int n, final int n2, final int n3, final int n4) {
        try {
            final Iterator iterator = this.sections.iterator();
            while (iterator.hasNext()) {
                if (n4 >= 330654524) {
                    throw new IllegalStateException();
                }
                if (!iterator.next().containsCoord(n, n2, n3, (byte)0)) {
                    continue;
                }
                if (n4 >= 330654524) {
                    throw new IllegalStateException();
                }
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.aw(" + ')');
        }
    }
    
    public int getOriginPlane(final int n) {
        try {
            return -113644749 * this.origin.plane;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.am(" + ')');
        }
    }
    
    public int getId(final int n) {
        try {
            return this.backGroundColor * 1286545103;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.al(" + ')');
        }
    }
    
    public static boolean getId(final WorldMapArea worldMapArea, final int n) {
        if (worldMapArea == null) {
            return worldMapArea.getIsMain(n);
        }
        try {
            return worldMapArea.isMain;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.at(" + ')');
        }
    }
    
    public int cu() {
        return -2105445199 * this.origin.y;
    }
    
    public static int readWorldMapSection(final Buffer buffer, final String s, final int n) {
        try {
            final int n2 = -1633313603 * buffer.offset;
            final byte[] method1176 = RouteStrategy.method1176(s, 267322236);
            buffer.writeIntME(method1176.length, (byte)(-101));
            buffer.offset += class319.huffman.compress(method1176, 0, method1176.length, buffer.array, -1633313603 * buffer.offset, -452451300) * -1516355947;
            return buffer.offset * -1633313603 - n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.an(" + ')');
        }
    }
    
    WorldMapSection readWorldMapSection(final Buffer buffer, final int n) {
        try {
            WorldMapSection worldMapSection = null;
            switch (((WorldMapSectionType)StructComposition.findEnumerated(WorldMapSectionType.method1508(-1754346109), Buffer.ra(buffer, (byte)7), (short)173)).type * -1627349533) {
                default: {
                    throw new IllegalStateException("");
                }
                case 3: {
                    worldMapSection = new WorldMapSection0();
                    break;
                }
                case 2: {
                    worldMapSection = new class252();
                    break;
                }
                case 1: {
                    worldMapSection = new WorldMapSection2();
                    break;
                }
                case 0: {
                    worldMapSection = new WorldMapSection1();
                    break;
                }
            }
            worldMapSection.read(buffer, (byte)0);
            return worldMapSection;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.an(" + ')');
        }
    }
    
    public boolean containsPosition(final int n, final int n2, final int n3) {
        try {
            final int n4 = n / 64;
            final int n5 = n2 / 64;
            if (n4 >= this.regionHighY * 77939951) {
                if (n4 <= this.regionHighY * 1854846129) {
                    if (n5 >= 2059655157 * this.regionHighY) {
                        if (n3 <= 1528990176) {
                            throw new IllegalStateException();
                        }
                        if (n5 <= -1086956513 * this.regionLowX) {
                            final Iterator iterator = this.sections.iterator();
                            while (iterator.hasNext()) {
                                if (n3 <= 1528990176) {
                                    throw new IllegalStateException();
                                }
                                if (iterator.next().containsPosition(n, n2, -1749100775)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        if (n3 <= 1528990176) {
                            throw new IllegalStateException();
                        }
                    }
                    return false;
                }
                if (n3 <= 1528990176) {
                    throw new IllegalStateException();
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ac(" + ')');
        }
    }
    
    public static Coord io(final WorldMapArea worldMapArea, final int n, final int n2) {
        for (final WorldMapSection worldMapSection : worldMapArea.sections) {
            if (worldMapSection.containsPosition(n, n2, -1876668550)) {
                return worldMapSection.coord(n, n2, (byte)(-51));
            }
        }
        return null;
    }
    
    public static void ec(final WorldMapArea worldMapArea, final Buffer buffer, final int n) {
        if (worldMapArea == null) {
            worldMapArea.ak(buffer, n);
        }
        worldMapArea.id = n * -1431885777;
        worldMapArea.internalName = buffer.readStringCp1252NullTerminated((byte)0);
        worldMapArea.externalName = buffer.readStringCp1252NullTerminated((byte)0);
        worldMapArea.origin = new Coord(buffer.readInt(-1457787402));
        worldMapArea.backGroundColor = buffer.readInt(-1438039092) * -1277906969;
        Buffer.ra(buffer, (byte)7);
        worldMapArea.isMain = (Buffer.ra(buffer, (byte)7) == 1);
        worldMapArea.zoom = Buffer.ra(buffer, (byte)7) * -1102813389;
        final int ra = Buffer.ra(buffer, (byte)7);
        worldMapArea.sections = new LinkedList();
        for (int i = 0; i < ra; ++i) {
            worldMapArea.sections.add(worldMapArea.readWorldMapSection(buffer, 427135973));
        }
        worldMapArea.setBounds(1031445825);
    }
    
    int bq() {
        return -1302793257 * this.backGroundColor;
    }
    
    public static boolean do(final WorldMapArea worldMapArea, final int n, final int n2) {
        if (worldMapArea == null) {
            worldMapArea.ce();
        }
        final int n3 = n / -1409094024;
        final int n4 = n2 / 810003258;
        if (n3 < worldMapArea.regionLowX * 77939951 || n3 > worldMapArea.regionHighX * 1854846129) {
            return false;
        }
        if (n4 < 2059655157 * worldMapArea.regionLowY || n4 > -1086956513 * worldMapArea.regionHighY) {
            return false;
        }
        final Iterator iterator = worldMapArea.sections.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().containsPosition(n, n2, -1618535392)) {
                return true;
            }
        }
        return false;
    }
    
    public int[] position(final int n, final int n2, final int n3, final byte b) {
        try {
            final Iterator iterator = this.sections.iterator();
            while (iterator.hasNext()) {
                if (b != 6) {
                    throw new IllegalStateException();
                }
                final WorldMapSection worldMapSection = iterator.next();
                if (!worldMapSection.containsCoord(n, n2, n3, (byte)3)) {
                    continue;
                }
                if (b != 6) {
                    throw new IllegalStateException();
                }
                return worldMapSection.getBorderTileLengths(n, n2, n3, (byte)21);
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.au(" + ')');
        }
    }
    
    public String getInternalName(final int n) {
        try {
            return this.internalName;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.aa(" + ')');
        }
    }
    
    public static void getRegionLowX(final int n, final int n2, final byte b) {
        try {
            final int n3 = Rasterizer3D.clips.Rasterizer3D_rowOffsets[0];
            final int n4 = n3 / Rasterizer2D.Rasterizer2D_width;
            Rasterizer3D.clips.method1359(n, n3 - n4 * Rasterizer2D.Rasterizer2D_width, n2, n4, (byte)93);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ai(" + ')');
        }
    }
    
    public int getRegionLowX(final int n) {
        try {
            return this.regionLowX * 77939951;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ai(" + ')');
        }
    }
    
    public int bh() {
        return this.regionHighY * -1024757870;
    }
    
    public boolean by(final int n, final int n2) {
        final int n3 = n / 64;
        final int n4 = n2 / 64;
        if (n3 < this.regionLowX * -2086288917 || n3 > this.regionHighX * 688000845) {
            return false;
        }
        if (n4 >= -1731686749 * this.regionLowY && n4 <= 869548299 * this.regionHighY) {
            final Iterator iterator = this.sections.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().containsPosition(n, n2, -1975299563)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public Coord bx(final int n, final int n2) {
        for (final WorldMapSection worldMapSection : this.sections) {
            if (worldMapSection.containsPosition(n, n2, -1865324662)) {
                return worldMapSection.coord(n, n2, (byte)2);
            }
        }
        return null;
    }
    
    public int getOriginX(final byte b) {
        try {
            return -96298701 * this.origin.x;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ar(" + ')');
        }
    }
    
    void bd() {
        final Iterator iterator = this.sections.iterator();
        while (iterator.hasNext()) {
            iterator.next().expandBounds(this, 1388017855);
        }
    }
    
    public Coord cm() {
        return new Coord(this.origin);
    }
    
    public void read(final Buffer buffer, final int n, final byte b) {
        try {
            this.id = n * -1431885777;
            this.internalName = buffer.readStringCp1252NullTerminated((byte)0);
            this.externalName = buffer.readStringCp1252NullTerminated((byte)0);
            this.origin = new Coord(buffer.readInt(-1171776262));
            this.backGroundColor = buffer.readInt(-1922477430) * -1277906969;
            Buffer.ra(buffer, (byte)7);
            boolean isMain;
            if (Buffer.ra(buffer, (byte)7) == 1) {
                if (b >= 34) {
                    throw new IllegalStateException();
                }
                isMain = true;
            }
            else {
                isMain = false;
            }
            this.isMain = isMain;
            this.zoom = Buffer.ra(buffer, (byte)7) * -1102813389;
            final int ra = Buffer.ra(buffer, (byte)7);
            this.sections = new LinkedList();
            for (int i = 0; i < ra; ++i) {
                if (b >= 34) {
                    throw new IllegalStateException();
                }
                this.sections.add(this.readWorldMapSection(buffer, 427135973));
            }
            this.setBounds(1510562162);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.af(" + ')');
        }
    }
    
    public String bn() {
        return this.internalName;
    }
    
    public Coord coord(final int n, final int n2, final int n3) {
        try {
            final Iterator iterator = this.sections.iterator();
            while (iterator.hasNext()) {
                if (n3 <= 1138438549) {
                    throw new IllegalStateException();
                }
                final WorldMapSection worldMapSection = iterator.next();
                if (!worldMapSection.containsPosition(n, n2, -1795894381)) {
                    continue;
                }
                if (n3 <= 1138438549) {
                    throw new IllegalStateException();
                }
                return worldMapSection.coord(n, n2, (byte)(-4));
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ab(" + ')');
        }
    }
    
    void setBounds(final int n) {
        try {
            final Iterator iterator = this.sections.iterator();
            while (iterator.hasNext()) {
                if (n <= -1040917986) {
                    return;
                }
                iterator.next().expandBounds(this, 1131699138);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.aq(" + ')');
        }
    }
    
    public Coord getOrigin(final byte b) {
        try {
            return new Coord(this.origin);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.aj(" + ')');
        }
    }
    
    public int getRegionHighX(final int n) {
        try {
            return this.regionHighX * 1854846129;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ag(" + ')');
        }
    }
    
    public int bl() {
        return this.regionHighX * 1854846129;
    }
    
    public int bj() {
        return this.id * 1286545103;
    }
    
    public boolean surfaceContainsPosition(final int n, final int n2) {
        return nb(this, n, n2, 1764440845);
    }
    
    public static WorldMapSection xv(final WorldMapArea worldMapArea, final Buffer buffer) {
        if (worldMapArea == null) {
            worldMapArea.cq();
        }
        WorldMapSection worldMapSection = null;
        switch (((WorldMapSectionType)StructComposition.findEnumerated(WorldMapSectionType.method1508(-1754346109), Buffer.ra(buffer, (byte)7), (short)173)).type * -122960136) {
            case 0: {
                worldMapSection = new WorldMapSection1();
                break;
            }
            default: {
                throw new IllegalStateException("");
            }
            case 2: {
                worldMapSection = new class252();
                break;
            }
            case 1: {
                worldMapSection = new WorldMapSection2();
                break;
            }
            case 3: {
                worldMapSection = new WorldMapSection0();
                break;
            }
        }
        worldMapSection.read(buffer, (byte)0);
        return worldMapSection;
    }
    
    public Coord cq() {
        return new Coord(this.origin);
    }
    
    public Coord bk(final int n, final int n2) {
        for (final WorldMapSection worldMapSection : this.sections) {
            if (worldMapSection.containsPosition(n, n2, -2136012999)) {
                return worldMapSection.coord(n, n2, (byte)(-79));
            }
        }
        return null;
    }
    
    public int getRegionLowY(final int n) {
        try {
            return 2059655157 * this.regionLowY;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ah(" + ')');
        }
    }
    
    public static boolean qj(final WorldMapArea worldMapArea, final int n, final int n2, final int n3) {
        if (worldMapArea == null) {
            worldMapArea.bc();
        }
        final Iterator iterator = worldMapArea.sections.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().containsCoord(n, n2, n3, (byte)(-43))) {
                return true;
            }
        }
        return false;
    }
    
    public static int wo(final WorldMapArea worldMapArea, final int n) {
        if (worldMapArea == null) {
            return worldMapArea.getId(n);
        }
        try {
            return worldMapArea.id * 1286545103;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.al(" + ')');
        }
    }
    
    public static int uz(final WorldMapArea worldMapArea, final int n) {
        if (worldMapArea == null) {
            worldMapArea.getZoom(n);
        }
        try {
            return -1157501957 * worldMapArea.zoom;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.ax(" + ')');
        }
    }
    
    int bf() {
        return -1302793257 * this.backGroundColor;
    }
    
    int method1431() {
        return -34939641 * this.backGroundColor;
    }
    
    static int method1431(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (n == 6500) {
                if (n2 == -1070349132) {
                    throw new IllegalStateException();
                }
                final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                final int n3 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                boolean b2;
                if (Players.loadWorlds(-2097984355)) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                interpreter_intStack[n3] = (b2 ? 1 : 0);
                return 1;
            }
            else if (6501 == n) {
                if (n2 == -1070349132) {
                    throw new IllegalStateException();
                }
                final World worldListStart = FaceNormal.worldListStart(-285053165);
                if (null != worldListStart) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = worldListStart.id * -2091224171;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1810954985 * worldListStart.properties;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = worldListStart.activity;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -665846519 * worldListStart.location;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = worldListStart.population * -1396846889;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = worldListStart.host;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                }
                return 1;
            }
            else if (6502 == n) {
                if (n2 == -1070349132) {
                    throw new IllegalStateException();
                }
                final World nextWorldListWorld = Interpreter.getNextWorldListWorld(1711407599);
                if (null != nextWorldListWorld) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2091224171 * nextWorldListWorld.id;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1810954985 * nextWorldListWorld.properties;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = nextWorldListWorld.activity;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = nextWorldListWorld.location * -665846519;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1396846889 * nextWorldListWorld.population;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = nextWorldListWorld.host;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                }
                return 1;
            }
            else if (6506 == n) {
                if (n2 == -1070349132) {
                    throw new IllegalStateException();
                }
                final int n4 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                World world = null;
                int i = 0;
                while (i < -734287707 * World.World_count) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    if (n4 == class31.World_worlds[i].id * -2091224171) {
                        if (n2 == -1070349132) {
                            throw new IllegalStateException();
                        }
                        world = class31.World_worlds[i];
                        break;
                    }
                    else {
                        ++i;
                    }
                }
                if (world != null) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = world.id * -2091224171;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = world.properties * 1810954985;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = world.activity;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = world.location * -665846519;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1396846889 * world.population;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = world.host;
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                }
                return 1;
            }
            else if (6507 == n) {
                if (n2 == -1070349132) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 1708543892;
                final int n5 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                boolean b3;
                if (1 == Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1]) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                final boolean b4 = b3;
                final int n6 = Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539];
                boolean b5;
                if (1 == Interpreter.Interpreter_intStack[3 + Interpreter.Interpreter_intStackSize * -964267539]) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    b5 = true;
                }
                else {
                    b5 = false;
                }
                class127.sortWorldList(n5, b4, n6, b5, (byte)(-41));
                return 1;
            }
            else if (n == 6511) {
                if (n2 == -1070349132) {
                    throw new IllegalStateException();
                }
                final int n7 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                if (n7 >= 0) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    if (n7 < -734287707 * World.World_count) {
                        if (n2 == -1070349132) {
                            throw new IllegalStateException();
                        }
                        final World world2 = class31.World_worlds[n7];
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = world2.id * -2091224171;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = world2.properties * 1810954985;
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = world2.activity;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -665846519 * world2.location;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = world2.population * -1396846889;
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = world2.host;
                        return 1;
                    }
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                return 1;
            }
            else if (6512 == n) {
                if (n2 == -1070349132) {
                    throw new IllegalStateException();
                }
                Client.followerOpsLowPriority = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1);
                return 1;
            }
            else if (n == 6513) {
                if (n2 == -1070349132) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                final int n8 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                final int n9 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
                final ParamComposition paramDefinition = class33.getParamDefinition(n9, -2136989447);
                if (paramDefinition.isString(-1346057295)) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = NPCComposition.vy(AbstractArchive.getNpcDefinition(n8, (byte)(-72)), n9, paramDefinition.defaultStr, 1361992151);
                }
                else {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = AbstractArchive.getNpcDefinition(n8, (byte)5).getIntParam(n9, -171401431 * paramDefinition.defaultInt, 1858319582);
                }
                return 1;
            }
            else {
                if (6514 == n) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    final int n10 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                    final int n11 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                    final ParamComposition paramDefinition2 = class33.getParamDefinition(n11, 882045221);
                    if (paramDefinition2.isString(-29176075)) {
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class144.vmethod3248(n10, (short)10855).getStringParam(n11, paramDefinition2.defaultStr, 1804170179);
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class144.vmethod3248(n10, (short)7278).getIntParam(n11, paramDefinition2.defaultInt * -171401431, -1848862363);
                    }
                    return 1;
                }
                if (6515 == n) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    final int n12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                    final int n13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1];
                    final ParamComposition paramDefinition3 = class33.getParamDefinition(n13, -824505620);
                    if (paramDefinition3.isString(-1879450059)) {
                        if (n2 == -1070349132) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = HealthBarUpdate.set(n12, (byte)107).getStringParam(n13, paramDefinition3.defaultStr, (byte)0);
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = HealthBarUpdate.set(n12, (byte)116).getIntParam(n13, -171401431 * paramDefinition3.defaultInt, (byte)119);
                    }
                    return 1;
                }
                else if (6516 == n) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    final int n14 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                    final int n15 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                    final ParamComposition paramDefinition4 = class33.getParamDefinition(n15, 25604063);
                    if (paramDefinition4.isString(609786096)) {
                        if (n2 == -1070349132) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = class195.StructDefinition_getStructDefinition(n14, -680528429).getStringParam(n15, paramDefinition4.defaultStr, 1937714582);
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class195.StructDefinition_getStructDefinition(n14, -1923524011).getIntParam(n15, -171401431 * paramDefinition4.defaultInt, (byte)(-33));
                    }
                    return 1;
                }
                else if (6518 == n) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                    final int n16 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                    boolean b6;
                    if (Client.onMobile) {
                        if (n2 == -1070349132) {
                            throw new IllegalStateException();
                        }
                        b6 = true;
                    }
                    else {
                        b6 = false;
                    }
                    interpreter_intStack2[n16] = (b6 ? 1 : 0);
                    return 1;
                }
                else if (6519 == n) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.clientType * -749752677;
                    return 1;
                }
                else if (6520 == n) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    return 1;
                }
                else if (n == 6521) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    return 1;
                }
                else if (n == 6522) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                    Interpreter.Interpreter_intStackSize -= 427135973;
                    return 1;
                }
                else if (n == 6523) {
                    if (n2 == -1070349132) {
                        throw new IllegalStateException();
                    }
                    SecureRandomCallable.Interpreter_stringStackSize += 1086551379;
                    Interpreter.Interpreter_intStackSize -= 427135973;
                    return 1;
                }
                else {
                    if (n == 6524) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        return 1;
                    }
                    if (6525 == n) {
                        if (n2 == -1070349132) {
                            throw new IllegalStateException();
                        }
                        return Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                    }
                    else if (6526 == n) {
                        if (n2 == -1070349132) {
                            throw new IllegalStateException();
                        }
                        return Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                    }
                    else {
                        if (n != 6527) {
                            return 2;
                        }
                        if (n2 == -1070349132) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 838232771 * Client.field363;
                        return 1;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "js.bu(" + ')');
        }
    }
}
