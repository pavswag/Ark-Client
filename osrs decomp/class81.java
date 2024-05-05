import java.util.Calendar;
import java.util.Date;

// 
// Decompiled by Procyon v0.5.36
// 

public class class81
{
    static final int as = 20;
    static final int an = 2;
    static final int aw = 3;
    static final int au = 5;
    static final int af = 1;
    public static final int aq = 16;
    static final int bo = 47;
    static final int pe = 1;
    
    class81() throws Throwable {
        throw new Error();
    }
    
    static boolean method483(final Date date, final int n) {
        try {
            final Calendar instance = Calendar.getInstance();
            instance.set(1, instance.get(1) - 13);
            instance.set(5, instance.get(5) + 1);
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            return date.before(instance.getTime());
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "do.al(" + ')');
        }
    }
    
    static void resumePauseWidget(final int n, final int n2, final short n3) {
        try {
            final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.CONTINUE, Client.packetWriter.isaacCipher, (short)(-8374));
            packetBufferNode.packetBuffer.el(n, -437883978);
            Buffer.ap(packetBufferNode.packetBuffer, n2, (byte)4);
            Client.packetWriter.addNode(packetBufferNode, 414135591);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "do.kf(" + ')');
        }
    }
    
    static final void addPendingSpawnToScene(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        try {
            if (n3 >= 1) {
                if (n9 >= -2128603190) {
                    throw new IllegalStateException();
                }
                if (n4 >= 1) {
                    if (n9 >= -2128603190) {
                        return;
                    }
                    if (n3 <= 102) {
                        if (n9 >= -2128603190) {
                            return;
                        }
                        if (n4 <= 102) {
                            if (n9 >= -2128603190) {
                                return;
                            }
                            if (Client.isLowDetail) {
                                if (n9 >= -2128603190) {
                                    throw new IllegalStateException();
                                }
                                if (n != GameEngine.Client_plane * -1727408401) {
                                    return;
                                }
                            }
                            long n10 = 0L;
                            if (0 == n2) {
                                if (n9 >= -2128603190) {
                                    throw new IllegalStateException();
                                }
                                n10 = class31.scene.getBoundaryObjectTag(n, n3, n4);
                            }
                            if (n2 == 1) {
                                if (n9 >= -2128603190) {
                                    return;
                                }
                                n10 = class31.scene.getWallDecorationTag(n, n3, n4);
                            }
                            if (n2 == 2) {
                                if (n9 >= -2128603190) {
                                    throw new IllegalStateException();
                                }
                                n10 = class31.scene.getGameObjectTag(n, n3, n4);
                            }
                            if (3 == n2) {
                                if (n9 >= -2128603190) {
                                    throw new IllegalStateException();
                                }
                                n10 = class31.scene.getFloorDecorationTag(n, n3, n4);
                            }
                            if (n10 != 0L) {
                                if (n9 >= -2128603190) {
                                    throw new IllegalStateException();
                                }
                                final int objectFlags = class31.scene.getObjectFlags(n, n3, n4, n10);
                                final int entity_unpackID = InterfaceParent.Entity_unpackID(n10);
                                final int n11 = objectFlags & 0x1F;
                                final int n12 = objectFlags >> 6 & 0x3;
                                if (0 == n2) {
                                    if (n9 >= -2128603190) {
                                        throw new IllegalStateException();
                                    }
                                    Scene.nw(class31.scene, n, n3, n4);
                                    final ObjectComposition vmethod3248 = class144.vmethod3248(entity_unpackID, (short)1282);
                                    if (0 != vmethod3248.interactType * -973955889) {
                                        if (n9 >= -2128603190) {
                                            throw new IllegalStateException();
                                        }
                                        Client.collisionMaps[n].method1167(n3, n4, n11, n12, vmethod3248.boolean1, -776317282);
                                    }
                                }
                                if (1 == n2) {
                                    class31.scene.dd(n, n3, n4);
                                }
                                Label_0654: {
                                    if (n2 == 2) {
                                        if (n9 >= -2128603190) {
                                            throw new IllegalStateException();
                                        }
                                        class31.scene.em(n, n3, n4);
                                        final ObjectComposition vmethod3249 = class144.vmethod3248(entity_unpackID, (short)5392);
                                        if (-1339930361 * vmethod3249.sizeX + n3 <= 103) {
                                            if (n9 >= -2128603190) {
                                                throw new IllegalStateException();
                                            }
                                            if (-1339930361 * vmethod3249.sizeX + n4 <= 103) {
                                                if (n9 >= -2128603190) {
                                                    return;
                                                }
                                                if (n3 + vmethod3249.sizeY * -1659393955 <= 103) {
                                                    if (-1659393955 * vmethod3249.sizeY + n4 > 103) {
                                                        if (n9 >= -2128603190) {
                                                            throw new IllegalStateException();
                                                        }
                                                    }
                                                    else {
                                                        if (-973955889 * vmethod3249.interactType == 0) {
                                                            break Label_0654;
                                                        }
                                                        if (n9 >= -2128603190) {
                                                            throw new IllegalStateException();
                                                        }
                                                        Client.collisionMaps[n].setFlagOffNonSquare(n3, n4, -1339930361 * vmethod3249.sizeX, vmethod3249.sizeY * -1659393955, n12, vmethod3249.boolean1, -929861828);
                                                        break Label_0654;
                                                    }
                                                }
                                            }
                                        }
                                        return;
                                    }
                                }
                                if (3 == n2) {
                                    Scene.zv(class31.scene, n, n3, n4);
                                    if (-973955889 * class144.vmethod3248(entity_unpackID, (short)9672).interactType == 1) {
                                        if (n9 >= -2128603190) {
                                            return;
                                        }
                                        Client.collisionMaps[n].setBlockedByFloorDec(n3, n4, -127908210);
                                    }
                                }
                            }
                            if (n5 >= 0) {
                                int n13 = n;
                                if (n13 < 3) {
                                    if (n9 >= -2128603190) {
                                        throw new IllegalStateException();
                                    }
                                    if (0x2 == (Tiles.Tiles_renderFlags[1][n3][n4] & 0x2)) {
                                        if (n9 >= -2128603190) {
                                            throw new IllegalStateException();
                                        }
                                        ++n13;
                                    }
                                }
                                class165.method923(n, n13, n3, n4, n5, n6, n7, n8, class31.scene, Client.collisionMaps[n], -1255092021);
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "do.ku(" + ')');
        }
    }
    
    static boolean method485(final int n, final int n2) {
        try {
            int i = 0;
            while (i < Client.field355 * -1685179677) {
                if (n2 != -2013563855) {
                    throw new IllegalStateException();
                }
                if (Client.field424[i] == n) {
                    if (n2 != -2013563855) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
                else {
                    ++i;
                }
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "do.mz(" + ')');
        }
    }
}
