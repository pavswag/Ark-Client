import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.5.36
// 

class class128 implements Callable
{
    static Archive archive13;
    final /* synthetic */ int val$workStart;
    final /* synthetic */ class124[] val$curveLoadJobs;
    final /* synthetic */ class133 this$0;
    public static final int an = 1;
    final /* synthetic */ int val$workEnd;
    static final int bx = 38;
    
    class128(final class133 this$0, final int val$workStart, final int val$workEnd, final class124[] val$curveLoadJobs) {
        this.this$0 = this$0;
        this.val$workStart = val$workStart;
        this.val$workEnd = val$workEnd;
        this.val$curveLoadJobs = val$curveLoadJobs;
    }
    
    @Override
    public Object call() {
        try {
            for (int i = this.val$workStart; i < this.val$workEnd; ++i) {
                this.val$curveLoadJobs[i].call();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ei.call(" + ')');
        }
    }
    
    public static boolean wr(final FriendSystem friendSystem, final Username username, final boolean b) {
        if (friendSystem == null) {
            friendSystem.bi();
        }
        return null != username && (username.equals(MusicPatchNode.localPlayer.username) || friendSystem.friendsList.isFriended(username, b, 144693023));
    }
    
    public Object aw() {
        for (int i = this.val$workStart; i < this.val$workEnd; ++i) {
            this.val$curveLoadJobs[i].call();
        }
        return null;
    }
    
    public Object an() {
        for (int i = this.val$workStart; i < this.val$workEnd; ++i) {
            this.val$curveLoadJobs[i].call();
        }
        return null;
    }
}
