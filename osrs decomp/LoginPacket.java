// 
// Decompiled by Procyon v0.5.36
// 

public class LoginPacket implements class285
{
    public static final LoginPacket field2700;
    static final LoginPacket field2701;
    static final int at = 256;
    public static final LoginPacket RECONNECT_LOGIN_CONNECTION;
    public static final LoginPacket NEW_LOGIN_CONNECTION;
    static final LoginPacket field2704;
    public static final LoginPacket field2705;
    static final LoginPacket[] field2706;
    public final int id;
    public static final int aa = 12;
    
    LoginPacket(final int n, final int n2) {
        this.id = n * 1990948421;
    }
    
    static {
        field2705 = new LoginPacket(14, 0);
        field2701 = new LoginPacket(15, 4);
        NEW_LOGIN_CONNECTION = new LoginPacket(16, -2);
        RECONNECT_LOGIN_CONNECTION = new LoginPacket(18, -2);
        field2700 = new LoginPacket(19, -2);
        field2704 = new LoginPacket(27, 0);
        field2706 = new LoginPacket[32];
        final LoginPacket[] method142 = class33.method142((byte)0);
        for (int i = 0; i < method142.length; ++i) {
            LoginPacket.field2706[method142[i].id * 537668749] = method142[i];
        }
    }
    
    static LoginPacket[] aw() {
        return new LoginPacket[] { LoginPacket.RECONNECT_LOGIN_CONNECTION, LoginPacket.field2704, LoginPacket.field2701, LoginPacket.NEW_LOGIN_CONNECTION, LoginPacket.field2705, LoginPacket.field2700 };
    }
    
    static LoginPacket[] an() {
        return new LoginPacket[] { LoginPacket.RECONNECT_LOGIN_CONNECTION, LoginPacket.field2704, LoginPacket.field2701, LoginPacket.NEW_LOGIN_CONNECTION, LoginPacket.field2705, LoginPacket.field2700 };
    }
    
    static LoginPacket[] ac() {
        return new LoginPacket[] { LoginPacket.RECONNECT_LOGIN_CONNECTION, LoginPacket.field2704, LoginPacket.field2701, LoginPacket.NEW_LOGIN_CONNECTION, LoginPacket.field2705, LoginPacket.field2700 };
    }
    
    public static int iLog(int n, final int n2) {
        try {
            int n3 = 0;
            Label_0078: {
                if (n >= 0) {
                    if (n2 >= -135563578) {
                        throw new IllegalStateException();
                    }
                    if (n < 65536) {
                        break Label_0078;
                    }
                    if (n2 >= -135563578) {
                        throw new IllegalStateException();
                    }
                }
                n >>>= 16;
                n3 += 16;
            }
            if (n >= 256) {
                if (n2 >= -135563578) {
                    throw new IllegalStateException();
                }
                n >>>= 8;
                n3 += 8;
            }
            if (n >= 16) {
                if (n2 >= -135563578) {
                    throw new IllegalStateException();
                }
                n >>>= 4;
                n3 += 4;
            }
            if (n >= 4) {
                if (n2 >= -135563578) {
                    throw new IllegalStateException();
                }
                n >>>= 2;
                n3 += 2;
            }
            if (n >= 1) {
                if (n2 >= -135563578) {
                    throw new IllegalStateException();
                }
                n >>>= 1;
                ++n3;
            }
            return n + n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lf.aq(" + ')');
        }
    }
}
