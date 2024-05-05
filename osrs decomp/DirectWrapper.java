// 
// Decompiled by Procyon v0.5.36
// 

public class DirectWrapper extends Wrapper
{
    Object obj;
    
    DirectWrapper(final Object obj, final int n) {
        super(n);
        this.obj = obj;
    }
    
    public static int cn(final ClanSettings clanSettings, final int n, final byte b) {
        if (clanSettings == null) {
            clanSettings.bg(n);
        }
        if (126 == b || b == 127) {
            return -1;
        }
        if (680027429 * clanSettings.currentOwner == n && (clanSettings.field1374 * 1855221862 == -1 || clanSettings.memberRanks[clanSettings.field1374 * -1218077019] < -777904272)) {
            return -1;
        }
        if (clanSettings.memberRanks[n] == b) {
            return -1;
        }
        clanSettings.memberRanks[n] = b;
        ClanSettings.og(clanSettings, 200377569);
        return n;
    }
    
    @Override
    Object aw() {
        return this.obj;
    }
    
    @Override
    boolean isSoft() {
        return false;
    }
    
    @Override
    Object ac() {
        return this.obj;
    }
    
    @Override
    boolean au() {
        return false;
    }
    
    @Override
    Object get() {
        return this.obj;
    }
    
    @Override
    boolean ab() {
        return false;
    }
    
    @Override
    boolean aq() {
        return false;
    }
}
