// 
// Decompiled by Procyon v0.5.36
// 

public class class123 implements class356
{
    static final class123 field1200;
    static class170 mouseWheel;
    static final class123 field1202;
    static final class123 field1203;
    static final class123 field1204;
    static final int av = 19;
    final int field1205;
    static final String ho = "JX_DISPLAY_NAME";
    final int field1206;
    static final class123 field1207;
    static SpritePixels leftTitleSprite;
    static final int ax = 25;
    static int field1209;
    
    class123(final int n, final int n2) {
        this.field1206 = n * -1799886237;
        this.field1205 = n2 * 962359993;
    }
    
    static {
        field1207 = new class123(0, 0);
        field1200 = new class123(1, 1);
        field1202 = new class123(2, 2);
        field1203 = new class123(3, 3);
        field1204 = new class123(4, 4);
    }
    
    static void sortWorlds(final World[] array, final int n, final int n2, final int[] array2, final int[] array3, final int n3) {
        try {
            if (n < n2) {
                if (n3 != -139825594) {
                    throw new IllegalStateException();
                }
                int i = n - 1;
                int n4 = 1 + n2;
                final int n5 = (n2 + n) / 2;
                final World world = array[n5];
                array[n5] = array[n];
                array[n] = world;
            Label_0141:
                while (true) {
                    while (i < n4) {
                        if (n3 != -139825594) {
                            return;
                        }
                        int n6 = 1;
                        while (true) {
                            --n4;
                            for (int j = 0; j < 4; ++j) {
                                if (n3 != -139825594) {
                                    throw new IllegalStateException();
                                }
                                int membersOnly;
                                int membersOnly2;
                                if (array2[j] == 2) {
                                    if (n3 != -139825594) {
                                        throw new IllegalStateException();
                                    }
                                    membersOnly = array[n4].index * 1692771375;
                                    membersOnly2 = 1692771375 * world.index;
                                }
                                else if (1 == array2[j]) {
                                    if (n3 != -139825594) {
                                        throw new IllegalStateException();
                                    }
                                    membersOnly = array[n4].population * -1396846889;
                                    membersOnly2 = world.population * -1396846889;
                                    if (membersOnly == -1 && array3[j] == 1) {
                                        if (n3 != -139825594) {
                                            return;
                                        }
                                        membersOnly = 2001;
                                    }
                                    if (membersOnly2 == -1 && 1 == array3[j]) {
                                        if (n3 != -139825594) {
                                            throw new IllegalStateException();
                                        }
                                        membersOnly2 = 2001;
                                    }
                                }
                                else if (3 == array2[j]) {
                                    if (n3 != -139825594) {
                                        throw new IllegalStateException();
                                    }
                                    membersOnly = (array[n4].isMembersOnly(1029039210) ? 1 : 0);
                                    membersOnly2 = (world.isMembersOnly(1029039210) ? 1 : 0);
                                }
                                else {
                                    membersOnly = array[n4].id * -2091224171;
                                    membersOnly2 = -2091224171 * world.id;
                                }
                                if (membersOnly2 != membersOnly) {
                                    if (array3[j] == 1) {
                                        if (n3 != -139825594) {
                                            return;
                                        }
                                        if (membersOnly > membersOnly2) {
                                            if (n3 != -139825594) {
                                                throw new IllegalStateException();
                                            }
                                            break;
                                        }
                                    }
                                    if (array3[j] == 0) {
                                        if (n3 != -139825594) {
                                            throw new IllegalStateException();
                                        }
                                        if (membersOnly < membersOnly2) {
                                            break;
                                        }
                                    }
                                    n6 = 0;
                                    break;
                                }
                                if (n3 != -139825594) {
                                    throw new IllegalStateException();
                                }
                                if (j == 3) {
                                    if (n3 != -139825594) {
                                        throw new IllegalStateException();
                                    }
                                    n6 = 0;
                                }
                            }
                            if (n6 == 0) {
                                if (n3 != -139825594) {
                                    throw new IllegalStateException();
                                }
                                int n7 = 1;
                                while (true) {
                                    ++i;
                                    for (int k = 0; k < 4; ++k) {
                                        if (n3 != -139825594) {
                                            return;
                                        }
                                        int n8;
                                        int n9;
                                        if (2 == array2[k]) {
                                            n8 = 1692771375 * array[i].index;
                                            n9 = 1692771375 * world.index;
                                        }
                                        else if (array2[k] == 1) {
                                            if (n3 != -139825594) {
                                                throw new IllegalStateException();
                                            }
                                            n8 = array[i].population * -1396846889;
                                            n9 = -1396846889 * world.population;
                                            if (-1 == n8) {
                                                if (n3 != -139825594) {
                                                    throw new IllegalStateException();
                                                }
                                                if (1 == array3[k]) {
                                                    if (n3 != -139825594) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n8 = 2001;
                                                }
                                            }
                                            if (-1 == n9 && array3[k] == 1) {
                                                if (n3 != -139825594) {
                                                    return;
                                                }
                                                n9 = 2001;
                                            }
                                        }
                                        else if (3 == array2[k]) {
                                            if (n3 != -139825594) {
                                                throw new IllegalStateException();
                                            }
                                            int n10;
                                            if (array[i].isMembersOnly(1029039210)) {
                                                if (n3 != -139825594) {
                                                    throw new IllegalStateException();
                                                }
                                                n10 = 1;
                                            }
                                            else {
                                                n10 = 0;
                                            }
                                            n8 = n10;
                                            int n11;
                                            if (world.isMembersOnly(1029039210)) {
                                                if (n3 != -139825594) {
                                                    throw new IllegalStateException();
                                                }
                                                n11 = 1;
                                            }
                                            else {
                                                n11 = 0;
                                            }
                                            n9 = n11;
                                        }
                                        else {
                                            n8 = array[i].id * -2091224171;
                                            n9 = world.id * -2091224171;
                                        }
                                        if (n8 != n9) {
                                            if (1 == array3[k]) {
                                                if (n3 != -139825594) {
                                                    throw new IllegalStateException();
                                                }
                                                if (n8 < n9) {
                                                    if (n3 != -139825594) {
                                                        return;
                                                    }
                                                    break;
                                                }
                                            }
                                            if (array3[k] == 0) {
                                                if (n3 != -139825594) {
                                                    throw new IllegalStateException();
                                                }
                                                if (n8 > n9) {
                                                    break;
                                                }
                                            }
                                            n7 = 0;
                                            break;
                                        }
                                        if (n3 != -139825594) {
                                            return;
                                        }
                                        if (3 == k) {
                                            if (n3 != -139825594) {
                                                throw new IllegalStateException();
                                            }
                                            n7 = 0;
                                        }
                                    }
                                    if (n7 == 0) {
                                        if (n3 != -139825594) {
                                            throw new IllegalStateException();
                                        }
                                        if (i < n4) {
                                            if (n3 != -139825594) {
                                                throw new IllegalStateException();
                                            }
                                            final World world2 = array[i];
                                            array[i] = array[n4];
                                            array[n4] = world2;
                                        }
                                        continue Label_0141;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                sortWorlds(array, n, n4, array2, array3, -139825594);
                sortWorlds(array, 1 + n4, n2, array2, array3, -139825594);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ex.aw(" + ')');
        }
    }
    
    public int sortWorlds() {
        return this.field1205 * 1278841248;
    }
    
    static class123[] al() {
        return new class123[] { class123.field1207, class123.field1200, class123.field1202, class123.field1203, class123.field1204 };
    }
    
    @Override
    public int an() {
        return this.field1205 * 1494955129;
    }
    
    @Override
    public int ac() {
        return this.field1205 * -1446996376;
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return this.field1205 * 355070857;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ex.af(" + ')');
        }
    }
    
    public static void dr(final WorldMapManager worldMapManager) {
        if (worldMapManager == null) {
            worldMapManager.bg();
        }
        worldMapManager.icons = null;
    }
    
    static class123[] aq() {
        return new class123[] { class123.field1207, class123.field1200, class123.field1202, class123.field1203, class123.field1204 };
    }
}
