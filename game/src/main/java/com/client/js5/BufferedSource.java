package com.client.js5;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedSource implements Runnable {

    Thread thread;

    InputStream inputStream;

    int capacity;

    byte[] buffer;

    int position = 0;

    int limit = 0;

    IOException exception;

    BufferedSource(InputStream var1, int var2) {
        this.inputStream = var1;
        this.capacity = var2 + 1;
        this.buffer = new byte[this.capacity];
        this.thread = new Thread(this);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    boolean isAvailable(int var1) throws IOException {
        if (var1 == 0) {
            return true;
        } else if (var1 > 0 && var1 < this.capacity) {
            synchronized(this) {
                int var3;
                if (this.position <= this.limit) {
                    var3 = this.limit - this.position;
                } else {
                    var3 = this.capacity - this.position + this.limit;
                }

                if (var3 < var1) {
                    if (this.exception != null) {
                        throw new IOException(this.exception.toString());
                    } else {
                        this.notifyAll();
                        return false;
                    }
                } else {
                    return true;
                }
            }
        } else {
            throw new IOException();
        }
    }

    int available() throws IOException {
        synchronized(this) {
            int var2;
            if (this.position <= this.limit) {
                var2 = this.limit - this.position;
            } else {
                var2 = this.capacity - this.position + this.limit;
            }

            if (var2 <= 0 && this.exception != null) {
                throw new IOException(this.exception.toString());
            } else {
                this.notifyAll();
                return var2;
            }
        }
    }

    int readUnsignedByte() throws IOException {
        synchronized(this) {
            if (this.position == this.limit) {
                if (this.exception != null) {
                    throw new IOException(this.exception.toString());
                } else {
                    return -1;
                }
            } else {
                int var2 = this.buffer[this.position] & 255;
                this.position = (this.position + 1) % this.capacity;
                this.notifyAll();
                return var2;
            }
        }
    }

    int read(byte[] var1, int var2, int var3) throws IOException {
        if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
            synchronized(this) {
                int var5;
                if (this.position <= this.limit) {
                    var5 = this.limit - this.position;
                } else {
                    var5 = this.capacity - this.position + this.limit;
                }

                if (var3 > var5) {
                    var3 = var5;
                }

                if (var3 == 0 && this.exception != null) {
                    throw new IOException(this.exception.toString());
                } else {
                    if (var3 + this.position <= this.capacity) {
                        System.arraycopy(this.buffer, this.position, var1, var2, var3);
                    } else {
                        int var6 = this.capacity - this.position;
                        System.arraycopy(this.buffer, this.position, var1, var2, var6);
                        System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
                    }

                    this.position = (var3 + this.position) % this.capacity;
                    this.notifyAll();
                    return var3;
                }
            }
        } else {
            throw new IOException();
        }
    }

    void close() {
        synchronized(this) {
            if (this.exception == null) {
                this.exception = new IOException("");
            }

            this.notifyAll();
        }

        try {
            this.thread.join();
        } catch (InterruptedException var3) {
        }

    }

    public void run() {
        while(true) {
            int var1;
            synchronized(this) {
                while(true) {
                    if (this.exception != null) {
                        return;
                    }

                    if (this.position == 0) {
                        var1 = this.capacity - this.limit - 1;
                    } else if (this.position <= this.limit) {
                        var1 = this.capacity - this.limit;
                    } else {
                        var1 = this.position - this.limit - 1;
                    }

                    if (var1 > 0) {
                        break;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException var10) {
                    }
                }
            }

            int var7;
            try {
                var7 = this.inputStream.read(this.buffer, this.limit, var1);
                if (var7 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var11) {
                IOException var3 = var11;
                synchronized(this) {
                    this.exception = var3;
                    return;
                }
            }

            synchronized(this) {
                this.limit = (var7 + this.limit) % this.capacity;
            }
        }
    }


}
