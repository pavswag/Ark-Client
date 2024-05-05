import net.runelite.api.Nameable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Comparator;
import net.runelite.api.NameableContainer;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class UserList implements NameableContainer
{
    int size;
    final int capacity;
    User[] array;
    Comparator comparator;
    HashMap previousUsernamesMap;
    HashMap usernamesMap;
    
    UserList(final int n) {
        this.size = 0;
        this.comparator = null;
        this.capacity = n * 450790185;
        this.array = this.newTypedArray(n, -463450295);
        this.usernamesMap = new HashMap(n / 8);
        this.previousUsernamesMap = new HashMap(n / 8);
    }
    
    public void cs() {
        this.size = 0;
        Arrays.fill(this.array, null);
        this.usernamesMap.clear();
        this.previousUsernamesMap.clear();
    }
    
    final void dp(final User user) {
        if (this.usernamesMap.remove(user.username) == null) {
            throw new IllegalStateException();
        }
        if (user.previousUsername != null) {
            this.previousUsernamesMap.remove(user.previousUsername);
        }
    }
    
    User getByPreviousUsername(final Username key, final int n) {
        try {
            if (key.hasCleanName(1247326473)) {
                return this.previousUsernamesMap.get(key);
            }
            if (n == -1613504065) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bs(" + ')');
        }
    }
    
    public int ca() {
        return this.size * -940640785;
    }
    
    public final void sort(final byte b) {
        try {
            if (null == this.comparator) {
                if (b == -126) {
                    return;
                }
                Arrays.sort(this.array, 0, -940640785 * this.size);
            }
            else {
                Arrays.sort(this.array, 0, -940640785 * this.size, this.comparator);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.ba(" + ')');
        }
    }
    
    public User cr(final Username username) {
        final User gk = gk(this, username, (short)197);
        if (gk != null) {
            return gk;
        }
        return this.getByPreviousUsername(username, -1350769537);
    }
    
    public final void removeComparator(final int n) {
        try {
            this.comparator = null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.ce(" + ')');
        }
    }
    
    User cb(final Username key) {
        if (!key.hasCleanName(564109641)) {
            return null;
        }
        return this.previousUsernamesMap.get(key);
    }
    
    public final void da(final Comparator comparator) {
        if (this.comparator == null) {
            this.comparator = comparator;
        }
        else if (this.comparator instanceof AbstractUserComparator) {
            ((AbstractUserComparator)this.comparator).addComparator(comparator, 1993452523);
        }
    }
    
    public boolean cl(final Username username) {
        return username.hasCleanName(1087343221) && (this.usernamesMap.containsKey(username) || this.previousUsernamesMap.containsKey(username));
    }
    
    public void cn() {
        this.size = 0;
        Arrays.fill(this.array, null);
        this.usernamesMap.clear();
        this.previousUsernamesMap.clear();
    }
    
    public static User pn(final UserList list, final int index, final int n) {
        if (list == null) {
            return list.get(index, index);
        }
        try {
            if (index >= 0) {
                if (index < list.size * -940640785) {
                    return list.array[index];
                }
                if (n <= -808951927) {
                    throw new IllegalStateException();
                }
            }
            throw new ArrayIndexOutOfBoundsException(index);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bq(" + ')');
        }
    }
    
    final void db(final User user) {
        if (this.usernamesMap.remove(user.username) == null) {
            throw new IllegalStateException();
        }
        if (user.previousUsername != null) {
            this.previousUsernamesMap.remove(user.previousUsername);
        }
    }
    
    public int getCount() {
        return this.size * -940640785;
    }
    
    public static void lr(final UserList list, final User user) {
        if (list == null) {
            list.dr();
            return;
        }
        final int index = list.indexOf(user, -1408177467);
        if (-1 == index) {
            return;
        }
        list.arrayRemove(index, (byte)(-95));
        list.mapRemove(user, (byte)84);
    }
    
    final void arrayRemove(final int n, final byte b) {
        try {
            this.size -= 905500943;
            if (n < -940640785 * this.size) {
                System.arraycopy(this.array, 1 + n, this.array, n, -940640785 * this.size - n);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bw(" + ')');
        }
    }
    
    public boolean cf(final Username username) {
        return username.hasCleanName(-1264295331) && (this.usernamesMap.containsKey(username) || this.previousUsernamesMap.containsKey(username));
    }
    
    public void sj(final Username username, final Username username2) {
    }
    
    public int getSize() {
        return this.capacity * -734344935;
    }
    
    abstract User[] at(final int p0);
    
    public Nameable[] getMembers() {
        return Arrays.copyOf((Nameable[])this.gh(), this.getCount());
    }
    
    User dw(final Username username, final Username username2) {
        if (gk(this, username, (short)197) != null) {
            throw new IllegalStateException();
        }
        final User instance = this.newInstance(209911376);
        instance.set(username, username2, (byte)67);
        nu(this, instance, (byte)(-19));
        this.mapPut(instance, 104957723);
        return instance;
    }
    
    final void cj(final User user) {
        final int index = this.indexOf(user, -920384063);
        if (-1 == index) {
            return;
        }
        this.arrayRemove(index, (byte)(-31));
        this.mapRemove(user, (byte)87);
    }
    
    User cp(final Username username) {
        return fm(this, username, null, (byte)(-59));
    }
    
    public User es(final Username username) {
        return gk(this, username, (short)197);
    }
    
    public static Node qk(final IterableNodeHashTableIterator iterableNodeHashTableIterator) {
        if (iterableNodeHashTableIterator == null) {
            iterableNodeHashTableIterator.remove();
        }
        iterableNodeHashTableIterator.start();
        return (Node)iterableNodeHashTableIterator.next();
    }
    
    final void changeName(final User user, final Username username, final Username username2, final int n) {
        try {
            this.mapRemove(user, (byte)54);
            user.set(username, username2, (byte)92);
            this.mapPut(user, -93307052);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bv(" + ')');
        }
    }
    
    public final void dl() {
        if (null == this.comparator) {
            Arrays.sort(this.array, 0, -940640785 * this.size);
        }
        else {
            Arrays.sort(this.array, 0, 482865869 * this.size, this.comparator);
        }
    }
    
    public int ck() {
        return this.size * -940640785;
    }
    
    public final void di() {
        if (null == this.comparator) {
            Arrays.sort(this.array, 0, 579160679 * this.size);
        }
        else {
            Arrays.sort(this.array, 0, -940640785 * this.size, this.comparator);
        }
    }
    
    final void mapRemove(final User user, final byte b) {
        try {
            if (this.usernamesMap.remove(user.username) == null) {
                throw new IllegalStateException();
            }
            if (user.previousUsername != null) {
                if (b == 3) {
                    return;
                }
                this.previousUsernamesMap.remove(user.previousUsername);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bp(" + ')');
        }
    }
    
    User ct(final Username username) {
        return fm(this, username, null, (byte)(-112));
    }
    
    public void cc() {
        this.size = 0;
        Arrays.fill(this.array, null);
        this.usernamesMap.clear();
        this.previousUsernamesMap.clear();
    }
    
    final void dv(final User user, final Username username, final Username username2) {
        this.mapRemove(user, (byte)53);
        user.set(username, username2, (byte)48);
        this.mapPut(user, -315468554);
    }
    
    public boolean contains(final Username username, final int n) {
        try {
            if (!username.hasCleanName(1868767994)) {
                if (n == -402145367) {
                    throw new IllegalStateException();
                }
                return false;
            }
            else {
                if (!this.usernamesMap.containsKey(username)) {
                    return this.previousUsernamesMap.containsKey(username);
                }
                if (n == -402145367) {
                    throw new IllegalStateException();
                }
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bt(" + ')');
        }
    }
    
    public final void ds() {
        this.comparator = null;
    }
    
    final int dh(final User user) {
        for (int i = 0; i < 351893259 * this.size; ++i) {
            if (this.array[i] == user) {
                return i;
            }
        }
        return -1;
    }
    
    final void arrayAddLast(final User user, final byte b) {
        try {
            this.array[(this.size += 905500943) * -940640785 - 1] = user;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bc(" + ')');
        }
    }
    
    public final boolean removeByUsername(final Username username, final short n) {
        try {
            final User gk = gk(this, username, (short)197);
            if (null != gk) {
                yv(this, gk, -1797777588);
                return true;
            }
            if (n >= 255) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.br(" + ')');
        }
    }
    
    public static void nu(final UserList list, final User user, final byte b) {
        if (list == null) {
            list.arrayAddLast(user, b);
        }
        try {
            list.array[(list.size += 905500943) * -940640785 - 1] = user;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bc(" + ')');
        }
    }
    
    public final void addComparator(final Comparator comparator, final byte b) {
        try {
            if (this.comparator == null) {
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                this.comparator = comparator;
            }
            else if (this.comparator instanceof AbstractUserComparator) {
                if (b <= 2) {
                    throw new IllegalStateException();
                }
                ((AbstractUserComparator)this.comparator).addComparator(comparator, 1664695442);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.ci(" + ')');
        }
    }
    
    abstract User[] al(final int p0);
    
    final void df(final User user) {
        this.array[(this.size += 52494639) * -940640785 - 1] = user;
    }
    
    public int cu() {
        return this.size * -940640785;
    }
    
    public static void no(final UserList list, final int n) {
        if (list == null) {
            list.dr();
            return;
        }
        list.size += 1657089250;
        if (n < -940640785 * list.size) {
            System.arraycopy(list.array, 1 + n, list.array, n, -940640785 * list.size - n);
        }
    }
    
    User dm(final Username username) {
        return fm(this, username, null, (byte)(-64));
    }
    
    abstract User[] newTypedArray(final int p0, final int p1);
    
    abstract User ac();
    
    public Nameable findByName(final String s) {
        return (Nameable)this.es(ScriptFrame.client.ad(s, ScriptFrame.client.cq()));
    }
    
    User cx(final Username key) {
        if (!key.hasCleanName(1171823974)) {
            return null;
        }
        return this.usernamesMap.get(key);
    }
    
    public final User get(final int index, final int n) {
        try {
            if (index >= 0) {
                if (index < this.size * -940640785) {
                    return this.array[index];
                }
                if (n <= -808951927) {
                    throw new IllegalStateException();
                }
            }
            throw new ArrayIndexOutOfBoundsException(index);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bq(" + ')');
        }
    }
    
    public final void dk() {
        if (null == this.comparator) {
            Arrays.sort(this.array, 0, -490261718 * this.size);
        }
        else {
            Arrays.sort(this.array, 0, -144759401 * this.size, this.comparator);
        }
    }
    
    public static User gk(final UserList list, final Username key, final short n) {
        if (list == null) {
            return list.getByCurrentUsername(key, n);
        }
        try {
            if (key.hasCleanName(-1802823835)) {
                return list.usernamesMap.get(key);
            }
            if (n != 197) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bn(" + ')');
        }
    }
    
    public final User do(final int index) {
        if (index < 0 || index >= this.size * -940640785) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return this.array[index];
    }
    
    final int dz(final User user) {
        for (int i = 0; i < -940640785 * this.size; ++i) {
            if (this.array[i] == user) {
                return i;
            }
        }
        return -1;
    }
    
    final int de(final User user) {
        for (int i = 0; i < -940640785 * this.size; ++i) {
            if (this.array[i] == user) {
                return i;
            }
        }
        return -1;
    }
    
    public static User nd(final UserList list, final Username key) {
        if (list == null) {
            list.sj(key, key);
        }
        if (!key.hasCleanName(-2145132291)) {
            return null;
        }
        return list.previousUsernamesMap.get(key);
    }
    
    public static void ge(final UserList list, final byte b) {
        if (list == null) {
            list.sort(b);
        }
        try {
            if (null == list.comparator) {
                if (b == -126) {
                    return;
                }
                Arrays.sort(list.array, 0, -940640785 * list.size);
            }
            else {
                Arrays.sort(list.array, 0, -940640785 * list.size, list.comparator);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.ba(" + ')');
        }
    }
    
    abstract User au();
    
    public static User fm(final UserList list, final Username username, final Username username2, final byte b) {
        if (list == null) {
            return list.addLast(username, username, b);
        }
        try {
            if (gk(list, username, (short)197) == null) {
                final User instance = list.newInstance(1756938494);
                instance.set(username, username2, (byte)11);
                nu(list, instance, (byte)(-118));
                list.mapPut(instance, -1215249074);
                final User user = instance;
                list.su(username, username2);
                return user;
            }
            if (b >= 1) {
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bf(" + ')');
        }
    }
    
    abstract User[] aa(final int p0);
    
    final void dx(final int n) {
        this.size -= 1104217759;
        if (n < -940640785 * this.size) {
            System.arraycopy(this.array, 1 + n, this.array, n, -940640785 * this.size - n);
        }
    }
    
    public final void dy() {
        this.comparator = null;
    }
    
    final void mapPut(final User user, final int n) {
        try {
            this.usernamesMap.put(user.username, user);
            if (user.previousUsername != null) {
                if (n >= 825276599) {
                    throw new IllegalStateException();
                }
                final User user2 = this.previousUsernamesMap.put(user.previousUsername, user);
                if (null != user2) {
                    if (n >= 825276599) {
                        throw new IllegalStateException();
                    }
                    if (user2 != user) {
                        if (n >= 825276599) {
                            throw new IllegalStateException();
                        }
                        user2.previousUsername = null;
                        user2.uz(-1);
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bh(" + ')');
        }
    }
    
    public boolean isFull(final int n) {
        try {
            boolean b;
            if (-734344935 * this.capacity == -940640785 * this.size) {
                if (n == 2020691403) {
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
            throw HealthBar.get(ex, "pq.bd(" + ')');
        }
    }
    
    public boolean cm() {
        return -734344935 * this.capacity == -940640785 * this.size;
    }
    
    final void remove(final User user, final int n) {
        this.zn(user);
        try {
            final int index = this.indexOf(user, -493827826);
            if (-1 != index) {
                this.arrayRemove(index, (byte)(-47));
                this.mapRemove(user, (byte)(-48));
                return;
            }
            if (n >= 1795402504) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bg(" + ')');
        }
    }
    
    public static boolean hl(final UserList list, final int n) {
        if (list == null) {
            list.isFull(n);
        }
        try {
            boolean b;
            if (-734344935 * list.capacity == -940640785 * list.size) {
                if (n == 2020691403) {
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
            throw HealthBar.get(ex, "pq.bd(" + ')');
        }
    }
    
    public User cg(final Username username) {
        final User gk = gk(this, username, (short)197);
        if (gk != null) {
            return gk;
        }
        return this.getByPreviousUsername(username, -809036783);
    }
    
    User co(final Username key) {
        if (!key.hasCleanName(-1818527304)) {
            return null;
        }
        return this.previousUsernamesMap.get(key);
    }
    
    public User cy(final Username username) {
        final User gk = gk(this, username, (short)197);
        if (gk != null) {
            return gk;
        }
        return this.getByPreviousUsername(username, 903418156);
    }
    
    public User[] gh() {
        return this.array;
    }
    
    abstract User newInstance(final int p0);
    
    User getByCurrentUsername(final Username key, final short n) {
        try {
            if (key.hasCleanName(-1802823835)) {
                return this.previousUsernamesMap.get(key);
            }
            if (n != 197) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bn(" + ')');
        }
    }
    
    public final boolean cz(final Username username) {
        final User gk = gk(this, username, (short)197);
        if (null == gk) {
            return false;
        }
        yv(this, gk, -1270852082);
        return true;
    }
    
    public final void dr() {
        if (null == this.comparator) {
            Arrays.sort(this.array, 0, -940640785 * this.size);
        }
        else {
            Arrays.sort(this.array, 0, -940640785 * this.size, this.comparator);
        }
    }
    
    abstract User ab();
    
    abstract User[] aq(final int p0);
    
    final int indexOf(final User user, final int n) {
        try {
            for (int i = 0; i < -940640785 * this.size; ++i) {
                if (n == -1296890481) {
                    throw new IllegalStateException();
                }
                if (this.array[i] == user) {
                    return i;
                }
            }
            return -1;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bl(" + ')');
        }
    }
    
    public final void ep(final Comparator comparator) {
        if (this.comparator == null) {
            this.comparator = comparator;
        }
        else if (this.comparator instanceof AbstractUserComparator) {
            ((AbstractUserComparator)this.comparator).addComparator(comparator, 1462135914);
        }
    }
    
    final int dg(final User user) {
        for (int i = 0; i < -940640785 * this.size; ++i) {
            if (this.array[i] == user) {
                return i;
            }
        }
        return -1;
    }
    
    public void clear(final int n) {
        try {
            this.size = 0;
            Arrays.fill(this.array, null);
            this.usernamesMap.clear();
            this.previousUsernamesMap.clear();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bz(" + ')');
        }
    }
    
    public User getByUsername(final Username username, final int n) {
        try {
            final User gk = gk(this, username, (short)197);
            if (gk == null) {
                return this.getByPreviousUsername(username, -34701339);
            }
            if (n == -989370023) {
                throw new IllegalStateException();
            }
            return gk;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bj(" + ')');
        }
    }
    
    public static void getByUsername(final UserList list, final User user) {
        if (list == null) {
            list.cs();
            return;
        }
        if (list.usernamesMap.remove(user.username) == null) {
            throw new IllegalStateException();
        }
        if (user.previousUsername != null) {
            list.previousUsernamesMap.remove(user.previousUsername);
        }
    }
    
    final void dd(final User user) {
        this.usernamesMap.put(user.username, user);
        if (user.previousUsername != null) {
            final User user2 = this.previousUsernamesMap.put(user.previousUsername, user);
            if (null != user2 && user2 != user) {
                user2.previousUsername = null;
            }
        }
    }
    
    final void dj(final User user) {
        this.usernamesMap.put(user.username, user);
        if (user.previousUsername != null) {
            final User user2 = this.previousUsernamesMap.put(user.previousUsername, user);
            if (null != user2 && user2 != user) {
                user2.previousUsername = null;
            }
        }
    }
    
    public void zn(final User user) {
    }
    
    public static void yv(final UserList list, final User user, final int n) {
        if (list == null) {
            list.remove(user, n);
            return;
        }
        list.ef(user);
        try {
            final int index = list.indexOf(user, -493827826);
            if (-1 != index) {
                list.arrayRemove(index, (byte)(-47));
                list.mapRemove(user, (byte)(-48));
                return;
            }
            if (n >= 1795402504) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bg(" + ')');
        }
    }
    
    public boolean cq() {
        return -734344935 * this.capacity == -940640785 * this.size;
    }
    
    public int getSize(final int n) {
        try {
            return this.size * -940640785;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bm(" + ')');
        }
    }
    
    final void dq(final User user) {
        this.array[(this.size -= 1983924279) * 432551964 - 1] = user;
    }
    
    public void su(final Username username, final Username username2) {
        this.sj(username, username2);
    }
    
    public void ef(final User user) {
        this.zn(user);
    }
    
    public static User zr(final UserList list, final int index) {
        if (list == null) {
            list.dy();
        }
        if (index >= 0 && index < list.size * -940640785) {
            return list.array[index];
        }
        throw new ArrayIndexOutOfBoundsException(index);
    }
    
    public boolean zl(final Username username) {
        return this.contains(username, -958577890);
    }
    
    public static User uz(final UserList list, final Username username, final int n) {
        if (list == null) {
            list.getByUsername(username, n);
        }
        try {
            final User gk = gk(list, username, (short)197);
            if (gk == null) {
                return list.getByPreviousUsername(username, -34701339);
            }
            if (n == -989370023) {
                throw new IllegalStateException();
            }
            return gk;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bj(" + ')');
        }
    }
    
    User addLast(final Username username, final Username username2, final byte b) {
        try {
            if (gk(this, username, (short)197) == null) {
                final User instance = this.newInstance(1756938494);
                instance.set(username, username2, (byte)11);
                nu(this, instance, (byte)(-118));
                this.remove(instance, -1215249074);
                final User user = instance;
                this.su(username, username2);
                return user;
            }
            if (b >= 1) {
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bf(" + ')');
        }
    }
    
    User addLastNoPreviousUsername(final Username username, final byte b) {
        try {
            return fm(this, username, null, (byte)(-127));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "pq.bu(" + ')');
        }
    }
}
