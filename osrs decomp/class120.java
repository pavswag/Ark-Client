// 
// Decompiled by Procyon v0.5.36
// 

public class class120
{
    float field1172;
    float field1173;
    float field1174;
    int field1175;
    float field1176;
    class120 field1177;
    float field1178;
    static final String hh = "JX_ACCESS_TOKEN";
    static final int bm = 49;
    public static boolean musicTrackBoolean;
    public static final String kx = "Please ensure all characters are populated.";
    
    class120() {
        this.field1174 = Float.MAX_VALUE;
        this.field1172 = Float.MAX_VALUE;
        this.field1176 = Float.MAX_VALUE;
        this.field1173 = Float.MAX_VALUE;
    }
    
    void aw(final Buffer buffer, final int n) {
        this.field1175 = buffer.readUnsignedByte((byte)(-20)) * 1259095469;
        this.field1178 = Buffer.iu(buffer, 1165476302);
        this.field1174 = Buffer.iu(buffer, 996707654);
        this.field1172 = Buffer.iu(buffer, 942219684);
        this.field1176 = Buffer.iu(buffer, 1612295397);
        this.field1173 = Buffer.iu(buffer, 1847753989);
    }
    
    void an(final Buffer buffer, final int n) {
        this.field1175 = buffer.readUnsignedByte((byte)8) * -1294107159;
        this.field1178 = Buffer.iu(buffer, 1904923237);
        this.field1174 = Buffer.iu(buffer, 1517069771);
        this.field1172 = Buffer.iu(buffer, 628544942);
        this.field1176 = Buffer.iu(buffer, 1882410851);
        this.field1173 = Buffer.iu(buffer, 1233194639);
    }
    
    static void setTapToDrop(final boolean tapToDrop, final byte b) {
        try {
            Client.tapToDrop = tapToDrop;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ev.lw(" + ')');
        }
    }
    
    void method717(final Buffer buffer, final int n, final int n2) {
        try {
            this.field1175 = buffer.readUnsignedByte((byte)(-12)) * -1294107159;
            this.field1178 = Buffer.iu(buffer, 1038383495);
            this.field1174 = Buffer.iu(buffer, 1253800642);
            this.field1172 = Buffer.iu(buffer, 1257779706);
            this.field1176 = Buffer.iu(buffer, 1261517760);
            this.field1173 = Buffer.iu(buffer, 2141379961);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ev.af(" + ')');
        }
    }
}
