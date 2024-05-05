import net.runelite.api.NPC;
import net.runelite.api.Actor;
import javax.annotation.Nullable;
import net.runelite.api.Player;
import net.runelite.api.widgets.Widget;
import net.runelite.api.MenuAction;
import java.util.function.Consumer;
import net.runelite.api.MenuEntry;

// 
// Decompiled by Procyon v0.5.36
// 

public class rl3 implements MenuEntry
{
    public Consumer jj;
    public int ai;
    
    public rl3(final int ai) {
        this.ai = ai;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof rl3)) {
            return false;
        }
        final rl3 rl3 = (rl3)o;
        if (!rl3.sj(this)) {
            return false;
        }
        if (this.getIdentifier() != rl3.getIdentifier()) {
            return false;
        }
        if (this.getParam0() != rl3.getParam0()) {
            return false;
        }
        if (this.getParam1() != rl3.getParam1()) {
            return false;
        }
        if (this.getItemId() != rl3.getItemId()) {
            return false;
        }
        if (this.isForceLeftClick() != rl3.isForceLeftClick()) {
            return false;
        }
        if (this.isDeprioritized() != rl3.isDeprioritized()) {
            return false;
        }
        final String option = this.getOption();
        final String option2 = rl3.getOption();
        Label_0143: {
            if (option == null) {
                if (option2 == null) {
                    break Label_0143;
                }
            }
            else if (option.equals(option2)) {
                break Label_0143;
            }
            return false;
        }
        final String target = this.getTarget();
        final String target2 = rl3.getTarget();
        Label_0180: {
            if (target == null) {
                if (target2 == null) {
                    break Label_0180;
                }
            }
            else if (target.equals(target2)) {
                break Label_0180;
            }
            return false;
        }
        final MenuAction type = this.getType();
        final MenuAction type2 = rl3.getType();
        if (type == null) {
            if (type2 == null) {
                return true;
            }
        }
        else if (type.equals(type2)) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "MenuEntryImpl(getOption=" + this.getOption() + ", getTarget=" + this.getTarget() + ", getIdentifier=" + this.getIdentifier() + ", getType=" + this.getType() + ", getParam0=" + this.getParam0() + ", getParam1=" + this.getParam1() + ", getItemId=" + this.getItemId() + ", isForceLeftClick=" + this.isForceLeftClick() + ", isDeprioritized=" + this.isDeprioritized() + ")";
    }
    
    @Override
    public int hashCode() {
        final int n = (((((1 * 59 + this.getIdentifier()) * 59 + this.getParam0()) * 59 + this.getParam1()) * 59 + this.getItemId()) * 59 + (this.isForceLeftClick() ? 79 : 97)) * 59 + (this.isDeprioritized() ? 79 : 97);
        final String option = this.getOption();
        final int n2 = n * 59 + ((option == null) ? 43 : option.hashCode());
        final String target = this.getTarget();
        final int n3 = n2 * 59 + ((target == null) ? 43 : target.hashCode());
        final MenuAction type = this.getType();
        return n3 * 59 + ((type == null) ? 43 : type.hashCode());
    }
    
    public rl3 tb(final int n) {
        Client.menuIdentifiers[this.ai] = n;
        return this;
    }
    
    public MenuEntry getParent() {
        return (MenuEntry)Client.qi[this.ai];
    }
    
    public MenuAction getType() {
        int n = Client.menuOpcodes[this.ai];
        if (n >= 2000) {
            n -= 2000;
        }
        return MenuAction.of(n);
    }
    
    public boolean sj(final Object o) {
        return o instanceof rl3;
    }
    
    public String getTarget() {
        return Client.menuTargets[this.ai];
    }
    
    public rl3 rn(final String s) {
        Client.menuTargets[this.ai] = s;
        return this;
    }
    
    public MenuEntry setParent(final MenuEntry menuEntry) {
        if (menuEntry == this) {
            throw new IllegalArgumentException("cannot set parent to self");
        }
        Client.qi[this.ai] = (rl3)menuEntry;
        return (MenuEntry)this;
    }
    
    public rl3 ec(final boolean b) {
        Client.menuShiftClick[this.ai] = b;
        return this;
    }
    
    public rl3 zf(final int n) {
        Client.menuArguments1[this.ai] = n;
        return this;
    }
    
    public String getOption() {
        return Client.menuActions[this.ai];
    }
    
    public int getIdentifier() {
        return Client.menuIdentifiers[this.ai];
    }
    
    public rl3 vd(final MenuAction menuAction) {
        final int n = Client.menuOpcodes[this.ai];
        int n2 = 0;
        if (n >= 2000) {
            n2 = 2000;
        }
        Client.menuOpcodes[this.ai] = menuAction.getId() + n2;
        return this;
    }
    
    public void fx(final int n) {
        Client.menuItemIds[this.ai] = n;
    }
    
    public rl3 wa(final int n) {
        Client.menuArguments2[this.ai] = n;
        return this;
    }
    
    public rl3 dg(final String s) {
        Client.menuActions[this.ai] = s;
        return this;
    }
    
    public Widget getWidget() {
        switch (rl4.gf[this.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                final int param1 = this.getParam1();
                final int param2 = this.getParam0();
                Object o = ScriptFrame.client.ex(param1);
                if (o != null && param2 > -1) {
                    o = ((Widget)o).getChild(param2);
                }
                return (Widget)o;
            }
            default: {
                return null;
            }
        }
    }
    
    @Nullable
    public Player getPlayer() {
        switch (rl4.gf[this.getType().ordinal()]) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24: {
                return (Player)ScriptFrame.client.ic()[this.getIdentifier()];
            }
            default: {
                return null;
            }
        }
    }
    
    public int getItemOp() {
        final MenuAction type = this.getType();
        if (type == MenuAction.CC_OP || type == MenuAction.CC_OP_LOW_PRIORITY) {
            final int n = Client.menuIdentifiers[this.ai];
            final int n2 = Client.menuArguments2[this.ai];
            final int n3 = Client.menuArguments1[this.ai];
            if (n2 == 9764864) {
                switch (n) {
                    case 1: {
                        final Widget ex = ScriptFrame.client.ex(n2);
                        if (ex == null || n3 == -1) {
                            break;
                        }
                        final Widget child = ((Widget)ex).getChild(n3);
                        if (child == null || child.getItemId() <= -1) {
                            break;
                        }
                        final int shiftClickActionIndex = ScriptFrame.client.vmethod1485(child.getItemId()).getShiftClickActionIndex();
                        if (shiftClickActionIndex >= 0) {
                            return shiftClickActionIndex + 1;
                        }
                        break;
                    }
                    case 2: {
                        return 1;
                    }
                    case 3: {
                        return 2;
                    }
                    case 4: {
                        return 3;
                    }
                    case 6: {
                        return 4;
                    }
                    case 7: {
                        return 5;
                    }
                }
            }
        }
        return -1;
    }
    
    @Nullable
    public Actor getActor() {
        final NPC npc = this.getNpc();
        if (npc != null) {
            return (Actor)npc;
        }
        return (Actor)this.getPlayer();
    }
    
    public boolean isForceLeftClick() {
        return Client.menuShiftClick[this.ai];
    }
    
    public int getParam1() {
        return Client.menuArguments2[this.ai];
    }
    
    public boolean isDeprioritized() {
        return Client.menuOpcodes[this.ai] >= 2000;
    }
    
    public int getParam0() {
        return Client.menuArguments1[this.ai];
    }
    
    public MenuEntry setDeprioritized(final boolean b) {
        if (b) {
            if (Client.menuOpcodes[this.ai] < 2000) {
                final int[] menuOpcodes = Client.menuOpcodes;
                final int ai = this.ai;
                menuOpcodes[ai] += 2000;
            }
        }
        else if (Client.menuOpcodes[this.ai] >= 2000) {
            final int[] menuOpcodes2 = Client.menuOpcodes;
            final int ai2 = this.ai;
            menuOpcodes2[ai2] -= 2000;
        }
        return (MenuEntry)this;
    }
    
    public int getItemId() {
        return Client.menuItemIds[this.ai];
    }
    
    public boolean isItemOp() {
        final MenuAction type = this.getType();
        if (type == MenuAction.CC_OP || type == MenuAction.CC_OP_LOW_PRIORITY) {
            final int n = Client.menuIdentifiers[this.ai];
            if (Client.menuArguments2[this.ai] == 9764864) {
                switch (n) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 7: {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Nullable
    public NPC getNpc() {
        switch (rl4.gf[this.getType().ordinal()]) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13: {
                return (NPC)ScriptFrame.client.pb()[this.getIdentifier()];
            }
            default: {
                return null;
            }
        }
    }
    
    public rl3 lz(final Consumer jj) {
        this.jj = jj;
        return this;
    }
}
