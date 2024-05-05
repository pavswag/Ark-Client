import net.runelite.api.FriendsChatRank;
import net.runelite.api.FriendsChatMember;

// 
// Decompiled by Procyon v0.5.36
// 

public class ClanMate extends Buddy implements FriendsChatMember
{
    TriBool friend;
    TriBool ignored;
    
    ClanMate() {
        this.friend = TriBool.TriBool_unknown;
        this.ignored = TriBool.TriBool_unknown;
    }
    
    void bb() {
        this.ignored = (World.friendSystem.ignoreList.bt(this.aw, 838474522) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    void fillIsIgnored(final int n) {
        try {
            TriBool ignored;
            if (World.friendSystem.ignoreList.bt(this.aw, 1945159047)) {
                if (n <= -1549768982) {
                    throw new IllegalStateException();
                }
                ignored = TriBool.TriBool_true;
            }
            else {
                ignored = TriBool.TriBool_false;
            }
            this.ignored = ignored;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pd.ao(" + ')');
        }
    }
    
    void fillIsFriend(final int n) {
        try {
            TriBool friend;
            if (World.friendSystem.friendsList.bt(this.aw, -754771025)) {
                if (n <= -102381769) {
                    throw new IllegalStateException();
                }
                friend = TriBool.TriBool_true;
            }
            else {
                friend = TriBool.TriBool_false;
            }
            this.friend = friend;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pd.at(" + ')');
        }
    }
    
    void ak() {
        this.friend = (World.friendSystem.friendsList.bt(this.aw, 2127181752) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    void as() {
        this.friend = (World.friendSystem.friendsList.bt(this.aw, -1552833346) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    void az() {
        this.ignored = TriBool.TriBool_unknown;
    }
    
    void ax() {
        this.friend = TriBool.TriBool_unknown;
    }
    
    public final boolean isIgnored(final int n) {
        try {
            if (TriBool.TriBool_unknown == this.ignored) {
                if (n == -378812168) {
                    throw new IllegalStateException();
                }
                this.fillIsIgnored(-1171286552);
            }
            boolean b;
            if (TriBool.TriBool_true == this.ignored) {
                if (n == -378812168) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pd.ay(" + ')');
        }
    }
    
    void bi() {
        this.ignored = (World.friendSystem.ignoreList.bt(this.aw, 182225749) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public final boolean isFriend(final int n) {
        try {
            if (this.friend == TriBool.TriBool_unknown) {
                if (n == 318977283) {
                    throw new IllegalStateException();
                }
                this.fillIsFriend(1501907889);
            }
            boolean b;
            if (this.friend == TriBool.TriBool_true) {
                if (n == 318977283) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pd.aw(" + ')');
        }
    }
    
    void clearIsIgnored(final int n) {
        try {
            this.ignored = TriBool.TriBool_unknown;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pd.aa(" + ')');
        }
    }
    
    void ai() {
        this.friend = TriBool.TriBool_unknown;
    }
    
    public static boolean gg(final ClanMate clanMate) {
        if (TriBool.TriBool_unknown == clanMate.ignored) {
            clanMate.fillIsIgnored(668020047);
        }
        return TriBool.TriBool_true == clanMate.ignored;
    }
    
    public final boolean ap() {
        if (TriBool.TriBool_unknown == this.ignored) {
            this.fillIsIgnored(-1443670576);
        }
        return TriBool.TriBool_true == this.ignored;
    }
    
    public FriendsChatRank getRank() {
        return FriendsChatRank.valueOf(this.mf());
    }
    
    void clearIsFriend(final byte b) {
        try {
            this.friend = TriBool.TriBool_unknown;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pd.af(" + ')');
        }
    }
    
    void aj() {
        this.friend = (World.friendSystem.friendsList.bt(this.aw, -267119942) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public static void lu(final ClanMate clanMate) {
        if (clanMate == null) {
            clanMate.getRank();
        }
        clanMate.ignored = TriBool.TriBool_unknown;
    }
    
    public static boolean hj(final ClanMate clanMate) {
        if (clanMate.friend == TriBool.TriBool_unknown) {
            clanMate.fillIsFriend(535420222);
        }
        return clanMate.friend == TriBool.TriBool_true;
    }
}
