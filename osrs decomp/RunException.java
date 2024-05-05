import java.io.DataInputStream;
import java.net.URL;

// 
// Decompiled by Procyon v0.5.36
// 

public class RunException extends RuntimeException
{
    public static int RunException_revision;
    Throwable field4177;
    public static int field4178;
    String field4179;
    public static String field4180;
    
    RunException(final Throwable field4177, final String field4178) {
        this.field4179 = field4178;
        this.field4177 = field4177;
    }
    
    @Override
    public Throwable getCause() {
        return this.mf();
    }
    
    public static boolean nr(final ClanMate clanMate) {
        if (clanMate == null) {
            clanMate.bi();
        }
        if (clanMate.friend == TriBool.TriBool_unknown) {
            clanMate.fillIsFriend(861386939);
        }
        return clanMate.friend == TriBool.TriBool_true;
    }
    
    public Throwable mf() {
        return this.field4177;
    }
    
    public static RunException al(final Throwable t, final String str) {
        RunException ex;
        if (t instanceof RunException) {
            ex = (RunException)t;
            final StringBuilder sb = new StringBuilder();
            final RunException ex2 = ex;
            ex2.field4179 = sb.append(ex2.field4179).append(' ').append(str).toString();
        }
        else {
            ex = new RunException(t, str);
        }
        return ex;
    }
    
    public static void ac(final String str, final Throwable t) {
        try {
            String str2 = "";
            if (t != null) {
                str2 = MoveSpeed.method1179(t, -1633313603);
            }
            if (str != null) {
                if (t != null) {
                    str2 += " | ";
                }
                str2 += str;
            }
            System.out.println("Error: " + str2);
            final String replace = str2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if (class100.RunException_applet == null) {
                return;
            }
            final DataInputStream dataInputStream = new DataInputStream(new URL(class100.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + 2027530319 * RunException.RunException_revision + "&cs=" + class441.field3835 * 1574980473 + "&u=" + RunException.field4180 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field4178 * -891448341 + "&e=" + replace).openStream());
            dataInputStream.read();
            dataInputStream.close();
        }
        catch (Exception ex) {}
    }
    
    public static void au(final String str, final Throwable t) {
        try {
            String str2 = "";
            if (t != null) {
                str2 = MoveSpeed.method1179(t, -1633313603);
            }
            if (str != null) {
                if (t != null) {
                    str2 += " | ";
                }
                str2 += str;
            }
            System.out.println("Error: " + str2);
            final String replace = str2.replace(':', '.').replace((char)327654231, (char)1666465384).replace((char)(-1073112517), '_').replace((char)1159167227, '_');
            if (class100.RunException_applet == null) {
                return;
            }
            final DataInputStream dataInputStream = new DataInputStream(new URL(class100.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + -504557583 * RunException.RunException_revision + "&cs=" + class441.field3835 * 1574980473 + "&u=" + RunException.field4180 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field4178 * -891448341 + "&e=" + replace).openStream());
            dataInputStream.read();
            dataInputStream.close();
        }
        catch (Exception ex) {}
    }
    
    public static void ab(final String str, final Throwable t) {
        try {
            String str2 = "";
            if (t != null) {
                str2 = MoveSpeed.method1179(t, -1633313603);
            }
            if (str != null) {
                if (t != null) {
                    str2 += " | ";
                }
                str2 += str;
            }
            System.out.println("Error: " + str2);
            final String replace = str2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if (class100.RunException_applet == null) {
                return;
            }
            final DataInputStream dataInputStream = new DataInputStream(new URL(class100.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + 2027530319 * RunException.RunException_revision + "&cs=" + class441.field3835 * 1574980473 + "&u=" + RunException.field4180 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field4178 * -891448341 + "&e=" + replace).openStream());
            dataInputStream.read();
            dataInputStream.close();
        }
        catch (Exception ex) {}
    }
    
    public static RunException aq(final Throwable t, final String str) {
        RunException ex;
        if (t instanceof RunException) {
            ex = (RunException)t;
            final StringBuilder sb = new StringBuilder();
            final RunException ex2 = ex;
            ex2.field4179 = sb.append(ex2.field4179).append(' ').append(str).toString();
        }
        else {
            ex = new RunException(t, str);
        }
        return ex;
    }
}
