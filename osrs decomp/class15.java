import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import java.net.UnknownHostException;
import java.io.IOException;
import java.net.Socket;
import java.security.Provider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.security.Security;
import java.security.SecureRandom;
import javax.net.ssl.SSLSocketFactory;

// 
// Decompiled by Procyon v0.5.36
// 

public class class15 extends SSLSocketFactory
{
    SecureRandom field49;
    public static class15 field50;
    
    public class15() {
        this.field49 = new SecureRandom();
    }
    
    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider((Provider)new BouncyCastleProvider());
        }
    }
    
    public Socket ao(final String s, final int n) throws IOException, UnknownHostException {
        return null;
    }
    
    public Socket at(final String s, final int n) throws IOException, UnknownHostException {
        return null;
    }
    
    SSLSocket ak(final String s, final TlsClientProtocol tlsClientProtocol) {
        return new class12(this, tlsClientProtocol, s);
    }
    
    public Socket av(final InetAddress inetAddress, final int n, final InetAddress inetAddress2, final int n2) throws IOException {
        return null;
    }
    
    SSLSocket as(final String s, final TlsClientProtocol tlsClientProtocol) {
        return new class12(this, tlsClientProtocol, s);
    }
    
    public Socket ax(final String s, final int n) throws IOException, UnknownHostException {
        return null;
    }
    
    public Socket aw(Socket socket, final String hostname, final int port, final boolean b) throws IOException {
        if (null == socket) {
            socket = new Socket();
        }
        if (!socket.isConnected()) {
            socket.connect(new InetSocketAddress(hostname, port));
        }
        return this.method59(hostname, new TlsClientProtocol(socket.getInputStream(), socket.getOutputStream(), this.field49), -489123832);
    }
    
    public Socket an(Socket socket, final String hostname, final int port, final boolean b) throws IOException {
        if (null == socket) {
            socket = new Socket();
        }
        if (!socket.isConnected()) {
            socket.connect(new InetSocketAddress(hostname, port));
        }
        return this.method59(hostname, new TlsClientProtocol(socket.getInputStream(), socket.getOutputStream(), this.field49), -489123832);
    }
    
    public Socket ac(Socket socket, final String hostname, final int port, final boolean b) throws IOException {
        if (null == socket) {
            socket = new Socket();
        }
        if (!socket.isConnected()) {
            socket.connect(new InetSocketAddress(hostname, port));
        }
        return this.method59(hostname, new TlsClientProtocol(socket.getInputStream(), socket.getOutputStream(), this.field49), -489123832);
    }
    
    @Override
    public Socket createSocket(Socket socket, final String hostname, final int port, final boolean b) throws IOException {
        try {
            if (null == socket) {
                socket = new Socket();
            }
            if (!socket.isConnected()) {
                socket.connect(new InetSocketAddress(hostname, port));
            }
            return this.method59(hostname, new TlsClientProtocol(socket.getInputStream(), socket.getOutputStream(), this.field49), -489123832);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ah.createSocket(" + ')');
        }
    }
    
    @Override
    public Socket createSocket(final InetAddress inetAddress, final int n, final InetAddress inetAddress2, final int n2) throws IOException {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ah.createSocket(" + ')');
        }
    }
    
    @Override
    public Socket createSocket(final String s, final int n, final InetAddress inetAddress, final int n2) throws IOException, UnknownHostException {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ah.createSocket(" + ')');
        }
    }
    
    @Override
    public Socket createSocket(final String s, final int n) throws IOException, UnknownHostException {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ah.createSocket(" + ')');
        }
    }
    
    @Override
    public Socket createSocket(final InetAddress inetAddress, final int n) throws IOException {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ah.createSocket(" + ')');
        }
    }
    
    public String[] au() {
        return null;
    }
    
    public Socket aa(final String s, final int n) throws IOException, UnknownHostException {
        return null;
    }
    
    public Socket ai(final InetAddress inetAddress, final int n) throws IOException {
        return null;
    }
    
    @Override
    public String[] getSupportedCipherSuites() {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ah.getSupportedCipherSuites(" + ')');
        }
    }
    
    @Override
    public String[] getDefaultCipherSuites() {
        try {
            return null;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ah.getDefaultCipherSuites(" + ')');
        }
    }
    
    public Socket ar(final InetAddress inetAddress, final int n, final InetAddress inetAddress2, final int n2) throws IOException {
        return null;
    }
    
    SSLSocket method59(final String s, final TlsClientProtocol tlsClientProtocol, final int n) {
        try {
            return new class12(this, tlsClientProtocol, s);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "ah.af(" + ')');
        }
    }
    
    public String[] ab() {
        return null;
    }
    
    public String[] aq() {
        return null;
    }
    
    SSLSocket aj(final String s, final TlsClientProtocol tlsClientProtocol) {
        return new class12(this, tlsClientProtocol, s);
    }
    
    public Socket ag(final String s, final int n, final InetAddress inetAddress, final int n2) throws IOException, UnknownHostException {
        return null;
    }
    
    public static SSLSocket yq(final class15 class15, final String s, final TlsClientProtocol tlsClientProtocol) {
        if (class15 == null) {
            return class15.as(s, tlsClientProtocol);
        }
        return new class12(class15, tlsClientProtocol, s);
    }
    
    public Socket ah(final String s, final int n, final InetAddress inetAddress, final int n2) throws IOException, UnknownHostException {
        return null;
    }
}
