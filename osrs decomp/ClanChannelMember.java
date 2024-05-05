import net.runelite.api.clan.ClanRank;
import net.runelite.api.Nameable;

// 
// Decompiled by Procyon v0.5.36
// 

public class ClanChannelMember implements net.runelite.api.clan.ClanChannelMember
{
    public byte rank;
    static final int cy = 59;
    public Username username;
    static final int cv = 0;
    public static final int au = 3;
    public int world;
    public static final int bv = 1009;
    
    public String getName() {
        final Username wj = this.wj();
        if (wj == null) {
            return null;
        }
        final String wu = wj.wu();
        if (wu == null) {
            return null;
        }
        return wu.replace(' ', ' ');
    }
    
    ClanChannelMember() {
    }
    
    public byte cd() {
        return this.rank;
    }
    
    public int fm(final Nameable nameable) {
        return this.getName().compareTo(nameable.getName());
    }
    
    public ClanRank getRank() {
        return Client.wy(this.cd());
    }
    
    public int getWorld() {
        return this.world * -2113202541;
    }
    
    public Username wj() {
        return this.username;
    }
    
    public String getPrevName() {
        return null;
    }
    
    public static boolean ef(final World world) {
        return 0x0 != (0x2 & world.properties * 1810954985);
    }
}
