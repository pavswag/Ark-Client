package com.client;

import net.runelite.api.WorldType;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.util.EnumSet;

public class World implements net.runelite.api.World {
    @ObfuscatedName("an")
    @ObfuscatedGetter(
            intValue = 1254652015
    )
    @Export("World_count")
    public static int World_count;
    @ObfuscatedName("aj")
    @ObfuscatedGetter(
            intValue = -1663984253
    )
    @Export("World_listCount")
    static int World_listCount;
    @ObfuscatedName("av")
    @Export("World_sortOption2")
    static int[] World_sortOption2;
    @ObfuscatedName("ab")
    @Export("World_sortOption1")
    static int[] World_sortOption1;
    @ObfuscatedName("ex")
    @Export("mouseCam")
    static boolean mouseCam;
    @ObfuscatedName("jy")
    @ObfuscatedSignature(
            descriptor = "Lvg;"
    )
    int id;
    @ObfuscatedName("au")
    @ObfuscatedGetter(
            intValue = 1816082211
    )
    @Export("properties")
    int properties;
    @ObfuscatedName("ah")
    @ObfuscatedGetter(
            intValue = 1966096563
    )
    @Export("population")
    int population;
    @ObfuscatedName("az")
    @Export("host")
    String host;
    int port;
    @ObfuscatedName("ax")
    @Export("activity")
    String activity;
    @ObfuscatedName("ac")
    @ObfuscatedGetter(
            intValue = 1536325123
    )
    @Export("location")
    int location;
    public String js5Host;
    @ObfuscatedName("al")
    @ObfuscatedGetter(
            intValue = 241496969
    )
    @Export("index")
    int index;
    public int js5Port;
    @ObfuscatedName("ay")
    String field819;

    static {
        World_count = 0;
        World_listCount = 0;
        World_sortOption2 = new int[]{1, 1, 1, 1};
        World_sortOption1 = new int[]{0, 1, 2, 3};
    }
    String name;
    World() {
    }

    static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
        if (var1 < var2) {
            int var5 = var1 - 1;
            int var6 = var2 + 1;
            int var7 = (var2 + var1) / 2;
            World var8 = var0[var7];
            var0[var7] = var0[var1];
            var0[var1] = var8;

            while (var5 < var6) {
                boolean var9 = true;

                int var10;
                int var11;
                int var12;
                do {
                    --var6;

                    for (var10 = 0; var10 < 4; ++var10) {
                        if (var3[var10] == 2) {
                            var11 = var0[var6].index;
                            var12 = var8.index;
                        } else if (var3[var10] == 1) {
                            var11 = var0[var6].population;
                            var12 = var8.population;
                            if (var11 == -1 && var4[var10] == 1) {
                                var11 = 2001;
                            }

                            if (var12 == -1 && var4[var10] == 1) {
                                var12 = 2001;
                            }
                        } else if (var3[var10] == 3) {
                            var11 = var0[var6].isMembersOnly() ? 1 : 0;
                            var12 = var8.isMembersOnly() ? 1 : 0;
                        } else {
                            var11 = var0[var6].id;
                            var12 = var8.id;
                        }

                        if (var12 != var11) {
                            if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                                var9 = false;
                            }
                            break;
                        }

                        if (var10 == 3) {
                            var9 = false;
                        }
                    }
                } while(var9);

                var9 = true;

                do {
                    ++var5;

                    for (var10 = 0; var10 < 4; ++var10) {
                        if (var3[var10] == 2) {
                            var11 = var0[var5].index;
                            var12 = var8.index;
                        } else if (var3[var10] == 1) {
                            var11 = var0[var5].population;
                            var12 = var8.population;
                            if (var11 == -1 && var4[var10] == 1) {
                                var11 = 2001;
                            }

                            if (var12 == -1 && var4[var10] == 1) {
                                var12 = 2001;
                            }
                        } else if (var3[var10] == 3) {
                            var11 = var0[var5].isMembersOnly() ? 1 : 0;
                            var12 = var8.isMembersOnly() ? 1 : 0;
                        } else {
                            var11 = var0[var5].id;
                            var12 = var8.id;
                        }

                        if (var12 != var11) {
                            if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                                var9 = false;
                            }
                            break;
                        }

                        if (var10 == 3) {
                            var9 = false;
                        }
                    }
                } while(var9);

                if (var5 < var6) {
                    World var13 = var0[var5];
                    var0[var5] = var0[var6];
                    var0[var6] = var13;
                }
            }

            sortWorlds(var0, var1, var6, var3, var4);
            sortWorlds(var0, var6 + 1, var2, var3, var4);
        }

    }

    @ObfuscatedName("ai")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "106316183"
    )
    @Export("isMembersOnly")
    boolean isMembersOnly() {
        return (class542.field5344.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName("ae")
    @ObfuscatedSignature(
            descriptor = "(S)Z",
            garbageValue = "28624"
    )
    @Export("isDeadman")
    boolean isDeadman() {
        return (class542.field5331.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName("au")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "-1436852917"
    )
    boolean method1847() {
        return (class542.field5318.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName("ah")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "-2075315413"
    )
    @Export("isPvp")
    boolean isPvp() {
        return (class542.field5319.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName("az")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "473183062"
    )
    boolean method1875() {
        return (class542.field5340.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName("ax")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "420397604"
    )
    boolean method1850() {
        return (class542.field5320.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName("ac")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "1939931417"
    )
    @Export("isBeta")
    boolean isBeta() {
        return (class542.field5342.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName("al")
    @ObfuscatedSignature(
            descriptor = "(B)Z",
            garbageValue = "65"
    )
    boolean method1852() {
        return (class542.field5347.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "2056464434"
    )
    boolean method1881() {
        return (class542.field5325.rsOrdinal() & this.properties) != 0;
    }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(
            descriptor = "(B)Z",
            garbageValue = "-24"
    )
    boolean method1854() {
        return (class542.field5328.rsOrdinal() & this.properties) != 0;
    }


    @ObfuscatedName("ad")
    @ObfuscatedSignature(
            descriptor = "(II)I",
            garbageValue = "-1425844355"
    )
    public static int method1907(int var0) {
        var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
        var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
        var0 = var0 + (var0 >>> 4) & 252645135;
        var0 += var0 >>> 8;
        var0 += var0 >>> 16;
        return var0 & 255;
    }

    @ObfuscatedName("ab")
    @ObfuscatedSignature(
            descriptor = "(I)Lcw;",
            garbageValue = "-824454958"
    )
    @Export("getNextWorldListWorld")
    static World getNextWorldListWorld() {
        return World_listCount < World_count ? World_worlds[++World_listCount - 1] : null;
    }
    public static World[] World_worlds;

    @Override
    public EnumSet<WorldType> getTypes() {
        return null;
    }

    @Override
    public void setTypes(EnumSet<WorldType> types) {

    }

    @Override
    public int getPlayerCount() {
        return population;
    }

    @Override
    public void setPlayerCount(int playerCount) {

    }

    @Override
    public int getLocation() {
        return location;
    }

    @Override
    public void setLocation(int location) {

    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public void setIndex(int index) {

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public String getActivity() {
        return activity;
    }

    @Override
    public void setActivity(String activity) {

    }

    @Override
    public String getAddress() {
        return host;
    }

    @Override
    public void setAddress(String address) {

    }
}
