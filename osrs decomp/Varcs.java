import java.util.Calendar;
import java.util.Date;
import net.runelite.api.events.VarClientStrChanged;
import java.io.EOFException;
import java.util.Iterator;
import net.runelite.api.events.VarClientIntChanged;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class Varcs
{
    boolean[] intsPersistence;
    @Deprecated
    String[] strings;
    Map map;
    static final String an = "2";
    boolean unwrittenChanges;
    long field1120;
    static GraphicsDefaults spriteIds;
    
    Varcs() {
        this.unwrittenChanges = false;
        final int cq = class85.archive2.cq(19, (byte)22);
        this.map = new HashMap();
        this.intsPersistence = new boolean[cq];
        for (int i = 0; i < cq; ++i) {
            final VarcInt varcInt = (VarcInt)VarcInt.VarcInt_cached.wr(i);
            VarcInt varcInt2;
            if (varcInt != null) {
                varcInt2 = varcInt;
            }
            else {
                final byte[] takeFile = class294.VarcInt_archive.takeFile(19, i, (byte)(-124));
                final VarcInt varcInt3 = new VarcInt();
                if (takeFile != null) {
                    varcInt3.method991(new Buffer(takeFile), 1521148390);
                }
                VarcInt.VarcInt_cached.put(varcInt3, i);
                varcInt2 = varcInt3;
            }
            this.intsPersistence[i] = varcInt2.persist;
        }
        int cq2 = 0;
        if (class85.archive2.method1870(15, -1442403869)) {
            cq2 = class85.archive2.cq(15, (byte)125);
        }
        this.strings = new String[cq2];
        this.read((byte)(-44));
    }
    
    void ad() {
        for (int i = 0; i < this.intsPersistence.length; ++i) {
            if (!this.intsPersistence[i]) {
                this.map.remove(i);
            }
        }
        for (int j = 0; j < this.strings.length; ++j) {
            this.strings[j] = null;
        }
    }
    
    public static void cr(final Varcs varcs, final int i, final int j, final int n) {
        if (varcs == null) {
            varcs.setInt(i, i, i);
            return;
        }
        try {
            varcs.map.put(i, j);
            if (varcs.intsPersistence[i]) {
                if (n <= -849853159) {
                    throw new IllegalStateException();
                }
                varcs.unwrittenChanges = true;
            }
            varcs.tc(i, j);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.af(" + ')');
        }
    }
    
    boolean hasUnwrittenChanges(final int n) {
        try {
            return this.unwrittenChanges;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.ao(" + ')');
        }
    }
    
    void write(final int n) {
        try {
            for (int i = 0; i < this.intsPersistence.length; ++i) {
                if (n != -39979061) {
                    throw new IllegalStateException();
                }
                if (!this.intsPersistence[i]) {
                    if (n != -39979061) {
                        throw new IllegalStateException();
                    }
                    this.map.remove(i);
                }
            }
            for (int j = 0; j < this.strings.length; ++j) {
                if (n != -39979061) {
                    throw new IllegalStateException();
                }
                this.strings[j] = null;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.aq(" + ')');
        }
    }
    
    @Deprecated
    String ak(final int n) {
        return this.strings[n];
    }
    
    int av(final int i) {
        final Integer value = this.map.get(i);
        if (value instanceof Integer) {
            return value;
        }
        return -1;
    }
    
    public void tc(final int n, final int n2) {
        ScriptFrame.client.getCallbacks().post((Object)new VarClientIntChanged(n));
    }
    
    void be() {
        if (this.unwrittenChanges && -7171747788514623875L * this.field1120 < class96.clockNow(1752408278) - 60000L) {
            this.tryWrite(1649956052);
        }
    }
    
    String as(final int i) {
        final String value = this.map.get(i);
        if (value instanceof String) {
            return value;
        }
        return "";
    }
    
    @Deprecated
    String az(final int n) {
        return this.strings[n];
    }
    
    void ax(final int i, final int j) {
        this.map.put(i, j);
        if (this.intsPersistence[i]) {
            this.unwrittenChanges = true;
        }
    }
    
    void tryWrite(final int n) {
        try {
            final AccessFile preferencesFile = this.getPreferencesFile(true, (byte)61);
            try {
                int n2 = 3;
                int n3 = 0;
                final Iterator<Map.Entry<Integer, V>> iterator = this.map.entrySet().iterator();
                while (iterator.hasNext()) {
                    if (n <= 1606065339) {
                        throw new IllegalStateException();
                    }
                    final Map.Entry<Integer, V> entry = iterator.next();
                    if (!this.intsPersistence[entry.getKey()]) {
                        continue;
                    }
                    final V value = entry.getValue();
                    n2 += 3;
                    if (value instanceof Integer) {
                        if (n <= 1606065339) {
                            return;
                        }
                        n2 += 4;
                    }
                    else if (value instanceof String) {
                        if (n <= 1606065339) {
                            throw new IllegalStateException();
                        }
                        n2 += DynamicObject.stringCp1252NullTerminatedByteSize((String)value, (byte)(-115));
                    }
                    ++n3;
                }
                final Buffer buffer = new Buffer(n2);
                buffer.writeShort(2, (byte)46);
                buffer.writeVarInt(n3, (byte)55);
                final Iterator<Map.Entry<Integer, V>> iterator2 = this.map.entrySet().iterator();
                while (iterator2.hasNext()) {
                    if (n <= 1606065339) {
                        return;
                    }
                    final Map.Entry<Integer, V> entry2 = iterator2.next();
                    final int intValue = entry2.getKey();
                    if (!this.intsPersistence[intValue]) {
                        continue;
                    }
                    if (n <= 1606065339) {
                        throw new IllegalStateException();
                    }
                    buffer.writeVarInt(intValue, (byte)(-60));
                    final V value2 = entry2.getValue();
                    buffer.writeShort(454796803 * class478.method2431(value2.getClass(), (short)(-16288)).field4030, (byte)25);
                    class478.method2440(value2, buffer, 779443646);
                }
                preferencesFile.write(buffer.array, 0, -1633313603 * buffer.offset, 185047612);
                try {
                    preferencesFile.close((byte)(-84));
                }
                catch (Exception ex2) {}
            }
            catch (Exception ex3) {
                try {
                    preferencesFile.close((byte)(-58));
                }
                catch (Exception ex4) {}
            }
            finally {
                try {
                    preferencesFile.close((byte)(-96));
                }
                catch (Exception ex5) {}
            }
            this.unwrittenChanges = false;
            this.field1120 = class96.clockNow(629105598) * 2378911120439077589L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.at(" + ')');
        }
    }
    
    void bi() {
        final AccessFile preferencesFile = this.getPreferencesFile(false, (byte)26);
        Label_0429: {
            try {
                final byte[] array = new byte[(int)preferencesFile.length(2057565600)];
                int read;
                for (int i = 0; i < array.length; i += read) {
                    read = preferencesFile.read(array, i, array.length - i, 517917708);
                    if (-1 == read) {
                        throw new EOFException();
                    }
                }
                final Buffer buffer = new Buffer(array);
                if (buffer.array.length - -1633313603 * buffer.offset < 1) {
                    try {
                        preferencesFile.close((byte)(-13));
                    }
                    catch (Exception ex) {}
                    return;
                }
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra >= 0) {
                    if (ra <= 2) {
                        if (ra >= 2) {
                            for (int unsignedShort = buffer.readUnsignedShort(516480397), j = 0; j < unsignedShort; ++j) {
                                final int unsignedShort2 = buffer.readUnsignedShort(446535072);
                                final Object method2435 = ((class478)StructComposition.findEnumerated(class478.method2432(-1975029258), Buffer.ra(buffer, (byte)7), (short)173)).method2435(buffer, -1183771146);
                                if (unsignedShort2 >= 0 && unsignedShort2 < this.intsPersistence.length && this.intsPersistence[unsignedShort2]) {
                                    this.map.put(unsignedShort2, method2435);
                                }
                            }
                        }
                        else {
                            for (int unsignedShort3 = buffer.readUnsignedShort(31169772), k = 0; k < unsignedShort3; ++k) {
                                final int unsignedShort4 = buffer.readUnsignedShort(-924973628);
                                final int int1 = buffer.readInt(-1070436426);
                                if (unsignedShort4 >= 0 && unsignedShort4 < this.intsPersistence.length && this.intsPersistence[unsignedShort4]) {
                                    this.map.put(unsignedShort4, int1);
                                }
                            }
                            for (int unsignedShort5 = buffer.readUnsignedShort(228465192), l = 0; l < unsignedShort5; ++l) {
                                buffer.readUnsignedShort(-1412023943);
                                buffer.readStringCp1252NullTerminated((byte)0);
                            }
                        }
                        try {
                            preferencesFile.close((byte)(-124));
                        }
                        catch (Exception ex2) {}
                        break Label_0429;
                    }
                }
                try {
                    preferencesFile.close((byte)(-63));
                }
                catch (Exception ex3) {}
                return;
            }
            catch (Exception ex4) {
                try {
                    preferencesFile.close((byte)(-86));
                }
                catch (Exception ex5) {}
            }
            finally {
                try {
                    preferencesFile.close((byte)(-77));
                }
                catch (Exception ex6) {}
            }
        }
        this.unwrittenChanges = false;
    }
    
    void bo() {
        if (this.unwrittenChanges && -7171747788514623875L * this.field1120 < class96.clockNow(1237886239) - 60000L) {
            this.tryWrite(1720208837);
        }
    }
    
    public static boolean oc(final class9 class9) {
        return class9.field27;
    }
    
    void setString(final int i, final String s, final int n) {
        try {
            this.map.put(i, s);
            this.ji(i, s);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.aw(" + ')');
        }
    }
    
    AccessFile getPreferencesFile(final boolean b, final byte b2) {
        try {
            return Rasterizer3D.getPreferencesFile("2", Client.field358.name, b, (byte)(-57));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.al(" + ')');
        }
    }
    
    public static void nh(final Varcs varcs) {
        if (varcs == null) {
            varcs.bi();
            return;
        }
        final AccessFile preferencesFile = varcs.getPreferencesFile(true, (byte)95);
        try {
            int n = 3;
            int n2 = 0;
            for (final Map.Entry<Integer, V> entry : varcs.map.entrySet()) {
                if (varcs.intsPersistence[entry.getKey()]) {
                    final V value = entry.getValue();
                    n += 3;
                    if (value instanceof Integer) {
                        n += 4;
                    }
                    else if (value instanceof String) {
                        n += DynamicObject.stringCp1252NullTerminatedByteSize((String)value, (byte)(-7));
                    }
                    ++n2;
                }
            }
            final Buffer buffer = new Buffer(n);
            buffer.writeShort(2, (byte)71);
            buffer.writeVarInt(n2, (byte)(-23));
            for (final Map.Entry<Integer, V> entry2 : varcs.map.entrySet()) {
                final int intValue = entry2.getKey();
                if (varcs.intsPersistence[intValue]) {
                    buffer.writeVarInt(intValue, (byte)(-69));
                    final V value2 = entry2.getValue();
                    buffer.writeShort(454796803 * class478.method2431(value2.getClass(), (short)(-18549)).field4030, (byte)110);
                    class478.method2440(value2, buffer, -1117763929);
                }
            }
            preferencesFile.write(buffer.array, 0, -1633313603 * buffer.offset, 185047612);
            try {
                preferencesFile.close((byte)(-19));
            }
            catch (Exception ex) {}
        }
        catch (Exception ex2) {
            try {
                preferencesFile.close((byte)(-102));
            }
            catch (Exception ex3) {}
        }
        finally {
            try {
                preferencesFile.close((byte)(-112));
            }
            catch (Exception ex4) {}
        }
        varcs.unwrittenChanges = false;
        varcs.field1120 = class96.clockNow(808735721) * 2378911120439077589L;
    }
    
    public static int rx(final ClanSettings clanSettings, final int n, final byte b) {
        if (clanSettings == null) {
            clanSettings.bv(n, n);
        }
        if (126 == b || b == 889328059) {
            return -1;
        }
        if (-1369837236 * clanSettings.currentOwner == n && (clanSettings.field1374 * -185323072 == -1 || clanSettings.memberRanks[clanSettings.field1374 * -1218077019] < 125)) {
            return -1;
        }
        if (clanSettings.memberRanks[n] == b) {
            return -1;
        }
        clanSettings.memberRanks[n] = b;
        ClanSettings.og(clanSettings, -1045689302);
        return n;
    }
    
    int getInt(final int i, final int n) {
        try {
            final Integer value = this.map.get(i);
            if (!(value instanceof Integer)) {
                return -1;
            }
            if (n <= -733787727) {
                throw new IllegalStateException();
            }
            return value;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.an(" + ')');
        }
    }
    
    String getString(final int i, final int n) {
        try {
            final String value = this.map.get(i);
            if (!(value instanceof String)) {
                return "";
            }
            if (n <= -1398205849) {
                throw new IllegalStateException();
            }
            return value;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.ac(" + ')');
        }
    }
    
    public void ji(final int n, final String s) {
        ScriptFrame.client.getCallbacks().post((Object)new VarClientStrChanged(n));
    }
    
    @Deprecated
    void setStringOld(final int n, final String s, final int n2) {
        try {
            this.strings[n] = s;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.au(" + ')');
        }
    }
    
    void read(final byte b) {
        try {
            final AccessFile preferencesFile = this.getPreferencesFile(false, (byte)117);
            Label_0568: {
                try {
                    final byte[] array = new byte[(int)preferencesFile.length(2095830314)];
                    int i = 0;
                    while (i < array.length) {
                        if (b >= 31) {
                            throw new IllegalStateException();
                        }
                        final int read = preferencesFile.read(array, i, array.length - i, 1110436062);
                        if (-1 == read) {
                            if (b >= 31) {
                                throw new IllegalStateException();
                            }
                            throw new EOFException();
                        }
                        else {
                            i += read;
                        }
                    }
                    final Buffer buffer = new Buffer(array);
                    if (buffer.array.length - -1633313603 * buffer.offset < 1) {
                        try {
                            preferencesFile.close((byte)(-118));
                        }
                        catch (Exception ex2) {}
                        return;
                    }
                    final int ra = Buffer.ra(buffer, (byte)7);
                    if (ra >= 0) {
                        if (ra <= 2) {
                            if (ra >= 2) {
                                for (int unsignedShort = buffer.readUnsignedShort(311796919), j = 0; j < unsignedShort; ++j) {
                                    if (b >= 31) {
                                        throw new IllegalStateException();
                                    }
                                    final int unsignedShort2 = buffer.readUnsignedShort(-90977583);
                                    final Object method2435 = ((class478)StructComposition.findEnumerated(class478.method2432(-1853169436), Buffer.ra(buffer, (byte)7), (short)173)).method2435(buffer, -1183771146);
                                    if (unsignedShort2 >= 0) {
                                        if (b >= 31) {
                                            throw new IllegalStateException();
                                        }
                                        if (unsignedShort2 < this.intsPersistence.length) {
                                            if (b >= 31) {
                                                throw new IllegalStateException();
                                            }
                                            if (this.intsPersistence[unsignedShort2]) {
                                                if (b >= 31) {
                                                    throw new IllegalStateException();
                                                }
                                                this.map.put(unsignedShort2, method2435);
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                for (int unsignedShort3 = buffer.readUnsignedShort(-1705393510), k = 0; k < unsignedShort3; ++k) {
                                    if (b >= 31) {
                                        throw new IllegalStateException();
                                    }
                                    final int unsignedShort4 = buffer.readUnsignedShort(-1243035831);
                                    final int int1 = buffer.readInt(-1040339544);
                                    if (unsignedShort4 >= 0 && unsignedShort4 < this.intsPersistence.length && this.intsPersistence[unsignedShort4]) {
                                        if (b >= 31) {
                                            return;
                                        }
                                        this.map.put(unsignedShort4, int1);
                                    }
                                }
                                for (int unsignedShort5 = buffer.readUnsignedShort(-1810507928), l = 0; l < unsignedShort5; ++l) {
                                    if (b >= 31) {
                                        throw new IllegalStateException();
                                    }
                                    buffer.readUnsignedShort(782954984);
                                    buffer.readStringCp1252NullTerminated((byte)0);
                                }
                            }
                            try {
                                preferencesFile.close((byte)(-106));
                            }
                            catch (Exception ex3) {}
                            break Label_0568;
                        }
                        if (b >= 31) {
                            throw new IllegalStateException();
                        }
                    }
                    try {
                        preferencesFile.close((byte)(-77));
                    }
                    catch (Exception ex4) {}
                    return;
                }
                catch (Exception ex5) {
                    try {
                        preferencesFile.close((byte)(-55));
                    }
                    catch (Exception ex6) {}
                }
                finally {
                    try {
                        preferencesFile.close((byte)(-62));
                    }
                    catch (Exception ex7) {}
                }
            }
            this.unwrittenChanges = false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.aa(" + ')');
        }
    }
    
    void ai(final int i, final int j) {
        this.map.put(i, j);
        if (this.intsPersistence[i]) {
            this.unwrittenChanges = true;
        }
    }
    
    public static int dy(final Varcs varcs, final int i, final int n) {
        if (varcs == null) {
            return varcs.getInt(i, i);
        }
        try {
            final Integer value = varcs.map.get(i);
            if (!(value instanceof Integer)) {
                return -1;
            }
            if (n <= -733787727) {
                throw new IllegalStateException();
            }
            return value;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.an(" + ')');
        }
    }
    
    AccessFile by(final boolean b) {
        return Rasterizer3D.getPreferencesFile("2", Client.field358.name, b, (byte)(-78));
    }
    
    void bx() {
        if (this.unwrittenChanges && -7171747788514623875L * this.field1120 < class96.clockNow(36836521) - 60000L) {
            this.tryWrite(2092264224);
        }
    }
    
    AccessFile ap(final boolean b) {
        return Rasterizer3D.getPreferencesFile("2", Client.field358.name, b, (byte)(-128));
    }
    
    boolean bd() {
        return this.unwrittenChanges;
    }
    
    void setInt(final int i, final int j, final int n) {
        try {
            this.map.put(i, j);
            if (this.intsPersistence[i]) {
                if (n <= -849853159) {
                    throw new IllegalStateException();
                }
                this.unwrittenChanges = true;
            }
            this.tc(i, j);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.af(" + ')');
        }
    }
    
    public static ZoneOperation[] setInt(final byte b) {
        try {
            return new ZoneOperation[] { ZoneOperation.field2571, ZoneOperation.field2563, ZoneOperation.field2566, ZoneOperation.field2564, ZoneOperation.field2565, ZoneOperation.field2567, ZoneOperation.field2572, ZoneOperation.field2568, ZoneOperation.field2569, ZoneOperation.field2570, ZoneOperation.field2562 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.af(" + ')');
        }
    }
    
    @Deprecated
    String getStringOld(final int n, final byte b) {
        try {
            return this.strings[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.ab(" + ')');
        }
    }
    
    void clearTransient(final int n) {
        try {
            if (this.unwrittenChanges) {
                if (n <= 719626805) {
                    throw new IllegalStateException();
                }
                if (-7171747788514623875L * this.field1120 < class96.clockNow(1564702941) - 60000L) {
                    if (n <= 719626805) {
                        throw new IllegalStateException();
                    }
                    this.tryWrite(1833521546);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.ay(" + ')');
        }
    }
    
    static Date clearTransient(final int n) {
        try {
            final Calendar instance = Calendar.getInstance();
            instance.set(2, 0);
            instance.set(5, 1);
            instance.set(1, 1900);
            return instance.getTime();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.aq(" + ')');
        }
    }
    
    static int clearTransient(int n, final Script script, final boolean b, final int n2) {
        try {
            Widget vmethod3380;
            if (n >= 2000) {
                if (n2 <= 226455781) {
                    throw new IllegalStateException();
                }
                n -= 1000;
                vmethod3380 = class165.vmethod3380(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], (byte)5);
            }
            else {
                Widget widget;
                if (b) {
                    if (n2 <= 226455781) {
                        throw new IllegalStateException();
                    }
                    widget = SoundSystem.scriptDotWidget;
                }
                else {
                    widget = class1.scriptActiveWidget;
                }
                vmethod3380 = widget;
            }
            class144.invalidateWidget(vmethod3380, -1150862978);
            if (1200 != n) {
                if (n2 <= 226455781) {
                    throw new IllegalStateException();
                }
                if (1205 != n && 1212 != n) {
                    if (1201 == n) {
                        if (n2 <= 226455781) {
                            throw new IllegalStateException();
                        }
                        vmethod3380.modelType = 866004410;
                        vmethod3380.modelId = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] * 509431749;
                        return 1;
                    }
                    else if (n == 1202) {
                        if (n2 <= 226455781) {
                            throw new IllegalStateException();
                        }
                        vmethod3380.modelType = -848477033;
                        vmethod3380.modelId = MusicPatchNode.localPlayer.appearance.getChatHeadId((short)1364) * 509431749;
                        return 1;
                    }
                    else if (1207 == n) {
                        if (n2 <= 226455781) {
                            throw new IllegalStateException();
                        }
                        boolean b2;
                        if (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] == 1) {
                            if (n2 <= 226455781) {
                                throw new IllegalStateException();
                            }
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        SecureRandomCallable.method476(vmethod3380, MusicPatchNode.localPlayer.appearance, b2, (short)14391);
                        return 1;
                    }
                    else if (1208 == n) {
                        if (n2 <= 226455781) {
                            throw new IllegalStateException();
                        }
                        final int n3 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        if (vmethod3380.field2894 == null) {
                            throw new RuntimeException("");
                        }
                        class282.method1591(vmethod3380, n3, -1511202412);
                        return 1;
                    }
                    else if (n == 1209) {
                        if (n2 <= 226455781) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStackSize -= 854271946;
                        final int n4 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize];
                        final int n5 = Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize];
                        if (null != vmethod3380.field2894) {
                            ChatChannel.method470(vmethod3380, n4, n5, -912045646);
                            return 1;
                        }
                        if (n2 <= 226455781) {
                            throw new IllegalStateException();
                        }
                        throw new RuntimeException("");
                    }
                    else {
                        if (n != 1210) {
                            return 2;
                        }
                        if (n2 <= 226455781) {
                            throw new IllegalStateException();
                        }
                        final int n6 = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                        if (vmethod3380.field2894 != null) {
                            class162.method911(vmethod3380, 1693987821 * MusicPatchNode.localPlayer.appearance.npcTransformId, n6, (byte)(-103));
                            return 1;
                        }
                        if (n2 <= 226455781) {
                            throw new IllegalStateException();
                        }
                        throw new RuntimeException("");
                    }
                }
            }
            Interpreter.Interpreter_intStackSize -= 854271946;
            final int n7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539];
            final int n8 = Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1];
            vmethod3380.itemId = -1852876811 * n7;
            vmethod3380.itemQuantity = n8 * -568259577;
            final ItemComposition set = HealthBarUpdate.set(n7, (byte)76);
            vmethod3380.modelAngleX = 874786355 * set.xan2d;
            vmethod3380.modelAngleY = -2065246853 * set.yan2d;
            vmethod3380.modelAngleZ = set.zan2d * 745454881;
            vmethod3380.modelOffsetX = -183088313 * set.offsetX2d;
            vmethod3380.modelOffsetY = -347855449 * set.offsetY2d;
            vmethod3380.modelZoom = 1614948179 * set.zoom2d;
            if (n == 1205) {
                if (n2 <= 226455781) {
                    throw new IllegalStateException();
                }
                vmethod3380.itemQuantityMode = 0;
            }
            else {
                boolean b3;
                if (n == 1212) {
                    if (n2 <= 226455781) {
                        throw new IllegalStateException();
                    }
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                boolean b4;
                if (1552863327 * set.isStackable == 1) {
                    if (n2 <= 226455781) {
                        throw new IllegalStateException();
                    }
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                if (b3 | b4) {
                    if (n2 <= 226455781) {
                        throw new IllegalStateException();
                    }
                    vmethod3380.itemQuantityMode = -761533221;
                }
                else {
                    vmethod3380.itemQuantityMode = -1523066442;
                }
            }
            if (vmethod3380.modelRotation * -289037969 > 0) {
                if (n2 <= 226455781) {
                    throw new IllegalStateException();
                }
                vmethod3380.modelZoom = -467727501 * (100808544 * vmethod3380.modelZoom / (vmethod3380.modelRotation * -289037969));
            }
            else if (-1960603747 * vmethod3380.rawWidth > 0) {
                vmethod3380.modelZoom = 100808544 * vmethod3380.modelZoom / (-1960603747 * vmethod3380.rawWidth) * -467727501;
            }
            return 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ep.aq(" + ')');
        }
    }
    
    @Deprecated
    void aj(final int n, final String s) {
        this.strings[n] = s;
    }
    
    void ag(final int i, final int j) {
        this.map.put(i, j);
        if (this.intsPersistence[i]) {
            this.unwrittenChanges = true;
        }
    }
    
    boolean bz() {
        return this.unwrittenChanges;
    }
    
    boolean bm() {
        return this.unwrittenChanges;
    }
    
    void bk() {
        if (this.unwrittenChanges && -7171747788514623875L * this.field1120 < class96.clockNow(-67318408) - 60000L) {
            this.tryWrite(1842858363);
        }
    }
    
    public Map eo() {
        return this.map;
    }
    
    int ah(final int i) {
        final Integer value = this.map.get(i);
        if (value instanceof Integer) {
            return value;
        }
        return -1;
    }
    
    public static void kv(final Varcs varcs) {
        if (varcs == null) {
            varcs.bx();
        }
        for (int i = 0; i < varcs.intsPersistence.length; ++i) {
            if (!varcs.intsPersistence[i]) {
                varcs.map.remove(i);
            }
        }
        for (int j = 0; j < varcs.strings.length; ++j) {
            varcs.strings[j] = null;
        }
    }
}
