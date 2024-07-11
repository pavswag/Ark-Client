package com.client.connection;

public enum Connection {
    /** The economy (main) world. */
    WORLD_1("World 1", "127.0.0.1", "52778", "43596", "arkcane.ipv4.tcpshield.com", "43596", "213.171.212.95"),

    /** The management world - used for private testing by the management team. */
    WORLD_2("LIVE", "arkcane.ovh.tcpshield.com", "52778", "52777", "145.239.204.119", "43596", "213.171.212.95"),


    LIVE("LIVE", "arkcane.ipv4.tcpshield.com", "52778", "43596", "arkcane.ipv4.tcpshield.com", "52777", "213.171.212.95"),


    LOCAL("Local", "127.0.0.1", "52778", "43596", "127.0.0.1", "52777", "213.171.212.95"),

    ;

    /** The connection name. */
    public final String name;

    /** The connection IP address. */
    public final String main_serverIP;

    /** The connection IP address. */
    public final String port;

    public final String js5Socket;
    public final String js5SocketIP;

    public final String js5FallbackSocket;
    public final String js5FallbackIP;

    /** Constructs a new <code>Connection</code>. */
    Connection(String name, String address, String port, String js5Socket, String js5SocketIP, String js5FallbackSocket, String js5FallbackIP) {
        this.name = name;
        this.main_serverIP = address;
        this.port = port;
        this.js5Socket = js5Socket;
        this.js5SocketIP = js5SocketIP;
        this.js5FallbackSocket = js5FallbackSocket;
        this.js5FallbackIP = js5FallbackIP;
    }
}
