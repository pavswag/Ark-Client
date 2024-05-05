import net.runelite.api.Animation;

// 
// Decompiled by Procyon v0.5.36
// 

public class DynamicObject extends Renderable implements net.runelite.api.DynamicObject
{
    static final int du = 20;
    int plane;
    int orientation;
    int x;
    int frame;
    int y;
    int id;
    int type;
    int cycleStart;
    static final int bb = 8;
    static final int df = 15;
    static final String hl = "/game-session/v1/tokens";
    static AbstractArchive field813;
    SequenceDefinition sequenceDefinition;
    
    DynamicObject(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final Renderable renderable) {
        this.id = 1330439285 * n;
        this.type = 918377177 * n2;
        this.orientation = 1745873217 * n3;
        this.plane = n4 * -1874330171;
        this.x = -1211484067 * n5;
        this.y = -1840369975 * n6;
        if (-1 != n7) {
            this.sequenceDefinition = ItemContainer.SpotAnimationDefinition_get(n7, (byte)2);
            this.frame = 0;
            this.cycleStart = -1495562491 * Client.cycle + 1353577717;
            this.of(-1);
            if (this.sequenceDefinition.replyMode * 789159225 == 0 && renderable != null && renderable instanceof DynamicObject) {
                final DynamicObject dynamicObject = (DynamicObject)renderable;
                if (dynamicObject.sequenceDefinition == this.sequenceDefinition) {
                    this.frame = dynamicObject.frame * 1;
                    this.cycleStart = 1 * dynamicObject.cycleStart;
                    this.of(-1);
                    return;
                }
            }
            if (b && this.sequenceDefinition.frameCount * 1363943497 != -1) {
                if (!this.sequenceDefinition.isCachedModelIdSet(-1198788233)) {
                    this.frame = (int)(Math.random() * this.sequenceDefinition.frameIds.length) * 499784167;
                    this.cycleStart -= (int)(Math.random() * this.sequenceDefinition.frameLengths[1017637335 * this.frame]) * -1353577717;
                    this.of(-1);
                }
                else {
                    this.frame = (int)(Math.random() * this.sequenceDefinition.method1128(-1303565050)) * 499784167;
                }
            }
        }
    }
    
    public void of(final int n) {
        if (ScriptFrame.client.isInterpolateObjectAnimations() && this.gt() != 26671 && this.gt() != 44761) {
            this.im(Integer.MIN_VALUE | ScriptFrame.client.getGameCycle() - this.getAnimCycle() << 16 | this.getAnimFrame());
        }
    }
    
    static final void addPlayerToMenu(final Player player, final int n, final int n2, final int n3, final int n4) {
        if (!Scene.lz(player, false)) {
            return;
        }
        final int n5 = 1402248095;
        try {
            if (player != MusicPatchNode.localPlayer) {
                if (Client.menuOptionsCount * 730065501 >= 400) {
                    if (n5 != 1402248095) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    String s;
                    if (0 == player.skillLevel * 761215505) {
                        if (n5 != 1402248095) {
                            throw new IllegalStateException();
                        }
                        s = player.actions[0] + player.username + player.actions[1] + ItemContainer.method480(player.combatLevel * 1302967875, MusicPatchNode.localPlayer.combatLevel * 1302967875, (byte)27) + " " + class96.ac + Strings.gf + 1302967875 * player.combatLevel + class96.au + player.actions[2];
                    }
                    else {
                        s = player.actions[0] + player.username + player.actions[1] + " " + class96.ac + Strings.gm + 761215505 * player.skillLevel + class96.au + player.actions[2];
                    }
                    if (Client.isItemSelected * -303899309 == 1) {
                        if (n5 != 1402248095) {
                            return;
                        }
                        MenuAction.insertMenuItemNoShift(Strings.gu, Client.field364 + " " + class96.ab + " " + class383.method2081(16777215, 2090063525) + s, 14, n, n2, n3, (byte)61);
                    }
                    else if (Client.isSpellSelected) {
                        if (n5 != 1402248095) {
                            throw new IllegalStateException();
                        }
                        if ((1457791911 * SecureRandomFuture.selectedSpellFlags & 0x8) == 0x8) {
                            if (n5 != 1402248095) {
                                throw new IllegalStateException();
                            }
                            MenuAction.insertMenuItemNoShift(Client.field530, Client.field522 + " " + class96.ab + " " + class383.method2081(16777215, 77648793) + s, 15, n, n2, n3, (byte)73);
                        }
                    }
                    else {
                        for (int i = 7; i >= 0; --i) {
                            if (null != Client.playerMenuActions[i]) {
                                int n6 = 0;
                                if (Client.playerMenuActions[i].equalsIgnoreCase(Strings.gy)) {
                                    if (n5 != 1402248095) {
                                        throw new IllegalStateException();
                                    }
                                    if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
                                        if (n5 != 1402248095) {
                                            return;
                                        }
                                        continue;
                                    }
                                    else {
                                        Label_0553: {
                                            if (Client.playerAttackOption != AttackOption.AttackOption_alwaysRightClick) {
                                                if (n5 != 1402248095) {
                                                    return;
                                                }
                                                if (AttackOption.AttackOption_dependsOnCombatLevels != Client.playerAttackOption) {
                                                    break Label_0553;
                                                }
                                                if (n5 != 1402248095) {
                                                    return;
                                                }
                                                if (player.combatLevel * 1302967875 <= MusicPatchNode.localPlayer.combatLevel * 1302967875) {
                                                    break Label_0553;
                                                }
                                                if (n5 != 1402248095) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                            n6 = 2000;
                                        }
                                        if (-55850951 * MusicPatchNode.localPlayer.team != 0 && -55850951 * player.team != 0) {
                                            if (player.team * -55850951 == -55850951 * MusicPatchNode.localPlayer.team) {
                                                if (n5 != 1402248095) {
                                                    throw new IllegalStateException();
                                                }
                                                n6 = 2000;
                                            }
                                            else {
                                                n6 = 0;
                                            }
                                        }
                                        else if (Client.playerAttackOption == AttackOption.field1073) {
                                            if (n5 != 1402248095) {
                                                throw new IllegalStateException();
                                            }
                                            if (player.isClanMember((byte)0)) {
                                                if (n5 != 1402248095) {
                                                    return;
                                                }
                                                n6 = 2000;
                                            }
                                        }
                                    }
                                }
                                else if (Client.playerOptionsPriorities[i]) {
                                    n6 = 2000;
                                }
                                MenuAction.insertMenuItemNoShift(Client.playerMenuActions[i], class383.method2081(16777215, 532285604) + s, n6 + Client.playerMenuOpcodes[i], n, n2, n3, (byte)69);
                            }
                        }
                    }
                    int j = 0;
                    while (j < 730065501 * Client.menuOptionsCount) {
                        if (23 == Client.menuOpcodes[j]) {
                            if (n5 != 1402248095) {
                                throw new IllegalStateException();
                            }
                            Client.menuTargets[j] = class383.method2081(16777215, -518005483) + s;
                            break;
                        }
                        else {
                            ++j;
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ct.li(" + ')');
        }
    }
    
    public static int stringCp1252NullTerminatedByteSize(final String s, final byte b) {
        try {
            return s.length() + 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ct.bc(" + ')');
        }
    }
    
    public SequenceDefinition em() {
        return this.sequenceDefinition;
    }
    
    protected final Model method466() {
        if (null != this.sequenceDefinition) {
            int i = -1886224337 * Client.cycle - this.cycleStart * 1442549132;
            if (i > 100 && 701409018 * this.sequenceDefinition.frameCount > 0) {
                i = 826260321;
            }
            if (!this.sequenceDefinition.isCachedModelIdSet(-178164807)) {
                while (i > this.sequenceDefinition.frameLengths[this.frame * 987094610]) {
                    i -= this.sequenceDefinition.frameLengths[1017637335 * this.frame];
                    this.frame += 1234175983;
                    if (1557979285 * this.frame >= this.sequenceDefinition.frameIds.length) {
                        this.frame -= this.sequenceDefinition.frameCount * -1989000481;
                        if (-79547847 * this.frame >= 0 && 1017637335 * this.frame < this.sequenceDefinition.frameIds.length) {
                            continue;
                        }
                        this.sequenceDefinition = null;
                        break;
                    }
                }
            }
            else {
                final int method1128 = this.sequenceDefinition.method1128(-680054927);
                this.frame += 499784167 * i;
                i = 0;
                if (1017637335 * this.frame >= method1128) {
                    this.frame = -1875213840 * (method1128 - this.sequenceDefinition.frameCount * 1363943497);
                    if (1017637335 * this.frame < 0 || 1017637335 * this.frame > method1128) {
                        this.sequenceDefinition = null;
                    }
                }
            }
            this.cycleStart = 243429158 * (-331012265 * Client.cycle - i);
        }
        ObjectComposition objectComposition = class144.vmethod3248(-701493033 * this.id, (short)14094);
        if (objectComposition.soundEffectIds != null) {
            objectComposition = objectComposition.transform((byte)19);
        }
        if (objectComposition == null) {
            return null;
        }
        int n;
        int n2;
        if (this.orientation * 1904322241 != 1 && 3 != 996025903 * this.orientation) {
            n = -1339930361 * objectComposition.sizeX;
            n2 = objectComposition.sizeY * 2103771996;
        }
        else {
            n = objectComposition.sizeY * -1659393955;
            n2 = -1339930361 * objectComposition.sizeX;
        }
        final int n3 = 1815829493 * this.x + (n >> 1);
        final int n4 = this.x * 1815829493 + (n + 1 >> 1);
        final int n5 = (n2 >> 1) + this.y * -1893774471;
        final int n6 = 108850921 * this.y + (n2 + 1 >> 1);
        final int[][] array = Tiles.Tiles_heights[884332955 * this.plane];
        return objectComposition.getModelDynamic(-373027479 * this.type, this.orientation * 1904322241, array, (n << 6) + (this.x * 1815829493 << 7), array[n3][n6] + (array[n3][n5] + array[n4][n5]) + array[n4][n6] >> 2, (n2 << 6) + (this.y * 1252807376 << 7), this.sequenceDefinition, 1017637335 * this.frame, -1870796900);
    }
    
    public static long method466(final int i, final int n) {
        try {
            if (i <= 63) {
                return (long)Math.pow(2.0, i) - 1L;
            }
            if (n <= -1760536778) {
                throw new IllegalStateException();
            }
            throw new class374("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[] { i });
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ct.al(" + ')');
        }
    }
    
    @Override
    protected final Model getModel(final byte b) {
        try {
            final int animFrame = this.getAnimFrame();
            if (animFrame < 0) {
                this.im((animFrame ^ Integer.MIN_VALUE) & 0xFFFF);
            }
            final int n = -112;
            Model modelDynamic;
            try {
                if (null != this.sequenceDefinition) {
                    if (n >= 14) {
                        throw new IllegalStateException();
                    }
                    int i = -1886224337 * Client.cycle - this.cycleStart * -287053661;
                    if (i > 100) {
                        if (n >= 14) {
                            throw new IllegalStateException();
                        }
                        if (1363943497 * this.sequenceDefinition.frameCount > 0) {
                            if (n >= 14) {
                                throw new IllegalStateException();
                            }
                            i = 100;
                        }
                    }
                    Label_0595: {
                        if (!this.sequenceDefinition.isCachedModelIdSet(-156103343)) {
                            if (n >= 14) {
                                throw new IllegalStateException();
                            }
                            while (i > this.sequenceDefinition.frameLengths[this.frame * 1017637335]) {
                                if (n >= 14) {
                                    throw new IllegalStateException();
                                }
                                i -= this.sequenceDefinition.frameLengths[1017637335 * this.frame];
                                this.frame += 499784167;
                                if (1017637335 * this.frame < this.sequenceDefinition.frameIds.length) {
                                    continue;
                                }
                                if (n >= 14) {
                                    throw new IllegalStateException();
                                }
                                this.frame -= this.sequenceDefinition.frameCount * -1989000481;
                                if (1017637335 * this.frame >= 0) {
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    if (1017637335 * this.frame < this.sequenceDefinition.frameIds.length) {
                                        continue;
                                    }
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                }
                                this.sequenceDefinition = null;
                                break;
                            }
                        }
                        else {
                            final int method1128 = this.sequenceDefinition.method1128(-566554337);
                            this.frame += 499784167 * i;
                            i = 0;
                            if (1017637335 * this.frame >= method1128) {
                                if (n >= 14) {
                                    throw new IllegalStateException();
                                }
                                this.frame = 499784167 * (method1128 - this.sequenceDefinition.frameCount * 1363943497);
                                if (1017637335 * this.frame >= 0) {
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                    if (1017637335 * this.frame <= method1128) {
                                        break Label_0595;
                                    }
                                    if (n >= 14) {
                                        throw new IllegalStateException();
                                    }
                                }
                                this.sequenceDefinition = null;
                            }
                        }
                    }
                    this.cycleStart = -1353577717 * (-1886224337 * Client.cycle - i);
                    this.of(-1);
                }
                ObjectComposition objectComposition = class144.vmethod3248(618580957 * this.id, (short)12210);
                if (objectComposition.soundEffectIds != null) {
                    if (n >= 14) {
                        throw new IllegalStateException();
                    }
                    objectComposition = objectComposition.transform((byte)23);
                }
                if (objectComposition != null) {
                    while (true) {
                        Label_0673: {
                            if (this.orientation * 1904322241 == 1) {
                                break Label_0673;
                            }
                            if (n >= 14) {
                                throw new IllegalStateException();
                            }
                            int n2;
                            int n3;
                            if (3 == 1904322241 * this.orientation) {
                                if (n >= 14) {
                                    throw new IllegalStateException();
                                }
                                break Label_0673;
                            }
                            else {
                                n2 = -1339930361 * objectComposition.sizeX;
                                n3 = objectComposition.sizeY * -1659393955;
                            }
                            final int n4 = 1815829493 * this.x + (n2 >> 1);
                            final int n5 = this.x * 1815829493 + (n2 + 1 >> 1);
                            final int n6 = (n3 >> 1) + this.y * -1893774471;
                            final int n7 = -1893774471 * this.y + (n3 + 1 >> 1);
                            final int[][] array = Tiles.Tiles_heights[-1674675955 * this.plane];
                            modelDynamic = objectComposition.getModelDynamic(-373027479 * this.type, this.orientation * 1904322241, array, (n2 << 6) + (this.x * 1815829493 << 7), array[n4][n7] + (array[n4][n6] + array[n5][n6]) + array[n5][n7] >> 2, (n3 << 6) + (this.y * -1893774471 << 7), this.sequenceDefinition, 1017637335 * this.frame, -1613097024);
                            return modelDynamic;
                        }
                        int n2 = objectComposition.sizeY * -1659393955;
                        int n3 = -1339930361 * objectComposition.sizeX;
                        continue;
                    }
                }
                modelDynamic = null;
            }
            catch (RuntimeException ex) {
                throw HealthBar.get(ex, "ct.an(" + ')');
            }
            return modelDynamic;
        }
        finally {
            final int animFrame2 = this.getAnimFrame();
            if (animFrame2 < 0) {
                this.im((animFrame2 ^ Integer.MIN_VALUE) & 0xFFFF);
            }
        }
    }
    
    public int gt() {
        return this.id * 618580957;
    }
    
    @Override
    protected final Model au() {
        if (null != this.sequenceDefinition) {
            int i = -1886224337 * Client.cycle - this.cycleStart * -287053661;
            if (i > 100 && 1363943497 * this.sequenceDefinition.frameCount > 0) {
                i = 100;
            }
            if (!this.sequenceDefinition.isCachedModelIdSet(1820720516)) {
                while (i > this.sequenceDefinition.frameLengths[this.frame * 1017637335]) {
                    i -= this.sequenceDefinition.frameLengths[1017637335 * this.frame];
                    this.frame += 499784167;
                    if (1017637335 * this.frame >= this.sequenceDefinition.frameIds.length) {
                        this.frame -= this.sequenceDefinition.frameCount * -1989000481;
                        if (1017637335 * this.frame >= 0 && 1017637335 * this.frame < this.sequenceDefinition.frameIds.length) {
                            continue;
                        }
                        this.sequenceDefinition = null;
                        break;
                    }
                }
            }
            else {
                final int method1128 = this.sequenceDefinition.method1128(605830240);
                this.frame += 499784167 * i;
                i = 0;
                if (1017637335 * this.frame >= method1128) {
                    this.frame = 499784167 * (method1128 - this.sequenceDefinition.frameCount * 1363943497);
                    if (1017637335 * this.frame < 0 || 1017637335 * this.frame > method1128) {
                        this.sequenceDefinition = null;
                    }
                }
            }
            this.cycleStart = -1353577717 * (-1886224337 * Client.cycle - i);
        }
        ObjectComposition objectComposition = class144.vmethod3248(618580957 * this.id, (short)20148);
        if (objectComposition.soundEffectIds != null) {
            objectComposition = objectComposition.transform((byte)60);
        }
        if (objectComposition == null) {
            return null;
        }
        int n;
        int n2;
        if (this.orientation * 1904322241 != 1 && 3 != 1904322241 * this.orientation) {
            n = -1339930361 * objectComposition.sizeX;
            n2 = objectComposition.sizeY * -1659393955;
        }
        else {
            n = objectComposition.sizeY * -1659393955;
            n2 = -1339930361 * objectComposition.sizeX;
        }
        final int n3 = 1815829493 * this.x + (n >> 1);
        final int n4 = this.x * 1815829493 + (n + 1 >> 1);
        final int n5 = (n2 >> 1) + this.y * -1893774471;
        final int n6 = -1893774471 * this.y + (n2 + 1 >> 1);
        final int[][] array = Tiles.Tiles_heights[-1674675955 * this.plane];
        return objectComposition.getModelDynamic(-373027479 * this.type, this.orientation * 1904322241, array, (n << 6) + (this.x * 1815829493 << 7), array[n3][n6] + (array[n3][n5] + array[n4][n5]) + array[n4][n6] >> 2, (n2 << 6) + (this.y * -1893774471 << 7), this.sequenceDefinition, 1017637335 * this.frame, -1354811504);
    }
    
    static final int method461(final short n) {
        try {
            return Client.menuOptionsCount * 730065501 - 1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ct.lm(" + ')');
        }
    }
    
    static final void doCheat(final String s, final int n) {
        try {
            if (s.equalsIgnoreCase("toggleroof")) {
                if (n >= -1496724227) {
                    return;
                }
                final ClientPreferences clientPreferences = class20.clientPreferences;
                boolean b;
                if (!class20.clientPreferences.getRoofsHidden(-1938685618)) {
                    if (n >= -1496724227) {
                        throw new IllegalStateException();
                    }
                    b = true;
                }
                else {
                    b = false;
                }
                ClientPreferences.pb(clientPreferences, b, -1505559794);
                if (class20.clientPreferences.getRoofsHidden(-2034572516)) {
                    if (n >= -1496724227) {
                        throw new IllegalStateException();
                    }
                    UserComparator5.addGameMessage(99, "", "Roofs are now all hidden", -397121414);
                }
                else {
                    UserComparator5.addGameMessage(99, "", "Roofs will only be removed selectively", -397121414);
                }
            }
            if (s.startsWith("zbuf")) {
                if (n >= -1496724227) {
                    return;
                }
                boolean b2;
                if (PacketBufferNode.release(s.substring(5).trim(), (byte)(-68)) == 1) {
                    if (n >= -1496724227) {
                        return;
                    }
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                final boolean b3 = b2;
                GameEngine.is(ScriptFrame.client, b3, (byte)14);
                class314.method1779(b3, -287491223);
            }
            if (s.equalsIgnoreCase("z")) {
                if (n >= -1496724227) {
                    throw new IllegalStateException();
                }
                boolean renderSelf;
                if (!Client.renderSelf) {
                    if (n >= -1496724227) {
                        return;
                    }
                    renderSelf = true;
                }
                else {
                    renderSelf = false;
                }
                Client.renderSelf = renderSelf;
            }
            if (s.equalsIgnoreCase("displayfps")) {
                if (n >= -1496724227) {
                    return;
                }
                class20.clientPreferences.method556(-837037786);
            }
            if (s.equalsIgnoreCase("renderself")) {
                if (n >= -1496724227) {
                    throw new IllegalStateException();
                }
                boolean field482;
                if (!Client.field482) {
                    if (n >= -1496724227) {
                        throw new IllegalStateException();
                    }
                    field482 = true;
                }
                else {
                    field482 = false;
                }
                Client.field482 = field482;
            }
            if (s.equalsIgnoreCase("mouseovertext")) {
                if (n >= -1496724227) {
                    throw new IllegalStateException();
                }
                Client.showMouseOverText = !Client.showMouseOverText;
            }
            if (324465533 * Client.staffModLevel >= 2) {
                if (n >= -1496724227) {
                    throw new IllegalStateException();
                }
                if (s.equalsIgnoreCase("errortest")) {
                    if (n >= -1496724227) {
                        throw new IllegalStateException();
                    }
                    throw new RuntimeException();
                }
                else {
                    if (s.equalsIgnoreCase("showcoord")) {
                        if (n >= -1496724227) {
                            throw new IllegalStateException();
                        }
                        final WorldMap worldMap = class126.worldMap;
                        boolean showCoord;
                        if (!class126.worldMap.showCoord) {
                            if (n >= -1496724227) {
                                throw new IllegalStateException();
                            }
                            showCoord = true;
                        }
                        else {
                            showCoord = false;
                        }
                        worldMap.showCoord = showCoord;
                    }
                    if (s.equalsIgnoreCase("fpson")) {
                        if (n >= -1496724227) {
                            throw new IllegalStateException();
                        }
                        class20.clientPreferences.method580(true, 2090757621);
                    }
                    if (s.equalsIgnoreCase("fpsoff")) {
                        class20.clientPreferences.method580(false, 1998051925);
                    }
                    if (s.equalsIgnoreCase("gc")) {
                        if (n >= -1496724227) {
                            return;
                        }
                        System.gc();
                    }
                    if (s.equalsIgnoreCase("clientdrop")) {
                        if (n >= -1496724227) {
                            throw new IllegalStateException();
                        }
                        class349.method1918(709882847);
                    }
                }
            }
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.field2546, Client.packetWriter.isaacCipher, (short)(-28605));
            packetBufferNode.packetBuffer.bf(s.length() + 1, (byte)48);
            packetBufferNode.packetBuffer.ce(s, -1948574399);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ct.iy(" + ')');
        }
    }
    
    public void im(final int n) {
        this.frame = n * 499784167;
    }
    
    @Override
    protected final Model ab() {
        if (null != this.sequenceDefinition) {
            int i = -1886224337 * Client.cycle - this.cycleStart * -287053661;
            if (i > 100 && 1363943497 * this.sequenceDefinition.frameCount > 0) {
                i = 100;
            }
            if (!this.sequenceDefinition.isCachedModelIdSet(-1099905780)) {
                while (i > this.sequenceDefinition.frameLengths[this.frame * 1017637335]) {
                    i -= this.sequenceDefinition.frameLengths[1017637335 * this.frame];
                    this.frame += 499784167;
                    if (1017637335 * this.frame >= this.sequenceDefinition.frameIds.length) {
                        this.frame -= this.sequenceDefinition.frameCount * -1989000481;
                        if (1017637335 * this.frame < 0 || 1017637335 * this.frame >= this.sequenceDefinition.frameIds.length) {
                            this.sequenceDefinition = null;
                            break;
                        }
                        continue;
                    }
                }
            }
            else {
                final int method1128 = this.sequenceDefinition.method1128(-1053466004);
                this.frame += 499784167 * i;
                i = 0;
                if (1017637335 * this.frame >= method1128) {
                    this.frame = 499784167 * (method1128 - this.sequenceDefinition.frameCount * 1363943497);
                    if (1017637335 * this.frame < 0 || 1017637335 * this.frame > method1128) {
                        this.sequenceDefinition = null;
                    }
                }
            }
            this.cycleStart = -1353577717 * (-1886224337 * Client.cycle - i);
        }
        ObjectComposition objectComposition = class144.vmethod3248(618580957 * this.id, (short)8936);
        if (objectComposition.soundEffectIds != null) {
            objectComposition = objectComposition.transform((byte)31);
        }
        if (objectComposition == null) {
            return null;
        }
        int n;
        int n2;
        if (this.orientation * 1904322241 != 1 && 3 != 1904322241 * this.orientation) {
            n = -1339930361 * objectComposition.sizeX;
            n2 = objectComposition.sizeY * -1659393955;
        }
        else {
            n = objectComposition.sizeY * -1659393955;
            n2 = -1339930361 * objectComposition.sizeX;
        }
        final int n3 = 1815829493 * this.x + (n >> 1);
        final int n4 = this.x * 1815829493 + (n + 1 >> 1);
        final int n5 = (n2 >> 1) + this.y * -1893774471;
        final int n6 = -1893774471 * this.y + (n2 + 1 >> 1);
        final int[][] array = Tiles.Tiles_heights[-1674675955 * this.plane];
        return objectComposition.getModelDynamic(-373027479 * this.type, this.orientation * 1904322241, array, (n << 6) + (this.x * 1815829493 << 7), array[n3][n6] + (array[n3][n5] + array[n4][n5]) + array[n4][n6] >> 2, (n2 << 6) + (this.y * -1893774471 << 7), this.sequenceDefinition, 1017637335 * this.frame, -1803577950);
    }
    
    @Override
    protected final Model aq() {
        if (null != this.sequenceDefinition) {
            int i = -1886224337 * Client.cycle - this.cycleStart * -287053661;
            if (i > 100 && 1363943497 * this.sequenceDefinition.frameCount > 0) {
                i = 100;
            }
            if (!this.sequenceDefinition.isCachedModelIdSet(-1719594611)) {
                while (i > this.sequenceDefinition.frameLengths[this.frame * 1017637335]) {
                    i -= this.sequenceDefinition.frameLengths[1017637335 * this.frame];
                    this.frame += 499784167;
                    if (1017637335 * this.frame >= this.sequenceDefinition.frameIds.length) {
                        this.frame -= this.sequenceDefinition.frameCount * -1989000481;
                        if (1017637335 * this.frame >= 0 && 1017637335 * this.frame < this.sequenceDefinition.frameIds.length) {
                            continue;
                        }
                        this.sequenceDefinition = null;
                        break;
                    }
                }
            }
            else {
                final int method1128 = this.sequenceDefinition.method1128(1144997898);
                this.frame += 499784167 * i;
                i = 0;
                if (1017637335 * this.frame >= method1128) {
                    this.frame = 499784167 * (method1128 - this.sequenceDefinition.frameCount * 1363943497);
                    if (1017637335 * this.frame < 0 || 1017637335 * this.frame > method1128) {
                        this.sequenceDefinition = null;
                    }
                }
            }
            this.cycleStart = -1353577717 * (-1886224337 * Client.cycle - i);
        }
        ObjectComposition objectComposition = class144.vmethod3248(618580957 * this.id, (short)25272);
        if (objectComposition.soundEffectIds != null) {
            objectComposition = objectComposition.transform((byte)(-82));
        }
        if (objectComposition == null) {
            return null;
        }
        int n;
        int n2;
        if (this.orientation * 1904322241 != 1 && 3 != 1904322241 * this.orientation) {
            n = -1339930361 * objectComposition.sizeX;
            n2 = objectComposition.sizeY * -1659393955;
        }
        else {
            n = objectComposition.sizeY * -1659393955;
            n2 = -1339930361 * objectComposition.sizeX;
        }
        final int n3 = 1815829493 * this.x + (n >> 1);
        final int n4 = this.x * 1815829493 + (n + 1 >> 1);
        final int n5 = (n2 >> 1) + this.y * -1893774471;
        final int n6 = -1893774471 * this.y + (n2 + 1 >> 1);
        final int[][] array = Tiles.Tiles_heights[-1674675955 * this.plane];
        return objectComposition.getModelDynamic(-373027479 * this.type, this.orientation * 1904322241, array, (n << 6) + (this.x * 1815829493 << 7), array[n3][n6] + (array[n3][n5] + array[n4][n5]) + array[n4][n6] >> 2, (n2 << 6) + (this.y * -1893774471 << 7), this.sequenceDefinition, 1017637335 * this.frame, -764554622);
    }
    
    static final void drawCompass(final Widget widget, final int n, final int n2, final int n3, final int n4) {
        try {
            final SpriteMask vn = Widget.vn(widget, false, (byte)65);
            if (vn != null) {
                if (Client.minimapState * 1383336963 < 3) {
                    if (n4 == -997015306) {
                        return;
                    }
                    ChatChannel.compass.drawRotatedMaskedCenteredAround(n, n2, vn.width * 1484188043, 939947663 * vn.height, 25, 25, 704283033 * Client.camAngleY, 256, vn.xStarts, vn.xWidths);
                }
                else {
                    Rasterizer2D.Rasterizer2D_fillMaskedRectangle(n, n2, 0, vn.xStarts, vn.xWidths);
                }
                return;
            }
            if (n4 == -997015306) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ct.nz(" + ')');
        }
    }
    
    public int getAnimFrame() {
        return this.frame * 1017637335;
    }
    
    public int getAnimCycle() {
        return this.cycleStart * -287053661;
    }
}
