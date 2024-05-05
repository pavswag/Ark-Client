// 
// Decompiled by Procyon v0.5.36
// 

public class ArchiveLoader
{
    static final int af = 10000;
    final Archive archive;
    final int groupCount;
    int loadedCount;
    static int menuY;
    public static final int bb = 26;
    
    ArchiveLoader(final Archive archive, final String s) {
        this.loadedCount = 0;
        this.archive = archive;
        this.groupCount = archive.cm(608624390) * -1548488391;
    }
    
    boolean aw() {
        this.loadedCount = 0;
        for (int i = 0; i < -17715959 * this.groupCount; ++i) {
            if (!this.archive.method1870(i, -2128515684) || this.archive.method1871(i, 1341239113)) {
                this.loadedCount -= 1804674373;
            }
        }
        return -1464399353 * this.loadedCount >= this.groupCount * -17715959;
    }
    
    boolean an() {
        this.loadedCount = 0;
        for (int i = 0; i < -17715959 * this.groupCount; ++i) {
            if (!this.archive.method1870(i, -2132309312) || this.archive.method1871(i, 1105401917)) {
                this.loadedCount += 1412973495;
            }
        }
        return -1464399353 * this.loadedCount >= this.groupCount * -17715959;
    }
    
    boolean ac() {
        this.loadedCount = 0;
        for (int i = 0; i < 412842149 * this.groupCount; ++i) {
            if (!this.archive.method1870(i, -1436580108) || this.archive.method1871(i, 1429785421)) {
                this.loadedCount -= 1346987550;
            }
        }
        return -1464399353 * this.loadedCount >= this.groupCount * -844373525;
    }
    
    static final int method478(final Widget widget, final int n, final int n2) {
        try {
            if (widget.cs1Instructions != null) {
                if (n2 != 1696113134) {
                    throw new IllegalStateException();
                }
                if (n >= widget.cs1Instructions.length) {
                    if (n2 != 1696113134) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    try {
                        final int[] array = widget.cs1Instructions[n];
                        int n3 = 0;
                        int n4 = 0;
                        int n5 = 0;
                        while (true) {
                            final int n6 = array[n4++];
                            int expandBounds = 0;
                            int n7 = 0;
                            if (n6 == 0) {
                                if (n2 != 1696113134) {
                                    throw new IllegalStateException();
                                }
                                return n3;
                            }
                            else {
                                if (n6 != 0) {
                                    expandBounds = Client.currentLevels[array[n4++]];
                                }
                                if (2 == n6) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    expandBounds = Client.levels[array[n4++]];
                                }
                                if (3 == n6) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    expandBounds = Client.experience[array[n4++]];
                                }
                                Label_0362: {
                                    if (4 == n6) {
                                        if (n2 != 1696113134) {
                                            throw new IllegalStateException();
                                        }
                                        final Widget vmethod3380 = class165.vmethod3380((array[n4++] << 16) + array[n4++], (byte)5);
                                        final int n8 = array[n4++];
                                        if (n8 != -1) {
                                            if (n2 != 1696113134) {
                                                throw new IllegalStateException();
                                            }
                                            if (HealthBarUpdate.set(n8, (byte)22).isMembersOnly) {
                                                if (!Client.isMembersWorld) {
                                                    break Label_0362;
                                                }
                                                if (n2 != 1696113134) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                            for (int i = 0; i < vmethod3380.itemIds.length; ++i) {
                                                if (n2 != 1696113134) {
                                                    throw new IllegalStateException();
                                                }
                                                if (vmethod3380.itemIds[i] == n8 + 1) {
                                                    expandBounds += vmethod3380.field3007[i];
                                                }
                                            }
                                        }
                                    }
                                }
                                if (n6 == 5) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    expandBounds = Varps.Varps_main[array[n4++]];
                                }
                                if (6 == n6) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    expandBounds = Skills.Skills_experienceTable[Client.levels[array[n4++]] - 1];
                                }
                                if (n6 == 7) {
                                    expandBounds = Varps.Varps_main[array[n4++]] * 100 / 46875;
                                }
                                if (8 == n6) {
                                    expandBounds = 1302967875 * MusicPatchNode.localPlayer.combatLevel;
                                }
                                if (9 == n6) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    for (int j = 0; j < 25; ++j) {
                                        if (n2 != 1696113134) {
                                            throw new IllegalStateException();
                                        }
                                        if (Skills.Skills_enabled[j]) {
                                            if (n2 != 1696113134) {
                                                throw new IllegalStateException();
                                            }
                                            expandBounds += Client.levels[j];
                                        }
                                    }
                                }
                                Label_0735: {
                                    if (10 == n6) {
                                        if (n2 != 1696113134) {
                                            throw new IllegalStateException();
                                        }
                                        final Widget vmethod3381 = class165.vmethod3380((array[n4++] << 16) + array[n4++], (byte)5);
                                        final int n9 = array[n4++];
                                        if (-1 != n9) {
                                            if (n2 != 1696113134) {
                                                throw new IllegalStateException();
                                            }
                                            if (HealthBarUpdate.set(n9, (byte)46).isMembersOnly) {
                                                if (n2 != 1696113134) {
                                                    throw new IllegalStateException();
                                                }
                                                if (!Client.isMembersWorld) {
                                                    break Label_0735;
                                                }
                                                if (n2 != 1696113134) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                            for (int k = 0; k < vmethod3381.itemIds.length; ++k) {
                                                if (vmethod3381.itemIds[k] == n9 + 1) {
                                                    expandBounds = 999999999;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (n6 == 11) {
                                    expandBounds = -365416549 * Client.runEnergy;
                                }
                                if (12 == n6) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    expandBounds = Client.weight * -1940722149;
                                }
                                if (13 == n6) {
                                    int n10;
                                    if ((Varps.Varps_main[array[n4++]] & 1 << array[n4++]) != 0x0) {
                                        if (n2 != 1696113134) {
                                            throw new IllegalStateException();
                                        }
                                        n10 = 1;
                                    }
                                    else {
                                        n10 = 0;
                                    }
                                    expandBounds = n10;
                                }
                                if (n6 == 14) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    expandBounds = class252.expandBounds(array[n4++], 1353386129);
                                }
                                if (15 == n6) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    n7 = 1;
                                }
                                if (n6 == 16) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    n7 = 2;
                                }
                                if (17 == n6) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    n7 = 3;
                                }
                                if (n6 == 18) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    expandBounds = -1232093375 * WorldMapData_0.baseX + (MusicPatchNode.localPlayer.br * 1144428983 >> 7);
                                }
                                if (19 == n6) {
                                    expandBounds = GameObject.baseY * 827352769 + (-411750205 * MusicPatchNode.localPlayer.ep >> 7);
                                }
                                if (20 == n6) {
                                    if (n2 != 1696113134) {
                                        throw new IllegalStateException();
                                    }
                                    expandBounds = array[n4++];
                                }
                                if (n7 == 0) {
                                    if (n5 == 0) {
                                        n3 += expandBounds;
                                    }
                                    if (n5 != 0) {
                                        if (n2 != 1696113134) {
                                            throw new IllegalStateException();
                                        }
                                        n3 -= expandBounds;
                                    }
                                    if (2 == n5) {
                                        if (n2 != 1696113134) {
                                            throw new IllegalStateException();
                                        }
                                        if (expandBounds != 0) {
                                            if (n2 != 1696113134) {
                                                throw new IllegalStateException();
                                            }
                                            n3 /= expandBounds;
                                        }
                                    }
                                    if (n5 == 3) {
                                        if (n2 != 1696113134) {
                                            throw new IllegalStateException();
                                        }
                                        n3 *= expandBounds;
                                    }
                                    n5 = 0;
                                }
                                else {
                                    n5 = n7;
                                }
                            }
                        }
                    }
                    catch (Exception ex2) {
                        return -1;
                    }
                }
            }
            return -2;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "dw.lx(" + ')');
        }
    }
    
    boolean isLoaded(final byte b) {
        try {
            this.loadedCount = 0;
            for (int i = 0; i < -17715959 * this.groupCount; ++i) {
                if (b <= 15) {
                    throw new IllegalStateException();
                }
                if (this.archive.method1870(i, -2043627121)) {
                    if (b <= 15) {
                        throw new IllegalStateException();
                    }
                    if (!this.archive.method1871(i, 1783984529)) {
                        continue;
                    }
                }
                this.loadedCount += 1412973495;
            }
            boolean b2;
            if (-1464399353 * this.loadedCount >= this.groupCount * -17715959) {
                if (b <= 15) {
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
            throw HealthBar.get(ex, "dw.af(" + ')');
        }
    }
}
