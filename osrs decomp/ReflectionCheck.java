import net.runelite.api.events.AnimationChanged;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.5.36
// 

public class ReflectionCheck extends Node
{
    Field[] field158;
    int size;
    int[] operations;
    int[] creationErrors;
    int id;
    int[] intReplaceValues;
    Method[] methods;
    byte[][][] arguments;
    static int field166;
    protected static String field167;
    static final int bz = 8;
    
    ReflectionCheck() {
    }
    
    static final void updateRootInterface(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        try {
            if (SoundSystem.loadInterface(n, 1376777516)) {
                ViewportMouse.updateInterface(VerticalAlignment.Widget_interfaceComponents[n], -1, n2, n3, n4, n5, n6, n7, 1611526345);
                return;
            }
            if (n8 != -631543188) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bj.mt(" + ')');
        }
    }
    
    static final void updateActorSequence(final Actor actor, final int n, final byte b) {
        Client.lv(actor, n);
        try {
            Label_0928: {
                if (actor.exactMoveArrive1Cycle * -435598119 >= -1886224337 * Client.cycle) {
                    if (b >= 50) {
                        Client.mm(actor, n);
                        return;
                    }
                    final int max = Math.max(1, -435598119 * actor.exactMoveArrive1Cycle - -1886224337 * Client.cycle);
                    final int n2 = -1883924352 * actor.field957 + actor.idleSequence * 1119756096;
                    final int n3 = actor.idleSequence * 1119756096 + actor.movementSequence * -161749632;
                    actor.walkBackSequence += (n2 - 1144428983 * actor.walkBackSequence) / max * -881028089;
                    actor.field1005 += (n3 - -411750205 * actor.field1005) / max * 1193213931;
                    actor.crawlLeftSequence = 0;
                    actor.turnLeftSequence = -1369167919 * actor.sequence;
                }
                else if (actor.movementFrame * -1274841313 >= -1886224337 * Client.cycle) {
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                    int n4 = 0;
                    Label_0218: {
                        if (-1274841313 * actor.movementFrame != -1886224337 * Client.cycle && -1 != -1372355773 * actor.overheadTextCyclesRemaining) {
                            if (1253892101 * actor.playerCycle == 0) {
                                n4 = 0;
                                break Label_0218;
                            }
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                        }
                        n4 = 1;
                    }
                    int n5 = n4;
                    Label_4304: {
                        if (n5 == 0) {
                            if (b >= 50) {
                                Client.mm(actor, n);
                                return;
                            }
                            final SequenceDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(actor.overheadTextCyclesRemaining * -1372355773, (byte)113);
                            if (null != spotAnimationDefinition_get) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                if (!spotAnimationDefinition_get.isCachedModelIdSet(1413453204)) {
                                    int n6;
                                    if (1 + 1356757385 * actor.pathLength > spotAnimationDefinition_get.frameLengths[actor.currentSequenceFrameIndex * -41215169]) {
                                        if (b >= 50) {
                                            Client.mm(actor, n);
                                            return;
                                        }
                                        n6 = 1;
                                    }
                                    else {
                                        n6 = 0;
                                    }
                                    n5 = n6;
                                    break Label_4304;
                                }
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                            }
                            n5 = 1;
                        }
                    }
                    if (n5 != 0) {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        final int n7 = actor.movementFrame * -1274841313 - actor.exactMoveArrive1Cycle * -435598119;
                        final int n8 = Client.cycle * -1886224337 - actor.exactMoveArrive1Cycle * -435598119;
                        final int n9 = -1883924352 * actor.field957 + 1119756096 * actor.idleSequence;
                        final int n10 = -161749632 * actor.movementSequence + actor.idleSequence * 1119756096;
                        final int n11 = actor.idleSequence * 1119756096 + actor.orientation * 69929344;
                        final int n12 = actor.idleSequence * 1119756096 + -106117248 * actor.crawlSequence;
                        actor.walkBackSequence = -881028089 * ((n9 * (n7 - n8) + n11 * n8) / n7);
                        actor.field1005 = 1193213931 * ((n8 * n12 + (n7 - n8) * n10) / n7);
                    }
                    actor.crawlLeftSequence = 0;
                    actor.turnLeftSequence = -1369167919 * actor.sequence;
                    actor.field986 = actor.turnLeftSequence * 841550147;
                }
                else {
                    actor.npcCycle = actor.sequenceFrameCycle * 1603478597;
                    if (1134756167 * actor.field970 == 0) {
                        if (b >= 50) {
                            Client.mm(actor, n);
                            return;
                        }
                        actor.crawlLeftSequence = 0;
                    }
                    else {
                        if (-1372355773 * actor.overheadTextCyclesRemaining != -1) {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            if (actor.playerCycle * 1253892101 == 0) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                final SequenceDefinition spotAnimationDefinition_get2 = ItemContainer.SpotAnimationDefinition_get(-1372355773 * actor.overheadTextCyclesRemaining, (byte)73);
                                if (actor.field1003 * -1181739279 > 0) {
                                    if (b >= 50) {
                                        throw new IllegalStateException();
                                    }
                                    if (spotAnimationDefinition_get2.precedenceAnimating * 1069382699 == 0) {
                                        if (b >= 50) {
                                            Client.mm(actor, n);
                                            return;
                                        }
                                        actor.crawlLeftSequence -= 1610286357;
                                        break Label_0928;
                                    }
                                }
                                if (actor.field1003 * -1181739279 <= 0) {
                                    if (b >= 50) {
                                        Client.mm(actor, n);
                                        return;
                                    }
                                    if (0 == 1957040329 * spotAnimationDefinition_get2.priority) {
                                        if (b >= 50) {
                                            throw new IllegalStateException();
                                        }
                                        actor.crawlLeftSequence -= 1610286357;
                                        break Label_0928;
                                    }
                                }
                            }
                        }
                        final int n13 = actor.walkBackSequence * 1144428983;
                        final int n14 = actor.field1005 * -411750205;
                        final int n15 = 1119756096 * actor.idleSequence + 128 * actor.hitSplatTypes2[actor.field970 * 1134756167 - 1];
                        final int n16 = actor.pathX[actor.field970 * 1134756167 - 1] * 128 + 1119756096 * actor.idleSequence;
                        if (n13 < n15) {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            if (n14 < n16) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                actor.turnLeftSequence = -398716160;
                            }
                            else if (n14 > n16) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                actor.turnLeftSequence = -558202624;
                            }
                            else {
                                actor.turnLeftSequence = -478459392;
                            }
                        }
                        else if (n13 > n15) {
                            if (n14 < n16) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                actor.turnLeftSequence = -239229696;
                            }
                            else if (n14 > n16) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                actor.turnLeftSequence = -79743232;
                            }
                            else {
                                actor.turnLeftSequence = -159486464;
                            }
                        }
                        else if (n14 < n16) {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            actor.turnLeftSequence = -318972928;
                        }
                        else if (n14 > n16) {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            actor.turnLeftSequence = 0;
                        }
                        final MoveSpeed moveSpeed = actor.pathTraversed[actor.field970 * 1134756167 - 1];
                        if (n15 - n13 <= 256 && n15 - n13 >= -256) {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            if (n16 - n14 <= 256) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                if (n16 - n14 >= -256) {
                                    int n17 = -1751341433 * actor.turnLeftSequence - actor.field986 * -1703696531 & 0x7FF;
                                    if (n17 > 1024) {
                                        if (b >= 50) {
                                            throw new IllegalStateException();
                                        }
                                        n17 -= 2048;
                                    }
                                    int n18 = actor.runSequence * 1648569641;
                                    Label_1685: {
                                        if (n17 >= -256) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            if (n17 <= 256) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                n18 = 736907545 * actor.targetIndex;
                                                break Label_1685;
                                            }
                                        }
                                        if (n17 >= 256 && n17 < 768) {
                                            if (b >= 50) {
                                                Client.mm(actor, n);
                                                return;
                                            }
                                            n18 = actor.recolourEndCycle * -1059657777;
                                        }
                                        else if (n17 >= -768) {
                                            if (b >= 50) {
                                                Client.mm(actor, n);
                                                return;
                                            }
                                            if (n17 <= -256) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                n18 = -127994241 * actor.field985;
                                            }
                                        }
                                    }
                                    if (n18 == -1) {
                                        n18 = 736907545 * actor.targetIndex;
                                    }
                                    actor.npcCycle = 327373721 * n18;
                                    int n19 = 4;
                                    int isClickable = 1;
                                    if (actor instanceof NPC) {
                                        isClickable = (((NPC)actor).definition.isClickable ? 1 : 0);
                                    }
                                    if (isClickable != 0) {
                                        if (b >= 50) {
                                            throw new IllegalStateException();
                                        }
                                        if (actor.field986 * -1703696531 != actor.turnLeftSequence * -1751341433) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            if (actor.rotation * 1005900761 == -1) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                if (0 != 351748387 * actor.field993) {
                                                    if (b >= 50) {
                                                        Client.mm(actor, n);
                                                        return;
                                                    }
                                                    n19 = 2;
                                                }
                                            }
                                        }
                                        if (actor.field970 * 1134756167 > 2) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            n19 = 6;
                                        }
                                        if (actor.field970 * 1134756167 > 3) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            n19 = 8;
                                        }
                                        if (actor.crawlLeftSequence * 1489558979 > 0) {
                                            if (b >= 50) {
                                                Client.mm(actor, n);
                                                return;
                                            }
                                            if (1134756167 * actor.field970 > 1) {
                                                n19 = 8;
                                                actor.crawlLeftSequence += 1610286357;
                                            }
                                        }
                                    }
                                    else {
                                        if (1134756167 * actor.field970 > 1) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            n19 = 6;
                                        }
                                        if (actor.field970 * 1134756167 > 2) {
                                            n19 = 8;
                                        }
                                        if (actor.crawlLeftSequence * 1489558979 > 0) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            if (actor.field970 * 1134756167 > 1) {
                                                n19 = 8;
                                                actor.crawlLeftSequence += 1610286357;
                                            }
                                        }
                                    }
                                    if (moveSpeed == MoveSpeed.RUN) {
                                        if (b >= 50) {
                                            Client.mm(actor, n);
                                            return;
                                        }
                                        n19 <<= 1;
                                    }
                                    else if (moveSpeed == MoveSpeed.CRAWL) {
                                        if (b >= 50) {
                                            throw new IllegalStateException();
                                        }
                                        n19 >>= 1;
                                    }
                                    Label_2620: {
                                        if (n19 >= 8) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            if (actor.npcCycle * -1302441815 == 736907545 * actor.targetIndex) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                if (actor.field984 * 1939789287 != -1) {
                                                    actor.npcCycle = actor.field984 * 863812623;
                                                    break Label_2620;
                                                }
                                            }
                                            if (-1302441815 * actor.npcCycle == 1648569641 * actor.runSequence) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                if (-1 != 793978951 * actor.x) {
                                                    actor.npcCycle = 538384239 * actor.x;
                                                    break Label_2620;
                                                }
                                            }
                                            if (-127994241 * actor.field985 == actor.npcCycle * -1302441815) {
                                                if (b >= 50) {
                                                    Client.mm(actor, n);
                                                    return;
                                                }
                                                if (actor.walkLeftSequence * 1755337849 != -1) {
                                                    if (b >= 50) {
                                                        throw new IllegalStateException();
                                                    }
                                                    actor.npcCycle = actor.walkLeftSequence * -1205815471;
                                                    break Label_2620;
                                                }
                                            }
                                            if (actor.recolourEndCycle * -1059657777 == actor.npcCycle * -1302441815) {
                                                if (b >= 50) {
                                                    Client.mm(actor, n);
                                                    return;
                                                }
                                                if (actor.field1006 * 802247051 != -1) {
                                                    if (b >= 50) {
                                                        throw new IllegalStateException();
                                                    }
                                                    actor.npcCycle = 2091568403 * actor.field1006;
                                                }
                                            }
                                        }
                                        else if (n19 <= 1) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            if (actor.targetIndex * 736907545 == actor.npcCycle * -1302441815) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                if (-1254675467 * actor.runLeftSequence != -1) {
                                                    if (b >= 50) {
                                                        throw new IllegalStateException();
                                                    }
                                                    actor.npcCycle = actor.runLeftSequence * -560417683;
                                                    break Label_2620;
                                                }
                                            }
                                            if (actor.runSequence * 1648569641 == -1302441815 * actor.npcCycle) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                if (actor.field936 * 572220041 != -1) {
                                                    actor.npcCycle = actor.field936 * -630501663;
                                                    break Label_2620;
                                                }
                                            }
                                            if (-127994241 * actor.field985 == -1302441815 * actor.npcCycle && actor.walkSequence * -1312118043 != -1) {
                                                if (b >= 50) {
                                                    Client.mm(actor, n);
                                                    return;
                                                }
                                                actor.npcCycle = actor.walkSequence * 1773625821;
                                            }
                                            else if (-1302441815 * actor.npcCycle == actor.recolourEndCycle * -1059657777 && actor.walkRightSequence * -428343529 != -1) {
                                                if (b >= 50) {
                                                    Client.mm(actor, n);
                                                    return;
                                                }
                                                actor.npcCycle = -483333697 * actor.walkRightSequence;
                                            }
                                        }
                                    }
                                    Label_2932: {
                                        if (n15 == n13) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            if (n14 == n16) {
                                                break Label_2932;
                                            }
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                        if (n13 < n15) {
                                            actor.walkBackSequence += -881028089 * n19;
                                            if (actor.walkBackSequence * 1144428983 > n15) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                actor.walkBackSequence = -881028089 * n15;
                                            }
                                        }
                                        else if (n13 > n15) {
                                            if (b >= 50) {
                                                Client.mm(actor, n);
                                                return;
                                            }
                                            actor.walkBackSequence -= -881028089 * n19;
                                            if (1144428983 * actor.walkBackSequence < n15) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                actor.walkBackSequence = n15 * -881028089;
                                            }
                                        }
                                        if (n14 < n16) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            actor.field1005 += 1193213931 * n19;
                                            if (-411750205 * actor.field1005 > n16) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                actor.field1005 = 1193213931 * n16;
                                            }
                                        }
                                        else if (n14 > n16) {
                                            if (b >= 50) {
                                                throw new IllegalStateException();
                                            }
                                            actor.field1005 -= 1193213931 * n19;
                                            if (-411750205 * actor.field1005 < n16) {
                                                if (b >= 50) {
                                                    throw new IllegalStateException();
                                                }
                                                actor.field1005 = 1193213931 * n16;
                                            }
                                        }
                                    }
                                    if (actor.walkBackSequence * 1144428983 != n15) {
                                        break Label_0928;
                                    }
                                    if (b >= 50) {
                                        Client.mm(actor, n);
                                        return;
                                    }
                                    if (actor.field1005 * -411750205 != n16) {
                                        break Label_0928;
                                    }
                                    if (b >= 50) {
                                        throw new IllegalStateException();
                                    }
                                    actor.field970 -= 400971895;
                                    if (actor.field1003 * -1181739279 > 0) {
                                        actor.field1003 -= 1622809105;
                                    }
                                    break Label_0928;
                                }
                            }
                        }
                        actor.walkBackSequence = -881028089 * n15;
                        actor.field1005 = n16 * 1193213931;
                        actor.field970 -= 400971895;
                        if (actor.field1003 * -1181739279 > 0) {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            actor.field1003 -= 1622809105;
                        }
                    }
                }
            }
            Label_2063: {
                if (actor.walkBackSequence * 1144428983 >= 128 && actor.field1005 * -411750205 >= 128 && 1144428983 * actor.walkBackSequence < 13184) {
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                    if (actor.field1005 * -411750205 < 13184) {
                        break Label_2063;
                    }
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                }
                actor.overheadTextCyclesRemaining = 1690721941;
                Label_1231: {
                    if (actor instanceof NPC) {
                        switch (((NPC)actor).getId()) {
                            case 8615:
                            case 8616:
                            case 8617:
                            case 8618:
                            case 8619:
                            case 8620:
                            case 8621:
                            case 8622: {
                                break Label_1231;
                            }
                        }
                    }
                    final AnimationChanged animationChanged = new AnimationChanged();
                    animationChanged.setActor((net.runelite.api.Actor)actor);
                    ScriptFrame.client.getCallbacks().post((Object)animationChanged);
                }
                actor.exactMoveArrive1Cycle = 0;
                actor.movementFrame = 0;
                actor.method533(-2086288959);
                actor.walkBackSequence = -1102445696 * actor.hitSplatTypes2[0] + -1606165824 * actor.idleSequence;
                actor.field1005 = actor.idleSequence * 254242752 + -1887439488 * actor.pathX[0];
                actor.method536((byte)32);
            }
            Label_4057: {
                if (actor == MusicPatchNode.localPlayer) {
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                    if (1144428983 * actor.walkBackSequence >= 1536) {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        if (-411750205 * actor.field1005 >= 1536) {
                            if (b >= 50) {
                                Client.mm(actor, n);
                                return;
                            }
                            if (actor.walkBackSequence * 1144428983 < 11776) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                if (-411750205 * actor.field1005 < 11776) {
                                    break Label_4057;
                                }
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                    actor.overheadTextCyclesRemaining = 1690721941;
                    Label_3431: {
                        if (actor instanceof NPC) {
                            switch (((NPC)actor).getId()) {
                                case 8615:
                                case 8616:
                                case 8617:
                                case 8618:
                                case 8619:
                                case 8620:
                                case 8621:
                                case 8622: {
                                    break Label_3431;
                                }
                            }
                        }
                        final AnimationChanged animationChanged2 = new AnimationChanged();
                        animationChanged2.setActor((net.runelite.api.Actor)actor);
                        ScriptFrame.client.getCallbacks().post((Object)animationChanged2);
                    }
                    actor.exactMoveArrive1Cycle = 0;
                    actor.movementFrame = 0;
                    actor.method533(-1945472148);
                    actor.walkBackSequence = -1102445696 * actor.hitSplatTypes2[0] + actor.idleSequence * -1606165824;
                    actor.field1005 = actor.idleSequence * 254242752 + -1887439488 * actor.pathX[0];
                    actor.method536((byte)70);
                }
            }
            if (-1 != 1005900761 * actor.rotation) {
                final int n20 = 65536;
                Actor actor2;
                if (1005900761 * actor.rotation < n20) {
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                    actor2 = Client.npcs[actor.rotation * 1005900761];
                }
                else {
                    actor2 = Client.players[actor.rotation * 1005900761 - n20];
                }
                if (null != actor2) {
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                    final int n21 = 1144428983 * actor.walkBackSequence - actor2.walkBackSequence * 1144428983;
                    final int n22 = actor.field1005 * -411750205 - -411750205 * actor2.field1005;
                    Label_3706: {
                        if (n21 == 0) {
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            if (n22 == 0) {
                                break Label_3706;
                            }
                        }
                        actor.turnLeftSequence = ((int)(Math.atan2(n21, n22) * 325.94932345220167) & 0x7FF) * 385564471;
                    }
                }
                else if (actor.false0) {
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                    actor.rotation = -1052277865;
                    actor.zr(-1);
                    actor.false0 = false;
                }
            }
            Label_4071: {
                if (0 != 1134756167 * actor.field970) {
                    if (1489558979 * actor.crawlLeftSequence <= 0) {
                        break Label_4071;
                    }
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                }
                int n23 = -1;
                Label_3989: {
                    if (-714961113 * actor.runBackSequence != -1 && -1282076959 * actor.movementFrameCycle != -1) {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        final int n24 = actor.runBackSequence * -1320709248 - 1205837952 * WorldMapData_0.baseX + 64;
                        final int n25 = -897093504 * actor.movementFrameCycle - -1473027968 * GameObject.baseY + 64;
                        final int n26 = actor.walkBackSequence * 1144428983 - n24;
                        final int n27 = -411750205 * actor.field1005 - n25;
                        Label_0692: {
                            if (n26 != 0) {
                                break Label_0692;
                            }
                            if (b >= 50) {
                                throw new IllegalStateException();
                            }
                            if (n27 != 0) {
                                if (b >= 50) {
                                    throw new IllegalStateException();
                                }
                                break Label_0692;
                            }
                            break Label_3989;
                        }
                        n23 = ((int)(Math.atan2(n26, n27) * 325.94932345220167) & 0x7FF);
                    }
                    else if (actor.field983 * -283165269 != -1) {
                        n23 = -283165269 * actor.field983;
                    }
                }
                if (n23 != -1) {
                    actor.turnLeftSequence = n23 * 385564471;
                    if (actor.field938) {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        actor.field986 = 841550147 * actor.turnLeftSequence;
                    }
                }
                actor.method527(-2125761914);
            }
            final int n28 = -1751341433 * actor.turnLeftSequence - actor.field986 * -1703696531 & 0x7FF;
            if (n28 != 0) {
                if (b >= 50) {
                    Client.mm(actor, n);
                    return;
                }
                actor.graphicsCount += 531854385;
                int n29;
                if (n28 > 1024) {
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                    n29 = -1;
                }
                else {
                    n29 = 1;
                }
                final int n30 = n29;
                actor.field986 += n30 * (actor.field993 * 351748387) * -1228309915;
                boolean b2 = true;
                Label_4420: {
                    if (n28 >= actor.field993 * 351748387) {
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                        if (n28 <= 2048 - actor.field993 * 351748387) {
                            break Label_4420;
                        }
                        if (b >= 50) {
                            throw new IllegalStateException();
                        }
                    }
                    actor.field986 = 841550147 * actor.turnLeftSequence;
                    b2 = false;
                }
                Label_1255: {
                    if (actor.field993 * 351748387 > 0) {
                        if (b >= 50) {
                            Client.mm(actor, n);
                            return;
                        }
                        if (actor.npcCycle * -1302441815 == 1590591885 * actor.sequenceFrameCycle) {
                            if (b >= 50) {
                                Client.mm(actor, n);
                                return;
                            }
                            if (-1223990063 * actor.graphicsCount > 25 || b2) {
                                if (n30 == -1) {
                                    if (b >= 50) {
                                        Client.mm(actor, n);
                                        return;
                                    }
                                    if (1319769839 * actor.crawlRightSequence != -1) {
                                        if (b >= 50) {
                                            throw new IllegalStateException();
                                        }
                                        actor.npcCycle = actor.crawlRightSequence * -1570491945;
                                        break Label_1255;
                                    }
                                }
                                if (n30 == 1) {
                                    if (b >= 50) {
                                        throw new IllegalStateException();
                                    }
                                    if (1796560353 * actor.exactMoveDirection != -1) {
                                        if (b >= 50) {
                                            throw new IllegalStateException();
                                        }
                                        actor.npcCycle = -1883552135 * actor.exactMoveDirection;
                                        break Label_1255;
                                    }
                                }
                                actor.npcCycle = actor.targetIndex * 961712881;
                            }
                        }
                    }
                }
                actor.field986 = -1228309915 * (actor.field986 * -1703696531 & 0x7FF);
            }
            else {
                if (actor.false0) {
                    if (b >= 50) {
                        throw new IllegalStateException();
                    }
                    actor.rotation = -1052277865;
                    actor.zr(-1);
                    actor.false0 = false;
                }
                actor.graphicsCount = 0;
            }
            NetFileRequest.method1876(actor, (byte)(-25));
            Client.mm(actor, n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bj.ii(" + ')');
        }
    }
    
    public byte[][][] ub() {
        return this.arguments;
    }
    
    public Field[] lw() {
        return this.field158;
    }
    
    public static void method200(final AbstractArchive field4036, final int n) {
        try {
            DbTableType.field4036 = field4036;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "bj.af(" + ')');
        }
    }
    
    public Method[] method200() {
        return this.methods;
    }
    
    public static DualNode wh(final EvictingDualNodeHashTable evictingDualNodeHashTable, final long n) {
        final DualNode dualNode = (DualNode)evictingDualNodeHashTable.hashTable.aa(n);
        if (dualNode != null) {
            evictingDualNodeHashTable.deque.add(dualNode);
        }
        return dualNode;
    }
}
