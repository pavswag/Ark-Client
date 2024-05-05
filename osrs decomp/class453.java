// 
// Decompiled by Procyon v0.5.36
// 

public class class453 extends class455
{
    int field3887;
    int field3889;
    int field3890;
    int field3888;
    int field3891;
    int field3886;
    
    public class453(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        super(n7, n8);
        this.field3889 = 0;
        this.field3886 = 0;
        this.field3890 = 0;
        this.field3887 = 0;
        this.field3891 = 0;
        this.field3888 = 0;
        this.field3889 = n * -1673207349;
        this.field3886 = n2 * 1707987953;
        this.field3890 = 1911990649 * n3;
        this.field3887 = 1745971459 * n4;
        this.field3891 = n5 * -1112541267;
        this.field3888 = -233243325 * n6;
    }
    
    @Override
    public int at() {
        return (int)Math.round(81359788 * this.field3890 + (this.field3888 * 1604089707 - this.field3890 * -659525431) * this.ay(1089057010));
    }
    
    @Override
    public int vmethod2320(final byte b) {
        try {
            return (int)Math.round(-659525431 * this.field3890 + (this.field3888 * 1604089707 - this.field3890 * -659525431) * this.ay(1089057010));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rs.aw(" + ')');
        }
    }
    
    @Override
    public int al() {
        return (int)Math.round(-659525431 * this.field3890 + (this.field3888 * 1604089707 - this.field3890 * -659525431) * this.ay(1089057010));
    }
    
    @Override
    public int vmethod2319(final int n) {
        try {
            return (int)Math.round(this.ay(1089057010) * (this.field3891 * -322141147 - this.field3886 * 832355601) + this.field3886 * 832355601);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rs.an(" + ')');
        }
    }
    
    @Override
    public int ac() {
        return (int)Math.round((this.field3887 * 117192587 - this.field3889 * -2105750034) * this.ay(1089057010) + this.field3889 * -932824093);
    }
    
    @Override
    public int au() {
        return (int)Math.round(this.ay(1089057010) * (this.field3891 * -1133492170 - this.field3886 * 629390841) + this.field3886 * -218179973);
    }
    
    @Override
    public int vmethod2321(final int n) {
        try {
            return (int)Math.round((this.field3887 * 886000043 - this.field3889 * -932824093) * this.ay(1089057010) + this.field3889 * -932824093);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rs.af(" + ')');
        }
    }
    
    @Override
    public int ab() {
        return (int)Math.round(this.ay(1089057010) * (this.field3891 * -322141147 - this.field3886 * 832355601) + this.field3886 * 832355601);
    }
    
    @Override
    public int aq() {
        return (int)Math.round(this.ay(1089057010) * (this.field3891 * -322141147 - this.field3886 * 832355601) + this.field3886 * 832355601);
    }
}
