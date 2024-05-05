import java.awt.event.MouseWheelEvent;
import java.awt.Component;
import java.awt.event.MouseWheelListener;

// 
// Decompiled by Procyon v0.5.36
// 

public final class MouseWheelHandler implements class170, MouseWheelListener
{
    int rotation;
    
    MouseWheelHandler() {
        this.rotation = 0;
    }
    
    @Override
    public synchronized int ao() {
        final int n = 305504659 * this.rotation;
        this.rotation = 0;
        return n;
    }
    
    void at(final Component component) {
        component.removeMouseWheelListener(this);
    }
    
    @Override
    public synchronized int ay() {
        final int n = -791311769 * this.rotation;
        this.rotation = 0;
        return n;
    }
    
    @Override
    public synchronized int useRotation(final int n) {
        try {
            final int n2 = -791311769 * this.rotation;
            this.rotation = 0;
            return n2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ak.aw(" + ')');
        }
    }
    
    void al(final Component component) {
        component.removeMouseWheelListener(this);
    }
    
    void method85(final Component component, final int n) {
        try {
            component.removeMouseWheelListener(this);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ak.an(" + ')');
        }
    }
    
    void ac(final Component component) {
        component.addMouseWheelListener(this);
    }
    
    void au(final Component component) {
        component.addMouseWheelListener(this);
    }
    
    void aa(final Component component) {
        component.removeMouseWheelListener(this);
    }
    
    @Override
    public synchronized void mouseWheelMoved(MouseWheelEvent mouseWheelMoved) {
        mouseWheelMoved = ScriptFrame.client.getCallbacks().mouseWheelMoved(mouseWheelMoved);
        if (!mouseWheelMoved.isConsumed()) {
            final MouseWheelEvent mouseWheelEvent = mouseWheelMoved;
            try {
                this.rotation += mouseWheelEvent.getWheelRotation() * -18484905;
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ak.mouseWheelMoved(" + ')');
            }
        }
    }
    
    void addTo(final Component component, final int n) {
        try {
            component.removeMouseWheelListener(this);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ak.an(" + ')');
        }
    }
    
    void ab(final Component component) {
        component.addMouseWheelListener(this);
    }
    
    void aq(final Component component) {
        component.removeMouseWheelListener(this);
    }
    
    public static void zd(final MouseWheelHandler l, final Component component, final int n) {
        if (l == null) {
            l.addTo(component, n);
            return;
        }
        try {
            component.addMouseWheelListener(l);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ak.af(" + ')');
        }
    }
}
