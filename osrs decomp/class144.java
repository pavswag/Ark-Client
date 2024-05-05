import java.util.List;
import java.util.Collection;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.5.36
// 

public class class144 extends class139
{
    int field1328;
    int field1329;
    int field1330;
    static int oculusOrbFocalPointY;
    final /* synthetic */ class142 this$0;
    static final int cr = 512;
    int field1332;
    static int field1333;
    static final int tn = 1536;
    
    class144(final class142 this$0) {
        this.this$0 = this$0;
    }
    
    static int method821(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (n != 7500) {
                if (b2 <= 0) {
                    throw new IllegalStateException();
                }
                if (n == 7508) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                }
                else if (7501 == n) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    if (null != class1.field4) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (class1.field4.hasNext()) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class1.field4.next();
                            return 1;
                        }
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -1;
                    return 1;
                }
                else if (n == 7502) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStackSize -= 1281407919;
                    final int n2 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                    final int n3 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                    final int n4 = Interpreter.Interpreter_intStack[2 + -964267539 * Interpreter.Interpreter_intStackSize];
                    final int method1992 = class373.method1992(n3, (byte)104);
                    final int write = BufferedSink.write(n3, (byte)115);
                    final int method1993 = class146.method833(n3, 1774054198);
                    final DbRowType method1994 = class125.method750(n2, 1883775054);
                    final DbTableType dbTableType = GameBuild.getDbTableType(method1992, (byte)97);
                    final int[] array = dbTableType.types[write];
                    int n5 = 0;
                    int length = array.length;
                    if (method1993 >= 0) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (method1993 >= length) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            throw new RuntimeException("Tuple index out-of-bounds. Requested: " + method1993 + ", Max: " + length);
                        }
                        else {
                            n5 = method1993;
                            length = 1 + method1993;
                        }
                    }
                    Object[] columnType = method1994.getColumnType(write, (byte)(-37));
                    if (columnType == null) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (dbTableType.defaultValues != null) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            columnType = dbTableType.defaultValues[write];
                        }
                    }
                    if (null != columnType) {
                        final int n6 = columnType.length / array.length;
                        if (n4 >= 0) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            if (n4 < n6) {
                                for (int i = n5; i < length; ++i) {
                                    if (b2 <= 0) {
                                        throw new IllegalStateException();
                                    }
                                    final int n7 = i + n4 * array.length;
                                    if (class478.field4026 == class103.method639(array[i], -177160107)) {
                                        if (b2 <= 0) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = (String)columnType[n7];
                                    }
                                    else {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (int)columnType[n7];
                                    }
                                }
                                return 1;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    for (int j = n5; j < length; ++j) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        final int n8 = array[j];
                        if (class478.field4026 == class103.method639(n8, -2004143923)) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize -= 1086551379) * -2017760987 - 1] = "";
                        }
                        else {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = GrandExchangeOfferUnitPriceComparator.compare_bridged(n8, 1338946112);
                        }
                    }
                    return 1;
                }
                else if (n == 7503) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    final int n9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
                    final int n10 = Interpreter.Interpreter_intStack[1 + Interpreter.Interpreter_intStackSize * -964267539];
                    int n11 = 0;
                    final int method1995 = class373.method1992(n10, (byte)86);
                    final int write2 = BufferedSink.write(n10, (byte)22);
                    final DbRowType method1996 = class125.method750(n9, 570380215);
                    final DbTableType dbTableType2 = GameBuild.getDbTableType(method1995, (byte)49);
                    final int[] array2 = dbTableType2.types[write2];
                    Object[] columnType2 = method1996.getColumnType(write2, (byte)(-88));
                    if (columnType2 == null) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (dbTableType2.defaultValues != null) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            columnType2 = dbTableType2.defaultValues[write2];
                        }
                    }
                    if (null != columnType2) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        n11 = columnType2.length / array2.length;
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = n11;
                    return 1;
                }
                else {
                    if (7504 != n) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        if (7510 == n) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                        }
                        else if (7505 == n) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 468764621 * class125.method750(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -32726682).tableId;
                            return 1;
                        }
                        else {
                            if (n == 7506) {
                                final int n12 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                                int intValue = -1;
                                if (class9.field21 != null && n12 >= 0 && n12 < class9.field21.size()) {
                                    if (b2 <= 0) {
                                        throw new IllegalStateException();
                                    }
                                    intValue = class9.field21.get(n12);
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = intValue;
                                return 1;
                            }
                            if (7507 != n) {
                                if (b2 <= 0) {
                                    throw new IllegalStateException();
                                }
                                if (7509 != n) {
                                    return 2;
                                }
                                if (b2 <= 0) {
                                    throw new IllegalStateException();
                                }
                            }
                            final Object method1997 = ScriptEvent.method489(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -444806434);
                            final int n13 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                            final class482 method1998 = class206.method1147(n13, 1127097285);
                            if (method1998 == null) {
                                if (b2 <= 0) {
                                    throw new IllegalStateException();
                                }
                                throw new RuntimeException();
                            }
                            else {
                                if (class373.method1992(n13, (byte)91) == Client.field613 * -1334952277) {
                                    if (null == class9.field21) {
                                        if (b2 <= 0) {
                                            throw new IllegalStateException();
                                        }
                                        if (class9.field21.isEmpty()) {
                                            if (b2 <= 0) {
                                                throw new IllegalStateException();
                                            }
                                            throw new RuntimeException();
                                        }
                                    }
                                    final List method1999 = method1998.method2448(method1997, class146.method833(n13, 1324518303), 1232252423);
                                    class9.field21 = new LinkedList(class9.field21);
                                    if (method1999 != null) {
                                        if (b2 <= 0) {
                                            throw new IllegalStateException();
                                        }
                                        class9.field21.retainAll(method1999);
                                    }
                                    else {
                                        class9.field21.clear();
                                    }
                                    class1.field4 = class9.field21.iterator();
                                    if (n == 7507) {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class9.field21.size();
                                    }
                                    return 1;
                                }
                                if (b2 <= 0) {
                                    throw new IllegalStateException();
                                }
                                throw new RuntimeException();
                            }
                        }
                    }
                    Interpreter.Interpreter_intStackSize -= 427135973;
                    final int n14 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                    final class482 method2000 = class10.method40(n14, 1355800159);
                    if (null != method2000) {
                        class9.field21 = method2000.method2448(0, 0, 1385460122);
                        int size = 0;
                        if (null != class9.field21) {
                            Client.field613 = 978308099 * n14;
                            class1.field4 = class9.field21.iterator();
                            size = class9.field21.size();
                        }
                        if (n == 7504) {
                            if (b2 <= 0) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = size;
                        }
                        return 1;
                    }
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    throw new RuntimeException();
                }
            }
            final Object method2001 = ScriptEvent.method489(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], 140297466);
            final int n15 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
            final class482 method2002 = class206.method1147(n15, 1127097285);
            if (null != method2002) {
                class9.field21 = method2002.method2448(method2001, class146.method833(n15, 615247476), -1777573466);
                if (null != class9.field21) {
                    if (b2 <= 0) {
                        throw new IllegalStateException();
                    }
                    Client.field613 = class373.method1992(n15, (byte)121) * 978308099;
                    class1.field4 = class9.field21.iterator();
                    if (7500 == n) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class9.field21.size();
                    }
                }
                else {
                    Client.field613 = -978308099;
                    class1.field4 = null;
                    if (n == 7500) {
                        if (b2 <= 0) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                    }
                }
                return 1;
            }
            if (b2 <= 0) {
                throw new IllegalStateException();
            }
            throw new RuntimeException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fw.bw(" + ')');
        }
    }
    
    public static void invalidateWidget(final Widget widget, final int n) {
        try {
            if (widget != null) {
                if (n >= -519894348) {
                    throw new IllegalStateException();
                }
                if (207148199 * Client.field527 == -1197721959 * widget.cycle) {
                    if (n >= -519894348) {
                        throw new IllegalStateException();
                    }
                    Client.field573[372799529 * widget.rootIndex] = true;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fw.ma(" + ')');
        }
    }
    
    public static void method825(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10, final int n11) {
        try {
            Rasterizer3D.field1999.be(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fw.av(" + ')');
        }
    }
    
    @Override
    void aw(final ClanSettings clanSettings) {
        ClanSettings.wr(clanSettings, this.field1328 * 327631731, 116080323 * this.field1332, this.field1329 * -2041660067, this.field1330 * 1801165299, -1882412251);
    }
    
    static String vmethod3248(final byte[] array, final int n, final int n2, final int n3) {
        try {
            final StringBuilder sb = new StringBuilder();
            for (int i = n; i < n2 + n; i += 3) {
                if (n3 == -1790230453) {
                    throw new IllegalStateException();
                }
                final int n4 = array[i] & 0xFF;
                sb.append(class370.field3593[n4 >>> 2]);
                if (i < n2 - 1) {
                    if (n3 == -1790230453) {
                        throw new IllegalStateException();
                    }
                    final int n5 = array[1 + i] & 0xFF;
                    sb.append(class370.field3593[(n4 & 0x3) << 4 | n5 >>> 4]);
                    if (i < n2 - 2) {
                        if (n3 == -1790230453) {
                            throw new IllegalStateException();
                        }
                        final int n6 = array[i + 2] & 0xFF;
                        sb.append(class370.field3593[(n5 & 0xF) << 2 | n6 >>> 6]).append(class370.field3593[n6 & 0x3F]);
                    }
                    else {
                        sb.append(class370.field3593[(n5 & 0xF) << 2]).append("=");
                    }
                }
                else {
                    sb.append(class370.field3593[(n4 & 0x3) << 4]).append("==");
                }
            }
            return sb.toString();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fw.an(" + ')');
        }
    }
    
    @Override
    void vmethod3248(final ClanSettings clanSettings, final int n) {
        try {
            ClanSettings.wr(clanSettings, this.field1328 * 327631731, 116080323 * this.field1332, this.field1329 * -2041660067, this.field1330 * 1801165299, -458025371);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fw.an(" + ')');
        }
    }
    
    public static ObjectComposition vmethod3248(final int n, final short n2) {
        synchronized (ObjectComposition.ObjectDefinition_cached) {
            final int n3 = 2415;
            ObjectComposition objectComposition2;
            try {
                final ObjectComposition objectComposition = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.wr(n);
                if (null != objectComposition) {
                    if (n3 <= 255) {
                        throw new IllegalStateException();
                    }
                    objectComposition2 = objectComposition;
                }
                else {
                    final byte[] takeFile = ObjectComposition.ObjectDefinition_archive.takeFile(6, n, (byte)(-38));
                    final ObjectComposition objectComposition3 = new ObjectComposition();
                    objectComposition3.id = n * -1113054781;
                    if (takeFile != null) {
                        objectComposition3.ak(new Buffer(takeFile), 1333765973);
                    }
                    objectComposition3.postDecode((byte)97);
                    if (objectComposition3.nonFlatShading) {
                        if (n3 <= 255) {
                            throw new IllegalStateException();
                        }
                        objectComposition3.interactType = 0;
                        objectComposition3.boolean1 = false;
                    }
                    ObjectComposition.ObjectDefinition_cached.put(objectComposition3, n);
                    objectComposition2 = objectComposition3;
                }
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "fw.an(" + ')');
            }
            return objectComposition2;
        }
    }
    
    void method822(final Buffer buffer) {
        this.field1328 = buffer.readInt(-1992473432) * 1215920913;
        this.field1332 = buffer.readInt(-2078950757) * -1773346325;
        this.field1329 = Buffer.ra(buffer, (byte)7) * 1126530805;
        this.field1330 = Buffer.ra(buffer, (byte)7) * -950984967;
    }
    
    public static void method822(final int n) {
        try {
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                if (0 != -1248352937 * ArchiveDiskActionHandler.field3453) {
                    if (n == -116413398) {
                        throw new IllegalStateException();
                    }
                    ArchiveDiskActionHandler.field3453 = 1527846503;
                    try {
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
                    }
                    catch (InterruptedException ex2) {}
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fw.ac(" + ')');
        }
    }
    
    @Override
    void au(final Buffer buffer) {
        this.field1328 = buffer.readInt(-1635288779) * 1125554619;
        this.field1332 = buffer.readInt(-1963658189) * -1773346325;
        this.field1329 = Buffer.ra(buffer, (byte)7) * 1126530805;
        this.field1330 = Buffer.ra(buffer, (byte)7) * -1791842501;
    }
    
    @Override
    void vmethod3254(final Buffer buffer, final int n) {
        try {
            this.field1328 = buffer.readInt(-1023556250) * 1125554619;
            this.field1332 = buffer.readInt(-1268158036) * -1773346325;
            this.field1329 = Buffer.ra(buffer, (byte)7) * 1126530805;
            this.field1330 = Buffer.ra(buffer, (byte)7) * -1791842501;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fw.af(" + ')');
        }
    }
    
    public static int vmethod3254(final int n, final int n2, final int n3, final RouteStrategy routeStrategy, final CollisionMap collisionMap, final boolean b, final int[] array, final int[] array2, final int n4) {
        try {
            for (int i = 0; i < 128; ++i) {
                for (int j = 0; j < 128; ++j) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    class211.directions[i][j] = 0;
                    class211.distances[i][j] = 99999999;
                }
            }
            int n5 = 0;
            Label_1231: {
                if (n3 == 1) {
                    n5 = (class88.method522(n, n2, routeStrategy, collisionMap, 1568495332) ? 1 : 0);
                }
                else if (n3 == 2) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    int n6 = n;
                    int n7 = n2;
                    final int n8 = 64;
                    final int n9 = 64;
                    final int n10 = n - n8;
                    final int n11 = n2 - n9;
                    class211.directions[n8][n9] = 99;
                    class211.distances[n8][n9] = 0;
                    int n12 = 0;
                    int k = 0;
                    class211.bufferX[n12] = n6;
                    class211.bufferY[n12++] = n7;
                    final int[][] flags = collisionMap.flags;
                    while (true) {
                        while (k != n12) {
                            n6 = class211.bufferX[k];
                            n7 = class211.bufferY[k];
                            k = (k + 1 & 0xFFF);
                            final int n13 = n6 - n10;
                            final int n14 = n7 - n11;
                            final int n15 = n6 - collisionMap.xInset * 1724654229;
                            final int n16 = n7 - collisionMap.yInset * -216630539;
                            if (routeStrategy.hasArrived(2, n6, n7, collisionMap, 286986723)) {
                                if (n4 == -52173422) {
                                    throw new IllegalStateException();
                                }
                                class18.field56 = -617213805 * n6;
                                class397.field3691 = n7 * 1169106949;
                                final int n17 = 1;
                                n5 = n17;
                                break Label_1231;
                            }
                            else {
                                final int n18 = 1 + class211.distances[n13][n14];
                                if (n13 > 0) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    if (0 != class211.directions[n13 - 1][n14]) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    else if (0x0 != (flags[n15 - 1][n16] & 0x124010E)) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    else if (0x0 != (flags[n15 - 1][1 + n16] & 0x1240138)) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    else {
                                        class211.bufferX[n12] = n6 - 1;
                                        class211.bufferY[n12] = n7;
                                        n12 = (1 + n12 & 0xFFF);
                                        class211.directions[n13 - 1][n14] = 2;
                                        class211.distances[n13 - 1][n14] = n18;
                                    }
                                }
                                if (n13 < 126) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    if (class211.directions[1 + n13][n14] != 0) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    else if (0x0 != (flags[n15 + 2][n16] & 0x1240183)) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    else if ((flags[2 + n15][n16 + 1] & 0x12401E0) != 0x0) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    else {
                                        class211.bufferX[n12] = 1 + n6;
                                        class211.bufferY[n12] = n7;
                                        n12 = (1 + n12 & 0xFFF);
                                        class211.directions[1 + n13][n14] = 8;
                                        class211.distances[n13 + 1][n14] = n18;
                                    }
                                }
                                if (n14 > 0) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    if (0 != class211.directions[n13][n14 - 1]) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    else if (0x0 != (flags[n15][n16 - 1] & 0x124010E)) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    else if (0x0 != (flags[n15 + 1][n16 - 1] & 0x1240183)) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    else {
                                        class211.bufferX[n12] = n6;
                                        class211.bufferY[n12] = n7 - 1;
                                        n12 = (n12 + 1 & 0xFFF);
                                        class211.directions[n13][n14 - 1] = 1;
                                        class211.distances[n13][n14 - 1] = n18;
                                    }
                                }
                                if (n14 < 126) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    if (0 == class211.directions[n13][1 + n14]) {
                                        if ((flags[n15][2 + n16] & 0x1240138) == 0x0) {
                                            if (0x0 == (flags[n15 + 1][2 + n16] & 0x12401E0)) {
                                                class211.bufferX[n12] = n6;
                                                class211.bufferY[n12] = n7 + 1;
                                                n12 = (n12 + 1 & 0xFFF);
                                                class211.directions[n13][1 + n14] = 4;
                                                class211.distances[n13][n14 + 1] = n18;
                                            }
                                        }
                                    }
                                }
                                if (n13 > 0) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    if (n14 > 0) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                        if (class211.directions[n13 - 1][n14 - 1] != 0) {
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        else if (0x0 != (flags[n15 - 1][n16] & 0x124013E)) {
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        else if (0x0 == (flags[n15 - 1][n16 - 1] & 0x124010E)) {
                                            if ((flags[n15][n16 - 1] & 0x124018F) != 0x0) {
                                                if (n4 == -52173422) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                            else {
                                                class211.bufferX[n12] = n6 - 1;
                                                class211.bufferY[n12] = n7 - 1;
                                                n12 = (n12 + 1 & 0xFFF);
                                                class211.directions[n13 - 1][n14 - 1] = 3;
                                                class211.distances[n13 - 1][n14 - 1] = n18;
                                            }
                                        }
                                    }
                                }
                                if (n13 < 126) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    if (n14 > 0) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                        if (0 != class211.directions[1 + n13][n14 - 1]) {
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        else if ((flags[1 + n15][n16 - 1] & 0x124018F) == 0x0) {
                                            if ((flags[2 + n15][n16 - 1] & 0x1240183) == 0x0) {
                                                if (0x0 != (flags[2 + n15][n16] & 0x12401E3)) {
                                                    if (n4 == -52173422) {
                                                        throw new IllegalStateException();
                                                    }
                                                }
                                                else {
                                                    class211.bufferX[n12] = 1 + n6;
                                                    class211.bufferY[n12] = n7 - 1;
                                                    n12 = (n12 + 1 & 0xFFF);
                                                    class211.directions[1 + n13][n14 - 1] = 9;
                                                    class211.distances[1 + n13][n14 - 1] = n18;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (n13 > 0) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    if (n14 < 126) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                        if (class211.directions[n13 - 1][1 + n14] != 0) {
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        else if ((flags[n15 - 1][1 + n16] & 0x124013E) == 0x0) {
                                            if (0x0 != (flags[n15 - 1][2 + n16] & 0x1240138)) {
                                                if (n4 == -52173422) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                            else if ((flags[n15][n16 + 2] & 0x12401F8) != 0x0) {
                                                if (n4 == -52173422) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                            else {
                                                class211.bufferX[n12] = n6 - 1;
                                                class211.bufferY[n12] = n7 + 1;
                                                n12 = (n12 + 1 & 0xFFF);
                                                class211.directions[n13 - 1][n14 + 1] = 6;
                                                class211.distances[n13 - 1][1 + n14] = n18;
                                            }
                                        }
                                    }
                                }
                                if (n13 >= 126) {
                                    continue;
                                }
                                if (n4 == -52173422) {
                                    throw new IllegalStateException();
                                }
                                if (n14 >= 126) {
                                    continue;
                                }
                                if (n4 == -52173422) {
                                    throw new IllegalStateException();
                                }
                                if (class211.directions[1 + n13][n14 + 1] != 0) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    continue;
                                }
                                else if ((flags[1 + n15][2 + n16] & 0x12401F8) != 0x0) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    continue;
                                }
                                else if ((flags[n15 + 2][2 + n16] & 0x12401E0) != 0x0) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    continue;
                                }
                                else if (0x0 != (flags[n15 + 2][n16 + 1] & 0x12401E3)) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    continue;
                                }
                                else {
                                    class211.bufferX[n12] = 1 + n6;
                                    class211.bufferY[n12] = n7 + 1;
                                    n12 = (n12 + 1 & 0xFFF);
                                    class211.directions[n13 + 1][1 + n14] = 12;
                                    class211.distances[1 + n13][1 + n14] = n18;
                                }
                            }
                        }
                        class18.field56 = -617213805 * n6;
                        class397.field3691 = 1169106949 * n7;
                        final int n17 = 0;
                        continue;
                    }
                }
                else {
                    n5 = (KitDefinition.decode(n, n2, n3, routeStrategy, collisionMap, 1036507043) ? 1 : 0);
                }
            }
            final int n19 = n - 64;
            final int n20 = n2 - 64;
            int n21 = 1093766555 * class18.field56;
            int n22 = -56662835 * class397.field3691;
            if (n5 == 0) {
                if (!b) {
                    return -1;
                }
                if (n4 == -52173422) {
                    throw new IllegalStateException();
                }
                int n23 = Integer.MAX_VALUE;
                int n24 = Integer.MAX_VALUE;
                final int n25 = 10;
                final int n26 = 689701217 * routeStrategy.approxDestinationX;
                final int n27 = -407280601 * routeStrategy.approxDestinationY;
                final int n28 = 372776577 * routeStrategy.approxDestinationSizeX;
                final int n29 = -333607875 * routeStrategy.approxDestinationSizeY;
                for (int l = n26 - n25; l <= n26 + n25; ++l) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    for (int n30 = n27 - n25; n30 <= n27 + n25; ++n30) {
                        if (n4 == -52173422) {
                            throw new IllegalStateException();
                        }
                        final int n31 = l - n19;
                        final int n32 = n30 - n20;
                        if (n31 >= 0 && n32 >= 0) {
                            if (n4 == -52173422) {
                                throw new IllegalStateException();
                            }
                            if (n31 < 128) {
                                if (n4 == -52173422) {
                                    throw new IllegalStateException();
                                }
                                if (n32 < 128) {
                                    if (n4 == -52173422) {
                                        throw new IllegalStateException();
                                    }
                                    if (class211.distances[n31][n32] < 100) {
                                        if (n4 == -52173422) {
                                            throw new IllegalStateException();
                                        }
                                        int n33 = 0;
                                        if (l < n26) {
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                            n33 = n26 - l;
                                        }
                                        else if (l > n28 + n26 - 1) {
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                            n33 = l - (n28 + n26 - 1);
                                        }
                                        int n34 = 0;
                                        if (n30 < n27) {
                                            n34 = n27 - n30;
                                        }
                                        else if (n30 > n29 + n27 - 1) {
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                            n34 = n30 - (n29 + n27 - 1);
                                        }
                                        final int n35 = n34 * n34 + n33 * n33;
                                        if (n35 >= n23) {
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                            if (n23 != n35) {
                                                continue;
                                            }
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                            if (class211.distances[n31][n32] >= n24) {
                                                continue;
                                            }
                                            if (n4 == -52173422) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        n23 = n35;
                                        n24 = class211.distances[n31][n32];
                                        n21 = l;
                                        n22 = n30;
                                    }
                                }
                            }
                        }
                    }
                }
                if (n23 == Integer.MAX_VALUE) {
                    return -1;
                }
            }
            if (n == n21) {
                if (n4 == -52173422) {
                    throw new IllegalStateException();
                }
                if (n2 == n22) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    array[0] = n21;
                    array2[0] = n22;
                    return 0;
                }
            }
            int n36 = 0;
            class211.bufferX[n36] = n21;
            class211.bufferY[n36++] = n22;
            int n38;
            int n37 = n38 = class211.directions[n21 - n19][n22 - n20];
            while (true) {
                if (n == n21) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    if (n22 == n2) {
                        int n39 = 0;
                        while (n36-- > 0) {
                            if (n4 == -52173422) {
                                throw new IllegalStateException();
                            }
                            array[n39] = class211.bufferX[n36];
                            array2[n39++] = class211.bufferY[n36];
                            if (n39 < array.length) {
                                continue;
                            }
                            if (n4 == -52173422) {
                                throw new IllegalStateException();
                            }
                            break;
                        }
                        return n39;
                    }
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                }
                if (n38 != n37) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    n37 = n38;
                    class211.bufferX[n36] = n21;
                    class211.bufferY[n36++] = n22;
                }
                if ((n38 & 0x2) != 0x0) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    ++n21;
                }
                else if ((n38 & 0x8) != 0x0) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    --n21;
                }
                if (0x0 != (n38 & 0x1)) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    ++n22;
                }
                else if ((n38 & 0x4) != 0x0) {
                    if (n4 == -52173422) {
                        throw new IllegalStateException();
                    }
                    --n22;
                }
                n38 = class211.directions[n21 - n19][n22 - n20];
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fw.af(" + ')');
        }
    }
    
    public static boolean ym(final Node node) {
        if (node == null) {
            node.remove();
        }
        return node.next != null;
    }
}
