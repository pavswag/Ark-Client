package com.client.js5;

import java.io.IOException;
import java.io.OutputStream;

public class BufferedSink implements Runnable {

    static boolean field4572;

    Thread thread;

    OutputStream outputStream;

    int capacity;

    byte[] buffer;

    int position = 0;

    int limit = 0;

    IOException exception;

    boolean closed;

    BufferedSink(OutputStream var1, int var2) {
        this.outputStream = var1;
        this.capacity = var2 + 1;
        this.buffer = new byte[this.capacity];
        this.thread = new Thread(this);
        this.thread.setDaemon(true);
        this.thread.start();
    }


    boolean isClosed() {
        if (this.closed) {
            try {
                this.outputStream.close();
                if (this.exception == null) {
                    this.exception = new IOException("");
                }
            } catch (IOException var2) {
                if (this.exception == null) {
                    this.exception = new IOException(var2);
                }
            }

            return true;
        } else {
            return false;
        }
    }

    void write(byte[] var1, int var2, int var3) throws IOException {
        if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
            synchronized(this) {
                if (this.exception != null) {
                    throw new IOException(this.exception.toString());
                } else {
                    int var5;
                    if (this.position <= this.limit) {
                        var5 = this.capacity - this.limit + this.position - 1;
                    } else {
                        var5 = this.position - this.limit - 1;
                    }

                    if (var5 < var3) {
                        throw new IOException("");
                    } else {
                        if (var3 + this.limit <= this.capacity) {
                            System.arraycopy(var1, var2, this.buffer, this.limit, var3);
                        } else {
                            int var6 = this.capacity - this.limit;
                            System.arraycopy(var1, var2, this.buffer, this.limit, var6);
                            System.arraycopy(var1, var6 + var2, this.buffer, 0, var3 - var6);
                        }

                        this.limit = (var3 + this.limit) % this.capacity;
                        this.notifyAll();
                    }
                }
            }
        } else {
            throw new IOException();
        }
    }


    void close() {
        synchronized(this) {
            this.closed = true;
            this.notifyAll();
        }

        try {
            this.thread.join();
        } catch (InterruptedException var3) {
        }

    }

    public void run() {
        do {
            int var1;
            synchronized(this) {
                while(true) {
                    if (this.exception != null) {
                        return;
                    }

                    if (this.position <= this.limit) {
                        var1 = this.limit - this.position;
                    } else {
                        var1 = this.capacity - this.position + this.limit;
                    }

                    if (var1 > 0) {
                        break;
                    }

                    try {
                        this.outputStream.flush();
                    } catch (IOException var11) {
                        this.exception = var11;
                        return;
                    }

                    if (this.isClosed()) {
                        return;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }

            try {
                if (var1 + this.position <= this.capacity) {
                    this.outputStream.write(this.buffer, this.position, var1);
                } else {
                    int var7 = this.capacity - this.position;
                    this.outputStream.write(this.buffer, this.position, var7);
                    this.outputStream.write(this.buffer, 0, var1 - var7);
                }
            } catch (IOException var10) {
                IOException var2 = var10;
                synchronized(this) {
                    this.exception = var2;
                    return;
                }
            }

            synchronized(this) {
                this.position = (var1 + this.position) % this.capacity;
            }
        } while(!this.isClosed());

    }
}
