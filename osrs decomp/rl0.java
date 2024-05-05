import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanMember;

// 
// Decompiled by Procyon v0.5.36
// 

public class rl0 implements ClanMember
{
    public final int lj;
    public final ClanSettings od;
    
    public String getName() {
        return this.od.ge()[this.lj];
    }
    
    public rl0(final ClanSettings od, final int lj) {
        this.od = od;
        this.lj = lj;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof rl0)) {
            return false;
        }
        final rl0 rl0 = (rl0)o;
        if (!rl0.ru(this)) {
            return false;
        }
        final String name = this.getName();
        final String name2 = rl0.getName();
        Label_0065: {
            if (name == null) {
                if (name2 == null) {
                    break Label_0065;
                }
            }
            else if (name.equals(name2)) {
                break Label_0065;
            }
            return false;
        }
        final ClanRank rank = this.getRank();
        final ClanRank rank2 = rl0.getRank();
        if (rank == null) {
            if (rank2 == null) {
                return true;
            }
        }
        else if (rank.equals(rank2)) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "ClanMemberImpl(getName=" + this.getName() + ", getRank=" + this.getRank() + ")";
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final String name = this.getName();
        final int n2 = n * 59 + ((name == null) ? 43 : name.hashCode());
        final ClanRank rank = this.getRank();
        return n2 * 59 + ((rank == null) ? 43 : rank.hashCode());
    }
    
    public boolean ru(final Object o) {
        return o instanceof rl0;
    }
    
    public ClanRank getRank() {
        return Client.wy(this.od.ra()[this.lj]);
    }
    
    public static boolean ql(final NPC npc, final int n) {
        if (npc == null) {
            npc.isVisible(n);
        }
        return n < 0 || n > 4 || (-189357307 * npc.field1045 & 1 << n) != 0x0;
    }
}
