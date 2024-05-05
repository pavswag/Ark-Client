import java.net.MalformedURLException;
import java.net.URL;

// 
// Decompiled by Procyon v0.5.36
// 

public class AttackOption implements class356
{
    static final AttackOption field1070;
    public static final int aa = 12;
    static final AttackOption AttackOption_alwaysRightClick;
    static final AttackOption AttackOption_dependsOnCombatLevels;
    static final AttackOption field1073;
    static final AttackOption AttackOption_hidden;
    static final int az = 19136770;
    final int id;
    
    AttackOption(final int n) {
        this.id = 1138059331 * n;
    }
    
    static {
        AttackOption_dependsOnCombatLevels = new AttackOption(0);
        AttackOption_alwaysRightClick = new AttackOption(1);
        field1070 = new AttackOption(2);
        AttackOption_hidden = new AttackOption(3);
        field1073 = new AttackOption(4);
    }
    
    static final InterfaceParent ifOpenSub(final int n, final int n2, final int n3, final int n4) {
        try {
            final InterfaceParent interfaceParent = new InterfaceParent();
            interfaceParent.group = n2 * 111476425;
            interfaceParent.type = 100799 * n3;
            Client.interfaceParents.put(interfaceParent, n);
            ZoneOperation.Widget_resetModelFrames(n2, 2090566862);
            final Widget vmethod3380 = class165.vmethod3380(n, (byte)5);
            class144.invalidateWidget(vmethod3380, -630421795);
            if (Client.meslayerContinueWidget != null) {
                if (n4 != -1618920051) {
                    throw new IllegalStateException();
                }
                class144.invalidateWidget(Client.meslayerContinueWidget, -1679260608);
                Client.meslayerContinueWidget = null;
            }
            WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[n >> 16], vmethod3380, false, (byte)94);
            class12.runWidgetOnLoadListener(n2, (byte)122);
            if (-1 != Client.rootInterface * -896157613) {
                if (n4 != -1618920051) {
                    throw new IllegalStateException();
                }
                class127.runIntfCloseListeners(-896157613 * Client.rootInterface, 1, (byte)63);
            }
            return interfaceParent;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dj.mf(" + ')');
        }
    }
    
    public static boolean ha(final Scene scene, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Renderable renderable, final int n7, final long n8, final int n9) {
        if (scene == null) {
            scene.et(n, n, n);
        }
        return renderable == null || Scene.iq(scene, n, n2, n3, n5, n6, n2 * 128 + 64 * n5, n3 * 128 + 64 * n6, n4, renderable, n7, false, n8, n9);
    }
    
    public static int method621(final int n, final int n2) {
        try {
            return class439.field3829[n & 0x3FFF];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dj.aw(" + ')');
        }
    }
    
    public int method621() {
        return 1074537579 * this.id;
    }
    
    static boolean method619(final String spec, final byte b) {
        try {
            if (spec != null) {
                try {
                    new URL(spec);
                }
                catch (MalformedURLException ex2) {
                    return false;
                }
                return true;
            }
            if (b == 3) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dj.an(" + ')');
        }
    }
    
    public int method619() {
        return 1074537579 * this.id;
    }
    
    @Override
    public int ac() {
        return 1074537579 * this.id;
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return 1074537579 * this.id;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dj.af(" + ')');
        }
    }
    
    static AttackOption[] ab() {
        return new AttackOption[] { AttackOption.field1073, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1070, AttackOption.AttackOption_hidden };
    }
    
    static AttackOption[] aq() {
        return new AttackOption[] { AttackOption.field1073, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1070, AttackOption.AttackOption_hidden };
    }
    
    public static void vg(final PlayerComposition playerComposition, final int n, final boolean b) {
        if (playerComposition == null) {
            playerComposition.bn();
            return;
        }
        if (n == 1 && 1 == playerComposition.npcTransformId * 1693987821) {
            return;
        }
        int n2 = playerComposition.field2841[PlayerComposition.equipmentIndices[n]];
        if (n2 == 0) {
            return;
        }
        n2 -= 256;
        KitDefinition kitDefinition_get;
        do {
            if (!b) {
                --n2;
                if (n2 < 0) {
                    n2 = KitDefinition.KitDefinition_fileCount * 743589639 - 1;
                }
            }
            else {
                ++n2;
                if (n2 >= 743589639 * KitDefinition.KitDefinition_fileCount) {
                    n2 = 0;
                }
            }
            kitDefinition_get = class100.KitDefinition_get(n2, -525315422);
        } while (null == kitDefinition_get || kitDefinition_get.nonSelectable || kitDefinition_get.bodypartID * 1015855167 != n + ((1 == playerComposition.npcTransformId * 1693987821) ? 7 : 0));
        playerComposition.field2841[PlayerComposition.equipmentIndices[n]] = 256 + n2;
        playerComposition.method1702(1418315210);
    }
}
