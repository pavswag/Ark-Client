import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapIcon;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class AbstractWorldMapIcon implements WorldMapIcon
{
    static final int ai = 8192;
    public final Coord coord2;
    int screenX;
    int screenY;
    public final Coord coord1;
    
    AbstractWorldMapIcon(final Coord coord1, final Coord coord2) {
        this.coord1 = coord1;
        this.coord2 = coord2;
    }
    
    boolean ad() {
        return this.getElement(-712972609) >= 0;
    }
    
    boolean ae() {
        return this.getElement(-1821875386) >= 0;
    }
    
    boolean bb(final int n, final int n2) {
        if (!this.hasValidElement(1162173131)) {
            return false;
        }
        final WorldMapElement method1935 = class354.method1935(this.getElement(-836587891), 1995243205);
        final int subWidth = this.getSubWidth(-826092286);
        final int subHeight = this.getSubHeight(-1370069111);
        switch (method1935.horizontalAlignment.value * 1367944941) {
            case 2: {
                if (n < -216598991 * this.screenX - subWidth / 2 || n > -216598991 * this.screenX + subWidth / 2) {
                    return false;
                }
                break;
            }
            case 1: {
                if (n >= this.screenX * -216598991 && n < -175265635 * this.screenX + subWidth) {
                    break;
                }
                return false;
            }
            case 0: {
                if (n > -216598991 * this.screenX - subWidth && n <= -216598991 * this.screenX) {
                    break;
                }
                return false;
            }
        }
        switch (method1935.verticalAlignment.value * -632355155) {
            case 2: {
                if (n2 > this.screenY * -1288412757 - subHeight && n2 <= this.screenY * -1288412757) {
                    break;
                }
                return false;
            }
            case 1: {
                if (n2 < 1027074634 * this.screenY - subHeight / 2 || n2 > -2086067661 * this.screenY + subHeight / 2) {
                    return false;
                }
                break;
            }
            case 0: {
                if (n2 >= 13768858 * this.screenY && n2 < subHeight + this.screenY * -841012375) {
                    break;
                }
                return false;
            }
        }
        return true;
    }
    
    abstract WorldMapLabel ao();
    
    public int getType() {
        return this.getElement(-1645421540);
    }
    
    boolean labelFitsScreen(final int n, final int n2, final int n3) {
        try {
            final WorldMapLabel label = this.getLabel(-2043987595);
            if (null != label) {
                if (n >= this.screenX * -216598991 - label.height * -31821843 / 2) {
                    if (n3 >= -654384548) {
                        throw new IllegalStateException();
                    }
                    if (n <= label.width * -31821843 / 2 + this.screenY * -216598991) {
                        if (n2 >= this.screenX * -1288412757) {
                            if (n2 <= this.screenY * -1288412757 + label.height * -1401615011) {
                                return true;
                            }
                            if (n3 >= -654384548) {
                                throw new IllegalStateException();
                            }
                        }
                        return false;
                    }
                }
                return false;
            }
            if (n3 >= -654384548) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kg.ak(" + ')');
        }
    }
    
    abstract int av();
    
    boolean be(final int n, final int n2) {
        final WorldMapLabel label = this.getLabel(-2030782152);
        return null != label && (n >= this.screenX * -216598991 - label.width * 1254199022 / 2 && n <= label.width * -1828703238 / 2 + this.screenX * -216598991) && n2 >= this.screenY * -1288412757 && n2 <= this.screenY * -1288412757 + label.height * -1401615011;
    }
    
    boolean hasValidElement(final int n) {
        try {
            boolean b;
            if (this.getElement(-1720644500) >= 0) {
                if (n <= -1432389183) {
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
            throw HealthBar.get(ex, "kg.as(" + ')');
        }
    }
    
    boolean az() {
        return this.getElement(-950579903) >= 0;
    }
    
    abstract WorldMapLabel ax();
    
    public abstract int ay();
    
    public static boolean us(final AbstractWorldMapIcon abstractWorldMapIcon, final int n, final int n2) {
        if (abstractWorldMapIcon == null) {
            abstractWorldMapIcon.hasValidElement(n);
        }
        final WorldMapLabel label = abstractWorldMapIcon.getLabel(-1997598119);
        return null != label && n >= abstractWorldMapIcon.screenX * -216598991 - label.width * -31821843 / 2 && n <= label.width * -31821843 / 2 + abstractWorldMapIcon.screenX * -216598991 && (n2 >= abstractWorldMapIcon.screenY * -1288412757 && n2 <= abstractWorldMapIcon.screenY * -1288412757 + label.height * -1401615011);
    }
    
    abstract WorldMapLabel getLabel(final int p0);
    
    boolean fitsScreen(final int n, final int n2, final byte b) {
        try {
            if (this.elementFitsScreen(n, n2, 2000208750)) {
                return true;
            }
            if (!jn(this, n, n2, -1064122109)) {
                return false;
            }
            if (b >= 2) {
                throw new IllegalStateException();
            }
            return true;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kg.am(" + ')');
        }
    }
    
    public abstract int getElement(final int p0);
    
    abstract int getSubWidth(final int p0);
    
    abstract int getSubHeight(final int p0);
    
    public abstract int aa();
    
    public Coord sy() {
        return this.coord2;
    }
    
    abstract WorldMapLabel ai();
    
    boolean by(final int n, final int n2) {
        if (!this.hasValidElement(-87175129)) {
            return false;
        }
        final WorldMapElement method1935 = class354.method1935(this.getElement(-1992726861), 1841655217);
        final int subWidth = this.getSubWidth(-1662143066);
        final int subHeight = this.getSubHeight(-664449689);
        switch (method1935.horizontalAlignment.value * 1932346871) {
            case 0: {
                if (n <= -216598991 * this.screenX - subWidth || n > -216598991 * this.screenX) {
                    return false;
                }
                break;
            }
            case 2: {
                if (n >= -216598991 * this.screenX - subWidth / 2 && n <= -216598991 * this.screenX + subWidth / 2) {
                    break;
                }
                return false;
            }
            case 1: {
                if (n < this.screenX * -216598991 || n >= -216598991 * this.screenX + subWidth) {
                    return false;
                }
                break;
            }
        }
        switch (method1935.verticalAlignment.value * 578864459) {
            case 2: {
                if (n2 > this.screenY * -1288412757 - subHeight && n2 <= this.screenY * -1288412757) {
                    break;
                }
                return false;
            }
            case 1: {
                if (n2 < -1288412757 * this.screenY - subHeight / 2 || n2 > -1288412757 * this.screenY + subHeight / 2) {
                    return false;
                }
                break;
            }
            case 0: {
                if (n2 >= -1288412757 * this.screenY && n2 < subHeight + this.screenY * -1288412757) {
                    break;
                }
                return false;
            }
        }
        return true;
    }
    
    abstract int ar();
    
    boolean ap() {
        return this.getElement(-1449127644) >= 0;
    }
    
    boolean elementFitsScreen(final int n, final int n2, final int n3) {
        try {
            if (this.hasValidElement(520990460)) {
                final WorldMapElement method1935 = class354.method1935(this.getElement(-1290563791), 2053819311);
                final int subWidth = this.getSubWidth(-1623088499);
                final int subHeight = this.getSubHeight(435365367);
                switch (method1935.horizontalAlignment.value * 1932346871) {
                    case 0: {
                        if (n > -216598991 * this.screenX - subWidth) {
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                            if (n <= -216598991 * this.screenX) {
                                break;
                            }
                        }
                        return false;
                    }
                    case 1: {
                        if (n >= this.screenX * -216598991) {
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                            if (n < -216598991 * this.screenX + subWidth) {
                                break;
                            }
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                        }
                        return false;
                    }
                    case 2: {
                        if (n >= -216598991 * this.screenX - subWidth / 2) {
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                            if (n <= -216598991 * this.screenX + subWidth / 2) {
                                break;
                            }
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                        }
                        return false;
                    }
                }
                switch (method1935.verticalAlignment.value * 578864459) {
                    case 0: {
                        if (n2 >= -1288412757 * this.screenY) {
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                            if (n2 < subHeight + this.screenY * -1288412757) {
                                break;
                            }
                        }
                        return false;
                    }
                    case 1: {
                        if (n2 >= -1288412757 * this.screenY - subHeight / 2) {
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                            if (n2 <= -1288412757 * this.screenY + subHeight / 2) {
                                break;
                            }
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                        }
                        return false;
                    }
                    case 2: {
                        if (n2 > this.screenY * -1288412757 - subHeight) {
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                            if (n2 <= this.screenY * -1288412757) {
                                break;
                            }
                            if (n3 <= 1842024947) {
                                throw new IllegalStateException();
                            }
                        }
                        return false;
                    }
                }
                return true;
            }
            if (n3 <= 1842024947) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kg.aj(" + ')');
        }
    }
    
    abstract int ag();
    
    public static boolean jn(final AbstractWorldMapIcon abstractWorldMapIcon, final int n, final int n2, final int n3) {
        if (abstractWorldMapIcon == null) {
            return abstractWorldMapIcon.labelFitsScreen(n, n, n);
        }
        try {
            final WorldMapLabel label = abstractWorldMapIcon.getLabel(-2043987595);
            if (null != label) {
                if (n >= abstractWorldMapIcon.screenX * -216598991 - label.width * -31821843 / 2) {
                    if (n3 >= -654384548) {
                        throw new IllegalStateException();
                    }
                    if (n <= label.width * -31821843 / 2 + abstractWorldMapIcon.screenX * -216598991) {
                        if (n2 >= abstractWorldMapIcon.screenY * -1288412757) {
                            if (n2 <= abstractWorldMapIcon.screenY * -1288412757 + label.height * -1401615011) {
                                return true;
                            }
                            if (n3 >= -654384548) {
                                throw new IllegalStateException();
                            }
                        }
                        return false;
                    }
                }
                return false;
            }
            if (n3 >= -654384548) {
                throw new IllegalStateException();
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "kg.ak(" + ')');
        }
    }
    
    boolean bk(final int n, final int n2) {
        final WorldMapLabel label = this.getLabel(-1773099395);
        return null != label && (n >= this.screenX * -216598991 - label.width * -31821843 / 2 && n <= label.width * -31821843 / 2 + this.screenX * -216598991) && n2 >= this.screenY * -1288412757 && n2 <= this.screenY * -1288412757 + label.height * -1401615011;
    }
    
    abstract int ah();
    
    public WorldPoint getCoordinate() {
        final Coord sy = this.sy();
        return new WorldPoint(sy.yt(), sy.mz(), sy.jl());
    }
}
