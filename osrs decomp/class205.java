import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class class205 implements class29
{
    boolean field1847;
    static Archive archive20;
    boolean field1849;
    public static final int ev = 1;
    static final int au = 2;
    Widget field1850;
    
    public class205() {
        this.field1850 = null;
        this.field1847 = false;
        this.field1849 = false;
    }
    
    boolean ae(final int n) {
        if (this.field1850 == null) {
            return false;
        }
        final class314 method1815 = this.field1850.method1815((byte)(-105));
        if (method1815 == null || !method1815.da(1672133044)) {
            return false;
        }
        switch (n) {
            case 65: {
                if (this.field1847) {
                    method1815.method1776(class143.method815(-347937854), (byte)126);
                }
                return true;
            }
            case 97: {
                if (this.field1847) {
                    method1815.method1730(this.field1849, (byte)3);
                }
                else {
                    method1815.method1729(this.field1849, -1589878807);
                }
                return true;
            }
            case 105: {
                if (this.field1847) {
                    class314.qu(method1815, this.field1849, -503930481);
                }
                else {
                    class314.tx(method1815, this.field1849, (short)15503);
                }
                return true;
            }
            case 85: {
                if (this.field1847) {
                    method1815.method1780(-1555798008);
                }
                else {
                    method1815.method1770(2108011378);
                }
                return true;
            }
            case 84: {
                if (method1815.method1752((byte)(-32)) == 0) {
                    method1815.method1720(10, -2049133432);
                }
                else if (this.field1849 && method1815.dn(-1112326185)) {
                    method1815.method1720(10, 757670291);
                }
                else {
                    final class312 method1816 = this.field1850.method1818(155611176);
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    ScriptEvent.sd(scriptEvent, this.field1850, (byte)56);
                    scriptEvent.setArgs(method1816.field2825, 1802857050);
                    GrandExchangeOfferAgeComparator.getScriptEvents((byte)127).addFirst(scriptEvent);
                    this.method1138((byte)(-23));
                }
                return true;
            }
            case 99: {
                if (this.field1847) {
                    method1815.method1778((byte)89);
                }
                else {
                    class314.fs(method1815, this.field1849, (byte)(-50));
                }
                return true;
            }
            case 98: {
                if (this.field1847) {
                    method1815.method1777(113728735);
                }
                else {
                    class314.pr(method1815, this.field1849, (byte)19);
                }
                return true;
            }
            default: {
                return false;
            }
            case 67: {
                if (this.field1847) {
                    method1815.method1738(class143.method815(186136884), 573980103);
                }
                return true;
            }
            case 66: {
                if (this.field1847) {
                    method1815.method1736(class143.method815(311119832), (byte)92);
                }
                return true;
            }
            case 48: {
                if (this.field1847) {
                    class314.mx(method1815, (byte)(-7));
                }
                return true;
            }
            case 104: {
                if (this.field1847) {
                    class314.jd(method1815, this.field1849, 1903464228);
                }
                else {
                    class314.so(method1815, this.field1849, (byte)1);
                }
                return true;
            }
            case 96: {
                if (this.field1847) {
                    method1815.method1786(this.field1849, 1220918059);
                }
                else {
                    method1815.method1728(this.field1849, 990851367);
                }
                return true;
            }
            case 103: {
                if (this.field1847) {
                    class314.fg(method1815, this.field1849, (byte)(-91));
                }
                else {
                    method1815.method1772(this.field1849, -84102297);
                }
                return true;
            }
            case 102: {
                if (this.field1847) {
                    method1815.method1726(this.field1849, (byte)78);
                }
                else {
                    class314.yv(method1815, this.field1849, -2046273315);
                }
                return true;
            }
            case 13: {
                this.method1138((byte)(-91));
                return true;
            }
            case 101: {
                if (this.field1847) {
                    method1815.method1785(-2138755918);
                }
                else {
                    method1815.method1768((byte)3);
                }
                return true;
            }
        }
    }
    
    @Override
    public boolean ao(final boolean b) {
        return false;
    }
    
    @Override
    public boolean at(final char c) {
        if (this.field1850 == null) {
            return false;
        }
        if (!MouseHandler.method195(c, 600252580)) {
            return false;
        }
        final class314 method1815 = this.field1850.method1815((byte)(-10));
        if (method1815 == null || !method1815.da(-882283089)) {
            return false;
        }
        final class27 method1816 = this.field1850.method1795(2030399398);
        if (null == method1816) {
            return false;
        }
        if (class27.lo(method1816, c, -1946315804) && method1815.method1720(c, 80815528)) {
            class144.invalidateWidget(this.field1850, -1758243338);
        }
        return method1816.method119(c, -669150119);
    }
    
    public void ak() {
        if (this.field1850 == null) {
            return;
        }
        final class312 method1818 = this.field1850.method1818(-1193199176);
        final Widget field1850 = this.field1850;
        this.field1850 = null;
        if (method1818 == null) {
            return;
        }
        method1818.field2823.method1706(false, -140876602);
        if (null != method1818.field2821) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, field1850, (byte)8);
            scriptEvent.setArgs(method1818.field2821, 662379551);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)34).addFirst(scriptEvent);
        }
    }
    
    public void av(final Widget field1850) {
        this.method1138((byte)(-19));
        if (null != field1850) {
            this.field1850 = field1850;
            final class312 method1818 = field1850.method1818(-484773121);
            if (method1818 != null) {
                method1818.field2823.method1706(true, -1557706963);
                if (null != method1818.field2821) {
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    ScriptEvent.sd(scriptEvent, field1850, (byte)16);
                    scriptEvent.setArgs(method1818.field2821, 1783799451);
                    GrandExchangeOfferAgeComparator.getScriptEvents((byte)35).addFirst(scriptEvent);
                }
            }
        }
    }
    
    boolean az(final int n) {
        if (this.field1850 == null) {
            return false;
        }
        final class314 method1815 = this.field1850.method1815((byte)24);
        if (method1815 == null || !method1815.da(432667900)) {
            return false;
        }
        switch (n) {
            case 85: {
                if (this.field1847) {
                    method1815.method1780(-1555798008);
                }
                else {
                    method1815.method1770(1461796529);
                }
                return true;
            }
            case 98: {
                if (this.field1847) {
                    method1815.method1777(113728735);
                }
                else {
                    class314.pr(method1815, this.field1849, (byte)109);
                }
                return true;
            }
            case 66: {
                if (this.field1847) {
                    method1815.method1736(class143.method815(1003912517), (byte)111);
                }
                return true;
            }
            case 97: {
                if (this.field1847) {
                    method1815.method1730(this.field1849, (byte)3);
                }
                else {
                    method1815.method1729(this.field1849, -1916371769);
                }
                return true;
            }
            case 67: {
                if (this.field1847) {
                    method1815.method1738(class143.method815(741667252), 365726470);
                }
                return true;
            }
            case 101: {
                if (this.field1847) {
                    method1815.method1785(-2071150921);
                }
                else {
                    method1815.method1768((byte)92);
                }
                return true;
            }
            case 103: {
                if (this.field1847) {
                    class314.fg(method1815, this.field1849, (byte)(-1));
                }
                else {
                    method1815.method1772(this.field1849, -84102297);
                }
                return true;
            }
            case 65: {
                if (this.field1847) {
                    method1815.method1776(class143.method815(1018881888), (byte)126);
                }
                return true;
            }
            case 96: {
                if (this.field1847) {
                    method1815.method1786(this.field1849, 1584125020);
                }
                else {
                    method1815.method1728(this.field1849, 649240884);
                }
                return true;
            }
            case 48: {
                if (this.field1847) {
                    class314.mx(method1815, (byte)(-89));
                }
                return true;
            }
            case 84: {
                if (method1815.method1752((byte)(-3)) == 0) {
                    method1815.method1720(10, -1958763880);
                }
                else if (this.field1849 && method1815.dn(363926869)) {
                    method1815.method1720(10, 101717280);
                }
                else {
                    final class312 method1816 = this.field1850.method1818(-1242142873);
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    ScriptEvent.sd(scriptEvent, this.field1850, (byte)(-83));
                    scriptEvent.setArgs(method1816.field2825, 2100980669);
                    GrandExchangeOfferAgeComparator.getScriptEvents((byte)79).addFirst(scriptEvent);
                    this.method1138((byte)(-51));
                }
                return true;
            }
            case 99: {
                if (this.field1847) {
                    method1815.method1778((byte)72);
                }
                else {
                    class314.fs(method1815, this.field1849, (byte)(-117));
                }
                return true;
            }
            case 105: {
                if (this.field1847) {
                    class314.qu(method1815, this.field1849, -1986615696);
                }
                else {
                    class314.tx(method1815, this.field1849, (short)12951);
                }
                return true;
            }
            case 102: {
                if (this.field1847) {
                    method1815.method1726(this.field1849, (byte)108);
                }
                else {
                    class314.yv(method1815, this.field1849, -2004916843);
                }
                return true;
            }
            case 13: {
                this.method1138((byte)(-28));
                return true;
            }
            case 104: {
                if (this.field1847) {
                    class314.jd(method1815, this.field1849, -1147375382);
                }
                else {
                    class314.so(method1815, this.field1849, (byte)1);
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public void method1137(final Widget field1850, final int n) {
        try {
            this.method1138((byte)(-107));
            if (null != field1850) {
                if (n >= 1949862207) {
                    throw new IllegalStateException();
                }
                this.field1850 = field1850;
                final class312 method1818 = field1850.method1818(740530626);
                if (method1818 != null) {
                    method1818.field2823.method1706(true, 1299997738);
                    if (null != method1818.field2821) {
                        if (n >= 1949862207) {
                            throw new IllegalStateException();
                        }
                        final ScriptEvent scriptEvent = new ScriptEvent();
                        ScriptEvent.sd(scriptEvent, field1850, (byte)(-19));
                        scriptEvent.setArgs(method1818.field2821, 1735626365);
                        GrandExchangeOfferAgeComparator.getScriptEvents((byte)117).addFirst(scriptEvent);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.ax(" + ')');
        }
    }
    
    static void method1137(final String login_response1, final String login_response2, final String login_response3, final int n) {
        try {
            Login.Login_response1 = login_response1;
            Login.Login_response2 = login_response2;
            Login.Login_response3 = login_response3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.ax(" + ')');
        }
    }
    
    @Override
    public boolean ay(final boolean b) {
        return false;
    }
    
    public static boolean ck(final class205 class205, final int n, final int n2) {
        if (class205 == null) {
            class205.method1143(n, n);
        }
        try {
            if (class205.field1850 != null) {
                final class314 method1815 = class205.field1850.method1815((byte)2);
                if (method1815 != null) {
                    if (n2 >= -86142256) {
                        throw new IllegalStateException();
                    }
                    if (!method1815.da(-397868097)) {
                        if (n2 >= -86142256) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        switch (n) {
                            case 98: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    method1815.method1777(113728735);
                                }
                                else {
                                    class314.pr(method1815, class205.field1849, (byte)52);
                                }
                                return true;
                            }
                            case 97: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    method1815.method1730(class205.field1849, (byte)3);
                                }
                                else {
                                    method1815.method1729(class205.field1849, -1785240009);
                                }
                                return true;
                            }
                            case 85: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    method1815.method1780(-1555798008);
                                }
                                else {
                                    method1815.method1770(1712590947);
                                }
                                return true;
                            }
                            case 84: {
                                if (method1815.method1752((byte)(-111)) == 0) {
                                    method1815.method1720(10, -1340392576);
                                }
                                else {
                                    if (class205.field1849) {
                                        if (n2 >= -86142256) {
                                            throw new IllegalStateException();
                                        }
                                        if (method1815.dn(-1129098287)) {
                                            if (n2 >= -86142256) {
                                                throw new IllegalStateException();
                                            }
                                            method1815.method1720(10, -1161120907);
                                            return true;
                                        }
                                    }
                                    final class312 method1816 = class205.field1850.method1818(-1232998305);
                                    final ScriptEvent scriptEvent = new ScriptEvent();
                                    ScriptEvent.sd(scriptEvent, class205.field1850, (byte)(-89));
                                    scriptEvent.setArgs(method1816.field2825, 1551172190);
                                    GrandExchangeOfferAgeComparator.getScriptEvents((byte)106).addFirst(scriptEvent);
                                    class205.method1138((byte)74);
                                }
                                return true;
                            }
                            case 99: {
                                if (class205.field1847) {
                                    method1815.method1778((byte)113);
                                }
                                else {
                                    class314.fs(method1815, class205.field1849, (byte)(-45));
                                }
                                return true;
                            }
                            case 67: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    method1815.method1738(class143.method815(-1195814456), -1794913499);
                                }
                                return true;
                            }
                            case 65: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    method1815.method1776(class143.method815(1000953659), (byte)107);
                                }
                                return true;
                            }
                            case 66: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    method1815.method1736(class143.method815(-165152021), (byte)36);
                                }
                                return true;
                            }
                            case 48: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    class314.mx(method1815, (byte)(-26));
                                }
                                return true;
                            }
                            case 13: {
                                class205.method1138((byte)65);
                                return true;
                            }
                            case 105: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    class314.qu(method1815, class205.field1849, 1731882601);
                                }
                                else {
                                    class314.tx(method1815, class205.field1849, (short)12979);
                                }
                                return true;
                            }
                            case 102: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    method1815.method1726(class205.field1849, (byte)78);
                                }
                                else {
                                    class314.yv(method1815, class205.field1849, -994542859);
                                }
                                return true;
                            }
                            case 103: {
                                if (class205.field1847) {
                                    class314.fg(method1815, class205.field1849, (byte)(-19));
                                }
                                else {
                                    method1815.method1772(class205.field1849, -84102297);
                                }
                                return true;
                            }
                            case 101: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    method1815.method1785(-2132510379);
                                }
                                else {
                                    method1815.method1768((byte)(-11));
                                }
                                return true;
                            }
                            case 96: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    method1815.method1786(class205.field1849, 355798212);
                                }
                                else {
                                    method1815.method1728(class205.field1849, 728659002);
                                }
                                return true;
                            }
                            case 104: {
                                if (class205.field1847) {
                                    if (n2 >= -86142256) {
                                        throw new IllegalStateException();
                                    }
                                    class314.jd(method1815, class205.field1849, -1605724073);
                                }
                                else {
                                    class314.so(method1815, class205.field1849, (byte)1);
                                }
                                return true;
                            }
                            default: {
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            if (n2 >= -86142256) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.ah(" + ')');
        }
    }
    
    public static void fs(final class205 class205, final Widget field1850) {
        if (class205 == null) {
            class205.ar(field1850);
            return;
        }
        class205.method1138((byte)(-61));
        if (null != field1850) {
            class205.field1850 = field1850;
            final class312 method1818 = field1850.method1818(-1780383464);
            if (method1818 != null) {
                method1818.field2823.method1706(true, 1761332435);
                if (null != method1818.field2821) {
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    ScriptEvent.sd(scriptEvent, field1850, (byte)3);
                    scriptEvent.setArgs(method1818.field2821, -139180658);
                    GrandExchangeOfferAgeComparator.getScriptEvents((byte)65).addFirst(scriptEvent);
                }
            }
        }
    }
    
    static ClientPreferences vmethod3951(final int n) {
        try {
            AccessFile preferencesFile = null;
            ClientPreferences clientPreferences = new ClientPreferences();
            try {
                preferencesFile = Rasterizer3D.getPreferencesFile("", Client.field358.name, false, (byte)(-55));
                final byte[] array = new byte[(int)preferencesFile.length(2028457379)];
                int i = 0;
                while (i < array.length) {
                    if (n >= 579862860) {
                        throw new IllegalStateException();
                    }
                    final int read = preferencesFile.read(array, i, array.length - i, 1760372856);
                    if (-1 == read) {
                        if (n >= 579862860) {
                            throw new IllegalStateException();
                        }
                        throw new IOException();
                    }
                    else {
                        i += read;
                    }
                }
                clientPreferences = new ClientPreferences(new Buffer(array));
            }
            catch (Exception ex2) {}
            try {
                if (null != preferencesFile) {
                    preferencesFile.close((byte)(-6));
                }
            }
            catch (Exception ex3) {}
            return clientPreferences;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.aw(" + ')');
        }
    }
    
    @Override
    public boolean vmethod3951(final char c, final int n) {
        try {
            if (this.field1850 == null) {
                return false;
            }
            if (!MouseHandler.method195(c, 1055459825)) {
                if (n >= -592927922) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                final class314 method1815 = this.field1850.method1815((byte)(-91));
                if (method1815 == null || !method1815.da(-1283003797)) {
                    return false;
                }
                final class27 method1816 = this.field1850.method1795(2033242637);
                if (null != method1816) {
                    if (class27.lo(method1816, c, 1152812714) && method1815.method1720(c, -337201766)) {
                        if (n >= -592927922) {
                            throw new IllegalStateException();
                        }
                        class144.invalidateWidget(this.field1850, -922196112);
                    }
                    return method1816.method119(c, -528043848);
                }
                if (n >= -592927922) {
                    throw new IllegalStateException();
                }
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.aw(" + ')');
        }
    }
    
    @Override
    public boolean al(final char c) {
        if (this.field1850 == null) {
            return false;
        }
        if (!MouseHandler.method195(c, -817865416)) {
            return false;
        }
        final class314 method1815 = this.field1850.method1815((byte)(-39));
        if (method1815 == null || !method1815.da(1505649030)) {
            return false;
        }
        final class27 method1816 = this.field1850.method1795(1901892678);
        if (null == method1816) {
            return false;
        }
        if (class27.lo(method1816, c, 1190798569) && method1815.method1720(c, -1690140821)) {
            class144.invalidateWidget(this.field1850, -1897831596);
        }
        return method1816.method119(c, 635021372);
    }
    
    @Override
    public boolean vmethod3989(final int n, final int n2) {
        try {
            switch (n) {
                case 81: {
                    return this.field1849 = false;
                }
                case 82: {
                    return this.field1847 = false;
                }
                default: {
                    return false;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.an(" + ')');
        }
    }
    
    @Override
    public boolean vmethod3953(final boolean b, final byte b2) {
        try {
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.ac(" + ')');
        }
    }
    
    @Override
    public boolean au(final int n) {
        if (null == this.field1850) {
            return false;
        }
        final class27 method1795 = this.field1850.method1795(1808605820);
        if (method1795 == null) {
            return false;
        }
        if (method1795.method118(n, 1380991347)) {
            switch (n) {
                case 82: {
                    this.field1847 = true;
                    break;
                }
                default: {
                    if (ck(this, n, -2063473132)) {
                        class144.invalidateWidget(this.field1850, -790687592);
                        break;
                    }
                    break;
                }
                case 81: {
                    this.field1849 = true;
                    break;
                }
            }
        }
        return method1795.method120(n, -1749930084);
    }
    
    @Override
    public boolean aa(final boolean b) {
        return false;
    }
    
    public Widget method1144(final short n) {
        try {
            return this.field1850;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.ai(" + ')');
        }
    }
    
    public void ar(final Widget field1850) {
        this.method1138((byte)(-19));
        if (null != field1850) {
            this.field1850 = field1850;
            final class312 method1818 = field1850.method1818(-484773121);
            if (method1818 != null) {
                method1818.field2823.method1706(true, -1557706963);
                if (null != method1818.field2826) {
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    ScriptEvent.sd(scriptEvent, field1850, (byte)16);
                    scriptEvent.setArgs(method1818.field2821, 1783799451);
                    GrandExchangeOfferAgeComparator.getScriptEvents((byte)35).rd(scriptEvent);
                }
            }
        }
    }
    
    @Override
    public boolean vmethod3949(final int n, final int n2) {
        try {
            if (null == this.field1850) {
                if (n2 == -1360542304) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                final class27 method1795 = this.field1850.method1795(1929367879);
                if (method1795 != null) {
                    if (method1795.method118(n, 1380991347)) {
                        if (n2 == -1360542304) {
                            throw new IllegalStateException();
                        }
                        switch (n) {
                            case 82: {
                                this.field1847 = true;
                                break;
                            }
                            case 81: {
                                this.field1849 = true;
                                break;
                            }
                            default: {
                                if (!ck(this, n, -1039701598)) {
                                    break;
                                }
                                if (n2 == -1360542304) {
                                    throw new IllegalStateException();
                                }
                                class144.invalidateWidget(this.field1850, -1936459619);
                                break;
                            }
                        }
                    }
                    return method1795.method120(n, -1749930084);
                }
                if (n2 == -1360542304) {
                    throw new IllegalStateException();
                }
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.af(" + ')');
        }
    }
    
    @Override
    public boolean ab(final int n) {
        if (null == this.field1850) {
            return false;
        }
        final class27 method1795 = this.field1850.method1795(1856812620);
        if (method1795 == null) {
            return false;
        }
        if (method1795.method118(n, 1380991347)) {
            switch (n) {
                case 81: {
                    this.field1849 = true;
                    break;
                }
                default: {
                    if (ck(this, n, -2090935719)) {
                        class144.invalidateWidget(this.field1850, -1925410635);
                        break;
                    }
                    break;
                }
                case 82: {
                    this.field1847 = true;
                    break;
                }
            }
        }
        return method1795.method120(n, -1749930084);
    }
    
    @Override
    public boolean aq(final int n) {
        switch (n) {
            case 82: {
                return this.field1847 = false;
            }
            case 81: {
                return this.field1849 = false;
            }
            default: {
                return false;
            }
        }
    }
    
    public void aj() {
        if (this.field1850 == null) {
            return;
        }
        final class312 method1818 = this.field1850.method1818(-1394668126);
        final Widget field1850 = this.field1850;
        this.field1850 = null;
        if (method1818 == null) {
            return;
        }
        method1818.field2823.method1706(false, 59547848);
        if (null != method1818.field2821) {
            final ScriptEvent scriptEvent = new ScriptEvent();
            ScriptEvent.sd(scriptEvent, field1850, (byte)28);
            scriptEvent.setArgs(method1818.field2821, -185796348);
            GrandExchangeOfferAgeComparator.getScriptEvents((byte)106).addFirst(scriptEvent);
        }
    }
    
    public void method1138(final byte b) {
        try {
            if (this.field1850 == null) {
                if (b == 2) {
                    return;
                }
            }
            else {
                final class312 method1818 = this.field1850.method1818(-645268928);
                final Widget field1850 = this.field1850;
                this.field1850 = null;
                if (method1818 != null) {
                    method1818.field2823.method1706(false, -825756514);
                    if (null != method1818.field2821) {
                        if (b == 2) {
                            throw new IllegalStateException();
                        }
                        final ScriptEvent scriptEvent = new ScriptEvent();
                        ScriptEvent.sd(scriptEvent, field1850, (byte)46);
                        scriptEvent.setArgs(method1818.field2821, 1592193051);
                        GrandExchangeOfferAgeComparator.getScriptEvents((byte)17).addFirst(scriptEvent);
                    }
                    return;
                }
                if (b == 2) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.ag(" + ')');
        }
    }
    
    boolean method1143(final int n, final int n2) {
        try {
            switch (n) {
                case 81: {
                    return this.field1849 = false;
                }
                case 82: {
                    return this.field1849 = false;
                }
                default: {
                    return false;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "he.an(" + ')');
        }
    }
    
    public static boolean lg(final class205 class205, final int n) {
        if (class205.field1850 == null) {
            return false;
        }
        final class314 method1815 = class205.field1850.method1815((byte)(-2));
        if (method1815 == null || method1815.da(1795526465)) {
            return false;
        }
        switch (n) {
            case 48: {
                if (class205.field1847) {
                    class314.mx(method1815, (byte)(-113));
                }
                return true;
            }
            case 85: {
                if (class205.field1847) {
                    method1815.method1780(-1555798008);
                }
                else {
                    method1815.method1770(1463568023);
                }
                return true;
            }
            case 13: {
                class205.method1138((byte)(-26));
                return true;
            }
            case 97: {
                if (class205.field1847) {
                    method1815.method1730(class205.field1849, (byte)3);
                }
                else {
                    method1815.method1729(class205.field1849, -1718259110);
                }
                return true;
            }
            case 105: {
                if (class205.field1847) {
                    class314.qu(method1815, class205.field1849, 943051023);
                }
                else {
                    class314.tx(method1815, class205.field1849, (short)180);
                }
                return true;
            }
            case 67: {
                if (class205.field1847) {
                    method1815.method1738(class143.method815(-770746183), -289338540);
                }
                return true;
            }
            case 103: {
                if (class205.field1847) {
                    class314.fg(method1815, class205.field1849, (byte)(-39));
                }
                else {
                    method1815.method1772(class205.field1849, -84102297);
                }
                return true;
            }
            case 99: {
                if (class205.field1847) {
                    method1815.method1778((byte)127);
                }
                else {
                    class314.fs(method1815, class205.field1849, (byte)(-94));
                }
                return true;
            }
            case 65: {
                if (class205.field1847) {
                    method1815.method1776(class143.method815(1531021752), (byte)113);
                }
                return true;
            }
            case 104: {
                if (class205.field1847) {
                    class314.jd(method1815, class205.field1849, 2055230493);
                }
                else {
                    class314.so(method1815, class205.field1849, (byte)1);
                }
                return true;
            }
            case 66: {
                if (class205.field1847) {
                    method1815.method1736(class143.method815(-785282241), (byte)43);
                }
                return true;
            }
            case 84: {
                if (method1815.method1752((byte)(-91)) == 0) {
                    method1815.method1720(10, -1641878840);
                }
                else if (class205.field1849 && method1815.dn(-109583009)) {
                    method1815.method1720(10, 1167618204);
                }
                else {
                    final class312 method1816 = class205.field1850.method1818(-2020534563);
                    final ScriptEvent scriptEvent = new ScriptEvent();
                    ScriptEvent.sd(scriptEvent, class205.field1850, (byte)50);
                    scriptEvent.setArgs(method1816.field2825, 562890763);
                    GrandExchangeOfferAgeComparator.getScriptEvents((byte)119).addFirst(scriptEvent);
                    class205.method1138((byte)1);
                }
                return true;
            }
            case 96: {
                if (class205.field1847) {
                    method1815.method1786(class205.field1849, 1074604055);
                }
                else {
                    method1815.method1728(class205.field1849, 1860833829);
                }
                return true;
            }
            case 102: {
                if (class205.field1847) {
                    method1815.method1726(class205.field1849, (byte)95);
                }
                else {
                    class314.yv(method1815, class205.field1849, -2016927217);
                }
                return true;
            }
            default: {
                return false;
            }
            case 101: {
                if (class205.field1847) {
                    method1815.method1785(-2143640386);
                }
                else {
                    method1815.method1768((byte)(-50));
                }
                return true;
            }
            case 98: {
                if (class205.field1847) {
                    method1815.method1777(113728735);
                }
                else {
                    class314.pr(method1815, class205.field1849, (byte)79);
                }
                return true;
            }
        }
    }
}
