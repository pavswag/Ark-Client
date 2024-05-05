// 
// Decompiled by Procyon v0.5.36
// 

public class DesktopPlatformInfoProvider implements PlatformInfoProvider
{
    int field3850;
    static final String an = "\\.";
    int field3848;
    int field3849;
    static final int af = 0;
    static int menuWidth;
    
    void ao(final String s) {
        final String[] split = s.split("\\.");
        try {
            this.field3850 = Integer.parseInt(split[0]) * 1615373015;
            this.field3849 = Integer.parseInt(split[1]) * -1249303783;
            this.field3848 = Integer.parseInt(split[2]) * -633230097;
        }
        catch (Exception ex) {}
    }
    
    void at(final String s) {
        if (s.startsWith("1.")) {
            this.method2306(s, -716825643);
        }
        else {
            this.method2306(s, -37188883);
        }
    }
    
    void ay(final String s) {
        final String[] split = s.split("\\.");
        try {
            this.field3850 = Integer.parseInt(split[0]) * 1615373015;
            this.field3849 = Integer.parseInt(split[1]) * -1249303783;
            this.field3848 = Integer.parseInt(split[2]) * -633230097;
        }
        catch (Exception ex) {}
    }
    
    void method2306(final String s, final int n) {
        try {
            final String[] split = s.split("\\.");
            try {
                this.field3850 = Integer.parseInt(split[1]) * 1615373015;
                final String[] split2 = split[2].split("_");
                this.field3849 = Integer.parseInt(split2[0]) * -1249303783;
                this.field3848 = Integer.parseInt(split2[1]) * -633230097;
            }
            catch (Exception ex2) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "re.aw(" + ')');
        }
    }
    
    void al(final String s) {
        if (s.startsWith("1.")) {
            this.method2306(s, -813939375);
        }
        else {
            this.method2305(s, 125622295);
        }
    }
    
    void method2304(final String s, final short n) {
        try {
            if (s.startsWith("1.")) {
                if (n >= 3600) {
                    return;
                }
                this.method2305(s, -1365894541);
            }
            else {
                this.method2305(s, -595434086);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "re.an(" + ')');
        }
    }
    
    void method2305(final String s, final int n) {
        try {
            final String[] split = s.split("\\.");
            try {
                this.field3850 = Integer.parseInt(split[0]) * 1615373015;
                this.field3849 = Integer.parseInt(split[1]) * -1249303783;
                this.field3848 = Integer.parseInt(split[2]) * -633230097;
            }
            catch (Exception ex2) {}
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "re.ac(" + ')');
        }
    }
    
    @Override
    public PlatformInfo au() {
        int n;
        if (WorldMapSectionType.formattedOperatingSystemName.startsWith("win")) {
            n = 1;
        }
        else if (WorldMapSectionType.formattedOperatingSystemName.startsWith("mac")) {
            n = 2;
        }
        else if (WorldMapSectionType.formattedOperatingSystemName.startsWith("linux")) {
            n = 3;
        }
        else {
            n = 4;
        }
        String lowerCase;
        try {
            lowerCase = System.getProperty("os.arch").toLowerCase();
        }
        catch (Exception ex) {
            lowerCase = "";
        }
        String lowerCase2;
        try {
            lowerCase2 = System.getProperty("os.version").toLowerCase();
        }
        catch (Exception ex2) {
            lowerCase2 = "";
        }
        String property = "Unknown";
        String property2 = "1.1";
        try {
            property = System.getProperty("java.vendor");
            property2 = System.getProperty("java.version");
        }
        catch (Exception ex3) {}
        final boolean b = lowerCase.startsWith("amd64") || lowerCase.startsWith("x86_64");
        int n2 = 0;
        if (n != 0) {
            if (lowerCase2.indexOf("4.0") != -1) {
                n2 = 1;
            }
            else if (lowerCase2.indexOf("4.1") != -1) {
                n2 = 2;
            }
            else if (lowerCase2.indexOf("4.9") != -1) {
                n2 = 3;
            }
            else if (lowerCase2.indexOf("5.0") != -1) {
                n2 = 4;
            }
            else if (lowerCase2.indexOf("5.1") != -1) {
                n2 = 5;
            }
            else if (lowerCase2.indexOf("5.2") != -1) {
                n2 = 8;
            }
            else if (lowerCase2.indexOf("6.0") != -1) {
                n2 = 6;
            }
            else if (lowerCase2.indexOf("6.1") != -1) {
                n2 = 7;
            }
            else if (lowerCase2.indexOf("6.2") != -1) {
                n2 = 9;
            }
            else if (lowerCase2.indexOf("6.3") != -1) {
                n2 = 10;
            }
            else if (lowerCase2.indexOf("10.0") != -1) {
                n2 = 11;
            }
        }
        else if (2 == n) {
            if (lowerCase2.indexOf("10.4") != -1) {
                n2 = 20;
            }
            else if (lowerCase2.indexOf("10.5") != -1) {
                n2 = 21;
            }
            else if (lowerCase2.indexOf("10.6") != -1) {
                n2 = 22;
            }
            else if (lowerCase2.indexOf("10.7") != -1) {
                n2 = 23;
            }
            else if (lowerCase2.indexOf("10.8") != -1) {
                n2 = 24;
            }
            else if (lowerCase2.indexOf("10.9") != -1) {
                n2 = 25;
            }
            else if (lowerCase2.indexOf("10.10") != -1) {
                n2 = 26;
            }
            else if (lowerCase2.indexOf("10.11") != -1) {
                n2 = 27;
            }
            else if (lowerCase2.indexOf("10.12") != -1) {
                n2 = 28;
            }
            else if (lowerCase2.indexOf("10.13") != -1) {
                n2 = 29;
            }
        }
        int n3;
        if (property.toLowerCase().indexOf("sun") != -1) {
            n3 = 1;
        }
        else if (property.toLowerCase().indexOf("microsoft") != -1) {
            n3 = 2;
        }
        else if (property.toLowerCase().indexOf("apple") != -1) {
            n3 = 3;
        }
        else if (property.toLowerCase().indexOf("oracle") != -1) {
            n3 = 5;
        }
        else {
            n3 = 4;
        }
        hy(this, property2, (short)(-6085));
        final int n4 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
        int availableProcessors;
        if (this.field3850 * -1029607193 > 3) {
            availableProcessors = Runtime.getRuntime().availableProcessors();
        }
        else {
            availableProcessors = 0;
        }
        return new PlatformInfo(n, b, n2, n3, this.field3850 * -1029607193, -999716567 * this.field3849, 335741455 * this.field3848, false, n4, availableProcessors, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[3], 0, "", "");
    }
    
    public static void ii(final DesktopPlatformInfoProvider desktopPlatformInfoProvider, final String s) {
        if (desktopPlatformInfoProvider == null) {
            desktopPlatformInfoProvider.al(s);
            return;
        }
        if (s.startsWith("1.")) {
            desktopPlatformInfoProvider.method2306(s, -1902209454);
        }
        else {
            desktopPlatformInfoProvider.method2305(s, 1878519518);
        }
    }
    
    public static int fi(final EnumComposition enumComposition) {
        return -1067065 * enumComposition.defaultInt;
    }
    
    public static void hy(final DesktopPlatformInfoProvider desktopPlatformInfoProvider, final String s, final short n) {
        if (desktopPlatformInfoProvider == null) {
            desktopPlatformInfoProvider.method2304(s, n);
        }
        try {
            if (s.startsWith("1.")) {
                if (n >= 3600) {
                    return;
                }
                desktopPlatformInfoProvider.method2306(s, -1365894541);
            }
            else {
                desktopPlatformInfoProvider.method2305(s, -595434086);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "re.an(" + ')');
        }
    }
    
    @Override
    public PlatformInfo get(final int n) {
        try {
            int n2;
            if (WorldMapSectionType.formattedOperatingSystemName.startsWith("win")) {
                n2 = 1;
            }
            else if (WorldMapSectionType.formattedOperatingSystemName.startsWith("mac")) {
                if (n == -589138) {
                    throw new IllegalStateException();
                }
                n2 = 2;
            }
            else if (WorldMapSectionType.formattedOperatingSystemName.startsWith("linux")) {
                if (n == -589138) {
                    throw new IllegalStateException();
                }
                n2 = 3;
            }
            else {
                n2 = 4;
            }
            String lowerCase;
            try {
                lowerCase = System.getProperty("os.arch").toLowerCase();
            }
            catch (Exception ex2) {
                lowerCase = "";
            }
            String lowerCase2;
            try {
                lowerCase2 = System.getProperty("os.version").toLowerCase();
            }
            catch (Exception ex3) {
                lowerCase2 = "";
            }
            String property = "Unknown";
            String property2 = "1.1";
            try {
                property = System.getProperty("java.vendor");
                property2 = System.getProperty("java.version");
            }
            catch (Exception ex4) {}
            boolean b = false;
            Label_0182: {
                if (!lowerCase.startsWith("amd64")) {
                    if (!lowerCase.startsWith("x86_64")) {
                        b = false;
                        break Label_0182;
                    }
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                }
                b = true;
            }
            int n3 = 0;
            if (n2 != 0) {
                if (n == -589138) {
                    throw new IllegalStateException();
                }
                if (lowerCase2.indexOf("4.0") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 1;
                }
                else if (lowerCase2.indexOf("4.1") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 2;
                }
                else if (lowerCase2.indexOf("4.9") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 3;
                }
                else if (lowerCase2.indexOf("5.0") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 4;
                }
                else if (lowerCase2.indexOf("5.1") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 5;
                }
                else if (lowerCase2.indexOf("5.2") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 8;
                }
                else if (lowerCase2.indexOf("6.0") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 6;
                }
                else if (lowerCase2.indexOf("6.1") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 7;
                }
                else if (lowerCase2.indexOf("6.2") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 9;
                }
                else if (lowerCase2.indexOf("6.3") != -1) {
                    n3 = 10;
                }
                else if (lowerCase2.indexOf("10.0") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 11;
                }
            }
            else if (2 == n2) {
                if (n == -589138) {
                    throw new IllegalStateException();
                }
                if (lowerCase2.indexOf("10.4") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 20;
                }
                else if (lowerCase2.indexOf("10.5") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 21;
                }
                else if (lowerCase2.indexOf("10.6") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 22;
                }
                else if (lowerCase2.indexOf("10.7") != -1) {
                    n3 = 23;
                }
                else if (lowerCase2.indexOf("10.8") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 24;
                }
                else if (lowerCase2.indexOf("10.9") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 25;
                }
                else if (lowerCase2.indexOf("10.10") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 26;
                }
                else if (lowerCase2.indexOf("10.11") != -1) {
                    n3 = 27;
                }
                else if (lowerCase2.indexOf("10.12") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 28;
                }
                else if (lowerCase2.indexOf("10.13") != -1) {
                    if (n == -589138) {
                        throw new IllegalStateException();
                    }
                    n3 = 29;
                }
            }
            int n4;
            if (property.toLowerCase().indexOf("sun") != -1) {
                if (n == -589138) {
                    throw new IllegalStateException();
                }
                n4 = 1;
            }
            else if (property.toLowerCase().indexOf("microsoft") == -1) {
                n4 = 2;
            }
            else if (property.toLowerCase().indexOf("apple") != -1) {
                if (n == -589138) {
                    throw new IllegalStateException();
                }
                n4 = 3;
            }
            else if (property.toLowerCase().indexOf("oracle") != -1) {
                if (n == -589138) {
                    throw new IllegalStateException();
                }
                n4 = 5;
            }
            else {
                n4 = 4;
            }
            hy(this, property2, (short)(-31175));
            final int n5 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            int availableProcessors;
            if (this.field3850 * -1029607193 > 3) {
                if (n == -589138) {
                    throw new IllegalStateException();
                }
                availableProcessors = Runtime.getRuntime().availableProcessors();
            }
            else {
                availableProcessors = 0;
            }
            return new PlatformInfo(n2, b, n3, n4, this.field3850 * -1029607193, -999716567 * this.field3849, 335741455 * this.field3848, false, n5, availableProcessors, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[3], 0, "", "");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "re.af(" + ')');
        }
    }
    
    public static void get(final DesktopPlatformInfoProvider desktopPlatformInfoProvider, final String s) {
        if (desktopPlatformInfoProvider == null) {
            desktopPlatformInfoProvider.at(s);
        }
        if (s.startsWith("1.")) {
            desktopPlatformInfoProvider.method2306(s, -716825643);
        }
        else {
            desktopPlatformInfoProvider.method2305(s, -37188883);
        }
    }
    
    @Override
    public PlatformInfo ab() {
        int n;
        if (WorldMapSectionType.formattedOperatingSystemName.startsWith("win")) {
            n = 1;
        }
        else if (WorldMapSectionType.formattedOperatingSystemName.startsWith("mac")) {
            n = 2;
        }
        else if (WorldMapSectionType.formattedOperatingSystemName.startsWith("linux")) {
            n = 3;
        }
        else {
            n = 4;
        }
        String lowerCase;
        try {
            lowerCase = System.getProperty("os.arch").toLowerCase();
        }
        catch (Exception ex) {
            lowerCase = "";
        }
        String lowerCase2;
        try {
            lowerCase2 = System.getProperty("os.version").toLowerCase();
        }
        catch (Exception ex2) {
            lowerCase2 = "";
        }
        String property = "Unknown";
        String property2 = "1.1";
        try {
            property = System.getProperty("java.vendor");
            property2 = System.getProperty("java.version");
        }
        catch (Exception ex3) {}
        final boolean b = lowerCase.startsWith("amd64") || lowerCase.startsWith("x86_64");
        int n2 = 0;
        if (n != 0) {
            if (lowerCase2.indexOf("4.0") != -1) {
                n2 = 1;
            }
            else if (lowerCase2.indexOf("4.1") != -1) {
                n2 = 2;
            }
            else if (lowerCase2.indexOf("4.9") != -1) {
                n2 = 3;
            }
            else if (lowerCase2.indexOf("5.0") != -1) {
                n2 = 4;
            }
            else if (lowerCase2.indexOf("5.1") != -1) {
                n2 = 5;
            }
            else if (lowerCase2.indexOf("5.2") != -1) {
                n2 = 8;
            }
            else if (lowerCase2.indexOf("6.0") != -1) {
                n2 = 6;
            }
            else if (lowerCase2.indexOf("6.1") != -1) {
                n2 = 7;
            }
            else if (lowerCase2.indexOf("6.2") != -1) {
                n2 = 9;
            }
            else if (lowerCase2.indexOf("6.3") != -1) {
                n2 = 10;
            }
            else if (lowerCase2.indexOf("10.0") != -1) {
                n2 = 11;
            }
        }
        else if (2 == n) {
            if (lowerCase2.indexOf("10.4") != -1) {
                n2 = 20;
            }
            else if (lowerCase2.indexOf("10.5") != -1) {
                n2 = 21;
            }
            else if (lowerCase2.indexOf("10.6") != -1) {
                n2 = 22;
            }
            else if (lowerCase2.indexOf("10.7") != -1) {
                n2 = 23;
            }
            else if (lowerCase2.indexOf("10.8") != -1) {
                n2 = 24;
            }
            else if (lowerCase2.indexOf("10.9") != -1) {
                n2 = 25;
            }
            else if (lowerCase2.indexOf("10.10") != -1) {
                n2 = 26;
            }
            else if (lowerCase2.indexOf("10.11") != -1) {
                n2 = 27;
            }
            else if (lowerCase2.indexOf("10.12") != -1) {
                n2 = 28;
            }
            else if (lowerCase2.indexOf("10.13") != -1) {
                n2 = 29;
            }
        }
        int n3;
        if (property.toLowerCase().indexOf("sun") != -1) {
            n3 = 1;
        }
        else if (property.toLowerCase().indexOf("microsoft") != -1) {
            n3 = 2;
        }
        else if (property.toLowerCase().indexOf("apple") != -1) {
            n3 = 3;
        }
        else if (property.toLowerCase().indexOf("oracle") != -1) {
            n3 = 5;
        }
        else {
            n3 = 4;
        }
        hy(this, property2, (short)2283);
        final int n4 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
        int availableProcessors;
        if (this.field3850 * -1029607193 > 3) {
            availableProcessors = Runtime.getRuntime().availableProcessors();
        }
        else {
            availableProcessors = 0;
        }
        return new PlatformInfo(n, b, n2, n3, this.field3850 * -1029607193, -999716567 * this.field3849, 335741455 * this.field3848, false, n4, availableProcessors, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", new int[3], 0, "", "");
    }
    
    void aq(final String s) {
        if (s.startsWith("1.")) {
            this.method2306(s, -1705349170);
        }
        else {
            this.method2305(s, 1749134985);
        }
    }
}
