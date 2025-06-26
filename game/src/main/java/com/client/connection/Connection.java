package com.client.connection;

public enum Connection {
    /** The economy (main) world. */
    WORLD_1("World 1", "162.218.52.190", "52778", "43596", "162.218.52.190", "52777", "162.218.52.190"),

    /** The management world - used for private testing by the management team. */
    WORLD_2("LIVE", "162.252.9.210", "52778", "52777", "162.252.9.210", "43596", "162.252.9.210"),


    LIVE("LIVE", "162.218.52.190", "52778", "43596", "162.218.52.190", "52777", "162.218.52.190"),


    LOCAL("Local", "162.218.52.190", "52778", "43596", "162.218.52.190", "52777", "162.252.9.210"),

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
