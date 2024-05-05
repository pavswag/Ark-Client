// 
// Decompiled by Procyon v0.5.36
// 

public class MenuAction
{
    int itemId;
    int param0;
    int opcode;
    int identifier;
    int param1;
    String action;
    static class473 HitSplatDefinition_cached;
    String target;
    static final int bd = 50;
    
    MenuAction() {
    }
    
    public void cl(final int n) {
        this.itemId = n * 355643405;
    }
    
    public static boolean isAlphaNumeric(final char c, final int n) {
        try {
            Label_0021: {
                if (c < '0') {
                    break Label_0021;
                }
                if (n >= 21779331) {
                    throw new IllegalStateException();
                }
                if (c <= '9') {
                    return true;
                }
                if (n >= 21779331) {
                    throw new IllegalStateException();
                }
                break Label_0021;
            }
            if (c >= 'A') {
                if (n >= 21779331) {
                    throw new IllegalStateException();
                }
                if (c <= 'Z') {
                    return true;
                }
                if (n >= 21779331) {
                    throw new IllegalStateException();
                }
            }
            if (c >= 'a') {
                if (n >= 21779331) {
                    throw new IllegalStateException();
                }
                if (c <= 'z') {
                    if (n >= 21779331) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
            return false;
            b = true;
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cb.ay(" + ')');
        }
    }
    
    public void dl(final String action) {
        this.action = action;
    }
    
    public void ml(final int n) {
        this.param1 = n * 1112086437;
    }
    
    public void tm(final int n) {
        this.identifier = n * -1353871487;
    }
    
    public void ws(final int n) {
        this.param0 = n * 116605911;
    }
    
    public void zh(final String target) {
        this.target = target;
    }
    
    public String yi() {
        return this.target;
    }
    
    public int xc() {
        return this.opcode * 532700261;
    }
    
    public void gl(final int n) {
        this.opcode = n * -1623394963;
    }
    
    static void method439(final int n, final byte[] data, final ArchiveDisk archiveDisk, final byte b) {
        try {
            final ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
            archiveDiskAction.type = 0;
            archiveDiskAction.hr = n;
            archiveDiskAction.data = data;
            archiveDiskAction.archiveDisk = archiveDisk;
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
            }
            class124.method741(1001828661);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cb.af(" + ')');
        }
    }
    
    public static void method439(final AbstractArchive npcDefinition_archive, final AbstractArchive field1559, final int n) {
        try {
            NPCComposition.NpcDefinition_archive = npcDefinition_archive;
            NPCComposition.field1559 = field1559;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cb.af(" + ')');
        }
    }
    
    public static void method439(final AbstractArchive varbitDefinition_archive, final int n) {
        try {
            VarbitComposition.VarbitDefinition_archive = varbitDefinition_archive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cb.af(" + ')');
        }
    }
    
    public int kk() {
        return this.param0 * 68640743;
    }
    
    public int dg() {
        return this.identifier * 1480765569;
    }
    
    public String mp() {
        return this.action;
    }
    
    public int tj() {
        return this.param1 * 1427372077;
    }
    
    public int xx() {
        return this.itemId * 680599237;
    }
    
    public static final void insertMenuItemNoShift(final String s, final String s2, final int n, final int n2, final int n3, final int n4, final byte b) {
        try {
            SceneTilePaint.insertMenuItem(s, s2, n, n2, n3, n4, -1, false, (byte)6);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cb.kz(" + ')');
        }
    }
}
