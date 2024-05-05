import net.runelite.api.events.WorldListLoad;
import net.runelite.api.WorldType;
import java.util.EnumSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class World implements net.runelite.api.World
{
    public static final int di = 104;
    static final int an = 2;
    static int World_count;
    static int[] World_sortOption2;
    static int[] World_sortOption1;
    public static final float aa = 9925.0f;
    static final int au = 100;
    int properties;
    int population;
    String host;
    String activity;
    int location;
    int id;
    static IndexedSprite[] worldSelectStars;
    public static FriendSystem friendSystem;
    int index;
    static int World_listCount;
    static final int af = 3;
    
    World() {
    }
    
    static {
        World.World_count = 0;
        World.World_listCount = 0;
        World.World_sortOption2 = new int[] { 1, 1, 1, 1 };
        World.World_sortOption1 = new int[] { 0, 1, 2, 3 };
    }
    
    boolean cs() {
        return 0x0 != (0x2000000 & this.properties * 1810954985);
    }
    
    boolean ca() {
        return 0x0 != (0x71F94A53 & this.properties * -322881781);
    }
    
    static void ad(final World[] array, final int n, final int n2, final int[] array2, final int[] array3) {
        if (n < n2) {
            int i = n - 1;
            int n3 = 1 + n2;
            final int n4 = (n2 + n) / 2;
            final World world = array[n4];
            array[n4] = array[n];
            array[n] = world;
            while (i < n3) {
                int n5 = 1;
                do {
                    --n3;
                    int j = 0;
                    while (j < 4) {
                        int membersOnly;
                        int membersOnly2;
                        if (array2[j] == 2) {
                            membersOnly = array[n3].index * 1692771375;
                            membersOnly2 = 1692771375 * world.index;
                        }
                        else if (1 == array2[j]) {
                            membersOnly = array[n3].population * -1285044437;
                            membersOnly2 = world.population * -1396846889;
                            if (membersOnly == -1 && array3[j] == 1) {
                                membersOnly = -1380474621;
                            }
                            if (membersOnly2 == -1 && 1 == array3[j]) {
                                membersOnly2 = -37290568;
                            }
                        }
                        else if (3 == array2[j]) {
                            membersOnly = (array[n3].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly2 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly = array[n3].id * 701051639;
                            membersOnly2 = -28182129 * world.id;
                        }
                        if (membersOnly2 == membersOnly) {
                            if (j == 3) {
                                n5 = 0;
                            }
                            ++j;
                        }
                        else {
                            if (array3[j] == 1 && membersOnly > membersOnly2) {
                                break;
                            }
                            if (array3[j] == 0 && membersOnly < membersOnly2) {
                                break;
                            }
                            n5 = 0;
                            break;
                        }
                    }
                } while (n5 != 0);
                boolean b = true;
                do {
                    ++i;
                    int k = 0;
                    while (k < 4) {
                        int membersOnly3;
                        int membersOnly4;
                        if (2 == array2[k]) {
                            membersOnly3 = -2012355743 * array[i].index;
                            membersOnly4 = 1955999118 * world.index;
                        }
                        else if (array2[k] == 1) {
                            membersOnly3 = array[i].population * 522318529;
                            membersOnly4 = -1541536788 * world.population;
                            if (-1 == membersOnly3 && 1 == array3[k]) {
                                membersOnly3 = 2001;
                            }
                            if (-1 == membersOnly4 && array3[k] == 1) {
                                membersOnly4 = -1013650735;
                            }
                        }
                        else if (3 == array2[k]) {
                            membersOnly3 = (array[i].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly4 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly3 = array[i].id * -2091224171;
                            membersOnly4 = world.id * -2091224171;
                        }
                        if (membersOnly3 == membersOnly4) {
                            if (3 == k) {
                                b = false;
                            }
                            ++k;
                        }
                        else {
                            if (1 == array3[k] && membersOnly3 < membersOnly4) {
                                break;
                            }
                            if (array3[k] == 0 && membersOnly3 > membersOnly4) {
                                break;
                            }
                            b = false;
                            break;
                        }
                    }
                } while (b);
                if (i < n3) {
                    final World world2 = array[i];
                    array[i] = array[n3];
                    array[n3] = world2;
                }
            }
            class123.sortWorlds(array, n, n3, array2, array3, -139825594);
            class123.sortWorlds(array, 1 + n3, n2, array2, array3, -139825594);
        }
    }
    
    static void ae(final World[] array, final int n, final int n2, final int[] array2, final int[] array3) {
        if (n < n2) {
            int i = n - 1;
            int n3 = 1 + n2;
            final int n4 = (n2 + n) / 2;
            final World world = array[n4];
            array[n4] = array[n];
            array[n] = world;
            while (i < n3) {
                boolean b = true;
                do {
                    --n3;
                    int j = 0;
                    while (j < 4) {
                        int membersOnly;
                        int membersOnly2;
                        if (array2[j] == 2) {
                            membersOnly = array[n3].index * 1692771375;
                            membersOnly2 = -2048476021 * world.index;
                        }
                        else if (1 == array2[j]) {
                            membersOnly = array[n3].population * 785052224;
                            membersOnly2 = world.population * -1731199206;
                            if (membersOnly == -1 && array3[j] == 1) {
                                membersOnly = -1435081503;
                            }
                            if (membersOnly2 == -1 && 1 == array3[j]) {
                                membersOnly2 = -48183078;
                            }
                        }
                        else if (3 == array2[j]) {
                            membersOnly = (array[n3].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly2 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly = array[n3].id * 1038837104;
                            membersOnly2 = -2091224171 * world.id;
                        }
                        if (membersOnly2 == membersOnly) {
                            if (j == 3) {
                                b = false;
                            }
                            ++j;
                        }
                        else {
                            if (array3[j] == 1 && membersOnly > membersOnly2) {
                                break;
                            }
                            if (array3[j] == 0 && membersOnly < membersOnly2) {
                                break;
                            }
                            b = false;
                            break;
                        }
                    }
                } while (b);
                boolean b2 = true;
                do {
                    ++i;
                    int k = 0;
                    while (k < 4) {
                        int membersOnly3;
                        int membersOnly4;
                        if (2 == array2[k]) {
                            membersOnly3 = 1692771375 * array[i].index;
                            membersOnly4 = 1692771375 * world.index;
                        }
                        else if (array2[k] == 1) {
                            membersOnly3 = array[i].population * 2083371297;
                            membersOnly4 = -1396846889 * world.population;
                            if (-1 == membersOnly3 && 1 == array3[k]) {
                                membersOnly3 = -951055042;
                            }
                            if (-1 == membersOnly4 && array3[k] == 1) {
                                membersOnly4 = 2001;
                            }
                        }
                        else if (3 == array2[k]) {
                            membersOnly3 = (array[i].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly4 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly3 = array[i].id * 795001401;
                            membersOnly4 = world.id * -1352194602;
                        }
                        if (membersOnly3 == membersOnly4) {
                            if (3 == k) {
                                b2 = false;
                            }
                            ++k;
                        }
                        else {
                            if (1 == array3[k] && membersOnly3 < membersOnly4) {
                                break;
                            }
                            if (array3[k] == 0 && membersOnly3 > membersOnly4) {
                                break;
                            }
                            b2 = false;
                            break;
                        }
                    }
                } while (b2);
                if (i < n3) {
                    final World world2 = array[i];
                    array[i] = array[n3];
                    array[n3] = world2;
                }
            }
            class123.sortWorlds(array, n, n3, array2, array3, -139825594);
            class123.sortWorlds(array, 1 + n3, n2, array2, array3, -139825594);
        }
    }
    
    boolean ce() {
        return 0x0 != (0xF2B0EF9A & 2042641166 * this.properties);
    }
    
    static void bb(final int n, final int n2, final int n3, final boolean b, final int n4, final boolean b2) {
        if (n < n2) {
            final int n5 = (n + n2) / 2;
            int n6 = n;
            final World world = class31.World_worlds[n5];
            class31.World_worlds[n5] = class31.World_worlds[n2];
            class31.World_worlds[n2] = world;
            for (int i = n; i < n2; ++i) {
                final World world2 = class31.World_worlds[i];
                final int compareWorlds = class297.compareWorlds(world2, world, n3, b, (byte)46);
                int n7;
                if (compareWorlds != 0) {
                    if (b) {
                        n7 = -compareWorlds;
                    }
                    else {
                        n7 = compareWorlds;
                    }
                }
                else if (n4 == -1) {
                    n7 = 0;
                }
                else {
                    final int compareWorlds2 = class297.compareWorlds(world2, world, n4, b2, (byte)124);
                    if (b2) {
                        n7 = -compareWorlds2;
                    }
                    else {
                        n7 = compareWorlds2;
                    }
                }
                if (n7 <= 0) {
                    final World world3 = class31.World_worlds[i];
                    class31.World_worlds[i] = class31.World_worlds[n6];
                    class31.World_worlds[n6++] = world3;
                }
            }
            class31.World_worlds[n2] = class31.World_worlds[n6];
            class31.World_worlds[n6] = world;
            class13.doWorldSorting(n, n6 - 1, n3, b, n4, b2, 1605754871);
            class13.doWorldSorting(n6 + 1, n2, n3, b, n4, b2, 1802510642);
        }
    }
    
    boolean cl() {
        return 0x0 != (0x8000000 & 1810954985 * this.properties);
    }
    
    public int getLocation() {
        return this.location * -665846519;
    }
    
    public int getId() {
        return this.id * -2091224171;
    }
    
    boolean bw() {
        return 0x0 != (0x20000000 & 1810954985 * this.properties);
    }
    
    boolean cf() {
        return 0x0 != (0x3D29DC0A & 1810954985 * this.properties);
    }
    
    boolean isPvp(final int n) {
        try {
            boolean b;
            if (0x0 != (0x4 & 1810954985 * this.properties)) {
                if (n <= -62347789) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.ao(" + ')');
        }
    }
    
    boolean isMembersOnly(final int n) {
        try {
            boolean b;
            if (0x0 != (0x1 & 1810954985 * this.properties)) {
                if (n != 1029039210) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.at(" + ')');
        }
    }
    
    static void ak(final World[] array, final int n, final int n2, final int[] array2, final int[] array3) {
        if (n < n2) {
            int i = n - 1;
            int n3 = 1 + n2;
            final int n4 = (n2 + n) / 2;
            final World world = array[n4];
            array[n4] = array[n];
            array[n] = world;
            while (i < n3) {
                int n5 = 1;
                do {
                    --n3;
                    int j = 0;
                    while (j < 4) {
                        int membersOnly;
                        int membersOnly2;
                        if (array2[j] == 2) {
                            membersOnly = array[n3].index * -428090983;
                            membersOnly2 = -978000198 * world.index;
                        }
                        else if (1 == array2[j]) {
                            membersOnly = array[n3].population * 1404938505;
                            membersOnly2 = world.population * -463886526;
                            if (membersOnly == -1 && array3[j] == 1) {
                                membersOnly = 2001;
                            }
                            if (membersOnly2 == -1 && 1 == array3[j]) {
                                membersOnly2 = 518748187;
                            }
                        }
                        else if (3 == array2[j]) {
                            membersOnly = (array[n3].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly2 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly = array[n3].id * -320619759;
                            membersOnly2 = 350882821 * world.id;
                        }
                        if (membersOnly2 == membersOnly) {
                            if (j == 3) {
                                n5 = 0;
                            }
                            ++j;
                        }
                        else {
                            if (array3[j] == 1 && membersOnly > membersOnly2) {
                                break;
                            }
                            if (array3[j] == 0 && membersOnly < membersOnly2) {
                                break;
                            }
                            n5 = 0;
                            break;
                        }
                    }
                } while (n5 != 0);
                boolean b = true;
                do {
                    ++i;
                    int k = 0;
                    while (k < 4) {
                        int membersOnly3;
                        int membersOnly4;
                        if (2 == array2[k]) {
                            membersOnly3 = 1692771375 * array[i].index;
                            membersOnly4 = 1554852401 * world.index;
                        }
                        else if (array2[k] == 1) {
                            membersOnly3 = array[i].population * -1396846889;
                            membersOnly4 = -1396846889 * world.population;
                            if (-1 == membersOnly3 && 1 == array3[k]) {
                                membersOnly3 = 2001;
                            }
                            if (-1 == membersOnly4 && array3[k] == 1) {
                                membersOnly4 = -1670228147;
                            }
                        }
                        else if (3 == array2[k]) {
                            membersOnly3 = (array[i].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly4 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly3 = array[i].id * -2091224171;
                            membersOnly4 = world.id * -2091224171;
                        }
                        if (membersOnly3 == membersOnly4) {
                            if (3 == k) {
                                b = false;
                            }
                            ++k;
                        }
                        else {
                            if (1 == array3[k] && membersOnly3 < membersOnly4) {
                                break;
                            }
                            if (array3[k] == 0 && membersOnly3 > membersOnly4) {
                                break;
                            }
                            b = false;
                            break;
                        }
                    }
                } while (b);
                if (i < n3) {
                    final World world2 = array[i];
                    array[i] = array[n3];
                    array[n3] = world2;
                }
            }
            class123.sortWorlds(array, n, n3, array2, array3, -139825594);
            class123.sortWorlds(array, 1 + n3, n2, array2, array3, -139825594);
        }
    }
    
    boolean method405(final int n) {
        try {
            return (0x100 & 1810954985 * this.properties) != 0x0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.av(" + ')');
        }
    }
    
    public String getAddress() {
        return this.host;
    }
    
    static void be(final int n, final int n2, final int n3, final boolean b, final int n4, final boolean b2) {
        if (n < n2) {
            final int n5 = (n + n2) / 2;
            int n6 = n;
            final World world = class31.World_worlds[n5];
            class31.World_worlds[n5] = class31.World_worlds[n2];
            class31.World_worlds[n2] = world;
            for (int i = n; i < n2; ++i) {
                final World world2 = class31.World_worlds[i];
                final int compareWorlds = class297.compareWorlds(world2, world, n3, b, (byte)77);
                int n7;
                if (compareWorlds != 0) {
                    if (b) {
                        n7 = -compareWorlds;
                    }
                    else {
                        n7 = compareWorlds;
                    }
                }
                else if (n4 == -1) {
                    n7 = 0;
                }
                else {
                    final int compareWorlds2 = class297.compareWorlds(world2, world, n4, b2, (byte)124);
                    if (b2) {
                        n7 = -compareWorlds2;
                    }
                    else {
                        n7 = compareWorlds2;
                    }
                }
                if (n7 <= 0) {
                    final World world3 = class31.World_worlds[i];
                    class31.World_worlds[i] = class31.World_worlds[n6];
                    class31.World_worlds[n6++] = world3;
                }
            }
            class31.World_worlds[n2] = class31.World_worlds[n6];
            class31.World_worlds[n6] = world;
            class13.doWorldSorting(n, n6 - 1, n3, b, n4, b2, 518814110);
            class13.doWorldSorting(n6 + 1, n2, n3, b, n4, b2, 2027862219);
        }
    }
    
    static void as(final int n, final int n2) {
        final int[] world_sortOption1 = new int[4];
        final int[] world_sortOption2 = new int[4];
        world_sortOption1[0] = n;
        world_sortOption2[0] = n2;
        int n3 = 1;
        for (int i = 0; i < 4; ++i) {
            if (n != World.World_sortOption1[i]) {
                world_sortOption1[n3] = World.World_sortOption1[i];
                world_sortOption2[n3] = World.World_sortOption2[i];
                ++n3;
            }
        }
        World.World_sortOption1 = world_sortOption1;
        World.World_sortOption2 = world_sortOption2;
        class123.sortWorlds(class31.World_worlds, 0, class31.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2, -139825594);
    }
    
    public int getIndex() {
        return this.index * 1692771375;
    }
    
    static void az(final World[] array, final int n, final int n2, final int[] array2, final int[] array3) {
        if (n < n2) {
            int i = n - 1;
            int n3 = 1 + n2;
            final int n4 = (n2 + n) / 2;
            final World world = array[n4];
            array[n4] = array[n];
            array[n] = world;
            while (i < n3) {
                int n5 = 1;
                do {
                    --n3;
                    int j = 0;
                    while (j < 4) {
                        int membersOnly;
                        int membersOnly2;
                        if (array2[j] == 2) {
                            membersOnly = array[n3].index * 1692771375;
                            membersOnly2 = 1692771375 * world.index;
                        }
                        else if (1 == array2[j]) {
                            membersOnly = array[n3].population * -1396846889;
                            membersOnly2 = world.population * -1396846889;
                            if (membersOnly == -1 && array3[j] == 1) {
                                membersOnly = 2001;
                            }
                            if (membersOnly2 == -1 && 1 == array3[j]) {
                                membersOnly2 = 2001;
                            }
                        }
                        else if (3 == array2[j]) {
                            membersOnly = (array[n3].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly2 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly = array[n3].id * -2091224171;
                            membersOnly2 = -2091224171 * world.id;
                        }
                        if (membersOnly2 == membersOnly) {
                            if (j == 3) {
                                n5 = 0;
                            }
                            ++j;
                        }
                        else {
                            if (array3[j] == 1 && membersOnly > membersOnly2) {
                                break;
                            }
                            if (array3[j] == 0 && membersOnly < membersOnly2) {
                                break;
                            }
                            n5 = 0;
                            break;
                        }
                    }
                } while (n5 != 0);
                boolean b = true;
                do {
                    ++i;
                    int k = 0;
                    while (k < 4) {
                        int membersOnly3;
                        int membersOnly4;
                        if (2 == array2[k]) {
                            membersOnly3 = 1692771375 * array[i].index;
                            membersOnly4 = 1692771375 * world.index;
                        }
                        else if (array2[k] == 1) {
                            membersOnly3 = array[i].population * -1396846889;
                            membersOnly4 = -1396846889 * world.population;
                            if (-1 == membersOnly3 && 1 == array3[k]) {
                                membersOnly3 = 2001;
                            }
                            if (-1 == membersOnly4 && array3[k] == 1) {
                                membersOnly4 = 2001;
                            }
                        }
                        else if (3 == array2[k]) {
                            membersOnly3 = (array[i].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly4 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly3 = array[i].id * -2091224171;
                            membersOnly4 = world.id * -2091224171;
                        }
                        if (membersOnly3 == membersOnly4) {
                            if (3 == k) {
                                b = false;
                            }
                            ++k;
                        }
                        else {
                            if (1 == array3[k] && membersOnly3 < membersOnly4) {
                                break;
                            }
                            if (array3[k] == 0 && membersOnly3 > membersOnly4) {
                                break;
                            }
                            b = false;
                            break;
                        }
                    }
                } while (b);
                if (i < n3) {
                    final World world2 = array[i];
                    array[i] = array[n3];
                    array[n3] = world2;
                }
            }
            class123.sortWorlds(array, n, n3, array2, array3, -139825594);
            class123.sortWorlds(array, 1 + n3, n2, array2, array3, -139825594);
        }
    }
    
    boolean method402(final byte b) {
        try {
            boolean b2;
            if (0x0 != (0x8 & this.properties * 1810954985)) {
                if (b <= 1) {
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
            throw HealthBar.get(ex, "cl.ax(" + ')');
        }
    }
    
    boolean method408(final int n) {
        try {
            boolean b;
            if (0x0 != (0x2 & this.properties * 1810954985)) {
                if (n <= -549033243) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.ay(" + ')');
        }
    }
    
    static void bi(final int n, final int n2, final int n3, final boolean b, final int n4, final boolean b2) {
        if (n < n2) {
            final int n5 = (n + n2) / 2;
            int n6 = n;
            final World world = class31.World_worlds[n5];
            class31.World_worlds[n5] = class31.World_worlds[n2];
            class31.World_worlds[n2] = world;
            for (int i = n; i < n2; ++i) {
                final World world2 = class31.World_worlds[i];
                final int compareWorlds = class297.compareWorlds(world2, world, n3, b, (byte)72);
                int n7;
                if (compareWorlds != 0) {
                    if (b) {
                        n7 = -compareWorlds;
                    }
                    else {
                        n7 = compareWorlds;
                    }
                }
                else if (n4 == -1) {
                    n7 = 0;
                }
                else {
                    final int compareWorlds2 = class297.compareWorlds(world2, world, n4, b2, (byte)3);
                    if (b2) {
                        n7 = -compareWorlds2;
                    }
                    else {
                        n7 = compareWorlds2;
                    }
                }
                if (n7 <= 0) {
                    final World world3 = class31.World_worlds[i];
                    class31.World_worlds[i] = class31.World_worlds[n6];
                    class31.World_worlds[n6++] = world3;
                }
            }
            class31.World_worlds[n2] = class31.World_worlds[n6];
            class31.World_worlds[n6] = world;
            class13.doWorldSorting(n, n6 - 1, n3, b, n4, b2, 1456170259);
            class13.doWorldSorting(n6 + 1, n2, n3, b, n4, b2, 2135289087);
        }
    }
    
    public int bi() {
        return this.properties * 1810954985;
    }
    
    boolean bv() {
        return 0x0 != (0x2 & this.properties * 1810954985);
    }
    
    public static boolean wc(final World world) {
        return 0x0 != (0x1 & 1810954985 * world.properties);
    }
    
    boolean ck() {
        return 0x0 != (0x40000000 & 1810954985 * this.properties);
    }
    
    static World bo() {
        World.World_listCount = 0;
        return Interpreter.getNextWorldListWorld(1882621095);
    }
    
    boolean bp() {
        return 0x0 != (0x2 & this.properties * 1810954985);
    }
    
    boolean cc() {
        return 0x0 != (0xF5F5472 & this.properties * 647523148);
    }
    
    static World bt() {
        if (285408389 * World.World_listCount < World.World_count * -734287707) {
            return class31.World_worlds[(World.World_listCount -= 1658479539) * 285408389 - 1];
        }
        return null;
    }
    
    boolean bc() {
        return 0x0 != (0x4 & 1810954985 * this.properties);
    }
    
    boolean br() {
        return (0x10000 & this.properties * 1810954985) != 0x0;
    }
    
    boolean ci() {
        return 0x0 != (0x20000000 & 1810954985 * this.properties);
    }
    
    public void setIndex(final int n) {
        this.index = n * -484564273;
    }
    
    static void am(final int n, final int n2) {
        final int[] world_sortOption1 = new int[4];
        final int[] world_sortOption2 = new int[4];
        world_sortOption1[0] = n;
        world_sortOption2[0] = n2;
        int n3 = 1;
        for (int i = 0; i < 4; ++i) {
            if (n != World.World_sortOption1[i]) {
                world_sortOption1[n3] = World.World_sortOption1[i];
                world_sortOption2[n3] = World.World_sortOption2[i];
                ++n3;
            }
        }
        World.World_sortOption1 = world_sortOption1;
        World.World_sortOption2 = world_sortOption2;
        class123.sortWorlds(class31.World_worlds, 0, class31.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2, -139825594);
    }
    
    public static boolean mm(final World world) {
        return (0x10000 & world.properties * 1810954985) != 0x0;
    }
    
    boolean cu() {
        return 0x0 != (0x40000000 & 1810954985 * this.properties);
    }
    
    boolean bq() {
        return 0x0 != (0x2 & this.properties * 1810954985);
    }
    
    boolean isDeadman(final int n) {
        try {
            boolean b;
            if ((0x10000 & this.properties * 1810954985) != 0x0) {
                if (n == 1213720291) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.aa(" + ')');
        }
    }
    
    boolean method407(final byte b) {
        try {
            boolean b2;
            if (0x0 != (0x8000000 & 1810954985 * this.population)) {
                if (b <= 1) {
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
            throw HealthBar.get(ex, "cl.ar(" + ')');
        }
    }
    
    public void setLocation(final int n) {
        this.location = n * 421437753;
    }
    
    boolean bh() {
        return 0x0 != (0x3D29DC0A & 1810954985 * this.properties);
    }
    
    static void by(final int n, final boolean b, final int n2, final boolean b2) {
        if (class31.World_worlds != null) {
            class13.doWorldSorting(0, class31.World_worlds.length - 1, n, b, n2, b2, 1518346296);
        }
    }
    
    static World bx() {
        World.World_listCount = 0;
        return Interpreter.getNextWorldListWorld(1732037426);
    }
    
    boolean method406(final byte b) {
        try {
            boolean b2;
            if (0x0 != (0x8000000 & 1810954985 * this.properties)) {
                if (b <= 1) {
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
            throw HealthBar.get(ex, "cl.ar(" + ')');
        }
    }
    
    static void ap(final int n, final boolean b, final int n2, final boolean b2) {
        if (class31.World_worlds != null) {
            class13.doWorldSorting(0, class31.World_worlds.length - 1, n, b, n2, b2, 1840943622);
        }
    }
    
    static World bd() {
        if (285408389 * World.World_listCount < World.World_count * -734287707) {
            return class31.World_worlds[(World.World_listCount -= 1658479539) * 285408389 - 1];
        }
        return null;
    }
    
    boolean cm() {
        return 0x0 != (0x8000000 & 1810954985 * this.properties);
    }
    
    public static boolean hu(final World world, final int n) {
        if (world == null) {
            return world.isBeta(n);
        }
        try {
            return 0x0 != (0x2000000 & world.properties * 1810954985);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.ag(" + ')');
        }
    }
    
    public static void method409(final AbstractArchive floorUnderlayDefinition_archive, final short n) {
        try {
            FloorUnderlayDefinition.FloorUnderlayDefinition_archive = floorUnderlayDefinition_archive;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.af(" + ')');
        }
    }
    
    static int Messages_getHistorySize(final int i, final byte b) {
        try {
            final ChatChannel chatChannel = Messages.Messages_channels.get(i);
            if (chatChannel != null) {
                return chatChannel.size(1727774568);
            }
            if (b <= 126) {
                throw new IllegalStateException();
            }
            return 0;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.ab(" + ')');
        }
    }
    
    static void aj(final World[] array, final int n, final int n2, final int[] array2, final int[] array3) {
        if (n < n2) {
            int i = n - 1;
            int n3 = 1 + n2;
            final int n4 = (n2 + n) / 2;
            final World world = array[n4];
            array[n4] = array[n];
            array[n] = world;
            while (i < n3) {
                boolean b = true;
                do {
                    --n3;
                    int j = 0;
                    while (j < 4) {
                        int membersOnly;
                        int membersOnly2;
                        if (array2[j] == 2) {
                            membersOnly = array[n3].index * 1692771375;
                            membersOnly2 = 1692771375 * world.index;
                        }
                        else if (1 == array2[j]) {
                            membersOnly = array[n3].population * -1396846889;
                            membersOnly2 = world.population * -1396846889;
                            if (membersOnly == -1 && array3[j] == 1) {
                                membersOnly = 2001;
                            }
                            if (membersOnly2 == -1 && 1 == array3[j]) {
                                membersOnly2 = 2001;
                            }
                        }
                        else if (3 == array2[j]) {
                            membersOnly = (array[n3].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly2 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly = array[n3].id * -2091224171;
                            membersOnly2 = -2091224171 * world.id;
                        }
                        if (membersOnly2 == membersOnly) {
                            if (j == 3) {
                                b = false;
                            }
                            ++j;
                        }
                        else {
                            if (array3[j] == 1 && membersOnly > membersOnly2) {
                                break;
                            }
                            if (array3[j] == 0 && membersOnly < membersOnly2) {
                                break;
                            }
                            b = false;
                            break;
                        }
                    }
                } while (b);
                boolean b2 = true;
                do {
                    ++i;
                    int k = 0;
                    while (k < 4) {
                        int membersOnly3;
                        int membersOnly4;
                        if (2 == array2[k]) {
                            membersOnly3 = 1692771375 * array[i].index;
                            membersOnly4 = 1692771375 * world.index;
                        }
                        else if (array2[k] == 1) {
                            membersOnly3 = array[i].population * -1396846889;
                            membersOnly4 = -1396846889 * world.population;
                            if (-1 == membersOnly3 && 1 == array3[k]) {
                                membersOnly3 = 2001;
                            }
                            if (-1 == membersOnly4 && array3[k] == 1) {
                                membersOnly4 = 2001;
                            }
                        }
                        else if (3 == array2[k]) {
                            membersOnly3 = (array[i].isMembersOnly(1029039210) ? 1 : 0);
                            membersOnly4 = (world.isMembersOnly(1029039210) ? 1 : 0);
                        }
                        else {
                            membersOnly3 = array[i].id * -2091224171;
                            membersOnly4 = world.id * -2091224171;
                        }
                        if (membersOnly3 == membersOnly4) {
                            if (3 == k) {
                                b2 = false;
                            }
                            ++k;
                        }
                        else {
                            if (1 == array3[k] && membersOnly3 < membersOnly4) {
                                break;
                            }
                            if (array3[k] == 0 && membersOnly3 > membersOnly4) {
                                break;
                            }
                            b2 = false;
                            break;
                        }
                    }
                } while (b2);
                if (i < n3) {
                    final World world2 = array[i];
                    array[i] = array[n3];
                    array[n3] = world2;
                }
            }
            class123.sortWorlds(array, n, n3, array2, array3, -139825594);
            class123.sortWorlds(array, 1 + n3, n2, array2, array3, -139825594);
        }
    }
    
    boolean isBeta(final int n) {
        try {
            boolean b;
            if (0x0 != (0x2 & this.id * 1810954985)) {
                if (n <= -549033243) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.ay(" + ')');
        }
    }
    
    public EnumSet getTypes() {
        return WorldType.fromMask(this.bi());
    }
    
    static World bz() {
        World.World_listCount = 0;
        return Interpreter.getNextWorldListWorld(1905406195);
    }
    
    public static boolean vh(final World world) {
        return (0x10000 & world.properties * 1810954985) != 0x0;
    }
    
    public void setId(final int n) {
        this.id = n * -2098511939;
    }
    
    boolean cq() {
        return 0x0 != (0x40000000 & 1810954985 * this.properties);
    }
    
    static World bm() {
        if (285408389 * World.World_listCount < World.World_count * -734287707) {
            return class31.World_worlds[(World.World_listCount += 2046807651) * 1604352365 - 1];
        }
        return null;
    }
    
    static int bk(final World world, final World world2, final int n, final boolean b) {
        if (n == 1) {
            int n2 = -1396846889 * world.population;
            int n3 = -1396846889 * world2.population;
            if (!b) {
                if (-1 == n2) {
                    n2 = 2001;
                }
                if (n3 == -1) {
                    n3 = 2001;
                }
            }
            return n2 - n3;
        }
        if (n == 2) {
            return -665846519 * world.location - -665846519 * world2.location;
        }
        if (n == 3) {
            if (world.activity.equals("-")) {
                if (world2.activity.equals("-")) {
                    return 0;
                }
                return b ? -1 : 1;
            }
            else {
                if (world2.activity.equals("-")) {
                    return b ? 1 : -1;
                }
                return world.activity.compareTo(world2.activity);
            }
        }
        else {
            if (4 == n) {
                return ez(world, (byte)4) ? (!ez(world2, (byte)84)) : (ez(world2, (byte)54) ? -1 : 0);
            }
            if (n == 5) {
                return world.method408(2080325785) ? (world2.method408(733648997) ? 0 : 1) : (world2.method408(-173752121) ? -1 : 0);
            }
            if (n == 6) {
                return world.isPvp(929048546) ? (world2.isPvp(2069096141) ? 0 : 1) : (world2.isPvp(36259478) ? -1 : 0);
            }
            if (7 == n) {
                return world.isMembersOnly(1029039210) ? (world2.isMembersOnly(1029039210) ? 0 : 1) : (world2.isMembersOnly(1029039210) ? -1 : 0);
            }
            return -2091224171 * world.id - world2.id * -2091224171;
        }
    }
    
    public void lu(final int n) {
        final World[] wj = ScriptFrame.client.wj();
        if (wj != null && wj.length > 0 && wj[wj.length - 1] == this) {
            ScriptFrame.client.getCallbacks().post((Object)new WorldListLoad((net.runelite.api.World[])wj));
        }
    }
    
    public static boolean ez(final World world, final byte b) {
        if (world == null) {
            world.method402(b);
        }
        try {
            boolean b2;
            if (0x0 != (0x8 & world.properties * 1810954985)) {
                if (b <= 1) {
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
            throw HealthBar.get(ex, "cl.ax(" + ')');
        }
    }
    
    boolean method404(final byte b) {
        try {
            return 0x0 != (0x40000000 & 1810954985 * this.properties);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cl.ah(" + ')');
        }
    }
    
    public static boolean yk(final World world, final byte b) {
        if (world == null) {
            return world.method407(b);
        }
        try {
            boolean b2;
            if (0x0 != (0x20000000 & 1810954985 * world.properties)) {
                if (b <= 32) {
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
            throw HealthBar.get(ex, "cl.ai(" + ')');
        }
    }
    
    public void ul(final int n) {
        this.properties = n * 1038974297;
    }
    
    boolean bu() {
        return (0xA466CAB4 & this.properties * 1810954985) != 0x0;
    }
    
    public void setPlayerCount(final int n) {
        this.population = n * 1838744807;
    }
    
    public String getActivity() {
        return this.activity;
    }
    
    public void setAddress(final String host) {
        this.host = host;
    }
    
    public void setTypes(final EnumSet set) {
        this.ul(WorldType.toMask(set));
    }
    
    public void setActivity(final String activity) {
        this.activity = activity;
    }
    
    public int getPlayerCount() {
        return this.population * -1396846889;
    }
}
