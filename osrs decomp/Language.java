import java.io.IOException;
import java.util.Locale;

// 
// Decompiled by Procyon v0.5.36
// 

@nk
public class Language implements class356
{
    public static final Language Language_EN;
    static MenuAction tempMenuAction;
    public static final Language Language_FR;
    static final Language field3547;
    static final Language field3548;
    public static final Language Language_ES;
    static final Language field3550;
    static final int bn = 14;
    final String language;
    final int id;
    static Font fontPlain11;
    static final Language field3554;
    public static final int bk = 1024;
    final String field3555;
    static final Language[] field3556;
    static final int dr = 3;
    
    Language(final String field3555, final String language, final String s, final ModeWhere modeWhere, final int n, final String country) {
        this.field3555 = field3555;
        this.language = language;
        this.id = n * 69691627;
        if (null != country) {
            new Locale(language.substring(0, 2), country);
        }
        else {
            new Locale(language.substring(0, 2));
        }
    }
    
    static {
        Language_EN = new Language("EN", "en", "English", ModeWhere.field3573, 0, "GB");
        field3554 = new Language("DE", "de", "German", ModeWhere.field3573, 1, "DE");
        Language_FR = new Language("FR", "fr", "French", ModeWhere.field3573, 2, "FR");
        field3547 = new Language("PT", "pt", "Portuguese", ModeWhere.field3573, 3, "BR");
        field3548 = new Language("NL", "nl", "Dutch", ModeWhere.field3568, 4, "NL");
        Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field3568, 5, "ES");
        field3550 = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field3573, 6, "MX");
        final Language[] method1947 = method1947((byte)(-121));
        field3556 = new Language[method1947.length];
        final Language[] array = method1947;
        for (int i = 0; i < array.length; ++i) {
            final Language language = array[i];
            if (Language.field3556[-1624506429 * language.id] != null) {
                throw new IllegalStateException();
            }
            Language.field3556[-1624506429 * language.id] = language;
        }
    }
    
    @Override
    public String toString() {
        try {
            return this.getLanguage((byte)80).toLowerCase(Locale.ENGLISH);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nx.toString(" + ')');
        }
    }
    
    String ao() {
        return this.language;
    }
    
    static Language[] at() {
        return new Language[] { Language.Language_FR, Language.field3548, Language.field3554, Language.field3550, Language.field3547, Language.Language_EN, Language.Language_ES };
    }
    
    static final void method1946(final boolean b, final int n) {
        try {
            class323.playPcmPlayers(-1516350255);
            final PacketWriter packetWriter = Client.packetWriter;
            packetWriter.pendingWrites -= 1313905755;
            if (1383386157 * Client.packetWriter.pendingWrites < 50) {
                if (n >= 243413340) {
                    throw new IllegalStateException();
                }
                if (!b) {
                    if (n >= 243413340) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            }
            Client.packetWriter.pendingWrites = 0;
            if (!Client.hadNetworkError) {
                if (n >= 243413340) {
                    throw new IllegalStateException();
                }
                if (Client.packetWriter.getSocket((byte)21) != null) {
                    Client.packetWriter.addNode(class330.getPacketBufferNode(ClientPacket.field2554, Client.packetWriter.isaacCipher, (short)(-19971)), 414135591);
                    try {
                        PacketWriter.ok(Client.packetWriter, 421941662);
                    }
                    catch (IOException ex2) {
                        Client.hadNetworkError = true;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nx.jv(" + ')');
        }
    }
    
    String ax() {
        return this.language;
    }
    
    String ay() {
        return this.language;
    }
    
    public static String ob(final class435 class435) {
        if (class435 == null) {
            return class435.ac();
        }
        return class435.field3824;
    }
    
    public static int dl(final Buffer buffer) {
        if (buffer == null) {
            return buffer.ik();
        }
        buffer.offset += 1262255402;
        int n = (buffer.array[-1633313603 * buffer.offset - 1] - 128 & 0xFF) + ((buffer.array[buffer.offset * -1633313603 - 2] & 0xFF) << 8);
        if (n > 32767) {
            n -= 65536;
        }
        return n;
    }
    
    static Object method1948(final class478 class478, final byte b) {
        try {
            if (null == class478) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                throw new IllegalStateException("popValueOfType() failure - null baseVarType");
            }
            else {
                switch (class478.field4029 * -22191699) {
                    default: {
                        throw new IllegalStateException("popValueOfType() failure - unsupported type");
                    }
                    case 1: {
                        return Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539];
                    }
                    case 2: {
                        return Interpreter.Interpreter_stringStack[(SecureRandomCallable.Interpreter_stringStackSize += 1086551379) * -2017760987];
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nx.cc(" + ')');
        }
    }
    
    @Override
    public int aw() {
        return -1624506429 * this.id;
    }
    
    static Language[] al() {
        return new Language[] { Language.Language_FR, Language.field3548, Language.field3554, Language.field3550, Language.field3547, Language.Language_EN, Language.Language_ES };
    }
    
    @Override
    public int an() {
        return -1624506429 * this.id;
    }
    
    @Override
    public int ac() {
        return -1624506429 * this.id;
    }
    
    public static class337[] method1947(final byte b) {
        try {
            return new class337[] { class337.field3421, class337.field3422, class337.field3423, class337.field3420 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nx.au(" + ')');
        }
    }
    
    static Language[] method1947(final byte b) {
        try {
            return new Language[] { Language.Language_FR, Language.field3548, Language.field3554, Language.field3550, Language.field3547, Language.Language_EN, Language.Language_ES };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nx.au(" + ')');
        }
    }
    
    static Language[] aa() {
        return new Language[] { Language.Language_FR, Language.field3548, Language.field3554, Language.field3550, Language.field3547, Language.Language_EN, Language.Language_ES };
    }
    
    public static Language ai(final int n) {
        if (n < 0 || n >= Language.field3556.length) {
            return null;
        }
        return Language.field3556[n];
    }
    
    public static void cg(final ItemComposition itemComposition) {
        if (itemComposition.isStackable * 1552863327 == 1) {
            itemComposition.field1774 = 0;
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return -1624506429 * this.id;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nx.af(" + ')');
        }
    }
    
    String getLanguage(final byte b) {
        try {
            return this.language;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nx.ab(" + ')');
        }
    }
    
    public static Language method1943(final int n, final byte b) {
        try {
            if (n >= 0) {
                if (n < Language.field3556.length) {
                    return Language.field3556[n];
                }
                if (b != -1) {
                    throw new IllegalStateException();
                }
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "nx.aq(" + ')');
        }
    }
    
    public static Language ag(final int n) {
        if (n < 0 || n >= Language.field3556.length) {
            return null;
        }
        return Language.field3556[n];
    }
    
    public static Language ah(final int n) {
        if (n >= 0 && n < Language.field3556.length) {
            return Language.field3556[n];
        }
        return null;
    }
    
    public String ahm() {
        return this.getLanguage((byte)43).toLowerCase(Locale.ENGLISH);
    }
    
    public String ahp() {
        return this.getLanguage((byte)90).toLowerCase(Locale.ENGLISH);
    }
}
