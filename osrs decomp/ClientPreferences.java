import net.runelite.api.events.VolumeChanged;
import net.runelite.api.events.VolumeChanged$Type;
import java.util.Iterator;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.api.Preferences;

// 
// Decompiled by Procyon v0.5.36
// 

public class ClientPreferences implements Preferences
{
    int musicVolume;
    boolean titleMusicDisabled;
    static final int ac = 417;
    boolean roofsHidden;
    boolean hideUsername;
    int soundEffectsVolume;
    boolean displayFps;
    double brightness;
    static final int an = 10;
    int field1036;
    static final int af = 10;
    int areaSoundEffectsVolume;
    int windowMode;
    String rememberedUsername;
    int field1040;
    final Map parameters;
    static final int ch = 30;
    
    ClientPreferences() {
        this.hideUsername = false;
        this.displayFps = false;
        this.brightness = 0.8;
        this.musicVolume = 1301921773;
        this.xo(-1);
        this.soundEffectsVolume = 590995555;
        this.ir(-1);
        this.areaSoundEffectsVolume = -1313786027;
        this.bp(-1);
        this.field1036 = 1923156277;
        this.rememberedUsername = null;
        this.windowMode = 1056868117;
        this.parameters = new LinkedHashMap();
        rt(this, true, -299950185);
    }
    
    ClientPreferences(final Buffer buffer) {
        this.hideUsername = false;
        this.displayFps = false;
        this.brightness = 0.8;
        this.musicVolume = 1301921773;
        this.xo(-1);
        this.soundEffectsVolume = 590995555;
        this.ir(-1);
        this.areaSoundEffectsVolume = -1313786027;
        this.bp(-1);
        this.field1036 = 1923156277;
        this.rememberedUsername = null;
        this.windowMode = 1056868117;
        this.parameters = new LinkedHashMap();
        if (buffer == null || buffer.array == null) {
            rt(this, true, -2017592644);
        }
        else {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra >= 0 && ra <= 10) {
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    this.roofsHidden = true;
                }
                if (ra > 1) {
                    this.titleMusicDisabled = (Buffer.ra(buffer, (byte)7) == 1);
                }
                if (ra > 3) {
                    this.windowMode = Buffer.ra(buffer, (byte)7) * 1056868117;
                }
                if (ra > 2) {
                    for (int ra2 = Buffer.ra(buffer, (byte)7), i = 0; i < ra2; ++i) {
                        this.parameters.put(buffer.readInt(-1694820613), buffer.readInt(-1182146282));
                    }
                }
                if (ra > 4) {
                    this.rememberedUsername = buffer.readStringCp1252NullTerminatedOrNull((byte)(-85));
                }
                if (ra > 5) {
                    this.hideUsername = Buffer.kn(buffer, 1404535452);
                }
                if (ra > 6) {
                    this.brightness = Buffer.ra(buffer, (byte)7) / 100.0;
                    this.musicVolume = Buffer.ra(buffer, (byte)7) * -1477768813;
                    this.xo(-1);
                    this.soundEffectsVolume = Buffer.ra(buffer, (byte)7) * -1956827619;
                    this.ir(-1);
                    this.areaSoundEffectsVolume = Buffer.ra(buffer, (byte)7) * -314712533;
                    this.bp(-1);
                }
                if (ra > 7) {
                    this.field1036 = Buffer.ra(buffer, (byte)7) * -1923156277;
                }
                if (ra > 8) {
                    this.displayFps = (Buffer.ra(buffer, (byte)7) == 1);
                }
                if (ra > 9) {
                    this.field1040 = buffer.readInt(-1976075161) * -1873612629;
                }
            }
            else {
                rt(this, true, -1535554164);
            }
        }
    }
    
    public int fp() {
        return this.field1040 * 971082243;
    }
    
    void cs(final boolean displayFps) {
        this.displayFps = displayFps;
        class100.savePreferences((byte)(-45));
    }
    
    boolean dp(final String s) {
        return this.parameters.containsKey(this.method581(s, 271816125));
    }
    
    static ClientPreferences bs() {
        AccessFile preferencesFile = null;
        ClientPreferences clientPreferences = new ClientPreferences();
        try {
            preferencesFile = Rasterizer3D.getPreferencesFile("", Client.field358.name, false, (byte)(-28));
            final byte[] array = new byte[(int)preferencesFile.length(2080986638)];
            int read;
            for (int i = 0; i < array.length; i += read) {
                read = preferencesFile.read(array, i, array.length - i, -2112960522);
                if (-1 == read) {
                    throw new IOException();
                }
            }
            clientPreferences = new ClientPreferences(new Buffer(array));
        }
        catch (Exception ex) {}
        try {
            if (null != preferencesFile) {
                preferencesFile.close((byte)(-18));
            }
        }
        catch (Exception ex2) {}
        return clientPreferences;
    }
    
    void ca() {
        this.method580(!this.displayFps, 2043952570);
    }
    
    public static int setUsernameToRemember(final ClientPreferences clientPreferences, final int n) {
        if (clientPreferences == null) {
            clientPreferences.getAreaSoundEffectsVolume(n);
        }
        try {
            return -1738472395 * clientPreferences.soundEffectsVolume;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.aj(" + ')');
        }
    }
    
    void setUsernameToRemember(final String rememberedUsername, final int n) {
        try {
            this.rememberedUsername = rememberedUsername;
            class100.savePreferences((byte)(-112));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ad(" + ')');
        }
    }
    
    int cd() {
        return this.areaSoundEffectsVolume * 1655566467;
    }
    
    String getUsernameToRemember(final int n) {
        try {
            return this.rememberedUsername;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ae(" + ')');
        }
    }
    
    public static int getUsernameToRemember(final ClientPreferences clientPreferences, final String s) {
        if (clientPreferences == null) {
            clientPreferences.sc();
        }
        final int method581 = clientPreferences.method581(s, -294257946);
        if (!clientPreferences.parameters.containsKey(method581)) {
            return 0;
        }
        return (int)clientPreferences.parameters.get(method581);
    }
    
    int cr() {
        return this.field1040 * 971082243;
    }
    
    void ce(final boolean titleMusicDisabled) {
        this.titleMusicDisabled = titleMusicDisabled;
        class100.savePreferences((byte)(-106));
    }
    
    void method576(final int n, final int n2) {
        try {
            this.field1036 = n * -1956827619;
            this.ir(-1);
            class100.savePreferences((byte)(-30));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.as(" + ')');
        }
    }
    
    void cb(final int n) {
        this.musicVolume = n * -1764917110;
        class100.savePreferences((byte)(-50));
    }
    
    int da(final String s) {
        return Actor.method539(s.toLowerCase(), (byte)19);
    }
    
    public static Buffer pa(final ClientPreferences clientPreferences) {
        if (clientPreferences == null) {
            clientPreferences.getHideUsername();
        }
        final Buffer buffer = new Buffer(417, true);
        buffer.writeShort(10, (byte)11);
        buffer.writeShort(clientPreferences.roofsHidden ? 1 : 0, (byte)56);
        buffer.writeShort(clientPreferences.titleMusicDisabled ? 1 : 0, (byte)47);
        buffer.writeShort(clientPreferences.windowMode * 769885273, (byte)49);
        buffer.writeShort(clientPreferences.parameters.size(), (byte)29);
        for (final Map.Entry<K, Integer> entry : clientPreferences.parameters.entrySet()) {
            buffer.writeInt((int)entry.getKey(), -2081835031);
            buffer.writeInt(entry.getValue(), -2081835031);
        }
        buffer.writeStringCp1252NullCircumfixed((null != clientPreferences.rememberedUsername) ? clientPreferences.rememberedUsername : "", -1965803098);
        buffer.writeBoolean(clientPreferences.hideUsername, 614283261);
        buffer.writeShort((int)(clientPreferences.brightness * 100.0), (byte)118);
        buffer.writeShort(-461734757 * clientPreferences.musicVolume, (byte)75);
        buffer.writeShort(1767656285 * clientPreferences.soundEffectsVolume, (byte)61);
        buffer.writeShort(clientPreferences.areaSoundEffectsVolume * -1669266377, (byte)67);
        buffer.writeShort(clientPreferences.field1036 * 1485272108, (byte)16);
        buffer.writeShort(clientPreferences.displayFps ? 1 : 0, (byte)1);
        buffer.writeInt(1013117136 * clientPreferences.field1040, -2081835031);
        return buffer;
    }
    
    void ch(final int n) {
        this.soundEffectsVolume = n * -1956827619;
        class100.savePreferences((byte)(-42));
    }
    
    void cn(final boolean displayFps) {
        this.displayFps = displayFps;
        class100.savePreferences((byte)(-94));
    }
    
    public double sc() {
        return this.brightness;
    }
    
    boolean db(final String s) {
        return this.parameters.containsKey(this.method581(s, -2018990347));
    }
    
    public static boolean ss(final ClientPreferences clientPreferences, final int n) {
        if (clientPreferences == null) {
            clientPreferences.getTitleMusicDisabled(n);
        }
        try {
            return clientPreferences.titleMusicDisabled;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.aa(" + ')');
        }
    }
    
    public Buffer mc() {
        return this.toBuffer((byte)43);
    }
    
    void cf(final int n) {
        this.field1040 = 605656486 * n;
        class100.savePreferences((byte)(-101));
    }
    
    int dn(final String s) {
        return Actor.method539(s.toLowerCase(), (byte)114);
    }
    
    public boolean cw() {
        return this.displayFps;
    }
    
    int cw() {
        return this.musicVolume * -461734757;
    }
    
    void cv(final double brightness) {
        this.brightness = brightness;
        class100.savePreferences((byte)(-30));
    }
    
    void method556(final int n) {
        try {
            boolean b;
            if (!this.displayFps) {
                if (n >= 2108671835) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            this.method580(b, 2121132599);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ao(" + ')');
        }
    }
    
    void getTitleMusicDisabled(final boolean titleMusicDisabled, final int n) {
        try {
            this.titleMusicDisabled = titleMusicDisabled;
            class100.savePreferences((byte)(-1));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.at(" + ')');
        }
    }
    
    void setAreaSoundEffectsVolume(final int n, final int n2) {
        try {
            this.areaSoundEffectsVolume = n * -314712533;
            this.bp(-1);
            class100.savePreferences((byte)(-17));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ak(" + ')');
        }
    }
    
    double getBrightness(final int n) {
        try {
            return this.brightness;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.av(" + ')');
        }
    }
    
    public boolean cj() {
        return this.roofsHidden;
    }
    
    int cj() {
        return this.musicVolume * -461734757;
    }
    
    void method582(final String s, final int i, final byte b) {
        try {
            final int method581 = this.method581(s, -1970967103);
            if (this.parameters.size() >= 10 && !this.parameters.containsKey(method581)) {
                if (b <= 5) {
                    return;
                }
                final Iterator iterator = this.parameters.entrySet().iterator();
                iterator.next();
                iterator.remove();
            }
            this.parameters.put(method581, i);
            class100.savePreferences((byte)(-13));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.be(" + ')');
        }
    }
    
    void setCurrentSoundEffectVolume(final int n, final int n2) {
        try {
            this.windowMode = n * -1956827619;
            this.xo(-1);
            class100.savePreferences((byte)(-30));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.as(" + ')');
        }
    }
    
    int getAreaSoundEffectsVolume(final int n) {
        try {
            return this.windowMode * 1655566467;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.az(" + ')');
        }
    }
    
    boolean method562(final short n) {
        try {
            return this.displayFps;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ax(" + ')');
        }
    }
    
    void method580(final boolean displayFps, final int n) {
        try {
            this.displayFps = displayFps;
            class100.savePreferences((byte)0);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ay(" + ')');
        }
    }
    
    void dt(final int n) {
        this.windowMode = n * 1056868117;
        class100.savePreferences((byte)(-77));
    }
    
    public static int xp(final ClientPreferences clientPreferences, final int n) {
        if (clientPreferences == null) {
            return clientPreferences.method575(n);
        }
        try {
            return clientPreferences.musicVolume * -461734757;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.am(" + ')');
        }
    }
    
    int method577(final byte b) {
        try {
            return -1016688579 * this.windowMode;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.bi(" + ')');
        }
    }
    
    boolean bv() {
        return this.roofsHidden;
    }
    
    public boolean wi() {
        return this.titleMusicDisabled;
    }
    
    void dl(final int n) {
        this.field1036 = -1923156277 * n;
        class100.savePreferences((byte)(-55));
    }
    
    boolean ck() {
        return this.displayFps;
    }
    
    int method581(final String s, final int n) {
        try {
            return Actor.method539(s.toLowerCase(), (byte)59);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.bo(" + ')');
        }
    }
    
    public void bp(final int n) {
        ScriptFrame.client.getCallbacks().post((Object)new VolumeChanged(VolumeChanged$Type.AREA));
    }
    
    void ct(final int n) {
        this.soundEffectsVolume = n * -1956827619;
        class100.savePreferences((byte)(-98));
    }
    
    void cc(final boolean roofsHidden) {
        this.roofsHidden = roofsHidden;
        class100.savePreferences((byte)(-91));
    }
    
    public static void rt(final ClientPreferences clientPreferences, final boolean b, final int n) {
        if (clientPreferences == null) {
            clientPreferences.method557(b, n);
            return;
        }
    }
    
    Buffer bt() {
        final Buffer buffer = new Buffer(417, true);
        buffer.writeShort(10, (byte)6);
        buffer.writeShort(this.roofsHidden ? 1 : 0, (byte)53);
        buffer.writeShort(this.titleMusicDisabled ? 1 : 0, (byte)120);
        buffer.writeShort(this.windowMode * -1016688579, (byte)104);
        buffer.writeShort(this.parameters.size(), (byte)94);
        for (final Map.Entry<Integer, V> entry : this.parameters.entrySet()) {
            buffer.writeInt(entry.getKey(), -2081835031);
            buffer.writeInt((int)entry.getValue(), -2081835031);
        }
        buffer.writeStringCp1252NullCircumfixed((null != this.rememberedUsername) ? this.rememberedUsername : "", -2061376517);
        buffer.writeBoolean(this.hideUsername, 614283261);
        buffer.writeShort((int)(this.brightness * 100.0), (byte)18);
        buffer.writeShort(-461734757 * this.musicVolume, (byte)79);
        buffer.writeShort(-1738472395 * this.soundEffectsVolume, (byte)11);
        buffer.writeShort(this.areaSoundEffectsVolume * 1655566467, (byte)21);
        buffer.writeShort(this.field1036 * -934134045, (byte)111);
        buffer.writeShort(this.displayFps ? 1 : 0, (byte)53);
        buffer.writeInt(971082243 * this.field1040, -2081835031);
        return buffer;
    }
    
    int ds(final String s) {
        return Actor.method539(s.toLowerCase(), (byte)12);
    }
    
    public static void pb(final ClientPreferences clientPreferences, final boolean roofsHidden, final int n) {
        if (clientPreferences == null) {
            clientPreferences.setRoofsHidden(roofsHidden, n);
            return;
        }
        try {
            clientPreferences.roofsHidden = roofsHidden;
            class100.savePreferences((byte)(-58));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.au(" + ')');
        }
    }
    
    public static int dh(final ClientPreferences clientPreferences, final String s) {
        if (clientPreferences == null) {
            return clientPreferences.ds(s);
        }
        return Actor.method539(s.toLowerCase(), (byte)119);
    }
    
    boolean dh(final String s) {
        return this.parameters.containsKey(this.method581(s, 331892263));
    }
    
    static ClientPreferences br() {
        AccessFile preferencesFile = null;
        ClientPreferences clientPreferences = new ClientPreferences();
        try {
            preferencesFile = Rasterizer3D.getPreferencesFile("", Client.field358.name, false, (byte)(-50));
            final byte[] array = new byte[(int)preferencesFile.length(2016174619)];
            int read;
            for (int i = 0; i < array.length; i += read) {
                read = preferencesFile.read(array, i, array.length - i, -1591292992);
                if (-1 == read) {
                    throw new IOException();
                }
            }
            clientPreferences = new ClientPreferences(new Buffer(array));
        }
        catch (Exception ex) {}
        try {
            if (null != preferencesFile) {
                preferencesFile.close((byte)(-104));
            }
        }
        catch (Exception ex2) {}
        return clientPreferences;
    }
    
    boolean ci() {
        return this.titleMusicDisabled;
    }
    
    int getCurrentMusicVolume(final int n) {
        try {
            return this.field1040 * 971082243;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ag(" + ')');
        }
    }
    
    boolean getIsUsernameHidden(final int n) {
        try {
            return this.roofsHidden;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.al(" + ')');
        }
    }
    
    boolean df(final String s) {
        return this.parameters.containsKey(this.method581(s, -566477662));
    }
    
    public static void df(final ClientPreferences clientPreferences, final int n) {
        if (clientPreferences == null) {
            clientPreferences.setCurrentMusicVolume(n, n);
            return;
        }
        clientPreferences.areaSoundEffectsVolume = n * -314712533;
        class100.savePreferences((byte)(-30));
    }
    
    void cu() {
        this.method580(!this.displayFps, 1961100201);
    }
    
    Buffer toBuffer(final byte b) {
        try {
            final Buffer buffer = new Buffer(417, true);
            buffer.writeShort(10, (byte)1);
            final Buffer buffer2 = buffer;
            int n;
            if (this.roofsHidden) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                n = 1;
            }
            else {
                n = 0;
            }
            buffer2.writeShort(n, (byte)23);
            buffer.writeShort(this.titleMusicDisabled ? 1 : 0, (byte)58);
            buffer.writeShort(this.windowMode * -1016688579, (byte)60);
            buffer.writeShort(this.parameters.size(), (byte)94);
            for (final Map.Entry<Integer, V> entry : this.parameters.entrySet()) {
                buffer.writeInt(entry.getKey(), -2081835031);
                buffer.writeInt((int)entry.getValue(), -2081835031);
            }
            buffer.writeStringCp1252NullCircumfixed((null != this.rememberedUsername) ? this.rememberedUsername : "", -2068470209);
            buffer.writeBoolean(this.hideUsername, 614283261);
            buffer.writeShort((int)(this.brightness * 100.0), (byte)108);
            buffer.writeShort(-461734757 * this.musicVolume, (byte)39);
            buffer.writeShort(-1738472395 * this.soundEffectsVolume, (byte)78);
            buffer.writeShort(this.areaSoundEffectsVolume * 1655566467, (byte)86);
            buffer.writeShort(this.field1036 * -934134045, (byte)75);
            final Buffer buffer3 = buffer;
            int n2;
            if (this.displayFps) {
                if (b <= 0) {
                    throw new IllegalStateException();
                }
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            buffer3.writeShort(n2, (byte)36);
            buffer.writeInt(971082243 * this.field1040, -2081835031);
            return buffer;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.an(" + ')');
        }
    }
    
    void bq(final boolean roofsHidden) {
        this.roofsHidden = roofsHidden;
        class100.savePreferences((byte)(-79));
    }
    
    int dk() {
        return this.field1036 * 1383379929;
    }
    
    String do() {
        return this.rememberedUsername;
    }
    
    void dz(final int n) {
        this.windowMode = n * 1627252785;
        class100.savePreferences((byte)(-72));
    }
    
    int de() {
        return -1016688579 * this.windowMode;
    }
    
    public static void tw(final ClientPreferences clientPreferences, final int n, final int n2) {
        if (clientPreferences == null) {
            clientPreferences.setCurrentSoundEffectVolume(n, n);
            return;
        }
        try {
            clientPreferences.soundEffectsVolume = n * -1956827619;
            clientPreferences.ir(-1);
            class100.savePreferences((byte)(-30));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.as(" + ')');
        }
    }
    
    void setRoofsHidden(final boolean roofsHidden, final int n) {
        try {
            this.roofsHidden = roofsHidden;
            class100.savePreferences((byte)(-58));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.au(" + ')');
        }
    }
    
    boolean getTitleMusicDisabled(final int n) {
        try {
            return this.roofsHidden;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.aa(" + ')');
        }
    }
    
    public static boolean ty(final ClientPreferences clientPreferences, final int n) {
        if (clientPreferences == null) {
            clientPreferences.getIsUsernameHidden(n);
        }
        try {
            return clientPreferences.hideUsername;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.al(" + ')');
        }
    }
    
    void method587(final int n, final byte b) {
        try {
            this.field1040 = -1873612629 * n;
            class100.savePreferences((byte)(-107));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ai(" + ')');
        }
    }
    
    int dy(final String s) {
        return Actor.method539(s.toLowerCase(), (byte)98);
    }
    
    public static void iv(final ClientPreferences clientPreferences, final double brightness) {
        if (clientPreferences == null) {
            clientPreferences.cv(brightness);
            return;
        }
        clientPreferences.brightness = brightness;
        class100.savePreferences((byte)(-30));
    }
    
    int method575(final int n) {
        try {
            return this.areaSoundEffectsVolume * -461734757;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.am(" + ')');
        }
    }
    
    int method579(final String s, final byte b) {
        try {
            final int method581 = this.method581(s, 1030951960);
            if (!this.parameters.containsKey(method581)) {
                return 0;
            }
            return (int)this.parameters.get(method581);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.bx(" + ')');
        }
    }
    
    void setCurrentMusicVolume(final int n, final int n2) {
        try {
            this.areaSoundEffectsVolume = n * -1956827619;
            this.ir(-1);
            class100.savePreferences((byte)(-30));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.as(" + ')');
        }
    }
    
    public static void setCurrentMusicVolume(final ClientPreferences clientPreferences, final double brightness) {
        if (clientPreferences == null) {
            clientPreferences.cw();
        }
        clientPreferences.brightness = brightness;
        class100.savePreferences((byte)(-96));
    }
    
    void method574(final int n, final int n2) {
        try {
            this.field1040 = -1923156277 * n;
            class100.savePreferences((byte)(-69));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ap(" + ')');
        }
    }
    
    void bd(final boolean b) {
    }
    
    void cm(final int n) {
        this.field1040 = -1873612629 * n;
        class100.savePreferences((byte)(-25));
    }
    
    static void bg() {
        AccessFile preferencesFile = null;
        try {
            preferencesFile = Rasterizer3D.getPreferencesFile("", Client.field358.name, true, (byte)(-44));
            final Buffer buffer = class20.clientPreferences.toBuffer((byte)93);
            preferencesFile.write(buffer.array, 0, buffer.offset * 1845611723, 185047612);
        }
        catch (Exception ex) {}
        try {
            if (null != preferencesFile) {
                AccessFile.gr(preferencesFile, true, (byte)10);
            }
        }
        catch (Exception ex2) {}
    }
    
    public void ir(final int n) {
        ScriptFrame.client.getCallbacks().post((Object)new VolumeChanged(VolumeChanged$Type.EFFECTS));
    }
    
    int cg() {
        return this.field1040 * 1723943518;
    }
    
    int co() {
        return this.musicVolume * -461734757;
    }
    
    public static void uk(final ClientPreferences clientPreferences, final int n, final int n2) {
        if (clientPreferences == null) {
            clientPreferences.method576(n, n);
        }
        try {
            clientPreferences.windowMode = n * 1056868117;
            class100.savePreferences((byte)(-23));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.bb(" + ')');
        }
    }
    
    void method557(final boolean b, final int n) {
    }
    
    static ClientPreferences bn() {
        AccessFile preferencesFile = null;
        ClientPreferences clientPreferences = new ClientPreferences();
        try {
            preferencesFile = Rasterizer3D.getPreferencesFile("", Client.field358.name, false, (byte)(-42));
            final byte[] array = new byte[(int)preferencesFile.length(2048426288)];
            int read;
            for (int i = 0; i < array.length; i += read) {
                read = preferencesFile.read(array, i, array.length - i, -1371253920);
                if (-1 == read) {
                    throw new IOException();
                }
            }
            clientPreferences = new ClientPreferences(new Buffer(array));
        }
        catch (Exception ex) {}
        try {
            if (null != preferencesFile) {
                preferencesFile.close((byte)(-17));
            }
        }
        catch (Exception ex2) {}
        return clientPreferences;
    }
    
    public static void cz(final ClientPreferences clientPreferences, final String s, final int i, final byte b) {
        if (clientPreferences == null) {
            clientPreferences.method582(s, i, b);
        }
        try {
            final int method581 = clientPreferences.method581(s, -1970967103);
            if (clientPreferences.parameters.size() >= 10 && !clientPreferences.parameters.containsKey(method581)) {
                if (b <= 5) {
                    return;
                }
                final Iterator iterator = clientPreferences.parameters.entrySet().iterator();
                iterator.next();
                iterator.remove();
            }
            clientPreferences.parameters.put(method581, i);
            class100.savePreferences((byte)(-13));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.be(" + ')');
        }
    }
    
    int cz() {
        return this.musicVolume * -461734757;
    }
    
    void dr(final int n) {
        this.field1036 = -1923156277 * n;
        class100.savePreferences((byte)(-105));
    }
    
    boolean getRoofsHidden(final int n) {
        try {
            return this.roofsHidden;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ab(" + ')');
        }
    }
    
    static final void setIsUsernameHidden(final PacketBuffer packetBuffer, final int n, final Player player, final int n2, final byte b) {
        try {
            byte b2 = MoveSpeed.STATIONARY.speed;
            if (0x0 != (n2 & 0x2)) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                final int eq = packetBuffer.eq((byte)(-23));
                final byte[] array = new byte[eq];
                final Buffer buffer = new Buffer(array);
                Buffer.io(packetBuffer, array, 0, eq, -1570744551);
                player.read(Players.cachedAppearanceBuffer[n] = buffer, -1943187792);
            }
            if (0x0 != (n2 & 0x10)) {
                int or = Buffer.or(packetBuffer, -523126268);
                if (65535 == or) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    or = -1;
                }
                FloorDecoration.performPlayerAnimation(player, or, packetBuffer.df(-2032922264), -1059867527);
            }
            if (0x0 != (n2 & 0x4)) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                player.bz = Buffer.zc(packetBuffer, -1155912512) * 1052277865;
                player.zr(-1);
                player.bz += (packetBuffer.eq((byte)(-110)) << 16) * 1052277865;
                player.zr(-1);
                if (player.bz * 1005900761 == 16777215) {
                    if (b >= 0) {
                        return;
                    }
                    player.bz = -1052277865;
                    player.zr(-1);
                }
            }
            if ((n2 & 0x80) != 0x0) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                player.bw = packetBuffer.cw((byte)0);
                player.te(-1);
                if (player.bw.charAt(0) == '~') {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    player.bw = player.bw.substring(1);
                    player.te(-1);
                    UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
                }
                else if (player == MusicPatchNode.localPlayer) {
                    UserComparator5.addGameMessage(2, player.username.getName(-710264960), player.bw, -397121414);
                }
                player.ce = false;
                player.cn = 0;
                player.dh = 0;
                player.dt = -739348018;
            }
            if ((n2 & 0x40) != 0x0) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                final int ra = Buffer.ra(packetBuffer, (byte)7);
                if (ra > 0) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    for (int i = 0; i < ra; ++i) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        int cd = -1;
                        int n3 = -1;
                        int cd2 = -1;
                        int n4 = packetBuffer.cd(-1669577471);
                        if (n4 == 32767) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            n4 = packetBuffer.cd(-664197509);
                            n3 = packetBuffer.cd(-1143699491);
                            cd = packetBuffer.cd(-1579056340);
                            cd2 = packetBuffer.cd(-683077650);
                        }
                        else if (n4 != 32766) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            n3 = packetBuffer.cd(-1208096133);
                        }
                        else {
                            n4 = -1;
                        }
                        player.co(n4, n3, cd, cd2, Client.cycle * -1886224337, packetBuffer.cd(-1626403646), 1919870398);
                    }
                }
                final int eq2 = packetBuffer.eq((byte)(-19));
                if (eq2 > 0) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    for (int j = 0; j < eq2; ++j) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        final int cd3 = packetBuffer.cd(-1008172524);
                        final int cd4 = packetBuffer.cd(-1007608623);
                        if (32767 != cd4) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            final int cd5 = packetBuffer.cd(-381851079);
                            final int dq = packetBuffer.dq(-2070899692);
                            int df;
                            if (cd4 > 0) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                df = packetBuffer.df(-2015179409);
                            }
                            else {
                                df = dq;
                            }
                            player.cz(cd3, Client.cycle * -1886224337, cd4, cd5, dq, df, (byte)108);
                        }
                        else {
                            Actor.dn(player, cd3, 1269115179);
                        }
                    }
                }
            }
            if ((n2 & 0x1) != 0x0) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                player.di = packetBuffer.cl(-2142773761) * -1409690365;
                if (0 == player.cb * 1134756167) {
                    player.bj = player.di * 948720829;
                    player.cd(-2133185468);
                }
            }
            if (0x0 != (n2 & 0x20)) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                final int or2 = Buffer.or(packetBuffer, -523126268);
                final PlayerType playerType = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values((byte)(-26)), Buffer.ra(packetBuffer, (byte)7), (short)173);
                boolean b3;
                if (packetBuffer.df(-1988197335) == 1) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                final boolean ce = b3;
                final int eq3 = packetBuffer.eq((byte)(-113));
                final int n5 = -1633313603 * packetBuffer.at;
                if (player.username != null) {
                    if (b >= 0) {
                        return;
                    }
                    if (null != player.appearance) {
                        if (b >= 0) {
                            throw new IllegalStateException();
                        }
                        int n6 = 0;
                        if (playerType.isUser && World.friendSystem.isIgnored(player.username, 448491204)) {
                            n6 = 1;
                        }
                        if (n6 == 0) {
                            if (b >= 0) {
                                throw new IllegalStateException();
                            }
                            if (Client.field476 * 43311027 == 0) {
                                if (b >= 0) {
                                    throw new IllegalStateException();
                                }
                                if (!player.isHidden) {
                                    if (b >= 0) {
                                        throw new IllegalStateException();
                                    }
                                    Players.field1094.offset = 0;
                                    Buffer.io(packetBuffer, Players.field1094.array, 0, eq3, -1570744551);
                                    Players.field1094.offset = 0;
                                    final String escapeBrackets = AbstractFont.escapeBrackets(BuddyRankComparator.method711(SceneTilePaint.readString(Players.field1094, (byte)22), (byte)(-121)));
                                    player.bw = escapeBrackets.trim();
                                    player.te(-1);
                                    player.cn = 1732198649 * (or2 >> 8);
                                    player.dh = 1666666057 * (or2 & 0xFF);
                                    player.dt = -739348018;
                                    player.ce = ce;
                                    boolean ci = false;
                                    Label_1515: {
                                        if (MusicPatchNode.localPlayer != player) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            if (playerType.isUser && "" != Client.field586) {
                                                if (b >= 0) {
                                                    throw new IllegalStateException();
                                                }
                                                if (escapeBrackets.toLowerCase().indexOf(Client.field586) == -1) {
                                                    if (b >= 0) {
                                                        throw new IllegalStateException();
                                                    }
                                                    ci = true;
                                                    break Label_1515;
                                                }
                                            }
                                        }
                                        ci = false;
                                    }
                                    player.ci = ci;
                                    int n8;
                                    if (playerType.isPrivileged) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        int n7;
                                        if (ce) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            n7 = 91;
                                        }
                                        else {
                                            n7 = 1;
                                        }
                                        n8 = n7;
                                    }
                                    else {
                                        int n9;
                                        if (ce) {
                                            if (b >= 0) {
                                                throw new IllegalStateException();
                                            }
                                            n9 = 90;
                                        }
                                        else {
                                            n9 = 2;
                                        }
                                        n8 = n9;
                                    }
                                    if (-1 != playerType.modIcon * 2138745227) {
                                        if (b >= 0) {
                                            throw new IllegalStateException();
                                        }
                                        UserComparator5.addGameMessage(n8, ArchiveDiskActionHandler.addImageTag(2138745227 * playerType.modIcon, 1707899837) + player.username.getName(-710264960), escapeBrackets, -397121414);
                                    }
                                    else {
                                        UserComparator5.addGameMessage(n8, player.username.getName(-710264960), escapeBrackets, -397121414);
                                    }
                                }
                            }
                        }
                    }
                }
                packetBuffer.at = -1516355947 * (n5 + eq3);
            }
            if ((n2 & 0x1000) != 0x0) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                final int cl = packetBuffer.cl(50551235);
                final int vl = Buffer.vl(packetBuffer, 363073604);
                player.cj(0, cl, vl >> 16, vl & 0xFFFF, 461666962);
            }
            if ((n2 & 0x400) != 0x0) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                player.cc = Buffer.wu(packetBuffer, 435772489) * -278393391;
                player.cz = packetBuffer.dx(-1768453502) * -1448856093;
                player.dd = packetBuffer.dj(157402377) * 242410523;
                player.bl = packetBuffer.dj(-390113501) * 2106434927;
                player.dv = (Buffer.zc(packetBuffer, -1613227680) + Client.cycle * -1886224337) * -608537751;
                player.cw = (packetBuffer.cl(-716459504) + -1886224337 * Client.cycle) * -2100738849;
                player.ct = Buffer.zc(packetBuffer, -794014581) * -698990457;
                if (player.hasMovementPending) {
                    if (b >= 0) {
                        return;
                    }
                    player.cc += -1987308883 * player.tileX;
                    player.cz += 198846147 * player.tileY;
                    player.dd += 580103439 * player.tileX;
                    player.bl += player.tileY * 999446991;
                    player.cb = 0;
                }
                else {
                    player.cc += player.cf[0] * -278393391;
                    player.cz += -1448856093 * player.dy[0];
                    player.dd += player.cf[0] * 242410523;
                    player.bl += player.dy[0] * 2106434927;
                    player.cb = 400971895;
                }
                player.dk = 0;
            }
            if (0x0 != (n2 & 0x200)) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                Players.playerMovementSpeeds[n] = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, Buffer.writeByteNeg(packetBuffer, 1036326896), (short)173);
            }
            if (0x0 != (n2 & 0x800)) {
                if (b >= 0) {
                    return;
                }
                b2 = Buffer.wu(packetBuffer, 435772489);
            }
            if ((n2 & 0x2000) != 0x0) {
                for (int k = 0; k < 3; ++k) {
                    if (b >= 0) {
                        throw new IllegalStateException();
                    }
                    player.actions[k] = packetBuffer.cw((byte)0);
                }
            }
            if ((n2 & 0x8000) != 0x0) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                player.dj = (-1886224337 * Client.cycle + Buffer.zc(packetBuffer, 325307348)) * -887211183;
                player.bn = (-1886224337 * Client.cycle + packetBuffer.cl(568171869)) * -368061749;
                player.du = Buffer.wu(packetBuffer, 435772489);
                player.db = Buffer.wu(packetBuffer, 435772489);
                player.df = Buffer.writeByteNeg(packetBuffer, -275895724);
                player.dq = (byte)packetBuffer.df(-2139502669);
            }
            if ((n2 & 0x10000) != 0x0) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                for (int dq2 = packetBuffer.dq(-2070899692), l = 0; l < dq2; ++l) {
                    final int df2 = packetBuffer.df(-2041663917);
                    final int zc = Buffer.zc(packetBuffer, -1332583140);
                    final int cx = packetBuffer.cx(-1592627762);
                    player.cj(df2, zc, cx >> 16, cx & 0xFFFF, 2051903393);
                }
            }
            if (player.hasMovementPending) {
                if (b >= 0) {
                    return;
                }
                if (127 == b2) {
                    player.resetPath(2039538205 * player.tileX, player.tileY * 1584800161, -1637184439);
                }
                else {
                    MoveSpeed moveSpeed;
                    if (b2 != MoveSpeed.STATIONARY.speed) {
                        if (b >= 0) {
                            return;
                        }
                        moveSpeed = (MoveSpeed)StructComposition.findEnumerated(new MoveSpeed[] { MoveSpeed.WALK, MoveSpeed.STATIONARY, MoveSpeed.CRAWL, MoveSpeed.RUN }, b2, (short)173);
                    }
                    else {
                        moveSpeed = Players.playerMovementSpeeds[n];
                    }
                    player.move(2039538205 * player.tileX, player.tileY * 1584800161, moveSpeed, (byte)(-57));
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.aq(" + ')');
        }
    }
    
    void setIsUsernameHidden(final boolean hideUsername, final int n) {
        try {
            this.hideUsername = hideUsername;
            class100.savePreferences((byte)(-14));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.aq(" + ')');
        }
    }
    
    int getCurrentSoundEffectsVolume(final int n) {
        try {
            return this.field1036 * -934134045;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.by(" + ')');
        }
    }
    
    int method573(final int n) {
        try {
            return this.areaSoundEffectsVolume * 1655566467;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.az(" + ')');
        }
    }
    
    void bl(final boolean hideUsername) {
        this.hideUsername = hideUsername;
        class100.savePreferences((byte)(-56));
    }
    
    public int getSoundEffectVolume() {
        return this.soundEffectsVolume * -1738472395;
    }
    
    int dg() {
        return -1016688579 * this.windowMode;
    }
    
    void bz(final boolean b) {
    }
    
    public void jm(final int n) {
        this.musicVolume = n * -1477768813;
    }
    
    public int ww() {
        return this.windowMode * -1016688579;
    }
    
    int dd(final String s) {
        final int method581 = this.method581(s, 925234748);
        if (!this.parameters.containsKey(method581)) {
            return 0;
        }
        return (int)this.parameters.get(method581);
    }
    
    int dj(final String s) {
        final int method581 = this.method581(s, -250336017);
        if (!this.parameters.containsKey(method581)) {
            return 0;
        }
        return (int)this.parameters.get(method581);
    }
    
    public static void nq(final ClientPreferences clientPreferences, final boolean hideUsername) {
        if (clientPreferences == null) {
            clientPreferences.de();
        }
        clientPreferences.hideUsername = hideUsername;
        class100.savePreferences((byte)(-36));
    }
    
    public void xo(final int n) {
        ScriptFrame.client.getCallbacks().post((Object)new VolumeChanged(VolumeChanged$Type.MUSIC));
    }
    
    void cq(final int n) {
        this.field1040 = -1873612629 * n;
        class100.savePreferences((byte)(-40));
    }
    
    boolean method563(final String s, final byte b) {
        try {
            return this.parameters.containsKey(this.method581(s, -643798559));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.bk(" + ')');
        }
    }
    
    public int eo() {
        return this.musicVolume * -461734757;
    }
    
    void setBrightness(final double brightness) {
        try {
            this.brightness = brightness;
            class100.savePreferences((byte)(-97));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ah(" + ')');
        }
    }
    
    public static boolean setBrightness(final ClientPreferences clientPreferences, final String s, final byte b) {
        if (clientPreferences == null) {
            clientPreferences.method563(s, b);
        }
        try {
            return clientPreferences.parameters.containsKey(clientPreferences.method581(s, -643798559));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.bk(" + ')');
        }
    }
    
    public boolean getHideUsername() {
        return this.hideUsername;
    }
    
    public static void wq(final ClientPreferences clientPreferences, final boolean hideUsername) {
        if (clientPreferences == null) {
            clientPreferences.cr();
        }
        clientPreferences.hideUsername = hideUsername;
        class100.savePreferences((byte)(-123));
    }
    
    public int vr() {
        return this.field1036 * -934134045;
    }
    
    public static void kw(final ClientPreferences clientPreferences, final int n, final int n2) {
        if (clientPreferences == null) {
            clientPreferences.method574(n, n);
            return;
        }
        try {
            clientPreferences.field1036 = -1923156277 * n;
            class100.savePreferences((byte)(-69));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ap(" + ')');
        }
    }
    
    public static void ql(final ClientPreferences clientPreferences, final int n, final int n2) {
        if (clientPreferences == null) {
            clientPreferences.setCurrentMusicVolume(n, n);
            return;
        }
        try {
            clientPreferences.musicVolume = n * -1477768813;
            clientPreferences.xo(-1);
            class100.savePreferences((byte)(-31));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "du.ar(" + ')');
        }
    }
    
    public static int yk(final ClientPreferences clientPreferences) {
        return clientPreferences.areaSoundEffectsVolume * 1655566467;
    }
    
    public int getAreaSoundEffectVolume() {
        return this.areaSoundEffectsVolume * 1655566467;
    }
    
    public void setSoundEffectVolume(final int n) {
        this.soundEffectsVolume = n * -1956827619;
    }
    
    public String getRememberedUsername() {
        return this.rememberedUsername;
    }
    
    public void setAreaSoundEffectVolume(final int n) {
        this.areaSoundEffectsVolume = n * -314712533;
    }
    
    public void setRememberedUsername(final String rememberedUsername) {
        this.rememberedUsername = rememberedUsername;
    }
    
    public static int ju(final ClientPreferences clientPreferences) {
        return clientPreferences.areaSoundEffectsVolume * 1655566467;
    }
    
    void bf(final boolean roofsHidden) {
        this.roofsHidden = roofsHidden;
        class100.savePreferences((byte)(-103));
    }
    
    static void bu() {
        AccessFile preferencesFile = null;
        try {
            preferencesFile = Rasterizer3D.getPreferencesFile("", Client.field358.name, true, (byte)(-76));
            final Buffer buffer = class20.clientPreferences.toBuffer((byte)73);
            preferencesFile.write(buffer.array, 0, buffer.offset * -1633313603, 185047612);
        }
        catch (Exception ex) {}
        try {
            if (null != preferencesFile) {
                AccessFile.gr(preferencesFile, true, (byte)10);
            }
        }
        catch (Exception ex2) {}
    }
    
    boolean du(final String s) {
        return this.parameters.containsKey(this.method581(s, -1426913581));
    }
}
