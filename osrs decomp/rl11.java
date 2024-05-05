import net.runelite.api.Animation;
import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import java.awt.event.WindowEvent;
import net.runelite.api.RuneLiteObject;

// 
// Decompiled by Procyon v0.5.36
// 

public class rl11 extends GraphicsObject implements RuneLiteObject
{
    public Model at;
    public short cx;
    public boolean ix;
    public short vi;
    public boolean iq;
    
    public rl11() {
        this.cx = 60;
        super.isFinished = true;
    }
    
    public boolean isActive() {
        return !super.isFinished;
    }
    
    @Override
    public void dt(final int n) {
        if (super.sequenceDefinition == null) {
            return;
        }
        super.dt(n);
        if (this.ix && super.isFinished) {
            super.isFinished = false;
            super.frame = 0 * 639915885;
            super.frameCycle = 0 * -1521037169;
        }
    }
    
    public static void aw(final GameEngine gameEngine, final WindowEvent windowEvent) {
        if (gameEngine == null) {
            gameEngine.za();
        }
    }
    
    @Override
    public Model fa() {
        final Model at = this.at;
        if (at == null) {
            return null;
        }
        Model model;
        if (super.sequenceDefinition != null) {
            model = super.sequenceDefinition.vt(at, super.frame * 158616165);
        }
        else {
            model = at.qn(true);
        }
        return model;
    }
    
    public void setLocation(final LocalPoint localPoint, final int n) {
        super.x = localPoint.getX() * -620581055;
        super.y = localPoint.getY() * -652580511;
        super.plane = n * 1295796889;
        super.z = Perspective.getTileHeight((Client)ScriptFrame.client, localPoint, n) * 186790935;
    }
    
    public int getRadius() {
        return this.cx;
    }
    
    public int getOrientation() {
        return this.vi;
    }
    
    public void setModel(final net.runelite.api.Model model) {
        this.at = (Model)model;
    }
    
    public void setOrientation(final int n) {
        this.vi = (short)n;
    }
    
    public boolean drawFrontTilesFirst() {
        return this.iq;
    }
    
    public void setDrawFrontTilesFirst(final boolean iq) {
        this.iq = iq;
    }
    
    public void setActive(final boolean b) {
        assert ScriptFrame.client.isClientThread() : "must be called on client thread";
        if (super.isFinished == !b) {
            return;
        }
        super.isFinished = !b;
        if (b) {
            super.frame = 0 * 639915885;
            super.frameCycle = 0 * -1521037169;
            Client.hk.rd(this);
        }
        else {
            this.gy();
        }
    }
    
    public void setAnimation(final Animation animation) {
        super.frame = 0 * 639915885;
        super.frameCycle = 0 * -1521037169;
        super.sequenceDefinition = (SequenceDefinition)animation;
    }
    
    public void setShouldLoop(final boolean ix) {
        this.ix = ix;
    }
    
    public void setRadius(final int n) {
        this.cx = (short)n;
    }
}
