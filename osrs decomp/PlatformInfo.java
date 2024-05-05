// 
// Decompiled by Procyon v0.5.36
// 

public class PlatformInfo extends Node
{
    static final int al = 2;
    static final int ac = 3;
    static final int ab = 0;
    static final int an = 1;
    static final int bb = 1;
    int field3852;
    boolean field3863;
    int field3854;
    int field3855;
    int field3856;
    int field3857;
    int field3858;
    int field3859;
    String field3860;
    String field3861;
    int field3862;
    boolean field3853;
    int field3864;
    String field3865;
    String field3866;
    String field3867;
    String field3868;
    static final int bu = 0;
    int field3869;
    int field3870;
    int field3871;
    String field3872;
    int[] field3873;
    String field3874;
    int field3875;
    int field3876;
    int field3877;
    
    PlatformInfo(final int n, final boolean field3863, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean field3864, final int n7, final int n8, final int n9, final int n10, final String field3865, final String field3866, final String field3867, final String field3868, final int n11, final int n12, final int n13, final int n14, final String field3869, final String field3870, final int[] field3871, final int n15, final String field3872, final String field3873) {
        this.field3873 = new int[3];
        this.field3876 = -1752231917 * n;
        this.field3863 = field3863;
        this.field3854 = 51591913 * n2;
        this.field3855 = -746472041 * n3;
        this.field3856 = n4 * -694374651;
        this.field3871 = n5 * 1786544423;
        this.field3858 = n6 * 1296880687;
        this.field3853 = field3864;
        this.field3877 = -2091170655 * n7;
        this.field3870 = 1039308385 * n8;
        this.field3852 = -1509290189 * n9;
        this.field3857 = -29991611 * n10;
        this.field3865 = field3865;
        this.field3866 = field3866;
        this.field3867 = field3867;
        this.field3868 = field3868;
        this.field3864 = -1739220305 * n11;
        this.field3869 = n12 * -478417633;
        this.field3862 = -1294370559 * n13;
        this.field3859 = 1200026087 * n14;
        this.field3872 = field3869;
        this.field3861 = field3870;
        this.field3873 = field3871;
        this.field3875 = n15 * -1284731395;
        this.field3860 = field3872;
        this.field3874 = field3873;
    }
    
    public static void dw(final MidiPcmStream midiPcmStream, final int n, final int n2) {
        midiPcmStream.field2742[n] = n2;
    }
    
    public static int ws(final PlatformInfo platformInfo) {
        if (platformInfo == null) {
            platformInfo.au();
        }
        return 39 + ObjTypeCustomisation.method971(platformInfo.field3865, (byte)15) + ObjTypeCustomisation.method971(platformInfo.field3866, (byte)37) + ObjTypeCustomisation.method971(platformInfo.field3867, (byte)(-73)) + ObjTypeCustomisation.method971(platformInfo.field3868, (byte)26) + ObjTypeCustomisation.method971(platformInfo.field3872, (byte)(-18)) + ObjTypeCustomisation.method971(platformInfo.field3861, (byte)60) + ObjTypeCustomisation.method971(platformInfo.field3860, (byte)30) + ObjTypeCustomisation.method971(platformInfo.field3874, (byte)(-54));
    }
    
    public static void ei(final ClanMate clanMate) {
        clanMate.friend = (World.friendSystem.friendsList.bt(clanMate.aw, -1233893822) ? TriBool.TriBool_true : TriBool.TriBool_false);
    }
    
    public void aw(final Buffer buffer) {
        buffer.writeShort(9, (byte)1);
        buffer.writeShort(this.field3876 * -414762469, (byte)93);
        buffer.writeShort(this.field3863 ? 1 : 0, (byte)8);
        buffer.writeVarInt(this.field3854 * -189842087, (byte)80);
        buffer.writeShort(-1690004953 * this.field3855, (byte)104);
        buffer.writeShort(this.field3856 * -943340083, (byte)87);
        buffer.writeShort(1022418583 * this.field3871, (byte)74);
        buffer.writeShort(this.field3858 * -1753943345, (byte)99);
        buffer.writeShort(this.field3853 ? 1 : 0, (byte)23);
        buffer.writeVarInt(-1410621599 * this.field3877, (byte)(-20));
        buffer.writeShort(this.field3870 * -618885727, (byte)4);
        Buffer.gi(buffer, this.field3852 * 674530299, -738036244);
        buffer.writeVarInt(1910222221 * this.field3857, (byte)(-15));
        buffer.writeStringCp1252NullTerminated(this.field3865, 1306491482);
        buffer.writeStringCp1252NullTerminated(this.field3866, 1567222177);
        buffer.writeStringCp1252NullTerminated(this.field3867, 1380071657);
        buffer.writeStringCp1252NullTerminated(this.field3868, 222291068);
        buffer.writeShort(-1802285345 * this.field3869, (byte)68);
        buffer.writeVarInt(-335545265 * this.field3864, (byte)(-16));
        buffer.writeStringCp1252NullTerminated(this.field3872, 921144343);
        buffer.writeStringCp1252NullTerminated(this.field3861, 681679309);
        buffer.writeShort(2136442625 * this.field3862, (byte)85);
        buffer.writeShort(this.field3859 * -180252201, (byte)81);
        for (int i = 0; i < this.field3873.length; ++i) {
            buffer.writeInt(this.field3873[i], -2081835031);
        }
        buffer.writeInt(this.field3875 * -656820395, -2081835031);
        buffer.writeStringCp1252NullTerminated(this.field3860, 1980206519);
        buffer.writeStringCp1252NullTerminated(this.field3874, 225660962);
    }
    
    public int size(final byte b) {
        try {
            return 39 + ObjTypeCustomisation.method971(this.field3865, (byte)5) + ObjTypeCustomisation.method971(this.field3867, (byte)(-51)) + ObjTypeCustomisation.method971(this.field3868, (byte)(-9)) + ObjTypeCustomisation.method971(this.field3865, (byte)(-5)) + ObjTypeCustomisation.method971(this.field3860, (byte)(-41)) + ObjTypeCustomisation.method971(this.field3872, (byte)17) + ObjTypeCustomisation.method971(this.field3872, (byte)51) + ObjTypeCustomisation.method971(this.field3872, (byte)(-27));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rv.an(" + ')');
        }
    }
    
    public void ac(final Buffer buffer) {
        buffer.writeShort(9, (byte)40);
        buffer.writeShort(this.field3876 * -414762469, (byte)45);
        buffer.writeShort(this.field3863 ? 1 : 0, (byte)18);
        buffer.writeVarInt(this.field3854 * -189842087, (byte)(-34));
        buffer.writeShort(-1690004953 * this.field3855, (byte)120);
        buffer.writeShort(this.field3856 * -943340083, (byte)93);
        buffer.writeShort(1022418583 * this.field3871, (byte)100);
        buffer.writeShort(this.field3858 * -1753943345, (byte)29);
        buffer.writeShort(this.field3853 ? 1 : 0, (byte)44);
        buffer.writeVarInt(-1410621599 * this.field3877, (byte)(-20));
        buffer.writeShort(this.field3870 * -618885727, (byte)84);
        Buffer.gi(buffer, this.field3852 * 674530299, -781757615);
        buffer.writeVarInt(1910222221 * this.field3857, (byte)(-88));
        buffer.writeStringCp1252NullTerminated(this.field3865, 101477924);
        buffer.writeStringCp1252NullTerminated(this.field3866, 1432634958);
        buffer.writeStringCp1252NullTerminated(this.field3867, 1318557751);
        buffer.writeStringCp1252NullTerminated(this.field3868, -966171102);
        buffer.writeShort(-1802285345 * this.field3869, (byte)103);
        buffer.writeVarInt(-335545265 * this.field3864, (byte)41);
        buffer.writeStringCp1252NullTerminated(this.field3872, 244687696);
        buffer.writeStringCp1252NullTerminated(this.field3861, -287811377);
        buffer.writeShort(2136442625 * this.field3862, (byte)113);
        buffer.writeShort(this.field3859 * -180252201, (byte)105);
        for (int i = 0; i < this.field3873.length; ++i) {
            buffer.writeInt(this.field3873[i], -2081835031);
        }
        buffer.writeInt(this.field3875 * -656820395, -2081835031);
        buffer.writeStringCp1252NullTerminated(this.field3860, 1998399626);
        buffer.writeStringCp1252NullTerminated(this.field3874, -958572261);
    }
    
    public int au() {
        return 39 + ObjTypeCustomisation.method971(this.field3865, (byte)20) + ObjTypeCustomisation.method971(this.field3866, (byte)(-10)) + ObjTypeCustomisation.method971(this.field3867, (byte)84) + ObjTypeCustomisation.method971(this.field3868, (byte)(-80)) + ObjTypeCustomisation.method971(this.field3872, (byte)(-3)) + ObjTypeCustomisation.method971(this.field3861, (byte)75) + ObjTypeCustomisation.method971(this.field3860, (byte)113) + ObjTypeCustomisation.method971(this.field3874, (byte)(-15));
    }
    
    public static int il(final PlatformInfo platformInfo, final byte b) {
        if (platformInfo == null) {
            platformInfo.size(b);
        }
        try {
            return 39 + ObjTypeCustomisation.method971(platformInfo.field3865, (byte)5) + ObjTypeCustomisation.method971(platformInfo.field3866, (byte)(-51)) + ObjTypeCustomisation.method971(platformInfo.field3867, (byte)(-9)) + ObjTypeCustomisation.method971(platformInfo.field3868, (byte)(-5)) + ObjTypeCustomisation.method971(platformInfo.field3872, (byte)(-41)) + ObjTypeCustomisation.method971(platformInfo.field3861, (byte)17) + ObjTypeCustomisation.method971(platformInfo.field3860, (byte)51) + ObjTypeCustomisation.method971(platformInfo.field3874, (byte)(-27));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rv.an(" + ')');
        }
    }
    
    public void write(final Buffer buffer, final byte b) {
        try {
            buffer.writeShort(9, (byte)82);
            buffer.writeShort(this.field3876 * -414762469, (byte)34);
            buffer.writeShort(this.field3863 ? 1 : 0, (byte)26);
            buffer.writeVarInt(this.field3854 * -189842087, (byte)7);
            buffer.writeShort(-1690004953 * this.field3855, (byte)127);
            buffer.writeShort(this.field3856 * -943340083, (byte)43);
            buffer.writeShort(1022418583 * this.field3871, (byte)4);
            buffer.writeShort(this.field3858 * -1753943345, (byte)50);
            int n;
            if (this.field3853) {
                if (b <= 1) {
                    throw new IllegalStateException();
                }
                n = 1;
            }
            else {
                n = 0;
            }
            buffer.writeShort(n, (byte)94);
            buffer.writeVarInt(-1410621599 * this.field3877, (byte)(-35));
            buffer.writeShort(this.field3870 * -618885727, (byte)65);
            Buffer.gi(buffer, this.field3852 * 674530299, -182550176);
            buffer.writeVarInt(1910222221 * this.field3857, (byte)(-48));
            buffer.writeStringCp1252NullTerminated(this.field3865, 1492929913);
            buffer.writeStringCp1252NullTerminated(this.field3866, 259094531);
            buffer.writeStringCp1252NullTerminated(this.field3867, 1951222206);
            buffer.writeStringCp1252NullTerminated(this.field3868, 1636725861);
            buffer.writeShort(-1802285345 * this.field3869, (byte)26);
            buffer.writeVarInt(-335545265 * this.field3864, (byte)66);
            buffer.writeStringCp1252NullTerminated(this.field3872, 1461636662);
            buffer.writeStringCp1252NullTerminated(this.field3861, 1580376873);
            buffer.writeShort(2136442625 * this.field3862, (byte)70);
            buffer.writeShort(this.field3859 * -180252201, (byte)15);
            for (int i = 0; i < this.field3873.length; ++i) {
                buffer.writeInt(this.field3873[i], -2081835031);
            }
            buffer.writeInt(this.field3875 * -656820395, -2081835031);
            buffer.writeStringCp1252NullTerminated(this.field3860, 1248794680);
            buffer.writeStringCp1252NullTerminated(this.field3874, -246130437);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "rv.af(" + ')');
        }
    }
    
    public int ab() {
        return 39 + ObjTypeCustomisation.method971(this.field3865, (byte)(-40)) + ObjTypeCustomisation.method971(this.field3866, (byte)33) + ObjTypeCustomisation.method971(this.field3867, (byte)103) + ObjTypeCustomisation.method971(this.field3868, (byte)40) + ObjTypeCustomisation.method971(this.field3872, (byte)59) + ObjTypeCustomisation.method971(this.field3861, (byte)(-39)) + ObjTypeCustomisation.method971(this.field3860, (byte)83) + ObjTypeCustomisation.method971(this.field3874, (byte)(-84));
    }
    
    public static int zr(final PlatformInfo platformInfo) {
        return 39 + ObjTypeCustomisation.method971(platformInfo.field3865, (byte)20) + ObjTypeCustomisation.method971(platformInfo.field3866, (byte)17) + ObjTypeCustomisation.method971(platformInfo.field3867, (byte)(-4)) + ObjTypeCustomisation.method971(platformInfo.field3868, (byte)(-11)) + ObjTypeCustomisation.method971(platformInfo.field3872, (byte)80) + ObjTypeCustomisation.method971(platformInfo.field3861, (byte)46) + ObjTypeCustomisation.method971(platformInfo.field3860, (byte)20) + ObjTypeCustomisation.method971(platformInfo.field3874, (byte)(-101));
    }
}
