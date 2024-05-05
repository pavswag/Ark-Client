// 
// Decompiled by Procyon v0.5.36
// 

public class class349
{
    public static final int an = 0;
    public static final int bc = 65;
    public static final int aw = 1;
    public static final int ac = 2;
    static final byte aq = 1;
    public static final int af = 8;
    
    class349() throws Throwable {
        throw new Error();
    }
    
    static final void method1918(final int n) {
        try {
            if (1705142349 * Client.logoutTimer <= 0) {
                Timer.fw(Client.timer, -1996100766);
                class138.updateGameState(40, 859246159);
                class333.field3090 = Client.packetWriter.getSocket((byte)64);
                PacketWriter.ty(Client.packetWriter, -274968704);
                return;
            }
            if (n != 709882847) {
                throw new IllegalStateException();
            }
            class31.logOut(-1902768187);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ng.ht(" + ')');
        }
    }
    
    public static boolean gs(final World world) {
        return 0x0 != (0x2 & world.properties * 1810954985);
    }
    
    public static void xg(final FriendSystem friendSystem, final Buffer buffer, final int n) {
        friendSystem.friendsList.read(buffer, n, (byte)(-81));
        friendSystem.field672 = 815054262;
        for (int i = 0; i < Players.Players_count * -2010934433; ++i) {
            Client.players[Players.Players_indices[i]].updateIsInClanChat((byte)2);
        }
        GameEngine.setMaxCanvasSize(-1352742525);
        if (null != UserComparator5.friendsChat) {
            UserComparator5.friendsChat.clearFriends(-1817221442);
        }
    }
}
