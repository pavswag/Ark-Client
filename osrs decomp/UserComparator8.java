// 
// Decompiled by Procyon v0.5.36
// 

public class UserComparator8 extends AbstractUserComparator
{
    static final int eh = 0;
    static int field1157;
    static String worldHost;
    final boolean reversed;
    
    public UserComparator8(final boolean reversed) {
        this.reversed = reversed;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        try {
            return this.compareBuddy((Buddy)o, (Buddy)o2, -1369824853);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ea.compare(" + ')');
        }
    }
    
    public static boolean md(final Archive archive, final int n) {
        if (archive == null) {
            archive.bd();
        }
        return AbstractArchive.yk(archive, n, 424070347) != null;
    }
    
    static float[] method686(final JSONObject jsonObject, final String s, final int n) throws JSONException {
        try {
            final float[] array = new float[4];
            try {
                final JSONArray jsonArray = jsonObject.getJSONArray(s);
                array[0] = (float)jsonArray.optDouble(0, 0.0);
                array[1] = (float)jsonArray.optDouble(1, 0.0);
                array[2] = (float)jsonArray.optDouble(2, 1.0);
                array[3] = (float)jsonArray.optDouble(3, 1.0);
            }
            catch (JSONException ex2) {
                array[1] = (array[0] = 0.0f);
                array[3] = (array[2] = 1.0f);
            }
            return array;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ea.as(" + ')');
        }
    }
    
    public int al(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, -1369824853);
    }
    
    int method688(final Buddy buddy, final Buddy buddy2) {
        if (-453810525 * Client.worldId == 177258591 * buddy.world) {
            if (Client.worldId * -453810525 != buddy2.world * 177258591) {
                return this.reversed ? -1 : 1;
            }
        }
        else if (1635263960 * buddy2.world == Client.worldId * -510315481) {
            return this.reversed ? 1 : -1;
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    public static int method688(final int n, final int n2, final int n3) {
        try {
            return (int)Math.round(Math.atan2(n, n2) * 2607.5945876176133) & 0x3FFF;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ea.an(" + ')');
        }
    }
    
    int ac(final Buddy buddy, final Buddy buddy2) {
        if (-939931346 * Client.worldId == -243372234 * buddy.world) {
            if (Client.worldId * -1186589312 != buddy2.world * 1077874178) {
                return this.reversed ? -1 : 1;
            }
        }
        else if (177258591 * buddy2.world == Client.worldId * -453810525) {
            return this.reversed ? 1 : -1;
        }
        return this.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    public int au(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, -1369824853);
    }
    
    public static int ki(final UserComparator8 userComparator8, final Buddy buddy, final Buddy buddy2) {
        if (userComparator8 == null) {
            userComparator8.method688(buddy, buddy);
        }
        if (-453810525 * Client.worldId == 177258591 * buddy.world) {
            if (Client.worldId * -453810525 != buddy2.world * 177258591) {
                return userComparator8.reversed ? -1 : 1;
            }
        }
        else if (177258591 * buddy2.world == Client.worldId * -453810525) {
            return userComparator8.reversed ? 1 : -1;
        }
        return userComparator8.ao((User)buddy, (User)buddy2, 641920470);
    }
    
    int compareBuddy(final Buddy buddy, final Buddy buddy2, final int n) {
        try {
            if (-453810525 * Client.worldId == 177258591 * buddy.world) {
                if (Client.worldId * -453810525 != buddy2.world * 177258591) {
                    return this.reversed ? -1 : 1;
                }
            }
            else if (177258591 * buddy2.world == Client.worldId * -453810525) {
                if (n != -1369824853) {
                    throw new IllegalStateException();
                }
                int n2;
                if (this.reversed) {
                    if (n != -1369824853) {
                        throw new IllegalStateException();
                    }
                    n2 = 1;
                }
                else {
                    n2 = -1;
                }
                return n2;
            }
            return this.ao((User)buddy, (User)buddy2, 641920470);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ea.af(" + ')');
        }
    }
    
    public static int kk(final UserComparator8 userComparator8, final Object o, final Object o2) {
        if (userComparator8 == null) {
            userComparator8.compare(o, o);
        }
        return userComparator8.compareBuddy((Buddy)o, (Buddy)o2, -1369824853);
    }
    
    public int aq(final Object o, final Object o2) {
        return this.compareBuddy((Buddy)o, (Buddy)o2, -1369824853);
    }
    
    static final void method689(final byte b) {
        try {
            if (-1727408401 * GameEngine.Client_plane != Client.field596 * -2000567333) {
                if (b >= 3) {
                    return;
                }
                Client.field596 = -1813500035 * GameEngine.Client_plane;
                final int n = -1727408401 * GameEngine.Client_plane;
                final int[] pixels = UrlRequester.sceneMinimapSprite.pixels;
                for (int length = pixels.length, i = 0; i < length; ++i) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    pixels[i] = 0;
                }
                for (int j = 1; j < 103; ++j) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    int n2 = 2048 * (103 - j) + 24628;
                    for (int k = 1; k < 103; ++k) {
                        if ((Tiles.Tiles_renderFlags[n][k][j] & 0x18) == 0x0) {
                            if (b >= 3) {
                                throw new IllegalStateException();
                            }
                            Scene.qb(class31.scene, pixels, n2, 512, n, k, j);
                        }
                        if (n < 3) {
                            if (b >= 3) {
                                throw new IllegalStateException();
                            }
                            if ((Tiles.Tiles_renderFlags[n + 1][k][j] & 0x8) != 0x0) {
                                if (b >= 3) {
                                    throw new IllegalStateException();
                                }
                                Scene.qb(class31.scene, pixels, n2, 512, n + 1, k, j);
                            }
                        }
                        n2 += 4;
                    }
                }
                final int n3 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
                final int n4 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
                SpritePixels.bg(UrlRequester.sceneMinimapSprite);
                for (int l = 1; l < 103; ++l) {
                    if (b >= 3) {
                        return;
                    }
                    for (int n5 = 1; n5 < 103; ++n5) {
                        if (b >= 3) {
                            return;
                        }
                        if (0x0 == (Tiles.Tiles_renderFlags[n][n5][l] & 0x18)) {
                            if (b >= 3) {
                                throw new IllegalStateException();
                            }
                            class149.drawObject(n, n5, l, n3, n4, -1290487561);
                        }
                        if (n < 3 && (Tiles.Tiles_renderFlags[1 + n][n5][l] & 0x8) != 0x0) {
                            class149.drawObject(n + 1, n5, l, n3, n4, -1520804786);
                        }
                    }
                }
                Client.mapIconCount = 0;
                for (int n6 = 0; n6 < 104; ++n6) {
                    if (b >= 3) {
                        throw new IllegalStateException();
                    }
                    for (int n7 = 0; n7 < 104; ++n7) {
                        if (b >= 3) {
                            throw new IllegalStateException();
                        }
                        final long floorDecorationTag = class31.scene.getFloorDecorationTag(GameEngine.Client_plane * -1727408401, n6, n7);
                        if (floorDecorationTag != 0L) {
                            final int n8 = class144.vmethod3248(InterfaceParent.Entity_unpackID(floorDecorationTag), (short)2415).mapIconId * 1270945427;
                            if (n8 >= 0) {
                                if (b >= 3) {
                                    throw new IllegalStateException();
                                }
                                if (!class354.method1935(n8, 2096193718).field1491) {
                                    if (b >= 3) {
                                        return;
                                    }
                                }
                                else {
                                    Client.mapIcons[1573101195 * Client.mapIconCount] = class354.method1935(n8, 2007261839).getSpriteBool(false, -16711936);
                                    Client.mapIconXs[Client.mapIconCount * 1573101195] = n6;
                                    Client.mapIconYs[Client.mapIconCount * 1573101195] = n7;
                                    Client.mapIconCount += 868833571;
                                }
                            }
                        }
                    }
                }
                RouteStrategy.rasterProvider.apply((byte)0);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ea.iu(" + ')');
        }
    }
    
    public static int uj(final UserComparator8 userComparator8, final Buddy buddy, final Buddy buddy2) {
        if (userComparator8 == null) {
            userComparator8.method688(buddy, buddy);
        }
        if (-453810525 * Client.worldId == 177258591 * buddy.world) {
            if (Client.worldId * -453810525 != buddy2.world * 177258591) {
                return userComparator8.reversed ? -1 : 1;
            }
        }
        else if (177258591 * buddy2.world == Client.worldId * -453810525) {
            return userComparator8.reversed ? 1 : -1;
        }
        return userComparator8.ao((User)buddy, (User)buddy2, 641920470);
    }
}
