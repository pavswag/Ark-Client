import java.awt.Graphics;
import java.awt.Component;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Canvas extends java.awt.Canvas
{
    public static final String aq = "main_file_cache.dat2";
    static final int aj = 23;
    static IndexedSprite logoSprite;
    static final int bk = 45;
    Component component;
    static final int ah = 16;
    public static final int aw = 4;
    
    Canvas(final Component component) {
        this.component = component;
    }
    
    @Override
    public final void update(final Graphics g) {
        try {
            this.component.update(g);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ad.update(" + ')');
        }
    }
    
    static void method92(final byte b) {
        try {
            Client.packetWriter.addNode(class330.getPacketBufferNode(ClientPacket.field2467, Client.packetWriter.isaacCipher, (short)(-1894)), 414135591);
            Client.oculusOrbState = 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ad.ne(" + ')');
        }
    }
    
    public final void aw(final Graphics g) {
        this.component.update(g);
    }
    
    public final void an(final Graphics g) {
        this.component.update(g);
    }
    
    public static int method91(int n, final int n2, final int n3, final int n4) {
        try {
            return n &= ~(class140.vmethod3248(n3 - n2 + 1, (byte)111) << n2);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ad.ac(" + ')');
        }
    }
    
    public final void au(final Graphics g) {
        this.component.paint(g);
    }
    
    @Override
    public final void paint(final Graphics g) {
        try {
            this.component.paint(g);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ad.paint(" + ')');
        }
    }
    
    public final void aq(final Graphics g) {
        this.component.paint(g);
    }
    
    public static void zm(final Timer timer, final int n) {
        if (timer == null) {
            timer.ag();
            return;
        }
        timer.field3671 = class96.clockNow(1209547104) * 5863289074674602131L;
        timer.field3679 = n * -2137891125;
    }
}
