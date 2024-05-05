import org.bouncycastle.crypto.tls.TlsCredentials;
import org.bouncycastle.crypto.tls.CertificateRequest;
import java.security.cert.CertificateException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.security.cert.CertificateFactory;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.TlsAuthentication;

// 
// Decompiled by Procyon v0.5.36
// 

class class11 implements TlsAuthentication
{
    static final int af = 0;
    static final int tc = 512;
    static final int bl = 2;
    final /* synthetic */ class13 this$2;
    static UrlRequest World_request;
    public static final int ak = 1;
    
    class11(final class13 this$2) {
        this.this$2 = this$2;
    }
    
    public void aw(final Certificate certificate) throws IOException {
        try {
            final CertificateFactory instance = CertificateFactory.getInstance("X.509");
            final LinkedList<java.security.cert.Certificate> list = new LinkedList<java.security.cert.Certificate>();
            final org.bouncycastle.asn1.x509.Certificate[] certificateList = certificate.getCertificateList();
            for (int i = 0; i < certificateList.length; ++i) {
                list.add(instance.generateCertificate(new ByteArrayInputStream(certificateList[i].getEncoded())));
            }
            this.this$2.this$1.field40 = list.toArray(new java.security.cert.Certificate[0]);
        }
        catch (CertificateException cause) {
            throw new IOException(cause);
        }
    }
    
    public void an(final Certificate certificate) throws IOException {
        try {
            final CertificateFactory instance = CertificateFactory.getInstance("X.509");
            final LinkedList<java.security.cert.Certificate> list = new LinkedList<java.security.cert.Certificate>();
            final org.bouncycastle.asn1.x509.Certificate[] certificateList = certificate.getCertificateList();
            for (int i = 0; i < certificateList.length; ++i) {
                list.add(instance.generateCertificate(new ByteArrayInputStream(certificateList[i].getEncoded())));
            }
            this.this$2.this$1.field40 = list.toArray(new java.security.cert.Certificate[0]);
        }
        catch (CertificateException cause) {
            throw new IOException(cause);
        }
    }
    
    public TlsCredentials ac(final CertificateRequest certificateRequest) throws IOException {
        return null;
    }
    
    public TlsCredentials au(final CertificateRequest certificateRequest) throws IOException {
        return null;
    }
    
    public void af(final Certificate certificate) throws IOException {
        try {
            final CertificateFactory instance = CertificateFactory.getInstance("X.509");
            final LinkedList<java.security.cert.Certificate> list = new LinkedList<java.security.cert.Certificate>();
            final org.bouncycastle.asn1.x509.Certificate[] certificateList = certificate.getCertificateList();
            for (int i = 0; i < certificateList.length; ++i) {
                list.add(instance.generateCertificate(new ByteArrayInputStream(certificateList[i].getEncoded())));
            }
            this.this$2.this$1.field40 = list.toArray(new java.security.cert.Certificate[0]);
        }
        catch (CertificateException cause) {
            throw new IOException(cause);
        }
    }
    
    public TlsCredentials getClientCredentials(final CertificateRequest certificateRequest) throws IOException {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ao.getClientCredentials(" + ')');
        }
    }
    
    public void notifyServerCertificate(final Certificate certificate) throws IOException {
        try {
            try {
                final CertificateFactory instance = CertificateFactory.getInstance("X.509");
                final LinkedList<java.security.cert.Certificate> list = new LinkedList<java.security.cert.Certificate>();
                final org.bouncycastle.asn1.x509.Certificate[] certificateList = certificate.getCertificateList();
                for (int i = 0; i < certificateList.length; ++i) {
                    list.add(instance.generateCertificate(new ByteArrayInputStream(certificateList[i].getEncoded())));
                }
                this.this$2.this$1.field40 = list.toArray(new java.security.cert.Certificate[0]);
            }
            catch (CertificateException cause) {
                throw new IOException(cause);
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ao.notifyServerCertificate(" + ')');
        }
    }
    
    static final void drawInterface(final Widget[] field2292, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        Client.za(field2292, n, n2, n3, n4, n5, n6, n7, n8);
        try {
            Rasterizer2D.Rasterizer2D_setClip(n2, n3, n4, n5);
            class18.method68(1601417771);
            for (int i = 0; i < field2292.length; ++i) {
                if (n9 != -465475629) {
                    throw new IllegalStateException();
                }
                final Widget widget = field2292[i];
                if (widget == null) {
                    if (n9 != -465475629) {
                        throw new IllegalStateException();
                    }
                }
                else {
                    if (widget.parentId * 913615679 != n) {
                        if (n9 != -465475629) {
                            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                            return;
                        }
                        if (n != -1412584499) {
                            continue;
                        }
                        if (n9 != -465475629) {
                            throw new IllegalStateException();
                        }
                        if (Client.clickedWidget != widget) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            continue;
                        }
                    }
                    int n10;
                    if (n8 == -1) {
                        Client.rootWidgetXs[Client.rootWidgetCount * -356793645] = n6 + 262951665 * widget.x;
                        Client.rootWidgetYs[-356793645 * Client.rootWidgetCount] = widget.y * -747355095 + n7;
                        Client.rootWidgetWidths[-356793645 * Client.rootWidgetCount] = -794961409 * widget.width;
                        Client.rootWidgetHeights[-356793645 * Client.rootWidgetCount] = 1473950221 * widget.height;
                        n10 = (Client.rootWidgetCount += 1127867739) * -356793645 - 1;
                    }
                    else {
                        n10 = n8;
                    }
                    widget.rootIndex = n10 * -1548573671;
                    widget.cycle = -95399417 * Client.cycle;
                    if (widget.modelOrthog) {
                        if (n9 != -465475629) {
                            throw new IllegalStateException();
                        }
                        if (class393.isComponentHidden(widget, (byte)1)) {
                            if (n9 != -465475629) {
                                Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                return;
                            }
                            continue;
                        }
                    }
                    if (1021339961 * widget.contentType > 0) {
                        if (n9 != -465475629) {
                            throw new IllegalStateException();
                        }
                        MouseHandler.method193(widget, 1973631354);
                    }
                    int n11 = n6 + 262951665 * widget.x;
                    int n12 = n7 + -747355095 * widget.y;
                    int n13 = 1634279623 * widget.transparencyTop;
                    if (widget == Client.clickedWidget) {
                        if (n9 != -465475629) {
                            throw new IllegalStateException();
                        }
                        if (-1412584499 != n) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            if (!widget.spriteFlipH) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                WorldMapSection2.field2292 = field2292;
                                class230.field2130 = n6 * -774716861;
                                class101.field1082 = 389070991 * n7;
                                continue;
                            }
                        }
                        if (Client.isDraggingWidget) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            if (Client.field540) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                final int n14 = -2063363905 * MouseHandler.MouseHandler_x;
                                final int n15 = MouseHandler.MouseHandler_y * -1224153235;
                                int n16 = n14 - Client.widgetClickX * -1789924433;
                                int n17 = n15 - 1902621241 * Client.widgetClickY;
                                if (n16 < 1084046795 * Client.field495) {
                                    n16 = Client.field495 * 1084046795;
                                }
                                if (n16 + -794961409 * widget.width > -794961409 * Client.clickedWidgetParent.width + 1084046795 * Client.field495) {
                                    if (n9 != -465475629) {
                                        throw new IllegalStateException();
                                    }
                                    n16 = 1084046795 * Client.field495 + Client.clickedWidgetParent.width * -794961409 - widget.width * -794961409;
                                }
                                if (n17 < Client.field542 * -746723443) {
                                    if (n9 != -465475629) {
                                        throw new IllegalStateException();
                                    }
                                    n17 = Client.field542 * -746723443;
                                }
                                if (1473950221 * widget.height + n17 > Client.clickedWidgetParent.height * 1473950221 + -746723443 * Client.field542) {
                                    if (n9 != -465475629) {
                                        Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                        return;
                                    }
                                    n17 = Client.clickedWidgetParent.height * 1473950221 + Client.field542 * -746723443 - 1473950221 * widget.height;
                                }
                                n11 = n16;
                                n12 = n17;
                            }
                        }
                        if (!widget.spriteFlipH) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            n13 = 128;
                        }
                    }
                    int n25;
                    int n27;
                    int n28;
                    int n30;
                    if (9 == widget.type * 883712245) {
                        if (n9 != -465475629) {
                            throw new IllegalStateException();
                        }
                        int n18 = n11;
                        int n19 = n12;
                        int n20 = n11 + -794961409 * widget.width;
                        int n21 = widget.height * 1473950221 + n12;
                        if (n20 < n18) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            final int n22 = n18;
                            n18 = n20;
                            n20 = n22;
                        }
                        if (n21 < n19) {
                            final int n23 = n19;
                            n19 = n21;
                            n21 = n23;
                        }
                        ++n20;
                        ++n21;
                        int n24;
                        if (n18 > n2) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            n24 = n18;
                        }
                        else {
                            n24 = n2;
                        }
                        n25 = n24;
                        int n26;
                        if (n19 > n3) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            n26 = n19;
                        }
                        else {
                            n26 = n3;
                        }
                        n27 = n26;
                        n28 = ((n20 < n4) ? n20 : n4);
                        int n29;
                        if (n21 < n5) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            n29 = n21;
                        }
                        else {
                            n29 = n5;
                        }
                        n30 = n29;
                    }
                    else {
                        final int n31 = widget.width * -794961409 + n11;
                        final int n32 = widget.height * 1473950221 + n12;
                        n25 = ((n11 > n2) ? n11 : n2);
                        int n33;
                        if (n12 > n3) {
                            if (n9 != -465475629) {
                                Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                return;
                            }
                            n33 = n12;
                        }
                        else {
                            n33 = n3;
                        }
                        n27 = n33;
                        int n34;
                        if (n31 < n4) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            n34 = n31;
                        }
                        else {
                            n34 = n4;
                        }
                        n28 = n34;
                        int n35;
                        if (n32 < n5) {
                            if (n9 != -465475629) {
                                Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                return;
                            }
                            n35 = n32;
                        }
                        else {
                            n35 = n5;
                        }
                        n30 = n35;
                    }
                    if (widget.modelOrthog) {
                        if (n25 >= n28) {
                            continue;
                        }
                        if (n9 != -465475629) {
                            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                            return;
                        }
                        if (n27 >= n30) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            continue;
                        }
                    }
                    if (widget.contentType * 1021339961 != 0) {
                        if (1021339961 * widget.contentType == 1336) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            if (!class20.clientPreferences.method562((short)(-12734))) {
                                continue;
                            }
                            if (n9 != -465475629) {
                                Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                return;
                            }
                            n12 += 15;
                            WallDecoration.fontPlain12.as("Fps:" + Client.aa * 1913114939, n11 + -794961409 * widget.width, n12, 16776960, -1);
                            n12 += 15;
                            final Runtime runtime = Runtime.getRuntime();
                            final int j = (int)((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                            int n36 = 16776960;
                            if (j > 327680 && !Client.isLowDetail) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                n36 = 16711680;
                            }
                            WallDecoration.fontPlain12.as("Mem:" + j + "k", n11 + -794961409 * widget.width, n12, n36, -1);
                            n12 += 15;
                            continue;
                        }
                        else if (widget.contentType * 1021339961 == 1337) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            Client.viewportX = n11 * 563689483;
                            Client.viewportY = n12 * 2111961447;
                            class18.drawEntities(n11, n12, widget.width * -794961409, widget.height * 1473950221, -1135729474);
                            Client.field573[widget.rootIndex * 372799529] = true;
                            Rasterizer2D.Rasterizer2D_setClip(n2, n3, n4, n5);
                            continue;
                        }
                        else if (1021339961 * widget.contentType == 1338) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            class155.drawMinimap(widget, n11, n12, n10, 715793835);
                            Rasterizer2D.Rasterizer2D_setClip(n2, n3, n4, n5);
                            continue;
                        }
                        else if (1339 == widget.contentType * 1021339961) {
                            if (n9 != -465475629) {
                                Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                return;
                            }
                            DynamicObject.drawCompass(widget, n11, n12, n10, 759225225);
                            Rasterizer2D.Rasterizer2D_setClip(n2, n3, n4, n5);
                            continue;
                        }
                        else {
                            if (widget.contentType * 1021339961 == 1400) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                WorldMap.flashCategory(class126.worldMap, n11, n12, -794961409 * widget.width, widget.height * 1473950221, Client.cycle * -1886224337, -2111380198);
                            }
                            if (1401 == 1021339961 * widget.contentType) {
                                class126.worldMap.drawOverview(n11, n12, widget.width * -794961409, 1473950221 * widget.height, (byte)19);
                            }
                            if (widget.contentType * 1021339961 == 1402) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                class121.field1184.draw(n11, Client.cycle * -1886224337, -1861911069);
                            }
                        }
                    }
                    if (0 == 883712245 * widget.type) {
                        if (!widget.modelOrthog) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            if (class393.isComponentHidden(widget, (byte)1)) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                if (MidiPcmStream.mousedOverWidgetIf1 != widget) {
                                    if (n9 != -465475629) {
                                        throw new IllegalStateException();
                                    }
                                    continue;
                                }
                            }
                        }
                        if (!widget.modelOrthog) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            if (widget.scrollY * 1223232735 > widget.scrollHeight * -1273374131 - widget.height * 1473950221) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                widget.scrollY = widget.scrollHeight * 1941770835 - widget.height * 978547347;
                            }
                            if (1223232735 * widget.scrollY < 0) {
                                if (n9 != -465475629) {
                                    Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                    return;
                                }
                                widget.scrollY = 0;
                            }
                        }
                        drawInterface(field2292, widget.id * 1713081171, n25, n27, n28, n30, n11 - widget.scrollX * -1469632775, n12 - 1223232735 * widget.scrollY, n10, -465475629);
                        if (widget.children != null) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            drawInterface(widget.children, widget.id * 1713081171, n25, n27, n28, n30, n11 - widget.scrollX * -1469632775, n12 - widget.scrollY * 1223232735, n10, -465475629);
                        }
                        final InterfaceParent interfaceParent = (InterfaceParent)Client.interfaceParents.at(1713081171 * widget.id);
                        if (null != interfaceParent) {
                            class13.drawWidgets(interfaceParent.group * 944864121, n25, n27, n28, n30, n11, n12, n10, (byte)(-123));
                        }
                        Rasterizer2D.Rasterizer2D_setClip(n2, n3, n4, n5);
                        class18.method68(1351667699);
                    }
                    else if (11 == widget.type * 883712245) {
                        if (n9 != -465475629) {
                            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                            return;
                        }
                        if (class393.isComponentHidden(widget, (byte)1)) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            if (MidiPcmStream.mousedOverWidgetIf1 != widget) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                continue;
                            }
                        }
                        if (widget.children != null) {
                            drawInterface(widget.children, widget.id * 1713081171, n25, n27, n28, n30, n11 - -1469632775 * widget.scrollX, n12 - 1223232735 * widget.scrollY, n10, -465475629);
                        }
                        Rasterizer2D.Rasterizer2D_setClip(n2, n3, n4, n5);
                        class18.method68(2059125706);
                    }
                    if (!Client.isResizable && !Client.field519[n10] && -1928160607 * Client.gameDrawingMode <= 1) {
                        if (n9 != -465475629) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        if (0 == 883712245 * widget.type) {
                            if (n9 != -465475629) {
                                throw new IllegalStateException();
                            }
                            if (!widget.modelOrthog) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                if (widget.scrollHeight * -1273374131 > widget.height * 1473950221) {
                                    class103.drawScrollBar(n11 + widget.width * -794961409, n12, widget.scrollY * 1223232735, 1473950221 * widget.height, -1273374131 * widget.scrollHeight, (byte)0);
                                }
                            }
                        }
                        if (1 != widget.type * 883712245) {
                            if (883712245 * widget.type == 3) {
                                int n37;
                                if (class452.runCs1(widget, 1111534297)) {
                                    n37 = widget.color2 * 1449039161;
                                    if (widget == MidiPcmStream.mousedOverWidgetIf1) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        if (1780253209 * widget.mouseOverColor2 != 0) {
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            n37 = 1780253209 * widget.mouseOverColor2;
                                        }
                                    }
                                }
                                else {
                                    n37 = widget.color * 1409091639;
                                    if (widget == MidiPcmStream.mousedOverWidgetIf1) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        if (0 != widget.mouseOverColor * 1614966389) {
                                            if (n9 != -465475629) {
                                                Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                                return;
                                            }
                                            n37 = widget.mouseOverColor * 1614966389;
                                        }
                                    }
                                }
                                if (widget.noScrollThrough) {
                                    if (n9 != -465475629) {
                                        Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                        return;
                                    }
                                    switch (widget.fillMode.field4118 * -894516731) {
                                        case 2: {
                                            Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(n11, n12, -794961409 * widget.width, 1473950221 * widget.height, widget.color * 1409091639, widget.color2 * 1449039161, 255 - (widget.transparencyTop * 1634279623 & 0xFF), 255 - (widget.transparencyBot * 122284991 & 0xFF));
                                            break;
                                        }
                                        case 1: {
                                            Rasterizer2D.Rasterizer2D_fillRectangleGradient(n11, n12, -794961409 * widget.width, 1473950221 * widget.height, 1409091639 * widget.color, widget.color2 * 1449039161);
                                            break;
                                        }
                                        default: {
                                            if (n13 != 0) {
                                                Rasterizer2D.Rasterizer2D_fillRectangleAlpha(n11, n12, -794961409 * widget.width, 1473950221 * widget.height, n37, 256 - (n13 & 0xFF));
                                                break;
                                            }
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            Rasterizer2D.Rasterizer2D_fillRectangle(n11, n12, widget.width * -794961409, widget.height * 1473950221, n37);
                                            break;
                                        }
                                    }
                                }
                                else if (n13 == 0) {
                                    if (n9 != -465475629) {
                                        Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                        return;
                                    }
                                    Rasterizer2D.Rasterizer2D_drawRectangle(n11, n12, widget.width * -794961409, 1473950221 * widget.height, n37);
                                }
                                else {
                                    Rasterizer2D.Rasterizer2D_drawRectangleAlpha(n11, n12, widget.width * -794961409, 1473950221 * widget.height, n37, 256 - (n13 & 0xFF));
                                }
                            }
                            else if (883712245 * widget.type == 4) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                final Font font = widget.getFont(-1026608542);
                                if (font == null) {
                                    if (n9 != -465475629) {
                                        throw new IllegalStateException();
                                    }
                                    if (Widget.field2877) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        class144.invalidateWidget(widget, -1138378183);
                                    }
                                }
                                else {
                                    String str = widget.field2916;
                                    int n38;
                                    if (class452.runCs1(widget, -1469903597)) {
                                        if (n9 != -465475629) {
                                            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                            return;
                                        }
                                        n38 = widget.color2 * 1449039161;
                                        if (MidiPcmStream.mousedOverWidgetIf1 == widget) {
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            if (widget.mouseOverColor2 * 1780253209 != 0) {
                                                if (n9 != -465475629) {
                                                    Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                                    return;
                                                }
                                                n38 = widget.mouseOverColor2 * 1780253209;
                                            }
                                        }
                                        if (widget.buttonText.length() > 0) {
                                            if (n9 != -465475629) {
                                                Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                                return;
                                            }
                                            str = widget.buttonText;
                                        }
                                    }
                                    else {
                                        n38 = widget.color * 1409091639;
                                        if (widget == MidiPcmStream.mousedOverWidgetIf1) {
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            if (0 != 1614966389 * widget.mouseOverColor) {
                                                if (n9 != -465475629) {
                                                    throw new IllegalStateException();
                                                }
                                                n38 = widget.mouseOverColor * 1614966389;
                                            }
                                        }
                                    }
                                    Label_4078: {
                                        if (widget.modelOrthog && -1 != widget.itemId * -2006098851) {
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            final ItemComposition set = HealthBarUpdate.set(-2006098851 * widget.itemId, (byte)84);
                                            str = set.name;
                                            if (str == null) {
                                                if (n9 != -465475629) {
                                                    throw new IllegalStateException();
                                                }
                                                str = Strings.at;
                                            }
                                            if (1 != 1552863327 * set.isStackable) {
                                                if (n9 != -465475629) {
                                                    throw new IllegalStateException();
                                                }
                                                if (1 == 1336975799 * widget.itemQuantity) {
                                                    break Label_4078;
                                                }
                                            }
                                            if (-1 != 1336975799 * widget.itemQuantity) {
                                                str = class383.method2081(16748608, 381910630) + str + class96.al + " " + 'x' + ArchiveDiskAction.formatItemStacks(widget.itemQuantity * 1336975799, (short)13178);
                                            }
                                        }
                                    }
                                    if (widget == Client.meslayerContinueWidget) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        str = Strings.gi;
                                        n38 = 1409091639 * widget.color;
                                    }
                                    if (!widget.modelOrthog) {
                                        str = class121.method720(str, widget, (short)(-1115));
                                    }
                                    final Font font2 = font;
                                    final String s = str;
                                    final int n39 = n11;
                                    final int n40 = n12;
                                    final int n41 = widget.width * -794961409;
                                    final int n42 = widget.height * 1473950221;
                                    final int n43 = n38;
                                    int n44;
                                    if (widget.isIf3) {
                                        if (n9 != -465475629) {
                                            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                            return;
                                        }
                                        n44 = 0;
                                    }
                                    else {
                                        n44 = -1;
                                    }
                                    font2.az(s, n39, n40, n41, n42, n43, n44, Decimator.scaleRate(1634279623 * widget.transparencyTop, -1509749765), widget.textXAlignment * 1002257489, widget.textYAlignment * -1553957401, -931338759 * widget.textLineHeight);
                                }
                            }
                            else if (5 == 883712245 * widget.type) {
                                if (n9 != -465475629) {
                                    Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                    return;
                                }
                                if (!widget.modelOrthog) {
                                    if (n9 != -465475629) {
                                        Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                        return;
                                    }
                                    final SpritePixels sprite = widget.getSprite(class452.runCs1(widget, -926085801), class14.urlRequester, (byte)0);
                                    if (sprite != null) {
                                        if (n9 != -465475629) {
                                            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                            return;
                                        }
                                        sprite.drawAt(n11, n12);
                                    }
                                    else if (Widget.field2877) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        class144.invalidateWidget(widget, -1641665110);
                                    }
                                }
                                else {
                                    SpritePixels spritePixels;
                                    if (-1 != -2006098851 * widget.itemId) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        spritePixels = class252.getItemSprite(widget.itemId * -2006098851, widget.itemQuantity * 1336975799, widget.outline * 1638912775, -353676735 * widget.spriteShadow, widget.itemQuantityMode * -1681772717, false, 13705148);
                                    }
                                    else {
                                        spritePixels = widget.getSprite(false, class14.urlRequester, (byte)0);
                                    }
                                    if (null != spritePixels) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        final int width = spritePixels.width;
                                        final int height = spritePixels.height;
                                        Label_5054: {
                                            if (widget.field2913) {
                                                Rasterizer2D.Rasterizer2D_expandClip(n11, n12, widget.width * -794961409 + n11, widget.height * 1473950221 + n12);
                                                final int n45 = (widget.width * -794961409 + (width - 1)) / width;
                                                final int n46 = (height - 1 + widget.height * 1473950221) / height;
                                                for (int k = 0; k < n45; ++k) {
                                                    if (n9 != -465475629) {
                                                        throw new IllegalStateException();
                                                    }
                                                    for (int l = 0; l < n46; ++l) {
                                                        if (n9 != -465475629) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (widget.spriteAngle * -738051099 != 0) {
                                                            if (n9 != -465475629) {
                                                                Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                                                return;
                                                            }
                                                            spritePixels.method2632(k * width + n11 + width / 2, height / 2 + (n12 + l * height), widget.spriteAngle * -738051099, 4096);
                                                        }
                                                        else if (n13 != 0) {
                                                            if (n9 != -465475629) {
                                                                throw new IllegalStateException();
                                                            }
                                                            spritePixels.drawTransAt(n11 + width * k, height * l + n12, 256 - (n13 & 0xFF));
                                                        }
                                                        else {
                                                            spritePixels.drawAt(k * width + n11, n12 + height * l);
                                                        }
                                                    }
                                                }
                                                Rasterizer2D.Rasterizer2D_setClip(n2, n3, n4, n5);
                                            }
                                            else {
                                                final int n47 = -576720896 * widget.width / width;
                                                if (widget.spriteAngle * -738051099 != 0) {
                                                    spritePixels.method2632(widget.width * -794961409 / 2 + n11, widget.height * 1473950221 / 2 + n12, widget.spriteAngle * -738051099, n47);
                                                }
                                                else if (n13 != 0) {
                                                    if (n9 != -465475629) {
                                                        throw new IllegalStateException();
                                                    }
                                                    spritePixels.drawTransScaledAt(n11, n12, widget.width * -794961409, widget.height * 1473950221, 256 - (n13 & 0xFF));
                                                }
                                                else {
                                                    if (widget.width * -794961409 == width) {
                                                        if (n9 != -465475629) {
                                                            throw new IllegalStateException();
                                                        }
                                                        if (height == widget.height * 1473950221) {
                                                            spritePixels.drawAt(n11, n12);
                                                            break Label_5054;
                                                        }
                                                        if (n9 != -465475629) {
                                                            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                                            return;
                                                        }
                                                    }
                                                    spritePixels.drawScaledAt(n11, n12, -794961409 * widget.width, widget.height * 1473950221);
                                                }
                                            }
                                        }
                                    }
                                    else if (Widget.field2877) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        class144.invalidateWidget(widget, -2116643428);
                                    }
                                }
                            }
                            else if (883712245 * widget.type == 6) {
                                if (n9 != -465475629) {
                                    throw new IllegalStateException();
                                }
                                final boolean runCs1 = class452.runCs1(widget, 1287761873);
                                int n48;
                                if (runCs1) {
                                    if (n9 != -465475629) {
                                        throw new IllegalStateException();
                                    }
                                    n48 = widget.sequenceId2 * -717228843;
                                }
                                else {
                                    n48 = -1526544909 * widget.sequenceId;
                                }
                                Model model = null;
                                int n49 = 0;
                                if (-1 != -2006098851 * widget.itemId) {
                                    if (n9 != -465475629) {
                                        throw new IllegalStateException();
                                    }
                                    final ItemComposition set2 = HealthBarUpdate.set(-2006098851 * widget.itemId, (byte)97);
                                    if (set2 != null) {
                                        if (n9 != -465475629) {
                                            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                            return;
                                        }
                                        model = set2.getCountObj(widget.itemQuantity * 1336975799, -1245507934).getModel(1, -891415962);
                                        if (null != model) {
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            model.calculateBoundsCylinder();
                                            n49 = 1550732737 * model.et / 2;
                                        }
                                        else {
                                            class144.invalidateWidget(widget, -2080051144);
                                        }
                                    }
                                }
                                else if (widget.modelType * -123768459 == 5) {
                                    if (n9 != -465475629) {
                                        throw new IllegalStateException();
                                    }
                                    if (0 == -168077555 * widget.modelId) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        model = Client.playerAppearance.getModel(null, -1, null, -1, (byte)42);
                                    }
                                    else {
                                        model = MusicPatchNode.localPlayer.getModel((byte)(-112));
                                    }
                                }
                                else if (-123768459 * widget.modelType == 7) {
                                    if (n9 != -465475629) {
                                        throw new IllegalStateException();
                                    }
                                    model = widget.field2894.getModel(null, -1, ItemContainer.SpotAnimationDefinition_get(MusicPatchNode.localPlayer.cd * 1590591885, (byte)121), 424813829 * MusicPatchNode.localPlayer.bp, (byte)25);
                                }
                                else {
                                    NPCComposition definition = null;
                                    NewShit method599 = null;
                                    if (6 == -123768459 * widget.modelType) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        final int n50 = widget.modelId * -168077555;
                                        if (n50 >= 0) {
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            if (n50 < Client.npcs.length) {
                                                if (n9 != -465475629) {
                                                    throw new IllegalStateException();
                                                }
                                                final NPC npc = Client.npcs[n50];
                                                if (npc != null) {
                                                    if (n9 != -465475629) {
                                                        throw new IllegalStateException();
                                                    }
                                                    definition = npc.definition;
                                                    method599 = npc.method599(-767962512);
                                                }
                                            }
                                        }
                                    }
                                    SequenceDefinition spotAnimationDefinition_get = null;
                                    int n51 = -1;
                                    if (n48 != -1) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(n48, (byte)25);
                                        n51 = 1575517389 * widget.modelFrame;
                                    }
                                    model = widget.getModel(spotAnimationDefinition_get, n51, runCs1, MusicPatchNode.localPlayer.appearance, definition, method599, 764440828);
                                    if (model == null) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        if (Widget.field2877) {
                                            class144.invalidateWidget(widget, -851541316);
                                        }
                                    }
                                }
                                WorldMapArea.getRegionLowX(n11 + widget.width * -794961409 / 2, widget.height * 1473950221 / 2 + n12, (byte)32);
                                final int n52 = widget.modelZoom * 942674363 * Rasterizer3D.Rasterizer3D_sine[797932055 * widget.modelAngleX] >> 16;
                                final int n53 = 942674363 * widget.modelZoom * Rasterizer3D.Rasterizer3D_cosine[797932055 * widget.modelAngleX] >> 16;
                                if (model != null) {
                                    if (n9 != -465475629) {
                                        throw new IllegalStateException();
                                    }
                                    if (!widget.modelOrthog) {
                                        if (n9 != -465475629) {
                                            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                            return;
                                        }
                                        model.method1343(0, widget.modelAngleY * -480949115, 0, widget.modelAngleX * 797932055, 0, n52, n53);
                                    }
                                    else {
                                        model.calculateBoundsCylinder();
                                        if (widget.field2891) {
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            model.method1327(0, -480949115 * widget.modelAngleY, -1023931993 * widget.modelAngleZ, 797932055 * widget.modelAngleX, widget.modelOffsetX * 1909456039, widget.modelOffsetY * 844501061 + (n52 + n49), n53 + widget.modelOffsetY * 844501061, 942674363 * widget.modelZoom);
                                        }
                                        else {
                                            model.method1343(0, widget.modelAngleY * -480949115, -1023931993 * widget.modelAngleZ, 797932055 * widget.modelAngleX, widget.modelOffsetX * 1909456039, widget.modelOffsetY * 844501061 + (n52 + n49), 844501061 * widget.modelOffsetY + n53);
                                        }
                                    }
                                }
                                Tiles.method474(1441948024);
                            }
                            else {
                                if (8 == widget.type * 883712245) {
                                    if (n9 != -465475629) {
                                        Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                        return;
                                    }
                                    if (class130.field1274 == widget) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        if (Client.field515 * 1239377975 == Client.field514 * 215597333) {
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            int n54 = 0;
                                            int n55 = 0;
                                            final Font fontPlain12 = WallDecoration.fontPlain12;
                                            String s2 = class121.method720(widget.field2916, widget, (short)(-6684));
                                            while (s2.length() > 0) {
                                                final int index = s2.indexOf(class96.aq);
                                                String substring;
                                                if (-1 != index) {
                                                    substring = s2.substring(0, index);
                                                    s2 = s2.substring(4 + index);
                                                }
                                                else {
                                                    substring = s2;
                                                    s2 = "";
                                                }
                                                final int bf = fontPlain12.bf(substring);
                                                if (bf > n54) {
                                                    if (n9 != -465475629) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n54 = bf;
                                                }
                                                n55 += 1 + fontPlain12.al;
                                            }
                                            n54 += 6;
                                            n55 += 7;
                                            int n56 = n11 + widget.width * -794961409 - 5 - n54;
                                            int n57 = widget.height * 1473950221 + n12 + 5;
                                            if (n56 < 5 + n11) {
                                                if (n9 != -465475629) {
                                                    throw new IllegalStateException();
                                                }
                                                n56 = 5 + n11;
                                            }
                                            if (n54 + n56 > n4) {
                                                if (n9 != -465475629) {
                                                    throw new IllegalStateException();
                                                }
                                                n56 = n4 - n54;
                                            }
                                            if (n57 + n55 > n5) {
                                                if (n9 != -465475629) {
                                                    throw new IllegalStateException();
                                                }
                                                n57 = n5 - n55;
                                            }
                                            Rasterizer2D.Rasterizer2D_fillRectangle(n56, n57, n54, n55, 16777120);
                                            Rasterizer2D.Rasterizer2D_drawRectangle(n56, n57, n54, n55, 0);
                                            final String field2293 = widget.field2916;
                                            int n58 = n57 + fontPlain12.al + 2;
                                            String s3 = class121.method720(field2293, widget, (short)(-19863));
                                            while (s3.length() > 0) {
                                                if (n9 != -465475629) {
                                                    throw new IllegalStateException();
                                                }
                                                final int index2 = s3.indexOf(class96.aq);
                                                String substring2;
                                                if (-1 != index2) {
                                                    if (n9 != -465475629) {
                                                        throw new IllegalStateException();
                                                    }
                                                    substring2 = s3.substring(0, index2);
                                                    s3 = s3.substring(4 + index2);
                                                }
                                                else {
                                                    substring2 = s3;
                                                    s3 = "";
                                                }
                                                class492.xb(fontPlain12, substring2, n56 + 3, n58, 0, -1);
                                                n58 += 1 + fontPlain12.al;
                                            }
                                        }
                                    }
                                }
                                if (9 == widget.type * 883712245) {
                                    if (n9 != -465475629) {
                                        Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                        return;
                                    }
                                    int n59;
                                    int n60;
                                    int n61;
                                    int n62;
                                    if (widget.isScrollBar) {
                                        n59 = n11;
                                        n60 = n12 + 1473950221 * widget.height;
                                        n61 = n11 + widget.width * -794961409;
                                        n62 = n12;
                                    }
                                    else {
                                        n59 = n11;
                                        n60 = n12;
                                        n61 = -794961409 * widget.width + n11;
                                        n62 = 1473950221 * widget.height + n12;
                                    }
                                    if (1354778849 * widget.lineWid == 1) {
                                        Rasterizer2D.Rasterizer2D_drawLine(n59, n60, n61, n62, 1409091639 * widget.color);
                                    }
                                    else {
                                        class36.method196(n59, n60, n61, n62, widget.color * 1409091639, 1354778849 * widget.lineWid, (byte)109);
                                    }
                                }
                                else if (widget.type * 883712245 == 12) {
                                    final class314 method600 = widget.method1815((byte)(-11));
                                    final class309 method601 = widget.method1817(-1740765458);
                                    if (method600 != null) {
                                        if (n9 != -465475629) {
                                            throw new IllegalStateException();
                                        }
                                        if (method601 != null) {
                                            if (n9 != -465475629) {
                                                throw new IllegalStateException();
                                            }
                                            if (method600.da(32293634)) {
                                                if (n9 != -465475629) {
                                                    throw new IllegalStateException();
                                                }
                                                final Font font3 = widget.getFont(-2008044162);
                                                if (null != font3) {
                                                    if (n9 != -465475629) {
                                                        throw new IllegalStateException();
                                                    }
                                                    Client.field565.method2637(n11, n12, widget.width * -794961409, 1473950221 * widget.height, class314.jo(method600, -57692379), class314.method1714(method600, -91399205), method600.method1769(-483082370), method600.method1753(-1050882526), method600.method1745((byte)(-30)), 1599579546);
                                                    int n63;
                                                    if (widget.isIf3) {
                                                        if (n9 != -465475629) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n63 = widget.spriteShadow * -353676735;
                                                    }
                                                    else {
                                                        n63 = -1;
                                                    }
                                                    final int n64 = n63;
                                                    Label_7389: {
                                                        if (!class314.method1728(method600, 1797956020)) {
                                                            if (n9 != -465475629) {
                                                                Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
                                                                return;
                                                            }
                                                            if (method600.method1740(-1995273155).method2004(-1182697415)) {
                                                                if (n9 != -465475629) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                Client.field565.method2639(method601.field2816 * 1912484269, n64, method601.field2817 * -90398499, 216034339 * method601.field2818, 561435765);
                                                                Client.field565.method2638(method600.method1741((byte)(-94)), font3, (byte)(-20));
                                                                break Label_7389;
                                                            }
                                                        }
                                                        Client.field565.method2639(widget.color * 1409091639, n64, -90398499 * method601.field2817, 216034339 * method601.field2818, -379953391);
                                                        Client.field565.method2638(method600.method1740(-1580027563), font3, (byte)(-24));
                                                    }
                                                    Rasterizer2D.Rasterizer2D_setClip(n2, n3, n4, n5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Client.il(field2292, n, n2, n3, n4, n5, n6, n7, n8);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ao.lh(" + ')');
        }
    }
}
