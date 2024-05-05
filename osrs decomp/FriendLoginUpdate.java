import net.runelite.api.PendingLogin;

// 
// Decompiled by Procyon v0.5.36
// 

public class FriendLoginUpdate extends Link implements PendingLogin
{
    public Username friendUsername;
    public static final int bm = 65536;
    public short worldId;
    public int field3722;
    
    public String getName() {
        return this.yb().wu();
    }
    
    FriendLoginUpdate(final Username friendUsername, final int n) {
        this.field3722 = (int)(class96.clockNow(1343864554) / 1000L) * -1536274075;
        this.friendUsername = friendUsername;
        this.worldId = (short)n;
        this.vz(friendUsername, n);
    }
    
    public Username yb() {
        return this.friendUsername;
    }
    
    public short getWorld() {
        return this.worldId;
    }
    
    public void vz(final Username username, final int n) {
        this.field3722 = (this.field3722 * 761297005 + 5) * -1536274075;
    }
}
