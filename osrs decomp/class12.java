import java.io.OutputStream;
import java.io.InputStream;
import javax.net.ssl.SSLSession;
import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsClient;
import javax.net.ssl.HandshakeCompletedListener;
import java.security.cert.Certificate;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import javax.net.ssl.SSLSocket;

// 
// Decompiled by Procyon v0.5.36
// 

class class12 extends SSLSocket
{
    final /* synthetic */ TlsClientProtocol val$tlsClientProtocol;
    Certificate[] field40;
    static boolean clearLoginScreen;
    final /* synthetic */ class15 this$0;
    static final int ak = 24;
    final /* synthetic */ String val$host;
    public static final int bh = 66;
    static final int ac = 4;
    public static final int dc = 102;
    
    class12(final class15 this$0, final TlsClientProtocol val$tlsClientProtocol, final String val$host) {
        this.this$0 = this$0;
        this.val$tlsClientProtocol = val$tlsClientProtocol;
        this.val$host = val$host;
    }
    
    public void bs(final HandshakeCompletedListener handshakeCompletedListener) {
    }
    
    public String[] ad() {
        return null;
    }
    
    public void ba(final boolean b) {
    }
    
    public String[] ae() {
        return null;
    }
    
    public static void cr(final class12 class12) throws IOException {
        class12.val$tlsClientProtocol.connect((TlsClient)new class13(class12));
    }
    
    public void ce(final boolean b) {
    }
    
    public String[] bb() {
        return null;
    }
    
    @Override
    public synchronized void close() throws IOException {
        try {
            this.val$tlsClientProtocol.close();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.close(" + ')');
        }
    }
    
    public boolean at() {
        return false;
    }
    
    public SSLSession ak() {
        return new class17(this);
    }
    
    public boolean be() {
        return false;
    }
    
    @Override
    public InputStream getInputStream() throws IOException {
        try {
            return this.val$tlsClientProtocol.getInputStream();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getInputStream(" + ')');
        }
    }
    
    public boolean as() {
        return false;
    }
    
    public String[] ax() {
        return null;
    }
    
    public String[] ay() {
        return null;
    }
    
    public String[] bi() {
        return null;
    }
    
    public void bv(final boolean b) {
    }
    
    public void bp(final boolean b) {
    }
    
    public void cc() throws IOException {
        this.val$tlsClientProtocol.connect((TlsClient)new class13(this));
    }
    
    public void bt(final HandshakeCompletedListener handshakeCompletedListener) {
    }
    
    public void bc(final boolean b) {
    }
    
    public void br(final boolean b) {
    }
    
    static void runWidgetOnLoadListener(final int n, final byte b) {
        try {
            if (n == -1) {
                Client.js(n);
                return;
            }
            if (SoundSystem.loadInterface(n, 1376777516)) {
                final Widget[] array = VerticalAlignment.Widget_interfaceComponents[n];
                for (int i = 0; i < array.length; ++i) {
                    if (b <= 104) {
                        throw new IllegalStateException();
                    }
                    final Widget dragTarget = array[i];
                    if (null != dragTarget.onLoad) {
                        if (b <= 104) {
                            throw new IllegalStateException();
                        }
                        final ScriptEvent scriptEvent = new ScriptEvent();
                        scriptEvent.dragTarget = dragTarget;
                        scriptEvent.args = dragTarget.onLoad;
                        PlayerType.runScript(scriptEvent, 5000000, 0, 614042183);
                    }
                }
                Client.js(n);
                return;
            }
            if (b <= 104) {
                throw new IllegalStateException();
            }
            Client.js(n);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.ci(" + ')');
        }
    }
    
    public void runWidgetOnLoadListener() throws IOException {
        this.val$tlsClientProtocol.connect((TlsClient)new class13(this));
    }
    
    public InputStream aw() throws IOException {
        return this.val$tlsClientProtocol.getInputStream();
    }
    
    public boolean am() {
        return false;
    }
    
    public void al(final HandshakeCompletedListener handshakeCompletedListener) {
    }
    
    public InputStream an() throws IOException {
        return this.val$tlsClientProtocol.getInputStream();
    }
    
    @Override
    public OutputStream getOutputStream() throws IOException {
        try {
            return this.val$tlsClientProtocol.getOutputStream();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getOutputStream(" + ')');
        }
    }
    
    public synchronized void au() throws IOException {
        this.val$tlsClientProtocol.close();
    }
    
    @Override
    public boolean getWantClientAuth() {
        try {
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getWantClientAuth(" + ')');
        }
    }
    
    @Override
    public boolean getNeedClientAuth() {
        try {
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getNeedClientAuth(" + ')');
        }
    }
    
    @Override
    public void addHandshakeCompletedListener(final HandshakeCompletedListener handshakeCompletedListener) {
    }
    
    @Override
    public void removeHandshakeCompletedListener(final HandshakeCompletedListener handshakeCompletedListener) {
    }
    
    @Override
    public void startHandshake() throws IOException {
        try {
            this.val$tlsClientProtocol.connect((TlsClient)new class13(this));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.startHandshake(" + ')');
        }
    }
    
    @Override
    public void setUseClientMode(final boolean b) {
    }
    
    @Override
    public boolean getUseClientMode() {
        try {
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getUseClientMode(" + ')');
        }
    }
    
    @Override
    public void setEnableSessionCreation(final boolean b) {
    }
    
    @Override
    public boolean getEnableSessionCreation() {
        try {
            return false;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getEnableSessionCreation(" + ')');
        }
    }
    
    @Override
    public String[] getSupportedCipherSuites() {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getSupportedCipherSuites(" + ')');
        }
    }
    
    @Override
    public void setEnabledCipherSuites(final String[] array) {
    }
    
    @Override
    public String[] getSupportedProtocols() {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getSupportedProtocols(" + ')');
        }
    }
    
    @Override
    public void setEnabledProtocols(final String[] array) {
    }
    
    @Override
    public void setNeedClientAuth(final boolean b) {
    }
    
    @Override
    public void setWantClientAuth(final boolean b) {
    }
    
    @Override
    public SSLSession getSession() {
        try {
            return new class17(this);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getSession(" + ')');
        }
    }
    
    public void bh(final boolean b) {
    }
    
    public String[] by() {
        return null;
    }
    
    public boolean ar() {
        return false;
    }
    
    public String[] ap() {
        return null;
    }
    
    public void bd(final HandshakeCompletedListener handshakeCompletedListener) {
    }
    
    public void bg(final String[] array) {
    }
    
    public InputStream af() throws IOException {
        return this.val$tlsClientProtocol.getInputStream();
    }
    
    public void bn(final HandshakeCompletedListener handshakeCompletedListener) {
    }
    
    @Override
    public String[] getEnabledCipherSuites() {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getEnabledCipherSuites(" + ')');
        }
    }
    
    @Override
    public String[] getEnabledProtocols() {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.getEnabledProtocols(" + ')');
        }
    }
    
    public synchronized void getClipMidY() throws IOException {
        this.val$tlsClientProtocol.close();
    }
    
    static int getClipMidY(final int n) {
        try {
            return 1666539507 * Rasterizer3D.clips.field2229;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ax.ab(" + ')');
        }
    }
    
    public void aq(final HandshakeCompletedListener handshakeCompletedListener) {
    }
    
    public boolean aj() {
        return false;
    }
    
    public String[] ag() {
        return null;
    }
    
    public boolean bz() {
        return false;
    }
    
    public static OutputStream zv(final class12 class12) throws IOException {
        return class12.val$tlsClientProtocol.getOutputStream();
    }
    
    public static int yy(final MidiPcmStream midiPcmStream) {
        return 1380277371 * midiPcmStream.field2757;
    }
    
    public void bj(final HandshakeCompletedListener handshakeCompletedListener) {
    }
    
    public boolean bm() {
        return false;
    }
    
    public boolean bk() {
        return false;
    }
    
    public static SSLSession jg(final class12 class12) {
        if (class12 == null) {
            class12.ap();
        }
        return new class17(class12);
    }
    
    public String[] ah() {
        return null;
    }
    
    public void bf(final String[] array) {
    }
    
    public void bu(final String[] array) {
    }
}
