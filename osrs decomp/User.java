import net.runelite.api.events.NameableNameChanged;
import net.runelite.api.Nameable;

// 
// Decompiled by Procyon v0.5.36
// 

public class User implements Comparable, Nameable
{
    Username previousUsername;
    public static final int em = 2;
    Username username;
    
    public String getName() {
        return this.hb().wu();
    }
    
    User() {
    }
    
    @Override
    public int compareTo(final Object o) {
        try {
            return this.compareTo_user((User)o, 1093536041);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pw.compareTo(" + ')');
        }
    }
    
    void bs(final Username username, final Username previousUsername) {
        if (null == username) {
            throw new NullPointerException();
        }
        this.username = username;
        this.previousUsername = previousUsername;
    }
    
    public static String tg(final User user, final int n) {
        if (user == null) {
            return user.getName(n);
        }
        try {
            if (null != user.previousUsername) {
                return user.previousUsername.getName(-710264960);
            }
            if (n != -43557433) {
                throw new IllegalStateException();
            }
            return "";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pw.bx(" + ')');
        }
    }
    
    public Username cw() {
        return this.previousUsername;
    }
    
    public Username getUsername(final int n) {
        try {
            return this.username;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pw.be(" + ')');
        }
    }
    
    public Username hb() {
        return this.username;
    }
    
    void set(final Username username, final Username previousUsername, final byte b) {
        try {
            if (null == username) {
                throw new NullPointerException();
            }
            this.username = username;
            this.previousUsername = previousUsername;
            this.uz(-1);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pw.bo(" + ')');
        }
    }
    
    public String bt() {
        if (null == this.previousUsername) {
            return "";
        }
        return this.previousUsername.getName(-710264960);
    }
    
    void br(final Username username, final Username previousUsername) {
        if (null == username) {
            throw new NullPointerException();
        }
        this.username = username;
        this.previousUsername = previousUsername;
    }
    
    public int al(final User user) {
        return this.username.compareToTyped(user.username, (byte)116);
    }
    
    public int compareTo_user(final User user, final int n) {
        try {
            return this.username.compareToTyped(user.username, (byte)95);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pw.an(" + ')');
        }
    }
    
    public int ac(final Object o) {
        return this.compareTo_user((User)o, 1856817146);
    }
    
    public int au(final Object o) {
        return this.compareTo_user((User)o, 659632812);
    }
    
    public String getPreviousName(final int n) {
        try {
            if (null != this.username) {
                return this.username.getName(-710264960);
            }
            if (n == 1942649753) {
                throw new IllegalStateException();
            }
            return "";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pw.bk(" + ')');
        }
    }
    
    public String bd() {
        if (null == this.previousUsername) {
            return "";
        }
        return this.previousUsername.getName(-710264960);
    }
    
    void bg(final Username username, final Username previousUsername) {
        if (null == username) {
            throw new NullPointerException();
        }
        this.username = username;
        this.previousUsername = previousUsername;
    }
    
    void bn(final Username username, final Username previousUsername) {
        if (null == username) {
            throw new NullPointerException();
        }
        this.username = username;
        this.previousUsername = previousUsername;
    }
    
    static void method2164(final int n, final short n2) {
        try {
            final ItemContainer itemContainer = (ItemContainer)ItemContainer.itemContainers.at(n);
            if (null != itemContainer) {
                itemContainer.hw();
                return;
            }
            if (n2 <= 3150) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pw.ab(" + ')');
        }
    }
    
    public int method2164(final Object o) {
        return this.compareTo_user((User)o, 966104677);
    }
    
    public int aq(final User user) {
        return this.username.compareToTyped(user.username, (byte)116);
    }
    
    public String bz() {
        if (null == this.username) {
            return "";
        }
        return this.username.getName(-710264960);
    }
    
    public String bj() {
        if (null == this.previousUsername) {
            return "";
        }
        return this.previousUsername.getName(-710264960);
    }
    
    public String bm() {
        if (null == this.username) {
            return "";
        }
        return this.username.getName(-710264960);
    }
    
    public String getName(final int n) {
        try {
            if (null != this.previousUsername) {
                return this.username.getName(-710264960);
            }
            if (n != -43557433) {
                throw new IllegalStateException();
            }
            return "";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pw.bx(" + ')');
        }
    }
    
    public String getPrevName() {
        final Username cw = this.cw();
        return (cw == null) ? null : cw.wu();
    }
    
    public void uz(final int n) {
        ScriptFrame.client.getCallbacks().post((Object)new NameableNameChanged((Nameable)this));
    }
    
    void bu(final Username username, final Username previousUsername) {
        if (null == username) {
            throw new NullPointerException();
        }
        this.username = username;
        this.previousUsername = previousUsername;
    }
}
