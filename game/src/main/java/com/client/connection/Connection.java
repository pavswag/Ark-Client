package com.client.connection;

public enum Connection {
    /** The economy (main) world. */
    WORLD_1("World 1", "127.0.0.1", "52778", "43596", "213.171.212.95"),

    /** The management world - used for private testing by the management team. */
    WORLD_2("World 2", "213.171.212.95", "52778", "43596", "213.171.212.95")/*,

    *//** The development world - used by developers. *//*
    DEVELOPMENT("Osrs", "77.68.78.218", "52777")*/;

    /** The connection name. */
    public final String name;

    /** The connection IP address. */
    public final String main_serverIP;

    /** The connection IP address. */
    public final String port;

    public final String js5Socket;
    public final String js5SocketIP;

    /** Constructs a new <code>Connection</code>. */
    Connection(String name, String address, String port, String js5Socket, String js5SocketIP) {
        this.name = name;
        this.main_serverIP = address;
        this.port = port;
        this.js5Socket = js5Socket;
        this.js5SocketIP = js5SocketIP;
    }
}
