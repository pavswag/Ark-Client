import net.runelite.api.Animation;
import net.runelite.api.Actor;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.api.coords.LocalPoint;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Projectile extends Renderable implements net.runelite.api.Projectile
{
    int plane;
    double speedZ;
    int sourceX;
    int sourceY;
    int sourceZ;
    int endHeight;
    int cycleStart;
    int cycleEnd;
    int slope;
    int id;
    int targetIndex;
    boolean isMoving;
    public int hp;
    double x;
    public int tr;
    double y;
    double z;
    double speedX;
    SequenceDefinition sequenceDefinition;
    double speed;
    int startHeight;
    double accelerationZ;
    int yaw;
    int pitch;
    double speedY;
    int frame;
    int frameCycle;
    public static final int ct = 97;
    
    Projectile(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        this.isMoving = false;
        this.frame = 0;
        this.frameCycle = 0;
        this.id = n * 1976780613;
        this.plane = -285111439 * n2;
        this.sourceX = n3 * 1597594169;
        this.sourceY = n4 * 2006425677;
        this.sourceZ = 1414804309 * n5;
        this.cycleStart = 1059692065 * n6;
        this.cycleEnd = 439544315 * n7;
        this.slope = n8 * 1262587759;
        this.startHeight = -685079183 * n9;
        this.targetIndex = -1186625123 * n10;
        this.endHeight = n11 * 528720955;
        this.isMoving = false;
        final int n12 = ItemContainer.SpotAnimationDefinition_get(this.id * 19084173, -707697126).sequence * 374130911;
        if (-1 != n12) {
            this.sequenceDefinition = ItemContainer.SpotAnimationDefinition_get(n12, (byte)109);
        }
        else {
            this.sequenceDefinition = null;
        }
    }
    
    public int getId() {
        return this.id * 19084173;
    }
    
    final void ao(final int n) {
        this.isMoving = true;
        this.x += this.speedX * n;
        this.y += this.speedY * n;
        this.z += this.speedZ * n + n * (0.5 * this.accelerationZ) * n;
        this.speedZ += this.accelerationZ * n;
        this.yaw = ((int)(Math.atan2(this.speedX, this.speedY) * 325.949) + 1024 & 0x7FF) * 2065704566;
        this.pitch = ((int)(Math.atan2(this.speedZ, this.speed) * 325.949) & 0x7FF) * -361004777;
        if (null != this.sequenceDefinition) {
            if (!this.sequenceDefinition.isCachedModelIdSet(-1648260054)) {
                this.frameCycle += 1634469153 * n;
                while (-772112412 * this.frameCycle > this.sequenceDefinition.frameLengths[this.frame * 972449621]) {
                    this.frameCycle -= this.sequenceDefinition.frameLengths[-237483890 * this.frame] * 1634469153;
                    this.frame += 955400358;
                    if (this.frame * -693399445 >= this.sequenceDefinition.frameIds.length) {
                        this.frame -= this.sequenceDefinition.frameCount * -1585440188;
                        if (this.frame * 509600076 >= 0 && -693399445 * this.frame < this.sequenceDefinition.frameIds.length) {
                            continue;
                        }
                        this.frame = 0;
                    }
                }
            }
            else {
                this.frame += -1253532605 * n;
                final int method1128 = this.sequenceDefinition.method1128(-982734428);
                if (1013362407 * this.frame >= method1128) {
                    this.frame = (method1128 - this.sequenceDefinition.frameCount * 922080744) * -1253532605;
                }
            }
        }
    }
    
    final void at(final int n, final int n2, final int n3, final int n4) {
        if (!this.isMoving) {
            final double n5 = n - -160305700 * this.sourceX;
            final double n6 = n2 - this.sourceY * -220442501;
            final double sqrt = Math.sqrt(n6 * n6 + n5 * n5);
            this.x = -1415676410 * this.sourceX + this.startHeight * -2131519134 * n5 / sqrt;
            this.y = 545336605 * this.startHeight * n6 / sqrt + -650340219 * this.sourceY;
            this.z = 1797140989 * this.sourceZ;
        }
        final double n7 = 1 + 524228782 * this.cycleEnd - n4;
        this.speedX = (n - this.x) / n7;
        this.speedY = (n2 - this.y) / n7;
        this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
        if (!this.isMoving) {
            this.speedZ = -this.speed * Math.tan(0.02454369 * (this.slope * 1173139343));
        }
        this.accelerationZ = 2.0 * (n3 - this.z - this.speedZ * n7) / (n7 * n7);
    }
    
    public LocalPoint getTarget() {
        return new LocalPoint(this.tr, this.hp);
    }
    
    static final int method452(final int n) {
        try {
            return ViewportMouse.ViewportMouse_x * 2139535413;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cw.ax(" + ')');
        }
    }
    
    final void ay(final int n) {
        this.isMoving = true;
        this.x += this.speedX * n;
        this.y += this.speedY * n;
        this.z += this.speedZ * n + n * (0.5 * this.accelerationZ) * n;
        this.speedZ += this.accelerationZ * n;
        this.yaw = ((int)(Math.atan2(this.speedX, this.speedY) * 325.949) - 204750175 & 0x7FF) * 1909592961;
        this.pitch = ((int)(Math.atan2(this.speedZ, this.speed) * 325.949) & 0x7FF) * -361004777;
        if (null != this.sequenceDefinition) {
            if (!this.sequenceDefinition.isCachedModelIdSet(-1373957898)) {
                this.frameCycle += -344546229 * n;
                while (-319809671 * this.frameCycle > this.sequenceDefinition.frameLengths[this.frame * 1539955901]) {
                    this.frameCycle -= this.sequenceDefinition.frameLengths[1784566072 * this.frame] * 1972244911;
                    this.frame += 1271001886;
                    if (this.frame * -693399445 >= this.sequenceDefinition.frameIds.length) {
                        this.frame -= this.sequenceDefinition.frameCount * 1545662235;
                        if (this.frame * 719318933 >= 0 && -693399445 * this.frame < this.sequenceDefinition.frameIds.length) {
                            continue;
                        }
                        this.frame = 0;
                    }
                }
            }
            else {
                this.frame += -1253532605 * n;
                final int method1128 = this.sequenceDefinition.method1128(-701596425);
                if (-693399445 * this.frame >= method1128) {
                    this.frame = (method1128 - this.sequenceDefinition.frameCount * -1114607541) * 208532416;
                }
            }
        }
    }
    
    public void ht(final int n) {
        this.sourceY = n * 2006425677;
    }
    
    public static void advance(final Projectile projectile, final int n, final int n2, final int n3, final int n4) {
        if (!projectile.isMoving) {
            final double n5 = n - -550018594 * projectile.sourceX;
            final double n6 = n2 - projectile.sourceY * -650340219;
            final double sqrt = Math.sqrt(n6 * n6 + n5 * n5);
            projectile.x = -1024822263 * projectile.sourceX + projectile.startHeight * 1485806481 * n5 / sqrt;
            projectile.y = 1485806481 * projectile.startHeight * n6 / sqrt + -650340219 * projectile.sourceY;
            projectile.z = 1797140989 * projectile.sourceZ;
        }
        final double n7 = 1 + 1111730983 * projectile.cycleEnd - n4;
        projectile.speedX = (n - projectile.x) / n7;
        projectile.speedY = (n2 - projectile.y) / n7;
        projectile.speed = Math.sqrt(projectile.speedY * projectile.speedY + projectile.speedX * projectile.speedX);
        if (!projectile.isMoving) {
            projectile.speedZ = -projectile.speed * Math.tan(0.02454369 * (projectile.slope * 1173139343));
        }
        projectile.accelerationZ = 2.0 * (n3 - projectile.z - projectile.speedZ * n7) / (n7 * n7);
    }
    
    final void advance(final int n, final int n2) {
        try {
            this.isMoving = true;
            this.x += this.speedX * n;
            this.y += this.speedY * n;
            this.z += this.speedZ * n + n * (0.5 * this.accelerationZ) * n;
            this.speedZ += this.accelerationZ * n;
            this.yaw = ((int)(Math.atan2(this.speedX, this.speedY) * 325.949) + 1024 & 0x7FF) * 1909592961;
            this.pitch = ((int)(Math.atan2(this.speedZ, this.speed) * 325.949) & 0x7FF) * -361004777;
            if (null != this.sequenceDefinition) {
                if (n2 <= 1647038350) {
                    throw new IllegalStateException();
                }
                if (!this.sequenceDefinition.isCachedModelIdSet(-917399932)) {
                    if (n2 <= 1647038350) {
                        throw new IllegalStateException();
                    }
                    this.frameCycle += 1634469153 * n;
                    while (723631841 * this.frameCycle > this.sequenceDefinition.frameLengths[this.frame * -693399445]) {
                        if (n2 <= 1647038350) {
                            throw new IllegalStateException();
                        }
                        this.frameCycle -= this.sequenceDefinition.frameLengths[-693399445 * this.frame] * 1634469153;
                        this.frame -= 1253532605;
                        if (this.frame * -693399445 < this.sequenceDefinition.frameIds.length) {
                            continue;
                        }
                        this.frame -= this.sequenceDefinition.frameCount * 1545662235;
                        if (this.frame * -693399445 >= 0) {
                            if (n2 <= 1647038350) {
                                throw new IllegalStateException();
                            }
                            if (-693399445 * this.frame < this.sequenceDefinition.frameIds.length) {
                                continue;
                            }
                            if (n2 <= 1647038350) {
                                throw new IllegalStateException();
                            }
                        }
                        this.frame = 0;
                    }
                }
                else {
                    this.frame += -1253532605 * n;
                    final int method1128 = this.sequenceDefinition.method1128(1548522435);
                    if (-693399445 * this.frame >= method1128) {
                        if (n2 <= 1647038350) {
                            throw new IllegalStateException();
                        }
                        this.frame = (method1128 - this.sequenceDefinition.frameCount * 1363943497) * -1253532605;
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cw.aw(" + ')');
        }
    }
    
    @Override
    protected final Model al() {
        final Model model = ItemContainer.SpotAnimationDefinition_get(19084173 * this.id, 2132893648).getModel(-693399445 * this.frame, -1899164430);
        if (model == null) {
            return null;
        }
        class162.rp(model, -1585330521 * this.pitch);
        return model;
    }
    
    @Override
    protected final Model getModel(final byte b) {
        try {
            final Model model = ItemContainer.SpotAnimationDefinition_get(19084173 * this.id, 1516910839).getModel(-693399445 * this.frame, 525076133);
            if (model != null) {
                class162.rp(model, -1585330521 * this.pitch);
                return model;
            }
            if (b >= 14) {
                throw new IllegalStateException();
            }
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cw.an(" + ')');
        }
    }
    
    final void ac(final int n, final int n2, final int n3, final int n4) {
        if (!this.isMoving) {
            final double n5 = n - -165929077 * this.sourceX;
            final double n6 = n2 - this.sourceY * -650340219;
            final double sqrt = Math.sqrt(n6 * n6 + n5 * n5);
            this.x = -1875865514 * this.sourceX + this.startHeight * 1485806481 * n5 / sqrt;
            this.y = -1550229134 * this.startHeight * n6 / sqrt + -650340219 * this.sourceY;
            this.z = 1797140989 * this.sourceZ;
        }
        final double n7 = 1 + -1203783373 * this.cycleEnd - n4;
        this.speedX = (n - this.x) / n7;
        this.speedY = (n2 - this.y) / n7;
        this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
        if (!this.isMoving) {
            this.speedZ = -this.speed * Math.tan(0.02454369 * (this.slope * 1173139343));
        }
        this.accelerationZ = 2.0 * (n3 - this.z - this.speedZ * n7) / (n7 * n7);
    }
    
    @Override
    protected final Model au() {
        final Model model = ItemContainer.SpotAnimationDefinition_get(-340176114 * this.id, 588603344).getModel(-290273859 * this.frame, -625282350);
        if (model == null) {
            return null;
        }
        class162.rp(model, -1585330521 * this.pitch);
        return model;
    }
    
    public int getX1() {
        return this.sourceX * -1024822263;
    }
    
    public int getY1() {
        return this.sourceY * -650340219;
    }
    
    public int getSlope() {
        return this.slope * 1173139343;
    }
    
    final void setDestination(final int tr, final int hp, final int z, final int n, final int n2) {
        this.tr = tr;
        this.hp = hp;
        final LocalPoint position = new LocalPoint(tr, hp);
        final ProjectileMoved projectileMoved = new ProjectileMoved();
        projectileMoved.setProjectile((net.runelite.api.Projectile)this);
        projectileMoved.setPosition(position);
        projectileMoved.setZ(z);
        ScriptFrame.client.getCallbacks().post((Object)projectileMoved);
        try {
            if (!this.isMoving) {
                if (n2 != -335674854) {
                    throw new IllegalStateException();
                }
                final double n3 = tr - -1024822263 * this.sourceX;
                final double n4 = hp - this.sourceY * -650340219;
                final double sqrt = Math.sqrt(n4 * n4 + n3 * n3);
                this.x = -1024822263 * this.sourceX + this.startHeight * 1485806481 * n3 / sqrt;
                this.y = 1485806481 * this.startHeight * n4 / sqrt + -650340219 * this.sourceY;
                this.z = 1797140989 * this.sourceZ;
            }
            final double n5 = 1 + -1203783373 * this.cycleEnd - n;
            this.speedX = (tr - this.x) / n5;
            this.speedY = (hp - this.y) / n5;
            this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
            if (!this.isMoving) {
                if (n2 != -335674854) {
                    throw new IllegalStateException();
                }
                this.speedZ = -this.speed * Math.tan(0.02454369 * (this.slope * 1173139343));
            }
            this.accelerationZ = 2.0 * (z - this.z - this.speedZ * n5) / (n5 * n5);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cw.af(" + ')');
        }
    }
    
    public static ObjTypeCustomisation setDestination(final int n, final Buffer buffer, final int n2) {
        try {
            final int ra = Buffer.ra(buffer, (byte)7);
            boolean b;
            if (0x0 != (ra & 0x1)) {
                if (n2 == -269387201) {
                    throw new IllegalStateException();
                }
                b = true;
            }
            else {
                b = false;
            }
            final boolean b2 = b;
            boolean b3;
            if ((ra & 0x2) != 0x0) {
                if (n2 == -269387201) {
                    throw new IllegalStateException();
                }
                b3 = true;
            }
            else {
                b3 = false;
            }
            final boolean b4 = b3;
            final ObjTypeCustomisation objTypeCustomisation = new ObjTypeCustomisation(n);
            Label_0396: {
                if (b2) {
                    if (n2 == -269387201) {
                        throw new IllegalStateException();
                    }
                    final int ra2 = Buffer.ra(buffer, (byte)7);
                    final int[] array = { ra2 & 0xF, ra2 >> 4 & 0xF };
                    while (true) {
                        Label_0415: {
                            if (objTypeCustomisation.recol == null) {
                                break Label_0415;
                            }
                            if (n2 == -269387201) {
                                throw new IllegalStateException();
                            }
                            if (array.length != objTypeCustomisation.recol.length) {
                                break Label_0415;
                            }
                            final int n3 = 1;
                            final int n4 = n3;
                            for (int i = 0; i < 2; ++i) {
                                if (n2 == -269387201) {
                                    throw new IllegalStateException();
                                }
                                if (array[i] != 15) {
                                    if (n2 == -269387201) {
                                        throw new IllegalStateException();
                                    }
                                    final short n5 = (short)buffer.readUnsignedShort(31582516);
                                    if (n4 != 0) {
                                        if (n2 == -269387201) {
                                            throw new IllegalStateException();
                                        }
                                        objTypeCustomisation.recol[array[i]] = n5;
                                    }
                                }
                            }
                            break Label_0396;
                        }
                        final int n3 = 0;
                        continue;
                    }
                }
            }
            if (b4) {
                if (n2 == -269387201) {
                    throw new IllegalStateException();
                }
                final int ra3 = Buffer.ra(buffer, (byte)7);
                final int[] array2 = { ra3 & 0xF, ra3 >> 4 & 0xF };
                boolean b5 = false;
                Label_0420: {
                    if (objTypeCustomisation.retex != null) {
                        if (n2 == -269387201) {
                            throw new IllegalStateException();
                        }
                        if (array2.length == objTypeCustomisation.retex.length) {
                            if (n2 == -269387201) {
                                throw new IllegalStateException();
                            }
                            b5 = true;
                            break Label_0420;
                        }
                    }
                    b5 = false;
                }
                final boolean b6 = b5;
                for (int j = 0; j < 2; ++j) {
                    if (n2 == -269387201) {
                        throw new IllegalStateException();
                    }
                    if (15 != array2[j]) {
                        if (n2 == -269387201) {
                            throw new IllegalStateException();
                        }
                        final short n6 = (short)buffer.readUnsignedShort(-1578765633);
                        if (b6) {
                            if (n2 == -269387201) {
                                throw new IllegalStateException();
                            }
                            objTypeCustomisation.retex[array2[j]] = n6;
                        }
                    }
                }
            }
            return objTypeCustomisation;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cw.af(" + ')');
        }
    }
    
    @Override
    protected final Model ab() {
        final Model model = ItemContainer.SpotAnimationDefinition_get(19084173 * this.id, 650533629).getModel(-888433126 * this.frame, 1403978369);
        if (model == null) {
            return null;
        }
        class162.rp(model, -1585330521 * this.pitch);
        return model;
    }
    
    public void kp(final double x) {
        this.x = x;
    }
    
    @Override
    protected final Model aq() {
        final Model model = ItemContainer.SpotAnimationDefinition_get(19084173 * this.id, 40122179).getModel(254256612 * this.frame, -26206872);
        if (model == null) {
            return null;
        }
        class162.rp(model, -1585330521 * this.pitch);
        return model;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public int getHeight() {
        return this.sourceZ * 1797140989;
    }
    
    public double getZ() {
        return this.z;
    }
    
    public double getScalar() {
        return this.speed;
    }
    
    public void lj(final double y) {
        this.y = y;
    }
    
    public static boolean ya(final class314 class314) {
        if (class314 == null) {
            return class314.hf();
        }
        return class314.field2846;
    }
    
    static long method450(final int n) {
        try {
            return Client.playerUUID * -1749026863537138247L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "cw.ho(" + ')');
        }
    }
    
    public void xg(final int n, final int n2, final int n3, final int n4) {
        this.setDestination(n, n2, n3, n4, -335674854);
    }
    
    public int jr() {
        return this.targetIndex * 803751093;
    }
    
    public void ju(final int n) {
        this.sourceX = n * 1597594169;
    }
    
    public int getStartCycle() {
        return this.cycleStart * -2048301599;
    }
    
    public Actor getInteracting() {
        final int jr = this.jr();
        if (jr > 0) {
            return (Actor)ScriptFrame.client.pb()[jr - 1];
        }
        if (jr < 0) {
            return (Actor)ScriptFrame.client.ic()[-jr - 1];
        }
        return null;
    }
    
    public int getAnimationFrame() {
        return this.frame * -693399445;
    }
    
    public Animation getAnimation() {
        return (Animation)this.sequenceDefinition;
    }
    
    public double getVelocityZ() {
        return this.speedZ;
    }
    
    public double getVelocityY() {
        return this.speedY;
    }
    
    public int getStartHeight() {
        return this.startHeight * 1485806481;
    }
    
    public void setEndCycle(final int n) {
        this.cycleEnd = n * 439544315;
    }
    
    public int getEndCycle() {
        return this.cycleEnd * -1203783373;
    }
    
    public int getEndHeight() {
        return this.endHeight * -860121869;
    }
    
    public double getVelocityX() {
        return this.speedX;
    }
    
    public int getRemainingCycles() {
        return this.getEndCycle() - ScriptFrame.client.getGameCycle();
    }
    
    public int getFloor() {
        return this.plane * -850668143;
    }
}
