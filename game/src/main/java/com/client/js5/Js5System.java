package com.client.js5;

import com.client.*;
import com.client.engine.GameEngine;
import com.client.engine.task.MonotonicClock;
import com.client.engine.task.Task;
import com.client.engine.task.TaskHandler;
import com.client.js5.disk.ArchiveDisk;
import com.client.js5.disk.Js5Archive;
import com.client.js5.util.ArchiveLoader;
import com.client.sign.FileSystem;
import com.client.sign.Signlink;

import java.io.IOException;
import java.net.Socket;

public class Js5System {
    TaskHandler js5Task = new TaskHandler();

    public static int groupSize = 0;

    private static int js5Errors = 0;

    private static int js5ConnectState = 0;

    private static int js5Cycles = 0;

    static Task js5SocketTask;

    private static AbstractSocket js5Socket;

    private static boolean fallback = false;

    public static void doCycleJs5() {
        if (Client.instance.gameState != 1000) {
            boolean idle = Client.jagexNetThread.processNetwork();
            if (!idle)
                connect();
        }
    }

    public static Js5Archive createJs5(Js5ArchiveIndex archive, boolean useWhirlpool, boolean useGzip, boolean verifyChecksums, boolean prioritizeRequests) {
        ArchiveDisk cache = null;
        if (Signlink.cacheData != null)
            cache = new ArchiveDisk(archive.getId(), Signlink.cacheData, Signlink.cacheIndexes[archive.getId()], 1000000);
        return new Js5Archive(cache, Signlink.masterDisk, archive, useWhirlpool, useGzip, verifyChecksums, prioritizeRequests);
    }

    public static void init(Js5Archive js5Archive, String name) {
        ArchiveLoader archiveLoader = new ArchiveLoader(js5Archive, name);
        ArchiveLoader.archiveLoaders.add(archiveLoader);
        groupSize += archiveLoader.groupCount;
    }

    public static void connect() {
        if (Client.jagexNetThread.crcMissmatches >= 4) {
            Client.instance.error("js5crc");
            Client.instance.gameState = 1000;
            System.out.println("CRC mismatches exceeded 4, setting game state to 1000");
        } else {
            if (Client.jagexNetThread.ioExceptions >= 4) {
                if (Client.instance.gameState <= 5) {
                    if (fallback) {
                        System.out.println("Attempting Fallback Process before setting game state to 1000");
                        try {
                            resetForFallback();
                            connectToFallback();
                        } catch (IOException exception) {
                            Client.instance.error("js5io");
                            Client.instance.gameState = 1000;
                            System.out.println("Fallback process failed, IO exceptions exceeded 4 and game state <= 5, setting game state to 1000");
                        }
                    } else {
                        fallback = true;
                        Client.jagexNetThread.ioExceptions = 1;
                        Client.jagexNetThread.crcMissmatches = 0; // Reset CRC mismatches when fallback is enabled
                        System.out.println("Fallback process activated");
                    }
                    return;
                }
                if (fallback) {
                    js5Cycles = 3000;
                    Client.jagexNetThread.ioExceptions = 3;
                }
            }
            if (--js5Cycles + 1 <= 0) {
                if (!fallback) {
                    try {
                        connectToJs5();
                    } catch (IOException exception) {
                        js5Error(-3);
                        System.out.println("IOException caught during primary connection attempt, reporting an error");
                    }
                } else {
                    try {
                        System.out.println("Attempting Fallback Server!");
                        connectToFallback();
                    } catch (IOException exception) {
                        js5Error(-3);
                        System.out.println("IOException caught during fallback connection attempt, reporting an error");
                    }
                }
            }
        }
    }

    private static void connectToJs5() throws IOException {
        if (js5ConnectState == 0) {
            js5SocketTask = GameEngine.taskHandler.newSocketTask(Configuration.CONNECTION.js5Host, Configuration.CONNECTION.js5Port);
            js5ConnectState++;
            System.out.println("js5ConnectState set to 1, creating socket task");
        }
        if (js5ConnectState == 1) {
            if (js5SocketTask.status == 2) {
                js5Error(-1);
                System.out.println("Socket task status is 2, reporting an error");
                return;
            }
            if (js5SocketTask.status == 1) {
                js5ConnectState++;
                System.out.println("Socket task status is 1, advancing to js5ConnectState 2");
            }
        }
        if (js5ConnectState == 2) {
            js5Socket = new BufferedNetSocket((Socket) js5SocketTask.result, 40000, 5000);
            Buffer buffer = new Buffer(5);
            buffer.writeByte(15);
            buffer.writeInt(Client.instance.getRevision());
            js5Socket.write(buffer.payload, 0, 5);
            js5ConnectState++;
            FileSystem.currentTimeMills = MonotonicClock.currentTimeMillis();
            System.out.println("js5ConnectState set to 2, creating BufferedNetSocket and sending data");
        }
        if (js5ConnectState == 3) {
            if (js5Socket.available() > 0) {
                int socket = js5Socket.readUnsignedByte();
                if (socket != 0) {
                    js5Error(socket);
                    System.out.println("Received non-zero socket value, reporting an error");
                    return;
                }
                js5ConnectState++;
                System.out.println("js5ConnectState advanced to 3");
            } else if (MonotonicClock.currentTimeMillis() - FileSystem.currentTimeMills > 30000L) {
                js5Error(-2);
                System.out.println("Socket not available, and time exceeded 30000ms, reporting an error");
                return;
            }
        }
        if (js5ConnectState == 4) {
            Client.jagexNetThread.initializeAndWriteDataToSocket(js5Socket, (Client.instance.gameState > 20));
            js5SocketTask = null;
            js5Socket = null;
            js5ConnectState = 0;
            js5Errors = 0;
            System.out.println("js5ConnectState set to 4, performing final initialization");
        }
    }
    private static int fallBackWorldIndex = 0;
    private static void connectToFallback() throws IOException {
        if (js5ConnectState == 0) {
            if(fallBackWorldIndex < World.World_count) {
                fallBackWorldIndex++;
            } else {
                fallBackWorldIndex = 0;
            }
            World world = World.World_worlds[fallBackWorldIndex];
            js5SocketTask = GameEngine.taskHandler.newSocketTask(world.js5Host, world.js5Port);
            js5ConnectState++;
            System.out.println("js5ConnectState set to 1, creating socket task for fallback");
        }
        if (js5ConnectState == 1) {
            if (js5SocketTask.status == 2) {
                js5Error(-1);
                System.out.println("Socket task status is 2, reporting an error during fallback connection");
                return;
            }
            if (js5SocketTask.status == 1) {
                js5ConnectState++;
                System.out.println("Socket task status is 1, advancing to js5ConnectState 2 for fallback");
            }
        }
        if (js5ConnectState == 2) {
            js5Socket = new BufferedNetSocket((Socket) js5SocketTask.result, 40000, 5000);
            Buffer buffer = new Buffer(5);
            buffer.writeByte(15);
            buffer.writeInt(Client.instance.getRevision());
            js5Socket.write(buffer.payload, 0, 5);
            js5ConnectState++;
            FileSystem.currentTimeMills = MonotonicClock.currentTimeMillis();
            System.out.println("js5ConnectState set to 2 for fallback, creating BufferedNetSocket and sending data");
        }
        if (js5ConnectState == 3) {
            if (js5Socket.available() > 0) {
                int socket = js5Socket.readUnsignedByte();
                if (socket != 0) {
                    js5Error(socket);
                    System.out.println("Received non-zero socket value during fallback, reporting an error");
                    return;
                }
                js5ConnectState++;
                System.out.println("js5ConnectState advanced to 3 for fallback");
            } else if (MonotonicClock.currentTimeMillis() - FileSystem.currentTimeMills > 30000L) {
                js5Error(-2);
                System.out.println("Socket not available during fallback, and time exceeded 30000ms, reporting an error");
                return;
            }
        }
        if (js5ConnectState == 4) {
            Client.jagexNetThread.initializeAndWriteDataToSocket(js5Socket, (Client.instance.gameState > 20));
            js5SocketTask = null;
            js5Socket = null;
            js5ConnectState = 0;
            js5Errors = 0;
            System.out.println("js5ConnectState set to 4 for fallback, performing final initialization");
        }
    }

    private static void resetForFallback() {
        js5Errors = 0;
        js5ConnectState = 0;
        js5SocketTask = null;
        js5Socket = null;
        Client.jagexNetThread.crcMissmatches = 0; // Reset CRC mismatches
        Client.jagexNetThread.ioExceptions = 0; // Reset IO exceptions
        System.out.println("Resetting state variables for fallback connection");
    }

    public static void js5Error(int response) {
        js5SocketTask = null;
        js5Socket = null;
        js5ConnectState = 0;
        js5Errors++;
        if (js5Errors >= 2 && (response == 7 || response == 9)) {
            if (Client.instance.gameState <= 5) {
                Client.instance.error("js5connect_full");
                Client.instance.setRSGameState(1000);
            } else {
                js5Cycles = 3000;
            }
        } else if (js5Errors >= 2 && response == 6) {
            Client.instance.error("js5connect_outofdate");
            Client.instance.setRSGameState(1000);
        } else if (js5Errors >= 4) {
            if (Client.instance.gameState <= 5) {
                if (fallback) {
                    System.out.println("Attempting Fallback Process after 4 errors");
                    try {
                        resetForFallback();
                        connectToFallback();
                    } catch (IOException exception) {
                        Client.instance.error("js5connect");
                        Client.instance.setRSGameState(1000);
                        System.out.println("Fallback process failed after 4 errors, setting game state to 1000");
                    }
                } else {
                    fallback = true;
                    Client.jagexNetThread.ioExceptions = 1;
                    Client.jagexNetThread.crcMissmatches = 0; // Reset CRC mismatches when fallback is enabled
                    System.out.println("Fallback process activated after 4 errors");
                }
            } else {
                js5Cycles = 3000;
            }
        }
    }
}
