package com.client.connection;

public enum Connection {
    /** The economy (main) world. */
    WORLD_1("World 1", "127.0.0.1", "52778"),

    /** The management world - used for private testing by the management team. */
    WORLD_2("World 2", "199.231.233.207", "52778")/*,

    *//** The development world - used by developers. *//*
    DEVELOPMENT("Osrs", "77.68.78.218", "52777")*/;

    /** The connection name. */
    public final String name;

    /** The connection IP address. */
    public final String address;

    /** The connection IP address. */
    public final String port;

    /** Constructs a new <code>Connection</code>. */
    Connection(String name, String address, String port) {
        this.name = name;
        this.address = address;
        this.port = port;
    }
}
