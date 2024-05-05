// 
// Decompiled by Procyon v0.5.36
// 

public class InvDefinition extends DualNode
{
    static AbstractArchive InvDefinition_archive;
    public int size;
    static EvictingDualNodeHashTable InvDefinition_cached;
    static final int al = 5;
    public static final int ay = 13;
    
    InvDefinition() {
        this.size = 0;
    }
    
    static {
        InvDefinition.InvDefinition_cached = new EvictingDualNodeHashTable(64);
    }
    
    static String method977(String str, final boolean b, final int n) {
        try {
            String s;
            if (b) {
                if (n <= -1332829556) {
                    throw new IllegalStateException();
                }
                s = "https://";
            }
            else {
                s = "http://";
            }
            final String str2 = s;
            if (Client.gameBuild * -1274626977 == 1) {
                if (n <= -1332829556) {
                    throw new IllegalStateException();
                }
                str += "-wtrc";
            }
            else if (Client.gameBuild * -1274626977 == 2) {
                if (n <= -1332829556) {
                    throw new IllegalStateException();
                }
                str += "-wtqa";
            }
            else if (3 == Client.gameBuild * -1274626977) {
                if (n <= -1332829556) {
                    throw new IllegalStateException();
                }
                str += "-wtwip";
            }
            else if (5 == -1274626977 * Client.gameBuild) {
                if (n <= -1332829556) {
                    throw new IllegalStateException();
                }
                str += "-wti";
            }
            else if (-1274626977 * Client.gameBuild == 4) {
                if (n <= -1332829556) {
                    throw new IllegalStateException();
                }
                str = "local";
            }
            String string = "";
            if (class108.param9 != null) {
                if (n <= -1332829556) {
                    throw new IllegalStateException();
                }
                string = "/p=" + class108.param9;
            }
            return str2 + str + "." + "runescape.com" + "/l=" + ClanSettings.clientLanguage + "/a=" + TriBool.field3738 * 1640118701 + string + "/";
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gl.nb(" + ')');
        }
    }
    
    static final void addNpcToMenu(final NPC npc, final int n, final int n2, final int n3, final short n4) {
        if (!Scene.lz(npc, false)) {
            return;
        }
        final int n5 = 25450;
        try {
            NPCComposition npcComposition = npc.definition;
            if (730065501 * Client.menuOptionsCount >= 400) {
                if (n5 <= 355) {}
            }
            else {
                if (npcComposition.transforms != null) {
                    if (n5 <= 355) {
                        throw new IllegalStateException();
                    }
                    npcComposition = NPCComposition.ur(npcComposition, 1935452776);
                }
                if (null == npcComposition) {
                    if (n5 <= 355) {
                        throw new IllegalStateException();
                    }
                }
                else if (!npcComposition.isInteractable) {
                    if (n5 <= 355) {}
                }
                else {
                    if (npcComposition.isFollower) {
                        if (n5 <= 355) {
                            throw new IllegalStateException();
                        }
                        if (n != Client.followerIndex * 2050107857) {
                            if (n5 <= 355) {
                                return;
                            }
                            return;
                        }
                    }
                    String str = NPC.zh(npc, -1379499313);
                    if (0 != 2062903815 * npcComposition.combatLevel && npc.dm * 674049519 != 0) {
                        int n6;
                        if (674049519 * npc.dm != -1) {
                            if (n5 <= 355) {
                                throw new IllegalStateException();
                            }
                            n6 = 674049519 * npc.dm;
                        }
                        else {
                            n6 = 2062903815 * npcComposition.combatLevel;
                        }
                        final int i = n6;
                        str = str + ItemContainer.method480(i, MusicPatchNode.localPlayer.combatLevel * 1302967875, (byte)123) + " " + class96.ac + Strings.gf + i + class96.au;
                    }
                    if (npcComposition.isFollower) {
                        if (n5 <= 355) {
                            throw new IllegalStateException();
                        }
                        if (Client.followerOpsLowPriority) {
                            if (n5 <= 355) {
                                throw new IllegalStateException();
                            }
                            MenuAction.insertMenuItemNoShift(Strings.gh, class383.method2081(16776960, 541533627) + str, 1003, n, n2, n3, (byte)44);
                        }
                    }
                    if (1 == -303899309 * Client.isItemSelected) {
                        if (n5 <= 355) {
                            throw new IllegalStateException();
                        }
                        MenuAction.insertMenuItemNoShift(Strings.gu, Client.field364 + " " + class96.ab + " " + class383.method2081(16776960, -1910736459) + str, 7, n, n2, n3, (byte)33);
                    }
                    else {
                        if (!Client.isSpellSelected) {
                            while (true) {
                                Label_1198: {
                                    if (!npcComposition.isFollower) {
                                        break Label_1198;
                                    }
                                    if (n5 <= 355) {
                                        throw new IllegalStateException();
                                    }
                                    if (!Client.followerOpsLowPriority) {
                                        break Label_1198;
                                    }
                                    if (n5 <= 355) {
                                        throw new IllegalStateException();
                                    }
                                    final int n7 = 2000;
                                    final int n8 = n7;
                                    final String[] actions = npcComposition.actions;
                                    if (actions != null) {
                                        if (n5 <= 355) {
                                            throw new IllegalStateException();
                                        }
                                        for (int j = 4; j >= 0; --j) {
                                            if (n5 <= 355) {
                                                throw new IllegalStateException();
                                            }
                                            if (!NPC.xu(npc, j, 1164667978)) {
                                                if (n5 <= 355) {
                                                    return;
                                                }
                                            }
                                            else if (null != actions[j] && !actions[j].equalsIgnoreCase(Strings.gy)) {
                                                if (n5 <= 355) {
                                                    throw new IllegalStateException();
                                                }
                                                int n9 = 0;
                                                if (j == 0) {
                                                    if (n5 <= 355) {
                                                        return;
                                                    }
                                                    n9 = 9 + n8;
                                                }
                                                if (j != 0) {
                                                    n9 = n8 + 10;
                                                }
                                                if (2 == j) {
                                                    n9 = n8 + 11;
                                                }
                                                if (j == 3) {
                                                    if (n5 <= 355) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n9 = 12 + n8;
                                                }
                                                if (4 == j) {
                                                    if (n5 <= 355) {
                                                        return;
                                                    }
                                                    n9 = n8 + 13;
                                                }
                                                MenuAction.insertMenuItemNoShift(actions[j], class383.method2081(16776960, 1704020693) + str, n9, n, n2, n3, (byte)61);
                                            }
                                        }
                                    }
                                    if (null != actions) {
                                        if (n5 <= 355) {
                                            throw new IllegalStateException();
                                        }
                                        for (int k = 4; k >= 0; --k) {
                                            if (n5 <= 355) {
                                                return;
                                            }
                                            if (!NPC.xu(npc, k, 1164667978)) {
                                                if (n5 <= 355) {
                                                    return;
                                                }
                                            }
                                            else if (actions[k] != null) {
                                                if (n5 <= 355) {
                                                    return;
                                                }
                                                if (actions[k].equalsIgnoreCase(Strings.gy)) {
                                                    int n10 = 0;
                                                    if (AttackOption.AttackOption_hidden == Client.npcAttackOption) {
                                                        if (n5 <= 355) {
                                                            return;
                                                        }
                                                    }
                                                    else {
                                                        Label_1192: {
                                                            if (AttackOption.AttackOption_alwaysRightClick != Client.npcAttackOption) {
                                                                if (n5 <= 355) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                if (Client.npcAttackOption != AttackOption.AttackOption_dependsOnCombatLevels) {
                                                                    break Label_1192;
                                                                }
                                                                if (n5 <= 355) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                if (npcComposition.combatLevel * 2062903815 <= MusicPatchNode.localPlayer.combatLevel * 1302967875) {
                                                                    break Label_1192;
                                                                }
                                                                if (n5 <= 355) {
                                                                    throw new IllegalStateException();
                                                                }
                                                            }
                                                            n10 = 2000;
                                                        }
                                                        int n11 = 0;
                                                        if (k == 0) {
                                                            if (n5 <= 355) {
                                                                return;
                                                            }
                                                            n11 = 9 + n10;
                                                        }
                                                        if (k != 0) {
                                                            if (n5 <= 355) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n11 = n10 + 10;
                                                        }
                                                        if (2 == k) {
                                                            if (n5 <= 355) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n11 = n10 + 11;
                                                        }
                                                        if (3 == k) {
                                                            if (n5 <= 355) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n11 = 12 + n10;
                                                        }
                                                        if (4 == k) {
                                                            if (n5 <= 355) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n11 = n10 + 13;
                                                        }
                                                        MenuAction.insertMenuItemNoShift(actions[k], class383.method2081(16776960, -632401451) + str, n11, n, n2, n3, (byte)42);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!npcComposition.isFollower || !Client.followerOpsLowPriority) {
                                        MenuAction.insertMenuItemNoShift(Strings.gh, class383.method2081(16776960, 179993493) + str, 1003, n, n2, n3, (byte)51);
                                        return;
                                    }
                                    return;
                                }
                                final int n7 = 0;
                                continue;
                            }
                        }
                        if (n5 <= 355) {
                            throw new IllegalStateException();
                        }
                        if (0x2 == (1457791911 * SecureRandomFuture.selectedSpellFlags & 0x2)) {
                            if (n5 <= 355) {
                                throw new IllegalStateException();
                            }
                            MenuAction.insertMenuItemNoShift(Client.field530, Client.field522 + " " + class96.ab + " " + class383.method2081(16776960, 169155857) + str, 8, n, n2, n3, (byte)57);
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gl.lf(" + ')');
        }
    }
    
    void ao(final Buffer buffer, final int n) {
        if (2 == n) {
            this.size = buffer.readUnsignedShort(-317429625) * -28904041;
        }
    }
    
    void at(final Buffer buffer) {
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            gk(this, buffer, ra, -409502218);
        }
    }
    
    public static Model rf(final ObjectComposition objectComposition, final int n, final int n2, final int[][] array, final int n3, final int n4, final int n5) {
        long n6;
        if (null == objectComposition.models) {
            n6 = (995495977 * objectComposition.id << 10) + n2;
        }
        else {
            n6 = (objectComposition.id * 1929349323 << 10) + (n << 3) + n2;
        }
        Model model = (Model)ObjectComposition.ObjectDefinition_cachedModels.wr(n6);
        if (model == null) {
            final ModelData modelData = objectComposition.getModelData(n, n2, -1717747182);
            if (modelData == null) {
                return null;
            }
            model = modelData.dg(objectComposition.ambient * 1284125631 + 119179726, -834072137 + -18088891 * objectComposition.contrast, -50, -1373238886, -50);
            ObjectComposition.ObjectDefinition_cachedModels.put(model, n6);
        }
        if (objectComposition.clipType * -1437543955 >= 0) {
            model = model.bp(array, n3, n4, n5, true, -1437543955 * objectComposition.clipType);
        }
        return model;
    }
    
    void ay(final Buffer buffer, final int n) {
        if (2 == n) {
            this.size = buffer.readUnsignedShort(557268911) * -28904041;
        }
    }
    
    public static boolean method978(final byte b) {
        try {
            boolean b2;
            if (Client.clickedWidget != null) {
                if (b >= 0) {
                    throw new IllegalStateException();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gl.ok(" + ')');
        }
    }
    
    void decode(final Buffer buffer, final byte b) {
        try {
            while (true) {
                final int ra = Buffer.ra(buffer, (byte)7);
                if (ra == 0) {
                    break;
                }
                gk(this, buffer, ra, 64174481);
            }
            if (b != 1) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gl.aw(" + ')');
        }
    }
    
    public static InvDefinition al(final int n) {
        final InvDefinition invDefinition = (InvDefinition)InvDefinition.InvDefinition_cached.wr(n);
        if (null != invDefinition) {
            return invDefinition;
        }
        final byte[] takeFile = InvDefinition.InvDefinition_archive.takeFile(5, n, (byte)(-58));
        final InvDefinition invDefinition2 = new InvDefinition();
        if (takeFile != null) {
            invDefinition2.decode(new Buffer(takeFile), (byte)1);
        }
        InvDefinition.InvDefinition_cached.put(invDefinition2, n);
        return invDefinition2;
    }
    
    void decodeNext(final Buffer buffer, final int n, final int n2) {
        try {
            if (2 == n) {
                if (n2 == 1753266632) {
                    throw new IllegalStateException();
                }
                this.size = buffer.method2518(-175880804) * -28904041;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gl.ac(" + ')');
        }
    }
    
    public static void gk(final InvDefinition invDefinition, final Buffer buffer, final int n, final int n2) {
        if (invDefinition == null) {
            invDefinition.decodeNext(buffer, n, n);
        }
        try {
            if (2 == n) {
                if (n2 == 1753266632) {
                    throw new IllegalStateException();
                }
                invDefinition.size = buffer.readUnsignedShort(-175880804) * -28904041;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "gl.ac(" + ')');
        }
    }
    
    public static void au(final AbstractArchive invDefinition_archive) {
        InvDefinition.InvDefinition_archive = invDefinition_archive;
    }
    
    public static void ab(final AbstractArchive invDefinition_archive) {
        InvDefinition.InvDefinition_archive = invDefinition_archive;
    }
    
    public static InvDefinition aq(final int n) {
        final InvDefinition invDefinition = (InvDefinition)InvDefinition.InvDefinition_cached.wr(n);
        if (null != invDefinition) {
            return invDefinition;
        }
        final byte[] takeFile = InvDefinition.InvDefinition_archive.takeFile(5, n, (byte)(-29));
        final InvDefinition invDefinition2 = new InvDefinition();
        if (takeFile != null) {
            invDefinition2.decode(new Buffer(takeFile), (byte)1);
        }
        InvDefinition.InvDefinition_cached.put(invDefinition2, n);
        return invDefinition2;
    }
    
    public static void vp(final InvDefinition invDefinition, final Buffer buffer) {
        if (invDefinition == null) {
            invDefinition.at(buffer);
            return;
        }
        while (true) {
            final int ra = Buffer.ra(buffer, (byte)7);
            if (ra == 0) {
                break;
            }
            gk(invDefinition, buffer, ra, -409502218);
        }
    }
    
    public static Node xf(final IterableNodeHashTable iterableNodeHashTable) {
        if (iterableNodeHashTable == null) {
            return iterableNodeHashTable.first();
        }
        iterableNodeHashTable.index = 0;
        return IterableNodeHashTable.ow(iterableNodeHashTable);
    }
    
    public static Widget qm(final class205 class205) {
        if (class205 == null) {
            class205.aj();
        }
        return class205.field1850;
    }
}
