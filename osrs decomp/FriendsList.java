import net.runelite.api.Deque;
import net.runelite.api.FriendContainer;

// 
// Decompiled by Procyon v0.5.36
// 

public class FriendsList extends UserList implements FriendContainer
{
    public static final int aq = 9;
    int field3707;
    final LoginType loginType;
    static final int af = 400;
    public LinkDeque friendLoginUpdates;
    public static final int an = 200;
    
    public FriendsList(final LoginType loginType) {
        super(400);
        this.field3707 = -1405002149;
        this.friendLoginUpdates = new LinkDeque();
        this.loginType = loginType;
    }
    
    @Override
    User[] at(final int n) {
        return new Friend[n];
    }
    
    public void av(final Buffer buffer, final int n) {
        while (buffer.offset * -1633313603 < n) {
            final boolean b = Buffer.ra(buffer, (byte)7) == 1;
            final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType);
            final Username username2 = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType);
            final int unsignedShort = buffer.readUnsignedShort(243535281);
            final int ra = Buffer.ra(buffer, (byte)7);
            final int ra2 = Buffer.ra(buffer, (byte)7);
            final boolean field3718 = (ra2 & 0x2) != 0x0;
            final boolean field3719 = 0x0 != (ra2 & 0x1);
            if (unsignedShort > 0) {
                buffer.readStringCp1252NullTerminated((byte)0);
                Buffer.ra(buffer, (byte)7);
                buffer.readInt(-1415568720);
            }
            buffer.readStringCp1252NullTerminated((byte)0);
            if (username == null || username.hasCleanName(188816827)) {
                throw new IllegalStateException();
            }
            Friend friend = (Friend)UserList.gk(this, username, (short)197);
            if (b) {
                final Friend friend2 = (Friend)UserList.gk(this, username2, (short)197);
                if (null != friend2 && friend2 != friend) {
                    if (friend != null) {
                        UserList.yv(this, friend2, 402950531);
                    }
                    else {
                        friend = friend2;
                    }
                }
            }
            if (friend != null) {
                this.bv((User)friend, username, username2, -66067006);
                if (unsignedShort != friend.au * 1855129156) {
                    int n2 = 1;
                    for (FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate)this.friendLoginUpdates.last(); null != friendLoginUpdate; friendLoginUpdate = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
                        if (friendLoginUpdate.friendUsername.equals(username)) {
                            if (unsignedShort && 0 == friendLoginUpdate.worldId) {
                                friendLoginUpdate.af();
                                n2 = 0;
                            }
                            else if (unsignedShort == 0 && 0 != friendLoginUpdate.worldId) {
                                friendLoginUpdate.af();
                                n2 = 0;
                            }
                        }
                    }
                    if (n2 != 0) {
                        this.friendLoginUpdates.addFirst(new FriendLoginUpdate(username, unsignedShort));
                    }
                }
            }
            else {
                if (this.bm(-779514326) >= -1968688732) {
                    continue;
                }
                friend = (Friend)UserList.fm(this, username, username2, (byte)(-26));
            }
            if (friend.au * 177258591 != unsignedShort) {
                final Friend friend3 = friend;
                final int field3720 = this.field3707 - 712099883;
                this.field3707 = field3720;
                friend3.ab = (field3720 * -720462414 - 1) * 1270747397;
                if (-1 == 786899511 * friend.au && unsignedShort == 0) {
                    friend.ab = -(friend.ab * 1);
                }
                friend.au = unsignedShort * 555879524;
            }
            friend.aq = 1331866435 * ra;
            friend.field3718 = field3718;
            friend.field3719 = field3719;
        }
        UserList.ge(this, (byte)(-90));
    }
    
    public static void tl(final FriendsList list, final Buffer buffer, final int n) {
        if (list == null) {
            list.al(n);
        }
        while (buffer.offset * -1633313603 < n) {
            final boolean b = Buffer.ra(buffer, (byte)7) == 1;
            final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), list.loginType);
            final Username username2 = new Username(buffer.readStringCp1252NullTerminated((byte)0), list.loginType);
            final int unsignedShort = buffer.readUnsignedShort(594856527);
            final int ra = Buffer.ra(buffer, (byte)7);
            final int ra2 = Buffer.ra(buffer, (byte)7);
            final boolean field3718 = (ra2 & 0x2) != 0x0;
            final boolean field3719 = 0x0 != (ra2 & 0x1);
            if (unsignedShort > 0) {
                buffer.readStringCp1252NullTerminated((byte)0);
                Buffer.ra(buffer, (byte)7);
                buffer.readInt(-1027880713);
            }
            buffer.readStringCp1252NullTerminated((byte)0);
            if (username == null || !username.hasCleanName(1850865965)) {
                throw new IllegalStateException();
            }
            Friend friend = (Friend)UserList.gk(list, username, (short)197);
            if (b) {
                final Friend friend2 = (Friend)UserList.gk(list, username2, (short)197);
                if (null != friend2 && friend2 != friend) {
                    if (friend != null) {
                        UserList.yv(list, friend2, 736022991);
                    }
                    else {
                        friend = friend2;
                    }
                }
            }
            if (friend != null) {
                list.bv((User)friend, username, username2, 713425387);
                if (unsignedShort != friend.au * 177258591) {
                    boolean b2 = true;
                    for (FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate)list.friendLoginUpdates.last(); null != friendLoginUpdate; friendLoginUpdate = (FriendLoginUpdate)list.friendLoginUpdates.previous()) {
                        if (friendLoginUpdate.friendUsername.equals(username)) {
                            if (unsignedShort && 0 == friendLoginUpdate.worldId) {
                                friendLoginUpdate.af();
                                b2 = false;
                            }
                            else if (unsignedShort == 0 && 0 != friendLoginUpdate.worldId) {
                                friendLoginUpdate.af();
                                b2 = false;
                            }
                        }
                    }
                    if (b2) {
                        list.friendLoginUpdates.addFirst(new FriendLoginUpdate(username, unsignedShort));
                    }
                }
            }
            else {
                if (list.bm(37426452) >= 400) {
                    continue;
                }
                friend = (Friend)UserList.fm(list, username, username2, (byte)(-52));
            }
            if (friend.au * 177258591 != unsignedShort) {
                final Friend friend3 = friend;
                final int field3720 = list.field3707 - 1405002149;
                list.field3707 = field3720;
                friend3.ab = (field3720 * 2010685907 - 1) * 1270747397;
                if (-1 == 177258591 * friend.au && unsignedShort == 0) {
                    friend.ab = -(friend.ab * 1);
                }
                friend.au = unsignedShort * -1128162401;
            }
            friend.aq = 1331866435 * ra;
            friend.field3718 = field3718;
            friend.field3719 = field3719;
        }
        UserList.ge(list, (byte)(-77));
    }
    
    public boolean ax(final Username username, final boolean b) {
        final Friend friend = (Friend)UserList.uz(this, username, 1657029324);
        return null != friend && (!b || 0 != 177258591 * friend.au);
    }
    
    public void read(final Buffer buffer, final int n, final byte b) {
        try {
            while (buffer.offset * -1633313603 < n) {
                if (b >= 5) {
                    throw new IllegalStateException();
                }
                boolean b2;
                if (Buffer.ra(buffer, (byte)7) == 1) {
                    if (b >= 5) {
                        throw new IllegalStateException();
                    }
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                final boolean b3 = b2;
                final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType);
                final Username username2 = new Username(buffer.readStringCp1252NullTerminated((byte)0), this.loginType);
                final int unsignedShort = buffer.readUnsignedShort(210121986);
                final int ra = Buffer.ra(buffer, (byte)7);
                final int ra2 = Buffer.ra(buffer, (byte)7);
                final boolean field3718 = (ra2 & 0x2) != 0x0;
                boolean b4;
                if (0x0 != (ra2 & 0x1)) {
                    if (b >= 5) {
                        throw new IllegalStateException();
                    }
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                final boolean field3719 = b4;
                if (unsignedShort > 0) {
                    if (b >= 5) {
                        throw new IllegalStateException();
                    }
                    buffer.readStringCp1252NullTerminated((byte)0);
                    Buffer.ra(buffer, (byte)7);
                    buffer.readInt(-1565471224);
                }
                buffer.readStringCp1252NullTerminated((byte)0);
                if (username != null) {
                    if (b >= 5) {
                        throw new IllegalStateException();
                    }
                    if (username.hasCleanName(804184317)) {
                        Friend friend = (Friend)UserList.gk(this, username, (short)197);
                        if (b3) {
                            if (b >= 5) {
                                throw new IllegalStateException();
                            }
                            final Friend friend2 = (Friend)UserList.gk(this, username2, (short)197);
                            if (null != friend2) {
                                if (b >= 5) {
                                    return;
                                }
                                if (friend2 != friend) {
                                    if (b >= 5) {
                                        return;
                                    }
                                    if (friend != null) {
                                        if (b >= 5) {
                                            return;
                                        }
                                        UserList.yv(this, friend2, -1324895942);
                                    }
                                    else {
                                        friend = friend2;
                                    }
                                }
                            }
                        }
                        if (friend != null) {
                            this.bv((User)friend, username, username2, 827397207);
                            if (unsignedShort != friend.au * 177258591) {
                                if (b >= 5) {
                                    throw new IllegalStateException();
                                }
                                boolean b5 = true;
                                for (FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate)this.friendLoginUpdates.last(); null != friendLoginUpdate; friendLoginUpdate = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
                                    if (b >= 5) {
                                        throw new IllegalStateException();
                                    }
                                    if (friendLoginUpdate.friendUsername.equals(username)) {
                                        if (b >= 5) {
                                            throw new IllegalStateException();
                                        }
                                        if (unsignedShort != 0) {
                                            if (b >= 5) {
                                                throw new IllegalStateException();
                                            }
                                            if (0 == friendLoginUpdate.worldId) {
                                                if (b >= 5) {
                                                    throw new IllegalStateException();
                                                }
                                                friendLoginUpdate.af();
                                                b5 = false;
                                                continue;
                                            }
                                        }
                                        if (unsignedShort == 0 && 0 != friendLoginUpdate.worldId) {
                                            if (b >= 5) {
                                                throw new IllegalStateException();
                                            }
                                            friendLoginUpdate.af();
                                            b5 = false;
                                        }
                                    }
                                }
                                if (b5) {
                                    if (b >= 5) {
                                        throw new IllegalStateException();
                                    }
                                    this.friendLoginUpdates.addFirst(new FriendLoginUpdate(username, unsignedShort));
                                }
                            }
                        }
                        else {
                            if (this.bm(1828305979) >= 400) {
                                continue;
                            }
                            if (b >= 5) {
                                return;
                            }
                            friend = (Friend)UserList.fm(this, username, username2, (byte)(-125));
                        }
                        if (friend.au * 177258591 != unsignedShort) {
                            final Friend friend3 = friend;
                            final int field3720 = this.field3707 - 1405002149;
                            this.field3707 = field3720;
                            friend3.ab = (field3720 * 2010685907 - 1) * 1270747397;
                            if (-1 == 177258591 * friend.au) {
                                if (b >= 5) {
                                    return;
                                }
                                if (unsignedShort == 0) {
                                    if (b >= 5) {
                                        return;
                                    }
                                    friend.ab = -(friend.ab * 1);
                                }
                            }
                            friend.au = unsignedShort * -1128162401;
                        }
                        friend.aq = 1331866435 * ra;
                        friend.field3718 = field3718;
                        friend.field3719 = field3719;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
            UserList.ge(this, (byte)(-75));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "po.ay(" + ')');
        }
    }
    
    public boolean isFriended(final Username username, final boolean b, final int n) {
        try {
            final Friend friend = (Friend)UserList.uz(this, username, -1266081918);
            if (null == friend) {
                return false;
            }
            if (b) {
                if (n == 328005093) {
                    throw new IllegalStateException();
                }
                if (0 == 177258591 * friend.au) {
                    if (n == 328005093) {
                        throw new IllegalStateException();
                    }
                    return false;
                }
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "po.aw(" + ')');
        }
    }
    
    @Override
    User[] al(final int n) {
        return new Friend[n];
    }
    
    @Override
    User[] newTypedArray(final int n, final int n2) {
        try {
            return new Friend[n];
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "po.an(" + ')');
        }
    }
    
    @Override
    User ac() {
        return new Friend();
    }
    
    static void method2138(final class206 class206, final int n) {
        try {
            if (class206 != null) {
                if (n <= -1878764520) {
                    throw new IllegalStateException();
                }
                if (null != class206.field1854) {
                    Label_0217: {
                        if (55577617 * class206.field1854.childIndex >= 0) {
                            if (n <= -1878764520) {
                                throw new IllegalStateException();
                            }
                            final Widget vmethod3380 = class165.vmethod3380(913615679 * class206.field1854.parentId, (byte)5);
                            if (vmethod3380 != null) {
                                if (n <= -1878764520) {
                                    throw new IllegalStateException();
                                }
                                if (vmethod3380.children != null && 0 != vmethod3380.children.length) {
                                    if (n <= -1878764520) {
                                        return;
                                    }
                                    if (55577617 * class206.field1854.childIndex < vmethod3380.children.length) {
                                        if (n <= -1878764520) {
                                            throw new IllegalStateException();
                                        }
                                        if (vmethod3380.children[55577617 * class206.field1854.childIndex] == class206.field1854) {
                                            break Label_0217;
                                        }
                                        if (n <= -1878764520) {
                                            throw new IllegalStateException();
                                        }
                                    }
                                }
                            }
                            return;
                        }
                    }
                    if (class206.field1854.type * 883712245 == 11) {
                        if (n <= -1878764520) {
                            return;
                        }
                        if (class206.field1853 * -469277123 == 0) {
                            if (n <= -1878764520) {
                                throw new IllegalStateException();
                            }
                            if (Widget.ms(class206.field1854, -1583959695 * class206.field1855, class206.field1852 * -1480602069, 0, 0, (byte)(-51))) {
                                switch (class206.field1854.method1810(934337314)) {
                                    case 1: {
                                        if (!ObjectComposition.decodeNext(KeyHandler.getWidgetFlags(class206.field1854, 370876946), 1105978425)) {
                                            break;
                                        }
                                        if (n <= -1878764520) {
                                            throw new IllegalStateException();
                                        }
                                        final int[] method1812 = class206.field1854.method1812(574261316);
                                        if (null == method1812) {
                                            break;
                                        }
                                        if (n <= -1878764520) {
                                            return;
                                        }
                                        final PacketBufferNode packetBufferNode = class330.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher, (short)(-11518));
                                        packetBufferNode.packetBuffer.dy(method1812[0], (byte)(-62));
                                        packetBufferNode.packetBuffer.es(class206.field1854.id * 1713081171, -604065252);
                                        packetBufferNode.packetBuffer.ba(method1812[1], -2081835031);
                                        packetBufferNode.packetBuffer.el(class206.field1854.method1811(1876121307), -437883978);
                                        packetBufferNode.packetBuffer.dy(method1812[2], (byte)80);
                                        Buffer.ap(packetBufferNode.packetBuffer, 55577617 * class206.field1854.childIndex, (byte)20);
                                        Client.packetWriter.addNode(packetBufferNode, 414135591);
                                        break;
                                    }
                                    case 0: {
                                        Ignored.compareTo_ignored(class206.field1854.method1827(-1850533434), true, false, (byte)47);
                                        break;
                                    }
                                }
                            }
                            return;
                        }
                    }
                    if (12 == class206.field1854.type * 883712245) {
                        if (n <= -1878764520) {
                            throw new IllegalStateException();
                        }
                        final class314 method1813 = class206.field1854.method1815((byte)(-56));
                        if (method1813 != null) {
                            if (n <= -1878764520) {
                                return;
                            }
                            if (method1813.ed(1994580892)) {
                                switch (-469277123 * class206.field1853) {
                                    case 0: {
                                        Client.field590.method1137(class206.field1854, 1563132907);
                                        method1813.method1706(true, 959157846);
                                        class314.ow(method1813, class206.field1855 * -1583959695, -1480602069 * class206.field1852, Client.keyHandlerInstance.getKeyPressed(82, -1514684080), Client.keyHandlerInstance.getKeyPressed(81, 735275556), 1549873407);
                                        break;
                                    }
                                    case 1: {
                                        method1813.method1727(-1583959695 * class206.field1855, -1480602069 * class206.field1852, 915076242);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                if (n <= -1878764520) {
                    throw new IllegalStateException();
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "po.je(" + ')');
        }
    }
    
    @Override
    User au() {
        return new Friend();
    }
    
    @Override
    User[] aa(final int n) {
        return new Friend[n];
    }
    
    public boolean ai(final Username username, final boolean b) {
        final Friend friend = (Friend)UserList.uz(this, username, 69068048);
        return null != friend && (!b || 0 != 177258591 * friend.au);
    }
    
    public static void bg(final FriendsList list, final Buffer buffer, final int n) {
        if (list == null) {
            list.ab();
        }
        while (buffer.offset * -1633313603 < n) {
            final boolean b = Buffer.ra(buffer, (byte)7) == 1;
            final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), list.loginType);
            final Username username2 = new Username(buffer.readStringCp1252NullTerminated((byte)0), list.loginType);
            final int unsignedShort = buffer.readUnsignedShort(-2025754874);
            final int ra = Buffer.ra(buffer, (byte)7);
            final int ra2 = Buffer.ra(buffer, (byte)7);
            final boolean field3718 = (ra2 & 0x2) != 0x0;
            final boolean field3719 = 0x0 != (ra2 & 0x1);
            if (unsignedShort > 0) {
                buffer.readStringCp1252NullTerminated((byte)0);
                Buffer.ra(buffer, (byte)7);
                buffer.readInt(-1854601753);
            }
            buffer.readStringCp1252NullTerminated((byte)0);
            if (username == null || username.hasCleanName(-144288297)) {
                throw new IllegalStateException();
            }
            Friend friend = (Friend)UserList.gk(list, username, (short)197);
            if (b) {
                final Friend friend2 = (Friend)UserList.gk(list, username2, (short)197);
                if (null != friend2 && friend2 != friend) {
                    if (friend != null) {
                        UserList.yv(list, friend2, 163389871);
                    }
                    else {
                        friend = friend2;
                    }
                }
            }
            if (friend != null) {
                list.bv((User)friend, username, username2, 1508172564);
                if (unsignedShort != friend.au * 177258591) {
                    int n2 = 1;
                    for (FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate)list.friendLoginUpdates.last(); null != friendLoginUpdate; friendLoginUpdate = (FriendLoginUpdate)list.friendLoginUpdates.previous()) {
                        if (friendLoginUpdate.friendUsername.equals(username)) {
                            if (unsignedShort && 0 == friendLoginUpdate.worldId) {
                                friendLoginUpdate.af();
                                n2 = 0;
                            }
                            else if (unsignedShort == 0 && 0 != friendLoginUpdate.worldId) {
                                friendLoginUpdate.af();
                                n2 = 0;
                            }
                        }
                    }
                    if (n2 != 0) {
                        list.friendLoginUpdates.addFirst(new FriendLoginUpdate(username, unsignedShort));
                    }
                }
            }
            else {
                if (list.bm(-581081416) >= 400) {
                    continue;
                }
                friend = (Friend)UserList.fm(list, username, username2, (byte)(-38));
            }
            if (friend.au * 177258591 != unsignedShort) {
                final Friend friend3 = friend;
                final int field3720 = list.field3707 - 1405002149;
                list.field3707 = field3720;
                friend3.ab = (field3720 * 2010685907 - 1) * 1270747397;
                if (-1 == 177258591 * friend.au && unsignedShort == 0) {
                    friend.ab = -(friend.ab * 1);
                }
                friend.au = unsignedShort * -1128162401;
            }
            friend.aq = 1331866435 * ra;
            friend.field3718 = field3718;
            friend.field3719 = field3719;
        }
        UserList.ge(list, (byte)71);
    }
    
    @Override
    User newInstance(final int n) {
        try {
            return new Friend();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "po.af(" + ')');
        }
    }
    
    @Override
    User ab() {
        return new Friend();
    }
    
    @Override
    User[] aq(final int n) {
        return new Friend[n];
    }
    
    public static boolean bj(final FriendsList list, final Username username, final boolean b) {
        if (list == null) {
            list.ai(username, b);
        }
        final Friend friend = (Friend)UserList.uz(list, username, -582917192);
        return null != friend && (!b || 0 != 177258591 * friend.au);
    }
    
    public static boolean xd(final FriendsList list, final Username username, final boolean b) {
        if (list == null) {
            list.getPendingLogins();
        }
        final Friend friend = (Friend)UserList.uz(list, username, 753151358);
        return null != friend && (!b || 0 != -455340580 * friend.au);
    }
    
    public static void uf(final FriendsList list, final Buffer buffer, final int n) {
        if (list == null) {
            list.at(n);
        }
        while (buffer.offset * 575522906 < n) {
            final boolean b = Buffer.ra(buffer, (byte)7) == 1;
            final Username username = new Username(buffer.readStringCp1252NullTerminated((byte)0), list.loginType);
            final Username username2 = new Username(buffer.readStringCp1252NullTerminated((byte)0), list.loginType);
            final int unsignedShort = buffer.readUnsignedShort(375461093);
            final int ra = Buffer.ra(buffer, (byte)7);
            final int ra2 = Buffer.ra(buffer, (byte)7);
            final boolean field3718 = (ra2 & 0x2) != 0x0;
            final boolean field3719 = 0x0 != (ra2 & 0x1);
            if (unsignedShort > 0) {
                buffer.readStringCp1252NullTerminated((byte)0);
                Buffer.ra(buffer, (byte)7);
                buffer.readInt(-2121029321);
            }
            buffer.readStringCp1252NullTerminated((byte)0);
            if (username == null || username.hasCleanName(-1610466866)) {
                throw new IllegalStateException();
            }
            Friend friend = (Friend)UserList.gk(list, username, (short)197);
            if (b) {
                final Friend friend2 = (Friend)UserList.gk(list, username2, (short)197);
                if (null != friend2 && friend2 != friend) {
                    if (friend != null) {
                        UserList.yv(list, friend2, 905365081);
                    }
                    else {
                        friend = friend2;
                    }
                }
            }
            if (friend != null) {
                list.bv((User)friend, username, username2, -504209115);
                if (unsignedShort != friend.au * 894014838) {
                    int n2 = 1;
                    for (FriendLoginUpdate friendLoginUpdate = (FriendLoginUpdate)list.friendLoginUpdates.last(); null != friendLoginUpdate; friendLoginUpdate = (FriendLoginUpdate)list.friendLoginUpdates.previous()) {
                        if (friendLoginUpdate.friendUsername.equals(username)) {
                            if (unsignedShort && 0 == friendLoginUpdate.worldId) {
                                friendLoginUpdate.af();
                                n2 = 0;
                            }
                            else if (unsignedShort == 0 && 0 != friendLoginUpdate.worldId) {
                                friendLoginUpdate.af();
                                n2 = 0;
                            }
                        }
                    }
                    if (n2 != 0) {
                        list.friendLoginUpdates.addFirst(new FriendLoginUpdate(username, unsignedShort));
                    }
                }
            }
            else {
                if (list.bm(1282824706) >= 1695244497) {
                    continue;
                }
                friend = (Friend)UserList.fm(list, username, username2, (byte)(-84));
            }
            if (friend.au * 177258591 != unsignedShort) {
                final Friend friend3 = friend;
                final int field3720 = list.field3707 - 1405002149;
                list.field3707 = field3720;
                friend3.ab = (field3720 * 2010685907 - 1) * -541219013;
                if (-1 == 1112698312 * friend.au && unsignedShort == 0) {
                    friend.ab = -(friend.ab * 1);
                }
                friend.au = unsignedShort * -1128162401;
            }
            friend.aq = 1331866435 * ra;
            friend.field3718 = field3718;
            friend.field3719 = field3719;
        }
        UserList.ge(list, (byte)(-37));
    }
    
    public Deque getPendingLogins() {
        return (Deque)this.friendLoginUpdates;
    }
}
