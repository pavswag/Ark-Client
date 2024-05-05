// 
// Decompiled by Procyon v0.5.36
// 

public class class85 implements class356
{
    static Archive archive2;
    static final class85 field871;
    static final class85 field872;
    final int field873;
    static final class85 field874;
    static Archive archive4;
    final int field876;
    static final class85 field877;
    public static final int bv = 72;
    static final class85 field878;
    
    class85(final int n, final int n2) {
        this.field873 = n * 1067867841;
        this.field876 = -1472514397 * n2;
    }
    
    static {
        field872 = new class85(0, -1);
        field878 = new class85(1, 1);
        field877 = new class85(2, 7);
        field871 = new class85(3, 8);
        field874 = new class85(4, 9);
    }
    
    @Override
    public int aw() {
        return this.field876 * 1331571979;
    }
    
    @Override
    public int an() {
        return this.field876 * 186108188;
    }
    
    @Override
    public int ac() {
        return this.field876 * 977523691;
    }
    
    public static void rsOrdinal(final AbstractArchive structDefinition_archive, final int n) {
        try {
            StructComposition.StructDefinition_archive = structDefinition_archive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dk.af(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.field876 * 1331571979;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dk.af(" + ')');
        }
    }
    
    static final void method498(final int n, final int n2, final byte b) {
        try {
            if (730065501 * Client.menuOptionsCount < 2) {
                if (b >= 24) {
                    throw new IllegalStateException();
                }
                if (-303899309 * Client.isItemSelected == 0) {
                    if (b >= 24) {
                        return;
                    }
                    if (!Client.isSpellSelected) {
                        if (b >= 24) {
                            throw new IllegalStateException();
                        }
                        return;
                    }
                }
            }
            if (Client.showMouseOverText) {
                final int method461 = DynamicObject.method461((short)(-12111));
                String str = null;
                Label_0354: {
                    if (1 == Client.isItemSelected * -303899309) {
                        if (b >= 24) {
                            return;
                        }
                        if (730065501 * Client.menuOptionsCount < 2) {
                            if (b >= 24) {
                                throw new IllegalStateException();
                            }
                            str = Strings.gu + Strings.gk + Client.field364 + " " + class96.ab;
                            break Label_0354;
                        }
                    }
                    if (Client.isSpellSelected) {
                        if (b >= 24) {
                            throw new IllegalStateException();
                        }
                        if (730065501 * Client.menuOptionsCount < 2) {
                            if (b >= 24) {
                                return;
                            }
                            str = Client.field530 + Strings.gk + Client.field522 + " " + class96.ab;
                            break Label_0354;
                        }
                    }
                    str = Friend.method2152(method461, (short)20965);
                }
                if (730065501 * Client.menuOptionsCount > 2) {
                    if (b >= 24) {
                        throw new IllegalStateException();
                    }
                    str = str + class383.method2081(16777215, 280495903) + " " + '/' + " " + (Client.menuOptionsCount * 730065501 - 2) + Strings.gw;
                }
                AbstractFont.lu(class137.fontBold12, str, 4 + n, 15 + n2, 16777215, 0, Client.cycle * -1886224337 / 1000);
                return;
            }
            if (b >= 24) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dk.kk(" + ')');
        }
    }
    
    static class85[] ab() {
        return new class85[] { class85.field871, class85.field878, class85.field874, class85.field877, class85.field872 };
    }
    
    static class85[] aq() {
        return new class85[] { class85.field871, class85.field878, class85.field874, class85.field877, class85.field872 };
    }
    
    static void method499(final int n) {
        try {
            if (class132.field1277 != null) {
                if (n == -1809136489) {
                    throw new IllegalStateException();
                }
                Client.field648 = Client.cycle * -465324813;
                class132.field1277.method1939(210134861);
                for (int i = 0; i < Client.players.length; ++i) {
                    if (n == -1809136489) {
                        throw new IllegalStateException();
                    }
                    if (Client.players[i] != null) {
                        if (n == -1809136489) {
                            throw new IllegalStateException();
                        }
                        class132.field1277.method1936(-1232093375 * WorldMapData_0.baseX + (1144428983 * Client.players[i].br >> 7), (-411750205 * Client.players[i].ep >> 7) + 827352769 * GameObject.baseY, (short)(-12492));
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dk.nq(" + ')');
        }
    }
}
