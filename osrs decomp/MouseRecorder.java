// 
// Decompiled by Procyon v0.5.36
// 

public class MouseRecorder implements Runnable
{
    int[] ys;
    Object lock;
    int index;
    int[] xs;
    static final int bo = 16;
    long[] millis;
    public static final int ag = 18;
    static final float ay = 1.0075567f;
    boolean isRunning;
    public static int ItemDefinition_fileCount;
    
    MouseRecorder() {
        this.isRunning = true;
        this.lock = new Object();
        this.index = 0;
        this.xs = new int[500];
        this.ys = new int[500];
        this.millis = new long[500];
    }
    
    @Override
    public void run() {
        try {
            while (this.isRunning) {
                synchronized (this.lock) {
                    if (this.index * 535437747 < 500) {
                        this.xs[535437747 * this.index] = MouseHandler.MouseHandler_x * -2063363905;
                        this.ys[535437747 * this.index] = -1224153235 * MouseHandler.MouseHandler_y;
                        this.millis[this.index * 535437747] = -1090234605399222665L * MouseHandler.MouseHandler_millis;
                        this.index -= 1762036357;
                    }
                }
                PlayerComposition.method1692(50L);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dl.run(" + ')');
        }
    }
    
    static final boolean method494(final char c, final int n) {
        try {
            if (c != ' ' && ' ' != c && c != '_') {
                if (n <= 664087626) {
                    throw new IllegalStateException();
                }
                if ('-' != c) {
                    return false;
                }
                if (n <= 664087626) {
                    throw new IllegalStateException();
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dl.an(" + ')');
        }
    }
    
    public void gd() {
        while (this.isRunning) {
            synchronized (this.lock) {
                if (this.index * 535437747 < 500) {
                    this.xs[535437747 * this.index] = MouseHandler.MouseHandler_x * -2063363905;
                    this.ys[535437747 * this.index] = -1224153235 * MouseHandler.MouseHandler_y;
                    this.millis[this.index * 535437747] = -1090234605399222665L * MouseHandler.MouseHandler_millis;
                    this.index -= 1762036357;
                }
            }
            PlayerComposition.method1692(50L);
        }
    }
    
    static Message Messages_getMessage(final int n, final byte b) {
        try {
            return (Message)Messages.Messages_hashTable.aa(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dl.au(" + ')');
        }
    }
    
    public void gy() {
        while (this.isRunning) {
            synchronized (this.lock) {
                if (this.index * 535437747 < 500) {
                    this.xs[535437747 * this.index] = MouseHandler.MouseHandler_x * -2063363905;
                    this.ys[535437747 * this.index] = -1224153235 * MouseHandler.MouseHandler_y;
                    this.millis[this.index * 535437747] = -1090234605399222665L * MouseHandler.MouseHandler_millis;
                    this.index -= 1762036357;
                }
            }
            PlayerComposition.method1692(50L);
        }
    }
    
    static int method496(final int n, final Script script, final boolean b, final int n2) {
        try {
            if (6600 == n) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                class88.getWorldMap(1134308322).method2381(GameEngine.Client_plane * -1727408401, (MusicPatchNode.localPlayer.br * 1144428983 >> 7) + WorldMapData_0.baseX * -1232093375, GameObject.baseY * 827352769 + (-411750205 * MusicPatchNode.localPlayer.ep >> 7), true, (byte)15);
                return 1;
            }
            else if (n == 6601) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                String externalName = "";
                final WorldMapArea mapArea = class88.getWorldMap(1542614617).getMapArea(n3, -1827173071);
                if (null != mapArea) {
                    if (n2 >= 473467988) {
                        throw new IllegalStateException();
                    }
                    externalName = mapArea.getExternalName((short)25057);
                }
                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = externalName;
                return 1;
            }
            else if (n == 6602) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                WorldMap.zj(class88.getWorldMap(474741121), Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -230803045);
                return 1;
            }
            else if (n == 6603) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(1510834138).getZoomLevel((byte)0);
                return 1;
            }
            else if (n == 6604) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                class88.getWorldMap(-1954290074).setZoomPercentage(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -326136881);
                return 1;
            }
            else if (6605 == n) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                final int n4 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                boolean b2;
                if (WorldMap.wt(class88.getWorldMap(-428867591), 142682982)) {
                    if (n2 >= 473467988) {
                        throw new IllegalStateException();
                    }
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                interpreter_intStack[n4] = (b2 ? 1 : 0);
                return 1;
            }
            else if (6606 == n) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                final Coord coord = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                class88.getWorldMap(-1848167700).setWorldMapPositionTarget(-96298701 * coord.x, -2105445199 * coord.y, (byte)(-80));
                return 1;
            }
            else if (6607 == n) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                final Coord coord2 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                class88.getWorldMap(-339685258).fs(-96298701 * coord2.x, -2105445199 * coord2.y, 210272527);
                return 1;
            }
            else if (n == 6608) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                final Coord coord3 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                WorldMap.vp(class88.getWorldMap(-512226898), -113644749 * coord3.plane, coord3.x * -96298701, coord3.y * -2105445199, (byte)103);
                return 1;
            }
            else if (6609 == n) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                final Coord coord4 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                class88.getWorldMap(-1042572447).jumpToSourceCoordInstant(coord4.plane * -113644749, coord4.x * -96298701, coord4.y * -2105445199, -319768384);
                return 1;
            }
            else if (n == 6610) {
                if (n2 >= 473467988) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(1207025377).getDisplayX(-1755924564);
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(-810685723).getDisplayY((byte)0);
                return 1;
            }
            else {
                if (n == 6611) {
                    final WorldMapArea mapArea2 = class88.getWorldMap(-490359651).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -610660265);
                    if (mapArea2 == null) {
                        if (n2 >= 473467988) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea2.getOrigin((byte)19).packed(-964267539);
                    }
                    return 1;
                }
                if (n == 6612) {
                    if (n2 >= 473467988) {
                        throw new IllegalStateException();
                    }
                    final WorldMapArea mapArea3 = class88.getWorldMap(511438363).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1639431818);
                    if (mapArea3 == null) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    }
                    else {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (mapArea3.getRegionHighX(-1231382819) - mapArea3.getRegionLowX(16748608) + 1) * 64;
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (mapArea3.getRegionHighY(1746970873) - mapArea3.getRegionLowY(-2056393943) + 1) * 64;
                    }
                    return 1;
                }
                else {
                    if (6613 == n) {
                        final WorldMapArea mapArea4 = class88.getWorldMap(1146106928).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1663246278);
                        if (mapArea4 == null) {
                            if (n2 >= 473467988) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionLowX(16748608) * 64;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionLowY(1693573484) * 64;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionHighX(-1678666636) * 64 + 64 - 1;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = mapArea4.getRegionHighY(947302746) * 64 + 64 - 1;
                        }
                        return 1;
                    }
                    if (n == 6614) {
                        if (n2 >= 473467988) {
                            throw new IllegalStateException();
                        }
                        final WorldMapArea mapArea5 = class88.getWorldMap(708491994).getMapArea(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1185242262);
                        if (mapArea5 == null) {
                            if (n2 >= 473467988) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = WorldMapArea.uz(mapArea5, 447952954);
                        }
                        return 1;
                    }
                    else {
                        if (6615 == n) {
                            final Coord da = WorldMap.da(class88.getWorldMap(1566542956), 1721001715);
                            if (null == da) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                            }
                            else {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = da.x * -96298701;
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -2105445199 * da.y;
                            }
                            return 1;
                        }
                        if (n == 6616) {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(901438596).currentMapAreaId(307100006);
                            return 1;
                        }
                        if (6617 == n) {
                            if (n2 >= 473467988) {
                                throw new IllegalStateException();
                            }
                            final Coord coord5 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                            final WorldMapArea currentMapArea = class88.getWorldMap(2050802935).getCurrentMapArea((byte)76);
                            if (null == currentMapArea) {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                return 1;
                            }
                            final int[] position = currentMapArea.position(coord5.plane * -113644749, -96298701 * coord5.x, -2105445199 * coord5.y, (byte)6);
                            if (null == position) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                            }
                            else {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = position[0];
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = position[1];
                            }
                            return 1;
                        }
                        else if (6618 == n) {
                            if (n2 >= 473467988) {
                                throw new IllegalStateException();
                            }
                            final Coord coord6 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                            final WorldMapArea currentMapArea2 = class88.getWorldMap(-398786601).getCurrentMapArea((byte)74);
                            if (currentMapArea2 != null) {
                                final Coord coord7 = currentMapArea2.coord(coord6.x * -96298701, coord6.y * -2105445199, 1463872797);
                                if (null == coord7) {
                                    if (n2 >= 473467988) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                }
                                else {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = coord7.packed(-964267539);
                                }
                                return 1;
                            }
                            if (n2 >= 473467988) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                            return 1;
                        }
                        else {
                            if (n == 6619) {
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                class220.method1229(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1]), false, (byte)89);
                                return 1;
                            }
                            if (n == 6620) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                class220.method1229(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], new Coord(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]), true, (byte)50);
                                return 1;
                            }
                            else if (6621 == n) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStackSize -= 854271946;
                                final int n5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                                final Coord coord8 = new Coord(Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]);
                                final WorldMapArea mapArea6 = class88.getWorldMap(1284126367).getMapArea(n5, -1354847279);
                                if (mapArea6 != null) {
                                    final int[] interpreter_intStack2 = Interpreter.Interpreter_intStack;
                                    final int n6 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                    boolean b3;
                                    if (mapArea6.containsCoord(coord8.plane * -113644749, coord8.x * -96298701, -2105445199 * coord8.y, -1496427371)) {
                                        if (n2 >= 473467988) {
                                            throw new IllegalStateException();
                                        }
                                        b3 = true;
                                    }
                                    else {
                                        b3 = false;
                                    }
                                    interpreter_intStack2[n6] = (b3 ? 1 : 0);
                                    return 1;
                                }
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                return 1;
                            }
                            else if (n == 6622) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(1772587971).getDisplayWith((byte)52);
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class88.getWorldMap(-1957603163).getDisplayHeight(1831068243);
                                return 1;
                            }
                            else if (n == 6623) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                final Coord coord9 = new Coord(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]);
                                final WorldMapArea mapAreaAtCoord = class88.getWorldMap(-800524497).mapAreaAtCoord(-113644749 * coord9.plane, coord9.x * -96298701, -2105445199 * coord9.y, (byte)2);
                                if (mapAreaAtCoord == null) {
                                    if (n2 >= 473467988) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                }
                                else {
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = WorldMapArea.wo(mapAreaAtCoord, -964267539);
                                }
                                return 1;
                            }
                            else if (6624 == n) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                class88.getWorldMap(752751375).setCyclesPerFlash(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)88);
                                return 1;
                            }
                            else if (n == 6625) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                class88.getWorldMap(-1964004397).resetMaxFlashCount((byte)5);
                                return 1;
                            }
                            else if (n == 6626) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                class88.getWorldMap(-140843528).setMaxFlashCount(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)31);
                                return 1;
                            }
                            else if (n == 6627) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                class88.getWorldMap(1657357827).ge(-1035925725);
                                return 1;
                            }
                            else if (n == 6628) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                boolean b4;
                                if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                    if (n2 >= 473467988) {
                                        throw new IllegalStateException();
                                    }
                                    b4 = true;
                                }
                                else {
                                    b4 = false;
                                }
                                class88.getWorldMap(-989448736).setPerpetualFlash(b4, 1485750131);
                                return 1;
                            }
                            else if (6629 == n) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                class88.getWorldMap(1693974913).flashElement(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 185156955);
                                return 1;
                            }
                            else if (n == 6630) {
                                if (n2 >= 473467988) {
                                    throw new IllegalStateException();
                                }
                                class88.getWorldMap(1225657598).flashCategory(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 679532809);
                                return 1;
                            }
                            else {
                                if (n == 6631) {
                                    class88.getWorldMap(-87940279).method2329(530218621);
                                    return 1;
                                }
                                if (n == 6632) {
                                    if (n2 >= 473467988) {
                                        throw new IllegalStateException();
                                    }
                                    boolean b5;
                                    if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                                        if (n2 >= 473467988) {
                                            throw new IllegalStateException();
                                        }
                                        b5 = true;
                                    }
                                    else {
                                        b5 = false;
                                    }
                                    WorldMap.le(class88.getWorldMap(-979066485), b5, 606617490);
                                    return 1;
                                }
                                else {
                                    if (n == 6633) {
                                        Interpreter.Interpreter_intStackSize -= 854271946;
                                        final int n7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                                        boolean b6;
                                        if (1 == Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize]) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            b6 = true;
                                        }
                                        else {
                                            b6 = false;
                                        }
                                        class88.getWorldMap(-54775707).disableElement(n7, b6, 1622935645);
                                        return 1;
                                    }
                                    if (6634 == n) {
                                        if (n2 >= 473467988) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStackSize -= 854271946;
                                        final int n8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                                        boolean b7;
                                        if (Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize] == 1) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            b7 = true;
                                        }
                                        else {
                                            b7 = false;
                                        }
                                        WorldMap.ld(class88.getWorldMap(1530196246), n8, b7, 21329646);
                                        return 1;
                                    }
                                    else if (n == 6635) {
                                        if (n2 >= 473467988) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (class88.getWorldMap(-1095908929).getElementsDisabled((short)480) ? 1 : 0);
                                        return 1;
                                    }
                                    else {
                                        if (6636 == n) {
                                            final int n9 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                            final int[] interpreter_intStack3 = Interpreter.Interpreter_intStack;
                                            final int n10 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                            boolean b8;
                                            if (class88.getWorldMap(-2017214251).isElementDisabled(n9, -939989355)) {
                                                if (n2 >= 473467988) {
                                                    throw new IllegalStateException();
                                                }
                                                b8 = true;
                                            }
                                            else {
                                                b8 = false;
                                            }
                                            interpreter_intStack3[n10] = (b8 ? 1 : 0);
                                            return 1;
                                        }
                                        if (n == 6637) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            final int n11 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                            final int[] interpreter_intStack4 = Interpreter.Interpreter_intStack;
                                            final int n12 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                                            boolean b9;
                                            if (class88.getWorldMap(-602028821).isCategoryDisabled(n11, (byte)(-101))) {
                                                if (n2 >= 473467988) {
                                                    throw new IllegalStateException();
                                                }
                                                b9 = true;
                                            }
                                            else {
                                                b9 = false;
                                            }
                                            interpreter_intStack4[n12] = (b9 ? 1 : 0);
                                            return 1;
                                        }
                                        else if (n == 6638) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            Interpreter.Interpreter_intStackSize -= 854271946;
                                            final Coord tb = WorldMap.tb(class88.getWorldMap(352211696), Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], new Coord(Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539]), -809326825);
                                            if (null == tb) {
                                                if (n2 >= 473467988) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                            }
                                            else {
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = tb.packed(-964267539);
                                            }
                                            return 1;
                                        }
                                        else if (n == 6639) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            final AbstractWorldMapIcon iconStart = class88.getWorldMap(-1385170437).iconStart(-156037818);
                                            if (iconStart == null) {
                                                if (n2 >= 473467988) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                            }
                                            else {
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconStart.getElement(-612767697);
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconStart.coord2.packed(-964267539);
                                            }
                                            return 1;
                                        }
                                        else if (n == 6640) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            final AbstractWorldMapIcon iconNext = class88.getWorldMap(-1237507883).iconNext((byte)(-14));
                                            if (iconNext == null) {
                                                if (n2 >= 473467988) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                            }
                                            else {
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconNext.getElement(-191083800);
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = iconNext.coord2.packed(-964267539);
                                            }
                                            return 1;
                                        }
                                        else if (6693 == n) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            final WorldMapElement method1935 = class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1996485424);
                                            if (null == method1935.name) {
                                                if (n2 >= 473467988) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                                            }
                                            else {
                                                Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = method1935.name;
                                            }
                                            return 1;
                                        }
                                        else if (n == 6694) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 952315347 * class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1954099581).textSize;
                                            return 1;
                                        }
                                        else if (6695 == n) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            final WorldMapElement method1936 = class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1831973390);
                                            if (null == method1936) {
                                                if (n2 >= 473467988) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                            }
                                            else {
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = method1936.category * -461862935;
                                            }
                                            return 1;
                                        }
                                        else if (6696 == n) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            final WorldMapElement method1937 = class354.method1935(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 1868218936);
                                            if (null == method1937) {
                                                if (n2 >= 473467988) {
                                                    throw new IllegalStateException();
                                                }
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                                            }
                                            else {
                                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1458003089 * method1937.sprite1;
                                            }
                                            return 1;
                                        }
                                        else if (n == 6697) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.mapElement * 1618357717;
                                            return 1;
                                        }
                                        else if (n == 6698) {
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.coord1.packed(-964267539);
                                            return 1;
                                        }
                                        else {
                                            if (n != 6699) {
                                                return 2;
                                            }
                                            if (n2 >= 473467988) {
                                                throw new IllegalStateException();
                                            }
                                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ByteArrayPool.worldMapEvent.coord2.packed(-964267539);
                                            return 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dl.bf(" + ')');
        }
    }
}
