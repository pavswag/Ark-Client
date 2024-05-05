// 
// Decompiled by Procyon v0.5.36
// 

public class class489
{
    static final int ao = 9;
    short[] field4053;
    static final int aa = 10;
    int[] field4054;
    
    public class489(final NPCComposition npcComposition) {
        this.field4054 = new int[8];
        this.field4053 = new short[8];
        int length = 0;
        if (npcComposition.method1028((byte)29)) {
            length = npcComposition.method1029(-185133589).length;
            System.arraycopy(npcComposition.method1029(-1568093553), 0, this.field4054, 0, length);
            System.arraycopy(npcComposition.method1031(800844396), 0, this.field4053, 0, length);
        }
        for (int i = length; i < 8; ++i) {
            this.field4054[i] = -1;
            this.field4053[i] = -1;
        }
    }
    
    public static void en(final class489 class489, final int[] field4054, final short[] field4055) {
        if (class489 == null) {
            class489.ao(field4054, field4055);
            return;
        }
        class489.field4054 = field4054;
        class489.field4053 = field4055;
    }
    
    public void ao(final int[] field4054, final short[] field4055) {
        this.field4054 = field4054;
        this.field4053 = field4055;
    }
    
    public short[] at() {
        return this.field4053;
    }
    
    public void ax(final int[] field4054, final short[] field4055) {
        this.field4054 = field4054;
        this.field4053 = field4055;
    }
    
    public void ay(final int n, final int n2, final short n3) {
        this.field4054[n] = n2;
        this.field4053[n] = n3;
    }
    
    public void method2545(final int n, final int n2, final short n3, final int n4) {
        try {
            this.field4054[n] = n2;
            this.field4053[n] = n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sx.aw(" + ')');
        }
    }
    
    public short[] method2544(final int n) {
        try {
            return this.field4053;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sx.an(" + ')');
        }
    }
    
    public void method2547(final int[] field4054, final short[] field4055, final byte b) {
        try {
            this.field4054 = field4054;
            this.field4053 = field4055;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sx.ac(" + ')');
        }
    }
    
    public static void vc(final class489 class489, final int n, final int n2, final short n3, final int n4) {
        if (class489 == null) {
            class489.method2545(n, n, n3, n);
            return;
        }
        try {
            class489.field4054[n] = n2;
            class489.field4053[n] = n3;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sx.aw(" + ')');
        }
    }
    
    public int[] au() {
        return this.field4054;
    }
    
    public void aa(final int n, final int n2, final short n3) {
        this.field4054[n] = n2;
        this.field4053[n] = n3;
    }
    
    public void ai(final int[] field4054, final short[] field4055) {
        this.field4054 = field4054;
        this.field4053 = field4055;
    }
    
    public int[] method2546(final byte b) {
        try {
            return this.field4054;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sx.af(" + ')');
        }
    }
    
    public int[] ab() {
        return this.field4054;
    }
    
    public int[] aq() {
        return this.field4054;
    }
}
